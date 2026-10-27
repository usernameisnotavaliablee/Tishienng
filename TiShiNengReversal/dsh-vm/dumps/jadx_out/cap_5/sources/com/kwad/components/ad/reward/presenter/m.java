package com.kwad.components.ad.reward.presenter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class m extends com.kwad.components.ad.reward.presenter.b {
    private final com.kwad.components.core.video.m jE;
    private long jY;

    @androidx.annotation.NonNull
    private com.kwad.components.ad.reward.e.b rD;
    private com.kwad.components.core.video.m vQ;
    private com.kwad.components.core.video.m vR;



    public m() {
            r1 = this;
            r1.<init>()
            com.kwad.components.ad.reward.presenter.m$1 r0 = new com.kwad.components.ad.reward.presenter.m$1
            r0.<init>(r1)
            r1.vR = r0
            com.kwad.components.ad.reward.presenter.m$2 r0 = new com.kwad.components.ad.reward.presenter.m$2
            r0.<init>(r1)
            r1.jE = r0
            return
    }

    static /* synthetic */ long a(com.kwad.components.ad.reward.presenter.m r0, long r1) {
            r0.jY = r1
            return r1
    }

    static /* synthetic */ com.kwad.components.ad.reward.e.b a(com.kwad.components.ad.reward.presenter.m r0) {
            com.kwad.components.ad.reward.e.b r0 = r0.rD
            return r0
    }

    static /* synthetic */ long b(com.kwad.components.ad.reward.presenter.m r2) {
            long r0 = r2.jY
            return r0
    }

    @Override // com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r3 = this;
            super.at()
            com.kwad.components.ad.reward.g r0 = r3.tm
            r1 = 0
            r0.sr = r1
            r1 = 0
            r0.ss = r1
            com.kwad.components.ad.reward.e.b r1 = r0.rD
            r3.rD = r1
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            boolean r0 = r0.kW()
            if (r0 == 0) goto L1d
            com.kwad.components.core.video.m r0 = r3.vR
            r3.vQ = r0
            goto L21
        L1d:
            com.kwad.components.core.video.m r0 = r3.jE
            r3.vQ = r0
        L21:
            com.kwad.components.ad.reward.g r0 = r3.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            com.kwad.components.core.video.m r1 = r3.vQ
            r0.a(r1)
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r2 = this;
            super.onUnbind()
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.ad.reward.m.e r0 = r0.rE
            com.kwad.components.core.video.m r1 = r2.vQ
            r0.b(r1)
            return
    }
}
