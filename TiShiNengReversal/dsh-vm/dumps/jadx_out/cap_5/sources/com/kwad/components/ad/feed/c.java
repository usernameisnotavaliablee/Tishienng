package com.kwad.components.ad.feed;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c extends com.kwad.sdk.api.core.AbstractKsFeedAd implements com.kwad.components.core.internal.api.a {
    private final com.kwad.sdk.api.KsAdVideoPlayConfig bU;
    private com.kwad.components.core.internal.api.c bz;
    private com.kwad.sdk.core.j.b dn;
    private com.kwad.sdk.api.KsFeedAd.AdInteractionListener gI;
    private com.kwad.components.core.widget.b gJ;
    private com.kwad.components.ad.feed.widget.r gK;
    private boolean gL;
    private java.util.concurrent.atomic.AtomicBoolean gM;
    private java.util.concurrent.atomic.AtomicBoolean gN;
    private java.util.concurrent.atomic.AtomicInteger gO;
    private final com.kwad.sdk.core.response.model.AdInfo mAdInfo;

    @androidx.annotation.NonNull
    private final com.kwad.sdk.core.response.model.AdResultData mAdResultData;

    @androidx.annotation.NonNull
    private final com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;







    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void d(int r1, java.lang.String r2);
    }

    public c(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdResultData r3, boolean r4) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.gM = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            r2.gN = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 2
            r0.<init>(r1)
            r2.gO = r0
            com.kwad.components.core.internal.api.c r0 = new com.kwad.components.core.internal.api.c
            r0.<init>()
            r2.bz = r0
            com.kwad.components.ad.feed.c$1 r0 = new com.kwad.components.ad.feed.c$1
            r0.<init>(r2)
            r2.dn = r0
            r2.mAdResultData = r3
            com.kwad.sdk.core.response.model.AdTemplate r3 = com.kwad.sdk.core.response.b.c.r(r3)
            r2.mAdTemplate = r3
            r0 = 1
            r3.mInitVoiceStatus = r0
            com.kwad.sdk.core.response.model.AdInfo r3 = com.kwad.sdk.core.response.b.e.el(r3)
            r2.mAdInfo = r3
            r2.gL = r4
            com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl r3 = new com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl
            r3.<init>()
            r2.bU = r3
            com.kwad.components.ad.i.b r3 = com.kwad.components.ad.i.b.fR()
            r3.a(r2)
            return
    }

    @androidx.annotation.Nullable
    private com.kwad.components.core.widget.b<?, ?> C(android.content.Context r8) {
            r7 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r7.mAdTemplate
            com.kwad.sdk.internal.api.SceneImpl r0 = r0.mAdScene
            int r0 = r0.getWidth()
            double r1 = (double) r0
            com.kwad.sdk.core.config.item.f r3 = com.kwad.sdk.core.config.c.aBm
            double r3 = com.kwad.sdk.core.config.e.a(r3)
            int r5 = com.kwad.sdk.utils.m.getScreenWidth(r8)
            double r5 = (double) r5
            double r3 = r3 * r5
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L28
            long r1 = (long) r0
            com.kwad.sdk.core.response.model.AdInfo r3 = r7.mAdInfo
            int r3 = com.kwad.sdk.core.response.b.a.be(r3)
            com.kwad.sdk.core.response.model.AdTemplate r4 = r7.mAdTemplate
            int r5 = r4.type
            com.kwad.components.ad.feed.monitor.b.a(r1, r3, r5, r4)
        L28:
            com.kwad.sdk.core.response.model.AdTemplate r1 = r7.mAdTemplate
            boolean r1 = com.kwad.sdk.core.response.b.b.dd(r1)
            if (r1 == 0) goto L48
            com.kwad.components.ad.feed.widget.r r1 = new com.kwad.components.ad.feed.widget.r
            android.content.Context r2 = com.kwad.sdk.o.m.wrapContextIfNeed(r8)
            r1.<init>(r2)
            r7.gK = r1
            r1.setWidth(r0)
            com.kwad.components.ad.feed.widget.r r0 = r7.gK
            com.kwad.sdk.api.KsAdVideoPlayConfig r1 = r7.bU
            r0.setVideoPlayConfig(r1)
            com.kwad.components.ad.feed.widget.r r0 = r7.gK
            goto L81
        L48:
            boolean r1 = r7.gL
            if (r1 == 0) goto L6d
            com.kwad.sdk.core.response.model.AdTemplate r1 = r7.mAdTemplate
            boolean r1 = com.kwad.sdk.core.response.b.b.dc(r1)
            if (r1 == 0) goto L6d
            android.content.Context r8 = com.kwad.sdk.o.m.wrapContextIfNeed(r8)     // Catch: java.lang.Throwable -> L67
            com.kwad.components.ad.feed.widget.q r1 = new com.kwad.components.ad.feed.widget.q     // Catch: java.lang.Throwable -> L67
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L67
            r1.setWidth(r0)     // Catch: java.lang.Throwable -> L67
            com.kwad.sdk.api.KsAdVideoPlayConfig r0 = r7.bU     // Catch: java.lang.Throwable -> L67
            r1.setVideoPlayConfig(r0)     // Catch: java.lang.Throwable -> L67
            r0 = r1
            goto L81
        L67:
            r0 = move-exception
            com.kwad.sdk.core.d.c.printStackTraceOnly(r0)
            r0 = 0
            goto L81
        L6d:
            com.kwad.sdk.core.response.model.AdInfo r0 = r7.mAdInfo
            int r0 = com.kwad.sdk.core.response.b.a.be(r0)
            com.kwad.sdk.core.response.model.AdTemplate r1 = r7.mAdTemplate
            int r2 = r1.type
            int r1 = r1.defaultType
            com.kwad.components.model.FeedType r1 = com.kwad.components.model.FeedType.fromInt(r2, r1)
            com.kwad.components.core.widget.b r0 = com.kwad.components.ad.feed.b.a(r8, r1, r0)
        L81:
            if (r0 == 0) goto L95
            boolean r1 = r0 instanceof com.kwad.components.ad.feed.widget.r
            if (r1 != 0) goto L90
            r1 = 1098907648(0x41800000, float:16.0)
            int r8 = com.kwad.sdk.c.a.a.a(r8, r1)
            r0.setMargin(r8)
        L90:
            com.kwad.sdk.core.j.b r8 = r7.dn
            r0.setPageExitListener(r8)
        L95:
            return r0
    }

    static /* synthetic */ com.kwad.components.core.internal.api.c a(com.kwad.components.ad.feed.c r0) {
            com.kwad.components.core.internal.api.c r0 = r0.bz
            return r0
    }

    static /* synthetic */ void a(com.kwad.components.ad.feed.c r0, com.kwad.components.core.widget.b r1, boolean r2) {
            r2 = 0
            r0.a(r1, r2)
            return
    }

    private void a(com.kwad.components.core.widget.b r2, boolean r3) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            com.kwad.components.ad.feed.c$6 r0 = new com.kwad.components.ad.feed.c$6
            r0.<init>(r1, r3, r2)
            r2.setInnerAdInteractionListener(r0)
            return
    }

    static /* synthetic */ com.kwad.components.core.widget.b b(com.kwad.components.ad.feed.c r0) {
            com.kwad.components.core.widget.b r0 = r0.gJ
            return r0
    }

    private void bX() {
            r4 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r4.mAdTemplate
            if (r0 == 0) goto L1d
            com.kwad.sdk.core.diskcache.b.a r0 = com.kwad.sdk.core.diskcache.b.a.GP()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "feed_ad_cache_"
            r1.<init>(r2)
            com.kwad.sdk.core.response.model.AdTemplate r2 = r4.mAdTemplate
            long r2 = r2.posId
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.remove(r1)
        L1d:
            return
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate c(com.kwad.components.ad.feed.c r0) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdInfo d(com.kwad.components.ad.feed.c r0) {
            com.kwad.sdk.core.response.model.AdInfo r0 = r0.mAdInfo
            return r0
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicInteger e(com.kwad.components.ad.feed.c r0) {
            java.util.concurrent.atomic.AtomicInteger r0 = r0.gO
            return r0
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f(com.kwad.components.ad.feed.c r0) {
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.gN
            return r0
    }

    static /* synthetic */ com.kwad.sdk.api.KsFeedAd.AdInteractionListener g(com.kwad.components.ad.feed.c r0) {
            com.kwad.sdk.api.KsFeedAd$AdInteractionListener r0 = r0.gI
            return r0
    }

    private boolean isVideoSoundEnable() {
            r2 = this;
            com.kwad.sdk.api.KsAdVideoPlayConfig r0 = r2.bU
            boolean r1 = r0 instanceof com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl
            if (r1 == 0) goto L13
            com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl r0 = (com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl) r0
            int r1 = r0.getVideoSoundValue()
            if (r1 == 0) goto L13
            boolean r0 = r0.isVideoSoundEnable()
            return r0
        L13:
            com.kwad.sdk.core.response.model.AdInfo r0 = r2.mAdInfo
            boolean r0 = com.kwad.sdk.core.response.b.a.ca(r0)
            return r0
    }

    public final void a(@androidx.annotation.NonNull com.kwad.components.ad.feed.c.a r4) {
            r3 = this;
            android.content.Context r0 = com.kwad.sdk.service.ServiceProvider.getContext()
            com.kwad.sdk.core.response.model.AdTemplate r1 = r3.mAdTemplate
            r2 = 2
            r1.loadType = r2
            java.util.concurrent.atomic.AtomicBoolean r1 = r3.gM
            r2 = 1
            r1.set(r2)
            com.kwad.components.core.widget.b r0 = r3.C(r0)
            r3.gJ = r0
            if (r0 == 0) goto L61
            boolean r1 = r0 instanceof com.kwad.components.ad.feed.widget.q
            if (r1 == 0) goto L2b
            com.kwad.components.ad.feed.widget.q r0 = (com.kwad.components.ad.feed.widget.q) r0
            com.kwad.components.ad.feed.c$4 r1 = new com.kwad.components.ad.feed.c$4
            r1.<init>(r3, r4)
            r0.setPreloadListener(r1)
            com.kwad.sdk.core.response.model.AdResultData r4 = r3.mAdResultData
            r0.d(r4)
            return
        L2b:
            boolean r1 = r0 instanceof com.kwad.components.ad.feed.widget.r
            if (r1 == 0) goto L3f
            com.kwad.components.ad.feed.widget.r r0 = (com.kwad.components.ad.feed.widget.r) r0
            com.kwad.components.ad.feed.c$5 r1 = new com.kwad.components.ad.feed.c$5
            r1.<init>(r3, r4)
            r0.setTKLoadListener(r1)
            com.kwad.sdk.core.response.model.AdResultData r4 = r3.mAdResultData
            r0.d(r4)
            return
        L3f:
            com.kwad.sdk.core.response.model.AdResultData r1 = r3.mAdResultData
            r0.d(r1)
            com.kwad.components.core.widget.b r0 = r3.gJ
            boolean r1 = r0 instanceof com.kwad.components.ad.feed.widget.c
            if (r1 == 0) goto L51
            com.kwad.components.ad.feed.widget.c r0 = (com.kwad.components.ad.feed.widget.c) r0
            com.kwad.sdk.api.KsAdVideoPlayConfig r1 = r3.bU
            r0.b(r1)
        L51:
            com.kwad.components.core.widget.b r0 = r3.gJ
            r3.a(r0, r2)
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.gN
            r0.set(r2)
            java.lang.String r0 = ""
            r4.d(r2, r0)
            return
        L61:
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.gN
            r1 = 0
            r0.set(r1)
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.gM
            r0.set(r1)
            java.lang.String r0 = "render Failed"
            r4.d(r2, r0)
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

    @Override // com.kwad.sdk.api.KsFeedAd
    public final int getECPM() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            int r0 = com.kwad.sdk.core.response.b.a.aR(r0)
            return r0
    }

    @Override // com.kwad.sdk.api.core.AbstractKsFeedAd
    public final android.view.View getFeedView2(android.content.Context r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L79
            com.kwad.sdk.l r1 = com.kwad.sdk.l.Cf()
            boolean r1 = r1.Bn()
            if (r1 != 0) goto Le
            goto L79
        Le:
            android.content.Context r4 = com.kwad.sdk.o.m.wrapContextIfNeed(r4)     // Catch: java.lang.Throwable -> L31
            com.kwad.sdk.core.response.model.AdTemplate r1 = r3.mAdTemplate     // Catch: java.lang.Throwable -> L31
            com.kwad.sdk.commercial.d.c.bK(r1)     // Catch: java.lang.Throwable -> L31
            com.kwad.components.core.widget.b r1 = r3.gJ     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L36
            android.view.ViewParent r4 = r1.getParent()     // Catch: java.lang.Throwable -> L31 java.lang.NullPointerException -> L33
            boolean r4 = r4 instanceof android.view.ViewGroup     // Catch: java.lang.Throwable -> L31 java.lang.NullPointerException -> L33
            if (r4 == 0) goto L33
            com.kwad.components.core.widget.b r4 = r3.gJ     // Catch: java.lang.Throwable -> L31 java.lang.NullPointerException -> L33
            android.view.ViewParent r4 = r4.getParent()     // Catch: java.lang.Throwable -> L31 java.lang.NullPointerException -> L33
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4     // Catch: java.lang.Throwable -> L31 java.lang.NullPointerException -> L33
            com.kwad.components.core.widget.b r1 = r3.gJ     // Catch: java.lang.Throwable -> L31 java.lang.NullPointerException -> L33
            r4.removeView(r1)     // Catch: java.lang.Throwable -> L31 java.lang.NullPointerException -> L33
            goto L33
        L31:
            r4 = move-exception
            goto L6a
        L33:
            com.kwad.components.core.widget.b r4 = r3.gJ     // Catch: java.lang.Throwable -> L31
            return r4
        L36:
            r3.bX()     // Catch: java.lang.Throwable -> L31
            com.kwad.sdk.core.response.model.AdTemplate r1 = r3.mAdTemplate     // Catch: java.lang.Throwable -> L31
            r2 = 1
            r1.loadType = r2     // Catch: java.lang.Throwable -> L31
            com.kwad.components.core.widget.b r4 = r3.C(r4)     // Catch: java.lang.Throwable -> L31
            r3.gJ = r4     // Catch: java.lang.Throwable -> L31
            if (r4 != 0) goto L47
            return r0
        L47:
            com.kwad.sdk.core.response.model.AdResultData r1 = r3.mAdResultData     // Catch: java.lang.Throwable -> L31
            r4.d(r1)     // Catch: java.lang.Throwable -> L31
            com.kwad.components.core.widget.b r4 = r3.gJ     // Catch: java.lang.Throwable -> L31
            boolean r1 = r4 instanceof com.kwad.components.ad.feed.widget.c     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L59
            com.kwad.components.ad.feed.widget.c r4 = (com.kwad.components.ad.feed.widget.c) r4     // Catch: java.lang.Throwable -> L31
            com.kwad.sdk.api.KsAdVideoPlayConfig r1 = r3.bU     // Catch: java.lang.Throwable -> L31
            r4.b(r1)     // Catch: java.lang.Throwable -> L31
        L59:
            com.kwad.components.core.widget.b r4 = r3.gJ     // Catch: java.lang.Throwable -> L31
            boolean r1 = r4 instanceof com.kwad.components.ad.feed.widget.q     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L64
            r1 = 0
            r3.a(r4, r1)     // Catch: java.lang.Throwable -> L31
            goto L67
        L64:
            r3.a(r4, r2)     // Catch: java.lang.Throwable -> L31
        L67:
            com.kwad.components.core.widget.b r4 = r3.gJ     // Catch: java.lang.Throwable -> L31
            return r4
        L6a:
            com.kwad.sdk.l r1 = com.kwad.sdk.l.Cf()
            boolean r1 = r1.Bk()
            if (r1 == 0) goto L78
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r4)
            return r0
        L78:
            throw r4
        L79:
            return r0
    }

    @Override // com.kwad.sdk.api.KsFeedAd
    public final int getInteractionType() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            int r0 = com.kwad.sdk.core.response.b.a.aQ(r0)
            return r0
    }

    @Override // com.kwad.sdk.api.KsFeedAd
    public final int getMaterialType() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            int r0 = com.kwad.sdk.core.response.b.a.be(r0)
            return r0
    }

    @Override // com.kwad.sdk.api.BaseKSAd
    public final java.util.Map<java.lang.String, java.lang.Object> getMediaExtraInfo() {
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

    @Override // com.kwad.sdk.api.KsFeedAd
    public final void render(com.kwad.sdk.api.KsFeedAd.AdRenderListener r8) {
            r7 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r7.mAdTemplate
            com.kwad.components.ad.feed.monitor.b.n(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.gN
            boolean r0 = r0.get()
            if (r0 == 0) goto L2f
            com.kwad.components.core.widget.b r0 = r7.gJ
            if (r0 != 0) goto L26
            com.kwad.sdk.core.network.e r0 = com.kwad.sdk.core.network.e.aEv
            int r1 = r0.errorCode
            java.lang.String r0 = r0.msg
            r8.onAdRenderFailed(r1, r0)
            java.util.concurrent.atomic.AtomicBoolean r8 = r7.gN
            r0 = 0
            r8.set(r0)
            java.util.concurrent.atomic.AtomicBoolean r8 = r7.gM
            r8.set(r0)
            return
        L26:
            com.kwad.components.ad.feed.c$2 r0 = new com.kwad.components.ad.feed.c$2
            r0.<init>(r7, r8)
            com.kwad.sdk.utils.bw.runOnUiThread(r0)
            return
        L2f:
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.gM
            boolean r0 = r0.get()
            if (r0 == 0) goto L38
            return
        L38:
            long r4 = android.os.SystemClock.elapsedRealtime()
            com.kwad.sdk.core.response.model.AdTemplate r0 = r7.mAdTemplate
            boolean r0 = com.kwad.sdk.core.response.b.b.dd(r0)
            if (r0 == 0) goto L47
            r0 = 3
            r3 = 3
            goto L49
        L47:
            r0 = 2
            r3 = 2
        L49:
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.gM
            r1 = 1
            r0.set(r1)
            com.kwad.components.ad.feed.c$3 r1 = new com.kwad.components.ad.feed.c$3
            r2 = r7
            r6 = r8
            r1.<init>(r2, r3, r4, r6)
            r7.a(r1)
            return
    }

    @Override // com.kwad.sdk.api.KsFeedAd
    public final void reportAdExposureFailed(int r2, com.kwad.sdk.api.model.AdExposureFailedReason r3) {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            com.kwad.sdk.core.adlog.c.a(r0, r2, r3)
            return
    }

    @Override // com.kwad.sdk.api.KsFeedAd
    public final void setAdInteractionListener(com.kwad.sdk.api.KsFeedAd.AdInteractionListener r1) {
            r0 = this;
            r0.gI = r1
            return
    }

    @Override // com.kwad.sdk.api.KsFeedAd
    public final void setBidEcpm(int r5) {
            r4 = this;
            long r0 = (long) r5
            r2 = -1
            r4.setBidEcpm(r0, r2)
            return
    }

    @Override // com.kwad.sdk.api.KsFeedAd
    public final void setBidEcpm(long r2, long r4) {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            r0.mBidEcpm = r2
            com.kwad.sdk.core.adlog.c.m(r0, r4)
            return
    }

    @Override // com.kwad.sdk.api.KsFeedAd
    @android.annotation.SuppressLint({"WrongConstant"})
    public final void setVideoPlayConfig(@androidx.annotation.Nullable com.kwad.sdk.api.KsAdVideoPlayConfig r3) {
            r2 = this;
            boolean r0 = r3 instanceof com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl
            if (r0 == 0) goto L73
            com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl r3 = (com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl) r3
            int r0 = r3.getVideoSoundValue()
            if (r0 == 0) goto L15
            com.kwad.sdk.api.KsAdVideoPlayConfig r0 = r2.bU
            boolean r1 = r3.isVideoSoundEnable()
            r0.setVideoSoundEnable(r1)
        L15:
            int r0 = r3.getVideoAutoPlayType()
            if (r0 == 0) goto L25
            com.kwad.sdk.api.KsAdVideoPlayConfig r0 = r2.bU
            int r3 = r3.getVideoAutoPlayType()
            r0.setVideoAutoPlayType(r3)
            goto L4c
        L25:
            int r0 = r3.getDataFlowAutoStartValue()
            if (r0 == 0) goto L35
            com.kwad.sdk.api.KsAdVideoPlayConfig r0 = r2.bU
            boolean r3 = r3.isDataFlowAutoStart()
            r0.setDataFlowAutoStart(r3)
            goto L4c
        L35:
            com.kwad.sdk.api.KsAdVideoPlayConfig r3 = r2.bU
            boolean r0 = com.kwad.sdk.core.config.e.FA()
            r3.setDataFlowAutoStart(r0)
            com.kwad.sdk.api.KsAdVideoPlayConfig r3 = r2.bU     // Catch: java.lang.Throwable -> L45 java.lang.NoSuchMethodError -> L47
            r0 = 0
            r3.setVideoAutoPlayType(r0)     // Catch: java.lang.Throwable -> L45 java.lang.NoSuchMethodError -> L47
            goto L4c
        L45:
            r3 = move-exception
            goto L49
        L47:
            goto L4c
        L49:
            com.kwad.components.core.d.a.reportSdkCaughtException(r3)
        L4c:
            com.kwad.components.core.widget.b r3 = r2.gJ
            boolean r0 = r3 instanceof com.kwad.components.ad.feed.widget.q
            if (r0 == 0) goto L59
            com.kwad.components.ad.feed.widget.q r3 = (com.kwad.components.ad.feed.widget.q) r3
            com.kwad.sdk.api.KsAdVideoPlayConfig r0 = r2.bU
            r3.setVideoPlayConfig(r0)
        L59:
            com.kwad.components.core.widget.b r3 = r2.gJ
            boolean r0 = r3 instanceof com.kwad.components.ad.feed.widget.r
            if (r0 == 0) goto L66
            com.kwad.components.ad.feed.widget.r r3 = (com.kwad.components.ad.feed.widget.r) r3
            com.kwad.sdk.api.KsAdVideoPlayConfig r0 = r2.bU
            r3.setVideoPlayConfig(r0)
        L66:
            com.kwad.components.core.widget.b r3 = r2.gJ
            boolean r0 = r3 instanceof com.kwad.components.ad.feed.widget.c
            if (r0 == 0) goto L73
            com.kwad.components.ad.feed.widget.c r3 = (com.kwad.components.ad.feed.widget.c) r3
            com.kwad.sdk.api.KsAdVideoPlayConfig r0 = r2.bU
            r3.setVideoPlayConfig(r0)
        L73:
            boolean r3 = r2.isVideoSoundEnable()
            if (r3 == 0) goto L7f
            com.kwad.sdk.core.response.model.AdTemplate r3 = r2.mAdTemplate
            r0 = 2
            r3.mInitVoiceStatus = r0
            return
        L7f:
            com.kwad.sdk.core.response.model.AdTemplate r3 = r2.mAdTemplate
            r0 = 1
            r3.mInitVoiceStatus = r0
            return
    }

    @Override // com.kwad.sdk.api.KsFeedAd
    public final void setVideoSoundEnable(boolean r2) {
            r1 = this;
            com.kwad.sdk.api.KsAdVideoPlayConfig r0 = r1.bU
            r0.setVideoSoundEnable(r2)
            com.kwad.sdk.api.KsAdVideoPlayConfig r2 = r1.bU
            boolean r2 = r2.isVideoSoundEnable()
            if (r2 == 0) goto L13
            com.kwad.sdk.core.response.model.AdTemplate r2 = r1.mAdTemplate
            r0 = 2
            r2.mInitVoiceStatus = r0
            return
        L13:
            com.kwad.sdk.core.response.model.AdTemplate r2 = r1.mAdTemplate
            r0 = 1
            r2.mInitVoiceStatus = r0
            return
    }

    @Override // com.kwad.components.core.internal.api.a
    public final boolean supportPushAd() {
            r1 = this;
            r0 = 1
            return r0
    }
}
