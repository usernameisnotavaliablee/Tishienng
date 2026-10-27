package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class HttpConversionUtil {
    private static final io.netty.util.AsciiString EMPTY_REQUEST_PATH = null;
    private static final io.netty.handler.codec.http2.CharSequenceMap<io.netty.util.AsciiString> HTTP_TO_HTTP2_HEADER_BLACKLIST = null;
    public static final io.netty.handler.codec.http.HttpMethod OUT_OF_MESSAGE_SEQUENCE_METHOD = null;
    public static final java.lang.String OUT_OF_MESSAGE_SEQUENCE_PATH = "";
    public static final io.netty.handler.codec.http.HttpResponseStatus OUT_OF_MESSAGE_SEQUENCE_RETURN_CODE = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum ExtensionHeaderNames extends java.lang.Enum<io.netty.handler.codec.http2.HttpConversionUtil.ExtensionHeaderNames> {
        private static final /* synthetic */ io.netty.handler.codec.http2.HttpConversionUtil.ExtensionHeaderNames[] $VALUES = null;
        public static final io.netty.handler.codec.http2.HttpConversionUtil.ExtensionHeaderNames PATH = null;
        public static final io.netty.handler.codec.http2.HttpConversionUtil.ExtensionHeaderNames SCHEME = null;
        public static final io.netty.handler.codec.http2.HttpConversionUtil.ExtensionHeaderNames STREAM_DEPENDENCY_ID = null;
        public static final io.netty.handler.codec.http2.HttpConversionUtil.ExtensionHeaderNames STREAM_ID = null;
        public static final io.netty.handler.codec.http2.HttpConversionUtil.ExtensionHeaderNames STREAM_PROMISE_ID = null;
        public static final io.netty.handler.codec.http2.HttpConversionUtil.ExtensionHeaderNames STREAM_WEIGHT = null;
        private final io.netty.util.AsciiString text;

        static {
                io.netty.handler.codec.http2.HttpConversionUtil$ExtensionHeaderNames r0 = new io.netty.handler.codec.http2.HttpConversionUtil$ExtensionHeaderNames
                java.lang.String r1 = "x-http2-stream-id"
                java.lang.String r2 = "STREAM_ID"
                r3 = 0
                r0.<init>(r2, r3, r1)
                io.netty.handler.codec.http2.HttpConversionUtil.ExtensionHeaderNames.STREAM_ID = r0
                io.netty.handler.codec.http2.HttpConversionUtil$ExtensionHeaderNames r1 = new io.netty.handler.codec.http2.HttpConversionUtil$ExtensionHeaderNames
                java.lang.String r2 = "x-http2-scheme"
                java.lang.String r4 = "SCHEME"
                r5 = 1
                r1.<init>(r4, r5, r2)
                io.netty.handler.codec.http2.HttpConversionUtil.ExtensionHeaderNames.SCHEME = r1
                io.netty.handler.codec.http2.HttpConversionUtil$ExtensionHeaderNames r2 = new io.netty.handler.codec.http2.HttpConversionUtil$ExtensionHeaderNames
                java.lang.String r4 = "x-http2-path"
                java.lang.String r6 = "PATH"
                r7 = 2
                r2.<init>(r6, r7, r4)
                io.netty.handler.codec.http2.HttpConversionUtil.ExtensionHeaderNames.PATH = r2
                io.netty.handler.codec.http2.HttpConversionUtil$ExtensionHeaderNames r4 = new io.netty.handler.codec.http2.HttpConversionUtil$ExtensionHeaderNames
                java.lang.String r6 = "x-http2-stream-promise-id"
                java.lang.String r8 = "STREAM_PROMISE_ID"
                r9 = 3
                r4.<init>(r8, r9, r6)
                io.netty.handler.codec.http2.HttpConversionUtil.ExtensionHeaderNames.STREAM_PROMISE_ID = r4
                io.netty.handler.codec.http2.HttpConversionUtil$ExtensionHeaderNames r6 = new io.netty.handler.codec.http2.HttpConversionUtil$ExtensionHeaderNames
                java.lang.String r8 = "x-http2-stream-dependency-id"
                java.lang.String r10 = "STREAM_DEPENDENCY_ID"
                r11 = 4
                r6.<init>(r10, r11, r8)
                io.netty.handler.codec.http2.HttpConversionUtil.ExtensionHeaderNames.STREAM_DEPENDENCY_ID = r6
                io.netty.handler.codec.http2.HttpConversionUtil$ExtensionHeaderNames r8 = new io.netty.handler.codec.http2.HttpConversionUtil$ExtensionHeaderNames
                java.lang.String r10 = "x-http2-stream-weight"
                java.lang.String r12 = "STREAM_WEIGHT"
                r13 = 5
                r8.<init>(r12, r13, r10)
                io.netty.handler.codec.http2.HttpConversionUtil.ExtensionHeaderNames.STREAM_WEIGHT = r8
                r10 = 6
                io.netty.handler.codec.http2.HttpConversionUtil$ExtensionHeaderNames[] r10 = new io.netty.handler.codec.http2.HttpConversionUtil.ExtensionHeaderNames[r10]
                r10[r3] = r0
                r10[r5] = r1
                r10[r7] = r2
                r10[r9] = r4
                r10[r11] = r6
                r10[r13] = r8
                io.netty.handler.codec.http2.HttpConversionUtil.ExtensionHeaderNames.$VALUES = r10
                return
        }

        ExtensionHeaderNames(java.lang.String r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.<init>(r1, r2)
                io.netty.util.AsciiString r1 = io.netty.util.AsciiString.cached(r3)
                r0.text = r1
                return
        }

        public static io.netty.handler.codec.http2.HttpConversionUtil.ExtensionHeaderNames valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.codec.http2.HttpConversionUtil$ExtensionHeaderNames> r0 = io.netty.handler.codec.http2.HttpConversionUtil.ExtensionHeaderNames.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.codec.http2.HttpConversionUtil$ExtensionHeaderNames r1 = (io.netty.handler.codec.http2.HttpConversionUtil.ExtensionHeaderNames) r1
                return r1
        }

        public static io.netty.handler.codec.http2.HttpConversionUtil.ExtensionHeaderNames[] values() {
                io.netty.handler.codec.http2.HttpConversionUtil$ExtensionHeaderNames[] r0 = io.netty.handler.codec.http2.HttpConversionUtil.ExtensionHeaderNames.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.codec.http2.HttpConversionUtil$ExtensionHeaderNames[] r0 = (io.netty.handler.codec.http2.HttpConversionUtil.ExtensionHeaderNames[]) r0
                return r0
        }

        public io.netty.util.AsciiString text() {
                r1 = this;
                io.netty.util.AsciiString r0 = r1.text
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class Http2ToHttpHeaderTranslator {
        private static final io.netty.handler.codec.http2.CharSequenceMap<io.netty.util.AsciiString> REQUEST_HEADER_TRANSLATIONS = null;
        private static final io.netty.handler.codec.http2.CharSequenceMap<io.netty.util.AsciiString> RESPONSE_HEADER_TRANSLATIONS = null;
        private final io.netty.handler.codec.http.HttpHeaders output;
        private final int streamId;
        private final io.netty.handler.codec.http2.CharSequenceMap<io.netty.util.AsciiString> translations;

        static {
                io.netty.handler.codec.http2.CharSequenceMap r0 = new io.netty.handler.codec.http2.CharSequenceMap
                r0.<init>()
                io.netty.handler.codec.http2.HttpConversionUtil.Http2ToHttpHeaderTranslator.REQUEST_HEADER_TRANSLATIONS = r0
                io.netty.handler.codec.http2.CharSequenceMap r1 = new io.netty.handler.codec.http2.CharSequenceMap
                r1.<init>()
                io.netty.handler.codec.http2.HttpConversionUtil.Http2ToHttpHeaderTranslator.RESPONSE_HEADER_TRANSLATIONS = r1
                io.netty.handler.codec.http2.Http2Headers$PseudoHeaderName r2 = io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName.AUTHORITY
                io.netty.util.AsciiString r2 = r2.value()
                io.netty.util.AsciiString r3 = io.netty.handler.codec.http.HttpHeaderNames.HOST
                r1.add(r2, r3)
                io.netty.handler.codec.http2.Http2Headers$PseudoHeaderName r2 = io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName.SCHEME
                io.netty.util.AsciiString r2 = r2.value()
                io.netty.handler.codec.http2.HttpConversionUtil$ExtensionHeaderNames r3 = io.netty.handler.codec.http2.HttpConversionUtil.ExtensionHeaderNames.SCHEME
                io.netty.util.AsciiString r3 = r3.text()
                r1.add(r2, r3)
                r0.add(r1)
                io.netty.handler.codec.http2.Http2Headers$PseudoHeaderName r0 = io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName.PATH
                io.netty.util.AsciiString r0 = r0.value()
                io.netty.handler.codec.http2.HttpConversionUtil$ExtensionHeaderNames r2 = io.netty.handler.codec.http2.HttpConversionUtil.ExtensionHeaderNames.PATH
                io.netty.util.AsciiString r2 = r2.text()
                r1.add(r0, r2)
                return
        }

        Http2ToHttpHeaderTranslator(int r1, io.netty.handler.codec.http.HttpHeaders r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.streamId = r1
                r0.output = r2
                if (r3 == 0) goto Lc
                io.netty.handler.codec.http2.CharSequenceMap<io.netty.util.AsciiString> r1 = io.netty.handler.codec.http2.HttpConversionUtil.Http2ToHttpHeaderTranslator.REQUEST_HEADER_TRANSLATIONS
                goto Le
            Lc:
                io.netty.handler.codec.http2.CharSequenceMap<io.netty.util.AsciiString> r1 = io.netty.handler.codec.http2.HttpConversionUtil.Http2ToHttpHeaderTranslator.RESPONSE_HEADER_TRANSLATIONS
            Le:
                r0.translations = r1
                return
        }

        private void translateHeader(java.util.Map.Entry<java.lang.CharSequence, java.lang.CharSequence> r1) throws io.netty.handler.codec.http2.Http2Exception {
                r0 = this;
                return
        }

        public void translateHeaders(java.lang.Iterable<java.util.Map.Entry<java.lang.CharSequence, java.lang.CharSequence>> r7) throws io.netty.handler.codec.http2.Http2Exception {
                r6 = this;
                java.util.Iterator r7 = r7.iterator()
                r0 = 0
            L5:
                boolean r1 = r7.hasNext()
                if (r1 == 0) goto L7e
                java.lang.Object r1 = r7.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                java.lang.Object r1 = r1.getValue()
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                io.netty.handler.codec.http2.CharSequenceMap<io.netty.util.AsciiString> r3 = r6.translations
                java.lang.Object r3 = r3.get(r2)
                io.netty.util.AsciiString r3 = (io.netty.util.AsciiString) r3
                if (r3 == 0) goto L31
                io.netty.handler.codec.http.HttpHeaders r2 = r6.output
                io.netty.util.AsciiString r1 = io.netty.util.AsciiString.of(r1)
                r2.add(r3, r1)
                goto L5
            L31:
                boolean r3 = io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName.isPseudoHeader(r2)
                if (r3 != 0) goto L5
                int r3 = r2.length()
                r4 = 0
                if (r3 == 0) goto L6e
                char r3 = r2.charAt(r4)
                r5 = 58
                if (r3 == r5) goto L6e
                io.netty.util.AsciiString r3 = io.netty.handler.codec.http.HttpHeaderNames.COOKIE
                boolean r3 = r3.equals(r2)
                if (r3 == 0) goto L68
                if (r0 != 0) goto L59
                io.netty.util.internal.InternalThreadLocalMap r0 = io.netty.util.internal.InternalThreadLocalMap.get()
                java.lang.StringBuilder r0 = r0.stringBuilder()
                goto L64
            L59:
                int r2 = r0.length()
                if (r2 <= 0) goto L64
                java.lang.String r2 = "; "
                r0.append(r2)
            L64:
                r0.append(r1)
                goto L5
            L68:
                io.netty.handler.codec.http.HttpHeaders r3 = r6.output
                r3.add(r2, r1)
                goto L5
            L6e:
                int r7 = r6.streamId
                io.netty.handler.codec.http2.Http2Error r0 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r4] = r2
                java.lang.String r2 = "Invalid HTTP/2 header '%s' encountered in translation to HTTP/1.x"
                io.netty.handler.codec.http2.Http2Exception r7 = io.netty.handler.codec.http2.Http2Exception.streamError(r7, r0, r2, r1)
                throw r7
            L7e:
                if (r0 == 0) goto L8b
                io.netty.handler.codec.http.HttpHeaders r7 = r6.output
                io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.COOKIE
                java.lang.String r0 = r0.toString()
                r7.add(r1, r0)
            L8b:
                return
        }
    }

    static {
            io.netty.handler.codec.http2.CharSequenceMap r0 = new io.netty.handler.codec.http2.CharSequenceMap
            r0.<init>()
            io.netty.handler.codec.http2.HttpConversionUtil.HTTP_TO_HTTP2_HEADER_BLACKLIST = r0
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.CONNECTION
            io.netty.util.AsciiString r2 = io.netty.util.AsciiString.EMPTY_STRING
            r0.add(r1, r2)
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.KEEP_ALIVE
            r0.add(r1, r2)
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.PROXY_CONNECTION
            r0.add(r1, r2)
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.TRANSFER_ENCODING
            r0.add(r1, r2)
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.HOST
            r0.add(r1, r2)
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.UPGRADE
            r0.add(r1, r2)
            io.netty.handler.codec.http2.HttpConversionUtil$ExtensionHeaderNames r1 = io.netty.handler.codec.http2.HttpConversionUtil.ExtensionHeaderNames.STREAM_ID
            io.netty.util.AsciiString r1 = r1.text()
            r0.add(r1, r2)
            io.netty.handler.codec.http2.HttpConversionUtil$ExtensionHeaderNames r1 = io.netty.handler.codec.http2.HttpConversionUtil.ExtensionHeaderNames.SCHEME
            io.netty.util.AsciiString r1 = r1.text()
            r0.add(r1, r2)
            io.netty.handler.codec.http2.HttpConversionUtil$ExtensionHeaderNames r1 = io.netty.handler.codec.http2.HttpConversionUtil.ExtensionHeaderNames.PATH
            io.netty.util.AsciiString r1 = r1.text()
            r0.add(r1, r2)
            io.netty.handler.codec.http.HttpMethod r0 = io.netty.handler.codec.http.HttpMethod.OPTIONS
            io.netty.handler.codec.http2.HttpConversionUtil.OUT_OF_MESSAGE_SEQUENCE_METHOD = r0
            io.netty.handler.codec.http.HttpResponseStatus r0 = io.netty.handler.codec.http.HttpResponseStatus.OK
            io.netty.handler.codec.http2.HttpConversionUtil.OUT_OF_MESSAGE_SEQUENCE_RETURN_CODE = r0
            java.lang.String r0 = "/"
            io.netty.util.AsciiString r0 = io.netty.util.AsciiString.cached(r0)
            io.netty.handler.codec.http2.HttpConversionUtil.EMPTY_REQUEST_PATH = r0
            return
    }

    private HttpConversionUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void addHttp2ToHttpHeaders(int r7, io.netty.handler.codec.http2.Http2Headers r8, io.netty.handler.codec.http.FullHttpMessage r9, boolean r10) throws io.netty.handler.codec.http2.Http2Exception {
            if (r10 == 0) goto L8
            io.netty.handler.codec.http.HttpHeaders r0 = r9.trailingHeaders()
        L6:
            r3 = r0
            goto Ld
        L8:
            io.netty.handler.codec.http.HttpHeaders r0 = r9.headers()
            goto L6
        Ld:
            io.netty.handler.codec.http.HttpVersion r4 = r9.protocolVersion()
            boolean r6 = r9 instanceof io.netty.handler.codec.http.HttpRequest
            r1 = r7
            r2 = r8
            r5 = r10
            addHttp2ToHttpHeaders(r1, r2, r3, r4, r5, r6)
            return
    }

    public static void addHttp2ToHttpHeaders(int r1, io.netty.handler.codec.http2.Http2Headers r2, io.netty.handler.codec.http.HttpHeaders r3, io.netty.handler.codec.http.HttpVersion r4, boolean r5, boolean r6) throws io.netty.handler.codec.http2.Http2Exception {
            io.netty.handler.codec.http2.HttpConversionUtil$Http2ToHttpHeaderTranslator r0 = new io.netty.handler.codec.http2.HttpConversionUtil$Http2ToHttpHeaderTranslator
            r0.<init>(r1, r3, r6)
            r0.translateHeaders(r2)     // Catch: java.lang.Throwable -> L22 io.netty.handler.codec.http2.Http2Exception -> L2f
            io.netty.util.AsciiString r2 = io.netty.handler.codec.http.HttpHeaderNames.TRANSFER_ENCODING
            r3.remove(r2)
            io.netty.util.AsciiString r2 = io.netty.handler.codec.http.HttpHeaderNames.TRAILER
            r3.remove(r2)
            if (r5 != 0) goto L21
            io.netty.handler.codec.http2.HttpConversionUtil$ExtensionHeaderNames r2 = io.netty.handler.codec.http2.HttpConversionUtil.ExtensionHeaderNames.STREAM_ID
            io.netty.util.AsciiString r2 = r2.text()
            r3.setInt(r2, r1)
            r1 = 1
            io.netty.handler.codec.http.HttpUtil.setKeepAlive(r3, r4, r1)
        L21:
            return
        L22:
            r2 = move-exception
            io.netty.handler.codec.http2.Http2Error r3 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "HTTP/2 to HTTP/1.x headers conversion error"
            io.netty.handler.codec.http2.Http2Exception r1 = io.netty.handler.codec.http2.Http2Exception.streamError(r1, r3, r2, r5, r4)
            throw r1
        L2f:
            r1 = move-exception
            throw r1
    }

    public static io.netty.handler.codec.http.HttpResponseStatus parseStatus(java.lang.CharSequence r6) throws io.netty.handler.codec.http2.Http2Exception {
            r0 = 0
            r1 = 1
            io.netty.handler.codec.http.HttpResponseStatus r2 = io.netty.handler.codec.http.HttpResponseStatus.parseLine(r6)     // Catch: java.lang.Throwable -> L20 io.netty.handler.codec.http2.Http2Exception -> L2e
            io.netty.handler.codec.http.HttpResponseStatus r3 = io.netty.handler.codec.http.HttpResponseStatus.SWITCHING_PROTOCOLS     // Catch: java.lang.Throwable -> L20 io.netty.handler.codec.http2.Http2Exception -> L2e
            if (r2 == r3) goto Lb
            return r2
        Lb:
            io.netty.handler.codec.http2.Http2Error r3 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR     // Catch: java.lang.Throwable -> L20 io.netty.handler.codec.http2.Http2Exception -> L2e
            java.lang.String r4 = "Invalid HTTP/2 status code '%d'"
            int r2 = r2.code()     // Catch: java.lang.Throwable -> L20 io.netty.handler.codec.http2.Http2Exception -> L2e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L20 io.netty.handler.codec.http2.Http2Exception -> L2e
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L20 io.netty.handler.codec.http2.Http2Exception -> L2e
            r5[r0] = r2     // Catch: java.lang.Throwable -> L20 io.netty.handler.codec.http2.Http2Exception -> L2e
            io.netty.handler.codec.http2.Http2Exception r2 = io.netty.handler.codec.http2.Http2Exception.connectionError(r3, r4, r5)     // Catch: java.lang.Throwable -> L20 io.netty.handler.codec.http2.Http2Exception -> L2e
            throw r2     // Catch: java.lang.Throwable -> L20 io.netty.handler.codec.http2.Http2Exception -> L2e
        L20:
            r2 = move-exception
            io.netty.handler.codec.http2.Http2Error r3 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r6
            java.lang.String r6 = "Unrecognized HTTP status code '%s' encountered in translation to HTTP/1.x"
            io.netty.handler.codec.http2.Http2Exception r6 = io.netty.handler.codec.http2.Http2Exception.connectionError(r3, r2, r6, r1)
            throw r6
        L2e:
            r6 = move-exception
            throw r6
    }

    static void setHttp2Authority(java.lang.String r3, io.netty.handler.codec.http2.Http2Headers r4) {
            if (r3 == 0) goto L3d
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto Le
            io.netty.util.AsciiString r3 = io.netty.util.AsciiString.EMPTY_STRING
            r4.authority(r3)
            return
        Le:
            r0 = 64
            int r0 = r3.indexOf(r0)
            int r0 = r0 + 1
            int r1 = r3.length()
            int r1 = r1 - r0
            if (r1 == 0) goto L26
            io.netty.util.AsciiString r2 = new io.netty.util.AsciiString
            r2.<init>(r3, r0, r1)
            r4.authority(r2)
            return
        L26:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "authority: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L3d:
            return
    }

    private static void setHttp2Scheme(io.netty.handler.codec.http.HttpHeaders r2, java.net.URI r3, io.netty.handler.codec.http2.Http2Headers r4) {
            java.lang.String r0 = r3.getScheme()
            if (r0 == 0) goto Lf
            io.netty.util.AsciiString r2 = new io.netty.util.AsciiString
            r2.<init>(r0)
            r4.scheme(r2)
            return
        Lf:
            io.netty.handler.codec.http2.HttpConversionUtil$ExtensionHeaderNames r0 = io.netty.handler.codec.http2.HttpConversionUtil.ExtensionHeaderNames.SCHEME
            io.netty.util.AsciiString r0 = r0.text()
            java.lang.String r2 = r2.get(r0)
            if (r2 == 0) goto L23
            io.netty.util.AsciiString r2 = io.netty.util.AsciiString.of(r2)
            r4.scheme(r2)
            return
        L23:
            int r2 = r3.getPort()
            io.netty.handler.codec.http.HttpScheme r0 = io.netty.handler.codec.http.HttpScheme.HTTPS
            int r1 = r0.port()
            if (r2 != r1) goto L37
            io.netty.util.AsciiString r2 = r0.name()
            r4.scheme(r2)
            return
        L37:
            int r2 = r3.getPort()
            io.netty.handler.codec.http.HttpScheme r3 = io.netty.handler.codec.http.HttpScheme.HTTP
            int r0 = r3.port()
            if (r2 != r0) goto L4b
            io.netty.util.AsciiString r2 = r3.name()
            r4.scheme(r2)
            return
        L4b:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = ":scheme must be specified. see https://tools.ietf.org/html/rfc7540#section-8.1.2.3"
            r2.<init>(r3)
            throw r2
    }

    public static io.netty.handler.codec.http.FullHttpRequest toFullHttpRequest(int r8, io.netty.handler.codec.http2.Http2Headers r9, io.netty.buffer.ByteBufAllocator r10, boolean r11) throws io.netty.handler.codec.http2.Http2Exception {
            java.lang.CharSequence r0 = r9.method()
            java.lang.String r1 = "method header cannot be null in conversion to HTTP/1.x"
            java.lang.Object r0 = io.netty.util.internal.ObjectUtil.checkNotNull(r0, r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.CharSequence r1 = r9.path()
            java.lang.String r2 = "path header cannot be null in conversion to HTTP/1.x"
            java.lang.Object r1 = io.netty.util.internal.ObjectUtil.checkNotNull(r1, r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            io.netty.handler.codec.http.DefaultFullHttpRequest r2 = new io.netty.handler.codec.http.DefaultFullHttpRequest
            io.netty.handler.codec.http.HttpVersion r3 = io.netty.handler.codec.http.HttpVersion.HTTP_1_1
            java.lang.String r0 = r0.toString()
            io.netty.handler.codec.http.HttpMethod r4 = io.netty.handler.codec.http.HttpMethod.valueOf(r0)
            java.lang.String r5 = r1.toString()
            io.netty.buffer.ByteBuf r6 = r10.buffer()
            r7 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            r10 = 0
            addHttp2ToHttpHeaders(r8, r9, r2, r10)     // Catch: java.lang.Throwable -> L35 io.netty.handler.codec.http2.Http2Exception -> L45
            return r2
        L35:
            r0 = move-exception
            r9 = r0
            r2.release()
            io.netty.handler.codec.http2.Http2Error r11 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
            java.lang.String r0 = "HTTP/2 to HTTP/1.x headers conversion error"
            java.lang.Object[] r10 = new java.lang.Object[r10]
            io.netty.handler.codec.http2.Http2Exception r8 = io.netty.handler.codec.http2.Http2Exception.streamError(r8, r11, r9, r0, r10)
            throw r8
        L45:
            r0 = move-exception
            r8 = r0
            r2.release()
            throw r8
    }

    public static io.netty.handler.codec.http.FullHttpResponse toFullHttpResponse(int r3, io.netty.handler.codec.http2.Http2Headers r4, io.netty.buffer.ByteBufAllocator r5, boolean r6) throws io.netty.handler.codec.http2.Http2Exception {
            java.lang.CharSequence r0 = r4.status()
            io.netty.handler.codec.http.HttpResponseStatus r0 = parseStatus(r0)
            io.netty.handler.codec.http.DefaultFullHttpResponse r1 = new io.netty.handler.codec.http.DefaultFullHttpResponse
            io.netty.handler.codec.http.HttpVersion r2 = io.netty.handler.codec.http.HttpVersion.HTTP_1_1
            io.netty.buffer.ByteBuf r5 = r5.buffer()
            r1.<init>(r2, r0, r5, r6)
            r5 = 0
            addHttp2ToHttpHeaders(r3, r4, r1, r5)     // Catch: java.lang.Throwable -> L18 io.netty.handler.codec.http2.Http2Exception -> L27
            return r1
        L18:
            r4 = move-exception
            r1.release()
            io.netty.handler.codec.http2.Http2Error r6 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
            java.lang.String r0 = "HTTP/2 to HTTP/1.x headers conversion error"
            java.lang.Object[] r5 = new java.lang.Object[r5]
            io.netty.handler.codec.http2.Http2Exception r3 = io.netty.handler.codec.http2.Http2Exception.streamError(r3, r6, r4, r0, r5)
            throw r3
        L27:
            r3 = move-exception
            r1.release()
            throw r3
    }

    public static io.netty.handler.codec.http2.Http2Headers toHttp2Headers(io.netty.handler.codec.http.HttpHeaders r2, boolean r3) {
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L9
            io.netty.handler.codec.http2.EmptyHttp2Headers r2 = io.netty.handler.codec.http2.EmptyHttp2Headers.INSTANCE
            return r2
        L9:
            io.netty.handler.codec.http2.DefaultHttp2Headers r0 = new io.netty.handler.codec.http2.DefaultHttp2Headers
            int r1 = r2.size()
            r0.<init>(r3, r1)
            toHttp2Headers(r2, r0)
            return r0
    }

    public static io.netty.handler.codec.http2.Http2Headers toHttp2Headers(io.netty.handler.codec.http.HttpMessage r3, boolean r4) {
            io.netty.handler.codec.http.HttpHeaders r0 = r3.headers()
            io.netty.handler.codec.http2.DefaultHttp2Headers r1 = new io.netty.handler.codec.http2.DefaultHttp2Headers
            int r2 = r0.size()
            r1.<init>(r4, r2)
            boolean r4 = r3 instanceof io.netty.handler.codec.http.HttpRequest
            if (r4 == 0) goto L52
            io.netty.handler.codec.http.HttpRequest r3 = (io.netty.handler.codec.http.HttpRequest) r3
            java.lang.String r4 = r3.uri()
            java.net.URI r4 = java.net.URI.create(r4)
            io.netty.util.AsciiString r2 = toHttp2Path(r4)
            r1.path(r2)
            io.netty.handler.codec.http.HttpMethod r3 = r3.method()
            io.netty.util.AsciiString r3 = r3.asciiName()
            r1.method(r3)
            setHttp2Scheme(r0, r4, r1)
            boolean r3 = io.netty.handler.codec.http.HttpUtil.isOriginForm(r4)
            if (r3 != 0) goto L63
            boolean r3 = io.netty.handler.codec.http.HttpUtil.isAsteriskForm(r4)
            if (r3 != 0) goto L63
            io.netty.util.AsciiString r3 = io.netty.handler.codec.http.HttpHeaderNames.HOST
            java.lang.String r3 = r0.getAsString(r3)
            if (r3 == 0) goto L4a
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L4e
        L4a:
            java.lang.String r3 = r4.getAuthority()
        L4e:
            setHttp2Authority(r3, r1)
            goto L63
        L52:
            boolean r4 = r3 instanceof io.netty.handler.codec.http.HttpResponse
            if (r4 == 0) goto L63
            io.netty.handler.codec.http.HttpResponse r3 = (io.netty.handler.codec.http.HttpResponse) r3
            io.netty.handler.codec.http.HttpResponseStatus r3 = r3.status()
            io.netty.util.AsciiString r3 = r3.codeAsText()
            r1.status(r3)
        L63:
            toHttp2Headers(r0, r1)
            return r1
    }

    public static void toHttp2Headers(io.netty.handler.codec.http.HttpHeaders r8, io.netty.handler.codec.http2.Http2Headers r9) {
            java.util.Iterator r0 = r8.iteratorCharSequence()
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.CONNECTION
            java.util.Iterator r8 = r8.valueCharSequenceIterator(r1)
            r1 = 8
            io.netty.handler.codec.http2.CharSequenceMap r8 = toLowercaseMap(r8, r1)
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lbe
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            io.netty.util.AsciiString r2 = io.netty.util.AsciiString.of(r2)
            io.netty.util.AsciiString r2 = r2.toLowerCase()
            io.netty.handler.codec.http2.CharSequenceMap<io.netty.util.AsciiString> r3 = io.netty.handler.codec.http2.HttpConversionUtil.HTTP_TO_HTTP2_HEADER_BLACKLIST
            boolean r3 = r3.contains(r2)
            if (r3 != 0) goto L10
            boolean r3 = r8.contains(r2)
            if (r3 != 0) goto L10
            io.netty.util.AsciiString r3 = io.netty.handler.codec.http.HttpHeaderNames.TE
            boolean r3 = r2.contentEqualsIgnoreCase(r3)
            if (r3 == 0) goto L44
            toHttp2HeadersFilterTE(r1, r9)
            goto L10
        L44:
            io.netty.util.AsciiString r3 = io.netty.handler.codec.http.HttpHeaderNames.COOKIE
            boolean r4 = r2.contentEqualsIgnoreCase(r3)
            if (r4 == 0) goto Lb5
            java.lang.Object r1 = r1.getValue()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            io.netty.util.AsciiString r1 = io.netty.util.AsciiString.of(r1)
            io.netty.util.ByteProcessor r2 = io.netty.util.ByteProcessor.FIND_SEMI_COLON     // Catch: java.lang.Exception -> Lae
            int r2 = r1.forEachByte(r2)     // Catch: java.lang.Exception -> Lae
            r4 = -1
            if (r2 == r4) goto La9
            r3 = 0
            r5 = 0
        L61:
            io.netty.util.AsciiString r6 = io.netty.handler.codec.http.HttpHeaderNames.COOKIE     // Catch: java.lang.Exception -> Lae
            io.netty.util.AsciiString r5 = r1.subSequence(r5, r2, r3)     // Catch: java.lang.Exception -> Lae
            r9.add(r6, r5)     // Catch: java.lang.Exception -> Lae
            int r5 = r2 + 2
            int r2 = r1.length()     // Catch: java.lang.Exception -> Lae
            if (r5 >= r2) goto L7f
            int r2 = r1.length()     // Catch: java.lang.Exception -> Lae
            int r2 = r2 - r5
            io.netty.util.ByteProcessor r7 = io.netty.util.ByteProcessor.FIND_SEMI_COLON     // Catch: java.lang.Exception -> Lae
            int r2 = r1.forEachByte(r5, r2, r7)     // Catch: java.lang.Exception -> Lae
            if (r2 != r4) goto L61
        L7f:
            int r2 = r1.length()     // Catch: java.lang.Exception -> Lae
            if (r5 >= r2) goto L92
            int r2 = r1.length()     // Catch: java.lang.Exception -> Lae
            io.netty.util.AsciiString r1 = r1.subSequence(r5, r2, r3)     // Catch: java.lang.Exception -> Lae
            r9.add(r6, r1)     // Catch: java.lang.Exception -> Lae
            goto L10
        L92:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch: java.lang.Exception -> Lae
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lae
            r9.<init>()     // Catch: java.lang.Exception -> Lae
            java.lang.String r0 = "cookie value is of unexpected format: "
            r9.append(r0)     // Catch: java.lang.Exception -> Lae
            r9.append(r1)     // Catch: java.lang.Exception -> Lae
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Exception -> Lae
            r8.<init>(r9)     // Catch: java.lang.Exception -> Lae
            throw r8     // Catch: java.lang.Exception -> Lae
        La9:
            r9.add(r3, r1)     // Catch: java.lang.Exception -> Lae
            goto L10
        Lae:
            r8 = move-exception
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r8)
            throw r9
        Lb5:
            java.lang.Object r1 = r1.getValue()
            r9.add(r2, r1)
            goto L10
        Lbe:
            return
    }

    private static void toHttp2HeadersFilterTE(java.util.Map.Entry<java.lang.CharSequence, java.lang.CharSequence> r3, io.netty.handler.codec.http2.Http2Headers r4) {
            java.lang.Object r0 = r3.getValue()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1 = 44
            r2 = 0
            int r0 = io.netty.util.AsciiString.indexOf(r0, r1, r2)
            r1 = -1
            if (r0 != r1) goto L28
            java.lang.Object r3 = r3.getValue()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.CharSequence r3 = io.netty.util.AsciiString.trim(r3)
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderValues.TRAILERS
            boolean r3 = io.netty.util.AsciiString.contentEqualsIgnoreCase(r3, r0)
            if (r3 == 0) goto L53
            io.netty.util.AsciiString r3 = io.netty.handler.codec.http.HttpHeaderNames.TE
            r4.add(r3, r0)
            return
        L28:
            java.lang.Object r3 = r3.getValue()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.util.List r3 = io.netty.util.internal.StringUtil.unescapeCsvFields(r3)
            java.util.Iterator r3 = r3.iterator()
        L36:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L53
            java.lang.Object r0 = r3.next()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.CharSequence r0 = io.netty.util.AsciiString.trim(r0)
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderValues.TRAILERS
            boolean r0 = io.netty.util.AsciiString.contentEqualsIgnoreCase(r0, r1)
            if (r0 == 0) goto L36
            io.netty.util.AsciiString r3 = io.netty.handler.codec.http.HttpHeaderNames.TE
            r4.add(r3, r1)
        L53:
            return
    }

    private static io.netty.util.AsciiString toHttp2Path(java.net.URI r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = r3.getRawPath()
            int r1 = io.netty.util.internal.StringUtil.length(r1)
            java.lang.String r2 = r3.getRawQuery()
            int r2 = io.netty.util.internal.StringUtil.length(r2)
            int r1 = r1 + r2
            java.lang.String r2 = r3.getRawFragment()
            int r2 = io.netty.util.internal.StringUtil.length(r2)
            int r1 = r1 + r2
            int r1 = r1 + 2
            r0.<init>(r1)
            java.lang.String r1 = r3.getRawPath()
            boolean r1 = io.netty.util.internal.StringUtil.isNullOrEmpty(r1)
            if (r1 != 0) goto L32
            java.lang.String r1 = r3.getRawPath()
            r0.append(r1)
        L32:
            java.lang.String r1 = r3.getRawQuery()
            boolean r1 = io.netty.util.internal.StringUtil.isNullOrEmpty(r1)
            if (r1 != 0) goto L48
            r1 = 63
            r0.append(r1)
            java.lang.String r1 = r3.getRawQuery()
            r0.append(r1)
        L48:
            java.lang.String r1 = r3.getRawFragment()
            boolean r1 = io.netty.util.internal.StringUtil.isNullOrEmpty(r1)
            if (r1 != 0) goto L5e
            r1 = 35
            r0.append(r1)
            java.lang.String r3 = r3.getRawFragment()
            r0.append(r3)
        L5e:
            java.lang.String r3 = r0.toString()
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L6b
            io.netty.util.AsciiString r3 = io.netty.handler.codec.http2.HttpConversionUtil.EMPTY_REQUEST_PATH
            return r3
        L6b:
            io.netty.util.AsciiString r0 = new io.netty.util.AsciiString
            r0.<init>(r3)
            return r0
    }

    public static io.netty.handler.codec.http.HttpRequest toHttpRequest(int r10, io.netty.handler.codec.http2.Http2Headers r11, boolean r12) throws io.netty.handler.codec.http2.Http2Exception {
            java.lang.CharSequence r0 = r11.method()
            java.lang.String r1 = "method header cannot be null in conversion to HTTP/1.x"
            java.lang.Object r0 = io.netty.util.internal.ObjectUtil.checkNotNull(r0, r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.CharSequence r1 = r11.path()
            java.lang.String r2 = "path header cannot be null in conversion to HTTP/1.x"
            java.lang.Object r1 = io.netty.util.internal.ObjectUtil.checkNotNull(r1, r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            io.netty.handler.codec.http.DefaultHttpRequest r2 = new io.netty.handler.codec.http.DefaultHttpRequest
            io.netty.handler.codec.http.HttpVersion r3 = io.netty.handler.codec.http.HttpVersion.HTTP_1_1
            java.lang.String r0 = r0.toString()
            io.netty.handler.codec.http.HttpMethod r0 = io.netty.handler.codec.http.HttpMethod.valueOf(r0)
            java.lang.String r1 = r1.toString()
            r2.<init>(r3, r0, r1, r12)
            io.netty.handler.codec.http.HttpHeaders r6 = r2.headers()     // Catch: java.lang.Throwable -> L3e io.netty.handler.codec.http2.Http2Exception -> L4d
            io.netty.handler.codec.http.HttpVersion r7 = r2.protocolVersion()     // Catch: java.lang.Throwable -> L3e io.netty.handler.codec.http2.Http2Exception -> L4d
            r8 = 0
            r9 = 1
            r4 = r10
            r5 = r11
            addHttp2ToHttpHeaders(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L3b io.netty.handler.codec.http2.Http2Exception -> L4d
            return r2
        L3b:
            r0 = move-exception
        L3c:
            r10 = r0
            goto L41
        L3e:
            r0 = move-exception
            r4 = r10
            goto L3c
        L41:
            io.netty.handler.codec.http2.Http2Error r11 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
            r12 = 0
            java.lang.Object[] r12 = new java.lang.Object[r12]
            java.lang.String r0 = "HTTP/2 to HTTP/1.x headers conversion error"
            io.netty.handler.codec.http2.Http2Exception r10 = io.netty.handler.codec.http2.Http2Exception.streamError(r4, r11, r10, r0, r12)
            throw r10
        L4d:
            r0 = move-exception
            r10 = r0
            throw r10
    }

    public static io.netty.handler.codec.http.HttpResponse toHttpResponse(int r9, io.netty.handler.codec.http2.Http2Headers r10, boolean r11) throws io.netty.handler.codec.http2.Http2Exception {
            java.lang.CharSequence r0 = r10.status()
            io.netty.handler.codec.http.HttpResponseStatus r0 = parseStatus(r0)
            io.netty.handler.codec.http.DefaultHttpResponse r1 = new io.netty.handler.codec.http.DefaultHttpResponse
            io.netty.handler.codec.http.HttpVersion r2 = io.netty.handler.codec.http.HttpVersion.HTTP_1_1
            r1.<init>(r2, r0, r11)
            io.netty.handler.codec.http.HttpHeaders r5 = r1.headers()     // Catch: java.lang.Throwable -> L22 io.netty.handler.codec.http2.Http2Exception -> L31
            io.netty.handler.codec.http.HttpVersion r6 = r1.protocolVersion()     // Catch: java.lang.Throwable -> L22 io.netty.handler.codec.http2.Http2Exception -> L31
            r7 = 0
            r8 = 1
            r3 = r9
            r4 = r10
            addHttp2ToHttpHeaders(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L1f io.netty.handler.codec.http2.Http2Exception -> L31
            return r1
        L1f:
            r0 = move-exception
        L20:
            r9 = r0
            goto L25
        L22:
            r0 = move-exception
            r3 = r9
            goto L20
        L25:
            io.netty.handler.codec.http2.Http2Error r10 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
            r11 = 0
            java.lang.Object[] r11 = new java.lang.Object[r11]
            java.lang.String r0 = "HTTP/2 to HTTP/1.x headers conversion error"
            io.netty.handler.codec.http2.Http2Exception r9 = io.netty.handler.codec.http2.Http2Exception.streamError(r3, r10, r9, r0, r11)
            throw r9
        L31:
            r0 = move-exception
            r9 = r0
            throw r9
    }

    private static io.netty.handler.codec.http2.CharSequenceMap<io.netty.util.AsciiString> toLowercaseMap(java.util.Iterator<? extends java.lang.CharSequence> r7, int r8) {
            io.netty.handler.codec.UnsupportedValueConverter r0 = io.netty.handler.codec.UnsupportedValueConverter.instance()
            io.netty.handler.codec.http2.CharSequenceMap r1 = new io.netty.handler.codec.http2.CharSequenceMap
            r2 = 1
            r1.<init>(r2, r0, r8)
        La:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L6c
            java.lang.Object r8 = r7.next()
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            io.netty.util.AsciiString r8 = io.netty.util.AsciiString.of(r8)
            io.netty.util.AsciiString r8 = r8.toLowerCase()
            io.netty.util.ByteProcessor r0 = io.netty.util.ByteProcessor.FIND_COMMA     // Catch: java.lang.Exception -> L65
            int r0 = r8.forEachByte(r0)     // Catch: java.lang.Exception -> L65
            r2 = -1
            if (r0 == r2) goto L5b
            r3 = 0
            r4 = 0
        L29:
            io.netty.util.AsciiString r4 = r8.subSequence(r4, r0, r3)     // Catch: java.lang.Exception -> L65
            io.netty.util.AsciiString r4 = r4.trim()     // Catch: java.lang.Exception -> L65
            io.netty.util.AsciiString r5 = io.netty.util.AsciiString.EMPTY_STRING     // Catch: java.lang.Exception -> L65
            r1.add(r4, r5)     // Catch: java.lang.Exception -> L65
            int r4 = r0 + 1
            int r0 = r8.length()     // Catch: java.lang.Exception -> L65
            if (r4 >= r0) goto L4b
            int r0 = r8.length()     // Catch: java.lang.Exception -> L65
            int r0 = r0 - r4
            io.netty.util.ByteProcessor r6 = io.netty.util.ByteProcessor.FIND_COMMA     // Catch: java.lang.Exception -> L65
            int r0 = r8.forEachByte(r4, r0, r6)     // Catch: java.lang.Exception -> L65
            if (r0 != r2) goto L29
        L4b:
            int r0 = r8.length()     // Catch: java.lang.Exception -> L65
            io.netty.util.AsciiString r8 = r8.subSequence(r4, r0, r3)     // Catch: java.lang.Exception -> L65
            io.netty.util.AsciiString r8 = r8.trim()     // Catch: java.lang.Exception -> L65
            r1.add(r8, r5)     // Catch: java.lang.Exception -> L65
            goto La
        L5b:
            io.netty.util.AsciiString r8 = r8.trim()     // Catch: java.lang.Exception -> L65
            io.netty.util.AsciiString r0 = io.netty.util.AsciiString.EMPTY_STRING     // Catch: java.lang.Exception -> L65
            r1.add(r8, r0)     // Catch: java.lang.Exception -> L65
            goto La
        L65:
            r7 = move-exception
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r7)
            throw r8
        L6c:
            return r1
    }
}
