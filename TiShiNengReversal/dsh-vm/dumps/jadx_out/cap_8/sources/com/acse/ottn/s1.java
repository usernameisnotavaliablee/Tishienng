package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class s1 {
    public static final java.lang.String a = "acse_HuaweiUtils";

    /* renamed from: b, reason: collision with root package name */
    public static boolean f2634b = true;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.Long f2635c;

    /* renamed from: d, reason: collision with root package name */
    public static java.util.TimerTask f2636d;

    /* renamed from: e, reason: collision with root package name */
    public static android.view.accessibility.AccessibilityNodeInfo f2637e;

    /* renamed from: f, reason: collision with root package name */
    public static android.view.accessibility.AccessibilityNodeInfo f2638f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f2639g = null;

    /* renamed from: h, reason: collision with root package name */
    public static java.util.TimerTask f2640h;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements com.acse.ottn.n0.d {
        public final /* synthetic */ android.accessibilityservice.AccessibilityService a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f2641b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.acse.ottn.s1$a$a, reason: collision with other inner class name */
        public class RunnableC0080a implements java.lang.Runnable {
            public final /* synthetic */ com.acse.ottn.s1.a a;

            public RunnableC0080a(com.acse.ottn.s1.a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    com.acse.ottn.s1$a r0 = r2.a
                    android.accessibilityservice.AccessibilityService r0 = r0.a
                    boolean r0 = l.q.a(r0)
                    if (r0 == 0) goto L26
                    com.acse.ottn.b r0 = com.acse.ottn.b.c()
                    com.acse.ottn.s1$a r1 = r2.a
                    android.accessibilityservice.AccessibilityService r1 = r1.a
                    r0.e(r1)
                    com.acse.ottn.s1$a r0 = r2.a
                    boolean r0 = r0.f2641b
                    if (r0 == 0) goto L26
                    com.acse.ottn.b r0 = com.acse.ottn.b.c()
                    com.acse.ottn.s1$a r1 = r2.a
                    android.accessibilityservice.AccessibilityService r1 = r1.a
                    r0.e(r1)
                L26:
                    return
            }
        }

        public a(android.accessibilityservice.AccessibilityService r1, boolean r2) {
                r0 = this;
                r0.a = r1
                r0.f2641b = r2
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a() {
                r1 = this;
                r0 = 0
                com.acse.ottn.s1.f2636d = r0
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a(long r4) {
                r3 = this;
                java.lang.String r4 = "acse_HuaweiUtils"
                com.acse.ottn.b r5 = com.acse.ottn.b.c()     // Catch: java.lang.Throwable -> L2b
                android.accessibilityservice.AccessibilityService r0 = r3.a     // Catch: java.lang.Throwable -> L2b
                java.lang.String r1 = "在其他应用上层显示"
                android.view.accessibility.AccessibilityNodeInfo r5 = r5.g(r0, r1)     // Catch: java.lang.Throwable -> L2b
                r0 = 0
                if (r5 != 0) goto L8e
                boolean r1 = com.acse.ottn.n4.t()     // Catch: java.lang.Throwable -> L2b
                if (r1 != 0) goto L8e
                java.lang.String r1 = "找到  在其他应用上层显示"
                com.acse.ottn.h2.a(r4, r1)     // Catch: java.lang.Throwable -> L2b
                if (r5 != 0) goto L2e
                com.acse.ottn.b r5 = com.acse.ottn.b.c()     // Catch: java.lang.Throwable -> L2b
                android.accessibilityservice.AccessibilityService r1 = r3.a     // Catch: java.lang.Throwable -> L2b
                java.lang.String r2 = "android:id/summary"
                android.view.accessibility.AccessibilityNodeInfo r5 = r5.f(r1, r2)     // Catch: java.lang.Throwable -> L2b
                goto L2e
            L2b:
                r5 = move-exception
                goto Lf2
            L2e:
                if (r5 == 0) goto Lf1
                android.view.accessibility.AccessibilityNodeInfo r1 = r5.getParent()     // Catch: java.lang.Throwable -> L2b
                android.view.accessibility.AccessibilityNodeInfo r1 = r1.getParent()     // Catch: java.lang.Throwable -> L2b
                if (r1 == 0) goto Lf1
                java.util.TimerTask r1 = com.acse.ottn.s1.f2636d     // Catch: java.lang.Throwable -> L2b
                if (r1 == 0) goto L43
                r1.cancel()     // Catch: java.lang.Throwable -> L2b
                com.acse.ottn.s1.f2636d = r0     // Catch: java.lang.Throwable -> L2b
            L43:
                android.graphics.Rect r0 = new android.graphics.Rect     // Catch: java.lang.Throwable -> L2b
                r0.<init>()     // Catch: java.lang.Throwable -> L2b
                r5.getBoundsInScreen(r0)     // Catch: java.lang.Throwable -> L2b
                android.graphics.Rect r1 = new android.graphics.Rect     // Catch: java.lang.Throwable -> L2b
                r1.<init>()     // Catch: java.lang.Throwable -> L2b
                r5.getBoundsInParent(r1)     // Catch: java.lang.Throwable -> L2b
                android.accessibilityservice.AccessibilityService r5 = r3.a     // Catch: java.lang.Throwable -> L2b
                com.acse.ottn.s1.a(r5)     // Catch: java.lang.Throwable -> L2b
                android.content.Context r5 = com.acse.ottn.util.HelpShopAppUtil.getContext()     // Catch: java.lang.Throwable -> L2b
                int r5 = com.acse.ottn.n4.c(r5)     // Catch: java.lang.Throwable -> L2b
                int r0 = r0.top     // Catch: java.lang.Throwable -> L2b
                int r1 = r1.bottom     // Catch: java.lang.Throwable -> L2b
                int r1 = r1 / 2
                int r0 = r0 - r1
                int r0 = r0 + (-30)
                int r5 = r5 + (-80)
                int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L2b
                r2 = 24
                if (r1 < r2) goto Lf1
                com.acse.ottn.b r1 = com.acse.ottn.b.c()     // Catch: java.lang.Throwable -> L2b
                android.accessibilityservice.AccessibilityService r2 = r3.a     // Catch: java.lang.Throwable -> L2b
                r1.a(r2, r5, r0)     // Catch: java.lang.Throwable -> L2b
                android.os.Handler r5 = new android.os.Handler     // Catch: java.lang.Throwable -> L2b
                android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L2b
                r5.<init>(r0)     // Catch: java.lang.Throwable -> L2b
                com.acse.ottn.s1$a$a r0 = new com.acse.ottn.s1$a$a     // Catch: java.lang.Throwable -> L2b
                r0.<init>(r3)     // Catch: java.lang.Throwable -> L2b
                r1 = 300(0x12c, double:1.48E-321)
                r5.postDelayed(r0, r1)     // Catch: java.lang.Throwable -> L2b
                return
            L8e:
                if (r5 == 0) goto Lf1
                android.view.accessibility.AccessibilityNodeInfo r1 = r5.getParent()     // Catch: java.lang.Throwable -> L2b
                if (r1 == 0) goto Lf1
                java.util.TimerTask r1 = com.acse.ottn.s1.f2636d     // Catch: java.lang.Throwable -> L2b
                if (r1 == 0) goto L9f
                r1.cancel()     // Catch: java.lang.Throwable -> L2b
                com.acse.ottn.s1.f2636d = r0     // Catch: java.lang.Throwable -> L2b
            L9f:
                r0 = 0
            La0:
                android.view.accessibility.AccessibilityNodeInfo r1 = r5.getParent()     // Catch: java.lang.Throwable -> L2b
                int r1 = r1.getChildCount()     // Catch: java.lang.Throwable -> L2b
                if (r0 >= r1) goto Lf1
                android.view.accessibility.AccessibilityNodeInfo r1 = r5.getParent()     // Catch: java.lang.Throwable -> L2b
                android.view.accessibility.AccessibilityNodeInfo r1 = r1.getChild(r0)     // Catch: java.lang.Throwable -> L2b
                if (r1 == 0) goto Lee
                java.lang.String r1 = "android.widget.Switch"
                android.view.accessibility.AccessibilityNodeInfo r2 = r5.getParent()     // Catch: java.lang.Throwable -> L2b
                android.view.accessibility.AccessibilityNodeInfo r2 = r2.getChild(r0)     // Catch: java.lang.Throwable -> L2b
                java.lang.CharSequence r2 = r2.getClassName()     // Catch: java.lang.Throwable -> L2b
                boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L2b
                if (r1 == 0) goto Lee
                com.acse.ottn.b r1 = com.acse.ottn.b.c()     // Catch: java.lang.Throwable -> L2b
                android.view.accessibility.AccessibilityNodeInfo r5 = r5.getParent()     // Catch: java.lang.Throwable -> L2b
                android.view.accessibility.AccessibilityNodeInfo r5 = r5.getChild(r0)     // Catch: java.lang.Throwable -> L2b
                r1.g(r5)     // Catch: java.lang.Throwable -> L2b
                com.acse.ottn.b r5 = com.acse.ottn.b.c()     // Catch: java.lang.Throwable -> L2b
                android.accessibilityservice.AccessibilityService r0 = r3.a     // Catch: java.lang.Throwable -> L2b
                r5.e(r0)     // Catch: java.lang.Throwable -> L2b
                boolean r5 = r3.f2641b     // Catch: java.lang.Throwable -> L2b
                if (r5 == 0) goto Lf1
                com.acse.ottn.b r5 = com.acse.ottn.b.c()     // Catch: java.lang.Throwable -> L2b
                android.accessibilityservice.AccessibilityService r0 = r3.a     // Catch: java.lang.Throwable -> L2b
                r5.e(r0)     // Catch: java.lang.Throwable -> L2b
                return
            Lee:
                int r0 = r0 + 1
                goto La0
            Lf1:
                return
            Lf2:
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
        public final /* synthetic */ android.accessibilityservice.AccessibilityService a;

        public b(android.accessibilityservice.AccessibilityService r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a() {
                r1 = this;
                r0 = 0
                com.acse.ottn.s1.f2636d = r0
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a(long r8) {
                r7 = this;
                com.acse.ottn.b r8 = com.acse.ottn.b.c()
                android.accessibilityservice.AccessibilityService r9 = r7.a
                java.lang.String r0 = "跟踪管理"
                android.view.accessibility.AccessibilityNodeInfo r8 = r8.j(r9, r0)
                if (r8 == 0) goto L32
                java.lang.String r9 = "samon-->111="
                java.lang.String r0 = "333"
                com.acse.ottn.h2.a(r9, r0)
                com.acse.ottn.b r9 = com.acse.ottn.b.c()
                r9.g(r8)
                com.acse.ottn.n3 r8 = com.acse.ottn.n3.a()
                java.lang.Boolean r9 = java.lang.Boolean.TRUE
                java.lang.String r0 = "oaid_permission"
                r8.a(r0, r9)
                java.util.TimerTask r8 = com.acse.ottn.s1.f2636d
                if (r8 == 0) goto L71
                r8.cancel()
                r8 = 0
                com.acse.ottn.s1.f2636d = r8
                return
            L32:
                int r8 = android.os.Build.VERSION.SDK_INT
                r9 = 24
                if (r8 < r9) goto L71
                com.acse.ottn.b r0 = com.acse.ottn.b.c()
                android.accessibilityservice.AccessibilityService r1 = r7.a
                android.content.Context r8 = com.acse.ottn.util.HelpShopAppUtil.getContext()
                int r8 = com.acse.ottn.n4.c(r8)
                int r2 = r8 / 3
                android.content.Context r8 = com.acse.ottn.util.HelpShopAppUtil.getContext()
                int r8 = com.acse.ottn.n4.b(r8)
                int r8 = r8 * 2
                int r8 = r8 / 3
                int r3 = r8 + 300
                android.content.Context r8 = com.acse.ottn.util.HelpShopAppUtil.getContext()
                int r8 = com.acse.ottn.n4.c(r8)
                int r8 = r8 / 3
                int r4 = r8 + 100
                android.content.Context r8 = com.acse.ottn.util.HelpShopAppUtil.getContext()
                int r8 = com.acse.ottn.n4.b(r8)
                int r5 = r8 / 3
                r6 = 300(0x12c, float:4.2E-43)
                r0.a(r1, r2, r3, r4, r5, r6)
            L71:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class c implements com.acse.ottn.n0.d {
        public final /* synthetic */ android.accessibilityservice.AccessibilityService a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f2642b;

        public c(android.accessibilityservice.AccessibilityService r1, java.lang.String r2) {
                r0 = this;
                r0.a = r1
                r0.f2642b = r2
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a() {
                r1 = this;
                r0 = 0
                com.acse.ottn.s1.f2636d = r0
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a(long r8) {
                r7 = this;
                com.acse.ottn.b r8 = com.acse.ottn.b.c()
                android.accessibilityservice.AccessibilityService r9 = r7.a
                java.lang.String r0 = r7.f2642b
                android.view.accessibility.AccessibilityNodeInfo r8 = r8.j(r9, r0)
                if (r8 == 0) goto L4e
                java.lang.String r9 = "samon-->111="
                java.lang.String r0 = "333"
                com.acse.ottn.h2.a(r9, r0)
                com.acse.ottn.s1.c(r8)
                java.util.TimerTask r8 = com.acse.ottn.s1.f2636d
                if (r8 == 0) goto L22
                r8.cancel()
                r8 = 0
                com.acse.ottn.s1.f2636d = r8
            L22:
                com.acse.ottn.b r8 = com.acse.ottn.b.c()
                android.accessibilityservice.AccessibilityService r9 = r7.a
                r8.e(r9)
                com.acse.ottn.b r8 = com.acse.ottn.b.c()
                r0 = 200(0xc8, double:9.9E-322)
                r8.a(r0)
                com.acse.ottn.b r8 = com.acse.ottn.b.c()
                android.accessibilityservice.AccessibilityService r9 = r7.a
                r8.e(r9)
                com.acse.ottn.b r8 = com.acse.ottn.b.c()
                r8.a(r0)
                com.acse.ottn.b r8 = com.acse.ottn.b.c()
                android.accessibilityservice.AccessibilityService r9 = r7.a
                r8.e(r9)
                return
            L4e:
                int r8 = android.os.Build.VERSION.SDK_INT
                r9 = 24
                if (r8 < r9) goto L8d
                com.acse.ottn.b r0 = com.acse.ottn.b.c()
                android.accessibilityservice.AccessibilityService r1 = r7.a
                android.content.Context r8 = com.acse.ottn.util.HelpShopAppUtil.getContext()
                int r8 = com.acse.ottn.n4.c(r8)
                int r2 = r8 / 3
                android.content.Context r8 = com.acse.ottn.util.HelpShopAppUtil.getContext()
                int r8 = com.acse.ottn.n4.b(r8)
                int r8 = r8 * 2
                int r8 = r8 / 3
                int r3 = r8 + 300
                android.content.Context r8 = com.acse.ottn.util.HelpShopAppUtil.getContext()
                int r8 = com.acse.ottn.n4.c(r8)
                int r8 = r8 / 3
                int r4 = r8 + 100
                android.content.Context r8 = com.acse.ottn.util.HelpShopAppUtil.getContext()
                int r8 = com.acse.ottn.n4.b(r8)
                int r5 = r8 / 3
                r6 = 300(0x12c, float:4.2E-43)
                r0.a(r1, r2, r3, r4, r5, r6)
            L8d:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class d implements com.acse.ottn.n0.d {
        public final /* synthetic */ android.accessibilityservice.AccessibilityService a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f2643b;

        public d(android.accessibilityservice.AccessibilityService r1, java.lang.String r2) {
                r0 = this;
                r0.a = r1
                r0.f2643b = r2
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a() {
                r1 = this;
                r0 = 0
                com.acse.ottn.s1.f2636d = r0
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a(long r3) {
                r2 = this;
                java.lang.String r3 = "acse_HuaweiUtils"
                com.acse.ottn.b r4 = com.acse.ottn.b.c()     // Catch: java.lang.Throwable -> L1b
                android.accessibilityservice.AccessibilityService r0 = r2.a     // Catch: java.lang.Throwable -> L1b
                java.lang.String r1 = r2.f2643b     // Catch: java.lang.Throwable -> L1b
                android.view.accessibility.AccessibilityNodeInfo r4 = r4.g(r0, r1)     // Catch: java.lang.Throwable -> L1b
                if (r4 == 0) goto L3a
                java.util.TimerTask r0 = com.acse.ottn.s1.f2636d     // Catch: java.lang.Throwable -> L1b
                if (r0 == 0) goto L1d
                r0.cancel()     // Catch: java.lang.Throwable -> L1b
                r0 = 0
                com.acse.ottn.s1.f2636d = r0     // Catch: java.lang.Throwable -> L1b
                goto L1d
            L1b:
                r4 = move-exception
                goto L3b
            L1d:
                com.acse.ottn.b r0 = com.acse.ottn.b.c()     // Catch: java.lang.Throwable -> L1b
                r0.g(r4)     // Catch: java.lang.Throwable -> L1b
                com.acse.ottn.n3 r4 = com.acse.ottn.n3.a()     // Catch: java.lang.Throwable -> L1b
                if (r4 == 0) goto L3a
                java.lang.String r4 = "set battery_white is true"
                com.acse.ottn.h2.a(r3, r4)     // Catch: java.lang.Throwable -> L1b
                com.acse.ottn.n3 r4 = com.acse.ottn.n3.a()     // Catch: java.lang.Throwable -> L1b
                java.lang.String r0 = "battery_white"
                java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L1b
                r4.a(r0, r1)     // Catch: java.lang.Throwable -> L1b
            L3a:
                return
            L3b:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "e ="
                r0.append(r1)
                java.lang.String r4 = r4.getMessage()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                com.acse.ottn.h2.a(r3, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class e implements com.acse.ottn.n0.d {
        public final /* synthetic */ android.accessibilityservice.AccessibilityService a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f2644b;

        public e(android.accessibilityservice.AccessibilityService r1, java.lang.String r2) {
                r0 = this;
                r0.a = r1
                r0.f2644b = r2
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a() {
                r1 = this;
                r0 = 0
                com.acse.ottn.s1.f2636d = r0
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a(long r4) {
                r3 = this;
                java.lang.String r4 = "openHonorFlowWindowPermission start"
                java.lang.String r5 = "acse_HuaweiUtils"
                com.acse.ottn.h2.a(r5, r4)
                android.accessibilityservice.AccessibilityService r4 = r3.a
                com.acse.ottn.s1.b(r4)
                com.acse.ottn.b r4 = com.acse.ottn.b.c()     // Catch: java.lang.Throwable -> L31
                android.accessibilityservice.AccessibilityService r0 = r3.a     // Catch: java.lang.Throwable -> L31
                java.lang.String r1 = r3.f2644b     // Catch: java.lang.Throwable -> L31
                android.view.accessibility.AccessibilityNodeInfo r4 = r4.g(r0, r1)     // Catch: java.lang.Throwable -> L31
                if (r4 != 0) goto L33
                android.view.accessibility.AccessibilityNodeInfo r4 = com.acse.ottn.s1.a()     // Catch: java.lang.Throwable -> L31
                if (r4 == 0) goto L5c
                java.lang.String r4 = "openHonorFlowWindowPermission ScrollForward"
                com.acse.ottn.h2.a(r5, r4)     // Catch: java.lang.Throwable -> L31
                com.acse.ottn.b r4 = com.acse.ottn.b.c()     // Catch: java.lang.Throwable -> L31
                android.view.accessibility.AccessibilityNodeInfo r0 = com.acse.ottn.s1.a()     // Catch: java.lang.Throwable -> L31
                r4.b(r0)     // Catch: java.lang.Throwable -> L31
                return
            L31:
                r4 = move-exception
                goto L5d
            L33:
                java.util.TimerTask r0 = com.acse.ottn.s1.f2636d     // Catch: java.lang.Throwable -> L31
                if (r0 == 0) goto L5c
                r0.cancel()     // Catch: java.lang.Throwable -> L31
                r0 = 0
                com.acse.ottn.s1.f2636d = r0     // Catch: java.lang.Throwable -> L31
                java.lang.String r0 = "openHonorFlowWindowPermission find name"
                com.acse.ottn.h2.a(r5, r0)     // Catch: java.lang.Throwable -> L31
                com.acse.ottn.b r0 = com.acse.ottn.b.c()     // Catch: java.lang.Throwable -> L31
                r0.g(r4)     // Catch: java.lang.Throwable -> L31
                com.acse.ottn.b r4 = com.acse.ottn.b.c()     // Catch: java.lang.Throwable -> L31
                r0 = 200(0xc8, double:9.9E-322)
                r4.a(r0)     // Catch: java.lang.Throwable -> L31
                android.accessibilityservice.AccessibilityService r4 = r3.a     // Catch: java.lang.Throwable -> L31
                long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L31
                r2 = 1
                com.acse.ottn.s1.a(r4, r0, r2)     // Catch: java.lang.Throwable -> L31
            L5c:
                return
            L5d:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "e ="
                r0.append(r1)
                java.lang.String r4 = r4.getMessage()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                com.acse.ottn.h2.a(r5, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class f implements com.acse.ottn.n0.d {
        public final /* synthetic */ android.accessibilityservice.AccessibilityService a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f2645b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f2646c;

        public f(android.accessibilityservice.AccessibilityService r1, java.lang.String r2, boolean r3) {
                r0 = this;
                r0.a = r1
                r0.f2645b = r2
                r0.f2646c = r3
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a() {
                r2 = this;
                java.lang.String r0 = "acse_HuaweiUtils"
                java.lang.String r1 = "结束了"
                com.acse.ottn.h2.a(r0, r1)
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a(long r2) {
                r1 = this;
                android.accessibilityservice.AccessibilityService r2 = r1.a
                android.view.accessibility.AccessibilityNodeInfo r2 = r2.getRootInActiveWindow()
                com.acse.ottn.s1.a(r2)
                android.view.accessibility.AccessibilityNodeInfo r2 = com.acse.ottn.s1.b()
                if (r2 == 0) goto L3d
                com.acse.ottn.b r2 = com.acse.ottn.b.c()
                android.accessibilityservice.AccessibilityService r3 = r1.a
                java.lang.String r0 = r1.f2645b
                android.view.accessibility.AccessibilityNodeInfo r2 = r2.g(r3, r0)
                if (r2 == 0) goto L32
                java.util.TimerTask r3 = com.acse.ottn.s1.f2636d
                if (r3 == 0) goto L27
                r3.cancel()
                r3 = 0
                com.acse.ottn.s1.f2636d = r3
            L27:
                com.acse.ottn.s1.b(r2)
                android.accessibilityservice.AccessibilityService r2 = r1.a
                boolean r3 = r1.f2646c
                com.acse.ottn.s1.a(r2, r3)
                return
            L32:
                com.acse.ottn.b r2 = com.acse.ottn.b.c()
                android.view.accessibility.AccessibilityNodeInfo r3 = com.acse.ottn.s1.b()
                r2.b(r3)
            L3d:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class g implements com.acse.ottn.n0.d {
        public final /* synthetic */ android.accessibilityservice.AccessibilityService a;

        public g(android.accessibilityservice.AccessibilityService r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a() {
                r2 = this;
                java.lang.String r0 = "acse_HuaweiUtils"
                java.lang.String r1 = "结束了"
                com.acse.ottn.h2.a(r0, r1)
                r0 = 0
                com.acse.ottn.s1.f2636d = r0
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a(long r2) {
                r1 = this;
                com.acse.ottn.b r2 = com.acse.ottn.b.c()
                android.accessibilityservice.AccessibilityService r3 = r1.a
                java.lang.String r0 = "手动管理"
                android.view.accessibility.AccessibilityNodeInfo r2 = r2.g(r3, r0)
                if (r2 == 0) goto L71
                java.util.TimerTask r2 = com.acse.ottn.s1.f2636d
                if (r2 == 0) goto L18
                r2.cancel()
                r2 = 0
                com.acse.ottn.s1.f2636d = r2
            L18:
                android.accessibilityservice.AccessibilityService r2 = r1.a
                java.lang.String r3 = "允许自启动"
                com.acse.ottn.s1.a(r3, r2)
                android.accessibilityservice.AccessibilityService r2 = r1.a
                java.lang.String r3 = "允许后台活动"
                com.acse.ottn.s1.a(r3, r2)
                r2 = 1
                com.acse.ottn.l0.b(r2)
                com.acse.ottn.b r2 = com.acse.ottn.b.c()
                android.accessibilityservice.AccessibilityService r3 = r1.a
                r2.e(r3)
                com.acse.ottn.b r2 = com.acse.ottn.b.c()
                android.accessibilityservice.AccessibilityService r3 = r1.a
                r2.e(r3)
                com.acse.ottn.b r2 = com.acse.ottn.b.c()
                android.accessibilityservice.AccessibilityService r3 = r1.a
                r2.e(r3)
                java.lang.String r2 = com.acse.ottn.n4.b()
                java.lang.String r3 = "honor"
                boolean r2 = r3.equals(r2)
                if (r2 == 0) goto L60
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 36
                if (r2 < r3) goto L60
                com.acse.ottn.b r2 = com.acse.ottn.b.c()
                android.accessibilityservice.AccessibilityService r3 = r1.a
                r2.e(r3)
            L60:
                com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
                if (r2 == 0) goto L71
                com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
                java.lang.Boolean r3 = java.lang.Boolean.FALSE
                java.lang.String r0 = "battery_white"
                r2.a(r0, r3)
            L71:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class h implements com.acse.ottn.n0.d {
        public final /* synthetic */ android.accessibilityservice.AccessibilityService a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ android.view.accessibility.AccessibilityNodeInfo f2647b;

        public h(android.accessibilityservice.AccessibilityService r1, android.view.accessibility.AccessibilityNodeInfo r2) {
                r0 = this;
                r0.a = r1
                r0.f2647b = r2
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a() {
                r2 = this;
                java.lang.String r0 = "acse_HuaweiUtils"
                java.lang.String r1 = "结束了"
                com.acse.ottn.h2.a(r0, r1)
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a(long r2) {
                r1 = this;
                com.acse.ottn.b r2 = com.acse.ottn.b.c()
                android.accessibilityservice.AccessibilityService r3 = r1.a
                java.lang.String r0 = "后台弹窗"
                android.view.accessibility.AccessibilityNodeInfo r2 = r2.g(r3, r0)
                if (r2 == 0) goto L31
                java.util.TimerTask r3 = com.acse.ottn.s1.f2636d
                if (r3 == 0) goto L18
                r3.cancel()
                r3 = 0
                com.acse.ottn.s1.f2636d = r3
            L18:
                com.acse.ottn.b r3 = com.acse.ottn.b.c()
                r3.g(r2)
                com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
                if (r2 == 0) goto L30
                com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
                java.lang.Boolean r3 = java.lang.Boolean.TRUE
                java.lang.String r0 = "battery_white"
                r2.a(r0, r3)
            L30:
                return
            L31:
                com.acse.ottn.b r2 = com.acse.ottn.b.c()
                android.view.accessibility.AccessibilityNodeInfo r3 = r1.f2647b
                r2.b(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class i implements com.acse.ottn.n0.d {
        public final /* synthetic */ android.accessibilityservice.AccessibilityService a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f2648b;

        public i(android.accessibilityservice.AccessibilityService r1, java.lang.String r2) {
                r0 = this;
                r0.a = r1
                r0.f2648b = r2
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a() {
                r2 = this;
                java.lang.String r0 = "acse_HuaweiUtils"
                java.lang.String r1 = "结束了"
                com.acse.ottn.h2.a(r0, r1)
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a(long r3) {
                r2 = this;
                android.accessibilityservice.AccessibilityService r3 = r2.a
                android.view.accessibility.AccessibilityNodeInfo r3 = r3.getRootInActiveWindow()
                android.view.accessibility.AccessibilityNodeInfo r3 = com.acse.ottn.s1.h(r3)
                com.acse.ottn.b r4 = com.acse.ottn.b.c()
                android.accessibilityservice.AccessibilityService r0 = r2.a
                java.lang.String r1 = r2.f2648b
                android.view.accessibility.AccessibilityNodeInfo r4 = r4.g(r0, r1)
                if (r4 == 0) goto L49
                java.util.TimerTask r3 = com.acse.ottn.s1.f2636d
                if (r3 == 0) goto L22
                r3.cancel()
                r3 = 0
                com.acse.ottn.s1.f2636d = r3
            L22:
                java.lang.String r3 = r2.f2648b
                android.accessibilityservice.AccessibilityService r4 = r2.a
                com.acse.ottn.s1.a(r3, r4)
                r3 = 1
                com.acse.ottn.l0.c(r3)
                com.acse.ottn.b r3 = com.acse.ottn.b.c()
                android.accessibilityservice.AccessibilityService r4 = r2.a
                r3.e(r4)
                com.acse.ottn.b r3 = com.acse.ottn.b.c()
                android.accessibilityservice.AccessibilityService r4 = r2.a
                r3.e(r4)
                com.acse.ottn.b r3 = com.acse.ottn.b.c()
                android.accessibilityservice.AccessibilityService r4 = r2.a
                r3.e(r4)
                return
            L49:
                if (r3 == 0) goto L52
                com.acse.ottn.b r4 = com.acse.ottn.b.c()
                r4.b(r3)
            L52:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class j implements com.acse.ottn.n0.d {
        public final /* synthetic */ android.accessibilityservice.AccessibilityService a;

        public j(android.accessibilityservice.AccessibilityService r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a() {
                r2 = this;
                java.lang.String r0 = "acse_HuaweiUtils"
                java.lang.String r1 = "结束了"
                com.acse.ottn.h2.a(r0, r1)
                java.util.TimerTask r0 = com.acse.ottn.s1.f2640h
                if (r0 == 0) goto L11
                r0.cancel()
                r0 = 0
                com.acse.ottn.s1.f2640h = r0
            L11:
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a(long r1) {
                r0 = this;
                android.accessibilityservice.AccessibilityService r1 = r0.a     // Catch: java.lang.Exception -> Lb
                android.view.accessibility.AccessibilityNodeInfo r1 = r1.getRootInActiveWindow()     // Catch: java.lang.Exception -> Lb
                android.accessibilityservice.AccessibilityService r2 = r0.a     // Catch: java.lang.Exception -> Lb
                com.acse.ottn.s1.a(r1, r2)     // Catch: java.lang.Exception -> Lb
            Lb:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class k implements com.acse.ottn.n0.d {
        public final /* synthetic */ android.accessibilityservice.AccessibilityService a;

        public k(android.accessibilityservice.AccessibilityService r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a() {
                r1 = this;
                r0 = 0
                com.acse.ottn.s1.f2636d = r0
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a(long r8) {
                r7 = this;
                com.acse.ottn.b r8 = com.acse.ottn.b.c()
                android.accessibilityservice.AccessibilityService r9 = r7.a
                java.lang.String r0 = "应用"
                android.view.accessibility.AccessibilityNodeInfo r8 = r8.j(r9, r0)
                if (r8 == 0) goto L32
                java.lang.String r9 = "samon-->111="
                java.lang.String r0 = "333"
                com.acse.ottn.h2.a(r9, r0)
                com.acse.ottn.n3 r9 = com.acse.ottn.n3.a()
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                java.lang.String r1 = "battery_white"
                r9.a(r1, r0)
                com.acse.ottn.b r9 = com.acse.ottn.b.c()
                r9.g(r8)
                java.util.TimerTask r8 = com.acse.ottn.s1.f2636d
                if (r8 == 0) goto L71
                r8.cancel()
                r8 = 0
                com.acse.ottn.s1.f2636d = r8
                return
            L32:
                int r8 = android.os.Build.VERSION.SDK_INT
                r9 = 24
                if (r8 < r9) goto L71
                com.acse.ottn.b r0 = com.acse.ottn.b.c()
                android.accessibilityservice.AccessibilityService r1 = r7.a
                android.content.Context r8 = com.acse.ottn.util.HelpShopAppUtil.getContext()
                int r8 = com.acse.ottn.n4.c(r8)
                int r2 = r8 / 3
                android.content.Context r8 = com.acse.ottn.util.HelpShopAppUtil.getContext()
                int r8 = com.acse.ottn.n4.b(r8)
                int r8 = r8 * 2
                int r8 = r8 / 3
                int r3 = r8 + 300
                android.content.Context r8 = com.acse.ottn.util.HelpShopAppUtil.getContext()
                int r8 = com.acse.ottn.n4.c(r8)
                int r8 = r8 / 3
                int r4 = r8 + 100
                android.content.Context r8 = com.acse.ottn.util.HelpShopAppUtil.getContext()
                int r8 = com.acse.ottn.n4.b(r8)
                int r5 = r8 / 3
                r6 = 300(0x12c, float:4.2E-43)
                r0.a(r1, r2, r3, r4, r5, r6)
            L71:
                return
        }
    }

    static {
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            com.acse.ottn.s1.f2635c = r0
            r0 = 0
            com.acse.ottn.s1.f2637e = r0
            com.acse.ottn.s1.f2638f = r0
            com.acse.ottn.o1 r0 = com.acse.ottn.o1.c()
            java.lang.String r0 = r0.b()
            com.acse.ottn.s1.f2639g = r0
            return
    }

    public s1() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ android.view.accessibility.AccessibilityNodeInfo a() {
            android.view.accessibility.AccessibilityNodeInfo r0 = com.acse.ottn.s1.f2637e
            return r0
    }

    public static /* synthetic */ void a(android.accessibilityservice.AccessibilityService r0) {
            f(r0)
            return
    }

    @androidx.annotation.RequiresApi(api = 16)
    public static void a(android.accessibilityservice.AccessibilityService r8, long r9, boolean r11) {
            java.lang.Long r0 = com.acse.ottn.s1.f2635c
            long r0 = r0.longValue()
            long r0 = r9 - r0
            r2 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r4 = "   System.currentTimeMillis()-time ="
            java.lang.String r5 = "   System.currentTimeMillis() ="
            java.lang.String r6 = "acse_HuaweiUtils"
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 >= 0) goto L5a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r11 = "间隔 t="
            r8.append(r11)
            r8.append(r9)
            r8.append(r5)
            long r9 = java.lang.System.currentTimeMillis()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.acse.ottn.h2.a(r6, r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "间隔 time="
            r8.append(r9)
            java.lang.Long r9 = com.acse.ottn.s1.f2635c
            r8.append(r9)
            r8.append(r4)
            long r9 = java.lang.System.currentTimeMillis()
            java.lang.Long r11 = com.acse.ottn.s1.f2635c
            long r0 = r11.longValue()
            long r9 = r9 - r0
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.acse.ottn.h2.a(r6, r8)
            return
        L5a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "无间隔 t="
            r0.append(r1)
            r0.append(r9)
            r0.append(r5)
            long r1 = java.lang.System.currentTimeMillis()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.acse.ottn.h2.a(r6, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "无间隔 time="
            r0.append(r1)
            java.lang.Long r1 = com.acse.ottn.s1.f2635c
            r0.append(r1)
            r0.append(r4)
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Long r3 = com.acse.ottn.s1.f2635c
            long r3 = r3.longValue()
            long r1 = r1 - r3
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.acse.ottn.h2.a(r6, r0)
            java.util.TimerTask r0 = com.acse.ottn.s1.f2636d
            if (r0 == 0) goto La9
            r0.cancel()
            r0 = 0
            com.acse.ottn.s1.f2636d = r0
        La9:
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            com.acse.ottn.s1.f2635c = r9
            com.acse.ottn.n0 r9 = com.acse.ottn.n0.a()
            com.acse.ottn.t0 r10 = com.acse.ottn.t0.b()
            r0 = 2000(0x7d0, float:2.803E-42)
            int r10 = r10.b(r0)
            com.acse.ottn.t0 r0 = com.acse.ottn.t0.b()
            r1 = 400(0x190, float:5.6E-43)
            int r0 = r0.b(r1)
            com.acse.ottn.s1$a r1 = new com.acse.ottn.s1$a
            r1.<init>(r8, r11)
            java.util.TimerTask r8 = r9.b(r10, r0, r1)
            com.acse.ottn.s1.f2636d = r8
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    public static void a(android.accessibilityservice.AccessibilityService r4, android.view.accessibility.AccessibilityNodeInfo r5) {
            if (r5 == 0) goto L65
            r0 = 0
        L3:
            int r1 = r5.getChildCount()
            if (r0 >= r1) goto L3e
            android.view.accessibility.AccessibilityNodeInfo r1 = r5.getChild(r0)
            if (r1 == 0) goto L2e
            android.view.accessibility.AccessibilityNodeInfo r1 = r5.getChild(r0)
            java.lang.CharSequence r1 = r1.getClassName()
            java.lang.String r2 = "android.widget.ListView"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L2e
            android.view.accessibility.AccessibilityNodeInfo r1 = r5.getChild(r0)
            int r1 = r1.getChildCount()
            if (r1 <= 0) goto L2e
            android.view.accessibility.AccessibilityNodeInfo r5 = r5.getChild(r0)
            goto L3f
        L2e:
            android.view.accessibility.AccessibilityNodeInfo r1 = r5.getChild(r0)
            if (r1 == 0) goto L3b
            android.view.accessibility.AccessibilityNodeInfo r1 = r5.getChild(r0)
            a(r4, r1)
        L3b:
            int r0 = r0 + 1
            goto L3
        L3e:
            r5 = 0
        L3f:
            if (r5 != 0) goto L42
            goto L65
        L42:
            com.acse.ottn.n0 r0 = com.acse.ottn.n0.a()
            com.acse.ottn.t0 r1 = com.acse.ottn.t0.b()
            r2 = 3000(0xbb8, float:4.204E-42)
            int r1 = r1.b(r2)
            com.acse.ottn.t0 r2 = com.acse.ottn.t0.b()
            r3 = 100
            int r2 = r2.b(r3)
            com.acse.ottn.s1$h r3 = new com.acse.ottn.s1$h
            r3.<init>(r4, r5)
            java.util.TimerTask r4 = r0.b(r1, r2, r3)
            com.acse.ottn.s1.f2636d = r4
        L65:
            return
    }

    @androidx.annotation.RequiresApi(api = 16)
    public static void a(android.accessibilityservice.AccessibilityService r3, boolean r4) {
            com.acse.ottn.n0 r4 = com.acse.ottn.n0.a()
            com.acse.ottn.t0 r0 = com.acse.ottn.t0.b()
            r1 = 6000(0x1770, float:8.408E-42)
            int r0 = r0.b(r1)
            com.acse.ottn.t0 r1 = com.acse.ottn.t0.b()
            r2 = 100
            int r1 = r1.b(r2)
            com.acse.ottn.s1$g r2 = new com.acse.ottn.s1$g
            r2.<init>(r3)
            java.util.TimerTask r3 = r4.b(r0, r1, r2)
            com.acse.ottn.s1.f2636d = r3
            return
    }

    public static void a(android.app.Activity r4) {
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r1 = "OpenPermissionName"
            java.lang.String r0 = r0.e(r1)
            java.lang.String r1 = "权限管理"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1d
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.String r2 = "background_battery_hignt"
            r0.a(r2, r1)
        L1d:
            int r0 = android.os.Build.VERSION.SDK_INT
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            r2 = 36
            if (r0 < r2) goto L34
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch: java.lang.Exception -> L32
            java.lang.String r2 = "com.android.settings"
            java.lang.String r3 = "com.android.settings.HWSettings"
            r0.<init>(r2, r3)     // Catch: java.lang.Exception -> L32
            goto L59
        L32:
            r0 = move-exception
            goto L60
        L34:
            r2 = 28
            java.lang.String r3 = "com.huawei.systemmanager/.startupmgr.ui.StartupNormalAppListActivity"
            if (r0 < r2) goto L3f
            android.content.ComponentName r0 = android.content.ComponentName.unflattenFromString(r3)     // Catch: java.lang.Exception -> L32
            goto L59
        L3f:
            r2 = 26
            if (r0 < r2) goto L4a
            java.lang.String r0 = "com.huawei.systemmanager/.appcontrol.activity.StartupAppControlActivity"
            android.content.ComponentName r0 = android.content.ComponentName.unflattenFromString(r0)     // Catch: java.lang.Exception -> L32
            goto L59
        L4a:
            r2 = 23
            if (r0 < r2) goto L53
            android.content.ComponentName r0 = android.content.ComponentName.unflattenFromString(r3)     // Catch: java.lang.Exception -> L32
            goto L59
        L53:
            java.lang.String r0 = "com.huawei.systemmanager/com.huawei.permissionmanager.ui.MainActivity"
            android.content.ComponentName r0 = android.content.ComponentName.unflattenFromString(r0)     // Catch: java.lang.Exception -> L32
        L59:
            r1.setComponent(r0)     // Catch: java.lang.Exception -> L32
            r4.startActivity(r1)     // Catch: java.lang.Exception -> L32
            return
        L60:
            java.lang.String r2 = "com.android.settings/.Settings$AppAndNotificationDashboardActivity"
            android.content.ComponentName r2 = android.content.ComponentName.unflattenFromString(r2)     // Catch: java.lang.Exception -> L6d
            r1.setComponent(r2)     // Catch: java.lang.Exception -> L6d
            r4.startActivity(r1)     // Catch: java.lang.Exception -> L6d
            goto L7a
        L6d:
            java.lang.String r4 = r0.getMessage()
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "acse_HuaweiUtils"
            com.acse.ottn.h2.b(r0, r4)
        L7a:
            return
    }

    public static void a(android.app.Activity r9, int r10) {
            java.lang.String r0 = "acse_HuaweiUtils"
            java.lang.String r1 = "com.huawei.systemmanager"
            r2 = 268435456(0x10000000, float:2.524355E-29)
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Exception -> L29 android.content.ActivityNotFoundException -> L2b java.lang.SecurityException -> L2d
            r3.<init>()     // Catch: java.lang.Exception -> L29 android.content.ActivityNotFoundException -> L2b java.lang.SecurityException -> L2d
            r3.setFlags(r2)     // Catch: java.lang.Exception -> L29 android.content.ActivityNotFoundException -> L2b java.lang.SecurityException -> L2d
            android.content.ComponentName r4 = new android.content.ComponentName     // Catch: java.lang.Exception -> L29 android.content.ActivityNotFoundException -> L2b java.lang.SecurityException -> L2d
            java.lang.String r5 = "com.huawei.systemmanager.addviewmonitor.AddViewMonitorActivity"
            r4.<init>(r1, r5)     // Catch: java.lang.Exception -> L29 android.content.ActivityNotFoundException -> L2b java.lang.SecurityException -> L2d
            r3.setComponent(r4)     // Catch: java.lang.Exception -> L29 android.content.ActivityNotFoundException -> L2b java.lang.SecurityException -> L2d
            double r4 = com.acse.ottn.r3.f()     // Catch: java.lang.Exception -> L29 android.content.ActivityNotFoundException -> L2b java.lang.SecurityException -> L2d
            r6 = 4614162998222441677(0x4008cccccccccccd, double:3.1)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L2f
            r9.startActivityForResult(r3, r10)     // Catch: java.lang.Exception -> L29 android.content.ActivityNotFoundException -> L2b java.lang.SecurityException -> L2d
            return
        L29:
            r9 = move-exception
            goto L3d
        L2b:
            r1 = move-exception
            goto L45
        L2d:
            r3 = move-exception
            goto L64
        L2f:
            android.content.ComponentName r4 = new android.content.ComponentName     // Catch: java.lang.Exception -> L29 android.content.ActivityNotFoundException -> L2b java.lang.SecurityException -> L2d
            java.lang.String r5 = "com.huawei.notificationmanager.ui.NotificationManagmentActivity"
            r4.<init>(r1, r5)     // Catch: java.lang.Exception -> L29 android.content.ActivityNotFoundException -> L2b java.lang.SecurityException -> L2d
            r3.setComponent(r4)     // Catch: java.lang.Exception -> L29 android.content.ActivityNotFoundException -> L2b java.lang.SecurityException -> L2d
            r9.startActivity(r3)     // Catch: java.lang.Exception -> L29 android.content.ActivityNotFoundException -> L2b java.lang.SecurityException -> L2d
            return
        L3d:
            java.lang.String r9 = android.util.Log.getStackTraceString(r9)
            com.acse.ottn.h2.b(r0, r9)
            goto L80
        L45:
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            r3.setFlags(r2)
            android.content.ComponentName r2 = new android.content.ComponentName
            java.lang.String r4 = "com.Android.settings"
            java.lang.String r5 = "com.android.settings.permission.TabItem"
            r2.<init>(r4, r5)
            r3.setComponent(r2)
            r9.startActivityForResult(r3, r10)
            java.lang.String r9 = android.util.Log.getStackTraceString(r1)
            com.acse.ottn.h2.b(r0, r9)
            goto L80
        L64:
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            r4.setFlags(r2)
            android.content.ComponentName r2 = new android.content.ComponentName
            java.lang.String r5 = "com.huawei.permissionmanager.ui.MainActivity"
            r2.<init>(r1, r5)
            r4.setComponent(r2)
            r9.startActivityForResult(r4, r10)
            java.lang.String r9 = android.util.Log.getStackTraceString(r3)
            com.acse.ottn.h2.b(r0, r9)
        L80:
            return
    }

    public static /* synthetic */ void a(android.view.accessibility.AccessibilityNodeInfo r0) {
            e(r0)
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    public static void a(android.view.accessibility.AccessibilityNodeInfo r3, android.accessibilityservice.AccessibilityService r4) {
            if (r3 == 0) goto L4f
            int r0 = r3.getChildCount()
            if (r0 != 0) goto L4f
            java.lang.CharSequence r0 = r3.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L73
            java.lang.CharSequence r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r3.trim()
            java.lang.String r0 = com.acse.ottn.s1.f2639g
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L38
            java.util.TimerTask r3 = com.acse.ottn.s1.f2640h
            if (r3 == 0) goto L30
            r3.cancel()
            r3 = 0
            com.acse.ottn.s1.f2640h = r3
        L30:
            com.acse.ottn.b r3 = com.acse.ottn.b.c()
            r3.e(r4)
            return
        L38:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "getText = "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "samon-->12"
            com.acse.ottn.h2.c(r4, r3)
            return
        L4f:
            if (r3 == 0) goto L73
            r0 = 0
        L52:
            int r1 = r3.getChildCount()
            if (r0 >= r1) goto L73
            android.view.accessibility.AccessibilityNodeInfo r1 = r3.getChild(r0)     // Catch: java.lang.Throwable -> L66
            if (r1 == 0) goto L70
            android.view.accessibility.AccessibilityNodeInfo r1 = r3.getChild(r0)     // Catch: java.lang.Throwable -> L66
            a(r1, r4)     // Catch: java.lang.Throwable -> L66
            goto L70
        L66:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            java.lang.String r2 = "acse_HuaweiUtils"
            com.acse.ottn.h2.a(r2, r1)
        L70:
            int r0 = r0 + 1
            goto L52
        L73:
            return
    }

    public static /* synthetic */ void a(java.lang.String r0, android.accessibilityservice.AccessibilityService r1) {
            b(r0, r1)
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
            java.lang.String r9 = "acse_HuaweiUtils"
            com.acse.ottn.h2.b(r9, r8)
            return r1
    }

    public static /* synthetic */ android.view.accessibility.AccessibilityNodeInfo b() {
            android.view.accessibility.AccessibilityNodeInfo r0 = com.acse.ottn.s1.f2638f
            return r0
    }

    public static /* synthetic */ void b(android.accessibilityservice.AccessibilityService r0) {
            e(r0)
            return
    }

    @androidx.annotation.RequiresApi(api = 16)
    public static void b(android.accessibilityservice.AccessibilityService r3, boolean r4) {
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            com.acse.ottn.t0 r1 = com.acse.ottn.t0.b()
            r2 = 200(0xc8, float:2.8E-43)
            int r1 = r1.b(r2)
            long r1 = (long) r1
            r0.a(r1)
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            java.lang.String r1 = "应用启动管理"
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.h(r3, r1)
            java.lang.String r1 = "acse_HuaweiUtils"
            if (r0 != 0) goto L26
            java.lang.String r3 = "clickOpenBatteryManage"
            com.acse.ottn.h2.a(r1, r3)
            return
        L26:
            java.lang.String r0 = "找到"
            com.acse.ottn.h2.a(r1, r0)
            d(r3, r4)     // Catch: java.lang.Throwable -> L2e
        L2e:
            return
    }

    public static void b(android.app.Activity r4) {
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch: java.lang.Exception -> L14
            java.lang.String r2 = "com.android.settings"
            java.lang.String r3 = "com.android.settings.HWSettings"
            r1.<init>(r2, r3)     // Catch: java.lang.Exception -> L14
            r0.setComponent(r1)     // Catch: java.lang.Exception -> L14
            r4.startActivity(r0)     // Catch: java.lang.Exception -> L14
        L14:
            return
    }

    public static /* synthetic */ void b(android.view.accessibility.AccessibilityNodeInfo r0) {
            f(r0)
            return
    }

    @androidx.annotation.RequiresApi(api = 16)
    public static void b(java.lang.String r2, android.accessibilityservice.AccessibilityService r3) {
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            android.view.accessibility.AccessibilityNodeInfo r2 = r0.g(r3, r2)
            if (r2 == 0) goto L6b
            android.view.accessibility.AccessibilityNodeInfo r3 = r2.getParent()
            if (r3 == 0) goto L6b
            r3 = 0
        L11:
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.getParent()
            int r0 = r0.getChildCount()
            if (r3 >= r0) goto L6b
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.getParent()
            java.lang.CharSequence r0 = r0.getClassName()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "samon-->"
            com.acse.ottn.h2.a(r1, r0)
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.getParent()
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.getChild(r3)
            if (r0 == 0) goto L68
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.getParent()
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.getChild(r3)
            java.lang.CharSequence r0 = r0.getClassName()
            java.lang.String r1 = "android.widget.Switch"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L68
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.getParent()
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.getChild(r3)
            boolean r0 = r0.isChecked()
            if (r0 != 0) goto L6b
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.getParent()
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.getChild(r3)
            r0.g(r2)
            return
        L68:
            int r3 = r3 + 1
            goto L11
        L6b:
            return
    }

    @androidx.annotation.RequiresApi(api = 16)
    public static void c(android.accessibilityservice.AccessibilityService r5) {
            java.util.TimerTask r0 = com.acse.ottn.s1.f2636d
            if (r0 == 0) goto La
            r0.cancel()
            r0 = 0
            com.acse.ottn.s1.f2636d = r0
        La:
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r1 = "OpenPermissionName"
            java.lang.String r0 = r0.e(r1)
            com.acse.ottn.n0 r1 = com.acse.ottn.n0.a()
            com.acse.ottn.t0 r2 = com.acse.ottn.t0.b()
            r3 = 8000(0x1f40, float:1.121E-41)
            int r2 = r2.b(r3)
            com.acse.ottn.t0 r3 = com.acse.ottn.t0.b()
            r4 = 100
            int r3 = r3.b(r4)
            com.acse.ottn.s1$d r4 = new com.acse.ottn.s1$d
            r4.<init>(r5, r0)
            java.util.TimerTask r5 = r1.b(r2, r3, r4)
            com.acse.ottn.s1.f2636d = r5
            return
    }

    public static void c(android.accessibilityservice.AccessibilityService r0, boolean r1) {
            e(r0, r1)
            return
    }

    public static /* synthetic */ void c(android.view.accessibility.AccessibilityNodeInfo r0) {
            d(r0)
            return
    }

    public static void d(android.accessibilityservice.AccessibilityService r5) {
            com.acse.ottn.o1 r0 = com.acse.ottn.o1.c()
            java.lang.String r0 = r0.b()
            com.acse.ottn.n0 r1 = com.acse.ottn.n0.a()
            com.acse.ottn.t0 r2 = com.acse.ottn.t0.b()
            r3 = 15000(0x3a98, float:2.102E-41)
            int r2 = r2.b(r3)
            com.acse.ottn.t0 r3 = com.acse.ottn.t0.b()
            r4 = 100
            int r3 = r3.b(r4)
            com.acse.ottn.s1$i r4 = new com.acse.ottn.s1$i
            r4.<init>(r5, r0)
            java.util.TimerTask r5 = r1.b(r2, r3, r4)
            com.acse.ottn.s1.f2636d = r5
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    public static void d(android.accessibilityservice.AccessibilityService r1, boolean r2) {
            r0 = 0
            com.acse.ottn.s1.f2638f = r0
            f(r1, r2)
            return
    }

    public static void d(android.view.accessibility.AccessibilityNodeInfo r2) {
            if (r2 == 0) goto L2c
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.getParent()
            if (r0 == 0) goto L2c
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.getParent()
            java.lang.String r1 = "com.huawei.hms.ads:id/app_track_switch"
            android.view.accessibility.AccessibilityNodeInfo r2 = r0.a(r2, r1)
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "samon-->"
            com.acse.ottn.h2.a(r1, r0)
            boolean r0 = r2.isChecked()
            if (r0 != 0) goto L2c
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            r0.g(r2)
        L2c:
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    public static void e(android.accessibilityservice.AccessibilityService r0) {
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.getRootInActiveWindow()
            g(r0)
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    public static void e(android.accessibilityservice.AccessibilityService r4, boolean r5) {
            android.view.accessibility.AccessibilityNodeInfo r0 = r4.getRootInActiveWindow()
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            com.acse.ottn.t0 r2 = com.acse.ottn.t0.b()
            r3 = 1000(0x3e8, float:1.401E-42)
            int r2 = r2.b(r3)
            long r2 = (long) r2
            r1.a(r2)
            if (r5 == 0) goto L1c
            a(r4, r0)
            return
        L1c:
            d(r4)
            return
    }

    public static void e(android.view.accessibility.AccessibilityNodeInfo r4) {
            if (r4 != 0) goto L3
            goto L5e
        L3:
            r0 = 0
        L4:
            int r1 = r4.getChildCount()     // Catch: java.lang.Exception -> L5e
            if (r0 >= r1) goto L5e
            android.view.accessibility.AccessibilityNodeInfo r1 = r4.getChild(r0)     // Catch: java.lang.Exception -> L5e
            if (r1 == 0) goto L4e
            java.lang.String r1 = "android.widget.ListView"
            android.view.accessibility.AccessibilityNodeInfo r2 = r4.getChild(r0)     // Catch: java.lang.Exception -> L5e
            java.lang.CharSequence r2 = r2.getClassName()     // Catch: java.lang.Exception -> L5e
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Exception -> L5e
            if (r1 == 0) goto L4e
            java.lang.String r1 = "acse_HuaweiUtils"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L5e
            r2.<init>()     // Catch: java.lang.Exception -> L5e
            java.lang.String r3 = "android.widget.ListView = "
            r2.append(r3)     // Catch: java.lang.Exception -> L5e
            android.view.accessibility.AccessibilityNodeInfo r3 = r4.getChild(r0)     // Catch: java.lang.Exception -> L5e
            int r3 = r3.getChildCount()     // Catch: java.lang.Exception -> L5e
            r2.append(r3)     // Catch: java.lang.Exception -> L5e
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L5e
            com.acse.ottn.h2.a(r1, r2)     // Catch: java.lang.Exception -> L5e
            android.view.accessibility.AccessibilityNodeInfo r1 = r4.getChild(r0)     // Catch: java.lang.Exception -> L5e
            int r1 = r1.getChildCount()     // Catch: java.lang.Exception -> L5e
            if (r1 <= 0) goto L4e
            android.view.accessibility.AccessibilityNodeInfo r1 = r4.getChild(r0)     // Catch: java.lang.Exception -> L5e
            com.acse.ottn.s1.f2638f = r1     // Catch: java.lang.Exception -> L5e
        L4e:
            android.view.accessibility.AccessibilityNodeInfo r1 = r4.getChild(r0)     // Catch: java.lang.Exception -> L5e
            if (r1 == 0) goto L5b
            android.view.accessibility.AccessibilityNodeInfo r1 = r4.getChild(r0)     // Catch: java.lang.Exception -> L5e
            e(r1)     // Catch: java.lang.Exception -> L5e
        L5b:
            int r0 = r0 + 1
            goto L4
        L5e:
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    public static void f(android.accessibilityservice.AccessibilityService r0) {
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.getRootInActiveWindow()
            i(r0)
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    public static void f(android.accessibilityservice.AccessibilityService r5, boolean r6) {
            java.lang.String r0 = "acse_HuaweiUtils"
            java.lang.String r1 = "recycle 开始"
            com.acse.ottn.h2.a(r0, r1)
            com.acse.ottn.o1 r0 = com.acse.ottn.o1.c()
            java.lang.String r0 = r0.b()
            com.acse.ottn.n0 r1 = com.acse.ottn.n0.a()
            com.acse.ottn.t0 r2 = com.acse.ottn.t0.b()
            r3 = 6000(0x1770, float:8.408E-42)
            int r2 = r2.b(r3)
            com.acse.ottn.t0 r3 = com.acse.ottn.t0.b()
            r4 = 100
            int r3 = r3.b(r4)
            com.acse.ottn.s1$f r4 = new com.acse.ottn.s1$f
            r4.<init>(r5, r0, r6)
            java.util.TimerTask r5 = r1.b(r2, r3, r4)
            com.acse.ottn.s1.f2636d = r5
            return
    }

    @androidx.annotation.RequiresApi(api = 16)
    public static void f(android.view.accessibility.AccessibilityNodeInfo r3) {
            if (r3 == 0) goto L53
            android.view.accessibility.AccessibilityNodeInfo r0 = r3.getParent()
            if (r0 != 0) goto L9
            goto L53
        L9:
            r0 = 0
        La:
            android.view.accessibility.AccessibilityNodeInfo r1 = r3.getParent()
            int r1 = r1.getChildCount()
            if (r0 >= r1) goto L53
            android.view.accessibility.AccessibilityNodeInfo r1 = r3.getParent()
            android.view.accessibility.AccessibilityNodeInfo r1 = r1.getChild(r0)
            if (r1 == 0) goto L50
            android.view.accessibility.AccessibilityNodeInfo r1 = r3.getParent()
            android.view.accessibility.AccessibilityNodeInfo r1 = r1.getChild(r0)
            java.lang.CharSequence r1 = r1.getClassName()
            java.lang.String r2 = "android.widget.Switch"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L50
            android.view.accessibility.AccessibilityNodeInfo r1 = r3.getParent()
            android.view.accessibility.AccessibilityNodeInfo r1 = r1.getChild(r0)
            boolean r1 = r1.isChecked()
            if (r1 == 0) goto L53
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            android.view.accessibility.AccessibilityNodeInfo r3 = r3.getParent()
            android.view.accessibility.AccessibilityNodeInfo r3 = r3.getChild(r0)
            r1.g(r3)
            return
        L50:
            int r0 = r0 + 1
            goto La
        L53:
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    public static void g(android.accessibilityservice.AccessibilityService r3) {
            com.acse.ottn.n0 r0 = com.acse.ottn.n0.a()
            com.acse.ottn.s1$j r1 = new com.acse.ottn.s1$j
            r1.<init>(r3)
            r3 = 8000(0x1f40, float:1.121E-41)
            r2 = 500(0x1f4, float:7.0E-43)
            java.util.TimerTask r3 = r0.b(r3, r2, r1)
            com.acse.ottn.s1.f2640h = r3
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    public static void g(android.view.accessibility.AccessibilityNodeInfo r3) {
            if (r3 == 0) goto L49
            r0 = 0
        L3:
            int r1 = r3.getChildCount()
            if (r0 >= r1) goto L49
            android.view.accessibility.AccessibilityNodeInfo r1 = r3.getChild(r0)
            if (r1 == 0) goto L1c
            android.view.accessibility.AccessibilityNodeInfo r1 = r3.getChild(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "acse_HuaweiUtils"
            com.acse.ottn.h2.a(r2, r1)
        L1c:
            android.view.accessibility.AccessibilityNodeInfo r1 = r3.getChild(r0)
            if (r1 == 0) goto L39
            android.view.accessibility.AccessibilityNodeInfo r1 = r3.getChild(r0)
            java.lang.CharSequence r1 = r1.getClassName()
            java.lang.String r2 = "android.widget.ListView"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L39
            android.view.accessibility.AccessibilityNodeInfo r3 = r3.getChild(r0)
            com.acse.ottn.s1.f2637e = r3
            return
        L39:
            android.view.accessibility.AccessibilityNodeInfo r1 = r3.getChild(r0)
            if (r1 == 0) goto L46
            android.view.accessibility.AccessibilityNodeInfo r1 = r3.getChild(r0)
            g(r1)
        L46:
            int r0 = r0 + 1
            goto L3
        L49:
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    public static android.view.accessibility.AccessibilityNodeInfo h(android.view.accessibility.AccessibilityNodeInfo r3) {
            if (r3 == 0) goto L3e
            r0 = 0
        L3:
            int r1 = r3.getChildCount()
            if (r0 >= r1) goto L3e
            android.view.accessibility.AccessibilityNodeInfo r1 = r3.getChild(r0)
            if (r1 == 0) goto L2e
            android.view.accessibility.AccessibilityNodeInfo r1 = r3.getChild(r0)
            java.lang.CharSequence r1 = r1.getClassName()
            java.lang.String r2 = "android.widget.ListView"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L2e
            android.view.accessibility.AccessibilityNodeInfo r1 = r3.getChild(r0)
            boolean r1 = r1.isScrollable()
            if (r1 == 0) goto L2e
            android.view.accessibility.AccessibilityNodeInfo r3 = r3.getChild(r0)
            return r3
        L2e:
            android.view.accessibility.AccessibilityNodeInfo r1 = r3.getChild(r0)
            if (r1 == 0) goto L3b
            android.view.accessibility.AccessibilityNodeInfo r1 = r3.getChild(r0)
            h(r1)
        L3b:
            int r0 = r0 + 1
            goto L3
        L3e:
            r3 = 0
            return r3
    }

    @androidx.annotation.RequiresApi(api = 16)
    public static void h(android.accessibilityservice.AccessibilityService r5) {
            java.lang.String r0 = "acse_HuaweiUtils"
            java.lang.String r1 = "openHonorFlowWindowPermission"
            com.acse.ottn.h2.a(r0, r1)
            com.acse.ottn.o1 r0 = com.acse.ottn.o1.c()
            java.lang.String r0 = r0.b()
            com.acse.ottn.n0 r1 = com.acse.ottn.n0.a()
            com.acse.ottn.t0 r2 = com.acse.ottn.t0.b()
            r3 = 10000(0x2710, float:1.4013E-41)
            int r2 = r2.b(r3)
            com.acse.ottn.t0 r3 = com.acse.ottn.t0.b()
            r4 = 400(0x190, float:5.6E-43)
            int r3 = r3.b(r4)
            com.acse.ottn.s1$e r4 = new com.acse.ottn.s1$e
            r4.<init>(r5, r0)
            java.util.TimerTask r5 = r1.b(r2, r3, r4)
            com.acse.ottn.s1.f2636d = r5
            return
    }

    public static void i(android.accessibilityservice.AccessibilityService r5) {
            com.acse.ottn.o1 r0 = com.acse.ottn.o1.c()
            java.lang.String r0 = r0.b()
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            r2 = 1000(0x3e8, double:4.94E-321)
            r1.a(r2)
            com.acse.ottn.n0 r1 = com.acse.ottn.n0.a()
            com.acse.ottn.t0 r2 = com.acse.ottn.t0.b()
            r3 = 20000(0x4e20, float:2.8026E-41)
            int r2 = r2.b(r3)
            com.acse.ottn.t0 r3 = com.acse.ottn.t0.b()
            r4 = 500(0x1f4, float:7.0E-43)
            int r3 = r3.b(r4)
            com.acse.ottn.s1$c r4 = new com.acse.ottn.s1$c
            r4.<init>(r5, r0)
            java.util.TimerTask r5 = r1.b(r2, r3, r4)
            com.acse.ottn.s1.f2636d = r5
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    public static void i(android.view.accessibility.AccessibilityNodeInfo r5) {
            if (r5 == 0) goto L87
            int r0 = r5.getChildCount()
            if (r0 != 0) goto L87
            java.lang.CharSequence r0 = r5.getClassName()
            java.lang.String r0 = r0.toString()
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r5.getBoundsInScreen(r1)
            android.content.Context r2 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            int r2 = com.acse.ottn.n4.c(r2)
            java.lang.CharSequence r3 = r5.getText()
            java.lang.String r4 = "acse_HuaweiUtils"
            if (r3 == 0) goto L4c
            java.lang.CharSequence r5 = r5.getText()
            java.lang.String r5 = r5.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r5 = "      info.getBoundsInScreen="
            r0.append(r5)
            java.lang.String r5 = r1.toString()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            com.acse.ottn.h2.a(r4, r5)
            return
        L4c:
            java.lang.CharSequence r5 = r5.getClassName()
            if (r5 == 0) goto La0
            java.lang.String r5 = "--------------------"
            com.acse.ottn.h2.a(r4, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r3 = "width="
            r5.append(r3)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            com.acse.ottn.h2.a(r4, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r0 = "info.getBoundsInScreen="
            r5.append(r0)
            java.lang.String r0 = r1.toString()
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            com.acse.ottn.h2.a(r4, r5)
            return
        L87:
            if (r5 == 0) goto La0
            r0 = 0
        L8a:
            int r1 = r5.getChildCount()
            if (r0 >= r1) goto La0
            android.view.accessibility.AccessibilityNodeInfo r1 = r5.getChild(r0)
            if (r1 == 0) goto L9d
            android.view.accessibility.AccessibilityNodeInfo r1 = r5.getChild(r0)
            i(r1)
        L9d:
            int r0 = r0 + 1
            goto L8a
        La0:
            return
    }

    public static void j(android.accessibilityservice.AccessibilityService r4) {
            r0 = 0
            com.acse.ottn.s1.f2637e = r0
            com.acse.ottn.n0 r0 = com.acse.ottn.n0.a()
            com.acse.ottn.t0 r1 = com.acse.ottn.t0.b()
            r2 = 2000(0x7d0, float:2.803E-42)
            int r1 = r1.b(r2)
            com.acse.ottn.t0 r2 = com.acse.ottn.t0.b()
            r3 = 500(0x1f4, float:7.0E-43)
            int r2 = r2.b(r3)
            com.acse.ottn.s1$b r3 = new com.acse.ottn.s1$b
            r3.<init>(r4)
            java.util.TimerTask r4 = r0.b(r1, r2, r3)
            com.acse.ottn.s1.f2636d = r4
            return
    }

    public static void k(android.accessibilityservice.AccessibilityService r4) {
            r0 = 0
            com.acse.ottn.s1.f2637e = r0
            com.acse.ottn.n0 r0 = com.acse.ottn.n0.a()
            com.acse.ottn.t0 r1 = com.acse.ottn.t0.b()
            r2 = 3000(0xbb8, float:4.204E-42)
            int r1 = r1.b(r2)
            com.acse.ottn.t0 r2 = com.acse.ottn.t0.b()
            r3 = 500(0x1f4, float:7.0E-43)
            int r2 = r2.b(r3)
            com.acse.ottn.s1$k r3 = new com.acse.ottn.s1$k
            r3.<init>(r4)
            java.util.TimerTask r4 = r0.b(r1, r2, r3)
            com.acse.ottn.s1.f2636d = r4
            return
    }
}
