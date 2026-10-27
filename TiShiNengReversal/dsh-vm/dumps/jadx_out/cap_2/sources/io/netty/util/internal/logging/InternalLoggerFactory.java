package io.netty.util.internal.logging;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class InternalLoggerFactory {
    private static volatile io.netty.util.internal.logging.InternalLoggerFactory defaultFactory;

    public InternalLoggerFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    public static io.netty.util.internal.logging.InternalLoggerFactory getDefaultFactory() {
            io.netty.util.internal.logging.InternalLoggerFactory r0 = io.netty.util.internal.logging.InternalLoggerFactory.defaultFactory
            if (r0 != 0) goto L10
            java.lang.Class<io.netty.util.internal.logging.InternalLoggerFactory> r0 = io.netty.util.internal.logging.InternalLoggerFactory.class
            java.lang.String r0 = r0.getName()
            io.netty.util.internal.logging.InternalLoggerFactory r0 = newDefaultFactory(r0)
            io.netty.util.internal.logging.InternalLoggerFactory.defaultFactory = r0
        L10:
            io.netty.util.internal.logging.InternalLoggerFactory r0 = io.netty.util.internal.logging.InternalLoggerFactory.defaultFactory
            return r0
    }

    public static io.netty.util.internal.logging.InternalLogger getInstance(java.lang.Class<?> r0) {
            java.lang.String r0 = r0.getName()
            io.netty.util.internal.logging.InternalLogger r0 = getInstance(r0)
            return r0
    }

    public static io.netty.util.internal.logging.InternalLogger getInstance(java.lang.String r1) {
            io.netty.util.internal.logging.InternalLoggerFactory r0 = getDefaultFactory()
            io.netty.util.internal.logging.InternalLogger r1 = r0.newInstance(r1)
            return r1
    }

    private static io.netty.util.internal.logging.InternalLoggerFactory newDefaultFactory(java.lang.String r3) {
            io.netty.util.internal.logging.Slf4JLoggerFactory r0 = new io.netty.util.internal.logging.Slf4JLoggerFactory     // Catch: java.lang.Throwable -> L10
            r1 = 1
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L10
            io.netty.util.internal.logging.InternalLogger r1 = r0.newInstance(r3)     // Catch: java.lang.Throwable -> L10
            java.lang.String r2 = "Using SLF4J as the default logging framework"
            r1.debug(r2)     // Catch: java.lang.Throwable -> L10
            return r0
        L10:
            io.netty.util.internal.logging.InternalLoggerFactory r0 = io.netty.util.internal.logging.Log4JLoggerFactory.INSTANCE     // Catch: java.lang.Throwable -> L1c
            io.netty.util.internal.logging.InternalLogger r1 = r0.newInstance(r3)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = "Using Log4J as the default logging framework"
            r1.debug(r2)     // Catch: java.lang.Throwable -> L1c
            goto L33
        L1c:
            io.netty.util.internal.logging.InternalLoggerFactory r0 = io.netty.util.internal.logging.Log4J2LoggerFactory.INSTANCE     // Catch: java.lang.Throwable -> L28
            io.netty.util.internal.logging.InternalLogger r1 = r0.newInstance(r3)     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = "Using Log4J2 as the default logging framework"
            r1.debug(r2)     // Catch: java.lang.Throwable -> L28
            goto L33
        L28:
            io.netty.util.internal.logging.InternalLoggerFactory r0 = io.netty.util.internal.logging.JdkLoggerFactory.INSTANCE
            io.netty.util.internal.logging.InternalLogger r3 = r0.newInstance(r3)
            java.lang.String r1 = "Using java.util.logging as the default logging framework"
            r3.debug(r1)
        L33:
            return r0
    }

    public static void setDefaultFactory(io.netty.util.internal.logging.InternalLoggerFactory r1) {
            if (r1 == 0) goto L5
            io.netty.util.internal.logging.InternalLoggerFactory.defaultFactory = r1
            return
        L5:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "defaultFactory"
            r1.<init>(r0)
            throw r1
    }

    protected abstract io.netty.util.internal.logging.InternalLogger newInstance(java.lang.String r1);
}
