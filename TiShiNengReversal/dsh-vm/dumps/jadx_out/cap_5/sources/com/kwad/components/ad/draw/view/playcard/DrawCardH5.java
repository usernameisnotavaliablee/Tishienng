package com.kwad.components.ad.draw.view.playcard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class DrawCardH5 extends android.widget.FrameLayout implements android.view.View.OnClickListener {
    private android.animation.ValueAnimator gm;
    private com.kwad.components.ad.draw.view.playcard.DrawCardH5.a go;
    private android.widget.ImageView gp;
    private android.widget.TextView gq;
    private android.widget.TextView gr;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private android.content.Context mContext;
    private int mHeight;
    private com.kwad.components.core.widget.KsLogoView mLogoView;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void ba();

        void bb();
    }

    public DrawCardH5(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r0.B(r1)
            return
    }

    public DrawCardH5(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.B(r1)
            return
    }

    public DrawCardH5(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.B(r1)
            return
    }

    private void B(android.content.Context r2) {
            r1 = this;
            r1.mContext = r2
            int r0 = com.kwad.sdk.R.layout.ksad_draw_card_h5
            com.kwad.sdk.o.m.inflate(r2, r0, r1)
            int r2 = com.kwad.sdk.R.id.ksad_card_close
            android.view.View r2 = r1.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r1.gp = r2
            int r2 = com.kwad.sdk.R.id.ksad_card_ad_desc
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.gq = r2
            int r2 = com.kwad.sdk.R.id.ksad_card_h5_open_btn
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.gr = r2
            int r2 = com.kwad.sdk.R.id.ksad_draw_h5_logo
            android.view.View r2 = r1.findViewById(r2)
            com.kwad.components.core.widget.KsLogoView r2 = (com.kwad.components.core.widget.KsLogoView) r2
            r1.mLogoView = r2
            return
    }

    static /* synthetic */ com.kwad.components.ad.draw.view.playcard.DrawCardH5.a a(com.kwad.components.ad.draw.view.playcard.DrawCardH5 r0) {
            com.kwad.components.ad.draw.view.playcard.DrawCardH5$a r0 = r0.go
            return r0
    }

    private void bV() {
            r2 = this;
            int r0 = r2.mHeight
            r1 = 0
            r2.d(r0, r1)
            return
    }

    private void bl() {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.gm
            if (r0 == 0) goto Lc
            r0.removeAllListeners()
            android.animation.ValueAnimator r0 = r1.gm
            r0.cancel()
        Lc:
            return
    }

    private void d(int r3, int r4) {
            r2 = this;
            r2.bl()
            android.animation.ValueAnimator r3 = com.kwad.components.core.t.o.b(r2, r3, r4)
            r2.gm = r3
            android.view.animation.DecelerateInterpolator r4 = new android.view.animation.DecelerateInterpolator
            r0 = 1073741824(0x40000000, float:2.0)
            r4.<init>(r0)
            r3.setInterpolator(r4)
            android.animation.ValueAnimator r3 = r2.gm
            r0 = 300(0x12c, double:1.48E-321)
            r3.setDuration(r0)
            android.animation.ValueAnimator r3 = r2.gm
            r3.start()
            return
    }

    public final void a(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r3, com.kwad.components.ad.draw.view.playcard.DrawCardH5.a r4) {
            r2 = this;
            r2.mAdTemplate = r3
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r3)
            r2.go = r4
            android.widget.TextView r4 = r2.gq
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.au(r0)
            r4.setText(r1)
            android.widget.TextView r4 = r2.gr
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.aE(r0)
            r4.setText(r0)
            android.widget.ImageView r4 = r2.gp
            r4.setOnClickListener(r2)
            android.widget.TextView r4 = r2.gr
            r4.setOnClickListener(r2)
            com.kwad.components.core.widget.KsLogoView r4 = r2.mLogoView
            r4.aP(r3)
            r2.setOnClickListener(r2)
            android.content.Context r3 = r2.mContext
            int r3 = com.kwad.sdk.utils.m.getScreenWidth(r3)
            android.content.Context r4 = r2.mContext
            r0 = 1098907648(0x41800000, float:16.0)
            int r4 = com.kwad.sdk.c.a.a.a(r4, r0)
            int r4 = r4 * 2
            int r3 = r3 - r4
            android.content.Context r4 = r2.mContext
            r0 = 1092616192(0x41200000, float:10.0)
            int r4 = com.kwad.sdk.c.a.a.a(r4, r0)
            int r4 = r4 * 2
            int r3 = r3 - r4
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r4)
            r4 = 0
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r4)
            android.widget.TextView r0 = r2.gq
            r0.measure(r3, r4)
            android.content.Context r3 = r2.mContext
            r4 = 1120403456(0x42c80000, float:100.0)
            int r3 = com.kwad.sdk.c.a.a.a(r3, r4)
            android.widget.TextView r4 = r2.gq
            int r4 = r4.getMeasuredHeight()
            int r3 = r3 + r4
            r2.mHeight = r3
            return
    }

    public final void bT() {
            r2 = this;
            r0 = 0
            int r1 = r2.mHeight
            r2.d(r0, r1)
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r2) {
            r1 = this;
            android.widget.ImageView r0 = r1.gp
            if (r2 != r0) goto Lf
            r1.bV()
            com.kwad.components.ad.draw.view.playcard.DrawCardH5$a r2 = r1.go
            if (r2 == 0) goto Le
            r2.ba()
        Le:
            return
        Lf:
            com.kwad.components.core.e.d.a$a r2 = new com.kwad.components.core.e.d.a$a
            android.content.Context r0 = r1.getContext()
            r2.<init>(r0)
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            com.kwad.components.core.e.d.a$a r2 = r2.aB(r0)
            com.kwad.components.ad.draw.view.playcard.DrawCardH5$1 r0 = new com.kwad.components.ad.draw.view.playcard.DrawCardH5$1
            r0.<init>(r1)
            com.kwad.components.core.e.d.a$a r2 = r2.a(r0)
            com.kwad.components.core.e.d.a.a(r2)
            return
    }

    public final void release() {
            r0 = this;
            r0.bl()
            return
    }
}
