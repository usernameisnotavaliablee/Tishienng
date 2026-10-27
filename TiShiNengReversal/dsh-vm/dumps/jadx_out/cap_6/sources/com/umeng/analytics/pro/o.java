package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class o {
    private static android.content.Context a = null;
    private static final java.lang.String l = "first_activate_time";
    private static final java.lang.String m = "ana_is_f";
    private static final java.lang.String n = "thtstart";
    private static final java.lang.String o = "dstk_last_time";
    private static final java.lang.String p = "dstk_cnt";

    /* renamed from: q, reason: collision with root package name */
    private static final java.lang.String f29q = "gkvc";
    private static final java.lang.String r = "ekvc";
    private static final java.lang.String t = "-1";
    private static final java.lang.String x = "com.umeng.umcrash.UMCrashUtils";
    private static java.lang.Class<?> y;
    private static java.lang.reflect.Method z;
    private com.umeng.analytics.pro.o.c b;
    private android.content.SharedPreferences c;
    private java.lang.String d;
    private java.lang.String e;
    private int f;
    private org.json.JSONArray g;
    private final int h;
    private int i;
    private int j;
    private long k;
    private final long s;
    private boolean u;
    private boolean v;
    private java.lang.Object w;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.umeng.analytics.pro.o$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a {
        public static final int A = 8209;
        public static final int B = 8210;
        public static final int C = 8211;
        public static final int D = 8212;
        public static final int E = 8213;
        public static final int F = 8214;
        public static final int G = 8215;
        public static final int a = 4097;
        public static final int b = 4098;
        public static final int c = 4099;
        public static final int d = 4100;
        public static final int e = 4101;
        public static final int f = 4102;
        public static final int g = 4103;
        public static final int h = 4104;
        public static final int i = 4105;
        public static final int j = 4106;
        public static final int k = 4352;
        public static final int l = 4353;
        public static final int m = 4354;
        public static final int n = 4355;
        public static final int o = 4356;
        public static final int p = 4357;

        /* renamed from: q, reason: collision with root package name */
        public static final int f30q = 4358;
        public static final int r = 8193;
        public static final int s = 8194;
        public static final int t = 8195;
        public static final int u = 8196;
        public static final int v = 8197;
        public static final int w = 8199;
        public static final int x = 8200;
        public static final int y = 8201;
        public static final int z = 8208;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class b {
        private static final com.umeng.analytics.pro.o a = null;

        static {
                com.umeng.analytics.pro.o r0 = new com.umeng.analytics.pro.o
                r1 = 0
                r0.<init>(r1)
                com.umeng.analytics.pro.o.b.a = r0
                return
        }

        private b() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ com.umeng.analytics.pro.o a() {
                com.umeng.analytics.pro.o r0 = com.umeng.analytics.pro.o.b.a
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class c {
        private com.umeng.commonsdk.statistics.common.ReportPolicy.ReportStrategy a;
        private int b;
        private int c;
        private int d;
        private int e;
        private com.umeng.commonsdk.statistics.noise.ABTest f;

        public c() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.a = r0
                r1 = -1
                r2.b = r1
                r2.c = r1
                r2.d = r1
                r2.e = r1
                r2.f = r0
                android.content.Context r0 = com.umeng.analytics.pro.o.g()
                com.umeng.commonsdk.statistics.noise.ABTest r0 = com.umeng.commonsdk.statistics.noise.ABTest.getService(r0)
                r2.f = r0
                return
        }

        private com.umeng.commonsdk.statistics.common.ReportPolicy.ReportStrategy b(int r4, int r5) {
                r3 = this;
                if (r4 == 0) goto La0
                r0 = 1
                if (r4 == r0) goto L93
                r0 = 4
                if (r4 == r0) goto L7e
                r0 = 5
                if (r4 == r0) goto L6d
                r0 = 6
                if (r4 == r0) goto L50
                r0 = 8
                if (r4 == r0) goto L3b
                r0 = 11
                if (r4 == r0) goto L23
                com.umeng.commonsdk.statistics.common.ReportPolicy$ReportStrategy r4 = r3.a
                boolean r5 = r4 instanceof com.umeng.commonsdk.statistics.common.ReportPolicy.ReportAtLaunch
                if (r5 == 0) goto L1d
                return r4
            L1d:
                com.umeng.commonsdk.statistics.common.ReportPolicy$ReportAtLaunch r4 = new com.umeng.commonsdk.statistics.common.ReportPolicy$ReportAtLaunch
                r4.<init>()
                return r4
            L23:
                com.umeng.commonsdk.statistics.common.ReportPolicy$ReportStrategy r4 = r3.a
                boolean r0 = r4 instanceof com.umeng.commonsdk.statistics.common.ReportPolicy.ReportQuasiRealtime
                if (r0 == 0) goto L31
                r0 = r4
                com.umeng.commonsdk.statistics.common.ReportPolicy$ReportQuasiRealtime r0 = (com.umeng.commonsdk.statistics.common.ReportPolicy.ReportQuasiRealtime) r0
                long r1 = (long) r5
                r0.setReportInterval(r1)
                return r4
            L31:
                com.umeng.commonsdk.statistics.common.ReportPolicy$ReportQuasiRealtime r4 = new com.umeng.commonsdk.statistics.common.ReportPolicy$ReportQuasiRealtime
                r4.<init>()
                long r0 = (long) r5
                r4.setReportInterval(r0)
                return r4
            L3b:
                com.umeng.commonsdk.statistics.common.ReportPolicy$ReportStrategy r4 = r3.a
                boolean r5 = r4 instanceof com.umeng.commonsdk.statistics.common.ReportPolicy.SmartPolicy
                if (r5 == 0) goto L42
                return r4
            L42:
                com.umeng.commonsdk.statistics.common.ReportPolicy$SmartPolicy r4 = new com.umeng.commonsdk.statistics.common.ReportPolicy$SmartPolicy
                android.content.Context r5 = com.umeng.analytics.pro.o.g()
                com.umeng.commonsdk.statistics.internal.StatTracer r5 = com.umeng.commonsdk.statistics.internal.StatTracer.getInstance(r5)
                r4.<init>(r5)
                return r4
            L50:
                com.umeng.commonsdk.statistics.common.ReportPolicy$ReportStrategy r4 = r3.a
                boolean r0 = r4 instanceof com.umeng.commonsdk.statistics.common.ReportPolicy.ReportByInterval
                if (r0 == 0) goto L5e
                r0 = r4
                com.umeng.commonsdk.statistics.common.ReportPolicy$ReportByInterval r0 = (com.umeng.commonsdk.statistics.common.ReportPolicy.ReportByInterval) r0
                long r1 = (long) r5
                r0.setReportInterval(r1)
                return r4
            L5e:
                com.umeng.commonsdk.statistics.common.ReportPolicy$ReportByInterval r4 = new com.umeng.commonsdk.statistics.common.ReportPolicy$ReportByInterval
                android.content.Context r0 = com.umeng.analytics.pro.o.g()
                com.umeng.commonsdk.statistics.internal.StatTracer r0 = com.umeng.commonsdk.statistics.internal.StatTracer.getInstance(r0)
                long r1 = (long) r5
                r4.<init>(r0, r1)
                return r4
            L6d:
                com.umeng.commonsdk.statistics.common.ReportPolicy$ReportStrategy r4 = r3.a
                boolean r5 = r4 instanceof com.umeng.commonsdk.statistics.common.ReportPolicy.ReportWifiOnly
                if (r5 == 0) goto L74
                return r4
            L74:
                com.umeng.commonsdk.statistics.common.ReportPolicy$ReportWifiOnly r4 = new com.umeng.commonsdk.statistics.common.ReportPolicy$ReportWifiOnly
                android.content.Context r5 = com.umeng.analytics.pro.o.g()
                r4.<init>(r5)
                return r4
            L7e:
                com.umeng.commonsdk.statistics.common.ReportPolicy$ReportStrategy r4 = r3.a
                boolean r5 = r4 instanceof com.umeng.commonsdk.statistics.common.ReportPolicy.ReportDaily
                if (r5 == 0) goto L85
                return r4
            L85:
                com.umeng.commonsdk.statistics.common.ReportPolicy$ReportDaily r4 = new com.umeng.commonsdk.statistics.common.ReportPolicy$ReportDaily
                android.content.Context r5 = com.umeng.analytics.pro.o.g()
                com.umeng.commonsdk.statistics.internal.StatTracer r5 = com.umeng.commonsdk.statistics.internal.StatTracer.getInstance(r5)
                r4.<init>(r5)
                return r4
            L93:
                com.umeng.commonsdk.statistics.common.ReportPolicy$ReportStrategy r4 = r3.a
                boolean r5 = r4 instanceof com.umeng.commonsdk.statistics.common.ReportPolicy.ReportAtLaunch
                if (r5 == 0) goto L9a
                return r4
            L9a:
                com.umeng.commonsdk.statistics.common.ReportPolicy$ReportAtLaunch r4 = new com.umeng.commonsdk.statistics.common.ReportPolicy$ReportAtLaunch
                r4.<init>()
                return r4
            La0:
                com.umeng.commonsdk.statistics.common.ReportPolicy$ReportStrategy r4 = r3.a
                boolean r5 = r4 instanceof com.umeng.commonsdk.statistics.common.ReportPolicy.ReportRealtime
                if (r5 == 0) goto La7
                return r4
            La7:
                com.umeng.commonsdk.statistics.common.ReportPolicy$ReportRealtime r4 = new com.umeng.commonsdk.statistics.common.ReportPolicy$ReportRealtime
                r4.<init>()
                return r4
        }

        public int a(int r4) {
                r3 = this;
                android.content.Context r0 = com.umeng.analytics.pro.o.g()
                java.lang.String r1 = "test_report_interval"
                java.lang.String r2 = "-1"
                java.lang.String r0 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r0, r1, r2)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                int r0 = r0.intValue()
                r1 = -1
                if (r0 == r1) goto L24
                r1 = 90
                if (r0 < r1) goto L24
                r1 = 86400(0x15180, float:1.21072E-40)
                if (r0 <= r1) goto L21
                goto L24
            L21:
                int r0 = r0 * 1000
                return r0
            L24:
                return r4
        }

        public void a() {
                r2 = this;
                r0 = -1
                int[] r0 = r2.a(r0, r0)     // Catch: java.lang.Throwable -> Lf
                r1 = 0
                r1 = r0[r1]     // Catch: java.lang.Throwable -> Lf
                r2.b = r1     // Catch: java.lang.Throwable -> Lf
                r1 = 1
                r0 = r0[r1]     // Catch: java.lang.Throwable -> Lf
                r2.c = r0     // Catch: java.lang.Throwable -> Lf
            Lf:
                return
        }

        public int[] a(int r5, int r6) {
                r4 = this;
                android.content.Context r0 = com.umeng.analytics.pro.o.g()
                java.lang.String r1 = "report_policy"
                java.lang.String r2 = "-1"
                java.lang.String r0 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r0, r1, r2)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                int r0 = r0.intValue()
                android.content.Context r1 = com.umeng.analytics.pro.o.g()
                java.lang.String r3 = "report_interval"
                java.lang.String r1 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r1, r3, r2)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                int r1 = r1.intValue()
                r2 = -1
                if (r0 == r2) goto L63
                boolean r3 = com.umeng.commonsdk.statistics.common.ReportPolicy.isValid(r0)
                if (r3 != 0) goto L30
                goto L63
            L30:
                r3 = 6
                if (r3 != r0) goto L47
                r5 = 90
                if (r1 == r2) goto L3e
                if (r1 < r5) goto L3e
                r6 = 86400(0x15180, float:1.21072E-40)
                if (r1 <= r6) goto L40
            L3e:
                r1 = 90
            L40:
                int r1 = r1 * 1000
                int[] r5 = new int[]{r0, r1}
                return r5
            L47:
                r3 = 11
                if (r3 != r0) goto L5e
                r5 = 15
                if (r1 == r2) goto L55
                if (r1 < r5) goto L55
                r6 = 3600(0xe10, float:5.045E-42)
                if (r1 <= r6) goto L57
            L55:
                r1 = 15
            L57:
                int r1 = r1 * 1000
                int[] r5 = new int[]{r0, r1}
                return r5
            L5e:
                int[] r5 = new int[]{r5, r6}
                return r5
            L63:
                int[] r5 = new int[]{r5, r6}
                return r5
        }

        protected void b() {
                r8 = this;
                android.content.Context r0 = com.umeng.analytics.pro.o.g()
                com.umeng.commonsdk.statistics.noise.Defcon r0 = com.umeng.commonsdk.statistics.noise.Defcon.getService(r0)
                boolean r1 = r0.isOpen()
                r2 = 3
                r3 = 0
                if (r1 == 0) goto L31
                com.umeng.commonsdk.statistics.common.ReportPolicy$ReportStrategy r1 = r8.a
                boolean r4 = r1 instanceof com.umeng.commonsdk.statistics.common.ReportPolicy.DefconPolicy
                if (r4 == 0) goto L1f
                boolean r1 = r1.isValid()
                if (r1 == 0) goto L1f
                com.umeng.commonsdk.statistics.common.ReportPolicy$ReportStrategy r0 = r8.a
                goto L2d
            L1f:
                com.umeng.commonsdk.statistics.common.ReportPolicy$DefconPolicy r1 = new com.umeng.commonsdk.statistics.common.ReportPolicy$DefconPolicy
                android.content.Context r4 = com.umeng.analytics.pro.o.g()
                com.umeng.commonsdk.statistics.internal.StatTracer r4 = com.umeng.commonsdk.statistics.internal.StatTracer.getInstance(r4)
                r1.<init>(r4, r0)
                r0 = r1
            L2d:
                r8.a = r0
                goto Ld5
            L31:
                android.content.Context r0 = com.umeng.analytics.pro.o.g()
                java.lang.String r1 = "integrated_test"
                java.lang.String r4 = "-1"
                java.lang.String r0 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r0, r1, r4)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                int r0 = r0.intValue()
                r1 = 0
                r5 = 1
                if (r0 != r5) goto L4a
                goto L4b
            L4a:
                r5 = 0
            L4b:
                boolean r0 = com.umeng.commonsdk.UMConfigure.isDebugLog()
                if (r0 == 0) goto L5e
                if (r5 == 0) goto L5e
                boolean r0 = com.umeng.commonsdk.statistics.common.MLog.DEBUG
                if (r0 != 0) goto L5e
                java.lang.String r0 = com.umeng.analytics.pro.j.K
                java.lang.String r6 = "\\|"
                com.umeng.commonsdk.debug.UMLog.mutlInfo(r0, r2, r6, r3, r3)
            L5e:
                boolean r0 = com.umeng.commonsdk.statistics.common.MLog.DEBUG
                if (r0 == 0) goto L74
                if (r5 == 0) goto L74
                com.umeng.commonsdk.statistics.common.ReportPolicy$DebugPolicy r0 = new com.umeng.commonsdk.statistics.common.ReportPolicy$DebugPolicy
                android.content.Context r1 = com.umeng.analytics.pro.o.g()
                com.umeng.commonsdk.statistics.internal.StatTracer r1 = com.umeng.commonsdk.statistics.internal.StatTracer.getInstance(r1)
                r0.<init>(r1)
                r8.a = r0
                goto Ld5
            L74:
                com.umeng.commonsdk.statistics.noise.ABTest r0 = r8.f
                boolean r0 = r0.isInTest()
                r5 = -1
                if (r0 == 0) goto Lc4
                com.umeng.commonsdk.statistics.noise.ABTest r0 = r8.f
                java.lang.String r0 = r0.getTestName()
                java.lang.String r6 = "RPT"
                boolean r0 = r6.equals(r0)
                if (r0 == 0) goto Lc4
                com.umeng.commonsdk.statistics.noise.ABTest r0 = r8.f
                int r0 = r0.getTestPolicy()
                r6 = 6
                if (r0 != r6) goto Lb7
                android.content.Context r0 = com.umeng.analytics.pro.o.g()
                java.lang.String r1 = "test_report_interval"
                java.lang.String r0 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r0, r1, r4)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                int r0 = r0.intValue()
                if (r0 == r5) goto Lb0
                r0 = 90000(0x15f90, float:1.26117E-40)
                int r1 = r8.a(r0)
                goto Lb7
            Lb0:
                int r1 = r8.c
                if (r1 <= 0) goto Lb5
                goto Lb7
            Lb5:
                int r1 = r8.e
            Lb7:
                com.umeng.commonsdk.statistics.noise.ABTest r0 = r8.f
                int r0 = r0.getTestPolicy()
                com.umeng.commonsdk.statistics.common.ReportPolicy$ReportStrategy r0 = r8.b(r0, r1)
                r8.a = r0
                goto Ld5
            Lc4:
                int r0 = r8.d
                int r1 = r8.e
                int r4 = r8.b
                if (r4 == r5) goto Lcf
                int r1 = r8.c
                r0 = r4
            Lcf:
                com.umeng.commonsdk.statistics.common.ReportPolicy$ReportStrategy r0 = r8.b(r0, r1)
                r8.a = r0
            Ld5:
                boolean r0 = com.umeng.commonsdk.UMConfigure.isDebugLog()
                if (r0 == 0) goto L132
                com.umeng.commonsdk.statistics.common.ReportPolicy$ReportStrategy r0 = r8.a     // Catch: java.lang.Throwable -> L132
                boolean r1 = r0 instanceof com.umeng.commonsdk.statistics.common.ReportPolicy.ReportAtLaunch     // Catch: java.lang.Throwable -> L132
                java.lang.String r4 = ""
                if (r1 == 0) goto Le9
                java.lang.String r0 = com.umeng.analytics.pro.j.I     // Catch: java.lang.Throwable -> L132
                com.umeng.commonsdk.debug.UMLog.mutlInfo(r0, r2, r4, r3, r3)     // Catch: java.lang.Throwable -> L132
                return
            Le9:
                boolean r1 = r0 instanceof com.umeng.commonsdk.statistics.common.ReportPolicy.ReportByInterval     // Catch: java.lang.Throwable -> L132
                java.lang.String r5 = "@"
                r6 = 1000(0x3e8, double:4.94E-321)
                if (r1 == 0) goto L10a
                com.umeng.commonsdk.statistics.common.ReportPolicy$ReportByInterval r0 = (com.umeng.commonsdk.statistics.common.ReportPolicy.ReportByInterval) r0     // Catch: java.lang.Throwable -> L132
                long r0 = r0.getReportInterval()     // Catch: java.lang.Throwable -> L132
                long r0 = r0 / r6
                java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L132
                java.lang.String[] r1 = new java.lang.String[]{r5}     // Catch: java.lang.Throwable -> L132
                java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L132
                java.lang.String r3 = com.umeng.analytics.pro.j.J     // Catch: java.lang.Throwable -> L132
                com.umeng.commonsdk.debug.UMLog.mutlInfo(r3, r2, r4, r1, r0)     // Catch: java.lang.Throwable -> L132
                return
            L10a:
                boolean r1 = r0 instanceof com.umeng.commonsdk.statistics.common.ReportPolicy.DebugPolicy     // Catch: java.lang.Throwable -> L132
                if (r1 == 0) goto L114
                java.lang.String r0 = com.umeng.analytics.pro.j.L     // Catch: java.lang.Throwable -> L132
                com.umeng.commonsdk.debug.UMLog.mutlInfo(r0, r2, r4, r3, r3)     // Catch: java.lang.Throwable -> L132
                return
            L114:
                boolean r1 = r0 instanceof com.umeng.commonsdk.statistics.common.ReportPolicy.ReportQuasiRealtime     // Catch: java.lang.Throwable -> L132
                if (r1 == 0) goto L132
                com.umeng.commonsdk.statistics.common.ReportPolicy$ReportQuasiRealtime r0 = (com.umeng.commonsdk.statistics.common.ReportPolicy.ReportQuasiRealtime) r0     // Catch: java.lang.Throwable -> L132
                long r0 = r0.getReportInterval()     // Catch: java.lang.Throwable -> L132
                long r0 = r0 / r6
                java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L132
                java.lang.String[] r1 = new java.lang.String[]{r5}     // Catch: java.lang.Throwable -> L132
                java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L132
                com.umeng.commonsdk.debug.UMLog r3 = com.umeng.commonsdk.UMConfigure.umDebugLog     // Catch: java.lang.Throwable -> L132
                java.lang.String r3 = com.umeng.analytics.pro.j.M     // Catch: java.lang.Throwable -> L132
                com.umeng.commonsdk.debug.UMLog.mutlInfo(r3, r2, r4, r1, r0)     // Catch: java.lang.Throwable -> L132
            L132:
                return
        }

        public com.umeng.commonsdk.statistics.common.ReportPolicy.ReportStrategy c() {
                r1 = this;
                r1.b()
                com.umeng.commonsdk.statistics.common.ReportPolicy$ReportStrategy r0 = r1.a
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class d {
        private java.util.Map<java.lang.String, java.lang.Object> a;
        private java.lang.String b;
        private java.lang.String c;
        private long d;

        private d() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.a = r0
                r2.b = r0
                r2.c = r0
                r0 = 0
                r2.d = r0
                return
        }

        public d(java.lang.String r1, java.util.Map<java.lang.String, java.lang.Object> r2, java.lang.String r3, long r4) {
                r0 = this;
                r0.<init>()
                r0.a = r2
                r0.b = r1
                r0.d = r4
                r0.c = r3
                return
        }

        public java.util.Map<java.lang.String, java.lang.Object> a() {
                r1 = this;
                java.util.Map<java.lang.String, java.lang.Object> r0 = r1.a
                return r0
        }

        public java.lang.String b() {
                r1 = this;
                java.lang.String r0 = r1.c
                return r0
        }

        public java.lang.String c() {
                r1 = this;
                java.lang.String r0 = r1.b
                return r0
        }

        public long d() {
                r2 = this;
                long r0 = r2.d
                return r0
        }
    }

    static {
            h()
            return
    }

    private o() {
            r5 = this;
            r5.<init>()
            r0 = 0
            r5.b = r0
            r5.c = r0
            r5.d = r0
            r5.e = r0
            r0 = 10
            r5.f = r0
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            r5.g = r0
            r0 = 5000(0x1388, float:7.006E-42)
            r5.h = r0
            r0 = 0
            r5.i = r0
            r5.j = r0
            r1 = 0
            r5.k = r1
            r3 = 28800000(0x1b77400, double:1.42290906E-316)
            r5.s = r3
            r5.u = r0
            r5.v = r0
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r5.w = r3
            android.content.Context r3 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L59
            android.content.SharedPreferences r3 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r3)     // Catch: java.lang.Throwable -> L59
            java.lang.String r4 = "thtstart"
            long r1 = r3.getLong(r4, r1)     // Catch: java.lang.Throwable -> L59
            r5.k = r1     // Catch: java.lang.Throwable -> L59
            java.lang.String r1 = "gkvc"
            int r1 = r3.getInt(r1, r0)     // Catch: java.lang.Throwable -> L59
            r5.i = r1     // Catch: java.lang.Throwable -> L59
            java.lang.String r1 = "ekvc"
            int r0 = r3.getInt(r1, r0)     // Catch: java.lang.Throwable -> L59
            r5.j = r0     // Catch: java.lang.Throwable -> L59
            com.umeng.analytics.pro.o$c r0 = new com.umeng.analytics.pro.o$c     // Catch: java.lang.Throwable -> L59
            r0.<init>()     // Catch: java.lang.Throwable -> L59
            r5.b = r0     // Catch: java.lang.Throwable -> L59
        L59:
            return
    }

    /* synthetic */ o(com.umeng.analytics.pro.o.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.umeng.analytics.pro.o a(android.content.Context r1) {
            android.content.Context r0 = com.umeng.analytics.pro.o.a
            if (r0 != 0) goto L10
            if (r1 == 0) goto L10
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            com.umeng.analytics.pro.o.a = r1
        L10:
            com.umeng.analytics.pro.o r1 = com.umeng.analytics.pro.o.b.a()
            return r1
    }

    private org.json.JSONObject a(org.json.JSONObject r6, long r7) {
            r5 = this;
            java.lang.String r0 = "header"
            long r1 = com.umeng.analytics.pro.q.a(r6)     // Catch: java.lang.Throwable -> L20
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 <= 0) goto L20
            org.json.JSONObject r1 = r6.getJSONObject(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r2 = "eof"
            long r3 = com.umeng.analytics.pro.q.a(r6)     // Catch: java.lang.Throwable -> L20
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L20
            r6.put(r0, r1)     // Catch: java.lang.Throwable -> L20
            android.content.Context r0 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L20
            org.json.JSONObject r6 = com.umeng.analytics.pro.q.a(r0, r7, r6)     // Catch: java.lang.Throwable -> L20
        L20:
            return r6
    }

    private void a(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            java.lang.Class<?> r0 = com.umeng.analytics.pro.o.y
            if (r0 == 0) goto L1c
            java.lang.reflect.Method r1 = com.umeng.analytics.pro.o.z
            if (r1 == 0) goto L1c
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L15
            r3 = 0
            r2[r3] = r5     // Catch: java.lang.Throwable -> L15
            r5 = 1
            r2[r5] = r6     // Catch: java.lang.Throwable -> L15
            r1.invoke(r0, r2)     // Catch: java.lang.Throwable -> L15
            return
        L15:
            java.lang.String r5 = "MobclickRT"
            java.lang.String r6 = "--->>> reflect call setPuidAndProvider method of crash lib failed."
            com.umeng.commonsdk.debug.UMRTLog.e(r5, r6)
        L1c:
            return
    }

    private boolean a(long r5, int r7) {
            r4 = this;
            r0 = 0
            r2 = 1
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 == 0) goto L1e
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r5
            r5 = 28800000(0x1b77400, double:1.42290906E-316)
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 <= 0) goto L17
            r4.o()
            return r2
        L17:
            r5 = 5000(0x1388, float:7.006E-42)
            if (r7 >= r5) goto L1c
            return r2
        L1c:
            r5 = 0
            return r5
        L1e:
            return r2
    }

    private boolean a(org.json.JSONArray r8) {
            r7 = this;
            int r0 = r8.length()
            java.lang.String r1 = "$$_onUMengEnterBackground"
            java.lang.String r2 = "$$_onUMengEnterForegroundInitError"
            java.lang.String r3 = "$$_onUMengEnterForeground"
            java.lang.String[] r1 = new java.lang.String[]{r3, r1, r2}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r2 = 0
            r3 = 0
            r4 = 0
        L15:
            if (r3 >= r0) goto L2e
            org.json.JSONObject r5 = r8.optJSONObject(r3)     // Catch: java.lang.Throwable -> L2b
            if (r5 == 0) goto L2b
            java.lang.String r6 = "id"
            java.lang.String r5 = r5.optString(r6)     // Catch: java.lang.Throwable -> L2b
            boolean r5 = r1.contains(r5)     // Catch: java.lang.Throwable -> L2b
            if (r5 == 0) goto L2b
            int r4 = r4 + 1
        L2b:
            int r3 = r3 + 1
            goto L15
        L2e:
            if (r4 < r0) goto L32
            r8 = 1
            return r8
        L32:
            return r2
    }

    private boolean a(org.json.JSONObject r8) {
            r7 = this;
            java.lang.String r0 = "ekv"
            org.json.JSONArray r8 = r8.optJSONArray(r0)
            int r0 = r8.length()
            r1 = 0
            r2 = 0
            r3 = 0
        Ld:
            if (r2 >= r0) goto L35
            org.json.JSONObject r4 = r8.optJSONObject(r2)     // Catch: java.lang.Throwable -> L32
            java.util.Iterator r5 = r4.keys()     // Catch: java.lang.Throwable -> L32
        L17:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L32
            if (r6 == 0) goto L32
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L32
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L32
            org.json.JSONArray r6 = r4.optJSONArray(r6)     // Catch: java.lang.Throwable -> L32
            if (r6 == 0) goto L17
            boolean r6 = r7.a(r6)     // Catch: java.lang.Throwable -> L32
            if (r6 == 0) goto L17
            int r3 = r3 + 1
            goto L17
        L32:
            int r2 = r2 + 1
            goto Ld
        L35:
            if (r3 < r0) goto L39
            r8 = 1
            return r8
        L39:
            return r1
    }

    private org.json.JSONObject b(org.json.JSONObject r4, long r5) {
            r3 = this;
            long r0 = com.umeng.analytics.pro.q.a(r4)     // Catch: java.lang.Throwable -> L24
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 <= 0) goto L24
            r4 = 0
            android.content.Context r5 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L24
            com.umeng.analytics.pro.i r5 = com.umeng.analytics.pro.i.a(r5)     // Catch: java.lang.Throwable -> L24
            r6 = 1
            r0 = 0
            r5.a(r6, r0)     // Catch: java.lang.Throwable -> L24
            android.content.Context r5 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L24
            com.umeng.analytics.pro.i r5 = com.umeng.analytics.pro.i.a(r5)     // Catch: java.lang.Throwable -> L24
            r5.b()     // Catch: java.lang.Throwable -> L24
            java.lang.String r5 = "MobclickRT"
            java.lang.String r6 = "--->>> Instant session packet overload !!! "
            com.umeng.commonsdk.debug.UMRTLog.i(r5, r6)     // Catch: java.lang.Throwable -> L24
        L24:
            return r4
    }

    private void b(org.json.JSONObject r5) {
            r4 = this;
            android.content.Context r0 = com.umeng.analytics.pro.o.a
            android.content.Context r0 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext(r0)
            com.umeng.analytics.pro.i r0 = com.umeng.analytics.pro.i.a(r0)
            boolean r0 = r0.c()
            if (r0 != 0) goto L66
            android.content.Context r0 = com.umeng.analytics.pro.o.a
            android.content.Context r0 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext(r0)
            com.umeng.analytics.pro.i r0 = com.umeng.analytics.pro.i.a(r0)
            org.json.JSONObject r0 = r0.f()
            if (r0 == 0) goto L66
            java.lang.String r1 = "__av"
            java.lang.String r1 = r0.optString(r1)
            java.lang.String r2 = "__vc"
            java.lang.String r0 = r0.optString(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L66
            java.lang.String r3 = "app_version"
            if (r2 == 0) goto L42
            java.lang.String r1 = com.umeng.commonsdk.statistics.b.a(r3)     // Catch: java.lang.Throwable -> L66
            android.content.Context r2 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L66
            java.lang.String r2 = com.umeng.commonsdk.utils.UMUtils.getAppVersionName(r2)     // Catch: java.lang.Throwable -> L66
            r5.put(r1, r2)     // Catch: java.lang.Throwable -> L66
            goto L49
        L42:
            java.lang.String r2 = com.umeng.commonsdk.statistics.b.a(r3)     // Catch: java.lang.Throwable -> L66
            r5.put(r2, r1)     // Catch: java.lang.Throwable -> L66
        L49:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L66
            java.lang.String r2 = "version_code"
            if (r1 == 0) goto L5f
            java.lang.String r0 = com.umeng.commonsdk.statistics.b.a(r2)     // Catch: java.lang.Throwable -> L66
            android.content.Context r1 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L66
            java.lang.String r1 = com.umeng.commonsdk.utils.UMUtils.getAppVersionCode(r1)     // Catch: java.lang.Throwable -> L66
            r5.put(r0, r1)     // Catch: java.lang.Throwable -> L66
            return
        L5f:
            java.lang.String r1 = com.umeng.commonsdk.statistics.b.a(r2)     // Catch: java.lang.Throwable -> L66
            r5.put(r1, r0)     // Catch: java.lang.Throwable -> L66
        L66:
            return
    }

    private void c(org.json.JSONObject r6) {
            r5 = this;
            android.content.Context r0 = com.umeng.analytics.pro.o.a
            com.umeng.analytics.pro.i r0 = com.umeng.analytics.pro.i.a(r0)
            boolean r0 = r0.e()
            java.lang.String r1 = "version_code"
            java.lang.String r2 = "app_version"
            if (r0 != 0) goto L5f
            android.content.Context r0 = com.umeng.analytics.pro.o.a
            com.umeng.analytics.pro.i r0 = com.umeng.analytics.pro.i.a(r0)
            org.json.JSONObject r0 = r0.g()
            if (r0 == 0) goto L79
            java.lang.String r3 = "__av"
            java.lang.String r3 = r0.optString(r3)
            java.lang.String r4 = "__vc"
            java.lang.String r0 = r0.optString(r4)
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L79
            if (r4 == 0) goto L3c
            java.lang.String r2 = com.umeng.commonsdk.statistics.b.a(r2)     // Catch: java.lang.Throwable -> L79
            android.content.Context r3 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L79
            java.lang.String r3 = com.umeng.commonsdk.utils.UMUtils.getAppVersionName(r3)     // Catch: java.lang.Throwable -> L79
            r6.put(r2, r3)     // Catch: java.lang.Throwable -> L79
            goto L43
        L3c:
            java.lang.String r2 = com.umeng.commonsdk.statistics.b.a(r2)     // Catch: java.lang.Throwable -> L79
            r6.put(r2, r3)     // Catch: java.lang.Throwable -> L79
        L43:
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L79
            if (r2 == 0) goto L57
            java.lang.String r0 = com.umeng.commonsdk.statistics.b.a(r1)     // Catch: java.lang.Throwable -> L79
            android.content.Context r1 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L79
            java.lang.String r1 = com.umeng.commonsdk.utils.UMUtils.getAppVersionCode(r1)     // Catch: java.lang.Throwable -> L79
            r6.put(r0, r1)     // Catch: java.lang.Throwable -> L79
            goto L79
        L57:
            java.lang.String r1 = com.umeng.commonsdk.statistics.b.a(r1)     // Catch: java.lang.Throwable -> L79
            r6.put(r1, r0)     // Catch: java.lang.Throwable -> L79
            goto L79
        L5f:
            java.lang.String r0 = com.umeng.commonsdk.statistics.b.a(r2)     // Catch: java.lang.Throwable -> L79
            android.content.Context r2 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = com.umeng.commonsdk.utils.UMUtils.getAppVersionName(r2)     // Catch: java.lang.Throwable -> L79
            r6.put(r0, r2)     // Catch: java.lang.Throwable -> L79
            java.lang.String r0 = com.umeng.commonsdk.statistics.b.a(r1)     // Catch: java.lang.Throwable -> L79
            android.content.Context r1 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L79
            java.lang.String r1 = com.umeng.commonsdk.utils.UMUtils.getAppVersionCode(r1)     // Catch: java.lang.Throwable -> L79
            r6.put(r0, r1)     // Catch: java.lang.Throwable -> L79
        L79:
            return
    }

    private boolean c(boolean r4) {
            r3 = this;
            boolean r0 = r3.s()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = com.umeng.analytics.AnalyticsConfig.isRealTimeDebugMode()
            if (r0 == 0) goto Lf
            return r1
        Lf:
            com.umeng.analytics.pro.o$c r0 = r3.b
            if (r0 != 0) goto L1a
            com.umeng.analytics.pro.o$c r0 = new com.umeng.analytics.pro.o$c
            r0.<init>()
            r3.b = r0
        L1a:
            com.umeng.analytics.pro.o$c r0 = r3.b
            r0.a()
            com.umeng.analytics.pro.o$c r0 = r3.b
            com.umeng.commonsdk.statistics.common.ReportPolicy$ReportStrategy r0 = r0.c()
            boolean r4 = r0.shouldSendMessage(r4)
            if (r4 == 0) goto L6f
            boolean r1 = r0 instanceof com.umeng.commonsdk.statistics.common.ReportPolicy.ReportByInterval
            if (r1 != 0) goto L37
            boolean r1 = r0 instanceof com.umeng.commonsdk.statistics.common.ReportPolicy.DebugPolicy
            if (r1 != 0) goto L37
            boolean r1 = r0 instanceof com.umeng.commonsdk.statistics.common.ReportPolicy.ReportQuasiRealtime
            if (r1 == 0) goto L40
        L37:
            boolean r1 = r3.p()
            if (r1 == 0) goto L40
            r3.d()
        L40:
            boolean r1 = r0 instanceof com.umeng.commonsdk.statistics.common.ReportPolicy.DefconPolicy
            if (r1 == 0) goto L4d
            boolean r1 = r3.p()
            if (r1 == 0) goto L4d
            r3.d()
        L4d:
            boolean r1 = com.umeng.commonsdk.UMConfigure.isDebugLog()
            if (r1 == 0) goto L6f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "数据发送策略 : "
            r1.append(r2)
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.umeng.commonsdk.statistics.common.MLog.d(r0)
        L6f:
            return r4
    }

    private void d(org.json.JSONObject r21) {
            r20 = this;
            r0 = r21
            java.lang.String r1 = "version_code"
            java.lang.String r2 = "header"
            java.lang.String r3 = "autopages"
            java.lang.String r4 = "analytics"
            java.lang.String r5 = "channel"
            java.lang.String r6 = "appkey"
            java.lang.String r7 = "device_model"
            java.lang.String r8 = "device_id"
            java.lang.String r9 = "sdk_version"
            java.lang.String r10 = "dplus"
            java.lang.String r11 = "active_user"
            java.lang.String r12 = "activate_msg"
            java.lang.String r13 = "sessions"
            java.lang.String r14 = "error"
            java.lang.String r15 = "gkv"
            r16 = r1
            java.lang.String r1 = "ekv"
            if (r0 != 0) goto L27
            goto L2d
        L27:
            int r17 = r0.length()     // Catch: java.lang.Throwable -> L7d
            if (r17 > 0) goto L2e
        L2d:
            return
        L2e:
            r17 = r2
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L7d
            r2.<init>()     // Catch: java.lang.Throwable -> L7d
            r18 = r4
            java.lang.String r4 = com.umeng.commonsdk.statistics.b.a(r18)     // Catch: java.lang.Throwable -> L7d
            boolean r4 = r0.has(r4)     // Catch: java.lang.Throwable -> L7d
            if (r4 == 0) goto L212
            java.lang.String r4 = com.umeng.commonsdk.statistics.b.a(r18)     // Catch: java.lang.Throwable -> L7d
            org.json.JSONObject r4 = r0.getJSONObject(r4)     // Catch: java.lang.Throwable -> L7d
            boolean r18 = r4.has(r1)     // Catch: java.lang.Throwable -> L7d
            if (r18 == 0) goto L9e
            r18 = r5
            org.json.JSONArray r5 = r4.getJSONArray(r1)     // Catch: java.lang.Throwable -> L7d
            r2.put(r1, r5)     // Catch: java.lang.Throwable -> L7d
            int r1 = r2.length()     // Catch: java.lang.Throwable -> L7d
            if (r1 <= 0) goto La0
            boolean r1 = com.umeng.analytics.AnalyticsConfig.isRealTimeDebugMode()     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L80
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7d
            r1.<init>()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r5 = "[埋点验证模式]事件:"
            r1.append(r5)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L7d
            r1.append(r2)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L7d
            com.umeng.commonsdk.statistics.common.MLog.d(r1)     // Catch: java.lang.Throwable -> L7d
            goto L98
        L7d:
            r0 = move-exception
            goto L2e4
        L80:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7d
            r1.<init>()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r5 = "事件:"
            r1.append(r5)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L7d
            r1.append(r2)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L7d
            com.umeng.commonsdk.statistics.common.MLog.d(r1)     // Catch: java.lang.Throwable -> L7d
        L98:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L7d
            r2.<init>()     // Catch: java.lang.Throwable -> L7d
            goto La0
        L9e:
            r18 = r5
        La0:
            boolean r1 = r4.has(r15)     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto Lef
            org.json.JSONArray r1 = r4.getJSONArray(r15)     // Catch: java.lang.Throwable -> L7d
            r2.put(r15, r1)     // Catch: java.lang.Throwable -> L7d
            int r1 = r2.length()     // Catch: java.lang.Throwable -> L7d
            if (r1 <= 0) goto Lef
            boolean r1 = com.umeng.analytics.AnalyticsConfig.isRealTimeDebugMode()     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto Ld2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7d
            r1.<init>()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r5 = "[埋点验证模式]游戏事件:"
            r1.append(r5)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L7d
            r1.append(r2)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L7d
            com.umeng.commonsdk.statistics.common.MLog.d(r1)     // Catch: java.lang.Throwable -> L7d
            goto Lea
        Ld2:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7d
            r1.<init>()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r5 = "游戏事件:"
            r1.append(r5)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L7d
            r1.append(r2)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L7d
            com.umeng.commonsdk.statistics.common.MLog.d(r1)     // Catch: java.lang.Throwable -> L7d
        Lea:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L7d
            r2.<init>()     // Catch: java.lang.Throwable -> L7d
        Lef:
            boolean r1 = r4.has(r14)     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L13e
            org.json.JSONArray r1 = r4.getJSONArray(r14)     // Catch: java.lang.Throwable -> L7d
            r2.put(r14, r1)     // Catch: java.lang.Throwable -> L7d
            int r1 = r2.length()     // Catch: java.lang.Throwable -> L7d
            if (r1 <= 0) goto L13e
            boolean r1 = com.umeng.analytics.AnalyticsConfig.isRealTimeDebugMode()     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L121
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7d
            r1.<init>()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r5 = "[埋点验证模式]错误:"
            r1.append(r5)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L7d
            r1.append(r2)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L7d
            com.umeng.commonsdk.statistics.common.MLog.d(r1)     // Catch: java.lang.Throwable -> L7d
            goto L139
        L121:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7d
            r1.<init>()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r5 = "错误:"
            r1.append(r5)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L7d
            r1.append(r2)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L7d
            com.umeng.commonsdk.statistics.common.MLog.d(r1)     // Catch: java.lang.Throwable -> L7d
        L139:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L7d
            r2.<init>()     // Catch: java.lang.Throwable -> L7d
        L13e:
            boolean r1 = r4.has(r13)     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L1b5
            org.json.JSONArray r1 = r4.getJSONArray(r13)     // Catch: java.lang.Throwable -> L7d
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L7d
            r5.<init>()     // Catch: java.lang.Throwable -> L7d
            r14 = 0
        L14e:
            int r15 = r1.length()     // Catch: java.lang.Throwable -> L7d
            if (r14 >= r15) goto L16f
            org.json.JSONObject r15 = r1.getJSONObject(r14)     // Catch: java.lang.Throwable -> L7d
            if (r15 == 0) goto L16c
            int r19 = r15.length()     // Catch: java.lang.Throwable -> L7d
            if (r19 <= 0) goto L16c
            boolean r19 = r15.has(r3)     // Catch: java.lang.Throwable -> L7d
            if (r19 == 0) goto L169
            r15.remove(r3)     // Catch: java.lang.Throwable -> L7d
        L169:
            r5.put(r15)     // Catch: java.lang.Throwable -> L7d
        L16c:
            int r14 = r14 + 1
            goto L14e
        L16f:
            r2.put(r13, r5)     // Catch: java.lang.Throwable -> L7d
            int r1 = r2.length()     // Catch: java.lang.Throwable -> L7d
            if (r1 <= 0) goto L1b5
            boolean r1 = com.umeng.analytics.AnalyticsConfig.isRealTimeDebugMode()     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L197
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7d
            r1.<init>()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r3 = "[埋点验证模式]会话:"
            r1.append(r3)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L7d
            r1.append(r2)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L7d
            com.umeng.commonsdk.statistics.common.MLog.d(r1)     // Catch: java.lang.Throwable -> L7d
            goto L1af
        L197:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7d
            r1.<init>()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r3 = "会话:"
            r1.append(r3)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L7d
            r1.append(r2)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L7d
            com.umeng.commonsdk.statistics.common.MLog.d(r1)     // Catch: java.lang.Throwable -> L7d
        L1af:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L7d
            r1.<init>()     // Catch: java.lang.Throwable -> L7d
            r2 = r1
        L1b5:
            boolean r1 = r4.has(r12)     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L1c2
            org.json.JSONObject r1 = r4.getJSONObject(r12)     // Catch: java.lang.Throwable -> L7d
            r2.put(r12, r1)     // Catch: java.lang.Throwable -> L7d
        L1c2:
            boolean r1 = r4.has(r11)     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L214
            org.json.JSONObject r1 = r4.getJSONObject(r11)     // Catch: java.lang.Throwable -> L7d
            r2.put(r11, r1)     // Catch: java.lang.Throwable -> L7d
            int r1 = r2.length()     // Catch: java.lang.Throwable -> L7d
            if (r1 <= 0) goto L214
            boolean r1 = com.umeng.analytics.AnalyticsConfig.isRealTimeDebugMode()     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L1f4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7d
            r1.<init>()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r3 = "[埋点验证模式]账号:"
            r1.append(r3)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L7d
            r1.append(r2)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L7d
            com.umeng.commonsdk.statistics.common.MLog.d(r1)     // Catch: java.lang.Throwable -> L7d
            goto L20c
        L1f4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7d
            r1.<init>()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r3 = "账号:"
            r1.append(r3)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L7d
            r1.append(r2)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L7d
            com.umeng.commonsdk.statistics.common.MLog.d(r1)     // Catch: java.lang.Throwable -> L7d
        L20c:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L7d
            r2.<init>()     // Catch: java.lang.Throwable -> L7d
            goto L214
        L212:
            r18 = r5
        L214:
            boolean r1 = r0.has(r10)     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L221
            org.json.JSONObject r1 = r0.getJSONObject(r10)     // Catch: java.lang.Throwable -> L7d
            r2.put(r10, r1)     // Catch: java.lang.Throwable -> L7d
        L221:
            java.lang.String r1 = com.umeng.commonsdk.statistics.b.a(r17)     // Catch: java.lang.Throwable -> L7d
            boolean r1 = r0.has(r1)     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L2e0
            java.lang.String r1 = com.umeng.commonsdk.statistics.b.a(r17)     // Catch: java.lang.Throwable -> L7d
            org.json.JSONObject r0 = r0.getJSONObject(r1)     // Catch: java.lang.Throwable -> L7d
            if (r0 == 0) goto L2e0
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L7d
            if (r1 <= 0) goto L2e0
            java.lang.String r1 = com.umeng.commonsdk.statistics.b.a(r9)     // Catch: java.lang.Throwable -> L7d
            boolean r1 = r0.has(r1)     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L250
            java.lang.String r1 = com.umeng.commonsdk.statistics.b.a(r9)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r1 = r0.getString(r1)     // Catch: java.lang.Throwable -> L7d
            r2.put(r9, r1)     // Catch: java.lang.Throwable -> L7d
        L250:
            java.lang.String r1 = com.umeng.commonsdk.statistics.b.a(r8)     // Catch: java.lang.Throwable -> L7d
            boolean r1 = r0.has(r1)     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L265
            java.lang.String r1 = com.umeng.commonsdk.statistics.b.a(r8)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r1 = r0.getString(r1)     // Catch: java.lang.Throwable -> L7d
            r2.put(r8, r1)     // Catch: java.lang.Throwable -> L7d
        L265:
            java.lang.String r1 = com.umeng.commonsdk.statistics.b.a(r7)     // Catch: java.lang.Throwable -> L7d
            boolean r1 = r0.has(r1)     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L27a
            java.lang.String r1 = com.umeng.commonsdk.statistics.b.a(r7)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r1 = r0.getString(r1)     // Catch: java.lang.Throwable -> L7d
            r2.put(r7, r1)     // Catch: java.lang.Throwable -> L7d
        L27a:
            java.lang.String r1 = com.umeng.commonsdk.statistics.b.a(r16)     // Catch: java.lang.Throwable -> L7d
            boolean r1 = r0.has(r1)     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L291
            java.lang.String r1 = "version"
            java.lang.String r3 = com.umeng.commonsdk.statistics.b.a(r16)     // Catch: java.lang.Throwable -> L7d
            int r3 = r0.getInt(r3)     // Catch: java.lang.Throwable -> L7d
            r2.put(r1, r3)     // Catch: java.lang.Throwable -> L7d
        L291:
            java.lang.String r1 = com.umeng.commonsdk.statistics.b.a(r6)     // Catch: java.lang.Throwable -> L7d
            boolean r1 = r0.has(r1)     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L2a6
            java.lang.String r1 = com.umeng.commonsdk.statistics.b.a(r6)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r1 = r0.getString(r1)     // Catch: java.lang.Throwable -> L7d
            r2.put(r6, r1)     // Catch: java.lang.Throwable -> L7d
        L2a6:
            java.lang.String r1 = com.umeng.commonsdk.statistics.b.a(r18)     // Catch: java.lang.Throwable -> L7d
            boolean r1 = r0.has(r1)     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L2bd
            java.lang.String r1 = com.umeng.commonsdk.statistics.b.a(r18)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r0 = r0.getString(r1)     // Catch: java.lang.Throwable -> L7d
            r1 = r18
            r2.put(r1, r0)     // Catch: java.lang.Throwable -> L7d
        L2bd:
            int r0 = r2.length()     // Catch: java.lang.Throwable -> L7d
            if (r0 <= 0) goto L2e0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7d
            r0.<init>()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r1 = "基础信息:"
            r0.append(r1)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L7d
            r0.append(r1)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L7d
            com.umeng.commonsdk.statistics.common.MLog.d(r0)     // Catch: java.lang.Throwable -> L7d
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L7d
            r2.<init>()     // Catch: java.lang.Throwable -> L7d
        L2e0:
            r2.length()     // Catch: java.lang.Throwable -> L7d
            return
        L2e4:
            com.umeng.commonsdk.statistics.common.MLog.e(r0)
            return
    }

    private boolean d(boolean r3) {
            r2 = this;
            com.umeng.analytics.pro.o$c r0 = r2.b
            if (r0 != 0) goto Lb
            com.umeng.analytics.pro.o$c r0 = new com.umeng.analytics.pro.o$c
            r0.<init>()
            r2.b = r0
        Lb:
            com.umeng.analytics.pro.o$c r0 = r2.b
            com.umeng.commonsdk.statistics.common.ReportPolicy$ReportStrategy r0 = r0.c()
            boolean r1 = r0 instanceof com.umeng.commonsdk.statistics.common.ReportPolicy.DefconPolicy
            if (r1 == 0) goto L24
            if (r3 == 0) goto L1e
            com.umeng.commonsdk.statistics.common.ReportPolicy$DefconPolicy r0 = (com.umeng.commonsdk.statistics.common.ReportPolicy.DefconPolicy) r0
            boolean r3 = r0.shouldSendMessageByInstant()
            return r3
        L1e:
            r3 = 0
            boolean r3 = r0.shouldSendMessage(r3)
            return r3
        L24:
            r3 = 1
            return r3
    }

    private void e(java.lang.Object r6) {
            r5 = this;
            java.lang.String r0 = "__t"
            org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch: java.lang.Throwable -> L1e
            int r1 = r6.getInt(r0)     // Catch: java.lang.Throwable -> L1e
            r2 = 2050(0x802, float:2.873E-42)
            if (r2 != r1) goto L21
            long r0 = r5.k     // Catch: java.lang.Throwable -> L1e
            int r2 = r5.i     // Catch: java.lang.Throwable -> L1e
            boolean r0 = r5.a(r0, r2)     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L17
            goto L33
        L17:
            int r0 = r5.i     // Catch: java.lang.Throwable -> L1e
            int r0 = r0 + 1
            r5.i = r0     // Catch: java.lang.Throwable -> L1e
            goto L3a
        L1e:
            r6 = move-exception
            goto L9a
        L21:
            int r0 = r6.getInt(r0)     // Catch: java.lang.Throwable -> L1e
            r1 = 2049(0x801, float:2.871E-42)
            if (r1 != r0) goto L3a
            long r0 = r5.k     // Catch: java.lang.Throwable -> L1e
            int r2 = r5.j     // Catch: java.lang.Throwable -> L1e
            boolean r0 = r5.a(r0, r2)     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L34
        L33:
            return
        L34:
            int r0 = r5.j     // Catch: java.lang.Throwable -> L1e
            int r0 = r0 + 1
            r5.j = r0     // Catch: java.lang.Throwable -> L1e
        L3a:
            boolean r0 = com.umeng.analytics.AnalyticsConfig.isRealTimeDebugMode()     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L63
            org.json.JSONArray r0 = r5.g     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L4b
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L1e
            r0.<init>()     // Catch: java.lang.Throwable -> L1e
            r5.g = r0     // Catch: java.lang.Throwable -> L1e
        L4b:
            org.json.JSONArray r0 = r5.g     // Catch: java.lang.Throwable -> L1e
            r0.put(r6)     // Catch: java.lang.Throwable -> L1e
            android.content.Context r6 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L1e
            com.umeng.analytics.pro.i r6 = com.umeng.analytics.pro.i.a(r6)     // Catch: java.lang.Throwable -> L1e
            org.json.JSONArray r0 = r5.g     // Catch: java.lang.Throwable -> L1e
            r6.a(r0)     // Catch: java.lang.Throwable -> L1e
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L1e
            r6.<init>()     // Catch: java.lang.Throwable -> L1e
            r5.g = r6     // Catch: java.lang.Throwable -> L1e
            return
        L63:
            org.json.JSONArray r0 = r5.g     // Catch: java.lang.Throwable -> L1e
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L1e
            int r1 = r5.f     // Catch: java.lang.Throwable -> L1e
            if (r0 < r1) goto L86
            java.lang.String r0 = "MobclickRT"
            java.lang.String r1 = "--->>>*** 超过10个事件，事件落库。"
            com.umeng.commonsdk.debug.UMRTLog.i(r0, r1)     // Catch: java.lang.Throwable -> L1e
            android.content.Context r0 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L1e
            com.umeng.analytics.pro.i r0 = com.umeng.analytics.pro.i.a(r0)     // Catch: java.lang.Throwable -> L1e
            org.json.JSONArray r1 = r5.g     // Catch: java.lang.Throwable -> L1e
            r0.a(r1)     // Catch: java.lang.Throwable -> L1e
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L1e
            r0.<init>()     // Catch: java.lang.Throwable -> L1e
            r5.g = r0     // Catch: java.lang.Throwable -> L1e
        L86:
            long r0 = r5.k     // Catch: java.lang.Throwable -> L1e
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L94
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1e
            r5.k = r0     // Catch: java.lang.Throwable -> L1e
        L94:
            org.json.JSONArray r0 = r5.g     // Catch: java.lang.Throwable -> L1e
            r0.put(r6)     // Catch: java.lang.Throwable -> L1e
            return
        L9a:
            com.umeng.commonsdk.statistics.common.MLog.e(r6)
            return
    }

    private void e(org.json.JSONObject r18) {
            r17 = this;
            r0 = r18
            java.lang.String r1 = "version_code"
            java.lang.String r2 = "analytics"
            java.lang.String r3 = "channel"
            java.lang.String r4 = "appkey"
            java.lang.String r5 = "device_model"
            java.lang.String r6 = "device_id"
            java.lang.String r7 = "sdk_version"
            java.lang.String r8 = "header"
            java.lang.String r9 = "active_user"
            java.lang.String r10 = "sessions"
            if (r0 != 0) goto L19
            goto L1f
        L19:
            int r11 = r0.length()     // Catch: java.lang.Throwable -> L5d
            if (r11 > 0) goto L20
        L1f:
            return
        L20:
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5d
            r11.<init>()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r12 = com.umeng.commonsdk.statistics.b.a(r2)     // Catch: java.lang.Throwable -> L5d
            boolean r12 = r0.has(r12)     // Catch: java.lang.Throwable -> L5d
            if (r12 == 0) goto Lb9
            java.lang.String r2 = com.umeng.commonsdk.statistics.b.a(r2)     // Catch: java.lang.Throwable -> L5d
            org.json.JSONObject r2 = r0.getJSONObject(r2)     // Catch: java.lang.Throwable -> L5d
            boolean r12 = r2.has(r10)     // Catch: java.lang.Throwable -> L5d
            if (r12 == 0) goto L89
            org.json.JSONArray r12 = r2.getJSONArray(r10)     // Catch: java.lang.Throwable -> L5d
            org.json.JSONArray r13 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L5d
            r13.<init>()     // Catch: java.lang.Throwable -> L5d
            r14 = 0
        L47:
            int r15 = r12.length()     // Catch: java.lang.Throwable -> L5d
            if (r14 >= r15) goto L63
            org.json.JSONObject r15 = r12.getJSONObject(r14)     // Catch: java.lang.Throwable -> L5d
            if (r15 == 0) goto L60
            int r16 = r15.length()     // Catch: java.lang.Throwable -> L5d
            if (r16 <= 0) goto L60
            r13.put(r15)     // Catch: java.lang.Throwable -> L5d
            goto L60
        L5d:
            r0 = move-exception
            goto L184
        L60:
            int r14 = r14 + 1
            goto L47
        L63:
            r11.put(r10, r13)     // Catch: java.lang.Throwable -> L5d
            int r10 = r11.length()     // Catch: java.lang.Throwable -> L5d
            if (r10 <= 0) goto L89
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5d
            r10.<init>()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r12 = "本次启动会话:"
            r10.append(r12)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L5d
            r10.append(r11)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L5d
            com.umeng.commonsdk.statistics.common.MLog.d(r10)     // Catch: java.lang.Throwable -> L5d
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5d
            r11.<init>()     // Catch: java.lang.Throwable -> L5d
        L89:
            boolean r10 = r2.has(r9)     // Catch: java.lang.Throwable -> L5d
            if (r10 == 0) goto Lb9
            org.json.JSONObject r2 = r2.getJSONObject(r9)     // Catch: java.lang.Throwable -> L5d
            r11.put(r9, r2)     // Catch: java.lang.Throwable -> L5d
            int r2 = r11.length()     // Catch: java.lang.Throwable -> L5d
            if (r2 <= 0) goto Lb9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5d
            r2.<init>()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r9 = "本次启动账号:"
            r2.append(r9)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r9 = r11.toString()     // Catch: java.lang.Throwable -> L5d
            r2.append(r9)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L5d
            com.umeng.commonsdk.statistics.common.MLog.d(r2)     // Catch: java.lang.Throwable -> L5d
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5d
            r11.<init>()     // Catch: java.lang.Throwable -> L5d
        Lb9:
            java.lang.String r2 = com.umeng.commonsdk.statistics.b.a(r8)     // Catch: java.lang.Throwable -> L5d
            boolean r2 = r0.has(r2)     // Catch: java.lang.Throwable -> L5d
            if (r2 == 0) goto L180
            java.lang.String r2 = com.umeng.commonsdk.statistics.b.a(r8)     // Catch: java.lang.Throwable -> L5d
            boolean r2 = r0.has(r2)     // Catch: java.lang.Throwable -> L5d
            if (r2 == 0) goto L180
            java.lang.String r2 = com.umeng.commonsdk.statistics.b.a(r8)     // Catch: java.lang.Throwable -> L5d
            org.json.JSONObject r0 = r0.getJSONObject(r2)     // Catch: java.lang.Throwable -> L5d
            if (r0 == 0) goto L180
            int r2 = r0.length()     // Catch: java.lang.Throwable -> L5d
            if (r2 <= 0) goto L180
            java.lang.String r2 = com.umeng.commonsdk.statistics.b.a(r7)     // Catch: java.lang.Throwable -> L5d
            boolean r2 = r0.has(r2)     // Catch: java.lang.Throwable -> L5d
            if (r2 == 0) goto Lf2
            java.lang.String r2 = com.umeng.commonsdk.statistics.b.a(r7)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r2 = r0.getString(r2)     // Catch: java.lang.Throwable -> L5d
            r11.put(r7, r2)     // Catch: java.lang.Throwable -> L5d
        Lf2:
            java.lang.String r2 = com.umeng.commonsdk.statistics.b.a(r6)     // Catch: java.lang.Throwable -> L5d
            boolean r2 = r0.has(r2)     // Catch: java.lang.Throwable -> L5d
            if (r2 == 0) goto L107
            java.lang.String r2 = com.umeng.commonsdk.statistics.b.a(r6)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r2 = r0.getString(r2)     // Catch: java.lang.Throwable -> L5d
            r11.put(r6, r2)     // Catch: java.lang.Throwable -> L5d
        L107:
            java.lang.String r2 = com.umeng.commonsdk.statistics.b.a(r5)     // Catch: java.lang.Throwable -> L5d
            boolean r2 = r0.has(r2)     // Catch: java.lang.Throwable -> L5d
            if (r2 == 0) goto L11c
            java.lang.String r2 = com.umeng.commonsdk.statistics.b.a(r5)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r2 = r0.getString(r2)     // Catch: java.lang.Throwable -> L5d
            r11.put(r5, r2)     // Catch: java.lang.Throwable -> L5d
        L11c:
            java.lang.String r2 = com.umeng.commonsdk.statistics.b.a(r1)     // Catch: java.lang.Throwable -> L5d
            boolean r2 = r0.has(r2)     // Catch: java.lang.Throwable -> L5d
            if (r2 == 0) goto L133
            java.lang.String r2 = "version"
            java.lang.String r1 = com.umeng.commonsdk.statistics.b.a(r1)     // Catch: java.lang.Throwable -> L5d
            int r1 = r0.getInt(r1)     // Catch: java.lang.Throwable -> L5d
            r11.put(r2, r1)     // Catch: java.lang.Throwable -> L5d
        L133:
            java.lang.String r1 = com.umeng.commonsdk.statistics.b.a(r4)     // Catch: java.lang.Throwable -> L5d
            boolean r1 = r0.has(r1)     // Catch: java.lang.Throwable -> L5d
            if (r1 == 0) goto L148
            java.lang.String r1 = com.umeng.commonsdk.statistics.b.a(r4)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r1 = r0.getString(r1)     // Catch: java.lang.Throwable -> L5d
            r11.put(r4, r1)     // Catch: java.lang.Throwable -> L5d
        L148:
            java.lang.String r1 = com.umeng.commonsdk.statistics.b.a(r3)     // Catch: java.lang.Throwable -> L5d
            boolean r1 = r0.has(r1)     // Catch: java.lang.Throwable -> L5d
            if (r1 == 0) goto L15d
            java.lang.String r1 = com.umeng.commonsdk.statistics.b.a(r3)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r0 = r0.getString(r1)     // Catch: java.lang.Throwable -> L5d
            r11.put(r3, r0)     // Catch: java.lang.Throwable -> L5d
        L15d:
            int r0 = r11.length()     // Catch: java.lang.Throwable -> L5d
            if (r0 <= 0) goto L180
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5d
            r0.<init>()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r1 = "本次启动基础信息:"
            r0.append(r1)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r1 = r11.toString()     // Catch: java.lang.Throwable -> L5d
            r0.append(r1)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L5d
            com.umeng.commonsdk.statistics.common.MLog.d(r0)     // Catch: java.lang.Throwable -> L5d
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5d
            r11.<init>()     // Catch: java.lang.Throwable -> L5d
        L180:
            r11.length()     // Catch: java.lang.Throwable -> L5d
            return
        L184:
            com.umeng.commonsdk.statistics.common.MLog.e(r0)
            return
    }

    private void f(java.lang.Object r8) {
            r7 = this;
            org.json.JSONObject r8 = (org.json.JSONObject) r8     // Catch: java.lang.Throwable -> L81
            if (r8 == 0) goto L8b
            int r0 = r8.length()     // Catch: java.lang.Throwable -> L81
            if (r0 > 0) goto Lc
            goto L8b
        Lc:
            java.lang.String r0 = "ts"
            long r0 = r8.getLong(r0)     // Catch: java.lang.Throwable -> L81
            android.content.Context r8 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L81
            r7.b(r8)     // Catch: java.lang.Throwable -> L81
            r7.d()     // Catch: java.lang.Throwable -> L81
            android.content.Context r8 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L81
            java.lang.String[] r8 = com.umeng.analytics.c.a(r8)     // Catch: java.lang.Throwable -> L81
            if (r8 == 0) goto L8b
            r2 = 0
            r3 = r8[r2]     // Catch: java.lang.Throwable -> L81
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L81
            if (r3 != 0) goto L8b
            r3 = 1
            r8 = r8[r3]     // Catch: java.lang.Throwable -> L81
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L81
            if (r8 != 0) goto L8b
            com.umeng.analytics.pro.u r8 = com.umeng.analytics.pro.u.a()     // Catch: java.lang.Throwable -> L81
            android.content.Context r4 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L81
            r8.a(r4, r0)     // Catch: java.lang.Throwable -> L81
            com.umeng.analytics.pro.y r8 = com.umeng.analytics.pro.y.a()     // Catch: java.lang.Throwable -> L81
            android.content.Context r4 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L81
            java.lang.String r8 = r8.c(r4)     // Catch: java.lang.Throwable -> L81
            java.lang.String r4 = "MobclickRT"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L81
            r5.<init>()     // Catch: java.lang.Throwable -> L81
            java.lang.String r6 = "--->>> onProfileSignIn: force generate new session: session id = "
            r5.append(r6)     // Catch: java.lang.Throwable -> L81
            r5.append(r8)     // Catch: java.lang.Throwable -> L81
            java.lang.String r8 = r5.toString()     // Catch: java.lang.Throwable -> L81
            com.umeng.commonsdk.debug.UMRTLog.i(r4, r8)     // Catch: java.lang.Throwable -> L81
            com.umeng.analytics.pro.u r8 = com.umeng.analytics.pro.u.a()     // Catch: java.lang.Throwable -> L81
            android.content.Context r4 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L81
            boolean r8 = r8.b(r4, r0, r2)     // Catch: java.lang.Throwable -> L81
            android.content.Context r2 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L81
            com.umeng.analytics.c.b(r2)     // Catch: java.lang.Throwable -> L81
            com.umeng.analytics.pro.u r2 = com.umeng.analytics.pro.u.a()     // Catch: java.lang.Throwable -> L81
            android.content.Context r4 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L81
            r2.a(r4, r0, r3)     // Catch: java.lang.Throwable -> L81
            if (r8 == 0) goto L8b
            com.umeng.analytics.pro.u r8 = com.umeng.analytics.pro.u.a()     // Catch: java.lang.Throwable -> L81
            android.content.Context r2 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L81
            r8.b(r2, r0)     // Catch: java.lang.Throwable -> L81
            return
        L81:
            r8 = move-exception
            boolean r0 = com.umeng.commonsdk.statistics.common.MLog.DEBUG
            if (r0 == 0) goto L8b
            java.lang.String r0 = " Excepthon  in  onProfileSignOff"
            com.umeng.commonsdk.statistics.common.MLog.e(r0, r8)
        L8b:
            return
    }

    private void f(org.json.JSONObject r6) {
            r5 = this;
            java.lang.String r0 = "header"
            java.lang.String r0 = com.umeng.commonsdk.statistics.b.a(r0)     // Catch: java.lang.Exception -> Lb9
            org.json.JSONObject r0 = r6.getJSONObject(r0)     // Catch: java.lang.Exception -> Lb9
            java.lang.String r1 = "eof"
            boolean r0 = r0.has(r1)     // Catch: java.lang.Exception -> Lb9
            r1 = 0
            java.lang.String r2 = "sessions"
            java.lang.String r3 = "analytics"
            java.lang.String r4 = "content"
            if (r0 == 0) goto L7c
            boolean r0 = r6.has(r4)     // Catch: java.lang.Exception -> Lb9
            if (r0 == 0) goto L23
            org.json.JSONObject r6 = r6.getJSONObject(r4)     // Catch: java.lang.Exception -> Lb9
        L23:
            java.lang.String r0 = com.umeng.commonsdk.statistics.b.a(r3)     // Catch: java.lang.Exception -> Lb9
            boolean r0 = r6.has(r0)     // Catch: java.lang.Exception -> Lb9
            java.lang.String r4 = "MobclickRT"
            if (r0 == 0) goto L61
            java.lang.String r0 = com.umeng.commonsdk.statistics.b.a(r3)     // Catch: java.lang.Exception -> Lb9
            org.json.JSONObject r6 = r6.getJSONObject(r0)     // Catch: java.lang.Exception -> Lb9
            boolean r0 = r6.has(r2)     // Catch: java.lang.Exception -> Lb9
            if (r0 == 0) goto L61
            org.json.JSONArray r6 = r6.getJSONArray(r2)     // Catch: java.lang.Exception -> Lb9
            org.json.JSONObject r6 = r6.optJSONObject(r1)     // Catch: java.lang.Exception -> Lb9
            if (r6 == 0) goto L61
            java.lang.String r0 = "id"
            java.lang.String r6 = r6.optString(r0)     // Catch: java.lang.Exception -> Lb9
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> Lb9
            if (r0 != 0) goto L61
            java.lang.String r0 = "--->>> removeAllInstantData: really delete instant session data"
            com.umeng.commonsdk.debug.UMRTLog.i(r4, r0)     // Catch: java.lang.Exception -> Lb9
            android.content.Context r0 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Exception -> Lb9
            com.umeng.analytics.pro.i r0 = com.umeng.analytics.pro.i.a(r0)     // Catch: java.lang.Exception -> Lb9
            r0.b(r6)     // Catch: java.lang.Exception -> Lb9
        L61:
            android.content.Context r6 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Exception -> Lb9
            com.umeng.analytics.pro.i r6 = com.umeng.analytics.pro.i.a(r6)     // Catch: java.lang.Exception -> Lb9
            r6.b()     // Catch: java.lang.Exception -> Lb9
            java.lang.String r6 = "--->>> removeAllInstantData: send INSTANT_SESSION_START_CONTINUE event because OVERSIZE."
            com.umeng.commonsdk.debug.UMRTLog.i(r4, r6)     // Catch: java.lang.Exception -> Lb9
            android.content.Context r6 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Exception -> Lb9
            com.umeng.analytics.CoreProtocol r0 = com.umeng.analytics.CoreProtocol.getInstance(r6)     // Catch: java.lang.Exception -> Lb9
            r1 = 0
            r2 = 4353(0x1101, float:6.1E-42)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r6, r2, r0, r1)     // Catch: java.lang.Exception -> Lb9
            return
        L7c:
            boolean r0 = r6.has(r4)     // Catch: java.lang.Exception -> Lb9
            if (r0 == 0) goto L86
            org.json.JSONObject r6 = r6.getJSONObject(r4)     // Catch: java.lang.Exception -> Lb9
        L86:
            java.lang.String r0 = com.umeng.commonsdk.statistics.b.a(r3)     // Catch: java.lang.Exception -> Lb9
            boolean r0 = r6.has(r0)     // Catch: java.lang.Exception -> Lb9
            if (r0 == 0) goto Lb0
            java.lang.String r0 = com.umeng.commonsdk.statistics.b.a(r3)     // Catch: java.lang.Exception -> Lb9
            org.json.JSONObject r6 = r6.optJSONObject(r0)     // Catch: java.lang.Exception -> Lb9
            if (r6 == 0) goto Lb0
            int r0 = r6.length()     // Catch: java.lang.Exception -> Lb9
            if (r0 <= 0) goto Lb0
            boolean r6 = r6.has(r2)     // Catch: java.lang.Exception -> Lb9
            if (r6 == 0) goto Lb0
            android.content.Context r6 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Exception -> Lb9
            com.umeng.analytics.pro.i r6 = com.umeng.analytics.pro.i.a(r6)     // Catch: java.lang.Exception -> Lb9
            r0 = 1
            r6.a(r0, r1)     // Catch: java.lang.Exception -> Lb9
        Lb0:
            android.content.Context r6 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Exception -> Lb9
            com.umeng.analytics.pro.i r6 = com.umeng.analytics.pro.i.a(r6)     // Catch: java.lang.Exception -> Lb9
            r6.b()     // Catch: java.lang.Exception -> Lb9
        Lb9:
            return
    }

    static /* synthetic */ android.content.Context g() {
            android.content.Context r0 = com.umeng.analytics.pro.o.a
            return r0
    }

    private void g(java.lang.Object r9) {
            r8 = this;
            android.content.Context r0 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L8b
            r8.b(r0)     // Catch: java.lang.Throwable -> L8b
            r8.d()     // Catch: java.lang.Throwable -> L8b
            org.json.JSONObject r9 = (org.json.JSONObject) r9     // Catch: java.lang.Throwable -> L8b
            if (r9 == 0) goto L8b
            int r0 = r9.length()     // Catch: java.lang.Throwable -> L8b
            if (r0 > 0) goto L13
            goto L8b
        L13:
            java.lang.String r0 = "provider"
            java.lang.String r0 = r9.getString(r0)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r1 = "uid"
            java.lang.String r1 = r9.getString(r1)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r2 = "ts"
            long r2 = r9.getLong(r2)     // Catch: java.lang.Throwable -> L8b
            android.content.Context r9 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L8b
            java.lang.String[] r9 = com.umeng.analytics.c.a(r9)     // Catch: java.lang.Throwable -> L8b
            r4 = 1
            r5 = 0
            if (r9 == 0) goto L3f
            r6 = r9[r5]     // Catch: java.lang.Throwable -> L8b
            boolean r6 = r0.equals(r6)     // Catch: java.lang.Throwable -> L8b
            if (r6 == 0) goto L3f
            r9 = r9[r4]     // Catch: java.lang.Throwable -> L8b
            boolean r9 = r1.equals(r9)     // Catch: java.lang.Throwable -> L8b
            if (r9 != 0) goto L8b
        L3f:
            com.umeng.analytics.pro.u r9 = com.umeng.analytics.pro.u.a()     // Catch: java.lang.Throwable -> L8b
            android.content.Context r6 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L8b
            r9.a(r6, r2)     // Catch: java.lang.Throwable -> L8b
            com.umeng.analytics.pro.y r9 = com.umeng.analytics.pro.y.a()     // Catch: java.lang.Throwable -> L8b
            android.content.Context r6 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L8b
            java.lang.String r9 = r9.c(r6)     // Catch: java.lang.Throwable -> L8b
            com.umeng.analytics.pro.u r6 = com.umeng.analytics.pro.u.a()     // Catch: java.lang.Throwable -> L8b
            android.content.Context r7 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L8b
            boolean r5 = r6.b(r7, r2, r5)     // Catch: java.lang.Throwable -> L8b
            android.content.Context r6 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L8b
            com.umeng.analytics.c.a(r6, r0, r1)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r0 = "MobclickRT"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8b
            r1.<init>()     // Catch: java.lang.Throwable -> L8b
            java.lang.String r6 = "--->>> onProfileSignIn: force generate new session: session id = "
            r1.append(r6)     // Catch: java.lang.Throwable -> L8b
            r1.append(r9)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r9 = r1.toString()     // Catch: java.lang.Throwable -> L8b
            com.umeng.commonsdk.debug.UMRTLog.i(r0, r9)     // Catch: java.lang.Throwable -> L8b
            com.umeng.analytics.pro.u r9 = com.umeng.analytics.pro.u.a()     // Catch: java.lang.Throwable -> L8b
            android.content.Context r0 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L8b
            r9.a(r0, r2, r4)     // Catch: java.lang.Throwable -> L8b
            if (r5 == 0) goto L8b
            com.umeng.analytics.pro.u r9 = com.umeng.analytics.pro.u.a()     // Catch: java.lang.Throwable -> L8b
            android.content.Context r0 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L8b
            r9.b(r0, r2)     // Catch: java.lang.Throwable -> L8b
        L8b:
            return
    }

    private void g(org.json.JSONObject r7) {
            r6 = this;
            java.lang.String r0 = "header"
            java.lang.String r0 = com.umeng.commonsdk.statistics.b.a(r0)     // Catch: java.lang.Exception -> Lcf
            org.json.JSONObject r0 = r7.getJSONObject(r0)     // Catch: java.lang.Exception -> Lcf
            java.lang.String r1 = "eof"
            boolean r0 = r0.has(r1)     // Catch: java.lang.Exception -> Lcf
            r1 = 0
            r2 = 1
            java.lang.String r3 = "sessions"
            java.lang.String r4 = "analytics"
            java.lang.String r5 = "content"
            if (r0 == 0) goto L69
            boolean r0 = r7.has(r5)     // Catch: java.lang.Exception -> Lcf
            if (r0 == 0) goto L24
            org.json.JSONObject r7 = r7.getJSONObject(r5)     // Catch: java.lang.Exception -> Lcf
        L24:
            java.lang.String r0 = com.umeng.commonsdk.statistics.b.a(r4)     // Catch: java.lang.Exception -> Lcf
            boolean r0 = r7.has(r0)     // Catch: java.lang.Exception -> Lcf
            if (r0 == 0) goto Lcf
            java.lang.String r0 = com.umeng.commonsdk.statistics.b.a(r4)     // Catch: java.lang.Exception -> Lcf
            org.json.JSONObject r7 = r7.getJSONObject(r0)     // Catch: java.lang.Exception -> Lcf
            boolean r7 = r7.has(r3)     // Catch: java.lang.Exception -> Lcf
            if (r7 == 0) goto L61
            android.content.Context r7 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Exception -> Lcf
            com.umeng.analytics.pro.i r7 = com.umeng.analytics.pro.i.a(r7)     // Catch: java.lang.Exception -> Lcf
            r7.i()     // Catch: java.lang.Exception -> Lcf
            android.content.Context r7 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Exception -> Lcf
            com.umeng.analytics.pro.i r7 = com.umeng.analytics.pro.i.a(r7)     // Catch: java.lang.Exception -> Lcf
            r7.h()     // Catch: java.lang.Exception -> Lcf
            android.content.Context r7 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Exception -> Lcf
            com.umeng.analytics.pro.i r7 = com.umeng.analytics.pro.i.a(r7)     // Catch: java.lang.Exception -> Lcf
            r7.b(r2, r1)     // Catch: java.lang.Exception -> Lcf
            android.content.Context r7 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Exception -> Lcf
            com.umeng.analytics.pro.i r7 = com.umeng.analytics.pro.i.a(r7)     // Catch: java.lang.Exception -> Lcf
            r7.a()     // Catch: java.lang.Exception -> Lcf
            return
        L61:
            java.lang.String r7 = "MobclickRT"
            java.lang.String r0 = "--->>> Error, Should not go to this branch."
            com.umeng.commonsdk.debug.UMRTLog.i(r7, r0)     // Catch: java.lang.Exception -> Lcf
            return
        L69:
            boolean r0 = r7.has(r5)     // Catch: java.lang.Exception -> Lcf
            if (r0 == 0) goto L73
            org.json.JSONObject r7 = r7.getJSONObject(r5)     // Catch: java.lang.Exception -> Lcf
        L73:
            java.lang.String r0 = com.umeng.commonsdk.statistics.b.a(r4)     // Catch: java.lang.Exception -> Lcf
            boolean r0 = r7.has(r0)     // Catch: java.lang.Exception -> Lcf
            if (r0 == 0) goto Lc6
            java.lang.String r0 = com.umeng.commonsdk.statistics.b.a(r4)     // Catch: java.lang.Exception -> Lcf
            org.json.JSONObject r7 = r7.optJSONObject(r0)     // Catch: java.lang.Exception -> Lcf
            if (r7 == 0) goto Lc6
            int r0 = r7.length()     // Catch: java.lang.Exception -> Lcf
            if (r0 <= 0) goto Lc6
            boolean r0 = r7.has(r3)     // Catch: java.lang.Exception -> Lcf
            if (r0 == 0) goto L9c
            android.content.Context r0 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Exception -> Lcf
            com.umeng.analytics.pro.i r0 = com.umeng.analytics.pro.i.a(r0)     // Catch: java.lang.Exception -> Lcf
            r0.b(r2, r1)     // Catch: java.lang.Exception -> Lcf
        L9c:
            java.lang.String r0 = "ekv"
            boolean r0 = r7.has(r0)     // Catch: java.lang.Exception -> Lcf
            if (r0 != 0) goto Lac
            java.lang.String r0 = "gkv"
            boolean r0 = r7.has(r0)     // Catch: java.lang.Exception -> Lcf
            if (r0 == 0) goto Lb5
        Lac:
            android.content.Context r0 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Exception -> Lcf
            com.umeng.analytics.pro.i r0 = com.umeng.analytics.pro.i.a(r0)     // Catch: java.lang.Exception -> Lcf
            r0.h()     // Catch: java.lang.Exception -> Lcf
        Lb5:
            java.lang.String r0 = "error"
            boolean r7 = r7.has(r0)     // Catch: java.lang.Exception -> Lcf
            if (r7 == 0) goto Lc6
            android.content.Context r7 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Exception -> Lcf
            com.umeng.analytics.pro.i r7 = com.umeng.analytics.pro.i.a(r7)     // Catch: java.lang.Exception -> Lcf
            r7.i()     // Catch: java.lang.Exception -> Lcf
        Lc6:
            android.content.Context r7 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Exception -> Lcf
            com.umeng.analytics.pro.i r7 = com.umeng.analytics.pro.i.a(r7)     // Catch: java.lang.Exception -> Lcf
            r7.a()     // Catch: java.lang.Exception -> Lcf
        Lcf:
            return
    }

    private static void h() {
            java.lang.String r0 = "com.umeng.umcrash.UMCrashUtils"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L1d
            com.umeng.analytics.pro.o.y = r0     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = "setPuidAndProvider"
            r2 = 2
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L1d
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Throwable -> L1d
            r4 = 1
            r2[r4] = r3     // Catch: java.lang.Throwable -> L1d
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1d
            com.umeng.analytics.pro.o.z = r0     // Catch: java.lang.Throwable -> L1d
        L1d:
            return
    }

    private void h(java.lang.Object r4) {
            r3 = this;
            java.lang.String r0 = "__ii"
            r1 = r4
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L2e
            int r2 = r1.length()     // Catch: java.lang.Throwable -> L2e
            if (r2 <= 0) goto L2e
            boolean r2 = r1.has(r0)     // Catch: java.lang.Throwable -> L2e
            if (r2 == 0) goto L2e
            java.lang.String r2 = r1.optString(r0)     // Catch: java.lang.Throwable -> L2e
            r1.remove(r0)     // Catch: java.lang.Throwable -> L2e
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L2e
            if (r0 != 0) goto L2e
            android.content.Context r0 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L2e
            com.umeng.analytics.pro.i r0 = com.umeng.analytics.pro.i.a(r0)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L2e
            r1 = 2
            r0.a(r2, r4, r1)     // Catch: java.lang.Throwable -> L2e
        L2e:
            return
    }

    private void i() {
            r5 = this;
            java.lang.String r0 = "exception"
            android.content.Context r1 = com.umeng.analytics.pro.o.a
            long r1 = com.umeng.commonsdk.framework.UMEnvelopeBuild.maxDataSpace(r1)
            org.json.JSONObject r1 = r5.b(r1)
            if (r1 == 0) goto L69
            int r2 = r1.length()
            r3 = 1
            if (r2 >= r3) goto L16
            goto L69
        L16:
            java.lang.String r2 = "header"
            java.lang.Object r2 = r1.opt(r2)
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            java.lang.String r3 = "content"
            java.lang.Object r1 = r1.opt(r3)
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            android.content.Context r3 = com.umeng.analytics.pro.o.a
            if (r3 == 0) goto L69
            if (r2 == 0) goto L69
            if (r1 == 0) goto L69
            java.lang.String r3 = "--->>> constructInstantMessage: request build envelope."
            java.lang.String r4 = "MobclickRT"
            com.umeng.commonsdk.debug.UMRTLog.i(r4, r3)
            android.content.Context r3 = com.umeng.analytics.pro.o.a
            org.json.JSONObject r1 = com.umeng.commonsdk.framework.UMEnvelopeBuild.buildEnvelopeWithExtHeader(r3, r2, r1)
            if (r1 == 0) goto L69
            boolean r2 = r1.has(r0)     // Catch: java.lang.Throwable -> L5c
            if (r2 == 0) goto L5d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r2.<init>()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r3 = "Build envelope error code: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L5c
            int r0 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L5c
            r2.append(r0)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L5c
            com.umeng.commonsdk.debug.UMRTLog.i(r4, r0)     // Catch: java.lang.Throwable -> L5c
            goto L5d
        L5c:
        L5d:
            boolean r0 = com.umeng.commonsdk.UMConfigure.isDebugLog()
            if (r0 == 0) goto L66
            r5.e(r1)
        L66:
            r5.b(r1)
        L69:
            return
    }

    private void j() {
            r5 = this;
            java.lang.String r0 = "exception"
            android.content.Context r1 = com.umeng.analytics.pro.o.a
            long r1 = com.umeng.commonsdk.framework.UMEnvelopeBuild.maxDataSpace(r1)
            org.json.JSONObject r1 = r5.a(r1)
            if (r1 == 0) goto L62
            int r2 = r1.length()
            r3 = 1
            if (r2 >= r3) goto L16
            goto L62
        L16:
            java.lang.String r2 = "header"
            java.lang.Object r2 = r1.opt(r2)
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            java.lang.String r3 = "content"
            java.lang.Object r1 = r1.opt(r3)
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            android.content.Context r3 = com.umeng.analytics.pro.o.a
            if (r3 == 0) goto L62
            if (r2 == 0) goto L62
            if (r1 == 0) goto L62
            org.json.JSONObject r1 = com.umeng.commonsdk.framework.UMEnvelopeBuild.buildEnvelopeWithExtHeader(r3, r2, r1)
            if (r1 == 0) goto L62
            boolean r2 = r1.has(r0)     // Catch: java.lang.Throwable -> L55
            if (r2 == 0) goto L56
            java.lang.String r2 = "MobclickRT"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55
            r3.<init>()     // Catch: java.lang.Throwable -> L55
            java.lang.String r4 = "Build envelope error code: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L55
            int r0 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L55
            r3.append(r0)     // Catch: java.lang.Throwable -> L55
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L55
            com.umeng.commonsdk.debug.UMRTLog.i(r2, r0)     // Catch: java.lang.Throwable -> L55
            goto L56
        L55:
        L56:
            boolean r0 = com.umeng.commonsdk.UMConfigure.isDebugLog()
            if (r0 == 0) goto L5f
            r5.d(r1)
        L5f:
            r5.a(r1)
        L62:
            return
    }

    private org.json.JSONObject k() {
            r3 = this;
            org.json.JSONObject r0 = r3.l()
            if (r0 == 0) goto Ld
            java.lang.String r1 = "st"
            java.lang.String r2 = "1"
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Ld
        Ld:
            return r0
    }

    private org.json.JSONObject l() {
            r11 = this;
            java.lang.String r0 = "vers_name"
            java.lang.String r1 = "$ud_da"
            java.lang.String r2 = "$pr_ve"
            java.lang.String r3 = ""
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r5 = com.umeng.analytics.AnalyticsConfig.mWrapperType     // Catch: java.lang.Throwable -> L186
            if (r5 == 0) goto L2b
            java.lang.String r5 = com.umeng.analytics.AnalyticsConfig.mWrapperVersion     // Catch: java.lang.Throwable -> L186
            if (r5 == 0) goto L2b
            java.lang.String r5 = "wrapper_version"
            java.lang.String r5 = com.umeng.commonsdk.statistics.b.a(r5)     // Catch: java.lang.Throwable -> L186
            java.lang.String r6 = com.umeng.analytics.AnalyticsConfig.mWrapperVersion     // Catch: java.lang.Throwable -> L186
            r4.put(r5, r6)     // Catch: java.lang.Throwable -> L186
            java.lang.String r5 = "wrapper_type"
            java.lang.String r5 = com.umeng.commonsdk.statistics.b.a(r5)     // Catch: java.lang.Throwable -> L186
            java.lang.String r6 = com.umeng.analytics.AnalyticsConfig.mWrapperType     // Catch: java.lang.Throwable -> L186
            r4.put(r5, r6)     // Catch: java.lang.Throwable -> L186
        L2b:
            android.content.Context r5 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L186
            int r5 = com.umeng.analytics.AnalyticsConfig.getVerticalType(r5)     // Catch: java.lang.Throwable -> L186
            java.lang.String r6 = "vertical_type"
            java.lang.String r6 = com.umeng.commonsdk.statistics.b.a(r6)     // Catch: java.lang.Throwable -> L186
            r4.put(r6, r5)     // Catch: java.lang.Throwable -> L186
            r6 = 1
            java.lang.String r7 = "sdk_version"
            java.lang.String r8 = "9.6.5"
            if (r5 != r6) goto L57
            android.content.Context r5 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L186
            java.lang.String r5 = com.umeng.analytics.AnalyticsConfig.getGameSdkVersion(r5)     // Catch: java.lang.Throwable -> L186
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L186
            if (r6 == 0) goto L4e
            goto L4f
        L4e:
            r8 = r5
        L4f:
            java.lang.String r5 = com.umeng.commonsdk.statistics.b.a(r7)     // Catch: java.lang.Throwable -> L186
            r4.put(r5, r8)     // Catch: java.lang.Throwable -> L186
            goto L5e
        L57:
            java.lang.String r5 = com.umeng.commonsdk.statistics.b.a(r7)     // Catch: java.lang.Throwable -> L186
            r4.put(r5, r8)     // Catch: java.lang.Throwable -> L186
        L5e:
            android.content.Context r5 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L186
            java.lang.String r5 = com.umeng.analytics.AnalyticsConfig.getSecretKey(r5)     // Catch: java.lang.Throwable -> L186
            java.lang.String r5 = com.umeng.commonsdk.statistics.common.HelperUtils.MD5(r5)     // Catch: java.lang.Throwable -> L186
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L186
            if (r6 != 0) goto L77
            java.lang.String r6 = "secret"
            java.lang.String r6 = com.umeng.commonsdk.statistics.b.a(r6)     // Catch: java.lang.Throwable -> L186
            r4.put(r6, r5)     // Catch: java.lang.Throwable -> L186
        L77:
            android.content.Context r5 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L186
            java.lang.String r6 = "pr_ve"
            r7 = 0
            java.lang.String r5 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r5, r6, r7)     // Catch: java.lang.Throwable -> L186
            android.content.Context r6 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L186
            android.content.SharedPreferences r6 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r6)     // Catch: java.lang.Throwable -> L186
            android.content.Context r7 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L186
            java.lang.String r8 = "ekv_bl_ver"
            java.lang.String r7 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r7, r8, r3)     // Catch: java.lang.Throwable -> L186
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L186
            if (r8 != 0) goto La9
            boolean r8 = com.umeng.analytics.AnalyticsConfig.CLEAR_EKV_BL     // Catch: java.lang.Throwable -> L186
            java.lang.String r9 = "$ekv_bl_ver"
            if (r8 == 0) goto La2
            java.lang.String r7 = com.umeng.commonsdk.statistics.b.a(r9)     // Catch: java.lang.Throwable -> L186
            r4.put(r7, r3)     // Catch: java.lang.Throwable -> L186
            goto La9
        La2:
            java.lang.String r8 = com.umeng.commonsdk.statistics.b.a(r9)     // Catch: java.lang.Throwable -> L186
            r4.put(r8, r7)     // Catch: java.lang.Throwable -> L186
        La9:
            android.content.Context r7 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L186
            java.lang.String r8 = "ekv_wl_ver"
            java.lang.String r7 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r7, r8, r3)     // Catch: java.lang.Throwable -> L186
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L186
            if (r8 != 0) goto Lcc
            boolean r8 = com.umeng.analytics.AnalyticsConfig.CLEAR_EKV_WL     // Catch: java.lang.Throwable -> L186
            java.lang.String r9 = "$ekv_wl_ver"
            if (r8 == 0) goto Lc5
            java.lang.String r7 = com.umeng.commonsdk.statistics.b.a(r9)     // Catch: java.lang.Throwable -> L186
            r4.put(r7, r3)     // Catch: java.lang.Throwable -> L186
            goto Lcc
        Lc5:
            java.lang.String r8 = com.umeng.commonsdk.statistics.b.a(r9)     // Catch: java.lang.Throwable -> L186
            r4.put(r8, r7)     // Catch: java.lang.Throwable -> L186
        Lcc:
            java.lang.String r7 = "pro_ver"
            java.lang.String r7 = com.umeng.commonsdk.statistics.b.a(r7)     // Catch: java.lang.Throwable -> L186
            java.lang.String r8 = "1.0.0"
            r4.put(r7, r8)     // Catch: java.lang.Throwable -> L186
            boolean r7 = r11.s()     // Catch: java.lang.Throwable -> L186
            if (r7 == 0) goto Lf9
            java.lang.String r7 = "atm"
            java.lang.String r7 = com.umeng.commonsdk.statistics.b.a(r7)     // Catch: java.lang.Throwable -> L186
            java.lang.String r8 = "1"
            r4.put(r7, r8)     // Catch: java.lang.Throwable -> L186
            if (r6 == 0) goto Lf9
            android.content.SharedPreferences$Editor r7 = r6.edit()     // Catch: java.lang.Throwable -> L186
            java.lang.String r8 = "ana_is_f"
            r9 = 0
            android.content.SharedPreferences$Editor r7 = r7.putLong(r8, r9)     // Catch: java.lang.Throwable -> L186
            r7.commit()     // Catch: java.lang.Throwable -> L186
        Lf9:
            java.lang.String r7 = com.umeng.commonsdk.statistics.b.a(r2)     // Catch: java.lang.Throwable -> L186
            java.lang.String r8 = r11.m()     // Catch: java.lang.Throwable -> L186
            r4.put(r7, r8)     // Catch: java.lang.Throwable -> L186
            java.lang.String r7 = com.umeng.commonsdk.statistics.b.a(r1)     // Catch: java.lang.Throwable -> L186
            java.lang.String r8 = r11.n()     // Catch: java.lang.Throwable -> L186
            r4.put(r7, r8)     // Catch: java.lang.Throwable -> L186
            if (r6 == 0) goto L186
            java.lang.String r3 = r6.getString(r0, r3)     // Catch: java.lang.Throwable -> L186
            boolean r7 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L186
            if (r7 != 0) goto L186
            java.text.SimpleDateFormat r7 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L186
            java.lang.String r8 = "yyyy-MM-dd"
            java.util.Locale r9 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L186
            r7.<init>(r8, r9)     // Catch: java.lang.Throwable -> L186
            java.util.Date r8 = new java.util.Date     // Catch: java.lang.Throwable -> L186
            long r9 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L186
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L186
            java.lang.String r7 = r7.format(r8)     // Catch: java.lang.Throwable -> L186
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L186
            java.lang.String r8 = "vers_date"
            java.lang.String r9 = "vers_pre_version"
            if (r5 == 0) goto L155
            java.lang.String r2 = com.umeng.commonsdk.statistics.b.a(r2)     // Catch: java.lang.Throwable -> L186
            java.lang.String r5 = "0"
            java.lang.String r5 = r6.getString(r9, r5)     // Catch: java.lang.Throwable -> L186
            r4.put(r2, r5)     // Catch: java.lang.Throwable -> L186
            java.lang.String r1 = com.umeng.commonsdk.statistics.b.a(r1)     // Catch: java.lang.Throwable -> L186
            java.lang.String r2 = r6.getString(r8, r7)     // Catch: java.lang.Throwable -> L186
            r4.put(r1, r2)     // Catch: java.lang.Throwable -> L186
        L155:
            android.content.Context r1 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L186
            java.lang.String r1 = com.umeng.commonsdk.statistics.common.DeviceConfig.getAppVersionName(r1)     // Catch: java.lang.Throwable -> L186
            android.content.SharedPreferences$Editor r2 = r6.edit()     // Catch: java.lang.Throwable -> L186
            java.lang.String r5 = "pre_version"
            android.content.SharedPreferences$Editor r2 = r2.putString(r5, r3)     // Catch: java.lang.Throwable -> L186
            java.lang.String r3 = "cur_version"
            android.content.SharedPreferences$Editor r1 = r2.putString(r3, r1)     // Catch: java.lang.Throwable -> L186
            java.lang.String r2 = "pre_date"
            android.content.SharedPreferences$Editor r1 = r1.putString(r2, r7)     // Catch: java.lang.Throwable -> L186
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)     // Catch: java.lang.Throwable -> L186
            java.lang.String r1 = "vers_code"
            android.content.SharedPreferences$Editor r0 = r0.remove(r1)     // Catch: java.lang.Throwable -> L186
            android.content.SharedPreferences$Editor r0 = r0.remove(r8)     // Catch: java.lang.Throwable -> L186
            android.content.SharedPreferences$Editor r0 = r0.remove(r9)     // Catch: java.lang.Throwable -> L186
            r0.commit()     // Catch: java.lang.Throwable -> L186
        L186:
            return r4
    }

    private java.lang.String m() {
            r8 = this;
            java.lang.String r0 = "0"
            java.lang.String r1 = ""
            java.lang.String r2 = "pre_version"
            r3 = 0
            android.content.Context r4 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L72
            java.lang.String r5 = "pr_ve"
            java.lang.String r3 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r4, r5, r3)     // Catch: java.lang.Throwable -> L72
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L72
            if (r4 == 0) goto L72
            java.lang.String r4 = r8.d     // Catch: java.lang.Throwable -> L72
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L72
            if (r4 != 0) goto L20
            java.lang.String r0 = r8.d     // Catch: java.lang.Throwable -> L72
            return r0
        L20:
            android.content.SharedPreferences r4 = r8.c     // Catch: java.lang.Throwable -> L72
            if (r4 != 0) goto L2c
            android.content.Context r4 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L72
            android.content.SharedPreferences r4 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r4)     // Catch: java.lang.Throwable -> L72
            r8.c = r4     // Catch: java.lang.Throwable -> L72
        L2c:
            android.content.SharedPreferences r4 = r8.c     // Catch: java.lang.Throwable -> L72
            java.lang.String r4 = r4.getString(r2, r1)     // Catch: java.lang.Throwable -> L72
            android.content.Context r5 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L72
            java.lang.String r5 = com.umeng.commonsdk.statistics.common.DeviceConfig.getAppVersionName(r5)     // Catch: java.lang.Throwable -> L72
            boolean r6 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L72
            java.lang.String r7 = "cur_version"
            if (r6 == 0) goto L52
            android.content.SharedPreferences r1 = r8.c     // Catch: java.lang.Throwable -> L72
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch: java.lang.Throwable -> L72
            android.content.SharedPreferences$Editor r1 = r1.putString(r2, r0)     // Catch: java.lang.Throwable -> L72
            android.content.SharedPreferences$Editor r1 = r1.putString(r7, r5)     // Catch: java.lang.Throwable -> L72
            r1.commit()     // Catch: java.lang.Throwable -> L72
            goto L73
        L52:
            android.content.SharedPreferences r0 = r8.c     // Catch: java.lang.Throwable -> L72
            java.lang.String r0 = r0.getString(r7, r1)     // Catch: java.lang.Throwable -> L72
            boolean r1 = r5.equals(r0)     // Catch: java.lang.Throwable -> L72
            if (r1 != 0) goto L70
            android.content.SharedPreferences r1 = r8.c     // Catch: java.lang.Throwable -> L72
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch: java.lang.Throwable -> L72
            android.content.SharedPreferences$Editor r1 = r1.putString(r2, r0)     // Catch: java.lang.Throwable -> L72
            android.content.SharedPreferences$Editor r1 = r1.putString(r7, r5)     // Catch: java.lang.Throwable -> L72
            r1.commit()     // Catch: java.lang.Throwable -> L72
            goto L73
        L70:
            r0 = r4
            goto L73
        L72:
            r0 = r3
        L73:
            r8.d = r0
            return r0
    }

    private java.lang.String n() {
            r7 = this;
            java.lang.String r0 = "pre_date"
            r1 = 0
            android.content.Context r2 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L87
            java.lang.String r3 = "ud_da"
            java.lang.String r1 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r2, r3, r1)     // Catch: java.lang.Throwable -> L87
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L87
            if (r2 == 0) goto L87
            java.lang.String r2 = r7.e     // Catch: java.lang.Throwable -> L87
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L87
            if (r2 != 0) goto L1c
            java.lang.String r0 = r7.e     // Catch: java.lang.Throwable -> L87
            return r0
        L1c:
            android.content.SharedPreferences r2 = r7.c     // Catch: java.lang.Throwable -> L87
            if (r2 != 0) goto L28
            android.content.Context r2 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L87
            android.content.SharedPreferences r2 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r2)     // Catch: java.lang.Throwable -> L87
            r7.c = r2     // Catch: java.lang.Throwable -> L87
        L28:
            android.content.SharedPreferences r2 = r7.c     // Catch: java.lang.Throwable -> L87
            java.lang.String r3 = ""
            java.lang.String r2 = r2.getString(r0, r3)     // Catch: java.lang.Throwable -> L87
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L87
            java.lang.String r4 = "yyyy-MM-dd"
            if (r3 == 0) goto L5d
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L87
            java.util.Locale r3 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L87
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L87
            java.util.Date r3 = new java.util.Date     // Catch: java.lang.Throwable -> L87
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L87
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L87
            java.lang.String r2 = r2.format(r3)     // Catch: java.lang.Throwable -> L87
            android.content.SharedPreferences r3 = r7.c     // Catch: java.lang.Throwable -> L87
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch: java.lang.Throwable -> L87
            android.content.SharedPreferences$Editor r0 = r3.putString(r0, r2)     // Catch: java.lang.Throwable -> L87
            r0.commit()     // Catch: java.lang.Throwable -> L87
        L5b:
            r1 = r2
            goto L87
        L5d:
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L87
            java.util.Locale r5 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L87
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L87
            java.util.Date r4 = new java.util.Date     // Catch: java.lang.Throwable -> L87
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L87
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L87
            java.lang.String r3 = r3.format(r4)     // Catch: java.lang.Throwable -> L87
            boolean r4 = r2.equals(r3)     // Catch: java.lang.Throwable -> L87
            if (r4 != 0) goto L5b
            android.content.SharedPreferences r2 = r7.c     // Catch: java.lang.Throwable -> L87
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Throwable -> L87
            android.content.SharedPreferences$Editor r0 = r2.putString(r0, r3)     // Catch: java.lang.Throwable -> L87
            r0.commit()     // Catch: java.lang.Throwable -> L87
            r1 = r3
        L87:
            r7.e = r1
            return r1
    }

    private void o() {
            r5 = this;
            r0 = 0
            r5.i = r0     // Catch: java.lang.Throwable -> L28
            r5.j = r0     // Catch: java.lang.Throwable -> L28
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L28
            r5.k = r1     // Catch: java.lang.Throwable -> L28
            android.content.Context r1 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L28
            android.content.SharedPreferences r1 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r1)     // Catch: java.lang.Throwable -> L28
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = "dstk_last_time"
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L28
            android.content.SharedPreferences$Editor r1 = r1.putLong(r2, r3)     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = "dstk_cnt"
            android.content.SharedPreferences$Editor r0 = r1.putInt(r2, r0)     // Catch: java.lang.Throwable -> L28
            r0.commit()     // Catch: java.lang.Throwable -> L28
        L28:
            return
    }

    private boolean p() {
            r4 = this;
            com.umeng.analytics.pro.u r0 = com.umeng.analytics.pro.u.a()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = r0.b()     // Catch: java.lang.Throwable -> L4c
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L4c
            if (r0 != 0) goto L13
            android.content.Context r0 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L4c
            r4.b(r0)     // Catch: java.lang.Throwable -> L4c
        L13:
            org.json.JSONArray r0 = r4.g     // Catch: java.lang.Throwable -> L4c
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L4c
            r1 = 0
            if (r0 <= 0) goto L4b
            r0 = 0
        L1d:
            org.json.JSONArray r2 = r4.g     // Catch: java.lang.Throwable -> L4c
            int r2 = r2.length()     // Catch: java.lang.Throwable -> L4c
            if (r0 >= r2) goto L4c
            org.json.JSONArray r2 = r4.g     // Catch: java.lang.Throwable -> L4c
            org.json.JSONObject r2 = r2.optJSONObject(r0)     // Catch: java.lang.Throwable -> L4c
            if (r2 == 0) goto L48
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L4c
            if (r3 <= 0) goto L48
            java.lang.String r3 = "__i"
            java.lang.String r2 = r2.optString(r3)     // Catch: java.lang.Throwable -> L4c
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L4c
            if (r3 != 0) goto L47
            java.lang.String r3 = "-1"
            boolean r2 = r3.equals(r2)     // Catch: java.lang.Throwable -> L4c
            if (r2 == 0) goto L48
        L47:
            return r1
        L48:
            int r0 = r0 + 1
            goto L1d
        L4b:
            return r1
        L4c:
            r0 = 1
            return r0
    }

    private void q() {
            r7 = this;
            java.lang.String r0 = "__i"
            org.json.JSONArray r1 = r7.g
            int r1 = r1.length()
            if (r1 <= 0) goto L57
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            r2 = 0
        L10:
            org.json.JSONArray r3 = r7.g
            int r3 = r3.length()
            if (r2 >= r3) goto L55
            org.json.JSONArray r3 = r7.g     // Catch: java.lang.Throwable -> L52
            org.json.JSONObject r3 = r3.getJSONObject(r2)     // Catch: java.lang.Throwable -> L52
            if (r3 == 0) goto L4f
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L52
            if (r4 <= 0) goto L4f
            java.lang.String r4 = r3.optString(r0)     // Catch: java.lang.Throwable -> L52
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L52
            java.lang.String r6 = "-1"
            if (r5 != 0) goto L38
            boolean r4 = r6.equals(r4)     // Catch: java.lang.Throwable -> L52
            if (r4 == 0) goto L4b
        L38:
            com.umeng.analytics.pro.u r4 = com.umeng.analytics.pro.u.a()     // Catch: java.lang.Throwable -> L52
            java.lang.String r4 = r4.b()     // Catch: java.lang.Throwable -> L52
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L52
            if (r5 == 0) goto L47
            goto L48
        L47:
            r6 = r4
        L48:
            r3.put(r0, r6)     // Catch: java.lang.Throwable -> L52
        L4b:
            r1.put(r3)     // Catch: java.lang.Throwable -> L52
            goto L52
        L4f:
            r1.put(r3)     // Catch: java.lang.Throwable -> L52
        L52:
            int r2 = r2 + 1
            goto L10
        L55:
            r7.g = r1
        L57:
            return
    }

    private void r() {
            r7 = this;
            java.lang.String r0 = "first_activate_time"
            boolean r1 = r7.s()     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L2b
            android.content.Context r1 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L2b
            android.content.SharedPreferences r1 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r1)     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L2b
            r2 = 0
            long r4 = r1.getLong(r0, r2)     // Catch: java.lang.Throwable -> L2b
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L2b
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L2b
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch: java.lang.Throwable -> L2b
            android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r2)     // Catch: java.lang.Throwable -> L2b
            r0.commit()     // Catch: java.lang.Throwable -> L2b
        L2b:
            return
    }

    private boolean s() {
            r5 = this;
            android.content.Context r0 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L1a
            android.content.SharedPreferences r0 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r0)     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L1a
            java.lang.String r1 = "ana_is_f"
            r2 = -1
            long r0 = r0.getLong(r1, r2)     // Catch: java.lang.Throwable -> L1a
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1a
            r0 = 1
            return r0
        L1a:
            r0 = 0
            return r0
    }

    public org.json.JSONObject a(long r9) {
            r8 = this;
            com.umeng.analytics.pro.y r0 = com.umeng.analytics.pro.y.a()
            android.content.Context r1 = com.umeng.analytics.pro.o.a
            java.lang.String r0 = r0.d(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            if (r0 == 0) goto L12
            return r1
        L12:
            r0 = 0
            org.json.JSONObject r0 = r8.b(r0)
            com.umeng.analytics.pro.r r2 = com.umeng.analytics.pro.r.a()
            android.content.Context r3 = com.umeng.analytics.pro.o.a
            int r2 = r2.a(r3)
            int r3 = r0.length()
            r4 = 3
            if (r3 > 0) goto L2b
            if (r2 == r4) goto L91
            return r1
        L2b:
            int r3 = r0.length()
            r5 = 1
            java.lang.String r6 = "userlevel"
            java.lang.String r7 = "active_user"
            if (r3 != r5) goto L4c
            org.json.JSONObject r3 = r0.optJSONObject(r7)
            if (r3 == 0) goto L3f
            if (r2 == r4) goto L3f
            return r1
        L3f:
            java.lang.String r3 = r0.optString(r6)
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L66
            if (r2 == r4) goto L66
            return r1
        L4c:
            int r3 = r0.length()
            r5 = 2
            if (r3 != r5) goto L66
            org.json.JSONObject r3 = r0.optJSONObject(r7)
            if (r3 == 0) goto L66
            java.lang.String r3 = r0.optString(r6)
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L66
            if (r2 == r4) goto L66
            return r1
        L66:
            java.lang.String r3 = "sessions"
            java.lang.String r3 = r0.optString(r3)
            java.lang.String r5 = "gkv"
            java.lang.String r5 = r0.optString(r5)
            java.lang.String r6 = "ekv"
            java.lang.String r6 = r0.optString(r6)
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L91
            boolean r3 = android.text.TextUtils.isEmpty(r5)
            if (r3 == 0) goto L91
            boolean r3 = android.text.TextUtils.isEmpty(r6)
            if (r3 != 0) goto L91
            boolean r3 = r8.a(r0)
            if (r3 == 0) goto L91
            return r1
        L91:
            org.json.JSONObject r1 = r8.l()
            if (r1 == 0) goto L9a
            r8.c(r1)
        L9a:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Ld7
            r5.<init>()     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r6 = "analytics"
            if (r2 != r4) goto Lb1
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Ld7
            r0.<init>()     // Catch: java.lang.Throwable -> Ld7
            r5.put(r6, r0)     // Catch: java.lang.Throwable -> Ld7
            goto Lba
        Lb1:
            int r2 = r0.length()     // Catch: java.lang.Throwable -> Ld7
            if (r2 <= 0) goto Lba
            r5.put(r6, r0)     // Catch: java.lang.Throwable -> Ld7
        Lba:
            if (r1 == 0) goto Lc7
            int r0 = r1.length()     // Catch: java.lang.Throwable -> Ld7
            if (r0 <= 0) goto Lc7
            java.lang.String r0 = "header"
            r3.put(r0, r1)     // Catch: java.lang.Throwable -> Ld7
        Lc7:
            int r0 = r5.length()     // Catch: java.lang.Throwable -> Ld7
            if (r0 <= 0) goto Ld2
            java.lang.String r0 = "content"
            r3.put(r0, r5)     // Catch: java.lang.Throwable -> Ld7
        Ld2:
            org.json.JSONObject r9 = r8.a(r3, r9)     // Catch: java.lang.Throwable -> Ld7
            return r9
        Ld7:
            return r3
    }

    public void a() {
            r5 = this;
            android.content.Context r0 = com.umeng.analytics.pro.o.a
            if (r0 == 0) goto L3d
            java.lang.Object r0 = r5.w
            monitor-enter(r0)
            boolean r1 = r5.u     // Catch: java.lang.Throwable -> L1f
            r2 = 0
            if (r1 == 0) goto L21
            java.lang.String r1 = "MobclickRT"
            java.lang.String r3 = "--->>> network is now available, rebuild instant session data packet."
            com.umeng.commonsdk.debug.UMRTLog.i(r1, r3)     // Catch: java.lang.Throwable -> L1f
            android.content.Context r1 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L1f
            com.umeng.analytics.CoreProtocol r3 = com.umeng.analytics.CoreProtocol.getInstance(r1)     // Catch: java.lang.Throwable -> L1f
            r4 = 4353(0x1101, float:6.1E-42)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r1, r4, r3, r2)     // Catch: java.lang.Throwable -> L1f
            goto L21
        L1f:
            r1 = move-exception
            goto L3b
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r1 = r5.w
            monitor-enter(r1)
            boolean r0 = r5.v     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L37
            android.content.Context r0 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L35
            com.umeng.analytics.CoreProtocol r3 = com.umeng.analytics.CoreProtocol.getInstance(r0)     // Catch: java.lang.Throwable -> L35
            r4 = 4354(0x1102, float:6.101E-42)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r0, r4, r3, r2)     // Catch: java.lang.Throwable -> L35
            goto L37
        L35:
            r0 = move-exception
            goto L39
        L37:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L35
            return
        L39:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L35
            throw r0
        L3b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r1
        L3d:
            return
    }

    public void a(java.lang.Object r3) {
            r2 = this;
            java.lang.String r0 = "exception"
            if (r3 == 0) goto L22
            org.json.JSONObject r3 = (org.json.JSONObject) r3     // Catch: java.lang.Throwable -> L22
            int r1 = r3.length()     // Catch: java.lang.Throwable -> L22
            if (r1 <= 0) goto L22
            boolean r1 = r3.has(r0)     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L1f
            int r0 = r3.getInt(r0)     // Catch: java.lang.Throwable -> L22
            r1 = 101(0x65, float:1.42E-43)
            if (r1 != r0) goto L1b
            goto L22
        L1b:
            r2.g(r3)     // Catch: java.lang.Throwable -> L22
            return
        L1f:
            r2.g(r3)     // Catch: java.lang.Throwable -> L22
        L22:
            return
    }

    public void a(java.lang.Object r7, int r8) {
            r6 = this;
            boolean r0 = com.umeng.commonsdk.utils.c.a()
            if (r0 == 0) goto L1d
            r0 = 4357(0x1105, float:6.105E-42)
            if (r8 != r0) goto L2c9
            java.lang.String r0 = "MobclickRT"
            java.lang.String r1 = "--->>> clean db in silent mode."
            com.umeng.commonsdk.debug.UMRTLog.i(r0, r1)     // Catch: java.lang.Throwable -> L1c
            android.content.Context r0 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L1c
            com.umeng.analytics.pro.h.a(r0)     // Catch: java.lang.Throwable -> L1c
            android.content.Context r0 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L1c
            com.umeng.commonsdk.utils.c.c(r0)     // Catch: java.lang.Throwable -> L1c
            goto L1d
        L1c:
        L1d:
            boolean r0 = com.umeng.analytics.AnalyticsConfig.enable
            if (r0 != 0) goto L23
            goto L2c9
        L23:
            r0 = 4358(0x1106, float:6.107E-42)
            r1 = 0
            r2 = 1
            if (r8 == r0) goto L26e
            r0 = 0
            switch(r8) {
                case 4097: goto L233;
                case 4098: goto L219;
                case 4099: goto L212;
                case 4100: goto L20b;
                case 4101: goto L1fc;
                case 4102: goto L1ed;
                case 4103: goto L1d1;
                case 4104: goto L1c6;
                case 4105: goto L1c1;
                case 4106: goto L1bc;
                default: goto L2d;
            }
        L2d:
            switch(r8) {
                case 4352: goto L1a0;
                case 4353: goto L19b;
                case 4354: goto L196;
                case 4355: goto L16a;
                case 4356: goto L12a;
                default: goto L30;
            }
        L30:
            switch(r8) {
                case 8195: goto L121;
                case 8196: goto L118;
                case 8197: goto L10f;
                default: goto L33;
            }
        L33:
            switch(r8) {
                case 8199: goto L106;
                case 8200: goto L106;
                case 8201: goto Lfd;
                default: goto L36;
            }
        L36:
            switch(r8) {
                case 8208: goto Lde;
                case 8209: goto Ld9;
                case 8210: goto Lb9;
                default: goto L39;
            }
        L39:
            switch(r8) {
                case 8213: goto L94;
                case 8214: goto L47;
                case 8215: goto L3e;
                default: goto L3c;
            }
        L3c:
            goto L2c9
        L3e:
            android.content.Context r7 = com.umeng.analytics.pro.o.a
            java.lang.String r8 = com.umeng.analytics.AnalyticsConfig.RTD_SP_FILE
            com.umeng.common.b.a(r7, r8)
            goto L2c9
        L47:
            if (r7 != 0) goto L4b
            goto L2c9
        L4b:
            boolean r8 = r7 instanceof org.json.JSONObject
            if (r8 == 0) goto L2c9
            r8 = r7
            org.json.JSONObject r8 = (org.json.JSONObject) r8     // Catch: java.lang.Throwable -> L2c9
            java.lang.String r0 = "startTime"
            java.lang.String r8 = r8.optString(r0)     // Catch: java.lang.Throwable -> L2c9
            r0 = r7
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch: java.lang.Throwable -> L2c9
            java.lang.String r1 = "period"
            java.lang.String r0 = r0.optString(r1)     // Catch: java.lang.Throwable -> L2c9
            org.json.JSONObject r7 = (org.json.JSONObject) r7     // Catch: java.lang.Throwable -> L2c9
            java.lang.String r1 = "debugkey"
            java.lang.String r7 = r7.optString(r1)     // Catch: java.lang.Throwable -> L2c9
            boolean r1 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L2c9
            if (r1 != 0) goto L2c9
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L2c9
            if (r1 != 0) goto L2c9
            boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L2c9
            if (r1 != 0) goto L2c9
            android.content.Context r1 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L2c9
            java.lang.String r2 = com.umeng.analytics.AnalyticsConfig.RTD_SP_FILE     // Catch: java.lang.Throwable -> L2c9
            java.lang.String r3 = "startTime"
            com.umeng.common.b.a(r1, r2, r3, r8)     // Catch: java.lang.Throwable -> L2c9
            android.content.Context r8 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L2c9
            java.lang.String r1 = "period"
            com.umeng.common.b.a(r8, r2, r1, r0)     // Catch: java.lang.Throwable -> L2c9
            android.content.Context r8 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L2c9
            java.lang.String r0 = "debugkey"
            com.umeng.common.b.a(r8, r2, r0, r7)     // Catch: java.lang.Throwable -> L2c9
            goto L2c9
        L94:
            java.lang.String r7 = "header_foreground_count"
            boolean r7 = com.umeng.commonsdk.config.FieldManager.allow(r7)
            if (r7 == 0) goto L2c9
            android.content.Context r7 = com.umeng.analytics.pro.o.a
            android.app.Activity r7 = com.umeng.commonsdk.statistics.common.DeviceConfig.getGlobleActivity(r7)
            if (r7 == 0) goto La9
            android.content.Context r7 = com.umeng.analytics.pro.o.a
            com.umeng.analytics.pro.u.b(r7)
        La9:
            android.content.Context r0 = com.umeng.analytics.pro.o.a
            com.umeng.analytics.CoreProtocol r2 = com.umeng.analytics.CoreProtocol.getInstance(r0)
            r3 = 0
            r4 = 5000(0x1388, double:2.4703E-320)
            r1 = 8213(0x2015, float:1.1509E-41)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEventEx(r0, r1, r2, r3, r4)
            goto L2c9
        Lb9:
            java.lang.String r7 = "MobclickRT"
            java.lang.String r8 = "--->>> recv BUILD_ENVELOPE_IMMEDIATELY."
            com.umeng.commonsdk.debug.UMRTLog.i(r7, r8)
            android.content.Context r7 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L2c9
            boolean r7 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r7)     // Catch: java.lang.Throwable -> L2c9
            if (r7 == 0) goto L2c9
            com.umeng.analytics.pro.o$c r7 = r6.b     // Catch: java.lang.Throwable -> L2c9
            com.umeng.commonsdk.statistics.common.ReportPolicy$ReportStrategy r7 = r7.c()     // Catch: java.lang.Throwable -> L2c9
            boolean r7 = r7 instanceof com.umeng.commonsdk.statistics.common.ReportPolicy.ReportQuasiRealtime     // Catch: java.lang.Throwable -> L2c9
            if (r7 == 0) goto Ld4
            goto L2c9
        Ld4:
            r6.a(r2)     // Catch: java.lang.Throwable -> L2c9
            goto L2c9
        Ld9:
            r6.a(r7, r1)
            goto L2c9
        Lde:
            java.lang.String r7 = "MobclickRT"
            java.lang.String r8 = "--->>> receive DELAY_BUILD_ENVELOPE event."
            com.umeng.commonsdk.debug.UMRTLog.i(r7, r8)
            android.content.Context r7 = com.umeng.analytics.pro.o.a
            r8 = 8209(0x2011, float:1.1503E-41)
            com.umeng.analytics.CoreProtocol r1 = com.umeng.analytics.CoreProtocol.getInstance(r7)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r7, r8, r1, r0)
            android.content.Context r7 = com.umeng.analytics.pro.o.a
            r8 = 4354(0x1102, float:6.101E-42)
            com.umeng.analytics.CoreProtocol r1 = com.umeng.analytics.CoreProtocol.getInstance(r7)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r7, r8, r1, r0)
            goto L2c9
        Lfd:
            com.umeng.analytics.b r7 = com.umeng.analytics.b.a()
            r7.b(r0)
            goto L2c9
        L106:
            com.umeng.analytics.b r8 = com.umeng.analytics.b.a()
            r8.b(r7)
            goto L2c9
        L10f:
            com.umeng.analytics.b r7 = com.umeng.analytics.b.a()
            r7.k()
            goto L2c9
        L118:
            com.umeng.analytics.b r7 = com.umeng.analytics.b.a()
            r7.m()
            goto L2c9
        L121:
            com.umeng.analytics.b r8 = com.umeng.analytics.b.a()
            r8.a(r7)
            goto L2c9
        L12a:
            if (r7 != 0) goto L12e
            goto L2c9
        L12e:
            java.lang.Class<?> r8 = com.umeng.analytics.pro.o.y
            if (r8 == 0) goto L2c9
            java.lang.reflect.Method r8 = com.umeng.analytics.pro.o.z
            if (r8 != 0) goto L138
            goto L2c9
        L138:
            java.lang.String r8 = "MobclickRT"
            java.lang.String r0 = "--->>> PROFILE_CHANGE_NOTIFY"
            com.umeng.commonsdk.debug.UMRTLog.i(r8, r0)
            java.lang.String r8 = ""
            java.lang.String r0 = ""
            boolean r1 = r7 instanceof org.json.JSONObject     // Catch: java.lang.Throwable -> L2c9
            if (r1 == 0) goto L2c9
            org.json.JSONObject r7 = (org.json.JSONObject) r7     // Catch: java.lang.Throwable -> L2c9
            java.lang.String r1 = "uid"
            boolean r1 = r7.has(r1)     // Catch: java.lang.Throwable -> L2c9
            if (r1 == 0) goto L165
            java.lang.String r1 = "provider"
            boolean r1 = r7.has(r1)     // Catch: java.lang.Throwable -> L2c9
            if (r1 == 0) goto L165
            java.lang.String r8 = "provider"
            java.lang.String r8 = r7.getString(r8)     // Catch: java.lang.Throwable -> L2c9
            java.lang.String r0 = "uid"
            java.lang.String r0 = r7.getString(r0)     // Catch: java.lang.Throwable -> L2c9
        L165:
            r6.a(r0, r8)     // Catch: java.lang.Throwable -> L2c9
            goto L2c9
        L16a:
            android.content.Context r8 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L2c9
            boolean r8 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r8)     // Catch: java.lang.Throwable -> L2c9
            if (r8 == 0) goto L17c
            if (r7 == 0) goto L2c9
            r6.e(r7)     // Catch: java.lang.Throwable -> L2c9
            r6.d()     // Catch: java.lang.Throwable -> L2c9
            goto L2c9
        L17c:
            android.content.Context r8 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L2c9
            com.umeng.analytics.process.UMProcessDBHelper r8 = com.umeng.analytics.process.UMProcessDBHelper.getInstance(r8)     // Catch: java.lang.Throwable -> L2c9
            android.content.Context r0 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L2c9
            java.lang.String r0 = com.umeng.commonsdk.framework.UMFrUtils.getSubProcessName(r0)     // Catch: java.lang.Throwable -> L2c9
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L2c9
            r1.<init>()     // Catch: java.lang.Throwable -> L2c9
            org.json.JSONArray r7 = r1.put(r7)     // Catch: java.lang.Throwable -> L2c9
            r8.insertEventsInSubProcess(r0, r7)     // Catch: java.lang.Throwable -> L2c9
            goto L2c9
        L196:
            r6.c()
            goto L2c9
        L19b:
            r6.a(r7, r2)
            goto L2c9
        L1a0:
            java.lang.String r8 = "MobclickRT"
            java.lang.String r0 = "--->>> INSTANT_SESSION_START"
            com.umeng.commonsdk.debug.UMRTLog.i(r8, r0)
            com.umeng.analytics.pro.u r8 = com.umeng.analytics.pro.u.a()
            android.content.Context r0 = com.umeng.analytics.pro.o.a
            r8.b(r0, r7)
            java.lang.Object r8 = r6.w
            monitor-enter(r8)
            r6.u = r2     // Catch: java.lang.Throwable -> L1b8
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L1b8
            goto L2c9
        L1b8:
            r0 = move-exception
            r7 = r0
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L1b8
            throw r7
        L1bc:
            r6.h(r7)
            goto L2c9
        L1c1:
            r6.d()
            goto L2c9
        L1c6:
            com.umeng.analytics.pro.u r8 = com.umeng.analytics.pro.u.a()
            android.content.Context r0 = com.umeng.analytics.pro.o.a
            r8.c(r0, r7)
            goto L2c9
        L1d1:
            java.lang.String r8 = "MobclickRT"
            java.lang.String r0 = "--->>> START_SESSION"
            com.umeng.commonsdk.debug.UMRTLog.i(r8, r0)
            com.umeng.analytics.pro.u r8 = com.umeng.analytics.pro.u.a()
            android.content.Context r0 = com.umeng.analytics.pro.o.a
            r8.a(r0, r7)
            java.lang.Object r8 = r6.w
            monitor-enter(r8)
            r6.v = r2     // Catch: java.lang.Throwable -> L1e9
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L1e9
            goto L2c9
        L1e9:
            r0 = move-exception
            r7 = r0
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L1e9
            throw r7
        L1ed:
            java.lang.String r8 = "MobclickRT"
            java.lang.String r1 = "--->>> PROFILE_SIGNOFF"
            com.umeng.commonsdk.debug.UMRTLog.i(r8, r1)
            r6.a(r0, r2)
            r6.f(r7)
            goto L2c9
        L1fc:
            java.lang.String r8 = "MobclickRT"
            java.lang.String r1 = "--->>> PROFILE_SIGNIN"
            com.umeng.commonsdk.debug.UMRTLog.i(r8, r1)
            r6.a(r0, r2)
            r6.g(r7)
            goto L2c9
        L20b:
            android.content.Context r7 = com.umeng.analytics.pro.o.a
            com.umeng.analytics.pro.l.c(r7)
            goto L2c9
        L212:
            android.content.Context r7 = com.umeng.analytics.pro.o.a
            com.umeng.analytics.pro.v.a(r7)
            goto L2c9
        L219:
            if (r7 == 0) goto L21e
            r6.e(r7)     // Catch: java.lang.Throwable -> L2c9
        L21e:
            org.json.JSONObject r7 = (org.json.JSONObject) r7     // Catch: java.lang.Throwable -> L2c9
            java.lang.String r8 = "__i"
            java.lang.String r7 = r7.optString(r8)     // Catch: java.lang.Throwable -> L2c9
            java.lang.String r8 = "-1"
            boolean r7 = r8.equals(r7)     // Catch: java.lang.Throwable -> L2c9
            if (r7 != 0) goto L2c9
            r6.a(r1)     // Catch: java.lang.Throwable -> L2c9
            goto L2c9
        L233:
            android.content.Context r8 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L2c9
            boolean r8 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r8)     // Catch: java.lang.Throwable -> L2c9
            if (r8 == 0) goto L255
            if (r7 == 0) goto L240
            r6.e(r7)     // Catch: java.lang.Throwable -> L2c9
        L240:
            org.json.JSONObject r7 = (org.json.JSONObject) r7     // Catch: java.lang.Throwable -> L2c9
            java.lang.String r8 = "__i"
            java.lang.String r7 = r7.optString(r8)     // Catch: java.lang.Throwable -> L2c9
            java.lang.String r8 = "-1"
            boolean r7 = r8.equals(r7)     // Catch: java.lang.Throwable -> L2c9
            if (r7 != 0) goto L2c9
            r6.a(r1)     // Catch: java.lang.Throwable -> L2c9
            goto L2c9
        L255:
            android.content.Context r8 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L2c9
            com.umeng.analytics.process.UMProcessDBHelper r8 = com.umeng.analytics.process.UMProcessDBHelper.getInstance(r8)     // Catch: java.lang.Throwable -> L2c9
            android.content.Context r0 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L2c9
            java.lang.String r0 = com.umeng.commonsdk.framework.UMFrUtils.getSubProcessName(r0)     // Catch: java.lang.Throwable -> L2c9
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L2c9
            r1.<init>()     // Catch: java.lang.Throwable -> L2c9
            org.json.JSONArray r7 = r1.put(r7)     // Catch: java.lang.Throwable -> L2c9
            r8.insertEventsInSubProcess(r0, r7)     // Catch: java.lang.Throwable -> L2c9
            goto L2c9
        L26e:
            if (r7 != 0) goto L271
            goto L2c9
        L271:
            boolean r8 = r7 instanceof org.json.JSONObject
            if (r8 == 0) goto L2c9
            r8 = r7
            org.json.JSONObject r8 = (org.json.JSONObject) r8     // Catch: java.lang.Throwable -> L2c9
            java.lang.String r0 = "pk"
            java.lang.String r8 = r8.optString(r0)     // Catch: java.lang.Throwable -> L2c9
            org.json.JSONObject r7 = (org.json.JSONObject) r7     // Catch: java.lang.Throwable -> L2c9
            java.lang.String r0 = "pv"
            java.lang.Object r7 = r7.opt(r0)     // Catch: java.lang.Throwable -> L2c9
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L2c9
            if (r0 != 0) goto L2c9
            android.content.Context r0 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L2c9
            java.lang.String[] r0 = com.umeng.analytics.c.a(r0)     // Catch: java.lang.Throwable -> L2c9
            if (r0 == 0) goto L2c4
            r1 = r0[r1]     // Catch: java.lang.Throwable -> L2c9
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L2c9
            if (r1 != 0) goto L2c4
            r0 = r0[r2]     // Catch: java.lang.Throwable -> L2c9
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L2c9
            if (r0 != 0) goto L2c4
            java.lang.String r0 = "_$!mobile"
            boolean r0 = r0.equals(r8)     // Catch: java.lang.Throwable -> L2c9
            if (r0 == 0) goto L2b2
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L2c9
            com.umeng.analytics.c.a(r7)     // Catch: java.lang.Throwable -> L2c9
            goto L2c9
        L2b2:
            java.lang.String r0 = "_$!email"
            boolean r0 = r0.equals(r8)     // Catch: java.lang.Throwable -> L2c9
            if (r0 == 0) goto L2c0
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L2c9
            com.umeng.analytics.c.b(r7)     // Catch: java.lang.Throwable -> L2c9
            goto L2c9
        L2c0:
            com.umeng.analytics.c.a(r8, r7)     // Catch: java.lang.Throwable -> L2c9
            goto L2c9
        L2c4:
            java.lang.String r7 = "Please call MobclickAgent.onProfileSignIn() function before set user profile property."
            com.umeng.commonsdk.statistics.common.MLog.e(r7)     // Catch: java.lang.Throwable -> L2c9
        L2c9:
            return
    }

    public void a(java.lang.Object r1, boolean r2) {
            r0 = this;
            r1 = 1
            if (r2 == 0) goto Ld
            boolean r1 = r0.d(r1)
            if (r1 == 0) goto L1e
            r0.i()
            return
        Ld:
            android.content.Context r2 = com.umeng.analytics.pro.o.a
            boolean r2 = com.umeng.commonsdk.framework.UMEnvelopeBuild.isOnline(r2)
            if (r2 == 0) goto L1e
            boolean r1 = r0.d(r1)
            if (r1 == 0) goto L1e
            r0.i()
        L1e:
            return
    }

    public void a(boolean r3) {
            r2 = this;
            boolean r0 = r2.c(r3)
            if (r0 == 0) goto L4a
            com.umeng.analytics.pro.o$c r0 = r2.b
            com.umeng.commonsdk.statistics.common.ReportPolicy$ReportStrategy r0 = r0.c()
            boolean r0 = r0 instanceof com.umeng.commonsdk.statistics.common.ReportPolicy.ReportQuasiRealtime
            java.lang.String r1 = "MobclickRT"
            if (r0 == 0) goto L38
            if (r3 == 0) goto L25
            android.content.Context r3 = com.umeng.analytics.pro.o.a
            boolean r3 = com.umeng.commonsdk.framework.UMEnvelopeBuild.isOnline(r3)
            if (r3 == 0) goto L4a
            java.lang.String r3 = "--->>> send session start in policy ReportQuasiRealtime."
            com.umeng.commonsdk.debug.UMRTLog.i(r1, r3)
            r2.j()
            return
        L25:
            android.content.Context r3 = com.umeng.analytics.pro.o.a
            com.umeng.commonsdk.framework.UMLogDataProtocol$UMBusinessType r0 = com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType.U_APP
            boolean r3 = com.umeng.commonsdk.framework.UMEnvelopeBuild.isReadyBuild(r3, r0)
            if (r3 == 0) goto L4a
            java.lang.String r3 = "--->>> send normal data in policy ReportQuasiRealtime."
            com.umeng.commonsdk.debug.UMRTLog.i(r1, r3)
            r2.j()
            return
        L38:
            android.content.Context r3 = com.umeng.analytics.pro.o.a
            com.umeng.commonsdk.framework.UMLogDataProtocol$UMBusinessType r0 = com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType.U_APP
            boolean r3 = com.umeng.commonsdk.framework.UMEnvelopeBuild.isReadyBuild(r3, r0)
            if (r3 == 0) goto L4a
            java.lang.String r3 = "--->>> constructMessage()"
            com.umeng.commonsdk.debug.UMRTLog.i(r1, r3)
            r2.j()
        L4a:
            return
    }

    public org.json.JSONObject b(long r9) {
            r8 = this;
            com.umeng.analytics.pro.y r0 = com.umeng.analytics.pro.y.a()
            android.content.Context r1 = com.umeng.analytics.pro.o.a
            android.content.Context r1 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext(r1)
            java.lang.String r0 = r0.d(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            if (r0 == 0) goto L16
            return r1
        L16:
            android.content.Context r0 = com.umeng.analytics.pro.o.a
            android.content.Context r0 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext(r0)
            com.umeng.analytics.pro.i r0 = com.umeng.analytics.pro.i.a(r0)
            r2 = 0
            org.json.JSONObject r0 = r0.b(r2)
            android.content.Context r3 = com.umeng.analytics.pro.o.a
            java.lang.String[] r3 = com.umeng.analytics.c.a(r3)
            java.lang.String r4 = "active_user"
            r5 = 1
            if (r3 == 0) goto L5e
            r6 = r3[r2]
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L5e
            r6 = r3[r5]
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L5e
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            java.lang.String r7 = "provider"
            r2 = r3[r2]     // Catch: java.lang.Throwable -> L5d
            r6.put(r7, r2)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r2 = "puid"
            r3 = r3[r5]     // Catch: java.lang.Throwable -> L5d
            r6.put(r2, r3)     // Catch: java.lang.Throwable -> L5d
            int r2 = r6.length()     // Catch: java.lang.Throwable -> L5d
            if (r2 <= 0) goto L5e
            r0.put(r4, r6)     // Catch: java.lang.Throwable -> L5d
            goto L5e
        L5d:
        L5e:
            com.umeng.analytics.pro.r r2 = com.umeng.analytics.pro.r.a()
            android.content.Context r3 = com.umeng.analytics.pro.o.a
            int r2 = r2.a(r3)
            int r3 = r0.length()
            r6 = 3
            if (r3 != r5) goto L78
            org.json.JSONObject r3 = r0.optJSONObject(r4)
            if (r3 == 0) goto L78
            if (r2 == r6) goto L78
            return r1
        L78:
            com.umeng.analytics.pro.r r3 = com.umeng.analytics.pro.r.a()
            android.content.Context r4 = com.umeng.analytics.pro.o.a
            r3.b(r0, r4)
            int r3 = r0.length()
            if (r3 > 0) goto L8a
            if (r2 == r6) goto L8a
            return r1
        L8a:
            org.json.JSONObject r1 = r8.k()
            if (r1 == 0) goto L93
            r8.b(r1)
        L93:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r5 = "analytics"
            if (r2 != r6) goto Laa
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lcf
            r0.<init>()     // Catch: java.lang.Throwable -> Lcf
            r4.put(r5, r0)     // Catch: java.lang.Throwable -> Lcf
            goto Lb3
        Laa:
            int r2 = r0.length()     // Catch: java.lang.Throwable -> Lcf
            if (r2 <= 0) goto Lb3
            r4.put(r5, r0)     // Catch: java.lang.Throwable -> Lcf
        Lb3:
            if (r1 == 0) goto Lc0
            int r0 = r1.length()     // Catch: java.lang.Throwable -> Lcf
            if (r0 <= 0) goto Lc0
            java.lang.String r0 = "header"
            r3.put(r0, r1)     // Catch: java.lang.Throwable -> Lcf
        Lc0:
            int r0 = r4.length()     // Catch: java.lang.Throwable -> Lcf
            if (r0 <= 0) goto Lcb
            java.lang.String r0 = "content"
            r3.put(r0, r4)     // Catch: java.lang.Throwable -> Lcf
        Lcb:
            org.json.JSONObject r3 = r8.b(r3, r9)     // Catch: java.lang.Throwable -> Lcf
        Lcf:
            return r3
    }

    public org.json.JSONObject b(boolean r18) {
            r17 = this;
            java.lang.String r0 = "userlevel"
            java.lang.String r1 = "autopages"
            java.lang.String r2 = "sessions"
            java.lang.String r3 = "pages"
            r4 = 0
            android.content.Context r5 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L1d6
            com.umeng.analytics.pro.i r5 = com.umeng.analytics.pro.i.a(r5)     // Catch: java.lang.Throwable -> L1d6
            r6 = r18
            org.json.JSONObject r4 = r5.a(r6)     // Catch: java.lang.Throwable -> L1d6
            if (r4 != 0) goto L1f
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1d6
            r1.<init>()     // Catch: java.lang.Throwable -> L1d6
            r4 = r1
            goto L100
        L1f:
            boolean r6 = r4.has(r2)     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L1d6
            if (r6 == 0) goto L100
            org.json.JSONArray r6 = r4.getJSONArray(r2)     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L1d6
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L1d6
            r7.<init>()     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L1d6
            r8 = 0
        L2f:
            int r9 = r6.length()     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L1d6
            if (r8 >= r9) goto Lf7
            java.lang.Object r9 = r6.get(r8)     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L1d6
            org.json.JSONObject r9 = (org.json.JSONObject) r9     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L1d6
            org.json.JSONArray r10 = r9.optJSONArray(r3)     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L1d6
            org.json.JSONArray r11 = r9.optJSONArray(r1)     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L1d6
            if (r10 != 0) goto L4d
            if (r11 == 0) goto L4d
            r9.put(r3, r11)     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L1d6
            r9.remove(r1)     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L1d6
        L4d:
            java.lang.String r12 = "page_start"
            if (r10 == 0) goto La8
            if (r11 == 0) goto La8
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L1d6
            r13.<init>()     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L1d6
            r14 = 0
        L59:
            int r15 = r10.length()     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L1d6
            if (r14 >= r15) goto L6b
            java.lang.Object r15 = r10.get(r14)     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L1d6
            org.json.JSONObject r15 = (org.json.JSONObject) r15     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L1d6
            r13.add(r15)     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L1d6
            int r14 = r14 + 1
            goto L59
        L6b:
            r10 = 0
        L6c:
            int r14 = r11.length()     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L1d6
            if (r10 >= r14) goto L7e
            java.lang.Object r14 = r11.get(r10)     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L1d6
            org.json.JSONObject r14 = (org.json.JSONObject) r14     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L1d6
            r13.add(r14)     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L1d6
            int r10 = r10 + 1
            goto L6c
        L7e:
            com.umeng.commonsdk.utils.JSONArraySortUtil r10 = new com.umeng.commonsdk.utils.JSONArraySortUtil     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L1d6
            r10.<init>()     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L1d6
            r10.setCompareKey(r12)     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L1d6
            java.util.Collections.sort(r13, r10)     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L1d6
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L1d6
            r10.<init>()     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L1d6
            java.util.Iterator r11 = r13.iterator()     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L1d6
        L92:
            boolean r13 = r11.hasNext()     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L1d6
            if (r13 == 0) goto La2
            java.lang.Object r13 = r11.next()     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L1d6
            org.json.JSONObject r13 = (org.json.JSONObject) r13     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L1d6
            r10.put(r13)     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L1d6
            goto L92
        La2:
            r9.put(r3, r10)     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L1d6
            r9.remove(r1)     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L1d6
        La8:
            boolean r10 = r9.has(r3)     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L1d6
            java.lang.String r11 = "$page_num"
            if (r10 == 0) goto Le8
            org.json.JSONArray r10 = r9.optJSONArray(r3)     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L1d6
            r13 = 0
        Lb5:
            int r14 = r10.length()     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L1d6
            if (r13 >= r14) goto Ldb
            org.json.JSONObject r14 = r10.getJSONObject(r13)     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L1d6
            boolean r15 = r14.has(r12)     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L1d6
            if (r15 == 0) goto Ld4
            java.lang.String r15 = "ts"
            r16 = r6
            long r5 = r14.getLong(r12)     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L1d6
            r14.put(r15, r5)     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L1d6
            r14.remove(r12)     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L1d6
            goto Ld6
        Ld4:
            r16 = r6
        Ld6:
            int r13 = r13 + 1
            r6 = r16
            goto Lb5
        Ldb:
            r16 = r6
            r9.put(r3, r10)     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L1d6
            int r5 = r10.length()     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L1d6
            r9.put(r11, r5)     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L1d6
            goto Lee
        Le8:
            r16 = r6
            r5 = 0
            r9.put(r11, r5)     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L1d6
        Lee:
            r7.put(r9)     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L1d6
            int r8 = r8 + 1
            r6 = r16
            goto L2f
        Lf7:
            r4.put(r2, r7)     // Catch: java.lang.Exception -> Lfb java.lang.Throwable -> L1d6
            goto L100
        Lfb:
            java.lang.String r1 = "merge pages error"
            com.umeng.commonsdk.statistics.common.MLog.e(r1)     // Catch: java.lang.Throwable -> L1d6
        L100:
            android.content.Context r1 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L1d6
            android.content.SharedPreferences r1 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r1)     // Catch: java.lang.Throwable -> L1d6
            if (r1 == 0) goto L117
            java.lang.String r2 = ""
            java.lang.String r1 = r1.getString(r0, r2)     // Catch: java.lang.Throwable -> L1d6
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L1d6
            if (r2 != 0) goto L117
            r4.put(r0, r1)     // Catch: java.lang.Throwable -> L1d6
        L117:
            android.content.Context r0 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L1d6
            java.lang.String[] r0 = com.umeng.analytics.c.a(r0)     // Catch: java.lang.Throwable -> L1d6
            if (r0 == 0) goto L1a0
            r5 = 0
            r1 = r0[r5]     // Catch: java.lang.Throwable -> L1d6
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L1d6
            if (r1 != 0) goto L1a0
            r1 = 1
            r2 = r0[r1]     // Catch: java.lang.Throwable -> L1d6
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L1d6
            if (r2 != 0) goto L1a0
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1d6
            r2.<init>()     // Catch: java.lang.Throwable -> L1d6
            java.lang.String r3 = "provider"
            r5 = 0
            r5 = r0[r5]     // Catch: java.lang.Throwable -> L1d6
            r2.put(r3, r5)     // Catch: java.lang.Throwable -> L1d6
            java.lang.String r3 = "puid"
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L1d6
            r2.put(r3, r0)     // Catch: java.lang.Throwable -> L1d6
            int r0 = r2.length()     // Catch: java.lang.Throwable -> L1d6
            if (r0 <= 0) goto L1a0
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1d6
            r0.<init>()     // Catch: java.lang.Throwable -> L1d6
            java.lang.String r1 = com.umeng.analytics.c.a()     // Catch: java.lang.Throwable -> L1d6
            if (r1 == 0) goto L15b
            java.lang.String r3 = "_$!mobile"
            r0.put(r3, r1)     // Catch: java.lang.Throwable -> L1d6
        L15b:
            java.lang.String r1 = com.umeng.analytics.c.b()     // Catch: java.lang.Throwable -> L1d6
            if (r1 == 0) goto L166
            java.lang.String r3 = "_$!email"
            r0.put(r3, r1)     // Catch: java.lang.Throwable -> L1d6
        L166:
            android.content.Context r1 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L1d6
            java.util.Map r1 = com.umeng.analytics.c.c(r1)     // Catch: java.lang.Throwable -> L1d6
            if (r1 == 0) goto L190
            int r3 = r1.size()     // Catch: java.lang.Throwable -> L1d6
            if (r3 <= 0) goto L190
            java.util.Set r3 = r1.keySet()     // Catch: java.lang.Throwable -> L1d6
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L1d6
        L17c:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> L1d6
            if (r5 == 0) goto L190
            java.lang.Object r5 = r3.next()     // Catch: java.lang.Throwable -> L1d6
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L1d6
            java.lang.Object r6 = r1.get(r5)     // Catch: java.lang.Throwable -> L1d6
            r0.put(r5, r6)     // Catch: java.lang.Throwable -> L1d6
            goto L17c
        L190:
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L1d6
            if (r1 <= 0) goto L19b
            java.lang.String r1 = "up"
            r2.put(r1, r0)     // Catch: java.lang.Throwable -> L1d6
        L19b:
            java.lang.String r0 = "active_user"
            r4.put(r0, r2)     // Catch: java.lang.Throwable -> L1d6
        L1a0:
            android.content.Context r0 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L1d6
            com.umeng.commonsdk.statistics.noise.ABTest r0 = com.umeng.commonsdk.statistics.noise.ABTest.getService(r0)     // Catch: java.lang.Throwable -> L1d6
            boolean r0 = r0.isInTest()     // Catch: java.lang.Throwable -> L1d6
            if (r0 == 0) goto L1cd
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1d6
            r0.<init>()     // Catch: java.lang.Throwable -> L1d6
            android.content.Context r1 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L1d6
            com.umeng.commonsdk.statistics.noise.ABTest r1 = com.umeng.commonsdk.statistics.noise.ABTest.getService(r1)     // Catch: java.lang.Throwable -> L1d6
            java.lang.String r1 = r1.getTestName()     // Catch: java.lang.Throwable -> L1d6
            android.content.Context r2 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L1d6
            com.umeng.commonsdk.statistics.noise.ABTest r2 = com.umeng.commonsdk.statistics.noise.ABTest.getService(r2)     // Catch: java.lang.Throwable -> L1d6
            java.lang.String r2 = r2.getGroupInfo()     // Catch: java.lang.Throwable -> L1d6
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L1d6
            java.lang.String r1 = "group_info"
            r4.put(r1, r0)     // Catch: java.lang.Throwable -> L1d6
        L1cd:
            com.umeng.analytics.pro.r r0 = com.umeng.analytics.pro.r.a()     // Catch: java.lang.Throwable -> L1d6
            android.content.Context r1 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L1d6
            r0.a(r4, r1)     // Catch: java.lang.Throwable -> L1d6
        L1d6:
            return r4
    }

    public void b() {
            r0 = this;
            return
    }

    public void b(android.content.Context r1) {
            r0 = this;
            com.umeng.analytics.pro.i r1 = com.umeng.analytics.pro.i.a(r1)     // Catch: java.lang.Throwable -> La
            r1.d()     // Catch: java.lang.Throwable -> La
            r0.q()     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    public void b(java.lang.Object r3) {
            r2 = this;
            java.lang.String r0 = "exception"
            if (r3 == 0) goto L22
            org.json.JSONObject r3 = (org.json.JSONObject) r3     // Catch: java.lang.Throwable -> L22
            int r1 = r3.length()     // Catch: java.lang.Throwable -> L22
            if (r1 <= 0) goto L22
            boolean r1 = r3.has(r0)     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L1f
            int r0 = r3.getInt(r0)     // Catch: java.lang.Throwable -> L22
            r1 = 101(0x65, float:1.42E-43)
            if (r1 != r0) goto L1b
            goto L22
        L1b:
            r2.f(r3)     // Catch: java.lang.Throwable -> L22
            return
        L1f:
            r2.f(r3)     // Catch: java.lang.Throwable -> L22
        L22:
            return
    }

    public void c() {
            r1 = this;
            android.content.Context r0 = com.umeng.analytics.pro.o.a
            r1.b(r0)
            r1.d()
            r0 = 1
            r1.a(r0)
            return
    }

    public void c(java.lang.Object r1) {
            r0 = this;
            android.content.Context r1 = com.umeng.analytics.pro.o.a
            r0.b(r1)
            r0.d()
            r1 = 0
            boolean r1 = r0.d(r1)
            if (r1 == 0) goto L12
            r0.j()
        L12:
            return
    }

    public void d() {
            r4 = this;
            org.json.JSONArray r0 = r4.g     // Catch: java.lang.Throwable -> L46
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L46
            if (r0 <= 0) goto L21
            java.lang.String r0 = "MobclickRT"
            java.lang.String r1 = "--->>>*** flushMemoryData: 事件落库。"
            com.umeng.commonsdk.debug.UMRTLog.i(r0, r1)     // Catch: java.lang.Throwable -> L46
            android.content.Context r0 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L46
            com.umeng.analytics.pro.i r0 = com.umeng.analytics.pro.i.a(r0)     // Catch: java.lang.Throwable -> L46
            org.json.JSONArray r1 = r4.g     // Catch: java.lang.Throwable -> L46
            r0.a(r1)     // Catch: java.lang.Throwable -> L46
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L46
            r0.<init>()     // Catch: java.lang.Throwable -> L46
            r4.g = r0     // Catch: java.lang.Throwable -> L46
        L21:
            android.content.Context r0 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L46
            android.content.SharedPreferences r0 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r0)     // Catch: java.lang.Throwable -> L46
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L46
            java.lang.String r1 = "thtstart"
            long r2 = r4.k     // Catch: java.lang.Throwable -> L46
            android.content.SharedPreferences$Editor r0 = r0.putLong(r1, r2)     // Catch: java.lang.Throwable -> L46
            java.lang.String r1 = "gkvc"
            int r2 = r4.i     // Catch: java.lang.Throwable -> L46
            android.content.SharedPreferences$Editor r0 = r0.putInt(r1, r2)     // Catch: java.lang.Throwable -> L46
            java.lang.String r1 = "ekvc"
            int r2 = r4.j     // Catch: java.lang.Throwable -> L46
            android.content.SharedPreferences$Editor r0 = r0.putInt(r1, r2)     // Catch: java.lang.Throwable -> L46
            r0.commit()     // Catch: java.lang.Throwable -> L46
        L46:
            return
    }

    public void d(java.lang.Object r1) {
            r0 = this;
            r0.r()
            r0.m()
            r0.n()
            r1 = 1
            r0.a(r1)
            return
    }

    public void e() {
            r1 = this;
            r0 = 0
            boolean r0 = r1.d(r0)
            if (r0 == 0) goto La
            r1.j()
        La:
            return
    }

    public long f() {
            r7 = this;
            java.lang.String r0 = "first_activate_time"
            r1 = 0
            android.content.Context r3 = com.umeng.analytics.pro.o.a     // Catch: java.lang.Throwable -> L29
            if (r3 == 0) goto L29
            android.content.SharedPreferences r3 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r3)     // Catch: java.lang.Throwable -> L29
            if (r3 == 0) goto L29
            long r4 = r3.getLong(r0, r1)     // Catch: java.lang.Throwable -> L29
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 != 0) goto L28
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L26
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch: java.lang.Throwable -> L29
            android.content.SharedPreferences$Editor r0 = r3.putLong(r0, r1)     // Catch: java.lang.Throwable -> L29
            r0.commit()     // Catch: java.lang.Throwable -> L29
            return r1
        L26:
            r1 = r4
            goto L29
        L28:
            return r4
        L29:
            return r1
    }
}
