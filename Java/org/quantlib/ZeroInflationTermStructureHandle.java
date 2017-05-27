/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class ZeroInflationTermStructureHandle {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ZeroInflationTermStructureHandle(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ZeroInflationTermStructureHandle obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_ZeroInflationTermStructureHandle(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ZeroInflationTermStructureHandle(ZeroInflationTermStructure arg0) {
    this(QuantLibJNI.new_ZeroInflationTermStructureHandle__SWIG_0(ZeroInflationTermStructure.getCPtr(arg0), arg0), true);
  }

  public ZeroInflationTermStructureHandle() {
    this(QuantLibJNI.new_ZeroInflationTermStructureHandle__SWIG_1(), true);
  }

  public ZeroInflationTermStructure __deref__() {
    return new ZeroInflationTermStructure(QuantLibJNI.ZeroInflationTermStructureHandle___deref__(swigCPtr, this), true);
  }

  public boolean empty() {
    return QuantLibJNI.ZeroInflationTermStructureHandle_empty(swigCPtr, this);
  }

  public Observable asObservable() {
    return new Observable(QuantLibJNI.ZeroInflationTermStructureHandle_asObservable(swigCPtr, this), true);
  }

  public double zeroRate(Date d, Period instObsLag, boolean forceLinearInterpolation, boolean extrapolate) {
    return QuantLibJNI.ZeroInflationTermStructureHandle_zeroRate__SWIG_0(swigCPtr, this, Date.getCPtr(d), d, Period.getCPtr(instObsLag), instObsLag, forceLinearInterpolation, extrapolate);
  }

  public double zeroRate(Date d, Period instObsLag, boolean forceLinearInterpolation) {
    return QuantLibJNI.ZeroInflationTermStructureHandle_zeroRate__SWIG_1(swigCPtr, this, Date.getCPtr(d), d, Period.getCPtr(instObsLag), instObsLag, forceLinearInterpolation);
  }

  public double zeroRate(Date d, Period instObsLag) {
    return QuantLibJNI.ZeroInflationTermStructureHandle_zeroRate__SWIG_2(swigCPtr, this, Date.getCPtr(d), d, Period.getCPtr(instObsLag), instObsLag);
  }

  public double zeroRate(Date d) {
    return QuantLibJNI.ZeroInflationTermStructureHandle_zeroRate__SWIG_3(swigCPtr, this, Date.getCPtr(d), d);
  }

  public DayCounter dayCounter() {
    return new DayCounter(QuantLibJNI.ZeroInflationTermStructureHandle_dayCounter(swigCPtr, this), true);
  }

  public Calendar calendar() {
    return new Calendar(QuantLibJNI.ZeroInflationTermStructureHandle_calendar(swigCPtr, this), true);
  }

  public Date referenceDate() {
    return new Date(QuantLibJNI.ZeroInflationTermStructureHandle_referenceDate(swigCPtr, this), true);
  }

  public Date maxDate() {
    return new Date(QuantLibJNI.ZeroInflationTermStructureHandle_maxDate(swigCPtr, this), true);
  }

  public double maxTime() {
    return QuantLibJNI.ZeroInflationTermStructureHandle_maxTime(swigCPtr, this);
  }

  public Period observationLag() {
    return new Period(QuantLibJNI.ZeroInflationTermStructureHandle_observationLag(swigCPtr, this), true);
  }

  public Frequency frequency() {
    return Frequency.swigToEnum(QuantLibJNI.ZeroInflationTermStructureHandle_frequency(swigCPtr, this));
  }

  public boolean indexIsInterpolated() {
    return QuantLibJNI.ZeroInflationTermStructureHandle_indexIsInterpolated(swigCPtr, this);
  }

  public double baseRate() {
    return QuantLibJNI.ZeroInflationTermStructureHandle_baseRate(swigCPtr, this);
  }

  public YieldTermStructureHandle nominalTermStructure() {
    return new YieldTermStructureHandle(QuantLibJNI.ZeroInflationTermStructureHandle_nominalTermStructure(swigCPtr, this), true);
  }

  public Date baseDate() {
    return new Date(QuantLibJNI.ZeroInflationTermStructureHandle_baseDate(swigCPtr, this), true);
  }

  public void setSeasonality(Seasonality seasonality) {
    QuantLibJNI.ZeroInflationTermStructureHandle_setSeasonality__SWIG_0(swigCPtr, this, Seasonality.getCPtr(seasonality), seasonality);
  }

  public void setSeasonality() {
    QuantLibJNI.ZeroInflationTermStructureHandle_setSeasonality__SWIG_1(swigCPtr, this);
  }

  public Seasonality seasonality() {
    return new Seasonality(QuantLibJNI.ZeroInflationTermStructureHandle_seasonality(swigCPtr, this), true);
  }

  public boolean hasSeasonality() {
    return QuantLibJNI.ZeroInflationTermStructureHandle_hasSeasonality(swigCPtr, this);
  }

  public void enableExtrapolation() {
    QuantLibJNI.ZeroInflationTermStructureHandle_enableExtrapolation(swigCPtr, this);
  }

  public void disableExtrapolation() {
    QuantLibJNI.ZeroInflationTermStructureHandle_disableExtrapolation(swigCPtr, this);
  }

  public boolean allowsExtrapolation() {
    return QuantLibJNI.ZeroInflationTermStructureHandle_allowsExtrapolation(swigCPtr, this);
  }

}
