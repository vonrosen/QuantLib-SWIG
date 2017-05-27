/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class StrippedOptionletBase {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected StrippedOptionletBase(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(StrippedOptionletBase obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_StrippedOptionletBase(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SWIGTYPE_p_StrippedOptionletBase __deref__() {
    long cPtr = QuantLibJNI.StrippedOptionletBase___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_StrippedOptionletBase(cPtr, false);
  }

  public boolean isNull() {
    return QuantLibJNI.StrippedOptionletBase_isNull(swigCPtr, this);
  }

  public StrippedOptionletBase() {
    this(QuantLibJNI.new_StrippedOptionletBase(), true);
  }

  public DoubleVector optionletStrikes(long i) {
    return new DoubleVector(QuantLibJNI.StrippedOptionletBase_optionletStrikes(swigCPtr, this, i), false);
  }

  public DoubleVector optionletVolatilities(long i) {
    return new DoubleVector(QuantLibJNI.StrippedOptionletBase_optionletVolatilities(swigCPtr, this, i), false);
  }

  public DateVector optionletFixingDates() {
    return new DateVector(QuantLibJNI.StrippedOptionletBase_optionletFixingDates(swigCPtr, this), false);
  }

  public DoubleVector optionletFixingTimes() {
    return new DoubleVector(QuantLibJNI.StrippedOptionletBase_optionletFixingTimes(swigCPtr, this), false);
  }

  public long optionletMaturities() {
    return QuantLibJNI.StrippedOptionletBase_optionletMaturities(swigCPtr, this);
  }

  public DoubleVector atmOptionletRates() {
    return new DoubleVector(QuantLibJNI.StrippedOptionletBase_atmOptionletRates(swigCPtr, this), false);
  }

  public DayCounter dayCounter() {
    return new DayCounter(QuantLibJNI.StrippedOptionletBase_dayCounter(swigCPtr, this), true);
  }

  public Calendar calendar() {
    return new Calendar(QuantLibJNI.StrippedOptionletBase_calendar(swigCPtr, this), true);
  }

  public long settlementDays() {
    return QuantLibJNI.StrippedOptionletBase_settlementDays(swigCPtr, this);
  }

  public BusinessDayConvention businessDayConvention() {
    return BusinessDayConvention.swigToEnum(QuantLibJNI.StrippedOptionletBase_businessDayConvention(swigCPtr, this));
  }

}
