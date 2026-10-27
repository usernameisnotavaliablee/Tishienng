package com.kwad.components.ad.splashscreen.presenter.endcard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class SplashEndLandView extends android.widget.FrameLayout {
    private android.widget.TextView IA;
    private android.widget.TextView IB;
    private android.widget.TextView IC;
    private int ID;
    private com.kwad.components.ad.splashscreen.widget.CloseCountDownView Ij;
    private android.view.ViewGroup Ik;
    private android.view.ViewGroup Il;
    private android.widget.ImageView Im;
    private android.widget.TextView In;
    private android.widget.TextView Io;
    private android.widget.ImageView Iz;
    private com.kwad.components.core.widget.KsLogoView cx;

    public SplashEndLandView(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 24
            r0.ID = r1
            return
    }

    public SplashEndLandView(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 24
            r0.ID = r1
            return
    }

    public SplashEndLandView(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 24
            r0.ID = r1
            return
    }

    @androidx.annotation.RequiresApi(api = 21)
    public SplashEndLandView(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r1 = 24
            r0.ID = r1
            return
    }

    private void a(com.kwad.components.ad.splashscreen.presenter.endcard.g r4) {
            r3 = this;
            android.widget.ImageView r0 = r3.Iz
            com.kwad.sdk.utils.ak r1 = r4.mJ()
            com.kwad.sdk.utils.ak.a(r0, r1)
            android.view.ViewGroup r0 = r3.Ik
            com.kwad.sdk.utils.ak r1 = r4.mK()
            com.kwad.sdk.utils.ak.a(r0, r1)
            android.widget.ImageView r0 = r3.Im
            com.kwad.sdk.utils.ak r1 = r4.mL()
            com.kwad.sdk.utils.ak.a(r0, r1)
            android.view.ViewGroup r0 = r3.Il
            com.kwad.sdk.utils.ak r1 = r4.mN()
            com.kwad.sdk.utils.ak.a(r0, r1)
            android.widget.TextView r0 = r3.In
            com.kwad.sdk.utils.ak r1 = r4.mO()
            com.kwad.sdk.utils.ak.a(r0, r1)
            android.widget.TextView r0 = r3.IA
            com.kwad.sdk.utils.ak r1 = r4.mP()
            com.kwad.sdk.utils.ak.a(r0, r1)
            android.widget.TextView r0 = r3.Io
            com.kwad.sdk.utils.ak r1 = r4.mQ()
            com.kwad.sdk.utils.ak.a(r0, r1)
            com.kwad.components.ad.splashscreen.widget.CloseCountDownView r0 = r3.Ij
            com.kwad.sdk.utils.ak r1 = r4.mR()
            com.kwad.sdk.utils.ak.a(r0, r1)
            android.widget.TextView r0 = r3.In
            r1 = 0
            if (r0 == 0) goto L55
            int r2 = r4.mS()
            float r2 = (float) r2
            r0.setTextSize(r1, r2)
        L55:
            android.widget.TextView r0 = r3.IA
            if (r0 == 0) goto L61
            int r2 = r4.mT()
            float r2 = (float) r2
            r0.setTextSize(r1, r2)
        L61:
            android.widget.TextView r0 = r3.Io
            if (r0 == 0) goto L6d
            int r2 = r4.mU()
            float r2 = (float) r2
            r0.setTextSize(r1, r2)
        L6d:
            android.widget.TextView r0 = r3.IB
            if (r0 == 0) goto L79
            int r2 = r4.mV()
            float r2 = (float) r2
            r0.setTextSize(r1, r2)
        L79:
            android.widget.TextView r0 = r3.IC
            if (r0 == 0) goto L85
            int r2 = r4.mW()
            float r2 = (float) r2
            r0.setTextSize(r1, r2)
        L85:
            int r4 = r4.mM()
            r3.ID = r4
            return
    }

    private void b(com.kwad.sdk.core.response.model.AdTemplate r2, com.kwad.sdk.core.response.model.AdInfo r3, com.kwad.components.core.e.d.c r4) {
            r1 = this;
            if (r4 != 0) goto L3
            return
        L3:
            int r4 = r4.pB()
            r0 = 0
            java.lang.String r2 = com.kwad.components.ad.splashscreen.d.a(r2, r3, r4, r0)
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 != 0) goto L18
            android.widget.TextView r3 = r1.IB
            r3.setText(r2)
            return
        L18:
            android.widget.TextView r2 = r1.IB
            java.lang.String r3 = com.kwad.sdk.core.response.b.a.aE(r3)
            r2.setText(r3)
            return
    }

    public final void a(com.kwad.sdk.core.response.model.AdTemplate r5, com.kwad.components.core.e.d.c r6, float r7) {
            r4 = this;
            com.kwad.components.ad.splashscreen.presenter.endcard.g r0 = new com.kwad.components.ad.splashscreen.presenter.endcard.g
            android.content.Context r1 = r4.getContext()
            r0.<init>(r1, r7)
            r4.a(r0)
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r5)
            android.widget.ImageView r1 = r4.Im
            int r2 = com.kwad.sdk.R.drawable.ksad_default_app_icon
            r1.setImageResource(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "bindView, appIconRadius: "
            r1.<init>(r2)
            int r2 = r4.ID
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "SplashEndLandView"
            com.kwad.sdk.core.d.c.d(r2, r1)
            android.widget.ImageView r1 = r4.Im
            java.lang.String r2 = com.kwad.sdk.core.response.b.a.co(r0)
            int r3 = r4.ID
            com.kwad.sdk.core.imageloader.KSImageLoader.loadAppIcon(r1, r2, r5, r3)
            android.widget.TextView r1 = r4.In
            java.lang.String r2 = com.kwad.sdk.core.response.b.a.cl(r0)
            r1.setText(r2)
            android.widget.TextView r1 = r4.Io
            java.lang.String r2 = com.kwad.sdk.core.response.b.a.au(r0)
            r1.setText(r2)
            com.kwad.components.core.widget.KsLogoView r1 = r4.cx
            r1.aP(r5)
            boolean r1 = com.kwad.sdk.core.response.b.a.aF(r0)
            if (r1 != 0) goto L69
            android.widget.TextView r5 = r4.IB
            java.lang.String r6 = "点击查看"
            r5.setText(r6)
            android.widget.TextView r5 = r4.IC
            r6 = 0
            r5.setVisibility(r6)
            android.widget.TextView r5 = r4.IC
            java.lang.String r6 = "跳转详情页/第三方应用"
            r5.setText(r6)
            goto L6c
        L69:
            r4.b(r5, r0, r6)
        L6c:
            com.kwad.components.ad.splashscreen.widget.CloseCountDownView r5 = r4.Ij
            r5.a(r0, r7)
            return
    }

    public final void ab(java.lang.String r2) {
            r1 = this;
            android.widget.TextView r0 = r1.IB
            if (r0 == 0) goto L9
            if (r2 == 0) goto L9
            r0.setText(r2)
        L9:
            return
    }

    public final void bt() {
            r1 = this;
            com.kwad.components.ad.splashscreen.widget.CloseCountDownView r0 = r1.Ij
            if (r0 == 0) goto L7
            r0.bt()
        L7:
            return
    }

    public final void bu() {
            r1 = this;
            com.kwad.components.ad.splashscreen.widget.CloseCountDownView r0 = r1.Ij
            if (r0 == 0) goto L7
            r0.bu()
        L7:
            return
    }

    public android.view.ViewGroup getActionBarView() {
            r1 = this;
            android.view.ViewGroup r0 = r1.Il
            return r0
    }

    public android.widget.TextView getAppDesc() {
            r1 = this;
            android.widget.TextView r0 = r1.Io
            return r0
    }

    public android.widget.ImageView getAppIcon() {
            r1 = this;
            android.widget.ImageView r0 = r1.Im
            return r0
    }

    public android.widget.TextView getAppName() {
            r1 = this;
            android.widget.TextView r0 = r1.In
            return r0
    }

    public com.kwad.components.ad.splashscreen.widget.CloseCountDownView getCloseView() {
            r1 = this;
            com.kwad.components.ad.splashscreen.widget.CloseCountDownView r0 = r1.Ij
            return r0
    }

    public android.view.ViewGroup getGiftBoxView() {
            r1 = this;
            android.view.ViewGroup r0 = r1.Ik
            return r0
    }

    public final void mI() {
            r1 = this;
            com.kwad.components.ad.splashscreen.widget.CloseCountDownView r0 = r1.Ij
            if (r0 == 0) goto L7
            r0.cq()
        L7:
            return
    }

    public final void t(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L5
            int r2 = com.kwad.sdk.R.layout.ksad_splash_end_card_area_land
            goto L7
        L5:
            int r2 = com.kwad.sdk.R.layout.ksad_splash_end_card_area
        L7:
            android.content.Context r0 = r1.getContext()
            android.view.View.inflate(r0, r2, r1)
            int r2 = com.kwad.sdk.R.id.ksad_ad_endcard_title_view
            android.view.View r2 = r1.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r1.Iz = r2
            int r2 = com.kwad.sdk.R.id.ksad_splash_end_card_giftbox_view
            android.view.View r2 = r1.findViewById(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r1.Ik = r2
            int r2 = com.kwad.sdk.R.id.ksad_ad_endcard_icon
            android.view.View r2 = r1.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r1.Im = r2
            int r2 = com.kwad.sdk.R.id.ksad_ad_endcard_appname
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.In = r2
            int r2 = com.kwad.sdk.R.id.ksad_ad_endcard_appversion
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.IA = r2
            int r2 = com.kwad.sdk.R.id.ksad_ad_endcard_appdesc
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.Io = r2
            int r2 = com.kwad.sdk.R.id.ksad_ad_endcard_logo
            android.view.View r2 = r1.findViewById(r2)
            com.kwad.components.core.widget.KsLogoView r2 = (com.kwad.components.core.widget.KsLogoView) r2
            r1.cx = r2
            int r2 = com.kwad.sdk.R.id.ksad_ad_btn_title
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.IB = r2
            int r2 = com.kwad.sdk.R.id.ksad_ad_btn_sub_title
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.IC = r2
            int r2 = com.kwad.sdk.R.id.ksad_ad_endcard_close_root
            android.view.View r2 = r1.findViewById(r2)
            com.kwad.components.ad.splashscreen.widget.CloseCountDownView r2 = (com.kwad.components.ad.splashscreen.widget.CloseCountDownView) r2
            r1.Ij = r2
            int r2 = com.kwad.sdk.R.id.ksad_splash_endcard_actionbar
            android.view.View r2 = r1.findViewById(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r1.Il = r2
            return
    }
}
