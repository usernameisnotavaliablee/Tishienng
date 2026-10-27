package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class CoalescingBufferQueue extends io.netty.channel.AbstractCoalescingBufferQueue {
    private final io.netty.channel.Channel channel;

    public CoalescingBufferQueue(io.netty.channel.Channel r2) {
            r1 = this;
            r0 = 4
            r1.<init>(r2, r0)
            return
    }

    public CoalescingBufferQueue(io.netty.channel.Channel r2, int r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public CoalescingBufferQueue(io.netty.channel.Channel r1, int r2, boolean r3) {
            r0 = this;
            if (r3 == 0) goto L4
            r3 = r1
            goto L5
        L4:
            r3 = 0
        L5:
            r0.<init>(r3, r2)
            java.lang.String r2 = "channel"
            java.lang.Object r1 = io.netty.util.internal.ObjectUtil.checkNotNull(r1, r2)
            io.netty.channel.Channel r1 = (io.netty.channel.Channel) r1
            r0.channel = r1
            return
    }

    @Override // io.netty.channel.AbstractCoalescingBufferQueue
    protected io.netty.buffer.ByteBuf compose(io.netty.buffer.ByteBufAllocator r2, io.netty.buffer.ByteBuf r3, io.netty.buffer.ByteBuf r4) {
            r1 = this;
            boolean r0 = r3 instanceof io.netty.buffer.CompositeByteBuf
            if (r0 == 0) goto Lb
            io.netty.buffer.CompositeByteBuf r3 = (io.netty.buffer.CompositeByteBuf) r3
            r2 = 1
            r3.addComponent(r2, r4)
            return r3
        Lb:
            io.netty.buffer.ByteBuf r2 = r1.composeIntoComposite(r2, r3, r4)
            return r2
    }

    public void releaseAndFailAll(java.lang.Throwable r2) {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel
            r1.releaseAndFailAll(r0, r2)
            return
    }

    public io.netty.buffer.ByteBuf remove(int r2, io.netty.channel.ChannelPromise r3) {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel
            io.netty.buffer.ByteBufAllocator r0 = r0.alloc()
            io.netty.buffer.ByteBuf r2 = r1.remove(r0, r2, r3)
            return r2
    }

    @Override // io.netty.channel.AbstractCoalescingBufferQueue
    protected io.netty.buffer.ByteBuf removeEmptyValue() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            return r0
    }
}
