package com.huawei.hms.hatool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class k implements com.huawei.hms.hatool.v {
    private java.lang.String a;
    private java.lang.String b;
    private java.lang.String c;
    private java.util.List<com.huawei.hms.hatool.f> d;

    public k(java.util.List<com.huawei.hms.hatool.f> r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.a = r2
            r0.b = r3
            r0.c = r4
            r0.d = r1
            return
    }

    private void a() {
            r3 = this;
            java.lang.String r0 = r3.a
            java.lang.String r1 = r3.c
            java.lang.String r2 = r3.b
            java.lang.String r0 = com.huawei.hms.hatool.q0.e(r0, r1, r2)
            android.content.Context r1 = com.huawei.hms.hatool.y0.q()
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.lang.String r2 = "backup_event"
            com.huawei.hms.hatool.l.d(r1, r2, r0)
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r7 = this;
            java.util.List<com.huawei.hms.hatool.f> r0 = r7.d
            java.lang.String r1 = "hmsSdk"
            if (r0 == 0) goto Lbb
            int r0 = r0.size()
            if (r0 != 0) goto Le
            goto Lbb
        Le:
            int r0 = com.huawei.hms.hatool.y0.s()
            android.content.Context r2 = com.huawei.hms.hatool.y0.q()
            r3 = 1048576(0x100000, float:1.469368E-39)
            int r0 = r0 * r3
            java.lang.String r4 = "cached_v2_1"
            boolean r0 = com.huawei.hms.hatool.h.c(r2, r4, r0)
            if (r0 == 0) goto L39
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "The cacheFile is full,Can not writing data! reqID:"
            r0.append(r2)
            java.lang.String r2 = r7.b
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.huawei.hms.hatool.j1.l(r1, r0)
            return
        L39:
            java.lang.String r0 = r7.a
            java.lang.String r2 = r7.c
            java.lang.String r0 = com.huawei.hms.hatool.q0.d(r0, r2)
            android.content.Context r2 = com.huawei.hms.hatool.y0.q()
            java.util.Map r2 = com.huawei.hms.hatool.i.f(r2, r4, r0)
            java.lang.Object r2 = r2.get(r0)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L5c
            int r5 = r2.size()
            if (r5 == 0) goto L5c
            java.util.List<com.huawei.hms.hatool.f> r5 = r7.d
            r5.addAll(r2)
        L5c:
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            java.util.List<com.huawei.hms.hatool.f> r5 = r7.d
            java.util.Iterator r5 = r5.iterator()
        L67:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L81
            java.lang.Object r6 = r5.next()
            com.huawei.hms.hatool.f r6 = (com.huawei.hms.hatool.f) r6
            org.json.JSONObject r6 = r6.h()     // Catch: org.json.JSONException -> L7b
            r2.put(r6)     // Catch: org.json.JSONException -> L7b
            goto L67
        L7b:
            java.lang.String r6 = "event to json error"
            com.huawei.hms.hatool.j1.l(r1, r6)
            goto L67
        L81:
            java.lang.String r2 = r2.toString()
            int r5 = com.huawei.hms.hatool.y0.o()
            int r6 = r2.length()
            int r5 = r5 * r3
            if (r6 <= r5) goto L9a
            java.lang.String r0 = "this failed data is too long,can not writing it"
            com.huawei.hms.hatool.j1.l(r1, r0)
            r0 = 0
            r7.d = r0
            return
        L9a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "data send failed, write to cache file...reqID:"
            r3.append(r5)
            java.lang.String r5 = r7.b
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            com.huawei.hms.hatool.j1.j(r1, r3)
            android.content.Context r1 = com.huawei.hms.hatool.y0.q()
            com.huawei.hms.hatool.l.g(r1, r4, r0, r2)
            r7.a()
            return
        Lbb:
            java.lang.String r0 = "failed events is empty"
            com.huawei.hms.hatool.j1.j(r1, r0)
            return
    }
}
