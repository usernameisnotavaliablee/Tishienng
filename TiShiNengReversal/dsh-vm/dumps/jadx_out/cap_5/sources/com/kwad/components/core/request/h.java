package com.kwad.components.core.request;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class h {
    private static volatile boolean WZ;
    private static final java.util.List<com.kwad.components.core.request.h.a> Xa = null;
    private static final java.util.concurrent.atomic.AtomicBoolean sHasInit = null;




    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void d(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.SdkConfigData r1);

        void ss();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b extends com.kwad.components.core.request.h.a {
        void st();
    }

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            com.kwad.components.core.request.h.sHasInit = r0
            r0 = 0
            com.kwad.components.core.request.h.WZ = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            com.kwad.components.core.request.h.Xa = r0
            return
    }

    public h() {
            r1 = this;
            r1.<init>()
            return
    }

    public static synchronized void a(com.kwad.components.core.request.h.a r3) {
            java.lang.Class<com.kwad.components.core.request.h> r0 = com.kwad.components.core.request.h.class
            monitor-enter(r0)
            java.lang.String r1 = "ConfigRequestManager"
            java.lang.String r2 = "init config"
            com.kwad.sdk.core.d.c.d(r1, r2)     // Catch: java.lang.Throwable -> L1b
            java.util.concurrent.atomic.AtomicBoolean r1 = com.kwad.components.core.request.h.sHasInit     // Catch: java.lang.Throwable -> L1b
            boolean r1 = r1.get()     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L1d
            java.lang.String r3 = "ConfigRequestManager"
            java.lang.String r1 = "config request manager has init"
            com.kwad.sdk.core.d.c.d(r3, r1)     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)
            return
        L1b:
            r3 = move-exception
            goto L2c
        L1d:
            java.util.List<com.kwad.components.core.request.h$a> r1 = com.kwad.components.core.request.h.Xa     // Catch: java.lang.Throwable -> L1b
            r1.add(r3)     // Catch: java.lang.Throwable -> L1b
            com.kwad.components.core.request.h$1 r3 = new com.kwad.components.core.request.h$1     // Catch: java.lang.Throwable -> L1b
            r3.<init>()     // Catch: java.lang.Throwable -> L1b
            com.kwad.sdk.utils.h.execute(r3)     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)
            return
        L2c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r3
    }

    private static void a(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.SdkConfigData r2) {
            java.util.List<com.kwad.components.core.request.h$a> r0 = com.kwad.components.core.request.h.Xa
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r0.next()
            com.kwad.components.core.request.h$a r1 = (com.kwad.components.core.request.h.a) r1
            r1.d(r2)     // Catch: java.lang.Throwable -> L16
            goto L6
        L16:
            r1 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r1)
            goto L6
        L1b:
            return
    }

    static /* synthetic */ boolean access$102(boolean r0) {
            r0 = 1
            com.kwad.components.core.request.h.WZ = r0
            return r0
    }

    public static void b(com.kwad.components.core.request.h.a r1) {
            java.util.List<com.kwad.components.core.request.h$a> r0 = com.kwad.components.core.request.h.Xa     // Catch: java.lang.Throwable -> L1a
            r0.add(r1)     // Catch: java.lang.Throwable -> L1a
            boolean r0 = com.kwad.sdk.core.config.e.isLoaded()     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto Le
            r1.ss()     // Catch: java.lang.Throwable -> L1a
        Le:
            boolean r0 = com.kwad.components.core.request.h.WZ     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L19
            com.kwad.sdk.core.response.model.SdkConfigData r0 = com.kwad.sdk.core.config.e.Fw()     // Catch: java.lang.Throwable -> L1a
            r1.d(r0)     // Catch: java.lang.Throwable -> L1a
        L19:
            return
        L1a:
            r1 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r1)
            return
    }

    static /* synthetic */ void b(com.kwad.sdk.core.response.model.SdkConfigData r0) {
            a(r0)
            return
    }

    private static void m(int r1, java.lang.String r2) {
            java.util.List<com.kwad.components.core.request.h$a> r1 = com.kwad.components.core.request.h.Xa
            java.util.Iterator r1 = r1.iterator()
        L6:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L21
            java.lang.Object r2 = r1.next()
            com.kwad.components.core.request.h$a r2 = (com.kwad.components.core.request.h.a) r2
            boolean r0 = r2 instanceof com.kwad.components.core.request.h.b     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L6
            com.kwad.components.core.request.h$b r2 = (com.kwad.components.core.request.h.b) r2     // Catch: java.lang.Throwable -> L1c
            r2.st()     // Catch: java.lang.Throwable -> L1c
            goto L6
        L1c:
            r2 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r2)
            goto L6
        L21:
            return
    }

    static /* synthetic */ void n(int r0, java.lang.String r1) {
            m(r0, r1)
            return
    }

    public static void sn() {
            java.lang.String r0 = "ConfigRequestManager"
            java.lang.String r1 = "requestConfig"
            com.kwad.sdk.core.d.c.d(r0, r1)
            com.kwad.components.core.request.h$2 r0 = new com.kwad.components.core.request.h$2
            r0.<init>()
            com.kwad.components.core.request.h$3 r1 = new com.kwad.components.core.request.h$3
            r1.<init>()
            r0.request(r1)
            return
    }

    private static void so() {
            java.util.List<com.kwad.components.core.request.h$a> r0 = com.kwad.components.core.request.h.Xa
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r0.next()
            com.kwad.components.core.request.h$a r1 = (com.kwad.components.core.request.h.a) r1
            r1.ss()     // Catch: java.lang.Throwable -> L16
            goto L6
        L16:
            r1 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r1)
            goto L6
        L1b:
            return
    }

    static /* synthetic */ void sp() {
            so()
            return
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicBoolean sq() {
            java.util.concurrent.atomic.AtomicBoolean r0 = com.kwad.components.core.request.h.sHasInit
            return r0
    }
}
