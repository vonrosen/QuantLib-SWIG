package examples;

import org.quantlib.Actual360;
import org.quantlib.ActualActual;
import org.quantlib.BusinessDayConvention;
import org.quantlib.Date;
import org.quantlib.DateGeneration;
import org.quantlib.DayCounter;
import org.quantlib.DepositRateHelper;
import org.quantlib.DiscountingSwapEngine;
import org.quantlib.Euribor6M;
import org.quantlib.FraRateHelper;
import org.quantlib.Frequency;
import org.quantlib.FuturesRateHelper;
import org.quantlib.IMM;
import org.quantlib.IborIndex;
import org.quantlib.Month;
import org.quantlib.Period;
import org.quantlib.PiecewiseFlatForward;
import org.quantlib.PricingEngine;
import org.quantlib.RateHelper;
import org.quantlib.RateHelperVector;
import org.quantlib.RelinkableYieldTermStructureHandle;
import org.quantlib.Schedule;
import org.quantlib.Settings;
import org.quantlib.SwapRateHelper;
import org.quantlib.TARGET;
import org.quantlib.Thirty360;
import org.quantlib.Thirty360.Convention;
import org.quantlib.TimeUnit;
import org.quantlib.VanillaSwap;
import org.quantlib.YieldTermStructure;
import org.quantlib._VanillaSwap.Type;

public class SwapValuation {

	static {
		try {
			System.loadLibrary("QuantLibJNI");
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		TARGET calendar = new TARGET();
		Date settlementDate = new Date(22, Month.September, 2004);

		calendar.adjust(settlementDate);

		int fixingDays = 2;

		Date todaysDate = calendar.advance(settlementDate, -fixingDays, TimeUnit.Days);

		Settings.instance().setEvaluationDate(todaysDate);

		// deposits
		double d1wQuote = 0.0382;
		double d1mQuote = 0.0372;
		double d3mQuote = 0.0363;
		double d6mQuote = 0.0353;
		double d9mQuote = 0.0348;
		double d1yQuote = 0.0345;
		// FRAs
		double fra3x6Quote = 0.037125;
		double fra6x9Quote = 0.037125;
		double fra6x12Quote = 0.037125;
		// futures
		double fut1Quote = 96.2875;
		double fut2Quote = 96.7875;
		double fut3Quote = 96.9875;
		double fut4Quote = 96.6875;
		double fut5Quote = 96.4875;
		double fut6Quote = 96.3875;
		double fut7Quote = 96.2875;
		double fut8Quote = 96.0875;
		// swaps
		double s2yQuote = 0.037125;
		double s3yQuote = 0.0398;
		double s5yQuote = 0.0443;
		double s10yQuote = 0.05165;
		double s15yQuote = 0.055175;

		// deposits
		/*
		 * SimpleQuote d1wSimpleQuote = new SimpleQuote(d1wQuote); SimpleQuote
		 * d1mSimpleQuote = new SimpleQuote(d1mQuote); SimpleQuote
		 * d3mSimpleQuote = new SimpleQuote(d3mQuote); SimpleQuote
		 * d6mSimpleQuote = new SimpleQuote(d6mQuote); SimpleQuote
		 * d9mSimpleQuote = new SimpleQuote(d9mQuote); SimpleQuote
		 * d1ySimpleQuote = new SimpleQuote(d1yQuote);
		 *
		 * // FRAs SimpleQuote fra3x6SimpleQuote = new SimpleQuote(fra3x6Quote);
		 * SimpleQuote fra6x9SimpleQuote = new SimpleQuote(fra6x9Quote);
		 * SimpleQuote fra6x12SimpleQuote = new SimpleQuote(fra6x12Quote);
		 *
		 * // futures SimpleQuote fut1SimpleQuote = new SimpleQuote(fut1Quote);
		 * SimpleQuote fut2SimpleQuote = new SimpleQuote(fut2Quote); SimpleQuote
		 * fut3SimpleQuote=new SimpleQuote(fut3Quote); SimpleQuote
		 * fut4SimpleQuote=new SimpleQuote(fut4Quote); SimpleQuote
		 * fut5SimpleQuote=new SimpleQuote(fut5Quote); SimpleQuote
		 * fut6SimpleQuote=new SimpleQuote(fut6Quote); SimpleQuote
		 * fut7SimpleQuote=new SimpleQuote(fut7Quote); SimpleQuote
		 * fut8SimpleQuote=new SimpleQuote(fut8Quote);
		 *
		 * // swaps SimpleQuote s2ySimpleQuote=new SimpleQuote(s2yQuote);
		 * SimpleQuote s3ySimpleQuote=new SimpleQuote(s3yQuote); SimpleQuote
		 * s5ySimpleQuote=new SimpleQuote(s5yQuote); SimpleQuote
		 * s10ySimpleQuote=new SimpleQuote(s10yQuote); SimpleQuote
		 * s15ySimpleQuote=new SimpleQuote(s15yQuote);
		 */
		DayCounter depositDayCounter = new Actual360();

		RateHelper d1w = new DepositRateHelper(d1wQuote, new Period(1, TimeUnit.Weeks), fixingDays, calendar,
				BusinessDayConvention.ModifiedFollowing, true, depositDayCounter);

		RateHelper d1m = new DepositRateHelper(d1mQuote, new Period(1, TimeUnit.Months), fixingDays, calendar,
				BusinessDayConvention.ModifiedFollowing, true, depositDayCounter);

		RateHelper d3m = new DepositRateHelper(d3mQuote, new Period(3, TimeUnit.Months), fixingDays, calendar,
				BusinessDayConvention.ModifiedFollowing, true, depositDayCounter);

		RateHelper d6m = new DepositRateHelper(d6mQuote, new Period(6, TimeUnit.Months), fixingDays, calendar,
				BusinessDayConvention.ModifiedFollowing, true, depositDayCounter);

		RateHelper d9m = new DepositRateHelper(d9mQuote, new Period(9, TimeUnit.Months), fixingDays, calendar,
				BusinessDayConvention.ModifiedFollowing, true, depositDayCounter);

		RateHelper d1y = new DepositRateHelper(d1yQuote, new Period(1, TimeUnit.Years), fixingDays, calendar,
				BusinessDayConvention.ModifiedFollowing, true, depositDayCounter);

		// setup FRAs
		RateHelper fra3x6 = new FraRateHelper(fra3x6Quote, 3, 6, fixingDays, calendar,
				BusinessDayConvention.ModifiedFollowing, true, depositDayCounter);
		RateHelper fra6x9 = new FraRateHelper(fra6x9Quote, 6, 9, fixingDays, calendar,
				BusinessDayConvention.ModifiedFollowing, true, depositDayCounter);
		RateHelper fra6x12 = new FraRateHelper(fra6x12Quote, 6, 12, fixingDays, calendar,
				BusinessDayConvention.ModifiedFollowing, true, depositDayCounter);

		// setup futures
		// Rate convexityAdjustment = 0.0;
		Integer futMonths = 3;
		Date imm = IMM.nextDate(settlementDate);
		RateHelper fut1 = new FuturesRateHelper(fut1Quote, imm, futMonths, calendar,
				BusinessDayConvention.ModifiedFollowing, true, depositDayCounter);
		imm = IMM.nextDate(imm.add(1));
		RateHelper fut2 = new FuturesRateHelper(fut2Quote, imm, futMonths, calendar,
				BusinessDayConvention.ModifiedFollowing, true, depositDayCounter);
		imm = IMM.nextDate(imm.add(1));
		RateHelper fut3 = new FuturesRateHelper(fut3Quote, imm, futMonths, calendar,
				BusinessDayConvention.ModifiedFollowing, true, depositDayCounter);
		imm = IMM.nextDate(imm.add(1));
		RateHelper fut4 = new FuturesRateHelper(fut4Quote, imm, futMonths, calendar,
				BusinessDayConvention.ModifiedFollowing, true, depositDayCounter);
		imm = IMM.nextDate(imm.add(1));
		RateHelper fut5 = new FuturesRateHelper(fut5Quote, imm, futMonths, calendar,
				BusinessDayConvention.ModifiedFollowing, true, depositDayCounter);
		imm = IMM.nextDate(imm.add(1));
		RateHelper fut6 = new FuturesRateHelper(fut6Quote, imm, futMonths, calendar,
				BusinessDayConvention.ModifiedFollowing, true, depositDayCounter);
		imm = IMM.nextDate(imm.add(1));
		RateHelper fut7 = new FuturesRateHelper(fut7Quote, imm, futMonths, calendar,
				BusinessDayConvention.ModifiedFollowing, true, depositDayCounter);
		imm = IMM.nextDate(imm.add(1));
		RateHelper fut8 = new FuturesRateHelper(fut8Quote, imm, futMonths, calendar,
				BusinessDayConvention.ModifiedFollowing, true, depositDayCounter);

		// setup swaps
		Frequency swFixedLegFrequency = Frequency.Annual;
		BusinessDayConvention swFixedLegConvention = BusinessDayConvention.Unadjusted;

		DayCounter swFixedLegDayCounter = new Thirty360(Convention.European);
		IborIndex swFloatingLegIndex = new Euribor6M();

		RateHelper s2y = new SwapRateHelper(s2yQuote, new Period(2, TimeUnit.Years), calendar, swFixedLegFrequency,
				swFixedLegConvention, swFixedLegDayCounter, swFloatingLegIndex);
		RateHelper s3y = new SwapRateHelper(s3yQuote, new Period(3, TimeUnit.Years), calendar, swFixedLegFrequency,
				swFixedLegConvention, swFixedLegDayCounter, swFloatingLegIndex);
		RateHelper s5y = new SwapRateHelper(s5yQuote, new Period(5, TimeUnit.Years), calendar, swFixedLegFrequency,
				swFixedLegConvention, swFixedLegDayCounter, swFloatingLegIndex);
		RateHelper s10y = new SwapRateHelper(s10yQuote, new Period(10, TimeUnit.Years), calendar, swFixedLegFrequency,
				swFixedLegConvention, swFixedLegDayCounter, swFloatingLegIndex);
		RateHelper s15y = new SwapRateHelper(s15yQuote, new Period(15, TimeUnit.Years), calendar, swFixedLegFrequency,
				swFixedLegConvention, swFixedLegDayCounter, swFloatingLegIndex);

		/*********************
		 ** CURVE BUILDING **
		 *********************/

		// Any DayCounter would be fine.
		// ActualActual::ISDA ensures that 30 years is 30.0
		DayCounter termStructureDayCounter = new ActualActual(ActualActual.Convention.ISDA);

		double tolerance = 1.0e-15;

		// A depo-swap curve
		RateHelperVector depoSwapInstruments = new RateHelperVector();
		depoSwapInstruments.add(d1w);
		depoSwapInstruments.add(d1m);
		depoSwapInstruments.add(d3m);
		depoSwapInstruments.add(d6m);
		depoSwapInstruments.add(d9m);
		depoSwapInstruments.add(d1y);
		depoSwapInstruments.add(s2y);
		depoSwapInstruments.add(s3y);
		depoSwapInstruments.add(s5y);
		depoSwapInstruments.add(s10y);
		depoSwapInstruments.add(s15y);

		YieldTermStructure depoSwapTermStructure = new PiecewiseFlatForward(settlementDate, depoSwapInstruments,
				termStructureDayCounter);

		// A depo-futures-swap curve
		RateHelperVector depoFutSwapInstruments = new RateHelperVector();
		depoFutSwapInstruments.add(d1w);
		depoFutSwapInstruments.add(d1m);
		depoFutSwapInstruments.add(fut1);
		depoFutSwapInstruments.add(fut2);
		depoFutSwapInstruments.add(fut3);
		depoFutSwapInstruments.add(fut4);
		depoFutSwapInstruments.add(fut5);
		depoFutSwapInstruments.add(fut6);
		depoFutSwapInstruments.add(fut7);
		depoFutSwapInstruments.add(fut8);
		depoFutSwapInstruments.add(s3y);
		depoFutSwapInstruments.add(s5y);
		depoFutSwapInstruments.add(s10y);
		depoFutSwapInstruments.add(s15y);

		YieldTermStructure depoFutSwapTermStructure = new PiecewiseFlatForward(settlementDate, depoFutSwapInstruments,
				termStructureDayCounter);

		// A depo-FRA-swap curve
		RateHelperVector depoFRASwapInstruments = new RateHelperVector();
		depoFRASwapInstruments.add(d1w);
		depoFRASwapInstruments.add(d1m);
		depoFRASwapInstruments.add(d3m);
		depoFRASwapInstruments.add(fra3x6);
		depoFRASwapInstruments.add(fra6x9);
		depoFRASwapInstruments.add(fra6x12);
		depoFRASwapInstruments.add(s2y);
		depoFRASwapInstruments.add(s3y);
		depoFRASwapInstruments.add(s5y);
		depoFRASwapInstruments.add(s10y);
		depoFRASwapInstruments.add(s15y);
		YieldTermStructure depoFRASwapTermStructure = new PiecewiseFlatForward(settlementDate, depoFRASwapInstruments,
				termStructureDayCounter);

		// Term structures that will be used for pricing:
		// the one used for discounting cash flows
		RelinkableYieldTermStructureHandle discountingTermStructure = new RelinkableYieldTermStructureHandle();

		// the one used for forward rate forecasting
		RelinkableYieldTermStructureHandle forecastingTermStructure = new RelinkableYieldTermStructureHandle();

		/*********************
		 * SWAPS TO BE PRICED *
		 **********************/

		// constant nominal 1,000,000 Euro
		double nominal = 1000000.0;
		// fixed leg
		Frequency fixedLegFrequency = Frequency.Annual;
		BusinessDayConvention fixedLegConvention = BusinessDayConvention.Unadjusted;
		BusinessDayConvention floatingLegConvention = BusinessDayConvention.ModifiedFollowing;
		DayCounter fixedLegDayCounter = new Thirty360(Convention.European);
		double fixedRate = 0.04;
		DayCounter floatingLegDayCounter = new Actual360();

		// floating leg
		Frequency floatingLegFrequency = Frequency.Semiannual;
		IborIndex euriborIndex = new Euribor6M(forecastingTermStructure);
		double spread = 0.0;

		Integer lenghtInYears = 5;
		Type swapType = VanillaSwap.Payer;

		Date maturity = settlementDate.add(new Period(lenghtInYears, TimeUnit.Years));
		Schedule fixedSchedule = new Schedule(settlementDate, maturity, new Period(fixedLegFrequency), calendar,
				fixedLegConvention, fixedLegConvention, DateGeneration.Rule.Forward, false);

		Schedule floatSchedule = new Schedule(settlementDate, maturity, new Period(floatingLegFrequency), calendar,
				floatingLegConvention, floatingLegConvention, DateGeneration.Rule.Forward, false);
		VanillaSwap spot5YearSwap = new VanillaSwap(swapType, nominal, fixedSchedule, fixedRate, fixedLegDayCounter,
				floatSchedule, euriborIndex, spread, floatingLegDayCounter);

		Date fwdStart = calendar.advance(settlementDate, 1, TimeUnit.Years);
		Date fwdMaturity = fwdStart.add(new Period(lenghtInYears, TimeUnit.Years));
		Schedule fwdFixedSchedule = new Schedule(fwdStart, fwdMaturity, new Period(fixedLegFrequency), calendar,
				fixedLegConvention, fixedLegConvention, DateGeneration.Rule.Forward, false);
		Schedule fwdFloatSchedule = new Schedule(fwdStart, fwdMaturity, new Period(floatingLegFrequency), calendar,
				floatingLegConvention, floatingLegConvention, DateGeneration.Rule.Forward, false);
		VanillaSwap oneYearForward5YearSwap = new VanillaSwap(swapType, nominal, fwdFixedSchedule, fixedRate,
				fixedLegDayCounter, fwdFloatSchedule, euriborIndex, spread, floatingLegDayCounter);

		double NPV;
		double fairRate;
		double fairSpread;

		PricingEngine swapEngine = new DiscountingSwapEngine(discountingTermStructure);

		spot5YearSwap.setPricingEngine(swapEngine);
		oneYearForward5YearSwap.setPricingEngine(swapEngine);

		// Of course, you're not forced to really use different curves
		forecastingTermStructure.linkTo(depoSwapTermStructure);
		discountingTermStructure.linkTo(depoSwapTermStructure);

		NPV = spot5YearSwap.NPV();
		fairSpread = spot5YearSwap.fairSpread();
		fairRate = spot5YearSwap.fairRate();

		System.out.println(NPV);
		System.out.println(fairSpread);
		System.out.println(fairRate);

        forecastingTermStructure.linkTo(depoFRASwapTermStructure);
        discountingTermStructure.linkTo(depoFRASwapTermStructure);

        NPV = spot5YearSwap.NPV();
        fairSpread = spot5YearSwap.fairSpread();
        fairRate = spot5YearSwap.fairRate();

		System.out.println(NPV);
		System.out.println(fairSpread);
		System.out.println(fairRate);

        forecastingTermStructure.linkTo(depoSwapTermStructure);
        discountingTermStructure.linkTo(depoSwapTermStructure);

        NPV = oneYearForward5YearSwap.NPV();
        fairSpread = oneYearForward5YearSwap.fairSpread();
        fairRate = oneYearForward5YearSwap.fairRate();

		System.out.println(NPV);
		System.out.println(fairSpread);
		System.out.println(fairRate);
	}
}
