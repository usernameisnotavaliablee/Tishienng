package io.netty.util.internal.logging;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class JdkLoggerFactory extends io.netty.util.internal.logging.InternalLoggerFactory {
    public static final io.netty.util.internal.logging.InternalLoggerFactory INSTANCE = null;

    static {
            io.netty.util.internal.logging.JdkLoggerFactory r0 = new io.netty.util.internal.logging.JdkLoggerFactory
            r0.<init>()
            io.netty.util.internal.logging.JdkLoggerFactory.INSTANCE = r0
            return
    }

    @java.lang.Deprecated
    public JdkLoggerFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.netty.util.internal.logging.InternalLoggerFactory
    public io.netty.util.internal.logging.InternalLogger newInstance(java.lang.String r2) {
            r1 = this;
            io.netty.util.internal.logging.JdkLogger r0 = new io.netty.util.internal.logging.JdkLogger
            java.util.logging.Logger r2 = java.util.logging.Logger.getLogger(r2)
            r0.<init>(r2)
            return r0
    }
}
