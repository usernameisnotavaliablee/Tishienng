package io.netty.channel.kqueue;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class KQueueEventArray {
    private static final int KQUEUE_DATA_OFFSET = 0;
    private static final int KQUEUE_EVENT_SIZE = 0;
    private static final int KQUEUE_FFLAGS_OFFSET = 0;
    private static final int KQUEUE_FILTER_OFFSET = 0;
    private static final int KQUEUE_FLAGS_OFFSET = 0;
    private static final int KQUEUE_IDENT_OFFSET = 0;
    private int capacity;
    private java.nio.ByteBuffer memory;
    private long memoryAddress;
    private int size;

    static {
            int r0 = io.netty.channel.kqueue.Native.sizeofKEvent()
            io.netty.channel.kqueue.KQueueEventArray.KQUEUE_EVENT_SIZE = r0
            int r0 = io.netty.channel.kqueue.Native.offsetofKEventIdent()
            io.netty.channel.kqueue.KQueueEventArray.KQUEUE_IDENT_OFFSET = r0
            int r0 = io.netty.channel.kqueue.Native.offsetofKEventFilter()
            io.netty.channel.kqueue.KQueueEventArray.KQUEUE_FILTER_OFFSET = r0
            int r0 = io.netty.channel.kqueue.Native.offsetofKEventFFlags()
            io.netty.channel.kqueue.KQueueEventArray.KQUEUE_FFLAGS_OFFSET = r0
            int r0 = io.netty.channel.kqueue.Native.offsetofKEventFlags()
            io.netty.channel.kqueue.KQueueEventArray.KQUEUE_FLAGS_OFFSET = r0
            int r0 = io.netty.channel.kqueue.Native.offsetofKeventData()
            io.netty.channel.kqueue.KQueueEventArray.KQUEUE_DATA_OFFSET = r0
            return
    }

    KQueueEventArray(int r4) {
            r3 = this;
            r3.<init>()
            r0 = 1
            if (r4 < r0) goto L19
            int r0 = calculateBufferCapacity(r4)
            java.nio.ByteBuffer r0 = io.netty.channel.unix.Buffer.allocateDirectWithNativeOrder(r0)
            r3.memory = r0
            long r0 = io.netty.channel.unix.Buffer.memoryAddress(r0)
            r3.memoryAddress = r0
            r3.capacity = r4
            return
        L19:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "capacity must be >= 1 but was "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    private static int calculateBufferCapacity(int r1) {
            int r0 = io.netty.channel.kqueue.KQueueEventArray.KQUEUE_EVENT_SIZE
            int r1 = r1 * r0
            return r1
    }

    private static native void evSet(long r0, int r2, short r3, short r4, int r5);

    private static int getKEventOffset(int r1) {
            int r0 = io.netty.channel.kqueue.KQueueEventArray.KQUEUE_EVENT_SIZE
            int r1 = r1 * r0
            return r1
    }

    private long getKEventOffsetAddress(int r5) {
            r4 = this;
            int r5 = getKEventOffset(r5)
            long r0 = (long) r5
            long r2 = r4.memoryAddress
            long r0 = r0 + r2
            return r0
    }

    private short getShort(int r3, int r4) {
            r2 = this;
            boolean r0 = io.netty.util.internal.PlatformDependent.hasUnsafe()
            if (r0 == 0) goto L11
            long r0 = r2.getKEventOffsetAddress(r3)
            long r3 = (long) r4
            long r0 = r0 + r3
            short r3 = io.netty.util.internal.PlatformDependent.getShort(r0)
            return r3
        L11:
            java.nio.ByteBuffer r0 = r2.memory
            int r3 = getKEventOffset(r3)
            int r3 = r3 + r4
            short r3 = r0.getShort(r3)
            return r3
    }

    private void reallocIfNeeded() {
            r2 = this;
            int r0 = r2.size
            int r1 = r2.capacity
            if (r0 != r1) goto La
            r0 = 1
            r2.realloc(r0)
        La:
            return
    }

    int capacity() {
            r1 = this;
            int r0 = r1.capacity
            return r0
    }

    void clear() {
            r1 = this;
            r0 = 0
            r1.size = r0
            return
    }

    long data(int r5) {
            r4 = this;
            boolean r0 = io.netty.util.internal.PlatformDependent.hasUnsafe()
            if (r0 == 0) goto L13
            long r0 = r4.getKEventOffsetAddress(r5)
            int r5 = io.netty.channel.kqueue.KQueueEventArray.KQUEUE_DATA_OFFSET
            long r2 = (long) r5
            long r0 = r0 + r2
            long r0 = io.netty.util.internal.PlatformDependent.getLong(r0)
            return r0
        L13:
            java.nio.ByteBuffer r0 = r4.memory
            int r5 = getKEventOffset(r5)
            int r1 = io.netty.channel.kqueue.KQueueEventArray.KQUEUE_DATA_OFFSET
            int r5 = r5 + r1
            long r0 = r0.getLong(r5)
            return r0
    }

    void evSet(io.netty.channel.kqueue.AbstractKQueueChannel r11, short r12, short r13, int r14) {
            r10 = this;
            r10.reallocIfNeeded()
            int r0 = r10.size
            int r1 = r0 + 1
            r10.size = r1
            int r0 = getKEventOffset(r0)
            long r0 = (long) r0
            long r2 = r10.memoryAddress
            long r4 = r0 + r2
            io.netty.channel.kqueue.BsdSocket r11 = r11.socket
            int r6 = r11.intValue()
            r7 = r12
            r8 = r13
            r9 = r14
            evSet(r4, r6, r7, r8, r9)
            return
    }

    int fd(int r5) {
            r4 = this;
            boolean r0 = io.netty.util.internal.PlatformDependent.hasUnsafe()
            if (r0 == 0) goto L13
            long r0 = r4.getKEventOffsetAddress(r5)
            int r5 = io.netty.channel.kqueue.KQueueEventArray.KQUEUE_IDENT_OFFSET
            long r2 = (long) r5
            long r0 = r0 + r2
            int r5 = io.netty.util.internal.PlatformDependent.getInt(r0)
            return r5
        L13:
            java.nio.ByteBuffer r0 = r4.memory
            int r5 = getKEventOffset(r5)
            int r1 = io.netty.channel.kqueue.KQueueEventArray.KQUEUE_IDENT_OFFSET
            int r5 = r5 + r1
            int r5 = r0.getInt(r5)
            return r5
    }

    short fflags(int r2) {
            r1 = this;
            int r0 = io.netty.channel.kqueue.KQueueEventArray.KQUEUE_FFLAGS_OFFSET
            short r2 = r1.getShort(r2, r0)
            return r2
    }

    short filter(int r2) {
            r1 = this;
            int r0 = io.netty.channel.kqueue.KQueueEventArray.KQUEUE_FILTER_OFFSET
            short r2 = r1.getShort(r2, r0)
            return r2
    }

    short flags(int r2) {
            r1 = this;
            int r0 = io.netty.channel.kqueue.KQueueEventArray.KQUEUE_FLAGS_OFFSET
            short r2 = r1.getShort(r2, r0)
            return r2
    }

    void free() {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.memory
            io.netty.channel.unix.Buffer.free(r0)
            r0 = 0
            r2.capacity = r0
            r2.size = r0
            long r0 = (long) r0
            r2.memoryAddress = r0
            return
    }

    long memoryAddress() {
            r2 = this;
            long r0 = r2.memoryAddress
            return r0
    }

    void realloc(boolean r6) {
            r5 = this;
            int r0 = r5.capacity
            r1 = 65536(0x10000, float:9.1835E-41)
            if (r0 > r1) goto L9
            int r0 = r0 << 1
            goto Lc
        L9:
            int r0 = r0 + r0
            int r0 = r0 >> 1
        Lc:
            int r1 = calculateBufferCapacity(r0)     // Catch: java.lang.OutOfMemoryError -> L36
            java.nio.ByteBuffer r1 = io.netty.channel.unix.Buffer.allocateDirectWithNativeOrder(r1)     // Catch: java.lang.OutOfMemoryError -> L36
            java.nio.ByteBuffer r2 = r5.memory     // Catch: java.lang.OutOfMemoryError -> L36
            r3 = 0
            java.nio.Buffer r2 = r2.position(r3)     // Catch: java.lang.OutOfMemoryError -> L36
            int r4 = r5.size     // Catch: java.lang.OutOfMemoryError -> L36
            r2.limit(r4)     // Catch: java.lang.OutOfMemoryError -> L36
            java.nio.ByteBuffer r2 = r5.memory     // Catch: java.lang.OutOfMemoryError -> L36
            r1.put(r2)     // Catch: java.lang.OutOfMemoryError -> L36
            r1.position(r3)     // Catch: java.lang.OutOfMemoryError -> L36
            java.nio.ByteBuffer r2 = r5.memory     // Catch: java.lang.OutOfMemoryError -> L36
            io.netty.channel.unix.Buffer.free(r2)     // Catch: java.lang.OutOfMemoryError -> L36
            r5.memory = r1     // Catch: java.lang.OutOfMemoryError -> L36
            long r1 = io.netty.channel.unix.Buffer.memoryAddress(r1)     // Catch: java.lang.OutOfMemoryError -> L36
            r5.memoryAddress = r1     // Catch: java.lang.OutOfMemoryError -> L36
            return
        L36:
            r1 = move-exception
            if (r6 != 0) goto L3a
            return
        L3a:
            java.lang.OutOfMemoryError r6 = new java.lang.OutOfMemoryError
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "unable to allocate "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " new bytes! Existing capacity is: "
            r2.append(r0)
            int r0 = r5.capacity
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r6.<init>(r0)
            r6.initCause(r1)
            throw r6
    }

    int size() {
            r1 = this;
            int r0 = r1.size
            return r0
    }
}
