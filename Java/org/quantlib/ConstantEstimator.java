/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class ConstantEstimator {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ConstantEstimator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ConstantEstimator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_ConstantEstimator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ConstantEstimator(long size) {
    this(QuantLibJNI.new_ConstantEstimator(size), true);
  }

  public RealTimeSeries calculate(RealTimeSeries arg0) {
    return new RealTimeSeries(QuantLibJNI.ConstantEstimator_calculate(swigCPtr, this, RealTimeSeries.getCPtr(arg0), arg0), true);
  }

}
