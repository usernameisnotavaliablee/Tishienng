package io.netty.channel.oio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class AbstractOioByteChannel extends io.netty.channel.oio.AbstractOioChannel {
    private static final java.lang.String EXPECTED_TYPES = null;
    private static final io.netty.channel.ChannelMetadata METADATA = null;

    static {
            io.netty.channel.ChannelMetadata r0 = new io.netty.channel.ChannelMetadata
            r1 = 0
            r0.<init>(r1)
            io.netty.channel.oio.AbstractOioByteChannel.METADATA = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = " (expected: "
            r0.append(r1)
            java.lang.Class<io.netty.buffer.ByteBuf> r1 = io.netty.buffer.ByteBuf.class
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r1)
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.Class<io.netty.channel.FileRegion> r1 = io.netty.channel.FileRegion.class
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r1)
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            io.netty.channel.oio.AbstractOioByteChannel.EXPECTED_TYPES = r0
            return
    }

    protected AbstractOioByteChannel(io.netty.channel.Channel r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private void closeOnRead(io.netty.channel.ChannelPipeline r4) {
            r3 = this;
            boolean r0 = r3.isOpen()
            if (r0 == 0) goto L35
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            io.netty.channel.ChannelConfig r1 = r3.config()
            io.netty.channel.ChannelOption<java.lang.Boolean> r2 = io.netty.channel.ChannelOption.ALLOW_HALF_CLOSURE
            java.lang.Object r1 = r1.getOption(r2)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L21
            r3.shutdownInput()
            io.netty.channel.socket.ChannelInputShutdownEvent r0 = io.netty.channel.socket.ChannelInputShutdownEvent.INSTANCE
            r4.fireUserEventTriggered(r0)
            goto L30
        L21:
            io.netty.channel.Channel$Unsafe r0 = r3.unsafe()
            io.netty.channel.Channel$Unsafe r1 = r3.unsafe()
            io.netty.channel.ChannelPromise r1 = r1.voidPromise()
            r0.close(r1)
        L30:
            io.netty.channel.socket.ChannelInputShutdownReadComplete r0 = io.netty.channel.socket.ChannelInputShutdownReadComplete.INSTANCE
            r4.fireUserEventTriggered(r0)
        L35:
            return
    }

    private void handleReadException(io.netty.channel.ChannelPipeline r2, io.netty.buffer.ByteBuf r3, java.lang.Throwable r4, boolean r5, io.netty.channel.RecvByteBufAllocator.Handle r6) {
            r1 = this;
            if (r3 == 0) goto L12
            boolean r0 = r3.isReadable()
            if (r0 == 0) goto Lf
            r0 = 0
            r1.readPending = r0
            r2.fireChannelRead(r3)
            goto L12
        Lf:
            r3.release()
        L12:
            r6.readComplete()
            r2.fireChannelReadComplete()
            r2.fireExceptionCaught(r4)
            if (r5 != 0) goto L23
            boolean r3 = r4 instanceof java.io.IOException
            if (r3 == 0) goto L22
            goto L23
        L22:
            return
        L23:
            r1.closeOnRead(r2)
            return
    }

    protected abstract int available();

    @Override // io.netty.channel.oio.AbstractOioChannel
    protected void doRead() {
            r11 = this;
            io.netty.channel.ChannelConfig r1 = r11.config()
            boolean r0 = r11.isInputShutdown()
            if (r0 != 0) goto Le
            boolean r0 = r11.readPending
            if (r0 != 0) goto L11
        Le:
            r3 = r11
            goto L117
        L11:
            r2 = 0
            r11.readPending = r2
            io.netty.channel.ChannelPipeline r4 = r11.pipeline()
            io.netty.buffer.ByteBufAllocator r0 = r1.getAllocator()
            io.netty.channel.Channel$Unsafe r3 = r11.unsafe()
            io.netty.channel.RecvByteBufAllocator$Handle r8 = r3.recvBufAllocHandle()
            r8.reset(r1)
            r3 = 0
            io.netty.buffer.ByteBuf r5 = r8.allocate(r0)     // Catch: java.lang.Throwable -> Le2
            r6 = 0
        L2d:
            int r7 = r11.doReadBytes(r5)     // Catch: java.lang.Throwable -> L60
            r8.lastBytesRead(r7)     // Catch: java.lang.Throwable -> L60
            int r7 = r8.lastBytesRead()     // Catch: java.lang.Throwable -> L60
            r9 = 1
            if (r7 > 0) goto L67
            boolean r0 = r5.isReadable()     // Catch: java.lang.Throwable -> L60
            if (r0 != 0) goto L65
            r5.release()     // Catch: java.lang.Throwable -> L60
            int r0 = r8.lastBytesRead()     // Catch: java.lang.Throwable -> L5b
            if (r0 >= 0) goto L4b
            goto L4c
        L4b:
            r9 = 0
        L4c:
            if (r9 == 0) goto L59
            r11.readPending = r2     // Catch: java.lang.Throwable -> L51
            goto L59
        L51:
            r0 = move-exception
            r5 = r3
            r2 = r6
            r7 = r9
        L55:
            r3 = r11
        L56:
            r6 = r0
            goto Le7
        L59:
            r5 = r3
            goto La4
        L5b:
            r0 = move-exception
            r5 = r3
            r2 = r6
        L5e:
            r7 = 0
            goto L55
        L60:
            r0 = move-exception
            r7 = 0
            r3 = r11
            r2 = r6
            goto L56
        L65:
            r9 = 0
            goto La4
        L67:
            int r6 = r11.available()     // Catch: java.lang.Throwable -> L8c
            if (r6 > 0) goto L6f
        L6d:
            r6 = 1
            goto L65
        L6f:
            boolean r7 = r5.isWritable()     // Catch: java.lang.Throwable -> L8c
            if (r7 != 0) goto L9d
            int r7 = r5.capacity()     // Catch: java.lang.Throwable -> L8c
            int r10 = r5.maxCapacity()     // Catch: java.lang.Throwable -> L8c
            if (r7 != r10) goto L8f
            r8.incMessagesRead(r9)     // Catch: java.lang.Throwable -> L8c
            r11.readPending = r2     // Catch: java.lang.Throwable -> L8c
            r4.fireChannelRead(r5)     // Catch: java.lang.Throwable -> L8c
            io.netty.buffer.ByteBuf r5 = r8.allocate(r0)     // Catch: java.lang.Throwable -> L8c
            goto L9d
        L8c:
            r0 = move-exception
            r2 = 1
            goto L5e
        L8f:
            int r7 = r5.writerIndex()     // Catch: java.lang.Throwable -> L8c
            int r7 = r7 + r6
            if (r7 <= r10) goto L9a
            r5.capacity(r10)     // Catch: java.lang.Throwable -> L8c
            goto L9d
        L9a:
            r5.ensureWritable(r6)     // Catch: java.lang.Throwable -> L8c
        L9d:
            boolean r6 = r8.continueReading()     // Catch: java.lang.Throwable -> L8c
            if (r6 != 0) goto Ldf
            goto L6d
        La4:
            if (r5 == 0) goto Lbb
            boolean r0 = r5.isReadable()     // Catch: java.lang.Throwable -> Lb2
            if (r0 == 0) goto Lb7
            r11.readPending = r2     // Catch: java.lang.Throwable -> Lb2
            r4.fireChannelRead(r5)     // Catch: java.lang.Throwable -> Lb2
            goto Lbc
        Lb2:
            r0 = move-exception
            r3 = r11
            r2 = r6
            r7 = r9
            goto L56
        Lb7:
            r5.release()     // Catch: java.lang.Throwable -> Lb2
            goto Lbc
        Lbb:
            r3 = r5
        Lbc:
            if (r6 == 0) goto Lc4
            r8.readComplete()     // Catch: java.lang.Throwable -> L51
            r4.fireChannelReadComplete()     // Catch: java.lang.Throwable -> L51
        Lc4:
            if (r9 == 0) goto Lc9
            r11.closeOnRead(r4)     // Catch: java.lang.Throwable -> L51
        Lc9:
            boolean r0 = r11.readPending
            if (r0 != 0) goto Ldb
            boolean r0 = r1.isAutoRead()
            if (r0 != 0) goto Ldb
            if (r6 != 0) goto Le
            boolean r0 = r11.isActive()
            if (r0 == 0) goto Le
        Ldb:
            r11.read()
            return
        Ldf:
            r6 = 1
            goto L2d
        Le2:
            r0 = move-exception
            r6 = r0
            r5 = r3
            r7 = 0
            r3 = r11
        Le7:
            r3.handleReadException(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L100
            boolean r0 = r3.readPending
            if (r0 != 0) goto Lfc
            boolean r0 = r1.isAutoRead()
            if (r0 != 0) goto Lfc
            if (r2 != 0) goto L117
            boolean r0 = r11.isActive()
            if (r0 == 0) goto L117
        Lfc:
            r11.read()
            goto L117
        L100:
            r0 = move-exception
            boolean r4 = r3.readPending
            if (r4 != 0) goto L113
            boolean r1 = r1.isAutoRead()
            if (r1 != 0) goto L113
            if (r2 != 0) goto L116
            boolean r1 = r11.isActive()
            if (r1 == 0) goto L116
        L113:
            r11.read()
        L116:
            throw r0
        L117:
            return
    }

    protected abstract int doReadBytes(io.netty.buffer.ByteBuf r1) throws java.lang.Exception;

    @Override // io.netty.channel.AbstractChannel
    protected void doWrite(io.netty.channel.ChannelOutboundBuffer r6) throws java.lang.Exception {
            r5 = this;
        L0:
            java.lang.Object r0 = r6.current()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r1 = r0 instanceof io.netty.buffer.ByteBuf
            if (r1 == 0) goto L25
            io.netty.buffer.ByteBuf r0 = (io.netty.buffer.ByteBuf) r0
            int r1 = r0.readableBytes()
        L11:
            if (r1 <= 0) goto L21
            r5.doWriteBytes(r0)
            int r2 = r0.readableBytes()
            int r1 = r1 - r2
            long r3 = (long) r1
            r6.progress(r3)
            r1 = r2
            goto L11
        L21:
            r6.remove()
            goto L0
        L25:
            boolean r1 = r0 instanceof io.netty.channel.FileRegion
            if (r1 == 0) goto L3e
            io.netty.channel.FileRegion r0 = (io.netty.channel.FileRegion) r0
            long r1 = r0.transferred()
            r5.doWriteFileRegion(r0)
            long r3 = r0.transferred()
            long r3 = r3 - r1
            r6.progress(r3)
            r6.remove()
            goto L0
        L3e:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "unsupported message type: "
            r2.append(r3)
            java.lang.String r0 = io.netty.util.internal.StringUtil.simpleClassName(r0)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            r6.remove(r1)
            goto L0
    }

    protected abstract void doWriteBytes(io.netty.buffer.ByteBuf r1) throws java.lang.Exception;

    protected abstract void doWriteFileRegion(io.netty.channel.FileRegion r1) throws java.lang.Exception;

    @Override // io.netty.channel.AbstractChannel
    protected final java.lang.Object filterOutboundMessage(java.lang.Object r4) throws java.lang.Exception {
            r3 = this;
            boolean r0 = r4 instanceof io.netty.buffer.ByteBuf
            if (r0 != 0) goto L29
            boolean r0 = r4 instanceof io.netty.channel.FileRegion
            if (r0 == 0) goto L9
            return r4
        L9:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unsupported message type: "
            r1.append(r2)
            java.lang.String r4 = io.netty.util.internal.StringUtil.simpleClassName(r4)
            r1.append(r4)
            java.lang.String r4 = io.netty.channel.oio.AbstractOioByteChannel.EXPECTED_TYPES
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L29:
            return r4
    }

    protected abstract boolean isInputShutdown();

    @Override // io.netty.channel.Channel
    public io.netty.channel.ChannelMetadata metadata() {
            r1 = this;
            io.netty.channel.ChannelMetadata r0 = io.netty.channel.oio.AbstractOioByteChannel.METADATA
            return r0
    }

    protected abstract io.netty.channel.ChannelFuture shutdownInput();
}
