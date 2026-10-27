package com.bumptech.glide.module;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class e {
    private static final java.lang.String b = "ManifestParser";
    private static final java.lang.String c = "GlideModule";
    private final android.content.Context a;

    public e(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    private static com.bumptech.glide.module.c b(java.lang.String r3) {
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L43
            r0 = 0
            java.lang.reflect.Constructor r1 = r3.getDeclaredConstructor(r0)     // Catch: java.lang.reflect.InvocationTargetException -> Le java.lang.NoSuchMethodException -> L10 java.lang.IllegalAccessException -> L12 java.lang.InstantiationException -> L14
            java.lang.Object r0 = r1.newInstance(r0)     // Catch: java.lang.reflect.InvocationTargetException -> Le java.lang.NoSuchMethodException -> L10 java.lang.IllegalAccessException -> L12 java.lang.InstantiationException -> L14
            goto L25
        Le:
            r1 = move-exception
            goto L16
        L10:
            r1 = move-exception
            goto L1a
        L12:
            r1 = move-exception
            goto L1e
        L14:
            r1 = move-exception
            goto L22
        L16:
            c(r3, r1)
            goto L25
        L1a:
            c(r3, r1)
            goto L25
        L1e:
            c(r3, r1)
            goto L25
        L22:
            c(r3, r1)
        L25:
            boolean r3 = r0 instanceof com.bumptech.glide.module.c
            if (r3 == 0) goto L2c
            com.bumptech.glide.module.c r0 = (com.bumptech.glide.module.c) r0
            return r0
        L2c:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected instanceof GlideModule, but found: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r3.<init>(r0)
            throw r3
        L43:
            r3 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unable to find GlideModule implementation"
            r0.<init>(r1, r3)
            throw r0
    }

    private static void c(java.lang.Class<?> r3, java.lang.Exception r4) {
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to instantiate GlideModule implementation for "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3, r4)
            throw r0
    }

    public java.util.List<com.bumptech.glide.module.c> a() {
            r8 = this;
            java.lang.String r0 = "ManifestParser"
            r1 = 3
            android.util.Log.isLoggable(r0, r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            android.content.Context r3 = r8.a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L25
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L25
            android.content.Context r4 = r8.a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L25
            java.lang.String r4 = r4.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L25
            r5 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo(r4, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L25
            android.os.Bundle r4 = r3.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L25
            if (r4 != 0) goto L27
            android.util.Log.isLoggable(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L25
            return r2
        L25:
            r0 = move-exception
            goto L66
        L27:
            r4 = 2
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L25
            if (r4 == 0) goto L33
            android.os.Bundle r4 = r3.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L25
            java.util.Objects.toString(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L25
        L33:
            android.os.Bundle r4 = r3.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L25
            java.util.Set r4 = r4.keySet()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L25
            java.util.Iterator r4 = r4.iterator()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L25
        L3d:
            boolean r5 = r4.hasNext()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L25
            if (r5 == 0) goto L62
            java.lang.Object r5 = r4.next()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L25
            java.lang.String r5 = (java.lang.String) r5     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L25
            java.lang.String r6 = "GlideModule"
            android.os.Bundle r7 = r3.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L25
            java.lang.Object r7 = r7.get(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L25
            boolean r6 = r6.equals(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L25
            if (r6 == 0) goto L3d
            com.bumptech.glide.module.c r5 = b(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L25
            r2.add(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L25
            android.util.Log.isLoggable(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L25
            goto L3d
        L62:
            android.util.Log.isLoggable(r0, r1)
            return r2
        L66:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Unable to find metadata to parse GlideModules"
            r1.<init>(r2, r0)
            throw r1
    }
}
