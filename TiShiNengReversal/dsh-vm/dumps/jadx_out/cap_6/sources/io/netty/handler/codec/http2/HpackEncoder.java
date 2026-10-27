package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class HpackEncoder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int HUFF_CODE_THRESHOLD = 512;
    private final byte hashMask;
    private final io.netty.handler.codec.http2.HpackEncoder.HeaderEntry head;
    private final io.netty.handler.codec.http2.HpackEncoder.HeaderEntry[] headerFields;
    private final io.netty.handler.codec.http2.HpackHuffmanEncoder hpackHuffmanEncoder;
    private final int huffCodeThreshold;
    private final boolean ignoreMaxHeaderListSize;
    private long maxHeaderListSize;
    private long maxHeaderTableSize;
    private long size;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.http2.HpackEncoder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$http2$HpackUtil$IndexType = null;

        static {
                io.netty.handler.codec.http2.HpackUtil$IndexType[] r0 = io.netty.handler.codec.http2.HpackUtil.IndexType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.codec.http2.HpackEncoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http2$HpackUtil$IndexType = r0
                io.netty.handler.codec.http2.HpackUtil$IndexType r1 = io.netty.handler.codec.http2.HpackUtil.IndexType.INCREMENTAL     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.handler.codec.http2.HpackEncoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http2$HpackUtil$IndexType     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.codec.http2.HpackUtil$IndexType r1 = io.netty.handler.codec.http2.HpackUtil.IndexType.NONE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.netty.handler.codec.http2.HpackEncoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http2$HpackUtil$IndexType     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.handler.codec.http2.HpackUtil$IndexType r1 = io.netty.handler.codec.http2.HpackUtil.IndexType.NEVER     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class HeaderEntry extends io.netty.handler.codec.http2.HpackHeaderField {
        io.netty.handler.codec.http2.HpackEncoder.HeaderEntry after;
        io.netty.handler.codec.http2.HpackEncoder.HeaderEntry before;
        int hash;
        int index;
        io.netty.handler.codec.http2.HpackEncoder.HeaderEntry next;

        HeaderEntry(int r1, java.lang.CharSequence r2, java.lang.CharSequence r3, int r4, io.netty.handler.codec.http2.HpackEncoder.HeaderEntry r5) {
                r0 = this;
                r0.<init>(r2, r3)
                r0.index = r4
                r0.hash = r1
                r0.next = r5
                return
        }

        static /* synthetic */ void access$000(io.netty.handler.codec.http2.HpackEncoder.HeaderEntry r0, io.netty.handler.codec.http2.HpackEncoder.HeaderEntry r1) {
                r0.addBefore(r1)
                return
        }

        static /* synthetic */ void access$100(io.netty.handler.codec.http2.HpackEncoder.HeaderEntry r0) {
                r0.remove()
                return
        }

        private void addBefore(io.netty.handler.codec.http2.HpackEncoder.HeaderEntry r1) {
                r0 = this;
                r0.after = r1
                io.netty.handler.codec.http2.HpackEncoder$HeaderEntry r1 = r1.before
                r0.before = r1
                r1.after = r0
                io.netty.handler.codec.http2.HpackEncoder$HeaderEntry r1 = r0.after
                r1.before = r0
                return
        }

        private void remove() {
                r2 = this;
                io.netty.handler.codec.http2.HpackEncoder$HeaderEntry r0 = r2.before
                io.netty.handler.codec.http2.HpackEncoder$HeaderEntry r1 = r2.after
                r0.after = r1
                io.netty.handler.codec.http2.HpackEncoder$HeaderEntry r1 = r2.after
                r1.before = r0
                r0 = 0
                r2.before = r0
                r2.after = r0
                r2.next = r0
                return
        }
    }

    static {
            return
    }

    HpackEncoder() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    HpackEncoder(boolean r3) {
            r2 = this;
            r0 = 16
            r1 = 512(0x200, float:7.17E-43)
            r2.<init>(r3, r0, r1)
            return
    }

    HpackEncoder(boolean r7, int r8, int r9) {
            r6 = this;
            r6.<init>()
            io.netty.handler.codec.http2.HpackEncoder$HeaderEntry r0 = new io.netty.handler.codec.http2.HpackEncoder$HeaderEntry
            io.netty.util.AsciiString r2 = io.netty.util.AsciiString.EMPTY_STRING
            r4 = 2147483647(0x7fffffff, float:NaN)
            r5 = 0
            r1 = -1
            r3 = r2
            r0.<init>(r1, r2, r3, r4, r5)
            r6.head = r0
            io.netty.handler.codec.http2.HpackHuffmanEncoder r1 = new io.netty.handler.codec.http2.HpackHuffmanEncoder
            r1.<init>()
            r6.hpackHuffmanEncoder = r1
            r6.ignoreMaxHeaderListSize = r7
            r1 = 4096(0x1000, double:2.0237E-320)
            r6.maxHeaderTableSize = r1
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r6.maxHeaderListSize = r1
            r7 = 128(0x80, float:1.8E-43)
            int r7 = java.lang.Math.min(r8, r7)
            r8 = 2
            int r7 = java.lang.Math.max(r8, r7)
            int r7 = io.netty.util.internal.MathUtil.findNextPositivePowerOfTwo(r7)
            io.netty.handler.codec.http2.HpackEncoder$HeaderEntry[] r7 = new io.netty.handler.codec.http2.HpackEncoder.HeaderEntry[r7]
            r6.headerFields = r7
            int r7 = r7.length
            int r7 = r7 + (-1)
            byte r7 = (byte) r7
            r6.hashMask = r7
            r0.after = r0
            r0.before = r0
            r6.huffCodeThreshold = r9
            return
    }

    private void add(java.lang.CharSequence r10, java.lang.CharSequence r11, long r12) {
            r9 = this;
            long r0 = r9.maxHeaderTableSize
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto La
            r9.clear()
            return
        La:
            long r0 = r9.maxHeaderTableSize
            long r2 = r9.size
            long r0 = r0 - r2
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 >= 0) goto L17
            r9.remove()
            goto La
        L17:
            int r4 = io.netty.util.AsciiString.hashCode(r10)
            int r0 = r9.index(r4)
            io.netty.handler.codec.http2.HpackEncoder$HeaderEntry[] r1 = r9.headerFields
            r8 = r1[r0]
            io.netty.handler.codec.http2.HpackEncoder$HeaderEntry r3 = new io.netty.handler.codec.http2.HpackEncoder$HeaderEntry
            io.netty.handler.codec.http2.HpackEncoder$HeaderEntry r1 = r9.head
            io.netty.handler.codec.http2.HpackEncoder$HeaderEntry r1 = r1.before
            int r1 = r1.index
            int r7 = r1 + (-1)
            r5 = r10
            r6 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            io.netty.handler.codec.http2.HpackEncoder$HeaderEntry[] r10 = r9.headerFields
            r10[r0] = r3
            io.netty.handler.codec.http2.HpackEncoder$HeaderEntry r10 = r9.head
            io.netty.handler.codec.http2.HpackEncoder.HeaderEntry.access$000(r3, r10)
            long r10 = r9.size
            long r10 = r10 + r12
            r9.size = r10
            return
    }

    private void clear() {
            r2 = this;
            io.netty.handler.codec.http2.HpackEncoder$HeaderEntry[] r0 = r2.headerFields
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            io.netty.handler.codec.http2.HpackEncoder$HeaderEntry r0 = r2.head
            r0.after = r0
            r0.before = r0
            r0 = 0
            r2.size = r0
            return
    }

    private void encodeHeader(io.netty.buffer.ByteBuf r9, java.lang.CharSequence r10, java.lang.CharSequence r11, boolean r12, long r13) {
            r8 = this;
            if (r12 == 0) goto L11
            int r14 = r8.getNameIndex(r10)
            io.netty.handler.codec.http2.HpackUtil$IndexType r13 = io.netty.handler.codec.http2.HpackUtil.IndexType.NEVER
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r9.encodeLiteral(r10, r11, r12, r13, r14)
            r0 = r9
            return
        L11:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            long r9 = r0.maxHeaderTableSize
            r11 = 0
            r4 = -1
            r5 = 7
            r6 = 128(0x80, float:1.8E-43)
            int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r7 != 0) goto L35
            int r9 = io.netty.handler.codec.http2.HpackStaticTable.getIndex(r2, r3)
            if (r9 != r4) goto L31
            int r5 = io.netty.handler.codec.http2.HpackStaticTable.getIndex(r2)
            io.netty.handler.codec.http2.HpackUtil$IndexType r4 = io.netty.handler.codec.http2.HpackUtil.IndexType.NONE
            r0.encodeLiteral(r1, r2, r3, r4, r5)
            return
        L31:
            encodeInteger(r1, r6, r5, r9)
            return
        L35:
            int r11 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r11 <= 0) goto L43
            int r5 = r8.getNameIndex(r2)
            io.netty.handler.codec.http2.HpackUtil$IndexType r4 = io.netty.handler.codec.http2.HpackUtil.IndexType.NONE
            r0.encodeLiteral(r1, r2, r3, r4, r5)
            return
        L43:
            io.netty.handler.codec.http2.HpackEncoder$HeaderEntry r9 = r8.getEntry(r2, r3)
            if (r9 == 0) goto L56
            int r9 = r9.index
            int r9 = r8.getIndex(r9)
            int r10 = io.netty.handler.codec.http2.HpackStaticTable.length
            int r9 = r9 + r10
            encodeInteger(r1, r6, r5, r9)
            return
        L56:
            int r9 = io.netty.handler.codec.http2.HpackStaticTable.getIndex(r2, r3)
            if (r9 == r4) goto L60
            encodeInteger(r1, r6, r5, r9)
            return
        L60:
            r8.ensureCapacity(r13)
            io.netty.handler.codec.http2.HpackUtil$IndexType r4 = io.netty.handler.codec.http2.HpackUtil.IndexType.INCREMENTAL
            int r5 = r8.getNameIndex(r2)
            r0.encodeLiteral(r1, r2, r3, r4, r5)
            r8.add(r2, r3, r13)
            return
    }

    private void encodeHeadersEnforceMaxHeaderListSize(int r7, io.netty.buffer.ByteBuf r8, io.netty.handler.codec.http2.Http2Headers r9, io.netty.handler.codec.http2.Http2HeadersEncoder.SensitivityDetector r10) throws io.netty.handler.codec.http2.Http2Exception {
            r6 = this;
            java.util.Iterator r0 = r9.iterator()
            r1 = 0
        L6:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L2e
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.lang.Object r3 = r3.getValue()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            long r3 = io.netty.handler.codec.http2.HpackHeaderField.sizeOf(r4, r3)
            long r1 = r1 + r3
            long r3 = r6.maxHeaderListSize
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L6
            r5 = 0
            io.netty.handler.codec.http2.Http2CodecUtil.headerListSizeExceeded(r7, r3, r5)
            goto L6
        L2e:
            r6.encodeHeadersIgnoreMaxHeaderListSize(r8, r9, r10)
            return
    }

    private void encodeHeadersIgnoreMaxHeaderListSize(io.netty.buffer.ByteBuf r10, io.netty.handler.codec.http2.Http2Headers r11, io.netty.handler.codec.http2.Http2HeadersEncoder.SensitivityDetector r12) throws io.netty.handler.codec.http2.Http2Exception {
            r9 = this;
            java.util.Iterator r11 = r11.iterator()
        L4:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r11.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            r4 = r1
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.lang.Object r0 = r0.getValue()
            r5 = r0
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r6 = r12.isSensitive(r4, r5)
            long r7 = io.netty.handler.codec.http2.HpackHeaderField.sizeOf(r4, r5)
            r2 = r9
            r3 = r10
            r2.encodeHeader(r3, r4, r5, r6, r7)
            goto L4
        L2c:
            return
    }

    private static void encodeInteger(io.netty.buffer.ByteBuf r2, int r3, int r4, int r5) {
            long r0 = (long) r5
            encodeInteger(r2, r3, r4, r0)
            return
    }

    private static void encodeInteger(io.netty.buffer.ByteBuf r3, int r4, int r5, long r6) {
            int r5 = 8 - r5
            r0 = 255(0xff, float:3.57E-43)
            int r5 = r0 >>> r5
            long r0 = (long) r5
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 >= 0) goto L12
            long r4 = (long) r4
            long r4 = r4 | r6
            int r5 = (int) r4
            r3.writeByte(r5)
            return
        L12:
            r4 = r4 | r5
            r3.writeByte(r4)
            long r6 = r6 - r0
        L17:
            r4 = -128(0xffffffffffffff80, double:NaN)
            long r4 = r4 & r6
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 == 0) goto L2d
            r4 = 127(0x7f, double:6.27E-322)
            long r4 = r4 & r6
            r0 = 128(0x80, double:6.3E-322)
            long r4 = r4 | r0
            int r5 = (int) r4
            r3.writeByte(r5)
            r4 = 7
            long r6 = r6 >>> r4
            goto L17
        L2d:
            int r4 = (int) r6
            r3.writeByte(r4)
            return
    }

    private void encodeLiteral(io.netty.buffer.ByteBuf r5, java.lang.CharSequence r6, java.lang.CharSequence r7, io.netty.handler.codec.http2.HpackUtil.IndexType r8, int r9) {
            r4 = this;
            r0 = -1
            r1 = 1
            r2 = 0
            if (r9 == r0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            int[] r3 = io.netty.handler.codec.http2.HpackEncoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http2$HpackUtil$IndexType
            int r8 = r8.ordinal()
            r8 = r3[r8]
            if (r8 == r1) goto L33
            r1 = 2
            r3 = 4
            if (r8 == r1) goto L2b
            r1 = 3
            if (r8 != r1) goto L23
            if (r0 == 0) goto L1c
            goto L1d
        L1c:
            r9 = 0
        L1d:
            r8 = 16
            encodeInteger(r5, r8, r3, r9)
            goto L3d
        L23:
            java.lang.Error r5 = new java.lang.Error
            java.lang.String r6 = "should not reach here"
            r5.<init>(r6)
            throw r5
        L2b:
            if (r0 == 0) goto L2e
            goto L2f
        L2e:
            r9 = 0
        L2f:
            encodeInteger(r5, r2, r3, r9)
            goto L3d
        L33:
            if (r0 == 0) goto L36
            goto L37
        L36:
            r9 = 0
        L37:
            r8 = 64
            r1 = 6
            encodeInteger(r5, r8, r1, r9)
        L3d:
            if (r0 != 0) goto L42
            r4.encodeStringLiteral(r5, r6)
        L42:
            r4.encodeStringLiteral(r5, r7)
            return
    }

    private void encodeStringLiteral(io.netty.buffer.ByteBuf r4, java.lang.CharSequence r5) {
            r3 = this;
            int r0 = r5.length()
            int r1 = r3.huffCodeThreshold
            r2 = 7
            if (r0 < r1) goto L20
            io.netty.handler.codec.http2.HpackHuffmanEncoder r0 = r3.hpackHuffmanEncoder
            int r0 = r0.getEncodedLength(r5)
            int r1 = r5.length()
            if (r0 >= r1) goto L20
            r1 = 128(0x80, float:1.8E-43)
            encodeInteger(r4, r1, r2, r0)
            io.netty.handler.codec.http2.HpackHuffmanEncoder r0 = r3.hpackHuffmanEncoder
            r0.encode(r4, r5)
            return
        L20:
            r0 = 0
            int r1 = r5.length()
            encodeInteger(r4, r0, r2, r1)
            boolean r0 = r5 instanceof io.netty.util.AsciiString
            if (r0 == 0) goto L3e
            io.netty.util.AsciiString r5 = (io.netty.util.AsciiString) r5
            byte[] r0 = r5.array()
            int r1 = r5.arrayOffset()
            int r5 = r5.length()
            r4.writeBytes(r0, r1, r5)
            return
        L3e:
            java.nio.charset.Charset r0 = io.netty.util.CharsetUtil.ISO_8859_1
            r4.writeCharSequence(r5, r0)
            return
    }

    private void ensureCapacity(long r5) {
            r4 = this;
        L0:
            long r0 = r4.maxHeaderTableSize
            long r2 = r4.size
            long r0 = r0 - r2
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 >= 0) goto L14
            int r0 = r4.length()
            if (r0 != 0) goto L10
            goto L14
        L10:
            r4.remove()
            goto L0
        L14:
            return
    }

    private io.netty.handler.codec.http2.HpackEncoder.HeaderEntry getEntry(java.lang.CharSequence r6, java.lang.CharSequence r7) {
            r5 = this;
            int r0 = r5.length()
            r1 = 0
            if (r0 == 0) goto L31
            if (r6 == 0) goto L31
            if (r7 != 0) goto Lc
            goto L31
        Lc:
            int r0 = io.netty.util.AsciiString.hashCode(r6)
            int r2 = r5.index(r0)
            io.netty.handler.codec.http2.HpackEncoder$HeaderEntry[] r3 = r5.headerFields
            r2 = r3[r2]
        L18:
            if (r2 == 0) goto L31
            int r3 = r2.hash
            if (r3 != r0) goto L2e
            java.lang.CharSequence r3 = r2.name
            int r3 = io.netty.handler.codec.http2.HpackUtil.equalsConstantTime(r6, r3)
            java.lang.CharSequence r4 = r2.value
            int r4 = io.netty.handler.codec.http2.HpackUtil.equalsConstantTime(r7, r4)
            r3 = r3 & r4
            if (r3 == 0) goto L2e
            return r2
        L2e:
            io.netty.handler.codec.http2.HpackEncoder$HeaderEntry r2 = r2.next
            goto L18
        L31:
            return r1
    }

    private int getIndex(int r2) {
            r1 = this;
            r0 = -1
            if (r2 != r0) goto L4
            return r0
        L4:
            io.netty.handler.codec.http2.HpackEncoder$HeaderEntry r0 = r1.head
            io.netty.handler.codec.http2.HpackEncoder$HeaderEntry r0 = r0.before
            int r0 = r0.index
            int r2 = r2 - r0
            int r2 = r2 + 1
            return r2
    }

    private int getIndex(java.lang.CharSequence r5) {
            r4 = this;
            int r0 = r4.length()
            r1 = -1
            if (r0 == 0) goto L2e
            if (r5 != 0) goto La
            goto L2e
        La:
            int r0 = io.netty.util.AsciiString.hashCode(r5)
            int r2 = r4.index(r0)
            io.netty.handler.codec.http2.HpackEncoder$HeaderEntry[] r3 = r4.headerFields
            r2 = r3[r2]
        L16:
            if (r2 == 0) goto L2e
            int r3 = r2.hash
            if (r3 != r0) goto L2b
            java.lang.CharSequence r3 = r2.name
            int r3 = io.netty.handler.codec.http2.HpackUtil.equalsConstantTime(r5, r3)
            if (r3 == 0) goto L2b
            int r5 = r2.index
            int r5 = r4.getIndex(r5)
            return r5
        L2b:
            io.netty.handler.codec.http2.HpackEncoder$HeaderEntry r2 = r2.next
            goto L16
        L2e:
            return r1
    }

    private int getNameIndex(java.lang.CharSequence r3) {
            r2 = this;
            int r0 = io.netty.handler.codec.http2.HpackStaticTable.getIndex(r3)
            r1 = -1
            if (r0 != r1) goto L11
            int r3 = r2.getIndex(r3)
            if (r3 < 0) goto L10
            int r0 = io.netty.handler.codec.http2.HpackStaticTable.length
            int r3 = r3 + r0
        L10:
            return r3
        L11:
            return r0
    }

    private int index(int r2) {
            r1 = this;
            byte r0 = r1.hashMask
            r2 = r2 & r0
            return r2
    }

    private io.netty.handler.codec.http2.HpackHeaderField remove() {
            r6 = this;
            long r0 = r6.size
            r2 = 0
            r4 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto La
            return r4
        La:
            io.netty.handler.codec.http2.HpackEncoder$HeaderEntry r0 = r6.head
            io.netty.handler.codec.http2.HpackEncoder$HeaderEntry r0 = r0.after
            int r1 = r0.hash
            int r1 = r6.index(r1)
            io.netty.handler.codec.http2.HpackEncoder$HeaderEntry[] r2 = r6.headerFields
            r2 = r2[r1]
            r3 = r2
        L19:
            if (r2 == 0) goto L39
            io.netty.handler.codec.http2.HpackEncoder$HeaderEntry r5 = r2.next
            if (r2 != r0) goto L36
            if (r3 != r0) goto L26
            io.netty.handler.codec.http2.HpackEncoder$HeaderEntry[] r2 = r6.headerFields
            r2[r1] = r5
            goto L28
        L26:
            r3.next = r5
        L28:
            io.netty.handler.codec.http2.HpackEncoder.HeaderEntry.access$100(r0)
            long r1 = r6.size
            int r3 = r0.size()
            long r3 = (long) r3
            long r1 = r1 - r3
            r6.size = r1
            return r0
        L36:
            r3 = r2
            r2 = r5
            goto L19
        L39:
            return r4
    }

    public void encodeHeaders(int r2, io.netty.buffer.ByteBuf r3, io.netty.handler.codec.http2.Http2Headers r4, io.netty.handler.codec.http2.Http2HeadersEncoder.SensitivityDetector r5) throws io.netty.handler.codec.http2.Http2Exception {
            r1 = this;
            boolean r0 = r1.ignoreMaxHeaderListSize
            if (r0 == 0) goto L8
            r1.encodeHeadersIgnoreMaxHeaderListSize(r3, r4, r5)
            return
        L8:
            r1.encodeHeadersEnforceMaxHeaderListSize(r2, r3, r4, r5)
            return
    }

    io.netty.handler.codec.http2.HpackHeaderField getHeaderField(int r3) {
            r2 = this;
            io.netty.handler.codec.http2.HpackEncoder$HeaderEntry r0 = r2.head
        L2:
            int r1 = r3 + (-1)
            if (r3 < 0) goto La
            io.netty.handler.codec.http2.HpackEncoder$HeaderEntry r0 = r0.before
            r3 = r1
            goto L2
        La:
            return r0
    }

    public long getMaxHeaderListSize() {
            r2 = this;
            long r0 = r2.maxHeaderListSize
            return r0
    }

    public long getMaxHeaderTableSize() {
            r2 = this;
            long r0 = r2.maxHeaderTableSize
            return r0
    }

    int length() {
            r5 = this;
            long r0 = r5.size
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto La
            r0 = 0
            return r0
        La:
            io.netty.handler.codec.http2.HpackEncoder$HeaderEntry r0 = r5.head
            io.netty.handler.codec.http2.HpackEncoder$HeaderEntry r1 = r0.after
            int r1 = r1.index
            io.netty.handler.codec.http2.HpackEncoder$HeaderEntry r0 = r0.before
            int r0 = r0.index
            int r1 = r1 - r0
            int r1 = r1 + 1
            return r1
    }

    public void setMaxHeaderListSize(long r6) throws io.netty.handler.codec.http2.Http2Exception {
            r5 = this;
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r2 = 0
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 < 0) goto L12
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 > 0) goto L12
            r5.maxHeaderListSize = r6
            return
        L12:
            io.netty.handler.codec.http2.Http2Error r4 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r1 = 0
            r7[r1] = r2
            r1 = 1
            r7[r1] = r0
            r0 = 2
            r7[r0] = r6
            java.lang.String r6 = "Header List Size must be >= %d and <= %d but was %d"
            io.netty.handler.codec.http2.Http2Exception r6 = io.netty.handler.codec.http2.Http2Exception.connectionError(r4, r6, r7)
            throw r6
    }

    public void setMaxHeaderTableSize(io.netty.buffer.ByteBuf r6, long r7) throws io.netty.handler.codec.http2.Http2Exception {
            r5 = this;
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r2 = 0
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 < 0) goto L22
            int r4 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r4 > 0) goto L22
            long r0 = r5.maxHeaderTableSize
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 != 0) goto L16
            return
        L16:
            r5.maxHeaderTableSize = r7
            r5.ensureCapacity(r2)
            r0 = 32
            r1 = 5
            encodeInteger(r6, r0, r1, r7)
            return
        L22:
            io.netty.handler.codec.http2.Http2Error r6 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r1 = 0
            r8[r1] = r2
            r1 = 1
            r8[r1] = r0
            r0 = 2
            r8[r0] = r7
            java.lang.String r7 = "Header Table Size must be >= %d and <= %d but was %d"
            io.netty.handler.codec.http2.Http2Exception r6 = io.netty.handler.codec.http2.Http2Exception.connectionError(r6, r7, r8)
            throw r6
    }

    long size() {
            r2 = this;
            long r0 = r2.size
            return r0
    }
}
