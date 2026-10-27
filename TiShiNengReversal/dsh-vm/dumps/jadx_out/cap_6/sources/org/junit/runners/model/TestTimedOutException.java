package org.junit.runners.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class TestTimedOutException extends java.lang.Exception {
    private static final long serialVersionUID = 31935685163547539L;
    private final java.util.concurrent.TimeUnit timeUnit;
    private final long timeout;

    public TestTimedOutException(long r5, java.util.concurrent.TimeUnit r7) {
            r4 = this;
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            java.lang.String r1 = r7.name()
            java.lang.String r1 = r1.toLowerCase()
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            java.lang.String r0 = "test timed out after %d %s"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r4.<init>(r0)
            r4.timeUnit = r7
            r4.timeout = r5
            return
    }

    public java.util.concurrent.TimeUnit getTimeUnit() {
            r1 = this;
            java.util.concurrent.TimeUnit r0 = r1.timeUnit
            return r0
    }

    public long getTimeout() {
            r2 = this;
            long r0 = r2.timeout
            return r0
    }
}
