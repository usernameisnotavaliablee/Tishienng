package cn.jiguang.y;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c {
    public static cn.jiguang.net.JGTrustManager a;

    public c() {
            r1 = this;
            r1.<init>()
            return
    }

    public static cn.jiguang.y.h a(android.content.Context r5, java.lang.String r6, cn.jiguang.y.g.a r7, int r8, java.util.Set<java.lang.String> r9) {
            java.lang.String r0 = "Exception - "
            r1 = -2
            cn.jiguang.net.HttpRequest r2 = new cn.jiguang.net.HttpRequest     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 java.lang.AssertionError -> L6b
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 java.lang.AssertionError -> L6b
            java.lang.String r6 = r9.toString()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 java.lang.AssertionError -> L6b
            r2.setType(r6)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 java.lang.AssertionError -> L6b
            a(r2, r5, r7)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 java.lang.AssertionError -> L6b
        L12:
            if (r8 <= 0) goto La1
            int r8 = r8 + (-1)
            cn.jiguang.net.HttpResponse r6 = cn.jiguang.net.HttpUtils.httpPost(r5, r2)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 java.lang.AssertionError -> L6b
            int r7 = r6.getResponseCode()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 java.lang.AssertionError -> L6b
            java.lang.String r9 = "HttpHelper"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 java.lang.AssertionError -> L6b
            r3.<init>()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 java.lang.AssertionError -> L6b
            java.lang.String r4 = "status code:"
            r3.append(r4)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 java.lang.AssertionError -> L6b
            r3.append(r7)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 java.lang.AssertionError -> L6b
            java.lang.String r4 = " retry left:"
            r3.append(r4)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 java.lang.AssertionError -> L6b
            r3.append(r8)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 java.lang.AssertionError -> L6b
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 java.lang.AssertionError -> L6b
            cn.jiguang.w.f.d(r9, r3)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 java.lang.AssertionError -> L6b
            r9 = 200(0xc8, float:2.8E-43)
            if (r7 == r9) goto L96
            r9 = 401(0x191, float:5.62E-43)
            if (r7 == r9) goto L8b
            r9 = 404(0x194, float:5.66E-43)
            r3 = -1
            if (r7 == r9) goto L81
            r9 = 410(0x19a, float:5.75E-43)
            if (r7 == r9) goto L81
            r9 = 429(0x1ad, float:6.01E-43)
            if (r7 == r9) goto L81
            r9 = 503(0x1f7, float:7.05E-43)
            if (r7 == r9) goto L77
            r9 = 3005(0xbbd, float:4.211E-42)
            if (r7 == r9) goto L12
            r5 = 500(0x1f4, float:7.0E-43)
            if (r7 < r5) goto L6d
            cn.jiguang.y.h r5 = new cn.jiguang.y.h     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 java.lang.AssertionError -> L6b
            java.lang.String r6 = r6.getResponseBody()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 java.lang.AssertionError -> L6b
            r5.<init>(r3, r6)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 java.lang.AssertionError -> L6b
            return r5
        L67:
            r5 = move-exception
            goto La9
        L69:
            r5 = move-exception
            goto Lc2
        L6b:
            r5 = move-exception
            goto Ldb
        L6d:
            cn.jiguang.y.h r5 = new cn.jiguang.y.h     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 java.lang.AssertionError -> L6b
            java.lang.String r6 = r6.getResponseBody()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 java.lang.AssertionError -> L6b
            r5.<init>(r1, r6)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 java.lang.AssertionError -> L6b
            return r5
        L77:
            cn.jiguang.y.h r5 = new cn.jiguang.y.h     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 java.lang.AssertionError -> L6b
            java.lang.String r6 = r6.getResponseBody()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 java.lang.AssertionError -> L6b
            r5.<init>(r1, r6)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 java.lang.AssertionError -> L6b
            return r5
        L81:
            cn.jiguang.y.h r5 = new cn.jiguang.y.h     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 java.lang.AssertionError -> L6b
            java.lang.String r6 = r6.getResponseBody()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 java.lang.AssertionError -> L6b
            r5.<init>(r3, r6)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 java.lang.AssertionError -> L6b
            return r5
        L8b:
            cn.jiguang.y.h r5 = new cn.jiguang.y.h     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 java.lang.AssertionError -> L6b
            java.lang.String r6 = r6.getResponseBody()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 java.lang.AssertionError -> L6b
            r7 = -3
            r5.<init>(r7, r6)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 java.lang.AssertionError -> L6b
            return r5
        L96:
            cn.jiguang.y.h r5 = new cn.jiguang.y.h     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 java.lang.AssertionError -> L6b
            java.lang.String r6 = r6.getResponseBody()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 java.lang.AssertionError -> L6b
            r7 = 0
            r5.<init>(r7, r6)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69 java.lang.AssertionError -> L6b
            return r5
        La1:
            cn.jiguang.y.h r5 = new cn.jiguang.y.h
            java.lang.String r6 = "Failed - retry enough"
            r5.<init>(r1, r6)
            return r5
        La9:
            cn.jiguang.y.h r6 = new cn.jiguang.y.h
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            java.lang.String r5 = r5.getMessage()
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6.<init>(r1, r5)
            return r6
        Lc2:
            cn.jiguang.y.h r6 = new cn.jiguang.y.h
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            java.lang.String r5 = r5.getMessage()
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6.<init>(r1, r5)
            return r6
        Ldb:
            cn.jiguang.y.h r6 = new cn.jiguang.y.h
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Catch AssertionError to avoid http close crash - "
            r7.append(r8)
            java.lang.String r5 = r5.getMessage()
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6.<init>(r1, r5)
            return r6
    }

    public static cn.jiguang.y.h a(java.lang.String r4, java.lang.String r5, android.content.Context r6, boolean r7, int r8, int r9) {
            java.lang.String r0 = "Exception - "
            r1 = -2
            java.lang.String r2 = "UTF-8"
            byte[] r5 = r5.getBytes(r2)     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16 java.io.UnsupportedEncodingException -> Ldd
            if (r7 == 0) goto L36
            byte[] r5 = cn.jiguang.av.x.a(r5)     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16 java.io.IOException -> L19
            goto L36
        L10:
            r4 = move-exception
            goto Lf7
        L13:
            r4 = move-exception
            goto L110
        L16:
            r4 = move-exception
            goto L129
        L19:
            r4 = move-exception
            cn.jiguang.y.h r5 = new cn.jiguang.y.h     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16
            r6.<init>()     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16
            java.lang.String r7 = "zip err:"
            r6.append(r7)     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16
            r6.append(r4)     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16
            r5.<init>(r1, r4)     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16
            return r5
        L36:
            cn.jiguang.net.HttpRequest r7 = new cn.jiguang.net.HttpRequest     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16
            r7.<init>(r4)     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16
            a(r7, r6, r5, r9)     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16
        L3e:
            if (r8 <= 0) goto Ld5
            int r8 = r8 + (-1)
            cn.jiguang.net.HttpResponse r4 = cn.jiguang.net.HttpUtils.httpPost(r6, r7)     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16
            int r5 = r4.getResponseCode()     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16
            java.lang.String r9 = "HttpHelper"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16
            r2.<init>()     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16
            java.lang.String r3 = "status code:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16
            r2.append(r5)     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16
            java.lang.String r3 = " retry left:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16
            r2.append(r8)     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16
            cn.jiguang.w.f.d(r9, r2)     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16
            r9 = 200(0xc8, float:2.8E-43)
            if (r5 == r9) goto Lca
            r9 = 401(0x191, float:5.62E-43)
            if (r5 == r9) goto Lbf
            r9 = 404(0x194, float:5.66E-43)
            r2 = -1
            if (r5 == r9) goto Lb5
            r9 = 410(0x19a, float:5.75E-43)
            if (r5 == r9) goto Lb5
            r9 = 429(0x1ad, float:6.01E-43)
            if (r5 == r9) goto Lb5
            r9 = 503(0x1f7, float:7.05E-43)
            if (r5 == r9) goto Lab
            r9 = 3005(0xbbd, float:4.211E-42)
            if (r5 == r9) goto L3e
            r6 = 3006(0xbbe, float:4.212E-42)
            if (r5 == r6) goto La1
            r6 = 500(0x1f4, float:7.0E-43)
            if (r5 < r6) goto L97
            cn.jiguang.y.h r5 = new cn.jiguang.y.h     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16
            java.lang.String r4 = r4.getResponseBody()     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16
            r5.<init>(r2, r4)     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16
            return r5
        L97:
            cn.jiguang.y.h r5 = new cn.jiguang.y.h     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16
            java.lang.String r4 = r4.getResponseBody()     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16
            r5.<init>(r1, r4)     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16
            return r5
        La1:
            cn.jiguang.y.h r5 = new cn.jiguang.y.h     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16
            java.lang.String r4 = r4.getResponseBody()     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16
            r5.<init>(r6, r4)     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16
            return r5
        Lab:
            cn.jiguang.y.h r5 = new cn.jiguang.y.h     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16
            java.lang.String r4 = r4.getResponseBody()     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16
            r5.<init>(r1, r4)     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16
            return r5
        Lb5:
            cn.jiguang.y.h r5 = new cn.jiguang.y.h     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16
            java.lang.String r4 = r4.getResponseBody()     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16
            r5.<init>(r2, r4)     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16
            return r5
        Lbf:
            cn.jiguang.y.h r5 = new cn.jiguang.y.h     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16
            java.lang.String r4 = r4.getResponseBody()     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16
            r6 = -3
            r5.<init>(r6, r4)     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16
            return r5
        Lca:
            cn.jiguang.y.h r5 = new cn.jiguang.y.h     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16
            java.lang.String r4 = r4.getResponseBody()     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16
            r6 = 0
            r5.<init>(r6, r4)     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16
            return r5
        Ld5:
            cn.jiguang.y.h r4 = new cn.jiguang.y.h
            java.lang.String r5 = "Failed - retry enough"
            r4.<init>(r1, r5)
            return r4
        Ldd:
            r4 = move-exception
            cn.jiguang.y.h r5 = new cn.jiguang.y.h     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16
            r6.<init>()     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16
            r6.append(r0)     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16
            r6.append(r4)     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16
            r5.<init>(r1, r4)     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L13 java.lang.AssertionError -> L16
            return r5
        Lf7:
            cn.jiguang.y.h r5 = new cn.jiguang.y.h
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            java.lang.String r4 = r4.getMessage()
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.<init>(r1, r4)
            return r5
        L110:
            cn.jiguang.y.h r5 = new cn.jiguang.y.h
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            java.lang.String r4 = r4.getMessage()
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.<init>(r1, r4)
            return r5
        L129:
            cn.jiguang.y.h r5 = new cn.jiguang.y.h
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Catch AssertionError to avoid http close crash - "
            r6.append(r7)
            java.lang.String r4 = r4.getMessage()
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.<init>(r1, r4)
            return r5
    }

    private static void a(cn.jiguang.net.HttpRequest r5, android.content.Context r6, cn.jiguang.y.g.a r7) {
            r0 = 30000(0x7530, float:4.2039E-41)
            r5.setConnectTimeout(r0)
            r5.setReadTimeout(r0)
            r0 = 1
            r5.setDoOutPut(r0)
            r5.setDoInPut(r0)
            r1 = 0
            r5.setUseCaches(r1)
            byte[] r2 = r7.b()
            r5.setBody(r2)
            int r2 = r2.length
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "Content-Length"
            r5.setRequestProperty(r3, r2)
            r5.setNeedRetryIfHttpsFailed(r0)
            cn.jiguang.net.JGTrustManager r2 = cn.jiguang.y.c.a
            if (r2 != 0) goto L3c
            java.lang.String r2 = ""
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L3b
            if (r3 != 0) goto L3c
            cn.jiguang.net.JGTrustManager r3 = new cn.jiguang.net.JGTrustManager     // Catch: java.lang.Throwable -> L3b
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L3b
            cn.jiguang.y.c.a = r3     // Catch: java.lang.Throwable -> L3b
            goto L3c
        L3b:
        L3c:
            cn.jiguang.net.JGTrustManager r2 = cn.jiguang.y.c.a
            if (r2 == 0) goto L43
            r5.setSslTrustManager(r2)
        L43:
            java.lang.String r2 = "Accept"
            java.lang.String r3 = "application/jason"
            r5.setRequestProperty(r2, r3)
            java.lang.String r2 = "Accept-Encoding"
            java.lang.String r3 = "gzip"
            r5.setRequestProperty(r2, r3)
            java.lang.String r2 = "X-App-Key"
            java.lang.String r3 = cn.jiguang.d.a.e(r6)
            r5.setRequestProperty(r2, r3)
            java.lang.String r2 = "Charset"
            java.lang.String r3 = "UTF-8"
            r5.setRequestProperty(r2, r3)
            java.lang.String r2 = r5.getUrl()
            java.lang.String r3 = "ipv6"
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L70
            java.lang.String r3 = cn.jiguang.y.g.f1578f
            goto L72
        L70:
            java.lang.String r3 = cn.jiguang.y.g.f1577e
        L72:
            boolean r4 = cn.jiguang.api.JCoreManager.isTestEnv()
            if (r4 == 0) goto L80
            android.net.Uri r2 = android.net.Uri.parse(r2)
            java.lang.String r3 = r2.getHost()
        L80:
            java.lang.String r2 = "Host"
            r5.setRequestProperty(r2, r3)
            r5.setHaveRspData(r0)
            r5.setRspDatazip(r1)
            r5.setNeedErrorInput(r0)
            cn.jiguang.y.b r0 = new cn.jiguang.y.b
            r0.<init>(r6, r7)
            r0.a()
            java.lang.String r6 = "Authorization"
            java.lang.String r7 = r0.b()
            r5.setRequestProperty(r6, r7)
            java.lang.String r6 = "x-jg-version"
            java.lang.String r7 = r0.f()
            r5.setRequestProperty(r6, r7)
            java.lang.String r6 = "x-jg-sign"
            java.lang.String r7 = r0.d()
            r5.setRequestProperty(r6, r7)
            java.lang.String r6 = "x-jg-timestamp"
            java.lang.String r7 = r0.e()
            r5.setRequestProperty(r6, r7)
            java.lang.String r6 = "x-jg-token"
            java.lang.String r7 = r0.c()
            r5.setRequestProperty(r6, r7)
            return
    }

    private static void a(cn.jiguang.net.HttpRequest r7, android.content.Context r8, byte[] r9, int r10) {
            r0 = 30000(0x7530, float:4.2039E-41)
            r7.setConnectTimeout(r0)
            r7.setReadTimeout(r0)
            r0 = 1
            r7.setDoOutPut(r0)
            r7.setDoInPut(r0)
            r1 = 0
            r7.setUseCaches(r1)
            int r2 = cn.jiguang.av.t.a()
            long r2 = (long) r2
            java.lang.String r2 = cn.jiguang.av.t.a(r2)
            r3 = 3
            r4 = 2
            if (r10 == r4) goto L26
            if (r10 != r3) goto L23
            goto L26
        L23:
            java.lang.String r5 = cn.jiguang.y.g.f1574b
            goto L28
        L26:
            java.lang.String r5 = cn.jiguang.y.g.a
        L28:
            byte[] r9 = cn.jiguang.av.t.a(r9, r2, r5, r0)
            r7.setBody(r9)
            int r5 = r9.length
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = "Content-Length"
            r7.setRequestProperty(r6, r5)
            r7.setNeedRetryIfHttpsFailed(r0)
            cn.jiguang.net.JGTrustManager r5 = cn.jiguang.y.c.a
            if (r5 != 0) goto L51
            java.lang.String r5 = ""
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L50
            if (r6 != 0) goto L51
            cn.jiguang.net.JGTrustManager r6 = new cn.jiguang.net.JGTrustManager     // Catch: java.lang.Throwable -> L50
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L50
            cn.jiguang.y.c.a = r6     // Catch: java.lang.Throwable -> L50
            goto L51
        L50:
        L51:
            cn.jiguang.net.JGTrustManager r5 = cn.jiguang.y.c.a
            if (r5 == 0) goto L58
            r7.setSslTrustManager(r5)
        L58:
            java.lang.String r5 = "Accept"
            java.lang.String r6 = "application/jason"
            r7.setRequestProperty(r5, r6)
            java.lang.String r5 = "Accept-Encoding"
            java.lang.String r6 = "gzip"
            r7.setRequestProperty(r5, r6)
            java.lang.String r5 = "X-App-Key"
            java.lang.String r6 = cn.jiguang.d.a.e(r8)
            r7.setRequestProperty(r5, r6)
            java.lang.String r5 = "Authorization"
            if (r10 == r4) goto L9e
            if (r10 != r3) goto L76
            goto L9e
        L76:
            r3 = 4
            if (r10 != r3) goto L7a
            goto L7b
        L7a:
            r0 = 0
        L7b:
            r7.setHaveRspData(r0)
            r7.setRspDatazip(r0)
            java.lang.String r9 = cn.jiguang.av.v.c(r9)
            java.lang.String r8 = cn.jiguang.y.g.a(r8, r9, r2, r0)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Basic "
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
        L9a:
            r7.setRequestProperty(r5, r8)
            goto Lc1
        L9e:
            r7.setHaveRspData(r0)
            r7.setRspDatazip(r0)
            r7.setNeedErrorInput(r0)
            java.lang.String r8 = "FillType"
            java.lang.String r9 = "1"
            r7.setRequestProperty(r8, r9)
            if (r10 != r3) goto Lbc
            java.lang.String r8 = "X-Real-IP"
            java.lang.String r9 = "jcore"
            r7.setRequestProperty(r8, r9)
            java.lang.String r8 = cn.jiguang.y.g.c(r2)
            goto L9a
        Lbc:
            java.lang.String r8 = cn.jiguang.y.g.b(r2)
            goto L9a
        Lc1:
            java.lang.String r8 = "Charset"
            java.lang.String r9 = "UTF-8"
            r7.setRequestProperty(r8, r9)
            return
    }
}
