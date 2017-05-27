/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class Statistics {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Statistics(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Statistics obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_Statistics(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public long samples() {
    return QuantLibJNI.Statistics_samples(swigCPtr, this);
  }

  public double weightSum() {
    return QuantLibJNI.Statistics_weightSum(swigCPtr, this);
  }

  public double mean() {
    return QuantLibJNI.Statistics_mean(swigCPtr, this);
  }

  public double variance() {
    return QuantLibJNI.Statistics_variance(swigCPtr, this);
  }

  public double standardDeviation() {
    return QuantLibJNI.Statistics_standardDeviation(swigCPtr, this);
  }

  public double errorEstimate() {
    return QuantLibJNI.Statistics_errorEstimate(swigCPtr, this);
  }

  public double skewness() {
    return QuantLibJNI.Statistics_skewness(swigCPtr, this);
  }

  public double kurtosis() {
    return QuantLibJNI.Statistics_kurtosis(swigCPtr, this);
  }

  public double min() {
    return QuantLibJNI.Statistics_min(swigCPtr, this);
  }

  public double max() {
    return QuantLibJNI.Statistics_max(swigCPtr, this);
  }

  public void reset() {
    QuantLibJNI.Statistics_reset(swigCPtr, this);
  }

  public void add(double value, double weight) {
    QuantLibJNI.Statistics_add__SWIG_0(swigCPtr, this, value, weight);
  }

  public void add(double value) {
    QuantLibJNI.Statistics_add__SWIG_1(swigCPtr, this, value);
  }

  public void add(DoubleVector values) {
    QuantLibJNI.Statistics_add__SWIG_2(swigCPtr, this, DoubleVector.getCPtr(values), values);
  }

  public void add(DoubleVector values, DoubleVector weights) {
    QuantLibJNI.Statistics_add__SWIG_3(swigCPtr, this, DoubleVector.getCPtr(values), values, DoubleVector.getCPtr(weights), weights);
  }

  public Statistics() {
    this(QuantLibJNI.new_Statistics(), true);
  }

}
