/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class Collar extends CapFloor {
  private transient long swigCPtr;

  protected Collar(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.Collar_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Collar obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_Collar(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Collar(Leg leg, DoubleVector capRates, DoubleVector floorRates) {
    this(QuantLibJNI.new_Collar(Leg.getCPtr(leg), leg, DoubleVector.getCPtr(capRates), capRates, DoubleVector.getCPtr(floorRates), floorRates), true);
  }

}
