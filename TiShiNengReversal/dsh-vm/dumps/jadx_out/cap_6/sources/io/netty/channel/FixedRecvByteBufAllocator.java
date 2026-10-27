package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class FixedRecvByteBufAllocator extends io.netty.channel.DefaultMaxMessagesRecvByteBufAllocator {
    private final int bufferSize;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class HandleImpl extends io.netty.channel.DefaultMaxMessagesRecvByteBufAllocator.MaxMessageHandle {
        private final int bufferSize;
        final /* synthetic */ io.netty.channel.FixedRecvByteBufAllocator this$0;

        HandleImpl(io.netty.channel.FixedRecvByteBufAllocator r1, int r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                r0.bufferSize = r2
                return
        }

        @Override // io.netty.channel.RecvByteBufAllocator.Handle
        public int guess() {
                r1 = this;
                int r0 = r1.bufferSize
                return r0
        }
    }

    public FixedRecvByteBufAllocator(int r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "bufferSize"
            io.netty.util.internal.ObjectUtil.checkPositive(r2, r0)
            r1.bufferSize = r2
            return
    }

    @Override // io.netty.channel.RecvByteBufAllocator
    public io.netty.channel.RecvByteBufAllocator.Handle newHandle() {
            r2 = this;
            io.netty.channel.FixedRecvByteBufAllocator$HandleImpl r0 = new io.netty.channel.FixedRecvByteBufAllocator$HandleImpl
            int r1 = r2.bufferSize
            r0.<init>(r2, r1)
            return r0
    }

    @Override // io.netty.channel.DefaultMaxMessagesRecvByteBufAllocator
    public /* bridge */ /* synthetic */ io.netty.channel.DefaultMaxMessagesRecvByteBufAllocator respectMaybeMoreData(boolean r1) {
            r0 = this;
            io.netty.channel.FixedRecvByteBufAllocator r1 = r0.respectMaybeMoreData(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultMaxMessagesRecvByteBufAllocator
    public io.netty.channel.FixedRecvByteBufAllocator respectMaybeMoreData(boolean r1) {
            r0 = this;
            super.respectMaybeMoreData(r1)
            return r0
    }
}
