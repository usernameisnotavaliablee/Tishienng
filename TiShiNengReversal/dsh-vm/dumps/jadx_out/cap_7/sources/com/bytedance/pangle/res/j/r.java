package com.bytedance.pangle.res.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public final class r {
    public r() {
            r1 = this;
            r1.<init>()
            return
    }

    public static <T> T j(T r0) {
            r0.getClass()
            return r0
    }

    public static void j(int r2, int r3, int r4) {
            if (r2 < 0) goto L7
            if (r3 < r2) goto L7
            if (r3 > r4) goto L7
            return
        L7:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r3)
            r1.append(r4)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
    }

    public static void j(java.io.InputStream r2, byte[] r3) throws java.io.IOException {
            r0 = 0
            int r1 = r3.length
            j(r2, r3, r0, r1)
            return
    }

    public static void j(java.io.InputStream r1, byte[] r2, int r3, int r4) throws java.io.IOException {
            int r1 = xt(r1, r2, r3, r4)
            if (r1 != r4) goto L7
            return
        L7:
            java.io.EOFException r2 = new java.io.EOFException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "reached end of stream after reading "
            r3.<init>(r0)
            r3.append(r1)
            java.lang.String r1 = " bytes; "
            r3.append(r1)
            r3.append(r4)
            java.lang.String r1 = " bytes expected"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
    }

    public static int xt(java.io.InputStream r3, byte[] r4, int r5, int r6) throws java.io.IOException {
            j(r3)
            j(r4)
            r0 = 0
            if (r6 < 0) goto L1f
            int r1 = r5 + r6
            int r2 = r4.length
            j(r5, r1, r2)
        Lf:
            if (r0 >= r6) goto L1e
            int r1 = r5 + r0
            int r2 = r6 - r0
            int r1 = r3.read(r4, r1, r2)
            r2 = -1
            if (r1 == r2) goto L1e
            int r0 = r0 + r1
            goto Lf
        L1e:
            return r0
        L1f:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r0] = r4
            java.lang.String r4 = "len (%s) cannot be negative"
            java.lang.String r4 = java.lang.String.format(r4, r5)
            r3.<init>(r4)
            throw r3
    }
}
