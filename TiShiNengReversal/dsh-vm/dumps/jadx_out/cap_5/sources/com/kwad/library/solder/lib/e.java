package com.kwad.library.solder.lib;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class e implements com.kwad.library.solder.lib.a.d {
    private final com.kwad.library.solder.lib.ext.c aqp;
    private final com.kwad.library.solder.lib.a.c aqr;
    private final com.kwad.library.solder.lib.a.f aqs;
    private final com.kwad.library.solder.lib.a.b aqt;
    private final com.kwad.library.solder.lib.ext.a aqu;
    private java.util.Map<java.lang.String, com.kwad.library.solder.lib.e.b> aqv;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class a {
        final com.kwad.library.solder.lib.a.d aqz;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.kwad.library.solder.lib.e$a$a, reason: collision with other inner class name */
        static class C0122a extends com.kwad.library.solder.lib.e.a {
            C0122a(com.kwad.library.solder.lib.a.d r1) {
                    r0 = this;
                    r0.<init>(r1)
                    return
            }

            @Override // com.kwad.library.solder.lib.e.a
            public final void j(com.kwad.library.solder.lib.a.e r2) {
                    r1 = this;
                    com.kwad.library.solder.lib.a.d r0 = r1.aqz
                    com.kwad.library.solder.lib.a.c r0 = r0.zN()
                    r0.g(r2)
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        static class b extends com.kwad.library.solder.lib.e.a {
            b(com.kwad.library.solder.lib.a.d r1) {
                    r0 = this;
                    r0.<init>(r1)
                    return
            }

            @Override // com.kwad.library.solder.lib.e.a
            public final void j(com.kwad.library.solder.lib.a.e r2) {
                    r1 = this;
                    com.kwad.library.solder.lib.a.d r0 = r1.aqz
                    com.kwad.library.solder.lib.a.f r0 = r0.zO()
                    r0.k(r2)
                    return
            }
        }

        public a(com.kwad.library.solder.lib.a.d r1) {
                r0 = this;
                r0.<init>()
                r0.aqz = r1
                return
        }

        public static com.kwad.library.solder.lib.e.a a(com.kwad.library.solder.lib.a.d r1, int r2) {
                r0 = 1
                if (r2 == r0) goto L9
                com.kwad.library.solder.lib.e$a$a r2 = new com.kwad.library.solder.lib.e$a$a
                r2.<init>(r1)
                return r2
            L9:
                com.kwad.library.solder.lib.e$a$b r2 = new com.kwad.library.solder.lib.e$a$b
                r2.<init>(r1)
                return r2
        }

        public abstract void j(com.kwad.library.solder.lib.a.e r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class b {
        private final com.kwad.library.solder.lib.a.e aqA;
        private final java.util.concurrent.Future<com.kwad.library.solder.lib.a.e> aqB;

        public b(com.kwad.library.solder.lib.a.e r1, java.util.concurrent.Future<com.kwad.library.solder.lib.a.e> r2) {
                r0 = this;
                r0.<init>()
                r0.aqA = r1
                r0.aqB = r2
                return
        }

        public final void cancel() {
                r2 = this;
                com.kwad.library.solder.lib.a.e r0 = r2.aqA
                r0.cancel()
                java.util.concurrent.Future<com.kwad.library.solder.lib.a.e> r0 = r2.aqB
                r1 = 1
                r0.cancel(r1)
                return
        }
    }

    public e(com.kwad.library.solder.lib.a.c r1, com.kwad.library.solder.lib.a.f r2, com.kwad.library.solder.lib.a.b r3, com.kwad.library.solder.lib.ext.c r4, com.kwad.library.solder.lib.ext.a r5) {
            r0 = this;
            r0.<init>()
            r0.aqr = r1
            r0.aqs = r2
            r0.aqt = r3
            r0.aqp = r4
            r0.aqu = r5
            return
    }

    private synchronized void a(java.lang.String r2, com.kwad.library.solder.lib.e.b r3) {
            r1 = this;
            monitor-enter(r1)
            java.util.Map<java.lang.String, com.kwad.library.solder.lib.e$b> r0 = r1.aqv     // Catch: java.lang.Throwable -> Lf
            java.util.Map r0 = d(r0)     // Catch: java.lang.Throwable -> Lf
            r1.aqv = r0     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L11
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r2 = move-exception
            goto L13
        L11:
            monitor-exit(r1)
            return
        L13:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    private com.kwad.library.solder.lib.e.b b(@androidx.annotation.NonNull com.kwad.library.solder.lib.a.e r3, @androidx.annotation.NonNull com.kwad.library.solder.lib.e.a r4) {
            r2 = this;
            java.lang.String r0 = r3.Ad()
            com.kwad.library.solder.lib.e$b r0 = r2.bQ(r0)
            if (r0 == 0) goto Ld
            r0.cancel()
        Ld:
            r3.a(r2)
            com.kwad.library.solder.lib.ext.c r0 = r2.aqp
            java.util.concurrent.ExecutorService r0 = r0.Aw()
            com.kwad.library.solder.lib.e$1 r1 = new com.kwad.library.solder.lib.e$1
            r1.<init>(r2, r3, r4)
            java.util.concurrent.Future r4 = r0.submit(r1)
            com.kwad.library.solder.lib.e$b r0 = new com.kwad.library.solder.lib.e$b
            r0.<init>(r3, r4)
            java.lang.String r3 = r3.Ad()
            r2.a(r3, r0)
            return r0
    }

    @androidx.annotation.Nullable
    private synchronized com.kwad.library.solder.lib.e.b bQ(java.lang.String r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Map<java.lang.String, com.kwad.library.solder.lib.e$b> r0 = r1.aqv     // Catch: java.lang.Throwable -> L13
            java.util.Map r0 = d(r0)     // Catch: java.lang.Throwable -> L13
            r1.aqv = r0     // Catch: java.lang.Throwable -> L13
            if (r2 == 0) goto L15
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L13
            com.kwad.library.solder.lib.e$b r2 = (com.kwad.library.solder.lib.e.b) r2     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)
            return r2
        L13:
            r2 = move-exception
            goto L18
        L15:
            monitor-exit(r1)
            r2 = 0
            return r2
        L18:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            throw r2
    }

    private static java.util.Map<java.lang.String, com.kwad.library.solder.lib.e.b> d(java.util.Map<java.lang.String, com.kwad.library.solder.lib.e.b> r1) {
            if (r1 == 0) goto L8
            java.util.Map r0 = java.util.Collections.EMPTY_MAP
            if (r1 != r0) goto L7
            goto L8
        L7:
            return r1
        L8:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            return r1
    }

    public final com.kwad.library.solder.lib.a.e a(@androidx.annotation.NonNull com.kwad.library.solder.lib.a.e r2, @androidx.annotation.NonNull com.kwad.library.solder.lib.e.a r3) {
            r1 = this;
            com.kwad.library.solder.lib.a.d r0 = r2.zZ()
            if (r0 != 0) goto L9
            r2.a(r1)
        L9:
            r2.Ad()
            r2.Aa()
            r3.j(r2)
            return r2
    }

    public final com.kwad.library.solder.lib.e.b a(@androidx.annotation.NonNull com.kwad.library.solder.lib.a.e r1, @androidx.annotation.NonNull int r2) {
            r0 = this;
            r2 = 16
            com.kwad.library.solder.lib.e$a r2 = com.kwad.library.solder.lib.e.a.a(r0, r2)
            com.kwad.library.solder.lib.e$b r1 = r0.b(r1, r2)
            return r1
    }

    public final void i(@androidx.annotation.NonNull com.kwad.library.solder.lib.a.e r2) {
            r1 = this;
            java.lang.String r0 = r2.Ad()
            com.kwad.library.solder.lib.e$b r0 = r1.bQ(r0)
            if (r0 == 0) goto Ld
            r0.cancel()
        Ld:
            java.lang.String r2 = r2.Ad()
            r0 = 0
            r1.a(r2, r0)
            return
    }

    @Override // com.kwad.library.solder.lib.a.d
    public final com.kwad.library.solder.lib.ext.c zM() {
            r1 = this;
            com.kwad.library.solder.lib.ext.c r0 = r1.aqp
            return r0
    }

    @Override // com.kwad.library.solder.lib.a.d
    public final com.kwad.library.solder.lib.a.c zN() {
            r1 = this;
            com.kwad.library.solder.lib.a.c r0 = r1.aqr
            return r0
    }

    @Override // com.kwad.library.solder.lib.a.d
    public final com.kwad.library.solder.lib.a.f zO() {
            r1 = this;
            com.kwad.library.solder.lib.a.f r0 = r1.aqs
            return r0
    }

    @Override // com.kwad.library.solder.lib.a.d
    public final com.kwad.library.solder.lib.a.b zP() {
            r1 = this;
            com.kwad.library.solder.lib.a.b r0 = r1.aqt
            return r0
    }

    @Override // com.kwad.library.solder.lib.a.d
    public final com.kwad.library.solder.lib.ext.a zQ() {
            r1 = this;
            com.kwad.library.solder.lib.ext.a r0 = r1.aqu
            return r0
    }
}
