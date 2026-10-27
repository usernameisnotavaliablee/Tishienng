package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class b6 {
    private static final java.lang.Object r = null;
    private final java.util.ArrayList<com.huawei.hms.scankit.p.w5> a;
    private final java.util.ArrayList<com.huawei.hms.scankit.p.w5> b;
    private int c;
    private long d;
    private boolean e;
    private float f;
    private int[] g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private boolean m;
    private android.graphics.Path n;
    private android.graphics.PathMeasure o;
    private com.huawei.hms.scankit.p.x5 p;
    private com.huawei.hms.scankit.p.z5 q;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.huawei.hms.scankit.p.b6.r = r0
            return
    }

    public b6(int r2, long r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.b = r0
            r0 = 0
            r1.m = r0
            com.huawei.hms.scankit.p.x5 r0 = new com.huawei.hms.scankit.p.x5
            r0.<init>()
            r1.p = r0
            com.huawei.hms.scankit.p.z5 r0 = new com.huawei.hms.scankit.p.z5
            r0.<init>()
            r1.q = r0
            r1.a(r2, r3)
            r2 = 0
            r1.a(r2)
            return
    }

    private int a(int r1, int r2) {
            r0 = this;
            if (r1 != r2) goto L3
            return r1
        L3:
            if (r1 >= r2) goto Lc
            int r2 = r2 - r1
            int r2 = com.huawei.hms.scankit.p.n6.a(r2)
            int r2 = r2 + r1
            return r2
        Lc:
            int r1 = r1 - r2
            int r1 = com.huawei.hms.scankit.p.n6.a(r1)
            int r1 = r1 + r2
            return r1
    }

    private void a(int r3) {
            r2 = this;
            java.lang.Object r0 = com.huawei.hms.scankit.p.b6.r
            monitor-enter(r0)
            r1 = 0
            r2.h = r1     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            float r3 = (float) r3
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r3 = r3 / r0
            r2.f = r3
            r3 = 1
            r2.e = r3
            return
        L11:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r3
    }

    private void a(int r2, long r3) {
            r1 = this;
            r0 = 2
            int[] r0 = new int[r0]
            r1.g = r0
            r1.c = r2
            r1.d = r3
            return
    }

    private void a(long r12) {
            r11 = this;
            java.util.ArrayList<com.huawei.hms.scankit.p.w5> r0 = r11.a
            r1 = 0
            java.lang.Object r0 = r0.remove(r1)
            r2 = r0
            com.huawei.hms.scankit.p.w5 r2 = (com.huawei.hms.scankit.p.w5) r2
            com.huawei.hms.scankit.p.z5 r0 = r11.q
            r0.a(r2)
            boolean r0 = r11.m
            r10 = 1
            if (r0 == 0) goto L32
            android.graphics.PathMeasure r0 = r11.o
            if (r0 == 0) goto L32
            float r0 = r0.getLength()
            r3 = 0
            float[] r0 = r11.a(r3, r0)
            r1 = r0[r1]
            int r1 = (int) r1
            r0 = r0[r10]
            int r0 = (int) r0
            long r3 = r11.d
            float r5 = (float) r1
            float r6 = (float) r0
            com.huawei.hms.scankit.p.x5 r9 = r11.p
            r7 = r12
            r2.a(r3, r5, r6, r7, r9)
            goto L4c
        L32:
            r7 = r12
            int r12 = r11.j
            int r13 = r11.i
            int r12 = r11.a(r12, r13)
            int r13 = r11.l
            int r0 = r11.k
            int r13 = r11.a(r13, r0)
            long r3 = r11.d
            float r5 = (float) r12
            float r6 = (float) r13
            com.huawei.hms.scankit.p.x5 r9 = r11.p
            r2.a(r3, r5, r6, r7, r9)
        L4c:
            java.lang.Object r12 = com.huawei.hms.scankit.p.b6.r
            monitor-enter(r12)
            java.util.ArrayList<com.huawei.hms.scankit.p.w5> r13 = r11.b     // Catch: java.lang.Throwable -> L5b
            r13.add(r2)     // Catch: java.lang.Throwable -> L5b
            int r13 = r11.h     // Catch: java.lang.Throwable -> L5b
            int r13 = r13 + r10
            r11.h = r13     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L5b
            return
        L5b:
            r0 = move-exception
            r13 = r0
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L5b
            throw r13
    }

    private void a(android.graphics.Bitmap r4) {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.c
            if (r0 >= r1) goto L12
            java.util.ArrayList<com.huawei.hms.scankit.p.w5> r1 = r3.a
            com.huawei.hms.scankit.p.w5 r2 = new com.huawei.hms.scankit.p.w5
            r2.<init>(r4)
            r1.add(r2)
            int r0 = r0 + 1
            goto L1
        L12:
            return
    }

    private void a(@androidx.annotation.NonNull android.graphics.Rect r4) {
            r3 = this;
            int r0 = r4.left
            int[] r1 = r3.g
            r2 = 0
            r1 = r1[r2]
            int r0 = r0 - r1
            r3.j = r0
            int r1 = r4.width()
            int r0 = r0 + r1
            r3.i = r0
            int r0 = r4.top
            int[] r1 = r3.g
            r2 = 1
            r1 = r1[r2]
            int r0 = r0 - r1
            r3.l = r0
            int r4 = r4.height()
            int r0 = r0 + r4
            r3.k = r0
            return
    }

    private void a(@androidx.annotation.NonNull com.huawei.hms.scankit.p.f4 r2) {
            r1 = this;
            com.huawei.hms.scankit.p.x5 r0 = r1.p
            if (r0 != 0) goto Lb
            com.huawei.hms.scankit.p.x5 r0 = new com.huawei.hms.scankit.p.x5
            r0.<init>()
            r1.p = r0
        Lb:
            com.huawei.hms.scankit.p.x5 r0 = r1.p
            r0.a(r2)
            return
    }

    private void a(@androidx.annotation.NonNull com.huawei.hms.scankit.p.g4 r2) {
            r1 = this;
            com.huawei.hms.scankit.p.z5 r0 = r1.q
            if (r0 != 0) goto Lb
            com.huawei.hms.scankit.p.z5 r0 = new com.huawei.hms.scankit.p.z5
            r0.<init>()
            r1.q = r0
        Lb:
            com.huawei.hms.scankit.p.z5 r0 = r1.q
            r0.a(r2)
            return
    }

    private float[] a(float r5, float r6) {
            r4 = this;
            int r0 = java.lang.Float.compare(r5, r6)
            if (r0 > 0) goto Ld
            float r6 = r6 - r5
            float r6 = com.huawei.hms.scankit.p.n6.a(r6)
            float r6 = r6 + r5
            goto L13
        Ld:
            float r5 = r5 - r6
            float r5 = com.huawei.hms.scankit.p.n6.a(r5)
            float r6 = r6 + r5
        L13:
            android.graphics.PathMeasure r5 = r4.o
            r0 = 1
            if (r5 != 0) goto L21
            android.graphics.PathMeasure r5 = new android.graphics.PathMeasure
            android.graphics.Path r1 = r4.n
            r5.<init>(r1, r0)
            r4.o = r5
        L21:
            r5 = 2
            float[] r5 = new float[r5]
            android.graphics.PathMeasure r1 = r4.o
            r2 = 0
            r1.getPosTan(r6, r5, r2)
            r6 = 0
            r1 = r5[r6]
            int[] r2 = r4.g
            r3 = r2[r6]
            float r3 = (float) r3
            float r1 = r1 - r3
            r5[r6] = r1
            r6 = r5[r0]
            r1 = r2[r0]
            float r1 = (float) r1
            float r6 = r6 - r1
            r5[r0] = r6
            return r5
    }

    private void b() {
            r3 = this;
            java.lang.Object r0 = com.huawei.hms.scankit.p.b6.r
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L11
            java.util.ArrayList<com.huawei.hms.scankit.p.w5> r2 = r3.b     // Catch: java.lang.Throwable -> L11
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            java.util.ArrayList<com.huawei.hms.scankit.p.w5> r0 = r3.a
            r0.addAll(r1)
            return
        L11:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
    }

    public com.huawei.hms.scankit.p.b6 a(int r9, int r10, long r11, long r13, @androidx.annotation.NonNull android.view.animation.Interpolator r15) {
            r8 = this;
            com.huawei.hms.scankit.p.j5 r0 = new com.huawei.hms.scankit.p.j5
            r1 = r9
            r2 = r10
            r3 = r11
            r5 = r13
            r7 = r15
            r0.<init>(r1, r2, r3, r5, r7)
            r8.a(r0)
            return r8
    }

    public void a() {
            r0 = this;
            r0.b()
            return
    }

    public void a(@androidx.annotation.NonNull android.graphics.Rect r1, int r2) {
            r0 = this;
            r0.a(r1)
            r0.a(r2)
            return
    }

    public com.huawei.hms.scankit.p.b6 b(float r2, float r3) {
            r1 = this;
            com.huawei.hms.scankit.p.a6 r0 = new com.huawei.hms.scankit.p.a6
            r0.<init>(r2, r3)
            r1.a(r0)
            return r1
    }

    public void b(long r6) {
            r5 = this;
            boolean r0 = r5.e
            float r1 = r5.f
            float r2 = (float) r6
            float r1 = r1 * r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.Object r3 = com.huawei.hms.scankit.p.b6.r
            monitor-enter(r3)
        Lf:
            if (r0 == 0) goto L26
            java.util.ArrayList<com.huawei.hms.scankit.p.w5> r4 = r5.a     // Catch: java.lang.Throwable -> L24
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L24
            if (r4 != 0) goto L26
            int r4 = r5.h     // Catch: java.lang.Throwable -> L24
            float r4 = (float) r4     // Catch: java.lang.Throwable -> L24
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 >= 0) goto L26
            r5.a(r6)     // Catch: java.lang.Throwable -> L24
            goto Lf
        L24:
            r6 = move-exception
            goto L4c
        L26:
            java.util.ArrayList<com.huawei.hms.scankit.p.w5> r0 = r5.b     // Catch: java.lang.Throwable -> L24
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L24
        L2c:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L45
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L24
            com.huawei.hms.scankit.p.w5 r1 = (com.huawei.hms.scankit.p.w5) r1     // Catch: java.lang.Throwable -> L24
            boolean r4 = r1.a(r6)     // Catch: java.lang.Throwable -> L24
            if (r4 != 0) goto L2c
            r0.remove()     // Catch: java.lang.Throwable -> L24
            r2.add(r1)     // Catch: java.lang.Throwable -> L24
            goto L2c
        L45:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            java.util.ArrayList<com.huawei.hms.scankit.p.w5> r6 = r5.a
            r6.addAll(r2)
            return
        L4c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            throw r6
    }

    public java.util.List<com.huawei.hms.scankit.p.w5> c() {
            r2 = this;
            java.lang.Object r0 = com.huawei.hms.scankit.p.b6.r
            monitor-enter(r0)
            java.util.ArrayList<com.huawei.hms.scankit.p.w5> r1 = r2.b     // Catch: java.lang.Throwable -> Lb
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }
}
