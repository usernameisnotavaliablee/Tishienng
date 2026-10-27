package io.netty.util.internal.logging;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class Log4J2Logger extends org.apache.logging.log4j.spi.ExtendedLoggerWrapper implements io.netty.util.internal.logging.InternalLogger {
    private static final boolean VARARGS_ONLY = false;
    private static final long serialVersionUID = 5485418394879791397L;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.util.internal.logging.Log4J2Logger$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$util$internal$logging$InternalLogLevel = null;

        static {
                io.netty.util.internal.logging.InternalLogLevel[] r0 = io.netty.util.internal.logging.InternalLogLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.util.internal.logging.Log4J2Logger.AnonymousClass2.$SwitchMap$io$netty$util$internal$logging$InternalLogLevel = r0
                io.netty.util.internal.logging.InternalLogLevel r1 = io.netty.util.internal.logging.InternalLogLevel.INFO     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.util.internal.logging.Log4J2Logger.AnonymousClass2.$SwitchMap$io$netty$util$internal$logging$InternalLogLevel     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.util.internal.logging.InternalLogLevel r1 = io.netty.util.internal.logging.InternalLogLevel.DEBUG     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.netty.util.internal.logging.Log4J2Logger.AnonymousClass2.$SwitchMap$io$netty$util$internal$logging$InternalLogLevel     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.util.internal.logging.InternalLogLevel r1 = io.netty.util.internal.logging.InternalLogLevel.WARN     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = io.netty.util.internal.logging.Log4J2Logger.AnonymousClass2.$SwitchMap$io$netty$util$internal$logging$InternalLogLevel     // Catch: java.lang.NoSuchFieldError -> L33
                io.netty.util.internal.logging.InternalLogLevel r1 = io.netty.util.internal.logging.InternalLogLevel.ERROR     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = io.netty.util.internal.logging.Log4J2Logger.AnonymousClass2.$SwitchMap$io$netty$util$internal$logging$InternalLogLevel     // Catch: java.lang.NoSuchFieldError -> L3e
                io.netty.util.internal.logging.InternalLogLevel r1 = io.netty.util.internal.logging.InternalLogLevel.TRACE     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                return
        }

        public AnonymousClass2() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    static {
            io.netty.util.internal.logging.Log4J2Logger$1 r0 = new io.netty.util.internal.logging.Log4J2Logger$1
            r0.<init>()
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            io.netty.util.internal.logging.Log4J2Logger.VARARGS_ONLY = r0
            return
    }

    Log4J2Logger(org.apache.logging.log4j.Logger r3) {
            r2 = this;
            r0 = r3
            org.apache.logging.log4j.spi.ExtendedLogger r0 = (org.apache.logging.log4j.spi.ExtendedLogger) r0
            java.lang.String r1 = r3.getName()
            org.apache.logging.log4j.message.MessageFactory r3 = r3.getMessageFactory()
            r2.<init>(r0, r1, r3)
            boolean r3 = io.netty.util.internal.logging.Log4J2Logger.VARARGS_ONLY
            if (r3 != 0) goto L13
            return
        L13:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Log4J2 version mismatch"
            r3.<init>(r0)
            throw r3
    }

    private static org.apache.logging.log4j.Level toLevel(io.netty.util.internal.logging.InternalLogLevel r1) {
            int[] r0 = io.netty.util.internal.logging.Log4J2Logger.AnonymousClass2.$SwitchMap$io$netty$util$internal$logging$InternalLogLevel
            int r1 = r1.ordinal()
            r1 = r0[r1]
            r0 = 1
            if (r1 == r0) goto L29
            r0 = 2
            if (r1 == r0) goto L26
            r0 = 3
            if (r1 == r0) goto L23
            r0 = 4
            if (r1 == r0) goto L20
            r0 = 5
            if (r1 != r0) goto L1a
            org.apache.logging.log4j.Level r1 = org.apache.logging.log4j.Level.TRACE
            return r1
        L1a:
            java.lang.Error r1 = new java.lang.Error
            r1.<init>()
            throw r1
        L20:
            org.apache.logging.log4j.Level r1 = org.apache.logging.log4j.Level.ERROR
            return r1
        L23:
            org.apache.logging.log4j.Level r1 = org.apache.logging.log4j.Level.WARN
            return r1
        L26:
            org.apache.logging.log4j.Level r1 = org.apache.logging.log4j.Level.DEBUG
            return r1
        L29:
            org.apache.logging.log4j.Level r1 = org.apache.logging.log4j.Level.INFO
            return r1
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void debug(java.lang.Throwable r3) {
            r2 = this;
            org.apache.logging.log4j.Level r0 = org.apache.logging.log4j.Level.DEBUG
            java.lang.String r1 = "Unexpected exception:"
            r2.log(r0, r1, r3)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void error(java.lang.Throwable r3) {
            r2 = this;
            org.apache.logging.log4j.Level r0 = org.apache.logging.log4j.Level.ERROR
            java.lang.String r1 = "Unexpected exception:"
            r2.log(r0, r1, r3)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void info(java.lang.Throwable r3) {
            r2 = this;
            org.apache.logging.log4j.Level r0 = org.apache.logging.log4j.Level.INFO
            java.lang.String r1 = "Unexpected exception:"
            r2.log(r0, r1, r3)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public boolean isEnabled(io.netty.util.internal.logging.InternalLogLevel r1) {
            r0 = this;
            org.apache.logging.log4j.Level r1 = toLevel(r1)
            boolean r1 = r0.isEnabled(r1)
            return r1
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void log(io.netty.util.internal.logging.InternalLogLevel r1, java.lang.String r2) {
            r0 = this;
            org.apache.logging.log4j.Level r1 = toLevel(r1)
            r0.log(r1, r2)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void log(io.netty.util.internal.logging.InternalLogLevel r1, java.lang.String r2, java.lang.Object r3) {
            r0 = this;
            org.apache.logging.log4j.Level r1 = toLevel(r1)
            r0.log(r1, r2, r3)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void log(io.netty.util.internal.logging.InternalLogLevel r1, java.lang.String r2, java.lang.Object r3, java.lang.Object r4) {
            r0 = this;
            org.apache.logging.log4j.Level r1 = toLevel(r1)
            r0.log(r1, r2, r3, r4)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void log(io.netty.util.internal.logging.InternalLogLevel r1, java.lang.String r2, java.lang.Throwable r3) {
            r0 = this;
            org.apache.logging.log4j.Level r1 = toLevel(r1)
            r0.log(r1, r2, r3)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void log(io.netty.util.internal.logging.InternalLogLevel r1, java.lang.String r2, java.lang.Object... r3) {
            r0 = this;
            org.apache.logging.log4j.Level r1 = toLevel(r1)
            r0.log(r1, r2, r3)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void log(io.netty.util.internal.logging.InternalLogLevel r2, java.lang.Throwable r3) {
            r1 = this;
            org.apache.logging.log4j.Level r2 = toLevel(r2)
            java.lang.String r0 = "Unexpected exception:"
            r1.log(r2, r0, r3)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public java.lang.String name() {
            r1 = this;
            java.lang.String r0 = r1.getName()
            return r0
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void trace(java.lang.Throwable r3) {
            r2 = this;
            org.apache.logging.log4j.Level r0 = org.apache.logging.log4j.Level.TRACE
            java.lang.String r1 = "Unexpected exception:"
            r2.log(r0, r1, r3)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void warn(java.lang.Throwable r3) {
            r2 = this;
            org.apache.logging.log4j.Level r0 = org.apache.logging.log4j.Level.WARN
            java.lang.String r1 = "Unexpected exception:"
            r2.log(r0, r1, r3)
            return
    }
}
