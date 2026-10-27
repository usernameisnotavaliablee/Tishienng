package net.sourceforge.pinyin4j;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class b {
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
    /* renamed from: net.sourceforge.pinyin4j.b$b, reason: collision with other inner class name */
    private static class C0131b {
        static final net.sourceforge.pinyin4j.b a = null;

        static {
                net.sourceforge.pinyin4j.b r0 = new net.sourceforge.pinyin4j.b
                r1 = 0
                r0.<init>(r1)
                net.sourceforge.pinyin4j.b.C0131b.a = r0
                return
        }

        private C0131b() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    private b() {
            r0 = this;
            r0.<init>()
            r0.c()
            return
    }

    /* synthetic */ b(net.sourceforge.pinyin4j.b.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    static net.sourceforge.pinyin4j.b a() {
            net.sourceforge.pinyin4j.b r0 = net.sourceforge.pinyin4j.b.C0131b.a
            return r0
    }

    private void c() {
            r2 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "/pinyindb/pinyin_gwoyeu_mapping.xml"
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
