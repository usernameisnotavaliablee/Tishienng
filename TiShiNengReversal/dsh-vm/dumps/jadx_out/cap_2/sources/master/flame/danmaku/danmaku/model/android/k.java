package master.flame.danmaku.danmaku.model.android;

import master.flame.danmaku.danmaku.model.android.k.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class k<VH extends master.flame.danmaku.danmaku.model.android.k.a> extends master.flame.danmaku.danmaku.model.android.b {
    public static final int e = -1;
    public static final int f = -2;
    public static final int g = -3;
    public static final int h = -3;
    private final int b;
    private final int c;
    private android.util.SparseArray<java.util.List<VH>> d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class a {
        protected final android.view.View a;

        public a(android.view.View r2) {
                r1 = this;
                r1.<init>()
                if (r2 == 0) goto L8
                r1.a = r2
                return
            L8:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "itemView may not be null"
                r2.<init>(r0)
                throw r2
        }

        public void a(android.graphics.Canvas r1, master.flame.danmaku.danmaku.model.android.a.C0124a r2) {
                r0 = this;
                android.view.View r2 = r0.a
                r2.draw(r1)
                return
        }

        public int b() {
                r1 = this;
                android.view.View r0 = r1.a
                int r0 = r0.getMeasuredHeight()
                return r0
        }

        public int c() {
                r1 = this;
                android.view.View r0 = r1.a
                int r0 = r0.getMeasuredWidth()
                return r0
        }

        public void d(int r2, int r3, int r4, int r5) {
                r1 = this;
                android.view.View r0 = r1.a
                r0.layout(r2, r3, r4, r5)
                return
        }

        public void e(int r2, int r3) {
                r1 = this;
                android.view.View r0 = r1.a
                r0.measure(r2, r3)
                return
        }
    }

    public k() {
            r1 = this;
            r1.<init>()
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1.d = r0
            r0 = -1
            r1.b = r0
            r1.c = r0
            return
    }

    @Override // master.flame.danmaku.danmaku.model.android.b
    public void b() {
            r0 = this;
            return
    }

    @Override // master.flame.danmaku.danmaku.model.android.b
    public void d(master.flame.danmaku.danmaku.model.d r22, android.graphics.Canvas r23, float r24, float r25, boolean r26, master.flame.danmaku.danmaku.model.android.a.C0124a r27) {
            r21 = this;
            r0 = r21
            r3 = r22
            r6 = r26
            r4 = r27
            int r1 = r3.s
            int r1 = r0.i(r1, r3)
            android.util.SparseArray<java.util.List<VH extends master.flame.danmaku.danmaku.model.android.k$a>> r2 = r0.d
            java.lang.Object r2 = r2.get(r1)
            java.util.List r2 = (java.util.List) r2
            r7 = 1
            if (r2 == 0) goto L25
            if (r6 == 0) goto L1d
            r5 = 1
            goto L1e
        L1d:
            r5 = 2
        L1e:
            java.lang.Object r2 = r2.get(r5)
            master.flame.danmaku.danmaku.model.android.k$a r2 = (master.flame.danmaku.danmaku.model.android.k.a) r2
            goto L26
        L25:
            r2 = 0
        L26:
            if (r2 != 0) goto L2a
            goto La4
        L2a:
            r4.j(r6)
            android.text.TextPaint r5 = r4.l(r3, r6)
            r8 = 0
            r4.g(r3, r5, r8)
            r0.j(r1, r2, r3, r4, r5)
            float r0 = r3.p
            int r0 = java.lang.Math.round(r0)
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            float r5 = r3.q
            int r5 = java.lang.Math.round(r5)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
            r2.e(r0, r1)
            if (r6 != 0) goto L5a
            r23.save()
            r23.translate(r24, r25)
            goto L5b
        L5a:
            r7 = 0
        L5b:
            int r0 = r3.k
            if (r0 == 0) goto L78
            android.graphics.Paint r14 = r4.n(r3)
            float r0 = r3.q
            float r0 = r25 + r0
            int r1 = r4.h
            float r1 = (float) r1
            float r11 = r0 - r1
            float r0 = r3.p
            float r12 = r24 + r0
            r13 = r11
            r9 = r23
            r10 = r24
            r9.drawLine(r10, r11, r12, r13, r14)
        L78:
            int r0 = r3.m
            if (r0 == 0) goto L91
            android.graphics.Paint r20 = r4.k(r3)
            float r0 = r3.p
            float r18 = r24 + r0
            float r0 = r3.q
            float r19 = r25 + r0
            r15 = r23
            r16 = r24
            r17 = r25
            r15.drawRect(r16, r17, r18, r19, r20)
        L91:
            float r0 = r3.p
            int r0 = (int) r0
            float r1 = r3.q
            int r1 = (int) r1
            r2.d(r8, r8, r0, r1)
            r9 = r23
            r2.a(r9, r4)
            if (r7 == 0) goto La4
            r9.restore()
        La4:
            return
    }

    @Override // master.flame.danmaku.danmaku.model.android.b
    public void e(master.flame.danmaku.danmaku.model.d r8, android.text.TextPaint r9, boolean r10) {
            r7 = this;
            int r10 = r8.s
            int r1 = r7.i(r10, r8)
            android.util.SparseArray<java.util.List<VH extends master.flame.danmaku.danmaku.model.android.k$a>> r10 = r7.d
            java.lang.Object r10 = r10.get(r1)
            java.util.List r10 = (java.util.List) r10
            if (r10 != 0) goto L2f
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            master.flame.danmaku.danmaku.model.android.k$a r0 = r7.k(r1)
            r10.add(r0)
            master.flame.danmaku.danmaku.model.android.k$a r0 = r7.k(r1)
            r10.add(r0)
            master.flame.danmaku.danmaku.model.android.k$a r0 = r7.k(r1)
            r10.add(r0)
            android.util.SparseArray<java.util.List<VH extends master.flame.danmaku.danmaku.model.android.k$a>> r0 = r7.d
            r0.put(r1, r10)
        L2f:
            r6 = 0
            java.lang.Object r10 = r10.get(r6)
            r2 = r10
            master.flame.danmaku.danmaku.model.android.k$a r2 = (master.flame.danmaku.danmaku.model.android.k.a) r2
            r4 = 0
            r0 = r7
            r3 = r8
            r5 = r9
            r0.j(r1, r2, r3, r4, r5)
            int r8 = r0.b
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r9)
            int r10 = r0.c
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r9)
            r2.e(r8, r9)
            int r8 = r2.c()
            int r9 = r2.b()
            r2.d(r6, r6, r8, r9)
            int r8 = r2.c()
            float r8 = (float) r8
            r3.p = r8
            int r8 = r2.b()
            float r8 = (float) r8
            r3.q = r8
            return
    }

    @Override // master.flame.danmaku.danmaku.model.android.b
    public void g(master.flame.danmaku.danmaku.model.d r2) {
            r1 = this;
            super.g(r2)
            r0 = 0
            r2.f = r0
            return
    }

    public int i(int r1, master.flame.danmaku.danmaku.model.d r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    public abstract void j(int r1, VH r2, master.flame.danmaku.danmaku.model.d r3, master.flame.danmaku.danmaku.model.android.a.C0124a r4, android.text.TextPaint r5);

    public abstract VH k(int r1);
}
