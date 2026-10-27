package org.junit.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class AssumptionViolatedException extends java.lang.RuntimeException implements org.hamcrest.l {
    private static final long serialVersionUID = 2;
    private final java.lang.String fAssumption;
    private final org.hamcrest.j<?> fMatcher;
    private final java.lang.Object fValue;
    private final boolean fValueMatcher;

    @java.lang.Deprecated
    public AssumptionViolatedException(java.lang.Object r3, org.hamcrest.j<?> r4) {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r3, r4)
            return
    }

    @java.lang.Deprecated
    public AssumptionViolatedException(java.lang.String r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r3, r0, r1, r1)
            return
    }

    @java.lang.Deprecated
    public AssumptionViolatedException(java.lang.String r2, java.lang.Object r3, org.hamcrest.j<?> r4) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0, r3, r4)
            return
    }

    @java.lang.Deprecated
    public AssumptionViolatedException(java.lang.String r3, java.lang.Throwable r4) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r3, r0, r1, r1)
            r2.initCause(r4)
            return
    }

    @java.lang.Deprecated
    public AssumptionViolatedException(java.lang.String r1, boolean r2, java.lang.Object r3, org.hamcrest.j<?> r4) {
            r0 = this;
            r0.<init>()
            r0.fAssumption = r1
            r0.fValue = r3
            r0.fMatcher = r4
            r0.fValueMatcher = r2
            boolean r1 = r3 instanceof java.lang.Throwable
            if (r1 == 0) goto L14
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r0.initCause(r3)
        L14:
            return
    }

    @Override // org.hamcrest.l
    public void describeTo(org.hamcrest.g r2) {
            r1 = this;
            java.lang.String r0 = r1.fAssumption
            if (r0 == 0) goto L7
            r2.b(r0)
        L7:
            boolean r0 = r1.fValueMatcher
            if (r0 == 0) goto L2c
            java.lang.String r0 = r1.fAssumption
            if (r0 == 0) goto L14
            java.lang.String r0 = ": "
            r2.b(r0)
        L14:
            java.lang.String r0 = "got: "
            r2.b(r0)
            java.lang.Object r0 = r1.fValue
            r2.c(r0)
            org.hamcrest.j<?> r0 = r1.fMatcher
            if (r0 == 0) goto L2c
            java.lang.String r0 = ", expected: "
            r2.b(r0)
            org.hamcrest.j<?> r0 = r1.fMatcher
            r2.f(r0)
        L2c:
            return
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
            r1 = this;
            java.lang.String r0 = org.hamcrest.m.n(r1)
            return r0
    }
}
