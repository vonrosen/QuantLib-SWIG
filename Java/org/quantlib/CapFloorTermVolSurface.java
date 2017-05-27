/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class CapFloorTermVolSurface extends CapFloorTermVolatilityStructure {
  private transient long swigCPtr;

  protected CapFloorTermVolSurface(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.CapFloorTermVolSurface_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CapFloorTermVolSurface obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_CapFloorTermVolSurface(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public CapFloorTermVolSurface(long settlementDays, Calendar calendar, BusinessDayConvention bdc, PeriodVector optionTenors, DoubleVector strikes, QuoteHandleVectorVector quotes, DayCounter dc) {
    this(QuantLibJNI.new_CapFloorTermVolSurface__SWIG_0(settlementDays, Calendar.getCPtr(calendar), calendar, bdc.swigValue(), PeriodVector.getCPtr(optionTenors), optionTenors, DoubleVector.getCPtr(strikes), strikes, QuoteHandleVectorVector.getCPtr(quotes), quotes, DayCounter.getCPtr(dc), dc), true);
  }

  public CapFloorTermVolSurface(long settlementDays, Calendar calendar, BusinessDayConvention bdc, PeriodVector optionTenors, DoubleVector strikes, QuoteHandleVectorVector quotes) {
    this(QuantLibJNI.new_CapFloorTermVolSurface__SWIG_1(settlementDays, Calendar.getCPtr(calendar), calendar, bdc.swigValue(), PeriodVector.getCPtr(optionTenors), optionTenors, DoubleVector.getCPtr(strikes), strikes, QuoteHandleVectorVector.getCPtr(quotes), quotes), true);
  }

  public CapFloorTermVolSurface(Date settlementDate, Calendar calendar, BusinessDayConvention bdc, PeriodVector optionTenors, DoubleVector strikes, QuoteHandleVectorVector quotes, DayCounter dc) {
    this(QuantLibJNI.new_CapFloorTermVolSurface__SWIG_2(Date.getCPtr(settlementDate), settlementDate, Calendar.getCPtr(calendar), calendar, bdc.swigValue(), PeriodVector.getCPtr(optionTenors), optionTenors, DoubleVector.getCPtr(strikes), strikes, QuoteHandleVectorVector.getCPtr(quotes), quotes, DayCounter.getCPtr(dc), dc), true);
  }

  public CapFloorTermVolSurface(Date settlementDate, Calendar calendar, BusinessDayConvention bdc, PeriodVector optionTenors, DoubleVector strikes, QuoteHandleVectorVector quotes) {
    this(QuantLibJNI.new_CapFloorTermVolSurface__SWIG_3(Date.getCPtr(settlementDate), settlementDate, Calendar.getCPtr(calendar), calendar, bdc.swigValue(), PeriodVector.getCPtr(optionTenors), optionTenors, DoubleVector.getCPtr(strikes), strikes, QuoteHandleVectorVector.getCPtr(quotes), quotes), true);
  }

  public CapFloorTermVolSurface(Date settlementDate, Calendar calendar, BusinessDayConvention bdc, PeriodVector optionTenors, DoubleVector strikes, Matrix volatilities, DayCounter dc) {
    this(QuantLibJNI.new_CapFloorTermVolSurface__SWIG_4(Date.getCPtr(settlementDate), settlementDate, Calendar.getCPtr(calendar), calendar, bdc.swigValue(), PeriodVector.getCPtr(optionTenors), optionTenors, DoubleVector.getCPtr(strikes), strikes, Matrix.getCPtr(volatilities), volatilities, DayCounter.getCPtr(dc), dc), true);
  }

  public CapFloorTermVolSurface(Date settlementDate, Calendar calendar, BusinessDayConvention bdc, PeriodVector optionTenors, DoubleVector strikes, Matrix volatilities) {
    this(QuantLibJNI.new_CapFloorTermVolSurface__SWIG_5(Date.getCPtr(settlementDate), settlementDate, Calendar.getCPtr(calendar), calendar, bdc.swigValue(), PeriodVector.getCPtr(optionTenors), optionTenors, DoubleVector.getCPtr(strikes), strikes, Matrix.getCPtr(volatilities), volatilities), true);
  }

  public CapFloorTermVolSurface(long settlementDays, Calendar calendar, BusinessDayConvention bdc, PeriodVector optionTenors, DoubleVector strikes, Matrix volatilities, DayCounter dc) {
    this(QuantLibJNI.new_CapFloorTermVolSurface__SWIG_6(settlementDays, Calendar.getCPtr(calendar), calendar, bdc.swigValue(), PeriodVector.getCPtr(optionTenors), optionTenors, DoubleVector.getCPtr(strikes), strikes, Matrix.getCPtr(volatilities), volatilities, DayCounter.getCPtr(dc), dc), true);
  }

  public CapFloorTermVolSurface(long settlementDays, Calendar calendar, BusinessDayConvention bdc, PeriodVector optionTenors, DoubleVector strikes, Matrix volatilities) {
    this(QuantLibJNI.new_CapFloorTermVolSurface__SWIG_7(settlementDays, Calendar.getCPtr(calendar), calendar, bdc.swigValue(), PeriodVector.getCPtr(optionTenors), optionTenors, DoubleVector.getCPtr(strikes), strikes, Matrix.getCPtr(volatilities), volatilities), true);
  }

}
