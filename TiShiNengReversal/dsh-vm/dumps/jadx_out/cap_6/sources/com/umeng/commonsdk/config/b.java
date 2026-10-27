package com.umeng.commonsdk.config;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b implements com.umeng.commonsdk.config.f {
    private static java.util.Map<java.lang.String, java.lang.Boolean> a;
    private static java.lang.Object b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.umeng.commonsdk.config.b$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a {
        private static final com.umeng.commonsdk.config.b a = null;

        static {
                com.umeng.commonsdk.config.b r0 = new com.umeng.commonsdk.config.b
                r1 = 0
                r0.<init>(r1)
                com.umeng.commonsdk.config.b.a.a = r0
                return
        }

        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ com.umeng.commonsdk.config.b a() {
                com.umeng.commonsdk.config.b r0 = com.umeng.commonsdk.config.b.a.a
                return r0
        }
    }

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.umeng.commonsdk.config.b.a = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.umeng.commonsdk.config.b.b = r0
            return
    }

    private b() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ b(com.umeng.commonsdk.config.b.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean a(java.lang.String r2) {
            boolean r0 = com.umeng.commonsdk.config.d.a(r2)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            java.lang.Object r0 = com.umeng.commonsdk.config.b.b
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.Boolean> r1 = com.umeng.commonsdk.config.b.a     // Catch: java.lang.Throwable -> L21
            boolean r1 = r1.containsKey(r2)     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L23
            java.util.Map<java.lang.String, java.lang.Boolean> r1 = com.umeng.commonsdk.config.b.a     // Catch: java.lang.Throwable -> L21
            java.lang.Object r2 = r1.get(r2)     // Catch: java.lang.Throwable -> L21
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L21
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L21
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return r2
        L21:
            r2 = move-exception
            goto L26
        L23:
            r2 = 1
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return r2
        L26:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r2
    }

    public static com.umeng.commonsdk.config.b b() {
            com.umeng.commonsdk.config.b r0 = com.umeng.commonsdk.config.b.a.a()
            return r0
    }

    public void a() {
            r2 = this;
            java.lang.Object r0 = com.umeng.commonsdk.config.b.b
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.Boolean> r1 = com.umeng.commonsdk.config.b.a     // Catch: java.lang.Throwable -> La
            r1.clear()     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    @Override // com.umeng.commonsdk.config.f
    public void a(java.lang.String r3, java.lang.Boolean r4) {
            r2 = this;
            boolean r0 = com.umeng.commonsdk.config.d.a(r3)
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.Object r0 = com.umeng.commonsdk.config.b.b
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.Boolean> r1 = com.umeng.commonsdk.config.b.a     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L14
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r3 = move-exception
            goto L16
        L14:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r3
    }
}
