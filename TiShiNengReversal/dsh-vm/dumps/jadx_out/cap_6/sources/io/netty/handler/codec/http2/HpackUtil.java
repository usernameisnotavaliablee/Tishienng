package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class HpackUtil {
    static final int[] HUFFMAN_CODES = null;
    static final byte[] HUFFMAN_CODE_LENGTHS = null;
    static final int HUFFMAN_EOS = 256;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    enum IndexType extends java.lang.Enum<io.netty.handler.codec.http2.HpackUtil.IndexType> {
        private static final /* synthetic */ io.netty.handler.codec.http2.HpackUtil.IndexType[] $VALUES = null;
        public static final io.netty.handler.codec.http2.HpackUtil.IndexType INCREMENTAL = null;
        public static final io.netty.handler.codec.http2.HpackUtil.IndexType NEVER = null;
        public static final io.netty.handler.codec.http2.HpackUtil.IndexType NONE = null;

        static {
                io.netty.handler.codec.http2.HpackUtil$IndexType r0 = new io.netty.handler.codec.http2.HpackUtil$IndexType
                java.lang.String r1 = "INCREMENTAL"
                r2 = 0
                r0.<init>(r1, r2)
                io.netty.handler.codec.http2.HpackUtil.IndexType.INCREMENTAL = r0
                io.netty.handler.codec.http2.HpackUtil$IndexType r1 = new io.netty.handler.codec.http2.HpackUtil$IndexType
                java.lang.String r3 = "NONE"
                r4 = 1
                r1.<init>(r3, r4)
                io.netty.handler.codec.http2.HpackUtil.IndexType.NONE = r1
                io.netty.handler.codec.http2.HpackUtil$IndexType r3 = new io.netty.handler.codec.http2.HpackUtil$IndexType
                java.lang.String r5 = "NEVER"
                r6 = 2
                r3.<init>(r5, r6)
                io.netty.handler.codec.http2.HpackUtil.IndexType.NEVER = r3
                r5 = 3
                io.netty.handler.codec.http2.HpackUtil$IndexType[] r5 = new io.netty.handler.codec.http2.HpackUtil.IndexType[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                io.netty.handler.codec.http2.HpackUtil.IndexType.$VALUES = r5
                return
        }

        IndexType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.netty.handler.codec.http2.HpackUtil.IndexType valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.codec.http2.HpackUtil$IndexType> r0 = io.netty.handler.codec.http2.HpackUtil.IndexType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.codec.http2.HpackUtil$IndexType r1 = (io.netty.handler.codec.http2.HpackUtil.IndexType) r1
                return r1
        }

        public static io.netty.handler.codec.http2.HpackUtil.IndexType[] values() {
                io.netty.handler.codec.http2.HpackUtil$IndexType[] r0 = io.netty.handler.codec.http2.HpackUtil.IndexType.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.codec.http2.HpackUtil$IndexType[] r0 = (io.netty.handler.codec.http2.HpackUtil.IndexType[]) r0
                return r0
        }
    }

    static {
            r0 = 257(0x101, float:3.6E-43)
            int[] r1 = new int[r0]
            r1 = {x0012: FILL_ARRAY_DATA , data: [8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, 1016, 1017, 4090, 8185, 21, 248, 2042, 1018, 1019, 249, 2043, 250, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, 1020, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, 122, 123, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846, 1073741823} // fill-array
            io.netty.handler.codec.http2.HpackUtil.HUFFMAN_CODES = r1
            byte[] r0 = new byte[r0]
            r0 = {x0218: FILL_ARRAY_DATA , data: [13, 23, 28, 28, 28, 28, 28, 28, 28, 24, 30, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, 12, 13, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, 15, 6, 12, 10, 13, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, 13, 19, 13, 14, 6, 15, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, 15, 11, 14, 13, 28, 20, 22, 20, 20, 22, 22, 22, 23, 22, 23, 23, 23, 23, 23, 24, 23, 24, 24, 22, 23, 24, 23, 23, 23, 23, 21, 22, 23, 22, 23, 23, 24, 22, 21, 20, 22, 22, 23, 23, 21, 23, 22, 22, 24, 21, 22, 23, 23, 21, 21, 22, 21, 23, 22, 23, 23, 20, 22, 22, 22, 23, 22, 22, 23, 26, 26, 20, 19, 22, 23, 22, 25, 26, 26, 26, 27, 27, 26, 24, 25, 19, 21, 26, 27, 27, 26, 27, 24, 21, 21, 26, 26, 28, 27, 27, 27, 20, 24, 20, 21, 22, 21, 21, 23, 22, 22, 25, 25, 24, 24, 26, 23, 26, 27, 26, 26, 27, 27, 27, 27, 27, 28, 27, 27, 27, 27, 27, 26, 30} // fill-array
            io.netty.handler.codec.http2.HpackUtil.HUFFMAN_CODE_LENGTHS = r0
            return
    }

    private HpackUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    static int equalsConstantTime(java.lang.CharSequence r3, java.lang.CharSequence r4) {
            boolean r0 = r3 instanceof io.netty.util.AsciiString
            if (r0 == 0) goto L32
            boolean r0 = r4 instanceof io.netty.util.AsciiString
            if (r0 == 0) goto L32
            int r0 = r3.length()
            int r1 = r4.length()
            if (r0 == r1) goto L14
            r3 = 0
            return r3
        L14:
            r0 = r3
            io.netty.util.AsciiString r0 = (io.netty.util.AsciiString) r0
            io.netty.util.AsciiString r4 = (io.netty.util.AsciiString) r4
            byte[] r1 = r0.array()
            int r0 = r0.arrayOffset()
            byte[] r2 = r4.array()
            int r4 = r4.arrayOffset()
            int r3 = r3.length()
            int r3 = io.netty.util.internal.PlatformDependent.equalsConstantTime(r1, r0, r2, r4, r3)
            return r3
        L32:
            int r3 = io.netty.util.internal.ConstantTimeUtils.equalsConstantTime(r3, r4)
            return r3
    }
}
