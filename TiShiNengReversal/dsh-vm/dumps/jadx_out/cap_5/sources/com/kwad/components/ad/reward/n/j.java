package com.kwad.components.ad.reward.n;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class j extends com.kwad.components.ad.reward.n.d implements android.view.View.OnClickListener {
    private android.view.View CA;
    private android.app.DialogFragment Cx;
    private android.widget.TextView Cy;
    private android.view.View Cz;
    private com.kwad.sdk.core.response.model.AdTemplate adTemplate;
    private android.widget.TextView fv;
    private android.widget.TextView ko;
    private com.kwad.components.core.widget.KSCornerImageView nR;
    private android.widget.TextView nS;
    private com.kwad.components.ad.reward.h.a sL;
    private android.view.ViewGroup vV;
    private android.view.View yJ;

    public j(android.app.DialogFragment r1, com.kwad.sdk.core.response.model.AdTemplate r2, android.view.LayoutInflater r3, android.view.ViewGroup r4, com.kwad.components.ad.reward.h.a r5) {
            r0 = this;
            r0.<init>()
            r0.Cx = r1
            r0.adTemplate = r2
            r0.sL = r5
            int r1 = com.kwad.sdk.R.layout.ksad_reward_jinniu_dialog
            r2 = 0
            android.view.View r1 = r3.inflate(r1, r4, r2)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r0.vV = r1
            r0.initView()
            return
    }

    private void initView() {
            r2 = this;
            android.view.ViewGroup r0 = r2.vV
            int r1 = com.kwad.sdk.R.id.ksad_reward_jinniu_dialog_icon
            android.view.View r0 = r0.findViewById(r1)
            com.kwad.components.core.widget.KSCornerImageView r0 = (com.kwad.components.core.widget.KSCornerImageView) r0
            r2.nR = r0
            android.view.ViewGroup r0 = r2.vV
            int r1 = com.kwad.sdk.R.id.ksad_reward_jinniu_dialog_title
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.ko = r0
            android.view.ViewGroup r0 = r2.vV
            int r1 = com.kwad.sdk.R.id.ksad_reward_jinniu_dialog_desc
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.fv = r0
            android.view.ViewGroup r0 = r2.vV
            int r1 = com.kwad.sdk.R.id.ksad_reward_jinniu_dialog_play_time_tips
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.Cy = r0
            android.view.ViewGroup r0 = r2.vV
            int r1 = com.kwad.sdk.R.id.ksad_reward_jinniu_dialog_detail
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.nS = r0
            android.view.ViewGroup r0 = r2.vV
            int r1 = com.kwad.sdk.R.id.ksad_reward_jinniu_dialog_btn_close
            android.view.View r0 = r0.findViewById(r1)
            r2.yJ = r0
            android.view.ViewGroup r0 = r2.vV
            int r1 = com.kwad.sdk.R.id.ksad_reward_jinniu_dialog_btn_deny
            android.view.View r0 = r0.findViewById(r1)
            r2.Cz = r0
            android.view.ViewGroup r0 = r2.vV
            int r1 = com.kwad.sdk.R.id.ksad_reward_jinniu_dialog_btn_continue
            android.view.View r0 = r0.findViewById(r1)
            r2.CA = r0
            android.view.View r0 = r2.yJ
            r0.setOnClickListener(r2)
            android.view.View r0 = r2.Cz
            r0.setOnClickListener(r2)
            android.view.View r0 = r2.CA
            r0.setOnClickListener(r2)
            com.kwad.components.core.widget.KSCornerImageView r0 = r2.nR
            r0.setOnClickListener(r2)
            android.widget.TextView r0 = r2.ko
            r0.setOnClickListener(r2)
            android.widget.TextView r0 = r2.fv
            r0.setOnClickListener(r2)
            android.widget.TextView r0 = r2.nS
            r0.setOnClickListener(r2)
            return
    }

    public final void a(com.kwad.components.ad.reward.h.c r5) {
            r4 = this;
            com.kwad.components.core.widget.KSCornerImageView r0 = r4.nR
            java.lang.String r1 = r5.ho()
            com.kwad.sdk.core.response.model.AdTemplate r2 = r4.adTemplate
            r3 = 4
            com.kwad.sdk.core.imageloader.KSImageLoader.loadAppIcon(r0, r1, r2, r3)
            android.widget.TextView r0 = r4.ko
            java.lang.String r1 = r5.getTitle()
            r0.setText(r1)
            android.widget.TextView r0 = r4.fv
            java.lang.String r1 = r5.hp()
            r0.setText(r1)
            android.widget.TextView r0 = r4.Cy
            java.lang.String r5 = r5.hr()
            r0.setText(r5)
            com.kwad.sdk.core.response.model.AdTemplate r5 = r4.adTemplate
            boolean r5 = com.kwad.sdk.core.response.b.a.co(r5)
            if (r5 == 0) goto L4a
            android.widget.TextView r5 = r4.nS
            com.kwad.sdk.core.response.model.AdTemplate r0 = r4.adTemplate
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.aE(r0)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "%s >"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r5.setText(r0)
        L4a:
            return
    }

    @Override // com.kwad.components.ad.reward.n.d
    public final android.view.ViewGroup hP() {
            r1 = this;
            android.view.ViewGroup r0 = r1.vV
            return r0
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r3) {
            r2 = this;
            android.view.View r0 = r2.yJ
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L15
            android.app.DialogFragment r3 = r2.Cx
            r3.dismiss()
            com.kwad.components.ad.reward.h$a r3 = r2.sL
            if (r3 == 0) goto L88
            r3.hj()
            return
        L15:
            android.view.View r0 = r2.Cz
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L2b
            android.app.DialogFragment r3 = r2.Cx
            r3.dismiss()
            com.kwad.components.ad.reward.h$a r3 = r2.sL
            if (r3 == 0) goto L88
            r0 = 0
            r3.G(r0)
            return
        L2b:
            android.view.View r0 = r2.CA
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L40
            android.app.DialogFragment r3 = r2.Cx
            r3.dismiss()
            com.kwad.components.ad.reward.h$a r3 = r2.sL
            if (r3 == 0) goto L88
            r3.hj()
            return
        L40:
            com.kwad.components.core.widget.KSCornerImageView r0 = r2.nR
            boolean r0 = r3.equals(r0)
            r1 = 2
            if (r0 == 0) goto L53
            com.kwad.components.ad.reward.h$a r3 = r2.sL
            if (r3 == 0) goto L88
            r0 = 127(0x7f, float:1.78E-43)
            r3.h(r0, r1)
            return
        L53:
            android.widget.TextView r0 = r2.ko
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L65
            com.kwad.components.ad.reward.h$a r3 = r2.sL
            if (r3 == 0) goto L88
            r0 = 128(0x80, float:1.8E-43)
            r3.h(r0, r1)
            return
        L65:
            android.widget.TextView r0 = r2.fv
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L77
            com.kwad.components.ad.reward.h$a r3 = r2.sL
            if (r3 == 0) goto L88
            r0 = 129(0x81, float:1.81E-43)
            r3.h(r0, r1)
            return
        L77:
            android.widget.TextView r0 = r2.nS
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L88
            com.kwad.components.ad.reward.h$a r3 = r2.sL
            if (r3 == 0) goto L88
            r0 = 131(0x83, float:1.84E-43)
            r3.h(r0, r1)
        L88:
            return
    }
}
