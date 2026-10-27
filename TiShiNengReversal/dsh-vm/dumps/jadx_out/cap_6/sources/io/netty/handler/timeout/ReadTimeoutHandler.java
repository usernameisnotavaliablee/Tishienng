package io.netty.handler.timeout;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ReadTimeoutHandler extends io.netty.handler.timeout.IdleStateHandler {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private boolean closed;

    static {
            return
    }

    public ReadTimeoutHandler(int r3) {
            r2 = this;
            long r0 = (long) r3
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            r2.<init>(r0, r3)
            return
    }

    public ReadTimeoutHandler(long r9, java.util.concurrent.TimeUnit r11) {
            r8 = this;
            r3 = 0
            r5 = 0
            r0 = r8
            r1 = r9
            r7 = r11
            r0.<init>(r1, r3, r5, r7)
            return
    }

    @Override // io.netty.handler.timeout.IdleStateHandler
    protected final void channelIdle(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.timeout.IdleStateEvent r2) throws java.lang.Exception {
            r0 = this;
            r0.readTimedOut(r1)
            return
    }

    protected void readTimedOut(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r1.closed
            if (r0 != 0) goto Lf
            io.netty.handler.timeout.ReadTimeoutException r0 = io.netty.handler.timeout.ReadTimeoutException.INSTANCE
            r2.fireExceptionCaught(r0)
            r2.close()
            r2 = 1
            r1.closed = r2
        Lf:
            return
    }
}
