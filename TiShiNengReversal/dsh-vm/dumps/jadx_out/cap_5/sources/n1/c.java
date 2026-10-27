package n1;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class c {
    private static final java.lang.String b = "c";
    private static final java.util.Map<java.lang.String, com.huawei.hms.framework.common.PLSharedPreferences> c = null;
    private final com.huawei.hms.framework.common.PLSharedPreferences a;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r1 = 16
            r0.<init>(r1)
            n1.c.c = r0
            return
    }

    public c(android.content.Context r5, java.lang.String r6) {
            r4 = this;
            r4.<init>()
            java.lang.String r0 = r5.getPackageName()
            java.lang.String r1 = n1.c.b
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            java.lang.String r3 = "get pkgname from context is{%s}"
            com.huawei.hms.framework.common.Logger.d(r1, r3, r2)
            java.util.Map<java.lang.String, com.huawei.hms.framework.common.PLSharedPreferences> r1 = n1.c.c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            boolean r2 = r1.containsKey(r2)
            if (r2 == 0) goto L43
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            r2.append(r0)
            java.lang.String r6 = r2.toString()
            java.lang.Object r6 = r1.get(r6)
            com.huawei.hms.framework.common.PLSharedPreferences r6 = (com.huawei.hms.framework.common.PLSharedPreferences) r6
            r4.a = r6
            goto L6b
        L43:
            com.huawei.hms.framework.common.PLSharedPreferences r2 = new com.huawei.hms.framework.common.PLSharedPreferences
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r6)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r5, r3)
            r4.a = r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r6)
            r3.append(r0)
            java.lang.String r6 = r3.toString()
            r1.put(r6, r2)
        L6b:
            r4.c(r5)
            return
    }

    private void c(android.content.Context r6) {
            r5 = this;
            java.lang.String r0 = n1.c.b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ContextHolder.getAppContext() from GRS is:"
            r1.append(r2)
            android.content.Context r2 = com.huawei.hms.framework.common.ContextHolder.getAppContext()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.huawei.hms.framework.common.Logger.i(r0, r1)
            android.content.Context r1 = com.huawei.hms.framework.common.ContextHolder.getAppContext()
            if (r1 != 0) goto L21
            goto L25
        L21:
            android.content.Context r6 = com.huawei.hms.framework.common.ContextHolder.getAppContext()
        L25:
            android.content.pm.PackageManager r1 = r6.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5d
            java.lang.String r6 = r6.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5d
            r2 = 16384(0x4000, float:2.2959E-41)
            android.content.pm.PackageInfo r6 = r1.getPackageInfo(r6, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5d
            int r6 = r6.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5d
            long r1 = (long) r6     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5d
            java.lang.String r6 = java.lang.Long.toString(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5d
            java.lang.String r1 = ""
            java.lang.String r2 = "version"
            java.lang.String r1 = r5.a(r2, r1)
            boolean r3 = r6.equals(r1)
            if (r3 != 0) goto L5c
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r1
            r1 = 1
            r3[r1] = r6
            java.lang.String r1 = "app version changed! old version{%s} and new version{%s}"
            com.huawei.hms.framework.common.Logger.i(r0, r1, r3)
            r5.e()
            r5.f(r2, r6)
        L5c:
            return
        L5d:
            java.lang.String r6 = n1.c.b
            java.lang.String r0 = "get app version failed and catch NameNotFoundException"
            com.huawei.hms.framework.common.Logger.w(r6, r0)
            return
    }

    public java.lang.String a(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            com.huawei.hms.framework.common.PLSharedPreferences r0 = r2.a
            if (r0 != 0) goto L5
            return r4
        L5:
            monitor-enter(r0)
            com.huawei.hms.framework.common.PLSharedPreferences r1 = r2.a     // Catch: java.lang.Throwable -> Le
            java.lang.String r3 = r1.getString(r3, r4)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r3
        Le:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r3
    }

    public java.util.Map<java.lang.String, ?> b() {
            r2 = this;
            com.huawei.hms.framework.common.PLSharedPreferences r0 = r2.a
            if (r0 != 0) goto La
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            return r0
        La:
            monitor-enter(r0)
            com.huawei.hms.framework.common.PLSharedPreferences r1 = r2.a     // Catch: java.lang.Throwable -> L13
            java.util.Map r1 = r1.getAll()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return r1
        L13:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
    }

    public void d(java.lang.String r3) {
            r2 = this;
            com.huawei.hms.framework.common.PLSharedPreferences r0 = r2.a
            if (r0 != 0) goto L5
            return
        L5:
            monitor-enter(r0)
            com.huawei.hms.framework.common.PLSharedPreferences r1 = r2.a     // Catch: java.lang.Throwable -> Ld
            r1.remove(r3)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r3
    }

    public void e() {
            r2 = this;
            com.huawei.hms.framework.common.PLSharedPreferences r0 = r2.a
            if (r0 != 0) goto L5
            return
        L5:
            monitor-enter(r0)
            com.huawei.hms.framework.common.PLSharedPreferences r1 = r2.a     // Catch: java.lang.Throwable -> Ld
            r1.clear()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    public void f(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            com.huawei.hms.framework.common.PLSharedPreferences r0 = r2.a
            if (r0 != 0) goto L5
            return
        L5:
            monitor-enter(r0)
            com.huawei.hms.framework.common.PLSharedPreferences r1 = r2.a     // Catch: java.lang.Throwable -> Ld
            r1.putString(r3, r4)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r3
    }
}
