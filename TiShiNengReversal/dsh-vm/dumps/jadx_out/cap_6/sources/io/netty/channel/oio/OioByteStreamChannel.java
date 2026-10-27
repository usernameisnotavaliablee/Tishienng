package io.netty.channel.oio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class OioByteStreamChannel extends io.netty.channel.oio.AbstractOioByteChannel {
    private static final java.io.InputStream CLOSED_IN = null;
    private static final java.io.OutputStream CLOSED_OUT = null;
    private java.io.InputStream is;
    private java.io.OutputStream os;
    private java.nio.channels.WritableByteChannel outChannel;



    static {
            io.netty.channel.oio.OioByteStreamChannel$1 r0 = new io.netty.channel.oio.OioByteStreamChannel$1
            r0.<init>()
            io.netty.channel.oio.OioByteStreamChannel.CLOSED_IN = r0
            io.netty.channel.oio.OioByteStreamChannel$2 r0 = new io.netty.channel.oio.OioByteStreamChannel$2
            r0.<init>()
            io.netty.channel.oio.OioByteStreamChannel.CLOSED_OUT = r0
            return
    }

    protected OioByteStreamChannel(io.netty.channel.Channel r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private static void checkEOF(io.netty.channel.FileRegion r5) throws java.io.IOException {
            long r0 = r5.transferred()
            long r2 = r5.count()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto Ld
            return
        Ld:
            java.io.EOFException r0 = new java.io.EOFException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected to be able to write "
            r1.append(r2)
            long r2 = r5.count()
            r1.append(r2)
            java.lang.String r2 = " bytes, but only wrote "
            r1.append(r2)
            long r2 = r5.transferred()
            r1.append(r2)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
    }

    protected final void activate(java.io.InputStream r2, java.io.OutputStream r3) {
            r1 = this;
            java.io.InputStream r0 = r1.is
            if (r0 != 0) goto L29
            java.io.OutputStream r0 = r1.os
            if (r0 != 0) goto L21
            if (r2 == 0) goto L19
            if (r3 == 0) goto L11
            r1.is = r2
            r1.os = r3
            return
        L11:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "os"
            r2.<init>(r3)
            throw r2
        L19:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "is"
            r2.<init>(r3)
            throw r2
        L21:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "output was set already"
            r2.<init>(r3)
            throw r2
        L29:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "input was set already"
            r2.<init>(r3)
            throw r2
    }

    @Override // io.netty.channel.oio.AbstractOioByteChannel
    protected int available() {
            r1 = this;
            java.io.InputStream r0 = r1.is     // Catch: java.io.IOException -> L7
            int r0 = r0.available()     // Catch: java.io.IOException -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doClose() throws java.lang.Exception {
            r3 = this;
            java.io.InputStream r0 = r3.is
            java.io.OutputStream r1 = r3.os
            java.io.InputStream r2 = io.netty.channel.oio.OioByteStreamChannel.CLOSED_IN
            r3.is = r2
            java.io.OutputStream r2 = io.netty.channel.oio.OioByteStreamChannel.CLOSED_OUT
            r3.os = r2
            if (r0 == 0) goto L19
            r0.close()     // Catch: java.lang.Throwable -> L12
            goto L19
        L12:
            r0 = move-exception
            if (r1 == 0) goto L18
            r1.close()
        L18:
            throw r0
        L19:
            if (r1 == 0) goto L1e
            r1.close()
        L1e:
            return
    }

    @Override // io.netty.channel.oio.AbstractOioByteChannel
    protected int doReadBytes(io.netty.buffer.ByteBuf r4) throws java.lang.Exception {
            r3 = this;
            io.netty.channel.Channel$Unsafe r0 = r3.unsafe()
            io.netty.channel.RecvByteBufAllocator$Handle r0 = r0.recvBufAllocHandle()
            int r1 = r3.available()
            int r2 = r4.maxWritableBytes()
            int r1 = java.lang.Math.min(r1, r2)
            r2 = 1
            int r1 = java.lang.Math.max(r2, r1)
            r0.attemptedBytesRead(r1)
            java.io.InputStream r1 = r3.is
            int r0 = r0.attemptedBytesRead()
            int r4 = r4.writeBytes(r1, r0)
            return r4
    }

    @Override // io.netty.channel.oio.AbstractOioByteChannel
    protected void doWriteBytes(io.netty.buffer.ByteBuf r3) throws java.lang.Exception {
            r2 = this;
            java.io.OutputStream r0 = r2.os
            if (r0 == 0) goto Lc
            int r1 = r3.readableBytes()
            r3.readBytes(r0, r1)
            return
        Lc:
            java.nio.channels.NotYetConnectedException r3 = new java.nio.channels.NotYetConnectedException
            r3.<init>()
            throw r3
    }

    @Override // io.netty.channel.oio.AbstractOioByteChannel
    protected void doWriteFileRegion(io.netty.channel.FileRegion r8) throws java.lang.Exception {
            r7 = this;
            java.io.OutputStream r0 = r7.os
            if (r0 == 0) goto L2a
            java.nio.channels.WritableByteChannel r1 = r7.outChannel
            if (r1 != 0) goto Le
            java.nio.channels.WritableByteChannel r0 = java.nio.channels.Channels.newChannel(r0)
            r7.outChannel = r0
        Le:
            r0 = 0
        L10:
            java.nio.channels.WritableByteChannel r2 = r7.outChannel
            long r2 = r8.transferTo(r2, r0)
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L20
            checkEOF(r8)
            return
        L20:
            long r0 = r0 + r2
            long r2 = r8.count()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L10
            return
        L2a:
            java.nio.channels.NotYetConnectedException r8 = new java.nio.channels.NotYetConnectedException
            r8.<init>()
            throw r8
    }

    @Override // io.netty.channel.Channel
    public boolean isActive() {
            r3 = this;
            java.io.InputStream r0 = r3.is
            r1 = 0
            if (r0 == 0) goto L14
            java.io.InputStream r2 = io.netty.channel.oio.OioByteStreamChannel.CLOSED_IN
            if (r0 != r2) goto La
            goto L14
        La:
            java.io.OutputStream r0 = r3.os
            if (r0 == 0) goto L14
            java.io.OutputStream r2 = io.netty.channel.oio.OioByteStreamChannel.CLOSED_OUT
            if (r0 == r2) goto L14
            r0 = 1
            return r0
        L14:
            return r1
    }
}
