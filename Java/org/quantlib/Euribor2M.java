/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class Euribor2M extends Euribor {
  private transient long swigCPtr;

  protected Euribor2M(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.Euribor2M_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Euribor2M obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_Euribor2M(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Euribor2M(YieldTermStructureHandle h) {
    this(QuantLibJNI.new_Euribor2M__SWIG_0(YieldTermStructureHandle.getCPtr(h), h), true);
  }

  public Euribor2M() {
    this(QuantLibJNI.new_Euribor2M__SWIG_1(), true);
  }

}
