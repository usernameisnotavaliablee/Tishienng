package com.kwad.components.ad.splashscreen.presenter.playcard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class SplashPlayDefaultInfoView extends android.widget.FrameLayout {
    private com.kwad.components.core.widget.KSCornerImageView IY;
    private android.widget.ImageView IZ;
    private android.widget.TextView Ja;
    private android.widget.TextView fv;
    private android.widget.TextView ko;

    public SplashPlayDefaultInfoView(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r0.ne()
            return
    }

    public SplashPlayDefaultInfoView(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.ne()
            return
    }

    public SplashPlayDefaultInfoView(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.ne()
            return
    }

    @androidx.annotation.RequiresApi(api = 21)
    public SplashPlayDefaultInfoView(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r0.ne()
            return
    }

    private void a(com.kwad.components.ad.splashscreen.presenter.playcard.c r4) {
            r3 = this;
            android.content.Context r0 = r3.getContext()
            com.kwad.sdk.utils.ak r0 = r4.W(r0)
            com.kwad.sdk.utils.ak.a(r3, r0)
            com.kwad.components.core.widget.KSCornerImageView r0 = r3.IY
            android.content.Context r1 = r3.getContext()
            com.kwad.sdk.utils.ak r1 = r4.X(r1)
            com.kwad.sdk.utils.ak.a(r0, r1)
            android.widget.TextView r0 = r3.ko
            android.content.Context r1 = r3.getContext()
            com.kwad.sdk.utils.ak r1 = r4.Y(r1)
            com.kwad.sdk.utils.ak.a(r0, r1)
            android.widget.ImageView r0 = r3.IZ
            android.content.Context r1 = r3.getContext()
            com.kwad.sdk.utils.ak r1 = r4.Z(r1)
            com.kwad.sdk.utils.ak.a(r0, r1)
            android.widget.TextView r0 = r3.fv
            android.content.Context r1 = r3.getContext()
            com.kwad.sdk.utils.ak r1 = r4.aa(r1)
            com.kwad.sdk.utils.ak.a(r0, r1)
            android.widget.TextView r0 = r3.Ja
            android.content.Context r1 = r3.getContext()
            com.kwad.sdk.utils.ak r1 = r4.ab(r1)
            com.kwad.sdk.utils.ak.a(r0, r1)
            android.widget.TextView r0 = r3.ko
            android.content.Context r1 = r3.getContext()
            int r1 = r4.ac(r1)
            float r1 = (float) r1
            r2 = 0
            r0.setTextSize(r2, r1)
            android.widget.TextView r0 = r3.fv
            android.content.Context r1 = r3.getContext()
            int r1 = r4.ad(r1)
            float r1 = (float) r1
            r0.setTextSize(r2, r1)
            android.widget.TextView r0 = r3.Ja
            android.content.Context r1 = r3.getContext()
            int r4 = r4.ae(r1)
            float r4 = (float) r4
            r0.setTextSize(r2, r4)
            return
    }

    private void ne() {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            int r1 = com.kwad.sdk.R.layout.ksad_play_card_default_info
            android.view.View.inflate(r0, r1, r2)
            int r0 = com.kwad.sdk.R.id.ksad_splash_default_icon
            android.view.View r0 = r2.findViewById(r0)
            com.kwad.components.core.widget.KSCornerImageView r0 = (com.kwad.components.core.widget.KSCornerImageView) r0
            r2.IY = r0
            int r0 = com.kwad.sdk.R.id.ksad_splash_default_title
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.ko = r0
            int r0 = com.kwad.sdk.R.id.ksad_splash_default_img
            android.view.View r0 = r2.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2.IZ = r0
            int r0 = com.kwad.sdk.R.id.ksad_splash_default_desc
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.fv = r0
            int r0 = com.kwad.sdk.R.id.ksad_splash_default_tips
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.Ja = r0
            return
    }

    public final void a(com.kwad.sdk.core.response.model.AdTemplate r4, float r5) {
            r3 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r4)
            boolean r1 = com.kwad.sdk.core.response.b.a.dn(r0)
            if (r1 == 0) goto Lf
            com.kwad.components.ad.splashscreen.presenter.playcard.c r5 = com.kwad.components.ad.splashscreen.presenter.playcard.c.c(r5)
            goto L13
        Lf:
            com.kwad.components.ad.splashscreen.presenter.playcard.c r5 = com.kwad.components.ad.splashscreen.presenter.playcard.c.nc()
        L13:
            r3.a(r5)
            com.kwad.components.core.widget.KSCornerImageView r1 = r3.IY
            android.content.Context r2 = r3.getContext()
            int r5 = r5.nd()
            float r5 = (float) r5
            int r5 = com.kwad.sdk.c.a.a.a(r2, r5)
            float r5 = (float) r5
            r1.setRadius(r5)
            com.kwad.components.core.widget.KSCornerImageView r5 = r3.IY
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.co(r0)
            com.kwad.sdk.core.imageloader.KSImageLoader.loadImage(r5, r1, r4)
            android.widget.TextView r4 = r3.ko
            java.lang.String r5 = com.kwad.sdk.core.response.b.a.cl(r0)
            r4.setText(r5)
            java.lang.String r4 = com.kwad.sdk.core.response.b.a.au(r0)
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L4d
            android.widget.TextView r4 = r3.fv
            r5 = 8
            r4.setVisibility(r5)
            return
        L4d:
            android.widget.TextView r4 = r3.fv
            java.lang.String r5 = com.kwad.sdk.core.response.b.a.au(r0)
            r4.setText(r5)
            return
    }
}
