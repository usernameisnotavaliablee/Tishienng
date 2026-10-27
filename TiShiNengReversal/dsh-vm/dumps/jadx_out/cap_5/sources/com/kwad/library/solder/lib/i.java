package com.kwad.library.solder.lib;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class i {
    private static volatile com.kwad.library.solder.lib.i aqD;
    private static java.util.Map<java.lang.String, java.lang.Integer> aqF;

    @androidx.annotation.Nullable
    private static com.kwad.library.solder.lib.i.a aqG;
    private com.kwad.library.solder.lib.e aqE;
    private volatile boolean mHasInit;





    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void b(java.lang.String r1, java.io.File r2);

        void f(java.lang.String r1, java.lang.Throwable r2);

        int getCorePoolSize();

        int getMaxRetryCount();

        boolean zV();
    }

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r1 = 8
            r0.<init>(r1)
            com.kwad.library.solder.lib.i.aqF = r0
            return
    }

    private i() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mHasInit = r0
            return
    }

    static /* synthetic */ com.kwad.library.solder.lib.e a(com.kwad.library.solder.lib.i r0) {
            com.kwad.library.solder.lib.e r0 = r0.aqE
            return r0
    }

    public static void a(com.kwad.library.solder.lib.i.a r0) {
            com.kwad.library.solder.lib.i.aqG = r0
            return
    }

    public static boolean bR(java.lang.String r1) {
            java.util.Map<java.lang.String, java.lang.Integer> r0 = com.kwad.library.solder.lib.i.aqF     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto L9
            boolean r1 = r0.containsKey(r1)     // Catch: java.lang.Throwable -> L9
            return r1
        L9:
            r1 = 0
            return r1
    }

    private static java.util.concurrent.ExecutorService cg(int r8) {
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r6 = new java.util.concurrent.LinkedBlockingQueue
            r6.<init>()
            com.kwad.library.solder.lib.i$1 r7 = new com.kwad.library.solder.lib.i$1
            r7.<init>()
            r2 = 3
            r3 = 60
            r1 = r8
            r0.<init>(r1, r2, r3, r5, r6, r7)
            return r0
    }

    private synchronized void init(android.content.Context r10) {
            r9 = this;
            monitor-enter(r9)
            boolean r0 = r9.mHasInit     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L7
            monitor-exit(r9)
            return
        L7:
            com.kwad.library.solder.lib.ext.c$a r0 = new com.kwad.library.solder.lib.ext.c$a     // Catch: java.lang.Throwable -> L1c
            r0.<init>()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = "sodler"
            com.kwad.library.solder.lib.ext.c$a r0 = r0.bZ(r1)     // Catch: java.lang.Throwable -> L1c
            com.kwad.library.solder.lib.i$a r1 = com.kwad.library.solder.lib.i.aqG     // Catch: java.lang.Throwable -> L1c
            r2 = 1
            if (r1 == 0) goto L1f
            int r1 = r1.getMaxRetryCount()     // Catch: java.lang.Throwable -> L1c
            goto L20
        L1c:
            r0 = move-exception
            r10 = r0
            goto L83
        L1f:
            r1 = 1
        L20:
            com.kwad.library.solder.lib.ext.c$a r0 = r0.cj(r1)     // Catch: java.lang.Throwable -> L1c
            r1 = 0
            com.kwad.library.solder.lib.ext.c$a r0 = r0.bk(r1)     // Catch: java.lang.Throwable -> L1c
            com.kwad.library.solder.lib.i$a r3 = com.kwad.library.solder.lib.i.aqG     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L35
            boolean r3 = r3.zV()     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L35
            r3 = 1
            goto L36
        L35:
            r3 = 0
        L36:
            com.kwad.library.solder.lib.ext.c$a r0 = r0.bl(r3)     // Catch: java.lang.Throwable -> L1c
            com.kwad.library.solder.lib.i$a r3 = com.kwad.library.solder.lib.i.aqG     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L43
            int r3 = r3.getCorePoolSize()     // Catch: java.lang.Throwable -> L1c
            goto L44
        L43:
            r3 = 0
        L44:
            java.util.concurrent.ExecutorService r3 = cg(r3)     // Catch: java.lang.Throwable -> L1c
            com.kwad.library.solder.lib.ext.c$a r0 = r0.a(r3)     // Catch: java.lang.Throwable -> L1c
            com.kwad.library.solder.lib.i$a r3 = com.kwad.library.solder.lib.i.aqG     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L54
            int r1 = r3.getCorePoolSize()     // Catch: java.lang.Throwable -> L1c
        L54:
            com.kwad.library.solder.lib.ext.c$a r0 = r0.ck(r1)     // Catch: java.lang.Throwable -> L1c
            com.kwad.library.solder.lib.ext.c r7 = r0.Ay()     // Catch: java.lang.Throwable -> L1c
            com.kwad.library.solder.lib.d r4 = new com.kwad.library.solder.lib.d     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r10)     // Catch: java.lang.Throwable -> L1c
            com.kwad.library.solder.lib.c r6 = new com.kwad.library.solder.lib.c     // Catch: java.lang.Throwable -> L1c
            r6.<init>(r10, r7)     // Catch: java.lang.Throwable -> L1c
            com.kwad.library.solder.lib.f r5 = new com.kwad.library.solder.lib.f     // Catch: java.lang.Throwable -> L1c
            r5.<init>(r10)     // Catch: java.lang.Throwable -> L1c
            com.kwad.library.solder.lib.i$2 r10 = new com.kwad.library.solder.lib.i$2     // Catch: java.lang.Throwable -> L1c
            r10.<init>(r9)     // Catch: java.lang.Throwable -> L1c
            r5.a(r10)     // Catch: java.lang.Throwable -> L1c
            com.kwad.library.solder.lib.e r3 = new com.kwad.library.solder.lib.e     // Catch: java.lang.Throwable -> L1c
            com.kwad.library.solder.lib.ext.a r8 = new com.kwad.library.solder.lib.ext.a     // Catch: java.lang.Throwable -> L1c
            r8.<init>()     // Catch: java.lang.Throwable -> L1c
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L1c
            r9.aqE = r3     // Catch: java.lang.Throwable -> L1c
            r9.mHasInit = r2     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r9)
            return
        L83:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L1c
            throw r10
    }

    public static com.kwad.library.solder.lib.i zS() {
            com.kwad.library.solder.lib.i r0 = com.kwad.library.solder.lib.i.aqD
            if (r0 != 0) goto L19
            java.lang.Class<com.kwad.library.solder.lib.i> r0 = com.kwad.library.solder.lib.i.class
            monitor-enter(r0)
            com.kwad.library.solder.lib.i r1 = com.kwad.library.solder.lib.i.aqD     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.kwad.library.solder.lib.i r1 = new com.kwad.library.solder.lib.i     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.kwad.library.solder.lib.i.aqD = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.kwad.library.solder.lib.i r0 = com.kwad.library.solder.lib.i.aqD
            return r0
    }

    static /* synthetic */ java.util.Map zT() {
            java.util.Map<java.lang.String, java.lang.Integer> r0 = com.kwad.library.solder.lib.i.aqF
            return r0
    }

    static /* synthetic */ com.kwad.library.solder.lib.i.a zU() {
            com.kwad.library.solder.lib.i$a r0 = com.kwad.library.solder.lib.i.aqG
            return r0
    }

    public final <P extends com.kwad.library.solder.lib.a.a, R extends com.kwad.library.solder.lib.a.e<P>> void a(android.content.Context r2, @androidx.annotation.NonNull R r3, com.kwad.library.solder.lib.ext.b<P, R> r4) {
            r1 = this;
            r1.init(r2)
            com.kwad.library.solder.lib.e r2 = r1.aqE
            com.kwad.library.solder.lib.ext.c r2 = r2.zM()
            int r2 = r2.getRetryCount()
            r3.ci(r2)
            com.kwad.library.solder.lib.i$3 r2 = new com.kwad.library.solder.lib.i$3
            com.kwad.library.solder.lib.ext.b$b r0 = new com.kwad.library.solder.lib.ext.b$b
            r0.<init>()
            r2.<init>(r1, r4, r0)
            r3.a(r2)
            com.kwad.library.solder.lib.e r2 = r1.aqE
            r4 = 16
            r2.a(r3, r4)
            return
    }

    public final void l(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = r1.mHasInit
            if (r0 != 0) goto L9
            if (r2 == 0) goto L9
            r1.init(r2)
        L9:
            com.kwad.library.solder.lib.ext.c r2 = r1.zM()
            if (r2 == 0) goto L29
            com.kwad.library.solder.lib.ext.c r2 = r1.zM()
            java.util.concurrent.ExecutorService r2 = r2.Aw()
            if (r2 == 0) goto L29
            com.kwad.library.solder.lib.ext.c r2 = r1.zM()
            java.util.concurrent.ExecutorService r2 = r2.Aw()
            com.kwad.library.solder.lib.i$4 r0 = new com.kwad.library.solder.lib.i$4
            r0.<init>(r1, r3)
            r2.execute(r0)
        L29:
            return
    }

    @androidx.annotation.Nullable
    public final com.kwad.library.solder.lib.a.a m(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = r1.mHasInit
            if (r0 != 0) goto L9
            if (r2 == 0) goto L9
            r1.init(r2)
        L9:
            com.kwad.library.solder.lib.e r2 = r1.aqE
            if (r2 == 0) goto L16
            com.kwad.library.solder.lib.a.c r2 = r2.zN()
            com.kwad.library.solder.lib.a.a r2 = r2.bP(r3)
            return r2
        L16:
            r2 = 0
            return r2
    }

    public final com.kwad.library.solder.lib.ext.c zM() {
            r2 = this;
            boolean r0 = r2.mHasInit
            if (r0 == 0) goto Lb
            com.kwad.library.solder.lib.e r0 = r2.aqE
            com.kwad.library.solder.lib.ext.c r0 = r0.zM()
            return r0
        Lb:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Sodler has not yet been init."
            r0.<init>(r1)
            throw r0
    }
}
