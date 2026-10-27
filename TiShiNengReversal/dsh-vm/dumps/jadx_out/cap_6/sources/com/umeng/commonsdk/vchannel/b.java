package com.umeng.commonsdk.vchannel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b {
    private java.lang.String a;
    private java.lang.String b;
    private long c;
    private long d;
    private java.lang.String e;
    private java.util.Map<java.lang.String, java.lang.Object> f;

    public b(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "_$unknown"
            r2.a = r0
            r0 = 0
            r2.c = r0
            r2.d = r0
            java.lang.String r0 = com.umeng.commonsdk.vchannel.a.j
            r2.e = r0
            com.umeng.commonsdk.service.UMGlobalContext r0 = com.umeng.commonsdk.service.UMGlobalContext.getInstance(r3)
            java.lang.String r3 = r0.getProcessName(r3)
            r2.b = r3
            r3 = 0
            r2.f = r3
            return
    }

    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public void a(long r1) {
            r0 = this;
            r0.c = r1
            return
    }

    public void a(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void a(java.util.Map<java.lang.String, java.lang.Object> r1) {
            r0 = this;
            r0.f = r1
            return
    }

    public long b() {
            r2 = this;
            long r0 = r2.c
            return r0
    }

    public java.util.Map<java.lang.String, java.lang.Object> c() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.f
            return r0
    }

    public org.json.JSONObject d() {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L70
            r0.<init>()     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = "id"
            java.lang.String r2 = r4.a     // Catch: java.lang.Throwable -> L70
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = "pn"
            java.lang.String r2 = r4.b     // Catch: java.lang.Throwable -> L70
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = "ds"
            long r2 = r4.d     // Catch: java.lang.Throwable -> L70
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = "ts"
            long r2 = r4.c     // Catch: java.lang.Throwable -> L70
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L70
            java.util.Map<java.lang.String, java.lang.Object> r1 = r4.f     // Catch: java.lang.Throwable -> L70
            if (r1 == 0) goto L4b
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L70
            if (r1 <= 0) goto L4b
            java.util.Map<java.lang.String, java.lang.Object> r1 = r4.f     // Catch: java.lang.Throwable -> L70
            java.util.Set r1 = r1.keySet()     // Catch: java.lang.Throwable -> L70
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L70
        L35:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L70
            if (r2 == 0) goto L4b
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L70
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L70
            java.util.Map<java.lang.String, java.lang.Object> r3 = r4.f     // Catch: java.lang.Throwable -> L70
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L70
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L70
            goto L35
        L4b:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L70
            r1.<init>()     // Catch: java.lang.Throwable -> L70
            r1.put(r0)     // Catch: java.lang.Throwable -> L70
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L70
            r0.<init>()     // Catch: java.lang.Throwable -> L70
            java.lang.String r2 = r4.e     // Catch: java.lang.Throwable -> L70
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> L70
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L70
            r1.<init>()     // Catch: java.lang.Throwable -> L70
            r1.put(r0)     // Catch: java.lang.Throwable -> L70
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L70
            r0.<init>()     // Catch: java.lang.Throwable -> L70
            java.lang.String r2 = "ekv"
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> L70
            return r0
        L70:
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "id:"
            r1.append(r2)
            java.lang.String r2 = r6.a
            r1.append(r2)
            java.lang.String r2 = ","
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "pn:"
            r1.append(r3)
            java.lang.String r3 = r6.b
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "ts:"
            r1.append(r3)
            long r3 = r6.c
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r6.f
            if (r1 == 0) goto Lad
            int r1 = r1.size()
            if (r1 <= 0) goto Lad
            java.util.Map<java.lang.String, java.lang.Object> r1 = r6.f
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L68:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lad
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            java.util.Map<java.lang.String, java.lang.Object> r4 = r6.f
            java.lang.Object r4 = r4.get(r3)
            if (r4 != 0) goto L8e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = ": null,"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            goto La9
        L8e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r3 = ": "
            r5.append(r3)
            java.lang.String r3 = r4.toString()
            r5.append(r3)
            r5.append(r2)
            java.lang.String r3 = r5.toString()
        La9:
            r0.append(r3)
            goto L68
        Lad:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ds:"
            r1.append(r2)
            long r2 = r6.d
            r1.append(r2)
            java.lang.String r2 = "]"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
