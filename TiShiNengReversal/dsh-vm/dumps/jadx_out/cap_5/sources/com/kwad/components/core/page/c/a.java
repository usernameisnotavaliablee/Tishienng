package com.kwad.components.core.page.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a extends com.kwad.sdk.mvp.Presenter {
    private int Ty;
    private com.kwad.components.core.widget.FeedVideoView Tz;




    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ int a(com.kwad.components.core.page.c.a r0, int r1) {
            r0.Ty = r1
            return r1
    }

    static /* synthetic */ com.kwad.components.core.widget.FeedVideoView a(com.kwad.components.core.page.c.a r0) {
            com.kwad.components.core.widget.FeedVideoView r0 = r0.Tz
            return r0
    }

    static /* synthetic */ int b(com.kwad.components.core.page.c.a r0) {
            int r0 = r0.Ty
            return r0
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void at() {
            r4 = this;
            super.at()
            java.lang.Object r0 = r4.NN()
            com.kwad.components.core.page.recycle.e r0 = (com.kwad.components.core.page.recycle.e) r0
            com.kwad.sdk.api.KsAdVideoPlayConfig$Builder r1 = new com.kwad.sdk.api.KsAdVideoPlayConfig$Builder
            r1.<init>()
            com.kwad.sdk.core.response.model.AdTemplate r2 = r0.adTemplate
            boolean r2 = r2.mIsAudioEnable
            com.kwad.sdk.api.KsAdVideoPlayConfig$Builder r1 = r1.videoSoundEnable(r2)
            com.kwad.sdk.api.KsAdVideoPlayConfig r1 = r1.build()
            android.view.View r2 = r4.getRootView()
            com.kwad.components.core.widget.FeedVideoView r2 = (com.kwad.components.core.widget.FeedVideoView) r2
            r4.Tz = r2
            com.kwad.sdk.core.response.model.AdTemplate r3 = r0.adTemplate
            com.kwad.sdk.core.response.model.AdResultData r3 = com.kwad.sdk.core.response.b.c.dW(r3)
            r2.d(r3)
            com.kwad.components.core.widget.FeedVideoView r2 = r4.Tz
            com.kwad.components.core.e.d.c r3 = r0.Pc
            r2.a(r1, r3)
            com.kwad.components.core.widget.FeedVideoView r1 = r4.Tz
            r2 = 0
            r1.setVisibility(r2)
            com.kwad.sdk.core.response.model.AdTemplate r1 = r0.adTemplate
            com.kwad.sdk.core.response.model.AdInfo r1 = com.kwad.sdk.core.response.b.e.el(r1)
            com.kwad.components.core.widget.FeedVideoView r2 = r4.Tz
            com.kwad.components.core.page.c.a$1 r3 = new com.kwad.components.core.page.c.a$1
            r3.<init>(r4, r1, r0)
            r2.setOnEndBtnClickListener(r3)
            boolean r2 = com.kwad.sdk.core.response.b.a.aq(r1)
            if (r2 == 0) goto L58
            com.kwad.components.core.widget.FeedVideoView r2 = r4.Tz
            com.kwad.components.core.page.c.a$2 r3 = new com.kwad.components.core.page.c.a$2
            r3.<init>(r4, r1, r0)
            r2.setOnClickListener(r3)
        L58:
            com.kwad.components.core.widget.FeedVideoView r1 = r4.Tz
            com.kwad.components.core.page.c.a$3 r2 = new com.kwad.components.core.page.c.a$3
            r2.<init>(r4, r0)
            r1.setWindowFullScreenListener(r2)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r0 = this;
            super.onCreate()
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r1 = this;
            super.onUnbind()
            com.kwad.components.core.widget.FeedVideoView r0 = r1.Tz
            r0.release()
            return
    }
}
