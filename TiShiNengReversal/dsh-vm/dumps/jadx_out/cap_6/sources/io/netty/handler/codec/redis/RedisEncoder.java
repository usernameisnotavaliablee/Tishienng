package io.netty.handler.codec.redis;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class RedisEncoder extends io.netty.handler.codec.MessageToMessageEncoder<io.netty.handler.codec.redis.RedisMessage> {
    private final io.netty.handler.codec.redis.RedisMessagePool messagePool;

    public RedisEncoder() {
            r1 = this;
            io.netty.handler.codec.redis.FixedRedisMessagePool r0 = io.netty.handler.codec.redis.FixedRedisMessagePool.INSTANCE
            r1.<init>(r0)
            return
    }

    public RedisEncoder(io.netty.handler.codec.redis.RedisMessagePool r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "messagePool"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.handler.codec.redis.RedisMessagePool r2 = (io.netty.handler.codec.redis.RedisMessagePool) r2
            r1.messagePool = r2
            return
    }

    private byte[] numberToBytes(long r2) {
            r1 = this;
            io.netty.handler.codec.redis.RedisMessagePool r0 = r1.messagePool
            byte[] r0 = r0.getByteBufOfInteger(r2)
            if (r0 == 0) goto L9
            return r0
        L9:
            byte[] r2 = io.netty.handler.codec.redis.RedisCodecUtil.longToAsciiBytes(r2)
            return r2
    }

    private void writeArrayHeader(io.netty.buffer.ByteBufAllocator r7, io.netty.handler.codec.redis.ArrayHeaderRedisMessage r8, java.util.List<java.lang.Object> r9) {
            r6 = this;
            boolean r2 = r8.isNull()
            long r3 = r8.length()
            r0 = r6
            r1 = r7
            r5 = r9
            r0.writeArrayHeader(r1, r2, r3, r5)
            return
    }

    private void writeArrayHeader(io.netty.buffer.ByteBufAllocator r1, boolean r2, long r3, java.util.List<java.lang.Object> r5) {
            r0 = this;
            if (r2 == 0) goto L1a
            r2 = 5
            io.netty.buffer.ByteBuf r1 = r1.ioBuffer(r2)
            io.netty.handler.codec.redis.RedisMessageType r2 = io.netty.handler.codec.redis.RedisMessageType.ARRAY_HEADER
            r2.writeTo(r1)
            short r2 = io.netty.handler.codec.redis.RedisConstants.NULL_SHORT
            r1.writeShort(r2)
            short r2 = io.netty.handler.codec.redis.RedisConstants.EOL_SHORT
            r1.writeShort(r2)
            r5.add(r1)
            return
        L1a:
            r2 = 23
            io.netty.buffer.ByteBuf r1 = r1.ioBuffer(r2)
            io.netty.handler.codec.redis.RedisMessageType r2 = io.netty.handler.codec.redis.RedisMessageType.ARRAY_HEADER
            r2.writeTo(r1)
            byte[] r2 = r0.numberToBytes(r3)
            r1.writeBytes(r2)
            short r2 = io.netty.handler.codec.redis.RedisConstants.EOL_SHORT
            r1.writeShort(r2)
            r5.add(r1)
            return
    }

    private void writeArrayMessage(io.netty.buffer.ByteBufAllocator r13, io.netty.handler.codec.redis.ArrayRedisMessage r14, java.util.List<java.lang.Object> r15) {
            r12 = this;
            boolean r0 = r14.isNull()
            if (r0 == 0) goto L13
            boolean r3 = r14.isNull()
            r4 = -1
            r1 = r12
            r2 = r13
            r6 = r15
            r1.writeArrayHeader(r2, r3, r4, r6)
            return
        L13:
            r2 = r13
            r6 = r15
            boolean r8 = r14.isNull()
            java.util.List r13 = r14.children()
            int r13 = r13.size()
            long r9 = (long) r13
            r7 = r2
            r11 = r6
            r6 = r12
            r6.writeArrayHeader(r7, r8, r9, r11)
            r1 = r6
            r6 = r11
            java.util.List r13 = r14.children()
            java.util.Iterator r13 = r13.iterator()
        L32:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L42
            java.lang.Object r14 = r13.next()
            io.netty.handler.codec.redis.RedisMessage r14 = (io.netty.handler.codec.redis.RedisMessage) r14
            r12.writeRedisMessage(r2, r14, r6)
            goto L32
        L42:
            return
    }

    private static void writeBulkStringContent(io.netty.buffer.ByteBufAllocator r1, io.netty.handler.codec.redis.BulkStringRedisContent r2, java.util.List<java.lang.Object> r3) {
            io.netty.buffer.ByteBuf r0 = r2.content()
            io.netty.buffer.ByteBuf r0 = r0.retain()
            r3.add(r0)
            boolean r2 = r2 instanceof io.netty.handler.codec.redis.LastBulkStringRedisContent
            if (r2 == 0) goto L1d
            r2 = 2
            io.netty.buffer.ByteBuf r1 = r1.ioBuffer(r2)
            short r2 = io.netty.handler.codec.redis.RedisConstants.EOL_SHORT
            io.netty.buffer.ByteBuf r1 = r1.writeShort(r2)
            r3.add(r1)
        L1d:
            return
    }

    private void writeBulkStringHeader(io.netty.buffer.ByteBufAllocator r3, io.netty.handler.codec.redis.BulkStringHeaderRedisMessage r4, java.util.List<java.lang.Object> r5) {
            r2 = this;
            boolean r0 = r4.isNull()
            if (r0 == 0) goto L8
            r0 = 2
            goto La
        L8:
            r0 = 22
        La:
            int r0 = r0 + 1
            io.netty.buffer.ByteBuf r3 = r3.ioBuffer(r0)
            io.netty.handler.codec.redis.RedisMessageType r0 = io.netty.handler.codec.redis.RedisMessageType.BULK_STRING
            r0.writeTo(r3)
            boolean r0 = r4.isNull()
            if (r0 == 0) goto L21
            short r4 = io.netty.handler.codec.redis.RedisConstants.NULL_SHORT
            r3.writeShort(r4)
            goto L32
        L21:
            int r4 = r4.bulkStringLength()
            long r0 = (long) r4
            byte[] r4 = r2.numberToBytes(r0)
            r3.writeBytes(r4)
            short r4 = io.netty.handler.codec.redis.RedisConstants.EOL_SHORT
            r3.writeShort(r4)
        L32:
            r5.add(r3)
            return
    }

    private static void writeErrorMessage(io.netty.buffer.ByteBufAllocator r1, io.netty.handler.codec.redis.ErrorRedisMessage r2, java.util.List<java.lang.Object> r3) {
            io.netty.handler.codec.redis.RedisMessageType r0 = io.netty.handler.codec.redis.RedisMessageType.ERROR
            java.lang.String r2 = r2.content()
            writeString(r1, r0, r2, r3)
            return
    }

    private void writeFullBulkStringMessage(io.netty.buffer.ByteBufAllocator r4, io.netty.handler.codec.redis.FullBulkStringRedisMessage r5, java.util.List<java.lang.Object> r6) {
            r3 = this;
            boolean r0 = r5.isNull()
            if (r0 == 0) goto L1e
            r5 = 5
            io.netty.buffer.ByteBuf r4 = r4.ioBuffer(r5)
            io.netty.handler.codec.redis.RedisMessageType r5 = io.netty.handler.codec.redis.RedisMessageType.BULK_STRING
            r5.writeTo(r4)
            short r5 = io.netty.handler.codec.redis.RedisConstants.NULL_SHORT
            r4.writeShort(r5)
            short r5 = io.netty.handler.codec.redis.RedisConstants.EOL_SHORT
            r4.writeShort(r5)
            r6.add(r4)
            return
        L1e:
            r0 = 23
            io.netty.buffer.ByteBuf r0 = r4.ioBuffer(r0)
            io.netty.handler.codec.redis.RedisMessageType r1 = io.netty.handler.codec.redis.RedisMessageType.BULK_STRING
            r1.writeTo(r0)
            io.netty.buffer.ByteBuf r1 = r5.content()
            int r1 = r1.readableBytes()
            long r1 = (long) r1
            byte[] r1 = r3.numberToBytes(r1)
            r0.writeBytes(r1)
            short r1 = io.netty.handler.codec.redis.RedisConstants.EOL_SHORT
            r0.writeShort(r1)
            r6.add(r0)
            io.netty.buffer.ByteBuf r5 = r5.content()
            io.netty.buffer.ByteBuf r5 = r5.retain()
            r6.add(r5)
            r5 = 2
            io.netty.buffer.ByteBuf r4 = r4.ioBuffer(r5)
            io.netty.buffer.ByteBuf r4 = r4.writeShort(r1)
            r6.add(r4)
            return
    }

    private static void writeInlineCommandMessage(io.netty.buffer.ByteBufAllocator r1, io.netty.handler.codec.redis.InlineCommandRedisMessage r2, java.util.List<java.lang.Object> r3) {
            io.netty.handler.codec.redis.RedisMessageType r0 = io.netty.handler.codec.redis.RedisMessageType.INLINE_COMMAND
            java.lang.String r2 = r2.content()
            writeString(r1, r0, r2, r3)
            return
    }

    private void writeIntegerMessage(io.netty.buffer.ByteBufAllocator r3, io.netty.handler.codec.redis.IntegerRedisMessage r4, java.util.List<java.lang.Object> r5) {
            r2 = this;
            r0 = 23
            io.netty.buffer.ByteBuf r3 = r3.ioBuffer(r0)
            io.netty.handler.codec.redis.RedisMessageType r0 = io.netty.handler.codec.redis.RedisMessageType.INTEGER
            r0.writeTo(r3)
            long r0 = r4.value()
            byte[] r4 = r2.numberToBytes(r0)
            r3.writeBytes(r4)
            short r4 = io.netty.handler.codec.redis.RedisConstants.EOL_SHORT
            r3.writeShort(r4)
            r5.add(r3)
            return
    }

    private void writeRedisMessage(io.netty.buffer.ByteBufAllocator r2, io.netty.handler.codec.redis.RedisMessage r3, java.util.List<java.lang.Object> r4) {
            r1 = this;
            boolean r0 = r3 instanceof io.netty.handler.codec.redis.InlineCommandRedisMessage
            if (r0 == 0) goto La
            io.netty.handler.codec.redis.InlineCommandRedisMessage r3 = (io.netty.handler.codec.redis.InlineCommandRedisMessage) r3
            writeInlineCommandMessage(r2, r3, r4)
            return
        La:
            boolean r0 = r3 instanceof io.netty.handler.codec.redis.SimpleStringRedisMessage
            if (r0 == 0) goto L14
            io.netty.handler.codec.redis.SimpleStringRedisMessage r3 = (io.netty.handler.codec.redis.SimpleStringRedisMessage) r3
            writeSimpleStringMessage(r2, r3, r4)
            return
        L14:
            boolean r0 = r3 instanceof io.netty.handler.codec.redis.ErrorRedisMessage
            if (r0 == 0) goto L1e
            io.netty.handler.codec.redis.ErrorRedisMessage r3 = (io.netty.handler.codec.redis.ErrorRedisMessage) r3
            writeErrorMessage(r2, r3, r4)
            return
        L1e:
            boolean r0 = r3 instanceof io.netty.handler.codec.redis.IntegerRedisMessage
            if (r0 == 0) goto L28
            io.netty.handler.codec.redis.IntegerRedisMessage r3 = (io.netty.handler.codec.redis.IntegerRedisMessage) r3
            r1.writeIntegerMessage(r2, r3, r4)
            return
        L28:
            boolean r0 = r3 instanceof io.netty.handler.codec.redis.FullBulkStringRedisMessage
            if (r0 == 0) goto L32
            io.netty.handler.codec.redis.FullBulkStringRedisMessage r3 = (io.netty.handler.codec.redis.FullBulkStringRedisMessage) r3
            r1.writeFullBulkStringMessage(r2, r3, r4)
            return
        L32:
            boolean r0 = r3 instanceof io.netty.handler.codec.redis.BulkStringRedisContent
            if (r0 == 0) goto L3c
            io.netty.handler.codec.redis.BulkStringRedisContent r3 = (io.netty.handler.codec.redis.BulkStringRedisContent) r3
            writeBulkStringContent(r2, r3, r4)
            return
        L3c:
            boolean r0 = r3 instanceof io.netty.handler.codec.redis.BulkStringHeaderRedisMessage
            if (r0 == 0) goto L46
            io.netty.handler.codec.redis.BulkStringHeaderRedisMessage r3 = (io.netty.handler.codec.redis.BulkStringHeaderRedisMessage) r3
            r1.writeBulkStringHeader(r2, r3, r4)
            return
        L46:
            boolean r0 = r3 instanceof io.netty.handler.codec.redis.ArrayHeaderRedisMessage
            if (r0 == 0) goto L50
            io.netty.handler.codec.redis.ArrayHeaderRedisMessage r3 = (io.netty.handler.codec.redis.ArrayHeaderRedisMessage) r3
            r1.writeArrayHeader(r2, r3, r4)
            return
        L50:
            boolean r0 = r3 instanceof io.netty.handler.codec.redis.ArrayRedisMessage
            if (r0 == 0) goto L5a
            io.netty.handler.codec.redis.ArrayRedisMessage r3 = (io.netty.handler.codec.redis.ArrayRedisMessage) r3
            r1.writeArrayMessage(r2, r3, r4)
            return
        L5a:
            io.netty.handler.codec.CodecException r2 = new io.netty.handler.codec.CodecException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "unknown message type: "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
    }

    private static void writeSimpleStringMessage(io.netty.buffer.ByteBufAllocator r1, io.netty.handler.codec.redis.SimpleStringRedisMessage r2, java.util.List<java.lang.Object> r3) {
            io.netty.handler.codec.redis.RedisMessageType r0 = io.netty.handler.codec.redis.RedisMessageType.SIMPLE_STRING
            java.lang.String r2 = r2.content()
            writeString(r1, r0, r2, r3)
            return
    }

    private static void writeString(io.netty.buffer.ByteBufAllocator r2, io.netty.handler.codec.redis.RedisMessageType r3, java.lang.String r4, java.util.List<java.lang.Object> r5) {
            int r0 = r3.length()
            int r1 = io.netty.buffer.ByteBufUtil.utf8MaxBytes(r4)
            int r0 = r0 + r1
            int r0 = r0 + 2
            io.netty.buffer.ByteBuf r2 = r2.ioBuffer(r0)
            r3.writeTo(r2)
            io.netty.buffer.ByteBufUtil.writeUtf8(r2, r4)
            short r3 = io.netty.handler.codec.redis.RedisConstants.EOL_SHORT
            r2.writeShort(r3)
            r5.add(r2)
            return
    }

    /* renamed from: encode, reason: avoid collision after fix types in other method */
    protected void encode2(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.redis.RedisMessage r2, java.util.List<java.lang.Object> r3) throws java.lang.Exception {
            r0 = this;
            io.netty.buffer.ByteBufAllocator r1 = r1.alloc()     // Catch: java.lang.Exception -> L8 io.netty.handler.codec.CodecException -> La
            r0.writeRedisMessage(r1, r2, r3)     // Catch: java.lang.Exception -> L8 io.netty.handler.codec.CodecException -> La
            return
        L8:
            r1 = move-exception
            goto Lc
        La:
            r1 = move-exception
            goto L12
        Lc:
            io.netty.handler.codec.CodecException r2 = new io.netty.handler.codec.CodecException
            r2.<init>(r1)
            throw r2
        L12:
            throw r1
    }

    @Override // io.netty.handler.codec.MessageToMessageEncoder
    protected /* bridge */ /* synthetic */ void encode(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.redis.RedisMessage r2, java.util.List r3) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.redis.RedisMessage r2 = (io.netty.handler.codec.redis.RedisMessage) r2
            r0.encode2(r1, r2, r3)
            return
    }
}
