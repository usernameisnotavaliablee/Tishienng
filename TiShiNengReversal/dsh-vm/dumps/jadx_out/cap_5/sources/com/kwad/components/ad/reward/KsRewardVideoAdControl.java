package com.kwad.components.ad.reward;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class KsRewardVideoAdControl implements com.kwad.components.core.internal.api.a, com.kwad.sdk.api.KsRewardVideoAd {
    private com.kwad.components.core.internal.api.c bz;
    private final com.kwad.sdk.core.response.model.AdInfo mAdInfo;

    @androidx.annotation.NonNull
    private final com.kwad.sdk.core.response.model.AdResultData mAdResultData;

    @androidx.annotation.NonNull
    private final com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    public int rewardType;
    private final com.kwad.sdk.core.response.model.AdGlobalConfigInfo rr;
    private com.kwad.components.ad.reward.e.h rs;
    private com.kwad.components.core.j.d rt;


    public KsRewardVideoAdControl(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdResultData r2) {
            r1 = this;
            r1.<init>()
            com.kwad.components.core.internal.api.c r0 = new com.kwad.components.core.internal.api.c
            r0.<init>()
            r1.bz = r0
            r0 = 1
            r1.rewardType = r0
            r1.mAdResultData = r2
            com.kwad.sdk.core.response.model.AdTemplate r0 = com.kwad.sdk.core.response.b.c.r(r2)
            r1.mAdTemplate = r0
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            r1.mAdInfo = r0
            com.kwad.sdk.core.response.model.AdGlobalConfigInfo r2 = r2.adGlobalConfigInfo
            r1.rr = r2
            r1.gq()
            return
    }

    static /* synthetic */ com.kwad.components.core.internal.api.c a(com.kwad.components.ad.reward.KsRewardVideoAdControl r0) {
            com.kwad.components.core.internal.api.c r0 = r0.bz
            return r0
    }

    private void a(android.app.Activity r10, @androidx.annotation.NonNull com.kwad.sdk.api.KsVideoPlayConfig r11) {
            r9 = this;
            r9.gr()
            com.kwad.sdk.core.response.model.AdTemplate r0 = r9.mAdTemplate
            boolean r1 = r0.isNativeRewardPreview
            if (r1 == 0) goto L17
            com.kwad.sdk.core.response.model.AdResultData r11 = r9.mAdResultData
            com.kwad.sdk.core.response.model.AdInfo r1 = r9.mAdInfo
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.aS(r1)
            com.kwad.components.ad.reward.e.h r2 = r9.rs
            com.kwad.components.ad.reward.page.AdRewardPreviewActivityProxy.launch(r10, r11, r0, r1, r2)
            return
        L17:
            com.kwad.sdk.core.response.model.AdResultData r4 = r9.mAdResultData
            com.kwad.components.ad.reward.e.h r6 = r9.rs
            com.kwad.components.core.j.d r7 = r9.rt
            int r8 = r9.rewardType
            r3 = r10
            r5 = r11
            com.kwad.components.ad.reward.KSRewardVideoActivityProxy.launch(r3, r4, r5, r6, r7, r8)
            return
    }

    private void gq() {
            r5 = this;
            com.kwad.components.ad.i.b r0 = com.kwad.components.ad.i.b.fR()
            r0.a(r5)
            com.kwad.sdk.core.response.model.AdGlobalConfigInfo r0 = r5.rr
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L15
            boolean r0 = r0.isNeoScan()
            if (r0 == 0) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            com.kwad.sdk.core.response.model.AdTemplate r3 = r5.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r4 = r5.mAdInfo
            boolean r4 = com.kwad.sdk.core.response.b.a.cf(r4)
            if (r4 == 0) goto L23
            if (r0 != 0) goto L23
            r1 = 1
        L23:
            r3.isNativeRewardPreview = r1
            return
    }

    private void gr() {
            r2 = this;
            com.kwad.components.ad.reward.e.h r0 = r2.rs
            boolean r0 = com.kwad.components.ad.reward.c.c.a(r0)
            if (r0 != 0) goto L11
            com.kwad.sdk.core.response.model.AdInfo r0 = r2.mAdInfo
            if (r0 == 0) goto L11
            com.kwad.sdk.core.response.model.AdInfo$AdBaseInfo r0 = r0.adBaseInfo
            r1 = 0
            r0.extraClickReward = r1
        L11:
            return
    }

    @Override // com.kwad.components.core.internal.api.a
    public final void a(com.kwad.components.core.internal.api.b r2) {
            r1 = this;
            com.kwad.components.core.internal.api.c r0 = r1.bz
            r0.a(r2)
            return
    }

    @Override // com.kwad.components.core.internal.api.a
    public final void b(com.kwad.components.core.internal.api.b r2) {
            r1 = this;
            com.kwad.components.core.internal.api.c r0 = r1.bz
            r0.b(r2)
            return
    }

    @Override // com.kwad.components.core.internal.api.a
    public final com.kwad.sdk.core.response.model.AdTemplate getAdTemplate() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            return r0
    }

    @Override // com.kwad.sdk.api.KsRewardVideoAd
    public int getECPM() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            int r0 = com.kwad.sdk.core.response.b.a.aR(r0)
            return r0
    }

    @Override // com.kwad.sdk.api.KsRewardVideoAd
    public int getInteractionType() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            int r0 = com.kwad.sdk.core.response.b.a.aQ(r0)
            return r0
    }

    @Override // com.kwad.sdk.api.KsRewardVideoAd
    public java.util.List<com.kwad.sdk.api.model.KSAdInfoData> getKSAdInfoDatas() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.kwad.sdk.core.config.item.d r1 = com.kwad.sdk.core.config.c.aBw
            boolean r1 = com.kwad.sdk.core.config.e.a(r1)
            if (r1 == 0) goto L3d
            com.kwad.sdk.core.response.model.AdResultData r1 = r3.mAdResultData
            if (r1 == 0) goto L3d
            java.util.List r1 = r1.getAdTemplateList()
            int r1 = r1.size()
            if (r1 <= 0) goto L3d
            com.kwad.sdk.core.response.model.AdResultData r1 = r3.mAdResultData
            java.util.List r1 = r1.getAdTemplateList()
            java.util.Iterator r1 = r1.iterator()
        L25:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r1.next()
            com.kwad.sdk.core.response.model.AdTemplate r2 = (com.kwad.sdk.core.response.model.AdTemplate) r2
            com.kwad.sdk.core.response.model.AdInfo r2 = com.kwad.sdk.core.response.b.e.el(r2)
            com.kwad.sdk.api.model.KSAdInfoData r2 = com.kwad.sdk.core.response.b.a.dj(r2)
            r0.add(r2)
            goto L25
        L3d:
            return r0
    }

    @Override // com.kwad.sdk.api.KsRewardVideoAd
    public int getMaterialType() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            int r0 = com.kwad.sdk.core.response.b.a.be(r0)
            return r0
    }

    @Override // com.kwad.sdk.api.BaseKSAd
    public java.util.Map<java.lang.String, java.lang.Object> getMediaExtraInfo() {
            r3 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            boolean r1 = com.kwad.sdk.core.config.e.Ft()
            if (r1 == 0) goto L18
            com.kwad.sdk.core.response.model.AdTemplate r1 = r3.mAdTemplate
            long r1 = r1.llsid
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "llsid"
            r0.put(r2, r1)
        L18:
            return r0
    }

    @Override // com.kwad.sdk.api.KsRewardVideoAd
    public boolean isAdEnable() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            int r0 = com.kwad.sdk.core.response.b.e.eB(r0)
            if (r0 < 0) goto La
            r0 = 1
            return r0
        La:
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            boolean r0 = com.kwad.components.core.video.k.aL(r0)
            return r0
    }

    @Override // com.kwad.sdk.api.KsRewardVideoAd
    public void reportAdExposureFailed(int r2, com.kwad.sdk.api.model.AdExposureFailedReason r3) {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            com.kwad.sdk.core.adlog.c.a(r0, r2, r3)
            return
    }

    @Override // com.kwad.sdk.api.KsRewardVideoAd
    public void setBidEcpm(int r5) {
            r4 = this;
            long r0 = (long) r5
            r2 = -1
            r4.setBidEcpm(r0, r2)
            return
    }

    @Override // com.kwad.sdk.api.KsRewardVideoAd
    public void setBidEcpm(long r2, long r4) {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            r0.mBidEcpm = r2
            com.kwad.sdk.core.adlog.c.m(r0, r4)
            return
    }

    @Override // com.kwad.sdk.api.KsRewardVideoAd
    public void setInnerAdInteractionListener(com.kwad.sdk.api.KsInnerAd.KsInnerAdInteractionListener r2) {
            r1 = this;
            com.kwad.components.core.j.d r0 = new com.kwad.components.core.j.d
            r0.<init>(r2)
            r1.rt = r0
            return
    }

    @Override // com.kwad.sdk.api.KsRewardVideoAd
    public void setRewardAdInteractionListener(com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener r2) {
            r1 = this;
            com.kwad.components.ad.reward.e.h r0 = r1.rs
            if (r0 != 0) goto Lb
            com.kwad.components.ad.reward.KsRewardVideoAdControl$1 r0 = new com.kwad.components.ad.reward.KsRewardVideoAdControl$1
            r0.<init>(r1)
            r1.rs = r0
        Lb:
            com.kwad.components.ad.reward.e.h r0 = r1.rs
            r0.b(r2)
            return
    }

    @androidx.annotation.Keep
    public void setRewardPlayAgainInteractionListener(com.kwad.sdk.api.KsRewardVideoAd.RewardAdInteractionListener r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.sdk.api.KsRewardVideoAd
    public void showRewardVideoAd(android.app.Activity r4, com.kwad.sdk.api.KsVideoPlayConfig r5) {
            r3 = this;
            java.lang.String r0 = "KsRewardVideoAdControl"
            r1 = 1
            if (r4 == 0) goto L3e
            boolean r2 = r4.isFinishing()
            if (r2 == 0) goto Lc
            goto L3e
        Lc:
            com.kwad.sdk.core.response.model.AdTemplate r2 = r3.mAdTemplate
            com.kwad.components.ad.reward.monitor.c.h(r1, r2)
            com.kwad.sdk.core.response.model.AdTemplate r2 = r3.mAdTemplate
            com.kwad.sdk.commercial.d.c.bK(r2)
            boolean r2 = com.kwad.sdk.core.config.e.Gf()
            if (r2 != 0) goto L2f
            boolean r2 = r3.isAdEnable()
            if (r2 != 0) goto L2f
            java.lang.String r4 = "isAdEnable is false"
            com.kwad.sdk.core.d.c.i(r0, r4)
            com.kwad.sdk.core.response.model.AdTemplate r4 = r3.mAdTemplate
            java.lang.String r5 = "cache_not_ready"
            com.kwad.components.ad.reward.monitor.c.b(r1, r4, r5)
            return
        L2f:
            if (r5 != 0) goto L3a
            com.kwad.sdk.api.KsVideoPlayConfig$Builder r5 = new com.kwad.sdk.api.KsVideoPlayConfig$Builder
            r5.<init>()
            com.kwad.sdk.api.KsVideoPlayConfig r5 = r5.build()
        L3a:
            r3.a(r4, r5)
            return
        L3e:
            java.lang.String r4 = "showRewardVideoAd error, activity is null or finished"
            com.kwad.sdk.core.d.c.e(r0, r4)
            com.kwad.sdk.core.response.model.AdTemplate r4 = r3.mAdTemplate
            java.lang.String r5 = "illegal_activity"
            com.kwad.components.ad.reward.monitor.c.b(r1, r4, r5)
            return
    }

    @Override // com.kwad.components.core.internal.api.a
    public final boolean supportPushAd() {
            r1 = this;
            r0 = 1
            return r0
    }
}
