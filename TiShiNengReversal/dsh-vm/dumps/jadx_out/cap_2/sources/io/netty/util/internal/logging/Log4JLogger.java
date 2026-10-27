package io.netty.util.internal.logging;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class Log4JLogger extends io.netty.util.internal.logging.AbstractInternalLogger {
    static final java.lang.String FQCN = "io.netty.util.internal.logging.Log4JLogger";
    private static final long serialVersionUID = 2851357342488183058L;
    final transient org.apache.log4j.Logger logger;
    final boolean traceCapable;

    static {
            return
    }

    Log4JLogger(org.apache.log4j.Logger r2) {
            r1 = this;
            java.lang.String r0 = r2.getName()
            r1.<init>(r0)
            r1.logger = r2
            boolean r2 = r1.isTraceCapable()
            r1.traceCapable = r2
            return
    }

    private boolean isTraceCapable() {
            r1 = this;
            org.apache.log4j.Logger r0 = r1.logger     // Catch: java.lang.NoSuchMethodError -> L7
            r0.isTraceEnabled()     // Catch: java.lang.NoSuchMethodError -> L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void debug(java.lang.String r5) {
            r4 = this;
            org.apache.log4j.Logger r0 = r4.logger
            java.lang.String r1 = io.netty.util.internal.logging.Log4JLogger.FQCN
            org.apache.log4j.Level r2 = org.apache.log4j.Level.DEBUG
            r3 = 0
            r0.log(r1, r2, r5, r3)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void debug(java.lang.String r4, java.lang.Object r5) {
            r3 = this;
            org.apache.log4j.Logger r0 = r3.logger
            boolean r0 = r0.isDebugEnabled()
            if (r0 == 0) goto L1d
            io.netty.util.internal.logging.FormattingTuple r4 = io.netty.util.internal.logging.MessageFormatter.format(r4, r5)
            org.apache.log4j.Logger r5 = r3.logger
            java.lang.String r0 = io.netty.util.internal.logging.Log4JLogger.FQCN
            org.apache.log4j.Level r1 = org.apache.log4j.Level.DEBUG
            java.lang.String r2 = r4.getMessage()
            java.lang.Throwable r4 = r4.getThrowable()
            r5.log(r0, r1, r2, r4)
        L1d:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void debug(java.lang.String r3, java.lang.Object r4, java.lang.Object r5) {
            r2 = this;
            org.apache.log4j.Logger r0 = r2.logger
            boolean r0 = r0.isDebugEnabled()
            if (r0 == 0) goto L1d
            io.netty.util.internal.logging.FormattingTuple r3 = io.netty.util.internal.logging.MessageFormatter.format(r3, r4, r5)
            org.apache.log4j.Logger r4 = r2.logger
            java.lang.String r5 = io.netty.util.internal.logging.Log4JLogger.FQCN
            org.apache.log4j.Level r0 = org.apache.log4j.Level.DEBUG
            java.lang.String r1 = r3.getMessage()
            java.lang.Throwable r3 = r3.getThrowable()
            r4.log(r5, r0, r1, r3)
        L1d:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void debug(java.lang.String r4, java.lang.Throwable r5) {
            r3 = this;
            org.apache.log4j.Logger r0 = r3.logger
            java.lang.String r1 = io.netty.util.internal.logging.Log4JLogger.FQCN
            org.apache.log4j.Level r2 = org.apache.log4j.Level.DEBUG
            r0.log(r1, r2, r4, r5)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void debug(java.lang.String r4, java.lang.Object... r5) {
            r3 = this;
            org.apache.log4j.Logger r0 = r3.logger
            boolean r0 = r0.isDebugEnabled()
            if (r0 == 0) goto L1d
            io.netty.util.internal.logging.FormattingTuple r4 = io.netty.util.internal.logging.MessageFormatter.arrayFormat(r4, r5)
            org.apache.log4j.Logger r5 = r3.logger
            java.lang.String r0 = io.netty.util.internal.logging.Log4JLogger.FQCN
            org.apache.log4j.Level r1 = org.apache.log4j.Level.DEBUG
            java.lang.String r2 = r4.getMessage()
            java.lang.Throwable r4 = r4.getThrowable()
            r5.log(r0, r1, r2, r4)
        L1d:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void error(java.lang.String r5) {
            r4 = this;
            org.apache.log4j.Logger r0 = r4.logger
            java.lang.String r1 = io.netty.util.internal.logging.Log4JLogger.FQCN
            org.apache.log4j.Level r2 = org.apache.log4j.Level.ERROR
            r3 = 0
            r0.log(r1, r2, r5, r3)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void error(java.lang.String r4, java.lang.Object r5) {
            r3 = this;
            org.apache.log4j.Logger r0 = r3.logger
            org.apache.log4j.Level r1 = org.apache.log4j.Level.ERROR
            boolean r0 = r0.isEnabledFor(r1)
            if (r0 == 0) goto L1f
            io.netty.util.internal.logging.FormattingTuple r4 = io.netty.util.internal.logging.MessageFormatter.format(r4, r5)
            org.apache.log4j.Logger r5 = r3.logger
            java.lang.String r0 = io.netty.util.internal.logging.Log4JLogger.FQCN
            org.apache.log4j.Level r1 = org.apache.log4j.Level.ERROR
            java.lang.String r2 = r4.getMessage()
            java.lang.Throwable r4 = r4.getThrowable()
            r5.log(r0, r1, r2, r4)
        L1f:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void error(java.lang.String r3, java.lang.Object r4, java.lang.Object r5) {
            r2 = this;
            org.apache.log4j.Logger r0 = r2.logger
            org.apache.log4j.Level r1 = org.apache.log4j.Level.ERROR
            boolean r0 = r0.isEnabledFor(r1)
            if (r0 == 0) goto L1f
            io.netty.util.internal.logging.FormattingTuple r3 = io.netty.util.internal.logging.MessageFormatter.format(r3, r4, r5)
            org.apache.log4j.Logger r4 = r2.logger
            java.lang.String r5 = io.netty.util.internal.logging.Log4JLogger.FQCN
            org.apache.log4j.Level r0 = org.apache.log4j.Level.ERROR
            java.lang.String r1 = r3.getMessage()
            java.lang.Throwable r3 = r3.getThrowable()
            r4.log(r5, r0, r1, r3)
        L1f:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void error(java.lang.String r4, java.lang.Throwable r5) {
            r3 = this;
            org.apache.log4j.Logger r0 = r3.logger
            java.lang.String r1 = io.netty.util.internal.logging.Log4JLogger.FQCN
            org.apache.log4j.Level r2 = org.apache.log4j.Level.ERROR
            r0.log(r1, r2, r4, r5)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void error(java.lang.String r4, java.lang.Object... r5) {
            r3 = this;
            org.apache.log4j.Logger r0 = r3.logger
            org.apache.log4j.Level r1 = org.apache.log4j.Level.ERROR
            boolean r0 = r0.isEnabledFor(r1)
            if (r0 == 0) goto L1f
            io.netty.util.internal.logging.FormattingTuple r4 = io.netty.util.internal.logging.MessageFormatter.arrayFormat(r4, r5)
            org.apache.log4j.Logger r5 = r3.logger
            java.lang.String r0 = io.netty.util.internal.logging.Log4JLogger.FQCN
            org.apache.log4j.Level r1 = org.apache.log4j.Level.ERROR
            java.lang.String r2 = r4.getMessage()
            java.lang.Throwable r4 = r4.getThrowable()
            r5.log(r0, r1, r2, r4)
        L1f:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void info(java.lang.String r5) {
            r4 = this;
            org.apache.log4j.Logger r0 = r4.logger
            java.lang.String r1 = io.netty.util.internal.logging.Log4JLogger.FQCN
            org.apache.log4j.Level r2 = org.apache.log4j.Level.INFO
            r3 = 0
            r0.log(r1, r2, r5, r3)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void info(java.lang.String r4, java.lang.Object r5) {
            r3 = this;
            org.apache.log4j.Logger r0 = r3.logger
            boolean r0 = r0.isInfoEnabled()
            if (r0 == 0) goto L1d
            io.netty.util.internal.logging.FormattingTuple r4 = io.netty.util.internal.logging.MessageFormatter.format(r4, r5)
            org.apache.log4j.Logger r5 = r3.logger
            java.lang.String r0 = io.netty.util.internal.logging.Log4JLogger.FQCN
            org.apache.log4j.Level r1 = org.apache.log4j.Level.INFO
            java.lang.String r2 = r4.getMessage()
            java.lang.Throwable r4 = r4.getThrowable()
            r5.log(r0, r1, r2, r4)
        L1d:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void info(java.lang.String r3, java.lang.Object r4, java.lang.Object r5) {
            r2 = this;
            org.apache.log4j.Logger r0 = r2.logger
            boolean r0 = r0.isInfoEnabled()
            if (r0 == 0) goto L1d
            io.netty.util.internal.logging.FormattingTuple r3 = io.netty.util.internal.logging.MessageFormatter.format(r3, r4, r5)
            org.apache.log4j.Logger r4 = r2.logger
            java.lang.String r5 = io.netty.util.internal.logging.Log4JLogger.FQCN
            org.apache.log4j.Level r0 = org.apache.log4j.Level.INFO
            java.lang.String r1 = r3.getMessage()
            java.lang.Throwable r3 = r3.getThrowable()
            r4.log(r5, r0, r1, r3)
        L1d:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void info(java.lang.String r4, java.lang.Throwable r5) {
            r3 = this;
            org.apache.log4j.Logger r0 = r3.logger
            java.lang.String r1 = io.netty.util.internal.logging.Log4JLogger.FQCN
            org.apache.log4j.Level r2 = org.apache.log4j.Level.INFO
            r0.log(r1, r2, r4, r5)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void info(java.lang.String r4, java.lang.Object... r5) {
            r3 = this;
            org.apache.log4j.Logger r0 = r3.logger
            boolean r0 = r0.isInfoEnabled()
            if (r0 == 0) goto L1d
            io.netty.util.internal.logging.FormattingTuple r4 = io.netty.util.internal.logging.MessageFormatter.arrayFormat(r4, r5)
            org.apache.log4j.Logger r5 = r3.logger
            java.lang.String r0 = io.netty.util.internal.logging.Log4JLogger.FQCN
            org.apache.log4j.Level r1 = org.apache.log4j.Level.INFO
            java.lang.String r2 = r4.getMessage()
            java.lang.Throwable r4 = r4.getThrowable()
            r5.log(r0, r1, r2, r4)
        L1d:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public boolean isDebugEnabled() {
            r1 = this;
            org.apache.log4j.Logger r0 = r1.logger
            boolean r0 = r0.isDebugEnabled()
            return r0
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public boolean isErrorEnabled() {
            r2 = this;
            org.apache.log4j.Logger r0 = r2.logger
            org.apache.log4j.Level r1 = org.apache.log4j.Level.ERROR
            boolean r0 = r0.isEnabledFor(r1)
            return r0
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public boolean isInfoEnabled() {
            r1 = this;
            org.apache.log4j.Logger r0 = r1.logger
            boolean r0 = r0.isInfoEnabled()
            return r0
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public boolean isTraceEnabled() {
            r1 = this;
            boolean r0 = r1.traceCapable
            if (r0 == 0) goto Lb
            org.apache.log4j.Logger r0 = r1.logger
            boolean r0 = r0.isTraceEnabled()
            return r0
        Lb:
            org.apache.log4j.Logger r0 = r1.logger
            boolean r0 = r0.isDebugEnabled()
            return r0
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public boolean isWarnEnabled() {
            r2 = this;
            org.apache.log4j.Logger r0 = r2.logger
            org.apache.log4j.Level r1 = org.apache.log4j.Level.WARN
            boolean r0 = r0.isEnabledFor(r1)
            return r0
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void trace(java.lang.String r5) {
            r4 = this;
            org.apache.log4j.Logger r0 = r4.logger
            java.lang.String r1 = io.netty.util.internal.logging.Log4JLogger.FQCN
            boolean r2 = r4.traceCapable
            if (r2 == 0) goto Lb
            org.apache.log4j.Level r2 = org.apache.log4j.Level.TRACE
            goto Ld
        Lb:
            org.apache.log4j.Level r2 = org.apache.log4j.Level.DEBUG
        Ld:
            r3 = 0
            r0.log(r1, r2, r5, r3)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void trace(java.lang.String r4, java.lang.Object r5) {
            r3 = this;
            boolean r0 = r3.isTraceEnabled()
            if (r0 == 0) goto L22
            io.netty.util.internal.logging.FormattingTuple r4 = io.netty.util.internal.logging.MessageFormatter.format(r4, r5)
            org.apache.log4j.Logger r5 = r3.logger
            java.lang.String r0 = io.netty.util.internal.logging.Log4JLogger.FQCN
            boolean r1 = r3.traceCapable
            if (r1 == 0) goto L15
            org.apache.log4j.Level r1 = org.apache.log4j.Level.TRACE
            goto L17
        L15:
            org.apache.log4j.Level r1 = org.apache.log4j.Level.DEBUG
        L17:
            java.lang.String r2 = r4.getMessage()
            java.lang.Throwable r4 = r4.getThrowable()
            r5.log(r0, r1, r2, r4)
        L22:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void trace(java.lang.String r3, java.lang.Object r4, java.lang.Object r5) {
            r2 = this;
            boolean r0 = r2.isTraceEnabled()
            if (r0 == 0) goto L22
            io.netty.util.internal.logging.FormattingTuple r3 = io.netty.util.internal.logging.MessageFormatter.format(r3, r4, r5)
            org.apache.log4j.Logger r4 = r2.logger
            java.lang.String r5 = io.netty.util.internal.logging.Log4JLogger.FQCN
            boolean r0 = r2.traceCapable
            if (r0 == 0) goto L15
            org.apache.log4j.Level r0 = org.apache.log4j.Level.TRACE
            goto L17
        L15:
            org.apache.log4j.Level r0 = org.apache.log4j.Level.DEBUG
        L17:
            java.lang.String r1 = r3.getMessage()
            java.lang.Throwable r3 = r3.getThrowable()
            r4.log(r5, r0, r1, r3)
        L22:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void trace(java.lang.String r4, java.lang.Throwable r5) {
            r3 = this;
            org.apache.log4j.Logger r0 = r3.logger
            java.lang.String r1 = io.netty.util.internal.logging.Log4JLogger.FQCN
            boolean r2 = r3.traceCapable
            if (r2 == 0) goto Lb
            org.apache.log4j.Level r2 = org.apache.log4j.Level.TRACE
            goto Ld
        Lb:
            org.apache.log4j.Level r2 = org.apache.log4j.Level.DEBUG
        Ld:
            r0.log(r1, r2, r4, r5)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void trace(java.lang.String r4, java.lang.Object... r5) {
            r3 = this;
            boolean r0 = r3.isTraceEnabled()
            if (r0 == 0) goto L22
            io.netty.util.internal.logging.FormattingTuple r4 = io.netty.util.internal.logging.MessageFormatter.arrayFormat(r4, r5)
            org.apache.log4j.Logger r5 = r3.logger
            java.lang.String r0 = io.netty.util.internal.logging.Log4JLogger.FQCN
            boolean r1 = r3.traceCapable
            if (r1 == 0) goto L15
            org.apache.log4j.Level r1 = org.apache.log4j.Level.TRACE
            goto L17
        L15:
            org.apache.log4j.Level r1 = org.apache.log4j.Level.DEBUG
        L17:
            java.lang.String r2 = r4.getMessage()
            java.lang.Throwable r4 = r4.getThrowable()
            r5.log(r0, r1, r2, r4)
        L22:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void warn(java.lang.String r5) {
            r4 = this;
            org.apache.log4j.Logger r0 = r4.logger
            java.lang.String r1 = io.netty.util.internal.logging.Log4JLogger.FQCN
            org.apache.log4j.Level r2 = org.apache.log4j.Level.WARN
            r3 = 0
            r0.log(r1, r2, r5, r3)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void warn(java.lang.String r4, java.lang.Object r5) {
            r3 = this;
            org.apache.log4j.Logger r0 = r3.logger
            org.apache.log4j.Level r1 = org.apache.log4j.Level.WARN
            boolean r0 = r0.isEnabledFor(r1)
            if (r0 == 0) goto L1f
            io.netty.util.internal.logging.FormattingTuple r4 = io.netty.util.internal.logging.MessageFormatter.format(r4, r5)
            org.apache.log4j.Logger r5 = r3.logger
            java.lang.String r0 = io.netty.util.internal.logging.Log4JLogger.FQCN
            org.apache.log4j.Level r1 = org.apache.log4j.Level.WARN
            java.lang.String r2 = r4.getMessage()
            java.lang.Throwable r4 = r4.getThrowable()
            r5.log(r0, r1, r2, r4)
        L1f:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void warn(java.lang.String r3, java.lang.Object r4, java.lang.Object r5) {
            r2 = this;
            org.apache.log4j.Logger r0 = r2.logger
            org.apache.log4j.Level r1 = org.apache.log4j.Level.WARN
            boolean r0 = r0.isEnabledFor(r1)
            if (r0 == 0) goto L1f
            io.netty.util.internal.logging.FormattingTuple r3 = io.netty.util.internal.logging.MessageFormatter.format(r3, r4, r5)
            org.apache.log4j.Logger r4 = r2.logger
            java.lang.String r5 = io.netty.util.internal.logging.Log4JLogger.FQCN
            org.apache.log4j.Level r0 = org.apache.log4j.Level.WARN
            java.lang.String r1 = r3.getMessage()
            java.lang.Throwable r3 = r3.getThrowable()
            r4.log(r5, r0, r1, r3)
        L1f:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void warn(java.lang.String r4, java.lang.Throwable r5) {
            r3 = this;
            org.apache.log4j.Logger r0 = r3.logger
            java.lang.String r1 = io.netty.util.internal.logging.Log4JLogger.FQCN
            org.apache.log4j.Level r2 = org.apache.log4j.Level.WARN
            r0.log(r1, r2, r4, r5)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void warn(java.lang.String r4, java.lang.Object... r5) {
            r3 = this;
            org.apache.log4j.Logger r0 = r3.logger
            org.apache.log4j.Level r1 = org.apache.log4j.Level.WARN
            boolean r0 = r0.isEnabledFor(r1)
            if (r0 == 0) goto L1f
            io.netty.util.internal.logging.FormattingTuple r4 = io.netty.util.internal.logging.MessageFormatter.arrayFormat(r4, r5)
            org.apache.log4j.Logger r5 = r3.logger
            java.lang.String r0 = io.netty.util.internal.logging.Log4JLogger.FQCN
            org.apache.log4j.Level r1 = org.apache.log4j.Level.WARN
            java.lang.String r2 = r4.getMessage()
            java.lang.Throwable r4 = r4.getThrowable()
            r5.log(r0, r1, r2, r4)
        L1f:
            return
    }
}
