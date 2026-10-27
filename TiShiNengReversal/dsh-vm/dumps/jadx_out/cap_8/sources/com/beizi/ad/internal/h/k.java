package com.beizi.ad.internal.h;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class k {
    public k() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.util.ArrayList<java.lang.String> a(org.json.JSONArray r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            int r1 = r5.length()     // Catch: java.lang.Throwable -> L23
            if (r1 <= 0) goto L23
            int r1 = r5.length()     // Catch: java.lang.Throwable -> L23
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L23
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L23
            r3 = 0
        L14:
            if (r3 >= r1) goto L22
            java.lang.Object r4 = r5.get(r3)     // Catch: java.lang.Throwable -> L23
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L23
            r2.add(r4)     // Catch: java.lang.Throwable -> L23
            int r3 = r3 + 1
            goto L14
        L22:
            return r2
        L23:
            return r0
    }

    public static java.util.HashMap<java.lang.String, java.lang.Object> a(org.json.JSONObject r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.util.Iterator r1 = r5.keys()     // Catch: org.json.JSONException -> L22
            java.util.HashMap r2 = new java.util.HashMap     // Catch: org.json.JSONException -> L22
            r2.<init>()     // Catch: org.json.JSONException -> L22
        Ld:
            boolean r3 = r1.hasNext()     // Catch: org.json.JSONException -> L22
            if (r3 == 0) goto L21
            java.lang.Object r3 = r1.next()     // Catch: org.json.JSONException -> L22
            java.lang.String r3 = (java.lang.String) r3     // Catch: org.json.JSONException -> L22
            java.lang.String r4 = r5.getString(r3)     // Catch: org.json.JSONException -> L22
            r2.put(r3, r4)     // Catch: org.json.JSONException -> L22
            goto Ld
        L21:
            return r2
        L22:
            return r0
    }

    public static org.json.JSONArray a(org.json.JSONObject r1, java.lang.String r2) {
            r0 = 0
            if (r1 != 0) goto L4
            return r0
        L4:
            org.json.JSONArray r1 = r1.getJSONArray(r2)     // Catch: org.json.JSONException -> Lf
            int r2 = r1.length()     // Catch: org.json.JSONException -> Lf
            if (r2 <= 0) goto Lf
            return r1
        Lf:
            return r0
    }

    public static org.json.JSONObject b(org.json.JSONObject r1, java.lang.String r2) {
            r0 = 0
            if (r1 != 0) goto L4
            return r0
        L4:
            org.json.JSONObject r1 = r1.getJSONObject(r2)     // Catch: org.json.JSONException -> L9
            return r1
        L9:
            return r0
    }

    public static java.lang.String c(org.json.JSONObject r1, java.lang.String r2) {
            java.lang.String r0 = ""
            if (r1 != 0) goto L5
            return r0
        L5:
            java.lang.String r1 = r1.getString(r2)     // Catch: org.json.JSONException -> La
            return r1
        La:
            return r0
    }

    public static int d(org.json.JSONObject r1, java.lang.String r2) {
            r0 = -1
            if (r1 != 0) goto L4
            return r0
        L4:
            int r1 = r1.getInt(r2)     // Catch: org.json.JSONException -> L9
            return r1
        L9:
            return r0
    }

    public static double e(org.json.JSONObject r2, java.lang.String r3) {
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            if (r2 != 0) goto L5
            return r0
        L5:
            double r2 = r2.getDouble(r3)     // Catch: org.json.JSONException -> La
            return r2
        La:
            return r0
    }
}
