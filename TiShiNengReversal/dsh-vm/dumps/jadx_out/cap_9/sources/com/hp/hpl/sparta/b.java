package com.hp.hpl.sparta;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class b {
    private final int[] a;
    private int b;
    private int c;
    private boolean d;

    b(int r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.b = r0
            r1.c = r0
            r0 = 1
            r1.d = r0
            int[] r2 = new int[r2]
            r1.a = r2
            return
    }

    private void c(int r3) {
            r2 = this;
            boolean r0 = r2.d
            if (r0 == 0) goto L16
            int[] r0 = r2.a
            int r1 = r2.b
            r0[r1] = r3
            int r1 = r1 + 1
            int r3 = r0.length
            int r1 = r1 % r3
            r2.b = r1
            int r3 = r2.c
            int r3 = r3 + 1
            r2.c = r3
        L16:
            return
    }

    void a(char r1) {
            r0 = this;
            r0.c(r1)
            return
    }

    void b(int r2) {
            r1 = this;
            r0 = 65536(0x10000, float:9.1835E-41)
            int r2 = r2 + r0
            r1.c(r2)
            return
    }

    void d(java.lang.String r4) {
            r3 = this;
            char[] r4 = r4.toCharArray()
            int r0 = r4.length
            r1 = 0
        L6:
            if (r1 >= r0) goto L10
            char r2 = r4[r1]
            r3.a(r2)
            int r1 = r1 + 1
            goto L6
        L10:
            return
    }

    void e() {
            r1 = this;
            r0 = 0
            r1.d = r0
            return
    }

    void f() {
            r1 = this;
            r0 = 1
            r1.d = r0
            return
    }

    public java.lang.String toString() {
            r5 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            int[] r1 = r5.a
            int r1 = r1.length
            int r1 = r1 * 11
            int r1 = r1 / 10
            r0.<init>(r1)
            int r1 = r5.c
            int[] r2 = r5.a
            int r3 = r2.length
            if (r1 >= r3) goto L16
            int r2 = r2.length
            int r2 = r2 - r1
            goto L17
        L16:
            r2 = 0
        L17:
            int[] r1 = r5.a
            int r3 = r1.length
            if (r2 >= r3) goto L37
            int r3 = r5.b
            int r3 = r3 + r2
            int r4 = r1.length
            int r3 = r3 % r4
            r1 = r1[r3]
            r3 = 65536(0x10000, float:9.1835E-41)
            if (r1 >= r3) goto L2c
            char r1 = (char) r1
            r0.append(r1)
            goto L34
        L2c:
            int r1 = r1 - r3
            java.lang.String r1 = java.lang.Integer.toString(r1)
            r0.append(r1)
        L34:
            int r2 = r2 + 1
            goto L17
        L37:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
