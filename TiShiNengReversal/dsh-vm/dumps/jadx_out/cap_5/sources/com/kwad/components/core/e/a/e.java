package com.kwad.components.core.e.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class e {
    private final java.util.List<com.kwad.components.core.e.a.b> Om;
    private final java.util.Stack<com.kwad.sdk.core.response.model.AdTemplate> On;
    private final java.util.concurrent.atomic.AtomicBoolean Oo;
    private final java.util.Set<java.lang.String> Op;
    private final java.lang.String TAG;
    private final java.util.concurrent.atomic.AtomicBoolean qY;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a {
        private static final com.kwad.components.core.e.a.e Ot = null;

        static {
                com.kwad.components.core.e.a.e r0 = new com.kwad.components.core.e.a.e
                r1 = 0
                r0.<init>(r1)
                com.kwad.components.core.e.a.e.a.Ot = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.kwad.components.core.e.a.e oO() {
                com.kwad.components.core.e.a.e r0 = com.kwad.components.core.e.a.e.a.Ot
                return r0
        }
    }

    private e() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "InstalledActivateManager"
            r1.TAG = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.Om = r0
            java.util.Stack r0 = new java.util.Stack
            r0.<init>()
            r1.On = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r1.qY = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r1.Oo = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.Op = r0
            return
    }

    /* synthetic */ e(byte r1) {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicBoolean a(com.kwad.components.core.e.a.e r0) {
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.Oo
            return r0
    }

    static /* synthetic */ void a(com.kwad.components.core.e.a.e r0, com.kwad.sdk.core.response.model.AdTemplate r1) {
            r0.az(r1)
            return
    }

    private static boolean a(com.kwad.sdk.core.response.model.AdTemplate r2, com.kwad.components.core.e.a.b r3) {
            java.lang.String r0 = "InstalledActivateManager"
            java.lang.String r1 = "showToActivityWindow"
            com.kwad.sdk.core.d.c.d(r0, r1)
            com.kwad.components.core.e.a.h r0 = new com.kwad.components.core.e.a.h
            r0.<init>()
            boolean r2 = r0.b(r2, r3)
            return r2
    }

    private void ay(com.kwad.sdk.core.response.model.AdTemplate r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.Oo
            boolean r0 = r0.get()
            java.lang.String r1 = "InstalledActivateManager"
            if (r0 != 0) goto L2b
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.qY
            boolean r0 = r0.get()
            if (r0 == 0) goto L13
            goto L2b
        L13:
            java.lang.String r0 = "showInstalledActivate"
            com.kwad.sdk.core.d.c.d(r1, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.Oo
            r1 = 1
            r0.set(r1)
            com.kwad.components.core.e.a.e$1 r0 = new com.kwad.components.core.e.a.e$1
            r0.<init>(r3, r4)
            long r1 = com.kwad.sdk.core.response.b.b.dD(r4)
            com.kwad.sdk.utils.bw.runOnUiThreadDelay(r0, r1)
            return
        L2b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "mLoadDisable: "
            r0.<init>(r2)
            java.util.concurrent.atomic.AtomicBoolean r2 = r3.qY
            boolean r2 = r2.get()
            r0.append(r2)
            java.lang.String r2 = ", mLoadDisable: "
            r0.append(r2)
            java.util.concurrent.atomic.AtomicBoolean r2 = r3.Oo
            boolean r2 = r2.get()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.kwad.sdk.core.d.c.d(r1, r0)
            java.util.Stack<com.kwad.sdk.core.response.model.AdTemplate> r0 = r3.On
            r0.add(r4)
            return
    }

    private void az(com.kwad.sdk.core.response.model.AdTemplate r2) {
            r1 = this;
            com.kwad.components.core.e.a.e$2 r0 = new com.kwad.components.core.e.a.e$2
            r0.<init>(r1)
            boolean r2 = a(r2, r0)
            if (r2 != 0) goto Le
            r1.oL()
        Le:
            return
    }

    static /* synthetic */ java.util.Set b(com.kwad.components.core.e.a.e r0) {
            java.util.Set<java.lang.String> r0 = r0.Op
            return r0
    }

    static /* synthetic */ void c(com.kwad.components.core.e.a.e r0) {
            r0.oL()
            return
    }

    public static com.kwad.components.core.e.a.e oK() {
            com.kwad.components.core.e.a.e r0 = com.kwad.components.core.e.a.e.a.oO()
            return r0
    }

    private synchronized void oL() {
            r1 = this;
            monitor-enter(r1)
            java.util.Stack<com.kwad.sdk.core.response.model.AdTemplate> r0 = r1.On     // Catch: java.lang.Throwable -> L18
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto Lb
            monitor-exit(r1)
            return
        Lb:
            java.util.Stack<com.kwad.sdk.core.response.model.AdTemplate> r0 = r1.On     // Catch: java.lang.Throwable -> L18
            java.lang.Object r0 = r0.pop()     // Catch: java.lang.Throwable -> L18
            com.kwad.sdk.core.response.model.AdTemplate r0 = (com.kwad.sdk.core.response.model.AdTemplate) r0     // Catch: java.lang.Throwable -> L18
            r1.ay(r0)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r1)
            return
        L18:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L18
            throw r0
    }

    public final void a(com.kwad.components.core.e.a.b r2) {
            r1 = this;
            java.util.List<com.kwad.components.core.e.a.b> r0 = r1.Om
            r0.add(r2)
            return
    }

    public final synchronized void ax(com.kwad.sdk.core.response.model.AdTemplate r3) {
            r2 = this;
            monitor-enter(r2)
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r3)     // Catch: java.lang.Throwable -> L22
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.ay(r0)     // Catch: java.lang.Throwable -> L22
            boolean r1 = com.kwad.sdk.core.response.b.b.dC(r3)     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L24
            java.util.Set<java.lang.String> r1 = r2.Op     // Catch: java.lang.Throwable -> L22
            boolean r1 = r1.contains(r0)     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L18
            goto L24
        L18:
            java.util.Set<java.lang.String> r1 = r2.Op     // Catch: java.lang.Throwable -> L22
            r1.add(r0)     // Catch: java.lang.Throwable -> L22
            r2.ay(r3)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r2)
            return
        L22:
            r3 = move-exception
            goto L26
        L24:
            monitor-exit(r2)
            return
        L26:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L22
            throw r3
    }

    public final void b(com.kwad.components.core.e.a.b r2) {
            r1 = this;
            java.util.List<com.kwad.components.core.e.a.b> r0 = r1.Om
            r0.remove(r2)
            return
    }

    public final void eL() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.qY
            r1 = 0
            r0.set(r1)
            java.util.List<com.kwad.components.core.e.a.b> r0 = r2.Om
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            com.kwad.components.core.e.a.b r1 = (com.kwad.components.core.e.a.b) r1
            r1.fY()
            goto Lc
        L1c:
            return
    }

    public final void fa() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.qY
            r1 = 1
            r0.set(r1)
            java.util.List<com.kwad.components.core.e.a.b> r0 = r2.Om
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            com.kwad.components.core.e.a.b r1 = (com.kwad.components.core.e.a.b) r1
            r1.oI()
            goto Lc
        L1c:
            return
    }

    public final boolean isShowing() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.qY
            boolean r0 = r0.get()
            return r0
    }
}
