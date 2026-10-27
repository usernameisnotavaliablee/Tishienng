package com.kwad.components.core.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a implements android.view.View.OnClickListener {

    @androidx.annotation.Nullable
    private android.widget.TextView Nm;

    @androidx.annotation.Nullable
    private android.widget.ImageView Nn;

    @androidx.annotation.Nullable
    private android.widget.ImageView No;

    @androidx.annotation.Nullable
    private com.kwad.components.core.b.a.InterfaceC0062a Np;
    private android.view.ViewGroup vV;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.components.core.b.a$a, reason: collision with other inner class name */
    public interface InterfaceC0062a {
        void x(android.view.View r1);

        void y(android.view.View r1);
    }

    public a(android.view.ViewGroup r2) {
            r1 = this;
            r1.<init>()
            if (r2 != 0) goto L6
            goto L12
        L6:
            int r0 = com.kwad.sdk.R.id.ksad_kwad_web_title_bar
            android.view.View r2 = r2.findViewById(r0)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r1.vV = r2
            if (r2 != 0) goto L13
        L12:
            return
        L13:
            r1.initView()
            return
    }

    private void initView() {
            r2 = this;
            android.view.ViewGroup r0 = r2.vV
            int r1 = com.kwad.sdk.R.id.ksad_kwad_titlebar_title
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.Nm = r0
            android.view.ViewGroup r0 = r2.vV
            int r1 = com.kwad.sdk.R.id.ksad_kwad_web_navi_back
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2.Nn = r0
            android.view.ViewGroup r0 = r2.vV
            int r1 = com.kwad.sdk.R.id.ksad_kwad_web_navi_close
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2.No = r0
            r0.setOnClickListener(r2)
            android.widget.ImageView r0 = r2.Nn
            r0.setOnClickListener(r2)
            return
    }

    public final void a(@androidx.annotation.Nullable com.kwad.components.core.b.a.InterfaceC0062a r1) {
            r0 = this;
            r0.Np = r1
            return
    }

    public final void a(com.kwad.components.core.b.b r2) {
            r1 = this;
            android.view.ViewGroup r0 = r1.vV
            if (r0 != 0) goto L5
            goto L10
        L5:
            android.widget.TextView r0 = r1.Nm
            if (r0 == 0) goto L10
            java.lang.String r2 = r2.getTitle()
            r0.setText(r2)
        L10:
            return
    }

    @androidx.annotation.MainThread
    public final void aj(boolean r2) {
            r1 = this;
            android.widget.ImageView r0 = r1.No
            if (r0 == 0) goto Ld
            if (r2 == 0) goto L8
            r2 = 0
            goto La
        L8:
            r2 = 8
        La:
            r0.setVisibility(r2)
        Ld:
            return
    }

    public final android.view.ViewGroup hP() {
            r1 = this;
            android.view.ViewGroup r0 = r1.vV
            return r0
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r2) {
            r1 = this;
            com.kwad.components.core.b.a$a r0 = r1.Np
            if (r0 != 0) goto L5
            goto L20
        L5:
            android.widget.ImageView r0 = r1.No
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L13
            com.kwad.components.core.b.a$a r0 = r1.Np
            r0.y(r2)
            return
        L13:
            android.widget.ImageView r0 = r1.Nn
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L20
            com.kwad.components.core.b.a$a r0 = r1.Np
            r0.x(r2)
        L20:
            return
    }
}
