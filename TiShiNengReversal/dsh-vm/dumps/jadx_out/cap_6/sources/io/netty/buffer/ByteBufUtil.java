package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class ByteBufUtil {
    private static final io.netty.util.concurrent.FastThreadLocal<byte[]> BYTE_ARRAYS = null;
    static final io.netty.buffer.ByteBufAllocator DEFAULT_ALLOCATOR = null;
    private static final io.netty.util.ByteProcessor FIND_NON_ASCII = null;
    private static final int MAX_BYTES_PER_CHAR_UTF8 = 0;
    private static final int MAX_CHAR_BUFFER_SIZE = 0;
    static final int MAX_TL_ARRAY_LEN = 1024;
    private static final int THREAD_LOCAL_BUFFER_SIZE = 0;
    static final int WRITE_CHUNK_SIZE = 8192;
    private static final byte WRITE_UTF_UNKNOWN = 63;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class HexUtil {
        private static final char[] BYTE2CHAR = null;
        private static final java.lang.String[] BYTE2HEX = null;
        private static final java.lang.String[] BYTEPADDING = null;
        private static final java.lang.String[] HEXDUMP_ROWPREFIXES = null;
        private static final char[] HEXDUMP_TABLE = null;
        private static final java.lang.String[] HEXPADDING = null;

        static {
                r0 = 256(0x100, float:3.59E-43)
                char[] r1 = new char[r0]
                io.netty.buffer.ByteBufUtil.HexUtil.BYTE2CHAR = r1
                r1 = 1024(0x400, float:1.435E-42)
                char[] r1 = new char[r1]
                io.netty.buffer.ByteBufUtil.HexUtil.HEXDUMP_TABLE = r1
                r1 = 16
                java.lang.String[] r2 = new java.lang.String[r1]
                io.netty.buffer.ByteBufUtil.HexUtil.HEXPADDING = r2
                r2 = 4096(0x1000, float:5.74E-42)
                java.lang.String[] r2 = new java.lang.String[r2]
                io.netty.buffer.ByteBufUtil.HexUtil.HEXDUMP_ROWPREFIXES = r2
                java.lang.String[] r2 = new java.lang.String[r0]
                io.netty.buffer.ByteBufUtil.HexUtil.BYTE2HEX = r2
                java.lang.String[] r1 = new java.lang.String[r1]
                io.netty.buffer.ByteBufUtil.HexUtil.BYTEPADDING = r1
                java.lang.String r1 = "0123456789abcdef"
                char[] r1 = r1.toCharArray()
                r2 = 0
                r3 = 0
            L28:
                if (r3 >= r0) goto L41
                char[] r4 = io.netty.buffer.ByteBufUtil.HexUtil.HEXDUMP_TABLE
                int r5 = r3 << 1
                int r6 = r3 >>> 4
                r6 = r6 & 15
                char r6 = r1[r6]
                r4[r5] = r6
                int r5 = r5 + 1
                r6 = r3 & 15
                char r6 = r1[r6]
                r4[r5] = r6
                int r3 = r3 + 1
                goto L28
            L41:
                r0 = 0
            L42:
                java.lang.String[] r1 = io.netty.buffer.ByteBufUtil.HexUtil.HEXPADDING
                int r3 = r1.length
                if (r0 >= r3) goto L66
                int r1 = r1.length
                int r1 = r1 - r0
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                int r4 = r1 * 3
                r3.<init>(r4)
                r4 = 0
            L51:
                if (r4 >= r1) goto L5b
                java.lang.String r5 = "   "
                r3.append(r5)
                int r4 = r4 + 1
                goto L51
            L5b:
                java.lang.String[] r1 = io.netty.buffer.ByteBufUtil.HexUtil.HEXPADDING
                java.lang.String r3 = r3.toString()
                r1[r0] = r3
                int r0 = r0 + 1
                goto L42
            L66:
                r0 = 0
            L67:
                java.lang.String[] r1 = io.netty.buffer.ByteBufUtil.HexUtil.HEXDUMP_ROWPREFIXES
                int r3 = r1.length
                if (r0 >= r3) goto La5
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r4 = 12
                r3.<init>(r4)
                java.lang.String r4 = io.netty.util.internal.StringUtil.NEWLINE
                r3.append(r4)
                int r4 = r0 << 4
                long r4 = (long) r4
                r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
                long r4 = r4 & r6
                r6 = 4294967296(0x100000000, double:2.121995791E-314)
                long r4 = r4 | r6
                java.lang.String r4 = java.lang.Long.toHexString(r4)
                r3.append(r4)
                int r4 = r3.length()
                int r4 = r4 + (-9)
                r5 = 124(0x7c, float:1.74E-43)
                r3.setCharAt(r4, r5)
                r3.append(r5)
                java.lang.String r3 = r3.toString()
                r1[r0] = r3
                int r0 = r0 + 1
                goto L67
            La5:
                r0 = 0
            La6:
                java.lang.String[] r1 = io.netty.buffer.ByteBufUtil.HexUtil.BYTE2HEX
                int r3 = r1.length
                r4 = 32
                if (r0 >= r3) goto Lc5
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r4)
                java.lang.String r4 = io.netty.util.internal.StringUtil.byteToHexStringPadded(r0)
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                r1[r0] = r3
                int r0 = r0 + 1
                goto La6
            Lc5:
                r0 = 0
            Lc6:
                java.lang.String[] r1 = io.netty.buffer.ByteBufUtil.HexUtil.BYTEPADDING
                int r3 = r1.length
                if (r0 >= r3) goto Le6
                int r1 = r1.length
                int r1 = r1 - r0
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>(r1)
                r5 = 0
            Ld3:
                if (r5 >= r1) goto Ldb
                r3.append(r4)
                int r5 = r5 + 1
                goto Ld3
            Ldb:
                java.lang.String[] r1 = io.netty.buffer.ByteBufUtil.HexUtil.BYTEPADDING
                java.lang.String r3 = r3.toString()
                r1[r0] = r3
                int r0 = r0 + 1
                goto Lc6
            Le6:
                char[] r0 = io.netty.buffer.ByteBufUtil.HexUtil.BYTE2CHAR
                int r1 = r0.length
                if (r2 >= r1) goto Lff
                r1 = 31
                if (r2 <= r1) goto Lf8
                r1 = 127(0x7f, float:1.78E-43)
                if (r2 < r1) goto Lf4
                goto Lf8
            Lf4:
                char r1 = (char) r2
                r0[r2] = r1
                goto Lfc
            Lf8:
                r1 = 46
                r0[r2] = r1
            Lfc:
                int r2 = r2 + 1
                goto Le6
            Lff:
                return
        }

        private HexUtil() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ java.lang.String access$000(io.netty.buffer.ByteBuf r0, int r1, int r2) {
                java.lang.String r0 = hexDump(r0, r1, r2)
                return r0
        }

        static /* synthetic */ java.lang.String access$100(byte[] r0, int r1, int r2) {
                java.lang.String r0 = hexDump(r0, r1, r2)
                return r0
        }

        static /* synthetic */ java.lang.String access$200(io.netty.buffer.ByteBuf r0, int r1, int r2) {
                java.lang.String r0 = prettyHexDump(r0, r1, r2)
                return r0
        }

        static /* synthetic */ void access$300(java.lang.StringBuilder r0, io.netty.buffer.ByteBuf r1, int r2, int r3) {
                appendPrettyHexDump(r0, r1, r2, r3)
                return
        }

        private static void appendHexDumpRowPrefix(java.lang.StringBuilder r2, int r3, int r4) {
                java.lang.String[] r0 = io.netty.buffer.ByteBufUtil.HexUtil.HEXDUMP_ROWPREFIXES
                int r1 = r0.length
                if (r3 >= r1) goto Lb
                r3 = r0[r3]
                r2.append(r3)
                return
            Lb:
                java.lang.String r3 = io.netty.util.internal.StringUtil.NEWLINE
                r2.append(r3)
                long r3 = (long) r4
                r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
                long r3 = r3 & r0
                r0 = 4294967296(0x100000000, double:2.121995791E-314)
                long r3 = r3 | r0
                java.lang.String r3 = java.lang.Long.toHexString(r3)
                r2.append(r3)
                int r3 = r2.length()
                int r3 = r3 + (-9)
                r4 = 124(0x7c, float:1.74E-43)
                r2.setCharAt(r3, r4)
                r2.append(r4)
                return
        }

        private static void appendPrettyHexDump(java.lang.StringBuilder r10, io.netty.buffer.ByteBuf r11, int r12, int r13) {
                int r0 = r11.capacity()
                boolean r0 = io.netty.util.internal.MathUtil.isOutOfBounds(r12, r13, r0)
                if (r0 != 0) goto Lc1
                if (r13 != 0) goto Ld
                return
            Ld:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "         +-------------------------------------------------+"
                r0.append(r1)
                java.lang.String r1 = io.netty.util.internal.StringUtil.NEWLINE
                r0.append(r1)
                java.lang.String r2 = "         |  0  1  2  3  4  5  6  7  8  9  a  b  c  d  e  f |"
                r0.append(r2)
                r0.append(r1)
                java.lang.String r1 = "+--------+-------------------------------------------------+----------------+"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r10.append(r0)
                int r0 = r13 >>> 4
                r13 = r13 & 15
                r2 = 0
            L35:
                r3 = 124(0x7c, float:1.74E-43)
                java.lang.String r4 = " |"
                if (r2 >= r0) goto L6d
                int r5 = r2 << 4
                int r5 = r5 + r12
                appendHexDumpRowPrefix(r10, r2, r5)
                int r6 = r5 + 16
                r7 = r5
            L44:
                if (r7 >= r6) goto L54
                java.lang.String[] r8 = io.netty.buffer.ByteBufUtil.HexUtil.BYTE2HEX
                short r9 = r11.getUnsignedByte(r7)
                r8 = r8[r9]
                r10.append(r8)
                int r7 = r7 + 1
                goto L44
            L54:
                r10.append(r4)
            L57:
                if (r5 >= r6) goto L67
                char[] r4 = io.netty.buffer.ByteBufUtil.HexUtil.BYTE2CHAR
                short r7 = r11.getUnsignedByte(r5)
                char r4 = r4[r7]
                r10.append(r4)
                int r5 = r5 + 1
                goto L57
            L67:
                r10.append(r3)
                int r2 = r2 + 1
                goto L35
            L6d:
                if (r13 == 0) goto Lac
                int r2 = r0 << 4
                int r2 = r2 + r12
                appendHexDumpRowPrefix(r10, r0, r2)
                int r12 = r2 + r13
                r0 = r2
            L78:
                if (r0 >= r12) goto L88
                java.lang.String[] r5 = io.netty.buffer.ByteBufUtil.HexUtil.BYTE2HEX
                short r6 = r11.getUnsignedByte(r0)
                r5 = r5[r6]
                r10.append(r5)
                int r0 = r0 + 1
                goto L78
            L88:
                java.lang.String[] r0 = io.netty.buffer.ByteBufUtil.HexUtil.HEXPADDING
                r0 = r0[r13]
                r10.append(r0)
                r10.append(r4)
            L92:
                if (r2 >= r12) goto La2
                char[] r0 = io.netty.buffer.ByteBufUtil.HexUtil.BYTE2CHAR
                short r4 = r11.getUnsignedByte(r2)
                char r0 = r0[r4]
                r10.append(r0)
                int r2 = r2 + 1
                goto L92
            La2:
                java.lang.String[] r11 = io.netty.buffer.ByteBufUtil.HexUtil.BYTEPADDING
                r11 = r11[r13]
                r10.append(r11)
                r10.append(r3)
            Lac:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = io.netty.util.internal.StringUtil.NEWLINE
                r11.append(r12)
                r11.append(r1)
                java.lang.String r11 = r11.toString()
                r10.append(r11)
                return
            Lc1:
                java.lang.IndexOutOfBoundsException r10 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "expected: 0 <= offset("
                r0.append(r1)
                r0.append(r12)
                java.lang.String r12 = ") <= offset + length("
                r0.append(r12)
                r0.append(r13)
                java.lang.String r12 = ") <= buf.capacity("
                r0.append(r12)
                int r11 = r11.capacity()
                r0.append(r11)
                r11 = 41
                r0.append(r11)
                java.lang.String r11 = r0.toString()
                r10.<init>(r11)
                throw r10
        }

        private static java.lang.String hexDump(io.netty.buffer.ByteBuf r5, int r6, int r7) {
                java.lang.String r0 = "length"
                io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r7, r0)
                if (r7 != 0) goto La
                java.lang.String r5 = ""
                return r5
            La:
                int r0 = r6 + r7
                int r7 = r7 << 1
                char[] r7 = new char[r7]
                r1 = 0
            L11:
                if (r6 >= r0) goto L23
                char[] r2 = io.netty.buffer.ByteBufUtil.HexUtil.HEXDUMP_TABLE
                short r3 = r5.getUnsignedByte(r6)
                int r3 = r3 << 1
                r4 = 2
                java.lang.System.arraycopy(r2, r3, r7, r1, r4)
                int r6 = r6 + 1
                int r1 = r1 + r4
                goto L11
            L23:
                java.lang.String r5 = new java.lang.String
                r5.<init>(r7)
                return r5
        }

        private static java.lang.String hexDump(byte[] r5, int r6, int r7) {
                java.lang.String r0 = "length"
                io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r7, r0)
                if (r7 != 0) goto La
                java.lang.String r5 = ""
                return r5
            La:
                int r0 = r6 + r7
                int r7 = r7 << 1
                char[] r7 = new char[r7]
                r1 = 0
            L11:
                if (r6 >= r0) goto L23
                char[] r2 = io.netty.buffer.ByteBufUtil.HexUtil.HEXDUMP_TABLE
                r3 = r5[r6]
                r3 = r3 & 255(0xff, float:3.57E-43)
                int r3 = r3 << 1
                r4 = 2
                java.lang.System.arraycopy(r2, r3, r7, r1, r4)
                int r6 = r6 + 1
                int r1 = r1 + r4
                goto L11
            L23:
                java.lang.String r5 = new java.lang.String
                r5.<init>(r7)
                return r5
        }

        private static java.lang.String prettyHexDump(io.netty.buffer.ByteBuf r2, int r3, int r4) {
                if (r4 != 0) goto L5
                java.lang.String r2 = ""
                return r2
            L5:
                int r0 = r4 / 16
                r1 = r4 & 15
                if (r1 != 0) goto Ld
                r1 = 0
                goto Le
            Ld:
                r1 = 1
            Le:
                int r0 = r0 + r1
                int r0 = r0 + 4
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                int r0 = r0 * 80
                r1.<init>(r0)
                appendPrettyHexDump(r1, r2, r3, r4)
                java.lang.String r2 = r1.toString()
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class ThreadLocalDirectByteBuf extends io.netty.buffer.UnpooledDirectByteBuf {
        private static final io.netty.util.Recycler<io.netty.buffer.ByteBufUtil.ThreadLocalDirectByteBuf> RECYCLER = null;
        private final io.netty.util.Recycler.Handle<io.netty.buffer.ByteBufUtil.ThreadLocalDirectByteBuf> handle;


        static {
                io.netty.buffer.ByteBufUtil$ThreadLocalDirectByteBuf$1 r0 = new io.netty.buffer.ByteBufUtil$ThreadLocalDirectByteBuf$1
                r0.<init>()
                io.netty.buffer.ByteBufUtil.ThreadLocalDirectByteBuf.RECYCLER = r0
                return
        }

        private ThreadLocalDirectByteBuf(io.netty.util.Recycler.Handle<io.netty.buffer.ByteBufUtil.ThreadLocalDirectByteBuf> r4) {
                r3 = this;
                io.netty.buffer.UnpooledByteBufAllocator r0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT
                r1 = 256(0x100, float:3.59E-43)
                r2 = 2147483647(0x7fffffff, float:NaN)
                r3.<init>(r0, r1, r2)
                r3.handle = r4
                return
        }

        /* synthetic */ ThreadLocalDirectByteBuf(io.netty.util.Recycler.Handle r1, io.netty.buffer.ByteBufUtil.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        static io.netty.buffer.ByteBufUtil.ThreadLocalDirectByteBuf newInstance() {
                io.netty.util.Recycler<io.netty.buffer.ByteBufUtil$ThreadLocalDirectByteBuf> r0 = io.netty.buffer.ByteBufUtil.ThreadLocalDirectByteBuf.RECYCLER
                java.lang.Object r0 = r0.get()
                io.netty.buffer.ByteBufUtil$ThreadLocalDirectByteBuf r0 = (io.netty.buffer.ByteBufUtil.ThreadLocalDirectByteBuf) r0
                r0.resetRefCnt()
                return r0
        }

        @Override // io.netty.buffer.UnpooledDirectByteBuf, io.netty.buffer.AbstractReferenceCountedByteBuf
        protected void deallocate() {
                r2 = this;
                int r0 = r2.capacity()
                int r1 = io.netty.buffer.ByteBufUtil.access$500()
                if (r0 <= r1) goto Le
                super.deallocate()
                return
            Le:
                r2.clear()
                io.netty.util.Recycler$Handle<io.netty.buffer.ByteBufUtil$ThreadLocalDirectByteBuf> r0 = r2.handle
                r0.recycle(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class ThreadLocalUnsafeDirectByteBuf extends io.netty.buffer.UnpooledUnsafeDirectByteBuf {
        private static final io.netty.util.Recycler<io.netty.buffer.ByteBufUtil.ThreadLocalUnsafeDirectByteBuf> RECYCLER = null;
        private final io.netty.util.Recycler.Handle<io.netty.buffer.ByteBufUtil.ThreadLocalUnsafeDirectByteBuf> handle;


        static {
                io.netty.buffer.ByteBufUtil$ThreadLocalUnsafeDirectByteBuf$1 r0 = new io.netty.buffer.ByteBufUtil$ThreadLocalUnsafeDirectByteBuf$1
                r0.<init>()
                io.netty.buffer.ByteBufUtil.ThreadLocalUnsafeDirectByteBuf.RECYCLER = r0
                return
        }

        private ThreadLocalUnsafeDirectByteBuf(io.netty.util.Recycler.Handle<io.netty.buffer.ByteBufUtil.ThreadLocalUnsafeDirectByteBuf> r4) {
                r3 = this;
                io.netty.buffer.UnpooledByteBufAllocator r0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT
                r1 = 256(0x100, float:3.59E-43)
                r2 = 2147483647(0x7fffffff, float:NaN)
                r3.<init>(r0, r1, r2)
                r3.handle = r4
                return
        }

        /* synthetic */ ThreadLocalUnsafeDirectByteBuf(io.netty.util.Recycler.Handle r1, io.netty.buffer.ByteBufUtil.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        static io.netty.buffer.ByteBufUtil.ThreadLocalUnsafeDirectByteBuf newInstance() {
                io.netty.util.Recycler<io.netty.buffer.ByteBufUtil$ThreadLocalUnsafeDirectByteBuf> r0 = io.netty.buffer.ByteBufUtil.ThreadLocalUnsafeDirectByteBuf.RECYCLER
                java.lang.Object r0 = r0.get()
                io.netty.buffer.ByteBufUtil$ThreadLocalUnsafeDirectByteBuf r0 = (io.netty.buffer.ByteBufUtil.ThreadLocalUnsafeDirectByteBuf) r0
                r0.resetRefCnt()
                return r0
        }

        @Override // io.netty.buffer.UnpooledDirectByteBuf, io.netty.buffer.AbstractReferenceCountedByteBuf
        protected void deallocate() {
                r2 = this;
                int r0 = r2.capacity()
                int r1 = io.netty.buffer.ByteBufUtil.access$500()
                if (r0 <= r1) goto Le
                super.deallocate()
                return
            Le:
                r2.clear()
                io.netty.util.Recycler$Handle<io.netty.buffer.ByteBufUtil$ThreadLocalUnsafeDirectByteBuf> r0 = r2.handle
                r0.recycle(r2)
                return
        }
    }

    static {
            java.lang.Class<io.netty.buffer.ByteBufUtil> r0 = io.netty.buffer.ByteBufUtil.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.buffer.ByteBufUtil.logger = r0
            io.netty.buffer.ByteBufUtil$1 r1 = new io.netty.buffer.ByteBufUtil$1
            r1.<init>()
            io.netty.buffer.ByteBufUtil.BYTE_ARRAYS = r1
            java.nio.charset.Charset r1 = io.netty.util.CharsetUtil.UTF_8
            java.nio.charset.CharsetEncoder r1 = io.netty.util.CharsetUtil.encoder(r1)
            float r1 = r1.maxBytesPerChar()
            int r1 = (int) r1
            io.netty.buffer.ByteBufUtil.MAX_BYTES_PER_CHAR_UTF8 = r1
            boolean r1 = io.netty.util.internal.PlatformDependent.isAndroid()
            java.lang.String r2 = "pooled"
            java.lang.String r3 = "unpooled"
            if (r1 == 0) goto L28
            r1 = r3
            goto L29
        L28:
            r1 = r2
        L29:
            java.lang.String r4 = "io.netty.allocator.type"
            java.lang.String r1 = io.netty.util.internal.SystemPropertyUtil.get(r4, r1)
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r4)
            java.lang.String r1 = r1.trim()
            boolean r3 = r3.equals(r1)
            java.lang.String r4 = "-Dio.netty.allocator.type: {}"
            if (r3 == 0) goto L47
            io.netty.buffer.UnpooledByteBufAllocator r2 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT
            r0.debug(r4, r1)
            goto L5a
        L47:
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L53
            io.netty.buffer.PooledByteBufAllocator r2 = io.netty.buffer.PooledByteBufAllocator.DEFAULT
            r0.debug(r4, r1)
            goto L5a
        L53:
            io.netty.buffer.PooledByteBufAllocator r2 = io.netty.buffer.PooledByteBufAllocator.DEFAULT
            java.lang.String r3 = "-Dio.netty.allocator.type: pooled (unknown: {})"
            r0.debug(r3, r1)
        L5a:
            io.netty.buffer.ByteBufUtil.DEFAULT_ALLOCATOR = r2
            java.lang.String r1 = "io.netty.threadLocalDirectBufferSize"
            r2 = 0
            int r1 = io.netty.util.internal.SystemPropertyUtil.getInt(r1, r2)
            io.netty.buffer.ByteBufUtil.THREAD_LOCAL_BUFFER_SIZE = r1
            java.lang.String r2 = "-Dio.netty.threadLocalDirectBufferSize: {}"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.debug(r2, r1)
            java.lang.String r1 = "io.netty.maxThreadLocalCharBufferSize"
            r2 = 16384(0x4000, float:2.2959E-41)
            int r1 = io.netty.util.internal.SystemPropertyUtil.getInt(r1, r2)
            io.netty.buffer.ByteBufUtil.MAX_CHAR_BUFFER_SIZE = r1
            java.lang.String r2 = "-Dio.netty.maxThreadLocalCharBufferSize: {}"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.debug(r2, r1)
            io.netty.buffer.ByteBufUtil$2 r0 = new io.netty.buffer.ByteBufUtil$2
            r0.<init>()
            io.netty.buffer.ByteBufUtil.FIND_NON_ASCII = r0
            return
    }

    private ByteBufUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ int access$500() {
            int r0 = io.netty.buffer.ByteBufUtil.THREAD_LOCAL_BUFFER_SIZE
            return r0
    }

    public static void appendPrettyHexDump(java.lang.StringBuilder r2, io.netty.buffer.ByteBuf r3) {
            int r0 = r3.readerIndex()
            int r1 = r3.readableBytes()
            appendPrettyHexDump(r2, r3, r0, r1)
            return
    }

    public static void appendPrettyHexDump(java.lang.StringBuilder r0, io.netty.buffer.ByteBuf r1, int r2, int r3) {
            io.netty.buffer.ByteBufUtil.HexUtil.access$300(r0, r1, r2, r3)
            return
    }

    private static java.lang.CharSequence checkCharSequenceBounds(java.lang.CharSequence r3, int r4, int r5) {
            int r0 = r5 - r4
            int r1 = r3.length()
            boolean r0 = io.netty.util.internal.MathUtil.isOutOfBounds(r4, r0, r1)
            if (r0 != 0) goto Ld
            return r3
        Ld:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "expected: 0 <= start("
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ") <= end ("
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = ") <= seq.length("
            r1.append(r4)
            int r3 = r3.length()
            r1.append(r3)
            r3 = 41
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public static int compare(io.netty.buffer.ByteBuf r11, io.netty.buffer.ByteBuf r12) {
            int r0 = r11.readableBytes()
            int r1 = r12.readableBytes()
            int r2 = java.lang.Math.min(r0, r1)
            int r3 = r2 >>> 2
            r2 = r2 & 3
            int r4 = r11.readerIndex()
            int r5 = r12.readerIndex()
            if (r3 <= 0) goto L60
            java.nio.ByteOrder r6 = r11.order()
            java.nio.ByteOrder r7 = java.nio.ByteOrder.BIG_ENDIAN
            if (r6 != r7) goto L24
            r6 = 1
            goto L25
        L24:
            r6 = 0
        L25:
            int r3 = r3 << 2
            java.nio.ByteOrder r7 = r11.order()
            java.nio.ByteOrder r8 = r12.order()
            if (r7 != r8) goto L3d
            if (r6 == 0) goto L38
            long r6 = compareUintBigEndian(r11, r12, r4, r5, r3)
            goto L48
        L38:
            long r6 = compareUintLittleEndian(r11, r12, r4, r5, r3)
            goto L48
        L3d:
            if (r6 == 0) goto L44
            long r6 = compareUintBigEndianA(r11, r12, r4, r5, r3)
            goto L48
        L44:
            long r6 = compareUintBigEndianB(r11, r12, r4, r5, r3)
        L48:
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L5e
            r11 = -2147483648(0xffffffff80000000, double:NaN)
            long r11 = java.lang.Math.max(r11, r6)
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r11 = java.lang.Math.min(r0, r11)
            int r12 = (int) r11
            return r12
        L5e:
            int r4 = r4 + r3
            int r5 = r5 + r3
        L60:
            int r2 = r2 + r4
        L61:
            if (r4 >= r2) goto L74
            short r3 = r11.getUnsignedByte(r4)
            short r6 = r12.getUnsignedByte(r5)
            int r3 = r3 - r6
            if (r3 == 0) goto L6f
            return r3
        L6f:
            int r4 = r4 + 1
            int r5 = r5 + 1
            goto L61
        L74:
            int r0 = r0 - r1
            return r0
    }

    private static long compareUintBigEndian(io.netty.buffer.ByteBuf r6, io.netty.buffer.ByteBuf r7, int r8, int r9, int r10) {
            int r10 = r10 + r8
        L1:
            r0 = 0
            if (r8 >= r10) goto L18
            long r2 = r6.getUnsignedInt(r8)
            long r4 = r7.getUnsignedInt(r9)
            long r2 = r2 - r4
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L13
            return r2
        L13:
            int r8 = r8 + 4
            int r9 = r9 + 4
            goto L1
        L18:
            return r0
    }

    private static long compareUintBigEndianA(io.netty.buffer.ByteBuf r6, io.netty.buffer.ByteBuf r7, int r8, int r9, int r10) {
            int r10 = r10 + r8
        L1:
            r0 = 0
            if (r8 >= r10) goto L18
            long r2 = r6.getUnsignedInt(r8)
            long r4 = r7.getUnsignedIntLE(r9)
            long r2 = r2 - r4
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L13
            return r2
        L13:
            int r8 = r8 + 4
            int r9 = r9 + 4
            goto L1
        L18:
            return r0
    }

    private static long compareUintBigEndianB(io.netty.buffer.ByteBuf r6, io.netty.buffer.ByteBuf r7, int r8, int r9, int r10) {
            int r10 = r10 + r8
        L1:
            r0 = 0
            if (r8 >= r10) goto L18
            long r2 = r6.getUnsignedIntLE(r8)
            long r4 = r7.getUnsignedInt(r9)
            long r2 = r2 - r4
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L13
            return r2
        L13:
            int r8 = r8 + 4
            int r9 = r9 + 4
            goto L1
        L18:
            return r0
    }

    private static long compareUintLittleEndian(io.netty.buffer.ByteBuf r6, io.netty.buffer.ByteBuf r7, int r8, int r9, int r10) {
            int r10 = r10 + r8
        L1:
            r0 = 0
            if (r8 >= r10) goto L18
            long r2 = r6.getUnsignedIntLE(r8)
            long r4 = r7.getUnsignedIntLE(r9)
            long r2 = r2 - r4
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L13
            return r2
        L13:
            int r8 = r8 + 4
            int r9 = r9 + 4
            goto L1
        L18:
            return r0
    }

    public static void copy(io.netty.util.AsciiString r2, int r3, io.netty.buffer.ByteBuf r4, int r5) {
            int r0 = r2.length()
            boolean r0 = io.netty.util.internal.MathUtil.isOutOfBounds(r3, r5, r0)
            if (r0 != 0) goto L1f
            java.lang.String r0 = "dst"
            java.lang.Object r4 = io.netty.util.internal.ObjectUtil.checkNotNull(r4, r0)
            io.netty.buffer.ByteBuf r4 = (io.netty.buffer.ByteBuf) r4
            byte[] r0 = r2.array()
            int r2 = r2.arrayOffset()
            int r3 = r3 + r2
            r4.writeBytes(r0, r3, r5)
            return
        L1f:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "expected: 0 <= srcIdx("
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = ") <= srcIdx + length("
            r0.append(r3)
            r0.append(r5)
            java.lang.String r3 = ") <= srcLen("
            r0.append(r3)
            int r2 = r2.length()
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r4.<init>(r2)
            throw r4
    }

    public static void copy(io.netty.util.AsciiString r1, int r2, io.netty.buffer.ByteBuf r3, int r4, int r5) {
            int r0 = r1.length()
            boolean r0 = io.netty.util.internal.MathUtil.isOutOfBounds(r2, r5, r0)
            if (r0 != 0) goto L1f
            java.lang.String r0 = "dst"
            java.lang.Object r3 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r0)
            io.netty.buffer.ByteBuf r3 = (io.netty.buffer.ByteBuf) r3
            byte[] r0 = r1.array()
            int r1 = r1.arrayOffset()
            int r2 = r2 + r1
            r3.setBytes(r4, r0, r2, r5)
            return
        L1f:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "expected: 0 <= srcIdx("
            r4.append(r0)
            r4.append(r2)
            java.lang.String r2 = ") <= srcIdx + length("
            r4.append(r2)
            r4.append(r5)
            java.lang.String r2 = ") <= srcLen("
            r4.append(r2)
            int r1 = r1.length()
            r4.append(r1)
            r1 = 41
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r3.<init>(r1)
            throw r3
    }

    public static void copy(io.netty.util.AsciiString r2, io.netty.buffer.ByteBuf r3) {
            r0 = 0
            int r1 = r2.length()
            copy(r2, r0, r3, r1)
            return
    }

    public static byte decodeHexByte(java.lang.CharSequence r0, int r1) {
            byte r0 = io.netty.util.internal.StringUtil.decodeHexByte(r0, r1)
            return r0
    }

    public static byte[] decodeHexDump(java.lang.CharSequence r2) {
            r0 = 0
            int r1 = r2.length()
            byte[] r2 = io.netty.util.internal.StringUtil.decodeHexDump(r2, r0, r1)
            return r2
    }

    public static byte[] decodeHexDump(java.lang.CharSequence r0, int r1, int r2) {
            byte[] r0 = io.netty.util.internal.StringUtil.decodeHexDump(r0, r1, r2)
            return r0
    }

    static java.lang.String decodeString(io.netty.buffer.ByteBuf r2, int r3, int r4, java.nio.charset.Charset r5) {
            if (r4 != 0) goto L5
            java.lang.String r2 = ""
            return r2
        L5:
            boolean r0 = r2.hasArray()
            r1 = 0
            if (r0 == 0) goto L16
            byte[] r0 = r2.array()
            int r2 = r2.arrayOffset()
            int r2 = r2 + r3
            goto L1e
        L16:
            byte[] r0 = threadLocalTempArray(r4)
            r2.getBytes(r3, r0, r1, r4)
            r2 = 0
        L1e:
            java.nio.charset.Charset r3 = io.netty.util.CharsetUtil.US_ASCII
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L2c
            java.lang.String r3 = new java.lang.String
            r3.<init>(r0, r1, r2, r4)
            return r3
        L2c:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r0, r2, r4, r5)
            return r3
    }

    public static io.netty.buffer.ByteBuf encodeString(io.netty.buffer.ByteBufAllocator r1, java.nio.CharBuffer r2, java.nio.charset.Charset r3) {
            r0 = 0
            io.netty.buffer.ByteBuf r1 = encodeString0(r1, r0, r2, r3, r0)
            return r1
    }

    public static io.netty.buffer.ByteBuf encodeString(io.netty.buffer.ByteBufAllocator r1, java.nio.CharBuffer r2, java.nio.charset.Charset r3, int r4) {
            r0 = 0
            io.netty.buffer.ByteBuf r1 = encodeString0(r1, r0, r2, r3, r4)
            return r1
    }

    static io.netty.buffer.ByteBuf encodeString0(io.netty.buffer.ByteBufAllocator r4, boolean r5, java.nio.CharBuffer r6, java.nio.charset.Charset r7, int r8) {
            java.nio.charset.CharsetEncoder r7 = io.netty.util.CharsetUtil.encoder(r7)
            int r0 = r6.remaining()
            double r0 = (double) r0
            float r2 = r7.maxBytesPerChar()
            double r2 = (double) r2
            double r0 = r0 * r2
            int r0 = (int) r0
            int r0 = r0 + r8
            if (r5 == 0) goto L19
            io.netty.buffer.ByteBuf r4 = r4.heapBuffer(r0)
            goto L1d
        L19:
            io.netty.buffer.ByteBuf r4 = r4.buffer(r0)
        L1d:
            int r5 = r4.readerIndex()     // Catch: java.lang.Throwable -> L38 java.nio.charset.CharacterCodingException -> L3a
            java.nio.ByteBuffer r5 = r4.internalNioBuffer(r5, r0)     // Catch: java.lang.Throwable -> L38 java.nio.charset.CharacterCodingException -> L3a
            int r8 = r5.position()     // Catch: java.lang.Throwable -> L38 java.nio.charset.CharacterCodingException -> L3a
            r0 = 1
            java.nio.charset.CoderResult r6 = r7.encode(r6, r5, r0)     // Catch: java.lang.Throwable -> L38 java.nio.charset.CharacterCodingException -> L3a
            boolean r0 = r6.isUnderflow()     // Catch: java.lang.Throwable -> L38 java.nio.charset.CharacterCodingException -> L3a
            if (r0 != 0) goto L3c
            r6.throwException()     // Catch: java.lang.Throwable -> L38 java.nio.charset.CharacterCodingException -> L3a
            goto L3c
        L38:
            r5 = move-exception
            goto L5d
        L3a:
            r5 = move-exception
            goto L57
        L3c:
            java.nio.charset.CoderResult r6 = r7.flush(r5)     // Catch: java.lang.Throwable -> L38 java.nio.charset.CharacterCodingException -> L3a
            boolean r7 = r6.isUnderflow()     // Catch: java.lang.Throwable -> L38 java.nio.charset.CharacterCodingException -> L3a
            if (r7 != 0) goto L49
            r6.throwException()     // Catch: java.lang.Throwable -> L38 java.nio.charset.CharacterCodingException -> L3a
        L49:
            int r6 = r4.writerIndex()     // Catch: java.lang.Throwable -> L38 java.nio.charset.CharacterCodingException -> L3a
            int r5 = r5.position()     // Catch: java.lang.Throwable -> L38 java.nio.charset.CharacterCodingException -> L3a
            int r6 = r6 + r5
            int r6 = r6 - r8
            r4.writerIndex(r6)     // Catch: java.lang.Throwable -> L38 java.nio.charset.CharacterCodingException -> L3a
            return r4
        L57:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L38
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L38
            throw r6     // Catch: java.lang.Throwable -> L38
        L5d:
            r4.release()
            throw r5
    }

    public static boolean ensureWritableSuccess(int r1) {
            if (r1 == 0) goto L8
            r0 = 2
            if (r1 != r0) goto L6
            goto L8
        L6:
            r1 = 0
            return r1
        L8:
            r1 = 1
            return r1
    }

    public static boolean equals(io.netty.buffer.ByteBuf r7, int r8, io.netty.buffer.ByteBuf r9, int r10, int r11) {
            if (r8 < 0) goto L6b
            if (r10 < 0) goto L6b
            if (r11 < 0) goto L6b
            int r0 = r7.writerIndex()
            int r0 = r0 - r11
            r1 = 0
            if (r0 < r8) goto L6a
            int r0 = r9.writerIndex()
            int r0 = r0 - r11
            if (r0 >= r10) goto L16
            goto L6a
        L16:
            int r0 = r11 >>> 3
            r11 = r11 & 7
            java.nio.ByteOrder r2 = r7.order()
            java.nio.ByteOrder r3 = r9.order()
            if (r2 != r3) goto L3a
        L24:
            if (r0 <= 0) goto L54
            long r2 = r7.getLong(r8)
            long r4 = r9.getLong(r10)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L33
            return r1
        L33:
            int r8 = r8 + 8
            int r10 = r10 + 8
            int r0 = r0 + (-1)
            goto L24
        L3a:
            if (r0 <= 0) goto L54
            long r2 = r7.getLong(r8)
            long r4 = r9.getLong(r10)
            long r4 = swapLong(r4)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L4d
            return r1
        L4d:
            int r8 = r8 + 8
            int r10 = r10 + 8
            int r0 = r0 + (-1)
            goto L3a
        L54:
            if (r11 <= 0) goto L68
            byte r0 = r7.getByte(r8)
            byte r2 = r9.getByte(r10)
            if (r0 == r2) goto L61
            return r1
        L61:
            int r8 = r8 + 1
            int r10 = r10 + 1
            int r11 = r11 + (-1)
            goto L54
        L68:
            r7 = 1
            return r7
        L6a:
            return r1
        L6b:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "All indexes and lengths must be non-negative"
            r7.<init>(r8)
            throw r7
    }

    public static boolean equals(io.netty.buffer.ByteBuf r3, io.netty.buffer.ByteBuf r4) {
            int r0 = r3.readableBytes()
            int r1 = r4.readableBytes()
            if (r0 == r1) goto Lc
            r3 = 0
            return r3
        Lc:
            int r1 = r3.readerIndex()
            int r2 = r4.readerIndex()
            boolean r3 = equals(r3, r1, r4, r2, r0)
            return r3
    }

    private static int firstIndexOf(io.netty.buffer.ByteBuf r1, int r2, int r3, byte r4) {
            r0 = 0
            int r2 = java.lang.Math.max(r2, r0)
            if (r2 >= r3) goto L19
            int r0 = r1.capacity()
            if (r0 != 0) goto Le
            goto L19
        Le:
            int r3 = r3 - r2
            io.netty.util.ByteProcessor$IndexOfProcessor r0 = new io.netty.util.ByteProcessor$IndexOfProcessor
            r0.<init>(r4)
            int r1 = r1.forEachByte(r2, r3, r0)
            return r1
        L19:
            r1 = -1
            return r1
    }

    private static void getBytes(java.nio.ByteBuffer r1, byte[] r2, int r3, int r4, java.io.OutputStream r5, int r6) throws java.io.IOException {
        L0:
            int r0 = java.lang.Math.min(r4, r6)
            r1.get(r2, r3, r0)
            r5.write(r2, r3, r0)
            int r6 = r6 - r0
            if (r6 > 0) goto L0
            return
    }

    public static byte[] getBytes(io.netty.buffer.ByteBuf r2) {
            int r0 = r2.readerIndex()
            int r1 = r2.readableBytes()
            byte[] r2 = getBytes(r2, r0, r1)
            return r2
    }

    public static byte[] getBytes(io.netty.buffer.ByteBuf r1, int r2, int r3) {
            r0 = 1
            byte[] r1 = getBytes(r1, r2, r3, r0)
            return r1
    }

    public static byte[] getBytes(io.netty.buffer.ByteBuf r2, int r3, int r4, boolean r5) {
            int r0 = r2.capacity()
            boolean r1 = io.netty.util.internal.MathUtil.isOutOfBounds(r3, r4, r0)
            if (r1 != 0) goto L33
            boolean r1 = r2.hasArray()
            if (r1 == 0) goto L2b
            if (r5 != 0) goto L1c
            if (r3 != 0) goto L1c
            if (r4 == r0) goto L17
            goto L1c
        L17:
            byte[] r2 = r2.array()
            return r2
        L1c:
            int r5 = r2.arrayOffset()
            int r5 = r5 + r3
            byte[] r2 = r2.array()
            int r4 = r4 + r5
            byte[] r2 = java.util.Arrays.copyOfRange(r2, r5, r4)
            return r2
        L2b:
            byte[] r4 = io.netty.util.internal.PlatformDependent.allocateUninitializedArray(r4)
            r2.getBytes(r3, r4)
            return r4
        L33:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "expected: 0 <= start("
            r5.append(r1)
            r5.append(r3)
            java.lang.String r3 = ") <= start + length("
            r5.append(r3)
            r5.append(r4)
            java.lang.String r3 = ") <= buf.capacity("
            r5.append(r3)
            r5.append(r0)
            r3 = 41
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r2.<init>(r3)
            throw r2
    }

    public static int hashCode(io.netty.buffer.ByteBuf r6) {
            int r0 = r6.readableBytes()
            int r1 = r0 >>> 2
            r0 = r0 & 3
            int r2 = r6.readerIndex()
            java.nio.ByteOrder r3 = r6.order()
            java.nio.ByteOrder r4 = java.nio.ByteOrder.BIG_ENDIAN
            r5 = 1
            if (r3 != r4) goto L24
            r3 = 1
        L16:
            if (r1 <= 0) goto L37
            int r3 = r3 * 31
            int r4 = r6.getInt(r2)
            int r3 = r3 + r4
            int r2 = r2 + 4
            int r1 = r1 + (-1)
            goto L16
        L24:
            r3 = 1
        L25:
            if (r1 <= 0) goto L37
            int r3 = r3 * 31
            int r4 = r6.getInt(r2)
            int r4 = swapInt(r4)
            int r3 = r3 + r4
            int r2 = r2 + 4
            int r1 = r1 + (-1)
            goto L25
        L37:
            if (r0 <= 0) goto L46
            int r3 = r3 * 31
            int r1 = r2 + 1
            byte r2 = r6.getByte(r2)
            int r3 = r3 + r2
            int r0 = r0 + (-1)
            r2 = r1
            goto L37
        L46:
            if (r3 != 0) goto L49
            return r5
        L49:
            return r3
    }

    public static java.lang.String hexDump(io.netty.buffer.ByteBuf r2) {
            int r0 = r2.readerIndex()
            int r1 = r2.readableBytes()
            java.lang.String r2 = hexDump(r2, r0, r1)
            return r2
    }

    public static java.lang.String hexDump(io.netty.buffer.ByteBuf r0, int r1, int r2) {
            java.lang.String r0 = io.netty.buffer.ByteBufUtil.HexUtil.access$000(r0, r1, r2)
            return r0
    }

    public static java.lang.String hexDump(byte[] r2) {
            r0 = 0
            int r1 = r2.length
            java.lang.String r2 = hexDump(r2, r0, r1)
            return r2
    }

    public static java.lang.String hexDump(byte[] r0, int r1, int r2) {
            java.lang.String r0 = io.netty.buffer.ByteBufUtil.HexUtil.access$100(r0, r1, r2)
            return r0
    }

    public static int indexOf(io.netty.buffer.ByteBuf r0, int r1, int r2, byte r3) {
            if (r1 > r2) goto L7
            int r0 = firstIndexOf(r0, r1, r2, r3)
            return r0
        L7:
            int r0 = lastIndexOf(r0, r1, r2, r3)
            return r0
    }

    public static int indexOf(io.netty.buffer.ByteBuf r5, io.netty.buffer.ByteBuf r6) {
            int r0 = r6.readableBytes()
            int r1 = r5.readableBytes()
            int r0 = r0 - r1
            int r0 = r0 + 1
            r1 = 0
        Lc:
            if (r1 >= r0) goto L2a
            int r2 = r5.readerIndex()
            int r3 = r6.readerIndex()
            int r3 = r3 + r1
            int r4 = r5.readableBytes()
            boolean r2 = equals(r5, r2, r6, r3, r4)
            if (r2 == 0) goto L27
            int r5 = r6.readerIndex()
            int r5 = r5 + r1
            return r5
        L27:
            int r1 = r1 + 1
            goto Lc
        L2a:
            r5 = -1
            return r5
    }

    private static boolean isAscii(io.netty.buffer.ByteBuf r1, int r2, int r3) {
            io.netty.util.ByteProcessor r0 = io.netty.buffer.ByteBufUtil.FIND_NON_ASCII
            int r1 = r1.forEachByte(r2, r3, r0)
            r2 = -1
            if (r1 != r2) goto Lb
            r1 = 1
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public static boolean isText(io.netty.buffer.ByteBuf r2, int r3, int r4, java.nio.charset.Charset r5) {
            java.lang.String r0 = "buf"
            io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            java.lang.String r0 = "charset"
            io.netty.util.internal.ObjectUtil.checkNotNull(r5, r0)
            int r0 = r2.readerIndex()
            int r1 = r2.readableBytes()
            int r0 = r0 + r1
            if (r3 < 0) goto L6a
            if (r4 < 0) goto L6a
            int r0 = r0 - r4
            if (r3 > r0) goto L6a
            java.nio.charset.Charset r0 = io.netty.util.CharsetUtil.UTF_8
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L27
            boolean r2 = isUtf8(r2, r3, r4)
            return r2
        L27:
            java.nio.charset.Charset r0 = io.netty.util.CharsetUtil.US_ASCII
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L34
            boolean r2 = isAscii(r2, r3, r4)
            return r2
        L34:
            java.nio.charset.CodingErrorAction r0 = java.nio.charset.CodingErrorAction.REPORT
            java.nio.charset.CharsetDecoder r5 = io.netty.util.CharsetUtil.decoder(r5, r0, r0)
            int r0 = r2.nioBufferCount()     // Catch: java.nio.charset.CharacterCodingException -> L68
            r1 = 1
            if (r0 != r1) goto L49
            java.nio.ByteBuffer r2 = r2.nioBuffer(r3, r4)     // Catch: java.nio.charset.CharacterCodingException -> L68
            r5.decode(r2)     // Catch: java.nio.charset.CharacterCodingException -> L68
            goto L62
        L49:
            io.netty.buffer.ByteBufAllocator r0 = r2.alloc()     // Catch: java.nio.charset.CharacterCodingException -> L68
            io.netty.buffer.ByteBuf r0 = r0.heapBuffer(r4)     // Catch: java.nio.charset.CharacterCodingException -> L68
            r0.writeBytes(r2, r3, r4)     // Catch: java.lang.Throwable -> L63
            int r2 = r0.readerIndex()     // Catch: java.lang.Throwable -> L63
            java.nio.ByteBuffer r2 = r0.internalNioBuffer(r2, r4)     // Catch: java.lang.Throwable -> L63
            r5.decode(r2)     // Catch: java.lang.Throwable -> L63
            r0.release()     // Catch: java.nio.charset.CharacterCodingException -> L68
        L62:
            return r1
        L63:
            r2 = move-exception
            r0.release()     // Catch: java.nio.charset.CharacterCodingException -> L68
            throw r2     // Catch: java.nio.charset.CharacterCodingException -> L68
        L68:
            r2 = 0
            return r2
        L6a:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "index: "
            r5.append(r0)
            r5.append(r3)
            java.lang.String r3 = " length: "
            r5.append(r3)
            r5.append(r4)
            java.lang.String r3 = r5.toString()
            r2.<init>(r3)
            throw r2
    }

    public static boolean isText(io.netty.buffer.ByteBuf r2, java.nio.charset.Charset r3) {
            int r0 = r2.readerIndex()
            int r1 = r2.readableBytes()
            boolean r2 = isText(r2, r0, r1, r3)
            return r2
    }

    private static boolean isUtf8(io.netty.buffer.ByteBuf r9, int r10, int r11) {
            int r11 = r11 + r10
        L1:
            if (r10 >= r11) goto La1
            int r0 = r10 + 1
            byte r1 = r9.getByte(r10)
            r2 = r1 & 128(0x80, float:1.8E-43)
            if (r2 != 0) goto Lf
            r10 = r0
            goto L1
        Lf:
            r2 = r1 & 224(0xe0, float:3.14E-43)
            r3 = 192(0xc0, float:2.69E-43)
            r4 = 128(0x80, float:1.8E-43)
            r5 = 0
            if (r2 != r3) goto L2c
            if (r0 < r11) goto L1b
            return r5
        L1b:
            int r10 = r10 + 2
            byte r0 = r9.getByte(r0)
            r0 = r0 & r3
            if (r0 == r4) goto L25
            return r5
        L25:
            r0 = r1 & 255(0xff, float:3.57E-43)
            r1 = 194(0xc2, float:2.72E-43)
            if (r0 >= r1) goto L1
            return r5
        L2c:
            r2 = r1 & 240(0xf0, float:3.36E-43)
            r6 = 224(0xe0, float:3.14E-43)
            if (r2 != r6) goto L61
            int r2 = r11 + (-2)
            if (r0 <= r2) goto L37
            return r5
        L37:
            int r2 = r10 + 2
            byte r0 = r9.getByte(r0)
            int r10 = r10 + 3
            byte r2 = r9.getByte(r2)
            r6 = r0 & 192(0xc0, float:2.69E-43)
            if (r6 != r4) goto L60
            r2 = r2 & r3
            if (r2 == r4) goto L4b
            goto L60
        L4b:
            r1 = r1 & 15
            if (r1 != 0) goto L56
            r2 = r0 & 255(0xff, float:3.57E-43)
            r3 = 160(0xa0, float:2.24E-43)
            if (r2 >= r3) goto L56
            return r5
        L56:
            r2 = 13
            if (r1 != r2) goto L1
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 159(0x9f, float:2.23E-43)
            if (r0 <= r1) goto L1
        L60:
            return r5
        L61:
            r2 = r1 & 248(0xf8, float:3.48E-43)
            r6 = 240(0xf0, float:3.36E-43)
            if (r2 != r6) goto La0
            int r2 = r11 + (-3)
            if (r0 <= r2) goto L6c
            return r5
        L6c:
            int r2 = r10 + 2
            byte r0 = r9.getByte(r0)
            int r7 = r10 + 3
            byte r2 = r9.getByte(r2)
            int r10 = r10 + 4
            byte r7 = r9.getByte(r7)
            r8 = r0 & 192(0xc0, float:2.69E-43)
            if (r8 != r4) goto La0
            r2 = r2 & r3
            if (r2 != r4) goto La0
            r2 = r7 & 192(0xc0, float:2.69E-43)
            if (r2 == r4) goto L8a
            goto La0
        L8a:
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 244(0xf4, float:3.42E-43)
            if (r1 > r2) goto La0
            if (r1 != r6) goto L98
            r3 = r0 & 255(0xff, float:3.57E-43)
            r4 = 144(0x90, float:2.02E-43)
            if (r3 < r4) goto La0
        L98:
            if (r1 != r2) goto L1
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 143(0x8f, float:2.0E-43)
            if (r0 <= r1) goto L1
        La0:
            return r5
        La1:
            r9 = 1
            return r9
    }

    private static int lastIndexOf(io.netty.buffer.ByteBuf r1, int r2, int r3, byte r4) {
            int r0 = r1.capacity()
            int r2 = java.lang.Math.min(r2, r0)
            if (r2 < 0) goto L18
            if (r0 != 0) goto Ld
            goto L18
        Ld:
            int r2 = r2 - r3
            io.netty.util.ByteProcessor$IndexOfProcessor r0 = new io.netty.util.ByteProcessor$IndexOfProcessor
            r0.<init>(r4)
            int r1 = r1.forEachByteDesc(r3, r2, r0)
            return r1
        L18:
            r1 = -1
            return r1
    }

    public static java.lang.String prettyHexDump(io.netty.buffer.ByteBuf r2) {
            int r0 = r2.readerIndex()
            int r1 = r2.readableBytes()
            java.lang.String r2 = prettyHexDump(r2, r0, r1)
            return r2
    }

    public static java.lang.String prettyHexDump(io.netty.buffer.ByteBuf r0, int r1, int r2) {
            java.lang.String r0 = io.netty.buffer.ByteBufUtil.HexUtil.access$200(r0, r1, r2)
            return r0
    }

    public static io.netty.buffer.ByteBuf readBytes(io.netty.buffer.ByteBufAllocator r0, io.netty.buffer.ByteBuf r1, int r2) {
            io.netty.buffer.ByteBuf r0 = r0.buffer(r2)
            r1.readBytes(r0)     // Catch: java.lang.Throwable -> L8
            return r0
        L8:
            r1 = move-exception
            r0.release()
            throw r1
    }

    static void readBytes(io.netty.buffer.ByteBufAllocator r7, java.nio.ByteBuffer r8, int r9, int r10, java.io.OutputStream r11) throws java.io.IOException {
            boolean r0 = r8.hasArray()
            if (r0 == 0) goto L13
            byte[] r7 = r8.array()
            int r8 = r8.arrayOffset()
            int r9 = r9 + r8
            r11.write(r7, r9, r10)
            return
        L13:
            r0 = 8192(0x2000, float:1.148E-41)
            int r4 = java.lang.Math.min(r10, r0)
            java.nio.Buffer r0 = r8.clear()
            r0.position(r9)
            r9 = 1024(0x400, float:1.435E-42)
            if (r10 <= r9) goto L2a
            boolean r9 = r7.isDirectBufferPooled()
            if (r9 != 0) goto L2e
        L2a:
            r1 = r8
            r6 = r10
            r5 = r11
            goto L4a
        L2e:
            io.netty.buffer.ByteBuf r7 = r7.heapBuffer(r4)
            byte[] r2 = r7.array()     // Catch: java.lang.Throwable -> L44
            int r3 = r7.arrayOffset()     // Catch: java.lang.Throwable -> L44
            r1 = r8
            r6 = r10
            r5 = r11
            getBytes(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L44
            r7.release()
            return
        L44:
            r0 = move-exception
            r8 = r0
            r7.release()
            throw r8
        L4a:
            byte[] r2 = threadLocalTempArray(r4)
            r3 = 0
            getBytes(r1, r2, r3, r4, r5, r6)
            return
    }

    public static int reserveAndWriteUtf8(io.netty.buffer.ByteBuf r2, java.lang.CharSequence r3, int r4) {
            r0 = 0
            int r1 = r3.length()
            int r2 = reserveAndWriteUtf8Seq(r2, r3, r0, r1, r4)
            return r2
    }

    public static int reserveAndWriteUtf8(io.netty.buffer.ByteBuf r0, java.lang.CharSequence r1, int r2, int r3, int r4) {
            java.lang.CharSequence r1 = checkCharSequenceBounds(r1, r2, r3)
            int r0 = reserveAndWriteUtf8Seq(r0, r1, r2, r3, r4)
            return r0
    }

    private static int reserveAndWriteUtf8Seq(io.netty.buffer.ByteBuf r1, java.lang.CharSequence r2, int r3, int r4, int r5) {
        L0:
            boolean r0 = r1 instanceof io.netty.buffer.WrappedCompositeByteBuf
            if (r0 == 0) goto L9
            io.netty.buffer.ByteBuf r1 = r1.unwrap()
            goto L0
        L9:
            boolean r0 = r1 instanceof io.netty.buffer.AbstractByteBuf
            if (r0 == 0) goto L1e
            io.netty.buffer.AbstractByteBuf r1 = (io.netty.buffer.AbstractByteBuf) r1
            r1.ensureWritable0(r5)
            int r5 = r1.writerIndex
            int r2 = writeUtf8(r1, r5, r2, r3, r4)
            int r3 = r1.writerIndex
            int r3 = r3 + r2
            r1.writerIndex = r3
            return r2
        L1e:
            boolean r0 = r1 instanceof io.netty.buffer.WrappedByteBuf
            if (r0 == 0) goto L27
            io.netty.buffer.ByteBuf r1 = r1.unwrap()
            goto L0
        L27:
            java.lang.CharSequence r2 = r2.subSequence(r3, r4)
            java.lang.String r2 = r2.toString()
            java.nio.charset.Charset r3 = io.netty.util.CharsetUtil.UTF_8
            byte[] r2 = r2.getBytes(r3)
            r1.writeBytes(r2)
            int r1 = r2.length
            return r1
    }

    public static io.netty.buffer.ByteBuf setShortBE(io.netty.buffer.ByteBuf r2, int r3, int r4) {
            java.nio.ByteOrder r0 = r2.order()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto Ld
            io.netty.buffer.ByteBuf r2 = r2.setShort(r3, r4)
            return r2
        Ld:
            io.netty.buffer.ByteBuf r2 = r2.setShortLE(r3, r4)
            return r2
    }

    public static int swapInt(int r0) {
            int r0 = java.lang.Integer.reverseBytes(r0)
            return r0
    }

    public static long swapLong(long r0) {
            long r0 = java.lang.Long.reverseBytes(r0)
            return r0
    }

    public static int swapMedium(int r2) {
            int r0 = r2 << 16
            r1 = 16711680(0xff0000, float:2.3418052E-38)
            r0 = r0 & r1
            r1 = 65280(0xff00, float:9.1477E-41)
            r1 = r1 & r2
            r0 = r0 | r1
            int r2 = r2 >>> 16
            r2 = r2 & 255(0xff, float:3.57E-43)
            r2 = r2 | r0
            r0 = 8388608(0x800000, float:1.1754944E-38)
            r0 = r0 & r2
            if (r0 == 0) goto L17
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r2 | r0
        L17:
            return r2
    }

    public static short swapShort(short r0) {
            short r0 = java.lang.Short.reverseBytes(r0)
            return r0
    }

    public static io.netty.buffer.ByteBuf threadLocalDirectBuffer() {
            int r0 = io.netty.buffer.ByteBufUtil.THREAD_LOCAL_BUFFER_SIZE
            if (r0 > 0) goto L6
            r0 = 0
            return r0
        L6:
            boolean r0 = io.netty.util.internal.PlatformDependent.hasUnsafe()
            if (r0 == 0) goto L11
            io.netty.buffer.ByteBufUtil$ThreadLocalUnsafeDirectByteBuf r0 = io.netty.buffer.ByteBufUtil.ThreadLocalUnsafeDirectByteBuf.newInstance()
            return r0
        L11:
            io.netty.buffer.ByteBufUtil$ThreadLocalDirectByteBuf r0 = io.netty.buffer.ByteBufUtil.ThreadLocalDirectByteBuf.newInstance()
            return r0
    }

    static byte[] threadLocalTempArray(int r1) {
            r0 = 1024(0x400, float:1.435E-42)
            if (r1 > r0) goto Ld
            io.netty.util.concurrent.FastThreadLocal<byte[]> r1 = io.netty.buffer.ByteBufUtil.BYTE_ARRAYS
            java.lang.Object r1 = r1.get()
            byte[] r1 = (byte[]) r1
            return r1
        Ld:
            byte[] r1 = io.netty.util.internal.PlatformDependent.allocateUninitializedArray(r1)
            return r1
    }

    private static int utf8ByteCount(java.lang.CharSequence r3, int r4, int r5) {
            boolean r0 = r3 instanceof io.netty.util.AsciiString
            if (r0 == 0) goto L6
            int r5 = r5 - r4
            return r5
        L6:
            r0 = r4
        L7:
            if (r0 >= r5) goto L14
            char r1 = r3.charAt(r0)
            r2 = 128(0x80, float:1.8E-43)
            if (r1 >= r2) goto L14
            int r0 = r0 + 1
            goto L7
        L14:
            if (r0 >= r5) goto L1e
            int r4 = r0 - r4
            int r3 = utf8BytesNonAscii(r3, r0, r5)
            int r4 = r4 + r3
            return r4
        L1e:
            int r0 = r0 - r4
            return r0
    }

    public static int utf8Bytes(java.lang.CharSequence r2) {
            r0 = 0
            int r1 = r2.length()
            int r2 = utf8ByteCount(r2, r0, r1)
            return r2
    }

    public static int utf8Bytes(java.lang.CharSequence r0, int r1, int r2) {
            java.lang.CharSequence r0 = checkCharSequenceBounds(r0, r1, r2)
            int r0 = utf8ByteCount(r0, r1, r2)
            return r0
    }

    private static int utf8BytesNonAscii(java.lang.CharSequence r3, int r4, int r5) {
            r0 = 0
        L1:
            if (r4 >= r5) goto L3c
            char r1 = r3.charAt(r4)
            r2 = 2048(0x800, float:2.87E-42)
            if (r1 >= r2) goto L13
            int r1 = 127 - r1
            int r1 = r1 >>> 31
            int r1 = r1 + 1
            int r0 = r0 + r1
            goto L39
        L13:
            boolean r2 = io.netty.util.internal.StringUtil.isSurrogate(r1)
            if (r2 == 0) goto L37
            boolean r1 = java.lang.Character.isHighSurrogate(r1)
            if (r1 != 0) goto L22
            int r0 = r0 + 1
            goto L39
        L22:
            int r4 = r4 + 1
            char r1 = r3.charAt(r4)     // Catch: java.lang.IndexOutOfBoundsException -> L34
            boolean r1 = java.lang.Character.isLowSurrogate(r1)
            if (r1 != 0) goto L31
            int r0 = r0 + 2
            goto L39
        L31:
            int r0 = r0 + 4
            goto L39
        L34:
            int r0 = r0 + 1
            return r0
        L37:
            int r0 = r0 + 3
        L39:
            int r4 = r4 + 1
            goto L1
        L3c:
            return r0
    }

    public static int utf8MaxBytes(int r1) {
            int r0 = io.netty.buffer.ByteBufUtil.MAX_BYTES_PER_CHAR_UTF8
            int r1 = r1 * r0
            return r1
    }

    public static int utf8MaxBytes(java.lang.CharSequence r0) {
            int r0 = r0.length()
            int r0 = utf8MaxBytes(r0)
            return r0
    }

    static int writeAscii(io.netty.buffer.AbstractByteBuf r3, int r4, java.lang.CharSequence r5, int r6) {
            r0 = 0
        L1:
            if (r0 >= r6) goto L14
            int r1 = r4 + 1
            char r2 = r5.charAt(r0)
            byte r2 = io.netty.util.AsciiString.c2b(r2)
            r3._setByte(r4, r2)
            int r0 = r0 + 1
            r4 = r1
            goto L1
        L14:
            return r6
    }

    public static int writeAscii(io.netty.buffer.ByteBuf r2, java.lang.CharSequence r3) {
            int r0 = r3.length()
            boolean r1 = r3 instanceof io.netty.util.AsciiString
            if (r1 == 0) goto L16
            io.netty.util.AsciiString r3 = (io.netty.util.AsciiString) r3
            byte[] r1 = r3.array()
            int r3 = r3.arrayOffset()
            r2.writeBytes(r1, r3, r0)
            return r0
        L16:
            boolean r1 = r2 instanceof io.netty.buffer.WrappedCompositeByteBuf
            if (r1 == 0) goto L1f
            io.netty.buffer.ByteBuf r2 = r2.unwrap()
            goto L16
        L1f:
            boolean r1 = r2 instanceof io.netty.buffer.AbstractByteBuf
            if (r1 == 0) goto L34
            io.netty.buffer.AbstractByteBuf r2 = (io.netty.buffer.AbstractByteBuf) r2
            r2.ensureWritable0(r0)
            int r1 = r2.writerIndex
            int r3 = writeAscii(r2, r1, r3, r0)
            int r0 = r2.writerIndex
            int r0 = r0 + r3
            r2.writerIndex = r0
            return r3
        L34:
            boolean r1 = r2 instanceof io.netty.buffer.WrappedByteBuf
            if (r1 == 0) goto L3d
            io.netty.buffer.ByteBuf r2 = r2.unwrap()
            goto L16
        L3d:
            java.lang.String r3 = r3.toString()
            java.nio.charset.Charset r0 = io.netty.util.CharsetUtil.US_ASCII
            byte[] r3 = r3.getBytes(r0)
            r2.writeBytes(r3)
            int r2 = r3.length
            return r2
    }

    public static io.netty.buffer.ByteBuf writeAscii(io.netty.buffer.ByteBufAllocator r1, java.lang.CharSequence r2) {
            int r0 = r2.length()
            io.netty.buffer.ByteBuf r1 = r1.buffer(r0)
            writeAscii(r1, r2)
            return r1
    }

    public static io.netty.buffer.ByteBuf writeMediumBE(io.netty.buffer.ByteBuf r2, int r3) {
            java.nio.ByteOrder r0 = r2.order()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto Ld
            io.netty.buffer.ByteBuf r2 = r2.writeMedium(r3)
            return r2
        Ld:
            io.netty.buffer.ByteBuf r2 = r2.writeMediumLE(r3)
            return r2
    }

    public static io.netty.buffer.ByteBuf writeShortBE(io.netty.buffer.ByteBuf r2, int r3) {
            java.nio.ByteOrder r0 = r2.order()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto Ld
            io.netty.buffer.ByteBuf r2 = r2.writeShort(r3)
            return r2
        Ld:
            io.netty.buffer.ByteBuf r2 = r2.writeShortLE(r3)
            return r2
    }

    static int writeUtf8(io.netty.buffer.AbstractByteBuf r1, int r2, java.lang.CharSequence r3, int r4) {
            r0 = 0
            int r1 = writeUtf8(r1, r2, r3, r0, r4)
            return r1
    }

    static int writeUtf8(io.netty.buffer.AbstractByteBuf r7, int r8, java.lang.CharSequence r9, int r10, int r11) {
            r0 = r8
        L1:
            if (r10 >= r11) goto L72
            char r1 = r9.charAt(r10)
            r2 = 128(0x80, float:1.8E-43)
            if (r1 >= r2) goto L13
            int r2 = r0 + 1
            byte r1 = (byte) r1
            r7._setByte(r0, r1)
            r0 = r2
            goto L6f
        L13:
            r3 = 2048(0x800, float:2.87E-42)
            if (r1 >= r3) goto L2b
            int r3 = r0 + 1
            int r4 = r1 >> 6
            r4 = r4 | 192(0xc0, float:2.69E-43)
            byte r4 = (byte) r4
            r7._setByte(r0, r4)
            int r0 = r0 + 2
            r1 = r1 & 63
            r1 = r1 | r2
            byte r1 = (byte) r1
            r7._setByte(r3, r1)
            goto L6f
        L2b:
            boolean r3 = io.netty.util.internal.StringUtil.isSurrogate(r1)
            r4 = 63
            if (r3 == 0) goto L52
            boolean r2 = java.lang.Character.isHighSurrogate(r1)
            if (r2 != 0) goto L40
            int r1 = r0 + 1
            r7._setByte(r0, r4)
            r0 = r1
            goto L6f
        L40:
            int r10 = r10 + 1
            char r2 = r9.charAt(r10)     // Catch: java.lang.IndexOutOfBoundsException -> L4b
            int r0 = writeUtf8Surrogate(r7, r0, r1, r2)
            goto L6f
        L4b:
            int r9 = r0 + 1
            r7._setByte(r0, r4)
            r0 = r9
            goto L72
        L52:
            int r3 = r0 + 1
            int r5 = r1 >> 12
            r5 = r5 | 224(0xe0, float:3.14E-43)
            byte r5 = (byte) r5
            r7._setByte(r0, r5)
            int r5 = r0 + 2
            int r6 = r1 >> 6
            r4 = r4 & r6
            r4 = r4 | r2
            byte r4 = (byte) r4
            r7._setByte(r3, r4)
            int r0 = r0 + 3
            r1 = r1 & 63
            r1 = r1 | r2
            byte r1 = (byte) r1
            r7._setByte(r5, r1)
        L6f:
            int r10 = r10 + 1
            goto L1
        L72:
            int r0 = r0 - r8
            return r0
    }

    public static int writeUtf8(io.netty.buffer.ByteBuf r3, java.lang.CharSequence r4) {
            int r0 = r4.length()
            r1 = 0
            int r2 = utf8MaxBytes(r0)
            int r3 = reserveAndWriteUtf8Seq(r3, r4, r1, r0, r2)
            return r3
    }

    public static int writeUtf8(io.netty.buffer.ByteBuf r1, java.lang.CharSequence r2, int r3, int r4) {
            checkCharSequenceBounds(r2, r3, r4)
            int r0 = r4 - r3
            int r0 = utf8MaxBytes(r0)
            int r1 = reserveAndWriteUtf8Seq(r1, r2, r3, r4, r0)
            return r1
    }

    public static io.netty.buffer.ByteBuf writeUtf8(io.netty.buffer.ByteBufAllocator r1, java.lang.CharSequence r2) {
            int r0 = utf8MaxBytes(r2)
            io.netty.buffer.ByteBuf r1 = r1.buffer(r0)
            writeUtf8(r1, r2)
            return r1
    }

    private static int writeUtf8Surrogate(io.netty.buffer.AbstractByteBuf r3, int r4, char r5, char r6) {
            boolean r0 = java.lang.Character.isLowSurrogate(r6)
            r1 = 63
            if (r0 != 0) goto L1b
            int r5 = r4 + 1
            r3._setByte(r4, r1)
            int r4 = r4 + 2
            boolean r0 = java.lang.Character.isHighSurrogate(r6)
            if (r0 == 0) goto L17
            r6 = 63
        L17:
            r3._setByte(r5, r6)
            return r4
        L1b:
            int r5 = java.lang.Character.toCodePoint(r5, r6)
            int r6 = r4 + 1
            int r0 = r5 >> 18
            r0 = r0 | 240(0xf0, float:3.36E-43)
            byte r0 = (byte) r0
            r3._setByte(r4, r0)
            int r0 = r4 + 2
            int r2 = r5 >> 12
            r2 = r2 & r1
            r2 = r2 | 128(0x80, float:1.8E-43)
            byte r2 = (byte) r2
            r3._setByte(r6, r2)
            int r6 = r4 + 3
            int r2 = r5 >> 6
            r2 = r2 & r1
            r2 = r2 | 128(0x80, float:1.8E-43)
            byte r2 = (byte) r2
            r3._setByte(r0, r2)
            int r4 = r4 + 4
            r5 = r5 & r1
            r5 = r5 | 128(0x80, float:1.8E-43)
            byte r5 = (byte) r5
            r3._setByte(r6, r5)
            return r4
    }
}
