package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class e3 {
    public static final java.lang.String a = "OnePlusUtils";

    /* renamed from: b, reason: collision with root package name */
    public static boolean f2294b;

    /* renamed from: c, reason: collision with root package name */
    public static java.util.TimerTask f2295c;

    /* renamed from: d, reason: collision with root package name */
    public static android.view.accessibility.AccessibilityNodeInfo f2296d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements com.acse.ottn.n0.d {
        public final /* synthetic */ android.accessibilityservice.AccessibilityService a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f2297b;

        public a(android.accessibilityservice.AccessibilityService r1, java.lang.String r2) {
                r0 = this;
                r0.a = r1
                r0.f2297b = r2
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a() {
                r1 = this;
                r0 = 0
                com.acse.ottn.e3.f2295c = r0
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a(long r8) {
                r7 = this;
                java.lang.String r8 = "OnePlusUtils"
                com.acse.ottn.b r9 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L57
                android.accessibilityservice.AccessibilityService r0 = r7.a     // Catch: java.lang.Exception -> L57
                java.lang.String r1 = r7.f2297b     // Catch: java.lang.Exception -> L57
                android.view.accessibility.AccessibilityNodeInfo r9 = r9.g(r0, r1)     // Catch: java.lang.Exception -> L57
                if (r9 != 0) goto L5b
                int r9 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L57
                r0 = 24
                if (r9 < r0) goto L5a
                android.content.Context r9 = com.acse.ottn.util.HelpShopAppUtil.getContext()     // Catch: java.lang.Exception -> L57
                if (r9 != 0) goto L1d
                goto L5a
            L1d:
                com.acse.ottn.b r0 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L57
                android.accessibilityservice.AccessibilityService r1 = r7.a     // Catch: java.lang.Exception -> L57
                android.content.Context r9 = com.acse.ottn.util.HelpShopAppUtil.getContext()     // Catch: java.lang.Exception -> L57
                int r9 = com.acse.ottn.n4.c(r9)     // Catch: java.lang.Exception -> L57
                int r2 = r9 / 3
                android.content.Context r9 = com.acse.ottn.util.HelpShopAppUtil.getContext()     // Catch: java.lang.Exception -> L57
                int r9 = com.acse.ottn.n4.b(r9)     // Catch: java.lang.Exception -> L57
                int r9 = r9 * 2
                int r9 = r9 / 3
                int r3 = r9 + 300
                android.content.Context r9 = com.acse.ottn.util.HelpShopAppUtil.getContext()     // Catch: java.lang.Exception -> L57
                int r9 = com.acse.ottn.n4.c(r9)     // Catch: java.lang.Exception -> L57
                int r9 = r9 / 3
                int r4 = r9 + 100
                android.content.Context r9 = com.acse.ottn.util.HelpShopAppUtil.getContext()     // Catch: java.lang.Exception -> L57
                int r9 = com.acse.ottn.n4.b(r9)     // Catch: java.lang.Exception -> L57
                int r5 = r9 / 3
                r6 = 200(0xc8, float:2.8E-43)
                r0.a(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L57
                return
            L57:
                r0 = move-exception
                r9 = r0
                goto L83
            L5a:
                return
            L5b:
                java.util.TimerTask r0 = com.acse.ottn.e3.f2295c     // Catch: java.lang.Exception -> L57
                if (r0 == 0) goto L65
                r0.cancel()     // Catch: java.lang.Exception -> L57
                r0 = 0
                com.acse.ottn.e3.f2295c = r0     // Catch: java.lang.Exception -> L57
            L65:
                java.lang.String r0 = "找到了"
                com.acse.ottn.h2.a(r8, r0)     // Catch: java.lang.Exception -> L57
                com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()     // Catch: java.lang.Exception -> L57
                if (r0 == 0) goto L7b
                com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()     // Catch: java.lang.Exception -> L57
                java.lang.String r1 = "battery_white"
                java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L57
                r0.a(r1, r2)     // Catch: java.lang.Exception -> L57
            L7b:
                com.acse.ottn.b r0 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L57
                r0.g(r9)     // Catch: java.lang.Exception -> L57
                return
            L83:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "e ="
                r0.append(r1)
                java.lang.String r9 = r9.getMessage()
                r0.append(r9)
                java.lang.String r9 = r0.toString()
                com.acse.ottn.h2.a(r8, r9)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class b implements com.acse.ottn.n0.d {
        public final /* synthetic */ android.accessibilityservice.AccessibilityService a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f2298b;

        public b(android.accessibilityservice.AccessibilityService r1, java.lang.String r2) {
                r0 = this;
                r0.a = r1
                r0.f2298b = r2
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a() {
                r1 = this;
                r0 = 0
                com.acse.ottn.e3.f2295c = r0
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a(long r4) {
                r3 = this;
                com.acse.ottn.b r4 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L8d
                android.accessibilityservice.AccessibilityService r5 = r3.a     // Catch: java.lang.Exception -> L8d
                java.lang.String r0 = "后台弹出界面"
                android.view.accessibility.AccessibilityNodeInfo r4 = r4.g(r5, r0)     // Catch: java.lang.Exception -> L8d
                r5 = 0
                if (r4 != 0) goto L9b
                com.acse.ottn.b r4 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L8d
                android.accessibilityservice.AccessibilityService r0 = r3.a     // Catch: java.lang.Exception -> L8d
                java.lang.String r1 = r3.f2298b     // Catch: java.lang.Exception -> L8d
                android.view.accessibility.AccessibilityNodeInfo r4 = r4.g(r0, r1)     // Catch: java.lang.Exception -> L8d
                if (r4 == 0) goto L11d
                android.view.accessibility.AccessibilityNodeInfo r0 = r4.getParent()     // Catch: java.lang.Exception -> L8d
                if (r0 == 0) goto L11d
                android.view.accessibility.AccessibilityNodeInfo r0 = r4.getParent()     // Catch: java.lang.Exception -> L8d
                android.view.accessibility.AccessibilityNodeInfo r0 = r0.getParent()     // Catch: java.lang.Exception -> L8d
                if (r0 == 0) goto L11d
                android.view.accessibility.AccessibilityNodeInfo r0 = r4.getParent()     // Catch: java.lang.Exception -> L8d
                android.view.accessibility.AccessibilityNodeInfo r0 = r0.getParent()     // Catch: java.lang.Exception -> L8d
                android.view.accessibility.AccessibilityNodeInfo r0 = r0.getParent()     // Catch: java.lang.Exception -> L8d
                if (r0 == 0) goto L11d
                r0 = 0
            L3c:
                android.view.accessibility.AccessibilityNodeInfo r1 = r4.getParent()     // Catch: java.lang.Exception -> L8d
                android.view.accessibility.AccessibilityNodeInfo r1 = r1.getParent()     // Catch: java.lang.Exception -> L8d
                android.view.accessibility.AccessibilityNodeInfo r1 = r1.getParent()     // Catch: java.lang.Exception -> L8d
                int r1 = r1.getChildCount()     // Catch: java.lang.Exception -> L8d
                if (r0 >= r1) goto L93
                android.view.accessibility.AccessibilityNodeInfo r1 = r4.getParent()     // Catch: java.lang.Exception -> L8d
                android.view.accessibility.AccessibilityNodeInfo r1 = r1.getParent()     // Catch: java.lang.Exception -> L8d
                android.view.accessibility.AccessibilityNodeInfo r1 = r1.getParent()     // Catch: java.lang.Exception -> L8d
                android.view.accessibility.AccessibilityNodeInfo r1 = r1.getChild(r0)     // Catch: java.lang.Exception -> L8d
                if (r1 == 0) goto L90
                java.lang.String r1 = "androidx.recyclerview.widget.RecyclerView"
                android.view.accessibility.AccessibilityNodeInfo r2 = r4.getParent()     // Catch: java.lang.Exception -> L8d
                android.view.accessibility.AccessibilityNodeInfo r2 = r2.getParent()     // Catch: java.lang.Exception -> L8d
                android.view.accessibility.AccessibilityNodeInfo r2 = r2.getParent()     // Catch: java.lang.Exception -> L8d
                android.view.accessibility.AccessibilityNodeInfo r2 = r2.getChild(r0)     // Catch: java.lang.Exception -> L8d
                java.lang.CharSequence r2 = r2.getClassName()     // Catch: java.lang.Exception -> L8d
                boolean r1 = r1.equals(r2)     // Catch: java.lang.Exception -> L8d
                if (r1 == 0) goto L90
                android.view.accessibility.AccessibilityNodeInfo r5 = r4.getParent()     // Catch: java.lang.Exception -> L8d
                android.view.accessibility.AccessibilityNodeInfo r5 = r5.getParent()     // Catch: java.lang.Exception -> L8d
                android.view.accessibility.AccessibilityNodeInfo r5 = r5.getParent()     // Catch: java.lang.Exception -> L8d
                android.view.accessibility.AccessibilityNodeInfo r5 = r5.getChild(r0)     // Catch: java.lang.Exception -> L8d
                goto L90
            L8d:
                r4 = move-exception
                goto L11e
            L90:
                int r0 = r0 + 1
                goto L3c
            L93:
                com.acse.ottn.b r4 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L8d
                r4.b(r5)     // Catch: java.lang.Exception -> L8d
                return
            L9b:
                java.util.TimerTask r0 = com.acse.ottn.e3.f2295c     // Catch: java.lang.Exception -> L8d
                if (r0 == 0) goto La4
                r0.cancel()     // Catch: java.lang.Exception -> L8d
                com.acse.ottn.e3.f2295c = r5     // Catch: java.lang.Exception -> L8d
            La4:
                com.acse.ottn.b r5 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L8d
                r5.g(r4)     // Catch: java.lang.Exception -> L8d
                com.acse.ottn.b r4 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L8d
                com.acse.ottn.t0 r5 = com.acse.ottn.t0.b()     // Catch: java.lang.Exception -> L8d
                r0 = 500(0x1f4, float:7.0E-43)
                int r5 = r5.b(r0)     // Catch: java.lang.Exception -> L8d
                long r0 = (long) r5     // Catch: java.lang.Exception -> L8d
                r4.a(r0)     // Catch: java.lang.Exception -> L8d
                com.acse.ottn.b r4 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L8d
                android.accessibilityservice.AccessibilityService r5 = r3.a     // Catch: java.lang.Exception -> L8d
                java.lang.String r0 = "始终允许"
                android.view.accessibility.AccessibilityNodeInfo r4 = r4.g(r5, r0)     // Catch: java.lang.Exception -> L8d
                com.acse.ottn.b r5 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L8d
                android.accessibilityservice.AccessibilityService r0 = r3.a     // Catch: java.lang.Exception -> L8d
                java.lang.String r1 = "允许"
                r2 = 1
                android.view.accessibility.AccessibilityNodeInfo r5 = r5.a(r0, r1, r2)     // Catch: java.lang.Exception -> L8d
                r0 = 100
                if (r4 == 0) goto Lfb
                com.acse.ottn.b r5 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L8d
                r5.g(r4)     // Catch: java.lang.Exception -> L8d
                com.acse.ottn.b r4 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L8d
                com.acse.ottn.t0 r5 = com.acse.ottn.t0.b()     // Catch: java.lang.Exception -> L8d
                int r5 = r5.b(r0)     // Catch: java.lang.Exception -> L8d
                long r0 = (long) r5     // Catch: java.lang.Exception -> L8d
                r4.a(r0)     // Catch: java.lang.Exception -> L8d
                com.acse.ottn.b r4 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L8d
                android.accessibilityservice.AccessibilityService r5 = r3.a     // Catch: java.lang.Exception -> L8d
                r4.e(r5)     // Catch: java.lang.Exception -> L8d
                return
            Lfb:
                if (r5 == 0) goto L11d
                com.acse.ottn.b r4 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L8d
                r4.g(r5)     // Catch: java.lang.Exception -> L8d
                com.acse.ottn.b r4 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L8d
                com.acse.ottn.t0 r5 = com.acse.ottn.t0.b()     // Catch: java.lang.Exception -> L8d
                int r5 = r5.b(r0)     // Catch: java.lang.Exception -> L8d
                long r0 = (long) r5     // Catch: java.lang.Exception -> L8d
                r4.a(r0)     // Catch: java.lang.Exception -> L8d
                com.acse.ottn.b r4 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L8d
                android.accessibilityservice.AccessibilityService r5 = r3.a     // Catch: java.lang.Exception -> L8d
                r4.e(r5)     // Catch: java.lang.Exception -> L8d
            L11d:
                return
            L11e:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r0 = "e ="
                r5.append(r0)
                java.lang.String r4 = r4.getMessage()
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                java.lang.String r5 = "OnePlusUtils"
                com.acse.ottn.h2.a(r5, r4)
                return
        }
    }

    static {
            return
    }

    public e3() {
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
            java.lang.String r2 = "OnePlusUtils"
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
            java.lang.String r1 = "高级"
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.g(r3, r1)
            if (r0 != 0) goto Ld
            goto L5c
        Ld:
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            r1.g(r0)
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            com.acse.ottn.t0 r1 = com.acse.ottn.t0.b()
            r2 = 200(0xc8, float:2.8E-43)
            int r1 = r1.b(r2)
            long r1 = (long) r1
            r0.a(r1)
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            java.lang.String r1 = "电池"
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.g(r3, r1)
            if (r0 != 0) goto L33
            goto L5c
        L33:
            r1 = 1
            com.acse.ottn.l0.b(r1)
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            r1.g(r0)
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            com.acse.ottn.t0 r1 = com.acse.ottn.t0.b()
            r2 = 500(0x1f4, float:7.0E-43)
            int r1 = r1.b(r2)
            long r1 = (long) r1
            r0.a(r1)
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            java.lang.String r1 = "不优化"
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.g(r3, r1)
            if (r0 != 0) goto L5d
        L5c:
            return
        L5d:
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            r1.g(r0)
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            r0.e(r3)
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            com.acse.ottn.t0 r1 = com.acse.ottn.t0.b()
            r2 = 100
            int r1 = r1.b(r2)
            long r1 = (long) r1
            r0.a(r1)
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            r0.e(r3)
            return
    }

    public static void a(android.app.Activity r4, int r5) {
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
            java.lang.String r4 = "OnePlusUtils"
            java.lang.String r5 = "intent is not available!"
            com.acse.ottn.h2.b(r4, r5)
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    public static void a(android.view.accessibility.AccessibilityNodeInfo r2) {
            if (r2 == 0) goto L25
            int r0 = r2.getChildCount()
            if (r0 != 0) goto L25
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "samon-->"
            com.acse.ottn.h2.a(r1, r0)
            java.lang.CharSequence r0 = r2.getClassName()
            java.lang.String r1 = "android.widget.LinearLayout"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L38
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            r0.g(r2)
            return
        L25:
            if (r2 == 0) goto L38
            r0 = 0
        L28:
            int r1 = r2.getChildCount()
            if (r0 >= r1) goto L38
            android.view.accessibility.AccessibilityNodeInfo r1 = r2.getChild(r0)
            a(r1)
            int r0 = r0 + 1
            goto L28
        L38:
            return
    }

    @androidx.annotation.RequiresApi(api = 16)
    public static void a(java.lang.String r2, android.accessibilityservice.AccessibilityService r3) {
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            android.view.accessibility.AccessibilityNodeInfo r2 = r0.g(r3, r2)
            if (r2 == 0) goto L58
            r3 = 0
        Lb:
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.getParent()
            int r0 = r0.getChildCount()
            if (r3 >= r0) goto L58
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.getParent()
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.getChild(r3)
            if (r0 == 0) goto L55
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.getParent()
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.getChild(r3)
            java.lang.CharSequence r0 = r0.getClassName()
            java.lang.String r1 = "android.widget.CheckBox"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L55
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.getParent()
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.getChild(r3)
            boolean r0 = r0.isChecked()
            if (r0 != 0) goto L50
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.getParent()
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.getChild(r3)
            r0.g(r2)
        L50:
            r2 = 1
            com.acse.ottn.l0.b(r2)
            return
        L55:
            int r3 = r3 + 1
            goto Lb
        L58:
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
            r1 = 1
            if (r0 == 0) goto Lc
            return r1
        Lc:
            java.lang.String r0 = "appops"
            java.lang.Object r8 = r8.getSystemService(r0)
            android.app.AppOpsManager r8 = (android.app.AppOpsManager) r8
            r0 = 0
            java.lang.Class<android.app.AppOpsManager> r2 = android.app.AppOpsManager.class
            java.lang.String r3 = "checkOp"
            r4 = 3
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L4f
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L4f
            r5[r0] = r6     // Catch: java.lang.Exception -> L4f
            r5[r1] = r6     // Catch: java.lang.Exception -> L4f
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r7 = 2
            r5[r7] = r6     // Catch: java.lang.Exception -> L4f
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r5)     // Catch: java.lang.Exception -> L4f
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Exception -> L4f
            int r3 = android.os.Binder.getCallingUid()     // Catch: java.lang.Exception -> L4f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L4f
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L4f
            r4[r0] = r9     // Catch: java.lang.Exception -> L4f
            r4[r1] = r3     // Catch: java.lang.Exception -> L4f
            java.lang.String r9 = com.acse.ottn.l0.w     // Catch: java.lang.Exception -> L4f
            r4[r7] = r9     // Catch: java.lang.Exception -> L4f
            java.lang.Object r8 = r2.invoke(r8, r4)     // Catch: java.lang.Exception -> L4f
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch: java.lang.Exception -> L4f
            int r8 = r8.intValue()     // Catch: java.lang.Exception -> L4f
            if (r8 != 0) goto L4e
            return r1
        L4e:
            return r0
        L4f:
            r8 = move-exception
            java.lang.String r8 = android.util.Log.getStackTraceString(r8)
            java.lang.String r9 = "OnePlusUtils"
            com.acse.ottn.h2.b(r9, r8)
            return r0
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
            com.acse.ottn.o1 r0 = com.acse.ottn.o1.c()
            java.lang.String r0 = r0.b()
            com.acse.ottn.n0 r1 = com.acse.ottn.n0.a()
            com.acse.ottn.t0 r2 = com.acse.ottn.t0.b()
            r3 = 10000(0x2710, float:1.4013E-41)
            int r2 = r2.b(r3)
            com.acse.ottn.t0 r3 = com.acse.ottn.t0.b()
            r4 = 100
            int r3 = r3.b(r4)
            com.acse.ottn.e3$b r4 = new com.acse.ottn.e3$b
            r4.<init>(r5, r0)
            java.util.TimerTask r5 = r1.b(r2, r3, r4)
            com.acse.ottn.e3.f2295c = r5
            return
    }

    public static void b(android.app.Activity r3, int r4) {
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
            java.lang.String r3 = "OnePlusUtils"
            java.lang.String r4 = "Intent is not available!"
            com.acse.ottn.h2.b(r3, r4)
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    public static void b(android.view.accessibility.AccessibilityNodeInfo r3) {
            if (r3 == 0) goto L36
            r0 = 0
        L3:
            int r1 = r3.getChildCount()
            if (r0 >= r1) goto L36
            android.view.accessibility.AccessibilityNodeInfo r1 = r3.getChild(r0)
            if (r1 == 0) goto L26
            android.view.accessibility.AccessibilityNodeInfo r1 = r3.getChild(r0)
            java.lang.CharSequence r1 = r1.getClassName()
            java.lang.String r2 = "androidx.recyclerview.widget.RecyclerView"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L26
            android.view.accessibility.AccessibilityNodeInfo r3 = r3.getChild(r0)
            com.acse.ottn.e3.f2296d = r3
            return
        L26:
            android.view.accessibility.AccessibilityNodeInfo r1 = r3.getChild(r0)
            if (r1 == 0) goto L33
            android.view.accessibility.AccessibilityNodeInfo r1 = r3.getChild(r0)
            b(r1)
        L33:
            int r0 = r0 + 1
            goto L3
        L36:
            return
    }

    @androidx.annotation.RequiresApi(api = 16)
    public static void c(android.accessibilityservice.AccessibilityService r4) {
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            java.lang.String r1 = "允许显示在其他应用的上层"
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.g(r4, r1)
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            java.lang.String r2 = "授予悬浮窗权限"
            android.view.accessibility.AccessibilityNodeInfo r1 = r1.g(r4, r2)
            if (r0 == 0) goto L26
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            r1.g(r0)
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            r0.e(r4)
            goto Lb5
        L26:
            if (r1 == 0) goto L38
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            r0.g(r1)
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            r0.e(r4)
            goto Lb5
        L38:
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            java.lang.String r1 = "此权限允许应用在其他应用上层显示，可能会影响其他应用的显示"
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.g(r4, r1)
            com.acse.ottn.o1 r1 = com.acse.ottn.o1.c()
            java.lang.String r1 = r1.b()
            com.acse.ottn.b r2 = com.acse.ottn.b.c()
            android.view.accessibility.AccessibilityNodeInfo r1 = r2.g(r4, r1)
            if (r0 == 0) goto Lcb
            if (r1 != 0) goto L57
            goto Lcb
        L57:
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
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "x= "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r3 = "   y = "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "samonp-->"
            com.acse.ottn.h2.a(r3, r2)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto Lb5
            com.acse.ottn.b r2 = com.acse.ottn.b.c()
            r2.a(r4, r1, r0)
            java.lang.String r0 = "OnePlusUtils"
            java.lang.String r1 = "点击了"
            com.acse.ottn.h2.a(r0, r1)
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            r1 = 500(0x1f4, double:2.47E-321)
            r0.a(r1)
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            r0.e(r4)
        Lb5:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lcb
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            r1 = 200(0xc8, double:9.9E-322)
            r0.a(r1)
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            r0.e(r4)
        Lcb:
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
            java.lang.String r3 = "OnePlusUtils"
            java.lang.String r4 = "Intent is not available!"
            com.acse.ottn.h2.b(r3, r4)
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    public static void d(android.accessibilityservice.AccessibilityService r0) {
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.getRootInActiveWindow()
            b(r0)
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    public static void e(android.accessibilityservice.AccessibilityService r2) {
            java.lang.String r0 = "samon-->"
            java.lang.String r1 = "getdataPacket"
            com.acse.ottn.h2.a(r0, r1)
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.getRootInActiveWindow()
            a(r2)
            return
    }

    @androidx.annotation.RequiresApi(api = 16)
    public static void f(android.accessibilityservice.AccessibilityService r5) {
            com.acse.ottn.o1 r0 = com.acse.ottn.o1.c()
            java.lang.String r0 = r0.b()
            java.lang.String r1 = "OnePlusUtils"
            com.acse.ottn.h2.a(r1, r0)
            com.acse.ottn.n0 r1 = com.acse.ottn.n0.a()
            com.acse.ottn.t0 r2 = com.acse.ottn.t0.b()
            r3 = 20000(0x4e20, float:2.8026E-41)
            int r2 = r2.b(r3)
            com.acse.ottn.t0 r3 = com.acse.ottn.t0.b()
            r4 = 500(0x1f4, float:7.0E-43)
            int r3 = r3.b(r4)
            com.acse.ottn.e3$a r4 = new com.acse.ottn.e3$a
            r4.<init>(r5, r0)
            java.util.TimerTask r5 = r1.b(r2, r3, r4)
            com.acse.ottn.e3.f2295c = r5
            return
    }
}
