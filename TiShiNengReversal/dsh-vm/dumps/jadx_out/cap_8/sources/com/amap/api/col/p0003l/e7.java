package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class e7 {
    public e7() {
            r1 = this;
            r1.<init>()
            return
    }

    public static int a(com.amap.api.col.p0003l.d7 r10) {
            java.lang.String r0 = "code"
            r1 = -1
            r2 = 0
            com.amap.api.col.3l.y7 r3 = r10.f3151f     // Catch: java.lang.Throwable -> L7d
            boolean r3 = r3.e()     // Catch: java.lang.Throwable -> L7d
            if (r3 == 0) goto L85
            com.amap.api.col.3l.y7 r3 = r10.f3151f     // Catch: java.lang.Throwable -> L7d
            r4 = 1
            r3.c(r4)     // Catch: java.lang.Throwable -> L7d
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L7d
            java.lang.String r5 = r10.a     // Catch: java.lang.Throwable -> L7d
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L7d
            long r5 = r10.f3147b     // Catch: java.lang.Throwable -> L7d
            com.amap.api.col.3l.p6 r3 = com.amap.api.col.p0003l.p6.b(r3, r5)     // Catch: java.lang.Throwable -> L7d
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5d
            r5.<init>()     // Catch: java.lang.Throwable -> L5d
            byte[] r6 = e(r3, r10, r5)     // Catch: java.lang.Throwable -> L5d
            if (r6 == 0) goto L81
            int r7 = r6.length     // Catch: java.lang.Throwable -> L5d
            if (r7 != 0) goto L2e
            goto L81
        L2e:
            com.amap.api.col.3l.t5 r7 = new com.amap.api.col.3l.t5     // Catch: java.lang.Throwable -> L5d
            java.lang.String r8 = r10.f3148c     // Catch: java.lang.Throwable -> L5d
            r7.<init>(r6, r8)     // Catch: java.lang.Throwable -> L5d
            com.amap.api.col.p0003l.s6.b()     // Catch: java.lang.Throwable -> L5d
            com.amap.api.col.3l.a7 r7 = com.amap.api.col.p0003l.s6.d(r7)     // Catch: java.lang.Throwable -> L5d
            byte[] r7 = r7.a     // Catch: java.lang.Throwable -> L5d
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5d
            java.lang.String r9 = new java.lang.String     // Catch: java.lang.Throwable -> L5d
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L5d
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L5d
            boolean r7 = r8.has(r0)     // Catch: java.lang.Throwable -> L5d
            if (r7 == 0) goto L7f
            int r0 = r8.getInt(r0)     // Catch: java.lang.Throwable -> L5d
            if (r0 != r4) goto L7f
            com.amap.api.col.3l.y7 r0 = r10.f3151f     // Catch: java.lang.Throwable -> L5d
            if (r0 == 0) goto L60
            int r4 = r6.length     // Catch: java.lang.Throwable -> L5d
            r0.b(r4)     // Catch: java.lang.Throwable -> L5d
            goto L60
        L5d:
            r10 = move-exception
            r2 = r3
            goto L8b
        L60:
            com.amap.api.col.3l.y7 r10 = r10.f3151f     // Catch: java.lang.Throwable -> L5d
            int r10 = r10.a()     // Catch: java.lang.Throwable -> L5d
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r10 >= r0) goto L6f
            b(r3, r5)     // Catch: java.lang.Throwable -> L5d
            goto L7b
        L6f:
            r3.s()     // Catch: java.lang.Throwable -> L73
            goto L7b
        L73:
            r10 = move-exception
            java.lang.String r0 = "ofm"
            java.lang.String r4 = "dlo"
            com.amap.api.col.p0003l.w5.p(r10, r0, r4)     // Catch: java.lang.Throwable -> L5d
        L7b:
            int r10 = r6.length     // Catch: java.lang.Throwable -> L7d
            return r10
        L7d:
            r10 = move-exception
            goto L8b
        L7f:
            r2 = r3
            goto L85
        L81:
            r3.close()     // Catch: java.lang.Throwable -> L84
        L84:
            return r1
        L85:
            if (r2 == 0) goto L95
        L87:
            r2.close()     // Catch: java.lang.Throwable -> L95
            goto L95
        L8b:
            java.lang.String r0 = "leg"
            java.lang.String r3 = "uts"
            com.amap.api.col.p0003l.w5.p(r10, r0, r3)     // Catch: java.lang.Throwable -> L96
            if (r2 == 0) goto L95
            goto L87
        L95:
            return r1
        L96:
            r10 = move-exception
            if (r2 == 0) goto L9c
            r2.close()     // Catch: java.lang.Throwable -> L9c
        L9c:
            throw r10
    }

    private static void b(com.amap.api.col.p0003l.p6 r1, java.util.List<java.lang.String> r2) {
            if (r1 == 0) goto L22
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L1a
        L6:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L16
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L1a
            r1.q(r0)     // Catch: java.lang.Throwable -> L1a
            goto L6
        L16:
            r1.close()     // Catch: java.lang.Throwable -> L1a
            return
        L1a:
            r1 = move-exception
            java.lang.String r2 = "ofm"
            java.lang.String r0 = "dlo"
            com.amap.api.col.p0003l.w5.p(r1, r2, r0)
        L22:
            return
    }

    public static void c(java.lang.String r4, byte[] r5, com.amap.api.col.p0003l.d7 r6) throws java.io.IOException, java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException, javax.crypto.NoSuchPaddingException, java.security.InvalidKeyException, java.security.spec.InvalidKeySpecException {
            r0 = 0
            java.lang.String r1 = r6.a     // Catch: java.lang.Throwable -> L1b
            boolean r1 = d(r1, r4)     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto La
            goto L46
        La:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L1b
            java.lang.String r2 = r6.a     // Catch: java.lang.Throwable -> L1b
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1b
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> L1b
            if (r2 != 0) goto L1e
            r1.mkdirs()     // Catch: java.lang.Throwable -> L1b
            goto L1e
        L1b:
            r4 = move-exception
            r1 = r0
            goto L48
        L1e:
            long r2 = r6.f3147b     // Catch: java.lang.Throwable -> L1b
            com.amap.api.col.3l.p6 r1 = com.amap.api.col.p0003l.p6.b(r1, r2)     // Catch: java.lang.Throwable -> L1b
            int r2 = r6.f3149d     // Catch: java.lang.Throwable -> L47
            r1.e(r2)     // Catch: java.lang.Throwable -> L47
            com.amap.api.col.3l.l6 r6 = r6.f3150e     // Catch: java.lang.Throwable -> L47
            byte[] r5 = r6.b(r5)     // Catch: java.lang.Throwable -> L47
            com.amap.api.col.3l.p6$d r4 = r1.k(r4)     // Catch: java.lang.Throwable -> L47
            java.io.OutputStream r0 = r4.b()     // Catch: java.lang.Throwable -> L47
            r0.write(r5)     // Catch: java.lang.Throwable -> L47
            r4.c()     // Catch: java.lang.Throwable -> L47
            r1.o()     // Catch: java.lang.Throwable -> L47
            r0.close()     // Catch: java.lang.Throwable -> L43
        L43:
            r1.close()     // Catch: java.lang.Throwable -> L46
        L46:
            return
        L47:
            r4 = move-exception
        L48:
            if (r0 == 0) goto L4f
            r0.close()     // Catch: java.lang.Throwable -> L4e
            goto L4f
        L4e:
        L4f:
            if (r1 == 0) goto L54
            r1.close()     // Catch: java.lang.Throwable -> L54
        L54:
            throw r4
    }

    private static boolean d(java.lang.String r2, java.lang.String r3) {
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L1b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b
            r1.<init>()     // Catch: java.lang.Throwable -> L1b
            r1.append(r3)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r3 = ".0"
            r1.append(r3)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L1b
            r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> L1b
            boolean r2 = r0.exists()     // Catch: java.lang.Throwable -> L1b
            return r2
        L1b:
            r2 = move-exception
            java.lang.String r3 = "leg"
            java.lang.String r0 = "fet"
            com.amap.api.col.p0003l.w5.p(r2, r3, r0)
            r2 = 0
            return r2
    }

    private static byte[] e(com.amap.api.col.p0003l.p6 r8, com.amap.api.col.p0003l.d7 r9, java.util.List<java.lang.String> r10) {
            r0 = 0
            java.io.File r1 = r8.l()     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L56
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L56
            java.lang.String[] r1 = r1.list()     // Catch: java.lang.Throwable -> L3f
            int r2 = r1.length     // Catch: java.lang.Throwable -> L3f
            r3 = 0
            r4 = 0
        L14:
            if (r3 >= r2) goto L44
            r5 = r1[r3]     // Catch: java.lang.Throwable -> L3f
            java.lang.String r6 = ".0"
            boolean r6 = r5.contains(r6)     // Catch: java.lang.Throwable -> L3f
            if (r6 == 0) goto L41
            java.lang.String r6 = "\\."
            java.lang.String[] r5 = r5.split(r6)     // Catch: java.lang.Throwable -> L3f
            r5 = r5[r0]     // Catch: java.lang.Throwable -> L3f
            byte[] r6 = com.amap.api.col.p0003l.k7.g(r8, r5)     // Catch: java.lang.Throwable -> L3f
            int r7 = r6.length     // Catch: java.lang.Throwable -> L3f
            int r4 = r4 + r7
            r10.add(r5)     // Catch: java.lang.Throwable -> L3f
            com.amap.api.col.3l.y7 r5 = r9.f3151f     // Catch: java.lang.Throwable -> L3f
            int r5 = r5.a()     // Catch: java.lang.Throwable -> L3f
            if (r4 > r5) goto L44
            com.amap.api.col.3l.r7 r5 = r9.f3152g     // Catch: java.lang.Throwable -> L3f
            r5.c(r6)     // Catch: java.lang.Throwable -> L3f
            goto L41
        L3f:
            r8 = move-exception
            goto L4f
        L41:
            int r3 = r3 + 1
            goto L14
        L44:
            if (r4 > 0) goto L48
            r8 = 0
            return r8
        L48:
            com.amap.api.col.3l.r7 r8 = r9.f3152g     // Catch: java.lang.Throwable -> L3f
            byte[] r8 = r8.a()     // Catch: java.lang.Throwable -> L3f
            return r8
        L4f:
            java.lang.String r9 = "leg"
            java.lang.String r10 = "gCo"
            com.amap.api.col.p0003l.w5.p(r8, r9, r10)
        L56:
            byte[] r8 = new byte[r0]
            return r8
    }
}
