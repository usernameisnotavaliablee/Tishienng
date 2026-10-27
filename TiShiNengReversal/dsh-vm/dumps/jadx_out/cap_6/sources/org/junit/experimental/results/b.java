package org.junit.experimental.results;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b {
    private org.junit.runner.Result a;

    public b(java.util.List<org.junit.runner.notification.Failure> r2) {
            r1 = this;
            org.junit.experimental.results.a r0 = new org.junit.experimental.results.a
            r0.<init>(r2)
            org.junit.runner.Result r2 = r0.a()
            r1.<init>(r2)
            return
    }

    private b(org.junit.runner.Result r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static org.junit.experimental.results.b b(java.lang.Class<?> r0) {
            org.junit.runner.f r0 = org.junit.runner.f.a(r0)
            org.junit.experimental.results.b r0 = c(r0)
            return r0
    }

    public static org.junit.experimental.results.b c(org.junit.runner.f r2) {
            org.junit.experimental.results.b r0 = new org.junit.experimental.results.b
            org.junit.runner.e r1 = new org.junit.runner.e
            r1.<init>()
            org.junit.runner.Result r2 = r1.h(r2)
            r0.<init>(r2)
            return r0
    }

    public int a() {
            r1 = this;
            org.junit.runner.Result r0 = r1.a
            java.util.List r0 = r0.getFailures()
            int r0 = r0.size()
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            org.junit.internal.h r1 = new org.junit.internal.h
            java.io.PrintStream r2 = new java.io.PrintStream
            r2.<init>(r0)
            r1.<init>(r2)
            org.junit.runner.Result r2 = r3.a
            r1.e(r2)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
