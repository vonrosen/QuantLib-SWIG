/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class MidPointCdsEngine extends PricingEngine {
  private transient long swigCPtr;

  protected MidPointCdsEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.MidPointCdsEngine_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MidPointCdsEngine obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_MidPointCdsEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public MidPointCdsEngine(DefaultProbabilityTermStructureHandle probability, double recoveryRate, YieldTermStructureHandle discountCurve) {
    this(QuantLibJNI.new_MidPointCdsEngine(DefaultProbabilityTermStructureHandle.getCPtr(probability), probability, recoveryRate, YieldTermStructureHandle.getCPtr(discountCurve), discountCurve), true);
  }

}
