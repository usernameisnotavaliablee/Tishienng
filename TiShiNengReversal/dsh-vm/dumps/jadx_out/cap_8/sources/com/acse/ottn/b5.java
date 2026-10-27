package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b5 {
    public static final java.lang.String a = "isHuawei";

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f2175b = "isXiaomi";

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f2176c = "isOppo";

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f2177d = "isVivo";

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f2178e = "isMeizu";

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f2179f = "isSamsung";

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f2180g = "isLetv";

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String f2181h = "isSmartisan";

    /* renamed from: i, reason: collision with root package name */
    public static volatile com.acse.ottn.b5 f2182i;

    public b5() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.acse.ottn.b5 a() {
            com.acse.ottn.b5 r0 = com.acse.ottn.b5.f2182i
            if (r0 != 0) goto L19
            java.lang.Class<com.acse.ottn.b5> r0 = com.acse.ottn.b5.class
            monitor-enter(r0)
            com.acse.ottn.b5 r1 = com.acse.ottn.b5.f2182i     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.acse.ottn.b5 r1 = new com.acse.ottn.b5     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.acse.ottn.b5.f2182i = r1     // Catch: java.lang.Throwable -> L13
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
            com.acse.ottn.b5 r0 = com.acse.ottn.b5.f2182i
            return r0
    }

    public void a(android.app.Activity r6, java.lang.String r7) {
            r5 = this;
            java.lang.String r0 = com.acse.ottn.n4.b()
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            java.lang.String r2 = "open_battery_white"
            if (r1 == 0) goto L27
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            java.lang.String r3 = "packageName"
            r1.b(r3, r7)
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            java.lang.String r4 = "battery_white"
            r1.a(r4, r3)
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            r1.a(r2, r3)
        L27:
            com.acse.ottn.o1 r1 = com.acse.ottn.o1.c()
            boolean r1 = r1.e()
            if (r1 == 0) goto L78
            com.acse.ottn.n3 r7 = com.acse.ottn.n3.a()
            java.lang.String r1 = "open_battery_white_size"
            boolean r7 = r7.a(r1)
            if (r7 != 0) goto L50
            com.acse.ottn.n3 r7 = com.acse.ottn.n3.a()
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r7.a(r1, r3)
            com.acse.ottn.n3 r7 = com.acse.ottn.n3.a()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r7.a(r2, r1)
            goto L62
        L50:
            com.acse.ottn.q2 r7 = com.acse.ottn.q2.b()
            java.lang.String r1 = "no_find_auto_start"
            r7.a(r1)
            com.acse.ottn.n3 r7 = com.acse.ottn.n3.a()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r7.a(r2, r1)
        L62:
            java.lang.String r7 = "honor"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L74
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 36
            if (r7 < r0) goto L74
            com.acse.ottn.s1.b(r6)
            return
        L74:
            com.acse.ottn.s1.a(r6)
            return
        L78:
            java.lang.String r1 = "vivo"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L84
            com.acse.ottn.z4.b(r6)
            return
        L84:
            java.lang.String r1 = "oppo"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L127
            java.lang.String r1 = "realme"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L96
            goto L127
        L96:
            java.lang.String r1 = "samsung"
            boolean r1 = r1.equals(r0)
            r3 = 10013(0x271d, float:1.4031E-41)
            if (r1 == 0) goto Lc3
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Exception -> Lc2
            java.lang.String r1 = "android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS"
            r0.<init>(r1)     // Catch: java.lang.Exception -> Lc2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lc2
            r1.<init>()     // Catch: java.lang.Exception -> Lc2
            java.lang.String r2 = "package:"
            r1.append(r2)     // Catch: java.lang.Exception -> Lc2
            r1.append(r7)     // Catch: java.lang.Exception -> Lc2
            java.lang.String r7 = r1.toString()     // Catch: java.lang.Exception -> Lc2
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch: java.lang.Exception -> Lc2
            r0.setData(r7)     // Catch: java.lang.Exception -> Lc2
            r6.startActivityForResult(r0, r3)     // Catch: java.lang.Exception -> Lc2
        Lc2:
            return
        Lc3:
            java.lang.String r1 = "xiaomi"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L112
            java.lang.String r1 = "redmi"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L112
            java.lang.String r1 = "blackshark"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto Ldc
            goto L112
        Ldc:
            java.lang.String r1 = "oneplus"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L101
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r1)
            java.lang.String r1 = "android.settings.APPLICATION_DETAILS_SETTINGS"
            r0.setAction(r1)
            java.lang.String r1 = "package"
            r2 = 0
            android.net.Uri r7 = android.net.Uri.fromParts(r1, r7, r2)
            r0.setData(r7)
            r6.startActivityForResult(r0, r3)
            return
        L101:
            java.lang.String r6 = "WhiteListPermission"
            java.lang.String r7 = "current phone is no open battery white"
            com.acse.ottn.h2.b(r6, r7)
            com.acse.ottn.n3 r6 = com.acse.ottn.n3.a()
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r6.a(r2, r7)
            return
        L112:
            com.acse.ottn.n3 r7 = com.acse.ottn.n3.a()
            if (r7 == 0) goto L123
            com.acse.ottn.n3 r7 = com.acse.ottn.n3.a()
            java.lang.String r0 = "OpenPermissionName"
            java.lang.String r1 = "后台弹出界面"
            r7.b(r0, r1)
        L123:
            com.acse.ottn.p2.b(r6)
            return
        L127:
            com.acse.ottn.h3.a(r6)
            return
    }

    @androidx.annotation.RequiresApi(api = 19)
    public boolean a(java.lang.String r10) {
            r9 = this;
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            java.lang.String r1 = "appops"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.AppOpsManager r0 = (android.app.AppOpsManager) r0
            r1 = 1
            java.lang.Class r2 = r0.getClass()     // Catch: java.lang.Exception -> L4a
            java.lang.String r3 = "checkOpNoThrow"
            r4 = 3
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L4a
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L4a
            r7 = 0
            r5[r7] = r6     // Catch: java.lang.Exception -> L4a
            r5[r1] = r6     // Catch: java.lang.Exception -> L4a
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r8 = 2
            r5[r8] = r6     // Catch: java.lang.Exception -> L4a
            java.lang.reflect.Method r2 = r2.getMethod(r3, r5)     // Catch: java.lang.Exception -> L4a
            r3 = 10021(0x2725, float:1.4042E-41)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L4a
            int r5 = android.os.Process.myUid()     // Catch: java.lang.Exception -> L4a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> L4a
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L4a
            r4[r7] = r3     // Catch: java.lang.Exception -> L4a
            r4[r1] = r5     // Catch: java.lang.Exception -> L4a
            r4[r8] = r10     // Catch: java.lang.Exception -> L4a
            java.lang.Object r10 = r2.invoke(r0, r4)     // Catch: java.lang.Exception -> L4a
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch: java.lang.Exception -> L4a
            int r10 = r10.intValue()     // Catch: java.lang.Exception -> L4a
            if (r10 != 0) goto L49
            return r1
        L49:
            return r7
        L4a:
            return r1
    }

    public boolean b() {
            r4 = this;
            java.lang.String r0 = com.acse.ottn.n4.b()
            java.lang.String r1 = "vivo"
            boolean r0 = r1.equals(r0)
            r1 = 0
            if (r0 == 0) goto L47
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r0 <= r2) goto L2e
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            java.lang.String r2 = "power"
            java.lang.Object r0 = r0.getSystemService(r2)
            android.os.PowerManager r0 = (android.os.PowerManager) r0
            if (r0 == 0) goto L2e
            android.content.Context r2 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            java.lang.String r2 = r2.getPackageName()
            boolean r0 = l.o.a(r0, r2)
            goto L2f
        L2e:
            r0 = 0
        L2f:
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            java.lang.String r3 = "battery_hignt_size"
            java.lang.String r2 = r2.e(r3)
            java.lang.String r3 = "2"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L45
            if (r0 == 0) goto L44
            goto L45
        L44:
            return r1
        L45:
            r0 = 1
            return r0
        L47:
            return r1
    }

    public boolean b(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r8)
            r1 = 1
            if (r0 == 0) goto La
            return r1
        La:
            java.lang.String r0 = com.acse.ottn.n4.b()
            java.lang.String r2 = "xiaomi"
            boolean r2 = r2.equals(r0)
            java.lang.String r3 = "open_battery_white"
            if (r2 != 0) goto L91
            java.lang.String r2 = "redmi"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L91
            java.lang.String r2 = "blackshark"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L29
            goto L91
        L29:
            java.lang.String r2 = "samsung"
            boolean r2 = r2.equals(r0)
            r4 = 0
            r5 = 23
            java.lang.String r6 = "power"
            if (r2 == 0) goto L4c
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            java.lang.Object r0 = r0.getSystemService(r6)
            android.os.PowerManager r0 = (android.os.PowerManager) r0
            if (r0 == 0) goto L88
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r5) goto L4b
            boolean r8 = l.o.a(r0, r8)
            return r8
        L4b:
            return r4
        L4c:
            java.lang.String r2 = "oppo"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L64
            java.lang.String r2 = "realme"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L64
            java.lang.String r2 = "oneplus"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L88
        L64:
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            boolean r0 = r0.a(r3)
            android.content.Context r2 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            java.lang.Object r2 = r2.getSystemService(r6)
            android.os.PowerManager r2 = (android.os.PowerManager) r2
            if (r2 == 0) goto L88
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r5) goto L87
            boolean r8 = l.o.a(r2, r8)
            if (r8 != 0) goto L86
            if (r0 == 0) goto L85
            goto L86
        L85:
            return r4
        L86:
            return r1
        L87:
            return r0
        L88:
            com.acse.ottn.n3 r8 = com.acse.ottn.n3.a()
            boolean r8 = r8.a(r3)
            return r8
        L91:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 36
            if (r0 < r1) goto La0
            com.acse.ottn.n3 r8 = com.acse.ottn.n3.a()
            boolean r8 = r8.a(r3)
            return r8
        La0:
            boolean r8 = r7.a(r8)
            return r8
    }
}
