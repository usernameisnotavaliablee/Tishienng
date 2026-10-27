package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class FailedChannelFuture extends io.netty.channel.CompleteChannelFuture {
    private final java.lang.Throwable cause;

    FailedChannelFuture(io.netty.channel.Channel r1, io.netty.util.concurrent.EventExecutor r2, java.lang.Throwable r3) {
            r0 = this;
            r0.<init>(r1, r2)
            if (r3 == 0) goto L8
            r0.cause = r3
            return
        L8:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "cause"
            r1.<init>(r2)
            throw r1
    }

    public java.lang.Throwable cause() {
            r1 = this;
            java.lang.Throwable r0 = r1.cause
            return r0
    }

    public boolean isSuccess() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.channel.CompleteChannelFuture, io.netty.channel.ChannelFuture
    public io.netty.channel.ChannelFuture sync() {
            r1 = this;
            java.lang.Throwable r0 = r1.cause
            io.netty.util.internal.PlatformDependent.throwException(r0)
            return r1
    }

    @Override // io.netty.channel.CompleteChannelFuture
    /* renamed from: sync */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future mo37sync() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.channel.ChannelFuture r0 = r1.sync()
            return r0
    }

    @Override // io.netty.channel.CompleteChannelFuture, io.netty.channel.ChannelFuture
    public io.netty.channel.ChannelFuture syncUninterruptibly() {
            r1 = this;
            java.lang.Throwable r0 = r1.cause
            io.netty.util.internal.PlatformDependent.throwException(r0)
            return r1
    }

    @Override // io.netty.channel.CompleteChannelFuture
    /* renamed from: syncUninterruptibly */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future mo38syncUninterruptibly() {
            r1 = this;
            io.netty.channel.ChannelFuture r0 = r1.syncUninterruptibly()
            return r0
    }
}
