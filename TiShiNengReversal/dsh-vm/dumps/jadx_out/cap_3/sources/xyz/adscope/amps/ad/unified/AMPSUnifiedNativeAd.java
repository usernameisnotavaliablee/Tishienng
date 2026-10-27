package xyz.adscope.amps.ad.unified;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSUnifiedNativeAd extends xyz.adscope.amps.base.AMPSBaseAd<xyz.adscope.amps.ad.unified.AMPSUnifiedNativeLoadEventListener> {
    private final xyz.adscope.amps.ad.unified.AMPSUnifiedNativeLoadEventListener mListener;

    public AMPSUnifiedNativeAd(android.content.Context r1, xyz.adscope.amps.config.AMPSRequestParameters r2, xyz.adscope.amps.ad.unified.AMPSUnifiedNativeLoadEventListener r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.mListener = r3
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAd
    public xyz.adscope.amps.manager.AMPSBaseOpenApiManager getAMPSOpenApiManager() {
            r4 = this;
            xyz.adscope.amps.ad.unified.AMPSUnifiedNativeOpenApiManager r0 = new xyz.adscope.amps.ad.unified.AMPSUnifiedNativeOpenApiManager
            android.content.Context r1 = r4.mContext
            xyz.adscope.amps.config.AMPSRequestParameters r2 = r4.parameters
            xyz.adscope.amps.ad.unified.AMPSUnifiedNativeLoadEventListener r3 = r4.mListener
            r0.<init>(r1, r2, r3)
            return r0
    }

    public void pause() {
            r2 = this;
            xyz.adscope.amps.manager.AMPSBaseOpenApiManager r0 = r2.mAdLoadManager
            if (r0 != 0) goto L5
            goto L15
        L5:
            xyz.adscope.amps.base.AMPSBaseAdapter r0 = r0.getWinAdSourceAdapter()
            if (r0 != 0) goto Lc
            goto L15
        Lc:
            boolean r1 = r0 instanceof xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdapter
            if (r1 == 0) goto L15
            xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdapter r0 = (xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdapter) r0
            r0.pause()
        L15:
            return
    }

    public void resume() {
            r2 = this;
            xyz.adscope.amps.manager.AMPSBaseOpenApiManager r0 = r2.mAdLoadManager
            if (r0 != 0) goto L5
            goto L15
        L5:
            xyz.adscope.amps.base.AMPSBaseAdapter r0 = r0.getWinAdSourceAdapter()
            if (r0 != 0) goto Lc
            goto L15
        Lc:
            boolean r1 = r0 instanceof xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdapter
            if (r1 == 0) goto L15
            xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdapter r0 = (xyz.adscope.amps.ad.nativead.adapter.AMPSNativeAdapter) r0
            r0.resume()
        L15:
            return
    }
}
