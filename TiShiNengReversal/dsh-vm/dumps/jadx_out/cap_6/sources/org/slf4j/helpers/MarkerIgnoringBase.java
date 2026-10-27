package org.slf4j.helpers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class MarkerIgnoringBase extends org.slf4j.helpers.g implements org.slf4j.c {
    private static final long serialVersionUID = 9044267456635152283L;

    public MarkerIgnoringBase() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.slf4j.c
    public void debug(org.slf4j.Marker r1, java.lang.String r2) {
            r0 = this;
            r0.debug(r2)
            return
    }

    @Override // org.slf4j.c
    public void debug(org.slf4j.Marker r1, java.lang.String r2, java.lang.Object r3) {
            r0 = this;
            r0.debug(r2, r3)
            return
    }

    @Override // org.slf4j.c
    public void debug(org.slf4j.Marker r1, java.lang.String r2, java.lang.Object r3, java.lang.Object r4) {
            r0 = this;
            r0.debug(r2, r3, r4)
            return
    }

    @Override // org.slf4j.c
    public void debug(org.slf4j.Marker r1, java.lang.String r2, java.lang.Throwable r3) {
            r0 = this;
            r0.debug(r2, r3)
            return
    }

    @Override // org.slf4j.c
    public void debug(org.slf4j.Marker r1, java.lang.String r2, java.lang.Object... r3) {
            r0 = this;
            r0.debug(r2, r3)
            return
    }

    @Override // org.slf4j.c
    public void error(org.slf4j.Marker r1, java.lang.String r2) {
            r0 = this;
            r0.error(r2)
            return
    }

    @Override // org.slf4j.c
    public void error(org.slf4j.Marker r1, java.lang.String r2, java.lang.Object r3) {
            r0 = this;
            r0.error(r2, r3)
            return
    }

    @Override // org.slf4j.c
    public void error(org.slf4j.Marker r1, java.lang.String r2, java.lang.Object r3, java.lang.Object r4) {
            r0 = this;
            r0.error(r2, r3, r4)
            return
    }

    @Override // org.slf4j.c
    public void error(org.slf4j.Marker r1, java.lang.String r2, java.lang.Throwable r3) {
            r0 = this;
            r0.error(r2, r3)
            return
    }

    @Override // org.slf4j.c
    public void error(org.slf4j.Marker r1, java.lang.String r2, java.lang.Object... r3) {
            r0 = this;
            r0.error(r2, r3)
            return
    }

    @Override // org.slf4j.helpers.g, org.slf4j.c
    public /* bridge */ /* synthetic */ java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = super.getName()
            return r0
    }

    @Override // org.slf4j.c
    public void info(org.slf4j.Marker r1, java.lang.String r2) {
            r0 = this;
            r0.info(r2)
            return
    }

    @Override // org.slf4j.c
    public void info(org.slf4j.Marker r1, java.lang.String r2, java.lang.Object r3) {
            r0 = this;
            r0.info(r2, r3)
            return
    }

    @Override // org.slf4j.c
    public void info(org.slf4j.Marker r1, java.lang.String r2, java.lang.Object r3, java.lang.Object r4) {
            r0 = this;
            r0.info(r2, r3, r4)
            return
    }

    @Override // org.slf4j.c
    public void info(org.slf4j.Marker r1, java.lang.String r2, java.lang.Throwable r3) {
            r0 = this;
            r0.info(r2, r3)
            return
    }

    @Override // org.slf4j.c
    public void info(org.slf4j.Marker r1, java.lang.String r2, java.lang.Object... r3) {
            r0 = this;
            r0.info(r2, r3)
            return
    }

    @Override // org.slf4j.c
    public boolean isDebugEnabled(org.slf4j.Marker r1) {
            r0 = this;
            boolean r1 = r0.isDebugEnabled()
            return r1
    }

    @Override // org.slf4j.c
    public boolean isErrorEnabled(org.slf4j.Marker r1) {
            r0 = this;
            boolean r1 = r0.isErrorEnabled()
            return r1
    }

    @Override // org.slf4j.c
    public boolean isInfoEnabled(org.slf4j.Marker r1) {
            r0 = this;
            boolean r1 = r0.isInfoEnabled()
            return r1
    }

    @Override // org.slf4j.c
    public boolean isTraceEnabled(org.slf4j.Marker r1) {
            r0 = this;
            boolean r1 = r0.isTraceEnabled()
            return r1
    }

    @Override // org.slf4j.c
    public boolean isWarnEnabled(org.slf4j.Marker r1) {
            r0 = this;
            boolean r1 = r0.isWarnEnabled()
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = "("
            r0.append(r1)
            java.lang.String r1 = r2.getName()
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // org.slf4j.c
    public void trace(org.slf4j.Marker r1, java.lang.String r2) {
            r0 = this;
            r0.trace(r2)
            return
    }

    @Override // org.slf4j.c
    public void trace(org.slf4j.Marker r1, java.lang.String r2, java.lang.Object r3) {
            r0 = this;
            r0.trace(r2, r3)
            return
    }

    @Override // org.slf4j.c
    public void trace(org.slf4j.Marker r1, java.lang.String r2, java.lang.Object r3, java.lang.Object r4) {
            r0 = this;
            r0.trace(r2, r3, r4)
            return
    }

    @Override // org.slf4j.c
    public void trace(org.slf4j.Marker r1, java.lang.String r2, java.lang.Throwable r3) {
            r0 = this;
            r0.trace(r2, r3)
            return
    }

    @Override // org.slf4j.c
    public void trace(org.slf4j.Marker r1, java.lang.String r2, java.lang.Object... r3) {
            r0 = this;
            r0.trace(r2, r3)
            return
    }

    @Override // org.slf4j.c
    public void warn(org.slf4j.Marker r1, java.lang.String r2) {
            r0 = this;
            r0.warn(r2)
            return
    }

    @Override // org.slf4j.c
    public void warn(org.slf4j.Marker r1, java.lang.String r2, java.lang.Object r3) {
            r0 = this;
            r0.warn(r2, r3)
            return
    }

    @Override // org.slf4j.c
    public void warn(org.slf4j.Marker r1, java.lang.String r2, java.lang.Object r3, java.lang.Object r4) {
            r0 = this;
            r0.warn(r2, r3, r4)
            return
    }

    @Override // org.slf4j.c
    public void warn(org.slf4j.Marker r1, java.lang.String r2, java.lang.Throwable r3) {
            r0 = this;
            r0.warn(r2, r3)
            return
    }

    @Override // org.slf4j.c
    public void warn(org.slf4j.Marker r1, java.lang.String r2, java.lang.Object... r3) {
            r0 = this;
            r0.warn(r2, r3)
            return
    }
}
