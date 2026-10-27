package org.slf4j.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class a extends org.slf4j.helpers.MarkerIgnoringBase {
    private static final long serialVersionUID = -1227274521521287937L;

    a(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.name = r1
            return
    }

    private void b(int r2, java.lang.String r3, java.lang.Object... r4) {
            r1 = this;
            boolean r0 = r1.c(r2)
            if (r0 == 0) goto L15
            org.slf4j.helpers.c r3 = org.slf4j.helpers.d.a(r3, r4)
            java.lang.String r4 = r3.b()
            java.lang.Throwable r3 = r3.c()
            r1.e(r2, r4, r3)
        L15:
            return
    }

    private boolean c(int r2) {
            r1 = this;
            java.lang.String r0 = r1.name
            boolean r2 = android.util.Log.isLoggable(r0, r2)
            return r2
    }

    private void d(int r2, java.lang.String r3, java.lang.Throwable r4) {
            r1 = this;
            boolean r0 = r1.c(r2)
            if (r0 == 0) goto L9
            r1.e(r2, r3, r4)
        L9:
            return
    }

    private void e(int r2, java.lang.String r3, java.lang.Throwable r4) {
            r1 = this;
            if (r4 == 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r3 = 10
            r0.append(r3)
            java.lang.String r3 = android.util.Log.getStackTraceString(r4)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
        L1a:
            java.lang.String r4 = r1.name
            android.util.Log.println(r2, r4, r3)
            return
    }

    @Override // org.slf4j.c
    public void debug(java.lang.String r3) {
            r2 = this;
            r0 = 3
            r1 = 0
            r2.d(r0, r3, r1)
            return
    }

    @Override // org.slf4j.c
    public void debug(java.lang.String r3, java.lang.Object r4) {
            r2 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            r4 = 3
            r2.b(r4, r3, r0)
            return
    }

    @Override // org.slf4j.c
    public void debug(java.lang.String r3, java.lang.Object r4, java.lang.Object r5) {
            r2 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            r4 = 1
            r0[r4] = r5
            r4 = 3
            r2.b(r4, r3, r0)
            return
    }

    @Override // org.slf4j.c
    public void debug(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            r0 = 2
            r1.d(r0, r2, r3)
            return
    }

    @Override // org.slf4j.c
    public void debug(java.lang.String r2, java.lang.Object... r3) {
            r1 = this;
            r0 = 3
            r1.b(r0, r2, r3)
            return
    }

    @Override // org.slf4j.c
    public void error(java.lang.String r3) {
            r2 = this;
            r0 = 6
            r1 = 0
            r2.d(r0, r3, r1)
            return
    }

    @Override // org.slf4j.c
    public void error(java.lang.String r3, java.lang.Object r4) {
            r2 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            r4 = 6
            r2.b(r4, r3, r0)
            return
    }

    @Override // org.slf4j.c
    public void error(java.lang.String r3, java.lang.Object r4, java.lang.Object r5) {
            r2 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            r4 = 1
            r0[r4] = r5
            r4 = 6
            r2.b(r4, r3, r0)
            return
    }

    @Override // org.slf4j.c
    public void error(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            r0 = 6
            r1.d(r0, r2, r3)
            return
    }

    @Override // org.slf4j.c
    public void error(java.lang.String r2, java.lang.Object... r3) {
            r1 = this;
            r0 = 6
            r1.b(r0, r2, r3)
            return
    }

    @Override // org.slf4j.c
    public void info(java.lang.String r3) {
            r2 = this;
            r0 = 4
            r1 = 0
            r2.d(r0, r3, r1)
            return
    }

    @Override // org.slf4j.c
    public void info(java.lang.String r3, java.lang.Object r4) {
            r2 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            r4 = 4
            r2.b(r4, r3, r0)
            return
    }

    @Override // org.slf4j.c
    public void info(java.lang.String r3, java.lang.Object r4, java.lang.Object r5) {
            r2 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            r4 = 1
            r0[r4] = r5
            r4 = 4
            r2.b(r4, r3, r0)
            return
    }

    @Override // org.slf4j.c
    public void info(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            r0 = 4
            r1.d(r0, r2, r3)
            return
    }

    @Override // org.slf4j.c
    public void info(java.lang.String r2, java.lang.Object... r3) {
            r1 = this;
            r0 = 4
            r1.b(r0, r2, r3)
            return
    }

    @Override // org.slf4j.c
    public boolean isDebugEnabled() {
            r1 = this;
            r0 = 3
            boolean r0 = r1.c(r0)
            return r0
    }

    @Override // org.slf4j.c
    public boolean isErrorEnabled() {
            r1 = this;
            r0 = 6
            boolean r0 = r1.c(r0)
            return r0
    }

    @Override // org.slf4j.c
    public boolean isInfoEnabled() {
            r1 = this;
            r0 = 4
            boolean r0 = r1.c(r0)
            return r0
    }

    @Override // org.slf4j.c
    public boolean isTraceEnabled() {
            r1 = this;
            r0 = 2
            boolean r0 = r1.c(r0)
            return r0
    }

    @Override // org.slf4j.c
    public boolean isWarnEnabled() {
            r1 = this;
            r0 = 5
            boolean r0 = r1.c(r0)
            return r0
    }

    @Override // org.slf4j.c
    public void trace(java.lang.String r3) {
            r2 = this;
            r0 = 2
            r1 = 0
            r2.d(r0, r3, r1)
            return
    }

    @Override // org.slf4j.c
    public void trace(java.lang.String r3, java.lang.Object r4) {
            r2 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            r4 = 2
            r2.b(r4, r3, r0)
            return
    }

    @Override // org.slf4j.c
    public void trace(java.lang.String r4, java.lang.Object r5, java.lang.Object r6) {
            r3 = this;
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r5
            r5 = 1
            r1[r5] = r6
            r3.b(r0, r4, r1)
            return
    }

    @Override // org.slf4j.c
    public void trace(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            r0 = 2
            r1.d(r0, r2, r3)
            return
    }

    @Override // org.slf4j.c
    public void trace(java.lang.String r2, java.lang.Object... r3) {
            r1 = this;
            r0 = 2
            r1.b(r0, r2, r3)
            return
    }

    @Override // org.slf4j.c
    public void warn(java.lang.String r3) {
            r2 = this;
            r0 = 5
            r1 = 0
            r2.d(r0, r3, r1)
            return
    }

    @Override // org.slf4j.c
    public void warn(java.lang.String r3, java.lang.Object r4) {
            r2 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            r4 = 5
            r2.b(r4, r3, r0)
            return
    }

    @Override // org.slf4j.c
    public void warn(java.lang.String r3, java.lang.Object r4, java.lang.Object r5) {
            r2 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            r4 = 1
            r0[r4] = r5
            r4 = 5
            r2.b(r4, r3, r0)
            return
    }

    @Override // org.slf4j.c
    public void warn(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            r0 = 5
            r1.d(r0, r2, r3)
            return
    }

    @Override // org.slf4j.c
    public void warn(java.lang.String r2, java.lang.Object... r3) {
            r1 = this;
            r0 = 5
            r1.b(r0, r2, r3)
            return
    }
}
