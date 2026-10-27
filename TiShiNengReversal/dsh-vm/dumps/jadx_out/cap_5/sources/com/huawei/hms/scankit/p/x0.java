package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class x0 {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private int e;

    x0(int r2, int r3, int r4, int r5) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.e = r0
            r1.a = r2
            r1.b = r3
            r1.c = r4
            r1.d = r5
            return
    }

    int a() {
            r1 = this;
            int r0 = r1.c
            return r0
    }

    boolean a(int r2) {
            r1 = this;
            r0 = -1
            if (r2 == r0) goto Ld
            int r0 = r1.c
            int r2 = r2 % 3
            int r2 = r2 * 3
            if (r0 != r2) goto Ld
            r2 = 1
            return r2
        Ld:
            r2 = 0
            return r2
    }

    int b() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    void b(int r1) {
            r0 = this;
            r0.e = r1
            return
    }

    int c() {
            r1 = this;
            int r0 = r1.e
            return r0
    }

    int d() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    int e() {
            r1 = this;
            int r0 = r1.d
            return r0
    }

    int f() {
            r2 = this;
            int r0 = r2.b
            int r1 = r2.a
            int r0 = r0 - r1
            return r0
    }

    boolean g() {
            r1 = this;
            int r0 = r1.e
            boolean r0 = r1.a(r0)
            return r0
    }

    void h() {
            r2 = this;
            int r0 = r2.d
            int r0 = r0 / 30
            int r0 = r0 * 3
            int r1 = r2.c
            int r1 = r1 / 3
            int r0 = r0 + r1
            r2.e = r0
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r2.e
            r0.append(r1)
            java.lang.String r1 = "|"
            r0.append(r1)
            int r1 = r2.d
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
