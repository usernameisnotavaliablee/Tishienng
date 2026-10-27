package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class QueryStringEncoder {
    private final java.lang.String charsetName;
    private boolean hasParams;
    private final java.lang.StringBuilder uriBuilder;

    public QueryStringEncoder(java.lang.String r2) {
            r1 = this;
            java.nio.charset.Charset r0 = io.netty.handler.codec.http.HttpConstants.DEFAULT_CHARSET
            r1.<init>(r2, r0)
            return
    }

    public QueryStringEncoder(java.lang.String r2, java.nio.charset.Charset r3) {
            r1 = this;
            r1.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r1.uriBuilder = r0
            java.lang.String r2 = r3.name()
            r1.charsetName = r2
            return
    }

    private static void appendComponent(java.lang.String r4, java.lang.String r5, java.lang.StringBuilder r6) {
            java.lang.String r4 = java.net.URLEncoder.encode(r4, r5)     // Catch: java.io.UnsupportedEncodingException -> L31
            r5 = 43
            int r0 = r4.indexOf(r5)
            r1 = -1
            if (r0 != r1) goto L11
            r6.append(r4)
            return
        L11:
            r1 = 0
            r6.append(r4, r1, r0)
            java.lang.String r1 = "%20"
            r6.append(r1)
            int r2 = r4.length()
        L1e:
            int r0 = r0 + 1
            if (r0 >= r2) goto L30
            char r3 = r4.charAt(r0)
            if (r3 == r5) goto L2c
            r6.append(r3)
            goto L1e
        L2c:
            r6.append(r1)
            goto L1e
        L30:
            return
        L31:
            java.nio.charset.UnsupportedCharsetException r4 = new java.nio.charset.UnsupportedCharsetException
            r4.<init>(r5)
            throw r4
    }

    public void addParam(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            java.lang.String r0 = "name"
            io.netty.util.internal.ObjectUtil.checkNotNull(r3, r0)
            boolean r0 = r2.hasParams
            if (r0 == 0) goto L11
            java.lang.StringBuilder r0 = r2.uriBuilder
            r1 = 38
            r0.append(r1)
            goto L1b
        L11:
            java.lang.StringBuilder r0 = r2.uriBuilder
            r1 = 63
            r0.append(r1)
            r0 = 1
            r2.hasParams = r0
        L1b:
            java.lang.String r0 = r2.charsetName
            java.lang.StringBuilder r1 = r2.uriBuilder
            appendComponent(r3, r0, r1)
            if (r4 == 0) goto L32
            java.lang.StringBuilder r3 = r2.uriBuilder
            r0 = 61
            r3.append(r0)
            java.lang.String r3 = r2.charsetName
            java.lang.StringBuilder r0 = r2.uriBuilder
            appendComponent(r4, r3, r0)
        L32:
            return
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.StringBuilder r0 = r1.uriBuilder
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.net.URI toUri() throws java.net.URISyntaxException {
            r2 = this;
            java.net.URI r0 = new java.net.URI
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            return r0
    }
}
