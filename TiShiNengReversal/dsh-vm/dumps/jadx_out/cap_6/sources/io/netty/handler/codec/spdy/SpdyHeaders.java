package io.netty.handler.codec.spdy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface SpdyHeaders extends io.netty.handler.codec.Headers<java.lang.CharSequence, java.lang.CharSequence, io.netty.handler.codec.spdy.SpdyHeaders> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class HttpNames {
        public static final io.netty.util.AsciiString HOST = null;
        public static final io.netty.util.AsciiString METHOD = null;
        public static final io.netty.util.AsciiString PATH = null;
        public static final io.netty.util.AsciiString SCHEME = null;
        public static final io.netty.util.AsciiString STATUS = null;
        public static final io.netty.util.AsciiString VERSION = null;

        static {
                java.lang.String r0 = ":host"
                io.netty.util.AsciiString r0 = io.netty.util.AsciiString.cached(r0)
                io.netty.handler.codec.spdy.SpdyHeaders.HttpNames.HOST = r0
                java.lang.String r0 = ":method"
                io.netty.util.AsciiString r0 = io.netty.util.AsciiString.cached(r0)
                io.netty.handler.codec.spdy.SpdyHeaders.HttpNames.METHOD = r0
                java.lang.String r0 = ":path"
                io.netty.util.AsciiString r0 = io.netty.util.AsciiString.cached(r0)
                io.netty.handler.codec.spdy.SpdyHeaders.HttpNames.PATH = r0
                java.lang.String r0 = ":scheme"
                io.netty.util.AsciiString r0 = io.netty.util.AsciiString.cached(r0)
                io.netty.handler.codec.spdy.SpdyHeaders.HttpNames.SCHEME = r0
                java.lang.String r0 = ":status"
                io.netty.util.AsciiString r0 = io.netty.util.AsciiString.cached(r0)
                io.netty.handler.codec.spdy.SpdyHeaders.HttpNames.STATUS = r0
                java.lang.String r0 = ":version"
                io.netty.util.AsciiString r0 = io.netty.util.AsciiString.cached(r0)
                io.netty.handler.codec.spdy.SpdyHeaders.HttpNames.VERSION = r0
                return
        }

        private HttpNames() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    boolean contains(java.lang.CharSequence r1, java.lang.CharSequence r2, boolean r3);

    java.util.List<java.lang.String> getAllAsString(java.lang.CharSequence r1);

    java.lang.String getAsString(java.lang.CharSequence r1);

    java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> iteratorAsString();
}
