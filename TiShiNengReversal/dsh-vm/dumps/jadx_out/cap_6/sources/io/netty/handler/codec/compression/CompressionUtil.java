package io.netty.handler.codec.compression;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class CompressionUtil {
    private CompressionUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    static void checkChecksum(io.netty.handler.codec.compression.ByteBufChecksum r2, io.netty.buffer.ByteBuf r3, int r4) {
            r2.reset()
            int r0 = r3.readerIndex()
            int r1 = r3.readableBytes()
            r2.update(r3, r0, r1)
            long r2 = r2.getValue()
            int r3 = (int) r2
            if (r3 != r4) goto L16
            return
        L16:
            io.netty.handler.codec.compression.DecompressionException r2 = new io.netty.handler.codec.compression.DecompressionException
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            java.lang.String r3 = "stream corrupted: mismatching checksum: %d (expected: %d)"
            java.lang.String r3 = java.lang.String.format(r3, r0)
            r2.<init>(r3)
            throw r2
    }

    static java.nio.ByteBuffer safeNioBuffer(io.netty.buffer.ByteBuf r2) {
            int r0 = r2.nioBufferCount()
            r1 = 1
            if (r0 != r1) goto L14
            int r0 = r2.readerIndex()
            int r1 = r2.readableBytes()
            java.nio.ByteBuffer r2 = r2.internalNioBuffer(r0, r1)
            return r2
        L14:
            java.nio.ByteBuffer r2 = r2.nioBuffer()
            return r2
    }

    static java.nio.ByteBuffer safeNioBuffer(io.netty.buffer.ByteBuf r2, int r3, int r4) {
            int r0 = r2.nioBufferCount()
            r1 = 1
            if (r0 != r1) goto Lc
            java.nio.ByteBuffer r2 = r2.internalNioBuffer(r3, r4)
            return r2
        Lc:
            java.nio.ByteBuffer r2 = r2.nioBuffer(r3, r4)
            return r2
    }
}
