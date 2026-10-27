package com.kwad.components.ad.reward.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class KsToastView extends android.widget.LinearLayout {
    android.widget.TextView Ec;
    private java.lang.String Ed;
    private java.lang.Runnable Ee;
    private int countDown;


    public KsToastView(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 3
            r1.countDown = r0
            java.lang.String r0 = "%ss后自动进入"
            r1.Ed = r0
            r0 = 0
            r1.Ee = r0
            r1.init(r2)
            return
    }

    public KsToastView(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r2 = 3
            r0.countDown = r2
            java.lang.String r2 = "%ss后自动进入"
            r0.Ed = r2
            r2 = 0
            r0.Ee = r2
            r0.init(r1)
            return
    }

    public KsToastView(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r2 = 3
            r0.countDown = r2
            java.lang.String r2 = "%ss后自动进入"
            r0.Ed = r2
            r2 = 0
            r0.Ee = r2
            r0.init(r1)
            return
    }

    public KsToastView(android.content.Context r1, boolean r2) {
            r0 = this;
            r0.<init>(r1)
            r2 = 3
            r0.countDown = r2
            java.lang.String r2 = "%ss后自动进入"
            r0.Ed = r2
            r2 = 0
            r0.Ee = r2
            r0.init(r1)
            return
    }

    private void G(int r5) {
            r4 = this;
            android.widget.TextView r0 = r4.Ec
            java.lang.String r1 = r4.Ed
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            java.lang.String r5 = java.lang.String.format(r1, r2)
            r0.setText(r5)
            return
    }

    static /* synthetic */ int a(com.kwad.components.ad.reward.widget.KsToastView r0) {
            int r0 = r0.countDown
            return r0
    }

    static /* synthetic */ void a(com.kwad.components.ad.reward.widget.KsToastView r0, int r1) {
            r0.G(r1)
            return
    }

    static /* synthetic */ int b(com.kwad.components.ad.reward.widget.KsToastView r2) {
            int r0 = r2.countDown
            int r1 = r0 + (-1)
            r2.countDown = r1
            return r0
    }

    private void init(android.content.Context r2) {
            r1 = this;
            int r0 = com.kwad.sdk.R.layout.ksad_interstitial_toast_layout
            com.kwad.sdk.o.m.inflate(r2, r0, r1)
            int r2 = com.kwad.sdk.R.id.ksad_total_count_down_text
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.Ec = r2
            return
    }

    public final void ai(int r1) {
            r0 = this;
            java.lang.Runnable r1 = r0.Ee
            if (r1 != 0) goto Lb
            com.kwad.components.ad.reward.widget.KsToastView$1 r1 = new com.kwad.components.ad.reward.widget.KsToastView$1
            r1.<init>(r0)
            r0.Ee = r1
        Lb:
            r1 = 3
            r0.countDown = r1
            java.lang.Runnable r1 = r0.Ee
            r0.post(r1)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            java.lang.Runnable r0 = r1.Ee
            r1.removeCallbacks(r0)
            return
    }
}
