package io.netty.handler.codec.spdy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class SpdyHttpHeaders {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Names {
        public static final io.netty.util.AsciiString ASSOCIATED_TO_STREAM_ID = null;
        public static final io.netty.util.AsciiString PRIORITY = null;
        public static final io.netty.util.AsciiString SCHEME = null;
        public static final io.netty.util.AsciiString STREAM_ID = null;

        static {
                java.lang.String r0 = "x-spdy-stream-id"
                io.netty.util.AsciiString r0 = io.netty.util.AsciiString.cached(r0)
                io.netty.handler.codec.spdy.SpdyHttpHeaders.Names.STREAM_ID = r0
                java.lang.String r0 = "x-spdy-associated-to-stream-id"
                io.netty.util.AsciiString r0 = io.netty.util.AsciiString.cached(r0)
                io.netty.handler.codec.spdy.SpdyHttpHeaders.Names.ASSOCIATED_TO_STREAM_ID = r0
                java.lang.String r0 = "x-spdy-priority"
                io.netty.util.AsciiString r0 = io.netty.util.AsciiString.cached(r0)
                io.netty.handler.codec.spdy.SpdyHttpHeaders.Names.PRIORITY = r0
                java.lang.String r0 = "x-spdy-scheme"
                io.netty.util.AsciiString r0 = io.netty.util.AsciiString.cached(r0)
                io.netty.handler.codec.spdy.SpdyHttpHeaders.Names.SCHEME = r0
                return
        }

        private Names() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    private SpdyHttpHeaders() {
            r0 = this;
            r0.<init>()
            return
    }
}
