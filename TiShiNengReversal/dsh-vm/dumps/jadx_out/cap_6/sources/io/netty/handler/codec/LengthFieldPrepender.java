package io.netty.handler.codec;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@io.netty.channel.ChannelHandler.Sharable
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class LengthFieldPrepender extends io.netty.handler.codec.MessageToMessageEncoder<io.netty.buffer.ByteBuf> {
    private final java.nio.ByteOrder byteOrder;
    private final int lengthAdjustment;
    private final int lengthFieldLength;
    private final boolean lengthIncludesLengthFieldLength;

    public LengthFieldPrepender(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public LengthFieldPrepender(int r2, int r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public LengthFieldPrepender(int r2, int r3, boolean r4) {
            r1 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r1.<init>(r0, r2, r3, r4)
            return
    }

    public LengthFieldPrepender(int r2, boolean r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r3)
            return
    }

    public LengthFieldPrepender(java.nio.ByteOrder r2, int r3, int r4, boolean r5) {
            r1 = this;
            r1.<init>()
            r0 = 1
            if (r3 == r0) goto L2b
            r0 = 2
            if (r3 == r0) goto L2b
            r0 = 3
            if (r3 == r0) goto L2b
            r0 = 4
            if (r3 == r0) goto L2b
            r0 = 8
            if (r3 != r0) goto L14
            goto L2b
        L14:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "lengthFieldLength must be either 1, 2, 3, 4, or 8: "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
        L2b:
            java.lang.String r0 = "byteOrder"
            io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            r1.byteOrder = r2
            r1.lengthFieldLength = r3
            r1.lengthIncludesLengthFieldLength = r5
            r1.lengthAdjustment = r4
            return
    }

    /* renamed from: encode, reason: avoid collision after fix types in other method */
    protected void encode2(io.netty.channel.ChannelHandlerContext r4, io.netty.buffer.ByteBuf r5, java.util.List<java.lang.Object> r6) throws java.lang.Exception {
            r3 = this;
            int r0 = r5.readableBytes()
            int r1 = r3.lengthAdjustment
            int r0 = r0 + r1
            boolean r1 = r3.lengthIncludesLengthFieldLength
            if (r1 == 0) goto Le
            int r1 = r3.lengthFieldLength
            int r0 = r0 + r1
        Le:
            java.lang.String r1 = "length"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r0, r1)
            int r1 = r3.lengthFieldLength
            r2 = 1
            if (r1 == r2) goto Lbf
            r2 = 2
            if (r1 == r2) goto L8d
            r2 = 3
            if (r1 == r2) goto L5c
            r2 = 4
            if (r1 == r2) goto L45
            r2 = 8
            if (r1 != r2) goto L3d
            io.netty.buffer.ByteBufAllocator r4 = r4.alloc()
            io.netty.buffer.ByteBuf r4 = r4.buffer(r2)
            java.nio.ByteOrder r1 = r3.byteOrder
            io.netty.buffer.ByteBuf r4 = r4.order(r1)
            long r0 = (long) r0
            io.netty.buffer.ByteBuf r4 = r4.writeLong(r0)
            r6.add(r4)
            goto Ld9
        L3d:
            java.lang.Error r4 = new java.lang.Error
            java.lang.String r5 = "should not reach here"
            r4.<init>(r5)
            throw r4
        L45:
            io.netty.buffer.ByteBufAllocator r4 = r4.alloc()
            io.netty.buffer.ByteBuf r4 = r4.buffer(r2)
            java.nio.ByteOrder r1 = r3.byteOrder
            io.netty.buffer.ByteBuf r4 = r4.order(r1)
            io.netty.buffer.ByteBuf r4 = r4.writeInt(r0)
            r6.add(r4)
            goto Ld9
        L5c:
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            if (r0 >= r1) goto L76
            io.netty.buffer.ByteBufAllocator r4 = r4.alloc()
            io.netty.buffer.ByteBuf r4 = r4.buffer(r2)
            java.nio.ByteOrder r1 = r3.byteOrder
            io.netty.buffer.ByteBuf r4 = r4.order(r1)
            io.netty.buffer.ByteBuf r4 = r4.writeMedium(r0)
            r6.add(r4)
            goto Ld9
        L76:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "length does not fit into a medium integer: "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L8d:
            r1 = 65536(0x10000, float:9.1835E-41)
            if (r0 >= r1) goto La8
            io.netty.buffer.ByteBufAllocator r4 = r4.alloc()
            io.netty.buffer.ByteBuf r4 = r4.buffer(r2)
            java.nio.ByteOrder r1 = r3.byteOrder
            io.netty.buffer.ByteBuf r4 = r4.order(r1)
            short r0 = (short) r0
            io.netty.buffer.ByteBuf r4 = r4.writeShort(r0)
            r6.add(r4)
            goto Ld9
        La8:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "length does not fit into a short integer: "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        Lbf:
            r1 = 256(0x100, float:3.59E-43)
            if (r0 >= r1) goto Le1
            io.netty.buffer.ByteBufAllocator r4 = r4.alloc()
            io.netty.buffer.ByteBuf r4 = r4.buffer(r2)
            java.nio.ByteOrder r1 = r3.byteOrder
            io.netty.buffer.ByteBuf r4 = r4.order(r1)
            byte r0 = (byte) r0
            io.netty.buffer.ByteBuf r4 = r4.writeByte(r0)
            r6.add(r4)
        Ld9:
            io.netty.buffer.ByteBuf r4 = r5.retain()
            r6.add(r4)
            return
        Le1:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "length does not fit into a byte: "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    @Override // io.netty.handler.codec.MessageToMessageEncoder
    protected /* bridge */ /* synthetic */ void encode(io.netty.channel.ChannelHandlerContext r1, io.netty.buffer.ByteBuf r2, java.util.List r3) throws java.lang.Exception {
            r0 = this;
            io.netty.buffer.ByteBuf r2 = (io.netty.buffer.ByteBuf) r2
            r0.encode2(r1, r2, r3)
            return
    }
}
