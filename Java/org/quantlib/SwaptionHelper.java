/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class SwaptionHelper extends CalibrationHelper {
  private transient long swigCPtr;

  protected SwaptionHelper(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.SwaptionHelper_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SwaptionHelper obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_SwaptionHelper(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public SwaptionHelper(Period maturity, Period length, QuoteHandle volatility, IborIndex index, Period fixedLegTenor, DayCounter fixedLegDayCounter, DayCounter floatingLegDayCounter, YieldTermStructureHandle termStructure, _CalibrationHelper.CalibrationErrorType errorType, double strike, double nominal, VolatilityType type, double shift) {
    this(QuantLibJNI.new_SwaptionHelper__SWIG_0(Period.getCPtr(maturity), maturity, Period.getCPtr(length), length, QuoteHandle.getCPtr(volatility), volatility, IborIndex.getCPtr(index), index, Period.getCPtr(fixedLegTenor), fixedLegTenor, DayCounter.getCPtr(fixedLegDayCounter), fixedLegDayCounter, DayCounter.getCPtr(floatingLegDayCounter), floatingLegDayCounter, YieldTermStructureHandle.getCPtr(termStructure), termStructure, errorType.swigValue(), strike, nominal, type.swigValue(), shift), true);
  }

  public SwaptionHelper(Period maturity, Period length, QuoteHandle volatility, IborIndex index, Period fixedLegTenor, DayCounter fixedLegDayCounter, DayCounter floatingLegDayCounter, YieldTermStructureHandle termStructure, _CalibrationHelper.CalibrationErrorType errorType, double strike, double nominal, VolatilityType type) {
    this(QuantLibJNI.new_SwaptionHelper__SWIG_1(Period.getCPtr(maturity), maturity, Period.getCPtr(length), length, QuoteHandle.getCPtr(volatility), volatility, IborIndex.getCPtr(index), index, Period.getCPtr(fixedLegTenor), fixedLegTenor, DayCounter.getCPtr(fixedLegDayCounter), fixedLegDayCounter, DayCounter.getCPtr(floatingLegDayCounter), floatingLegDayCounter, YieldTermStructureHandle.getCPtr(termStructure), termStructure, errorType.swigValue(), strike, nominal, type.swigValue()), true);
  }

  public SwaptionHelper(Period maturity, Period length, QuoteHandle volatility, IborIndex index, Period fixedLegTenor, DayCounter fixedLegDayCounter, DayCounter floatingLegDayCounter, YieldTermStructureHandle termStructure, _CalibrationHelper.CalibrationErrorType errorType, double strike, double nominal) {
    this(QuantLibJNI.new_SwaptionHelper__SWIG_2(Period.getCPtr(maturity), maturity, Period.getCPtr(length), length, QuoteHandle.getCPtr(volatility), volatility, IborIndex.getCPtr(index), index, Period.getCPtr(fixedLegTenor), fixedLegTenor, DayCounter.getCPtr(fixedLegDayCounter), fixedLegDayCounter, DayCounter.getCPtr(floatingLegDayCounter), floatingLegDayCounter, YieldTermStructureHandle.getCPtr(termStructure), termStructure, errorType.swigValue(), strike, nominal), true);
  }

  public SwaptionHelper(Period maturity, Period length, QuoteHandle volatility, IborIndex index, Period fixedLegTenor, DayCounter fixedLegDayCounter, DayCounter floatingLegDayCounter, YieldTermStructureHandle termStructure, _CalibrationHelper.CalibrationErrorType errorType, double strike) {
    this(QuantLibJNI.new_SwaptionHelper__SWIG_3(Period.getCPtr(maturity), maturity, Period.getCPtr(length), length, QuoteHandle.getCPtr(volatility), volatility, IborIndex.getCPtr(index), index, Period.getCPtr(fixedLegTenor), fixedLegTenor, DayCounter.getCPtr(fixedLegDayCounter), fixedLegDayCounter, DayCounter.getCPtr(floatingLegDayCounter), floatingLegDayCounter, YieldTermStructureHandle.getCPtr(termStructure), termStructure, errorType.swigValue(), strike), true);
  }

  public SwaptionHelper(Period maturity, Period length, QuoteHandle volatility, IborIndex index, Period fixedLegTenor, DayCounter fixedLegDayCounter, DayCounter floatingLegDayCounter, YieldTermStructureHandle termStructure, _CalibrationHelper.CalibrationErrorType errorType) {
    this(QuantLibJNI.new_SwaptionHelper__SWIG_4(Period.getCPtr(maturity), maturity, Period.getCPtr(length), length, QuoteHandle.getCPtr(volatility), volatility, IborIndex.getCPtr(index), index, Period.getCPtr(fixedLegTenor), fixedLegTenor, DayCounter.getCPtr(fixedLegDayCounter), fixedLegDayCounter, DayCounter.getCPtr(floatingLegDayCounter), floatingLegDayCounter, YieldTermStructureHandle.getCPtr(termStructure), termStructure, errorType.swigValue()), true);
  }

  public SwaptionHelper(Period maturity, Period length, QuoteHandle volatility, IborIndex index, Period fixedLegTenor, DayCounter fixedLegDayCounter, DayCounter floatingLegDayCounter, YieldTermStructureHandle termStructure) {
    this(QuantLibJNI.new_SwaptionHelper__SWIG_5(Period.getCPtr(maturity), maturity, Period.getCPtr(length), length, QuoteHandle.getCPtr(volatility), volatility, IborIndex.getCPtr(index), index, Period.getCPtr(fixedLegTenor), fixedLegTenor, DayCounter.getCPtr(fixedLegDayCounter), fixedLegDayCounter, DayCounter.getCPtr(floatingLegDayCounter), floatingLegDayCounter, YieldTermStructureHandle.getCPtr(termStructure), termStructure), true);
  }

  public SwaptionHelper(Date exerciseDate, Period length, QuoteHandle volatility, IborIndex index, Period fixedLegTenor, DayCounter fixedLegDayCounter, DayCounter floatingLegDayCounter, YieldTermStructureHandle termStructure, _CalibrationHelper.CalibrationErrorType errorType, double strike, double nominal, VolatilityType type, double shift) {
    this(QuantLibJNI.new_SwaptionHelper__SWIG_6(Date.getCPtr(exerciseDate), exerciseDate, Period.getCPtr(length), length, QuoteHandle.getCPtr(volatility), volatility, IborIndex.getCPtr(index), index, Period.getCPtr(fixedLegTenor), fixedLegTenor, DayCounter.getCPtr(fixedLegDayCounter), fixedLegDayCounter, DayCounter.getCPtr(floatingLegDayCounter), floatingLegDayCounter, YieldTermStructureHandle.getCPtr(termStructure), termStructure, errorType.swigValue(), strike, nominal, type.swigValue(), shift), true);
  }

  public SwaptionHelper(Date exerciseDate, Period length, QuoteHandle volatility, IborIndex index, Period fixedLegTenor, DayCounter fixedLegDayCounter, DayCounter floatingLegDayCounter, YieldTermStructureHandle termStructure, _CalibrationHelper.CalibrationErrorType errorType, double strike, double nominal, VolatilityType type) {
    this(QuantLibJNI.new_SwaptionHelper__SWIG_7(Date.getCPtr(exerciseDate), exerciseDate, Period.getCPtr(length), length, QuoteHandle.getCPtr(volatility), volatility, IborIndex.getCPtr(index), index, Period.getCPtr(fixedLegTenor), fixedLegTenor, DayCounter.getCPtr(fixedLegDayCounter), fixedLegDayCounter, DayCounter.getCPtr(floatingLegDayCounter), floatingLegDayCounter, YieldTermStructureHandle.getCPtr(termStructure), termStructure, errorType.swigValue(), strike, nominal, type.swigValue()), true);
  }

  public SwaptionHelper(Date exerciseDate, Period length, QuoteHandle volatility, IborIndex index, Period fixedLegTenor, DayCounter fixedLegDayCounter, DayCounter floatingLegDayCounter, YieldTermStructureHandle termStructure, _CalibrationHelper.CalibrationErrorType errorType, double strike, double nominal) {
    this(QuantLibJNI.new_SwaptionHelper__SWIG_8(Date.getCPtr(exerciseDate), exerciseDate, Period.getCPtr(length), length, QuoteHandle.getCPtr(volatility), volatility, IborIndex.getCPtr(index), index, Period.getCPtr(fixedLegTenor), fixedLegTenor, DayCounter.getCPtr(fixedLegDayCounter), fixedLegDayCounter, DayCounter.getCPtr(floatingLegDayCounter), floatingLegDayCounter, YieldTermStructureHandle.getCPtr(termStructure), termStructure, errorType.swigValue(), strike, nominal), true);
  }

  public SwaptionHelper(Date exerciseDate, Period length, QuoteHandle volatility, IborIndex index, Period fixedLegTenor, DayCounter fixedLegDayCounter, DayCounter floatingLegDayCounter, YieldTermStructureHandle termStructure, _CalibrationHelper.CalibrationErrorType errorType, double strike) {
    this(QuantLibJNI.new_SwaptionHelper__SWIG_9(Date.getCPtr(exerciseDate), exerciseDate, Period.getCPtr(length), length, QuoteHandle.getCPtr(volatility), volatility, IborIndex.getCPtr(index), index, Period.getCPtr(fixedLegTenor), fixedLegTenor, DayCounter.getCPtr(fixedLegDayCounter), fixedLegDayCounter, DayCounter.getCPtr(floatingLegDayCounter), floatingLegDayCounter, YieldTermStructureHandle.getCPtr(termStructure), termStructure, errorType.swigValue(), strike), true);
  }

  public SwaptionHelper(Date exerciseDate, Period length, QuoteHandle volatility, IborIndex index, Period fixedLegTenor, DayCounter fixedLegDayCounter, DayCounter floatingLegDayCounter, YieldTermStructureHandle termStructure, _CalibrationHelper.CalibrationErrorType errorType) {
    this(QuantLibJNI.new_SwaptionHelper__SWIG_10(Date.getCPtr(exerciseDate), exerciseDate, Period.getCPtr(length), length, QuoteHandle.getCPtr(volatility), volatility, IborIndex.getCPtr(index), index, Period.getCPtr(fixedLegTenor), fixedLegTenor, DayCounter.getCPtr(fixedLegDayCounter), fixedLegDayCounter, DayCounter.getCPtr(floatingLegDayCounter), floatingLegDayCounter, YieldTermStructureHandle.getCPtr(termStructure), termStructure, errorType.swigValue()), true);
  }

  public SwaptionHelper(Date exerciseDate, Period length, QuoteHandle volatility, IborIndex index, Period fixedLegTenor, DayCounter fixedLegDayCounter, DayCounter floatingLegDayCounter, YieldTermStructureHandle termStructure) {
    this(QuantLibJNI.new_SwaptionHelper__SWIG_11(Date.getCPtr(exerciseDate), exerciseDate, Period.getCPtr(length), length, QuoteHandle.getCPtr(volatility), volatility, IborIndex.getCPtr(index), index, Period.getCPtr(fixedLegTenor), fixedLegTenor, DayCounter.getCPtr(fixedLegDayCounter), fixedLegDayCounter, DayCounter.getCPtr(floatingLegDayCounter), floatingLegDayCounter, YieldTermStructureHandle.getCPtr(termStructure), termStructure), true);
  }

  public SwaptionHelper(Date exerciseDate, Date endDate, QuoteHandle volatility, IborIndex index, Period fixedLegTenor, DayCounter fixedLegDayCounter, DayCounter floatingLegDayCounter, YieldTermStructureHandle termStructure, _CalibrationHelper.CalibrationErrorType errorType, double strike, double nominal, VolatilityType type, double shift) {
    this(QuantLibJNI.new_SwaptionHelper__SWIG_12(Date.getCPtr(exerciseDate), exerciseDate, Date.getCPtr(endDate), endDate, QuoteHandle.getCPtr(volatility), volatility, IborIndex.getCPtr(index), index, Period.getCPtr(fixedLegTenor), fixedLegTenor, DayCounter.getCPtr(fixedLegDayCounter), fixedLegDayCounter, DayCounter.getCPtr(floatingLegDayCounter), floatingLegDayCounter, YieldTermStructureHandle.getCPtr(termStructure), termStructure, errorType.swigValue(), strike, nominal, type.swigValue(), shift), true);
  }

  public SwaptionHelper(Date exerciseDate, Date endDate, QuoteHandle volatility, IborIndex index, Period fixedLegTenor, DayCounter fixedLegDayCounter, DayCounter floatingLegDayCounter, YieldTermStructureHandle termStructure, _CalibrationHelper.CalibrationErrorType errorType, double strike, double nominal, VolatilityType type) {
    this(QuantLibJNI.new_SwaptionHelper__SWIG_13(Date.getCPtr(exerciseDate), exerciseDate, Date.getCPtr(endDate), endDate, QuoteHandle.getCPtr(volatility), volatility, IborIndex.getCPtr(index), index, Period.getCPtr(fixedLegTenor), fixedLegTenor, DayCounter.getCPtr(fixedLegDayCounter), fixedLegDayCounter, DayCounter.getCPtr(floatingLegDayCounter), floatingLegDayCounter, YieldTermStructureHandle.getCPtr(termStructure), termStructure, errorType.swigValue(), strike, nominal, type.swigValue()), true);
  }

  public SwaptionHelper(Date exerciseDate, Date endDate, QuoteHandle volatility, IborIndex index, Period fixedLegTenor, DayCounter fixedLegDayCounter, DayCounter floatingLegDayCounter, YieldTermStructureHandle termStructure, _CalibrationHelper.CalibrationErrorType errorType, double strike, double nominal) {
    this(QuantLibJNI.new_SwaptionHelper__SWIG_14(Date.getCPtr(exerciseDate), exerciseDate, Date.getCPtr(endDate), endDate, QuoteHandle.getCPtr(volatility), volatility, IborIndex.getCPtr(index), index, Period.getCPtr(fixedLegTenor), fixedLegTenor, DayCounter.getCPtr(fixedLegDayCounter), fixedLegDayCounter, DayCounter.getCPtr(floatingLegDayCounter), floatingLegDayCounter, YieldTermStructureHandle.getCPtr(termStructure), termStructure, errorType.swigValue(), strike, nominal), true);
  }

  public SwaptionHelper(Date exerciseDate, Date endDate, QuoteHandle volatility, IborIndex index, Period fixedLegTenor, DayCounter fixedLegDayCounter, DayCounter floatingLegDayCounter, YieldTermStructureHandle termStructure, _CalibrationHelper.CalibrationErrorType errorType, double strike) {
    this(QuantLibJNI.new_SwaptionHelper__SWIG_15(Date.getCPtr(exerciseDate), exerciseDate, Date.getCPtr(endDate), endDate, QuoteHandle.getCPtr(volatility), volatility, IborIndex.getCPtr(index), index, Period.getCPtr(fixedLegTenor), fixedLegTenor, DayCounter.getCPtr(fixedLegDayCounter), fixedLegDayCounter, DayCounter.getCPtr(floatingLegDayCounter), floatingLegDayCounter, YieldTermStructureHandle.getCPtr(termStructure), termStructure, errorType.swigValue(), strike), true);
  }

  public SwaptionHelper(Date exerciseDate, Date endDate, QuoteHandle volatility, IborIndex index, Period fixedLegTenor, DayCounter fixedLegDayCounter, DayCounter floatingLegDayCounter, YieldTermStructureHandle termStructure, _CalibrationHelper.CalibrationErrorType errorType) {
    this(QuantLibJNI.new_SwaptionHelper__SWIG_16(Date.getCPtr(exerciseDate), exerciseDate, Date.getCPtr(endDate), endDate, QuoteHandle.getCPtr(volatility), volatility, IborIndex.getCPtr(index), index, Period.getCPtr(fixedLegTenor), fixedLegTenor, DayCounter.getCPtr(fixedLegDayCounter), fixedLegDayCounter, DayCounter.getCPtr(floatingLegDayCounter), floatingLegDayCounter, YieldTermStructureHandle.getCPtr(termStructure), termStructure, errorType.swigValue()), true);
  }

  public SwaptionHelper(Date exerciseDate, Date endDate, QuoteHandle volatility, IborIndex index, Period fixedLegTenor, DayCounter fixedLegDayCounter, DayCounter floatingLegDayCounter, YieldTermStructureHandle termStructure) {
    this(QuantLibJNI.new_SwaptionHelper__SWIG_17(Date.getCPtr(exerciseDate), exerciseDate, Date.getCPtr(endDate), endDate, QuoteHandle.getCPtr(volatility), volatility, IborIndex.getCPtr(index), index, Period.getCPtr(fixedLegTenor), fixedLegTenor, DayCounter.getCPtr(fixedLegDayCounter), fixedLegDayCounter, DayCounter.getCPtr(floatingLegDayCounter), floatingLegDayCounter, YieldTermStructureHandle.getCPtr(termStructure), termStructure), true);
  }

  public DoubleVector times() {
    return new DoubleVector(QuantLibJNI.SwaptionHelper_times(swigCPtr, this), true);
  }

}
