package io.netty.handler.codec.spdy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class SpdyHeaderBlockRawDecoder extends io.netty.handler.codec.spdy.SpdyHeaderBlockDecoder {
    private static final int LENGTH_FIELD_SIZE = 4;
    private io.netty.buffer.ByteBuf cumulation;
    private int headerSize;
    private int length;
    private final int maxHeaderSize;
    private java.lang.String name;
    private int numHeaders;
    private io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State state;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$spdy$SpdyHeaderBlockRawDecoder$State = null;

        static {
                io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State[] r0 = io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$spdy$SpdyHeaderBlockRawDecoder$State = r0
                io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State r1 = io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State.READ_NUM_HEADERS     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$spdy$SpdyHeaderBlockRawDecoder$State     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State r1 = io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State.READ_NAME_LENGTH     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$spdy$SpdyHeaderBlockRawDecoder$State     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State r1 = io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State.READ_NAME     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$spdy$SpdyHeaderBlockRawDecoder$State     // Catch: java.lang.NoSuchFieldError -> L33
                io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State r1 = io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State.SKIP_NAME     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$spdy$SpdyHeaderBlockRawDecoder$State     // Catch: java.lang.NoSuchFieldError -> L3e
                io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State r1 = io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State.READ_VALUE_LENGTH     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$spdy$SpdyHeaderBlockRawDecoder$State     // Catch: java.lang.NoSuchFieldError -> L49
                io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State r1 = io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State.READ_VALUE     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$spdy$SpdyHeaderBlockRawDecoder$State     // Catch: java.lang.NoSuchFieldError -> L54
                io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State r1 = io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State.SKIP_VALUE     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$spdy$SpdyHeaderBlockRawDecoder$State     // Catch: java.lang.NoSuchFieldError -> L60
                io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State r1 = io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State.END_HEADER_BLOCK     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                int[] r0 = io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$spdy$SpdyHeaderBlockRawDecoder$State     // Catch: java.lang.NoSuchFieldError -> L6c
                io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State r1 = io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State.ERROR     // Catch: java.lang.NoSuchFieldError -> L6c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum State extends java.lang.Enum<io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State> {
        private static final /* synthetic */ io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State[] $VALUES = null;
        public static final io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State END_HEADER_BLOCK = null;
        public static final io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State ERROR = null;
        public static final io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State READ_NAME = null;
        public static final io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State READ_NAME_LENGTH = null;
        public static final io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State READ_NUM_HEADERS = null;
        public static final io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State READ_VALUE = null;
        public static final io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State READ_VALUE_LENGTH = null;
        public static final io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State SKIP_NAME = null;
        public static final io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State SKIP_VALUE = null;

        static {
                io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State r0 = new io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State
                java.lang.String r1 = "READ_NUM_HEADERS"
                r2 = 0
                r0.<init>(r1, r2)
                io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State.READ_NUM_HEADERS = r0
                io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State r1 = new io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State
                java.lang.String r3 = "READ_NAME_LENGTH"
                r4 = 1
                r1.<init>(r3, r4)
                io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State.READ_NAME_LENGTH = r1
                io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State r3 = new io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State
                java.lang.String r5 = "READ_NAME"
                r6 = 2
                r3.<init>(r5, r6)
                io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State.READ_NAME = r3
                io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State r5 = new io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State
                java.lang.String r7 = "SKIP_NAME"
                r8 = 3
                r5.<init>(r7, r8)
                io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State.SKIP_NAME = r5
                io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State r7 = new io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State
                java.lang.String r9 = "READ_VALUE_LENGTH"
                r10 = 4
                r7.<init>(r9, r10)
                io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State.READ_VALUE_LENGTH = r7
                io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State r9 = new io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State
                java.lang.String r11 = "READ_VALUE"
                r12 = 5
                r9.<init>(r11, r12)
                io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State.READ_VALUE = r9
                io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State r11 = new io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State
                java.lang.String r13 = "SKIP_VALUE"
                r14 = 6
                r11.<init>(r13, r14)
                io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State.SKIP_VALUE = r11
                io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State r13 = new io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State
                java.lang.String r15 = "END_HEADER_BLOCK"
                r16 = 0
                r2 = 7
                r13.<init>(r15, r2)
                io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State.END_HEADER_BLOCK = r13
                io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State r15 = new io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State
                r17 = 7
                java.lang.String r2 = "ERROR"
                r18 = 1
                r4 = 8
                r15.<init>(r2, r4)
                io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State.ERROR = r15
                r2 = 9
                io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State[] r2 = new io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State[r2]
                r2[r16] = r0
                r2[r18] = r1
                r2[r6] = r3
                r2[r8] = r5
                r2[r10] = r7
                r2[r12] = r9
                r2[r14] = r11
                r2[r17] = r13
                r2[r4] = r15
                io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State.$VALUES = r2
                return
        }

        State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State> r0 = io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State r1 = (io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State) r1
                return r1
        }

        public static io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State[] values() {
                io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State[] r0 = io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State[] r0 = (io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State[]) r0
                return r0
        }
    }

    public SpdyHeaderBlockRawDecoder(io.netty.handler.codec.spdy.SpdyVersion r1, int r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto Lc
            r0.maxHeaderSize = r2
            io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State r1 = io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State.READ_NUM_HEADERS
            r0.state = r1
            return
        Lc:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "spdyVersion"
            r1.<init>(r2)
            throw r1
    }

    private static int readLengthField(io.netty.buffer.ByteBuf r2) {
            int r0 = r2.readerIndex()
            int r0 = io.netty.handler.codec.spdy.SpdyCodecUtil.getSignedInt(r2, r0)
            r1 = 4
            r2.skipBytes(r1)
            return r0
    }

    private void releaseBuffer() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.cumulation
            if (r0 == 0) goto La
            r0.release()
            r0 = 0
            r1.cumulation = r0
        La:
            return
    }

    @Override // io.netty.handler.codec.spdy.SpdyHeaderBlockDecoder
    void decode(io.netty.buffer.ByteBufAllocator r2, io.netty.buffer.ByteBuf r3, io.netty.handler.codec.spdy.SpdyHeadersFrame r4) throws java.lang.Exception {
            r1 = this;
            if (r3 == 0) goto L41
            if (r4 == 0) goto L39
            io.netty.buffer.ByteBuf r0 = r1.cumulation
            if (r0 != 0) goto L1f
            r1.decodeHeaderBlock(r3, r4)
            boolean r4 = r3.isReadable()
            if (r4 == 0) goto L1e
            int r4 = r3.readableBytes()
            io.netty.buffer.ByteBuf r2 = r2.buffer(r4)
            r1.cumulation = r2
            r2.writeBytes(r3)
        L1e:
            return
        L1f:
            r0.writeBytes(r3)
            io.netty.buffer.ByteBuf r2 = r1.cumulation
            r1.decodeHeaderBlock(r2, r4)
            io.netty.buffer.ByteBuf r2 = r1.cumulation
            boolean r2 = r2.isReadable()
            if (r2 == 0) goto L35
            io.netty.buffer.ByteBuf r2 = r1.cumulation
            r2.discardReadBytes()
            return
        L35:
            r1.releaseBuffer()
            return
        L39:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "frame"
            r2.<init>(r3)
            throw r2
        L41:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "headerBlock"
            r2.<init>(r3)
            throw r2
    }

    protected void decodeHeaderBlock(io.netty.buffer.ByteBuf r9, io.netty.handler.codec.spdy.SpdyHeadersFrame r10) throws java.lang.Exception {
            r8 = this;
        L0:
            boolean r0 = r9.isReadable()
            if (r0 == 0) goto L1d9
            int[] r0 = io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$spdy$SpdyHeaderBlockRawDecoder$State
            io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State r1 = r8.state
            int r1 = r1.ordinal()
            r0 = r0[r1]
            java.lang.String r1 = "UTF-8"
            r2 = 4
            r3 = 0
            switch(r0) {
                case 1: goto L1b3;
                case 2: goto L17a;
                case 3: goto L149;
                case 4: goto L12f;
                case 5: goto Lca;
                case 6: goto L55;
                case 7: goto L2f;
                case 8: goto L27;
                case 9: goto L1f;
                default: goto L17;
            }
        L17:
            java.lang.Error r9 = new java.lang.Error
            java.lang.String r10 = "Shouldn't reach here."
            r9.<init>(r10)
            throw r9
        L1f:
            int r10 = r9.readableBytes()
            r9.skipBytes(r10)
            return
        L27:
            io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State r0 = io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State.ERROR
            r8.state = r0
            r10.setInvalid()
            goto L0
        L2f:
            int r0 = r9.readableBytes()
            int r1 = r8.length
            int r0 = java.lang.Math.min(r0, r1)
            r9.skipBytes(r0)
            int r1 = r8.length
            int r1 = r1 - r0
            r8.length = r1
            if (r1 != 0) goto L0
            int r0 = r8.numHeaders
            int r0 = r0 + (-1)
            r8.numHeaders = r0
            if (r0 != 0) goto L50
            io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State r0 = io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State.END_HEADER_BLOCK
            r8.state = r0
            goto L0
        L50:
            io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State r0 = io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State.READ_NAME_LENGTH
            r8.state = r0
            goto L0
        L55:
            int r0 = r9.readableBytes()
            int r2 = r8.length
            if (r0 >= r2) goto L5f
            goto L1d9
        L5f:
            byte[] r0 = new byte[r2]
            r9.readBytes(r0)
            r4 = 0
            r5 = r0[r4]
            if (r5 != 0) goto L71
            io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State r0 = io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State.ERROR
            r8.state = r0
            r10.setInvalid()
            goto L0
        L71:
            r5 = 0
        L72:
            int r6 = r8.length
            if (r4 >= r6) goto Lac
        L76:
            if (r4 >= r2) goto L7f
            r6 = r0[r4]
            if (r6 == 0) goto L7f
            int r4 = r4 + 1
            goto L76
        L7f:
            if (r4 >= r2) goto L91
            int r6 = r4 + 1
            if (r6 == r2) goto L89
            r6 = r0[r6]
            if (r6 != 0) goto L91
        L89:
            io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State r0 = io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State.ERROR
            r8.state = r0
            r10.setInvalid()
            goto Lac
        L91:
            java.lang.String r6 = new java.lang.String
            int r7 = r4 - r5
            r6.<init>(r0, r5, r7, r1)
            io.netty.handler.codec.spdy.SpdyHeaders r5 = r10.headers()     // Catch: java.lang.IllegalArgumentException -> La5
            java.lang.String r7 = r8.name     // Catch: java.lang.IllegalArgumentException -> La5
            r5.add(r7, r6)     // Catch: java.lang.IllegalArgumentException -> La5
            int r5 = r4 + 1
            r4 = r5
            goto L72
        La5:
            io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State r0 = io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State.ERROR
            r8.state = r0
            r10.setInvalid()
        Lac:
            r8.name = r3
            io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State r0 = r8.state
            io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State r1 = io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State.ERROR
            if (r0 != r1) goto Lb6
            goto L0
        Lb6:
            int r0 = r8.numHeaders
            int r0 = r0 + (-1)
            r8.numHeaders = r0
            if (r0 != 0) goto Lc4
            io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State r0 = io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State.END_HEADER_BLOCK
            r8.state = r0
            goto L0
        Lc4:
            io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State r0 = io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State.READ_NAME_LENGTH
            r8.state = r0
            goto L0
        Lca:
            int r0 = r9.readableBytes()
            if (r0 >= r2) goto Ld2
            goto L1d9
        Ld2:
            int r0 = readLengthField(r9)
            r8.length = r0
            if (r0 >= 0) goto Le3
            io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State r0 = io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State.ERROR
            r8.state = r0
            r10.setInvalid()
            goto L0
        Le3:
            if (r0 != 0) goto L10c
            boolean r0 = r10.isTruncated()
            if (r0 != 0) goto Lf6
            io.netty.handler.codec.spdy.SpdyHeaders r0 = r10.headers()
            java.lang.String r1 = r8.name
            java.lang.String r2 = ""
            r0.add(r1, r2)
        Lf6:
            r8.name = r3
            int r0 = r8.numHeaders
            int r0 = r0 + (-1)
            r8.numHeaders = r0
            if (r0 != 0) goto L106
            io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State r0 = io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State.END_HEADER_BLOCK
            r8.state = r0
            goto L0
        L106:
            io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State r0 = io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State.READ_NAME_LENGTH
            r8.state = r0
            goto L0
        L10c:
            int r1 = r8.maxHeaderSize
            if (r0 > r1) goto L120
            int r2 = r8.headerSize
            int r4 = r1 - r0
            if (r2 <= r4) goto L117
            goto L120
        L117:
            int r2 = r2 + r0
            r8.headerSize = r2
            io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State r0 = io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State.READ_VALUE
            r8.state = r0
            goto L0
        L120:
            int r1 = r1 + 1
            r8.headerSize = r1
            r8.name = r3
            io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State r0 = io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State.SKIP_VALUE
            r8.state = r0
            r10.setTruncated()
            goto L0
        L12f:
            int r0 = r9.readableBytes()
            int r1 = r8.length
            int r0 = java.lang.Math.min(r0, r1)
            r9.skipBytes(r0)
            int r1 = r8.length
            int r1 = r1 - r0
            r8.length = r1
            if (r1 != 0) goto L0
            io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State r0 = io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State.READ_VALUE_LENGTH
            r8.state = r0
            goto L0
        L149:
            int r0 = r9.readableBytes()
            int r2 = r8.length
            if (r0 >= r2) goto L153
            goto L1d9
        L153:
            byte[] r0 = new byte[r2]
            r9.readBytes(r0)
            java.lang.String r2 = new java.lang.String
            r2.<init>(r0, r1)
            r8.name = r2
            io.netty.handler.codec.spdy.SpdyHeaders r0 = r10.headers()
            java.lang.String r1 = r8.name
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L174
            io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State r0 = io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State.ERROR
            r8.state = r0
            r10.setInvalid()
            goto L0
        L174:
            io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State r0 = io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State.READ_VALUE_LENGTH
            r8.state = r0
            goto L0
        L17a:
            int r0 = r9.readableBytes()
            if (r0 >= r2) goto L181
            goto L1d9
        L181:
            int r0 = readLengthField(r9)
            r8.length = r0
            if (r0 > 0) goto L192
            io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State r0 = io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State.ERROR
            r8.state = r0
            r10.setInvalid()
            goto L0
        L192:
            int r1 = r8.maxHeaderSize
            if (r0 > r1) goto L1a6
            int r2 = r8.headerSize
            int r3 = r1 - r0
            if (r2 <= r3) goto L19d
            goto L1a6
        L19d:
            int r2 = r2 + r0
            r8.headerSize = r2
            io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State r0 = io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State.READ_NAME
            r8.state = r0
            goto L0
        L1a6:
            int r1 = r1 + 1
            r8.headerSize = r1
            io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State r0 = io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State.SKIP_NAME
            r8.state = r0
            r10.setTruncated()
            goto L0
        L1b3:
            int r0 = r9.readableBytes()
            if (r0 >= r2) goto L1ba
            goto L1d9
        L1ba:
            int r0 = readLengthField(r9)
            r8.numHeaders = r0
            if (r0 >= 0) goto L1cb
            io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State r0 = io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State.ERROR
            r8.state = r0
            r10.setInvalid()
            goto L0
        L1cb:
            if (r0 != 0) goto L1d3
            io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State r0 = io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State.END_HEADER_BLOCK
            r8.state = r0
            goto L0
        L1d3:
            io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State r0 = io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State.READ_NAME_LENGTH
            r8.state = r0
            goto L0
        L1d9:
            return
    }

    @Override // io.netty.handler.codec.spdy.SpdyHeaderBlockDecoder
    void end() {
            r0 = this;
            r0.releaseBuffer()
            return
    }

    @Override // io.netty.handler.codec.spdy.SpdyHeaderBlockDecoder
    void endHeaderBlock(io.netty.handler.codec.spdy.SpdyHeadersFrame r3) throws java.lang.Exception {
            r2 = this;
            io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State r0 = r2.state
            io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State r1 = io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State.END_HEADER_BLOCK
            if (r0 == r1) goto L9
            r3.setInvalid()
        L9:
            r2.releaseBuffer()
            r3 = 0
            r2.headerSize = r3
            r3 = 0
            r2.name = r3
            io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder$State r3 = io.netty.handler.codec.spdy.SpdyHeaderBlockRawDecoder.State.READ_NUM_HEADERS
            r2.state = r3
            return
    }
}
