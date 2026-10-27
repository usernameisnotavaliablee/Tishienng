package com.kwad.library.solder.lib;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class c implements com.kwad.library.solder.lib.a.b {
    private final java.io.File aqn;
    private final java.io.File aqo;
    private final com.kwad.library.solder.lib.ext.c aqp;
    private final android.content.Context mContext;

    c(android.content.Context r2, com.kwad.library.solder.lib.ext.c r3) {
            r1 = this;
            r1.<init>()
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            r1.mContext = r2
            r1.aqp = r3
            java.lang.String r3 = r3.Ao()
            r0 = 0
            java.io.File r3 = r2.getDir(r3, r0)
            r1.aqn = r3
            java.io.File r2 = r2.getCacheDir()
            r1.aqo = r2
            return
    }

    private java.lang.String F(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.zL()
            r0.append(r1)
            java.lang.String r1 = java.io.File.separator
            r0.append(r1)
            r0.append(r3)
            r0.append(r1)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            return r3
    }

    @androidx.annotation.Nullable
    private java.lang.String a(com.kwad.library.solder.lib.a.a r2) {
            r1 = this;
            java.lang.String r0 = r2.getId()
            java.lang.String r2 = r2.getVersion()
            java.lang.String r2 = r1.G(r0, r2)
            return r2
    }

    private static void delete(java.lang.String r0) {
            com.kwad.sdk.utils.w.delete(r0)
            return
    }

    private boolean i(java.lang.String r3, java.lang.String r4, boolean r5) {
            r2 = this;
            boolean r5 = com.kwad.sdk.utils.w.gR(r3)
            r0 = 0
            if (r5 != 0) goto L8
            return r0
        L8:
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            r1 = 1
            if (r5 == 0) goto L10
            return r1
        L10:
            java.lang.String r5 = com.kwad.sdk.utils.al.getFileMD5Digest(r3)
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            if (r4 != 0) goto L1e
            delete(r3)
            return r0
        L1e:
            return r1
    }

    private java.lang.String zL() {
            r1 = this;
            java.io.File r0 = r1.aqn
            java.lang.String r0 = r0.getAbsolutePath()
            return r0
    }

    @Override // com.kwad.library.solder.lib.a.b
    public final void E(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.io.File r0 = new java.io.File
            java.lang.String r2 = r1.F(r2, r3)
            r0.<init>(r2)
            boolean r2 = r0.exists()
            if (r2 != 0) goto L10
            return
        L10:
            com.kwad.sdk.utils.w.T(r0)
            return
    }

    @Override // com.kwad.library.solder.lib.a.b
    public final java.lang.String G(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.zL()
            r0.append(r1)
            java.lang.String r1 = java.io.File.separator
            r0.append(r1)
            r0.append(r3)
            r0.append(r1)
            r0.append(r4)
            r0.append(r1)
            com.kwad.library.solder.lib.ext.c r3 = r2.aqp
            java.lang.String r3 = r3.At()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    @Override // com.kwad.library.solder.lib.a.b
    public final boolean a(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            com.kwad.library.solder.lib.ext.c r0 = r1.aqp
            boolean r0 = r0.Au()
            if (r0 == 0) goto La
            r2 = 0
            return r2
        La:
            java.lang.String r2 = r1.G(r2, r3)
            r3 = 1
            boolean r2 = r1.i(r2, r4, r3)
            return r2
    }

    @Override // com.kwad.library.solder.lib.a.b
    public final java.lang.String b(com.kwad.library.solder.lib.a.a r8) {
            r7 = this;
            java.lang.String r0 = "PluginInstallerImpl"
            java.lang.String r1 = r7.a(r8)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto Lac
            r8.getId()
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            boolean r3 = r2.exists()
            r4 = 1
            if (r3 == 0) goto L32
            com.kwad.library.solder.lib.ext.c r3 = r7.aqp
            boolean r3 = r3.Au()
            if (r3 != 0) goto L32
            java.lang.String r3 = r2.getAbsolutePath()
            java.lang.String r5 = r8.zY()
            boolean r3 = r7.i(r3, r5, r4)
            if (r3 == 0) goto L32
            return r1
        L32:
            java.lang.String r3 = r8.zX()
            r8.getId()
            java.io.File r5 = new java.io.File
            r5.<init>(r3)
            boolean r6 = r5.exists()
            if (r6 == 0) goto La2
            r8.getId()
            java.lang.String r6 = r8.zY()
            boolean r4 = r7.i(r3, r6, r4)
            if (r4 == 0) goto L7d
            boolean r3 = r5.renameTo(r2)
            if (r3 == 0) goto L5b
            r8.getId()
            return r1
        L5b:
            r7.zK()     // Catch: java.lang.Throwable -> L71
            com.kwad.sdk.utils.w.f(r5, r2)     // Catch: java.lang.Throwable -> L65
            com.kwad.sdk.utils.w.T(r5)     // Catch: java.lang.Throwable -> L65
            return r1
        L65:
            r8 = move-exception
            com.kwad.library.solder.lib.a.e(r0, r8)
            com.kwad.library.solder.lib.ext.PluginError$InstallError r0 = new com.kwad.library.solder.lib.ext.PluginError$InstallError
            r1 = 3004(0xbbc, float:4.21E-42)
            r0.<init>(r8, r1)
            throw r0
        L71:
            r8 = move-exception
            com.kwad.library.solder.lib.a.e(r0, r8)
            com.kwad.library.solder.lib.ext.PluginError$InstallError r0 = new com.kwad.library.solder.lib.ext.PluginError$InstallError
            r1 = 3005(0xbbd, float:4.211E-42)
            r0.<init>(r8, r1)
            throw r0
        L7d:
            r8.zY()
            com.kwad.library.solder.lib.ext.PluginError$InstallError r0 = new com.kwad.library.solder.lib.ext.PluginError$InstallError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "check plugin md5 fail:"
            r1.<init>(r2)
            java.lang.String r8 = r8.zY()
            r1.append(r8)
            java.lang.String r8 = " "
            r1.append(r8)
            r1.append(r3)
            java.lang.String r8 = r1.toString()
            r1 = 3003(0xbbb, float:4.208E-42)
            r0.<init>(r8, r1)
            throw r0
        La2:
            com.kwad.library.solder.lib.ext.PluginError$InstallError r8 = new com.kwad.library.solder.lib.ext.PluginError$InstallError
            java.lang.String r0 = "Plugin file not exist."
            r1 = 3001(0xbb9, float:4.205E-42)
            r8.<init>(r0, r1)
            throw r8
        Lac:
            com.kwad.library.solder.lib.ext.PluginError$InstallError r8 = new com.kwad.library.solder.lib.ext.PluginError$InstallError
            java.lang.String r0 = "Can not get install path."
            r1 = 3006(0xbbe, float:4.212E-42)
            r8.<init>(r0, r1)
            throw r8
    }

    @Override // com.kwad.library.solder.lib.a.b
    public final void bN(java.lang.String r2) {
            r1 = this;
            java.io.File r0 = new java.io.File
            java.lang.String r2 = r1.bO(r2)
            r0.<init>(r2)
            boolean r2 = r0.exists()
            if (r2 != 0) goto L10
            return
        L10:
            com.kwad.sdk.utils.w.T(r0)
            return
    }

    @Override // com.kwad.library.solder.lib.a.b
    public final java.lang.String bO(@androidx.annotation.NonNull java.lang.String r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.zL()
            r0.append(r1)
            java.lang.String r1 = java.io.File.separator
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    @Override // com.kwad.library.solder.lib.a.b
    public final java.io.File e(java.lang.String r3, boolean r4) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r3 = com.kwad.library.solder.lib.d.b.getMD5(r3)
            if (r3 != 0) goto Lb
            return r0
        Lb:
            if (r4 == 0) goto L3f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            com.kwad.library.solder.lib.ext.c r3 = r2.aqp
            java.lang.String r3 = r3.As()
            if (r3 == 0) goto L26
            com.kwad.library.solder.lib.ext.c r3 = r2.aqp
            java.lang.String r3 = r3.As()
            r4.append(r3)
        L26:
            java.io.File r3 = new java.io.File
            java.io.File r1 = r2.aqo
            java.lang.String r4 = r4.toString()
            r3.<init>(r1, r4)
            boolean r4 = r3.exists()
            if (r4 != 0) goto L3e
            boolean r4 = r3.createNewFile()
            if (r4 != 0) goto L3e
            return r0
        L3e:
            return r3
        L3f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            long r0 = java.lang.System.currentTimeMillis()
            r4.append(r0)
            java.lang.String r3 = r4.toString()
            com.kwad.library.solder.lib.ext.c r4 = r2.aqp
            java.lang.String r4 = r4.As()
            java.io.File r0 = r2.aqo
            java.io.File r3 = java.io.File.createTempFile(r3, r4, r0)
            return r3
    }

    @Override // com.kwad.library.solder.lib.a.b
    public final void zK() {
            r5 = this;
            java.io.File r0 = r5.aqn
            long r0 = r0.getFreeSpace()
            r2 = 10000000(0x989680, double:4.9406565E-317)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto Le
            return
        Le:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "No enough capacity."
            r0.<init>(r1)
            throw r0
    }
}
