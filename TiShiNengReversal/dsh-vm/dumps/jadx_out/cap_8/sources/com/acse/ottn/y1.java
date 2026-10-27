package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class y1 extends com.acse.ottn.c2 {

    /* renamed from: g, reason: collision with root package name */
    public int f2903g;

    /* renamed from: h, reason: collision with root package name */
    public int f2904h;

    /* renamed from: i, reason: collision with root package name */
    public int f2905i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2906j;

    public y1(com.acse.ottn.b2.b... r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1
            r0.f2906j = r1
            return
    }

    @Override // com.acse.ottn.c2
    public /* bridge */ /* synthetic */ com.acse.ottn.c2 a() {
            r1 = this;
            com.acse.ottn.y1 r0 = r1.b()
            return r0
    }

    @Override // com.acse.ottn.c2
    public java.lang.Object a(float r1) {
            r0 = this;
            int r1 = r0.b(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
    }

    public int b(float r6) {
            r5 = this;
            int r0 = r5.a
            r1 = 0
            r2 = 1
            r3 = 2
            if (r0 != r3) goto L5b
            boolean r0 = r5.f2906j
            if (r0 == 0) goto L2e
            r5.f2906j = r1
            java.util.ArrayList<com.acse.ottn.b2> r0 = r5.f2208e
            java.lang.Object r0 = r0.get(r1)
            com.acse.ottn.b2$b r0 = (com.acse.ottn.b2.b) r0
            int r0 = r0.h()
            r5.f2903g = r0
            java.util.ArrayList<com.acse.ottn.b2> r0 = r5.f2208e
            java.lang.Object r0 = r0.get(r2)
            com.acse.ottn.b2$b r0 = (com.acse.ottn.b2.b) r0
            int r0 = r0.h()
            r5.f2904h = r0
            int r1 = r5.f2903g
            int r0 = r0 - r1
            r5.f2905i = r0
        L2e:
            android.view.animation.Interpolator r0 = r5.f2207d
            if (r0 == 0) goto L36
            float r6 = r0.getInterpolation(r6)
        L36:
            com.acse.ottn.q4 r0 = r5.f2209f
            if (r0 != 0) goto L44
            int r0 = r5.f2903g
            int r1 = r5.f2905i
        L3e:
            float r1 = (float) r1
            float r6 = r6 * r1
            int r6 = (int) r6
            int r0 = r0 + r6
            return r0
        L44:
            int r1 = r5.f2903g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = r5.f2904h
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r6 = r0.evaluate(r6, r1, r2)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            return r6
        L5b:
            r4 = 0
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 > 0) goto Lab
            java.util.ArrayList<com.acse.ottn.b2> r0 = r5.f2208e
            java.lang.Object r0 = r0.get(r1)
            com.acse.ottn.b2$b r0 = (com.acse.ottn.b2.b) r0
            java.util.ArrayList<com.acse.ottn.b2> r1 = r5.f2208e
            java.lang.Object r1 = r1.get(r2)
            com.acse.ottn.b2$b r1 = (com.acse.ottn.b2.b) r1
            int r2 = r0.h()
            int r3 = r1.h()
            float r0 = r0.b()
            float r4 = r1.b()
            android.view.animation.Interpolator r1 = r1.c()
            if (r1 == 0) goto L8a
            float r6 = r1.getInterpolation(r6)
        L8a:
            float r6 = r6 - r0
            float r4 = r4 - r0
            float r6 = r6 / r4
            com.acse.ottn.q4 r0 = r5.f2209f
            if (r0 != 0) goto L98
        L91:
            int r3 = r3 - r2
            float r0 = (float) r3
            float r6 = r6 * r0
            int r6 = (int) r6
            int r2 = r2 + r6
            return r2
        L98:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.Object r6 = r0.evaluate(r6, r1, r2)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            return r6
        Lab:
            r4 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 < 0) goto Lfa
            java.util.ArrayList<com.acse.ottn.b2> r1 = r5.f2208e
            int r0 = r0 - r3
            java.lang.Object r0 = r1.get(r0)
            com.acse.ottn.b2$b r0 = (com.acse.ottn.b2.b) r0
            java.util.ArrayList<com.acse.ottn.b2> r1 = r5.f2208e
            int r3 = r5.a
            int r3 = r3 - r2
            java.lang.Object r1 = r1.get(r3)
            com.acse.ottn.b2$b r1 = (com.acse.ottn.b2.b) r1
            int r2 = r0.h()
            int r3 = r1.h()
            float r0 = r0.b()
            float r4 = r1.b()
            android.view.animation.Interpolator r1 = r1.c()
            if (r1 == 0) goto Ldf
            float r6 = r1.getInterpolation(r6)
        Ldf:
            float r6 = r6 - r0
            float r4 = r4 - r0
            float r6 = r6 / r4
            com.acse.ottn.q4 r0 = r5.f2209f
            if (r0 != 0) goto Le7
            goto L91
        Le7:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.Object r6 = r0.evaluate(r6, r1, r2)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            return r6
        Lfa:
            java.util.ArrayList<com.acse.ottn.b2> r0 = r5.f2208e
            java.lang.Object r0 = r0.get(r1)
            com.acse.ottn.b2$b r0 = (com.acse.ottn.b2.b) r0
            r1 = 1
        L103:
            int r3 = r5.a
            if (r1 >= r3) goto L156
            java.util.ArrayList<com.acse.ottn.b2> r3 = r5.f2208e
            java.lang.Object r3 = r3.get(r1)
            com.acse.ottn.b2$b r3 = (com.acse.ottn.b2.b) r3
            float r4 = r3.b()
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 >= 0) goto L152
            android.view.animation.Interpolator r1 = r3.c()
            if (r1 == 0) goto L121
            float r6 = r1.getInterpolation(r6)
        L121:
            float r1 = r0.b()
            float r6 = r6 - r1
            float r1 = r3.b()
            float r2 = r0.b()
            float r1 = r1 - r2
            float r6 = r6 / r1
            int r0 = r0.h()
            int r1 = r3.h()
            com.acse.ottn.q4 r2 = r5.f2209f
            if (r2 != 0) goto L13f
            int r1 = r1 - r0
            goto L3e
        L13f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r6 = r2.evaluate(r6, r0, r1)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            return r6
        L152:
            int r1 = r1 + 1
            r0 = r3
            goto L103
        L156:
            java.util.ArrayList<com.acse.ottn.b2> r6 = r5.f2208e
            int r3 = r3 - r2
            java.lang.Object r6 = r6.get(r3)
            com.acse.ottn.b2 r6 = (com.acse.ottn.b2) r6
            java.lang.Object r6 = r6.e()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            return r6
    }

    public com.acse.ottn.y1 b() {
            r5 = this;
            java.util.ArrayList<com.acse.ottn.b2> r0 = r5.f2208e
            int r1 = r0.size()
            com.acse.ottn.b2$b[] r2 = new com.acse.ottn.b2.b[r1]
            r3 = 0
        L9:
            if (r3 >= r1) goto L1c
            java.lang.Object r4 = r0.get(r3)
            com.acse.ottn.b2 r4 = (com.acse.ottn.b2) r4
            com.acse.ottn.b2 r4 = r4.a()
            com.acse.ottn.b2$b r4 = (com.acse.ottn.b2.b) r4
            r2[r3] = r4
            int r3 = r3 + 1
            goto L9
        L1c:
            com.acse.ottn.y1 r0 = new com.acse.ottn.y1
            r0.<init>(r2)
            return r0
    }

    @Override // com.acse.ottn.c2
    public /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.acse.ottn.y1 r0 = r1.b()
            return r0
    }
}
