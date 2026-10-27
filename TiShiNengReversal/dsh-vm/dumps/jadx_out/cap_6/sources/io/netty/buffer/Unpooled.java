package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class Unpooled {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final io.netty.buffer.ByteBufAllocator ALLOC = null;
    public static final java.nio.ByteOrder BIG_ENDIAN = null;
    public static final io.netty.buffer.ByteBuf EMPTY_BUFFER = null;
    public static final java.nio.ByteOrder LITTLE_ENDIAN = null;

    static {
            io.netty.buffer.UnpooledByteBufAllocator r0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT
            io.netty.buffer.Unpooled.ALLOC = r0
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            io.netty.buffer.Unpooled.BIG_ENDIAN = r1
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            io.netty.buffer.Unpooled.LITTLE_ENDIAN = r1
            r1 = 0
            io.netty.buffer.ByteBuf r0 = r0.buffer(r1, r1)
            io.netty.buffer.Unpooled.EMPTY_BUFFER = r0
            return
    }

    private Unpooled() {
            r0 = this;
            r0.<init>()
            return
    }

    public static io.netty.buffer.ByteBuf buffer() {
            io.netty.buffer.ByteBufAllocator r0 = io.netty.buffer.Unpooled.ALLOC
            io.netty.buffer.ByteBuf r0 = r0.heapBuffer()
            return r0
    }

    public static io.netty.buffer.ByteBuf buffer(int r1) {
            io.netty.buffer.ByteBufAllocator r0 = io.netty.buffer.Unpooled.ALLOC
            io.netty.buffer.ByteBuf r1 = r0.heapBuffer(r1)
            return r1
    }

    public static io.netty.buffer.ByteBuf buffer(int r1, int r2) {
            io.netty.buffer.ByteBufAllocator r0 = io.netty.buffer.Unpooled.ALLOC
            io.netty.buffer.ByteBuf r1 = r0.heapBuffer(r1, r2)
            return r1
    }

    public static io.netty.buffer.CompositeByteBuf compositeBuffer() {
            r0 = 16
            io.netty.buffer.CompositeByteBuf r0 = compositeBuffer(r0)
            return r0
    }

    public static io.netty.buffer.CompositeByteBuf compositeBuffer(int r3) {
            io.netty.buffer.CompositeByteBuf r0 = new io.netty.buffer.CompositeByteBuf
            io.netty.buffer.ByteBufAllocator r1 = io.netty.buffer.Unpooled.ALLOC
            r2 = 0
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static io.netty.buffer.ByteBuf copiedBuffer(io.netty.buffer.ByteBuf r3) {
            int r0 = r3.readableBytes()
            if (r0 <= 0) goto L12
            io.netty.buffer.ByteBuf r1 = buffer(r0)
            int r2 = r3.readerIndex()
            r1.writeBytes(r3, r2, r0)
            return r1
        L12:
            io.netty.buffer.ByteBuf r3 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            return r3
    }

    public static io.netty.buffer.ByteBuf copiedBuffer(java.lang.CharSequence r2, int r3, int r4, java.nio.charset.Charset r5) {
            if (r2 == 0) goto L3f
            if (r4 != 0) goto L7
            io.netty.buffer.ByteBuf r2 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            return r2
        L7:
            boolean r0 = r2 instanceof java.nio.CharBuffer
            if (r0 == 0) goto L35
            java.nio.CharBuffer r2 = (java.nio.CharBuffer) r2
            boolean r0 = r2.hasArray()
            if (r0 == 0) goto L26
            char[] r0 = r2.array()
            int r1 = r2.arrayOffset()
            int r2 = r2.position()
            int r1 = r1 + r2
            int r1 = r1 + r3
            io.netty.buffer.ByteBuf r2 = copiedBuffer(r0, r1, r4, r5)
            return r2
        L26:
            java.nio.CharBuffer r2 = r2.slice()
            r2.limit(r4)
            r2.position(r3)
            io.netty.buffer.ByteBuf r2 = copiedBuffer(r2, r5)
            return r2
        L35:
            int r4 = r4 + r3
            java.nio.CharBuffer r2 = java.nio.CharBuffer.wrap(r2, r3, r4)
            io.netty.buffer.ByteBuf r2 = copiedBuffer(r2, r5)
            return r2
        L3f:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "string"
            r2.<init>(r3)
            throw r2
    }

    public static io.netty.buffer.ByteBuf copiedBuffer(java.lang.CharSequence r1, java.nio.charset.Charset r2) {
            if (r1 == 0) goto L16
            boolean r0 = r1 instanceof java.nio.CharBuffer
            if (r0 == 0) goto Ld
            java.nio.CharBuffer r1 = (java.nio.CharBuffer) r1
            io.netty.buffer.ByteBuf r1 = copiedBuffer(r1, r2)
            return r1
        Ld:
            java.nio.CharBuffer r1 = java.nio.CharBuffer.wrap(r1)
            io.netty.buffer.ByteBuf r1 = copiedBuffer(r1, r2)
            return r1
        L16:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "string"
            r1.<init>(r2)
            throw r1
    }

    public static io.netty.buffer.ByteBuf copiedBuffer(java.nio.ByteBuffer r1) {
            int r0 = r1.remaining()
            if (r0 != 0) goto L9
            io.netty.buffer.ByteBuf r1 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            return r1
        L9:
            byte[] r0 = io.netty.util.internal.PlatformDependent.allocateUninitializedArray(r0)
            java.nio.ByteBuffer r1 = r1.duplicate()
            r1.get(r0)
            io.netty.buffer.ByteBuf r0 = wrappedBuffer(r0)
            java.nio.ByteOrder r1 = r1.order()
            io.netty.buffer.ByteBuf r1 = r0.order(r1)
            return r1
    }

    private static io.netty.buffer.ByteBuf copiedBuffer(java.nio.CharBuffer r3, java.nio.charset.Charset r4) {
            io.netty.buffer.ByteBufAllocator r0 = io.netty.buffer.Unpooled.ALLOC
            r1 = 1
            r2 = 0
            io.netty.buffer.ByteBuf r3 = io.netty.buffer.ByteBufUtil.encodeString0(r0, r1, r3, r4, r2)
            return r3
    }

    public static io.netty.buffer.ByteBuf copiedBuffer(byte[] r1) {
            int r0 = r1.length
            if (r0 != 0) goto L6
            io.netty.buffer.ByteBuf r1 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            return r1
        L6:
            java.lang.Object r1 = r1.clone()
            byte[] r1 = (byte[]) r1
            io.netty.buffer.ByteBuf r1 = wrappedBuffer(r1)
            return r1
    }

    public static io.netty.buffer.ByteBuf copiedBuffer(byte[] r2, int r3, int r4) {
            if (r4 != 0) goto L5
            io.netty.buffer.ByteBuf r2 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            return r2
        L5:
            byte[] r0 = io.netty.util.internal.PlatformDependent.allocateUninitializedArray(r4)
            r1 = 0
            java.lang.System.arraycopy(r2, r3, r0, r1, r4)
            io.netty.buffer.ByteBuf r2 = wrappedBuffer(r0)
            return r2
    }

    public static io.netty.buffer.ByteBuf copiedBuffer(char[] r0, int r1, int r2, java.nio.charset.Charset r3) {
            if (r0 == 0) goto L10
            if (r2 != 0) goto L7
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            return r0
        L7:
            java.nio.CharBuffer r0 = java.nio.CharBuffer.wrap(r0, r1, r2)
            io.netty.buffer.ByteBuf r0 = copiedBuffer(r0, r3)
            return r0
        L10:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "array"
            r0.<init>(r1)
            throw r0
    }

    public static io.netty.buffer.ByteBuf copiedBuffer(char[] r2, java.nio.charset.Charset r3) {
            if (r2 == 0) goto L9
            r0 = 0
            int r1 = r2.length
            io.netty.buffer.ByteBuf r2 = copiedBuffer(r2, r0, r1, r3)
            return r2
        L9:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "array"
            r2.<init>(r3)
            throw r2
    }

    public static io.netty.buffer.ByteBuf copiedBuffer(io.netty.buffer.ByteBuf... r8) {
            int r0 = r8.length
            if (r0 == 0) goto L6f
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L68
            int r0 = r8.length
            r1 = 0
            r3 = 0
            r4 = 0
        Lb:
            if (r3 >= r0) goto L41
            r5 = r8[r3]
            int r6 = r5.readableBytes()
            if (r6 > 0) goto L16
            goto L36
        L16:
            r7 = 2147483647(0x7fffffff, float:NaN)
            int r7 = r7 - r4
            if (r7 < r6) goto L39
            int r4 = r4 + r6
            if (r1 == 0) goto L32
            java.nio.ByteOrder r5 = r5.order()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L2a
            goto L36
        L2a:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "inconsistent byte order"
            r8.<init>(r0)
            throw r8
        L32:
            java.nio.ByteOrder r1 = r5.order()
        L36:
            int r3 = r3 + 1
            goto Lb
        L39:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The total length of the specified buffers is too big."
            r8.<init>(r0)
            throw r8
        L41:
            if (r4 != 0) goto L46
            io.netty.buffer.ByteBuf r8 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            return r8
        L46:
            byte[] r0 = io.netty.util.internal.PlatformDependent.allocateUninitializedArray(r4)
            r3 = 0
        L4b:
            int r4 = r8.length
            if (r2 >= r4) goto L5f
            r4 = r8[r2]
            int r5 = r4.readableBytes()
            int r6 = r4.readerIndex()
            r4.getBytes(r6, r0, r3, r5)
            int r3 = r3 + r5
            int r2 = r2 + 1
            goto L4b
        L5f:
            io.netty.buffer.ByteBuf r8 = wrappedBuffer(r0)
            io.netty.buffer.ByteBuf r8 = r8.order(r1)
            return r8
        L68:
            r8 = r8[r2]
            io.netty.buffer.ByteBuf r8 = copiedBuffer(r8)
            return r8
        L6f:
            io.netty.buffer.ByteBuf r8 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            return r8
    }

    public static io.netty.buffer.ByteBuf copiedBuffer(java.nio.ByteBuffer... r8) {
            int r0 = r8.length
            if (r0 == 0) goto L6f
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L68
            int r0 = r8.length
            r1 = 0
            r3 = 0
            r4 = 0
        Lb:
            if (r3 >= r0) goto L41
            r5 = r8[r3]
            int r6 = r5.remaining()
            if (r6 > 0) goto L16
            goto L36
        L16:
            r7 = 2147483647(0x7fffffff, float:NaN)
            int r7 = r7 - r4
            if (r7 < r6) goto L39
            int r4 = r4 + r6
            if (r1 == 0) goto L32
            java.nio.ByteOrder r5 = r5.order()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L2a
            goto L36
        L2a:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "inconsistent byte order"
            r8.<init>(r0)
            throw r8
        L32:
            java.nio.ByteOrder r1 = r5.order()
        L36:
            int r3 = r3 + 1
            goto Lb
        L39:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The total length of the specified buffers is too big."
            r8.<init>(r0)
            throw r8
        L41:
            if (r4 != 0) goto L46
            io.netty.buffer.ByteBuf r8 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            return r8
        L46:
            byte[] r0 = io.netty.util.internal.PlatformDependent.allocateUninitializedArray(r4)
            r3 = 0
        L4b:
            int r4 = r8.length
            if (r2 >= r4) goto L5f
            r4 = r8[r2]
            java.nio.ByteBuffer r4 = r4.duplicate()
            int r5 = r4.remaining()
            r4.get(r0, r3, r5)
            int r3 = r3 + r5
            int r2 = r2 + 1
            goto L4b
        L5f:
            io.netty.buffer.ByteBuf r8 = wrappedBuffer(r0)
            io.netty.buffer.ByteBuf r8 = r8.order(r1)
            return r8
        L68:
            r8 = r8[r2]
            io.netty.buffer.ByteBuf r8 = copiedBuffer(r8)
            return r8
        L6f:
            io.netty.buffer.ByteBuf r8 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            return r8
    }

    public static io.netty.buffer.ByteBuf copiedBuffer(byte[]... r7) {
            int r0 = r7.length
            if (r0 == 0) goto L4d
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L40
            int r0 = r7.length
            r1 = 0
            r3 = 0
        La:
            if (r1 >= r0) goto L22
            r4 = r7[r1]
            r5 = 2147483647(0x7fffffff, float:NaN)
            int r5 = r5 - r3
            int r6 = r4.length
            if (r5 < r6) goto L1a
            int r4 = r4.length
            int r3 = r3 + r4
            int r1 = r1 + 1
            goto La
        L1a:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The total length of the specified arrays is too big."
            r7.<init>(r0)
            throw r7
        L22:
            if (r3 != 0) goto L27
            io.netty.buffer.ByteBuf r7 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            return r7
        L27:
            byte[] r0 = io.netty.util.internal.PlatformDependent.allocateUninitializedArray(r3)
            r1 = 0
            r3 = 0
        L2d:
            int r4 = r7.length
            if (r1 >= r4) goto L3b
            r4 = r7[r1]
            int r5 = r4.length
            java.lang.System.arraycopy(r4, r2, r0, r3, r5)
            int r4 = r4.length
            int r3 = r3 + r4
            int r1 = r1 + 1
            goto L2d
        L3b:
            io.netty.buffer.ByteBuf r7 = wrappedBuffer(r0)
            return r7
        L40:
            r7 = r7[r2]
            int r0 = r7.length
            if (r0 != 0) goto L48
            io.netty.buffer.ByteBuf r7 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            return r7
        L48:
            io.netty.buffer.ByteBuf r7 = copiedBuffer(r7)
            return r7
        L4d:
            io.netty.buffer.ByteBuf r7 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            return r7
    }

    public static io.netty.buffer.ByteBuf copyBoolean(boolean r1) {
            r0 = 1
            io.netty.buffer.ByteBuf r0 = buffer(r0)
            r0.writeBoolean(r1)
            return r0
    }

    public static io.netty.buffer.ByteBuf copyBoolean(boolean... r4) {
            if (r4 == 0) goto L18
            int r0 = r4.length
            if (r0 != 0) goto L6
            goto L18
        L6:
            int r0 = r4.length
            io.netty.buffer.ByteBuf r0 = buffer(r0)
            int r1 = r4.length
            r2 = 0
        Ld:
            if (r2 >= r1) goto L17
            boolean r3 = r4[r2]
            r0.writeBoolean(r3)
            int r2 = r2 + 1
            goto Ld
        L17:
            return r0
        L18:
            io.netty.buffer.ByteBuf r4 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            return r4
    }

    public static io.netty.buffer.ByteBuf copyDouble(double r1) {
            r0 = 8
            io.netty.buffer.ByteBuf r0 = buffer(r0)
            r0.writeDouble(r1)
            return r0
    }

    public static io.netty.buffer.ByteBuf copyDouble(double... r5) {
            if (r5 == 0) goto L1a
            int r0 = r5.length
            if (r0 != 0) goto L6
            goto L1a
        L6:
            int r0 = r5.length
            int r0 = r0 * 8
            io.netty.buffer.ByteBuf r0 = buffer(r0)
            int r1 = r5.length
            r2 = 0
        Lf:
            if (r2 >= r1) goto L19
            r3 = r5[r2]
            r0.writeDouble(r3)
            int r2 = r2 + 1
            goto Lf
        L19:
            return r0
        L1a:
            io.netty.buffer.ByteBuf r5 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            return r5
    }

    public static io.netty.buffer.ByteBuf copyFloat(float r1) {
            r0 = 4
            io.netty.buffer.ByteBuf r0 = buffer(r0)
            r0.writeFloat(r1)
            return r0
    }

    public static io.netty.buffer.ByteBuf copyFloat(float... r4) {
            if (r4 == 0) goto L1a
            int r0 = r4.length
            if (r0 != 0) goto L6
            goto L1a
        L6:
            int r0 = r4.length
            int r0 = r0 * 4
            io.netty.buffer.ByteBuf r0 = buffer(r0)
            int r1 = r4.length
            r2 = 0
        Lf:
            if (r2 >= r1) goto L19
            r3 = r4[r2]
            r0.writeFloat(r3)
            int r2 = r2 + 1
            goto Lf
        L19:
            return r0
        L1a:
            io.netty.buffer.ByteBuf r4 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            return r4
    }

    public static io.netty.buffer.ByteBuf copyInt(int r1) {
            r0 = 4
            io.netty.buffer.ByteBuf r0 = buffer(r0)
            r0.writeInt(r1)
            return r0
    }

    public static io.netty.buffer.ByteBuf copyInt(int... r4) {
            if (r4 == 0) goto L1a
            int r0 = r4.length
            if (r0 != 0) goto L6
            goto L1a
        L6:
            int r0 = r4.length
            int r0 = r0 * 4
            io.netty.buffer.ByteBuf r0 = buffer(r0)
            int r1 = r4.length
            r2 = 0
        Lf:
            if (r2 >= r1) goto L19
            r3 = r4[r2]
            r0.writeInt(r3)
            int r2 = r2 + 1
            goto Lf
        L19:
            return r0
        L1a:
            io.netty.buffer.ByteBuf r4 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            return r4
    }

    public static io.netty.buffer.ByteBuf copyLong(long r1) {
            r0 = 8
            io.netty.buffer.ByteBuf r0 = buffer(r0)
            r0.writeLong(r1)
            return r0
    }

    public static io.netty.buffer.ByteBuf copyLong(long... r5) {
            if (r5 == 0) goto L1a
            int r0 = r5.length
            if (r0 != 0) goto L6
            goto L1a
        L6:
            int r0 = r5.length
            int r0 = r0 * 8
            io.netty.buffer.ByteBuf r0 = buffer(r0)
            int r1 = r5.length
            r2 = 0
        Lf:
            if (r2 >= r1) goto L19
            r3 = r5[r2]
            r0.writeLong(r3)
            int r2 = r2 + 1
            goto Lf
        L19:
            return r0
        L1a:
            io.netty.buffer.ByteBuf r5 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            return r5
    }

    public static io.netty.buffer.ByteBuf copyMedium(int r1) {
            r0 = 3
            io.netty.buffer.ByteBuf r0 = buffer(r0)
            r0.writeMedium(r1)
            return r0
    }

    public static io.netty.buffer.ByteBuf copyMedium(int... r4) {
            if (r4 == 0) goto L1a
            int r0 = r4.length
            if (r0 != 0) goto L6
            goto L1a
        L6:
            int r0 = r4.length
            int r0 = r0 * 3
            io.netty.buffer.ByteBuf r0 = buffer(r0)
            int r1 = r4.length
            r2 = 0
        Lf:
            if (r2 >= r1) goto L19
            r3 = r4[r2]
            r0.writeMedium(r3)
            int r2 = r2 + 1
            goto Lf
        L19:
            return r0
        L1a:
            io.netty.buffer.ByteBuf r4 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            return r4
    }

    public static io.netty.buffer.ByteBuf copyShort(int r1) {
            r0 = 2
            io.netty.buffer.ByteBuf r0 = buffer(r0)
            r0.writeShort(r1)
            return r0
    }

    public static io.netty.buffer.ByteBuf copyShort(int... r4) {
            if (r4 == 0) goto L1a
            int r0 = r4.length
            if (r0 != 0) goto L6
            goto L1a
        L6:
            int r0 = r4.length
            int r0 = r0 * 2
            io.netty.buffer.ByteBuf r0 = buffer(r0)
            int r1 = r4.length
            r2 = 0
        Lf:
            if (r2 >= r1) goto L19
            r3 = r4[r2]
            r0.writeShort(r3)
            int r2 = r2 + 1
            goto Lf
        L19:
            return r0
        L1a:
            io.netty.buffer.ByteBuf r4 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            return r4
    }

    public static io.netty.buffer.ByteBuf copyShort(short... r4) {
            if (r4 == 0) goto L1a
            int r0 = r4.length
            if (r0 != 0) goto L6
            goto L1a
        L6:
            int r0 = r4.length
            int r0 = r0 * 2
            io.netty.buffer.ByteBuf r0 = buffer(r0)
            int r1 = r4.length
            r2 = 0
        Lf:
            if (r2 >= r1) goto L19
            short r3 = r4[r2]
            r0.writeShort(r3)
            int r2 = r2 + 1
            goto Lf
        L19:
            return r0
        L1a:
            io.netty.buffer.ByteBuf r4 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            return r4
    }

    public static io.netty.buffer.ByteBuf directBuffer() {
            io.netty.buffer.ByteBufAllocator r0 = io.netty.buffer.Unpooled.ALLOC
            io.netty.buffer.ByteBuf r0 = r0.directBuffer()
            return r0
    }

    public static io.netty.buffer.ByteBuf directBuffer(int r1) {
            io.netty.buffer.ByteBufAllocator r0 = io.netty.buffer.Unpooled.ALLOC
            io.netty.buffer.ByteBuf r1 = r0.directBuffer(r1)
            return r1
    }

    public static io.netty.buffer.ByteBuf directBuffer(int r1, int r2) {
            io.netty.buffer.ByteBufAllocator r0 = io.netty.buffer.Unpooled.ALLOC
            io.netty.buffer.ByteBuf r1 = r0.directBuffer(r1, r2)
            return r1
    }

    @java.lang.Deprecated
    public static io.netty.buffer.ByteBuf unmodifiableBuffer(io.netty.buffer.ByteBuf r2) {
            java.nio.ByteOrder r0 = r2.order()
            java.nio.ByteOrder r1 = io.netty.buffer.Unpooled.BIG_ENDIAN
            if (r0 != r1) goto Le
            io.netty.buffer.ReadOnlyByteBuf r0 = new io.netty.buffer.ReadOnlyByteBuf
            r0.<init>(r2)
            return r0
        Le:
            io.netty.buffer.ReadOnlyByteBuf r0 = new io.netty.buffer.ReadOnlyByteBuf
            io.netty.buffer.ByteBuf r2 = r2.order(r1)
            r0.<init>(r2)
            java.nio.ByteOrder r2 = io.netty.buffer.Unpooled.LITTLE_ENDIAN
            io.netty.buffer.ByteBuf r2 = r0.order(r2)
            return r2
    }

    @java.lang.Deprecated
    public static io.netty.buffer.ByteBuf unmodifiableBuffer(io.netty.buffer.ByteBuf... r1) {
            r0 = 1
            io.netty.buffer.ByteBuf r1 = wrappedUnmodifiableBuffer(r0, r1)
            return r1
    }

    public static io.netty.buffer.ByteBuf unreleasableBuffer(io.netty.buffer.ByteBuf r1) {
            io.netty.buffer.UnreleasableByteBuf r0 = new io.netty.buffer.UnreleasableByteBuf
            r0.<init>(r1)
            return r0
    }

    static <T> io.netty.buffer.ByteBuf wrappedBuffer(int r10, io.netty.buffer.CompositeByteBuf.ByteWrapper<T> r11, T[] r12) {
            int r0 = r12.length
            if (r0 == 0) goto L3b
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L2a
            int r0 = r12.length
            r9 = 0
        L9:
            if (r9 >= r0) goto L3b
            r1 = r12[r9]
            if (r1 != 0) goto L12
            io.netty.buffer.ByteBuf r10 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            return r10
        L12:
            boolean r1 = r11.isEmpty(r1)
            if (r1 != 0) goto L24
            io.netty.buffer.CompositeByteBuf r3 = new io.netty.buffer.CompositeByteBuf
            io.netty.buffer.ByteBufAllocator r4 = io.netty.buffer.Unpooled.ALLOC
            r5 = 0
            r6 = r10
            r7 = r11
            r8 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        L24:
            r6 = r10
            r7 = r11
            r8 = r12
            int r9 = r9 + 1
            goto L9
        L2a:
            r7 = r11
            r8 = r12
            r10 = r8[r2]
            boolean r10 = r7.isEmpty(r10)
            if (r10 != 0) goto L3b
            r10 = r8[r2]
            io.netty.buffer.ByteBuf r10 = r7.wrap(r10)
            return r10
        L3b:
            io.netty.buffer.ByteBuf r10 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            return r10
    }

    public static io.netty.buffer.ByteBuf wrappedBuffer(int r9, io.netty.buffer.ByteBuf... r10) {
            int r0 = r10.length
            if (r0 == 0) goto L3d
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L26
            r8 = 0
        L8:
            int r0 = r10.length
            if (r8 >= r0) goto L3d
            r0 = r10[r8]
            boolean r1 = r0.isReadable()
            if (r1 == 0) goto L1e
            io.netty.buffer.CompositeByteBuf r3 = new io.netty.buffer.CompositeByteBuf
            io.netty.buffer.ByteBufAllocator r4 = io.netty.buffer.Unpooled.ALLOC
            r5 = 0
            r6 = r9
            r7 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L1e:
            r6 = r9
            r7 = r10
            r0.release()
            int r8 = r8 + 1
            goto L8
        L26:
            r7 = r10
            r9 = r7[r1]
            boolean r10 = r9.isReadable()
            if (r10 == 0) goto L3a
            java.nio.ByteOrder r10 = io.netty.buffer.Unpooled.BIG_ENDIAN
            io.netty.buffer.ByteBuf r9 = r9.order(r10)
            io.netty.buffer.ByteBuf r9 = wrappedBuffer(r9)
            return r9
        L3a:
            r9.release()
        L3d:
            io.netty.buffer.ByteBuf r9 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            return r9
    }

    public static io.netty.buffer.ByteBuf wrappedBuffer(int r1, java.nio.ByteBuffer... r2) {
            io.netty.buffer.CompositeByteBuf$ByteWrapper<java.nio.ByteBuffer> r0 = io.netty.buffer.CompositeByteBuf.BYTE_BUFFER_WRAPPER
            io.netty.buffer.ByteBuf r1 = wrappedBuffer(r1, r0, r2)
            return r1
    }

    public static io.netty.buffer.ByteBuf wrappedBuffer(int r1, byte[]... r2) {
            io.netty.buffer.CompositeByteBuf$ByteWrapper<byte[]> r0 = io.netty.buffer.CompositeByteBuf.BYTE_ARRAY_WRAPPER
            io.netty.buffer.ByteBuf r1 = wrappedBuffer(r1, r0, r2)
            return r1
    }

    public static io.netty.buffer.ByteBuf wrappedBuffer(long r6, int r8, boolean r9) {
            io.netty.buffer.WrappedUnpooledUnsafeDirectByteBuf r0 = new io.netty.buffer.WrappedUnpooledUnsafeDirectByteBuf
            io.netty.buffer.ByteBufAllocator r1 = io.netty.buffer.Unpooled.ALLOC
            r2 = r6
            r4 = r8
            r5 = r9
            r0.<init>(r1, r2, r4, r5)
            return r0
    }

    public static io.netty.buffer.ByteBuf wrappedBuffer(io.netty.buffer.ByteBuf r1) {
            boolean r0 = r1.isReadable()
            if (r0 == 0) goto Lb
            io.netty.buffer.ByteBuf r1 = r1.slice()
            return r1
        Lb:
            r1.release()
            io.netty.buffer.ByteBuf r1 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            return r1
    }

    public static io.netty.buffer.ByteBuf wrappedBuffer(java.nio.ByteBuffer r3) {
            boolean r0 = r3.hasRemaining()
            if (r0 != 0) goto L9
            io.netty.buffer.ByteBuf r3 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            return r3
        L9:
            boolean r0 = r3.isDirect()
            if (r0 != 0) goto L33
            boolean r0 = r3.hasArray()
            if (r0 == 0) goto L33
            byte[] r0 = r3.array()
            int r1 = r3.arrayOffset()
            int r2 = r3.position()
            int r1 = r1 + r2
            int r2 = r3.remaining()
            io.netty.buffer.ByteBuf r0 = wrappedBuffer(r0, r1, r2)
            java.nio.ByteOrder r3 = r3.order()
            io.netty.buffer.ByteBuf r3 = r0.order(r3)
            return r3
        L33:
            boolean r0 = io.netty.util.internal.PlatformDependent.hasUnsafe()
            if (r0 == 0) goto L61
            boolean r0 = r3.isReadOnly()
            if (r0 == 0) goto L55
            boolean r0 = r3.isDirect()
            if (r0 == 0) goto L4d
            io.netty.buffer.ReadOnlyUnsafeDirectByteBuf r0 = new io.netty.buffer.ReadOnlyUnsafeDirectByteBuf
            io.netty.buffer.ByteBufAllocator r1 = io.netty.buffer.Unpooled.ALLOC
            r0.<init>(r1, r3)
            return r0
        L4d:
            io.netty.buffer.ReadOnlyByteBufferBuf r0 = new io.netty.buffer.ReadOnlyByteBufferBuf
            io.netty.buffer.ByteBufAllocator r1 = io.netty.buffer.Unpooled.ALLOC
            r0.<init>(r1, r3)
            return r0
        L55:
            io.netty.buffer.UnpooledUnsafeDirectByteBuf r0 = new io.netty.buffer.UnpooledUnsafeDirectByteBuf
            io.netty.buffer.ByteBufAllocator r1 = io.netty.buffer.Unpooled.ALLOC
            int r2 = r3.remaining()
            r0.<init>(r1, r3, r2)
            return r0
        L61:
            boolean r0 = r3.isReadOnly()
            if (r0 == 0) goto L6f
            io.netty.buffer.ReadOnlyByteBufferBuf r0 = new io.netty.buffer.ReadOnlyByteBufferBuf
            io.netty.buffer.ByteBufAllocator r1 = io.netty.buffer.Unpooled.ALLOC
            r0.<init>(r1, r3)
            return r0
        L6f:
            io.netty.buffer.UnpooledDirectByteBuf r0 = new io.netty.buffer.UnpooledDirectByteBuf
            io.netty.buffer.ByteBufAllocator r1 = io.netty.buffer.Unpooled.ALLOC
            int r2 = r3.remaining()
            r0.<init>(r1, r3, r2)
            return r0
    }

    public static io.netty.buffer.ByteBuf wrappedBuffer(byte[] r3) {
            int r0 = r3.length
            if (r0 != 0) goto L6
            io.netty.buffer.ByteBuf r3 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            return r3
        L6:
            io.netty.buffer.UnpooledHeapByteBuf r0 = new io.netty.buffer.UnpooledHeapByteBuf
            io.netty.buffer.ByteBufAllocator r1 = io.netty.buffer.Unpooled.ALLOC
            int r2 = r3.length
            r0.<init>(r1, r3, r2)
            return r0
    }

    public static io.netty.buffer.ByteBuf wrappedBuffer(byte[] r1, int r2, int r3) {
            if (r3 != 0) goto L5
            io.netty.buffer.ByteBuf r1 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            return r1
        L5:
            if (r2 != 0) goto Lf
            int r0 = r1.length
            if (r3 != r0) goto Lf
            io.netty.buffer.ByteBuf r1 = wrappedBuffer(r1)
            return r1
        Lf:
            io.netty.buffer.ByteBuf r1 = wrappedBuffer(r1)
            io.netty.buffer.ByteBuf r1 = r1.slice(r2, r3)
            return r1
    }

    public static io.netty.buffer.ByteBuf wrappedBuffer(io.netty.buffer.ByteBuf... r1) {
            int r0 = r1.length
            io.netty.buffer.ByteBuf r1 = wrappedBuffer(r0, r1)
            return r1
    }

    public static io.netty.buffer.ByteBuf wrappedBuffer(java.nio.ByteBuffer... r1) {
            int r0 = r1.length
            io.netty.buffer.ByteBuf r1 = wrappedBuffer(r0, r1)
            return r1
    }

    public static io.netty.buffer.ByteBuf wrappedBuffer(byte[]... r1) {
            int r0 = r1.length
            io.netty.buffer.ByteBuf r1 = wrappedBuffer(r0, r1)
            return r1
    }

    private static io.netty.buffer.ByteBuf wrappedUnmodifiableBuffer(boolean r2, io.netty.buffer.ByteBuf... r3) {
            int r0 = r3.length
            if (r0 == 0) goto L22
            r1 = 1
            if (r0 == r1) goto L1a
            if (r2 == 0) goto L12
            int r2 = r3.length
            java.lang.Class<io.netty.buffer.ByteBuf[]> r0 = io.netty.buffer.ByteBuf[].class
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r3, r2, r0)
            r3 = r2
            io.netty.buffer.ByteBuf[] r3 = (io.netty.buffer.ByteBuf[]) r3
        L12:
            io.netty.buffer.FixedCompositeByteBuf r2 = new io.netty.buffer.FixedCompositeByteBuf
            io.netty.buffer.ByteBufAllocator r0 = io.netty.buffer.Unpooled.ALLOC
            r2.<init>(r0, r3)
            return r2
        L1a:
            r2 = 0
            r2 = r3[r2]
            io.netty.buffer.ByteBuf r2 = r2.asReadOnly()
            return r2
        L22:
            io.netty.buffer.ByteBuf r2 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            return r2
    }

    public static io.netty.buffer.ByteBuf wrappedUnmodifiableBuffer(io.netty.buffer.ByteBuf... r1) {
            r0 = 0
            io.netty.buffer.ByteBuf r1 = wrappedUnmodifiableBuffer(r0, r1)
            return r1
    }
}
