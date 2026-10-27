package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class z extends xyz.adscope.common.v2.singleton.IAbstractManager<xyz.adscope.ad.u1> {

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
        private static xyz.adscope.ad.z a;

        static {
                xyz.adscope.ad.z r0 = new xyz.adscope.ad.z
                r1 = 0
                r0.<init>(r1)
                xyz.adscope.ad.z.b.a = r0
                return
        }

        public b() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ xyz.adscope.ad.z a() {
                xyz.adscope.ad.z r0 = xyz.adscope.ad.z.b.a
                return r0
        }
    }

    private z() {
            r2 = this;
            r2.<init>()
            xyz.adscope.ad.z r0 = xyz.adscope.ad.z.b.a()
            if (r0 != 0) goto La
            return
        La:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Singleton ..."
            r0.<init>(r1)
            throw r0
    }

    /* synthetic */ z(xyz.adscope.ad.z.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static xyz.adscope.ad.z a() {
            xyz.adscope.ad.z r0 = xyz.adscope.ad.z.b.a()
            return r0
    }

    protected xyz.adscope.ad.u1 a(android.content.Context r1) {
            r0 = this;
            xyz.adscope.ad.y r1 = new xyz.adscope.ad.y
            r1.<init>()
            return r1
    }

    @Override // xyz.adscope.common.v2.singleton.IAbstractManager
    protected /* bridge */ /* synthetic */ xyz.adscope.ad.u1 createNewImpl(android.content.Context r1) {
            r0 = this;
            xyz.adscope.ad.u1 r1 = r0.a(r1)
            return r1
    }
}
