package xyz.adscope.amps.adapter.gdt.data;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class GDTDrawAd implements xyz.adscope.amps.ad.draw.inter.AMPSDrawAdExpressInfo {
    public xyz.adscope.amps.adapter.gdt.GDTDrawAdapter adapter;
    public com.qq.e.ads.nativ.NativeExpressADView gdtNativeExpressAd;


    public GDTDrawAd(com.qq.e.ads.nativ.NativeExpressADView r1, xyz.adscope.amps.adapter.gdt.GDTDrawAdapter r2) {
            r0 = this;
            r0.<init>()
            r0.gdtNativeExpressAd = r1
            r0.adapter = r2
            return
    }

    @Override // xyz.adscope.amps.ad.draw.inter.AMPSDrawAdExpressInfo
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

    @Override // xyz.adscope.amps.ad.draw.inter.AMPSDrawAdExpressInfo
    public android.view.View getDrawView() {
            r1 = this;
            com.qq.e.ads.nativ.NativeExpressADView r0 = r1.gdtNativeExpressAd
            if (r0 == 0) goto L5
            return r0
        L5:
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.amps.ad.draw.inter.AMPSDrawAdExpressInfo
    public void render() {
            r1 = this;
            xyz.adscope.amps.adapter.gdt.GDTDrawAdapter r0 = r1.adapter
            if (r0 == 0) goto L7
            r0.onRender()
        L7:
            com.qq.e.ads.nativ.NativeExpressADView r0 = r1.gdtNativeExpressAd
            if (r0 == 0) goto Le
            r0.render()
        Le:
            return
    }

    @Override // xyz.adscope.amps.ad.draw.inter.AMPSDrawAdExpressInfo
    public void setAMPSDrawAdExpressInfoListener(xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdExpressListener r3) {
            r2 = this;
            xyz.adscope.amps.adapter.gdt.GDTDrawAdapter r0 = r2.adapter
            if (r0 == 0) goto L9
            com.qq.e.ads.nativ.NativeExpressADView r1 = r2.gdtNativeExpressAd
            r0.setAMPSDrawAdExpressInfoListener(r1, r3)
        L9:
            return
    }

    @Override // xyz.adscope.amps.ad.draw.inter.AMPSDrawAdExpressInfo
    public void setAMPSDrawAdVideoListener(xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdVideoListener r3) {
            r2 = this;
            com.qq.e.ads.nativ.NativeExpressADView r0 = r2.gdtNativeExpressAd
            if (r0 != 0) goto L5
            return
        L5:
            xyz.adscope.amps.adapter.gdt.data.GDTDrawAd$1 r1 = new xyz.adscope.amps.adapter.gdt.data.GDTDrawAd$1
            r1.<init>(r2, r3)
            r0.setMediaListener(r1)
            return
    }
}
