package com.alibaba.fastjson.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class UTF8Decoder extends java.nio.charset.CharsetDecoder {
    private static final java.nio.charset.Charset charset = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class Surrogate {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        public static final int UCS4_MAX = 1114111;
        public static final int UCS4_MIN = 65536;

        static {
                return
        }

        private Surrogate() {
                r0 = this;
                r0.<init>()
                return
        }

        public static char high(int r1) {
                r0 = 65536(0x10000, float:9.1835E-41)
                int r1 = r1 - r0
                int r1 = r1 >> 10
                r1 = r1 & 1023(0x3ff, float:1.434E-42)
                r0 = 55296(0xd800, float:7.7486E-41)
                r1 = r1 | r0
                char r1 = (char) r1
                return r1
        }

        public static char low(int r1) {
                r0 = 65536(0x10000, float:9.1835E-41)
                int r1 = r1 - r0
                r1 = r1 & 1023(0x3ff, float:1.434E-42)
                r0 = 56320(0xdc00, float:7.8921E-41)
                r1 = r1 | r0
                char r1 = (char) r1
                return r1
        }

        public static boolean neededFor(int r1) {
                r0 = 65536(0x10000, float:9.1835E-41)
                if (r1 < r0) goto Lb
                r0 = 1114111(0x10ffff, float:1.561202E-39)
                if (r1 > r0) goto Lb
                r1 = 1
                return r1
            Lb:
                r1 = 0
                return r1
        }
    }

    static {
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.alibaba.fastjson.util.UTF8Decoder.charset = r0
            return
    }

    public UTF8Decoder() {
            r2 = this;
            java.nio.charset.Charset r0 = com.alibaba.fastjson.util.UTF8Decoder.charset
            r1 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r0, r1, r1)
            return
    }

    private java.nio.charset.CoderResult decodeArrayLoop(java.nio.ByteBuffer r13, java.nio.CharBuffer r14) {
            r12 = this;
            byte[] r0 = r13.array()
            int r1 = r13.arrayOffset()
            int r2 = r13.position()
            int r1 = r1 + r2
            int r2 = r13.arrayOffset()
            int r3 = r13.limit()
            int r6 = r2 + r3
            char[] r2 = r14.array()
            int r3 = r14.arrayOffset()
            int r4 = r14.position()
            int r3 = r3 + r4
            int r4 = r14.arrayOffset()
            int r5 = r14.limit()
            int r4 = r4 + r5
            int r5 = r6 - r1
            int r7 = r4 - r3
            int r5 = java.lang.Math.min(r5, r7)
            int r5 = r5 + r3
        L36:
            if (r3 >= r5) goto L45
            r7 = r0[r1]
            if (r7 < 0) goto L45
            int r8 = r3 + 1
            int r1 = r1 + 1
            char r7 = (char) r7
            r2[r3] = r7
            r3 = r8
            goto L36
        L45:
            r5 = r1
            r8 = r3
        L47:
            if (r5 >= r6) goto L130
            r1 = r0[r5]
            if (r1 < 0) goto L65
            if (r8 < r4) goto L57
            r9 = 1
            r4 = r13
            r7 = r14
            java.nio.charset.CoderResult r13 = xflow(r4, r5, r6, r7, r8, r9)
            return r13
        L57:
            r7 = r4
            r4 = r13
            r13 = r7
            r7 = r14
            int r14 = r8 + 1
            char r1 = (char) r1
            r2[r8] = r1
            int r5 = r5 + 1
            r8 = r14
            goto L119
        L65:
            r7 = r4
            r4 = r13
            r13 = r7
            r7 = r14
            int r14 = r1 >> 5
            r3 = -2
            r9 = 2
            if (r14 != r3) goto L9a
            int r14 = r6 - r5
            if (r14 < r9) goto L94
            if (r8 < r13) goto L76
            goto L94
        L76:
            int r14 = r5 + 1
            r14 = r0[r14]
            boolean r3 = isMalformed2(r1, r14)
            if (r3 == 0) goto L85
            java.nio.charset.CoderResult r13 = malformed(r4, r5, r7, r8, r9)
            return r13
        L85:
            int r3 = r8 + 1
            int r1 = r1 << 6
            r14 = r14 ^ r1
            r14 = r14 ^ 3968(0xf80, float:5.56E-42)
            char r14 = (char) r14
            r2[r8] = r14
            int r5 = r5 + 2
        L91:
            r8 = r3
            goto L119
        L94:
            r9 = 2
            java.nio.charset.CoderResult r13 = xflow(r4, r5, r6, r7, r8, r9)
            return r13
        L9a:
            int r14 = r1 >> 4
            if (r14 != r3) goto Lcf
            int r14 = r6 - r5
            r3 = 3
            if (r14 < r3) goto Lc9
            if (r8 < r13) goto La6
            goto Lc9
        La6:
            int r14 = r5 + 1
            r14 = r0[r14]
            int r9 = r5 + 2
            r9 = r0[r9]
            boolean r10 = isMalformed3(r1, r14, r9)
            if (r10 == 0) goto Lb9
            java.nio.charset.CoderResult r13 = malformed(r4, r5, r7, r8, r3)
            return r13
        Lb9:
            int r3 = r8 + 1
            int r1 = r1 << 12
            int r14 = r14 << 6
            r14 = r14 ^ r1
            r14 = r14 ^ r9
            r14 = r14 ^ 8064(0x1f80, float:1.13E-41)
            char r14 = (char) r14
            r2[r8] = r14
            int r5 = r5 + 3
            goto L91
        Lc9:
            r9 = 3
            java.nio.charset.CoderResult r13 = xflow(r4, r5, r6, r7, r8, r9)
            return r13
        Lcf:
            int r14 = r1 >> 3
            if (r14 != r3) goto L12a
            int r14 = r6 - r5
            r3 = 4
            if (r14 < r3) goto L124
            int r14 = r13 - r8
            if (r14 >= r9) goto Ldd
            goto L124
        Ldd:
            int r14 = r5 + 1
            r14 = r0[r14]
            int r9 = r5 + 2
            r9 = r0[r9]
            int r10 = r5 + 3
            r10 = r0[r10]
            r1 = r1 & 7
            int r1 = r1 << 18
            r11 = r14 & 63
            int r11 = r11 << 12
            r1 = r1 | r11
            r11 = r9 & 63
            int r11 = r11 << 6
            r1 = r1 | r11
            r11 = r10 & 63
            r1 = r1 | r11
            boolean r14 = isMalformed4(r14, r9, r10)
            if (r14 != 0) goto L11f
            boolean r14 = com.alibaba.fastjson.util.UTF8Decoder.Surrogate.neededFor(r1)
            if (r14 != 0) goto L107
            goto L11f
        L107:
            int r14 = r8 + 1
            char r3 = com.alibaba.fastjson.util.UTF8Decoder.Surrogate.high(r1)
            r2[r8] = r3
            int r8 = r8 + 2
            char r1 = com.alibaba.fastjson.util.UTF8Decoder.Surrogate.low(r1)
            r2[r14] = r1
            int r5 = r5 + 4
        L119:
            r14 = r4
            r4 = r13
            r13 = r14
            r14 = r7
            goto L47
        L11f:
            java.nio.charset.CoderResult r13 = malformed(r4, r5, r7, r8, r3)
            return r13
        L124:
            r9 = 4
            java.nio.charset.CoderResult r13 = xflow(r4, r5, r6, r7, r8, r9)
            return r13
        L12a:
            r13 = 1
            java.nio.charset.CoderResult r13 = malformed(r4, r5, r7, r8, r13)
            return r13
        L130:
            r4 = r13
            r7 = r14
            r9 = 0
            java.nio.charset.CoderResult r13 = xflow(r4, r5, r6, r7, r8, r9)
            return r13
    }

    private static boolean isMalformed2(int r0, int r1) {
            r0 = r0 & 30
            if (r0 == 0) goto Ld
            r0 = r1 & 192(0xc0, float:2.69E-43)
            r1 = 128(0x80, float:1.8E-43)
            if (r0 == r1) goto Lb
            goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            r0 = 1
            return r0
    }

    private static boolean isMalformed3(int r2, int r3, int r4) {
            r0 = -32
            r1 = 128(0x80, float:1.8E-43)
            if (r2 != r0) goto La
            r2 = r3 & 224(0xe0, float:3.14E-43)
            if (r2 == r1) goto L15
        La:
            r2 = r3 & 192(0xc0, float:2.69E-43)
            if (r2 != r1) goto L15
            r2 = r4 & 192(0xc0, float:2.69E-43)
            if (r2 == r1) goto L13
            goto L15
        L13:
            r2 = 0
            return r2
        L15:
            r2 = 1
            return r2
    }

    private static boolean isMalformed4(int r1, int r2, int r3) {
            r1 = r1 & 192(0xc0, float:2.69E-43)
            r0 = 128(0x80, float:1.8E-43)
            if (r1 != r0) goto L11
            r1 = r2 & 192(0xc0, float:2.69E-43)
            if (r1 != r0) goto L11
            r1 = r3 & 192(0xc0, float:2.69E-43)
            if (r1 == r0) goto Lf
            goto L11
        Lf:
            r1 = 0
            return r1
        L11:
            r1 = 1
            return r1
    }

    private static boolean isNotContinuation(int r1) {
            r1 = r1 & 192(0xc0, float:2.69E-43)
            r0 = 128(0x80, float:1.8E-43)
            if (r1 == r0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    private static java.nio.charset.CoderResult lookupN(java.nio.ByteBuffer r2, int r3) {
            r0 = 1
        L1:
            if (r0 >= r3) goto L15
            byte r1 = r2.get()
            boolean r1 = isNotContinuation(r1)
            if (r1 == 0) goto L12
            java.nio.charset.CoderResult r2 = java.nio.charset.CoderResult.malformedForLength(r0)
            return r2
        L12:
            int r0 = r0 + 1
            goto L1
        L15:
            java.nio.charset.CoderResult r2 = java.nio.charset.CoderResult.malformedForLength(r3)
            return r2
    }

    private static java.nio.charset.CoderResult malformed(java.nio.ByteBuffer r1, int r2, java.nio.CharBuffer r3, int r4, int r5) {
            int r0 = r1.arrayOffset()
            int r0 = r2 - r0
            r1.position(r0)
            java.nio.charset.CoderResult r5 = malformedN(r1, r5)
            updatePositions(r1, r2, r3, r4)
            return r5
    }

    public static java.nio.charset.CoderResult malformedN(java.nio.ByteBuffer r9, int r10) {
            r0 = 4
            r1 = 1
            if (r10 == r1) goto L78
            r2 = 2
            if (r10 == r2) goto L73
            r3 = 128(0x80, float:1.8E-43)
            r4 = 3
            if (r10 == r4) goto L56
            if (r10 != r0) goto L50
            byte r10 = r9.get()
            r10 = r10 & 255(0xff, float:3.57E-43)
            byte r0 = r9.get()
            r5 = r0 & 255(0xff, float:3.57E-43)
            r6 = 244(0xf4, float:3.42E-43)
            if (r10 > r6) goto L4b
            r7 = 240(0xf0, float:3.36E-43)
            if (r10 != r7) goto L2a
            r8 = 144(0x90, float:2.02E-43)
            if (r5 < r8) goto L4b
            r8 = 191(0xbf, float:2.68E-43)
            if (r5 > r8) goto L4b
        L2a:
            if (r10 != r6) goto L30
            r10 = r0 & 240(0xf0, float:3.36E-43)
            if (r10 != r3) goto L4b
        L30:
            boolean r10 = isNotContinuation(r5)
            if (r10 == 0) goto L37
            goto L4b
        L37:
            byte r9 = r9.get()
            boolean r9 = isNotContinuation(r9)
            if (r9 == 0) goto L46
            java.nio.charset.CoderResult r9 = java.nio.charset.CoderResult.malformedForLength(r2)
            return r9
        L46:
            java.nio.charset.CoderResult r9 = java.nio.charset.CoderResult.malformedForLength(r4)
            return r9
        L4b:
            java.nio.charset.CoderResult r9 = java.nio.charset.CoderResult.malformedForLength(r1)
            return r9
        L50:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>()
            throw r9
        L56:
            byte r10 = r9.get()
            byte r9 = r9.get()
            r0 = -32
            if (r10 != r0) goto L66
            r10 = r9 & 224(0xe0, float:3.14E-43)
            if (r10 == r3) goto L6e
        L66:
            boolean r9 = isNotContinuation(r9)
            if (r9 == 0) goto L6d
            goto L6e
        L6d:
            r1 = 2
        L6e:
            java.nio.charset.CoderResult r9 = java.nio.charset.CoderResult.malformedForLength(r1)
            return r9
        L73:
            java.nio.charset.CoderResult r9 = java.nio.charset.CoderResult.malformedForLength(r1)
            return r9
        L78:
            byte r10 = r9.get()
            int r2 = r10 >> 2
            r3 = 5
            r4 = -2
            if (r2 != r4) goto L90
            int r10 = r9.remaining()
            if (r10 >= r0) goto L8b
            java.nio.charset.CoderResult r9 = java.nio.charset.CoderResult.UNDERFLOW
            return r9
        L8b:
            java.nio.charset.CoderResult r9 = lookupN(r9, r3)
            return r9
        L90:
            int r10 = r10 >> r1
            if (r10 != r4) goto La2
            int r10 = r9.remaining()
            if (r10 >= r3) goto L9c
            java.nio.charset.CoderResult r9 = java.nio.charset.CoderResult.UNDERFLOW
            return r9
        L9c:
            r10 = 6
            java.nio.charset.CoderResult r9 = lookupN(r9, r10)
            return r9
        La2:
            java.nio.charset.CoderResult r9 = java.nio.charset.CoderResult.malformedForLength(r1)
            return r9
    }

    static void updatePositions(java.nio.Buffer r0, int r1, java.nio.Buffer r2, int r3) {
            r0.position(r1)
            r2.position(r3)
            return
    }

    private static java.nio.charset.CoderResult xflow(java.nio.Buffer r0, int r1, int r2, java.nio.Buffer r3, int r4, int r5) {
            updatePositions(r0, r1, r3, r4)
            if (r5 == 0) goto Lc
            int r2 = r2 - r1
            if (r2 >= r5) goto L9
            goto Lc
        L9:
            java.nio.charset.CoderResult r0 = java.nio.charset.CoderResult.OVERFLOW
            return r0
        Lc:
            java.nio.charset.CoderResult r0 = java.nio.charset.CoderResult.UNDERFLOW
            return r0
    }

    @Override // java.nio.charset.CharsetDecoder
    protected java.nio.charset.CoderResult decodeLoop(java.nio.ByteBuffer r1, java.nio.CharBuffer r2) {
            r0 = this;
            java.nio.charset.CoderResult r1 = r0.decodeArrayLoop(r1, r2)
            return r1
    }
}
