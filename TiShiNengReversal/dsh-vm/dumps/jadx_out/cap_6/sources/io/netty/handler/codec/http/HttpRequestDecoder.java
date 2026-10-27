package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class HttpRequestDecoder extends io.netty.handler.codec.http.HttpObjectDecoder {
    public HttpRequestDecoder() {
            r0 = this;
            r0.<init>()
            return
    }

    public HttpRequestDecoder(int r2, int r3, int r4) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public HttpRequestDecoder(int r7, int r8, int r9, boolean r10) {
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

    public HttpRequestDecoder(int r8, int r9, int r10, boolean r11, int r12) {
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
            r5 = this;
            io.netty.handler.codec.http.DefaultFullHttpRequest r0 = new io.netty.handler.codec.http.DefaultFullHttpRequest
            io.netty.handler.codec.http.HttpVersion r1 = io.netty.handler.codec.http.HttpVersion.HTTP_1_0
            io.netty.handler.codec.http.HttpMethod r2 = io.netty.handler.codec.http.HttpMethod.GET
            java.lang.String r3 = "/bad-request"
            boolean r4 = r5.validateHeaders
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpObjectDecoder
    protected io.netty.handler.codec.http.HttpMessage createMessage(java.lang.String[] r5) throws java.lang.Exception {
            r4 = this;
            io.netty.handler.codec.http.DefaultHttpRequest r0 = new io.netty.handler.codec.http.DefaultHttpRequest
            r1 = 2
            r1 = r5[r1]
            io.netty.handler.codec.http.HttpVersion r1 = io.netty.handler.codec.http.HttpVersion.valueOf(r1)
            r2 = 0
            r2 = r5[r2]
            io.netty.handler.codec.http.HttpMethod r2 = io.netty.handler.codec.http.HttpMethod.valueOf(r2)
            r3 = 1
            r5 = r5[r3]
            boolean r3 = r4.validateHeaders
            r0.<init>(r1, r2, r5, r3)
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpObjectDecoder
    protected boolean isDecodingRequest() {
            r1 = this;
            r0 = 1
            return r0
    }
}
