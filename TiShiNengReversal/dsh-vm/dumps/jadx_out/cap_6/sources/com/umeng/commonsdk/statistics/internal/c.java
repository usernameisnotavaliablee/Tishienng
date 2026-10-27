package com.umeng.commonsdk.statistics.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class c {
    private static boolean e;
    private static boolean f;
    private static boolean g;
    private java.lang.String a;
    private int b;
    private android.content.Context c;
    private com.umeng.commonsdk.statistics.internal.b d;




    static {
            return
    }

    public c(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "10.0.0.172"
            r1.a = r0
            r0 = 80
            r1.b = r0
            r1.c = r2
            return
    }

    static /* synthetic */ android.content.Context a(com.umeng.commonsdk.statistics.internal.c r0) {
            android.content.Context r0 = r0.c
            return r0
    }

    private void a() {
            r4 = this;
            android.content.Context r0 = r4.c
            java.lang.String r1 = "domain_p"
            java.lang.String r2 = ""
            java.lang.String r0 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r0, r1, r2)
            android.content.Context r1 = r4.c
            java.lang.String r3 = "domain_s"
            java.lang.String r1 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r1, r3, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L1e
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DataHelper.assembleURL(r0)
            com.umeng.commonsdk.statistics.UMServerURL.DEFAULT_URL = r0
        L1e:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L2a
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DataHelper.assembleURL(r1)
            com.umeng.commonsdk.statistics.UMServerURL.SECONDARY_URL = r0
        L2a:
            java.lang.String r0 = com.umeng.commonsdk.statistics.UMServerURL.DEFAULT_URL
            java.lang.String r1 = com.umeng.commonsdk.statistics.UMServerURL.SECONDARY_URL
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            com.umeng.commonsdk.statistics.AnalyticsConstants.APPLOG_URL_LIST = r0
            return
    }

    private void b() {
            r4 = this;
            android.content.Context r0 = r4.c
            java.lang.String r1 = "domain_p"
            java.lang.String r2 = ""
            java.lang.String r0 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r0, r1, r2)
            android.content.Context r1 = r4.c
            java.lang.String r3 = "domain_s"
            java.lang.String r1 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r1, r3, r2)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L1e
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DataHelper.assembleURL(r0)
            com.umeng.commonsdk.statistics.UMServerURL.DEFAULT_URL = r0
        L1e:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L2a
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DataHelper.assembleURL(r1)
            com.umeng.commonsdk.statistics.UMServerURL.SECONDARY_URL = r0
        L2a:
            android.content.Context r0 = r4.c
            java.lang.String r1 = "oversea_domain_p"
            java.lang.String r0 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r0, r1, r2)
            android.content.Context r1 = r4.c
            java.lang.String r3 = "oversea_domain_s"
            java.lang.String r1 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r1, r3, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L46
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DataHelper.assembleURL(r0)
            com.umeng.commonsdk.statistics.UMServerURL.OVERSEA_DEFAULT_URL = r0
        L46:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L52
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DataHelper.assembleURL(r1)
            com.umeng.commonsdk.statistics.UMServerURL.OVERSEA_SECONDARY_URL = r0
        L52:
            java.lang.String r0 = com.umeng.commonsdk.statistics.UMServerURL.OVERSEA_DEFAULT_URL
            java.lang.String r1 = com.umeng.commonsdk.statistics.UMServerURL.OVERSEA_SECONDARY_URL
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            com.umeng.commonsdk.statistics.AnalyticsConstants.APPLOG_URL_LIST = r0
            java.lang.String r0 = com.umeng.commonsdk.statistics.b.b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L82
            java.lang.String r0 = com.umeng.commonsdk.statistics.b.b
            java.lang.String r1 = "460"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L78
            java.lang.String r0 = com.umeng.commonsdk.statistics.b.b
            java.lang.String r1 = "461"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L82
        L78:
            java.lang.String r0 = com.umeng.commonsdk.statistics.UMServerURL.DEFAULT_URL
            java.lang.String r1 = com.umeng.commonsdk.statistics.UMServerURL.SECONDARY_URL
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            com.umeng.commonsdk.statistics.AnalyticsConstants.APPLOG_URL_LIST = r0
        L82:
            return
    }

    private void c() {
            r3 = this;
            boolean r0 = com.umeng.commonsdk.statistics.internal.c.g
            if (r0 != 0) goto L17
            android.content.Context r0 = r3.c
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler r0 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.getImprintService(r0)
            com.umeng.commonsdk.statistics.internal.c$1 r1 = new com.umeng.commonsdk.statistics.internal.c$1
            r1.<init>(r3)
            java.lang.String r2 = "cfgfd"
            r0.registImprintCallback(r2, r1)
            r0 = 1
            com.umeng.commonsdk.statistics.internal.c.g = r0
        L17:
            return
    }

    private void d() {
            r3 = this;
            boolean r0 = com.umeng.commonsdk.statistics.internal.c.f
            if (r0 != 0) goto L2e
            java.lang.String r0 = "MobclickRT"
            java.lang.String r1 = "--->>> 注册零号报文 imprint 应答处理回调。"
            com.umeng.commonsdk.debug.UMRTLog.e(r0, r1)
            android.content.Context r0 = r3.c
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler r0 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.getImprintService(r0)
            com.umeng.commonsdk.statistics.internal.c$2 r1 = new com.umeng.commonsdk.statistics.internal.c$2
            r1.<init>(r3)
            java.lang.String r2 = "iscfg"
            r0.registPreProcessCallback(r2, r1)
            android.content.Context r0 = r3.c
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler r0 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.getImprintService(r0)
            com.umeng.commonsdk.statistics.internal.c$3 r1 = new com.umeng.commonsdk.statistics.internal.c$3
            r1.<init>(r3)
            java.lang.String r2 = "cfgfd"
            r0.registImprintCallback(r2, r1)
            r0 = 1
            com.umeng.commonsdk.statistics.internal.c.f = r0
        L2e:
            return
    }

    public void a(com.umeng.commonsdk.statistics.internal.b r1) {
            r0 = this;
            r0.d = r1
            return
    }

    public byte[] a(byte[] r9, java.lang.String r10) {
            r8 = this;
            java.lang.String r0 = "\\|"
            java.lang.String r1 = "Content-Type"
            r2 = 2
            r3 = 0
            com.umeng.commonsdk.statistics.internal.b r4 = r8.d     // Catch: java.lang.Throwable -> Le java.net.UnknownHostException -> L13 javax.net.ssl.SSLHandshakeException -> L17
            if (r4 == 0) goto L1b
            r4.onRequestStart()     // Catch: java.lang.Throwable -> Le java.net.UnknownHostException -> L13 javax.net.ssl.SSLHandshakeException -> L17
            goto L1b
        Le:
            r10 = r3
            r6 = r10
            goto L121
        L13:
            r10 = r3
            r6 = r10
            goto L13a
        L17:
            r10 = r3
            r6 = r10
            goto L15a
        L1b:
            java.net.URL r4 = new java.net.URL     // Catch: java.lang.Throwable -> Le java.net.UnknownHostException -> L13 javax.net.ssl.SSLHandshakeException -> L17
            r4.<init>(r10)     // Catch: java.lang.Throwable -> Le java.net.UnknownHostException -> L13 javax.net.ssl.SSLHandshakeException -> L17
            java.net.URLConnection r10 = r4.openConnection()     // Catch: java.lang.Throwable -> Le java.net.UnknownHostException -> L13 javax.net.ssl.SSLHandshakeException -> L17
            javax.net.ssl.HttpsURLConnection r10 = (javax.net.ssl.HttpsURLConnection) r10     // Catch: java.lang.Throwable -> Le java.net.UnknownHostException -> L13 javax.net.ssl.SSLHandshakeException -> L17
            boolean r4 = com.umeng.commonsdk.statistics.internal.c.e     // Catch: java.lang.Throwable -> L48 java.net.UnknownHostException -> L4c javax.net.ssl.SSLHandshakeException -> L4f
            r5 = 1
            if (r4 != 0) goto L52
            org.apache.http.conn.ssl.X509HostnameVerifier r4 = org.apache.http.conn.ssl.SSLSocketFactory.STRICT_HOSTNAME_VERIFIER     // Catch: java.lang.Throwable -> L48 java.net.UnknownHostException -> L4c javax.net.ssl.SSLHandshakeException -> L4f
            r10.setHostnameVerifier(r4)     // Catch: java.lang.Throwable -> L48 java.net.UnknownHostException -> L4c javax.net.ssl.SSLHandshakeException -> L4f
            java.lang.String r4 = "TLS"
            javax.net.ssl.SSLContext r4 = javax.net.ssl.SSLContext.getInstance(r4)     // Catch: java.lang.Throwable -> L48 java.net.UnknownHostException -> L4c javax.net.ssl.SSLHandshakeException -> L4f
            java.security.SecureRandom r6 = new java.security.SecureRandom     // Catch: java.lang.Throwable -> L48 java.net.UnknownHostException -> L4c javax.net.ssl.SSLHandshakeException -> L4f
            r6.<init>()     // Catch: java.lang.Throwable -> L48 java.net.UnknownHostException -> L4c javax.net.ssl.SSLHandshakeException -> L4f
            r4.init(r3, r3, r6)     // Catch: java.lang.Throwable -> L48 java.net.UnknownHostException -> L4c javax.net.ssl.SSLHandshakeException -> L4f
            javax.net.ssl.SSLSocketFactory r4 = r4.getSocketFactory()     // Catch: java.lang.Throwable -> L48 java.net.UnknownHostException -> L4c javax.net.ssl.SSLHandshakeException -> L4f
            r10.setSSLSocketFactory(r4)     // Catch: java.lang.Throwable -> L48 java.net.UnknownHostException -> L4c javax.net.ssl.SSLHandshakeException -> L4f
            com.umeng.commonsdk.statistics.internal.c.e = r5     // Catch: java.lang.Throwable -> L48 java.net.UnknownHostException -> L4c javax.net.ssl.SSLHandshakeException -> L4f
            goto L52
        L48:
            r6 = r3
            goto L121
        L4c:
            r6 = r3
            goto L13a
        L4f:
            r6 = r3
            goto L15a
        L52:
            java.lang.String r4 = "X-Umeng-UTC"
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L48 java.net.UnknownHostException -> L4c javax.net.ssl.SSLHandshakeException -> L4f
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L48 java.net.UnknownHostException -> L4c javax.net.ssl.SSLHandshakeException -> L4f
            r10.setRequestProperty(r4, r6)     // Catch: java.lang.Throwable -> L48 java.net.UnknownHostException -> L4c javax.net.ssl.SSLHandshakeException -> L4f
            java.lang.String r4 = "X-Umeng-Sdk"
            android.content.Context r6 = r8.c     // Catch: java.lang.Throwable -> L48 java.net.UnknownHostException -> L4c javax.net.ssl.SSLHandshakeException -> L4f
            com.umeng.commonsdk.statistics.internal.a r6 = com.umeng.commonsdk.statistics.internal.a.a(r6)     // Catch: java.lang.Throwable -> L48 java.net.UnknownHostException -> L4c javax.net.ssl.SSLHandshakeException -> L4f
            java.lang.String r6 = r6.b()     // Catch: java.lang.Throwable -> L48 java.net.UnknownHostException -> L4c javax.net.ssl.SSLHandshakeException -> L4f
            r10.setRequestProperty(r4, r6)     // Catch: java.lang.Throwable -> L48 java.net.UnknownHostException -> L4c javax.net.ssl.SSLHandshakeException -> L4f
            android.content.Context r4 = r8.c     // Catch: java.lang.Throwable -> L48 java.net.UnknownHostException -> L4c javax.net.ssl.SSLHandshakeException -> L4f
            com.umeng.commonsdk.statistics.internal.a r4 = com.umeng.commonsdk.statistics.internal.a.a(r4)     // Catch: java.lang.Throwable -> L48 java.net.UnknownHostException -> L4c javax.net.ssl.SSLHandshakeException -> L4f
            java.lang.String r4 = r4.a()     // Catch: java.lang.Throwable -> L48 java.net.UnknownHostException -> L4c javax.net.ssl.SSLHandshakeException -> L4f
            r10.setRequestProperty(r1, r4)     // Catch: java.lang.Throwable -> L48 java.net.UnknownHostException -> L4c javax.net.ssl.SSLHandshakeException -> L4f
            java.lang.String r4 = "Msg-Type"
            java.lang.String r6 = "envelope/json"
            r10.setRequestProperty(r4, r6)     // Catch: java.lang.Throwable -> L48 java.net.UnknownHostException -> L4c javax.net.ssl.SSLHandshakeException -> L4f
            java.lang.String r4 = "X-Umeng-Pro-Ver"
            java.lang.String r6 = "1.0.0"
            r10.setRequestProperty(r4, r6)     // Catch: java.lang.Throwable -> L48 java.net.UnknownHostException -> L4c javax.net.ssl.SSLHandshakeException -> L4f
            java.lang.String r4 = "SM-IMP"
            java.lang.String r6 = "1"
            r10.setRequestProperty(r4, r6)     // Catch: java.lang.Throwable -> L48 java.net.UnknownHostException -> L4c javax.net.ssl.SSLHandshakeException -> L4f
            java.lang.String r4 = "User-Agent"
            java.lang.String r6 = com.umeng.commonsdk.statistics.common.DeviceConfig.getCustomAgt()     // Catch: java.lang.Throwable -> L48 java.net.UnknownHostException -> L4c javax.net.ssl.SSLHandshakeException -> L4f
            r10.setRequestProperty(r4, r6)     // Catch: java.lang.Throwable -> L48 java.net.UnknownHostException -> L4c javax.net.ssl.SSLHandshakeException -> L4f
            r4 = 30000(0x7530, float:4.2039E-41)
            r10.setConnectTimeout(r4)     // Catch: java.lang.Throwable -> L48 java.net.UnknownHostException -> L4c javax.net.ssl.SSLHandshakeException -> L4f
            r10.setReadTimeout(r4)     // Catch: java.lang.Throwable -> L48 java.net.UnknownHostException -> L4c javax.net.ssl.SSLHandshakeException -> L4f
            java.lang.String r4 = "POST"
            r10.setRequestMethod(r4)     // Catch: java.lang.Throwable -> L48 java.net.UnknownHostException -> L4c javax.net.ssl.SSLHandshakeException -> L4f
            r10.setDoOutput(r5)     // Catch: java.lang.Throwable -> L48 java.net.UnknownHostException -> L4c javax.net.ssl.SSLHandshakeException -> L4f
            r10.setDoInput(r5)     // Catch: java.lang.Throwable -> L48 java.net.UnknownHostException -> L4c javax.net.ssl.SSLHandshakeException -> L4f
            r4 = 0
            r10.setUseCaches(r4)     // Catch: java.lang.Throwable -> L48 java.net.UnknownHostException -> L4c javax.net.ssl.SSLHandshakeException -> L4f
            java.io.OutputStream r6 = r10.getOutputStream()     // Catch: java.lang.Throwable -> L48 java.net.UnknownHostException -> L4c javax.net.ssl.SSLHandshakeException -> L4f
            r6.write(r9)     // Catch: java.lang.Throwable -> Lc5 java.net.UnknownHostException -> L13a javax.net.ssl.SSLHandshakeException -> L15a
            r6.flush()     // Catch: java.lang.Throwable -> Lc5 java.net.UnknownHostException -> L13a javax.net.ssl.SSLHandshakeException -> L15a
            r10.connect()     // Catch: java.lang.Throwable -> Lc5 java.net.UnknownHostException -> L13a javax.net.ssl.SSLHandshakeException -> L15a
            com.umeng.commonsdk.statistics.internal.b r9 = r8.d     // Catch: java.lang.Throwable -> Lc5 java.net.UnknownHostException -> L13a javax.net.ssl.SSLHandshakeException -> L15a
            if (r9 == 0) goto Lc7
            r9.onRequestEnd()     // Catch: java.lang.Throwable -> Lc5 java.net.UnknownHostException -> L13a javax.net.ssl.SSLHandshakeException -> L15a
            goto Lc7
        Lc5:
            goto L121
        Lc7:
            int r9 = r10.getResponseCode()     // Catch: java.lang.Throwable -> Lc5 java.net.UnknownHostException -> L13a javax.net.ssl.SSLHandshakeException -> L15a
            java.lang.String r1 = r10.getHeaderField(r1)     // Catch: java.lang.Throwable -> Lc5 java.net.UnknownHostException -> L13a javax.net.ssl.SSLHandshakeException -> L15a
            boolean r7 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Lc5 java.net.UnknownHostException -> L13a javax.net.ssl.SSLHandshakeException -> L15a
            if (r7 != 0) goto Lde
            java.lang.String r7 = "application/thrift"
            boolean r1 = r1.equalsIgnoreCase(r7)     // Catch: java.lang.Throwable -> Lc5 java.net.UnknownHostException -> L13a javax.net.ssl.SSLHandshakeException -> L15a
            if (r1 == 0) goto Lde
            goto Ldf
        Lde:
            r5 = 0
        Ldf:
            boolean r1 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG     // Catch: java.lang.Throwable -> Lc5 java.net.UnknownHostException -> L13a javax.net.ssl.SSLHandshakeException -> L15a
            r1 = 200(0xc8, float:2.8E-43)
            if (r9 != r1) goto L10c
            if (r5 == 0) goto L10c
            java.io.InputStream r9 = r10.getInputStream()     // Catch: java.lang.Throwable -> Lc5 java.net.UnknownHostException -> L13a javax.net.ssl.SSLHandshakeException -> L15a
            byte[] r1 = com.umeng.commonsdk.statistics.common.HelperUtils.readStreamToByteArray(r9)     // Catch: java.lang.Throwable -> L107
            com.umeng.commonsdk.statistics.common.HelperUtils.safeClose(r9)     // Catch: java.lang.Throwable -> Lc5 java.net.UnknownHostException -> L13a javax.net.ssl.SSLHandshakeException -> L15a
            r6.close()     // Catch: java.lang.Exception -> Lf6
            goto Lfc
        Lf6:
            r9 = move-exception
            android.content.Context r0 = r8.c
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r0, r9)
        Lfc:
            java.io.InputStream r9 = r10.getInputStream()     // Catch: java.io.IOException -> L103
            r9.close()     // Catch: java.io.IOException -> L103
        L103:
            r10.disconnect()
            return r1
        L107:
            r1 = move-exception
            com.umeng.commonsdk.statistics.common.HelperUtils.safeClose(r9)     // Catch: java.lang.Throwable -> Lc5 java.net.UnknownHostException -> L13a javax.net.ssl.SSLHandshakeException -> L15a
            throw r1     // Catch: java.lang.Throwable -> Lc5 java.net.UnknownHostException -> L13a javax.net.ssl.SSLHandshakeException -> L15a
        L10c:
            r6.close()     // Catch: java.lang.Exception -> L110
            goto L116
        L110:
            r9 = move-exception
            android.content.Context r0 = r8.c
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r0, r9)
        L116:
            java.io.InputStream r9 = r10.getInputStream()     // Catch: java.io.IOException -> L11d
            r9.close()     // Catch: java.io.IOException -> L11d
        L11d:
            r10.disconnect()
            return r3
        L121:
            if (r6 == 0) goto L12d
            r6.close()     // Catch: java.lang.Exception -> L127
            goto L12d
        L127:
            r9 = move-exception
            android.content.Context r0 = r8.c
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r0, r9)
        L12d:
            if (r10 == 0) goto L139
            java.io.InputStream r9 = r10.getInputStream()     // Catch: java.io.IOException -> L136
            r9.close()     // Catch: java.io.IOException -> L136
        L136:
            r10.disconnect()
        L139:
            return r3
        L13a:
            java.lang.String r9 = "A_10200"
            com.umeng.commonsdk.debug.UMLog.aq(r9, r2, r0)     // Catch: java.lang.Throwable -> L158
            if (r6 == 0) goto L14b
            r6.close()     // Catch: java.lang.Exception -> L145
            goto L14b
        L145:
            r9 = move-exception
            android.content.Context r0 = r8.c
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r0, r9)
        L14b:
            if (r10 == 0) goto L157
            java.io.InputStream r9 = r10.getInputStream()     // Catch: java.io.IOException -> L154
            r9.close()     // Catch: java.io.IOException -> L154
        L154:
            r10.disconnect()
        L157:
            return r3
        L158:
            r9 = move-exception
            goto L178
        L15a:
            java.lang.String r9 = "A_10201"
            com.umeng.commonsdk.debug.UMLog.aq(r9, r2, r0)     // Catch: java.lang.Throwable -> L158
            if (r6 == 0) goto L16b
            r6.close()     // Catch: java.lang.Exception -> L165
            goto L16b
        L165:
            r9 = move-exception
            android.content.Context r0 = r8.c
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r0, r9)
        L16b:
            if (r10 == 0) goto L177
            java.io.InputStream r9 = r10.getInputStream()     // Catch: java.io.IOException -> L174
            r9.close()     // Catch: java.io.IOException -> L174
        L174:
            r10.disconnect()
        L177:
            return r3
        L178:
            if (r6 == 0) goto L184
            r6.close()     // Catch: java.lang.Exception -> L17e
            goto L184
        L17e:
            r0 = move-exception
            android.content.Context r1 = r8.c
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r1, r0)
        L184:
            if (r10 == 0) goto L190
            java.io.InputStream r0 = r10.getInputStream()     // Catch: java.io.IOException -> L18d
            r0.close()     // Catch: java.io.IOException -> L18d
        L18d:
            r10.disconnect()
        L190:
            throw r9
    }

    public byte[] a(byte[] r5, boolean r6, boolean r7, java.lang.String r8) {
            r4 = this;
            int r0 = com.umeng.commonsdk.statistics.SdkVersion.SDK_TYPE
            if (r0 != 0) goto L8
            r4.a()
            goto L13
        L8:
            java.lang.String r0 = com.umeng.commonsdk.statistics.UMServerURL.OVERSEA_DEFAULT_URL
            com.umeng.commonsdk.statistics.UMServerURL.DEFAULT_URL = r0
            java.lang.String r0 = com.umeng.commonsdk.statistics.UMServerURL.OVERSEA_SECONDARY_URL
            com.umeng.commonsdk.statistics.UMServerURL.SECONDARY_URL = r0
            r4.b()
        L13:
            r0 = 0
            r1 = 0
        L15:
            java.lang.String[] r2 = com.umeng.commonsdk.statistics.AnalyticsConstants.APPLOG_URL_LIST
            int r3 = r2.length
            if (r1 >= r3) goto L51
            r0 = r2[r1]
            if (r7 == 0) goto L22
            r4.d()
            goto L25
        L22:
            r4.c()
        L25:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = java.io.File.separator
            r2.append(r0)
            r2.append(r8)
            java.lang.String r0 = r2.toString()
            byte[] r0 = r4.a(r5, r0)
            if (r0 == 0) goto L47
            com.umeng.commonsdk.statistics.internal.b r5 = r4.d
            if (r5 == 0) goto L46
            r5.onRequestSucceed(r6)
        L46:
            return r0
        L47:
            com.umeng.commonsdk.statistics.internal.b r2 = r4.d
            if (r2 == 0) goto L4e
            r2.onRequestFailed()
        L4e:
            int r1 = r1 + 1
            goto L15
        L51:
            return r0
    }
}
