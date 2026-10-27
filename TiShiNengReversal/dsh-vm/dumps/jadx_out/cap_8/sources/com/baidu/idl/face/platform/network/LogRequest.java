package com.baidu.idl.face.platform.network;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class LogRequest extends com.baidu.idl.face.platform.network.BaseRequest {
    public static final java.lang.String URL_GET_LOG = "";


    public LogRequest() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ void access$000(java.lang.String r0) {
            httpUrlConnectionPost(r0)
            return
    }

    private static void httpUrlConnectionPost(java.lang.String r9) {
            java.lang.String r0 = "utf-8"
            java.lang.String r1 = "8000"
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            r3 = 0
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L101 java.lang.Exception -> L105 java.io.IOException -> L109 java.net.ProtocolException -> L10d java.io.UnsupportedEncodingException -> L111 java.net.MalformedURLException -> L115
            r4.<init>(r9)     // Catch: java.lang.Throwable -> L101 java.lang.Exception -> L105 java.io.IOException -> L109 java.net.ProtocolException -> L10d java.io.UnsupportedEncodingException -> L111 java.net.MalformedURLException -> L115
            java.net.URL r9 = new java.net.URL     // Catch: java.lang.Throwable -> L101 java.lang.Exception -> L105 java.io.IOException -> L109 java.net.ProtocolException -> L10d java.io.UnsupportedEncodingException -> L111 java.net.MalformedURLException -> L115
            java.lang.String r5 = ""
            r9.<init>(r5)     // Catch: java.lang.Throwable -> L101 java.lang.Exception -> L105 java.io.IOException -> L109 java.net.ProtocolException -> L10d java.io.UnsupportedEncodingException -> L111 java.net.MalformedURLException -> L115
            java.net.URLConnection r9 = r9.openConnection()     // Catch: java.lang.Throwable -> L101 java.lang.Exception -> L105 java.io.IOException -> L109 java.net.ProtocolException -> L10d java.io.UnsupportedEncodingException -> L111 java.net.MalformedURLException -> L115
            java.net.HttpURLConnection r9 = (java.net.HttpURLConnection) r9     // Catch: java.lang.Throwable -> L101 java.lang.Exception -> L105 java.io.IOException -> L109 java.net.ProtocolException -> L10d java.io.UnsupportedEncodingException -> L111 java.net.MalformedURLException -> L115
            java.lang.String r5 = "sun.net.client.defaultConnectTimeout"
            java.lang.System.setProperty(r5, r1)     // Catch: java.lang.Throwable -> Le4 java.lang.Exception -> Le8 java.io.IOException -> Led java.net.ProtocolException -> Lf2 java.io.UnsupportedEncodingException -> Lf7 java.net.MalformedURLException -> Lfc
            java.lang.String r5 = "sun.net.client.defaultReadTimeout"
            java.lang.System.setProperty(r5, r1)     // Catch: java.lang.Throwable -> Le4 java.lang.Exception -> Le8 java.io.IOException -> Led java.net.ProtocolException -> Lf2 java.io.UnsupportedEncodingException -> Lf7 java.net.MalformedURLException -> Lfc
            r1 = 1
            r9.setDoOutput(r1)     // Catch: java.lang.Throwable -> Le4 java.lang.Exception -> Le8 java.io.IOException -> Led java.net.ProtocolException -> Lf2 java.io.UnsupportedEncodingException -> Lf7 java.net.MalformedURLException -> Lfc
            r9.setDoInput(r1)     // Catch: java.lang.Throwable -> Le4 java.lang.Exception -> Le8 java.io.IOException -> Led java.net.ProtocolException -> Lf2 java.io.UnsupportedEncodingException -> Lf7 java.net.MalformedURLException -> Lfc
            java.lang.String r5 = "GET"
            r9.setRequestMethod(r5)     // Catch: java.lang.Throwable -> Le4 java.lang.Exception -> Le8 java.io.IOException -> Led java.net.ProtocolException -> Lf2 java.io.UnsupportedEncodingException -> Lf7 java.net.MalformedURLException -> Lfc
            java.lang.String r5 = "Charset"
            java.lang.String r6 = "UTF-8"
            r9.setRequestProperty(r5, r6)     // Catch: java.lang.Throwable -> Le4 java.lang.Exception -> Le8 java.io.IOException -> Led java.net.ProtocolException -> Lf2 java.io.UnsupportedEncodingException -> Lf7 java.net.MalformedURLException -> Lfc
            r5 = 0
            r9.setUseCaches(r5)     // Catch: java.lang.Throwable -> Le4 java.lang.Exception -> Le8 java.io.IOException -> Led java.net.ProtocolException -> Lf2 java.io.UnsupportedEncodingException -> Lf7 java.net.MalformedURLException -> Lfc
            r9.setInstanceFollowRedirects(r1)     // Catch: java.lang.Throwable -> Le4 java.lang.Exception -> Le8 java.io.IOException -> Led java.net.ProtocolException -> Lf2 java.io.UnsupportedEncodingException -> Lf7 java.net.MalformedURLException -> Lfc
            java.lang.String r1 = "contentType"
            java.lang.String r6 = "application/json"
            r9.setRequestProperty(r1, r6)     // Catch: java.lang.Throwable -> Le4 java.lang.Exception -> Le8 java.io.IOException -> Led java.net.ProtocolException -> Lf2 java.io.UnsupportedEncodingException -> Lf7 java.net.MalformedURLException -> Lfc
            r9.connect()     // Catch: java.lang.Throwable -> Le4 java.lang.Exception -> Le8 java.io.IOException -> Led java.net.ProtocolException -> Lf2 java.io.UnsupportedEncodingException -> Lf7 java.net.MalformedURLException -> Lfc
            java.io.OutputStream r1 = r9.getOutputStream()     // Catch: java.lang.Throwable -> Le4 java.lang.Exception -> Le8 java.io.IOException -> Led java.net.ProtocolException -> Lf2 java.io.UnsupportedEncodingException -> Lf7 java.net.MalformedURLException -> Lfc
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Lba java.lang.Exception -> Lbe java.io.IOException -> Lc2 java.net.ProtocolException -> Lc6 java.io.UnsupportedEncodingException -> Lca java.net.MalformedURLException -> Lce
            byte[] r4 = r4.getBytes(r0)     // Catch: java.lang.Throwable -> Lba java.lang.Exception -> Lbe java.io.IOException -> Lc2 java.net.ProtocolException -> Lc6 java.io.UnsupportedEncodingException -> Lca java.net.MalformedURLException -> Lce
            r1.write(r4)     // Catch: java.lang.Throwable -> Lba java.lang.Exception -> Lbe java.io.IOException -> Lc2 java.net.ProtocolException -> Lc6 java.io.UnsupportedEncodingException -> Lca java.net.MalformedURLException -> Lce
            r1.flush()     // Catch: java.lang.Throwable -> Lba java.lang.Exception -> Lbe java.io.IOException -> Lc2 java.net.ProtocolException -> Lc6 java.io.UnsupportedEncodingException -> Lca java.net.MalformedURLException -> Lce
            r1.close()     // Catch: java.lang.Throwable -> Lba java.lang.Exception -> Lbe java.io.IOException -> Lc2 java.net.ProtocolException -> Lc6 java.io.UnsupportedEncodingException -> Lca java.net.MalformedURLException -> Lce
            int r4 = r9.getResponseCode()     // Catch: java.lang.Throwable -> Lba java.lang.Exception -> Lbe java.io.IOException -> Lc2 java.net.ProtocolException -> Lc6 java.io.UnsupportedEncodingException -> Lca java.net.MalformedURLException -> Lce
            r6 = 200(0xc8, float:2.8E-43)
            if (r6 != r4) goto Ld2
            java.io.InputStream r4 = r9.getInputStream()     // Catch: java.lang.Throwable -> Lba java.lang.Exception -> Lbe java.io.IOException -> Lc2 java.net.ProtocolException -> Lc6 java.io.UnsupportedEncodingException -> Lca java.net.MalformedURLException -> Lce
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab java.io.IOException -> Lae java.net.ProtocolException -> Lb1 java.io.UnsupportedEncodingException -> Lb4 java.net.MalformedURLException -> Lb7
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab java.io.IOException -> Lae java.net.ProtocolException -> Lb1 java.io.UnsupportedEncodingException -> Lb4 java.net.MalformedURLException -> Lb7
            r7.<init>()     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab java.io.IOException -> Lae java.net.ProtocolException -> Lb1 java.io.UnsupportedEncodingException -> Lb4 java.net.MalformedURLException -> Lb7
        L74:
            int r3 = r4.read(r6)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L83 java.io.IOException -> L87 java.net.ProtocolException -> L8b java.io.UnsupportedEncodingException -> L8f java.net.MalformedURLException -> L93
            r8 = -1
            if (r3 == r8) goto L97
            r7.write(r6, r5, r3)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L83 java.io.IOException -> L87 java.net.ProtocolException -> L8b java.io.UnsupportedEncodingException -> L8f java.net.MalformedURLException -> L93
            goto L74
        L7f:
            r0 = move-exception
        L80:
            r3 = r1
            goto L119
        L83:
        L84:
            r3 = r1
            goto L12e
        L87:
        L88:
            r3 = r1
            goto L143
        L8b:
        L8c:
            r3 = r1
            goto L155
        L8f:
        L90:
            r3 = r1
            goto L167
        L93:
        L94:
            r3 = r1
            goto L179
        L97:
            byte[] r3 = r7.toByteArray()     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L83 java.io.IOException -> L87 java.net.ProtocolException -> L8b java.io.UnsupportedEncodingException -> L8f java.net.MalformedURLException -> L93
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L83 java.io.IOException -> L87 java.net.ProtocolException -> L8b java.io.UnsupportedEncodingException -> L8f java.net.MalformedURLException -> L93
            r5.<init>(r3, r0)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L83 java.io.IOException -> L87 java.net.ProtocolException -> L8b java.io.UnsupportedEncodingException -> L8f java.net.MalformedURLException -> L93
            r2.append(r5)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L83 java.io.IOException -> L87 java.net.ProtocolException -> L8b java.io.UnsupportedEncodingException -> L8f java.net.MalformedURLException -> L93
            r7.flush()     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L83 java.io.IOException -> L87 java.net.ProtocolException -> L8b java.io.UnsupportedEncodingException -> L8f java.net.MalformedURLException -> L93
            r3 = r7
            goto Ld3
        La8:
            r0 = move-exception
            r7 = r3
            goto L80
        Lab:
            r7 = r3
            goto L84
        Lae:
            r7 = r3
            goto L88
        Lb1:
            r7 = r3
            goto L8c
        Lb4:
            r7 = r3
            goto L90
        Lb7:
            r7 = r3
            goto L94
        Lba:
            r0 = move-exception
            r4 = r3
            r7 = r4
            goto L80
        Lbe:
            r4 = r3
            r7 = r4
            goto L84
        Lc2:
            r4 = r3
            r7 = r4
            goto L88
        Lc6:
            r4 = r3
            r7 = r4
            goto L8c
        Lca:
            r4 = r3
            r7 = r4
            goto L90
        Lce:
            r4 = r3
            r7 = r4
            goto L94
        Ld2:
            r4 = r3
        Ld3:
            r1.close()     // Catch: java.io.IOException -> L18b
            if (r3 == 0) goto Ldb
            r3.close()     // Catch: java.io.IOException -> L18b
        Ldb:
            if (r4 == 0) goto Le0
            r4.close()     // Catch: java.io.IOException -> L18b
        Le0:
            r9.disconnect()     // Catch: java.io.IOException -> L18b
            return
        Le4:
            r0 = move-exception
            r4 = r3
        Le6:
            r7 = r4
            goto L119
        Le8:
            r4 = r3
        Lea:
            r7 = r4
            goto L12e
        Led:
            r4 = r3
        Lef:
            r7 = r4
            goto L143
        Lf2:
            r4 = r3
        Lf4:
            r7 = r4
            goto L155
        Lf7:
            r4 = r3
        Lf9:
            r7 = r4
            goto L167
        Lfc:
            r4 = r3
        Lfe:
            r7 = r4
            goto L179
        L101:
            r0 = move-exception
            r9 = r3
            r4 = r9
            goto Le6
        L105:
            r9 = r3
            r4 = r9
            goto Lea
        L109:
            r9 = r3
            r4 = r9
            goto Lef
        L10d:
            r9 = r3
            r4 = r9
            goto Lf4
        L111:
            r9 = r3
            r4 = r9
            goto Lf9
        L115:
            r9 = r3
            r4 = r9
            goto Lfe
        L119:
            if (r3 == 0) goto L11e
            r3.close()     // Catch: java.io.IOException -> L12d
        L11e:
            if (r7 == 0) goto L123
            r7.close()     // Catch: java.io.IOException -> L12d
        L123:
            if (r4 == 0) goto L128
            r4.close()     // Catch: java.io.IOException -> L12d
        L128:
            if (r9 == 0) goto L12d
            r9.disconnect()     // Catch: java.io.IOException -> L12d
        L12d:
            throw r0
        L12e:
            if (r3 == 0) goto L133
            r3.close()     // Catch: java.io.IOException -> L18b
        L133:
            if (r7 == 0) goto L138
            r7.close()     // Catch: java.io.IOException -> L18b
        L138:
            if (r4 == 0) goto L13d
            r4.close()     // Catch: java.io.IOException -> L18b
        L13d:
            if (r9 == 0) goto L18b
        L13f:
            r9.disconnect()     // Catch: java.io.IOException -> L18b
            goto L18b
        L143:
            if (r3 == 0) goto L148
            r3.close()     // Catch: java.io.IOException -> L18b
        L148:
            if (r7 == 0) goto L14d
            r7.close()     // Catch: java.io.IOException -> L18b
        L14d:
            if (r4 == 0) goto L152
            r4.close()     // Catch: java.io.IOException -> L18b
        L152:
            if (r9 == 0) goto L18b
            goto L13f
        L155:
            if (r3 == 0) goto L15a
            r3.close()     // Catch: java.io.IOException -> L18b
        L15a:
            if (r7 == 0) goto L15f
            r7.close()     // Catch: java.io.IOException -> L18b
        L15f:
            if (r4 == 0) goto L164
            r4.close()     // Catch: java.io.IOException -> L18b
        L164:
            if (r9 == 0) goto L18b
            goto L13f
        L167:
            if (r3 == 0) goto L16c
            r3.close()     // Catch: java.io.IOException -> L18b
        L16c:
            if (r7 == 0) goto L171
            r7.close()     // Catch: java.io.IOException -> L18b
        L171:
            if (r4 == 0) goto L176
            r4.close()     // Catch: java.io.IOException -> L18b
        L176:
            if (r9 == 0) goto L18b
            goto L13f
        L179:
            if (r3 == 0) goto L17e
            r3.close()     // Catch: java.io.IOException -> L18b
        L17e:
            if (r7 == 0) goto L183
            r7.close()     // Catch: java.io.IOException -> L18b
        L183:
            if (r4 == 0) goto L188
            r4.close()     // Catch: java.io.IOException -> L18b
        L188:
            if (r9 == 0) goto L18b
            goto L13f
        L18b:
            return
    }

    public static void sendLogMessage(java.lang.String r2) {
            if (r2 == 0) goto L15
            int r0 = r2.length()
            if (r0 <= 0) goto L15
            java.lang.Thread r0 = new java.lang.Thread
            com.baidu.idl.face.platform.network.LogRequest$1 r1 = new com.baidu.idl.face.platform.network.LogRequest$1
            r1.<init>(r2)
            r0.<init>(r1)
            r0.start()
        L15:
            return
    }
}
