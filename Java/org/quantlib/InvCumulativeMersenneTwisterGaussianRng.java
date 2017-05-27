/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class InvCumulativeMersenneTwisterGaussianRng {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected InvCumulativeMersenneTwisterGaussianRng(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(InvCumulativeMersenneTwisterGaussianRng obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_InvCumulativeMersenneTwisterGaussianRng(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public InvCumulativeMersenneTwisterGaussianRng(MersenneTwisterUniformRng rng) {
    this(QuantLibJNI.new_InvCumulativeMersenneTwisterGaussianRng(MersenneTwisterUniformRng.getCPtr(rng), rng), true);
  }

  public SampleNumber next() {
    return new SampleNumber(QuantLibJNI.InvCumulativeMersenneTwisterGaussianRng_next(swigCPtr, this), true);
  }

}
