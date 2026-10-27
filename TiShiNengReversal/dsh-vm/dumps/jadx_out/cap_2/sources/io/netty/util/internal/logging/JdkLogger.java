package io.netty.util.internal.logging;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class JdkLogger extends io.netty.util.internal.logging.AbstractInternalLogger {
    static final java.lang.String SELF = "io.netty.util.internal.logging.JdkLogger";
    static final java.lang.String SUPER = null;
    private static final long serialVersionUID = -1767272577989225979L;
    final transient java.util.logging.Logger logger;

    static {
            java.lang.Class<io.netty.util.internal.logging.AbstractInternalLogger> r0 = io.netty.util.internal.logging.AbstractInternalLogger.class
            java.lang.String r0 = r0.getName()
            io.netty.util.internal.logging.JdkLogger.SUPER = r0
            return
    }

    JdkLogger(java.util.logging.Logger r2) {
            r1 = this;
            java.lang.String r0 = r2.getName()
            r1.<init>(r0)
            r1.logger = r2
            return
    }

    private static void fillCallerData(java.lang.String r5, java.util.logging.LogRecord r6) {
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r1 = 0
        La:
            int r2 = r0.length
            r3 = -1
            if (r1 >= r2) goto L26
            r2 = r0[r1]
            java.lang.String r2 = r2.getClassName()
            boolean r4 = r2.equals(r5)
            if (r4 != 0) goto L27
            java.lang.String r4 = io.netty.util.internal.logging.JdkLogger.SUPER
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L23
            goto L27
        L23:
            int r1 = r1 + 1
            goto La
        L26:
            r1 = -1
        L27:
            int r1 = r1 + 1
            int r2 = r0.length
            if (r1 >= r2) goto L41
            r2 = r0[r1]
            java.lang.String r2 = r2.getClassName()
            boolean r4 = r2.equals(r5)
            if (r4 != 0) goto L27
            java.lang.String r4 = io.netty.util.internal.logging.JdkLogger.SUPER
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L27
            goto L42
        L41:
            r1 = -1
        L42:
            if (r1 == r3) goto L54
            r5 = r0[r1]
            java.lang.String r0 = r5.getClassName()
            r6.setSourceClassName(r0)
            java.lang.String r5 = r5.getMethodName()
            r6.setSourceMethodName(r5)
        L54:
            return
    }

    private void log(java.lang.String r2, java.util.logging.Level r3, java.lang.String r4, java.lang.Throwable r5) {
            r1 = this;
            java.util.logging.LogRecord r0 = new java.util.logging.LogRecord
            r0.<init>(r3, r4)
            java.lang.String r3 = r1.name()
            r0.setLoggerName(r3)
            r0.setThrown(r5)
            fillCallerData(r2, r0)
            java.util.logging.Logger r2 = r1.logger
            r2.log(r0)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void debug(java.lang.String r4) {
            r3 = this;
            java.util.logging.Logger r0 = r3.logger
            java.util.logging.Level r1 = java.util.logging.Level.FINE
            boolean r0 = r0.isLoggable(r1)
            if (r0 == 0) goto L10
            java.lang.String r0 = io.netty.util.internal.logging.JdkLogger.SELF
            r2 = 0
            r3.log(r0, r1, r4, r2)
        L10:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void debug(java.lang.String r3, java.lang.Object r4) {
            r2 = this;
            java.util.logging.Logger r0 = r2.logger
            java.util.logging.Level r1 = java.util.logging.Level.FINE
            boolean r0 = r0.isLoggable(r1)
            if (r0 == 0) goto L1b
            io.netty.util.internal.logging.FormattingTuple r3 = io.netty.util.internal.logging.MessageFormatter.format(r3, r4)
            java.lang.String r4 = io.netty.util.internal.logging.JdkLogger.SELF
            java.lang.String r0 = r3.getMessage()
            java.lang.Throwable r3 = r3.getThrowable()
            r2.log(r4, r1, r0, r3)
        L1b:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void debug(java.lang.String r3, java.lang.Object r4, java.lang.Object r5) {
            r2 = this;
            java.util.logging.Logger r0 = r2.logger
            java.util.logging.Level r1 = java.util.logging.Level.FINE
            boolean r0 = r0.isLoggable(r1)
            if (r0 == 0) goto L1b
            io.netty.util.internal.logging.FormattingTuple r3 = io.netty.util.internal.logging.MessageFormatter.format(r3, r4, r5)
            java.lang.String r4 = io.netty.util.internal.logging.JdkLogger.SELF
            java.lang.String r5 = r3.getMessage()
            java.lang.Throwable r3 = r3.getThrowable()
            r2.log(r4, r1, r5, r3)
        L1b:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void debug(java.lang.String r3, java.lang.Throwable r4) {
            r2 = this;
            java.util.logging.Logger r0 = r2.logger
            java.util.logging.Level r1 = java.util.logging.Level.FINE
            boolean r0 = r0.isLoggable(r1)
            if (r0 == 0) goto Lf
            java.lang.String r0 = io.netty.util.internal.logging.JdkLogger.SELF
            r2.log(r0, r1, r3, r4)
        Lf:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void debug(java.lang.String r3, java.lang.Object... r4) {
            r2 = this;
            java.util.logging.Logger r0 = r2.logger
            java.util.logging.Level r1 = java.util.logging.Level.FINE
            boolean r0 = r0.isLoggable(r1)
            if (r0 == 0) goto L1b
            io.netty.util.internal.logging.FormattingTuple r3 = io.netty.util.internal.logging.MessageFormatter.arrayFormat(r3, r4)
            java.lang.String r4 = io.netty.util.internal.logging.JdkLogger.SELF
            java.lang.String r0 = r3.getMessage()
            java.lang.Throwable r3 = r3.getThrowable()
            r2.log(r4, r1, r0, r3)
        L1b:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void error(java.lang.String r4) {
            r3 = this;
            java.util.logging.Logger r0 = r3.logger
            java.util.logging.Level r1 = java.util.logging.Level.SEVERE
            boolean r0 = r0.isLoggable(r1)
            if (r0 == 0) goto L10
            java.lang.String r0 = io.netty.util.internal.logging.JdkLogger.SELF
            r2 = 0
            r3.log(r0, r1, r4, r2)
        L10:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void error(java.lang.String r3, java.lang.Object r4) {
            r2 = this;
            java.util.logging.Logger r0 = r2.logger
            java.util.logging.Level r1 = java.util.logging.Level.SEVERE
            boolean r0 = r0.isLoggable(r1)
            if (r0 == 0) goto L1b
            io.netty.util.internal.logging.FormattingTuple r3 = io.netty.util.internal.logging.MessageFormatter.format(r3, r4)
            java.lang.String r4 = io.netty.util.internal.logging.JdkLogger.SELF
            java.lang.String r0 = r3.getMessage()
            java.lang.Throwable r3 = r3.getThrowable()
            r2.log(r4, r1, r0, r3)
        L1b:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void error(java.lang.String r3, java.lang.Object r4, java.lang.Object r5) {
            r2 = this;
            java.util.logging.Logger r0 = r2.logger
            java.util.logging.Level r1 = java.util.logging.Level.SEVERE
            boolean r0 = r0.isLoggable(r1)
            if (r0 == 0) goto L1b
            io.netty.util.internal.logging.FormattingTuple r3 = io.netty.util.internal.logging.MessageFormatter.format(r3, r4, r5)
            java.lang.String r4 = io.netty.util.internal.logging.JdkLogger.SELF
            java.lang.String r5 = r3.getMessage()
            java.lang.Throwable r3 = r3.getThrowable()
            r2.log(r4, r1, r5, r3)
        L1b:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void error(java.lang.String r3, java.lang.Throwable r4) {
            r2 = this;
            java.util.logging.Logger r0 = r2.logger
            java.util.logging.Level r1 = java.util.logging.Level.SEVERE
            boolean r0 = r0.isLoggable(r1)
            if (r0 == 0) goto Lf
            java.lang.String r0 = io.netty.util.internal.logging.JdkLogger.SELF
            r2.log(r0, r1, r3, r4)
        Lf:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void error(java.lang.String r3, java.lang.Object... r4) {
            r2 = this;
            java.util.logging.Logger r0 = r2.logger
            java.util.logging.Level r1 = java.util.logging.Level.SEVERE
            boolean r0 = r0.isLoggable(r1)
            if (r0 == 0) goto L1b
            io.netty.util.internal.logging.FormattingTuple r3 = io.netty.util.internal.logging.MessageFormatter.arrayFormat(r3, r4)
            java.lang.String r4 = io.netty.util.internal.logging.JdkLogger.SELF
            java.lang.String r0 = r3.getMessage()
            java.lang.Throwable r3 = r3.getThrowable()
            r2.log(r4, r1, r0, r3)
        L1b:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void info(java.lang.String r4) {
            r3 = this;
            java.util.logging.Logger r0 = r3.logger
            java.util.logging.Level r1 = java.util.logging.Level.INFO
            boolean r0 = r0.isLoggable(r1)
            if (r0 == 0) goto L10
            java.lang.String r0 = io.netty.util.internal.logging.JdkLogger.SELF
            r2 = 0
            r3.log(r0, r1, r4, r2)
        L10:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void info(java.lang.String r3, java.lang.Object r4) {
            r2 = this;
            java.util.logging.Logger r0 = r2.logger
            java.util.logging.Level r1 = java.util.logging.Level.INFO
            boolean r0 = r0.isLoggable(r1)
            if (r0 == 0) goto L1b
            io.netty.util.internal.logging.FormattingTuple r3 = io.netty.util.internal.logging.MessageFormatter.format(r3, r4)
            java.lang.String r4 = io.netty.util.internal.logging.JdkLogger.SELF
            java.lang.String r0 = r3.getMessage()
            java.lang.Throwable r3 = r3.getThrowable()
            r2.log(r4, r1, r0, r3)
        L1b:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void info(java.lang.String r3, java.lang.Object r4, java.lang.Object r5) {
            r2 = this;
            java.util.logging.Logger r0 = r2.logger
            java.util.logging.Level r1 = java.util.logging.Level.INFO
            boolean r0 = r0.isLoggable(r1)
            if (r0 == 0) goto L1b
            io.netty.util.internal.logging.FormattingTuple r3 = io.netty.util.internal.logging.MessageFormatter.format(r3, r4, r5)
            java.lang.String r4 = io.netty.util.internal.logging.JdkLogger.SELF
            java.lang.String r5 = r3.getMessage()
            java.lang.Throwable r3 = r3.getThrowable()
            r2.log(r4, r1, r5, r3)
        L1b:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void info(java.lang.String r3, java.lang.Throwable r4) {
            r2 = this;
            java.util.logging.Logger r0 = r2.logger
            java.util.logging.Level r1 = java.util.logging.Level.INFO
            boolean r0 = r0.isLoggable(r1)
            if (r0 == 0) goto Lf
            java.lang.String r0 = io.netty.util.internal.logging.JdkLogger.SELF
            r2.log(r0, r1, r3, r4)
        Lf:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void info(java.lang.String r3, java.lang.Object... r4) {
            r2 = this;
            java.util.logging.Logger r0 = r2.logger
            java.util.logging.Level r1 = java.util.logging.Level.INFO
            boolean r0 = r0.isLoggable(r1)
            if (r0 == 0) goto L1b
            io.netty.util.internal.logging.FormattingTuple r3 = io.netty.util.internal.logging.MessageFormatter.arrayFormat(r3, r4)
            java.lang.String r4 = io.netty.util.internal.logging.JdkLogger.SELF
            java.lang.String r0 = r3.getMessage()
            java.lang.Throwable r3 = r3.getThrowable()
            r2.log(r4, r1, r0, r3)
        L1b:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public boolean isDebugEnabled() {
            r2 = this;
            java.util.logging.Logger r0 = r2.logger
            java.util.logging.Level r1 = java.util.logging.Level.FINE
            boolean r0 = r0.isLoggable(r1)
            return r0
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public boolean isErrorEnabled() {
            r2 = this;
            java.util.logging.Logger r0 = r2.logger
            java.util.logging.Level r1 = java.util.logging.Level.SEVERE
            boolean r0 = r0.isLoggable(r1)
            return r0
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public boolean isInfoEnabled() {
            r2 = this;
            java.util.logging.Logger r0 = r2.logger
            java.util.logging.Level r1 = java.util.logging.Level.INFO
            boolean r0 = r0.isLoggable(r1)
            return r0
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public boolean isTraceEnabled() {
            r2 = this;
            java.util.logging.Logger r0 = r2.logger
            java.util.logging.Level r1 = java.util.logging.Level.FINEST
            boolean r0 = r0.isLoggable(r1)
            return r0
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public boolean isWarnEnabled() {
            r2 = this;
            java.util.logging.Logger r0 = r2.logger
            java.util.logging.Level r1 = java.util.logging.Level.WARNING
            boolean r0 = r0.isLoggable(r1)
            return r0
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void trace(java.lang.String r4) {
            r3 = this;
            java.util.logging.Logger r0 = r3.logger
            java.util.logging.Level r1 = java.util.logging.Level.FINEST
            boolean r0 = r0.isLoggable(r1)
            if (r0 == 0) goto L10
            java.lang.String r0 = io.netty.util.internal.logging.JdkLogger.SELF
            r2 = 0
            r3.log(r0, r1, r4, r2)
        L10:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void trace(java.lang.String r3, java.lang.Object r4) {
            r2 = this;
            java.util.logging.Logger r0 = r2.logger
            java.util.logging.Level r1 = java.util.logging.Level.FINEST
            boolean r0 = r0.isLoggable(r1)
            if (r0 == 0) goto L1b
            io.netty.util.internal.logging.FormattingTuple r3 = io.netty.util.internal.logging.MessageFormatter.format(r3, r4)
            java.lang.String r4 = io.netty.util.internal.logging.JdkLogger.SELF
            java.lang.String r0 = r3.getMessage()
            java.lang.Throwable r3 = r3.getThrowable()
            r2.log(r4, r1, r0, r3)
        L1b:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void trace(java.lang.String r3, java.lang.Object r4, java.lang.Object r5) {
            r2 = this;
            java.util.logging.Logger r0 = r2.logger
            java.util.logging.Level r1 = java.util.logging.Level.FINEST
            boolean r0 = r0.isLoggable(r1)
            if (r0 == 0) goto L1b
            io.netty.util.internal.logging.FormattingTuple r3 = io.netty.util.internal.logging.MessageFormatter.format(r3, r4, r5)
            java.lang.String r4 = io.netty.util.internal.logging.JdkLogger.SELF
            java.lang.String r5 = r3.getMessage()
            java.lang.Throwable r3 = r3.getThrowable()
            r2.log(r4, r1, r5, r3)
        L1b:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void trace(java.lang.String r3, java.lang.Throwable r4) {
            r2 = this;
            java.util.logging.Logger r0 = r2.logger
            java.util.logging.Level r1 = java.util.logging.Level.FINEST
            boolean r0 = r0.isLoggable(r1)
            if (r0 == 0) goto Lf
            java.lang.String r0 = io.netty.util.internal.logging.JdkLogger.SELF
            r2.log(r0, r1, r3, r4)
        Lf:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void trace(java.lang.String r3, java.lang.Object... r4) {
            r2 = this;
            java.util.logging.Logger r0 = r2.logger
            java.util.logging.Level r1 = java.util.logging.Level.FINEST
            boolean r0 = r0.isLoggable(r1)
            if (r0 == 0) goto L1b
            io.netty.util.internal.logging.FormattingTuple r3 = io.netty.util.internal.logging.MessageFormatter.arrayFormat(r3, r4)
            java.lang.String r4 = io.netty.util.internal.logging.JdkLogger.SELF
            java.lang.String r0 = r3.getMessage()
            java.lang.Throwable r3 = r3.getThrowable()
            r2.log(r4, r1, r0, r3)
        L1b:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void warn(java.lang.String r4) {
            r3 = this;
            java.util.logging.Logger r0 = r3.logger
            java.util.logging.Level r1 = java.util.logging.Level.WARNING
            boolean r0 = r0.isLoggable(r1)
            if (r0 == 0) goto L10
            java.lang.String r0 = io.netty.util.internal.logging.JdkLogger.SELF
            r2 = 0
            r3.log(r0, r1, r4, r2)
        L10:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void warn(java.lang.String r3, java.lang.Object r4) {
            r2 = this;
            java.util.logging.Logger r0 = r2.logger
            java.util.logging.Level r1 = java.util.logging.Level.WARNING
            boolean r0 = r0.isLoggable(r1)
            if (r0 == 0) goto L1b
            io.netty.util.internal.logging.FormattingTuple r3 = io.netty.util.internal.logging.MessageFormatter.format(r3, r4)
            java.lang.String r4 = io.netty.util.internal.logging.JdkLogger.SELF
            java.lang.String r0 = r3.getMessage()
            java.lang.Throwable r3 = r3.getThrowable()
            r2.log(r4, r1, r0, r3)
        L1b:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void warn(java.lang.String r3, java.lang.Object r4, java.lang.Object r5) {
            r2 = this;
            java.util.logging.Logger r0 = r2.logger
            java.util.logging.Level r1 = java.util.logging.Level.WARNING
            boolean r0 = r0.isLoggable(r1)
            if (r0 == 0) goto L1b
            io.netty.util.internal.logging.FormattingTuple r3 = io.netty.util.internal.logging.MessageFormatter.format(r3, r4, r5)
            java.lang.String r4 = io.netty.util.internal.logging.JdkLogger.SELF
            java.lang.String r5 = r3.getMessage()
            java.lang.Throwable r3 = r3.getThrowable()
            r2.log(r4, r1, r5, r3)
        L1b:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void warn(java.lang.String r3, java.lang.Throwable r4) {
            r2 = this;
            java.util.logging.Logger r0 = r2.logger
            java.util.logging.Level r1 = java.util.logging.Level.WARNING
            boolean r0 = r0.isLoggable(r1)
            if (r0 == 0) goto Lf
            java.lang.String r0 = io.netty.util.internal.logging.JdkLogger.SELF
            r2.log(r0, r1, r3, r4)
        Lf:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void warn(java.lang.String r3, java.lang.Object... r4) {
            r2 = this;
            java.util.logging.Logger r0 = r2.logger
            java.util.logging.Level r1 = java.util.logging.Level.WARNING
            boolean r0 = r0.isLoggable(r1)
            if (r0 == 0) goto L1b
            io.netty.util.internal.logging.FormattingTuple r3 = io.netty.util.internal.logging.MessageFormatter.arrayFormat(r3, r4)
            java.lang.String r4 = io.netty.util.internal.logging.JdkLogger.SELF
            java.lang.String r0 = r3.getMessage()
            java.lang.Throwable r3 = r3.getThrowable()
            r2.log(r4, r1, r0, r3)
        L1b:
            return
    }
}
