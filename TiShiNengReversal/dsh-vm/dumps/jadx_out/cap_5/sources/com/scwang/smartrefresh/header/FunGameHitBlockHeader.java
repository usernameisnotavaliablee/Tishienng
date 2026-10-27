package com.scwang.smartrefresh.header;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class FunGameHitBlockHeader extends com.scwang.smartrefresh.header.fungame.FunGameView {
    private static final int G0 = 5;
    private static final int H0 = 3;
    private static final float I0 = 0.01806f;
    private static final float J0 = 0.8f;
    private static final float K0 = 0.08f;
    private static final int L0 = 30;
    static final float M0 = 1.0f;
    private static final int N0 = 3;
    private int F0;
    private float Q;
    private float R;
    private float S;
    private android.graphics.Paint T;
    private float U;
    private float V;
    private float W;
    private float a0;
    private java.util.List<android.graphics.Point> b0;
    private boolean c0;
    private int k0;
    private int p0;

    public FunGameHitBlockHeader(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 0
            r1.H(r2, r0)
            return
    }

    public FunGameHitBlockHeader(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.H(r1, r2)
            return
    }

    public FunGameHitBlockHeader(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.H(r1, r2)
            return
    }

    @androidx.annotation.RequiresApi(21)
    public FunGameHitBlockHeader(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r0.H(r1, r2)
            return
    }

    private void H(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int[] r0 = com.scwang.smartrefresh.header.R.styleable.FunGameHitBlockHeader
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
            int r3 = com.scwang.smartrefresh.header.R.styleable.FunGameHitBlockHeader_fgvBlockHorizontalNum
            r0 = 3
            int r3 = r2.getInt(r3, r0)
            r1.p0 = r3
            int r3 = com.scwang.smartrefresh.header.R.styleable.FunGameHitBlockHeader_fgvBallSpeed
            r0 = 1077936128(0x40400000, float:3.0)
            int r0 = com.scwang.smartrefresh.layout.util.c.b(r0)
            int r3 = r2.getInt(r3, r0)
            r1.F0 = r3
            r2.recycle()
            android.graphics.Paint r2 = new android.graphics.Paint
            r3 = 1
            r2.<init>(r3)
            r1.T = r2
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL
            r2.setStyle(r3)
            r2 = 1082130432(0x40800000, float:4.0)
            int r2 = com.scwang.smartrefresh.layout.util.c.b(r2)
            float r2 = (float) r2
            r1.S = r2
            return
    }

    private boolean W(float r5, float r6) {
            r4 = this;
            float r0 = r4.U
            float r5 = r5 - r0
            float r0 = r4.S
            float r5 = r5 - r0
            int r0 = r4.F0
            float r0 = (float) r0
            float r5 = r5 - r0
            float r0 = r4.R
            float r5 = r5 / r0
            int r5 = (int) r5
            int r0 = r4.p0
            if (r5 != r0) goto L14
            int r5 = r5 + (-1)
        L14:
            float r0 = r4.Q
            float r6 = r6 / r0
            int r6 = (int) r6
            r0 = 5
            if (r6 != r0) goto L1d
            int r6 = r6 + (-1)
        L1d:
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>()
            r0.set(r5, r6)
            java.util.List<android.graphics.Point> r5 = r4.b0
            java.util.Iterator r5 = r5.iterator()
        L2b:
            boolean r6 = r5.hasNext()
            r1 = 1
            if (r6 == 0) goto L44
            java.lang.Object r6 = r5.next()
            android.graphics.Point r6 = (android.graphics.Point) r6
            int r2 = r0.x
            int r3 = r0.y
            boolean r6 = r6.equals(r2, r3)
            if (r6 == 0) goto L2b
            r5 = 1
            goto L45
        L44:
            r5 = 0
        L45:
            if (r5 != 0) goto L4c
            java.util.List<android.graphics.Point> r6 = r4.b0
            r6.add(r0)
        L4c:
            r5 = r5 ^ r1
            return r5
    }

    private boolean X(float r2) {
            r1 = this;
            float r0 = r1.y
            float r2 = r2 - r0
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L11
            int r0 = r1.z
            float r0 = (float) r0
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 > 0) goto L11
            r2 = 1
            return r2
        L11:
            r2 = 0
            return r2
    }

    private void Y(android.graphics.Canvas r13) {
            r12 = this;
            r0 = 0
        L1:
            int r1 = r12.p0
            int r2 = r1 * 5
            if (r0 >= r2) goto L59
            int r2 = r0 / r1
            int r1 = r0 % r1
            java.util.List<android.graphics.Point> r3 = r12.b0
            java.util.Iterator r3 = r3.iterator()
        L11:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L25
            java.lang.Object r4 = r3.next()
            android.graphics.Point r4 = (android.graphics.Point) r4
            boolean r4 = r4.equals(r1, r2)
            if (r4 == 0) goto L11
            r6 = r13
            goto L55
        L25:
            android.graphics.Paint r3 = r12.T
            int r4 = r12.B
            int r5 = r1 + 1
            r6 = 255(0xff, float:3.57E-43)
            int r6 = r6 / r5
            int r4 = com.scwang.smartrefresh.layout.util.a.A(r4, r6)
            r3.setColor(r4)
            float r3 = r12.U
            float r1 = (float) r1
            float r4 = r12.R
            r5 = 1065353216(0x3f800000, float:1.0)
            float r6 = r4 + r5
            float r1 = r1 * r6
            float r7 = r3 + r1
            float r1 = (float) r2
            float r2 = r12.Q
            float r3 = r2 + r5
            float r1 = r1 * r3
            float r8 = r1 + r5
            float r9 = r7 + r4
            float r10 = r8 + r2
            android.graphics.Paint r11 = r12.T
            r6 = r13
            r6.drawRect(r7, r8, r9, r10, r11)
        L55:
            int r0 = r0 + 1
            r13 = r6
            goto L1
        L59:
            return
    }

    private void Z(android.graphics.Canvas r9) {
            r8 = this;
            android.graphics.Paint r0 = r8.w
            int r1 = r8.C
            r0.setColor(r1)
            float r3 = r8.V
            float r4 = r8.y
            float r0 = r8.R
            float r5 = r3 + r0
            int r0 = r8.z
            float r0 = (float) r0
            float r6 = r4 + r0
            android.graphics.Paint r7 = r8.w
            r2 = r9
            r2.drawRect(r3, r4, r5, r6, r7)
            return
    }

    private void a0(android.graphics.Canvas r8, int r9) {
            r7 = this;
            android.graphics.Paint r0 = r7.w
            int r1 = r7.D
            r0.setColor(r1)
            float r0 = r7.W
            float r1 = r7.U
            int r2 = r7.p0
            float r3 = (float) r2
            float r4 = r7.R
            float r3 = r3 * r4
            float r1 = r1 + r3
            r3 = 1
            int r2 = r2 - r3
            float r2 = (float) r2
            r4 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 * r4
            float r1 = r1 + r2
            float r2 = r7.S
            float r1 = r1 + r2
            r2 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 > 0) goto L2d
            float r1 = r7.a0
            boolean r0 = r7.W(r0, r1)
            if (r0 == 0) goto L2d
            r7.c0 = r2
        L2d:
            float r0 = r7.W
            float r1 = r7.U
            float r5 = r7.S
            float r1 = r1 + r5
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 > 0) goto L3a
            r7.c0 = r2
        L3a:
            float r1 = r0 + r5
            float r2 = r7.V
            r6 = 2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L66
            float r1 = r0 - r5
            float r5 = r7.R
            float r2 = r2 + r5
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L66
            float r9 = r7.a0
            boolean r9 = r7.X(r9)
            if (r9 == 0) goto L6d
            java.util.List<android.graphics.Point> r9 = r7.b0
            int r9 = r9.size()
            int r0 = r7.p0
            int r0 = r0 * 5
            if (r9 != r0) goto L63
            r7.A = r6
            return
        L63:
            r7.c0 = r3
            goto L6d
        L66:
            float r9 = (float) r9
            int r9 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r9 <= 0) goto L6d
            r7.A = r6
        L6d:
            float r9 = r7.a0
            float r0 = r7.S
            float r1 = r0 + r4
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 > 0) goto L7c
            r0 = 150(0x96, float:2.1E-43)
            r7.k0 = r0
            goto L89
        L7c:
            int r1 = r7.b
            float r1 = (float) r1
            float r1 = r1 - r0
            float r1 = r1 - r4
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 < 0) goto L89
            r0 = 210(0xd2, float:2.94E-43)
            r7.k0 = r0
        L89:
            boolean r0 = r7.c0
            if (r0 == 0) goto L96
            float r0 = r7.W
            int r1 = r7.F0
            float r1 = (float) r1
            float r0 = r0 - r1
            r7.W = r0
            goto L9e
        L96:
            float r0 = r7.W
            int r1 = r7.F0
            float r1 = (float) r1
            float r0 = r0 + r1
            r7.W = r0
        L9e:
            int r0 = r7.k0
            double r0 = (double) r0
            double r0 = java.lang.Math.toRadians(r0)
            double r0 = java.lang.Math.tan(r0)
            float r0 = (float) r0
            int r1 = r7.F0
            float r1 = (float) r1
            float r0 = r0 * r1
            float r9 = r9 - r0
            r7.a0 = r9
            float r0 = r7.W
            float r1 = r7.S
            android.graphics.Paint r2 = r7.w
            r8.drawCircle(r0, r9, r1, r2)
            r7.invalidate()
            return
    }

    @Override // com.scwang.smartrefresh.header.fungame.FunGameView
    protected void M(android.graphics.Canvas r2, int r3, int r4) {
            r1 = this;
            r1.Y(r2)
            r1.Z(r2)
            int r4 = r1.A
            r0 = 1
            if (r4 == r0) goto L19
            r0 = 3
            if (r4 == r0) goto L19
            r0 = 4
            if (r4 == r0) goto L19
            boolean r4 = r1.isInEditMode()
            if (r4 == 0) goto L18
            goto L19
        L18:
            return
        L19:
            r1.a0(r2, r3)
            return
    }

    @Override // com.scwang.smartrefresh.header.fungame.FunGameView
    protected void R() {
            r3 = this;
            int r0 = r3.getMeasuredWidth()
            int r1 = r3.b
            int r1 = r1 / 5
            float r1 = (float) r1
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r2
            r3.Q = r1
            float r0 = (float) r0
            r2 = 1016328849(0x3c93f291, float:0.01806)
            float r2 = r2 * r0
            r3.R = r2
            r2 = 1034147594(0x3da3d70a, float:0.08)
            float r2 = r2 * r0
            r3.U = r2
            r2 = 1061997773(0x3f4ccccd, float:0.8)
            float r0 = r0 * r2
            r3.V = r0
            r0 = 1070386381(0x3fcccccd, float:1.6)
            float r1 = r1 * r0
            int r0 = (int) r1
            r3.z = r0
            return
    }

    @Override // com.scwang.smartrefresh.header.fungame.FunGameView
    protected void V() {
            r3 = this;
            float r0 = r3.V
            r1 = 1077936128(0x40400000, float:3.0)
            float r2 = r3.S
            float r2 = r2 * r1
            float r0 = r0 - r2
            r3.W = r0
            int r0 = r3.b
            float r0 = (float) r0
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r1
            int r0 = (int) r0
            float r0 = (float) r0
            r3.a0 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.y = r0
            r0 = 30
            r3.k0 = r0
            r0 = 1
            r3.c0 = r0
            java.util.List<android.graphics.Point> r0 = r3.b0
            if (r0 != 0) goto L2d
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.b0 = r0
            return
        L2d:
            r0.clear()
            return
    }
}
