package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class HttpHeaders implements java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>> {

    @java.lang.Deprecated
    public static final io.netty.handler.codec.http.HttpHeaders EMPTY_HEADERS = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.Deprecated
    public static final class Names {
        public static final java.lang.String ACCEPT = "Accept";
        public static final java.lang.String ACCEPT_CHARSET = "Accept-Charset";
        public static final java.lang.String ACCEPT_ENCODING = "Accept-Encoding";
        public static final java.lang.String ACCEPT_LANGUAGE = "Accept-Language";
        public static final java.lang.String ACCEPT_PATCH = "Accept-Patch";
        public static final java.lang.String ACCEPT_RANGES = "Accept-Ranges";
        public static final java.lang.String ACCESS_CONTROL_ALLOW_CREDENTIALS = "Access-Control-Allow-Credentials";
        public static final java.lang.String ACCESS_CONTROL_ALLOW_HEADERS = "Access-Control-Allow-Headers";
        public static final java.lang.String ACCESS_CONTROL_ALLOW_METHODS = "Access-Control-Allow-Methods";
        public static final java.lang.String ACCESS_CONTROL_ALLOW_ORIGIN = "Access-Control-Allow-Origin";
        public static final java.lang.String ACCESS_CONTROL_EXPOSE_HEADERS = "Access-Control-Expose-Headers";
        public static final java.lang.String ACCESS_CONTROL_MAX_AGE = "Access-Control-Max-Age";
        public static final java.lang.String ACCESS_CONTROL_REQUEST_HEADERS = "Access-Control-Request-Headers";
        public static final java.lang.String ACCESS_CONTROL_REQUEST_METHOD = "Access-Control-Request-Method";
        public static final java.lang.String AGE = "Age";
        public static final java.lang.String ALLOW = "Allow";
        public static final java.lang.String AUTHORIZATION = "Authorization";
        public static final java.lang.String CACHE_CONTROL = "Cache-Control";
        public static final java.lang.String CONNECTION = "Connection";
        public static final java.lang.String CONTENT_BASE = "Content-Base";
        public static final java.lang.String CONTENT_ENCODING = "Content-Encoding";
        public static final java.lang.String CONTENT_LANGUAGE = "Content-Language";
        public static final java.lang.String CONTENT_LENGTH = "Content-Length";
        public static final java.lang.String CONTENT_LOCATION = "Content-Location";
        public static final java.lang.String CONTENT_MD5 = "Content-MD5";
        public static final java.lang.String CONTENT_RANGE = "Content-Range";
        public static final java.lang.String CONTENT_TRANSFER_ENCODING = "Content-Transfer-Encoding";
        public static final java.lang.String CONTENT_TYPE = "Content-Type";
        public static final java.lang.String COOKIE = "Cookie";
        public static final java.lang.String DATE = "Date";
        public static final java.lang.String ETAG = "ETag";
        public static final java.lang.String EXPECT = "Expect";
        public static final java.lang.String EXPIRES = "Expires";
        public static final java.lang.String FROM = "From";
        public static final java.lang.String HOST = "Host";
        public static final java.lang.String IF_MATCH = "If-Match";
        public static final java.lang.String IF_MODIFIED_SINCE = "If-Modified-Since";
        public static final java.lang.String IF_NONE_MATCH = "If-None-Match";
        public static final java.lang.String IF_RANGE = "If-Range";
        public static final java.lang.String IF_UNMODIFIED_SINCE = "If-Unmodified-Since";
        public static final java.lang.String LAST_MODIFIED = "Last-Modified";
        public static final java.lang.String LOCATION = "Location";
        public static final java.lang.String MAX_FORWARDS = "Max-Forwards";
        public static final java.lang.String ORIGIN = "Origin";
        public static final java.lang.String PRAGMA = "Pragma";
        public static final java.lang.String PROXY_AUTHENTICATE = "Proxy-Authenticate";
        public static final java.lang.String PROXY_AUTHORIZATION = "Proxy-Authorization";
        public static final java.lang.String RANGE = "Range";
        public static final java.lang.String REFERER = "Referer";
        public static final java.lang.String RETRY_AFTER = "Retry-After";
        public static final java.lang.String SEC_WEBSOCKET_ACCEPT = "Sec-WebSocket-Accept";
        public static final java.lang.String SEC_WEBSOCKET_KEY = "Sec-WebSocket-Key";
        public static final java.lang.String SEC_WEBSOCKET_KEY1 = "Sec-WebSocket-Key1";
        public static final java.lang.String SEC_WEBSOCKET_KEY2 = "Sec-WebSocket-Key2";
        public static final java.lang.String SEC_WEBSOCKET_LOCATION = "Sec-WebSocket-Location";
        public static final java.lang.String SEC_WEBSOCKET_ORIGIN = "Sec-WebSocket-Origin";
        public static final java.lang.String SEC_WEBSOCKET_PROTOCOL = "Sec-WebSocket-Protocol";
        public static final java.lang.String SEC_WEBSOCKET_VERSION = "Sec-WebSocket-Version";
        public static final java.lang.String SERVER = "Server";
        public static final java.lang.String SET_COOKIE = "Set-Cookie";
        public static final java.lang.String SET_COOKIE2 = "Set-Cookie2";
        public static final java.lang.String TE = "TE";
        public static final java.lang.String TRAILER = "Trailer";
        public static final java.lang.String TRANSFER_ENCODING = "Transfer-Encoding";
        public static final java.lang.String UPGRADE = "Upgrade";
        public static final java.lang.String USER_AGENT = "User-Agent";
        public static final java.lang.String VARY = "Vary";
        public static final java.lang.String VIA = "Via";
        public static final java.lang.String WARNING = "Warning";
        public static final java.lang.String WEBSOCKET_LOCATION = "WebSocket-Location";
        public static final java.lang.String WEBSOCKET_ORIGIN = "WebSocket-Origin";
        public static final java.lang.String WEBSOCKET_PROTOCOL = "WebSocket-Protocol";
        public static final java.lang.String WWW_AUTHENTICATE = "WWW-Authenticate";

        private Names() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.Deprecated
    public static final class Values {
        public static final java.lang.String APPLICATION_JSON = "application/json";
        public static final java.lang.String APPLICATION_X_WWW_FORM_URLENCODED = "application/x-www-form-urlencoded";
        public static final java.lang.String BASE64 = "base64";
        public static final java.lang.String BINARY = "binary";
        public static final java.lang.String BOUNDARY = "boundary";
        public static final java.lang.String BYTES = "bytes";
        public static final java.lang.String CHARSET = "charset";
        public static final java.lang.String CHUNKED = "chunked";
        public static final java.lang.String CLOSE = "close";
        public static final java.lang.String COMPRESS = "compress";
        public static final java.lang.String CONTINUE = "100-continue";
        public static final java.lang.String DEFLATE = "deflate";
        public static final java.lang.String GZIP = "gzip";
        public static final java.lang.String GZIP_DEFLATE = "gzip,deflate";
        public static final java.lang.String IDENTITY = "identity";
        public static final java.lang.String KEEP_ALIVE = "keep-alive";
        public static final java.lang.String MAX_AGE = "max-age";
        public static final java.lang.String MAX_STALE = "max-stale";
        public static final java.lang.String MIN_FRESH = "min-fresh";
        public static final java.lang.String MULTIPART_FORM_DATA = "multipart/form-data";
        public static final java.lang.String MUST_REVALIDATE = "must-revalidate";
        public static final java.lang.String NONE = "none";
        public static final java.lang.String NO_CACHE = "no-cache";
        public static final java.lang.String NO_STORE = "no-store";
        public static final java.lang.String NO_TRANSFORM = "no-transform";
        public static final java.lang.String ONLY_IF_CACHED = "only-if-cached";
        public static final java.lang.String PRIVATE = "private";
        public static final java.lang.String PROXY_REVALIDATE = "proxy-revalidate";
        public static final java.lang.String PUBLIC = "public";
        public static final java.lang.String QUOTED_PRINTABLE = "quoted-printable";
        public static final java.lang.String S_MAXAGE = "s-maxage";
        public static final java.lang.String TRAILERS = "trailers";
        public static final java.lang.String UPGRADE = "Upgrade";
        public static final java.lang.String WEBSOCKET = "WebSocket";

        private Values() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            io.netty.handler.codec.http.EmptyHttpHeaders r0 = io.netty.handler.codec.http.EmptyHttpHeaders.instance()
            io.netty.handler.codec.http.HttpHeaders.EMPTY_HEADERS = r0
            return
    }

    protected HttpHeaders() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static void addDateHeader(io.netty.handler.codec.http.HttpMessage r0, java.lang.CharSequence r1, java.util.Date r2) {
            io.netty.handler.codec.http.HttpHeaders r0 = r0.headers()
            r0.add(r1, r2)
            return
    }

    @java.lang.Deprecated
    public static void addDateHeader(io.netty.handler.codec.http.HttpMessage r0, java.lang.String r1, java.util.Date r2) {
            io.netty.handler.codec.http.HttpHeaders r0 = r0.headers()
            r0.add(r1, r2)
            return
    }

    @java.lang.Deprecated
    public static void addHeader(io.netty.handler.codec.http.HttpMessage r0, java.lang.CharSequence r1, java.lang.Object r2) {
            io.netty.handler.codec.http.HttpHeaders r0 = r0.headers()
            r0.add(r1, r2)
            return
    }

    @java.lang.Deprecated
    public static void addHeader(io.netty.handler.codec.http.HttpMessage r0, java.lang.String r1, java.lang.Object r2) {
            io.netty.handler.codec.http.HttpHeaders r0 = r0.headers()
            r0.add(r1, r2)
            return
    }

    @java.lang.Deprecated
    public static void addIntHeader(io.netty.handler.codec.http.HttpMessage r0, java.lang.CharSequence r1, int r2) {
            io.netty.handler.codec.http.HttpHeaders r0 = r0.headers()
            r0.addInt(r1, r2)
            return
    }

    @java.lang.Deprecated
    public static void addIntHeader(io.netty.handler.codec.http.HttpMessage r0, java.lang.String r1, int r2) {
            io.netty.handler.codec.http.HttpHeaders r0 = r0.headers()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.add(r1, r2)
            return
    }

    @java.lang.Deprecated
    public static void clearHeaders(io.netty.handler.codec.http.HttpMessage r0) {
            io.netty.handler.codec.http.HttpHeaders r0 = r0.headers()
            r0.clear()
            return
    }

    private static boolean containsCommaSeparatedTrimmed(java.lang.CharSequence r5, java.lang.CharSequence r6, boolean r7) {
            r0 = -1
            r1 = 44
            r2 = 1
            r3 = 0
            if (r7 == 0) goto L49
            int r7 = io.netty.util.AsciiString.indexOf(r5, r1, r3)
            if (r7 != r0) goto L18
            java.lang.CharSequence r5 = io.netty.util.AsciiString.trim(r5)
            boolean r5 = io.netty.util.AsciiString.contentEqualsIgnoreCase(r5, r6)
            if (r5 == 0) goto L8b
            return r2
        L18:
            r4 = 0
        L19:
            java.lang.CharSequence r4 = r5.subSequence(r4, r7)
            java.lang.CharSequence r4 = io.netty.util.AsciiString.trim(r4)
            boolean r4 = io.netty.util.AsciiString.contentEqualsIgnoreCase(r4, r6)
            if (r4 == 0) goto L28
            return r2
        L28:
            int r4 = r7 + 1
            int r7 = io.netty.util.AsciiString.indexOf(r5, r1, r4)
            if (r7 != r0) goto L19
            int r7 = r5.length()
            if (r4 >= r7) goto L8b
            int r7 = r5.length()
            java.lang.CharSequence r5 = r5.subSequence(r4, r7)
            java.lang.CharSequence r5 = io.netty.util.AsciiString.trim(r5)
            boolean r5 = io.netty.util.AsciiString.contentEqualsIgnoreCase(r5, r6)
            if (r5 == 0) goto L8b
            return r2
        L49:
            int r7 = io.netty.util.AsciiString.indexOf(r5, r1, r3)
            if (r7 != r0) goto L5a
            java.lang.CharSequence r5 = io.netty.util.AsciiString.trim(r5)
            boolean r5 = io.netty.util.AsciiString.contentEquals(r5, r6)
            if (r5 == 0) goto L8b
            return r2
        L5a:
            r4 = 0
        L5b:
            java.lang.CharSequence r4 = r5.subSequence(r4, r7)
            java.lang.CharSequence r4 = io.netty.util.AsciiString.trim(r4)
            boolean r4 = io.netty.util.AsciiString.contentEquals(r4, r6)
            if (r4 == 0) goto L6a
            return r2
        L6a:
            int r4 = r7 + 1
            int r7 = io.netty.util.AsciiString.indexOf(r5, r1, r4)
            if (r7 != r0) goto L5b
            int r7 = r5.length()
            if (r4 >= r7) goto L8b
            int r7 = r5.length()
            java.lang.CharSequence r5 = r5.subSequence(r4, r7)
            java.lang.CharSequence r5 = io.netty.util.AsciiString.trim(r5)
            boolean r5 = io.netty.util.AsciiString.contentEquals(r5, r6)
            if (r5 == 0) goto L8b
            return r2
        L8b:
            return r3
    }

    @java.lang.Deprecated
    public static void encodeAscii(java.lang.CharSequence r2, io.netty.buffer.ByteBuf r3) {
            boolean r0 = r2 instanceof io.netty.util.AsciiString
            if (r0 == 0) goto L10
            r0 = r2
            io.netty.util.AsciiString r0 = (io.netty.util.AsciiString) r0
            r1 = 0
            int r2 = r2.length()
            io.netty.buffer.ByteBufUtil.copy(r0, r1, r3, r2)
            return
        L10:
            java.nio.charset.Charset r0 = io.netty.util.CharsetUtil.US_ASCII
            r3.writeCharSequence(r2, r0)
            return
    }

    @java.lang.Deprecated
    public static boolean equalsIgnoreCase(java.lang.CharSequence r0, java.lang.CharSequence r1) {
            boolean r0 = io.netty.util.AsciiString.contentEqualsIgnoreCase(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static long getContentLength(io.netty.handler.codec.http.HttpMessage r2) {
            long r0 = io.netty.handler.codec.http.HttpUtil.getContentLength(r2)
            return r0
    }

    @java.lang.Deprecated
    public static long getContentLength(io.netty.handler.codec.http.HttpMessage r0, long r1) {
            long r0 = io.netty.handler.codec.http.HttpUtil.getContentLength(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static java.util.Date getDate(io.netty.handler.codec.http.HttpMessage r1) throws java.text.ParseException {
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderNames.DATE
            java.util.Date r1 = getDateHeader(r1, r0)
            return r1
    }

    @java.lang.Deprecated
    public static java.util.Date getDate(io.netty.handler.codec.http.HttpMessage r1, java.util.Date r2) {
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderNames.DATE
            java.util.Date r1 = getDateHeader(r1, r0, r2)
            return r1
    }

    @java.lang.Deprecated
    public static java.util.Date getDateHeader(io.netty.handler.codec.http.HttpMessage r3, java.lang.CharSequence r4) throws java.text.ParseException {
            io.netty.handler.codec.http.HttpHeaders r3 = r3.headers()
            java.lang.String r3 = r3.get(r4)
            r0 = 0
            if (r3 == 0) goto L29
            java.util.Date r4 = io.netty.handler.codec.DateFormatter.parseHttpDate(r3)
            if (r4 == 0) goto L12
            return r4
        L12:
            java.text.ParseException r4 = new java.text.ParseException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "header can't be parsed into a Date: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r4.<init>(r3, r0)
            throw r4
        L29:
            java.text.ParseException r3 = new java.text.ParseException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "header not found: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r3.<init>(r4, r0)
            throw r3
    }

    @java.lang.Deprecated
    public static java.util.Date getDateHeader(io.netty.handler.codec.http.HttpMessage r0, java.lang.CharSequence r1, java.util.Date r2) {
            java.lang.String r0 = getHeader(r0, r1)
            java.util.Date r0 = io.netty.handler.codec.DateFormatter.parseHttpDate(r0)
            if (r0 == 0) goto Lb
            return r0
        Lb:
            return r2
    }

    @java.lang.Deprecated
    public static java.util.Date getDateHeader(io.netty.handler.codec.http.HttpMessage r0, java.lang.String r1) throws java.text.ParseException {
            java.util.Date r0 = getDateHeader(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static java.util.Date getDateHeader(io.netty.handler.codec.http.HttpMessage r0, java.lang.String r1, java.util.Date r2) {
            java.util.Date r0 = getDateHeader(r0, r1, r2)
            return r0
    }

    @java.lang.Deprecated
    public static java.lang.String getHeader(io.netty.handler.codec.http.HttpMessage r0, java.lang.CharSequence r1) {
            io.netty.handler.codec.http.HttpHeaders r0 = r0.headers()
            java.lang.String r0 = r0.get(r1)
            return r0
    }

    @java.lang.Deprecated
    public static java.lang.String getHeader(io.netty.handler.codec.http.HttpMessage r0, java.lang.CharSequence r1, java.lang.String r2) {
            io.netty.handler.codec.http.HttpHeaders r0 = r0.headers()
            java.lang.String r0 = r0.get(r1, r2)
            return r0
    }

    @java.lang.Deprecated
    public static java.lang.String getHeader(io.netty.handler.codec.http.HttpMessage r0, java.lang.String r1) {
            io.netty.handler.codec.http.HttpHeaders r0 = r0.headers()
            java.lang.String r0 = r0.get(r1)
            return r0
    }

    @java.lang.Deprecated
    public static java.lang.String getHeader(io.netty.handler.codec.http.HttpMessage r0, java.lang.String r1, java.lang.String r2) {
            io.netty.handler.codec.http.HttpHeaders r0 = r0.headers()
            java.lang.String r0 = r0.get(r1, r2)
            return r0
    }

    @java.lang.Deprecated
    public static java.lang.String getHost(io.netty.handler.codec.http.HttpMessage r1) {
            io.netty.handler.codec.http.HttpHeaders r1 = r1.headers()
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderNames.HOST
            java.lang.String r1 = r1.get(r0)
            return r1
    }

    @java.lang.Deprecated
    public static java.lang.String getHost(io.netty.handler.codec.http.HttpMessage r1, java.lang.String r2) {
            io.netty.handler.codec.http.HttpHeaders r1 = r1.headers()
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderNames.HOST
            java.lang.String r1 = r1.get(r0, r2)
            return r1
    }

    @java.lang.Deprecated
    public static int getIntHeader(io.netty.handler.codec.http.HttpMessage r2, java.lang.CharSequence r3) {
            io.netty.handler.codec.http.HttpHeaders r2 = r2.headers()
            java.lang.String r2 = r2.get(r3)
            if (r2 == 0) goto Lf
            int r2 = java.lang.Integer.parseInt(r2)
            return r2
        Lf:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "header not found: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    @java.lang.Deprecated
    public static int getIntHeader(io.netty.handler.codec.http.HttpMessage r0, java.lang.CharSequence r1, int r2) {
            io.netty.handler.codec.http.HttpHeaders r0 = r0.headers()
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @java.lang.Deprecated
    public static int getIntHeader(io.netty.handler.codec.http.HttpMessage r0, java.lang.String r1) {
            int r0 = getIntHeader(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static int getIntHeader(io.netty.handler.codec.http.HttpMessage r0, java.lang.String r1, int r2) {
            io.netty.handler.codec.http.HttpHeaders r0 = r0.headers()
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @java.lang.Deprecated
    public static boolean is100ContinueExpected(io.netty.handler.codec.http.HttpMessage r0) {
            boolean r0 = io.netty.handler.codec.http.HttpUtil.is100ContinueExpected(r0)
            return r0
    }

    @java.lang.Deprecated
    public static boolean isContentLengthSet(io.netty.handler.codec.http.HttpMessage r0) {
            boolean r0 = io.netty.handler.codec.http.HttpUtil.isContentLengthSet(r0)
            return r0
    }

    @java.lang.Deprecated
    public static boolean isKeepAlive(io.netty.handler.codec.http.HttpMessage r0) {
            boolean r0 = io.netty.handler.codec.http.HttpUtil.isKeepAlive(r0)
            return r0
    }

    @java.lang.Deprecated
    public static boolean isTransferEncodingChunked(io.netty.handler.codec.http.HttpMessage r0) {
            boolean r0 = io.netty.handler.codec.http.HttpUtil.isTransferEncodingChunked(r0)
            return r0
    }

    @java.lang.Deprecated
    public static java.lang.CharSequence newEntity(java.lang.String r1) {
            io.netty.util.AsciiString r0 = new io.netty.util.AsciiString
            r0.<init>(r1)
            return r0
    }

    @java.lang.Deprecated
    public static void removeHeader(io.netty.handler.codec.http.HttpMessage r0, java.lang.CharSequence r1) {
            io.netty.handler.codec.http.HttpHeaders r0 = r0.headers()
            r0.remove(r1)
            return
    }

    @java.lang.Deprecated
    public static void removeHeader(io.netty.handler.codec.http.HttpMessage r0, java.lang.String r1) {
            io.netty.handler.codec.http.HttpHeaders r0 = r0.headers()
            r0.remove(r1)
            return
    }

    @java.lang.Deprecated
    public static void removeTransferEncodingChunked(io.netty.handler.codec.http.HttpMessage r1) {
            r0 = 0
            io.netty.handler.codec.http.HttpUtil.setTransferEncodingChunked(r1, r0)
            return
    }

    @java.lang.Deprecated
    public static void set100ContinueExpected(io.netty.handler.codec.http.HttpMessage r1) {
            r0 = 1
            io.netty.handler.codec.http.HttpUtil.set100ContinueExpected(r1, r0)
            return
    }

    @java.lang.Deprecated
    public static void set100ContinueExpected(io.netty.handler.codec.http.HttpMessage r0, boolean r1) {
            io.netty.handler.codec.http.HttpUtil.set100ContinueExpected(r0, r1)
            return
    }

    @java.lang.Deprecated
    public static void setContentLength(io.netty.handler.codec.http.HttpMessage r0, long r1) {
            io.netty.handler.codec.http.HttpUtil.setContentLength(r0, r1)
            return
    }

    @java.lang.Deprecated
    public static void setDate(io.netty.handler.codec.http.HttpMessage r1, java.util.Date r2) {
            io.netty.handler.codec.http.HttpHeaders r1 = r1.headers()
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderNames.DATE
            r1.set(r0, r2)
            return
    }

    @java.lang.Deprecated
    public static void setDateHeader(io.netty.handler.codec.http.HttpMessage r0, java.lang.CharSequence r1, java.lang.Iterable<java.util.Date> r2) {
            io.netty.handler.codec.http.HttpHeaders r0 = r0.headers()
            r0.set(r1, r2)
            return
    }

    @java.lang.Deprecated
    public static void setDateHeader(io.netty.handler.codec.http.HttpMessage r0, java.lang.CharSequence r1, java.util.Date r2) {
            if (r2 == 0) goto Le
            io.netty.handler.codec.http.HttpHeaders r0 = r0.headers()
            java.lang.String r2 = io.netty.handler.codec.DateFormatter.format(r2)
            r0.set(r1, r2)
            return
        Le:
            io.netty.handler.codec.http.HttpHeaders r0 = r0.headers()
            r2 = 0
            r0.set(r1, r2)
            return
    }

    @java.lang.Deprecated
    public static void setDateHeader(io.netty.handler.codec.http.HttpMessage r0, java.lang.String r1, java.lang.Iterable<java.util.Date> r2) {
            io.netty.handler.codec.http.HttpHeaders r0 = r0.headers()
            r0.set(r1, r2)
            return
    }

    @java.lang.Deprecated
    public static void setDateHeader(io.netty.handler.codec.http.HttpMessage r0, java.lang.String r1, java.util.Date r2) {
            setDateHeader(r0, r1, r2)
            return
    }

    @java.lang.Deprecated
    public static void setHeader(io.netty.handler.codec.http.HttpMessage r0, java.lang.CharSequence r1, java.lang.Iterable<?> r2) {
            io.netty.handler.codec.http.HttpHeaders r0 = r0.headers()
            r0.set(r1, r2)
            return
    }

    @java.lang.Deprecated
    public static void setHeader(io.netty.handler.codec.http.HttpMessage r0, java.lang.CharSequence r1, java.lang.Object r2) {
            io.netty.handler.codec.http.HttpHeaders r0 = r0.headers()
            r0.set(r1, r2)
            return
    }

    @java.lang.Deprecated
    public static void setHeader(io.netty.handler.codec.http.HttpMessage r0, java.lang.String r1, java.lang.Iterable<?> r2) {
            io.netty.handler.codec.http.HttpHeaders r0 = r0.headers()
            r0.set(r1, r2)
            return
    }

    @java.lang.Deprecated
    public static void setHeader(io.netty.handler.codec.http.HttpMessage r0, java.lang.String r1, java.lang.Object r2) {
            io.netty.handler.codec.http.HttpHeaders r0 = r0.headers()
            r0.set(r1, r2)
            return
    }

    @java.lang.Deprecated
    public static void setHost(io.netty.handler.codec.http.HttpMessage r1, java.lang.CharSequence r2) {
            io.netty.handler.codec.http.HttpHeaders r1 = r1.headers()
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderNames.HOST
            r1.set(r0, r2)
            return
    }

    @java.lang.Deprecated
    public static void setHost(io.netty.handler.codec.http.HttpMessage r1, java.lang.String r2) {
            io.netty.handler.codec.http.HttpHeaders r1 = r1.headers()
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderNames.HOST
            r1.set(r0, r2)
            return
    }

    @java.lang.Deprecated
    public static void setIntHeader(io.netty.handler.codec.http.HttpMessage r0, java.lang.CharSequence r1, int r2) {
            io.netty.handler.codec.http.HttpHeaders r0 = r0.headers()
            r0.setInt(r1, r2)
            return
    }

    @java.lang.Deprecated
    public static void setIntHeader(io.netty.handler.codec.http.HttpMessage r0, java.lang.CharSequence r1, java.lang.Iterable<java.lang.Integer> r2) {
            io.netty.handler.codec.http.HttpHeaders r0 = r0.headers()
            r0.set(r1, r2)
            return
    }

    @java.lang.Deprecated
    public static void setIntHeader(io.netty.handler.codec.http.HttpMessage r0, java.lang.String r1, int r2) {
            io.netty.handler.codec.http.HttpHeaders r0 = r0.headers()
            r0.setInt(r1, r2)
            return
    }

    @java.lang.Deprecated
    public static void setIntHeader(io.netty.handler.codec.http.HttpMessage r0, java.lang.String r1, java.lang.Iterable<java.lang.Integer> r2) {
            io.netty.handler.codec.http.HttpHeaders r0 = r0.headers()
            r0.set(r1, r2)
            return
    }

    @java.lang.Deprecated
    public static void setKeepAlive(io.netty.handler.codec.http.HttpMessage r0, boolean r1) {
            io.netty.handler.codec.http.HttpUtil.setKeepAlive(r0, r1)
            return
    }

    @java.lang.Deprecated
    public static void setTransferEncodingChunked(io.netty.handler.codec.http.HttpMessage r1) {
            r0 = 1
            io.netty.handler.codec.http.HttpUtil.setTransferEncodingChunked(r1, r0)
            return
    }

    public io.netty.handler.codec.http.HttpHeaders add(io.netty.handler.codec.http.HttpHeaders r3) {
            r2 = this;
            if (r3 == 0) goto L21
            java.util.Iterator r3 = r3.iterator()
        L6:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L20
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            r2.add(r1, r0)
            goto L6
        L20:
            return r2
        L21:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "headers"
            r3.<init>(r0)
            throw r3
    }

    public io.netty.handler.codec.http.HttpHeaders add(java.lang.CharSequence r1, java.lang.Iterable<?> r2) {
            r0 = this;
            java.lang.String r1 = r1.toString()
            io.netty.handler.codec.http.HttpHeaders r1 = r0.add(r1, r2)
            return r1
    }

    public io.netty.handler.codec.http.HttpHeaders add(java.lang.CharSequence r1, java.lang.Object r2) {
            r0 = this;
            java.lang.String r1 = r1.toString()
            io.netty.handler.codec.http.HttpHeaders r1 = r0.add(r1, r2)
            return r1
    }

    public abstract io.netty.handler.codec.http.HttpHeaders add(java.lang.String r1, java.lang.Iterable<?> r2);

    public abstract io.netty.handler.codec.http.HttpHeaders add(java.lang.String r1, java.lang.Object r2);

    public abstract io.netty.handler.codec.http.HttpHeaders addInt(java.lang.CharSequence r1, int r2);

    public abstract io.netty.handler.codec.http.HttpHeaders addShort(java.lang.CharSequence r1, short r2);

    public abstract io.netty.handler.codec.http.HttpHeaders clear();

    public boolean contains(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.String r1 = r1.toString()
            boolean r1 = r0.contains(r1)
            return r1
    }

    public boolean contains(java.lang.CharSequence r1, java.lang.CharSequence r2, boolean r3) {
            r0 = this;
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = r2.toString()
            boolean r1 = r0.contains(r1, r2, r3)
            return r1
    }

    public abstract boolean contains(java.lang.String r1);

    public boolean contains(java.lang.String r2, java.lang.String r3, boolean r4) {
            r1 = this;
            java.util.Iterator r2 = r1.valueStringIterator(r2)
            r0 = 1
            if (r4 == 0) goto L1a
        L7:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L2d
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r4.equalsIgnoreCase(r3)
            if (r4 == 0) goto L7
            return r0
        L1a:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L2d
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L1a
            return r0
        L2d:
            r2 = 0
            return r2
    }

    public boolean containsValue(java.lang.CharSequence r2, java.lang.CharSequence r3, boolean r4) {
            r1 = this;
            java.util.Iterator r2 = r1.valueCharSequenceIterator(r2)
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r2.next()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = containsCommaSeparatedTrimmed(r0, r3, r4)
            if (r0 == 0) goto L4
            r2 = 1
            return r2
        L18:
            r2 = 0
            return r2
    }

    public io.netty.handler.codec.http.HttpHeaders copy() {
            r1 = this;
            io.netty.handler.codec.http.DefaultHttpHeaders r0 = new io.netty.handler.codec.http.DefaultHttpHeaders
            r0.<init>()
            io.netty.handler.codec.http.HttpHeaders r0 = r0.set(r1)
            return r0
    }

    public abstract java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> entries();

    public java.lang.String get(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r0.get(r1)
            return r1
    }

    public java.lang.String get(java.lang.CharSequence r1, java.lang.String r2) {
            r0 = this;
            java.lang.String r1 = r0.get(r1)
            if (r1 != 0) goto L7
            return r2
        L7:
            return r1
    }

    public abstract java.lang.String get(java.lang.String r1);

    public java.util.List<java.lang.String> getAll(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.String r1 = r1.toString()
            java.util.List r1 = r0.getAll(r1)
            return r1
    }

    public abstract java.util.List<java.lang.String> getAll(java.lang.String r1);

    public final java.util.List<java.lang.String> getAllAsString(java.lang.CharSequence r1) {
            r0 = this;
            java.util.List r1 = r0.getAll(r1)
            return r1
    }

    public final java.lang.String getAsString(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.String r1 = r0.get(r1)
            return r1
    }

    public abstract int getInt(java.lang.CharSequence r1, int r2);

    public abstract java.lang.Integer getInt(java.lang.CharSequence r1);

    public abstract java.lang.Short getShort(java.lang.CharSequence r1);

    public abstract short getShort(java.lang.CharSequence r1, short r2);

    public abstract long getTimeMillis(java.lang.CharSequence r1, long r2);

    public abstract java.lang.Long getTimeMillis(java.lang.CharSequence r1);

    public abstract boolean isEmpty();

    @Override // java.lang.Iterable
    @java.lang.Deprecated
    public abstract java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> iterator();

    public final java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> iteratorAsString() {
            r1 = this;
            java.util.Iterator r0 = r1.iterator()
            return r0
    }

    public abstract java.util.Iterator<java.util.Map.Entry<java.lang.CharSequence, java.lang.CharSequence>> iteratorCharSequence();

    public abstract java.util.Set<java.lang.String> names();

    public io.netty.handler.codec.http.HttpHeaders remove(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.String r1 = r1.toString()
            io.netty.handler.codec.http.HttpHeaders r1 = r0.remove(r1)
            return r1
    }

    public abstract io.netty.handler.codec.http.HttpHeaders remove(java.lang.String r1);

    public io.netty.handler.codec.http.HttpHeaders set(io.netty.handler.codec.http.HttpHeaders r3) {
            r2 = this;
            java.lang.String r0 = "headers"
            io.netty.util.internal.ObjectUtil.checkNotNull(r3, r0)
            r2.clear()
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto Lf
            goto L2d
        Lf:
            java.util.Iterator r3 = r3.iterator()
        L13:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            r2.add(r1, r0)
            goto L13
        L2d:
            return r2
    }

    public io.netty.handler.codec.http.HttpHeaders set(java.lang.CharSequence r1, java.lang.Iterable<?> r2) {
            r0 = this;
            java.lang.String r1 = r1.toString()
            io.netty.handler.codec.http.HttpHeaders r1 = r0.set(r1, r2)
            return r1
    }

    public io.netty.handler.codec.http.HttpHeaders set(java.lang.CharSequence r1, java.lang.Object r2) {
            r0 = this;
            java.lang.String r1 = r1.toString()
            io.netty.handler.codec.http.HttpHeaders r1 = r0.set(r1, r2)
            return r1
    }

    public abstract io.netty.handler.codec.http.HttpHeaders set(java.lang.String r1, java.lang.Iterable<?> r2);

    public abstract io.netty.handler.codec.http.HttpHeaders set(java.lang.String r1, java.lang.Object r2);

    public io.netty.handler.codec.http.HttpHeaders setAll(io.netty.handler.codec.http.HttpHeaders r3) {
            r2 = this;
            java.lang.String r0 = "headers"
            io.netty.util.internal.ObjectUtil.checkNotNull(r3, r0)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto Lc
            goto L2a
        Lc:
            java.util.Iterator r3 = r3.iterator()
        L10:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            r2.set(r1, r0)
            goto L10
        L2a:
            return r2
    }

    public abstract io.netty.handler.codec.http.HttpHeaders setInt(java.lang.CharSequence r1, int r2);

    public abstract io.netty.handler.codec.http.HttpHeaders setShort(java.lang.CharSequence r1, short r2);

    public abstract int size();

    public java.lang.String toString() {
            r3 = this;
            java.lang.Class r0 = r3.getClass()
            java.util.Iterator r1 = r3.iteratorCharSequence()
            int r2 = r3.size()
            java.lang.String r0 = io.netty.handler.codec.HeadersUtils.toString(r0, r1, r2)
            return r0
    }

    public java.util.Iterator<? extends java.lang.CharSequence> valueCharSequenceIterator(java.lang.CharSequence r1) {
            r0 = this;
            java.util.Iterator r1 = r0.valueStringIterator(r1)
            return r1
    }

    public java.util.Iterator<java.lang.String> valueStringIterator(java.lang.CharSequence r1) {
            r0 = this;
            java.util.List r1 = r0.getAll(r1)
            java.util.Iterator r1 = r1.iterator()
            return r1
    }
}
