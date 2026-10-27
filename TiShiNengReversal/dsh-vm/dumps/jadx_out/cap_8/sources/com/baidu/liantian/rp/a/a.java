package com.baidu.liantian.rp.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class a {
    public java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f5998b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f5999c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f6000d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f6001e;

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.baidu.liantian.rp.a.a a(java.lang.String r2) {
            com.baidu.liantian.rp.a.a r0 = new com.baidu.liantian.rp.a.a
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L33
            r1.<init>(r2)     // Catch: java.lang.Exception -> L33
            java.lang.String r2 = "0"
            java.lang.String r2 = r1.optString(r2)     // Catch: java.lang.Exception -> L33
            r0.a = r2     // Catch: java.lang.Exception -> L33
            java.lang.String r2 = "1"
            java.lang.String r2 = r1.optString(r2)     // Catch: java.lang.Exception -> L33
            r0.f5999c = r2     // Catch: java.lang.Exception -> L33
            java.lang.String r2 = "2"
            java.lang.String r2 = r1.optString(r2)     // Catch: java.lang.Exception -> L33
            r0.f6000d = r2     // Catch: java.lang.Exception -> L33
            java.lang.String r2 = "3"
            java.lang.String r2 = r1.optString(r2)     // Catch: java.lang.Exception -> L33
            r0.f6001e = r2     // Catch: java.lang.Exception -> L33
            java.lang.String r2 = "4"
            java.lang.String r2 = r1.optString(r2)     // Catch: java.lang.Exception -> L33
            r0.f5998b = r2     // Catch: java.lang.Exception -> L33
            return r0
        L33:
            com.baidu.liantian.b.e.a()
            r2 = 0
            return r2
    }

    public static java.lang.String a(com.baidu.liantian.rp.a.a r3) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "0"
            java.lang.String r2 = r3.a     // Catch: java.lang.Throwable -> L29
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = "1"
            java.lang.String r2 = r3.f5999c     // Catch: java.lang.Throwable -> L29
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = "2"
            java.lang.String r2 = r3.f6000d     // Catch: java.lang.Throwable -> L29
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = "3"
            java.lang.String r2 = r3.f6001e     // Catch: java.lang.Throwable -> L29
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = "4"
            java.lang.String r3 = r3.f5998b     // Catch: java.lang.Throwable -> L29
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L29
            goto L2c
        L29:
            com.baidu.liantian.b.e.a()
        L2c:
            java.lang.String r3 = r0.toString()
            return r3
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 != 0) goto L8
            return r1
        L8:
            java.lang.Class<com.baidu.liantian.rp.a.a> r2 = com.baidu.liantian.rp.a.a.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L11
            return r1
        L11:
            com.baidu.liantian.rp.a.a r5 = (com.baidu.liantian.rp.a.a) r5
            java.lang.String r2 = r4.f6000d
            if (r2 != 0) goto L1c
            java.lang.String r2 = r5.f6000d
            if (r2 == 0) goto L25
            return r1
        L1c:
            java.lang.String r3 = r5.f6000d
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L25
            return r1
        L25:
            java.lang.String r2 = r4.f6001e
            if (r2 != 0) goto L2e
            java.lang.String r2 = r5.f6001e
            if (r2 == 0) goto L37
            return r1
        L2e:
            java.lang.String r3 = r5.f6001e
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L37
            return r1
        L37:
            java.lang.String r2 = r4.f5998b
            if (r2 != 0) goto L40
            java.lang.String r5 = r5.f5998b
            if (r5 == 0) goto L49
            return r1
        L40:
            java.lang.String r5 = r5.f5998b
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L49
            return r1
        L49:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f6000d
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            int r0 = r0 + 31
            int r0 = r0 * 31
            java.lang.String r2 = r3.f6001e
            if (r2 != 0) goto L15
            r2 = 0
            goto L19
        L15:
            int r2 = r2.hashCode()
        L19:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.String r2 = r3.f5998b
            if (r2 != 0) goto L21
            goto L25
        L21:
            int r1 = r2.hashCode()
        L25:
            int r0 = r0 + r1
            return r0
    }
}
