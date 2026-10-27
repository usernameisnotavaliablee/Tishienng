package io.netty.channel.epoll;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class EpollRecvByteAllocatorStreamingHandle extends io.netty.channel.epoll.EpollRecvByteAllocatorHandle {
    EpollRecvByteAllocatorStreamingHandle(io.netty.channel.RecvByteBufAllocator.ExtendedHandle r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // io.netty.channel.epoll.EpollRecvByteAllocatorHandle
    boolean maybeMoreDataToRead() {
            r2 = this;
            int r0 = r2.lastBytesRead()
            int r1 = r2.attemptedBytesRead()
            if (r0 == r1) goto L13
            boolean r0 = r2.isReceivedRdHup()
            if (r0 == 0) goto L11
            goto L13
        L11:
            r0 = 0
            return r0
        L13:
            r0 = 1
            return r0
    }
}
