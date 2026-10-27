package xyz.adscope.common.v2.conn.http.pool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class ConnectionFactory {
    private static final int REQ_CONNECTED_TIMEOUT = 10000;
    private static final int REQ_READ_TIMEOUT = 10000;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class SSLHolder {
        static final javax.net.ssl.HostnameVerifier HOSTNAME_VERIFIER = null;
        static final javax.net.ssl.SSLSocketFactory SSL_SOCKET_FACTORY = null;

        static {
                xyz.adscope.common.v2.conn.http.pool.CommonTLSFactory r0 = new xyz.adscope.common.v2.conn.http.pool.CommonTLSFactory
                r0.<init>()
                xyz.adscope.common.v2.conn.http.pool.ConnectionFactory.SSLHolder.SSL_SOCKET_FACTORY = r0
                xyz.adscope.common.v2.conn.http.pool.CommonHostVerifier r0 = new xyz.adscope.common.v2.conn.http.pool.CommonHostVerifier
                r0.<init>()
                xyz.adscope.common.v2.conn.http.pool.ConnectionFactory.SSLHolder.HOSTNAME_VERIFIER = r0
                return
        }

        private SSLHolder() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    private ConnectionFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.net.HttpURLConnection createNewConnection(xyz.adscope.common.v2.conn.http.IRequest r3) {
            java.net.URL r0 = new java.net.URL
            java.lang.String r1 = r3.getRequestURL()
            r0.<init>(r1)
            java.net.URLConnection r0 = r0.openConnection()
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0
            boolean r1 = r0 instanceof javax.net.ssl.HttpsURLConnection
            if (r1 == 0) goto L20
            r1 = r0
            javax.net.ssl.HttpsURLConnection r1 = (javax.net.ssl.HttpsURLConnection) r1
            javax.net.ssl.SSLSocketFactory r2 = xyz.adscope.common.v2.conn.http.pool.ConnectionFactory.SSLHolder.SSL_SOCKET_FACTORY
            r1.setSSLSocketFactory(r2)
            javax.net.ssl.HostnameVerifier r2 = xyz.adscope.common.v2.conn.http.pool.ConnectionFactory.SSLHolder.HOSTNAME_VERIFIER
            r1.setHostnameVerifier(r2)
        L20:
            r1 = 10000(0x2710, float:1.4013E-41)
            r0.setConnectTimeout(r1)
            r0.setReadTimeout(r1)
            xyz.adscope.common.v2.conn.http.RequestMethod r1 = r3.getRequestMethod()
            java.lang.String r1 = r1.getMethodName()
            xyz.adscope.common.v2.conn.http.RequestMethod r2 = xyz.adscope.common.v2.conn.http.RequestMethod.DOWNLOAD
            java.lang.String r2 = r2.getMethodName()
            boolean r2 = r1.equalsIgnoreCase(r2)
            if (r2 != 0) goto L48
            xyz.adscope.common.v2.conn.http.RequestMethod r2 = xyz.adscope.common.v2.conn.http.RequestMethod.CACHE_IMAGE
            java.lang.String r2 = r2.getMethodName()
            boolean r2 = r1.equalsIgnoreCase(r2)
            if (r2 == 0) goto L4e
        L48:
            xyz.adscope.common.v2.conn.http.RequestMethod r1 = xyz.adscope.common.v2.conn.http.RequestMethod.GET
            java.lang.String r1 = r1.getMethodName()
        L4e:
            xyz.adscope.common.v2.conn.http.RequestMethod r2 = xyz.adscope.common.v2.conn.http.RequestMethod.STREAM
            java.lang.String r2 = r2.getMethodName()
            boolean r2 = r1.equalsIgnoreCase(r2)
            if (r2 == 0) goto L60
            xyz.adscope.common.v2.conn.http.RequestMethod r1 = xyz.adscope.common.v2.conn.http.RequestMethod.POST
            java.lang.String r1 = r1.getMethodName()
        L60:
            r0.setRequestMethod(r1)
            r1 = 0
            r0.setInstanceFollowRedirects(r1)
            xyz.adscope.common.v2.conn.http.CommonHeader r3 = r3.getHeader()
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L95
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L79:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L95
            java.lang.Object r1 = r3.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r0.addRequestProperty(r2, r1)
            goto L79
        L95:
            return r0
    }
}
