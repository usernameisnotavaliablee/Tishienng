package io.netty.handler.codec.compression;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class Lz4XXHash32 extends io.netty.handler.codec.compression.ByteBufChecksum {
    private static final net.jpountz.xxhash.XXHash32 XXHASH32 = null;
    private final int seed;
    private boolean used;
    private int value;

    static {
            net.jpountz.xxhash.XXHashFactory r0 = net.jpountz.xxhash.XXHashFactory.fastestInstance()
            net.jpountz.xxhash.XXHash32 r0 = r0.hash32()
            io.netty.handler.codec.compression.Lz4XXHash32.XXHASH32 = r0
            return
    }

    public Lz4XXHash32(int r1) {
            r0 = this;
            r0.<init>()
            r0.seed = r1
            return
    }

    @Override // java.util.zip.Checksum
    public long getValue() {
            r4 = this;
            boolean r0 = r4.used
            if (r0 == 0) goto Lc
            int r0 = r4.value
            long r0 = (long) r0
            r2 = 268435455(0xfffffff, double:1.326247364E-315)
            long r0 = r0 & r2
            return r0
        Lc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    @Override // java.util.zip.Checksum
    public void reset() {
            r1 = this;
            r0 = 0
            r1.used = r0
            return
    }

    @Override // java.util.zip.Checksum
    public void update(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.handler.codec.compression.ByteBufChecksum
    public void update(io.netty.buffer.ByteBuf r3, int r4, int r5) {
            r2 = this;
            boolean r0 = r2.used
            if (r0 != 0) goto L30
            boolean r0 = r3.hasArray()
            if (r0 == 0) goto L1e
            net.jpountz.xxhash.XXHash32 r0 = io.netty.handler.codec.compression.Lz4XXHash32.XXHASH32
            byte[] r1 = r3.array()
            int r3 = r3.arrayOffset()
            int r3 = r3 + r4
            int r4 = r2.seed
            int r3 = r0.hash(r1, r3, r5, r4)
            r2.value = r3
            goto L2c
        L1e:
            net.jpountz.xxhash.XXHash32 r0 = io.netty.handler.codec.compression.Lz4XXHash32.XXHASH32
            java.nio.ByteBuffer r3 = io.netty.handler.codec.compression.CompressionUtil.safeNioBuffer(r3, r4, r5)
            int r4 = r2.seed
            int r3 = r0.hash(r3, r4)
            r2.value = r3
        L2c:
            r3 = 1
            r2.used = r3
            return
        L30:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
    }

    @Override // java.util.zip.Checksum
    public void update(byte[] r3, int r4, int r5) {
            r2 = this;
            boolean r0 = r2.used
            if (r0 != 0) goto L12
            net.jpountz.xxhash.XXHash32 r0 = io.netty.handler.codec.compression.Lz4XXHash32.XXHASH32
            int r1 = r2.seed
            int r3 = r0.hash(r3, r4, r5, r1)
            r2.value = r3
            r3 = 1
            r2.used = r3
            return
        L12:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
    }
}
