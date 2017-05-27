/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class RelinkableLocalVolTermStructureHandle extends LocalVolTermStructureHandle {
  private transient long swigCPtr;

  protected RelinkableLocalVolTermStructureHandle(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.RelinkableLocalVolTermStructureHandle_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RelinkableLocalVolTermStructureHandle obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_RelinkableLocalVolTermStructureHandle(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RelinkableLocalVolTermStructureHandle(LocalVolTermStructure arg0) {
    this(QuantLibJNI.new_RelinkableLocalVolTermStructureHandle__SWIG_0(LocalVolTermStructure.getCPtr(arg0), arg0), true);
  }

  public RelinkableLocalVolTermStructureHandle() {
    this(QuantLibJNI.new_RelinkableLocalVolTermStructureHandle__SWIG_1(), true);
  }

  public void linkTo(LocalVolTermStructure arg0) {
    QuantLibJNI.RelinkableLocalVolTermStructureHandle_linkTo(swigCPtr, this, LocalVolTermStructure.getCPtr(arg0), arg0);
  }

}
