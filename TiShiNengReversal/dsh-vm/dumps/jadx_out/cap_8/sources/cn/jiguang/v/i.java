package cn.jiguang.v;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class i {
    private static final java.lang.String a = null;

    /* renamed from: b, reason: collision with root package name */
    private static final java.lang.String f1520b = null;

    /* renamed from: c, reason: collision with root package name */
    private static java.util.concurrent.atomic.AtomicBoolean f1521c;

    /* renamed from: d, reason: collision with root package name */
    private static long f1522d;

    /* renamed from: e, reason: collision with root package name */
    private static java.lang.Boolean f1523e;

    /* renamed from: f, reason: collision with root package name */
    private static java.util.LinkedList<java.lang.String> f1524f;

    private static class a extends cn.jiguang.au.b {
        private android.content.Context a;

        a(android.content.Context r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                java.lang.String r1 = "JLimitConfig"
                r0.f668h = r1
                return
        }

        private int a(android.content.Context r12) {
                r11 = this;
                r0 = -1
                java.lang.String r1 = cn.jiguang.v.a.a(r12)     // Catch: java.lang.Throwable -> L117
                boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L117
                java.lang.String r3 = "JSDKDeveloperIdLimitHelper"
                if (r2 == 0) goto L13
                java.lang.String r12 = "request bannedConfig failed because can't get appKey"
                cn.jiguang.w.f.i(r3, r12)     // Catch: java.lang.Throwable -> L117
                return r0
            L13:
                java.util.LinkedList r2 = cn.jiguang.v.i.d()     // Catch: java.lang.Throwable -> L117
                cn.jiguang.av.v.a(r12, r2)     // Catch: java.lang.Throwable -> L117
                java.util.LinkedList r2 = cn.jiguang.v.i.d()     // Catch: java.lang.Throwable -> L117
                java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L117
            L22:
                boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L117
                if (r4 == 0) goto L117
                java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L117
                r5 = r4
                java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L117
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L117
                r4.<init>()     // Catch: java.lang.Throwable -> L117
                cn.jiguang.internal.ActionManager.getInstance()     // Catch: java.lang.Throwable -> L117
                boolean r6 = cn.jiguang.internal.ActionManager.wrapSdkTypeVersionInfo(r4)     // Catch: java.lang.Throwable -> L117
                if (r6 != 0) goto L43
                java.lang.String r12 = "request bannedConfig wrapSdkTypeVersionInfo is false"
                cn.jiguang.w.f.i(r3, r12)     // Catch: java.lang.Throwable -> L117
                return r0
            L43:
                int r6 = r4.length()     // Catch: java.lang.Throwable -> L117
                if (r6 <= 0) goto L55
                java.lang.String r6 = "appkey"
                r4.put(r6, r1)     // Catch: java.lang.Throwable -> L117
                java.lang.String r6 = "platform"
                java.lang.String r7 = "android"
                r4.put(r6, r7)     // Catch: java.lang.Throwable -> L117
            L55:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L117
                r6.<init>()     // Catch: java.lang.Throwable -> L117
                java.lang.String r7 = "request url: "
                r6.append(r7)     // Catch: java.lang.Throwable -> L117
                r6.append(r5)     // Catch: java.lang.Throwable -> L117
                java.lang.String r7 = ", param json:"
                r6.append(r7)     // Catch: java.lang.Throwable -> L117
                java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L117
                r6.append(r7)     // Catch: java.lang.Throwable -> L117
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L117
                cn.jiguang.w.f.c(r3, r6)     // Catch: java.lang.Throwable -> L117
                boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L117
                if (r6 == 0) goto L81
                java.lang.String r12 = "can't get url, give up upload"
                cn.jiguang.w.f.i(r3, r12)     // Catch: java.lang.Throwable -> L117
                return r0
            L81:
                java.lang.String r6 = r4.toString()     // Catch: java.lang.Throwable -> L117
                r9 = 3
                r10 = 3
                r8 = 0
                r7 = r12
                cn.jiguang.y.h r12 = cn.jiguang.y.c.a(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L117
                int r5 = r12.a()     // Catch: java.lang.Throwable -> L117
                java.lang.String r6 = r12.b()     // Catch: java.lang.Throwable -> L117
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L117
                r8.<init>()     // Catch: java.lang.Throwable -> L117
                java.lang.String r9 = "code: "
                r8.append(r9)     // Catch: java.lang.Throwable -> L117
                r8.append(r5)     // Catch: java.lang.Throwable -> L117
                java.lang.String r5 = ", responseBody:"
                r8.append(r5)     // Catch: java.lang.Throwable -> L117
                r8.append(r6)     // Catch: java.lang.Throwable -> L117
                java.lang.String r5 = r8.toString()     // Catch: java.lang.Throwable -> L117
                cn.jiguang.w.f.c(r3, r5)     // Catch: java.lang.Throwable -> L117
                int r5 = r12.a()     // Catch: java.lang.Throwable -> L117
                r8 = -3
                if (r5 == r8) goto L115
                r8 = 3006(0xbbe, float:4.212E-42)
                if (r5 == r8) goto L10e
                java.lang.String r8 = "upload"
                if (r5 == r0) goto Lee
                if (r5 == 0) goto Lde
                java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L117
                r12.<init>()     // Catch: java.lang.Throwable -> L117
                r12.append(r8)     // Catch: java.lang.Throwable -> L117
                java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L117
                r12.append(r4)     // Catch: java.lang.Throwable -> L117
                java.lang.String r4 = " failed"
                r12.append(r4)     // Catch: java.lang.Throwable -> L117
                java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L117
            Lda:
                cn.jiguang.w.f.c(r3, r12)     // Catch: java.lang.Throwable -> L117
                goto L112
            Lde:
                boolean r12 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L117
                if (r12 != 0) goto Lec
                org.json.JSONObject r12 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L117
                r12.<init>(r6)     // Catch: java.lang.Throwable -> L117
                cn.jiguang.v.i.a(r7, r12)     // Catch: java.lang.Throwable -> L117
            Lec:
                r12 = 0
                return r12
            Lee:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L117
                r5.<init>()     // Catch: java.lang.Throwable -> L117
                r5.append(r8)     // Catch: java.lang.Throwable -> L117
                java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L117
                r5.append(r4)     // Catch: java.lang.Throwable -> L117
                java.lang.String r4 = " error:"
                r5.append(r4)     // Catch: java.lang.Throwable -> L117
                java.lang.String r12 = r12.b()     // Catch: java.lang.Throwable -> L117
                r5.append(r12)     // Catch: java.lang.Throwable -> L117
                java.lang.String r12 = r5.toString()     // Catch: java.lang.Throwable -> L117
                goto Lda
            L10e:
                r12 = 0
                cn.jiguang.v.i.a(r12)     // Catch: java.lang.Throwable -> L117
            L112:
                r12 = r7
                goto L22
            L115:
                r12 = -2
                return r12
            L117:
                return r0
        }

        @Override // cn.jiguang.au.b
        public void a() {
                r4 = this;
                java.lang.String r0 = "start request sdk limit config"
                java.lang.String r1 = "JSDKDeveloperIdLimitHelper"
                cn.jiguang.w.f.c(r1, r0)
                android.content.Context r0 = r4.a
                int r0 = r4.a(r0)
                if (r0 == 0) goto L23
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "request limit config failed, code: "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                cn.jiguang.w.f.i(r1, r0)
            L23:
                return
        }
    }

    static {
            r0 = 40
            byte[] r0 = new byte[r0]
            r0 = {x003e: FILL_ARRAY_DATA , data: [121, 68, 84, 105, 123, 44, 62, 31, 67, 118, 102, 112, 120, 87, 14, 115, 120, 99, 98, 88, 14, 122, 102, 57, 103, 1, 15, 111, 109, 100, 98, 89, 79, 119, 37, 117, 121, 85, 67, 114} // fill-array
            java.lang.String r0 = cn.jiguang.av.k.b(r0)
            cn.jiguang.v.i.a = r0
            r1 = 45
            byte[] r1 = new byte[r1]
            r1 = {x0056: FILL_ARRAY_DATA , data: [126, 101, 68, 80, 106, 50, 57, 62, 83, 79, 119, 110, 127, 118, 29, 73, 105, 126, 32, 63, 90, 80, 108, 123, 126, 63, 83, 78, 54, 126, 39, 62, 70, 69, 107, 123, 127, 126, 94, 13, 122, 96, 115, 114, 91} // fill-array
            java.lang.String r1 = cn.jiguang.av.k.b(r1)
            cn.jiguang.v.i.f1520b = r1
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r3 = 0
            r2.<init>(r3)
            cn.jiguang.v.i.f1521c = r2
            r2 = 0
            cn.jiguang.v.i.f1522d = r2
            r2 = 0
            cn.jiguang.v.i.f1523e = r2
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            cn.jiguang.v.i.f1524f = r2
            r2.clear()
            java.util.LinkedList<java.lang.String> r2 = cn.jiguang.v.i.f1524f
            r2.add(r0)
            java.util.LinkedList<java.lang.String> r0 = cn.jiguang.v.i.f1524f
            r0.add(r1)
            return
    }

    public i() {
            r1 = this;
            r1.<init>()
            return
    }

    static /* synthetic */ java.lang.Boolean a(java.lang.Boolean r0) {
            cn.jiguang.v.i.f1523e = r0
            return r0
    }

    static /* synthetic */ void a(android.content.Context r0, org.json.JSONObject r1) {
            b(r0, r1)
            return
    }

    private static void a(android.content.Context r6, boolean r7, long r8) {
            b(r6, r7, r8)
            cn.jiguang.v.i.f1522d = r8
            java.util.concurrent.atomic.AtomicBoolean r8 = cn.jiguang.v.i.f1521c
            boolean r8 = r8.get()
            java.lang.String r9 = "JSDKDeveloperIdLimitHelper"
            if (r8 == r7) goto L42
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "sdk limit status changed, update status, sdkLimit: "
            r8.append(r0)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            cn.jiguang.w.f.c(r9, r8)
            if (r7 != 0) goto L2c
            java.util.concurrent.atomic.AtomicBoolean r8 = new java.util.concurrent.atomic.AtomicBoolean
            r8.<init>(r7)
            cn.jiguang.v.i.f1521c = r8
        L2c:
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r8 = "sdk_banned"
            r4.putBoolean(r8, r7)
            r8 = 0
            java.lang.Object[] r5 = new java.lang.Object[r8]
            java.lang.String r1 = ""
            r2 = 81
            r3 = 0
            r0 = r6
            cn.jiguang.api.JCoreManager.onEvent(r0, r1, r2, r3, r4, r5)
        L42:
            if (r7 == 0) goto L61
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "[key-step]You use the special sdk type is "
            r6.append(r8)
            int r8 = b()
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            cn.jiguang.w.f.d(r9, r6)
            java.lang.String r6 = "[key-step]You use the special sdk, but it is limited now. If you want to enable it, please contact us."
            cn.jiguang.w.f.l(r9, r6)
        L61:
            java.util.concurrent.atomic.AtomicBoolean r6 = new java.util.concurrent.atomic.AtomicBoolean
            r6.<init>(r7)
            cn.jiguang.v.i.f1521c = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "sdk limit status, limit: "
            r6.append(r8)
            r6.append(r7)
            java.lang.String r7 = ", nextTime: "
            r6.append(r7)
            long r7 = cn.jiguang.v.i.f1522d
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            cn.jiguang.w.f.f(r9, r6)
            return
    }

    public static boolean a() {
            r0 = 0
            android.content.Context r0 = cn.jiguang.av.c.a(r0)     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L48
            boolean r1 = cn.jiguang.av.b.a()     // Catch: java.lang.Throwable -> L4a
            if (r1 == 0) goto L48
            cn.jiguang.al.c r1 = cn.jiguang.al.c.a()     // Catch: java.lang.Throwable -> L4a
            boolean r1 = r1.a(r0)     // Catch: java.lang.Throwable -> L4a
            if (r1 != 0) goto L18
            goto L48
        L18:
            java.lang.String r1 = cn.jiguang.v.a.a(r0)     // Catch: java.lang.Throwable -> L4a
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L4a
            if (r1 == 0) goto L29
            java.util.concurrent.atomic.AtomicBoolean r0 = cn.jiguang.v.i.f1521c     // Catch: java.lang.Throwable -> L4a
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L4a
            return r0
        L29:
            int r1 = cn.jiguang.a.a.f237d     // Catch: java.lang.Throwable -> L4a
            int r2 = cn.jiguang.internal.JConstants.SDK_VERSION_INT     // Catch: java.lang.Throwable -> L4a
            if (r1 != r2) goto L61
            java.lang.Boolean r1 = cn.jiguang.v.i.f1523e     // Catch: java.lang.Throwable -> L4a
            if (r1 != 0) goto L61
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L4a
            r1.<init>()     // Catch: java.lang.Throwable -> L4a
            boolean r1 = cn.jiguang.internal.ActionManager.wrapSdkTypeVersionInfo(r1)     // Catch: java.lang.Throwable -> L4a
            if (r1 == 0) goto L43
            boolean r0 = a(r0)     // Catch: java.lang.Throwable -> L4a
            return r0
        L43:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L4a
            cn.jiguang.v.i.f1523e = r0     // Catch: java.lang.Throwable -> L4a
            goto L61
        L48:
            r0 = 0
            return r0
        L4a:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "isSDKLimit error:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "JSDKDeveloperIdLimitHelper"
            cn.jiguang.w.f.c(r1, r0)
        L61:
            java.util.concurrent.atomic.AtomicBoolean r0 = cn.jiguang.v.i.f1521c
            boolean r0 = r0.get()
            return r0
    }

    public static boolean a(int r2) {
            r0 = 1
            if (r2 == r0) goto Lf
            r1 = 4
            if (r2 == r1) goto Lf
            r1 = 5
            if (r2 == r1) goto Lf
            r1 = 3
            if (r2 != r1) goto Ld
            goto Lf
        Ld:
            r2 = 0
            return r2
        Lf:
            return r0
    }

    public static synchronized boolean a(android.content.Context r6) {
            java.lang.Class<cn.jiguang.v.i> r0 = cn.jiguang.v.i.class
            monitor-enter(r0)
            java.lang.Boolean r1 = cn.jiguang.v.i.f1523e     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto L11
            java.util.concurrent.atomic.AtomicBoolean r6 = cn.jiguang.v.i.f1521c     // Catch: java.lang.Throwable -> Lf
            boolean r6 = r6.get()     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r6
        Lf:
            r6 = move-exception
            goto L68
        L11:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Lf
            cn.jiguang.v.i.f1523e = r1     // Catch: java.lang.Throwable -> Lf
            c(r6)     // Catch: java.lang.Throwable -> Lf
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lf
            long r3 = cn.jiguang.v.i.f1522d     // Catch: java.lang.Throwable -> Lf
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L30
            java.lang.String r1 = "FUTURE_TASK"
            cn.jiguang.v.i$a r2 = new cn.jiguang.v.i$a     // Catch: java.lang.Throwable -> Lf
            r2.<init>(r6)     // Catch: java.lang.Throwable -> Lf
            r3 = 0
            r6 = 0
            cn.jiguang.au.d.a(r1, r2, r3, r6)     // Catch: java.lang.Throwable -> Lf
            goto L60
        L30:
            java.util.concurrent.atomic.AtomicBoolean r6 = cn.jiguang.v.i.f1521c     // Catch: java.lang.Throwable -> Lf
            boolean r6 = r6.get()     // Catch: java.lang.Throwable -> Lf
            if (r6 == 0) goto L59
            java.lang.String r6 = "JSDKDeveloperIdLimitHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r2 = "[key-step]You use the special sdk type is "
            r1.append(r2)     // Catch: java.lang.Throwable -> Lf
            int r2 = b()     // Catch: java.lang.Throwable -> Lf
            r1.append(r2)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lf
            cn.jiguang.w.f.d(r6, r1)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r6 = "JSDKDeveloperIdLimitHelper"
            java.lang.String r1 = "[key-step]You use the special sdk, but it is limited now. If you want to enable it, please contact us."
            cn.jiguang.w.f.l(r6, r1)     // Catch: java.lang.Throwable -> Lf
        L59:
            java.lang.String r6 = "JSDKDeveloperIdLimitHelper"
            java.lang.String r1 = "request sdk limit config not time up, not request"
            cn.jiguang.w.f.c(r6, r1)     // Catch: java.lang.Throwable -> Lf
        L60:
            java.util.concurrent.atomic.AtomicBoolean r6 = cn.jiguang.v.i.f1521c     // Catch: java.lang.Throwable -> Lf
            boolean r6 = r6.get()     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r6
        L68:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r6
    }

    public static int b() {
            java.lang.String r0 = cn.jiguang.a.a.f238e
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            return r0
    }

    public static void b(android.content.Context r6) {
            java.lang.String r0 = "JSDKDeveloperIdLimitHelper"
            if (r6 != 0) goto La
            java.lang.String r6 = "updateImmediately failed: context is null"
            cn.jiguang.w.f.i(r0, r6)
            return
        La:
            java.lang.Boolean r1 = cn.jiguang.v.i.f1523e
            if (r1 != 0) goto L1b
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = cn.jiguang.v.i.f1522d
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L19
            goto L1b
        L19:
            r1 = 0
            goto L1c
        L1b:
            r1 = 1
        L1c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "updateImmediately: needReset="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r3 = ", gIsConfigRequested="
            r2.append(r3)
            java.lang.Boolean r3 = cn.jiguang.v.i.f1523e
            r2.append(r3)
            java.lang.String r3 = ", gNextReqTime="
            r2.append(r3)
            long r3 = cn.jiguang.v.i.f1522d
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            cn.jiguang.w.f.c(r0, r2)
            if (r1 == 0) goto L5d
            java.lang.String r1 = "Reset request status and continue update"
            cn.jiguang.w.f.c(r0, r1)
            r0 = 0
            cn.jiguang.v.i.f1523e = r0
            r0 = 0
            cn.jiguang.v.i.f1522d = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = cn.jiguang.v.i.f1521c
            boolean r0 = r0.get()
            long r1 = cn.jiguang.v.i.f1522d
            a(r6, r0, r1)
        L5d:
            a()
            return
    }

    private static void b(android.content.Context r9, org.json.JSONObject r10) {
            java.lang.String r0 = "JSDKDeveloperIdLimitHelper"
            if (r10 != 0) goto L5
            return
        L5:
            java.lang.String r1 = "code"
            int r1 = r10.optInt(r1)     // Catch: java.lang.Throwable -> L51
            r2 = 1
            if (r1 != r2) goto Lf
            goto L10
        Lf:
            r2 = 0
        L10:
            java.lang.String r1 = "nexttime"
            r3 = 43200(0xa8c0, double:2.13436E-319)
            long r3 = r10.optLong(r1, r3)     // Catch: java.lang.Throwable -> L51
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L51
            r10.<init>()     // Catch: java.lang.Throwable -> L51
            java.lang.String r1 = "from server sdk limit status: "
            r10.append(r1)     // Catch: java.lang.Throwable -> L51
            r10.append(r2)     // Catch: java.lang.Throwable -> L51
            java.lang.String r1 = ", next request time: "
            r10.append(r1)     // Catch: java.lang.Throwable -> L51
            r10.append(r3)     // Catch: java.lang.Throwable -> L51
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L51
            cn.jiguang.w.f.c(r0, r10)     // Catch: java.lang.Throwable -> L51
            r5 = 0
            int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r10 > 0) goto L3c
            r3 = r5
        L3c:
            r5 = 86400(0x15180, double:4.26873E-319)
            int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r10 < 0) goto L44
            r3 = r5
        L44:
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L51
            r7 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r7
            long r5 = r5 + r3
            a(r9, r2, r5)     // Catch: java.lang.Throwable -> L51
            return
        L51:
            r9 = move-exception
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r1 = "parse sdk limit config failed, "
            r10.append(r1)
            java.lang.String r9 = r9.getMessage()
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            cn.jiguang.w.f.i(r0, r9)
            return
    }

    private static void b(android.content.Context r2, boolean r3, long r4) {
            java.lang.String r0 = "JSDKDeveloperIdLimitHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f
            r1.<init>()     // Catch: java.lang.Throwable -> L3f
            r1.append(r3)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r3 = ","
            r1.append(r3)     // Catch: java.lang.Throwable -> L3f
            r1.append(r4)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L3f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f
            r4.<init>()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r5 = "save sdk limit status: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L3f
            r4.append(r3)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L3f
            cn.jiguang.w.f.c(r0, r4)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = "cn.jiguang.prefs"
            r5 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r4, r5)     // Catch: java.lang.Throwable -> L3f
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = "sdk_limit_status"
            android.content.SharedPreferences$Editor r2 = r2.putString(r4, r3)     // Catch: java.lang.Throwable -> L3f
            r2.apply()     // Catch: java.lang.Throwable -> L3f
            return
        L3f:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "[saveSdkLimitStatus] parse json error, "
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jiguang.w.f.i(r0, r2)
            return
    }

    public static java.lang.Integer c() {
            r0 = 0
            return r0
    }

    private static boolean c(android.content.Context r7) {
            java.lang.String r0 = "JSDKDeveloperIdLimitHelper"
            r1 = 0
            java.lang.String r2 = "cn.jiguang.prefs"
            android.content.SharedPreferences r7 = r7.getSharedPreferences(r2, r1)     // Catch: java.lang.Throwable -> L64
            java.lang.String r2 = "sdk_limit_status"
            java.lang.String r3 = ""
            java.lang.String r7 = r7.getString(r2, r3)     // Catch: java.lang.Throwable -> L64
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L64
            r2.<init>()     // Catch: java.lang.Throwable -> L64
            java.lang.String r3 = "local sdk limit config: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L64
            r2.append(r7)     // Catch: java.lang.Throwable -> L64
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L64
            cn.jiguang.w.f.f(r0, r2)     // Catch: java.lang.Throwable -> L64
            boolean r2 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L64
            if (r2 != 0) goto L79
            java.lang.String r2 = ","
            java.lang.String[] r7 = r7.split(r2)     // Catch: java.lang.Throwable -> L64
            r2 = r7[r1]     // Catch: java.lang.Throwable -> L64
            boolean r2 = java.lang.Boolean.parseBoolean(r2)     // Catch: java.lang.Throwable -> L64
            r3 = 1
            r7 = r7[r3]     // Catch: java.lang.Throwable -> L64
            long r4 = java.lang.Long.parseLong(r7)     // Catch: java.lang.Throwable -> L64
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L64
            r7.<init>()     // Catch: java.lang.Throwable -> L64
            java.lang.String r6 = "local limit config, isLimit: "
            r7.append(r6)     // Catch: java.lang.Throwable -> L64
            r7.append(r2)     // Catch: java.lang.Throwable -> L64
            java.lang.String r6 = ", nextReqTime: "
            r7.append(r6)     // Catch: java.lang.Throwable -> L64
            r7.append(r4)     // Catch: java.lang.Throwable -> L64
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L64
            cn.jiguang.w.f.c(r0, r7)     // Catch: java.lang.Throwable -> L64
            cn.jiguang.v.i.f1522d = r4     // Catch: java.lang.Throwable -> L64
            java.util.concurrent.atomic.AtomicBoolean r7 = new java.util.concurrent.atomic.AtomicBoolean     // Catch: java.lang.Throwable -> L64
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L64
            cn.jiguang.v.i.f1521c = r7     // Catch: java.lang.Throwable -> L64
            return r3
        L64:
            r7 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "read config json from cache failed !! error:"
            r2.append(r3)
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            cn.jiguang.w.f.i(r0, r7)
        L79:
            return r1
    }

    static /* synthetic */ java.util.LinkedList d() {
            java.util.LinkedList<java.lang.String> r0 = cn.jiguang.v.i.f1524f
            return r0
    }
}
