package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class HttpUtil {
    private static final io.netty.util.AsciiString CHARSET_EQUALS = null;
    private static final io.netty.util.AsciiString SEMICOLON = null;

    static {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderValues.CHARSET
            r0.append(r1)
            java.lang.String r1 = "="
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            io.netty.util.AsciiString r0 = io.netty.util.AsciiString.of(r0)
            io.netty.handler.codec.http.HttpUtil.CHARSET_EQUALS = r0
            java.lang.String r0 = ";"
            io.netty.util.AsciiString r0 = io.netty.util.AsciiString.cached(r0)
            io.netty.handler.codec.http.HttpUtil.SEMICOLON = r0
            return
    }

    private HttpUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String formatHostnameForHttp(java.net.InetSocketAddress r2) {
            java.lang.String r0 = io.netty.util.NetUtil.getHostname(r2)
            boolean r1 = io.netty.util.NetUtil.isValidIpV6Address(r0)
            if (r1 == 0) goto L2f
            boolean r1 = r2.isUnresolved()
            if (r1 != 0) goto L18
            java.net.InetAddress r2 = r2.getAddress()
            java.lang.String r0 = io.netty.util.NetUtil.toAddressString(r2)
        L18:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r1 = 91
            r2.append(r1)
            r2.append(r0)
            r0 = 93
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            return r2
        L2f:
            return r0
    }

    public static java.nio.charset.Charset getCharset(io.netty.handler.codec.http.HttpMessage r1) {
            java.nio.charset.Charset r0 = io.netty.util.CharsetUtil.ISO_8859_1
            java.nio.charset.Charset r1 = getCharset(r1, r0)
            return r1
    }

    public static java.nio.charset.Charset getCharset(io.netty.handler.codec.http.HttpMessage r1, java.nio.charset.Charset r2) {
            io.netty.handler.codec.http.HttpHeaders r1 = r1.headers()
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_TYPE
            java.lang.String r1 = r1.get(r0)
            if (r1 == 0) goto L11
            java.nio.charset.Charset r1 = getCharset(r1, r2)
            return r1
        L11:
            return r2
    }

    public static java.nio.charset.Charset getCharset(java.lang.CharSequence r1) {
            if (r1 == 0) goto L9
            java.nio.charset.Charset r0 = io.netty.util.CharsetUtil.ISO_8859_1
            java.nio.charset.Charset r1 = getCharset(r1, r0)
            return r1
        L9:
            java.nio.charset.Charset r1 = io.netty.util.CharsetUtil.ISO_8859_1
            return r1
    }

    public static java.nio.charset.Charset getCharset(java.lang.CharSequence r0, java.nio.charset.Charset r1) {
            if (r0 == 0) goto L11
            java.lang.CharSequence r0 = getCharsetAsSequence(r0)
            if (r0 == 0) goto L11
            java.lang.String r0 = r0.toString()     // Catch: java.nio.charset.UnsupportedCharsetException -> L11
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)     // Catch: java.nio.charset.UnsupportedCharsetException -> L11
            return r0
        L11:
            return r1
    }

    public static java.lang.CharSequence getCharsetAsSequence(io.netty.handler.codec.http.HttpMessage r1) {
            io.netty.handler.codec.http.HttpHeaders r1 = r1.headers()
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_TYPE
            java.lang.String r1 = r1.get(r0)
            if (r1 == 0) goto L11
            java.lang.CharSequence r1 = getCharsetAsSequence(r1)
            return r1
        L11:
            r1 = 0
            return r1
    }

    public static java.lang.CharSequence getCharsetAsSequence(java.lang.CharSequence r5) {
            if (r5 == 0) goto L30
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpUtil.CHARSET_EQUALS
            r1 = 0
            int r2 = io.netty.util.AsciiString.indexOfIgnoreCaseAscii(r5, r0, r1)
            r3 = 0
            r4 = -1
            if (r2 != r4) goto Le
            return r3
        Le:
            int r0 = r0.length()
            int r2 = r2 + r0
            int r0 = r5.length()
            if (r2 >= r0) goto L2f
            int r0 = r5.length()
            java.lang.CharSequence r5 = r5.subSequence(r2, r0)
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpUtil.SEMICOLON
            int r0 = io.netty.util.AsciiString.indexOfIgnoreCaseAscii(r5, r0, r1)
            if (r0 != r4) goto L2a
            return r5
        L2a:
            java.lang.CharSequence r5 = r5.subSequence(r1, r0)
            return r5
        L2f:
            return r3
        L30:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "contentTypeValue"
            r5.<init>(r0)
            throw r5
    }

    @java.lang.Deprecated
    public static java.lang.CharSequence getCharsetAsString(io.netty.handler.codec.http.HttpMessage r0) {
            java.lang.CharSequence r0 = getCharsetAsSequence(r0)
            return r0
    }

    public static int getContentLength(io.netty.handler.codec.http.HttpMessage r2, int r3) {
            long r0 = (long) r3
            long r2 = getContentLength(r2, r0)
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r2 = java.lang.Math.min(r0, r2)
            int r3 = (int) r2
            return r3
    }

    public static long getContentLength(io.netty.handler.codec.http.HttpMessage r6) {
            io.netty.handler.codec.http.HttpHeaders r0 = r6.headers()
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_LENGTH
            java.lang.String r0 = r0.get(r1)
            if (r0 == 0) goto L11
            long r0 = java.lang.Long.parseLong(r0)
            return r0
        L11:
            int r6 = getWebSocketContentLength(r6)
            long r2 = (long) r6
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L1d
            return r2
        L1d:
            java.lang.NumberFormatException r6 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "header not found: "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
    }

    public static long getContentLength(io.netty.handler.codec.http.HttpMessage r4, long r5) {
            io.netty.handler.codec.http.HttpHeaders r0 = r4.headers()
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_LENGTH
            java.lang.String r0 = r0.get(r1)
            if (r0 == 0) goto L11
            long r4 = java.lang.Long.parseLong(r0)
            return r4
        L11:
            int r4 = getWebSocketContentLength(r4)
            long r0 = (long) r4
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L1d
            return r0
        L1d:
            return r5
    }

    public static java.lang.CharSequence getMimeType(io.netty.handler.codec.http.HttpMessage r1) {
            io.netty.handler.codec.http.HttpHeaders r1 = r1.headers()
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_TYPE
            java.lang.String r1 = r1.get(r0)
            if (r1 == 0) goto L11
            java.lang.CharSequence r1 = getMimeType(r1)
            return r1
        L11:
            r1 = 0
            return r1
    }

    public static java.lang.CharSequence getMimeType(java.lang.CharSequence r3) {
            if (r3 == 0) goto L1a
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpUtil.SEMICOLON
            r1 = 0
            int r0 = io.netty.util.AsciiString.indexOfIgnoreCaseAscii(r3, r0, r1)
            r2 = -1
            if (r0 == r2) goto L11
            java.lang.CharSequence r3 = r3.subSequence(r1, r0)
            return r3
        L11:
            int r0 = r3.length()
            if (r0 <= 0) goto L18
            return r3
        L18:
            r3 = 0
            return r3
        L1a:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "contentTypeValue"
            r3.<init>(r0)
            throw r3
    }

    private static int getWebSocketContentLength(io.netty.handler.codec.http.HttpMessage r2) {
            io.netty.handler.codec.http.HttpHeaders r0 = r2.headers()
            boolean r1 = r2 instanceof io.netty.handler.codec.http.HttpRequest
            if (r1 == 0) goto L29
            io.netty.handler.codec.http.HttpRequest r2 = (io.netty.handler.codec.http.HttpRequest) r2
            io.netty.handler.codec.http.HttpMethod r1 = io.netty.handler.codec.http.HttpMethod.GET
            io.netty.handler.codec.http.HttpMethod r2 = r2.method()
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L4e
            io.netty.util.AsciiString r2 = io.netty.handler.codec.http.HttpHeaderNames.SEC_WEBSOCKET_KEY1
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L4e
            io.netty.util.AsciiString r2 = io.netty.handler.codec.http.HttpHeaderNames.SEC_WEBSOCKET_KEY2
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L4e
            r2 = 8
            return r2
        L29:
            boolean r1 = r2 instanceof io.netty.handler.codec.http.HttpResponse
            if (r1 == 0) goto L4e
            io.netty.handler.codec.http.HttpResponse r2 = (io.netty.handler.codec.http.HttpResponse) r2
            io.netty.handler.codec.http.HttpResponseStatus r2 = r2.status()
            int r2 = r2.code()
            r1 = 101(0x65, float:1.42E-43)
            if (r2 != r1) goto L4e
            io.netty.util.AsciiString r2 = io.netty.handler.codec.http.HttpHeaderNames.SEC_WEBSOCKET_ORIGIN
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L4e
            io.netty.util.AsciiString r2 = io.netty.handler.codec.http.HttpHeaderNames.SEC_WEBSOCKET_LOCATION
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L4e
            r2 = 16
            return r2
        L4e:
            r2 = -1
            return r2
    }

    public static boolean is100ContinueExpected(io.netty.handler.codec.http.HttpMessage r3) {
            boolean r0 = isExpectHeaderValid(r3)
            if (r0 == 0) goto L16
            io.netty.handler.codec.http.HttpHeaders r3 = r3.headers()
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderNames.EXPECT
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderValues.CONTINUE
            r2 = 1
            boolean r3 = r3.contains(r0, r1, r2)
            if (r3 == 0) goto L16
            return r2
        L16:
            r3 = 0
            return r3
    }

    public static boolean isAsteriskForm(java.net.URI r2) {
            java.lang.String r0 = "*"
            java.lang.String r1 = r2.getPath()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L32
            java.lang.String r0 = r2.getScheme()
            if (r0 != 0) goto L32
            java.lang.String r0 = r2.getSchemeSpecificPart()
            if (r0 != 0) goto L32
            java.lang.String r0 = r2.getHost()
            if (r0 != 0) goto L32
            java.lang.String r0 = r2.getAuthority()
            if (r0 != 0) goto L32
            java.lang.String r0 = r2.getQuery()
            if (r0 != 0) goto L32
            java.lang.String r2 = r2.getFragment()
            if (r2 != 0) goto L32
            r2 = 1
            return r2
        L32:
            r2 = 0
            return r2
    }

    public static boolean isContentLengthSet(io.netty.handler.codec.http.HttpMessage r1) {
            io.netty.handler.codec.http.HttpHeaders r1 = r1.headers()
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_LENGTH
            boolean r1 = r1.contains(r0)
            return r1
    }

    private static boolean isExpectHeaderValid(io.netty.handler.codec.http.HttpMessage r1) {
            boolean r0 = r1 instanceof io.netty.handler.codec.http.HttpRequest
            if (r0 == 0) goto L12
            io.netty.handler.codec.http.HttpVersion r1 = r1.protocolVersion()
            io.netty.handler.codec.http.HttpVersion r0 = io.netty.handler.codec.http.HttpVersion.HTTP_1_1
            int r1 = r1.compareTo2(r0)
            if (r1 < 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public static boolean isKeepAlive(io.netty.handler.codec.http.HttpMessage r4) {
            io.netty.handler.codec.http.HttpHeaders r0 = r4.headers()
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.CONNECTION
            io.netty.util.AsciiString r2 = io.netty.handler.codec.http.HttpHeaderValues.CLOSE
            r3 = 1
            boolean r0 = r0.containsValue(r1, r2, r3)
            if (r0 != 0) goto L26
            io.netty.handler.codec.http.HttpVersion r0 = r4.protocolVersion()
            boolean r0 = r0.isKeepAliveDefault()
            if (r0 != 0) goto L25
            io.netty.handler.codec.http.HttpHeaders r4 = r4.headers()
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderValues.KEEP_ALIVE
            boolean r4 = r4.containsValue(r1, r0, r3)
            if (r4 == 0) goto L26
        L25:
            return r3
        L26:
            r4 = 0
            return r4
    }

    public static boolean isOriginForm(java.net.URI r1) {
            java.lang.String r0 = r1.getScheme()
            if (r0 != 0) goto L1a
            java.lang.String r0 = r1.getSchemeSpecificPart()
            if (r0 != 0) goto L1a
            java.lang.String r0 = r1.getHost()
            if (r0 != 0) goto L1a
            java.lang.String r1 = r1.getAuthority()
            if (r1 != 0) goto L1a
            r1 = 1
            return r1
        L1a:
            r1 = 0
            return r1
    }

    public static boolean isTransferEncodingChunked(io.netty.handler.codec.http.HttpMessage r3) {
            io.netty.handler.codec.http.HttpHeaders r3 = r3.headers()
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderNames.TRANSFER_ENCODING
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderValues.CHUNKED
            r2 = 1
            boolean r3 = r3.contains(r0, r1, r2)
            return r3
    }

    static boolean isUnsupportedExpectation(io.netty.handler.codec.http.HttpMessage r2) {
            boolean r0 = isExpectHeaderValid(r2)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            io.netty.handler.codec.http.HttpHeaders r2 = r2.headers()
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderNames.EXPECT
            java.lang.String r2 = r2.get(r0)
            if (r2 == 0) goto L22
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderValues.CONTINUE
            java.lang.String r0 = r0.toString()
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 != 0) goto L22
            r2 = 1
            return r2
        L22:
            return r1
    }

    public static void set100ContinueExpected(io.netty.handler.codec.http.HttpMessage r1, boolean r2) {
            if (r2 == 0) goto Le
            io.netty.handler.codec.http.HttpHeaders r1 = r1.headers()
            io.netty.util.AsciiString r2 = io.netty.handler.codec.http.HttpHeaderNames.EXPECT
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderValues.CONTINUE
            r1.set(r2, r0)
            return
        Le:
            io.netty.handler.codec.http.HttpHeaders r1 = r1.headers()
            io.netty.util.AsciiString r2 = io.netty.handler.codec.http.HttpHeaderNames.EXPECT
            r1.remove(r2)
            return
    }

    public static void setContentLength(io.netty.handler.codec.http.HttpMessage r1, long r2) {
            io.netty.handler.codec.http.HttpHeaders r1 = r1.headers()
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_LENGTH
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.set(r0, r2)
            return
    }

    public static void setKeepAlive(io.netty.handler.codec.http.HttpHeaders r0, io.netty.handler.codec.http.HttpVersion r1, boolean r2) {
            boolean r1 = r1.isKeepAliveDefault()
            if (r1 == 0) goto L16
            if (r2 == 0) goto Le
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.CONNECTION
            r0.remove(r1)
            return
        Le:
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.CONNECTION
            io.netty.util.AsciiString r2 = io.netty.handler.codec.http.HttpHeaderValues.CLOSE
            r0.set(r1, r2)
            return
        L16:
            if (r2 == 0) goto L20
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.CONNECTION
            io.netty.util.AsciiString r2 = io.netty.handler.codec.http.HttpHeaderValues.KEEP_ALIVE
            r0.set(r1, r2)
            return
        L20:
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.CONNECTION
            r0.remove(r1)
            return
    }

    public static void setKeepAlive(io.netty.handler.codec.http.HttpMessage r1, boolean r2) {
            io.netty.handler.codec.http.HttpHeaders r0 = r1.headers()
            io.netty.handler.codec.http.HttpVersion r1 = r1.protocolVersion()
            setKeepAlive(r0, r1, r2)
            return
    }

    public static void setTransferEncodingChunked(io.netty.handler.codec.http.HttpMessage r3, boolean r4) {
            if (r4 == 0) goto L17
            io.netty.handler.codec.http.HttpHeaders r4 = r3.headers()
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderNames.TRANSFER_ENCODING
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderValues.CHUNKED
            r4.set(r0, r1)
            io.netty.handler.codec.http.HttpHeaders r3 = r3.headers()
            io.netty.util.AsciiString r4 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_LENGTH
            r3.remove(r4)
            return
        L17:
            io.netty.handler.codec.http.HttpHeaders r4 = r3.headers()
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderNames.TRANSFER_ENCODING
            java.util.List r4 = r4.getAll(r0)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L28
            return
        L28:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r4)
            java.util.Iterator r4 = r0.iterator()
        L31:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L49
            java.lang.Object r1 = r4.next()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            io.netty.util.AsciiString r2 = io.netty.handler.codec.http.HttpHeaderValues.CHUNKED
            boolean r1 = r2.contentEqualsIgnoreCase(r1)
            if (r1 == 0) goto L31
            r4.remove()
            goto L31
        L49:
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L59
            io.netty.handler.codec.http.HttpHeaders r3 = r3.headers()
            io.netty.util.AsciiString r4 = io.netty.handler.codec.http.HttpHeaderNames.TRANSFER_ENCODING
            r3.remove(r4)
            return
        L59:
            io.netty.handler.codec.http.HttpHeaders r3 = r3.headers()
            io.netty.util.AsciiString r4 = io.netty.handler.codec.http.HttpHeaderNames.TRANSFER_ENCODING
            r3.set(r4, r0)
            return
    }
}
