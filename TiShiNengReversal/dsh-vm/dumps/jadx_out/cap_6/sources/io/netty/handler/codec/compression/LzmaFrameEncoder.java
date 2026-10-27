package io.netty.handler.codec.compression;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class LzmaFrameEncoder extends io.netty.handler.codec.MessageToByteEncoder<io.netty.buffer.ByteBuf> {
    private static final int DEFAULT_LC = 3;
    private static final int DEFAULT_LP = 0;
    private static final int DEFAULT_MATCH_FINDER = 1;
    private static final int DEFAULT_PB = 2;
    private static final int MAX_FAST_BYTES = 273;
    private static final int MEDIUM_DICTIONARY_SIZE = 65536;
    private static final int MEDIUM_FAST_BYTES = 32;
    private static final int MIN_FAST_BYTES = 5;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private static boolean warningLogged;
    private final lzma.sdk.lzma.Encoder encoder;
    private final int littleEndianDictionarySize;
    private final byte properties;

    static {
            java.lang.Class<io.netty.handler.codec.compression.LzmaFrameEncoder> r0 = io.netty.handler.codec.compression.LzmaFrameEncoder.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.handler.codec.compression.LzmaFrameEncoder.logger = r0
            return
    }

    public LzmaFrameEncoder() {
            r1 = this;
            r0 = 65536(0x10000, float:9.1835E-41)
            r1.<init>(r0)
            return
    }

    public LzmaFrameEncoder(int r4) {
            r3 = this;
            r0 = 0
            r1 = 2
            r2 = 3
            r3.<init>(r2, r0, r1, r4)
            return
    }

    public LzmaFrameEncoder(int r2, int r3, int r4) {
            r1 = this;
            r0 = 65536(0x10000, float:9.1835E-41)
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public LzmaFrameEncoder(int r8, int r9, int r10, int r11) {
            r7 = this;
            r5 = 0
            r6 = 32
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public LzmaFrameEncoder(int r4, int r5, int r6, int r7, boolean r8, int r9) {
            r3 = this;
            r3.<init>()
            if (r4 < 0) goto Lc8
            r0 = 8
            if (r4 > r0) goto Lc8
            java.lang.String r0 = " (expected: 0-4)"
            if (r5 < 0) goto Lae
            r1 = 4
            if (r5 > r1) goto Lae
            if (r6 < 0) goto L94
            if (r6 > r1) goto L94
            int r0 = r4 + r5
            r2 = 1
            if (r0 <= r1) goto L26
            boolean r0 = io.netty.handler.codec.compression.LzmaFrameEncoder.warningLogged
            if (r0 != 0) goto L26
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.codec.compression.LzmaFrameEncoder.logger
            java.lang.String r1 = "The latest versions of LZMA libraries (for example, XZ Utils) has an additional requirement: lc + lp <= 4. Data which don't follow this requirement cannot be decompressed with this libraries."
            r0.warn(r1)
            io.netty.handler.codec.compression.LzmaFrameEncoder.warningLogged = r2
        L26:
            if (r7 < 0) goto L78
            r0 = 273(0x111, float:3.83E-43)
            r1 = 5
            if (r9 < r1) goto L55
            if (r9 > r0) goto L55
            lzma.sdk.lzma.Encoder r0 = new lzma.sdk.lzma.Encoder
            r0.<init>()
            r3.encoder = r0
            r0.setDictionarySize(r7)
            r0.setEndMarkerMode(r8)
            r0.setMatchFinder(r2)
            r0.setNumFastBytes(r9)
            r0.setLcLpPb(r4, r5, r6)
            int r6 = r6 * 5
            int r6 = r6 + r5
            int r6 = r6 * 9
            int r6 = r6 + r4
            byte r4 = (byte) r6
            r3.properties = r4
            int r4 = java.lang.Integer.reverseBytes(r7)
            r3.littleEndianDictionarySize = r4
            return
        L55:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r9 = 0
            r8[r9] = r5
            r8[r2] = r6
            r5 = 2
            r8[r5] = r7
            java.lang.String r5 = "numFastBytes: %d (expected: %d-%d)"
            java.lang.String r5 = java.lang.String.format(r5, r8)
            r4.<init>(r5)
            throw r4
        L78:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "dictionarySize: "
            r5.append(r6)
            r5.append(r7)
            java.lang.String r6 = " (expected: 0+)"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L94:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "pb: "
            r5.append(r7)
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        Lae:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "lp: "
            r6.append(r7)
            r6.append(r5)
            r6.append(r0)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
        Lc8:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "lc: "
            r6.append(r7)
            r6.append(r4)
            java.lang.String r4 = " (expected: 0-8)"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.<init>(r4)
            throw r5
    }

    private static int maxOutputBufferLength(int r4) {
            r0 = 200(0xc8, float:2.8E-43)
            if (r4 >= r0) goto L7
            r0 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            goto L2a
        L7:
            r0 = 500(0x1f4, float:7.0E-43)
            if (r4 >= r0) goto L11
            r0 = 4608083138725491507(0x3ff3333333333333, double:1.2)
            goto L2a
        L11:
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r4 >= r0) goto L1b
            r0 = 4607632778762754458(0x3ff199999999999a, double:1.1)
            goto L2a
        L1b:
            r0 = 10000(0x2710, float:1.4013E-41)
            if (r4 >= r0) goto L25
            r0 = 4607407598781385933(0x3ff0cccccccccccd, double:1.05)
            goto L2a
        L25:
            r0 = 4607272490792564818(0x3ff051eb851eb852, double:1.02)
        L2a:
            double r2 = (double) r4
            double r2 = r2 * r0
            int r4 = (int) r2
            int r4 = r4 + 13
            return r4
    }

    /* renamed from: allocateBuffer, reason: avoid collision after fix types in other method */
    protected io.netty.buffer.ByteBuf allocateBuffer2(io.netty.channel.ChannelHandlerContext r1, io.netty.buffer.ByteBuf r2, boolean r3) throws java.lang.Exception {
            r0 = this;
            int r2 = r2.readableBytes()
            int r2 = maxOutputBufferLength(r2)
            io.netty.buffer.ByteBufAllocator r1 = r1.alloc()
            io.netty.buffer.ByteBuf r1 = r1.ioBuffer(r2)
            return r1
    }

    @Override // io.netty.handler.codec.MessageToByteEncoder
    protected /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf allocateBuffer(io.netty.channel.ChannelHandlerContext r1, io.netty.buffer.ByteBuf r2, boolean r3) throws java.lang.Exception {
            r0 = this;
            io.netty.buffer.ByteBuf r2 = (io.netty.buffer.ByteBuf) r2
            io.netty.buffer.ByteBuf r1 = r0.allocateBuffer2(r1, r2, r3)
            return r1
    }

    /* renamed from: encode, reason: avoid collision after fix types in other method */
    protected void encode2(io.netty.channel.ChannelHandlerContext r11, io.netty.buffer.ByteBuf r12, io.netty.buffer.ByteBuf r13) throws java.lang.Exception {
            r10 = this;
            int r11 = r12.readableBytes()
            r1 = 0
            io.netty.buffer.ByteBufInputStream r3 = new io.netty.buffer.ByteBufInputStream     // Catch: java.lang.Throwable -> L3a
            r3.<init>(r12)     // Catch: java.lang.Throwable -> L3a
            io.netty.buffer.ByteBufOutputStream r4 = new io.netty.buffer.ByteBufOutputStream     // Catch: java.lang.Throwable -> L36
            r4.<init>(r13)     // Catch: java.lang.Throwable -> L36
            byte r12 = r10.properties     // Catch: java.lang.Throwable -> L32
            r4.writeByte(r12)     // Catch: java.lang.Throwable -> L32
            int r12 = r10.littleEndianDictionarySize     // Catch: java.lang.Throwable -> L32
            r4.writeInt(r12)     // Catch: java.lang.Throwable -> L32
            long r11 = (long) r11     // Catch: java.lang.Throwable -> L32
            long r11 = java.lang.Long.reverseBytes(r11)     // Catch: java.lang.Throwable -> L32
            r4.writeLong(r11)     // Catch: java.lang.Throwable -> L32
            lzma.sdk.lzma.Encoder r2 = r10.encoder     // Catch: java.lang.Throwable -> L32
            r7 = -1
            r9 = 0
            r5 = -1
            r2.code(r3, r4, r5, r7, r9)     // Catch: java.lang.Throwable -> L32
            r3.close()
            r4.close()
            return
        L32:
            r0 = move-exception
            r11 = r0
        L34:
            r1 = r3
            goto L3d
        L36:
            r0 = move-exception
            r11 = r0
            r4 = r1
            goto L34
        L3a:
            r0 = move-exception
            r11 = r0
            r4 = r1
        L3d:
            if (r1 == 0) goto L42
            r1.close()
        L42:
            if (r4 == 0) goto L47
            r4.close()
        L47:
            throw r11
    }

    @Override // io.netty.handler.codec.MessageToByteEncoder
    protected /* bridge */ /* synthetic */ void encode(io.netty.channel.ChannelHandlerContext r1, io.netty.buffer.ByteBuf r2, io.netty.buffer.ByteBuf r3) throws java.lang.Exception {
            r0 = this;
            io.netty.buffer.ByteBuf r2 = (io.netty.buffer.ByteBuf) r2
            r0.encode2(r1, r2, r3)
            return
    }
}
