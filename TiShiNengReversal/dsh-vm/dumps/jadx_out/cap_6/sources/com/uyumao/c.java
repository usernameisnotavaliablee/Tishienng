package com.uyumao;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class c {
    public static boolean a;
    public static com.uyumao.h b;

    public c() {
            r1 = this;
            r1.<init>()
            return
    }

    public static org.json.JSONObject a(android.content.Context r9, com.uyumao.i r10, org.json.JSONArray r11) {
            java.lang.String r0 = "imp"
            java.lang.String r1 = ""
            r2 = 1
            r3 = 0
            r4 = 0
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Ldb
            r5.<init>()     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r6 = "ak"
            java.lang.String r7 = com.umeng.commonsdk.utils.UMUtils.getAppkey(r9)     // Catch: java.lang.Throwable -> L21
            r5.put(r6, r7)     // Catch: java.lang.Throwable -> L21
            java.lang.String r6 = com.umeng.commonsdk.utils.UMUtils.getUMId(r9)     // Catch: java.lang.Throwable -> L21
            java.lang.String r7 = "umid"
            if (r6 != 0) goto L24
            r5.put(r7, r1)     // Catch: java.lang.Throwable -> L21
            goto L2b
        L21:
            goto Ldd
        L24:
            java.lang.String r6 = com.umeng.commonsdk.utils.UMUtils.getUMId(r9)     // Catch: java.lang.Throwable -> L21
            r5.put(r7, r6)     // Catch: java.lang.Throwable -> L21
        L2b:
            java.lang.String[] r6 = com.umeng.commonsdk.utils.UMUtils.getActiveUser(r9)     // Catch: java.lang.Throwable -> L21
            java.lang.String r7 = "puid"
            if (r6 == 0) goto L45
            java.lang.String[] r6 = com.umeng.commonsdk.utils.UMUtils.getActiveUser(r9)     // Catch: java.lang.Throwable -> L21
            int r6 = r6.length     // Catch: java.lang.Throwable -> L21
            r8 = 2
            if (r6 != r8) goto L45
            java.lang.String[] r6 = com.umeng.commonsdk.utils.UMUtils.getActiveUser(r9)     // Catch: java.lang.Throwable -> L21
            r6 = r6[r2]     // Catch: java.lang.Throwable -> L21
            r5.put(r7, r6)     // Catch: java.lang.Throwable -> L21
            goto L48
        L45:
            r5.put(r7, r1)     // Catch: java.lang.Throwable -> L21
        L48:
            java.lang.String r6 = com.umeng.commonsdk.statistics.common.DeviceConfig.getAndroidId(r9)     // Catch: java.lang.Throwable -> L21
            java.lang.String r7 = "aid"
            if (r6 != 0) goto L54
            r5.put(r7, r1)     // Catch: java.lang.Throwable -> L21
            goto L5b
        L54:
            java.lang.String r6 = com.umeng.commonsdk.statistics.common.DeviceConfig.getAndroidId(r9)     // Catch: java.lang.Throwable -> L21
            r5.put(r7, r6)     // Catch: java.lang.Throwable -> L21
        L5b:
            java.lang.String r6 = com.umeng.commonsdk.utils.UMUtils.getZid(r9)     // Catch: java.lang.Throwable -> L21
            java.lang.String r7 = "atoken"
            if (r6 != 0) goto L67
            r5.put(r7, r1)     // Catch: java.lang.Throwable -> L21
            goto L6e
        L67:
            java.lang.String r6 = com.umeng.commonsdk.utils.UMUtils.getZid(r9)     // Catch: java.lang.Throwable -> L21
            r5.put(r7, r6)     // Catch: java.lang.Throwable -> L21
        L6e:
            java.lang.String r6 = "oaid"
            java.lang.String r7 = com.umeng.commonsdk.statistics.common.DeviceConfig.getOaid(r9)     // Catch: java.lang.Throwable -> L21
            r5.put(r6, r7)     // Catch: java.lang.Throwable -> L21
            java.lang.String r6 = "idfa"
            java.lang.String r7 = com.umeng.commonsdk.statistics.common.DeviceConfig.getIdfa(r9)     // Catch: java.lang.Throwable -> L21
            r5.put(r6, r7)     // Catch: java.lang.Throwable -> L21
            java.lang.String r6 = "db"
            java.lang.String r7 = android.os.Build.BRAND     // Catch: java.lang.Throwable -> L21
            r5.put(r6, r7)     // Catch: java.lang.Throwable -> L21
            java.lang.String r6 = "dm"
            java.lang.String r7 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> L21
            r5.put(r6, r7)     // Catch: java.lang.Throwable -> L21
            java.lang.String r6 = "os"
            java.lang.String r7 = "Android"
            r5.put(r6, r7)     // Catch: java.lang.Throwable -> L21
            java.lang.String r6 = "ov"
            java.lang.String r7 = android.os.Build.VERSION.RELEASE     // Catch: java.lang.Throwable -> L21
            r5.put(r6, r7)     // Catch: java.lang.Throwable -> L21
            java.lang.String r6 = "sv"
            java.lang.String r7 = "1.1.2"
            r5.put(r6, r7)     // Catch: java.lang.Throwable -> L21
            java.lang.String r6 = "av"
            java.lang.String r7 = com.umeng.commonsdk.statistics.common.DeviceConfig.getAppVersionName(r9)     // Catch: java.lang.Throwable -> L21
            r5.put(r6, r7)     // Catch: java.lang.Throwable -> L21
            java.lang.String r6 = "chn"
            java.lang.String r7 = com.umeng.commonsdk.utils.UMUtils.getChannel(r9)     // Catch: java.lang.Throwable -> L21
            r5.put(r6, r7)     // Catch: java.lang.Throwable -> L21
            java.lang.String r6 = "cts"
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L21
            r5.put(r6, r7)     // Catch: java.lang.Throwable -> L21
            java.lang.String r6 = "pkg"
            java.lang.String r7 = com.umeng.commonsdk.statistics.common.DeviceConfig.getPackageName(r9)     // Catch: java.lang.Throwable -> L21
            r5.put(r6, r7)     // Catch: java.lang.Throwable -> L21
            java.lang.String r6 = "uyumao_info"
            android.content.SharedPreferences r6 = r9.getSharedPreferences(r6, r3)     // Catch: java.lang.Throwable -> L21
            java.lang.String r6 = r6.getString(r0, r1)     // Catch: java.lang.Throwable -> L21
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L21
            if (r7 != 0) goto Ldd
            r5.put(r0, r6)     // Catch: java.lang.Throwable -> L21
            goto Ldd
        Ldb:
            r5 = r4
        Ldd:
            if (r5 != 0) goto Le1
            goto L17c
        Le1:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L17b
            r0.<init>()     // Catch: java.lang.Throwable -> L17b
            if (r10 == 0) goto L112
            java.lang.String r4 = "le"
            int r6 = r10.a     // Catch: java.lang.Throwable -> L17b
            r0.put(r4, r6)     // Catch: java.lang.Throwable -> L17b
            java.lang.String r4 = "vo"
            int r6 = r10.b     // Catch: java.lang.Throwable -> L17b
            r0.put(r4, r6)     // Catch: java.lang.Throwable -> L17b
            java.lang.String r4 = "te"
            int r6 = r10.c     // Catch: java.lang.Throwable -> L17b
            r0.put(r4, r6)     // Catch: java.lang.Throwable -> L17b
            java.lang.String r4 = "st"
            int r6 = r10.d     // Catch: java.lang.Throwable -> L17b
            r0.put(r4, r6)     // Catch: java.lang.Throwable -> L17b
            java.lang.String r4 = "ch"
            int r6 = r10.e     // Catch: java.lang.Throwable -> L17b
            r0.put(r4, r6)     // Catch: java.lang.Throwable -> L17b
            java.lang.String r4 = "ts"
            long r6 = r10.f     // Catch: java.lang.Throwable -> L17b
            r0.put(r4, r6)     // Catch: java.lang.Throwable -> L17b
        L112:
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L17b
            r10.<init>()     // Catch: java.lang.Throwable -> L17b
            java.lang.String r4 = "mcc"
            if (r9 != 0) goto L11c
            goto L12b
        L11c:
            android.content.res.Resources r6 = r9.getResources()     // Catch: java.lang.Throwable -> L12b
            android.content.res.Configuration r6 = r6.getConfiguration()     // Catch: java.lang.Throwable -> L12b
            int r6 = r6.mcc     // Catch: java.lang.Throwable -> L12b
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L12b
            goto L12c
        L12b:
            r6 = r1
        L12c:
            r10.put(r4, r6)     // Catch: java.lang.Throwable -> L17b
            java.lang.String r4 = "mnc"
            if (r9 != 0) goto L134
            goto L156
        L134:
            android.content.res.Resources r6 = r9.getResources()     // Catch: java.lang.Throwable -> L156
            android.content.res.Configuration r6 = r6.getConfiguration()     // Catch: java.lang.Throwable -> L156
            int r6 = r6.mnc     // Catch: java.lang.Throwable -> L156
            java.lang.String r7 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L156
            r8 = 10
            if (r6 >= r8) goto L155
            java.lang.String r7 = "%02d"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L156
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L156
            r2[r3] = r6     // Catch: java.lang.Throwable -> L156
            java.lang.String r1 = java.lang.String.format(r7, r2)     // Catch: java.lang.Throwable -> L156
            goto L156
        L155:
            r1 = r7
        L156:
            r10.put(r4, r1)     // Catch: java.lang.Throwable -> L17b
            java.lang.String r1 = "net"
            java.lang.String[] r9 = com.uyumao.e.c(r9)     // Catch: java.lang.Throwable -> L17b
            r9 = r9[r3]     // Catch: java.lang.Throwable -> L17b
            r10.put(r1, r9)     // Catch: java.lang.Throwable -> L17b
            java.lang.String r9 = "battery"
            r10.put(r9, r0)     // Catch: java.lang.Throwable -> L17b
            if (r11 == 0) goto L176
            int r9 = r11.length()     // Catch: java.lang.Throwable -> L17b
            if (r9 == 0) goto L176
            java.lang.String r9 = "net_state"
            r10.put(r9, r11)     // Catch: java.lang.Throwable -> L17b
        L176:
            java.lang.String r9 = "anti"
            r5.put(r9, r10)     // Catch: java.lang.Throwable -> L17b
        L17b:
            r4 = r5
        L17c:
            return r4
    }

    public static void a(android.content.Context r6, org.json.JSONObject r7, boolean r8) {
            java.lang.String r0 = "resp_code"
            java.lang.String r1 = "imp"
            if (r7 != 0) goto L7
            return
        L7:
            java.lang.String r2 = r7.toString()
            java.lang.String r3 = "https://yumao.puata.info/anti_logs"
            java.lang.String r2 = com.uyumao.k.a(r6, r3, r2)
            r7.toString()
            if (r2 != 0) goto L17
            goto L8c
        L17:
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L8c
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L8c
            boolean r2 = r7.has(r1)     // Catch: java.lang.Throwable -> L8c
            r3 = 0
            java.lang.String r4 = "uyumao_info"
            if (r2 == 0) goto L38
            java.lang.String r2 = r7.optString(r1)     // Catch: java.lang.Throwable -> L8c
            android.content.SharedPreferences r5 = r6.getSharedPreferences(r4, r3)     // Catch: java.lang.Throwable -> L8c
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch: java.lang.Throwable -> L8c
            android.content.SharedPreferences$Editor r1 = r5.putString(r1, r2)     // Catch: java.lang.Throwable -> L8c
            r1.apply()     // Catch: java.lang.Throwable -> L8c
        L38:
            if (r8 == 0) goto L8c
            boolean r8 = r7.has(r0)     // Catch: java.lang.Throwable -> L8c
            if (r8 == 0) goto L6a
            int r7 = r7.optInt(r0)     // Catch: java.lang.Throwable -> L8c
            if (r7 != 0) goto L6a
            android.content.SharedPreferences r7 = r6.getSharedPreferences(r4, r3)     // Catch: java.lang.Throwable -> L8c
            android.content.SharedPreferences$Editor r7 = r7.edit()     // Catch: java.lang.Throwable -> L8c
            java.text.SimpleDateFormat r8 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L8c
            java.lang.String r0 = "yyyyMMdd"
            java.util.Locale r1 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L8c
            r8.<init>(r0, r1)     // Catch: java.lang.Throwable -> L8c
            java.util.Date r0 = new java.util.Date     // Catch: java.lang.Throwable -> L8c
            r0.<init>()     // Catch: java.lang.Throwable -> L8c
            java.lang.String r8 = r8.format(r0)     // Catch: java.lang.Throwable -> L8c
            r0 = 1
            android.content.SharedPreferences$Editor r7 = r7.putBoolean(r8, r0)     // Catch: java.lang.Throwable -> L8c
            r7.apply()     // Catch: java.lang.Throwable -> L8c
        L6a:
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> L8c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8c
            r8.<init>()     // Catch: java.lang.Throwable -> L8c
            java.io.File r6 = r6.getCacheDir()     // Catch: java.lang.Throwable -> L8c
            r8.append(r6)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r6 = java.io.File.separator     // Catch: java.lang.Throwable -> L8c
            r8.append(r6)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r6 = "net_change"
            r8.append(r6)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r6 = r8.toString()     // Catch: java.lang.Throwable -> L8c
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L8c
            com.uyumao.e.a(r7)     // Catch: java.lang.Throwable -> L8c
        L8c:
            return
    }
}
