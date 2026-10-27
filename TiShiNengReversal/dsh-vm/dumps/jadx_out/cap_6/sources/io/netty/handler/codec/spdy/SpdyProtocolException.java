package io.netty.handler.codec.spdy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class SpdyProtocolException extends java.lang.Exception {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final long serialVersionUID = 7870000537743847264L;

    static {
            return
    }

    public SpdyProtocolException() {
            r0 = this;
            r0.<init>()
            return
    }

    public SpdyProtocolException(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public SpdyProtocolException(java.lang.String r1, java.lang.Throwable r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @io.netty.util.internal.SuppressJava6Requirement(reason = "uses Java 7+ Exception.<init>(String, Throwable, boolean, boolean) but is guarded by version checks")
    private SpdyProtocolException(java.lang.String r3, boolean r4) {
            r2 = this;
            r4 = 0
            r0 = 1
            r1 = 0
            r2.<init>(r3, r1, r4, r0)
            return
    }

    public SpdyProtocolException(java.lang.Throwable r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    static io.netty.handler.codec.spdy.SpdyProtocolException newStatic(java.lang.String r2) {
            int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
            r1 = 7
            if (r0 < r1) goto Le
            io.netty.handler.codec.spdy.SpdyProtocolException r0 = new io.netty.handler.codec.spdy.SpdyProtocolException
            r1 = 1
            r0.<init>(r2, r1)
            return r0
        Le:
            io.netty.handler.codec.spdy.SpdyProtocolException r0 = new io.netty.handler.codec.spdy.SpdyProtocolException
            r0.<init>(r2)
            return r0
    }
}
