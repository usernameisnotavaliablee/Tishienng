package com.umeng.socialize.net.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class SocializeNetUtils {
    private static final java.lang.String TAG = "SocializeNetUtils";

    public SocializeNetUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String convertStreamToString(java.io.InputStream r4) {
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            r1.<init>(r4)
            r0.<init>(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
        Lf:
            java.lang.String r2 = r0.readLine()     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            if (r2 == 0) goto L2e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            r3.<init>()     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            r3.append(r2)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            java.lang.String r2 = "/n"
            r3.append(r2)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            r1.append(r2)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            goto Lf
        L2a:
            r0 = move-exception
            goto L44
        L2c:
            r0 = move-exception
            goto L39
        L2e:
            r4.close()     // Catch: java.io.IOException -> L32
            goto L3f
        L32:
            r4 = move-exception
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.NET.TOOL
            com.umeng.socialize.utils.SLog.error(r0, r4)
            goto L3f
        L39:
            java.lang.String r2 = com.umeng.socialize.utils.UmengText.NET.TOOL     // Catch: java.lang.Throwable -> L2a
            com.umeng.socialize.utils.SLog.error(r2, r0)     // Catch: java.lang.Throwable -> L2a
            goto L2e
        L3f:
            java.lang.String r4 = r1.toString()
            return r4
        L44:
            r4.close()     // Catch: java.io.IOException -> L48
            goto L4e
        L48:
            r4 = move-exception
            java.lang.String r1 = com.umeng.socialize.utils.UmengText.NET.TOOL
            com.umeng.socialize.utils.SLog.error(r1, r4)
        L4e:
            throw r0
    }

    public static android.os.Bundle decodeUrl(java.lang.String r8) {
            java.lang.String r0 = "UTF-8"
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            if (r8 == 0) goto L36
            java.lang.String r2 = "&"
            java.lang.String[] r8 = r8.split(r2)
            int r2 = r8.length
            r3 = 0
            r4 = 0
        L12:
            if (r4 >= r2) goto L36
            r5 = r8[r4]
            java.lang.String r6 = "="
            java.lang.String[] r5 = r5.split(r6)
            r6 = r5[r3]     // Catch: java.io.UnsupportedEncodingException -> L2d
            java.lang.String r6 = java.net.URLDecoder.decode(r6, r0)     // Catch: java.io.UnsupportedEncodingException -> L2d
            r7 = 1
            r5 = r5[r7]     // Catch: java.io.UnsupportedEncodingException -> L2d
            java.lang.String r5 = java.net.URLDecoder.decode(r5, r0)     // Catch: java.io.UnsupportedEncodingException -> L2d
            r1.putString(r6, r5)     // Catch: java.io.UnsupportedEncodingException -> L2d
            goto L33
        L2d:
            r5 = move-exception
            java.lang.String r6 = com.umeng.socialize.utils.UmengText.NET.TOOL
            com.umeng.socialize.utils.SLog.error(r6, r5)
        L33:
            int r4 = r4 + 1
            goto L12
        L36:
            return r1
    }

    public static byte[] getNetData(java.lang.String r5) {
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La5
            r0.<init>()     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La5
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            java.net.URLConnection r2 = r2.openConnection()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            r3 = 1
            r2.setInstanceFollowRedirects(r3)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            int r3 = com.umeng.socialize.Config.connectionTimeOut     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            r2.setConnectTimeout(r3)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            int r3 = com.umeng.socialize.Config.readSocketTimeOut     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            r2.setReadTimeout(r3)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            int r3 = r2.getResponseCode()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            r4 = 301(0x12d, float:4.22E-43)
            if (r3 != r4) goto L4b
            java.lang.String r3 = "Location"
            java.lang.String r2 = r2.getHeaderField(r3)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            boolean r5 = r2.equals(r5)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            if (r5 == 0) goto L46
            java.lang.String r5 = com.umeng.socialize.utils.UmengText.NET.NET_AGAIN_ERROR     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            com.umeng.socialize.utils.SLog.E(r5)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            return r1
        L40:
            r5 = move-exception
            goto Ld8
        L43:
            r5 = move-exception
            r2 = r1
            goto La8
        L46:
            byte[] r5 = getNetData(r2)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            return r5
        L4b:
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L77
            r3.<init>()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L77
            java.lang.String r4 = com.umeng.socialize.utils.UmengText.IMAGE.IMAGEURL     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L77
            r3.append(r4)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L77
            r3.append(r5)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L77
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L77
            com.umeng.socialize.utils.SLog.I(r5)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L77
            r5 = 4096(0x1000, float:5.74E-42)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L77
        L67:
            int r3 = r2.read(r5)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L77
            r4 = -1
            if (r3 == r4) goto L79
            r4 = 0
            r0.write(r5, r4, r3)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L77
            goto L67
        L73:
            r5 = move-exception
            r1 = r2
            goto Ld8
        L77:
            r5 = move-exception
            goto La8
        L79:
            byte[] r5 = r0.toByteArray()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L77
            r2.close()     // Catch: java.lang.Throwable -> L8b java.io.IOException -> L8d
            r0.close()     // Catch: java.io.IOException -> L84
            return r5
        L84:
            r0 = move-exception
            java.lang.String r1 = com.umeng.socialize.utils.UmengText.NET.CLOSE
            com.umeng.socialize.utils.SLog.error(r1, r0)
            goto L96
        L8b:
            r5 = move-exception
            goto L97
        L8d:
            r1 = move-exception
            java.lang.String r2 = com.umeng.socialize.utils.UmengText.NET.TOOL     // Catch: java.lang.Throwable -> L8b
            com.umeng.socialize.utils.SLog.error(r2, r1)     // Catch: java.lang.Throwable -> L8b
            r0.close()     // Catch: java.io.IOException -> L84
        L96:
            return r5
        L97:
            r0.close()     // Catch: java.io.IOException -> L9b
            goto La1
        L9b:
            r0 = move-exception
            java.lang.String r1 = com.umeng.socialize.utils.UmengText.NET.CLOSE
            com.umeng.socialize.utils.SLog.error(r1, r0)
        La1:
            throw r5
        La2:
            r5 = move-exception
            r0 = r1
            goto Ld8
        La5:
            r5 = move-exception
            r0 = r1
            r2 = r0
        La8:
            java.lang.String r3 = com.umeng.socialize.utils.UmengText.NET.IMAGEDOWN     // Catch: java.lang.Throwable -> L73
            com.umeng.socialize.utils.SLog.error(r3, r5)     // Catch: java.lang.Throwable -> L73
            if (r2 == 0) goto Ld7
            r2.close()     // Catch: java.lang.Throwable -> Lbf java.io.IOException -> Lc1
            if (r0 == 0) goto Ld7
        Lb4:
            r0.close()     // Catch: java.io.IOException -> Lb8
            goto Ld7
        Lb8:
            r5 = move-exception
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.NET.CLOSE
            com.umeng.socialize.utils.SLog.error(r0, r5)
            goto Ld7
        Lbf:
            r5 = move-exception
            goto Lca
        Lc1:
            r5 = move-exception
            java.lang.String r2 = com.umeng.socialize.utils.UmengText.NET.TOOL     // Catch: java.lang.Throwable -> Lbf
            com.umeng.socialize.utils.SLog.error(r2, r5)     // Catch: java.lang.Throwable -> Lbf
            if (r0 == 0) goto Ld7
            goto Lb4
        Lca:
            if (r0 == 0) goto Ld6
            r0.close()     // Catch: java.io.IOException -> Ld0
            goto Ld6
        Ld0:
            r0 = move-exception
            java.lang.String r1 = com.umeng.socialize.utils.UmengText.NET.CLOSE
            com.umeng.socialize.utils.SLog.error(r1, r0)
        Ld6:
            throw r5
        Ld7:
            return r1
        Ld8:
            if (r1 == 0) goto L102
            r1.close()     // Catch: java.lang.Throwable -> Lea java.io.IOException -> Lec
            if (r0 == 0) goto L102
        Ldf:
            r0.close()     // Catch: java.io.IOException -> Le3
            goto L102
        Le3:
            r0 = move-exception
            java.lang.String r1 = com.umeng.socialize.utils.UmengText.NET.CLOSE
            com.umeng.socialize.utils.SLog.error(r1, r0)
            goto L102
        Lea:
            r5 = move-exception
            goto Lf5
        Lec:
            r1 = move-exception
            java.lang.String r2 = com.umeng.socialize.utils.UmengText.NET.TOOL     // Catch: java.lang.Throwable -> Lea
            com.umeng.socialize.utils.SLog.error(r2, r1)     // Catch: java.lang.Throwable -> Lea
            if (r0 == 0) goto L102
            goto Ldf
        Lf5:
            if (r0 == 0) goto L101
            r0.close()     // Catch: java.io.IOException -> Lfb
            goto L101
        Lfb:
            r0 = move-exception
            java.lang.String r1 = com.umeng.socialize.utils.UmengText.NET.CLOSE
            com.umeng.socialize.utils.SLog.error(r1, r0)
        L101:
            throw r5
        L102:
            throw r5
    }

    public static boolean isConSpeCharacters(java.lang.String r2) {
            java.lang.String r0 = "[一-龥]*[a-z]*[A-Z]*\\d*-*_*\\s*"
            java.lang.String r1 = ""
            java.lang.String r2 = r2.replaceAll(r0, r1)
            int r2 = r2.length()
            if (r2 != 0) goto L10
            r2 = 0
            return r2
        L10:
            r2 = 1
            return r2
    }

    public static boolean isSelfAppkey(java.lang.String r1) {
            java.lang.String r0 = "5126ff896c738f2bfa000438"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L16
            java.lang.String r1 = com.umeng.socialize.utils.ContextUtil.getPackageName()
            java.lang.String r0 = "com.umeng.soexample"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L16
            r1 = 1
            return r1
        L16:
            r1 = 0
            return r1
    }

    public static android.os.Bundle parseUri(java.lang.String r1) {
            java.net.URI r0 = new java.net.URI     // Catch: java.lang.Exception -> Le
            r0.<init>(r1)     // Catch: java.lang.Exception -> Le
            java.lang.String r1 = r0.getQuery()     // Catch: java.lang.Exception -> Le
            android.os.Bundle r1 = decodeUrl(r1)     // Catch: java.lang.Exception -> Le
            return r1
        Le:
            r1 = move-exception
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.NET.TOOL
            com.umeng.socialize.utils.SLog.error(r0, r1)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            return r1
    }

    public static android.os.Bundle parseUrl(java.lang.String r1) {
            java.net.URL r0 = new java.net.URL     // Catch: java.net.MalformedURLException -> L19
            r0.<init>(r1)     // Catch: java.net.MalformedURLException -> L19
            java.lang.String r1 = r0.getQuery()     // Catch: java.net.MalformedURLException -> L19
            android.os.Bundle r1 = decodeUrl(r1)     // Catch: java.net.MalformedURLException -> L19
            java.lang.String r0 = r0.getRef()     // Catch: java.net.MalformedURLException -> L19
            android.os.Bundle r0 = decodeUrl(r0)     // Catch: java.net.MalformedURLException -> L19
            r1.putAll(r0)     // Catch: java.net.MalformedURLException -> L19
            return r1
        L19:
            r1 = move-exception
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.NET.TOOL
            com.umeng.socialize.utils.SLog.error(r0, r1)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            return r1
    }

    public static java.lang.String request(java.lang.String r2) {
            java.lang.String r0 = ""
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Exception -> L1d
            r1.<init>(r2)     // Catch: java.lang.Exception -> L1d
            java.net.URLConnection r2 = r1.openConnection()     // Catch: java.lang.Exception -> L1d
            if (r2 != 0) goto Le
            goto L17
        Le:
            r2.connect()     // Catch: java.lang.Exception -> L1d
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Exception -> L1d
            if (r2 != 0) goto L18
        L17:
            return r0
        L18:
            java.lang.String r2 = convertStreamToString(r2)     // Catch: java.lang.Exception -> L1d
            return r2
        L1d:
            r2 = move-exception
            java.lang.String r1 = com.umeng.socialize.utils.UmengText.NET.TOOL
            com.umeng.socialize.utils.SLog.error(r1, r2)
            return r0
    }

    public static boolean startWithHttp(java.lang.String r1) {
            java.lang.String r0 = "http://"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L13
            java.lang.String r0 = "https://"
            boolean r1 = r1.startsWith(r0)
            if (r1 == 0) goto L11
            goto L13
        L11:
            r1 = 0
            return r1
        L13:
            r1 = 1
            return r1
    }
}
