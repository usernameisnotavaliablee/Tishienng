package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class HpackDecoder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final io.netty.handler.codec.http2.Http2Exception DECODE_ILLEGAL_INDEX_VALUE = null;
    private static final io.netty.handler.codec.http2.Http2Exception DECODE_ULE_128_DECOMPRESSION_EXCEPTION = null;
    private static final io.netty.handler.codec.http2.Http2Exception DECODE_ULE_128_TO_INT_DECOMPRESSION_EXCEPTION = null;
    private static final io.netty.handler.codec.http2.Http2Exception DECODE_ULE_128_TO_LONG_DECOMPRESSION_EXCEPTION = null;
    private static final io.netty.handler.codec.http2.Http2Exception INDEX_HEADER_ILLEGAL_INDEX_VALUE = null;
    private static final io.netty.handler.codec.http2.Http2Exception INVALID_MAX_DYNAMIC_TABLE_SIZE = null;
    private static final io.netty.handler.codec.http2.Http2Exception MAX_DYNAMIC_TABLE_SIZE_CHANGE_REQUIRED = null;
    private static final byte READ_HEADER_REPRESENTATION = 0;
    private static final byte READ_INDEXED_HEADER = 2;
    private static final byte READ_INDEXED_HEADER_NAME = 3;
    private static final byte READ_LITERAL_HEADER_NAME = 6;
    private static final byte READ_LITERAL_HEADER_NAME_LENGTH = 5;
    private static final byte READ_LITERAL_HEADER_NAME_LENGTH_PREFIX = 4;
    private static final byte READ_LITERAL_HEADER_VALUE = 9;
    private static final byte READ_LITERAL_HEADER_VALUE_LENGTH = 8;
    private static final byte READ_LITERAL_HEADER_VALUE_LENGTH_PREFIX = 7;
    private static final byte READ_MAX_DYNAMIC_TABLE_SIZE = 1;
    private static final io.netty.handler.codec.http2.Http2Exception READ_NAME_ILLEGAL_INDEX_VALUE = null;
    private long encoderMaxDynamicTableSize;
    private final io.netty.handler.codec.http2.HpackDynamicTable hpackDynamicTable;
    private final io.netty.handler.codec.http2.HpackHuffmanDecoder huffmanDecoder;
    private long maxDynamicTableSize;
    private boolean maxDynamicTableSizeChangeRequired;
    private long maxHeaderListSize;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.http2.HpackDecoder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$http2$HpackUtil$IndexType = null;

        static {
                io.netty.handler.codec.http2.HpackUtil$IndexType[] r0 = io.netty.handler.codec.http2.HpackUtil.IndexType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.codec.http2.HpackDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http2$HpackUtil$IndexType = r0
                io.netty.handler.codec.http2.HpackUtil$IndexType r1 = io.netty.handler.codec.http2.HpackUtil.IndexType.NONE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.handler.codec.http2.HpackDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http2$HpackUtil$IndexType     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.codec.http2.HpackUtil$IndexType r1 = io.netty.handler.codec.http2.HpackUtil.IndexType.NEVER     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.netty.handler.codec.http2.HpackDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http2$HpackUtil$IndexType     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.handler.codec.http2.HpackUtil$IndexType r1 = io.netty.handler.codec.http2.HpackUtil.IndexType.INCREMENTAL     // Catch: java.lang.NoSuchFieldError -> L28
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
    private enum HeaderType extends java.lang.Enum<io.netty.handler.codec.http2.HpackDecoder.HeaderType> {
        private static final /* synthetic */ io.netty.handler.codec.http2.HpackDecoder.HeaderType[] $VALUES = null;
        public static final io.netty.handler.codec.http2.HpackDecoder.HeaderType REGULAR_HEADER = null;
        public static final io.netty.handler.codec.http2.HpackDecoder.HeaderType REQUEST_PSEUDO_HEADER = null;
        public static final io.netty.handler.codec.http2.HpackDecoder.HeaderType RESPONSE_PSEUDO_HEADER = null;

        static {
                io.netty.handler.codec.http2.HpackDecoder$HeaderType r0 = new io.netty.handler.codec.http2.HpackDecoder$HeaderType
                java.lang.String r1 = "REGULAR_HEADER"
                r2 = 0
                r0.<init>(r1, r2)
                io.netty.handler.codec.http2.HpackDecoder.HeaderType.REGULAR_HEADER = r0
                io.netty.handler.codec.http2.HpackDecoder$HeaderType r1 = new io.netty.handler.codec.http2.HpackDecoder$HeaderType
                java.lang.String r3 = "REQUEST_PSEUDO_HEADER"
                r4 = 1
                r1.<init>(r3, r4)
                io.netty.handler.codec.http2.HpackDecoder.HeaderType.REQUEST_PSEUDO_HEADER = r1
                io.netty.handler.codec.http2.HpackDecoder$HeaderType r3 = new io.netty.handler.codec.http2.HpackDecoder$HeaderType
                java.lang.String r5 = "RESPONSE_PSEUDO_HEADER"
                r6 = 2
                r3.<init>(r5, r6)
                io.netty.handler.codec.http2.HpackDecoder.HeaderType.RESPONSE_PSEUDO_HEADER = r3
                r5 = 3
                io.netty.handler.codec.http2.HpackDecoder$HeaderType[] r5 = new io.netty.handler.codec.http2.HpackDecoder.HeaderType[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                io.netty.handler.codec.http2.HpackDecoder.HeaderType.$VALUES = r5
                return
        }

        HeaderType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.netty.handler.codec.http2.HpackDecoder.HeaderType valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.codec.http2.HpackDecoder$HeaderType> r0 = io.netty.handler.codec.http2.HpackDecoder.HeaderType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.codec.http2.HpackDecoder$HeaderType r1 = (io.netty.handler.codec.http2.HpackDecoder.HeaderType) r1
                return r1
        }

        public static io.netty.handler.codec.http2.HpackDecoder.HeaderType[] values() {
                io.netty.handler.codec.http2.HpackDecoder$HeaderType[] r0 = io.netty.handler.codec.http2.HpackDecoder.HeaderType.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.codec.http2.HpackDecoder$HeaderType[] r0 = (io.netty.handler.codec.http2.HpackDecoder.HeaderType[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class Http2HeadersSink implements io.netty.handler.codec.http2.HpackDecoder.Sink {
        private boolean exceededMaxLength;
        private final io.netty.handler.codec.http2.Http2Headers headers;
        private long headersLength;
        private final long maxHeaderListSize;
        private io.netty.handler.codec.http2.HpackDecoder.HeaderType previousType;
        private final int streamId;
        private final boolean validate;
        private io.netty.handler.codec.http2.Http2Exception validationException;

        Http2HeadersSink(int r1, io.netty.handler.codec.http2.Http2Headers r2, long r3, boolean r5) {
                r0 = this;
                r0.<init>()
                r0.headers = r2
                r0.maxHeaderListSize = r3
                r0.streamId = r1
                r0.validate = r5
                return
        }

        @Override // io.netty.handler.codec.http2.HpackDecoder.Sink
        public void appendToHeaderList(java.lang.CharSequence r7, java.lang.CharSequence r8) {
                r6 = this;
                long r0 = r6.headersLength
                long r2 = io.netty.handler.codec.http2.HpackHeaderField.sizeOf(r7, r8)
                long r0 = r0 + r2
                r6.headersLength = r0
                boolean r2 = r6.exceededMaxLength
                long r3 = r6.maxHeaderListSize
                int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r5 <= 0) goto L13
                r0 = 1
                goto L14
            L13:
                r0 = 0
            L14:
                r0 = r0 | r2
                r6.exceededMaxLength = r0
                if (r0 != 0) goto L36
                io.netty.handler.codec.http2.Http2Exception r0 = r6.validationException
                if (r0 == 0) goto L1e
                goto L36
            L1e:
                boolean r0 = r6.validate
                if (r0 == 0) goto L31
                int r0 = r6.streamId     // Catch: io.netty.handler.codec.http2.Http2Exception -> L2d
                io.netty.handler.codec.http2.HpackDecoder$HeaderType r1 = r6.previousType     // Catch: io.netty.handler.codec.http2.Http2Exception -> L2d
                io.netty.handler.codec.http2.HpackDecoder$HeaderType r0 = io.netty.handler.codec.http2.HpackDecoder.access$000(r0, r7, r1)     // Catch: io.netty.handler.codec.http2.Http2Exception -> L2d
                r6.previousType = r0     // Catch: io.netty.handler.codec.http2.Http2Exception -> L2d
                goto L31
            L2d:
                r7 = move-exception
                r6.validationException = r7
                return
            L31:
                io.netty.handler.codec.http2.Http2Headers r0 = r6.headers
                r0.add(r7, r8)
            L36:
                return
        }

        @Override // io.netty.handler.codec.http2.HpackDecoder.Sink
        public void finish() throws io.netty.handler.codec.http2.Http2Exception {
                r4 = this;
                boolean r0 = r4.exceededMaxLength
                if (r0 == 0) goto Ld
                int r0 = r4.streamId
                long r1 = r4.maxHeaderListSize
                r3 = 1
                io.netty.handler.codec.http2.Http2CodecUtil.headerListSizeExceeded(r0, r1, r3)
                return
            Ld:
                io.netty.handler.codec.http2.Http2Exception r0 = r4.validationException
                if (r0 != 0) goto L12
                return
            L12:
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private interface Sink {
        void appendToHeaderList(java.lang.CharSequence r1, java.lang.CharSequence r2);

        void finish() throws io.netty.handler.codec.http2.Http2Exception;
    }

    static {
            io.netty.handler.codec.http2.Http2Error r0 = io.netty.handler.codec.http2.Http2Error.COMPRESSION_ERROR
            io.netty.handler.codec.http2.Http2Exception$ShutdownHint r1 = io.netty.handler.codec.http2.Http2Exception.ShutdownHint.HARD_SHUTDOWN
            java.lang.String r2 = "HPACK - decompression failure"
            io.netty.handler.codec.http2.Http2Exception r2 = io.netty.handler.codec.http2.Http2Exception.newStatic(r0, r2, r1)
            java.lang.Class<io.netty.handler.codec.http2.HpackDecoder> r3 = io.netty.handler.codec.http2.HpackDecoder.class
            java.lang.String r4 = "decodeULE128(..)"
            java.lang.Throwable r2 = io.netty.util.internal.ThrowableUtil.unknownStackTrace(r2, r3, r4)
            io.netty.handler.codec.http2.Http2Exception r2 = (io.netty.handler.codec.http2.Http2Exception) r2
            io.netty.handler.codec.http2.HpackDecoder.DECODE_ULE_128_DECOMPRESSION_EXCEPTION = r2
            java.lang.String r2 = "HPACK - long overflow"
            io.netty.handler.codec.http2.Http2Exception r2 = io.netty.handler.codec.http2.Http2Exception.newStatic(r0, r2, r1)
            java.lang.Throwable r2 = io.netty.util.internal.ThrowableUtil.unknownStackTrace(r2, r3, r4)
            io.netty.handler.codec.http2.Http2Exception r2 = (io.netty.handler.codec.http2.Http2Exception) r2
            io.netty.handler.codec.http2.HpackDecoder.DECODE_ULE_128_TO_LONG_DECOMPRESSION_EXCEPTION = r2
            java.lang.String r2 = "HPACK - int overflow"
            io.netty.handler.codec.http2.Http2Exception r2 = io.netty.handler.codec.http2.Http2Exception.newStatic(r0, r2, r1)
            java.lang.String r4 = "decodeULE128ToInt(..)"
            java.lang.Throwable r2 = io.netty.util.internal.ThrowableUtil.unknownStackTrace(r2, r3, r4)
            io.netty.handler.codec.http2.Http2Exception r2 = (io.netty.handler.codec.http2.Http2Exception) r2
            io.netty.handler.codec.http2.HpackDecoder.DECODE_ULE_128_TO_INT_DECOMPRESSION_EXCEPTION = r2
            java.lang.String r2 = "HPACK - illegal index value"
            io.netty.handler.codec.http2.Http2Exception r4 = io.netty.handler.codec.http2.Http2Exception.newStatic(r0, r2, r1)
            java.lang.String r5 = "decode(..)"
            java.lang.Throwable r4 = io.netty.util.internal.ThrowableUtil.unknownStackTrace(r4, r3, r5)
            io.netty.handler.codec.http2.Http2Exception r4 = (io.netty.handler.codec.http2.Http2Exception) r4
            io.netty.handler.codec.http2.HpackDecoder.DECODE_ILLEGAL_INDEX_VALUE = r4
            io.netty.handler.codec.http2.Http2Exception r4 = io.netty.handler.codec.http2.Http2Exception.newStatic(r0, r2, r1)
            java.lang.String r6 = "indexHeader(..)"
            java.lang.Throwable r4 = io.netty.util.internal.ThrowableUtil.unknownStackTrace(r4, r3, r6)
            io.netty.handler.codec.http2.Http2Exception r4 = (io.netty.handler.codec.http2.Http2Exception) r4
            io.netty.handler.codec.http2.HpackDecoder.INDEX_HEADER_ILLEGAL_INDEX_VALUE = r4
            io.netty.handler.codec.http2.Http2Exception r2 = io.netty.handler.codec.http2.Http2Exception.newStatic(r0, r2, r1)
            java.lang.String r4 = "readName(..)"
            java.lang.Throwable r2 = io.netty.util.internal.ThrowableUtil.unknownStackTrace(r2, r3, r4)
            io.netty.handler.codec.http2.Http2Exception r2 = (io.netty.handler.codec.http2.Http2Exception) r2
            io.netty.handler.codec.http2.HpackDecoder.READ_NAME_ILLEGAL_INDEX_VALUE = r2
            java.lang.String r2 = "HPACK - invalid max dynamic table size"
            io.netty.handler.codec.http2.Http2Exception r2 = io.netty.handler.codec.http2.Http2Exception.newStatic(r0, r2, r1)
            java.lang.String r4 = "setDynamicTableSize(..)"
            java.lang.Throwable r2 = io.netty.util.internal.ThrowableUtil.unknownStackTrace(r2, r3, r4)
            io.netty.handler.codec.http2.Http2Exception r2 = (io.netty.handler.codec.http2.Http2Exception) r2
            io.netty.handler.codec.http2.HpackDecoder.INVALID_MAX_DYNAMIC_TABLE_SIZE = r2
            java.lang.String r2 = "HPACK - max dynamic table size change required"
            io.netty.handler.codec.http2.Http2Exception r0 = io.netty.handler.codec.http2.Http2Exception.newStatic(r0, r2, r1)
            java.lang.Throwable r0 = io.netty.util.internal.ThrowableUtil.unknownStackTrace(r0, r3, r5)
            io.netty.handler.codec.http2.Http2Exception r0 = (io.netty.handler.codec.http2.Http2Exception) r0
            io.netty.handler.codec.http2.HpackDecoder.MAX_DYNAMIC_TABLE_SIZE_CHANGE_REQUIRED = r0
            return
    }

    HpackDecoder(long r2) {
            r1 = this;
            r0 = 4096(0x1000, float:5.74E-42)
            r1.<init>(r2, r0)
            return
    }

    HpackDecoder(long r2, int r4) {
            r1 = this;
            r1.<init>()
            io.netty.handler.codec.http2.HpackHuffmanDecoder r0 = new io.netty.handler.codec.http2.HpackHuffmanDecoder
            r0.<init>()
            r1.huffmanDecoder = r0
            java.lang.String r0 = "maxHeaderListSize"
            long r2 = io.netty.util.internal.ObjectUtil.checkPositive(r2, r0)
            r1.maxHeaderListSize = r2
            long r2 = (long) r4
            r1.encoderMaxDynamicTableSize = r2
            r1.maxDynamicTableSize = r2
            r4 = 0
            r1.maxDynamicTableSizeChangeRequired = r4
            io.netty.handler.codec.http2.HpackDynamicTable r4 = new io.netty.handler.codec.http2.HpackDynamicTable
            r4.<init>(r2)
            r1.hpackDynamicTable = r4
            return
    }

    static /* synthetic */ io.netty.handler.codec.http2.HpackDecoder.HeaderType access$000(int r0, java.lang.CharSequence r1, io.netty.handler.codec.http2.HpackDecoder.HeaderType r2) throws io.netty.handler.codec.http2.Http2Exception {
            io.netty.handler.codec.http2.HpackDecoder$HeaderType r0 = validate(r0, r1, r2)
            return r0
    }

    private void decode(io.netty.buffer.ByteBuf r17, io.netty.handler.codec.http2.HpackDecoder.Sink r18) throws io.netty.handler.codec.http2.Http2Exception {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            io.netty.handler.codec.http2.HpackUtil$IndexType r3 = io.netty.handler.codec.http2.HpackUtil.IndexType.NONE
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
        Lf:
            boolean r11 = r1.isReadable()
            if (r11 == 0) goto L13d
            r12 = 9
            r13 = 1
            r14 = 7
            r15 = 128(0x80, float:1.8E-43)
            r11 = 127(0x7f, float:1.78E-43)
            switch(r6) {
                case 0: goto Lbf;
                case 1: goto Lb6;
                case 2: goto La6;
                case 3: goto L99;
                case 4: goto L85;
                case 5: goto L7f;
                case 6: goto L6e;
                case 7: goto L52;
                case 8: goto L4b;
                case 9: goto L37;
                default: goto L20;
            }
        L20:
            java.lang.Error r1 = new java.lang.Error
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "should not reach here state: "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L37:
            int r6 = r1.readableBytes()
            if (r6 < r9) goto L46
            java.lang.CharSequence r6 = r0.readStringLiteral(r1, r9, r10)
            r0.insertHeader(r2, r5, r6, r3)
        L44:
            r6 = 0
            goto Lf
        L46:
            java.lang.IllegalArgumentException r1 = notEnoughDataException(r1)
            throw r1
        L4b:
            int r9 = decodeULE128(r1, r7)
        L4f:
            r6 = 9
            goto Lf
        L52:
            byte r6 = r1.readByte()
            r7 = r6 & 128(0x80, float:1.8E-43)
            if (r7 != r15) goto L5c
            r10 = 1
            goto L5d
        L5c:
            r10 = 0
        L5d:
            r7 = r6 & 127(0x7f, float:1.78E-43)
            if (r7 == 0) goto L68
            if (r7 == r11) goto L65
            r9 = r7
            goto L4f
        L65:
            r6 = 8
            goto Lf
        L68:
            io.netty.util.AsciiString r6 = io.netty.util.AsciiString.EMPTY_STRING
            r0.insertHeader(r2, r5, r6, r3)
            goto L44
        L6e:
            int r5 = r1.readableBytes()
            if (r5 < r8) goto L7a
            java.lang.CharSequence r5 = r0.readStringLiteral(r1, r8, r10)
        L78:
            r6 = 7
            goto Lf
        L7a:
            java.lang.IllegalArgumentException r1 = notEnoughDataException(r1)
            throw r1
        L7f:
            int r8 = decodeULE128(r1, r7)
        L83:
            r6 = 6
            goto Lf
        L85:
            byte r6 = r1.readByte()
            r7 = r6 & 128(0x80, float:1.8E-43)
            if (r7 != r15) goto L8f
            r10 = 1
            goto L90
        L8f:
            r10 = 0
        L90:
            r7 = r6 & 127(0x7f, float:1.78E-43)
            if (r7 != r11) goto L97
            r6 = 5
            goto Lf
        L97:
            r8 = r7
            goto L83
        L99:
            int r5 = decodeULE128(r1, r7)
            java.lang.CharSequence r5 = r0.readName(r5)
            int r8 = r5.length()
            goto L78
        La6:
            int r6 = decodeULE128(r1, r7)
            io.netty.handler.codec.http2.HpackHeaderField r6 = r0.getIndexedHeader(r6)
            java.lang.CharSequence r11 = r6.name
            java.lang.CharSequence r6 = r6.value
            r2.appendToHeaderList(r11, r6)
            goto L44
        Lb6:
            long r11 = (long) r7
            long r11 = decodeULE128(r1, r11)
            r0.setDynamicTableSize(r11)
            goto L44
        Lbf:
            byte r7 = r1.readByte()
            boolean r12 = r0.maxDynamicTableSizeChangeRequired
            r15 = 32
            if (r12 == 0) goto Ld1
            r12 = r7 & 224(0xe0, float:3.14E-43)
            if (r12 != r15) goto Lce
            goto Ld1
        Lce:
            io.netty.handler.codec.http2.Http2Exception r1 = io.netty.handler.codec.http2.HpackDecoder.MAX_DYNAMIC_TABLE_SIZE_CHANGE_REQUIRED
            throw r1
        Ld1:
            if (r7 >= 0) goto Lec
            r7 = r7 & 127(0x7f, float:1.78E-43)
            if (r7 == 0) goto Le9
            if (r7 == r11) goto Le6
            io.netty.handler.codec.http2.HpackHeaderField r11 = r0.getIndexedHeader(r7)
            java.lang.CharSequence r12 = r11.name
            java.lang.CharSequence r11 = r11.value
            r2.appendToHeaderList(r12, r11)
            goto Lf
        Le6:
            r6 = 2
            goto Lf
        Le9:
            io.netty.handler.codec.http2.Http2Exception r1 = io.netty.handler.codec.http2.HpackDecoder.DECODE_ILLEGAL_INDEX_VALUE
            throw r1
        Lec:
            r6 = r7 & 64
            r12 = 3
            r11 = 64
            if (r6 != r11) goto L10d
            io.netty.handler.codec.http2.HpackUtil$IndexType r3 = io.netty.handler.codec.http2.HpackUtil.IndexType.INCREMENTAL
            r7 = r7 & 63
            if (r7 == 0) goto L10a
            r6 = 63
            if (r7 == r6) goto L107
            java.lang.CharSequence r5 = r0.readName(r7)
            int r8 = r5.length()
            goto L78
        L107:
            r6 = 3
            goto Lf
        L10a:
            r6 = 4
            goto Lf
        L10d:
            r6 = r7 & 32
            if (r6 != r15) goto L120
            r7 = r7 & 31
            r6 = 31
            if (r7 != r6) goto L11a
            r6 = 1
            goto Lf
        L11a:
            long r11 = (long) r7
            r0.setDynamicTableSize(r11)
            goto L44
        L120:
            r3 = r7 & 16
            r6 = 16
            if (r3 != r6) goto L129
            io.netty.handler.codec.http2.HpackUtil$IndexType r3 = io.netty.handler.codec.http2.HpackUtil.IndexType.NEVER
            goto L12b
        L129:
            io.netty.handler.codec.http2.HpackUtil$IndexType r3 = io.netty.handler.codec.http2.HpackUtil.IndexType.NONE
        L12b:
            r7 = r7 & 15
            if (r7 == 0) goto L10a
            r6 = 15
            if (r7 == r6) goto L107
            java.lang.CharSequence r5 = r0.readName(r7)
            int r8 = r5.length()
            goto L78
        L13d:
            if (r6 != 0) goto L140
            return
        L140:
            io.netty.handler.codec.http2.Http2Error r1 = io.netty.handler.codec.http2.Http2Error.COMPRESSION_ERROR
            java.lang.String r2 = "Incomplete header block fragment."
            java.lang.Object[] r3 = new java.lang.Object[r4]
            io.netty.handler.codec.http2.Http2Exception r1 = io.netty.handler.codec.http2.Http2Exception.connectionError(r1, r2, r3)
            throw r1
    }

    static int decodeULE128(io.netty.buffer.ByteBuf r5, int r6) throws io.netty.handler.codec.http2.Http2Exception {
            int r0 = r5.readerIndex()
            long r1 = (long) r6
            long r1 = decodeULE128(r5, r1)
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 > 0) goto L12
            int r5 = (int) r1
            return r5
        L12:
            r5.readerIndex(r0)
            io.netty.handler.codec.http2.Http2Exception r5 = io.netty.handler.codec.http2.HpackDecoder.DECODE_ULE_128_TO_INT_DECOMPRESSION_EXCEPTION
            throw r5
    }

    static long decodeULE128(io.netty.buffer.ByteBuf r9, long r10) throws io.netty.handler.codec.http2.Http2Exception {
            r0 = 0
            r2 = 0
            r3 = 1
            int r4 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r4 != 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            int r1 = r9.writerIndex()
            int r4 = r9.readerIndex()
        L13:
            if (r4 >= r1) goto L43
            byte r5 = r9.getByte(r4)
            r6 = 56
            if (r2 != r6) goto L2b
            r6 = r5 & 128(0x80, float:1.8E-43)
            if (r6 != 0) goto L28
            r6 = 127(0x7f, float:1.78E-43)
            if (r5 != r6) goto L2b
            if (r0 == 0) goto L28
            goto L2b
        L28:
            io.netty.handler.codec.http2.Http2Exception r9 = io.netty.handler.codec.http2.HpackDecoder.DECODE_ULE_128_TO_LONG_DECOMPRESSION_EXCEPTION
            throw r9
        L2b:
            r6 = r5 & 128(0x80, float:1.8E-43)
            r7 = 127(0x7f, double:6.27E-322)
            if (r6 != 0) goto L3a
            int r4 = r4 + r3
            r9.readerIndex(r4)
            long r0 = (long) r5
            long r0 = r0 & r7
            long r0 = r0 << r2
            long r10 = r10 + r0
            return r10
        L3a:
            long r5 = (long) r5
            long r5 = r5 & r7
            long r5 = r5 << r2
            long r10 = r10 + r5
            int r4 = r4 + 1
            int r2 = r2 + 7
            goto L13
        L43:
            io.netty.handler.codec.http2.Http2Exception r9 = io.netty.handler.codec.http2.HpackDecoder.DECODE_ULE_128_DECOMPRESSION_EXCEPTION
            throw r9
    }

    private io.netty.handler.codec.http2.HpackHeaderField getIndexedHeader(int r4) throws io.netty.handler.codec.http2.Http2Exception {
            r3 = this;
            int r0 = io.netty.handler.codec.http2.HpackStaticTable.length
            if (r4 > r0) goto L9
            io.netty.handler.codec.http2.HpackHeaderField r4 = io.netty.handler.codec.http2.HpackStaticTable.getEntry(r4)
            return r4
        L9:
            int r1 = r4 - r0
            io.netty.handler.codec.http2.HpackDynamicTable r2 = r3.hpackDynamicTable
            int r2 = r2.length()
            if (r1 > r2) goto L1b
            io.netty.handler.codec.http2.HpackDynamicTable r1 = r3.hpackDynamicTable
            int r4 = r4 - r0
            io.netty.handler.codec.http2.HpackHeaderField r4 = r1.getEntry(r4)
            return r4
        L1b:
            io.netty.handler.codec.http2.Http2Exception r4 = io.netty.handler.codec.http2.HpackDecoder.INDEX_HEADER_ILLEGAL_INDEX_VALUE
            throw r4
    }

    private void insertHeader(io.netty.handler.codec.http2.HpackDecoder.Sink r1, java.lang.CharSequence r2, java.lang.CharSequence r3, io.netty.handler.codec.http2.HpackUtil.IndexType r4) {
            r0 = this;
            r1.appendToHeaderList(r2, r3)
            int[] r1 = io.netty.handler.codec.http2.HpackDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http2$HpackUtil$IndexType
            int r4 = r4.ordinal()
            r1 = r1[r4]
            r4 = 1
            if (r1 == r4) goto L27
            r4 = 2
            if (r1 == r4) goto L27
            r4 = 3
            if (r1 != r4) goto L1f
            io.netty.handler.codec.http2.HpackDynamicTable r1 = r0.hpackDynamicTable
            io.netty.handler.codec.http2.HpackHeaderField r4 = new io.netty.handler.codec.http2.HpackHeaderField
            r4.<init>(r2, r3)
            r1.add(r4)
            return
        L1f:
            java.lang.Error r1 = new java.lang.Error
            java.lang.String r2 = "should not reach here"
            r1.<init>(r2)
            throw r1
        L27:
            return
    }

    private static java.lang.IllegalArgumentException notEnoughDataException(io.netty.buffer.ByteBuf r3) {
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "decode only works with an entire header block! "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            return r0
    }

    private java.lang.CharSequence readName(int r4) throws io.netty.handler.codec.http2.Http2Exception {
            r3 = this;
            int r0 = io.netty.handler.codec.http2.HpackStaticTable.length
            if (r4 > r0) goto Lb
            io.netty.handler.codec.http2.HpackHeaderField r4 = io.netty.handler.codec.http2.HpackStaticTable.getEntry(r4)
            java.lang.CharSequence r4 = r4.name
            return r4
        Lb:
            int r1 = r4 - r0
            io.netty.handler.codec.http2.HpackDynamicTable r2 = r3.hpackDynamicTable
            int r2 = r2.length()
            if (r1 > r2) goto L1f
            io.netty.handler.codec.http2.HpackDynamicTable r1 = r3.hpackDynamicTable
            int r4 = r4 - r0
            io.netty.handler.codec.http2.HpackHeaderField r4 = r1.getEntry(r4)
            java.lang.CharSequence r4 = r4.name
            return r4
        L1f:
            io.netty.handler.codec.http2.Http2Exception r4 = io.netty.handler.codec.http2.HpackDecoder.READ_NAME_ILLEGAL_INDEX_VALUE
            throw r4
    }

    private java.lang.CharSequence readStringLiteral(io.netty.buffer.ByteBuf r1, int r2, boolean r3) throws io.netty.handler.codec.http2.Http2Exception {
            r0 = this;
            if (r3 == 0) goto L9
            io.netty.handler.codec.http2.HpackHuffmanDecoder r3 = r0.huffmanDecoder
            io.netty.util.AsciiString r1 = r3.decode(r1, r2)
            return r1
        L9:
            byte[] r2 = new byte[r2]
            r1.readBytes(r2)
            io.netty.util.AsciiString r1 = new io.netty.util.AsciiString
            r3 = 0
            r1.<init>(r2, r3)
            return r1
    }

    private void setDynamicTableSize(long r4) throws io.netty.handler.codec.http2.Http2Exception {
            r3 = this;
            long r0 = r3.maxDynamicTableSize
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L11
            r3.encoderMaxDynamicTableSize = r4
            r0 = 0
            r3.maxDynamicTableSizeChangeRequired = r0
            io.netty.handler.codec.http2.HpackDynamicTable r0 = r3.hpackDynamicTable
            r0.setCapacity(r4)
            return
        L11:
            io.netty.handler.codec.http2.Http2Exception r4 = io.netty.handler.codec.http2.HpackDecoder.INVALID_MAX_DYNAMIC_TABLE_SIZE
            throw r4
    }

    private static io.netty.handler.codec.http2.HpackDecoder.HeaderType validate(int r3, java.lang.CharSequence r4, io.netty.handler.codec.http2.HpackDecoder.HeaderType r5) throws io.netty.handler.codec.http2.Http2Exception {
            boolean r0 = io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName.hasPseudoHeaderFormat(r4)
            if (r0 == 0) goto L48
            io.netty.handler.codec.http2.HpackDecoder$HeaderType r0 = io.netty.handler.codec.http2.HpackDecoder.HeaderType.REGULAR_HEADER
            r1 = 1
            r2 = 0
            if (r5 == r0) goto L3b
            io.netty.handler.codec.http2.Http2Headers$PseudoHeaderName r0 = io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName.getPseudoHeader(r4)
            if (r0 == 0) goto L2e
            boolean r4 = r0.isRequestOnly()
            if (r4 == 0) goto L1b
            io.netty.handler.codec.http2.HpackDecoder$HeaderType r4 = io.netty.handler.codec.http2.HpackDecoder.HeaderType.REQUEST_PSEUDO_HEADER
            goto L1d
        L1b:
            io.netty.handler.codec.http2.HpackDecoder$HeaderType r4 = io.netty.handler.codec.http2.HpackDecoder.HeaderType.RESPONSE_PSEUDO_HEADER
        L1d:
            if (r5 == 0) goto L2d
            if (r4 != r5) goto L22
            goto L2d
        L22:
            io.netty.handler.codec.http2.Http2Error r4 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
            java.lang.String r5 = "Mix of request and response pseudo-headers."
            java.lang.Object[] r0 = new java.lang.Object[r2]
            io.netty.handler.codec.http2.Http2Exception r3 = io.netty.handler.codec.http2.Http2Exception.streamError(r3, r4, r5, r0)
            throw r3
        L2d:
            return r4
        L2e:
            io.netty.handler.codec.http2.Http2Error r5 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r0[r2] = r4
            java.lang.String r4 = "Invalid HTTP/2 pseudo-header '%s' encountered."
            io.netty.handler.codec.http2.Http2Exception r3 = io.netty.handler.codec.http2.Http2Exception.streamError(r3, r5, r4, r0)
            throw r3
        L3b:
            io.netty.handler.codec.http2.Http2Error r5 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r0[r2] = r4
            java.lang.String r4 = "Pseudo-header field '%s' found after regular header."
            io.netty.handler.codec.http2.Http2Exception r3 = io.netty.handler.codec.http2.Http2Exception.streamError(r3, r5, r4, r0)
            throw r3
        L48:
            io.netty.handler.codec.http2.HpackDecoder$HeaderType r3 = io.netty.handler.codec.http2.HpackDecoder.HeaderType.REGULAR_HEADER
            return r3
    }

    public void decode(int r7, io.netty.buffer.ByteBuf r8, io.netty.handler.codec.http2.Http2Headers r9, boolean r10) throws io.netty.handler.codec.http2.Http2Exception {
            r6 = this;
            io.netty.handler.codec.http2.HpackDecoder$Http2HeadersSink r0 = new io.netty.handler.codec.http2.HpackDecoder$Http2HeadersSink
            long r3 = r6.maxHeaderListSize
            r1 = r7
            r2 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r5)
            r6.decode(r8, r0)
            r0.finish()
            return
    }

    io.netty.handler.codec.http2.HpackHeaderField getHeaderField(int r2) {
            r1 = this;
            io.netty.handler.codec.http2.HpackDynamicTable r0 = r1.hpackDynamicTable
            int r2 = r2 + 1
            io.netty.handler.codec.http2.HpackHeaderField r2 = r0.getEntry(r2)
            return r2
    }

    public long getMaxHeaderListSize() {
            r2 = this;
            long r0 = r2.maxHeaderListSize
            return r0
    }

    public long getMaxHeaderTableSize() {
            r2 = this;
            io.netty.handler.codec.http2.HpackDynamicTable r0 = r2.hpackDynamicTable
            long r0 = r0.capacity()
            return r0
    }

    int length() {
            r1 = this;
            io.netty.handler.codec.http2.HpackDynamicTable r0 = r1.hpackDynamicTable
            int r0 = r0.length()
            return r0
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

    @java.lang.Deprecated
    public void setMaxHeaderListSize(long r1, long r3) throws io.netty.handler.codec.http2.Http2Exception {
            r0 = this;
            r0.setMaxHeaderListSize(r1)
            return
    }

    public void setMaxHeaderTableSize(long r7) throws io.netty.handler.codec.http2.Http2Exception {
            r6 = this;
            r0 = 1
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r3 = 0
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 < 0) goto L20
            int r5 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r5 > 0) goto L20
            r6.maxDynamicTableSize = r7
            long r1 = r6.encoderMaxDynamicTableSize
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 >= 0) goto L1f
            r6.maxDynamicTableSizeChangeRequired = r0
            io.netty.handler.codec.http2.HpackDynamicTable r0 = r6.hpackDynamicTable
            r0.setCapacity(r7)
        L1f:
            return
        L20:
            io.netty.handler.codec.http2.Http2Error r5 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r2 = 0
            r8[r2] = r3
            r8[r0] = r1
            r0 = 2
            r8[r0] = r7
            java.lang.String r7 = "Header Table Size must be >= %d and <= %d but was %d"
            io.netty.handler.codec.http2.Http2Exception r7 = io.netty.handler.codec.http2.Http2Exception.connectionError(r5, r7, r8)
            throw r7
    }

    long size() {
            r2 = this;
            io.netty.handler.codec.http2.HpackDynamicTable r0 = r2.hpackDynamicTable
            long r0 = r0.size()
            return r0
    }
}
