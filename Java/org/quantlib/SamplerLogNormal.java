/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class SamplerLogNormal {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SamplerLogNormal(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SamplerLogNormal obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_SamplerLogNormal(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SamplerLogNormal(long seed) {
    this(QuantLibJNI.new_SamplerLogNormal__SWIG_0(seed), true);
  }

  public SamplerLogNormal() {
    this(QuantLibJNI.new_SamplerLogNormal__SWIG_1(), true);
  }

}
