package com.hw.videoprocessor.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class g {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;

    public g() {
            r3 = this;
            r3.<init>()
            r0 = 8000(0x1f40, float:1.121E-41)
            r3.b = r0
            r1 = 12
            r3.c = r1
            r2 = 2
            r3.d = r2
            r3.e = r2
            int r0 = android.media.AudioRecord.getMinBufferSize(r0, r1, r2)
            r3.a = r0
            return
    }

    public g(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.c = r2
            r0.d = r3
            r0.e = r4
            int r1 = android.media.AudioRecord.getMinBufferSize(r1, r2, r4)
            r0.a = r1
            return
    }

    private void b(java.io.FileOutputStream r23, long r24, long r26, long r28, int r30, long r31) throws java.io.IOException {
            r22 = this;
            r0 = 255(0xff, double:1.26E-321)
            long r2 = r26 & r0
            int r3 = (int) r2
            byte r2 = (byte) r3
            r3 = 8
            long r4 = r26 >> r3
            long r4 = r4 & r0
            int r5 = (int) r4
            byte r4 = (byte) r5
            r5 = 16
            long r6 = r26 >> r5
            long r6 = r6 & r0
            int r7 = (int) r6
            byte r6 = (byte) r7
            r7 = 24
            long r8 = r26 >> r7
            long r8 = r8 & r0
            int r9 = (int) r8
            byte r8 = (byte) r9
            r9 = r30
            byte r9 = (byte) r9
            long r10 = r28 & r0
            int r11 = (int) r10
            byte r10 = (byte) r11
            long r11 = r28 >> r3
            long r11 = r11 & r0
            int r12 = (int) r11
            byte r11 = (byte) r12
            long r12 = r28 >> r5
            long r12 = r12 & r0
            int r13 = (int) r12
            byte r12 = (byte) r13
            long r13 = r28 >> r7
            long r13 = r13 & r0
            int r14 = (int) r13
            byte r13 = (byte) r14
            long r14 = r31 & r0
            int r15 = (int) r14
            byte r14 = (byte) r15
            long r15 = r31 >> r3
            r17 = r0
            long r0 = r15 & r17
            int r1 = (int) r0
            byte r0 = (byte) r1
            long r15 = r31 >> r5
            r19 = r4
            r1 = 8
            long r3 = r15 & r17
            int r4 = (int) r3
            byte r3 = (byte) r4
            long r15 = r31 >> r7
            r4 = r2
            r26 = 8
            long r1 = r15 & r17
            int r2 = (int) r1
            byte r1 = (byte) r2
            r15 = r6
            r2 = 16
            long r5 = r24 & r17
            int r6 = (int) r5
            byte r5 = (byte) r6
            long r20 = r24 >> r26
            r6 = r3
            r27 = 16
            long r2 = r20 & r17
            int r3 = (int) r2
            byte r2 = (byte) r3
            long r20 = r24 >> r27
            r16 = r8
            r3 = 24
            long r7 = r20 & r17
            int r8 = (int) r7
            byte r7 = (byte) r8
            long r20 = r24 >> r3
            r28 = r4
            r29 = 24
            long r3 = r20 & r17
            int r4 = (int) r3
            byte r3 = (byte) r4
            r4 = 44
            byte[] r8 = new byte[r4]
            r4 = 0
            r17 = 82
            r8[r4] = r17
            r17 = 1
            r18 = 73
            r8[r17] = r18
            r18 = 2
            r20 = 70
            r8[r18] = r20
            r18 = 3
            r8[r18] = r20
            r18 = 4
            r8[r18] = r28
            r20 = 5
            r8[r20] = r19
            r19 = 6
            r8[r19] = r15
            r15 = 7
            r8[r15] = r16
            r15 = 87
            r8[r26] = r15
            r15 = 65
            r16 = 9
            r8[r16] = r15
            r15 = 86
            r16 = 10
            r8[r16] = r15
            r15 = 69
            r16 = 11
            r8[r16] = r15
            r15 = 102(0x66, float:1.43E-43)
            r16 = 12
            r8[r16] = r15
            r15 = 109(0x6d, float:1.53E-43)
            r16 = 13
            r8[r16] = r15
            r15 = 14
            r16 = 116(0x74, float:1.63E-43)
            r8[r15] = r16
            r15 = 15
            r19 = 32
            r8[r15] = r19
            r8[r27] = r27
            r15 = 17
            r8[r15] = r4
            r15 = 18
            r8[r15] = r4
            r15 = 19
            r8[r15] = r4
            r15 = 20
            r8[r15] = r17
            r15 = 21
            r8[r15] = r4
            r15 = 22
            r8[r15] = r9
            r9 = 23
            r8[r9] = r4
            r8[r29] = r10
            r9 = 25
            r8[r9] = r11
            r9 = 26
            r8[r9] = r12
            r9 = 27
            r8[r9] = r13
            r9 = 28
            r8[r9] = r14
            r9 = 29
            r8[r9] = r0
            r0 = 30
            r8[r0] = r6
            r0 = 31
            r8[r0] = r1
            r8[r19] = r18
            r0 = 33
            r8[r0] = r4
            r0 = 34
            r8[r0] = r27
            r0 = 35
            r8[r0] = r4
            r0 = 100
            r1 = 36
            r8[r1] = r0
            r0 = 37
            r1 = 97
            r8[r0] = r1
            r0 = 38
            r8[r0] = r16
            r0 = 39
            r8[r0] = r1
            r0 = 40
            r8[r0] = r5
            r0 = 41
            r8[r0] = r2
            r0 = 42
            r8[r0] = r7
            r0 = 43
            r8[r0] = r3
            r0 = r23
            r1 = 44
            r0.write(r8, r4, r1)
            return
    }

    public void a(java.lang.String r14, java.lang.String r15) {
            r13 = this;
            int r0 = r13.b
            long r7 = (long) r0
            int r9 = r13.d
            int r0 = r0 * 16
            int r0 = r0 * r9
            int r0 = r0 / 8
            long r10 = (long) r0
            int r0 = r13.a
            byte[] r0 = new byte[r0]
            java.io.FileInputStream r12 = new java.io.FileInputStream     // Catch: java.io.IOException -> L3b
            r12.<init>(r14)     // Catch: java.io.IOException -> L3b
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L3b
            r2.<init>(r15)     // Catch: java.io.IOException -> L3b
            java.nio.channels.FileChannel r14 = r12.getChannel()     // Catch: java.io.IOException -> L3b
            long r3 = r14.size()     // Catch: java.io.IOException -> L3b
            r14 = 36
            long r5 = r3 + r14
            r1 = r13
            r1.b(r2, r3, r5, r7, r9, r10)     // Catch: java.io.IOException -> L3b
        L2a:
            int r14 = r12.read(r0)     // Catch: java.io.IOException -> L3b
            r15 = -1
            if (r14 == r15) goto L35
            r2.write(r0)     // Catch: java.io.IOException -> L3b
            goto L2a
        L35:
            r12.close()     // Catch: java.io.IOException -> L3b
            r2.close()     // Catch: java.io.IOException -> L3b
        L3b:
            return
    }
}
