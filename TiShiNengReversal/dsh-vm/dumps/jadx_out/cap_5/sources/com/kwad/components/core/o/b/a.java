package com.kwad.components.core.o.b;

import com.kwad.components.offline.api.IOfflineCompo;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class a<T extends com.kwad.components.offline.api.IOfflineCompo<?>> {
    private long II;
    private java.lang.String Ry;


    public a() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.Ry = r0
            return
    }

    static /* synthetic */ long a(com.kwad.components.core.o.b.a r2) {
            long r0 = r2.getDuration()
            return r0
    }

    static /* synthetic */ java.lang.String a(com.kwad.components.core.o.b.a r0, java.lang.String r1) {
            r0.Ry = r1
            return r1
    }

    private void a(android.content.Context r9, boolean r10, java.lang.ClassLoader r11) {
            r8 = this;
            r8.qw()
            java.lang.String r1 = r8.qE()
            java.lang.Class r0 = r11.loadClass(r1)     // Catch: java.lang.Throwable -> L42
            java.lang.Object r0 = r0.newInstance()     // Catch: java.lang.Throwable -> L42
            com.kwad.components.offline.api.IOfflineCompo r0 = (com.kwad.components.offline.api.IOfflineCompo) r0     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = r8.getTag()     // Catch: java.lang.Throwable -> L42
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L42
            java.lang.String r4 = "load component instance success: "
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L42
            java.lang.Class r4 = r0.getClass()     // Catch: java.lang.Throwable -> L42
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L42
            r3.append(r4)     // Catch: java.lang.Throwable -> L42
            java.lang.String r4 = ", loadFromNet:"
            r3.append(r4)     // Catch: java.lang.Throwable -> L42
            r3.append(r10)     // Catch: java.lang.Throwable -> L42
            java.lang.String r4 = ", classLoader:"
            r3.append(r4)     // Catch: java.lang.Throwable -> L42
            r3.append(r11)     // Catch: java.lang.Throwable -> L42
            java.lang.String r11 = r3.toString()     // Catch: java.lang.Throwable -> L42
            com.kwad.sdk.core.d.c.d(r2, r11)     // Catch: java.lang.Throwable -> L42
            r8.a(r9, r10, r0)     // Catch: java.lang.Throwable -> L42
            return
        L42:
            r0 = move-exception
            r9 = r0
            java.lang.String r2 = r8.qy()
            long r3 = r8.getDuration()
            java.lang.String r6 = "loadClass error"
            java.lang.String r7 = r8.Ry
            r5 = 4005(0xfa5, float:5.612E-42)
            com.kwad.components.core.o.c.a.a(r2, r3, r5, r6, r7)
            java.lang.String r10 = r8.getTag()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "loadClass or instance failed: "
            r11.<init>(r0)
            r11.append(r1)
            java.lang.String r11 = r11.toString()
            com.kwad.sdk.core.d.c.e(r10, r11, r9)
            return
    }

    static /* synthetic */ void a(com.kwad.components.core.o.b.a r0, android.content.Context r1, boolean r2, java.lang.ClassLoader r3) {
            r0.a(r1, r2, r3)
            return
    }

    private void aw(android.content.Context r5) {
            r4 = this;
            java.lang.Boolean r0 = com.kwad.components.core.a.MX
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1e
            java.lang.String r0 = r4.getTag()
            java.lang.String r1 = "init start disableOffline"
            com.kwad.sdk.core.d.c.d(r0, r1)
            java.lang.Class r0 = r4.getClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r1 = 0
            r4.a(r5, r1, r0)
            return
        L1e:
            com.kwad.library.solder.lib.c.b r0 = r4.qv()
            java.lang.String r1 = r4.getTag()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "load component start pluginInfo: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.kwad.sdk.core.d.c.d(r1, r2)
            com.kwad.components.core.o.b.a$1 r1 = new com.kwad.components.core.o.b.a$1
            r1.<init>(r4, r5)
            com.kwad.library.solder.a.a.a(r5, r0, r1)
            return
    }

    static /* synthetic */ java.lang.String b(com.kwad.components.core.o.b.a r0) {
            java.lang.String r0 = r0.Ry
            return r0
    }

    private long getDuration() {
            r4 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r4.II
            long r0 = r0 - r2
            return r0
    }

    private com.kwad.library.solder.lib.c.b qv() {
            r8 = this;
            com.kwad.library.solder.lib.c.b r0 = new com.kwad.library.solder.lib.c.b
            r0.<init>()
            java.lang.String r1 = r8.qz()
            r0.arx = r1
            r1 = 1
            r0.enable = r1
            r2 = 0
            r0.arB = r2
            com.kwad.sdk.core.network.idc.a r2 = com.kwad.sdk.core.network.idc.a.HF()
            java.lang.String r3 = r8.qB()
            java.lang.String r2 = r2.ef(r3)
            r0.ary = r2
            java.lang.String r2 = r8.qA()
            r0.version = r2
            java.lang.String r2 = r8.qC()
            r0.arA = r2
            java.lang.Boolean r2 = com.kwad.components.core.a.Na
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L3b
            java.lang.String r2 = r8.qD()
            r0.ara = r2
            r0.arb = r1
        L3b:
            java.lang.String r1 = r8.qC()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L65
            java.lang.String r1 = r8.qz()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L65
            java.lang.String r1 = r8.qA()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L65
            java.lang.String r1 = r8.qB()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L64
            goto L65
        L64:
            return r0
        L65:
            java.lang.String r2 = r8.qy()
            long r3 = r8.getDuration()
            java.lang.String r6 = "buildRemotePlugInfo error"
            java.lang.String r7 = r8.Ry
            r5 = 6001(0x1771, float:8.409E-42)
            com.kwad.components.core.o.c.a.a(r2, r3, r5, r6, r7)
            return r0
    }

    private void qw() {
            r4 = this;
            java.lang.String r0 = r4.getTag()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "init component start cost: "
            r1.<init>(r2)
            long r2 = r4.getDuration()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.kwad.sdk.core.d.c.d(r0, r1)
            java.lang.String r0 = r4.qy()
            long r1 = r4.getDuration()
            com.kwad.components.core.o.c.a.d(r0, r1)
            return
    }

    protected abstract void a(android.content.Context r1, boolean r2, T r3);

    public final void aJ(int r9) {
            r8 = this;
            java.lang.String r0 = r8.getTag()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "init component error time: "
            r1.<init>(r2)
            long r2 = r8.getDuration()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.kwad.sdk.core.d.c.d(r0, r1)
            java.lang.String r2 = r8.qy()
            long r3 = r8.getDuration()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "cmp_init_error, errorCode:"
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r6 = r0.toString()
            java.lang.String r7 = r8.Ry
            r5 = 5001(0x1389, float:7.008E-42)
            com.kwad.components.core.o.c.a.a(r2, r3, r5, r6, r7)
            return
    }

    protected abstract java.lang.String getTag();

    public final void init(android.content.Context r4) {
            r3 = this;
            boolean r0 = r3.isEnabled()     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L26
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L24
            r3.II = r0     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = r3.qy()     // Catch: java.lang.Throwable -> L24
            long r1 = r3.getDuration()     // Catch: java.lang.Throwable -> L24
            com.kwad.components.core.o.c.a.c(r0, r1)     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = r3.getTag()     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = "init start"
            com.kwad.sdk.core.d.c.d(r0, r1)     // Catch: java.lang.Throwable -> L24
            r3.aw(r4)     // Catch: java.lang.Throwable -> L24
            return
        L24:
            r4 = move-exception
            goto L37
        L26:
            java.lang.String r0 = r3.getTag()     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = "del start"
            com.kwad.sdk.core.d.c.d(r0, r1)     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = r3.qz()     // Catch: java.lang.Throwable -> L36
            com.kwad.library.solder.a.a.l(r4, r0)     // Catch: java.lang.Throwable -> L36
        L36:
            return
        L37:
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r4)
            return
    }

    public abstract boolean isEnabled();

    protected abstract java.lang.String qA();

    protected abstract java.lang.String qB();

    protected abstract java.lang.String qC();

    protected abstract java.lang.String qD();

    protected abstract java.lang.String qE();

    public final void qx() {
            r4 = this;
            java.lang.String r0 = r4.getTag()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "init component success cost: "
            r1.<init>(r2)
            long r2 = r4.getDuration()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.kwad.sdk.core.d.c.d(r0, r1)
            com.kwad.library.solder.lib.i r0 = com.kwad.library.solder.lib.i.zS()
            com.kwad.library.solder.lib.ext.c r0 = r0.zM()
            int r0 = r0.An()
            java.lang.String r1 = r4.qy()
            long r2 = r4.getDuration()
            com.kwad.components.core.o.c.a.c(r1, r2, r0)
            return
    }

    public abstract java.lang.String qy();

    protected abstract java.lang.String qz();
}
