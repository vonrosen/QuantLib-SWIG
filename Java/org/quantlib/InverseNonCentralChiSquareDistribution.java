/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class InverseNonCentralChiSquareDistribution {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected InverseNonCentralChiSquareDistribution(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(InverseNonCentralChiSquareDistribution obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_InverseNonCentralChiSquareDistribution(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public InverseNonCentralChiSquareDistribution(double df, double ncp, long maxEvaluations, double accuracy) {
    this(QuantLibJNI.new_InverseNonCentralChiSquareDistribution__SWIG_0(df, ncp, maxEvaluations, accuracy), true);
  }

  public InverseNonCentralChiSquareDistribution(double df, double ncp, long maxEvaluations) {
    this(QuantLibJNI.new_InverseNonCentralChiSquareDistribution__SWIG_1(df, ncp, maxEvaluations), true);
  }

  public InverseNonCentralChiSquareDistribution(double df, double ncp) {
    this(QuantLibJNI.new_InverseNonCentralChiSquareDistribution__SWIG_2(df, ncp), true);
  }

  public double getValue(double x) {
    return QuantLibJNI.InverseNonCentralChiSquareDistribution_getValue(swigCPtr, this, x);
  }

}
