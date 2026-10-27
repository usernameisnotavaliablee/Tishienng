package com.kwad.components.core.s.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b extends com.kwad.sdk.mvp.Presenter {
    private android.widget.FrameLayout Yp;
    private com.kwad.components.core.s.a.b Ys;
    private com.kwad.sdk.components.o Yv;


    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ com.kwad.components.core.s.a.b a(com.kwad.components.core.s.b.b r0) {
            com.kwad.components.core.s.a.b r0 = r0.Ys
            return r0
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void at() {
            r4 = this;
            super.at()
            java.lang.Object r0 = r4.NN()
            com.kwad.components.core.s.a.b r0 = (com.kwad.components.core.s.a.b) r0
            r4.Ys = r0
            int r0 = com.kwad.sdk.R.id.ksad_js_container
            android.view.View r0 = r4.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r4.Yp = r0
            com.kwad.components.core.s.a.b r0 = r4.Ys
            com.kwad.components.core.webview.tachikoma.k r0 = r0.Yj
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r3 = 0
            r1[r3] = r2
            com.kwad.sdk.components.o r0 = r0.a(r1)
            r4.Yv = r0
            com.kwad.components.core.s.a.b r0 = r4.Ys
            java.util.List<com.kwad.components.core.m.a.a> r0 = r0.Rt
            com.kwad.components.core.s.b.b$1 r1 = new com.kwad.components.core.s.b.b$1
            r1.<init>(r4)
            r0.add(r1)
            com.kwad.sdk.components.o r0 = r4.Yv
            if (r0 != 0) goto L44
            android.app.Activity r0 = r4.getActivity()
            if (r0 == 0) goto L43
            android.app.Activity r0 = r4.getActivity()
            r0.finish()
        L43:
            return
        L44:
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -1
            r0.<init>(r1, r1)
            com.kwad.sdk.components.o r1 = r4.Yv
            android.view.View r1 = r1.getView()
            r1.setLayoutParams(r0)
            android.widget.FrameLayout r0 = r4.Yp
            r0.addView(r1)
            com.kwad.sdk.components.o r0 = r4.Yv
            android.app.Activity r1 = r4.getActivity()
            r0.bindActivity(r1)
            com.kwad.sdk.components.o r0 = r4.Yv
            r0.render()
            return
    }

    public final boolean onBackPressed() {
            r1 = this;
            com.kwad.sdk.components.o r0 = r1.Yv
            if (r0 == 0) goto Lc
            boolean r0 = r0.onBackPressed()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
            r0 = this;
            super.onUnbind()
            return
    }
}
