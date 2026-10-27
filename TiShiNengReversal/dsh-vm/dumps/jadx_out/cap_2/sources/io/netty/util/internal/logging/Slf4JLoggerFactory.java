package io.netty.util.internal.logging;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class Slf4JLoggerFactory extends io.netty.util.internal.logging.InternalLoggerFactory {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final io.netty.util.internal.logging.InternalLoggerFactory INSTANCE = null;

    static {
            io.netty.util.internal.logging.Slf4JLoggerFactory r0 = new io.netty.util.internal.logging.Slf4JLoggerFactory
            r0.<init>()
            io.netty.util.internal.logging.Slf4JLoggerFactory.INSTANCE = r0
            return
    }

    @java.lang.Deprecated
    public Slf4JLoggerFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    Slf4JLoggerFactory(boolean r2) {
            r1 = this;
            r1.<init>()
            org.slf4j.a r2 = org.slf4j.d.h()
            boolean r2 = r2 instanceof org.slf4j.helpers.e
            if (r2 != 0) goto Lc
            return
        Lc:
            java.lang.NoClassDefFoundError r2 = new java.lang.NoClassDefFoundError
            java.lang.String r0 = "NOPLoggerFactory not supported"
            r2.<init>(r0)
            throw r2
    }

    static io.netty.util.internal.logging.InternalLogger wrapLogger(org.slf4j.c r1) {
            boolean r0 = r1 instanceof i5.a
            if (r0 == 0) goto Lc
            io.netty.util.internal.logging.LocationAwareSlf4JLogger r0 = new io.netty.util.internal.logging.LocationAwareSlf4JLogger
            i5.a r1 = (i5.a) r1
            r0.<init>(r1)
            return r0
        Lc:
            io.netty.util.internal.logging.Slf4JLogger r0 = new io.netty.util.internal.logging.Slf4JLogger
            r0.<init>(r1)
            return r0
    }

    @Override // io.netty.util.internal.logging.InternalLoggerFactory
    public io.netty.util.internal.logging.InternalLogger newInstance(java.lang.String r1) {
            r0 = this;
            org.slf4j.c r1 = org.slf4j.d.j(r1)
            io.netty.util.internal.logging.InternalLogger r1 = wrapLogger(r1)
            return r1
    }
}
