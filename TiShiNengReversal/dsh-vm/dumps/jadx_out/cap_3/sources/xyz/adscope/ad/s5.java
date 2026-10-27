package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class s5 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class b {
        private static xyz.adscope.ad.s5 a;

        static {
                xyz.adscope.ad.s5 r0 = new xyz.adscope.ad.s5
                r1 = 0
                r0.<init>(r1)
                xyz.adscope.ad.s5.b.a = r0
                return
        }

        public b() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ xyz.adscope.ad.s5 a() {
                xyz.adscope.ad.s5 r0 = xyz.adscope.ad.s5.b.a
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class c extends xyz.adscope.ad.a2 {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static class a extends xyz.adscope.ad.a2.a<xyz.adscope.ad.s5.c> {
            public a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // xyz.adscope.ad.a2.a
            protected xyz.adscope.ad.c a() {
                    r1 = this;
                    xyz.adscope.ad.c r0 = xyz.adscope.ad.c.i
                    return r0
            }

            @Override // xyz.adscope.ad.a2.a
            protected /* bridge */ /* synthetic */ xyz.adscope.ad.s5.c f(xyz.adscope.ad.a2.a<xyz.adscope.ad.s5.c> r1) {
                    r0 = this;
                    xyz.adscope.ad.s5$c r1 = r0.g(r1)
                    return r1
            }

            protected xyz.adscope.ad.s5.c g(xyz.adscope.ad.a2.a<xyz.adscope.ad.s5.c> r1) {
                    r0 = this;
                    xyz.adscope.ad.s5$c r1 = new xyz.adscope.ad.s5$c
                    r1.<init>(r0)
                    return r1
            }

            @Override // xyz.adscope.ad.a2.a
            public xyz.adscope.ad.a2.a<xyz.adscope.ad.s5.c> setTimeoutMillion(long r1) {
                    r0 = this;
                    xyz.adscope.ad.a2$a r1 = super.setTimeoutMillion(r1)
                    return r1
            }
        }

        protected c(xyz.adscope.ad.s5.c.a r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    private s5() {
            r2 = this;
            r2.<init>()
            xyz.adscope.ad.s5 r0 = xyz.adscope.ad.s5.b.a()
            if (r0 != 0) goto La
            return
        La:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Singleton ..."
            r0.<init>(r1)
            throw r0
    }

    /* synthetic */ s5(xyz.adscope.ad.s5.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static xyz.adscope.ad.s5 a() {
            xyz.adscope.ad.s5 r0 = xyz.adscope.ad.s5.b.a()
            return r0
    }

    private void a(android.content.Context r2, xyz.adscope.ad.publish.ASNPInitConfig r3) {
            r1 = this;
            if (r3 == 0) goto L1a
            boolean r0 = r3.canUseOAIDInfo()
            if (r0 == 0) goto Lf
            xyz.adscope.common.v2.dev.oaid.OAIDHelper r0 = xyz.adscope.common.v2.dev.oaid.OAIDHelper.getInstance()
            r0.initOAID(r2)
        Lf:
            xyz.adscope.common.v2.dev.oaid.OAIDHelper r2 = xyz.adscope.common.v2.dev.oaid.OAIDHelper.getInstance()
            boolean r3 = r3.canUseOAIDInfo()
            r2.setPersonalRecommend(r3)
        L1a:
            return
    }

    public java.lang.String a(android.content.Context r6, java.lang.String r7) {
            r5 = this;
            xyz.adscope.ad.z0 r0 = new xyz.adscope.ad.z0
            r0.<init>(r6)
            xyz.adscope.ad.f r1 = xyz.adscope.ad.f.a()
            java.lang.Object r1 = r1.getOrCreateImplement(r6)
            xyz.adscope.ad.e r1 = (xyz.adscope.ad.e) r1
            xyz.adscope.ad.publish.ASNPInitConfig r1 = r1.a()
            r5.a(r6, r1)
            if (r1 == 0) goto L4e
            xyz.adscope.ad.s5$c$a r2 = new xyz.adscope.ad.s5$c$a
            r2.<init>()
            r3 = 5000(0x1388, double:2.4703E-320)
            r2.setTimeoutMillion(r3)
            xyz.adscope.ad.a2 r7 = r2.build(r7)
            xyz.adscope.ad.s5$c r7 = (xyz.adscope.ad.s5.c) r7
            xyz.adscope.ad.b1 r2 = new xyz.adscope.ad.b1
            r2.<init>(r7)
            java.lang.String r2 = r2.t()
            xyz.adscope.ad.c r3 = xyz.adscope.ad.c.i
            r0.a(r7, r1, r3, r2)
            java.lang.String r7 = r0.a()
            xyz.adscope.common.v2.encrypt.LinkedEncryptManager r0 = xyz.adscope.common.v2.encrypt.LinkedEncryptManager.getInstance()
            java.lang.Object r6 = r0.getOrCreateImplement(r6)
            xyz.adscope.common.v2.encrypt.ILinkedEncrypt r6 = (xyz.adscope.common.v2.encrypt.ILinkedEncrypt) r6
            xyz.adscope.common.v2.encrypt.ILinkedEncrypt$B64Model r0 = xyz.adscope.common.v2.encrypt.ILinkedEncrypt.B64Model.STEP_BY_STEP
            java.lang.String r1 = "101,1001"
            r2 = 1
            java.lang.String r6 = r6.encrypt(r7, r1, r0, r2)
            return r6
        L4e:
            java.lang.String r6 = ""
            return r6
    }
}
