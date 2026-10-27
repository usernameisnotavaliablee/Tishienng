package com.kwad.components.ad.draw;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c extends com.kwad.sdk.api.core.AbstractKsDrawAd implements com.kwad.components.core.internal.api.a {
    private com.kwad.components.core.internal.api.c bz;

    @androidx.annotation.Nullable
    private com.kwad.sdk.api.KsDrawAd.AdInteractionListener dh;
    private com.kwad.components.ad.draw.view.b di;
    private com.kwad.components.ad.draw.view.a dj;
    private com.kwad.components.ad.draw.view.c dk;
    private boolean dl;
    private android.widget.FrameLayout dm;
    private final com.kwad.sdk.core.j.b dn;

    /* renamed from: do, reason: not valid java name */
    private final com.kwad.sdk.api.KsDrawAd.AdInteractionListener f0do;
    private com.kwad.sdk.core.response.model.AdInfo mAdInfo;

    @androidx.annotation.NonNull
    private com.kwad.sdk.core.response.model.AdResultData mAdResultData;

    @androidx.annotation.NonNull
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private long startTime;




    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void aI();

        void aJ();
    }

    public c(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdResultData r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.dl = r0
            com.kwad.components.core.internal.api.c r0 = new com.kwad.components.core.internal.api.c
            r0.<init>()
            r1.bz = r0
            com.kwad.components.ad.draw.c$2 r0 = new com.kwad.components.ad.draw.c$2
            r0.<init>(r1)
            r1.dn = r0
            com.kwad.components.ad.draw.c$3 r0 = new com.kwad.components.ad.draw.c$3
            r0.<init>(r1)
            r1.f0do = r0
            r1.mAdResultData = r2
            com.kwad.sdk.core.response.model.AdTemplate r2 = com.kwad.sdk.core.response.b.c.r(r2)
            r1.mAdTemplate = r2
            com.kwad.sdk.core.response.model.AdInfo r2 = com.kwad.sdk.core.response.b.e.el(r2)
            r1.mAdInfo = r2
            com.kwad.sdk.core.response.model.b r2 = com.kwad.sdk.core.response.b.a.bu(r2)
            java.lang.String r2 = r2.getUrl()
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            com.kwad.sdk.core.imageloader.KSImageLoader.preloadImage(r2, r0)
            com.kwad.components.ad.i.b r2 = com.kwad.components.ad.i.b.fR()
            r2.a(r1)
            return
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate a(com.kwad.components.ad.draw.c r0) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    private void a(android.content.Context r3, android.view.ViewGroup r4) {
            r2 = this;
            com.kwad.components.ad.draw.view.c r0 = r2.dk
            if (r0 != 0) goto L28
            com.kwad.components.ad.draw.view.c r0 = new com.kwad.components.ad.draw.view.c
            r0.<init>(r3)
            r2.dk = r0
            com.kwad.sdk.core.j.b r1 = r2.dn
            r0.setPageExitListener(r1)
            com.kwad.components.ad.draw.view.c r0 = r2.dk
            com.kwad.sdk.api.KsDrawAd$AdInteractionListener r1 = r2.dh
            r0.setAdInteractionListener(r1)
            com.kwad.components.ad.draw.view.c r0 = r2.dk
            com.kwad.components.ad.draw.c$1 r1 = new com.kwad.components.ad.draw.c$1
            r1.<init>(r2, r4, r3)
            r0.setTKLoadStateListener(r1)
            com.kwad.components.ad.draw.view.c r3 = r2.dk
            com.kwad.sdk.core.response.model.AdResultData r0 = r2.mAdResultData
            r3.c(r0)
        L28:
            com.kwad.components.ad.draw.view.c r3 = r2.dk
            a(r4, r3)
            return
    }

    private static void a(android.view.ViewGroup r1, android.view.View r2) {
            if (r1 == 0) goto L11
            if (r2 == 0) goto L11
            android.view.ViewParent r0 = r2.getParent()
            if (r0 == 0) goto Lb
            goto L11
        Lb:
            r1.removeAllViews()
            r1.addView(r2)
        L11:
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.draw.c r0, android.content.Context r1, android.view.ViewGroup r2) {
            r0.b(r1, r2)
            return
    }

    private boolean aH() {
            r2 = this;
            android.widget.FrameLayout r0 = r2.dm
            if (r0 == 0) goto Lc
            int r0 = r0.getChildCount()
            r1 = 1
            if (r0 != r1) goto Lc
            return r1
        Lc:
            r0 = 0
            return r0
    }

    static /* synthetic */ long b(com.kwad.components.ad.draw.c r2) {
            long r0 = r2.startTime
            return r0
    }

    private void b(android.content.Context r3, android.view.ViewGroup r4) {
            r2 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r2.mAdInfo
            boolean r0 = com.kwad.sdk.core.response.b.a.cR(r0)
            java.lang.String r1 = "KSDrawAdControl"
            if (r0 == 0) goto L34
            com.kwad.components.ad.draw.view.a r0 = r2.dj
            if (r0 != 0) goto L29
            com.kwad.components.ad.draw.view.a r0 = new com.kwad.components.ad.draw.view.a
            com.kwad.sdk.core.response.model.AdTemplate r1 = r2.mAdTemplate
            r0.<init>(r3, r1)
            r2.dj = r0
            com.kwad.sdk.core.j.b r3 = r2.dn
            r0.setPageExitListener(r3)
            com.kwad.components.ad.draw.view.a r3 = r2.dj
            com.kwad.sdk.api.KsDrawAd$AdInteractionListener r0 = r2.dh
            r3.setAdInteractionListener(r0)
            com.kwad.components.ad.draw.view.a r3 = r2.dj
            r3.by()
            goto L2e
        L29:
            java.lang.String r3 = "mDrawAdLiveView is not null"
            com.kwad.sdk.core.d.c.i(r1, r3)
        L2e:
            com.kwad.components.ad.draw.view.a r3 = r2.dj
            a(r4, r3)
            return
        L34:
            com.kwad.components.ad.draw.view.b r0 = r2.di
            if (r0 != 0) goto L53
            com.kwad.components.ad.draw.view.b r0 = new com.kwad.components.ad.draw.view.b
            r0.<init>(r3)
            r2.di = r0
            com.kwad.sdk.core.j.b r3 = r2.dn
            r0.setPageExitListener(r3)
            com.kwad.components.ad.draw.view.b r3 = r2.di
            com.kwad.sdk.api.KsDrawAd$AdInteractionListener r0 = r2.dh
            r3.setAdInteractionListener(r0)
            com.kwad.components.ad.draw.view.b r3 = r2.di
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            r3.k(r0)
            goto L58
        L53:
            java.lang.String r3 = "mDrawVideoView is not null"
            com.kwad.sdk.core.d.c.i(r1, r3)
        L58:
            com.kwad.components.ad.draw.view.b r3 = r2.di
            a(r4, r3)
            return
    }

    static /* synthetic */ com.kwad.components.core.internal.api.c c(com.kwad.components.ad.draw.c r0) {
            com.kwad.components.core.internal.api.c r0 = r0.bz
            return r0
    }

    static /* synthetic */ com.kwad.sdk.api.KsDrawAd.AdInteractionListener d(com.kwad.components.ad.draw.c r0) {
            com.kwad.sdk.api.KsDrawAd$AdInteractionListener r0 = r0.dh
            return r0
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

    @Override // com.kwad.sdk.api.KsDrawAd
    public final void controlPlayerStatus() {
            r1 = this;
            r0 = 1
            r1.dl = r0
            com.kwad.components.ad.draw.view.b r0 = r1.di
            if (r0 == 0) goto La
            r0.bK()
        La:
            com.kwad.components.ad.draw.view.c r0 = r1.dk
            if (r0 == 0) goto L11
            r0.bK()
        L11:
            return
    }

    @Override // com.kwad.components.core.internal.api.a
    public final com.kwad.sdk.core.response.model.AdTemplate getAdTemplate() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            return r0
    }

    @Override // com.kwad.sdk.api.core.AbstractKsDrawAd
    @androidx.annotation.Nullable
    public final android.view.View getDrawView2(android.content.Context r9) {
            r8 = this;
            r1 = 0
            if (r9 == 0) goto La9
            com.kwad.sdk.l r0 = com.kwad.sdk.l.Cf()
            boolean r0 = r0.Bn()
            if (r0 != 0) goto Lf
            goto La9
        Lf:
            boolean r0 = r8.aH()
            if (r0 == 0) goto L18
            android.widget.FrameLayout r9 = r8.dm
            return r9
        L18:
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            r0.<init>(r9)
            r8.dm = r0
            com.kwad.sdk.core.response.model.AdTemplate r0 = r8.mAdTemplate
            com.kwad.components.ad.draw.a.c.i(r0)
            long r2 = android.os.SystemClock.elapsedRealtime()
            r8.startTime = r2
            android.content.Context r9 = com.kwad.sdk.o.m.wrapContextIfNeed(r9)     // Catch: java.lang.Throwable -> L3c
            com.kwad.sdk.core.response.model.AdTemplate r0 = r8.mAdTemplate     // Catch: java.lang.Throwable -> L3c
            boolean r0 = com.kwad.sdk.core.response.b.b.de(r0)     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L3e
            android.widget.FrameLayout r0 = r8.dm     // Catch: java.lang.Throwable -> L3c
            r8.a(r9, r0)     // Catch: java.lang.Throwable -> L3c
            goto L9e
        L3c:
            r0 = move-exception
            goto L53
        L3e:
            android.widget.FrameLayout r0 = r8.dm     // Catch: java.lang.Throwable -> L3c
            r8.b(r9, r0)     // Catch: java.lang.Throwable -> L3c
            com.kwad.sdk.core.response.model.AdTemplate r2 = r8.mAdTemplate     // Catch: java.lang.Throwable -> L3c
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L3c
            long r5 = r8.startTime     // Catch: java.lang.Throwable -> L3c
            long r3 = r3 - r5
            r6 = 1
            r7 = 1
            r5 = 1
            com.kwad.components.ad.draw.a.c.a(r2, r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L3c
            goto L9e
        L53:
            com.kwad.sdk.l r2 = com.kwad.sdk.l.Cf()
            boolean r2 = r2.Bk()
            if (r2 == 0) goto La8
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "context:"
            r3.<init>(r4)
            java.lang.Class r4 = r9.getClass()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r4 = "--classloader:"
            r3.append(r4)
            java.lang.Class r9 = r9.getClass()
            java.lang.ClassLoader r9 = r9.getClassLoader()
            r3.append(r9)
            java.lang.String r9 = r3.toString()
            r2.<init>(r9)
            r2.addSuppressed(r0)
            com.kwad.sdk.core.response.model.AdTemplate r9 = r8.mAdTemplate
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r5 = r8.startTime
            long r3 = r3 - r5
            java.lang.String r0 = r0.getMessage()
            com.kwad.components.ad.draw.a.c.b(r9, r3, r0)
            com.kwad.components.core.d.a.reportSdkCaughtException(r2)
        L9e:
            boolean r9 = r8.aH()
            if (r9 == 0) goto La7
            android.widget.FrameLayout r9 = r8.dm
            return r9
        La7:
            return r1
        La8:
            throw r0
        La9:
            return r1
    }

    @Override // com.kwad.sdk.api.KsDrawAd
    public final int getECPM() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            int r0 = com.kwad.sdk.core.response.b.a.aR(r0)
            return r0
    }

    @Override // com.kwad.sdk.api.KsDrawAd
    public final int getInteractionType() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            int r0 = com.kwad.sdk.core.response.b.a.aQ(r0)
            return r0
    }

    @Override // com.kwad.sdk.api.KsDrawAd
    public final int getMaterialType() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
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

    @Override // com.kwad.sdk.api.KsDrawAd
    public final void pause() {
            r2 = this;
            boolean r0 = r2.dl
            if (r0 != 0) goto L5
            goto L14
        L5:
            com.kwad.components.ad.draw.view.b r0 = r2.di
            if (r0 == 0) goto Lc
            r0.pause()
        Lc:
            com.kwad.components.ad.draw.view.c r0 = r2.dk
            if (r0 == 0) goto L14
            r1 = 2
            r0.A(r1)
        L14:
            return
    }

    @Override // com.kwad.sdk.api.KsDrawAd
    public final void play() {
            r2 = this;
            boolean r0 = r2.dl
            if (r0 != 0) goto L5
            goto L14
        L5:
            com.kwad.components.ad.draw.view.b r0 = r2.di
            if (r0 == 0) goto Lc
            r0.play()
        Lc:
            com.kwad.components.ad.draw.view.c r0 = r2.dk
            if (r0 == 0) goto L14
            r1 = 1
            r0.A(r1)
        L14:
            return
    }

    @Override // com.kwad.sdk.api.KsDrawAd
    public final void reportAdExposureFailed(int r2, com.kwad.sdk.api.model.AdExposureFailedReason r3) {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            com.kwad.sdk.core.adlog.c.a(r0, r2, r3)
            return
    }

    @Override // com.kwad.sdk.api.KsDrawAd
    public final void setAdInteractionListener(com.kwad.sdk.api.KsDrawAd.AdInteractionListener r2) {
            r1 = this;
            r1.dh = r2
            com.kwad.components.ad.draw.view.b r0 = r1.di
            if (r0 == 0) goto L9
            r0.setAdInteractionListener(r2)
        L9:
            return
    }

    @Override // com.kwad.sdk.api.KsDrawAd
    public final void setBidEcpm(int r5) {
            r4 = this;
            long r0 = (long) r5
            r2 = -1
            r4.setBidEcpm(r0, r2)
            return
    }

    @Override // com.kwad.sdk.api.KsDrawAd
    public final void setBidEcpm(long r2, long r4) {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            r0.mBidEcpm = r2
            com.kwad.sdk.core.adlog.c.m(r0, r4)
            return
    }

    @Override // com.kwad.sdk.api.KsDrawAd
    public final void setVideoSoundEnable(boolean r2) {
            r1 = this;
            com.kwad.components.ad.draw.view.b r0 = r1.di
            if (r0 == 0) goto L7
            r0.setVideoSound(r2)
        L7:
            com.kwad.components.ad.draw.view.a r0 = r1.dj
            if (r0 == 0) goto Le
            r0.setVideoSound(r2)
        Le:
            com.kwad.components.ad.draw.view.c r0 = r1.dk
            if (r0 == 0) goto L15
            r0.setVideoSound(r2)
        L15:
            return
    }

    @Override // com.kwad.components.core.internal.api.a
    public final boolean supportPushAd() {
            r1 = this;
            r0 = 1
            return r0
    }
}
