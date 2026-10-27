package com.kwad.components.core.page.d;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a implements com.kwad.components.core.m.a.a {
    private java.lang.String Bh;
    private boolean Bj;
    private final java.util.List<com.kwad.sdk.utils.i.a> Bk;
    private com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener Bm;
    private com.kwad.components.core.video.b LU;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private android.content.Context mContext;
    private com.kwad.components.core.video.DetailVideoView mDetailVideoView;
    private com.kwad.sdk.api.KsVideoPlayConfig mVideoPlayConfig;
    private com.kwad.sdk.core.response.model.VideoPlayerStatus mVideoPlayerStatus;
    private boolean pW;
    private com.kwad.components.core.video.m pY;




    public a(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r2, @androidx.annotation.NonNull com.kwad.components.core.video.DetailVideoView r3, com.kwad.sdk.api.KsVideoPlayConfig r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.Bj = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.Bk = r0
            com.kwad.components.core.page.d.a$1 r0 = new com.kwad.components.core.page.d.a$1
            r0.<init>(r1)
            r1.Bm = r0
            r1.mVideoPlayConfig = r4
            r1.mAdTemplate = r2
            android.content.Context r4 = r3.getContext()
            r1.mContext = r4
            com.kwad.sdk.core.response.model.VideoPlayerStatus r0 = r2.mVideoPlayerStatus
            r1.mVideoPlayerStatus = r0
            java.lang.String r4 = com.kwad.components.core.video.k.g(r4, r2)
            r1.Bh = r4
            r1.mDetailVideoView = r3
            com.kwad.components.core.video.b r4 = new com.kwad.components.core.video.b
            r4.<init>(r3, r2)
            r1.LU = r4
            r1.bs()
            com.kwad.components.core.page.d.a$2 r3 = new com.kwad.components.core.page.d.a$2
            r3.<init>(r1, r2)
            r1.pY = r3
            com.kwad.components.core.video.b r2 = r1.LU
            r2.c(r3)
            com.kwad.components.core.video.b r2 = r1.LU
            com.kwad.components.core.page.d.a$3 r3 = new com.kwad.components.core.page.d.a$3
            r3.<init>(r1)
            r2.a(r3)
            android.content.Context r2 = r1.mContext
            com.kwad.components.core.t.a r2 = com.kwad.components.core.t.a.aC(r2)
            com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener r3 = r1.Bm
            r2.a(r3)
            return
    }

    static /* synthetic */ com.kwad.components.core.video.b a(com.kwad.components.core.page.d.a r0) {
            com.kwad.components.core.video.b r0 = r0.LU
            return r0
    }

    static /* synthetic */ boolean a(com.kwad.components.core.page.d.a r0, boolean r1) {
            r1 = 1
            r0.Bj = r1
            return r1
    }

    static /* synthetic */ java.util.List b(com.kwad.components.core.page.d.a r0) {
            java.util.List<com.kwad.sdk.utils.i$a> r0 = r0.Bk
            return r0
    }

    private void bs() {
            r3 = this;
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
            if (r0 == 0) goto L42
            boolean r0 = r0.isVideoSoundEnable()
            r1 = 0
            r3.setAudioEnabled(r0, r1)
        L42:
            com.kwad.components.core.video.b r0 = r3.LU
            r0.prepareAsync()
            return
    }

    private void pause() {
            r2 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            boolean r1 = r0.mXiaomiAppStoreDetailViewOpen
            if (r1 == 0) goto L12
            com.kwad.sdk.internal.api.SceneImpl r0 = r0.mAdScene
            if (r0 == 0) goto L12
            int r0 = r0.getAdStyle()
            r1 = 2
            if (r0 != r1) goto L12
            return
        L12:
            com.kwad.components.core.video.b r0 = r2.LU
            r0.pause()
            return
    }

    private void resume() {
            r1 = this;
            com.kwad.components.core.video.b r0 = r1.LU
            r0.resume()
            return
    }

    private void setAudioEnabled(boolean r1, boolean r2) {
            r0 = this;
            r0.pW = r1
            com.kwad.components.core.video.b r2 = r0.LU
            r2.setAudioEnabled(r1)
            return
    }

    @androidx.annotation.MainThread
    public final void a(com.kwad.components.core.video.l r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            com.kwad.components.core.video.b r0 = r1.LU
            r0.c(r2)
            return
    }

    @androidx.annotation.MainThread
    public final void b(com.kwad.components.core.video.l r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            com.kwad.components.core.video.b r0 = r1.LU
            r0.d(r2)
            return
    }

    @Override // com.kwad.components.core.m.a.a
    public final void c(com.kwad.components.core.proxy.f r1) {
            r0 = this;
            r0.resume()
            return
    }

    @Override // com.kwad.components.core.m.a.a
    public final void d(com.kwad.components.core.proxy.f r1) {
            r0 = this;
            r0.pause()
            return
    }

    @Override // com.kwad.components.core.m.a.a
    public final void gY() {
            r1 = this;
            r0 = 0
            r1.Bj = r0
            com.kwad.components.core.video.b r0 = r1.LU
            com.kwad.sdk.core.video.a.c r0 = r0.tz()
            if (r0 != 0) goto Le
            r1.bs()
        Le:
            return
    }

    @Override // com.kwad.components.core.m.a.a
    public final void gZ() {
            r2 = this;
            r0 = 0
            r2.Bj = r0
            com.kwad.components.core.video.b r0 = r2.LU
            if (r0 == 0) goto L11
            com.kwad.components.core.video.m r1 = r2.pY
            r0.d(r1)
            com.kwad.components.core.video.b r0 = r2.LU
            r0.release()
        L11:
            return
    }

    @androidx.annotation.MainThread
    public final void release() {
            r2 = this;
            com.kwad.components.core.video.b r0 = r2.LU
            if (r0 == 0) goto Lc
            r0.clear()
            com.kwad.components.core.video.b r0 = r2.LU
            r0.release()
        Lc:
            android.content.Context r0 = r2.mContext
            com.kwad.components.core.t.a r0 = com.kwad.components.core.t.a.aC(r0)
            com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener r1 = r2.Bm
            r0.b(r1)
            return
    }
}
