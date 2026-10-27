package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class f2 {
    public static final java.lang.String a = "LocationManager";

    /* renamed from: b, reason: collision with root package name */
    public static volatile com.acse.ottn.f2 f2317b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.Long f2318c;

    /* renamed from: d, reason: collision with root package name */
    public static java.util.TimerTask f2319d;

    /* renamed from: e, reason: collision with root package name */
    public static android.view.accessibility.AccessibilityNodeInfo f2320e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements com.acse.ottn.n0.d {
        public final /* synthetic */ android.accessibilityservice.AccessibilityService a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f2321b;

        public a(android.accessibilityservice.AccessibilityService r1, java.lang.String r2) {
                r0 = this;
                r0.a = r1
                r0.f2321b = r2
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a() {
                r1 = this;
                r0 = 0
                com.acse.ottn.f2.a(r0)
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a(long r2) {
                r1 = this;
                com.acse.ottn.b r2 = com.acse.ottn.b.c()     // Catch: java.lang.Throwable -> L20
                android.accessibilityservice.AccessibilityService r3 = r1.a     // Catch: java.lang.Throwable -> L20
                java.lang.String r0 = r1.f2321b     // Catch: java.lang.Throwable -> L20
                android.view.accessibility.AccessibilityNodeInfo r2 = r2.g(r3, r0)     // Catch: java.lang.Throwable -> L20
                if (r2 == 0) goto L43
                java.util.TimerTask r3 = com.acse.ottn.f2.a()     // Catch: java.lang.Throwable -> L20
                if (r3 == 0) goto L22
                java.util.TimerTask r3 = com.acse.ottn.f2.a()     // Catch: java.lang.Throwable -> L20
                r3.cancel()     // Catch: java.lang.Throwable -> L20
                r3 = 0
                com.acse.ottn.f2.a(r3)     // Catch: java.lang.Throwable -> L20
                goto L22
            L20:
                r2 = move-exception
                goto L44
            L22:
                com.acse.ottn.b r3 = com.acse.ottn.b.c()     // Catch: java.lang.Throwable -> L20
                r3.g(r2)     // Catch: java.lang.Throwable -> L20
                com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()     // Catch: java.lang.Throwable -> L20
                if (r2 == 0) goto L43
                com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()     // Catch: java.lang.Throwable -> L20
                java.lang.String r3 = "battery_white"
                java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L20
                r2.a(r3, r0)     // Catch: java.lang.Throwable -> L20
                com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()     // Catch: java.lang.Throwable -> L20
                java.lang.String r3 = "location_permission"
                r2.a(r3, r0)     // Catch: java.lang.Throwable -> L20
            L43:
                return
            L44:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r0 = "e ="
                r3.append(r0)
                java.lang.String r2 = r2.getMessage()
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                java.lang.String r3 = "LocationManager"
                com.acse.ottn.h2.a(r3, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class b implements com.acse.ottn.n0.d {
        public final /* synthetic */ android.accessibilityservice.AccessibilityService a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ android.view.accessibility.AccessibilityNodeInfo f2322b;

        public b(android.accessibilityservice.AccessibilityService r1, android.view.accessibility.AccessibilityNodeInfo r2) {
                r0 = this;
                r0.a = r1
                r0.f2322b = r2
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a() {
                r2 = this;
                java.lang.String r0 = "LocationManager"
                java.lang.String r1 = "结束了"
                com.acse.ottn.h2.a(r0, r1)
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a(long r2) {
                r1 = this;
                com.acse.ottn.b r2 = com.acse.ottn.b.c()
                android.accessibilityservice.AccessibilityService r3 = r1.a
                java.lang.String r0 = "位置信息"
                android.view.accessibility.AccessibilityNodeInfo r2 = r2.g(r3, r0)
                if (r2 == 0) goto L41
                java.util.TimerTask r3 = com.acse.ottn.f2.a()
                if (r3 == 0) goto L1f
                java.util.TimerTask r3 = com.acse.ottn.f2.a()
                r3.cancel()
                r3 = 0
                com.acse.ottn.f2.a(r3)
            L1f:
                com.acse.ottn.b r3 = com.acse.ottn.b.c()
                r3.g(r2)
                com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
                if (r2 == 0) goto L40
                com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
                java.lang.Boolean r3 = java.lang.Boolean.TRUE
                java.lang.String r0 = "battery_white"
                r2.a(r0, r3)
                com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
                java.lang.String r0 = "location_permission"
                r2.a(r0, r3)
            L40:
                return
            L41:
                com.acse.ottn.b r2 = com.acse.ottn.b.c()
                android.view.accessibility.AccessibilityNodeInfo r3 = r1.f2322b
                r2.b(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class c implements com.acse.ottn.n0.d {
        public final /* synthetic */ android.accessibilityservice.AccessibilityService a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f2323b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f2324c;

        public c(android.accessibilityservice.AccessibilityService r1, java.lang.String r2, java.lang.String r3) {
                r0 = this;
                r0.a = r1
                r0.f2323b = r2
                r0.f2324c = r3
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a() {
                r2 = this;
                java.lang.String r0 = "LocationManager"
                java.lang.String r1 = "结束了"
                com.acse.ottn.h2.a(r0, r1)
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a(long r3) {
                r2 = this;
                android.accessibilityservice.AccessibilityService r3 = r2.a
                android.view.accessibility.AccessibilityNodeInfo r3 = r3.getRootInActiveWindow()
                android.view.accessibility.AccessibilityNodeInfo r3 = com.acse.ottn.f2.c(r3)
                com.acse.ottn.b r4 = com.acse.ottn.b.c()
                android.accessibilityservice.AccessibilityService r0 = r2.a
                java.lang.String r1 = r2.f2323b
                android.view.accessibility.AccessibilityNodeInfo r4 = r4.g(r0, r1)
                if (r4 == 0) goto L5e
                java.util.TimerTask r3 = com.acse.ottn.f2.a()
                if (r3 == 0) goto L29
                java.util.TimerTask r3 = com.acse.ottn.f2.a()
                r3.cancel()
                r3 = 0
                com.acse.ottn.f2.a(r3)
            L29:
                java.lang.String r3 = r2.f2324c
                java.lang.String r0 = "honor"
                boolean r3 = r0.equals(r3)
                if (r3 != 0) goto L51
                java.lang.String r3 = r2.f2324c
                java.lang.String r0 = "tianyi"
                boolean r3 = r0.equals(r3)
                if (r3 == 0) goto L3e
                goto L51
            L3e:
                com.acse.ottn.n3 r3 = com.acse.ottn.n3.a()
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                java.lang.String r1 = "battery_white"
                r3.a(r1, r0)
                com.acse.ottn.b r3 = com.acse.ottn.b.c()
                r3.g(r4)
                return
            L51:
                com.acse.ottn.b r3 = com.acse.ottn.b.c()
                r3.g(r4)
                android.accessibilityservice.AccessibilityService r3 = r2.a
                com.acse.ottn.f2.l(r3)
                return
            L5e:
                if (r3 == 0) goto L67
                com.acse.ottn.b r4 = com.acse.ottn.b.c()
                r4.b(r3)
            L67:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class d implements com.acse.ottn.n0.d {
        public final /* synthetic */ java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ android.accessibilityservice.AccessibilityService f2325b;

        public d(java.lang.String r1, android.accessibilityservice.AccessibilityService r2) {
                r0 = this;
                r0.a = r1
                r0.f2325b = r2
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a() {
                r1 = this;
                r0 = 0
                com.acse.ottn.f2.a(r0)
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a(long r5) {
                r4 = this;
                java.lang.String r5 = "LocationManager"
                java.lang.String r6 = r4.a     // Catch: java.lang.Throwable -> L2d
                if (r6 != 0) goto L8
                goto L94
            L8:
                com.acse.ottn.b r6 = com.acse.ottn.b.c()     // Catch: java.lang.Throwable -> L2d
                android.accessibilityservice.AccessibilityService r0 = r4.f2325b     // Catch: java.lang.Throwable -> L2d
                java.lang.String r1 = r4.a     // Catch: java.lang.Throwable -> L2d
                android.view.accessibility.AccessibilityNodeInfo r6 = r6.g(r0, r1)     // Catch: java.lang.Throwable -> L2d
                if (r6 != 0) goto L2f
                android.accessibilityservice.AccessibilityService r6 = r4.f2325b     // Catch: java.lang.Throwable -> L2d
                com.acse.ottn.f2.a(r6)     // Catch: java.lang.Throwable -> L2d
                android.view.accessibility.AccessibilityNodeInfo r6 = com.acse.ottn.f2.b()     // Catch: java.lang.Throwable -> L2d
                if (r6 == 0) goto L94
                com.acse.ottn.b r6 = com.acse.ottn.b.c()     // Catch: java.lang.Throwable -> L2d
                android.view.accessibility.AccessibilityNodeInfo r0 = com.acse.ottn.f2.b()     // Catch: java.lang.Throwable -> L2d
                r6.b(r0)     // Catch: java.lang.Throwable -> L2d
                return
            L2d:
                r6 = move-exception
                goto L95
            L2f:
                java.util.TimerTask r0 = com.acse.ottn.f2.a()     // Catch: java.lang.Throwable -> L2d
                if (r0 == 0) goto L40
                java.util.TimerTask r0 = com.acse.ottn.f2.a()     // Catch: java.lang.Throwable -> L2d
                r0.cancel()     // Catch: java.lang.Throwable -> L2d
                r0 = 0
                com.acse.ottn.f2.a(r0)     // Catch: java.lang.Throwable -> L2d
            L40:
                java.lang.String r0 = "找到了定位"
                com.acse.ottn.h2.a(r5, r0)     // Catch: java.lang.Throwable -> L2d
                com.acse.ottn.b r0 = com.acse.ottn.b.c()     // Catch: java.lang.Throwable -> L2d
                r0.g(r6)     // Catch: java.lang.Throwable -> L2d
                com.acse.ottn.b r6 = com.acse.ottn.b.c()     // Catch: java.lang.Throwable -> L2d
                com.acse.ottn.t0 r0 = com.acse.ottn.t0.b()     // Catch: java.lang.Throwable -> L2d
                r1 = 200(0xc8, float:2.8E-43)
                int r0 = r0.b(r1)     // Catch: java.lang.Throwable -> L2d
                long r0 = (long) r0     // Catch: java.lang.Throwable -> L2d
                r6.a(r0)     // Catch: java.lang.Throwable -> L2d
                com.acse.ottn.b r6 = com.acse.ottn.b.c()     // Catch: java.lang.Throwable -> L2d
                android.accessibilityservice.AccessibilityService r0 = r4.f2325b     // Catch: java.lang.Throwable -> L2d
                java.lang.String r1 = "始终允许"
                android.view.accessibility.AccessibilityNodeInfo r6 = r6.g(r0, r1)     // Catch: java.lang.Throwable -> L2d
                com.acse.ottn.b r0 = com.acse.ottn.b.c()     // Catch: java.lang.Throwable -> L2d
                android.accessibilityservice.AccessibilityService r1 = r4.f2325b     // Catch: java.lang.Throwable -> L2d
                java.lang.String r2 = "允许"
                r3 = 1
                android.view.accessibility.AccessibilityNodeInfo r0 = r0.a(r1, r2, r3)     // Catch: java.lang.Throwable -> L2d
                if (r6 == 0) goto L86
                com.acse.ottn.b r0 = com.acse.ottn.b.c()     // Catch: java.lang.Throwable -> L2d
                r0.g(r6)     // Catch: java.lang.Throwable -> L2d
                android.accessibilityservice.AccessibilityService r6 = r4.f2325b     // Catch: java.lang.Throwable -> L2d
                com.acse.ottn.f2.a(r6, r3)     // Catch: java.lang.Throwable -> L2d
                return
            L86:
                if (r0 == 0) goto L94
                com.acse.ottn.b r6 = com.acse.ottn.b.c()     // Catch: java.lang.Throwable -> L2d
                r6.g(r0)     // Catch: java.lang.Throwable -> L2d
                android.accessibilityservice.AccessibilityService r6 = r4.f2325b     // Catch: java.lang.Throwable -> L2d
                com.acse.ottn.f2.a(r6, r3)     // Catch: java.lang.Throwable -> L2d
            L94:
                return
            L95:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "e ="
                r0.append(r1)
                java.lang.String r6 = r6.getMessage()
                r0.append(r6)
                java.lang.String r6 = r0.toString()
                com.acse.ottn.h2.a(r5, r6)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class e implements com.acse.ottn.n0.d {
        public final /* synthetic */ android.accessibilityservice.AccessibilityService a;

        public e(android.accessibilityservice.AccessibilityService r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a() {
                r1 = this;
                r0 = 0
                com.acse.ottn.f2.a(r0)
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a(long r11) {
                r10 = this;
                com.acse.ottn.b r11 = com.acse.ottn.b.c()
                android.accessibilityservice.AccessibilityService r12 = r10.a
                java.lang.String r0 = "定位"
                android.view.accessibility.AccessibilityNodeInfo r11 = r11.h(r12, r0)
                r12 = 24
                r1 = 2
                java.lang.String r2 = "LocationManager"
                if (r11 == 0) goto Lf8
                com.acse.ottn.b r11 = com.acse.ottn.b.c()
                android.accessibilityservice.AccessibilityService r3 = r10.a
                r11.i(r3, r0)
                com.acse.ottn.b r11 = com.acse.ottn.b.c()
                r3 = 500(0x1f4, double:2.47E-321)
                r11.a(r3)
                com.acse.ottn.b r11 = com.acse.ottn.b.c()
                android.accessibilityservice.AccessibilityService r0 = r10.a
                java.lang.String r5 = "始终允许"
                android.view.accessibility.AccessibilityNodeInfo r11 = r11.h(r0, r5)
                r0 = 35
                r5 = 0
                if (r11 == 0) goto L63
                java.util.TimerTask r12 = com.acse.ottn.f2.a()
                if (r12 == 0) goto L46
                java.util.TimerTask r12 = com.acse.ottn.f2.a()
                r12.cancel()
                com.acse.ottn.f2.a(r5)
            L46:
                java.lang.String r12 = "clickVivoLocation appNodeInfo is not null"
                com.acse.ottn.h2.a(r2, r12)
                com.acse.ottn.b r12 = com.acse.ottn.b.c()
                r12.g(r11)
                int r11 = android.os.Build.VERSION.SDK_INT
                if (r11 < r0) goto L5c
                android.accessibilityservice.AccessibilityService r11 = r10.a
                com.acse.ottn.f2.a(r11, r1)
                return
            L5c:
                android.accessibilityservice.AccessibilityService r11 = r10.a
                r12 = 1
                com.acse.ottn.f2.a(r11, r12)
                return
            L63:
                int r11 = android.os.Build.VERSION.SDK_INT
                if (r11 < r0) goto Lbc
                java.util.TimerTask r11 = com.acse.ottn.f2.a()
                if (r11 == 0) goto L77
                java.util.TimerTask r11 = com.acse.ottn.f2.a()
                r11.cancel()
                com.acse.ottn.f2.a(r5)
            L77:
                com.acse.ottn.b r11 = com.acse.ottn.b.c()
                r11.a(r3)
                android.accessibilityservice.AccessibilityService r11 = r10.a
                int r11 = com.acse.ottn.n4.c(r11)
                android.accessibilityservice.AccessibilityService r12 = r10.a
                int r12 = com.acse.ottn.n4.b(r12)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = "current x="
                r0.append(r3)
                int r11 = r11 / r1
                r0.append(r11)
                java.lang.String r3 = "   current y="
                r0.append(r3)
                int r12 = r12 / 3
                int r12 = r12 * 9
                int r12 = r12 / 10
                r0.append(r12)
                java.lang.String r0 = r0.toString()
                com.acse.ottn.h2.a(r2, r0)
                com.acse.ottn.b r0 = com.acse.ottn.b.c()
                android.accessibilityservice.AccessibilityService r2 = r10.a
                r0.a(r2, r11, r12)
                android.accessibilityservice.AccessibilityService r11 = r10.a
                com.acse.ottn.f2.a(r11, r1)
                return
            Lbc:
                java.lang.String r0 = "clickVivoLocation appNodeInfo is null"
                com.acse.ottn.h2.a(r2, r0)
                java.lang.String r0 = "滑动2"
                com.acse.ottn.h2.a(r2, r0)
                if (r11 < r12) goto L130
                com.acse.ottn.b r3 = com.acse.ottn.b.c()
                android.accessibilityservice.AccessibilityService r4 = r10.a
                int r11 = com.acse.ottn.n4.c(r4)
                int r5 = r11 / 3
                android.accessibilityservice.AccessibilityService r11 = r10.a
                int r11 = com.acse.ottn.n4.b(r11)
                int r11 = r11 * 2
                int r11 = r11 / 3
                int r6 = r11 + 300
                android.accessibilityservice.AccessibilityService r11 = r10.a
                int r11 = com.acse.ottn.n4.c(r11)
                int r11 = r11 / 3
                int r7 = r11 + 100
                android.accessibilityservice.AccessibilityService r11 = r10.a
                int r11 = com.acse.ottn.n4.b(r11)
                int r8 = r11 / 3
                r9 = 500(0x1f4, float:7.0E-43)
                r3.a(r4, r5, r6, r7, r8, r9)
                return
            Lf8:
                java.lang.String r11 = "滑动1 "
                com.acse.ottn.h2.a(r2, r11)
                int r11 = android.os.Build.VERSION.SDK_INT
                if (r11 < r12) goto L130
                com.acse.ottn.b r2 = com.acse.ottn.b.c()
                android.accessibilityservice.AccessibilityService r3 = r10.a
                int r11 = com.acse.ottn.n4.c(r3)
                int r4 = r11 / 3
                android.accessibilityservice.AccessibilityService r11 = r10.a
                int r11 = com.acse.ottn.n4.b(r11)
                int r11 = r11 * 2
                int r11 = r11 / 3
                int r5 = r11 + 300
                android.accessibilityservice.AccessibilityService r11 = r10.a
                int r11 = com.acse.ottn.n4.c(r11)
                int r11 = r11 / 3
                int r6 = r11 + 100
                android.accessibilityservice.AccessibilityService r11 = r10.a
                int r11 = com.acse.ottn.n4.b(r11)
                int r7 = r11 / 3
                r8 = 500(0x1f4, float:7.0E-43)
                r2.a(r3, r4, r5, r6, r7, r8)
            L130:
                return
        }
    }

    static {
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            com.acse.ottn.f2.f2318c = r0
            r0 = 0
            com.acse.ottn.f2.f2319d = r0
            return
    }

    public f2() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ java.util.TimerTask a() {
            java.util.TimerTask r0 = com.acse.ottn.f2.f2319d
            return r0
    }

    public static /* synthetic */ java.util.TimerTask a(java.util.TimerTask r0) {
            com.acse.ottn.f2.f2319d = r0
            return r0
    }

    public static /* synthetic */ void a(android.accessibilityservice.AccessibilityService r0) {
            i(r0)
            return
    }

    public static /* synthetic */ void a(android.accessibilityservice.AccessibilityService r0, int r1) {
            b(r0, r1)
            return
    }

    public static void a(android.accessibilityservice.AccessibilityService r8, long r9) {
            java.lang.Long r0 = com.acse.ottn.f2.f2318c
            long r0 = r0.longValue()
            long r0 = r9 - r0
            r2 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r4 = "   System.currentTimeMillis()-time ="
            java.lang.String r5 = "   System.currentTimeMillis() ="
            java.lang.String r6 = "LocationManager"
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 >= 0) goto L5a
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
            java.lang.Long r9 = com.acse.ottn.f2.f2318c
            r8.append(r9)
            r8.append(r4)
            long r9 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = com.acse.ottn.f2.f2318c
            long r0 = r0.longValue()
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
            java.lang.Long r1 = com.acse.ottn.f2.f2318c
            r0.append(r1)
            r0.append(r4)
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Long r3 = com.acse.ottn.f2.f2318c
            long r3 = r3.longValue()
            long r1 = r1 - r3
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.acse.ottn.h2.a(r6, r0)
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            com.acse.ottn.f2.f2318c = r9
            com.acse.ottn.b r9 = com.acse.ottn.b.c()
            r0 = 200(0xc8, double:9.9E-322)
            r9.a(r0)
            com.acse.ottn.b r9 = com.acse.ottn.b.c()
            java.lang.String r10 = "始终允许"
            android.view.accessibility.AccessibilityNodeInfo r9 = r9.h(r8, r10)
            if (r9 == 0) goto Lc5
            com.acse.ottn.b r10 = com.acse.ottn.b.c()
            r10.g(r9)
            r9 = 2
            b(r8, r9)
        Lc5:
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    public static void a(android.accessibilityservice.AccessibilityService r4, android.view.accessibility.AccessibilityNodeInfo r5) {
            if (r5 == 0) goto L26
            com.acse.ottn.n0 r5 = com.acse.ottn.n0.a()
            com.acse.ottn.t0 r0 = com.acse.ottn.t0.b()
            r1 = 3000(0xbb8, float:4.204E-42)
            int r0 = r0.b(r1)
            com.acse.ottn.t0 r1 = com.acse.ottn.t0.b()
            r2 = 300(0x12c, float:4.2E-43)
            int r1 = r1.b(r2)
            com.acse.ottn.f2$b r2 = new com.acse.ottn.f2$b
            r3 = 0
            r2.<init>(r4, r3)
            java.util.TimerTask r4 = r5.b(r0, r1, r2)
            com.acse.ottn.f2.f2319d = r4
        L26:
            return
    }

    public static void a(android.accessibilityservice.AccessibilityService r0, boolean r1) {
            b(r0, r1)     // Catch: java.lang.Throwable -> L3
        L3:
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    public static void a(android.view.accessibility.AccessibilityNodeInfo r3) {
            if (r3 != 0) goto L3
            goto L29
        L3:
            r0 = 0
        L4:
            int r1 = r3.getChildCount()
            if (r0 >= r1) goto L29
            android.view.accessibility.AccessibilityNodeInfo r1 = r3.getChild(r0)
            if (r1 == 0) goto L26
            java.lang.CharSequence r1 = r3.getClassName()
            java.lang.String r2 = "androidx.recyclerview.widget.RecyclerView"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L1f
            com.acse.ottn.f2.f2320e = r3
            return
        L1f:
            android.view.accessibility.AccessibilityNodeInfo r1 = r3.getChild(r0)
            a(r1)
        L26:
            int r0 = r0 + 1
            goto L4
        L29:
            return
    }

    public static /* synthetic */ android.view.accessibility.AccessibilityNodeInfo b() {
            android.view.accessibility.AccessibilityNodeInfo r0 = com.acse.ottn.f2.f2320e
            return r0
    }

    public static void b(android.accessibilityservice.AccessibilityService r3) {
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            java.lang.String r1 = "始终允许"
            r2 = 1
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.a(r3, r1, r2)
            if (r0 == 0) goto L18
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            r1.g(r0)
            r0 = 4
            b(r3, r0)
        L18:
            return
    }

    public static void b(android.accessibilityservice.AccessibilityService r4, int r5) {
            r0 = 0
        L1:
            if (r0 >= r5) goto L2a
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            com.acse.ottn.t0 r2 = com.acse.ottn.t0.b()
            r3 = 200(0xc8, float:2.8E-43)
            int r2 = r2.b(r3)
            long r2 = (long) r2
            r1.a(r2)
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.String r3 = "battery_white"
            r1.a(r3, r2)
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            r1.e(r4)
            int r0 = r0 + 1
            goto L1
        L2a:
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    public static void b(android.accessibilityservice.AccessibilityService r4, boolean r5) {
            android.view.accessibility.AccessibilityNodeInfo r0 = r4.getRootInActiveWindow()
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            com.acse.ottn.t0 r2 = com.acse.ottn.t0.b()
            r3 = 200(0xc8, float:2.8E-43)
            int r2 = r2.b(r3)
            long r2 = (long) r2
            r1.a(r2)
            if (r5 == 0) goto L1c
            a(r4, r0)
            return
        L1c:
            f(r4)
            return
    }

    public static void b(android.view.accessibility.AccessibilityNodeInfo r3) {
            if (r3 == 0) goto L65
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "recycle1 ="
            r0.append(r1)
            java.lang.String r1 = r3.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "LocationManager"
            com.acse.ottn.h2.a(r1, r0)
            java.lang.CharSequence r0 = r3.getText()
            if (r0 == 0) goto L3e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "recycle2 ="
            r0.append(r2)
            java.lang.CharSequence r2 = r3.getText()
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.acse.ottn.h2.a(r1, r0)
        L3e:
            java.lang.CharSequence r0 = r3.getContentDescription()
            if (r0 == 0) goto L7e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "getContentDescription="
            r0.append(r2)
            java.lang.CharSequence r3 = r3.getContentDescription()
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r3.trim()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            com.acse.ottn.h2.a(r1, r3)
            return
        L65:
            if (r3 == 0) goto L7e
            r0 = 0
        L68:
            int r1 = r3.getChildCount()
            if (r0 >= r1) goto L7e
            android.view.accessibility.AccessibilityNodeInfo r1 = r3.getChild(r0)
            if (r1 == 0) goto L7b
            android.view.accessibility.AccessibilityNodeInfo r1 = r3.getChild(r0)
            b(r1)
        L7b:
            int r0 = r0 + 1
            goto L68
        L7e:
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    public static android.view.accessibility.AccessibilityNodeInfo c(android.view.accessibility.AccessibilityNodeInfo r3) {
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
            c(r1)
        L3b:
            int r0 = r0 + 1
            goto L3
        L3e:
            r3 = 0
            return r3
    }

    public static com.acse.ottn.f2 c() {
            com.acse.ottn.f2 r0 = com.acse.ottn.f2.f2317b
            if (r0 != 0) goto L19
            java.lang.Class<com.acse.ottn.f2> r0 = com.acse.ottn.f2.class
            monitor-enter(r0)
            com.acse.ottn.f2 r1 = com.acse.ottn.f2.f2317b     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.acse.ottn.f2 r1 = new com.acse.ottn.f2     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.acse.ottn.f2.f2317b = r1     // Catch: java.lang.Throwable -> L13
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
            com.acse.ottn.f2 r0 = com.acse.ottn.f2.f2317b
            return r0
    }

    public static void c(android.accessibilityservice.AccessibilityService r3) {
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            r1 = 100
            r0.a(r1)
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            java.lang.String r1 = "仅在使用该应用时允许"
            android.view.accessibility.AccessibilityNodeInfo r3 = r0.h(r3, r1)
            if (r3 == 0) goto L1c
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            r0.g(r3)
        L1c:
            return
    }

    public static void d(android.accessibilityservice.AccessibilityService r4) {
            java.lang.String r0 = "clickSamsungNeverLocation"
            java.lang.String r1 = "LocationManager"
            com.acse.ottn.h2.a(r1, r0)
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            r2 = 200(0xc8, double:9.9E-322)
            r0.a(r2)
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            java.lang.String r2 = "始终允许"
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.h(r4, r2)
            if (r0 == 0) goto L2c
            java.lang.String r2 = "找了始终允许"
            com.acse.ottn.h2.a(r1, r2)
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            r1.g(r0)
            r0 = 1
            b(r4, r0)
        L2c:
            return
    }

    @androidx.annotation.RequiresApi(api = 16)
    public static void e(android.accessibilityservice.AccessibilityService r5) {
            java.util.TimerTask r0 = com.acse.ottn.f2.f2319d
            if (r0 == 0) goto La
            r0.cancel()
            r0 = 0
            com.acse.ottn.f2.f2319d = r0
        La:
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r1 = "OpenPermissionName"
            java.lang.String r0 = r0.e(r1)
            com.acse.ottn.n0 r1 = com.acse.ottn.n0.a()
            com.acse.ottn.t0 r2 = com.acse.ottn.t0.b()
            r3 = 6000(0x1770, float:8.408E-42)
            int r2 = r2.b(r3)
            com.acse.ottn.t0 r3 = com.acse.ottn.t0.b()
            r4 = 100
            int r3 = r3.b(r4)
            com.acse.ottn.f2$a r4 = new com.acse.ottn.f2$a
            r4.<init>(r5, r0)
            java.util.TimerTask r5 = r1.b(r2, r3, r4)
            com.acse.ottn.f2.f2319d = r5
            return
    }

    public static void f(android.accessibilityservice.AccessibilityService r6) {
            com.acse.ottn.o1 r0 = com.acse.ottn.o1.c()
            java.lang.String r0 = r0.b()
            java.lang.String r1 = com.acse.ottn.n4.b()
            com.acse.ottn.n0 r2 = com.acse.ottn.n0.a()
            com.acse.ottn.t0 r3 = com.acse.ottn.t0.b()
            r4 = 8000(0x1f40, float:1.121E-41)
            int r3 = r3.b(r4)
            com.acse.ottn.t0 r4 = com.acse.ottn.t0.b()
            r5 = 100
            int r4 = r4.b(r5)
            com.acse.ottn.f2$c r5 = new com.acse.ottn.f2$c
            r5.<init>(r6, r0, r1)
            java.util.TimerTask r6 = r2.b(r3, r4, r5)
            com.acse.ottn.f2.f2319d = r6
            return
    }

    public static void g(android.accessibilityservice.AccessibilityService r4) {
            java.lang.String r0 = "LocationManager"
            java.lang.String r1 = "clickVivoLocation"
            com.acse.ottn.h2.a(r0, r1)
            java.util.TimerTask r0 = com.acse.ottn.f2.f2319d
            if (r0 == 0) goto L11
            r0.cancel()
            r0 = 0
            com.acse.ottn.f2.f2319d = r0
        L11:
            com.acse.ottn.n0 r0 = com.acse.ottn.n0.a()
            com.acse.ottn.t0 r1 = com.acse.ottn.t0.b()
            r2 = 12000(0x2ee0, float:1.6816E-41)
            int r1 = r1.b(r2)
            com.acse.ottn.t0 r2 = com.acse.ottn.t0.b()
            r3 = 1000(0x3e8, float:1.401E-42)
            int r2 = r2.b(r3)
            com.acse.ottn.f2$e r3 = new com.acse.ottn.f2$e
            r3.<init>(r4)
            java.util.TimerTask r4 = r0.b(r1, r2, r3)
            com.acse.ottn.f2.f2319d = r4
            return
    }

    @androidx.annotation.RequiresApi(api = 16)
    public static void h(android.accessibilityservice.AccessibilityService r5) {
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            java.lang.String r1 = "位置"
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.g(r5, r1)
            if (r0 == 0) goto L38
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            r1.g(r0)
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            r1 = 100
            r0.a(r1)
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.String r2 = "battery_white"
            r0.a(r2, r1)
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r2 = "is_pengpai"
            r0.a(r2, r1)
            long r0 = java.lang.System.currentTimeMillis()
            a(r5, r0)
            return
        L38:
            java.util.TimerTask r0 = com.acse.ottn.f2.f2319d
            if (r0 == 0) goto L42
            r0.cancel()
            r0 = 0
            com.acse.ottn.f2.f2319d = r0
        L42:
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r1 = "OpenPermissionName"
            java.lang.String r0 = r0.e(r1)
            com.acse.ottn.n0 r1 = com.acse.ottn.n0.a()
            com.acse.ottn.t0 r2 = com.acse.ottn.t0.b()
            r3 = 2000(0x7d0, float:2.803E-42)
            int r2 = r2.b(r3)
            com.acse.ottn.t0 r3 = com.acse.ottn.t0.b()
            r4 = 300(0x12c, float:4.2E-43)
            int r3 = r3.b(r4)
            com.acse.ottn.f2$d r4 = new com.acse.ottn.f2$d
            r4.<init>(r0, r5)
            java.util.TimerTask r5 = r1.b(r2, r3, r4)
            com.acse.ottn.f2.f2319d = r5
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    public static void i(android.accessibilityservice.AccessibilityService r0) {
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.getRootInActiveWindow()
            a(r0)
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    public static void j(android.accessibilityservice.AccessibilityService r2) {
            java.lang.String r0 = "LocationManager"
            java.lang.String r1 = "getPacketw"
            com.acse.ottn.h2.a(r0, r1)
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.getRootInActiveWindow()
            b(r2)
            return
    }

    @androidx.annotation.RequiresApi(api = 16)
    public static void k(android.accessibilityservice.AccessibilityService r6) {
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            java.lang.String r1 = "权限管理"
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.g(r6, r1)
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            java.lang.String r2 = "应用权限"
            android.view.accessibility.AccessibilityNodeInfo r1 = r1.g(r6, r2)
            com.acse.ottn.b r2 = com.acse.ottn.b.c()
            java.lang.String r3 = "权限"
            android.view.accessibility.AccessibilityNodeInfo r6 = r2.g(r6, r3)
            r2 = 300(0x12c, double:1.48E-321)
            java.lang.String r4 = "battery_white"
            java.lang.String r5 = "LocationManager"
            if (r0 == 0) goto L43
            java.lang.String r6 = "openOppoLocationManage nodeInfo is not null"
            com.acse.ottn.h2.a(r5, r6)
            com.acse.ottn.n3 r6 = com.acse.ottn.n3.a()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r6.a(r4, r1)
            com.acse.ottn.b r6 = com.acse.ottn.b.c()
            r6.g(r0)
            com.acse.ottn.b r6 = com.acse.ottn.b.c()
            r6.a(r2)
            return
        L43:
            if (r1 == 0) goto L62
            java.lang.String r6 = "openOppoLocationManage nodeInfo1 is not null"
            com.acse.ottn.h2.a(r5, r6)
            com.acse.ottn.n3 r6 = com.acse.ottn.n3.a()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r6.a(r4, r0)
            com.acse.ottn.b r6 = com.acse.ottn.b.c()
            r6.g(r1)
            com.acse.ottn.b r6 = com.acse.ottn.b.c()
            r6.a(r2)
            return
        L62:
            if (r6 == 0) goto L80
            java.lang.String r0 = "openOppoLocationManage nodeInfo2 is not null"
            com.acse.ottn.h2.a(r5, r0)
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.a(r4, r1)
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            r0.g(r6)
            com.acse.ottn.b r6 = com.acse.ottn.b.c()
            r6.a(r2)
        L80:
            return
    }

    public static void l(android.accessibilityservice.AccessibilityService r4) {
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            java.lang.String r1 = "始终允许"
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.h(r4, r1)
            if (r0 == 0) goto L33
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            r2 = 500(0x1f4, double:2.47E-321)
            r1.a(r2)
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            r1.g(r0)
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            java.lang.String r1 = "确定"
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.h(r4, r1)
            if (r0 == 0) goto L2f
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            r1.g(r0)
        L2f:
            r0 = 4
            b(r4, r0)
        L33:
            return
    }

    public static void m(android.accessibilityservice.AccessibilityService r18) {
            r0 = r18
            java.lang.String r1 = "startOppoLocation"
            java.lang.String r2 = "LocationManager"
            com.acse.ottn.h2.a(r2, r1)
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            r3 = 500(0x1f4, double:2.47E-321)
            r1.a(r3)
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            java.lang.String r5 = "位置信息"
            android.view.accessibility.AccessibilityNodeInfo r1 = r1.g(r0, r5)
            java.lang.String r5 = com.acse.ottn.n4.b()
            j(r0)
            java.lang.String r6 = "startOppoLocation nodeInfo2 is not null"
            java.lang.String r7 = "oneplus"
            java.lang.String r8 = "startOppoLocation nodeInfo1 is not null"
            java.lang.String r9 = "允许"
            java.lang.String r10 = "始终允许"
            java.lang.String r11 = "battery_white"
            r12 = 300(0x12c, double:1.48E-321)
            r14 = 3
            if (r1 == 0) goto L161
            java.lang.String r15 = "startOppoLocation nodeInfo is not null"
            com.acse.ottn.h2.a(r2, r15)
            com.acse.ottn.b r15 = com.acse.ottn.b.c()
            r15.g(r1)
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            r1.a(r3)
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            com.acse.ottn.service.ShopHelperService r15 = com.acse.ottn.service.ShopHelperService.mService
            android.view.accessibility.AccessibilityNodeInfo r1 = r1.j(r15, r10)
            com.acse.ottn.b r10 = com.acse.ottn.b.c()
            android.view.accessibility.AccessibilityNodeInfo r9 = r10.j(r0, r9)
            java.lang.String r10 = "   current y="
            java.lang.String r15 = "current x="
            r17 = 0
            if (r1 == 0) goto L81
            com.acse.ottn.h2.a(r2, r8)
            com.acse.ottn.b r6 = com.acse.ottn.b.c()
            r6.g(r1)
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            r1.a(r12)
            boolean r1 = r7.equals(r5)
            if (r1 == 0) goto L7c
            b(r0, r14)
            goto Le7
        L7c:
            r1 = 2
            b(r0, r1)
            goto Le7
        L81:
            r1 = 2
            if (r9 == 0) goto L99
            com.acse.ottn.h2.a(r2, r6)
            com.acse.ottn.b r5 = com.acse.ottn.b.c()
            r5.g(r9)
            com.acse.ottn.b r5 = com.acse.ottn.b.c()
            r5.a(r12)
            b(r0, r1)
            goto Le7
        L99:
            int r1 = android.os.Build.VERSION.SDK_INT
            r5 = 35
            if (r1 < r5) goto Le7
            java.lang.String r1 = "current oppo android version 15"
            com.acse.ottn.h2.a(r2, r1)
            java.util.TimerTask r1 = com.acse.ottn.f2.f2319d
            if (r1 == 0) goto Lad
            r1.cancel()
            com.acse.ottn.f2.f2319d = r17
        Lad:
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            r1.a(r3)
            int r1 = com.acse.ottn.n4.c(r0)
            int r5 = com.acse.ottn.n4.b(r0)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r15)
            r16 = 2
            int r1 = r1 / 2
            r6.append(r1)
            r6.append(r10)
            int r5 = r5 / r14
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            com.acse.ottn.h2.a(r2, r6)
            com.acse.ottn.b r6 = com.acse.ottn.b.c()
            int r5 = r5 * 11
            int r5 = r5 / 10
            r6.a(r0, r1, r5)
            b(r0, r14)
        Le7:
            int r1 = android.os.Build.VERSION.SDK_INT
            r5 = 34
            if (r1 != r5) goto L152
            java.lang.String r1 = "current oppo android version 14"
            com.acse.ottn.h2.a(r2, r1)
            java.util.TimerTask r1 = com.acse.ottn.f2.f2319d
            if (r1 == 0) goto Lfb
            r1.cancel()
            com.acse.ottn.f2.f2319d = r17
        Lfb:
            int r1 = com.acse.ottn.n4.c(r0)
            int r5 = com.acse.ottn.n4.b(r0)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r15)
            r16 = 2
            int r1 = r1 / 2
            r6.append(r1)
            r6.append(r10)
            int r7 = r5 / 2
            int r8 = r7 + 100
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            com.acse.ottn.h2.a(r2, r6)
            com.acse.ottn.b r2 = com.acse.ottn.b.c()
            int r5 = r5 / 10
            int r7 = r7 - r5
            r2.a(r0, r1, r7)
            com.acse.ottn.b r2 = com.acse.ottn.b.c()
            r2.a(r3)
            com.acse.ottn.g2 r2 = com.acse.ottn.g2.a()
            boolean r2 = r2.a(r0)
            if (r2 != 0) goto L145
            com.acse.ottn.b r2 = com.acse.ottn.b.c()
            r2.a(r0, r1, r8)
        L145:
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.a(r11, r2)
            b(r0, r14)
            return
        L152:
            java.lang.String r0 = "open location is faile"
            com.acse.ottn.h2.a(r2, r0)
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.a(r11, r1)
            return
        L161:
            java.lang.String r1 = "startOppoLocation start"
            com.acse.ottn.h2.a(r2, r1)
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            android.view.accessibility.AccessibilityNodeInfo r1 = r1.j(r0, r10)
            com.acse.ottn.b r3 = com.acse.ottn.b.c()
            android.view.accessibility.AccessibilityNodeInfo r3 = r3.j(r0, r9)
            if (r1 == 0) goto L1a1
            com.acse.ottn.h2.a(r2, r8)
            com.acse.ottn.b r2 = com.acse.ottn.b.c()
            r2.g(r1)
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            r1.a(r12)
            boolean r1 = r7.equals(r5)
            if (r1 == 0) goto L19c
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.a(r11, r2)
            b(r0, r14)
            return
        L19c:
            r1 = 2
            b(r0, r1)
            return
        L1a1:
            r1 = 2
            if (r3 == 0) goto L1b9
            com.acse.ottn.h2.a(r2, r6)
            com.acse.ottn.b r2 = com.acse.ottn.b.c()
            r2.g(r3)
            com.acse.ottn.b r2 = com.acse.ottn.b.c()
            r2.a(r12)
            b(r0, r1)
            return
        L1b9:
            java.lang.String r1 = "click oppo x y"
            com.acse.ottn.h2.a(r2, r1)
            android.view.accessibility.AccessibilityNodeInfo r1 = r0.getRootInActiveWindow()
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r1.getBoundsInParent(r3)
            int r1 = r3.right
            int r3 = r3.bottom
            int r4 = r1 / 2
            int r5 = r3 / 2
            int r6 = r3 / 8
            int r5 = r5 - r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "x="
            r6.append(r7)
            r6.append(r1)
            java.lang.String r1 = "   y="
            r6.append(r1)
            r6.append(r3)
            java.lang.String r1 = "   x1 ="
            r6.append(r1)
            r6.append(r4)
            java.lang.String r1 = "   y1="
            r6.append(r1)
            r6.append(r5)
            java.lang.String r1 = r6.toString()
            com.acse.ottn.h2.a(r2, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 24
            if (r1 < r2) goto L20e
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            r1.a(r0, r4, r5)
        L20e:
            b(r0, r14)
            return
    }
}
