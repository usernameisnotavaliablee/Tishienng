package com.kwad.library.solder.lib;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class h extends com.kwad.library.solder.lib.g {
    public h(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private java.util.Set<java.io.File> a(android.content.Context r6, java.io.File r7, java.io.File r8) {
            r5 = this;
            java.util.Objects.toString(r8)
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            boolean r0 = r8.exists()
            if (r0 == 0) goto L41
            java.lang.String[] r0 = r8.list()
            if (r0 == 0) goto L41
            int r1 = r0.length
            if (r1 <= 0) goto L41
            r7 = 0
        L18:
            int r1 = r0.length
            if (r7 >= r1) goto L40
            r1 = r0[r7]
            java.io.File r2 = new java.io.File
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r8.getAbsolutePath()
            r3.append(r4)
            java.lang.String r4 = java.io.File.separator
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            r6.add(r2)
            int r7 = r7 + 1
            goto L18
        L40:
            return r6
        L41:
            java.io.File r0 = new java.io.File
            java.io.File r1 = r8.getParentFile()
            com.kwad.library.solder.lib.ext.c r2 = r5.aqp
            java.lang.String r2 = r2.Ar()
            r0.<init>(r1, r2)
            com.kwad.sdk.utils.w.Y(r0)
            java.util.Set r7 = com.kwad.library.solder.lib.d.c.b(r7, r0)
            java.util.Iterator r7 = r7.iterator()
        L5b:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L71
            java.lang.Object r1 = r7.next()
            java.lang.String r1 = (java.lang.String) r1
            java.io.File r1 = com.kwad.library.solder.lib.d.c.a(r0, r1, r8)
            if (r1 == 0) goto L5b
            r6.add(r1)
            goto L5b
        L71:
            com.kwad.sdk.utils.w.T(r0)
            return r6
    }

    private void c(java.util.Set<java.io.File> r8) {
            r7 = this;
            com.kwad.library.solder.lib.c.b r0 = r7.aqQ
            if (r0 == 0) goto Lab
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r0.arD
            int r0 = r0.size()
            if (r0 <= 0) goto Lab
            if (r8 == 0) goto Lab
            com.kwad.library.solder.lib.c.b r0 = r7.aqQ
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r0.arD
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lab
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L1a
            java.util.Iterator r3 = r8.iterator()
        L3c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L8d
            java.lang.Object r4 = r3.next()
            java.io.File r4 = (java.io.File) r4
            java.lang.String r5 = com.kwad.sdk.utils.al.getFileMD5Digest(r4)
            java.lang.String r6 = r4.getName()
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L3c
            boolean r2 = android.text.TextUtils.equals(r5, r1)
            if (r2 == 0) goto L5d
            goto L1a
        L5d:
            d(r8)
            com.kwad.library.solder.lib.ext.PluginError$LoadError r8 = new com.kwad.library.solder.lib.ext.PluginError$LoadError
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r4.getName()
            r2.append(r3)
            java.lang.String r3 = " Md5 check error,find "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r3 = ",except "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            r1 = 4008(0xfa8, float:5.616E-42)
            r8.<init>(r0, r1)
            throw r8
        L8d:
            com.kwad.library.solder.lib.ext.PluginError$LoadError r8 = new com.kwad.library.solder.lib.ext.PluginError$LoadError
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r2 = " not found"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r1 = 4001(0xfa1, float:5.607E-42)
            r8.<init>(r0, r1)
            throw r8
        Lab:
            return
    }

    private static void d(java.util.Set<java.io.File> r1) {
            java.util.Iterator r1 = r1.iterator()
        L4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L14
            java.lang.Object r0 = r1.next()
            java.io.File r0 = (java.io.File) r0
            com.kwad.sdk.utils.w.T(r0)
            goto L4
        L14:
            return
    }

    private java.io.File f(java.io.File r3) {
            r2 = this;
            java.io.File r0 = new java.io.File
            java.io.File r3 = r3.getParentFile()
            com.kwad.library.solder.lib.ext.c r1 = r2.aqp
            java.lang.String r1 = r1.Aq()
            r0.<init>(r3, r1)
            com.kwad.sdk.utils.w.Y(r0)
            return r0
    }

    @Override // com.kwad.library.solder.lib.g, com.kwad.library.solder.lib.a.a
    public void i(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            super.i(r3, r4)
            r2.getId()
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            java.io.File r4 = r2.f(r0)     // Catch: java.io.IOException -> L4e
            r2.aqK = r4     // Catch: java.io.IOException -> L4e
            r1 = 4004(0xfa4, float:5.611E-42)
            java.util.Set r3 = r2.a(r3, r0, r4)     // Catch: java.io.IOException -> L47
            r2.c(r3)     // Catch: com.kwad.library.solder.lib.ext.PluginError.LoadError -> L42
            com.kwad.library.solder.lib.c.b r3 = r2.aqQ
            if (r3 == 0) goto L23
            java.lang.ClassLoader r3 = r3.arG
            if (r3 == 0) goto L23
            goto L2b
        L23:
            java.lang.Class r3 = r2.getClass()
            java.lang.ClassLoader r3 = r3.getClassLoader()
        L2b:
            java.lang.Runtime r4 = java.lang.Runtime.getRuntime()
            monitor-enter(r4)
            java.io.File r0 = r2.aqK     // Catch: java.lang.Throwable -> L39
            com.kwad.library.solder.lib.ext.d.c(r3, r0)     // Catch: java.lang.Throwable -> L39
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L37
            return
        L37:
            r3 = move-exception
            goto L40
        L39:
            r3 = move-exception
            com.kwad.library.solder.lib.ext.PluginError$LoadError r0 = new com.kwad.library.solder.lib.ext.PluginError$LoadError     // Catch: java.lang.Throwable -> L37
            r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> L37
            throw r0     // Catch: java.lang.Throwable -> L37
        L40:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L37
            throw r3
        L42:
            r3 = move-exception
            com.kwad.sdk.utils.w.T(r0)
            throw r3
        L47:
            r3 = move-exception
            com.kwad.library.solder.lib.ext.PluginError$LoadError r4 = new com.kwad.library.solder.lib.ext.PluginError$LoadError
            r4.<init>(r3, r1)
            throw r4
        L4e:
            r3 = move-exception
            com.kwad.library.solder.lib.ext.PluginError$LoadError r4 = new com.kwad.library.solder.lib.ext.PluginError$LoadError
            r0 = 4003(0xfa3, float:5.61E-42)
            r4.<init>(r3, r0)
            throw r4
    }
}
