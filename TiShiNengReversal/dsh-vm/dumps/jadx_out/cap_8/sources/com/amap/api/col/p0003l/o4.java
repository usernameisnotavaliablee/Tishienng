package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class o4 {
    public o4() {
            r1 = this;
            r1.<init>()
            return
    }

    private static java.lang.String a() {
            java.lang.String r0 = android.net.Proxy.getDefaultHost()     // Catch: java.lang.Throwable -> L5
            goto Le
        L5:
            r0 = move-exception
            java.lang.String r1 = "pu"
            java.lang.String r2 = "gdh"
            com.amap.api.col.p0003l.w5.p(r0, r1, r2)
            r0 = 0
        Le:
            if (r0 != 0) goto L12
            java.lang.String r0 = "null"
        L12:
            return r0
    }

    private static java.lang.String b(java.lang.String r0) {
            java.lang.String r0 = com.amap.api.col.p0003l.q4.u(r0)
            return r0
    }

    public static java.net.Proxy c(android.content.Context r2) {
            java.net.URI r0 = new java.net.URI     // Catch: java.lang.Throwable -> Lc
            java.lang.String r1 = "http://restsdk.amap.com"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc
            java.net.Proxy r2 = d(r2, r0)     // Catch: java.lang.Throwable -> Lc
            return r2
        Lc:
            r2 = move-exception
            java.lang.String r0 = "pu"
            java.lang.String r1 = "gp"
            com.amap.api.col.p0003l.w5.p(r2, r0, r1)
            r2 = 0
            return r2
    }

    private static java.net.Proxy d(android.content.Context r2, java.net.URI r3) {
            boolean r2 = g(r2)
            r0 = 0
            if (r2 == 0) goto L34
            java.net.ProxySelector r2 = java.net.ProxySelector.getDefault()     // Catch: java.lang.Throwable -> L2a
            java.util.List r2 = r2.select(r3)     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L2c
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L2a
            if (r3 != 0) goto L2c
            r3 = 0
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L2a
            java.net.Proxy r2 = (java.net.Proxy) r2     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L2c
            java.net.Proxy$Type r3 = r2.type()     // Catch: java.lang.Throwable -> L2a
            java.net.Proxy$Type r1 = java.net.Proxy.Type.DIRECT     // Catch: java.lang.Throwable -> L2a
            if (r3 != r1) goto L29
            goto L2c
        L29:
            return r2
        L2a:
            r2 = move-exception
            goto L2d
        L2c:
            return r0
        L2d:
            java.lang.String r3 = "pu"
            java.lang.String r1 = "gpsc"
            com.amap.api.col.p0003l.w5.p(r2, r3, r1)
        L34:
            return r0
    }

    private static int e() {
            int r0 = android.net.Proxy.getDefaultPort()     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = move-exception
            java.lang.String r1 = "pu"
            java.lang.String r2 = "gdp"
            com.amap.api.col.p0003l.w5.p(r0, r1, r2)
            r0 = -1
            return r0
    }

    private static java.net.Proxy f(android.content.Context r20) {
            java.lang.String r1 = "QMTAuMC4wLjE3Mg=="
            java.lang.String r2 = "wap"
            java.lang.String r3 = "QMTAuMC4wLjIwMA=="
            java.lang.String r4 = "ctwap"
            java.lang.String r5 = "gPx2"
            java.lang.String r6 = "null"
            java.lang.String r7 = "pu"
            boolean r0 = g(r20)
            if (r0 == 0) goto L179
            java.lang.String r0 = "content://telephony/carriers/preferapn"
            android.net.Uri r10 = android.net.Uri.parse(r0)
            android.content.ContentResolver r9 = r20.getContentResolver()
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 80
            r17 = 1
            r11 = -1
            r12 = -1
            r11 = 0
            r18 = -1
            r12 = 0
            r8 = -1
            r19 = 0
            android.database.Cursor r9 = r9.query(r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> Ld5 java.lang.SecurityException -> Lf1
            if (r9 == 0) goto Lc3
            boolean r0 = r9.moveToFirst()     // Catch: java.lang.Throwable -> L4d java.lang.SecurityException -> L53
            if (r0 == 0) goto Lc3
            java.lang.String r0 = "apn"
            int r0 = r9.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L4d java.lang.SecurityException -> L53
            java.lang.String r0 = r9.getString(r0)     // Catch: java.lang.Throwable -> L4d java.lang.SecurityException -> L53
            if (r0 == 0) goto L59
            java.util.Locale r10 = java.util.Locale.US     // Catch: java.lang.Throwable -> L4d java.lang.SecurityException -> L53
            java.lang.String r0 = r0.toLowerCase(r10)     // Catch: java.lang.Throwable -> L4d java.lang.SecurityException -> L53
            goto L59
        L4d:
            r0 = move-exception
            r10 = r19
        L50:
            r11 = -1
            goto Ldb
        L53:
            r0 = move-exception
            r10 = r19
        L56:
            r11 = -1
            goto Lf7
        L59:
            if (r0 == 0) goto L94
            boolean r10 = r0.contains(r4)     // Catch: java.lang.Throwable -> L4d java.lang.SecurityException -> L53
            if (r10 == 0) goto L94
            java.lang.String r0 = a()     // Catch: java.lang.Throwable -> L4d java.lang.SecurityException -> L53
            int r11 = e()     // Catch: java.lang.Throwable -> L4d java.lang.SecurityException -> L53
            boolean r10 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L78 java.lang.SecurityException -> L7d
            if (r10 != 0) goto L82
            boolean r10 = r0.equals(r6)     // Catch: java.lang.Throwable -> L78 java.lang.SecurityException -> L7d
            if (r10 != 0) goto L82
            r10 = r0
            r0 = 1
            goto L85
        L78:
            r0 = move-exception
            r10 = r19
            goto Ldb
        L7d:
            r0 = move-exception
            r10 = r19
            goto Lf7
        L82:
            r10 = r19
            r0 = 0
        L85:
            if (r0 != 0) goto L91
            java.lang.String r10 = b(r3)     // Catch: java.lang.Throwable -> L8c java.lang.SecurityException -> L8e
            goto L91
        L8c:
            r0 = move-exception
            goto Ldb
        L8e:
            r0 = move-exception
            goto Lf7
        L91:
            if (r11 != r8) goto Lc0
            goto Lc7
        L94:
            if (r0 == 0) goto Lc3
            boolean r0 = r0.contains(r2)     // Catch: java.lang.Throwable -> L4d java.lang.SecurityException -> L53
            if (r0 == 0) goto Lc3
            java.lang.String r0 = a()     // Catch: java.lang.Throwable -> L4d java.lang.SecurityException -> L53
            int r11 = e()     // Catch: java.lang.Throwable -> L4d java.lang.SecurityException -> L53
            boolean r10 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L78 java.lang.SecurityException -> L7d
            if (r10 != 0) goto Lb3
            boolean r10 = r0.equals(r6)     // Catch: java.lang.Throwable -> L78 java.lang.SecurityException -> L7d
            if (r10 != 0) goto Lb3
            r10 = r0
            r0 = 1
            goto Lb6
        Lb3:
            r10 = r19
            r0 = 0
        Lb6:
            if (r0 != 0) goto Lbd
            java.lang.String r0 = b(r1)     // Catch: java.lang.Throwable -> L8c java.lang.SecurityException -> L8e
            r10 = r0
        Lbd:
            if (r11 != r8) goto Lc0
            goto Lc7
        Lc0:
            r16 = r11
            goto Lc7
        Lc3:
            r10 = r19
            r16 = -1
        Lc7:
            if (r9 == 0) goto Ld1
        Lc9:
            r9.close()     // Catch: java.lang.Throwable -> Lcd
            goto Ld1
        Lcd:
            r0 = move-exception
            com.amap.api.col.p0003l.w5.p(r0, r7, r5)
        Ld1:
            r11 = r16
            goto L151
        Ld5:
            r0 = move-exception
            r9 = r19
            r10 = r9
            goto L50
        Ldb:
            java.lang.String r1 = "gPx1"
            com.amap.api.col.p0003l.w5.p(r0, r7, r1)     // Catch: java.lang.Throwable -> Led
            if (r9 == 0) goto L151
            r9.close()     // Catch: java.lang.Throwable -> Le7
            goto L151
        Le7:
            r0 = move-exception
            com.amap.api.col.p0003l.w5.p(r0, r7, r5)
            goto L151
        Led:
            r0 = move-exception
            r1 = r0
            goto L16e
        Lf1:
            r0 = move-exception
            r9 = r19
            r10 = r9
            goto L56
        Lf7:
            java.lang.String r12 = "ghp"
            com.amap.api.col.p0003l.w5.p(r0, r7, r12)     // Catch: java.lang.Throwable -> Led
            java.lang.String r0 = com.amap.api.col.p0003l.i4.Q(r20)     // Catch: java.lang.Throwable -> Led
            if (r0 == 0) goto L14b
            java.util.Locale r11 = java.util.Locale.US     // Catch: java.lang.Throwable -> Led
            java.lang.String r0 = r0.toLowerCase(r11)     // Catch: java.lang.Throwable -> Led
            java.lang.String r11 = a()     // Catch: java.lang.Throwable -> Led
            int r12 = e()     // Catch: java.lang.Throwable -> Led
            int r4 = r0.indexOf(r4)     // Catch: java.lang.Throwable -> Led
            if (r4 == r8) goto L130
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> Led
            if (r0 != 0) goto L124
            boolean r0 = r11.equals(r6)     // Catch: java.lang.Throwable -> Led
            if (r0 != 0) goto L124
            r10 = r11
            r15 = 1
        L124:
            if (r15 != 0) goto L12a
            java.lang.String r10 = b(r3)     // Catch: java.lang.Throwable -> Led
        L12a:
            if (r12 != r8) goto L12d
            goto L14d
        L12d:
            r16 = r12
            goto L14d
        L130:
            int r0 = r0.indexOf(r2)     // Catch: java.lang.Throwable -> Led
            if (r0 == r8) goto L12d
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> Led
            if (r0 != 0) goto L144
            boolean r0 = r11.equals(r6)     // Catch: java.lang.Throwable -> Led
            if (r0 != 0) goto L144
            r10 = r11
            r15 = 1
        L144:
            if (r15 != 0) goto L14d
            java.lang.String r10 = b(r1)     // Catch: java.lang.Throwable -> Led
            goto L14d
        L14b:
            r16 = r11
        L14d:
            if (r9 == 0) goto Ld1
            goto Lc9
        L151:
            if (r10 == 0) goto L17b
            int r0 = r10.length()     // Catch: java.lang.Throwable -> L167
            if (r0 <= 0) goto L17b
            if (r11 == r8) goto L17b
            java.net.Proxy r0 = new java.net.Proxy     // Catch: java.lang.Throwable -> L167
            java.net.Proxy$Type r1 = java.net.Proxy.Type.HTTP     // Catch: java.lang.Throwable -> L167
            java.net.InetSocketAddress r2 = java.net.InetSocketAddress.createUnresolved(r10, r11)     // Catch: java.lang.Throwable -> L167
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L167
            return r0
        L167:
            r0 = move-exception
            java.lang.String r1 = "gp2"
            com.amap.api.col.p0003l.r5.e(r0, r7, r1)
            goto L17b
        L16e:
            if (r9 == 0) goto L178
            r9.close()     // Catch: java.lang.Throwable -> L174
            goto L178
        L174:
            r0 = move-exception
            com.amap.api.col.p0003l.w5.p(r0, r7, r5)
        L178:
            throw r1
        L179:
            r19 = 0
        L17b:
            return r19
    }

    private static boolean g(android.content.Context r0) {
            int r0 = com.amap.api.col.p0003l.i4.M(r0)
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }
}
