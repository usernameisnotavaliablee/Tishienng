package cn.jiguang.a;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {
    public static java.lang.String a = ".permission.JPUSH_MESSAGE";

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f235b = "d15120e7";

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f236c = "5.3.1";

    /* renamed from: d, reason: collision with root package name */
    public static int f237d = 531;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f238e = "";

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.Boolean f239f;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.Integer f240g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f241h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.Date f242i = null;

    /* renamed from: j, reason: collision with root package name */
    public static final java.lang.String f243j = null;

    /* renamed from: k, reason: collision with root package name */
    public static java.util.List<java.lang.String> f244k;
    public static boolean l;
    private static boolean m;
    private static android.content.ServiceConnection n;




    /* renamed from: cn.jiguang.a.a$a, reason: collision with other inner class name */
    static class C0008a extends cn.jiguang.au.b {
        android.content.Context a;

        /* renamed from: b, reason: collision with root package name */
        boolean f246b;

        /* renamed from: c, reason: collision with root package name */
        java.lang.String f247c;

        /* renamed from: d, reason: collision with root package name */
        android.os.Bundle f248d;

        C0008a(android.content.Context r1, boolean r2, java.lang.String r3, android.os.Bundle r4) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.f246b = r2
                r0.f247c = r3
                r0.f248d = r4
                java.lang.String r1 = "JCoreGlobal"
                r0.f668h = r1
                return
        }

        private void a(android.os.Bundle r6) {
                r5 = this;
                if (r6 == 0) goto L83
                java.lang.String r0 = "is_auth"
                boolean r1 = r6.containsKey(r0)
                java.lang.String r2 = "JCoreGobal"
                if (r1 == 0) goto L39
                r1 = 1
                boolean r0 = r6.getBoolean(r0, r1)
                java.lang.String r3 = "had_auth"
                boolean r1 = r6.getBoolean(r3, r1)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "setAuthFormBundle：auth="
                r3.append(r4)
                r3.append(r0)
                java.lang.String r4 = " hadAuth="
                r3.append(r4)
                r3.append(r1)
                java.lang.String r3 = r3.toString()
                cn.jiguang.w.f.c(r2, r3)
                cn.jiguang.av.b.a(r0, r1)
                cn.jiguang.f.b.c(r0)
            L39:
                java.lang.String r0 = "had_init"
                boolean r1 = r6.containsKey(r0)
                if (r1 == 0) goto L5e
                boolean r0 = r6.getBoolean(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "setAuthFormBundle hadInit ="
                r1.append(r3)
                r1.append(r0)
                java.lang.String r1 = r1.toString()
                cn.jiguang.w.f.c(r2, r1)
                java.util.concurrent.atomic.AtomicBoolean r1 = cn.jiguang.internal.JConstants.isCallInit
                r1.set(r0)
            L5e:
                java.lang.String r0 = "foreground"
                boolean r1 = r6.containsKey(r0)
                if (r1 == 0) goto L83
                boolean r6 = r6.getBoolean(r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "isForeGround  ="
                r0.append(r1)
                r0.append(r6)
                java.lang.String r0 = r0.toString()
                cn.jiguang.w.f.c(r2, r0)
                java.util.concurrent.atomic.AtomicBoolean r0 = cn.jiguang.z.b.f1599b
                r0.set(r6)
            L83:
                return
        }

        private android.os.Bundle b(android.os.Bundle r3) {
                r2 = this;
                if (r3 != 0) goto L7
                android.os.Bundle r3 = new android.os.Bundle
                r3.<init>()
            L7:
                java.lang.String r0 = "is_auth"
                boolean r1 = cn.jiguang.av.b.a()
                r3.putBoolean(r0, r1)
                java.lang.String r0 = "had_auth"
                boolean r1 = cn.jiguang.av.b.b()
                r3.putBoolean(r0, r1)
                java.util.concurrent.atomic.AtomicBoolean r0 = cn.jiguang.internal.JConstants.isCallInit
                boolean r0 = r0.get()
                java.lang.String r1 = "had_init"
                r3.putBoolean(r1, r0)
                java.util.concurrent.atomic.AtomicBoolean r0 = cn.jiguang.z.b.f1599b
                boolean r0 = r0.get()
                java.lang.String r1 = "foreground"
                r3.putBoolean(r1, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "addAuthToBundle hadAuth="
                r0.append(r1)
                boolean r1 = cn.jiguang.av.b.b()
                r0.append(r1)
                java.lang.String r1 = " auth="
                r0.append(r1)
                boolean r1 = cn.jiguang.av.b.a()
                r0.append(r1)
                java.lang.String r1 = "  isCallInit="
                r0.append(r1)
                java.util.concurrent.atomic.AtomicBoolean r1 = cn.jiguang.internal.JConstants.isCallInit
                boolean r1 = r1.get()
                r0.append(r1)
                java.lang.String r1 = " isForeGround="
                r0.append(r1)
                java.util.concurrent.atomic.AtomicBoolean r1 = cn.jiguang.z.b.f1599b
                boolean r1 = r1.get()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "JCoreGobal"
                cn.jiguang.w.f.c(r1, r0)
                return r3
        }

        @Override // cn.jiguang.au.b
        public void a() {
                r8 = this;
                java.lang.String r0 = "tcp_a1"
                java.lang.String r1 = "JCoreGobal"
                android.os.Bundle r2 = r8.f248d     // Catch: java.lang.Throwable -> L20
                r8.a(r2)     // Catch: java.lang.Throwable -> L20
                boolean r2 = cn.jiguang.av.b.a()     // Catch: java.lang.Throwable -> L20
                if (r2 != 0) goto L23
                java.util.List<java.lang.String> r2 = cn.jiguang.a.a.f244k     // Catch: java.lang.Throwable -> L20
                java.lang.String r3 = r8.f247c     // Catch: java.lang.Throwable -> L20
                boolean r2 = r2.contains(r3)     // Catch: java.lang.Throwable -> L20
                if (r2 != 0) goto L23
                java.lang.String r0 = "user don't auth, so return init"
                cn.jiguang.w.f.l(r1, r0)     // Catch: java.lang.Throwable -> L20
                return
            L20:
                r0 = move-exception
                goto L25a
            L23:
                boolean r2 = r8.f246b     // Catch: java.lang.Throwable -> L20
                java.lang.String r3 = ", bundle="
                java.lang.String r4 = ", "
                if (r2 == 0) goto L202
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L20
                r2.<init>()     // Catch: java.lang.Throwable -> L20
                java.lang.String r5 = "inService do action: "
                r2.append(r5)     // Catch: java.lang.Throwable -> L20
                java.lang.String r5 = r8.f247c     // Catch: java.lang.Throwable -> L20
                r2.append(r5)     // Catch: java.lang.Throwable -> L20
                r2.append(r4)     // Catch: java.lang.Throwable -> L20
                android.os.Bundle r4 = r8.f248d     // Catch: java.lang.Throwable -> L20
                long r4 = cn.jiguang.v.f.a(r4)     // Catch: java.lang.Throwable -> L20
                r2.append(r4)     // Catch: java.lang.Throwable -> L20
                r2.append(r3)     // Catch: java.lang.Throwable -> L20
                android.os.Bundle r3 = r8.f248d     // Catch: java.lang.Throwable -> L20
                r2.append(r3)     // Catch: java.lang.Throwable -> L20
                java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L20
                cn.jiguang.w.f.c(r1, r2)     // Catch: java.lang.Throwable -> L20
                android.content.Context r2 = r8.a     // Catch: java.lang.Throwable -> L20
                cn.jiguang.al.e.c(r2)     // Catch: java.lang.Throwable -> L20
                java.lang.String r2 = r8.f247c     // Catch: java.lang.Throwable -> L20
                boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L20
                if (r2 != 0) goto L6c
                java.lang.String r2 = r8.f247c     // Catch: java.lang.Throwable -> L20
                java.lang.String r3 = "tcp_a28"
                boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L20
                if (r2 == 0) goto L78
            L6c:
                boolean r2 = cn.jiguang.av.b.a()     // Catch: java.lang.Throwable -> L20
                cn.jiguang.f.b.c(r2)     // Catch: java.lang.Throwable -> L20
                android.content.Context r2 = r8.a     // Catch: java.lang.Throwable -> L20
                cn.jiguang.f.b.a(r2)     // Catch: java.lang.Throwable -> L20
            L78:
                java.lang.String r2 = r8.f247c     // Catch: java.lang.Throwable -> L20
                java.lang.String r3 = "a5"
                boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L20
                r3 = 0
                if (r2 == 0) goto L118
                cn.jiguang.ad.b r2 = cn.jiguang.ad.b.a()     // Catch: java.lang.Throwable -> L20
                android.content.Context r4 = r8.a     // Catch: java.lang.Throwable -> L20
                java.lang.String r5 = ""
                r6 = 1
                r7 = 2001(0x7d1, float:2.804E-42)
                r2.a(r4, r7, r6, r5)     // Catch: java.lang.Throwable -> L20
                android.content.Context r2 = r8.a     // Catch: java.lang.Throwable -> L20
                cn.jiguang.e.a r4 = cn.jiguang.e.a.ab()     // Catch: java.lang.Throwable -> L20
                java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L20
                cn.jiguang.e.a r4 = r4.a(r5)     // Catch: java.lang.Throwable -> L20
                cn.jiguang.e.a[] r5 = new cn.jiguang.e.a[r6]     // Catch: java.lang.Throwable -> L20
                r5[r3] = r4     // Catch: java.lang.Throwable -> L20
                cn.jiguang.e.b.a(r2, r5)     // Catch: java.lang.Throwable -> L20
                android.os.Bundle r2 = r8.f248d     // Catch: java.lang.Throwable -> L20
                java.lang.String r4 = "appkey"
                java.lang.String r2 = r2.getString(r4)     // Catch: java.lang.Throwable -> L20
                boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L20
                if (r4 == 0) goto Lbf
                cn.jiguang.ad.b r0 = cn.jiguang.ad.b.a()     // Catch: java.lang.Throwable -> L20
                android.content.Context r2 = r8.a     // Catch: java.lang.Throwable -> L20
                r4 = 10003(0x2713, float:1.4017E-41)
                java.lang.String r5 = cn.jiguang.ai.d.a(r4)     // Catch: java.lang.Throwable -> L20
                goto Ldd
            Lbf:
                android.content.Context r4 = r8.a     // Catch: java.lang.Throwable -> L20
                java.lang.String r4 = cn.jiguang.v.a.b(r4)     // Catch: java.lang.Throwable -> L20
                boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L20
                if (r5 != 0) goto Le1
                boolean r4 = r4.equals(r2)     // Catch: java.lang.Throwable -> L20
                if (r4 != 0) goto Le1
                cn.jiguang.ad.b r0 = cn.jiguang.ad.b.a()     // Catch: java.lang.Throwable -> L20
                android.content.Context r2 = r8.a     // Catch: java.lang.Throwable -> L20
                r4 = 10002(0x2712, float:1.4016E-41)
                java.lang.String r5 = cn.jiguang.ai.d.a(r4)     // Catch: java.lang.Throwable -> L20
            Ldd:
                r0.a(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L20
                return
            Le1:
                android.content.Context r4 = r8.a     // Catch: java.lang.Throwable -> L20
                cn.jiguang.av.a.f(r4)     // Catch: java.lang.Throwable -> L20
                cn.jiguang.internal.JConstants.APP_KEY = r2     // Catch: java.lang.Throwable -> L20
                boolean r2 = cn.jiguang.av.b.a()     // Catch: java.lang.Throwable -> L20
                cn.jiguang.f.b.c(r2)     // Catch: java.lang.Throwable -> L20
                android.content.Context r2 = r8.a     // Catch: java.lang.Throwable -> L20
                cn.jiguang.f.b.a(r2)     // Catch: java.lang.Throwable -> L20
                android.content.Context r2 = r8.a     // Catch: java.lang.Throwable -> L20
                boolean r2 = cn.jiguang.ad.c.a(r2)     // Catch: java.lang.Throwable -> L20
                if (r2 == 0) goto L102
                java.lang.String r0 = "tcp_a24"
            Lfe:
                r8.f247c = r0     // Catch: java.lang.Throwable -> L20
                goto L1da
            L102:
                android.content.Context r2 = r8.a     // Catch: java.lang.Throwable -> L20
                java.lang.String r2 = cn.jiguang.d.a.b(r2)     // Catch: java.lang.Throwable -> L20
                boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L20
                if (r4 != 0) goto Lfe
                cn.jiguang.ad.b r4 = cn.jiguang.ad.b.a()     // Catch: java.lang.Throwable -> L20
                android.content.Context r5 = r8.a     // Catch: java.lang.Throwable -> L20
                r4.a(r5, r7, r3, r2)     // Catch: java.lang.Throwable -> L20
                goto Lfe
            L118:
                java.lang.String r0 = r8.f247c     // Catch: java.lang.Throwable -> L20
                java.lang.String r2 = "tcp_a23"
                boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L20
                if (r0 == 0) goto L131
                cn.jiguang.ad.b r0 = cn.jiguang.ad.b.a()     // Catch: java.lang.Throwable -> L20
                android.content.Context r2 = r8.a     // Catch: java.lang.Throwable -> L20
                java.lang.String r4 = "success"
                r5 = 2000(0x7d0, float:2.803E-42)
                r0.a(r2, r5, r3, r4)     // Catch: java.lang.Throwable -> L20
                goto L1da
            L131:
                java.lang.String r0 = r8.f247c     // Catch: java.lang.Throwable -> L20
                java.lang.String r2 = "a6"
                boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L20
                if (r0 == 0) goto L142
                android.content.Context r0 = r8.a     // Catch: java.lang.Throwable -> L20
                cn.jiguang.v.h.a(r0)     // Catch: java.lang.Throwable -> L20
                goto L1da
            L142:
                java.lang.String r0 = r8.f247c     // Catch: java.lang.Throwable -> L20
                java.lang.String r2 = "a8"
                boolean r0 = android.text.TextUtils.equals(r0, r2)     // Catch: java.lang.Throwable -> L20
                if (r0 == 0) goto L15d
                android.os.Bundle r0 = r8.f248d     // Catch: java.lang.Throwable -> L20
                if (r0 == 0) goto L1da
                java.lang.String r2 = "enable_auto_wakeup"
                boolean r0 = r0.getBoolean(r2)     // Catch: java.lang.Throwable -> L20
                android.content.Context r2 = r8.a     // Catch: java.lang.Throwable -> L20
                cn.jiguang.av.b.d(r2, r0)     // Catch: java.lang.Throwable -> L20
                goto L1da
            L15d:
                java.lang.String r0 = r8.f247c     // Catch: java.lang.Throwable -> L20
                java.lang.String r2 = "a11"
                boolean r0 = android.text.TextUtils.equals(r0, r2)     // Catch: java.lang.Throwable -> L20
                if (r0 == 0) goto L177
                android.os.Bundle r0 = r8.f248d     // Catch: java.lang.Throwable -> L20
                if (r0 == 0) goto L1da
                java.lang.String r2 = "enable_ci_priority"
                boolean r0 = r0.getBoolean(r2)     // Catch: java.lang.Throwable -> L20
                android.content.Context r2 = r8.a     // Catch: java.lang.Throwable -> L20
                cn.jiguang.av.b.f(r2, r0)     // Catch: java.lang.Throwable -> L20
                goto L1da
            L177:
                java.lang.String r0 = r8.f247c     // Catch: java.lang.Throwable -> L20
                java.lang.String r2 = "a9"
                boolean r0 = android.text.TextUtils.equals(r0, r2)     // Catch: java.lang.Throwable -> L20
                if (r0 == 0) goto L191
                android.os.Bundle r0 = r8.f248d     // Catch: java.lang.Throwable -> L20
                if (r0 == 0) goto L1da
                java.lang.String r2 = "enable_dy"
                boolean r0 = r0.getBoolean(r2)     // Catch: java.lang.Throwable -> L20
                android.content.Context r2 = r8.a     // Catch: java.lang.Throwable -> L20
                cn.jiguang.av.b.e(r2, r0)     // Catch: java.lang.Throwable -> L20
                goto L1da
            L191:
                java.lang.String r0 = r8.f247c     // Catch: java.lang.Throwable -> L20
                java.lang.String r2 = "a7"
                boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L20
                if (r0 == 0) goto L1a1
                android.os.Bundle r0 = r8.f248d     // Catch: java.lang.Throwable -> L20
                cn.jiguang.f.b.a(r0)     // Catch: java.lang.Throwable -> L20
                goto L1da
            L1a1:
                java.lang.String r0 = r8.f247c     // Catch: java.lang.Throwable -> L20
                java.lang.String r2 = "a10"
                boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L20
                if (r0 == 0) goto L1b5
                android.content.Context r0 = r8.a     // Catch: java.lang.Throwable -> L20
                java.lang.String r2 = "GET_ANDROID_ID"
                android.os.Bundle r3 = r8.f248d     // Catch: java.lang.Throwable -> L20
                cn.jiguang.i.a.a(r0, r2, r3)     // Catch: java.lang.Throwable -> L20
                goto L1da
            L1b5:
                java.lang.String r0 = r8.f247c     // Catch: java.lang.Throwable -> L20
                java.lang.String r2 = "tcp_set_country"
                boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L20
                if (r0 == 0) goto L1c7
                android.content.Context r0 = r8.a     // Catch: java.lang.Throwable -> L20
                android.os.Bundle r2 = r8.f248d     // Catch: java.lang.Throwable -> L20
                cn.jiguang.a.a.b(r0, r2)     // Catch: java.lang.Throwable -> L20
                goto L1da
            L1c7:
                java.lang.String r0 = r8.f247c     // Catch: java.lang.Throwable -> L20
                java.lang.String r2 = "a13"
                boolean r0 = android.text.TextUtils.equals(r0, r2)     // Catch: java.lang.Throwable -> L20
                if (r0 == 0) goto L1da
                android.os.Bundle r0 = r8.f248d     // Catch: java.lang.Throwable -> L20
                if (r0 == 0) goto L1da
                android.content.Context r2 = r8.a     // Catch: java.lang.Throwable -> L20
                cn.jiguang.w.a.a(r2, r0)     // Catch: java.lang.Throwable -> L20
            L1da:
                android.content.Context r0 = r8.a     // Catch: java.lang.Throwable -> L20
                int r0 = cn.jiguang.a.a.a(r0)     // Catch: java.lang.Throwable -> L20
                if (r0 != 0) goto L1f0
                cn.jiguang.v.d r0 = cn.jiguang.v.d.a()     // Catch: java.lang.Throwable -> L20
                android.content.Context r2 = r8.a     // Catch: java.lang.Throwable -> L20
                java.lang.String r3 = r8.f247c     // Catch: java.lang.Throwable -> L20
                android.os.Bundle r4 = r8.f248d     // Catch: java.lang.Throwable -> L20
                r0.b(r2, r3, r4)     // Catch: java.lang.Throwable -> L20
                return
            L1f0:
                if (r0 <= 0) goto L259
                cn.jiguang.ad.b r2 = cn.jiguang.ad.b.a()     // Catch: java.lang.Throwable -> L20
                android.content.Context r3 = r8.a     // Catch: java.lang.Throwable -> L20
                java.lang.String r4 = cn.jiguang.ai.d.a(r0)     // Catch: java.lang.Throwable -> L20
                r5 = 2002(0x7d2, float:2.805E-42)
                r2.a(r3, r5, r0, r4)     // Catch: java.lang.Throwable -> L20
                return
            L202:
                android.content.Context r0 = r8.a     // Catch: java.lang.Throwable -> L20
                android.os.Bundle r2 = r8.f248d     // Catch: java.lang.Throwable -> L20
                boolean r0 = cn.jiguang.a.a.a(r0, r2)     // Catch: java.lang.Throwable -> L20
                if (r0 == 0) goto L259
                android.os.Bundle r0 = r8.f248d     // Catch: java.lang.Throwable -> L20
                android.os.Bundle r0 = r8.b(r0)     // Catch: java.lang.Throwable -> L20
                r8.f248d = r0     // Catch: java.lang.Throwable -> L20
                android.content.Context r0 = r8.a     // Catch: java.lang.Throwable -> L20
                cn.jiguang.v.f$c r0 = cn.jiguang.v.f.c.a(r0)     // Catch: java.lang.Throwable -> L20
                android.os.Bundle r2 = r8.f248d     // Catch: java.lang.Throwable -> L20
                android.os.Bundle r0 = r0.a(r2)     // Catch: java.lang.Throwable -> L20
                r8.f248d = r0     // Catch: java.lang.Throwable -> L20
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L20
                r0.<init>()     // Catch: java.lang.Throwable -> L20
                java.lang.String r2 = "do action: "
                r0.append(r2)     // Catch: java.lang.Throwable -> L20
                java.lang.String r2 = r8.f247c     // Catch: java.lang.Throwable -> L20
                r0.append(r2)     // Catch: java.lang.Throwable -> L20
                r0.append(r4)     // Catch: java.lang.Throwable -> L20
                android.os.Bundle r2 = r8.f248d     // Catch: java.lang.Throwable -> L20
                long r4 = cn.jiguang.v.f.a(r2)     // Catch: java.lang.Throwable -> L20
                r0.append(r4)     // Catch: java.lang.Throwable -> L20
                r0.append(r3)     // Catch: java.lang.Throwable -> L20
                android.os.Bundle r2 = r8.f248d     // Catch: java.lang.Throwable -> L20
                r0.append(r2)     // Catch: java.lang.Throwable -> L20
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L20
                cn.jiguang.w.f.c(r1, r0)     // Catch: java.lang.Throwable -> L20
                cn.jiguang.v.d r0 = cn.jiguang.v.d.a()     // Catch: java.lang.Throwable -> L20
                android.content.Context r2 = r8.a     // Catch: java.lang.Throwable -> L20
                java.lang.String r3 = r8.f247c     // Catch: java.lang.Throwable -> L20
                android.os.Bundle r4 = r8.f248d     // Catch: java.lang.Throwable -> L20
                r0.a(r2, r3, r4)     // Catch: java.lang.Throwable -> L20
            L259:
                return
            L25a:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "do action error: action: "
                r2.append(r3)
                java.lang.String r3 = r8.f247c
                r2.append(r3)
                java.lang.String r3 = " bundle="
                r2.append(r3)
                android.os.Bundle r3 = r8.f248d
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                cn.jiguang.w.f.l(r1, r2)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "do action error:"
                r2.append(r3)
                java.lang.String r0 = r0.getMessage()
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                cn.jiguang.w.f.l(r1, r0)
                return
        }
    }

    static {
            java.util.Date r0 = cn.jiguang.av.e.c()
            cn.jiguang.a.a.f242i = r0
            r0 = 16
            byte[] r0 = new byte[r0]
            r0 = {x0044: FILL_ARRAY_DATA , data: [85, 118, 97, 33, 60, 84, 32, 0, 98, 46, 73, 85, 85, 116, 18, 44} // fill-array
            java.lang.String r0 = cn.jiguang.av.k.b(r0)
            cn.jiguang.a.a.f243j = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            cn.jiguang.a.a.f244k = r0
            java.lang.String r1 = "a7"
            r0.add(r1)
            java.util.List<java.lang.String> r0 = cn.jiguang.a.a.f244k
            java.lang.String r1 = "a8"
            r0.add(r1)
            java.util.List<java.lang.String> r0 = cn.jiguang.a.a.f244k
            java.lang.String r1 = "set_auth"
            r0.add(r1)
            java.util.List<java.lang.String> r0 = cn.jiguang.a.a.f244k
            java.lang.String r1 = "set_wake_enable"
            r0.add(r1)
            java.util.List<java.lang.String> r0 = cn.jiguang.a.a.f244k
            java.lang.String r1 = "a4"
            r0.add(r1)
            cn.jiguang.a.a$1 r0 = new cn.jiguang.a.a$1
            r0.<init>()
            cn.jiguang.a.a.n = r0
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static synchronized int a(android.content.Context r4) {
            java.lang.Class<cn.jiguang.a.a> r0 = cn.jiguang.a.a.class
            monitor-enter(r0)
            java.lang.Integer r1 = cn.jiguang.a.a.f240g     // Catch: java.lang.Throwable -> Ld
            if (r1 == 0) goto L10
            int r4 = r1.intValue()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return r4
        Ld:
            r4 = move-exception
            goto L93
        L10:
            if (r4 != 0) goto L1d
            java.lang.String r4 = "JCoreGobal"
            java.lang.String r1 = "init failed, context is null"
            cn.jiguang.w.f.m(r4, r1)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            r4 = 1000(0x3e8, float:1.401E-42)
            return r4
        L1d:
            d(r4)     // Catch: java.lang.Throwable -> Ld
            boolean r1 = cn.jiguang.av.a.b(r4)     // Catch: java.lang.Throwable -> Ld
            if (r1 == 0) goto L29
            d()     // Catch: java.lang.Throwable -> Ld
        L29:
            java.lang.String r1 = "JCoreGobal"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld
            r2.<init>()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r3 = "service process init - jcore, SdkVersion:"
            r2.append(r3)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r3 = cn.jiguang.a.a.f236c     // Catch: java.lang.Throwable -> Ld
            r2.append(r3)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r3 = ", build id:"
            r2.append(r3)     // Catch: java.lang.Throwable -> Ld
            r3 = 240(0xf0, float:3.36E-43)
            r2.append(r3)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r3 = " build type:"
            r2.append(r3)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r3 = "release"
            r2.append(r3)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Ld
            cn.jiguang.w.f.h(r1, r2)     // Catch: java.lang.Throwable -> Ld
            cn.jiguang.av.c.a(r4)     // Catch: java.lang.Throwable -> Ld
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> Ld
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)     // Catch: java.lang.Throwable -> Ld
            int r1 = cn.jiguang.v.a.e(r4)     // Catch: java.lang.Throwable -> Ld
            if (r1 == 0) goto L68
            monitor-exit(r0)
            return r1
        L68:
            int r1 = cn.jiguang.v.a.f(r4)     // Catch: java.lang.Throwable -> Ld
            if (r1 == 0) goto L77
            r4 = -1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> Ld
            cn.jiguang.a.a.f240g = r4     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return r1
        L77:
            cn.jiguang.v.c.a()     // Catch: java.lang.Throwable -> Ld
            e(r4)     // Catch: java.lang.Throwable -> Ld
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> Ld
            cn.jiguang.a.a.f240g = r1     // Catch: java.lang.Throwable -> Ld
            cn.jiguang.ae.a r1 = cn.jiguang.ae.a.a()     // Catch: java.lang.Throwable -> Ld
            r1.a(r4)     // Catch: java.lang.Throwable -> Ld
            java.lang.Integer r4 = cn.jiguang.a.a.f240g     // Catch: java.lang.Throwable -> Ld
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return r4
        L93:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r4
    }

    public static void a(android.content.Context r6, java.lang.String r7, android.os.Bundle r8) {
            java.lang.String r0 = "curProcessName is "
            java.lang.String r1 = "JCoreGobal"
            android.content.Context r6 = cn.jiguang.av.c.a(r6)     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = cn.jiguang.v.d.c(r6)     // Catch: java.lang.Throwable -> L35
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r3.<init>()     // Catch: java.lang.Throwable -> L35
            java.lang.String r4 = "serviceName is "
            r3.append(r4)     // Catch: java.lang.Throwable -> L35
            r3.append(r2)     // Catch: java.lang.Throwable -> L35
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L35
            cn.jiguang.w.f.c(r1, r3)     // Catch: java.lang.Throwable -> L35
            cn.jiguang.v.c r3 = cn.jiguang.v.c.a()     // Catch: java.lang.Throwable -> L35
            boolean r3 = r3.e()     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L38
            cn.jiguang.v.c r3 = cn.jiguang.v.c.a()     // Catch: java.lang.Throwable -> L35
            boolean r3 = r3.d()     // Catch: java.lang.Throwable -> L35
            if (r3 == 0) goto L5e
            goto L38
        L35:
            r6 = move-exception
            goto Ld0
        L38:
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L35
            if (r3 == 0) goto L5e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r6.<init>()     // Catch: java.lang.Throwable -> L35
            java.lang.String r7 = "AndroidManifest.xml missing required service:"
            r6.append(r7)     // Catch: java.lang.Throwable -> L35
            java.lang.Class<cn.jpush.android.service.JCommonService> r7 = cn.jpush.android.service.JCommonService.class
            java.lang.String r7 = r7.getCanonicalName()     // Catch: java.lang.Throwable -> L35
            r6.append(r7)     // Catch: java.lang.Throwable -> L35
            java.lang.String r7 = ",please custom one service and extends JCommonService. Otherwise no service"
            r6.append(r7)     // Catch: java.lang.Throwable -> L35
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L35
            cn.jiguang.w.f.n(r1, r6)     // Catch: java.lang.Throwable -> L35
            return
        L5e:
            java.lang.String r3 = cn.jiguang.av.a.a(r6)     // Catch: java.lang.Throwable -> L35
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r4.<init>()     // Catch: java.lang.Throwable -> L35
            r4.append(r0)     // Catch: java.lang.Throwable -> L35
            r4.append(r3)     // Catch: java.lang.Throwable -> L35
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L35
            cn.jiguang.w.f.c(r1, r4)     // Catch: java.lang.Throwable -> L35
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L35
            if (r4 == 0) goto L88
            java.lang.String r0 = r6.getPackageName()     // Catch: java.lang.Throwable -> L35
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto Lcf
        L84:
            b(r6, r7, r8)     // Catch: java.lang.Throwable -> L35
            return
        L88:
            java.lang.String r4 = cn.jiguang.v.d.a(r6)     // Catch: java.lang.Throwable -> L35
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r5.<init>()     // Catch: java.lang.Throwable -> L35
            r5.append(r0)     // Catch: java.lang.Throwable -> L35
            r5.append(r3)     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = ", remoteProcessName is "
            r5.append(r0)     // Catch: java.lang.Throwable -> L35
            r5.append(r4)     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L35
            cn.jiguang.w.f.c(r1, r0)     // Catch: java.lang.Throwable -> L35
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto Lc2
            java.lang.String r0 = r6.getPackageName()     // Catch: java.lang.Throwable -> L35
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto Lc2
            java.lang.String r0 = "MAIN_IPC_ACTION_TASK"
            cn.jiguang.a.a$a r2 = new cn.jiguang.a.a$a     // Catch: java.lang.Throwable -> L35
            r3 = 0
            r2.<init>(r6, r3, r7, r8)     // Catch: java.lang.Throwable -> L35
            cn.jiguang.au.d.a(r0, r2)     // Catch: java.lang.Throwable -> L35
            return
        Lc2:
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto Lcf
            boolean r0 = r3.equals(r4)     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto Lcf
            goto L84
        Lcf:
            return
        Ld0:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "sendToServiceAction failed, "
            r7.append(r8)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            cn.jiguang.w.f.i(r1, r6)
            return
    }

    public static void a(android.content.Context r8, boolean r9, long r10) {
            r6 = 0
            r7 = 0
            r4 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            a(r0, r1, r2, r4, r6, r7)
            return
    }

    public static void a(android.content.Context r3, boolean r4, long r5, long r7, int r9, boolean r10) {
            java.lang.String r0 = "JCoreGobal"
            android.os.Bundle r1 = new android.os.Bundle     // Catch: java.lang.Throwable -> L6f
            r1.<init>()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r2 = "force"
            r1.putBoolean(r2, r4)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r4 = "delay_time"
            r1.putLong(r4, r5)     // Catch: java.lang.Throwable -> L6f
            if (r10 == 0) goto L71
            long r4 = cn.jiguang.ad.g.f391d     // Catch: java.lang.Throwable -> L6f
            java.lang.String r6 = " need force change to default value="
            int r10 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r10 > 0) goto L21
            r4 = 3000(0xbb8, double:1.482E-320)
            int r10 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r10 >= 0) goto L3f
        L21:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            r4.<init>()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r5 = "set  heartbeatTimeOut="
            r4.append(r5)     // Catch: java.lang.Throwable -> L6f
            r4.append(r7)     // Catch: java.lang.Throwable -> L6f
            r4.append(r6)     // Catch: java.lang.Throwable -> L6f
            long r7 = cn.jiguang.ad.g.f391d     // Catch: java.lang.Throwable -> L6f
            r4.append(r7)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L6f
            cn.jiguang.w.f.c(r0, r4)     // Catch: java.lang.Throwable -> L6f
            long r7 = cn.jiguang.ad.g.f391d     // Catch: java.lang.Throwable -> L6f
        L3f:
            int r4 = cn.jiguang.ad.g.f390c     // Catch: java.lang.Throwable -> L6f
            if (r9 > r4) goto L46
            r4 = 1
            if (r9 >= r4) goto L64
        L46:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            r4.<init>()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r5 = "set  heartbeatTimeOutCount="
            r4.append(r5)     // Catch: java.lang.Throwable -> L6f
            r4.append(r9)     // Catch: java.lang.Throwable -> L6f
            r4.append(r6)     // Catch: java.lang.Throwable -> L6f
            int r5 = cn.jiguang.ad.g.f390c     // Catch: java.lang.Throwable -> L6f
            r4.append(r5)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L6f
            cn.jiguang.w.f.c(r0, r4)     // Catch: java.lang.Throwable -> L6f
            int r9 = cn.jiguang.ad.g.f390c     // Catch: java.lang.Throwable -> L6f
        L64:
            java.lang.String r4 = "heartbeat_time_out_count"
            r1.putInt(r4, r9)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r4 = "heartbeat_time_out"
            r1.putLong(r4, r7)     // Catch: java.lang.Throwable -> L6f
            goto L71
        L6f:
            r3 = move-exception
            goto L8b
        L71:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            r4.<init>()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r5 = " sendRtcToTcp  bundle="
            r4.append(r5)     // Catch: java.lang.Throwable -> L6f
            r4.append(r1)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L6f
            cn.jiguang.w.f.d(r0, r4)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r4 = "tcp_a2"
            a(r3, r4, r1)     // Catch: java.lang.Throwable -> L6f
            return
        L8b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "sendHeartBeat error:"
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            cn.jiguang.w.f.j(r0, r3)
            return
    }

    public static boolean a() {
            java.lang.Boolean r0 = cn.jiguang.a.a.f239f
            if (r0 == 0) goto La
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L14
        La:
            java.lang.Integer r0 = cn.jiguang.a.a.f240g
            if (r0 == 0) goto L16
            int r0 = r0.intValue()
            if (r0 != 0) goto L16
        L14:
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    public static synchronized boolean a(android.content.Context r5, android.os.Bundle r6) {
            java.lang.Class<cn.jiguang.a.a> r0 = cn.jiguang.a.a.class
            monitor-enter(r0)
            java.lang.Boolean r1 = cn.jiguang.a.a.f239f     // Catch: java.lang.Throwable -> Ld
            if (r1 == 0) goto L10
            boolean r5 = r1.booleanValue()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return r5
        Ld:
            r5 = move-exception
            goto Lc2
        L10:
            r1 = 0
            if (r5 != 0) goto L1c
            java.lang.String r5 = "JCoreGobal"
            java.lang.String r6 = "init failed,context is null"
            cn.jiguang.w.f.m(r5, r6)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return r1
        L1c:
            d(r5)     // Catch: java.lang.Throwable -> Ld
            cn.jiguang.av.c.a(r5)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r2 = "JCoreGobal"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld
            r3.<init>()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r4 = "main process init - jcore, SdkVersion:"
            r3.append(r4)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r4 = cn.jiguang.a.a.f236c     // Catch: java.lang.Throwable -> Ld
            r3.append(r4)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r4 = ", build id:"
            r3.append(r4)     // Catch: java.lang.Throwable -> Ld
            r4 = 240(0xf0, float:3.36E-43)
            r3.append(r4)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r4 = " build type:"
            r3.append(r4)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r4 = "release"
            r3.append(r4)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r4 = " git hash:"
            r3.append(r4)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r4 = cn.jiguang.a.a.f235b     // Catch: java.lang.Throwable -> Ld
            r3.append(r4)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Ld
            cn.jiguang.w.f.h(r2, r3)     // Catch: java.lang.Throwable -> Ld
            android.content.Context r5 = r5.getApplicationContext()     // Catch: java.lang.Throwable -> Ld
            android.content.Context r5 = com.stub.StubApp.getOrigApplicationContext(r5)     // Catch: java.lang.Throwable -> Ld
            cn.jiguang.v.c.a()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r2 = cn.jiguang.v.d.c(r5)     // Catch: java.lang.Throwable -> Ld
            cn.jiguang.v.c r3 = cn.jiguang.v.c.a()     // Catch: java.lang.Throwable -> Ld
            boolean r3 = r3.e()     // Catch: java.lang.Throwable -> Ld
            if (r3 != 0) goto L7b
            cn.jiguang.v.c r3 = cn.jiguang.v.c.a()     // Catch: java.lang.Throwable -> Ld
            boolean r3 = r3.d()     // Catch: java.lang.Throwable -> Ld
            if (r3 == 0) goto La8
        L7b:
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> Ld
            if (r2 == 0) goto La8
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> Ld
            cn.jiguang.a.a.f239f = r5     // Catch: java.lang.Throwable -> Ld
            java.lang.String r5 = "JCoreGobal"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld
            r6.<init>()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r2 = "AndroidManifest.xml missing required service:"
            r6.append(r2)     // Catch: java.lang.Throwable -> Ld
            java.lang.Class<cn.jpush.android.service.JCommonService> r2 = cn.jpush.android.service.JCommonService.class
            java.lang.String r2 = r2.getCanonicalName()     // Catch: java.lang.Throwable -> Ld
            r6.append(r2)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r2 = ",please custom one service and extends JCommonService. Otherwise no service"
            r6.append(r2)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Ld
            cn.jiguang.w.f.n(r5, r6)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return r1
        La8:
            cn.jiguang.b.a r1 = cn.jiguang.b.a.a()     // Catch: java.lang.Throwable -> Laf
            r1.b()     // Catch: java.lang.Throwable -> Laf
        Laf:
            cn.jiguang.aj.i.a(r5)     // Catch: java.lang.Throwable -> Ld
            c(r5, r6)     // Catch: java.lang.Throwable -> Ld
            e(r5, r6)     // Catch: java.lang.Throwable -> Ld
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Ld
            cn.jiguang.a.a.f239f = r5     // Catch: java.lang.Throwable -> Ld
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return r5
        Lc2:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r5
    }

    public static void b(android.content.Context r5) {
            boolean r0 = cn.jiguang.a.a.m
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            cn.jiguang.a.a.m = r0
            cn.jiguang.z.a.a(r5)
            boolean r1 = b()
            if (r1 == 0) goto L2a
            cn.jiguang.dy.b r1 = cn.jiguang.dy.b.a()     // Catch: java.lang.Throwable -> L23
            android.content.Context r2 = cn.jiguang.av.c.a()     // Catch: java.lang.Throwable -> L23
            java.lang.String r3 = ""
            cn.jiguang.dy.b$a r4 = cn.jiguang.v.l.b.a()     // Catch: java.lang.Throwable -> L23
            r1.a(r2, r0, r3, r4)     // Catch: java.lang.Throwable -> L23
            goto L2a
        L23:
            java.lang.String r0 = "JCoreGobal"
            java.lang.String r1 = "u p call failed"
            cn.jiguang.w.f.i(r0, r1)
        L2a:
            cn.jiguang.aj.i.a(r5)
            cn.jiguang.aj.h r0 = cn.jiguang.aj.h.a()
            r0.b(r5)
            cn.jiguang.b.a r0 = cn.jiguang.b.a.a()
            r0.e(r5)
            cn.jiguang.e.a r0 = cn.jiguang.e.a.ay()
            java.lang.Object r0 = cn.jiguang.e.b.a(r5, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L4e
            cn.jiguang.w.b.b(r5)
        L4e:
            cn.jiguang.av.b.a(r5)
            cn.jiguang.al.c r5 = cn.jiguang.al.c.a()
            r5.b()
            cn.jiguang.al.d r5 = cn.jiguang.al.d.a()
            r5.b()
            cn.jiguang.al.b r5 = cn.jiguang.al.b.a()
            r5.b()
            return
    }

    static /* synthetic */ void b(android.content.Context r0, android.os.Bundle r1) {
            d(r0, r1)
            return
    }

    public static void b(android.content.Context r2, java.lang.String r3, android.os.Bundle r4) {
            cn.jiguang.a.a$a r0 = new cn.jiguang.a.a$a
            r1 = 1
            r0.<init>(r2, r1, r3, r4)
            java.lang.String r2 = "IPC_ACTION_TASK"
            cn.jiguang.au.d.a(r2, r0)
            return
    }

    public static boolean b() {
            r0 = 1
            java.lang.String r1 = "cn.jiguang.dy.b"
            java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L6
        L6:
            return r0
    }

    static /* synthetic */ void c() {
            d()
            return
    }

    public static void c(android.content.Context r4) {
            java.lang.String r0 = "JCoreGobal"
            java.lang.String r1 = "unRegisterCommonService start"
            cn.jiguang.w.f.f(r0, r1)     // Catch: java.lang.Throwable -> L1c
            android.content.ServiceConnection r1 = cn.jiguang.a.a.n     // Catch: java.lang.Throwable -> L1c
            r4.unbindService(r1)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = cn.jiguang.v.d.c(r4)     // Catch: java.lang.Throwable -> L1c
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L1e
            java.lang.String r4 = "not found commonServiceClass（JCommonService）"
        L18:
            cn.jiguang.w.f.f(r0, r4)     // Catch: java.lang.Throwable -> L1c
            return
        L1c:
            r4 = move-exception
            goto L35
        L1e:
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Throwable -> L1c
            java.lang.String r3 = "cn.jiguang.user.service.action"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1c
            r2.setClassName(r4, r1)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = r4.getPackageName()     // Catch: java.lang.Throwable -> L1c
            r2.setPackage(r1)     // Catch: java.lang.Throwable -> L1c
            r4.stopService(r2)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = "unRegisterCommonService end"
            goto L18
        L35:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unregister service failed, "
            r1.append(r2)
            java.lang.String r4 = r4.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            cn.jiguang.w.f.i(r0, r4)
            return
    }

    private static void c(android.content.Context r4, android.os.Bundle r5) {
            java.lang.String r0 = cn.jiguang.v.d.c(r4)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "JCoreGobal"
            if (r1 == 0) goto L12
            java.lang.String r4 = "not found commonServiceClass（JCommonService）"
            cn.jiguang.w.f.f(r2, r4)
            return
        L12:
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L30
            android.content.Context r3 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L30
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)     // Catch: java.lang.Throwable -> L30
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L30
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L30
            if (r5 == 0) goto L28
            r1.putExtras(r5)     // Catch: java.lang.Throwable -> L30
        L28:
            r4.startService(r1)     // Catch: java.lang.Throwable -> L30
            java.lang.String r4 = "start common service"
            cn.jiguang.w.f.c(r2, r4)     // Catch: java.lang.Throwable -> L30
        L30:
            return
    }

    private static void d() {
            r0 = 1
            cn.jiguang.a.a.l = r0
            cn.jiguang.analytics.page.ActivityLifecycle r0 = cn.jiguang.d.a.a()
            r0.sendCurrentState()
            return
    }

    public static void d(android.content.Context r13) {
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            if (r13 != 0) goto L9
            goto Ld8
        L9:
            java.lang.String r2 = "setInternalDebug"
            java.lang.String r3 = "JCoreGobal"
            cn.jiguang.w.f.c(r3, r2)
            cn.jiguang.e.a r2 = cn.jiguang.e.a.aL()     // Catch: java.lang.Throwable -> Ld8
            java.lang.Object r2 = cn.jiguang.e.b.a(r13, r2)     // Catch: java.lang.Throwable -> Ld8
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> Ld8
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r4 = "setInternalDebug open"
            java.lang.String r5 = "FUTURE_TASK"
            java.lang.String r6 = "setInternalDebug is expire!"
            r7 = 2
            r8 = 1
            if (r2 != r8) goto L8a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld8
            r2.<init>()     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r9 = "setInternalDebug currentTime: "
            r2.append(r9)     // Catch: java.lang.Throwable -> Ld8
            long r9 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Ld8
            r2.append(r9)     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r9 = " expireTime: "
            r2.append(r9)     // Catch: java.lang.Throwable -> Ld8
            cn.jiguang.e.a r9 = cn.jiguang.e.a.aN()     // Catch: java.lang.Throwable -> Ld8
            java.lang.Object r9 = cn.jiguang.e.b.a(r13, r9)     // Catch: java.lang.Throwable -> Ld8
            r2.append(r9)     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Ld8
            cn.jiguang.w.f.l(r3, r2)     // Catch: java.lang.Throwable -> Ld8
            long r9 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Ld8
            cn.jiguang.e.a r2 = cn.jiguang.e.a.aN()     // Catch: java.lang.Throwable -> Ld8
            java.lang.Object r2 = cn.jiguang.e.b.a(r13, r2)     // Catch: java.lang.Throwable -> Ld8
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.Throwable -> Ld8
            long r11 = r2.longValue()     // Catch: java.lang.Throwable -> Ld8
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 <= 0) goto L84
            cn.jiguang.e.a r2 = cn.jiguang.e.a.aL()     // Catch: java.lang.Throwable -> Ld8
            cn.jiguang.e.a r2 = r2.a(r1)     // Catch: java.lang.Throwable -> Ld8
            cn.jiguang.e.a[] r9 = new cn.jiguang.e.a[r8]     // Catch: java.lang.Throwable -> Ld8
            r9[r0] = r2     // Catch: java.lang.Throwable -> Ld8
            cn.jiguang.e.b.a(r13, r9)     // Catch: java.lang.Throwable -> Ld8
            cn.jiguang.e.c.b(r13, r7)     // Catch: java.lang.Throwable -> Ld8
            cn.jiguang.w.f.c(r3, r6)     // Catch: java.lang.Throwable -> Ld8
            cn.jiguang.a.a$2 r2 = new cn.jiguang.a.a$2     // Catch: java.lang.Throwable -> Ld8
            r2.<init>()     // Catch: java.lang.Throwable -> Ld8
        L80:
            cn.jiguang.au.d.a(r5, r2)     // Catch: java.lang.Throwable -> Ld8
            goto L95
        L84:
            cn.jiguang.w.f.c(r3, r4)     // Catch: java.lang.Throwable -> Ld8
            cn.jiguang.a.a.f241h = r8     // Catch: java.lang.Throwable -> Ld8
            goto L95
        L8a:
            java.lang.String r2 = "setInternalDebug close and delete log file"
            cn.jiguang.w.f.c(r3, r2)     // Catch: java.lang.Throwable -> Ld8
            cn.jiguang.a.a$3 r2 = new cn.jiguang.a.a$3     // Catch: java.lang.Throwable -> Ld8
            r2.<init>()     // Catch: java.lang.Throwable -> Ld8
            goto L80
        L95:
            cn.jiguang.e.a r2 = cn.jiguang.e.a.aM()     // Catch: java.lang.Throwable -> Ld8
            java.lang.Object r2 = cn.jiguang.e.b.a(r13, r2)     // Catch: java.lang.Throwable -> Ld8
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> Ld8
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> Ld8
            if (r2 != r8) goto Ld8
            long r9 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Ld8
            cn.jiguang.e.a r2 = cn.jiguang.e.a.aN()     // Catch: java.lang.Throwable -> Ld8
            java.lang.Object r2 = cn.jiguang.e.b.a(r13, r2)     // Catch: java.lang.Throwable -> Ld8
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.Throwable -> Ld8
            long r11 = r2.longValue()     // Catch: java.lang.Throwable -> Ld8
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 <= 0) goto Ld3
            cn.jiguang.e.a r2 = cn.jiguang.e.a.aM()     // Catch: java.lang.Throwable -> Ld8
            cn.jiguang.e.a r1 = r2.a(r1)     // Catch: java.lang.Throwable -> Ld8
            cn.jiguang.e.a[] r2 = new cn.jiguang.e.a[r8]     // Catch: java.lang.Throwable -> Ld8
            r2[r0] = r1     // Catch: java.lang.Throwable -> Ld8
            cn.jiguang.e.b.a(r13, r2)     // Catch: java.lang.Throwable -> Ld8
            cn.jiguang.e.c.b(r13, r7)     // Catch: java.lang.Throwable -> Ld8
            cn.jiguang.internal.JConstants.CMD_TO_PRINT_ALL_LOG = r0     // Catch: java.lang.Throwable -> Ld8
            cn.jiguang.w.f.c(r3, r6)     // Catch: java.lang.Throwable -> Ld8
            return
        Ld3:
            cn.jiguang.w.f.c(r3, r4)     // Catch: java.lang.Throwable -> Ld8
            cn.jiguang.internal.JConstants.CMD_TO_PRINT_ALL_LOG = r8     // Catch: java.lang.Throwable -> Ld8
        Ld8:
            return
    }

    private static void d(android.content.Context r12, android.os.Bundle r13) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "setCountry...bundle="
            r0.append(r1)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "JCoreGobal"
            cn.jiguang.w.f.c(r1, r0)
            long r4 = cn.jiguang.ab.c.c(r12)
            java.lang.String r0 = "sdk_type"
            java.lang.String r0 = r13.getString(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L28
            java.lang.String r0 = "JCore"
        L28:
            r9 = r0
            java.lang.String r0 = "set_country"
            java.lang.String r13 = r13.getString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 == 0) goto L3b
            java.lang.String r12 = "setCountry is empty"
            cn.jiguang.w.f.m(r1, r12)
            return
        L3b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "setCountry - action:"
            r0.append(r2)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            cn.jiguang.w.f.d(r1, r0)
            cn.jiguang.e.a r0 = cn.jiguang.e.a.V()
            cn.jiguang.e.a r0 = r0.a(r13)
            r1 = 1
            cn.jiguang.e.a[] r1 = new cn.jiguang.e.a[r1]
            r2 = 0
            r1[r2] = r0
            cn.jiguang.e.b.a(r12, r1)
            cn.jiguang.ai.b r0 = new cn.jiguang.ai.b
            r1 = 8192(0x2000, float:1.148E-41)
            r0.<init>(r1)
            r0.a(r13)
            byte[] r8 = r0.b()
            cn.jiguang.ad.i r2 = cn.jiguang.ad.i.a()
            r7 = 1
            r10 = 10000(0x2710, double:4.9407E-320)
            r6 = 41
            r3 = r12
            r2.a(r3, r4, r6, r7, r8, r9, r10)
            return
    }

    private static void e(android.content.Context r6) {
            android.content.IntentFilter r2 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> L31
            r2.<init>()     // Catch: java.lang.Throwable -> L31
            cn.jpush.android.service.PushReceiver r1 = new cn.jpush.android.service.PushReceiver     // Catch: java.lang.Throwable -> L31
            r1.<init>()     // Catch: java.lang.Throwable -> L31
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L31
            r3 = 28
            if (r0 >= r3) goto L15
            java.lang.String r0 = "android.net.conn.CONNECTIVITY_CHANGE"
            r2.addAction(r0)     // Catch: java.lang.Throwable -> L31
        L15:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r0.<init>()     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = r6.getPackageName()     // Catch: java.lang.Throwable -> L31
            r0.append(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = cn.jiguang.a.a.a     // Catch: java.lang.Throwable -> L31
            r0.append(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Throwable -> L31
            r4 = 0
            r5 = 0
            r0 = r6
            cn.jiguang.av.q.a(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L31
            return
        L31:
            r0 = move-exception
            r6 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "registerPushReceiver fail:"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "JCoreGobal"
            cn.jiguang.w.f.l(r0, r6)
            return
    }

    private static void e(android.content.Context r3, android.os.Bundle r4) {
            java.lang.String r0 = cn.jiguang.v.d.c(r3)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "JCoreGobal"
            if (r1 == 0) goto L12
            java.lang.String r3 = "not found commonServiceClass（JCommonService）"
            cn.jiguang.w.f.f(r2, r3)
            return
        L12:
            boolean r1 = cn.jpush.android.service.DataShare.isBinding()
            if (r1 == 0) goto L1e
            java.lang.String r3 = "is binding service"
            cn.jiguang.w.f.c(r2, r3)
            return
        L1e:
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L29 java.lang.SecurityException -> L5f
            r1.<init>()     // Catch: java.lang.Throwable -> L29 java.lang.SecurityException -> L5f
            if (r4 == 0) goto L2b
            r1.putExtras(r4)     // Catch: java.lang.Throwable -> L29 java.lang.SecurityException -> L5f
            goto L2b
        L29:
            r3 = move-exception
            goto L4a
        L2b:
            java.lang.Class r4 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L29 java.lang.SecurityException -> L5f
            r1.setClass(r3, r4)     // Catch: java.lang.Throwable -> L29 java.lang.SecurityException -> L5f
            android.content.ServiceConnection r4 = cn.jiguang.a.a.n     // Catch: java.lang.Throwable -> L29 java.lang.SecurityException -> L5f
            r0 = 1
            boolean r3 = r3.bindService(r1, r4, r0)     // Catch: java.lang.Throwable -> L29 java.lang.SecurityException -> L5f
            if (r3 == 0) goto L44
            java.lang.String r3 = "Remote Service on binding..."
            cn.jiguang.w.f.a(r2, r3)     // Catch: java.lang.Throwable -> L29 java.lang.SecurityException -> L5f
            cn.jpush.android.service.DataShare.setBinding()     // Catch: java.lang.Throwable -> L29 java.lang.SecurityException -> L5f
            return
        L44:
            java.lang.String r3 = "Remote Service bind failed"
            cn.jiguang.w.f.a(r2, r3)     // Catch: java.lang.Throwable -> L29 java.lang.SecurityException -> L5f
            return
        L4a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Remote Service bind failed :"
            r4.append(r0)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
        L5b:
            cn.jiguang.w.f.j(r2, r3)
            goto L62
        L5f:
            java.lang.String r3 = "Remote Service bind failed caused by SecurityException!"
            goto L5b
        L62:
            return
    }
}
