package xyz.adscope.amps.adapter.bd.data;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class BDNativeAd implements xyz.adscope.amps.ad.nativead.inter.AMPSNativeAdExpressInfo {
    public xyz.adscope.amps.adapter.bd.BDNativeAdapter adapter;
    private int ecpm;
    public com.baidu.mobads.sdk.api.ExpressResponse mExpressResponse;



    public BDNativeAd(com.baidu.mobads.sdk.api.ExpressResponse r1, xyz.adscope.amps.adapter.bd.BDNativeAdapter r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.mExpressResponse = r1
            r0.adapter = r2
            r0.ecpm = r3
            return
    }

    @Override // xyz.adscope.amps.ad.nativead.inter.AMPSNativeAdExpressInfo
    public void destroy() {
            r1 = this;
            r0 = 0
            r1.mExpressResponse = r0
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
            com.baidu.mobads.sdk.api.ExpressResponse r0 = r1.mExpressResponse
            if (r0 == 0) goto L11
            boolean r0 = r0.isAdAvailable()
            if (r0 == 0) goto L11
            com.baidu.mobads.sdk.api.ExpressResponse r0 = r1.mExpressResponse
            android.view.View r0 = r0.getExpressAdView()
            return r0
        L11:
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.amps.ad.nativead.inter.AMPSNativeAdExpressInfo
    public void render() {
            r1 = this;
            xyz.adscope.amps.adapter.bd.BDNativeAdapter r0 = r1.adapter
            if (r0 == 0) goto L7
            r0.onRender()
        L7:
            com.baidu.mobads.sdk.api.ExpressResponse r0 = r1.mExpressResponse
            if (r0 == 0) goto Le
            r0.render()
        Le:
            return
    }

    @Override // xyz.adscope.amps.ad.nativead.inter.AMPSNativeAdExpressInfo
    public void setAMPSNativeAdExpressListener(xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdExpressListener r3) {
            r2 = this;
            com.baidu.mobads.sdk.api.ExpressResponse r0 = r2.mExpressResponse
            if (r0 != 0) goto L5
            return
        L5:
            xyz.adscope.amps.adapter.bd.data.BDNativeAd$1 r1 = new xyz.adscope.amps.adapter.bd.data.BDNativeAd$1
            r1.<init>(r2, r3)
            r0.setInteractionListener(r1)
            com.baidu.mobads.sdk.api.ExpressResponse r0 = r2.mExpressResponse
            xyz.adscope.amps.adapter.bd.data.BDNativeAd$2 r1 = new xyz.adscope.amps.adapter.bd.data.BDNativeAd$2
            r1.<init>(r2, r3)
            r0.setAdDislikeListener(r1)
            return
    }
}
