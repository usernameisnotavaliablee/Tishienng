package com.kwad.library.solder.lib;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class f implements com.kwad.library.solder.lib.a.f {
    private com.kwad.library.solder.lib.a.f.a aqC;
    private final android.content.Context mContext;

    f(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            r0.mContext = r1
            return
    }

    private static void a(com.kwad.library.solder.lib.a.e r1, com.kwad.library.solder.lib.ext.PluginError.UpdateError r2) {
            r1.getState()
            r0 = 1
            r1.ch(r0)
            r1.j(r2)
            com.kwad.library.solder.lib.a.d r0 = r1.zZ()
            com.kwad.library.solder.lib.ext.a r0 = r0.zQ()
            r0.c(r1, r2)
            return
    }

    private void a(com.kwad.library.solder.lib.a.e r2, java.io.File r3) {
            r1 = this;
            java.lang.System.currentTimeMillis()
            r2.Ad()
            com.kwad.library.solder.lib.a.f$a r0 = r1.aqC
            if (r0 == 0) goto L14
            r0.a(r2, r3)
            java.lang.System.currentTimeMillis()
            r2.Ad()
            return
        L14:
            com.kwad.library.solder.lib.ext.PluginError$UpdateError r2 = new com.kwad.library.solder.lib.ext.PluginError$UpdateError
            java.lang.String r3 = "update "
            r0 = 2008(0x7d8, float:2.814E-42)
            r2.<init>(r3, r0)
            throw r2
    }

    private static void e(com.kwad.library.solder.lib.a.e r1) {
            r1.getState()
            com.kwad.library.solder.lib.a.d r0 = r1.zZ()
            com.kwad.library.solder.lib.ext.a r0 = r0.zQ()
            r0.o(r1)
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

    private static void l(com.kwad.library.solder.lib.a.e r1) {
            r1.getState()
            com.kwad.library.solder.lib.a.d r0 = r1.zZ()
            com.kwad.library.solder.lib.ext.a r0 = r0.zQ()
            r0.p(r1)
            return
    }

    @Override // com.kwad.library.solder.lib.a.f
    public final com.kwad.library.solder.lib.a.f a(com.kwad.library.solder.lib.a.f.a r1) {
            r0 = this;
            r0.aqC = r1
            return r0
    }

    @Override // com.kwad.library.solder.lib.a.f
    public final boolean k(@androidx.annotation.NonNull com.kwad.library.solder.lib.a.e r8) {
            r7 = this;
            java.lang.String r0 = "PluginUpdaterImpl"
            r8.Ad()
            java.lang.String r1 = "Update"
            r8.bV(r1)
            e(r8)
            boolean r1 = r8.Ae()
            if (r1 == 0) goto L22
            com.kwad.library.solder.lib.a.d r1 = r8.zZ()
            com.kwad.library.solder.lib.a.b r1 = r1.zP()
            java.lang.String r2 = r8.Ad()
            r1.bN(r2)
        L22:
            boolean r1 = r8.isCanceled()
            r2 = 0
            if (r1 == 0) goto L2d
            f(r8)
            return r2
        L2d:
            com.kwad.library.solder.lib.a.d r1 = r8.zZ()     // Catch: java.lang.Throwable -> L12c
            com.kwad.library.solder.lib.a.b r1 = r1.zP()     // Catch: java.lang.Throwable -> L12c
            r1.zK()     // Catch: java.lang.Throwable -> L12c
            boolean r1 = r8.Ai()
            r3 = 1
            r4 = 2003(0x7d3, float:2.807E-42)
            if (r1 == 0) goto L8f
            com.kwad.library.solder.lib.a.d r1 = r8.zZ()     // Catch: java.lang.Throwable -> L82
            com.kwad.library.solder.lib.a.b r1 = r1.zP()     // Catch: java.lang.Throwable -> L82
            java.lang.String r5 = r8.Aj()     // Catch: java.lang.Throwable -> L82
            java.io.File r1 = r1.e(r5, r2)     // Catch: java.lang.Throwable -> L82
            boolean r4 = r8.isCanceled()
            if (r4 == 0) goto L5b
            f(r8)
            return r2
        L5b:
            android.content.Context r2 = r7.mContext     // Catch: java.lang.Throwable -> L73
            java.lang.String r4 = r8.Aj()     // Catch: java.lang.Throwable -> L73
            com.kwad.sdk.utils.w.a(r2, r4, r1)     // Catch: java.lang.Throwable -> L73
            java.lang.String r1 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> L73
            r8.bW(r1)     // Catch: java.lang.Throwable -> L73
            r1 = 3
            r8.ch(r1)     // Catch: java.lang.Throwable -> L73
            l(r8)     // Catch: java.lang.Throwable -> L73
            goto Lea
        L73:
            r1 = move-exception
            com.kwad.library.solder.lib.a.e(r0, r1)
            com.kwad.library.solder.lib.ext.PluginError$UpdateError r0 = new com.kwad.library.solder.lib.ext.PluginError$UpdateError
            r2 = 2004(0x7d4, float:2.808E-42)
            r0.<init>(r1, r2)
            a(r8, r0)
            goto Lea
        L82:
            r0 = move-exception
            r0.getLocalizedMessage()
            com.kwad.library.solder.lib.ext.PluginError$UpdateError r1 = new com.kwad.library.solder.lib.ext.PluginError$UpdateError
            r1.<init>(r0, r4)
            a(r8, r1)
            return r2
        L8f:
            r8.Ad()
            r8.getDownloadUrl()
            com.kwad.library.solder.lib.a.d r1 = r8.zZ()     // Catch: java.lang.Throwable -> L10d
            com.kwad.library.solder.lib.a.b r1 = r1.zP()     // Catch: java.lang.Throwable -> L10d
            java.lang.String r5 = r8.getDownloadUrl()     // Catch: java.lang.Throwable -> L10d
            com.kwad.library.solder.lib.a.d r6 = r8.zZ()     // Catch: java.lang.Throwable -> L10d
            com.kwad.library.solder.lib.ext.c r6 = r6.zM()     // Catch: java.lang.Throwable -> L10d
            boolean r6 = r6.Av()     // Catch: java.lang.Throwable -> L10d
            java.io.File r1 = r1.e(r5, r6)     // Catch: java.lang.Throwable -> L10d
            java.lang.String r4 = r8.Ak()
            r5 = 4
            if (r4 == 0) goto Lda
            boolean r4 = r1.exists()
            if (r4 == 0) goto Lda
            java.lang.String r4 = com.kwad.sdk.utils.al.getFileMD5Digest(r1)
            java.lang.String r6 = r8.Ak()
            boolean r4 = android.text.TextUtils.equals(r4, r6)
            if (r4 == 0) goto Lda
            java.lang.String r0 = r1.getAbsolutePath()
            r8.bW(r0)
            r8.ch(r5)
            l(r8)
            return r3
        Lda:
            r7.a(r8, r1)     // Catch: com.kwad.library.solder.lib.ext.PluginError.UpdateError -> Leb com.kwad.library.solder.lib.ext.PluginError.CancelError -> Led
            java.lang.String r1 = r1.getAbsolutePath()     // Catch: com.kwad.library.solder.lib.ext.PluginError.UpdateError -> Leb com.kwad.library.solder.lib.ext.PluginError.CancelError -> Led
            r8.bW(r1)     // Catch: com.kwad.library.solder.lib.ext.PluginError.UpdateError -> Leb com.kwad.library.solder.lib.ext.PluginError.CancelError -> Led
            r8.ch(r5)     // Catch: com.kwad.library.solder.lib.ext.PluginError.UpdateError -> Leb com.kwad.library.solder.lib.ext.PluginError.CancelError -> Led
            l(r8)     // Catch: com.kwad.library.solder.lib.ext.PluginError.UpdateError -> Leb com.kwad.library.solder.lib.ext.PluginError.CancelError -> Led
        Lea:
            return r3
        Leb:
            r1 = move-exception
            goto Lf1
        Led:
            f(r8)
            return r2
        Lf1:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Download plugin fail, error = "
            r3.<init>(r4)
            java.lang.String r4 = r1.getLocalizedMessage()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.kwad.library.solder.lib.a.e(r0, r3)
            r8.j(r1)
            a(r8, r1)
            return r2
        L10d:
            r1 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Can not get temp file, error = "
            r3.<init>(r5)
            java.lang.String r5 = r1.getLocalizedMessage()
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            com.kwad.library.solder.lib.a.e(r0, r3)
            com.kwad.library.solder.lib.ext.PluginError$UpdateError r0 = new com.kwad.library.solder.lib.ext.PluginError$UpdateError
            r0.<init>(r1, r4)
            a(r8, r0)
            return r2
        L12c:
            r1 = move-exception
            com.kwad.library.solder.lib.a.e(r0, r1)
            com.kwad.library.solder.lib.ext.PluginError$UpdateError r0 = new com.kwad.library.solder.lib.ext.PluginError$UpdateError
            r3 = 2005(0x7d5, float:2.81E-42)
            r0.<init>(r1, r3)
            a(r8, r0)
            return r2
    }
}
