package com.kwad.components.ad.reward.n;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class m extends com.kwad.components.ad.reward.n.d implements android.view.View.OnClickListener {
    private android.view.View CA;
    private android.view.ViewGroup CN;
    private android.view.View CO;
    private android.widget.TextView CP;
    private android.widget.TextView CQ;
    private android.widget.TextView CR;
    private android.view.View CS;
    private android.app.DialogFragment Cx;
    private android.widget.ImageView ig;
    private android.widget.TextView ko;
    private com.kwad.components.ad.reward.h.a sL;

    public m(android.app.DialogFragment r1, com.kwad.sdk.core.response.model.AdTemplate r2, android.view.LayoutInflater r3, android.view.ViewGroup r4, com.kwad.components.ad.reward.h.a r5) {
            r0 = this;
            r0.<init>()
            r0.Cx = r1
            r0.sL = r5
            com.kwad.sdk.core.response.model.AdInfo r1 = com.kwad.sdk.core.response.b.e.el(r2)
            boolean r1 = com.kwad.sdk.core.response.b.a.cR(r1)
            r2 = 0
            if (r1 == 0) goto L21
            int r1 = com.kwad.sdk.R.layout.ksad_live_origin_dialog
            android.view.View r1 = r3.inflate(r1, r4, r2)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r0.CN = r1
            r1 = 1
            r0.t(r1)
            return
        L21:
            int r1 = com.kwad.sdk.R.layout.ksad_live_subscribe_dialog
            android.view.View r1 = r3.inflate(r1, r4, r2)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r0.CN = r1
            r0.t(r2)
            return
    }

    private void t(boolean r3) {
            r2 = this;
            android.view.ViewGroup r0 = r2.CN
            int r1 = com.kwad.sdk.R.id.ksad_live_subscribe_dialog_btn_close
            android.view.View r0 = r0.findViewById(r1)
            r2.CO = r0
            android.view.ViewGroup r0 = r2.CN
            int r1 = com.kwad.sdk.R.id.ksad_live_subscribe_dialog_title
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.ko = r0
            android.view.ViewGroup r0 = r2.CN
            int r1 = com.kwad.sdk.R.id.ksad_live_subscribe_dialog_icon
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2.ig = r0
            android.view.ViewGroup r0 = r2.CN
            int r1 = com.kwad.sdk.R.id.ksad_live_subscribe_dialog_content_txt
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.CQ = r0
            android.view.ViewGroup r0 = r2.CN
            int r1 = com.kwad.sdk.R.id.ksad_live_subscribe_dialog_content
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.CP = r0
            android.view.ViewGroup r0 = r2.CN
            int r1 = com.kwad.sdk.R.id.ksad_live_subscribe_dialog_btn_continue
            android.view.View r0 = r0.findViewById(r1)
            r2.CA = r0
            android.view.ViewGroup r0 = r2.CN
            int r1 = com.kwad.sdk.R.id.ksad_live_subscribe_dialog_btn_deny
            android.view.View r0 = r0.findViewById(r1)
            r2.CS = r0
            android.view.ViewGroup r0 = r2.CN
            int r1 = com.kwad.sdk.R.id.ksad_live_subscribe_dialog_vide_detail
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.CR = r0
            if (r3 == 0) goto L63
            android.view.View r3 = r2.CO
            r0 = 8
            r3.setVisibility(r0)
        L63:
            android.view.View r3 = r2.CO
            r3.setOnClickListener(r2)
            android.view.View r3 = r2.CA
            r3.setOnClickListener(r2)
            android.view.View r3 = r2.CS
            r3.setOnClickListener(r2)
            android.widget.TextView r3 = r2.CR
            r3.setOnClickListener(r2)
            return
    }

    public final void a(com.kwad.components.ad.reward.h.c r8) {
            r7 = this;
            java.lang.String r0 = r8.ho()
            android.view.ViewGroup r1 = r7.CN
            android.content.Context r1 = r1.getContext()
            android.content.res.Resources r1 = r1.getResources()
            int r2 = com.kwad.sdk.R.drawable.ksad_ic_default_user_avatar
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
            android.widget.ImageView r2 = r7.ig
            com.kwad.sdk.core.imageloader.KSImageLoader.loadCircleIcon(r2, r0, r1)
            java.lang.String r0 = r8.getTitle()
            android.widget.TextView r1 = r7.ko
            if (r1 == 0) goto L55
            if (r0 == 0) goto L55
            android.text.SpannableString r1 = new android.text.SpannableString
            r1.<init>(r0)
            android.view.ViewGroup r2 = r7.hP()
            android.content.res.Resources r2 = r2.getResources()
            int r3 = com.kwad.sdk.R.color.ksad_reward_main_color
            int r2 = r2.getColor(r3)
            android.text.style.ForegroundColorSpan r3 = new android.text.style.ForegroundColorSpan
            r3.<init>(r2)
            r4 = 4
            r5 = 2
            r6 = 18
            r1.setSpan(r3, r5, r4, r6)
            android.text.style.ForegroundColorSpan r3 = new android.text.style.ForegroundColorSpan
            r3.<init>(r2)
            int r0 = r0.length()
            int r2 = r0 + (-2)
            r1.setSpan(r3, r2, r0, r6)
            android.widget.TextView r0 = r7.ko
            r0.setText(r1)
        L55:
            android.widget.TextView r0 = r7.CP
            java.lang.String r1 = r8.hp()
            r0.setText(r1)
            android.widget.TextView r0 = r7.CQ
            java.lang.String r1 = r8.hq()
            r0.setText(r1)
            android.widget.TextView r0 = r7.CR
            java.lang.String r8 = r8.sU
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r8
            java.lang.String r8 = "%s"
            java.lang.String r8 = java.lang.String.format(r8, r1)
            r0.setText(r8)
            return
    }

    @Override // com.kwad.components.ad.reward.n.d
    public final android.view.ViewGroup hP() {
            r1 = this;
            android.view.ViewGroup r0 = r1.CN
            return r0
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r3) {
            r2 = this;
            android.view.View r0 = r2.CO
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L15
            android.app.DialogFragment r3 = r2.Cx
            r3.dismiss()
            com.kwad.components.ad.reward.h$a r3 = r2.sL
            if (r3 == 0) goto L52
            r3.hj()
            return
        L15:
            android.view.View r0 = r2.CA
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L2a
            android.app.DialogFragment r3 = r2.Cx
            r3.dismiss()
            com.kwad.components.ad.reward.h$a r3 = r2.sL
            if (r3 == 0) goto L52
            r3.hj()
            return
        L2a:
            android.view.View r0 = r2.CS
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L40
            android.app.DialogFragment r3 = r2.Cx
            r3.dismiss()
            com.kwad.components.ad.reward.h$a r3 = r2.sL
            if (r3 == 0) goto L52
            r0 = 0
            r3.G(r0)
            return
        L40:
            android.widget.TextView r0 = r2.CR
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L52
            com.kwad.components.ad.reward.h$a r3 = r2.sL
            if (r3 == 0) goto L52
            r0 = 131(0x83, float:1.84E-43)
            r1 = 2
            r3.h(r0, r1)
        L52:
            return
    }
}
