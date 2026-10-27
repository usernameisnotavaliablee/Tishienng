package net.sourceforge.pinyin4j;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class f {
    private com.hp.hpl.sparta.e a;

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
        static final net.sourceforge.pinyin4j.f a = null;

        static {
                net.sourceforge.pinyin4j.f r0 = new net.sourceforge.pinyin4j.f
                r1 = 0
                r0.<init>(r1)
                net.sourceforge.pinyin4j.f.b.a = r0
                return
        }

        private b() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    private f() {
            r0 = this;
            r0.<init>()
            r0.c()
            return
    }

    /* synthetic */ f(net.sourceforge.pinyin4j.f.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    static net.sourceforge.pinyin4j.f a() {
            net.sourceforge.pinyin4j.f r0 = net.sourceforge.pinyin4j.f.b.a
            return r0
    }

    private void c() {
            r2 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "/pinyindb/pinyin_mapping.xml"
            java.io.BufferedInputStream r1 = net.sourceforge.pinyin4j.i.a(r1)     // Catch: java.lang.Throwable -> Lf
            com.hp.hpl.sparta.e r0 = com.hp.hpl.sparta.p.b(r0, r1)     // Catch: java.lang.Throwable -> Lf
            r2.d(r0)     // Catch: java.lang.Throwable -> Lf
        Lf:
            return
    }

    private void d(com.hp.hpl.sparta.e r1) {
            r0 = this;
            r0.a = r1
            return
    }

    com.hp.hpl.sparta.e b() {
            r1 = this;
            com.hp.hpl.sparta.e r0 = r1.a
            return r0
    }
}
