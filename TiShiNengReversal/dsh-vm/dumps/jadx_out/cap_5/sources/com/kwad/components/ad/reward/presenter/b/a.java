package com.kwad.components.ad.reward.presenter.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a extends com.kwad.components.ad.reward.presenter.b {
    private com.kwad.components.offline.api.core.adlive.listener.AdLiveHandleClickListener ea;


    public a() {
            r1 = this;
            r1.<init>()
            com.kwad.components.ad.reward.presenter.b.a$1 r0 = new com.kwad.components.ad.reward.presenter.b.a$1
            r0.<init>(r1)
            r1.ea = r0
            return
    }

    static /* synthetic */ android.content.Context a(com.kwad.components.ad.reward.presenter.b.a r0) {
            android.content.Context r0 = r0.getContext()
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g b(com.kwad.components.ad.reward.presenter.b.a r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    static /* synthetic */ android.content.Context c(com.kwad.components.ad.reward.presenter.b.a r0) {
            android.content.Context r0 = r0.getContext()
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.reward.g d(com.kwad.components.ad.reward.presenter.b.a r0) {
            com.kwad.components.ad.reward.g r0 = r0.tm
            return r0
    }

    @Override // com.kwad.components.ad.reward.presenter.b, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r2 = this;
            super.at()
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView r0 = r0.dD
            if (r0 == 0) goto Le
            com.kwad.components.offline.api.core.adlive.listener.AdLiveHandleClickListener r1 = r2.ea
            r0.registerClickListener(r1)
        Le:
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
            r2 = this;
            super.onUnbind()
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView r0 = r0.dD
            if (r0 == 0) goto Le
            com.kwad.components.offline.api.core.adlive.listener.AdLiveHandleClickListener r1 = r2.ea
            r0.unRegisterClickListener(r1)
        Le:
            return
    }
}
