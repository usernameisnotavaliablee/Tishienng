package com.kwad.library.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a extends com.kwad.library.solder.lib.h {
    private com.kwad.library.b.a.b apS;
    private android.content.res.Resources apT;

    public a(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private com.kwad.library.b.a.b a(java.io.File r8, java.io.File r9) {
            r7 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto L26
            boolean r0 = r8.canRead()
            r1 = 1
            if (r0 != 0) goto L10
            r8.setReadable(r1)
        L10:
            boolean r0 = r8.canWrite()
            if (r0 != 0) goto L19
            r8.setWritable(r1)
        L19:
            boolean r0 = r8.canRead()
            if (r0 == 0) goto L25
            boolean r0 = r8.canWrite()
            if (r0 != 0) goto L26
        L25:
            r8 = 0
        L26:
            r3 = r8
            com.kwad.library.b.a.a r1 = new com.kwad.library.b.a.a
            java.lang.Class<com.kwad.library.b.a> r8 = com.kwad.library.b.a.class
            java.lang.ClassLoader r8 = r8.getClassLoader()
            dalvik.system.BaseDexClassLoader r8 = (dalvik.system.BaseDexClassLoader) r8
            r1.<init>(r8)
            com.kwad.library.b.a.b r0 = new com.kwad.library.b.a.b
            java.lang.String r2 = r9.getAbsolutePath()
            java.io.File r8 = r7.aqK
            java.lang.String r4 = r8.getAbsolutePath()
            com.kwad.library.solder.lib.c.b r8 = r7.aqQ
            java.util.List<java.lang.String> r5 = r8.arF
            java.util.List<java.lang.String> r6 = r8.arE
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
    }

    private java.io.File d(java.io.File r3) {
            r2 = this;
            java.io.File r0 = new java.io.File
            java.io.File r3 = r3.getParentFile()
            com.kwad.library.solder.lib.ext.c r1 = r2.aqp
            java.lang.String r1 = r1.Ap()
            r0.<init>(r3, r1)
            com.kwad.sdk.utils.w.Y(r0)
            return r0
    }

    public final android.content.res.Resources getResources() {
            r1 = this;
            android.content.res.Resources r0 = r1.apT
            return r0
    }

    @Override // com.kwad.library.solder.lib.h, com.kwad.library.solder.lib.g, com.kwad.library.solder.lib.a.a
    public final void i(android.content.Context r5, java.lang.String r6) {
            r4 = this;
            super.i(r5, r6)
            java.io.File r0 = new java.io.File
            r0.<init>(r6)
            java.io.File r1 = r4.d(r0)     // Catch: java.io.IOException -> L49
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L22
            r3 = 34
            if (r2 < r3) goto L22
            if (r5 == 0) goto L22
            android.content.pm.ApplicationInfo r2 = r5.getApplicationInfo()     // Catch: java.lang.Throwable -> L22
            int r2 = r2.targetSdkVersion     // Catch: java.lang.Throwable -> L22
            if (r2 < r3) goto L22
            r0.setReadOnly()     // Catch: java.lang.Throwable -> L22
            r1.setReadOnly()     // Catch: java.lang.Throwable -> L22
        L22:
            com.kwad.library.b.a.b r0 = r4.a(r1, r0)
            r4.apS = r0
            android.content.res.Resources r0 = r5.getResources()     // Catch: java.lang.Exception -> L3d
            android.content.res.Resources r5 = com.kwad.library.b.b.a.a(r5, r0, r6)     // Catch: java.lang.Exception -> L3d
            r4.apT = r5     // Catch: java.lang.Exception -> L3d
            com.kwad.library.b.a.b r5 = r4.apS
            java.util.Objects.toString(r5)
            android.content.res.Resources r5 = r4.apT
            java.util.Objects.toString(r5)
            return
        L3d:
            r5 = move-exception
            android.util.Log.getStackTraceString(r5)
            com.kwad.library.solder.lib.ext.PluginError$LoadError r6 = new com.kwad.library.solder.lib.ext.PluginError$LoadError
            r0 = 4006(0xfa6, float:5.614E-42)
            r6.<init>(r5, r0)
            throw r6
        L49:
            r5 = move-exception
            com.kwad.library.solder.lib.ext.PluginError$LoadError r6 = new com.kwad.library.solder.lib.ext.PluginError$LoadError
            r0 = 4002(0xfa2, float:5.608E-42)
            r6.<init>(r5, r0)
            throw r6
    }

    public final com.kwad.library.b.a.b zI() {
            r1 = this;
            com.kwad.library.b.a.b r0 = r1.apS
            return r0
    }
}
