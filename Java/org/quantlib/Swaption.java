/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class Swaption extends Instrument {
  private transient long swigCPtr;

  protected Swaption(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.Swaption_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Swaption obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_Swaption(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Swaption(VanillaSwap simpleSwap, Exercise exercise, Settlement.Type type) {
    this(QuantLibJNI.new_Swaption__SWIG_0(VanillaSwap.getCPtr(simpleSwap), simpleSwap, Exercise.getCPtr(exercise), exercise, type.swigValue()), true);
  }

  public Swaption(VanillaSwap simpleSwap, Exercise exercise) {
    this(QuantLibJNI.new_Swaption__SWIG_1(VanillaSwap.getCPtr(simpleSwap), simpleSwap, Exercise.getCPtr(exercise), exercise), true);
  }

}
