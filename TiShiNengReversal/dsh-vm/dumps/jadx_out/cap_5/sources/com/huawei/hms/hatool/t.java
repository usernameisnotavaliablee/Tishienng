package com.huawei.hms.hatool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class t {
    private static com.huawei.hms.hatool.t c;
    private android.content.Context a;
    private final java.lang.Object b;

    private t() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.b = r0
            return
    }

    public static com.huawei.hms.hatool.t a() {
            com.huawei.hms.hatool.t r0 = com.huawei.hms.hatool.t.c
            if (r0 != 0) goto L7
            g()
        L7:
            com.huawei.hms.hatool.t r0 = com.huawei.hms.hatool.t.c
            return r0
    }

    private org.json.JSONObject b(java.util.Map<java.lang.String, java.lang.String> r4) {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            if (r4 == 0) goto L30
            java.util.Set r4 = r4.entrySet()     // Catch: org.json.JSONException -> L29
            java.util.Iterator r4 = r4.iterator()     // Catch: org.json.JSONException -> L29
        Lf:
            boolean r1 = r4.hasNext()     // Catch: org.json.JSONException -> L29
            if (r1 == 0) goto L30
            java.lang.Object r1 = r4.next()     // Catch: org.json.JSONException -> L29
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: org.json.JSONException -> L29
            java.lang.Object r2 = r1.getKey()     // Catch: org.json.JSONException -> L29
            java.lang.String r2 = (java.lang.String) r2     // Catch: org.json.JSONException -> L29
            java.lang.Object r1 = r1.getValue()     // Catch: org.json.JSONException -> L29
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L29
            goto Lf
        L29:
            java.lang.String r4 = "hmsSdk"
            java.lang.String r1 = "Exception occured when transferring bundle to json"
            com.huawei.hms.hatool.j1.e(r4, r1)
        L30:
            return r0
    }

    private static synchronized void g() {
            java.lang.Class<com.huawei.hms.hatool.t> r0 = com.huawei.hms.hatool.t.class
            monitor-enter(r0)
            com.huawei.hms.hatool.t r1 = com.huawei.hms.hatool.t.c     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            com.huawei.hms.hatool.t r1 = new com.huawei.hms.hatool.t     // Catch: java.lang.Throwable -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Lf
            com.huawei.hms.hatool.t.c = r1     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r1 = move-exception
            goto L13
        L11:
            monitor-exit(r0)
            return
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    public void c(android.content.Context r3) {
            r2 = this;
            java.lang.Object r0 = r2.b
            monitor-enter(r0)
            android.content.Context r1 = r2.a     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto Lb
        L7:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r3 = move-exception
            goto L15
        Lb:
            r2.a = r3     // Catch: java.lang.Throwable -> L9
            com.huawei.hms.hatool.o r1 = com.huawei.hms.hatool.o.a()     // Catch: java.lang.Throwable -> L9
            r1.b(r3)     // Catch: java.lang.Throwable -> L9
            goto L7
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r3
    }

    public void d(java.lang.String r2, int r3) {
            r1 = this;
            com.huawei.hms.hatool.o r0 = com.huawei.hms.hatool.o.a()
            r0.c(r2, r3)
            return
    }

    public void e(java.lang.String r2, int r3, java.lang.String r4, java.util.LinkedHashMap<java.lang.String, java.lang.String> r5) {
            r1 = this;
            org.json.JSONObject r5 = r1.b(r5)
            com.huawei.hms.hatool.o r0 = com.huawei.hms.hatool.o.a()
            r0.d(r2, r3, r4, r5)
            return
    }

    public void f(java.lang.String r2, android.content.Context r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r0 = "_constants"
            r3.put(r0, r5)     // Catch: org.json.JSONException -> L13
            com.huawei.hms.hatool.o r5 = com.huawei.hms.hatool.o.a()
            r0 = 0
            r5.d(r2, r0, r4, r3)
            return
        L13:
            java.lang.String r2 = "hmsSdk"
            java.lang.String r3 = "onEvent():JSON structure Exception!"
            com.huawei.hms.hatool.j1.m(r2, r3)
            return
    }

    public void h(java.lang.String r8, int r9, java.lang.String r10, java.util.LinkedHashMap<java.lang.String, java.lang.String> r11) {
            r7 = this;
            org.json.JSONObject r4 = r7.b(r11)
            com.huawei.hms.hatool.o r0 = com.huawei.hms.hatool.o.a()
            long r5 = java.lang.System.currentTimeMillis()
            r1 = r8
            r2 = r9
            r3 = r10
            r0.e(r1, r2, r3, r4, r5)
            return
    }
}
