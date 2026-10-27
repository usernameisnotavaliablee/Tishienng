package xyz.adscope.amps.adapter.csj.data;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class CSJNativeAd implements xyz.adscope.amps.ad.nativead.inter.AMPSNativeAdExpressInfo {
    private xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdapter adapter;
    private android.content.Context context;
    private int ecpm;
    public com.bytedance.sdk.openadsdk.TTNativeExpressAd ttNativeExpressAd;



    public CSJNativeAd(com.bytedance.sdk.openadsdk.TTNativeExpressAd r1, android.content.Context r2, xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdapter r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.ttNativeExpressAd = r1
            r0.context = r2
            r0.adapter = r3
            r0.ecpm = r4
            return
    }

    public static /* synthetic */ xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdapter access$000(xyz.adscope.amps.adapter.csj.data.CSJNativeAd r0) {
            xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdapter r0 = r0.adapter
            return r0
    }

    @Override // xyz.adscope.amps.ad.nativead.inter.AMPSNativeAdExpressInfo
    public void destroy() {
            r1 = this;
            com.bytedance.sdk.openadsdk.TTNativeExpressAd r0 = r1.ttNativeExpressAd     // Catch: java.lang.Exception -> La
            if (r0 == 0) goto L7
            r0.destroy()     // Catch: java.lang.Exception -> La
        L7:
            r0 = 0
            r1.ttNativeExpressAd = r0     // Catch: java.lang.Exception -> La
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
            com.bytedance.sdk.openadsdk.TTNativeExpressAd r0 = r1.ttNativeExpressAd
            if (r0 == 0) goto L9
            android.view.View r0 = r0.getExpressAdView()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.amps.ad.nativead.inter.AMPSNativeAdExpressInfo
    public void render() {
            r1 = this;
            xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdapter r0 = r1.adapter
            if (r0 == 0) goto L7
            r0.onRender()
        L7:
            com.bytedance.sdk.openadsdk.TTNativeExpressAd r0 = r1.ttNativeExpressAd
            if (r0 == 0) goto Le
            r0.render()
        Le:
            return
    }

    @Override // xyz.adscope.amps.ad.nativead.inter.AMPSNativeAdExpressInfo
    public void setAMPSNativeAdExpressListener(xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdExpressListener r4) {
            r3 = this;
            com.bytedance.sdk.openadsdk.TTNativeExpressAd r0 = r3.ttNativeExpressAd
            if (r0 == 0) goto L1e
            xyz.adscope.amps.adapter.csj.data.CSJNativeAd$1 r1 = new xyz.adscope.amps.adapter.csj.data.CSJNativeAd$1
            r1.<init>(r3, r4)
            r0.setExpressInteractionListener(r1)
            android.content.Context r0 = r3.context
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L1e
            com.bytedance.sdk.openadsdk.TTNativeExpressAd r1 = r3.ttNativeExpressAd
            android.app.Activity r0 = (android.app.Activity) r0
            xyz.adscope.amps.adapter.csj.data.CSJNativeAd$2 r2 = new xyz.adscope.amps.adapter.csj.data.CSJNativeAd$2
            r2.<init>(r3, r4)
            r1.setDislikeCallback(r0, r2)
        L1e:
            return
    }
}
