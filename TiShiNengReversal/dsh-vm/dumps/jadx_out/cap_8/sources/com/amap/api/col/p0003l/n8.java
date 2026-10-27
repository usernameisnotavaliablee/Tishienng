package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class n8 {
    public n8() {
            r1 = this;
            r1.<init>()
            return
    }

    public static boolean a(byte[] r5) {
            if (r5 == 0) goto L89
            com.amap.api.col.3l.q9 r0 = new com.amap.api.col.3l.q9     // Catch: java.lang.Exception -> L85
            r0.<init>()     // Catch: java.lang.Exception -> L85
            java.util.Map<java.lang.String, java.lang.String> r1 = r0.f3833b     // Catch: java.lang.Exception -> L85
            java.lang.String r2 = "Content-Type"
            java.lang.String r3 = "application/octet-stream"
            r1.put(r2, r3)     // Catch: java.lang.Exception -> L85
            java.util.Map<java.lang.String, java.lang.String> r1 = r0.f3833b     // Catch: java.lang.Exception -> L85
            java.lang.String r2 = "aps_c_src"
            java.lang.String r3 = com.amap.api.col.p0003l.q9.a()     // Catch: java.lang.Exception -> L85
            byte[] r3 = r3.getBytes()     // Catch: java.lang.Exception -> L85
            r4 = 2
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r4)     // Catch: java.lang.Exception -> L85
            r1.put(r2, r3)     // Catch: java.lang.Exception -> L85
            java.util.Map<java.lang.String, java.lang.String> r1 = r0.f3833b     // Catch: java.lang.Exception -> L85
            java.lang.String r2 = "aps_c_key"
            java.lang.String r3 = com.amap.api.col.p0003l.q9.b()     // Catch: java.lang.Exception -> L85
            byte[] r3 = r3.getBytes()     // Catch: java.lang.Exception -> L85
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r4)     // Catch: java.lang.Exception -> L85
            r1.put(r2, r3)     // Catch: java.lang.Exception -> L85
            r0.f3835d = r5     // Catch: java.lang.Exception -> L85
            boolean r5 = com.amap.api.col.p0003l.e8.a     // Catch: java.lang.Exception -> L85
            if (r5 == 0) goto L42
            java.lang.String r5 = "http://cgicol.amap.com/collection/collectData?src=baseCol&ver=v74&"
            r0.a = r5     // Catch: java.lang.Exception -> L85
            goto L5e
        L42:
            boolean r5 = com.amap.api.col.p0003l.e8.f3186b     // Catch: java.lang.Exception -> L85
            if (r5 == 0) goto L49
            java.lang.String r5 = "https://"
            goto L4b
        L49:
            java.lang.String r5 = "http://"
        L4b:
            java.lang.String r1 = "cgicol.amap.com/collection/collectData?src=baseCol&ver=v74&"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L85
            r2.<init>()     // Catch: java.lang.Exception -> L85
            r2.append(r5)     // Catch: java.lang.Exception -> L85
            r2.append(r1)     // Catch: java.lang.Exception -> L85
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Exception -> L85
            r0.a = r5     // Catch: java.lang.Exception -> L85
        L5e:
            com.amap.api.col.3l.t9 r5 = com.amap.api.col.p0003l.j9.c()     // Catch: java.lang.Exception -> L85
            com.amap.api.col.3l.s9 r5 = r5.a(r0)     // Catch: java.lang.Exception -> L85
            if (r5 == 0) goto L71
            int r0 = r5.a     // Catch: java.lang.Exception -> L85
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 != r1) goto L71
            byte[] r5 = r5.f3979c     // Catch: java.lang.Exception -> L85
            goto L72
        L71:
            r5 = 0
        L72:
            if (r5 == 0) goto L89
            java.lang.String r0 = "true"
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Exception -> L85
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Exception -> L85
            r1.<init>(r5, r2)     // Catch: java.lang.Exception -> L85
            boolean r5 = r0.equals(r1)     // Catch: java.lang.Exception -> L85
            if (r5 == 0) goto L89
            r5 = 1
            return r5
        L85:
            r5 = move-exception
            com.amap.api.col.p0003l.p9.a(r5)
        L89:
            r5 = 0
            return r5
    }
}
