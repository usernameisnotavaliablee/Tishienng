package com.sun.mail.iap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class d {
    private byte[] a;
    private int b;
    private int c;

    public d(int r3) {
            r2 = this;
            byte[] r0 = new byte[r3]
            r1 = 0
            r2.<init>(r0, r1, r3)
            return
    }

    public d(byte[] r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public byte[] a() {
            r1 = this;
            byte[] r0 = r1.a
            return r0
    }

    public int b() {
            r1 = this;
            int r0 = r1.c
            return r0
    }

    public byte[] c() {
            r5 = this;
            int r0 = r5.c
            byte[] r1 = new byte[r0]
            byte[] r2 = r5.a
            int r3 = r5.b
            r4 = 0
            java.lang.System.arraycopy(r2, r3, r1, r4, r0)
            return r1
    }

    public int d() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    public void e(int r4) {
            r3 = this;
            byte[] r0 = r3.a
            int r1 = r0.length
            int r1 = r1 + r4
            byte[] r4 = new byte[r1]
            r1 = 0
            int r2 = r0.length
            java.lang.System.arraycopy(r0, r1, r4, r1, r2)
            r3.a = r4
            return
    }

    public void f(int r1) {
            r0 = this;
            r0.c = r1
            return
    }

    public java.io.ByteArrayInputStream g() {
            r4 = this;
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            byte[] r1 = r4.a
            int r2 = r4.b
            int r3 = r4.c
            r0.<init>(r1, r2, r3)
            return r0
    }
}
