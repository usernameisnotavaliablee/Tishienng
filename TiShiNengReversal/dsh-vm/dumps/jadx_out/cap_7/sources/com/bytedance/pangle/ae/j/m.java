package com.bytedance.pangle.ae.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class m {
    private int[] j;
    private int[] xt;

    private m() {
            r0 = this;
            r0.<init>()
            return
    }

    private static final int j(int[] r1, int r2) {
            int r0 = r2 / 4
            r1 = r1[r0]
            int r2 = r2 % 4
            int r2 = r2 / 2
            if (r2 != 0) goto Lf
            r2 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r2
            return r1
        Lf:
            int r1 = r1 >>> 16
            return r1
    }

    public static com.bytedance.pangle.ae.j.m j(com.bytedance.pangle.ae.j.xt r6) throws java.io.IOException {
            r0 = 1835009(0x1c0001, float:2.571395E-39)
            r6.xt(r0)
            int r0 = r6.xt()
            int r1 = r6.xt()
            int r2 = r6.xt()
            r6.xt()
            int r3 = r6.xt()
            int r4 = r6.xt()
            com.bytedance.pangle.ae.j.m r5 = new com.bytedance.pangle.ae.j.m
            r5.<init>()
            int[] r1 = r6.j(r1)
            r5.j = r1
            if (r2 == 0) goto L2d
            r6.j(r2)
        L2d:
            if (r4 != 0) goto L31
            r1 = r0
            goto L32
        L31:
            r1 = r4
        L32:
            int r1 = r1 - r3
            int r2 = r1 % 4
            if (r2 != 0) goto L53
            int r1 = r1 / 4
            int[] r1 = r6.j(r1)
            r5.xt = r1
            if (r4 == 0) goto L52
            int r0 = r0 - r4
            int r1 = r0 % 4
            if (r1 != 0) goto L4c
            int r0 = r0 / 4
            r6.j(r0)
            return r5
        L4c:
            java.io.IOException r6 = new java.io.IOException
            r6.<init>()
            throw r6
        L52:
            return r5
        L53:
            java.io.IOException r6 = new java.io.IOException
            r6.<init>()
            throw r6
    }

    public java.lang.String j(int r4) {
            r3 = this;
            if (r4 < 0) goto L2c
            int[] r0 = r3.j
            if (r0 == 0) goto L2c
            int r1 = r0.length
            if (r4 >= r1) goto L2c
            r4 = r0[r4]
            int[] r0 = r3.xt
            int r0 = j(r0, r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
        L16:
            if (r0 == 0) goto L27
            int r4 = r4 + 2
            int[] r2 = r3.xt
            int r2 = j(r2, r4)
            char r2 = (char) r2
            r1.append(r2)
            int r0 = r0 + (-1)
            goto L16
        L27:
            java.lang.String r4 = r1.toString()
            return r4
        L2c:
            r4 = 0
            return r4
    }
}
