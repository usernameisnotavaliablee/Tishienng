package xyz.adscope.amps.adapter.gdt.data;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class GDTNativeAd implements xyz.adscope.amps.ad.nativead.inter.AMPSNativeAdExpressInfo {
    public xyz.adscope.amps.adapter.gdt.GDTNativeAdapter adapter;
    private int ecpm;
    public com.qq.e.ads.nativ.NativeExpressADView gdtNativeExpressAd;

    public GDTNativeAd(com.qq.e.ads.nativ.NativeExpressADView r1, xyz.adscope.amps.adapter.gdt.GDTNativeAdapter r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.gdtNativeExpressAd = r1
            r0.adapter = r2
            r0.ecpm = r3
            return
    }

    @Override // xyz.adscope.amps.ad.nativead.inter.AMPSNativeAdExpressInfo
    public void destroy() {
            r1 = this;
            com.qq.e.ads.nativ.NativeExpressADView r0 = r1.gdtNativeExpressAd     // Catch: java.lang.Exception -> La
            if (r0 == 0) goto La
            r0.destroy()     // Catch: java.lang.Exception -> La
            r0 = 0
            r1.gdtNativeExpressAd = r0     // Catch: java.lang.Exception -> La
        La:
            return
    }

    @Override // xyz.adscope.amps.ad.nativead.inter.AMPSNativeAdExpressInfo
    public int getECPM() {
            r1 = this;
            int r0 = r1.ecpm
            return r0
    }

    @Override // xyz.adscope.amps.ad.nativead.inter.AMPSNativeAdExpressInfo
    public android.view.View getNativeExpressAdView() {
            r1 = this;
            com.qq.e.ads.nativ.NativeExpressADView r0 = r1.gdtNativeExpressAd
            if (r0 == 0) goto L5
            return r0
        L5:
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.amps.ad.nativead.inter.AMPSNativeAdExpressInfo
    public void render() {
            r1 = this;
            xyz.adscope.amps.adapter.gdt.GDTNativeAdapter r0 = r1.adapter
            if (r0 == 0) goto L7
            r0.onRender()
        L7:
            com.qq.e.ads.nativ.NativeExpressADView r0 = r1.gdtNativeExpressAd
            if (r0 == 0) goto Le
            r0.render()
        Le:
            return
    }

    @Override // xyz.adscope.amps.ad.nativead.inter.AMPSNativeAdExpressInfo
    public void setAMPSNativeAdExpressListener(xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdExpressListener r3) {
            r2 = this;
            xyz.adscope.amps.adapter.gdt.GDTNativeAdapter r0 = r2.adapter
            if (r0 == 0) goto L9
            com.qq.e.ads.nativ.NativeExpressADView r1 = r2.gdtNativeExpressAd
            r0.setAMPSNativeAdExpressListener(r1, r3)
        L9:
            return
    }
}
