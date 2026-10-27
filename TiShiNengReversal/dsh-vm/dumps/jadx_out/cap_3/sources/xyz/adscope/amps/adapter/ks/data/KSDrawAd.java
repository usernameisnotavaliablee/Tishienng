package xyz.adscope.amps.adapter.ks.data;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class KSDrawAd implements xyz.adscope.amps.ad.draw.inter.AMPSDrawAdExpressInfo {
    private xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdExpressListener mAMPSDrawAdExpressListener;
    private xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdVideoListener mAMPSDrawAdVideoListener;
    private android.content.Context mContext;
    private xyz.adscope.amps.adapter.ks.KSDrawAdapter mKSDrawAdapter;
    public com.kwad.sdk.api.KsDrawAd mKsDrawAd;


    public KSDrawAd(com.kwad.sdk.api.KsDrawAd r2, xyz.adscope.amps.adapter.ks.KSDrawAdapter r3, android.content.Context r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mAMPSDrawAdExpressListener = r0
            r1.mKsDrawAd = r2
            r1.mKSDrawAdapter = r3
            r1.mContext = r4
            return
    }

    public static /* synthetic */ xyz.adscope.amps.adapter.ks.KSDrawAdapter access$000(xyz.adscope.amps.adapter.ks.data.KSDrawAd r0) {
            xyz.adscope.amps.adapter.ks.KSDrawAdapter r0 = r0.mKSDrawAdapter
            return r0
    }

    public static /* synthetic */ xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdVideoListener access$100(xyz.adscope.amps.adapter.ks.data.KSDrawAd r0) {
            xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdVideoListener r0 = r0.mAMPSDrawAdVideoListener
            return r0
    }

    @Override // xyz.adscope.amps.ad.draw.inter.AMPSDrawAdExpressInfo
    public void destroy() {
            r0 = this;
            return
    }

    @Override // xyz.adscope.amps.ad.draw.inter.AMPSDrawAdExpressInfo
    public android.view.View getDrawView() {
            r2 = this;
            com.kwad.sdk.api.KsDrawAd r0 = r2.mKsDrawAd
            if (r0 == 0) goto Ld
            android.content.Context r1 = r2.mContext
            if (r1 == 0) goto Ld
            android.view.View r0 = r0.getDrawView(r1)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.amps.ad.draw.inter.AMPSDrawAdExpressInfo
    public void render() {
            r3 = this;
            com.kwad.sdk.api.KsDrawAd r0 = r3.mKsDrawAd
            if (r0 == 0) goto L23
            android.view.View r0 = r3.getDrawView()
            if (r0 != 0) goto Lb
            goto L23
        Lb:
            xyz.adscope.amps.adapter.ks.KSDrawAdapter r0 = r3.mKSDrawAdapter
            if (r0 == 0) goto L17
            r0.onRender()
            xyz.adscope.amps.adapter.ks.KSDrawAdapter r0 = r3.mKSDrawAdapter
            r0.onRenderSuccess()
        L17:
            xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdExpressListener r0 = r3.mAMPSDrawAdExpressListener
            if (r0 == 0) goto L23
            android.view.View r1 = r3.getDrawView()
            r2 = 0
            r0.onRenderSuccess(r1, r2, r2)
        L23:
            return
    }

    @Override // xyz.adscope.amps.ad.draw.inter.AMPSDrawAdExpressInfo
    public void setAMPSDrawAdExpressInfoListener(xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdExpressListener r3) {
            r2 = this;
            com.kwad.sdk.api.KsDrawAd r0 = r2.mKsDrawAd
            if (r0 != 0) goto L5
            return
        L5:
            r2.mAMPSDrawAdExpressListener = r3
            xyz.adscope.amps.adapter.ks.data.KSDrawAd$1 r1 = new xyz.adscope.amps.adapter.ks.data.KSDrawAd$1
            r1.<init>(r2, r3)
            r0.setAdInteractionListener(r1)
            return
    }

    @Override // xyz.adscope.amps.ad.draw.inter.AMPSDrawAdExpressInfo
    public void setAMPSDrawAdVideoListener(xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdVideoListener r1) {
            r0 = this;
            r0.mAMPSDrawAdVideoListener = r1
            return
    }
}
