package com.bytedance.j.xt.up;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class c {
    private android.content.Context a;
    private com.bytedance.j.xt.f b;
    private java.util.Map<java.lang.String, java.lang.Object> c;

    public c(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull com.bytedance.j.xt.f r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public static boolean c(java.util.Map<java.lang.String, java.lang.Object> r1) {
            if (r1 == 0) goto L2b
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L2b
            java.lang.String r0 = "app_version"
            boolean r0 = r1.containsKey(r0)
            if (r0 != 0) goto L18
            java.lang.String r0 = "version_name"
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L2b
        L18:
            java.lang.String r0 = "version_code"
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L2b
            java.lang.String r0 = "update_version_code"
            boolean r1 = r1.containsKey(r0)
            if (r1 != 0) goto L29
            goto L2b
        L29:
            r1 = 0
            return r1
        L2b:
            r1 = 1
            return r1
    }

    @androidx.annotation.NonNull
    public com.bytedance.j.xt.f a() {
            r1 = this;
            com.bytedance.j.xt.f r0 = r1.b
            return r0
    }

    @androidx.annotation.Nullable
    public java.util.Map<java.lang.String, java.lang.Object> b() {
            r7 = this;
            java.lang.String r0 = "version_name"
            java.lang.String r1 = "update_version_code"
            java.lang.String r2 = "version_code"
            com.bytedance.j.xt.f r3 = r7.b
            java.util.Map r3 = r3.j()
            if (r3 != 0) goto L14
            java.util.HashMap r3 = new java.util.HashMap
            r4 = 4
            r3.<init>(r4)
        L14:
            boolean r4 = c(r3)
            if (r4 == 0) goto L7d
            android.content.Context r4 = r7.a     // Catch: java.lang.Throwable -> L4d
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L4d
            android.content.Context r5 = r7.a     // Catch: java.lang.Throwable -> L4d
            java.lang.String r5 = r5.getPackageName()     // Catch: java.lang.Throwable -> L4d
            r6 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r5, r6)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r5 = r4.versionName     // Catch: java.lang.Throwable -> L4d
            r3.put(r0, r5)     // Catch: java.lang.Throwable -> L4d
            int r5 = r4.versionCode     // Catch: java.lang.Throwable -> L4d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L4d
            r3.put(r2, r5)     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r5 = r3.get(r1)     // Catch: java.lang.Throwable -> L4d
            if (r5 != 0) goto L7d
            android.content.pm.ApplicationInfo r4 = r4.applicationInfo     // Catch: java.lang.Throwable -> L4d
            android.os.Bundle r4 = r4.metaData     // Catch: java.lang.Throwable -> L4d
            if (r4 == 0) goto L4f
            java.lang.String r5 = "UPDATE_VERSION_CODE"
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Throwable -> L4d
            goto L50
        L4d:
            goto L5a
        L4f:
            r4 = 0
        L50:
            if (r4 != 0) goto L56
            java.lang.Object r4 = r3.get(r2)     // Catch: java.lang.Throwable -> L4d
        L56:
            r3.put(r1, r4)     // Catch: java.lang.Throwable -> L4d
            return r3
        L5a:
            android.content.Context r4 = r7.a
            java.lang.String r4 = com.bytedance.j.xt.tl.f.k(r4)
            r3.put(r0, r4)
            android.content.Context r0 = r7.a
            int r0 = com.bytedance.j.xt.tl.f.i(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.put(r2, r0)
            java.lang.Object r0 = r3.get(r1)
            if (r0 != 0) goto L7d
            java.lang.Object r0 = r3.get(r2)
            r3.put(r1, r0)
        L7d:
            return r3
    }

    public java.lang.String d() {
            r1 = this;
            android.content.Context r0 = r1.a
            java.lang.String r0 = com.bytedance.j.xt.tl.f.j(r0)
            return r0
    }

    public java.lang.String e() {
            r1 = this;
            com.bytedance.j.xt.f r0 = r1.b
            java.lang.String r0 = r0.xt()
            return r0
    }

    @androidx.annotation.Nullable
    public java.util.Map<java.lang.String, java.lang.Object> f() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.c
            if (r0 != 0) goto Lc
            com.bytedance.j.xt.f r0 = r1.b
            java.util.Map r0 = r0.ae()
            r1.c = r0
        Lc:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.c
            return r0
    }
}
