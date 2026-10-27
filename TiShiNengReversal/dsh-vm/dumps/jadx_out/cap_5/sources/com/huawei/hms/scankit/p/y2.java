package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class y2 {
    private final java.lang.String a;
    private com.huawei.hms.scankit.p.e7 b;
    private com.huawei.hms.scankit.p.l2 c;
    private com.huawei.hms.scankit.p.l2 d;
    private final java.lang.StringBuilder e;
    int f;
    private int g;
    private com.huawei.hms.scankit.p.d7 h;
    private int i;

    y2(java.lang.String r8) {
            r7 = this;
            r7.<init>()
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.ISO_8859_1
            byte[] r0 = r8.getBytes(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r2 = r0.length
            r1.<init>(r2)
            int r2 = r0.length
            r3 = 0
        L11:
            if (r3 >= r2) goto L31
            r4 = r0[r3]
            r4 = r4 & 255(0xff, float:3.57E-43)
            char r4 = (char) r4
            r5 = 63
            if (r4 != r5) goto L2b
            char r6 = r8.charAt(r3)
            if (r6 != r5) goto L23
            goto L2b
        L23:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Message contains characters outside ISO-8859-1 encoding."
            r8.<init>(r0)
            throw r8
        L2b:
            r1.append(r4)
            int r3 = r3 + 1
            goto L11
        L31:
            java.lang.String r0 = r1.toString()
            r7.a = r0
            com.huawei.hms.scankit.p.e7 r0 = com.huawei.hms.scankit.p.e7.a
            r7.b = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r8 = r8.length()
            r0.<init>(r8)
            r7.e = r0
            r8 = -1
            r7.g = r8
            return
    }

    private int h() {
            r2 = this;
            java.lang.String r0 = r2.a
            int r0 = r0.length()
            int r1 = r2.i
            int r0 = r0 - r1
            return r0
    }

    public int a() {
            r1 = this;
            java.lang.StringBuilder r0 = r1.e
            int r0 = r0.length()
            return r0
    }

    public void a(char r2) {
            r1 = this;
            java.lang.StringBuilder r0 = r1.e
            r0.append(r2)
            return
    }

    public void a(int r1) {
            r0 = this;
            r0.i = r1
            return
    }

    public void a(com.huawei.hms.scankit.p.e7 r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public void a(com.huawei.hms.scankit.p.l2 r1, com.huawei.hms.scankit.p.l2 r2) {
            r0 = this;
            r0.c = r1
            r0.d = r2
            return
    }

    public void a(java.lang.String r2) {
            r1 = this;
            java.lang.StringBuilder r0 = r1.e
            r0.append(r2)
            return
    }

    public java.lang.StringBuilder b() {
            r1 = this;
            java.lang.StringBuilder r0 = r1.e
            return r0
    }

    public void b(int r1) {
            r0 = this;
            r0.g = r1
            return
    }

    public char c() {
            r2 = this;
            java.lang.String r0 = r2.a
            int r1 = r2.f
            char r0 = r0.charAt(r1)
            return r0
    }

    public void c(int r5) {
            r4 = this;
            com.huawei.hms.scankit.p.d7 r0 = r4.h
            if (r0 == 0) goto Lc
            int r0 = r0.a()
            if (r5 <= r0) goto Lb
            goto Lc
        Lb:
            return
        Lc:
            com.huawei.hms.scankit.p.e7 r0 = r4.b
            com.huawei.hms.scankit.p.l2 r1 = r4.c
            com.huawei.hms.scankit.p.l2 r2 = r4.d
            r3 = 1
            com.huawei.hms.scankit.p.d7 r5 = com.huawei.hms.scankit.p.d7.a(r5, r0, r1, r2, r3)
            r4.h = r5
            return
    }

    public java.lang.String d() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public int e() {
            r1 = this;
            int r0 = r1.g
            return r0
    }

    public int f() {
            r2 = this;
            int r0 = r2.h()
            int r1 = r2.f
            int r0 = r0 - r1
            return r0
    }

    public com.huawei.hms.scankit.p.d7 g() {
            r1 = this;
            com.huawei.hms.scankit.p.d7 r0 = r1.h
            return r0
    }

    public boolean i() {
            r2 = this;
            int r0 = r2.f
            int r1 = r2.h()
            if (r0 >= r1) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public void j() {
            r1 = this;
            r0 = -1
            r1.g = r0
            return
    }

    public void k() {
            r1 = this;
            r0 = 0
            r1.h = r0
            return
    }

    public void l() {
            r1 = this;
            int r0 = r1.a()
            r1.c(r0)
            return
    }
}
