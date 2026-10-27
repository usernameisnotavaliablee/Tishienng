package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class q {
    public q() {
            r0 = this;
            r0.<init>()
            return
    }

    public static long a(org.json.JSONArray r2) {
            java.lang.String r2 = r2.toString()
            byte[] r2 = r2.getBytes()
            int r2 = r2.length
            long r0 = (long) r2
            return r0
    }

    public static long a(org.json.JSONObject r2) {
            java.lang.String r2 = r2.toString()
            byte[] r2 = r2.getBytes()
            int r2 = r2.length
            long r0 = (long) r2
            return r0
    }

    public static org.json.JSONObject a(android.content.Context r10, long r11, org.json.JSONObject r13) {
            java.lang.String r0 = "error"
            java.lang.String r1 = "gkv"
            java.lang.String r2 = "ekv"
            java.lang.String r3 = "header"
            java.lang.String r4 = "analytics"
            java.lang.String r5 = "content"
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            boolean r7 = r13.has(r5)     // Catch: java.lang.Throwable -> L81
            if (r7 == 0) goto L81
            org.json.JSONObject r7 = r13.getJSONObject(r5)     // Catch: java.lang.Throwable -> L81
            boolean r8 = r7.has(r4)     // Catch: java.lang.Throwable -> L81
            if (r8 == 0) goto L43
            org.json.JSONObject r8 = r7.getJSONObject(r4)     // Catch: java.lang.Throwable -> L81
            boolean r9 = r8.has(r2)     // Catch: java.lang.Throwable -> L81
            if (r9 == 0) goto L2e
            r8.remove(r2)     // Catch: java.lang.Throwable -> L81
        L2e:
            boolean r2 = r8.has(r1)     // Catch: java.lang.Throwable -> L81
            if (r2 == 0) goto L37
            r8.remove(r1)     // Catch: java.lang.Throwable -> L81
        L37:
            boolean r1 = r8.has(r0)     // Catch: java.lang.Throwable -> L81
            if (r1 == 0) goto L40
            r8.remove(r0)     // Catch: java.lang.Throwable -> L81
        L40:
            r7.put(r4, r8)     // Catch: java.lang.Throwable -> L81
        L43:
            r6.put(r5, r7)     // Catch: java.lang.Throwable -> L81
            boolean r0 = r13.has(r3)     // Catch: java.lang.Throwable -> L81
            if (r0 == 0) goto L53
            org.json.JSONObject r13 = r13.getJSONObject(r3)     // Catch: java.lang.Throwable -> L81
            r6.put(r3, r13)     // Catch: java.lang.Throwable -> L81
        L53:
            long r0 = a(r6)     // Catch: java.lang.Throwable -> L81
            int r13 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r13 <= 0) goto L81
            r6 = 0
            com.umeng.analytics.pro.i r11 = com.umeng.analytics.pro.i.a(r10)     // Catch: java.lang.Throwable -> L81
            r11.i()     // Catch: java.lang.Throwable -> L81
            com.umeng.analytics.pro.i r11 = com.umeng.analytics.pro.i.a(r10)     // Catch: java.lang.Throwable -> L81
            r11.h()     // Catch: java.lang.Throwable -> L81
            com.umeng.analytics.pro.i r11 = com.umeng.analytics.pro.i.a(r10)     // Catch: java.lang.Throwable -> L81
            r12 = 1
            r13 = 0
            r11.b(r12, r13)     // Catch: java.lang.Throwable -> L81
            com.umeng.analytics.pro.i r10 = com.umeng.analytics.pro.i.a(r10)     // Catch: java.lang.Throwable -> L81
            r10.a()     // Catch: java.lang.Throwable -> L81
            java.lang.String r10 = "MobclickRT"
            java.lang.String r11 = "--->>> u-app packet overload !!! "
            com.umeng.commonsdk.debug.UMRTLog.i(r10, r11)     // Catch: java.lang.Throwable -> L81
        L81:
            return r6
    }
}
