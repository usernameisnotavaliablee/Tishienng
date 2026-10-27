package com.huawei.hms.hatool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class b implements com.huawei.hms.hatool.v {
    private android.content.Context a;
    private java.lang.String b;
    private org.json.JSONObject c;
    private java.lang.String d;
    private java.lang.String e;
    private java.lang.String f;
    private java.lang.String g;
    private java.lang.Boolean h;

    public b(java.lang.String r2, org.json.JSONObject r3, java.lang.String r4, java.lang.String r5, long r6) {
            r1 = this;
            r1.<init>()
            android.content.Context r0 = com.huawei.hms.hatool.y0.q()
            r1.a = r0
            r1.b = r2
            r1.c = r3
            r1.d = r4
            r1.e = r5
            java.lang.String r2 = java.lang.String.valueOf(r6)
            r1.f = r2
            java.lang.String r2 = "oper"
            boolean r2 = com.huawei.hms.hatool.r1.i(r4, r2)
            if (r2 == 0) goto L37
            com.huawei.hms.hatool.p1 r2 = com.huawei.hms.hatool.p1.c()
            com.huawei.hms.hatool.v0 r2 = r2.b(r4, r6)
            java.lang.String r3 = r2.a()
            r1.g = r3
            boolean r2 = r2.f()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.h = r2
        L37:
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r7 = this;
            java.lang.String r0 = "Begin to run EventRecordTask..."
            java.lang.String r1 = "hmsSdk"
            com.huawei.hms.hatool.j1.h(r1, r0)
            int r0 = com.huawei.hms.hatool.y0.o()
            java.lang.String r2 = r7.d
            java.lang.String r3 = r7.e
            int r2 = com.huawei.hms.hatool.c.l(r2, r3)
            android.content.Context r3 = r7.a
            r4 = 1048576(0x100000, float:1.469368E-39)
            int r0 = r0 * r4
            java.lang.String r4 = "stat_v2_1"
            boolean r0 = com.huawei.hms.hatool.h.c(r3, r4, r0)
            java.lang.String r3 = ""
            if (r0 == 0) goto L32
            java.lang.String r0 = "stat sp file reach max limited size, discard new event"
            com.huawei.hms.hatool.j1.h(r1, r0)
            com.huawei.hms.hatool.o r0 = com.huawei.hms.hatool.o.a()
            java.lang.String r1 = "alltype"
            r0.f(r3, r1)
            return
        L32:
            com.huawei.hms.hatool.f r0 = new com.huawei.hms.hatool.f
            r0.<init>()
            java.lang.String r5 = r7.b
            r0.e(r5)
            org.json.JSONObject r5 = r7.c
            java.lang.String r5 = r5.toString()
            r0.b(r5)
            java.lang.String r5 = r7.e
            r0.i(r5)
            java.lang.String r5 = r7.f
            r0.g(r5)
            java.lang.String r5 = r7.g
            r0.k(r5)
            java.lang.Boolean r5 = r7.h
            if (r5 != 0) goto L5a
            r5 = 0
            goto L5e
        L5a:
            java.lang.String r5 = java.lang.String.valueOf(r5)
        L5e:
            r0.j(r5)
            org.json.JSONObject r0 = r0.h()     // Catch: org.json.JSONException -> Lb3
            java.lang.String r5 = r7.d
            java.lang.String r6 = r7.e
            java.lang.String r5 = com.huawei.hms.hatool.q0.d(r5, r6)
            android.content.Context r6 = r7.a
            java.lang.String r3 = com.huawei.hms.hatool.l.b(r6, r4, r5, r3)
            boolean r6 = android.text.TextUtils.isEmpty(r3)     // Catch: org.json.JSONException -> L85
            if (r6 != 0) goto L7f
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch: org.json.JSONException -> L85
            r6.<init>(r3)     // Catch: org.json.JSONException -> L85
            goto L8f
        L7f:
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch: org.json.JSONException -> L85
            r6.<init>()     // Catch: org.json.JSONException -> L85
            goto L8f
        L85:
            java.lang.String r3 = "Cached data corrupted: stat_v2_1"
            com.huawei.hms.hatool.j1.j(r1, r3)
            org.json.JSONArray r6 = new org.json.JSONArray
            r6.<init>()
        L8f:
            r6.put(r0)
            android.content.Context r0 = r7.a
            java.lang.String r1 = r6.toString()
            com.huawei.hms.hatool.l.g(r0, r4, r5, r1)
            java.lang.String r0 = r6.toString()
            int r0 = r0.length()
            int r2 = r2 * 1024
            if (r0 <= r2) goto Lb2
            com.huawei.hms.hatool.o r0 = com.huawei.hms.hatool.o.a()
            java.lang.String r1 = r7.d
            java.lang.String r2 = r7.e
            r0.f(r1, r2)
        Lb2:
            return
        Lb3:
            java.lang.String r0 = "eventRecord toJson error! The record failed."
            com.huawei.hms.hatool.j1.l(r1, r0)
            return
    }
}
