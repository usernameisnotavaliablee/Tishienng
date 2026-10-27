package com.qq.e.ads.banner2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
class UnifiedBannerAD extends com.qq.e.ads.LiteAbstractAD<com.qq.e.comm.pi.UBVI> implements com.qq.e.comm.pi.NFBI, com.qq.e.comm.pi.IReward {
    private com.qq.e.ads.banner2.UnifiedBannerADListener i;
    private java.util.concurrent.atomic.AtomicInteger j;
    private int k;
    private com.qq.e.comm.constants.LoadAdParams l;
    private com.qq.e.ads.banner2.UnifiedBannerView m;
    private final com.qq.e.ads.banner2.ADListenerAdapter n;
    private volatile com.qq.e.ads.rewardvideo.ServerSideVerificationOptions o;

    UnifiedBannerAD(android.app.Activity r1, com.qq.e.ads.banner2.UnifiedBannerView r2, java.lang.String r3, com.qq.e.ads.banner2.UnifiedBannerADListener r4) {
            r0 = this;
            r0.<init>(r2, r4)
            r0.a(r1, r3)
            return
    }

    UnifiedBannerAD(android.app.Activity r1, com.qq.e.ads.banner2.UnifiedBannerView r2, java.lang.String r3, java.lang.String r4, com.qq.e.ads.banner2.UnifiedBannerADListener r5) {
            r0 = this;
            r0.<init>(r2, r5)
            r0.a(r1, r3, r4)
            return
    }

    private UnifiedBannerAD(com.qq.e.ads.banner2.UnifiedBannerView r3, com.qq.e.ads.banner2.UnifiedBannerADListener r4) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 0
            r0.<init>(r1)
            r2.j = r0
            r0 = 30
            r2.k = r0
            r0 = 0
            r2.l = r0
            r2.i = r4
            r2.m = r3
            com.qq.e.ads.banner2.ADListenerAdapter r3 = new com.qq.e.ads.banner2.ADListenerAdapter
            r3.<init>(r4)
            r2.n = r3
            return
    }

    @Override // com.qq.e.ads.AbstractAD
    protected /* bridge */ /* synthetic */ java.lang.Object a(android.content.Context r1, com.qq.e.comm.pi.POFactory r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r0 = this;
            com.qq.e.comm.pi.UBVI r1 = r0.b(r1, r2, r3, r4, r5)
            return r1
    }

    protected void a(com.qq.e.comm.pi.UBVI r2) {
            r1 = this;
            int r0 = r1.k
            r1.c(r0)
            com.qq.e.comm.constants.LoadAdParams r0 = r1.l
            r1.setLoadAdParams(r0)
            com.qq.e.ads.rewardvideo.ServerSideVerificationOptions r0 = r1.o
            r2.setServerSideVerificationOptions(r0)
        Lf:
            java.util.concurrent.atomic.AtomicInteger r2 = r1.j
            int r2 = r2.getAndDecrement()
            if (r2 <= 0) goto L1b
            r1.loadAD()
            goto Lf
        L1b:
            return
    }

    @Override // com.qq.e.ads.AbstractAD
    protected /* bridge */ /* synthetic */ void a(java.lang.Object r1) {
            r0 = this;
            com.qq.e.comm.pi.UBVI r1 = (com.qq.e.comm.pi.UBVI) r1
            r0.a(r1)
            return
    }

    protected com.qq.e.comm.pi.UBVI b(android.content.Context r8, com.qq.e.comm.pi.POFactory r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
            r7 = this;
            com.qq.e.ads.banner2.UnifiedBannerView r1 = r7.m
            r2 = r8
            android.app.Activity r2 = (android.app.Activity) r2
            com.qq.e.ads.banner2.ADListenerAdapter r6 = r7.n
            r0 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            com.qq.e.comm.pi.UBVI r8 = r0.getUnifiedBannerViewDelegate(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Override // com.qq.e.ads.AbstractAD
    protected void b(int r2) {
            r1 = this;
            com.qq.e.ads.banner2.UnifiedBannerADListener r0 = r1.i
            if (r0 == 0) goto Lb
            com.qq.e.comm.util.AdError r2 = com.qq.e.comm.util.AdErrorConvertor.formatErrorCode(r2)
            r0.onNoAD(r2)
        Lb:
            return
    }

    void c(int r2) {
            r1 = this;
            r1.k = r2
            T r0 = r1.a
            if (r0 == 0) goto Lb
            com.qq.e.comm.pi.UBVI r0 = (com.qq.e.comm.pi.UBVI) r0
            r0.setRefresh(r2)
        Lb:
            return
    }

    void destroy() {
            r1 = this;
            T r0 = r1.a
            if (r0 == 0) goto La
            com.qq.e.comm.pi.UBVI r0 = (com.qq.e.comm.pi.UBVI) r0
            r0.destroy()
            return
        La:
            java.lang.String r0 = "destroy"
            r1.a(r0)
            return
    }

    public java.lang.String getAdNetWorkName() {
            r1 = this;
            T r0 = r1.a
            if (r0 == 0) goto Lb
            com.qq.e.comm.pi.UBVI r0 = (com.qq.e.comm.pi.UBVI) r0
            java.lang.String r0 = r0.getAdNetWorkName()
            return r0
        Lb:
            java.lang.String r0 = "getAdNetWorkName"
            r1.a(r0)
            r0 = 0
            return r0
    }

    void loadAD() {
            r1 = this;
            boolean r0 = r1.a()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r1.b()
            if (r0 != 0) goto L13
            java.util.concurrent.atomic.AtomicInteger r0 = r1.j
            r0.incrementAndGet()
            return
        L13:
            T r0 = r1.a
            if (r0 == 0) goto L1d
            com.qq.e.comm.pi.UBVI r0 = (com.qq.e.comm.pi.UBVI) r0
            r0.fetchAd()
            return
        L1d:
            java.lang.String r0 = "loadAD"
            r1.a(r0)
            return
    }

    void onWindowFocusChanged(boolean r2) {
            r1 = this;
            T r0 = r1.a
            if (r0 == 0) goto L9
            com.qq.e.comm.pi.UBVI r0 = (com.qq.e.comm.pi.UBVI) r0
            r0.onWindowFocusChanged(r2)
        L9:
            return
    }

    void setLoadAdParams(com.qq.e.comm.constants.LoadAdParams r2) {
            r1 = this;
            r1.l = r2
            T r0 = r1.a
            if (r0 == 0) goto Lb
            com.qq.e.comm.pi.UBVI r0 = (com.qq.e.comm.pi.UBVI) r0
            r0.setLoadAdParams(r2)
        Lb:
            return
    }

    @Override // com.qq.e.comm.pi.NFBI
    public void setNegativeFeedbackListener(com.qq.e.comm.listeners.NegativeFeedbackListener r2) {
            r1 = this;
            com.qq.e.ads.banner2.ADListenerAdapter r0 = r1.n
            r0.setNegativeFeedbackListener(r2)
            return
    }

    @Override // com.qq.e.comm.pi.IReward
    public void setRewardListener(com.qq.e.comm.listeners.ADRewardListener r2) {
            r1 = this;
            com.qq.e.ads.banner2.ADListenerAdapter r0 = r1.n
            r0.setAdRewardListener(r2)
            return
    }

    @Override // com.qq.e.comm.pi.IReward
    public void setServerSideVerificationOptions(com.qq.e.ads.rewardvideo.ServerSideVerificationOptions r2) {
            r1 = this;
            r1.o = r2
            T r0 = r1.a
            if (r0 == 0) goto Lb
            com.qq.e.comm.pi.UBVI r0 = (com.qq.e.comm.pi.UBVI) r0
            r0.setServerSideVerificationOptions(r2)
        Lb:
            return
    }
}
