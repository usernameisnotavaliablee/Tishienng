package xyz.adscope.amps.adapter.ks.data;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class KSNativeAd implements xyz.adscope.amps.ad.nativead.inter.AMPSNativeAdExpressInfo {
    private xyz.adscope.amps.adapter.ks.KSNativeAdapter adapter;
    private android.content.Context context;
    private int ecpm;
    public com.kwad.sdk.api.KsFeedAd ksNativeExpressAd;
    private xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdExpressListener mAmpsNativeAdExpressListener;


    public KSNativeAd(com.kwad.sdk.api.KsFeedAd r2, xyz.adscope.amps.adapter.ks.KSNativeAdapter r3, android.content.Context r4, int r5) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mAmpsNativeAdExpressListener = r0
            r1.ksNativeExpressAd = r2
            r1.adapter = r3
            r1.context = r4
            r1.ecpm = r5
            return
    }

    public static /* synthetic */ xyz.adscope.amps.adapter.ks.KSNativeAdapter access$000(xyz.adscope.amps.adapter.ks.data.KSNativeAd r0) {
            xyz.adscope.amps.adapter.ks.KSNativeAdapter r0 = r0.adapter
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
            r2 = this;
            com.kwad.sdk.api.KsFeedAd r0 = r2.ksNativeExpressAd
            if (r0 == 0) goto Ld
            android.content.Context r1 = r2.context
            if (r1 == 0) goto Ld
            android.view.View r0 = r0.getFeedView(r1)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.amps.ad.nativead.inter.AMPSNativeAdExpressInfo
    public void render() {
            r3 = this;
            com.kwad.sdk.api.KsFeedAd r0 = r3.ksNativeExpressAd
            if (r0 == 0) goto L23
            android.view.View r0 = r3.getNativeExpressAdView()
            if (r0 != 0) goto Lb
            goto L23
        Lb:
            xyz.adscope.amps.adapter.ks.KSNativeAdapter r0 = r3.adapter
            if (r0 == 0) goto L17
            r0.onRender()
            xyz.adscope.amps.adapter.ks.KSNativeAdapter r0 = r3.adapter
            r0.onRenderSuccess()
        L17:
            xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdExpressListener r0 = r3.mAmpsNativeAdExpressListener
            if (r0 == 0) goto L23
            android.view.View r1 = r3.getNativeExpressAdView()
            r2 = 0
            r0.onRenderSuccess(r1, r2, r2)
        L23:
            return
    }

    @Override // xyz.adscope.amps.ad.nativead.inter.AMPSNativeAdExpressInfo
    public void setAMPSNativeAdExpressListener(xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdExpressListener r3) {
            r2 = this;
            com.kwad.sdk.api.KsFeedAd r0 = r2.ksNativeExpressAd
            if (r0 != 0) goto L5
            return
        L5:
            r2.mAmpsNativeAdExpressListener = r3
            xyz.adscope.amps.adapter.ks.data.KSNativeAd$1 r1 = new xyz.adscope.amps.adapter.ks.data.KSNativeAd$1
            r1.<init>(r2, r3)
            r0.setAdInteractionListener(r1)
            return
    }
}
