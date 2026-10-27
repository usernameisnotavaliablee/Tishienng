package com.umeng.socialize.net.analytics;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class SocialAnalytics {
    private static com.umeng.socialize.net.base.SocializeClient a;
    private static java.util.concurrent.ExecutorService b;



    static {
            com.umeng.socialize.net.base.SocializeClient r0 = new com.umeng.socialize.net.base.SocializeClient
            r0.<init>()
            com.umeng.socialize.net.analytics.SocialAnalytics.a = r0
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool()
            com.umeng.socialize.net.analytics.SocialAnalytics.b = r0
            return
    }

    public SocialAnalytics() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ com.umeng.socialize.net.base.SocializeClient a() {
            com.umeng.socialize.net.base.SocializeClient r0 = com.umeng.socialize.net.analytics.SocialAnalytics.a
            return r0
    }

    private static void a(android.content.Context r13, java.lang.String r14, java.util.Map<java.lang.String, java.lang.String> r15) {
            java.lang.String r0 = "verify_log"
            java.lang.String r1 = "umeng_verify"
            java.lang.String r2 = ""
            java.lang.String r3 = "weixin"
            boolean r4 = r3.equals(r14)
            java.lang.String r5 = "sina"
            if (r4 != 0) goto L20
            boolean r4 = r5.equals(r14)
            if (r4 != 0) goto L20
            java.lang.String r4 = "qq"
            boolean r4 = r4.equals(r14)
            if (r4 != 0) goto L20
            goto L1e1
        L20:
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r6 = com.umeng.socialize.utils.SocializeUtils.getAppkey(r13)     // Catch: java.lang.Exception -> L1e1
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> L1e1
            if (r7 != 0) goto L34
            java.lang.String r7 = "appkey"
            r4.put(r7, r6)     // Catch: java.lang.Exception -> L1e1
        L34:
            java.lang.String r6 = android.os.Build.MODEL     // Catch: java.lang.Exception -> L1e1
            java.lang.String r7 = "\\s"
            java.lang.String r8 = "-"
            java.lang.String r6 = r6.replaceAll(r7, r8)     // Catch: java.lang.Exception -> L1e1
            java.lang.String r6 = r6.toUpperCase()     // Catch: java.lang.Exception -> L1e1
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> L1e1
            if (r7 != 0) goto L4d
            java.lang.String r7 = "device_model"
            r4.put(r7, r6)     // Catch: java.lang.Exception -> L1e1
        L4d:
            java.lang.String r6 = "os"
            java.lang.String r7 = "android"
            r4.put(r6, r7)     // Catch: java.lang.Exception -> L1e1
            java.lang.String r6 = com.umeng.socialize.utils.DeviceConfig.getOsVersion()     // Catch: java.lang.Exception -> L1e1
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> L1e1
            if (r7 != 0) goto L63
            java.lang.String r7 = "os_version"
            r4.put(r7, r6)     // Catch: java.lang.Exception -> L1e1
        L63:
            java.lang.String r6 = "7.3.2"
            java.lang.String r7 = "sdk_version"
            r4.put(r7, r6)     // Catch: java.lang.Exception -> L1e1
            java.lang.String r6 = com.umeng.commonsdk.utils.UMUtils.getUMId(r13)     // Catch: java.lang.Exception -> L1e1
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> L1e1
            if (r7 != 0) goto L79
            java.lang.String r7 = "umid"
            r4.put(r7, r6)     // Catch: java.lang.Exception -> L1e1
        L79:
            java.lang.String[] r6 = com.umeng.socialize.utils.DeviceConfig.getNetworkAccessMode(r13)     // Catch: java.lang.Exception -> L1e1
            r7 = 0
            r6 = r6[r7]     // Catch: java.lang.Exception -> L1e1
            boolean r8 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> L1e1
            if (r8 != 0) goto L8b
            java.lang.String r8 = "access"
            r4.put(r8, r6)     // Catch: java.lang.Exception -> L1e1
        L8b:
            java.lang.String[] r6 = com.umeng.socialize.utils.DeviceConfig.getNetworkAccessMode(r13)     // Catch: java.lang.Exception -> L1e1
            r8 = 1
            r6 = r6[r8]     // Catch: java.lang.Exception -> L1e1
            boolean r8 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> L1e1
            if (r8 != 0) goto L9d
            java.lang.String r8 = "access_subtype"
            r4.put(r8, r6)     // Catch: java.lang.Exception -> L1e1
        L9d:
            java.lang.String r6 = "carrier"
            r4.put(r6, r2)     // Catch: java.lang.Exception -> L1e1
            java.lang.String r6 = com.umeng.socialize.utils.DeviceConfig.getDeviceId(r13)     // Catch: java.lang.Exception -> L1e1
            boolean r8 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> L1e1
            java.lang.String r9 = "1"
            java.lang.String r10 = "0"
            java.lang.String r11 = "device_id"
            java.lang.String r12 = "device_id_type"
            if (r8 != 0) goto Lbb
            r4.put(r12, r10)     // Catch: java.lang.Exception -> L1e1
            r4.put(r11, r6)     // Catch: java.lang.Exception -> L1e1
            goto Lda
        Lbb:
            boolean r6 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L1e1
            if (r6 != 0) goto Lc8
            r4.put(r12, r9)     // Catch: java.lang.Exception -> L1e1
            r4.put(r11, r2)     // Catch: java.lang.Exception -> L1e1
            goto Lda
        Lc8:
            java.lang.String r2 = com.umeng.socialize.utils.DeviceConfig.getAndroidID(r13)     // Catch: java.lang.Exception -> L1e1
            boolean r6 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L1e1
            if (r6 != 0) goto Lda
            java.lang.String r6 = "2"
            r4.put(r12, r6)     // Catch: java.lang.Exception -> L1e1
            r4.put(r11, r2)     // Catch: java.lang.Exception -> L1e1
        Lda:
            boolean r2 = r3.equals(r14)     // Catch: java.lang.Exception -> L1e1
            java.lang.String r3 = "source"
            if (r2 == 0) goto Le8
            java.lang.String r14 = "wechat"
            r4.put(r3, r14)     // Catch: java.lang.Exception -> L1e1
            goto Lf7
        Le8:
            boolean r2 = r5.equals(r14)     // Catch: java.lang.Exception -> L1e1
            if (r2 == 0) goto Lf4
            java.lang.String r14 = "weibo"
            r4.put(r3, r14)     // Catch: java.lang.Exception -> L1e1
            goto Lf7
        Lf4:
            r4.put(r3, r14)     // Catch: java.lang.Exception -> L1e1
        Lf7:
            java.util.HashMap r14 = new java.util.HashMap     // Catch: java.lang.Exception -> L1e1
            r14.<init>()     // Catch: java.lang.Exception -> L1e1
            java.lang.String r2 = "aid"
            java.lang.Object r2 = r15.get(r2)     // Catch: java.lang.Exception -> L1e1
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L1e1
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L1e1
            if (r3 != 0) goto L10f
            java.lang.String r3 = "appId"
            r14.put(r3, r2)     // Catch: java.lang.Exception -> L1e1
        L10f:
            java.lang.String r2 = "openid"
            java.lang.Object r2 = r15.get(r2)     // Catch: java.lang.Exception -> L1e1
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L1e1
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L1e1
            if (r3 == 0) goto L125
            java.lang.String r2 = "uid"
            java.lang.Object r2 = r15.get(r2)     // Catch: java.lang.Exception -> L1e1
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L1e1
        L125:
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L1e1
            if (r3 != 0) goto L130
            java.lang.String r3 = "openId"
            r14.put(r3, r2)     // Catch: java.lang.Exception -> L1e1
        L130:
            java.lang.String r3 = "unionid"
            java.lang.Object r3 = r15.get(r3)     // Catch: java.lang.Exception -> L1e1
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L1e1
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L1e1
            if (r5 == 0) goto L13f
            goto L140
        L13f:
            r2 = r3
        L140:
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L1e1
            if (r3 != 0) goto L14b
            java.lang.String r3 = "unionId"
            r14.put(r3, r2)     // Catch: java.lang.Exception -> L1e1
        L14b:
            java.lang.String r2 = "name"
            java.lang.Object r2 = r15.get(r2)     // Catch: java.lang.Exception -> L1e1
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L1e1
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L1e1
            if (r3 != 0) goto L15e
            java.lang.String r3 = "nickName"
            r14.put(r3, r2)     // Catch: java.lang.Exception -> L1e1
        L15e:
            java.lang.String r2 = "gender"
            java.lang.Object r15 = r15.get(r2)     // Catch: java.lang.Exception -> L1e1
            java.lang.String r15 = (java.lang.String) r15     // Catch: java.lang.Exception -> L1e1
            boolean r2 = android.text.TextUtils.isEmpty(r15)     // Catch: java.lang.Exception -> L1e1
            if (r2 != 0) goto L189
            java.lang.String r2 = "男"
            boolean r2 = r2.equals(r15)     // Catch: java.lang.Exception -> L1e1
            java.lang.String r3 = "sex"
            if (r2 == 0) goto L17a
            r14.put(r3, r10)     // Catch: java.lang.Exception -> L1e1
            goto L189
        L17a:
            java.lang.String r2 = "女"
            boolean r2 = r2.equals(r15)     // Catch: java.lang.Exception -> L1e1
            if (r2 == 0) goto L186
            r14.put(r3, r9)     // Catch: java.lang.Exception -> L1e1
            goto L189
        L186:
            r14.put(r3, r15)     // Catch: java.lang.Exception -> L1e1
        L189:
            org.json.JSONObject r15 = new org.json.JSONObject     // Catch: java.lang.Exception -> L1e1
            java.lang.String r14 = r14.toString()     // Catch: java.lang.Exception -> L1e1
            r15.<init>(r14)     // Catch: java.lang.Exception -> L1e1
            java.lang.String r14 = "info"
            r4.put(r14, r15)     // Catch: java.lang.Exception -> L1e1
            long r14 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L1e1
            java.lang.String r2 = "timestamp"
            java.lang.String r14 = java.lang.String.valueOf(r14)     // Catch: java.lang.Exception -> L1e1
            r4.put(r2, r14)     // Catch: java.lang.Exception -> L1e1
            android.content.SharedPreferences r14 = r13.getSharedPreferences(r1, r7)     // Catch: java.lang.Exception -> L1e1
            r15 = 0
            java.util.Set r14 = r14.getStringSet(r0, r15)     // Catch: java.lang.Exception -> L1e1
            java.util.HashSet r15 = new java.util.HashSet     // Catch: java.lang.Exception -> L1e1
            r15.<init>()     // Catch: java.lang.Exception -> L1e1
            if (r14 == 0) goto L1cc
            boolean r2 = r14.isEmpty()     // Catch: java.lang.Exception -> L1e1
            if (r2 != 0) goto L1cc
            java.util.Iterator r14 = r14.iterator()     // Catch: java.lang.Exception -> L1e1
        L1be:
            boolean r2 = r14.hasNext()     // Catch: java.lang.Exception -> L1e1
            if (r2 == 0) goto L1cc
            java.lang.Object r2 = r14.next()     // Catch: java.lang.Exception -> L1e1
            r15.add(r2)     // Catch: java.lang.Exception -> L1e1
            goto L1be
        L1cc:
            java.lang.String r14 = r4.toString()     // Catch: java.lang.Exception -> L1e1
            r15.add(r14)     // Catch: java.lang.Exception -> L1e1
            android.content.SharedPreferences r13 = r13.getSharedPreferences(r1, r7)     // Catch: java.lang.Exception -> L1e1
            android.content.SharedPreferences$Editor r13 = r13.edit()     // Catch: java.lang.Exception -> L1e1
            r13.putStringSet(r0, r15)     // Catch: java.lang.Exception -> L1e1
            r13.commit()     // Catch: java.lang.Exception -> L1e1
        L1e1:
            return
    }

    private static void a(java.lang.Runnable r1) {
            java.util.concurrent.ExecutorService r0 = com.umeng.socialize.net.analytics.SocialAnalytics.b
            if (r0 == 0) goto L9
            if (r1 == 0) goto L9
            r0.execute(r1)
        L9:
            return
    }

    public static void authendt(android.content.Context r0, com.umeng.socialize.bean.SHARE_MEDIA r1, java.lang.String r2, boolean r3, java.lang.String r4, java.lang.String r5, java.util.Map<java.lang.String, java.lang.String> r6) {
            com.umeng.socialize.net.dplus.DplusApi.uploadAuthend(r0, r1, r5, r2, r4)
            if (r6 == 0) goto L8
            com.umeng.socialize.net.dplus.DplusApi.uploadAuth(r0, r6, r3, r1, r5)
        L8:
            if (r6 == 0) goto L15
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toLowerCase()
            a(r0, r1, r6)
        L15:
            verifyStats(r0)
            return
    }

    public static void authstart(android.content.Context r0, com.umeng.socialize.bean.SHARE_MEDIA r1, java.lang.String r2, boolean r3, java.lang.String r4) {
            com.umeng.socialize.net.dplus.DplusApi.uploadAuthStart(r0, r3, r1, r4)
            return
    }

    public static void dauStats(android.content.Context r6, boolean r7) {
            android.os.Bundle r7 = com.umeng.socialize.uploadlog.UMLog.getShareAndAuth()
            java.lang.String r0 = "share"
            boolean r0 = r7.getBoolean(r0)
            r1 = 0
            if (r0 == 0) goto L10
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L11
        L10:
            r0 = 0
        L11:
            java.lang.String r2 = "auth"
            boolean r2 = r7.getBoolean(r2)
            if (r2 == 0) goto L1c
            r2 = 268435456(0x10000000, float:2.524355E-29)
            goto L1d
        L1c:
            r2 = 0
        L1d:
            boolean r3 = com.umeng.socialize.uploadlog.UMLog.isOpenShareEdit()
            if (r3 == 0) goto L26
            r3 = 16777216(0x1000000, float:2.3509887E-38)
            goto L27
        L26:
            r3 = 0
        L27:
            java.lang.String r4 = "isjump"
            boolean r7 = r7.getBoolean(r4)
            if (r7 == 0) goto L32
            r7 = 33554432(0x2000000, float:9.403955E-38)
            goto L33
        L32:
            r7 = 0
        L33:
            r0 = r0 | r2
            r7 = r7 | r0
            r7 = r7 | r3
            java.lang.String r0 = com.umeng.socialize.utils.SocializeSpUtils.getShareBoardConfig(r6)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L72
            java.lang.String r3 = ";"
            java.lang.String[] r0 = r0.split(r3)
            int r3 = r0.length
            r4 = 2
            if (r3 != r4) goto L71
            r3 = r0[r1]
            r4 = 1
            r5 = r0[r4]
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L71
            boolean r3 = android.text.TextUtils.isEmpty(r5)
            if (r3 != 0) goto L71
            java.lang.String r3 = "position"
            r4 = r0[r4]
            r2.put(r3, r4)
            java.lang.String r3 = "menubg"
            r0 = r0[r1]
            r2.put(r3, r0)
            com.umeng.socialize.net.dplus.DplusApi.uploadStatsDAU(r6, r2, r7)
        L71:
            return
        L72:
            r0 = 0
            com.umeng.socialize.net.dplus.DplusApi.uploadStatsDAU(r6, r0, r7)
            return
    }

    public static void getInfoendt(android.content.Context r0, com.umeng.socialize.bean.SHARE_MEDIA r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.util.Map<java.lang.String, java.lang.String> r5) {
            com.umeng.socialize.net.dplus.DplusApi.uploadInfoend(r0, r1, r4, r2, r3)
            if (r5 == 0) goto L8
            com.umeng.socialize.net.dplus.DplusApi.uploadUserInfo(r0, r5, r1, r4)
        L8:
            if (r5 == 0) goto L15
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toLowerCase()
            a(r0, r1, r5)
        L15:
            verifyStats(r0)
            return
    }

    public static void getInfostart(android.content.Context r0, com.umeng.socialize.bean.SHARE_MEDIA r1, java.lang.String r2) {
            com.umeng.socialize.net.dplus.DplusApi.uploadInfoStart(r0, r1, r2)
            return
    }

    public static void log(android.content.Context r1, java.lang.String r2, java.lang.String r3, com.umeng.socialize.media.UMediaObject r4) {
            com.umeng.socialize.net.analytics.SocialAnalytics$1 r0 = new com.umeng.socialize.net.analytics.SocialAnalytics$1
            r0.<init>(r1, r2, r3, r4)
            a(r0)
            return
    }

    public static void shareend(android.content.Context r0, com.umeng.socialize.bean.SHARE_MEDIA r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            com.umeng.socialize.net.dplus.DplusApi.uploadStatsShareEnd(r0, r1, r4, r2, r3)
            return
    }

    public static void verifyStats(android.content.Context r3) {
            java.lang.String r0 = "umeng_verify"
            r1 = 0
            android.content.SharedPreferences r0 = r3.getSharedPreferences(r0, r1)
            java.lang.String r1 = "verify_log"
            r2 = 0
            java.util.Set r0 = r0.getStringSet(r1, r2)
            if (r0 == 0) goto L1f
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L17
            goto L1f
        L17:
            com.umeng.socialize.net.analytics.SocialAnalytics$2 r0 = new com.umeng.socialize.net.analytics.SocialAnalytics$2
            r0.<init>(r3)
            a(r0)
        L1f:
            return
    }
}
