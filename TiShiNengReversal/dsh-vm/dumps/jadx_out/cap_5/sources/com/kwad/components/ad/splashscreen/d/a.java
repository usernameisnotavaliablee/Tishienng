package com.kwad.components.ad.splashscreen.d;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a extends com.kwad.components.ad.k.b implements com.kwad.sdk.core.j.c {
    private java.lang.String Bh;
    private final java.util.List<com.kwad.sdk.utils.i.a> Bk;
    private com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener Bm;
    public int Gl;
    private boolean Jl;
    public long Jm;
    private android.content.Context mContext;
    private com.kwad.sdk.api.KsVideoPlayConfig mVideoPlayConfig;
    private com.kwad.sdk.core.response.model.VideoPlayerStatus mVideoPlayerStatus;
    private boolean pW;



    public a(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r2, @androidx.annotation.NonNull com.kwad.components.core.video.DetailVideoView r3, com.kwad.sdk.api.KsVideoPlayConfig r4) {
            r1 = this;
            r1.<init>(r2, r3)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.Bk = r0
            com.kwad.components.ad.splashscreen.d.a$1 r0 = new com.kwad.components.ad.splashscreen.d.a$1
            r0.<init>(r1)
            r1.Bm = r0
            r1.mVideoPlayConfig = r4
            android.content.Context r4 = r3.getContext()
            r1.mContext = r4
            com.kwad.sdk.core.response.model.AdInfo r4 = com.kwad.sdk.core.response.b.e.el(r2)
            java.lang.String r4 = com.kwad.sdk.core.response.b.a.aZ(r4)
            com.kwad.sdk.core.response.model.VideoPlayerStatus r0 = r2.mVideoPlayerStatus
            r1.mVideoPlayerStatus = r0
            com.kwad.sdk.core.response.b.e.el(r2)
            boolean r2 = com.kwad.components.ad.splashscreen.h.ac(r2)
            if (r2 == 0) goto L30
            r2 = 2
            goto L31
        L30:
            r2 = 1
        L31:
            r1.Gl = r2
            com.kwad.sdk.core.diskcache.b.a r2 = com.kwad.sdk.core.diskcache.b.a.GP()
            java.io.File r2 = r2.cf(r4)
            if (r2 == 0) goto L49
            boolean r4 = r2.exists()
            if (r4 == 0) goto L49
            java.lang.String r2 = r2.getAbsolutePath()
            r1.Bh = r2
        L49:
            com.kwad.components.core.video.b r2 = r1.LU
            com.kwad.components.ad.splashscreen.d.a$2 r4 = new com.kwad.components.ad.splashscreen.d.a$2
            r4.<init>(r1, r3)
            r2.a(r4)
            android.content.Context r2 = r1.mContext
            com.kwad.components.core.t.a r2 = com.kwad.components.core.t.a.aC(r2)
            com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener r3 = r1.Bm
            r2.a(r3)
            return
    }

    static /* synthetic */ java.util.List a(com.kwad.components.ad.splashscreen.d.a r0) {
            java.util.List<com.kwad.sdk.utils.i$a> r0 = r0.Bk
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate b(com.kwad.components.ad.splashscreen.d.a r0) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    private void bs() {
            r4 = this;
            com.kwad.sdk.contentalliance.a.a.b$a r0 = new com.kwad.sdk.contentalliance.a.a.b$a
            com.kwad.sdk.core.response.model.AdTemplate r1 = r4.mAdTemplate
            r0.<init>(r1)
            com.kwad.sdk.core.response.model.VideoPlayerStatus r1 = r4.mVideoPlayerStatus
            com.kwad.sdk.contentalliance.a.a.b$a r0 = r0.a(r1)
            java.lang.String r1 = r4.Bh
            com.kwad.sdk.contentalliance.a.a.b$a r0 = r0.dg(r1)
            com.kwad.sdk.core.response.model.AdTemplate r1 = r4.mAdTemplate
            com.kwad.sdk.core.response.model.PhotoInfo r1 = com.kwad.sdk.core.response.b.e.em(r1)
            java.lang.String r1 = com.kwad.sdk.core.response.b.h.b(r1)
            com.kwad.sdk.contentalliance.a.a.b$a r0 = r0.dh(r1)
            com.kwad.sdk.core.response.model.AdTemplate r1 = r4.mAdTemplate
            com.kwad.sdk.contentalliance.a.a.a r1 = com.kwad.sdk.contentalliance.a.a.a.bQ(r1)
            com.kwad.sdk.contentalliance.a.a.b$a r0 = r0.b(r1)
            com.kwad.sdk.contentalliance.a.a.b r0 = r0.El()
            long r1 = android.os.SystemClock.elapsedRealtime()
            r4.Jm = r1
            com.kwad.components.ad.splashscreen.monitor.b.lZ()
            com.kwad.sdk.core.response.model.AdTemplate r1 = r4.mAdTemplate
            r2 = 1
            int r3 = r4.Gl
            com.kwad.components.ad.splashscreen.monitor.b.e(r1, r2, r3)
            com.kwad.components.core.video.b r1 = r4.LU
            com.kwad.components.core.video.DetailVideoView r2 = r4.mDetailVideoView
            r1.a(r0, r2)
            com.kwad.sdk.api.KsVideoPlayConfig r0 = r4.mVideoPlayConfig
            if (r0 == 0) goto L53
            boolean r0 = r0.isVideoSoundEnable()
            r1 = 0
            r4.setAudioEnabled(r0, r1)
        L53:
            com.kwad.components.core.video.b r0 = r4.LU
            r0.prepareAsync()
            return
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate c(com.kwad.components.ad.splashscreen.d.a r0) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.components.core.video.b d(com.kwad.components.ad.splashscreen.d.a r0) {
            com.kwad.components.core.video.b r0 = r0.LU
            return r0
    }

    public final void a(com.kwad.sdk.utils.i.a r2) {
            r1 = this;
            java.util.List<com.kwad.sdk.utils.i$a> r0 = r1.Bk
            r0.add(r2)
            return
    }

    public final void ag(boolean r1) {
            r0 = this;
            r1 = 1
            r0.Jl = r1
            return
    }

    public final void b(com.kwad.sdk.utils.i.a r2) {
            r1 = this;
            java.util.List<com.kwad.sdk.utils.i$a> r0 = r1.Bk
            r0.remove(r2)
            return
    }

    @Override // com.kwad.sdk.core.j.c
    public final void bt() {
            r0 = this;
            r0.resume()
            return
    }

    @Override // com.kwad.sdk.core.j.c
    public final void bu() {
            r0 = this;
            r0.pause()
            return
    }

    public final long getCurrentPosition() {
            r2 = this;
            com.kwad.components.core.video.b r0 = r2.LU
            long r0 = r0.getCurrentPosition()
            return r0
    }

    public final void nk() {
            r1 = this;
            com.kwad.components.core.video.b r0 = r1.LU
            com.kwad.sdk.core.video.a.c r0 = r0.tz()
            if (r0 != 0) goto Lb
            r1.bs()
        Lb:
            com.kwad.components.core.video.b r0 = r1.LU
            r0.start()
            return
    }

    @Override // com.kwad.components.ad.k.b, com.kwad.components.ad.k.a
    public final void release() {
            r2 = this;
            super.release()
            android.content.Context r0 = r2.mContext
            com.kwad.components.core.t.a r0 = com.kwad.components.core.t.a.aC(r0)
            com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener r1 = r2.Bm
            r0.b(r1)
            return
    }

    @Override // com.kwad.components.ad.k.b, com.kwad.components.ad.k.a
    public final void resume() {
            r2 = this;
            super.resume()
            boolean r0 = r2.pW
            if (r0 == 0) goto L26
            boolean r0 = r2.Jl
            if (r0 == 0) goto L26
            android.content.Context r0 = r2.mContext
            com.kwad.components.core.t.a r0 = com.kwad.components.core.t.a.aC(r0)
            r1 = 0
            r0.aQ(r1)
            android.content.Context r0 = r2.mContext
            com.kwad.components.core.t.a r0 = com.kwad.components.core.t.a.aC(r0)
            boolean r0 = r0.sW()
            if (r0 == 0) goto L26
            r2.pW = r1
            r2.setAudioEnabled(r1, r1)
        L26:
            return
    }

    @Override // com.kwad.components.ad.k.a
    public final void setAudioEnabled(boolean r2, boolean r3) {
            r1 = this;
            r1.pW = r2
            if (r2 == 0) goto L10
            if (r3 == 0) goto L10
            android.content.Context r3 = r1.mContext
            com.kwad.components.core.t.a r3 = com.kwad.components.core.t.a.aC(r3)
            r0 = 1
            r3.aQ(r0)
        L10:
            com.kwad.components.core.video.b r3 = r1.LU
            r3.setAudioEnabled(r2)
            return
    }
}
