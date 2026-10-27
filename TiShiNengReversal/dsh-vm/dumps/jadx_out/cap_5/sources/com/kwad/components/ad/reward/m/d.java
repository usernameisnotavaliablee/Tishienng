package com.kwad.components.ad.reward.m;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d extends com.kwad.components.ad.k.b implements com.kwad.components.ad.reward.g.a {
    private java.lang.String Bh;
    private java.util.concurrent.atomic.AtomicBoolean Bi;
    private boolean Bj;
    private final java.util.List<com.kwad.sdk.utils.i.a> Bk;
    private final java.util.List<java.lang.Object> Bl;
    private com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener Bm;
    private android.content.Context mContext;
    private com.kwad.sdk.api.KsVideoPlayConfig mVideoPlayConfig;
    private com.kwad.sdk.core.response.model.VideoPlayerStatus mVideoPlayerStatus;
    private boolean ng;
    private boolean pW;
    private com.kwad.components.core.video.m pY;
    private com.kwad.components.ad.reward.g tm;




    public d(com.kwad.components.ad.reward.g r2, com.kwad.components.core.video.DetailVideoView r3) {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            r1.<init>(r0, r3)
            java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 0
            r3.<init>(r0)
            r1.Bi = r3
            r1.Bj = r0
            r1.ng = r0
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1.Bk = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1.Bl = r3
            com.kwad.components.ad.reward.m.d$1 r3 = new com.kwad.components.ad.reward.m.d$1
            r3.<init>(r1)
            r1.Bm = r3
            r1.tm = r2
            android.content.Context r3 = r2.mContext
            r1.mContext = r3
            com.kwad.sdk.api.KsVideoPlayConfig r2 = r2.mVideoPlayConfig
            r1.mVideoPlayConfig = r2
            com.kwad.sdk.core.response.model.AdTemplate r2 = r1.mAdTemplate
            com.kwad.sdk.core.response.model.VideoPlayerStatus r2 = r2.mVideoPlayerStatus
            r1.mVideoPlayerStatus = r2
            java.lang.String r2 = r1.getVideoUrl()
            r1.Bh = r2
            return
    }

    static /* synthetic */ com.kwad.components.core.video.b a(com.kwad.components.ad.reward.m.d r0) {
            com.kwad.components.core.video.b r0 = r0.LU
            return r0
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.reward.m.d r0, boolean r1) {
            r1 = 1
            r0.Bj = r1
            return r1
    }

    static /* synthetic */ com.kwad.components.core.video.b b(com.kwad.components.ad.reward.m.d r0) {
            com.kwad.components.core.video.b r0 = r0.LU
            return r0
    }

    private void bs() {
            r3 = this;
            boolean r0 = r3.kU()
            if (r0 == 0) goto L7
            return
        L7:
            com.kwad.sdk.contentalliance.a.a.b$a r0 = new com.kwad.sdk.contentalliance.a.a.b$a
            com.kwad.sdk.core.response.model.AdTemplate r1 = r3.mAdTemplate
            r0.<init>(r1)
            java.lang.String r1 = r3.Bh
            com.kwad.sdk.contentalliance.a.a.b$a r0 = r0.dg(r1)
            com.kwad.sdk.core.response.model.AdTemplate r1 = r3.mAdTemplate
            com.kwad.sdk.core.response.model.PhotoInfo r1 = com.kwad.sdk.core.response.b.e.em(r1)
            java.lang.String r1 = com.kwad.sdk.core.response.b.h.b(r1)
            com.kwad.sdk.contentalliance.a.a.b$a r0 = r0.dh(r1)
            com.kwad.sdk.core.response.model.VideoPlayerStatus r1 = r3.mVideoPlayerStatus
            com.kwad.sdk.contentalliance.a.a.b$a r0 = r0.a(r1)
            com.kwad.sdk.core.response.model.AdTemplate r1 = r3.mAdTemplate
            com.kwad.sdk.contentalliance.a.a.a r1 = com.kwad.sdk.contentalliance.a.a.a.bQ(r1)
            com.kwad.sdk.contentalliance.a.a.b$a r0 = r0.b(r1)
            com.kwad.sdk.contentalliance.a.a.b r0 = r0.El()
            com.kwad.components.core.video.b r1 = r3.LU
            com.kwad.components.core.video.DetailVideoView r2 = r3.mDetailVideoView
            r1.a(r0, r2)
            com.kwad.sdk.api.KsVideoPlayConfig r0 = r3.mVideoPlayConfig
            if (r0 == 0) goto L49
            boolean r0 = r0.isVideoSoundEnable()
            r1 = 0
            r3.setAudioEnabled(r0, r1)
        L49:
            com.kwad.components.core.video.b r0 = r3.LU
            r0.prepareAsync()
            return
    }

    static /* synthetic */ java.util.List c(com.kwad.components.ad.reward.m.d r0) {
            java.util.List<com.kwad.sdk.utils.i$a> r0 = r0.Bk
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate d(com.kwad.components.ad.reward.m.d r0) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.components.core.video.b e(com.kwad.components.ad.reward.m.d r0) {
            com.kwad.components.core.video.b r0 = r0.LU
            return r0
    }

    private java.lang.String getVideoUrl() {
            r2 = this;
            boolean r0 = r2.kU()
            if (r0 == 0) goto L9
            java.lang.String r0 = ""
            return r0
        L9:
            android.content.Context r0 = r2.mContext
            com.kwad.sdk.core.response.model.AdTemplate r1 = r2.mAdTemplate
            java.lang.String r0 = com.kwad.components.core.video.k.g(r0, r1)
            return r0
    }

    private boolean kU() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            boolean r0 = com.kwad.sdk.core.response.b.a.cR(r0)
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    private void stop() {
            r1 = this;
            r1.pause()
            r0 = 1
            r1.ng = r0
            return
    }

    public final void a(com.kwad.sdk.utils.i.a r2) {
            r1 = this;
            java.util.List<com.kwad.sdk.utils.i$a> r0 = r1.Bk
            r0.add(r2)
            return
    }

    public final void b(com.kwad.sdk.utils.i.a r2) {
            r1 = this;
            java.util.List<com.kwad.sdk.utils.i$a> r0 = r1.Bk
            r0.remove(r2)
            return
    }

    @Override // com.kwad.components.ad.k.b, com.kwad.components.ad.k.a
    public final long getPlayDuration() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.Bi
            boolean r0 = r0.get()
            if (r0 == 0) goto Ld
            long r0 = super.getPlayDuration()
            return r0
        Ld:
            r0 = 0
            return r0
    }

    @Override // com.kwad.components.ad.reward.g.a
    public final void hd() {
            r1 = this;
            r0 = 0
            r1.Bj = r0
            return
    }

    @Override // com.kwad.components.ad.reward.g.a
    public final void he() {
            r2 = this;
            boolean r0 = r2.ng
            if (r0 == 0) goto L5
            goto L4e
        L5:
            r2.resume()
            boolean r0 = r2.pW
            if (r0 != 0) goto L16
            boolean r0 = com.kwad.components.ad.reward.a.b.hC()
            if (r0 == 0) goto L4e
            boolean r0 = r2.Bj
            if (r0 == 0) goto L4e
        L16:
            android.content.Context r0 = r2.mContext
            com.kwad.components.core.t.a r0 = com.kwad.components.core.t.a.aC(r0)
            boolean r1 = com.kwad.components.ad.reward.a.b.hC()
            r0.aQ(r1)
            boolean r0 = com.kwad.components.ad.reward.a.b.hC()
            r1 = 0
            if (r0 == 0) goto L37
            boolean r0 = r2.Bj
            if (r0 == 0) goto L37
            r2.Bj = r1
            r0 = 1
            r2.pW = r0
            r2.setAudioEnabled(r0, r1)
            return
        L37:
            com.kwad.components.ad.reward.g r0 = r2.tm
            boolean r0 = r0.rC
            if (r0 != 0) goto L4e
            android.content.Context r0 = r2.mContext
            com.kwad.components.core.t.a r0 = com.kwad.components.core.t.a.aC(r0)
            boolean r0 = r0.sW()
            if (r0 == 0) goto L4e
            r2.pW = r1
            r2.setAudioEnabled(r1, r1)
        L4e:
            return
    }

    @Override // com.kwad.components.ad.reward.g.a
    public final void hf() {
            r0 = this;
            r0.pause()
            return
    }

    @Override // com.kwad.components.ad.reward.g.a
    public final void hg() {
            r2 = this;
            r0 = 0
            r2.Bj = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.Bi
            boolean r0 = r0.get()
            if (r0 == 0) goto L19
            com.kwad.components.core.video.b r0 = r2.LU
            if (r0 == 0) goto L19
            com.kwad.components.core.video.m r1 = r2.pY
            r0.d(r1)
            com.kwad.components.core.video.b r0 = r2.LU
            r0.release()
        L19:
            return
    }

    public final void kS() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.Bi
            boolean r0 = r0.get()
            if (r0 == 0) goto L9
            return
        L9:
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.Bi
            r1 = 1
            r0.set(r1)
            r2.bs()
            com.kwad.components.ad.reward.m.d$2 r0 = new com.kwad.components.ad.reward.m.d$2
            r0.<init>(r2)
            r2.pY = r0
            com.kwad.components.core.video.b r1 = r2.LU
            r1.c(r0)
            com.kwad.components.core.video.b r0 = r2.LU
            com.kwad.components.ad.reward.m.d$3 r1 = new com.kwad.components.ad.reward.m.d$3
            r1.<init>(r2)
            r0.a(r1)
            com.kwad.components.core.video.b r0 = r2.LU
            r0.start()
            android.content.Context r0 = r2.mContext
            com.kwad.components.core.t.a r0 = com.kwad.components.core.t.a.aC(r0)
            com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener r1 = r2.Bm
            r0.a(r1)
            return
    }

    public final void kT() {
            r2 = this;
            java.util.List<java.lang.Object> r0 = r2.Bl
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L10
            r0.next()
            goto L6
        L10:
            return
    }

    @Override // com.kwad.components.ad.k.b, com.kwad.components.ad.k.a
    public final void pause() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.Bi
            boolean r0 = r0.get()
            if (r0 == 0) goto L16
            com.kwad.components.core.video.b r0 = r1.LU
            if (r0 == 0) goto L16
            boolean r0 = r1.kU()
            if (r0 == 0) goto L13
            goto L16
        L13:
            super.pause()
        L16:
            return
    }

    @Override // com.kwad.components.ad.k.b, com.kwad.components.ad.k.a
    @androidx.annotation.MainThread
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
            r1 = this;
            r0 = 0
            r1.ng = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.Bi
            boolean r0 = r0.get()
            if (r0 == 0) goto L22
            com.kwad.components.core.video.b r0 = r1.LU
            if (r0 == 0) goto L22
            boolean r0 = r1.kU()
            if (r0 == 0) goto L16
            goto L22
        L16:
            com.kwad.components.ad.reward.g r0 = r1.tm
            boolean r0 = com.kwad.components.ad.reward.g.b(r0)
            if (r0 == 0) goto L1f
            goto L22
        L1f:
            super.resume()
        L22:
            return
    }

    @Override // com.kwad.components.ad.k.a
    public final void setAudioEnabled(boolean r2, boolean r3) {
            r1 = this;
            r1.pW = r2
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.Bi
            boolean r0 = r0.get()
            if (r0 == 0) goto L22
            com.kwad.components.core.video.b r0 = r1.LU
            if (r0 != 0) goto Lf
            goto L22
        Lf:
            if (r2 == 0) goto L1d
            if (r3 == 0) goto L1d
            android.content.Context r3 = r1.mContext
            com.kwad.components.core.t.a r3 = com.kwad.components.core.t.a.aC(r3)
            r0 = 1
            r3.aQ(r0)
        L1d:
            com.kwad.components.core.video.b r3 = r1.LU
            r3.setAudioEnabled(r2)
        L22:
            return
    }

    @Override // com.kwad.components.ad.k.a
    @java.lang.Deprecated
    public final void skipToEnd() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.Bi
            boolean r0 = r0.get()
            if (r0 == 0) goto L15
            com.kwad.components.core.video.b r0 = r2.LU
            if (r0 != 0) goto Ld
            goto L15
        Ld:
            r1 = 9
            r0.onPlayStateChanged(r1)
            r2.stop()
        L15:
            return
    }
}
