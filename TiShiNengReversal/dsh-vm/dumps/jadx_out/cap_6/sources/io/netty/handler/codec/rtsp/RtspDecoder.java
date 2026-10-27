package io.netty.handler.codec.rtsp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class RtspDecoder extends io.netty.handler.codec.http.HttpObjectDecoder {
    public static final int DEFAULT_MAX_CONTENT_LENGTH = 8192;
    public static final int DEFAULT_MAX_HEADER_SIZE = 8192;
    public static final int DEFAULT_MAX_INITIAL_LINE_LENGTH = 4096;
    private static final io.netty.handler.codec.http.HttpResponseStatus UNKNOWN_STATUS = null;
    private static final java.util.regex.Pattern versionPattern = null;
    private boolean isDecodingRequest;

    static {
            io.netty.handler.codec.http.HttpResponseStatus r0 = new io.netty.handler.codec.http.HttpResponseStatus
            r1 = 999(0x3e7, float:1.4E-42)
            java.lang.String r2 = "Unknown"
            r0.<init>(r1, r2)
            io.netty.handler.codec.rtsp.RtspDecoder.UNKNOWN_STATUS = r0
            java.lang.String r0 = "RTSP/\\d\\.\\d"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            io.netty.handler.codec.rtsp.RtspDecoder.versionPattern = r0
            return
    }

    public RtspDecoder() {
            r2 = this;
            r0 = 4096(0x1000, float:5.74E-42)
            r1 = 8192(0x2000, float:1.148E-41)
            r2.<init>(r0, r1, r1)
            return
    }

    public RtspDecoder(int r2, int r3, int r4) {
            r1 = this;
            int r4 = r4 * 2
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public RtspDecoder(int r7, int r8, int r9, boolean r10) {
            r6 = this;
            int r3 = r9 * 2
            r4 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // io.netty.handler.codec.http.HttpObjectDecoder
    protected io.netty.handler.codec.http.HttpMessage createInvalidMessage() {
            r5 = this;
            boolean r0 = r5.isDecodingRequest
            if (r0 == 0) goto L12
            io.netty.handler.codec.http.DefaultFullHttpRequest r0 = new io.netty.handler.codec.http.DefaultFullHttpRequest
            io.netty.handler.codec.http.HttpVersion r1 = io.netty.handler.codec.rtsp.RtspVersions.RTSP_1_0
            io.netty.handler.codec.http.HttpMethod r2 = io.netty.handler.codec.rtsp.RtspMethods.OPTIONS
            java.lang.String r3 = "/bad-request"
            boolean r4 = r5.validateHeaders
            r0.<init>(r1, r2, r3, r4)
            return r0
        L12:
            io.netty.handler.codec.http.DefaultFullHttpResponse r0 = new io.netty.handler.codec.http.DefaultFullHttpResponse
            io.netty.handler.codec.http.HttpVersion r1 = io.netty.handler.codec.rtsp.RtspVersions.RTSP_1_0
            io.netty.handler.codec.http.HttpResponseStatus r2 = io.netty.handler.codec.rtsp.RtspDecoder.UNKNOWN_STATUS
            boolean r3 = r5.validateHeaders
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpObjectDecoder
    protected io.netty.handler.codec.http.HttpMessage createMessage(java.lang.String[] r6) throws java.lang.Exception {
            r5 = this;
            java.util.regex.Pattern r0 = io.netty.handler.codec.rtsp.RtspDecoder.versionPattern
            r1 = 0
            r2 = r6[r1]
            java.util.regex.Matcher r0 = r0.matcher(r2)
            boolean r0 = r0.matches()
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L2e
            r5.isDecodingRequest = r1
            io.netty.handler.codec.http.DefaultHttpResponse r0 = new io.netty.handler.codec.http.DefaultHttpResponse
            r1 = r6[r1]
            io.netty.handler.codec.http.HttpVersion r1 = io.netty.handler.codec.rtsp.RtspVersions.valueOf(r1)
            io.netty.handler.codec.http.HttpResponseStatus r4 = new io.netty.handler.codec.http.HttpResponseStatus
            r3 = r6[r3]
            int r3 = java.lang.Integer.parseInt(r3)
            r6 = r6[r2]
            r4.<init>(r3, r6)
            boolean r6 = r5.validateHeaders
            r0.<init>(r1, r4, r6)
            return r0
        L2e:
            r5.isDecodingRequest = r3
            io.netty.handler.codec.http.DefaultHttpRequest r0 = new io.netty.handler.codec.http.DefaultHttpRequest
            r2 = r6[r2]
            io.netty.handler.codec.http.HttpVersion r2 = io.netty.handler.codec.rtsp.RtspVersions.valueOf(r2)
            r1 = r6[r1]
            io.netty.handler.codec.http.HttpMethod r1 = io.netty.handler.codec.rtsp.RtspMethods.valueOf(r1)
            r6 = r6[r3]
            boolean r3 = r5.validateHeaders
            r0.<init>(r2, r1, r6, r3)
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpObjectDecoder
    protected boolean isContentAlwaysEmpty(io.netty.handler.codec.http.HttpMessage r2) {
            r1 = this;
            boolean r0 = super.isContentAlwaysEmpty(r2)
            if (r0 != 0) goto L15
            io.netty.handler.codec.http.HttpHeaders r2 = r2.headers()
            io.netty.util.AsciiString r0 = io.netty.handler.codec.rtsp.RtspHeaderNames.CONTENT_LENGTH
            boolean r2 = r2.contains(r0)
            if (r2 != 0) goto L13
            goto L15
        L13:
            r2 = 0
            return r2
        L15:
            r2 = 1
            return r2
    }

    @Override // io.netty.handler.codec.http.HttpObjectDecoder
    protected boolean isDecodingRequest() {
            r1 = this;
            boolean r0 = r1.isDecodingRequest
            return r0
    }
}
