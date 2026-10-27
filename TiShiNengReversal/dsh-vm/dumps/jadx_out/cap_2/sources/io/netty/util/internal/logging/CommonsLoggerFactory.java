package io.netty.util.internal.logging;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class CommonsLoggerFactory extends io.netty.util.internal.logging.InternalLoggerFactory {
    public static final io.netty.util.internal.logging.InternalLoggerFactory INSTANCE = null;

    static {
            io.netty.util.internal.logging.CommonsLoggerFactory r0 = new io.netty.util.internal.logging.CommonsLoggerFactory
            r0.<init>()
            io.netty.util.internal.logging.CommonsLoggerFactory.INSTANCE = r0
            return
    }

    @java.lang.Deprecated
    public CommonsLoggerFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.netty.util.internal.logging.InternalLoggerFactory
    public io.netty.util.internal.logging.InternalLogger newInstance(java.lang.String r3) {
            r2 = this;
            io.netty.util.internal.logging.CommonsLogger r0 = new io.netty.util.internal.logging.CommonsLogger
            org.apache.commons.logging.Log r1 = org.apache.commons.logging.LogFactory.getLog(r3)
            r0.<init>(r1, r3)
            return r0
    }
}
