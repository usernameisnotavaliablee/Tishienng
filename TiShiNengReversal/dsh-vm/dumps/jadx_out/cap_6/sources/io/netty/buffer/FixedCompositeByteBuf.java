package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class FixedCompositeByteBuf extends io.netty.buffer.AbstractReferenceCountedByteBuf {
    private static final io.netty.buffer.ByteBuf[] EMPTY = null;
    private final io.netty.buffer.ByteBufAllocator allocator;
    private final io.netty.buffer.ByteBuf[] buffers;
    private final int capacity;
    private final boolean direct;
    private final int nioBufferCount;
    private final java.nio.ByteOrder order;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class Component extends io.netty.buffer.WrappedByteBuf {
        private final int endOffset;
        private final int index;
        private final int offset;

        Component(int r1, int r2, io.netty.buffer.ByteBuf r3) {
                r0 = this;
                r0.<init>(r3)
                r0.index = r1
                r0.offset = r2
                int r1 = r3.readableBytes()
                int r2 = r2 + r1
                r0.endOffset = r2
                return
        }

        static /* synthetic */ int access$000(io.netty.buffer.FixedCompositeByteBuf.Component r0) {
                int r0 = r0.offset
                return r0
        }

        static /* synthetic */ int access$100(io.netty.buffer.FixedCompositeByteBuf.Component r0) {
                int r0 = r0.endOffset
                return r0
        }

        static /* synthetic */ int access$200(io.netty.buffer.FixedCompositeByteBuf.Component r0) {
                int r0 = r0.index
                return r0
        }
    }

    static {
            r0 = 1
            io.netty.buffer.ByteBuf[] r0 = new io.netty.buffer.ByteBuf[r0]
            io.netty.buffer.ByteBuf r1 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            r2 = 0
            r0[r2] = r1
            io.netty.buffer.FixedCompositeByteBuf.EMPTY = r0
            return
    }

    FixedCompositeByteBuf(io.netty.buffer.ByteBufAllocator r9, io.netty.buffer.ByteBuf... r10) {
            r8 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            r8.<init>(r0)
            int r0 = r10.length
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L1a
            io.netty.buffer.ByteBuf[] r10 = io.netty.buffer.FixedCompositeByteBuf.EMPTY
            r8.buffers = r10
            java.nio.ByteOrder r10 = java.nio.ByteOrder.BIG_ENDIAN
            r8.order = r10
            r8.nioBufferCount = r1
            r8.capacity = r2
            r8.direct = r2
            goto L5c
        L1a:
            r0 = r10[r2]
            r8.buffers = r10
            int r3 = r0.nioBufferCount()
            int r4 = r0.readableBytes()
            java.nio.ByteOrder r0 = r0.order()
            r8.order = r0
            r0 = 1
        L2d:
            int r5 = r10.length
            if (r1 >= r5) goto L56
            r5 = r10[r1]
            java.nio.ByteOrder r6 = r5.order()
            java.nio.ByteOrder r7 = r8.order
            if (r6 != r7) goto L4e
            int r6 = r5.nioBufferCount()
            int r3 = r3 + r6
            int r6 = r5.readableBytes()
            int r4 = r4 + r6
            boolean r5 = r5.isDirect()
            if (r5 != 0) goto L4b
            r0 = 0
        L4b:
            int r1 = r1 + 1
            goto L2d
        L4e:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "All ByteBufs need to have same ByteOrder"
            r9.<init>(r10)
            throw r9
        L56:
            r8.nioBufferCount = r3
            r8.capacity = r4
            r8.direct = r0
        L5c:
            int r10 = r8.capacity()
            r8.setIndex(r2, r10)
            r8.allocator = r9
            return
    }

    private io.netty.buffer.ByteBuf buffer(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf[] r0 = r1.buffers
            r2 = r0[r2]
            boolean r0 = r2 instanceof io.netty.buffer.FixedCompositeByteBuf.Component
            if (r0 == 0) goto Lc
            io.netty.buffer.FixedCompositeByteBuf$Component r2 = (io.netty.buffer.FixedCompositeByteBuf.Component) r2
            io.netty.buffer.ByteBuf r2 = r2.buf
        Lc:
            return r2
    }

    private io.netty.buffer.FixedCompositeByteBuf.Component findComponent(int r7) {
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            io.netty.buffer.ByteBuf[] r2 = r6.buffers
            int r3 = r2.length
            if (r0 >= r3) goto L32
            r2 = r2[r0]
            boolean r3 = r2 instanceof io.netty.buffer.FixedCompositeByteBuf.Component
            if (r3 == 0) goto L15
            io.netty.buffer.FixedCompositeByteBuf$Component r2 = (io.netty.buffer.FixedCompositeByteBuf.Component) r2
            io.netty.buffer.ByteBuf r3 = r2.buf
            r5 = r3
            r3 = r2
            r2 = r5
            goto L16
        L15:
            r3 = 0
        L16:
            int r4 = r2.readableBytes()
            int r1 = r1 + r4
            if (r7 >= r1) goto L2f
            if (r3 != 0) goto L2e
            io.netty.buffer.FixedCompositeByteBuf$Component r7 = new io.netty.buffer.FixedCompositeByteBuf$Component
            int r3 = r2.readableBytes()
            int r1 = r1 - r3
            r7.<init>(r0, r1, r2)
            io.netty.buffer.ByteBuf[] r1 = r6.buffers
            r1[r0] = r7
            return r7
        L2e:
            return r3
        L2f:
            int r0 = r0 + 1
            goto L2
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>()
            throw r7
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected byte _getByte(int r3) {
            r2 = this;
            io.netty.buffer.FixedCompositeByteBuf$Component r0 = r2.findComponent(r3)
            io.netty.buffer.ByteBuf r1 = r0.buf
            int r0 = io.netty.buffer.FixedCompositeByteBuf.Component.access$000(r0)
            int r3 = r3 - r0
            byte r3 = r1.getByte(r3)
            return r3
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected int _getInt(int r4) {
            r3 = this;
            io.netty.buffer.FixedCompositeByteBuf$Component r0 = r3.findComponent(r4)
            int r1 = r4 + 4
            int r2 = io.netty.buffer.FixedCompositeByteBuf.Component.access$100(r0)
            if (r1 > r2) goto L18
            io.netty.buffer.ByteBuf r1 = r0.buf
            int r0 = io.netty.buffer.FixedCompositeByteBuf.Component.access$000(r0)
            int r4 = r4 - r0
            int r4 = r1.getInt(r4)
            return r4
        L18:
            java.nio.ByteOrder r0 = r3.order()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r2 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r1) goto L33
            short r0 = r3._getShort(r4)
            r0 = r0 & r2
            int r0 = r0 << 16
            int r4 = r4 + 2
            short r4 = r3._getShort(r4)
            r4 = r4 & r2
            r4 = r4 | r0
            return r4
        L33:
            short r0 = r3._getShort(r4)
            r0 = r0 & r2
            int r4 = r4 + 2
            short r4 = r3._getShort(r4)
            r4 = r4 & r2
            int r4 = r4 << 16
            r4 = r4 | r0
            return r4
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected int _getIntLE(int r4) {
            r3 = this;
            io.netty.buffer.FixedCompositeByteBuf$Component r0 = r3.findComponent(r4)
            int r1 = r4 + 4
            int r2 = io.netty.buffer.FixedCompositeByteBuf.Component.access$100(r0)
            if (r1 > r2) goto L18
            io.netty.buffer.ByteBuf r1 = r0.buf
            int r0 = io.netty.buffer.FixedCompositeByteBuf.Component.access$000(r0)
            int r4 = r4 - r0
            int r4 = r1.getIntLE(r4)
            return r4
        L18:
            java.nio.ByteOrder r0 = r3.order()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r2 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r1) goto L33
            short r0 = r3._getShortLE(r4)
            r0 = r0 & r2
            int r4 = r4 + 2
            short r4 = r3._getShortLE(r4)
            r4 = r4 & r2
            int r4 = r4 << 16
            r4 = r4 | r0
            return r4
        L33:
            short r0 = r3._getShortLE(r4)
            r0 = r0 & r2
            int r0 = r0 << 16
            int r4 = r4 + 2
            short r4 = r3._getShortLE(r4)
            r4 = r4 & r2
            r4 = r4 | r0
            return r4
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected long _getLong(int r8) {
            r7 = this;
            io.netty.buffer.FixedCompositeByteBuf$Component r0 = r7.findComponent(r8)
            int r1 = r8 + 8
            int r2 = io.netty.buffer.FixedCompositeByteBuf.Component.access$100(r0)
            if (r1 > r2) goto L18
            io.netty.buffer.ByteBuf r1 = r0.buf
            int r0 = io.netty.buffer.FixedCompositeByteBuf.Component.access$000(r0)
            int r8 = r8 - r0
            long r0 = r1.getLong(r8)
            return r0
        L18:
            java.nio.ByteOrder r0 = r7.order()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r2 = 32
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r0 != r1) goto L38
            int r0 = r7._getInt(r8)
            long r0 = (long) r0
            long r0 = r0 & r3
            long r0 = r0 << r2
            int r8 = r8 + 4
            int r8 = r7._getInt(r8)
            long r5 = (long) r8
            long r3 = r3 & r5
            long r0 = r0 | r3
            return r0
        L38:
            int r0 = r7._getInt(r8)
            long r0 = (long) r0
            long r0 = r0 & r3
            int r8 = r8 + 4
            int r8 = r7._getInt(r8)
            long r5 = (long) r8
            long r3 = r3 & r5
            long r2 = r3 << r2
            long r0 = r0 | r2
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected long _getLongLE(int r8) {
            r7 = this;
            io.netty.buffer.FixedCompositeByteBuf$Component r0 = r7.findComponent(r8)
            int r1 = r8 + 8
            int r2 = io.netty.buffer.FixedCompositeByteBuf.Component.access$100(r0)
            if (r1 > r2) goto L18
            io.netty.buffer.ByteBuf r1 = r0.buf
            int r0 = io.netty.buffer.FixedCompositeByteBuf.Component.access$000(r0)
            int r8 = r8 - r0
            long r0 = r1.getLongLE(r8)
            return r0
        L18:
            java.nio.ByteOrder r0 = r7.order()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r2 = 32
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r0 != r1) goto L39
            int r0 = r7._getIntLE(r8)
            long r0 = (long) r0
            long r0 = r0 & r3
            int r8 = r8 + 4
            int r8 = r7._getIntLE(r8)
            long r5 = (long) r8
            long r3 = r3 & r5
            long r2 = r3 << r2
            long r0 = r0 | r2
            return r0
        L39:
            int r0 = r7._getIntLE(r8)
            long r0 = (long) r0
            long r0 = r0 & r3
            long r0 = r0 << r2
            int r8 = r8 + 4
            int r8 = r7._getIntLE(r8)
            long r5 = (long) r8
            long r3 = r3 & r5
            long r0 = r0 | r3
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected short _getShort(int r4) {
            r3 = this;
            io.netty.buffer.FixedCompositeByteBuf$Component r0 = r3.findComponent(r4)
            int r1 = r4 + 2
            int r2 = io.netty.buffer.FixedCompositeByteBuf.Component.access$100(r0)
            if (r1 > r2) goto L18
            io.netty.buffer.ByteBuf r1 = r0.buf
            int r0 = io.netty.buffer.FixedCompositeByteBuf.Component.access$000(r0)
            int r4 = r4 - r0
            short r4 = r1.getShort(r4)
            return r4
        L18:
            java.nio.ByteOrder r0 = r3.order()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L33
            byte r0 = r3._getByte(r4)
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            int r4 = r4 + 1
            byte r4 = r3._getByte(r4)
            r4 = r4 & 255(0xff, float:3.57E-43)
            r4 = r4 | r0
            short r4 = (short) r4
            return r4
        L33:
            byte r0 = r3._getByte(r4)
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r4 = r4 + 1
            byte r4 = r3._getByte(r4)
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 8
            r4 = r4 | r0
            short r4 = (short) r4
            return r4
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected short _getShortLE(int r4) {
            r3 = this;
            io.netty.buffer.FixedCompositeByteBuf$Component r0 = r3.findComponent(r4)
            int r1 = r4 + 2
            int r2 = io.netty.buffer.FixedCompositeByteBuf.Component.access$100(r0)
            if (r1 > r2) goto L18
            io.netty.buffer.ByteBuf r1 = r0.buf
            int r0 = io.netty.buffer.FixedCompositeByteBuf.Component.access$000(r0)
            int r4 = r4 - r0
            short r4 = r1.getShortLE(r4)
            return r4
        L18:
            java.nio.ByteOrder r0 = r3.order()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L33
            byte r0 = r3._getByte(r4)
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r4 = r4 + 1
            byte r4 = r3._getByte(r4)
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 8
            r4 = r4 | r0
            short r4 = (short) r4
            return r4
        L33:
            byte r0 = r3._getByte(r4)
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            int r4 = r4 + 1
            byte r4 = r3._getByte(r4)
            r4 = r4 & 255(0xff, float:3.57E-43)
            r4 = r4 | r0
            short r4 = (short) r4
            return r4
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected int _getUnsignedMedium(int r4) {
            r3 = this;
            io.netty.buffer.FixedCompositeByteBuf$Component r0 = r3.findComponent(r4)
            int r1 = r4 + 3
            int r2 = io.netty.buffer.FixedCompositeByteBuf.Component.access$100(r0)
            if (r1 > r2) goto L18
            io.netty.buffer.ByteBuf r1 = r0.buf
            int r0 = io.netty.buffer.FixedCompositeByteBuf.Component.access$000(r0)
            int r4 = r4 - r0
            int r4 = r1.getUnsignedMedium(r4)
            return r4
        L18:
            java.nio.ByteOrder r0 = r3.order()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r2 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r1) goto L34
            short r0 = r3._getShort(r4)
            r0 = r0 & r2
            int r0 = r0 << 8
            int r4 = r4 + 2
            byte r4 = r3._getByte(r4)
            r4 = r4 & 255(0xff, float:3.57E-43)
            r4 = r4 | r0
            return r4
        L34:
            short r0 = r3._getShort(r4)
            r0 = r0 & r2
            int r4 = r4 + 2
            byte r4 = r3._getByte(r4)
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 16
            r4 = r4 | r0
            return r4
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected int _getUnsignedMediumLE(int r4) {
            r3 = this;
            io.netty.buffer.FixedCompositeByteBuf$Component r0 = r3.findComponent(r4)
            int r1 = r4 + 3
            int r2 = io.netty.buffer.FixedCompositeByteBuf.Component.access$100(r0)
            if (r1 > r2) goto L18
            io.netty.buffer.ByteBuf r1 = r0.buf
            int r0 = io.netty.buffer.FixedCompositeByteBuf.Component.access$000(r0)
            int r4 = r4 - r0
            int r4 = r1.getUnsignedMediumLE(r4)
            return r4
        L18:
            java.nio.ByteOrder r0 = r3.order()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r2 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r1) goto L34
            short r0 = r3._getShortLE(r4)
            r0 = r0 & r2
            int r4 = r4 + 2
            byte r4 = r3._getByte(r4)
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 16
            r4 = r4 | r0
            return r4
        L34:
            short r0 = r3._getShortLE(r4)
            r0 = r0 & r2
            int r0 = r0 << 8
            int r4 = r4 + 2
            byte r4 = r3._getByte(r4)
            r4 = r4 & 255(0xff, float:3.57E-43)
            r4 = r4 | r0
            return r4
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setByte(int r1, int r2) {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setInt(int r1, int r2) {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setIntLE(int r1, int r2) {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setLong(int r1, long r2) {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setLongLE(int r1, long r2) {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setMedium(int r1, int r2) {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setMediumLE(int r1, int r2) {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setShort(int r1, int r2) {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setShortLE(int r1, int r2) {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBufAllocator alloc() {
            r1 = this;
            io.netty.buffer.ByteBufAllocator r0 = r1.allocator
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public byte[] array() {
            r2 = this;
            io.netty.buffer.ByteBuf[] r0 = r2.buffers
            int r0 = r0.length
            if (r0 == 0) goto L18
            r1 = 1
            if (r0 != r1) goto L12
            r0 = 0
            io.netty.buffer.ByteBuf r0 = r2.buffer(r0)
            byte[] r0 = r0.array()
            return r0
        L12:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        L18:
            byte[] r0 = io.netty.util.internal.EmptyArrays.EMPTY_BYTES
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int arrayOffset() {
            r3 = this;
            io.netty.buffer.ByteBuf[] r0 = r3.buffers
            int r0 = r0.length
            r1 = 0
            if (r0 == 0) goto L18
            r2 = 1
            if (r0 != r2) goto L12
            io.netty.buffer.ByteBuf r0 = r3.buffer(r1)
            int r0 = r0.arrayOffset()
            return r0
        L12:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        L18:
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int capacity() {
            r1 = this;
            int r0 = r1.capacity
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf capacity(int r1) {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf copy(int r2, int r3) {
            r1 = this;
            r1.checkIndex(r2, r3)
            io.netty.buffer.ByteBufAllocator r0 = r1.alloc()
            io.netty.buffer.ByteBuf r0 = r0.buffer(r3)
            r0.writeBytes(r1, r2, r3)     // Catch: java.lang.Throwable -> Lf
            return r0
        Lf:
            r2 = move-exception
            r0.release()
            throw r2
    }

    @Override // io.netty.buffer.AbstractReferenceCountedByteBuf
    protected void deallocate() {
            r2 = this;
            r0 = 0
        L1:
            io.netty.buffer.ByteBuf[] r1 = r2.buffers
            int r1 = r1.length
            if (r0 >= r1) goto L10
            io.netty.buffer.ByteBuf r1 = r2.buffer(r0)
            r1.release()
            int r0 = r0 + 1
            goto L1
        L10:
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf discardReadBytes() {
            r1 = this;
            java.nio.ReadOnlyBufferException r0 = new java.nio.ReadOnlyBufferException
            r0.<init>()
            throw r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public byte getByte(int r1) {
            r0 = this;
            byte r1 = r0._getByte(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int getBytes(int r7, java.nio.channels.FileChannel r8, long r9, int r11) throws java.io.IOException {
            r6 = this;
            int r0 = r6.nioBufferCount()
            r1 = 1
            if (r0 != r1) goto L10
            java.nio.ByteBuffer r7 = r6.internalNioBuffer(r7, r11)
            int r7 = r8.write(r7, r9)
            return r7
        L10:
            java.nio.ByteBuffer[] r7 = r6.nioBuffers(r7, r11)
            int r11 = r7.length
            r0 = 0
            r2 = 0
        L18:
            if (r2 >= r11) goto L27
            r3 = r7[r2]
            long r4 = r9 + r0
            int r3 = r8.write(r3, r4)
            long r3 = (long) r3
            long r0 = r0 + r3
            int r2 = r2 + 1
            goto L18
        L27:
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r9 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r9 <= 0) goto L32
            r7 = 2147483647(0x7fffffff, float:NaN)
            return r7
        L32:
            int r7 = (int) r0
            return r7
    }

    @Override // io.netty.buffer.ByteBuf
    public int getBytes(int r3, java.nio.channels.GatheringByteChannel r4, int r5) throws java.io.IOException {
            r2 = this;
            int r0 = r2.nioBufferCount()
            r1 = 1
            if (r0 != r1) goto L10
            java.nio.ByteBuffer r3 = r2.internalNioBuffer(r3, r5)
            int r3 = r4.write(r3)
            return r3
        L10:
            java.nio.ByteBuffer[] r3 = r2.nioBuffers(r3, r5)
            long r3 = r4.write(r3)
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 <= 0) goto L23
            r3 = 2147483647(0x7fffffff, float:NaN)
            return r3
        L23:
            int r4 = (int) r3
            return r4
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r6, io.netty.buffer.ByteBuf r7, int r8, int r9) {
            r5 = this;
            int r0 = r7.capacity()
            r5.checkDstIndex(r6, r9, r8, r0)
            if (r9 != 0) goto La
            goto L30
        La:
            io.netty.buffer.FixedCompositeByteBuf$Component r0 = r5.findComponent(r6)
            int r1 = io.netty.buffer.FixedCompositeByteBuf.Component.access$200(r0)
            int r2 = io.netty.buffer.FixedCompositeByteBuf.Component.access$000(r0)
            io.netty.buffer.ByteBuf r0 = r0.buf
        L18:
            int r3 = r0.readableBytes()
            int r4 = r6 - r2
            int r3 = r3 - r4
            int r3 = java.lang.Math.min(r9, r3)
            r0.getBytes(r4, r7, r8, r3)
            int r6 = r6 + r3
            int r8 = r8 + r3
            int r9 = r9 - r3
            int r0 = r0.readableBytes()
            int r2 = r2 + r0
            if (r9 > 0) goto L31
        L30:
            return r5
        L31:
            int r1 = r1 + 1
            io.netty.buffer.ByteBuf r0 = r5.buffer(r1)
            goto L18
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r6, java.io.OutputStream r7, int r8) throws java.io.IOException {
            r5 = this;
            r5.checkIndex(r6, r8)
            if (r8 != 0) goto L6
            goto L2b
        L6:
            io.netty.buffer.FixedCompositeByteBuf$Component r0 = r5.findComponent(r6)
            int r1 = io.netty.buffer.FixedCompositeByteBuf.Component.access$200(r0)
            int r2 = io.netty.buffer.FixedCompositeByteBuf.Component.access$000(r0)
            io.netty.buffer.ByteBuf r0 = r0.buf
        L14:
            int r3 = r0.readableBytes()
            int r4 = r6 - r2
            int r3 = r3 - r4
            int r3 = java.lang.Math.min(r8, r3)
            r0.getBytes(r4, r7, r3)
            int r6 = r6 + r3
            int r8 = r8 - r3
            int r0 = r0.readableBytes()
            int r2 = r2 + r0
            if (r8 > 0) goto L2c
        L2b:
            return r5
        L2c:
            int r1 = r1 + 1
            io.netty.buffer.ByteBuf r0 = r5.buffer(r1)
            goto L14
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r9, java.nio.ByteBuffer r10) {
            r8 = this;
            int r0 = r10.limit()
            int r1 = r10.remaining()
            r8.checkIndex(r9, r1)
            if (r1 != 0) goto Le
            return r8
        Le:
            io.netty.buffer.FixedCompositeByteBuf$Component r2 = r8.findComponent(r9)     // Catch: java.lang.Throwable -> L46
            int r3 = io.netty.buffer.FixedCompositeByteBuf.Component.access$200(r2)     // Catch: java.lang.Throwable -> L46
            int r4 = io.netty.buffer.FixedCompositeByteBuf.Component.access$000(r2)     // Catch: java.lang.Throwable -> L46
            io.netty.buffer.ByteBuf r2 = r2.buf     // Catch: java.lang.Throwable -> L46
        L1c:
            int r5 = r2.readableBytes()     // Catch: java.lang.Throwable -> L46
            int r6 = r9 - r4
            int r5 = r5 - r6
            int r5 = java.lang.Math.min(r1, r5)     // Catch: java.lang.Throwable -> L46
            int r7 = r10.position()     // Catch: java.lang.Throwable -> L46
            int r7 = r7 + r5
            r10.limit(r7)     // Catch: java.lang.Throwable -> L46
            r2.getBytes(r6, r10)     // Catch: java.lang.Throwable -> L46
            int r9 = r9 + r5
            int r1 = r1 - r5
            int r2 = r2.readableBytes()     // Catch: java.lang.Throwable -> L46
            int r4 = r4 + r2
            if (r1 > 0) goto L3f
            r10.limit(r0)
            return r8
        L3f:
            int r3 = r3 + 1
            io.netty.buffer.ByteBuf r2 = r8.buffer(r3)     // Catch: java.lang.Throwable -> L46
            goto L1c
        L46:
            r9 = move-exception
            r10.limit(r0)
            throw r9
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf getBytes(int r6, byte[] r7, int r8, int r9) {
            r5 = this;
            int r0 = r7.length
            r5.checkDstIndex(r6, r9, r8, r0)
            if (r9 != 0) goto L7
            goto L2d
        L7:
            io.netty.buffer.FixedCompositeByteBuf$Component r0 = r5.findComponent(r6)
            int r1 = io.netty.buffer.FixedCompositeByteBuf.Component.access$200(r0)
            int r2 = io.netty.buffer.FixedCompositeByteBuf.Component.access$000(r0)
            io.netty.buffer.ByteBuf r0 = r0.buf
        L15:
            int r3 = r0.readableBytes()
            int r4 = r6 - r2
            int r3 = r3 - r4
            int r3 = java.lang.Math.min(r9, r3)
            r0.getBytes(r4, r7, r8, r3)
            int r6 = r6 + r3
            int r8 = r8 + r3
            int r9 = r9 - r3
            int r0 = r0.readableBytes()
            int r2 = r2 + r0
            if (r9 > 0) goto L2e
        L2d:
            return r5
        L2e:
            int r1 = r1 + 1
            io.netty.buffer.ByteBuf r0 = r5.buffer(r1)
            goto L15
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean hasArray() {
            r3 = this;
            io.netty.buffer.ByteBuf[] r0 = r3.buffers
            int r0 = r0.length
            r1 = 1
            if (r0 == 0) goto L13
            r2 = 0
            if (r0 == r1) goto La
            return r2
        La:
            io.netty.buffer.ByteBuf r0 = r3.buffer(r2)
            boolean r0 = r0.hasArray()
            return r0
        L13:
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean hasMemoryAddress() {
            r3 = this;
            io.netty.buffer.ByteBuf[] r0 = r3.buffers
            int r0 = r0.length
            if (r0 == 0) goto L13
            r1 = 1
            r2 = 0
            if (r0 == r1) goto La
            return r2
        La:
            io.netty.buffer.ByteBuf r0 = r3.buffer(r2)
            boolean r0 = r0.hasMemoryAddress()
            return r0
        L13:
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            boolean r0 = r0.hasMemoryAddress()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public java.nio.ByteBuffer internalNioBuffer(int r3, int r4) {
            r2 = this;
            io.netty.buffer.ByteBuf[] r0 = r2.buffers
            int r0 = r0.length
            r1 = 1
            if (r0 != r1) goto L10
            r0 = 0
            io.netty.buffer.ByteBuf r0 = r2.buffer(r0)
            java.nio.ByteBuffer r3 = r0.internalNioBuffer(r3, r4)
            return r3
        L10:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            r3.<init>()
            throw r3
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean isDirect() {
            r1 = this;
            boolean r0 = r1.direct
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public boolean isWritable() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public boolean isWritable(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public int maxCapacity() {
            r1 = this;
            int r0 = r1.capacity
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public long memoryAddress() {
            r2 = this;
            io.netty.buffer.ByteBuf[] r0 = r2.buffers
            int r0 = r0.length
            if (r0 == 0) goto L18
            r1 = 1
            if (r0 != r1) goto L12
            r0 = 0
            io.netty.buffer.ByteBuf r0 = r2.buffer(r0)
            long r0 = r0.memoryAddress()
            return r0
        L12:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        L18:
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            long r0 = r0.memoryAddress()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public java.nio.ByteBuffer nioBuffer(int r5, int r6) {
            r4 = this;
            r4.checkIndex(r5, r6)
            io.netty.buffer.ByteBuf[] r0 = r4.buffers
            int r0 = r0.length
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L19
            io.netty.buffer.ByteBuf r0 = r4.buffer(r1)
            int r3 = r0.nioBufferCount()
            if (r3 != r2) goto L19
            java.nio.ByteBuffer r5 = r0.nioBuffer(r5, r6)
            return r5
        L19:
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r6)
            java.nio.ByteOrder r2 = r4.order()
            java.nio.ByteBuffer r0 = r0.order(r2)
            java.nio.ByteBuffer[] r5 = r4.nioBuffers(r5, r6)
        L29:
            int r6 = r5.length
            if (r1 >= r6) goto L34
            r6 = r5[r1]
            r0.put(r6)
            int r1 = r1 + 1
            goto L29
        L34:
            r0.flip()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int nioBufferCount() {
            r1 = this;
            int r0 = r1.nioBufferCount
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public java.nio.ByteBuffer[] nioBuffers(int r9, int r10) {
            r8 = this;
            r8.checkIndex(r9, r10)
            if (r10 != 0) goto L8
            java.nio.ByteBuffer[] r9 = io.netty.util.internal.EmptyArrays.EMPTY_BYTE_BUFFERS
            return r9
        L8:
            io.netty.buffer.ByteBuf[] r0 = r8.buffers
            int r0 = r0.length
            io.netty.util.internal.RecyclableArrayList r0 = io.netty.util.internal.RecyclableArrayList.newInstance(r0)
            io.netty.buffer.FixedCompositeByteBuf$Component r1 = r8.findComponent(r9)     // Catch: java.lang.Throwable -> L39
            int r2 = io.netty.buffer.FixedCompositeByteBuf.Component.access$200(r1)     // Catch: java.lang.Throwable -> L39
            int r3 = io.netty.buffer.FixedCompositeByteBuf.Component.access$000(r1)     // Catch: java.lang.Throwable -> L39
            io.netty.buffer.ByteBuf r1 = r1.buf     // Catch: java.lang.Throwable -> L39
        L1d:
            int r4 = r1.readableBytes()     // Catch: java.lang.Throwable -> L39
            int r5 = r9 - r3
            int r4 = r4 - r5
            int r4 = java.lang.Math.min(r10, r4)     // Catch: java.lang.Throwable -> L39
            int r6 = r1.nioBufferCount()     // Catch: java.lang.Throwable -> L39
            if (r6 == 0) goto L5e
            r7 = 1
            if (r6 == r7) goto L3b
            java.nio.ByteBuffer[] r5 = r1.nioBuffers(r5, r4)     // Catch: java.lang.Throwable -> L39
            java.util.Collections.addAll(r0, r5)     // Catch: java.lang.Throwable -> L39
            goto L42
        L39:
            r9 = move-exception
            goto L64
        L3b:
            java.nio.ByteBuffer r5 = r1.nioBuffer(r5, r4)     // Catch: java.lang.Throwable -> L39
            r0.add(r5)     // Catch: java.lang.Throwable -> L39
        L42:
            int r9 = r9 + r4
            int r10 = r10 - r4
            int r1 = r1.readableBytes()     // Catch: java.lang.Throwable -> L39
            int r3 = r3 + r1
            if (r10 > 0) goto L58
            r9 = 0
            java.nio.ByteBuffer[] r9 = new java.nio.ByteBuffer[r9]     // Catch: java.lang.Throwable -> L39
            java.lang.Object[] r9 = r0.toArray(r9)     // Catch: java.lang.Throwable -> L39
            java.nio.ByteBuffer[] r9 = (java.nio.ByteBuffer[]) r9     // Catch: java.lang.Throwable -> L39
            r0.recycle()
            return r9
        L58:
            int r2 = r2 + r7
            io.netty.buffer.ByteBuf r1 = r8.buffer(r2)     // Catch: java.lang.Throwable -> L39
            goto L1d
        L5e:
            java.lang.UnsupportedOperationException r9 = new java.lang.UnsupportedOperationException     // Catch: java.lang.Throwable -> L39
            r9.<init>()     // Catch: java.lang.Throwable -> L39
            throw r9     // Catch: java.lang.Throwable -> L39
        L64:
            r0.recycle()
            throw r9
    }

    @Override // io.netty.buffer.ByteBuf
    public java.nio.ByteOrder order() {
            r1 = this;
            java.nio.ByteOrder r0 = r1.order
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setByte(int r1, int r2) {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int setBytes(int r1, java.io.InputStream r2, int r3) {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int setBytes(int r1, java.nio.channels.FileChannel r2, long r3, int r5) {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int setBytes(int r1, java.nio.channels.ScatteringByteChannel r2, int r3) {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r1, io.netty.buffer.ByteBuf r2, int r3, int r4) {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r1, java.nio.ByteBuffer r2) {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setBytes(int r1, byte[] r2, int r3, int r4) {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setInt(int r1, int r2) {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setLong(int r1, long r2) {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setMedium(int r1, int r2) {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf setShort(int r1, int r2) {
            r0 = this;
            java.nio.ReadOnlyBufferException r1 = new java.nio.ReadOnlyBufferException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = super.toString()
            int r1 = r0.length()
            int r1 = r1 + (-1)
            r2 = 0
            java.lang.String r0 = r0.substring(r2, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ", components="
            r1.append(r0)
            io.netty.buffer.ByteBuf[] r0 = r3.buffers
            int r0 = r0.length
            r1.append(r0)
            r0 = 41
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf unwrap() {
            r1 = this;
            r0 = 0
            return r0
    }
}
