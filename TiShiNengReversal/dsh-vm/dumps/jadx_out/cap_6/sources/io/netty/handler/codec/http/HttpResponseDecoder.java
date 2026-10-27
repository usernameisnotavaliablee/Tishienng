package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class HttpResponseDecoder extends io.netty.handler.codec.http.HttpObjectDecoder {
    private static final io.netty.handler.codec.http.HttpResponseStatus UNKNOWN_STATUS = null;

    static {
            io.netty.handler.codec.http.HttpResponseStatus r0 = new io.netty.handler.codec.http.HttpResponseStatus
            r1 = 999(0x3e7, float:1.4E-42)
            java.lang.String r2 = "Unknown"
            r0.<init>(r1, r2)
            io.netty.handler.codec.http.HttpResponseDecoder.UNKNOWN_STATUS = r0
            return
    }

    public HttpResponseDecoder() {
            r0 = this;
            r0.<init>()
            return
    }

    public HttpResponseDecoder(int r2, int r3, int r4) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public HttpResponseDecoder(int r7, int r8, int r9, boolean r10) {
            r6 = this;
            r4 = 1
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public HttpResponseDecoder(int r8, int r9, int r10, boolean r11, int r12) {
            r7 = this;
            r4 = 1
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // io.netty.handler.codec.http.HttpObjectDecoder
    protected io.netty.handler.codec.http.HttpMessage createInvalidMessage() {
            r4 = this;
            io.netty.handler.codec.http.DefaultFullHttpResponse r0 = new io.netty.handler.codec.http.DefaultFullHttpResponse
            io.netty.handler.codec.http.HttpVersion r1 = io.netty.handler.codec.http.HttpVersion.HTTP_1_0
            io.netty.handler.codec.http.HttpResponseStatus r2 = io.netty.handler.codec.http.HttpResponseDecoder.UNKNOWN_STATUS
            boolean r3 = r4.validateHeaders
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpObjectDecoder
    protected io.netty.handler.codec.http.HttpMessage createMessage(java.lang.String[] r5) {
            r4 = this;
            io.netty.handler.codec.http.DefaultHttpResponse r0 = new io.netty.handler.codec.http.DefaultHttpResponse
            r1 = 0
            r1 = r5[r1]
            io.netty.handler.codec.http.HttpVersion r1 = io.netty.handler.codec.http.HttpVersion.valueOf(r1)
            r2 = 1
            r2 = r5[r2]
            int r2 = java.lang.Integer.parseInt(r2)
            r3 = 2
            r5 = r5[r3]
            io.netty.handler.codec.http.HttpResponseStatus r5 = io.netty.handler.codec.http.HttpResponseStatus.valueOf(r2, r5)
            boolean r2 = r4.validateHeaders
            r0.<init>(r1, r5, r2)
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpObjectDecoder
    protected boolean isDecodingRequest() {
            r1 = this;
            r0 = 0
            return r0
    }
}
