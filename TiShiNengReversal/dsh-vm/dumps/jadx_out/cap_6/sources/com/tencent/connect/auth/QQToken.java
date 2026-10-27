package com.tencent.connect.auth;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class QQToken {
    public static final int AUTH_QQ = 2;
    public static final int AUTH_QZONE = 3;
    public static final int AUTH_WEB = 1;
    private static android.content.SharedPreferences g;
    private java.lang.String a;
    private java.lang.String b;
    private java.lang.String c;
    private int d;
    private long e;
    private com.tencent.open.utils.a f;

    public QQToken(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.d = r0
            r0 = -1
            r2.e = r0
            r2.a = r3
            return
    }

    @android.annotation.TargetApi(11)
    private static synchronized android.content.SharedPreferences a() {
            java.lang.Class<com.tencent.connect.auth.QQToken> r0 = com.tencent.connect.auth.QQToken.class
            monitor-enter(r0)
            android.content.SharedPreferences r1 = com.tencent.connect.auth.QQToken.g     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L17
            android.content.Context r1 = com.tencent.open.utils.g.a()     // Catch: java.lang.Throwable -> L15
            java.lang.String r2 = "token_info_file"
            r3 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r3)     // Catch: java.lang.Throwable -> L15
            com.tencent.connect.auth.QQToken.g = r1     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r1 = move-exception
            goto L1b
        L17:
            android.content.SharedPreferences r1 = com.tencent.connect.auth.QQToken.g     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)
            return r1
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r1
    }

    private static java.lang.String a(java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            byte[] r2 = com.tencent.open.utils.m.j(r2)
            r1 = 2
            java.lang.String r2 = android.util.Base64.encodeToString(r2, r1)
            r0.append(r2)
            java.lang.String r2 = "_aes_google"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    private static synchronized org.json.JSONObject a(java.lang.String r5, com.tencent.open.utils.a r6) {
            java.lang.Class<com.tencent.connect.auth.QQToken> r0 = com.tencent.connect.auth.QQToken.class
            monitor-enter(r0)
            android.content.Context r1 = com.tencent.open.utils.g.a()     // Catch: java.lang.Throwable -> L13
            r2 = 0
            if (r1 != 0) goto L16
            java.lang.String r5 = "QQToken"
            java.lang.String r6 = "loadJsonPreference context null"
            com.tencent.open.log.SLog.i(r5, r6)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)
            return r2
        L13:
            r5 = move-exception
            goto L15e
        L16:
            if (r5 != 0) goto L21
            java.lang.String r5 = "QQToken"
            java.lang.String r6 = "loadJsonPreference prefKey is null"
            com.tencent.open.log.SLog.i(r5, r6)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)
            return r2
        L21:
            java.lang.String r1 = a(r5)     // Catch: java.lang.Throwable -> L13
            android.content.SharedPreferences r3 = a()     // Catch: java.lang.Throwable -> L13
            java.lang.String r4 = ""
            java.lang.String r1 = r3.getString(r1, r4)     // Catch: java.lang.Throwable -> L13
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L13
            if (r3 == 0) goto L12f
            boolean r1 = com.tencent.open.web.security.JniInterface.isJniOk     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L44
            java.lang.String r1 = com.tencent.connect.auth.AuthAgent.SECURE_LIB_FILE_NAME     // Catch: java.lang.Throwable -> L13
            java.lang.String r3 = com.tencent.connect.auth.AuthAgent.SECURE_LIB_NAME     // Catch: java.lang.Throwable -> L13
            r4 = 5
            com.tencent.open.utils.k.a(r1, r3, r4)     // Catch: java.lang.Throwable -> L13
            com.tencent.open.web.security.JniInterface.loadSo()     // Catch: java.lang.Throwable -> L13
        L44:
            boolean r1 = com.tencent.open.web.security.JniInterface.isJniOk     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L51
            java.lang.String r5 = "QQToken"
            java.lang.String r6 = "loadJsonPreference jni load fail SECURE_LIB_VERSION=5"
            com.tencent.open.log.SLog.i(r5, r6)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)
            return r2
        L51:
            java.lang.String r1 = c(r5)     // Catch: java.lang.Throwable -> L13
            android.content.SharedPreferences r3 = a()     // Catch: java.lang.Throwable -> L13
            java.lang.String r4 = ""
            java.lang.String r3 = r3.getString(r1, r4)     // Catch: java.lang.Throwable -> L13
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L13
            if (r4 == 0) goto Le8
            java.lang.String r1 = b(r5)     // Catch: java.lang.Throwable -> L13
            android.content.SharedPreferences r3 = a()     // Catch: java.lang.Throwable -> L13
            java.lang.String r4 = ""
            java.lang.String r3 = r3.getString(r1, r4)     // Catch: java.lang.Throwable -> L13
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L13
            if (r4 == 0) goto L82
            java.lang.String r5 = "QQToken"
            java.lang.String r6 = "loadJsonPreference oldDesValue null"
            com.tencent.open.log.SLog.i(r5, r6)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)
            return r2
        L82:
            java.lang.String r3 = com.tencent.open.web.security.JniInterface.d1(r3)     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> La6
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> La6
            if (r4 == 0) goto La8
            java.lang.String r5 = "QQToken"
            java.lang.String r6 = "loadJsonPreference decodeResult d1 empty"
            com.tencent.open.log.SLog.i(r5, r6)     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> La6
            android.content.SharedPreferences r5 = a()     // Catch: java.lang.Throwable -> L13
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch: java.lang.Throwable -> L13
            android.content.SharedPreferences$Editor r5 = r5.remove(r1)     // Catch: java.lang.Throwable -> L13
            r5.apply()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)
            return r2
        La4:
            r5 = move-exception
            goto Ld8
        La6:
            r5 = move-exception
            goto Lc0
        La8:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> La6
            r4.<init>(r3)     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> La6
            a(r5, r4, r6)     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> La6
            android.content.SharedPreferences r5 = a()     // Catch: java.lang.Throwable -> L13
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch: java.lang.Throwable -> L13
            android.content.SharedPreferences$Editor r5 = r5.remove(r1)     // Catch: java.lang.Throwable -> L13
            r5.apply()     // Catch: java.lang.Throwable -> L13
            goto L133
        Lc0:
            java.lang.String r6 = "QQToken"
            java.lang.String r3 = "Catch Exception"
            com.tencent.open.log.SLog.e(r6, r3, r5)     // Catch: java.lang.Throwable -> La4
            android.content.SharedPreferences r5 = a()     // Catch: java.lang.Throwable -> L13
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch: java.lang.Throwable -> L13
            android.content.SharedPreferences$Editor r5 = r5.remove(r1)     // Catch: java.lang.Throwable -> L13
            r5.apply()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)
            return r2
        Ld8:
            android.content.SharedPreferences r6 = a()     // Catch: java.lang.Throwable -> L13
            android.content.SharedPreferences$Editor r6 = r6.edit()     // Catch: java.lang.Throwable -> L13
            android.content.SharedPreferences$Editor r6 = r6.remove(r1)     // Catch: java.lang.Throwable -> L13
            r6.apply()     // Catch: java.lang.Throwable -> L13
            throw r5     // Catch: java.lang.Throwable -> L13
        Le8:
            java.lang.String r3 = com.tencent.open.web.security.JniInterface.d2(r3)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L106
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L106
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L106
            a(r5, r4, r6)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L106
            android.content.SharedPreferences r5 = a()     // Catch: java.lang.Throwable -> L13
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch: java.lang.Throwable -> L13
            android.content.SharedPreferences$Editor r5 = r5.remove(r1)     // Catch: java.lang.Throwable -> L13
            r5.apply()     // Catch: java.lang.Throwable -> L13
            goto L133
        L104:
            r5 = move-exception
            goto L11f
        L106:
            r5 = move-exception
            java.lang.String r6 = "QQToken"
            java.lang.String r3 = "Catch Exception"
            com.tencent.open.log.SLog.e(r6, r3, r5)     // Catch: java.lang.Throwable -> L104
            android.content.SharedPreferences r5 = a()     // Catch: java.lang.Throwable -> L13
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch: java.lang.Throwable -> L13
            android.content.SharedPreferences$Editor r5 = r5.remove(r1)     // Catch: java.lang.Throwable -> L13
            r5.apply()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)
            return r2
        L11f:
            android.content.SharedPreferences r6 = a()     // Catch: java.lang.Throwable -> L13
            android.content.SharedPreferences$Editor r6 = r6.edit()     // Catch: java.lang.Throwable -> L13
            android.content.SharedPreferences$Editor r6 = r6.remove(r1)     // Catch: java.lang.Throwable -> L13
            r6.apply()     // Catch: java.lang.Throwable -> L13
            throw r5     // Catch: java.lang.Throwable -> L13
        L12f:
            java.lang.String r3 = r6.b(r1)     // Catch: java.lang.Throwable -> L13
        L133:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L141
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L141
            java.lang.String r6 = "QQToken"
            java.lang.String r1 = "loadJsonPreference sucess"
            com.tencent.open.log.SLog.i(r6, r1)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)
            return r5
        L141:
            r5 = move-exception
            java.lang.String r6 = "QQToken"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            java.lang.String r3 = "loadJsonPreference decode "
            r1.append(r3)     // Catch: java.lang.Throwable -> L13
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L13
            r1.append(r5)     // Catch: java.lang.Throwable -> L13
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L13
            com.tencent.open.log.SLog.i(r6, r5)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)
            return r2
        L15e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r5
    }

    private static synchronized boolean a(java.lang.String r9, org.json.JSONObject r10, com.tencent.open.utils.a r11) {
            java.lang.Class<com.tencent.connect.auth.QQToken> r0 = com.tencent.connect.auth.QQToken.class
            monitor-enter(r0)
            android.content.Context r1 = com.tencent.open.utils.g.a()     // Catch: java.lang.Throwable -> L13
            r2 = 0
            if (r1 != 0) goto L16
            java.lang.String r9 = "QQToken"
            java.lang.String r10 = "saveJsonPreference context null"
            com.tencent.open.log.SLog.i(r9, r10)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)
            return r2
        L13:
            r9 = move-exception
            goto La2
        L16:
            if (r9 == 0) goto L99
            if (r10 != 0) goto L1c
            goto L99
        L1c:
            java.lang.String r1 = "expires_in"
            java.lang.String r1 = r10.getString(r1)     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L72
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L72
            if (r3 != 0) goto L74
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L72
            long r5 = java.lang.Long.parseLong(r1)     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L72
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r7
            long r3 = r3 + r5
            java.lang.String r1 = "expires_time"
            r10.put(r1, r3)     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L72
            java.lang.String r9 = a(r9)     // Catch: java.lang.Throwable -> L13
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L13
            java.lang.String r10 = r11.a(r10)     // Catch: java.lang.Throwable -> L13
            int r11 = r9.length()     // Catch: java.lang.Throwable -> L13
            r1 = 6
            if (r11 <= r1) goto L69
            if (r10 != 0) goto L50
            goto L69
        L50:
            android.content.SharedPreferences r11 = a()     // Catch: java.lang.Throwable -> L13
            android.content.SharedPreferences$Editor r11 = r11.edit()     // Catch: java.lang.Throwable -> L13
            android.content.SharedPreferences$Editor r9 = r11.putString(r9, r10)     // Catch: java.lang.Throwable -> L13
            r9.commit()     // Catch: java.lang.Throwable -> L13
            java.lang.String r9 = "QQToken"
            java.lang.String r10 = "saveJsonPreference sucess"
            com.tencent.open.log.SLog.i(r9, r10)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)
            r9 = 1
            return r9
        L69:
            java.lang.String r9 = "QQToken"
            java.lang.String r10 = "saveJsonPreference keyEncode or josnEncode null"
            com.tencent.open.log.SLog.i(r9, r10)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)
            return r2
        L72:
            r9 = move-exception
            goto L7d
        L74:
            java.lang.String r9 = "QQToken"
            java.lang.String r10 = "expires is null"
            com.tencent.open.log.SLog.i(r9, r10)     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L72
            monitor-exit(r0)
            return r2
        L7d:
            java.lang.String r10 = "QQToken"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13
            r11.<init>()     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = "saveJsonPreference exception:"
            r11.append(r1)     // Catch: java.lang.Throwable -> L13
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L13
            r11.append(r9)     // Catch: java.lang.Throwable -> L13
            java.lang.String r9 = r11.toString()     // Catch: java.lang.Throwable -> L13
            com.tencent.open.log.SLog.e(r10, r9)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)
            return r2
        L99:
            java.lang.String r9 = "QQToken"
            java.lang.String r10 = "saveJsonPreference prefKey or jsonObject null"
            com.tencent.open.log.SLog.i(r9, r10)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)
            return r2
        La2:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r9
    }

    @java.lang.Deprecated
    private static java.lang.String b(java.lang.String r1) {
            byte[] r1 = com.tencent.open.utils.m.j(r1)
            r0 = 2
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)
            return r1
    }

    @java.lang.Deprecated
    private static java.lang.String c(java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            byte[] r2 = com.tencent.open.utils.m.j(r2)
            r1 = 2
            java.lang.String r2 = android.util.Base64.encodeToString(r2, r1)
            r0.append(r2)
            java.lang.String r2 = "_spkey"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public java.lang.String getAccessToken() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }

    public java.lang.String getAppId() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public int getAuthSource() {
            r1 = this;
            int r0 = r1.d
            return r0
    }

    public long getExpireTimeInSecond() {
            r2 = this;
            long r0 = r2.e
            return r0
    }

    public java.lang.String getOpenId() {
            r1 = this;
            java.lang.String r0 = r1.c
            return r0
    }

    public java.lang.String getOpenIdWithCache() {
            r5 = this;
            java.lang.String r0 = "QQToken"
            java.lang.String r1 = r5.getOpenId()
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L26
            java.lang.String r3 = " appId = "
            if (r2 == 0) goto L45
            java.lang.String r2 = r5.a     // Catch: java.lang.Exception -> L26
            org.json.JSONObject r2 = r5.loadSession(r2)     // Catch: java.lang.Exception -> L26
            if (r2 == 0) goto L28
            java.lang.String r4 = "openid"
            java.lang.String r1 = r2.getString(r4)     // Catch: java.lang.Exception -> L26
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L26
            if (r2 != 0) goto L28
            r5.setOpenId(r1)     // Catch: java.lang.Exception -> L26
            goto L28
        L26:
            r2 = move-exception
            goto L62
        L28:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L26
            r2.<init>()     // Catch: java.lang.Exception -> L26
            java.lang.String r4 = "getOpenId from Session openId = "
            r2.append(r4)     // Catch: java.lang.Exception -> L26
            r2.append(r1)     // Catch: java.lang.Exception -> L26
            r2.append(r3)     // Catch: java.lang.Exception -> L26
            java.lang.String r3 = r5.a     // Catch: java.lang.Exception -> L26
            r2.append(r3)     // Catch: java.lang.Exception -> L26
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L26
            com.tencent.open.log.SLog.i(r0, r2)     // Catch: java.lang.Exception -> L26
            return r1
        L45:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L26
            r2.<init>()     // Catch: java.lang.Exception -> L26
            java.lang.String r4 = "getOpenId from field openId = "
            r2.append(r4)     // Catch: java.lang.Exception -> L26
            r2.append(r1)     // Catch: java.lang.Exception -> L26
            r2.append(r3)     // Catch: java.lang.Exception -> L26
            java.lang.String r3 = r5.a     // Catch: java.lang.Exception -> L26
            r2.append(r3)     // Catch: java.lang.Exception -> L26
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L26
            com.tencent.open.log.SLog.i(r0, r2)     // Catch: java.lang.Exception -> L26
            return r1
        L62:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "getLocalOpenIdByAppId "
            r3.append(r4)
            java.lang.String r2 = r2.toString()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.tencent.open.log.SLog.i(r0, r2)
            return r1
    }

    public boolean isSessionValid() {
            r5 = this;
            java.lang.String r0 = r5.b
            if (r0 == 0) goto L10
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r5.e
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    public org.json.JSONObject loadSession(java.lang.String r3) {
            r2 = this;
            com.tencent.open.utils.a r0 = r2.f     // Catch: java.lang.Exception -> L10
            if (r0 != 0) goto L12
            com.tencent.open.utils.a r0 = new com.tencent.open.utils.a     // Catch: java.lang.Exception -> L10
            android.content.Context r1 = com.tencent.open.utils.g.a()     // Catch: java.lang.Exception -> L10
            r0.<init>(r1)     // Catch: java.lang.Exception -> L10
            r2.f = r0     // Catch: java.lang.Exception -> L10
            goto L12
        L10:
            r3 = move-exception
            goto L19
        L12:
            com.tencent.open.utils.a r0 = r2.f     // Catch: java.lang.Exception -> L10
            org.json.JSONObject r3 = a(r3, r0)     // Catch: java.lang.Exception -> L10
            return r3
        L19:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "login loadSession"
            r0.append(r1)
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "QQToken"
            com.tencent.open.log.SLog.i(r0, r3)
            r3 = 0
            return r3
    }

    public void removeSession(java.lang.String r3) {
            r2 = this;
            android.content.SharedPreferences r0 = a()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = c(r3)
            r0.remove(r1)
            java.lang.String r1 = c(r3)
            r0.remove(r1)
            java.lang.String r3 = a(r3)
            r0.remove(r3)
            r0.apply()
            java.lang.String r3 = "QQToken"
            java.lang.String r0 = "removeSession sucess"
            com.tencent.open.log.SLog.i(r3, r0)
            return
    }

    public boolean saveSession(org.json.JSONObject r3) {
            r2 = this;
            com.tencent.open.utils.a r0 = r2.f     // Catch: java.lang.Exception -> L10
            if (r0 != 0) goto L12
            com.tencent.open.utils.a r0 = new com.tencent.open.utils.a     // Catch: java.lang.Exception -> L10
            android.content.Context r1 = com.tencent.open.utils.g.a()     // Catch: java.lang.Exception -> L10
            r0.<init>(r1)     // Catch: java.lang.Exception -> L10
            r2.f = r0     // Catch: java.lang.Exception -> L10
            goto L12
        L10:
            r3 = move-exception
            goto L1b
        L12:
            java.lang.String r0 = r2.a     // Catch: java.lang.Exception -> L10
            com.tencent.open.utils.a r1 = r2.f     // Catch: java.lang.Exception -> L10
            boolean r3 = a(r0, r3, r1)     // Catch: java.lang.Exception -> L10
            return r3
        L1b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "login saveSession"
            r0.append(r1)
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "QQToken"
            com.tencent.open.log.SLog.i(r0, r3)
            r3 = 0
            return r3
    }

    public void setAccessToken(java.lang.String r5, java.lang.String r6) throws java.lang.NumberFormatException {
            r4 = this;
            r4.b = r5
            r0 = 0
            r4.e = r0
            if (r6 == 0) goto L17
            long r0 = java.lang.System.currentTimeMillis()
            long r5 = java.lang.Long.parseLong(r6)
            r2 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r2
            long r0 = r0 + r5
            r4.e = r0
        L17:
            return
    }

    public void setAppId(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setAuthSource(int r1) {
            r0 = this;
            r0.d = r1
            return
    }

    public void setOpenId(java.lang.String r2) {
            r1 = this;
            r1.c = r2
            com.tencent.open.b.b r0 = com.tencent.open.b.b.a()
            r0.a(r2)
            return
    }
}
