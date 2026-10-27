package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class j1 extends com.acse.ottn.c2 {

    /* renamed from: g, reason: collision with root package name */
    public float f2395g;

    /* renamed from: h, reason: collision with root package name */
    public float f2396h;

    /* renamed from: i, reason: collision with root package name */
    public float f2397i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2398j;

    public j1(com.acse.ottn.b2.a... r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1
            r0.f2398j = r1
            return
    }

    @Override // com.acse.ottn.c2
    public /* bridge */ /* synthetic */ com.acse.ottn.c2 a() {
            r1 = this;
            com.acse.ottn.j1 r0 = r1.b()
            return r0
    }

    @Override // com.acse.ottn.c2
    public java.lang.Object a(float r1) {
            r0 = this;
            float r1 = r0.b(r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            return r1
    }

    public float b(float r6) {
            r5 = this;
            int r0 = r5.a
            r1 = 0
            r2 = 1
            r3 = 2
            if (r0 != r3) goto L59
            boolean r0 = r5.f2398j
            if (r0 == 0) goto L2e
            r5.f2398j = r1
            java.util.ArrayList<com.acse.ottn.b2> r0 = r5.f2208e
            java.lang.Object r0 = r0.get(r1)
            com.acse.ottn.b2$a r0 = (com.acse.ottn.b2.a) r0
            float r0 = r0.h()
            r5.f2395g = r0
            java.util.ArrayList<com.acse.ottn.b2> r0 = r5.f2208e
            java.lang.Object r0 = r0.get(r2)
            com.acse.ottn.b2$a r0 = (com.acse.ottn.b2.a) r0
            float r0 = r0.h()
            r5.f2396h = r0
            float r1 = r5.f2395g
            float r0 = r0 - r1
            r5.f2397i = r0
        L2e:
            android.view.animation.Interpolator r0 = r5.f2207d
            if (r0 == 0) goto L36
            float r6 = r0.getInterpolation(r6)
        L36:
            com.acse.ottn.q4 r0 = r5.f2209f
            if (r0 != 0) goto L42
            float r0 = r5.f2395g
            float r1 = r5.f2397i
        L3e:
            float r6 = r6 * r1
            float r0 = r0 + r6
            return r0
        L42:
            float r1 = r5.f2395g
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            float r2 = r5.f2396h
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Object r6 = r0.evaluate(r6, r1, r2)
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            return r6
        L59:
            r4 = 0
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 > 0) goto La7
            java.util.ArrayList<com.acse.ottn.b2> r0 = r5.f2208e
            java.lang.Object r0 = r0.get(r1)
            com.acse.ottn.b2$a r0 = (com.acse.ottn.b2.a) r0
            java.util.ArrayList<com.acse.ottn.b2> r1 = r5.f2208e
            java.lang.Object r1 = r1.get(r2)
            com.acse.ottn.b2$a r1 = (com.acse.ottn.b2.a) r1
            float r2 = r0.h()
            float r3 = r1.h()
            float r0 = r0.b()
            float r4 = r1.b()
            android.view.animation.Interpolator r1 = r1.c()
            if (r1 == 0) goto L88
            float r6 = r1.getInterpolation(r6)
        L88:
            float r6 = r6 - r0
            float r4 = r4 - r0
            float r6 = r6 / r4
            com.acse.ottn.q4 r0 = r5.f2209f
            if (r0 != 0) goto L94
        L8f:
            float r3 = r3 - r2
            float r6 = r6 * r3
            float r2 = r2 + r6
            return r2
        L94:
            java.lang.Float r1 = java.lang.Float.valueOf(r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r3)
            java.lang.Object r6 = r0.evaluate(r6, r1, r2)
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            return r6
        La7:
            r4 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 < 0) goto Lf6
            java.util.ArrayList<com.acse.ottn.b2> r1 = r5.f2208e
            int r0 = r0 - r3
            java.lang.Object r0 = r1.get(r0)
            com.acse.ottn.b2$a r0 = (com.acse.ottn.b2.a) r0
            java.util.ArrayList<com.acse.ottn.b2> r1 = r5.f2208e
            int r3 = r5.a
            int r3 = r3 - r2
            java.lang.Object r1 = r1.get(r3)
            com.acse.ottn.b2$a r1 = (com.acse.ottn.b2.a) r1
            float r2 = r0.h()
            float r3 = r1.h()
            float r0 = r0.b()
            float r4 = r1.b()
            android.view.animation.Interpolator r1 = r1.c()
            if (r1 == 0) goto Ldb
            float r6 = r1.getInterpolation(r6)
        Ldb:
            float r6 = r6 - r0
            float r4 = r4 - r0
            float r6 = r6 / r4
            com.acse.ottn.q4 r0 = r5.f2209f
            if (r0 != 0) goto Le3
            goto L8f
        Le3:
            java.lang.Float r1 = java.lang.Float.valueOf(r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r3)
            java.lang.Object r6 = r0.evaluate(r6, r1, r2)
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            return r6
        Lf6:
            java.util.ArrayList<com.acse.ottn.b2> r0 = r5.f2208e
            java.lang.Object r0 = r0.get(r1)
            com.acse.ottn.b2$a r0 = (com.acse.ottn.b2.a) r0
            r1 = 1
        Lff:
            int r3 = r5.a
            if (r1 >= r3) goto L152
            java.util.ArrayList<com.acse.ottn.b2> r3 = r5.f2208e
            java.lang.Object r3 = r3.get(r1)
            com.acse.ottn.b2$a r3 = (com.acse.ottn.b2.a) r3
            float r4 = r3.b()
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 >= 0) goto L14e
            android.view.animation.Interpolator r1 = r3.c()
            if (r1 == 0) goto L11d
            float r6 = r1.getInterpolation(r6)
        L11d:
            float r1 = r0.b()
            float r6 = r6 - r1
            float r1 = r3.b()
            float r2 = r0.b()
            float r1 = r1 - r2
            float r6 = r6 / r1
            float r0 = r0.h()
            float r1 = r3.h()
            com.acse.ottn.q4 r2 = r5.f2209f
            if (r2 != 0) goto L13b
            float r1 = r1 - r0
            goto L3e
        L13b:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.Object r6 = r2.evaluate(r6, r0, r1)
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            return r6
        L14e:
            int r1 = r1 + 1
            r0 = r3
            goto Lff
        L152:
            java.util.ArrayList<com.acse.ottn.b2> r6 = r5.f2208e
            int r3 = r3 - r2
            java.lang.Object r6 = r6.get(r3)
            com.acse.ottn.b2 r6 = (com.acse.ottn.b2) r6
            java.lang.Object r6 = r6.e()
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            return r6
    }

    public com.acse.ottn.j1 b() {
            r5 = this;
            java.util.ArrayList<com.acse.ottn.b2> r0 = r5.f2208e
            int r1 = r0.size()
            com.acse.ottn.b2$a[] r2 = new com.acse.ottn.b2.a[r1]
            r3 = 0
        L9:
            if (r3 >= r1) goto L1c
            java.lang.Object r4 = r0.get(r3)
            com.acse.ottn.b2 r4 = (com.acse.ottn.b2) r4
            com.acse.ottn.b2 r4 = r4.a()
            com.acse.ottn.b2$a r4 = (com.acse.ottn.b2.a) r4
            r2[r3] = r4
            int r3 = r3 + 1
            goto L9
        L1c:
            com.acse.ottn.j1 r0 = new com.acse.ottn.j1
            r0.<init>(r2)
            return r0
    }

    @Override // com.acse.ottn.c2
    public /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.acse.ottn.j1 r0 = r1.b()
            return r0
    }
}
