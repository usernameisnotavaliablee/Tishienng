package com.kwad.components.ad.nativead.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a extends com.kwad.components.ad.nativead.a.a implements android.view.View.OnClickListener {
    private com.kwad.sdk.api.KsAdVideoPlayConfig bU;
    private com.kwad.sdk.core.response.model.AdInfo mAdInfo;
    private android.widget.TextView pA;
    private android.view.ViewGroup py;
    private android.widget.ImageView pz;


    public a(com.kwad.sdk.api.KsAdVideoPlayConfig r1) {
            r0 = this;
            r0.<init>()
            r0.bU = r1
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.nativead.b.a r0) {
            r0.fy()
            return
    }

    private boolean e(com.kwad.sdk.core.response.model.AdInfo r6) {
            r5 = this;
            boolean r0 = r6.isAllowVideoAutoPlay
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            android.content.Context r0 = r5.getContext()
            boolean r0 = com.kwad.sdk.utils.ao.isNetworkConnected(r0)
            r2 = 0
            if (r0 != 0) goto L12
            return r2
        L12:
            com.kwad.sdk.api.KsAdVideoPlayConfig r0 = r5.bU
            boolean r3 = r0 instanceof com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl
            if (r3 == 0) goto L5c
            com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl r0 = (com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl) r0
            int r3 = r0.getVideoAutoPlayType()
            if (r3 != r1) goto L21
            return r1
        L21:
            int r3 = r0.getVideoAutoPlayType()
            r4 = 2
            if (r3 != r4) goto L31
            android.content.Context r6 = r5.getContext()
            boolean r6 = com.kwad.sdk.utils.ao.isWifiConnected(r6)
            return r6
        L31:
            int r3 = r0.getVideoAutoPlayType()
            r4 = 3
            if (r3 != r4) goto L39
            return r2
        L39:
            int r3 = r0.getDataFlowAutoStartValue()
            if (r3 == 0) goto L5c
            android.content.Context r6 = r5.getContext()
            boolean r6 = com.kwad.sdk.utils.ao.isWifiConnected(r6)
            if (r6 != 0) goto L5b
            boolean r6 = r0.isDataFlowAutoStart()
            if (r6 == 0) goto L5a
            android.content.Context r6 = r5.getContext()
            boolean r6 = com.kwad.sdk.utils.ao.isMobileConnected(r6)
            if (r6 == 0) goto L5a
            goto L5b
        L5a:
            return r2
        L5b:
            return r1
        L5c:
            boolean r0 = com.kwad.sdk.core.response.b.a.cc(r6)
            if (r0 == 0) goto L63
            return r1
        L63:
            boolean r6 = com.kwad.sdk.core.response.b.a.cd(r6)
            if (r6 == 0) goto L74
            android.content.Context r6 = r5.getContext()
            boolean r6 = com.kwad.sdk.utils.ao.isWifiConnected(r6)
            if (r6 == 0) goto L74
            return r1
        L74:
            return r2
    }

    private void fy() {
            r2 = this;
            android.view.ViewGroup r0 = r2.py
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L9
            return
        L9:
            android.view.ViewGroup r0 = r2.py
            r1 = 8
            r0.setVisibility(r1)
            return
    }

    @Override // com.kwad.components.ad.nativead.a.a, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r4 = this;
            super.at()
            com.kwad.components.ad.nativead.a.b r0 = r4.pq
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            r4.mAdInfo = r0
            boolean r0 = r4.e(r0)
            if (r0 != 0) goto L3a
            com.kwad.sdk.core.response.model.AdInfo r0 = r4.mAdInfo
            int r0 = com.kwad.sdk.core.response.b.a.L(r0)
            android.widget.TextView r1 = r4.pA
            int r0 = r0 * 1000
            long r2 = (long) r0
            java.lang.String r0 = com.kwad.sdk.utils.bu.aq(r2)
            r1.setText(r0)
            android.widget.ImageView r0 = r4.pz
            r0.setOnClickListener(r4)
            com.kwad.components.ad.nativead.a.b r0 = r4.pq
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.VideoPlayerStatus r0 = r0.mVideoPlayerStatus
            r1 = 2
            r0.mVideoPlayerBehavior = r1
            android.view.ViewGroup r0 = r4.py
            r1 = 0
            r0.setVisibility(r1)
            goto L41
        L3a:
            android.view.ViewGroup r0 = r4.py
            r1 = 8
            r0.setVisibility(r1)
        L41:
            com.kwad.components.ad.nativead.b.a$1 r0 = new com.kwad.components.ad.nativead.b.a$1
            r0.<init>(r4)
            r4.mVideoPlayStateListener = r0
            com.kwad.components.ad.nativead.a.b r1 = r4.pq
            com.kwad.components.ad.nativead.c.a r1 = r1.pr
            r1.a2(r0)
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r2) {
            r1 = this;
            android.widget.ImageView r0 = r1.pz
            if (r2 != r0) goto L10
            com.kwad.components.ad.nativead.a.b r2 = r1.pq
            com.kwad.components.ad.nativead.c.a r2 = r2.pr
            r2.fL()
            com.kwad.sdk.core.response.model.AdInfo r2 = r1.mAdInfo
            r0 = 1
            r2.isAllowVideoAutoPlay = r0
        L10:
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r1 = this;
            super.onCreate()
            int r0 = com.kwad.sdk.R.id.ksad_data_flow_container
            android.view.View r0 = r1.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r1.py = r0
            int r0 = com.kwad.sdk.R.id.ksad_data_flow_play_btn
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.pz = r0
            int r0 = com.kwad.sdk.R.id.ksad_data_flow_play_tip
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.pA = r0
            return
    }
}
