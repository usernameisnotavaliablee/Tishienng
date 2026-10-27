package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a2 {
    public a2() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.List<java.util.Map<java.lang.String, java.lang.String>> a(java.lang.String r3) {
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Exception -> L24
            r0.<init>(r3)     // Catch: java.lang.Exception -> L24
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Exception -> L24
            r3.<init>()     // Catch: java.lang.Exception -> L24
            r1 = 0
        Lb:
            int r2 = r0.length()     // Catch: java.lang.Exception -> L25
            if (r1 >= r2) goto L23
            org.json.JSONObject r2 = r0.getJSONObject(r1)     // Catch: java.lang.Exception -> L25
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L25
            java.util.Map r2 = b(r2)     // Catch: java.lang.Exception -> L25
            r3.add(r2)     // Catch: java.lang.Exception -> L25
            int r1 = r1 + 1
            goto Lb
        L23:
            return r3
        L24:
            r3 = 0
        L25:
            return r3
    }

    public static java.util.Map<java.lang.String, java.lang.String> b(java.lang.String r5) {
            r0 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L2c
            if (r1 == 0) goto L8
            return r0
        L8:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L2c
            r1.<init>(r5)     // Catch: java.lang.Exception -> L2c
            java.util.Iterator r5 = r1.keys()     // Catch: java.lang.Exception -> L2c
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Exception -> L2c
            r2.<init>()     // Catch: java.lang.Exception -> L2c
        L16:
            boolean r3 = r5.hasNext()     // Catch: java.lang.Exception -> L2c
            if (r3 == 0) goto L2e
            java.lang.Object r3 = r5.next()     // Catch: java.lang.Exception -> L2c
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L2c
            java.lang.Object r4 = r1.get(r3)     // Catch: java.lang.Exception -> L2c
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> L2c
            r2.put(r3, r4)     // Catch: java.lang.Exception -> L2c
            goto L16
        L2c:
            r5 = move-exception
            goto L2f
        L2e:
            return r2
        L2f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getShowAdActivityPackageName samon--> Exception e ="
            r1.append(r2)
            java.lang.String r5 = r5.getMessage()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r1 = "JsonMapUtil"
            com.acse.ottn.h2.a(r1, r5)
            return r0
    }
}
