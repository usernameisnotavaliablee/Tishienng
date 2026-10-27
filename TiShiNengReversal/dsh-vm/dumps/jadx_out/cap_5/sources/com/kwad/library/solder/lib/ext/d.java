package com.kwad.library.solder.lib.ext;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"LongLogTag"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        private static void d(java.lang.ClassLoader r8, java.io.File r9) {
                java.lang.String r0 = "pathList"
                java.lang.reflect.Field r0 = com.kwad.library.solder.lib.ext.e.c(r8, r0)
                java.lang.Object r8 = r0.get(r8)
                java.lang.String r0 = "nativeLibraryDirectories"
                java.lang.reflect.Field r0 = com.kwad.library.solder.lib.ext.e.c(r8, r0)
                java.lang.Object r1 = r0.get(r8)
                java.io.File[] r1 = (java.io.File[]) r1
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                int r3 = r1.length
                r4 = 0
                r5 = 0
            L1e:
                if (r5 >= r3) goto L2e
                r6 = r1[r5]
                boolean r7 = r9.equals(r6)
                if (r7 != 0) goto L2b
                r2.add(r6)
            L2b:
                int r5 = r5 + 1
                goto L1e
            L2e:
                r2.add(r9)
                java.io.File[] r9 = new java.io.File[r4]
                java.lang.Object[] r9 = r2.toArray(r9)
                r0.set(r8, r9)
                return
        }

        static /* synthetic */ void e(java.lang.ClassLoader r0, java.io.File r1) {
                d(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b {
        public b() {
                r1 = this;
                r1.<init>()
                return
        }

        private static void d(java.lang.ClassLoader r7, java.io.File r8) {
                java.lang.String r0 = "pathList"
                java.lang.reflect.Field r0 = com.kwad.library.solder.lib.ext.e.c(r7, r0)
                java.lang.Object r7 = r0.get(r7)
                java.lang.String r0 = "nativeLibraryDirectories"
                java.lang.reflect.Field r1 = com.kwad.library.solder.lib.ext.e.c(r7, r0)
                java.lang.Object r2 = r1.get(r7)
                java.util.List r2 = (java.util.List) r2
                r3 = 2
                if (r2 != 0) goto L1e
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>(r3)
            L1e:
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>(r2)
                java.util.Iterator r2 = r4.iterator()
            L27:
                boolean r5 = r2.hasNext()
                if (r5 == 0) goto L3b
                java.lang.Object r5 = r2.next()
                java.io.File r5 = (java.io.File) r5
                boolean r5 = r8.equals(r5)
                if (r5 == 0) goto L27
                goto Lb5
            L3b:
                r4.add(r8)
                r1.set(r7, r4)
                java.lang.Object r8 = r1.get(r7)
                if (r8 == r4) goto L4e
                java.lang.reflect.Field r8 = com.kwad.library.solder.lib.ext.e.d(r7, r0)
                r8.set(r7, r4)
            L4e:
                java.lang.String r8 = "systemNativeLibraryDirectories"
                java.lang.reflect.Field r8 = com.kwad.library.solder.lib.ext.e.c(r7, r8)
                java.lang.Object r8 = r8.get(r7)
                java.util.List r8 = (java.util.List) r8
                if (r8 != 0) goto L61
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>(r3)
            L61:
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r4.size()
                int r2 = r8.size()
                int r1 = r1 + r2
                r2 = 1
                int r1 = r1 + r2
                r0.<init>(r1)
                r0.addAll(r4)
                r0.addAll(r8)
                r8 = 3
                java.lang.Class[] r1 = new java.lang.Class[r8]
                r4 = 0
                java.lang.Class<java.util.List> r5 = java.util.List.class
                r1[r4] = r5
                java.lang.Class<java.io.File> r6 = java.io.File.class
                r1[r2] = r6
                r1[r3] = r5
                java.lang.String r5 = "makePathElements"
                java.lang.reflect.Method r1 = com.kwad.library.solder.lib.ext.e.b(r7, r5, r1)
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.lang.Object[] r8 = new java.lang.Object[r8]
                r8[r4] = r0
                r0 = 0
                r8[r2] = r0
                r8[r3] = r5
                java.lang.Object r8 = r1.invoke(r7, r8)
                java.lang.Object[] r8 = (java.lang.Object[]) r8
                java.lang.String r0 = "nativeLibraryPathElements"
                java.lang.reflect.Field r1 = com.kwad.library.solder.lib.ext.e.c(r7, r0)
                r1.set(r7, r8)
                java.lang.Object r1 = r1.get(r7)
                if (r1 == r8) goto Lb5
                java.lang.reflect.Field r0 = com.kwad.library.solder.lib.ext.e.d(r7, r0)
                r0.set(r7, r8)
            Lb5:
                return
        }

        static /* synthetic */ void f(java.lang.ClassLoader r0, java.io.File r1) {
                d(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class c {
        public c() {
                r1 = this;
                r1.<init>()
                return
        }

        private static void d(java.lang.ClassLoader r7, java.io.File r8) {
                java.lang.String r0 = "pathList"
                java.lang.reflect.Field r0 = com.kwad.library.solder.lib.ext.e.c(r7, r0)
                java.lang.Object r7 = r0.get(r7)
                java.lang.String r0 = "nativeLibraryDirectories"
                java.lang.reflect.Field r0 = com.kwad.library.solder.lib.ext.e.c(r7, r0)
                java.lang.Object r0 = r0.get(r7)
                java.util.List r0 = (java.util.List) r0
                r1 = 2
                if (r0 != 0) goto L1e
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r1)
            L1e:
                java.util.Iterator r2 = r0.iterator()
            L22:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L35
                java.lang.Object r3 = r2.next()
                java.io.File r3 = (java.io.File) r3
                boolean r3 = r8.equals(r3)
                if (r3 == 0) goto L22
                return
            L35:
                r0.add(r8)
                java.lang.String r8 = "systemNativeLibraryDirectories"
                java.lang.reflect.Field r8 = com.kwad.library.solder.lib.ext.e.c(r7, r8)
                java.lang.Object r8 = r8.get(r7)
                java.util.List r8 = (java.util.List) r8
                if (r8 != 0) goto L4b
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>(r1)
            L4b:
                java.util.ArrayList r2 = new java.util.ArrayList
                int r3 = r0.size()
                int r4 = r8.size()
                int r3 = r3 + r4
                r4 = 1
                int r3 = r3 + r4
                r2.<init>(r3)
                r2.addAll(r0)
                r2.addAll(r8)
                r8 = 3
                java.lang.Class[] r0 = new java.lang.Class[r8]
                r3 = 0
                java.lang.Class<java.util.List> r5 = java.util.List.class
                r0[r3] = r5
                java.lang.Class<java.io.File> r6 = java.io.File.class
                r0[r4] = r6
                r0[r1] = r5
                java.lang.String r5 = "makePathElements"
                java.lang.reflect.Method r0 = com.kwad.library.solder.lib.ext.e.b(r7, r5, r0)
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.lang.Object[] r8 = new java.lang.Object[r8]
                r8[r3] = r2
                r2 = 0
                r8[r4] = r2
                r8[r1] = r5
                java.lang.Object r8 = r0.invoke(r7, r8)
                java.lang.Object[] r8 = (java.lang.Object[]) r8
                java.lang.String r0 = "nativeLibraryPathElements"
                java.lang.reflect.Field r0 = com.kwad.library.solder.lib.ext.e.c(r7, r0)
                r0.set(r7, r8)
                return
        }

        static /* synthetic */ void g(java.lang.ClassLoader r0, java.io.File r1) {
                d(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.library.solder.lib.ext.d$d, reason: collision with other inner class name */
    static final class C0124d {
        public C0124d() {
                r1 = this;
                r1.<init>()
                return
        }

        private static void d(java.lang.ClassLoader r4, java.io.File r5) {
                java.lang.String r0 = "pathList"
                java.lang.reflect.Field r0 = com.kwad.library.solder.lib.ext.e.c(r4, r0)
                java.lang.Object r4 = r0.get(r4)
                java.lang.String r0 = "nativeLibraryDirectories"
                java.lang.reflect.Field r0 = com.kwad.library.solder.lib.ext.e.c(r4, r0)
                java.lang.Object r0 = r0.get(r4)
                java.util.List r0 = (java.util.List) r0
                r1 = 2
                if (r0 != 0) goto L1e
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r1)
            L1e:
                java.util.Iterator r2 = r0.iterator()
            L22:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L35
                java.lang.Object r3 = r2.next()
                java.io.File r3 = (java.io.File) r3
                boolean r3 = r5.equals(r3)
                if (r3 == 0) goto L22
                return
            L35:
                r0.add(r5)
                java.lang.String r5 = "systemNativeLibraryDirectories"
                java.lang.reflect.Field r5 = com.kwad.library.solder.lib.ext.e.c(r4, r5)
                java.lang.Object r5 = r5.get(r4)
                java.util.List r5 = (java.util.List) r5
                if (r5 != 0) goto L4b
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>(r1)
            L4b:
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.size()
                int r3 = r5.size()
                int r2 = r2 + r3
                r3 = 1
                int r2 = r2 + r3
                r1.<init>(r2)
                r1.addAll(r0)
                r1.addAll(r5)
                java.lang.Class[] r5 = new java.lang.Class[r3]
                java.lang.Class<java.util.List> r0 = java.util.List.class
                r2 = 0
                r5[r2] = r0
                java.lang.String r0 = "makePathElements"
                java.lang.reflect.Method r5 = com.kwad.library.solder.lib.ext.e.b(r4, r0, r5)
                java.lang.Object[] r0 = new java.lang.Object[r3]
                r0[r2] = r1
                java.lang.Object r5 = r5.invoke(r4, r0)
                java.lang.Object[] r5 = (java.lang.Object[]) r5
                java.lang.String r0 = "nativeLibraryPathElements"
                java.lang.reflect.Field r0 = com.kwad.library.solder.lib.ext.e.c(r4, r0)
                r0.set(r4, r5)
                return
        }

        static /* synthetic */ void h(java.lang.ClassLoader r0, java.io.File r1) {
                d(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class e {
        public e() {
                r1 = this;
                r1.<init>()
                return
        }

        private static void d(java.lang.ClassLoader r4, java.io.File r5) {
                java.lang.String r5 = r5.getPath()
                java.lang.String r0 = "libPath"
                java.lang.reflect.Field r0 = com.kwad.library.solder.lib.ext.e.c(r4, r0)
                java.lang.Object r1 = r0.get(r4)
                java.lang.String r1 = java.lang.String.valueOf(r1)
                boolean r2 = android.text.TextUtils.isEmpty(r1)
                if (r2 != 0) goto L2d
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r1)
                java.lang.String r1 = ":"
                r2.append(r1)
                r2.append(r5)
                java.lang.String r1 = r2.toString()
                goto L2e
            L2d:
                r1 = r5
            L2e:
                r0.set(r4, r1)
                java.lang.String r0 = "libraryPathElements"
                java.lang.reflect.Field r0 = com.kwad.library.solder.lib.ext.e.c(r4, r0)
                java.lang.Object r1 = r0.get(r4)
                java.util.List r1 = (java.util.List) r1
                java.util.Iterator r2 = r1.iterator()
            L41:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L54
                java.lang.Object r3 = r2.next()
                java.lang.String r3 = (java.lang.String) r3
                boolean r3 = r5.equals(r3)
                if (r3 == 0) goto L41
                return
            L54:
                r1.add(r5)
                r0.set(r4, r1)
                return
        }

        static /* synthetic */ void i(java.lang.ClassLoader r0, java.io.File r1) {
                d(r0, r1)
                return
        }
    }

    public d() {
            r1 = this;
            r1.<init>()
            return
    }

    public static synchronized void c(java.lang.ClassLoader r9, java.io.File r10) {
            java.lang.Class<com.kwad.library.solder.lib.ext.d> r0 = com.kwad.library.solder.lib.ext.d.class
            monitor-enter(r0)
            r1 = 1
            r2 = 0
            if (r10 == 0) goto La2
            boolean r3 = r10.exists()     // Catch: java.lang.Throwable -> L1d
            if (r3 != 0) goto Lf
            goto La2
        Lf:
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L1d
            r4 = 2
            r5 = 25
            if (r3 != r5) goto L20
            int r6 = com.bytedance.pangle.transform.c.a()     // Catch: java.lang.Throwable -> L1d
            if (r6 != 0) goto L22
            goto L20
        L1d:
            r9 = move-exception
            goto Lb3
        L20:
            if (r3 <= r5) goto L48
        L22:
            com.kwad.library.solder.lib.ext.d.C0124d.h(r9, r10)     // Catch: java.lang.Throwable -> L27
            monitor-exit(r0)
            return
        L27:
            r3 = move-exception
            java.lang.String r5 = "Sodler.ShareLibraryLoader"
            java.lang.String r6 = "installNativeLibraryPath, v25 fail, sdk: %d, error: %s, try to fallback to V23"
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L1d
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> L1d
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L1d
            r4[r2] = r7     // Catch: java.lang.Throwable -> L1d
            r4[r1] = r3     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = java.lang.String.format(r6, r4)     // Catch: java.lang.Throwable -> L1d
            com.kwad.library.solder.lib.a.e(r5, r1)     // Catch: java.lang.Throwable -> L1d
            com.kwad.library.solder.lib.ext.d.b.f(r9, r10)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)
            return
        L48:
            r5 = 24
            if (r3 != r5) goto L72
            com.kwad.library.solder.lib.ext.d.c.g(r9, r10)     // Catch: java.lang.Throwable -> L51
            monitor-exit(r0)
            return
        L51:
            r3 = move-exception
            java.lang.String r5 = "Sodler.ShareLibraryLoader"
            java.lang.String r6 = "installNativeLibraryPath, v23 fail, sdk: %d, error: %s, try to fallback to V14"
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L1d
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r8 = r3.getMessage()     // Catch: java.lang.Throwable -> L1d
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L1d
            r4[r2] = r7     // Catch: java.lang.Throwable -> L1d
            r4[r1] = r8     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = java.lang.String.format(r6, r4)     // Catch: java.lang.Throwable -> L1d
            com.kwad.library.solder.lib.a.e(r5, r1)     // Catch: java.lang.Throwable -> L1d
            com.kwad.library.solder.lib.ext.d.a.e(r9, r10)     // Catch: java.lang.Throwable -> L71
            goto L9a
        L71:
            throw r3     // Catch: java.lang.Throwable -> L1d
        L72:
            r5 = 23
            if (r3 < r5) goto L9d
            com.kwad.library.solder.lib.ext.d.b.f(r9, r10)     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r0)
            return
        L7b:
            r3 = move-exception
            java.lang.String r5 = "Sodler.ShareLibraryLoader"
            java.lang.String r6 = "installNativeLibraryPath, v23 fail, sdk: %d, error: %s, try to fallback to V14"
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L1d
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r8 = r3.getMessage()     // Catch: java.lang.Throwable -> L1d
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L1d
            r4[r2] = r7     // Catch: java.lang.Throwable -> L1d
            r4[r1] = r8     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = java.lang.String.format(r6, r4)     // Catch: java.lang.Throwable -> L1d
            com.kwad.library.solder.lib.a.e(r5, r1)     // Catch: java.lang.Throwable -> L1d
            com.kwad.library.solder.lib.ext.d.a.e(r9, r10)     // Catch: java.lang.Throwable -> L9c
        L9a:
            monitor-exit(r0)
            return
        L9c:
            throw r3     // Catch: java.lang.Throwable -> L1d
        L9d:
            com.kwad.library.solder.lib.ext.d.a.e(r9, r10)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)
            return
        La2:
            java.lang.String r9 = "Sodler.ShareLibraryLoader"
            java.lang.String r3 = "installNativeLibraryPath, folder %s is illegal"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L1d
            r1[r2] = r10     // Catch: java.lang.Throwable -> L1d
            java.lang.String r10 = java.lang.String.format(r3, r1)     // Catch: java.lang.Throwable -> L1d
            com.kwad.library.solder.lib.a.e(r9, r10)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)
            return
        Lb3:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r9
    }
}
