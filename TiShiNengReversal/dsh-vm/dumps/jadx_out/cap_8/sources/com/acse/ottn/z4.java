package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class z4 {
    public static final java.lang.String a = "acse_VivoUtils";

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Long f2918b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f2919c;

    /* renamed from: d, reason: collision with root package name */
    public static java.util.TimerTask f2920d;

    /* renamed from: e, reason: collision with root package name */
    public static android.view.accessibility.AccessibilityNodeInfo f2921e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements com.acse.ottn.n0.d {
        public final /* synthetic */ android.accessibilityservice.AccessibilityService a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f2922b;

        public a(android.accessibilityservice.AccessibilityService r1, java.lang.String r2) {
                r0 = this;
                r0.a = r1
                r0.f2922b = r2
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a() {
                r1 = this;
                r0 = 0
                com.acse.ottn.z4.f2920d = r0
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a(long r2) {
                r1 = this;
                android.accessibilityservice.AccessibilityService r2 = r1.a
                com.acse.ottn.z4.a(r2)
                com.acse.ottn.b r2 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L25
                android.accessibilityservice.AccessibilityService r3 = r1.a     // Catch: java.lang.Exception -> L25
                java.lang.String r0 = r1.f2922b     // Catch: java.lang.Exception -> L25
                android.view.accessibility.AccessibilityNodeInfo r2 = r2.g(r3, r0)     // Catch: java.lang.Exception -> L25
                if (r2 != 0) goto L27
                android.view.accessibility.AccessibilityNodeInfo r2 = com.acse.ottn.z4.a()     // Catch: java.lang.Exception -> L25
                if (r2 == 0) goto L31
                com.acse.ottn.b r2 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L25
                android.view.accessibility.AccessibilityNodeInfo r3 = com.acse.ottn.z4.a()     // Catch: java.lang.Exception -> L25
                r2.b(r3)     // Catch: java.lang.Exception -> L25
                return
            L25:
                r2 = move-exception
                goto L32
            L27:
                java.util.TimerTask r2 = com.acse.ottn.z4.f2920d     // Catch: java.lang.Exception -> L25
                if (r2 == 0) goto L31
                r2.cancel()     // Catch: java.lang.Exception -> L25
                r2 = 0
                com.acse.ottn.z4.f2920d = r2     // Catch: java.lang.Exception -> L25
            L31:
                return
            L32:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r0 = "e ="
                r3.append(r0)
                java.lang.String r2 = r2.getMessage()
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                java.lang.String r3 = "acse_VivoUtils"
                com.acse.ottn.h2.a(r3, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class b implements com.acse.ottn.n0.d {
        public final /* synthetic */ android.accessibilityservice.AccessibilityService a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f2923b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f2924c;

        public b(android.accessibilityservice.AccessibilityService r1, java.lang.String r2, boolean r3) {
                r0 = this;
                r0.a = r1
                r0.f2923b = r2
                r0.f2924c = r3
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a() {
                r1 = this;
                r0 = 0
                com.acse.ottn.z4.f2920d = r0
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a(long r9) {
                r8 = this;
                java.lang.String r9 = "acse_VivoUtils"
                android.accessibilityservice.AccessibilityService r10 = r8.a
                com.acse.ottn.z4.a(r10)
                com.acse.ottn.b r10 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L5b
                android.accessibilityservice.AccessibilityService r0 = r8.a     // Catch: java.lang.Exception -> L5b
                java.lang.String r1 = r8.f2923b     // Catch: java.lang.Exception -> L5b
                android.view.accessibility.AccessibilityNodeInfo r10 = r10.g(r0, r1)     // Catch: java.lang.Exception -> L5b
                if (r10 != 0) goto L5f
                android.view.accessibility.AccessibilityNodeInfo r10 = com.acse.ottn.z4.a()     // Catch: java.lang.Exception -> L5b
                if (r10 == 0) goto Ld9
                int r10 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L5b
                r0 = 24
                if (r10 < r0) goto Ld9
                com.acse.ottn.b r1 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L5b
                android.accessibilityservice.AccessibilityService r2 = r8.a     // Catch: java.lang.Exception -> L5b
                android.content.Context r10 = com.acse.ottn.util.HelpShopAppUtil.getContext()     // Catch: java.lang.Exception -> L5b
                int r10 = com.acse.ottn.n4.c(r10)     // Catch: java.lang.Exception -> L5b
                int r3 = r10 / 3
                android.content.Context r10 = com.acse.ottn.util.HelpShopAppUtil.getContext()     // Catch: java.lang.Exception -> L5b
                int r10 = com.acse.ottn.n4.b(r10)     // Catch: java.lang.Exception -> L5b
                int r10 = r10 * 2
                int r10 = r10 / 3
                int r4 = r10 + 300
                android.content.Context r10 = com.acse.ottn.util.HelpShopAppUtil.getContext()     // Catch: java.lang.Exception -> L5b
                int r10 = com.acse.ottn.n4.c(r10)     // Catch: java.lang.Exception -> L5b
                int r10 = r10 / 3
                int r5 = r10 + 100
                android.content.Context r10 = com.acse.ottn.util.HelpShopAppUtil.getContext()     // Catch: java.lang.Exception -> L5b
                int r10 = com.acse.ottn.n4.b(r10)     // Catch: java.lang.Exception -> L5b
                int r6 = r10 / 3
                r7 = 500(0x1f4, float:7.0E-43)
                r1.a(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L5b
                return
            L5b:
                r0 = move-exception
                r10 = r0
                goto Lda
            L5f:
                java.util.TimerTask r0 = com.acse.ottn.z4.f2920d     // Catch: java.lang.Exception -> L5b
                if (r0 == 0) goto L69
                r0.cancel()     // Catch: java.lang.Exception -> L5b
                r0 = 0
                com.acse.ottn.z4.f2920d = r0     // Catch: java.lang.Exception -> L5b
            L69:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L5b
                r0.<init>()     // Catch: java.lang.Exception -> L5b
                java.lang.String r1 = "找到了 ="
                r0.append(r1)     // Catch: java.lang.Exception -> L5b
                java.lang.String r1 = r8.f2923b     // Catch: java.lang.Exception -> L5b
                r0.append(r1)     // Catch: java.lang.Exception -> L5b
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L5b
                com.acse.ottn.h2.a(r9, r0)     // Catch: java.lang.Exception -> L5b
                android.view.accessibility.AccessibilityNodeInfo r10 = r10.getParent()     // Catch: java.lang.Exception -> L5b
                if (r10 == 0) goto Ld9
                com.acse.ottn.b r10 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L5b
                com.acse.ottn.t0 r0 = com.acse.ottn.t0.b()     // Catch: java.lang.Exception -> L5b
                r1 = 2000(0x7d0, float:2.803E-42)
                int r0 = r0.b(r1)     // Catch: java.lang.Exception -> L5b
                long r0 = (long) r0     // Catch: java.lang.Exception -> L5b
                r10.a(r0)     // Catch: java.lang.Exception -> L5b
                com.acse.ottn.b r10 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L5b
                android.accessibilityservice.AccessibilityService r0 = r8.a     // Catch: java.lang.Exception -> L5b
                java.lang.String r1 = r8.f2923b     // Catch: java.lang.Exception -> L5b
                android.view.accessibility.AccessibilityNodeInfo r10 = r10.g(r0, r1)     // Catch: java.lang.Exception -> L5b
                android.accessibilityservice.AccessibilityService r0 = r8.a     // Catch: java.lang.Exception -> L5b
                android.view.accessibility.AccessibilityNodeInfo r10 = r10.getParent()     // Catch: java.lang.Exception -> L5b
                android.view.accessibility.AccessibilityNodeInfo r10 = r10.getParent()     // Catch: java.lang.Exception -> L5b
                r1 = 0
                com.acse.ottn.z4.a(r0, r10, r1)     // Catch: java.lang.Exception -> L5b
                boolean r10 = r8.f2924c     // Catch: java.lang.Exception -> L5b
                if (r10 == 0) goto Lbe
                java.lang.String r10 = "电池"
                com.acse.ottn.h2.a(r9, r10)     // Catch: java.lang.Exception -> L5b
                r10 = 1
                com.acse.ottn.l0.b(r10)     // Catch: java.lang.Exception -> L5b
            Lbe:
                com.acse.ottn.b r10 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L5b
                com.acse.ottn.t0 r0 = com.acse.ottn.t0.b()     // Catch: java.lang.Exception -> L5b
                r1 = 500(0x1f4, float:7.0E-43)
                int r0 = r0.b(r1)     // Catch: java.lang.Exception -> L5b
                long r0 = (long) r0     // Catch: java.lang.Exception -> L5b
                r10.a(r0)     // Catch: java.lang.Exception -> L5b
                com.acse.ottn.b r10 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L5b
                android.accessibilityservice.AccessibilityService r0 = r8.a     // Catch: java.lang.Exception -> L5b
                r10.e(r0)     // Catch: java.lang.Exception -> L5b
            Ld9:
                return
            Lda:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "clickSoftList e ="
                r0.append(r1)
                java.lang.String r10 = r10.getMessage()
                r0.append(r10)
                java.lang.String r10 = r0.toString()
                com.acse.ottn.h2.a(r9, r10)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class c implements java.lang.Runnable {
        public final /* synthetic */ android.accessibilityservice.AccessibilityService a;

        public c(android.accessibilityservice.AccessibilityService r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                long r0 = java.lang.System.currentTimeMillis()
                android.accessibilityservice.AccessibilityService r2 = r3.a
                com.acse.ottn.z4.a(r2, r0)
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
                r3 = this;
                long r0 = java.lang.System.currentTimeMillis()
                android.accessibilityservice.AccessibilityService r2 = r3.a
                com.acse.ottn.z4.a(r2, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class e implements com.acse.ottn.n0.d {
        public final /* synthetic */ android.accessibilityservice.AccessibilityService a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f2925b;

        public e(android.accessibilityservice.AccessibilityService r1, java.lang.String r2) {
                r0 = this;
                r0.a = r1
                r0.f2925b = r2
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a() {
                r1 = this;
                r0 = 0
                com.acse.ottn.z4.f2920d = r0
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a(long r6) {
                r5 = this;
                java.lang.String r6 = "acse_VivoUtils"
                android.accessibilityservice.AccessibilityService r7 = r5.a
                com.acse.ottn.z4.a(r7)
                com.acse.ottn.b r7 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L27
                android.accessibilityservice.AccessibilityService r0 = r5.a     // Catch: java.lang.Exception -> L27
                java.lang.String r1 = r5.f2925b     // Catch: java.lang.Exception -> L27
                android.view.accessibility.AccessibilityNodeInfo r7 = r7.g(r0, r1)     // Catch: java.lang.Exception -> L27
                if (r7 != 0) goto L2b
                android.view.accessibility.AccessibilityNodeInfo r7 = com.acse.ottn.z4.a()     // Catch: java.lang.Exception -> L27
                if (r7 == 0) goto L2a
                com.acse.ottn.b r7 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L27
                android.view.accessibility.AccessibilityNodeInfo r0 = com.acse.ottn.z4.a()     // Catch: java.lang.Exception -> L27
                r7.b(r0)     // Catch: java.lang.Exception -> L27
                return
            L27:
                r7 = move-exception
                goto L15e
            L2a:
                return
            L2b:
                java.util.TimerTask r0 = com.acse.ottn.z4.f2920d     // Catch: java.lang.Exception -> L27
                if (r0 == 0) goto L35
                r0.cancel()     // Catch: java.lang.Exception -> L27
                r0 = 0
                com.acse.ottn.z4.f2920d = r0     // Catch: java.lang.Exception -> L27
            L35:
                java.lang.String r0 = "buttery find"
                com.acse.ottn.h2.a(r6, r0)     // Catch: java.lang.Exception -> L27
                com.acse.ottn.b r0 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L27
                r0.g(r7)     // Catch: java.lang.Exception -> L27
                com.acse.ottn.b r0 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L27
                com.acse.ottn.t0 r1 = com.acse.ottn.t0.b()     // Catch: java.lang.Exception -> L27
                r2 = 200(0xc8, float:2.8E-43)
                int r1 = r1.b(r2)     // Catch: java.lang.Exception -> L27
                long r1 = (long) r1     // Catch: java.lang.Exception -> L27
                r0.a(r1)     // Catch: java.lang.Exception -> L27
                com.acse.ottn.b r0 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L27
                android.accessibilityservice.AccessibilityService r1 = r5.a     // Catch: java.lang.Exception -> L27
                java.lang.String r2 = "允许后台高耗电"
                android.view.accessibility.AccessibilityNodeInfo r0 = r0.g(r1, r2)     // Catch: java.lang.Exception -> L27
                com.acse.ottn.b r1 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L27
                android.accessibilityservice.AccessibilityService r2 = r5.a     // Catch: java.lang.Exception -> L27
                java.lang.String r3 = "允许后台耗电"
                android.view.accessibility.AccessibilityNodeInfo r1 = r1.g(r2, r3)     // Catch: java.lang.Exception -> L27
                r2 = 1
                if (r0 == 0) goto L7f
                java.lang.String r7 = "buttery info is not null"
                com.acse.ottn.h2.a(r6, r7)     // Catch: java.lang.Exception -> L27
                com.acse.ottn.b r7 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L27
                r7.g(r0)     // Catch: java.lang.Exception -> L27
                com.acse.ottn.l0.c(r2)     // Catch: java.lang.Exception -> L27
                goto L10b
            L7f:
                if (r1 == 0) goto L8d
                com.acse.ottn.b r7 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L27
                r7.g(r1)     // Catch: java.lang.Exception -> L27
                com.acse.ottn.l0.c(r2)     // Catch: java.lang.Exception -> L27
                goto L10b
            L8d:
                java.lang.String r0 = "buttery info is null"
                com.acse.ottn.h2.a(r6, r0)     // Catch: java.lang.Exception -> L27
                android.view.accessibility.AccessibilityNodeInfo r0 = r7.getParent()     // Catch: java.lang.Exception -> L27
                if (r0 == 0) goto L10b
                java.lang.String r0 = "buttery start"
                com.acse.ottn.h2.a(r6, r0)     // Catch: java.lang.Exception -> L27
                r0 = 0
            L9e:
                android.view.accessibility.AccessibilityNodeInfo r1 = r7.getParent()     // Catch: java.lang.Exception -> L27
                int r1 = r1.getChildCount()     // Catch: java.lang.Exception -> L27
                if (r0 >= r1) goto L10b
                android.view.accessibility.AccessibilityNodeInfo r1 = r7.getParent()     // Catch: java.lang.Exception -> L27
                android.view.accessibility.AccessibilityNodeInfo r1 = r1.getChild(r0)     // Catch: java.lang.Exception -> L27
                if (r1 == 0) goto L108
                java.lang.String r1 = "android.widget.Switch"
                android.view.accessibility.AccessibilityNodeInfo r2 = r7.getParent()     // Catch: java.lang.Exception -> L27
                android.view.accessibility.AccessibilityNodeInfo r2 = r2.getChild(r0)     // Catch: java.lang.Exception -> L27
                java.lang.CharSequence r2 = r2.getClassName()     // Catch: java.lang.Exception -> L27
                boolean r1 = r1.equals(r2)     // Catch: java.lang.Exception -> L27
                if (r1 == 0) goto L108
                java.lang.String r1 = "find buttery Switch"
                com.acse.ottn.h2.a(r6, r1)     // Catch: java.lang.Exception -> L27
                android.view.accessibility.AccessibilityNodeInfo r1 = r7.getParent()     // Catch: java.lang.Exception -> L27
                android.view.accessibility.AccessibilityNodeInfo r1 = r1.getChild(r0)     // Catch: java.lang.Exception -> L27
                boolean r1 = r1.isChecked()     // Catch: java.lang.Exception -> L27
                if (r1 != 0) goto L108
                android.graphics.Rect r1 = new android.graphics.Rect     // Catch: java.lang.Exception -> L27
                r1.<init>()     // Catch: java.lang.Exception -> L27
                android.view.accessibility.AccessibilityNodeInfo r2 = r7.getParent()     // Catch: java.lang.Exception -> L27
                android.view.accessibility.AccessibilityNodeInfo r2 = r2.getChild(r0)     // Catch: java.lang.Exception -> L27
                r2.getBoundsInScreen(r1)     // Catch: java.lang.Exception -> L27
                int r2 = r1.right     // Catch: java.lang.Exception -> L27
                int r3 = r1.left     // Catch: java.lang.Exception -> L27
                int r2 = r2 - r3
                int r2 = r2 / 2
                int r2 = r2 + r3
                int r3 = r1.bottom     // Catch: java.lang.Exception -> L27
                int r1 = r1.top     // Catch: java.lang.Exception -> L27
                int r3 = r3 - r1
                int r3 = r3 / 2
                int r3 = r3 + r1
                int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L27
                r4 = 24
                if (r1 < r4) goto L108
                com.acse.ottn.b r1 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L27
                android.accessibilityservice.AccessibilityService r4 = r5.a     // Catch: java.lang.Exception -> L27
                r1.a(r4, r2, r3)     // Catch: java.lang.Exception -> L27
            L108:
                int r0 = r0 + 1
                goto L9e
            L10b:
                java.lang.String r7 = "backgroundHightBattery comeBack"
                com.acse.ottn.h2.a(r6, r7)     // Catch: java.lang.Exception -> L27
                com.acse.ottn.b r7 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L27
                com.acse.ottn.t0 r0 = com.acse.ottn.t0.b()     // Catch: java.lang.Exception -> L27
                r1 = 100
                int r0 = r0.b(r1)     // Catch: java.lang.Exception -> L27
                long r2 = (long) r0     // Catch: java.lang.Exception -> L27
                r7.a(r2)     // Catch: java.lang.Exception -> L27
                com.acse.ottn.b r7 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L27
                android.accessibilityservice.AccessibilityService r0 = r5.a     // Catch: java.lang.Exception -> L27
                r7.e(r0)     // Catch: java.lang.Exception -> L27
                com.acse.ottn.b r7 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L27
                com.acse.ottn.t0 r0 = com.acse.ottn.t0.b()     // Catch: java.lang.Exception -> L27
                int r0 = r0.b(r1)     // Catch: java.lang.Exception -> L27
                long r2 = (long) r0     // Catch: java.lang.Exception -> L27
                r7.a(r2)     // Catch: java.lang.Exception -> L27
                com.acse.ottn.b r7 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L27
                android.accessibilityservice.AccessibilityService r0 = r5.a     // Catch: java.lang.Exception -> L27
                r7.e(r0)     // Catch: java.lang.Exception -> L27
                com.acse.ottn.b r7 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L27
                com.acse.ottn.t0 r0 = com.acse.ottn.t0.b()     // Catch: java.lang.Exception -> L27
                int r0 = r0.b(r1)     // Catch: java.lang.Exception -> L27
                long r0 = (long) r0     // Catch: java.lang.Exception -> L27
                r7.a(r0)     // Catch: java.lang.Exception -> L27
                com.acse.ottn.b r7 = com.acse.ottn.b.c()     // Catch: java.lang.Exception -> L27
                android.accessibilityservice.AccessibilityService r0 = r5.a     // Catch: java.lang.Exception -> L27
                r7.e(r0)     // Catch: java.lang.Exception -> L27
                return
            L15e:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "backgroundHightBattery e ="
                r0.append(r1)
                java.lang.String r7 = r7.getMessage()
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                com.acse.ottn.h2.a(r6, r7)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class f implements java.lang.Runnable {
        public final /* synthetic */ java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ android.accessibilityservice.AccessibilityService f2926b;

        public f(java.lang.String r1, android.accessibilityservice.AccessibilityService r2) {
                r0 = this;
                r0.a = r1
                r0.f2926b = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                java.lang.String r0 = r4.a
                java.lang.String r1 = "2"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L19
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 23
                if (r0 < r1) goto L19
                android.accessibilityservice.AccessibilityService r0 = r4.f2926b
                boolean r0 = l.q.a(r0)
                if (r0 != 0) goto L19
                return
            L19:
                com.acse.ottn.b r0 = com.acse.ottn.b.c()
                android.accessibilityservice.AccessibilityService r1 = r4.f2926b
                java.lang.String r2 = "自启动"
                android.view.accessibility.AccessibilityNodeInfo r0 = r0.g(r1, r2)
                java.lang.String r1 = "acse_VivoUtils"
                if (r0 == 0) goto L53
                android.view.accessibility.AccessibilityNodeInfo r2 = r0.getParent()
                if (r2 == 0) goto L53
                java.lang.String r2 = "find auto start"
                com.acse.ottn.h2.a(r1, r2)
                android.accessibilityservice.AccessibilityService r1 = r4.f2926b
                android.view.accessibility.AccessibilityNodeInfo r2 = r0.getParent()
                r3 = 1
                boolean r1 = com.acse.ottn.z4.b(r1, r2, r3)
                if (r1 != 0) goto L4f
                android.accessibilityservice.AccessibilityService r1 = r4.f2926b
                android.view.accessibility.AccessibilityNodeInfo r0 = r0.getParent()
                android.view.accessibility.AccessibilityNodeInfo r0 = r0.getParent()
                r2 = 0
                com.acse.ottn.z4.b(r1, r0, r2)
            L4f:
                com.acse.ottn.l0.b(r3)
                return
            L53:
                java.lang.String r0 = "not find auto start"
                com.acse.ottn.h2.a(r1, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class g implements java.lang.Runnable {
        public final /* synthetic */ android.accessibilityservice.AccessibilityService a;

        public g(android.accessibilityservice.AccessibilityService r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                com.acse.ottn.b r0 = com.acse.ottn.b.c()
                android.accessibilityservice.AccessibilityService r1 = r4.a
                java.lang.String r2 = "后台弹出界面"
                android.view.accessibility.AccessibilityNodeInfo r0 = r0.g(r1, r2)
                if (r0 == 0) goto L34
                android.view.accessibility.AccessibilityNodeInfo r1 = r0.getParent()
                if (r1 == 0) goto L34
                java.lang.String r1 = "acse_VivoUtils"
                com.acse.ottn.h2.a(r1, r2)
                android.accessibilityservice.AccessibilityService r1 = r4.a
                android.view.accessibility.AccessibilityNodeInfo r2 = r0.getParent()
                r3 = 1
                boolean r1 = com.acse.ottn.z4.b(r1, r2, r3)
                if (r1 != 0) goto L34
                android.accessibilityservice.AccessibilityService r1 = r4.a
                android.view.accessibility.AccessibilityNodeInfo r0 = r0.getParent()
                android.view.accessibility.AccessibilityNodeInfo r0 = r0.getParent()
                r2 = 0
                com.acse.ottn.z4.b(r1, r0, r2)
            L34:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class h implements java.lang.Runnable {
        public final /* synthetic */ android.accessibilityservice.AccessibilityService a;

        public h(android.accessibilityservice.AccessibilityService r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                com.acse.ottn.b r0 = com.acse.ottn.b.c()
                android.accessibilityservice.AccessibilityService r1 = r4.a
                java.lang.String r2 = "悬浮窗"
                android.view.accessibility.AccessibilityNodeInfo r0 = r0.g(r1, r2)
                if (r0 == 0) goto L34
                android.view.accessibility.AccessibilityNodeInfo r1 = r0.getParent()
                if (r1 == 0) goto L34
                java.lang.String r1 = "acse_VivoUtils"
                com.acse.ottn.h2.a(r1, r2)
                android.accessibilityservice.AccessibilityService r1 = r4.a
                android.view.accessibility.AccessibilityNodeInfo r2 = r0.getParent()
                r3 = 1
                boolean r1 = com.acse.ottn.z4.b(r1, r2, r3)
                if (r1 != 0) goto L34
                android.accessibilityservice.AccessibilityService r1 = r4.a
                android.view.accessibility.AccessibilityNodeInfo r0 = r0.getParent()
                android.view.accessibility.AccessibilityNodeInfo r0 = r0.getParent()
                r2 = 0
                com.acse.ottn.z4.b(r1, r0, r2)
            L34:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class i implements java.lang.Runnable {
        public final /* synthetic */ java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ android.accessibilityservice.AccessibilityService f2927b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public class a implements java.lang.Runnable {
            public final /* synthetic */ com.acse.ottn.z4.i a;

            public a(com.acse.ottn.z4.i r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    java.lang.String r0 = com.acse.ottn.z4.f2919c
                    java.lang.String r1 = "0"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L11
                    com.acse.ottn.z4$i r0 = r2.a
                    android.accessibilityservice.AccessibilityService r0 = r0.f2927b
                    com.acse.ottn.z4.h(r0)
                L11:
                    return
            }
        }

        public i(java.lang.String r1, android.accessibilityservice.AccessibilityService r2) {
                r0 = this;
                r0.a = r1
                r0.f2927b = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r5 = this;
                com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
                java.lang.String r1 = "correlation_start"
                boolean r0 = r0.a(r1)
                if (r0 == 0) goto L1c
                java.lang.String r0 = r5.a
                java.lang.String r1 = "2"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L1c
                android.accessibilityservice.AccessibilityService r0 = r5.f2927b
                com.acse.ottn.z4.h(r0)
                return
            L1c:
                com.acse.ottn.b r0 = com.acse.ottn.b.c()
                android.accessibilityservice.AccessibilityService r1 = r5.f2927b
                java.lang.String r2 = "关联启动"
                android.view.accessibility.AccessibilityNodeInfo r0 = r0.g(r1, r2)
                if (r0 == 0) goto L71
                android.view.accessibility.AccessibilityNodeInfo r1 = r0.getParent()
                if (r1 == 0) goto L71
                java.lang.String r1 = "acse_VivoUtils"
                com.acse.ottn.h2.a(r1, r2)
                r1 = 1
                com.acse.ottn.l0.b(r1)
                com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
                java.lang.Boolean r3 = java.lang.Boolean.TRUE
                java.lang.String r4 = "allow_button"
                r2.a(r4, r3)
                android.accessibilityservice.AccessibilityService r2 = r5.f2927b
                android.view.accessibility.AccessibilityNodeInfo r3 = r0.getParent()
                boolean r1 = com.acse.ottn.z4.b(r2, r3, r1)
                if (r1 != 0) goto L5e
                android.accessibilityservice.AccessibilityService r1 = r5.f2927b
                android.view.accessibility.AccessibilityNodeInfo r0 = r0.getParent()
                android.view.accessibility.AccessibilityNodeInfo r0 = r0.getParent()
                r2 = 0
                com.acse.ottn.z4.b(r1, r0, r2)
            L5e:
                android.os.Handler r0 = new android.os.Handler
                android.os.Looper r1 = android.os.Looper.getMainLooper()
                r0.<init>(r1)
                com.acse.ottn.z4$i$a r1 = new com.acse.ottn.z4$i$a
                r1.<init>(r5)
                r2 = 1000(0x3e8, double:4.94E-321)
                r0.postDelayed(r1, r2)
            L71:
                return
        }
    }

    static {
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            com.acse.ottn.z4.f2918b = r0
            java.lang.String r0 = "0"
            com.acse.ottn.z4.f2919c = r0
            r0 = 0
            com.acse.ottn.z4.f2921e = r0
            return
    }

    public z4() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ android.view.accessibility.AccessibilityNodeInfo a() {
            android.view.accessibility.AccessibilityNodeInfo r0 = com.acse.ottn.z4.f2921e
            return r0
    }

    public static /* synthetic */ void a(android.accessibilityservice.AccessibilityService r0) {
            f(r0)
            return
    }

    @androidx.annotation.RequiresApi(api = 16)
    public static void a(android.accessibilityservice.AccessibilityService r8, long r9) {
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.String r2 = "battery_white"
            r0.a(r2, r1)
            java.lang.Long r0 = com.acse.ottn.z4.f2918b
            long r0 = r0.longValue()
            long r0 = r9 - r0
            r2 = 5000(0x1388, double:2.4703E-320)
            java.lang.String r4 = "   System.currentTimeMillis()-time ="
            java.lang.String r5 = "   System.currentTimeMillis() ="
            java.lang.String r6 = "acse_VivoUtils"
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 >= 0) goto L65
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "间隔 t="
            r8.append(r0)
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
            java.lang.Long r9 = com.acse.ottn.z4.f2918b
            r8.append(r9)
            r8.append(r4)
            long r9 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = com.acse.ottn.z4.f2918b
            long r0 = r0.longValue()
            long r9 = r9 - r0
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.acse.ottn.h2.a(r6, r8)
            return
        L65:
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
            java.lang.Long r1 = com.acse.ottn.z4.f2918b
            r0.append(r1)
            r0.append(r4)
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Long r3 = com.acse.ottn.z4.f2918b
            long r3 = r3.longValue()
            long r1 = r1 - r3
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.acse.ottn.h2.a(r6, r0)
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            com.acse.ottn.z4.f2918b = r9
            java.lang.String r9 = "buttery backgroundHightBattery"
            com.acse.ottn.h2.a(r6, r9)
            com.acse.ottn.o1 r9 = com.acse.ottn.o1.c()
            java.lang.String r9 = r9.b()
            com.acse.ottn.n0 r10 = com.acse.ottn.n0.a()
            com.acse.ottn.t0 r0 = com.acse.ottn.t0.b()
            r1 = 5000(0x1388, float:7.006E-42)
            int r0 = r0.b(r1)
            com.acse.ottn.t0 r1 = com.acse.ottn.t0.b()
            r2 = 150(0x96, float:2.1E-43)
            int r1 = r1.b(r2)
            com.acse.ottn.z4$e r2 = new com.acse.ottn.z4$e
            r2.<init>(r8, r9)
            java.util.TimerTask r8 = r10.b(r0, r1, r2)
            com.acse.ottn.z4.f2920d = r8
            return
    }

    @androidx.annotation.RequiresApi(api = 16)
    public static void a(android.accessibilityservice.AccessibilityService r5, boolean r6) {
            com.acse.ottn.o1 r0 = com.acse.ottn.o1.c()
            java.lang.String r0 = r0.b()
            com.acse.ottn.n0 r1 = com.acse.ottn.n0.a()
            com.acse.ottn.t0 r2 = com.acse.ottn.t0.b()
            r3 = 15000(0x3a98, float:2.102E-41)
            int r2 = r2.b(r3)
            com.acse.ottn.t0 r3 = com.acse.ottn.t0.b()
            r4 = 500(0x1f4, float:7.0E-43)
            int r3 = r3.b(r4)
            com.acse.ottn.z4$b r4 = new com.acse.ottn.z4$b
            r4.<init>(r5, r0, r6)
            java.util.TimerTask r5 = r1.b(r2, r3, r4)
            com.acse.ottn.z4.f2920d = r5
            return
    }

    public static void a(android.app.Activity r4) {
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()     // Catch: java.lang.Exception -> L28
            if (r0 == 0) goto L11
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()     // Catch: java.lang.Exception -> L28
            java.lang.String r1 = "battery_white"
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L28
            r0.a(r1, r2)     // Catch: java.lang.Exception -> L28
        L11:
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Exception -> L28
            r0.<init>()     // Catch: java.lang.Exception -> L28
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch: java.lang.Exception -> L28
            java.lang.String r2 = "com.iqoo.powersaving"
            java.lang.String r3 = "com.iqoo.powersaving.PowerSavingManagerActivity"
            r1.<init>(r2, r3)     // Catch: java.lang.Exception -> L28
            r0.setComponent(r1)     // Catch: java.lang.Exception -> L28
            r1 = 10014(0x271e, float:1.4033E-41)
            r4.startActivityForResult(r0, r1)     // Catch: java.lang.Exception -> L28
            return
        L28:
            r4 = move-exception
            java.lang.String r4 = r4.getMessage()
            java.lang.String r0 = "acse_VivoUtils"
            com.acse.ottn.h2.a(r0, r4)
            r4 = 1
            com.acse.ottn.l0.c(r4)
            com.acse.ottn.n3 r4 = com.acse.ottn.n3.a()
            java.lang.String r0 = "battery_hignt_size"
            java.lang.String r1 = "2"
            r4.b(r0, r1)
            return
    }

    public static void a(android.app.Activity r4, int r5) {
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Exception -> L19
            r0.<init>()     // Catch: java.lang.Exception -> L19
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r0.setFlags(r1)     // Catch: java.lang.Exception -> L19
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch: java.lang.Exception -> L19
            java.lang.String r2 = "com.coloros.safecenter"
            java.lang.String r3 = "com.coloros.safecenter.sysfloatwindow.FloatWindowListActivity"
            r1.<init>(r2, r3)     // Catch: java.lang.Exception -> L19
            r0.setComponent(r1)     // Catch: java.lang.Exception -> L19
            r4.startActivityForResult(r0, r5)     // Catch: java.lang.Exception -> L19
        L19:
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    public static void a(android.view.accessibility.AccessibilityNodeInfo r3) {
            if (r3 == 0) goto L46
            r0 = 0
        L3:
            int r1 = r3.getChildCount()
            if (r0 >= r1) goto L46
            android.view.accessibility.AccessibilityNodeInfo r1 = r3.getChild(r0)
            if (r1 == 0) goto L36
            android.view.accessibility.AccessibilityNodeInfo r1 = r3.getChild(r0)
            java.lang.CharSequence r1 = r1.getClassName()
            java.lang.String r2 = "android.widget.ListView"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L2f
            android.view.accessibility.AccessibilityNodeInfo r1 = r3.getChild(r0)
            java.lang.CharSequence r1 = r1.getClassName()
            java.lang.String r2 = "androidx.recyclerview.widget.RecyclerView"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L36
        L2f:
            android.view.accessibility.AccessibilityNodeInfo r3 = r3.getChild(r0)
            com.acse.ottn.z4.f2921e = r3
            return
        L36:
            android.view.accessibility.AccessibilityNodeInfo r1 = r3.getChild(r0)
            if (r1 == 0) goto L43
            android.view.accessibility.AccessibilityNodeInfo r1 = r3.getChild(r0)
            a(r1)
        L43:
            int r0 = r0 + 1
            goto L3
        L46:
            return
    }

    public static /* synthetic */ boolean a(android.accessibilityservice.AccessibilityService r0, android.view.accessibility.AccessibilityNodeInfo r1, boolean r2) {
            boolean r0 = d(r0, r1, r2)
            return r0
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
            java.lang.String r9 = "acse_VivoUtils"
            com.acse.ottn.h2.b(r9, r8)
            return r1
    }

    public static void b() {
            java.util.TimerTask r0 = com.acse.ottn.z4.f2920d
            if (r0 == 0) goto La
            r0.cancel()
            r0 = 0
            com.acse.ottn.z4.f2920d = r0
        La:
            return
    }

    public static void b(android.accessibilityservice.AccessibilityService r10) {
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r1 = "auto_start"
            java.lang.String r0 = r0.e(r1)
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            java.lang.String r2 = "relevancy_start"
            java.lang.String r1 = r1.e(r2)
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            java.lang.String r3 = "service_show_view"
            java.lang.String r2 = r2.e(r3)
            r3 = 200(0xc8, double:9.9E-322)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            com.acse.ottn.z4.f2918b = r3
            java.lang.String r3 = "1"
            boolean r4 = r0.equals(r3)
            r5 = 350(0x15e, double:1.73E-321)
            if (r4 != 0) goto L54
            android.os.Handler r4 = new android.os.Handler
            android.os.Looper r7 = android.os.Looper.getMainLooper()
            r4.<init>(r7)
            com.acse.ottn.z4$f r7 = new com.acse.ottn.z4$f
            r7.<init>(r0, r10)
            java.lang.Long r0 = com.acse.ottn.z4.f2918b
            long r8 = r0.longValue()
            r4.postDelayed(r7, r8)
            java.lang.Long r0 = com.acse.ottn.z4.f2918b
            long r7 = r0.longValue()
            long r7 = r7 + r5
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            com.acse.ottn.z4.f2918b = r0
        L54:
            boolean r0 = r2.equals(r3)
            if (r0 != 0) goto L7e
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r0.<init>(r2)
            com.acse.ottn.z4$g r2 = new com.acse.ottn.z4$g
            r2.<init>(r10)
            java.lang.Long r4 = com.acse.ottn.z4.f2918b
            long r7 = r4.longValue()
            r0.postDelayed(r2, r7)
            java.lang.Long r0 = com.acse.ottn.z4.f2918b
            long r7 = r0.longValue()
            long r7 = r7 + r5
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            com.acse.ottn.z4.f2918b = r0
        L7e:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r0 < r2) goto Lae
            boolean r0 = l.q.a(r10)
            if (r0 != 0) goto Lae
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r0.<init>(r2)
            com.acse.ottn.z4$h r2 = new com.acse.ottn.z4$h
            r2.<init>(r10)
            java.lang.Long r4 = com.acse.ottn.z4.f2918b
            long r7 = r4.longValue()
            r0.postDelayed(r2, r7)
            java.lang.Long r0 = com.acse.ottn.z4.f2918b
            long r7 = r0.longValue()
            long r7 = r7 + r5
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            com.acse.ottn.z4.f2918b = r0
        Lae:
            boolean r0 = r1.equals(r3)
            if (r0 != 0) goto Ld4
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r0.<init>(r2)
            com.acse.ottn.z4$i r2 = new com.acse.ottn.z4$i
            r2.<init>(r1, r10)
            java.lang.Long r10 = com.acse.ottn.z4.f2918b
            long r3 = r10.longValue()
            r0.postDelayed(r2, r3)
            r0 = 0
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
            com.acse.ottn.z4.f2918b = r10
            return
        Ld4:
            h(r10)
            return
    }

    public static void b(android.app.Activity r9) {
            java.lang.String r0 = "2"
            java.lang.String r1 = "flow_window_state"
            java.lang.String r2 = "1"
            com.acse.ottn.n3 r3 = com.acse.ottn.n3.a()
            if (r3 == 0) goto L17
            com.acse.ottn.n3 r3 = com.acse.ottn.n3.a()
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            java.lang.String r5 = "battery_white"
            r3.a(r5, r4)
        L17:
            java.lang.String r3 = com.acse.ottn.l0.w
            java.lang.String r4 = ""
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L22
            return
        L22:
            r3 = 10013(0x271d, float:1.4031E-41)
            com.acse.ottn.n3 r4 = com.acse.ottn.n3.a()     // Catch: java.lang.Exception -> L7b
            java.lang.String r4 = r4.a(r1, r2)     // Catch: java.lang.Exception -> L7b
            java.lang.String r5 = com.acse.ottn.n4.b()     // Catch: java.lang.Exception -> L7b
            java.lang.String r6 = "vivo"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Exception -> L7b
            java.lang.String r6 = "tabId"
            java.lang.String r7 = "packagename"
            java.lang.String r8 = "com.vivo.permissionmanager"
            if (r5 == 0) goto L65
            boolean r4 = r4.equals(r0)     // Catch: java.lang.Exception -> L7b
            if (r4 != 0) goto L65
            java.lang.String r4 = "0"
            com.acse.ottn.z4.f2919c = r4     // Catch: java.lang.Exception -> L7b
            com.acse.ottn.n3 r4 = com.acse.ottn.n3.a()     // Catch: java.lang.Exception -> L7b
            r4.b(r1, r0)     // Catch: java.lang.Exception -> L7b
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Exception -> L7b
            r0.<init>()     // Catch: java.lang.Exception -> L7b
            java.lang.String r1 = "com.vivo.permissionmanager.activity.SoftPermissionDetailActivity"
            r0.setClassName(r8, r1)     // Catch: java.lang.Exception -> L7b
            java.lang.String r1 = com.acse.ottn.l0.w     // Catch: java.lang.Exception -> L7b
            r0.putExtra(r7, r1)     // Catch: java.lang.Exception -> L7b
            r0.putExtra(r6, r2)     // Catch: java.lang.Exception -> L7b
            r9.startActivityForResult(r0, r3)     // Catch: java.lang.Exception -> L7b
            return
        L65:
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Exception -> L7b
            r0.<init>()     // Catch: java.lang.Exception -> L7b
            java.lang.String r1 = "com.vivo.permissionmanager.activity.BgStartUpManagerActivity"
            r0.setClassName(r8, r1)     // Catch: java.lang.Exception -> L7b
            java.lang.String r1 = com.acse.ottn.l0.w     // Catch: java.lang.Exception -> L7b
            r0.putExtra(r7, r1)     // Catch: java.lang.Exception -> L7b
            r0.putExtra(r6, r2)     // Catch: java.lang.Exception -> L7b
            r9.startActivityForResult(r0, r3)     // Catch: java.lang.Exception -> L7b
            return
        L7b:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.settings.APPLICATION_DETAILS_SETTINGS"
            r0.<init>(r1)
            java.lang.String r1 = com.acse.ottn.l0.w
            java.lang.String r2 = "package"
            r4 = 0
            android.net.Uri r1 = android.net.Uri.fromParts(r2, r1, r4)
            r0.setData(r1)
            r9.startActivityForResult(r0, r3)
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    public static void b(android.view.accessibility.AccessibilityNodeInfo r5) {
            if (r5 == 0) goto L8d
            r0 = 0
        L3:
            int r1 = r5.getChildCount()
            if (r0 >= r1) goto L8d
            android.view.accessibility.AccessibilityNodeInfo r1 = r5.getChild(r0)
            if (r1 == 0) goto L7c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "info.getChild(i)="
            r1.append(r2)
            android.view.accessibility.AccessibilityNodeInfo r2 = r5.getChild(r0)
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "acse_VivoUtils"
            com.acse.ottn.h2.a(r2, r1)
            java.lang.CharSequence r1 = r5.getText()
            java.lang.String r2 = "findAppName-->"
            if (r1 == 0) goto L55
            java.lang.CharSequence r1 = r5.getText()
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.trim()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "找到标题title= in.getClassName()="
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.acse.ottn.h2.c(r2, r1)
        L55:
            java.lang.CharSequence r1 = r5.getContentDescription()
            if (r1 == 0) goto L89
            java.lang.CharSequence r1 = r5.getContentDescription()
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.trim()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "找到标题title= in.getContentDescription()="
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.acse.ottn.h2.c(r2, r1)
            goto L89
        L7c:
            android.view.accessibility.AccessibilityNodeInfo r1 = r5.getChild(r0)
            if (r1 == 0) goto L89
            android.view.accessibility.AccessibilityNodeInfo r1 = r5.getChild(r0)
            b(r1)
        L89:
            int r0 = r0 + 1
            goto L3
        L8d:
            return
    }

    public static /* synthetic */ boolean b(android.accessibilityservice.AccessibilityService r0, android.view.accessibility.AccessibilityNodeInfo r1, boolean r2) {
            boolean r0 = c(r0, r1, r2)
            return r0
    }

    @androidx.annotation.RequiresApi(api = 16)
    public static void c(android.accessibilityservice.AccessibilityService r4) {
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            java.lang.String r1 = "允许显示在其他应用的上层"
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.g(r4, r1)
            if (r0 != 0) goto L13
            android.view.accessibility.AccessibilityNodeInfo r1 = r0.getParent()
            if (r1 == 0) goto L13
            goto L56
        L13:
            r1 = 0
        L14:
            android.view.accessibility.AccessibilityNodeInfo r2 = r0.getParent()
            int r2 = r2.getChildCount()
            if (r1 >= r2) goto L56
            android.view.accessibility.AccessibilityNodeInfo r2 = r0.getParent()
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.getChild(r1)
            if (r2 == 0) goto L53
            android.view.accessibility.AccessibilityNodeInfo r2 = r0.getParent()
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.getChild(r1)
            java.lang.CharSequence r2 = r2.getClassName()
            java.lang.String r3 = "android.widget.Switch"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L53
            com.acse.ottn.b r2 = com.acse.ottn.b.c()
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.getParent()
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.getChild(r1)
            r2.g(r0)
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            r0.e(r4)
            return
        L53:
            int r1 = r1 + 1
            goto L14
        L56:
            return
    }

    public static boolean c(android.accessibilityservice.AccessibilityService r4, android.view.accessibility.AccessibilityNodeInfo r5, boolean r6) {
            r0 = 0
            r1 = 0
        L2:
            int r2 = r5.getChildCount()
            if (r1 >= r2) goto Lcf
            android.view.accessibility.AccessibilityNodeInfo r2 = r5.getChild(r1)
            if (r2 == 0) goto Lcb
            android.view.accessibility.AccessibilityNodeInfo r2 = r5.getChild(r1)
            java.lang.CharSequence r2 = r2.getClassName()
            java.lang.String r3 = "android.widget.Switch"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L2e
            android.view.accessibility.AccessibilityNodeInfo r2 = r5.getChild(r1)
            java.lang.CharSequence r2 = r2.getClassName()
            java.lang.String r3 = "android.widget.SeekBar"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Lcb
        L2e:
            java.lang.String r2 = "find auto Switch"
            java.lang.String r3 = "acse_VivoUtils"
            com.acse.ottn.h2.a(r3, r2)
            android.view.accessibility.AccessibilityNodeInfo r2 = r5.getChild(r1)
            boolean r2 = r2.isChecked()
            if (r2 != 0) goto Lc6
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.view.accessibility.AccessibilityNodeInfo r5 = r5.getChild(r1)
            r5.getBoundsInScreen(r0)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "left="
            r5.append(r1)
            int r1 = r0.left
            r5.append(r1)
            java.lang.String r1 = "   right="
            r5.append(r1)
            int r1 = r0.right
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            com.acse.ottn.h2.a(r3, r5)
            int r5 = com.acse.ottn.n4.c(r4)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 34
            if (r1 <= r2) goto L8f
            int r2 = r0.right
            if (r2 <= r5) goto L81
            int r6 = r0.left
            int r2 = r2 - r6
            int r2 = r2 / 2
            int r2 = r2 + r6
        L7f:
            int r2 = r2 - r5
            goto L93
        L81:
            if (r6 == 0) goto L8a
            int r5 = r0.left
            int r2 = r2 - r5
            int r2 = r2 / 2
            int r2 = r2 + r5
            goto L93
        L8a:
            int r5 = r0.left
            int r5 = r5 / 2
            goto L7f
        L8f:
            int r5 = r0.right
            int r2 = r5 + (-130)
        L93:
            int r5 = r0.bottom
            int r6 = r0.top
            int r5 = r5 - r6
            int r5 = r5 / 2
            int r5 = r5 + r6
            r6 = 24
            if (r1 < r6) goto Lc4
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "start  click Switch x="
            r6.append(r0)
            r6.append(r2)
            java.lang.String r0 = "  y="
            r6.append(r0)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            com.acse.ottn.h2.a(r3, r6)
            com.acse.ottn.b r6 = com.acse.ottn.b.c()
            int r2 = r2 + (-30)
            r6.a(r4, r2, r5)
        Lc4:
            r4 = 1
            return r4
        Lc6:
            java.lang.String r2 = "start is open"
            com.acse.ottn.h2.a(r3, r2)
        Lcb:
            int r1 = r1 + 1
            goto L2
        Lcf:
            return r0
    }

    public static void d(android.accessibilityservice.AccessibilityService r6) {
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            com.acse.ottn.t0 r1 = com.acse.ottn.t0.b()
            r2 = 200(0xc8, float:2.8E-43)
            int r1 = r1.b(r2)
            long r1 = (long) r1
            r0.a(r1)
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            java.lang.String r1 = "后台耗电管理"
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.j(r6, r1)
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            java.lang.String r2 = "后台高耗电"
            android.view.accessibility.AccessibilityNodeInfo r1 = r1.j(r6, r2)
            r2 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r4 = "battery_white"
            java.lang.String r5 = "acse_VivoUtils"
            if (r0 == 0) goto L5b
            java.lang.String r1 = "clickServiceBackgroundHight info is not null"
            com.acse.ottn.h2.a(r5, r1)
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            if (r1 == 0) goto L42
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r1.a(r4, r5)
        L42:
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            r1.g(r0)
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.acse.ottn.z4$c r1 = new com.acse.ottn.z4$c
            r1.<init>(r6)
            r0.postDelayed(r1, r2)
            return
        L5b:
            if (r1 == 0) goto L8e
            java.lang.String r0 = "clickServiceBackgroundHight info2 is not null"
            com.acse.ottn.h2.a(r5, r0)
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            if (r0 == 0) goto L76
            java.lang.String r0 = "clickServiceBackgroundHight QuickPreference is not null"
            com.acse.ottn.h2.a(r5, r0)
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r0.a(r4, r5)
        L76:
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            r0.g(r1)
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.acse.ottn.z4$d r1 = new com.acse.ottn.z4$d
            r1.<init>(r6)
            r0.postDelayed(r1, r2)
        L8e:
            return
    }

    public static boolean d(android.accessibilityservice.AccessibilityService r4, android.view.accessibility.AccessibilityNodeInfo r5, boolean r6) {
            r0 = 0
            r1 = 0
        L2:
            int r2 = r5.getChildCount()
            if (r1 >= r2) goto Ld9
            android.view.accessibility.AccessibilityNodeInfo r2 = r5.getChild(r1)
            if (r2 == 0) goto Ld5
            android.view.accessibility.AccessibilityNodeInfo r2 = r5.getChild(r1)
            java.lang.CharSequence r2 = r2.getClassName()
            java.lang.String r3 = "android.widget.Switch"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L2e
            android.view.accessibility.AccessibilityNodeInfo r2 = r5.getChild(r1)
            java.lang.CharSequence r2 = r2.getClassName()
            java.lang.String r3 = "android.widget.SeekBar"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Ld5
        L2e:
            java.lang.String r2 = "find auto Switch"
            java.lang.String r3 = "acse_VivoUtils"
            com.acse.ottn.h2.a(r3, r2)
            android.view.accessibility.AccessibilityNodeInfo r2 = r5.getChild(r1)
            boolean r2 = r2.isChecked()
            if (r2 != 0) goto Ld0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.view.accessibility.AccessibilityNodeInfo r5 = r5.getChild(r1)
            r5.getBoundsInScreen(r0)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "left="
            r5.append(r1)
            int r1 = r0.left
            r5.append(r1)
            java.lang.String r1 = "   right="
            r5.append(r1)
            int r1 = r0.right
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            com.acse.ottn.h2.a(r3, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "top="
            r5.append(r1)
            int r1 = r0.top
            r5.append(r1)
            java.lang.String r1 = "   bottom="
            r5.append(r1)
            int r1 = r0.bottom
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            com.acse.ottn.h2.a(r3, r5)
            int r5 = r0.bottom
            int r1 = r0.top
            int r5 = r5 - r1
            int r5 = r5 / 2
            int r5 = r5 + r1
            if (r6 == 0) goto L9e
            int r6 = r0.right
            int r0 = r0.left
            int r6 = r6 - r0
            int r6 = r6 / 2
            int r6 = r6 + r0
            goto La5
        L9e:
            int r6 = r0.right
            int r0 = r0.left
            int r6 = r6 - r0
            int r6 = r6 + (-50)
        La5:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Lce
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "start  click Switch x="
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = "  y="
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.acse.ottn.h2.a(r3, r0)
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            r0.a(r4, r6, r5)
        Lce:
            r4 = 1
            return r4
        Ld0:
            java.lang.String r2 = "start is open"
            com.acse.ottn.h2.a(r3, r2)
        Ld5:
            int r1 = r1 + 1
            goto L2
        Ld9:
            return r0
    }

    public static void e(android.accessibilityservice.AccessibilityService r7) {
            com.acse.ottn.o1 r0 = com.acse.ottn.o1.c()
            java.lang.String r0 = r0.b()
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            r2 = 500(0x1f4, double:2.47E-321)
            r1.a(r2)
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            android.view.accessibility.AccessibilityNodeInfo r1 = r1.h(r7, r0)
            java.lang.String r2 = "acse_VivoUtils"
            if (r1 == 0) goto L14c
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            java.lang.String r3 = "今日不再提醒"
            android.view.accessibility.AccessibilityNodeInfo r1 = r1.j(r7, r3)
            if (r1 == 0) goto L30
            com.acse.ottn.b r3 = com.acse.ottn.b.c()
            r3.g(r1)
        L30:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "findAppName 存在="
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.acse.ottn.h2.a(r2, r0)
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            java.lang.String r1 = "始终打开"
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.h(r7, r1)
            java.lang.String r1 = "findAppName 存在始终打开"
            com.acse.ottn.h2.a(r2, r1)
            java.lang.String r3 = "     y="
            java.lang.String r4 = "findAppName x="
            r5 = 24
            if (r0 == 0) goto L97
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.getBoundsInScreen(r1)
            int r0 = r1.right
            int r6 = r1.left
            int r0 = r0 - r6
            int r0 = r0 / 2
            int r0 = r0 + r6
            int r6 = r1.bottom
            int r1 = r1.top
            int r6 = r6 - r1
            int r6 = r6 / 2
            int r6 = r6 + r1
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r5) goto Le1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            r1.append(r0)
            r1.append(r3)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            com.acse.ottn.h2.a(r2, r1)
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            r1.a(r7, r0, r6)
            return
        L97:
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            java.lang.String r6 = "30天内允许"
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.h(r7, r6)
            com.acse.ottn.h2.a(r2, r1)
            if (r0 == 0) goto Le2
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.getBoundsInScreen(r1)
            int r0 = r1.right
            int r6 = r1.left
            int r0 = r0 - r6
            int r0 = r0 / 2
            int r0 = r0 + r6
            int r6 = r1.bottom
            int r1 = r1.top
            int r6 = r6 - r1
            int r6 = r6 / 2
            int r6 = r6 + r1
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r5) goto Le1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            r1.append(r0)
            r1.append(r3)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            com.acse.ottn.h2.a(r2, r1)
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            r1.a(r7, r0, r6)
        Le1:
            return
        Le2:
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            java.lang.String r1 = "始终允许"
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.j(r7, r1)
            if (r0 == 0) goto Lfb
            java.lang.String r7 = "findAppName 始终允许"
            com.acse.ottn.h2.a(r2, r7)
            com.acse.ottn.b r7 = com.acse.ottn.b.c()
            r7.g(r0)
            return
        Lfb:
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            java.lang.String r1 = "允许"
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.j(r7, r1)
            if (r0 == 0) goto L114
            java.lang.String r7 = "findAppName 允许"
            com.acse.ottn.h2.a(r2, r7)
            com.acse.ottn.b r7 = com.acse.ottn.b.c()
            r7.g(r0)
            return
        L114:
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            java.lang.String r3 = "始终允许打开"
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.j(r7, r3)
            if (r0 == 0) goto L12c
            java.lang.String r3 = "findAppName 始终允许打开"
            com.acse.ottn.h2.a(r2, r3)
            com.acse.ottn.b r3 = com.acse.ottn.b.c()
            r3.g(r0)
        L12c:
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            java.lang.String r3 = "打开"
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.j(r7, r3)
            if (r0 == 0) goto L144
            java.lang.String r3 = "findAppName 打开"
            com.acse.ottn.h2.a(r2, r3)
            com.acse.ottn.b r2 = com.acse.ottn.b.c()
            r2.g(r0)
        L144:
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            r0.i(r7, r1)
            return
        L14c:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "findAppName 不存在="
            r7.append(r1)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            com.acse.ottn.h2.a(r2, r7)
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    public static void f(android.accessibilityservice.AccessibilityService r1) {
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.getRootInActiveWindow()
            if (r0 != 0) goto La
            android.view.accessibility.AccessibilityNodeInfo r0 = r1.getRootInActiveWindow()
        La:
            a(r0)
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    public static void g(android.accessibilityservice.AccessibilityService r2) {
            java.lang.String r0 = "findAppName 开始"
            java.lang.String r1 = "acse_VivoUtils"
            com.acse.ottn.h2.a(r1, r0)
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.getRootInActiveWindow()
            if (r0 != 0) goto L16
            java.lang.String r0 = "findAppName null"
            com.acse.ottn.h2.a(r1, r0)
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.getRootInActiveWindow()
        L16:
            b(r0)
            return
    }

    public static void h(android.accessibilityservice.AccessibilityService r1) {
            java.lang.String r0 = "vivo_permission"
            com.acse.ottn.t0.a(r1, r0)     // Catch: java.lang.Exception -> L5
        L5:
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            r0.e(r1)
            return
    }

    public static void i(android.accessibilityservice.AccessibilityService r5) {
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            java.lang.String r1 = "权限"
            r2 = 1
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.a(r5, r1, r2)
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            r1.g(r0)
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            com.acse.ottn.t0 r1 = com.acse.ottn.t0.b()
            r3 = 500(0x1f4, float:7.0E-43)
            int r1 = r1.b(r3)
            long r3 = (long) r1
            r0.a(r3)
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            java.lang.String r1 = "自启动"
            android.view.accessibility.AccessibilityNodeInfo r5 = r0.a(r5, r1, r2)
            if (r5 == 0) goto L37
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            r0.g(r5)
        L37:
            return
    }

    @androidx.annotation.RequiresApi(api = 16)
    public static void j(android.accessibilityservice.AccessibilityService r5) {
            com.acse.ottn.o1 r0 = com.acse.ottn.o1.c()
            java.lang.String r0 = r0.b()
            java.lang.String r1 = "acse_VivoUtils"
            com.acse.ottn.h2.a(r1, r0)
            com.acse.ottn.n0 r1 = com.acse.ottn.n0.a()
            com.acse.ottn.t0 r2 = com.acse.ottn.t0.b()
            r3 = 20000(0x4e20, float:2.8026E-41)
            int r2 = r2.b(r3)
            com.acse.ottn.t0 r3 = com.acse.ottn.t0.b()
            r4 = 100
            int r3 = r3.b(r4)
            com.acse.ottn.z4$a r4 = new com.acse.ottn.z4$a
            r4.<init>(r5, r0)
            java.util.TimerTask r5 = r1.b(r2, r3, r4)
            com.acse.ottn.z4.f2920d = r5
            return
    }
}
