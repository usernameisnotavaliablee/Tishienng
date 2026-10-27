package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class w1 {
    private final byte[] a;
    private int b;
    private final java.lang.String c;
    private final java.util.List<byte[]> d;
    private final java.lang.String e;
    private java.lang.Integer f;
    private java.lang.Integer g;
    private java.lang.Object h;
    private final int i;
    private final int j;

    public w1(byte[] r8, java.lang.String r9, java.util.List<byte[]> r10, java.lang.String r11) {
            r7 = this;
            r5 = -1
            r6 = -1
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public w1(byte[] r1, java.lang.String r2, java.util.List<byte[]> r3, java.lang.String r4, int r5, int r6) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            if (r1 != 0) goto L9
            r1 = 0
            goto Lc
        L9:
            int r1 = r1.length
            int r1 = r1 * 8
        Lc:
            r0.b = r1
            r0.c = r2
            r0.d = r3
            r0.e = r4
            r0.i = r6
            r0.j = r5
            return
    }

    public int a() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    public void a(int r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public void a(java.lang.Integer r1) {
            r0 = this;
            r0.g = r1
            return
    }

    public void a(java.lang.Object r1) {
            r0 = this;
            r0.h = r1
            return
    }

    public java.lang.Object b() {
            r1 = this;
            java.lang.Object r0 = r1.h
            return r0
    }

    public void b(java.lang.Integer r1) {
            r0 = this;
            r0.f = r1
            return
    }

    public byte[] c() {
            r1 = this;
            byte[] r0 = r1.a
            return r0
    }

    public java.lang.String d() {
            r1 = this;
            java.lang.String r0 = r1.c
            return r0
    }
}
