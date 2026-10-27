package com.umeng.commonsdk.stateless;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class c {
    private java.lang.String a;
    private int b;
    private android.content.Context c;

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

    private void a() {
            r3 = this;
            android.content.Context r0 = r3.c
            java.lang.String r1 = "sl_domain_p"
            java.lang.String r2 = ""
            java.lang.String r0 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r0, r1, r2)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L16
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DataHelper.assembleStatelessURL(r0)
            com.umeng.commonsdk.stateless.a.i = r0
        L16:
            return
    }

    private void b() {
            r4 = this;
            android.content.Context r0 = r4.c
            java.lang.String r1 = "sl_domain_p"
            java.lang.String r2 = ""
            java.lang.String r0 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r0, r1, r2)
            android.content.Context r1 = r4.c
            java.lang.String r3 = "oversea_sl_domain_p"
            java.lang.String r1 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r1, r3, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L1e
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DataHelper.assembleStatelessURL(r0)
            com.umeng.commonsdk.stateless.a.h = r0
        L1e:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L2a
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DataHelper.assembleStatelessURL(r1)
            com.umeng.commonsdk.stateless.a.k = r0
        L2a:
            java.lang.String r0 = com.umeng.commonsdk.stateless.a.k
            com.umeng.commonsdk.stateless.a.i = r0
            java.lang.String r0 = com.umeng.commonsdk.statistics.b.b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L4e
            java.lang.String r0 = com.umeng.commonsdk.statistics.b.b
            java.lang.String r1 = "460"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L4a
            java.lang.String r0 = com.umeng.commonsdk.statistics.b.b
            java.lang.String r1 = "461"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L4e
        L4a:
            java.lang.String r0 = com.umeng.commonsdk.stateless.a.h
            com.umeng.commonsdk.stateless.a.i = r0
        L4e:
            return
    }

    public boolean a(byte[] r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
            r8 = this;
            java.lang.String r0 = "--->>> stateless: disconnect connection."
            r1 = 1
            r2 = 0
            if (r9 == 0) goto L146
            if (r10 != 0) goto La
            goto L146
        La:
            int r3 = com.umeng.commonsdk.statistics.SdkVersion.SDK_TYPE
            if (r3 != 0) goto L12
            r8.a()
            goto L19
        L12:
            java.lang.String r3 = com.umeng.commonsdk.stateless.a.k
            com.umeng.commonsdk.stateless.a.h = r3
            r8.b()
        L19:
            java.lang.String r3 = com.umeng.commonsdk.stateless.a.i
            java.lang.String r4 = com.umeng.commonsdk.vchannel.a.c
            boolean r4 = r4.equalsIgnoreCase(r10)
            if (r4 == 0) goto L24
            goto L25
        L24:
            r11 = r3
        L25:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "--->>> 无状态收数域名："
            r3.append(r4)
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "MobclickRT"
            com.umeng.commonsdk.debug.UMRTLog.e(r4, r3)
            r3 = 0
            java.net.URL r5 = new java.net.URL     // Catch: java.lang.Throwable -> L109 javax.net.ssl.SSLHandshakeException -> L10c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L109 javax.net.ssl.SSLHandshakeException -> L10c
            r6.<init>()     // Catch: java.lang.Throwable -> L109 javax.net.ssl.SSLHandshakeException -> L10c
            r6.append(r11)     // Catch: java.lang.Throwable -> L109 javax.net.ssl.SSLHandshakeException -> L10c
            java.lang.String r11 = java.io.File.separator     // Catch: java.lang.Throwable -> L109 javax.net.ssl.SSLHandshakeException -> L10c
            r6.append(r11)     // Catch: java.lang.Throwable -> L109 javax.net.ssl.SSLHandshakeException -> L10c
            r6.append(r10)     // Catch: java.lang.Throwable -> L109 javax.net.ssl.SSLHandshakeException -> L10c
            java.lang.String r11 = r6.toString()     // Catch: java.lang.Throwable -> L109 javax.net.ssl.SSLHandshakeException -> L10c
            r5.<init>(r11)     // Catch: java.lang.Throwable -> L109 javax.net.ssl.SSLHandshakeException -> L10c
            java.net.URLConnection r11 = r5.openConnection()     // Catch: java.lang.Throwable -> L109 javax.net.ssl.SSLHandshakeException -> L10c
            javax.net.ssl.HttpsURLConnection r11 = (javax.net.ssl.HttpsURLConnection) r11     // Catch: java.lang.Throwable -> L109 javax.net.ssl.SSLHandshakeException -> L10c
            org.apache.http.conn.ssl.X509HostnameVerifier r5 = org.apache.http.conn.ssl.SSLSocketFactory.STRICT_HOSTNAME_VERIFIER     // Catch: java.lang.Throwable -> Lf9 javax.net.ssl.SSLHandshakeException -> Lfb
            r11.setHostnameVerifier(r5)     // Catch: java.lang.Throwable -> Lf9 javax.net.ssl.SSLHandshakeException -> Lfb
            java.lang.String r5 = "TLS"
            javax.net.ssl.SSLContext r5 = javax.net.ssl.SSLContext.getInstance(r5)     // Catch: java.lang.Throwable -> Lf9 javax.net.ssl.SSLHandshakeException -> Lfb
            java.security.SecureRandom r6 = new java.security.SecureRandom     // Catch: java.lang.Throwable -> Lf9 javax.net.ssl.SSLHandshakeException -> Lfb
            r6.<init>()     // Catch: java.lang.Throwable -> Lf9 javax.net.ssl.SSLHandshakeException -> Lfb
            r5.init(r3, r3, r6)     // Catch: java.lang.Throwable -> Lf9 javax.net.ssl.SSLHandshakeException -> Lfb
            javax.net.ssl.SSLSocketFactory r5 = r5.getSocketFactory()     // Catch: java.lang.Throwable -> Lf9 javax.net.ssl.SSLHandshakeException -> Lfb
            r11.setSSLSocketFactory(r5)     // Catch: java.lang.Throwable -> Lf9 javax.net.ssl.SSLHandshakeException -> Lfb
            java.lang.String r5 = "X-Umeng-UTC"
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lf9 javax.net.ssl.SSLHandshakeException -> Lfb
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> Lf9 javax.net.ssl.SSLHandshakeException -> Lfb
            r11.setRequestProperty(r5, r6)     // Catch: java.lang.Throwable -> Lf9 javax.net.ssl.SSLHandshakeException -> Lfb
            java.lang.String r5 = "Msg-Type"
            java.lang.String r6 = "envelope/json"
            r11.setRequestProperty(r5, r6)     // Catch: java.lang.Throwable -> Lf9 javax.net.ssl.SSLHandshakeException -> Lfb
            java.lang.String r5 = "Content-Type"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf9 javax.net.ssl.SSLHandshakeException -> Lfb
            r6.<init>()     // Catch: java.lang.Throwable -> Lf9 javax.net.ssl.SSLHandshakeException -> Lfb
            java.lang.String r7 = "ut/"
            r6.append(r7)     // Catch: java.lang.Throwable -> Lf9 javax.net.ssl.SSLHandshakeException -> Lfb
            r6.append(r12)     // Catch: java.lang.Throwable -> Lf9 javax.net.ssl.SSLHandshakeException -> Lfb
            java.lang.String r12 = r6.toString()     // Catch: java.lang.Throwable -> Lf9 javax.net.ssl.SSLHandshakeException -> Lfb
            r11.setRequestProperty(r5, r12)     // Catch: java.lang.Throwable -> Lf9 javax.net.ssl.SSLHandshakeException -> Lfb
            java.lang.String r12 = "SM-IMP"
            java.lang.String r5 = "1"
            r11.setRequestProperty(r12, r5)     // Catch: java.lang.Throwable -> Lf9 javax.net.ssl.SSLHandshakeException -> Lfb
            java.lang.String r12 = "User-Agent"
            java.lang.String r5 = com.umeng.commonsdk.statistics.common.DeviceConfig.getCustomAgt()     // Catch: java.lang.Throwable -> Lf9 javax.net.ssl.SSLHandshakeException -> Lfb
            r11.setRequestProperty(r12, r5)     // Catch: java.lang.Throwable -> Lf9 javax.net.ssl.SSLHandshakeException -> Lfb
            r12 = 30000(0x7530, float:4.2039E-41)
            r11.setConnectTimeout(r12)     // Catch: java.lang.Throwable -> Lf9 javax.net.ssl.SSLHandshakeException -> Lfb
            r11.setReadTimeout(r12)     // Catch: java.lang.Throwable -> Lf9 javax.net.ssl.SSLHandshakeException -> Lfb
            java.lang.String r12 = "POST"
            r11.setRequestMethod(r12)     // Catch: java.lang.Throwable -> Lf9 javax.net.ssl.SSLHandshakeException -> Lfb
            r11.setDoOutput(r1)     // Catch: java.lang.Throwable -> Lf9 javax.net.ssl.SSLHandshakeException -> Lfb
            r11.setDoInput(r1)     // Catch: java.lang.Throwable -> Lf9 javax.net.ssl.SSLHandshakeException -> Lfb
            r11.setUseCaches(r2)     // Catch: java.lang.Throwable -> Lf9 javax.net.ssl.SSLHandshakeException -> Lfb
            java.io.OutputStream r3 = r11.getOutputStream()     // Catch: java.lang.Throwable -> Lf9 javax.net.ssl.SSLHandshakeException -> Lfb
            r3.write(r9)     // Catch: java.lang.Throwable -> Lf9 javax.net.ssl.SSLHandshakeException -> Lfb
            r3.flush()     // Catch: java.lang.Throwable -> Lf9 javax.net.ssl.SSLHandshakeException -> Lfb
            r11.connect()     // Catch: java.lang.Throwable -> Lf9 javax.net.ssl.SSLHandshakeException -> Lfb
            int r9 = r11.getResponseCode()     // Catch: java.lang.Throwable -> Lf9 javax.net.ssl.SSLHandshakeException -> Lfb
            r12 = 200(0xc8, float:2.8E-43)
            if (r9 != r12) goto Lfd
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf9 javax.net.ssl.SSLHandshakeException -> Lfb
            r9.<init>()     // Catch: java.lang.Throwable -> Lf9 javax.net.ssl.SSLHandshakeException -> Lfb
            java.lang.String r12 = "--->>> send stateless message success : "
            r9.append(r12)     // Catch: java.lang.Throwable -> Lf9 javax.net.ssl.SSLHandshakeException -> Lfb
            java.lang.String r12 = com.umeng.commonsdk.stateless.a.i     // Catch: java.lang.Throwable -> Lf9 javax.net.ssl.SSLHandshakeException -> Lfb
            r9.append(r12)     // Catch: java.lang.Throwable -> Lf9 javax.net.ssl.SSLHandshakeException -> Lfb
            java.lang.String r12 = "/"
            r9.append(r12)     // Catch: java.lang.Throwable -> Lf9 javax.net.ssl.SSLHandshakeException -> Lfb
            r9.append(r10)     // Catch: java.lang.Throwable -> Lf9 javax.net.ssl.SSLHandshakeException -> Lfb
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> Lf9 javax.net.ssl.SSLHandshakeException -> Lfb
            com.umeng.commonsdk.debug.UMRTLog.i(r4, r9)     // Catch: java.lang.Throwable -> Lf9 javax.net.ssl.SSLHandshakeException -> Lfb
            goto Lfe
        Lf9:
            r9 = move-exception
            goto L10f
        Lfb:
            r9 = move-exception
            goto L126
        Lfd:
            r1 = 0
        Lfe:
            r3.close()     // Catch: java.lang.Exception -> L101
        L101:
            com.umeng.commonsdk.debug.UMRTLog.e(r4, r0)     // Catch: java.lang.Throwable -> L107
            r11.disconnect()     // Catch: java.lang.Throwable -> L107
        L107:
            r2 = r1
            goto L135
        L109:
            r9 = move-exception
            r11 = r3
            goto L10f
        L10c:
            r9 = move-exception
            r11 = r3
            goto L126
        L10f:
            java.lang.String r10 = "Exception,Failed to send message."
            com.umeng.commonsdk.statistics.common.MLog.e(r10, r9)     // Catch: java.lang.Throwable -> L124
            if (r3 == 0) goto L11b
            r3.close()     // Catch: java.lang.Exception -> L11a
            goto L11b
        L11a:
        L11b:
            if (r11 == 0) goto L135
        L11d:
            com.umeng.commonsdk.debug.UMRTLog.e(r4, r0)     // Catch: java.lang.Throwable -> L135
            r11.disconnect()     // Catch: java.lang.Throwable -> L135
            goto L135
        L124:
            r9 = move-exception
            goto L136
        L126:
            java.lang.String r10 = "SSLHandshakeException, Failed to send message."
            com.umeng.commonsdk.statistics.common.MLog.e(r10, r9)     // Catch: java.lang.Throwable -> L124
            if (r3 == 0) goto L132
            r3.close()     // Catch: java.lang.Exception -> L131
            goto L132
        L131:
        L132:
            if (r11 == 0) goto L135
            goto L11d
        L135:
            return r2
        L136:
            if (r3 == 0) goto L13d
            r3.close()     // Catch: java.lang.Exception -> L13c
            goto L13d
        L13c:
        L13d:
            if (r11 == 0) goto L145
            com.umeng.commonsdk.debug.UMRTLog.e(r4, r0)     // Catch: java.lang.Throwable -> L145
            r11.disconnect()     // Catch: java.lang.Throwable -> L145
        L145:
            throw r9
        L146:
            java.lang.Object[] r9 = new java.lang.Object[r1]
            java.lang.String r10 = "[stateless] sendMessage, envelopeByte == null || path == null "
            r9[r2] = r10
            java.lang.String r10 = "walle"
            com.umeng.commonsdk.statistics.common.ULog.i(r10, r9)
            return r2
    }
}
