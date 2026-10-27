package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c2 {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public com.acse.ottn.b2 f2205b;

    /* renamed from: c, reason: collision with root package name */
    public com.acse.ottn.b2 f2206c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.animation.Interpolator f2207d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList<com.acse.ottn.b2> f2208e;

    /* renamed from: f, reason: collision with root package name */
    public com.acse.ottn.q4 f2209f;

    public c2(com.acse.ottn.b2... r2) {
            r1 = this;
            r1.<init>()
            int r0 = r2.length
            r1.a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f2208e = r0
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.addAll(r2)
            java.util.ArrayList<com.acse.ottn.b2> r2 = r1.f2208e
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            com.acse.ottn.b2 r2 = (com.acse.ottn.b2) r2
            r1.f2205b = r2
            java.util.ArrayList<com.acse.ottn.b2> r2 = r1.f2208e
            int r0 = r1.a
            int r0 = r0 + (-1)
            java.lang.Object r2 = r2.get(r0)
            com.acse.ottn.b2 r2 = (com.acse.ottn.b2) r2
            r1.f2206c = r2
            android.view.animation.Interpolator r2 = r2.c()
            r1.f2207d = r2
            return
    }

    public static com.acse.ottn.c2 a(float... r6) {
            int r0 = r6.length
            r1 = 2
            int r1 = java.lang.Math.max(r0, r1)
            com.acse.ottn.b2$a[] r1 = new com.acse.ottn.b2.a[r1]
            r2 = 0
            r3 = 0
            r4 = 1
            if (r0 != r4) goto L22
            com.acse.ottn.b2 r0 = com.acse.ottn.b2.a(r2)
            com.acse.ottn.b2$a r0 = (com.acse.ottn.b2.a) r0
            r1[r3] = r0
            r6 = r6[r3]
            r0 = 1065353216(0x3f800000, float:1.0)
            com.acse.ottn.b2 r6 = com.acse.ottn.b2.a(r0, r6)
            com.acse.ottn.b2$a r6 = (com.acse.ottn.b2.a) r6
            r1[r4] = r6
            goto L40
        L22:
            r5 = r6[r3]
            com.acse.ottn.b2 r2 = com.acse.ottn.b2.a(r2, r5)
            com.acse.ottn.b2$a r2 = (com.acse.ottn.b2.a) r2
            r1[r3] = r2
        L2c:
            if (r4 >= r0) goto L40
            float r2 = (float) r4
            int r3 = r0 + (-1)
            float r3 = (float) r3
            float r2 = r2 / r3
            r3 = r6[r4]
            com.acse.ottn.b2 r2 = com.acse.ottn.b2.a(r2, r3)
            com.acse.ottn.b2$a r2 = (com.acse.ottn.b2.a) r2
            r1[r4] = r2
            int r4 = r4 + 1
            goto L2c
        L40:
            com.acse.ottn.j1 r6 = new com.acse.ottn.j1
            r6.<init>(r1)
            return r6
    }

    public static com.acse.ottn.c2 a(int... r6) {
            int r0 = r6.length
            r1 = 2
            int r1 = java.lang.Math.max(r0, r1)
            com.acse.ottn.b2$b[] r1 = new com.acse.ottn.b2.b[r1]
            r2 = 0
            r3 = 0
            r4 = 1
            if (r0 != r4) goto L22
            com.acse.ottn.b2 r0 = com.acse.ottn.b2.b(r2)
            com.acse.ottn.b2$b r0 = (com.acse.ottn.b2.b) r0
            r1[r3] = r0
            r6 = r6[r3]
            r0 = 1065353216(0x3f800000, float:1.0)
            com.acse.ottn.b2 r6 = com.acse.ottn.b2.a(r0, r6)
            com.acse.ottn.b2$b r6 = (com.acse.ottn.b2.b) r6
            r1[r4] = r6
            goto L40
        L22:
            r5 = r6[r3]
            com.acse.ottn.b2 r2 = com.acse.ottn.b2.a(r2, r5)
            com.acse.ottn.b2$b r2 = (com.acse.ottn.b2.b) r2
            r1[r3] = r2
        L2c:
            if (r4 >= r0) goto L40
            float r2 = (float) r4
            int r3 = r0 + (-1)
            float r3 = (float) r3
            float r2 = r2 / r3
            r3 = r6[r4]
            com.acse.ottn.b2 r2 = com.acse.ottn.b2.a(r2, r3)
            com.acse.ottn.b2$b r2 = (com.acse.ottn.b2.b) r2
            r1[r4] = r2
            int r4 = r4 + 1
            goto L2c
        L40:
            com.acse.ottn.y1 r6 = new com.acse.ottn.y1
            r6.<init>(r1)
            return r6
    }

    public static com.acse.ottn.c2 a(com.acse.ottn.b2... r9) {
            int r0 = r9.length
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
        L6:
            if (r2 >= r0) goto L1b
            r6 = r9[r2]
            boolean r7 = r6 instanceof com.acse.ottn.b2.a
            r8 = 1
            if (r7 == 0) goto L11
            r3 = 1
            goto L18
        L11:
            boolean r6 = r6 instanceof com.acse.ottn.b2.b
            if (r6 == 0) goto L17
            r4 = 1
            goto L18
        L17:
            r5 = 1
        L18:
            int r2 = r2 + 1
            goto L6
        L1b:
            if (r3 == 0) goto L34
            if (r4 != 0) goto L34
            if (r5 != 0) goto L34
            com.acse.ottn.b2$a[] r2 = new com.acse.ottn.b2.a[r0]
        L23:
            if (r1 >= r0) goto L2e
            r3 = r9[r1]
            com.acse.ottn.b2$a r3 = (com.acse.ottn.b2.a) r3
            r2[r1] = r3
            int r1 = r1 + 1
            goto L23
        L2e:
            com.acse.ottn.j1 r9 = new com.acse.ottn.j1
            r9.<init>(r2)
            return r9
        L34:
            if (r4 == 0) goto L4d
            if (r3 != 0) goto L4d
            if (r5 != 0) goto L4d
            com.acse.ottn.b2$b[] r2 = new com.acse.ottn.b2.b[r0]
        L3c:
            if (r1 >= r0) goto L47
            r3 = r9[r1]
            com.acse.ottn.b2$b r3 = (com.acse.ottn.b2.b) r3
            r2[r1] = r3
            int r1 = r1 + 1
            goto L3c
        L47:
            com.acse.ottn.y1 r9 = new com.acse.ottn.y1
            r9.<init>(r2)
            return r9
        L4d:
            com.acse.ottn.c2 r0 = new com.acse.ottn.c2
            r0.<init>(r9)
            return r0
    }

    public static com.acse.ottn.c2 a(java.lang.Object... r6) {
            int r0 = r6.length
            r1 = 2
            int r1 = java.lang.Math.max(r0, r1)
            com.acse.ottn.b2$c[] r1 = new com.acse.ottn.b2.c[r1]
            r2 = 0
            r3 = 0
            r4 = 1
            if (r0 != r4) goto L22
            com.acse.ottn.b2 r0 = com.acse.ottn.b2.c(r2)
            com.acse.ottn.b2$c r0 = (com.acse.ottn.b2.c) r0
            r1[r3] = r0
            r6 = r6[r3]
            r0 = 1065353216(0x3f800000, float:1.0)
            com.acse.ottn.b2 r6 = com.acse.ottn.b2.a(r0, r6)
            com.acse.ottn.b2$c r6 = (com.acse.ottn.b2.c) r6
            r1[r4] = r6
            goto L40
        L22:
            r5 = r6[r3]
            com.acse.ottn.b2 r2 = com.acse.ottn.b2.a(r2, r5)
            com.acse.ottn.b2$c r2 = (com.acse.ottn.b2.c) r2
            r1[r3] = r2
        L2c:
            if (r4 >= r0) goto L40
            float r2 = (float) r4
            int r3 = r0 + (-1)
            float r3 = (float) r3
            float r2 = r2 / r3
            r3 = r6[r4]
            com.acse.ottn.b2 r2 = com.acse.ottn.b2.a(r2, r3)
            com.acse.ottn.b2$c r2 = (com.acse.ottn.b2.c) r2
            r1[r4] = r2
            int r4 = r4 + 1
            goto L2c
        L40:
            com.acse.ottn.c2 r6 = new com.acse.ottn.c2
            r6.<init>(r1)
            return r6
    }

    public com.acse.ottn.c2 a() {
            r5 = this;
            java.util.ArrayList<com.acse.ottn.b2> r0 = r5.f2208e
            int r1 = r0.size()
            com.acse.ottn.b2[] r2 = new com.acse.ottn.b2[r1]
            r3 = 0
        L9:
            if (r3 >= r1) goto L1a
            java.lang.Object r4 = r0.get(r3)
            com.acse.ottn.b2 r4 = (com.acse.ottn.b2) r4
            com.acse.ottn.b2 r4 = r4.a()
            r2[r3] = r4
            int r3 = r3 + 1
            goto L9
        L1a:
            com.acse.ottn.c2 r0 = new com.acse.ottn.c2
            r0.<init>(r2)
            return r0
    }

    public java.lang.Object a(float r5) {
            r4 = this;
            int r0 = r4.a
            r1 = 2
            if (r0 != r1) goto L20
            android.view.animation.Interpolator r0 = r4.f2207d
            if (r0 == 0) goto Ld
            float r5 = r0.getInterpolation(r5)
        Ld:
            com.acse.ottn.q4 r0 = r4.f2209f
            com.acse.ottn.b2 r1 = r4.f2205b
            java.lang.Object r1 = r1.e()
            com.acse.ottn.b2 r2 = r4.f2206c
            java.lang.Object r2 = r2.e()
            java.lang.Object r5 = r0.evaluate(r5, r1, r2)
            return r5
        L20:
            r2 = 0
            r3 = 1
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 > 0) goto L56
            java.util.ArrayList<com.acse.ottn.b2> r0 = r4.f2208e
            java.lang.Object r0 = r0.get(r3)
            com.acse.ottn.b2 r0 = (com.acse.ottn.b2) r0
            android.view.animation.Interpolator r1 = r0.c()
            if (r1 == 0) goto L38
            float r5 = r1.getInterpolation(r5)
        L38:
            com.acse.ottn.b2 r1 = r4.f2205b
            float r1 = r1.b()
            float r5 = r5 - r1
            float r2 = r0.b()
            float r2 = r2 - r1
            float r5 = r5 / r2
            com.acse.ottn.q4 r1 = r4.f2209f
            com.acse.ottn.b2 r2 = r4.f2205b
            java.lang.Object r2 = r2.e()
            java.lang.Object r0 = r0.e()
            java.lang.Object r5 = r1.evaluate(r5, r2, r0)
            return r5
        L56:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 < 0) goto L8f
            java.util.ArrayList<com.acse.ottn.b2> r2 = r4.f2208e
            int r0 = r0 - r1
            java.lang.Object r0 = r2.get(r0)
            com.acse.ottn.b2 r0 = (com.acse.ottn.b2) r0
            com.acse.ottn.b2 r1 = r4.f2206c
            android.view.animation.Interpolator r1 = r1.c()
            if (r1 == 0) goto L71
            float r5 = r1.getInterpolation(r5)
        L71:
            float r1 = r0.b()
            float r5 = r5 - r1
            com.acse.ottn.b2 r2 = r4.f2206c
            float r2 = r2.b()
            float r2 = r2 - r1
            float r5 = r5 / r2
            com.acse.ottn.q4 r1 = r4.f2209f
            java.lang.Object r0 = r0.e()
            com.acse.ottn.b2 r2 = r4.f2206c
            java.lang.Object r2 = r2.e()
            java.lang.Object r5 = r1.evaluate(r5, r0, r2)
            return r5
        L8f:
            com.acse.ottn.b2 r0 = r4.f2205b
        L91:
            int r1 = r4.a
            if (r3 >= r1) goto Lcd
            java.util.ArrayList<com.acse.ottn.b2> r1 = r4.f2208e
            java.lang.Object r1 = r1.get(r3)
            com.acse.ottn.b2 r1 = (com.acse.ottn.b2) r1
            float r2 = r1.b()
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 >= 0) goto Lc9
            android.view.animation.Interpolator r2 = r1.c()
            if (r2 == 0) goto Laf
            float r5 = r2.getInterpolation(r5)
        Laf:
            float r2 = r0.b()
            float r5 = r5 - r2
            float r3 = r1.b()
            float r3 = r3 - r2
            float r5 = r5 / r3
            com.acse.ottn.q4 r2 = r4.f2209f
            java.lang.Object r0 = r0.e()
            java.lang.Object r1 = r1.e()
            java.lang.Object r5 = r2.evaluate(r5, r0, r1)
            return r5
        Lc9:
            int r3 = r3 + 1
            r0 = r1
            goto L91
        Lcd:
            com.acse.ottn.b2 r5 = r4.f2206c
            java.lang.Object r5 = r5.e()
            return r5
    }

    public void a(com.acse.ottn.q4 r1) {
            r0 = this;
            r0.f2209f = r1
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.acse.ottn.c2 r0 = r1.a()
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = " "
            r1 = 0
        L3:
            int r2 = r3.a
            if (r1 >= r2) goto L2a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.util.ArrayList<com.acse.ottn.b2> r0 = r3.f2208e
            java.lang.Object r0 = r0.get(r1)
            com.acse.ottn.b2 r0 = (com.acse.ottn.b2) r0
            java.lang.Object r0 = r0.e()
            r2.append(r0)
            java.lang.String r0 = "  "
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            int r1 = r1 + 1
            goto L3
        L2a:
            return r0
    }
}
