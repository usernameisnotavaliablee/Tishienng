package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class c6 {
    private com.amap.api.col.p0003l.p4 a;

    public c6(java.lang.String r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.a = r0
            com.amap.api.col.3l.p4$a r0 = new com.amap.api.col.3l.p4$a     // Catch: com.amap.api.col.p0003l.fk -> L1f
            java.lang.String r1 = "1.0"
            java.lang.String r2 = "1.0.0"
            r0.<init>(r4, r1, r2)     // Catch: com.amap.api.col.p0003l.fk -> L1f
            java.lang.String r4 = "info"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: com.amap.api.col.p0003l.fk -> L1f
            com.amap.api.col.3l.p4$a r4 = r0.b(r4)     // Catch: com.amap.api.col.p0003l.fk -> L1f
            com.amap.api.col.3l.p4 r4 = r4.c()     // Catch: com.amap.api.col.p0003l.fk -> L1f
            r3.a = r4     // Catch: com.amap.api.col.p0003l.fk -> L1f
        L1f:
            return
    }

    private static com.amap.api.col.p0003l.p4 a(org.json.JSONObject r8) {
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "a"
            java.lang.String r1 = r8.optString(r1)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r2 = "b"
            java.lang.String r2 = r8.optString(r2)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r3 = "c"
            java.lang.String r3 = r8.optString(r3)     // Catch: java.lang.Throwable -> L4d
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4d
            r4.<init>()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r5 = "d"
            org.json.JSONArray r8 = r8.optJSONArray(r5)     // Catch: java.lang.Throwable -> L4d
            r5 = 0
            r6 = 0
        L23:
            int r7 = r8.length()     // Catch: java.lang.Throwable -> L4d
            if (r6 >= r7) goto L33
            java.lang.String r7 = r8.getString(r6)     // Catch: java.lang.Throwable -> L4d
            r4.add(r7)     // Catch: java.lang.Throwable -> L4d
            int r6 = r6 + 1
            goto L23
        L33:
            com.amap.api.col.3l.p4$a r8 = new com.amap.api.col.3l.p4$a     // Catch: java.lang.Throwable -> L4d
            r8.<init>(r1, r2, r1)     // Catch: java.lang.Throwable -> L4d
            com.amap.api.col.3l.p4$a r8 = r8.a(r3)     // Catch: java.lang.Throwable -> L4d
            java.lang.String[] r1 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L4d
            java.lang.Object[] r1 = r4.toArray(r1)     // Catch: java.lang.Throwable -> L4d
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch: java.lang.Throwable -> L4d
            com.amap.api.col.3l.p4$a r8 = r8.b(r1)     // Catch: java.lang.Throwable -> L4d
            com.amap.api.col.3l.p4 r8 = r8.c()     // Catch: java.lang.Throwable -> L4d
            return r8
        L4d:
            return r0
    }

    public final java.util.List<com.amap.api.col.p0003l.p4> b(android.content.Context r4) {
            r3 = this;
            com.amap.api.col.3l.p4 r0 = r3.a
            java.lang.String r1 = "rbck"
            java.lang.String r4 = com.amap.api.col.p0003l.b6.a(r4, r0, r1)
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: org.json.JSONException -> L37
            r0.<init>(r4)     // Catch: org.json.JSONException -> L37
            int r4 = r0.length()     // Catch: org.json.JSONException -> L37
            if (r4 != 0) goto L19
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: org.json.JSONException -> L37
            r4.<init>()     // Catch: org.json.JSONException -> L37
            return r4
        L19:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: org.json.JSONException -> L37
            r4.<init>()     // Catch: org.json.JSONException -> L37
            r1 = 0
        L1f:
            int r2 = r0.length()     // Catch: org.json.JSONException -> L37
            if (r1 >= r2) goto L3c
            org.json.JSONObject r2 = r0.getJSONObject(r1)     // Catch: org.json.JSONException -> L2e
            com.amap.api.col.3l.p4 r2 = a(r2)     // Catch: org.json.JSONException -> L2e
            goto L2f
        L2e:
            r2 = 0
        L2f:
            if (r2 == 0) goto L34
            r4.add(r2)     // Catch: org.json.JSONException -> L37
        L34:
            int r1 = r1 + 1
            goto L1f
        L37:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L3c:
            return r4
    }

    public final void c(android.content.Context r7, com.amap.api.col.p0003l.p4 r8) {
            r6 = this;
            if (r8 != 0) goto L4
            goto L7f
        L4:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r8)
            int r8 = r0.size()
            if (r8 != 0) goto L18
            org.json.JSONArray r8 = new org.json.JSONArray
            r8.<init>()
            goto L75
        L18:
            org.json.JSONArray r8 = new org.json.JSONArray
            r8.<init>()
            java.util.Iterator r0 = r0.iterator()
        L21:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L75
            java.lang.Object r1 = r0.next()
            com.amap.api.col.3l.p4 r1 = (com.amap.api.col.p0003l.p4) r1
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "a"
            java.lang.String r4 = r1.a()     // Catch: org.json.JSONException -> L71
            r2.put(r3, r4)     // Catch: org.json.JSONException -> L71
            java.lang.String r3 = "b"
            java.lang.String r4 = r1.e()     // Catch: org.json.JSONException -> L71
            r2.put(r3, r4)     // Catch: org.json.JSONException -> L71
            java.lang.String r3 = "c"
            java.lang.String r4 = r1.f()     // Catch: org.json.JSONException -> L71
            r2.put(r3, r4)     // Catch: org.json.JSONException -> L71
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: org.json.JSONException -> L71
            r3.<init>()     // Catch: org.json.JSONException -> L71
            r4 = 0
        L53:
            java.lang.String[] r5 = r1.i()     // Catch: org.json.JSONException -> L71
            if (r5 == 0) goto L6c
            java.lang.String[] r5 = r1.i()     // Catch: org.json.JSONException -> L71
            int r5 = r5.length     // Catch: org.json.JSONException -> L71
            if (r4 >= r5) goto L6c
            java.lang.String[] r5 = r1.i()     // Catch: org.json.JSONException -> L71
            r5 = r5[r4]     // Catch: org.json.JSONException -> L71
            r3.put(r5)     // Catch: org.json.JSONException -> L71
            int r4 = r4 + 1
            goto L53
        L6c:
            java.lang.String r1 = "d"
            r2.put(r1, r3)     // Catch: org.json.JSONException -> L71
        L71:
            r8.put(r2)
            goto L21
        L75:
            java.lang.String r8 = r8.toString()
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L80
        L7f:
            return
        L80:
            com.amap.api.col.3l.p4 r0 = r6.a
            java.lang.String r1 = "rbck"
            com.amap.api.col.p0003l.b6.b(r7, r0, r1, r8)
            return
    }
}
