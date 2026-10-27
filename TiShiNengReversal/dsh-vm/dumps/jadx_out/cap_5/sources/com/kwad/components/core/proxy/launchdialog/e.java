package com.kwad.components.core.proxy.launchdialog;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class e {
    private static com.kwad.components.core.proxy.launchdialog.e WB;
    private java.util.List<com.kwad.components.core.proxy.launchdialog.b> WC;
    private com.kwad.components.core.proxy.launchdialog.a WD;
    private com.kwad.components.core.proxy.b WE;



    static {
            com.kwad.components.core.proxy.launchdialog.e r0 = new com.kwad.components.core.proxy.launchdialog.e
            r0.<init>()
            com.kwad.components.core.proxy.launchdialog.e.WB = r0
            return
    }

    public e() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r2.WC = r0
            com.kwad.components.core.proxy.launchdialog.a r0 = new com.kwad.components.core.proxy.launchdialog.a
            r0.<init>()
            r2.WD = r0
            com.kwad.components.core.proxy.b r1 = new com.kwad.components.core.proxy.b
            r1.<init>(r0)
            r2.WE = r1
            return
    }

    private void a(com.kwad.components.core.proxy.launchdialog.DetectEventType r2, com.kwad.components.core.proxy.launchdialog.f r3) {
            r1 = this;
            com.kwad.components.core.proxy.launchdialog.a r0 = r1.WD
            com.kwad.components.core.proxy.launchdialog.c r2 = r0.a(r2)
            if (r2 == 0) goto Le
            r2.a(r3)
            r2.start()
        Le:
            return
    }

    static /* synthetic */ void a(com.kwad.components.core.proxy.launchdialog.e r0, com.kwad.sdk.core.response.model.AdTemplate r1) {
            r0.aH(r1)
            return
    }

    private void aG(com.kwad.sdk.core.response.model.AdTemplate r5) {
            r4 = this;
            com.kwad.sdk.core.adlog.c.b r0 = new com.kwad.sdk.core.adlog.c.b
            r0.<init>()
            r1 = 230(0xe6, float:3.22E-43)
            com.kwad.sdk.core.adlog.c.b r0 = r0.df(r1)
            r1 = 25
            com.kwad.sdk.core.adlog.c.b r0 = r0.dm(r1)
            r1 = 0
            com.kwad.sdk.core.adlog.c.e(r5, r1, r0)
            long r0 = com.kwad.sdk.core.response.b.e.ev(r5)
            java.util.List<com.kwad.components.core.proxy.launchdialog.b> r5 = r4.WC
            java.util.Iterator r5 = r5.iterator()
        L1f:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L30
            java.lang.Object r2 = r5.next()
            com.kwad.components.core.proxy.launchdialog.b r2 = (com.kwad.components.core.proxy.launchdialog.b) r2
            r3 = 2
            r2.b(r0, r3)
            goto L1f
        L30:
            return
    }

    private void aH(com.kwad.sdk.core.response.model.AdTemplate r5) {
            r4 = this;
            com.kwad.sdk.core.adlog.c.b r0 = new com.kwad.sdk.core.adlog.c.b
            r0.<init>()
            r1 = 231(0xe7, float:3.24E-43)
            com.kwad.sdk.core.adlog.c.b r0 = r0.df(r1)
            r1 = 25
            com.kwad.sdk.core.adlog.c.b r0 = r0.dm(r1)
            r1 = 0
            com.kwad.sdk.core.adlog.c.e(r5, r1, r0)
            long r0 = com.kwad.sdk.core.response.b.e.ev(r5)
            java.util.List<com.kwad.components.core.proxy.launchdialog.b> r5 = r4.WC
            java.util.Iterator r5 = r5.iterator()
        L1f:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L30
            java.lang.Object r2 = r5.next()
            com.kwad.components.core.proxy.launchdialog.b r2 = (com.kwad.components.core.proxy.launchdialog.b) r2
            r3 = 3
            r2.b(r0, r3)
            goto L1f
        L30:
            return
    }

    static /* synthetic */ void b(com.kwad.components.core.proxy.launchdialog.e r0, com.kwad.sdk.core.response.model.AdTemplate r1) {
            r0.aG(r1)
            return
    }

    public static com.kwad.components.core.proxy.launchdialog.e sc() {
            com.kwad.components.core.proxy.launchdialog.e r0 = com.kwad.components.core.proxy.launchdialog.e.WB
            return r0
    }

    public final void a(com.kwad.components.core.proxy.launchdialog.b r2) {
            r1 = this;
            if (r2 == 0) goto L7
            java.util.List<com.kwad.components.core.proxy.launchdialog.b> r0 = r1.WC
            r0.add(r2)
        L7:
            return
    }

    public final void aF(com.kwad.sdk.core.response.model.AdTemplate r5) {
            r4 = this;
            com.kwad.components.core.proxy.launchdialog.a r0 = r4.WD
            com.kwad.components.core.proxy.a r0 = r0.rW()
            r4.n(r0)
            com.kwad.components.core.proxy.launchdialog.e r0 = sc()
            com.kwad.components.core.proxy.launchdialog.DetectEventType r1 = com.kwad.components.core.proxy.launchdialog.DetectEventType.USER_CANCEL
            com.kwad.components.core.proxy.launchdialog.e$1 r2 = new com.kwad.components.core.proxy.launchdialog.e$1
            r2.<init>(r4, r5)
            r0.a(r1, r2)
            com.kwad.components.core.proxy.launchdialog.e r0 = sc()
            com.kwad.components.core.proxy.launchdialog.DetectEventType r1 = com.kwad.components.core.proxy.launchdialog.DetectEventType.USER_CONFIRM
            com.kwad.components.core.proxy.launchdialog.e$2 r2 = new com.kwad.components.core.proxy.launchdialog.e$2
            r2.<init>(r4, r5)
            r0.a(r1, r2)
            long r0 = com.kwad.sdk.core.response.b.e.ev(r5)
            java.util.List<com.kwad.components.core.proxy.launchdialog.b> r5 = r4.WC
            java.util.Iterator r5 = r5.iterator()
        L2f:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L40
            java.lang.Object r2 = r5.next()
            com.kwad.components.core.proxy.launchdialog.b r2 = (com.kwad.components.core.proxy.launchdialog.b) r2
            r3 = 1
            r2.b(r0, r3)
            goto L2f
        L40:
            return
    }

    public final void b(com.kwad.components.core.proxy.launchdialog.b r2) {
            r1 = this;
            if (r2 == 0) goto L7
            java.util.List<com.kwad.components.core.proxy.launchdialog.b> r0 = r1.WC
            r0.remove(r2)
        L7:
            return
    }

    public final void init(android.content.Context r2) {
            r1 = this;
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            boolean r0 = r2 instanceof android.app.Application
            if (r0 == 0) goto L13
            android.app.Application r2 = (android.app.Application) r2
            com.kwad.components.core.proxy.b r0 = r1.WE
            r2.registerActivityLifecycleCallbacks(r0)
        L13:
            return
    }

    public final void n(com.kwad.components.core.proxy.a r2) {
            r1 = this;
            com.kwad.components.core.proxy.launchdialog.a r0 = r1.WD
            r0.i(r2)
            com.kwad.components.core.proxy.launchdialog.a r0 = r1.WD
            r0.h(r2)
            return
    }
}
