/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class TemperatureExponential {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected TemperatureExponential(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TemperatureExponential obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_TemperatureExponential(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TemperatureExponential(double initialTemp, long dimension, double power) {
    this(QuantLibJNI.new_TemperatureExponential__SWIG_0(initialTemp, dimension, power), true);
  }

  public TemperatureExponential(double initialTemp, long dimension) {
    this(QuantLibJNI.new_TemperatureExponential__SWIG_1(initialTemp, dimension), true);
  }

}
