package cn.jiguang.v;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class h {
    private static final java.lang.String a = null;

    /* renamed from: b, reason: collision with root package name */
    private static final java.lang.String f1512b = null;

    /* renamed from: c, reason: collision with root package name */
    private static java.util.concurrent.atomic.AtomicBoolean f1513c;

    /* renamed from: d, reason: collision with root package name */
    private static long f1514d;

    /* renamed from: e, reason: collision with root package name */
    private static java.lang.Boolean f1515e;

    /* renamed from: f, reason: collision with root package name */
    private static java.util.LinkedList<java.lang.String> f1516f;

    /* renamed from: g, reason: collision with root package name */
    private static java.lang.Boolean f1517g;

    /* renamed from: h, reason: collision with root package name */
    private static int f1518h;

    /* renamed from: i, reason: collision with root package name */
    private static int f1519i;

    private static class a extends cn.jiguang.au.b {
        private android.content.Context a;

        a(android.content.Context r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                java.lang.String r1 = "JBannedConfig"
                r0.f668h = r1
                return
        }

        private int a(android.content.Context r16) {
                r15 = this;
                r2 = r16
                java.lang.String r6 = "stoken"
                r7 = -1
                java.lang.String r8 = cn.jiguang.v.a.a(r2)     // Catch: java.lang.Throwable -> L155
                boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L155
                java.lang.String r9 = "JSDKBannedHelper"
                if (r0 == 0) goto L17
                java.lang.String r0 = "request bannedConfig failed because can't get appKey"
                cn.jiguang.w.f.i(r9, r0)     // Catch: java.lang.Throwable -> L155
                return r7
            L17:
                cn.jiguang.e.a r0 = cn.jiguang.e.a.M()     // Catch: java.lang.Throwable -> L155
                java.lang.Object r0 = cn.jiguang.e.b.a(r2, r0)     // Catch: java.lang.Throwable -> L155
                java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L155
                long r10 = r0.longValue()     // Catch: java.lang.Throwable -> L155
                java.util.LinkedList r0 = cn.jiguang.v.h.d()     // Catch: java.lang.Throwable -> L155
                cn.jiguang.av.v.a(r2, r0)     // Catch: java.lang.Throwable -> L155
                java.util.LinkedList r0 = cn.jiguang.v.h.d()     // Catch: java.lang.Throwable -> L155
                java.util.Iterator r12 = r0.iterator()     // Catch: java.lang.Throwable -> L155
            L34:
                boolean r0 = r12.hasNext()     // Catch: java.lang.Throwable -> L155
                if (r0 == 0) goto L155
                java.lang.Object r0 = r12.next()     // Catch: java.lang.Throwable -> L155
                java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L155
                java.util.UUID r1 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L155
                java.lang.String r13 = r1.toString()     // Catch: java.lang.Throwable -> L155
                org.json.JSONObject r14 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L155
                r14.<init>()     // Catch: java.lang.Throwable -> L155
                java.lang.String r1 = "appkey"
                r14.put(r1, r8)     // Catch: java.lang.Throwable -> L155
                java.lang.String r1 = "uid"
                r14.put(r1, r10)     // Catch: java.lang.Throwable -> L155
                r14.put(r6, r13)     // Catch: java.lang.Throwable -> L155
                java.lang.String r1 = "ver"
                r3 = 2
                r14.put(r1, r3)     // Catch: java.lang.Throwable -> L155
                java.lang.String r1 = "platform"
                java.lang.String r3 = "a"
                r14.put(r1, r3)     // Catch: java.lang.Throwable -> L155
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L155
                r1.<init>()     // Catch: java.lang.Throwable -> L155
                java.lang.String r3 = "request url: "
                r1.append(r3)     // Catch: java.lang.Throwable -> L155
                r1.append(r0)     // Catch: java.lang.Throwable -> L155
                java.lang.String r3 = ", param json:"
                r1.append(r3)     // Catch: java.lang.Throwable -> L155
                java.lang.String r3 = r14.toString()     // Catch: java.lang.Throwable -> L155
                r1.append(r3)     // Catch: java.lang.Throwable -> L155
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L155
                cn.jiguang.w.f.c(r9, r1)     // Catch: java.lang.Throwable -> L155
                boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L155
                if (r1 == 0) goto L94
                java.lang.String r0 = "can't get url, give up upload"
                cn.jiguang.w.f.i(r9, r0)     // Catch: java.lang.Throwable -> L155
                return r7
            L94:
                java.lang.String r1 = r14.toString()     // Catch: java.lang.Throwable -> L155
                r4 = 3
                r5 = 3
                r3 = 0
                cn.jiguang.y.h r0 = cn.jiguang.y.c.a(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L155
                int r1 = r0.a()     // Catch: java.lang.Throwable -> L155
                java.lang.String r3 = r0.b()     // Catch: java.lang.Throwable -> L155
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L155
                r4.<init>()     // Catch: java.lang.Throwable -> L155
                java.lang.String r5 = "code: "
                r4.append(r5)     // Catch: java.lang.Throwable -> L155
                r4.append(r1)     // Catch: java.lang.Throwable -> L155
                java.lang.String r1 = ", responseBody:"
                r4.append(r1)     // Catch: java.lang.Throwable -> L155
                r4.append(r3)     // Catch: java.lang.Throwable -> L155
                java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L155
                cn.jiguang.w.f.c(r9, r1)     // Catch: java.lang.Throwable -> L155
                int r1 = r0.a()     // Catch: java.lang.Throwable -> L155
                r4 = -3
                if (r1 == r4) goto L153
                r4 = 3006(0xbbe, float:4.212E-42)
                if (r1 == r4) goto L14d
                java.lang.String r4 = "upload"
                if (r1 == r7) goto L12d
                if (r1 == 0) goto Lf1
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L155
                r0.<init>()     // Catch: java.lang.Throwable -> L155
                r0.append(r4)     // Catch: java.lang.Throwable -> L155
                java.lang.String r1 = r14.toString()     // Catch: java.lang.Throwable -> L155
                r0.append(r1)     // Catch: java.lang.Throwable -> L155
                java.lang.String r1 = " failed"
                r0.append(r1)     // Catch: java.lang.Throwable -> L155
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L155
            Lec:
                cn.jiguang.w.f.c(r9, r0)     // Catch: java.lang.Throwable -> L155
                goto L34
            Lf1:
                boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L155
                if (r0 != 0) goto L12b
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L155
                r0.<init>(r3)     // Catch: java.lang.Throwable -> L155
                java.lang.String r0 = r0.optString(r6)     // Catch: java.lang.Throwable -> L155
                boolean r1 = r13.equals(r0)     // Catch: java.lang.Throwable -> L155
                if (r1 == 0) goto L10f
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L155
                r0.<init>(r3)     // Catch: java.lang.Throwable -> L155
                cn.jiguang.v.h.a(r2, r0)     // Catch: java.lang.Throwable -> L155
                goto L12b
            L10f:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L155
                r1.<init>()     // Catch: java.lang.Throwable -> L155
                java.lang.String r2 = "banned config uuid not match, reqUuid: "
                r1.append(r2)     // Catch: java.lang.Throwable -> L155
                r1.append(r13)     // Catch: java.lang.Throwable -> L155
                java.lang.String r2 = ", resUuid: "
                r1.append(r2)     // Catch: java.lang.Throwable -> L155
                r1.append(r0)     // Catch: java.lang.Throwable -> L155
                java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L155
                cn.jiguang.w.f.i(r9, r0)     // Catch: java.lang.Throwable -> L155
            L12b:
                r0 = 0
                return r0
            L12d:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L155
                r1.<init>()     // Catch: java.lang.Throwable -> L155
                r1.append(r4)     // Catch: java.lang.Throwable -> L155
                java.lang.String r3 = r14.toString()     // Catch: java.lang.Throwable -> L155
                r1.append(r3)     // Catch: java.lang.Throwable -> L155
                java.lang.String r3 = " error:"
                r1.append(r3)     // Catch: java.lang.Throwable -> L155
                java.lang.String r0 = r0.b()     // Catch: java.lang.Throwable -> L155
                r1.append(r0)     // Catch: java.lang.Throwable -> L155
                java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L155
                goto Lec
            L14d:
                r0 = 0
                cn.jiguang.v.h.a(r0)     // Catch: java.lang.Throwable -> L155
                goto L34
            L153:
                r0 = -2
                return r0
            L155:
                return r7
        }

        @Override // cn.jiguang.au.b
        public void a() {
                r4 = this;
                java.lang.String r0 = "start request sdk banned config"
                java.lang.String r1 = "JSDKBannedHelper"
                cn.jiguang.w.f.c(r1, r0)
                android.content.Context r0 = r4.a
                int r0 = r4.a(r0)
                if (r0 == 0) goto L23
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "request banned config failed, code: "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                cn.jiguang.w.f.i(r1, r0)
            L23:
                return
        }
    }

    static {
            r0 = 33
            byte[] r0 = new byte[r0]
            r0 = {x0046: FILL_ARRAY_DATA , data: [126, 101, 68, 80, 106, 50, 57, 62, 83, 79, 119, 110, 127, 118, 30, 74, 105, 125, 101, 121, 30, 67, 119, 39, 96, 32, 31, 83, 109, 105, 98, 100, 67} // fill-array
            java.lang.String r0 = cn.jiguang.av.k.b(r0)
            cn.jiguang.v.h.a = r0
            r1 = 38
            byte[] r1 = new byte[r1]
            r1 = {x005c: FILL_ARRAY_DATA , data: [96, 98, 101, 64, 83, 35, 39, 57, 114, 95, 78, 127, 97, 113, 60, 89, 80, 111, 62, 56, 123, 64, 85, 106, 96, 56, 114, 94, 15, 111, 57, 57, 98, 68, 65, 109, 125, 101} // fill-array
            java.lang.String r1 = cn.jiguang.av.k.b(r1)
            cn.jiguang.v.h.f1512b = r1
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r3 = 0
            r2.<init>(r3)
            cn.jiguang.v.h.f1513c = r2
            r2 = 0
            cn.jiguang.v.h.f1514d = r2
            r2 = 0
            cn.jiguang.v.h.f1515e = r2
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            cn.jiguang.v.h.f1516f = r3
            cn.jiguang.v.h.f1517g = r2
            r2 = 1
            cn.jiguang.v.h.f1518h = r2
            r2 = 2
            cn.jiguang.v.h.f1519i = r2
            r3.clear()
            java.util.LinkedList<java.lang.String> r2 = cn.jiguang.v.h.f1516f
            r2.add(r0)
            java.util.LinkedList<java.lang.String> r0 = cn.jiguang.v.h.f1516f
            r0.add(r1)
            return
    }

    public h() {
            r1 = this;
            r1.<init>()
            return
    }

    static /* synthetic */ java.lang.Boolean a(java.lang.Boolean r0) {
            cn.jiguang.v.h.f1515e = r0
            return r0
    }

    private static void a(android.content.Context r0, int r1) {
            int r0 = cn.jiguang.v.h.f1518h
            if (r1 != r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            cn.jiguang.v.h.f1517g = r0
            return
    }

    static /* synthetic */ void a(android.content.Context r0, org.json.JSONObject r1) {
            b(r0, r1)
            return
    }

    private static void a(android.content.Context r6, boolean r7, long r8) {
            b(r6, r7, r8)
            cn.jiguang.v.h.f1514d = r8
            java.util.concurrent.atomic.AtomicBoolean r8 = cn.jiguang.v.h.f1513c
            boolean r8 = r8.get()
            java.lang.String r9 = "JSDKBannedHelper"
            if (r8 == r7) goto L42
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "sdk banned status changed, update status, sdkBanned: "
            r8.append(r0)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            cn.jiguang.w.f.c(r9, r8)
            if (r7 != 0) goto L2c
            java.util.concurrent.atomic.AtomicBoolean r8 = new java.util.concurrent.atomic.AtomicBoolean
            r8.<init>(r7)
            cn.jiguang.v.h.f1513c = r8
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
            if (r7 == 0) goto L49
            java.lang.String r6 = "[key-step]Your sdk is disabled already. If you want to enable it, please contact us."
            cn.jiguang.w.f.l(r9, r6)
        L49:
            java.util.concurrent.atomic.AtomicBoolean r6 = new java.util.concurrent.atomic.AtomicBoolean
            r6.<init>(r7)
            cn.jiguang.v.h.f1513c = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "sdk banned status, banned: "
            r6.append(r8)
            r6.append(r7)
            java.lang.String r7 = ", nextTime: "
            r6.append(r7)
            long r7 = cn.jiguang.v.h.f1514d
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            cn.jiguang.w.f.f(r9, r6)
            return
    }

    public static boolean a() {
            java.lang.Boolean r0 = cn.jiguang.v.h.f1517g
            r1 = 0
            if (r0 != 0) goto L1e
            r0 = 0
            android.content.Context r0 = cn.jiguang.av.c.a(r0)
            if (r0 != 0) goto Ld
            return r1
        Ld:
            java.lang.String r2 = "cn.jiguang.prefs"
            android.content.SharedPreferences r2 = r0.getSharedPreferences(r2, r1)
            java.lang.String r3 = "sdk_reg_finger"
            int r4 = cn.jiguang.v.h.f1519i
            int r2 = r2.getInt(r3, r4)
            a(r0, r2)
        L1e:
            java.lang.Boolean r0 = cn.jiguang.v.h.f1517g
            if (r0 != 0) goto L23
            return r1
        L23:
            boolean r0 = r0.booleanValue()
            return r0
    }

    public static synchronized boolean a(android.content.Context r6) {
            java.lang.Class<cn.jiguang.v.h> r0 = cn.jiguang.v.h.class
            monitor-enter(r0)
            boolean r1 = cn.jiguang.av.b.a()     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto L13
            java.util.concurrent.atomic.AtomicBoolean r6 = cn.jiguang.v.h.f1513c     // Catch: java.lang.Throwable -> L11
            boolean r6 = r6.get()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)
            return r6
        L11:
            r6 = move-exception
            goto L75
        L13:
            java.lang.String r1 = cn.jiguang.v.a.a(r6)     // Catch: java.lang.Throwable -> L11
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L25
            java.util.concurrent.atomic.AtomicBoolean r6 = cn.jiguang.v.h.f1513c     // Catch: java.lang.Throwable -> L11
            boolean r6 = r6.get()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)
            return r6
        L25:
            java.lang.Boolean r1 = cn.jiguang.v.h.f1515e     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L31
            java.util.concurrent.atomic.AtomicBoolean r6 = cn.jiguang.v.h.f1513c     // Catch: java.lang.Throwable -> L11
            boolean r6 = r6.get()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)
            return r6
        L31:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L11
            cn.jiguang.v.h.f1515e = r1     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = "JSDKBannedHelper"
            java.lang.String r2 = "[isSDKBanned] first request banned config"
            cn.jiguang.w.f.c(r1, r2)     // Catch: java.lang.Throwable -> L11
            c(r6)     // Catch: java.lang.Throwable -> L11
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L11
            long r3 = cn.jiguang.v.h.f1514d     // Catch: java.lang.Throwable -> L11
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L57
            java.lang.String r1 = "FUTURE_TASK"
            cn.jiguang.v.h$a r2 = new cn.jiguang.v.h$a     // Catch: java.lang.Throwable -> L11
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L11
            r3 = 0
            r6 = 0
            cn.jiguang.au.d.a(r1, r2, r3, r6)     // Catch: java.lang.Throwable -> L11
            goto L6d
        L57:
            java.util.concurrent.atomic.AtomicBoolean r6 = cn.jiguang.v.h.f1513c     // Catch: java.lang.Throwable -> L11
            boolean r6 = r6.get()     // Catch: java.lang.Throwable -> L11
            if (r6 == 0) goto L66
            java.lang.String r6 = "JSDKBannedHelper"
            java.lang.String r1 = "[key-step]Your sdk is disabled already. If you want to enable it, please contact us."
            cn.jiguang.w.f.l(r6, r1)     // Catch: java.lang.Throwable -> L11
        L66:
            java.lang.String r6 = "JSDKBannedHelper"
            java.lang.String r1 = "request sdk banned config not time up, not request"
            cn.jiguang.w.f.c(r6, r1)     // Catch: java.lang.Throwable -> L11
        L6d:
            java.util.concurrent.atomic.AtomicBoolean r6 = cn.jiguang.v.h.f1513c     // Catch: java.lang.Throwable -> L11
            boolean r6 = r6.get()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)
            return r6
        L75:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r6
    }

    public static void b(android.content.Context r6) {
            java.lang.String r0 = "updateImmediately start"
            java.lang.String r1 = "JSDKBannedHelper"
            cn.jiguang.w.f.c(r1, r0)
            if (r6 != 0) goto Lf
            java.lang.String r6 = "updateImmediately failed: context is null"
            cn.jiguang.w.f.i(r1, r6)
            return
        Lf:
            java.lang.Boolean r0 = cn.jiguang.v.h.f1515e     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L22
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L20
            long r4 = cn.jiguang.v.h.f1514d     // Catch: java.lang.Throwable -> L20
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L1e
            goto L22
        L1e:
            r0 = 0
            goto L23
        L20:
            r6 = move-exception
            goto L68
        L22:
            r0 = 1
        L23:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L20
            r2.<init>()     // Catch: java.lang.Throwable -> L20
            java.lang.String r3 = "updateImmediately: needReset="
            r2.append(r3)     // Catch: java.lang.Throwable -> L20
            r2.append(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r3 = ", gIsConfigRequested="
            r2.append(r3)     // Catch: java.lang.Throwable -> L20
            java.lang.Boolean r3 = cn.jiguang.v.h.f1515e     // Catch: java.lang.Throwable -> L20
            r2.append(r3)     // Catch: java.lang.Throwable -> L20
            java.lang.String r3 = ", gNextReqTime="
            r2.append(r3)     // Catch: java.lang.Throwable -> L20
            long r3 = cn.jiguang.v.h.f1514d     // Catch: java.lang.Throwable -> L20
            r2.append(r3)     // Catch: java.lang.Throwable -> L20
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L20
            cn.jiguang.w.f.c(r1, r2)     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L64
            java.lang.String r0 = "Reset request status and continue update"
            cn.jiguang.w.f.c(r1, r0)     // Catch: java.lang.Throwable -> L20
            r0 = 0
            cn.jiguang.v.h.f1515e = r0     // Catch: java.lang.Throwable -> L20
            r2 = 0
            cn.jiguang.v.h.f1514d = r2     // Catch: java.lang.Throwable -> L20
            java.util.concurrent.atomic.AtomicBoolean r0 = cn.jiguang.v.h.f1513c     // Catch: java.lang.Throwable -> L20
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L20
            long r2 = cn.jiguang.v.h.f1514d     // Catch: java.lang.Throwable -> L20
            a(r6, r0, r2)     // Catch: java.lang.Throwable -> L20
        L64:
            a(r6)     // Catch: java.lang.Throwable -> L20
            return
        L68:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "updateImmediately failed: "
            r0.append(r2)
            java.lang.String r6 = r6.getMessage()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            cn.jiguang.w.f.l(r1, r6)
            return
    }

    private static void b(android.content.Context r3, int r4) {
            java.lang.String r0 = "JSDKBannedHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b
            r1.<init>()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = "save sdk regFinger: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L2b
            r1.append(r4)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L2b
            cn.jiguang.w.f.c(r0, r1)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = "cn.jiguang.prefs"
            r2 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r1, r2)     // Catch: java.lang.Throwable -> L2b
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = "sdk_reg_finger"
            android.content.SharedPreferences$Editor r3 = r3.putInt(r1, r4)     // Catch: java.lang.Throwable -> L2b
            r3.apply()     // Catch: java.lang.Throwable -> L2b
            return
        L2b:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "[saveSdkRegFinger] error, "
            r4.append(r1)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            cn.jiguang.w.f.i(r0, r3)
            return
    }

    private static void b(android.content.Context r9, org.json.JSONObject r10) {
            java.lang.String r0 = "JSDKBannedHelper"
            if (r10 != 0) goto L5
            return
        L5:
            java.lang.String r1 = "values"
            org.json.JSONObject r1 = r10.optJSONObject(r1)     // Catch: java.lang.Throwable -> L5b
            if (r1 == 0) goto L5d
            java.lang.String r2 = "banned"
            java.lang.String r3 = "status"
            java.lang.String r3 = r1.optString(r3)     // Catch: java.lang.Throwable -> L5b
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r3 = "nexttime"
            r4 = 43200(0xa8c0, double:2.13436E-319)
            long r3 = r1.optLong(r3, r4)     // Catch: java.lang.Throwable -> L5b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5b
            r1.<init>()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r5 = "from server sdk banned status: "
            r1.append(r5)     // Catch: java.lang.Throwable -> L5b
            r1.append(r2)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r5 = ", next request time: "
            r1.append(r5)     // Catch: java.lang.Throwable -> L5b
            r1.append(r3)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L5b
            cn.jiguang.w.f.c(r0, r1)     // Catch: java.lang.Throwable -> L5b
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 > 0) goto L46
            r3 = r5
        L46:
            r5 = 86400(0x15180, double:4.26873E-319)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L4e
            r3 = r5
        L4e:
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L5b
            r7 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r7
            long r5 = r5 + r3
            a(r9, r2, r5)     // Catch: java.lang.Throwable -> L5b
            goto L5d
        L5b:
            r9 = move-exception
            goto L6c
        L5d:
            java.lang.String r1 = "reg_finger"
            int r2 = cn.jiguang.v.h.f1519i     // Catch: java.lang.Throwable -> L5b
            int r10 = r10.optInt(r1, r2)     // Catch: java.lang.Throwable -> L5b
            b(r9, r10)     // Catch: java.lang.Throwable -> L5b
            a(r9, r10)     // Catch: java.lang.Throwable -> L5b
            return
        L6c:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r1 = "parse sdk banned config failed, "
            r10.append(r1)
            java.lang.String r9 = r9.getMessage()
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            cn.jiguang.w.f.i(r0, r9)
            return
    }

    private static void b(android.content.Context r2, boolean r3, long r4) {
            java.lang.String r0 = "JSDKBannedHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f
            r1.<init>()     // Catch: java.lang.Throwable -> L3f
            r1.append(r3)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r3 = ","
            r1.append(r3)     // Catch: java.lang.Throwable -> L3f
            r1.append(r4)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L3f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f
            r4.<init>()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r5 = "save sdk banned status: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L3f
            r4.append(r3)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L3f
            cn.jiguang.w.f.c(r0, r4)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = "cn.jiguang.prefs"
            r5 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r4, r5)     // Catch: java.lang.Throwable -> L3f
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = "sdk_banned_status"
            android.content.SharedPreferences$Editor r2 = r2.putString(r4, r3)     // Catch: java.lang.Throwable -> L3f
            r2.apply()     // Catch: java.lang.Throwable -> L3f
            return
        L3f:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "[saveBannedConfigJson] parse json error, "
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jiguang.w.f.i(r0, r2)
            return
    }

    public static boolean b() {
            r0 = 0
            android.content.Context r0 = cn.jiguang.av.c.a(r0)
            if (r0 == 0) goto L28
            boolean r1 = cn.jiguang.av.b.a()
            if (r1 == 0) goto L28
            cn.jiguang.al.c r1 = cn.jiguang.al.c.a()
            boolean r1 = r1.a(r0)
            if (r1 != 0) goto L18
            goto L28
        L18:
            java.lang.Boolean r1 = cn.jiguang.v.h.f1515e
            if (r1 != 0) goto L21
            boolean r0 = a(r0)
            return r0
        L21:
            java.util.concurrent.atomic.AtomicBoolean r0 = cn.jiguang.v.h.f1513c
            boolean r0 = r0.get()
            return r0
        L28:
            r0 = 0
            return r0
    }

    public static java.lang.Integer c() {
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    private static boolean c(android.content.Context r7) {
            java.lang.String r0 = "JSDKBannedHelper"
            r1 = 0
            java.lang.String r2 = "cn.jiguang.prefs"
            android.content.SharedPreferences r7 = r7.getSharedPreferences(r2, r1)     // Catch: java.lang.Throwable -> L64
            java.lang.String r2 = "sdk_banned_status"
            java.lang.String r3 = ""
            java.lang.String r7 = r7.getString(r2, r3)     // Catch: java.lang.Throwable -> L64
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L64
            r2.<init>()     // Catch: java.lang.Throwable -> L64
            java.lang.String r3 = "local sdk banned config: "
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
            java.lang.String r6 = "local banned config, isBanned: "
            r7.append(r6)     // Catch: java.lang.Throwable -> L64
            r7.append(r2)     // Catch: java.lang.Throwable -> L64
            java.lang.String r6 = ", nextReqTime: "
            r7.append(r6)     // Catch: java.lang.Throwable -> L64
            r7.append(r4)     // Catch: java.lang.Throwable -> L64
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L64
            cn.jiguang.w.f.c(r0, r7)     // Catch: java.lang.Throwable -> L64
            cn.jiguang.v.h.f1514d = r4     // Catch: java.lang.Throwable -> L64
            java.util.concurrent.atomic.AtomicBoolean r7 = new java.util.concurrent.atomic.AtomicBoolean     // Catch: java.lang.Throwable -> L64
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L64
            cn.jiguang.v.h.f1513c = r7     // Catch: java.lang.Throwable -> L64
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
            java.util.LinkedList<java.lang.String> r0 = cn.jiguang.v.h.f1516f
            return r0
    }
}
