package com.baidu.idl.face.platform.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class Base64Utils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int CRLF = 4;
    public static final int DEFAULT = 0;
    public static final int NO_CLOSE = 16;
    public static final int NO_PADDING = 1;
    public static final int NO_WRAP = 2;
    public static final int URL_SAFE = 8;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static abstract class Coder {
        public int op;
        public byte[] output;

        Coder() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract int maxOutputSize(int r1);

        public abstract boolean process(byte[] r1, int r2, int r3, boolean r4);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class Decoder extends com.baidu.idl.face.platform.utils.Base64Utils.Coder {
        private static final int[] DECODE = null;
        private static final int[] DECODE_WEBSAFE = null;
        private static final int EQUALS = -2;
        private static final int SKIP = -1;
        private final int[] alphabet;
        private int state;
        private int value;

        static {
                r0 = 256(0x100, float:3.59E-43)
                int[] r0 = new int[r0]
                r0 = {x0014: FILL_ARRAY_DATA , data: [-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1} // fill-array
                com.baidu.idl.face.platform.utils.Base64Utils.Decoder.DECODE = r0
                r0 = 256(0x100, float:3.59E-43)
                int[] r0 = new int[r0]
                r0 = {x0218: FILL_ARRAY_DATA , data: [-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1} // fill-array
                com.baidu.idl.face.platform.utils.Base64Utils.Decoder.DECODE_WEBSAFE = r0
                return
        }

        public Decoder(int r1, byte[] r2) {
                r0 = this;
                r0.<init>()
                r0.output = r2
                r1 = r1 & 8
                if (r1 != 0) goto Lc
                int[] r1 = com.baidu.idl.face.platform.utils.Base64Utils.Decoder.DECODE
                goto Le
            Lc:
                int[] r1 = com.baidu.idl.face.platform.utils.Base64Utils.Decoder.DECODE_WEBSAFE
            Le:
                r0.alphabet = r1
                r1 = 0
                r0.state = r1
                r0.value = r1
                return
        }

        @Override // com.baidu.idl.face.platform.utils.Base64Utils.Coder
        public int maxOutputSize(int r1) {
                r0 = this;
                int r1 = r1 * 3
                int r1 = r1 / 4
                int r1 = r1 + 10
                return r1
        }

        @Override // com.baidu.idl.face.platform.utils.Base64Utils.Coder
        public boolean process(byte[] r17, int r18, int r19, boolean r20) {
                r16 = this;
                r0 = r16
                int r1 = r0.state
                r2 = 0
                r3 = 6
                if (r1 != r3) goto L9
                return r2
            L9:
                int r4 = r19 + r18
                int r5 = r0.value
                byte[] r6 = r0.output
                int[] r7 = r0.alphabet
                r8 = r5
                r9 = 0
                r5 = r1
                r1 = r18
            L16:
                r10 = 3
                r11 = 4
                r12 = 2
                r13 = 1
                if (r1 >= r4) goto Leb
                if (r5 != 0) goto L63
            L1e:
                int r14 = r1 + 4
                if (r14 > r4) goto L5f
                r8 = r17[r1]
                r8 = r8 & 255(0xff, float:3.57E-43)
                r8 = r7[r8]
                int r8 = r8 << 18
                int r15 = r1 + 1
                r15 = r17[r15]
                r15 = r15 & 255(0xff, float:3.57E-43)
                r15 = r7[r15]
                int r15 = r15 << 12
                r8 = r8 | r15
                int r15 = r1 + 2
                r15 = r17[r15]
                r15 = r15 & 255(0xff, float:3.57E-43)
                r15 = r7[r15]
                int r15 = r15 << r3
                r8 = r8 | r15
                int r15 = r1 + 3
                r15 = r17[r15]
                r15 = r15 & 255(0xff, float:3.57E-43)
                r15 = r7[r15]
                r8 = r8 | r15
                if (r8 < 0) goto L5f
                int r1 = r9 + 2
                byte r15 = (byte) r8
                r6[r1] = r15
                int r1 = r9 + 1
                int r15 = r8 >> 8
                byte r15 = (byte) r15
                r6[r1] = r15
                int r1 = r8 >> 16
                byte r1 = (byte) r1
                r6[r9] = r1
                int r9 = r9 + 3
                r1 = r14
                goto L1e
            L5f:
                if (r1 < r4) goto L63
                goto Leb
            L63:
                int r14 = r1 + 1
                r1 = r17[r1]
                r1 = r1 & 255(0xff, float:3.57E-43)
                r1 = r7[r1]
                r15 = -1
                if (r5 == 0) goto Le0
                if (r5 == r13) goto Ld8
                r13 = -2
                if (r5 == r12) goto Lbe
                r12 = 5
                if (r5 == r10) goto L8c
                if (r5 == r11) goto L81
                if (r5 == r12) goto L7c
                goto Le8
            L7c:
                if (r1 == r15) goto Le8
                r0.state = r3
                return r2
            L81:
                if (r1 != r13) goto L87
                int r5 = r5 + 1
                goto Le8
            L87:
                if (r1 == r15) goto Le8
                r0.state = r3
                return r2
            L8c:
                if (r1 < 0) goto La7
                int r5 = r8 << 6
                r1 = r1 | r5
                int r5 = r9 + 2
                byte r8 = (byte) r1
                r6[r5] = r8
                int r5 = r9 + 1
                int r8 = r1 >> 8
                byte r8 = (byte) r8
                r6[r5] = r8
                int r5 = r1 >> 16
                byte r5 = (byte) r5
                r6[r9] = r5
                int r9 = r9 + 3
                r8 = r1
                r5 = 0
                goto Le8
            La7:
                if (r1 != r13) goto Lb9
                int r1 = r9 + 1
                int r5 = r8 >> 2
                byte r5 = (byte) r5
                r6[r1] = r5
                int r1 = r8 >> 10
                byte r1 = (byte) r1
                r6[r9] = r1
                int r9 = r9 + 2
                r5 = 5
                goto Le8
            Lb9:
                if (r1 == r15) goto Le8
                r0.state = r3
                return r2
            Lbe:
                if (r1 < 0) goto Lc7
            Lc0:
                int r8 = r8 << 6
                r1 = r1 | r8
            Lc3:
                int r5 = r5 + 1
                r8 = r1
                goto Le8
            Lc7:
                if (r1 != r13) goto Ld3
                int r1 = r9 + 1
                int r5 = r8 >> 4
                byte r5 = (byte) r5
                r6[r9] = r5
                r9 = r1
                r5 = 4
                goto Le8
            Ld3:
                if (r1 == r15) goto Le8
                r0.state = r3
                return r2
            Ld8:
                if (r1 < 0) goto Ldb
                goto Lc0
            Ldb:
                if (r1 == r15) goto Le8
                r0.state = r3
                return r2
            Le0:
                if (r1 < 0) goto Le3
                goto Lc3
            Le3:
                if (r1 == r15) goto Le8
                r0.state = r3
                return r2
            Le8:
                r1 = r14
                goto L16
            Leb:
                if (r20 != 0) goto Lf4
                r0.state = r5
                r0.value = r8
                r0.op = r9
                return r13
            Lf4:
                if (r5 == r13) goto L11c
                if (r5 == r12) goto L10f
                if (r5 == r10) goto L100
                if (r5 == r11) goto Lfd
                goto L117
            Lfd:
                r0.state = r3
                return r2
            L100:
                int r1 = r9 + 1
                int r2 = r8 >> 10
                byte r2 = (byte) r2
                r6[r9] = r2
                int r9 = r9 + 2
                int r2 = r8 >> 2
                byte r2 = (byte) r2
                r6[r1] = r2
                goto L117
            L10f:
                int r1 = r9 + 1
                int r2 = r8 >> 4
                byte r2 = (byte) r2
                r6[r9] = r2
                r9 = r1
            L117:
                r0.state = r5
                r0.op = r9
                return r13
            L11c:
                r0.state = r3
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class Encoder extends com.baidu.idl.face.platform.utils.Base64Utils.Coder {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private static final byte[] ENCODE = null;
        private static final byte[] ENCODE_WEBSAFE = null;
        public static final int LINE_GROUPS = 19;
        private final byte[] alphabet;
        private int count;
        public final boolean do_cr;
        public final boolean do_newline;
        public final boolean do_padding;
        private final byte[] tail;
        int tailLen;

        static {
                r0 = 64
                byte[] r0 = new byte[r0]
                r0 = {x0014: FILL_ARRAY_DATA , data: [65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47} // fill-array
                com.baidu.idl.face.platform.utils.Base64Utils.Encoder.ENCODE = r0
                r0 = 64
                byte[] r0 = new byte[r0]
                r0 = {x0038: FILL_ARRAY_DATA , data: [65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95} // fill-array
                com.baidu.idl.face.platform.utils.Base64Utils.Encoder.ENCODE_WEBSAFE = r0
                return
        }

        public Encoder(int r4, byte[] r5) {
                r3 = this;
                r3.<init>()
                r3.output = r5
                r5 = r4 & 1
                r0 = 0
                r1 = 1
                if (r5 != 0) goto Ld
                r5 = 1
                goto Le
            Ld:
                r5 = 0
            Le:
                r3.do_padding = r5
                r5 = r4 & 2
                if (r5 != 0) goto L16
                r5 = 1
                goto L17
            L16:
                r5 = 0
            L17:
                r3.do_newline = r5
                r2 = r4 & 4
                if (r2 == 0) goto L1e
                goto L1f
            L1e:
                r1 = 0
            L1f:
                r3.do_cr = r1
                r4 = r4 & 8
                if (r4 != 0) goto L28
                byte[] r4 = com.baidu.idl.face.platform.utils.Base64Utils.Encoder.ENCODE
                goto L2a
            L28:
                byte[] r4 = com.baidu.idl.face.platform.utils.Base64Utils.Encoder.ENCODE_WEBSAFE
            L2a:
                r3.alphabet = r4
                r4 = 2
                byte[] r4 = new byte[r4]
                r3.tail = r4
                r3.tailLen = r0
                if (r5 == 0) goto L38
                r4 = 19
                goto L39
            L38:
                r4 = -1
            L39:
                r3.count = r4
                return
        }

        @Override // com.baidu.idl.face.platform.utils.Base64Utils.Coder
        public int maxOutputSize(int r1) {
                r0 = this;
                int r1 = r1 * 8
                int r1 = r1 / 5
                int r1 = r1 + 10
                return r1
        }

        @Override // com.baidu.idl.face.platform.utils.Base64Utils.Coder
        public boolean process(byte[] r18, int r19, int r20, boolean r21) {
                r17 = this;
                r0 = r17
                byte[] r1 = r0.alphabet
                byte[] r2 = r0.output
                int r3 = r0.count
                int r4 = r20 + r19
                int r5 = r0.tailLen
                r6 = 2
                r7 = 0
                r8 = -1
                r9 = 1
                if (r5 == r9) goto L31
                if (r5 == r6) goto L15
                goto L50
            L15:
                int r5 = r19 + 1
                if (r5 > r4) goto L50
                byte[] r10 = r0.tail
                r11 = r10[r7]
                r11 = r11 & 255(0xff, float:3.57E-43)
                int r11 = r11 << 16
                r10 = r10[r9]
                r10 = r10 & 255(0xff, float:3.57E-43)
                int r10 = r10 << 8
                r10 = r10 | r11
                r11 = r18[r19]
                r11 = r11 & 255(0xff, float:3.57E-43)
                r10 = r10 | r11
                r0.tailLen = r7
                r11 = r5
                goto L53
            L31:
                int r5 = r19 + 2
                if (r5 > r4) goto L50
                byte[] r5 = r0.tail
                r5 = r5[r7]
                r5 = r5 & 255(0xff, float:3.57E-43)
                int r5 = r5 << 16
                int r10 = r19 + 1
                r11 = r18[r19]
                r11 = r11 & 255(0xff, float:3.57E-43)
                int r11 = r11 << 8
                r5 = r5 | r11
                int r11 = r19 + 2
                r10 = r18[r10]
                r10 = r10 & 255(0xff, float:3.57E-43)
                r10 = r10 | r5
                r0.tailLen = r7
                goto L53
            L50:
                r11 = r19
                r10 = -1
            L53:
                r5 = 19
                r12 = 13
                r13 = 4
                r14 = 10
                if (r10 == r8) goto L91
                int r8 = r10 >> 18
                r8 = r8 & 63
                r8 = r1[r8]
                r2[r7] = r8
                int r8 = r10 >> 12
                r8 = r8 & 63
                r8 = r1[r8]
                r2[r9] = r8
                int r8 = r10 >> 6
                r8 = r8 & 63
                r8 = r1[r8]
                r2[r6] = r8
                r8 = r10 & 63
                r8 = r1[r8]
                r10 = 3
                r2[r10] = r8
                int r3 = r3 + (-1)
                if (r3 != 0) goto L8f
                boolean r3 = r0.do_cr
                if (r3 == 0) goto L87
                r2[r13] = r12
                r3 = 5
                goto L88
            L87:
                r3 = 4
            L88:
                int r8 = r3 + 1
                r2[r3] = r14
                r3 = 19
                goto L92
            L8f:
                r8 = 4
                goto L92
            L91:
                r8 = 0
            L92:
                int r10 = r11 + 3
                if (r10 > r4) goto Led
                r15 = r18[r11]
                r15 = r15 & 255(0xff, float:3.57E-43)
                int r15 = r15 << 16
                int r16 = r11 + 1
                r20 = 2
                r6 = r18[r16]
                r6 = r6 & 255(0xff, float:3.57E-43)
                int r6 = r6 << 8
                r6 = r6 | r15
                int r11 = r11 + 2
                r11 = r18[r11]
                r11 = r11 & 255(0xff, float:3.57E-43)
                r6 = r6 | r11
                int r11 = r6 >> 18
                r11 = r11 & 63
                r11 = r1[r11]
                r2[r8] = r11
                int r11 = r8 + 1
                int r15 = r6 >> 12
                r15 = r15 & 63
                r15 = r1[r15]
                r2[r11] = r15
                int r11 = r8 + 2
                int r15 = r6 >> 6
                r15 = r15 & 63
                r15 = r1[r15]
                r2[r11] = r15
                int r11 = r8 + 3
                r6 = r6 & 63
                r6 = r1[r6]
                r2[r11] = r6
                int r6 = r8 + 4
                int r3 = r3 + (-1)
                if (r3 != 0) goto Lea
                boolean r3 = r0.do_cr
                if (r3 == 0) goto Le1
                int r8 = r8 + 5
                r2[r6] = r12
                r6 = r8
            Le1:
                int r8 = r6 + 1
                r2[r6] = r14
                r11 = r10
                r3 = 19
            Le8:
                r6 = 2
                goto L92
            Lea:
                r8 = r6
                r11 = r10
                goto Le8
            Led:
                r20 = 2
                if (r21 == 0) goto L1ba
                int r6 = r0.tailLen
                int r10 = r11 - r6
                int r15 = r4 + (-1)
                r16 = 61
                if (r10 != r15) goto L140
                if (r6 <= 0) goto L103
                byte[] r4 = r0.tail
                r4 = r4[r7]
                r7 = 1
                goto L105
            L103:
                r4 = r18[r11]
            L105:
                r4 = r4 & 255(0xff, float:3.57E-43)
                int r4 = r4 << r13
                int r6 = r6 - r7
                r0.tailLen = r6
                int r5 = r8 + 1
                int r6 = r4 >> 6
                r6 = r6 & 63
                r6 = r1[r6]
                r2[r8] = r6
                int r6 = r8 + 2
                r4 = r4 & 63
                r1 = r1[r4]
                r2[r5] = r1
                boolean r1 = r0.do_padding
                if (r1 == 0) goto L129
                int r1 = r8 + 3
                r2[r6] = r16
                int r6 = r8 + 4
                r2[r1] = r16
            L129:
                boolean r1 = r0.do_newline
                if (r1 == 0) goto L13d
                boolean r1 = r0.do_cr
                if (r1 == 0) goto L136
                int r1 = r6 + 1
                r2[r6] = r12
                r6 = r1
            L136:
                int r1 = r6 + 1
                r2[r6] = r14
            L13a:
                r8 = r1
                goto L1e4
            L13d:
                r8 = r6
                goto L1e4
            L140:
                int r10 = r11 - r6
                int r4 = r4 + (-2)
                if (r10 != r4) goto L1a4
                if (r6 <= r9) goto L14e
                byte[] r4 = r0.tail
                r4 = r4[r7]
                r7 = 1
                goto L154
            L14e:
                int r4 = r11 + 1
                r5 = r18[r11]
                r11 = r4
                r4 = r5
            L154:
                r4 = r4 & 255(0xff, float:3.57E-43)
                int r4 = r4 << r14
                if (r6 <= 0) goto L161
                byte[] r5 = r0.tail
                int r10 = r7 + 1
                r5 = r5[r7]
                r7 = r10
                goto L163
            L161:
                r5 = r18[r11]
            L163:
                r5 = r5 & 255(0xff, float:3.57E-43)
                int r5 = r5 << 2
                r4 = r4 | r5
                int r6 = r6 - r7
                r0.tailLen = r6
                int r5 = r8 + 1
                int r6 = r4 >> 12
                r6 = r6 & 63
                r6 = r1[r6]
                r2[r8] = r6
                int r6 = r8 + 2
                int r7 = r4 >> 6
                r7 = r7 & 63
                r7 = r1[r7]
                r2[r5] = r7
                int r5 = r8 + 3
                r4 = r4 & 63
                r1 = r1[r4]
                r2[r6] = r1
                boolean r1 = r0.do_padding
                if (r1 == 0) goto L190
                int r8 = r8 + 4
                r2[r5] = r16
                r5 = r8
            L190:
                boolean r1 = r0.do_newline
                if (r1 == 0) goto L1a2
                boolean r1 = r0.do_cr
                if (r1 == 0) goto L19d
                int r1 = r5 + 1
                r2[r5] = r12
                r5 = r1
            L19d:
                int r1 = r5 + 1
                r2[r5] = r14
                goto L13a
            L1a2:
                r8 = r5
                goto L1e4
            L1a4:
                boolean r1 = r0.do_newline
                if (r1 == 0) goto L1e4
                if (r8 <= 0) goto L1e4
                if (r3 == r5) goto L1e4
                boolean r1 = r0.do_cr
                if (r1 == 0) goto L1b5
                int r1 = r8 + 1
                r2[r8] = r12
                r8 = r1
            L1b5:
                int r1 = r8 + 1
                r2[r8] = r14
                goto L13a
            L1ba:
                int r1 = r4 + (-1)
                if (r11 != r1) goto L1cb
                byte[] r1 = r0.tail
                int r2 = r0.tailLen
                int r4 = r2 + 1
                r0.tailLen = r4
                r4 = r18[r11]
                r1[r2] = r4
                goto L1e4
            L1cb:
                int r4 = r4 + (-2)
                if (r11 != r4) goto L1e4
                byte[] r1 = r0.tail
                int r2 = r0.tailLen
                int r4 = r2 + 1
                r0.tailLen = r4
                r5 = r18[r11]
                r1[r2] = r5
                int r2 = r2 + 2
                r0.tailLen = r2
                int r11 = r11 + r9
                r2 = r18[r11]
                r1[r4] = r2
            L1e4:
                r0.op = r8
                r0.count = r3
                return r9
        }
    }

    static {
            return
    }

    private Base64Utils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static byte[] decode(java.lang.String r0, int r1) throws java.lang.IllegalArgumentException {
            byte[] r0 = r0.getBytes()
            byte[] r0 = decode(r0, r1)
            return r0
    }

    public static byte[] decode(byte[] r2, int r3) throws java.lang.IllegalArgumentException {
            r0 = 0
            int r1 = r2.length
            byte[] r2 = decode(r2, r0, r1, r3)
            return r2
    }

    public static byte[] decode(byte[] r2, int r3, int r4, int r5) throws java.lang.IllegalArgumentException {
            com.baidu.idl.face.platform.utils.Base64Utils$Decoder r0 = new com.baidu.idl.face.platform.utils.Base64Utils$Decoder
            int r1 = r4 * 3
            int r1 = r1 / 4
            byte[] r1 = new byte[r1]
            r0.<init>(r5, r1)
            r5 = 1
            boolean r2 = r0.process(r2, r3, r4, r5)
            if (r2 == 0) goto L21
            int r2 = r0.op
            byte[] r3 = r0.output
            int r4 = r3.length
            if (r2 != r4) goto L1a
            return r3
        L1a:
            byte[] r4 = new byte[r2]
            r5 = 0
            java.lang.System.arraycopy(r3, r5, r4, r5, r2)
            return r4
        L21:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "bad base-64"
            r2.<init>(r3)
            throw r2
    }

    public static byte[] encode(byte[] r2, int r3) {
            r0 = 0
            int r1 = r2.length
            byte[] r2 = encode(r2, r0, r1, r3)
            return r2
    }

    public static byte[] encode(byte[] r5, int r6, int r7, int r8) {
            com.baidu.idl.face.platform.utils.Base64Utils$Encoder r0 = new com.baidu.idl.face.platform.utils.Base64Utils$Encoder
            r1 = 0
            r0.<init>(r8, r1)
            int r8 = r7 / 3
            int r8 = r8 * 4
            boolean r1 = r0.do_padding
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L17
            int r1 = r7 % 3
            if (r1 <= 0) goto L23
            int r8 = r8 + 4
            goto L23
        L17:
            int r1 = r7 % 3
            if (r1 == r3) goto L21
            if (r1 == r2) goto L1e
            goto L23
        L1e:
            int r8 = r8 + 3
            goto L23
        L21:
            int r8 = r8 + 2
        L23:
            boolean r1 = r0.do_newline
            if (r1 == 0) goto L37
            if (r7 <= 0) goto L37
            int r1 = r7 + (-1)
            int r1 = r1 / 57
            int r1 = r1 + r3
            boolean r4 = r0.do_cr
            if (r4 == 0) goto L33
            goto L34
        L33:
            r2 = 1
        L34:
            int r1 = r1 * r2
            int r8 = r8 + r1
        L37:
            byte[] r8 = new byte[r8]
            r0.output = r8
            r0.process(r5, r6, r7, r3)
            byte[] r5 = r0.output
            return r5
    }

    public static java.lang.String encodeToString(byte[] r1, int r2) {
            java.lang.String r0 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> Lc
            byte[] r1 = encode(r1, r2)     // Catch: java.io.UnsupportedEncodingException -> Lc
            java.lang.String r2 = "US-ASCII"
            r0.<init>(r1, r2)     // Catch: java.io.UnsupportedEncodingException -> Lc
            return r0
        Lc:
            r1 = move-exception
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>(r1)
            throw r2
    }

    public static java.lang.String encodeToString(byte[] r1, int r2, int r3, int r4) {
            java.lang.String r0 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> Lc
            byte[] r1 = encode(r1, r2, r3, r4)     // Catch: java.io.UnsupportedEncodingException -> Lc
            java.lang.String r2 = "US-ASCII"
            r0.<init>(r1, r2)     // Catch: java.io.UnsupportedEncodingException -> Lc
            return r0
        Lc:
            r1 = move-exception
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>(r1)
            throw r2
    }
}
