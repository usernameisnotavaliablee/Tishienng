package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class SucceededChannelFuture extends io.netty.channel.CompleteChannelFuture {
    SucceededChannelFuture(io.netty.channel.Channel r1, io.netty.util.concurrent.EventExecutor r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public java.lang.Throwable cause() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isSuccess() {
            r1 = this;
            r0 = 1
            return r0
    }
}
