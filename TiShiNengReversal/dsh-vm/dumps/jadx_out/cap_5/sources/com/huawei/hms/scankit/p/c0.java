package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c0 {
    private final byte[][] a;
    private final int b;
    private final int c;

    public c0(int r3, int r4) {
            r2 = this;
            r2.<init>()
            r0 = 2
            int[] r0 = new int[r0]
            r1 = 1
            r0[r1] = r3
            r1 = 0
            r0[r1] = r4
            java.lang.Class r1 = java.lang.Byte.TYPE
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r1, r0)
            byte[][] r0 = (byte[][]) r0
            r2.a = r0
            r2.b = r3
            r2.c = r4
            return
    }

    public byte a(int r2, int r3) {
            r1 = this;
            byte[][] r0 = r1.a
            boolean r0 = com.huawei.hms.scankit.p.w7.a(r0, r3)
            if (r0 == 0) goto L19
            byte[][] r0 = r1.a
            r0 = r0[r3]
            boolean r0 = com.huawei.hms.scankit.p.w7.a(r0, r2)
            if (r0 == 0) goto L19
            byte[][] r0 = r1.a
            r3 = r0[r3]
            r2 = r3[r2]
            return r2
        L19:
            java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
            r2.<init>()
            throw r2
    }

    public void a(byte r5) {
            r4 = this;
            byte[][] r0 = r4.a
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 >= r1) goto Le
            r3 = r0[r2]
            java.util.Arrays.fill(r3, r5)
            int r2 = r2 + 1
            goto L4
        Le:
            return
    }

    public void a(int r2, int r3, int r4) {
            r1 = this;
            byte[][] r0 = r1.a
            boolean r0 = com.huawei.hms.scankit.p.w7.a(r0, r3)
            if (r0 == 0) goto L1a
            byte[][] r0 = r1.a
            r0 = r0[r3]
            boolean r0 = com.huawei.hms.scankit.p.w7.a(r0, r2)
            if (r0 == 0) goto L1a
            byte[][] r0 = r1.a
            r3 = r0[r3]
            byte r4 = (byte) r4
            r3[r2] = r4
            return
        L1a:
            java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
            r2.<init>()
            throw r2
    }

    public void a(int r2, int r3, boolean r4) {
            r1 = this;
            byte[][] r0 = r1.a
            boolean r0 = com.huawei.hms.scankit.p.w7.a(r0, r3)
            if (r0 == 0) goto L1a
            byte[][] r0 = r1.a
            r0 = r0[r3]
            boolean r0 = com.huawei.hms.scankit.p.w7.a(r0, r2)
            if (r0 == 0) goto L1a
            byte[][] r0 = r1.a
            r3 = r0[r3]
            byte r4 = (byte) r4
            r3[r2] = r4
            return
        L1a:
            java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
            r2.<init>()
            throw r2
    }

    public byte[][] a() {
            r1 = this;
            byte[][] r0 = r1.a
            return r0
    }

    public int b() {
            r1 = this;
            int r0 = r1.c
            return r0
    }

    public int c() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    public java.lang.String toString() {
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r7.b
            int r1 = r1 * 2
            int r2 = r7.c
            int r1 = r1 * r2
            int r1 = r1 + 2
            r0.<init>(r1)
            r1 = 0
            r2 = 0
        L11:
            int r3 = r7.c
            if (r2 >= r3) goto L41
            byte[][] r3 = r7.a
            r3 = r3[r2]
            r4 = 0
        L1a:
            int r5 = r7.b
            if (r4 >= r5) goto L39
            r5 = r3[r4]
            if (r5 == 0) goto L31
            r6 = 1
            if (r5 == r6) goto L2b
            java.lang.String r5 = "  "
            r0.append(r5)
            goto L36
        L2b:
            java.lang.String r5 = " 1"
            r0.append(r5)
            goto L36
        L31:
            java.lang.String r5 = " 0"
            r0.append(r5)
        L36:
            int r4 = r4 + 1
            goto L1a
        L39:
            r3 = 10
            r0.append(r3)
            int r2 = r2 + 1
            goto L11
        L41:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
