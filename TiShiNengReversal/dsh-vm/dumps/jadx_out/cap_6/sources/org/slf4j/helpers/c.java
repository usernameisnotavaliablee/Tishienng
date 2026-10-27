package org.slf4j.helpers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class c {
    public static org.slf4j.helpers.c d;
    private java.lang.String a;
    private java.lang.Throwable b;
    private java.lang.Object[] c;

    static {
            org.slf4j.helpers.c r0 = new org.slf4j.helpers.c
            r1 = 0
            r0.<init>(r1)
            org.slf4j.helpers.c.d = r0
            return
    }

    public c(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r0)
            return
    }

    public c(java.lang.String r1, java.lang.Object[] r2, java.lang.Throwable r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r2
            return
    }

    public java.lang.Object[] a() {
            r1 = this;
            java.lang.Object[] r0 = r1.c
            return r0
    }

    public java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public java.lang.Throwable c() {
            r1 = this;
            java.lang.Throwable r0 = r1.b
            return r0
    }
}
