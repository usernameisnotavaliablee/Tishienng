package io.netty.util.internal.logging;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class Slf4JLogger extends io.netty.util.internal.logging.AbstractInternalLogger {
    private static final long serialVersionUID = 108038972685130825L;
    private final transient org.slf4j.c logger;

    Slf4JLogger(org.slf4j.c r2) {
            r1 = this;
            java.lang.String r0 = r2.getName()
            r1.<init>(r0)
            r1.logger = r2
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void debug(java.lang.String r2) {
            r1 = this;
            org.slf4j.c r0 = r1.logger
            r0.debug(r2)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void debug(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            org.slf4j.c r0 = r1.logger
            r0.debug(r2, r3)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void debug(java.lang.String r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            org.slf4j.c r0 = r1.logger
            r0.debug(r2, r3, r4)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void debug(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            org.slf4j.c r0 = r1.logger
            r0.debug(r2, r3)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void debug(java.lang.String r2, java.lang.Object... r3) {
            r1 = this;
            org.slf4j.c r0 = r1.logger
            r0.debug(r2, r3)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void error(java.lang.String r2) {
            r1 = this;
            org.slf4j.c r0 = r1.logger
            r0.error(r2)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void error(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            org.slf4j.c r0 = r1.logger
            r0.error(r2, r3)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void error(java.lang.String r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            org.slf4j.c r0 = r1.logger
            r0.error(r2, r3, r4)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void error(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            org.slf4j.c r0 = r1.logger
            r0.error(r2, r3)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void error(java.lang.String r2, java.lang.Object... r3) {
            r1 = this;
            org.slf4j.c r0 = r1.logger
            r0.error(r2, r3)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void info(java.lang.String r2) {
            r1 = this;
            org.slf4j.c r0 = r1.logger
            r0.info(r2)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void info(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            org.slf4j.c r0 = r1.logger
            r0.info(r2, r3)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void info(java.lang.String r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            org.slf4j.c r0 = r1.logger
            r0.info(r2, r3, r4)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void info(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            org.slf4j.c r0 = r1.logger
            r0.info(r2, r3)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void info(java.lang.String r2, java.lang.Object... r3) {
            r1 = this;
            org.slf4j.c r0 = r1.logger
            r0.info(r2, r3)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public boolean isDebugEnabled() {
            r1 = this;
            org.slf4j.c r0 = r1.logger
            boolean r0 = r0.isDebugEnabled()
            return r0
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public boolean isErrorEnabled() {
            r1 = this;
            org.slf4j.c r0 = r1.logger
            boolean r0 = r0.isErrorEnabled()
            return r0
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public boolean isInfoEnabled() {
            r1 = this;
            org.slf4j.c r0 = r1.logger
            boolean r0 = r0.isInfoEnabled()
            return r0
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public boolean isTraceEnabled() {
            r1 = this;
            org.slf4j.c r0 = r1.logger
            boolean r0 = r0.isTraceEnabled()
            return r0
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public boolean isWarnEnabled() {
            r1 = this;
            org.slf4j.c r0 = r1.logger
            boolean r0 = r0.isWarnEnabled()
            return r0
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void trace(java.lang.String r2) {
            r1 = this;
            org.slf4j.c r0 = r1.logger
            r0.trace(r2)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void trace(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            org.slf4j.c r0 = r1.logger
            r0.trace(r2, r3)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void trace(java.lang.String r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            org.slf4j.c r0 = r1.logger
            r0.trace(r2, r3, r4)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void trace(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            org.slf4j.c r0 = r1.logger
            r0.trace(r2, r3)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void trace(java.lang.String r2, java.lang.Object... r3) {
            r1 = this;
            org.slf4j.c r0 = r1.logger
            r0.trace(r2, r3)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void warn(java.lang.String r2) {
            r1 = this;
            org.slf4j.c r0 = r1.logger
            r0.warn(r2)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void warn(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            org.slf4j.c r0 = r1.logger
            r0.warn(r2, r3)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void warn(java.lang.String r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            org.slf4j.c r0 = r1.logger
            r0.warn(r2, r3, r4)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void warn(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            org.slf4j.c r0 = r1.logger
            r0.warn(r2, r3)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void warn(java.lang.String r2, java.lang.Object... r3) {
            r1 = this;
            org.slf4j.c r0 = r1.logger
            r0.warn(r2, r3)
            return
    }
}
