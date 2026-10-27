package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class u implements com.umeng.analytics.pro.y.a {
    public static final java.lang.String a = "session_start_time";
    public static final java.lang.String b = "session_end_time";
    public static final java.lang.String c = "session_id";
    public static final java.lang.String d = "pre_session_id";
    public static final java.lang.String e = "a_start_time";
    public static final java.lang.String f = "a_end_time";
    public static final java.lang.String g = "fg_count";
    private static java.lang.String h = null;
    private static android.content.Context i = null;
    private static boolean j = false;
    private static long k = 0;
    private static boolean l = true;
    private static long m;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.umeng.analytics.pro.u$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a {
        private static final com.umeng.analytics.pro.u a = null;

        static {
                com.umeng.analytics.pro.u r0 = new com.umeng.analytics.pro.u
                r1 = 0
                r0.<init>(r1)
                com.umeng.analytics.pro.u.a.a = r0
                return
        }

        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ com.umeng.analytics.pro.u a() {
                com.umeng.analytics.pro.u r0 = com.umeng.analytics.pro.u.a.a
                return r0
        }
    }

    static {
            return
    }

    private u() {
            r1 = this;
            r1.<init>()
            com.umeng.analytics.pro.y r0 = com.umeng.analytics.pro.y.a()
            r0.a(r1)
            return
    }

    /* synthetic */ u(com.umeng.analytics.pro.u.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static long a(android.content.Context r3) {
            r0 = 0
            android.content.SharedPreferences r3 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r3)     // Catch: java.lang.Throwable -> Lc
            java.lang.String r2 = "fg_count"
            long r0 = r3.getLong(r2, r0)     // Catch: java.lang.Throwable -> Lc
        Lc:
            return r0
    }

    public static com.umeng.analytics.pro.u a() {
            com.umeng.analytics.pro.u r0 = com.umeng.analytics.pro.u.a.a()
            return r0
    }

    private void a(android.content.Context r7, java.lang.String r8, long r9, long r11, long r13) {
            r6 = this;
            java.lang.String r0 = com.umeng.analytics.pro.u.h
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L14
            com.umeng.analytics.pro.y r0 = com.umeng.analytics.pro.y.a()
            android.content.Context r1 = com.umeng.analytics.pro.u.i
            java.lang.String r0 = r0.a(r1)
            com.umeng.analytics.pro.u.h = r0
        L14:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L97
            java.lang.String r0 = com.umeng.analytics.pro.u.h
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L23
            goto L97
        L23:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L67
            r0.<init>()     // Catch: java.lang.Exception -> L67
            java.lang.String r1 = "__f"
            r0.put(r1, r11)     // Catch: java.lang.Exception -> L67
            java.lang.String r11 = "__g"
            r0.put(r11, r13)     // Catch: java.lang.Exception -> L67
            com.umeng.analytics.b r11 = com.umeng.analytics.b.a()     // Catch: java.lang.Exception -> L67
            org.json.JSONObject r11 = r11.b()     // Catch: java.lang.Exception -> L67
            if (r11 == 0) goto L47
            int r12 = r11.length()     // Catch: java.lang.Exception -> L67
            if (r12 <= 0) goto L47
            java.lang.String r12 = "__sp"
            r0.put(r12, r11)     // Catch: java.lang.Exception -> L67
        L47:
            com.umeng.analytics.b r11 = com.umeng.analytics.b.a()     // Catch: java.lang.Exception -> L67
            org.json.JSONObject r11 = r11.c()     // Catch: java.lang.Exception -> L67
            if (r11 == 0) goto L5c
            int r12 = r11.length()     // Catch: java.lang.Exception -> L67
            if (r12 <= 0) goto L5c
            java.lang.String r12 = "__pp"
            r0.put(r12, r11)     // Catch: java.lang.Exception -> L67
        L5c:
            com.umeng.analytics.pro.i r11 = com.umeng.analytics.pro.i.a(r7)     // Catch: java.lang.Exception -> L67
            java.lang.String r12 = com.umeng.analytics.pro.u.h     // Catch: java.lang.Exception -> L67
            com.umeng.analytics.pro.i$a r1 = com.umeng.analytics.pro.i.a.d     // Catch: java.lang.Exception -> L67
            r11.a(r12, r0, r1)     // Catch: java.lang.Exception -> L67
        L67:
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch: java.lang.Exception -> L95
            r11.<init>()     // Catch: java.lang.Exception -> L95
            java.lang.String r12 = "__e"
            r11.put(r12, r9)     // Catch: java.lang.Exception -> L95
            com.umeng.analytics.pro.i r9 = com.umeng.analytics.pro.i.a(r7)     // Catch: java.lang.Exception -> L95
            com.umeng.analytics.pro.i$a r10 = com.umeng.analytics.pro.i.a.c     // Catch: java.lang.Exception -> L95
            r9.a(r8, r11, r10)     // Catch: java.lang.Exception -> L95
            java.lang.String r9 = "header_foreground_count"
            boolean r9 = com.umeng.commonsdk.config.FieldManager.allow(r9)     // Catch: java.lang.Exception -> L95
            if (r9 == 0) goto L95
            com.umeng.analytics.pro.u.m = r13     // Catch: java.lang.Exception -> L95
            r6.d(r7)     // Catch: java.lang.Exception -> L95
            android.content.Context r0 = com.umeng.analytics.pro.u.i     // Catch: java.lang.Exception -> L95
            com.umeng.analytics.CoreProtocol r2 = com.umeng.analytics.CoreProtocol.getInstance(r0)     // Catch: java.lang.Exception -> L95
            r3 = 0
            r4 = 0
            r1 = 8213(0x2015, float:1.1509E-41)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEventEx(r0, r1, r2, r3, r4)     // Catch: java.lang.Exception -> L95
        L95:
            com.umeng.analytics.pro.u.h = r8
        L97:
            return
    }

    private void a(java.lang.String r10, long r11) {
            r9 = this;
            android.content.Context r0 = com.umeng.analytics.pro.u.i
            android.content.SharedPreferences r0 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r0)
            if (r0 != 0) goto La
            goto Lce
        La:
            java.lang.String r1 = "session_end_time"
            r2 = 0
            long r0 = r0.getLong(r1, r2)
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lce
            r4.<init>()     // Catch: java.lang.Throwable -> Lce
            java.lang.String r5 = "__ii"
            r4.put(r5, r10)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r5 = "__e"
            r4.put(r5, r11)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r11 = "__f"
            r4.put(r11, r0)     // Catch: java.lang.Throwable -> Lce
            double[] r11 = com.umeng.analytics.AnalyticsConfig.getLocation()     // Catch: java.lang.Throwable -> Lce
            r12 = 1
            r0 = 0
            if (r11 == 0) goto L4f
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lce
            r1.<init>()     // Catch: java.lang.Throwable -> Lce
            java.lang.String r5 = "lat"
            r6 = r11[r0]     // Catch: java.lang.Throwable -> Lce
            r1.put(r5, r6)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r5 = "lng"
            r6 = r11[r12]     // Catch: java.lang.Throwable -> Lce
            r1.put(r5, r6)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r11 = "ts"
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lce
            r1.put(r11, r5)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r11 = "__d"
            r4.put(r11, r1)     // Catch: java.lang.Throwable -> Lce
        L4f:
            java.lang.String r11 = "android.net.TrafficStats"
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r1 = "getUidRxBytes"
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> Lce
            java.lang.Class[] r6 = new java.lang.Class[r12]     // Catch: java.lang.Throwable -> Lce
            r6[r0] = r5     // Catch: java.lang.Throwable -> Lce
            java.lang.reflect.Method r1 = r11.getMethod(r1, r6)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r6 = "getUidTxBytes"
            java.lang.Class[] r7 = new java.lang.Class[r12]     // Catch: java.lang.Throwable -> Lce
            r7[r0] = r5     // Catch: java.lang.Throwable -> Lce
            java.lang.reflect.Method r11 = r11.getMethod(r6, r7)     // Catch: java.lang.Throwable -> Lce
            android.content.Context r5 = com.umeng.analytics.pro.u.i     // Catch: java.lang.Throwable -> Lce
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo()     // Catch: java.lang.Throwable -> Lce
            int r5 = r5.uid     // Catch: java.lang.Throwable -> Lce
            r6 = -1
            if (r5 != r6) goto L77
            goto Lce
        L77:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> Lce
            java.lang.Object[] r7 = new java.lang.Object[r12]     // Catch: java.lang.Throwable -> Lce
            r7[r0] = r6     // Catch: java.lang.Throwable -> Lce
            r6 = 0
            java.lang.Object r1 = r1.invoke(r6, r7)     // Catch: java.lang.Throwable -> Lce
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.Throwable -> Lce
            long r7 = r1.longValue()     // Catch: java.lang.Throwable -> Lce
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> Lce
            java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch: java.lang.Throwable -> Lce
            r12[r0] = r1     // Catch: java.lang.Throwable -> Lce
            java.lang.Object r11 = r11.invoke(r6, r12)     // Catch: java.lang.Throwable -> Lce
            java.lang.Long r11 = (java.lang.Long) r11     // Catch: java.lang.Throwable -> Lce
            long r11 = r11.longValue()     // Catch: java.lang.Throwable -> Lce
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 <= 0) goto Lb9
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 > 0) goto La5
            goto Lb9
        La5:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lce
            r0.<init>()     // Catch: java.lang.Throwable -> Lce
            java.lang.String r1 = "download_traffic"
            r0.put(r1, r7)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r1 = "upload_traffic"
            r0.put(r1, r11)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r11 = "__c"
            r4.put(r11, r0)     // Catch: java.lang.Throwable -> Lce
        Lb9:
            android.content.Context r11 = com.umeng.analytics.pro.u.i     // Catch: java.lang.Throwable -> Lce
            com.umeng.analytics.pro.i r11 = com.umeng.analytics.pro.i.a(r11)     // Catch: java.lang.Throwable -> Lce
            com.umeng.analytics.pro.i$a r12 = com.umeng.analytics.pro.i.a.e     // Catch: java.lang.Throwable -> Lce
            r11.a(r10, r4, r12)     // Catch: java.lang.Throwable -> Lce
            android.content.Context r10 = com.umeng.analytics.pro.u.i     // Catch: java.lang.Throwable -> Lce
            com.umeng.analytics.pro.v.a(r10)     // Catch: java.lang.Throwable -> Lce
            android.content.Context r10 = com.umeng.analytics.pro.u.i     // Catch: java.lang.Throwable -> Lce
            com.umeng.analytics.pro.l.c(r10)     // Catch: java.lang.Throwable -> Lce
        Lce:
            return
    }

    public static void b(android.content.Context r5) {
            android.content.Context r5 = com.umeng.analytics.pro.u.i
            android.content.SharedPreferences r5 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r5)
            if (r5 == 0) goto L1f
            r0 = 0
            java.lang.String r2 = "fg_count"
            long r0 = r5.getLong(r2, r0)
            android.content.SharedPreferences$Editor r5 = r5.edit()
            if (r5 == 0) goto L1f
            r3 = 1
            long r0 = r0 + r3
            r5.putLong(r2, r0)
            r5.commit()
        L1f:
            return
    }

    private void d(android.content.Context r4) {
            r3 = this;
            android.content.SharedPreferences r4 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r4)     // Catch: java.lang.Throwable -> L12
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = "fg_count"
            r1 = 0
            r4.putLong(r0, r1)     // Catch: java.lang.Throwable -> L12
            r4.commit()     // Catch: java.lang.Throwable -> L12
        L12:
            return
    }

    private java.lang.String e(android.content.Context r3) {
            r2 = this;
            android.content.Context r0 = com.umeng.analytics.pro.u.i
            if (r0 != 0) goto L10
            if (r3 == 0) goto L10
            android.content.Context r0 = r3.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            com.umeng.analytics.pro.u.i = r0
        L10:
            com.umeng.analytics.pro.y r0 = com.umeng.analytics.pro.y.a()
            android.content.Context r1 = com.umeng.analytics.pro.u.i
            java.lang.String r0 = r0.d(r1)
            r2.f(r3)     // Catch: java.lang.Throwable -> L27
            android.content.Context r3 = com.umeng.analytics.pro.u.i     // Catch: java.lang.Throwable -> L27
            com.umeng.analytics.pro.o r3 = com.umeng.analytics.pro.o.a(r3)     // Catch: java.lang.Throwable -> L27
            r1 = 0
            r3.d(r1)     // Catch: java.lang.Throwable -> L27
        L27:
            return r0
    }

    private void f(android.content.Context r2) {
            r1 = this;
            com.umeng.analytics.pro.o r0 = com.umeng.analytics.pro.o.a(r2)
            r0.b(r2)
            com.umeng.analytics.pro.o r2 = com.umeng.analytics.pro.o.a(r2)
            r2.d()
            return
    }

    public java.lang.String a(android.content.Context r4, long r5, boolean r7) {
            r3 = this;
            com.umeng.analytics.pro.y r0 = com.umeng.analytics.pro.y.a()
            java.lang.String r0 = r0.b(r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "--->>> onInstantSessionInternal: current session id = "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MobclickRT"
            com.umeng.commonsdk.debug.UMRTLog.i(r2, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L26
            r4 = 0
            return r4
        L26:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L6a
            r1.<init>()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r2 = "__e"
            r1.put(r2, r5)     // Catch: java.lang.Throwable -> L6a
            com.umeng.analytics.b r5 = com.umeng.analytics.b.a()     // Catch: java.lang.Throwable -> L6a
            org.json.JSONObject r5 = r5.b()     // Catch: java.lang.Throwable -> L6a
            if (r5 == 0) goto L45
            int r6 = r5.length()     // Catch: java.lang.Throwable -> L6a
            if (r6 <= 0) goto L45
            java.lang.String r6 = "__sp"
            r1.put(r6, r5)     // Catch: java.lang.Throwable -> L6a
        L45:
            com.umeng.analytics.b r5 = com.umeng.analytics.b.a()     // Catch: java.lang.Throwable -> L6a
            org.json.JSONObject r5 = r5.c()     // Catch: java.lang.Throwable -> L6a
            if (r5 == 0) goto L5a
            int r6 = r5.length()     // Catch: java.lang.Throwable -> L6a
            if (r6 <= 0) goto L5a
            java.lang.String r6 = "__pp"
            r1.put(r6, r5)     // Catch: java.lang.Throwable -> L6a
        L5a:
            com.umeng.analytics.pro.i r5 = com.umeng.analytics.pro.i.a(r4)     // Catch: java.lang.Throwable -> L6a
            com.umeng.analytics.pro.i$a r6 = com.umeng.analytics.pro.i.a.f     // Catch: java.lang.Throwable -> L6a
            r5.a(r0, r1, r6)     // Catch: java.lang.Throwable -> L6a
            com.umeng.analytics.pro.o r4 = com.umeng.analytics.pro.o.a(r4)     // Catch: java.lang.Throwable -> L6a
            r4.a(r1, r7)     // Catch: java.lang.Throwable -> L6a
        L6a:
            return r0
    }

    public void a(android.content.Context r2, long r3) {
            r1 = this;
            android.content.Context r2 = com.umeng.analytics.pro.u.i
            android.content.SharedPreferences r2 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r2)
            if (r2 == 0) goto L16
            android.content.SharedPreferences$Editor r2 = r2.edit()
            if (r2 == 0) goto L16
            java.lang.String r0 = "session_start_time"
            r2.putLong(r0, r3)
            r2.commit()
        L16:
            return
    }

    public void a(android.content.Context r13, java.lang.Object r14) {
            r12 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "versionname"
            android.content.Context r2 = com.umeng.analytics.pro.u.i     // Catch: java.lang.Throwable -> L176
            if (r2 != 0) goto L14
            if (r13 == 0) goto L14
            android.content.Context r2 = r13.getApplicationContext()     // Catch: java.lang.Throwable -> L176
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)     // Catch: java.lang.Throwable -> L176
            com.umeng.analytics.pro.u.i = r2     // Catch: java.lang.Throwable -> L176
        L14:
            java.lang.Long r14 = (java.lang.Long) r14     // Catch: java.lang.Throwable -> L176
            long r2 = r14.longValue()     // Catch: java.lang.Throwable -> L176
            android.content.Context r14 = com.umeng.analytics.pro.u.i     // Catch: java.lang.Throwable -> L176
            android.content.SharedPreferences r14 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r14)     // Catch: java.lang.Throwable -> L176
            if (r14 != 0) goto L24
            goto L176
        L24:
            android.content.SharedPreferences$Editor r4 = r14.edit()     // Catch: java.lang.Throwable -> L176
            if (r4 != 0) goto L2c
            goto L176
        L2c:
            java.lang.String r5 = r14.getString(r1, r0)     // Catch: java.lang.Throwable -> L176
            android.content.Context r6 = com.umeng.analytics.pro.u.i     // Catch: java.lang.Throwable -> L176
            java.lang.String r6 = com.umeng.commonsdk.utils.UMUtils.getAppVersionName(r6)     // Catch: java.lang.Throwable -> L176
            boolean r7 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L176
            java.lang.String r8 = "MobclickRT"
            java.lang.String r9 = "versioncode"
            r10 = 0
            if (r7 == 0) goto L53
            java.lang.String r0 = com.umeng.commonsdk.utils.UMUtils.getAppVersionCode(r13)     // Catch: java.lang.Throwable -> L176
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L176
            r4.putInt(r9, r0)     // Catch: java.lang.Throwable -> L176
            r4.putString(r1, r6)     // Catch: java.lang.Throwable -> L176
            r4.commit()     // Catch: java.lang.Throwable -> L176
            goto Lcb
        L53:
            boolean r7 = r5.equals(r6)     // Catch: java.lang.Throwable -> L176
            if (r7 != 0) goto Lcb
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L176
            r7.<init>()     // Catch: java.lang.Throwable -> L176
            java.lang.String r11 = "--->>> onStartSessionInternal: upgrade version: "
            r7.append(r11)     // Catch: java.lang.Throwable -> L176
            r7.append(r5)     // Catch: java.lang.Throwable -> L176
            java.lang.String r11 = "-> "
            r7.append(r11)     // Catch: java.lang.Throwable -> L176
            r7.append(r6)     // Catch: java.lang.Throwable -> L176
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L176
            com.umeng.commonsdk.debug.UMRTLog.i(r8, r7)     // Catch: java.lang.Throwable -> L176
            int r7 = r14.getInt(r9, r10)     // Catch: java.lang.Throwable -> L176
            java.lang.String r8 = "pre_date"
            java.lang.String r8 = r14.getString(r8, r0)     // Catch: java.lang.Throwable -> L176
            java.lang.String r11 = "pre_version"
            java.lang.String r11 = r14.getString(r11, r0)     // Catch: java.lang.Throwable -> L176
            java.lang.String r14 = r14.getString(r1, r0)     // Catch: java.lang.Throwable -> L176
            java.lang.String r13 = com.umeng.commonsdk.utils.UMUtils.getAppVersionCode(r13)     // Catch: java.lang.Throwable -> L176
            int r13 = java.lang.Integer.parseInt(r13)     // Catch: java.lang.Throwable -> L176
            r4.putInt(r9, r13)     // Catch: java.lang.Throwable -> L176
            r4.putString(r1, r6)     // Catch: java.lang.Throwable -> L176
            java.lang.String r13 = "vers_date"
            r4.putString(r13, r8)     // Catch: java.lang.Throwable -> L176
            java.lang.String r13 = "vers_pre_version"
            r4.putString(r13, r11)     // Catch: java.lang.Throwable -> L176
            java.lang.String r13 = "cur_version"
            r4.putString(r13, r14)     // Catch: java.lang.Throwable -> L176
            java.lang.String r13 = "vers_code"
            r4.putInt(r13, r7)     // Catch: java.lang.Throwable -> L176
            java.lang.String r13 = "vers_name"
            r4.putString(r13, r5)     // Catch: java.lang.Throwable -> L176
            r4.commit()     // Catch: java.lang.Throwable -> L176
            boolean r13 = com.umeng.analytics.pro.u.l     // Catch: java.lang.Throwable -> L176
            if (r13 == 0) goto Lb9
            com.umeng.analytics.pro.u.l = r10     // Catch: java.lang.Throwable -> L176
        Lb9:
            boolean r13 = com.umeng.analytics.pro.u.j     // Catch: java.lang.Throwable -> L176
            if (r13 == 0) goto L176
            com.umeng.analytics.pro.u.j = r10     // Catch: java.lang.Throwable -> L176
            android.content.Context r13 = com.umeng.analytics.pro.u.i     // Catch: java.lang.Throwable -> L176
            r14 = 1
            r12.b(r13, r2, r14)     // Catch: java.lang.Throwable -> L176
            android.content.Context r13 = com.umeng.analytics.pro.u.i     // Catch: java.lang.Throwable -> L176
            r12.b(r13, r2)     // Catch: java.lang.Throwable -> L176
            return
        Lcb:
            boolean r0 = com.umeng.analytics.pro.u.j     // Catch: java.lang.Throwable -> L176
            if (r0 == 0) goto L10a
            com.umeng.analytics.pro.u.j = r10     // Catch: java.lang.Throwable -> L176
            boolean r14 = com.umeng.analytics.pro.u.l     // Catch: java.lang.Throwable -> L176
            if (r14 == 0) goto Ld7
            com.umeng.analytics.pro.u.l = r10     // Catch: java.lang.Throwable -> L176
        Ld7:
            java.lang.String r13 = r12.e(r13)     // Catch: java.lang.Throwable -> L176
            com.umeng.analytics.pro.u.h = r13     // Catch: java.lang.Throwable -> L176
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L176
            r13.<init>()     // Catch: java.lang.Throwable -> L176
            java.lang.String r14 = "创建新会话: "
            r13.append(r14)     // Catch: java.lang.Throwable -> L176
            java.lang.String r14 = com.umeng.analytics.pro.u.h     // Catch: java.lang.Throwable -> L176
            r13.append(r14)     // Catch: java.lang.Throwable -> L176
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L176
            com.umeng.commonsdk.statistics.common.MLog.d(r13)     // Catch: java.lang.Throwable -> L176
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L176
            r13.<init>()     // Catch: java.lang.Throwable -> L176
            java.lang.String r14 = "mSessionChanged flag has been set, Start new session: "
            r13.append(r14)     // Catch: java.lang.Throwable -> L176
            java.lang.String r14 = com.umeng.analytics.pro.u.h     // Catch: java.lang.Throwable -> L176
            r13.append(r14)     // Catch: java.lang.Throwable -> L176
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L176
            com.umeng.commonsdk.debug.UMRTLog.i(r8, r13)     // Catch: java.lang.Throwable -> L176
            return
        L10a:
            java.lang.String r0 = "session_id"
            r1 = 0
            java.lang.String r14 = r14.getString(r0, r1)     // Catch: java.lang.Throwable -> L176
            com.umeng.analytics.pro.u.h = r14     // Catch: java.lang.Throwable -> L176
            java.lang.String r14 = "a_start_time"
            r4.putLong(r14, r2)     // Catch: java.lang.Throwable -> L176
            java.lang.String r14 = "a_end_time"
            r0 = 0
            r4.putLong(r14, r0)     // Catch: java.lang.Throwable -> L176
            r4.commit()     // Catch: java.lang.Throwable -> L176
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L176
            r14.<init>()     // Catch: java.lang.Throwable -> L176
            java.lang.String r0 = "延续上一个会话: "
            r14.append(r0)     // Catch: java.lang.Throwable -> L176
            java.lang.String r0 = com.umeng.analytics.pro.u.h     // Catch: java.lang.Throwable -> L176
            r14.append(r0)     // Catch: java.lang.Throwable -> L176
            java.lang.String r14 = r14.toString()     // Catch: java.lang.Throwable -> L176
            com.umeng.commonsdk.statistics.common.MLog.d(r14)     // Catch: java.lang.Throwable -> L176
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L176
            r14.<init>()     // Catch: java.lang.Throwable -> L176
            java.lang.String r0 = "Extend current session: "
            r14.append(r0)     // Catch: java.lang.Throwable -> L176
            java.lang.String r0 = com.umeng.analytics.pro.u.h     // Catch: java.lang.Throwable -> L176
            r14.append(r0)     // Catch: java.lang.Throwable -> L176
            java.lang.String r14 = r14.toString()     // Catch: java.lang.Throwable -> L176
            com.umeng.commonsdk.debug.UMRTLog.i(r8, r14)     // Catch: java.lang.Throwable -> L176
            boolean r14 = com.umeng.analytics.pro.u.l     // Catch: java.lang.Throwable -> L176
            if (r14 == 0) goto L16a
            com.umeng.analytics.pro.u.l = r10     // Catch: java.lang.Throwable -> L176
            java.lang.String r14 = "header_foreground_count"
            boolean r14 = com.umeng.commonsdk.config.FieldManager.allow(r14)     // Catch: java.lang.Throwable -> L176
            if (r14 == 0) goto L16a
            android.content.Context r0 = com.umeng.analytics.pro.u.i     // Catch: java.lang.Throwable -> L176
            com.umeng.analytics.CoreProtocol r2 = com.umeng.analytics.CoreProtocol.getInstance(r0)     // Catch: java.lang.Throwable -> L176
            r3 = 0
            r4 = 0
            r1 = 8213(0x2015, float:1.1509E-41)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEventEx(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L176
        L16a:
            r12.f(r13)     // Catch: java.lang.Throwable -> L176
            android.content.Context r13 = com.umeng.analytics.pro.u.i     // Catch: java.lang.Throwable -> L176
            com.umeng.analytics.pro.o r13 = com.umeng.analytics.pro.o.a(r13)     // Catch: java.lang.Throwable -> L176
            r13.a(r10)     // Catch: java.lang.Throwable -> L176
        L176:
            return
    }

    @Override // com.umeng.analytics.pro.y.a
    public void a(java.lang.String r1, long r2, long r4, long r6) {
            r0 = this;
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 == 0) goto L7
            return
        L7:
            r0.a(r1, r2)
            return
    }

    @Override // com.umeng.analytics.pro.y.a
    public void a(java.lang.String r10, java.lang.String r11, long r12, long r14, long r16) {
            r9 = this;
            android.content.Context r1 = com.umeng.analytics.pro.u.i
            r0 = r9
            r2 = r11
            r3 = r12
            r5 = r14
            r7 = r16
            r0.a(r1, r2, r3, r5, r7)
            java.lang.String r10 = "MobclickRT"
            java.lang.String r11 = "saveSessionToDB: complete"
            com.umeng.commonsdk.debug.UMRTLog.i(r10, r11)
            boolean r10 = com.umeng.commonsdk.statistics.AnalyticsConstants.SUB_PROCESS_EVENT
            if (r10 == 0) goto L2a
            android.content.Context r10 = com.umeng.analytics.pro.u.i
            com.umeng.analytics.process.UMProcessDBDatasSender r11 = com.umeng.analytics.process.UMProcessDBDatasSender.getInstance(r10)
            long r12 = java.lang.System.currentTimeMillis()
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r13 = 36945(0x9051, float:5.1771E-41)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r10, r13, r11, r12)
        L2a:
            return
    }

    @java.lang.Deprecated
    public java.lang.String b() {
            r1 = this;
            java.lang.String r0 = com.umeng.analytics.pro.u.h
            return r0
    }

    public void b(android.content.Context r1, long r2) {
            r0 = this;
            android.content.SharedPreferences r1 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r1)
            if (r1 != 0) goto L7
            goto L11
        L7:
            android.content.Context r1 = com.umeng.analytics.pro.u.i     // Catch: java.lang.Throwable -> L11
            com.umeng.analytics.pro.o r1 = com.umeng.analytics.pro.o.a(r1)     // Catch: java.lang.Throwable -> L11
            r2 = 0
            r1.c(r2)     // Catch: java.lang.Throwable -> L11
        L11:
            return
    }

    public void b(android.content.Context r8, java.lang.Object r9) {
            r7 = this;
            java.lang.String r0 = "MobclickRT"
            android.content.Context r1 = com.umeng.analytics.pro.u.i     // Catch: java.lang.Throwable -> Lc9
            if (r1 != 0) goto Lc
            android.content.Context r8 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext(r8)     // Catch: java.lang.Throwable -> Lc9
            com.umeng.analytics.pro.u.i = r8     // Catch: java.lang.Throwable -> Lc9
        Lc:
            if (r9 != 0) goto L13
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lc9
            goto L19
        L13:
            java.lang.Long r9 = (java.lang.Long) r9     // Catch: java.lang.Throwable -> Lc9
            long r8 = r9.longValue()     // Catch: java.lang.Throwable -> Lc9
        L19:
            android.content.Context r1 = com.umeng.analytics.pro.u.i     // Catch: java.lang.Throwable -> Lc9
            android.content.SharedPreferences r1 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r1)     // Catch: java.lang.Throwable -> Lc9
            if (r1 != 0) goto L23
            goto Lc9
        L23:
            java.lang.String r2 = "a_end_time"
            r3 = 0
            long r2 = r1.getLong(r2, r3)     // Catch: java.lang.Throwable -> Lc9
            com.umeng.analytics.pro.u.k = r2     // Catch: java.lang.Throwable -> Lc9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc9
            r2.<init>()     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r3 = "------>>> lastActivityEndTime: "
            r2.append(r3)     // Catch: java.lang.Throwable -> Lc9
            long r3 = com.umeng.analytics.pro.u.k     // Catch: java.lang.Throwable -> Lc9
            r2.append(r3)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lc9
            com.umeng.commonsdk.debug.UMRTLog.i(r0, r2)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r2 = "versionname"
            java.lang.String r3 = ""
            java.lang.String r2 = r1.getString(r2, r3)     // Catch: java.lang.Throwable -> Lc9
            android.content.Context r3 = com.umeng.analytics.pro.u.i     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r3 = com.umeng.commonsdk.utils.UMUtils.getAppVersionName(r3)     // Catch: java.lang.Throwable -> Lc9
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch: java.lang.Throwable -> Lc9
            if (r1 != 0) goto L58
            goto Lc9
        L58:
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r5 = "session_start_time"
            r6 = 1
            if (r4 != 0) goto La2
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> Lc9
            if (r2 != 0) goto La2
            java.lang.String r2 = "--->>> requestNewInstantSessionIf: version upgrade"
            com.umeng.commonsdk.debug.UMRTLog.i(r0, r2)     // Catch: java.lang.Throwable -> Lc9
            r1.putLong(r5, r8)     // Catch: java.lang.Throwable -> Lc9
            r1.commit()     // Catch: java.lang.Throwable -> Lc9
            android.content.Context r1 = com.umeng.analytics.pro.u.i     // Catch: java.lang.Throwable -> Lc9
            com.umeng.analytics.pro.o r1 = com.umeng.analytics.pro.o.a(r1)     // Catch: java.lang.Throwable -> Lc9
            r2 = 0
            r1.a(r2, r6)     // Catch: java.lang.Throwable -> Lc9
            com.umeng.analytics.pro.y r1 = com.umeng.analytics.pro.y.a()     // Catch: java.lang.Throwable -> Lc9
            android.content.Context r2 = com.umeng.analytics.pro.u.i     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r1 = r1.c(r2)     // Catch: java.lang.Throwable -> Lc9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc9
            r2.<init>()     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r3 = "--->>> force generate new session: session id = "
            r2.append(r3)     // Catch: java.lang.Throwable -> Lc9
            r2.append(r1)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> Lc9
            com.umeng.commonsdk.debug.UMRTLog.i(r0, r1)     // Catch: java.lang.Throwable -> Lc9
            com.umeng.analytics.pro.u.j = r6     // Catch: java.lang.Throwable -> Lc9
            android.content.Context r0 = com.umeng.analytics.pro.u.i     // Catch: java.lang.Throwable -> Lc9
            r7.a(r0, r8, r6)     // Catch: java.lang.Throwable -> Lc9
            return
        La2:
            com.umeng.analytics.pro.y r2 = com.umeng.analytics.pro.y.a()     // Catch: java.lang.Throwable -> Lc9
            android.content.Context r3 = com.umeng.analytics.pro.u.i     // Catch: java.lang.Throwable -> Lc9
            boolean r2 = r2.e(r3)     // Catch: java.lang.Throwable -> Lc9
            r3 = 0
            if (r2 == 0) goto Lc2
            java.lang.String r2 = "--->>> More then 30 sec from last session."
            com.umeng.commonsdk.debug.UMRTLog.i(r0, r2)     // Catch: java.lang.Throwable -> Lc9
            com.umeng.analytics.pro.u.j = r6     // Catch: java.lang.Throwable -> Lc9
            r1.putLong(r5, r8)     // Catch: java.lang.Throwable -> Lc9
            r1.commit()     // Catch: java.lang.Throwable -> Lc9
            android.content.Context r0 = com.umeng.analytics.pro.u.i     // Catch: java.lang.Throwable -> Lc9
            r7.a(r0, r8, r3)     // Catch: java.lang.Throwable -> Lc9
            return
        Lc2:
            java.lang.String r8 = "--->>> less then 30 sec from last session, do nothing."
            com.umeng.commonsdk.debug.UMRTLog.i(r0, r8)     // Catch: java.lang.Throwable -> Lc9
            com.umeng.analytics.pro.u.j = r3     // Catch: java.lang.Throwable -> Lc9
        Lc9:
            return
    }

    public boolean b(android.content.Context r11, long r12, boolean r14) {
            r10 = this;
            r0 = 0
            android.content.SharedPreferences r1 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r11)     // Catch: java.lang.Throwable -> Lee
            if (r1 != 0) goto L8
            goto L14
        L8:
            com.umeng.analytics.pro.y r2 = com.umeng.analytics.pro.y.a()     // Catch: java.lang.Throwable -> Lee
            android.content.Context r3 = com.umeng.analytics.pro.u.i     // Catch: java.lang.Throwable -> Lee
            java.lang.String r2 = r2.a(r3)     // Catch: java.lang.Throwable -> Lee
            if (r2 != 0) goto L15
        L14:
            return r0
        L15:
            java.lang.String r3 = "a_start_time"
            r4 = 0
            long r6 = r1.getLong(r3, r4)     // Catch: java.lang.Throwable -> Lee
            java.lang.String r3 = "a_end_time"
            long r8 = r1.getLong(r3, r4)     // Catch: java.lang.Throwable -> Lee
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 <= 0) goto Lee
            int r1 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r1 != 0) goto Lee
            java.lang.String r0 = "MobclickRT"
            r1 = 1
            if (r14 == 0) goto L6c
            long r6 = com.umeng.analytics.pro.u.k     // Catch: java.lang.Throwable -> Led
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 != 0) goto L4c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Led
            r3.<init>()     // Catch: java.lang.Throwable -> Led
            java.lang.String r6 = "------>>> lastActivityEndTime = 0, In-app upgrade, use currentTime: = "
            r3.append(r6)     // Catch: java.lang.Throwable -> Led
            r3.append(r12)     // Catch: java.lang.Throwable -> Led
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Led
            com.umeng.commonsdk.debug.UMRTLog.i(r0, r3)     // Catch: java.lang.Throwable -> Led
            r6 = r12
            goto L62
        L4c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Led
            r3.<init>()     // Catch: java.lang.Throwable -> Led
            java.lang.String r8 = "------>>> lastActivityEndTime != 0, app upgrade, use lastActivityEndTime: = "
            r3.append(r8)     // Catch: java.lang.Throwable -> Led
            long r8 = com.umeng.analytics.pro.u.k     // Catch: java.lang.Throwable -> Led
            r3.append(r8)     // Catch: java.lang.Throwable -> Led
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Led
            com.umeng.commonsdk.debug.UMRTLog.i(r0, r3)     // Catch: java.lang.Throwable -> Led
        L62:
            android.content.Context r3 = com.umeng.analytics.pro.u.i     // Catch: java.lang.Throwable -> Led
            java.lang.Long r8 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> Led
            r10.c(r3, r8)     // Catch: java.lang.Throwable -> Led
            goto L76
        L6c:
            android.content.Context r3 = com.umeng.analytics.pro.u.i     // Catch: java.lang.Throwable -> Led
            java.lang.Long r6 = java.lang.Long.valueOf(r12)     // Catch: java.lang.Throwable -> Led
            r10.c(r3, r6)     // Catch: java.lang.Throwable -> Led
            r6 = r12
        L76:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Led
            r3.<init>()     // Catch: java.lang.Throwable -> Led
            java.lang.String r8 = "__f"
            if (r14 == 0) goto L83
            r3.put(r8, r6)     // Catch: java.lang.Throwable -> Led
            goto L86
        L83:
            r3.put(r8, r12)     // Catch: java.lang.Throwable -> Led
        L86:
            com.umeng.analytics.b r12 = com.umeng.analytics.b.a()     // Catch: java.lang.Throwable -> Led
            org.json.JSONObject r12 = r12.b()     // Catch: java.lang.Throwable -> Led
            if (r12 == 0) goto L9b
            int r13 = r12.length()     // Catch: java.lang.Throwable -> Led
            if (r13 <= 0) goto L9b
            java.lang.String r13 = "__sp"
            r3.put(r13, r12)     // Catch: java.lang.Throwable -> Led
        L9b:
            com.umeng.analytics.b r12 = com.umeng.analytics.b.a()     // Catch: java.lang.Throwable -> Led
            org.json.JSONObject r12 = r12.c()     // Catch: java.lang.Throwable -> Led
            if (r12 == 0) goto Lb0
            int r13 = r12.length()     // Catch: java.lang.Throwable -> Led
            if (r13 <= 0) goto Lb0
            java.lang.String r13 = "__pp"
            r3.put(r13, r12)     // Catch: java.lang.Throwable -> Led
        Lb0:
            java.lang.String r12 = "header_foreground_count"
            boolean r12 = com.umeng.commonsdk.config.FieldManager.allow(r12)     // Catch: java.lang.Throwable -> Led
            java.lang.String r13 = "__g"
            if (r12 == 0) goto Ld8
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Led
            r12.<init>()     // Catch: java.lang.Throwable -> Led
            java.lang.String r14 = "--->>>*** foregroundCount = "
            r12.append(r14)     // Catch: java.lang.Throwable -> Led
            long r6 = com.umeng.analytics.pro.u.m     // Catch: java.lang.Throwable -> Led
            r12.append(r6)     // Catch: java.lang.Throwable -> Led
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> Led
            com.umeng.commonsdk.debug.UMRTLog.e(r0, r12)     // Catch: java.lang.Throwable -> Led
            long r6 = com.umeng.analytics.pro.u.m     // Catch: java.lang.Throwable -> Led
            r3.put(r13, r6)     // Catch: java.lang.Throwable -> Led
            com.umeng.analytics.pro.u.m = r4     // Catch: java.lang.Throwable -> Led
            goto Ldb
        Ld8:
            r3.put(r13, r4)     // Catch: java.lang.Throwable -> Led
        Ldb:
            com.umeng.analytics.pro.i r11 = com.umeng.analytics.pro.i.a(r11)     // Catch: java.lang.Throwable -> Led
            com.umeng.analytics.pro.i$a r12 = com.umeng.analytics.pro.i.a.d     // Catch: java.lang.Throwable -> Led
            r11.a(r2, r3, r12)     // Catch: java.lang.Throwable -> Led
            android.content.Context r11 = com.umeng.analytics.pro.u.i     // Catch: java.lang.Throwable -> Led
            com.umeng.analytics.pro.o r11 = com.umeng.analytics.pro.o.a(r11)     // Catch: java.lang.Throwable -> Led
            r11.e()     // Catch: java.lang.Throwable -> Led
        Led:
            r0 = 1
        Lee:
            return r0
    }

    @java.lang.Deprecated
    public java.lang.String c() {
            r1 = this;
            android.content.Context r0 = com.umeng.analytics.pro.u.i
            java.lang.String r0 = r1.c(r0)
            return r0
    }

    @java.lang.Deprecated
    public java.lang.String c(android.content.Context r3) {
            r2 = this;
            java.lang.String r0 = com.umeng.analytics.pro.u.h     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L10
            android.content.SharedPreferences r3 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r3)     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = "session_id"
            r1 = 0
            java.lang.String r3 = r3.getString(r0, r1)     // Catch: java.lang.Throwable -> L10
            return r3
        L10:
            java.lang.String r3 = com.umeng.analytics.pro.u.h
            return r3
    }

    public void c(android.content.Context r7, java.lang.Object r8) {
            r6 = this;
            android.content.Context r0 = com.umeng.analytics.pro.u.i     // Catch: java.lang.Throwable -> L56
            if (r0 != 0) goto L10
            if (r7 == 0) goto L10
            android.content.Context r0 = r7.getApplicationContext()     // Catch: java.lang.Throwable -> L56
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)     // Catch: java.lang.Throwable -> L56
            com.umeng.analytics.pro.u.i = r0     // Catch: java.lang.Throwable -> L56
        L10:
            java.lang.Long r8 = (java.lang.Long) r8     // Catch: java.lang.Throwable -> L56
            long r0 = r8.longValue()     // Catch: java.lang.Throwable -> L56
            android.content.SharedPreferences r7 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r7)     // Catch: java.lang.Throwable -> L56
            if (r7 != 0) goto L1d
            goto L56
        L1d:
            java.lang.String r8 = "a_start_time"
            r2 = 0
            long r4 = r7.getLong(r8, r2)     // Catch: java.lang.Throwable -> L56
            int r8 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r8 != 0) goto L2f
            java.lang.String r7 = "onPause called before onResume"
            com.umeng.commonsdk.statistics.common.MLog.e(r7)     // Catch: java.lang.Throwable -> L56
            return
        L2f:
            android.content.SharedPreferences$Editor r7 = r7.edit()     // Catch: java.lang.Throwable -> L56
            java.lang.String r8 = "MobclickRT"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L56
            r2.<init>()     // Catch: java.lang.Throwable -> L56
            java.lang.String r3 = "--->>> onEndSessionInternal: write activity end time = "
            r2.append(r3)     // Catch: java.lang.Throwable -> L56
            r2.append(r0)     // Catch: java.lang.Throwable -> L56
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L56
            com.umeng.commonsdk.debug.UMRTLog.i(r8, r2)     // Catch: java.lang.Throwable -> L56
            java.lang.String r8 = "a_end_time"
            r7.putLong(r8, r0)     // Catch: java.lang.Throwable -> L56
            java.lang.String r8 = "session_end_time"
            r7.putLong(r8, r0)     // Catch: java.lang.Throwable -> L56
            r7.commit()     // Catch: java.lang.Throwable -> L56
        L56:
            return
    }
}
