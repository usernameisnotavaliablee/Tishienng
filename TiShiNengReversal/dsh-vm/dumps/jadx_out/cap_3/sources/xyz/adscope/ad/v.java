package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class v {
    private final xyz.adscope.ad.u a;

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
        private static xyz.adscope.ad.v a;

        static {
                xyz.adscope.ad.v r0 = new xyz.adscope.ad.v
                r1 = 0
                r0.<init>(r1)
                xyz.adscope.ad.v.b.a = r0
                return
        }

        public b() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ xyz.adscope.ad.v a() {
                xyz.adscope.ad.v r0 = xyz.adscope.ad.v.b.a
                return r0
        }
    }

    private v() {
            r2 = this;
            r2.<init>()
            xyz.adscope.ad.v r0 = xyz.adscope.ad.v.b.a()
            if (r0 != 0) goto L11
            xyz.adscope.ad.u r0 = new xyz.adscope.ad.u
            r0.<init>()
            r2.a = r0
            return
        L11:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Singleton ..."
            r0.<init>(r1)
            throw r0
    }

    /* synthetic */ v(xyz.adscope.ad.v.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static xyz.adscope.ad.v a() {
            xyz.adscope.ad.v r0 = xyz.adscope.ad.v.b.a()
            return r0
    }

    public xyz.adscope.ad.o3 b() {
            r1 = this;
            xyz.adscope.ad.u r0 = r1.a
            return r0
    }
}
