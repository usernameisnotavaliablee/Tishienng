package com.kwad.components.core.e.e;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d extends com.kwad.components.core.e.e.b implements android.view.View.OnClickListener {
    private android.widget.TextView PV;
    private android.widget.TextView PW;
    private android.widget.TextView tM;

    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kwad.components.core.e.e.b, com.kwad.sdk.mvp.Presenter
    @android.annotation.SuppressLint({"SetTextI18n"})
    public final void at() {
            r5 = this;
            super.at()
            com.kwad.components.core.e.e.c r0 = r5.PU
            com.kwad.components.core.e.d.a$a r0 = r0.PT
            int r0 = r0.pg()
            r1 = 2
            r2 = 1
            if (r0 != r2) goto L29
            android.widget.TextView r0 = r5.tM
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "即将打开"
            r3.<init>(r4)
            com.kwad.sdk.core.response.model.AdInfo r4 = r5.mAdInfo
            java.lang.String r4 = com.kwad.sdk.core.response.b.a.cm(r4)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.setText(r3)
            goto L3a
        L29:
            com.kwad.components.core.e.e.c r0 = r5.PU
            com.kwad.components.core.e.d.a$a r0 = r0.PT
            int r0 = r0.pg()
            if (r0 != r1) goto L3a
            android.widget.TextView r0 = r5.tM
            java.lang.String r3 = "即将打开第三方页面"
            r0.setText(r3)
        L3a:
            android.widget.TextView r0 = r5.PV
            android.widget.TextView r3 = r5.PW
            android.view.View[] r1 = new android.view.View[r1]
            r4 = 0
            r1[r4] = r0
            r1[r2] = r3
            com.kwad.sdk.c.a.a.a(r5, r1)
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r3) {
            r2 = this;
            com.kwad.components.core.e.e.c r0 = r2.PU
            com.kwad.components.core.e.d.a$a r0 = r0.PT
            r1 = 1
            r0.am(r1)
            com.kwad.components.core.e.e.c r0 = r2.PU
            android.app.DialogFragment r0 = r0.PR
            r0.dismiss()
            android.widget.TextView r0 = r2.PV
            if (r3 != r0) goto L28
            com.kwad.components.core.e.e.c r3 = r2.PU
            com.kwad.components.core.e.d.a$a r3 = r3.PT
            com.kwad.components.core.e.d.a.a(r3)
            com.kwad.components.core.e.e.c r3 = r2.PU
            com.kwad.components.core.e.d.a$a r3 = r3.PT
            com.kwad.sdk.core.response.model.AdTemplate r3 = r3.getAdTemplate()
            r0 = 230(0xe6, float:3.22E-43)
            com.kwad.sdk.core.adlog.c.p(r3, r0)
            return
        L28:
            android.widget.TextView r0 = r2.PW
            if (r3 != r0) goto L39
            com.kwad.components.core.e.e.c r3 = r2.PU
            com.kwad.components.core.e.d.a$a r3 = r3.PT
            com.kwad.sdk.core.response.model.AdTemplate r3 = r3.getAdTemplate()
            r0 = 231(0xe7, float:3.24E-43)
            com.kwad.sdk.core.adlog.c.p(r3, r0)
        L39:
            return
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
            r1 = this;
            super.onCreate()
            int r0 = com.kwad.sdk.R.id.ksad_second_confirm_content_view
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.tM = r0
            int r0 = com.kwad.sdk.R.id.ksad_second_confirm_ensure
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.PV = r0
            int r0 = com.kwad.sdk.R.id.ksad_second_confirm_cancle
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.PW = r0
            return
    }
}
