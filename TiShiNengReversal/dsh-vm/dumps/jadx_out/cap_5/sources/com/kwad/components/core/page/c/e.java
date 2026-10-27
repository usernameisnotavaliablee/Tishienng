package com.kwad.components.core.page.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class e extends com.kwad.components.core.page.c.c {
    private com.kwad.components.core.page.d.a mPlayModule;
    private com.kwad.components.core.video.l mVideoPlayStateListener;


    public e() {
            r1 = this;
            r1.<init>()
            com.kwad.components.core.page.c.e$1 r0 = new com.kwad.components.core.page.c.e$1
            r0.<init>(r1)
            r1.mVideoPlayStateListener = r0
            return
    }

    @Override // com.kwad.components.core.page.c.c, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r2 = this;
            super.at()
            com.kwad.components.core.page.c.d r0 = r2.TD
            com.kwad.components.core.page.d.a r0 = r0.mPlayModule
            r2.mPlayModule = r0
            com.kwad.components.core.video.l r1 = r2.mVideoPlayStateListener
            r0.a(r1)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            com.kwad.components.core.page.d.a r0 = r2.mPlayModule
            com.kwad.components.core.video.l r1 = r2.mVideoPlayStateListener
            r0.b(r1)
            return
    }
}
