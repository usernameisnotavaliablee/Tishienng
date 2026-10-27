package xyz.adscope.amps.adapter.csj.data;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class CSJDrawAd implements xyz.adscope.amps.ad.draw.inter.AMPSDrawAdExpressInfo {
    private xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapter adapter;
    private android.content.Context context;
    public com.bytedance.sdk.openadsdk.TTNativeExpressAd mTTNativeExpressAd;




    public CSJDrawAd(com.bytedance.sdk.openadsdk.TTNativeExpressAd r1, android.content.Context r2, xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapter r3) {
            r0 = this;
            r0.<init>()
            r0.mTTNativeExpressAd = r1
            r0.context = r2
            r0.adapter = r3
            return
    }

    public static /* synthetic */ xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapter access$000(xyz.adscope.amps.adapter.csj.data.CSJDrawAd r0) {
            xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdAdapter r0 = r0.adapter
            return r0
    }

    @Override // xyz.adscope.amps.ad.draw.inter.AMPSDrawAdExpressInfo
    public void destroy() {
            r1 = this;
            com.bytedance.sdk.openadsdk.TTNativeExpressAd r0 = r1.mTTNativeExpressAd     // Catch: java.lang.Exception -> La
            if (r0 == 0) goto L7
            r0.destroy()     // Catch: java.lang.Exception -> La
        L7:
            r0 = 0
            r1.mTTNativeExpressAd = r0     // Catch: java.lang.Exception -> La
        La:
            return
    }

    @Override // xyz.adscope.amps.ad.draw.inter.AMPSDrawAdExpressInfo
    public android.view.View getDrawView() {
            r1 = this;
            com.bytedance.sdk.openadsdk.TTNativeExpressAd r0 = r1.mTTNativeExpressAd
            if (r0 == 0) goto L9
            android.view.View r0 = r0.getExpressAdView()
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
            com.bytedance.sdk.openadsdk.TTNativeExpressAd r0 = r1.mTTNativeExpressAd
            if (r0 == 0) goto Le
            r0.render()
        Le:
            return
    }

    @Override // xyz.adscope.amps.ad.draw.inter.AMPSDrawAdExpressInfo
    public void setAMPSDrawAdExpressInfoListener(xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdExpressListener r4) {
            r3 = this;
            com.bytedance.sdk.openadsdk.TTNativeExpressAd r0 = r3.mTTNativeExpressAd
            if (r0 != 0) goto L5
            goto L1f
        L5:
            xyz.adscope.amps.adapter.csj.data.CSJDrawAd$1 r1 = new xyz.adscope.amps.adapter.csj.data.CSJDrawAd$1
            r1.<init>(r3, r4)
            r0.setExpressInteractionListener(r1)
            android.content.Context r0 = r3.context
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L1f
            com.bytedance.sdk.openadsdk.TTNativeExpressAd r1 = r3.mTTNativeExpressAd
            android.app.Activity r0 = (android.app.Activity) r0
            xyz.adscope.amps.adapter.csj.data.CSJDrawAd$2 r2 = new xyz.adscope.amps.adapter.csj.data.CSJDrawAd$2
            r2.<init>(r3, r4)
            r1.setDislikeCallback(r0, r2)
        L1f:
            return
    }

    @Override // xyz.adscope.amps.ad.draw.inter.AMPSDrawAdExpressInfo
    public void setAMPSDrawAdVideoListener(xyz.adscope.amps.ad.draw.adapter.AMPSDrawAdVideoListener r3) {
            r2 = this;
            com.bytedance.sdk.openadsdk.TTNativeExpressAd r0 = r2.mTTNativeExpressAd
            if (r0 != 0) goto L5
            return
        L5:
            xyz.adscope.amps.adapter.csj.data.CSJDrawAd$3 r1 = new xyz.adscope.amps.adapter.csj.data.CSJDrawAd$3
            r1.<init>(r2, r3)
            r0.setVideoAdListener(r1)
            return
    }
}
