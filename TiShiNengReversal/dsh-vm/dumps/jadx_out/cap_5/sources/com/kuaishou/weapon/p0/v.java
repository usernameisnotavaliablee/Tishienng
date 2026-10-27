package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class v {
    public static org.json.JSONObject h = null;
    public static final java.lang.String i = "1";
    public static final java.lang.String j = "2";
    public static final java.lang.String k = "3";
    public static final java.lang.String l = "4";
    public static final java.lang.String m = "5";
    public static final java.lang.String n = "6";
    public static final java.lang.String o = "7";
    public int a;
    public long b;
    public long c;
    public java.lang.String d;
    public java.lang.String e;
    public java.lang.String f;
    public int g;
    private android.content.pm.PackageInfo p;
    private android.content.pm.ApplicationInfo q;
    private android.content.Context r;

    public v(android.content.pm.ApplicationInfo r1, android.content.Context r2) {
            r0 = this;
            r0.<init>()
            r0.q = r1
            r0.r = r2
            return
    }

    public v(android.content.pm.PackageInfo r1, android.content.Context r2) {
            r0 = this;
            r0.<init>()
            r0.p = r1
            r0.r = r2
            return
    }

    public int a() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public void a(int r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void a(long r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public void a(java.lang.String r1) {
            r0 = this;
            r0.e = r1
            return
    }

    public java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.e
            return r0
    }

    public void b(int r1) {
            r0 = this;
            r0.g = r1
            return
    }

    public void b(long r1) {
            r0 = this;
            r0.c = r1
            return
    }

    public void b(java.lang.String r1) {
            r0 = this;
            r0.f = r1
            return
    }

    public java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.f
            return r0
    }

    public void c(java.lang.String r1) {
            r0 = this;
            r0.d = r1
            return
    }

    public long d() {
            r2 = this;
            long r0 = r2.b
            return r0
    }

    public java.lang.String e() {
            r1 = this;
            java.lang.String r0 = r1.d
            return r0
    }

    public long f() {
            r2 = this;
            long r0 = r2.c
            return r0
    }

    public int g() {
            r1 = this;
            int r0 = r1.g
            return r0
    }

    public void h() {
            r3 = this;
            android.content.pm.PackageInfo r0 = r3.p
            if (r0 != 0) goto L9
            android.content.pm.ApplicationInfo r1 = r3.q
            if (r1 != 0) goto L9
            goto L66
        L9:
            if (r0 != 0) goto L22
            android.content.pm.ApplicationInfo r0 = r3.q     // Catch: java.lang.Exception -> L21
            if (r0 == 0) goto L22
            android.content.Context r0 = r3.r     // Catch: java.lang.Exception -> L21
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Exception -> L21
            android.content.pm.ApplicationInfo r1 = r3.q     // Catch: java.lang.Exception -> L21
            java.lang.String r1 = r1.packageName     // Catch: java.lang.Exception -> L21
            r2 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r2)     // Catch: java.lang.Exception -> L21
            r3.p = r0     // Catch: java.lang.Exception -> L21
            goto L22
        L21:
        L22:
            android.content.pm.PackageInfo r0 = r3.p
            if (r0 != 0) goto L2b
            android.content.pm.ApplicationInfo r0 = r3.q
            java.lang.String r0 = r0.packageName
            goto L2d
        L2b:
            java.lang.String r0 = r0.packageName
        L2d:
            r3.a(r0)
            android.content.pm.PackageInfo r0 = r3.p
            if (r0 != 0) goto L3b
            android.content.pm.ApplicationInfo r0 = r3.q
        L36:
            int r0 = r0.flags
            r0 = r0 & 1
            goto L3e
        L3b:
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo
            goto L36
        L3e:
            r3.a(r0)
            java.lang.String r0 = r3.j()
            r3.b(r0)
            android.content.pm.PackageInfo r0 = r3.p
            if (r0 == 0) goto L66
            long r0 = r0.firstInstallTime
            r3.a(r0)
            android.content.pm.PackageInfo r0 = r3.p
            long r0 = r0.lastUpdateTime
            r3.b(r0)
            android.content.pm.PackageInfo r0 = r3.p
            java.lang.String r0 = r0.versionName
            r3.c(r0)
            android.content.pm.PackageInfo r0 = r3.p
            int r0 = r0.versionCode
            r3.b(r0)
        L66:
            return
    }

    public void i() {
            r3 = this;
            android.content.pm.PackageInfo r0 = r3.p
            if (r0 != 0) goto L9
            android.content.pm.ApplicationInfo r1 = r3.q
            if (r1 != 0) goto L9
            goto L5f
        L9:
            if (r0 != 0) goto L22
            android.content.pm.ApplicationInfo r0 = r3.q     // Catch: java.lang.Exception -> L21
            if (r0 == 0) goto L22
            android.content.Context r0 = r3.r     // Catch: java.lang.Exception -> L21
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Exception -> L21
            android.content.pm.ApplicationInfo r1 = r3.q     // Catch: java.lang.Exception -> L21
            java.lang.String r1 = r1.packageName     // Catch: java.lang.Exception -> L21
            r2 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r2)     // Catch: java.lang.Exception -> L21
            r3.p = r0     // Catch: java.lang.Exception -> L21
            goto L22
        L21:
        L22:
            android.content.pm.PackageInfo r0 = r3.p
            if (r0 != 0) goto L2b
            android.content.pm.ApplicationInfo r0 = r3.q
            java.lang.String r0 = r0.packageName
            goto L2d
        L2b:
            java.lang.String r0 = r0.packageName
        L2d:
            r3.a(r0)
            android.content.pm.PackageInfo r0 = r3.p
            if (r0 != 0) goto L3b
            android.content.pm.ApplicationInfo r0 = r3.q
        L36:
            int r0 = r0.flags
            r0 = r0 & 1
            goto L3e
        L3b:
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo
            goto L36
        L3e:
            r3.a(r0)
            android.content.pm.PackageInfo r0 = r3.p
            if (r0 == 0) goto L5f
            long r0 = r0.firstInstallTime
            r3.a(r0)
            android.content.pm.PackageInfo r0 = r3.p
            long r0 = r0.lastUpdateTime
            r3.b(r0)
            android.content.pm.PackageInfo r0 = r3.p
            java.lang.String r0 = r0.versionName
            r3.c(r0)
            android.content.pm.PackageInfo r0 = r3.p
            int r0 = r0.versionCode
            r3.b(r0)
        L5f:
            return
    }

    public java.lang.String j() {
            r2 = this;
            android.content.pm.PackageInfo r0 = r2.p     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L1d
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L1d
            android.content.Context r1 = r2.r     // Catch: java.lang.Throwable -> L36
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Throwable -> L36
            java.lang.CharSequence r0 = r0.loadLabel(r1)     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L36
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L36
            if (r1 != 0) goto L36
            return r0
        L1d:
            android.content.pm.ApplicationInfo r0 = r2.q     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L36
            android.content.Context r1 = r2.r     // Catch: java.lang.Throwable -> L36
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Throwable -> L36
            java.lang.CharSequence r0 = r0.loadLabel(r1)     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L36
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L36
            if (r1 != 0) goto L36
            return r0
        L36:
            java.lang.String r0 = ""
            return r0
    }

    public org.json.JSONObject k() {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L45
            r0.<init>()     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = "1"
            java.lang.String r2 = r4.c()     // Catch: java.lang.Throwable -> L45
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = "2"
            java.lang.String r2 = r4.b()     // Catch: java.lang.Throwable -> L45
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = "3"
            java.lang.String r2 = r4.e()     // Catch: java.lang.Throwable -> L45
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = "4"
            int r2 = r4.g()     // Catch: java.lang.Throwable -> L45
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = "5"
            int r2 = r4.a()     // Catch: java.lang.Throwable -> L45
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = "6"
            long r2 = r4.d()     // Catch: java.lang.Throwable -> L45
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = "7"
            long r2 = r4.f()     // Catch: java.lang.Throwable -> L45
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L45
            return r0
        L45:
            r0 = 0
            return r0
    }
}
