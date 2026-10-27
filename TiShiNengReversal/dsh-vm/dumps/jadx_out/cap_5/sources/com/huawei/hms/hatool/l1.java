package com.huawei.hms.hatool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class l1 {
    public l1() {
            r1 = this;
            r1.<init>()
            return
    }

    private static void a(java.lang.String r1, java.lang.String r2) {
            com.huawei.hms.hatool.f0 r0 = new com.huawei.hms.hatool.f0
            r0.<init>(r1, r2)
            com.huawei.hms.hatool.e r1 = com.huawei.hms.hatool.e.a()
            r1.b(r0)
            return
    }

    public static boolean b() {
            java.lang.String r0 = com.huawei.hms.hatool.y0.a()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = ""
            java.lang.String r3 = "Privacy_MY"
            if (r1 == 0) goto L1b
            android.content.Context r0 = com.huawei.hms.hatool.y0.q()
            java.lang.String r1 = "public_key_time_interval"
            java.lang.String r0 = com.huawei.hms.hatool.l.b(r0, r3, r1, r2)
            com.huawei.hms.hatool.y0.l(r0)
        L1b:
            java.lang.String r1 = com.huawei.hms.hatool.y0.u()
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 == 0) goto L32
            android.content.Context r1 = com.huawei.hms.hatool.y0.q()
            java.lang.String r4 = "public_key_time_last"
            java.lang.String r1 = com.huawei.hms.hatool.l.b(r1, r3, r4, r2)
            com.huawei.hms.hatool.y0.f(r1)
        L32:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            r3 = 1
            if (r2 != 0) goto L70
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L40
            goto L70
        L40:
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L55
            long r1 = java.lang.Long.parseLong(r1)     // Catch: java.lang.NumberFormatException -> L55
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.NumberFormatException -> L55
            long r4 = r4 - r1
            long r0 = (long) r0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L53
            return r3
        L53:
            r0 = 0
            return r0
        L55:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "checkCachePubKey NumberFormatException :"
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "GetPublicKey"
            com.huawei.hms.hatool.j1.l(r1, r0)
        L70:
            return r3
    }

    public static void c(java.lang.String r4, java.lang.String r5) {
            java.lang.String r0 = "GetPublicKey"
            java.lang.String r4 = com.huawei.hms.hatool.c.g(r4, r5)
            java.lang.String r1 = "{url}/getPublicKey?keytype=4"
            java.lang.String r2 = "{url}"
            java.lang.String r4 = r1.replace(r2, r4)
            java.lang.String r1 = com.huawei.hms.hatool.y0.k()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r3 = "App-Id"
            r2.put(r3, r1)
            r1 = 0
            byte[] r1 = new byte[r1]     // Catch: java.lang.Exception -> L24
            com.huawei.hms.hatool.p0 r4 = com.huawei.hms.hatool.k1.a(r4, r1, r2)     // Catch: java.lang.Exception -> L24
            goto L3e
        L24:
            r4 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "get pubKey response Exception :"
            r1.append(r2)
            java.lang.String r4 = r4.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            com.huawei.hms.hatool.j1.l(r0, r4)
            r4 = 0
        L3e:
            if (r4 != 0) goto L46
            java.lang.String r4 = "get pubKey response is null"
        L42:
            com.huawei.hms.hatool.j1.l(r0, r4)
            return
        L46:
            int r1 = r4.b()
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 == r2) goto L64
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "get pubKey fail HttpCode :"
            r5.append(r1)
            int r4 = r4.b()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            goto L42
        L64:
            java.lang.String r0 = r4.a()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L75
            java.lang.String r4 = r4.a()
            e(r4, r5)
        L75:
            return
    }

    public static java.lang.String d(java.lang.String r6, java.lang.String r7) {
            java.lang.String r0 = com.huawei.hms.hatool.y0.e()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = ""
            java.lang.String r3 = "Privacy_MY"
            if (r1 == 0) goto L1b
            android.content.Context r0 = com.huawei.hms.hatool.y0.q()
            java.lang.String r1 = "public_key_version"
            java.lang.String r0 = com.huawei.hms.hatool.l.b(r0, r3, r1, r2)
            com.huawei.hms.hatool.y0.n(r0)
        L1b:
            java.lang.String r1 = "2.0"
            boolean r0 = r1.equals(r0)
            r1 = 0
            if (r0 != 0) goto L28
            a(r6, r7)
            return r1
        L28:
            java.lang.String r0 = "maint"
            boolean r0 = r0.equals(r7)
            java.lang.String r4 = "HiAnalytics_Sdk_Public_Sp_Key"
            if (r0 == 0) goto L4e
            java.lang.String r0 = com.huawei.hms.hatool.y0.v()
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 == 0) goto L69
            android.content.Context r0 = com.huawei.hms.hatool.y0.q()
            java.lang.String r5 = "public_key_maint"
            java.lang.String r0 = com.huawei.hms.hatool.l.b(r0, r3, r5, r2)
            java.lang.String r0 = z1.h.d(r4, r0)
            com.huawei.hms.hatool.y0.h(r0)
            goto L69
        L4e:
            java.lang.String r0 = com.huawei.hms.hatool.y0.w()
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 == 0) goto L69
            android.content.Context r0 = com.huawei.hms.hatool.y0.q()
            java.lang.String r5 = "public_key_oper"
            java.lang.String r0 = com.huawei.hms.hatool.l.b(r0, r3, r5, r2)
            java.lang.String r0 = z1.h.d(r4, r0)
            com.huawei.hms.hatool.y0.j(r0)
        L69:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L77
            boolean r2 = b()
            if (r2 == 0) goto L76
            goto L77
        L76:
            return r0
        L77:
            a(r6, r7)
            return r1
    }

    private static void e(java.lang.String r8, java.lang.String r9) {
            java.lang.String r9 = "HiAnalytics_Sdk_Public_Sp_Key"
            java.lang.String r0 = "Privacy_MY"
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L7b
            r1.<init>(r8)     // Catch: org.json.JSONException -> L7b
            java.lang.String r8 = "publicKey"
            java.lang.String r8 = r1.optString(r8)     // Catch: org.json.JSONException -> L7b
            java.lang.String r2 = "publicKeyOM"
            java.lang.String r2 = r1.optString(r2)     // Catch: org.json.JSONException -> L7b
            java.lang.String r3 = "pubkey_version"
            java.lang.String r3 = r1.optString(r3)     // Catch: org.json.JSONException -> L7b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L7b
            r4.<init>()     // Catch: org.json.JSONException -> L7b
            long r5 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L7b
            r4.append(r5)     // Catch: org.json.JSONException -> L7b
            java.lang.String r5 = ""
            r4.append(r5)     // Catch: org.json.JSONException -> L7b
            java.lang.String r4 = r4.toString()     // Catch: org.json.JSONException -> L7b
            java.lang.String r5 = "timeInterval"
            java.lang.String r1 = r1.optString(r5)     // Catch: org.json.JSONException -> L7b
            android.content.Context r5 = com.huawei.hms.hatool.y0.q()     // Catch: org.json.JSONException -> L7b
            java.lang.String r6 = "public_key_oper"
            java.lang.String r7 = z1.h.g(r9, r8)     // Catch: org.json.JSONException -> L7b
            com.huawei.hms.hatool.l.g(r5, r0, r6, r7)     // Catch: org.json.JSONException -> L7b
            android.content.Context r5 = com.huawei.hms.hatool.y0.q()     // Catch: org.json.JSONException -> L7b
            java.lang.String r6 = "public_key_maint"
            java.lang.String r9 = z1.h.g(r9, r2)     // Catch: org.json.JSONException -> L7b
            com.huawei.hms.hatool.l.g(r5, r0, r6, r9)     // Catch: org.json.JSONException -> L7b
            android.content.Context r9 = com.huawei.hms.hatool.y0.q()     // Catch: org.json.JSONException -> L7b
            java.lang.String r5 = "public_key_time_interval"
            com.huawei.hms.hatool.l.g(r9, r0, r5, r1)     // Catch: org.json.JSONException -> L7b
            android.content.Context r9 = com.huawei.hms.hatool.y0.q()     // Catch: org.json.JSONException -> L7b
            java.lang.String r5 = "public_key_version"
            com.huawei.hms.hatool.l.g(r9, r0, r5, r3)     // Catch: org.json.JSONException -> L7b
            android.content.Context r9 = com.huawei.hms.hatool.y0.q()     // Catch: org.json.JSONException -> L7b
            java.lang.String r5 = "public_key_time_last"
            com.huawei.hms.hatool.l.g(r9, r0, r5, r4)     // Catch: org.json.JSONException -> L7b
            com.huawei.hms.hatool.y0.j(r8)     // Catch: org.json.JSONException -> L7b
            com.huawei.hms.hatool.y0.h(r2)     // Catch: org.json.JSONException -> L7b
            com.huawei.hms.hatool.y0.n(r3)     // Catch: org.json.JSONException -> L7b
            com.huawei.hms.hatool.y0.f(r4)     // Catch: org.json.JSONException -> L7b
            com.huawei.hms.hatool.y0.l(r1)     // Catch: org.json.JSONException -> L7b
            return
        L7b:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "get pubKey parse json JSONException :"
            r9.append(r0)
            java.lang.String r8 = r8.getMessage()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            java.lang.String r9 = "GetPublicKey"
            com.huawei.hms.hatool.j1.l(r9, r8)
            return
    }
}
