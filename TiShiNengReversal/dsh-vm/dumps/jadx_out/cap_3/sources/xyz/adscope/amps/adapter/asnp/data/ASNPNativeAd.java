package xyz.adscope.amps.adapter.asnp.data;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class ASNPNativeAd implements xyz.adscope.amps.ad.nativead.inter.AMPSNativeAdExpressInfo {
    private xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdapter adapter;
    private int ecpm;
    public xyz.adscope.ad.publish.ad.nativead.INativeAdItem iNativeAdItem;
    private xyz.adscope.ad.publish.ad.nativead.INativeRenderListener iNativeRenderListener;




    public ASNPNativeAd(xyz.adscope.ad.publish.ad.nativead.INativeAdItem r1, xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdapter r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.iNativeAdItem = r1
            r0.adapter = r2
            r0.ecpm = r3
            return
    }

    public static /* synthetic */ xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdapter access$000(xyz.adscope.amps.adapter.asnp.data.ASNPNativeAd r0) {
            xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdapter r0 = r0.adapter
            return r0
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
            xyz.adscope.ad.publish.ad.nativead.INativeAdItem r0 = r1.iNativeAdItem
            if (r0 == 0) goto L9
            android.view.View r0 = r0.getExpressView()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.amps.ad.nativead.inter.AMPSNativeAdExpressInfo
    public void render() {
            r2 = this;
            xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdapter r0 = r2.adapter
            if (r0 == 0) goto L7
            r0.onRender()
        L7:
            xyz.adscope.ad.publish.ad.nativead.INativeAdItem r0 = r2.iNativeAdItem
            if (r0 == 0) goto L10
            xyz.adscope.ad.publish.ad.nativead.INativeRenderListener r1 = r2.iNativeRenderListener
            r0.renderAdView(r1)
        L10:
            return
    }

    @Override // xyz.adscope.amps.ad.nativead.inter.AMPSNativeAdExpressInfo
    public void setAMPSNativeAdExpressListener(xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdExpressListener r3) {
            r2 = this;
            xyz.adscope.ad.publish.ad.nativead.INativeAdItem r0 = r2.iNativeAdItem
            if (r0 == 0) goto L1f
            xyz.adscope.amps.adapter.asnp.data.ASNPNativeAd$1 r0 = new xyz.adscope.amps.adapter.asnp.data.ASNPNativeAd$1
            r0.<init>(r2, r3)
            r2.iNativeRenderListener = r0
            xyz.adscope.ad.publish.ad.nativead.INativeAdItem r0 = r2.iNativeAdItem
            xyz.adscope.amps.adapter.asnp.data.ASNPNativeAd$2 r1 = new xyz.adscope.amps.adapter.asnp.data.ASNPNativeAd$2
            r1.<init>(r2, r3)
            r0.setInteractiveListener(r1)
            xyz.adscope.ad.publish.ad.nativead.INativeAdItem r0 = r2.iNativeAdItem
            xyz.adscope.amps.adapter.asnp.data.ASNPNativeAd$3 r1 = new xyz.adscope.amps.adapter.asnp.data.ASNPNativeAd$3
            r1.<init>(r2, r3)
            r0.setExpressListener(r1)
        L1f:
            return
    }
}
