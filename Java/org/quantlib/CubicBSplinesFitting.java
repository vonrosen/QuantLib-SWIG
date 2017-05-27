/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class CubicBSplinesFitting extends FittingMethod {
  private transient long swigCPtr;

  protected CubicBSplinesFitting(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.CubicBSplinesFitting_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CubicBSplinesFitting obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_CubicBSplinesFitting(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public CubicBSplinesFitting(DoubleVector knotVector, boolean constrainAtZero) {
    this(QuantLibJNI.new_CubicBSplinesFitting__SWIG_0(DoubleVector.getCPtr(knotVector), knotVector, constrainAtZero), true);
  }

  public CubicBSplinesFitting(DoubleVector knotVector) {
    this(QuantLibJNI.new_CubicBSplinesFitting__SWIG_1(DoubleVector.getCPtr(knotVector), knotVector), true);
  }

}
