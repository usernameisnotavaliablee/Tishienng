package com.kwad.components.ad.i;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class b implements com.kwad.components.core.internal.api.b {
    private static final java.lang.Object qA = null;
    private static volatile com.kwad.components.ad.i.b qB;
    private java.util.Set<java.lang.Integer> qC;
    private java.util.List<com.kwad.components.ad.i.c> qD;
    private java.util.Map<com.kwad.components.core.internal.api.a, java.lang.Object> qE;
    private java.util.Map<com.kwad.components.core.proxy.f, java.lang.Object> qF;
    private com.kwad.components.core.proxy.m qG;


    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.kwad.components.ad.i.b.qA = r0
            return
    }

    private b() {
            r2 = this;
            r2.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r2.qC = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.qD = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r2.qE = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r2.qF = r0
            com.kwad.components.ad.i.b$1 r0 = new com.kwad.components.ad.i.b$1
            r0.<init>(r2)
            r2.qG = r0
            com.kwad.components.core.proxy.l r0 = com.kwad.components.core.proxy.l.rV()
            com.kwad.components.core.proxy.m r1 = r2.qG
            r0.a(r1)
            java.util.Set<java.lang.Integer> r0 = r2.qC
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.util.Set<java.lang.Integer> r0 = r2.qC
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.util.Set<java.lang.Integer> r0 = r2.qC
            r1 = 13
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.util.Set<java.lang.Integer> r0 = r2.qC
            r1 = 6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            return
    }

    private boolean J(com.kwad.sdk.core.response.model.AdTemplate r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            int r2 = r2.adStyle
            java.util.Set<java.lang.Integer> r0 = r1.qC
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r0.contains(r2)
            return r2
    }

    static /* synthetic */ java.util.Map a(com.kwad.components.ad.i.b r0) {
            java.util.Map<com.kwad.components.core.proxy.f, java.lang.Object> r0 = r0.qF
            return r0
    }

    static /* synthetic */ void b(com.kwad.components.ad.i.b r0) {
            r0.fS()
            return
    }

    private void e(com.kwad.components.core.internal.api.a r3) {
            r2 = this;
            java.util.Map<com.kwad.components.core.internal.api.a, java.lang.Object> r0 = r2.qE
            java.lang.Object r1 = com.kwad.components.ad.i.b.qA
            r0.put(r3, r1)
            boolean r0 = g(r3)
            if (r0 == 0) goto L1a
            com.kwad.components.ad.i.c r0 = new com.kwad.components.ad.i.c
            r0.<init>(r3)
            r0.fV()
            java.util.List<com.kwad.components.ad.i.c> r3 = r2.qD
            r3.add(r0)
        L1a:
            return
    }

    private void f(com.kwad.components.core.internal.api.a r3) {
            r2 = this;
            java.util.Map<com.kwad.components.core.internal.api.a, java.lang.Object> r0 = r2.qE
            r0.remove(r3)
            java.util.List<com.kwad.components.ad.i.c> r0 = r2.qD
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r0.next()
            com.kwad.components.ad.i.c r1 = (com.kwad.components.ad.i.c) r1
            r1.d(r3)
            goto Lb
        L1b:
            com.kwad.sdk.core.response.model.AdTemplate r3 = r3.getAdTemplate()
            boolean r3 = r2.J(r3)
            if (r3 == 0) goto L28
            r2.fS()
        L28:
            return
    }

    public static com.kwad.components.ad.i.b fR() {
            com.kwad.components.ad.i.b r0 = com.kwad.components.ad.i.b.qB
            if (r0 != 0) goto L19
            java.lang.Class<com.kwad.components.ad.i.b> r0 = com.kwad.components.ad.i.b.class
            monitor-enter(r0)
            com.kwad.components.ad.i.b r1 = com.kwad.components.ad.i.b.qB     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.kwad.components.ad.i.b r1 = new com.kwad.components.ad.i.b     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.kwad.components.ad.i.b.qB = r1     // Catch: java.lang.Throwable -> L13
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
            com.kwad.components.ad.i.b r0 = com.kwad.components.ad.i.b.qB
            return r0
    }

    private synchronized void fS() {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.fT()     // Catch: java.lang.Throwable -> L30
            java.lang.String r1 = "KsAdGlobalWatcher"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
            java.lang.String r3 = "checkCurrentPage noSDKPage: "
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L30
            r2.append(r0)     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L30
            com.kwad.sdk.core.d.c.d(r1, r2)     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L32
            java.util.List<com.kwad.components.ad.i.c> r0 = r4.qD     // Catch: java.lang.Throwable -> L30
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L30
        L20:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L32
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L30
            com.kwad.components.ad.i.c r1 = (com.kwad.components.ad.i.c) r1     // Catch: java.lang.Throwable -> L30
            r1.fX()     // Catch: java.lang.Throwable -> L30
            goto L20
        L30:
            r0 = move-exception
            goto L34
        L32:
            monitor-exit(r4)
            return
        L34:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L30
            throw r0
    }

    static /* synthetic */ java.lang.Object fU() {
            java.lang.Object r0 = com.kwad.components.ad.i.b.qA
            return r0
    }

    private static boolean g(com.kwad.components.core.internal.api.a r1) {
            boolean r0 = r1.supportPushAd()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            com.kwad.sdk.core.response.model.AdTemplate r1 = r1.getAdTemplate()
            com.kwad.sdk.core.response.model.AdInfo r1 = com.kwad.sdk.core.response.b.e.el(r1)
            boolean r1 = com.kwad.sdk.core.response.b.a.da(r1)
            return r1
    }

    public final void a(com.kwad.components.ad.i.c r2) {
            r1 = this;
            if (r2 == 0) goto L7
            java.util.List<com.kwad.components.ad.i.c> r0 = r1.qD
            r0.remove(r2)
        L7:
            return
    }

    public final void a(com.kwad.components.core.internal.api.a r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r1.a(r0)
        L5:
            return
    }

    public final void b(com.kwad.components.core.internal.api.a r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r1.b(r0)
        L5:
            return
    }

    @Override // com.kwad.components.core.internal.api.b
    public final void c(com.kwad.components.core.internal.api.a r1) {
            r0 = this;
            r0.e(r1)
            return
    }

    @Override // com.kwad.components.core.internal.api.b
    public final void d(com.kwad.components.core.internal.api.a r1) {
            r0 = this;
            r0.f(r1)
            r0.b(r1)
            return
    }

    public final synchronized boolean fT() {
            r2 = this;
            monitor-enter(r2)
            java.util.Map<com.kwad.components.core.internal.api.a, java.lang.Object> r0 = r2.qE     // Catch: java.lang.Throwable -> L24
            java.util.Set r0 = r0.keySet()     // Catch: java.lang.Throwable -> L24
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L24
        Lb:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L24
            com.kwad.components.core.internal.api.a r1 = (com.kwad.components.core.internal.api.a) r1     // Catch: java.lang.Throwable -> L24
            com.kwad.sdk.core.response.model.AdTemplate r1 = r1.getAdTemplate()     // Catch: java.lang.Throwable -> L24
            boolean r1 = r2.J(r1)     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto Lb
            monitor-exit(r2)
            r0 = 0
            return r0
        L24:
            r0 = move-exception
            goto L2e
        L26:
            java.util.Map<com.kwad.components.core.proxy.f, java.lang.Object> r0 = r2.qF     // Catch: java.lang.Throwable -> L24
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L24
            monitor-exit(r2)
            return r0
        L2e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L24
            throw r0
    }
}
