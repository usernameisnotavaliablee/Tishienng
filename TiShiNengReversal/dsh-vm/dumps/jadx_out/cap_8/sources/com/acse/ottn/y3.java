package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class y3 {
    public static final java.lang.String a = "acse_SamsungUtils";

    /* renamed from: b, reason: collision with root package name */
    public static boolean f2907b;

    /* renamed from: c, reason: collision with root package name */
    public static java.util.TimerTask f2908c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements com.acse.ottn.n0.d {
        public final /* synthetic */ android.accessibilityservice.AccessibilityService a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f2909b;

        public a(android.accessibilityservice.AccessibilityService r1, java.lang.String r2) {
                r0 = this;
                r0.a = r1
                r0.f2909b = r2
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a() {
                r1 = this;
                java.util.TimerTask r0 = com.acse.ottn.y3.f2908c
                if (r0 == 0) goto L7
                r0 = 0
                com.acse.ottn.y3.f2908c = r0
            L7:
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a(long r4) {
                r3 = this;
                java.lang.String r4 = "acse_SamsungUtils"
                java.lang.String r5 = "samon-->"
                java.lang.String r0 = "openMiuiFlowWindowPermission倒计时"
                com.acse.ottn.h2.a(r5, r0)
                com.acse.ottn.b r5 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L22
                android.accessibilityservice.AccessibilityService r0 = r3.a     // Catch: java.lang.Exception -> L22
                java.lang.String r1 = r3.f2909b     // Catch: java.lang.Exception -> L22
                android.view.accessibility.AccessibilityNodeInfo r5 = r5.g(r0, r1)     // Catch: java.lang.Exception -> L22
                if (r5 == 0) goto L67
                java.util.TimerTask r0 = com.acse.ottn.y3.f2908c     // Catch: java.lang.Exception -> L22
                if (r0 == 0) goto L24
                r0.cancel()     // Catch: java.lang.Exception -> L22
                r0 = 0
                com.acse.ottn.y3.f2908c = r0     // Catch: java.lang.Exception -> L22
                goto L24
            L22:
                r5 = move-exception
                goto L68
            L24:
                java.lang.String r0 = "找到了"
                com.acse.ottn.h2.a(r4, r0)     // Catch: java.lang.Exception -> L22
                com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()     // Catch: java.lang.Exception -> L22
                java.lang.String r1 = "battery_white"
                java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L22
                r0.a(r1, r2)     // Catch: java.lang.Exception -> L22
                int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L22
                r1 = 23
                if (r0 < r1) goto L67
                android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()     // Catch: java.lang.Exception -> L22
                boolean r0 = l.q.a(r0)     // Catch: java.lang.Exception -> L22
                if (r0 == 0) goto L45
                goto L67
            L45:
                com.acse.ottn.b r0 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L22
                r0.g(r5)     // Catch: java.lang.Exception -> L22
                com.acse.ottn.b r5 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L22
                com.acse.ottn.t0 r0 = com.acse.ottn.t0.b()     // Catch: java.lang.Exception -> L22
                r1 = 200(0xc8, float:2.8E-43)
                int r0 = r0.b(r1)     // Catch: java.lang.Exception -> L22
                long r0 = (long) r0     // Catch: java.lang.Exception -> L22
                r5.a(r0)     // Catch: java.lang.Exception -> L22
                com.acse.ottn.b r5 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L22
                android.accessibilityservice.AccessibilityService r0 = r3.a     // Catch: java.lang.Exception -> L22
                r5.e(r0)     // Catch: java.lang.Exception -> L22
            L67:
                return
            L68:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "e ="
                r0.append(r1)
                java.lang.String r5 = r5.getMessage()
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                com.acse.ottn.h2.a(r4, r5)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class b implements com.acse.ottn.n0.d {
        public final /* synthetic */ java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ android.accessibilityservice.AccessibilityService f2910b;

        public b(java.lang.String r1, android.accessibilityservice.AccessibilityService r2) {
                r0 = this;
                r0.a = r1
                r0.f2910b = r2
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a() {
                r1 = this;
                r0 = 0
                com.acse.ottn.y3.f2908c = r0
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a(long r10) {
                r9 = this;
                java.lang.String r10 = "acse_SamsungUtils"
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r0 = "clickHouTaiShowPage倒计时 ="
                r11.append(r0)
                java.lang.String r0 = r9.a
                r11.append(r0)
                java.lang.String r11 = r11.toString()
                java.lang.String r0 = "samon-->"
                com.acse.ottn.h2.a(r0, r11)
                java.lang.String r11 = r9.a     // Catch: java.lang.Exception -> L7f
                if (r11 != 0) goto L20
                goto L152
            L20:
                com.acse.ottn.b r11 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L7f
                android.accessibilityservice.AccessibilityService r0 = r9.f2910b     // Catch: java.lang.Exception -> L7f
                java.lang.String r1 = r9.a     // Catch: java.lang.Exception -> L7f
                android.view.accessibility.AccessibilityNodeInfo r11 = r11.g(r0, r1)     // Catch: java.lang.Exception -> L7f
                r0 = 100
                java.lang.String r1 = "samonp-->"
                if (r11 != 0) goto L83
                java.lang.String r11 = "appNodeInfo is null"
                com.acse.ottn.h2.a(r1, r11)     // Catch: java.lang.Exception -> L7f
                android.content.Context r11 = com.acse.ottn.util.HelpShopAppUtil.getContext()     // Catch: java.lang.Exception -> L7f
                if (r11 != 0) goto L3f
                goto L152
            L3f:
                int r11 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L7f
                r1 = 24
                if (r11 < r1) goto L152
                com.acse.ottn.b r2 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L7f
                android.accessibilityservice.AccessibilityService r3 = r9.f2910b     // Catch: java.lang.Exception -> L7f
                android.content.Context r11 = com.acse.ottn.util.HelpShopAppUtil.getContext()     // Catch: java.lang.Exception -> L7f
                int r11 = com.acse.ottn.n4.c(r11)     // Catch: java.lang.Exception -> L7f
                int r4 = r11 / 3
                android.content.Context r11 = com.acse.ottn.util.HelpShopAppUtil.getContext()     // Catch: java.lang.Exception -> L7f
                int r11 = com.acse.ottn.n4.b(r11)     // Catch: java.lang.Exception -> L7f
                int r11 = r11 * 2
                int r11 = r11 / 3
                int r5 = r11 + 300
                android.content.Context r11 = com.acse.ottn.util.HelpShopAppUtil.getContext()     // Catch: java.lang.Exception -> L7f
                int r11 = com.acse.ottn.n4.c(r11)     // Catch: java.lang.Exception -> L7f
                int r11 = r11 / 3
                int r6 = r11 + 100
                android.content.Context r11 = com.acse.ottn.util.HelpShopAppUtil.getContext()     // Catch: java.lang.Exception -> L7f
                int r11 = com.acse.ottn.n4.b(r11)     // Catch: java.lang.Exception -> L7f
                int r7 = r11 / 3
                r8 = 500(0x1f4, float:7.0E-43)
                r2.a(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L7f
                return
            L7f:
                r0 = move-exception
                r11 = r0
                goto L153
            L83:
                java.lang.String r2 = "appNodeInfo is not null"
                com.acse.ottn.h2.a(r1, r2)     // Catch: java.lang.Exception -> L7f
                java.util.TimerTask r2 = com.acse.ottn.y3.f2908c     // Catch: java.lang.Exception -> L7f
                if (r2 == 0) goto L92
                r2.cancel()     // Catch: java.lang.Exception -> L7f
                r2 = 0
                com.acse.ottn.y3.f2908c = r2     // Catch: java.lang.Exception -> L7f
            L92:
                java.lang.String r2 = "找到了"
                com.acse.ottn.h2.a(r10, r2)     // Catch: java.lang.Exception -> L7f
                com.acse.ottn.b r2 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L7f
                r2.g(r11)     // Catch: java.lang.Exception -> L7f
                com.acse.ottn.n3 r11 = com.acse.ottn.n3.a()     // Catch: java.lang.Exception -> L7f
                java.lang.String r2 = "battery_white"
                java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L7f
                r11.a(r2, r3)     // Catch: java.lang.Exception -> L7f
                com.acse.ottn.b r11 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L7f
                com.acse.ottn.t0 r2 = com.acse.ottn.t0.b()     // Catch: java.lang.Exception -> L7f
                r3 = 500(0x1f4, float:7.0E-43)
                int r2 = r2.b(r3)     // Catch: java.lang.Exception -> L7f
                long r2 = (long) r2     // Catch: java.lang.Exception -> L7f
                r11.a(r2)     // Catch: java.lang.Exception -> L7f
                com.acse.ottn.b r11 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L7f
                android.accessibilityservice.AccessibilityService r2 = r9.f2910b     // Catch: java.lang.Exception -> L7f
                java.lang.String r3 = "始终允许"
                android.view.accessibility.AccessibilityNodeInfo r11 = r11.j(r2, r3)     // Catch: java.lang.Exception -> L7f
                com.acse.ottn.b r2 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L7f
                android.accessibilityservice.AccessibilityService r3 = r9.f2910b     // Catch: java.lang.Exception -> L7f
                java.lang.String r4 = "允许"
                android.view.accessibility.AccessibilityNodeInfo r2 = r2.j(r3, r4)     // Catch: java.lang.Exception -> L7f
                r3 = 200(0xc8, float:2.8E-43)
                if (r11 == 0) goto Lfd
                java.lang.String r2 = "appinfo is not null"
                com.acse.ottn.h2.a(r1, r2)     // Catch: java.lang.Exception -> L7f
                com.acse.ottn.b r1 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L7f
                r1.g(r11)     // Catch: java.lang.Exception -> L7f
                com.acse.ottn.b r11 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L7f
                com.acse.ottn.t0 r1 = com.acse.ottn.t0.b()     // Catch: java.lang.Exception -> L7f
                int r1 = r1.b(r3)     // Catch: java.lang.Exception -> L7f
                long r1 = (long) r1     // Catch: java.lang.Exception -> L7f
                r11.a(r1)     // Catch: java.lang.Exception -> L7f
                com.acse.ottn.b r11 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L7f
                android.accessibilityservice.AccessibilityService r1 = r9.f2910b     // Catch: java.lang.Exception -> L7f
                r11.e(r1)     // Catch: java.lang.Exception -> L7f
                goto L124
            Lfd:
                if (r2 == 0) goto L124
                com.acse.ottn.b r11 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L7f
                r11.g(r2)     // Catch: java.lang.Exception -> L7f
                com.acse.ottn.b r11 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L7f
                com.acse.ottn.t0 r2 = com.acse.ottn.t0.b()     // Catch: java.lang.Exception -> L7f
                int r2 = r2.b(r3)     // Catch: java.lang.Exception -> L7f
                long r2 = (long) r2     // Catch: java.lang.Exception -> L7f
                r11.a(r2)     // Catch: java.lang.Exception -> L7f
                com.acse.ottn.b r11 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L7f
                android.accessibilityservice.AccessibilityService r2 = r9.f2910b     // Catch: java.lang.Exception -> L7f
                r11.e(r2)     // Catch: java.lang.Exception -> L7f
                java.lang.String r11 = "appinfo1 is not null"
                com.acse.ottn.h2.a(r1, r11)     // Catch: java.lang.Exception -> L7f
            L124:
                com.acse.ottn.n3 r11 = com.acse.ottn.n3.a()     // Catch: java.lang.Exception -> L7f
                java.lang.String r1 = "is_pengpai"
                boolean r11 = r11.a(r1)     // Catch: java.lang.Exception -> L7f
                if (r11 == 0) goto L152
                com.acse.ottn.b r11 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L7f
                android.accessibilityservice.AccessibilityService r1 = r9.f2910b     // Catch: java.lang.Exception -> L7f
                r11.e(r1)     // Catch: java.lang.Exception -> L7f
                com.acse.ottn.b r11 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L7f
                com.acse.ottn.t0 r1 = com.acse.ottn.t0.b()     // Catch: java.lang.Exception -> L7f
                int r0 = r1.b(r0)     // Catch: java.lang.Exception -> L7f
                long r0 = (long) r0     // Catch: java.lang.Exception -> L7f
                r11.a(r0)     // Catch: java.lang.Exception -> L7f
                com.acse.ottn.b r11 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L7f
                android.accessibilityservice.AccessibilityService r0 = r9.f2910b     // Catch: java.lang.Exception -> L7f
                r11.e(r0)     // Catch: java.lang.Exception -> L7f
            L152:
                return
            L153:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "e ="
                r0.append(r1)
                java.lang.String r11 = r11.getMessage()
                r0.append(r11)
                java.lang.String r11 = r0.toString()
                com.acse.ottn.h2.a(r10, r11)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class c implements java.lang.Runnable {
        public final /* synthetic */ android.view.accessibility.AccessibilityNodeInfo a;

        public c(android.view.accessibility.AccessibilityNodeInfo r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                com.acse.ottn.b r0 = com.acse.ottn.b.c()
                android.view.accessibility.AccessibilityNodeInfo r1 = r2.a
                r0.g(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class d implements java.lang.Runnable {
        public final /* synthetic */ android.accessibilityservice.AccessibilityService a;

        public d(android.accessibilityservice.AccessibilityService r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                com.acse.ottn.b r0 = com.acse.ottn.b.c()
                android.accessibilityservice.AccessibilityService r1 = r2.a
                r0.e(r1)
                return
        }
    }

    static {
            return
    }

    public y3() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int a() {
            java.lang.String r0 = "ro.miui.ui.version.name"
            java.lang.String r0 = com.acse.ottn.r3.a(r0)
            if (r0 == 0) goto L30
            r1 = 1
            java.lang.String r1 = r0.substring(r1)     // Catch: java.lang.Exception -> L12
            int r0 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Exception -> L12
            return r0
        L12:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "get miui version code error, version : "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "acse_SamsungUtils"
            com.acse.ottn.h2.b(r2, r0)
            java.lang.String r0 = android.util.Log.getStackTraceString(r1)
            com.acse.ottn.h2.b(r2, r0)
        L30:
            r0 = -1
            return r0
    }

    @androidx.annotation.RequiresApi(api = 16)
    public static void a(android.accessibilityservice.AccessibilityService r3) {
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            java.lang.String r1 = "自启动"
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.g(r3, r1)
            if (r0 != 0) goto Ld
            return
        Ld:
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            r1.g(r0)
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            com.acse.ottn.t0 r1 = com.acse.ottn.t0.b()
            r2 = 300(0x12c, float:4.2E-43)
            int r1 = r1.b(r2)
            long r1 = (long) r1
            r0.a(r1)
            java.lang.String r0 = "允许系统唤醒"
            a(r0, r3)
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            r0.e(r3)
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.String r2 = "battery_white"
            r0.a(r2, r1)
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            r0.e(r3)
            return
    }

    public static void a(android.app.Activity r4) {
            java.lang.String r0 = com.acse.ottn.l0.w
            java.lang.String r1 = ""
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lb
            return
        Lb:
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.String r2 = "battery_white"
            r0.a(r2, r1)
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r2 = "background_battery_hignt"
            r0.a(r2, r1)
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.settings.APPLICATION_DETAILS_SETTINGS"
            r0.<init>(r1)
            java.lang.String r1 = com.acse.ottn.l0.w
            java.lang.String r2 = "package"
            r3 = 0
            android.net.Uri r1 = android.net.Uri.fromParts(r2, r1, r3)
            r0.setData(r1)
            r1 = 10015(0x271f, float:1.4034E-41)
            r4.startActivityForResult(r0, r1)     // Catch: java.lang.Exception -> L37
        L37:
            return
    }

    public static void a(android.app.Activity r2, int r3) {
            int r0 = a()
            r1 = 5
            if (r0 != r1) goto Lb
            b(r2, r3)
            return
        Lb:
            r1 = 6
            if (r0 != r1) goto L12
            c(r2, r3)
            return
        L12:
            r1 = 7
            if (r0 != r1) goto L19
            d(r2, r3)
            return
        L19:
            r1 = 8
            if (r0 != r1) goto L21
            e(r2, r3)
            return
        L21:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "this is a special MIUI rom version, its version code "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "acse_SamsungUtils"
            com.acse.ottn.h2.b(r3, r2)
            return
    }

    @androidx.annotation.RequiresApi(api = 16)
    public static void a(java.lang.String r2, android.accessibilityservice.AccessibilityService r3) {
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            android.view.accessibility.AccessibilityNodeInfo r2 = r0.g(r3, r2)
            if (r2 == 0) goto L5e
            android.view.accessibility.AccessibilityNodeInfo r3 = r2.getParent()
            if (r3 == 0) goto L5e
            r3 = 0
        L11:
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.getParent()
            int r0 = r0.getChildCount()
            if (r3 >= r0) goto L5e
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.getParent()
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.getChild(r3)
            if (r0 == 0) goto L5b
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.getParent()
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.getChild(r3)
            java.lang.CharSequence r0 = r0.getClassName()
            java.lang.String r1 = "android.widget.CheckBox"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5b
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.getParent()
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.getChild(r3)
            boolean r0 = r0.isChecked()
            if (r0 != 0) goto L56
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.getParent()
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.getChild(r3)
            r0.g(r2)
        L56:
            r2 = 1
            com.acse.ottn.l0.b(r2)
            return
        L5b:
            int r3 = r3 + 1
            goto L11
        L5e:
            return
    }

    public static boolean a(android.content.Context r1) {
            r0 = 24
            boolean r1 = a(r1, r0)
            return r1
    }

    @android.annotation.TargetApi(19)
    public static boolean a(android.content.Context r8, int r9) {
            java.lang.String r0 = com.acse.ottn.l0.w
            java.lang.String r1 = ""
            boolean r0 = r1.equals(r0)
            r1 = 0
            if (r0 == 0) goto Lc
            return r1
        Lc:
            java.lang.String r0 = "appops"
            java.lang.Object r8 = r8.getSystemService(r0)
            android.app.AppOpsManager r8 = (android.app.AppOpsManager) r8
            java.lang.Class<android.app.AppOpsManager> r0 = android.app.AppOpsManager.class
            java.lang.String r2 = "checkOp"
            r3 = 3
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L4f
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L4f
            r4[r1] = r5     // Catch: java.lang.Exception -> L4f
            r6 = 1
            r4[r6] = r5     // Catch: java.lang.Exception -> L4f
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r7 = 2
            r4[r7] = r5     // Catch: java.lang.Exception -> L4f
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r4)     // Catch: java.lang.Exception -> L4f
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Exception -> L4f
            int r2 = android.os.Binder.getCallingUid()     // Catch: java.lang.Exception -> L4f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L4f
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L4f
            r3[r1] = r9     // Catch: java.lang.Exception -> L4f
            r3[r6] = r2     // Catch: java.lang.Exception -> L4f
            java.lang.String r9 = com.acse.ottn.l0.w     // Catch: java.lang.Exception -> L4f
            r3[r7] = r9     // Catch: java.lang.Exception -> L4f
            java.lang.Object r8 = r0.invoke(r8, r3)     // Catch: java.lang.Exception -> L4f
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch: java.lang.Exception -> L4f
            int r8 = r8.intValue()     // Catch: java.lang.Exception -> L4f
            if (r8 != 0) goto L4e
            return r6
        L4e:
            return r1
        L4f:
            r8 = move-exception
            java.lang.String r8 = android.util.Log.getStackTraceString(r8)
            java.lang.String r9 = "acse_SamsungUtils"
            com.acse.ottn.h2.b(r9, r8)
            return r1
    }

    public static boolean a(android.content.Intent r2, android.app.Activity r3) {
            r0 = 0
            if (r2 == 0) goto L18
            if (r3 != 0) goto L6
            goto L18
        L6:
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            r1 = 65536(0x10000, float:9.1835E-41)
            java.util.List r2 = r3.queryIntentActivities(r2, r1)
            int r2 = r2.size()
            if (r2 <= 0) goto L18
            r2 = 1
            return r2
        L18:
            return r0
    }

    @androidx.annotation.RequiresApi(api = 16)
    public static void b(android.accessibilityservice.AccessibilityService r5) {
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            r1 = 500(0x1f4, double:2.47E-321)
            r0.a(r1)
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            java.lang.String r1 = "其他权限"
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.g(r5, r1)
            java.lang.String r1 = "samonp-->"
            if (r0 == 0) goto L38
            java.lang.String r5 = "appNodeInfo is not null="
            com.acse.ottn.h2.a(r1, r5)
            com.acse.ottn.b r5 = com.acse.ottn.b.c()
            r5.g(r0)
            com.acse.ottn.n3 r5 = com.acse.ottn.n3.a()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.lang.String r1 = "battery_white"
            r5.a(r1, r0)
            com.acse.ottn.n3 r5 = com.acse.ottn.n3.a()
            java.lang.String r1 = "is_pengpai"
            r5.a(r1, r0)
            return
        L38:
            java.util.TimerTask r0 = com.acse.ottn.y3.f2908c
            if (r0 == 0) goto L42
            r0.cancel()
            r0 = 0
            com.acse.ottn.y3.f2908c = r0
        L42:
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r2 = "OpenPermissionName"
            java.lang.String r0 = r0.e(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "找到了悬浮窗="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.acse.ottn.h2.a(r1, r2)
            java.lang.String r1 = "定位"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L69
            return
        L69:
            com.acse.ottn.n0 r1 = com.acse.ottn.n0.a()
            com.acse.ottn.t0 r2 = com.acse.ottn.t0.b()
            r3 = 6000(0x1770, float:8.408E-42)
            int r2 = r2.b(r3)
            com.acse.ottn.t0 r3 = com.acse.ottn.t0.b()
            r4 = 600(0x258, float:8.41E-43)
            int r3 = r3.b(r4)
            com.acse.ottn.y3$b r4 = new com.acse.ottn.y3$b
            r4.<init>(r0, r5)
            java.util.TimerTask r5 = r1.b(r2, r3, r4)
            com.acse.ottn.y3.f2908c = r5
            return
    }

    public static void b(android.app.Activity r4) {
            java.lang.String r0 = com.acse.ottn.l0.w
            java.lang.String r1 = ""
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lb
            return
        Lb:
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Exception -> L39
            r0.<init>()     // Catch: java.lang.Exception -> L39
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch: java.lang.Exception -> L39
            java.lang.String r2 = "com.miui.securitycenter"
            java.lang.String r3 = "com.miui.permcenter.permissions.PermissionsEditorActivity"
            r1.<init>(r2, r3)     // Catch: java.lang.Exception -> L39
            java.lang.String r2 = "extra_pkgname"
            java.lang.String r3 = com.acse.ottn.l0.w     // Catch: java.lang.Exception -> L39
            r0.putExtra(r2, r3)     // Catch: java.lang.Exception -> L39
            r0.setComponent(r1)     // Catch: java.lang.Exception -> L39
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r1)     // Catch: java.lang.Exception -> L39
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()     // Catch: java.lang.Exception -> L39
            java.lang.String r2 = "battery_white"
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L39
            r1.a(r2, r3)     // Catch: java.lang.Exception -> L39
            r1 = 10013(0x271d, float:1.4031E-41)
            r4.startActivityForResult(r0, r1)     // Catch: java.lang.Exception -> L39
            return
        L39:
            r4 = 1
            com.acse.ottn.l0.b(r4)
            return
    }

    public static void b(android.app.Activity r4, int r5) {
            java.lang.String r0 = com.acse.ottn.l0.w
            java.lang.String r1 = ""
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lb
            return
        Lb:
            java.lang.String r0 = com.acse.ottn.l0.w
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.settings.APPLICATION_DETAILS_SETTINGS"
            r1.<init>(r2)
            java.lang.String r2 = "package"
            r3 = 0
            android.net.Uri r0 = android.net.Uri.fromParts(r2, r0, r3)
            r1.setData(r0)
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r1.setFlags(r0)
            boolean r0 = a(r1, r4)
            if (r0 == 0) goto L2d
            r4.startActivityForResult(r1, r5)
            return
        L2d:
            java.lang.String r4 = "acse_SamsungUtils"
            java.lang.String r5 = "intent is not available!"
            com.acse.ottn.h2.b(r4, r5)
            return
    }

    @androidx.annotation.RequiresApi(api = 16)
    public static void b(java.lang.String r4, android.accessibilityservice.AccessibilityService r5) {
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            android.view.accessibility.AccessibilityNodeInfo r4 = r0.g(r5, r4)
            if (r4 == 0) goto L108
            android.view.accessibility.AccessibilityNodeInfo r0 = r4.getParent()
            if (r0 == 0) goto L108
            r0 = 0
        L11:
            android.view.accessibility.AccessibilityNodeInfo r1 = r4.getParent()
            int r1 = r1.getChildCount()
            if (r0 >= r1) goto L108
            android.view.accessibility.AccessibilityNodeInfo r1 = r4.getParent()
            android.view.accessibility.AccessibilityNodeInfo r1 = r1.getChild(r0)
            if (r1 == 0) goto L104
            android.view.accessibility.AccessibilityNodeInfo r1 = r4.getParent()
            android.view.accessibility.AccessibilityNodeInfo r1 = r1.getChild(r0)
            java.lang.CharSequence r1 = r1.getClassName()
            java.lang.String r2 = "android.widget.CheckBox"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L104
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "android.widget.CheckBox="
            r1.append(r2)
            android.view.accessibility.AccessibilityNodeInfo r2 = r4.getParent()
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.getChild(r0)
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "samon-->"
            com.acse.ottn.h2.a(r2, r1)
            android.view.accessibility.AccessibilityNodeInfo r1 = r4.getParent()
            android.view.accessibility.AccessibilityNodeInfo r1 = r1.getChild(r0)
            boolean r1 = r1.isChecked()
            if (r1 != 0) goto L108
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            android.view.accessibility.AccessibilityNodeInfo r4 = r4.getParent()
            android.view.accessibility.AccessibilityNodeInfo r4 = r4.getChild(r0)
            r1.g(r4)
            com.acse.ottn.b r4 = com.acse.ottn.b.c()
            com.acse.ottn.t0 r0 = com.acse.ottn.t0.b()
            r1 = 100
            int r0 = r0.b(r1)
            long r0 = (long) r0
            r4.a(r0)
            com.acse.ottn.b r4 = com.acse.ottn.b.c()
            com.acse.ottn.service.ShopHelperService r0 = com.acse.ottn.service.ShopHelperService.mService
            java.lang.String r1 = "确定"
            android.view.accessibility.AccessibilityNodeInfo r4 = r4.j(r0, r1)
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            com.acse.ottn.service.ShopHelperService r1 = com.acse.ottn.service.ShopHelperService.mService
            java.lang.String r2 = "知道了"
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.j(r1, r2)
            if (r4 == 0) goto Ld7
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            com.acse.ottn.t0 r1 = com.acse.ottn.t0.b()
            r2 = 200(0xc8, float:2.8E-43)
            int r1 = r1.b(r2)
            long r1 = (long) r1
            r0.a(r1)
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            r0.g(r4)
            com.acse.ottn.b r4 = com.acse.ottn.b.c()
            com.acse.ottn.t0 r0 = com.acse.ottn.t0.b()
            r1 = 500(0x1f4, float:7.0E-43)
            int r0 = r0.b(r1)
            long r0 = (long) r0
            r4.a(r0)
            com.acse.ottn.b r4 = com.acse.ottn.b.c()
            r4.e(r5)
            goto Lff
        Ld7:
            if (r0 == 0) goto Lff
            android.os.Handler r4 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r4.<init>(r1)
            com.acse.ottn.y3$c r1 = new com.acse.ottn.y3$c
            r1.<init>(r0)
            r2 = 100
            r4.postDelayed(r1, r2)
            android.os.Handler r4 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r4.<init>(r0)
            com.acse.ottn.y3$d r0 = new com.acse.ottn.y3$d
            r0.<init>(r5)
            r1 = 500(0x1f4, double:2.47E-321)
            r4.postDelayed(r0, r1)
        Lff:
            r4 = 1
            com.acse.ottn.l0.c(r4)
            return
        L104:
            int r0 = r0 + 1
            goto L11
        L108:
            return
    }

    @androidx.annotation.RequiresApi(api = 16)
    public static void c(android.accessibilityservice.AccessibilityService r4) {
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            r1 = 200(0xc8, double:9.9E-322)
            r0.a(r1)
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            java.lang.String r1 = "允许显示在其他应用的上层"
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.g(r4, r1)
            if (r0 != 0) goto L5a
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            java.lang.String r1 = "显示在其他应用的上层"
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.g(r4, r1)
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            java.lang.String r2 = "允许此应用显示在您当前使用的其他应用的上层。此应用将能得知您点按的位置或更改屏幕上显示的内容。"
            android.view.accessibility.AccessibilityNodeInfo r1 = r1.g(r4, r2)
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.getBoundsInScreen(r2)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.getBoundsInScreen(r0)
            int r1 = r2.right
            int r1 = r1 / 2
            int r0 = r0.top
            int r2 = r2.bottom
            int r0 = r0 - r2
            int r0 = r0 / 2
            int r0 = r0 + r2
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L61
            com.acse.ottn.b r2 = com.acse.ottn.b.c()
            r2.a(r4, r1, r0)
            java.lang.String r0 = "acse_SamsungUtils"
            java.lang.String r1 = "点击了"
            com.acse.ottn.h2.a(r0, r1)
            goto L61
        L5a:
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            r1.g(r0)
        L61:
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            r1 = 300(0x12c, double:1.48E-321)
            r0.a(r1)
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            r0.e(r4)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L7e
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            r0.e(r4)
        L7e:
            return
    }

    public static void c(android.app.Activity r0) {
            a(r0)
            return
    }

    public static void c(android.app.Activity r3, int r4) {
            java.lang.String r0 = com.acse.ottn.l0.w
            java.lang.String r1 = ""
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lb
            return
        Lb:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "miui.intent.action.APP_PERM_EDITOR"
            r0.<init>(r1)
            java.lang.String r1 = "com.miui.securitycenter"
            java.lang.String r2 = "com.miui.permcenter.permissions.AppPermissionsEditorActivity"
            r0.setClassName(r1, r2)
            java.lang.String r1 = com.acse.ottn.l0.w
            java.lang.String r2 = "extra_pkgname"
            r0.putExtra(r2, r1)
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r0.setFlags(r1)
            boolean r1 = a(r0, r3)
            if (r1 == 0) goto L2f
            r3.startActivityForResult(r0, r4)
            return
        L2f:
            java.lang.String r3 = "acse_SamsungUtils"
            java.lang.String r4 = "Intent is not available!"
            com.acse.ottn.h2.b(r3, r4)
            return
    }

    @androidx.annotation.RequiresApi(api = 16)
    public static void d(android.accessibilityservice.AccessibilityService r6) {
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            java.lang.String r1 = "允许系统唤醒"
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.g(r6, r1)
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            java.lang.String r2 = "允许被其他应用唤醒"
            android.view.accessibility.AccessibilityNodeInfo r1 = r1.g(r6, r2)
            java.lang.String r2 = "android.widget.CheckBox"
            r3 = 0
            if (r0 == 0) goto L5f
            android.view.accessibility.AccessibilityNodeInfo r4 = r0.getParent()
            if (r4 == 0) goto L5f
            r4 = 0
        L20:
            android.view.accessibility.AccessibilityNodeInfo r5 = r0.getParent()
            int r5 = r5.getChildCount()
            if (r4 >= r5) goto L5f
            android.view.accessibility.AccessibilityNodeInfo r5 = r0.getParent()
            android.view.accessibility.AccessibilityNodeInfo r5 = r5.getChild(r4)
            if (r5 == 0) goto L5c
            android.view.accessibility.AccessibilityNodeInfo r5 = r0.getParent()
            android.view.accessibility.AccessibilityNodeInfo r5 = r5.getChild(r4)
            java.lang.CharSequence r5 = r5.getClassName()
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L5c
            android.view.accessibility.AccessibilityNodeInfo r5 = r0.getParent()
            android.view.accessibility.AccessibilityNodeInfo r4 = r5.getChild(r4)
            boolean r4 = r4.isChecked()
            if (r4 != 0) goto L5f
            com.acse.ottn.b r4 = com.acse.ottn.b.c()
            r4.g(r0)
            goto L5f
        L5c:
            int r4 = r4 + 1
            goto L20
        L5f:
            if (r1 == 0) goto La6
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.getParent()
            if (r0 == 0) goto La6
        L67:
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.getParent()
            int r0 = r0.getChildCount()
            if (r3 >= r0) goto La6
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.getParent()
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.getChild(r3)
            if (r0 == 0) goto La3
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.getParent()
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.getChild(r3)
            java.lang.CharSequence r0 = r0.getClassName()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto La3
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.getParent()
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.getChild(r3)
            boolean r0 = r0.isChecked()
            if (r0 != 0) goto La6
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            r0.g(r1)
            goto La6
        La3:
            int r3 = r3 + 1
            goto L67
        La6:
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            r0.e(r6)
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            com.acse.ottn.t0 r1 = com.acse.ottn.t0.b()
            r2 = 200(0xc8, float:2.8E-43)
            int r1 = r1.b(r2)
            long r1 = (long) r1
            r0.a(r1)
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            r0.e(r6)
            r6 = 1
            com.acse.ottn.l0.c(r6)
            return
    }

    public static void d(android.app.Activity r3, int r4) {
            java.lang.String r0 = com.acse.ottn.l0.w
            java.lang.String r1 = ""
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lb
            return
        Lb:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "miui.intent.action.APP_PERM_EDITOR"
            r0.<init>(r1)
            java.lang.String r1 = "com.miui.securitycenter"
            java.lang.String r2 = "com.miui.permcenter.permissions.AppPermissionsEditorActivity"
            r0.setClassName(r1, r2)
            java.lang.String r1 = com.acse.ottn.l0.w
            java.lang.String r2 = "extra_pkgname"
            r0.putExtra(r2, r1)
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r0.setFlags(r1)
            boolean r1 = a(r0, r3)
            if (r1 == 0) goto L2f
            r3.startActivityForResult(r0, r4)
            return
        L2f:
            java.lang.String r3 = "acse_SamsungUtils"
            java.lang.String r4 = "Intent is not available!"
            com.acse.ottn.h2.b(r3, r4)
            return
    }

    @androidx.annotation.RequiresApi(api = 16)
    public static void e(android.accessibilityservice.AccessibilityService r5) {
            com.acse.ottn.o1 r0 = com.acse.ottn.o1.c()
            java.lang.String r0 = r0.b()
            java.lang.String r1 = "acse_SamsungUtils"
            com.acse.ottn.h2.a(r1, r0)
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            com.acse.ottn.t0 r2 = com.acse.ottn.t0.b()
            r3 = 200(0xc8, float:2.8E-43)
            int r2 = r2.b(r3)
            long r2 = (long) r2
            r1.a(r2)
            com.acse.ottn.n0 r1 = com.acse.ottn.n0.a()
            com.acse.ottn.t0 r2 = com.acse.ottn.t0.b()
            r3 = 30000(0x7530, float:4.2039E-41)
            int r2 = r2.b(r3)
            com.acse.ottn.t0 r3 = com.acse.ottn.t0.b()
            r4 = 600(0x258, float:8.41E-43)
            int r3 = r3.b(r4)
            com.acse.ottn.y3$a r4 = new com.acse.ottn.y3$a
            r4.<init>(r5, r0)
            java.util.TimerTask r5 = r1.b(r2, r3, r4)
            com.acse.ottn.y3.f2908c = r5
            return
    }

    public static void e(android.app.Activity r7, int r8) {
            java.lang.String r0 = com.acse.ottn.l0.w
            java.lang.String r1 = ""
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lb
            goto L5c
        Lb:
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.String r2 = "battery_white"
            r0.a(r2, r1)
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "miui.intent.action.APP_PERM_EDITOR"
            r0.<init>(r1)
            java.lang.String r2 = "com.miui.permcenter.permissions.PermissionsEditorActivity"
            java.lang.String r3 = "com.miui.securitycenter"
            r0.setClassName(r3, r2)
            java.lang.String r2 = com.acse.ottn.l0.w
            java.lang.String r4 = "extra_pkgname"
            r0.putExtra(r4, r2)
            r2 = 268435456(0x10000000, float:2.524355E-29)
            r0.setFlags(r2)
            boolean r5 = a(r0, r7)
            r6 = 1
            if (r5 == 0) goto L3f
            r7.startActivityForResult(r0, r8)     // Catch: java.lang.Exception -> L3b
            return
        L3b:
            com.acse.ottn.l0.b(r6)
            goto L5c
        L3f:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1)
            r0.setPackage(r3)
            java.lang.String r1 = com.acse.ottn.l0.w
            r0.putExtra(r4, r1)
            r0.setFlags(r2)
            boolean r1 = a(r0, r7)
            if (r1 == 0) goto L5d
            r7.startActivityForResult(r0, r8)     // Catch: java.lang.Exception -> L59
            return
        L59:
            com.acse.ottn.l0.b(r6)
        L5c:
            return
        L5d:
            java.lang.String r7 = "acse_SamsungUtils"
            java.lang.String r8 = "Intent is not available!"
            com.acse.ottn.h2.b(r7, r8)
            return
    }
}
