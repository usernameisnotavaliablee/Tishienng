package org.apache.harmony.awt.datatransfer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class RawBitmap {
    public final int bMask;
    public final int bits;
    public final java.lang.Object buffer;
    public final int gMask;
    public final int height;
    public final int rMask;
    public final int stride;
    public final int width;

    public RawBitmap(int r1, int r2, int r3, int r4, int r5, int r6, int r7, java.lang.Object r8) {
            r0 = this;
            r0.<init>()
            r0.width = r1
            r0.height = r2
            r0.stride = r3
            r0.bits = r4
            r0.rMask = r5
            r0.gMask = r6
            r0.bMask = r7
            r0.buffer = r8
            return
    }

    public RawBitmap(int[] r2, java.lang.Object r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r0 = r2[r0]
            r1.width = r0
            r0 = 1
            r0 = r2[r0]
            r1.height = r0
            r0 = 2
            r0 = r2[r0]
            r1.stride = r0
            r0 = 3
            r0 = r2[r0]
            r1.bits = r0
            r0 = 4
            r0 = r2[r0]
            r1.rMask = r0
            r0 = 5
            r0 = r2[r0]
            r1.gMask = r0
            r0 = 6
            r2 = r2[r0]
            r1.bMask = r2
            r1.buffer = r3
            return
    }

    public int[] getHeader() {
            r7 = this;
            int r0 = r7.width
            int r1 = r7.height
            int r2 = r7.stride
            int r3 = r7.bits
            int r4 = r7.rMask
            int r5 = r7.gMask
            int r6 = r7.bMask
            int[] r0 = new int[]{r0, r1, r2, r3, r4, r5, r6}
            return r0
    }
}
