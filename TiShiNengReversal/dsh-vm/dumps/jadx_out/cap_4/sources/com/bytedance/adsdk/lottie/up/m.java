package com.bytedance.adsdk.lottie.up;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class m extends com.bytedance.adsdk.lottie.up.j implements android.view.Choreographer.FrameCallback {
    private int ae;
    private boolean cw;
    private float g;
    protected boolean j;

    /* renamed from: m, reason: collision with root package name */
    private float f1900m;
    private com.bytedance.adsdk.lottie.m oq;
    private boolean qv;

    /* renamed from: r, reason: collision with root package name */
    private long f1901r;
    private float tl;
    private float up;
    private float xt;

    public m() {
            r3 = this;
            r3.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.xt = r0
            r0 = 0
            r3.cw = r0
            r1 = 0
            r3.f1901r = r1
            r1 = 0
            r3.up = r1
            r3.f1900m = r1
            r3.ae = r0
            r1 = -822083584(0xffffffffcf000000, float:-2.1474836E9)
            r3.tl = r1
            r1 = 1325400064(0x4f000000, float:2.1474836E9)
            r3.g = r1
            r3.j = r0
            r3.qv = r0
            return
    }

    private boolean kt() {
            r2 = this;
            float r0 = r2.oq()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto Lb
            r0 = 1
            return r0
        Lb:
            r0 = 0
            return r0
    }

    private float mi() {
            r2 = this;
            com.bytedance.adsdk.lottie.m r0 = r2.oq
            if (r0 != 0) goto L8
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            return r0
        L8:
            r1 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r0 = r0.jy()
            float r1 = r1 / r0
            float r0 = r2.xt
            float r0 = java.lang.Math.abs(r0)
            float r1 = r1 / r0
            return r1
    }

    private void tj() {
            r6 = this;
            com.bytedance.adsdk.lottie.m r0 = r6.oq
            if (r0 != 0) goto L5
            goto L13
        L5:
            float r0 = r6.f1900m
            float r1 = r6.tl
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 < 0) goto L14
            float r1 = r6.g
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L14
        L13:
            return
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            float r1 = r6.tl
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            float r2 = r6.g
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            float r3 = r6.f1900m
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r1
            r1 = 1
            r4[r1] = r2
            r1 = 2
            r4[r1] = r3
            java.lang.String r1 = "Frame must be [%f,%f]. It is %f"
            java.lang.String r1 = java.lang.String.format(r1, r4)
            r0.<init>(r1)
            throw r0
    }

    public float ae() {
            r1 = this;
            float r0 = r1.f1900m
            return r0
    }

    public float av() {
            r3 = this;
            com.bytedance.adsdk.lottie.m r0 = r3.oq
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            float r1 = r3.g
            r2 = 1325400064(0x4f000000, float:2.1474836E9)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 != 0) goto L13
            float r0 = r0.ae()
            return r0
        L13:
            return r1
    }

    public float az() {
            r3 = this;
            com.bytedance.adsdk.lottie.m r0 = r3.oq
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            float r1 = r3.tl
            r2 = -822083584(0xffffffffcf000000, float:-2.1474836E9)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 != 0) goto L13
            float r0 = r0.m()
            return r0
        L13:
            return r1
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    @com.bytedance.component.sdk.annotation.MainThread
    public void cancel() {
            r0 = this;
            r0.xt()
            r0.w()
            return
    }

    public void cw(float r1) {
            r0 = this;
            r0.xt = r1
            return
    }

    public void cw(boolean r1) {
            r0 = this;
            r0.qv = r1
            return
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long r7) {
            r6 = this;
            r6.i()
            com.bytedance.adsdk.lottie.m r0 = r6.oq
            if (r0 == 0) goto Lcb
            boolean r0 = r6.isRunning()
            if (r0 != 0) goto Lf
            goto Lcb
        Lf:
            java.lang.String r0 = "LottieValueAnimator#doFrame"
            com.bytedance.adsdk.lottie.up.j(r0)
            long r1 = r6.f1901r
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L1d
            goto L1f
        L1d:
            long r3 = r7 - r1
        L1f:
            float r1 = r6.mi()
            float r2 = (float) r3
            float r2 = r2 / r1
            float r1 = r6.up
            boolean r3 = r6.kt()
            if (r3 == 0) goto L2e
            float r2 = -r2
        L2e:
            float r1 = r1 + r2
            float r2 = r6.az()
            float r3 = r6.av()
            boolean r2 = com.bytedance.adsdk.lottie.up.tl.cw(r1, r2, r3)
            float r3 = r6.up
            float r4 = r6.az()
            float r5 = r6.av()
            float r1 = com.bytedance.adsdk.lottie.up.tl.xt(r1, r4, r5)
            r6.up = r1
            boolean r4 = r6.qv
            if (r4 == 0) goto L55
            double r4 = (double) r1
            double r4 = java.lang.Math.floor(r4)
            float r1 = (float) r4
        L55:
            r6.f1900m = r1
            r6.f1901r = r7
            boolean r1 = r6.qv
            if (r1 == 0) goto L63
            float r1 = r6.up
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L66
        L63:
            r6.cw()
        L66:
            if (r2 != 0) goto Lc5
            int r1 = r6.getRepeatCount()
            r2 = -1
            if (r1 == r2) goto L96
            int r1 = r6.ae
            int r2 = r6.getRepeatCount()
            if (r1 < r2) goto L96
            float r7 = r6.xt
            r8 = 0
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto L83
            float r7 = r6.az()
            goto L87
        L83:
            float r7 = r6.av()
        L87:
            r6.up = r7
            r6.f1900m = r7
            r6.w()
            boolean r7 = r6.kt()
            r6.xt(r7)
            goto Lc5
        L96:
            r6.j()
            int r1 = r6.ae
            int r1 = r1 + 1
            r6.ae = r1
            int r1 = r6.getRepeatMode()
            r2 = 2
            if (r1 != r2) goto Lb0
            boolean r1 = r6.cw
            r1 = r1 ^ 1
            r6.cw = r1
            r6.g()
            goto Lc3
        Lb0:
            boolean r1 = r6.kt()
            if (r1 == 0) goto Lbb
            float r1 = r6.av()
            goto Lbf
        Lbb:
            float r1 = r6.az()
        Lbf:
            r6.up = r1
            r6.f1900m = r1
        Lc3:
            r6.f1901r = r7
        Lc5:
            r6.tj()
            com.bytedance.adsdk.lottie.up.xt(r0)
        Lcb:
            return
    }

    public void g() {
            r1 = this;
            float r0 = r1.oq()
            float r0 = -r0
            r1.cw(r0)
            return
    }

    @Override // android.animation.ValueAnimator
    @com.bytedance.component.sdk.annotation.FloatRange(from = 0.0d, to = 1.0d)
    public float getAnimatedFraction() {
            r3 = this;
            com.bytedance.adsdk.lottie.m r0 = r3.oq
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            boolean r0 = r3.kt()
            if (r0 == 0) goto L1e
            float r0 = r3.av()
            float r1 = r3.f1900m
            float r0 = r0 - r1
            float r1 = r3.av()
            float r2 = r3.az()
        L1b:
            float r1 = r1 - r2
            float r0 = r0 / r1
            return r0
        L1e:
            float r0 = r3.f1900m
            float r1 = r3.az()
            float r0 = r0 - r1
            float r1 = r3.av()
            float r2 = r3.az()
            goto L1b
    }

    @Override // android.animation.ValueAnimator
    public java.lang.Object getAnimatedValue() {
            r1 = this;
            float r0 = r1.m()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
            r2 = this;
            com.bytedance.adsdk.lottie.m r0 = r2.oq
            if (r0 != 0) goto L7
            r0 = 0
            return r0
        L7:
            float r0 = r0.up()
            long r0 = (long) r0
            return r0
    }

    protected void i() {
            r1 = this;
            boolean r0 = r1.isRunning()
            if (r0 == 0) goto L11
            r0 = 0
            r1.r(r0)
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            r0.postFrameCallback(r1)
        L11:
            return
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
            r1 = this;
            boolean r0 = r1.j
            return r0
    }

    public void j(float r3) {
            r2 = this;
            float r0 = r2.up
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L7
            return
        L7:
            float r0 = r2.az()
            float r1 = r2.av()
            float r3 = com.bytedance.adsdk.lottie.up.tl.xt(r3, r0, r1)
            r2.up = r3
            boolean r0 = r2.qv
            if (r0 == 0) goto L1f
            double r0 = (double) r3
            double r0 = java.lang.Math.floor(r0)
            float r3 = (float) r0
        L1f:
            r2.f1900m = r3
            r0 = 0
            r2.f1901r = r0
            r2.cw()
            return
    }

    public void j(float r4, float r5) {
            r3 = this;
            int r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r0 > 0) goto L42
            com.bytedance.adsdk.lottie.m r0 = r3.oq
            if (r0 != 0) goto Lc
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            goto L10
        Lc:
            float r0 = r0.m()
        L10:
            com.bytedance.adsdk.lottie.m r1 = r3.oq
            if (r1 != 0) goto L18
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            goto L1c
        L18:
            float r1 = r1.ae()
        L1c:
            float r4 = com.bytedance.adsdk.lottie.up.tl.xt(r4, r0, r1)
            float r5 = com.bytedance.adsdk.lottie.up.tl.xt(r5, r0, r1)
            float r0 = r3.tl
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L32
            float r0 = r3.g
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 == 0) goto L31
            goto L32
        L31:
            return
        L32:
            r3.tl = r4
            r3.g = r5
            float r0 = r3.f1900m
            float r4 = com.bytedance.adsdk.lottie.up.tl.xt(r0, r4, r5)
            int r4 = (int) r4
            float r4 = (float) r4
            r3.j(r4)
            return
        L42:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r5
            java.lang.String r4 = "minFrame (%s) must be <= maxFrame (%s)"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
    }

    public void j(int r2) {
            r1 = this;
            float r2 = (float) r2
            float r0 = r1.g
            int r0 = (int) r0
            float r0 = (float) r0
            r1.j(r2, r0)
            return
    }

    public void j(com.bytedance.adsdk.lottie.m r3) {
            r2 = this;
            com.bytedance.adsdk.lottie.m r0 = r2.oq
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            r2.oq = r3
            if (r0 == 0) goto L23
            float r0 = r2.tl
            float r1 = r3.m()
            float r0 = java.lang.Math.max(r0, r1)
            float r1 = r2.g
            float r3 = r3.ae()
            float r3 = java.lang.Math.min(r1, r3)
            r2.j(r0, r3)
            goto L32
        L23:
            float r0 = r3.m()
            int r0 = (int) r0
            float r0 = (float) r0
            float r3 = r3.ae()
            int r3 = (int) r3
            float r3 = (float) r3
            r2.j(r0, r3)
        L32:
            float r3 = r2.f1900m
            r0 = 0
            r2.f1900m = r0
            r2.up = r0
            int r3 = (int) r3
            float r3 = (float) r3
            r2.j(r3)
            r2.cw()
            return
    }

    @com.bytedance.component.sdk.annotation.MainThread
    public void jy() {
            r0 = this;
            r0.w()
            r0.r()
            return
    }

    @com.bytedance.component.sdk.annotation.FloatRange(from = 0.0d, to = 1.0d)
    public float m() {
            r3 = this;
            com.bytedance.adsdk.lottie.m r0 = r3.oq
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            float r1 = r3.f1900m
            float r0 = r0.m()
            float r1 = r1 - r0
            com.bytedance.adsdk.lottie.m r0 = r3.oq
            float r0 = r0.ae()
            com.bytedance.adsdk.lottie.m r2 = r3.oq
            float r2 = r2.m()
            float r0 = r0 - r2
            float r1 = r1 / r0
            return r1
    }

    public float oq() {
            r1 = this;
            float r0 = r1.xt
            return r0
    }

    @com.bytedance.component.sdk.annotation.MainThread
    public void qv() {
            r2 = this;
            r0 = 1
            r2.j = r0
            boolean r0 = r2.kt()
            r2.j(r0)
            boolean r0 = r2.kt()
            if (r0 == 0) goto L15
            float r0 = r2.av()
            goto L19
        L15:
            float r0 = r2.az()
        L19:
            int r0 = (int) r0
            float r0 = (float) r0
            r2.j(r0)
            r0 = 0
            r2.f1901r = r0
            r0 = 0
            r2.ae = r0
            r2.i()
            return
    }

    @com.bytedance.component.sdk.annotation.MainThread
    protected void r(boolean r2) {
            r1 = this;
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            r0.removeFrameCallback(r1)
            if (r2 == 0) goto Lc
            r2 = 0
            r1.j = r2
        Lc:
            return
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int r2) {
            r1 = this;
            super.setRepeatMode(r2)
            r0 = 2
            if (r2 == r0) goto L10
            boolean r2 = r1.cw
            if (r2 == 0) goto L10
            r2 = 0
            r1.cw = r2
            r1.g()
        L10:
            return
    }

    public void tl() {
            r1 = this;
            r0 = 0
            r1.oq = r0
            r0 = -822083584(0xffffffffcf000000, float:-2.1474836E9)
            r1.tl = r0
            r0 = 1325400064(0x4f000000, float:2.1474836E9)
            r1.g = r0
            return
    }

    @com.bytedance.component.sdk.annotation.MainThread
    public void vl() {
            r1 = this;
            r1.w()
            boolean r0 = r1.kt()
            r1.xt(r0)
            return
    }

    @com.bytedance.component.sdk.annotation.MainThread
    protected void w() {
            r1 = this;
            r0 = 1
            r1.r(r0)
            return
    }

    @com.bytedance.component.sdk.annotation.MainThread
    public void ws() {
            r2 = this;
            r0 = 1
            r2.j = r0
            r2.i()
            r0 = 0
            r2.f1901r = r0
            boolean r0 = r2.kt()
            if (r0 == 0) goto L24
            float r0 = r2.ae()
            float r1 = r2.az()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L24
            float r0 = r2.av()
            r2.j(r0)
            goto L3d
        L24:
            boolean r0 = r2.kt()
            if (r0 != 0) goto L3d
            float r0 = r2.ae()
            float r1 = r2.av()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L3d
            float r0 = r2.az()
            r2.j(r0)
        L3d:
            r2.up()
            return
    }

    @Override // com.bytedance.adsdk.lottie.up.j
    void xt() {
            r1 = this;
            super.xt()
            boolean r0 = r1.kt()
            r1.xt(r0)
            return
    }

    public void xt(float r2) {
            r1 = this;
            float r0 = r1.tl
            r1.j(r0, r2)
            return
    }
}
