package com.kwad.components.ad.splashscreen.e;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b implements com.kwad.sdk.widget.d {
    private com.kwad.components.ad.splashscreen.e.a Gy;
    private android.view.ViewStub Jq;
    private android.view.ViewGroup Jr;
    private android.view.View Js;
    private android.widget.TextView Jt;
    private boolean Ju;

    @androidx.annotation.Nullable
    private com.kwad.components.ad.splashscreen.e Jv;
    private com.kwad.sdk.widget.h Jw;

    @androidx.annotation.NonNull
    private android.view.ViewGroup jI;

    @androidx.annotation.Nullable
    private com.kwad.sdk.core.response.model.AdInfo mAdInfo;

    @androidx.annotation.Nullable
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;


    public b(@androidx.annotation.NonNull android.view.ViewGroup r1, android.view.ViewStub r2, boolean r3, com.kwad.components.core.e.d.c r4) {
            r0 = this;
            r0.<init>()
            r0.jI = r1
            r0.Jq = r2
            r0.mApkDownloadHelper = r4
            r0.Ju = r3
            return
    }

    private void a(com.kwad.components.ad.splashscreen.d r1) {
            r0 = this;
            if (r1 != 0) goto L3
            return
        L3:
            java.lang.String r1 = r1.lA()
            r0.ab(r1)
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.splashscreen.e.b r0, java.lang.String r1) {
            r0.ab(r1)
            return
    }

    private void ab(java.lang.String r2) {
            r1 = this;
            android.widget.TextView r0 = r1.Jt
            if (r0 == 0) goto L9
            if (r2 == 0) goto L9
            r0.setText(r2)
        L9:
            return
    }

    private void g(android.view.ViewGroup r4) {
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            int r0 = com.kwad.sdk.R.id.ksad_splash_actionbar_native
            android.view.View r0 = r4.findViewById(r0)
            r3.Js = r0
            int r0 = com.kwad.sdk.R.id.ksad_splash_actionbar_text
            android.view.View r4 = r4.findViewById(r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.Jt = r4
            com.kwad.sdk.widget.h r4 = new com.kwad.sdk.widget.h
            android.view.View r0 = r3.Js
            android.content.Context r0 = r0.getContext()
            android.view.View r1 = r3.Js
            r4.<init>(r0, r1, r3)
            r3.Jw = r4
            com.kwad.sdk.core.response.model.AdTemplate r4 = r3.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = r3.mAdInfo
            com.kwad.components.core.e.d.c r1 = r3.mApkDownloadHelper
            r2 = 4
            com.kwad.components.ad.splashscreen.d r4 = com.kwad.components.ad.splashscreen.d.a(r4, r0, r1, r2)
            r3.a(r4)
            return
    }

    private void i(boolean r2, boolean r3) {
            r1 = this;
            com.kwad.components.ad.splashscreen.e r0 = r1.Jv
            if (r0 == 0) goto L7
            r0.h(r2, r3)
        L7:
            return
    }

    @Override // com.kwad.sdk.widget.d
    public final void a(android.view.View r2) {
            r1 = this;
            android.view.View r0 = r1.Js
            boolean r2 = r2.equals(r0)
            r0 = 1
            r1.i(r0, r2)
            return
    }

    public final void a(@androidx.annotation.Nullable com.kwad.components.ad.splashscreen.e r1) {
            r0 = this;
            r0.Jv = r1
            return
    }

    public final void as(com.kwad.sdk.core.response.model.AdTemplate r4) {
            r3 = this;
            r3.mAdTemplate = r4
            com.kwad.components.ad.splashscreen.e.a r0 = r3.Gy
            if (r0 != 0) goto L16
            com.kwad.components.ad.splashscreen.e.b$1 r0 = new com.kwad.components.ad.splashscreen.e.b$1
            android.view.ViewGroup r1 = r3.jI
            android.content.Context r1 = r1.getContext()
            com.kwad.sdk.core.response.model.AdTemplate r2 = r3.mAdTemplate
            r0.<init>(r3, r1, r2)
            r3.Gy = r0
            goto L19
        L16:
            r0.setAdTemplate(r4)
        L19:
            if (r4 == 0) goto L21
            com.kwad.sdk.core.response.model.AdInfo r4 = com.kwad.sdk.core.response.b.e.el(r4)
            r3.mAdInfo = r4
        L21:
            com.kwad.components.core.e.d.c r4 = r3.mApkDownloadHelper
            if (r4 == 0) goto L2c
            com.kwad.components.ad.splashscreen.e.a r0 = r3.Gy
            if (r0 == 0) goto L2c
            r4.b(r0)
        L2c:
            return
    }

    @Override // com.kwad.sdk.widget.d
    public final void b(android.view.View r2) {
            r1 = this;
            boolean r0 = r1.Ju
            if (r0 != 0) goto L5
            return
        L5:
            android.view.View r0 = r1.Js
            boolean r2 = r2.equals(r0)
            r0 = 0
            r1.i(r0, r2)
            return
    }

    public final void mA() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "rollBackToNative mRootViewStub: "
            r0.<init>(r1)
            android.view.ViewStub r1 = r2.Jq
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "SplashActionBarNativeHelper"
            com.kwad.sdk.core.d.c.d(r1, r0)
            android.view.ViewGroup r0 = r2.Jr
            if (r0 != 0) goto L3f
            android.view.ViewStub r0 = r2.Jq
            if (r0 == 0) goto L2e
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L2e
            android.view.ViewStub r0 = r2.Jq
            android.view.View r0 = r0.inflate()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r2.Jr = r0
            goto L3a
        L2e:
            android.view.ViewGroup r0 = r2.jI
            int r1 = com.kwad.sdk.R.id.ksad_splash_actionbar_native_root
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r2.Jr = r0
        L3a:
            android.view.ViewGroup r0 = r2.Jr
            r2.g(r0)
        L3f:
            android.view.ViewGroup r0 = r2.Jr
            if (r0 == 0) goto L47
            r1 = 0
            r0.setVisibility(r1)
        L47:
            return
    }

    public final void onUnbind() {
            r2 = this;
            com.kwad.components.core.e.d.c r0 = r2.mApkDownloadHelper
            if (r0 == 0) goto Lb
            com.kwad.components.ad.splashscreen.e.a r1 = r2.Gy
            if (r1 == 0) goto Lb
            r0.c(r1)
        Lb:
            return
    }
}
