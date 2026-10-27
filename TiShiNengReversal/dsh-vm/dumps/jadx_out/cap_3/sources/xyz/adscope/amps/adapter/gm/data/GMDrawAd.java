package xyz.adscope.amps.adapter.gm.data;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class GMDrawAd implements xyz.adscope.amps.ad.draw.inter.AMPSDrawAdExpressInfo {
    private xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapter adapter;
    private android.content.Context context;
    public com.bytedance.sdk.openadsdk.TTDrawFeedAd mTTDrawFeedAd;





    public GMDrawAd(com.bytedance.sdk.openadsdk.TTDrawFeedAd r1, android.content.Context r2, xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapter r3) {
            r0 = this;
            r0.<init>()
            r0.mTTDrawFeedAd = r1
            r0.context = r2
            r0.adapter = r3
            return
    }

    public static /* synthetic */ xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapter access$000(xyz.adscope.amps.adapter.gm.data.GMDrawAd r0) {
            xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapter r0 = r0.adapter
            return r0
    }

    @Override // xyz.adscope.amps.ad.draw.inter.AMPSDrawAdExpressInfo
    public void destroy() {
            r1 = this;
            com.bytedance.sdk.openadsdk.TTDrawFeedAd r0 = r1.mTTDrawFeedAd     // Catch: java.lang.Exception -> La
            if (r0 == 0) goto L7
            r0.destroy()     // Catch: java.lang.Exception -> La
        L7:
            r0 = 0
            r1.mTTDrawFeedAd = r0     // Catch: java.lang.Exception -> La
        La:
            return
    }

    @Override // xyz.adscope.amps.ad.draw.inter.AMPSDrawAdExpressInfo
    public android.view.View getDrawView() {
            r1 = this;
            com.bytedance.sdk.openadsdk.TTDrawFeedAd r0 = r1.mTTDrawFeedAd
            if (r0 == 0) goto L9
            android.view.View r0 = r0.getAdView()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.amps.ad.draw.inter.AMPSDrawAdExpressInfo
    public void render() {
            r1 = this;
            xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapter r0 = r1.adapter
            if (r0 == 0) goto L7
            r0.onRender()
        L7:
            com.bytedance.sdk.openadsdk.TTDrawFeedAd r0 = r1.mTTDrawFeedAd
            if (r0 == 0) goto Le
            r0.render()
        Le:
            return
    }

    @Override // xyz.adscope.amps.ad.draw.inter.AMPSDrawAdExpressInfo
    public void setAMPSDrawAdExpressInfoListener(xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdExpressListener r4) {
            r3 = this;
            com.bytedance.sdk.openadsdk.TTDrawFeedAd r0 = r3.mTTDrawFeedAd
            if (r0 != 0) goto L5
            goto L29
        L5:
            xyz.adscope.amps.adapter.gm.data.GMDrawAd$1 r1 = new xyz.adscope.amps.adapter.gm.data.GMDrawAd$1
            r1.<init>(r3, r4)
            r0.setExpressRenderListener(r1)
            com.bytedance.sdk.openadsdk.TTDrawFeedAd r0 = r3.mTTDrawFeedAd
            xyz.adscope.amps.adapter.gm.data.GMDrawAd$2 r1 = new xyz.adscope.amps.adapter.gm.data.GMDrawAd$2
            r1.<init>(r3)
            r0.setDrawVideoListener(r1)
            android.content.Context r0 = r3.context
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L29
            com.bytedance.sdk.openadsdk.TTDrawFeedAd r1 = r3.mTTDrawFeedAd
            android.app.Activity r0 = (android.app.Activity) r0
            xyz.adscope.amps.adapter.gm.data.GMDrawAd$3 r2 = new xyz.adscope.amps.adapter.gm.data.GMDrawAd$3
            r2.<init>(r3, r4)
            r1.setDislikeCallback(r0, r2)
        L29:
            return
    }

    @Override // xyz.adscope.amps.ad.draw.inter.AMPSDrawAdExpressInfo
    public void setAMPSDrawAdVideoListener(xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdVideoListener r3) {
            r2 = this;
            com.bytedance.sdk.openadsdk.TTDrawFeedAd r0 = r2.mTTDrawFeedAd
            if (r0 != 0) goto L5
            return
        L5:
            xyz.adscope.amps.adapter.gm.data.GMDrawAd$4 r1 = new xyz.adscope.amps.adapter.gm.data.GMDrawAd$4
            r1.<init>(r2, r3)
            r0.setVideoAdListener(r1)
            return
    }
}
