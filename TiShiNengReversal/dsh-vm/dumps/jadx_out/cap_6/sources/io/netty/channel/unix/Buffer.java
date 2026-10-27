package io.netty.channel.unix;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class Buffer {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    static {
            return
    }

    private Buffer() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int addressSize() {
            boolean r0 = io.netty.util.internal.PlatformDependent.hasUnsafe()
            if (r0 == 0) goto Lb
            int r0 = io.netty.util.internal.PlatformDependent.addressSize()
            return r0
        Lb:
            int r0 = addressSize0()
            return r0
    }

    private static native int addressSize0();

    public static java.nio.ByteBuffer allocateDirectWithNativeOrder(int r1) {
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocateDirect(r1)
            boolean r0 = io.netty.util.internal.PlatformDependent.BIG_ENDIAN_NATIVE_ORDER
            if (r0 == 0) goto Lb
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            goto Ld
        Lb:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
        Ld:
            java.nio.ByteBuffer r1 = r1.order(r0)
            return r1
    }

    public static void free(java.nio.ByteBuffer r0) {
            io.netty.util.internal.PlatformDependent.freeDirectBuffer(r0)
            return
    }

    public static long memoryAddress(java.nio.ByteBuffer r2) {
            boolean r0 = io.netty.util.internal.PlatformDependent.hasUnsafe()
            if (r0 == 0) goto Lb
            long r0 = io.netty.util.internal.PlatformDependent.directBufferAddress(r2)
            return r0
        Lb:
            long r0 = memoryAddress0(r2)
            return r0
    }

    private static native long memoryAddress0(java.nio.ByteBuffer r0);
}
