package org.slf4j.event;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b implements org.slf4j.c {
    java.lang.String a;
    org.slf4j.helpers.h b;
    java.util.Queue<org.slf4j.event.d> c;

    public b(org.slf4j.helpers.h r1, java.util.Queue<org.slf4j.event.d> r2) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            java.lang.String r1 = r1.getName()
            r0.a = r1
            r0.c = r2
            return
    }

    private void b(org.slf4j.event.Level r7, java.lang.String r8, java.lang.Object[] r9, java.lang.Throwable r10) {
            r6 = this;
            r2 = 0
            r0 = r6
            r1 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.c(r1, r2, r3, r4, r5)
            return
    }

    private void c(org.slf4j.event.Level r3, org.slf4j.Marker r4, java.lang.String r5, java.lang.Object[] r6, java.lang.Throwable r7) {
            r2 = this;
            org.slf4j.event.d r4 = new org.slf4j.event.d
            r4.<init>()
            long r0 = java.lang.System.currentTimeMillis()
            r4.q(r0)
            r4.j(r3)
            org.slf4j.helpers.h r3 = r2.b
            r4.k(r3)
            java.lang.String r3 = r2.a
            r4.l(r3)
            r4.n(r5)
            r4.i(r6)
            r4.p(r7)
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            r4.o(r3)
            java.util.Queue<org.slf4j.event.d> r3 = r2.c
            r3.add(r4)
            return
    }

    @Override // org.slf4j.c
    public void debug(java.lang.String r3) {
            r2 = this;
            org.slf4j.event.Level r0 = org.slf4j.event.Level.TRACE
            r1 = 0
            r2.b(r0, r3, r1, r1)
            return
    }

    @Override // org.slf4j.c
    public void debug(java.lang.String r4, java.lang.Object r5) {
            r3 = this;
            org.slf4j.event.Level r0 = org.slf4j.event.Level.DEBUG
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r5
            r5 = 0
            r3.b(r0, r4, r1, r5)
            return
    }

    @Override // org.slf4j.c
    public void debug(java.lang.String r4, java.lang.Object r5, java.lang.Object r6) {
            r3 = this;
            org.slf4j.event.Level r0 = org.slf4j.event.Level.DEBUG
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r5
            r5 = 1
            r1[r5] = r6
            r5 = 0
            r3.b(r0, r4, r1, r5)
            return
    }

    @Override // org.slf4j.c
    public void debug(java.lang.String r3, java.lang.Throwable r4) {
            r2 = this;
            org.slf4j.event.Level r0 = org.slf4j.event.Level.DEBUG
            r1 = 0
            r2.b(r0, r3, r1, r4)
            return
    }

    @Override // org.slf4j.c
    public void debug(java.lang.String r3, java.lang.Object... r4) {
            r2 = this;
            org.slf4j.event.Level r0 = org.slf4j.event.Level.DEBUG
            r1 = 0
            r2.b(r0, r3, r4, r1)
            return
    }

    @Override // org.slf4j.c
    public void debug(org.slf4j.Marker r7, java.lang.String r8) {
            r6 = this;
            org.slf4j.event.Level r1 = org.slf4j.event.Level.DEBUG
            r4 = 0
            r5 = 0
            r0 = r6
            r2 = r7
            r3 = r8
            r0.c(r1, r2, r3, r4, r5)
            return
    }

    @Override // org.slf4j.c
    public void debug(org.slf4j.Marker r7, java.lang.String r8, java.lang.Object r9) {
            r6 = this;
            org.slf4j.event.Level r1 = org.slf4j.event.Level.DEBUG
            r0 = 1
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r0 = 0
            r4[r0] = r9
            r5 = 0
            r0 = r6
            r2 = r7
            r3 = r8
            r0.c(r1, r2, r3, r4, r5)
            return
    }

    @Override // org.slf4j.c
    public void debug(org.slf4j.Marker r7, java.lang.String r8, java.lang.Object r9, java.lang.Object r10) {
            r6 = this;
            org.slf4j.event.Level r1 = org.slf4j.event.Level.DEBUG
            r0 = 2
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r0 = 0
            r4[r0] = r9
            r9 = 1
            r4[r9] = r10
            r5 = 0
            r0 = r6
            r2 = r7
            r3 = r8
            r0.c(r1, r2, r3, r4, r5)
            return
    }

    @Override // org.slf4j.c
    public void debug(org.slf4j.Marker r7, java.lang.String r8, java.lang.Throwable r9) {
            r6 = this;
            org.slf4j.event.Level r1 = org.slf4j.event.Level.DEBUG
            r4 = 0
            r0 = r6
            r2 = r7
            r3 = r8
            r5 = r9
            r0.c(r1, r2, r3, r4, r5)
            return
    }

    @Override // org.slf4j.c
    public void debug(org.slf4j.Marker r7, java.lang.String r8, java.lang.Object... r9) {
            r6 = this;
            org.slf4j.event.Level r1 = org.slf4j.event.Level.DEBUG
            r5 = 0
            r0 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r0.c(r1, r2, r3, r4, r5)
            return
    }

    @Override // org.slf4j.c
    public void error(java.lang.String r3) {
            r2 = this;
            org.slf4j.event.Level r0 = org.slf4j.event.Level.ERROR
            r1 = 0
            r2.b(r0, r3, r1, r1)
            return
    }

    @Override // org.slf4j.c
    public void error(java.lang.String r4, java.lang.Object r5) {
            r3 = this;
            org.slf4j.event.Level r0 = org.slf4j.event.Level.ERROR
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r5
            r5 = 0
            r3.b(r0, r4, r1, r5)
            return
    }

    @Override // org.slf4j.c
    public void error(java.lang.String r4, java.lang.Object r5, java.lang.Object r6) {
            r3 = this;
            org.slf4j.event.Level r0 = org.slf4j.event.Level.ERROR
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r5
            r5 = 1
            r1[r5] = r6
            r5 = 0
            r3.b(r0, r4, r1, r5)
            return
    }

    @Override // org.slf4j.c
    public void error(java.lang.String r3, java.lang.Throwable r4) {
            r2 = this;
            org.slf4j.event.Level r0 = org.slf4j.event.Level.ERROR
            r1 = 0
            r2.b(r0, r3, r1, r4)
            return
    }

    @Override // org.slf4j.c
    public void error(java.lang.String r3, java.lang.Object... r4) {
            r2 = this;
            org.slf4j.event.Level r0 = org.slf4j.event.Level.ERROR
            r1 = 0
            r2.b(r0, r3, r4, r1)
            return
    }

    @Override // org.slf4j.c
    public void error(org.slf4j.Marker r7, java.lang.String r8) {
            r6 = this;
            org.slf4j.event.Level r1 = org.slf4j.event.Level.ERROR
            r4 = 0
            r5 = 0
            r0 = r6
            r2 = r7
            r3 = r8
            r0.c(r1, r2, r3, r4, r5)
            return
    }

    @Override // org.slf4j.c
    public void error(org.slf4j.Marker r7, java.lang.String r8, java.lang.Object r9) {
            r6 = this;
            org.slf4j.event.Level r1 = org.slf4j.event.Level.ERROR
            r0 = 1
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r0 = 0
            r4[r0] = r9
            r5 = 0
            r0 = r6
            r2 = r7
            r3 = r8
            r0.c(r1, r2, r3, r4, r5)
            return
    }

    @Override // org.slf4j.c
    public void error(org.slf4j.Marker r7, java.lang.String r8, java.lang.Object r9, java.lang.Object r10) {
            r6 = this;
            org.slf4j.event.Level r1 = org.slf4j.event.Level.ERROR
            r0 = 2
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r0 = 0
            r4[r0] = r9
            r9 = 1
            r4[r9] = r10
            r5 = 0
            r0 = r6
            r2 = r7
            r3 = r8
            r0.c(r1, r2, r3, r4, r5)
            return
    }

    @Override // org.slf4j.c
    public void error(org.slf4j.Marker r7, java.lang.String r8, java.lang.Throwable r9) {
            r6 = this;
            org.slf4j.event.Level r1 = org.slf4j.event.Level.ERROR
            r4 = 0
            r0 = r6
            r2 = r7
            r3 = r8
            r5 = r9
            r0.c(r1, r2, r3, r4, r5)
            return
    }

    @Override // org.slf4j.c
    public void error(org.slf4j.Marker r7, java.lang.String r8, java.lang.Object... r9) {
            r6 = this;
            org.slf4j.event.Level r1 = org.slf4j.event.Level.ERROR
            r5 = 0
            r0 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r0.c(r1, r2, r3, r4, r5)
            return
    }

    @Override // org.slf4j.c
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    @Override // org.slf4j.c
    public void info(java.lang.String r3) {
            r2 = this;
            org.slf4j.event.Level r0 = org.slf4j.event.Level.INFO
            r1 = 0
            r2.b(r0, r3, r1, r1)
            return
    }

    @Override // org.slf4j.c
    public void info(java.lang.String r4, java.lang.Object r5) {
            r3 = this;
            org.slf4j.event.Level r0 = org.slf4j.event.Level.INFO
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r5
            r5 = 0
            r3.b(r0, r4, r1, r5)
            return
    }

    @Override // org.slf4j.c
    public void info(java.lang.String r4, java.lang.Object r5, java.lang.Object r6) {
            r3 = this;
            org.slf4j.event.Level r0 = org.slf4j.event.Level.INFO
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r5
            r5 = 1
            r1[r5] = r6
            r5 = 0
            r3.b(r0, r4, r1, r5)
            return
    }

    @Override // org.slf4j.c
    public void info(java.lang.String r3, java.lang.Throwable r4) {
            r2 = this;
            org.slf4j.event.Level r0 = org.slf4j.event.Level.INFO
            r1 = 0
            r2.b(r0, r3, r1, r4)
            return
    }

    @Override // org.slf4j.c
    public void info(java.lang.String r3, java.lang.Object... r4) {
            r2 = this;
            org.slf4j.event.Level r0 = org.slf4j.event.Level.INFO
            r1 = 0
            r2.b(r0, r3, r4, r1)
            return
    }

    @Override // org.slf4j.c
    public void info(org.slf4j.Marker r7, java.lang.String r8) {
            r6 = this;
            org.slf4j.event.Level r1 = org.slf4j.event.Level.INFO
            r4 = 0
            r5 = 0
            r0 = r6
            r2 = r7
            r3 = r8
            r0.c(r1, r2, r3, r4, r5)
            return
    }

    @Override // org.slf4j.c
    public void info(org.slf4j.Marker r7, java.lang.String r8, java.lang.Object r9) {
            r6 = this;
            org.slf4j.event.Level r1 = org.slf4j.event.Level.INFO
            r0 = 1
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r0 = 0
            r4[r0] = r9
            r5 = 0
            r0 = r6
            r2 = r7
            r3 = r8
            r0.c(r1, r2, r3, r4, r5)
            return
    }

    @Override // org.slf4j.c
    public void info(org.slf4j.Marker r7, java.lang.String r8, java.lang.Object r9, java.lang.Object r10) {
            r6 = this;
            org.slf4j.event.Level r1 = org.slf4j.event.Level.INFO
            r0 = 2
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r0 = 0
            r4[r0] = r9
            r9 = 1
            r4[r9] = r10
            r5 = 0
            r0 = r6
            r2 = r7
            r3 = r8
            r0.c(r1, r2, r3, r4, r5)
            return
    }

    @Override // org.slf4j.c
    public void info(org.slf4j.Marker r7, java.lang.String r8, java.lang.Throwable r9) {
            r6 = this;
            org.slf4j.event.Level r1 = org.slf4j.event.Level.INFO
            r4 = 0
            r0 = r6
            r2 = r7
            r3 = r8
            r5 = r9
            r0.c(r1, r2, r3, r4, r5)
            return
    }

    @Override // org.slf4j.c
    public void info(org.slf4j.Marker r7, java.lang.String r8, java.lang.Object... r9) {
            r6 = this;
            org.slf4j.event.Level r1 = org.slf4j.event.Level.INFO
            r5 = 0
            r0 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r0.c(r1, r2, r3, r4, r5)
            return
    }

    @Override // org.slf4j.c
    public boolean isDebugEnabled() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // org.slf4j.c
    public boolean isDebugEnabled(org.slf4j.Marker r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // org.slf4j.c
    public boolean isErrorEnabled() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // org.slf4j.c
    public boolean isErrorEnabled(org.slf4j.Marker r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // org.slf4j.c
    public boolean isInfoEnabled() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // org.slf4j.c
    public boolean isInfoEnabled(org.slf4j.Marker r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // org.slf4j.c
    public boolean isTraceEnabled() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // org.slf4j.c
    public boolean isTraceEnabled(org.slf4j.Marker r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // org.slf4j.c
    public boolean isWarnEnabled() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // org.slf4j.c
    public boolean isWarnEnabled(org.slf4j.Marker r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // org.slf4j.c
    public void trace(java.lang.String r3) {
            r2 = this;
            org.slf4j.event.Level r0 = org.slf4j.event.Level.TRACE
            r1 = 0
            r2.b(r0, r3, r1, r1)
            return
    }

    @Override // org.slf4j.c
    public void trace(java.lang.String r4, java.lang.Object r5) {
            r3 = this;
            org.slf4j.event.Level r0 = org.slf4j.event.Level.TRACE
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r5
            r5 = 0
            r3.b(r0, r4, r1, r5)
            return
    }

    @Override // org.slf4j.c
    public void trace(java.lang.String r4, java.lang.Object r5, java.lang.Object r6) {
            r3 = this;
            org.slf4j.event.Level r0 = org.slf4j.event.Level.TRACE
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r5
            r5 = 1
            r1[r5] = r6
            r5 = 0
            r3.b(r0, r4, r1, r5)
            return
    }

    @Override // org.slf4j.c
    public void trace(java.lang.String r3, java.lang.Throwable r4) {
            r2 = this;
            org.slf4j.event.Level r0 = org.slf4j.event.Level.TRACE
            r1 = 0
            r2.b(r0, r3, r1, r4)
            return
    }

    @Override // org.slf4j.c
    public void trace(java.lang.String r3, java.lang.Object... r4) {
            r2 = this;
            org.slf4j.event.Level r0 = org.slf4j.event.Level.TRACE
            r1 = 0
            r2.b(r0, r3, r4, r1)
            return
    }

    @Override // org.slf4j.c
    public void trace(org.slf4j.Marker r7, java.lang.String r8) {
            r6 = this;
            org.slf4j.event.Level r1 = org.slf4j.event.Level.TRACE
            r4 = 0
            r5 = 0
            r0 = r6
            r2 = r7
            r3 = r8
            r0.c(r1, r2, r3, r4, r5)
            return
    }

    @Override // org.slf4j.c
    public void trace(org.slf4j.Marker r7, java.lang.String r8, java.lang.Object r9) {
            r6 = this;
            org.slf4j.event.Level r1 = org.slf4j.event.Level.TRACE
            r0 = 1
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r0 = 0
            r4[r0] = r9
            r5 = 0
            r0 = r6
            r2 = r7
            r3 = r8
            r0.c(r1, r2, r3, r4, r5)
            return
    }

    @Override // org.slf4j.c
    public void trace(org.slf4j.Marker r7, java.lang.String r8, java.lang.Object r9, java.lang.Object r10) {
            r6 = this;
            org.slf4j.event.Level r1 = org.slf4j.event.Level.TRACE
            r0 = 2
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r0 = 0
            r4[r0] = r9
            r9 = 1
            r4[r9] = r10
            r5 = 0
            r0 = r6
            r2 = r7
            r3 = r8
            r0.c(r1, r2, r3, r4, r5)
            return
    }

    @Override // org.slf4j.c
    public void trace(org.slf4j.Marker r7, java.lang.String r8, java.lang.Throwable r9) {
            r6 = this;
            org.slf4j.event.Level r1 = org.slf4j.event.Level.TRACE
            r4 = 0
            r0 = r6
            r2 = r7
            r3 = r8
            r5 = r9
            r0.c(r1, r2, r3, r4, r5)
            return
    }

    @Override // org.slf4j.c
    public void trace(org.slf4j.Marker r7, java.lang.String r8, java.lang.Object... r9) {
            r6 = this;
            org.slf4j.event.Level r1 = org.slf4j.event.Level.TRACE
            r5 = 0
            r0 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r0.c(r1, r2, r3, r4, r5)
            return
    }

    @Override // org.slf4j.c
    public void warn(java.lang.String r3) {
            r2 = this;
            org.slf4j.event.Level r0 = org.slf4j.event.Level.WARN
            r1 = 0
            r2.b(r0, r3, r1, r1)
            return
    }

    @Override // org.slf4j.c
    public void warn(java.lang.String r4, java.lang.Object r5) {
            r3 = this;
            org.slf4j.event.Level r0 = org.slf4j.event.Level.WARN
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r5
            r5 = 0
            r3.b(r0, r4, r1, r5)
            return
    }

    @Override // org.slf4j.c
    public void warn(java.lang.String r4, java.lang.Object r5, java.lang.Object r6) {
            r3 = this;
            org.slf4j.event.Level r0 = org.slf4j.event.Level.WARN
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r5
            r5 = 1
            r1[r5] = r6
            r5 = 0
            r3.b(r0, r4, r1, r5)
            return
    }

    @Override // org.slf4j.c
    public void warn(java.lang.String r3, java.lang.Throwable r4) {
            r2 = this;
            org.slf4j.event.Level r0 = org.slf4j.event.Level.WARN
            r1 = 0
            r2.b(r0, r3, r1, r4)
            return
    }

    @Override // org.slf4j.c
    public void warn(java.lang.String r3, java.lang.Object... r4) {
            r2 = this;
            org.slf4j.event.Level r0 = org.slf4j.event.Level.WARN
            r1 = 0
            r2.b(r0, r3, r4, r1)
            return
    }

    @Override // org.slf4j.c
    public void warn(org.slf4j.Marker r2, java.lang.String r3) {
            r1 = this;
            org.slf4j.event.Level r2 = org.slf4j.event.Level.WARN
            r0 = 0
            r1.b(r2, r3, r0, r0)
            return
    }

    @Override // org.slf4j.c
    public void warn(org.slf4j.Marker r3, java.lang.String r4, java.lang.Object r5) {
            r2 = this;
            org.slf4j.event.Level r3 = org.slf4j.event.Level.WARN
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r5
            r5 = 0
            r2.b(r3, r4, r0, r5)
            return
    }

    @Override // org.slf4j.c
    public void warn(org.slf4j.Marker r7, java.lang.String r8, java.lang.Object r9, java.lang.Object r10) {
            r6 = this;
            org.slf4j.event.Level r1 = org.slf4j.event.Level.WARN
            r0 = 2
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r0 = 0
            r4[r0] = r9
            r9 = 1
            r4[r9] = r10
            r5 = 0
            r0 = r6
            r2 = r7
            r3 = r8
            r0.c(r1, r2, r3, r4, r5)
            return
    }

    @Override // org.slf4j.c
    public void warn(org.slf4j.Marker r7, java.lang.String r8, java.lang.Throwable r9) {
            r6 = this;
            org.slf4j.event.Level r1 = org.slf4j.event.Level.WARN
            r4 = 0
            r0 = r6
            r2 = r7
            r3 = r8
            r5 = r9
            r0.c(r1, r2, r3, r4, r5)
            return
    }

    @Override // org.slf4j.c
    public void warn(org.slf4j.Marker r7, java.lang.String r8, java.lang.Object... r9) {
            r6 = this;
            org.slf4j.event.Level r1 = org.slf4j.event.Level.WARN
            r5 = 0
            r0 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r0.c(r1, r2, r3, r4, r5)
            return
    }
}
