package com.kwad.components.ad.k;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class b extends com.kwad.components.ad.k.a<com.kwad.components.core.video.l> {
    public com.kwad.components.core.video.b LU;
    private boolean LV;
    private com.kwad.components.core.video.l LW;
    protected com.kwad.components.core.video.DetailVideoView mDetailVideoView;


    public b(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r2, com.kwad.components.core.video.DetailVideoView r3) {
            r1 = this;
            r1.<init>(r2)
            r0 = 0
            r1.LV = r0
            com.kwad.components.ad.k.b$1 r0 = new com.kwad.components.ad.k.b$1
            r0.<init>(r1)
            r1.LW = r0
            r1.mDetailVideoView = r3
            com.kwad.components.core.video.b r3 = new com.kwad.components.core.video.b
            com.kwad.components.core.video.DetailVideoView r0 = r1.mDetailVideoView
            r3.<init>(r0, r2)
            r1.LU = r3
            r1.nH()
            return
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.k.b r0) {
            boolean r0 = r0.LV
            return r0
    }

    static /* synthetic */ void b(com.kwad.components.ad.k.b r0) {
            r0.nJ()
            return
    }

    private void nH() {
            r2 = this;
            com.kwad.components.core.video.b r0 = r2.LU
            com.kwad.components.core.video.l r1 = r2.LW
            r0.c(r1)
            return
    }

    private void nI() {
            r2 = this;
            com.kwad.components.core.video.b r0 = r2.LU
            if (r0 == 0) goto Le
            com.kwad.components.core.video.l r1 = r2.LW
            if (r1 == 0) goto Le
            r0.d(r1)
            r0 = 0
            r2.LW = r0
        Le:
            return
    }

    private void nJ() {
            r3 = this;
            com.kwad.components.core.p.a r0 = com.kwad.components.core.p.a.se()
            com.kwad.sdk.core.response.model.AdTemplate r1 = r3.mAdTemplate
            r2 = 21008(0x5210, float:2.9438E-41)
            r0.f(r1, r2)
            r0 = 1
            r3.LV = r0
            return
    }

    @Override // com.kwad.components.ad.k.a
    @androidx.annotation.MainThread
    public final /* synthetic */ void a(com.kwad.components.core.video.l r1) {
            r0 = this;
            com.kwad.components.core.video.l r1 = (com.kwad.components.core.video.l) r1
            r0.b2(r1)
            return
    }

    @androidx.annotation.MainThread
    /* renamed from: a, reason: avoid collision after fix types in other method */
    public final void a2(com.kwad.components.core.video.l r2) {
            r1 = this;
            if (r2 == 0) goto La
            com.kwad.components.core.video.b r0 = r1.LU
            if (r0 != 0) goto L7
            goto La
        L7:
            r0.c(r2)
        La:
            return
    }

    @Override // com.kwad.components.ad.k.a
    @androidx.annotation.MainThread
    public final /* synthetic */ void b(com.kwad.components.core.video.l r1) {
            r0 = this;
            com.kwad.components.core.video.l r1 = (com.kwad.components.core.video.l) r1
            r0.a2(r1)
            return
    }

    @androidx.annotation.MainThread
    /* renamed from: b, reason: avoid collision after fix types in other method */
    public final void b2(com.kwad.components.core.video.l r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            com.kwad.components.core.video.b r0 = r1.LU
            r0.d(r2)
            return
    }

    @Override // com.kwad.components.ad.k.a
    public long getPlayDuration() {
            r2 = this;
            com.kwad.components.core.video.b r0 = r2.LU
            if (r0 == 0) goto L9
            long r0 = r0.getPlayDuration()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.kwad.components.ad.k.a
    public void pause() {
            r1 = this;
            com.kwad.components.core.video.b r0 = r1.LU
            r0.pause()
            return
    }

    @Override // com.kwad.components.ad.k.a
    @androidx.annotation.WorkerThread
    public void release() {
            r1 = this;
            super.release()
            r0 = 0
            r1.LV = r0
            r1.nI()
            com.kwad.components.core.video.b r0 = r1.LU
            if (r0 == 0) goto L15
            r0.clear()
            com.kwad.components.core.video.b r0 = r1.LU
            r0.release()
        L15:
            return
    }

    @Override // com.kwad.components.ad.k.a
    public void resume() {
            r1 = this;
            com.kwad.components.core.video.b r0 = r1.LU
            r0.resume()
            return
    }
}
