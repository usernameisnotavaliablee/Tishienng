package com.kwad.components.ad.reward.presenter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class j extends com.kwad.components.ad.reward.presenter.b {


    public j() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r2 = this;
            super.at()
            com.kwad.components.ad.reward.g r0 = r2.tm     // Catch: java.lang.Throwable -> Lb
            com.kwad.components.ad.reward.m.e r0 = r0.rE     // Catch: java.lang.Throwable -> Lb
            r0.kS()     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r0 = move-exception
            com.kwad.components.ad.reward.presenter.j$1 r1 = new com.kwad.components.ad.reward.presenter.j$1
            r1.<init>(r2, r0)
            com.kwad.sdk.utils.bw.postOnUiThread(r1)
            return
    }
}
