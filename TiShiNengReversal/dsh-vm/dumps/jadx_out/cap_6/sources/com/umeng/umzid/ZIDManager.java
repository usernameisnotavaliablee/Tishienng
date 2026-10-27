package com.umeng.umzid;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ZIDManager {
    public static com.umeng.umzid.ZIDManager d;
    public boolean a;
    public boolean b;
    public boolean c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements java.lang.Runnable {
        public final /* synthetic */ android.content.Context a;
        public final /* synthetic */ com.umeng.umzid.IZIDCompletionCallback b;
        public final /* synthetic */ com.umeng.umzid.ZIDManager c;

        public a(com.umeng.umzid.ZIDManager r1, android.content.Context r2, com.umeng.umzid.IZIDCompletionCallback r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                com.umeng.umzid.ZIDManager r0 = r3.c
                android.content.Context r1 = r3.a
                java.lang.String r0 = com.umeng.umzid.ZIDManager.a(r0, r1)
                boolean r1 = android.text.TextUtils.isEmpty(r0)
                if (r1 == 0) goto L1a
                com.umeng.umzid.IZIDCompletionCallback r0 = r3.b
                if (r0 == 0) goto L21
                java.lang.String r1 = "1002"
                java.lang.String r2 = "获取zid失败"
                r0.onFailure(r1, r2)
                return
            L1a:
                com.umeng.umzid.IZIDCompletionCallback r1 = r3.b
                if (r1 == 0) goto L21
                r1.onSuccess(r0)
            L21:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class b implements java.lang.Runnable {
        public final /* synthetic */ android.content.Context a;
        public final /* synthetic */ com.umeng.umzid.ZIDManager b;

        public b(com.umeng.umzid.ZIDManager r1, android.content.Context r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                com.umeng.umzid.ZIDManager r0 = r2.b
                android.content.Context r1 = r2.a
                r0.b(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class c implements java.lang.Runnable {
        public final /* synthetic */ android.content.Context a;
        public final /* synthetic */ com.umeng.umzid.ZIDManager b;

        public c(com.umeng.umzid.ZIDManager r1, android.content.Context r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                com.umeng.umzid.ZIDManager r0 = r2.b
                android.content.Context r1 = r2.a
                com.umeng.umzid.ZIDManager.a(r0, r1)
                return
        }
    }

    public ZIDManager() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            r1.b = r0
            return
    }

    public static /* synthetic */ java.lang.String a(com.umeng.umzid.ZIDManager r9, android.content.Context r10) {
            boolean r0 = r9.a
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = 1
            r9.a = r0
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = com.umeng.umzid.Spy.getID()     // Catch: java.lang.Throwable -> Lca
            java.lang.String r4 = "z"
            r2.put(r4, r3)     // Catch: java.lang.Throwable -> Lca
            java.lang.String r4 = com.umeng.umzid.d.e(r10)     // Catch: java.lang.Throwable -> Lca
            java.lang.String r5 = "mc"
            r2.put(r5, r4)     // Catch: java.lang.Throwable -> Lca
            java.lang.String r5 = com.umeng.umzid.d.f(r10)     // Catch: java.lang.Throwable -> Lca
            java.lang.String r6 = "o"
            r2.put(r6, r5)     // Catch: java.lang.Throwable -> Lca
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L4c
            r6.<init>()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r7 = "vpn_pxy"
            boolean r8 = com.umeng.umzid.d.i(r10)     // Catch: java.lang.Throwable -> L4a
            r6.put(r7, r8)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r7 = "wifi_pxy"
            boolean r8 = com.umeng.umzid.d.j(r10)     // Catch: java.lang.Throwable -> L4a
            r6.put(r7, r8)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r7 = "double"
            boolean r8 = com.umeng.umzid.d.g(r10)     // Catch: java.lang.Throwable -> L4a
            r6.put(r7, r8)     // Catch: java.lang.Throwable -> L4a
            goto L4e
        L4a:
            goto L4e
        L4c:
            r6 = r1
        L4e:
            if (r6 == 0) goto L55
            java.lang.String r7 = "anti"
            r2.put(r7, r6)     // Catch: java.lang.Throwable -> Lca
        L55:
            r9.a(r10, r2)     // Catch: java.lang.Throwable -> Lca
            java.lang.String r6 = com.umeng.umzid.d.b(r10)     // Catch: java.lang.Throwable -> Lca
            int r7 = r6.length()     // Catch: java.lang.Throwable -> Lca
            if (r7 <= 0) goto L63
            goto L65
        L63:
            java.lang.String r6 = "https://utoken.umeng.com"
        L65:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lca
            r7.<init>()     // Catch: java.lang.Throwable -> Lca
            r7.append(r6)     // Catch: java.lang.Throwable -> Lca
            java.lang.String r6 = "/anti/postZdata"
            r7.append(r6)     // Catch: java.lang.Throwable -> Lca
            java.lang.String r6 = r7.toString()     // Catch: java.lang.Throwable -> Lca
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lca
            java.lang.String r2 = com.umeng.umzid.a.a(r6, r2)     // Catch: java.lang.Throwable -> Lca
            boolean r6 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> Lca
            if (r6 != 0) goto Lc7
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lca
            r6.<init>(r2)     // Catch: java.lang.Throwable -> Lca
            java.lang.String r2 = "suc"
            boolean r2 = r6.optBoolean(r2)     // Catch: java.lang.Throwable -> Lca
            if (r2 != r0) goto Lc7
            com.umeng.umzid.d.f(r10, r3)     // Catch: java.lang.Throwable -> Lca
            com.umeng.umzid.d.a(r10, r4)     // Catch: java.lang.Throwable -> Lca
            com.umeng.umzid.d.b(r10, r5)     // Catch: java.lang.Throwable -> Lca
            java.lang.String r0 = "aaid"
            java.lang.String r1 = r6.optString(r0)     // Catch: java.lang.Throwable -> Lca
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Lca
            if (r0 != 0) goto La9
            com.umeng.umzid.d.e(r10, r1)     // Catch: java.lang.Throwable -> Lca
        La9:
            java.lang.String r0 = "uabc"
            java.lang.String r0 = r6.optString(r0)     // Catch: java.lang.Throwable -> Lca
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lca
            if (r2 != 0) goto Lb8
            com.umeng.umzid.d.d(r10, r0)     // Catch: java.lang.Throwable -> Lca
        Lb8:
            java.lang.String r0 = "resetToken"
            java.lang.String r0 = r6.optString(r0)     // Catch: java.lang.Throwable -> Lca
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lca
            if (r2 != 0) goto Lc7
            com.umeng.umzid.d.c(r10, r0)     // Catch: java.lang.Throwable -> Lca
        Lc7:
            r9.a(r10)     // Catch: java.lang.Throwable -> Lca
        Lca:
            r10 = 0
            r9.a = r10
            return r1
    }

    public static void configureDomain(android.content.Context r1, java.lang.String r2) {
            java.lang.String r2 = com.umeng.umzid.d.b(r2)
            if (r1 == 0) goto L23
            if (r2 == 0) goto L23
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L23
            android.content.SharedPreferences r1 = com.umeng.umzid.a.a(r1)
            if (r1 == 0) goto L23
            android.content.SharedPreferences$Editor r1 = r1.edit()
            if (r1 == 0) goto L23
            java.lang.String r0 = "inputDomain"
            android.content.SharedPreferences$Editor r1 = r1.putString(r0, r2)
            r1.commit()
        L23:
            return
    }

    public static synchronized com.umeng.umzid.ZIDManager getInstance() {
            java.lang.Class<com.umeng.umzid.ZIDManager> r0 = com.umeng.umzid.ZIDManager.class
            monitor-enter(r0)
            com.umeng.umzid.ZIDManager r1 = com.umeng.umzid.ZIDManager.d     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            com.umeng.umzid.ZIDManager r1 = new com.umeng.umzid.ZIDManager     // Catch: java.lang.Throwable -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Lf
            com.umeng.umzid.ZIDManager.d = r1     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r1 = move-exception
            goto L15
        L11:
            com.umeng.umzid.ZIDManager r1 = com.umeng.umzid.ZIDManager.d     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r1
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    public static java.lang.String getSDKVersion() {
            java.lang.String r0 = "1.8.0"
            return r0
    }

    public final org.json.JSONObject a(android.content.Context r11, org.json.JSONObject r12) {
            r10 = this;
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.String r1 = "com.umeng.commonsdk.statistics.common.DeviceConfig"
            java.lang.String r2 = ""
            java.lang.String r3 = com.umeng.umzid.Spy.getVersion()
            java.lang.String r4 = "z_v"
            r12.putOpt(r4, r3)
            java.lang.String r3 = com.umeng.umzid.d.a(r11)
            java.lang.String r4 = "a_id"
            r12.putOpt(r4, r3)
            java.lang.String r3 = android.os.Build.VERSION.RELEASE
            java.lang.String r4 = "os_v"
            r12.putOpt(r4, r3)
            r3 = 0
            if (r11 != 0) goto L23
            goto L50
        L23:
            android.content.res.Configuration r4 = new android.content.res.Configuration     // Catch: java.lang.Throwable -> L35
            r4.<init>()     // Catch: java.lang.Throwable -> L35
            r4.setToDefaults()     // Catch: java.lang.Throwable -> L35
            android.content.ContentResolver r5 = r11.getContentResolver()     // Catch: java.lang.Throwable -> L35
            android.provider.Settings.System.getConfiguration(r5, r4)     // Catch: java.lang.Throwable -> L35
            java.util.Locale r4 = r4.locale     // Catch: java.lang.Throwable -> L35
            goto L37
        L35:
            r4 = r3
        L37:
            if (r4 != 0) goto L3d
            java.util.Locale r4 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L50
        L3d:
            java.util.Calendar r4 = java.util.Calendar.getInstance(r4)     // Catch: java.lang.Throwable -> L50
            if (r4 == 0) goto L50
            java.util.TimeZone r4 = r4.getTimeZone()     // Catch: java.lang.Throwable -> L50
            int r4 = r4.getRawOffset()     // Catch: java.lang.Throwable -> L50
            r5 = 3600000(0x36ee80, float:5.044674E-39)
            int r4 = r4 / r5
            goto L52
        L50:
            r4 = 8
        L52:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "tz"
            r12.putOpt(r5, r4)
            java.lang.String r4 = android.os.Build.MODEL
            java.lang.String r5 = "m"
            r12.putOpt(r5, r4)
            r4 = 0
            r5 = 1
            java.lang.Class r6 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L88
            java.lang.String r7 = "getImeiNew"
            java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L88
            r8[r4] = r0     // Catch: java.lang.Throwable -> L88
            java.lang.reflect.Method r7 = r6.getDeclaredMethod(r7, r8)     // Catch: java.lang.Throwable -> L88
            if (r7 == 0) goto L88
            r7.setAccessible(r5)     // Catch: java.lang.Throwable -> L88
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L88
            r8[r4] = r11     // Catch: java.lang.Throwable -> L88
            java.lang.Object r6 = r7.invoke(r6, r8)     // Catch: java.lang.Throwable -> L88
            if (r6 == 0) goto L88
            boolean r7 = r6 instanceof java.lang.String     // Catch: java.lang.Throwable -> L88
            if (r7 == 0) goto L88
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L88
            goto L89
        L88:
            r6 = r2
        L89:
            java.lang.String r7 = "im"
            r12.putOpt(r7, r6)
            java.lang.Class<android.os.Build> r6 = android.os.Build.class
            java.lang.String r7 = "getString"
            java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> Le8
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r8[r4] = r9     // Catch: java.lang.Exception -> Le8
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r7, r8)     // Catch: java.lang.Exception -> Le8
            r6.setAccessible(r5)     // Catch: java.lang.Exception -> Le8
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> Le8
            java.lang.String r8 = "net.hostname"
            r7[r4] = r8     // Catch: java.lang.Exception -> Le8
            java.lang.Object r6 = r6.invoke(r3, r7)     // Catch: java.lang.Exception -> Le8
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> Le8
            if (r6 == 0) goto Lea
            boolean r7 = r6.equalsIgnoreCase(r2)     // Catch: java.lang.Exception -> Le6
            if (r7 != 0) goto Lea
            java.lang.String r7 = "MD5"
            java.security.MessageDigest r7 = java.security.MessageDigest.getInstance(r7)     // Catch: java.lang.Throwable -> Ldd
            byte[] r6 = r6.getBytes()     // Catch: java.lang.Throwable -> Ldd
            r7.update(r6)     // Catch: java.lang.Throwable -> Ldd
            byte[] r6 = r7.digest()     // Catch: java.lang.Throwable -> Ldd
            java.lang.StringBuffer r7 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> Ldd
            r7.<init>()     // Catch: java.lang.Throwable -> Ldd
            r8 = 0
        Lcc:
            int r9 = r6.length     // Catch: java.lang.Throwable -> Ldd
            if (r8 >= r9) goto Ldf
            r9 = r6[r8]     // Catch: java.lang.Throwable -> Ldd
            r9 = r9 & 255(0xff, float:3.57E-43)
            java.lang.String r9 = java.lang.Integer.toHexString(r9)     // Catch: java.lang.Throwable -> Ldd
            r7.append(r9)     // Catch: java.lang.Throwable -> Ldd
            int r8 = r8 + 1
            goto Lcc
        Ldd:
            goto Le4
        Ldf:
            java.lang.String r6 = r7.toString()     // Catch: java.lang.Throwable -> Ldd
            goto Lea
        Le4:
            r6 = r2
            goto Lea
        Le6:
            goto Lea
        Le8:
            r6 = r3
        Lea:
            java.lang.String r7 = "hn"
            r12.putOpt(r7, r6)
            java.lang.String r6 = "s_v"
            java.lang.String r7 = "1.8.0"
            r12.putOpt(r6, r7)
            if (r11 != 0) goto Lfa
            r6 = r3
            goto Lfe
        Lfa:
            java.lang.String r6 = r11.getPackageName()
        Lfe:
            java.lang.String r7 = "pkg"
            r12.putOpt(r7, r6)
            java.lang.String r6 = "s_t"
            java.lang.String r7 = "Android"
            r12.putOpt(r6, r7)
            android.content.SharedPreferences r6 = com.umeng.umzid.a.a(r11)
            if (r6 == 0) goto L117
            java.lang.String r7 = "uuid"
            java.lang.String r6 = r6.getString(r7, r2)
            goto L118
        L117:
            r6 = r2
        L118:
            java.lang.String r7 = "uid"
            r12.putOpt(r7, r6)
            java.lang.String r6 = "s_id"
            java.lang.String r7 = "umeng"
            r12.putOpt(r6, r7)
            android.content.pm.PackageManager r6 = r11.getPackageManager()     // Catch: java.lang.Exception -> L133
            java.lang.String r7 = r11.getPackageName()     // Catch: java.lang.Exception -> L133
            android.content.pm.PackageInfo r6 = r6.getPackageInfo(r7, r4)     // Catch: java.lang.Exception -> L133
            java.lang.String r6 = r6.versionName     // Catch: java.lang.Exception -> L133
            goto L134
        L133:
            r6 = r3
        L134:
            java.lang.String r7 = "a_v"
            r12.putOpt(r7, r6)
            android.content.pm.PackageManager r6 = r11.getPackageManager()     // Catch: java.lang.Exception -> L152
            java.lang.String r7 = r11.getPackageName()     // Catch: java.lang.Exception -> L152
            android.content.pm.PackageInfo r6 = r6.getPackageInfo(r7, r4)     // Catch: java.lang.Exception -> L152
            android.content.pm.ApplicationInfo r6 = r6.applicationInfo     // Catch: java.lang.Exception -> L152
            int r6 = r6.labelRes     // Catch: java.lang.Exception -> L152
            android.content.res.Resources r7 = r11.getResources()     // Catch: java.lang.Exception -> L152
            java.lang.String r6 = r7.getString(r6)     // Catch: java.lang.Exception -> L152
            goto L153
        L152:
            r6 = r3
        L153:
            java.lang.String r7 = "a_n"
            r12.putOpt(r7, r6)
            android.content.res.Resources r6 = r11.getResources()     // Catch: java.lang.Exception -> L167
            android.content.res.Configuration r6 = r6.getConfiguration()     // Catch: java.lang.Exception -> L167
            java.util.Locale r6 = r6.locale     // Catch: java.lang.Exception -> L167
            java.lang.String r6 = r6.getCountry()     // Catch: java.lang.Exception -> L167
            goto L169
        L167:
            r6 = r3
        L169:
            java.lang.String r7 = "c"
            r12.putOpt(r7, r6)
            if (r11 == 0) goto L17c
            android.content.SharedPreferences r6 = com.umeng.umzid.a.a(r11)
            if (r6 == 0) goto L17c
            java.lang.String r7 = "appkey"
            java.lang.String r3 = r6.getString(r7, r3)
        L17c:
            java.lang.String r6 = "ak"
            r12.putOpt(r6, r3)
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L1a5
            java.lang.String r3 = "getIdfa"
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L1a5
            r6[r4] = r0     // Catch: java.lang.Throwable -> L1a5
            java.lang.reflect.Method r0 = r1.getDeclaredMethod(r3, r6)     // Catch: java.lang.Throwable -> L1a5
            if (r0 == 0) goto L1a5
            r0.setAccessible(r5)     // Catch: java.lang.Throwable -> L1a5
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L1a5
            r3[r4] = r11     // Catch: java.lang.Throwable -> L1a5
            java.lang.Object r11 = r0.invoke(r1, r3)     // Catch: java.lang.Throwable -> L1a5
            if (r11 == 0) goto L1a5
            boolean r0 = r11 instanceof java.lang.String     // Catch: java.lang.Throwable -> L1a5
            if (r0 == 0) goto L1a5
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L1a5
            r2 = r11
        L1a5:
            java.lang.String r11 = "gd"
            r12.putOpt(r11, r2)
            return r12
    }

    public final void a(android.content.Context r8) {
            r7 = this;
            java.lang.Class<com.uyumao.sdk.UYMManager> r0 = com.uyumao.sdk.UYMManager.class
            java.lang.String r1 = "getInstance"
            r2 = 0
            java.lang.reflect.Method r1 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Exception -> L2b
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r1.invoke(r0, r2)     // Catch: java.lang.Exception -> L2b
            if (r1 == 0) goto L2b
            java.lang.String r2 = "init"
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L2b
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.Exception -> L2b
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r4)     // Catch: java.lang.Exception -> L2b
            if (r0 == 0) goto L2b
            r0.setAccessible(r3)     // Catch: java.lang.Exception -> L2b
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L2b
            r2[r6] = r8     // Catch: java.lang.Exception -> L2b
            r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L2b
        L2b:
            return
    }

    public final java.lang.String b(android.content.Context r14) {
            r13 = this;
            java.lang.String r0 = "uabc"
            java.lang.String r1 = "aaid"
            r2 = 0
            java.lang.String r3 = com.umeng.umzid.d.c(r14)     // Catch: org.json.JSONException -> L1d
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1d
            r4.<init>(r3)     // Catch: org.json.JSONException -> L1d
            java.lang.String r3 = "ets"
            long r3 = r4.optLong(r3)     // Catch: org.json.JSONException -> L1d
            long r5 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L1d
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L1e
            return r2
        L1d:
        L1e:
            boolean r3 = r13.b
            if (r3 == 0) goto L23
            return r2
        L23:
            r3 = 1
            r13.b = r3
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            r5 = 0
            java.lang.String r6 = ""
            if (r14 == 0) goto L3d
            android.content.SharedPreferences r7 = com.umeng.umzid.a.a(r14)     // Catch: java.lang.Throwable -> L15e
            if (r7 == 0) goto L3d
            java.lang.String r8 = "zdata"
            java.lang.String r7 = r7.getString(r8, r2)     // Catch: java.lang.Throwable -> L15e
            goto L3e
        L3d:
            r7 = r6
        L3e:
            java.lang.String r8 = com.umeng.umzid.Spy.getID()     // Catch: java.lang.Throwable -> L15e
            java.lang.String r9 = "z"
            r4.put(r9, r8)     // Catch: java.lang.Throwable -> L15e
            java.lang.String r9 = "o_z"
            r4.put(r9, r7)     // Catch: java.lang.Throwable -> L15e
            if (r14 == 0) goto L65
            android.content.SharedPreferences r7 = com.umeng.umzid.a.a(r14)     // Catch: java.lang.Throwable -> L15e
            if (r7 == 0) goto L65
            java.lang.String r9 = "oaid"
            java.lang.String r7 = r7.getString(r9, r6)     // Catch: java.lang.Throwable -> L15e
            boolean r9 = com.umeng.umzid.d.c(r7)     // Catch: java.lang.Throwable -> L15e
            if (r9 == 0) goto L66
            java.lang.String r7 = com.umeng.umzid.d.a(r7)     // Catch: java.lang.Throwable -> L15e
            goto L66
        L65:
            r7 = r6
        L66:
            java.lang.String r9 = com.umeng.umzid.d.f(r14)     // Catch: java.lang.Throwable -> L15e
            java.lang.String r10 = "o_o"
            r4.put(r10, r7)     // Catch: java.lang.Throwable -> L15e
            java.lang.String r7 = "o"
            r4.put(r7, r9)     // Catch: java.lang.Throwable -> L15e
            if (r14 == 0) goto L8d
            android.content.SharedPreferences r7 = com.umeng.umzid.a.a(r14)     // Catch: java.lang.Throwable -> L15e
            if (r7 == 0) goto L8d
            java.lang.String r10 = "mac"
            java.lang.String r7 = r7.getString(r10, r6)     // Catch: java.lang.Throwable -> L15e
            boolean r10 = com.umeng.umzid.d.c(r7)     // Catch: java.lang.Throwable -> L15e
            if (r10 == 0) goto L8e
            java.lang.String r7 = com.umeng.umzid.d.a(r7)     // Catch: java.lang.Throwable -> L15e
            goto L8e
        L8d:
            r7 = r6
        L8e:
            java.lang.String r10 = com.umeng.umzid.d.e(r14)     // Catch: java.lang.Throwable -> L15e
            java.lang.String r11 = "mc"
            r4.put(r11, r10)     // Catch: java.lang.Throwable -> L15e
            java.lang.String r11 = "o_mc"
            r4.put(r11, r7)     // Catch: java.lang.Throwable -> L15e
            r13.a(r14, r4)     // Catch: java.lang.Throwable -> L15e
            java.lang.String r7 = com.umeng.umzid.d.d(r14)     // Catch: java.lang.Throwable -> L15e
            r4.put(r1, r7)     // Catch: java.lang.Throwable -> L15e
            java.lang.String r7 = com.umeng.umzid.d.c(r14)     // Catch: java.lang.Throwable -> L15e
            r4.put(r0, r7)     // Catch: java.lang.Throwable -> L15e
            java.lang.String r7 = "resetToken"
            if (r14 == 0) goto Lbb
            android.content.SharedPreferences r11 = com.umeng.umzid.a.a(r14)     // Catch: java.lang.Throwable -> L15e
            if (r11 == 0) goto Lbb
            java.lang.String r6 = r11.getString(r7, r6)     // Catch: java.lang.Throwable -> L15e
        Lbb:
            boolean r11 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L15e
            if (r11 != 0) goto Lc6
            java.lang.String r11 = "rt"
            r4.put(r11, r6)     // Catch: java.lang.Throwable -> L15e
        Lc6:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Le9
            r6.<init>()     // Catch: java.lang.Throwable -> Le9
            java.lang.String r11 = "vpn_pxy"
            boolean r12 = com.umeng.umzid.d.i(r14)     // Catch: java.lang.Throwable -> Le7
            r6.put(r11, r12)     // Catch: java.lang.Throwable -> Le7
            java.lang.String r11 = "wifi_pxy"
            boolean r12 = com.umeng.umzid.d.j(r14)     // Catch: java.lang.Throwable -> Le7
            r6.put(r11, r12)     // Catch: java.lang.Throwable -> Le7
            java.lang.String r11 = "double"
            boolean r12 = com.umeng.umzid.d.g(r14)     // Catch: java.lang.Throwable -> Le7
            r6.put(r11, r12)     // Catch: java.lang.Throwable -> Le7
            goto Leb
        Le7:
            goto Leb
        Le9:
            r6 = r2
        Leb:
            if (r6 == 0) goto Lf2
            java.lang.String r11 = "anti"
            r4.put(r11, r6)     // Catch: java.lang.Throwable -> L15e
        Lf2:
            java.lang.String r6 = com.umeng.umzid.d.b(r14)     // Catch: java.lang.Throwable -> L15e
            int r11 = r6.length()     // Catch: java.lang.Throwable -> L15e
            if (r11 <= 0) goto Lfd
            goto Lff
        Lfd:
            java.lang.String r6 = "https://utoken.umeng.com"
        Lff:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15e
            r11.<init>()     // Catch: java.lang.Throwable -> L15e
            r11.append(r6)     // Catch: java.lang.Throwable -> L15e
            java.lang.String r6 = "/anti/updateZdata"
            r11.append(r6)     // Catch: java.lang.Throwable -> L15e
            java.lang.String r6 = r11.toString()     // Catch: java.lang.Throwable -> L15e
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L15e
            java.lang.String r4 = com.umeng.umzid.a.a(r6, r4)     // Catch: java.lang.Throwable -> L15e
            boolean r6 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L15e
            if (r6 != 0) goto L15b
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L15e
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L15e
            java.lang.String r4 = "suc"
            boolean r4 = r6.optBoolean(r4)     // Catch: java.lang.Throwable -> L15e
            if (r4 != r3) goto L15b
            com.umeng.umzid.d.f(r14, r8)     // Catch: java.lang.Throwable -> L15e
            com.umeng.umzid.d.a(r14, r10)     // Catch: java.lang.Throwable -> L15e
            com.umeng.umzid.d.b(r14, r9)     // Catch: java.lang.Throwable -> L15e
            java.lang.String r2 = r6.optString(r1)     // Catch: java.lang.Throwable -> L15e
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L15e
            if (r1 != 0) goto L141
            com.umeng.umzid.d.e(r14, r2)     // Catch: java.lang.Throwable -> L15e
        L141:
            java.lang.String r0 = r6.optString(r0)     // Catch: java.lang.Throwable -> L15e
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L15e
            if (r1 != 0) goto L14e
            com.umeng.umzid.d.d(r14, r0)     // Catch: java.lang.Throwable -> L15e
        L14e:
            java.lang.String r0 = r6.optString(r7)     // Catch: java.lang.Throwable -> L15e
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L15e
            if (r1 != 0) goto L15b
            com.umeng.umzid.d.c(r14, r0)     // Catch: java.lang.Throwable -> L15e
        L15b:
            r13.a(r14)     // Catch: java.lang.Throwable -> L15e
        L15e:
            r13.b = r5
            return r2
    }

    public synchronized java.lang.String getZID(android.content.Context r3) {
            r2 = this;
            monitor-enter(r2)
            if (r3 != 0) goto L9
            java.lang.String r3 = ""
            monitor-exit(r2)
            return r3
        L7:
            r3 = move-exception
            goto L29
        L9:
            android.content.Context r3 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L7
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)     // Catch: java.lang.Throwable -> L7
            java.lang.String r0 = com.umeng.umzid.d.d(r3)     // Catch: java.lang.Throwable -> L7
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L7
            if (r1 == 0) goto L27
            com.umeng.umzid.ZIDManager$c r0 = new com.umeng.umzid.ZIDManager$c     // Catch: java.lang.Throwable -> L7
            r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> L7
            com.umeng.umzid.c.a(r0)     // Catch: java.lang.Throwable -> L7
            java.lang.String r3 = ""
            monitor-exit(r2)
            return r3
        L27:
            monitor-exit(r2)
            return r0
        L29:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7
            throw r3
    }

    public synchronized void init(android.content.Context r4, java.lang.String r5, com.umeng.umzid.IZIDCompletionCallback r6) {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = com.umeng.umzid.d.h(r4)     // Catch: java.lang.Throwable -> L17
            r3.c = r0     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto Lb
            monitor-exit(r3)
            return
        Lb:
            if (r4 != 0) goto L1c
            if (r6 == 0) goto L1a
            java.lang.String r4 = "1001"
            java.lang.String r5 = "传入参数Context为null"
            r6.onFailure(r4, r5)     // Catch: java.lang.Throwable -> L17
            goto L1a
        L17:
            r4 = move-exception
            goto Lae
        L1a:
            monitor-exit(r3)
            return
        L1c:
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L2d
            if (r6 == 0) goto L2b
            java.lang.String r4 = "1003"
            java.lang.String r5 = "传入参数appkey为空"
            r6.onFailure(r4, r5)     // Catch: java.lang.Throwable -> L17
        L2b:
            monitor-exit(r3)
            return
        L2d:
            android.content.Context r0 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L17
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L54
            if (r5 == 0) goto L54
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L54
            android.content.SharedPreferences r1 = com.umeng.umzid.a.a(r0)     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L54
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L54
            java.lang.String r2 = "appkey"
            android.content.SharedPreferences$Editor r5 = r1.putString(r2, r5)     // Catch: java.lang.Throwable -> L17
            r5.commit()     // Catch: java.lang.Throwable -> L17
        L54:
            java.lang.String r5 = com.umeng.umzid.d.d(r0)     // Catch: java.lang.Throwable -> L17
            if (r5 == 0) goto L6f
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L61
            goto L6f
        L61:
            com.umeng.umzid.ZIDManager$b r1 = new com.umeng.umzid.ZIDManager$b     // Catch: java.lang.Throwable -> L17
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L17
            com.umeng.umzid.c.a(r1)     // Catch: java.lang.Throwable -> L17
            if (r6 == 0) goto L77
            r6.onSuccess(r5)     // Catch: java.lang.Throwable -> L17
            goto L77
        L6f:
            com.umeng.umzid.ZIDManager$a r5 = new com.umeng.umzid.ZIDManager$a     // Catch: java.lang.Throwable -> L17
            r5.<init>(r3, r0, r6)     // Catch: java.lang.Throwable -> L17
            com.umeng.umzid.c.a(r5)     // Catch: java.lang.Throwable -> L17
        L77:
            java.lang.String r5 = ""
            android.content.SharedPreferences r6 = com.umeng.umzid.a.a(r4)     // Catch: java.lang.Throwable -> L17
            if (r6 == 0) goto L87
            java.lang.String r5 = "uuid"
            java.lang.String r0 = ""
            java.lang.String r5 = r6.getString(r5, r0)     // Catch: java.lang.Throwable -> L17
        L87:
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L17
            if (r5 == 0) goto Lac
            java.lang.String r5 = ""
            android.content.SharedPreferences r4 = com.umeng.umzid.a.a(r4)     // Catch: java.lang.Throwable -> L17
            java.util.UUID r6 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L17
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L9c
            goto L9d
        L9c:
        L9d:
            if (r4 == 0) goto Lac
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch: java.lang.Throwable -> L17
            java.lang.String r6 = "uuid"
            android.content.SharedPreferences$Editor r4 = r4.putString(r6, r5)     // Catch: java.lang.Throwable -> L17
            r4.commit()     // Catch: java.lang.Throwable -> L17
        Lac:
            monitor-exit(r3)
            return
        Lae:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L17
            throw r4
    }
}
