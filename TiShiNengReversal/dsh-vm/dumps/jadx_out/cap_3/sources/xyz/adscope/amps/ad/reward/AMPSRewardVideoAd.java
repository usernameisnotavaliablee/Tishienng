package xyz.adscope.amps.ad.reward;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSRewardVideoAd extends xyz.adscope.amps.base.AMPSBaseAd implements xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener {


    public AMPSRewardVideoAd(android.content.Context r1, xyz.adscope.amps.config.AMPSRequestParameters r2, xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.loadEventListener = r3
            return
    }

    public void addPreLoadAdInfo() {
            r3 = this;
            xyz.adscope.amps.manager.AMPSBaseOpenApiManager r0 = r3.mAdPreLoadManager
            if (r0 == 0) goto L18
            java.lang.String r0 = r3.mSpaceId
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Ld
            goto L18
        Ld:
            xyz.adscope.amps.control.preload.AMPSPreLoad r0 = xyz.adscope.amps.control.preload.AMPSPreLoad.getInstance()
            java.lang.String r1 = r3.mSpaceId
            xyz.adscope.amps.manager.AMPSBaseOpenApiManager r2 = r3.mAdPreLoadManager
            r0.addPreLoadAdInfo(r1, r2)
        L18:
            return
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAd
    public xyz.adscope.amps.manager.AMPSBaseOpenApiManager getAMPSOpenApiManager() {
            r3 = this;
            xyz.adscope.amps.ad.reward.AMPSRewardVideoOpenApiManager r0 = new xyz.adscope.amps.ad.reward.AMPSRewardVideoOpenApiManager
            android.content.Context r1 = r3.mContext
            xyz.adscope.amps.config.AMPSRequestParameters r2 = r3.parameters
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // xyz.adscope.amps.base.AMPSBaseAd
    public xyz.adscope.amps.manager.AMPSBaseOpenApiManager getPreloadAMPSOpenApiManager() {
            r4 = this;
            xyz.adscope.amps.ad.reward.AMPSRewardVideoOpenApiManager r0 = new xyz.adscope.amps.ad.reward.AMPSRewardVideoOpenApiManager
            android.content.Context r1 = r4.mContext
            xyz.adscope.amps.config.AMPSRequestParameters r2 = r4.parameters
            xyz.adscope.amps.ad.reward.AMPSRewardVideoAd$1 r3 = new xyz.adscope.amps.ad.reward.AMPSRewardVideoAd$1
            r3.<init>(r4)
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener
    public void onAmpsAdCached() {
            r2 = this;
            xyz.adscope.amps.manager.inter.AMPSLoadEventListener r0 = r2.loadEventListener
            if (r0 == 0) goto Ld
            boolean r1 = r0 instanceof xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener
            if (r1 == 0) goto Ld
            xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener r0 = (xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener) r0
            r0.onAmpsAdCached()
        Ld:
            return
    }

    @Override // xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener
    public void onAmpsAdDismiss() {
            r0 = this;
            r0.onAdDismiss()
            return
    }

    @Override // xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener
    public void onAmpsAdFailed(xyz.adscope.amps.common.AMPSError r1) {
            r0 = this;
            r0.onAdFailed(r1)
            return
    }

    @Override // xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener
    public void onAmpsAdLoad() {
            r0 = this;
            r0.onAdLoaded()
            return
    }

    @Override // xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener
    public void onAmpsAdRewardArrived(boolean r3, int r4, java.util.Map<java.lang.String, java.lang.Object> r5) {
            r2 = this;
            xyz.adscope.amps.manager.inter.AMPSLoadEventListener r0 = r2.loadEventListener
            if (r0 == 0) goto Ld
            boolean r1 = r0 instanceof xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener
            if (r1 == 0) goto Ld
            xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener r0 = (xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener) r0
            r0.onAmpsAdRewardArrived(r3, r4, r5)
        Ld:
            return
    }

    @Override // xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener
    public void onAmpsAdShow() {
            r0 = this;
            r0.onAdShow()
            return
    }

    @Override // xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener
    public void onAmpsAdVideoClick() {
            r0 = this;
            r0.onAdClicked()
            return
    }

    @Override // xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener
    public void onAmpsAdVideoComplete() {
            r2 = this;
            xyz.adscope.amps.manager.inter.AMPSLoadEventListener r0 = r2.loadEventListener
            if (r0 == 0) goto Ld
            boolean r1 = r0 instanceof xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener
            if (r1 == 0) goto Ld
            xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener r0 = (xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener) r0
            r0.onAmpsAdVideoComplete()
        Ld:
            return
    }

    @Override // xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener
    public void onAmpsAdVideoError() {
            r2 = this;
            xyz.adscope.amps.manager.inter.AMPSLoadEventListener r0 = r2.loadEventListener
            if (r0 == 0) goto Ld
            boolean r1 = r0 instanceof xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener
            if (r1 == 0) goto Ld
            xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener r0 = (xyz.adscope.amps.ad.reward.AMPSRewardVideoLoadEventListener) r0
            r0.onAmpsAdVideoError()
        Ld:
            return
    }

    public void preLoad() {
            r1 = this;
            xyz.adscope.amps.manager.AMPSBaseOpenApiManager r0 = r1.mAdPreLoadManager
            if (r0 == 0) goto L5
            return
        L5:
            xyz.adscope.amps.manager.AMPSBaseOpenApiManager r0 = r1.getPreloadAMPSOpenApiManager()
            r1.mAdPreLoadManager = r0
            r0.startLoad()
            return
    }

    public void show(android.app.Activity r2) {
            r1 = this;
            xyz.adscope.amps.manager.AMPSBaseOpenApiManager r0 = r1.mAdLoadManager
            if (r0 != 0) goto L8
            r1.onAdFailed()
            return
        L8:
            r0.show(r2)
            return
    }
}
