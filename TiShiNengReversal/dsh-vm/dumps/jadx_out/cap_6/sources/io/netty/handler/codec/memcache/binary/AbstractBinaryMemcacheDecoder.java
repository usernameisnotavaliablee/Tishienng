package io.netty.handler.codec.memcache.binary;

import io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class AbstractBinaryMemcacheDecoder<M extends io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage> extends io.netty.handler.codec.memcache.AbstractMemcacheObjectDecoder {
    public static final int DEFAULT_MAX_CHUNK_SIZE = 8192;
    private int alreadyReadChunkSize;
    private final int chunkSize;
    private M currentMessage;
    private io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder.State state;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$memcache$binary$AbstractBinaryMemcacheDecoder$State = null;

        static {
                io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder$State[] r0 = io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$memcache$binary$AbstractBinaryMemcacheDecoder$State = r0
                io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder$State r1 = io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder.State.READ_HEADER     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$memcache$binary$AbstractBinaryMemcacheDecoder$State     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder$State r1 = io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder.State.READ_EXTRAS     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$memcache$binary$AbstractBinaryMemcacheDecoder$State     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder$State r1 = io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder.State.READ_KEY     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$memcache$binary$AbstractBinaryMemcacheDecoder$State     // Catch: java.lang.NoSuchFieldError -> L33
                io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder$State r1 = io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder.State.READ_CONTENT     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$memcache$binary$AbstractBinaryMemcacheDecoder$State     // Catch: java.lang.NoSuchFieldError -> L3e
                io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder$State r1 = io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder.State.BAD_MESSAGE     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    enum State extends java.lang.Enum<io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder.State> {
        private static final /* synthetic */ io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder.State[] $VALUES = null;
        public static final io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder.State BAD_MESSAGE = null;
        public static final io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder.State READ_CONTENT = null;
        public static final io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder.State READ_EXTRAS = null;
        public static final io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder.State READ_HEADER = null;
        public static final io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder.State READ_KEY = null;

        static {
                io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder$State r0 = new io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder$State
                java.lang.String r1 = "READ_HEADER"
                r2 = 0
                r0.<init>(r1, r2)
                io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder.State.READ_HEADER = r0
                io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder$State r1 = new io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder$State
                java.lang.String r3 = "READ_EXTRAS"
                r4 = 1
                r1.<init>(r3, r4)
                io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder.State.READ_EXTRAS = r1
                io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder$State r3 = new io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder$State
                java.lang.String r5 = "READ_KEY"
                r6 = 2
                r3.<init>(r5, r6)
                io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder.State.READ_KEY = r3
                io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder$State r5 = new io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder$State
                java.lang.String r7 = "READ_CONTENT"
                r8 = 3
                r5.<init>(r7, r8)
                io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder.State.READ_CONTENT = r5
                io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder$State r7 = new io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder$State
                java.lang.String r9 = "BAD_MESSAGE"
                r10 = 4
                r7.<init>(r9, r10)
                io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder.State.BAD_MESSAGE = r7
                r9 = 5
                io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder$State[] r9 = new io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder.State[r9]
                r9[r2] = r0
                r9[r4] = r1
                r9[r6] = r3
                r9[r8] = r5
                r9[r10] = r7
                io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder.State.$VALUES = r9
                return
        }

        State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder.State valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder$State> r0 = io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder$State r1 = (io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder.State) r1
                return r1
        }

        public static io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder.State[] values() {
                io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder$State[] r0 = io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder.State.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder$State[] r0 = (io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder.State[]) r0
                return r0
        }
    }

    protected AbstractBinaryMemcacheDecoder() {
            r1 = this;
            r0 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r0)
            return
    }

    protected AbstractBinaryMemcacheDecoder(int r2) {
            r1 = this;
            r1.<init>()
            io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder$State r0 = io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder.State.READ_HEADER
            r1.state = r0
            java.lang.String r0 = "chunkSize"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r2, r0)
            r1.chunkSize = r2
            return
    }

    private io.netty.handler.codec.memcache.MemcacheContent invalidChunk(java.lang.Exception r3) {
            r2 = this;
            io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder$State r0 = io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder.State.BAD_MESSAGE
            r2.state = r0
            io.netty.handler.codec.memcache.DefaultLastMemcacheContent r0 = new io.netty.handler.codec.memcache.DefaultLastMemcacheContent
            io.netty.buffer.ByteBuf r1 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            r0.<init>(r1)
            io.netty.handler.codec.DecoderResult r3 = io.netty.handler.codec.DecoderResult.failure(r3)
            r0.setDecoderResult(r3)
            return r0
    }

    private M invalidMessage(java.lang.Exception r2) {
            r1 = this;
            io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder$State r0 = io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder.State.BAD_MESSAGE
            r1.state = r0
            io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage r0 = r1.buildInvalidMessage()
            io.netty.handler.codec.DecoderResult r2 = io.netty.handler.codec.DecoderResult.failure(r2)
            r0.setDecoderResult(r2)
            return r0
    }

    protected abstract M buildInvalidMessage();

    @Override // io.netty.handler.codec.ByteToMessageDecoder, io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelInactive(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            super.channelInactive(r1)
            r0.resetDecoder()
            return
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder
    protected void decode(io.netty.channel.ChannelHandlerContext r3, io.netty.buffer.ByteBuf r4, java.util.List<java.lang.Object> r5) throws java.lang.Exception {
            r2 = this;
            int[] r3 = io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$memcache$binary$AbstractBinaryMemcacheDecoder$State
            io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder$State r0 = r2.state
            int r0 = r0.ordinal()
            r3 = r3[r0]
            r0 = 1
            if (r3 == r0) goto L3a
            r0 = 2
            if (r3 == r0) goto L51
            r0 = 3
            if (r3 == r0) goto L72
            r0 = 4
            if (r3 == r0) goto L9b
            r5 = 5
            if (r3 != r5) goto L21
            int r3 = r2.actualReadableBytes()
            r4.skipBytes(r3)
            return
        L21:
            java.lang.Error r3 = new java.lang.Error
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Unknown state reached: "
            r4.append(r5)
            io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder$State r5 = r2.state
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L3a:
            int r3 = r4.readableBytes()     // Catch: java.lang.Exception -> L112
            r0 = 24
            if (r3 >= r0) goto L44
            goto Le3
        L44:
            r2.resetDecoder()     // Catch: java.lang.Exception -> L112
            io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage r3 = r2.decodeHeader(r4)     // Catch: java.lang.Exception -> L112
            r2.currentMessage = r3     // Catch: java.lang.Exception -> L112
            io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder$State r3 = io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder.State.READ_EXTRAS     // Catch: java.lang.Exception -> L112
            r2.state = r3     // Catch: java.lang.Exception -> L112
        L51:
            M extends io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage r3 = r2.currentMessage     // Catch: java.lang.Exception -> L6b
            byte r3 = r3.extrasLength()     // Catch: java.lang.Exception -> L6b
            if (r3 <= 0) goto L6e
            int r0 = r4.readableBytes()     // Catch: java.lang.Exception -> L6b
            if (r0 >= r3) goto L61
            goto Le3
        L61:
            M extends io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage r0 = r2.currentMessage     // Catch: java.lang.Exception -> L6b
            io.netty.buffer.ByteBuf r3 = r4.readRetainedSlice(r3)     // Catch: java.lang.Exception -> L6b
            r0.setExtras(r3)     // Catch: java.lang.Exception -> L6b
            goto L6e
        L6b:
            r3 = move-exception
            goto L107
        L6e:
            io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder$State r3 = io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder.State.READ_KEY     // Catch: java.lang.Exception -> L6b
            r2.state = r3     // Catch: java.lang.Exception -> L6b
        L72:
            M extends io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage r3 = r2.currentMessage     // Catch: java.lang.Exception -> L8b
            short r3 = r3.keyLength()     // Catch: java.lang.Exception -> L8b
            if (r3 <= 0) goto L8e
            int r0 = r4.readableBytes()     // Catch: java.lang.Exception -> L8b
            if (r0 >= r3) goto L81
            goto Le3
        L81:
            M extends io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage r0 = r2.currentMessage     // Catch: java.lang.Exception -> L8b
            io.netty.buffer.ByteBuf r3 = r4.readRetainedSlice(r3)     // Catch: java.lang.Exception -> L8b
            r0.setKey(r3)     // Catch: java.lang.Exception -> L8b
            goto L8e
        L8b:
            r3 = move-exception
            goto Lfc
        L8e:
            M extends io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage r3 = r2.currentMessage     // Catch: java.lang.Exception -> L8b
            io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage r3 = r3.mo39retain()     // Catch: java.lang.Exception -> L8b
            r5.add(r3)     // Catch: java.lang.Exception -> L8b
            io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder$State r3 = io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder.State.READ_CONTENT     // Catch: java.lang.Exception -> L8b
            r2.state = r3     // Catch: java.lang.Exception -> L8b
        L9b:
            M extends io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage r3 = r2.currentMessage     // Catch: java.lang.Exception -> Ld5
            int r3 = r3.totalBodyLength()     // Catch: java.lang.Exception -> Ld5
            M extends io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage r0 = r2.currentMessage     // Catch: java.lang.Exception -> Ld5
            short r0 = r0.keyLength()     // Catch: java.lang.Exception -> Ld5
            int r3 = r3 - r0
            M extends io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage r0 = r2.currentMessage     // Catch: java.lang.Exception -> Ld5
            byte r0 = r0.extrasLength()     // Catch: java.lang.Exception -> Ld5
            int r3 = r3 - r0
            int r0 = r4.readableBytes()     // Catch: java.lang.Exception -> Ld5
            if (r3 <= 0) goto Le4
            if (r0 != 0) goto Lb8
            goto Le3
        Lb8:
            int r1 = r2.chunkSize     // Catch: java.lang.Exception -> Ld5
            if (r0 <= r1) goto Lbd
            r0 = r1
        Lbd:
            int r1 = r2.alreadyReadChunkSize     // Catch: java.lang.Exception -> Ld5
            int r1 = r3 - r1
            if (r0 <= r1) goto Lc4
            r0 = r1
        Lc4:
            io.netty.buffer.ByteBuf r4 = r4.readRetainedSlice(r0)     // Catch: java.lang.Exception -> Ld5
            int r1 = r2.alreadyReadChunkSize     // Catch: java.lang.Exception -> Ld5
            int r1 = r1 + r0
            r2.alreadyReadChunkSize = r1     // Catch: java.lang.Exception -> Ld5
            if (r1 < r3) goto Ld7
            io.netty.handler.codec.memcache.DefaultLastMemcacheContent r0 = new io.netty.handler.codec.memcache.DefaultLastMemcacheContent     // Catch: java.lang.Exception -> Ld5
            r0.<init>(r4)     // Catch: java.lang.Exception -> Ld5
            goto Ldc
        Ld5:
            r3 = move-exception
            goto Lf1
        Ld7:
            io.netty.handler.codec.memcache.DefaultMemcacheContent r0 = new io.netty.handler.codec.memcache.DefaultMemcacheContent     // Catch: java.lang.Exception -> Ld5
            r0.<init>(r4)     // Catch: java.lang.Exception -> Ld5
        Ldc:
            r5.add(r0)     // Catch: java.lang.Exception -> Ld5
            int r4 = r2.alreadyReadChunkSize     // Catch: java.lang.Exception -> Ld5
            if (r4 >= r3) goto Le9
        Le3:
            return
        Le4:
            io.netty.handler.codec.memcache.LastMemcacheContent r3 = io.netty.handler.codec.memcache.LastMemcacheContent.EMPTY_LAST_CONTENT     // Catch: java.lang.Exception -> Ld5
            r5.add(r3)     // Catch: java.lang.Exception -> Ld5
        Le9:
            r2.resetDecoder()     // Catch: java.lang.Exception -> Ld5
            io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder$State r3 = io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheDecoder.State.READ_HEADER     // Catch: java.lang.Exception -> Ld5
            r2.state = r3     // Catch: java.lang.Exception -> Ld5
            return
        Lf1:
            r2.resetDecoder()
            io.netty.handler.codec.memcache.MemcacheContent r3 = r2.invalidChunk(r3)
            r5.add(r3)
            return
        Lfc:
            r2.resetDecoder()
            io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage r3 = r2.invalidMessage(r3)
            r5.add(r3)
            return
        L107:
            r2.resetDecoder()
            io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage r3 = r2.invalidMessage(r3)
            r5.add(r3)
            return
        L112:
            r3 = move-exception
            r2.resetDecoder()
            io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage r3 = r2.invalidMessage(r3)
            r5.add(r3)
            return
    }

    protected abstract M decodeHeader(io.netty.buffer.ByteBuf r1);

    protected void resetDecoder() {
            r1 = this;
            M extends io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage r0 = r1.currentMessage
            if (r0 == 0) goto La
            r0.release()
            r0 = 0
            r1.currentMessage = r0
        La:
            r0 = 0
            r1.alreadyReadChunkSize = r0
            return
    }
}
