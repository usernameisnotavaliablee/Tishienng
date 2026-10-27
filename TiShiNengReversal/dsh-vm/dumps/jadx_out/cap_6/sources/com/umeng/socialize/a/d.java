package com.umeng.socialize.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class d {
    private static final java.lang.String a = "NetClient";

    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String a(java.lang.String r7, java.net.HttpURLConnection r8, java.lang.String r9) throws java.lang.Exception {
            byte[] r0 = r9.getBytes()
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            byte[] r7 = r7.getBytes()
            com.umeng.socialize.a.l.a(r7, r1)
            byte[] r7 = r1.toByteArray()
            byte[] r7 = com.umeng.socialize.a.i.a(r7, r0)
            java.lang.String r2 = "POST"
            r8.setRequestMethod(r2)
            r2 = 30000(0x7530, float:4.2039E-41)
            r8.setReadTimeout(r2)
            r8.setConnectTimeout(r2)
            java.lang.String r2 = "Content-Type"
            java.lang.String r3 = "application/octet-stream"
            r8.addRequestProperty(r2, r3)
            java.lang.String r2 = "Content-Encoding"
            java.lang.String r3 = "xgzip"
            r8.addRequestProperty(r2, r3)
            java.lang.String r4 = "appkey"
            r8.addRequestProperty(r4, r9)
            int r9 = r7.length
            r8.setFixedLengthStreamingMode(r9)
            r9 = 1
            r8.setDoOutput(r9)
            java.io.OutputStream r9 = r8.getOutputStream()     // Catch: java.lang.Throwable -> Lc3
            r9.write(r7)     // Catch: java.lang.Throwable -> Lc1
            com.umeng.socialize.a.c.a(r9)
            int r7 = r8.getResponseCode()
            r9 = 400(0x190, float:5.6E-43)
            if (r7 >= r9) goto L57
            java.io.InputStream r9 = r8.getInputStream()
            goto L5b
        L57:
            java.io.InputStream r9 = r8.getErrorStream()
        L5b:
            r1.reset()
            if (r9 == 0) goto L7a
            r4 = 8192(0x2000, float:1.148E-41)
            byte[] r4 = new byte[r4]
        L64:
            int r5 = r9.read(r4)     // Catch: java.lang.Throwable -> L70
            r6 = -1
            if (r5 == r6) goto L72
            r6 = 0
            r1.write(r4, r6, r5)     // Catch: java.lang.Throwable -> L70
            goto L64
        L70:
            r7 = move-exception
            goto L76
        L72:
            com.umeng.socialize.a.c.a(r9)
            goto L7a
        L76:
            com.umeng.socialize.a.c.a(r9)
            throw r7
        L7a:
            r8.disconnect()     // Catch: java.lang.Throwable -> L7e
            goto L7f
        L7e:
        L7f:
            r9 = 200(0xc8, float:2.8E-43)
            if (r7 != r9) goto L9b
            java.lang.String r8 = r8.getHeaderField(r2)
            boolean r8 = android.text.TextUtils.equals(r3, r8)
            if (r8 == 0) goto L9b
            byte[] r8 = r1.toByteArray()
            byte[] r8 = com.umeng.socialize.a.i.a(r8, r0)
            r1.reset()
            com.umeng.socialize.a.l.b(r8, r1)
        L9b:
            java.lang.String r8 = r1.toString()
            if (r7 != r9) goto La2
            return r8
        La2:
            java.io.IOException r9 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "code:"
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = " msg:"
            r0.append(r7)
            r0.append(r8)
            java.lang.String r7 = r0.toString()
            r9.<init>(r7)
            throw r9
        Lc1:
            r7 = move-exception
            goto Lc5
        Lc3:
            r7 = move-exception
            r9 = 0
        Lc5:
            com.umeng.socialize.a.c.a(r9)
            throw r7
    }

    public static org.json.JSONObject a(org.json.JSONObject r21, java.lang.String r22, java.lang.String r23, boolean r24) throws java.lang.Exception {
            java.lang.String r1 = "\nconsume:"
            java.lang.String r2 = "\nresp:\n"
            java.lang.String r3 = "\n"
            java.lang.String r4 = "req: "
            java.lang.String r5 = "NetClient"
            long r6 = android.os.SystemClock.elapsedRealtime()
            java.net.URL r8 = new java.net.URL
            r0 = r22
            r8.<init>(r0)
            java.lang.String r0 = r21.toString()
            r12 = 4
            r13 = 3
            r14 = 2
            r15 = 1
            r16 = 0
            r22 = 7
            r9 = 8
            java.net.URLConnection r17 = r8.openConnection()     // Catch: java.lang.Throwable -> L6c
            r18 = 6
            r10 = r17
            java.net.HttpURLConnection r10 = (java.net.HttpURLConnection) r10     // Catch: java.lang.Throwable -> L68
            r11 = r23
            r17 = 5
            java.lang.String r0 = a(r0, r10, r11)     // Catch: java.lang.Throwable -> L66
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L66
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L66
            boolean r0 = com.umeng.socialize.a.m.a()
            if (r0 == 0) goto L65
            if (r24 != 0) goto L46
            boolean r0 = com.umeng.socialize.a.a.c
            if (r0 == 0) goto L65
        L46:
            long r19 = android.os.SystemClock.elapsedRealtime()
            long r19 = r19 - r6
            java.lang.Long r0 = java.lang.Long.valueOf(r19)
            java.lang.Object[] r6 = new java.lang.Object[r9]
            r6[r16] = r4
            r6[r15] = r8
            r6[r14] = r3
            r6[r13] = r21
            r6[r12] = r2
            r6[r17] = r10
            r6[r18] = r1
            r6[r22] = r0
            com.umeng.socialize.a.m.a(r5, r6)
        L65:
            return r10
        L66:
            r0 = move-exception
            goto L71
        L68:
            r0 = move-exception
            r17 = 5
            goto L71
        L6c:
            r0 = move-exception
            r17 = 5
            r18 = 6
        L71:
            boolean r10 = com.umeng.socialize.a.m.a()
            if (r10 == 0) goto L9c
            if (r24 != 0) goto L7d
            boolean r10 = com.umeng.socialize.a.a.c
            if (r10 == 0) goto L9c
        L7d:
            long r10 = android.os.SystemClock.elapsedRealtime()
            long r10 = r10 - r6
            java.lang.Long r6 = java.lang.Long.valueOf(r10)
            java.lang.Object[] r7 = new java.lang.Object[r9]
            r7[r16] = r4
            r7[r15] = r8
            r7[r14] = r3
            r7[r13] = r21
            r7[r12] = r2
            r2 = 0
            r7[r17] = r2
            r7[r18] = r1
            r7[r22] = r6
            com.umeng.socialize.a.m.a(r5, r7)
        L9c:
            throw r0
    }

    public static void a(org.json.JSONObject r19, java.lang.String r20, java.lang.String r21) throws java.lang.Exception {
            r0 = r20
            java.lang.String r1 = r19.toString()
            byte[] r2 = r21.getBytes()
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
            byte[] r4 = r1.getBytes()
            com.umeng.socialize.a.l.a(r4, r3)
            byte[] r4 = r3.toByteArray()
            byte[] r4 = com.umeng.socialize.a.i.a(r4, r2)
            boolean r5 = com.umeng.socialize.a.a.c
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            r10 = 0
            java.lang.String r11 = "NetClient"
            if (r5 == 0) goto L66
            int r5 = r1.length()
            if (r5 <= 0) goto L66
            int r5 = r1.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r12 = r4.length
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            int r13 = r4.length
            int r13 = r13 * 100
            int r14 = r1.length()
            int r13 = r13 / r14
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r14 = 7
            java.lang.Object[] r14 = new java.lang.Object[r14]
            java.lang.String r15 = "src:"
            r14[r10] = r15
            r14[r9] = r5
            java.lang.String r5 = ", gzip:"
            r14[r8] = r5
            r14[r7] = r12
            java.lang.String r5 = ", ratio:"
            r14[r6] = r5
            r5 = 5
            r14[r5] = r13
            java.lang.String r5 = "%"
            r12 = 6
            r14[r12] = r5
            com.umeng.socialize.a.m.a(r11, r14)
        L66:
            long r12 = android.os.SystemClock.elapsedRealtime()
            java.net.URL r14 = new java.net.URL     // Catch: java.lang.Throwable -> L151
            r14.<init>(r0)     // Catch: java.lang.Throwable -> L151
            java.net.URLConnection r14 = r14.openConnection()     // Catch: java.lang.Throwable -> L151
            java.net.HttpURLConnection r14 = (java.net.HttpURLConnection) r14     // Catch: java.lang.Throwable -> L151
            java.lang.String r15 = "POST"
            r14.setRequestMethod(r15)     // Catch: java.lang.Throwable -> L14d
            r15 = 60000(0xea60, float:8.4078E-41)
            r14.setReadTimeout(r15)     // Catch: java.lang.Throwable -> L14d
            r14.setConnectTimeout(r15)     // Catch: java.lang.Throwable -> L14d
            java.lang.String r15 = "Content-Type"
            java.lang.String r5 = "application/octet-stream"
            r14.addRequestProperty(r15, r5)     // Catch: java.lang.Throwable -> L14d
            java.lang.String r5 = "appkey"
            r15 = r21
            r14.addRequestProperty(r5, r15)     // Catch: java.lang.Throwable -> L14d
            int r5 = r4.length     // Catch: java.lang.Throwable -> L14d
            r14.setFixedLengthStreamingMode(r5)     // Catch: java.lang.Throwable -> L14d
            r14.setDoOutput(r9)     // Catch: java.lang.Throwable -> L14d
            java.io.OutputStream r5 = r14.getOutputStream()     // Catch: java.lang.Throwable -> L14d
            r5.write(r4)     // Catch: java.lang.Throwable -> Lac
            int r4 = r14.getResponseCode()     // Catch: java.lang.Throwable -> Lac
            r15 = 400(0x190, float:5.6E-43)
            if (r4 >= r15) goto Lb0
            java.io.InputStream r15 = r14.getInputStream()     // Catch: java.lang.Throwable -> Lac
            goto Lb4
        Lac:
            r0 = move-exception
        Lad:
            r15 = 0
            goto L156
        Lb0:
            java.io.InputStream r15 = r14.getErrorStream()     // Catch: java.lang.Throwable -> Lac
        Lb4:
            r3.reset()     // Catch: java.lang.Throwable -> Lcf
            if (r15 == 0) goto Ld2
            r16 = 3
            r7 = 8192(0x2000, float:1.148E-41)
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> Lcf
            r17 = 2
        Lc1:
            int r8 = r15.read(r7)     // Catch: java.lang.Throwable -> Lcf
            r18 = 1
            r9 = -1
            if (r8 == r9) goto Ld8
            r3.write(r7, r10, r8)     // Catch: java.lang.Throwable -> Lcf
            r9 = 1
            goto Lc1
        Lcf:
            r0 = move-exception
            goto L156
        Ld2:
            r16 = 3
            r17 = 2
            r18 = 1
        Ld8:
            com.umeng.socialize.a.c.a(r5)
            com.umeng.socialize.a.c.a(r15)
            r14.disconnect()     // Catch: java.lang.Throwable -> Le2
            goto Le3
        Le2:
        Le3:
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 != r5) goto Lf5
            byte[] r7 = r3.toByteArray()
            byte[] r2 = com.umeng.socialize.a.i.a(r7, r2)
            r3.reset()
            com.umeng.socialize.a.l.b(r2, r3)
        Lf5:
            java.lang.String r2 = r3.toString()
            boolean r3 = com.umeng.socialize.a.a.c
            if (r3 == 0) goto L133
            java.lang.Object[] r3 = new java.lang.Object[r6]
            java.lang.String r7 = "req: "
            r3[r10] = r7
            r3[r18] = r0
            java.lang.String r0 = "\n"
            r3[r17] = r0
            r3[r16] = r1
            com.umeng.socialize.a.m.a(r11, r3)
            if (r4 != r5) goto L119
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r2)
            java.lang.String r2 = r0.toString()
        L119:
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 - r12
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r3 = "resp:\n"
            r1[r10] = r3
            r1[r18] = r2
            java.lang.String r2 = "\nconsume:"
            r1[r17] = r2
            r1[r16] = r0
            com.umeng.socialize.a.m.a(r11, r1)
        L133:
            if (r4 != r5) goto L136
            return
        L136:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "response code "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L14d:
            r0 = move-exception
            r5 = 0
            goto Lad
        L151:
            r0 = move-exception
            r5 = 0
            r14 = 0
            goto Lad
        L156:
            com.umeng.socialize.a.c.a(r5)
            com.umeng.socialize.a.c.a(r15)
            if (r14 == 0) goto L161
            r14.disconnect()     // Catch: java.lang.Throwable -> L161
        L161:
            throw r0
    }
}
