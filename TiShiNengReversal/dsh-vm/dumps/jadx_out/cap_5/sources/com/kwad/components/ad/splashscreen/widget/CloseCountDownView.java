package com.kwad.components.ad.splashscreen.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class CloseCountDownView extends android.widget.LinearLayout {
    private com.kwad.components.ad.splashscreen.widget.CloseCountDownView.a Iq;
    private java.lang.String JJ;
    private int JK;
    private android.widget.TextView JL;
    private android.widget.TextView JM;
    private android.widget.ImageView JN;
    private com.kwad.components.ad.splashscreen.widget.a JO;
    private java.lang.Runnable JP;
    private boolean qy;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void eh();

        void mf();
    }

    public CloseCountDownView(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            java.lang.String r0 = "%ss"
            r1.JJ = r0
            r0 = 5
            r1.JK = r0
            r0 = 0
            r1.qy = r0
            com.kwad.components.ad.splashscreen.widget.CloseCountDownView$1 r0 = new com.kwad.components.ad.splashscreen.widget.CloseCountDownView$1
            r0.<init>(r1)
            r1.JP = r0
            r1.ah(r2)
            return
    }

    public CloseCountDownView(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            java.lang.String r2 = "%ss"
            r0.JJ = r2
            r2 = 5
            r0.JK = r2
            r2 = 0
            r0.qy = r2
            com.kwad.components.ad.splashscreen.widget.CloseCountDownView$1 r2 = new com.kwad.components.ad.splashscreen.widget.CloseCountDownView$1
            r2.<init>(r0)
            r0.JP = r2
            r0.ah(r1)
            return
    }

    public CloseCountDownView(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            java.lang.String r2 = "%ss"
            r0.JJ = r2
            r2 = 5
            r0.JK = r2
            r2 = 0
            r0.qy = r2
            com.kwad.components.ad.splashscreen.widget.CloseCountDownView$1 r2 = new com.kwad.components.ad.splashscreen.widget.CloseCountDownView$1
            r2.<init>(r0)
            r0.JP = r2
            r0.ah(r1)
            return
    }

    @androidx.annotation.RequiresApi(api = 21)
    public CloseCountDownView(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            java.lang.String r2 = "%ss"
            r0.JJ = r2
            r2 = 5
            r0.JK = r2
            r2 = 0
            r0.qy = r2
            com.kwad.components.ad.splashscreen.widget.CloseCountDownView$1 r2 = new com.kwad.components.ad.splashscreen.widget.CloseCountDownView$1
            r2.<init>(r0)
            r0.JP = r2
            r0.ah(r1)
            return
    }

    static /* synthetic */ void a(com.kwad.components.ad.splashscreen.widget.CloseCountDownView r0, int r1) {
            r0.ap(r1)
            return
    }

    static /* synthetic */ boolean a(com.kwad.components.ad.splashscreen.widget.CloseCountDownView r0) {
            boolean r0 = r0.qy
            return r0
    }

    private void ah(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.setOrientation(r0)
            int r0 = com.kwad.sdk.R.layout.ksad_endcard_close_view
            com.kwad.sdk.o.m.inflate(r2, r0, r1)
            int r2 = com.kwad.sdk.R.id.ksad_ad_endcard_second
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.JL = r2
            int r2 = com.kwad.sdk.R.id.ksad_ad_endcard_line
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.JM = r2
            int r2 = com.kwad.sdk.R.id.ksad_splash_endcard_close_img
            android.view.View r2 = r1.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r1.JN = r2
            com.kwad.components.ad.splashscreen.widget.CloseCountDownView$2 r0 = new com.kwad.components.ad.splashscreen.widget.CloseCountDownView$2
            r0.<init>(r1)
            r2.setOnClickListener(r0)
            return
    }

    private void ap(int r5) {
            r4 = this;
            android.widget.TextView r0 = r4.JL
            java.lang.String r1 = r4.JJ
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            java.lang.String r5 = java.lang.String.format(r1, r2)
            r0.setText(r5)
            return
    }

    private void au() {
            r1 = this;
            java.lang.Runnable r0 = r1.JP
            r1.post(r0)
            return
    }

    static /* synthetic */ int b(com.kwad.components.ad.splashscreen.widget.CloseCountDownView r0) {
            int r0 = r0.JK
            return r0
    }

    static /* synthetic */ com.kwad.components.ad.splashscreen.widget.CloseCountDownView.a c(com.kwad.components.ad.splashscreen.widget.CloseCountDownView r0) {
            com.kwad.components.ad.splashscreen.widget.CloseCountDownView$a r0 = r0.Iq
            return r0
    }

    static /* synthetic */ int d(com.kwad.components.ad.splashscreen.widget.CloseCountDownView r2) {
            int r0 = r2.JK
            int r1 = r0 + (-1)
            r2.JK = r1
            return r0
    }

    private void fP() {
            r1 = this;
            r0 = 1
            r1.qy = r0
            return
    }

    private void fQ() {
            r1 = this;
            r0 = 0
            r1.qy = r0
            return
    }

    private void nn() {
            r3 = this;
            com.kwad.components.ad.splashscreen.widget.a r0 = r3.JO
            com.kwad.sdk.utils.ak r0 = r0.mR()
            com.kwad.sdk.utils.ak.a(r3, r0)
            android.widget.TextView r0 = r3.JM
            com.kwad.components.ad.splashscreen.widget.a r1 = r3.JO
            com.kwad.sdk.utils.ak r1 = r1.nq()
            com.kwad.sdk.utils.ak.a(r0, r1)
            android.widget.ImageView r0 = r3.JN
            com.kwad.components.ad.splashscreen.widget.a r1 = r3.JO
            com.kwad.sdk.utils.ak r1 = r1.nt()
            com.kwad.sdk.utils.ak.a(r0, r1)
            android.widget.TextView r0 = r3.JL
            com.kwad.components.ad.splashscreen.widget.a r1 = r3.JO
            int r1 = r1.nr()
            float r1 = (float) r1
            r2 = 0
            r0.setTextSize(r2, r1)
            android.widget.TextView r0 = r3.JM
            com.kwad.components.ad.splashscreen.widget.a r1 = r3.JO
            int r1 = r1.nr()
            float r1 = (float) r1
            r0.setTextSize(r2, r1)
            android.graphics.drawable.Drawable r0 = r3.getBackground()
            boolean r1 = r0 instanceof android.graphics.drawable.GradientDrawable
            if (r1 == 0) goto L4b
            android.graphics.drawable.GradientDrawable r0 = (android.graphics.drawable.GradientDrawable) r0
            com.kwad.components.ad.splashscreen.widget.a r1 = r3.JO
            float r1 = r1.ns()
            r0.setCornerRadius(r1)
        L4b:
            return
    }

    public final void a(com.kwad.sdk.core.response.model.AdInfo r3, float r4) {
            r2 = this;
            boolean r0 = com.kwad.sdk.core.response.b.a.dn(r3)
            if (r0 == 0) goto Lf
            android.content.Context r1 = r2.getContext()
            com.kwad.components.ad.splashscreen.widget.a r1 = com.kwad.components.ad.splashscreen.widget.a.aj(r1)
            goto L17
        Lf:
            android.content.Context r1 = r2.getContext()
            com.kwad.components.ad.splashscreen.widget.a r1 = com.kwad.components.ad.splashscreen.widget.a.ai(r1)
        L17:
            r2.JO = r1
            r1.d(r4)
            boolean r4 = com.kwad.sdk.core.response.b.a.cv(r3)
            int r3 = com.kwad.sdk.core.response.b.a.cu(r3)
            r2.JK = r3
            if (r0 == 0) goto L2b
            r2.nn()
        L2b:
            r3 = 0
            if (r4 == 0) goto L58
            android.widget.TextView r4 = r2.JL
            r4.setVisibility(r3)
            android.widget.TextView r4 = r2.JM
            r4.setVisibility(r3)
            int r4 = r2.JK
            r2.ap(r4)
            com.kwad.components.ad.splashscreen.widget.a r4 = r2.JO
            int r4 = r4.np()
            android.content.Context r0 = r2.getContext()
            float r4 = (float) r4
            int r0 = com.kwad.sdk.c.a.a.a(r0, r4)
            android.content.Context r1 = r2.getContext()
            int r4 = com.kwad.sdk.c.a.a.a(r1, r4)
            r2.setPadding(r0, r3, r4, r3)
            goto L72
        L58:
            com.kwad.components.ad.splashscreen.widget.a r4 = r2.JO
            int r4 = r4.no()
            android.content.Context r0 = r2.getContext()
            float r4 = (float) r4
            int r0 = com.kwad.sdk.c.a.a.a(r0, r4)
            android.content.Context r1 = r2.getContext()
            int r4 = com.kwad.sdk.c.a.a.a(r1, r4)
            r2.setPadding(r0, r3, r4, r3)
        L72:
            r2.au()
            return
    }

    public final void bt() {
            r0 = this;
            r0.fQ()
            return
    }

    public final void bu() {
            r0 = this;
            r0.fP()
            return
    }

    public final void cq() {
            r2 = this;
            android.os.Handler r0 = r2.getHandler()
            if (r0 == 0) goto Le
            android.os.Handler r0 = r2.getHandler()
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
        Le:
            return
    }

    public void setOnViewClickListener(com.kwad.components.ad.splashscreen.widget.CloseCountDownView.a r1) {
            r0 = this;
            r0.Iq = r1
            return
    }
}
