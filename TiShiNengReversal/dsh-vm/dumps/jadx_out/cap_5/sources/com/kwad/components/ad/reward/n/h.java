package com.kwad.components.ad.reward.n;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class h extends com.kwad.components.ad.reward.n.s implements android.view.View.OnClickListener {
    protected android.widget.ImageView BA;

    @androidx.annotation.Nullable
    protected com.kwad.components.ad.widget.KsAppTagsView BE;
    protected com.kwad.components.core.widget.KsConvertButton BV;
    protected android.widget.TextView BW;

    @androidx.annotation.Nullable
    protected android.widget.TextView BX;

    @androidx.annotation.Nullable
    protected android.widget.TextView BY;
    protected com.kwad.components.ad.reward.n.h.a BZ;

    @androidx.annotation.LayoutRes
    protected int Ca;
    protected boolean Cb;

    @androidx.annotation.Nullable
    protected com.kwad.components.core.widget.KsLogoView mLogoView;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void jk();

        void jl();

        void jm();

        void jn();

        void jo();

        void jp();
    }

    public h() {
            r1 = this;
            r1.<init>()
            int r0 = com.kwad.sdk.R.layout.ksad_reward_apk_info_card_tag_item
            r1.Ca = r0
            r0 = 1
            r1.Cb = r0
            return
    }

    private void a(com.kwad.components.ad.reward.model.a r6) {
            r5 = this;
            if (r6 != 0) goto L3
            return
        L3:
            int r0 = r6.im()
            r5.ag(r0)
            com.kwad.components.core.widget.KsLogoView r0 = r5.mLogoView
            if (r0 == 0) goto L15
            com.kwad.sdk.core.response.model.AdTemplate r1 = r6.ii()
            r0.aP(r1)
        L15:
            android.widget.TextView r0 = r5.BW
            java.lang.String r1 = r6.getTitle()
            r0.setText(r1)
            android.widget.TextView r0 = r5.BX
            if (r0 == 0) goto L29
            java.lang.String r1 = r6.hp()
            r0.setText(r1)
        L29:
            android.widget.TextView r0 = r5.BY
            r1 = 0
            r2 = 8
            if (r0 == 0) goto L5c
            java.lang.String r3 = r6.hp()
            r0.setText(r3)
            java.lang.String r0 = r6.hp()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L46
            r0 = 8
        L43:
            r3 = 8
            goto L52
        L46:
            boolean r0 = r6.il()
            if (r0 == 0) goto L50
            r0 = 8
            r3 = 0
            goto L52
        L50:
            r0 = 0
            goto L43
        L52:
            android.widget.TextView r4 = r5.BX
            if (r4 == 0) goto L59
            r4.setVisibility(r0)
        L59:
            android.widget.TextView r0 = r5.BY
            goto L6e
        L5c:
            android.widget.TextView r0 = r5.BX
            if (r0 == 0) goto L71
            java.lang.String r3 = r6.hp()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L6d
            r3 = 8
            goto L6e
        L6d:
            r3 = 0
        L6e:
            r0.setVisibility(r3)
        L71:
            com.kwad.components.ad.widget.KsAppTagsView r0 = r5.BE
            if (r0 == 0) goto L8b
            java.util.List r3 = r6.ik()
            int r4 = r5.Ca
            r0.a(r3, r4)
            com.kwad.components.ad.widget.KsAppTagsView r0 = r5.BE
            boolean r3 = r6.il()
            if (r3 == 0) goto L88
            r1 = 8
        L88:
            r0.setVisibility(r1)
        L8b:
            com.kwad.components.core.widget.KsConvertButton r0 = r5.BV
            if (r0 == 0) goto L9a
            com.kwad.components.core.e.d.c r1 = r6.ij()
            com.kwad.sdk.core.response.model.AdTemplate r2 = r6.ii()
            r0.a(r1, r2)
        L9a:
            android.widget.ImageView r0 = r5.BA
            java.lang.String r1 = r6.ho()
            com.kwad.sdk.core.response.model.AdTemplate r6 = r6.ii()
            r2 = 12
            com.kwad.sdk.core.imageloader.KSImageLoader.loadAppIcon(r0, r1, r6, r2)
            return
    }

    private void ag(int r4) {
            r3 = this;
            com.kwad.components.core.widget.KsConvertButton r0 = r3.BV
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 1
            if (r4 != r1) goto L10
            com.kwad.sdk.widget.j$a r4 = r0.getCornerConf()
            r4.setAllCorner(r1)
            goto L27
        L10:
            r2 = 2
            if (r4 != r2) goto L27
            com.kwad.sdk.widget.j$a r4 = r0.getCornerConf()
            r0 = 0
            com.kwad.sdk.widget.j$a r4 = r4.cp(r0)
            com.kwad.sdk.widget.j$a r4 = r4.cs(r0)
            com.kwad.sdk.widget.j$a r4 = r4.cr(r1)
            r4.cq(r1)
        L27:
            com.kwad.components.core.widget.KsConvertButton r4 = r3.BV
            r4.postInvalidate()
            return
    }

    private void g(android.view.ViewGroup r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            int r0 = com.kwad.sdk.R.id.ksad_common_app_logo
            android.view.View r0 = r2.findViewById(r0)
            com.kwad.components.core.widget.KsLogoView r0 = (com.kwad.components.core.widget.KsLogoView) r0
            r1.mLogoView = r0
            int r0 = com.kwad.sdk.R.id.ksad_common_app_icon
            android.view.View r0 = r2.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.BA = r0
            int r0 = com.kwad.sdk.R.id.ksad_common_app_name
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.BW = r0
            int r0 = com.kwad.sdk.R.id.ksad_common_app_tags
            android.view.View r0 = r2.findViewById(r0)
            com.kwad.components.ad.widget.KsAppTagsView r0 = (com.kwad.components.ad.widget.KsAppTagsView) r0
            r1.BE = r0
            int r0 = com.kwad.sdk.R.id.ksad_common_app_desc
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.BX = r0
            int r0 = com.kwad.sdk.R.id.ksad_common_app_desc2
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.BY = r0
            int r0 = com.kwad.sdk.R.id.ksad_common_app_action
            android.view.View r2 = r2.findViewById(r0)
            com.kwad.components.core.widget.KsConvertButton r2 = (com.kwad.components.core.widget.KsConvertButton) r2
            r1.BV = r2
            return
    }

    private static int le() {
            int r0 = com.kwad.sdk.R.id.ksad_common_app_card_root
            return r0
    }

    public final void a(com.kwad.components.ad.reward.n.h.a r1) {
            r0 = this;
            r0.BZ = r1
            return
    }

    @Override // com.kwad.components.ad.reward.n.d
    protected final void a(com.kwad.components.ad.reward.n.r r2) {
            r1 = this;
            super.a(r2)
            boolean r0 = r1.Cb
            com.kwad.components.ad.reward.model.a r2 = com.kwad.components.ad.reward.model.a.a(r2, r0)
            r1.a(r2)
            return
    }

    public final void f(android.view.ViewGroup r3) {
            r2 = this;
            int r0 = r2.jj()
            int r1 = le()
            super.a(r3, r0, r1)
            android.view.ViewGroup r3 = r2.vV
            r2.g(r3)
            android.view.ViewGroup r3 = r2.vV
            if (r3 == 0) goto L3b
            r3.setOnClickListener(r2)
            com.kwad.components.core.widget.KsConvertButton r3 = r2.BV
            r3.setOnClickListener(r2)
            android.widget.ImageView r3 = r2.BA
            r3.setOnClickListener(r2)
            android.widget.TextView r3 = r2.BW
            r3.setOnClickListener(r2)
            android.widget.TextView r3 = r2.BX
            if (r3 == 0) goto L2d
            r3.setOnClickListener(r2)
        L2d:
            android.widget.TextView r3 = r2.BY
            if (r3 == 0) goto L34
            r3.setOnClickListener(r2)
        L34:
            com.kwad.components.ad.widget.KsAppTagsView r3 = r2.BE
            if (r3 == 0) goto L3b
            r3.setOnClickListener(r2)
        L3b:
            return
    }

    protected int jj() {
            r1 = this;
            int r0 = com.kwad.sdk.R.id.ksad_common_app_card_stub
            return r0
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r2) {
            r1 = this;
            com.kwad.components.core.widget.KsConvertButton r0 = r1.BV
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L10
            com.kwad.components.ad.reward.n.h$a r2 = r1.BZ
            if (r2 == 0) goto L68
            r2.jk()
            return
        L10:
            android.widget.ImageView r0 = r1.BA
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L20
            com.kwad.components.ad.reward.n.h$a r2 = r1.BZ
            if (r2 == 0) goto L68
            r2.jl()
            return
        L20:
            android.widget.TextView r0 = r1.BW
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L30
            com.kwad.components.ad.reward.n.h$a r2 = r1.BZ
            if (r2 == 0) goto L68
            r2.jm()
            return
        L30:
            android.widget.TextView r0 = r1.BX
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L61
            android.widget.TextView r0 = r1.BY
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L41
            goto L61
        L41:
            com.kwad.components.ad.widget.KsAppTagsView r0 = r1.BE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L51
            com.kwad.components.ad.reward.n.h$a r2 = r1.BZ
            if (r2 == 0) goto L68
            r2.jo()
            return
        L51:
            android.view.ViewGroup r0 = r1.vV
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L68
            com.kwad.components.ad.reward.n.h$a r2 = r1.BZ
            if (r2 == 0) goto L68
            r2.jp()
            return
        L61:
            com.kwad.components.ad.reward.n.h$a r2 = r1.BZ
            if (r2 == 0) goto L68
            r2.jn()
        L68:
            return
    }

    public final void show() {
            r2 = this;
            android.view.ViewGroup r0 = r2.vV
            if (r0 == 0) goto L8
            r1 = 0
            r0.setVisibility(r1)
        L8:
            return
    }
}
