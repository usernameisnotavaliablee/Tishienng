package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class y3 implements xyz.adscope.ad.j2<xyz.adscope.ad.z3, java.lang.Object, xyz.adscope.ad.o2> {
    private xyz.adscope.ad.z3 a;
    private boolean b;

    public y3() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.b = r0
            return
    }

    @Override // xyz.adscope.ad.j2
    public void a() {
            r1 = this;
            r0 = 1
            r1.b = r0
            return
    }

    public void a(java.lang.Object r1) {
            r0 = this;
            r1 = 0
            r0.b = r1
            return
    }

    public void a(xyz.adscope.ad.l2 r3, xyz.adscope.ad.o2 r4) {
            r2 = this;
            boolean r0 = r2.b
            if (r0 == 0) goto L21
            xyz.adscope.ad.z3 r0 = r2.a
            if (r0 == 0) goto L21
            xyz.adscope.ad.z3$a r1 = xyz.adscope.ad.z3.a.e
            if (r3 != r1) goto Lf
            r0.renderFailed()
        Lf:
            xyz.adscope.ad.z3$a r0 = xyz.adscope.ad.z3.a.d
            if (r3 != r0) goto L18
            xyz.adscope.ad.z3 r0 = r2.a
            r0.a()
        L18:
            xyz.adscope.ad.z3$a r0 = xyz.adscope.ad.z3.a.c
            if (r3 != r0) goto L21
            xyz.adscope.ad.z3 r3 = r2.a
            r3.a(r4)
        L21:
            return
    }

    @Override // xyz.adscope.ad.j2
    public /* bridge */ /* synthetic */ void a(xyz.adscope.ad.z3 r1) {
            r0 = this;
            xyz.adscope.ad.z3 r1 = (xyz.adscope.ad.z3) r1
            r0.a2(r1)
            return
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    public void a2(xyz.adscope.ad.z3 r1) {
            r0 = this;
            r0.a = r1
            r1.a(r0)
            return
    }

    public void b() {
            r1 = this;
            r0 = 0
            r1.b = r0
            r0 = 0
            r1.a = r0
            return
    }
}
