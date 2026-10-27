package io.netty.channel.kqueue;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class NativeLongArray {
    private int capacity;
    private java.nio.ByteBuffer memory;
    private long memoryAddress;
    private int size;

    NativeLongArray(int r4) {
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
            int r0 = io.netty.channel.unix.Limits.SIZEOF_JLONG
            int r1 = r1 * r0
            return r1
    }

    private static int idx(int r1) {
            int r0 = io.netty.channel.unix.Limits.SIZEOF_JLONG
            int r1 = r1 * r0
            return r1
    }

    private long memoryOffset(int r5) {
            r4 = this;
            long r0 = r4.memoryAddress
            int r5 = idx(r5)
            long r2 = (long) r5
            long r0 = r0 + r2
            return r0
    }

    private void reallocIfNeeded() {
            r5 = this;
            int r0 = r5.size
            int r1 = r5.capacity
            if (r0 != r1) goto L3b
            r0 = 65536(0x10000, float:9.1835E-41)
            if (r1 > r0) goto Ld
            int r0 = r1 << 1
            goto L10
        Ld:
            int r1 = r1 + r1
            int r0 = r1 >> 1
        L10:
            int r1 = calculateBufferCapacity(r0)
            java.nio.ByteBuffer r1 = io.netty.channel.unix.Buffer.allocateDirectWithNativeOrder(r1)
            java.nio.ByteBuffer r2 = r5.memory
            r3 = 0
            java.nio.Buffer r2 = r2.position(r3)
            int r4 = r5.size
            r2.limit(r4)
            java.nio.ByteBuffer r2 = r5.memory
            r1.put(r2)
            r1.position(r3)
            java.nio.ByteBuffer r2 = r5.memory
            io.netty.channel.unix.Buffer.free(r2)
            r5.memory = r1
            long r1 = io.netty.channel.unix.Buffer.memoryAddress(r1)
            r5.memoryAddress = r1
            r5.capacity = r0
        L3b:
            return
    }

    void add(long r3) {
            r2 = this;
            r2.reallocIfNeeded()
            boolean r0 = io.netty.util.internal.PlatformDependent.hasUnsafe()
            if (r0 == 0) goto L13
            int r0 = r2.size
            long r0 = r2.memoryOffset(r0)
            io.netty.util.internal.PlatformDependent.putLong(r0, r3)
            goto L1e
        L13:
            java.nio.ByteBuffer r0 = r2.memory
            int r1 = r2.size
            int r1 = idx(r1)
            r0.putLong(r1, r3)
        L1e:
            int r3 = r2.size
            int r3 = r3 + 1
            r2.size = r3
            return
    }

    void clear() {
            r1 = this;
            r0 = 0
            r1.size = r0
            return
    }

    void free() {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.memory
            io.netty.channel.unix.Buffer.free(r0)
            r0 = 0
            r2.memoryAddress = r0
            return
    }

    boolean isEmpty() {
            r1 = this;
            int r0 = r1.size
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    long memoryAddress() {
            r2 = this;
            long r0 = r2.memoryAddress
            return r0
    }

    long memoryAddressEnd() {
            r2 = this;
            int r0 = r2.size
            long r0 = r2.memoryOffset(r0)
            return r0
    }

    int size() {
            r1 = this;
            int r0 = r1.size
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "memoryAddress: "
            r0.append(r1)
            long r1 = r3.memoryAddress
            r0.append(r1)
            java.lang.String r1 = " capacity: "
            r0.append(r1)
            int r1 = r3.capacity
            r0.append(r1)
            java.lang.String r1 = " size: "
            r0.append(r1)
            int r1 = r3.size
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
