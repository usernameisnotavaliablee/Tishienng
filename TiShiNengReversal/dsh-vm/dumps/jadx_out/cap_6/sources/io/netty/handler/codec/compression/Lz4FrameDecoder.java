package io.netty.handler.codec.compression;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class Lz4FrameDecoder extends io.netty.handler.codec.ByteToMessageDecoder {
    private int blockType;
    private io.netty.handler.codec.compression.ByteBufChecksum checksum;
    private int compressedLength;
    private int currentChecksum;
    private io.netty.handler.codec.compression.Lz4FrameDecoder.State currentState;
    private int decompressedLength;
    private net.jpountz.lz4.LZ4FastDecompressor decompressor;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.compression.Lz4FrameDecoder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$compression$Lz4FrameDecoder$State = null;

        static {
                io.netty.handler.codec.compression.Lz4FrameDecoder$State[] r0 = io.netty.handler.codec.compression.Lz4FrameDecoder.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.codec.compression.Lz4FrameDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$Lz4FrameDecoder$State = r0
                io.netty.handler.codec.compression.Lz4FrameDecoder$State r1 = io.netty.handler.codec.compression.Lz4FrameDecoder.State.INIT_BLOCK     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.handler.codec.compression.Lz4FrameDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$Lz4FrameDecoder$State     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.codec.compression.Lz4FrameDecoder$State r1 = io.netty.handler.codec.compression.Lz4FrameDecoder.State.DECOMPRESS_DATA     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.netty.handler.codec.compression.Lz4FrameDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$Lz4FrameDecoder$State     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.handler.codec.compression.Lz4FrameDecoder$State r1 = io.netty.handler.codec.compression.Lz4FrameDecoder.State.FINISHED     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = io.netty.handler.codec.compression.Lz4FrameDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$Lz4FrameDecoder$State     // Catch: java.lang.NoSuchFieldError -> L33
                io.netty.handler.codec.compression.Lz4FrameDecoder$State r1 = io.netty.handler.codec.compression.Lz4FrameDecoder.State.CORRUPTED     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum State extends java.lang.Enum<io.netty.handler.codec.compression.Lz4FrameDecoder.State> {
        private static final /* synthetic */ io.netty.handler.codec.compression.Lz4FrameDecoder.State[] $VALUES = null;
        public static final io.netty.handler.codec.compression.Lz4FrameDecoder.State CORRUPTED = null;
        public static final io.netty.handler.codec.compression.Lz4FrameDecoder.State DECOMPRESS_DATA = null;
        public static final io.netty.handler.codec.compression.Lz4FrameDecoder.State FINISHED = null;
        public static final io.netty.handler.codec.compression.Lz4FrameDecoder.State INIT_BLOCK = null;

        static {
                io.netty.handler.codec.compression.Lz4FrameDecoder$State r0 = new io.netty.handler.codec.compression.Lz4FrameDecoder$State
                java.lang.String r1 = "INIT_BLOCK"
                r2 = 0
                r0.<init>(r1, r2)
                io.netty.handler.codec.compression.Lz4FrameDecoder.State.INIT_BLOCK = r0
                io.netty.handler.codec.compression.Lz4FrameDecoder$State r1 = new io.netty.handler.codec.compression.Lz4FrameDecoder$State
                java.lang.String r3 = "DECOMPRESS_DATA"
                r4 = 1
                r1.<init>(r3, r4)
                io.netty.handler.codec.compression.Lz4FrameDecoder.State.DECOMPRESS_DATA = r1
                io.netty.handler.codec.compression.Lz4FrameDecoder$State r3 = new io.netty.handler.codec.compression.Lz4FrameDecoder$State
                java.lang.String r5 = "FINISHED"
                r6 = 2
                r3.<init>(r5, r6)
                io.netty.handler.codec.compression.Lz4FrameDecoder.State.FINISHED = r3
                io.netty.handler.codec.compression.Lz4FrameDecoder$State r5 = new io.netty.handler.codec.compression.Lz4FrameDecoder$State
                java.lang.String r7 = "CORRUPTED"
                r8 = 3
                r5.<init>(r7, r8)
                io.netty.handler.codec.compression.Lz4FrameDecoder.State.CORRUPTED = r5
                r7 = 4
                io.netty.handler.codec.compression.Lz4FrameDecoder$State[] r7 = new io.netty.handler.codec.compression.Lz4FrameDecoder.State[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                io.netty.handler.codec.compression.Lz4FrameDecoder.State.$VALUES = r7
                return
        }

        State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.netty.handler.codec.compression.Lz4FrameDecoder.State valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.codec.compression.Lz4FrameDecoder$State> r0 = io.netty.handler.codec.compression.Lz4FrameDecoder.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.codec.compression.Lz4FrameDecoder$State r1 = (io.netty.handler.codec.compression.Lz4FrameDecoder.State) r1
                return r1
        }

        public static io.netty.handler.codec.compression.Lz4FrameDecoder.State[] values() {
                io.netty.handler.codec.compression.Lz4FrameDecoder$State[] r0 = io.netty.handler.codec.compression.Lz4FrameDecoder.State.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.codec.compression.Lz4FrameDecoder$State[] r0 = (io.netty.handler.codec.compression.Lz4FrameDecoder.State[]) r0
                return r0
        }
    }

    public Lz4FrameDecoder() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public Lz4FrameDecoder(net.jpountz.lz4.LZ4Factory r2, java.util.zip.Checksum r3) {
            r1 = this;
            r1.<init>()
            io.netty.handler.codec.compression.Lz4FrameDecoder$State r0 = io.netty.handler.codec.compression.Lz4FrameDecoder.State.INIT_BLOCK
            r1.currentState = r0
            if (r2 == 0) goto L1a
            net.jpountz.lz4.LZ4FastDecompressor r2 = r2.fastDecompressor()
            r1.decompressor = r2
            if (r3 != 0) goto L13
            r2 = 0
            goto L17
        L13:
            io.netty.handler.codec.compression.ByteBufChecksum r2 = io.netty.handler.codec.compression.ByteBufChecksum.wrapChecksum(r3)
        L17:
            r1.checksum = r2
            return
        L1a:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "factory"
            r2.<init>(r3)
            throw r2
    }

    public Lz4FrameDecoder(net.jpountz.lz4.LZ4Factory r2, boolean r3) {
            r1 = this;
            if (r3 == 0) goto Lb
            io.netty.handler.codec.compression.Lz4XXHash32 r3 = new io.netty.handler.codec.compression.Lz4XXHash32
            r0 = -1756908916(0xffffffff9747b28c, float:-6.4525726E-25)
            r3.<init>(r0)
            goto Lc
        Lb:
            r3 = 0
        Lc:
            r1.<init>(r2, r3)
            return
    }

    public Lz4FrameDecoder(boolean r2) {
            r1 = this;
            net.jpountz.lz4.LZ4Factory r0 = net.jpountz.lz4.LZ4Factory.fastestInstance()
            r1.<init>(r0, r2)
            return
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder
    protected void decode(io.netty.channel.ChannelHandlerContext r13, io.netty.buffer.ByteBuf r14, java.util.List<java.lang.Object> r15) throws java.lang.Exception {
            r12 = this;
            int[] r0 = io.netty.handler.codec.compression.Lz4FrameDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$Lz4FrameDecoder$State     // Catch: java.lang.Exception -> L21
            io.netty.handler.codec.compression.Lz4FrameDecoder$State r1 = r12.currentState     // Catch: java.lang.Exception -> L21
            int r1 = r1.ordinal()     // Catch: java.lang.Exception -> L21
            r0 = r0[r1]     // Catch: java.lang.Exception -> L21
            r1 = 3
            r2 = 0
            r3 = 2
            r4 = 1
            r5 = 16
            r6 = 0
            if (r0 == r4) goto L2c
            if (r0 == r3) goto Lbb
            if (r0 == r1) goto L24
            r13 = 4
            if (r0 != r13) goto L1b
            goto L24
        L1b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L21
            r13.<init>()     // Catch: java.lang.Exception -> L21
            throw r13     // Catch: java.lang.Exception -> L21
        L21:
            r13 = move-exception
            goto L186
        L24:
            int r13 = r14.readableBytes()     // Catch: java.lang.Exception -> L21
            r14.skipBytes(r13)     // Catch: java.lang.Exception -> L21
            return
        L2c:
            int r0 = r14.readableBytes()     // Catch: java.lang.Exception -> L21
            r7 = 21
            if (r0 >= r7) goto L36
            goto Lc9
        L36:
            long r7 = r14.readLong()     // Catch: java.lang.Exception -> L21
            r9 = 5501767354678207339(0x4c5a34426c6f636b, double:6.579441740982069E59)
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 != 0) goto L17e
            byte r0 = r14.readByte()     // Catch: java.lang.Exception -> L21
            r7 = r0 & 15
            int r7 = r7 + 10
            r0 = r0 & 240(0xf0, float:3.36E-43)
            int r8 = r14.readInt()     // Catch: java.lang.Exception -> L21
            int r8 = java.lang.Integer.reverseBytes(r8)     // Catch: java.lang.Exception -> L21
            r9 = 33554432(0x2000000, float:9.403955E-38)
            if (r8 < 0) goto L164
            if (r8 > r9) goto L164
            int r9 = r14.readInt()     // Catch: java.lang.Exception -> L21
            int r9 = java.lang.Integer.reverseBytes(r9)     // Catch: java.lang.Exception -> L21
            int r7 = r4 << r7
            if (r9 < 0) goto L14a
            if (r9 > r7) goto L14a
            if (r9 != 0) goto L6d
            if (r8 != 0) goto L76
        L6d:
            if (r9 == 0) goto L71
            if (r8 == 0) goto L76
        L71:
            if (r0 != r5) goto L90
            if (r9 != r8) goto L76
            goto L90
        L76:
            io.netty.handler.codec.compression.DecompressionException r13 = new io.netty.handler.codec.compression.DecompressionException     // Catch: java.lang.Exception -> L21
            java.lang.String r14 = "stream corrupted: compressedLength(%d) and decompressedLength(%d) mismatch"
            java.lang.Integer r15 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Exception -> L21
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Exception -> L21
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L21
            r1[r2] = r15     // Catch: java.lang.Exception -> L21
            r1[r4] = r0     // Catch: java.lang.Exception -> L21
            java.lang.String r14 = java.lang.String.format(r14, r1)     // Catch: java.lang.Exception -> L21
            r13.<init>(r14)     // Catch: java.lang.Exception -> L21
            throw r13     // Catch: java.lang.Exception -> L21
        L90:
            int r7 = r14.readInt()     // Catch: java.lang.Exception -> L21
            int r7 = java.lang.Integer.reverseBytes(r7)     // Catch: java.lang.Exception -> L21
            if (r9 != 0) goto Laf
            if (r8 != 0) goto Laf
            if (r7 != 0) goto La7
            io.netty.handler.codec.compression.Lz4FrameDecoder$State r13 = io.netty.handler.codec.compression.Lz4FrameDecoder.State.FINISHED     // Catch: java.lang.Exception -> L21
            r12.currentState = r13     // Catch: java.lang.Exception -> L21
            r12.decompressor = r6     // Catch: java.lang.Exception -> L21
            r12.checksum = r6     // Catch: java.lang.Exception -> L21
            return
        La7:
            io.netty.handler.codec.compression.DecompressionException r13 = new io.netty.handler.codec.compression.DecompressionException     // Catch: java.lang.Exception -> L21
            java.lang.String r14 = "stream corrupted: checksum error"
            r13.<init>(r14)     // Catch: java.lang.Exception -> L21
            throw r13     // Catch: java.lang.Exception -> L21
        Laf:
            r12.blockType = r0     // Catch: java.lang.Exception -> L21
            r12.compressedLength = r8     // Catch: java.lang.Exception -> L21
            r12.decompressedLength = r9     // Catch: java.lang.Exception -> L21
            r12.currentChecksum = r7     // Catch: java.lang.Exception -> L21
            io.netty.handler.codec.compression.Lz4FrameDecoder$State r0 = io.netty.handler.codec.compression.Lz4FrameDecoder.State.DECOMPRESS_DATA     // Catch: java.lang.Exception -> L21
            r12.currentState = r0     // Catch: java.lang.Exception -> L21
        Lbb:
            int r0 = r12.blockType     // Catch: java.lang.Exception -> L21
            int r7 = r12.compressedLength     // Catch: java.lang.Exception -> L21
            int r8 = r12.decompressedLength     // Catch: java.lang.Exception -> L21
            int r9 = r12.currentChecksum     // Catch: java.lang.Exception -> L21
            int r10 = r14.readableBytes()     // Catch: java.lang.Exception -> L21
            if (r10 >= r7) goto Lca
        Lc9:
            return
        Lca:
            io.netty.handler.codec.compression.ByteBufChecksum r10 = r12.checksum     // Catch: java.lang.Exception -> L21
            if (r0 == r5) goto L126
            r11 = 32
            if (r0 != r11) goto Lfe
            io.netty.buffer.ByteBufAllocator r13 = r13.alloc()     // Catch: java.lang.Throwable -> Lfa net.jpountz.lz4.LZ4Exception -> Lfc
            io.netty.buffer.ByteBuf r13 = r13.buffer(r8, r8)     // Catch: java.lang.Throwable -> Lfa net.jpountz.lz4.LZ4Exception -> Lfc
            net.jpountz.lz4.LZ4FastDecompressor r0 = r12.decompressor     // Catch: java.lang.Throwable -> Lf4 net.jpountz.lz4.LZ4Exception -> Lf7
            java.nio.ByteBuffer r1 = io.netty.handler.codec.compression.CompressionUtil.safeNioBuffer(r14)     // Catch: java.lang.Throwable -> Lf4 net.jpountz.lz4.LZ4Exception -> Lf7
            int r2 = r13.writerIndex()     // Catch: java.lang.Throwable -> Lf4 net.jpountz.lz4.LZ4Exception -> Lf7
            java.nio.ByteBuffer r2 = r13.internalNioBuffer(r2, r8)     // Catch: java.lang.Throwable -> Lf4 net.jpountz.lz4.LZ4Exception -> Lf7
            r0.decompress(r1, r2)     // Catch: java.lang.Throwable -> Lf4 net.jpountz.lz4.LZ4Exception -> Lf7
            int r0 = r13.writerIndex()     // Catch: java.lang.Throwable -> Lf4 net.jpountz.lz4.LZ4Exception -> Lf7
            int r0 = r0 + r8
            r13.writerIndex(r0)     // Catch: java.lang.Throwable -> Lf4 net.jpountz.lz4.LZ4Exception -> Lf7
            goto L12e
        Lf4:
            r14 = move-exception
            r6 = r13
            goto L144
        Lf7:
            r14 = move-exception
            r6 = r13
            goto L13e
        Lfa:
            r14 = move-exception
            goto L144
        Lfc:
            r14 = move-exception
            goto L13e
        Lfe:
            io.netty.handler.codec.compression.DecompressionException r13 = new io.netty.handler.codec.compression.DecompressionException     // Catch: java.lang.Throwable -> Lfa net.jpountz.lz4.LZ4Exception -> Lfc
            java.lang.String r14 = "unexpected blockType: %d (expected: %d or %d)"
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lfa net.jpountz.lz4.LZ4Exception -> Lfc
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> Lfa net.jpountz.lz4.LZ4Exception -> Lfc
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> Lfa net.jpountz.lz4.LZ4Exception -> Lfc
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L122 net.jpountz.lz4.LZ4Exception -> L124
            r1[r2] = r15     // Catch: java.lang.Throwable -> L122 net.jpountz.lz4.LZ4Exception -> L124
            r1[r4] = r0     // Catch: java.lang.Throwable -> L122 net.jpountz.lz4.LZ4Exception -> L124
            r1[r3] = r5     // Catch: java.lang.Throwable -> L122 net.jpountz.lz4.LZ4Exception -> L124
            java.lang.String r14 = java.lang.String.format(r14, r1)     // Catch: java.lang.Throwable -> Lfa net.jpountz.lz4.LZ4Exception -> Lfc
            r13.<init>(r14)     // Catch: java.lang.Throwable -> Lfa net.jpountz.lz4.LZ4Exception -> Lfc
            throw r13     // Catch: java.lang.Throwable -> Lfa net.jpountz.lz4.LZ4Exception -> Lfc
        L11e:
            r14 = r13
            goto L144
        L120:
            r14 = r13
            goto L13e
        L122:
            r13 = move-exception
            goto L11e
        L124:
            r13 = move-exception
            goto L120
        L126:
            int r13 = r14.readerIndex()     // Catch: java.lang.Throwable -> Lfa net.jpountz.lz4.LZ4Exception -> Lfc
            io.netty.buffer.ByteBuf r13 = r14.retainedSlice(r13, r8)     // Catch: java.lang.Throwable -> Lfa net.jpountz.lz4.LZ4Exception -> Lfc
        L12e:
            r14.skipBytes(r7)     // Catch: java.lang.Throwable -> Lf4 net.jpountz.lz4.LZ4Exception -> Lf7
            if (r10 == 0) goto L136
            io.netty.handler.codec.compression.CompressionUtil.checkChecksum(r10, r13, r9)     // Catch: java.lang.Throwable -> Lf4 net.jpountz.lz4.LZ4Exception -> Lf7
        L136:
            r15.add(r13)     // Catch: java.lang.Throwable -> Lf4 net.jpountz.lz4.LZ4Exception -> Lf7
            io.netty.handler.codec.compression.Lz4FrameDecoder$State r13 = io.netty.handler.codec.compression.Lz4FrameDecoder.State.INIT_BLOCK     // Catch: java.lang.Throwable -> Lfa net.jpountz.lz4.LZ4Exception -> Lfc
            r12.currentState = r13     // Catch: java.lang.Throwable -> Lfa net.jpountz.lz4.LZ4Exception -> Lfc
            return
        L13e:
            io.netty.handler.codec.compression.DecompressionException r13 = new io.netty.handler.codec.compression.DecompressionException     // Catch: java.lang.Throwable -> Lfa
            r13.<init>(r14)     // Catch: java.lang.Throwable -> Lfa
            throw r13     // Catch: java.lang.Throwable -> Lfa
        L144:
            if (r6 == 0) goto L149
            r6.release()     // Catch: java.lang.Exception -> L21
        L149:
            throw r14     // Catch: java.lang.Exception -> L21
        L14a:
            io.netty.handler.codec.compression.DecompressionException r13 = new io.netty.handler.codec.compression.DecompressionException     // Catch: java.lang.Exception -> L21
            java.lang.String r14 = "invalid decompressedLength: %d (expected: 0-%d)"
            java.lang.Integer r15 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Exception -> L21
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L21
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L21
            r1[r2] = r15     // Catch: java.lang.Exception -> L21
            r1[r4] = r0     // Catch: java.lang.Exception -> L21
            java.lang.String r14 = java.lang.String.format(r14, r1)     // Catch: java.lang.Exception -> L21
            r13.<init>(r14)     // Catch: java.lang.Exception -> L21
            throw r13     // Catch: java.lang.Exception -> L21
        L164:
            io.netty.handler.codec.compression.DecompressionException r13 = new io.netty.handler.codec.compression.DecompressionException     // Catch: java.lang.Exception -> L21
            java.lang.String r14 = "invalid compressedLength: %d (expected: 0-%d)"
            java.lang.Integer r15 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Exception -> L21
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Exception -> L21
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L21
            r1[r2] = r15     // Catch: java.lang.Exception -> L21
            r1[r4] = r0     // Catch: java.lang.Exception -> L21
            java.lang.String r14 = java.lang.String.format(r14, r1)     // Catch: java.lang.Exception -> L21
            r13.<init>(r14)     // Catch: java.lang.Exception -> L21
            throw r13     // Catch: java.lang.Exception -> L21
        L17e:
            io.netty.handler.codec.compression.DecompressionException r13 = new io.netty.handler.codec.compression.DecompressionException     // Catch: java.lang.Exception -> L21
            java.lang.String r14 = "unexpected block identifier"
            r13.<init>(r14)     // Catch: java.lang.Exception -> L21
            throw r13     // Catch: java.lang.Exception -> L21
        L186:
            io.netty.handler.codec.compression.Lz4FrameDecoder$State r14 = io.netty.handler.codec.compression.Lz4FrameDecoder.State.CORRUPTED
            r12.currentState = r14
            throw r13
    }

    public boolean isClosed() {
            r2 = this;
            io.netty.handler.codec.compression.Lz4FrameDecoder$State r0 = r2.currentState
            io.netty.handler.codec.compression.Lz4FrameDecoder$State r1 = io.netty.handler.codec.compression.Lz4FrameDecoder.State.FINISHED
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }
}
