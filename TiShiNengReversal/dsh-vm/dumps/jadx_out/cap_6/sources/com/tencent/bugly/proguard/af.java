package com.tencent.bugly.proguard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class af {
    static com.tencent.bugly.proguard.af a;
    protected android.content.Context b;
    public java.util.Map<java.lang.String, java.lang.String> c;

    af(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.c = r0
            r1.b = r2
            return
    }

    private static java.net.HttpURLConnection a(java.lang.String r2, java.lang.String r3) {
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> L67
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L67
            java.net.Proxy r3 = com.tencent.bugly.proguard.an.a     // Catch: java.lang.Throwable -> L67
            if (r3 == 0) goto L10
            java.net.URLConnection r2 = r0.openConnection(r3)     // Catch: java.lang.Throwable -> L67
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch: java.lang.Throwable -> L67
            goto L49
        L10:
            if (r2 == 0) goto L43
            java.util.Locale r3 = java.util.Locale.US     // Catch: java.lang.Throwable -> L67
            java.lang.String r2 = r2.toLowerCase(r3)     // Catch: java.lang.Throwable -> L67
            java.lang.String r3 = "wap"
            boolean r2 = r2.contains(r3)     // Catch: java.lang.Throwable -> L67
            if (r2 == 0) goto L43
            java.lang.String r2 = "http.proxyHost"
            java.lang.String r2 = java.lang.System.getProperty(r2)     // Catch: java.lang.Throwable -> L67
            java.lang.String r3 = "http.proxyPort"
            java.lang.String r3 = java.lang.System.getProperty(r3)     // Catch: java.lang.Throwable -> L67
            java.net.InetSocketAddress r1 = new java.net.InetSocketAddress     // Catch: java.lang.Throwable -> L67
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Throwable -> L67
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L67
            java.net.Proxy r2 = new java.net.Proxy     // Catch: java.lang.Throwable -> L67
            java.net.Proxy$Type r3 = java.net.Proxy.Type.HTTP     // Catch: java.lang.Throwable -> L67
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L67
            java.net.URLConnection r2 = r0.openConnection(r2)     // Catch: java.lang.Throwable -> L67
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch: java.lang.Throwable -> L67
            goto L49
        L43:
            java.net.URLConnection r2 = r0.openConnection()     // Catch: java.lang.Throwable -> L67
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch: java.lang.Throwable -> L67
        L49:
            r3 = 30000(0x7530, float:4.2039E-41)
            r2.setConnectTimeout(r3)     // Catch: java.lang.Throwable -> L67
            r3 = 10000(0x2710, float:1.4013E-41)
            r2.setReadTimeout(r3)     // Catch: java.lang.Throwable -> L67
            r3 = 1
            r2.setDoOutput(r3)     // Catch: java.lang.Throwable -> L67
            r2.setDoInput(r3)     // Catch: java.lang.Throwable -> L67
            java.lang.String r3 = "POST"
            r2.setRequestMethod(r3)     // Catch: java.lang.Throwable -> L67
            r3 = 0
            r2.setUseCaches(r3)     // Catch: java.lang.Throwable -> L67
            r2.setInstanceFollowRedirects(r3)     // Catch: java.lang.Throwable -> L67
            return r2
        L67:
            r2 = move-exception
            com.tencent.bugly.proguard.al.a(r2)
            r2 = 0
            return r2
    }

    private static java.net.HttpURLConnection a(java.lang.String r5, byte[] r6, java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8) {
            r0 = 0
            r1 = 0
            if (r5 != 0) goto Lc
            java.lang.String r5 = "destUrl is null."
            java.lang.Object[] r6 = new java.lang.Object[r1]
            com.tencent.bugly.proguard.al.e(r5, r6)
            return r0
        Lc:
            java.net.HttpURLConnection r5 = a(r7, r5)
            if (r5 != 0) goto L1a
            java.lang.String r5 = "Failed to get HttpURLConnection object."
            java.lang.Object[] r6 = new java.lang.Object[r1]
            com.tencent.bugly.proguard.al.e(r5, r6)
            return r0
        L1a:
            java.lang.String r2 = "wup_version"
            java.lang.String r3 = "3.0"
            r5.setRequestProperty(r2, r3)     // Catch: java.lang.Throwable -> L53
            java.lang.String r2 = "utf-8"
            if (r8 == 0) goto L55
            int r3 = r8.size()     // Catch: java.lang.Throwable -> L53
            if (r3 <= 0) goto L55
            java.util.Set r8 = r8.entrySet()     // Catch: java.lang.Throwable -> L53
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L53
        L33:
            boolean r3 = r8.hasNext()     // Catch: java.lang.Throwable -> L53
            if (r3 == 0) goto L55
            java.lang.Object r3 = r8.next()     // Catch: java.lang.Throwable -> L53
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L53
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> L53
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L53
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L53
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L53
            java.lang.String r3 = java.net.URLEncoder.encode(r3, r2)     // Catch: java.lang.Throwable -> L53
            r5.setRequestProperty(r4, r3)     // Catch: java.lang.Throwable -> L53
            goto L33
        L53:
            r5 = move-exception
            goto L75
        L55:
            java.lang.String r8 = "A37"
            java.lang.String r3 = java.net.URLEncoder.encode(r7, r2)     // Catch: java.lang.Throwable -> L53
            r5.setRequestProperty(r8, r3)     // Catch: java.lang.Throwable -> L53
            java.lang.String r8 = "A38"
            java.lang.String r7 = java.net.URLEncoder.encode(r7, r2)     // Catch: java.lang.Throwable -> L53
            r5.setRequestProperty(r8, r7)     // Catch: java.lang.Throwable -> L53
            java.io.OutputStream r7 = r5.getOutputStream()     // Catch: java.lang.Throwable -> L53
            if (r6 != 0) goto L71
            r7.write(r1)     // Catch: java.lang.Throwable -> L53
            return r5
        L71:
            r7.write(r6)     // Catch: java.lang.Throwable -> L53
            return r5
        L75:
            com.tencent.bugly.proguard.al.a(r5)
            java.lang.String r5 = "Failed to upload, please check your network."
            java.lang.Object[] r6 = new java.lang.Object[r1]
            com.tencent.bugly.proguard.al.e(r5, r6)
            return r0
    }

    private static java.util.Map<java.lang.String, java.lang.String> a(java.net.HttpURLConnection r5) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r5 = r5.getHeaderFields()
            if (r5 == 0) goto L3c
            int r1 = r5.size()
            if (r1 != 0) goto L12
            goto L3c
        L12:
            java.util.Set r1 = r5.keySet()
            java.util.Iterator r1 = r1.iterator()
        L1a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r5.get(r2)
            java.util.List r3 = (java.util.List) r3
            int r4 = r3.size()
            if (r4 <= 0) goto L1a
            r4 = 0
            java.lang.Object r3 = r3.get(r4)
            r0.put(r2, r3)
            goto L1a
        L3b:
            return r0
        L3c:
            r5 = 0
            return r5
    }

    private static byte[] b(java.net.HttpURLConnection r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L2e
            java.io.InputStream r5 = r5.getInputStream()     // Catch: java.lang.Throwable -> L2e
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L2e
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L21
            r5.<init>()     // Catch: java.lang.Throwable -> L21
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L21
        L16:
            int r3 = r1.read(r2)     // Catch: java.lang.Throwable -> L21
            if (r3 <= 0) goto L23
            r4 = 0
            r5.write(r2, r4, r3)     // Catch: java.lang.Throwable -> L21
            goto L16
        L21:
            r5 = move-exception
            goto L30
        L23:
            r5.flush()     // Catch: java.lang.Throwable -> L21
            byte[] r5 = r5.toByteArray()     // Catch: java.lang.Throwable -> L21
            r1.close()     // Catch: java.lang.Throwable -> L2d
        L2d:
            return r5
        L2e:
            r5 = move-exception
            r1 = r0
        L30:
            com.tencent.bugly.proguard.al.a(r5)     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto L38
            r1.close()     // Catch: java.lang.Throwable -> L38
        L38:
            return r0
        L39:
            r5 = move-exception
            if (r1 == 0) goto L3f
            r1.close()     // Catch: java.lang.Throwable -> L3f
        L3f:
            throw r5
    }

    public final byte[] a(java.lang.String r22, byte[] r23, com.tencent.bugly.proguard.aj r24, java.util.Map<java.lang.String, java.lang.String> r25) {
            r21 = this;
            r1 = r21
            r2 = r23
            r3 = r24
            r4 = 0
            r5 = 0
            if (r22 != 0) goto L12
            java.lang.String r0 = "Failed for no URL."
            java.lang.Object[] r2 = new java.lang.Object[r5]
            com.tencent.bugly.proguard.al.e(r0, r2)
            return r4
        L12:
            if (r2 != 0) goto L17
            r8 = 0
            goto L19
        L17:
            int r0 = r2.length
            long r8 = (long) r0
        L19:
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            int r10 = android.os.Process.myPid()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            int r11 = android.os.Process.myTid()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12 = 4
            java.lang.Object[] r12 = new java.lang.Object[r12]
            r12[r5] = r22
            r13 = 1
            r12[r13] = r0
            r14 = 2
            r12[r14] = r10
            r0 = 3
            r12[r0] = r11
            java.lang.String r0 = "request: %s, send: %d (pid=%d | tid=%d)"
            com.tencent.bugly.proguard.al.c(r0, r12)
            r10 = r22
            r0 = 0
            r11 = 0
            r12 = 0
        L45:
            if (r0 > 0) goto L17b
            if (r11 > 0) goto L17b
            if (r12 == 0) goto L52
            r16 = r4
            r12 = 0
        L4e:
            r17 = 0
        L50:
            r4 = r0
            goto L84
        L52:
            int r0 = r0 + 1
            if (r0 <= r13) goto L81
            java.lang.String r15 = "try time: "
            r16 = r4
            java.lang.String r4 = java.lang.String.valueOf(r0)
            java.lang.String r4 = r15.concat(r4)
            java.lang.Object[] r15 = new java.lang.Object[r5]
            com.tencent.bugly.proguard.al.c(r4, r15)
            java.util.Random r4 = new java.util.Random
            r17 = 0
            long r6 = java.lang.System.currentTimeMillis()
            r4.<init>(r6)
            r6 = 10000(0x2710, float:1.4013E-41)
            int r4 = r4.nextInt(r6)
            long r6 = (long) r4
            r19 = 10000(0x2710, double:4.9407E-320)
            long r6 = r6 + r19
            android.os.SystemClock.sleep(r6)
            goto L50
        L81:
            r16 = r4
            goto L4e
        L84:
            android.content.Context r0 = r1.b
            java.lang.String r0 = com.tencent.bugly.proguard.ab.c(r0)
            if (r0 != 0) goto L9c
            java.lang.String r0 = "Failed to request for network not avail"
            java.lang.Object[] r6 = new java.lang.Object[r5]
            com.tencent.bugly.proguard.al.d(r0, r6)
            r6 = r25
            r14 = r17
            r13 = 2
            r19 = 1
            goto L146
        L9c:
            r3.a(r8)
            r6 = r25
            java.net.HttpURLConnection r7 = a(r10, r2, r0, r6)
            if (r7 == 0) goto L16b
            int r0 = r7.getResponseCode()     // Catch: java.lang.Throwable -> Ldd java.io.IOException -> L15a
            java.lang.String r15 = "response code "
            r19 = 1
            java.lang.String r13 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> Ldd java.io.IOException -> Le1
            java.lang.String r13 = r15.concat(r13)     // Catch: java.lang.Throwable -> Ldd java.io.IOException -> Le1
            java.lang.Object[] r15 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> Ldd java.io.IOException -> Le1
            com.tencent.bugly.proguard.al.c(r13, r15)     // Catch: java.lang.Throwable -> Ldd java.io.IOException -> Le1
            r13 = 200(0xc8, float:2.8E-43)
            if (r0 != r13) goto Le5
            java.util.Map r0 = a(r7)     // Catch: java.lang.Throwable -> Ldd java.io.IOException -> Le1
            r1.c = r0     // Catch: java.lang.Throwable -> Ldd java.io.IOException -> Le1
            byte[] r13 = b(r7)     // Catch: java.lang.Throwable -> Ldd java.io.IOException -> Le1
            if (r13 != 0) goto Lcf
            r14 = r17
            goto Ld1
        Lcf:
            int r0 = r13.length     // Catch: java.lang.Throwable -> Ldd java.io.IOException -> Le1
            long r14 = (long) r0     // Catch: java.lang.Throwable -> Ldd java.io.IOException -> Le1
        Ld1:
            r3.b(r14)     // Catch: java.lang.Throwable -> Ldd java.io.IOException -> Le1
            r7.disconnect()     // Catch: java.lang.Throwable -> Ld8
            goto Ldc
        Ld8:
            r0 = move-exception
            com.tencent.bugly.proguard.al.a(r0)
        Ldc:
            return r13
        Ldd:
            r0 = move-exception
            r2 = r0
            goto L162
        Le1:
            r0 = move-exception
        Le2:
            r13 = 2
            goto L15e
        Le5:
            r13 = 301(0x12d, float:4.22E-43)
            if (r0 == r13) goto Lf8
            r13 = 302(0x12e, float:4.23E-43)
            if (r0 == r13) goto Lf8
            r13 = 303(0x12f, float:4.25E-43)
            if (r0 == r13) goto Lf8
            r13 = 307(0x133, float:4.3E-43)
            if (r0 != r13) goto Lf6
            goto Lf8
        Lf6:
            r13 = 2
            goto L130
        Lf8:
            java.lang.String r12 = "Location"
            java.lang.String r12 = r7.getHeaderField(r12)     // Catch: java.lang.Throwable -> Ldd java.io.IOException -> L157
            if (r12 != 0) goto L11b
            java.lang.String r12 = "Failed to redirect: %d"
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> Ldd java.io.IOException -> L118
            java.lang.String r0 = r12.concat(r0)     // Catch: java.lang.Throwable -> Ldd java.io.IOException -> L118
            java.lang.Object[] r12 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> Ldd java.io.IOException -> L118
            com.tencent.bugly.proguard.al.e(r0, r12)     // Catch: java.lang.Throwable -> Ldd java.io.IOException -> L118
            r7.disconnect()     // Catch: java.lang.Throwable -> L113
            goto L117
        L113:
            r0 = move-exception
            com.tencent.bugly.proguard.al.a(r0)
        L117:
            return r16
        L118:
            r0 = move-exception
            r12 = 1
            goto Le2
        L11b:
            int r11 = r11 + 1
            java.lang.String r4 = "redirect code: %d ,to:%s"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Ldd java.io.IOException -> L154
            r13 = 2
            java.lang.Object[] r10 = new java.lang.Object[r13]     // Catch: java.lang.Throwable -> Ldd java.io.IOException -> L14f
            r10[r5] = r0     // Catch: java.lang.Throwable -> Ldd java.io.IOException -> L14f
            r10[r19] = r12     // Catch: java.lang.Throwable -> Ldd java.io.IOException -> L14f
            com.tencent.bugly.proguard.al.c(r4, r10)     // Catch: java.lang.Throwable -> Ldd java.io.IOException -> L14f
            r10 = r12
            r4 = 0
            r12 = 1
        L130:
            int r0 = r7.getContentLength()     // Catch: java.lang.Throwable -> Ldd java.io.IOException -> L14d
            long r14 = (long) r0     // Catch: java.lang.Throwable -> Ldd java.io.IOException -> L14d
            int r0 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r0 >= 0) goto L13b
            r14 = r17
        L13b:
            r3.b(r14)     // Catch: java.lang.Throwable -> Ldd java.io.IOException -> L14d
        L13e:
            r7.disconnect()     // Catch: java.lang.Throwable -> L142
            goto L146
        L142:
            r0 = move-exception
            com.tencent.bugly.proguard.al.a(r0)
        L146:
            r0 = r4
            r4 = r16
            r13 = 1
            r14 = 2
            goto L45
        L14d:
            r0 = move-exception
            goto L15e
        L14f:
            r0 = move-exception
        L150:
            r10 = r12
            r4 = 0
        L152:
            r12 = 1
            goto L15e
        L154:
            r0 = move-exception
            r13 = 2
            goto L150
        L157:
            r0 = move-exception
            r13 = 2
            goto L152
        L15a:
            r0 = move-exception
            r13 = 2
            r19 = 1
        L15e:
            com.tencent.bugly.proguard.al.a(r0)     // Catch: java.lang.Throwable -> Ldd
            goto L13e
        L162:
            r7.disconnect()     // Catch: java.lang.Throwable -> L166
            goto L16a
        L166:
            r0 = move-exception
            com.tencent.bugly.proguard.al.a(r0)
        L16a:
            throw r2
        L16b:
            r13 = 2
            r19 = 1
            java.lang.String r0 = "Failed to execute post."
            java.lang.Object[] r7 = new java.lang.Object[r5]
            com.tencent.bugly.proguard.al.c(r0, r7)
            r14 = r17
            r3.b(r14)
            goto L146
        L17b:
            r16 = r4
            return r16
    }
}
