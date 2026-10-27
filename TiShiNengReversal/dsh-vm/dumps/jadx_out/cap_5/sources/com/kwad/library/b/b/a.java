package com.kwad.library.b.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a {
    private static java.util.Map<java.lang.String, android.content.res.Resources> apZ;
    private static final java.lang.Object aqa = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.library.b.b.a$a, reason: collision with other inner class name */
    static final class C0120a {
        public C0120a() {
                r1 = this;
                r1.<init>()
                return
        }

        private static android.content.res.Resources a(android.content.res.Resources r5, android.content.res.AssetManager r6) {
                java.lang.Class r0 = r5.getClass()     // Catch: java.lang.Exception -> L29
                android.util.DisplayMetrics r1 = r5.getDisplayMetrics()     // Catch: java.lang.Exception -> L29
                android.content.res.Configuration r2 = r5.getConfiguration()     // Catch: java.lang.Exception -> L29
                r3 = 3
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L29
                r4 = 0
                r3[r4] = r6     // Catch: java.lang.Exception -> L29
                r4 = 1
                r3[r4] = r1     // Catch: java.lang.Exception -> L29
                r1 = 2
                r3[r1] = r2     // Catch: java.lang.Exception -> L29
                java.lang.Object r0 = com.kwad.sdk.utils.z.a(r0, r3)     // Catch: java.lang.Exception -> L29
                android.content.res.Resources r0 = (android.content.res.Resources) r0     // Catch: java.lang.Exception -> L29
                if (r0 == 0) goto L21
                return r0
            L21:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Exception -> L29
                java.lang.String r1 = "Can not create Resources"
                r0.<init>(r1)     // Catch: java.lang.Exception -> L29
                throw r0     // Catch: java.lang.Exception -> L29
            L29:
                android.content.res.Resources r0 = new android.content.res.Resources
                android.util.DisplayMetrics r1 = r5.getDisplayMetrics()
                android.content.res.Configuration r5 = r5.getConfiguration()
                r0.<init>(r6, r1, r5)
                return r0
        }

        static /* synthetic */ android.content.res.Resources b(android.content.res.Resources r0, android.content.res.AssetManager r1) {
                android.content.res.Resources r0 = a(r0, r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b {
        public b() {
                r1 = this;
                r1.<init>()
                return
        }

        private static android.content.res.Resources a(android.content.res.Resources r2, android.content.res.AssetManager r3) {
                android.content.res.Resources r2 = c(r2, r3)     // Catch: java.lang.Exception -> L5
                return r2
            L5:
                android.content.res.Resources r2 = com.kwad.library.b.b.a.C0120a.b(r2, r3)     // Catch: java.lang.Exception -> La
                return r2
            La:
                android.content.res.Resources r0 = new android.content.res.Resources
                android.util.DisplayMetrics r1 = r2.getDisplayMetrics()
                android.content.res.Configuration r2 = r2.getConfiguration()
                r0.<init>(r3, r1, r2)
                return r0
        }

        private static android.content.res.Resources c(android.content.res.Resources r3, android.content.res.AssetManager r4) {
                android.util.DisplayMetrics r0 = r3.getDisplayMetrics()
                android.content.res.Configuration r3 = r3.getConfiguration()
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                r1[r2] = r4
                r4 = 1
                r1[r4] = r0
                r4 = 2
                r1[r4] = r3
                java.lang.String r3 = "android.content.res.HwResources"
                java.lang.Object r3 = com.kwad.sdk.utils.z.newInstance(r3, r1)
                android.content.res.Resources r3 = (android.content.res.Resources) r3
                if (r3 == 0) goto L1f
                return r3
            L1f:
                java.lang.RuntimeException r3 = new java.lang.RuntimeException
                java.lang.String r4 = "Can not create Resources"
                r3.<init>(r4)
                throw r3
        }

        static /* synthetic */ android.content.res.Resources d(android.content.res.Resources r0, android.content.res.AssetManager r1) {
                android.content.res.Resources r0 = a(r0, r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class c {
        public c() {
                r1 = this;
                r1.<init>()
                return
        }

        private static android.content.res.Resources a(android.content.res.Resources r2, android.content.res.AssetManager r3) {
                android.content.res.Resources r2 = e(r2, r3)     // Catch: java.lang.Exception -> L5
                return r2
            L5:
                android.content.res.Resources r2 = com.kwad.library.b.b.a.C0120a.b(r2, r3)     // Catch: java.lang.Exception -> La
                return r2
            La:
                android.content.res.Resources r0 = new android.content.res.Resources
                android.util.DisplayMetrics r1 = r2.getDisplayMetrics()
                android.content.res.Configuration r2 = r2.getConfiguration()
                r0.<init>(r3, r1, r2)
                return r0
        }

        private static android.content.res.Resources e(android.content.res.Resources r3, android.content.res.AssetManager r4) {
                android.util.DisplayMetrics r0 = r3.getDisplayMetrics()
                android.content.res.Configuration r3 = r3.getConfiguration()
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                r1[r2] = r4
                r4 = 1
                r1[r4] = r0
                r4 = 2
                r1[r4] = r3
                java.lang.String r3 = "android.content.res.MiuiResourcesImpl"
                java.lang.Object r3 = com.kwad.sdk.utils.z.newInstance(r3, r1)
                android.content.res.Resources r3 = (android.content.res.Resources) r3
                if (r3 == 0) goto L1f
                return r3
            L1f:
                java.lang.RuntimeException r3 = new java.lang.RuntimeException
                java.lang.String r4 = "Can not create Resources"
                r3.<init>(r4)
                throw r3
        }

        static /* synthetic */ android.content.res.Resources f(android.content.res.Resources r0, android.content.res.AssetManager r1) {
                android.content.res.Resources r0 = a(r0, r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class d {
        public d() {
                r1 = this;
                r1.<init>()
                return
        }

        private static android.content.res.Resources a(android.content.res.Resources r2, android.content.res.AssetManager r3) {
                android.content.res.Resources r2 = g(r2, r3)     // Catch: java.lang.Exception -> L5
                return r2
            L5:
                android.content.res.Resources r2 = com.kwad.library.b.b.a.C0120a.b(r2, r3)     // Catch: java.lang.Exception -> La
                return r2
            La:
                android.content.res.Resources r0 = new android.content.res.Resources
                android.util.DisplayMetrics r1 = r2.getDisplayMetrics()
                android.content.res.Configuration r2 = r2.getConfiguration()
                r0.<init>(r3, r1, r2)
                return r0
        }

        private static android.content.res.Resources g(android.content.res.Resources r3, android.content.res.AssetManager r4) {
                android.util.DisplayMetrics r0 = r3.getDisplayMetrics()
                android.content.res.Configuration r3 = r3.getConfiguration()
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                r1[r2] = r4
                r4 = 1
                r1[r4] = r0
                r4 = 2
                r1[r4] = r3
                java.lang.String r3 = "android.content.res.MiuiResources"
                java.lang.Object r3 = com.kwad.sdk.utils.z.newInstance(r3, r1)
                android.content.res.Resources r3 = (android.content.res.Resources) r3
                if (r3 == 0) goto L1f
                return r3
            L1f:
                java.lang.RuntimeException r3 = new java.lang.RuntimeException
                java.lang.String r4 = "Can not create Resources"
                r3.<init>(r4)
                throw r3
        }

        static /* synthetic */ android.content.res.Resources h(android.content.res.Resources r0, android.content.res.AssetManager r1) {
                android.content.res.Resources r0 = a(r0, r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class e {
        public e() {
                r1 = this;
                r1.<init>()
                return
        }

        private static android.content.res.Resources a(android.content.res.Resources r2, android.content.res.AssetManager r3) {
                android.content.res.Resources r2 = i(r2, r3)     // Catch: java.lang.Exception -> L5
                return r2
            L5:
                android.content.res.Resources r2 = com.kwad.library.b.b.a.C0120a.b(r2, r3)     // Catch: java.lang.Exception -> La
                return r2
            La:
                android.content.res.Resources r0 = new android.content.res.Resources
                android.util.DisplayMetrics r1 = r2.getDisplayMetrics()
                android.content.res.Configuration r2 = r2.getConfiguration()
                r0.<init>(r3, r1, r2)
                return r0
        }

        private static android.content.res.Resources i(android.content.res.Resources r3, android.content.res.AssetManager r4) {
                android.util.DisplayMetrics r0 = r3.getDisplayMetrics()
                android.content.res.Configuration r3 = r3.getConfiguration()
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                r1[r2] = r4
                r4 = 1
                r1[r4] = r0
                r4 = 2
                r1[r4] = r3
                java.lang.String r3 = "android.content.res.NubiaResources"
                java.lang.Object r3 = com.kwad.sdk.utils.z.newInstance(r3, r1)
                android.content.res.Resources r3 = (android.content.res.Resources) r3
                if (r3 == 0) goto L1f
                return r3
            L1f:
                java.lang.RuntimeException r3 = new java.lang.RuntimeException
                java.lang.String r4 = "Can not create Resources"
                r3.<init>(r4)
                throw r3
        }

        static /* synthetic */ android.content.res.Resources j(android.content.res.Resources r0, android.content.res.AssetManager r1) {
                android.content.res.Resources r0 = a(r0, r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class f {
        public f() {
                r1 = this;
                r1.<init>()
                return
        }

        private static android.content.res.Resources a(android.content.Context r1, android.content.res.Resources r2, android.content.res.AssetManager r3) {
                android.content.res.Resources r1 = b(r1, r2, r3)     // Catch: java.lang.Exception -> L5
                return r1
            L5:
                android.content.res.Resources r1 = com.kwad.library.b.b.a.C0120a.b(r2, r3)     // Catch: java.lang.Exception -> La
                return r1
            La:
                android.content.res.Resources r1 = new android.content.res.Resources
                android.util.DisplayMetrics r0 = r2.getDisplayMetrics()
                android.content.res.Configuration r2 = r2.getConfiguration()
                r1.<init>(r3, r0, r2)
                return r1
        }

        private static android.content.res.Resources b(android.content.Context r6, android.content.res.Resources r7, android.content.res.AssetManager r8) {
                java.lang.String r0 = "mThemeValues"
                java.lang.String r1 = "ResourcesManager"
                android.util.DisplayMetrics r2 = r7.getDisplayMetrics()
                android.content.res.Configuration r3 = r7.getConfiguration()
                r4 = 3
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r5 = 0
                r4[r5] = r8
                r8 = 1
                r4[r8] = r2
                r2 = 2
                r4[r2] = r3
                java.lang.String r2 = "android.content.res.VivoResources"
                java.lang.Object r2 = com.kwad.sdk.utils.z.newInstance(r2, r4)
                android.content.res.Resources r2 = (android.content.res.Resources) r2
                if (r2 == 0) goto L45
                java.lang.String r3 = "init"
                java.lang.String r6 = r6.getPackageName()     // Catch: java.lang.Exception -> L30
                java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Exception -> L30
                r8[r5] = r6     // Catch: java.lang.Exception -> L30
                com.kwad.sdk.utils.z.callMethodOrThrow(r2, r3, r8)     // Catch: java.lang.Exception -> L30
                goto L36
            L30:
                r6 = move-exception
                java.lang.String r8 = "createVivoResources init failed"
                com.kwad.library.solder.lib.a.e(r1, r8, r6)
            L36:
                java.lang.Object r6 = com.kwad.sdk.utils.z.f(r7, r0)     // Catch: java.lang.Exception -> L3e
                com.kwad.sdk.utils.z.b(r2, r0, r6)     // Catch: java.lang.Exception -> L3e
                goto L44
            L3e:
                r6 = move-exception
                java.lang.String r7 = "createVivoResources set mThemeValues failed"
                com.kwad.library.solder.lib.a.e(r1, r7, r6)
            L44:
                return r2
            L45:
                java.lang.RuntimeException r6 = new java.lang.RuntimeException
                java.lang.String r7 = "Can not create Resources"
                r6.<init>(r7)
                throw r6
        }

        static /* synthetic */ android.content.res.Resources c(android.content.Context r0, android.content.res.Resources r1, android.content.res.AssetManager r2) {
                android.content.res.Resources r0 = a(r0, r1, r2)
                return r0
        }
    }

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.kwad.library.b.b.a.apZ = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.kwad.library.b.b.a.aqa = r0
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    private static android.content.res.Resources a(android.content.Context r2, android.content.res.AssetManager r3, android.util.DisplayMetrics r4, android.content.res.Configuration r5) {
            android.content.res.Resources r0 = r2.getResources()
            boolean r1 = a(r0)
            if (r1 == 0) goto Lf
            android.content.res.Resources r2 = com.kwad.library.b.b.a.d.h(r0, r3)
            return r2
        Lf:
            boolean r1 = b(r0)
            if (r1 == 0) goto L1a
            android.content.res.Resources r2 = com.kwad.library.b.b.a.c.f(r0, r3)
            return r2
        L1a:
            boolean r1 = e(r0)
            if (r1 == 0) goto L25
            android.content.res.Resources r2 = com.kwad.library.b.b.a.b.d(r0, r3)
            return r2
        L25:
            boolean r1 = c(r0)
            if (r1 == 0) goto L30
            android.content.res.Resources r2 = com.kwad.library.b.b.a.f.c(r2, r0, r3)
            return r2
        L30:
            boolean r2 = d(r0)
            if (r2 == 0) goto L3b
            android.content.res.Resources r2 = com.kwad.library.b.b.a.e.j(r0, r3)
            return r2
        L3b:
            boolean r2 = f(r0)
            if (r2 == 0) goto L46
            android.content.res.Resources r2 = com.kwad.library.b.b.a.C0120a.b(r0, r3)
            return r2
        L46:
            android.content.res.Resources r2 = new android.content.res.Resources
            r2.<init>(r3, r4, r5)
            return r2
    }

    @androidx.annotation.NonNull
    public static android.content.res.Resources a(android.content.Context r2, android.content.res.Resources r3, java.lang.String r4) {
            java.lang.Object r0 = com.kwad.library.b.b.a.aqa
            monitor-enter(r0)
            java.util.Map<java.lang.String, android.content.res.Resources> r1 = com.kwad.library.b.b.a.apZ     // Catch: java.lang.Throwable -> L19
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L19
            android.content.res.Resources r1 = (android.content.res.Resources) r1     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L2f
            android.content.res.Resources r1 = b(r2, r3, r4)     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L1b
            java.util.Map<java.lang.String, android.content.res.Resources> r2 = com.kwad.library.b.b.a.apZ     // Catch: java.lang.Throwable -> L19
            r2.put(r4, r3)     // Catch: java.lang.Throwable -> L19
            goto L2f
        L19:
            r2 = move-exception
            goto L31
        L1b:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L19
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = "Can not createResources for "
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L19
            r3.append(r4)     // Catch: java.lang.Throwable -> L19
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L19
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L19
            throw r2     // Catch: java.lang.Throwable -> L19
        L2f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return r1
        L31:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r2
    }

    private static void a(android.content.res.AssetManager r4, java.lang.String r5) {
            r0 = 0
            r1 = 1
            java.lang.String r2 = "addOverlayPath"
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Lc
            r3[r0] = r5     // Catch: java.lang.Throwable -> Lc
            com.kwad.sdk.utils.z.callMethodOrThrow(r4, r2, r3)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r5
            java.lang.String r5 = "addAssetPath"
            com.kwad.sdk.utils.z.callMethodOrThrow(r4, r5, r1)
            return
    }

    private static boolean a(android.content.res.Resources r1) {
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r0 = "android.content.res.MiuiResources"
            boolean r1 = r0.equals(r1)
            return r1
    }

    private static int b(android.content.res.AssetManager r5, java.lang.String r6) {
            java.lang.String r0 = "addAssetPath"
            r1 = 1
            r2 = 0
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L1c
            r4 = 24
            if (r3 < r4) goto L14
            java.lang.String r3 = "addAssetPathAsSharedLibrary"
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L1c
            r4[r2] = r6     // Catch: java.lang.Throwable -> L1c
            com.kwad.sdk.utils.z.callMethodOrThrow(r5, r3, r4)     // Catch: java.lang.Throwable -> L1c
            goto L23
        L14:
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L1c
            r3[r2] = r6     // Catch: java.lang.Throwable -> L1c
            com.kwad.sdk.utils.z.callMethodOrThrow(r5, r0, r3)     // Catch: java.lang.Throwable -> L1c
            goto L23
        L1c:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r6
            com.kwad.sdk.utils.z.callMethodOrThrow(r5, r0, r1)
        L23:
            return r2
    }

    private static android.content.res.Resources b(android.content.Context r7, android.content.res.Resources r8, java.lang.String r9) {
            java.lang.Class<android.content.res.AssetManager> r0 = android.content.res.AssetManager.class
            java.lang.Object r0 = com.kwad.sdk.utils.z.i(r0)
            android.content.res.AssetManager r0 = (android.content.res.AssetManager) r0
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r9
            java.lang.String r9 = "addAssetPath"
            com.kwad.sdk.utils.z.callMethodOrThrow(r0, r9, r2)
            if (r7 == 0) goto L21
            java.lang.String r2 = r7.getPackageResourcePath()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r2
            com.kwad.sdk.utils.z.callMethod(r0, r9, r1)
            goto L28
        L21:
            java.lang.String r9 = "ResourcesManager"
            java.lang.String r1 = "context.getPackageResourcePath(): context is null"
            com.kwad.library.solder.lib.a.e(r9, r1)
        L28:
            android.content.pm.ApplicationInfo r9 = r7.getApplicationInfo()
            java.lang.String r1 = "resourceDirs"
            java.lang.Object r1 = com.kwad.sdk.utils.z.getField(r9, r1)     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto L55
            java.lang.Class r2 = r1.getClass()     // Catch: java.lang.Throwable -> L55
            boolean r2 = r2.isArray()     // Catch: java.lang.Throwable -> L55
            if (r2 == 0) goto L55
            java.lang.Object[] r1 = (java.lang.Object[]) r1     // Catch: java.lang.Throwable -> L55
            int r2 = r1.length     // Catch: java.lang.Throwable -> L55
            if (r2 <= 0) goto L55
            int r2 = r1.length     // Catch: java.lang.Throwable -> L55
            r4 = 0
        L45:
            if (r4 >= r2) goto L55
            r5 = r1[r4]     // Catch: java.lang.Throwable -> L55
            boolean r6 = r5 instanceof java.lang.String     // Catch: java.lang.Throwable -> L55
            if (r6 == 0) goto L52
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L55
            a(r0, r5)     // Catch: java.lang.Throwable -> L55
        L52:
            int r4 = r4 + 1
            goto L45
        L55:
            java.lang.String[] r9 = r9.sharedLibraryFiles     // Catch: java.lang.Throwable -> L71
            if (r9 == 0) goto L71
            int r1 = r9.length     // Catch: java.lang.Throwable -> L71
            if (r1 <= 0) goto L71
            int r1 = r9.length     // Catch: java.lang.Throwable -> L71
        L5d:
            if (r3 >= r1) goto L71
            r2 = r9[r3]     // Catch: java.lang.Throwable -> L71
            if (r2 == 0) goto L6e
            java.lang.String r4 = ".apk"
            boolean r4 = r2.endsWith(r4)     // Catch: java.lang.Throwable -> L71
            if (r4 == 0) goto L6e
            b(r0, r2)     // Catch: java.lang.Throwable -> L71
        L6e:
            int r3 = r3 + 1
            goto L5d
        L71:
            android.util.DisplayMetrics r9 = r8.getDisplayMetrics()
            android.content.res.Configuration r8 = r8.getConfiguration()
            android.content.res.Resources r7 = a(r7, r0, r9, r8)
            return r7
    }

    private static boolean b(android.content.res.Resources r1) {
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r0 = "android.content.res.MiuiResourcesImpl"
            boolean r1 = r0.equals(r1)
            return r1
    }

    private static boolean c(android.content.res.Resources r1) {
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r0 = "android.content.res.VivoResources"
            boolean r1 = r0.equals(r1)
            return r1
    }

    private static boolean d(android.content.res.Resources r1) {
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r0 = "android.content.res.NubiaResources"
            boolean r1 = r0.equals(r1)
            return r1
    }

    private static boolean e(android.content.res.Resources r1) {
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r0 = "android.content.res.HwResources"
            boolean r1 = r0.equals(r1)
            return r1
    }

    private static boolean f(android.content.res.Resources r1) {
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r0 = "android.content.res.Resources"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }
}
