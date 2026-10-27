package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class l {
    private static final java.lang.String a = "gzip";
    private static final int b = 1024;
    private static volatile com.kuaishou.weapon.p0.l d;
    private static android.content.Context e;
    private boolean c;

    static {
            return
    }

    private l(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.c = r0
            com.kuaishou.weapon.p0.l.e = r2
            return
    }

    public static com.kuaishou.weapon.p0.l a(android.content.Context r2) {
            com.kuaishou.weapon.p0.l r0 = com.kuaishou.weapon.p0.l.d
            if (r0 != 0) goto L19
            java.lang.Class<com.kuaishou.weapon.p0.l> r0 = com.kuaishou.weapon.p0.l.class
            monitor-enter(r0)
            com.kuaishou.weapon.p0.l r1 = com.kuaishou.weapon.p0.l.d     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.kuaishou.weapon.p0.l r1 = new com.kuaishou.weapon.p0.l     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            com.kuaishou.weapon.p0.l.d = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
        L19:
            com.kuaishou.weapon.p0.l r2 = com.kuaishou.weapon.p0.l.d
            return r2
    }

    private java.io.InputStream a(java.net.HttpURLConnection r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "gzip"
            java.lang.String r2 = r4.getContentEncoding()     // Catch: java.io.IOException -> L1c
            boolean r1 = r1.equalsIgnoreCase(r2)     // Catch: java.io.IOException -> L1c
            if (r1 == 0) goto L14
            r1 = 1
            r3.c = r1     // Catch: java.io.IOException -> L1c
            goto L17
        L14:
            r1 = 0
            r3.c = r1     // Catch: java.io.IOException -> L1c
        L17:
            java.io.InputStream r4 = r4.getInputStream()     // Catch: java.io.IOException -> L1c
            return r4
        L1c:
            return r0
    }

    private synchronized void a(javax.net.ssl.HttpsURLConnection r1) {
            r0 = this;
            monitor-enter(r0)
            monitor-exit(r0)
            return
    }

    private boolean a(java.io.InputStream r5, java.io.File r6) {
            r4 = this;
            boolean r0 = r4.c
            if (r0 == 0) goto Lc
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch: java.io.IOException -> Lb
            r0.<init>(r5)     // Catch: java.io.IOException -> Lb
            r5 = r0
            goto Lc
        Lb:
        Lc:
            r0 = 0
            if (r5 != 0) goto L10
            return r0
        L10:
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L33
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L33
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L33
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L33
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> L2c
        L1e:
            int r2 = r5.read(r6)     // Catch: java.lang.Throwable -> L2c
            r3 = -1
            if (r2 == r3) goto L2e
            r1.write(r6, r0, r2)     // Catch: java.lang.Throwable -> L2c
            r1.flush()     // Catch: java.lang.Throwable -> L2c
            goto L1e
        L2c:
            goto L34
        L2e:
            r1.close()     // Catch: java.io.IOException -> L31
        L31:
            r5 = 1
            return r5
        L33:
            r1 = 0
        L34:
            if (r1 == 0) goto L39
            r1.close()     // Catch: java.io.IOException -> L39
        L39:
            return r0
    }

    public java.lang.String a(com.kuaishou.weapon.p0.m r11) {
            r10 = this;
            r0 = 0
            r1 = 0
            java.lang.String r2 = "POST"
            java.lang.String r3 = r11.a     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L20
            java.net.HttpURLConnection r2 = r10.a(r3, r2)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L20
            java.lang.String r3 = r11.b()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L20
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L20
            if (r4 != 0) goto L23
            if (r2 == 0) goto L23
            java.lang.String r4 = "Cookie"
            r2.setRequestProperty(r4, r3)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L20
            goto L23
        L1c:
            r11 = move-exception
            r0 = r1
            goto Le5
        L20:
            goto Lf0
        L23:
            java.lang.String r3 = r11.c()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L20
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L20
            if (r4 != 0) goto L34
            if (r2 == 0) goto L34
            java.lang.String r4 = "env"
            r2.setRequestProperty(r4, r3)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L20
        L34:
            org.json.JSONObject r3 = r11.a()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L20
            if (r3 == 0) goto L47
            org.json.JSONObject r11 = r11.a()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L20
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L20
            byte[] r11 = r11.getBytes()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L20
            goto L48
        L47:
            r11 = r1
        L48:
            if (r11 == 0) goto L64
            int r3 = r11.length     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L20
            if (r3 <= 0) goto L64
            java.lang.String r3 = "Content-Length"
            int r4 = r11.length     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L20
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L20
            r2.setRequestProperty(r3, r4)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L20
            java.io.OutputStream r3 = r2.getOutputStream()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L20
            r3.write(r11)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L20
            r3.flush()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L20
            r3.close()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L20
        L64:
            int r11 = r2.getResponseCode()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L20
            r3 = 200(0xc8, float:2.8E-43)
            if (r11 != r3) goto Ld4
            java.io.InputStream r11 = r2.getInputStream()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L20
            com.kuaishou.weapon.p0.h r3 = new com.kuaishou.weapon.p0.h     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> Lac
            android.content.Context r4 = com.kuaishou.weapon.p0.l.e     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> Lac
            r3.<init>(r4)     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> Lac
            java.lang.String r4 = "plc001_t_d"
            long r5 = r2.getDate()     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> Lac
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> Lac
            long r5 = r5 - r7
            r3.b(r4, r5)     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> Lac
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> Lac
            java.lang.String r4 = "WeaponHttpTask --   date "
            r3.<init>(r4)     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> Lac
            long r4 = r2.getDate()     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> Lac
            r3.append(r4)     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> Lac
            java.lang.String r2 = " "
            r3.append(r2)     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> Lac
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> Lac
            r3.append(r4)     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> Lac
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> Lac
            com.kuaishou.weapon.p0.e.c(r2)     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> Lac
            goto Lac
        La7:
            r0 = move-exception
            r9 = r0
            r0 = r11
            r11 = r9
            goto Le5
        Lac:
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> Ld1
            r2.<init>()     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> Ld1
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> Lc0 java.lang.Exception -> Lc6
        Lb5:
            int r4 = r11.read(r3)     // Catch: java.lang.Throwable -> Lc0 java.lang.Exception -> Lc6
            r5 = -1
            if (r4 == r5) goto Lc8
            r2.write(r3, r0, r4)     // Catch: java.lang.Throwable -> Lc0 java.lang.Exception -> Lc6
            goto Lb5
        Lc0:
            r0 = move-exception
            r1 = r0
            r0 = r11
            r11 = r1
            r1 = r2
            goto Le5
        Lc6:
            goto Lf2
        Lc8:
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> Lc0 java.lang.Exception -> Lc6
            r3 = 1
            r3 = r2
            r2 = r0
            r0 = 1
            goto Ld7
        Ld1:
            r2 = r1
            goto Lf2
        Ld4:
            r11 = r1
            r2 = r11
            r3 = r2
        Ld7:
            if (r3 == 0) goto Ldf
            r3.close()     // Catch: java.lang.Exception -> Ldd
            goto Ldf
        Ldd:
            goto L100
        Ldf:
            if (r11 == 0) goto L100
            r11.close()     // Catch: java.lang.Exception -> Ldd
            goto L100
        Le5:
            if (r1 == 0) goto Lea
            r1.close()     // Catch: java.lang.Exception -> Lef
        Lea:
            if (r0 == 0) goto Lef
            r0.close()     // Catch: java.lang.Exception -> Lef
        Lef:
            throw r11
        Lf0:
            r11 = r1
            r2 = r11
        Lf2:
            if (r2 == 0) goto Lfa
            r2.close()     // Catch: java.lang.Exception -> Lf8
            goto Lfa
        Lf8:
            goto Lff
        Lfa:
            if (r11 == 0) goto Lff
            r11.close()     // Catch: java.lang.Exception -> Lf8
        Lff:
            r2 = r1
        L100:
            if (r0 == 0) goto L103
            return r2
        L103:
            return r1
    }

    public java.lang.String a(java.util.Map<java.lang.String, java.lang.String> r4) {
            r3 = this;
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
            java.lang.String r0 = ""
        La:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "&"
            r2.append(r0)
            java.lang.Object r0 = r1.getKey()
            java.lang.String r0 = (java.lang.String) r0
            r2.append(r0)
            java.lang.String r0 = "="
            r2.append(r0)
            java.lang.Object r0 = r1.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto La
        L3f:
            r4 = 1
            java.lang.String r4 = r0.substring(r4)
            return r4
    }

    public java.net.HttpURLConnection a(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Exception -> L59
            r0.<init>(r5)     // Catch: java.lang.Exception -> L59
            java.lang.String r5 = "https"
            java.lang.String r1 = r0.getProtocol()     // Catch: java.lang.Exception -> L59
            boolean r5 = r5.equals(r1)     // Catch: java.lang.Exception -> L59
            if (r5 == 0) goto L1b
            java.net.URLConnection r5 = r0.openConnection()     // Catch: java.lang.Exception -> L59
            javax.net.ssl.HttpsURLConnection r5 = (javax.net.ssl.HttpsURLConnection) r5     // Catch: java.lang.Exception -> L59
            r4.a(r5)     // Catch: java.lang.Exception -> L59
            goto L21
        L1b:
            java.net.URLConnection r5 = r0.openConnection()     // Catch: java.lang.Exception -> L59
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch: java.lang.Exception -> L59
        L21:
            r5.setRequestMethod(r6)     // Catch: java.lang.Exception -> L5a
            r0 = 1
            r5.setAllowUserInteraction(r0)     // Catch: java.lang.Exception -> L5a
            r5.setInstanceFollowRedirects(r0)     // Catch: java.lang.Exception -> L5a
            r1 = 0
            r5.setChunkedStreamingMode(r1)     // Catch: java.lang.Exception -> L5a
            r2 = 10000(0x2710, float:1.4013E-41)
            r5.setConnectTimeout(r2)     // Catch: java.lang.Exception -> L5a
            r2 = 5000(0x1388, float:7.006E-42)
            r5.setReadTimeout(r2)     // Catch: java.lang.Exception -> L5a
            java.lang.String r2 = "Charset"
            java.lang.String r3 = "UTF-8"
            r5.setRequestProperty(r2, r3)     // Catch: java.lang.Exception -> L5a
            java.lang.String r2 = "Content-Type"
            java.lang.String r3 = "application/json; charset=UTF-8"
            r5.setRequestProperty(r2, r3)     // Catch: java.lang.Exception -> L5a
            java.lang.String r2 = "post"
            boolean r6 = r6.equalsIgnoreCase(r2)     // Catch: java.lang.Exception -> L5a
            if (r6 == 0) goto L58
            r5.setDoInput(r0)     // Catch: java.lang.Exception -> L5a
            r5.setDoOutput(r0)     // Catch: java.lang.Exception -> L5a
            r5.setUseCaches(r1)     // Catch: java.lang.Exception -> L5a
        L58:
            return r5
        L59:
            r5 = 0
        L5a:
            return r5
    }

    public void a(com.kuaishou.weapon.p0.m r2, com.kuaishou.weapon.p0.j r3) {
            r1 = this;
            java.lang.String r0 = "GET"
            r1.a(r2, r3, r0)
            return
    }

    public void a(com.kuaishou.weapon.p0.m r10, com.kuaishou.weapon.p0.j r11, java.lang.String r12) {
            r9 = this;
            r0 = 0
            java.lang.String r1 = r10.a     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1e
            java.net.HttpURLConnection r1 = r9.a(r1, r12)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1e
            java.lang.String r2 = r10.b()     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1e
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1e
            if (r3 != 0) goto L21
            if (r1 == 0) goto L21
            java.lang.String r3 = "Cookie"
            r1.setRequestProperty(r3, r2)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1e
            goto L21
        L19:
            r10 = move-exception
            r12 = r0
            r1 = r12
            goto Lf6
        L1e:
            goto L106
        L21:
            java.lang.String r2 = r10.c()     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1e
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1e
            if (r3 != 0) goto L32
            if (r1 == 0) goto L32
            java.lang.String r3 = "env"
            r1.setRequestProperty(r3, r2)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1e
        L32:
            java.lang.String r2 = "post"
            boolean r12 = r12.equalsIgnoreCase(r2)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1e
            if (r12 == 0) goto L6a
            org.json.JSONObject r12 = r10.a()     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1e
            if (r12 == 0) goto L4d
            org.json.JSONObject r10 = r10.a()     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1e
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1e
            byte[] r10 = r10.getBytes()     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1e
            goto L4e
        L4d:
            r10 = r0
        L4e:
            if (r10 == 0) goto L6a
            int r12 = r10.length     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1e
            if (r12 <= 0) goto L6a
            java.lang.String r12 = "Content-Length"
            int r2 = r10.length     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1e
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1e
            r1.setRequestProperty(r12, r2)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1e
            java.io.OutputStream r12 = r1.getOutputStream()     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1e
            r12.write(r10)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1e
            r12.flush()     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1e
            r12.close()     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1e
        L6a:
            int r10 = r1.getResponseCode()     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1e
            r12 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r10 != r12) goto Ldc
            java.io.InputStream r10 = r1.getInputStream()     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1e
            com.kuaishou.weapon.p0.h r12 = new com.kuaishou.weapon.p0.h     // Catch: java.lang.Throwable -> Lae java.lang.Exception -> Lb4
            android.content.Context r3 = com.kuaishou.weapon.p0.l.e     // Catch: java.lang.Throwable -> Lae java.lang.Exception -> Lb4
            r12.<init>(r3)     // Catch: java.lang.Throwable -> Lae java.lang.Exception -> Lb4
            java.lang.String r3 = "plc001_t_d"
            long r4 = r1.getDate()     // Catch: java.lang.Throwable -> Lae java.lang.Exception -> Lb4
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lae java.lang.Exception -> Lb4
            long r4 = r4 - r6
            r12.b(r3, r4)     // Catch: java.lang.Throwable -> Lae java.lang.Exception -> Lb4
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lae java.lang.Exception -> Lb4
            java.lang.String r3 = "WeaponHttpTask --   date "
            r12.<init>(r3)     // Catch: java.lang.Throwable -> Lae java.lang.Exception -> Lb4
            long r3 = r1.getDate()     // Catch: java.lang.Throwable -> Lae java.lang.Exception -> Lb4
            r12.append(r3)     // Catch: java.lang.Throwable -> Lae java.lang.Exception -> Lb4
            java.lang.String r1 = " "
            r12.append(r1)     // Catch: java.lang.Throwable -> Lae java.lang.Exception -> Lb4
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lae java.lang.Exception -> Lb4
            r12.append(r3)     // Catch: java.lang.Throwable -> Lae java.lang.Exception -> Lb4
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> Lae java.lang.Exception -> Lb4
            com.kuaishou.weapon.p0.e.c(r12)     // Catch: java.lang.Throwable -> Lae java.lang.Exception -> Lb4
            goto Lb4
        Lae:
            r12 = move-exception
            r1 = r12
            r12 = r10
            r10 = r1
            r1 = r0
            goto Lf6
        Lb4:
            java.io.ByteArrayOutputStream r12 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> Lae java.lang.Exception -> Ld9
            r12.<init>()     // Catch: java.lang.Throwable -> Lae java.lang.Exception -> Ld9
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> Lc8 java.lang.Exception -> Lce
        Lbd:
            int r3 = r10.read(r1)     // Catch: java.lang.Throwable -> Lc8 java.lang.Exception -> Lce
            r4 = -1
            if (r3 == r4) goto Ld0
            r12.write(r1, r2, r3)     // Catch: java.lang.Throwable -> Lc8 java.lang.Exception -> Lce
            goto Lbd
        Lc8:
            r1 = move-exception
            r8 = r12
            r12 = r10
            r10 = r1
            r1 = r8
            goto Lf6
        Lce:
            goto L108
        Ld0:
            java.lang.String r0 = r12.toString()     // Catch: java.lang.Throwable -> Lc8 java.lang.Exception -> Lce
            r2 = 1
            r8 = r0
            r0 = r12
            r12 = r8
            goto Lde
        Ld9:
            r12 = r0
            goto L108
        Ldc:
            r10 = r0
            r12 = r10
        Lde:
            if (r0 == 0) goto Le3
            r0.close()     // Catch: java.lang.Exception -> L117
        Le3:
            if (r10 == 0) goto Le8
            r10.close()     // Catch: java.lang.Exception -> L117
        Le8:
            if (r2 == 0) goto Lf0
            if (r11 == 0) goto L117
            r11.a(r12)     // Catch: java.lang.Exception -> L117
            goto L117
        Lf0:
            if (r11 == 0) goto L117
            r11.b(r12)     // Catch: java.lang.Exception -> L117
            goto L117
        Lf6:
            if (r1 == 0) goto Lfb
            r1.close()     // Catch: java.lang.Exception -> L105
        Lfb:
            if (r12 == 0) goto L100
            r12.close()     // Catch: java.lang.Exception -> L105
        L100:
            if (r11 == 0) goto L105
            r11.b(r0)     // Catch: java.lang.Exception -> L105
        L105:
            throw r10
        L106:
            r10 = r0
            r12 = r10
        L108:
            if (r12 == 0) goto L10d
            r12.close()     // Catch: java.lang.Exception -> L117
        L10d:
            if (r10 == 0) goto L112
            r10.close()     // Catch: java.lang.Exception -> L117
        L112:
            if (r11 == 0) goto L117
            r11.b(r0)     // Catch: java.lang.Exception -> L117
        L117:
            return
    }

    public boolean a(java.lang.String r4, java.io.File r5) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            r0 = 0
            java.lang.String r2 = "GET"
            java.net.HttpURLConnection r4 = r3.a(r4, r2)     // Catch: java.lang.Throwable -> L26
            java.io.InputStream r0 = r3.a(r4)     // Catch: java.lang.Throwable -> L24
            boolean r5 = r3.a(r0, r5)     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L1c
            r0.close()     // Catch: java.lang.Throwable -> L22
        L1c:
            if (r4 == 0) goto L23
            r4.disconnect()     // Catch: java.lang.Throwable -> L22
            return r5
        L22:
            return r1
        L23:
            return r5
        L24:
            goto L28
        L26:
            r4 = r0
        L28:
            if (r0 == 0) goto L2d
            r0.close()     // Catch: java.lang.Throwable -> L33
        L2d:
            if (r4 == 0) goto L33
            r4.disconnect()     // Catch: java.lang.Throwable -> L33
        L33:
            return r1
    }

    public void b(com.kuaishou.weapon.p0.m r2, com.kuaishou.weapon.p0.j r3) {
            r1 = this;
            java.lang.String r0 = "POST"
            r1.a(r2, r3, r0)
            return
    }
}
