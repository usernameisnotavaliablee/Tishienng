package com.bytedance.pangle.res.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class ae extends com.bytedance.pangle.res.j.m {
    public ae(com.bytedance.pangle.res.j.g r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public void j() throws java.io.IOException {
            r1 = this;
            r0 = 4
            r1.skipBytes(r0)
            return
    }

    public void j(byte r5) throws java.io.IOException {
            r4 = this;
            byte r0 = r4.readByte()
            if (r0 != r5) goto L7
            return
        L7:
            java.io.IOException r1 = new java.io.IOException
            java.lang.Byte r5 = java.lang.Byte.valueOf(r5)
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r0
            java.lang.String r5 = "Expected: 0x%08x, got: 0x%08x"
            java.lang.String r5 = java.lang.String.format(r5, r2)
            r1.<init>(r5)
            throw r1
    }

    public void j(int r5, int r6) throws java.io.IOException {
            r4 = this;
            int r0 = r4.readInt()
            if (r0 == r5) goto L2d
            if (r0 != r6) goto L9
            goto L2d
        L9:
            java.io.IOException r1 = new java.io.IOException
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r6
            r5 = 2
            r2[r5] = r0
            java.lang.String r5 = "Expected: 0x%08x or 0x%08x, got: 0x%08x"
            java.lang.String r5 = java.lang.String.format(r5, r2)
            r1.<init>(r5)
            throw r1
        L2d:
            return
    }

    public void j(short r5) throws java.io.IOException {
            r4 = this;
            short r0 = r4.readShort()
            if (r0 != r5) goto L7
            return
        L7:
            java.io.IOException r1 = new java.io.IOException
            java.lang.Short r5 = java.lang.Short.valueOf(r5)
            java.lang.Short r0 = java.lang.Short.valueOf(r0)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r0
            java.lang.String r5 = "Expected: 0x%08x, got: 0x%08x"
            java.lang.String r5 = java.lang.String.format(r5, r2)
            r1.<init>(r5)
            throw r1
    }

    public int[] j(int r4) throws java.io.IOException {
            r3 = this;
            int[] r0 = new int[r4]
            r1 = 0
        L3:
            if (r1 >= r4) goto Le
            int r2 = r3.readInt()
            r0[r1] = r2
            int r1 = r1 + 1
            goto L3
        Le:
            return r0
    }

    @Override // com.bytedance.pangle.res.j.m, java.io.DataInput
    public final int skipBytes(int r3) throws java.io.IOException {
            r2 = this;
            r0 = 0
        L1:
            if (r0 >= r3) goto Ld
            int r1 = r3 - r0
            int r1 = super.skipBytes(r1)
            if (r1 <= 0) goto Ld
            int r0 = r0 + r1
            goto L1
        Ld:
            return r0
    }

    public void xt(int r4, int r5) throws java.io.IOException {
            r3 = this;
            int r0 = r3.readInt()
            if (r0 == r5) goto L29
            if (r0 >= r4) goto L9
            goto L29
        L9:
            if (r0 != r4) goto Lc
            return
        Lc:
            java.io.IOException r5 = new java.io.IOException
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r0
            java.lang.String r4 = "Expected: 0x%08x, got: 0x%08x"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r5.<init>(r4)
            throw r5
        L29:
            r5 = -1
            r3.xt(r4, r5)
            return
    }
}
