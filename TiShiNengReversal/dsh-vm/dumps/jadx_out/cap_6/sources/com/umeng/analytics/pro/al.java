package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class al {
    public al() {
            r0 = this;
            r0.<init>()
            return
    }

    public static org.json.JSONObject a(android.content.Context r3, int r4, org.json.JSONArray r5, java.lang.String r6) {
            r0 = 0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L4c
            r1.<init>()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = com.umeng.commonsdk.utils.UMUtils.getZid(r3)     // Catch: java.lang.Throwable -> L25
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L25
            if (r2 != 0) goto L4b
            java.lang.String r2 = "atoken"
            r1.put(r2, r0)     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = com.umeng.commonsdk.utils.UMUtils.getDeviceToken(r3)     // Catch: java.lang.Throwable -> L25
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L25
            if (r0 != 0) goto L27
            java.lang.String r0 = "device_token"
            r1.put(r0, r3)     // Catch: java.lang.Throwable -> L25
            goto L27
        L25:
            r0 = r1
            goto L4c
        L27:
            java.lang.String r3 = "model"
            java.lang.String r0 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> L25
            r1.put(r3, r0)     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = "os"
            java.lang.String r0 = "android"
            r1.put(r3, r0)     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = "os_version"
            java.lang.String r0 = android.os.Build.VERSION.RELEASE     // Catch: java.lang.Throwable -> L25
            r1.put(r3, r0)     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = "hit_sdk"
            r1.put(r3, r6)     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = "sdk"
            r1.put(r3, r5)     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = "e"
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> L25
        L4b:
            return r1
        L4c:
            return r0
    }

    public static org.json.JSONObject a(android.content.Context r9, java.lang.String r10) {
            java.lang.String r0 = "[getCloudConfigParam] error "
            java.lang.String r1 = "MobclickRT"
            java.lang.String r2 = ""
            r3 = 0
            com.umeng.analytics.pro.ak r4 = new com.umeng.analytics.pro.ak     // Catch: java.lang.Throwable -> L172
            r4.<init>()     // Catch: java.lang.Throwable -> L172
            java.lang.String r5 = com.umeng.commonsdk.utils.UMUtils.getUMId(r9)     // Catch: java.lang.Throwable -> L172
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L172
            if (r6 == 0) goto L17
            return r3
        L17:
            r4.a(r5)     // Catch: java.lang.Throwable -> L172
            java.lang.String r5 = com.umeng.commonsdk.utils.UMUtils.getAppkey(r9)     // Catch: java.lang.Throwable -> L172
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L172
            if (r6 == 0) goto L25
            return r3
        L25:
            r4.b(r5)     // Catch: java.lang.Throwable -> L172
            java.lang.String r5 = com.umeng.commonsdk.utils.UMUtils.getAppVersionName(r9)     // Catch: java.lang.Throwable -> L172
            r4.c(r5)     // Catch: java.lang.Throwable -> L172
            java.lang.String r5 = "9.6.5"
            r4.d(r5)     // Catch: java.lang.Throwable -> L172
            java.lang.String r5 = com.umeng.commonsdk.utils.UMUtils.getChannel(r9)     // Catch: java.lang.Throwable -> L172
            r4.e(r5)     // Catch: java.lang.Throwable -> L172
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L172
            r5.<init>()     // Catch: java.lang.Throwable -> L172
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L172
            r5.append(r6)     // Catch: java.lang.Throwable -> L172
            r5.append(r2)     // Catch: java.lang.Throwable -> L172
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L172
            r4.f(r5)     // Catch: java.lang.Throwable -> L172
            java.lang.String r5 = android.os.Build.BRAND     // Catch: java.lang.Throwable -> L172
            r4.g(r5)     // Catch: java.lang.Throwable -> L172
            java.lang.String r5 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> L172
            r4.h(r5)     // Catch: java.lang.Throwable -> L172
            java.lang.String[] r5 = com.umeng.commonsdk.statistics.common.DeviceConfig.getLocaleInfo(r9)     // Catch: java.lang.Throwable -> L172
            r6 = 1
            r7 = r5[r6]     // Catch: java.lang.Throwable -> L172
            r4.i(r7)     // Catch: java.lang.Throwable -> L172
            r7 = 0
            r5 = r5[r7]     // Catch: java.lang.Throwable -> L172
            r4.j(r5)     // Catch: java.lang.Throwable -> L172
            int[] r5 = com.umeng.commonsdk.statistics.common.DeviceConfig.getResolutionArray(r9)     // Catch: java.lang.Throwable -> L172
            r8 = r5[r6]     // Catch: java.lang.Throwable -> L172
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L172
            r4.b(r8)     // Catch: java.lang.Throwable -> L172
            r5 = r5[r7]     // Catch: java.lang.Throwable -> L172
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L172
            r4.a(r5)     // Catch: java.lang.Throwable -> L172
            java.lang.String r5 = "install_datetime"
            java.lang.String r2 = com.umeng.analytics.pro.ap.a(r9, r5, r2)     // Catch: java.lang.Throwable -> L172
            r4.k(r2)     // Catch: java.lang.Throwable -> L172
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L172 org.json.JSONException -> L174
            r2.<init>()     // Catch: java.lang.Throwable -> L172 org.json.JSONException -> L174
            java.lang.String r3 = com.umeng.analytics.pro.ak.a     // Catch: java.lang.Throwable -> L16c org.json.JSONException -> L16f
            java.lang.String r5 = r4.a()     // Catch: java.lang.Throwable -> L16c org.json.JSONException -> L16f
            r2.put(r3, r5)     // Catch: java.lang.Throwable -> L16c org.json.JSONException -> L16f
            java.lang.String r3 = com.umeng.analytics.pro.ak.c     // Catch: java.lang.Throwable -> L16c org.json.JSONException -> L16f
            java.lang.String r5 = r4.c()     // Catch: java.lang.Throwable -> L16c org.json.JSONException -> L16f
            r2.put(r3, r5)     // Catch: java.lang.Throwable -> L16c org.json.JSONException -> L16f
            java.lang.String r3 = com.umeng.analytics.pro.ak.b     // Catch: java.lang.Throwable -> L16c org.json.JSONException -> L16f
            java.lang.String r5 = r4.b()     // Catch: java.lang.Throwable -> L16c org.json.JSONException -> L16f
            r2.put(r3, r5)     // Catch: java.lang.Throwable -> L16c org.json.JSONException -> L16f
            java.lang.String r3 = com.umeng.analytics.pro.ak.d     // Catch: java.lang.Throwable -> L16c org.json.JSONException -> L16f
            java.lang.String r5 = r4.d()     // Catch: java.lang.Throwable -> L16c org.json.JSONException -> L16f
            r2.put(r3, r5)     // Catch: java.lang.Throwable -> L16c org.json.JSONException -> L16f
            java.lang.String r3 = com.umeng.analytics.pro.ak.e     // Catch: java.lang.Throwable -> L16c org.json.JSONException -> L16f
            java.lang.String r5 = r4.e()     // Catch: java.lang.Throwable -> L16c org.json.JSONException -> L16f
            r2.put(r3, r5)     // Catch: java.lang.Throwable -> L16c org.json.JSONException -> L16f
            java.lang.String r3 = com.umeng.analytics.pro.ak.f     // Catch: java.lang.Throwable -> L16c org.json.JSONException -> L16f
            java.lang.String r5 = r4.f()     // Catch: java.lang.Throwable -> L16c org.json.JSONException -> L16f
            r2.put(r3, r5)     // Catch: java.lang.Throwable -> L16c org.json.JSONException -> L16f
            java.lang.String r3 = com.umeng.analytics.pro.ak.g     // Catch: java.lang.Throwable -> L16c org.json.JSONException -> L16f
            java.lang.String r5 = r4.g()     // Catch: java.lang.Throwable -> L16c org.json.JSONException -> L16f
            r2.put(r3, r5)     // Catch: java.lang.Throwable -> L16c org.json.JSONException -> L16f
            java.lang.String r3 = com.umeng.analytics.pro.ak.h     // Catch: java.lang.Throwable -> L16c org.json.JSONException -> L16f
            java.lang.String r5 = r4.h()     // Catch: java.lang.Throwable -> L16c org.json.JSONException -> L16f
            r2.put(r3, r5)     // Catch: java.lang.Throwable -> L16c org.json.JSONException -> L16f
            java.lang.String r3 = com.umeng.analytics.pro.ak.k     // Catch: java.lang.Throwable -> L16c org.json.JSONException -> L16f
            java.lang.Integer r5 = r4.k()     // Catch: java.lang.Throwable -> L16c org.json.JSONException -> L16f
            r2.put(r3, r5)     // Catch: java.lang.Throwable -> L16c org.json.JSONException -> L16f
            java.lang.String r3 = com.umeng.analytics.pro.ak.j     // Catch: java.lang.Throwable -> L16c org.json.JSONException -> L16f
            java.lang.Integer r5 = r4.j()     // Catch: java.lang.Throwable -> L16c org.json.JSONException -> L16f
            r2.put(r3, r5)     // Catch: java.lang.Throwable -> L16c org.json.JSONException -> L16f
            java.lang.String r3 = com.umeng.analytics.pro.ak.l     // Catch: java.lang.Throwable -> L16c org.json.JSONException -> L16f
            java.lang.String r5 = r4.l()     // Catch: java.lang.Throwable -> L16c org.json.JSONException -> L16f
            r2.put(r3, r5)     // Catch: java.lang.Throwable -> L16c org.json.JSONException -> L16f
            java.lang.String r3 = com.umeng.analytics.pro.ak.i     // Catch: java.lang.Throwable -> L16c org.json.JSONException -> L16f
            java.lang.String r5 = r4.i()     // Catch: java.lang.Throwable -> L16c org.json.JSONException -> L16f
            r2.put(r3, r5)     // Catch: java.lang.Throwable -> L16c org.json.JSONException -> L16f
            java.lang.String r3 = com.umeng.analytics.pro.ak.m     // Catch: java.lang.Throwable -> L16c org.json.JSONException -> L16f
            java.lang.String r4 = r4.m()     // Catch: java.lang.Throwable -> L16c org.json.JSONException -> L16f
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L16c org.json.JSONException -> L16f
            java.lang.String r3 = "zid"
            java.lang.String r9 = com.umeng.commonsdk.utils.UMUtils.getZid(r9)     // Catch: java.lang.Throwable -> L16c org.json.JSONException -> L16f
            r2.put(r3, r9)     // Catch: java.lang.Throwable -> L16c org.json.JSONException -> L16f
            java.lang.String r9 = "platform"
            java.lang.String r3 = "android"
            r2.put(r9, r3)     // Catch: java.lang.Throwable -> L16c org.json.JSONException -> L16f
            java.util.Map r9 = com.umeng.analytics.pro.ap.a()     // Catch: java.lang.Throwable -> L16c org.json.JSONException -> L16f
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L16c org.json.JSONException -> L16f
            r3.<init>(r9)     // Catch: java.lang.Throwable -> L16c org.json.JSONException -> L16f
            java.lang.String r9 = "optional"
            r2.put(r9, r3)     // Catch: java.lang.Throwable -> L16c org.json.JSONException -> L16f
            java.lang.String r9 = "@"
            java.lang.String[] r9 = r10.split(r9)     // Catch: java.lang.Throwable -> L16c org.json.JSONException -> L16f
            int r10 = r9.length     // Catch: java.lang.Throwable -> L16c org.json.JSONException -> L16f
            r0 = 4
            if (r10 != r0) goto L13c
            r10 = r9[r7]     // Catch: java.lang.Throwable -> L13c
            long r0 = java.lang.Long.parseLong(r10)     // Catch: java.lang.Throwable -> L13c
            r9 = r9[r6]     // Catch: java.lang.Throwable -> L13c
            java.lang.String r10 = "s1"
            r2.put(r10, r0)     // Catch: java.lang.Throwable -> L13c
            java.lang.String r10 = "s2"
            r2.put(r10, r9)     // Catch: java.lang.Throwable -> L13c
        L13c:
            java.lang.String r9 = android.os.Build.BRAND     // Catch: java.lang.Throwable -> L16b
            java.lang.String r10 = com.umeng.analytics.pro.aq.a(r9)     // Catch: java.lang.Throwable -> L16b
            java.lang.String r9 = com.umeng.analytics.pro.aq.b(r9)     // Catch: java.lang.Throwable -> L16b
            boolean r0 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> L16b
            if (r0 != 0) goto L15d
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L16b
            if (r0 != 0) goto L15d
            java.lang.String r0 = com.umeng.analytics.pro.ak.n     // Catch: java.lang.Throwable -> L16b
            r2.put(r0, r10)     // Catch: java.lang.Throwable -> L16b
            java.lang.String r10 = com.umeng.analytics.pro.ak.o     // Catch: java.lang.Throwable -> L16b
            r2.put(r10, r9)     // Catch: java.lang.Throwable -> L16b
            goto L16b
        L15d:
            java.lang.String r9 = com.umeng.analytics.pro.ak.n     // Catch: java.lang.Throwable -> L16b
            java.lang.String r10 = "Android"
            r2.put(r9, r10)     // Catch: java.lang.Throwable -> L16b
            java.lang.String r9 = com.umeng.analytics.pro.ak.o     // Catch: java.lang.Throwable -> L16b
            java.lang.String r10 = android.os.Build.VERSION.RELEASE     // Catch: java.lang.Throwable -> L16b
            r2.put(r9, r10)     // Catch: java.lang.Throwable -> L16b
        L16b:
            return r2
        L16c:
            r9 = move-exception
            r3 = r2
            goto L18c
        L16f:
            r9 = move-exception
            r3 = r2
            goto L175
        L172:
            r9 = move-exception
            goto L18c
        L174:
            r9 = move-exception
        L175:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L172
            r10.<init>()     // Catch: java.lang.Throwable -> L172
            r10.append(r0)     // Catch: java.lang.Throwable -> L172
            java.lang.String r9 = r9.getMessage()     // Catch: java.lang.Throwable -> L172
            r10.append(r9)     // Catch: java.lang.Throwable -> L172
            java.lang.String r9 = r10.toString()     // Catch: java.lang.Throwable -> L172
            com.umeng.commonsdk.debug.UMRTLog.e(r1, r9)     // Catch: java.lang.Throwable -> L172
            goto L1a2
        L18c:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r0)
            java.lang.String r9 = r9.getMessage()
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            com.umeng.commonsdk.debug.UMRTLog.e(r1, r9)
        L1a2:
            return r3
    }
}
