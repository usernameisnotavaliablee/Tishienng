package io.netty.channel.oio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class AbstractOioMessageChannel extends io.netty.channel.oio.AbstractOioChannel {
    private final java.util.List<java.lang.Object> readBuf;

    protected AbstractOioMessageChannel(io.netty.channel.Channel r1) {
            r0 = this;
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.readBuf = r1
            return
    }

    @Override // io.netty.channel.oio.AbstractOioChannel
    protected void doRead() {
            r10 = this;
            boolean r0 = r10.readPending
            if (r0 != 0) goto L6
            goto L97
        L6:
            r0 = 0
            r10.readPending = r0
            io.netty.channel.ChannelConfig r1 = r10.config()
            io.netty.channel.ChannelPipeline r2 = r10.pipeline()
            io.netty.channel.Channel$Unsafe r3 = r10.unsafe()
            io.netty.channel.RecvByteBufAllocator$Handle r3 = r3.recvBufAllocHandle()
            r3.reset(r1)
        L1c:
            r4 = 1
            java.util.List<java.lang.Object> r5 = r10.readBuf     // Catch: java.lang.Throwable -> L36
            int r5 = r10.doReadMessages(r5)     // Catch: java.lang.Throwable -> L36
            if (r5 != 0) goto L26
            goto L33
        L26:
            if (r5 >= 0) goto L2a
            r5 = 1
            goto L34
        L2a:
            r3.incMessagesRead(r5)     // Catch: java.lang.Throwable -> L36
            boolean r5 = r3.continueReading()     // Catch: java.lang.Throwable -> L36
            if (r5 != 0) goto L1c
        L33:
            r5 = 0
        L34:
            r6 = 0
            goto L39
        L36:
            r5 = move-exception
            r6 = r5
            r5 = 0
        L39:
            java.util.List<java.lang.Object> r7 = r10.readBuf
            int r7 = r7.size()
            if (r7 <= 0) goto L5e
            r8 = 0
        L42:
            if (r8 >= r7) goto L52
            r10.readPending = r0
            java.util.List<java.lang.Object> r9 = r10.readBuf
            java.lang.Object r9 = r9.get(r8)
            r2.fireChannelRead(r9)
            int r8 = r8 + 1
            goto L42
        L52:
            java.util.List<java.lang.Object> r0 = r10.readBuf
            r0.clear()
            r3.readComplete()
            r2.fireChannelReadComplete()
            r0 = 1
        L5e:
            if (r6 == 0) goto L6a
            boolean r3 = r6 instanceof java.io.IOException
            if (r3 == 0) goto L65
            goto L66
        L65:
            r4 = r5
        L66:
            r2.fireExceptionCaught(r6)
            r5 = r4
        L6a:
            if (r5 == 0) goto L82
            boolean r0 = r10.isOpen()
            if (r0 == 0) goto L97
            io.netty.channel.Channel$Unsafe r0 = r10.unsafe()
            io.netty.channel.Channel$Unsafe r1 = r10.unsafe()
            io.netty.channel.ChannelPromise r1 = r1.voidPromise()
            r0.close(r1)
            goto L97
        L82:
            boolean r2 = r10.readPending
            if (r2 != 0) goto L94
            boolean r1 = r1.isAutoRead()
            if (r1 != 0) goto L94
            if (r0 != 0) goto L97
            boolean r0 = r10.isActive()
            if (r0 == 0) goto L97
        L94:
            r10.read()
        L97:
            return
    }

    protected abstract int doReadMessages(java.util.List<java.lang.Object> r1) throws java.lang.Exception;
}
