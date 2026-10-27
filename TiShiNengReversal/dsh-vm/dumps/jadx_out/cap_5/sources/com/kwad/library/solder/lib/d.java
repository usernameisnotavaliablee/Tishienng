package com.kwad.library.solder.lib;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class d implements com.kwad.library.solder.lib.a.c {
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.kwad.library.solder.lib.a.a> aqq;
    private final android.content.Context mContext;

    d(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.aqq = r0
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            r1.mContext = r2
            return
    }

    private static void a(com.kwad.library.solder.lib.a.e r1) {
            r1.getState()
            r0 = 8
            r1.ch(r0)
            com.kwad.library.solder.lib.a.d r0 = r1.zZ()
            com.kwad.library.solder.lib.ext.a r0 = r0.zQ()
            r0.a(r1)
            return
    }

    private static void a(com.kwad.library.solder.lib.a.e r1, com.kwad.library.solder.lib.a.a r2) {
            r1.getState()
            r0 = 5
            r1.ch(r0)
            com.kwad.library.solder.lib.a.d r0 = r1.zZ()
            com.kwad.library.solder.lib.ext.a r0 = r0.zQ()
            r0.b(r1, r2)
            return
    }

    private synchronized void a(java.lang.String r2, com.kwad.library.solder.lib.a.a r3) {
            r1 = this;
            monitor-enter(r1)
            if (r3 == 0) goto L12
            boolean r0 = r3.isLoaded()     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L12
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.kwad.library.solder.lib.a.a> r0 = r1.aqq     // Catch: java.lang.Throwable -> Lf
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> Lf
            goto L12
        Lf:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r2
        L12:
            monitor-exit(r1)
            return
    }

    private static void b(com.kwad.library.solder.lib.a.e r1) {
            r1.getState()
            r0 = 7
            r1.ch(r0)
            com.kwad.library.solder.lib.a.d r0 = r1.zZ()
            com.kwad.library.solder.lib.ext.a r0 = r0.zQ()
            r0.r(r1)
            return
    }

    private static void b(com.kwad.library.solder.lib.a.e r1, com.kwad.library.solder.lib.ext.PluginError r2) {
            r1.getState()
            r0 = 6
            r1.ch(r0)
            r1.j(r2)
            com.kwad.library.solder.lib.a.d r0 = r1.zZ()
            com.kwad.library.solder.lib.ext.a r0 = r0.zQ()
            r0.c(r1, r2)
            return
    }

    private static void c(com.kwad.library.solder.lib.a.e r1) {
            r1.getState()
            com.kwad.library.solder.lib.a.d r0 = r1.zZ()
            com.kwad.library.solder.lib.ext.a r0 = r0.zQ()
            r0.q(r1)
            return
    }

    private static void f(com.kwad.library.solder.lib.a.e r1) {
            r1.getState()
            r0 = 0
            r1.ch(r0)
            com.kwad.library.solder.lib.a.d r0 = r1.zZ()
            com.kwad.library.solder.lib.ext.a r0 = r0.zQ()
            r0.n(r1)
            return
    }

    private com.kwad.library.solder.lib.a.a h(com.kwad.library.solder.lib.a.e r8) {
            r7 = this;
            b(r8)
            java.lang.String r0 = r8.Ag()
            com.kwad.library.solder.lib.a.a r0 = r8.bY(r0)
            com.kwad.library.solder.lib.c.b r1 = r8.Al()
            com.kwad.library.solder.lib.a.a r0 = r0.a(r1)
            java.lang.String r1 = r0.zX()
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            r8.Ad()
            com.kwad.library.solder.lib.a.d r3 = r8.zZ()
            boolean r2 = r2.exists()
            if (r2 == 0) goto L94
            java.lang.String r2 = r8.Ad()
            java.lang.String r4 = r8.getVersion()
            com.kwad.library.solder.lib.a.a r5 = r7.bP(r2)
            if (r5 == 0) goto L3b
            a(r8)
            return r5
        L3b:
            r0.bT(r2)
            r0.bS(r4)
            com.kwad.library.solder.lib.a.b r5 = r3.zP()
            java.lang.String r6 = r8.Ak()
            boolean r5 = r5.a(r2, r4, r6)
            if (r5 == 0) goto L6c
            com.kwad.library.solder.lib.a.b r5 = r3.zP()
            java.lang.String r4 = r5.G(r2, r4)
            boolean r5 = com.kwad.sdk.utils.w.gQ(r4)
            if (r5 == 0) goto L6c
            r0.bU(r4)
            android.content.Context r1 = r7.mContext
            r0.n(r1, r4)
            r7.a(r2, r0)
            a(r8)
            return r0
        L6c:
            com.kwad.library.solder.lib.a.b r4 = r3.zP()
            java.lang.String r4 = r4.b(r0)
            r0.bU(r4)
            android.content.Context r5 = r7.mContext
            r0.n(r5, r4)
            r7.a(r2, r0)
            com.kwad.library.solder.lib.ext.c r2 = r3.zM()
            java.lang.String r2 = r2.As()
            boolean r2 = r1.endsWith(r2)
            if (r2 == 0) goto L90
            com.kwad.sdk.utils.w.delete(r1)
        L90:
            a(r8)
            return r0
        L94:
            com.kwad.library.solder.lib.ext.PluginError$LoadError r8 = new com.kwad.library.solder.lib.ext.PluginError$LoadError
            java.lang.String r0 = "Apk file not exist."
            r1 = 3001(0xbb9, float:4.205E-42)
            r8.<init>(r0, r1)
            throw r8
    }

    @Override // com.kwad.library.solder.lib.a.c
    public final synchronized com.kwad.library.solder.lib.a.a bP(java.lang.String r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.kwad.library.solder.lib.a.a> r0 = r1.aqq     // Catch: java.lang.Throwable -> L14
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L14
            com.kwad.library.solder.lib.a.a r2 = (com.kwad.library.solder.lib.a.a) r2     // Catch: java.lang.Throwable -> L14
            if (r2 == 0) goto L16
            boolean r0 = r2.isLoaded()     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L16
            monitor-exit(r1)
            r2 = 0
            return r2
        L14:
            r2 = move-exception
            goto L18
        L16:
            monitor-exit(r1)
            return r2
        L18:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            throw r2
    }

    @Override // com.kwad.library.solder.lib.a.c
    public final void g(@androidx.annotation.NonNull com.kwad.library.solder.lib.a.e r8) {
            r7 = this;
            r8.Ad()
            java.lang.String r0 = "Load"
            r8.bV(r0)
            c(r8)
            boolean r0 = r8.isCanceled()
            if (r0 == 0) goto L15
            f(r8)
            return
        L15:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.kwad.library.solder.lib.a.a> r0 = r7.aqq
            java.lang.String r1 = r8.Ad()
            java.lang.Object r0 = r0.get(r1)
            com.kwad.library.solder.lib.a.a r0 = (com.kwad.library.solder.lib.a.a) r0
            if (r0 == 0) goto L36
            boolean r1 = r0.isLoaded()
            if (r1 == 0) goto L36
            r8.c(r0)
            r8.Ad()
            r0.zX()
            a(r8, r0)
            return
        L36:
            com.kwad.library.solder.lib.c.b r0 = r8.Al()
            r1 = 2006(0x7d6, float:2.811E-42)
            if (r0 != 0) goto L49
            com.kwad.library.solder.lib.ext.PluginError$LoadError r0 = new com.kwad.library.solder.lib.ext.PluginError$LoadError
            java.lang.String r2 = "not pluginInfo"
            r0.<init>(r2, r1)
            b(r8, r0)
            return
        L49:
            java.util.List r2 = r8.Am()
            r3 = 0
            if (r2 == 0) goto L86
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L86
            java.util.Iterator r2 = r2.iterator()
        L5a:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L86
            java.lang.Object r4 = r2.next()
            com.kwad.library.solder.lib.c.a r4 = (com.kwad.library.solder.lib.c.a) r4
            java.lang.String r5 = r8.getVersion()
            java.lang.String r6 = r4.version
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L74
            r3 = r4
            goto L5a
        L74:
            com.kwad.library.solder.lib.a.d r5 = r8.zZ()
            com.kwad.library.solder.lib.a.b r5 = r5.zP()
            java.lang.String r6 = r8.Ad()
            java.lang.String r4 = r4.version
            r5.E(r6, r4)
            goto L5a
        L86:
            r2 = 2
            if (r3 != 0) goto Lc5
            android.content.Context r3 = r7.mContext
            boolean r3 = com.kwad.sdk.utils.ao.isWifiConnected(r3)
            if (r3 != 0) goto Lac
            boolean r3 = r0.arB
            if (r3 != 0) goto L9f
            boolean r0 = r0.arC
            if (r0 == 0) goto Lac
            int r0 = r8.Af()
            if (r0 <= 0) goto Lac
        L9f:
            com.kwad.library.solder.lib.ext.PluginError$NotWifiDownloadError r0 = new com.kwad.library.solder.lib.ext.PluginError$NotWifiDownloadError
            java.lang.String r1 = "It can be downloaded only on WiFi"
            r2 = 2007(0x7d7, float:2.812E-42)
            r0.<init>(r1, r2)
            b(r8, r0)
            return
        Lac:
            com.kwad.library.solder.lib.a.d r0 = r8.zZ()     // Catch: java.lang.Throwable -> Lbb
            com.kwad.library.solder.lib.a.f r0 = r0.zO()     // Catch: java.lang.Throwable -> Lbb
            boolean r0 = r0.k(r8)     // Catch: java.lang.Throwable -> Lbb
            if (r0 != 0) goto Le3
            return
        Lbb:
            r0 = move-exception
            com.kwad.library.solder.lib.ext.PluginError$UpdateError r2 = new com.kwad.library.solder.lib.ext.PluginError$UpdateError
            r2.<init>(r0, r1)
            b(r8, r2)
            return
        Lc5:
            com.kwad.library.solder.lib.a.d r0 = r8.zZ()
            com.kwad.library.solder.lib.a.b r0 = r0.zP()
            java.lang.String r1 = r3.arx
            java.lang.String r4 = r3.version
            java.lang.String r0 = r0.G(r1, r4)
            r8.bW(r0)
            r8.bX(r0)
            r8.ch(r2)
            java.lang.String r0 = r3.version
            r8.bS(r0)
        Le3:
            int r0 = r8.getState()
            if (r0 == r2) goto L105
            int r0 = r8.getState()
            r1 = 3
            if (r0 == r1) goto L105
            int r0 = r8.getState()
            r1 = 4
            if (r0 != r1) goto Lf8
            goto L105
        Lf8:
            com.kwad.library.solder.lib.ext.PluginError$InstallError r0 = new com.kwad.library.solder.lib.ext.PluginError$InstallError
            java.lang.String r1 = "state exception"
            r2 = 2002(0x7d2, float:2.805E-42)
            r0.<init>(r1, r2)
            b(r8, r0)
            return
        L105:
            java.lang.String r0 = r8.Ag()
            r8.Ad()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L11f
            com.kwad.library.solder.lib.ext.PluginError$LoadError r0 = new com.kwad.library.solder.lib.ext.PluginError$LoadError
            java.lang.String r1 = "path not found"
            r2 = 2009(0x7d9, float:2.815E-42)
            r0.<init>(r1, r2)
            b(r8, r0)
            return
        L11f:
            boolean r1 = r8.isCanceled()
            if (r1 == 0) goto L129
            f(r8)
            return
        L129:
            com.kwad.library.solder.lib.a.a r1 = r7.h(r8)     // Catch: java.lang.Throwable -> L137 com.kwad.library.solder.lib.ext.PluginError.InstallError -> L139 com.kwad.library.solder.lib.ext.PluginError.LoadError -> L13b
            r8.c(r1)     // Catch: java.lang.Throwable -> L137 com.kwad.library.solder.lib.ext.PluginError.InstallError -> L139 com.kwad.library.solder.lib.ext.PluginError.LoadError -> L13b
            r8.Ad()     // Catch: java.lang.Throwable -> L137 com.kwad.library.solder.lib.ext.PluginError.InstallError -> L139 com.kwad.library.solder.lib.ext.PluginError.LoadError -> L13b
            a(r8, r1)     // Catch: java.lang.Throwable -> L137 com.kwad.library.solder.lib.ext.PluginError.InstallError -> L139 com.kwad.library.solder.lib.ext.PluginError.LoadError -> L13b
            return
        L137:
            r1 = move-exception
            goto L13d
        L139:
            r0 = move-exception
            goto L16d
        L13b:
            r0 = move-exception
            goto L16d
        L13d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "load plugin failed, path = "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "PluginLoaderImpl"
            com.kwad.library.solder.lib.a.e(r2, r0, r1)
            com.kwad.library.solder.lib.ext.PluginError$InstallError r0 = new com.kwad.library.solder.lib.ext.PluginError$InstallError
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "load or install plugin failed:"
            r2.<init>(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r2 = 4004(0xfa4, float:5.611E-42)
            r0.<init>(r1, r2)
            b(r8, r0)
            return
        L16d:
            b(r8, r0)
            return
    }
}
