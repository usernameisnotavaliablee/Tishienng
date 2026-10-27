package com.kwad.components.ad.interstitial.h;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b extends com.kwad.components.core.proxy.j implements android.view.View.OnClickListener {
    private static boolean nV;
    private android.widget.TextView fv;
    private android.widget.TextView ko;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private com.kwad.components.ad.interstitial.f.c mj;
    private com.kwad.components.core.widget.KSCornerImageView nR;
    private android.widget.TextView nS;
    private android.widget.TextView nT;
    private android.widget.TextView nU;

    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void e(com.kwad.components.ad.interstitial.f.c r4) {
            boolean r0 = com.kwad.components.ad.interstitial.h.b.nV
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            com.kwad.components.ad.interstitial.h.b.nV = r0
            com.kwad.components.ad.interstitial.h.b r0 = new com.kwad.components.ad.interstitial.h.b
            r0.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            com.kwad.sdk.core.response.model.AdTemplate r2 = r4.mAdTemplate
            org.json.JSONObject r2 = r2.toJson()
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "KEY_TEMPLATE"
            r1.putString(r3, r2)
            r0.setArguments(r1)
            r0.f(r4)
            com.kwad.components.ad.interstitial.d r4 = r4.kW
            android.app.Activity r4 = r4.getOwnerActivity()
            android.app.FragmentManager r4 = r4.getFragmentManager()
            java.lang.String r1 = "interstitialCloseDialog"
            r0.show(r4, r1)
            return
    }

    private void f(com.kwad.components.ad.interstitial.f.c r1) {
            r0 = this;
            r0.mj = r1
            return
    }

    private void initData() {
            r5 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r5.mAdTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            com.kwad.components.core.widget.KSCornerImageView r1 = r5.nR
            java.lang.String r2 = com.kwad.sdk.core.response.b.a.co(r0)
            com.kwad.sdk.core.response.model.AdTemplate r3 = r5.mAdTemplate
            r4 = 12
            com.kwad.sdk.core.imageloader.KSImageLoader.loadAppIcon(r1, r2, r3, r4)
            android.widget.TextView r1 = r5.ko
            java.lang.String r2 = com.kwad.sdk.core.response.b.a.cl(r0)
            r1.setText(r2)
            android.widget.TextView r1 = r5.fv
            java.lang.String r2 = com.kwad.sdk.core.response.b.a.au(r0)
            r1.setText(r2)
            com.kwad.sdk.core.response.model.AdTemplate r1 = r5.mAdTemplate
            boolean r1 = com.kwad.sdk.core.response.b.a.co(r1)
            if (r1 == 0) goto L36
            android.widget.TextView r1 = r5.nS
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.aE(r0)
            r1.setText(r0)
        L36:
            return
    }

    private void j(android.view.View r8) {
            r7 = this;
            int r0 = com.kwad.sdk.R.id.ksad_interstitial_intercept_app_icon
            android.view.View r0 = r8.findViewById(r0)
            com.kwad.components.core.widget.KSCornerImageView r0 = (com.kwad.components.core.widget.KSCornerImageView) r0
            r7.nR = r0
            int r0 = com.kwad.sdk.R.id.ksad_interstitial_intercept_app_title
            android.view.View r0 = r8.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.ko = r0
            int r0 = com.kwad.sdk.R.id.ksad_interstitial_intercept_dialog_desc
            android.view.View r0 = r8.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.fv = r0
            int r0 = com.kwad.sdk.R.id.ksad_interstitial_intercept_dialog_detail
            android.view.View r0 = r8.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.nS = r0
            int r0 = com.kwad.sdk.R.id.ksad_interstitial_intercept_dialog_btn_continue
            android.view.View r0 = r8.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.nT = r0
            int r0 = com.kwad.sdk.R.id.ksad_interstitial_intercept_dialog_btn_deny
            android.view.View r8 = r8.findViewById(r0)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r7.nU = r8
            com.kwad.components.core.widget.KSCornerImageView r0 = r7.nR
            android.widget.TextView r1 = r7.ko
            android.widget.TextView r2 = r7.fv
            android.widget.TextView r3 = r7.nS
            android.widget.TextView r4 = r7.nT
            r5 = 6
            android.view.View[] r5 = new android.view.View[r5]
            r6 = 0
            r5[r6] = r0
            r0 = 1
            r5[r0] = r1
            r0 = 2
            r5[r0] = r2
            r0 = 3
            r5[r0] = r3
            r0 = 4
            r5[r0] = r4
            r0 = 5
            r5[r0] = r8
            com.kwad.sdk.c.a.a.a(r7, r5)
            return
    }

    @Override // com.kwad.components.core.proxy.j
    public final android.view.View a(android.view.LayoutInflater r4, @androidx.annotation.Nullable android.view.ViewGroup r5) {
            r3 = this;
            android.os.Bundle r0 = r3.getArguments()
            java.lang.String r1 = "KEY_TEMPLATE"
            java.lang.String r0 = r0.getString(r1)
            com.kwad.sdk.core.response.model.AdTemplate r1 = new com.kwad.sdk.core.response.model.AdTemplate     // Catch: org.json.JSONException -> L19
            r1.<init>()     // Catch: org.json.JSONException -> L19
            r3.mAdTemplate = r1     // Catch: org.json.JSONException -> L19
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L19
            r2.<init>(r0)     // Catch: org.json.JSONException -> L19
            r1.parseJson(r2)     // Catch: org.json.JSONException -> L19
        L19:
            int r0 = com.kwad.sdk.R.layout.ksad_interstitial_exit_intercept_dialog
            android.view.View r4 = r4.inflate(r0, r5)
            r3.j(r4)
            r3.initData()
            return r4
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public final void onActivityCreated(android.os.Bundle r4) {
            r3 = this;
            super.onActivityCreated(r4)
            android.app.Dialog r4 = r3.getDialog()
            android.view.Window r4 = r4.getWindow()
            if (r4 != 0) goto Le
            goto L4c
        Le:
            android.app.Dialog r0 = r3.getDialog()
            r1 = 0
            r0.setCanceledOnTouchOutside(r1)
            r0 = -1
            r4.setLayout(r0, r0)
            android.app.Dialog r4 = r3.getDialog()
            android.view.Window r4 = r4.getWindow()
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r4.setBackgroundDrawable(r0)
            r3.setCancelable(r1)
            com.kwad.components.ad.interstitial.f.c r4 = r3.mj
            if (r4 == 0) goto L4c
            com.kwad.sdk.core.response.model.AdTemplate r4 = r4.mAdTemplate
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            com.kwad.sdk.core.adlog.c.b r1 = new com.kwad.sdk.core.adlog.c.b
            r1.<init>()
            r2 = 149(0x95, float:2.09E-43)
            com.kwad.sdk.core.adlog.c.b r1 = r1.df(r2)
            r2 = 9
            com.kwad.sdk.core.adlog.c.b r1 = r1.dk(r2)
            com.kwad.sdk.core.adlog.c.d(r4, r0, r1)
        L4c:
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r6) {
            r5 = this;
            com.kwad.components.ad.interstitial.f.c r0 = r5.mj
            r1 = 0
            if (r0 == 0) goto La9
            com.kwad.components.core.widget.KSCornerImageView r0 = r5.nR
            boolean r0 = r6.equals(r0)
            r2 = 2
            r3 = 9
            if (r0 == 0) goto L1f
            com.kwad.components.ad.interstitial.f.c r6 = r5.mj
            com.kwad.components.ad.interstitial.d r0 = r6.kW
            android.content.Context r0 = r0.getContext()
            r4 = 127(0x7f, float:1.78E-43)
            r6.a(r0, r4, r2, r3)
            goto La9
        L1f:
            android.widget.TextView r0 = r5.ko
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L36
            com.kwad.components.ad.interstitial.f.c r6 = r5.mj
            com.kwad.components.ad.interstitial.d r0 = r6.kW
            android.content.Context r0 = r0.getContext()
            r4 = 128(0x80, float:1.8E-43)
            r6.a(r0, r4, r2, r3)
            goto La9
        L36:
            android.widget.TextView r0 = r5.fv
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L4c
            com.kwad.components.ad.interstitial.f.c r6 = r5.mj
            com.kwad.components.ad.interstitial.d r0 = r6.kW
            android.content.Context r0 = r0.getContext()
            r4 = 129(0x81, float:1.81E-43)
            r6.a(r0, r4, r2, r3)
            goto La9
        L4c:
            android.widget.TextView r0 = r5.nS
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L62
            com.kwad.components.ad.interstitial.f.c r6 = r5.mj
            com.kwad.components.ad.interstitial.d r0 = r6.kW
            android.content.Context r0 = r0.getContext()
            r4 = 131(0x83, float:1.84E-43)
            r6.a(r0, r4, r2, r3)
            goto La9
        L62:
            android.widget.TextView r0 = r5.nT
            boolean r0 = r6.equals(r0)
            r2 = 0
            if (r0 == 0) goto L7c
            com.kwad.components.ad.interstitial.f.c r6 = r5.mj
            com.kwad.sdk.core.response.model.AdTemplate r6 = r6.mAdTemplate
            com.kwad.sdk.core.adlog.c.b r0 = new com.kwad.sdk.core.adlog.c.b
            r0.<init>()
            com.kwad.sdk.core.adlog.c.b r0 = r0.dk(r3)
            com.kwad.sdk.core.adlog.c.c(r6, r2, r0)
            goto La9
        L7c:
            android.widget.TextView r0 = r5.nU
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto La9
            com.kwad.components.ad.interstitial.f.c r6 = r5.mj
            r0 = -1
            com.kwad.sdk.core.video.videoview.a r4 = r6.cq
            r6.a(r1, r0, r4)
            com.kwad.components.ad.interstitial.f.c r6 = r5.mj
            com.kwad.components.ad.interstitial.d r6 = r6.kW
            r6.dismiss()
            com.kwad.components.ad.interstitial.f.c r6 = r5.mj
            com.kwad.sdk.core.response.model.AdTemplate r6 = r6.mAdTemplate
            com.kwad.sdk.core.adlog.c.b r0 = new com.kwad.sdk.core.adlog.c.b
            r0.<init>()
            r4 = 151(0x97, float:2.12E-43)
            com.kwad.sdk.core.adlog.c.b r0 = r0.df(r4)
            com.kwad.sdk.core.adlog.c.b r0 = r0.dk(r3)
            com.kwad.sdk.core.adlog.c.e(r6, r2, r0)
        La9:
            r5.dismiss()
            com.kwad.components.ad.interstitial.h.b.nV = r1
            return
    }
}
