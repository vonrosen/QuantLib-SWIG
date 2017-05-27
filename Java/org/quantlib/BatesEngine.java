/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class BatesEngine extends PricingEngine {
  private transient long swigCPtr;

  protected BatesEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.BatesEngine_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BatesEngine obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_BatesEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public BatesEngine(BatesModel model, long integrationOrder) {
    this(QuantLibJNI.new_BatesEngine__SWIG_0(BatesModel.getCPtr(model), model, integrationOrder), true);
  }

  public BatesEngine(BatesModel model) {
    this(QuantLibJNI.new_BatesEngine__SWIG_1(BatesModel.getCPtr(model), model), true);
  }

  public BatesEngine(BatesModel model, double relTolerance, long maxEvaluations) {
    this(QuantLibJNI.new_BatesEngine__SWIG_2(BatesModel.getCPtr(model), model, relTolerance, maxEvaluations), true);
  }

}
