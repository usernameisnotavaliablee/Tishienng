package com.kwad.components.ad.draw.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a extends com.kwad.components.ad.k.b {
    private long ff;
    private com.kwad.components.core.widget.a.b fg;
    private com.kwad.sdk.contentalliance.a.a.a fh;
    private boolean fi;
    private boolean fj;
    private int fk;
    public boolean fl;
    public int fm;
    private boolean fn;
    private final com.kwad.sdk.core.j.c fo;
    private android.content.Context mContext;




    public a(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r4, @androidx.annotation.NonNull com.kwad.components.core.widget.a.b r5, @androidx.annotation.NonNull com.kwad.components.core.video.DetailVideoView r6) {
            r3 = this;
            r3.<init>(r4, r6)
            r4 = 0
            r3.fj = r4
            r0 = -1
            r3.fk = r0
            r0 = 1
            r3.fl = r0
            r3.fm = r4
            com.kwad.components.ad.draw.c.a$3 r4 = new com.kwad.components.ad.draw.c.a$3
            r4.<init>(r3)
            r3.fo = r4
            com.kwad.sdk.core.response.model.AdTemplate r4 = r3.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r4 = com.kwad.sdk.core.response.b.e.el(r4)
            long r1 = com.kwad.sdk.core.response.b.a.ab(r4)
            r3.ff = r1
            r3.fg = r5
            android.content.Context r4 = r6.getContext()
            r3.mContext = r4
            r3.bs()
            com.kwad.sdk.core.response.model.AdTemplate r4 = r3.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r4 = com.kwad.sdk.core.response.b.e.el(r4)
            boolean r4 = com.kwad.sdk.core.response.b.a.cb(r4)
            if (r4 == 0) goto L40
            com.kwad.components.core.video.b r4 = r3.LU
            r5 = 0
            r4.setVolume(r5, r5)
            r3.fj = r0
        L40:
            com.kwad.components.core.video.b r4 = r3.LU
            com.kwad.components.ad.draw.c.a$1 r5 = new com.kwad.components.ad.draw.c.a$1
            r5.<init>(r3)
            r4.a(r5)
            return
    }

    static /* synthetic */ com.kwad.sdk.contentalliance.a.a.a a(com.kwad.components.ad.draw.c.a r0, com.kwad.sdk.contentalliance.a.a.a r1) {
            r0.fh = r1
            return r1
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate a(com.kwad.components.ad.draw.c.a r0) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ void a(com.kwad.components.ad.draw.c.a r0, long r1) {
            r0.start(r1)
            return
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.draw.c.a r0, boolean r1) {
            r1 = 1
            r0.fn = r1
            return r1
    }

    static /* synthetic */ com.kwad.sdk.contentalliance.a.a.a b(com.kwad.components.ad.draw.c.a r0) {
            com.kwad.sdk.contentalliance.a.a.a r0 = r0.fh
            return r0
    }

    private boolean bp() {
            r2 = this;
            int r0 = r2.fm
            r1 = 1
            if (r0 == r1) goto Ld
            r1 = 2
            if (r0 == r1) goto Lb
            boolean r0 = r2.fl
            return r0
        Lb:
            r0 = 0
            return r0
        Ld:
            return r1
    }

    private void bs() {
            r5 = this;
            com.kwad.sdk.contentalliance.a.a.b$a r0 = new com.kwad.sdk.contentalliance.a.a.b$a
            com.kwad.sdk.core.response.model.AdTemplate r1 = r5.mAdTemplate
            r0.<init>(r1)
            com.kwad.sdk.core.response.model.AdTemplate r1 = r5.mAdTemplate
            java.lang.String r1 = com.kwad.sdk.core.response.b.e.en(r1)
            com.kwad.sdk.contentalliance.a.a.b$a r0 = r0.dg(r1)
            com.kwad.sdk.core.response.model.AdTemplate r1 = r5.mAdTemplate
            com.kwad.sdk.core.response.model.PhotoInfo r1 = com.kwad.sdk.core.response.b.e.em(r1)
            java.lang.String r1 = com.kwad.sdk.core.response.b.h.b(r1)
            com.kwad.sdk.contentalliance.a.a.b$a r0 = r0.dh(r1)
            com.kwad.sdk.core.response.model.AdTemplate r1 = r5.mAdTemplate
            com.kwad.sdk.core.response.model.VideoPlayerStatus r1 = r1.mVideoPlayerStatus
            com.kwad.sdk.contentalliance.a.a.b$a r0 = r0.a(r1)
            com.kwad.sdk.contentalliance.a.a.a r1 = new com.kwad.sdk.contentalliance.a.a.a
            com.kwad.sdk.core.response.model.AdTemplate r2 = r5.mAdTemplate
            long r3 = java.lang.System.currentTimeMillis()
            r1.<init>(r2, r3)
            com.kwad.sdk.contentalliance.a.a.b$a r0 = r0.b(r1)
            com.kwad.sdk.contentalliance.a.a.b r0 = r0.El()
            com.kwad.components.core.video.b r1 = r5.LU
            com.kwad.components.core.video.DetailVideoView r2 = r5.mDetailVideoView
            r1.a(r0, r2)
            com.kwad.components.core.video.b r0 = r5.LU
            r0.prepareAsync()
            int r0 = r5.fk
            r1 = -1
            if (r0 != r1) goto L51
            boolean r0 = r5.fj
            if (r0 == 0) goto L50
            goto L51
        L50:
            return
        L51:
            boolean r0 = r5.fj
            r0 = r0 ^ 1
            r5.setVideoSound(r0)
            return
    }

    static /* synthetic */ com.kwad.sdk.core.response.model.AdTemplate c(com.kwad.components.ad.draw.c.a r0) {
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            return r0
    }

    static /* synthetic */ com.kwad.components.core.video.b d(com.kwad.components.ad.draw.c.a r0) {
            com.kwad.components.core.video.b r0 = r0.LU
            return r0
    }

    static /* synthetic */ boolean e(com.kwad.components.ad.draw.c.a r0) {
            boolean r0 = r0.fn
            return r0
    }

    static /* synthetic */ boolean f(com.kwad.components.ad.draw.c.a r0) {
            boolean r0 = r0.fi
            return r0
    }

    static /* synthetic */ boolean g(com.kwad.components.ad.draw.c.a r0) {
            boolean r0 = r0.bp()
            return r0
    }

    private void start(long r3) {
            r2 = this;
            com.kwad.components.core.widget.a.b r0 = r2.fg
            boolean r0 = r0.ae()
            if (r0 == 0) goto L23
            boolean r0 = r2.bp()
            if (r0 == 0) goto L23
            boolean r0 = r2.fn
            if (r0 != 0) goto L23
            com.kwad.sdk.contentalliance.a.a.a r0 = new com.kwad.sdk.contentalliance.a.a.a
            com.kwad.sdk.core.response.model.AdTemplate r1 = r2.mAdTemplate
            r0.<init>(r1, r3)
            com.kwad.components.core.video.b r3 = r2.LU
            r3.a(r0)
            com.kwad.components.core.video.b r3 = r2.LU
            r3.start()
        L23:
            return
    }

    public final void bo() {
            r3 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            long r0 = com.kwad.sdk.utils.n.eN(r0)
            com.kwad.components.core.video.b r2 = r3.LU
            com.kwad.sdk.core.video.a.c r2 = r2.tz()
            if (r2 != 0) goto L11
            r3.bs()
        L11:
            r3.start(r0)
            com.kwad.components.core.widget.a.b r0 = r3.fg
            com.kwad.sdk.core.j.c r1 = r3.fo
            r0.a(r1)
            com.kwad.components.ad.draw.c.a$2 r0 = new com.kwad.components.ad.draw.c.a$2
            r0.<init>(r3)
            r3.a2(r0)
            return
    }

    public final void bq() {
            r2 = this;
            r0 = 0
            r2.fh = r0
            com.kwad.components.core.widget.a.b r0 = r2.fg
            com.kwad.sdk.core.j.c r1 = r2.fo
            r0.b(r1)
            com.kwad.components.core.video.b r0 = r2.LU
            r0.release()
            return
    }

    public final boolean br() {
            r1 = this;
            boolean r0 = r1.fn
            return r0
    }

    public final void g(boolean r1) {
            r0 = this;
            r0.fi = r1
            return
    }

    @Override // com.kwad.components.ad.k.b, com.kwad.components.ad.k.a
    public final void resume() {
            r2 = this;
            super.resume()
            android.content.Context r0 = r2.mContext
            com.kwad.components.core.t.a r0 = com.kwad.components.core.t.a.aC(r0)
            r1 = 0
            r0.aQ(r1)
            return
    }

    public final void setVideoSound(boolean r3) {
            r2 = this;
            com.kwad.components.core.video.b r0 = r2.LU
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 1
            if (r3 == 0) goto L11
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.setVolume(r3, r3)
            r3 = 0
            r2.fj = r3
            goto L17
        L11:
            r3 = 0
            r0.setVolume(r3, r3)
            r2.fj = r1
        L17:
            r2.fk = r1
            return
    }
}
