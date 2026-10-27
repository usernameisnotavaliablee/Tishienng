package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class o1 {

    /* renamed from: b, reason: collision with root package name */
    public static com.acse.ottn.o1 f2555b;
    public java.util.List<java.util.HashMap<java.lang.String, java.lang.String>> a;

    public o1() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a = r0
            return
    }

    public static com.acse.ottn.o1 c() {
            com.acse.ottn.o1 r0 = com.acse.ottn.o1.f2555b
            if (r0 != 0) goto L19
            java.lang.Class<com.acse.ottn.o1> r0 = com.acse.ottn.o1.class
            monitor-enter(r0)
            com.acse.ottn.o1 r1 = com.acse.ottn.o1.f2555b     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.acse.ottn.o1 r1 = new com.acse.ottn.o1     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.acse.ottn.o1.f2555b = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.acse.ottn.o1 r0 = com.acse.ottn.o1.f2555b
            return r0
    }

    public java.lang.String a() {
            r2 = this;
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            if (r0 != 0) goto L9
            java.lang.String r0 = com.acse.ottn.l0.f2438i
            return r0
        L9:
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r1 = "accessiblity_state"
            java.lang.String r0 = r0.e(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L1b
            java.lang.String r0 = com.acse.ottn.l0.f2438i
        L1b:
            return r0
    }

    public void a(android.app.Activity r4) {
            r3 = this;
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            android.view.WindowManager r4 = r4.getWindowManager()
            android.view.Display r4 = r4.getDefaultDisplay()
            r4.getMetrics(r0)
            int r4 = r0.widthPixels
            int r0 = r0.heightPixels
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            if (r1 == 0) goto L2c
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            java.lang.String r2 = "screenWidth"
            r1.a(r2, r4)
            com.acse.ottn.n3 r4 = com.acse.ottn.n3.a()
            java.lang.String r1 = "screenHight"
            r4.a(r1, r0)
        L2c:
            return
    }

    public void a(java.lang.String r3) {
            r2 = this;
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            if (r0 != 0) goto L7
            return
        L7:
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r1 = "accessiblity_state"
            r0.b(r1, r3)
            return
    }

    public void a(java.util.List<java.util.HashMap<java.lang.String, java.lang.String>> r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public java.lang.String b() {
            r3 = this;
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()     // Catch: java.lang.Exception -> L29
            if (r0 != 0) goto L9
            java.lang.String r0 = "demo"
            return r0
        L9:
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()     // Catch: java.lang.Exception -> L29
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Exception -> L29
            android.content.Context r1 = com.acse.ottn.util.HelpShopAppUtil.getContext()     // Catch: java.lang.Exception -> L29
            java.lang.String r1 = r1.getPackageName()     // Catch: java.lang.Exception -> L29
            r2 = 0
            android.content.pm.PackageInfo r1 = r0.getPackageInfo(r1, r2)     // Catch: java.lang.Exception -> L29
            android.content.pm.ApplicationInfo r1 = r1.applicationInfo     // Catch: java.lang.Exception -> L29
            java.lang.CharSequence r0 = r1.loadLabel(r0)     // Catch: java.lang.Exception -> L29
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L29
            return r0
        L29:
            r0 = 0
            return r0
    }

    public java.util.List<java.util.HashMap<java.lang.String, java.lang.String>> d() {
            r1 = this;
            java.util.List<java.util.HashMap<java.lang.String, java.lang.String>> r0 = r1.a
            return r0
    }

    public boolean e() {
            r2 = this;
            java.lang.String r0 = com.acse.ottn.n4.b()
            java.lang.String r1 = "huawei"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L35
            java.lang.String r1 = "honor"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L35
            java.lang.String r1 = "tdtech"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L35
            java.lang.String r1 = "ptac"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L35
            java.lang.String r1 = "tyh612m"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L35
            boolean r0 = com.acse.ottn.n4.t()
            if (r0 == 0) goto L33
            goto L35
        L33:
            r0 = 0
            return r0
        L35:
            r0 = 1
            return r0
    }

    public boolean f() {
            r2 = this;
            java.lang.String r0 = com.acse.ottn.n4.b()
            boolean r1 = r2.e()
            if (r1 != 0) goto L4d
            java.lang.String r1 = "oppo"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L4d
            java.lang.String r1 = "vivo"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L4d
            java.lang.String r1 = "xiaomi"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L4d
            java.lang.String r1 = "redmi"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L4d
            java.lang.String r1 = "realme"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L4d
            java.lang.String r1 = "oneplus"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L4d
            java.lang.String r1 = "blackshark"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L4d
            java.lang.String r1 = "samsung"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L4b
            goto L4d
        L4b:
            r0 = 0
            return r0
        L4d:
            r0 = 1
            return r0
    }

    public final java.lang.Object g() throws java.io.ObjectStreamException {
            r1 = this;
            com.acse.ottn.o1 r0 = com.acse.ottn.o1.f2555b
            return r0
    }
}
