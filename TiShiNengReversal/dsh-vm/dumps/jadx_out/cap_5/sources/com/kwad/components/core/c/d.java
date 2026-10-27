package com.kwad.components.core.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class d {
    private static boolean NB = true;
    private static volatile com.kwad.components.core.c.d Nz;

    @androidx.annotation.NonNull
    private final android.util.SparseArray<com.kwad.components.core.c.c> Ny;


    static {
            return
    }

    private d() {
            r3 = this;
            r3.<init>()
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r3.Ny = r0
            com.kwad.components.core.c.n r1 = new com.kwad.components.core.c.n
            r1.<init>()
            r2 = 0
            r0.append(r2, r1)
            com.kwad.components.core.c.m r1 = new com.kwad.components.core.c.m
            r1.<init>()
            r2 = 1
            r0.append(r2, r1)
            com.kwad.components.core.c.l r1 = new com.kwad.components.core.c.l
            r1.<init>()
            r2 = 2
            r0.append(r2, r1)
            return
    }

    static /* synthetic */ void a(com.kwad.components.core.c.d r0, com.kwad.components.core.request.model.a r1, com.kwad.components.core.c.c r2) {
            a(r1, r2)
            return
    }

    private static void a(com.kwad.components.core.request.model.a r1, com.kwad.components.core.c.c r2) {
            java.lang.String r2 = r2.getName()
            r2.getClass()
            java.lang.String r0 = "StrategyNetworkFirst"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L23
            java.lang.String r0 = "StrategyLocalCacheFirst"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1d
            java.lang.String r2 = "network_only"
            r1.aE(r2)
            return
        L1d:
            java.lang.String r2 = "cache_first"
            r1.aE(r2)
            return
        L23:
            java.lang.String r2 = "network_first"
            r1.aE(r2)
            return
    }

    static /* synthetic */ boolean a(com.kwad.components.core.c.d r0) {
            boolean r0 = oe()
            return r0
    }

    static /* synthetic */ android.util.SparseArray b(com.kwad.components.core.c.d r0) {
            android.util.SparseArray<com.kwad.components.core.c.c> r0 = r0.Ny
            return r0
    }

    public static com.kwad.components.core.c.d od() {
            com.kwad.components.core.c.d r0 = com.kwad.components.core.c.d.Nz
            if (r0 != 0) goto L19
            java.lang.Class<com.kwad.components.core.c.d> r0 = com.kwad.components.core.c.d.class
            monitor-enter(r0)
            com.kwad.components.core.c.d r1 = com.kwad.components.core.c.d.Nz     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.kwad.components.core.c.d r1 = new com.kwad.components.core.c.d     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.kwad.components.core.c.d.Nz = r1     // Catch: java.lang.Throwable -> L13
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
            com.kwad.components.core.c.d r0 = com.kwad.components.core.c.d.Nz
            return r0
    }

    private static boolean oe() {
            boolean r0 = com.kwad.components.core.c.d.NB
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r0 = "KEY_ENABLE_FORCE_ENABLE_AD_CACHE"
            boolean r0 = com.kwad.sdk.components.g.df(r0)     // Catch: java.lang.ClassNotFoundException -> L18
            if (r0 == 0) goto Lf
            return r1
        Lf:
            java.lang.String r0 = "com.kwad.devTools.PosConfigFetcher"
            java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L18
            r0 = 1
            com.kwad.components.core.c.d.NB = r0     // Catch: java.lang.ClassNotFoundException -> L18
            goto L1a
        L18:
            com.kwad.components.core.c.d.NB = r1
        L1a:
            boolean r0 = com.kwad.components.core.c.d.NB
            return r0
    }

    public final void d(com.kwad.components.core.request.model.a r3) {
            r2 = this;
            java.util.concurrent.ExecutorService r0 = com.kwad.sdk.core.threads.GlobalThreadPools.Ju()
            com.kwad.components.core.c.d$1 r1 = new com.kwad.components.core.c.d$1
            r1.<init>(r2, r3)
            r0.submit(r1)
            return
    }
}
