package cn.jpush.android.w;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class e {
    public static final java.lang.String a = null;

    static {
            r0 = 10
            byte[] r0 = new byte[r0]
            r0 = {x000e: FILL_ARRAY_DATA , data: [32, 0, 14, 41, 38, 38, 63, 1, 23, 43} // fill-array
            java.lang.String r0 = cn.jpush.android.ad.d.b(r0)
            cn.jpush.android.w.e.a = r0
            return
    }

    public e() {
            r1 = this;
            r1.<init>()
            return
    }

    public static cn.jpush.android.w.d a(android.content.Context r2, cn.jpush.android.w.c r3) {
            r0 = 1
            r1 = 0
            cn.jpush.android.w.d r2 = a(r2, r3, r0, r1)
            return r2
    }

    public static cn.jpush.android.w.d a(android.content.Context r15, cn.jpush.android.w.c r16, boolean r17, boolean r18) {
            r1 = r16
            r2 = 0
            if (r1 != 0) goto L6
            return r2
        L6:
            cn.jpush.android.w.d r3 = new cn.jpush.android.w.d
            java.lang.String r0 = r1.a()
            r3.<init>(r0)
            boolean r0 = cn.jpush.android.helper.JCoreHelper.isAuth(r15)
            r4 = 3006(0xbbe, float:4.212E-42)
            if (r0 != 0) goto L21
            r3.a(r4)
            java.lang.String r0 = "user not auth!!!"
        L1d:
            r3.a(r0)
            return r3
        L21:
            boolean r0 = cn.jpush.android.helper.JCoreHelper.isContinueBusiness(r15)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = " https sdk continueBusiness="
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "HttpUtils"
            cn.jpush.android.helper.Logger.w(r6, r5)
            if (r0 != 0) goto L48
            java.lang.String r0 = " https sdk limit"
            cn.jpush.android.helper.Logger.w(r6, r0)
            r3.a(r4)
            java.lang.String r0 = "https sdk limit"
            goto L1d
        L48:
            java.lang.String r0 = r1.a()     // Catch: java.lang.Throwable -> L1d6 java.io.IOException -> L1db java.net.MalformedURLException -> L1e0
            java.net.HttpURLConnection r5 = a(r15, r0)     // Catch: java.lang.Throwable -> L1d6 java.io.IOException -> L1db java.net.MalformedURLException -> L1e0
            java.net.URL r0 = r5.getURL()     // Catch: java.lang.Throwable -> Le5 java.io.IOException -> Lea java.net.MalformedURLException -> Lf1
            int r8 = r0.getPort()     // Catch: java.lang.Throwable -> Le5 java.io.IOException -> Lea java.net.MalformedURLException -> Lf1
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le5 java.io.IOException -> Lea java.net.MalformedURLException -> Lf1
            r9.<init>()     // Catch: java.lang.Throwable -> Le5 java.io.IOException -> Lea java.net.MalformedURLException -> Lf1
            java.lang.String r10 = "host:"
            r9.append(r10)     // Catch: java.lang.Throwable -> Le5 java.io.IOException -> Lea java.net.MalformedURLException -> Lf1
            java.lang.String r0 = r0.getHost()     // Catch: java.lang.Throwable -> Le5 java.io.IOException -> Lea java.net.MalformedURLException -> Lf1
            r9.append(r0)     // Catch: java.lang.Throwable -> Le5 java.io.IOException -> Lea java.net.MalformedURLException -> Lf1
            java.lang.String r0 = ",port:"
            r9.append(r0)     // Catch: java.lang.Throwable -> Le5 java.io.IOException -> Lea java.net.MalformedURLException -> Lf1
            r9.append(r8)     // Catch: java.lang.Throwable -> Le5 java.io.IOException -> Lea java.net.MalformedURLException -> Lf1
            java.lang.String r0 = r9.toString()     // Catch: java.lang.Throwable -> Le5 java.io.IOException -> Lea java.net.MalformedURLException -> Lf1
            cn.jpush.android.helper.Logger.v(r6, r0)     // Catch: java.lang.Throwable -> Le5 java.io.IOException -> Lea java.net.MalformedURLException -> Lf1
            a(r1, r5)     // Catch: java.lang.Throwable -> Le5 java.io.IOException -> Lea java.net.MalformedURLException -> Lf1
            boolean r0 = r5 instanceof javax.net.ssl.HttpsURLConnection     // Catch: java.lang.Throwable -> Le5 java.io.IOException -> Lea java.net.MalformedURLException -> Lf1
            r8 = 1
            r9 = 0
            if (r0 == 0) goto Lf6
            javax.net.ssl.X509TrustManager r0 = r1.f()     // Catch: java.lang.Throwable -> La8
            if (r0 == 0) goto Laa
            java.lang.String r0 = "TLS"
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r0)     // Catch: java.lang.Throwable -> La8
            javax.net.ssl.X509TrustManager r10 = r1.f()     // Catch: java.lang.Throwable -> La8
            javax.net.ssl.TrustManager[] r11 = new javax.net.ssl.TrustManager[r8]     // Catch: java.lang.Throwable -> La8
            r11[r9] = r10     // Catch: java.lang.Throwable -> La8
            java.security.SecureRandom r10 = new java.security.SecureRandom     // Catch: java.lang.Throwable -> La8
            r10.<init>()     // Catch: java.lang.Throwable -> La8
            r0.init(r2, r11, r10)     // Catch: java.lang.Throwable -> La8
            r10 = r5
            javax.net.ssl.HttpsURLConnection r10 = (javax.net.ssl.HttpsURLConnection) r10     // Catch: java.lang.Throwable -> La8
            javax.net.ssl.SSLSocketFactory r0 = r0.getSocketFactory()     // Catch: java.lang.Throwable -> La8
            r10.setSSLSocketFactory(r0)     // Catch: java.lang.Throwable -> La8
            goto Laa
        La8:
            r0 = move-exception
            goto Lcc
        Laa:
            javax.net.ssl.HostnameVerifier r0 = r1.g()     // Catch: java.lang.Throwable -> La8
            if (r0 == 0) goto Lbb
            r0 = r5
            javax.net.ssl.HttpsURLConnection r0 = (javax.net.ssl.HttpsURLConnection) r0     // Catch: java.lang.Throwable -> La8
            javax.net.ssl.HostnameVerifier r10 = r1.g()     // Catch: java.lang.Throwable -> La8
        Lb7:
            r0.setHostnameVerifier(r10)     // Catch: java.lang.Throwable -> La8
            goto Lf6
        Lbb:
            r0 = r5
            javax.net.ssl.HttpsURLConnection r0 = (javax.net.ssl.HttpsURLConnection) r0     // Catch: java.lang.Throwable -> La8
            cn.jpush.android.w.a r10 = new cn.jpush.android.w.a     // Catch: java.lang.Throwable -> La8
            java.net.URL r11 = r5.getURL()     // Catch: java.lang.Throwable -> La8
            java.lang.String r11 = r11.getHost()     // Catch: java.lang.Throwable -> La8
            r10.<init>(r11)     // Catch: java.lang.Throwable -> La8
            goto Lb7
        Lcc:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le5 java.io.IOException -> Lea java.net.MalformedURLException -> Lf1
            r10.<init>()     // Catch: java.lang.Throwable -> Le5 java.io.IOException -> Lea java.net.MalformedURLException -> Lf1
            java.lang.String r11 = "set ssl config error:"
            r10.append(r11)     // Catch: java.lang.Throwable -> Le5 java.io.IOException -> Lea java.net.MalformedURLException -> Lf1
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> Le5 java.io.IOException -> Lea java.net.MalformedURLException -> Lf1
            r10.append(r0)     // Catch: java.lang.Throwable -> Le5 java.io.IOException -> Lea java.net.MalformedURLException -> Lf1
            java.lang.String r0 = r10.toString()     // Catch: java.lang.Throwable -> Le5 java.io.IOException -> Lea java.net.MalformedURLException -> Lf1
            cn.jpush.android.helper.Logger.ww(r6, r0)     // Catch: java.lang.Throwable -> Le5 java.io.IOException -> Lea java.net.MalformedURLException -> Lf1
            goto Lf6
        Le5:
            r0 = move-exception
            r1 = r2
            r13 = r1
            goto L1e6
        Lea:
            r0 = move-exception
            r1 = r2
            r13 = r1
            r14 = r13
        Lee:
            r2 = r5
            goto L224
        Lf1:
            r0 = move-exception
            r1 = r2
            r13 = r1
            goto L283
        Lf6:
            if (r17 != 0) goto Lfa
            if (r18 == 0) goto L132
        Lfa:
            if (r18 == 0) goto Lff
            java.lang.String r0 = "PUT"
            goto L101
        Lff:
            java.lang.String r0 = "POST"
        L101:
            r5.setRequestMethod(r0)     // Catch: java.lang.Throwable -> Le5 java.io.IOException -> Lea java.net.MalformedURLException -> Lf1
            r5.setDoOutput(r8)     // Catch: java.lang.Throwable -> Le5 java.io.IOException -> Lea java.net.MalformedURLException -> Lf1
            r5.setDoInput(r8)     // Catch: java.lang.Throwable -> Le5 java.io.IOException -> Lea java.net.MalformedURLException -> Lf1
            boolean r0 = r1.d()     // Catch: java.lang.Throwable -> Le5 java.io.IOException -> Lea java.net.MalformedURLException -> Lf1
            r5.setUseCaches(r0)     // Catch: java.lang.Throwable -> Le5 java.io.IOException -> Lea java.net.MalformedURLException -> Lf1
            byte[] r0 = r1.h()     // Catch: java.lang.Throwable -> Le5 java.io.IOException -> Lea java.net.MalformedURLException -> Lf1
            if (r0 == 0) goto L132
            int r8 = r0.length     // Catch: java.lang.Throwable -> Le5 java.io.IOException -> Lea java.net.MalformedURLException -> Lf1
            java.io.OutputStream r10 = r5.getOutputStream()     // Catch: java.lang.Throwable -> Le5 java.io.IOException -> Lea java.net.MalformedURLException -> Lf1
            r10.write(r0)     // Catch: java.lang.Throwable -> L121 java.io.IOException -> L126 java.net.MalformedURLException -> L12d
            r13 = r10
            goto L134
        L121:
            r0 = move-exception
            r1 = r2
            r13 = r10
            goto L1e6
        L126:
            r0 = move-exception
            r1 = r2
            r14 = r1
            r2 = r5
            r13 = r10
            goto L224
        L12d:
            r0 = move-exception
            r1 = r2
            r13 = r10
            goto L283
        L132:
            r13 = r2
            r8 = 0
        L134:
            int r10 = r5.getResponseCode()     // Catch: java.lang.Throwable -> L1ca java.io.IOException -> L1cd java.net.MalformedURLException -> L1d2
            r3.a(r10)     // Catch: java.lang.Throwable -> L1ca java.io.IOException -> L1cd java.net.MalformedURLException -> L1d2
            java.io.InputStream r0 = r5.getInputStream()     // Catch: java.lang.Throwable -> L141
            r14 = r0
            goto L15b
        L141:
            r0 = move-exception
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1ca java.io.IOException -> L1cd java.net.MalformedURLException -> L1d2
            r11.<init>()     // Catch: java.lang.Throwable -> L1ca java.io.IOException -> L1cd java.net.MalformedURLException -> L1d2
            java.lang.String r12 = "get input stream error:"
            r11.append(r12)     // Catch: java.lang.Throwable -> L1ca java.io.IOException -> L1cd java.net.MalformedURLException -> L1d2
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L1ca java.io.IOException -> L1cd java.net.MalformedURLException -> L1d2
            r11.append(r0)     // Catch: java.lang.Throwable -> L1ca java.io.IOException -> L1cd java.net.MalformedURLException -> L1d2
            java.lang.String r0 = r11.toString()     // Catch: java.lang.Throwable -> L1ca java.io.IOException -> L1cd java.net.MalformedURLException -> L1d2
            cn.jpush.android.helper.Logger.d(r6, r0)     // Catch: java.lang.Throwable -> L1ca java.io.IOException -> L1cd java.net.MalformedURLException -> L1d2
            r14 = r2
        L15b:
            boolean r0 = r1.j()     // Catch: java.lang.Throwable -> L18d java.io.IOException -> L192 java.net.MalformedURLException -> L196
            if (r0 == 0) goto L177
            if (r14 == 0) goto L177
            byte[] r0 = a(r14)     // Catch: java.lang.Throwable -> L176
            if (r0 == 0) goto L178
            boolean r11 = r1.k()     // Catch: java.lang.Throwable -> L174
            if (r11 == 0) goto L178
            byte[] r0 = cn.jpush.android.ad.m.a(r0)     // Catch: java.lang.Throwable -> L174
            goto L178
        L174:
            goto L178
        L176:
        L177:
            r0 = r2
        L178:
            if (r0 != 0) goto L19b
            r11 = 200(0xc8, float:2.8E-43)
            if (r10 == r11) goto L19b
            boolean r10 = r1.e()     // Catch: java.lang.Throwable -> L18d java.io.IOException -> L192 java.net.MalformedURLException -> L196
            if (r10 == 0) goto L19b
            java.io.InputStream r2 = r5.getErrorStream()     // Catch: java.lang.Throwable -> L18d java.io.IOException -> L192 java.net.MalformedURLException -> L196
            byte[] r0 = a(r2)     // Catch: java.lang.Throwable -> L18d java.io.IOException -> L192 java.net.MalformedURLException -> L196
            goto L19b
        L18d:
            r0 = move-exception
            r1 = r2
            r2 = r14
            goto L1e6
        L192:
            r0 = move-exception
            r1 = r2
            goto Lee
        L196:
            r0 = move-exception
            r1 = r2
            r2 = r14
            goto L283
        L19b:
            if (r0 == 0) goto L1aa
            int r9 = r0.length     // Catch: java.lang.Throwable -> L18d java.io.IOException -> L192 java.net.MalformedURLException -> L196
            java.lang.String r10 = new java.lang.String     // Catch: java.lang.Throwable -> L18d java.io.IOException -> L192 java.net.MalformedURLException -> L196
            java.lang.String r11 = "UTF-8"
            r10.<init>(r0, r11)     // Catch: java.lang.Throwable -> L18d java.io.IOException -> L192 java.net.MalformedURLException -> L196
            r3.a(r10)     // Catch: java.lang.Throwable -> L18d java.io.IOException -> L192 java.net.MalformedURLException -> L196
            r12 = r9
            goto L1ab
        L1aa:
            r12 = 0
        L1ab:
            java.lang.String r0 = r1.a()     // Catch: java.lang.Throwable -> L18d java.io.IOException -> L192 java.net.MalformedURLException -> L196
            java.lang.String r9 = r1.l()     // Catch: java.lang.Throwable -> L18d java.io.IOException -> L192 java.net.MalformedURLException -> L196
            long r10 = (long) r8     // Catch: java.lang.Throwable -> L18d java.io.IOException -> L192 java.net.MalformedURLException -> L196
            r7 = r15
            r8 = r0
            cn.jpush.android.helper.JCoreHelper.netMonitor(r7, r8, r9, r10, r12)     // Catch: java.lang.Throwable -> L18d java.io.IOException -> L192 java.net.MalformedURLException -> L196
            a(r5, r3)     // Catch: java.lang.Throwable -> L18d java.io.IOException -> L192 java.net.MalformedURLException -> L196
            cn.jpush.android.ad.m.a(r14)
            cn.jpush.android.ad.m.a(r2)
            cn.jpush.android.ad.m.a(r13)
        L1c5:
            r5.disconnect()
            goto L2b2
        L1ca:
            r0 = move-exception
            r1 = r2
            goto L1e6
        L1cd:
            r0 = move-exception
            r1 = r2
            r14 = r1
            goto Lee
        L1d2:
            r0 = move-exception
            r1 = r2
            goto L283
        L1d6:
            r0 = move-exception
            r1 = r2
            r5 = r1
            r13 = r5
            goto L1e6
        L1db:
            r0 = move-exception
            r1 = r2
            r13 = r1
            r14 = r13
            goto L224
        L1e0:
            r0 = move-exception
            r1 = r2
            r5 = r1
            r13 = r5
            goto L283
        L1e6:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L221
            r7.<init>()     // Catch: java.lang.Throwable -> L221
            java.lang.String r8 = "http post Exception error:"
            r7.append(r8)     // Catch: java.lang.Throwable -> L221
            r7.append(r0)     // Catch: java.lang.Throwable -> L221
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L221
            cn.jpush.android.helper.Logger.w(r6, r7)     // Catch: java.lang.Throwable -> L221
            r3.a(r4)     // Catch: java.lang.Throwable -> L221
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L221
            r4.<init>()     // Catch: java.lang.Throwable -> L221
            java.lang.String r6 = "UNKnow execption"
            r4.append(r6)     // Catch: java.lang.Throwable -> L221
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L221
            r4.append(r0)     // Catch: java.lang.Throwable -> L221
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L221
            r3.a(r0)     // Catch: java.lang.Throwable -> L221
            cn.jpush.android.ad.m.a(r2)
            cn.jpush.android.ad.m.a(r1)
            cn.jpush.android.ad.m.a(r13)
            if (r5 == 0) goto L2b2
        L220:
            goto L1c5
        L221:
            r0 = move-exception
            goto L2b3
        L224:
            r4 = 2998(0xbb6, float:4.201E-42)
            r3.a(r4)     // Catch: java.lang.Throwable -> L23f
            java.lang.String r4 = "网络错误"
            r3.a(r4)     // Catch: java.lang.Throwable -> L23f
            boolean r4 = r0 instanceof java.net.SocketTimeoutException     // Catch: java.lang.Throwable -> L23f
            if (r4 == 0) goto L243
            r4 = 3001(0xbb9, float:4.205E-42)
            r3.a(r4)     // Catch: java.lang.Throwable -> L23f
            java.lang.String r4 = "请求超时"
        L23b:
            r3.a(r4)     // Catch: java.lang.Throwable -> L23f
            goto L25c
        L23f:
            r0 = move-exception
            r5 = r2
            r2 = r14
            goto L2b3
        L243:
            boolean r4 = r0 instanceof java.net.UnknownHostException     // Catch: java.lang.Throwable -> L23f
            if (r4 == 0) goto L250
            r4 = 3003(0xbbb, float:4.208E-42)
            r3.a(r4)     // Catch: java.lang.Throwable -> L23f
            java.lang.String r4 = "域名无效"
            goto L23b
        L250:
            boolean r4 = r0 instanceof javax.net.ssl.SSLHandshakeException     // Catch: java.lang.Throwable -> L23f
            if (r4 == 0) goto L25c
            r4 = 3005(0xbbd, float:4.211E-42)
            r3.a(r4)     // Catch: java.lang.Throwable -> L23f
            java.lang.String r4 = "SSL失败"
            goto L23b
        L25c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23f
            r4.<init>()     // Catch: java.lang.Throwable -> L23f
            java.lang.String r5 = "http post IOException error:"
            r4.append(r5)     // Catch: java.lang.Throwable -> L23f
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L23f
            r4.append(r0)     // Catch: java.lang.Throwable -> L23f
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L23f
            cn.jpush.android.helper.Logger.w(r6, r0)     // Catch: java.lang.Throwable -> L23f
            cn.jpush.android.ad.m.a(r14)
            cn.jpush.android.ad.m.a(r1)
            cn.jpush.android.ad.m.a(r13)
            if (r2 == 0) goto L2b2
            r2.disconnect()
            goto L2b2
        L283:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L221
            r4.<init>()     // Catch: java.lang.Throwable -> L221
            java.lang.String r7 = "http post  error:"
            r4.append(r7)     // Catch: java.lang.Throwable -> L221
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L221
            r4.append(r0)     // Catch: java.lang.Throwable -> L221
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L221
            cn.jpush.android.helper.Logger.w(r6, r0)     // Catch: java.lang.Throwable -> L221
            r0 = 3004(0xbbc, float:4.21E-42)
            r3.a(r0)     // Catch: java.lang.Throwable -> L221
            java.lang.String r0 = "MalformedURLException"
            r3.a(r0)     // Catch: java.lang.Throwable -> L221
            cn.jpush.android.ad.m.a(r2)
            cn.jpush.android.ad.m.a(r1)
            cn.jpush.android.ad.m.a(r13)
            if (r5 == 0) goto L2b2
            goto L220
        L2b2:
            return r3
        L2b3:
            cn.jpush.android.ad.m.a(r2)
            cn.jpush.android.ad.m.a(r1)
            cn.jpush.android.ad.m.a(r13)
            if (r5 == 0) goto L2c1
            r5.disconnect()
        L2c1:
            throw r0
    }

    public static java.lang.String a(java.util.Map<java.lang.String, java.lang.String> r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            if (r3 == 0) goto L4c
            int r1 = r3.size()
            if (r1 <= 0) goto L4c
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L17:
            boolean r1 = r3.hasNext()     // Catch: java.lang.Exception -> L4c
            if (r1 == 0) goto L4c
            java.lang.Object r1 = r3.next()     // Catch: java.lang.Exception -> L4c
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Exception -> L4c
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Exception -> L4c
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L4c
            r0.append(r2)     // Catch: java.lang.Exception -> L4c
            java.lang.String r2 = "="
            r0.append(r2)     // Catch: java.lang.Exception -> L4c
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Exception -> L4c
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L4c
            java.lang.String r2 = "UTF-8"
            java.lang.String r1 = java.net.URLEncoder.encode(r1, r2)     // Catch: java.lang.Exception -> L4c
            r0.append(r1)     // Catch: java.lang.Exception -> L4c
            boolean r1 = r3.hasNext()     // Catch: java.lang.Exception -> L4c
            if (r1 == 0) goto L17
            java.lang.String r1 = "&"
            r0.append(r1)     // Catch: java.lang.Exception -> L4c
            goto L17
        L4c:
            java.lang.String r3 = r0.toString()
            return r3
    }

    public static java.net.HttpURLConnection a(android.content.Context r0, java.lang.String r1) {
            java.net.URL r0 = new java.net.URL
            r0.<init>(r1)
            java.net.URLConnection r0 = r0.openConnection()
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0
            return r0
    }

    private static void a(cn.jpush.android.w.c r1, java.net.HttpURLConnection r2) {
            if (r1 == 0) goto L26
            if (r2 != 0) goto L5
            goto L26
        L5:
            java.util.Map r0 = r1.i()
            a(r0, r2)
            int r0 = r1.b()
            if (r0 < 0) goto L19
            int r0 = r1.b()
            r2.setConnectTimeout(r0)
        L19:
            int r0 = r1.c()
            if (r0 < 0) goto L26
            int r1 = r1.c()
            r2.setReadTimeout(r1)
        L26:
            return
    }

    private static void a(java.net.HttpURLConnection r2, cn.jpush.android.w.d r3) {
            if (r3 == 0) goto L29
            if (r2 != 0) goto L5
            goto L29
        L5:
            int r0 = r2.getResponseCode()
            r3.a(r0)
            int r0 = r2.getResponseCode()
            r3.b(r0)
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r2.getHeaderField(r0)
            java.lang.String r1 = "expires"
            r3.a(r1, r0)
            java.lang.String r0 = "Cache-Control"
            java.lang.String r2 = r2.getHeaderField(r0)
            java.lang.String r0 = "cache-control"
            r3.a(r0, r2)
        L29:
            return
    }

    public static void a(java.util.Map<java.lang.String, java.lang.String> r2, java.net.HttpURLConnection r3) {
            if (r2 == 0) goto L3b
            int r0 = r2.size()
            if (r0 == 0) goto L3b
            if (r3 != 0) goto Lb
            goto L3b
        Lb:
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L13:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L13
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r3.setRequestProperty(r1, r0)
            goto L13
        L3b:
            return
    }

    public static byte[] a(java.io.InputStream r0) {
            byte[] r0 = cn.jpush.android.ad.m.b(r0)
            return r0
    }
}
