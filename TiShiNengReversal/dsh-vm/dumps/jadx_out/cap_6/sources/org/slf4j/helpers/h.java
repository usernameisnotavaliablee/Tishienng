package org.slf4j.helpers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class h implements org.slf4j.c {
    private final java.lang.String a;
    private volatile org.slf4j.c b;
    private java.lang.Boolean c;
    private java.lang.reflect.Method d;
    private org.slf4j.event.b e;
    private java.util.Queue<org.slf4j.event.d> f;
    private final boolean g;

    public h(java.lang.String r1, java.util.Queue<org.slf4j.event.d> r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.f = r2
            r0.g = r3
            return
    }

    private org.slf4j.c c() {
            r2 = this;
            org.slf4j.event.b r0 = r2.e
            if (r0 != 0) goto Ld
            org.slf4j.event.b r0 = new org.slf4j.event.b
            java.util.Queue<org.slf4j.event.d> r1 = r2.f
            r0.<init>(r2, r1)
            r2.e = r0
        Ld:
            org.slf4j.event.b r0 = r2.e
            return r0
    }

    org.slf4j.c b() {
            r1 = this;
            org.slf4j.c r0 = r1.b
            if (r0 == 0) goto L7
            org.slf4j.c r0 = r1.b
            return r0
        L7:
            boolean r0 = r1.g
            if (r0 == 0) goto Le
            org.slf4j.helpers.NOPLogger r0 = org.slf4j.helpers.NOPLogger.NOP_LOGGER
            return r0
        Le:
            org.slf4j.c r0 = r1.c()
            return r0
    }

    public boolean d() {
            r5 = this;
            java.lang.Boolean r0 = r5.c
            if (r0 == 0) goto L9
            boolean r0 = r0.booleanValue()
            return r0
        L9:
            org.slf4j.c r0 = r5.b     // Catch: java.lang.NoSuchMethodException -> L24
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.NoSuchMethodException -> L24
            java.lang.String r1 = "log"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L24
            java.lang.Class<org.slf4j.event.c> r3 = org.slf4j.event.c.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.NoSuchMethodException -> L24
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L24
            r5.d = r0     // Catch: java.lang.NoSuchMethodException -> L24
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.NoSuchMethodException -> L24
            r5.c = r0     // Catch: java.lang.NoSuchMethodException -> L24
            goto L28
        L24:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r5.c = r0
        L28:
            java.lang.Boolean r0 = r5.c
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // org.slf4j.c
    public void debug(java.lang.String r2) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            r0.debug(r2)
            return
    }

    @Override // org.slf4j.c
    public void debug(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            r0.debug(r2, r3)
            return
    }

    @Override // org.slf4j.c
    public void debug(java.lang.String r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            r0.debug(r2, r3, r4)
            return
    }

    @Override // org.slf4j.c
    public void debug(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            r0.debug(r2, r3)
            return
    }

    @Override // org.slf4j.c
    public void debug(java.lang.String r2, java.lang.Object... r3) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            r0.debug(r2, r3)
            return
    }

    @Override // org.slf4j.c
    public void debug(org.slf4j.Marker r2, java.lang.String r3) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            r0.debug(r2, r3)
            return
    }

    @Override // org.slf4j.c
    public void debug(org.slf4j.Marker r2, java.lang.String r3, java.lang.Object r4) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            r0.debug(r2, r3, r4)
            return
    }

    @Override // org.slf4j.c
    public void debug(org.slf4j.Marker r2, java.lang.String r3, java.lang.Object r4, java.lang.Object r5) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            r0.debug(r2, r3, r4, r5)
            return
    }

    @Override // org.slf4j.c
    public void debug(org.slf4j.Marker r2, java.lang.String r3, java.lang.Throwable r4) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            r0.debug(r2, r3, r4)
            return
    }

    @Override // org.slf4j.c
    public void debug(org.slf4j.Marker r2, java.lang.String r3, java.lang.Object... r4) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            r0.debug(r2, r3, r4)
            return
    }

    public boolean e() {
            r1 = this;
            org.slf4j.c r0 = r1.b
            boolean r0 = r0 instanceof org.slf4j.helpers.NOPLogger
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L20
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L20
        L12:
            org.slf4j.helpers.h r5 = (org.slf4j.helpers.h) r5
            java.lang.String r2 = r4.a
            java.lang.String r5 = r5.a
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L1f
            return r1
        L1f:
            return r0
        L20:
            return r1
    }

    @Override // org.slf4j.c
    public void error(java.lang.String r2) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            r0.error(r2)
            return
    }

    @Override // org.slf4j.c
    public void error(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            r0.error(r2, r3)
            return
    }

    @Override // org.slf4j.c
    public void error(java.lang.String r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            r0.error(r2, r3, r4)
            return
    }

    @Override // org.slf4j.c
    public void error(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            r0.error(r2, r3)
            return
    }

    @Override // org.slf4j.c
    public void error(java.lang.String r2, java.lang.Object... r3) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            r0.error(r2, r3)
            return
    }

    @Override // org.slf4j.c
    public void error(org.slf4j.Marker r2, java.lang.String r3) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            r0.error(r2, r3)
            return
    }

    @Override // org.slf4j.c
    public void error(org.slf4j.Marker r2, java.lang.String r3, java.lang.Object r4) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            r0.error(r2, r3, r4)
            return
    }

    @Override // org.slf4j.c
    public void error(org.slf4j.Marker r2, java.lang.String r3, java.lang.Object r4, java.lang.Object r5) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            r0.error(r2, r3, r4, r5)
            return
    }

    @Override // org.slf4j.c
    public void error(org.slf4j.Marker r2, java.lang.String r3, java.lang.Throwable r4) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            r0.error(r2, r3, r4)
            return
    }

    @Override // org.slf4j.c
    public void error(org.slf4j.Marker r2, java.lang.String r3, java.lang.Object... r4) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            r0.error(r2, r3, r4)
            return
    }

    public boolean f() {
            r1 = this;
            org.slf4j.c r0 = r1.b
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public void g(org.slf4j.event.c r5) {
            r4 = this;
            boolean r0 = r4.d()
            if (r0 == 0) goto L13
            java.lang.reflect.Method r0 = r4.d     // Catch: java.lang.Throwable -> L13
            org.slf4j.c r1 = r4.b     // Catch: java.lang.Throwable -> L13
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L13
            r3 = 0
            r2[r3] = r5     // Catch: java.lang.Throwable -> L13
            r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L13
        L13:
            return
    }

    @Override // org.slf4j.c
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public void h(org.slf4j.c r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.a
            int r0 = r0.hashCode()
            return r0
    }

    @Override // org.slf4j.c
    public void info(java.lang.String r2) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            r0.info(r2)
            return
    }

    @Override // org.slf4j.c
    public void info(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            r0.info(r2, r3)
            return
    }

    @Override // org.slf4j.c
    public void info(java.lang.String r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            r0.info(r2, r3, r4)
            return
    }

    @Override // org.slf4j.c
    public void info(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            r0.info(r2, r3)
            return
    }

    @Override // org.slf4j.c
    public void info(java.lang.String r2, java.lang.Object... r3) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            r0.info(r2, r3)
            return
    }

    @Override // org.slf4j.c
    public void info(org.slf4j.Marker r2, java.lang.String r3) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            r0.info(r2, r3)
            return
    }

    @Override // org.slf4j.c
    public void info(org.slf4j.Marker r2, java.lang.String r3, java.lang.Object r4) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            r0.info(r2, r3, r4)
            return
    }

    @Override // org.slf4j.c
    public void info(org.slf4j.Marker r2, java.lang.String r3, java.lang.Object r4, java.lang.Object r5) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            r0.info(r2, r3, r4, r5)
            return
    }

    @Override // org.slf4j.c
    public void info(org.slf4j.Marker r2, java.lang.String r3, java.lang.Throwable r4) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            r0.info(r2, r3, r4)
            return
    }

    @Override // org.slf4j.c
    public void info(org.slf4j.Marker r2, java.lang.String r3, java.lang.Object... r4) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            r0.info(r2, r3, r4)
            return
    }

    @Override // org.slf4j.c
    public boolean isDebugEnabled() {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            boolean r0 = r0.isDebugEnabled()
            return r0
    }

    @Override // org.slf4j.c
    public boolean isDebugEnabled(org.slf4j.Marker r2) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            boolean r2 = r0.isDebugEnabled(r2)
            return r2
    }

    @Override // org.slf4j.c
    public boolean isErrorEnabled() {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            boolean r0 = r0.isErrorEnabled()
            return r0
    }

    @Override // org.slf4j.c
    public boolean isErrorEnabled(org.slf4j.Marker r2) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            boolean r2 = r0.isErrorEnabled(r2)
            return r2
    }

    @Override // org.slf4j.c
    public boolean isInfoEnabled() {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            boolean r0 = r0.isInfoEnabled()
            return r0
    }

    @Override // org.slf4j.c
    public boolean isInfoEnabled(org.slf4j.Marker r2) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            boolean r2 = r0.isInfoEnabled(r2)
            return r2
    }

    @Override // org.slf4j.c
    public boolean isTraceEnabled() {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            boolean r0 = r0.isTraceEnabled()
            return r0
    }

    @Override // org.slf4j.c
    public boolean isTraceEnabled(org.slf4j.Marker r2) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            boolean r2 = r0.isTraceEnabled(r2)
            return r2
    }

    @Override // org.slf4j.c
    public boolean isWarnEnabled() {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            boolean r0 = r0.isWarnEnabled()
            return r0
    }

    @Override // org.slf4j.c
    public boolean isWarnEnabled(org.slf4j.Marker r2) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            boolean r2 = r0.isWarnEnabled(r2)
            return r2
    }

    @Override // org.slf4j.c
    public void trace(java.lang.String r2) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            r0.trace(r2)
            return
    }

    @Override // org.slf4j.c
    public void trace(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            r0.trace(r2, r3)
            return
    }

    @Override // org.slf4j.c
    public void trace(java.lang.String r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            r0.trace(r2, r3, r4)
            return
    }

    @Override // org.slf4j.c
    public void trace(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            r0.trace(r2, r3)
            return
    }

    @Override // org.slf4j.c
    public void trace(java.lang.String r2, java.lang.Object... r3) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            r0.trace(r2, r3)
            return
    }

    @Override // org.slf4j.c
    public void trace(org.slf4j.Marker r2, java.lang.String r3) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            r0.trace(r2, r3)
            return
    }

    @Override // org.slf4j.c
    public void trace(org.slf4j.Marker r2, java.lang.String r3, java.lang.Object r4) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            r0.trace(r2, r3, r4)
            return
    }

    @Override // org.slf4j.c
    public void trace(org.slf4j.Marker r2, java.lang.String r3, java.lang.Object r4, java.lang.Object r5) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            r0.trace(r2, r3, r4, r5)
            return
    }

    @Override // org.slf4j.c
    public void trace(org.slf4j.Marker r2, java.lang.String r3, java.lang.Throwable r4) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            r0.trace(r2, r3, r4)
            return
    }

    @Override // org.slf4j.c
    public void trace(org.slf4j.Marker r2, java.lang.String r3, java.lang.Object... r4) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            r0.trace(r2, r3, r4)
            return
    }

    @Override // org.slf4j.c
    public void warn(java.lang.String r2) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            r0.warn(r2)
            return
    }

    @Override // org.slf4j.c
    public void warn(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            r0.warn(r2, r3)
            return
    }

    @Override // org.slf4j.c
    public void warn(java.lang.String r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            r0.warn(r2, r3, r4)
            return
    }

    @Override // org.slf4j.c
    public void warn(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            r0.warn(r2, r3)
            return
    }

    @Override // org.slf4j.c
    public void warn(java.lang.String r2, java.lang.Object... r3) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            r0.warn(r2, r3)
            return
    }

    @Override // org.slf4j.c
    public void warn(org.slf4j.Marker r2, java.lang.String r3) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            r0.warn(r2, r3)
            return
    }

    @Override // org.slf4j.c
    public void warn(org.slf4j.Marker r2, java.lang.String r3, java.lang.Object r4) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            r0.warn(r2, r3, r4)
            return
    }

    @Override // org.slf4j.c
    public void warn(org.slf4j.Marker r2, java.lang.String r3, java.lang.Object r4, java.lang.Object r5) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            r0.warn(r2, r3, r4, r5)
            return
    }

    @Override // org.slf4j.c
    public void warn(org.slf4j.Marker r2, java.lang.String r3, java.lang.Throwable r4) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            r0.warn(r2, r3, r4)
            return
    }

    @Override // org.slf4j.c
    public void warn(org.slf4j.Marker r2, java.lang.String r3, java.lang.Object... r4) {
            r1 = this;
            org.slf4j.c r0 = r1.b()
            r0.warn(r2, r3, r4)
            return
    }
}
