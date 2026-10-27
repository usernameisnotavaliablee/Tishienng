package com.tencent.mm.opensdk.channel.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.tencent.mm.opensdk.channel.a.a$a, reason: collision with other inner class name */
    public static class C0032a {
        public java.lang.String a;
        public java.lang.String b;
        public java.lang.String c;
        public long d;
        public android.os.Bundle e;

        public C0032a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static int a(android.os.Bundle r1, java.lang.String r2, int r3) {
            if (r1 != 0) goto L3
            return r3
        L3:
            int r1 = r1.getInt(r2, r3)     // Catch: java.lang.Exception -> L8
            return r1
        L8:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "getIntExtra exception:"
            r2.append(r0)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "MicroMsg.IntentUtil"
            com.tencent.mm.opensdk.utils.Log.e(r2, r1)
            return r3
    }

    public static java.lang.Object a(int r2, java.lang.String r3) {
            java.lang.String r0 = "MicroMsg.SDK.PluginProvider.Resolver"
            switch(r2) {
                case 1: goto L22;
                case 2: goto L1d;
                case 3: goto L1c;
                case 4: goto L17;
                case 5: goto L12;
                case 6: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.String r2 = "unknown type"
            com.tencent.mm.opensdk.utils.Log.e(r0, r2)     // Catch: java.lang.Exception -> Lb
            goto L3f
        Lb:
            r2 = move-exception
            goto L27
        Ld:
            java.lang.Double r2 = java.lang.Double.valueOf(r3)     // Catch: java.lang.Exception -> Lb
            return r2
        L12:
            java.lang.Float r2 = java.lang.Float.valueOf(r3)     // Catch: java.lang.Exception -> Lb
            return r2
        L17:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Exception -> Lb
            return r2
        L1c:
            return r3
        L1d:
            java.lang.Long r2 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Exception -> Lb
            return r2
        L22:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> Lb
            return r2
        L27:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = "resolveObj exception:"
            r3.append(r1)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.tencent.mm.opensdk.utils.Log.e(r0, r2)
        L3f:
            r2 = 0
            return r2
    }

    public static java.lang.String a(android.os.Bundle r2, java.lang.String r3) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.String r2 = r2.getString(r3)     // Catch: java.lang.Exception -> L9
            return r2
        L9:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = "getStringExtra exception:"
            r3.append(r1)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "MicroMsg.IntentUtil"
            com.tencent.mm.opensdk.utils.Log.e(r3, r2)
            return r0
    }

    public static boolean a(android.content.Context r8, com.tencent.mm.opensdk.channel.a.a.C0032a r9) {
            r0 = 0
            java.lang.String r1 = "MicroMsg.SDK.MMessage"
            if (r8 == 0) goto L8c
            if (r9 != 0) goto L9
            goto L8c
        L9:
            java.lang.String r2 = r9.b
            boolean r2 = com.tencent.mm.opensdk.utils.b.b(r2)
            if (r2 == 0) goto L17
            java.lang.String r8 = "send fail, action is null"
        L13:
            com.tencent.mm.opensdk.utils.Log.e(r1, r8)
            return r0
        L17:
            java.lang.String r0 = r9.a
            boolean r0 = com.tencent.mm.opensdk.utils.b.b(r0)
            if (r0 != 0) goto L33
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r9.a
            r0.append(r2)
            java.lang.String r2 = ".permission.MM_MESSAGE"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            goto L34
        L33:
            r0 = 0
        L34:
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = r9.b
            r2.<init>(r3)
            android.os.Bundle r3 = r9.e
            if (r3 == 0) goto L42
            r2.putExtras(r3)
        L42:
            java.lang.String r3 = r8.getPackageName()
            java.lang.String r4 = "_mmessage_sdkVersion"
            r5 = 638058496(0x26080000, float:4.718448E-16)
            r2.putExtra(r4, r5)
            java.lang.String r4 = "_mmessage_appPackage"
            r2.putExtra(r4, r3)
            java.lang.String r4 = r9.c
            java.lang.String r6 = "_mmessage_content"
            r2.putExtra(r6, r4)
            long r6 = r9.d
            java.lang.String r4 = "_mmessage_support_content_type"
            r2.putExtra(r4, r6)
            java.lang.String r9 = r9.c
            byte[] r9 = a(r9, r5, r3)
            java.lang.String r3 = "_mmessage_checksum"
            r2.putExtra(r3, r9)
            r8.sendBroadcast(r2, r0)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "send mm message, intent="
            r8.append(r9)
            r8.append(r2)
            java.lang.String r9 = ", perm="
            r8.append(r9)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            com.tencent.mm.opensdk.utils.Log.d(r1, r8)
            r8 = 1
            return r8
        L8c:
            java.lang.String r8 = "send fail, invalid argument"
            goto L13
    }

    public static byte[] a(java.lang.String r8, int r9) {
            java.lang.String r0 = "httpGet ex:"
            java.lang.String r1 = "MicroMsg.SDK.NetUtil"
            r2 = 0
            if (r8 == 0) goto L17b
            int r3 = r8.length()
            if (r3 != 0) goto Lf
            goto L17b
        Lf:
            java.net.URL r3 = new java.net.URL     // Catch: java.lang.Throwable -> Lc8 java.lang.Exception -> Lcd java.io.IOException -> Ld2 java.net.MalformedURLException -> Ld7
            r3.<init>(r8)     // Catch: java.lang.Throwable -> Lc8 java.lang.Exception -> Lcd java.io.IOException -> Ld2 java.net.MalformedURLException -> Ld7
            java.net.URLConnection r8 = r3.openConnection()     // Catch: java.lang.Throwable -> Lc8 java.lang.Exception -> Lcd java.io.IOException -> Ld2 java.net.MalformedURLException -> Ld7
            java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8     // Catch: java.lang.Throwable -> Lc8 java.lang.Exception -> Lcd java.io.IOException -> Ld2 java.net.MalformedURLException -> Ld7
            if (r8 != 0) goto L2f
            java.lang.String r9 = "open connection failed."
            com.tencent.mm.opensdk.utils.Log.e(r1, r9)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L29 java.io.IOException -> L2b java.net.MalformedURLException -> L2d
            if (r8 == 0) goto L26
            r8.disconnect()     // Catch: java.lang.Throwable -> L26
        L26:
            return r2
        L27:
            r9 = move-exception
            goto L4b
        L29:
            r9 = move-exception
            goto L4e
        L2b:
            r9 = move-exception
            goto L52
        L2d:
            r9 = move-exception
            goto L56
        L2f:
            java.lang.String r3 = "GET"
            r8.setRequestMethod(r3)     // Catch: java.lang.Throwable -> Lba java.lang.Exception -> Lbd java.io.IOException -> Lc0 java.net.MalformedURLException -> Lc4
            r8.setConnectTimeout(r9)     // Catch: java.lang.Throwable -> Lba java.lang.Exception -> Lbd java.io.IOException -> Lc0 java.net.MalformedURLException -> Lc4
            r8.setReadTimeout(r9)     // Catch: java.lang.Throwable -> Lba java.lang.Exception -> Lbd java.io.IOException -> Lc0 java.net.MalformedURLException -> Lc4
            int r9 = r8.getResponseCode()     // Catch: java.lang.Throwable -> Lba java.lang.Exception -> Lbd java.io.IOException -> Lc0 java.net.MalformedURLException -> Lc4
            r3 = 300(0x12c, float:4.2E-43)
            if (r9 < r3) goto L5a
            java.lang.String r9 = "httpURLConnectionGet 300"
            com.tencent.mm.opensdk.utils.Log.e(r1, r9)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L29 java.io.IOException -> L2b java.net.MalformedURLException -> L2d
            r8.disconnect()     // Catch: java.lang.Throwable -> L4a
        L4a:
            return r2
        L4b:
            r0 = r2
            goto L167
        L4e:
            r3 = r2
            r4 = r3
            goto Le2
        L52:
            r3 = r2
            r4 = r3
            goto L110
        L56:
            r3 = r2
            r4 = r3
            goto L13b
        L5a:
            java.io.InputStream r9 = r8.getInputStream()     // Catch: java.lang.Throwable -> Lba java.lang.Exception -> Lbd java.io.IOException -> Lc0 java.net.MalformedURLException -> Lc4
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> La9 java.io.IOException -> Lae java.net.MalformedURLException -> Lb4
            r3.<init>()     // Catch: java.lang.Throwable -> La4 java.lang.Exception -> La9 java.io.IOException -> Lae java.net.MalformedURLException -> Lb4
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L79 java.io.IOException -> L7b java.net.MalformedURLException -> L7d
        L67:
            int r5 = r9.read(r4)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L79 java.io.IOException -> L7b java.net.MalformedURLException -> L7d
            r6 = -1
            if (r5 == r6) goto L7f
            r6 = 0
            r3.write(r4, r6, r5)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L79 java.io.IOException -> L7b java.net.MalformedURLException -> L7d
            goto L67
        L73:
            r0 = move-exception
            r2 = r3
            r3 = r9
            r9 = r0
            goto L165
        L79:
            r4 = move-exception
            goto L92
        L7b:
            r4 = move-exception
            goto L98
        L7d:
            r4 = move-exception
            goto L9e
        L7f:
            byte[] r4 = r3.toByteArray()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L79 java.io.IOException -> L7b java.net.MalformedURLException -> L7d
            java.lang.String r5 = "httpGet end"
            com.tencent.mm.opensdk.utils.Log.d(r1, r5)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L79 java.io.IOException -> L7b java.net.MalformedURLException -> L7d
            r8.disconnect()     // Catch: java.lang.Throwable -> L8b
        L8b:
            r9.close()     // Catch: java.lang.Throwable -> L8e
        L8e:
            r3.close()     // Catch: java.lang.Throwable -> L91
        L91:
            return r4
        L92:
            r7 = r3
            r3 = r9
            r9 = r4
            r4 = r7
            goto Le2
        L98:
            r7 = r3
            r3 = r9
            r9 = r4
            r4 = r7
            goto L110
        L9e:
            r7 = r3
            r3 = r9
            r9 = r4
            r4 = r7
            goto L13b
        La4:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
            goto Ldc
        La9:
            r3 = move-exception
            r7 = r3
            r3 = r9
            r9 = r7
            goto Le1
        Lae:
            r3 = move-exception
            r7 = r3
            r3 = r9
            r9 = r7
            goto L10f
        Lb4:
            r3 = move-exception
            r7 = r3
            r3 = r9
            r9 = r7
            goto L13a
        Lba:
            r9 = move-exception
            r0 = r2
            goto Ldc
        Lbd:
            r9 = move-exception
            r3 = r2
            goto Le1
        Lc0:
            r9 = move-exception
            r3 = r2
            goto L10f
        Lc4:
            r9 = move-exception
            r3 = r2
            goto L13a
        Lc8:
            r8 = move-exception
            r9 = r8
            r8 = r2
            r0 = r8
            goto Ldc
        Lcd:
            r8 = move-exception
            r9 = r8
            r8 = r2
            r3 = r8
            goto Le1
        Ld2:
            r8 = move-exception
            r9 = r8
            r8 = r2
            r3 = r8
            goto L10f
        Ld7:
            r8 = move-exception
            r9 = r8
            r8 = r2
            r3 = r8
            goto L13a
        Ldc:
            r7 = r2
            r2 = r0
            r0 = r7
            goto L167
        Le1:
            r4 = r2
        Le2:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10c
            r5.<init>()     // Catch: java.lang.Throwable -> L10c
            r5.append(r0)     // Catch: java.lang.Throwable -> L10c
            java.lang.String r9 = r9.getMessage()     // Catch: java.lang.Throwable -> L10c
            r5.append(r9)     // Catch: java.lang.Throwable -> L10c
            java.lang.String r9 = r5.toString()     // Catch: java.lang.Throwable -> L10c
            com.tencent.mm.opensdk.utils.Log.e(r1, r9)     // Catch: java.lang.Throwable -> L10c
            if (r8 == 0) goto Lff
            r8.disconnect()     // Catch: java.lang.Throwable -> Lfe
            goto Lff
        Lfe:
        Lff:
            if (r3 == 0) goto L106
            r3.close()     // Catch: java.lang.Throwable -> L105
            goto L106
        L105:
        L106:
            if (r4 == 0) goto L10b
            r4.close()     // Catch: java.lang.Throwable -> L10b
        L10b:
            return r2
        L10c:
            r9 = move-exception
            r2 = r4
            goto L165
        L10f:
            r4 = r2
        L110:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10c
            r5.<init>()     // Catch: java.lang.Throwable -> L10c
            r5.append(r0)     // Catch: java.lang.Throwable -> L10c
            java.lang.String r9 = r9.getMessage()     // Catch: java.lang.Throwable -> L10c
            r5.append(r9)     // Catch: java.lang.Throwable -> L10c
            java.lang.String r9 = r5.toString()     // Catch: java.lang.Throwable -> L10c
            com.tencent.mm.opensdk.utils.Log.e(r1, r9)     // Catch: java.lang.Throwable -> L10c
            if (r8 == 0) goto L12d
            r8.disconnect()     // Catch: java.lang.Throwable -> L12c
            goto L12d
        L12c:
        L12d:
            if (r3 == 0) goto L134
            r3.close()     // Catch: java.lang.Throwable -> L133
            goto L134
        L133:
        L134:
            if (r4 == 0) goto L139
            r4.close()     // Catch: java.lang.Throwable -> L139
        L139:
            return r2
        L13a:
            r4 = r2
        L13b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10c
            r5.<init>()     // Catch: java.lang.Throwable -> L10c
            r5.append(r0)     // Catch: java.lang.Throwable -> L10c
            java.lang.String r9 = r9.getMessage()     // Catch: java.lang.Throwable -> L10c
            r5.append(r9)     // Catch: java.lang.Throwable -> L10c
            java.lang.String r9 = r5.toString()     // Catch: java.lang.Throwable -> L10c
            com.tencent.mm.opensdk.utils.Log.e(r1, r9)     // Catch: java.lang.Throwable -> L10c
            if (r8 == 0) goto L158
            r8.disconnect()     // Catch: java.lang.Throwable -> L157
            goto L158
        L157:
        L158:
            if (r3 == 0) goto L15f
            r3.close()     // Catch: java.lang.Throwable -> L15e
            goto L15f
        L15e:
        L15f:
            if (r4 == 0) goto L164
            r4.close()     // Catch: java.lang.Throwable -> L164
        L164:
            return r2
        L165:
            r0 = r2
            r2 = r3
        L167:
            if (r8 == 0) goto L16e
            r8.disconnect()     // Catch: java.lang.Throwable -> L16d
            goto L16e
        L16d:
        L16e:
            if (r2 == 0) goto L175
            r2.close()     // Catch: java.lang.Throwable -> L174
            goto L175
        L174:
        L175:
            if (r0 == 0) goto L17a
            r0.close()     // Catch: java.lang.Throwable -> L17a
        L17a:
            throw r9
        L17b:
            java.lang.String r8 = "httpGet, url is null"
            com.tencent.mm.opensdk.utils.Log.e(r1, r8)
            return r2
    }

    public static byte[] a(java.lang.String r6, int r7, java.lang.String r8) {
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            if (r6 == 0) goto La
            r0.append(r6)
        La:
            r0.append(r7)
            r0.append(r8)
            java.lang.String r6 = "mMcShCsTr"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7 = 9
            r8 = 1
            java.lang.String r6 = r6.substring(r8, r7)
            byte[] r6 = r6.getBytes()
            r7 = 16
            char[] r7 = new char[r7]
            r7 = {x0064: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102} // fill-array
            java.lang.String r8 = "MD5"
            java.security.MessageDigest r8 = java.security.MessageDigest.getInstance(r8)     // Catch: java.lang.Exception -> L5e
            r8.update(r6)     // Catch: java.lang.Exception -> L5e
            byte[] r6 = r8.digest()     // Catch: java.lang.Exception -> L5e
            int r8 = r6.length     // Catch: java.lang.Exception -> L5e
            int r0 = r8 * 2
            char[] r0 = new char[r0]     // Catch: java.lang.Exception -> L5e
            r1 = 0
            r2 = 0
        L3f:
            if (r1 >= r8) goto L58
            r3 = r6[r1]     // Catch: java.lang.Exception -> L5e
            int r4 = r2 + 1
            int r5 = r3 >>> 4
            r5 = r5 & 15
            char r5 = r7[r5]     // Catch: java.lang.Exception -> L5e
            r0[r2] = r5     // Catch: java.lang.Exception -> L5e
            int r2 = r2 + 2
            r3 = r3 & 15
            char r3 = r7[r3]     // Catch: java.lang.Exception -> L5e
            r0[r4] = r3     // Catch: java.lang.Exception -> L5e
            int r1 = r1 + 1
            goto L3f
        L58:
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Exception -> L5e
            r6.<init>(r0)     // Catch: java.lang.Exception -> L5e
            goto L5f
        L5e:
            r6 = 0
        L5f:
            byte[] r6 = r6.getBytes()
            return r6
    }
}
