package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class r1 extends ms.bz.bd.c.Pgl.pblx {
    private javax.net.ssl.SSLSocketFactory a;

    public r1() {
            r0 = this;
            r0.<init>()
            return
    }

    private java.lang.Object[] h(java.lang.String r22, byte[] r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, boolean r27) {
            r21 = this;
            r1 = r21
            r2 = r22
            r3 = r25
            r4 = r26
            ms.bz.bd.c.Pgl.pblw$pgla r5 = new ms.bz.bd.c.Pgl.pblw$pgla
            r5.<init>()
            r6 = 0
            r7 = 1
            r8 = 6
            r9 = 10
            r10 = -1
            r11 = 0
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> L258 java.lang.Exception -> L25d
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L258 java.lang.Exception -> L25d
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.lang.Throwable -> L258 java.lang.Exception -> L25d
            r12 = r0
            java.net.HttpURLConnection r12 = (java.net.HttpURLConnection) r12     // Catch: java.lang.Throwable -> L258 java.lang.Exception -> L25d
            boolean r0 = r12 instanceof javax.net.ssl.HttpsURLConnection
            r13 = 3
            if (r0 == 0) goto L68
            javax.net.ssl.SSLSocketFactory r0 = r1.a     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L68
            if (r0 != 0) goto L5e
            java.lang.Class<ms.bz.bd.c.Pgl.r1> r14 = ms.bz.bd.c.Pgl.r1.class
            monitor-enter(r14)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L68
            javax.net.ssl.SSLSocketFactory r0 = r1.a     // Catch: java.lang.Throwable -> L54
            if (r0 != 0) goto L56
            java.lang.String r19 = "8d3149"
            byte[] r0 = new byte[r13]     // Catch: java.lang.Throwable -> L54
            r0 = {x0308: FILL_ARRAY_DATA , data: [29, 74, 115} // fill-array     // Catch: java.lang.Throwable -> L54
            r15 = 16777217(0x1000001, float:2.350989E-38)
            r16 = 0
            r17 = 0
            r20 = r0
            java.lang.Object r0 = com.volcengine.mobsecBiz.matrix.pgla.a(r15, r16, r17, r19, r20)     // Catch: java.lang.Throwable -> L54
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L54
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r0)     // Catch: java.lang.Throwable -> L54
            r0.init(r11, r11, r11)     // Catch: java.lang.Throwable -> L54
            javax.net.ssl.SSLSocketFactory r0 = r0.getSocketFactory()     // Catch: java.lang.Throwable -> L54
            r1.a = r0     // Catch: java.lang.Throwable -> L54
            goto L56
        L54:
            r0 = move-exception
            goto L58
        L56:
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L54
            goto L5e
        L58:
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L54
            throw r0     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L68
        L5a:
            r0 = move-exception
            r3 = r11
            goto L2db
        L5e:
            javax.net.ssl.SSLSocketFactory r0 = r1.a     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L68
            if (r0 == 0) goto L68
            r14 = r12
            javax.net.ssl.HttpsURLConnection r14 = (javax.net.ssl.HttpsURLConnection) r14     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L68
            r14.setSSLSocketFactory(r0)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L68
        L68:
            r0 = 10000(0x2710, float:1.4013E-41)
            r12.setConnectTimeout(r0)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            r0 = 5000(0x1388, float:7.006E-42)
            r12.setReadTimeout(r0)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            java.lang.String r18 = "b716d7"
            byte[] r0 = new byte[r8]     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            r0 = {x030e: FILL_ARRAY_DATA , data: [82, 54, 65, 71, 75, 52} // fill-array     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            r14 = 16777217(0x1000001, float:2.350989E-38)
            r15 = 0
            r16 = 0
            r19 = r0
            java.lang.Object r0 = com.volcengine.mobsecBiz.matrix.pgla.a(r14, r15, r16, r18, r19)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            java.lang.String r18 = "261558"
            byte[] r13 = new byte[r13]     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            r13 = {x0316: FILL_ARRAY_DATA , data: [105, 123, 8} // fill-array     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            r14 = 16777217(0x1000001, float:2.350989E-38)
            r15 = 0
            r16 = 0
            r19 = r13
            java.lang.Object r13 = com.volcengine.mobsecBiz.matrix.pgla.a(r14, r15, r16, r18, r19)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            r12.setRequestProperty(r0, r13)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            java.lang.String r18 = "319f65"
            byte[] r0 = new byte[r9]     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            r0 = {x031c: FILL_ARRAY_DATA , data: [1, 60, 68, 28, 12, 33, 36, 25, 103, 56} // fill-array     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            r14 = 16777217(0x1000001, float:2.350989E-38)
            r15 = 0
            r16 = 0
            r19 = r0
            java.lang.Object r0 = com.volcengine.mobsecBiz.matrix.pgla.a(r14, r15, r16, r18, r19)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            java.lang.String r17 = "af5bb6"
            byte[] r13 = new byte[r9]     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            r13 = {x0326: FILL_ARRAY_DATA , data: [91, 97, 67, 6, 16, 0, 110, 78, 114, 55} // fill-array     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            r18 = r13
            r13 = 16777217(0x1000001, float:2.350989E-38)
            r14 = 0
            r15 = 0
            java.lang.Object r13 = com.volcengine.mobsecBiz.matrix.pgla.a(r13, r14, r15, r17, r18)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            r12.setRequestProperty(r0, r13)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            java.lang.String r18 = "3589ae"
            byte[] r0 = new byte[r9]     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            r0 = {x0330: FILL_ARRAY_DATA , data: [23, 36, 78, 95, 19, 83, 55, 17, 103, 125} // fill-array     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            r14 = 16777217(0x1000001, float:2.350989E-38)
            r15 = 0
            r16 = 0
            r19 = r0
            java.lang.Object r0 = com.volcengine.mobsecBiz.matrix.pgla.a(r14, r15, r16, r18, r19)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            java.lang.String r17 = "870bdf"
            r13 = 15
            byte[] r13 = new byte[r13]     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            r13 = {x033a: FILL_ARRAY_DATA , data: [11, 44, 87, 19, 127, 112, 53, 21, 100, 127, 4, 6, 112, 50, 112} // fill-array     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            r18 = r13
            r13 = 16777217(0x1000001, float:2.350989E-38)
            r14 = 0
            r15 = 0
            java.lang.Object r13 = com.volcengine.mobsecBiz.matrix.pgla.a(r13, r14, r15, r17, r18)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            r12.setRequestProperty(r0, r13)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            java.lang.String r18 = "c64d7b"
            r0 = 12
            byte[] r13 = new byte[r0]     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            r13 = {x0346: FILL_ARRAY_DATA , data: [81, 59, 73, 4, 13, 123, 116, 90, 81, 45, 98, 49} // fill-array     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            r14 = 16777217(0x1000001, float:2.350989E-38)
            r15 = 0
            r16 = 0
            r19 = r13
            java.lang.Object r13 = com.volcengine.mobsecBiz.matrix.pgla.a(r14, r15, r16, r18, r19)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            java.lang.String r18 = "4fac0f"
            r14 = 24
            byte[] r14 = new byte[r14]     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            r14 = {x0350: FILL_ARRAY_DATA , data: [36, 116, 2, 27, 6, 114, 54, 83, 57, 60, 43, 43, 29, 20, 27, 116, 35, 10, 35, 39, 55, 97, 19, 26} // fill-array     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            r19 = r14
            r14 = 16777217(0x1000001, float:2.350989E-38)
            r15 = 0
            r16 = 0
            java.lang.Object r14 = com.volcengine.mobsecBiz.matrix.pgla.a(r14, r15, r16, r18, r19)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            java.lang.String r14 = (java.lang.String) r14     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            r12.setRequestProperty(r13, r14)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            if (r24 == 0) goto L16d
            java.lang.String r13 = r24.trim()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            int r13 = r13.length()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            if (r13 <= 0) goto L16d
            java.lang.String r18 = "37a0bf"
            byte[] r13 = new byte[r8]     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            r13 = {x0360: FILL_ARRAY_DATA , data: [1, 58, 29, 79, 84, 116} // fill-array     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            r14 = 16777217(0x1000001, float:2.350989E-38)
            r15 = 0
            r16 = 0
            r19 = r13
            java.lang.Object r13 = com.volcengine.mobsecBiz.matrix.pgla.a(r14, r15, r16, r18, r19)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            java.lang.String r18 = "2621e9"
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            r0 = {x0368: FILL_ARRAY_DATA , data: [48, 49, 82, 86, 83, 33, 63, 30, 103, 60, 102, 39} // fill-array     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            r14 = 16777217(0x1000001, float:2.350989E-38)
            r15 = 0
            r16 = 0
            r19 = r0
            java.lang.Object r0 = com.volcengine.mobsecBiz.matrix.pgla.a(r14, r15, r16, r18, r19)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            r14[r6] = r24     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            java.lang.String r0 = java.lang.String.format(r0, r14)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            r12.setRequestProperty(r13, r0)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
        L16d:
            if (r3 == 0) goto L193
            java.lang.String r0 = r3.trim()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            if (r0 <= 0) goto L193
            java.lang.String r17 = "99bb4d"
            r0 = 16
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            r0 = {x0372: FILL_ARRAY_DATA , data: [48, 118, 5, 2, 70, 97, 63, 9, 38, 55, 59, 47, 92, 2, 10, 116} // fill-array     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            r13 = 16777217(0x1000001, float:2.350989E-38)
            r14 = 0
            r15 = 0
            r18 = r0
            java.lang.Object r0 = com.volcengine.mobsecBiz.matrix.pgla.a(r13, r14, r15, r17, r18)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            r12.setRequestProperty(r0, r3)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
        L193:
            r5.a(r2)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            if (r27 == 0) goto L1c6
            java.lang.String r17 = "87bcf9"
            r0 = 4
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            r0 = {x037e: FILL_ARRAY_DATA , data: [25, 26, 34, 35} // fill-array     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            r13 = 16777217(0x1000001, float:2.350989E-38)
            r14 = 0
            r15 = 0
            r18 = r0
            java.lang.Object r0 = com.volcengine.mobsecBiz.matrix.pgla.a(r13, r14, r15, r17, r18)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            r12.setRequestMethod(r0)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            r12.setDoOutput(r7)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            java.io.DataOutputStream r2 = new java.io.DataOutputStream     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            java.io.OutputStream r0 = r12.getOutputStream()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L25e
            r3 = r23
            r2.write(r3)     // Catch: java.lang.Throwable -> L253 java.lang.Exception -> L256
            r2.flush()     // Catch: java.lang.Throwable -> L253 java.lang.Exception -> L256
            goto L1c7
        L1c6:
            r2 = r11
        L1c7:
            int r10 = r12.getResponseCode()     // Catch: java.lang.Throwable -> L253 java.lang.Exception -> L256
            java.lang.String r17 = "67d3f7"
            byte[] r0 = new byte[r9]     // Catch: java.lang.Throwable -> L253 java.lang.Exception -> L256
            r0 = {x0384: FILL_ARRAY_DATA , data: [63, 120, 3, 83, 20, 44, 58, 17, 60, 103} // fill-array     // Catch: java.lang.Throwable -> L253 java.lang.Exception -> L256
            r13 = 16777217(0x1000001, float:2.350989E-38)
            r14 = 0
            r15 = 0
            r18 = r0
            java.lang.Object r0 = com.volcengine.mobsecBiz.matrix.pgla.a(r13, r14, r15, r17, r18)     // Catch: java.lang.Throwable -> L253 java.lang.Exception -> L256
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L253 java.lang.Exception -> L256
            java.lang.String r0 = r12.getHeaderField(r0)     // Catch: java.lang.Throwable -> L253 java.lang.Exception -> L256
            r5.b(r0, r10)     // Catch: java.lang.Throwable -> L253 java.lang.Exception -> L256
            r0 = 200(0xc8, float:2.8E-43)
            if (r10 != r0) goto L229
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L253 java.lang.Exception -> L256
            java.io.InputStream r0 = r12.getInputStream()     // Catch: java.lang.Throwable -> L253 java.lang.Exception -> L256
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L253 java.lang.Exception -> L256
            if (r4 == 0) goto L1fe
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L1fc java.lang.Exception -> L260
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L1fc java.lang.Exception -> L260
            goto L203
        L1fc:
            r0 = move-exception
            goto L226
        L1fe:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L1fc java.lang.Exception -> L260
            r0.<init>()     // Catch: java.lang.Throwable -> L1fc java.lang.Exception -> L260
        L203:
            r4 = 256(0x100, float:3.59E-43)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L1fc java.lang.Exception -> L260
        L207:
            int r13 = r3.read(r4)     // Catch: java.lang.Throwable -> L1fc java.lang.Exception -> L260
            if (r13 <= 0) goto L211
            r0.write(r4, r6, r13)     // Catch: java.lang.Throwable -> L1fc java.lang.Exception -> L260
            goto L207
        L211:
            r0.flush()     // Catch: java.lang.Throwable -> L1fc java.lang.Exception -> L260
            boolean r4 = r0 instanceof java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L1fc java.lang.Exception -> L260
            if (r4 == 0) goto L220
            r4 = r0
            java.io.ByteArrayOutputStream r4 = (java.io.ByteArrayOutputStream) r4     // Catch: java.lang.Throwable -> L1fc java.lang.Exception -> L260
            byte[] r4 = r4.toByteArray()     // Catch: java.lang.Throwable -> L1fc java.lang.Exception -> L260
            goto L221
        L220:
            r4 = r11
        L221:
            r0.close()     // Catch: java.lang.Throwable -> L1fc java.lang.Exception -> L260
            r11 = r3
            goto L22a
        L226:
            r11 = r3
            goto L2de
        L229:
            r4 = r11
        L22a:
            ms.bz.bd.c.Pgl.pblx.c(r11)
            ms.bz.bd.c.Pgl.pblx.d(r2)
            r12.disconnect()     // Catch: java.lang.Exception -> L234
            goto L250
        L234:
            r0 = 7
            byte[] r0 = new byte[r0]
            r0 = {x038e: FILL_ARRAY_DATA , data: [54, 51, 71, 41, 82, 99, 101} // fill-array
            r2 = 0
            java.lang.String r5 = "497bee"
            r8 = 16777217(0x1000001, float:2.350989E-38)
            r9 = 0
            r27 = r0
            r24 = r2
            r26 = r5
            r22 = 16777217(0x1000001, float:2.350989E-38)
            r23 = 0
            com.volcengine.mobsecBiz.matrix.pgla.a(r22, r23, r24, r26, r27)
        L250:
            r11 = r4
            goto L2cf
        L253:
            r0 = move-exception
            goto L2de
        L256:
            r3 = r11
            goto L260
        L258:
            r0 = move-exception
            r3 = r11
            r12 = r3
            goto L2db
        L25d:
            r12 = r11
        L25e:
            r2 = r11
            r3 = r2
        L260:
            java.lang.String r0 = "3e0183"
            byte[] r4 = new byte[r8]     // Catch: java.lang.Throwable -> L2a0
            r4 = {x0396: FILL_ARRAY_DATA , data: [49, 111, 64, 122, 15, 53} // fill-array     // Catch: java.lang.Throwable -> L2a0
            r8 = 16777217(0x1000001, float:2.350989E-38)
            r13 = 0
            r14 = 0
            r26 = r0
            r27 = r4
            r24 = r14
            r22 = 16777217(0x1000001, float:2.350989E-38)
            r23 = 0
            com.volcengine.mobsecBiz.matrix.pgla.a(r22, r23, r24, r26, r27)     // Catch: java.lang.Throwable -> L2a0
            if (r12 == 0) goto L2a3
            java.lang.String r0 = "d55db8"
            byte[] r4 = new byte[r9]     // Catch: java.lang.Throwable -> L2a0
            r4 = {x039e: FILL_ARRAY_DATA , data: [109, 122, 82, 4, 16, 35, 104, 19, 109, 48} // fill-array     // Catch: java.lang.Throwable -> L2a0
            r8 = 16777217(0x1000001, float:2.350989E-38)
            r9 = 0
            r13 = 0
            r26 = r0
            r27 = r4
            r24 = r13
            r22 = 16777217(0x1000001, float:2.350989E-38)
            r23 = 0
            java.lang.Object r0 = com.volcengine.mobsecBiz.matrix.pgla.a(r22, r23, r24, r26, r27)     // Catch: java.lang.Throwable -> L2a0
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L2a0
            java.lang.String r0 = r12.getHeaderField(r0)     // Catch: java.lang.Throwable -> L2a0
            goto L2a4
        L2a0:
            r0 = move-exception
            r11 = r2
            goto L2db
        L2a3:
            r0 = r11
        L2a4:
            r5.c(r0, r10)     // Catch: java.lang.Throwable -> L2a0
            ms.bz.bd.c.Pgl.pblx.c(r3)
            ms.bz.bd.c.Pgl.pblx.d(r2)
            if (r12 == 0) goto L2cf
            r12.disconnect()     // Catch: java.lang.Exception -> L2b3
            goto L2cf
        L2b3:
            r0 = 7
            byte[] r0 = new byte[r0]
            r0 = {x03a8: FILL_ARRAY_DATA , data: [103, 59, 67, 42, 1, 55, 52} // fill-array
            r2 = 0
            java.lang.String r4 = "e13a61"
            r5 = 16777217(0x1000001, float:2.350989E-38)
            r8 = 0
            r27 = r0
            r24 = r2
            r26 = r4
            r22 = 16777217(0x1000001, float:2.350989E-38)
            r23 = 0
            com.volcengine.mobsecBiz.matrix.pgla.a(r22, r23, r24, r26, r27)
        L2cf:
            java.lang.String r0 = java.lang.String.valueOf(r10)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r6] = r0
            r2[r7] = r11
            return r2
        L2db:
            r2 = r11
            goto L226
        L2de:
            ms.bz.bd.c.Pgl.pblx.c(r11)
            ms.bz.bd.c.Pgl.pblx.d(r2)
            if (r12 == 0) goto L306
            r12.disconnect()     // Catch: java.lang.Exception -> L2ea
            goto L306
        L2ea:
            r2 = 7
            byte[] r2 = new byte[r2]
            r2 = {x03b0: FILL_ARRAY_DATA , data: [49, 111, 20, 45, 82, 96, 98} // fill-array
            r3 = 0
            java.lang.String r5 = "3edfef"
            r6 = 16777217(0x1000001, float:2.350989E-38)
            r7 = 0
            r27 = r2
            r24 = r3
            r26 = r5
            r22 = 16777217(0x1000001, float:2.350989E-38)
            r23 = 0
            com.volcengine.mobsecBiz.matrix.pgla.a(r22, r23, r24, r26, r27)
        L306:
            throw r0
    }

    @Override // ms.bz.bd.c.Pgl.pblx
    public final java.lang.Object[] e(java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            r7 = this;
            r5 = 0
            r6 = 0
            r2 = 0
            r0 = r7
            r1 = r8
            r3 = r9
            r4 = r10
            java.lang.Object[] r8 = r0.h(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Override // ms.bz.bd.c.Pgl.pblx
    public final java.lang.Object[] f(java.lang.String r15, byte[] r16, java.lang.String r17, java.lang.String r18) {
            r14 = this;
            r0 = 25
            byte[] r6 = new byte[r0]
            r6 = {x0022: FILL_ARRAY_DATA , data: [27, 122, 4, 1, 9, 42, 18, 84, 33, 33, 11, 111, 30, 16, 2, 51, 122, 85, 39, 61, 104, 46, 90, 88, 76} // fill-array
            r3 = 0
            java.lang.String r5 = "9ada30"
            r1 = 16777217(0x1000001, float:2.350989E-38)
            r2 = 0
            com.volcengine.mobsecBiz.matrix.pgla.a(r1, r2, r3, r5, r6)
            r12 = 0
            r13 = 1
            r7 = r14
            r8 = r15
            r9 = r16
            r10 = r17
            r11 = r18
            java.lang.Object[] r15 = r7.h(r8, r9, r10, r11, r12, r13)
            return r15
    }

    @Override // ms.bz.bd.c.Pgl.pblx
    public final java.lang.Object[] g(java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            r7 = this;
            r3 = 0
            r6 = 0
            r2 = 0
            r0 = r7
            r1 = r8
            r5 = r9
            r4 = r10
            java.lang.Object[] r8 = r0.h(r1, r2, r3, r4, r5, r6)
            return r8
    }
}
