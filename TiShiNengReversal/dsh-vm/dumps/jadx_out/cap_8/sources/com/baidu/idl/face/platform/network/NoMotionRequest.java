package com.baidu.idl.face.platform.network;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class NoMotionRequest extends com.baidu.idl.face.platform.network.BaseRequest {
    private static final java.lang.String TAG = "NoMotionRequest";
    public static final java.lang.String URL_POST_NOMOTION_LIVENESS = "";


    static {
            return
    }

    public NoMotionRequest() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ void access$000(java.lang.String r0, android.os.Handler r1) {
            httpUrlConnectionPost(r0, r1)
            return
    }

    private static void httpUrlConnectionPost(java.lang.String r9, android.os.Handler r10) {
            java.lang.String r0 = "8000"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = ""
            r1.<init>(r2)
            r3 = 0
            r4 = 0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14a java.lang.Exception -> L14f java.io.IOException -> L153 java.net.ProtocolException -> L157 java.io.UnsupportedEncodingException -> L15b java.net.MalformedURLException -> L15f
            r5.<init>()     // Catch: java.lang.Throwable -> L14a java.lang.Exception -> L14f java.io.IOException -> L153 java.net.ProtocolException -> L157 java.io.UnsupportedEncodingException -> L15b java.net.MalformedURLException -> L15f
            java.lang.String r6 = "pic_file="
            r5.append(r6)     // Catch: java.lang.Throwable -> L14a java.lang.Exception -> L14f java.io.IOException -> L153 java.net.ProtocolException -> L157 java.io.UnsupportedEncodingException -> L15b java.net.MalformedURLException -> L15f
            java.lang.String r6 = "UTF-8"
            java.lang.String r9 = java.net.URLEncoder.encode(r9, r6)     // Catch: java.lang.Throwable -> L14a java.lang.Exception -> L14f java.io.IOException -> L153 java.net.ProtocolException -> L157 java.io.UnsupportedEncodingException -> L15b java.net.MalformedURLException -> L15f
            r5.append(r9)     // Catch: java.lang.Throwable -> L14a java.lang.Exception -> L14f java.io.IOException -> L153 java.net.ProtocolException -> L157 java.io.UnsupportedEncodingException -> L15b java.net.MalformedURLException -> L15f
            java.lang.String r9 = r5.toString()     // Catch: java.lang.Throwable -> L14a java.lang.Exception -> L14f java.io.IOException -> L153 java.net.ProtocolException -> L157 java.io.UnsupportedEncodingException -> L15b java.net.MalformedURLException -> L15f
            java.net.URL r5 = new java.net.URL     // Catch: java.lang.Throwable -> L14a java.lang.Exception -> L14f java.io.IOException -> L153 java.net.ProtocolException -> L157 java.io.UnsupportedEncodingException -> L15b java.net.MalformedURLException -> L15f
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L14a java.lang.Exception -> L14f java.io.IOException -> L153 java.net.ProtocolException -> L157 java.io.UnsupportedEncodingException -> L15b java.net.MalformedURLException -> L15f
            java.net.URLConnection r2 = r5.openConnection()     // Catch: java.lang.Throwable -> L14a java.lang.Exception -> L14f java.io.IOException -> L153 java.net.ProtocolException -> L157 java.io.UnsupportedEncodingException -> L15b java.net.MalformedURLException -> L15f
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch: java.lang.Throwable -> L14a java.lang.Exception -> L14f java.io.IOException -> L153 java.net.ProtocolException -> L157 java.io.UnsupportedEncodingException -> L15b java.net.MalformedURLException -> L15f
            java.lang.String r5 = "sun.net.client.defaultConnectTimeout"
            java.lang.System.setProperty(r5, r0)     // Catch: java.lang.Throwable -> L128 java.lang.Exception -> L12c java.io.IOException -> L132 java.net.ProtocolException -> L138 java.io.UnsupportedEncodingException -> L13e java.net.MalformedURLException -> L144
            java.lang.String r5 = "sun.net.client.defaultReadTimeout"
            java.lang.System.setProperty(r5, r0)     // Catch: java.lang.Throwable -> L128 java.lang.Exception -> L12c java.io.IOException -> L132 java.net.ProtocolException -> L138 java.io.UnsupportedEncodingException -> L13e java.net.MalformedURLException -> L144
            r0 = 1
            r2.setDoOutput(r0)     // Catch: java.lang.Throwable -> L128 java.lang.Exception -> L12c java.io.IOException -> L132 java.net.ProtocolException -> L138 java.io.UnsupportedEncodingException -> L13e java.net.MalformedURLException -> L144
            r2.setDoInput(r0)     // Catch: java.lang.Throwable -> L128 java.lang.Exception -> L12c java.io.IOException -> L132 java.net.ProtocolException -> L138 java.io.UnsupportedEncodingException -> L13e java.net.MalformedURLException -> L144
            java.lang.String r5 = "POST"
            r2.setRequestMethod(r5)     // Catch: java.lang.Throwable -> L128 java.lang.Exception -> L12c java.io.IOException -> L132 java.net.ProtocolException -> L138 java.io.UnsupportedEncodingException -> L13e java.net.MalformedURLException -> L144
            r2.setUseCaches(r4)     // Catch: java.lang.Throwable -> L128 java.lang.Exception -> L12c java.io.IOException -> L132 java.net.ProtocolException -> L138 java.io.UnsupportedEncodingException -> L13e java.net.MalformedURLException -> L144
            r2.setInstanceFollowRedirects(r0)     // Catch: java.lang.Throwable -> L128 java.lang.Exception -> L12c java.io.IOException -> L132 java.net.ProtocolException -> L138 java.io.UnsupportedEncodingException -> L13e java.net.MalformedURLException -> L144
            java.lang.String r0 = "Content-Type"
            java.lang.String r5 = "application/x-www-form-urlencoded"
            r2.setRequestProperty(r0, r5)     // Catch: java.lang.Throwable -> L128 java.lang.Exception -> L12c java.io.IOException -> L132 java.net.ProtocolException -> L138 java.io.UnsupportedEncodingException -> L13e java.net.MalformedURLException -> L144
            r2.connect()     // Catch: java.lang.Throwable -> L128 java.lang.Exception -> L12c java.io.IOException -> L132 java.net.ProtocolException -> L138 java.io.UnsupportedEncodingException -> L13e java.net.MalformedURLException -> L144
            java.io.OutputStream r0 = r2.getOutputStream()     // Catch: java.lang.Throwable -> L128 java.lang.Exception -> L12c java.io.IOException -> L132 java.net.ProtocolException -> L138 java.io.UnsupportedEncodingException -> L13e java.net.MalformedURLException -> L144
            byte[] r9 = r9.getBytes()     // Catch: java.lang.Throwable -> L103 java.lang.Exception -> L10a java.io.IOException -> L110 java.net.ProtocolException -> L116 java.io.UnsupportedEncodingException -> L11c java.net.MalformedURLException -> L122
            r0.write(r9)     // Catch: java.lang.Throwable -> L103 java.lang.Exception -> L10a java.io.IOException -> L110 java.net.ProtocolException -> L116 java.io.UnsupportedEncodingException -> L11c java.net.MalformedURLException -> L122
            r0.flush()     // Catch: java.lang.Throwable -> L103 java.lang.Exception -> L10a java.io.IOException -> L110 java.net.ProtocolException -> L116 java.io.UnsupportedEncodingException -> L11c java.net.MalformedURLException -> L122
            r0.close()     // Catch: java.lang.Throwable -> L103 java.lang.Exception -> L10a java.io.IOException -> L110 java.net.ProtocolException -> L116 java.io.UnsupportedEncodingException -> L11c java.net.MalformedURLException -> L122
            int r9 = r2.getResponseCode()     // Catch: java.lang.Throwable -> L103 java.lang.Exception -> L10a java.io.IOException -> L110 java.net.ProtocolException -> L116 java.io.UnsupportedEncodingException -> L11c java.net.MalformedURLException -> L122
            r5 = 200(0xc8, float:2.8E-43)
            if (r5 != r9) goto Ldc
            java.io.InputStream r5 = r2.getInputStream()     // Catch: java.lang.Throwable -> Lc2 java.lang.Exception -> Lc8 java.io.IOException -> Lcc java.net.ProtocolException -> Ld0 java.io.UnsupportedEncodingException -> Ld4 java.net.MalformedURLException -> Ld8
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> Lae java.lang.Exception -> Lb3 java.io.IOException -> Lb6 java.net.ProtocolException -> Lb9 java.io.UnsupportedEncodingException -> Lbc java.net.MalformedURLException -> Lbf
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> Lae java.lang.Exception -> Lb3 java.io.IOException -> Lb6 java.net.ProtocolException -> Lb9 java.io.UnsupportedEncodingException -> Lbc java.net.MalformedURLException -> Lbf
            r7.<init>()     // Catch: java.lang.Throwable -> Lae java.lang.Exception -> Lb3 java.io.IOException -> Lb6 java.net.ProtocolException -> Lb9 java.io.UnsupportedEncodingException -> Lbc java.net.MalformedURLException -> Lbf
        L79:
            int r3 = r5.read(r6)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87 java.io.IOException -> L8b java.net.ProtocolException -> L8f java.io.UnsupportedEncodingException -> L93 java.net.MalformedURLException -> L97
            r8 = -1
            if (r3 == r8) goto L9b
            r7.write(r6, r4, r3)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87 java.io.IOException -> L8b java.net.ProtocolException -> L8f java.io.UnsupportedEncodingException -> L93 java.net.MalformedURLException -> L97
            goto L79
        L84:
            r3 = move-exception
            goto L163
        L87:
        L88:
            r3 = r0
            goto L18c
        L8b:
        L8c:
            r3 = r0
            goto L1a7
        L8f:
        L90:
            r3 = r0
            goto L1c2
        L93:
        L94:
            r3 = r0
            goto L1dd
        L97:
        L98:
            r3 = r0
            goto L1f8
        L9b:
            byte[] r3 = r7.toByteArray()     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87 java.io.IOException -> L8b java.net.ProtocolException -> L8f java.io.UnsupportedEncodingException -> L93 java.net.MalformedURLException -> L97
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87 java.io.IOException -> L8b java.net.ProtocolException -> L8f java.io.UnsupportedEncodingException -> L93 java.net.MalformedURLException -> L97
            java.lang.String r8 = "utf-8"
            r6.<init>(r3, r8)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87 java.io.IOException -> L8b java.net.ProtocolException -> L8f java.io.UnsupportedEncodingException -> L93 java.net.MalformedURLException -> L97
            r1.append(r6)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87 java.io.IOException -> L8b java.net.ProtocolException -> L8f java.io.UnsupportedEncodingException -> L93 java.net.MalformedURLException -> L97
            r7.flush()     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87 java.io.IOException -> L8b java.net.ProtocolException -> L8f java.io.UnsupportedEncodingException -> L93 java.net.MalformedURLException -> L97
            r3 = r7
            goto Ldd
        Lae:
            r6 = move-exception
            r7 = r3
            r3 = r6
            goto L163
        Lb3:
            r7 = r3
            goto L88
        Lb6:
            r7 = r3
            goto L8c
        Lb9:
            r7 = r3
            goto L90
        Lbc:
            r7 = r3
            goto L94
        Lbf:
            r7 = r3
            goto L98
        Lc2:
            r5 = move-exception
            r7 = r3
            r3 = r5
            r5 = r7
            goto L163
        Lc8:
            r5 = r3
            r7 = r5
            goto L88
        Lcc:
            r5 = r3
            r7 = r5
            goto L8c
        Ld0:
            r5 = r3
            r7 = r5
            goto L90
        Ld4:
            r5 = r3
            r7 = r5
            goto L94
        Ld8:
            r5 = r3
            r7 = r5
            goto L98
        Ldc:
            r5 = r3
        Ldd:
            r0.close()     // Catch: java.io.IOException -> Le6
            if (r3 == 0) goto Le8
            r3.close()     // Catch: java.io.IOException -> Le6
            goto Le8
        Le6:
            goto Lf0
        Le8:
            if (r5 == 0) goto Led
            r5.close()     // Catch: java.io.IOException -> Le6
        Led:
            r2.disconnect()     // Catch: java.io.IOException -> Le6
        Lf0:
            if (r10 == 0) goto L213
        Lf2:
            android.os.Message r0 = r10.obtainMessage(r4)
            r0.arg1 = r9
            java.lang.String r9 = r1.toString()
            r0.obj = r9
            r10.sendMessage(r0)
            goto L213
        L103:
            r9 = move-exception
            r5 = r3
        L105:
            r7 = r5
            r3 = r9
            r9 = 0
            goto L163
        L10a:
            r5 = r3
            r7 = r5
            r9 = 0
            goto L88
        L110:
            r5 = r3
            r7 = r5
            r9 = 0
            goto L8c
        L116:
            r5 = r3
            r7 = r5
            r9 = 0
            goto L90
        L11c:
            r5 = r3
            r7 = r5
            r9 = 0
            goto L94
        L122:
            r5 = r3
            r7 = r5
            r9 = 0
            goto L98
        L128:
            r9 = move-exception
            r0 = r3
            r5 = r0
            goto L105
        L12c:
            r5 = r3
        L12e:
            r7 = r5
            r9 = 0
            goto L18c
        L132:
            r5 = r3
        L134:
            r7 = r5
            r9 = 0
            goto L1a7
        L138:
            r5 = r3
        L13a:
            r7 = r5
            r9 = 0
            goto L1c2
        L13e:
            r5 = r3
        L140:
            r7 = r5
            r9 = 0
            goto L1dd
        L144:
            r5 = r3
        L146:
            r7 = r5
            r9 = 0
            goto L1f8
        L14a:
            r9 = move-exception
            r0 = r3
            r2 = r0
            r5 = r2
            goto L105
        L14f:
            r2 = r3
            r5 = r2
            goto L12e
        L153:
            r2 = r3
            r5 = r2
            goto L134
        L157:
            r2 = r3
            r5 = r2
            goto L13a
        L15b:
            r2 = r3
            r5 = r2
            goto L140
        L15f:
            r2 = r3
            r5 = r2
            goto L146
        L163:
            if (r0 == 0) goto L16b
            r0.close()     // Catch: java.io.IOException -> L169
            goto L16b
        L169:
            goto L17a
        L16b:
            if (r7 == 0) goto L170
            r7.close()     // Catch: java.io.IOException -> L169
        L170:
            if (r5 == 0) goto L175
            r5.close()     // Catch: java.io.IOException -> L169
        L175:
            if (r2 == 0) goto L17a
            r2.disconnect()     // Catch: java.io.IOException -> L169
        L17a:
            if (r10 == 0) goto L18b
            android.os.Message r0 = r10.obtainMessage(r4)
            r0.arg1 = r9
            java.lang.String r9 = r1.toString()
            r0.obj = r9
            r10.sendMessage(r0)
        L18b:
            throw r3
        L18c:
            if (r3 == 0) goto L194
            r3.close()     // Catch: java.io.IOException -> L192
            goto L194
        L192:
            goto L1a3
        L194:
            if (r7 == 0) goto L199
            r7.close()     // Catch: java.io.IOException -> L192
        L199:
            if (r5 == 0) goto L19e
            r5.close()     // Catch: java.io.IOException -> L192
        L19e:
            if (r2 == 0) goto L1a3
            r2.disconnect()     // Catch: java.io.IOException -> L192
        L1a3:
            if (r10 == 0) goto L213
            goto Lf2
        L1a7:
            if (r3 == 0) goto L1af
            r3.close()     // Catch: java.io.IOException -> L1ad
            goto L1af
        L1ad:
            goto L1be
        L1af:
            if (r7 == 0) goto L1b4
            r7.close()     // Catch: java.io.IOException -> L1ad
        L1b4:
            if (r5 == 0) goto L1b9
            r5.close()     // Catch: java.io.IOException -> L1ad
        L1b9:
            if (r2 == 0) goto L1be
            r2.disconnect()     // Catch: java.io.IOException -> L1ad
        L1be:
            if (r10 == 0) goto L213
            goto Lf2
        L1c2:
            if (r3 == 0) goto L1ca
            r3.close()     // Catch: java.io.IOException -> L1c8
            goto L1ca
        L1c8:
            goto L1d9
        L1ca:
            if (r7 == 0) goto L1cf
            r7.close()     // Catch: java.io.IOException -> L1c8
        L1cf:
            if (r5 == 0) goto L1d4
            r5.close()     // Catch: java.io.IOException -> L1c8
        L1d4:
            if (r2 == 0) goto L1d9
            r2.disconnect()     // Catch: java.io.IOException -> L1c8
        L1d9:
            if (r10 == 0) goto L213
            goto Lf2
        L1dd:
            if (r3 == 0) goto L1e5
            r3.close()     // Catch: java.io.IOException -> L1e3
            goto L1e5
        L1e3:
            goto L1f4
        L1e5:
            if (r7 == 0) goto L1ea
            r7.close()     // Catch: java.io.IOException -> L1e3
        L1ea:
            if (r5 == 0) goto L1ef
            r5.close()     // Catch: java.io.IOException -> L1e3
        L1ef:
            if (r2 == 0) goto L1f4
            r2.disconnect()     // Catch: java.io.IOException -> L1e3
        L1f4:
            if (r10 == 0) goto L213
            goto Lf2
        L1f8:
            if (r3 == 0) goto L200
            r3.close()     // Catch: java.io.IOException -> L1fe
            goto L200
        L1fe:
            goto L20f
        L200:
            if (r7 == 0) goto L205
            r7.close()     // Catch: java.io.IOException -> L1fe
        L205:
            if (r5 == 0) goto L20a
            r5.close()     // Catch: java.io.IOException -> L1fe
        L20a:
            if (r2 == 0) goto L20f
            r2.disconnect()     // Catch: java.io.IOException -> L1fe
        L20f:
            if (r10 == 0) goto L213
            goto Lf2
        L213:
            return
    }

    public static void sendMessage(java.lang.String r2, android.os.Handler r3) {
            if (r2 == 0) goto L15
            int r0 = r2.length()
            if (r0 <= 0) goto L15
            java.lang.Thread r0 = new java.lang.Thread
            com.baidu.idl.face.platform.network.NoMotionRequest$1 r1 = new com.baidu.idl.face.platform.network.NoMotionRequest$1
            r1.<init>(r2, r3)
            r0.<init>(r1)
            r0.start()
        L15:
            return
    }
}
