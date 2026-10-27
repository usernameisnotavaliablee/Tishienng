package com.scwang.smartrefresh.header;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class FunGameBattleCityHeader extends com.scwang.smartrefresh.header.fungame.FunGameView {
    private static int J0 = 3;
    private static final float K0 = 0.33333334f;
    private static final int L0 = 360;
    private static final int M0 = 60;
    private static final int N0 = 8;
    private int F0;
    private int G0;
    private int H0;
    private boolean I0;
    private android.util.SparseArray<java.util.Queue<android.graphics.RectF>> Q;
    private java.util.Queue<android.graphics.Point> R;
    private android.graphics.Point S;
    private java.util.Random T;
    private float U;
    private int V;
    private int W;
    private int a0;
    private int b0;
    private int c0;
    private int k0;
    private int p0;

    static {
            return
    }

    public FunGameBattleCityHeader(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r2 = 1
            r1.b0 = r2
            r0 = 4
            r1.c0 = r0
            r1.I0 = r2
            return
    }

    public FunGameBattleCityHeader(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 1
            r0.b0 = r1
            r2 = 4
            r0.c0 = r2
            r0.I0 = r1
            return
    }

    public FunGameBattleCityHeader(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 1
            r0.b0 = r1
            r2 = 4
            r0.c0 = r2
            r0.I0 = r1
            return
    }

    @androidx.annotation.RequiresApi(21)
    public FunGameBattleCityHeader(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r1 = 1
            r0.b0 = r1
            r2 = 4
            r0.c0 = r2
            r0.I0 = r1
            return
    }

    private int W() {
            r2 = this;
            java.util.Random r0 = r2.T
            int r1 = com.scwang.smartrefresh.header.FunGameBattleCityHeader.J0
            int r0 = r0.nextInt(r1)
            return r0
    }

    private boolean X(int r2, float r3, float r4) {
            r1 = this;
            android.util.SparseArray<java.util.Queue<android.graphics.RectF>> r0 = r1.Q
            java.lang.Object r2 = r0.get(r2)
            java.util.Queue r2 = (java.util.Queue) r2
            java.lang.Object r2 = r2.peek()
            android.graphics.RectF r2 = (android.graphics.RectF) r2
            if (r2 == 0) goto L18
            boolean r2 = r2.contains(r3, r4)
            if (r2 == 0) goto L18
            r2 = 1
            return r2
        L18:
            r2 = 0
            return r2
    }

    private boolean Y(android.graphics.Point r4) {
            r3 = this;
            int r0 = r4.y
            int r0 = r3.e0(r0)
            android.util.SparseArray<java.util.Queue<android.graphics.RectF>> r1 = r3.Q
            java.lang.Object r1 = r1.get(r0)
            java.util.Queue r1 = (java.util.Queue) r1
            java.lang.Object r1 = r1.peek()
            android.graphics.RectF r1 = (android.graphics.RectF) r1
            if (r1 == 0) goto L3b
            int r2 = r4.x
            float r2 = (float) r2
            int r4 = r4.y
            float r4 = (float) r4
            boolean r4 = r1.contains(r2, r4)
            if (r4 == 0) goto L3b
            int r4 = r3.H0
            r1 = 1
            int r4 = r4 + r1
            r3.H0 = r4
            int r2 = r3.G0
            if (r4 != r2) goto L2f
            r3.g0()
        L2f:
            android.util.SparseArray<java.util.Queue<android.graphics.RectF>> r4 = r3.Q
            java.lang.Object r4 = r4.get(r0)
            java.util.Queue r4 = (java.util.Queue) r4
            r4.poll()
            return r1
        L3b:
            r4 = 0
            return r4
    }

    private void Z(android.graphics.Canvas r4, android.graphics.Point r5) {
            r3 = this;
            int r0 = r5.x
            int r1 = r3.c0
            int r0 = r0 - r1
            r5.x = r0
            float r0 = (float) r0
            int r5 = r5.y
            float r5 = (float) r5
            float r1 = r3.U
            android.graphics.Paint r2 = r3.w
            r4.drawCircle(r0, r5, r1, r2)
            return
    }

    private void a0(android.graphics.Canvas r12, int r13) {
            r11 = this;
            android.graphics.Paint r0 = r11.w
            int r1 = r11.B
            r0.setColor(r1)
            int r0 = r11.k0
            int r1 = r11.b0
            int r0 = r0 + r1
            r11.k0 = r0
            int r1 = r11.V
            int r0 = r0 / r1
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L19
            boolean r0 = r11.I0
            if (r0 == 0) goto L1d
        L19:
            r11.k0 = r1
            r11.I0 = r1
        L1d:
            int r0 = r11.W()
            r3 = 0
            r4 = 0
        L23:
            int r5 = com.scwang.smartrefresh.header.FunGameBattleCityHeader.J0
            if (r3 >= r5) goto L75
            android.util.SparseArray<java.util.Queue<android.graphics.RectF>> r5 = r11.Q
            java.lang.Object r5 = r5.get(r3)
            java.util.Queue r5 = (java.util.Queue) r5
            int r6 = r11.k0
            if (r6 != 0) goto L3c
            if (r3 != r0) goto L3c
            android.graphics.RectF r6 = r11.d0(r3)
            r5.offer(r6)
        L3c:
            java.util.Iterator r6 = r5.iterator()
        L40:
            boolean r7 = r6.hasNext()
            r8 = 2
            if (r7 == 0) goto L67
            java.lang.Object r7 = r6.next()
            android.graphics.RectF r7 = (android.graphics.RectF) r7
            float r9 = r7.left
            float r10 = (float) r13
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 < 0) goto L63
            int r4 = r11.F0
            int r4 = r4 + r2
            r11.F0 = r4
            r7 = 8
            if (r4 < r7) goto L61
            r11.A = r8
            r4 = 1
            goto L67
        L61:
            r4 = 1
            goto L40
        L63:
            r11.c0(r12, r7)
            goto L40
        L67:
            int r6 = r11.A
            if (r6 != r8) goto L6c
            goto L75
        L6c:
            if (r4 == 0) goto L72
            r5.poll()
            r4 = 0
        L72:
            int r3 = r3 + 1
            goto L23
        L75:
            r11.invalidate()
            return
    }

    private void b0(android.graphics.Canvas r17, int r18) {
            r16 = this;
            r0 = r16
            r1 = r18
            android.graphics.Paint r2 = r0.w
            int r3 = r0.C
            r2.setColor(r3)
            float r2 = r0.y
            int r2 = (int) r2
            int r2 = r0.e0(r2)
            int r3 = r0.z
            int r3 = r1 - r3
            float r3 = (float) r3
            float r4 = r0.y
            boolean r2 = r0.X(r2, r3, r4)
            float r3 = r0.y
            int r4 = r0.z
            float r4 = (float) r4
            float r3 = r3 + r4
            int r3 = (int) r3
            int r3 = r0.e0(r3)
            int r4 = r0.z
            int r5 = r1 - r4
            float r5 = (float) r5
            float r6 = r0.y
            float r4 = (float) r4
            float r6 = r6 + r4
            boolean r3 = r0.X(r3, r5, r6)
            if (r2 != 0) goto L39
            if (r3 == 0) goto L3c
        L39:
            r2 = 2
            r0.A = r2
        L3c:
            int r2 = r0.z
            int r3 = r1 - r2
            float r5 = (float) r3
            float r3 = r0.y
            float r4 = r0.l
            float r6 = r3 + r4
            float r7 = (float) r1
            float r2 = (float) r2
            float r3 = r3 + r2
            float r8 = r3 + r4
            android.graphics.Paint r9 = r0.w
            r4 = r17
            r4.drawRect(r5, r6, r7, r8, r9)
            int r2 = r0.z
            int r3 = r1 - r2
            int r4 = r0.a0
            int r3 = r3 - r4
            float r11 = (float) r3
            float r3 = r0.y
            int r5 = r2 - r4
            float r5 = (float) r5
            r6 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r6
            float r12 = r3 + r5
            int r1 = r1 - r2
            float r13 = (float) r1
            int r2 = r2 - r4
            float r1 = (float) r2
            float r1 = r1 * r6
            float r3 = r3 + r1
            float r1 = (float) r4
            float r14 = r3 + r1
            android.graphics.Paint r15 = r0.w
            r10 = r17
            r10.drawRect(r11, r12, r13, r14, r15)
            return
    }

    private void c0(android.graphics.Canvas r10, android.graphics.RectF r11) {
            r9 = this;
            float r0 = r11.left
            int r1 = r9.b0
            float r2 = (float) r1
            float r0 = r0 + r2
            float r2 = r11.top
            float r3 = r11.right
            float r1 = (float) r1
            float r3 = r3 + r1
            float r1 = r11.bottom
            r11.set(r0, r2, r3, r1)
            android.graphics.Paint r0 = r9.w
            r10.drawRect(r11, r0)
            float r0 = r11.top
            int r1 = r9.z
            int r2 = r9.a0
            int r1 = r1 - r2
            float r1 = (float) r1
            r3 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r3
            float r5 = r0 + r1
            float r4 = r11.right
            float r11 = (float) r2
            float r6 = r4 + r11
            float r11 = (float) r2
            float r7 = r5 + r11
            android.graphics.Paint r8 = r9.w
            r3 = r10
            r3.drawRect(r4, r5, r6, r7, r8)
            return
    }

    private android.graphics.RectF d0(int r5) {
            r4 = this;
            int r0 = r4.z
            int r1 = r4.a0
            int r1 = r1 + r0
            int r1 = -r1
            float r1 = (float) r1
            int r5 = r5 * r0
            float r5 = (float) r5
            float r0 = r4.l
            float r5 = r5 + r0
            android.graphics.RectF r0 = new android.graphics.RectF
            int r2 = r4.a0
            float r2 = (float) r2
            r3 = 1075838976(0x40200000, float:2.5)
            float r2 = r2 * r3
            float r2 = r2 + r1
            int r3 = r4.z
            float r3 = (float) r3
            float r3 = r3 + r5
            r0.<init>(r1, r5, r2, r3)
            return r0
    }

    private int e0(int r3) {
            r2 = this;
            int r0 = r2.b
            int r1 = com.scwang.smartrefresh.header.FunGameBattleCityHeader.J0
            int r0 = r0 / r1
            int r3 = r3 / r0
            if (r3 < r1) goto La
            int r3 = r1 + (-1)
        La:
            if (r3 >= 0) goto Ld
            r3 = 0
        Ld:
            return r3
    }

    private void f0(android.graphics.Canvas r6, int r7) {
            r5 = this;
            android.graphics.Paint r0 = r5.w
            int r1 = r5.D
            r0.setColor(r1)
            int r0 = r5.p0
            int r1 = r5.c0
            int r0 = r0 + r1
            r5.p0 = r0
            int r1 = r5.W
            int r0 = r0 / r1
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L17
            r5.p0 = r1
        L17:
            int r0 = r5.p0
            if (r0 != 0) goto L38
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>()
            int r3 = r5.z
            int r7 = r7 - r3
            int r4 = r5.a0
            int r7 = r7 - r4
            r0.x = r7
            float r7 = r5.y
            float r3 = (float) r3
            r4 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 * r4
            float r7 = r7 + r3
            int r7 = (int) r7
            r0.y = r7
            java.util.Queue<android.graphics.Point> r7 = r5.R
            r7.offer(r0)
        L38:
            java.util.Queue<android.graphics.Point> r7 = r5.R
            java.util.Iterator r7 = r7.iterator()
        L3e:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L63
            java.lang.Object r0 = r7.next()
            android.graphics.Point r0 = (android.graphics.Point) r0
            boolean r3 = r5.Y(r0)
            if (r3 == 0) goto L53
            r5.S = r0
            goto L3e
        L53:
            int r3 = r0.x
            float r3 = (float) r3
            float r4 = r5.U
            float r3 = r3 + r4
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 > 0) goto L5f
            r1 = 1
        L5f:
            r5.Z(r6, r0)
            goto L3e
        L63:
            if (r1 == 0) goto L6a
            java.util.Queue<android.graphics.Point> r6 = r5.R
            r6.poll()
        L6a:
            java.util.Queue<android.graphics.Point> r6 = r5.R
            android.graphics.Point r7 = r5.S
            r6.remove(r7)
            r6 = 0
            r5.S = r6
            return
    }

    private void g0() {
            r3 = this;
            int r0 = r3.G0
            int r0 = r0 + 8
            r3.G0 = r0
            int r0 = r3.b0
            r1 = 1065353216(0x3f800000, float:1.0)
            int r2 = com.scwang.smartrefresh.layout.util.c.b(r1)
            int r0 = r0 + r2
            r3.b0 = r0
            int r0 = r3.c0
            int r1 = com.scwang.smartrefresh.layout.util.c.b(r1)
            int r0 = r0 + r1
            r3.c0 = r0
            r0 = 0
            r3.H0 = r0
            int r0 = r3.V
            r1 = 12
            if (r0 <= r1) goto L26
            int r0 = r0 - r1
            r3.V = r0
        L26:
            int r0 = r3.W
            r1 = 30
            if (r0 <= r1) goto L2f
            int r0 = r0 - r1
            r3.W = r0
        L2f:
            return
    }

    @Override // com.scwang.smartrefresh.header.fungame.FunGameView
    protected void M(android.graphics.Canvas r5, int r6, int r7) {
            r4 = this;
            r4.b0(r5, r6)
            int r7 = r4.A
            r0 = 1
            r1 = 3
            if (r7 == r0) goto Le
            if (r7 == r1) goto Le
            r0 = 4
            if (r7 != r0) goto L14
        Le:
            r4.a0(r5, r6)
            r4.f0(r5, r6)
        L14:
            boolean r6 = r4.isInEditMode()
            if (r6 == 0) goto L4f
            android.graphics.RectF r6 = new android.graphics.RectF
            int r7 = r4.z
            float r0 = (float) r7
            int r2 = r7 * 2
            float r2 = (float) r2
            float r7 = (float) r7
            r3 = 0
            r6.<init>(r0, r3, r2, r7)
            r4.c0(r5, r6)
            android.graphics.RectF r6 = new android.graphics.RectF
            int r7 = r4.z
            float r0 = (float) r7
            float r2 = (float) r7
            int r7 = r7 * 2
            float r7 = (float) r7
            r6.<init>(r3, r0, r2, r7)
            r4.c0(r5, r6)
            android.graphics.RectF r6 = new android.graphics.RectF
            int r7 = r4.z
            int r0 = r7 * 3
            float r0 = (float) r0
            int r2 = r7 * 2
            float r2 = (float) r2
            int r3 = r7 * 4
            float r3 = (float) r3
            int r7 = r7 * 3
            float r7 = (float) r7
            r6.<init>(r0, r2, r3, r7)
            r4.c0(r5, r6)
        L4f:
            return
    }

    @Override // com.scwang.smartrefresh.header.fungame.FunGameView
    protected void R() {
            r4 = this;
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r4.T = r0
            int r0 = r4.b
            int r1 = com.scwang.smartrefresh.header.FunGameBattleCityHeader.J0
            int r0 = r0 / r1
            r4.z = r0
            float r0 = (float) r0
            r1 = 1051372203(0x3eaaaaab, float:0.33333334)
            float r0 = r0 * r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            double r2 = (double) r0
            double r2 = java.lang.Math.floor(r2)
            int r0 = (int) r2
            r4.a0 = r0
            float r0 = (float) r0
            r2 = 1073741824(0x40000000, float:2.0)
            float r3 = r4.l
            float r3 = r3 * r2
            float r0 = r0 - r3
            float r0 = r0 * r1
            r4.U = r0
            r4.V()
            return
    }

    @Override // com.scwang.smartrefresh.header.fungame.FunGameView
    protected void V() {
            r3 = this;
            r0 = 0
            r3.A = r0
            float r1 = r3.l
            r3.y = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = com.scwang.smartrefresh.layout.util.c.b(r1)
            r3.b0 = r1
            r1 = 1082130432(0x40800000, float:4.0)
            int r1 = com.scwang.smartrefresh.layout.util.c.b(r1)
            r3.c0 = r1
            r1 = 8
            r3.G0 = r1
            r3.H0 = r0
            r1 = 1
            r3.I0 = r1
            int r1 = r3.z
            int r2 = r3.a0
            int r1 = r1 + r2
            int r1 = r1 + 60
            r3.V = r1
            r1 = 360(0x168, float:5.04E-43)
            r3.W = r1
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r3.Q = r1
        L34:
            int r1 = com.scwang.smartrefresh.header.FunGameBattleCityHeader.J0
            if (r0 >= r1) goto L45
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            android.util.SparseArray<java.util.Queue<android.graphics.RectF>> r2 = r3.Q
            r2.put(r0, r1)
            int r0 = r0 + 1
            goto L34
        L45:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r3.R = r0
            return
    }
}
