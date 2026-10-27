package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class UnsafeByteBufUtil {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final boolean UNALIGNED = false;
    private static final byte ZERO = 0;

    static {
            boolean r0 = io.netty.util.internal.PlatformDependent.isUnaligned()
            io.netty.buffer.UnsafeByteBufUtil.UNALIGNED = r0
            return
    }

    private UnsafeByteBufUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    static io.netty.buffer.ByteBuf copy(io.netty.buffer.AbstractByteBuf r8, long r9, int r11, int r12) {
            r8.checkIndex(r11, r12)
            io.netty.buffer.ByteBufAllocator r0 = r8.alloc()
            int r1 = r8.maxCapacity()
            io.netty.buffer.ByteBuf r0 = r0.directBuffer(r12, r1)
            if (r12 == 0) goto L28
            boolean r1 = r0.hasMemoryAddress()
            if (r1 == 0) goto L25
            long r4 = r0.memoryAddress()
            long r6 = (long) r12
            r2 = r9
            io.netty.util.internal.PlatformDependent.copyMemory(r2, r4, r6)
            r8 = 0
            r0.setIndex(r8, r12)
            return r0
        L25:
            r0.writeBytes(r8, r11, r12)
        L28:
            return r0
    }

    static byte getByte(long r0) {
            byte r0 = io.netty.util.internal.PlatformDependent.getByte(r0)
            return r0
    }

    static byte getByte(byte[] r0, int r1) {
            byte r0 = io.netty.util.internal.PlatformDependent.getByte(r0, r1)
            return r0
    }

    private static void getBytes(long r6, byte[] r8, int r9, int r10, java.io.OutputStream r11, int r12) throws java.io.IOException {
            r0 = r6
        L1:
            int r6 = java.lang.Math.min(r10, r12)
            long r4 = (long) r6
            r2 = r8
            r3 = r9
            io.netty.util.internal.PlatformDependent.copyMemory(r0, r2, r3, r4)
            r11.write(r2, r3, r6)
            int r12 = r12 - r6
            long r0 = r0 + r4
            if (r12 > 0) goto L13
            return
        L13:
            r8 = r2
            r9 = r3
            goto L1
    }

    static void getBytes(io.netty.buffer.AbstractByteBuf r8, long r9, int r11, io.netty.buffer.ByteBuf r12, int r13, int r14) {
            r8.checkIndex(r11, r14)
            java.lang.String r0 = "dst"
            io.netty.util.internal.ObjectUtil.checkNotNull(r12, r0)
            int r0 = r12.capacity()
            boolean r0 = io.netty.util.internal.MathUtil.isOutOfBounds(r13, r14, r0)
            if (r0 != 0) goto L40
            boolean r0 = r12.hasMemoryAddress()
            if (r0 == 0) goto L25
            long r11 = r12.memoryAddress()
            long r0 = (long) r13
            long r4 = r11 + r0
            long r6 = (long) r14
            r2 = r9
            io.netty.util.internal.PlatformDependent.copyMemory(r2, r4, r6)
            return
        L25:
            r2 = r9
            boolean r9 = r12.hasArray()
            if (r9 == 0) goto L3c
            byte[] r10 = r12.array()
            int r8 = r12.arrayOffset()
            int r11 = r8 + r13
            long r12 = (long) r14
            r8 = r2
            io.netty.util.internal.PlatformDependent.copyMemory(r8, r10, r11, r12)
            return
        L3c:
            r12.setBytes(r13, r8, r11, r14)
            return
        L40:
            java.lang.IndexOutOfBoundsException r8 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "dstIndex: "
            r9.append(r10)
            r9.append(r13)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
    }

    static void getBytes(io.netty.buffer.AbstractByteBuf r7, long r8, int r10, java.io.OutputStream r11, int r12) throws java.io.IOException {
            r7.checkIndex(r10, r12)
            if (r12 == 0) goto L45
            r10 = 8192(0x2000, float:1.148E-41)
            int r4 = java.lang.Math.min(r12, r10)
            r10 = 1024(0x400, float:1.435E-42)
            if (r4 <= r10) goto L19
            io.netty.buffer.ByteBufAllocator r10 = r7.alloc()
            boolean r10 = r10.isDirectBufferPooled()
            if (r10 != 0) goto L1d
        L19:
            r0 = r8
            r5 = r11
            r6 = r12
            goto L3d
        L1d:
            io.netty.buffer.ByteBufAllocator r7 = r7.alloc()
            io.netty.buffer.ByteBuf r7 = r7.heapBuffer(r4)
            byte[] r2 = r7.array()     // Catch: java.lang.Throwable -> L37
            int r3 = r7.arrayOffset()     // Catch: java.lang.Throwable -> L37
            r0 = r8
            r5 = r11
            r6 = r12
            getBytes(r0, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L37
            r7.release()
            return
        L37:
            r0 = move-exception
            r8 = r0
            r7.release()
            throw r8
        L3d:
            byte[] r2 = io.netty.buffer.ByteBufUtil.threadLocalTempArray(r4)
            r3 = 0
            getBytes(r0, r2, r3, r4, r5, r6)
        L45:
            return
    }

    static void getBytes(io.netty.buffer.AbstractByteBuf r10, long r11, int r13, java.nio.ByteBuffer r14) {
            int r0 = r14.remaining()
            r10.checkIndex(r13, r0)
            int r13 = r14.remaining()
            if (r13 != 0) goto Le
            return
        Le:
            boolean r13 = r14.isDirect()
            if (r13 == 0) goto L41
            boolean r10 = r14.isReadOnly()
            if (r10 != 0) goto L3b
            long r0 = io.netty.util.internal.PlatformDependent.directBufferAddress(r14)
            int r10 = r14.position()
            long r2 = (long) r10
            long r6 = r0 + r2
            int r10 = r14.remaining()
            long r8 = (long) r10
            r4 = r11
            io.netty.util.internal.PlatformDependent.copyMemory(r4, r6, r8)
            int r10 = r14.position()
            int r11 = r14.remaining()
            int r10 = r10 + r11
            r14.position(r10)
            return
        L3b:
            java.nio.ReadOnlyBufferException r10 = new java.nio.ReadOnlyBufferException
            r10.<init>()
            throw r10
        L41:
            r0 = r11
            boolean r11 = r14.hasArray()
            if (r11 == 0) goto L6b
            byte[] r2 = r14.array()
            int r10 = r14.arrayOffset()
            int r11 = r14.position()
            int r3 = r10 + r11
            int r10 = r14.remaining()
            long r4 = (long) r10
            io.netty.util.internal.PlatformDependent.copyMemory(r0, r2, r3, r4)
            int r10 = r14.position()
            int r11 = r14.remaining()
            int r10 = r10 + r11
            r14.position(r10)
            return
        L6b:
            java.nio.ByteBuffer r10 = r10.nioBuffer()
            r14.put(r10)
            return
    }

    static void getBytes(io.netty.buffer.AbstractByteBuf r2, long r3, int r5, byte[] r6, int r7, int r8) {
            r2.checkIndex(r5, r8)
            java.lang.String r2 = "dst"
            io.netty.util.internal.ObjectUtil.checkNotNull(r6, r2)
            int r2 = r6.length
            boolean r2 = io.netty.util.internal.MathUtil.isOutOfBounds(r7, r8, r2)
            if (r2 != 0) goto L19
            if (r8 == 0) goto L18
            long r0 = (long) r8
            r5 = r6
            r6 = r7
            r7 = r0
            io.netty.util.internal.PlatformDependent.copyMemory(r3, r5, r6, r7)
        L18:
            return
        L19:
            r6 = r7
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "dstIndex: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    static int getInt(long r3) {
            boolean r0 = io.netty.buffer.UnsafeByteBufUtil.UNALIGNED
            if (r0 == 0) goto L12
            int r3 = io.netty.util.internal.PlatformDependent.getInt(r3)
            boolean r4 = io.netty.util.internal.PlatformDependent.BIG_ENDIAN_NATIVE_ORDER
            if (r4 == 0) goto Ld
            return r3
        Ld:
            int r3 = java.lang.Integer.reverseBytes(r3)
            return r3
        L12:
            byte r0 = io.netty.util.internal.PlatformDependent.getByte(r3)
            int r0 = r0 << 24
            r1 = 1
            long r1 = r1 + r3
            byte r1 = io.netty.util.internal.PlatformDependent.getByte(r1)
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            r1 = 2
            long r1 = r1 + r3
            byte r1 = io.netty.util.internal.PlatformDependent.getByte(r1)
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            r1 = 3
            long r3 = r3 + r1
            byte r3 = io.netty.util.internal.PlatformDependent.getByte(r3)
            r3 = r3 & 255(0xff, float:3.57E-43)
            r3 = r3 | r0
            return r3
    }

    static int getInt(byte[] r2, int r3) {
            boolean r0 = io.netty.buffer.UnsafeByteBufUtil.UNALIGNED
            if (r0 == 0) goto L12
            int r2 = io.netty.util.internal.PlatformDependent.getInt(r2, r3)
            boolean r3 = io.netty.util.internal.PlatformDependent.BIG_ENDIAN_NATIVE_ORDER
            if (r3 == 0) goto Ld
            return r2
        Ld:
            int r2 = java.lang.Integer.reverseBytes(r2)
            return r2
        L12:
            byte r0 = io.netty.util.internal.PlatformDependent.getByte(r2, r3)
            int r0 = r0 << 24
            int r1 = r3 + 1
            byte r1 = io.netty.util.internal.PlatformDependent.getByte(r2, r1)
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            int r1 = r3 + 2
            byte r1 = io.netty.util.internal.PlatformDependent.getByte(r2, r1)
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            int r3 = r3 + 3
            byte r2 = io.netty.util.internal.PlatformDependent.getByte(r2, r3)
            r2 = r2 & 255(0xff, float:3.57E-43)
            r2 = r2 | r0
            return r2
    }

    static int getIntLE(long r3) {
            boolean r0 = io.netty.buffer.UnsafeByteBufUtil.UNALIGNED
            if (r0 == 0) goto L11
            int r3 = io.netty.util.internal.PlatformDependent.getInt(r3)
            boolean r4 = io.netty.util.internal.PlatformDependent.BIG_ENDIAN_NATIVE_ORDER
            if (r4 == 0) goto L10
            int r3 = java.lang.Integer.reverseBytes(r3)
        L10:
            return r3
        L11:
            byte r0 = io.netty.util.internal.PlatformDependent.getByte(r3)
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 1
            long r1 = r1 + r3
            byte r1 = io.netty.util.internal.PlatformDependent.getByte(r1)
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            r1 = 2
            long r1 = r1 + r3
            byte r1 = io.netty.util.internal.PlatformDependent.getByte(r1)
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            r1 = 3
            long r3 = r3 + r1
            byte r3 = io.netty.util.internal.PlatformDependent.getByte(r3)
            int r3 = r3 << 24
            r3 = r3 | r0
            return r3
    }

    static int getIntLE(byte[] r2, int r3) {
            boolean r0 = io.netty.buffer.UnsafeByteBufUtil.UNALIGNED
            if (r0 == 0) goto L11
            int r2 = io.netty.util.internal.PlatformDependent.getInt(r2, r3)
            boolean r3 = io.netty.util.internal.PlatformDependent.BIG_ENDIAN_NATIVE_ORDER
            if (r3 == 0) goto L10
            int r2 = java.lang.Integer.reverseBytes(r2)
        L10:
            return r2
        L11:
            byte r0 = io.netty.util.internal.PlatformDependent.getByte(r2, r3)
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r3 + 1
            byte r1 = io.netty.util.internal.PlatformDependent.getByte(r2, r1)
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            int r1 = r3 + 2
            byte r1 = io.netty.util.internal.PlatformDependent.getByte(r2, r1)
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            int r3 = r3 + 3
            byte r2 = io.netty.util.internal.PlatformDependent.getByte(r2, r3)
            int r2 = r2 << 24
            r2 = r2 | r0
            return r2
    }

    static long getLong(long r7) {
            boolean r0 = io.netty.buffer.UnsafeByteBufUtil.UNALIGNED
            if (r0 == 0) goto L12
            long r7 = io.netty.util.internal.PlatformDependent.getLong(r7)
            boolean r0 = io.netty.util.internal.PlatformDependent.BIG_ENDIAN_NATIVE_ORDER
            if (r0 == 0) goto Ld
            return r7
        Ld:
            long r7 = java.lang.Long.reverseBytes(r7)
            return r7
        L12:
            byte r0 = io.netty.util.internal.PlatformDependent.getByte(r7)
            long r0 = (long) r0
            r2 = 56
            long r0 = r0 << r2
            r2 = 1
            long r2 = r2 + r7
            byte r2 = io.netty.util.internal.PlatformDependent.getByte(r2)
            long r2 = (long) r2
            r4 = 255(0xff, double:1.26E-321)
            long r2 = r2 & r4
            r6 = 48
            long r2 = r2 << r6
            long r0 = r0 | r2
            r2 = 2
            long r2 = r2 + r7
            byte r2 = io.netty.util.internal.PlatformDependent.getByte(r2)
            long r2 = (long) r2
            long r2 = r2 & r4
            r6 = 40
            long r2 = r2 << r6
            long r0 = r0 | r2
            r2 = 3
            long r2 = r2 + r7
            byte r2 = io.netty.util.internal.PlatformDependent.getByte(r2)
            long r2 = (long) r2
            long r2 = r2 & r4
            r6 = 32
            long r2 = r2 << r6
            long r0 = r0 | r2
            r2 = 4
            long r2 = r2 + r7
            byte r2 = io.netty.util.internal.PlatformDependent.getByte(r2)
            long r2 = (long) r2
            long r2 = r2 & r4
            r6 = 24
            long r2 = r2 << r6
            long r0 = r0 | r2
            r2 = 5
            long r2 = r2 + r7
            byte r2 = io.netty.util.internal.PlatformDependent.getByte(r2)
            long r2 = (long) r2
            long r2 = r2 & r4
            r6 = 16
            long r2 = r2 << r6
            long r0 = r0 | r2
            r2 = 6
            long r2 = r2 + r7
            byte r2 = io.netty.util.internal.PlatformDependent.getByte(r2)
            long r2 = (long) r2
            long r2 = r2 & r4
            r6 = 8
            long r2 = r2 << r6
            long r0 = r0 | r2
            r2 = 7
            long r7 = r7 + r2
            byte r7 = io.netty.util.internal.PlatformDependent.getByte(r7)
            long r7 = (long) r7
            long r7 = r7 & r4
            long r7 = r7 | r0
            return r7
    }

    static long getLong(byte[] r7, int r8) {
            boolean r0 = io.netty.buffer.UnsafeByteBufUtil.UNALIGNED
            if (r0 == 0) goto L12
            long r7 = io.netty.util.internal.PlatformDependent.getLong(r7, r8)
            boolean r0 = io.netty.util.internal.PlatformDependent.BIG_ENDIAN_NATIVE_ORDER
            if (r0 == 0) goto Ld
            return r7
        Ld:
            long r7 = java.lang.Long.reverseBytes(r7)
            return r7
        L12:
            byte r0 = io.netty.util.internal.PlatformDependent.getByte(r7, r8)
            long r0 = (long) r0
            r2 = 56
            long r0 = r0 << r2
            int r2 = r8 + 1
            byte r2 = io.netty.util.internal.PlatformDependent.getByte(r7, r2)
            long r2 = (long) r2
            r4 = 255(0xff, double:1.26E-321)
            long r2 = r2 & r4
            r6 = 48
            long r2 = r2 << r6
            long r0 = r0 | r2
            int r2 = r8 + 2
            byte r2 = io.netty.util.internal.PlatformDependent.getByte(r7, r2)
            long r2 = (long) r2
            long r2 = r2 & r4
            r6 = 40
            long r2 = r2 << r6
            long r0 = r0 | r2
            int r2 = r8 + 3
            byte r2 = io.netty.util.internal.PlatformDependent.getByte(r7, r2)
            long r2 = (long) r2
            long r2 = r2 & r4
            r6 = 32
            long r2 = r2 << r6
            long r0 = r0 | r2
            int r2 = r8 + 4
            byte r2 = io.netty.util.internal.PlatformDependent.getByte(r7, r2)
            long r2 = (long) r2
            long r2 = r2 & r4
            r6 = 24
            long r2 = r2 << r6
            long r0 = r0 | r2
            int r2 = r8 + 5
            byte r2 = io.netty.util.internal.PlatformDependent.getByte(r7, r2)
            long r2 = (long) r2
            long r2 = r2 & r4
            r6 = 16
            long r2 = r2 << r6
            long r0 = r0 | r2
            int r2 = r8 + 6
            byte r2 = io.netty.util.internal.PlatformDependent.getByte(r7, r2)
            long r2 = (long) r2
            long r2 = r2 & r4
            r6 = 8
            long r2 = r2 << r6
            long r0 = r0 | r2
            int r8 = r8 + 7
            byte r7 = io.netty.util.internal.PlatformDependent.getByte(r7, r8)
            long r7 = (long) r7
            long r7 = r7 & r4
            long r7 = r7 | r0
            return r7
    }

    static long getLongLE(long r7) {
            boolean r0 = io.netty.buffer.UnsafeByteBufUtil.UNALIGNED
            if (r0 == 0) goto L11
            long r7 = io.netty.util.internal.PlatformDependent.getLong(r7)
            boolean r0 = io.netty.util.internal.PlatformDependent.BIG_ENDIAN_NATIVE_ORDER
            if (r0 == 0) goto L10
            long r7 = java.lang.Long.reverseBytes(r7)
        L10:
            return r7
        L11:
            byte r0 = io.netty.util.internal.PlatformDependent.getByte(r7)
            long r0 = (long) r0
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            r4 = 1
            long r4 = r4 + r7
            byte r4 = io.netty.util.internal.PlatformDependent.getByte(r4)
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 8
            long r4 = r4 << r6
            long r0 = r0 | r4
            r4 = 2
            long r4 = r4 + r7
            byte r4 = io.netty.util.internal.PlatformDependent.getByte(r4)
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 16
            long r4 = r4 << r6
            long r0 = r0 | r4
            r4 = 3
            long r4 = r4 + r7
            byte r4 = io.netty.util.internal.PlatformDependent.getByte(r4)
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 24
            long r4 = r4 << r6
            long r0 = r0 | r4
            r4 = 4
            long r4 = r4 + r7
            byte r4 = io.netty.util.internal.PlatformDependent.getByte(r4)
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 32
            long r4 = r4 << r6
            long r0 = r0 | r4
            r4 = 5
            long r4 = r4 + r7
            byte r4 = io.netty.util.internal.PlatformDependent.getByte(r4)
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 40
            long r4 = r4 << r6
            long r0 = r0 | r4
            r4 = 6
            long r4 = r4 + r7
            byte r4 = io.netty.util.internal.PlatformDependent.getByte(r4)
            long r4 = (long) r4
            long r2 = r2 & r4
            r4 = 48
            long r2 = r2 << r4
            long r0 = r0 | r2
            r2 = 7
            long r7 = r7 + r2
            byte r7 = io.netty.util.internal.PlatformDependent.getByte(r7)
            long r7 = (long) r7
            r2 = 56
            long r7 = r7 << r2
            long r7 = r7 | r0
            return r7
    }

    static long getLongLE(byte[] r7, int r8) {
            boolean r0 = io.netty.buffer.UnsafeByteBufUtil.UNALIGNED
            if (r0 == 0) goto L11
            long r7 = io.netty.util.internal.PlatformDependent.getLong(r7, r8)
            boolean r0 = io.netty.util.internal.PlatformDependent.BIG_ENDIAN_NATIVE_ORDER
            if (r0 == 0) goto L10
            long r7 = java.lang.Long.reverseBytes(r7)
        L10:
            return r7
        L11:
            byte r0 = io.netty.util.internal.PlatformDependent.getByte(r7, r8)
            long r0 = (long) r0
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            int r4 = r8 + 1
            byte r4 = io.netty.util.internal.PlatformDependent.getByte(r7, r4)
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 8
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 2
            byte r4 = io.netty.util.internal.PlatformDependent.getByte(r7, r4)
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 16
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 3
            byte r4 = io.netty.util.internal.PlatformDependent.getByte(r7, r4)
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 24
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 4
            byte r4 = io.netty.util.internal.PlatformDependent.getByte(r7, r4)
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 32
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 5
            byte r4 = io.netty.util.internal.PlatformDependent.getByte(r7, r4)
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 40
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 6
            byte r4 = io.netty.util.internal.PlatformDependent.getByte(r7, r4)
            long r4 = (long) r4
            long r2 = r2 & r4
            r4 = 48
            long r2 = r2 << r4
            long r0 = r0 | r2
            int r8 = r8 + 7
            byte r7 = io.netty.util.internal.PlatformDependent.getByte(r7, r8)
            long r7 = (long) r7
            r2 = 56
            long r7 = r7 << r2
            long r7 = r7 | r0
            return r7
    }

    static short getShort(long r3) {
            boolean r0 = io.netty.buffer.UnsafeByteBufUtil.UNALIGNED
            if (r0 == 0) goto L12
            short r3 = io.netty.util.internal.PlatformDependent.getShort(r3)
            boolean r4 = io.netty.util.internal.PlatformDependent.BIG_ENDIAN_NATIVE_ORDER
            if (r4 == 0) goto Ld
            return r3
        Ld:
            short r3 = java.lang.Short.reverseBytes(r3)
            return r3
        L12:
            byte r0 = io.netty.util.internal.PlatformDependent.getByte(r3)
            int r0 = r0 << 8
            r1 = 1
            long r3 = r3 + r1
            byte r3 = io.netty.util.internal.PlatformDependent.getByte(r3)
            r3 = r3 & 255(0xff, float:3.57E-43)
            r3 = r3 | r0
            short r3 = (short) r3
            return r3
    }

    static short getShort(byte[] r1, int r2) {
            boolean r0 = io.netty.buffer.UnsafeByteBufUtil.UNALIGNED
            if (r0 == 0) goto L12
            short r1 = io.netty.util.internal.PlatformDependent.getShort(r1, r2)
            boolean r2 = io.netty.util.internal.PlatformDependent.BIG_ENDIAN_NATIVE_ORDER
            if (r2 == 0) goto Ld
            return r1
        Ld:
            short r1 = java.lang.Short.reverseBytes(r1)
            return r1
        L12:
            byte r0 = io.netty.util.internal.PlatformDependent.getByte(r1, r2)
            int r0 = r0 << 8
            int r2 = r2 + 1
            byte r1 = io.netty.util.internal.PlatformDependent.getByte(r1, r2)
            r1 = r1 & 255(0xff, float:3.57E-43)
            r1 = r1 | r0
            short r1 = (short) r1
            return r1
    }

    static short getShortLE(long r3) {
            boolean r0 = io.netty.buffer.UnsafeByteBufUtil.UNALIGNED
            if (r0 == 0) goto L11
            short r3 = io.netty.util.internal.PlatformDependent.getShort(r3)
            boolean r4 = io.netty.util.internal.PlatformDependent.BIG_ENDIAN_NATIVE_ORDER
            if (r4 == 0) goto L10
            short r3 = java.lang.Short.reverseBytes(r3)
        L10:
            return r3
        L11:
            byte r0 = io.netty.util.internal.PlatformDependent.getByte(r3)
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 1
            long r3 = r3 + r1
            byte r3 = io.netty.util.internal.PlatformDependent.getByte(r3)
            int r3 = r3 << 8
            r3 = r3 | r0
            short r3 = (short) r3
            return r3
    }

    static short getShortLE(byte[] r1, int r2) {
            boolean r0 = io.netty.buffer.UnsafeByteBufUtil.UNALIGNED
            if (r0 == 0) goto L11
            short r1 = io.netty.util.internal.PlatformDependent.getShort(r1, r2)
            boolean r2 = io.netty.util.internal.PlatformDependent.BIG_ENDIAN_NATIVE_ORDER
            if (r2 == 0) goto L10
            short r1 = java.lang.Short.reverseBytes(r1)
        L10:
            return r1
        L11:
            byte r0 = io.netty.util.internal.PlatformDependent.getByte(r1, r2)
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r2 = r2 + 1
            byte r1 = io.netty.util.internal.PlatformDependent.getByte(r1, r2)
            int r1 = r1 << 8
            r1 = r1 | r0
            short r1 = (short) r1
            return r1
    }

    static int getUnsignedMedium(long r4) {
            boolean r0 = io.netty.buffer.UnsafeByteBufUtil.UNALIGNED
            r1 = 1
            if (r0 == 0) goto L27
            byte r0 = io.netty.util.internal.PlatformDependent.getByte(r4)
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 16
            boolean r3 = io.netty.util.internal.PlatformDependent.BIG_ENDIAN_NATIVE_ORDER
            if (r3 == 0) goto L18
            long r4 = r4 + r1
            short r4 = io.netty.util.internal.PlatformDependent.getShort(r4)
            goto L21
        L18:
            long r4 = r4 + r1
            short r4 = io.netty.util.internal.PlatformDependent.getShort(r4)
            short r4 = java.lang.Short.reverseBytes(r4)
        L21:
            r5 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r5
        L25:
            r4 = r4 | r0
            return r4
        L27:
            byte r0 = io.netty.util.internal.PlatformDependent.getByte(r4)
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 16
            long r1 = r1 + r4
            byte r1 = io.netty.util.internal.PlatformDependent.getByte(r1)
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            r1 = 2
            long r4 = r4 + r1
            byte r4 = io.netty.util.internal.PlatformDependent.getByte(r4)
            r4 = r4 & 255(0xff, float:3.57E-43)
            goto L25
    }

    static int getUnsignedMedium(byte[] r2, int r3) {
            boolean r0 = io.netty.buffer.UnsafeByteBufUtil.UNALIGNED
            if (r0 == 0) goto L27
            byte r0 = io.netty.util.internal.PlatformDependent.getByte(r2, r3)
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 16
            boolean r1 = io.netty.util.internal.PlatformDependent.BIG_ENDIAN_NATIVE_ORDER
            if (r1 == 0) goto L17
            int r3 = r3 + 1
            short r2 = io.netty.util.internal.PlatformDependent.getShort(r2, r3)
            goto L21
        L17:
            int r3 = r3 + 1
            short r2 = io.netty.util.internal.PlatformDependent.getShort(r2, r3)
            short r2 = java.lang.Short.reverseBytes(r2)
        L21:
            r3 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r3
        L25:
            r2 = r2 | r0
            return r2
        L27:
            byte r0 = io.netty.util.internal.PlatformDependent.getByte(r2, r3)
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 16
            int r1 = r3 + 1
            byte r1 = io.netty.util.internal.PlatformDependent.getByte(r2, r1)
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            int r3 = r3 + 2
            byte r2 = io.netty.util.internal.PlatformDependent.getByte(r2, r3)
            r2 = r2 & 255(0xff, float:3.57E-43)
            goto L25
    }

    static int getUnsignedMediumLE(long r4) {
            boolean r0 = io.netty.buffer.UnsafeByteBufUtil.UNALIGNED
            r1 = 1
            if (r0 == 0) goto L27
            byte r0 = io.netty.util.internal.PlatformDependent.getByte(r4)
            r0 = r0 & 255(0xff, float:3.57E-43)
            boolean r3 = io.netty.util.internal.PlatformDependent.BIG_ENDIAN_NATIVE_ORDER
            if (r3 == 0) goto L1a
            long r4 = r4 + r1
            short r4 = io.netty.util.internal.PlatformDependent.getShort(r4)
            short r4 = java.lang.Short.reverseBytes(r4)
            goto L1f
        L1a:
            long r4 = r4 + r1
            short r4 = io.netty.util.internal.PlatformDependent.getShort(r4)
        L1f:
            r5 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r5
            int r4 = r4 << 8
        L25:
            r4 = r4 | r0
            return r4
        L27:
            byte r0 = io.netty.util.internal.PlatformDependent.getByte(r4)
            r0 = r0 & 255(0xff, float:3.57E-43)
            long r1 = r1 + r4
            byte r1 = io.netty.util.internal.PlatformDependent.getByte(r1)
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            r1 = 2
            long r4 = r4 + r1
            byte r4 = io.netty.util.internal.PlatformDependent.getByte(r4)
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 16
            goto L25
    }

    static int getUnsignedMediumLE(byte[] r2, int r3) {
            boolean r0 = io.netty.buffer.UnsafeByteBufUtil.UNALIGNED
            if (r0 == 0) goto L27
            byte r0 = io.netty.util.internal.PlatformDependent.getByte(r2, r3)
            r0 = r0 & 255(0xff, float:3.57E-43)
            boolean r1 = io.netty.util.internal.PlatformDependent.BIG_ENDIAN_NATIVE_ORDER
            if (r1 == 0) goto L19
            int r3 = r3 + 1
            short r2 = io.netty.util.internal.PlatformDependent.getShort(r2, r3)
            short r2 = java.lang.Short.reverseBytes(r2)
            goto L1f
        L19:
            int r3 = r3 + 1
            short r2 = io.netty.util.internal.PlatformDependent.getShort(r2, r3)
        L1f:
            r3 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r3
            int r2 = r2 << 8
        L25:
            r2 = r2 | r0
            return r2
        L27:
            byte r0 = io.netty.util.internal.PlatformDependent.getByte(r2, r3)
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r3 + 1
            byte r1 = io.netty.util.internal.PlatformDependent.getByte(r2, r1)
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            int r3 = r3 + 2
            byte r2 = io.netty.util.internal.PlatformDependent.getByte(r2, r3)
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 16
            goto L25
    }

    static io.netty.buffer.UnpooledUnsafeDirectByteBuf newUnsafeDirectByteBuf(io.netty.buffer.ByteBufAllocator r1, int r2, int r3) {
            boolean r0 = io.netty.util.internal.PlatformDependent.useDirectBufferNoCleaner()
            if (r0 == 0) goto Lc
            io.netty.buffer.UnpooledUnsafeNoCleanerDirectByteBuf r0 = new io.netty.buffer.UnpooledUnsafeNoCleanerDirectByteBuf
            r0.<init>(r1, r2, r3)
            return r0
        Lc:
            io.netty.buffer.UnpooledUnsafeDirectByteBuf r0 = new io.netty.buffer.UnpooledUnsafeDirectByteBuf
            r0.<init>(r1, r2, r3)
            return r0
    }

    static void setByte(long r0, int r2) {
            byte r2 = (byte) r2
            io.netty.util.internal.PlatformDependent.putByte(r0, r2)
            return
    }

    static void setByte(byte[] r0, int r1, int r2) {
            byte r2 = (byte) r2
            io.netty.util.internal.PlatformDependent.putByte(r0, r1, r2)
            return
    }

    static int setBytes(io.netty.buffer.AbstractByteBuf r6, long r7, int r9, java.io.InputStream r10, int r11) throws java.io.IOException {
            r6.checkIndex(r9, r11)
            io.netty.buffer.ByteBufAllocator r6 = r6.alloc()
            io.netty.buffer.ByteBuf r6 = r6.heapBuffer(r11)
            byte[] r0 = r6.array()     // Catch: java.lang.Throwable -> L1f
            int r1 = r6.arrayOffset()     // Catch: java.lang.Throwable -> L1f
            int r9 = r10.read(r0, r1, r11)     // Catch: java.lang.Throwable -> L1f
            if (r9 <= 0) goto L22
            long r4 = (long) r9     // Catch: java.lang.Throwable -> L1f
            r2 = r7
            io.netty.util.internal.PlatformDependent.copyMemory(r0, r1, r2, r4)     // Catch: java.lang.Throwable -> L1f
            goto L22
        L1f:
            r0 = move-exception
            r7 = r0
            goto L26
        L22:
            r6.release()
            return r9
        L26:
            r6.release()
            throw r7
    }

    static void setBytes(io.netty.buffer.AbstractByteBuf r8, long r9, int r11, io.netty.buffer.ByteBuf r12, int r13, int r14) {
            r8.checkIndex(r11, r14)
            java.lang.String r0 = "src"
            io.netty.util.internal.ObjectUtil.checkNotNull(r12, r0)
            int r0 = r12.capacity()
            boolean r0 = io.netty.util.internal.MathUtil.isOutOfBounds(r13, r14, r0)
            if (r0 != 0) goto L41
            if (r14 == 0) goto L40
            boolean r0 = r12.hasMemoryAddress()
            if (r0 == 0) goto L27
            long r11 = r12.memoryAddress()
            long r0 = (long) r13
            long r2 = r11 + r0
            long r6 = (long) r14
            r4 = r9
            io.netty.util.internal.PlatformDependent.copyMemory(r2, r4, r6)
            return
        L27:
            r4 = r9
            boolean r9 = r12.hasArray()
            if (r9 == 0) goto L3d
            byte[] r8 = r12.array()
            int r9 = r12.arrayOffset()
            int r9 = r9 + r13
            long r12 = (long) r14
            r10 = r4
            io.netty.util.internal.PlatformDependent.copyMemory(r8, r9, r10, r12)
            return
        L3d:
            r12.getBytes(r13, r8, r11, r14)
        L40:
            return
        L41:
            java.lang.IndexOutOfBoundsException r8 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "srcIndex: "
            r9.append(r10)
            r9.append(r13)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
    }

    static void setBytes(io.netty.buffer.AbstractByteBuf r12, long r13, int r15, java.nio.ByteBuffer r16) {
            r4 = r16
            int r5 = r4.remaining()
            if (r5 != 0) goto L9
            return
        L9:
            boolean r0 = r4.isDirect()
            if (r0 == 0) goto L2b
            r12.checkIndex(r15, r5)
            long r0 = io.netty.util.internal.PlatformDependent.directBufferAddress(r4)
            int r12 = r4.position()
            long r2 = (long) r12
            long r6 = r0 + r2
            long r10 = (long) r5
            r8 = r13
            io.netty.util.internal.PlatformDependent.copyMemory(r6, r8, r10)
            int r12 = r4.position()
            int r12 = r12 + r5
            r4.position(r12)
            return
        L2b:
            boolean r0 = r4.hasArray()
            if (r0 == 0) goto L50
            r12.checkIndex(r15, r5)
            byte[] r6 = r4.array()
            int r12 = r4.arrayOffset()
            int r15 = r4.position()
            int r7 = r12 + r15
            long r10 = (long) r5
            r8 = r13
            io.netty.util.internal.PlatformDependent.copyMemory(r6, r7, r8, r10)
            int r12 = r4.position()
            int r12 = r12 + r5
            r4.position(r12)
            return
        L50:
            r0 = 8
            if (r5 >= r0) goto L5b
            r0 = r12
            r1 = r13
            r3 = r15
            setSingleBytes(r0, r1, r3, r4, r5)
            return
        L5b:
            java.nio.ByteBuffer r12 = r12.internalNioBuffer(r15, r5)
            r12.put(r4)
            return
    }

    static void setBytes(io.netty.buffer.AbstractByteBuf r2, long r3, int r5, byte[] r6, int r7, int r8) {
            r2.checkIndex(r5, r8)
            if (r8 == 0) goto Ld
            long r0 = (long) r8
            r4 = r3
            r2 = r6
            r3 = r7
            r6 = r0
            io.netty.util.internal.PlatformDependent.copyMemory(r2, r3, r4, r6)
        Ld:
            return
    }

    static void setInt(long r3, int r5) {
            boolean r0 = io.netty.buffer.UnsafeByteBufUtil.UNALIGNED
            if (r0 == 0) goto L11
            boolean r0 = io.netty.util.internal.PlatformDependent.BIG_ENDIAN_NATIVE_ORDER
            if (r0 == 0) goto L9
            goto Ld
        L9:
            int r5 = java.lang.Integer.reverseBytes(r5)
        Ld:
            io.netty.util.internal.PlatformDependent.putInt(r3, r5)
            return
        L11:
            int r0 = r5 >>> 24
            byte r0 = (byte) r0
            io.netty.util.internal.PlatformDependent.putByte(r3, r0)
            r0 = 1
            long r0 = r0 + r3
            int r2 = r5 >>> 16
            byte r2 = (byte) r2
            io.netty.util.internal.PlatformDependent.putByte(r0, r2)
            r0 = 2
            long r0 = r0 + r3
            int r2 = r5 >>> 8
            byte r2 = (byte) r2
            io.netty.util.internal.PlatformDependent.putByte(r0, r2)
            r0 = 3
            long r3 = r3 + r0
            byte r5 = (byte) r5
            io.netty.util.internal.PlatformDependent.putByte(r3, r5)
            return
    }

    static void setInt(byte[] r2, int r3, int r4) {
            boolean r0 = io.netty.buffer.UnsafeByteBufUtil.UNALIGNED
            if (r0 == 0) goto L11
            boolean r0 = io.netty.util.internal.PlatformDependent.BIG_ENDIAN_NATIVE_ORDER
            if (r0 == 0) goto L9
            goto Ld
        L9:
            int r4 = java.lang.Integer.reverseBytes(r4)
        Ld:
            io.netty.util.internal.PlatformDependent.putInt(r2, r3, r4)
            return
        L11:
            int r0 = r4 >>> 24
            byte r0 = (byte) r0
            io.netty.util.internal.PlatformDependent.putByte(r2, r3, r0)
            int r0 = r3 + 1
            int r1 = r4 >>> 16
            byte r1 = (byte) r1
            io.netty.util.internal.PlatformDependent.putByte(r2, r0, r1)
            int r0 = r3 + 2
            int r1 = r4 >>> 8
            byte r1 = (byte) r1
            io.netty.util.internal.PlatformDependent.putByte(r2, r0, r1)
            int r3 = r3 + 3
            byte r4 = (byte) r4
            io.netty.util.internal.PlatformDependent.putByte(r2, r3, r4)
            return
    }

    static void setIntLE(long r3, int r5) {
            boolean r0 = io.netty.buffer.UnsafeByteBufUtil.UNALIGNED
            if (r0 == 0) goto L10
            boolean r0 = io.netty.util.internal.PlatformDependent.BIG_ENDIAN_NATIVE_ORDER
            if (r0 == 0) goto Lc
            int r5 = java.lang.Integer.reverseBytes(r5)
        Lc:
            io.netty.util.internal.PlatformDependent.putInt(r3, r5)
            return
        L10:
            byte r0 = (byte) r5
            io.netty.util.internal.PlatformDependent.putByte(r3, r0)
            r0 = 1
            long r0 = r0 + r3
            int r2 = r5 >>> 8
            byte r2 = (byte) r2
            io.netty.util.internal.PlatformDependent.putByte(r0, r2)
            r0 = 2
            long r0 = r0 + r3
            int r2 = r5 >>> 16
            byte r2 = (byte) r2
            io.netty.util.internal.PlatformDependent.putByte(r0, r2)
            r0 = 3
            long r3 = r3 + r0
            int r5 = r5 >>> 24
            byte r5 = (byte) r5
            io.netty.util.internal.PlatformDependent.putByte(r3, r5)
            return
    }

    static void setIntLE(byte[] r2, int r3, int r4) {
            boolean r0 = io.netty.buffer.UnsafeByteBufUtil.UNALIGNED
            if (r0 == 0) goto L10
            boolean r0 = io.netty.util.internal.PlatformDependent.BIG_ENDIAN_NATIVE_ORDER
            if (r0 == 0) goto Lc
            int r4 = java.lang.Integer.reverseBytes(r4)
        Lc:
            io.netty.util.internal.PlatformDependent.putInt(r2, r3, r4)
            return
        L10:
            byte r0 = (byte) r4
            io.netty.util.internal.PlatformDependent.putByte(r2, r3, r0)
            int r0 = r3 + 1
            int r1 = r4 >>> 8
            byte r1 = (byte) r1
            io.netty.util.internal.PlatformDependent.putByte(r2, r0, r1)
            int r0 = r3 + 2
            int r1 = r4 >>> 16
            byte r1 = (byte) r1
            io.netty.util.internal.PlatformDependent.putByte(r2, r0, r1)
            int r3 = r3 + 3
            int r4 = r4 >>> 24
            byte r4 = (byte) r4
            io.netty.util.internal.PlatformDependent.putByte(r2, r3, r4)
            return
    }

    static void setLong(long r4, long r6) {
            boolean r0 = io.netty.buffer.UnsafeByteBufUtil.UNALIGNED
            if (r0 == 0) goto L11
            boolean r0 = io.netty.util.internal.PlatformDependent.BIG_ENDIAN_NATIVE_ORDER
            if (r0 == 0) goto L9
            goto Ld
        L9:
            long r6 = java.lang.Long.reverseBytes(r6)
        Ld:
            io.netty.util.internal.PlatformDependent.putLong(r4, r6)
            return
        L11:
            r0 = 56
            long r0 = r6 >>> r0
            int r1 = (int) r0
            byte r0 = (byte) r1
            io.netty.util.internal.PlatformDependent.putByte(r4, r0)
            r0 = 1
            long r0 = r0 + r4
            r2 = 48
            long r2 = r6 >>> r2
            int r3 = (int) r2
            byte r2 = (byte) r3
            io.netty.util.internal.PlatformDependent.putByte(r0, r2)
            r0 = 2
            long r0 = r0 + r4
            r2 = 40
            long r2 = r6 >>> r2
            int r3 = (int) r2
            byte r2 = (byte) r3
            io.netty.util.internal.PlatformDependent.putByte(r0, r2)
            r0 = 3
            long r0 = r0 + r4
            r2 = 32
            long r2 = r6 >>> r2
            int r3 = (int) r2
            byte r2 = (byte) r3
            io.netty.util.internal.PlatformDependent.putByte(r0, r2)
            r0 = 4
            long r0 = r0 + r4
            r2 = 24
            long r2 = r6 >>> r2
            int r3 = (int) r2
            byte r2 = (byte) r3
            io.netty.util.internal.PlatformDependent.putByte(r0, r2)
            r0 = 5
            long r0 = r0 + r4
            r2 = 16
            long r2 = r6 >>> r2
            int r3 = (int) r2
            byte r2 = (byte) r3
            io.netty.util.internal.PlatformDependent.putByte(r0, r2)
            r0 = 6
            long r0 = r0 + r4
            r2 = 8
            long r2 = r6 >>> r2
            int r3 = (int) r2
            byte r2 = (byte) r3
            io.netty.util.internal.PlatformDependent.putByte(r0, r2)
            r0 = 7
            long r4 = r4 + r0
            int r7 = (int) r6
            byte r6 = (byte) r7
            io.netty.util.internal.PlatformDependent.putByte(r4, r6)
            return
    }

    static void setLong(byte[] r3, int r4, long r5) {
            boolean r0 = io.netty.buffer.UnsafeByteBufUtil.UNALIGNED
            if (r0 == 0) goto L11
            boolean r0 = io.netty.util.internal.PlatformDependent.BIG_ENDIAN_NATIVE_ORDER
            if (r0 == 0) goto L9
            goto Ld
        L9:
            long r5 = java.lang.Long.reverseBytes(r5)
        Ld:
            io.netty.util.internal.PlatformDependent.putLong(r3, r4, r5)
            return
        L11:
            r0 = 56
            long r0 = r5 >>> r0
            int r1 = (int) r0
            byte r0 = (byte) r1
            io.netty.util.internal.PlatformDependent.putByte(r3, r4, r0)
            int r0 = r4 + 1
            r1 = 48
            long r1 = r5 >>> r1
            int r2 = (int) r1
            byte r1 = (byte) r2
            io.netty.util.internal.PlatformDependent.putByte(r3, r0, r1)
            int r0 = r4 + 2
            r1 = 40
            long r1 = r5 >>> r1
            int r2 = (int) r1
            byte r1 = (byte) r2
            io.netty.util.internal.PlatformDependent.putByte(r3, r0, r1)
            int r0 = r4 + 3
            r1 = 32
            long r1 = r5 >>> r1
            int r2 = (int) r1
            byte r1 = (byte) r2
            io.netty.util.internal.PlatformDependent.putByte(r3, r0, r1)
            int r0 = r4 + 4
            r1 = 24
            long r1 = r5 >>> r1
            int r2 = (int) r1
            byte r1 = (byte) r2
            io.netty.util.internal.PlatformDependent.putByte(r3, r0, r1)
            int r0 = r4 + 5
            r1 = 16
            long r1 = r5 >>> r1
            int r2 = (int) r1
            byte r1 = (byte) r2
            io.netty.util.internal.PlatformDependent.putByte(r3, r0, r1)
            int r0 = r4 + 6
            r1 = 8
            long r1 = r5 >>> r1
            int r2 = (int) r1
            byte r1 = (byte) r2
            io.netty.util.internal.PlatformDependent.putByte(r3, r0, r1)
            int r4 = r4 + 7
            int r6 = (int) r5
            byte r5 = (byte) r6
            io.netty.util.internal.PlatformDependent.putByte(r3, r4, r5)
            return
    }

    static void setLongLE(long r4, long r6) {
            boolean r0 = io.netty.buffer.UnsafeByteBufUtil.UNALIGNED
            if (r0 == 0) goto L10
            boolean r0 = io.netty.util.internal.PlatformDependent.BIG_ENDIAN_NATIVE_ORDER
            if (r0 == 0) goto Lc
            long r6 = java.lang.Long.reverseBytes(r6)
        Lc:
            io.netty.util.internal.PlatformDependent.putLong(r4, r6)
            return
        L10:
            int r0 = (int) r6
            byte r0 = (byte) r0
            io.netty.util.internal.PlatformDependent.putByte(r4, r0)
            r0 = 1
            long r0 = r0 + r4
            r2 = 8
            long r2 = r6 >>> r2
            int r3 = (int) r2
            byte r2 = (byte) r3
            io.netty.util.internal.PlatformDependent.putByte(r0, r2)
            r0 = 2
            long r0 = r0 + r4
            r2 = 16
            long r2 = r6 >>> r2
            int r3 = (int) r2
            byte r2 = (byte) r3
            io.netty.util.internal.PlatformDependent.putByte(r0, r2)
            r0 = 3
            long r0 = r0 + r4
            r2 = 24
            long r2 = r6 >>> r2
            int r3 = (int) r2
            byte r2 = (byte) r3
            io.netty.util.internal.PlatformDependent.putByte(r0, r2)
            r0 = 4
            long r0 = r0 + r4
            r2 = 32
            long r2 = r6 >>> r2
            int r3 = (int) r2
            byte r2 = (byte) r3
            io.netty.util.internal.PlatformDependent.putByte(r0, r2)
            r0 = 5
            long r0 = r0 + r4
            r2 = 40
            long r2 = r6 >>> r2
            int r3 = (int) r2
            byte r2 = (byte) r3
            io.netty.util.internal.PlatformDependent.putByte(r0, r2)
            r0 = 6
            long r0 = r0 + r4
            r2 = 48
            long r2 = r6 >>> r2
            int r3 = (int) r2
            byte r2 = (byte) r3
            io.netty.util.internal.PlatformDependent.putByte(r0, r2)
            r0 = 7
            long r4 = r4 + r0
            r0 = 56
            long r6 = r6 >>> r0
            int r7 = (int) r6
            byte r6 = (byte) r7
            io.netty.util.internal.PlatformDependent.putByte(r4, r6)
            return
    }

    static void setLongLE(byte[] r3, int r4, long r5) {
            boolean r0 = io.netty.buffer.UnsafeByteBufUtil.UNALIGNED
            if (r0 == 0) goto L10
            boolean r0 = io.netty.util.internal.PlatformDependent.BIG_ENDIAN_NATIVE_ORDER
            if (r0 == 0) goto Lc
            long r5 = java.lang.Long.reverseBytes(r5)
        Lc:
            io.netty.util.internal.PlatformDependent.putLong(r3, r4, r5)
            return
        L10:
            int r0 = (int) r5
            byte r0 = (byte) r0
            io.netty.util.internal.PlatformDependent.putByte(r3, r4, r0)
            int r0 = r4 + 1
            r1 = 8
            long r1 = r5 >>> r1
            int r2 = (int) r1
            byte r1 = (byte) r2
            io.netty.util.internal.PlatformDependent.putByte(r3, r0, r1)
            int r0 = r4 + 2
            r1 = 16
            long r1 = r5 >>> r1
            int r2 = (int) r1
            byte r1 = (byte) r2
            io.netty.util.internal.PlatformDependent.putByte(r3, r0, r1)
            int r0 = r4 + 3
            r1 = 24
            long r1 = r5 >>> r1
            int r2 = (int) r1
            byte r1 = (byte) r2
            io.netty.util.internal.PlatformDependent.putByte(r3, r0, r1)
            int r0 = r4 + 4
            r1 = 32
            long r1 = r5 >>> r1
            int r2 = (int) r1
            byte r1 = (byte) r2
            io.netty.util.internal.PlatformDependent.putByte(r3, r0, r1)
            int r0 = r4 + 5
            r1 = 40
            long r1 = r5 >>> r1
            int r2 = (int) r1
            byte r1 = (byte) r2
            io.netty.util.internal.PlatformDependent.putByte(r3, r0, r1)
            int r0 = r4 + 6
            r1 = 48
            long r1 = r5 >>> r1
            int r2 = (int) r1
            byte r1 = (byte) r2
            io.netty.util.internal.PlatformDependent.putByte(r3, r0, r1)
            int r4 = r4 + 7
            r0 = 56
            long r5 = r5 >>> r0
            int r6 = (int) r5
            byte r5 = (byte) r6
            io.netty.util.internal.PlatformDependent.putByte(r3, r4, r5)
            return
    }

    static void setMedium(long r3, int r5) {
            int r0 = r5 >>> 16
            byte r0 = (byte) r0
            io.netty.util.internal.PlatformDependent.putByte(r3, r0)
            boolean r0 = io.netty.buffer.UnsafeByteBufUtil.UNALIGNED
            r1 = 1
            if (r0 == 0) goto L1b
            long r3 = r3 + r1
            boolean r0 = io.netty.util.internal.PlatformDependent.BIG_ENDIAN_NATIVE_ORDER
            short r5 = (short) r5
            if (r0 == 0) goto L13
            goto L17
        L13:
            short r5 = java.lang.Short.reverseBytes(r5)
        L17:
            io.netty.util.internal.PlatformDependent.putShort(r3, r5)
            return
        L1b:
            long r1 = r1 + r3
            int r0 = r5 >>> 8
            byte r0 = (byte) r0
            io.netty.util.internal.PlatformDependent.putByte(r1, r0)
            r0 = 2
            long r3 = r3 + r0
            byte r5 = (byte) r5
            io.netty.util.internal.PlatformDependent.putByte(r3, r5)
            return
    }

    static void setMedium(byte[] r2, int r3, int r4) {
            int r0 = r4 >>> 16
            byte r0 = (byte) r0
            io.netty.util.internal.PlatformDependent.putByte(r2, r3, r0)
            boolean r0 = io.netty.buffer.UnsafeByteBufUtil.UNALIGNED
            if (r0 == 0) goto L1a
            int r3 = r3 + 1
            boolean r0 = io.netty.util.internal.PlatformDependent.BIG_ENDIAN_NATIVE_ORDER
            short r4 = (short) r4
            if (r0 == 0) goto L12
            goto L16
        L12:
            short r4 = java.lang.Short.reverseBytes(r4)
        L16:
            io.netty.util.internal.PlatformDependent.putShort(r2, r3, r4)
            return
        L1a:
            int r0 = r3 + 1
            int r1 = r4 >>> 8
            byte r1 = (byte) r1
            io.netty.util.internal.PlatformDependent.putByte(r2, r0, r1)
            int r3 = r3 + 2
            byte r4 = (byte) r4
            io.netty.util.internal.PlatformDependent.putByte(r2, r3, r4)
            return
    }

    static void setMediumLE(long r3, int r5) {
            byte r0 = (byte) r5
            io.netty.util.internal.PlatformDependent.putByte(r3, r0)
            boolean r0 = io.netty.buffer.UnsafeByteBufUtil.UNALIGNED
            r1 = 1
            if (r0 == 0) goto L1a
            long r3 = r3 + r1
            boolean r0 = io.netty.util.internal.PlatformDependent.BIG_ENDIAN_NATIVE_ORDER
            int r5 = r5 >>> 8
            short r5 = (short) r5
            if (r0 == 0) goto L16
            short r5 = java.lang.Short.reverseBytes(r5)
        L16:
            io.netty.util.internal.PlatformDependent.putShort(r3, r5)
            return
        L1a:
            long r1 = r1 + r3
            int r0 = r5 >>> 8
            byte r0 = (byte) r0
            io.netty.util.internal.PlatformDependent.putByte(r1, r0)
            r0 = 2
            long r3 = r3 + r0
            int r5 = r5 >>> 16
            byte r5 = (byte) r5
            io.netty.util.internal.PlatformDependent.putByte(r3, r5)
            return
    }

    static void setMediumLE(byte[] r2, int r3, int r4) {
            byte r0 = (byte) r4
            io.netty.util.internal.PlatformDependent.putByte(r2, r3, r0)
            boolean r0 = io.netty.buffer.UnsafeByteBufUtil.UNALIGNED
            if (r0 == 0) goto L1d
            int r3 = r3 + 1
            boolean r0 = io.netty.util.internal.PlatformDependent.BIG_ENDIAN_NATIVE_ORDER
            if (r0 == 0) goto L16
            int r4 = r4 >>> 8
            short r4 = (short) r4
            short r4 = java.lang.Short.reverseBytes(r4)
            goto L19
        L16:
            int r4 = r4 >>> 8
            short r4 = (short) r4
        L19:
            io.netty.util.internal.PlatformDependent.putShort(r2, r3, r4)
            return
        L1d:
            int r0 = r3 + 1
            int r1 = r4 >>> 8
            byte r1 = (byte) r1
            io.netty.util.internal.PlatformDependent.putByte(r2, r0, r1)
            int r3 = r3 + 2
            int r4 = r4 >>> 16
            byte r4 = (byte) r4
            io.netty.util.internal.PlatformDependent.putByte(r2, r3, r4)
            return
    }

    static void setShort(long r2, int r4) {
            boolean r0 = io.netty.buffer.UnsafeByteBufUtil.UNALIGNED
            if (r0 == 0) goto L12
            boolean r0 = io.netty.util.internal.PlatformDependent.BIG_ENDIAN_NATIVE_ORDER
            short r4 = (short) r4
            if (r0 == 0) goto La
            goto Le
        La:
            short r4 = java.lang.Short.reverseBytes(r4)
        Le:
            io.netty.util.internal.PlatformDependent.putShort(r2, r4)
            return
        L12:
            int r0 = r4 >>> 8
            byte r0 = (byte) r0
            io.netty.util.internal.PlatformDependent.putByte(r2, r0)
            r0 = 1
            long r2 = r2 + r0
            byte r4 = (byte) r4
            io.netty.util.internal.PlatformDependent.putByte(r2, r4)
            return
    }

    static void setShort(byte[] r1, int r2, int r3) {
            boolean r0 = io.netty.buffer.UnsafeByteBufUtil.UNALIGNED
            if (r0 == 0) goto L12
            boolean r0 = io.netty.util.internal.PlatformDependent.BIG_ENDIAN_NATIVE_ORDER
            short r3 = (short) r3
            if (r0 == 0) goto La
            goto Le
        La:
            short r3 = java.lang.Short.reverseBytes(r3)
        Le:
            io.netty.util.internal.PlatformDependent.putShort(r1, r2, r3)
            return
        L12:
            int r0 = r3 >>> 8
            byte r0 = (byte) r0
            io.netty.util.internal.PlatformDependent.putByte(r1, r2, r0)
            int r2 = r2 + 1
            byte r3 = (byte) r3
            io.netty.util.internal.PlatformDependent.putByte(r1, r2, r3)
            return
    }

    static void setShortLE(long r2, int r4) {
            boolean r0 = io.netty.buffer.UnsafeByteBufUtil.UNALIGNED
            if (r0 == 0) goto L13
            boolean r0 = io.netty.util.internal.PlatformDependent.BIG_ENDIAN_NATIVE_ORDER
            if (r0 == 0) goto Le
            short r4 = (short) r4
            short r4 = java.lang.Short.reverseBytes(r4)
            goto Lf
        Le:
            short r4 = (short) r4
        Lf:
            io.netty.util.internal.PlatformDependent.putShort(r2, r4)
            return
        L13:
            byte r0 = (byte) r4
            io.netty.util.internal.PlatformDependent.putByte(r2, r0)
            r0 = 1
            long r2 = r2 + r0
            int r4 = r4 >>> 8
            byte r4 = (byte) r4
            io.netty.util.internal.PlatformDependent.putByte(r2, r4)
            return
    }

    static void setShortLE(byte[] r1, int r2, int r3) {
            boolean r0 = io.netty.buffer.UnsafeByteBufUtil.UNALIGNED
            if (r0 == 0) goto L13
            boolean r0 = io.netty.util.internal.PlatformDependent.BIG_ENDIAN_NATIVE_ORDER
            if (r0 == 0) goto Le
            short r3 = (short) r3
            short r3 = java.lang.Short.reverseBytes(r3)
            goto Lf
        Le:
            short r3 = (short) r3
        Lf:
            io.netty.util.internal.PlatformDependent.putShort(r1, r2, r3)
            return
        L13:
            byte r0 = (byte) r3
            io.netty.util.internal.PlatformDependent.putByte(r1, r2, r0)
            int r2 = r2 + 1
            int r3 = r3 >>> 8
            byte r3 = (byte) r3
            io.netty.util.internal.PlatformDependent.putByte(r1, r2, r3)
            return
    }

    private static void setSingleBytes(io.netty.buffer.AbstractByteBuf r2, long r3, int r5, java.nio.ByteBuffer r6, int r7) {
            r2.checkIndex(r5, r7)
            int r2 = r6.position()
            int r5 = r6.limit()
        Lb:
            if (r2 >= r5) goto L1a
            byte r7 = r6.get(r2)
            io.netty.util.internal.PlatformDependent.putByte(r3, r7)
            r0 = 1
            long r3 = r3 + r0
            int r2 = r2 + 1
            goto Lb
        L1a:
            r6.position(r5)
            return
    }

    static void setZero(long r2, int r4) {
            if (r4 != 0) goto L3
            return
        L3:
            long r0 = (long) r4
            r4 = 0
            io.netty.util.internal.PlatformDependent.setMemory(r2, r0, r4)
            return
    }

    static void setZero(byte[] r2, int r3, int r4) {
            if (r4 != 0) goto L3
            return
        L3:
            long r0 = (long) r4
            r4 = 0
            io.netty.util.internal.PlatformDependent.setMemory(r2, r3, r0, r4)
            return
    }
}
