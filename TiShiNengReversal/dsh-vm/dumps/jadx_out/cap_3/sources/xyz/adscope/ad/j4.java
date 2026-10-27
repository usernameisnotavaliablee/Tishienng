package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class j4 implements xyz.adscope.common.v2.model.IDeepCopyModel {
    private final java.lang.String a;
    private long b;
    private long c;
    private java.lang.String d;

    public j4() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.b = r0
            r2.c = r0
            java.lang.String r0 = xyz.adscope.common.v2.tool.str.SerialUtil.generateStartSerialID()
            r2.a = r0
            return
    }

    private j4(xyz.adscope.ad.j4 r3) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.b = r0
            r2.c = r0
            java.lang.String r0 = r3.a
            r2.a = r0
            long r0 = r3.c()
            r2.b = r0
            long r0 = r3.b()
            r2.c = r0
            java.lang.String r3 = r3.d()
            r2.d = r3
            return
    }

    public xyz.adscope.ad.j4 a() {
            r1 = this;
            xyz.adscope.ad.j4 r0 = new xyz.adscope.ad.j4
            r0.<init>(r1)
            return r0
    }

    public void a(long r1) {
            r0 = this;
            r0.c = r1
            return
    }

    public void a(java.lang.String r1) {
            r0 = this;
            r0.d = r1
            return
    }

    public long b() {
            r2 = this;
            long r0 = r2.c
            return r0
    }

    public void b(long r1) {
            r0 = this;
            r0.b = r1
            r1 = -1
            r0.c = r1
            return
    }

    public long c() {
            r2 = this;
            long r0 = r2.b
            return r0
    }

    public java.lang.String d() {
            r1 = this;
            java.lang.String r0 = r1.d
            return r0
    }

    @Override // xyz.adscope.common.v2.model.IDeepCopyModel
    public /* bridge */ /* synthetic */ xyz.adscope.common.v2.model.IDeepCopyModel deepCopy() {
            r1 = this;
            xyz.adscope.ad.j4 r0 = r1.a()
            return r0
    }

    public long e() {
            r7 = this;
            long r0 = r7.b
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L10
            long r4 = r7.c
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L10
            long r4 = r4 - r0
            return r4
        L10:
            r0 = 0
            return r0
    }

    public java.lang.String f() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }
}
