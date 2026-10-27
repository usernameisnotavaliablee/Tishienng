package io.netty.channel.unix;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class SocketWritableByteChannel implements java.nio.channels.WritableByteChannel {
    private final io.netty.channel.unix.FileDescriptor fd;

    protected SocketWritableByteChannel(io.netty.channel.unix.FileDescriptor r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "fd"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.channel.unix.FileDescriptor r2 = (io.netty.channel.unix.FileDescriptor) r2
            r1.fd = r2
            return
    }

    protected abstract io.netty.buffer.ByteBufAllocator alloc();

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
            r1 = this;
            io.netty.channel.unix.FileDescriptor r0 = r1.fd
            r0.close()
            return
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
            r1 = this;
            io.netty.channel.unix.FileDescriptor r0 = r1.fd
            boolean r0 = r0.isOpen()
            return r0
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(java.nio.ByteBuffer r7) throws java.io.IOException {
            r6 = this;
            int r0 = r7.position()
            int r1 = r7.limit()
            boolean r2 = r7.isDirect()
            if (r2 == 0) goto L19
            io.netty.channel.unix.FileDescriptor r1 = r6.fd
            int r2 = r7.limit()
            int r1 = r1.write(r7, r0, r2)
            goto L5b
        L19:
            int r1 = r1 - r0
            r2 = 0
            if (r1 != 0) goto L22
            io.netty.buffer.ByteBuf r2 = io.netty.buffer.Unpooled.EMPTY_BUFFER     // Catch: java.lang.Throwable -> L20
            goto L3b
        L20:
            r7 = move-exception
            goto L62
        L22:
            io.netty.buffer.ByteBufAllocator r3 = r6.alloc()     // Catch: java.lang.Throwable -> L20
            boolean r4 = r3.isDirectBufferPooled()     // Catch: java.lang.Throwable -> L20
            if (r4 == 0) goto L31
            io.netty.buffer.ByteBuf r2 = r3.directBuffer(r1)     // Catch: java.lang.Throwable -> L20
            goto L3b
        L31:
            io.netty.buffer.ByteBuf r2 = io.netty.buffer.ByteBufUtil.threadLocalDirectBuffer()     // Catch: java.lang.Throwable -> L20
            if (r2 != 0) goto L3b
            io.netty.buffer.ByteBuf r2 = io.netty.buffer.Unpooled.directBuffer(r1)     // Catch: java.lang.Throwable -> L20
        L3b:
            java.nio.ByteBuffer r3 = r7.duplicate()     // Catch: java.lang.Throwable -> L20
            r2.writeBytes(r3)     // Catch: java.lang.Throwable -> L20
            int r3 = r2.readerIndex()     // Catch: java.lang.Throwable -> L20
            java.nio.ByteBuffer r1 = r2.internalNioBuffer(r3, r1)     // Catch: java.lang.Throwable -> L20
            io.netty.channel.unix.FileDescriptor r3 = r6.fd     // Catch: java.lang.Throwable -> L20
            int r4 = r1.position()     // Catch: java.lang.Throwable -> L20
            int r5 = r1.limit()     // Catch: java.lang.Throwable -> L20
            int r1 = r3.write(r1, r4, r5)     // Catch: java.lang.Throwable -> L20
            r2.release()
        L5b:
            if (r1 <= 0) goto L61
            int r0 = r0 + r1
            r7.position(r0)
        L61:
            return r1
        L62:
            if (r2 == 0) goto L67
            r2.release()
        L67:
            throw r7
    }
}
