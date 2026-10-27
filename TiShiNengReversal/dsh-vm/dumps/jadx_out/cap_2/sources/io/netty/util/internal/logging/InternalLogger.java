package io.netty.util.internal.logging;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface InternalLogger {
    void debug(java.lang.String r1);

    void debug(java.lang.String r1, java.lang.Object r2);

    void debug(java.lang.String r1, java.lang.Object r2, java.lang.Object r3);

    void debug(java.lang.String r1, java.lang.Throwable r2);

    void debug(java.lang.String r1, java.lang.Object... r2);

    void debug(java.lang.Throwable r1);

    void error(java.lang.String r1);

    void error(java.lang.String r1, java.lang.Object r2);

    void error(java.lang.String r1, java.lang.Object r2, java.lang.Object r3);

    void error(java.lang.String r1, java.lang.Throwable r2);

    void error(java.lang.String r1, java.lang.Object... r2);

    void error(java.lang.Throwable r1);

    void info(java.lang.String r1);

    void info(java.lang.String r1, java.lang.Object r2);

    void info(java.lang.String r1, java.lang.Object r2, java.lang.Object r3);

    void info(java.lang.String r1, java.lang.Throwable r2);

    void info(java.lang.String r1, java.lang.Object... r2);

    void info(java.lang.Throwable r1);

    boolean isDebugEnabled();

    boolean isEnabled(io.netty.util.internal.logging.InternalLogLevel r1);

    boolean isErrorEnabled();

    boolean isInfoEnabled();

    boolean isTraceEnabled();

    boolean isWarnEnabled();

    void log(io.netty.util.internal.logging.InternalLogLevel r1, java.lang.String r2);

    void log(io.netty.util.internal.logging.InternalLogLevel r1, java.lang.String r2, java.lang.Object r3);

    void log(io.netty.util.internal.logging.InternalLogLevel r1, java.lang.String r2, java.lang.Object r3, java.lang.Object r4);

    void log(io.netty.util.internal.logging.InternalLogLevel r1, java.lang.String r2, java.lang.Throwable r3);

    void log(io.netty.util.internal.logging.InternalLogLevel r1, java.lang.String r2, java.lang.Object... r3);

    void log(io.netty.util.internal.logging.InternalLogLevel r1, java.lang.Throwable r2);

    java.lang.String name();

    void trace(java.lang.String r1);

    void trace(java.lang.String r1, java.lang.Object r2);

    void trace(java.lang.String r1, java.lang.Object r2, java.lang.Object r3);

    void trace(java.lang.String r1, java.lang.Throwable r2);

    void trace(java.lang.String r1, java.lang.Object... r2);

    void trace(java.lang.Throwable r1);

    void warn(java.lang.String r1);

    void warn(java.lang.String r1, java.lang.Object r2);

    void warn(java.lang.String r1, java.lang.Object r2, java.lang.Object r3);

    void warn(java.lang.String r1, java.lang.Throwable r2);

    void warn(java.lang.String r1, java.lang.Object... r2);

    void warn(java.lang.Throwable r1);
}
