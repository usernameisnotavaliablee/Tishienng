package com.bytedance.pangle.res.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class vl {
    public vl() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void j(com.bytedance.pangle.res.j.ae r5) throws java.io.IOException {
            r0 = 1835009(0x1c0001, float:2.571395E-39)
            r1 = 0
            r5.xt(r0, r1)
            int r0 = r5.readInt()
            int r1 = r5.readInt()
            int r2 = r5.readInt()
            r5.j()
            int r3 = r5.readInt()
            int r4 = r5.readInt()
            int r1 = r1 * 4
            r5.skipBytes(r1)
            if (r2 == 0) goto L2a
            int r2 = r2 * 4
            r5.skipBytes(r2)
        L2a:
            if (r4 != 0) goto L2e
            r1 = r0
            goto L2f
        L2e:
            r1 = r4
        L2f:
            int r1 = r1 - r3
            r5.skipBytes(r1)
            if (r4 == 0) goto L46
            int r0 = r0 - r4
            r5.skipBytes(r0)
            int r0 = r0 % 4
            if (r0 <= 0) goto L46
        L3d:
            int r1 = r0 + (-1)
            if (r0 <= 0) goto L46
            r5.readByte()
            r0 = r1
            goto L3d
        L46:
            return
    }
}
