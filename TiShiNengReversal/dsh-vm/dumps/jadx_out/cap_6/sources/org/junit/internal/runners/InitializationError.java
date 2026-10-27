package org.junit.internal.runners;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class InitializationError extends java.lang.Exception {
    private static final long serialVersionUID = 1;
    private final java.util.List<java.lang.Throwable> fErrors;

    public InitializationError(java.lang.String r3) {
            r2 = this;
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r3)
            r3 = 1
            java.lang.Throwable[] r3 = new java.lang.Throwable[r3]
            r1 = 0
            r3[r1] = r0
            r2.<init>(r3)
            return
    }

    public InitializationError(java.util.List<java.lang.Throwable> r1) {
            r0 = this;
            r0.<init>()
            r0.fErrors = r1
            return
    }

    public InitializationError(java.lang.Throwable... r1) {
            r0 = this;
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            return
    }

    public java.util.List<java.lang.Throwable> getCauses() {
            r1 = this;
            java.util.List<java.lang.Throwable> r0 = r1.fErrors
            return r0
    }
}
