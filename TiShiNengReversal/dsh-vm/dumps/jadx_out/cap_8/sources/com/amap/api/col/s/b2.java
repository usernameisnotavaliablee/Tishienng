package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class b2 {
    public b2() {
            r1 = this;
            r1.<init>()
            return
    }

    private static java.lang.String a(java.lang.String r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "UTF-8"
            java.lang.String r2 = java.net.URLEncoder.encode(r2, r0)     // Catch: java.lang.Exception -> L23
            java.lang.String r0 = "+"
            java.lang.String r1 = "%20"
            java.lang.String r2 = r2.replace(r0, r1)     // Catch: java.lang.Exception -> L23
            java.lang.String r0 = "*"
            java.lang.String r1 = "%2A"
            java.lang.String r2 = r2.replace(r0, r1)     // Catch: java.lang.Exception -> L23
            java.lang.String r0 = "%7E"
            java.lang.String r1 = "~"
            java.lang.String r2 = r2.replace(r0, r1)     // Catch: java.lang.Exception -> L23
            return r2
        L23:
            java.lang.String r2 = ""
            return r2
    }

    public static java.lang.String b(java.lang.String r1, java.lang.String r2, java.lang.String r3) throws java.lang.Exception {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r1.toUpperCase()
            r0.append(r1)
            java.lang.String r1 = "&%2F&"
            r0.append(r1)
            java.lang.String r1 = a(r2)
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            java.lang.String r3 = "&"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            byte[] r1 = e(r2, r1)
            java.lang.String r1 = d(r1)
            java.lang.String r2 = "="
            java.lang.String r3 = "%3D"
            java.lang.String r1 = r1.replace(r2, r3)
            return r1
    }

    public static java.lang.String c(java.util.Map<java.lang.String, java.lang.String> r3, java.lang.String r4) {
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.lang.String r1 = "AccessKeyId"
            r0.put(r1, r4)
            java.lang.String r4 = "SignatureMethod"
            java.lang.String r1 = "HMAC-SHA1"
            r0.put(r4, r1)
            java.lang.String r4 = "SignatureVersion"
            java.lang.String r1 = "1.0"
            r0.put(r4, r1)
            java.util.UUID r4 = java.util.UUID.randomUUID()
            java.lang.String r4 = r4.toString()
            java.lang.String r1 = "SignatureNonce"
            r0.put(r1, r4)
            java.util.Date r4 = new java.util.Date
            r4.<init>()
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.lang.String r2 = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"
            r1.<init>(r2)
            java.lang.String r2 = "GMT"
            java.util.TimeZone r2 = java.util.TimeZone.getTimeZone(r2)
            r1.setTimeZone(r2)
            java.lang.String r4 = r1.format(r4)
            java.lang.String r1 = "Timestamp"
            r0.put(r1, r4)
            r0.putAll(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Set r4 = r0.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L53:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L87
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Object r2 = r0.getKey()
            java.lang.String r2 = (java.lang.String) r2
            r1.append(r2)
            java.lang.String r2 = "="
            r1.append(r2)
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = a(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r3.add(r0)
            goto L53
        L87:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = ""
            r4.<init>(r0)
            java.util.Iterator r3 = r3.iterator()
        L92:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto La7
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            r4.append(r0)
            java.lang.String r0 = "&"
            r4.append(r0)
            goto L92
        La7:
            java.lang.String r3 = r4.toString()
            int r4 = r3.length()
            int r4 = r4 + (-1)
            r0 = 0
            java.lang.String r3 = r3.substring(r0, r4)
            return r3
    }

    private static java.lang.String d(byte[] r1) {
            if (r1 == 0) goto Lc
            int r0 = r1.length
            if (r0 != 0) goto L6
            goto Lc
        L6:
            r0 = 0
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)
            return r1
        Lc:
            r1 = 0
            return r1
    }

    private static byte[] e(java.lang.String r3, java.lang.String r4) throws java.lang.Exception {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto Lf
            return r1
        Lf:
            java.lang.String r0 = "HmacSHA1"
            javax.crypto.Mac r0 = javax.crypto.Mac.getInstance(r0)
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r2 = "UTF-8"
            byte[] r3 = r3.getBytes(r2)
            r1.<init>(r3, r2)
            r0.init(r1)
            byte[] r3 = r4.getBytes(r2)
            byte[] r3 = r0.doFinal(r3)
            return r3
    }
}
