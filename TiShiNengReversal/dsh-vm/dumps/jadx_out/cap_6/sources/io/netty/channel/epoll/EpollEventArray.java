package io.netty.channel.epoll;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class EpollEventArray {
    private static final int EPOLL_DATA_OFFSET = 0;
    private static final int EPOLL_EVENT_SIZE = 0;
    private int length;
    private java.nio.ByteBuffer memory;
    private long memoryAddress;

    static {
            int r0 = io.netty.channel.epoll.Native.sizeofEpollEvent()
            io.netty.channel.epoll.EpollEventArray.EPOLL_EVENT_SIZE = r0
            int r0 = io.netty.channel.epoll.Native.offsetofEpollData()
            io.netty.channel.epoll.EpollEventArray.EPOLL_DATA_OFFSET = r0
            return
    }

    EpollEventArray(int r4) {
            r3 = this;
            r3.<init>()
            r0 = 1
            if (r4 < r0) goto L19
            r3.length = r4
            int r4 = calculateBufferCapacity(r4)
            java.nio.ByteBuffer r4 = io.netty.channel.unix.Buffer.allocateDirectWithNativeOrder(r4)
            r3.memory = r4
            long r0 = io.netty.channel.unix.Buffer.memoryAddress(r4)
            r3.memoryAddress = r0
            return
        L19:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "length must be >= 1 but was "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    private static int calculateBufferCapacity(int r1) {
            int r0 = io.netty.channel.epoll.EpollEventArray.EPOLL_EVENT_SIZE
            int r1 = r1 * r0
            return r1
    }

    private int getInt(int r5, int r6) {
            r4 = this;
            boolean r0 = io.netty.util.internal.PlatformDependent.hasUnsafe()
            if (r0 == 0) goto L15
            long r0 = r4.memoryAddress
            int r2 = io.netty.channel.epoll.EpollEventArray.EPOLL_EVENT_SIZE
            int r5 = r5 * r2
            long r2 = (long) r5
            long r0 = r0 + r2
            long r5 = (long) r6
            long r0 = r0 + r5
            int r5 = io.netty.util.internal.PlatformDependent.getInt(r0)
            return r5
        L15:
            java.nio.ByteBuffer r0 = r4.memory
            int r1 = io.netty.channel.epoll.EpollEventArray.EPOLL_EVENT_SIZE
            int r5 = r5 * r1
            int r5 = r5 + r6
            int r5 = r0.getInt(r5)
            return r5
    }

    int events(int r2) {
            r1 = this;
            r0 = 0
            int r2 = r1.getInt(r2, r0)
            return r2
    }

    int fd(int r2) {
            r1 = this;
            int r0 = io.netty.channel.epoll.EpollEventArray.EPOLL_DATA_OFFSET
            int r2 = r1.getInt(r2, r0)
            return r2
    }

    void free() {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.memory
            io.netty.channel.unix.Buffer.free(r0)
            r0 = 0
            r2.memoryAddress = r0
            return
    }

    void increase() {
            r2 = this;
            int r0 = r2.length
            int r0 = r0 << 1
            r2.length = r0
            int r0 = calculateBufferCapacity(r0)
            java.nio.ByteBuffer r0 = io.netty.channel.unix.Buffer.allocateDirectWithNativeOrder(r0)
            java.nio.ByteBuffer r1 = r2.memory
            io.netty.channel.unix.Buffer.free(r1)
            r2.memory = r0
            long r0 = io.netty.channel.unix.Buffer.memoryAddress(r0)
            r2.memoryAddress = r0
            return
    }

    int length() {
            r1 = this;
            int r0 = r1.length
            return r0
    }

    long memoryAddress() {
            r2 = this;
            long r0 = r2.memoryAddress
            return r0
    }
}
