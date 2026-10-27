package com.huawei.hms.feature.dynamic;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class DynamicModule {
    public static final int MODULE_INTER_ERROR = 3;
    public static final int MODULE_NEED_UPDATE = 2;
    public static final int MODULE_NORMAL = 0;
    public static final int MODULE_NOT_EXIST = 1;
    public static final int MODULE_NOT_PRESET_HSF = 5;
    public static final int MODULE_NOT_READY = 4;
    public static final com.huawei.hms.feature.dynamic.DynamicModule.VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = null;
    public static final com.huawei.hms.feature.dynamic.DynamicModule.VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = null;
    public static final com.huawei.hms.feature.dynamic.DynamicModule.VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = null;
    public static final com.huawei.hms.feature.dynamic.DynamicModule.VersionPolicy PREFER_REMOTE = null;
    public static final java.lang.String b = null;
    public static final int c = 256;
    public static final int d = -100;
    public static final java.lang.ThreadLocal<java.util.HashMap<java.lang.String, java.lang.Boolean>> e = null;
    public static final java.lang.ThreadLocal<java.util.HashMap<java.lang.String, java.lang.String>> f = null;
    public static final java.lang.ThreadLocal<java.util.HashMap<java.lang.String, com.huawei.hms.feature.dynamic.IDynamicLoader>> g = null;
    public static final java.lang.ThreadLocal<java.util.HashMap<java.lang.String, java.lang.ClassLoader>> h = null;
    public static int i = 0;
    public static final int j = 1;
    public static final int k = 2;
    public static int l;
    public static java.util.HashMap<java.lang.String, java.lang.Boolean> m;
    public static java.util.HashMap<java.lang.String, java.lang.Boolean> n;
    public android.content.Context a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class DynamicLoaderClassLoader {
        public static java.util.HashMap<java.lang.String, java.lang.ClassLoader> a;

        static {
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                com.huawei.hms.feature.dynamic.DynamicModule.DynamicLoaderClassLoader.a = r0
                return
        }

        public DynamicLoaderClassLoader() {
                r0 = this;
                r0.<init>()
                return
        }

        public static java.lang.ClassLoader getsClassLoader(java.lang.String r1) {
                java.util.HashMap<java.lang.String, java.lang.ClassLoader> r0 = com.huawei.hms.feature.dynamic.DynamicModule.DynamicLoaderClassLoader.a
                java.lang.Object r1 = r0.get(r1)
                java.lang.ClassLoader r1 = (java.lang.ClassLoader) r1
                return r1
        }

        public static void setsClassLoader(java.lang.String r1, java.lang.ClassLoader r2) {
                java.util.HashMap<java.lang.String, java.lang.ClassLoader> r0 = com.huawei.hms.feature.dynamic.DynamicModule.DynamicLoaderClassLoader.a
                r0.put(r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class LoadingException extends java.lang.Exception {
        public android.os.Bundle a;

        public LoadingException(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public LoadingException(java.lang.String r1, android.os.Bundle r2) {
                r0 = this;
                r0.<init>(r1)
                r0.a = r2
                return
        }

        public android.os.Bundle getBundle() {
                r1 = this;
                android.os.Bundle r0 = r1.a
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface VersionPolicy {
        android.os.Bundle getModuleInfo(android.content.Context r1, java.lang.String r2) throws com.huawei.hms.feature.dynamic.DynamicModule.LoadingException;
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a extends java.util.HashMap<java.lang.String, java.lang.ClassLoader> {
        public final /* synthetic */ java.lang.String a;
        public final /* synthetic */ java.lang.ClassLoader b;

        public a(java.lang.String r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                r0.put(r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class b extends java.util.HashMap<java.lang.String, java.lang.ClassLoader> {
        public final /* synthetic */ java.lang.String a;
        public final /* synthetic */ java.lang.ClassLoader b;

        public b(java.lang.String r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                r0.put(r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class c implements java.util.concurrent.Callable<android.os.Bundle> {
        public final /* synthetic */ android.content.Context a;
        public final /* synthetic */ android.os.Bundle b;

        public c(android.content.Context r1, android.os.Bundle r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public android.os.Bundle call() {
                r3 = this;
                android.content.Context r0 = r3.a     // Catch: java.lang.Exception -> Lb
                java.lang.String r1 = "huawei_module_dynamicloader"
                android.os.Bundle r2 = r3.b     // Catch: java.lang.Exception -> Lb
                android.os.Bundle r0 = com.huawei.hms.feature.dynamic.DynamicModule.queryHMSModuleBundle(r0, r1, r2)     // Catch: java.lang.Exception -> Lb
                return r0
            Lb:
                r0 = move-exception
                java.lang.String r1 = com.huawei.hms.feature.dynamic.DynamicModule.a()
                java.lang.String r2 = "Query provider error."
                com.huawei.hms.common.util.Logger.w(r1, r2, r0)
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                return r0
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ android.os.Bundle call() throws java.lang.Exception {
                r1 = this;
                android.os.Bundle r0 = r1.call()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class d extends java.util.HashMap<java.lang.String, java.lang.Boolean> {
        public final /* synthetic */ java.lang.String a;

        public d(java.lang.String r2) {
                r1 = this;
                r1.a = r2
                r1.<init>()
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                r1.put(r2, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class e extends java.util.HashMap<java.lang.String, java.lang.String> {
        public final /* synthetic */ java.lang.String a;
        public final /* synthetic */ java.lang.String b;

        public e(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                r0.put(r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class f extends java.util.HashMap<java.lang.String, com.huawei.hms.feature.dynamic.IDynamicLoader> {
        public final /* synthetic */ java.lang.String a;
        public final /* synthetic */ android.os.IBinder b;

        public f(java.lang.String r1, android.os.IBinder r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                com.huawei.hms.feature.dynamic.IDynamicLoader r2 = com.huawei.hms.feature.dynamic.IDynamicLoader.Stub.asInterface(r2)
                r0.put(r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class g extends java.lang.Exception {
        public g(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public /* synthetic */ g(java.lang.String r1, com.huawei.hms.feature.dynamic.DynamicModule.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    static {
            com.huawei.hms.feature.dynamic.e.e r0 = new com.huawei.hms.feature.dynamic.e.e
            r0.<init>()
            com.huawei.hms.feature.dynamic.DynamicModule.PREFER_REMOTE = r0
            com.huawei.hms.feature.dynamic.e.c r0 = new com.huawei.hms.feature.dynamic.e.c
            r0.<init>()
            com.huawei.hms.feature.dynamic.DynamicModule.PREFER_HIGHEST_OR_LOCAL_VERSION = r0
            com.huawei.hms.feature.dynamic.e.d r0 = new com.huawei.hms.feature.dynamic.e.d
            r0.<init>()
            com.huawei.hms.feature.dynamic.DynamicModule.PREFER_HIGHEST_OR_REMOTE_VERSION = r0
            com.huawei.hms.feature.dynamic.e.e r0 = new com.huawei.hms.feature.dynamic.e.e
            r0.<init>()
            com.huawei.hms.feature.dynamic.DynamicModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = r0
            java.lang.Class<com.huawei.hms.feature.dynamic.DynamicModule> r0 = com.huawei.hms.feature.dynamic.DynamicModule.class
            java.lang.String r0 = r0.getSimpleName()
            com.huawei.hms.feature.dynamic.DynamicModule.b = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            com.huawei.hms.feature.dynamic.DynamicModule.e = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            com.huawei.hms.feature.dynamic.DynamicModule.f = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            com.huawei.hms.feature.dynamic.DynamicModule.g = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            com.huawei.hms.feature.dynamic.DynamicModule.h = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.huawei.hms.feature.dynamic.DynamicModule.m = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.huawei.hms.feature.dynamic.DynamicModule.n = r0
            return
    }

    public DynamicModule(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static int a(android.content.Context r9, java.lang.String r10, android.os.Bundle r11) throws com.huawei.hms.feature.dynamic.DynamicModule.LoadingException {
            java.lang.String r0 = "huawei_module_dynamicloader"
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r2 = 0
            r3 = 0
            android.os.Bundle r1 = queryHMSModuleBundle(r9, r0, r11)     // Catch: java.lang.Exception -> L22 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L25
            java.lang.String r4 = "module_version"
            int r4 = r1.getInt(r4)     // Catch: java.lang.Exception -> L22 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L25
            java.lang.String r5 = "copy_type"
            int r5 = r1.getInt(r5)     // Catch: java.lang.Exception -> L1e com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L20
            boolean r10 = a(r10, r5)     // Catch: java.lang.Exception -> L1e com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L20
            goto L7c
        L1e:
            r10 = move-exception
            goto L28
        L20:
            r10 = move-exception
            goto L44
        L22:
            r10 = move-exception
            r4 = 0
            goto L28
        L25:
            r10 = move-exception
            r4 = 0
            goto L44
        L28:
            java.lang.String r5 = com.huawei.hms.feature.dynamic.DynamicModule.b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Get hms loader info failed:"
            r6.append(r7)
            java.lang.String r10 = r10.getMessage()
            r6.append(r10)
            java.lang.String r10 = r6.toString()
            com.huawei.hms.common.util.Logger.w(r5, r10)
        L42:
            r10 = 0
            goto L7c
        L44:
            java.lang.String r3 = com.huawei.hms.feature.dynamic.DynamicModule.b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Get loader in HMS failed:"
            r5.append(r6)
            java.lang.String r6 = r10.getMessage()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.huawei.hms.common.util.Logger.w(r3, r5)
            android.os.Bundle r3 = r10.getBundle()
            if (r3 == 0) goto L72
            com.huawei.hms.feature.dynamic.DynamicModule$LoadingException r3 = new com.huawei.hms.feature.dynamic.DynamicModule$LoadingException
            java.lang.String r5 = r10.getMessage()
            android.os.Bundle r10 = r10.getBundle()
            r3.<init>(r5, r10)
            goto L42
        L72:
            com.huawei.hms.feature.dynamic.DynamicModule$LoadingException r3 = new com.huawei.hms.feature.dynamic.DynamicModule$LoadingException
            java.lang.String r10 = r10.getMessage()
            r3.<init>(r10)
            goto L42
        L7c:
            android.os.Bundle r0 = com.huawei.hms.feature.dynamic.AssetLoadManager.getAssetModuleInfo(r9, r0)
            java.lang.String r5 = "local_asset_module_version"
            int r5 = r0.getInt(r5)
            java.lang.String r6 = "module_path"
            java.lang.String r0 = r0.getString(r6)
            if (r4 != 0) goto L9b
            if (r5 != 0) goto L9b
            java.lang.String r9 = com.huawei.hms.feature.dynamic.DynamicModule.b
            java.lang.String r10 = "No available dynamic loader in HMS and asset."
            com.huawei.hms.common.util.Logger.w(r9, r10)
            if (r3 != 0) goto L9a
            return r2
        L9a:
            throw r3
        L9b:
            java.lang.String r2 = com.huawei.hms.feature.dynamic.DynamicModule.b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "HMS loader version:"
            r3.append(r7)
            r3.append(r4)
            java.lang.String r7 = ", asset loader version:"
            r3.append(r7)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            com.huawei.hms.common.util.Logger.i(r2, r3)
            java.lang.String r3 = "loader_version"
            java.lang.String r7 = "loader_path"
            if (r4 <= r5) goto L106
            java.lang.String r8 = "Choose dynamicLoader in HMS."
            com.huawei.hms.common.util.Logger.i(r2, r8)
            if (r10 == 0) goto Lce
            java.lang.String r10 = "Need to copy HMS dynamicLoader to local dir."
            com.huawei.hms.common.util.Logger.i(r2, r10)
            com.huawei.hms.feature.dynamic.ModuleCopy.copyModule(r9, r1)
        Lce:
            java.lang.String r10 = r1.getString(r6)
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 != 0) goto L102
            java.io.File r1 = new java.io.File
            r1.<init>(r10)
            boolean r1 = r1.exists()
            if (r1 == 0) goto L102
            boolean r1 = com.huawei.hms.feature.dynamic.ModuleCopy.isLocalModuleFile(r9, r10)
            if (r1 != 0) goto Lfb
            boolean r9 = com.huawei.hms.feature.dynamic.f.c.a(r9, r10)
            if (r9 != 0) goto Lfb
            java.lang.String r9 = "checkPathValidity failed, choose assets loader as default."
        Lf1:
            com.huawei.hms.common.util.Logger.i(r2, r9)
            r11.putString(r7, r0)
            r11.putInt(r3, r5)
            goto L105
        Lfb:
            r11.putString(r7, r10)
            r11.putInt(r3, r4)
            goto L105
        L102:
            java.lang.String r9 = "HMS dynamicloader is not available, choose assets loader as default."
            goto Lf1
        L105:
            return r4
        L106:
            java.lang.String r9 = "Choose dynamicLoader in asset."
            com.huawei.hms.common.util.Logger.i(r2, r9)
            r11.putString(r7, r0)
            r11.putInt(r3, r5)
            return r5
    }

    public static int a(com.huawei.hms.feature.dynamic.DynamicModule.VersionPolicy r1) {
            boolean r0 = r1 instanceof com.huawei.hms.feature.dynamic.e.e
            if (r0 == 0) goto L6
            r1 = 1
            return r1
        L6:
            boolean r0 = r1 instanceof com.huawei.hms.feature.dynamic.e.d
            if (r0 == 0) goto Lc
            r1 = 2
            return r1
        Lc:
            boolean r1 = r1 instanceof com.huawei.hms.feature.dynamic.e.c
            if (r1 == 0) goto L12
            r1 = 3
            return r1
        L12:
            r1 = 0
            return r1
    }

    public static android.content.Context a(android.content.Context r5, java.lang.String r6, android.os.Bundle r7, com.huawei.hms.feature.dynamic.IDynamicLoader r8) throws com.huawei.hms.feature.dynamic.DynamicModule.LoadingException {
            r0 = 0
            com.huawei.hms.feature.dynamic.IObjectWrapper r1 = com.huawei.hms.feature.dynamic.ObjectWrapper.wrap(r5)     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            java.lang.String r2 = "module_version"
            int r2 = r7.getInt(r2)     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            com.huawei.hms.feature.dynamic.IObjectWrapper r3 = com.huawei.hms.feature.dynamic.ObjectWrapper.wrap(r7)     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            com.huawei.hms.feature.dynamic.IObjectWrapper r1 = r8.load(r1, r6, r2, r3)     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            java.lang.Object r2 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r1)     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            java.lang.String r3 = "Get remote context is null, module:"
            if (r2 != 0) goto L33
            java.lang.String r5 = com.huawei.hms.feature.dynamic.DynamicModule.b     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            r7.<init>()     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            r7.append(r3)     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            r7.append(r6)     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            com.huawei.hms.common.util.Logger.w(r5, r7)     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            return r0
        L30:
            r5 = move-exception
            goto Lc6
        L33:
            boolean r4 = r2 instanceof android.content.Context     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            if (r4 == 0) goto L55
            java.lang.String r5 = com.huawei.hms.feature.dynamic.DynamicModule.b     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            r7.<init>()     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            java.lang.String r8 = "Get context for module:"
            r7.append(r8)     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            r7.append(r6)     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            java.lang.String r8 = " success."
            r7.append(r8)     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            com.huawei.hms.common.util.Logger.i(r5, r7)     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            android.content.Context r2 = (android.content.Context) r2     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            return r2
        L55:
            boolean r4 = r2 instanceof android.os.Bundle     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            if (r4 == 0) goto L76
            java.lang.String r1 = com.huawei.hms.feature.dynamic.DynamicModule.b     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            r3.<init>()     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            java.lang.String r4 = "Get module info bundle for "
            r3.append(r4)     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            r3.append(r6)     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            com.huawei.hms.common.util.Logger.i(r1, r3)     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            android.os.Bundle r2 = (android.os.Bundle) r2     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            android.content.Context r5 = a(r5, r6, r7, r8, r2)     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            return r5
        L76:
            java.lang.Class r5 = r2.getClass()     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            java.lang.Class<com.huawei.hms.feature.dynamic.DynamicModule$LoadingException> r7 = com.huawei.hms.feature.dynamic.DynamicModule.LoadingException.class
            java.lang.String r7 = r7.getName()     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            boolean r5 = r5.equals(r7)     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            if (r5 != 0) goto L9f
            java.lang.String r5 = com.huawei.hms.feature.dynamic.DynamicModule.b     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            r7.<init>()     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            r7.append(r3)     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            r7.append(r6)     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            com.huawei.hms.common.util.Logger.w(r5, r7)     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            return r0
        L9f:
            java.lang.Object r5 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r1)     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            java.lang.String r7 = "getBundle"
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r7, r0)     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            java.lang.Object r7 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r1)     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            java.lang.Object r5 = r5.invoke(r7, r0)     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            android.os.Bundle r5 = (android.os.Bundle) r5     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            java.lang.String r7 = com.huawei.hms.feature.dynamic.DynamicModule.b     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            java.lang.String r8 = "Successfully get the bundle in exception."
            com.huawei.hms.common.util.Logger.w(r7, r8)     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            com.huawei.hms.feature.dynamic.DynamicModule$LoadingException r7 = new com.huawei.hms.feature.dynamic.DynamicModule$LoadingException     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            java.lang.String r8 = "Failed to load, please check the bundle in exception."
            r7.<init>(r8, r5)     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
            throw r7     // Catch: java.lang.Exception -> L30 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Ldd
        Lc6:
            java.lang.String r7 = com.huawei.hms.feature.dynamic.DynamicModule.b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "Failed to get module context for:"
            r8.append(r1)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            com.huawei.hms.common.util.Logger.w(r7, r6, r5)
            return r0
        Ldd:
            r5 = move-exception
            throw r5
    }

    public static android.content.Context a(android.content.Context r3, java.lang.String r4, android.os.Bundle r5, com.huawei.hms.feature.dynamic.IDynamicLoader r6, android.os.Bundle r7) throws com.huawei.hms.feature.dynamic.DynamicModule.LoadingException {
            java.lang.String r0 = "version_strategy_type"
            r1 = 4
            r5.putInt(r0, r1)
            android.os.Bundle r0 = com.huawei.hms.feature.dynamic.AssetLoadManager.getAssetModuleInfo(r3, r4)
            java.lang.String r1 = "local_asset_module_version"
            r2 = 0
            int r0 = r0.getInt(r1, r2)
            java.lang.String r1 = "Load exception, please check the bundle in exception."
            if (r0 <= 0) goto L64
            com.huawei.hms.feature.dynamic.IObjectWrapper r3 = com.huawei.hms.feature.dynamic.ObjectWrapper.wrap(r3)     // Catch: android.os.RemoteException -> L2c
            java.lang.String r0 = "module_version"
            int r0 = r5.getInt(r0)     // Catch: android.os.RemoteException -> L2c
            com.huawei.hms.feature.dynamic.IObjectWrapper r5 = com.huawei.hms.feature.dynamic.ObjectWrapper.wrap(r5)     // Catch: android.os.RemoteException -> L2c
            com.huawei.hms.feature.dynamic.IObjectWrapper r3 = r6.load(r3, r4, r0, r5)     // Catch: android.os.RemoteException -> L2c
            java.lang.Object r3 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r3)     // Catch: android.os.RemoteException -> L2c
            goto L35
        L2c:
            r3 = move-exception
            java.lang.String r5 = com.huawei.hms.feature.dynamic.DynamicModule.b
            java.lang.String r6 = "tryWithAssetsModule RemoteException."
            com.huawei.hms.common.util.Logger.w(r5, r6, r3)
            r3 = 0
        L35:
            boolean r5 = r3 instanceof android.content.Context
            if (r5 == 0) goto L57
            java.lang.String r5 = com.huawei.hms.feature.dynamic.DynamicModule.b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "get dynamic module context for:"
            r6.append(r7)
            r6.append(r4)
            java.lang.String r4 = " from assets fallback success."
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            com.huawei.hms.common.util.Logger.i(r5, r4)
            android.content.Context r3 = (android.content.Context) r3
            return r3
        L57:
            java.lang.String r3 = com.huawei.hms.feature.dynamic.DynamicModule.b
            java.lang.String r4 = "tryWithAssetsModule get dynamicContext failed: null or wrong type."
            com.huawei.hms.common.util.Logger.w(r3, r4)
            com.huawei.hms.feature.dynamic.DynamicModule$LoadingException r3 = new com.huawei.hms.feature.dynamic.DynamicModule$LoadingException
            r3.<init>(r1, r7)
            throw r3
        L64:
            java.lang.String r3 = com.huawei.hms.feature.dynamic.DynamicModule.b
            java.lang.String r4 = "No fallback module in assets."
            com.huawei.hms.common.util.Logger.i(r3, r4)
            com.huawei.hms.feature.dynamic.DynamicModule$LoadingException r3 = new com.huawei.hms.feature.dynamic.DynamicModule$LoadingException
            r3.<init>(r1, r7)
            throw r3
    }

    public static android.os.Bundle a(android.content.Context r4, android.os.Bundle r5) throws com.huawei.hms.feature.dynamic.DynamicModule.g {
            r0 = 0
            java.util.concurrent.ExecutorService r1 = java.util.concurrent.Executors.newSingleThreadExecutor()     // Catch: java.lang.Exception -> L3c java.util.concurrent.TimeoutException -> L70
            java.util.concurrent.FutureTask r2 = new java.util.concurrent.FutureTask     // Catch: java.lang.Exception -> L3c java.util.concurrent.TimeoutException -> L70
            com.huawei.hms.feature.dynamic.DynamicModule$c r3 = new com.huawei.hms.feature.dynamic.DynamicModule$c     // Catch: java.lang.Exception -> L3c java.util.concurrent.TimeoutException -> L70
            r3.<init>(r4, r5)     // Catch: java.lang.Exception -> L3c java.util.concurrent.TimeoutException -> L70
            r2.<init>(r3)     // Catch: java.lang.Exception -> L3c java.util.concurrent.TimeoutException -> L70
            r1.execute(r2)     // Catch: java.lang.Exception -> L3c java.util.concurrent.TimeoutException -> L70
            int r4 = com.huawei.hms.feature.dynamic.DynamicModule.l     // Catch: java.lang.Exception -> L3c java.util.concurrent.TimeoutException -> L70
            long r4 = (long) r4     // Catch: java.lang.Exception -> L3c java.util.concurrent.TimeoutException -> L70
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> L3c java.util.concurrent.TimeoutException -> L70
            java.lang.Object r4 = r2.get(r4, r1)     // Catch: java.lang.Exception -> L3c java.util.concurrent.TimeoutException -> L70
            android.os.Bundle r4 = (android.os.Bundle) r4     // Catch: java.lang.Exception -> L3c java.util.concurrent.TimeoutException -> L70
            java.lang.String r5 = "loader_path"
            java.lang.String r5 = r4.getString(r5)     // Catch: java.lang.Exception -> L3c java.util.concurrent.TimeoutException -> L70
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L3c java.util.concurrent.TimeoutException -> L70
            if (r1 != 0) goto L3e
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L3c java.util.concurrent.TimeoutException -> L70
            r1.<init>(r5)     // Catch: java.lang.Exception -> L3c java.util.concurrent.TimeoutException -> L70
            boolean r1 = r1.exists()     // Catch: java.lang.Exception -> L3c java.util.concurrent.TimeoutException -> L70
            if (r1 == 0) goto L3e
            java.lang.String r5 = com.huawei.hms.feature.dynamic.DynamicModule.b     // Catch: java.lang.Exception -> L3c java.util.concurrent.TimeoutException -> L70
            java.lang.String r1 = "Query HMS module:huawei_module_dynamicloader info success."
            com.huawei.hms.common.util.Logger.i(r5, r1)     // Catch: java.lang.Exception -> L3c java.util.concurrent.TimeoutException -> L70
            return r4
        L3c:
            r4 = move-exception
            goto L61
        L3e:
            java.lang.String r4 = com.huawei.hms.feature.dynamic.DynamicModule.b     // Catch: java.lang.Exception -> L3c java.util.concurrent.TimeoutException -> L70
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3c java.util.concurrent.TimeoutException -> L70
            r1.<init>()     // Catch: java.lang.Exception -> L3c java.util.concurrent.TimeoutException -> L70
            java.lang.String r2 = "The loader_path:"
            r1.append(r2)     // Catch: java.lang.Exception -> L3c java.util.concurrent.TimeoutException -> L70
            r1.append(r5)     // Catch: java.lang.Exception -> L3c java.util.concurrent.TimeoutException -> L70
            java.lang.String r5 = " is not available."
            r1.append(r5)     // Catch: java.lang.Exception -> L3c java.util.concurrent.TimeoutException -> L70
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Exception -> L3c java.util.concurrent.TimeoutException -> L70
            com.huawei.hms.common.util.Logger.w(r4, r5)     // Catch: java.lang.Exception -> L3c java.util.concurrent.TimeoutException -> L70
            com.huawei.hms.feature.dynamic.DynamicModule$g r4 = new com.huawei.hms.feature.dynamic.DynamicModule$g     // Catch: java.lang.Exception -> L3c java.util.concurrent.TimeoutException -> L70
            java.lang.String r5 = "The loader_path in queryBundle is empty or not exist."
            r4.<init>(r5, r0)     // Catch: java.lang.Exception -> L3c java.util.concurrent.TimeoutException -> L70
            throw r4     // Catch: java.lang.Exception -> L3c java.util.concurrent.TimeoutException -> L70
        L61:
            java.lang.String r5 = com.huawei.hms.feature.dynamic.DynamicModule.b
            java.lang.String r1 = "FutureTask: query provider exception."
            com.huawei.hms.common.util.Logger.w(r5, r1, r4)
            com.huawei.hms.feature.dynamic.DynamicModule$g r4 = new com.huawei.hms.feature.dynamic.DynamicModule$g
            java.lang.String r5 = "failed to get :huawei_module_dynamicloader info."
            r4.<init>(r5, r0)
            throw r4
        L70:
            java.lang.String r4 = com.huawei.hms.feature.dynamic.DynamicModule.b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Query hms provider timeout: over "
            r5.append(r0)
            int r0 = com.huawei.hms.feature.dynamic.DynamicModule.l
            r5.append(r0)
            java.lang.String r0 = " ms, choose the local loader fallback."
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            com.huawei.hms.common.util.Logger.w(r4, r5)
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            return r4
    }

    public static com.huawei.hms.feature.dynamic.DynamicModule a(android.content.Context r2, java.lang.String r3, com.huawei.hms.feature.dynamic.DynamicModule.VersionPolicy r4) throws com.huawei.hms.feature.dynamic.DynamicModule.LoadingException {
            android.os.Bundle r4 = r4.getModuleInfo(r2, r3)
            java.lang.String r0 = "module_version"
            int r0 = r4.getInt(r0)
            if (r0 <= 0) goto L35
            com.huawei.hms.feature.dynamic.DynamicModule r2 = c(r2, r3, r4)     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L11
            return r2
        L11:
            r4 = move-exception
            java.lang.String r0 = com.huawei.hms.feature.dynamic.DynamicModule.b
            java.lang.String r1 = "Failed to load remote module."
            com.huawei.hms.common.util.Logger.w(r0, r1, r4)
            int r3 = getLocalVersion(r2, r3)
            if (r3 <= 0) goto L34
            java.lang.String r3 = com.huawei.hms.feature.dynamic.DynamicModule.b
            java.lang.String r4 = "Local module version is valid, use local fallback."
            com.huawei.hms.common.util.Logger.d(r3, r4)
            com.huawei.hms.feature.dynamic.DynamicModule r3 = new com.huawei.hms.feature.dynamic.DynamicModule
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            r3.<init>(r2)
            return r3
        L34:
            throw r4
        L35:
            java.lang.String r3 = "local_module_version"
            int r3 = r4.getInt(r3)
            if (r3 <= 0) goto L52
            java.lang.String r3 = com.huawei.hms.feature.dynamic.DynamicModule.b
            java.lang.String r4 = "Remote version is invalid, use local context."
            com.huawei.hms.common.util.Logger.i(r3, r4)
            com.huawei.hms.feature.dynamic.DynamicModule r3 = new com.huawei.hms.feature.dynamic.DynamicModule
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            r3.<init>(r2)
            return r3
        L52:
            com.huawei.hms.feature.dynamic.DynamicModule$LoadingException r2 = new com.huawei.hms.feature.dynamic.DynamicModule$LoadingException
            java.lang.String r3 = "Query remote version and local version failed."
            r2.<init>(r3)
            throw r2
    }

    public static com.huawei.hms.feature.dynamic.DynamicModule a(android.content.Context r4, java.lang.String r5, com.huawei.hms.feature.dynamic.DynamicModule.VersionPolicy r6, android.os.Bundle r7) throws com.huawei.hms.feature.dynamic.DynamicModule.LoadingException {
            int r6 = a(r6)
            java.lang.String r0 = "loader_path"
            java.lang.String r0 = r7.getString(r0)
            java.lang.String r1 = com.huawei.hms.feature.dynamic.DynamicModule.b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "The loader path for module:"
            r2.append(r3)
            r2.append(r5)
            java.lang.String r3 = " is:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = ", and versionType is:"
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            com.huawei.hms.common.util.Logger.i(r1, r2)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L91
            java.util.HashMap<java.lang.String, java.lang.Boolean> r0 = com.huawei.hms.feature.dynamic.DynamicModule.n
            java.lang.Object r0 = r0.get(r5)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            java.util.HashMap<java.lang.String, java.lang.Boolean> r1 = com.huawei.hms.feature.dynamic.DynamicModule.m
            java.lang.Object r1 = r1.get(r5)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            java.lang.String r2 = "module_name"
            r7.putString(r2, r5)
            java.lang.String r2 = "version_strategy_type"
            r7.putInt(r2, r6)
            r6 = 0
            if (r0 == 0) goto L58
            boolean r0 = r0.booleanValue()
            goto L59
        L58:
            r0 = 0
        L59:
            java.lang.String r2 = "enable_low_emui_switch"
            r7.putBoolean(r2, r0)
            if (r1 == 0) goto L64
            boolean r6 = r1.booleanValue()
        L64:
            java.lang.String r0 = "enable_3rd_phone_switch"
            r7.putBoolean(r0, r6)
            com.huawei.hms.feature.dynamic.DynamicModule r4 = b(r4, r5, r7)     // Catch: java.lang.Exception -> L6e com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L8f
            return r4
        L6e:
            r5 = move-exception
            java.lang.String r6 = com.huawei.hms.feature.dynamic.DynamicModule.b
            java.lang.String r7 = "Other exception,"
            com.huawei.hms.common.util.Logger.e(r6, r7, r5)
            android.content.Context r5 = r4.getApplicationContext()
            android.content.Context r5 = com.stub.StubApp.getOrigApplicationContext(r5)
            if (r5 != 0) goto L81
            goto L89
        L81:
            android.content.Context r4 = r4.getApplicationContext()
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)
        L89:
            com.huawei.hms.feature.dynamic.DynamicModule r5 = new com.huawei.hms.feature.dynamic.DynamicModule
            r5.<init>(r4)
            return r5
        L8f:
            r4 = move-exception
            throw r4
        L91:
            com.huawei.hms.feature.dynamic.DynamicModule$LoadingException r4 = new com.huawei.hms.feature.dynamic.DynamicModule$LoadingException
            java.lang.String r5 = "Cannot find a valid dynamic loader in HMS or local."
            r4.<init>(r5)
            throw r4
    }

    public static com.huawei.hms.feature.dynamic.IDynamicInstall a(android.content.Context r2, java.lang.String r3) throws com.huawei.hms.feature.dynamic.DynamicModule.LoadingException {
            if (r3 == 0) goto L3c
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.ClassNotFoundException -> L44 java.lang.NoSuchMethodException -> L46 java.lang.reflect.InvocationTargetException -> L48 java.lang.InstantiationException -> L4a java.lang.IllegalAccessException -> L4c
            if (r0 != 0) goto L3c
            boolean r2 = com.huawei.hms.feature.dynamic.f.c.a(r2, r3)     // Catch: java.lang.ClassNotFoundException -> L44 java.lang.NoSuchMethodException -> L46 java.lang.reflect.InvocationTargetException -> L48 java.lang.InstantiationException -> L4a java.lang.IllegalAccessException -> L4c
            if (r2 == 0) goto L2d
            com.huawei.hms.feature.dynamic.e.a r2 = new com.huawei.hms.feature.dynamic.e.a     // Catch: java.lang.ClassNotFoundException -> L44 java.lang.NoSuchMethodException -> L46 java.lang.reflect.InvocationTargetException -> L48 java.lang.InstantiationException -> L4a java.lang.IllegalAccessException -> L4c
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: java.lang.ClassNotFoundException -> L44 java.lang.NoSuchMethodException -> L46 java.lang.reflect.InvocationTargetException -> L48 java.lang.InstantiationException -> L4a java.lang.IllegalAccessException -> L4c
            r2.<init>(r3, r0)     // Catch: java.lang.ClassNotFoundException -> L44 java.lang.NoSuchMethodException -> L46 java.lang.reflect.InvocationTargetException -> L48 java.lang.InstantiationException -> L4a java.lang.IllegalAccessException -> L4c
            java.lang.String r3 = "com.huawei.hms.dynamicloader.DynamicInstaller"
            java.lang.Class r2 = r2.loadClass(r3)     // Catch: java.lang.ClassNotFoundException -> L44 java.lang.NoSuchMethodException -> L46 java.lang.reflect.InvocationTargetException -> L48 java.lang.InstantiationException -> L4a java.lang.IllegalAccessException -> L4c
            r3 = 0
            java.lang.reflect.Constructor r2 = r2.getConstructor(r3)     // Catch: java.lang.ClassNotFoundException -> L44 java.lang.NoSuchMethodException -> L46 java.lang.reflect.InvocationTargetException -> L48 java.lang.InstantiationException -> L4a java.lang.IllegalAccessException -> L4c
            java.lang.Object r2 = r2.newInstance(r3)     // Catch: java.lang.ClassNotFoundException -> L44 java.lang.NoSuchMethodException -> L46 java.lang.reflect.InvocationTargetException -> L48 java.lang.InstantiationException -> L4a java.lang.IllegalAccessException -> L4c
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: java.lang.ClassNotFoundException -> L44 java.lang.NoSuchMethodException -> L46 java.lang.reflect.InvocationTargetException -> L48 java.lang.InstantiationException -> L4a java.lang.IllegalAccessException -> L4c
            com.huawei.hms.feature.dynamic.IDynamicInstall r2 = com.huawei.hms.feature.dynamic.IDynamicInstall.Stub.asInterface(r2)     // Catch: java.lang.ClassNotFoundException -> L44 java.lang.NoSuchMethodException -> L46 java.lang.reflect.InvocationTargetException -> L48 java.lang.InstantiationException -> L4a java.lang.IllegalAccessException -> L4c
            return r2
        L2d:
            java.lang.String r2 = com.huawei.hms.feature.dynamic.DynamicModule.b     // Catch: java.lang.ClassNotFoundException -> L44 java.lang.NoSuchMethodException -> L46 java.lang.reflect.InvocationTargetException -> L48 java.lang.InstantiationException -> L4a java.lang.IllegalAccessException -> L4c
            java.lang.String r3 = "check path failed: invalid."
            com.huawei.hms.common.util.Logger.w(r2, r3)     // Catch: java.lang.ClassNotFoundException -> L44 java.lang.NoSuchMethodException -> L46 java.lang.reflect.InvocationTargetException -> L48 java.lang.InstantiationException -> L4a java.lang.IllegalAccessException -> L4c
            com.huawei.hms.feature.dynamic.DynamicModule$LoadingException r2 = new com.huawei.hms.feature.dynamic.DynamicModule$LoadingException     // Catch: java.lang.ClassNotFoundException -> L44 java.lang.NoSuchMethodException -> L46 java.lang.reflect.InvocationTargetException -> L48 java.lang.InstantiationException -> L4a java.lang.IllegalAccessException -> L4c
            java.lang.String r3 = "getHMSDynamicInstaller: checkPathValidity failed."
            r2.<init>(r3)     // Catch: java.lang.ClassNotFoundException -> L44 java.lang.NoSuchMethodException -> L46 java.lang.reflect.InvocationTargetException -> L48 java.lang.InstantiationException -> L4a java.lang.IllegalAccessException -> L4c
            throw r2     // Catch: java.lang.ClassNotFoundException -> L44 java.lang.NoSuchMethodException -> L46 java.lang.reflect.InvocationTargetException -> L48 java.lang.InstantiationException -> L4a java.lang.IllegalAccessException -> L4c
        L3c:
            com.huawei.hms.feature.dynamic.DynamicModule$LoadingException r2 = new com.huawei.hms.feature.dynamic.DynamicModule$LoadingException     // Catch: java.lang.ClassNotFoundException -> L44 java.lang.NoSuchMethodException -> L46 java.lang.reflect.InvocationTargetException -> L48 java.lang.InstantiationException -> L4a java.lang.IllegalAccessException -> L4c
            java.lang.String r3 = "Failed to get dynamicLoader path."
            r2.<init>(r3)     // Catch: java.lang.ClassNotFoundException -> L44 java.lang.NoSuchMethodException -> L46 java.lang.reflect.InvocationTargetException -> L48 java.lang.InstantiationException -> L4a java.lang.IllegalAccessException -> L4c
            throw r2     // Catch: java.lang.ClassNotFoundException -> L44 java.lang.NoSuchMethodException -> L46 java.lang.reflect.InvocationTargetException -> L48 java.lang.InstantiationException -> L4a java.lang.IllegalAccessException -> L4c
        L44:
            r2 = move-exception
            goto L4d
        L46:
            r2 = move-exception
            goto L4d
        L48:
            r2 = move-exception
            goto L4d
        L4a:
            r2 = move-exception
            goto L4d
        L4c:
            r2 = move-exception
        L4d:
            com.huawei.hms.feature.dynamic.DynamicModule$LoadingException r3 = new com.huawei.hms.feature.dynamic.DynamicModule$LoadingException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getHMSDynamicInstaller: failed to instantiate dynamic loader:"
            r0.append(r1)
            java.lang.String r2 = r2.getMessage()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
    }

    public static com.huawei.hms.feature.dynamic.IDynamicLoader a(android.content.Context r1, java.lang.String r2, java.lang.String r3, java.lang.ClassLoader r4) {
            r1 = 0
            if (r4 != 0) goto L19
            com.huawei.hms.feature.dynamic.e.a r4 = new com.huawei.hms.feature.dynamic.e.a     // Catch: java.lang.Exception -> L17
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: java.lang.Exception -> L17
            r4.<init>(r3, r0)     // Catch: java.lang.Exception -> L17
            java.lang.ThreadLocal<java.util.HashMap<java.lang.String, java.lang.ClassLoader>> r3 = com.huawei.hms.feature.dynamic.DynamicModule.h     // Catch: java.lang.Exception -> L17
            com.huawei.hms.feature.dynamic.DynamicModule$b r0 = new com.huawei.hms.feature.dynamic.DynamicModule$b     // Catch: java.lang.Exception -> L17
            r0.<init>(r2, r4)     // Catch: java.lang.Exception -> L17
            r3.set(r0)     // Catch: java.lang.Exception -> L17
            goto L19
        L17:
            r2 = move-exception
            goto L2e
        L19:
            java.lang.String r2 = "com.huawei.hms.dynamicloader.DynamicLoader"
            java.lang.Class r2 = r4.loadClass(r2)     // Catch: java.lang.Exception -> L17
            java.lang.reflect.Constructor r2 = r2.getConstructor(r1)     // Catch: java.lang.Exception -> L17
            java.lang.Object r2 = r2.newInstance(r1)     // Catch: java.lang.Exception -> L17
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: java.lang.Exception -> L17
            com.huawei.hms.feature.dynamic.IDynamicLoader r1 = com.huawei.hms.feature.dynamic.IDynamicLoader.Stub.asInterface(r2)     // Catch: java.lang.Exception -> L17
            return r1
        L2e:
            java.lang.String r3 = com.huawei.hms.feature.dynamic.DynamicModule.b
            java.lang.String r4 = "Get iDynamicLoader failed."
            com.huawei.hms.common.util.Logger.w(r3, r4, r2)
            return r1
    }

    public static java.lang.Class<?> a(android.content.Context r2) throws com.huawei.hms.feature.dynamic.DynamicModule.LoadingException {
            java.lang.Class<com.huawei.hms.feature.dynamic.DynamicModule$DynamicLoaderClassLoader> r0 = com.huawei.hms.feature.dynamic.DynamicModule.DynamicLoaderClassLoader.class
            android.content.Context r1 = r2.getApplicationContext()     // Catch: java.lang.ClassNotFoundException -> L22
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)     // Catch: java.lang.ClassNotFoundException -> L22
            if (r1 != 0) goto Ld
            goto L15
        Ld:
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.ClassNotFoundException -> L22
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)     // Catch: java.lang.ClassNotFoundException -> L22
        L15:
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L22
            java.lang.String r1 = r0.getName()     // Catch: java.lang.ClassNotFoundException -> L22
            java.lang.Class r2 = r2.loadClass(r1)     // Catch: java.lang.ClassNotFoundException -> L22
            goto L2a
        L22:
            java.lang.String r2 = com.huawei.hms.feature.dynamic.DynamicModule.b
            java.lang.String r1 = "ClassLoader class not found when use client context."
            com.huawei.hms.common.util.Logger.w(r2, r1)
            r2 = 0
        L2a:
            if (r2 != 0) goto L50
            java.lang.Class<com.huawei.hms.feature.dynamic.DynamicModule> r2 = com.huawei.hms.feature.dynamic.DynamicModule.class
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L48
            java.util.Objects.requireNonNull(r2)     // Catch: java.lang.ClassNotFoundException -> L48
            java.lang.String r0 = r0.getName()     // Catch: java.lang.ClassNotFoundException -> L48
            java.lang.Class r2 = r2.loadClass(r0)     // Catch: java.lang.ClassNotFoundException -> L48
            if (r2 == 0) goto L40
            goto L50
        L40:
            com.huawei.hms.feature.dynamic.DynamicModule$LoadingException r2 = new com.huawei.hms.feature.dynamic.DynamicModule$LoadingException     // Catch: java.lang.ClassNotFoundException -> L48
            java.lang.String r0 = "ClassLoader class is null."
            r2.<init>(r0)     // Catch: java.lang.ClassNotFoundException -> L48
            throw r2     // Catch: java.lang.ClassNotFoundException -> L48
        L48:
            com.huawei.hms.feature.dynamic.DynamicModule$LoadingException r2 = new com.huawei.hms.feature.dynamic.DynamicModule$LoadingException
            java.lang.String r0 = "ClassLoader class not found when use DynamicModule's classLoader."
            r2.<init>(r0)
            throw r2
        L50:
            return r2
    }

    public static /* synthetic */ java.lang.String a() {
            java.lang.String r0 = com.huawei.hms.feature.dynamic.DynamicModule.b
            return r0
    }

    public static void a(android.content.Context r0, com.huawei.hms.feature.dynamic.DynamicModule.VersionPolicy r1, java.lang.String r2, android.os.Bundle r3) throws com.huawei.hms.feature.dynamic.DynamicModule.LoadingException {
            if (r0 == 0) goto L17
            if (r1 == 0) goto L17
            if (r2 == 0) goto L17
            int r0 = r2.length()
            if (r0 == 0) goto L17
            int r0 = r2.length()
            r1 = 256(0x100, float:3.59E-43)
            if (r0 > r1) goto L17
            if (r3 == 0) goto L17
            return
        L17:
            com.huawei.hms.feature.dynamic.DynamicModule$LoadingException r0 = new com.huawei.hms.feature.dynamic.DynamicModule$LoadingException
            java.lang.String r1 = "Null param, please check it."
            r0.<init>(r1)
            throw r0
    }

    public static void a(java.lang.String r2, java.lang.ClassLoader r3) throws com.huawei.hms.feature.dynamic.DynamicModule.LoadingException {
            java.lang.String r0 = "com.huawei.hms.dynamicloader.DynamicLoader"
            java.lang.Class r3 = r3.loadClass(r0)     // Catch: java.lang.ClassNotFoundException -> L1c java.lang.NoSuchMethodException -> L1e java.lang.reflect.InvocationTargetException -> L20 java.lang.InstantiationException -> L22 java.lang.IllegalAccessException -> L24
            r0 = 0
            java.lang.reflect.Constructor r3 = r3.getConstructor(r0)     // Catch: java.lang.ClassNotFoundException -> L1c java.lang.NoSuchMethodException -> L1e java.lang.reflect.InvocationTargetException -> L20 java.lang.InstantiationException -> L22 java.lang.IllegalAccessException -> L24
            java.lang.Object r3 = r3.newInstance(r0)     // Catch: java.lang.ClassNotFoundException -> L1c java.lang.NoSuchMethodException -> L1e java.lang.reflect.InvocationTargetException -> L20 java.lang.InstantiationException -> L22 java.lang.IllegalAccessException -> L24
            android.os.IBinder r3 = (android.os.IBinder) r3     // Catch: java.lang.ClassNotFoundException -> L1c java.lang.NoSuchMethodException -> L1e java.lang.reflect.InvocationTargetException -> L20 java.lang.InstantiationException -> L22 java.lang.IllegalAccessException -> L24
            java.lang.ThreadLocal<java.util.HashMap<java.lang.String, com.huawei.hms.feature.dynamic.IDynamicLoader>> r0 = com.huawei.hms.feature.dynamic.DynamicModule.g     // Catch: java.lang.ClassNotFoundException -> L1c java.lang.NoSuchMethodException -> L1e java.lang.reflect.InvocationTargetException -> L20 java.lang.InstantiationException -> L22 java.lang.IllegalAccessException -> L24
            com.huawei.hms.feature.dynamic.DynamicModule$f r1 = new com.huawei.hms.feature.dynamic.DynamicModule$f     // Catch: java.lang.ClassNotFoundException -> L1c java.lang.NoSuchMethodException -> L1e java.lang.reflect.InvocationTargetException -> L20 java.lang.InstantiationException -> L22 java.lang.IllegalAccessException -> L24
            r1.<init>(r2, r3)     // Catch: java.lang.ClassNotFoundException -> L1c java.lang.NoSuchMethodException -> L1e java.lang.reflect.InvocationTargetException -> L20 java.lang.InstantiationException -> L22 java.lang.IllegalAccessException -> L24
            r0.set(r1)     // Catch: java.lang.ClassNotFoundException -> L1c java.lang.NoSuchMethodException -> L1e java.lang.reflect.InvocationTargetException -> L20 java.lang.InstantiationException -> L22 java.lang.IllegalAccessException -> L24
            return
        L1c:
            r2 = move-exception
            goto L25
        L1e:
            r2 = move-exception
            goto L25
        L20:
            r2 = move-exception
            goto L25
        L22:
            r2 = move-exception
            goto L25
        L24:
            r2 = move-exception
        L25:
            com.huawei.hms.feature.dynamic.DynamicModule$LoadingException r3 = new com.huawei.hms.feature.dynamic.DynamicModule$LoadingException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to get loader interface:"
            r0.append(r1)
            java.lang.String r2 = r2.getMessage()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
    }

    public static boolean a(java.lang.String r3, int r4) {
            r0 = 0
            r1 = 1
            if (r4 != r1) goto L14
            java.util.HashMap<java.lang.String, java.lang.Boolean> r4 = com.huawei.hms.feature.dynamic.DynamicModule.n
            java.lang.Object r3 = r4.get(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            if (r3 == 0) goto L13
            boolean r3 = r3.booleanValue()
            return r3
        L13:
            return r0
        L14:
            r2 = 2
            if (r4 != r2) goto L27
            java.util.HashMap<java.lang.String, java.lang.Boolean> r4 = com.huawei.hms.feature.dynamic.DynamicModule.m
            java.lang.Object r3 = r4.get(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            if (r3 == 0) goto L26
            boolean r3 = r3.booleanValue()
            return r3
        L26:
            return r0
        L27:
            r3 = 3
            if (r4 == r3) goto L2f
            r3 = 4
            if (r4 != r3) goto L2e
            goto L2f
        L2e:
            return r0
        L2f:
            return r1
    }

    public static android.os.Bundle b(android.content.Context r10, java.lang.String r11) throws com.huawei.hms.feature.dynamic.DynamicModule.LoadingException {
            r0 = 0
            java.lang.Class r1 = a(r10)     // Catch: java.lang.Exception -> L43 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lcc
            java.lang.String r2 = "getsClassLoader"
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L43 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lcc
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r0] = r5     // Catch: java.lang.Exception -> L43 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lcc
            java.lang.reflect.Method r2 = r1.getDeclaredMethod(r2, r4)     // Catch: java.lang.Exception -> L43 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lcc
            java.lang.String r4 = "setsClassLoader"
            r5 = 2
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L43 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lcc
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r6[r0] = r7     // Catch: java.lang.Exception -> L43 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lcc
            java.lang.Class<java.lang.ClassLoader> r7 = java.lang.ClassLoader.class
            r6[r3] = r7     // Catch: java.lang.Exception -> L43 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lcc
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r4, r6)     // Catch: java.lang.Exception -> L43 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lcc
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L43 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lcc
            r4[r0] = r11     // Catch: java.lang.Exception -> L43 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lcc
            r6 = 0
            java.lang.Object r2 = r2.invoke(r6, r4)     // Catch: java.lang.Exception -> L43 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lcc
            java.lang.ClassLoader r2 = (java.lang.ClassLoader) r2     // Catch: java.lang.Exception -> L43 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lcc
            if (r2 == 0) goto L4f
            java.lang.ClassLoader r10 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: java.lang.Exception -> L43 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lcc
            if (r2 != r10) goto L38
            goto Lb5
        L38:
            java.lang.String r10 = com.huawei.hms.feature.dynamic.DynamicModule.b     // Catch: java.lang.Exception -> L43 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lcc
            java.lang.String r1 = "Cached loader is available, ready to use it."
            com.huawei.hms.common.util.Logger.i(r10, r1)     // Catch: java.lang.Exception -> L43 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lcc
            a(r11, r2)     // Catch: java.lang.Exception -> L43 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L45
            goto L4d
        L43:
            r10 = move-exception
            goto Lae
        L45:
            r10 = move-exception
            java.lang.String r1 = com.huawei.hms.feature.dynamic.DynamicModule.b     // Catch: java.lang.Exception -> L43 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lcc
            java.lang.String r2 = "Get loader interface failed."
            com.huawei.hms.common.util.Logger.w(r1, r2, r10)     // Catch: java.lang.Exception -> L43 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lcc
        L4d:
            r0 = 1
            goto Lb5
        L4f:
            java.lang.String r2 = com.huawei.hms.feature.dynamic.DynamicModule.b     // Catch: java.lang.Exception -> L43 com.huawei.hms.feature.dynamic.DynamicModule.g -> Lb5 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lcc
            java.lang.String r4 = "No available cached loader, query remote."
            com.huawei.hms.common.util.Logger.i(r2, r4)     // Catch: java.lang.Exception -> L43 com.huawei.hms.feature.dynamic.DynamicModule.g -> Lb5 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lcc
            android.os.Bundle r4 = c(r10, r11)     // Catch: java.lang.Exception -> L43 com.huawei.hms.feature.dynamic.DynamicModule.g -> Lb5 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lcc
            java.lang.Class<com.huawei.hms.feature.dynamic.DynamicModule> r7 = com.huawei.hms.feature.dynamic.DynamicModule.class
            monitor-enter(r7)     // Catch: java.lang.Exception -> L43 com.huawei.hms.feature.dynamic.DynamicModule.g -> Lb5 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lcc
            java.lang.ThreadLocal<java.util.HashMap<java.lang.String, java.lang.String>> r8 = com.huawei.hms.feature.dynamic.DynamicModule.f     // Catch: java.lang.Throwable -> L76
            java.lang.Object r8 = r8.get()     // Catch: java.lang.Throwable -> L76
            java.util.Objects.requireNonNull(r8)     // Catch: java.lang.Throwable -> L76
            java.util.HashMap r8 = (java.util.HashMap) r8     // Catch: java.lang.Throwable -> L76
            java.lang.Object r8 = r8.get(r11)     // Catch: java.lang.Throwable -> L76
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L76
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L76
            if (r9 == 0) goto L78
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L76
            return r4
        L76:
            r10 = move-exception
            goto Lac
        L78:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L76
            boolean r10 = com.huawei.hms.feature.dynamic.f.c.a(r10, r8)     // Catch: java.lang.Exception -> L43 com.huawei.hms.feature.dynamic.DynamicModule.g -> Lb5 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lcc
            if (r10 == 0) goto L9f
            com.huawei.hms.feature.dynamic.e.a r10 = new com.huawei.hms.feature.dynamic.e.a     // Catch: java.lang.Exception -> L43 com.huawei.hms.feature.dynamic.DynamicModule.g -> Lb5 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lcc
            java.lang.ClassLoader r2 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: java.lang.Exception -> L43 com.huawei.hms.feature.dynamic.DynamicModule.g -> Lb5 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lcc
            r10.<init>(r8, r2)     // Catch: java.lang.Exception -> L43 com.huawei.hms.feature.dynamic.DynamicModule.g -> Lb5 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lcc
            a(r11, r10)     // Catch: java.lang.Exception -> L43 com.huawei.hms.feature.dynamic.DynamicModule.g -> Lb5 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lcc
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L43 com.huawei.hms.feature.dynamic.DynamicModule.g -> Lb5 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lcc
            r2[r0] = r11     // Catch: java.lang.Exception -> L43 com.huawei.hms.feature.dynamic.DynamicModule.g -> Lb5 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lcc
            r2[r3] = r10     // Catch: java.lang.Exception -> L43 com.huawei.hms.feature.dynamic.DynamicModule.g -> Lb5 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lcc
            r1.invoke(r6, r2)     // Catch: java.lang.Exception -> L43 com.huawei.hms.feature.dynamic.DynamicModule.g -> Lb5 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lcc
            java.lang.ThreadLocal<java.util.HashMap<java.lang.String, java.lang.Boolean>> r10 = com.huawei.hms.feature.dynamic.DynamicModule.e     // Catch: java.lang.Exception -> L43 com.huawei.hms.feature.dynamic.DynamicModule.g -> Lb5 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lcc
            com.huawei.hms.feature.dynamic.DynamicModule$d r1 = new com.huawei.hms.feature.dynamic.DynamicModule$d     // Catch: java.lang.Exception -> L43 com.huawei.hms.feature.dynamic.DynamicModule.g -> Lb5 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lcc
            r1.<init>(r11)     // Catch: java.lang.Exception -> L43 com.huawei.hms.feature.dynamic.DynamicModule.g -> Lb5 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lcc
            r10.set(r1)     // Catch: java.lang.Exception -> L43 com.huawei.hms.feature.dynamic.DynamicModule.g -> Lb5 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lcc
            return r4
        L9f:
            java.lang.String r10 = "The loaderPath is invalid."
            com.huawei.hms.common.util.Logger.w(r2, r10)     // Catch: java.lang.Exception -> L43 com.huawei.hms.feature.dynamic.DynamicModule.g -> Lb5 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lcc
            com.huawei.hms.feature.dynamic.DynamicModule$LoadingException r10 = new com.huawei.hms.feature.dynamic.DynamicModule$LoadingException     // Catch: java.lang.Exception -> L43 com.huawei.hms.feature.dynamic.DynamicModule.g -> Lb5 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lcc
            java.lang.String r1 = "getHMSModuleInfo: checkPathValidity failed."
            r10.<init>(r1)     // Catch: java.lang.Exception -> L43 com.huawei.hms.feature.dynamic.DynamicModule.g -> Lb5 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lcc
            throw r10     // Catch: java.lang.Exception -> L43 com.huawei.hms.feature.dynamic.DynamicModule.g -> Lb5 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lcc
        Lac:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L76
            throw r10     // Catch: java.lang.Exception -> L43 com.huawei.hms.feature.dynamic.DynamicModule.g -> Lb5 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lcc
        Lae:
            java.lang.String r1 = com.huawei.hms.feature.dynamic.DynamicModule.b
            java.lang.String r2 = "failed to load."
            com.huawei.hms.common.util.Logger.w(r1, r2, r10)
        Lb5:
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r10.put(r11, r0)
            java.lang.ThreadLocal<java.util.HashMap<java.lang.String, java.lang.Boolean>> r11 = com.huawei.hms.feature.dynamic.DynamicModule.e
            r11.set(r10)
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>()
            return r10
        Lcc:
            r10 = move-exception
            throw r10
    }

    public static com.huawei.hms.feature.dynamic.DynamicModule b(android.content.Context r3, com.huawei.hms.feature.dynamic.DynamicModule.VersionPolicy r4, java.lang.String r5, android.os.Bundle r6) throws com.huawei.hms.feature.dynamic.DynamicModule.LoadingException {
            java.lang.String r0 = com.huawei.hms.feature.dynamic.DynamicModule.b
            java.lang.String r1 = "dynamic-api version: 10024300"
            com.huawei.hms.common.util.Logger.i(r0, r1)
            a(r3, r4, r5, r6)
            int r1 = a(r3, r5, r6)     // Catch: java.lang.Exception -> L31 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L50
            r2 = 10015300(0x98d244, float:1.4034425E-38)
            if (r1 < r2) goto L1d
            java.lang.String r1 = "Load start in new-version-policy."
            com.huawei.hms.common.util.Logger.i(r0, r1)     // Catch: java.lang.Exception -> L31 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L50
            com.huawei.hms.feature.dynamic.DynamicModule r3 = a(r3, r5, r4, r6)     // Catch: java.lang.Exception -> L31 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L50
            return r3
        L1d:
            if (r1 <= 0) goto L29
            java.lang.String r6 = "Load start in old-version-policy."
            com.huawei.hms.common.util.Logger.i(r0, r6)     // Catch: java.lang.Exception -> L31 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L50
            com.huawei.hms.feature.dynamic.DynamicModule r3 = a(r3, r5, r4)     // Catch: java.lang.Exception -> L31 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L50
            return r3
        L29:
            com.huawei.hms.feature.dynamic.DynamicModule$LoadingException r3 = new com.huawei.hms.feature.dynamic.DynamicModule$LoadingException     // Catch: java.lang.Exception -> L31 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L50
            java.lang.String r4 = "Cannot find a valid dynamicLoader in HMS and local."
            r3.<init>(r4)     // Catch: java.lang.Exception -> L31 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L50
            throw r3     // Catch: java.lang.Exception -> L31 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L50
        L31:
            r3 = move-exception
            java.lang.String r4 = com.huawei.hms.feature.dynamic.DynamicModule.b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Other exception:"
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            com.huawei.hms.common.util.Logger.e(r4, r3)
            com.huawei.hms.feature.dynamic.DynamicModule$LoadingException r3 = new com.huawei.hms.feature.dynamic.DynamicModule$LoadingException
            java.lang.String r4 = "Load failed."
            r3.<init>(r4)
            throw r3
        L50:
            r3 = move-exception
            throw r3
    }

    public static com.huawei.hms.feature.dynamic.DynamicModule b(android.content.Context r4, java.lang.String r5, android.os.Bundle r6) throws com.huawei.hms.feature.dynamic.DynamicModule.LoadingException {
            java.lang.Class<com.huawei.hms.feature.dynamic.DynamicModule> r0 = com.huawei.hms.feature.dynamic.DynamicModule.class
            monitor-enter(r0)
            java.lang.ThreadLocal<java.util.HashMap<java.lang.String, java.lang.ClassLoader>> r1 = com.huawei.hms.feature.dynamic.DynamicModule.h     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r2 = r1.get()     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r1.get()     // Catch: java.lang.Throwable -> L2c
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r2 = r2.get(r5)     // Catch: java.lang.Throwable -> L2c
            if (r2 != 0) goto L18
            goto L2e
        L18:
            java.lang.String r2 = com.huawei.hms.feature.dynamic.DynamicModule.b     // Catch: java.lang.Throwable -> L2c
            java.lang.String r3 = "Cached loader for module is available, ready to use it."
            com.huawei.hms.common.util.Logger.i(r2, r3)     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L2c
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L2c
            java.lang.ClassLoader r1 = (java.lang.ClassLoader) r1     // Catch: java.lang.Throwable -> L2c
            goto L45
        L2c:
            r4 = move-exception
            goto L81
        L2e:
            java.lang.String r1 = com.huawei.hms.feature.dynamic.DynamicModule.b     // Catch: java.lang.Throwable -> L2c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2c
            r2.<init>()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r3 = "No available cached loader for module:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L2c
            r2.append(r5)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L2c
            com.huawei.hms.common.util.Logger.i(r1, r2)     // Catch: java.lang.Throwable -> L2c
            r1 = 0
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r0 = "loader_path"
            java.lang.String r0 = r6.getString(r0)
            com.huawei.hms.feature.dynamic.IDynamicLoader r0 = a(r4, r5, r0, r1)
            if (r0 == 0) goto L79
            android.content.Context r1 = r4.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            if (r1 != 0) goto L5d
            goto L65
        L5d:
            android.content.Context r4 = r4.getApplicationContext()
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)
        L65:
            android.content.Context r4 = a(r4, r5, r6, r0)
            if (r4 == 0) goto L71
            com.huawei.hms.feature.dynamic.DynamicModule r5 = new com.huawei.hms.feature.dynamic.DynamicModule
            r5.<init>(r4)
            return r5
        L71:
            com.huawei.hms.feature.dynamic.DynamicModule$LoadingException r4 = new com.huawei.hms.feature.dynamic.DynamicModule$LoadingException
            java.lang.String r5 = "New version policy: Failed to get module context: null."
            r4.<init>(r5)
            throw r4
        L79:
            com.huawei.hms.feature.dynamic.DynamicModule$LoadingException r4 = new com.huawei.hms.feature.dynamic.DynamicModule$LoadingException
            java.lang.String r5 = "Failed to get iDynamicLoader: null."
            r4.<init>(r5)
            throw r4
        L81:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            throw r4
    }

    public static com.huawei.hms.feature.dynamic.IDynamicInstall b(android.content.Context r6) throws com.huawei.hms.feature.dynamic.DynamicModule.LoadingException {
            r0 = 0
            r1 = 0
            android.os.Bundle r2 = a(r6, r0)     // Catch: java.lang.Exception -> L13
            java.lang.String r3 = "loader_path"
            java.lang.String r0 = r2.getString(r3)     // Catch: java.lang.Exception -> L13
            java.lang.String r3 = "loader_version"
            int r2 = r2.getInt(r3)     // Catch: java.lang.Exception -> L13
            goto L1c
        L13:
            r2 = move-exception
            java.lang.String r3 = com.huawei.hms.feature.dynamic.DynamicModule.b
            java.lang.String r4 = "Cannot get remote HMS dynamicLoader."
            com.huawei.hms.common.util.Logger.w(r3, r4, r2)
            r2 = 0
        L1c:
            java.lang.String r3 = "huawei_module_dynamicloader"
            int r1 = getLocalVersion(r6, r3)     // Catch: java.lang.Exception -> L23
            goto L2b
        L23:
            r3 = move-exception
            java.lang.String r4 = com.huawei.hms.feature.dynamic.DynamicModule.b
            java.lang.String r5 = "Cannot find local dynamicLoader fallback."
            com.huawei.hms.common.util.Logger.w(r4, r5, r3)
        L2b:
            java.lang.String r3 = com.huawei.hms.feature.dynamic.DynamicModule.b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "DynamicLoader remoteHMSVersion:"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r5 = ", hmsLoaderPath:"
            r4.append(r5)
            r4.append(r0)
            java.lang.String r5 = ", localLoaderVersion:"
            r4.append(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            com.huawei.hms.common.util.Logger.i(r3, r4)
            int r4 = java.lang.Math.max(r2, r1)
            r5 = 10009300(0x98bad4, float:1.4026017E-38)
            if (r4 <= r5) goto L85
            if (r2 <= r1) goto L78
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Choose hms dynamicLoader: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.huawei.hms.common.util.Logger.i(r3, r1)
            r1 = 1
            com.huawei.hms.feature.dynamic.DynamicModule.i = r1
            com.huawei.hms.feature.dynamic.IDynamicInstall r6 = a(r6, r0)
            return r6
        L78:
            java.lang.String r0 = "Choose local dynamicLoader fallback: "
            com.huawei.hms.common.util.Logger.i(r3, r0)
            r0 = 2
            com.huawei.hms.feature.dynamic.DynamicModule.i = r0
            com.huawei.hms.feature.dynamic.IDynamicInstall r6 = c(r6)
            return r6
        L85:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "The current version:"
            r6.append(r0)
            r6.append(r4)
            java.lang.String r0 = " is too low."
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            com.huawei.hms.common.util.Logger.w(r3, r6)
            com.huawei.hms.feature.dynamic.DynamicModule$LoadingException r6 = new com.huawei.hms.feature.dynamic.DynamicModule$LoadingException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "The loader version:"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = " is too low to support HFF."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
    }

    public static android.os.Bundle c(android.content.Context r3, java.lang.String r4) throws com.huawei.hms.feature.dynamic.DynamicModule.LoadingException, com.huawei.hms.feature.dynamic.DynamicModule.g {
            android.os.Bundle r3 = queryHMSModuleBundle(r3, r4)     // Catch: java.lang.Exception -> L68 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L71
            java.lang.String r0 = "loader_path"
            java.lang.String r0 = r3.getString(r0)     // Catch: java.lang.Exception -> L68 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L71
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L68 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L71
            if (r1 != 0) goto L42
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L68 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L71
            r1.<init>(r0)     // Catch: java.lang.Exception -> L68 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L71
            boolean r1 = r1.exists()     // Catch: java.lang.Exception -> L68 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L71
            if (r1 != 0) goto L1c
            goto L42
        L1c:
            java.lang.ThreadLocal<java.util.HashMap<java.lang.String, java.lang.String>> r1 = com.huawei.hms.feature.dynamic.DynamicModule.f     // Catch: java.lang.Exception -> L68 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L71
            com.huawei.hms.feature.dynamic.DynamicModule$e r2 = new com.huawei.hms.feature.dynamic.DynamicModule$e     // Catch: java.lang.Exception -> L68 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L71
            r2.<init>(r4, r0)     // Catch: java.lang.Exception -> L68 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L71
            r1.set(r2)     // Catch: java.lang.Exception -> L68 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L71
            java.lang.String r0 = com.huawei.hms.feature.dynamic.DynamicModule.b     // Catch: java.lang.Exception -> L68 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L71
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L68 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L71
            r1.<init>()     // Catch: java.lang.Exception -> L68 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L71
            java.lang.String r2 = "Query remote version by module name:"
            r1.append(r2)     // Catch: java.lang.Exception -> L68 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L71
            r1.append(r4)     // Catch: java.lang.Exception -> L68 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L71
            java.lang.String r4 = " success."
            r1.append(r4)     // Catch: java.lang.Exception -> L68 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L71
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Exception -> L68 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L71
            com.huawei.hms.common.util.Logger.i(r0, r4)     // Catch: java.lang.Exception -> L68 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L71
            return r3
        L42:
            java.lang.String r4 = com.huawei.hms.feature.dynamic.DynamicModule.b     // Catch: java.lang.Exception -> L68 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L71
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L68 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L71
            r1.<init>()     // Catch: java.lang.Exception -> L68 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L71
            java.lang.String r2 = "The loader_path:"
            r1.append(r2)     // Catch: java.lang.Exception -> L68 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L71
            r1.append(r0)     // Catch: java.lang.Exception -> L68 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L71
            java.lang.String r0 = " in query bundle is not available,change the module version to:"
            r1.append(r0)     // Catch: java.lang.Exception -> L68 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L71
            r0 = -100
            r1.append(r0)     // Catch: java.lang.Exception -> L68 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L71
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L68 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L71
            com.huawei.hms.common.util.Logger.w(r4, r1)     // Catch: java.lang.Exception -> L68 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L71
            java.lang.String r4 = "module_version"
            r3.putInt(r4, r0)     // Catch: java.lang.Exception -> L68 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L71
            return r3
        L68:
            com.huawei.hms.feature.dynamic.DynamicModule$g r3 = new com.huawei.hms.feature.dynamic.DynamicModule$g
            java.lang.String r4 = "failed to Query remote version."
            r0 = 0
            r3.<init>(r4, r0)
            throw r3
        L71:
            r3 = move-exception
            throw r3
    }

    public static com.huawei.hms.feature.dynamic.DynamicModule c(android.content.Context r3, java.lang.String r4, android.os.Bundle r5) throws com.huawei.hms.feature.dynamic.DynamicModule.LoadingException {
            java.lang.Class<com.huawei.hms.feature.dynamic.DynamicModule> r0 = com.huawei.hms.feature.dynamic.DynamicModule.class
            monitor-enter(r0)     // Catch: java.lang.Exception -> L70 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L78
            java.lang.ThreadLocal<java.util.HashMap<java.lang.String, java.lang.Boolean>> r1 = com.huawei.hms.feature.dynamic.DynamicModule.e     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L6d
            java.util.Objects.requireNonNull(r1)     // Catch: java.lang.Throwable -> L6d
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L6d
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L6d
            java.lang.ThreadLocal<java.util.HashMap<java.lang.String, com.huawei.hms.feature.dynamic.IDynamicLoader>> r2 = com.huawei.hms.feature.dynamic.DynamicModule.g     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L6d
            java.util.Objects.requireNonNull(r2)     // Catch: java.lang.Throwable -> L6d
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r2 = r2.get(r4)     // Catch: java.lang.Throwable -> L6d
            com.huawei.hms.feature.dynamic.IDynamicLoader r2 = (com.huawei.hms.feature.dynamic.IDynamicLoader) r2     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            if (r1 == 0) goto L51
            if (r2 == 0) goto L51
            android.content.Context r0 = r3.getApplicationContext()     // Catch: java.lang.Exception -> L70 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L78
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)     // Catch: java.lang.Exception -> L70 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L78
            if (r0 != 0) goto L35
            goto L3d
        L35:
            android.content.Context r3 = r3.getApplicationContext()     // Catch: java.lang.Exception -> L70 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L78
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)     // Catch: java.lang.Exception -> L70 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L78
        L3d:
            android.content.Context r3 = a(r3, r4, r5, r2)     // Catch: java.lang.Exception -> L70 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L78
            if (r3 == 0) goto L49
            com.huawei.hms.feature.dynamic.DynamicModule r4 = new com.huawei.hms.feature.dynamic.DynamicModule     // Catch: java.lang.Exception -> L70 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L78
            r4.<init>(r3)     // Catch: java.lang.Exception -> L70 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L78
            return r4
        L49:
            com.huawei.hms.feature.dynamic.DynamicModule$LoadingException r3 = new com.huawei.hms.feature.dynamic.DynamicModule$LoadingException     // Catch: java.lang.Exception -> L70 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L78
            java.lang.String r4 = "Failed to get remote module context: null"
            r3.<init>(r4)     // Catch: java.lang.Exception -> L70 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L78
            throw r3     // Catch: java.lang.Exception -> L70 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L78
        L51:
            com.huawei.hms.feature.dynamic.DynamicModule$LoadingException r3 = new com.huawei.hms.feature.dynamic.DynamicModule$LoadingException     // Catch: java.lang.Exception -> L70 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L78
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L70 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L78
            r5.<init>()     // Catch: java.lang.Exception -> L70 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L78
            java.lang.String r0 = "The loader for "
            r5.append(r0)     // Catch: java.lang.Exception -> L70 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L78
            r5.append(r4)     // Catch: java.lang.Exception -> L70 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L78
            java.lang.String r4 = " was not prepared."
            r5.append(r4)     // Catch: java.lang.Exception -> L70 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L78
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Exception -> L70 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L78
            r3.<init>(r4)     // Catch: java.lang.Exception -> L70 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L78
            throw r3     // Catch: java.lang.Exception -> L70 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L78
        L6d:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            throw r3     // Catch: java.lang.Exception -> L70 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L78
        L70:
            com.huawei.hms.feature.dynamic.DynamicModule$LoadingException r3 = new com.huawei.hms.feature.dynamic.DynamicModule$LoadingException
            java.lang.String r4 = "Load Module Error."
            r3.<init>(r4)
            throw r3
        L78:
            r3 = move-exception
            throw r3
    }

    public static com.huawei.hms.feature.dynamic.IDynamicInstall c(android.content.Context r3) throws com.huawei.hms.feature.dynamic.DynamicModule.LoadingException {
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L11 java.lang.InstantiationException -> L13 java.lang.IllegalAccessException -> L15
            java.lang.String r0 = "com.huawei.hms.dynamicloader.DynamicInstaller"
            java.lang.Class r3 = r3.loadClass(r0)     // Catch: java.lang.ClassNotFoundException -> L11 java.lang.InstantiationException -> L13 java.lang.IllegalAccessException -> L15
            java.lang.Object r3 = r3.newInstance()     // Catch: java.lang.ClassNotFoundException -> L11 java.lang.InstantiationException -> L13 java.lang.IllegalAccessException -> L15
            com.huawei.hms.feature.dynamic.IDynamicInstall r3 = (com.huawei.hms.feature.dynamic.IDynamicInstall) r3     // Catch: java.lang.ClassNotFoundException -> L11 java.lang.InstantiationException -> L13 java.lang.IllegalAccessException -> L15
            return r3
        L11:
            r3 = move-exception
            goto L16
        L13:
            r3 = move-exception
            goto L16
        L15:
            r3 = move-exception
        L16:
            com.huawei.hms.feature.dynamic.DynamicModule$LoadingException r0 = new com.huawei.hms.feature.dynamic.DynamicModule$LoadingException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getLocalLoaderFallback: failed to instantiate dynamic loader: "
            r1.append(r2)
            java.lang.String r3 = r3.getMessage()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public static void enable3rdPhone(java.lang.String r1, boolean r2) {
            java.util.HashMap<java.lang.String, java.lang.Boolean> r0 = com.huawei.hms.feature.dynamic.DynamicModule.m
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.put(r1, r2)
            return
    }

    public static void enableLowEMUI(java.lang.String r1, boolean r2) {
            java.util.HashMap<java.lang.String, java.lang.Boolean> r0 = com.huawei.hms.feature.dynamic.DynamicModule.n
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.put(r1, r2)
            return
    }

    public static java.util.Set<java.lang.String> getInstalledModuleInfo() {
            com.huawei.hms.feature.dynamic.d r0 = com.huawei.hms.feature.dynamic.d.a()
            java.util.Set<java.lang.String> r0 = r0.a
            return r0
    }

    public static android.os.Bundle getLocalModuleInfo(android.content.Context r2, java.lang.String r3) {
            int r2 = getLocalVersion(r2, r3)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "module_name"
            r0.putString(r1, r3)
            java.lang.String r3 = "local_module_version"
            r0.putInt(r3, r2)
            return r0
    }

    public static int getLocalVersion(android.content.Context r3, java.lang.String r4) {
            r0 = 0
            if (r3 == 0) goto L6f
            int r1 = r4.length()
            if (r1 == 0) goto L6f
            int r1 = r4.length()
            r2 = 256(0x100, float:3.59E-43)
            if (r1 <= r2) goto L12
            goto L6f
        L12:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4f java.lang.ClassNotFoundException -> L58
            r1.<init>()     // Catch: java.lang.Exception -> L4f java.lang.ClassNotFoundException -> L58
            java.lang.String r2 = "com.huawei.hms.feature.dynamic.descriptors."
            r1.append(r2)     // Catch: java.lang.Exception -> L4f java.lang.ClassNotFoundException -> L58
            r1.append(r4)     // Catch: java.lang.Exception -> L4f java.lang.ClassNotFoundException -> L58
            java.lang.String r2 = ".ModuleDescriptor"
            r1.append(r2)     // Catch: java.lang.Exception -> L4f java.lang.ClassNotFoundException -> L58
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L4f java.lang.ClassNotFoundException -> L58
            android.content.Context r2 = r3.getApplicationContext()     // Catch: java.lang.Exception -> L4f java.lang.ClassNotFoundException -> L58
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)     // Catch: java.lang.Exception -> L4f java.lang.ClassNotFoundException -> L58
            if (r2 != 0) goto L33
            goto L3b
        L33:
            android.content.Context r3 = r3.getApplicationContext()     // Catch: java.lang.Exception -> L4f java.lang.ClassNotFoundException -> L58
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)     // Catch: java.lang.Exception -> L4f java.lang.ClassNotFoundException -> L58
        L3b:
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.Exception -> L4f java.lang.ClassNotFoundException -> L58
            java.lang.Class r3 = r3.loadClass(r1)     // Catch: java.lang.Exception -> L4f java.lang.ClassNotFoundException -> L58
            java.lang.String r1 = "MODULE_VERSION"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r1)     // Catch: java.lang.Exception -> L4f java.lang.ClassNotFoundException -> L58
            r1 = 0
            int r3 = r3.getInt(r1)     // Catch: java.lang.Exception -> L4f java.lang.ClassNotFoundException -> L58
            return r3
        L4f:
            r3 = move-exception
            java.lang.String r4 = com.huawei.hms.feature.dynamic.DynamicModule.b
            java.lang.String r1 = "Get local module info failed."
            com.huawei.hms.common.util.Logger.w(r4, r1, r3)
            goto L6e
        L58:
            java.lang.String r3 = com.huawei.hms.feature.dynamic.DynamicModule.b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot find the class of module descriptor for "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            com.huawei.hms.common.util.Logger.w(r3, r4)
        L6e:
            return r0
        L6f:
            java.lang.String r3 = com.huawei.hms.feature.dynamic.DynamicModule.b
            java.lang.String r4 = "Invalid context or moduleName."
            com.huawei.hms.common.util.Logger.e(r3, r4)
            return r0
    }

    public static android.os.Bundle getRemoteModuleInfo(android.content.Context r4, java.lang.String r5) throws com.huawei.hms.feature.dynamic.DynamicModule.LoadingException {
            java.lang.Class<com.huawei.hms.feature.dynamic.DynamicModule> r0 = com.huawei.hms.feature.dynamic.DynamicModule.class
            monitor-enter(r0)     // Catch: java.lang.Exception -> L52 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L80
            java.lang.ThreadLocal<java.util.HashMap<java.lang.String, java.lang.Boolean>> r1 = com.huawei.hms.feature.dynamic.DynamicModule.e     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r2 = r1.get()     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r1.get()     // Catch: java.lang.Throwable -> L2a
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r2 = r2.get(r5)     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r1.get()     // Catch: java.lang.Throwable -> L2a
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r2 = r2.get(r5)     // Catch: java.lang.Throwable -> L2a
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L2a
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L2a
            if (r2 != 0) goto L3a
            goto L2c
        L2a:
            r4 = move-exception
            goto L5d
        L2c:
            android.os.Bundle r2 = b(r4, r5)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r3 = "module_version"
            int r3 = r2.getInt(r3)     // Catch: java.lang.Throwable -> L2a
            if (r3 <= 0) goto L3a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            return r2
        L3a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r0 = r1.get()     // Catch: java.lang.Exception -> L52 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L80
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch: java.lang.Exception -> L52 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L80
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Exception -> L52 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L80
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L52 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L80
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L52 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L80
            if (r0 == 0) goto L7a
            android.os.Bundle r4 = c(r4, r5)     // Catch: java.lang.Exception -> L52 com.huawei.hms.feature.dynamic.DynamicModule.g -> L54 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L80
            return r4
        L52:
            r4 = move-exception
            goto L5f
        L54:
            r4 = move-exception
            java.lang.String r0 = com.huawei.hms.feature.dynamic.DynamicModule.b     // Catch: java.lang.Exception -> L52 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L80
            java.lang.String r1 = "Query remote module info in HMS failed."
            com.huawei.hms.common.util.Logger.w(r0, r1, r4)     // Catch: java.lang.Exception -> L52 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L80
            goto L7a
        L5d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            throw r4     // Catch: java.lang.Exception -> L52 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L80
        L5f:
            java.lang.String r0 = com.huawei.hms.feature.dynamic.DynamicModule.b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Get remote module info for "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = " failed."
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            com.huawei.hms.common.util.Logger.w(r0, r5, r4)
        L7a:
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            return r4
        L80:
            r4 = move-exception
            throw r4
    }

    public static int getRemoteVersion(android.content.Context r3, java.lang.String r4) throws com.huawei.hms.feature.dynamic.DynamicModule.LoadingException {
            java.lang.String r0 = "Query remote module:"
            android.os.Bundle r3 = c(r3, r4)     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.g -> L15
            if (r3 == 0) goto L17
            boolean r1 = r3.isEmpty()     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.g -> L15
            if (r1 != 0) goto L17
            java.lang.String r1 = "module_version"
            int r3 = r3.getInt(r1)     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.g -> L15
            return r3
        L15:
            r3 = move-exception
            goto L38
        L17:
            java.lang.String r3 = com.huawei.hms.feature.dynamic.DynamicModule.b     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.g -> L15
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.g -> L15
            r1.<init>()     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.g -> L15
            r1.append(r0)     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.g -> L15
            r1.append(r4)     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.g -> L15
            java.lang.String r2 = " info failed."
            r1.append(r2)     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.g -> L15
            java.lang.String r1 = r1.toString()     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.g -> L15
            com.huawei.hms.common.util.Logger.w(r3, r1)     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.g -> L15
            com.huawei.hms.feature.dynamic.DynamicModule$LoadingException r3 = new com.huawei.hms.feature.dynamic.DynamicModule$LoadingException     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.g -> L15
            java.lang.String r1 = "Query remote module info failed: null or empty."
            r3.<init>(r1)     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.g -> L15
            throw r3     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.g -> L15
        L38:
            java.lang.String r1 = com.huawei.hms.feature.dynamic.DynamicModule.b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r4)
            java.lang.String r4 = " exception:"
            r2.append(r4)
            r2.append(r3)
            java.lang.String r3 = r2.toString()
            com.huawei.hms.common.util.Logger.w(r1, r3)
            r3 = 0
            return r3
    }

    public static void install(android.content.Context r3, int r4) {
            java.lang.String r0 = com.huawei.hms.feature.dynamic.DynamicModule.b
            java.lang.String r1 = "dynamic-api version: 10024300"
            com.huawei.hms.common.util.Logger.i(r0, r1)
            if (r3 != 0) goto Lf
            java.lang.String r3 = "The input context is null."
            com.huawei.hms.common.util.Logger.e(r0, r3)
            return
        Lf:
            com.huawei.hms.feature.dynamic.DynamicModule.l = r4     // Catch: java.lang.NullPointerException -> L4e android.os.RemoteException -> L50 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L52
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.NullPointerException -> L4e android.os.RemoteException -> L50 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L52
            r4.<init>()     // Catch: java.lang.NullPointerException -> L4e android.os.RemoteException -> L50 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L52
            java.lang.String r1 = "Query HMS provider timeOut is set to:"
            r4.append(r1)     // Catch: java.lang.NullPointerException -> L4e android.os.RemoteException -> L50 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L52
            int r1 = com.huawei.hms.feature.dynamic.DynamicModule.l     // Catch: java.lang.NullPointerException -> L4e android.os.RemoteException -> L50 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L52
            r4.append(r1)     // Catch: java.lang.NullPointerException -> L4e android.os.RemoteException -> L50 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L52
            java.lang.String r1 = " ms."
            r4.append(r1)     // Catch: java.lang.NullPointerException -> L4e android.os.RemoteException -> L50 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L52
            java.lang.String r4 = r4.toString()     // Catch: java.lang.NullPointerException -> L4e android.os.RemoteException -> L50 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L52
            com.huawei.hms.common.util.Logger.i(r0, r4)     // Catch: java.lang.NullPointerException -> L4e android.os.RemoteException -> L50 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L52
            com.huawei.hms.feature.dynamic.IDynamicInstall r4 = b(r3)     // Catch: java.lang.NullPointerException -> L4e android.os.RemoteException -> L50 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L52
            if (r4 == 0) goto L5c
            com.huawei.hms.feature.dynamic.IObjectWrapper r1 = com.huawei.hms.feature.dynamic.ObjectWrapper.wrap(r3)     // Catch: java.lang.NullPointerException -> L4e android.os.RemoteException -> L50 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L52
            android.os.Bundle r2 = new android.os.Bundle     // Catch: java.lang.NullPointerException -> L4e android.os.RemoteException -> L50 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L52
            r2.<init>()     // Catch: java.lang.NullPointerException -> L4e android.os.RemoteException -> L50 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L52
            android.os.Bundle r4 = r4.install(r1, r2)     // Catch: java.lang.NullPointerException -> L4e android.os.RemoteException -> L50 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L52
            if (r4 == 0) goto L54
            com.huawei.hms.feature.dynamic.d r1 = com.huawei.hms.feature.dynamic.d.a()     // Catch: java.lang.NullPointerException -> L4e android.os.RemoteException -> L50 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L52
            r1.a(r4)     // Catch: java.lang.NullPointerException -> L4e android.os.RemoteException -> L50 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L52
            java.lang.String r4 = "Install module success."
            com.huawei.hms.common.util.Logger.i(r0, r4)     // Catch: java.lang.NullPointerException -> L4e android.os.RemoteException -> L50 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L52
            return
        L4e:
            r4 = move-exception
            goto L64
        L50:
            r4 = move-exception
            goto L64
        L52:
            r4 = move-exception
            goto L64
        L54:
            com.huawei.hms.feature.dynamic.DynamicModule$LoadingException r4 = new com.huawei.hms.feature.dynamic.DynamicModule$LoadingException     // Catch: java.lang.NullPointerException -> L4e android.os.RemoteException -> L50 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L52
            java.lang.String r0 = "Get install info failed: moduleBundle is null."
            r4.<init>(r0)     // Catch: java.lang.NullPointerException -> L4e android.os.RemoteException -> L50 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L52
            throw r4     // Catch: java.lang.NullPointerException -> L4e android.os.RemoteException -> L50 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L52
        L5c:
            com.huawei.hms.feature.dynamic.DynamicModule$LoadingException r4 = new com.huawei.hms.feature.dynamic.DynamicModule$LoadingException     // Catch: java.lang.NullPointerException -> L4e android.os.RemoteException -> L50 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L52
            java.lang.String r0 = "Get dynamicInstaller failed."
            r4.<init>(r0)     // Catch: java.lang.NullPointerException -> L4e android.os.RemoteException -> L50 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L52
            throw r4     // Catch: java.lang.NullPointerException -> L4e android.os.RemoteException -> L50 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L52
        L64:
            int r0 = com.huawei.hms.feature.dynamic.DynamicModule.i
            r1 = 2
            if (r0 == r1) goto Lad
            java.lang.String r0 = "huawei_module_dynamicloader"
            int r0 = getLocalVersion(r3, r0)
            if (r0 <= 0) goto Lad
            java.lang.String r4 = com.huawei.hms.feature.dynamic.DynamicModule.b
            java.lang.String r0 = "Ready to use local loader-fallback to retry:"
            com.huawei.hms.common.util.Logger.i(r4, r0)
            com.huawei.hms.feature.dynamic.IDynamicInstall r0 = c(r3)     // Catch: java.lang.NullPointerException -> La0 android.os.RemoteException -> La2 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> La4
            com.huawei.hms.feature.dynamic.IObjectWrapper r3 = com.huawei.hms.feature.dynamic.ObjectWrapper.wrap(r3)     // Catch: java.lang.NullPointerException -> La0 android.os.RemoteException -> La2 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> La4
            android.os.Bundle r1 = new android.os.Bundle     // Catch: java.lang.NullPointerException -> La0 android.os.RemoteException -> La2 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> La4
            r1.<init>()     // Catch: java.lang.NullPointerException -> La0 android.os.RemoteException -> La2 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> La4
            android.os.Bundle r3 = r0.install(r3, r1)     // Catch: java.lang.NullPointerException -> La0 android.os.RemoteException -> La2 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> La4
            if (r3 == 0) goto L98
            com.huawei.hms.feature.dynamic.d r0 = com.huawei.hms.feature.dynamic.d.a()     // Catch: java.lang.NullPointerException -> La0 android.os.RemoteException -> La2 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> La4
            r0.a(r3)     // Catch: java.lang.NullPointerException -> La0 android.os.RemoteException -> La2 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> La4
            java.lang.String r3 = "Retry install module with local loader-fallback success."
            com.huawei.hms.common.util.Logger.i(r4, r3)     // Catch: java.lang.NullPointerException -> La0 android.os.RemoteException -> La2 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> La4
            goto Lb4
        L98:
            com.huawei.hms.feature.dynamic.DynamicModule$LoadingException r3 = new com.huawei.hms.feature.dynamic.DynamicModule$LoadingException     // Catch: java.lang.NullPointerException -> La0 android.os.RemoteException -> La2 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> La4
            java.lang.String r4 = "Retry: get install info failed: moduleBundle is null."
            r3.<init>(r4)     // Catch: java.lang.NullPointerException -> La0 android.os.RemoteException -> La2 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> La4
            throw r3     // Catch: java.lang.NullPointerException -> La0 android.os.RemoteException -> La2 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> La4
        La0:
            r3 = move-exception
            goto La5
        La2:
            r3 = move-exception
            goto La5
        La4:
            r3 = move-exception
        La5:
            java.lang.String r4 = com.huawei.hms.feature.dynamic.DynamicModule.b
            java.lang.String r0 = "Retry failed with local loader-fallback."
            com.huawei.hms.common.util.Logger.w(r4, r0, r3)
            goto Lb4
        Lad:
            java.lang.String r3 = com.huawei.hms.feature.dynamic.DynamicModule.b
            java.lang.String r0 = "Install module failed."
            com.huawei.hms.common.util.Logger.w(r3, r0, r4)
        Lb4:
            return
    }

    public static com.huawei.hms.feature.dynamic.DynamicModule load(android.content.Context r1, com.huawei.hms.feature.dynamic.DynamicModule.VersionPolicy r2, java.lang.String r3) throws com.huawei.hms.feature.dynamic.DynamicModule.LoadingException {
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            com.huawei.hms.feature.dynamic.DynamicModule r1 = b(r1, r2, r3, r0)
            return r1
    }

    public static com.huawei.hms.feature.dynamic.DynamicModule loadV2(android.content.Context r3, com.huawei.hms.feature.dynamic.DynamicModule.VersionPolicy r4, java.lang.String r5) throws com.huawei.hms.feature.dynamic.DynamicModule.LoadingException {
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "loader_version_type"
            java.lang.String r2 = "v2"
            r0.putString(r1, r2)
            com.huawei.hms.feature.dynamic.DynamicModule r3 = b(r3, r4, r5, r0)
            return r3
    }

    public static com.huawei.hms.feature.dynamic.DynamicModule loadV3(android.content.Context r1, com.huawei.hms.feature.dynamic.DynamicModule.VersionPolicy r2, java.lang.String r3) throws com.huawei.hms.feature.dynamic.DynamicModule.LoadingException {
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            com.huawei.hms.feature.dynamic.DynamicModule r1 = loadV3(r1, r2, r3, r0)
            return r1
    }

    public static com.huawei.hms.feature.dynamic.DynamicModule loadV3(android.content.Context r2, com.huawei.hms.feature.dynamic.DynamicModule.VersionPolicy r3, java.lang.String r4, android.os.Bundle r5) throws com.huawei.hms.feature.dynamic.DynamicModule.LoadingException {
            java.lang.String r0 = "loader_version_type"
            java.lang.String r1 = "v3"
            r5.putString(r0, r1)
            com.huawei.hms.feature.dynamic.DynamicModule r2 = b(r2, r3, r4, r5)
            return r2
    }

    public static android.os.Bundle queryHMSModuleBundle(android.content.Context r1, java.lang.String r2) throws com.huawei.hms.feature.dynamic.DynamicModule.LoadingException, com.huawei.hms.feature.dynamic.DynamicModule.g {
            r0 = 0
            android.os.Bundle r1 = queryHMSModuleBundle(r1, r2, r0)
            return r1
    }

    public static android.os.Bundle queryHMSModuleBundle(android.content.Context r5, java.lang.String r6, android.os.Bundle r7) throws com.huawei.hms.feature.dynamic.DynamicModule.LoadingException, com.huawei.hms.feature.dynamic.DynamicModule.g {
            r0 = 0
            boolean r1 = com.huawei.hms.feature.dynamic.f.c.a(r5)     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            if (r1 == 0) goto Ld0
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            if (r5 == 0) goto Lc8
            java.lang.String r1 = "content://com.huawei.hms"
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            android.os.Bundle r5 = r5.call(r1, r6, r0, r7)     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            if (r5 == 0) goto Lb9
            java.lang.String r7 = "errcode"
            int r7 = r5.getInt(r7)     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            java.lang.String r1 = "loader_path"
            java.lang.String r1 = r5.getString(r1)     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            java.lang.String r2 = com.huawei.hms.feature.dynamic.DynamicModule.b     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            r3.<init>()     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            java.lang.String r4 = "bundle info: errorCode:"
            r3.append(r4)     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            r3.append(r7)     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            java.lang.String r4 = ", moduleVersion:"
            r3.append(r4)     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            java.lang.String r4 = "module_version"
            int r4 = r5.getInt(r4)     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            r3.append(r4)     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            java.lang.String r4 = ", modulePath:"
            r3.append(r4)     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            java.lang.String r4 = "module_path"
            java.lang.String r4 = r5.getString(r4)     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            r3.append(r4)     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            java.lang.String r4 = ", loader_version:"
            r3.append(r4)     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            java.lang.String r4 = "loader_version"
            int r4 = r5.getInt(r4)     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            r3.append(r4)     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            java.lang.String r4 = ", loaderPath:"
            r3.append(r4)     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            r3.append(r1)     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            java.lang.String r1 = ", armeabiType:"
            r3.append(r1)     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            java.lang.String r1 = "armeabiType"
            int r1 = r5.getInt(r1)     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            r3.append(r1)     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            com.huawei.hms.common.util.Logger.i(r2, r1)     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            if (r7 != 0) goto L7e
            return r5
        L7e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            r1.<init>()     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            java.lang.String r3 = "Failed to get "
            r1.append(r3)     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            r1.append(r6)     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            java.lang.String r3 = " bundle info, errcode:"
            r1.append(r3)     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            r1.append(r7)     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            com.huawei.hms.common.util.Logger.w(r2, r1)     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            com.huawei.hms.feature.dynamic.DynamicModule$LoadingException r1 = new com.huawei.hms.feature.dynamic.DynamicModule$LoadingException     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            r2.<init>()     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            java.lang.String r3 = "Query "
            r2.append(r3)     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            r2.append(r6)     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            java.lang.String r3 = " unavailable, errorCode:"
            r2.append(r3)     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            r2.append(r7)     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            java.lang.String r7 = r2.toString()     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            r1.<init>(r7, r5)     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            throw r1     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
        Lb9:
            java.lang.String r5 = com.huawei.hms.feature.dynamic.DynamicModule.b     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            java.lang.String r7 = "Failed to get bundle info:null."
            com.huawei.hms.common.util.Logger.w(r5, r7)     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            com.huawei.hms.feature.dynamic.DynamicModule$g r5 = new com.huawei.hms.feature.dynamic.DynamicModule$g     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            java.lang.String r7 = "Query remote version failed: null bundle info."
            r5.<init>(r7, r0)     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            throw r5     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
        Lc8:
            com.huawei.hms.feature.dynamic.DynamicModule$g r5 = new com.huawei.hms.feature.dynamic.DynamicModule$g     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            java.lang.String r7 = "Query remote version failed: null contentResolver."
            r5.<init>(r7, r0)     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            throw r5     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
        Ld0:
            java.lang.String r5 = com.huawei.hms.feature.dynamic.DynamicModule.b     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            java.lang.String r7 = "No valid HMS Core in this device."
            com.huawei.hms.common.util.Logger.w(r5, r7)     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            com.huawei.hms.feature.dynamic.DynamicModule$g r5 = new com.huawei.hms.feature.dynamic.DynamicModule$g     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            java.lang.String r7 = "HMS Core is not installed."
            r5.<init>(r7, r0)     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
            throw r5     // Catch: java.lang.Exception -> Ldf com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> Lfb
        Ldf:
            com.huawei.hms.feature.dynamic.DynamicModule$g r5 = new com.huawei.hms.feature.dynamic.DynamicModule$g
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "failed to get :"
            r7.append(r1)
            r7.append(r6)
            java.lang.String r6 = " info from HMS Core."
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.<init>(r6, r0)
            throw r5
        Lfb:
            r5 = move-exception
            throw r5
    }

    public final android.content.Context getModuleContext() {
            r1 = this;
            android.content.Context r0 = r1.a
            return r0
    }
}
