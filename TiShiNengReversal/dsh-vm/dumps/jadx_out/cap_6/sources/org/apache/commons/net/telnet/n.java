package org.apache.commons.net.telnet;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class n extends org.apache.commons.net.telnet.k {
    protected static final int j = 31;
    private int h;
    private int i;

    public n(int r7, int r8) {
            r6 = this;
            r4 = 0
            r5 = 0
            r1 = 31
            r2 = 0
            r3 = 0
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            r0.h = r7
            r0.i = r8
            return
    }

    public n(int r7, int r8, boolean r9, boolean r10, boolean r11, boolean r12) {
            r6 = this;
            r1 = 31
            r0 = r6
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r0.h = r7
            r0.i = r8
            return
    }

    @Override // org.apache.commons.net.telnet.k
    public int[] o() {
            r8 = this;
            int r0 = r8.h
            r1 = 65536(0x10000, float:9.1835E-41)
            int r1 = r1 * r0
            int r2 = r8.i
            int r1 = r1 + r2
            int r3 = r0 % 256
            r4 = 255(0xff, float:3.57E-43)
            if (r3 != r4) goto L11
            r3 = 6
            goto L12
        L11:
            r3 = 5
        L12:
            int r0 = r0 / 256
            if (r0 != r4) goto L18
            int r3 = r3 + 1
        L18:
            int r0 = r2 % 256
            if (r0 != r4) goto L1e
            int r3 = r3 + 1
        L1e:
            int r2 = r2 / 256
            if (r2 != r4) goto L24
            int r3 = r3 + 1
        L24:
            int[] r0 = new int[r3]
            r2 = 0
            r5 = 31
            r0[r2] = r5
            r2 = 1
            r5 = 24
            r6 = 1
        L2f:
            if (r6 >= r3) goto L41
            int r7 = r4 << r5
            r7 = r7 & r1
            int r7 = r7 >>> r5
            r0[r6] = r7
            if (r7 != r4) goto L3d
            int r6 = r6 + 1
            r0[r6] = r4
        L3d:
            int r6 = r6 + r2
            int r5 = r5 + (-8)
            goto L2f
        L41:
            return r0
    }
}
