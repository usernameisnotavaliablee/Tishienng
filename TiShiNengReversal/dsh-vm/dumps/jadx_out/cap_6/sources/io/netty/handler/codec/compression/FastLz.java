package io.netty.handler.codec.compression;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class FastLz {
    static final byte BLOCK_TYPE_COMPRESSED = 1;
    static final byte BLOCK_TYPE_NON_COMPRESSED = 0;
    static final byte BLOCK_WITHOUT_CHECKSUM = 0;
    static final byte BLOCK_WITH_CHECKSUM = 16;
    static final int CHECKSUM_OFFSET = 4;
    private static final int HASH_LOG = 13;
    private static final int HASH_MASK = 8191;
    private static final int HASH_SIZE = 8192;
    static final int LEVEL_1 = 1;
    static final int LEVEL_2 = 2;
    static final int LEVEL_AUTO = 0;
    static final int MAGIC_NUMBER = 4607066;
    static final int MAX_CHUNK_LENGTH = 65535;
    private static final int MAX_COPY = 32;
    private static final int MAX_DISTANCE = 8191;
    private static final int MAX_FARDISTANCE = 73725;
    private static final int MAX_LEN = 264;
    static final int MIN_LENGTH_TO_COMPRESSION = 32;
    private static final int MIN_RECOMENDED_LENGTH_FOR_LEVEL_2 = 65536;
    static final int OPTIONS_OFFSET = 3;

    private FastLz() {
            r0 = this;
            r0.<init>()
            return
    }

    static int calculateOutputBufferLength(int r4) {
            double r0 = (double) r4
            r2 = 4607452634777659638(0x3ff0f5c28f5c28f6, double:1.06)
            double r0 = r0 * r2
            int r4 = (int) r0
            r0 = 66
            int r4 = java.lang.Math.max(r4, r0)
            return r4
    }

    static int compress(byte[] r27, int r28, int r29, byte[] r30, int r31, int r32) {
            r0 = r27
            r1 = r29
            r2 = 2
            r3 = 1
            if (r32 != 0) goto L10
            r4 = 65536(0x10000, float:9.1835E-41)
            if (r1 >= r4) goto Le
            r4 = 1
            goto L12
        Le:
            r4 = 2
            goto L12
        L10:
            r4 = r32
        L12:
            int r5 = r1 + (-2)
            int r6 = r1 + (-12)
            r7 = 8192(0x2000, float:1.148E-41)
            int[] r8 = new int[r7]
            r9 = 4
            r10 = 0
            if (r1 >= r9) goto L3d
            if (r1 == 0) goto L3c
            int r2 = r1 + (-1)
            byte r2 = (byte) r2
            r30[r31] = r2
            int r2 = r1 + (-1)
            r4 = 1
        L28:
            if (r10 > r2) goto L39
            int r5 = r4 + 1
            int r4 = r31 + r4
            int r6 = r10 + 1
            int r10 = r28 + r10
            r7 = r0[r10]
            r30[r4] = r7
            r4 = r5
            r10 = r6
            goto L28
        L39:
            int r0 = r1 + 1
            return r0
        L3c:
            return r10
        L3d:
            r9 = 0
        L3e:
            if (r9 >= r7) goto L45
            r8[r9] = r10
            int r9 = r9 + 1
            goto L3e
        L45:
            r7 = 31
            r30[r31] = r7
            int r9 = r31 + 1
            r11 = r0[r28]
            r30[r9] = r11
            int r9 = r31 + 2
            int r11 = r28 + 1
            r11 = r0[r11]
            r30[r9] = r11
            r11 = 2
            r12 = 3
            r13 = 2
        L5a:
            if (r11 >= r6) goto L36c
            r17 = 0
            if (r4 != r2) goto L80
            int r19 = r28 + r11
            r32 = 31
            r7 = r0[r19]
            int r9 = r19 + (-1)
            r10 = r0[r9]
            if (r7 != r10) goto L82
            int r7 = readU16(r0, r9)
            int r9 = r19 + 1
            int r9 = readU16(r0, r9)
            if (r7 != r9) goto L82
            int r7 = r11 + 3
            int r9 = r11 + 2
            r10 = 1
            r20 = 1
            goto L87
        L80:
            r32 = 31
        L82:
            r7 = r11
            r20 = r17
            r9 = 0
            r10 = 0
        L87:
            r22 = 8191(0x1fff, double:4.047E-320)
            if (r10 != 0) goto L147
            int r9 = r28 + r7
            int r10 = hashFunction(r0, r9)
            r19 = r8[r10]
            r24 = 1
            int r15 = r11 - r19
            long r14 = (long) r15
            r8[r10] = r11
            int r10 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r10 == 0) goto La4
            if (r4 != r3) goto La8
            int r10 = (r14 > r22 ? 1 : (r14 == r22 ? 0 : -1))
            if (r10 < 0) goto Laf
        La4:
            r26 = 1
            goto L12e
        La8:
            r20 = 73725(0x11ffd, double:3.6425E-319)
            int r10 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r10 >= 0) goto La4
        Laf:
            int r10 = r19 + 1
            int r20 = r28 + r19
            r26 = 1
            r3 = r0[r20]
            int r20 = r7 + 1
            r9 = r0[r9]
            if (r3 != r9) goto L12e
            int r3 = r19 + 2
            int r10 = r28 + r10
            r9 = r0[r10]
            int r10 = r7 + 2
            int r20 = r28 + r20
            r2 = r0[r20]
            if (r9 != r2) goto L12e
            int r9 = r19 + 3
            int r3 = r28 + r3
            r2 = r0[r3]
            int r3 = r7 + 3
            int r10 = r28 + r10
            r10 = r0[r10]
            if (r2 == r10) goto Lda
            goto L12e
        Lda:
            r2 = 2
            if (r4 != r2) goto L12a
            int r2 = (r14 > r22 ? 1 : (r14 == r22 ? 0 : -1))
            if (r2 < 0) goto L12a
            int r7 = r7 + 4
            int r3 = r28 + r3
            r2 = r0[r3]
            int r3 = r19 + 4
            int r9 = r28 + r9
            r9 = r0[r9]
            if (r2 != r9) goto L100
            int r7 = r28 + r7
            r2 = r0[r7]
            int r9 = r19 + 5
            int r3 = r28 + r3
            r3 = r0[r3]
            if (r2 == r3) goto Lfc
            goto L100
        Lfc:
            r2 = 5
            r20 = r14
            goto L14c
        L100:
            int r2 = r12 + 1
            int r3 = r31 + r12
            int r7 = r11 + 1
            int r11 = r28 + r11
            r9 = r0[r11]
            r30[r3] = r9
            int r13 = r13 + 1
            r3 = 32
            if (r13 != r3) goto L121
            int r12 = r12 + 2
            int r2 = r31 + r2
            r30[r2] = r32
        L118:
            r11 = r7
            r2 = 2
            r3 = 1
            r7 = 31
            r10 = 0
            r13 = 0
            goto L5a
        L121:
            r12 = r2
            r11 = r7
            r2 = 2
            r3 = 1
            r7 = 31
            r10 = 0
            goto L5a
        L12a:
            r20 = r14
        L12c:
            r2 = 3
            goto L14c
        L12e:
            int r2 = r12 + 1
            int r3 = r31 + r12
            int r7 = r11 + 1
            int r11 = r28 + r11
            r9 = r0[r11]
            r30[r3] = r9
            int r13 = r13 + 1
            r3 = 32
            if (r13 != r3) goto L121
            int r12 = r12 + 2
            int r2 = r31 + r2
            r30[r2] = r32
            goto L118
        L147:
            r24 = 1
            r26 = 1
            goto L12c
        L14c:
            int r2 = r2 + r11
            long r14 = r20 - r24
            int r3 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r3 != 0) goto L169
            int r3 = r28 + r2
            int r3 = r3 + (-1)
            r3 = r0[r3]
        L159:
            if (r2 >= r5) goto L1f9
            int r7 = r9 + 1
            int r9 = r28 + r9
            r9 = r0[r9]
            if (r9 == r3) goto L165
            goto L1f9
        L165:
            int r2 = r2 + 1
            r9 = r7
            goto L159
        L169:
            int r3 = r9 + 1
            int r7 = r28 + r9
            r7 = r0[r7]
            int r10 = r2 + 1
            int r16 = r28 + r2
            r1 = r0[r16]
            if (r7 == r1) goto L17a
        L177:
            r2 = r10
            goto L1f9
        L17a:
            int r1 = r9 + 2
            int r3 = r28 + r3
            r3 = r0[r3]
            int r7 = r2 + 2
            int r10 = r28 + r10
            r10 = r0[r10]
            if (r3 == r10) goto L18b
        L188:
            r2 = r7
            goto L1f9
        L18b:
            int r3 = r9 + 3
            int r1 = r28 + r1
            r1 = r0[r1]
            int r10 = r2 + 3
            int r7 = r28 + r7
            r7 = r0[r7]
            if (r1 == r7) goto L19a
            goto L177
        L19a:
            int r1 = r9 + 4
            int r3 = r28 + r3
            r3 = r0[r3]
            int r7 = r2 + 4
            int r10 = r28 + r10
            r10 = r0[r10]
            if (r3 == r10) goto L1a9
            goto L188
        L1a9:
            int r3 = r9 + 5
            int r1 = r28 + r1
            r1 = r0[r1]
            int r10 = r2 + 5
            int r7 = r28 + r7
            r7 = r0[r7]
            if (r1 == r7) goto L1b8
            goto L177
        L1b8:
            int r1 = r9 + 6
            int r3 = r28 + r3
            r3 = r0[r3]
            int r7 = r2 + 6
            int r10 = r28 + r10
            r10 = r0[r10]
            if (r3 == r10) goto L1c7
            goto L188
        L1c7:
            int r3 = r9 + 7
            int r1 = r28 + r1
            r1 = r0[r1]
            int r10 = r2 + 7
            int r7 = r28 + r7
            r7 = r0[r7]
            if (r1 == r7) goto L1d6
            goto L177
        L1d6:
            int r9 = r9 + 8
            int r3 = r28 + r3
            r1 = r0[r3]
            int r2 = r2 + 8
            int r10 = r28 + r10
            r3 = r0[r10]
            if (r1 == r3) goto L1e5
            goto L1f9
        L1e5:
            if (r2 >= r5) goto L1f9
            int r1 = r9 + 1
            int r9 = r28 + r9
            r3 = r0[r9]
            int r7 = r2 + 1
            int r2 = r28 + r2
            r2 = r0[r2]
            if (r3 == r2) goto L1f6
            goto L188
        L1f6:
            r9 = r1
            r2 = r7
            goto L1e5
        L1f9:
            if (r13 == 0) goto L206
            int r1 = r31 + r12
            int r1 = r1 - r13
            int r1 = r1 + (-1)
            int r13 = r13 + (-1)
            byte r3 = (byte) r13
            r30[r1] = r3
            goto L208
        L206:
            int r12 = r12 + (-1)
        L208:
            int r1 = r2 + (-3)
            int r3 = r1 - r11
            r9 = 224(0xe0, double:1.107E-321)
            r7 = 7
            r16 = 255(0xff, double:1.26E-321)
            r13 = 2
            if (r4 != r13) goto L2da
            r13 = 255(0xff, float:3.57E-43)
            r18 = -1
            int r19 = (r14 > r22 ? 1 : (r14 == r22 ? 0 : -1))
            if (r19 >= 0) goto L26e
            if (r3 >= r7) goto L23d
            int r7 = r12 + 1
            int r9 = r31 + r12
            int r3 = r3 << 5
            r19 = r12
            r22 = 8
            long r11 = (long) r3
            long r20 = r14 >>> r22
            long r11 = r11 + r20
            int r3 = (int) r11
            byte r3 = (byte) r3
            r30[r9] = r3
            int r12 = r19 + 2
            int r7 = r31 + r7
            long r9 = r14 & r16
            int r3 = (int) r9
            byte r3 = (byte) r3
            r30[r7] = r3
            goto L347
        L23d:
            r19 = r12
            r22 = 8
            int r12 = r19 + 1
            int r7 = r31 + r19
            long r20 = r14 >>> r22
            long r9 = r20 + r9
            int r10 = (int) r9
            byte r9 = (byte) r10
            r30[r7] = r9
            int r3 = r3 + (-7)
        L24f:
            if (r3 < r13) goto L25b
            int r7 = r12 + 1
            int r12 = r31 + r12
            r30[r12] = r18
            int r3 = r3 + (-255)
            r12 = r7
            goto L24f
        L25b:
            int r7 = r12 + 1
            int r9 = r31 + r12
            byte r3 = (byte) r3
            r30[r9] = r3
            int r12 = r12 + 2
            int r7 = r31 + r7
            long r9 = r14 & r16
            int r3 = (int) r9
            byte r3 = (byte) r3
            r30[r7] = r3
            goto L347
        L26e:
            r19 = r12
            r22 = 8
            if (r3 >= r7) goto L2a0
            r9 = 8192(0x2000, double:4.0474E-320)
            long r20 = r20 - r9
            int r12 = r19 + 1
            int r7 = r31 + r19
            int r3 = r3 << 5
            int r3 = r3 + 31
            byte r3 = (byte) r3
            r30[r7] = r3
            int r3 = r19 + 2
            int r12 = r31 + r12
            r30[r12] = r18
            int r12 = r19 + 3
            int r3 = r31 + r3
            long r9 = r20 >>> r22
            int r7 = (int) r9
            byte r7 = (byte) r7
            r30[r3] = r7
            int r3 = r19 + 4
            int r12 = r31 + r12
            long r9 = r20 & r16
            int r7 = (int) r9
            byte r7 = (byte) r7
            r30[r12] = r7
            r12 = r3
            goto L347
        L2a0:
            r9 = 8192(0x2000, double:4.0474E-320)
            long r20 = r20 - r9
            int r12 = r19 + 1
            int r7 = r31 + r19
            r30[r7] = r18
            int r3 = r3 + (-7)
        L2ac:
            if (r3 < r13) goto L2b8
            int r7 = r12 + 1
            int r12 = r31 + r12
            r30[r12] = r18
            int r3 = r3 + (-255)
            r12 = r7
            goto L2ac
        L2b8:
            int r7 = r12 + 1
            int r9 = r31 + r12
            byte r3 = (byte) r3
            r30[r9] = r3
            int r3 = r12 + 2
            int r7 = r31 + r7
            r30[r7] = r18
            int r7 = r12 + 3
            int r3 = r31 + r3
            long r9 = r20 >>> r22
            int r10 = (int) r9
            byte r9 = (byte) r10
            r30[r3] = r9
            int r12 = r12 + 4
            int r7 = r31 + r7
            long r9 = r20 & r16
            int r3 = (int) r9
            byte r3 = (byte) r3
            r30[r7] = r3
            goto L347
        L2da:
            r19 = r12
            r22 = 8
            r11 = 262(0x106, float:3.67E-43)
            if (r3 <= r11) goto L30a
        L2e2:
            r11 = 262(0x106, float:3.67E-43)
            if (r3 <= r11) goto L30a
            int r11 = r12 + 1
            int r13 = r31 + r12
            long r18 = r14 >>> r22
            r20 = r9
            long r9 = r18 + r20
            int r10 = (int) r9
            byte r9 = (byte) r10
            r30[r13] = r9
            int r9 = r12 + 2
            int r11 = r31 + r11
            r10 = -3
            r30[r11] = r10
            int r12 = r12 + 3
            int r9 = r31 + r9
            long r10 = r14 & r16
            int r11 = (int) r10
            byte r10 = (byte) r11
            r30[r9] = r10
            int r3 = r3 + (-262)
            r9 = r20
            goto L2e2
        L30a:
            r20 = r9
            if (r3 >= r7) goto L328
            int r7 = r12 + 1
            int r9 = r31 + r12
            int r3 = r3 << 5
            long r10 = (long) r3
            long r18 = r14 >>> r22
            long r10 = r10 + r18
            int r3 = (int) r10
            byte r3 = (byte) r3
            r30[r9] = r3
            int r12 = r12 + 2
            int r7 = r31 + r7
            long r9 = r14 & r16
            int r3 = (int) r9
            byte r3 = (byte) r3
            r30[r7] = r3
            goto L347
        L328:
            int r7 = r12 + 1
            int r9 = r31 + r12
            long r10 = r14 >>> r22
            long r10 = r10 + r20
            int r11 = (int) r10
            byte r10 = (byte) r11
            r30[r9] = r10
            int r9 = r12 + 2
            int r7 = r31 + r7
            int r3 = r3 + (-7)
            byte r3 = (byte) r3
            r30[r7] = r3
            int r12 = r12 + 3
            int r9 = r31 + r9
            long r10 = r14 & r16
            int r3 = (int) r10
            byte r3 = (byte) r3
            r30[r9] = r3
        L347:
            int r3 = r28 + r1
            int r3 = hashFunction(r0, r3)
            int r7 = r2 + (-2)
            r8[r3] = r1
            int r1 = r28 + r7
            int r1 = hashFunction(r0, r1)
            int r11 = r2 + (-1)
            r8[r1] = r7
            int r1 = r12 + 1
            int r12 = r31 + r12
            r30[r12] = r32
            r12 = r1
            r2 = 2
            r3 = 1
            r7 = 31
            r10 = 0
            r13 = 0
            r1 = r29
            goto L5a
        L36c:
            r32 = 31
            r26 = 1
            int r1 = r29 + (-1)
        L372:
            if (r11 > r1) goto L392
            int r2 = r12 + 1
            int r3 = r31 + r12
            int r5 = r11 + 1
            int r11 = r28 + r11
            r6 = r0[r11]
            r30[r3] = r6
            int r13 = r13 + 1
            r3 = 32
            if (r13 != r3) goto L38f
            int r12 = r12 + 2
            int r2 = r31 + r2
            r30[r2] = r32
            r11 = r5
            r13 = 0
            goto L372
        L38f:
            r12 = r2
            r11 = r5
            goto L372
        L392:
            if (r13 == 0) goto L3a0
            int r0 = r31 + r12
            int r0 = r0 - r13
            int r0 = r0 + (-1)
            int r13 = r13 + (-1)
            byte r1 = (byte) r13
            r30[r0] = r1
        L39e:
            r13 = 2
            goto L3a3
        L3a0:
            int r12 = r12 + (-1)
            goto L39e
        L3a3:
            if (r4 != r13) goto L3ae
            r0 = r30[r31]
            r16 = 32
            r0 = r0 | 32
            byte r0 = (byte) r0
            r30[r31] = r0
        L3ae:
            return r12
    }

    static int decompress(byte[] r28, int r29, int r30, byte[] r31, int r32, int r33) {
            r0 = r30
            r1 = r33
            r2 = r28[r29]
            r3 = 5
            int r2 = r2 >> r3
            r4 = 1
            int r2 = r2 + r4
            r5 = 0
            if (r2 == r4) goto L32
            r6 = 2
            if (r2 != r6) goto L11
            goto L32
        L11:
            io.netty.handler.codec.compression.DecompressionException r0 = new io.netty.handler.codec.compression.DecompressionException
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r5] = r1
            r7[r4] = r2
            r7[r6] = r3
            java.lang.String r1 = "invalid level: %d (expected: %d or %d)"
            java.lang.String r1 = java.lang.String.format(r1, r7)
            r0.<init>(r1)
            throw r0
        L32:
            r6 = r28[r29]
            r6 = r6 & 31
            long r6 = (long) r6
            r8 = 0
            r9 = 1
            r10 = 1
        L3a:
            long r11 = r6 >> r3
            r13 = 31
            long r13 = r13 & r6
            r15 = 8
            long r13 = r13 << r15
            r16 = 32
            r18 = 0
            r20 = 1
            int r22 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r22 < 0) goto L151
            long r11 = r11 - r20
            r22 = r6
            r16 = 0
            long r5 = (long) r8
            long r3 = r5 - r13
            int r4 = (int) r3
            r24 = 6
            int r3 = (r11 > r24 ? 1 : (r11 == r24 ? 0 : -1))
            if (r3 != 0) goto L8a
            r7 = 1
            if (r2 != r7) goto L73
            int r3 = r9 + 1
            int r9 = r29 + r9
            r9 = r28[r9]
            r7 = 255(0xff, float:3.57E-43)
            r9 = r9 & r7
            r25 = r8
            long r7 = (long) r9
            long r11 = r11 + r7
            r9 = r3
            r17 = r4
            r7 = 1
            r8 = 255(0xff, float:3.57E-43)
            goto L91
        L73:
            r25 = r8
        L75:
            int r3 = r9 + 1
            int r9 = r29 + r9
            r7 = r28[r9]
            r8 = 255(0xff, float:3.57E-43)
            r7 = r7 & r8
            r9 = r3
            r17 = r4
            long r3 = (long) r7
            long r11 = r11 + r3
            if (r7 == r8) goto L87
        L85:
            r7 = 1
            goto L91
        L87:
            r4 = r17
            goto L75
        L8a:
            r17 = r4
            r25 = r8
            r8 = 255(0xff, float:3.57E-43)
            goto L85
        L91:
            if (r2 != r7) goto L9d
            int r3 = r9 + 1
            int r9 = r29 + r9
            r4 = r28[r9]
            r4 = r4 & r8
            int r4 = r17 - r4
            goto Lc9
        L9d:
            int r3 = r9 + 1
            int r4 = r29 + r9
            r4 = r28[r4]
            r4 = r4 & r8
            int r24 = r17 - r4
            if (r4 != r8) goto Lc7
            r26 = 7936(0x1f00, double:3.921E-320)
            int r4 = (r13 > r26 ? 1 : (r13 == r26 ? 0 : -1))
            if (r4 != 0) goto Lc7
            int r4 = r9 + 2
            int r3 = r29 + r3
            r3 = r28[r3]
            r3 = r3 & r8
            int r3 = r3 << r15
            long r13 = (long) r3
            int r3 = r9 + 3
            int r4 = r29 + r4
            r4 = r28[r4]
            r4 = r4 & r8
            long r8 = (long) r4
            long r13 = r13 + r8
            long r8 = r5 - r13
            r13 = 8191(0x1fff, double:4.047E-320)
            long r8 = r8 - r13
            int r4 = (int) r8
            goto Lc9
        Lc7:
            r4 = r24
        Lc9:
            long r5 = r5 + r11
            r8 = 3
            long r5 = r5 + r8
            long r8 = (long) r1
            int r13 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r13 <= 0) goto Ld3
            return r16
        Ld3:
            int r5 = r4 + (-1)
            if (r5 >= 0) goto Ld8
            return r16
        Ld8:
            if (r3 >= r0) goto Lea
            int r5 = r3 + 1
            int r3 = r29 + r3
            r3 = r28[r3]
            r8 = 255(0xff, float:3.57E-43)
            r3 = r3 & r8
            long r8 = (long) r3
            r3 = r5
            r22 = r8
        Le7:
            r5 = r25
            goto Lec
        Lea:
            r10 = 0
            goto Le7
        Lec:
            if (r4 != r5) goto L117
            int r4 = r32 + r4
            r7 = 1
            int r4 = r4 - r7
            r4 = r31[r4]
            int r8 = r5 + 1
            int r6 = r32 + r5
            r31[r6] = r4
            int r6 = r5 + 2
            int r8 = r32 + r8
            r31[r8] = r4
            int r8 = r5 + 3
            int r6 = r32 + r6
            r31[r6] = r4
        L106:
            int r5 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r5 == 0) goto L114
            int r5 = r8 + 1
            int r8 = r32 + r8
            r31[r8] = r4
            long r11 = r11 - r20
            r8 = r5
            goto L106
        L114:
            r9 = r3
            goto L1a2
        L117:
            r7 = 1
            int r6 = r4 + (-1)
            int r8 = r5 + 1
            int r9 = r32 + r5
            int r6 = r32 + r6
            r6 = r31[r6]
            r31[r9] = r6
            int r6 = r5 + 2
            int r8 = r32 + r8
            int r9 = r4 + 1
            int r13 = r32 + r4
            r13 = r31[r13]
            r31[r8] = r13
            int r8 = r5 + 3
            int r6 = r32 + r6
            int r4 = r4 + 2
            int r9 = r32 + r9
            r5 = r31[r9]
            r31[r6] = r5
        L13c:
            int r5 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r5 == 0) goto L114
            int r5 = r8 + 1
            int r8 = r32 + r8
            int r6 = r4 + 1
            int r4 = r32 + r4
            r4 = r31[r4]
            r31[r8] = r4
            long r11 = r11 - r20
            r8 = r5
            r4 = r6
            goto L13c
        L151:
            r22 = r6
            r5 = r8
            r7 = 1
            r16 = 0
            long r3 = r22 + r20
            long r10 = (long) r5
            long r10 = r10 + r3
            long r12 = (long) r1
            int r6 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r6 <= 0) goto L161
            return r16
        L161:
            long r10 = (long) r9
            long r10 = r10 + r3
            long r3 = (long) r0
            int r6 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r6 <= 0) goto L169
            return r16
        L169:
            int r8 = r5 + 1
            int r3 = r32 + r5
            int r4 = r9 + 1
            int r9 = r29 + r9
            r5 = r28[r9]
            r31[r3] = r5
        L175:
            int r3 = (r22 > r18 ? 1 : (r22 == r18 ? 0 : -1))
            if (r3 == 0) goto L18a
            int r3 = r8 + 1
            int r8 = r32 + r8
            int r5 = r4 + 1
            int r4 = r29 + r4
            r4 = r28[r4]
            r31[r8] = r4
            long r22 = r22 - r20
            r8 = r3
            r4 = r5
            goto L175
        L18a:
            if (r4 >= r0) goto L18e
            r3 = 1
            goto L18f
        L18e:
            r3 = 0
        L18f:
            if (r3 == 0) goto L1a0
            int r5 = r4 + 1
            int r4 = r29 + r4
            r4 = r28[r4]
            r6 = 255(0xff, float:3.57E-43)
            r4 = r4 & r6
            long r9 = (long) r4
            r22 = r9
            r10 = r3
            r9 = r5
            goto L1a2
        L1a0:
            r10 = r3
            r9 = r4
        L1a2:
            if (r10 != 0) goto L1a5
            return r8
        L1a5:
            r6 = r22
            r3 = 5
            r4 = 1
            r5 = 0
            goto L3a
    }

    private static int hashFunction(byte[] r1, int r2) {
            int r0 = readU16(r1, r2)
            int r2 = r2 + 1
            int r1 = readU16(r1, r2)
            int r2 = r0 >> 3
            r1 = r1 ^ r2
            r1 = r1 ^ r0
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            return r1
    }

    private static int readU16(byte[] r2, int r3) {
            int r0 = r3 + 1
            int r1 = r2.length
            if (r0 < r1) goto La
            r2 = r2[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            return r2
        La:
            r0 = r2[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            r2 = r2[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r2 = r2 | r0
            return r2
    }
}
