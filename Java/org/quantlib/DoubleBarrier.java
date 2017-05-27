/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class DoubleBarrier {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected DoubleBarrier(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DoubleBarrier obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_DoubleBarrier(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public DoubleBarrier() {
    this(QuantLibJNI.new_DoubleBarrier(), true);
  }

  public final static class Type {
    public final static DoubleBarrier.Type KnockIn = new DoubleBarrier.Type("KnockIn");
    public final static DoubleBarrier.Type KnockOut = new DoubleBarrier.Type("KnockOut");
    public final static DoubleBarrier.Type KIKO = new DoubleBarrier.Type("KIKO");
    public final static DoubleBarrier.Type KOKI = new DoubleBarrier.Type("KOKI");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static Type swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + Type.class + " with value " + swigValue);
    }

    private Type(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private Type(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private Type(String swigName, Type swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static Type[] swigValues = { KnockIn, KnockOut, KIKO, KOKI };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
