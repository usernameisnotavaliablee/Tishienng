package xyz.adscope.common.network.urlconnect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class URLConnectionFactory implements xyz.adscope.common.network.connect.ConnectFactory {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: xyz.adscope.common.network.urlconnect.URLConnectionFactory$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Builder {
        private Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ Builder(xyz.adscope.common.network.urlconnect.URLConnectionFactory.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public xyz.adscope.common.network.urlconnect.URLConnectionFactory build() {
                r2 = this;
                xyz.adscope.common.network.urlconnect.URLConnectionFactory r0 = new xyz.adscope.common.network.urlconnect.URLConnectionFactory
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }
    }

    private URLConnectionFactory(xyz.adscope.common.network.urlconnect.URLConnectionFactory.Builder r1) {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ URLConnectionFactory(xyz.adscope.common.network.urlconnect.URLConnectionFactory.Builder r1, xyz.adscope.common.network.urlconnect.URLConnectionFactory.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private boolean a(xyz.adscope.common.network.RequestMethod r1) {
            r0 = this;
            boolean r1 = r1.allowBody()
            return r1
    }

    public static xyz.adscope.common.network.urlconnect.URLConnectionFactory.Builder newBuilder() {
            xyz.adscope.common.network.urlconnect.URLConnectionFactory$Builder r0 = new xyz.adscope.common.network.urlconnect.URLConnectionFactory$Builder
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    @Override // xyz.adscope.common.network.connect.ConnectFactory
    public xyz.adscope.common.network.connect.Connection connect(xyz.adscope.common.network.Request r8) {
            r7 = this;
            java.net.URL r0 = new java.net.URL
            xyz.adscope.common.network.Url r1 = r8.url()
            r2 = 1
            java.lang.String r1 = r1.toString(r2)
            r0.<init>(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "URLConnectionFactory connect url : "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "common_log"
            xyz.adscope.common.tool.LogUtil.i(r3, r1)
            java.net.Proxy r1 = r8.proxy()
            if (r1 != 0) goto L31
            java.net.URLConnection r0 = r0.openConnection()
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0
            goto L37
        L31:
            java.net.URLConnection r0 = r0.openConnection(r1)
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0
        L37:
            int r1 = r8.connectTimeout()
            r0.setConnectTimeout(r1)
            int r1 = r8.readTimeout()
            r0.setReadTimeout(r1)
            r1 = 0
            r0.setInstanceFollowRedirects(r1)
            boolean r3 = r0 instanceof javax.net.ssl.HttpsURLConnection
            if (r3 == 0) goto L65
            javax.net.ssl.SSLSocketFactory r3 = r8.sslSocketFactory()
            if (r3 == 0) goto L59
            r4 = r0
            javax.net.ssl.HttpsURLConnection r4 = (javax.net.ssl.HttpsURLConnection) r4
            r4.setSSLSocketFactory(r3)
        L59:
            javax.net.ssl.HostnameVerifier r3 = r8.hostnameVerifier()
            if (r3 == 0) goto L65
            r4 = r0
            javax.net.ssl.HttpsURLConnection r4 = (javax.net.ssl.HttpsURLConnection) r4
            r4.setHostnameVerifier(r3)
        L65:
            xyz.adscope.common.network.RequestMethod r3 = r8.method()
            java.lang.String r4 = r3.toString()
            r0.setRequestMethod(r4)
            r0.setDoInput(r2)
            boolean r2 = r7.a(r3)
            r0.setDoOutput(r2)
            xyz.adscope.common.network.Headers r8 = r8.headers()
            if (r2 == 0) goto L93
            long r2 = r8.getContentLength()
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L90
            int r3 = (int) r2
            r0.setFixedLengthStreamingMode(r3)
            goto L93
        L90:
            r0.setFixedLengthStreamingMode(r2)
        L93:
            java.lang.String r2 = "Connection"
            java.util.List r3 = r8.get2(r2)
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r8.set2(r2, r1)
            java.util.Map r8 = xyz.adscope.common.network.Headers.getRequestHeaders(r8)
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
        Lae:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto Lca
            java.lang.Object r1 = r8.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r0.setRequestProperty(r2, r1)
            goto Lae
        Lca:
            r0.connect()
            xyz.adscope.common.network.urlconnect.URLConnection r8 = new xyz.adscope.common.network.urlconnect.URLConnection
            r8.<init>(r0)
            return r8
    }
}
