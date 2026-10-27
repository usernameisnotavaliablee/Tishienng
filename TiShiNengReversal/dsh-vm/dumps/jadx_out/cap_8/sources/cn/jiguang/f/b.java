package cn.jiguang.f;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b {
    public static java.lang.String a = "DISABLE_DATA";

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f1274b = "ENABLE_DATA";

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f1275c = "KEY_CHANNEL";

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f1276d = "KEY_PLATFORM_TYPE";

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f1277e = "KEY_PLATFORM_REGID";

    /* renamed from: f, reason: collision with root package name */
    private static java.util.concurrent.atomic.AtomicBoolean f1278f;

    public static class a {

        /* renamed from: b, reason: collision with root package name */
        private static volatile cn.jiguang.f.b.a f1279b;
        private boolean a;

        /* renamed from: c, reason: collision with root package name */
        private android.content.Context f1280c;

        private a(android.content.Context r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.a = r0
                r1.f1280c = r2
                cn.jiguang.e.a r0 = b(r2)
                java.lang.Object r2 = cn.jiguang.e.b.a(r2, r0)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                r1.a = r2
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r0 = "isConfigControl:"
                r2.append(r0)
                boolean r0 = r1.a
                r2.append(r0)
                java.lang.String r2 = r2.toString()
                java.lang.String r0 = "DataCollectorDefaultApi"
                cn.jiguang.w.f.c(r0, r2)
                return
        }

        public static cn.jiguang.f.b.a a(android.content.Context r2) {
                cn.jiguang.f.b$a r0 = cn.jiguang.f.b.a.f1279b
                if (r0 != 0) goto L19
                java.lang.Class<cn.jiguang.f.b$a> r0 = cn.jiguang.f.b.a.class
                monitor-enter(r0)
                cn.jiguang.f.b$a r1 = cn.jiguang.f.b.a.f1279b     // Catch: java.lang.Throwable -> L13
                if (r1 != 0) goto L15
                cn.jiguang.f.b$a r1 = new cn.jiguang.f.b$a     // Catch: java.lang.Throwable -> L13
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
                cn.jiguang.f.b.a.f1279b = r1     // Catch: java.lang.Throwable -> L13
                goto L15
            L13:
                r2 = move-exception
                goto L17
            L15:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                goto L19
            L17:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r2
            L19:
                cn.jiguang.f.b$a r2 = cn.jiguang.f.b.a.f1279b
                return r2
        }

        private static cn.jiguang.e.a<java.lang.Boolean> b(android.content.Context r3) {
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "cn.jiguang.sdk.common.core_middle_common_"
                r0.append(r1)
                boolean r3 = cn.jiguang.v.d.b(r3)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                cn.jiguang.e.a r0 = new cn.jiguang.e.a
                java.lang.String r1 = "load_config"
                java.lang.Boolean r2 = java.lang.Boolean.FALSE
                r0.<init>(r3, r1, r2)
                return r0
        }

        private static java.lang.String f() {
                java.lang.String r0 = ""
                java.lang.String r1 = "DataCollectorDefaultApi"
                java.lang.String r2 = "getBaseBandApi"
                cn.jiguang.w.f.c(r1, r2)     // Catch: java.lang.Throwable -> L17
                r2 = 2001(0x7d1, float:2.804E-42)
                r3 = 1
                java.lang.Object r2 = cn.jiguang.f.b.a(r2, r3)     // Catch: java.lang.Throwable -> L17
                boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> L17
                if (r3 == 0) goto L19
                java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L17
                return r2
            L17:
                r2 = move-exception
                goto L2e
            L19:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L17
                r3.<init>()     // Catch: java.lang.Throwable -> L17
                java.lang.String r4 = "getBaseBandApi() returned non-String object: "
                r3.append(r4)     // Catch: java.lang.Throwable -> L17
                r3.append(r2)     // Catch: java.lang.Throwable -> L17
                java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L17
                cn.jiguang.w.f.i(r1, r2)     // Catch: java.lang.Throwable -> L17
                return r0
            L2e:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Exception in getBaseBandApi: "
                r3.append(r4)
                java.lang.String r2 = r2.getMessage()
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                cn.jiguang.w.f.i(r1, r2)
                return r0
        }

        private static java.lang.String g() {
                java.lang.String r0 = ""
                java.lang.String r1 = "DataCollectorDefaultApi"
                java.lang.String r2 = "getAndroidIdApi"
                cn.jiguang.w.f.c(r1, r2)     // Catch: java.lang.Throwable -> L17
                r2 = 1001(0x3e9, float:1.403E-42)
                r3 = 1
                java.lang.Object r2 = cn.jiguang.f.b.a(r2, r3)     // Catch: java.lang.Throwable -> L17
                boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> L17
                if (r3 == 0) goto L19
                java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L17
                return r2
            L17:
                r2 = move-exception
                goto L2e
            L19:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L17
                r3.<init>()     // Catch: java.lang.Throwable -> L17
                java.lang.String r4 = "getAndroidIdApi() returned non-String object: "
                r3.append(r4)     // Catch: java.lang.Throwable -> L17
                r3.append(r2)     // Catch: java.lang.Throwable -> L17
                java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L17
                cn.jiguang.w.f.i(r1, r2)     // Catch: java.lang.Throwable -> L17
                return r0
            L2e:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Exception in getAndroidIdApi: "
                r3.append(r4)
                java.lang.String r2 = r2.getMessage()
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                cn.jiguang.w.f.i(r1, r2)
                return r0
        }

        private static java.lang.String h() {
                java.lang.String r0 = "0*0"
                java.lang.String r1 = "DataCollectorDefaultApi"
                java.lang.String r2 = "getAndroidIdApi"
                cn.jiguang.w.f.c(r1, r2)     // Catch: java.lang.Throwable -> L17
                r2 = 1017(0x3f9, float:1.425E-42)
                r3 = 1
                java.lang.Object r2 = cn.jiguang.f.b.a(r2, r3)     // Catch: java.lang.Throwable -> L17
                boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> L17
                if (r3 == 0) goto L19
                java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L17
                return r2
            L17:
                r2 = move-exception
                goto L2e
            L19:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L17
                r3.<init>()     // Catch: java.lang.Throwable -> L17
                java.lang.String r4 = "getResolutioneApi() returned non-String object: "
                r3.append(r4)     // Catch: java.lang.Throwable -> L17
                r3.append(r2)     // Catch: java.lang.Throwable -> L17
                java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L17
                cn.jiguang.w.f.i(r1, r2)     // Catch: java.lang.Throwable -> L17
                return r0
            L2e:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Exception in getResolutioneApi: "
                r3.append(r4)
                java.lang.String r2 = r2.getMessage()
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                cn.jiguang.w.f.i(r1, r2)
                return r0
        }

        public void a() {
                r5 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "setConfigControl:"
                r0.append(r1)
                boolean r1 = r5.a
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "DataCollectorDefaultApi"
                cn.jiguang.w.f.c(r1, r0)
                boolean r0 = r5.a
                if (r0 == 0) goto L1d
                return
            L1d:
                android.content.Context r0 = r5.f1280c
                cn.jiguang.e.a r1 = b(r0)
                java.lang.Boolean r2 = java.lang.Boolean.TRUE
                cn.jiguang.e.a r1 = r1.a(r2)
                r2 = 1
                cn.jiguang.e.a[] r3 = new cn.jiguang.e.a[r2]
                r4 = 0
                r3[r4] = r1
                cn.jiguang.e.b.a(r0, r3)
                r5.a = r2
                return
        }

        public boolean b() {
                r1 = this;
                boolean r0 = r1.a
                return r0
        }

        public java.lang.String c() {
                r2 = this;
                boolean r0 = r2.a
                if (r0 == 0) goto L9
                java.lang.String r0 = cn.jiguang.f.b.a()
                return r0
            L9:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "getBaseBandApi:"
                r0.append(r1)
                boolean r1 = r2.a
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "DataCollectorDefaultApi"
                cn.jiguang.w.f.c(r1, r0)
                java.lang.String r0 = f()
                return r0
        }

        public java.lang.String d() {
                r1 = this;
                boolean r0 = r1.a
                if (r0 == 0) goto L9
                java.lang.String r0 = cn.jiguang.f.b.l()
                return r0
            L9:
                java.lang.String r0 = g()
                return r0
        }

        public java.lang.String e() {
                r2 = this;
                boolean r0 = r2.a
                if (r0 == 0) goto L9
                java.lang.String r0 = cn.jiguang.f.b.g()
                return r0
            L9:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "getResolutioneApi:"
                r0.append(r1)
                boolean r1 = r2.a
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "DataCollectorDefaultApi"
                cn.jiguang.w.f.c(r1, r0)
                java.lang.String r0 = h()
                return r0
        }
    }

    /* renamed from: cn.jiguang.f.b$b, reason: collision with other inner class name */
    private static class C0042b {
        public C0042b() {
                r1 = this;
                r1.<init>()
                return
        }

        public static java.lang.Object a(int r2, java.lang.String r3, android.os.Bundle r4, java.lang.Object... r5) {
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "onEvent: "
                r0.append(r1)
                r0.append(r2)
                java.lang.String r1 = ", action:"
                r0.append(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "JCommonHelper"
                cn.jiguang.w.f.c(r1, r0)
                java.lang.Object r2 = cn.jiguang.commons.j.m.e(r2, r3, r4, r5)
                return r2
        }

        public static java.lang.Object a(android.content.Context r2, int r3, java.lang.String r4, android.os.Bundle r5, java.lang.Object... r6) {
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "onEvent c: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r1 = ", action:"
                r0.append(r1)
                r0.append(r4)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "JCommonHelper"
                cn.jiguang.w.f.c(r1, r0)
                java.lang.Object r2 = cn.jiguang.commons.j.m.e(r2, r3, r4, r5, r6)
                return r2
        }

        public static void a(cn.jiguang.commons.j.c r0) {
                cn.jiguang.commons.j.m.a(r0)
                return
        }
    }

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            cn.jiguang.f.b.f1278f = r0
            return
    }

    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.util.List<java.lang.String> A() {
            java.lang.String r0 = "JCommonHelper"
            r1 = 0
            r2 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L13
            r3 = 20
            java.lang.Object r1 = cn.jiguang.f.b.C0042b.a(r3, r2, r2, r1)     // Catch: java.lang.Throwable -> L13
            boolean r3 = r1 instanceof java.util.List     // Catch: java.lang.Throwable -> L13
            if (r3 == 0) goto L15
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L13
            return r1
        L13:
            r1 = move-exception
            goto L2a
        L15:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13
            r3.<init>()     // Catch: java.lang.Throwable -> L13
            java.lang.String r4 = "getAppPackageNames() returned non-List object: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L13
            r3.append(r1)     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L13
            cn.jiguang.w.f.i(r0, r1)     // Catch: java.lang.Throwable -> L13
            return r2
        L2a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Exception in getAppPackageNames: "
            r3.append(r4)
            java.lang.String r1 = r1.getMessage()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            cn.jiguang.w.f.i(r0, r1)
            return r2
    }

    public static org.json.JSONObject B() {
            r0 = 0
            org.json.JSONObject r0 = d(r0)
            return r0
    }

    public static org.json.JSONObject C() {
            java.lang.String r0 = "JCommonHelper"
            r1 = 1029(0x405, float:1.442E-42)
            r2 = 0
            java.lang.Object r1 = a(r1)     // Catch: java.lang.Throwable -> L10
            boolean r3 = r1 instanceof org.json.JSONObject     // Catch: java.lang.Throwable -> L10
            if (r3 == 0) goto L12
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Throwable -> L10
            return r1
        L10:
            r1 = move-exception
            goto L27
        L12:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10
            r3.<init>()     // Catch: java.lang.Throwable -> L10
            java.lang.String r4 = "getNcidBox() returned non-JSONObject object: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L10
            r3.append(r1)     // Catch: java.lang.Throwable -> L10
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L10
            cn.jiguang.w.f.i(r0, r1)     // Catch: java.lang.Throwable -> L10
            return r2
        L27:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Exception in getNcidBox: "
            r3.append(r4)
            java.lang.String r1 = r1.getMessage()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            cn.jiguang.w.f.i(r0, r1)
            return r2
    }

    public static org.json.JSONArray D() {
            r0 = 1022(0x3fe, float:1.432E-42)
            r1 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L1e
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L1e
            r3 = 0
            r2[r3] = r0     // Catch: java.lang.Throwable -> L1e
            r0 = 14
            java.lang.Object r0 = cn.jiguang.f.b.C0042b.a(r0, r1, r1, r2)     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L16
            return r1
        L16:
            boolean r2 = r0 instanceof org.json.JSONArray     // Catch: java.lang.Throwable -> L1e
            if (r2 != 0) goto L1b
            return r1
        L1b:
            org.json.JSONArray r0 = (org.json.JSONArray) r0     // Catch: java.lang.Throwable -> L1e
            return r0
        L1e:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Exception in sendAction: "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "JCommonHelper"
            cn.jiguang.w.f.i(r2, r0)
            return r1
    }

    public static android.content.pm.PackageInfo a(java.lang.String r3, int r4) {
            r0 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L17
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L17
            r2 = 0
            r1[r2] = r3     // Catch: java.lang.Throwable -> L17
            r3 = 1
            r1[r3] = r4     // Catch: java.lang.Throwable -> L17
            r3 = 17
            java.lang.Object r3 = cn.jiguang.f.b.C0042b.a(r3, r0, r0, r1)     // Catch: java.lang.Throwable -> L17
            android.content.pm.PackageInfo r3 = (android.content.pm.PackageInfo) r3     // Catch: java.lang.Throwable -> L17
            return r3
        L17:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "Exception in getPackageInfo: "
            r4.append(r1)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "JCommonHelper"
            cn.jiguang.w.f.i(r4, r3)
            return r0
    }

    public static java.lang.Object a(int r3) {
            r0 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L12
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L12
            r2 = 0
            r1[r2] = r3     // Catch: java.lang.Throwable -> L12
            r3 = 14
            java.lang.Object r3 = cn.jiguang.f.b.C0042b.a(r3, r0, r0, r1)     // Catch: java.lang.Throwable -> L12
            return r3
        L12:
            r3 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Exception in getData: "
            r1.append(r2)
            java.lang.String r3 = r3.getMessage()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r1 = "JCommonHelper"
            cn.jiguang.w.f.i(r1, r3)
            return r0
    }

    public static java.lang.Object a(int r3, boolean r4) {
            r0 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L19
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L19
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L19
            r2 = 0
            r1[r2] = r3     // Catch: java.lang.Throwable -> L19
            r3 = 1
            r1[r3] = r4     // Catch: java.lang.Throwable -> L19
            r3 = 14
            java.lang.Object r3 = cn.jiguang.f.b.C0042b.a(r3, r0, r0, r1)     // Catch: java.lang.Throwable -> L19
            return r3
        L19:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "Exception in getData: "
            r4.append(r1)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "JCommonHelper"
            cn.jiguang.w.f.i(r4, r3)
            return r0
    }

    public static java.lang.Object a(android.os.Bundle r2, java.lang.Object... r3) {
            r0 = 26
            r1 = 0
            java.lang.Object r2 = cn.jiguang.f.b.C0042b.a(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L8
            return r2
        L8:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Exception in sendAction: "
            r3.append(r0)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "JCommonHelper"
            cn.jiguang.w.f.i(r3, r2)
            return r1
    }

    public static java.lang.String a() {
            java.lang.String r0 = ""
            java.lang.String r1 = "JCommonHelper"
            r2 = 2001(0x7d1, float:2.804E-42)
            java.lang.Object r2 = a(r2)     // Catch: java.lang.Throwable -> L11
            boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto L13
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L11
            return r2
        L11:
            r2 = move-exception
            goto L28
        L13:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11
            r3.<init>()     // Catch: java.lang.Throwable -> L11
            java.lang.String r4 = "getBaseBand() returned non-String object: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L11
            r3.append(r2)     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L11
            cn.jiguang.w.f.i(r1, r2)     // Catch: java.lang.Throwable -> L11
            return r0
        L28:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Exception in getBaseBand: "
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jiguang.w.f.i(r1, r2)
            return r0
    }

    public static java.util.List<java.lang.String> a(boolean r3, int r4) {
            r0 = 0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L22
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L22
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L22
            r2 = 0
            r1[r2] = r3     // Catch: java.lang.Throwable -> L22
            r3 = 1
            r1[r3] = r4     // Catch: java.lang.Throwable -> L22
            r3 = 22
            java.lang.Object r3 = cn.jiguang.f.b.C0042b.a(r3, r0, r0, r1)     // Catch: java.lang.Throwable -> L22
            if (r3 != 0) goto L1b
            return r0
        L1b:
            boolean r4 = r3 instanceof java.util.List     // Catch: java.lang.Throwable -> L22
            if (r4 == 0) goto L24
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L22
            return r3
        L22:
            r3 = move-exception
            goto L25
        L24:
            return r0
        L25:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "Exception in getAppList: "
            r4.append(r1)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "JCommonHelper"
            cn.jiguang.w.f.i(r4, r3)
            return r0
    }

    public static void a(long r3) {
            java.lang.String r0 = "JCommonHelper"
            java.lang.String r1 = "onLogin"
            cn.jiguang.w.f.c(r0, r1)     // Catch: java.lang.Throwable -> L1b
            android.os.Bundle r1 = new android.os.Bundle     // Catch: java.lang.Throwable -> L1b
            r1.<init>()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r2 = "serverTime"
            r1.putLong(r2, r3)     // Catch: java.lang.Throwable -> L1b
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L1b
            r4 = 13
            r2 = 0
            cn.jiguang.f.b.C0042b.a(r4, r2, r1, r3)     // Catch: java.lang.Throwable -> L1b
            return
        L1b:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "Exception in onLogin: "
            r4.append(r1)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            cn.jiguang.w.f.i(r0, r3)
            return
    }

    public static void a(long r3, java.lang.String r5, java.lang.String r6) {
            java.lang.String r0 = "JCommonHelper"
            java.lang.String r1 = "onRegister"
            cn.jiguang.w.f.c(r0, r1)     // Catch: java.lang.Throwable -> L25
            android.os.Bundle r1 = new android.os.Bundle     // Catch: java.lang.Throwable -> L25
            r1.<init>()     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = "uid"
            r1.putLong(r2, r3)     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = "regId"
            r1.putString(r3, r6)     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = "password"
            r1.putString(r3, r5)     // Catch: java.lang.Throwable -> L25
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L25
            r4 = 12
            r5 = 0
            cn.jiguang.f.b.C0042b.a(r4, r5, r1, r3)     // Catch: java.lang.Throwable -> L25
            return
        L25:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Exception in onRegister: "
            r4.append(r5)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            cn.jiguang.w.f.i(r0, r3)
            return
    }

    public static void a(android.content.Context r4) {
            java.lang.String r0 = "JCommonHelper"
            java.lang.String r1 = "initServerConfig"
            cn.jiguang.w.f.c(r0, r1)     // Catch: java.lang.Throwable -> L26
            java.lang.String r1 = cn.jiguang.v.a.a(r4)     // Catch: java.lang.Throwable -> L26
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto L28
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L26
            r4.<init>()     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = "initServerConfig appKey: "
            r4.append(r2)     // Catch: java.lang.Throwable -> L26
            r4.append(r1)     // Catch: java.lang.Throwable -> L26
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L26
            cn.jiguang.w.f.i(r0, r4)     // Catch: java.lang.Throwable -> L26
            return
        L26:
            r4 = move-exception
            goto L46
        L28:
            java.util.concurrent.atomic.AtomicBoolean r2 = cn.jiguang.f.b.f1278f     // Catch: java.lang.Throwable -> L26
            boolean r2 = r2.get()     // Catch: java.lang.Throwable -> L26
            if (r2 != 0) goto L45
            java.util.concurrent.atomic.AtomicBoolean r2 = cn.jiguang.f.b.f1278f     // Catch: java.lang.Throwable -> L26
            r3 = 1
            r2.set(r3)     // Catch: java.lang.Throwable -> L26
            cn.jiguang.f.a r2 = new cn.jiguang.f.a     // Catch: java.lang.Throwable -> L26
            r2.<init>()     // Catch: java.lang.Throwable -> L26
            a(r2)     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = cn.jiguang.a.a.f236c     // Catch: java.lang.Throwable -> L26
            int r3 = cn.jiguang.a.a.f237d     // Catch: java.lang.Throwable -> L26
            a(r4, r1, r2, r3)     // Catch: java.lang.Throwable -> L26
        L45:
            return
        L46:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Exception in initServerConfig: "
            r1.append(r2)
            java.lang.String r4 = r4.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            cn.jiguang.w.f.i(r0, r4)
            return
    }

    private static void a(android.content.Context r3, java.lang.String r4, java.lang.String r5, int r6) {
            java.lang.String r0 = "JCommonHelper"
            java.lang.String r1 = "initServerConfig imp"
            cn.jiguang.w.f.c(r0, r1)     // Catch: java.lang.Throwable -> L25
            android.os.Bundle r1 = new android.os.Bundle     // Catch: java.lang.Throwable -> L25
            r1.<init>()     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = "appKey"
            r1.putString(r2, r4)     // Catch: java.lang.Throwable -> L25
            java.lang.String r4 = "jversion_name"
            r1.putString(r4, r5)     // Catch: java.lang.Throwable -> L25
            java.lang.String r4 = "jversion"
            r1.putInt(r4, r6)     // Catch: java.lang.Throwable -> L25
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L25
            r5 = 10
            r6 = 0
            cn.jiguang.f.b.C0042b.a(r3, r5, r6, r1, r4)     // Catch: java.lang.Throwable -> L25
            return
        L25:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Exception in init: "
            r4.append(r5)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            cn.jiguang.w.f.i(r0, r3)
            return
    }

    public static void a(android.os.Bundle r4) {
            java.lang.String r0 = "JCommonHelper"
            java.lang.String r1 = "syncUserConfig"
            cn.jiguang.w.f.c(r0, r1)     // Catch: java.lang.Throwable -> L11
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L11
            r2 = 11
            r3 = 0
            cn.jiguang.f.b.C0042b.a(r2, r3, r4, r1)     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r4 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Exception in syncUserConfig: "
            r1.append(r2)
            java.lang.String r4 = r4.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            cn.jiguang.w.f.i(r0, r4)
            return
    }

    private static void a(cn.jiguang.commons.j.c r2) {
            cn.jiguang.f.b.C0042b.a(r2)     // Catch: java.lang.Throwable -> L4
            return
        L4:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Exception in addCallback: "
            r0.append(r1)
            java.lang.String r2 = r2.getMessage()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "JCommonHelper"
            cn.jiguang.w.f.i(r0, r2)
            return
    }

    public static void a(java.lang.String r4) {
            java.lang.String r0 = "JCommonHelper"
            java.lang.String r1 = "syncChannel"
            cn.jiguang.w.f.c(r0, r1)     // Catch: java.lang.Throwable -> L1b
            android.os.Bundle r1 = new android.os.Bundle     // Catch: java.lang.Throwable -> L1b
            r1.<init>()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r2 = cn.jiguang.f.b.f1275c     // Catch: java.lang.Throwable -> L1b
            r1.putString(r2, r4)     // Catch: java.lang.Throwable -> L1b
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L1b
            r2 = 11
            r3 = 0
            cn.jiguang.f.b.C0042b.a(r2, r3, r1, r4)     // Catch: java.lang.Throwable -> L1b
            return
        L1b:
            r4 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Exception in syncChannel: "
            r1.append(r2)
            java.lang.String r4 = r4.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            cn.jiguang.w.f.i(r0, r4)
            return
    }

    public static void a(java.lang.String r2, android.os.Bundle r3) {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L9
            r1 = 25
            cn.jiguang.f.b.C0042b.a(r1, r2, r3, r0)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Exception in sendAction: "
            r3.append(r0)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "JCommonHelper"
            cn.jiguang.w.f.i(r3, r2)
            return
    }

    public static void a(boolean r4) {
            java.lang.String r0 = "JCommonHelper"
            java.lang.String r1 = "syncForegroundState"
            cn.jiguang.w.f.c(r0, r1)     // Catch: java.lang.Throwable -> L1b
            android.os.Bundle r1 = new android.os.Bundle     // Catch: java.lang.Throwable -> L1b
            r1.<init>()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r2 = "isForeground"
            r1.putBoolean(r2, r4)     // Catch: java.lang.Throwable -> L1b
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L1b
            r2 = 11
            r3 = 0
            cn.jiguang.f.b.C0042b.a(r2, r3, r1, r4)     // Catch: java.lang.Throwable -> L1b
            return
        L1b:
            r4 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Exception in syncForegroundState: "
            r1.append(r2)
            java.lang.String r4 = r4.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            cn.jiguang.w.f.i(r0, r4)
            return
    }

    @android.annotation.SuppressLint({"DefaultLocale"})
    public static boolean a(int r13, boolean r14, boolean r15, boolean r16, boolean r17, boolean r18) {
            java.lang.String r1 = "JCommonHelper"
            r2 = 2
            r3 = 1
            r4 = 0
            java.lang.String r0 = "Checking isConfigEnable, params: configId=%d, useUserConfig=%b, useRegisterPro=%b, useForeground=%b, useMethodFrq=%b, useMethodCount=%b"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)     // Catch: java.lang.Throwable -> L84
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r14)     // Catch: java.lang.Throwable -> L84
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r15)     // Catch: java.lang.Throwable -> L84
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r16)     // Catch: java.lang.Throwable -> L84
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r17)     // Catch: java.lang.Throwable -> L84
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r18)     // Catch: java.lang.Throwable -> L84
            r11 = 6
            java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch: java.lang.Throwable -> L84
            r12[r4] = r5     // Catch: java.lang.Throwable -> L84
            r12[r3] = r6     // Catch: java.lang.Throwable -> L84
            r12[r2] = r7     // Catch: java.lang.Throwable -> L84
            r5 = 3
            r12[r5] = r8     // Catch: java.lang.Throwable -> L84
            r6 = 4
            r12[r6] = r9     // Catch: java.lang.Throwable -> L84
            r7 = 5
            r12[r7] = r10     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = java.lang.String.format(r0, r12)     // Catch: java.lang.Throwable -> L84
            cn.jiguang.w.f.c(r1, r0)     // Catch: java.lang.Throwable -> L84
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)     // Catch: java.lang.Throwable -> L84
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)     // Catch: java.lang.Throwable -> L84
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r15)     // Catch: java.lang.Throwable -> L84
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r16)     // Catch: java.lang.Throwable -> L84
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r17)     // Catch: java.lang.Throwable -> L84
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r18)     // Catch: java.lang.Throwable -> L84
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch: java.lang.Throwable -> L84
            r11[r4] = r0     // Catch: java.lang.Throwable -> L84
            r11[r3] = r14     // Catch: java.lang.Throwable -> L84
            r11[r2] = r8     // Catch: java.lang.Throwable -> L84
            r11[r5] = r9     // Catch: java.lang.Throwable -> L84
            r11[r6] = r10     // Catch: java.lang.Throwable -> L84
            r11[r7] = r12     // Catch: java.lang.Throwable -> L84
            r14 = 0
            r0 = 18
            java.lang.Object r14 = cn.jiguang.f.b.C0042b.a(r0, r14, r14, r11)     // Catch: java.lang.Throwable -> L84
            boolean r0 = r14 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L87
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
            r0.<init>()     // Catch: java.lang.Throwable -> L84
            java.lang.String r5 = "isConfigEnable result: "
            r0.append(r5)     // Catch: java.lang.Throwable -> L84
            r0.append(r14)     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L84
            cn.jiguang.w.f.c(r1, r0)     // Catch: java.lang.Throwable -> L84
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch: java.lang.Throwable -> L84
            boolean r13 = r14.booleanValue()     // Catch: java.lang.Throwable -> L84
            return r13
        L84:
            r0 = move-exception
            r14 = r0
            goto L9c
        L87:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
            r0.<init>()     // Catch: java.lang.Throwable -> L84
            java.lang.String r5 = "isConfigEnable returned non-Boolean: "
            r0.append(r5)     // Catch: java.lang.Throwable -> L84
            r0.append(r14)     // Catch: java.lang.Throwable -> L84
            java.lang.String r14 = r0.toString()     // Catch: java.lang.Throwable -> L84
            cn.jiguang.w.f.i(r1, r14)     // Catch: java.lang.Throwable -> L84
            return r4
        L9c:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.String r14 = r14.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r4] = r13
            r0[r3] = r14
            java.lang.String r13 = "Exception in isConfigEnable (configId=%d): %s"
            java.lang.String r13 = java.lang.String.format(r13, r0)
            cn.jiguang.w.f.i(r1, r13)
            return r4
    }

    public static java.lang.String b() {
            java.lang.String r0 = ""
            java.lang.String r1 = "JCommonHelper"
            r2 = 1013(0x3f5, float:1.42E-42)
            java.lang.Object r2 = a(r2)     // Catch: java.lang.Throwable -> L11
            boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto L13
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L11
            return r2
        L11:
            r2 = move-exception
            goto L28
        L13:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11
            r3.<init>()     // Catch: java.lang.Throwable -> L11
            java.lang.String r4 = "getModel() returned non-String object: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L11
            r3.append(r2)     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L11
            cn.jiguang.w.f.i(r1, r2)     // Catch: java.lang.Throwable -> L11
            return r0
        L28:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Exception in getModel: "
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jiguang.w.f.i(r1, r2)
            return r0
    }

    public static java.lang.String b(java.lang.String r4) {
            java.lang.String r0 = "JCommonHelper"
            r1 = 2005(0x7d5, float:2.81E-42)
            java.lang.Object r1 = a(r1)     // Catch: java.lang.Throwable -> Lf
            boolean r2 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L11
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r1 = move-exception
            goto L26
        L11:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf
            r2.<init>()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r3 = "getImsi() returned non-String object: "
            r2.append(r3)     // Catch: java.lang.Throwable -> Lf
            r2.append(r1)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> Lf
            cn.jiguang.w.f.i(r0, r1)     // Catch: java.lang.Throwable -> Lf
            return r4
        L26:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Exception in getImsi: "
            r2.append(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            cn.jiguang.w.f.i(r0, r1)
            return r4
    }

    public static void b(android.os.Bundle r4) {
            java.lang.String r0 = "JCommonHelper"
            java.lang.String r1 = "si"
            cn.jiguang.w.f.c(r0, r1)     // Catch: java.lang.Throwable -> L11
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L11
            r2 = 15
            r3 = 0
            cn.jiguang.f.b.C0042b.a(r2, r3, r4, r1)     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r4 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Exception in si: "
            r1.append(r2)
            java.lang.String r4 = r4.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            cn.jiguang.w.f.i(r0, r4)
            return
    }

    public static void b(boolean r4) {
            java.lang.String r0 = "JCommonHelper"
            java.lang.String r1 = "syncConnectedState"
            cn.jiguang.w.f.c(r0, r1)     // Catch: java.lang.Throwable -> L1b
            android.os.Bundle r1 = new android.os.Bundle     // Catch: java.lang.Throwable -> L1b
            r1.<init>()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r2 = "connected"
            r1.putBoolean(r2, r4)     // Catch: java.lang.Throwable -> L1b
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L1b
            r2 = 11
            r3 = 0
            cn.jiguang.f.b.C0042b.a(r2, r3, r1, r4)     // Catch: java.lang.Throwable -> L1b
            return
        L1b:
            r4 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Exception in syncConnectedState: "
            r1.append(r2)
            java.lang.String r4 = r4.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            cn.jiguang.w.f.i(r0, r4)
            return
    }

    public static boolean b(int r1) {
            r0 = 1
            boolean r1 = b(r1, r0)
            return r1
    }

    public static boolean b(int r6, boolean r7) {
            r4 = 0
            r5 = 0
            r2 = 1
            r3 = 0
            r0 = r6
            r1 = r7
            boolean r6 = a(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static java.lang.String c() {
            java.lang.String r0 = ""
            java.lang.String r1 = "JCommonHelper"
            r2 = 1013(0x3f5, float:1.42E-42)
            r3 = 1
            java.lang.Object r2 = a(r2, r3)     // Catch: java.lang.Throwable -> L12
            boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> L12
            if (r3 == 0) goto L14
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L12
            return r2
        L12:
            r2 = move-exception
            goto L29
        L14:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r3.<init>()     // Catch: java.lang.Throwable -> L12
            java.lang.String r4 = "getModel() returned non-String object: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L12
            r3.append(r2)     // Catch: java.lang.Throwable -> L12
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L12
            cn.jiguang.w.f.i(r1, r2)     // Catch: java.lang.Throwable -> L12
            return r0
        L29:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Exception in getModel: "
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jiguang.w.f.i(r1, r2)
            return r0
    }

    public static java.lang.String c(java.lang.String r4) {
            java.lang.String r0 = "JCommonHelper"
            r1 = 2004(0x7d4, float:2.808E-42)
            java.lang.Object r1 = a(r1)     // Catch: java.lang.Throwable -> Lf
            boolean r2 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L11
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r1 = move-exception
            goto L26
        L11:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf
            r2.<init>()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r3 = "getImei() returned non-String object: "
            r2.append(r3)     // Catch: java.lang.Throwable -> Lf
            r2.append(r1)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> Lf
            cn.jiguang.w.f.i(r0, r1)     // Catch: java.lang.Throwable -> Lf
            return r4
        L26:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Exception in getImei: "
            r2.append(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            cn.jiguang.w.f.i(r0, r1)
            return r4
    }

    public static void c(android.os.Bundle r4) {
            java.lang.String r0 = "JCommonHelper"
            java.lang.String r1 = "cm"
            cn.jiguang.w.f.c(r0, r1)     // Catch: java.lang.Throwable -> L11
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L11
            r2 = 16
            r3 = 0
            cn.jiguang.f.b.C0042b.a(r2, r3, r4, r1)     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r4 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Exception in cm: "
            r1.append(r2)
            java.lang.String r4 = r4.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            cn.jiguang.w.f.i(r0, r4)
            return
    }

    public static void c(boolean r3) {
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> L14
            r0.<init>()     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = "auth"
            r0.putBoolean(r1, r3)     // Catch: java.lang.Throwable -> L14
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L14
            r1 = 11
            r2 = 0
            cn.jiguang.f.b.C0042b.a(r1, r2, r0, r3)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r3 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Exception in syncAuthState: "
            r0.append(r1)
            java.lang.String r3 = r3.getMessage()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "JCommonHelper"
            cn.jiguang.w.f.i(r0, r3)
            return
    }

    public static boolean c(int r1) {
            r0 = 1
            boolean r1 = b(r1, r0)
            return r1
    }

    public static boolean c(int r6, boolean r7) {
            r4 = 0
            r5 = 0
            r2 = 1
            r3 = 1
            r0 = r6
            r1 = r7
            boolean r6 = a(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static int d(int r4) {
            java.lang.String r0 = "JCommonHelper"
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L23
            r2 = 0
            r3 = 27
            java.lang.Object r1 = cn.jiguang.f.b.C0042b.a(r3, r2, r2, r1)     // Catch: java.lang.Throwable -> L23
            boolean r2 = r1 instanceof org.json.JSONObject     // Catch: java.lang.Throwable -> L23
            if (r2 == 0) goto L25
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = "isCharging"
            boolean r2 = r1.optBoolean(r2)     // Catch: java.lang.Throwable -> L23
            r3 = -1
            if (r2 != 0) goto L1c
            return r3
        L1c:
            java.lang.String r2 = "plugged"
            int r4 = r1.optInt(r2, r3)     // Catch: java.lang.Throwable -> L23
            return r4
        L23:
            r1 = move-exception
            goto L3a
        L25:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23
            r2.<init>()     // Catch: java.lang.Throwable -> L23
            java.lang.String r3 = "getChargedStatus() returned non-Integer object: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L23
            r2.append(r1)     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L23
            cn.jiguang.w.f.i(r0, r1)     // Catch: java.lang.Throwable -> L23
            return r4
        L3a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Exception in getChargedStatus: "
            r2.append(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            cn.jiguang.w.f.i(r0, r1)
            return r4
    }

    public static java.lang.String d() {
            java.lang.String r0 = "0"
            java.lang.String r1 = "JCommonHelper"
            r2 = 1020(0x3fc, float:1.43E-42)
            java.lang.Object r2 = a(r2)     // Catch: java.lang.Throwable -> L11
            boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto L13
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L11
            return r2
        L11:
            r2 = move-exception
            goto L28
        L13:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11
            r3.<init>()     // Catch: java.lang.Throwable -> L11
            java.lang.String r4 = "getScreenSize() returned non-String object: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L11
            r3.append(r2)     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L11
            cn.jiguang.w.f.i(r1, r2)     // Catch: java.lang.Throwable -> L11
            return r0
        L28:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Exception in getScreenSize: "
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jiguang.w.f.i(r1, r2)
            return r0
    }

    public static java.lang.String d(java.lang.String r4) {
            java.lang.String r0 = "JCommonHelper"
            r1 = 1032(0x408, float:1.446E-42)
            java.lang.Object r1 = a(r1)     // Catch: java.lang.Throwable -> Lf
            boolean r2 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L11
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r1 = move-exception
            goto L26
        L11:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf
            r2.<init>()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r3 = "getFirstBoot() returned non-String object: "
            r2.append(r3)     // Catch: java.lang.Throwable -> Lf
            r2.append(r1)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> Lf
            cn.jiguang.w.f.i(r0, r1)     // Catch: java.lang.Throwable -> Lf
            return r4
        L26:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Exception in getFirstBoot: "
            r2.append(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            cn.jiguang.w.f.i(r0, r1)
            return r4
    }

    public static org.json.JSONObject d(boolean r4) {
            java.lang.String r0 = "JCommonHelper"
            r1 = 0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L2e
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            r2[r3] = r4     // Catch: java.lang.Throwable -> L2e
            r4 = 21
            java.lang.Object r4 = cn.jiguang.f.b.C0042b.a(r4, r1, r1, r2)     // Catch: java.lang.Throwable -> L2e
            boolean r2 = r4 instanceof org.json.JSONObject     // Catch: java.lang.Throwable -> L2e
            if (r2 == 0) goto L30
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r2.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = "getDeviceInfo: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L2e
            r2.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L2e
            cn.jiguang.w.f.c(r0, r2)     // Catch: java.lang.Throwable -> L2e
            org.json.JSONObject r4 = (org.json.JSONObject) r4     // Catch: java.lang.Throwable -> L2e
            return r4
        L2e:
            r4 = move-exception
            goto L45
        L30:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r2.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = "getDeviceInfo() returned non-JSONObject object: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L2e
            r2.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> L2e
            cn.jiguang.w.f.i(r0, r4)     // Catch: java.lang.Throwable -> L2e
            return r1
        L45:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Exception in getDeviceInfo: "
            r2.append(r3)
            java.lang.String r4 = r4.getMessage()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            cn.jiguang.w.f.i(r0, r4)
            return r1
    }

    public static java.lang.String e() {
            java.lang.String r0 = ""
            java.lang.String r1 = "JCommonHelper"
            r2 = 1608(0x648, float:2.253E-42)
            java.lang.Object r2 = a(r2)     // Catch: java.lang.Throwable -> L11
            boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto L13
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L11
            return r2
        L11:
            r2 = move-exception
            goto L28
        L13:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11
            r3.<init>()     // Catch: java.lang.Throwable -> L11
            java.lang.String r4 = "getLocalSsid() returned non-String object: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L11
            r3.append(r2)     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L11
            cn.jiguang.w.f.i(r1, r2)     // Catch: java.lang.Throwable -> L11
            return r0
        L28:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Exception in getLocalSsid: "
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jiguang.w.f.i(r1, r2)
            return r0
    }

    public static java.lang.String e(java.lang.String r4) {
            java.lang.String r0 = "JCommonHelper"
            r1 = 1506(0x5e2, float:2.11E-42)
            java.lang.Object r1 = a(r1)     // Catch: java.lang.Throwable -> Lf
            boolean r2 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L11
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r1 = move-exception
            goto L26
        L11:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf
            r2.<init>()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r3 = "getNetworkOperator() returned non-String object: "
            r2.append(r3)     // Catch: java.lang.Throwable -> Lf
            r2.append(r1)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> Lf
            cn.jiguang.w.f.i(r0, r1)     // Catch: java.lang.Throwable -> Lf
            return r4
        L26:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Exception in getNetworkOperator: "
            r2.append(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            cn.jiguang.w.f.i(r0, r1)
            return r4
    }

    public static java.util.List<java.lang.String> e(int r1) {
            r0 = 0
            java.util.List r1 = a(r0, r1)
            return r1
    }

    public static long f(int r2) {
            org.json.JSONObject r2 = g(r2)
            if (r2 == 0) goto Ld
            java.lang.String r0 = "sc"
            long r0 = r2.optLong(r0)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public static java.lang.String f() {
            java.lang.String r0 = ""
            java.lang.String r1 = "JCommonHelper"
            r2 = 1601(0x641, float:2.243E-42)
            java.lang.Object r2 = a(r2)     // Catch: java.lang.Throwable -> L11
            boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto L13
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L11
            return r2
        L11:
            r2 = move-exception
            goto L28
        L13:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11
            r3.<init>()     // Catch: java.lang.Throwable -> L11
            java.lang.String r4 = "getLocalBssid() returned non-String object: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L11
            r3.append(r2)     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L11
            cn.jiguang.w.f.i(r1, r2)     // Catch: java.lang.Throwable -> L11
            return r0
        L28:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Exception in getLocalBssid: "
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jiguang.w.f.i(r1, r2)
            return r0
    }

    public static java.lang.String f(java.lang.String r4) {
            java.lang.String r0 = "JCommonHelper"
            r1 = 1504(0x5e0, float:2.108E-42)
            java.lang.Object r1 = a(r1)     // Catch: java.lang.Throwable -> Lf
            boolean r2 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L11
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r1 = move-exception
            goto L26
        L11:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf
            r2.<init>()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r3 = "getIntNetworkType() returned non-Integer object: "
            r2.append(r3)     // Catch: java.lang.Throwable -> Lf
            r2.append(r1)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> Lf
            cn.jiguang.w.f.i(r0, r1)     // Catch: java.lang.Throwable -> Lf
            return r4
        L26:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Exception in getIntNetworkType: "
            r2.append(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            cn.jiguang.w.f.i(r0, r1)
            return r4
    }

    public static long g(java.lang.String r2) {
            r0 = 0
            return r0
    }

    public static java.lang.String g() {
            java.lang.String r0 = "0*0"
            java.lang.String r1 = "JCommonHelper"
            r2 = 1017(0x3f9, float:1.425E-42)
            java.lang.Object r2 = a(r2)     // Catch: java.lang.Throwable -> L11
            boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto L13
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L11
            return r2
        L11:
            r2 = move-exception
            goto L28
        L13:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11
            r3.<init>()     // Catch: java.lang.Throwable -> L11
            java.lang.String r4 = "getResolutione() returned non-String object: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L11
            r3.append(r2)     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L11
            cn.jiguang.w.f.i(r1, r2)     // Catch: java.lang.Throwable -> L11
            return r0
        L28:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Exception in getResolutione: "
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jiguang.w.f.i(r1, r2)
            return r0
    }

    public static org.json.JSONObject g(int r4) {
            java.lang.String r0 = "JCommonHelper"
            r1 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L2a
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L2a
            r3 = 0
            r2[r3] = r4     // Catch: java.lang.Throwable -> L2a
            r4 = 24
            java.lang.Object r4 = cn.jiguang.f.b.C0042b.a(r4, r1, r1, r2)     // Catch: java.lang.Throwable -> L2a
            org.json.JSONObject r4 = (org.json.JSONObject) r4     // Catch: java.lang.Throwable -> L2a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a
            r2.<init>()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r3 = "getConfig: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L2a
            r2.append(r4)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L2a
            cn.jiguang.w.f.c(r0, r2)     // Catch: java.lang.Throwable -> L2a
            return r4
        L2a:
            r4 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Exception in getConfig: "
            r2.append(r3)
            java.lang.String r4 = r4.getMessage()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            cn.jiguang.w.f.i(r0, r4)
            return r1
    }

    public static java.lang.String h() {
            java.lang.String r0 = ""
            java.lang.String r1 = "JCommonHelper"
            r2 = 1007(0x3ef, float:1.411E-42)
            java.lang.Object r2 = a(r2)     // Catch: java.lang.Throwable -> L11
            boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto L13
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L11
            return r2
        L11:
            r2 = move-exception
            goto L28
        L13:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11
            r3.<init>()     // Catch: java.lang.Throwable -> L11
            java.lang.String r4 = "getFingerprint() returned non-String object: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L11
            r3.append(r2)     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L11
            cn.jiguang.w.f.i(r1, r2)     // Catch: java.lang.Throwable -> L11
            return r0
        L28:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Exception in getFingerprint: "
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jiguang.w.f.i(r1, r2)
            return r0
    }

    public static void h(java.lang.String r0) {
            return
    }

    public static java.lang.String i() {
            java.lang.String r0 = ""
            java.lang.String r1 = "JCommonHelper"
            r2 = 1015(0x3f7, float:1.422E-42)
            java.lang.Object r2 = a(r2)     // Catch: java.lang.Throwable -> L11
            boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto L13
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L11
            return r2
        L11:
            r2 = move-exception
            goto L28
        L13:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11
            r3.<init>()     // Catch: java.lang.Throwable -> L11
            java.lang.String r4 = "getProduct() returned non-String object: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L11
            r3.append(r2)     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L11
            cn.jiguang.w.f.i(r1, r2)     // Catch: java.lang.Throwable -> L11
            return r0
        L28:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Exception in getProduct: "
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jiguang.w.f.i(r1, r2)
            return r0
    }

    public static java.lang.String j() {
            java.lang.String r0 = ""
            java.lang.String r1 = "JCommonHelper"
            r2 = 1010(0x3f2, float:1.415E-42)
            java.lang.Object r2 = a(r2)     // Catch: java.lang.Throwable -> L11
            boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto L13
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L11
            return r2
        L11:
            r2 = move-exception
            goto L28
        L13:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11
            r3.<init>()     // Catch: java.lang.Throwable -> L11
            java.lang.String r4 = "getMac() returned non-String object: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L11
            r3.append(r2)     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L11
            cn.jiguang.w.f.i(r1, r2)     // Catch: java.lang.Throwable -> L11
            return r0
        L28:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Exception in getMac: "
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jiguang.w.f.i(r1, r2)
            return r0
    }

    public static boolean k() {
            java.lang.String r0 = "JCommonHelper"
            r1 = 2500(0x9c4, float:3.503E-42)
            r2 = 0
            java.lang.Object r1 = a(r1)     // Catch: java.lang.Throwable -> L14
            boolean r3 = r1 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L14
            if (r3 == 0) goto L16
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L14
            boolean r0 = r1.booleanValue()     // Catch: java.lang.Throwable -> L14
            return r0
        L14:
            r1 = move-exception
            goto L2b
        L16:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14
            r3.<init>()     // Catch: java.lang.Throwable -> L14
            java.lang.String r4 = "getRootState() returned non-Boolean object: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L14
            r3.append(r1)     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L14
            cn.jiguang.w.f.i(r0, r1)     // Catch: java.lang.Throwable -> L14
            return r2
        L2b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Exception in getRootState: "
            r3.append(r4)
            java.lang.String r1 = r1.getMessage()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            cn.jiguang.w.f.i(r0, r1)
            return r2
    }

    public static java.lang.String l() {
            java.lang.String r0 = ""
            java.lang.String r1 = "JCommonHelper"
            r2 = 1001(0x3e9, float:1.403E-42)
            java.lang.Object r2 = a(r2)     // Catch: java.lang.Throwable -> L11
            boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto L13
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L11
            return r2
        L11:
            r2 = move-exception
            goto L28
        L13:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11
            r3.<init>()     // Catch: java.lang.Throwable -> L11
            java.lang.String r4 = "getAndroidId() returned non-String object: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L11
            r3.append(r2)     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L11
            cn.jiguang.w.f.i(r1, r2)     // Catch: java.lang.Throwable -> L11
            return r0
        L28:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Exception in getAndroidId: "
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jiguang.w.f.i(r1, r2)
            return r0
    }

    public static java.lang.String m() {
            java.lang.String r0 = ""
            java.lang.String r0 = c(r0)
            return r0
    }

    public static java.lang.String n() {
            java.lang.String r0 = ""
            java.lang.String r0 = d(r0)
            return r0
    }

    public static java.lang.String o() {
            java.lang.String r0 = ""
            java.lang.String r1 = "JCommonHelper"
            r2 = 1014(0x3f6, float:1.421E-42)
            java.lang.Object r2 = a(r2)     // Catch: java.lang.Throwable -> L11
            boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto L13
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L11
            return r2
        L11:
            r2 = move-exception
            goto L28
        L13:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11
            r3.<init>()     // Catch: java.lang.Throwable -> L11
            java.lang.String r4 = "getOsVersionName() returned non-String object: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L11
            r3.append(r2)     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L11
            cn.jiguang.w.f.i(r1, r2)     // Catch: java.lang.Throwable -> L11
            return r0
        L28:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Exception in getOsVersionName: "
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jiguang.w.f.i(r1, r2)
            return r0
    }

    public static java.lang.String p() {
            java.lang.String r0 = ""
            java.lang.String r1 = "JCommonHelper"
            r2 = 1026(0x402, float:1.438E-42)
            java.lang.Object r2 = a(r2)     // Catch: java.lang.Throwable -> L11
            boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto L13
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L11
            return r2
        L11:
            r2 = move-exception
            goto L28
        L13:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11
            r3.<init>()     // Catch: java.lang.Throwable -> L11
            java.lang.String r4 = "getTimeZone() returned non-String object: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L11
            r3.append(r2)     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L11
            cn.jiguang.w.f.i(r1, r2)     // Catch: java.lang.Throwable -> L11
            return r0
        L28:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Exception in getTimeZone: "
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jiguang.w.f.i(r1, r2)
            return r0
    }

    public static java.lang.String q() {
            java.lang.String r0 = ""
            java.lang.String r1 = "JCommonHelper"
            r2 = 1011(0x3f3, float:1.417E-42)
            java.lang.Object r2 = a(r2)     // Catch: java.lang.Throwable -> L11
            boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto L13
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L11
            return r2
        L11:
            r2 = move-exception
            goto L28
        L13:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11
            r3.<init>()     // Catch: java.lang.Throwable -> L11
            java.lang.String r4 = "getManufacturer() returned non-String object: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L11
            r3.append(r2)     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L11
            cn.jiguang.w.f.i(r1, r2)     // Catch: java.lang.Throwable -> L11
            return r0
        L28:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Exception in getManufacturer: "
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jiguang.w.f.i(r1, r2)
            return r0
    }

    public static java.lang.String r() {
            java.lang.String r0 = ""
            java.lang.String r1 = "JCommonHelper"
            r2 = 1011(0x3f3, float:1.417E-42)
            r3 = 1
            java.lang.Object r2 = a(r2, r3)     // Catch: java.lang.Throwable -> L12
            boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> L12
            if (r3 == 0) goto L14
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L12
            return r2
        L12:
            r2 = move-exception
            goto L29
        L14:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r3.<init>()     // Catch: java.lang.Throwable -> L12
            java.lang.String r4 = "getManufacturerApi() returned non-String object: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L12
            r3.append(r2)     // Catch: java.lang.Throwable -> L12
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L12
            cn.jiguang.w.f.i(r1, r2)     // Catch: java.lang.Throwable -> L12
            return r0
        L29:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Exception in getManufacturerApi: "
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jiguang.w.f.i(r1, r2)
            return r0
    }

    public static java.lang.String s() {
            java.lang.String r0 = ""
            java.lang.String r1 = "JCommonHelper"
            r2 = 1009(0x3f1, float:1.414E-42)
            java.lang.Object r2 = a(r2)     // Catch: java.lang.Throwable -> L11
            boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto L13
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L11
            return r2
        L11:
            r2 = move-exception
            goto L28
        L13:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11
            r3.<init>()     // Catch: java.lang.Throwable -> L11
            java.lang.String r4 = "getLanguage() returned non-String object: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L11
            r3.append(r2)     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L11
            cn.jiguang.w.f.i(r1, r2)     // Catch: java.lang.Throwable -> L11
            return r0
        L28:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Exception in getLanguage: "
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jiguang.w.f.i(r1, r2)
            return r0
    }

    public static java.lang.String t() {
            java.lang.String r0 = ""
            java.lang.String r1 = "JCommonHelper"
            r2 = 1002(0x3ea, float:1.404E-42)
            java.lang.Object r2 = a(r2)     // Catch: java.lang.Throwable -> L11
            boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto L13
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L11
            return r2
        L11:
            r2 = move-exception
            goto L28
        L13:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11
            r3.<init>()     // Catch: java.lang.Throwable -> L11
            java.lang.String r4 = "getBrand() returned non-String object: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L11
            r3.append(r2)     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L11
            cn.jiguang.w.f.i(r1, r2)     // Catch: java.lang.Throwable -> L11
            return r0
        L28:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Exception in getBrand: "
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jiguang.w.f.i(r1, r2)
            return r0
    }

    public static java.lang.String u() {
            java.lang.String r0 = ""
            java.lang.String r1 = "JCommonHelper"
            r2 = 1019(0x3fb, float:1.428E-42)
            java.lang.Object r2 = a(r2)     // Catch: java.lang.Throwable -> L11
            boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto L13
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L11
            return r2
        L11:
            r2 = move-exception
            goto L28
        L13:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11
            r3.<init>()     // Catch: java.lang.Throwable -> L11
            java.lang.String r4 = "getRomVersion() returned non-String object: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L11
            r3.append(r2)     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L11
            cn.jiguang.w.f.i(r1, r2)     // Catch: java.lang.Throwable -> L11
            return r0
        L28:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Exception in getRomVersion: "
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jiguang.w.f.i(r1, r2)
            return r0
    }

    public static java.lang.String v() {
            java.lang.String r0 = ""
            java.lang.String r1 = "JCommonHelper"
            r2 = 1900(0x76c, float:2.662E-42)
            java.lang.Object r2 = a(r2)     // Catch: java.lang.Throwable -> L11
            boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto L13
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L11
            return r2
        L11:
            r2 = move-exception
            goto L28
        L13:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11
            r3.<init>()     // Catch: java.lang.Throwable -> L11
            java.lang.String r4 = "getOaid() returned non-String object: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L11
            r3.append(r2)     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L11
            cn.jiguang.w.f.i(r1, r2)     // Catch: java.lang.Throwable -> L11
            return r0
        L28:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Exception in getOaid: "
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jiguang.w.f.i(r1, r2)
            return r0
    }

    public static java.lang.String w() {
            java.lang.String r0 = ""
            java.lang.String r1 = "JCommonHelper"
            r2 = 1901(0x76d, float:2.664E-42)
            java.lang.Object r2 = a(r2)     // Catch: java.lang.Throwable -> L11
            boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto L13
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L11
            return r2
        L11:
            r2 = move-exception
            goto L28
        L13:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11
            r3.<init>()     // Catch: java.lang.Throwable -> L11
            java.lang.String r4 = "getGaid() returned non-String object: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L11
            r3.append(r2)     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L11
            cn.jiguang.w.f.i(r1, r2)     // Catch: java.lang.Throwable -> L11
            return r0
        L28:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Exception in getGaid: "
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jiguang.w.f.i(r1, r2)
            return r0
    }

    public static java.lang.String x() {
            java.lang.String r0 = ""
            java.lang.String r0 = e(r0)
            return r0
    }

    public static int y() {
            r0 = -1
            int r0 = d(r0)
            return r0
    }

    public static android.os.Bundle z() {
            java.lang.String r0 = "JCommonHelper"
            r1 = 0
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L18
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L18
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Throwable -> L18
            r3 = 19
            java.lang.Object r2 = cn.jiguang.f.b.C0042b.a(r3, r1, r1, r2)     // Catch: java.lang.Throwable -> L18
            boolean r3 = r2 instanceof android.os.Bundle     // Catch: java.lang.Throwable -> L18
            if (r3 == 0) goto L1a
            android.os.Bundle r2 = (android.os.Bundle) r2     // Catch: java.lang.Throwable -> L18
            return r2
        L18:
            r2 = move-exception
            goto L2f
        L1a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L18
            r3.<init>()     // Catch: java.lang.Throwable -> L18
            java.lang.String r4 = "getGps() returned non-Bundle object: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L18
            r3.append(r2)     // Catch: java.lang.Throwable -> L18
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L18
            cn.jiguang.w.f.i(r0, r2)     // Catch: java.lang.Throwable -> L18
            return r1
        L2f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Exception in getGps: "
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jiguang.w.f.i(r0, r2)
            return r1
    }
}
