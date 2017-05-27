/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class InterestRateVector {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected InterestRateVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(InterestRateVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_InterestRateVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public InterestRateVector() {
    this(QuantLibJNI.new_InterestRateVector__SWIG_0(), true);
  }

  public InterestRateVector(long n) {
    this(QuantLibJNI.new_InterestRateVector__SWIG_1(n), true);
  }

  public long size() {
    return QuantLibJNI.InterestRateVector_size(swigCPtr, this);
  }

  public long capacity() {
    return QuantLibJNI.InterestRateVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    QuantLibJNI.InterestRateVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return QuantLibJNI.InterestRateVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    QuantLibJNI.InterestRateVector_clear(swigCPtr, this);
  }

  public void add(InterestRate x) {
    QuantLibJNI.InterestRateVector_add(swigCPtr, this, InterestRate.getCPtr(x), x);
  }

  public InterestRate get(int i) {
    return new InterestRate(QuantLibJNI.InterestRateVector_get(swigCPtr, this, i), false);
  }

  public void set(int i, InterestRate val) {
    QuantLibJNI.InterestRateVector_set(swigCPtr, this, i, InterestRate.getCPtr(val), val);
  }

}
