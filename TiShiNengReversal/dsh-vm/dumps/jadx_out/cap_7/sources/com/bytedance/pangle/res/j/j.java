package com.bytedance.pangle.res.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class j {
    private static final java.util.logging.Logger m = null;
    private final com.bytedance.pangle.res.j.ae cw;
    private final byte[] j;
    private final com.bytedance.pangle.res.j.up r;
    private com.bytedance.pangle.res.j.j.C0011j up;
    private final com.bytedance.pangle.res.j.tl xt;

    /* renamed from: com.bytedance.pangle.res.j.j$j, reason: collision with other inner class name */
    public static class C0011j {
        public final int cw;
        public final short j;
        public final int r;
        public final int up;
        public final int xt;

        public C0011j(short r1, int r2, int r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.j = r1
                r0.xt = r2
                r0.cw = r3
                r0.r = r4
                int r4 = r4 + r3
                r0.up = r4
                return
        }

        public static com.bytedance.pangle.res.j.j.C0011j j(com.bytedance.pangle.res.j.ae r3, com.bytedance.pangle.res.j.up r4) throws java.io.IOException {
                int r0 = r4.j()
                short r4 = r3.readShort()     // Catch: java.io.EOFException -> L16
                com.bytedance.pangle.res.j.j$j r1 = new com.bytedance.pangle.res.j.j$j
                short r2 = r3.readShort()
                int r3 = r3.readInt()
                r1.<init>(r4, r2, r3, r0)
                return r1
            L16:
                com.bytedance.pangle.res.j.j$j r3 = new com.bytedance.pangle.res.j.j$j
                r0 = -1
                int r4 = r4.j()
                r1 = 0
                r3.<init>(r0, r1, r1, r4)
                return r3
        }
    }

    static {
            java.lang.Class<com.bytedance.pangle.res.j.j> r0 = com.bytedance.pangle.res.j.j.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.bytedance.pangle.res.j.j.m = r0
            return
    }

    public j(byte[] r4, com.bytedance.pangle.res.j.tl r5) {
            r3 = this;
            r3.<init>()
            com.bytedance.pangle.res.j.up r0 = new com.bytedance.pangle.res.j.up
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r4)
            r0.<init>(r1)
            r3.r = r0
            com.bytedance.pangle.res.j.ae r1 = new com.bytedance.pangle.res.j.ae
            com.bytedance.pangle.res.j.g r2 = new com.bytedance.pangle.res.j.g
            r2.<init>(r0)
            r1.<init>(r2)
            r3.cw = r1
            r3.j = r4
            r3.xt = r5
            return
    }

    private void ae() throws java.io.IOException {
            r2 = this;
            com.bytedance.pangle.res.j.ae r0 = r2.cw
            short r0 = r0.readShort()
            if (r0 < 0) goto L1f
            com.bytedance.pangle.res.j.ae r0 = r2.cw
            short r0 = r0.readShort()
            com.bytedance.pangle.res.j.ae r1 = r2.cw
            r1.readInt()
            r0 = r0 & 1
            if (r0 != 0) goto L1b
            r2.g()
            return
        L1b:
            r2.tl()
            return
        L1f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Entry size is under 0 bytes."
            r0.<init>(r1)
            throw r0
    }

    private void cw() throws java.io.IOException {
            r4 = this;
            r0 = 515(0x203, float:7.22E-43)
            r4.xt(r0)
            com.bytedance.pangle.res.j.ae r0 = r4.cw
            int r0 = r0.readInt()
            r1 = 0
        Lc:
            if (r1 >= r0) goto L1d
            com.bytedance.pangle.res.j.ae r2 = r4.cw
            r2.readInt()
            com.bytedance.pangle.res.j.ae r2 = r4.cw
            r3 = 256(0x100, float:3.59E-43)
            r2.skipBytes(r3)
            int r1 = r1 + 1
            goto Lc
        L1d:
            com.bytedance.pangle.res.j.j$j r0 = r4.qv()
            short r0 = r0.j
            r1 = 513(0x201, float:7.19E-43)
            if (r0 != r1) goto L2b
            r4.r()
            goto L1d
        L2b:
            return
    }

    private void cw(int r1) throws java.io.IOException {
            r0 = this;
            r0.qv()
            r0.xt(r1)
            return
    }

    private void g() throws java.io.IOException {
            r5 = this;
            com.bytedance.pangle.res.j.ae r0 = r5.cw
            r1 = 8
            r0.j(r1)
            com.bytedance.pangle.res.j.ae r0 = r5.cw
            r1 = 0
            r0.j(r1)
            com.bytedance.pangle.res.j.ae r0 = r5.cw
            byte r0 = r0.readByte()
            com.bytedance.pangle.res.j.ae r1 = r5.cw
            int r1 = com.bytedance.pangle.res.j.qv.j(r1)
            com.bytedance.pangle.res.j.ae r2 = r5.cw
            int r2 = r2.readInt()
            r3 = 1
            if (r0 != r3) goto L29
            byte[] r3 = r5.j
            com.bytedance.pangle.res.j.tl r4 = r5.xt
            com.bytedance.pangle.res.j.qv.j(r3, r2, r1, r4)
        L29:
            r3 = 2
            if (r0 != r3) goto L33
            byte[] r0 = r5.j
            com.bytedance.pangle.res.j.tl r3 = r5.xt
            com.bytedance.pangle.res.j.qv.j(r0, r2, r1, r3)
        L33:
            return
    }

    private java.lang.String j(int r3) throws java.io.IOException {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 16
            r0.<init>(r1)
        L7:
            int r1 = r3 + (-1)
            if (r3 == 0) goto L1a
            com.bytedance.pangle.res.j.ae r3 = r2.cw
            byte r3 = r3.readByte()
            short r3 = (short) r3
            if (r3 == 0) goto L1a
            char r3 = (char) r3
            r0.append(r3)
            r3 = r1
            goto L7
        L1a:
            com.bytedance.pangle.res.j.ae r3 = r2.cw
            r3.skipBytes(r1)
            java.lang.String r3 = r0.toString()
            return r3
    }

    private void m() throws java.io.IOException {
            r6 = this;
            r0 = 513(0x201, float:7.19E-43)
            r6.xt(r0)
            com.bytedance.pangle.res.j.ae r0 = r6.cw
            r0.readUnsignedByte()
            com.bytedance.pangle.res.j.ae r0 = r6.cw
            r0.readByte()
            com.bytedance.pangle.res.j.ae r0 = r6.cw
            r1 = 2
            r0.skipBytes(r1)
            com.bytedance.pangle.res.j.ae r0 = r6.cw
            int r0 = r0.readInt()
            com.bytedance.pangle.res.j.ae r1 = r6.cw
            int r1 = r1.readInt()
            r6.oq()
            com.bytedance.pangle.res.j.j$j r2 = r6.up
            int r2 = r2.r
            int r2 = r2 + r1
            int r1 = r0 * 4
            int r2 = r2 - r1
            com.bytedance.pangle.res.j.up r1 = r6.r
            int r1 = r1.j()
            if (r2 == r1) goto L60
            java.util.logging.Logger r1 = com.bytedance.pangle.res.j.j.m
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Invalid data detected. Skipping: "
            r3.<init>(r4)
            com.bytedance.pangle.res.j.up r4 = r6.r
            int r4 = r4.j()
            int r4 = r2 - r4
            r3.append(r4)
            java.lang.String r4 = " byte(s)"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.warning(r3)
            com.bytedance.pangle.res.j.ae r1 = r6.cw
            com.bytedance.pangle.res.j.up r3 = r6.r
            int r3 = r3.j()
            int r2 = r2 - r3
            r1.skipBytes(r2)
        L60:
            com.bytedance.pangle.res.j.ae r1 = r6.cw
            int[] r0 = r1.j(r0)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            int r2 = r0.length
            r3 = 0
        L6d:
            if (r3 >= r2) goto L8b
            r4 = r0[r3]
            r5 = -1
            if (r4 == r5) goto L88
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            boolean r5 = r1.contains(r5)
            if (r5 != 0) goto L88
            r6.ae()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.add(r4)
        L88:
            int r3 = r3 + 1
            goto L6d
        L8b:
            return
    }

    private void oq() throws java.io.IOException {
            r10 = this;
            r0 = 56
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            com.bytedance.pangle.res.j.ae r2 = r10.cw
            int r2 = r2.readInt()
            r3 = 28
            if (r2 < r3) goto L10c
            com.bytedance.pangle.res.j.ae r4 = r10.cw
            r4.readShort()
            com.bytedance.pangle.res.j.ae r4 = r10.cw
            r4.readShort()
            com.bytedance.pangle.res.j.ae r4 = r10.cw
            r4.readByte()
            com.bytedance.pangle.res.j.ae r4 = r10.cw
            r4.readByte()
            com.bytedance.pangle.res.j.ae r4 = r10.cw
            r4.readByte()
            com.bytedance.pangle.res.j.ae r4 = r10.cw
            r4.readByte()
            com.bytedance.pangle.res.j.ae r4 = r10.cw
            r4.readByte()
            com.bytedance.pangle.res.j.ae r4 = r10.cw
            r4.readByte()
            com.bytedance.pangle.res.j.ae r4 = r10.cw
            r4.readUnsignedShort()
            com.bytedance.pangle.res.j.ae r4 = r10.cw
            r4.readByte()
            com.bytedance.pangle.res.j.ae r4 = r10.cw
            r4.readByte()
            com.bytedance.pangle.res.j.ae r4 = r10.cw
            r4.readByte()
            com.bytedance.pangle.res.j.ae r4 = r10.cw
            r5 = 1
            r4.skipBytes(r5)
            com.bytedance.pangle.res.j.ae r4 = r10.cw
            r4.readShort()
            com.bytedance.pangle.res.j.ae r4 = r10.cw
            r4.readShort()
            com.bytedance.pangle.res.j.ae r4 = r10.cw
            r4.readShort()
            com.bytedance.pangle.res.j.ae r4 = r10.cw
            r6 = 2
            r4.skipBytes(r6)
            r4 = 32
            if (r2 < r4) goto L7c
            com.bytedance.pangle.res.j.ae r3 = r10.cw
            r3.readByte()
            com.bytedance.pangle.res.j.ae r3 = r10.cw
            r3.readByte()
            com.bytedance.pangle.res.j.ae r3 = r10.cw
            r3.readShort()
            r3 = 32
        L7c:
            r4 = 36
            if (r2 < r4) goto L8c
            com.bytedance.pangle.res.j.ae r3 = r10.cw
            r3.readShort()
            com.bytedance.pangle.res.j.ae r3 = r10.cw
            r3.readShort()
            r3 = 36
        L8c:
            r4 = 4
            r7 = 48
            if (r2 < r7) goto La3
            java.lang.String r3 = r10.j(r4)
            r3.toCharArray()
            r3 = 8
            java.lang.String r3 = r10.j(r3)
            r3.toCharArray()
            r3 = 48
        La3:
            r7 = 52
            if (r2 < r7) goto Lb8
            com.bytedance.pangle.res.j.ae r3 = r10.cw
            r3.readByte()
            com.bytedance.pangle.res.j.ae r3 = r10.cw
            r3.readByte()
            com.bytedance.pangle.res.j.ae r3 = r10.cw
            r3.skipBytes(r6)
            r3 = 52
        Lb8:
            if (r2 < r0) goto Lc0
            com.bytedance.pangle.res.j.ae r3 = r10.cw
            r3.skipBytes(r4)
            goto Lc1
        Lc0:
            r0 = r3
        Lc1:
            int r3 = r2 + (-56)
            if (r3 <= 0) goto L103
            byte[] r4 = new byte[r3]
            int r0 = r0 + r3
            com.bytedance.pangle.res.j.ae r3 = r10.cw
            r3.readFully(r4)
            java.math.BigInteger r3 = new java.math.BigInteger
            r3.<init>(r5, r4)
            java.math.BigInteger r4 = java.math.BigInteger.ZERO
            boolean r4 = r3.equals(r4)
            r7 = 0
            if (r4 == 0) goto Leb
            java.util.logging.Logger r3 = com.bytedance.pangle.res.j.j.m
            java.lang.Object[] r4 = new java.lang.Object[r5]
            r4[r7] = r1
            java.lang.String r1 = "Config flags size > %d, but exceeding bytes are all zero, so it should be ok."
            java.lang.String r1 = java.lang.String.format(r1, r4)
            r3.fine(r1)
            goto L103
        Leb:
            java.util.logging.Logger r4 = com.bytedance.pangle.res.j.j.m
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r9[r7] = r1
            r9[r5] = r8
            r9[r6] = r3
            java.lang.String r1 = "Config flags size > %d. Size = %d. Exceeding bytes: 0x%X."
            java.lang.String r1 = java.lang.String.format(r1, r9)
            r4.warning(r1)
        L103:
            int r2 = r2 - r0
            if (r2 <= 0) goto L10b
            com.bytedance.pangle.res.j.ae r0 = r10.cw
            r0.skipBytes(r2)
        L10b:
            return
        L10c:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Config size < 28"
            r0.<init>(r1)
            throw r0
    }

    private com.bytedance.pangle.res.j.j.C0011j qv() throws java.io.IOException {
            r2 = this;
            com.bytedance.pangle.res.j.ae r0 = r2.cw
            com.bytedance.pangle.res.j.up r1 = r2.r
            com.bytedance.pangle.res.j.j$j r0 = com.bytedance.pangle.res.j.j.C0011j.j(r0, r1)
            r2.up = r0
            return r0
    }

    private void r() throws java.io.IOException {
            r4 = this;
            r4.up()
            com.bytedance.pangle.res.j.j$j r0 = r4.qv()
            short r0 = r0.j
        L9:
            r1 = 514(0x202, float:7.2E-43)
            if (r0 != r1) goto L17
            r4.up()
            com.bytedance.pangle.res.j.j$j r0 = r4.qv()
            short r0 = r0.j
            goto L9
        L17:
            r1 = 513(0x201, float:7.19E-43)
            if (r0 != r1) goto L63
            r4.m()
            com.bytedance.pangle.res.j.up r0 = r4.r
            int r0 = r0.j()
            com.bytedance.pangle.res.j.j$j r1 = r4.up
            int r1 = r1.up
            if (r0 >= r1) goto L5c
            java.util.logging.Logger r0 = com.bytedance.pangle.res.j.j.m
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown data detected. Skipping: "
            r1.<init>(r2)
            com.bytedance.pangle.res.j.j$j r2 = r4.up
            int r2 = r2.up
            com.bytedance.pangle.res.j.up r3 = r4.r
            int r3 = r3.j()
            int r2 = r2 - r3
            r1.append(r2)
            java.lang.String r2 = " byte(s)"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.warning(r1)
            com.bytedance.pangle.res.j.up r0 = r4.r
            com.bytedance.pangle.res.j.j$j r1 = r4.up
            int r1 = r1.up
            int r2 = r0.j()
            int r1 = r1 - r2
            long r1 = (long) r1
            r0.skip(r1)
        L5c:
            com.bytedance.pangle.res.j.j$j r0 = r4.qv()
            short r0 = r0.j
            goto L17
        L63:
            return
    }

    private void tl() throws java.io.IOException {
            r6 = this;
            com.bytedance.pangle.res.j.ae r0 = r6.cw
            int r0 = com.bytedance.pangle.res.j.qv.j(r0)
            com.bytedance.pangle.res.j.ae r1 = r6.cw
            int r1 = r1.readInt()
            byte[] r2 = r6.j
            com.bytedance.pangle.res.j.tl r3 = r6.xt
            com.bytedance.pangle.res.j.qv.j(r2, r1, r0, r3)
            com.bytedance.pangle.res.j.ae r0 = r6.cw
            int r0 = r0.readInt()
            r1 = 0
        L1a:
            if (r1 >= r0) goto L35
            com.bytedance.pangle.res.j.ae r2 = r6.cw
            int r2 = com.bytedance.pangle.res.j.qv.j(r2)
            com.bytedance.pangle.res.j.ae r3 = r6.cw
            int r3 = r3.readInt()
            byte[] r4 = r6.j
            com.bytedance.pangle.res.j.tl r5 = r6.xt
            com.bytedance.pangle.res.j.qv.j(r4, r3, r2, r5)
            r6.g()
            int r1 = r1 + 1
            goto L1a
        L35:
            return
    }

    private void up() throws java.io.IOException {
            r2 = this;
            r0 = 514(0x202, float:7.2E-43)
            r2.xt(r0)
            com.bytedance.pangle.res.j.ae r0 = r2.cw
            r0.readUnsignedByte()
            com.bytedance.pangle.res.j.ae r0 = r2.cw
            r1 = 3
            r0.skipBytes(r1)
            com.bytedance.pangle.res.j.ae r0 = r2.cw
            int r0 = r0.readInt()
            com.bytedance.pangle.res.j.ae r1 = r2.cw
            int r0 = r0 * 4
            r1.skipBytes(r0)
            return
    }

    private void xt() throws java.io.IOException {
            r3 = this;
            r0 = 512(0x200, float:7.17E-43)
            r3.xt(r0)
            com.bytedance.pangle.res.j.ae r0 = r3.cw
            r0.readInt()
            com.bytedance.pangle.res.j.ae r0 = r3.cw
            r1 = 256(0x100, float:3.59E-43)
            r0.skipBytes(r1)
            com.bytedance.pangle.res.j.ae r0 = r3.cw
            r0.j()
            com.bytedance.pangle.res.j.ae r0 = r3.cw
            r0.j()
            com.bytedance.pangle.res.j.ae r0 = r3.cw
            r0.j()
            com.bytedance.pangle.res.j.ae r0 = r3.cw
            r0.j()
            com.bytedance.pangle.res.j.j$j r0 = r3.up
            int r0 = r0.xt
            r1 = 288(0x120, float:4.04E-43)
            if (r0 != r1) goto L3e
            com.bytedance.pangle.res.j.ae r0 = r3.cw
            int r0 = r0.readInt()
            if (r0 > 0) goto L36
            goto L3e
        L36:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "don't support"
            r0.<init>(r1)
            throw r0
        L3e:
            com.bytedance.pangle.res.j.ae r0 = r3.cw
            com.bytedance.pangle.res.j.vl.j(r0)
            com.bytedance.pangle.res.j.ae r0 = r3.cw
            com.bytedance.pangle.res.j.vl.j(r0)
            r3.qv()
            r0 = 1
        L4c:
            if (r0 == 0) goto L64
            com.bytedance.pangle.res.j.j$j r1 = r3.up
            short r1 = r1.j
            r2 = 514(0x202, float:7.2E-43)
            if (r1 == r2) goto L60
            r2 = 515(0x203, float:7.22E-43)
            if (r1 == r2) goto L5c
            r0 = 0
            goto L4c
        L5c:
            r3.cw()
            goto L4c
        L60:
            r3.r()
            goto L4c
        L64:
            return
    }

    private void xt(int r5) {
            r4 = this;
            com.bytedance.pangle.res.j.j$j r0 = r4.up
            short r0 = r0.j
            if (r0 != r5) goto L7
            return
        L7:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            com.bytedance.pangle.res.j.j$j r1 = r4.up
            short r1 = r1.j
            java.lang.Short r1 = java.lang.Short.valueOf(r1)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r1
            java.lang.String r5 = "Invalid chunk type: expected=0x%08x, got=0x%08x"
            java.lang.String r5 = java.lang.String.format(r5, r2)
            r0.<init>(r5)
            throw r0
    }

    public void j() throws java.io.IOException {
            r2 = this;
            r0 = 2
            r2.cw(r0)
            com.bytedance.pangle.res.j.ae r0 = r2.cw
            int r0 = r0.readInt()
            com.bytedance.pangle.res.j.ae r1 = r2.cw
            com.bytedance.pangle.res.j.vl.j(r1)
            r2.qv()
            r1 = 0
        L13:
            if (r1 >= r0) goto L1b
            r2.xt()
            int r1 = r1 + 1
            goto L13
        L1b:
            return
    }
}
