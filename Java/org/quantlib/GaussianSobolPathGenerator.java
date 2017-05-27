/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class GaussianSobolPathGenerator {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected GaussianSobolPathGenerator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GaussianSobolPathGenerator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_GaussianSobolPathGenerator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public GaussianSobolPathGenerator(StochasticProcess1D process, double length, long steps, GaussianLowDiscrepancySequenceGenerator rsg, boolean brownianBridge) {
    this(QuantLibJNI.new_GaussianSobolPathGenerator(StochasticProcess1D.getCPtr(process), process, length, steps, GaussianLowDiscrepancySequenceGenerator.getCPtr(rsg), rsg, brownianBridge), true);
  }

  public SamplePath next() {
    return new SamplePath(QuantLibJNI.GaussianSobolPathGenerator_next(swigCPtr, this), true);
  }

  public SamplePath antithetic() {
    return new SamplePath(QuantLibJNI.GaussianSobolPathGenerator_antithetic(swigCPtr, this), true);
  }

}
