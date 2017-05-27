/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class FloorTruncation extends Rounding {
  private transient long swigCPtr;

  protected FloorTruncation(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.FloorTruncation_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FloorTruncation obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_FloorTruncation(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public FloorTruncation(int precision, int digit) {
    this(QuantLibJNI.new_FloorTruncation__SWIG_0(precision, digit), true);
  }

  public FloorTruncation(int precision) {
    this(QuantLibJNI.new_FloorTruncation__SWIG_1(precision), true);
  }

}
