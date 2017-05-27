/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class G2 extends ShortRateModel {
  private transient long swigCPtr;

  protected G2(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.G2_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(G2 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_G2(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public G2(YieldTermStructureHandle termStructure, double a, double sigma, double b, double eta, double rho) {
    this(QuantLibJNI.new_G2__SWIG_0(YieldTermStructureHandle.getCPtr(termStructure), termStructure, a, sigma, b, eta, rho), true);
  }

  public G2(YieldTermStructureHandle termStructure, double a, double sigma, double b, double eta) {
    this(QuantLibJNI.new_G2__SWIG_1(YieldTermStructureHandle.getCPtr(termStructure), termStructure, a, sigma, b, eta), true);
  }

  public G2(YieldTermStructureHandle termStructure, double a, double sigma, double b) {
    this(QuantLibJNI.new_G2__SWIG_2(YieldTermStructureHandle.getCPtr(termStructure), termStructure, a, sigma, b), true);
  }

  public G2(YieldTermStructureHandle termStructure, double a, double sigma) {
    this(QuantLibJNI.new_G2__SWIG_3(YieldTermStructureHandle.getCPtr(termStructure), termStructure, a, sigma), true);
  }

  public G2(YieldTermStructureHandle termStructure, double a) {
    this(QuantLibJNI.new_G2__SWIG_4(YieldTermStructureHandle.getCPtr(termStructure), termStructure, a), true);
  }

  public G2(YieldTermStructureHandle termStructure) {
    this(QuantLibJNI.new_G2__SWIG_5(YieldTermStructureHandle.getCPtr(termStructure), termStructure), true);
  }

  public double discount(double t) {
    return QuantLibJNI.G2_discount(swigCPtr, this, t);
  }

}
