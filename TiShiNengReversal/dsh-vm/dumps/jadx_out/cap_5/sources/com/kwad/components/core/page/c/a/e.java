package com.kwad.components.core.page.c.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class e extends com.kwad.components.core.page.c.a.a {
    private android.widget.LinearLayout Tc;
    private android.widget.TextView Td;
    private android.widget.ImageView Te;



    public e() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ android.widget.LinearLayout a(com.kwad.components.core.page.c.a.e r0) {
            android.widget.LinearLayout r0 = r0.Tc
            return r0
    }

    private void rl() {
            r3 = this;
            int r0 = com.kwad.sdk.R.id.ksad_web_tip_bar
            android.view.View r0 = r3.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r3.Tc = r0
            com.kwad.components.core.page.c.a.b r0 = r3.TJ
            java.lang.String r0 = r0.mPageTitle
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 8
            if (r0 != 0) goto L1c
            android.widget.LinearLayout r0 = r3.Tc
            r0.setVisibility(r1)
            return
        L1c:
            int r0 = com.kwad.sdk.R.id.ksad_web_tip_bar_textview
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.Td = r0
            int r0 = com.kwad.sdk.R.id.ksad_web_tip_close_btn
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.Te = r0
            com.kwad.components.core.page.c.a.e$1 r2 = new com.kwad.components.core.page.c.a.e$1
            r2.<init>(r3)
            r0.setOnClickListener(r2)
            com.kwad.components.core.page.c.a.b r0 = r3.TJ
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            boolean r2 = com.kwad.sdk.core.response.b.a.bz(r0)
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.bv(r0)
            if (r2 == 0) goto L5c
            android.widget.LinearLayout r1 = r3.Tc
            r2 = 0
            r1.setVisibility(r2)
            android.widget.TextView r1 = r3.Td
            r1.setText(r0)
            android.widget.TextView r0 = r3.Td
            r1 = 1
            r0.setSelected(r1)
            goto L61
        L5c:
            android.widget.LinearLayout r0 = r3.Tc
            r0.setVisibility(r1)
        L61:
            com.kwad.components.core.page.c.a.b r0 = r3.TJ
            com.kwad.sdk.core.webview.KsAdWebView$c r1 = r3.rm()
            r0.a(r1)
            return
    }

    @androidx.annotation.NonNull
    private com.kwad.sdk.core.webview.KsAdWebView.c rm() {
            r1 = this;
            com.kwad.components.core.page.c.a.e$2 r0 = new com.kwad.components.core.page.c.a.e$2
            r0.<init>(r1)
            return r0
    }

    @Override // com.kwad.components.core.page.c.a.a, com.kwad.sdk.mvp.Presenter
    public final void at() {
            r0 = this;
            super.at()
            r0.rl()
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r0 = this;
            super.onCreate()
            return
    }
}
