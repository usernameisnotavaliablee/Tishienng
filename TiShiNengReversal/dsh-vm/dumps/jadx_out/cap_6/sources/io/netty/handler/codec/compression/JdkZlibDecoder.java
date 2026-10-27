package io.netty.handler.codec.compression;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class JdkZlibDecoder extends io.netty.handler.codec.compression.ZlibDecoder {
    private static final int FCOMMENT = 16;
    private static final int FEXTRA = 4;
    private static final int FHCRC = 2;
    private static final int FNAME = 8;
    private static final int FRESERVED = 224;
    private final io.netty.handler.codec.compression.ByteBufChecksum crc;
    private boolean decideZlibOrNone;
    private final boolean decompressConcatenated;
    private final byte[] dictionary;
    private volatile boolean finished;
    private int flags;
    private io.netty.handler.codec.compression.JdkZlibDecoder.GzipState gzipState;
    private java.util.zip.Inflater inflater;
    private int xlen;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.compression.JdkZlibDecoder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$compression$JdkZlibDecoder$GzipState = null;
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$compression$ZlibWrapper = null;

        static {
                io.netty.handler.codec.compression.JdkZlibDecoder$GzipState[] r0 = io.netty.handler.codec.compression.JdkZlibDecoder.GzipState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.codec.compression.JdkZlibDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$JdkZlibDecoder$GzipState = r0
                r1 = 1
                io.netty.handler.codec.compression.JdkZlibDecoder$GzipState r2 = io.netty.handler.codec.compression.JdkZlibDecoder.GzipState.FOOTER_START     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = io.netty.handler.codec.compression.JdkZlibDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$JdkZlibDecoder$GzipState     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.codec.compression.JdkZlibDecoder$GzipState r3 = io.netty.handler.codec.compression.JdkZlibDecoder.GzipState.HEADER_START     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                r2 = 3
                int[] r3 = io.netty.handler.codec.compression.JdkZlibDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$JdkZlibDecoder$GzipState     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.handler.codec.compression.JdkZlibDecoder$GzipState r4 = io.netty.handler.codec.compression.JdkZlibDecoder.GzipState.FLG_READ     // Catch: java.lang.NoSuchFieldError -> L28
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                r3 = 4
                int[] r4 = io.netty.handler.codec.compression.JdkZlibDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$JdkZlibDecoder$GzipState     // Catch: java.lang.NoSuchFieldError -> L33
                io.netty.handler.codec.compression.JdkZlibDecoder$GzipState r5 = io.netty.handler.codec.compression.JdkZlibDecoder.GzipState.XLEN_READ     // Catch: java.lang.NoSuchFieldError -> L33
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r4[r5] = r3     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r4 = io.netty.handler.codec.compression.JdkZlibDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$JdkZlibDecoder$GzipState     // Catch: java.lang.NoSuchFieldError -> L3e
                io.netty.handler.codec.compression.JdkZlibDecoder$GzipState r5 = io.netty.handler.codec.compression.JdkZlibDecoder.GzipState.SKIP_FNAME     // Catch: java.lang.NoSuchFieldError -> L3e
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r6 = 5
                r4[r5] = r6     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r4 = io.netty.handler.codec.compression.JdkZlibDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$JdkZlibDecoder$GzipState     // Catch: java.lang.NoSuchFieldError -> L49
                io.netty.handler.codec.compression.JdkZlibDecoder$GzipState r5 = io.netty.handler.codec.compression.JdkZlibDecoder.GzipState.SKIP_COMMENT     // Catch: java.lang.NoSuchFieldError -> L49
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r6 = 6
                r4[r5] = r6     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r4 = io.netty.handler.codec.compression.JdkZlibDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$JdkZlibDecoder$GzipState     // Catch: java.lang.NoSuchFieldError -> L54
                io.netty.handler.codec.compression.JdkZlibDecoder$GzipState r5 = io.netty.handler.codec.compression.JdkZlibDecoder.GzipState.PROCESS_FHCRC     // Catch: java.lang.NoSuchFieldError -> L54
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r6 = 7
                r4[r5] = r6     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r4 = io.netty.handler.codec.compression.JdkZlibDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$JdkZlibDecoder$GzipState     // Catch: java.lang.NoSuchFieldError -> L60
                io.netty.handler.codec.compression.JdkZlibDecoder$GzipState r5 = io.netty.handler.codec.compression.JdkZlibDecoder.GzipState.HEADER_END     // Catch: java.lang.NoSuchFieldError -> L60
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r6 = 8
                r4[r5] = r6     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                io.netty.handler.codec.compression.ZlibWrapper[] r4 = io.netty.handler.codec.compression.ZlibWrapper.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                io.netty.handler.codec.compression.JdkZlibDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$ZlibWrapper = r4
                io.netty.handler.codec.compression.ZlibWrapper r5 = io.netty.handler.codec.compression.ZlibWrapper.GZIP     // Catch: java.lang.NoSuchFieldError -> L71
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L71
                r4[r5] = r1     // Catch: java.lang.NoSuchFieldError -> L71
            L71:
                int[] r1 = io.netty.handler.codec.compression.JdkZlibDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$ZlibWrapper     // Catch: java.lang.NoSuchFieldError -> L7b
                io.netty.handler.codec.compression.ZlibWrapper r4 = io.netty.handler.codec.compression.ZlibWrapper.NONE     // Catch: java.lang.NoSuchFieldError -> L7b
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L7b
                r1[r4] = r0     // Catch: java.lang.NoSuchFieldError -> L7b
            L7b:
                int[] r0 = io.netty.handler.codec.compression.JdkZlibDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$ZlibWrapper     // Catch: java.lang.NoSuchFieldError -> L85
                io.netty.handler.codec.compression.ZlibWrapper r1 = io.netty.handler.codec.compression.ZlibWrapper.ZLIB     // Catch: java.lang.NoSuchFieldError -> L85
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L85
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L85
            L85:
                int[] r0 = io.netty.handler.codec.compression.JdkZlibDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$ZlibWrapper     // Catch: java.lang.NoSuchFieldError -> L8f
                io.netty.handler.codec.compression.ZlibWrapper r1 = io.netty.handler.codec.compression.ZlibWrapper.ZLIB_OR_NONE     // Catch: java.lang.NoSuchFieldError -> L8f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L8f
                r0[r1] = r3     // Catch: java.lang.NoSuchFieldError -> L8f
            L8f:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum GzipState extends java.lang.Enum<io.netty.handler.codec.compression.JdkZlibDecoder.GzipState> {
        private static final /* synthetic */ io.netty.handler.codec.compression.JdkZlibDecoder.GzipState[] $VALUES = null;
        public static final io.netty.handler.codec.compression.JdkZlibDecoder.GzipState FLG_READ = null;
        public static final io.netty.handler.codec.compression.JdkZlibDecoder.GzipState FOOTER_START = null;
        public static final io.netty.handler.codec.compression.JdkZlibDecoder.GzipState HEADER_END = null;
        public static final io.netty.handler.codec.compression.JdkZlibDecoder.GzipState HEADER_START = null;
        public static final io.netty.handler.codec.compression.JdkZlibDecoder.GzipState PROCESS_FHCRC = null;
        public static final io.netty.handler.codec.compression.JdkZlibDecoder.GzipState SKIP_COMMENT = null;
        public static final io.netty.handler.codec.compression.JdkZlibDecoder.GzipState SKIP_FNAME = null;
        public static final io.netty.handler.codec.compression.JdkZlibDecoder.GzipState XLEN_READ = null;

        static {
                io.netty.handler.codec.compression.JdkZlibDecoder$GzipState r0 = new io.netty.handler.codec.compression.JdkZlibDecoder$GzipState
                java.lang.String r1 = "HEADER_START"
                r2 = 0
                r0.<init>(r1, r2)
                io.netty.handler.codec.compression.JdkZlibDecoder.GzipState.HEADER_START = r0
                io.netty.handler.codec.compression.JdkZlibDecoder$GzipState r1 = new io.netty.handler.codec.compression.JdkZlibDecoder$GzipState
                java.lang.String r3 = "HEADER_END"
                r4 = 1
                r1.<init>(r3, r4)
                io.netty.handler.codec.compression.JdkZlibDecoder.GzipState.HEADER_END = r1
                io.netty.handler.codec.compression.JdkZlibDecoder$GzipState r3 = new io.netty.handler.codec.compression.JdkZlibDecoder$GzipState
                java.lang.String r5 = "FLG_READ"
                r6 = 2
                r3.<init>(r5, r6)
                io.netty.handler.codec.compression.JdkZlibDecoder.GzipState.FLG_READ = r3
                io.netty.handler.codec.compression.JdkZlibDecoder$GzipState r5 = new io.netty.handler.codec.compression.JdkZlibDecoder$GzipState
                java.lang.String r7 = "XLEN_READ"
                r8 = 3
                r5.<init>(r7, r8)
                io.netty.handler.codec.compression.JdkZlibDecoder.GzipState.XLEN_READ = r5
                io.netty.handler.codec.compression.JdkZlibDecoder$GzipState r7 = new io.netty.handler.codec.compression.JdkZlibDecoder$GzipState
                java.lang.String r9 = "SKIP_FNAME"
                r10 = 4
                r7.<init>(r9, r10)
                io.netty.handler.codec.compression.JdkZlibDecoder.GzipState.SKIP_FNAME = r7
                io.netty.handler.codec.compression.JdkZlibDecoder$GzipState r9 = new io.netty.handler.codec.compression.JdkZlibDecoder$GzipState
                java.lang.String r11 = "SKIP_COMMENT"
                r12 = 5
                r9.<init>(r11, r12)
                io.netty.handler.codec.compression.JdkZlibDecoder.GzipState.SKIP_COMMENT = r9
                io.netty.handler.codec.compression.JdkZlibDecoder$GzipState r11 = new io.netty.handler.codec.compression.JdkZlibDecoder$GzipState
                java.lang.String r13 = "PROCESS_FHCRC"
                r14 = 6
                r11.<init>(r13, r14)
                io.netty.handler.codec.compression.JdkZlibDecoder.GzipState.PROCESS_FHCRC = r11
                io.netty.handler.codec.compression.JdkZlibDecoder$GzipState r13 = new io.netty.handler.codec.compression.JdkZlibDecoder$GzipState
                java.lang.String r15 = "FOOTER_START"
                r16 = 0
                r2 = 7
                r13.<init>(r15, r2)
                io.netty.handler.codec.compression.JdkZlibDecoder.GzipState.FOOTER_START = r13
                r15 = 8
                io.netty.handler.codec.compression.JdkZlibDecoder$GzipState[] r15 = new io.netty.handler.codec.compression.JdkZlibDecoder.GzipState[r15]
                r15[r16] = r0
                r15[r4] = r1
                r15[r6] = r3
                r15[r8] = r5
                r15[r10] = r7
                r15[r12] = r9
                r15[r14] = r11
                r15[r2] = r13
                io.netty.handler.codec.compression.JdkZlibDecoder.GzipState.$VALUES = r15
                return
        }

        GzipState(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.netty.handler.codec.compression.JdkZlibDecoder.GzipState valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.codec.compression.JdkZlibDecoder$GzipState> r0 = io.netty.handler.codec.compression.JdkZlibDecoder.GzipState.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.codec.compression.JdkZlibDecoder$GzipState r1 = (io.netty.handler.codec.compression.JdkZlibDecoder.GzipState) r1
                return r1
        }

        public static io.netty.handler.codec.compression.JdkZlibDecoder.GzipState[] values() {
                io.netty.handler.codec.compression.JdkZlibDecoder$GzipState[] r0 = io.netty.handler.codec.compression.JdkZlibDecoder.GzipState.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.codec.compression.JdkZlibDecoder$GzipState[] r0 = (io.netty.handler.codec.compression.JdkZlibDecoder.GzipState[]) r0
                return r0
        }
    }

    public JdkZlibDecoder() {
            r3 = this;
            io.netty.handler.codec.compression.ZlibWrapper r0 = io.netty.handler.codec.compression.ZlibWrapper.ZLIB
            r1 = 0
            r2 = 0
            r3.<init>(r0, r1, r2)
            return
    }

    public JdkZlibDecoder(io.netty.handler.codec.compression.ZlibWrapper r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r3, r0, r1)
            return
    }

    public JdkZlibDecoder(io.netty.handler.codec.compression.ZlibWrapper r2, boolean r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r3)
            return
    }

    private JdkZlibDecoder(io.netty.handler.codec.compression.ZlibWrapper r4, byte[] r5, boolean r6) {
            r3 = this;
            r3.<init>()
            io.netty.handler.codec.compression.JdkZlibDecoder$GzipState r0 = io.netty.handler.codec.compression.JdkZlibDecoder.GzipState.HEADER_START
            r3.gzipState = r0
            r0 = -1
            r3.flags = r0
            r3.xlen = r0
            if (r4 == 0) goto L6a
            r3.decompressConcatenated = r6
            int[] r6 = io.netty.handler.codec.compression.JdkZlibDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$ZlibWrapper
            int r0 = r4.ordinal()
            r6 = r6[r0]
            r0 = 1
            if (r6 == r0) goto L55
            r1 = 2
            r2 = 0
            if (r6 == r1) goto L4b
            r1 = 3
            if (r6 == r1) goto L41
            r1 = 4
            if (r6 != r1) goto L2a
            r3.decideZlibOrNone = r0
            r3.crc = r2
            goto L67
        L2a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Only GZIP or ZLIB is supported, but you used "
            r6.append(r0)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.<init>(r4)
            throw r5
        L41:
            java.util.zip.Inflater r4 = new java.util.zip.Inflater
            r4.<init>()
            r3.inflater = r4
            r3.crc = r2
            goto L67
        L4b:
            java.util.zip.Inflater r4 = new java.util.zip.Inflater
            r4.<init>(r0)
            r3.inflater = r4
            r3.crc = r2
            goto L67
        L55:
            java.util.zip.Inflater r4 = new java.util.zip.Inflater
            r4.<init>(r0)
            r3.inflater = r4
            java.util.zip.CRC32 r4 = new java.util.zip.CRC32
            r4.<init>()
            io.netty.handler.codec.compression.ByteBufChecksum r4 = io.netty.handler.codec.compression.ByteBufChecksum.wrapChecksum(r4)
            r3.crc = r4
        L67:
            r3.dictionary = r5
            return
        L6a:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "wrapper"
            r4.<init>(r5)
            throw r4
    }

    public JdkZlibDecoder(boolean r3) {
            r2 = this;
            io.netty.handler.codec.compression.ZlibWrapper r0 = io.netty.handler.codec.compression.ZlibWrapper.GZIP
            r1 = 0
            r2.<init>(r0, r1, r3)
            return
    }

    public JdkZlibDecoder(byte[] r3) {
            r2 = this;
            io.netty.handler.codec.compression.ZlibWrapper r0 = io.netty.handler.codec.compression.ZlibWrapper.ZLIB
            r1 = 0
            r2.<init>(r0, r3, r1)
            return
    }

    private static boolean looksLikeZlib(short r2) {
            r0 = r2 & 30720(0x7800, float:4.3048E-41)
            r1 = 30720(0x7800, float:4.3048E-41)
            if (r0 != r1) goto Lc
            int r2 = r2 % 31
            if (r2 != 0) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
    }

    private boolean readGZIPFooter(io.netty.buffer.ByteBuf r5) {
            r4 = this;
            int r0 = r5.readableBytes()
            r1 = 8
            r2 = 0
            if (r0 >= r1) goto La
            return r2
        La:
            r4.verifyCrc(r5)
            r0 = 0
        Le:
            r1 = 4
            if (r2 >= r1) goto L1c
            short r1 = r5.readUnsignedByte()
            int r3 = r2 * 8
            int r1 = r1 << r3
            r0 = r0 | r1
            int r2 = r2 + 1
            goto Le
        L1c:
            java.util.zip.Inflater r5 = r4.inflater
            int r5 = r5.getTotalOut()
            if (r0 != r5) goto L26
            r5 = 1
            return r5
        L26:
            io.netty.handler.codec.compression.DecompressionException r1 = new io.netty.handler.codec.compression.DecompressionException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number of bytes mismatch. Expected: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ", Got: "
            r2.append(r0)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5)
            throw r1
    }

    private boolean readGZIPHeader(io.netty.buffer.ByteBuf r8) {
            r7 = this;
            int[] r0 = io.netty.handler.codec.compression.JdkZlibDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$JdkZlibDecoder$GzipState
            io.netty.handler.codec.compression.JdkZlibDecoder$GzipState r1 = r7.gzipState
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 8
            r3 = 4
            r4 = 0
            switch(r0) {
                case 2: goto L18;
                case 3: goto L75;
                case 4: goto L9e;
                case 5: goto Lc0;
                case 6: goto Le2;
                case 7: goto L105;
                case 8: goto L11d;
                default: goto L12;
            }
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L18:
            int r0 = r8.readableBytes()
            r5 = 10
            if (r0 >= r5) goto L21
            return r4
        L21:
            byte r0 = r8.readByte()
            byte r5 = r8.readByte()
            r6 = 31
            if (r0 != r6) goto L143
            io.netty.handler.codec.compression.ByteBufChecksum r6 = r7.crc
            r6.update(r0)
            io.netty.handler.codec.compression.ByteBufChecksum r0 = r7.crc
            r0.update(r5)
            short r0 = r8.readUnsignedByte()
            if (r0 != r2) goto L127
            io.netty.handler.codec.compression.ByteBufChecksum r5 = r7.crc
            r5.update(r0)
            short r0 = r8.readUnsignedByte()
            r7.flags = r0
            io.netty.handler.codec.compression.ByteBufChecksum r5 = r7.crc
            r5.update(r0)
            int r0 = r7.flags
            r0 = r0 & 224(0xe0, float:3.14E-43)
            if (r0 != 0) goto L11f
            io.netty.handler.codec.compression.ByteBufChecksum r0 = r7.crc
            int r5 = r8.readerIndex()
            r0.update(r8, r5, r3)
            r8.skipBytes(r3)
            io.netty.handler.codec.compression.ByteBufChecksum r0 = r7.crc
            short r5 = r8.readUnsignedByte()
            r0.update(r5)
            io.netty.handler.codec.compression.ByteBufChecksum r0 = r7.crc
            short r5 = r8.readUnsignedByte()
            r0.update(r5)
            io.netty.handler.codec.compression.JdkZlibDecoder$GzipState r0 = io.netty.handler.codec.compression.JdkZlibDecoder.GzipState.FLG_READ
            r7.gzipState = r0
        L75:
            int r0 = r7.flags
            r0 = r0 & r3
            if (r0 == 0) goto L9a
            int r0 = r8.readableBytes()
            if (r0 >= r1) goto L81
            return r4
        L81:
            short r0 = r8.readUnsignedByte()
            short r5 = r8.readUnsignedByte()
            io.netty.handler.codec.compression.ByteBufChecksum r6 = r7.crc
            r6.update(r0)
            io.netty.handler.codec.compression.ByteBufChecksum r6 = r7.crc
            r6.update(r5)
            int r6 = r7.xlen
            int r0 = r0 << r2
            r0 = r0 | r5
            r0 = r0 | r6
            r7.xlen = r0
        L9a:
            io.netty.handler.codec.compression.JdkZlibDecoder$GzipState r0 = io.netty.handler.codec.compression.JdkZlibDecoder.GzipState.XLEN_READ
            r7.gzipState = r0
        L9e:
            int r0 = r7.xlen
            r5 = -1
            if (r0 == r5) goto Lbc
            int r0 = r8.readableBytes()
            int r5 = r7.xlen
            if (r0 >= r5) goto Lac
            return r4
        Lac:
            io.netty.handler.codec.compression.ByteBufChecksum r0 = r7.crc
            int r5 = r8.readerIndex()
            int r6 = r7.xlen
            r0.update(r8, r5, r6)
            int r0 = r7.xlen
            r8.skipBytes(r0)
        Lbc:
            io.netty.handler.codec.compression.JdkZlibDecoder$GzipState r0 = io.netty.handler.codec.compression.JdkZlibDecoder.GzipState.SKIP_FNAME
            r7.gzipState = r0
        Lc0:
            int r0 = r7.flags
            r0 = r0 & r2
            if (r0 == 0) goto Lde
            boolean r0 = r8.isReadable()
            if (r0 != 0) goto Lcc
            return r4
        Lcc:
            short r0 = r8.readUnsignedByte()
            io.netty.handler.codec.compression.ByteBufChecksum r2 = r7.crc
            r2.update(r0)
            if (r0 != 0) goto Ld8
            goto Lde
        Ld8:
            boolean r0 = r8.isReadable()
            if (r0 != 0) goto Lcc
        Lde:
            io.netty.handler.codec.compression.JdkZlibDecoder$GzipState r0 = io.netty.handler.codec.compression.JdkZlibDecoder.GzipState.SKIP_COMMENT
            r7.gzipState = r0
        Le2:
            int r0 = r7.flags
            r0 = r0 & 16
            if (r0 == 0) goto L101
            boolean r0 = r8.isReadable()
            if (r0 != 0) goto Lef
            return r4
        Lef:
            short r0 = r8.readUnsignedByte()
            io.netty.handler.codec.compression.ByteBufChecksum r2 = r7.crc
            r2.update(r0)
            if (r0 != 0) goto Lfb
            goto L101
        Lfb:
            boolean r0 = r8.isReadable()
            if (r0 != 0) goto Lef
        L101:
            io.netty.handler.codec.compression.JdkZlibDecoder$GzipState r0 = io.netty.handler.codec.compression.JdkZlibDecoder.GzipState.PROCESS_FHCRC
            r7.gzipState = r0
        L105:
            int r0 = r7.flags
            r0 = r0 & r1
            if (r0 == 0) goto L114
            int r0 = r8.readableBytes()
            if (r0 >= r3) goto L111
            return r4
        L111:
            r7.verifyCrc(r8)
        L114:
            io.netty.handler.codec.compression.ByteBufChecksum r8 = r7.crc
            r8.reset()
            io.netty.handler.codec.compression.JdkZlibDecoder$GzipState r8 = io.netty.handler.codec.compression.JdkZlibDecoder.GzipState.HEADER_END
            r7.gzipState = r8
        L11d:
            r8 = 1
            return r8
        L11f:
            io.netty.handler.codec.compression.DecompressionException r8 = new io.netty.handler.codec.compression.DecompressionException
            java.lang.String r0 = "Reserved flags are set in the GZIP header"
            r8.<init>(r0)
            throw r8
        L127:
            io.netty.handler.codec.compression.DecompressionException r8 = new io.netty.handler.codec.compression.DecompressionException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unsupported compression method "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = " in the GZIP header"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r8.<init>(r0)
            throw r8
        L143:
            io.netty.handler.codec.compression.DecompressionException r8 = new io.netty.handler.codec.compression.DecompressionException
            java.lang.String r0 = "Input is not in the GZIP format"
            r8.<init>(r0)
            throw r8
    }

    private void verifyCrc(io.netty.buffer.ByteBuf r7) {
            r6 = this;
            r0 = 0
            r2 = 0
        L3:
            r3 = 4
            if (r2 >= r3) goto L12
            short r3 = r7.readUnsignedByte()
            long r3 = (long) r3
            int r5 = r2 * 8
            long r3 = r3 << r5
            long r0 = r0 | r3
            int r2 = r2 + 1
            goto L3
        L12:
            io.netty.handler.codec.compression.ByteBufChecksum r7 = r6.crc
            long r2 = r7.getValue()
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 != 0) goto L1d
            return
        L1d:
            io.netty.handler.codec.compression.DecompressionException r7 = new io.netty.handler.codec.compression.DecompressionException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "CRC value mismatch. Expected: "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = ", Got: "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            r7.<init>(r0)
            throw r7
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder
    protected void decode(io.netty.channel.ChannelHandlerContext r9, io.netty.buffer.ByteBuf r10, java.util.List<java.lang.Object> r11) throws java.lang.Exception {
            r8 = this;
            boolean r0 = r8.finished
            if (r0 == 0) goto Lc
            int r9 = r10.readableBytes()
            r10.skipBytes(r9)
            return
        Lc:
            int r0 = r10.readableBytes()
            if (r0 != 0) goto L13
            goto L5d
        L13:
            boolean r1 = r8.decideZlibOrNone
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L33
            r1 = 2
            if (r0 >= r1) goto L1d
            goto L5d
        L1d:
            int r1 = r10.readerIndex()
            short r1 = r10.getShort(r1)
            boolean r1 = looksLikeZlib(r1)
            r1 = r1 ^ r3
            java.util.zip.Inflater r4 = new java.util.zip.Inflater
            r4.<init>(r1)
            r8.inflater = r4
            r8.decideZlibOrNone = r2
        L33:
            io.netty.handler.codec.compression.ByteBufChecksum r1 = r8.crc
            if (r1 == 0) goto L5e
            int[] r0 = io.netty.handler.codec.compression.JdkZlibDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$JdkZlibDecoder$GzipState
            io.netty.handler.codec.compression.JdkZlibDecoder$GzipState r1 = r8.gzipState
            int r1 = r1.ordinal()
            r0 = r0[r1]
            if (r0 == r3) goto L55
            io.netty.handler.codec.compression.JdkZlibDecoder$GzipState r0 = r8.gzipState
            io.netty.handler.codec.compression.JdkZlibDecoder$GzipState r1 = io.netty.handler.codec.compression.JdkZlibDecoder.GzipState.HEADER_END
            if (r0 == r1) goto L50
            boolean r0 = r8.readGZIPHeader(r10)
            if (r0 != 0) goto L50
            goto L5d
        L50:
            int r0 = r10.readableBytes()
            goto L5e
        L55:
            boolean r9 = r8.readGZIPFooter(r10)
            if (r9 == 0) goto L5d
            r8.finished = r3
        L5d:
            return
        L5e:
            boolean r1 = r10.hasArray()
            if (r1 == 0) goto L77
            java.util.zip.Inflater r1 = r8.inflater
            byte[] r4 = r10.array()
            int r5 = r10.arrayOffset()
            int r6 = r10.readerIndex()
            int r5 = r5 + r6
            r1.setInput(r4, r5, r0)
            goto L85
        L77:
            byte[] r1 = new byte[r0]
            int r4 = r10.readerIndex()
            r10.getBytes(r4, r1)
            java.util.zip.Inflater r4 = r8.inflater
            r4.setInput(r1)
        L85:
            io.netty.buffer.ByteBufAllocator r9 = r9.alloc()
            java.util.zip.Inflater r1 = r8.inflater
            int r1 = r1.getRemaining()
            int r1 = r1 << r3
            io.netty.buffer.ByteBuf r9 = r9.heapBuffer(r1)
        L94:
            java.util.zip.Inflater r1 = r8.inflater     // Catch: java.lang.Throwable -> Lc1 java.util.zip.DataFormatException -> Lc4
            boolean r1 = r1.needsInput()     // Catch: java.lang.Throwable -> Lc1 java.util.zip.DataFormatException -> Lc4
            if (r1 != 0) goto Lfd
            byte[] r1 = r9.array()     // Catch: java.lang.Throwable -> Lc1 java.util.zip.DataFormatException -> Lc4
            int r4 = r9.writerIndex()     // Catch: java.lang.Throwable -> Lc1 java.util.zip.DataFormatException -> Lc4
            int r5 = r9.arrayOffset()     // Catch: java.lang.Throwable -> Lc1 java.util.zip.DataFormatException -> Lc4
            int r5 = r5 + r4
            java.util.zip.Inflater r6 = r8.inflater     // Catch: java.lang.Throwable -> Lc1 java.util.zip.DataFormatException -> Lc4
            int r7 = r9.writableBytes()     // Catch: java.lang.Throwable -> Lc1 java.util.zip.DataFormatException -> Lc4
            int r6 = r6.inflate(r1, r5, r7)     // Catch: java.lang.Throwable -> Lc1 java.util.zip.DataFormatException -> Lc4
            if (r6 <= 0) goto Lc7
            int r4 = r4 + r6
            r9.writerIndex(r4)     // Catch: java.lang.Throwable -> Lc1 java.util.zip.DataFormatException -> Lc4
            io.netty.handler.codec.compression.ByteBufChecksum r4 = r8.crc     // Catch: java.lang.Throwable -> Lc1 java.util.zip.DataFormatException -> Lc4
            if (r4 == 0) goto Le1
            r4.update(r1, r5, r6)     // Catch: java.lang.Throwable -> Lc1 java.util.zip.DataFormatException -> Lc4
            goto Le1
        Lc1:
            r10 = move-exception
            goto L140
        Lc4:
            r10 = move-exception
            goto L138
        Lc7:
            java.util.zip.Inflater r1 = r8.inflater     // Catch: java.lang.Throwable -> Lc1 java.util.zip.DataFormatException -> Lc4
            boolean r1 = r1.needsDictionary()     // Catch: java.lang.Throwable -> Lc1 java.util.zip.DataFormatException -> Lc4
            if (r1 == 0) goto Le1
            byte[] r1 = r8.dictionary     // Catch: java.lang.Throwable -> Lc1 java.util.zip.DataFormatException -> Lc4
            if (r1 == 0) goto Ld9
            java.util.zip.Inflater r4 = r8.inflater     // Catch: java.lang.Throwable -> Lc1 java.util.zip.DataFormatException -> Lc4
            r4.setDictionary(r1)     // Catch: java.lang.Throwable -> Lc1 java.util.zip.DataFormatException -> Lc4
            goto Le1
        Ld9:
            io.netty.handler.codec.compression.DecompressionException r10 = new io.netty.handler.codec.compression.DecompressionException     // Catch: java.lang.Throwable -> Lc1 java.util.zip.DataFormatException -> Lc4
            java.lang.String r0 = "decompression failure, unable to set dictionary as non was specified"
            r10.<init>(r0)     // Catch: java.lang.Throwable -> Lc1 java.util.zip.DataFormatException -> Lc4
            throw r10     // Catch: java.lang.Throwable -> Lc1 java.util.zip.DataFormatException -> Lc4
        Le1:
            java.util.zip.Inflater r1 = r8.inflater     // Catch: java.lang.Throwable -> Lc1 java.util.zip.DataFormatException -> Lc4
            boolean r1 = r1.finished()     // Catch: java.lang.Throwable -> Lc1 java.util.zip.DataFormatException -> Lc4
            if (r1 == 0) goto Lf2
            io.netty.handler.codec.compression.ByteBufChecksum r1 = r8.crc     // Catch: java.lang.Throwable -> Lc1 java.util.zip.DataFormatException -> Lc4
            if (r1 != 0) goto Lf0
            r8.finished = r3     // Catch: java.lang.Throwable -> Lc1 java.util.zip.DataFormatException -> Lc4
            goto Lfd
        Lf0:
            r2 = 1
            goto Lfd
        Lf2:
            java.util.zip.Inflater r1 = r8.inflater     // Catch: java.lang.Throwable -> Lc1 java.util.zip.DataFormatException -> Lc4
            int r1 = r1.getRemaining()     // Catch: java.lang.Throwable -> Lc1 java.util.zip.DataFormatException -> Lc4
            int r1 = r1 << r3
            r9.ensureWritable(r1)     // Catch: java.lang.Throwable -> Lc1 java.util.zip.DataFormatException -> Lc4
            goto L94
        Lfd:
            java.util.zip.Inflater r1 = r8.inflater     // Catch: java.lang.Throwable -> Lc1 java.util.zip.DataFormatException -> Lc4
            int r1 = r1.getRemaining()     // Catch: java.lang.Throwable -> Lc1 java.util.zip.DataFormatException -> Lc4
            int r0 = r0 - r1
            r10.skipBytes(r0)     // Catch: java.lang.Throwable -> Lc1 java.util.zip.DataFormatException -> Lc4
            if (r2 == 0) goto L12a
            io.netty.handler.codec.compression.JdkZlibDecoder$GzipState r0 = io.netty.handler.codec.compression.JdkZlibDecoder.GzipState.FOOTER_START     // Catch: java.lang.Throwable -> Lc1 java.util.zip.DataFormatException -> Lc4
            r8.gzipState = r0     // Catch: java.lang.Throwable -> Lc1 java.util.zip.DataFormatException -> Lc4
            boolean r10 = r8.readGZIPFooter(r10)     // Catch: java.lang.Throwable -> Lc1 java.util.zip.DataFormatException -> Lc4
            if (r10 == 0) goto L12a
            boolean r10 = r8.decompressConcatenated     // Catch: java.lang.Throwable -> Lc1 java.util.zip.DataFormatException -> Lc4
            r10 = r10 ^ r3
            r8.finished = r10     // Catch: java.lang.Throwable -> Lc1 java.util.zip.DataFormatException -> Lc4
            boolean r10 = r8.finished     // Catch: java.lang.Throwable -> Lc1 java.util.zip.DataFormatException -> Lc4
            if (r10 != 0) goto L12a
            java.util.zip.Inflater r10 = r8.inflater     // Catch: java.lang.Throwable -> Lc1 java.util.zip.DataFormatException -> Lc4
            r10.reset()     // Catch: java.lang.Throwable -> Lc1 java.util.zip.DataFormatException -> Lc4
            io.netty.handler.codec.compression.ByteBufChecksum r10 = r8.crc     // Catch: java.lang.Throwable -> Lc1 java.util.zip.DataFormatException -> Lc4
            r10.reset()     // Catch: java.lang.Throwable -> Lc1 java.util.zip.DataFormatException -> Lc4
            io.netty.handler.codec.compression.JdkZlibDecoder$GzipState r10 = io.netty.handler.codec.compression.JdkZlibDecoder.GzipState.HEADER_START     // Catch: java.lang.Throwable -> Lc1 java.util.zip.DataFormatException -> Lc4
            r8.gzipState = r10     // Catch: java.lang.Throwable -> Lc1 java.util.zip.DataFormatException -> Lc4
        L12a:
            boolean r10 = r9.isReadable()
            if (r10 == 0) goto L134
            r11.add(r9)
            return
        L134:
            r9.release()
            return
        L138:
            io.netty.handler.codec.compression.DecompressionException r0 = new io.netty.handler.codec.compression.DecompressionException     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r1 = "decompression failure"
            r0.<init>(r1, r10)     // Catch: java.lang.Throwable -> Lc1
            throw r0     // Catch: java.lang.Throwable -> Lc1
        L140:
            boolean r0 = r9.isReadable()
            if (r0 == 0) goto L14a
            r11.add(r9)
            goto L14d
        L14a:
            r9.release()
        L14d:
            throw r10
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder
    protected void handlerRemoved0(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            super.handlerRemoved0(r1)
            java.util.zip.Inflater r1 = r0.inflater
            if (r1 == 0) goto La
            r1.end()
        La:
            return
    }

    @Override // io.netty.handler.codec.compression.ZlibDecoder
    public boolean isClosed() {
            r1 = this;
            boolean r0 = r1.finished
            return r0
    }
}
