package io.netty.util.internal.logging;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class CommonsLogger extends io.netty.util.internal.logging.AbstractInternalLogger {
    private static final long serialVersionUID = 8647838678388394885L;
    private final transient org.apache.commons.logging.Log logger;

    CommonsLogger(org.apache.commons.logging.Log r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r2)
            if (r1 == 0) goto L8
            r0.logger = r1
            return
        L8:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "logger"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void debug(java.lang.String r2) {
            r1 = this;
            org.apache.commons.logging.Log r0 = r1.logger
            r0.debug(r2)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void debug(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            org.apache.commons.logging.Log r0 = r1.logger
            boolean r0 = r0.isDebugEnabled()
            if (r0 == 0) goto L19
            io.netty.util.internal.logging.FormattingTuple r2 = io.netty.util.internal.logging.MessageFormatter.format(r2, r3)
            org.apache.commons.logging.Log r3 = r1.logger
            java.lang.String r0 = r2.getMessage()
            java.lang.Throwable r2 = r2.getThrowable()
            r3.debug(r0, r2)
        L19:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void debug(java.lang.String r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            org.apache.commons.logging.Log r0 = r1.logger
            boolean r0 = r0.isDebugEnabled()
            if (r0 == 0) goto L19
            io.netty.util.internal.logging.FormattingTuple r2 = io.netty.util.internal.logging.MessageFormatter.format(r2, r3, r4)
            org.apache.commons.logging.Log r3 = r1.logger
            java.lang.String r4 = r2.getMessage()
            java.lang.Throwable r2 = r2.getThrowable()
            r3.debug(r4, r2)
        L19:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void debug(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            org.apache.commons.logging.Log r0 = r1.logger
            r0.debug(r2, r3)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void debug(java.lang.String r2, java.lang.Object... r3) {
            r1 = this;
            org.apache.commons.logging.Log r0 = r1.logger
            boolean r0 = r0.isDebugEnabled()
            if (r0 == 0) goto L19
            io.netty.util.internal.logging.FormattingTuple r2 = io.netty.util.internal.logging.MessageFormatter.arrayFormat(r2, r3)
            org.apache.commons.logging.Log r3 = r1.logger
            java.lang.String r0 = r2.getMessage()
            java.lang.Throwable r2 = r2.getThrowable()
            r3.debug(r0, r2)
        L19:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void error(java.lang.String r2) {
            r1 = this;
            org.apache.commons.logging.Log r0 = r1.logger
            r0.error(r2)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void error(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            org.apache.commons.logging.Log r0 = r1.logger
            boolean r0 = r0.isErrorEnabled()
            if (r0 == 0) goto L19
            io.netty.util.internal.logging.FormattingTuple r2 = io.netty.util.internal.logging.MessageFormatter.format(r2, r3)
            org.apache.commons.logging.Log r3 = r1.logger
            java.lang.String r0 = r2.getMessage()
            java.lang.Throwable r2 = r2.getThrowable()
            r3.error(r0, r2)
        L19:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void error(java.lang.String r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            org.apache.commons.logging.Log r0 = r1.logger
            boolean r0 = r0.isErrorEnabled()
            if (r0 == 0) goto L19
            io.netty.util.internal.logging.FormattingTuple r2 = io.netty.util.internal.logging.MessageFormatter.format(r2, r3, r4)
            org.apache.commons.logging.Log r3 = r1.logger
            java.lang.String r4 = r2.getMessage()
            java.lang.Throwable r2 = r2.getThrowable()
            r3.error(r4, r2)
        L19:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void error(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            org.apache.commons.logging.Log r0 = r1.logger
            r0.error(r2, r3)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void error(java.lang.String r2, java.lang.Object... r3) {
            r1 = this;
            org.apache.commons.logging.Log r0 = r1.logger
            boolean r0 = r0.isErrorEnabled()
            if (r0 == 0) goto L19
            io.netty.util.internal.logging.FormattingTuple r2 = io.netty.util.internal.logging.MessageFormatter.arrayFormat(r2, r3)
            org.apache.commons.logging.Log r3 = r1.logger
            java.lang.String r0 = r2.getMessage()
            java.lang.Throwable r2 = r2.getThrowable()
            r3.error(r0, r2)
        L19:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void info(java.lang.String r2) {
            r1 = this;
            org.apache.commons.logging.Log r0 = r1.logger
            r0.info(r2)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void info(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            org.apache.commons.logging.Log r0 = r1.logger
            boolean r0 = r0.isInfoEnabled()
            if (r0 == 0) goto L19
            io.netty.util.internal.logging.FormattingTuple r2 = io.netty.util.internal.logging.MessageFormatter.format(r2, r3)
            org.apache.commons.logging.Log r3 = r1.logger
            java.lang.String r0 = r2.getMessage()
            java.lang.Throwable r2 = r2.getThrowable()
            r3.info(r0, r2)
        L19:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void info(java.lang.String r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            org.apache.commons.logging.Log r0 = r1.logger
            boolean r0 = r0.isInfoEnabled()
            if (r0 == 0) goto L19
            io.netty.util.internal.logging.FormattingTuple r2 = io.netty.util.internal.logging.MessageFormatter.format(r2, r3, r4)
            org.apache.commons.logging.Log r3 = r1.logger
            java.lang.String r4 = r2.getMessage()
            java.lang.Throwable r2 = r2.getThrowable()
            r3.info(r4, r2)
        L19:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void info(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            org.apache.commons.logging.Log r0 = r1.logger
            r0.info(r2, r3)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void info(java.lang.String r2, java.lang.Object... r3) {
            r1 = this;
            org.apache.commons.logging.Log r0 = r1.logger
            boolean r0 = r0.isInfoEnabled()
            if (r0 == 0) goto L19
            io.netty.util.internal.logging.FormattingTuple r2 = io.netty.util.internal.logging.MessageFormatter.arrayFormat(r2, r3)
            org.apache.commons.logging.Log r3 = r1.logger
            java.lang.String r0 = r2.getMessage()
            java.lang.Throwable r2 = r2.getThrowable()
            r3.info(r0, r2)
        L19:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public boolean isDebugEnabled() {
            r1 = this;
            org.apache.commons.logging.Log r0 = r1.logger
            boolean r0 = r0.isDebugEnabled()
            return r0
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public boolean isErrorEnabled() {
            r1 = this;
            org.apache.commons.logging.Log r0 = r1.logger
            boolean r0 = r0.isErrorEnabled()
            return r0
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public boolean isInfoEnabled() {
            r1 = this;
            org.apache.commons.logging.Log r0 = r1.logger
            boolean r0 = r0.isInfoEnabled()
            return r0
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public boolean isTraceEnabled() {
            r1 = this;
            org.apache.commons.logging.Log r0 = r1.logger
            boolean r0 = r0.isTraceEnabled()
            return r0
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public boolean isWarnEnabled() {
            r1 = this;
            org.apache.commons.logging.Log r0 = r1.logger
            boolean r0 = r0.isWarnEnabled()
            return r0
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void trace(java.lang.String r2) {
            r1 = this;
            org.apache.commons.logging.Log r0 = r1.logger
            r0.trace(r2)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void trace(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            org.apache.commons.logging.Log r0 = r1.logger
            boolean r0 = r0.isTraceEnabled()
            if (r0 == 0) goto L19
            io.netty.util.internal.logging.FormattingTuple r2 = io.netty.util.internal.logging.MessageFormatter.format(r2, r3)
            org.apache.commons.logging.Log r3 = r1.logger
            java.lang.String r0 = r2.getMessage()
            java.lang.Throwable r2 = r2.getThrowable()
            r3.trace(r0, r2)
        L19:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void trace(java.lang.String r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            org.apache.commons.logging.Log r0 = r1.logger
            boolean r0 = r0.isTraceEnabled()
            if (r0 == 0) goto L19
            io.netty.util.internal.logging.FormattingTuple r2 = io.netty.util.internal.logging.MessageFormatter.format(r2, r3, r4)
            org.apache.commons.logging.Log r3 = r1.logger
            java.lang.String r4 = r2.getMessage()
            java.lang.Throwable r2 = r2.getThrowable()
            r3.trace(r4, r2)
        L19:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void trace(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            org.apache.commons.logging.Log r0 = r1.logger
            r0.trace(r2, r3)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void trace(java.lang.String r2, java.lang.Object... r3) {
            r1 = this;
            org.apache.commons.logging.Log r0 = r1.logger
            boolean r0 = r0.isTraceEnabled()
            if (r0 == 0) goto L19
            io.netty.util.internal.logging.FormattingTuple r2 = io.netty.util.internal.logging.MessageFormatter.arrayFormat(r2, r3)
            org.apache.commons.logging.Log r3 = r1.logger
            java.lang.String r0 = r2.getMessage()
            java.lang.Throwable r2 = r2.getThrowable()
            r3.trace(r0, r2)
        L19:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void warn(java.lang.String r2) {
            r1 = this;
            org.apache.commons.logging.Log r0 = r1.logger
            r0.warn(r2)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void warn(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            org.apache.commons.logging.Log r0 = r1.logger
            boolean r0 = r0.isWarnEnabled()
            if (r0 == 0) goto L19
            io.netty.util.internal.logging.FormattingTuple r2 = io.netty.util.internal.logging.MessageFormatter.format(r2, r3)
            org.apache.commons.logging.Log r3 = r1.logger
            java.lang.String r0 = r2.getMessage()
            java.lang.Throwable r2 = r2.getThrowable()
            r3.warn(r0, r2)
        L19:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void warn(java.lang.String r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            org.apache.commons.logging.Log r0 = r1.logger
            boolean r0 = r0.isWarnEnabled()
            if (r0 == 0) goto L19
            io.netty.util.internal.logging.FormattingTuple r2 = io.netty.util.internal.logging.MessageFormatter.format(r2, r3, r4)
            org.apache.commons.logging.Log r3 = r1.logger
            java.lang.String r4 = r2.getMessage()
            java.lang.Throwable r2 = r2.getThrowable()
            r3.warn(r4, r2)
        L19:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void warn(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            org.apache.commons.logging.Log r0 = r1.logger
            r0.warn(r2, r3)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void warn(java.lang.String r2, java.lang.Object... r3) {
            r1 = this;
            org.apache.commons.logging.Log r0 = r1.logger
            boolean r0 = r0.isWarnEnabled()
            if (r0 == 0) goto L19
            io.netty.util.internal.logging.FormattingTuple r2 = io.netty.util.internal.logging.MessageFormatter.arrayFormat(r2, r3)
            org.apache.commons.logging.Log r3 = r1.logger
            java.lang.String r0 = r2.getMessage()
            java.lang.Throwable r2 = r2.getThrowable()
            r3.warn(r0, r2)
        L19:
            return
    }
}
