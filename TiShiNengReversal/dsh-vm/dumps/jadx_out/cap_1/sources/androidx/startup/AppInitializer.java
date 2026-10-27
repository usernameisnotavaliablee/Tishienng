package androidx.startup;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class AppInitializer {
    private static final java.lang.String SECTION_NAME = "Startup";
    private static volatile androidx.startup.AppInitializer sInstance;
    private static final java.lang.Object sLock = null;

    @androidx.annotation.NonNull
    final android.content.Context mContext;

    @androidx.annotation.NonNull
    final java.util.Set<java.lang.Class<? extends androidx.startup.Initializer<?>>> mDiscovered;

    @androidx.annotation.NonNull
    final java.util.Map<java.lang.Class<?>, java.lang.Object> mInitialized;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.startup.AppInitializer.sLock = r0
            return
    }

    AppInitializer(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            r0.mContext = r1
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r0.mDiscovered = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.mInitialized = r1
            return
    }

    @androidx.annotation.NonNull
    private <T> T doInitialize(@androidx.annotation.NonNull java.lang.Class<? extends androidx.startup.Initializer<?>> r5, @androidx.annotation.NonNull java.util.Set<java.lang.Class<?>> r6) {
            r4 = this;
            boolean r0 = androidx.tracing.Trace.isEnabled()
            if (r0 == 0) goto L11
            java.lang.String r0 = r5.getSimpleName()     // Catch: java.lang.Throwable -> Le
            androidx.tracing.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r5 = move-exception
            goto L8a
        L11:
            boolean r0 = r6.contains(r5)     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L74
            java.util.Map<java.lang.Class<?>, java.lang.Object> r0 = r4.mInitialized     // Catch: java.lang.Throwable -> Le
            boolean r0 = r0.containsKey(r5)     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L6a
            r6.add(r5)     // Catch: java.lang.Throwable -> Le
            r0 = 0
            java.lang.reflect.Constructor r1 = r5.getDeclaredConstructor(r0)     // Catch: java.lang.Throwable -> L53
            java.lang.Object r0 = r1.newInstance(r0)     // Catch: java.lang.Throwable -> L53
            androidx.startup.Initializer r0 = (androidx.startup.Initializer) r0     // Catch: java.lang.Throwable -> L53
            java.util.List r1 = r0.dependencies()     // Catch: java.lang.Throwable -> L53
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L53
            if (r2 != 0) goto L55
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L53
        L3b:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto L55
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L53
            java.lang.Class r2 = (java.lang.Class) r2     // Catch: java.lang.Throwable -> L53
            java.util.Map<java.lang.Class<?>, java.lang.Object> r3 = r4.mInitialized     // Catch: java.lang.Throwable -> L53
            boolean r3 = r3.containsKey(r2)     // Catch: java.lang.Throwable -> L53
            if (r3 != 0) goto L3b
            r4.doInitialize(r2, r6)     // Catch: java.lang.Throwable -> L53
            goto L3b
        L53:
            r5 = move-exception
            goto L64
        L55:
            android.content.Context r1 = r4.mContext     // Catch: java.lang.Throwable -> L53
            java.lang.Object r0 = r0.create(r1)     // Catch: java.lang.Throwable -> L53
            r6.remove(r5)     // Catch: java.lang.Throwable -> L53
            java.util.Map<java.lang.Class<?>, java.lang.Object> r6 = r4.mInitialized     // Catch: java.lang.Throwable -> L53
            r6.put(r5, r0)     // Catch: java.lang.Throwable -> L53
            goto L70
        L64:
            androidx.startup.StartupException r6 = new androidx.startup.StartupException     // Catch: java.lang.Throwable -> Le
            r6.<init>(r5)     // Catch: java.lang.Throwable -> Le
            throw r6     // Catch: java.lang.Throwable -> Le
        L6a:
            java.util.Map<java.lang.Class<?>, java.lang.Object> r6 = r4.mInitialized     // Catch: java.lang.Throwable -> Le
            java.lang.Object r0 = r6.get(r5)     // Catch: java.lang.Throwable -> Le
        L70:
            androidx.tracing.Trace.endSection()
            return r0
        L74:
            java.lang.String r6 = "Cannot initialize %s. Cycle detected."
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> Le
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> Le
            r1 = 0
            r0[r1] = r5     // Catch: java.lang.Throwable -> Le
            java.lang.String r5 = java.lang.String.format(r6, r0)     // Catch: java.lang.Throwable -> Le
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Le
            r6.<init>(r5)     // Catch: java.lang.Throwable -> Le
            throw r6     // Catch: java.lang.Throwable -> Le
        L8a:
            androidx.tracing.Trace.endSection()
            throw r5
    }

    @androidx.annotation.NonNull
    public static androidx.startup.AppInitializer getInstance(@androidx.annotation.NonNull android.content.Context r2) {
            androidx.startup.AppInitializer r0 = androidx.startup.AppInitializer.sInstance
            if (r0 != 0) goto L19
            java.lang.Object r0 = androidx.startup.AppInitializer.sLock
            monitor-enter(r0)
            androidx.startup.AppInitializer r1 = androidx.startup.AppInitializer.sInstance     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            androidx.startup.AppInitializer r1 = new androidx.startup.AppInitializer     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            androidx.startup.AppInitializer.sInstance = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
        L19:
            androidx.startup.AppInitializer r2 = androidx.startup.AppInitializer.sInstance
            return r2
    }

    static void setDelegate(@androidx.annotation.NonNull androidx.startup.AppInitializer r1) {
            java.lang.Object r0 = androidx.startup.AppInitializer.sLock
            monitor-enter(r0)
            androidx.startup.AppInitializer.sInstance = r1     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    void discoverAndInitialize(@androidx.annotation.Nullable android.os.Bundle r6) {
            r5 = this;
            android.content.Context r0 = r5.mContext
            int r1 = androidx.startup.R.string.androidx_startup
            java.lang.String r0 = r0.getString(r1)
            if (r6 == 0) goto L5e
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.lang.ClassNotFoundException -> L40
            r1.<init>()     // Catch: java.lang.ClassNotFoundException -> L40
            java.util.Set r2 = r6.keySet()     // Catch: java.lang.ClassNotFoundException -> L40
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.ClassNotFoundException -> L40
        L17:
            boolean r3 = r2.hasNext()     // Catch: java.lang.ClassNotFoundException -> L40
            if (r3 == 0) goto L42
            java.lang.Object r3 = r2.next()     // Catch: java.lang.ClassNotFoundException -> L40
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.ClassNotFoundException -> L40
            r4 = 0
            java.lang.String r4 = r6.getString(r3, r4)     // Catch: java.lang.ClassNotFoundException -> L40
            boolean r4 = r0.equals(r4)     // Catch: java.lang.ClassNotFoundException -> L40
            if (r4 == 0) goto L17
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L40
            java.lang.Class<androidx.startup.Initializer> r4 = androidx.startup.Initializer.class
            boolean r4 = r4.isAssignableFrom(r3)     // Catch: java.lang.ClassNotFoundException -> L40
            if (r4 == 0) goto L17
            java.util.Set<java.lang.Class<? extends androidx.startup.Initializer<?>>> r4 = r5.mDiscovered     // Catch: java.lang.ClassNotFoundException -> L40
            r4.add(r3)     // Catch: java.lang.ClassNotFoundException -> L40
            goto L17
        L40:
            r6 = move-exception
            goto L58
        L42:
            java.util.Set<java.lang.Class<? extends androidx.startup.Initializer<?>>> r6 = r5.mDiscovered     // Catch: java.lang.ClassNotFoundException -> L40
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.ClassNotFoundException -> L40
        L48:
            boolean r0 = r6.hasNext()     // Catch: java.lang.ClassNotFoundException -> L40
            if (r0 == 0) goto L5e
            java.lang.Object r0 = r6.next()     // Catch: java.lang.ClassNotFoundException -> L40
            java.lang.Class r0 = (java.lang.Class) r0     // Catch: java.lang.ClassNotFoundException -> L40
            r5.doInitialize(r0, r1)     // Catch: java.lang.ClassNotFoundException -> L40
            goto L48
        L58:
            androidx.startup.StartupException r0 = new androidx.startup.StartupException
            r0.<init>(r6)
            throw r0
        L5e:
            return
    }

    void discoverAndInitialize(@androidx.annotation.NonNull java.lang.Class<? extends androidx.startup.InitializationProvider> r3) {
            r2 = this;
            java.lang.String r0 = "Startup"
            androidx.tracing.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L21 android.content.pm.PackageManager.NameNotFoundException -> L23
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L21 android.content.pm.PackageManager.NameNotFoundException -> L23
            android.content.Context r1 = r2.mContext     // Catch: java.lang.Throwable -> L21 android.content.pm.PackageManager.NameNotFoundException -> L23
            r0.<init>(r1, r3)     // Catch: java.lang.Throwable -> L21 android.content.pm.PackageManager.NameNotFoundException -> L23
            android.content.Context r3 = r2.mContext     // Catch: java.lang.Throwable -> L21 android.content.pm.PackageManager.NameNotFoundException -> L23
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: java.lang.Throwable -> L21 android.content.pm.PackageManager.NameNotFoundException -> L23
            r1 = 128(0x80, float:1.8E-43)
            android.content.pm.ProviderInfo r3 = r3.getProviderInfo(r0, r1)     // Catch: java.lang.Throwable -> L21 android.content.pm.PackageManager.NameNotFoundException -> L23
            android.os.Bundle r3 = r3.metaData     // Catch: java.lang.Throwable -> L21 android.content.pm.PackageManager.NameNotFoundException -> L23
            r2.discoverAndInitialize(r3)     // Catch: java.lang.Throwable -> L21 android.content.pm.PackageManager.NameNotFoundException -> L23
            androidx.tracing.Trace.endSection()
            return
        L21:
            r3 = move-exception
            goto L2a
        L23:
            r3 = move-exception
            androidx.startup.StartupException r0 = new androidx.startup.StartupException     // Catch: java.lang.Throwable -> L21
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L21
            throw r0     // Catch: java.lang.Throwable -> L21
        L2a:
            androidx.tracing.Trace.endSection()
            throw r3
    }

    @androidx.annotation.NonNull
    <T> T doInitialize(@androidx.annotation.NonNull java.lang.Class<? extends androidx.startup.Initializer<?>> r3) {
            r2 = this;
            java.lang.Object r0 = androidx.startup.AppInitializer.sLock
            monitor-enter(r0)
            java.util.Map<java.lang.Class<?>, java.lang.Object> r1 = r2.mInitialized     // Catch: java.lang.Throwable -> L15
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L17
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.lang.Throwable -> L15
            r1.<init>()     // Catch: java.lang.Throwable -> L15
            java.lang.Object r1 = r2.doInitialize(r3, r1)     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r3 = move-exception
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return r1
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r3
    }

    @androidx.annotation.NonNull
    public <T> T initializeComponent(@androidx.annotation.NonNull java.lang.Class<? extends androidx.startup.Initializer<T>> r1) {
            r0 = this;
            java.lang.Object r1 = r0.doInitialize(r1)
            return r1
    }

    public boolean isEagerlyInitialized(@androidx.annotation.NonNull java.lang.Class<? extends androidx.startup.Initializer<?>> r2) {
            r1 = this;
            java.util.Set<java.lang.Class<? extends androidx.startup.Initializer<?>>> r0 = r1.mDiscovered
            boolean r2 = r0.contains(r2)
            return r2
    }
}
