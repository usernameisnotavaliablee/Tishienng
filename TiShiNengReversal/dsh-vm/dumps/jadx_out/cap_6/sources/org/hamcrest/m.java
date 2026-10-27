package org.hamcrest;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class m extends org.hamcrest.a {
    private final java.lang.Appendable b;

    public m() {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1.<init>(r0)
            return
    }

    public m(java.lang.Appendable r1) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            return
    }

    public static java.lang.String n(org.hamcrest.l r0) {
            java.lang.String r0 = o(r0)
            return r0
    }

    public static java.lang.String o(org.hamcrest.l r1) {
            org.hamcrest.m r0 = new org.hamcrest.m
            r0.<init>()
            org.hamcrest.g r1 = r0.f(r1)
            java.lang.String r1 = r1.toString()
            return r1
    }

    @Override // org.hamcrest.a
    protected void g(char r3) {
            r2 = this;
            java.lang.Appendable r0 = r2.b     // Catch: java.io.IOException -> L6
            r0.append(r3)     // Catch: java.io.IOException -> L6
            return
        L6:
            r3 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Could not write description"
            r0.<init>(r1, r3)
            throw r0
    }

    @Override // org.hamcrest.a
    protected void h(java.lang.String r3) {
            r2 = this;
            java.lang.Appendable r0 = r2.b     // Catch: java.io.IOException -> L6
            r0.append(r3)     // Catch: java.io.IOException -> L6
            return
        L6:
            r3 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Could not write description"
            r0.<init>(r1, r3)
            throw r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.Appendable r0 = r1.b
            java.lang.String r0 = r0.toString()
            return r0
    }
}
