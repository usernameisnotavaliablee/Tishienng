package xyz.adscope.amps.adapter.bz.data;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class BZNativeAd implements xyz.adscope.amps.ad.nativead.inter.AMPSNativeAdExpressInfo {
    private xyz.adscope.amps.adapter.bz.BZNativeAdapter adapter;
    private int ecpm;

    public BZNativeAd(xyz.adscope.amps.adapter.bz.BZNativeAdapter r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.adapter = r1
            r0.ecpm = r2
            return
    }

    @Override // xyz.adscope.amps.ad.nativead.inter.AMPSNativeAdExpressInfo
    public void destroy() {
            r0 = this;
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
            xyz.adscope.amps.adapter.bz.BZNativeAdapter r0 = r1.adapter
            if (r0 == 0) goto L9
            android.view.View r0 = r0.getAdView()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.amps.ad.nativead.inter.AMPSNativeAdExpressInfo
    public void render() {
            r1 = this;
            xyz.adscope.amps.adapter.bz.BZNativeAdapter r0 = r1.adapter
            if (r0 == 0) goto L7
            r0.onRender()
        L7:
            xyz.adscope.amps.adapter.bz.BZNativeAdapter r0 = r1.adapter
            if (r0 == 0) goto Le
            r0.renderView()
        Le:
            return
    }

    @Override // xyz.adscope.amps.ad.nativead.inter.AMPSNativeAdExpressInfo
    public void setAMPSNativeAdExpressListener(xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdExpressListener r2) {
            r1 = this;
            xyz.adscope.amps.adapter.bz.BZNativeAdapter r0 = r1.adapter
            if (r0 == 0) goto L7
            r0.setAMPSNativeAdExpressListener(r2)
        L7:
            return
    }
}
