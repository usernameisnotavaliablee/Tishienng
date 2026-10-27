package io.netty.util.internal.logging;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class LocationAwareSlf4JLogger extends io.netty.util.internal.logging.AbstractInternalLogger {
    static final java.lang.String FQCN = "io.netty.util.internal.logging.LocationAwareSlf4JLogger";
    private static final long serialVersionUID = -8292030083201538180L;
    private final transient i5.a logger;

    static {
            return
    }

    LocationAwareSlf4JLogger(i5.a r2) {
            r1 = this;
            java.lang.String r0 = r2.getName()
            r1.<init>(r0)
            r1.logger = r2
            return
    }

    private void log(int r8, java.lang.String r9) {
            r7 = this;
            i5.a r0 = r7.logger
            java.lang.String r2 = io.netty.util.internal.logging.LocationAwareSlf4JLogger.FQCN
            r5 = 0
            r6 = 0
            r1 = 0
            r3 = r8
            r4 = r9
            r0.a(r1, r2, r3, r4, r5, r6)
            return
    }

    private void log(int r8, java.lang.String r9, java.lang.Throwable r10) {
            r7 = this;
            i5.a r0 = r7.logger
            java.lang.String r2 = io.netty.util.internal.logging.LocationAwareSlf4JLogger.FQCN
            r5 = 0
            r1 = 0
            r3 = r8
            r4 = r9
            r6 = r10
            r0.a(r1, r2, r3, r4, r5, r6)
            return
    }

    private void log(int r8, org.slf4j.helpers.c r9) {
            r7 = this;
            i5.a r0 = r7.logger
            java.lang.String r2 = io.netty.util.internal.logging.LocationAwareSlf4JLogger.FQCN
            java.lang.String r4 = r9.b()
            java.lang.Object[] r5 = r9.a()
            java.lang.Throwable r6 = r9.c()
            r1 = 0
            r3 = r8
            r0.a(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void debug(java.lang.String r2) {
            r1 = this;
            boolean r0 = r1.isDebugEnabled()
            if (r0 == 0) goto Lb
            r0 = 10
            r1.log(r0, r2)
        Lb:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void debug(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            boolean r0 = r1.isDebugEnabled()
            if (r0 == 0) goto Lf
            r0 = 10
            org.slf4j.helpers.c r2 = org.slf4j.helpers.d.i(r2, r3)
            r1.log(r0, r2)
        Lf:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void debug(java.lang.String r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            boolean r0 = r1.isDebugEnabled()
            if (r0 == 0) goto Lf
            r0 = 10
            org.slf4j.helpers.c r2 = org.slf4j.helpers.d.j(r2, r3, r4)
            r1.log(r0, r2)
        Lf:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void debug(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            boolean r0 = r1.isDebugEnabled()
            if (r0 == 0) goto Lb
            r0 = 10
            r1.log(r0, r2, r3)
        Lb:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void debug(java.lang.String r2, java.lang.Object... r3) {
            r1 = this;
            boolean r0 = r1.isDebugEnabled()
            if (r0 == 0) goto Lf
            r0 = 10
            org.slf4j.helpers.c r2 = org.slf4j.helpers.d.a(r2, r3)
            r1.log(r0, r2)
        Lf:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void error(java.lang.String r2) {
            r1 = this;
            boolean r0 = r1.isErrorEnabled()
            if (r0 == 0) goto Lb
            r0 = 40
            r1.log(r0, r2)
        Lb:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void error(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            boolean r0 = r1.isErrorEnabled()
            if (r0 == 0) goto Lf
            r0 = 40
            org.slf4j.helpers.c r2 = org.slf4j.helpers.d.i(r2, r3)
            r1.log(r0, r2)
        Lf:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void error(java.lang.String r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            boolean r0 = r1.isErrorEnabled()
            if (r0 == 0) goto Lf
            r0 = 40
            org.slf4j.helpers.c r2 = org.slf4j.helpers.d.j(r2, r3, r4)
            r1.log(r0, r2)
        Lf:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void error(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            boolean r0 = r1.isErrorEnabled()
            if (r0 == 0) goto Lb
            r0 = 40
            r1.log(r0, r2, r3)
        Lb:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void error(java.lang.String r2, java.lang.Object... r3) {
            r1 = this;
            boolean r0 = r1.isErrorEnabled()
            if (r0 == 0) goto Lf
            r0 = 40
            org.slf4j.helpers.c r2 = org.slf4j.helpers.d.a(r2, r3)
            r1.log(r0, r2)
        Lf:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void info(java.lang.String r2) {
            r1 = this;
            boolean r0 = r1.isInfoEnabled()
            if (r0 == 0) goto Lb
            r0 = 20
            r1.log(r0, r2)
        Lb:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void info(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            boolean r0 = r1.isInfoEnabled()
            if (r0 == 0) goto Lf
            r0 = 20
            org.slf4j.helpers.c r2 = org.slf4j.helpers.d.i(r2, r3)
            r1.log(r0, r2)
        Lf:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void info(java.lang.String r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            boolean r0 = r1.isInfoEnabled()
            if (r0 == 0) goto Lf
            r0 = 20
            org.slf4j.helpers.c r2 = org.slf4j.helpers.d.j(r2, r3, r4)
            r1.log(r0, r2)
        Lf:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void info(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            boolean r0 = r1.isInfoEnabled()
            if (r0 == 0) goto Lb
            r0 = 20
            r1.log(r0, r2, r3)
        Lb:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void info(java.lang.String r2, java.lang.Object... r3) {
            r1 = this;
            boolean r0 = r1.isInfoEnabled()
            if (r0 == 0) goto Lf
            r0 = 20
            org.slf4j.helpers.c r2 = org.slf4j.helpers.d.a(r2, r3)
            r1.log(r0, r2)
        Lf:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public boolean isDebugEnabled() {
            r1 = this;
            i5.a r0 = r1.logger
            boolean r0 = r0.isDebugEnabled()
            return r0
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public boolean isErrorEnabled() {
            r1 = this;
            i5.a r0 = r1.logger
            boolean r0 = r0.isErrorEnabled()
            return r0
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public boolean isInfoEnabled() {
            r1 = this;
            i5.a r0 = r1.logger
            boolean r0 = r0.isInfoEnabled()
            return r0
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public boolean isTraceEnabled() {
            r1 = this;
            i5.a r0 = r1.logger
            boolean r0 = r0.isTraceEnabled()
            return r0
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public boolean isWarnEnabled() {
            r1 = this;
            i5.a r0 = r1.logger
            boolean r0 = r0.isWarnEnabled()
            return r0
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void trace(java.lang.String r2) {
            r1 = this;
            boolean r0 = r1.isTraceEnabled()
            if (r0 == 0) goto La
            r0 = 0
            r1.log(r0, r2)
        La:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void trace(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            boolean r0 = r1.isTraceEnabled()
            if (r0 == 0) goto Le
            r0 = 0
            org.slf4j.helpers.c r2 = org.slf4j.helpers.d.i(r2, r3)
            r1.log(r0, r2)
        Le:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void trace(java.lang.String r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            boolean r0 = r1.isTraceEnabled()
            if (r0 == 0) goto Le
            r0 = 0
            org.slf4j.helpers.c r2 = org.slf4j.helpers.d.j(r2, r3, r4)
            r1.log(r0, r2)
        Le:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void trace(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            boolean r0 = r1.isTraceEnabled()
            if (r0 == 0) goto La
            r0 = 0
            r1.log(r0, r2, r3)
        La:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void trace(java.lang.String r2, java.lang.Object... r3) {
            r1 = this;
            boolean r0 = r1.isTraceEnabled()
            if (r0 == 0) goto Le
            r0 = 0
            org.slf4j.helpers.c r2 = org.slf4j.helpers.d.a(r2, r3)
            r1.log(r0, r2)
        Le:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void warn(java.lang.String r2) {
            r1 = this;
            boolean r0 = r1.isWarnEnabled()
            if (r0 == 0) goto Lb
            r0 = 30
            r1.log(r0, r2)
        Lb:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void warn(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            boolean r0 = r1.isWarnEnabled()
            if (r0 == 0) goto Lf
            r0 = 30
            org.slf4j.helpers.c r2 = org.slf4j.helpers.d.i(r2, r3)
            r1.log(r0, r2)
        Lf:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void warn(java.lang.String r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            boolean r0 = r1.isWarnEnabled()
            if (r0 == 0) goto Lf
            r0 = 30
            org.slf4j.helpers.c r2 = org.slf4j.helpers.d.j(r2, r3, r4)
            r1.log(r0, r2)
        Lf:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void warn(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            boolean r0 = r1.isWarnEnabled()
            if (r0 == 0) goto Lb
            r0 = 30
            r1.log(r0, r2, r3)
        Lb:
            return
    }

    @Override // io.netty.util.internal.logging.InternalLogger
    public void warn(java.lang.String r2, java.lang.Object... r3) {
            r1 = this;
            boolean r0 = r1.isWarnEnabled()
            if (r0 == 0) goto Lf
            r0 = 30
            org.slf4j.helpers.c r2 = org.slf4j.helpers.d.a(r2, r3)
            r1.log(r0, r2)
        Lf:
            return
    }
}
