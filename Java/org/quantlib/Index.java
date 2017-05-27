/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class Index {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Index(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Index obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_Index(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SWIGTYPE_p_Index __deref__() {
    long cPtr = QuantLibJNI.Index___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_Index(cPtr, false);
  }

  public boolean isNull() {
    return QuantLibJNI.Index_isNull(swigCPtr, this);
  }

  public void addFixings(DateVector fixingDates, DoubleVector fixings) {
    QuantLibJNI.Index_addFixings(swigCPtr, this, DateVector.getCPtr(fixingDates), fixingDates, DoubleVector.getCPtr(fixings), fixings);
  }

  public String toString() {
    return QuantLibJNI.Index_toString(swigCPtr, this);
  }

  public Observable asObservable() {
    return new Observable(QuantLibJNI.Index_asObservable(swigCPtr, this), true);
  }

  public Index() {
    this(QuantLibJNI.new_Index(), true);
  }

  public String name() {
    return QuantLibJNI.Index_name(swigCPtr, this);
  }

  public Calendar fixingCalendar() {
    return new Calendar(QuantLibJNI.Index_fixingCalendar(swigCPtr, this), true);
  }

  public boolean isValidFixingDate(Date fixingDate) {
    return QuantLibJNI.Index_isValidFixingDate(swigCPtr, this, Date.getCPtr(fixingDate), fixingDate);
  }

  public double fixing(Date fixingDate, boolean forecastTodaysFixing) {
    return QuantLibJNI.Index_fixing__SWIG_0(swigCPtr, this, Date.getCPtr(fixingDate), fixingDate, forecastTodaysFixing);
  }

  public double fixing(Date fixingDate) {
    return QuantLibJNI.Index_fixing__SWIG_1(swigCPtr, this, Date.getCPtr(fixingDate), fixingDate);
  }

  public void addFixing(Date fixingDate, double fixing) {
    QuantLibJNI.Index_addFixing(swigCPtr, this, Date.getCPtr(fixingDate), fixingDate, fixing);
  }

}
