package com.tencent.open.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class HttpUtils {


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class HttpStatusException extends java.lang.Exception {
        public static final java.lang.String ERROR_INFO = "http status code error:";
        public final int statusCode;

        public HttpStatusException(int r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "http status code error:"
                r0.append(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                r2.statusCode = r3
                return
        }

        public HttpStatusException(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = -1
                r0.statusCode = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class NetworkUnavailableException extends java.lang.Exception {
        public static final java.lang.String ERROR_INFO = "network unavailable";

        public NetworkUnavailableException(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a {
        public final java.lang.String a;
        public final int b;

        private a(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        /* synthetic */ a(java.lang.String r1, int r2, com.tencent.open.utils.HttpUtils.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    private HttpUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int a(android.content.Context r1) {
            java.lang.String r1 = "http.proxyPort"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L11
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L11
            return r1
        L11:
            r1 = -1
            return r1
    }

    private static com.tencent.open.a.g a(java.lang.String r4, java.lang.String r5, android.os.Bundle r6) throws java.io.IOException {
            if (r6 == 0) goto L8
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>(r6)
            goto Ld
        L8:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        Ld:
            java.lang.String r6 = "GET"
            boolean r6 = r5.equalsIgnoreCase(r6)
            java.lang.String r1 = "openSDK_LOG.HttpUtils"
            if (r6 == 0) goto L67
            java.util.Map r5 = a(r0)
            android.os.Bundle r6 = com.tencent.open.log.d.b(r0)
            java.lang.String r2 = " -- url = "
            java.lang.String r3 = "-->openUrl encodedParam ="
            if (r6 == r0) goto L42
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r6 = r6.toString()
            r0.append(r6)
            r0.append(r2)
            r0.append(r4)
            java.lang.String r6 = r0.toString()
            com.tencent.open.log.SLog.i(r1, r6)
            goto L5e
        L42:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            java.lang.String r0 = r5.toString()
            r6.append(r0)
            r6.append(r2)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            com.tencent.open.log.SLog.i(r1, r6)
        L5e:
            com.tencent.open.a.f r6 = com.tencent.open.a.f.a()
            com.tencent.open.a.g r4 = r6.a(r4, r5)
            return r4
        L67:
            java.lang.String r6 = "POST"
            boolean r6 = r5.equalsIgnoreCase(r6)
            if (r6 == 0) goto Laa
            java.util.Map r5 = a(r0)
            java.util.Map r6 = b(r0)
            if (r6 == 0) goto La1
            int r0 = r6.size()
            if (r0 != 0) goto L80
            goto La1
        L80:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "openUrl: has binary "
            r0.append(r2)
            int r2 = r6.size()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.open.log.SLog.w(r1, r0)
            com.tencent.open.a.f r0 = com.tencent.open.a.f.a()
            com.tencent.open.a.g r4 = r0.a(r4, r5, r6)
            return r4
        La1:
            com.tencent.open.a.f r6 = com.tencent.open.a.f.a()
            com.tencent.open.a.g r4 = r6.b(r4, r5)
            return r4
        Laa:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "openUrl: http method "
            r4.append(r6)
            r4.append(r5)
            java.lang.String r5 = " is not supported."
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.open.log.SLog.e(r1, r4)
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "http method is not supported."
            r4.<init>(r5)
            throw r4
    }

    private static java.util.Map<java.lang.String, java.lang.String> a(android.os.Bundle r7) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            if (r7 == 0) goto L7a
            int r1 = r7.size()
            if (r1 != 0) goto Le
            goto L7a
        Le:
            java.util.Set r1 = r7.keySet()
            java.util.Iterator r1 = r1.iterator()
        L16:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7a
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r7.get(r2)
            boolean r4 = r3 instanceof java.lang.String
            if (r4 != 0) goto L4e
            boolean r4 = r3 instanceof java.lang.String[]
            if (r4 != 0) goto L4e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "parseBundleToMap: the type "
            r2.append(r4)
            java.lang.Class r3 = r3.getClass()
            r2.append(r3)
            java.lang.String r3 = " is unsupported"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "openSDK_LOG.HttpUtils"
            com.tencent.open.log.SLog.w(r3, r2)
            goto L16
        L4e:
            boolean r4 = r3 instanceof java.lang.String[]
            if (r4 == 0) goto L74
            java.lang.String[] r3 = (java.lang.String[]) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = 0
        L5a:
            int r6 = r3.length
            if (r5 >= r6) goto L6c
            if (r5 == 0) goto L64
            java.lang.String r6 = ","
            r4.append(r6)
        L64:
            r6 = r3[r5]
            r4.append(r6)
            int r5 = r5 + 1
            goto L5a
        L6c:
            java.lang.String r3 = r4.toString()
            r0.put(r2, r3)
            goto L16
        L74:
            java.lang.String r3 = (java.lang.String) r3
            r0.put(r2, r3)
            goto L16
        L7a:
            return r0
    }

    private static void a(android.content.Context r2, com.tencent.connect.auth.QQToken r3, java.lang.String r4) {
            java.lang.String r0 = "add_share"
            int r0 = r4.indexOf(r0)
            r1 = -1
            if (r0 > r1) goto L43
            java.lang.String r0 = "upload_pic"
            int r0 = r4.indexOf(r0)
            if (r0 > r1) goto L43
            java.lang.String r0 = "add_topic"
            int r0 = r4.indexOf(r0)
            if (r0 > r1) goto L43
            java.lang.String r0 = "set_user_face"
            int r0 = r4.indexOf(r0)
            if (r0 > r1) goto L43
            java.lang.String r0 = "add_t"
            int r0 = r4.indexOf(r0)
            if (r0 > r1) goto L43
            java.lang.String r0 = "add_pic_t"
            int r0 = r4.indexOf(r0)
            if (r0 > r1) goto L43
            java.lang.String r0 = "add_pic_url"
            int r0 = r4.indexOf(r0)
            if (r0 > r1) goto L43
            java.lang.String r0 = "add_video"
            int r0 = r4.indexOf(r0)
            if (r0 <= r1) goto L42
            goto L43
        L42:
            return
        L43:
            java.lang.String r0 = "requireApi"
            java.lang.String[] r4 = new java.lang.String[]{r4}
            com.tencent.connect.a.a.a(r2, r3, r0, r4)
            return
    }

    private static java.lang.String b(android.content.Context r0) {
            java.lang.String r0 = "http.proxyHost"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            return r0
    }

    private static java.util.Map<java.lang.String, byte[]> b(android.os.Bundle r5) {
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 0
            r0.<init>(r1)
            if (r5 == 0) goto L32
            int r1 = r5.size()
            if (r1 != 0) goto Lf
            goto L32
        Lf:
            java.util.Set r1 = r5.keySet()
            java.util.Iterator r1 = r1.iterator()
        L17:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L32
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r5.get(r2)
            boolean r4 = r3 instanceof byte[]
            if (r4 != 0) goto L2c
            goto L17
        L2c:
            byte[] r3 = (byte[]) r3
            r0.put(r2, r3)
            goto L17
        L32:
            return r0
    }

    public static java.lang.String encodeUrl(android.os.Bundle r0) {
            java.util.Map r0 = a(r0)
            java.lang.String r0 = encodeUrl(r0)
            return r0
    }

    public static java.lang.String encodeUrl(java.util.Map<java.lang.String, java.lang.String> r5) {
            if (r5 == 0) goto L4b
            int r0 = r5.size()
            if (r0 != 0) goto L9
            goto L4b
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Set r1 = r5.keySet()
            java.util.Iterator r1 = r1.iterator()
            r2 = 1
        L17:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L46
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            if (r2 == 0) goto L27
            r2 = 0
            goto L2c
        L27:
            java.lang.String r4 = "&"
            r0.append(r4)
        L2c:
            java.lang.String r4 = java.net.URLEncoder.encode(r3)
            r0.append(r4)
            java.lang.String r4 = "="
            r0.append(r4)
            java.lang.Object r3 = r5.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = java.net.URLEncoder.encode(r3)
            r0.append(r3)
            goto L17
        L46:
            java.lang.String r5 = r0.toString()
            return r5
        L4b:
            java.lang.String r5 = ""
            return r5
    }

    public static int getErrorCodeFromException(java.io.IOException r1) {
            boolean r0 = r1 instanceof java.io.CharConversionException
            if (r0 == 0) goto L7
            r1 = -20
            return r1
        L7:
            boolean r0 = r1 instanceof java.nio.charset.MalformedInputException
            if (r0 == 0) goto Le
            r1 = -21
            return r1
        Le:
            boolean r0 = r1 instanceof java.nio.charset.UnmappableCharacterException
            if (r0 == 0) goto L15
            r1 = -22
            return r1
        L15:
            boolean r0 = r1 instanceof java.nio.channels.ClosedChannelException
            if (r0 == 0) goto L1c
            r1 = -24
            return r1
        L1c:
            boolean r0 = r1 instanceof java.io.EOFException
            if (r0 == 0) goto L23
            r1 = -26
            return r1
        L23:
            boolean r0 = r1 instanceof java.nio.channels.FileLockInterruptionException
            if (r0 == 0) goto L2a
            r1 = -27
            return r1
        L2a:
            boolean r0 = r1 instanceof java.io.FileNotFoundException
            if (r0 == 0) goto L31
            r1 = -28
            return r1
        L31:
            boolean r0 = r1 instanceof java.net.HttpRetryException
            if (r0 == 0) goto L38
            r1 = -29
            return r1
        L38:
            boolean r0 = r1 instanceof java.net.SocketTimeoutException
            if (r0 == 0) goto L3e
            r1 = -8
            return r1
        L3e:
            boolean r0 = r1 instanceof java.util.InvalidPropertiesFormatException
            if (r0 == 0) goto L45
            r1 = -30
            return r1
        L45:
            boolean r0 = r1 instanceof java.net.MalformedURLException
            if (r0 == 0) goto L4b
            r1 = -3
            return r1
        L4b:
            boolean r0 = r1 instanceof java.io.InvalidClassException
            if (r0 == 0) goto L52
            r1 = -33
            return r1
        L52:
            boolean r0 = r1 instanceof java.io.InvalidObjectException
            if (r0 == 0) goto L59
            r1 = -34
            return r1
        L59:
            boolean r0 = r1 instanceof java.io.NotActiveException
            if (r0 == 0) goto L60
            r1 = -35
            return r1
        L60:
            boolean r0 = r1 instanceof java.io.NotSerializableException
            if (r0 == 0) goto L67
            r1 = -36
            return r1
        L67:
            boolean r0 = r1 instanceof java.io.OptionalDataException
            if (r0 == 0) goto L6e
            r1 = -37
            return r1
        L6e:
            boolean r0 = r1 instanceof java.io.StreamCorruptedException
            if (r0 == 0) goto L75
            r1 = -38
            return r1
        L75:
            boolean r0 = r1 instanceof java.io.WriteAbortedException
            if (r0 == 0) goto L7c
            r1 = -39
            return r1
        L7c:
            boolean r0 = r1 instanceof java.net.ProtocolException
            if (r0 == 0) goto L83
            r1 = -40
            return r1
        L83:
            boolean r0 = r1 instanceof javax.net.ssl.SSLHandshakeException
            if (r0 == 0) goto L8a
            r1 = -41
            return r1
        L8a:
            boolean r0 = r1 instanceof javax.net.ssl.SSLKeyException
            if (r0 == 0) goto L91
            r1 = -42
            return r1
        L91:
            boolean r0 = r1 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r0 == 0) goto L98
            r1 = -43
            return r1
        L98:
            boolean r0 = r1 instanceof javax.net.ssl.SSLProtocolException
            if (r0 == 0) goto L9f
            r1 = -44
            return r1
        L9f:
            boolean r0 = r1 instanceof java.net.BindException
            if (r0 == 0) goto La6
            r1 = -45
            return r1
        La6:
            boolean r0 = r1 instanceof java.net.ConnectException
            if (r0 == 0) goto Lad
            r1 = -46
            return r1
        Lad:
            boolean r0 = r1 instanceof java.net.NoRouteToHostException
            if (r0 == 0) goto Lb4
            r1 = -47
            return r1
        Lb4:
            boolean r0 = r1 instanceof java.net.PortUnreachableException
            if (r0 == 0) goto Lbb
            r1 = -48
            return r1
        Lbb:
            boolean r0 = r1 instanceof java.io.SyncFailedException
            if (r0 == 0) goto Lc2
            r1 = -49
            return r1
        Lc2:
            boolean r0 = r1 instanceof java.io.UTFDataFormatException
            if (r0 == 0) goto Lc9
            r1 = -50
            return r1
        Lc9:
            boolean r0 = r1 instanceof java.net.UnknownHostException
            if (r0 == 0) goto Ld0
            r1 = -51
            return r1
        Ld0:
            boolean r0 = r1 instanceof java.net.UnknownServiceException
            if (r0 == 0) goto Ld7
            r1 = -52
            return r1
        Ld7:
            boolean r0 = r1 instanceof java.io.UnsupportedEncodingException
            if (r0 == 0) goto Lde
            r1 = -53
            return r1
        Lde:
            boolean r1 = r1 instanceof java.util.zip.ZipException
            if (r1 == 0) goto Le5
            r1 = -54
            return r1
        Le5:
            r1 = -2
            return r1
    }

    public static com.tencent.open.utils.HttpUtils.a getProxy(android.content.Context r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "connectivity"
            java.lang.Object r1 = r3.getSystemService(r1)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            if (r1 != 0) goto Lf
            return r0
        Lf:
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()     // Catch: java.lang.Exception -> L14
            goto L16
        L14:
            r1 = r0
        L16:
            if (r1 != 0) goto L19
            return r0
        L19:
            int r1 = r1.getType()
            if (r1 != 0) goto L35
            java.lang.String r1 = b(r3)
            int r3 = a(r3)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L35
            if (r3 < 0) goto L35
            com.tencent.open.utils.HttpUtils$a r2 = new com.tencent.open.utils.HttpUtils$a
            r2.<init>(r1, r3, r0)
            return r2
        L35:
            return r0
    }

    public static org.json.JSONObject request(com.tencent.connect.auth.QQToken r16, android.content.Context r17, java.lang.String r18, android.os.Bundle r19, java.lang.String r20) throws java.io.IOException, org.json.JSONException, com.tencent.open.utils.HttpUtils.NetworkUnavailableException, com.tencent.open.utils.HttpUtils.HttpStatusException {
            r0 = r17
            r1 = r18
            java.lang.String r2 = "OpenApi request"
            java.lang.String r3 = "openSDK_LOG.HttpUtils"
            com.tencent.open.log.SLog.i(r3, r2)
            boolean r2 = com.tencent.open.utils.m.b(r0)
            if (r2 == 0) goto L16b
            java.lang.String r2 = r1.toLowerCase()
            java.lang.String r4 = "http"
            boolean r2 = r2.startsWith(r4)
            if (r2 != 0) goto L51
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.tencent.open.utils.j r4 = com.tencent.open.utils.j.a()
            java.lang.String r5 = "https://openmobile.qq.com/"
            java.lang.String r4 = r4.a(r0, r5)
            r2.append(r4)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            com.tencent.open.utils.j r6 = com.tencent.open.utils.j.a()
            java.lang.String r5 = r6.a(r0, r5)
            r4.append(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            r5 = r4
        L4e:
            r4 = r16
            goto L54
        L51:
            r2 = r1
            r5 = r2
            goto L4e
        L54:
            a(r0, r4, r1)
            long r6 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r1 = r4.getAppId()
            com.tencent.open.utils.i r0 = com.tencent.open.utils.i.a(r0, r1)
            java.lang.String r1 = "Common_HttpRetryCount"
            int r0 = r0.a(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r8 = "config 1:Common_HttpRetryCount            config_value:"
            r1.append(r8)
            r1.append(r0)
            java.lang.String r8 = "   appid:"
            r1.append(r8)
            java.lang.String r9 = r4.getAppId()
            r1.append(r9)
            java.lang.String r9 = "     url:"
            r1.append(r9)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r10 = "OpenConfig_test"
            com.tencent.open.log.SLog.v(r10, r1)
            if (r0 != 0) goto L98
            r0 = 3
            r1 = 3
            goto L99
        L98:
            r1 = r0
        L99:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r11 = "config 1:Common_HttpRetryCount            result_value:"
            r0.append(r11)
            r0.append(r1)
            r0.append(r8)
            java.lang.String r4 = r4.getAppId()
            r0.append(r4)
            r0.append(r9)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.open.log.SLog.v(r10, r0)
            r0 = 0
            r4 = 0
            r13 = r0
        Lc0:
            int r14 = r4 + 1
            r15 = r19
            r4 = r20
            com.tencent.open.a.g r0 = a(r2, r4, r15)     // Catch: java.io.IOException -> Lf5 java.net.MalformedURLException -> Lf7 org.json.JSONException -> L10c java.net.SocketTimeoutException -> L10e
            int r12 = r0.d()     // Catch: java.io.IOException -> Lf5 java.net.MalformedURLException -> Lf7 org.json.JSONException -> L10c java.net.SocketTimeoutException -> L10e
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lf5 java.net.MalformedURLException -> Lf7 org.json.JSONException -> L10c java.net.SocketTimeoutException -> L10e
            r8.<init>()     // Catch: java.io.IOException -> Lf5 java.net.MalformedURLException -> Lf7 org.json.JSONException -> L10c java.net.SocketTimeoutException -> L10e
            java.lang.String r9 = "request statusCode "
            r8.append(r9)     // Catch: java.io.IOException -> Lf5 java.net.MalformedURLException -> Lf7 org.json.JSONException -> L10c java.net.SocketTimeoutException -> L10e
            r8.append(r12)     // Catch: java.io.IOException -> Lf5 java.net.MalformedURLException -> Lf7 org.json.JSONException -> L10c java.net.SocketTimeoutException -> L10e
            java.lang.String r8 = r8.toString()     // Catch: java.io.IOException -> Lf5 java.net.MalformedURLException -> Lf7 org.json.JSONException -> L10c java.net.SocketTimeoutException -> L10e
            com.tencent.open.log.SLog.i(r3, r8)     // Catch: java.io.IOException -> Lf5 java.net.MalformedURLException -> Lf7 org.json.JSONException -> L10c java.net.SocketTimeoutException -> L10e
            r8 = 200(0xc8, float:2.8E-43)
            if (r12 != r8) goto L110
            java.lang.String r8 = r0.a()     // Catch: java.io.IOException -> Lf5 java.net.MalformedURLException -> Lf7 org.json.JSONException -> L10c java.net.SocketTimeoutException -> L10e
            org.json.JSONObject r8 = com.tencent.open.utils.m.d(r8)     // Catch: java.io.IOException -> Lf5 java.net.MalformedURLException -> Lf7 org.json.JSONException -> L10c java.net.SocketTimeoutException -> L10e
            java.lang.String r9 = "ret"
            int r9 = r8.getInt(r9)     // Catch: java.io.IOException -> Lf5 java.net.MalformedURLException -> Lf7 java.net.SocketTimeoutException -> Lf9 org.json.JSONException -> Lfc
            goto Lfd
        Lf5:
            r0 = move-exception
            goto L12e
        Lf7:
            r0 = move-exception
            goto L13e
        Lf9:
            r0 = move-exception
            r13 = r8
            goto L14b
        Lfc:
            r9 = -4
        Lfd:
            int r10 = r0.c()     // Catch: java.io.IOException -> Lf5 java.net.MalformedURLException -> Lf7 java.net.SocketTimeoutException -> Lf9 org.json.JSONException -> L10c
            long r10 = (long) r10     // Catch: java.io.IOException -> Lf5 java.net.MalformedURLException -> Lf7 java.net.SocketTimeoutException -> Lf9 org.json.JSONException -> L10c
            int r0 = r0.b()     // Catch: java.io.IOException -> Lf5 java.net.MalformedURLException -> Lf7 java.net.SocketTimeoutException -> Lf9 org.json.JSONException -> L10c
            long r0 = (long) r0
            r13 = r8
            r12 = r9
            r8 = r10
            r10 = r0
            goto L158
        L10c:
            r0 = move-exception
            goto L121
        L10e:
            r0 = move-exception
            goto L14b
        L110:
            com.tencent.open.b.h r4 = com.tencent.open.b.h.a()     // Catch: java.io.IOException -> Lf5 java.net.MalformedURLException -> Lf7 org.json.JSONException -> L10c java.net.SocketTimeoutException -> L10e
            r8 = 0
            r10 = 0
            r4.a(r5, r6, r8, r10, r12)     // Catch: java.io.IOException -> Lf5 java.net.MalformedURLException -> Lf7 org.json.JSONException -> L10c java.net.SocketTimeoutException -> L10e
            com.tencent.open.utils.HttpUtils$HttpStatusException r0 = new com.tencent.open.utils.HttpUtils$HttpStatusException     // Catch: java.io.IOException -> Lf5 java.net.MalformedURLException -> Lf7 org.json.JSONException -> L10c java.net.SocketTimeoutException -> L10e
            r0.<init>(r12)     // Catch: java.io.IOException -> Lf5 java.net.MalformedURLException -> Lf7 org.json.JSONException -> L10c java.net.SocketTimeoutException -> L10e
            throw r0     // Catch: java.io.IOException -> Lf5 java.net.MalformedURLException -> Lf7 org.json.JSONException -> L10c java.net.SocketTimeoutException -> L10e
        L121:
            r10 = 0
            com.tencent.open.b.h r4 = com.tencent.open.b.h.a()
            r8 = 0
            r12 = -4
            r4.a(r5, r6, r8, r10, r12)
            throw r0
        L12e:
            int r12 = getErrorCodeFromException(r0)
            r10 = 0
            com.tencent.open.b.h r4 = com.tencent.open.b.h.a()
            r8 = 0
            r4.a(r5, r6, r8, r10, r12)
            throw r0
        L13e:
            r10 = 0
            com.tencent.open.b.h r4 = com.tencent.open.b.h.a()
            r8 = 0
            r12 = -3
            r4.a(r5, r6, r8, r10, r12)
            throw r0
        L14b:
            r12 = -8
            r8 = 0
            r10 = 0
            if (r14 >= r1) goto L163
            long r6 = android.os.SystemClock.elapsedRealtime()
            if (r14 < r1) goto L160
        L158:
            com.tencent.open.b.h r4 = com.tencent.open.b.h.a()
            r4.a(r5, r6, r8, r10, r12)
            return r13
        L160:
            r4 = r14
            goto Lc0
        L163:
            com.tencent.open.b.h r4 = com.tencent.open.b.h.a()
            r4.a(r5, r6, r8, r10, r12)
            throw r0
        L16b:
            com.tencent.open.utils.HttpUtils$NetworkUnavailableException r0 = new com.tencent.open.utils.HttpUtils$NetworkUnavailableException
            java.lang.String r1 = "network unavailable"
            r0.<init>(r1)
            throw r0
    }

    public static void requestAsync(com.tencent.connect.auth.QQToken r9, android.content.Context r10, java.lang.String r11, android.os.Bundle r12, java.lang.String r13, com.tencent.tauth.IRequestListener r14) {
            java.lang.String r0 = "openSDK_LOG.HttpUtils"
            java.lang.String r1 = "OpenApi requestAsync"
            com.tencent.open.log.SLog.i(r0, r1)
            com.tencent.open.utils.HttpUtils$1 r2 = new com.tencent.open.utils.HttpUtils$1
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r8 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8)
            com.tencent.open.utils.l.a(r2)
            return
    }
}
