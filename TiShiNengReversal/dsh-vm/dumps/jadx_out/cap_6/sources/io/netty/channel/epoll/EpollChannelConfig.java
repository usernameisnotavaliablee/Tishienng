package io.netty.channel.epoll;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class EpollChannelConfig extends io.netty.channel.DefaultChannelConfig {
    private volatile long maxBytesPerGatheringWrite;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.channel.epoll.EpollChannelConfig$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$channel$epoll$EpollMode = null;

        static {
                io.netty.channel.epoll.EpollMode[] r0 = io.netty.channel.epoll.EpollMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.channel.epoll.EpollChannelConfig.AnonymousClass1.$SwitchMap$io$netty$channel$epoll$EpollMode = r0
                io.netty.channel.epoll.EpollMode r1 = io.netty.channel.epoll.EpollMode.EDGE_TRIGGERED     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.channel.epoll.EpollChannelConfig.AnonymousClass1.$SwitchMap$io$netty$channel$epoll$EpollMode     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.channel.epoll.EpollMode r1 = io.netty.channel.epoll.EpollMode.LEVEL_TRIGGERED     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    EpollChannelConfig(io.netty.channel.epoll.AbstractEpollChannel r3) {
            r2 = this;
            r2.<init>(r3)
            long r0 = io.netty.channel.unix.Limits.SSIZE_MAX
            r2.maxBytesPerGatheringWrite = r0
            return
    }

    private void checkChannelNotRegistered() {
            r2 = this;
            io.netty.channel.Channel r0 = r2.channel
            boolean r0 = r0.isRegistered()
            if (r0 != 0) goto L9
            return
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "EpollMode can only be changed before channel is registered"
            r0.<init>(r1)
            throw r0
    }

    @Override // io.netty.channel.DefaultChannelConfig
    protected final void autoReadCleared() {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel
            io.netty.channel.epoll.AbstractEpollChannel r0 = (io.netty.channel.epoll.AbstractEpollChannel) r0
            r0.clearEpollIn()
            return
    }

    public io.netty.channel.epoll.EpollMode getEpollMode() {
            r2 = this;
            io.netty.channel.Channel r0 = r2.channel
            io.netty.channel.epoll.AbstractEpollChannel r0 = (io.netty.channel.epoll.AbstractEpollChannel) r0
            int r1 = io.netty.channel.epoll.Native.EPOLLET
            boolean r0 = r0.isFlagSet(r1)
            if (r0 == 0) goto Lf
            io.netty.channel.epoll.EpollMode r0 = io.netty.channel.epoll.EpollMode.EDGE_TRIGGERED
            return r0
        Lf:
            io.netty.channel.epoll.EpollMode r0 = io.netty.channel.epoll.EpollMode.LEVEL_TRIGGERED
            return r0
    }

    final long getMaxBytesPerGatheringWrite() {
            r2 = this;
            long r0 = r2.maxBytesPerGatheringWrite
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public <T> T getOption(io.netty.channel.ChannelOption<T> r2) {
            r1 = this;
            io.netty.channel.ChannelOption<io.netty.channel.epoll.EpollMode> r0 = io.netty.channel.epoll.EpollChannelOption.EPOLL_MODE
            if (r2 != r0) goto L9
            io.netty.channel.epoll.EpollMode r2 = r1.getEpollMode()
            return r2
        L9:
            java.lang.Object r2 = super.getOption(r2)
            return r2
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> getOptions() {
            r4 = this;
            java.util.Map r0 = super.getOptions()
            r1 = 1
            io.netty.channel.ChannelOption[] r1 = new io.netty.channel.ChannelOption[r1]
            io.netty.channel.ChannelOption<io.netty.channel.epoll.EpollMode> r2 = io.netty.channel.epoll.EpollChannelOption.EPOLL_MODE
            r3 = 0
            r1[r3] = r2
            java.util.Map r0 = r4.getOptions(r0, r1)
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.epoll.EpollChannelConfig r1 = r0.setAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.epoll.EpollChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1) {
            r0 = this;
            super.setAllocator(r1)
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setAutoRead(boolean r1) {
            r0 = this;
            io.netty.channel.epoll.EpollChannelConfig r1 = r0.setAutoRead(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.epoll.EpollChannelConfig setAutoRead(boolean r1) {
            r0 = this;
            super.setAutoRead(r1)
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setConnectTimeoutMillis(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollChannelConfig r1 = r0.setConnectTimeoutMillis(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.epoll.EpollChannelConfig setConnectTimeoutMillis(int r1) {
            r0 = this;
            super.setConnectTimeoutMillis(r1)
            return r0
    }

    public io.netty.channel.epoll.EpollChannelConfig setEpollMode(io.netty.channel.epoll.EpollMode r2) {
            r1 = this;
            if (r2 == 0) goto L38
            int[] r0 = io.netty.channel.epoll.EpollChannelConfig.AnonymousClass1.$SwitchMap$io$netty$channel$epoll$EpollMode     // Catch: java.io.IOException -> L1d
            int r2 = r2.ordinal()     // Catch: java.io.IOException -> L1d
            r2 = r0[r2]     // Catch: java.io.IOException -> L1d
            r0 = 1
            if (r2 == r0) goto L25
            r0 = 2
            if (r2 != r0) goto L1f
            r1.checkChannelNotRegistered()     // Catch: java.io.IOException -> L1d
            io.netty.channel.Channel r2 = r1.channel     // Catch: java.io.IOException -> L1d
            io.netty.channel.epoll.AbstractEpollChannel r2 = (io.netty.channel.epoll.AbstractEpollChannel) r2     // Catch: java.io.IOException -> L1d
            int r0 = io.netty.channel.epoll.Native.EPOLLET     // Catch: java.io.IOException -> L1d
            r2.clearFlag(r0)     // Catch: java.io.IOException -> L1d
            return r1
        L1d:
            r2 = move-exception
            goto L32
        L1f:
            java.lang.Error r2 = new java.lang.Error     // Catch: java.io.IOException -> L1d
            r2.<init>()     // Catch: java.io.IOException -> L1d
            throw r2     // Catch: java.io.IOException -> L1d
        L25:
            r1.checkChannelNotRegistered()     // Catch: java.io.IOException -> L1d
            io.netty.channel.Channel r2 = r1.channel     // Catch: java.io.IOException -> L1d
            io.netty.channel.epoll.AbstractEpollChannel r2 = (io.netty.channel.epoll.AbstractEpollChannel) r2     // Catch: java.io.IOException -> L1d
            int r0 = io.netty.channel.epoll.Native.EPOLLET     // Catch: java.io.IOException -> L1d
            r2.setFlag(r0)     // Catch: java.io.IOException -> L1d
            return r1
        L32:
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
        L38:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "mode"
            r2.<init>(r0)
            throw r2
    }

    final void setMaxBytesPerGatheringWrite(long r1) {
            r0 = this;
            r0.maxBytesPerGatheringWrite = r1
            return
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setMaxMessagesPerRead(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollChannelConfig r1 = r0.setMaxMessagesPerRead(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public io.netty.channel.epoll.EpollChannelConfig setMaxMessagesPerRead(int r1) {
            r0 = this;
            super.setMaxMessagesPerRead(r1)
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1) {
            r0 = this;
            io.netty.channel.epoll.EpollChannelConfig r1 = r0.setMessageSizeEstimator(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.epoll.EpollChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1) {
            r0 = this;
            super.setMessageSizeEstimator(r1)
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public <T> boolean setOption(io.netty.channel.ChannelOption<T> r2, T r3) {
            r1 = this;
            r1.validate(r2, r3)
            io.netty.channel.ChannelOption<io.netty.channel.epoll.EpollMode> r0 = io.netty.channel.epoll.EpollChannelOption.EPOLL_MODE
            if (r2 != r0) goto Le
            io.netty.channel.epoll.EpollMode r3 = (io.netty.channel.epoll.EpollMode) r3
            r1.setEpollMode(r3)
            r2 = 1
            return r2
        Le:
            boolean r2 = super.setOption(r2, r3)
            return r2
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.epoll.EpollChannelConfig r1 = r0.setRecvByteBufAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.epoll.EpollChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r3) {
            r2 = this;
            io.netty.channel.RecvByteBufAllocator$Handle r0 = r3.newHandle()
            boolean r0 = r0 instanceof io.netty.channel.RecvByteBufAllocator.ExtendedHandle
            if (r0 == 0) goto Lc
            super.setRecvByteBufAllocator(r3)
            return r2
        Lc:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "allocator.newHandle() must return an object of type: "
            r0.append(r1)
            java.lang.Class<io.netty.channel.RecvByteBufAllocator$ExtendedHandle> r1 = io.netty.channel.RecvByteBufAllocator.ExtendedHandle.class
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteBufferHighWaterMark(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollChannelConfig r1 = r0.setWriteBufferHighWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public io.netty.channel.epoll.EpollChannelConfig setWriteBufferHighWaterMark(int r1) {
            r0 = this;
            super.setWriteBufferHighWaterMark(r1)
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteBufferLowWaterMark(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollChannelConfig r1 = r0.setWriteBufferLowWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public io.netty.channel.epoll.EpollChannelConfig setWriteBufferLowWaterMark(int r1) {
            r0 = this;
            super.setWriteBufferLowWaterMark(r1)
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1) {
            r0 = this;
            io.netty.channel.epoll.EpollChannelConfig r1 = r0.setWriteBufferWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.epoll.EpollChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1) {
            r0 = this;
            super.setWriteBufferWaterMark(r1)
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteSpinCount(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollChannelConfig r1 = r0.setWriteSpinCount(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.epoll.EpollChannelConfig setWriteSpinCount(int r1) {
            r0 = this;
            super.setWriteSpinCount(r1)
            return r0
    }
}
