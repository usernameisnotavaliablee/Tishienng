package com.huawei.hms.hmsscankit;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class g {
    public static boolean a = false;
    public static boolean b = false;
    public static boolean c = false;
    static int d = Integer.MIN_VALUE;
    static int e = Integer.MIN_VALUE;
    private static volatile android.content.Context f;

    static {
            return
    }

    public g() {
            r1 = this;
            r1.<init>()
            return
    }

    public static int a(android.content.Context r3) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            android.content.pm.PackageManager r1 = r3.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1a
            java.lang.String r3 = r3.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1a
            r2 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r3 = r1.getApplicationInfo(r3, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1a
            android.os.Bundle r3 = r3.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1a
            java.lang.String r1 = "huawei_module_scankit_local"
            int r3 = r3.getInt(r1, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1a
            return r3
        L1a:
            java.lang.String r3 = "exception"
            java.lang.String r1 = "NameNotFoundException"
            com.huawei.hms.scankit.p.o4.b(r3, r1)
            return r0
    }

    public static boolean a() {
            boolean r0 = com.huawei.hms.hmsscankit.g.c
            if (r0 == 0) goto Le
            boolean r0 = com.huawei.hms.hmsscankit.g.a
            if (r0 == 0) goto Le
            boolean r0 = com.huawei.hms.hmsscankit.g.b
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public static void b(android.content.Context r5) throws java.lang.ClassNotFoundException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException {
            java.lang.ClassLoader r0 = r5.getClassLoader()
            java.lang.String r1 = "com.huawei.hms.feature.DynamicModuleInitializer"
            java.lang.Class r0 = r0.loadClass(r1)
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]
            r3 = 0
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r2[r3] = r4
            java.lang.String r4 = "initializeModule"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r2)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r5
            r5 = 0
            r0.invoke(r5, r1)
            return
    }

    static com.huawei.hms.hmsscankit.api.IRemoteCreator c(android.content.Context r3) {
            java.lang.String r0 = "exception"
            com.huawei.hms.common.Preconditions.checkNotNull(r3)
            r1 = 0
            android.content.Context r3 = e(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.NoSuchMethodException -> L2c java.lang.IllegalAccessException -> L32 java.lang.InstantiationException -> L38 java.lang.ClassNotFoundException -> L3e
            if (r3 != 0) goto Ld
            return r1
        Ld:
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.NoSuchMethodException -> L2c java.lang.IllegalAccessException -> L32 java.lang.InstantiationException -> L38 java.lang.ClassNotFoundException -> L3e
            java.lang.String r2 = "com.huawei.hms.scankit.Creator"
            java.lang.Class r3 = r3.loadClass(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.NoSuchMethodException -> L2c java.lang.IllegalAccessException -> L32 java.lang.InstantiationException -> L38 java.lang.ClassNotFoundException -> L3e
            java.lang.Object r3 = r3.newInstance()     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.NoSuchMethodException -> L2c java.lang.IllegalAccessException -> L32 java.lang.InstantiationException -> L38 java.lang.ClassNotFoundException -> L3e
            boolean r2 = r3 instanceof android.os.IBinder     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.NoSuchMethodException -> L2c java.lang.IllegalAccessException -> L32 java.lang.InstantiationException -> L38 java.lang.ClassNotFoundException -> L3e
            if (r2 == 0) goto L43
            android.os.IBinder r3 = (android.os.IBinder) r3     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.NoSuchMethodException -> L2c java.lang.IllegalAccessException -> L32 java.lang.InstantiationException -> L38 java.lang.ClassNotFoundException -> L3e
            com.huawei.hms.hmsscankit.api.IRemoteCreator r3 = com.huawei.hms.hmsscankit.api.IRemoteCreator.Stub.asInterface(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.NoSuchMethodException -> L2c java.lang.IllegalAccessException -> L32 java.lang.InstantiationException -> L38 java.lang.ClassNotFoundException -> L3e
            return r3
        L26:
            java.lang.String r3 = "InvocationTargetException"
            com.huawei.hms.scankit.p.o4.b(r0, r3)
            goto L43
        L2c:
            java.lang.String r3 = "NoSuchMethodException"
            com.huawei.hms.scankit.p.o4.b(r0, r3)
            goto L43
        L32:
            java.lang.String r3 = "IllegalAccessException"
            com.huawei.hms.scankit.p.o4.b(r0, r3)
            goto L43
        L38:
            java.lang.String r3 = "InstantiationException"
            com.huawei.hms.scankit.p.o4.b(r0, r3)
            goto L43
        L3e:
            java.lang.String r3 = "ClassNotFoundException"
            com.huawei.hms.scankit.p.o4.b(r0, r3)
        L43:
            return r1
    }

    static com.huawei.hms.hmsscankit.api.IRemoteCreator d(android.content.Context r2) {
            java.lang.String r0 = "exception"
            com.huawei.hms.common.Preconditions.checkNotNull(r2)
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.InstantiationException -> L1e java.lang.IllegalAccessException -> L24 java.lang.ClassNotFoundException -> L2a
            java.lang.String r1 = "com.huawei.hms.scankit.Creator"
            java.lang.Class r2 = r2.loadClass(r1)     // Catch: java.lang.InstantiationException -> L1e java.lang.IllegalAccessException -> L24 java.lang.ClassNotFoundException -> L2a
            java.lang.Object r2 = r2.newInstance()     // Catch: java.lang.InstantiationException -> L1e java.lang.IllegalAccessException -> L24 java.lang.ClassNotFoundException -> L2a
            boolean r1 = r2 instanceof android.os.IBinder     // Catch: java.lang.InstantiationException -> L1e java.lang.IllegalAccessException -> L24 java.lang.ClassNotFoundException -> L2a
            if (r1 == 0) goto L2f
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: java.lang.InstantiationException -> L1e java.lang.IllegalAccessException -> L24 java.lang.ClassNotFoundException -> L2a
            com.huawei.hms.hmsscankit.api.IRemoteCreator r2 = com.huawei.hms.hmsscankit.api.IRemoteCreator.Stub.asInterface(r2)     // Catch: java.lang.InstantiationException -> L1e java.lang.IllegalAccessException -> L24 java.lang.ClassNotFoundException -> L2a
            return r2
        L1e:
            java.lang.String r2 = "InvocationTargetException"
            com.huawei.hms.scankit.p.o4.b(r0, r2)
            goto L2f
        L24:
            java.lang.String r2 = "IllegalAccessException"
            com.huawei.hms.scankit.p.o4.b(r0, r2)
            goto L2f
        L2a:
            java.lang.String r2 = "ClassNotFoundException"
            com.huawei.hms.scankit.p.o4.b(r0, r2)
        L2f:
            r2 = 0
            return r2
    }

    public static android.content.Context e(android.content.Context r7) throws java.lang.ClassNotFoundException, java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            java.lang.String r0 = "huawei_module_scankit"
            java.lang.String r1 = "ScankitSDK"
            b(r7)
            android.content.Context r2 = com.huawei.hms.hmsscankit.g.f
            if (r2 == 0) goto L14
            boolean r2 = a()
            if (r2 != 0) goto L14
            android.content.Context r7 = com.huawei.hms.hmsscankit.g.f
            return r7
        L14:
            r2 = 0
            com.huawei.hms.scankit.p.b4.a = r2     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L24 java.lang.Throwable -> Lc1 java.lang.Exception -> Lca java.lang.RuntimeException -> Ld3 java.lang.reflect.InvocationTargetException -> Ldc java.lang.IllegalAccessException -> Le5 java.lang.NoSuchMethodException -> Lee java.lang.ClassNotFoundException -> Lf7
            int r3 = com.huawei.hms.hmsscankit.g.d     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L24 java.lang.Throwable -> Lc1 java.lang.Exception -> Lca java.lang.RuntimeException -> Ld3 java.lang.reflect.InvocationTargetException -> Ldc java.lang.IllegalAccessException -> Le5 java.lang.NoSuchMethodException -> Lee java.lang.ClassNotFoundException -> Lf7
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r4) goto L27
            int r3 = a(r7)     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L24 java.lang.Throwable -> Lc1 java.lang.Exception -> Lca java.lang.RuntimeException -> Ld3 java.lang.reflect.InvocationTargetException -> Ldc java.lang.IllegalAccessException -> Le5 java.lang.NoSuchMethodException -> Lee java.lang.ClassNotFoundException -> Lf7
            com.huawei.hms.hmsscankit.g.d = r3     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L24 java.lang.Throwable -> Lc1 java.lang.Exception -> Lca java.lang.RuntimeException -> Ld3 java.lang.reflect.InvocationTargetException -> Ldc java.lang.IllegalAccessException -> Le5 java.lang.NoSuchMethodException -> Lee java.lang.ClassNotFoundException -> Lf7
            goto L27
        L24:
            r0 = move-exception
            goto L100
        L27:
            android.content.Context r3 = r7.getApplicationContext()     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L24 java.lang.Throwable -> Lc1 java.lang.Exception -> Lca java.lang.RuntimeException -> Ld3 java.lang.reflect.InvocationTargetException -> Ldc java.lang.IllegalAccessException -> Le5 java.lang.NoSuchMethodException -> Lee java.lang.ClassNotFoundException -> Lf7
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L24 java.lang.Throwable -> Lc1 java.lang.Exception -> Lca java.lang.RuntimeException -> Ld3 java.lang.reflect.InvocationTargetException -> Ldc java.lang.IllegalAccessException -> Le5 java.lang.NoSuchMethodException -> Lee java.lang.ClassNotFoundException -> Lf7
            com.huawei.hms.feature.dynamic.DynamicModule$VersionPolicy r5 = com.huawei.hms.feature.dynamic.DynamicModule.PREFER_REMOTE     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L24 java.lang.Throwable -> Lc1 java.lang.Exception -> Lca java.lang.RuntimeException -> Ld3 java.lang.reflect.InvocationTargetException -> Ldc java.lang.IllegalAccessException -> Le5 java.lang.NoSuchMethodException -> Lee java.lang.ClassNotFoundException -> Lf7
            com.huawei.hms.feature.dynamic.DynamicModule r3 = com.huawei.hms.feature.dynamic.DynamicModule.load(r3, r5, r0)     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L24 java.lang.Throwable -> Lc1 java.lang.Exception -> Lca java.lang.RuntimeException -> Ld3 java.lang.reflect.InvocationTargetException -> Ldc java.lang.IllegalAccessException -> Le5 java.lang.NoSuchMethodException -> Lee java.lang.ClassNotFoundException -> Lf7
            android.content.Context r3 = r3.getModuleContext()     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L24 java.lang.Throwable -> Lc1 java.lang.Exception -> Lca java.lang.RuntimeException -> Ld3 java.lang.reflect.InvocationTargetException -> Ldc java.lang.IllegalAccessException -> Le5 java.lang.NoSuchMethodException -> Lee java.lang.ClassNotFoundException -> Lf7
            int r5 = com.huawei.hms.hmsscankit.g.e     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L24 java.lang.Throwable -> Lc1 java.lang.Exception -> Lca java.lang.RuntimeException -> Ld3 java.lang.reflect.InvocationTargetException -> Ldc java.lang.IllegalAccessException -> Le5 java.lang.NoSuchMethodException -> Lee java.lang.ClassNotFoundException -> Lf7
            if (r5 != r4) goto L4b
            android.content.Context r4 = r7.getApplicationContext()     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L24 java.lang.Throwable -> Lc1 java.lang.Exception -> Lca java.lang.RuntimeException -> Ld3 java.lang.reflect.InvocationTargetException -> Ldc java.lang.IllegalAccessException -> Le5 java.lang.NoSuchMethodException -> Lee java.lang.ClassNotFoundException -> Lf7
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L24 java.lang.Throwable -> Lc1 java.lang.Exception -> Lca java.lang.RuntimeException -> Ld3 java.lang.reflect.InvocationTargetException -> Ldc java.lang.IllegalAccessException -> Le5 java.lang.NoSuchMethodException -> Lee java.lang.ClassNotFoundException -> Lf7
            int r0 = com.huawei.hms.feature.dynamic.DynamicModule.getRemoteVersion(r4, r0)     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L24 java.lang.Throwable -> Lc1 java.lang.Exception -> Lca java.lang.RuntimeException -> Ld3 java.lang.reflect.InvocationTargetException -> Ldc java.lang.IllegalAccessException -> Le5 java.lang.NoSuchMethodException -> Lee java.lang.ClassNotFoundException -> Lf7
            com.huawei.hms.hmsscankit.g.e = r0     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L24 java.lang.Throwable -> Lc1 java.lang.Exception -> Lca java.lang.RuntimeException -> Ld3 java.lang.reflect.InvocationTargetException -> Ldc java.lang.IllegalAccessException -> Le5 java.lang.NoSuchMethodException -> Lee java.lang.ClassNotFoundException -> Lf7
        L4b:
            int r0 = com.huawei.hms.hmsscankit.g.d     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L24 java.lang.Throwable -> Lc1 java.lang.Exception -> Lca java.lang.RuntimeException -> Ld3 java.lang.reflect.InvocationTargetException -> Ldc java.lang.IllegalAccessException -> Le5 java.lang.NoSuchMethodException -> Lee java.lang.ClassNotFoundException -> Lf7
            r4 = 21200300(0x1437dac, float:3.590601E-38)
            r5 = 1
            if (r0 < r4) goto L56
            com.huawei.hms.hmsscankit.g.c = r5     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L24 java.lang.Throwable -> Lc1 java.lang.Exception -> Lca java.lang.RuntimeException -> Ld3 java.lang.reflect.InvocationTargetException -> Ldc java.lang.IllegalAccessException -> Le5 java.lang.NoSuchMethodException -> Lee java.lang.ClassNotFoundException -> Lf7
            goto L58
        L56:
            com.huawei.hms.hmsscankit.g.c = r2     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L24 java.lang.Throwable -> Lc1 java.lang.Exception -> Lca java.lang.RuntimeException -> Ld3 java.lang.reflect.InvocationTargetException -> Ldc java.lang.IllegalAccessException -> Le5 java.lang.NoSuchMethodException -> Lee java.lang.ClassNotFoundException -> Lf7
        L58:
            java.lang.String r0 = com.huawei.hms.scankit.p.y3.b(r7)     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L24 java.lang.Throwable -> Lc1 java.lang.Exception -> Lca java.lang.RuntimeException -> Ld3 java.lang.reflect.InvocationTargetException -> Ldc java.lang.IllegalAccessException -> Le5 java.lang.NoSuchMethodException -> Lee java.lang.ClassNotFoundException -> Lf7
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L24 java.lang.Throwable -> Lc1 java.lang.Exception -> Lca java.lang.RuntimeException -> Ld3 java.lang.reflect.InvocationTargetException -> Ldc java.lang.IllegalAccessException -> Le5 java.lang.NoSuchMethodException -> Lee java.lang.ClassNotFoundException -> Lf7
            r4.<init>()     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L24 java.lang.Throwable -> Lc1 java.lang.Exception -> Lca java.lang.RuntimeException -> Ld3 java.lang.reflect.InvocationTargetException -> Ldc java.lang.IllegalAccessException -> Le5 java.lang.NoSuchMethodException -> Lee java.lang.ClassNotFoundException -> Lf7
            java.lang.String r6 = "local Version: "
            r4.append(r6)     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L24 java.lang.Throwable -> Lc1 java.lang.Exception -> Lca java.lang.RuntimeException -> Ld3 java.lang.reflect.InvocationTargetException -> Ldc java.lang.IllegalAccessException -> Le5 java.lang.NoSuchMethodException -> Lee java.lang.ClassNotFoundException -> Lf7
            int r6 = com.huawei.hms.hmsscankit.g.d     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L24 java.lang.Throwable -> Lc1 java.lang.Exception -> Lca java.lang.RuntimeException -> Ld3 java.lang.reflect.InvocationTargetException -> Ldc java.lang.IllegalAccessException -> Le5 java.lang.NoSuchMethodException -> Lee java.lang.ClassNotFoundException -> Lf7
            r4.append(r6)     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L24 java.lang.Throwable -> Lc1 java.lang.Exception -> Lca java.lang.RuntimeException -> Ld3 java.lang.reflect.InvocationTargetException -> Ldc java.lang.IllegalAccessException -> Le5 java.lang.NoSuchMethodException -> Lee java.lang.ClassNotFoundException -> Lf7
            java.lang.String r6 = " remote Version: "
            r4.append(r6)     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L24 java.lang.Throwable -> Lc1 java.lang.Exception -> Lca java.lang.RuntimeException -> Ld3 java.lang.reflect.InvocationTargetException -> Ldc java.lang.IllegalAccessException -> Le5 java.lang.NoSuchMethodException -> Lee java.lang.ClassNotFoundException -> Lf7
            int r6 = com.huawei.hms.hmsscankit.g.e     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L24 java.lang.Throwable -> Lc1 java.lang.Exception -> Lca java.lang.RuntimeException -> Ld3 java.lang.reflect.InvocationTargetException -> Ldc java.lang.IllegalAccessException -> Le5 java.lang.NoSuchMethodException -> Lee java.lang.ClassNotFoundException -> Lf7
            r4.append(r6)     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L24 java.lang.Throwable -> Lc1 java.lang.Exception -> Lca java.lang.RuntimeException -> Ld3 java.lang.reflect.InvocationTargetException -> Ldc java.lang.IllegalAccessException -> Le5 java.lang.NoSuchMethodException -> Lee java.lang.ClassNotFoundException -> Lf7
            java.lang.String r4 = r4.toString()     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L24 java.lang.Throwable -> Lc1 java.lang.Exception -> Lca java.lang.RuntimeException -> Ld3 java.lang.reflect.InvocationTargetException -> Ldc java.lang.IllegalAccessException -> Le5 java.lang.NoSuchMethodException -> Lee java.lang.ClassNotFoundException -> Lf7
            com.huawei.hms.scankit.p.o4.d(r1, r4)     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L24 java.lang.Throwable -> Lc1 java.lang.Exception -> Lca java.lang.RuntimeException -> Ld3 java.lang.reflect.InvocationTargetException -> Ldc java.lang.IllegalAccessException -> Le5 java.lang.NoSuchMethodException -> Lee java.lang.ClassNotFoundException -> Lf7
            boolean r4 = a()     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L24 java.lang.Throwable -> Lc1 java.lang.Exception -> Lca java.lang.RuntimeException -> Ld3 java.lang.reflect.InvocationTargetException -> Ldc java.lang.IllegalAccessException -> Le5 java.lang.NoSuchMethodException -> Lee java.lang.ClassNotFoundException -> Lf7
            if (r4 != 0) goto La2
            int r4 = com.huawei.hms.hmsscankit.g.d     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L24 java.lang.Throwable -> Lc1 java.lang.Exception -> Lca java.lang.RuntimeException -> Ld3 java.lang.reflect.InvocationTargetException -> Ldc java.lang.IllegalAccessException -> Le5 java.lang.NoSuchMethodException -> Lee java.lang.ClassNotFoundException -> Lf7
            int r6 = com.huawei.hms.hmsscankit.g.e     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L24 java.lang.Throwable -> Lc1 java.lang.Exception -> Lca java.lang.RuntimeException -> Ld3 java.lang.reflect.InvocationTargetException -> Ldc java.lang.IllegalAccessException -> Le5 java.lang.NoSuchMethodException -> Lee java.lang.ClassNotFoundException -> Lf7
            if (r4 >= r6) goto La2
            java.lang.String r4 = "com.huawei.scanner"
            boolean r0 = r0.equals(r4)     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L24 java.lang.Throwable -> Lc1 java.lang.Exception -> Lca java.lang.RuntimeException -> Ld3 java.lang.reflect.InvocationTargetException -> Ldc java.lang.IllegalAccessException -> Le5 java.lang.NoSuchMethodException -> Lee java.lang.ClassNotFoundException -> Lf7
            if (r0 == 0) goto L91
            goto La2
        L91:
            com.huawei.hms.hmsscankit.g.a = r5     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L24 java.lang.Throwable -> Lc1 java.lang.Exception -> Lca java.lang.RuntimeException -> Ld3 java.lang.reflect.InvocationTargetException -> Ldc java.lang.IllegalAccessException -> Le5 java.lang.NoSuchMethodException -> Lee java.lang.ClassNotFoundException -> Lf7
            com.huawei.hms.scankit.p.b4.a = r5     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L24 java.lang.Throwable -> Lc1 java.lang.Exception -> Lca java.lang.RuntimeException -> Ld3 java.lang.reflect.InvocationTargetException -> Ldc java.lang.IllegalAccessException -> Le5 java.lang.NoSuchMethodException -> Lee java.lang.ClassNotFoundException -> Lf7
            int r0 = com.huawei.hms.hmsscankit.g.e     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L24 java.lang.Throwable -> Lc1 java.lang.Exception -> Lca java.lang.RuntimeException -> Ld3 java.lang.reflect.InvocationTargetException -> Ldc java.lang.IllegalAccessException -> Le5 java.lang.NoSuchMethodException -> Lee java.lang.ClassNotFoundException -> Lf7
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L24 java.lang.Throwable -> Lc1 java.lang.Exception -> Lca java.lang.RuntimeException -> Ld3 java.lang.reflect.InvocationTargetException -> Ldc java.lang.IllegalAccessException -> Le5 java.lang.NoSuchMethodException -> Lee java.lang.ClassNotFoundException -> Lf7
            com.huawei.hms.scankit.p.b4.b = r0     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L24 java.lang.Throwable -> Lc1 java.lang.Exception -> Lca java.lang.RuntimeException -> Ld3 java.lang.reflect.InvocationTargetException -> Ldc java.lang.IllegalAccessException -> Le5 java.lang.NoSuchMethodException -> Lee java.lang.ClassNotFoundException -> Lf7
            com.huawei.hms.hmsscankit.g.f = r3     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L24 java.lang.Throwable -> Lc1 java.lang.Exception -> Lca java.lang.RuntimeException -> Ld3 java.lang.reflect.InvocationTargetException -> Ldc java.lang.IllegalAccessException -> Le5 java.lang.NoSuchMethodException -> Lee java.lang.ClassNotFoundException -> Lf7
            android.content.Context r7 = com.huawei.hms.hmsscankit.g.f
            return r7
        La2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L24 java.lang.Throwable -> Lc1 java.lang.Exception -> Lca java.lang.RuntimeException -> Ld3 java.lang.reflect.InvocationTargetException -> Ldc java.lang.IllegalAccessException -> Le5 java.lang.NoSuchMethodException -> Lee java.lang.ClassNotFoundException -> Lf7
            r0.<init>()     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L24 java.lang.Throwable -> Lc1 java.lang.Exception -> Lca java.lang.RuntimeException -> Ld3 java.lang.reflect.InvocationTargetException -> Ldc java.lang.IllegalAccessException -> Le5 java.lang.NoSuchMethodException -> Lee java.lang.ClassNotFoundException -> Lf7
            java.lang.String r3 = "use local Version: "
            r0.append(r3)     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L24 java.lang.Throwable -> Lc1 java.lang.Exception -> Lca java.lang.RuntimeException -> Ld3 java.lang.reflect.InvocationTargetException -> Ldc java.lang.IllegalAccessException -> Le5 java.lang.NoSuchMethodException -> Lee java.lang.ClassNotFoundException -> Lf7
            int r3 = com.huawei.hms.hmsscankit.g.d     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L24 java.lang.Throwable -> Lc1 java.lang.Exception -> Lca java.lang.RuntimeException -> Ld3 java.lang.reflect.InvocationTargetException -> Ldc java.lang.IllegalAccessException -> Le5 java.lang.NoSuchMethodException -> Lee java.lang.ClassNotFoundException -> Lf7
            r0.append(r3)     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L24 java.lang.Throwable -> Lc1 java.lang.Exception -> Lca java.lang.RuntimeException -> Ld3 java.lang.reflect.InvocationTargetException -> Ldc java.lang.IllegalAccessException -> Le5 java.lang.NoSuchMethodException -> Lee java.lang.ClassNotFoundException -> Lf7
            java.lang.String r0 = r0.toString()     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L24 java.lang.Throwable -> Lc1 java.lang.Exception -> Lca java.lang.RuntimeException -> Ld3 java.lang.reflect.InvocationTargetException -> Ldc java.lang.IllegalAccessException -> Le5 java.lang.NoSuchMethodException -> Lee java.lang.ClassNotFoundException -> Lf7
            com.huawei.hms.scankit.p.o4.d(r1, r0)     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L24 java.lang.Throwable -> Lc1 java.lang.Exception -> Lca java.lang.RuntimeException -> Ld3 java.lang.reflect.InvocationTargetException -> Ldc java.lang.IllegalAccessException -> Le5 java.lang.NoSuchMethodException -> Lee java.lang.ClassNotFoundException -> Lf7
            b(r7)     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L24 java.lang.Throwable -> Lc1 java.lang.Exception -> Lca java.lang.RuntimeException -> Ld3 java.lang.reflect.InvocationTargetException -> Ldc java.lang.IllegalAccessException -> Le5 java.lang.NoSuchMethodException -> Lee java.lang.ClassNotFoundException -> Lf7
            com.huawei.hms.hmsscankit.g.a = r2     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L24 java.lang.Throwable -> Lc1 java.lang.Exception -> Lca java.lang.RuntimeException -> Ld3 java.lang.reflect.InvocationTargetException -> Ldc java.lang.IllegalAccessException -> Le5 java.lang.NoSuchMethodException -> Lee java.lang.ClassNotFoundException -> Lf7
            r0 = 0
            com.huawei.hms.hmsscankit.g.f = r0     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L24 java.lang.Throwable -> Lc1 java.lang.Exception -> Lca java.lang.RuntimeException -> Ld3 java.lang.reflect.InvocationTargetException -> Ldc java.lang.IllegalAccessException -> Le5 java.lang.NoSuchMethodException -> Lee java.lang.ClassNotFoundException -> Lf7
            return r7
        Lc1:
            java.lang.String r0 = "Throwable exception"
            com.huawei.hms.scankit.p.o4.b(r1, r0)
            b(r7)
            return r7
        Lca:
            java.lang.String r0 = "Exception exception"
            com.huawei.hms.scankit.p.o4.b(r1, r0)
            b(r7)
            return r7
        Ld3:
            java.lang.String r0 = "other RuntimeException exception"
            com.huawei.hms.scankit.p.o4.b(r1, r0)
            b(r7)
            return r7
        Ldc:
            java.lang.String r0 = "InvocationTargetException exception"
            com.huawei.hms.scankit.p.o4.b(r1, r0)
            b(r7)
            return r7
        Le5:
            java.lang.String r0 = "IllegalAccessException exception"
            com.huawei.hms.scankit.p.o4.b(r1, r0)
            b(r7)
            return r7
        Lee:
            java.lang.String r0 = "NoSuchMethodException exception"
            com.huawei.hms.scankit.p.o4.b(r1, r0)
            b(r7)
            return r7
        Lf7:
            java.lang.String r0 = "ClassNotFoundException exception"
            com.huawei.hms.scankit.p.o4.b(r1, r0)
            b(r7)
            return r7
        L100:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "ClassNotFoundException exception "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.huawei.hms.scankit.p.o4.b(r1, r0)
            b(r7)
            return r7
    }
}
