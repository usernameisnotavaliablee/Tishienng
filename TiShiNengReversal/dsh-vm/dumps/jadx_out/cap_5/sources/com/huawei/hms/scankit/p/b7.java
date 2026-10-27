package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class b7 {
    static final com.huawei.hms.scankit.p.b7 e = null;
    private final int a;
    private final com.huawei.hms.scankit.p.i7 b;
    private final int c;
    private final int d;

    static {
            com.huawei.hms.scankit.p.b7 r0 = new com.huawei.hms.scankit.p.b7
            com.huawei.hms.scankit.p.i7 r1 = com.huawei.hms.scankit.p.i7.b
            r2 = 0
            r0.<init>(r1, r2, r2, r2)
            com.huawei.hms.scankit.p.b7.e = r0
            return
    }

    private b7(com.huawei.hms.scankit.p.i7 r1, int r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.a = r2
            r0.c = r3
            r0.d = r4
            return
    }

    int a() {
            r1 = this;
            int r0 = r1.c
            return r0
    }

    com.huawei.hms.scankit.p.b7 a(int r7) {
            r6 = this;
            com.huawei.hms.scankit.p.i7 r0 = r6.b
            int r1 = r6.a
            int r2 = r6.d
            r3 = 4
            if (r1 == r3) goto Lc
            r3 = 2
            if (r1 != r3) goto L1f
        Lc:
            int[][] r3 = com.huawei.hms.scankit.p.c4.c
            r1 = r3[r1]
            r3 = 0
            r1 = r1[r3]
            r4 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r1
            int r1 = r1 >> 16
            com.huawei.hms.scankit.p.i7 r0 = r0.a(r4, r1)
            int r2 = r2 + r1
            r1 = 0
        L1f:
            int r3 = r6.c
            if (r3 == 0) goto L32
            r4 = 31
            if (r3 != r4) goto L28
            goto L32
        L28:
            r4 = 62
            if (r3 != r4) goto L2f
            r4 = 9
            goto L34
        L2f:
            r4 = 8
            goto L34
        L32:
            r4 = 18
        L34:
            com.huawei.hms.scankit.p.b7 r5 = new com.huawei.hms.scankit.p.b7
            int r3 = r3 + 1
            int r2 = r2 + r4
            r5.<init>(r0, r1, r3, r2)
            int r0 = r5.c
            r1 = 2078(0x81e, float:2.912E-42)
            if (r0 != r1) goto L49
            int r7 = r7 + 1
            com.huawei.hms.scankit.p.b7 r7 = r5.b(r7)
            return r7
        L49:
            return r5
    }

    com.huawei.hms.scankit.p.b7 a(int r5, int r6) {
            r4 = this;
            int r0 = r4.d
            com.huawei.hms.scankit.p.i7 r1 = r4.b
            int r2 = r4.a
            if (r5 == r2) goto L19
            int[][] r3 = com.huawei.hms.scankit.p.c4.c
            r2 = r3[r2]
            r2 = r2[r5]
            r3 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r2
            int r2 = r2 >> 16
            com.huawei.hms.scankit.p.i7 r1 = r1.a(r3, r2)
            int r0 = r0 + r2
        L19:
            r2 = 2
            if (r5 != r2) goto L1e
            r2 = 4
            goto L1f
        L1e:
            r2 = 5
        L1f:
            com.huawei.hms.scankit.p.i7 r6 = r1.a(r6, r2)
            com.huawei.hms.scankit.p.b7 r1 = new com.huawei.hms.scankit.p.b7
            int r0 = r0 + r2
            r2 = 0
            r1.<init>(r6, r5, r2, r0)
            return r1
    }

    com.huawei.hms.scankit.p.r a(byte[] r4) {
            r3 = this;
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            int r1 = r4.length
            com.huawei.hms.scankit.p.b7 r1 = r3.b(r1)
            com.huawei.hms.scankit.p.i7 r1 = r1.b
        Lc:
            if (r1 == 0) goto L16
            r0.addFirst(r1)
            com.huawei.hms.scankit.p.i7 r1 = r1.a()
            goto Lc
        L16:
            com.huawei.hms.scankit.p.r r1 = new com.huawei.hms.scankit.p.r
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L1f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r0.next()
            com.huawei.hms.scankit.p.i7 r2 = (com.huawei.hms.scankit.p.i7) r2
            r2.a(r1, r4)
            goto L1f
        L2f:
            return r1
    }

    boolean a(com.huawei.hms.scankit.p.b7 r4) {
            r3 = this;
            int r0 = r3.d
            int[][] r1 = com.huawei.hms.scankit.p.c4.c
            int r2 = r3.a
            r1 = r1[r2]
            int r2 = r4.a
            r1 = r1[r2]
            int r1 = r1 >> 16
            int r0 = r0 + r1
            int r1 = r4.c
            if (r1 <= 0) goto L1b
            int r2 = r3.c
            if (r2 == 0) goto L19
            if (r2 <= r1) goto L1b
        L19:
            int r0 = r0 + 10
        L1b:
            int r4 = r4.d
            if (r0 > r4) goto L21
            r4 = 1
            return r4
        L21:
            r4 = 0
            return r4
    }

    int b() {
            r1 = this;
            int r0 = r1.d
            return r0
    }

    com.huawei.hms.scankit.p.b7 b(int r5) {
            r4 = this;
            int r0 = r4.c
            if (r0 != 0) goto L5
            return r4
        L5:
            com.huawei.hms.scankit.p.i7 r1 = r4.b
            int r5 = r5 - r0
            com.huawei.hms.scankit.p.i7 r5 = r1.b(r5, r0)
            com.huawei.hms.scankit.p.b7 r0 = new com.huawei.hms.scankit.p.b7
            int r1 = r4.a
            int r2 = r4.d
            r3 = 0
            r0.<init>(r5, r1, r3, r2)
            return r0
    }

    com.huawei.hms.scankit.p.b7 b(int r7, int r8) {
            r6 = this;
            com.huawei.hms.scankit.p.i7 r0 = r6.b
            int r1 = r6.a
            r2 = 2
            r3 = 5
            if (r1 != r2) goto La
            r2 = 4
            goto Lb
        La:
            r2 = 5
        Lb:
            if (r1 < 0) goto L1f
            int[][] r4 = com.huawei.hms.scankit.p.c4.e
            int r5 = r4.length
            if (r1 >= r5) goto L1f
            if (r7 <= 0) goto L1f
            r1 = r4[r1]
            int r4 = r1.length
            if (r7 >= r4) goto L1f
            r7 = r1[r7]
            com.huawei.hms.scankit.p.i7 r0 = r0.a(r7, r2)
        L1f:
            com.huawei.hms.scankit.p.i7 r7 = r0.a(r8, r3)
            com.huawei.hms.scankit.p.b7 r8 = new com.huawei.hms.scankit.p.b7
            int r0 = r6.a
            int r1 = r6.d
            int r1 = r1 + r2
            int r1 = r1 + r3
            r2 = 0
            r8.<init>(r7, r0, r2, r1)
            return r8
    }

    int c() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public java.lang.String toString() {
            r6 = this;
            java.lang.String[] r0 = com.huawei.hms.scankit.p.c4.b
            int r1 = r6.a
            boolean r1 = com.huawei.hms.scankit.p.w7.a(r0, r1)
            if (r1 == 0) goto L2f
            java.util.Locale r1 = java.util.Locale.ENGLISH
            int r2 = r6.a
            r0 = r0[r2]
            int r2 = r6.d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r6.c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r0
            r0 = 1
            r4[r0] = r2
            r0 = 2
            r4[r0] = r3
            java.lang.String r0 = "%s bits=%d bytes=%d"
            java.lang.String r0 = java.lang.String.format(r1, r0, r4)
            return r0
        L2f:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>()
            throw r0
    }
}
