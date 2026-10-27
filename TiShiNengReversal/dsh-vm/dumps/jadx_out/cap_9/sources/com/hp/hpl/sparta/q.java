package com.hp.hpl.sparta;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class q {
    private static com.hp.hpl.sparta.q.f a;
    private static com.hp.hpl.sparta.q.d b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements com.hp.hpl.sparta.q.f {
        private final java.util.Hashtable a;

        a() {
                r1 = this;
                r1.<init>()
                java.util.Hashtable r0 = new java.util.Hashtable
                r0.<init>()
                r1.a = r0
                return
        }

        @Override // com.hp.hpl.sparta.q.f
        public java.lang.String a(java.lang.String r2) {
                r1 = this;
                java.util.Hashtable r0 = r1.a
                java.lang.Object r0 = r0.get(r2)
                java.lang.String r0 = (java.lang.String) r0
                if (r0 != 0) goto L10
                java.util.Hashtable r0 = r1.a
                r0.put(r2, r2)
                return r2
            L10:
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b implements com.hp.hpl.sparta.q.d {
        b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.hp.hpl.sparta.q.d
        public com.hp.hpl.sparta.q.c a() {
                r2 = this;
                com.hp.hpl.sparta.q$e r0 = new com.hp.hpl.sparta.q$e
                r1 = 0
                r0.<init>(r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface c {
        java.lang.Object get(java.lang.Object r1);

        java.lang.Object put(java.lang.Object r1, java.lang.Object r2);

        int size();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface d {
        com.hp.hpl.sparta.q.c a();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class e extends java.util.Hashtable implements com.hp.hpl.sparta.q.c {
        private e() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ e(com.hp.hpl.sparta.q.a r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface f {
        java.lang.String a(java.lang.String r1);
    }

    static {
            com.hp.hpl.sparta.q$a r0 = new com.hp.hpl.sparta.q$a
            r0.<init>()
            com.hp.hpl.sparta.q.a = r0
            com.hp.hpl.sparta.q$b r0 = new com.hp.hpl.sparta.q$b
            r0.<init>()
            com.hp.hpl.sparta.q.b = r0
            return
    }

    public q() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(java.lang.String r1) {
            com.hp.hpl.sparta.q$f r0 = com.hp.hpl.sparta.q.a
            java.lang.String r1 = r0.a(r1)
            return r1
    }

    static com.hp.hpl.sparta.q.c b() {
            com.hp.hpl.sparta.q$d r0 = com.hp.hpl.sparta.q.b
            com.hp.hpl.sparta.q$c r0 = r0.a()
            return r0
    }

    public static void c(com.hp.hpl.sparta.q.d r0) {
            com.hp.hpl.sparta.q.b = r0
            return
    }

    public static void d(com.hp.hpl.sparta.q.f r0) {
            com.hp.hpl.sparta.q.a = r0
            return
    }
}
