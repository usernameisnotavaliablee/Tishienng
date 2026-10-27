package io.netty.channel.unix;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class IovArray implements io.netty.channel.ChannelOutboundBuffer.MessageProcessor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int ADDRESS_SIZE = 0;
    private static final int CAPACITY = 0;
    private static final int IOV_SIZE = 0;
    private int count;
    private long maxBytes;
    private final java.nio.ByteBuffer memory;
    private final long memoryAddress;
    private long size;

    static {
            int r0 = io.netty.channel.unix.Buffer.addressSize()
            io.netty.channel.unix.IovArray.ADDRESS_SIZE = r0
            int r0 = r0 * 2
            io.netty.channel.unix.IovArray.IOV_SIZE = r0
            int r1 = io.netty.channel.unix.Limits.IOV_MAX
            int r1 = r1 * r0
            io.netty.channel.unix.IovArray.CAPACITY = r1
            return
    }

    public IovArray() {
            r2 = this;
            r2.<init>()
            long r0 = io.netty.channel.unix.Limits.SSIZE_MAX
            r2.maxBytes = r0
            int r0 = io.netty.channel.unix.IovArray.CAPACITY
            java.nio.ByteBuffer r0 = io.netty.channel.unix.Buffer.allocateDirectWithNativeOrder(r0)
            r2.memory = r0
            long r0 = io.netty.channel.unix.Buffer.memoryAddress(r0)
            r2.memoryAddress = r0
            return
    }

    private boolean add(long r10, int r12, int r13) {
            r9 = this;
            long r0 = r9.maxBytes
            long r2 = (long) r13
            long r0 = r0 - r2
            long r4 = r9.size
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 >= 0) goto L10
            int r0 = r9.count
            if (r0 <= 0) goto L10
            r10 = 0
            return r10
        L10:
            int r0 = r9.count
            int r0 = idx(r0)
            int r1 = io.netty.channel.unix.IovArray.ADDRESS_SIZE
            int r4 = r0 + r1
            long r5 = r9.size
            long r5 = r5 + r2
            r9.size = r5
            int r5 = r9.count
            r6 = 1
            int r5 = r5 + r6
            r9.count = r5
            r5 = 8
            if (r1 != r5) goto L4d
            boolean r13 = io.netty.util.internal.PlatformDependent.hasUnsafe()
            if (r13 == 0) goto L40
            long r0 = (long) r0
            long r7 = r9.memoryAddress
            long r0 = r0 + r7
            long r12 = (long) r12
            long r10 = r10 + r12
            io.netty.util.internal.PlatformDependent.putLong(r0, r10)
            long r10 = (long) r4
            long r12 = r9.memoryAddress
            long r10 = r10 + r12
            io.netty.util.internal.PlatformDependent.putLong(r10, r2)
            goto L70
        L40:
            java.nio.ByteBuffer r13 = r9.memory
            long r7 = (long) r12
            long r10 = r10 + r7
            r13.putLong(r0, r10)
            java.nio.ByteBuffer r10 = r9.memory
            r10.putLong(r4, r2)
            goto L70
        L4d:
            boolean r1 = io.netty.util.internal.PlatformDependent.hasUnsafe()
            if (r1 == 0) goto L64
            long r0 = (long) r0
            long r2 = r9.memoryAddress
            long r0 = r0 + r2
            int r11 = (int) r10
            int r11 = r11 + r12
            io.netty.util.internal.PlatformDependent.putInt(r0, r11)
            long r10 = (long) r4
            long r0 = r9.memoryAddress
            long r10 = r10 + r0
            io.netty.util.internal.PlatformDependent.putInt(r10, r13)
            goto L70
        L64:
            java.nio.ByteBuffer r1 = r9.memory
            int r11 = (int) r10
            int r11 = r11 + r12
            r1.putInt(r0, r11)
            java.nio.ByteBuffer r10 = r9.memory
            r10.putInt(r4, r13)
        L70:
            return r6
    }

    private static int idx(int r1) {
            int r0 = io.netty.channel.unix.IovArray.IOV_SIZE
            int r0 = r0 * r1
            return r0
    }

    public boolean add(io.netty.buffer.ByteBuf r9) {
            r8 = this;
            int r0 = r8.count
            int r1 = io.netty.channel.unix.Limits.IOV_MAX
            r2 = 0
            if (r0 != r1) goto L8
            return r2
        L8:
            int r0 = r9.nioBufferCount()
            r1 = 1
            if (r0 != r1) goto L3e
            int r0 = r9.readableBytes()
            if (r0 != 0) goto L16
            return r1
        L16:
            boolean r1 = r9.hasMemoryAddress()
            if (r1 == 0) goto L29
            long r1 = r9.memoryAddress()
            int r9 = r9.readerIndex()
            boolean r9 = r8.add(r1, r9, r0)
            return r9
        L29:
            int r1 = r9.readerIndex()
            java.nio.ByteBuffer r9 = r9.internalNioBuffer(r1, r0)
            long r1 = io.netty.channel.unix.Buffer.memoryAddress(r9)
            int r9 = r9.position()
            boolean r9 = r8.add(r1, r9, r0)
            return r9
        L3e:
            java.nio.ByteBuffer[] r9 = r9.nioBuffers()
            int r0 = r9.length
            r3 = 0
        L44:
            if (r3 >= r0) goto L66
            r4 = r9[r3]
            int r5 = r4.remaining()
            if (r5 == 0) goto L63
            long r6 = io.netty.channel.unix.Buffer.memoryAddress(r4)
            int r4 = r4.position()
            boolean r4 = r8.add(r6, r4, r5)
            if (r4 == 0) goto L62
            int r4 = r8.count
            int r5 = io.netty.channel.unix.Limits.IOV_MAX
            if (r4 != r5) goto L63
        L62:
            return r2
        L63:
            int r3 = r3 + 1
            goto L44
        L66:
            return r1
    }

    public void clear() {
            r2 = this;
            r0 = 0
            r2.count = r0
            r0 = 0
            r2.size = r0
            return
    }

    public int count() {
            r1 = this;
            int r0 = r1.count
            return r0
    }

    public long maxBytes() {
            r2 = this;
            long r0 = r2.maxBytes
            return r0
    }

    public void maxBytes(long r4) {
            r3 = this;
            long r0 = io.netty.channel.unix.Limits.SSIZE_MAX
            java.lang.String r2 = "maxBytes"
            long r4 = io.netty.util.internal.ObjectUtil.checkPositive(r4, r2)
            long r4 = java.lang.Math.min(r0, r4)
            r3.maxBytes = r4
            return
    }

    public long memoryAddress(int r5) {
            r4 = this;
            long r0 = r4.memoryAddress
            int r5 = idx(r5)
            long r2 = (long) r5
            long r0 = r0 + r2
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundBuffer.MessageProcessor
    public boolean processMessage(java.lang.Object r2) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r2 instanceof io.netty.buffer.ByteBuf
            if (r0 == 0) goto Le
            io.netty.buffer.ByteBuf r2 = (io.netty.buffer.ByteBuf) r2
            boolean r2 = r1.add(r2)
            if (r2 == 0) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    public void release() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.memory
            io.netty.channel.unix.Buffer.free(r0)
            return
    }

    public long size() {
            r2 = this;
            long r0 = r2.size
            return r0
    }
}
