package com.kwad.components.core.e.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"ViewConstructor"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class g extends com.kwad.sdk.widget.KSFrameLayout {
    private final com.kwad.components.core.e.a.d Ol;
    private com.kwad.components.core.e.a.a Ou;
    private final com.kwad.components.core.e.a.d Ow;
    private final com.kwad.components.core.widget.a.b fg;
    private final com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private com.kwad.sdk.mvp.Presenter mPresenter;
    private boolean qU;


    public g(@androidx.annotation.NonNull android.content.Context r1, com.kwad.sdk.core.response.model.AdTemplate r2, com.kwad.components.core.e.a.d r3) {
            r0 = this;
            r0.<init>(r1)
            com.kwad.components.core.e.a.g$1 r1 = new com.kwad.components.core.e.a.g$1
            r1.<init>(r0)
            r0.Ow = r1
            r0.mAdTemplate = r2
            r0.Ol = r3
            com.kwad.components.core.widget.a.b r1 = new com.kwad.components.core.widget.a.b
            r2 = 70
            r1.<init>(r0, r2)
            r0.fg = r1
            r0.initMVP()
            return
    }

    static /* synthetic */ void a(com.kwad.components.core.e.a.g r0) {
            r0.eL()
            return
    }

    private void eL() {
            r1 = this;
            boolean r0 = r1.qU
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1.qU = r0
            com.kwad.components.core.e.a.d r0 = r1.Ol
            r0.oJ()
            return
    }

    private void initMVP() {
            r2 = this;
            com.kwad.components.core.e.a.a r0 = r2.oQ()
            r2.Ou = r0
            com.kwad.sdk.mvp.Presenter r0 = onCreatePresenter()
            r2.mPresenter = r0
            r0.K(r2)
            com.kwad.sdk.mvp.Presenter r0 = r2.mPresenter
            com.kwad.components.core.e.a.a r1 = r2.Ou
            r0.n(r1)
            return
    }

    private com.kwad.components.core.e.a.a oQ() {
            r2 = this;
            com.kwad.components.core.e.a.a r0 = new com.kwad.components.core.e.a.a
            r0.<init>()
            r0.Oj = r2
            com.kwad.sdk.core.response.model.AdTemplate r1 = r2.mAdTemplate
            r0.mAdTemplate = r1
            com.kwad.components.core.widget.a.b r1 = r2.fg
            r0.Ok = r1
            com.kwad.components.core.e.a.d r1 = r2.Ow
            r0.Ol = r1
            return r0
    }

    private static com.kwad.sdk.mvp.Presenter onCreatePresenter() {
            com.kwad.sdk.mvp.Presenter r0 = new com.kwad.sdk.mvp.Presenter
            r0.<init>()
            com.kwad.components.core.e.a.f r1 = new com.kwad.components.core.e.a.f
            r1.<init>()
            r0.a(r1)
            return r0
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout
    public final void aa() {
            r2 = this;
            super.aa()
            java.lang.String r0 = "InstalledActivateView"
            java.lang.String r1 = "onViewAttached"
            com.kwad.sdk.core.d.c.d(r0, r1)
            com.kwad.components.core.widget.a.b r0 = r2.fg
            r0.wi()
            return
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout
    public final void ab() {
            r2 = this;
            super.ab()
            java.lang.String r0 = "InstalledActivateView"
            java.lang.String r1 = "onViewDetached"
            com.kwad.sdk.core.d.c.d(r0, r1)
            com.kwad.components.core.widget.a.b r0 = r2.fg
            r0.release()
            com.kwad.sdk.mvp.Presenter r0 = r2.mPresenter
            r0.destroy()
            com.kwad.components.core.e.a.a r0 = r2.Ou
            r0.release()
            r2.eL()
            return
    }
}
