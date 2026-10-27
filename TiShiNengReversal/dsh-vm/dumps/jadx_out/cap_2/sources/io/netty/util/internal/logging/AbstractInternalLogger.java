package io.netty.util.internal.logging;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class AbstractInternalLogger implements io.netty.util.internal.logging.InternalLogger, java.io.Serializable {
    static final java.lang.String EXCEPTION_MESSAGE = "Unexpected exception:";
    private static final long serialVersionUID = -6382972526573193470L;
    private final java.lang.String name;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.util.internal.logging.AbstractInternalLogger$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$util$internal$logging$InternalLogLevel = null;

        static {
                io.netty.util.internal.logging.InternalLogLevel[] r0 = io.netty.util.internal.logging.InternalLogLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.util.internal.logging.AbstractInternalLogger.AnonymousClass1.$SwitchMap$io$netty$util$internal$logging$InternalLogLevel = r0
                io.netty.util.internal.logging.InternalLogLevel r1 = io.netty.util.internal.logging.InternalLogLevel.TRACE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.util.internal.logging.AbstractInternalLogger.AnonymousClass1.$SwitchMap$io$netty$util$internal$logging$InternalLogLevel     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.util.internal.logging.InternalLogLevel r1 = io.netty.util.internal.logging.InternalLogLevel.DEBUG     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.netty.util.internal.logging.AbstractInternalLogger.AnonymousClass1.$SwitchMap$io$netty$util$internal$logging$InternalLogLevel     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.util.internal.logging.InternalLogLevel r1 = io.netty.util.internal.logging.InternalLogLevel.INFO     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = io.netty.util.internal.logging.AbstractInternalLogger.AnonymousClass1.$SwitchMap$io$netty$util$internal$logging$InternalLogLevel     // Catch: java.lang.NoSuchFieldError -> L33
                io.netty.util.internal.logging.InternalLogLevel r1 = io.netty.util.internal.logging.InternalLogLevel.WARN     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = io.netty.util.internal.logging.AbstractInternalLogger.AnonymousClass1.$SwitchMap$io$netty$util$internal$logging$InternalLogLevel     // Catch: java.lang.NoSuchFieldError -> L3e
                io.netty.util.internal.logging.InternalLogLevel r1 = io.netty.util.internal.logging.InternalLogLevel.ERROR     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    protected AbstractInternalLogger(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L8
            r1.name = r2
            return
        L8:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "name"
            r2.<init>(r0)
            throw r2
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void debug(java.lang.Throwable r2) {
            r1 = this;
            java.lang.String r0 = "Unexpected exception:"
            r1.debug(r0, r2)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void error(java.lang.Throwable r2) {
            r1 = this;
            java.lang.String r0 = "Unexpected exception:"
            r1.error(r0, r2)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void info(java.lang.Throwable r2) {
            r1 = this;
            java.lang.String r0 = "Unexpected exception:"
            r1.info(r0, r2)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public boolean isEnabled(io.netty.util.internal.logging.InternalLogLevel r2) {
            r1 = this;
            int[] r0 = io.netty.util.internal.logging.AbstractInternalLogger.AnonymousClass1.$SwitchMap$io$netty$util$internal$logging$InternalLogLevel
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            if (r2 == r0) goto L31
            r0 = 2
            if (r2 == r0) goto L2c
            r0 = 3
            if (r2 == r0) goto L27
            r0 = 4
            if (r2 == r0) goto L22
            r0 = 5
            if (r2 != r0) goto L1c
            boolean r2 = r1.isErrorEnabled()
            return r2
        L1c:
            java.lang.Error r2 = new java.lang.Error
            r2.<init>()
            throw r2
        L22:
            boolean r2 = r1.isWarnEnabled()
            return r2
        L27:
            boolean r2 = r1.isInfoEnabled()
            return r2
        L2c:
            boolean r2 = r1.isDebugEnabled()
            return r2
        L31:
            boolean r2 = r1.isTraceEnabled()
            return r2
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void log(io.netty.util.internal.logging.InternalLogLevel r2, java.lang.String r3) {
            r1 = this;
            int[] r0 = io.netty.util.internal.logging.AbstractInternalLogger.AnonymousClass1.$SwitchMap$io$netty$util$internal$logging$InternalLogLevel
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            if (r2 == r0) goto L2d
            r0 = 2
            if (r2 == r0) goto L29
            r0 = 3
            if (r2 == r0) goto L25
            r0 = 4
            if (r2 == r0) goto L21
            r0 = 5
            if (r2 != r0) goto L1b
            r1.error(r3)
            return
        L1b:
            java.lang.Error r2 = new java.lang.Error
            r2.<init>()
            throw r2
        L21:
            r1.warn(r3)
            return
        L25:
            r1.info(r3)
            return
        L29:
            r1.debug(r3)
            return
        L2d:
            r1.trace(r3)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void log(io.netty.util.internal.logging.InternalLogLevel r2, java.lang.String r3, java.lang.Object r4) {
            r1 = this;
            int[] r0 = io.netty.util.internal.logging.AbstractInternalLogger.AnonymousClass1.$SwitchMap$io$netty$util$internal$logging$InternalLogLevel
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            if (r2 == r0) goto L2d
            r0 = 2
            if (r2 == r0) goto L29
            r0 = 3
            if (r2 == r0) goto L25
            r0 = 4
            if (r2 == r0) goto L21
            r0 = 5
            if (r2 != r0) goto L1b
            r1.error(r3, r4)
            return
        L1b:
            java.lang.Error r2 = new java.lang.Error
            r2.<init>()
            throw r2
        L21:
            r1.warn(r3, r4)
            return
        L25:
            r1.info(r3, r4)
            return
        L29:
            r1.debug(r3, r4)
            return
        L2d:
            r1.trace(r3, r4)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void log(io.netty.util.internal.logging.InternalLogLevel r2, java.lang.String r3, java.lang.Object r4, java.lang.Object r5) {
            r1 = this;
            int[] r0 = io.netty.util.internal.logging.AbstractInternalLogger.AnonymousClass1.$SwitchMap$io$netty$util$internal$logging$InternalLogLevel
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            if (r2 == r0) goto L2d
            r0 = 2
            if (r2 == r0) goto L29
            r0 = 3
            if (r2 == r0) goto L25
            r0 = 4
            if (r2 == r0) goto L21
            r0 = 5
            if (r2 != r0) goto L1b
            r1.error(r3, r4, r5)
            return
        L1b:
            java.lang.Error r2 = new java.lang.Error
            r2.<init>()
            throw r2
        L21:
            r1.warn(r3, r4, r5)
            return
        L25:
            r1.info(r3, r4, r5)
            return
        L29:
            r1.debug(r3, r4, r5)
            return
        L2d:
            r1.trace(r3, r4, r5)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void log(io.netty.util.internal.logging.InternalLogLevel r2, java.lang.String r3, java.lang.Throwable r4) {
            r1 = this;
            int[] r0 = io.netty.util.internal.logging.AbstractInternalLogger.AnonymousClass1.$SwitchMap$io$netty$util$internal$logging$InternalLogLevel
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            if (r2 == r0) goto L2d
            r0 = 2
            if (r2 == r0) goto L29
            r0 = 3
            if (r2 == r0) goto L25
            r0 = 4
            if (r2 == r0) goto L21
            r0 = 5
            if (r2 != r0) goto L1b
            r1.error(r3, r4)
            return
        L1b:
            java.lang.Error r2 = new java.lang.Error
            r2.<init>()
            throw r2
        L21:
            r1.warn(r3, r4)
            return
        L25:
            r1.info(r3, r4)
            return
        L29:
            r1.debug(r3, r4)
            return
        L2d:
            r1.trace(r3, r4)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void log(io.netty.util.internal.logging.InternalLogLevel r2, java.lang.String r3, java.lang.Object... r4) {
            r1 = this;
            int[] r0 = io.netty.util.internal.logging.AbstractInternalLogger.AnonymousClass1.$SwitchMap$io$netty$util$internal$logging$InternalLogLevel
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            if (r2 == r0) goto L2d
            r0 = 2
            if (r2 == r0) goto L29
            r0 = 3
            if (r2 == r0) goto L25
            r0 = 4
            if (r2 == r0) goto L21
            r0 = 5
            if (r2 != r0) goto L1b
            r1.error(r3, r4)
            return
        L1b:
            java.lang.Error r2 = new java.lang.Error
            r2.<init>()
            throw r2
        L21:
            r1.warn(r3, r4)
            return
        L25:
            r1.info(r3, r4)
            return
        L29:
            r1.debug(r3, r4)
            return
        L2d:
            r1.trace(r3, r4)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void log(io.netty.util.internal.logging.InternalLogLevel r2, java.lang.Throwable r3) {
            r1 = this;
            int[] r0 = io.netty.util.internal.logging.AbstractInternalLogger.AnonymousClass1.$SwitchMap$io$netty$util$internal$logging$InternalLogLevel
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            if (r2 == r0) goto L2d
            r0 = 2
            if (r2 == r0) goto L29
            r0 = 3
            if (r2 == r0) goto L25
            r0 = 4
            if (r2 == r0) goto L21
            r0 = 5
            if (r2 != r0) goto L1b
            r1.error(r3)
            return
        L1b:
            java.lang.Error r2 = new java.lang.Error
            r2.<init>()
            throw r2
        L21:
            r1.warn(r3)
            return
        L25:
            r1.info(r3)
            return
        L29:
            r1.debug(r3)
            return
        L2d:
            r1.trace(r3)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public java.lang.String name() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    protected java.lang.Object readResolve() throws java.io.ObjectStreamException {
            r1 = this;
            java.lang.String r0 = r1.name()
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r2)
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            java.lang.String r1 = r2.name()
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void trace(java.lang.Throwable r2) {
            r1 = this;
            java.lang.String r0 = "Unexpected exception:"
            r1.trace(r0, r2)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void warn(java.lang.Throwable r2) {
            r1 = this;
            java.lang.String r0 = "Unexpected exception:"
            r1.warn(r0, r2)
            return
    }
}
