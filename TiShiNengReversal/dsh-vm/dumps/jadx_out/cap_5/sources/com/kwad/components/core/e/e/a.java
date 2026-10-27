package com.kwad.components.core.e.e;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a extends com.kwad.sdk.widget.KSFrameLayout {
    private final android.app.DialogFragment PR;
    private final android.view.View PS;
    private com.kwad.components.core.e.d.a.C0073a PT;

    public a(@androidx.annotation.NonNull android.content.Context r1, android.app.DialogFragment r2, com.kwad.components.core.e.d.a.C0073a r3) {
            r0 = this;
            r0.<init>(r1)
            r0.PR = r2
            r0.PT = r3
            int r2 = com.kwad.sdk.R.layout.ksad_seconed_confirm_dialog_layout
            com.kwad.sdk.o.m.inflate(r1, r2, r0)
            int r1 = com.kwad.sdk.R.id.ksad_second_confirm_root_view
            android.view.View r1 = r0.findViewById(r1)
            r0.PS = r1
            return
    }

    private static com.kwad.sdk.mvp.Presenter bD() {
            com.kwad.sdk.mvp.Presenter r0 = new com.kwad.sdk.mvp.Presenter
            r0.<init>()
            com.kwad.components.core.e.e.d r1 = new com.kwad.components.core.e.e.d
            r1.<init>()
            r0.a(r1)
            return r0
    }

    private com.kwad.components.core.e.e.c pX() {
            r2 = this;
            com.kwad.components.core.e.e.c r0 = new com.kwad.components.core.e.e.c
            r0.<init>()
            android.app.DialogFragment r1 = r2.PR
            r0.PR = r1
            com.kwad.components.core.e.d.a$a r1 = r2.PT
            r0.PT = r1
            return r0
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout
    public final void aa() {
            r2 = this;
            super.aa()
            com.kwad.sdk.mvp.Presenter r0 = bD()
            android.view.View r1 = r2.PS
            r0.K(r1)
            com.kwad.components.core.e.e.c r1 = r2.pX()
            r0.n(r1)
            return
    }
}
