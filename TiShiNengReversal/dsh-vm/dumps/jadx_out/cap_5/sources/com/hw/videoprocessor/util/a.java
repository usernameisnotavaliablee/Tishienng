package com.hw.videoprocessor.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a {
    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(java.lang.String r5, int r6, int r7, float r8, float r9) throws java.io.IOException {
            int r6 = r6 * 16
            int r6 = r6 / 8
            int r6 = r6 * r7
            float r6 = (float) r6
            float r8 = r8 * r6
            int r7 = (int) r8
            float r6 = r6 * r9
            int r6 = (int) r6
            byte[] r8 = new byte[r7]
            byte[] r9 = new byte[r6]
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r1 = "rw"
            r0.<init>(r5, r1)
            r5 = 0
            r0.read(r8, r5, r7)
            long r1 = r0.length()
            long r3 = (long) r6
            long r1 = r1 - r3
            int r2 = (int) r1
            long r1 = (long) r2
            r0.seek(r1)
            r0.read(r9, r5, r6)
            b(r8)
            c(r9)
            r1 = 0
            r0.seek(r1)
            r0.write(r8, r5, r7)
            long r7 = r0.length()
            long r7 = r7 - r3
            int r8 = (int) r7
            long r7 = (long) r8
            r0.seek(r7)
            r0.write(r9, r5, r6)
            r0.close()
            return
    }

    private static void b(byte[] r6) {
            int r0 = r6.length
            float r0 = (float) r0
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 / r0
            r0 = 0
            r2 = 0
        La:
            int r3 = r6.length
            if (r2 >= r3) goto L3c
            r3 = r6[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r4 = r2 + 1
            r5 = r6[r4]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 8
            r3 = r3 | r5
            short r3 = (short) r3
            float r3 = (float) r3
            float r3 = r3 * r0
            int r3 = (int) r3
            r5 = 32767(0x7fff, float:4.5916E-41)
            if (r3 <= r5) goto L26
            r3 = 32767(0x7fff, float:4.5916E-41)
            goto L2c
        L26:
            r5 = -32768(0xffffffffffff8000, float:NaN)
            if (r3 >= r5) goto L2c
            r3 = -32768(0xffffffffffff8000, float:NaN)
        L2c:
            r5 = r3 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r6[r2] = r5
            int r3 = r3 >>> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r6[r4] = r3
            float r0 = r0 + r1
            int r2 = r2 + 2
            goto La
        L3c:
            return
    }

    private static void c(byte[] r6) {
            int r0 = r6.length
            float r0 = (float) r0
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r1 / r0
            r2 = 0
        La:
            int r3 = r6.length
            if (r2 >= r3) goto L3c
            r3 = r6[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r4 = r2 + 1
            r5 = r6[r4]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 8
            r3 = r3 | r5
            short r3 = (short) r3
            float r3 = (float) r3
            float r3 = r3 * r1
            int r3 = (int) r3
            r5 = 32767(0x7fff, float:4.5916E-41)
            if (r3 <= r5) goto L26
            r3 = 32767(0x7fff, float:4.5916E-41)
            goto L2c
        L26:
            r5 = -32768(0xffffffffffff8000, float:NaN)
            if (r3 >= r5) goto L2c
            r3 = -32768(0xffffffffffff8000, float:NaN)
        L2c:
            r5 = r3 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r6[r2] = r5
            int r3 = r3 >>> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r6[r4] = r3
            float r1 = r1 - r0
            int r2 = r2 + 2
            goto La
        L3c:
            return
    }
}
