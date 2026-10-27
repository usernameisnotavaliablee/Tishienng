package net.sourceforge.pinyin4j;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class a {
    private w4.b a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: net.sourceforge.pinyin4j.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0130a {
        public C0130a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class b {
        static final net.sourceforge.pinyin4j.a a = null;

        static {
                net.sourceforge.pinyin4j.a r0 = new net.sourceforge.pinyin4j.a
                r1 = 0
                r0.<init>(r1)
                net.sourceforge.pinyin4j.a.b.a = r0
                return
        }

        private b() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c {
        static final java.lang.String b = "(";
        static final java.lang.String c = ")";
        static final java.lang.String d = ",";
        final /* synthetic */ net.sourceforge.pinyin4j.a a;

        c(net.sourceforge.pinyin4j.a r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }
    }

    private a() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            r1.f()
            return
    }

    /* synthetic */ a(net.sourceforge.pinyin4j.a.C0130a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    private java.lang.String a(char r3) {
            r2 = this;
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            java.lang.String r3 = r3.toUpperCase()
            w4.b r0 = r2.e()
            w4.b r3 = r0.a(r3)
            r0 = 0
            if (r3 == 0) goto L18
            java.lang.String r3 = r3.c()
            goto L19
        L18:
            r3 = r0
        L19:
            boolean r1 = r2.g(r3)
            if (r1 == 0) goto L20
            return r3
        L20:
            return r0
    }

    static net.sourceforge.pinyin4j.a d() {
            net.sourceforge.pinyin4j.a r0 = net.sourceforge.pinyin4j.a.b.a
            return r0
    }

    private void f() {
            r2 = this;
            w4.b r0 = new w4.b     // Catch: java.lang.Throwable -> L29
            r0.<init>()     // Catch: java.lang.Throwable -> L29
            r2.i(r0)     // Catch: java.lang.Throwable -> L29
            w4.b r0 = r2.e()     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = "/pinyindb/unicode_to_hanyu_pinyin.txt"
            java.io.BufferedInputStream r1 = net.sourceforge.pinyin4j.i.a(r1)     // Catch: java.lang.Throwable -> L29
            r0.d(r1)     // Catch: java.lang.Throwable -> L29
            w4.b r0 = r2.e()     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = "/pinyindb/multi_pinyin.txt"
            java.io.BufferedInputStream r1 = net.sourceforge.pinyin4j.i.a(r1)     // Catch: java.lang.Throwable -> L29
            r0.e(r1)     // Catch: java.lang.Throwable -> L29
            w4.b r0 = r2.e()     // Catch: java.lang.Throwable -> L29
            r0.f()     // Catch: java.lang.Throwable -> L29
        L29:
            return
    }

    private boolean g(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto L1c
            java.lang.String r0 = "(none0)"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L1c
            java.lang.String r0 = "("
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L1c
            java.lang.String r0 = ")"
            boolean r2 = r2.endsWith(r0)
            if (r2 == 0) goto L1c
            r2 = 1
            return r2
        L1c:
            r2 = 0
            return r2
    }

    private void i(w4.b r1) {
            r0 = this;
            r0.a = r1
            return
    }

    java.lang.String[] b(char r1) {
            r0 = this;
            java.lang.String r1 = r0.a(r1)
            java.lang.String[] r1 = r0.h(r1)
            return r1
    }

    w4.b c(char r2) {
            r1 = this;
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            java.lang.String r2 = r2.toUpperCase()
            w4.b r0 = r1.e()
            w4.b r2 = r0.a(r2)
            return r2
    }

    w4.b e() {
            r1 = this;
            w4.b r0 = r1.a
            return r0
    }

    java.lang.String[] h(java.lang.String r3) {
            r2 = this;
            if (r3 == 0) goto L1b
            java.lang.String r0 = "("
            int r0 = r3.indexOf(r0)
            java.lang.String r1 = ")"
            int r1 = r3.lastIndexOf(r1)
            int r0 = r0 + 1
            java.lang.String r3 = r3.substring(r0, r1)
            java.lang.String r0 = ","
            java.lang.String[] r3 = r3.split(r0)
            return r3
        L1b:
            r3 = 0
            return r3
    }
}
