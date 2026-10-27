package com.scwang.smartrefresh.layout.footer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class BallPulseFooter extends android.view.ViewGroup implements l2.d {
    private com.scwang.smartrefresh.layout.footer.ballpulse.BallPulseView a;
    private com.scwang.smartrefresh.layout.constant.SpinnerStyle b;

    public BallPulseFooter(@androidx.annotation.NonNull android.content.Context r3) {
            r2 = this;
            r2.<init>(r3)
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r0 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.Translate
            r2.b = r0
            r0 = 0
            r1 = 0
            r2.m(r3, r0, r1)
            return
    }

    public BallPulseFooter(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r0 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.Translate
            r1.b = r0
            r0 = 0
            r1.m(r2, r3, r0)
            return
    }

    public BallPulseFooter(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3, @androidx.annotation.AttrRes int r4) {
            r1 = this;
            r1.<init>(r2, r3, r4)
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r0 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.Translate
            r1.b = r0
            r1.m(r2, r3, r4)
            return
    }

    private void m(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            com.scwang.smartrefresh.layout.footer.ballpulse.BallPulseView r4 = new com.scwang.smartrefresh.layout.footer.ballpulse.BallPulseView
            r4.<init>(r2)
            r1.a = r4
            r0 = -2
            r1.addView(r4, r0, r0)
            r4 = 1114636288(0x42700000, float:60.0)
            int r4 = com.scwang.smartrefresh.layout.util.c.b(r4)
            r1.setMinimumHeight(r4)
            int[] r4 = com.scwang.smartrefresh.layout.R.styleable.BallPulseFooter
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r4)
            int r3 = com.scwang.smartrefresh.layout.R.styleable.BallPulseFooter_srlPrimaryColor
            r4 = 0
            int r3 = r2.getColor(r3, r4)
            int r0 = com.scwang.smartrefresh.layout.R.styleable.BallPulseFooter_srlAccentColor
            int r4 = r2.getColor(r0, r4)
            if (r3 == 0) goto L2e
            com.scwang.smartrefresh.layout.footer.ballpulse.BallPulseView r0 = r1.a
            r0.setNormalColor(r3)
        L2e:
            if (r4 == 0) goto L35
            com.scwang.smartrefresh.layout.footer.ballpulse.BallPulseView r3 = r1.a
            r3.setAnimatingColor(r4)
        L35:
            com.scwang.smartrefresh.layout.constant.SpinnerStyle[] r3 = com.scwang.smartrefresh.layout.constant.SpinnerStyle.values()
            int r4 = com.scwang.smartrefresh.layout.R.styleable.BallPulseFooter_srlClassicsSpinnerStyle
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r0 = r1.b
            int r0 = r0.ordinal()
            int r4 = r2.getInt(r4, r0)
            r3 = r3[r4]
            r1.b = r3
            r2.recycle()
            return
    }

    public com.scwang.smartrefresh.layout.footer.BallPulseFooter A(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            com.scwang.smartrefresh.layout.footer.ballpulse.BallPulseView r0 = r1.a
            r0.setNormalColor(r2)
            return r1
    }

    public com.scwang.smartrefresh.layout.footer.BallPulseFooter B(com.scwang.smartrefresh.layout.constant.SpinnerStyle r1) {
            r0 = this;
            r0.b = r1
            return r0
    }

    public boolean b(boolean r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public void c(float r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    public void f(l2.g r1, int r2, int r3) {
            r0 = this;
            return
    }

    public com.scwang.smartrefresh.layout.constant.SpinnerStyle getSpinnerStyle() {
            r1 = this;
            com.scwang.smartrefresh.layout.constant.SpinnerStyle r0 = r1.b
            return r0
    }

    @androidx.annotation.NonNull
    public android.view.View getView() {
            r0 = this;
            return r0
    }

    public void j(float r1, int r2, int r3) {
            r0 = this;
            return
    }

    public boolean k() {
            r1 = this;
            r0 = 0
            return r0
    }

    public com.scwang.smartrefresh.layout.footer.BallPulseFooter n(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            com.scwang.smartrefresh.layout.footer.ballpulse.BallPulseView r0 = r1.a
            r0.setAnimatingColor(r2)
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            int r1 = r0.getMeasuredWidth()
            int r2 = r0.getMeasuredHeight()
            com.scwang.smartrefresh.layout.footer.ballpulse.BallPulseView r3 = r0.a
            int r3 = r3.getMeasuredWidth()
            com.scwang.smartrefresh.layout.footer.ballpulse.BallPulseView r4 = r0.a
            int r4 = r4.getMeasuredHeight()
            int r1 = r1 / 2
            int r5 = r3 / 2
            int r1 = r1 - r5
            int r2 = r2 / 2
            int r5 = r4 / 2
            int r2 = r2 - r5
            com.scwang.smartrefresh.layout.footer.ballpulse.BallPulseView r5 = r0.a
            int r3 = r3 + r1
            int r4 = r4 + r2
            r5.layout(r1, r2, r3, r4)
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r4, int r5) {
            r3 = this;
            int r0 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            int r2 = android.view.View.MeasureSpec.getSize(r5)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
            com.scwang.smartrefresh.layout.footer.ballpulse.BallPulseView r2 = r3.a
            r2.measure(r0, r1)
            com.scwang.smartrefresh.layout.footer.ballpulse.BallPulseView r0 = r3.a
            int r0 = r0.getMeasuredWidth()
            int r4 = android.view.View.resolveSize(r0, r4)
            com.scwang.smartrefresh.layout.footer.ballpulse.BallPulseView r0 = r3.a
            int r0 = r0.getMeasuredHeight()
            int r5 = android.view.View.resolveSize(r0, r5)
            r3.setMeasuredDimension(r4, r5)
            return
    }

    public void p(l2.h r1, int r2, int r3) {
            r0 = this;
            return
    }

    public void q(l2.h r1, com.scwang.smartrefresh.layout.constant.RefreshState r2, com.scwang.smartrefresh.layout.constant.RefreshState r3) {
            r0 = this;
            return
    }

    @java.lang.Deprecated
    public void setPrimaryColors(@androidx.annotation.ColorInt int... r5) {
            r4 = this;
            int r0 = r5.length
            r1 = 0
            r2 = 1
            if (r0 <= r2) goto L14
            com.scwang.smartrefresh.layout.footer.ballpulse.BallPulseView r0 = r4.a
            r2 = r5[r2]
            r0.setNormalColor(r2)
            com.scwang.smartrefresh.layout.footer.ballpulse.BallPulseView r0 = r4.a
            r5 = r5[r1]
            r0.setAnimatingColor(r5)
            return
        L14:
            int r0 = r5.length
            if (r0 <= 0) goto L2c
            com.scwang.smartrefresh.layout.footer.ballpulse.BallPulseView r0 = r4.a
            r2 = -1711276033(0xffffffff99ffffff, float:-2.6469778E-23)
            r3 = r5[r1]
            int r2 = androidx.core.graphics.ColorUtils.compositeColors(r2, r3)
            r0.setNormalColor(r2)
            com.scwang.smartrefresh.layout.footer.ballpulse.BallPulseView r0 = r4.a
            r5 = r5[r1]
            r0.setAnimatingColor(r5)
        L2c:
            return
    }

    public void t(l2.h r1, int r2, int r3) {
            r0 = this;
            com.scwang.smartrefresh.layout.footer.ballpulse.BallPulseView r1 = r0.a
            r1.d()
            return
    }

    public void v(float r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    public int w(l2.h r1, boolean r2) {
            r0 = this;
            com.scwang.smartrefresh.layout.footer.ballpulse.BallPulseView r1 = r0.a
            r1.e()
            r1 = 0
            return r1
    }

    public com.scwang.smartrefresh.layout.footer.BallPulseFooter z(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            com.scwang.smartrefresh.layout.footer.ballpulse.BallPulseView r0 = r1.a
            r0.setIndicatorColor(r2)
            return r1
    }
}
