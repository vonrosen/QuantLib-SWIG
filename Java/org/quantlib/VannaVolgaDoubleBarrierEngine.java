/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class VannaVolgaDoubleBarrierEngine extends PricingEngine {
  private transient long swigCPtr;

  protected VannaVolgaDoubleBarrierEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.VannaVolgaDoubleBarrierEngine_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(VannaVolgaDoubleBarrierEngine obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_VannaVolgaDoubleBarrierEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public VannaVolgaDoubleBarrierEngine(DeltaVolQuoteHandle atmVol, DeltaVolQuoteHandle vol25Put, DeltaVolQuoteHandle vol25Call, QuoteHandle spotFX, YieldTermStructureHandle domesticTS, YieldTermStructureHandle foreignTS, String type, boolean adaptVanDelta, double bsPriceWithSmile, int series) {
    this(QuantLibJNI.new_VannaVolgaDoubleBarrierEngine__SWIG_0(DeltaVolQuoteHandle.getCPtr(atmVol), atmVol, DeltaVolQuoteHandle.getCPtr(vol25Put), vol25Put, DeltaVolQuoteHandle.getCPtr(vol25Call), vol25Call, QuoteHandle.getCPtr(spotFX), spotFX, YieldTermStructureHandle.getCPtr(domesticTS), domesticTS, YieldTermStructureHandle.getCPtr(foreignTS), foreignTS, type, adaptVanDelta, bsPriceWithSmile, series), true);
  }

  public VannaVolgaDoubleBarrierEngine(DeltaVolQuoteHandle atmVol, DeltaVolQuoteHandle vol25Put, DeltaVolQuoteHandle vol25Call, QuoteHandle spotFX, YieldTermStructureHandle domesticTS, YieldTermStructureHandle foreignTS, String type, boolean adaptVanDelta, double bsPriceWithSmile) {
    this(QuantLibJNI.new_VannaVolgaDoubleBarrierEngine__SWIG_1(DeltaVolQuoteHandle.getCPtr(atmVol), atmVol, DeltaVolQuoteHandle.getCPtr(vol25Put), vol25Put, DeltaVolQuoteHandle.getCPtr(vol25Call), vol25Call, QuoteHandle.getCPtr(spotFX), spotFX, YieldTermStructureHandle.getCPtr(domesticTS), domesticTS, YieldTermStructureHandle.getCPtr(foreignTS), foreignTS, type, adaptVanDelta, bsPriceWithSmile), true);
  }

  public VannaVolgaDoubleBarrierEngine(DeltaVolQuoteHandle atmVol, DeltaVolQuoteHandle vol25Put, DeltaVolQuoteHandle vol25Call, QuoteHandle spotFX, YieldTermStructureHandle domesticTS, YieldTermStructureHandle foreignTS, String type, boolean adaptVanDelta) {
    this(QuantLibJNI.new_VannaVolgaDoubleBarrierEngine__SWIG_2(DeltaVolQuoteHandle.getCPtr(atmVol), atmVol, DeltaVolQuoteHandle.getCPtr(vol25Put), vol25Put, DeltaVolQuoteHandle.getCPtr(vol25Call), vol25Call, QuoteHandle.getCPtr(spotFX), spotFX, YieldTermStructureHandle.getCPtr(domesticTS), domesticTS, YieldTermStructureHandle.getCPtr(foreignTS), foreignTS, type, adaptVanDelta), true);
  }

  public VannaVolgaDoubleBarrierEngine(DeltaVolQuoteHandle atmVol, DeltaVolQuoteHandle vol25Put, DeltaVolQuoteHandle vol25Call, QuoteHandle spotFX, YieldTermStructureHandle domesticTS, YieldTermStructureHandle foreignTS, String type) {
    this(QuantLibJNI.new_VannaVolgaDoubleBarrierEngine__SWIG_3(DeltaVolQuoteHandle.getCPtr(atmVol), atmVol, DeltaVolQuoteHandle.getCPtr(vol25Put), vol25Put, DeltaVolQuoteHandle.getCPtr(vol25Call), vol25Call, QuoteHandle.getCPtr(spotFX), spotFX, YieldTermStructureHandle.getCPtr(domesticTS), domesticTS, YieldTermStructureHandle.getCPtr(foreignTS), foreignTS, type), true);
  }

  public VannaVolgaDoubleBarrierEngine(DeltaVolQuoteHandle atmVol, DeltaVolQuoteHandle vol25Put, DeltaVolQuoteHandle vol25Call, QuoteHandle spotFX, YieldTermStructureHandle domesticTS, YieldTermStructureHandle foreignTS) {
    this(QuantLibJNI.new_VannaVolgaDoubleBarrierEngine__SWIG_4(DeltaVolQuoteHandle.getCPtr(atmVol), atmVol, DeltaVolQuoteHandle.getCPtr(vol25Put), vol25Put, DeltaVolQuoteHandle.getCPtr(vol25Call), vol25Call, QuoteHandle.getCPtr(spotFX), spotFX, YieldTermStructureHandle.getCPtr(domesticTS), domesticTS, YieldTermStructureHandle.getCPtr(foreignTS), foreignTS), true);
  }

}
