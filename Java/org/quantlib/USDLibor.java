/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class USDLibor extends IborIndex {
  private transient long swigCPtr;

  protected USDLibor(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.USDLibor_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(USDLibor obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_USDLibor(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public USDLibor(Period tenor, YieldTermStructureHandle h) {
    this(QuantLibJNI.new_USDLibor__SWIG_0(Period.getCPtr(tenor), tenor, YieldTermStructureHandle.getCPtr(h), h), true);
  }

  public USDLibor(Period tenor) {
    this(QuantLibJNI.new_USDLibor__SWIG_1(Period.getCPtr(tenor), tenor), true);
  }

}
