package com.beizi.fusion.tool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class v {
    private static java.lang.String a = "HttpUtil";

    static {
            return
    }

    public v() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(android.content.Context r4, java.lang.String r5, java.lang.String r6, java.lang.Boolean r7) {
            r0 = 0
            if (r4 == 0) goto Lf7
            if (r5 == 0) goto Lf7
            if (r6 != 0) goto L9
            goto Lf7
        L9:
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L14
            byte[] r4 = b(r4, r6)
            goto L18
        L14:
            byte[] r4 = a(r4, r6)
        L18:
            if (r4 != 0) goto L1b
            return r0
        L1b:
            java.net.URL r6 = new java.net.URL     // Catch: java.lang.Throwable -> Lc7 java.lang.Exception -> Lcc
            r6.<init>(r5)     // Catch: java.lang.Throwable -> Lc7 java.lang.Exception -> Lcc
            java.net.URLConnection r5 = r6.openConnection()     // Catch: java.lang.Throwable -> Lc7 java.lang.Exception -> Lcc
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch: java.lang.Throwable -> Lc7 java.lang.Exception -> Lcc
            java.lang.String r6 = "POST"
            r5.setRequestMethod(r6)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L6c
            int r6 = r4.length     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L6c
            java.lang.String r7 = "Content-Length"
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L6c
            r5.setRequestProperty(r7, r6)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L6c
            java.lang.String r6 = "Content-Type"
            java.lang.String r7 = "application/json"
            r5.setRequestProperty(r6, r7)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L6c
            r6 = 10000(0x2710, float:1.4013E-41)
            r5.setConnectTimeout(r6)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L6c
            r6 = 5000(0x1388, float:7.006E-42)
            r5.setReadTimeout(r6)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L6c
            r6 = 1
            r5.setDoOutput(r6)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L6c
            r5.setDoInput(r6)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L6c
            r5.connect()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L6c
            int r6 = r4.length     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L6c
            if (r6 <= 0) goto L71
            java.io.OutputStream r6 = r5.getOutputStream()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L6c
            r6.write(r4)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L61
            goto L72
        L5b:
            r4 = r0
            r7 = r4
        L5e:
            r1 = r7
            goto Ld1
        L61:
            r4 = r0
            r7 = r4
        L64:
            r1 = r7
            goto Le4
        L67:
            r4 = r0
            r6 = r4
        L6a:
            r7 = r6
            goto L5e
        L6c:
            r4 = r0
            r6 = r4
        L6f:
            r7 = r6
            goto L64
        L71:
            r6 = r0
        L72:
            int r4 = r5.getResponseCode()     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L61
            r7 = 200(0xc8, float:2.8E-43)
            if (r4 != r7) goto Lc1
            java.io.InputStream r4 = r5.getInputStream()     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L61
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> Lbb java.lang.Exception -> Lbe
            r7.<init>(r4)     // Catch: java.lang.Throwable -> Lbb java.lang.Exception -> Lbe
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lb8
            r1.<init>(r7)     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lb8
            java.lang.StringBuffer r2 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r2.<init>()     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
        L8d:
            java.lang.String r3 = r1.readLine()     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            if (r3 == 0) goto L9b
            r2.append(r3)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            goto L8d
        L97:
            goto Ld1
        L99:
            goto Le4
        L9b:
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            if (r4 == 0) goto Laf
            r4.close()     // Catch: java.io.IOException -> Lae
            r7.close()     // Catch: java.io.IOException -> Lae
            r1.close()     // Catch: java.io.IOException -> Lae
            r5.disconnect()     // Catch: java.io.IOException -> Lae
            goto Laf
        Lae:
        Laf:
            if (r6 == 0) goto Lb4
            r6.close()     // Catch: java.io.IOException -> Lb4
        Lb4:
            return r0
        Lb5:
            r1 = r0
            goto Ld1
        Lb8:
            r1 = r0
            goto Le4
        Lbb:
            r7 = r0
            goto L5e
        Lbe:
            r7 = r0
            goto L64
        Lc1:
            if (r6 == 0) goto Lf7
        Lc3:
            r6.close()     // Catch: java.io.IOException -> Lf7
            goto Lf7
        Lc7:
            r4 = r0
            r5 = r4
            r6 = r5
            goto L6a
        Lcc:
            r4 = r0
            r5 = r4
            r6 = r5
            goto L6f
        Ld1:
            if (r4 == 0) goto Le1
            r4.close()     // Catch: java.io.IOException -> Le0
            r7.close()     // Catch: java.io.IOException -> Le0
            r1.close()     // Catch: java.io.IOException -> Le0
            r5.disconnect()     // Catch: java.io.IOException -> Le0
            goto Le1
        Le0:
        Le1:
            if (r6 == 0) goto Lf7
            goto Lc3
        Le4:
            if (r4 == 0) goto Lf4
            r4.close()     // Catch: java.io.IOException -> Lf3
            r7.close()     // Catch: java.io.IOException -> Lf3
            r1.close()     // Catch: java.io.IOException -> Lf3
            r5.disconnect()     // Catch: java.io.IOException -> Lf3
            goto Lf4
        Lf3:
        Lf4:
            if (r6 == 0) goto Lf7
            goto Lc3
        Lf7:
            return r0
    }

    public static java.lang.String a(java.lang.String r10, java.io.File r11) {
            java.lang.String r0 = "\r\n"
            java.lang.String r1 = "--"
            java.lang.String r2 = "*****"
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            r4 = 0
            java.net.URL r5 = new java.net.URL     // Catch: java.lang.Throwable -> L132 java.lang.Exception -> L137
            r5.<init>(r10)     // Catch: java.lang.Throwable -> L132 java.lang.Exception -> L137
            java.net.URLConnection r10 = r5.openConnection()     // Catch: java.lang.Throwable -> L132 java.lang.Exception -> L137
            java.net.HttpURLConnection r10 = (java.net.HttpURLConnection) r10     // Catch: java.lang.Throwable -> L132 java.lang.Exception -> L137
            r5 = 1
            r10.setDoInput(r5)     // Catch: java.lang.Throwable -> L132 java.lang.Exception -> L137
            r10.setDoOutput(r5)     // Catch: java.lang.Throwable -> L132 java.lang.Exception -> L137
            r5 = 0
            r10.setUseCaches(r5)     // Catch: java.lang.Throwable -> L132 java.lang.Exception -> L137
            java.lang.String r6 = "POST"
            r10.setRequestMethod(r6)     // Catch: java.lang.Throwable -> L132 java.lang.Exception -> L137
            java.lang.String r6 = "Connection"
            java.lang.String r7 = "Keep-Alive"
            r10.setRequestProperty(r6, r7)     // Catch: java.lang.Throwable -> L132 java.lang.Exception -> L137
            java.lang.String r6 = "Charset"
            java.lang.String r7 = "UTF-8"
            r10.setRequestProperty(r6, r7)     // Catch: java.lang.Throwable -> L132 java.lang.Exception -> L137
            java.lang.String r6 = "Content-Type"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L132 java.lang.Exception -> L137
            r7.<init>()     // Catch: java.lang.Throwable -> L132 java.lang.Exception -> L137
            java.lang.String r8 = "multipart/form-data;boundary="
            r7.append(r8)     // Catch: java.lang.Throwable -> L132 java.lang.Exception -> L137
            r7.append(r2)     // Catch: java.lang.Throwable -> L132 java.lang.Exception -> L137
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L132 java.lang.Exception -> L137
            r10.setRequestProperty(r6, r7)     // Catch: java.lang.Throwable -> L132 java.lang.Exception -> L137
            java.io.DataOutputStream r6 = new java.io.DataOutputStream     // Catch: java.lang.Throwable -> L132 java.lang.Exception -> L137
            java.io.OutputStream r7 = r10.getOutputStream()     // Catch: java.lang.Throwable -> L132 java.lang.Exception -> L137
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L132 java.lang.Exception -> L137
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La7
            r7.<init>()     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La7
            r7.append(r1)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La7
            r7.append(r2)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La7
            r7.append(r0)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La7
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La7
            r6.writeBytes(r7)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La7
            r7.<init>()     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La7
            java.lang.String r8 = "Content-Disposition: form-data; name=\"file\";filename=\""
            r7.append(r8)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La7
            java.lang.String r8 = r11.getName()     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La7
            r7.append(r8)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La7
            java.lang.String r8 = "\""
            r7.append(r8)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La7
            r7.append(r0)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La7
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La7
            r6.writeBytes(r7)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La7
            r6.writeBytes(r0)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La7
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La7
            r7.<init>(r11)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La7
            r11 = 1024(0x400, float:1.435E-42)
            byte[] r11 = new byte[r11]     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La7
        L95:
            int r8 = r7.read(r11)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La7
            r9 = -1
            if (r8 == r9) goto Lad
            r6.write(r11, r5, r8)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La7
            goto L95
        La0:
            r10 = move-exception
            r11 = r4
            r0 = r11
            r1 = r0
        La4:
            r4 = r6
            goto L13d
        La7:
            r10 = r4
            r11 = r10
        Laa:
            r0 = r11
            goto L158
        Lad:
            r6.writeBytes(r0)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La7
            r7.close()     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La7
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La7
            r11.<init>()     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La7
            r11.append(r1)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La7
            r11.append(r2)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La7
            r11.append(r1)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La7
            r11.append(r0)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La7
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La7
            r6.writeBytes(r11)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La7
            r6.flush()     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La7
            int r11 = r10.getResponseCode()     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La7
            r0 = 200(0xc8, float:2.8E-43)
            if (r11 != r0) goto L112
            java.io.InputStream r10 = r10.getInputStream()     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La7
            java.io.InputStreamReader r11 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L109 java.lang.Exception -> L10f
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L109 java.lang.Exception -> L10f
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L100 java.lang.Exception -> L105
            r0.<init>(r11)     // Catch: java.lang.Throwable -> L100 java.lang.Exception -> L105
            java.lang.StringBuffer r3 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> Lf8 java.lang.Exception -> Lfd
            r3.<init>()     // Catch: java.lang.Throwable -> Lf8 java.lang.Exception -> Lfd
        Le9:
            java.lang.String r1 = r0.readLine()     // Catch: java.lang.Throwable -> Lf8 java.lang.Exception -> Lfd
            if (r1 == 0) goto L115
            r3.append(r1)     // Catch: java.lang.Throwable -> Lf8 java.lang.Exception -> Lfd
            java.lang.String r1 = "\n"
            r3.append(r1)     // Catch: java.lang.Throwable -> Lf8 java.lang.Exception -> Lfd
            goto Le9
        Lf8:
            r1 = move-exception
            r4 = r1
            r1 = r10
            r10 = r4
            goto La4
        Lfd:
            goto L158
        L100:
            r0 = move-exception
            r1 = r10
            r10 = r0
            r0 = r4
            goto La4
        L105:
            r0 = r4
            goto L158
        L109:
            r11 = move-exception
            r1 = r10
            r10 = r11
            r11 = r4
            r0 = r11
            goto La4
        L10f:
            r11 = r4
            goto Laa
        L112:
            r10 = r4
            r11 = r10
            r0 = r11
        L115:
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> Lf8 java.lang.Exception -> Lfd
            r6.close()     // Catch: java.io.IOException -> L11d
            goto L11e
        L11d:
        L11e:
            if (r0 == 0) goto L125
            r0.close()     // Catch: java.io.IOException -> L124
            goto L125
        L124:
        L125:
            if (r11 == 0) goto L12c
            r11.close()     // Catch: java.io.IOException -> L12b
            goto L12c
        L12b:
        L12c:
            if (r10 == 0) goto L131
            r10.close()     // Catch: java.io.IOException -> L131
        L131:
            return r1
        L132:
            r10 = move-exception
            r11 = r4
            r0 = r11
            r1 = r0
            goto L13d
        L137:
            r10 = r4
            r11 = r10
            r0 = r11
            r6 = r0
            goto L158
        L13d:
            if (r4 == 0) goto L144
            r4.close()     // Catch: java.io.IOException -> L143
            goto L144
        L143:
        L144:
            if (r0 == 0) goto L14b
            r0.close()     // Catch: java.io.IOException -> L14a
            goto L14b
        L14a:
        L14b:
            if (r11 == 0) goto L152
            r11.close()     // Catch: java.io.IOException -> L151
            goto L152
        L151:
        L152:
            if (r1 == 0) goto L157
            r1.close()     // Catch: java.io.IOException -> L157
        L157:
            throw r10
        L158:
            if (r6 == 0) goto L15f
            r6.close()     // Catch: java.io.IOException -> L15e
            goto L15f
        L15e:
        L15f:
            if (r0 == 0) goto L166
            r0.close()     // Catch: java.io.IOException -> L165
            goto L166
        L165:
        L166:
            if (r11 == 0) goto L16d
            r11.close()     // Catch: java.io.IOException -> L16c
            goto L16d
        L16c:
        L16d:
            if (r10 == 0) goto L172
            r10.close()     // Catch: java.io.IOException -> L172
        L172:
            return r4
    }

    public static java.lang.String a(java.lang.String r5, java.lang.String r6) {
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La3
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La3
            java.net.URLConnection r5 = r2.openConnection()     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La3
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La3
            java.lang.String r2 = "GET"
            r5.setRequestMethod(r2)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L35
            r2 = 10000(0x2710, float:1.4013E-41)
            r5.setConnectTimeout(r2)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L35
            r2 = 5000(0x1388, float:7.006E-42)
            r5.setReadTimeout(r2)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L35
            r2 = 0
            r5.setUseCaches(r2)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L35
            boolean r3 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L35
            if (r3 != 0) goto L3a
            java.lang.String r3 = "User-Agent"
            r5.setRequestProperty(r3, r6)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L35
            goto L3a
        L30:
            r6 = r1
        L32:
            r2 = r6
            goto La7
        L35:
            r6 = r1
        L37:
            r2 = r6
            goto Lb4
        L3a:
            r5.setChunkedStreamingMode(r2)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L35
            java.lang.String r6 = "Connection"
            java.lang.String r2 = "close"
            r5.setRequestProperty(r6, r2)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L35
            r6 = 1
            r5.setDoInput(r6)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L35
            r5.connect()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L35
            int r6 = r5.getResponseCode()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L35
            java.lang.String r2 = com.beizi.fusion.tool.v.a     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L35
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L35
            r3.<init>()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L35
            java.lang.String r4 = "get code:"
            r3.append(r4)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L35
            r3.append(r6)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L35
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L35
            com.beizi.fusion.tool.aa.a(r2, r3)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L35
            r2 = 200(0xc8, float:2.8E-43)
            if (r6 != r2) goto L9b
            java.io.InputStream r6 = r5.getInputStream()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L35
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L95 java.lang.Exception -> L98
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L95 java.lang.Exception -> L98
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L95 java.lang.Exception -> L98
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L95 java.lang.Exception -> L98
        L77:
            java.lang.String r3 = r2.readLine()     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            if (r3 == 0) goto L85
            r0.append(r3)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            goto L77
        L81:
            goto La7
        L83:
            goto Lb4
        L85:
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            r2.close()     // Catch: java.io.IOException -> L94
            if (r6 == 0) goto L91
            r6.close()     // Catch: java.io.IOException -> L94
        L91:
            r5.disconnect()     // Catch: java.io.IOException -> L94
        L94:
            return r0
        L95:
            r2 = r1
            goto La7
        L98:
            r2 = r1
            goto Lb4
        L9b:
            r5.disconnect()     // Catch: java.io.IOException -> Lc1
            goto Lc1
        L9f:
            r5 = r1
            r6 = r5
            goto L32
        La3:
            r5 = r1
            r6 = r5
            goto L37
        La7:
            if (r2 == 0) goto Lac
            r2.close()     // Catch: java.io.IOException -> Lc1
        Lac:
            if (r6 == 0) goto Lb1
            r6.close()     // Catch: java.io.IOException -> Lc1
        Lb1:
            if (r5 == 0) goto Lc1
            goto L9b
        Lb4:
            if (r2 == 0) goto Lb9
            r2.close()     // Catch: java.io.IOException -> Lc1
        Lb9:
            if (r6 == 0) goto Lbe
            r6.close()     // Catch: java.io.IOException -> Lc1
        Lbe:
            if (r5 == 0) goto Lc1
            goto L9b
        Lc1:
            return r1
    }

    public static java.lang.String a(java.lang.String r6, byte[] r7) {
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Laf
            r1.<init>(r6)     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Laf
            java.net.URLConnection r6 = r1.openConnection()     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Laf
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Laf
            java.lang.String r1 = "POST"
            r6.setRequestMethod(r1)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L50
            int r1 = r7.length     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L50
            java.lang.String r2 = "Content-Length"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L50
            r6.setRequestProperty(r2, r1)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L50
            java.lang.String r1 = "Content-Type"
            java.lang.String r2 = "application/json"
            r6.setRequestProperty(r1, r2)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L50
            r1 = 20000(0x4e20, float:2.8026E-41)
            r6.setConnectTimeout(r1)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L50
            r6.setReadTimeout(r1)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L50
            r1 = 1
            r6.setDoOutput(r1)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L50
            r6.setDoInput(r1)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L50
            r6.connect()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L50
            int r1 = r7.length     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L50
            if (r1 <= 0) goto L55
            java.io.OutputStream r1 = r6.getOutputStream()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L50
            r1.write(r7)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L45
            goto L56
        L3f:
            r7 = r0
            r2 = r7
        L42:
            r3 = r2
            goto Lb3
        L45:
            r7 = r0
            r2 = r7
        L48:
            r3 = r2
            goto Lcb
        L4b:
            r7 = r0
        L4d:
            r1 = r7
            r2 = r1
            goto L42
        L50:
            r7 = r0
        L52:
            r1 = r7
            r2 = r1
            goto L48
        L55:
            r1 = r0
        L56:
            int r7 = r6.getResponseCode()     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L45
            r2 = 200(0xc8, float:2.8E-43)
            if (r7 != r2) goto La5
            java.io.InputStream r7 = r6.getInputStream()     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L45
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La2
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La2
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9c
            java.lang.StringBuffer r4 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
            r4.<init>()     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
        L71:
            java.lang.String r5 = r3.readLine()     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
            if (r5 == 0) goto L7f
            r4.append(r5)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
            goto L71
        L7b:
            goto Lb3
        L7d:
            goto Lcb
        L7f:
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
            if (r7 == 0) goto L93
            r7.close()     // Catch: java.io.IOException -> L92
            r2.close()     // Catch: java.io.IOException -> L92
            r3.close()     // Catch: java.io.IOException -> L92
            r6.disconnect()     // Catch: java.io.IOException -> L92
            goto L93
        L92:
        L93:
            if (r1 == 0) goto L98
            r1.close()     // Catch: java.io.IOException -> L98
        L98:
            return r0
        L99:
            r3 = r0
            goto Lb3
        L9c:
            r3 = r0
            goto Lcb
        L9f:
            r2 = r0
            goto L42
        La2:
            r2 = r0
            goto L48
        La5:
            if (r1 == 0) goto Le3
        La7:
            r1.close()     // Catch: java.io.IOException -> Le3
            goto Le3
        Lab:
            r6 = r0
            r7 = r6
            goto L4d
        Laf:
            r6 = r0
            r7 = r6
            goto L52
        Lb3:
            if (r7 == 0) goto Lc8
            r7.close()     // Catch: java.io.IOException -> Lbe
            if (r2 == 0) goto Lc0
            r2.close()     // Catch: java.io.IOException -> Lbe
            goto Lc0
        Lbe:
            goto Lc8
        Lc0:
            if (r3 == 0) goto Lc5
            r3.close()     // Catch: java.io.IOException -> Lbe
        Lc5:
            r6.disconnect()     // Catch: java.io.IOException -> Lbe
        Lc8:
            if (r1 == 0) goto Le3
            goto La7
        Lcb:
            if (r7 == 0) goto Le0
            r7.close()     // Catch: java.io.IOException -> Ld6
            if (r2 == 0) goto Ld8
            r2.close()     // Catch: java.io.IOException -> Ld6
            goto Ld8
        Ld6:
            goto Le0
        Ld8:
            if (r3 == 0) goto Ldd
            r3.close()     // Catch: java.io.IOException -> Ld6
        Ldd:
            r6.disconnect()     // Catch: java.io.IOException -> Ld6
        Le0:
            if (r1 == 0) goto Le3
            goto La7
        Le3:
            return r0
    }

    private static byte[] a(android.content.Context r6, java.lang.String r7) {
            com.beizi.fusion.model.RequestInfo r0 = com.beizi.fusion.model.RequestInfo.getInstance(r6)     // Catch: java.lang.Throwable -> L17f
            boolean r1 = r0.isInit     // Catch: java.lang.Throwable -> L17f
            if (r1 != 0) goto Lb
            r0.init()     // Catch: java.lang.Throwable -> L17f
        Lb:
            com.beizi.fusion.model.DevInfo r1 = r0.getDevInfo()     // Catch: java.lang.Throwable -> L17f
            com.beizi.fusion.model.EnvInfo r2 = r0.getEnvInfo()     // Catch: java.lang.Throwable -> L17f
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L17f
            r3.<init>()     // Catch: java.lang.Throwable -> L17f
            java.lang.String r4 = "appId"
            r3.put(r4, r7)     // Catch: java.lang.Throwable -> L17f
            java.lang.String r7 = "packageName"
            java.lang.String r4 = com.beizi.fusion.tool.ap.c(r6)     // Catch: java.lang.Throwable -> L17f
            r3.put(r7, r4)     // Catch: java.lang.Throwable -> L17f
            java.lang.String r7 = "installTime"
            long r4 = com.beizi.fusion.tool.ap.a(r6)     // Catch: java.lang.Throwable -> L17f
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L17f
            r3.put(r7, r4)     // Catch: java.lang.Throwable -> L17f
            java.lang.String r7 = "updateTime"
            long r4 = com.beizi.fusion.tool.ap.b(r6)     // Catch: java.lang.Throwable -> L17f
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L17f
            r3.put(r7, r4)     // Catch: java.lang.Throwable -> L17f
            java.lang.String r7 = "uploadTime"
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L17f
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L17f
            r3.put(r7, r4)     // Catch: java.lang.Throwable -> L17f
            java.lang.String r7 = "appVersion"
            java.lang.String r4 = com.beizi.fusion.tool.ap.d(r6)     // Catch: java.lang.Throwable -> L17f
            r3.put(r7, r4)     // Catch: java.lang.Throwable -> L17f
            java.lang.String r7 = "sdkVersion"
            java.lang.String r4 = "5.2.1.20"
            r3.put(r7, r4)     // Catch: java.lang.Throwable -> L17f
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L17f
            r7.<init>()     // Catch: java.lang.Throwable -> L17f
            java.lang.String r4 = "sdkUID"
            java.lang.String r5 = r1.getSdkUID()     // Catch: java.lang.Throwable -> L17f
            r7.put(r4, r5)     // Catch: java.lang.Throwable -> L17f
            java.lang.String r4 = "sdkUIDOrig"
            java.lang.String r5 = r1.getSdkUIDOrig()     // Catch: java.lang.Throwable -> L17f
            r7.put(r4, r5)     // Catch: java.lang.Throwable -> L17f
            java.lang.String r4 = r1.getOaid()     // Catch: java.lang.Throwable -> L17f
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L17f
            java.lang.String r5 = "oaid"
            if (r4 != 0) goto L88
            java.lang.String r0 = r1.getOaid()
            r7.put(r5, r0)
            goto L99
        L88:
            java.lang.String r4 = r0.getCustomOaid()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L99
            java.lang.String r0 = r0.getCustomOaid()
            r7.put(r5, r0)
        L99:
            java.lang.String r0 = r1.getHonorOaid()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lac
            java.lang.String r0 = "honorOaid"
            java.lang.String r4 = r1.getHonorOaid()
            r7.put(r0, r4)
        Lac:
            java.lang.String r0 = "gaid"
            java.lang.String r4 = r1.getGaid()
            r7.put(r0, r4)
            java.lang.String r0 = "os"
            java.lang.String r4 = r1.getOs()
            r7.put(r0, r4)
            java.lang.String r0 = "platform"
            java.lang.String r4 = "2"
            r7.put(r0, r4)
            java.lang.String r0 = "devType"
            java.lang.String r4 = r1.getDevType()
            r7.put(r0, r4)
            java.lang.String r0 = "brand"
            java.lang.String r4 = r1.getBrand()
            r7.put(r0, r4)
            java.lang.String r0 = "model"
            java.lang.String r4 = r1.getModel()
            r7.put(r0, r4)
            java.lang.String r0 = "resolution"
            java.lang.String r4 = r1.getResolution()
            r7.put(r0, r4)
            java.lang.String r0 = "screenSize"
            java.lang.String r4 = r1.getScreenSize()
            r7.put(r0, r4)
            java.lang.String r0 = "language"
            java.lang.String r4 = r1.getLanguage()
            r7.put(r0, r4)
            java.lang.String r0 = "density"
            java.lang.String r4 = r1.getDensity()
            r7.put(r0, r4)
            java.lang.String r0 = "root"
            java.lang.String r1 = r1.getRoot()
            r7.put(r0, r1)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "net"
            java.lang.String r4 = r2.getNet()
            r0.put(r1, r4)
            java.lang.String r1 = "isp"
            java.lang.String r2 = r2.getIsp()
            r0.put(r1, r2)
            java.lang.String r1 = "developerMode"
            boolean r2 = com.beizi.fusion.tool.ap.g(r6)
            r0.put(r1, r2)
            java.lang.String r1 = "isDebugApk"
            boolean r2 = com.beizi.fusion.tool.ap.f(r6)
            r0.put(r1, r2)
            java.lang.String r1 = "isDebugConnected"
            boolean r2 = android.os.Debug.isDebuggerConnected()
            r0.put(r1, r2)
            java.lang.String r1 = "isWifiProxy"
            boolean r2 = com.beizi.fusion.tool.ap.h(r6)
            r0.put(r1, r2)
            java.lang.String r1 = "isVpn"
            boolean r2 = com.beizi.fusion.tool.ap.b()
            r0.put(r1, r2)
            java.lang.String r1 = "isSimulator"
            com.beizi.fusion.tool.q r2 = com.beizi.fusion.tool.q.a()
            boolean r6 = r2.a(r6)
            r0.put(r1, r6)
            java.lang.String r6 = "devInfo"
            r3.putOpt(r6, r7)
            java.lang.String r6 = "envInfo"
            r3.putOpt(r6, r0)
            java.lang.String r6 = r3.toString()
            java.lang.String r7 = com.beizi.fusion.tool.y.b()
            java.lang.String r6 = com.beizi.fusion.tool.a.a(r6, r7)
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L17f
            byte[] r6 = r6.getBytes()
            return r6
        L17f:
            r6 = 0
            return r6
    }

    private static byte[] b(android.content.Context r5, java.lang.String r6) {
            com.beizi.fusion.model.RequestInfo r5 = com.beizi.fusion.model.RequestInfo.getInstance(r5)     // Catch: java.lang.Throwable -> Le5
            boolean r0 = r5.isInit     // Catch: java.lang.Throwable -> Le5
            if (r0 != 0) goto Lb
            r5.init()     // Catch: java.lang.Throwable -> Le5
        Lb:
            com.beizi.fusion.model.DevInfo r0 = r5.getDevInfo()     // Catch: java.lang.Throwable -> Le5
            com.beizi.fusion.model.EnvInfo r5 = r5.getEnvInfo()     // Catch: java.lang.Throwable -> Le5
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Le5
            r1.<init>()     // Catch: java.lang.Throwable -> Le5
            java.lang.String r2 = "version"
            java.lang.String r3 = "5.2.1.20"
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> Le5
            java.lang.String r2 = "srcType"
            r3 = 1
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> Le5
            java.lang.String r2 = "timeStamp"
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Le5
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> Le5
            java.lang.String r2 = "appid"
            r1.put(r2, r6)     // Catch: java.lang.Throwable -> Le5
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Le5
            r6.<init>()     // Catch: java.lang.Throwable -> Le5
            java.lang.String r2 = "sdkUID"
            java.lang.String r3 = r0.getSdkUID()     // Catch: java.lang.Throwable -> Le5
            r6.put(r2, r3)     // Catch: java.lang.Throwable -> Le5
            java.lang.String r2 = "sdkUIDOrig"
            java.lang.String r3 = r0.getSdkUIDOrig()     // Catch: java.lang.Throwable -> Le5
            r6.put(r2, r3)     // Catch: java.lang.Throwable -> Le5
            java.lang.String r2 = "os"
            java.lang.String r3 = r0.getOs()     // Catch: java.lang.Throwable -> Le5
            r6.put(r2, r3)     // Catch: java.lang.Throwable -> Le5
            java.lang.String r2 = "platform"
            r3 = 2
            r6.put(r2, r3)     // Catch: java.lang.Throwable -> Le5
            java.lang.String r2 = "devType"
            java.lang.String r3 = r0.getDevType()     // Catch: java.lang.Throwable -> Le5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> Le5
            r6.put(r2, r3)     // Catch: java.lang.Throwable -> Le5
            java.lang.String r2 = "brand"
            java.lang.String r3 = r0.getBrand()     // Catch: java.lang.Throwable -> Le5
            r6.put(r2, r3)     // Catch: java.lang.Throwable -> Le5
            java.lang.String r2 = "model"
            java.lang.String r3 = r0.getModel()     // Catch: java.lang.Throwable -> Le5
            r6.put(r2, r3)     // Catch: java.lang.Throwable -> Le5
            java.lang.String r2 = "resolution"
            java.lang.String r3 = r0.getResolution()     // Catch: java.lang.Throwable -> Le5
            r6.put(r2, r3)     // Catch: java.lang.Throwable -> Le5
            java.lang.String r2 = "screenSize"
            java.lang.String r3 = r0.getScreenSize()     // Catch: java.lang.Throwable -> Le5
            r6.put(r2, r3)     // Catch: java.lang.Throwable -> Le5
            java.lang.String r2 = "language"
            java.lang.String r3 = r0.getLanguage()     // Catch: java.lang.Throwable -> Le5
            r6.put(r2, r3)     // Catch: java.lang.Throwable -> Le5
            java.lang.String r2 = "density"
            java.lang.String r3 = r0.getDensity()     // Catch: java.lang.Throwable -> Le5
            r6.put(r2, r3)     // Catch: java.lang.Throwable -> Le5
            java.lang.String r2 = "root"
            java.lang.String r0 = r0.getRoot()     // Catch: java.lang.Throwable -> Le5
            r6.put(r2, r0)     // Catch: java.lang.Throwable -> Le5
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Le5
            r0.<init>()     // Catch: java.lang.Throwable -> Le5
            java.lang.String r2 = "net"
            java.lang.String r3 = r5.getNet()     // Catch: java.lang.Throwable -> Le5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> Le5
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> Le5
            java.lang.String r2 = "isp"
            java.lang.String r5 = r5.getIsp()     // Catch: java.lang.Throwable -> Le5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> Le5
            r0.put(r2, r5)     // Catch: java.lang.Throwable -> Le5
            java.lang.String r5 = "devInfo"
            r1.putOpt(r5, r6)     // Catch: java.lang.Throwable -> Le5
            java.lang.String r5 = "envInfo"
            r1.putOpt(r5, r0)     // Catch: java.lang.Throwable -> Le5
            java.lang.String r5 = com.beizi.fusion.tool.y.a()     // Catch: java.lang.Throwable -> Le5
            java.lang.String r6 = r1.toString()     // Catch: java.lang.Throwable -> Le5
            java.lang.String r5 = com.beizi.fusion.tool.b.a(r5, r6)     // Catch: java.lang.Throwable -> Le5
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> Le5
            if (r6 != 0) goto Le5
            byte[] r5 = r5.getBytes()     // Catch: java.lang.Throwable -> Le5
            return r5
        Le5:
            r5 = 0
            return r5
    }
}
