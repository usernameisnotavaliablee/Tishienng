package cn.jiguang.v;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c {
    private static boolean a;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f1486b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f1487c;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f1488d;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f1489e;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f1490f;

    /* renamed from: g, reason: collision with root package name */
    private static boolean f1491g;

    /* renamed from: h, reason: collision with root package name */
    private static boolean f1492h;

    /* renamed from: i, reason: collision with root package name */
    private static java.util.concurrent.atomic.AtomicInteger f1493i;

    /* renamed from: cn.jiguang.v.c$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static final class a {
        private static final cn.jiguang.v.c a = null;

        static {
                cn.jiguang.v.c r0 = new cn.jiguang.v.c
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.v.c.a.a = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.v.c a() {
                cn.jiguang.v.c r0 = cn.jiguang.v.c.a.a
                return r0
        }
    }

    static {
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 0
            r0.<init>(r1)
            cn.jiguang.v.c.f1493i = r0
            return
    }

    private c() {
            r1 = this;
            r1.<init>()
            boolean r0 = f()
            cn.jiguang.v.c.a = r0
            boolean r0 = g()
            cn.jiguang.v.c.f1486b = r0
            boolean r0 = h()
            cn.jiguang.v.c.f1487c = r0
            boolean r0 = i()
            cn.jiguang.v.c.f1488d = r0
            boolean r0 = j()
            cn.jiguang.v.c.f1489e = r0
            boolean r0 = k()
            cn.jiguang.v.c.f1490f = r0
            boolean r0 = l()
            cn.jiguang.v.c.f1491g = r0
            boolean r0 = m()
            cn.jiguang.v.c.f1492h = r0
            return
    }

    /* synthetic */ c(cn.jiguang.v.c.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static cn.jiguang.v.c a() {
            cn.jiguang.v.c r0 = cn.jiguang.v.c.a.a()
            return r0
    }

    public static boolean b() {
            boolean r0 = cn.jiguang.v.c.a
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = cn.jiguang.v.c.f1489e
            if (r0 != 0) goto L25
            boolean r0 = cn.jiguang.v.c.f1486b
            if (r0 != 0) goto L25
            boolean r0 = cn.jiguang.v.c.f1487c
            if (r0 != 0) goto L25
            boolean r0 = cn.jiguang.v.c.f1488d
            if (r0 != 0) goto L25
            boolean r0 = cn.jiguang.v.c.f1490f
            if (r0 != 0) goto L25
            boolean r0 = cn.jiguang.v.c.f1491g
            if (r0 != 0) goto L25
            boolean r0 = cn.jiguang.v.c.f1492h
            if (r0 == 0) goto L23
            goto L25
        L23:
            r0 = 1
            return r0
        L25:
            return r1
    }

    public static boolean c() {
            boolean r0 = cn.jiguang.v.c.f1492h
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = cn.jiguang.v.c.f1489e
            if (r0 != 0) goto L25
            boolean r0 = cn.jiguang.v.c.f1486b
            if (r0 != 0) goto L25
            boolean r0 = cn.jiguang.v.c.f1487c
            if (r0 != 0) goto L25
            boolean r0 = cn.jiguang.v.c.f1488d
            if (r0 != 0) goto L25
            boolean r0 = cn.jiguang.v.c.f1490f
            if (r0 != 0) goto L25
            boolean r0 = cn.jiguang.v.c.f1491g
            if (r0 != 0) goto L25
            boolean r0 = cn.jiguang.v.c.a
            if (r0 == 0) goto L23
            goto L25
        L23:
            r0 = 1
            return r0
        L25:
            return r1
    }

    private static boolean f() {
            java.lang.String r0 = "isPluginJpushSDK:"
            java.lang.String r1 = "JClientsHelper"
            r2 = 0
            java.util.concurrent.atomic.AtomicInteger r3 = cn.jiguang.v.c.f1493i     // Catch: java.lang.ClassNotFoundException -> L17
            int r3 = r3.intValue()     // Catch: java.lang.ClassNotFoundException -> L17
            r4 = 1
            r3 = r3 & r4
            if (r3 == 0) goto L1a
            java.lang.String r3 = "p jpush init"
            cn.jiguang.w.f.c(r1, r3)     // Catch: java.lang.ClassNotFoundException -> L17
            boolean r0 = cn.jiguang.v.c.a     // Catch: java.lang.ClassNotFoundException -> L17
            return r0
        L17:
            r3 = move-exception
            r4 = 0
            goto L2b
        L1a:
            java.util.concurrent.atomic.AtomicInteger r3 = cn.jiguang.v.c.f1493i     // Catch: java.lang.ClassNotFoundException -> L17
            int r3 = r3.addAndGet(r4)     // Catch: java.lang.ClassNotFoundException -> L17
            java.lang.String r5 = "cn.jpush.android.api.JPushInterface"
            java.lang.Class.forName(r5)     // Catch: java.lang.ClassNotFoundException -> L27
            r2 = 1
            goto L42
        L27:
            r4 = move-exception
            r6 = r4
            r4 = r3
            r3 = r6
        L2b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r3 = r3.getMessage()
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            cn.jiguang.w.f.a(r1, r3)
            r3 = r4
        L42:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = ", mPluginInitState: "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = r4.toString()
            cn.jiguang.w.f.a(r1, r0)
            return r2
    }

    private static boolean g() {
            java.lang.String r0 = "isPluginJMessageSDK:"
            java.lang.String r1 = "JClientsHelper"
            r2 = 0
            java.util.concurrent.atomic.AtomicInteger r3 = cn.jiguang.v.c.f1493i     // Catch: java.lang.ClassNotFoundException -> L17
            int r3 = r3.intValue()     // Catch: java.lang.ClassNotFoundException -> L17
            r4 = 2
            r3 = r3 & r4
            if (r3 == 0) goto L1a
            java.lang.String r3 = "p jmessage init"
            cn.jiguang.w.f.c(r1, r3)     // Catch: java.lang.ClassNotFoundException -> L17
            boolean r0 = cn.jiguang.v.c.f1486b     // Catch: java.lang.ClassNotFoundException -> L17
            return r0
        L17:
            r3 = move-exception
            r4 = 0
            goto L2b
        L1a:
            java.util.concurrent.atomic.AtomicInteger r3 = cn.jiguang.v.c.f1493i     // Catch: java.lang.ClassNotFoundException -> L17
            int r3 = r3.addAndGet(r4)     // Catch: java.lang.ClassNotFoundException -> L17
            java.lang.String r4 = "cn.jpush.im.android.api.JMessageClient"
            java.lang.Class.forName(r4)     // Catch: java.lang.ClassNotFoundException -> L27
            r2 = 1
            goto L42
        L27:
            r4 = move-exception
            r6 = r4
            r4 = r3
            r3 = r6
        L2b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r3 = r3.getMessage()
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            cn.jiguang.w.f.a(r1, r3)
            r3 = r4
        L42:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = ", pluginState: "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = r4.toString()
            cn.jiguang.w.f.a(r1, r0)
            return r2
    }

    private static boolean h() {
            java.lang.String r0 = "isPluginJanalyticsSDK:"
            java.lang.String r1 = "JClientsHelper"
            r2 = 0
            java.util.concurrent.atomic.AtomicInteger r3 = cn.jiguang.v.c.f1493i     // Catch: java.lang.ClassNotFoundException -> L17
            int r3 = r3.intValue()     // Catch: java.lang.ClassNotFoundException -> L17
            r4 = 4
            r3 = r3 & r4
            if (r3 == 0) goto L1a
            java.lang.String r3 = "p janalytics init"
            cn.jiguang.w.f.c(r1, r3)     // Catch: java.lang.ClassNotFoundException -> L17
            boolean r0 = cn.jiguang.v.c.f1487c     // Catch: java.lang.ClassNotFoundException -> L17
            return r0
        L17:
            r3 = move-exception
            r4 = 0
            goto L2b
        L1a:
            java.util.concurrent.atomic.AtomicInteger r3 = cn.jiguang.v.c.f1493i     // Catch: java.lang.ClassNotFoundException -> L17
            int r3 = r3.addAndGet(r4)     // Catch: java.lang.ClassNotFoundException -> L17
            java.lang.String r4 = "cn.jiguang.analytics.android.api.JAnalyticsInterface"
            java.lang.Class.forName(r4)     // Catch: java.lang.ClassNotFoundException -> L27
            r2 = 1
            goto L42
        L27:
            r4 = move-exception
            r6 = r4
            r4 = r3
            r3 = r6
        L2b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r3 = r3.getMessage()
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            cn.jiguang.w.f.a(r1, r3)
            r3 = r4
        L42:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = ", pluginState: "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = r4.toString()
            cn.jiguang.w.f.a(r1, r0)
            return r2
    }

    private static boolean i() {
            java.lang.String r0 = "isPluginJshareSDK:"
            java.lang.String r1 = "JClientsHelper"
            r2 = 0
            java.util.concurrent.atomic.AtomicInteger r3 = cn.jiguang.v.c.f1493i     // Catch: java.lang.ClassNotFoundException -> L18
            int r3 = r3.intValue()     // Catch: java.lang.ClassNotFoundException -> L18
            r4 = 8
            r3 = r3 & r4
            if (r3 == 0) goto L1b
            java.lang.String r3 = "p jshare init"
            cn.jiguang.w.f.c(r1, r3)     // Catch: java.lang.ClassNotFoundException -> L18
            boolean r0 = cn.jiguang.v.c.f1488d     // Catch: java.lang.ClassNotFoundException -> L18
            return r0
        L18:
            r3 = move-exception
            r4 = 0
            goto L2c
        L1b:
            java.util.concurrent.atomic.AtomicInteger r3 = cn.jiguang.v.c.f1493i     // Catch: java.lang.ClassNotFoundException -> L18
            int r3 = r3.addAndGet(r4)     // Catch: java.lang.ClassNotFoundException -> L18
            java.lang.String r4 = "cn.jiguang.share.android.api.JShareInterface"
            java.lang.Class.forName(r4)     // Catch: java.lang.ClassNotFoundException -> L28
            r2 = 1
            goto L43
        L28:
            r4 = move-exception
            r6 = r4
            r4 = r3
            r3 = r6
        L2c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r3 = r3.getMessage()
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            cn.jiguang.w.f.a(r1, r3)
            r3 = r4
        L43:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = ", pluginState: "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = r4.toString()
            cn.jiguang.w.f.a(r1, r0)
            return r2
    }

    private static boolean j() {
            java.lang.String r0 = "isPluginJVerificationSDK:"
            java.lang.String r1 = "JClientsHelper"
            r2 = 0
            java.util.concurrent.atomic.AtomicInteger r3 = cn.jiguang.v.c.f1493i     // Catch: java.lang.ClassNotFoundException -> L18
            int r3 = r3.intValue()     // Catch: java.lang.ClassNotFoundException -> L18
            r4 = 64
            r3 = r3 & r4
            if (r3 == 0) goto L1b
            java.lang.String r3 = "p jverification init"
            cn.jiguang.w.f.c(r1, r3)     // Catch: java.lang.ClassNotFoundException -> L18
            boolean r0 = cn.jiguang.v.c.f1489e     // Catch: java.lang.ClassNotFoundException -> L18
            return r0
        L18:
            r3 = move-exception
            r4 = 0
            goto L2c
        L1b:
            java.util.concurrent.atomic.AtomicInteger r3 = cn.jiguang.v.c.f1493i     // Catch: java.lang.ClassNotFoundException -> L18
            int r3 = r3.addAndGet(r4)     // Catch: java.lang.ClassNotFoundException -> L18
            java.lang.String r4 = "cn.jiguang.verifysdk.api.JVerificationInterface"
            java.lang.Class.forName(r4)     // Catch: java.lang.ClassNotFoundException -> L28
            r2 = 1
            goto L43
        L28:
            r4 = move-exception
            r6 = r4
            r4 = r3
            r3 = r6
        L2c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r3 = r3.getMessage()
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            cn.jiguang.w.f.a(r1, r3)
            r3 = r4
        L43:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = ", pluginState: "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = r4.toString()
            cn.jiguang.w.f.a(r1, r0)
            return r2
    }

    private static boolean k() {
            java.lang.String r0 = "isPluginJMLinkSDK:"
            java.lang.String r1 = "JClientsHelper"
            r2 = 0
            java.util.concurrent.atomic.AtomicInteger r3 = cn.jiguang.v.c.f1493i     // Catch: java.lang.ClassNotFoundException -> L18
            int r3 = r3.intValue()     // Catch: java.lang.ClassNotFoundException -> L18
            r4 = 128(0x80, float:1.8E-43)
            r3 = r3 & r4
            if (r3 == 0) goto L1b
            java.lang.String r3 = "p jmlink init"
            cn.jiguang.w.f.c(r1, r3)     // Catch: java.lang.ClassNotFoundException -> L18
            boolean r0 = cn.jiguang.v.c.f1490f     // Catch: java.lang.ClassNotFoundException -> L18
            return r0
        L18:
            r3 = move-exception
            r4 = 0
            goto L2c
        L1b:
            java.util.concurrent.atomic.AtomicInteger r3 = cn.jiguang.v.c.f1493i     // Catch: java.lang.ClassNotFoundException -> L18
            int r3 = r3.addAndGet(r4)     // Catch: java.lang.ClassNotFoundException -> L18
            java.lang.String r4 = "cn.jiguang.jmlinksdk.core.JMlinkInterfaceImpl"
            java.lang.Class.forName(r4)     // Catch: java.lang.ClassNotFoundException -> L28
            r2 = 1
            goto L43
        L28:
            r4 = move-exception
            r6 = r4
            r4 = r3
            r3 = r6
        L2c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r3 = r3.getMessage()
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            cn.jiguang.w.f.a(r1, r3)
            r3 = r4
        L43:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = ", pluginState: "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = r4.toString()
            cn.jiguang.w.f.a(r1, r0)
            return r2
    }

    private static boolean l() {
            java.lang.String r0 = "isPluginJUnionSDK:"
            java.lang.String r1 = "JClientsHelper"
            r2 = 0
            java.util.concurrent.atomic.AtomicInteger r3 = cn.jiguang.v.c.f1493i     // Catch: java.lang.ClassNotFoundException -> L18
            int r3 = r3.intValue()     // Catch: java.lang.ClassNotFoundException -> L18
            r4 = 256(0x100, float:3.59E-43)
            r3 = r3 & r4
            if (r3 == 0) goto L1b
            java.lang.String r3 = "p junion init"
            cn.jiguang.w.f.c(r1, r3)     // Catch: java.lang.ClassNotFoundException -> L18
            boolean r0 = cn.jiguang.v.c.f1491g     // Catch: java.lang.ClassNotFoundException -> L18
            return r0
        L18:
            r3 = move-exception
            r4 = 0
            goto L2c
        L1b:
            java.util.concurrent.atomic.AtomicInteger r3 = cn.jiguang.v.c.f1493i     // Catch: java.lang.ClassNotFoundException -> L18
            int r3 = r3.addAndGet(r4)     // Catch: java.lang.ClassNotFoundException -> L18
            java.lang.String r4 = "cn.jiguang.junion.JUnionInterface"
            java.lang.Class.forName(r4)     // Catch: java.lang.ClassNotFoundException -> L28
            r2 = 1
            goto L43
        L28:
            r4 = move-exception
            r6 = r4
            r4 = r3
            r3 = r6
        L2c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r3 = r3.getMessage()
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            cn.jiguang.w.f.a(r1, r3)
            r3 = r4
        L43:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = ", pluginState: "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = r4.toString()
            cn.jiguang.w.f.a(r1, r0)
            return r2
    }

    private static boolean m() {
            java.lang.String r0 = "isPluginJOperateSDK:"
            java.lang.String r1 = "JClientsHelper"
            r2 = 0
            java.util.concurrent.atomic.AtomicInteger r3 = cn.jiguang.v.c.f1493i     // Catch: java.lang.ClassNotFoundException -> L18
            int r3 = r3.intValue()     // Catch: java.lang.ClassNotFoundException -> L18
            r4 = 2048(0x800, float:2.87E-42)
            r3 = r3 & r4
            if (r3 == 0) goto L1b
            java.lang.String r3 = "p joperate init"
            cn.jiguang.w.f.c(r1, r3)     // Catch: java.lang.ClassNotFoundException -> L18
            boolean r0 = cn.jiguang.v.c.f1492h     // Catch: java.lang.ClassNotFoundException -> L18
            return r0
        L18:
            r3 = move-exception
            r4 = 0
            goto L2c
        L1b:
            java.util.concurrent.atomic.AtomicInteger r3 = cn.jiguang.v.c.f1493i     // Catch: java.lang.ClassNotFoundException -> L18
            int r3 = r3.addAndGet(r4)     // Catch: java.lang.ClassNotFoundException -> L18
            java.lang.String r4 = "cn.jiguang.joperate.api.JOperateInterface"
            java.lang.Class.forName(r4)     // Catch: java.lang.ClassNotFoundException -> L28
            r2 = 1
            goto L43
        L28:
            r4 = move-exception
            r6 = r4
            r4 = r3
            r3 = r6
        L2c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r3 = r3.getMessage()
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            cn.jiguang.w.f.a(r1, r3)
            r3 = r4
        L43:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = ", pluginState: "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = r4.toString()
            cn.jiguang.w.f.a(r1, r0)
            return r2
    }

    public boolean a(android.content.Context r3) {
            r2 = this;
            boolean r3 = cn.jiguang.v.c.f1486b
            if (r3 != 0) goto Lb
            boolean r3 = cn.jiguang.v.c.a
            if (r3 == 0) goto L9
            goto Lb
        L9:
            r3 = 0
            goto Lc
        Lb:
            r3 = 1
        Lc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "isNeedKeepTcpConnect:"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "JClientsHelper"
            cn.jiguang.w.f.c(r1, r0)
            return r3
    }

    public boolean d() {
            r1 = this;
            boolean r0 = cn.jiguang.v.c.f1486b
            return r0
    }

    public boolean e() {
            r1 = this;
            boolean r0 = cn.jiguang.v.c.a
            return r0
    }
}
