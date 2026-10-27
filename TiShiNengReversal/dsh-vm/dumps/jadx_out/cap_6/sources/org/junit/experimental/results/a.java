package org.junit.experimental.results;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class a {
    private final java.util.List<org.junit.runner.notification.Failure> a;

    public a(java.util.List<org.junit.runner.notification.Failure> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public org.junit.runner.Result a() {
            r4 = this;
            org.junit.runner.Result r0 = new org.junit.runner.Result
            r0.<init>()
            org.junit.runner.notification.RunListener r1 = r0.createListener()
            java.util.List<org.junit.runner.notification.Failure> r2 = r4.a
            java.util.Iterator r2 = r2.iterator()
        Lf:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L27
            java.lang.Object r3 = r2.next()
            org.junit.runner.notification.Failure r3 = (org.junit.runner.notification.Failure) r3
            r1.b(r3)     // Catch: java.lang.Exception -> L1f
            goto Lf
        L1f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "I can't believe this happened"
            r0.<init>(r1)
            throw r0
        L27:
            return r0
    }
}
