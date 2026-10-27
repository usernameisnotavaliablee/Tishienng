package io.netty.channel.sctp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultSctpServerChannelConfig extends io.netty.channel.DefaultChannelConfig implements io.netty.channel.sctp.SctpServerChannelConfig {
    private volatile int backlog;
    private final com.sun.nio.sctp.SctpServerChannel javaChannel;

    public DefaultSctpServerChannelConfig(io.netty.channel.sctp.SctpServerChannel r1, com.sun.nio.sctp.SctpServerChannel r2) {
            r0 = this;
            r0.<init>(r1)
            int r1 = io.netty.util.NetUtil.SOMAXCONN
            r0.backlog = r1
            if (r2 == 0) goto Lc
            r0.javaChannel = r2
            return
        Lc:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "javaChannel"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.channel.sctp.SctpServerChannelConfig
    public int getBacklog() {
            r1 = this;
            int r0 = r1.backlog
            return r0
    }

    @Override // io.netty.channel.sctp.SctpServerChannelConfig
    public com.sun.nio.sctp.SctpStandardSocketOptions.InitMaxStreams getInitMaxStreams() {
            r2 = this;
            com.sun.nio.sctp.SctpServerChannel r0 = r2.javaChannel     // Catch: java.io.IOException -> Lb
            com.sun.nio.sctp.SctpSocketOption r1 = com.sun.nio.sctp.SctpStandardSocketOptions.SCTP_INIT_MAXSTREAMS     // Catch: java.io.IOException -> Lb
            java.lang.Object r0 = r0.getOption(r1)     // Catch: java.io.IOException -> Lb
            com.sun.nio.sctp.SctpStandardSocketOptions$InitMaxStreams r0 = (com.sun.nio.sctp.SctpStandardSocketOptions.InitMaxStreams) r0     // Catch: java.io.IOException -> Lb
            return r0
        Lb:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public <T> T getOption(io.netty.channel.ChannelOption<T> r2) {
            r1 = this;
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.SO_RCVBUF
            if (r2 != r0) goto Ld
            int r2 = r1.getReceiveBufferSize()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        Ld:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.SO_SNDBUF
            if (r2 != r0) goto L1a
            int r2 = r1.getSendBufferSize()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L1a:
            io.netty.channel.ChannelOption<com.sun.nio.sctp.SctpStandardSocketOptions$InitMaxStreams> r0 = io.netty.channel.sctp.SctpChannelOption.SCTP_INIT_MAXSTREAMS
            if (r2 != r0) goto L23
            com.sun.nio.sctp.SctpStandardSocketOptions$InitMaxStreams r2 = r1.getInitMaxStreams()
            return r2
        L23:
            java.lang.Object r2 = super.getOption(r2)
            return r2
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> getOptions() {
            r4 = this;
            java.util.Map r0 = super.getOptions()
            r1 = 3
            io.netty.channel.ChannelOption[] r1 = new io.netty.channel.ChannelOption[r1]
            io.netty.channel.ChannelOption<java.lang.Integer> r2 = io.netty.channel.ChannelOption.SO_RCVBUF
            r3 = 0
            r1[r3] = r2
            io.netty.channel.ChannelOption<java.lang.Integer> r2 = io.netty.channel.ChannelOption.SO_SNDBUF
            r3 = 1
            r1[r3] = r2
            io.netty.channel.ChannelOption<com.sun.nio.sctp.SctpStandardSocketOptions$InitMaxStreams> r2 = io.netty.channel.sctp.SctpChannelOption.SCTP_INIT_MAXSTREAMS
            r3 = 2
            r1[r3] = r2
            java.util.Map r0 = r4.getOptions(r0, r1)
            return r0
    }

    @Override // io.netty.channel.sctp.SctpServerChannelConfig
    public int getReceiveBufferSize() {
            r2 = this;
            com.sun.nio.sctp.SctpServerChannel r0 = r2.javaChannel     // Catch: java.io.IOException -> Lf
            com.sun.nio.sctp.SctpSocketOption r1 = com.sun.nio.sctp.SctpStandardSocketOptions.SO_RCVBUF     // Catch: java.io.IOException -> Lf
            java.lang.Object r0 = r0.getOption(r1)     // Catch: java.io.IOException -> Lf
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.io.IOException -> Lf
            int r0 = r0.intValue()     // Catch: java.io.IOException -> Lf
            return r0
        Lf:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    @Override // io.netty.channel.sctp.SctpServerChannelConfig
    public int getSendBufferSize() {
            r2 = this;
            com.sun.nio.sctp.SctpServerChannel r0 = r2.javaChannel     // Catch: java.io.IOException -> Lf
            com.sun.nio.sctp.SctpSocketOption r1 = com.sun.nio.sctp.SctpStandardSocketOptions.SO_SNDBUF     // Catch: java.io.IOException -> Lf
            java.lang.Object r0 = r0.getOption(r1)     // Catch: java.io.IOException -> Lf
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.io.IOException -> Lf
            int r0 = r0.intValue()     // Catch: java.io.IOException -> Lf
            return r0
        Lf:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.sctp.SctpServerChannelConfig r1 = r0.setAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.sctp.SctpServerChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1) {
            r0 = this;
            super.setAllocator(r1)
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setAutoClose(boolean r1) {
            r0 = this;
            io.netty.channel.sctp.SctpServerChannelConfig r1 = r0.setAutoClose(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.sctp.SctpServerChannelConfig setAutoClose(boolean r1) {
            r0 = this;
            super.setAutoClose(r1)
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setAutoRead(boolean r1) {
            r0 = this;
            io.netty.channel.sctp.SctpServerChannelConfig r1 = r0.setAutoRead(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.sctp.SctpServerChannelConfig setAutoRead(boolean r1) {
            r0 = this;
            super.setAutoRead(r1)
            return r0
    }

    @Override // io.netty.channel.sctp.SctpServerChannelConfig
    public io.netty.channel.sctp.SctpServerChannelConfig setBacklog(int r2) {
            r1 = this;
            java.lang.String r0 = "backlog"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r2, r0)
            r1.backlog = r2
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setConnectTimeoutMillis(int r1) {
            r0 = this;
            io.netty.channel.sctp.SctpServerChannelConfig r1 = r0.setConnectTimeoutMillis(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.sctp.SctpServerChannelConfig setConnectTimeoutMillis(int r1) {
            r0 = this;
            super.setConnectTimeoutMillis(r1)
            return r0
    }

    @Override // io.netty.channel.sctp.SctpServerChannelConfig
    public io.netty.channel.sctp.SctpServerChannelConfig setInitMaxStreams(com.sun.nio.sctp.SctpStandardSocketOptions.InitMaxStreams r3) {
            r2 = this;
            com.sun.nio.sctp.SctpServerChannel r0 = r2.javaChannel     // Catch: java.io.IOException -> L8
            com.sun.nio.sctp.SctpSocketOption r1 = com.sun.nio.sctp.SctpStandardSocketOptions.SCTP_INIT_MAXSTREAMS     // Catch: java.io.IOException -> L8
            r0.setOption(r1, r3)     // Catch: java.io.IOException -> L8
            return r2
        L8:
            r3 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r3)
            throw r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setMaxMessagesPerRead(int r1) {
            r0 = this;
            io.netty.channel.sctp.SctpServerChannelConfig r1 = r0.setMaxMessagesPerRead(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public io.netty.channel.sctp.SctpServerChannelConfig setMaxMessagesPerRead(int r1) {
            r0 = this;
            super.setMaxMessagesPerRead(r1)
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1) {
            r0 = this;
            io.netty.channel.sctp.SctpServerChannelConfig r1 = r0.setMessageSizeEstimator(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.sctp.SctpServerChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1) {
            r0 = this;
            super.setMessageSizeEstimator(r1)
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public <T> boolean setOption(io.netty.channel.ChannelOption<T> r2, T r3) {
            r1 = this;
            r1.validate(r2, r3)
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.SO_RCVBUF
            if (r2 != r0) goto L11
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.setReceiveBufferSize(r2)
            goto L28
        L11:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.SO_SNDBUF
            if (r2 != r0) goto L1f
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.setSendBufferSize(r2)
            goto L28
        L1f:
            io.netty.channel.ChannelOption<com.sun.nio.sctp.SctpStandardSocketOptions$InitMaxStreams> r0 = io.netty.channel.sctp.SctpChannelOption.SCTP_INIT_MAXSTREAMS
            if (r2 != r0) goto L2a
            com.sun.nio.sctp.SctpStandardSocketOptions$InitMaxStreams r3 = (com.sun.nio.sctp.SctpStandardSocketOptions.InitMaxStreams) r3
            r1.setInitMaxStreams(r3)
        L28:
            r2 = 1
            return r2
        L2a:
            boolean r2 = super.setOption(r2, r3)
            return r2
    }

    @Override // io.netty.channel.sctp.SctpServerChannelConfig
    public io.netty.channel.sctp.SctpServerChannelConfig setReceiveBufferSize(int r3) {
            r2 = this;
            com.sun.nio.sctp.SctpServerChannel r0 = r2.javaChannel     // Catch: java.io.IOException -> Lc
            com.sun.nio.sctp.SctpSocketOption r1 = com.sun.nio.sctp.SctpStandardSocketOptions.SO_RCVBUF     // Catch: java.io.IOException -> Lc
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.io.IOException -> Lc
            r0.setOption(r1, r3)     // Catch: java.io.IOException -> Lc
            return r2
        Lc:
            r3 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r3)
            throw r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.sctp.SctpServerChannelConfig r1 = r0.setRecvByteBufAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.sctp.SctpServerChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1) {
            r0 = this;
            super.setRecvByteBufAllocator(r1)
            return r0
    }

    @Override // io.netty.channel.sctp.SctpServerChannelConfig
    public io.netty.channel.sctp.SctpServerChannelConfig setSendBufferSize(int r3) {
            r2 = this;
            com.sun.nio.sctp.SctpServerChannel r0 = r2.javaChannel     // Catch: java.io.IOException -> Lc
            com.sun.nio.sctp.SctpSocketOption r1 = com.sun.nio.sctp.SctpStandardSocketOptions.SO_SNDBUF     // Catch: java.io.IOException -> Lc
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.io.IOException -> Lc
            r0.setOption(r1, r3)     // Catch: java.io.IOException -> Lc
            return r2
        Lc:
            r3 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r3)
            throw r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteBufferHighWaterMark(int r1) {
            r0 = this;
            io.netty.channel.sctp.SctpServerChannelConfig r1 = r0.setWriteBufferHighWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.sctp.SctpServerChannelConfig setWriteBufferHighWaterMark(int r1) {
            r0 = this;
            super.setWriteBufferHighWaterMark(r1)
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteBufferLowWaterMark(int r1) {
            r0 = this;
            io.netty.channel.sctp.SctpServerChannelConfig r1 = r0.setWriteBufferLowWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.sctp.SctpServerChannelConfig setWriteBufferLowWaterMark(int r1) {
            r0 = this;
            super.setWriteBufferLowWaterMark(r1)
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1) {
            r0 = this;
            io.netty.channel.sctp.SctpServerChannelConfig r1 = r0.setWriteBufferWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.sctp.SctpServerChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1) {
            r0 = this;
            super.setWriteBufferWaterMark(r1)
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteSpinCount(int r1) {
            r0 = this;
            io.netty.channel.sctp.SctpServerChannelConfig r1 = r0.setWriteSpinCount(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.sctp.SctpServerChannelConfig setWriteSpinCount(int r1) {
            r0 = this;
            super.setWriteSpinCount(r1)
            return r0
    }
}
