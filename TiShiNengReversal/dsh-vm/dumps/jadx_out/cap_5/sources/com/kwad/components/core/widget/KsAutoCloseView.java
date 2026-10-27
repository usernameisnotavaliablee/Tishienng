package com.kwad.components.core.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class KsAutoCloseView extends android.widget.LinearLayout implements android.view.View.OnClickListener {
    private static java.lang.String Ed = "%s秒后自动关闭";
    private android.widget.TextView aiZ;
    private android.widget.ImageView aja;
    private com.kwad.components.core.widget.KsAutoCloseView.a ajb;
    private boolean ajc;
    private boolean ajd;
    private int countDown;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void eg();

        void eh();
    }

    static {
            return
    }

    public KsAutoCloseView(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 10
            r1.countDown = r0
            r0 = 1
            r1.ajc = r0
            r0 = 0
            r1.ajd = r0
            r1.A(r2)
            return
    }

    public KsAutoCloseView(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r2 = 10
            r0.countDown = r2
            r2 = 1
            r0.ajc = r2
            r2 = 0
            r0.ajd = r2
            r0.A(r1)
            return
    }

    public KsAutoCloseView(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r2 = 10
            r0.countDown = r2
            r2 = 1
            r0.ajc = r2
            r2 = 0
            r0.ajd = r2
            r0.A(r1)
            return
    }

    @androidx.annotation.RequiresApi(api = 21)
    public KsAutoCloseView(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r2 = 10
            r0.countDown = r2
            r2 = 1
            r0.ajc = r2
            r2 = 0
            r0.ajd = r2
            r0.A(r1)
            return
    }

    private void A(android.content.Context r2) {
            r1 = this;
            int r0 = com.kwad.sdk.R.layout.ksad_auto_close
            com.kwad.sdk.o.m.inflate(r2, r0, r1)
            int r2 = com.kwad.sdk.R.id.ksad_auto_close_text
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.aiZ = r2
            int r2 = com.kwad.sdk.R.id.ksad_auto_close_btn
            android.view.View r2 = r1.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r1.aja = r2
            r2.setOnClickListener(r1)
            return
    }

    private void G(int r5) {
            r4 = this;
            android.widget.TextView r0 = r4.aiZ
            java.lang.String r1 = com.kwad.components.core.widget.KsAutoCloseView.Ed
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            java.lang.String r5 = java.lang.String.format(r1, r2)
            r0.setText(r5)
            return
    }

    static /* synthetic */ void a(com.kwad.components.core.widget.KsAutoCloseView r0, int r1) {
            r0.G(r1)
            return
    }

    static /* synthetic */ boolean a(com.kwad.components.core.widget.KsAutoCloseView r0) {
            boolean r0 = r0.ajc
            return r0
    }

    static /* synthetic */ boolean b(com.kwad.components.core.widget.KsAutoCloseView r0) {
            boolean r0 = r0.ajd
            return r0
    }

    static /* synthetic */ int c(com.kwad.components.core.widget.KsAutoCloseView r0) {
            int r0 = r0.countDown
            return r0
    }

    static /* synthetic */ com.kwad.components.core.widget.KsAutoCloseView.a d(com.kwad.components.core.widget.KsAutoCloseView r0) {
            com.kwad.components.core.widget.KsAutoCloseView$a r0 = r0.ajb
            return r0
    }

    static /* synthetic */ int e(com.kwad.components.core.widget.KsAutoCloseView r2) {
            int r0 = r2.countDown
            int r1 = r0 + (-1)
            r2.countDown = r1
            return r0
    }

    public final void ai(int r1) {
            r0 = this;
            if (r1 > 0) goto L3
            return
        L3:
            r0.countDown = r1
            com.kwad.components.core.widget.KsAutoCloseView$1 r1 = new com.kwad.components.core.widget.KsAutoCloseView$1
            r1.<init>(r0)
            r0.post(r1)
            return
    }

    public final void bb(boolean r2) {
            r1 = this;
            r1.ajc = r2
            if (r2 == 0) goto L6
            r2 = 0
            goto L8
        L6:
            r2 = 8
        L8:
            android.widget.TextView r0 = r1.aiZ
            if (r0 == 0) goto Lf
            r0.setVisibility(r2)
        Lf:
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r2) {
            r1 = this;
            com.kwad.components.core.widget.KsAutoCloseView$a r0 = r1.ajb
            if (r0 != 0) goto L5
            goto L12
        L5:
            android.widget.ImageView r0 = r1.aja
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L12
            com.kwad.components.core.widget.KsAutoCloseView$a r2 = r1.ajb
            r2.eh()
        L12:
            return
    }

    public void setCountDownPaused(boolean r1) {
            r0 = this;
            r0.ajd = r1
            return
    }

    public void setViewListener(com.kwad.components.core.widget.KsAutoCloseView.a r1) {
            r0 = this;
            r0.ajb = r1
            return
    }
}
