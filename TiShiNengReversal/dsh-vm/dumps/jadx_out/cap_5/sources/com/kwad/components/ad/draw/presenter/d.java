package com.kwad.components.ad.draw.presenter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d extends com.kwad.components.ad.draw.b.a {
    private android.widget.TextView dY;
    private com.kwad.components.core.video.l mVideoPlayStateListener;


    public d() {
            r1 = this;
            r1.<init>()
            com.kwad.components.ad.draw.presenter.d$1 r0 = new com.kwad.components.ad.draw.presenter.d$1
            r0.<init>(r1)
            r1.mVideoPlayStateListener = r0
            return
    }

    static /* synthetic */ android.widget.TextView a(com.kwad.components.ad.draw.presenter.d r0) {
            android.widget.TextView r0 = r0.dY
            return r0
    }

    @Override // com.kwad.components.ad.draw.b.a, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r2 = this;
            super.at()
            android.content.Context r0 = r2.getContext()
            boolean r0 = com.kwad.sdk.utils.ao.isNetworkConnected(r0)
            if (r0 != 0) goto L14
            android.widget.TextView r0 = r2.dY
            r1 = 0
            r0.setVisibility(r1)
            goto L1b
        L14:
            android.widget.TextView r0 = r2.dY
            r1 = 8
            r0.setVisibility(r1)
        L1b:
            com.kwad.components.ad.draw.b.b r0 = r2.dz
            com.kwad.components.ad.draw.c.a r0 = r0.dB
            com.kwad.components.core.video.l r1 = r2.mVideoPlayStateListener
            r0.a2(r1)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r1 = this;
            super.onCreate()
            int r0 = com.kwad.sdk.R.id.ksad_video_fail_tip
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.dY = r0
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            com.kwad.components.ad.draw.b.b r0 = r2.dz
            com.kwad.components.ad.draw.c.a r0 = r0.dB
            com.kwad.components.core.video.l r1 = r2.mVideoPlayStateListener
            r0.b2(r1)
            return
    }
}
