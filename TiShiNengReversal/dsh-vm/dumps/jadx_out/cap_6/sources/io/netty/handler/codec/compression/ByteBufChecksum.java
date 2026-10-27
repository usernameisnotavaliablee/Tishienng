package io.netty.handler.codec.compression;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
abstract class ByteBufChecksum implements java.util.zip.Checksum {
    private static final java.lang.reflect.Method ADLER32_UPDATE_METHOD = null;
    private static final java.lang.reflect.Method CRC32_UPDATE_METHOD = null;
    private final io.netty.util.ByteProcessor updateProcessor;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class ReflectiveByteBufChecksum extends io.netty.handler.codec.compression.ByteBufChecksum.SlowByteBufChecksum {
        private final java.lang.reflect.Method method;

        ReflectiveByteBufChecksum(java.util.zip.Checksum r1, java.lang.reflect.Method r2) {
                r0 = this;
                r0.<init>(r1)
                r0.method = r2
                return
        }

        @Override // io.netty.handler.codec.compression.ByteBufChecksum
        public void update(io.netty.buffer.ByteBuf r3, int r4, int r5) {
                r2 = this;
                boolean r0 = r3.hasArray()
                if (r0 == 0) goto L13
                byte[] r0 = r3.array()
                int r3 = r3.arrayOffset()
                int r3 = r3 + r4
                r2.update(r0, r3, r5)
                return
            L13:
                java.lang.reflect.Method r0 = r2.method     // Catch: java.lang.Throwable -> L25
                java.util.zip.Checksum r1 = r2.checksum     // Catch: java.lang.Throwable -> L25
                java.nio.ByteBuffer r3 = io.netty.handler.codec.compression.CompressionUtil.safeNioBuffer(r3, r4, r5)     // Catch: java.lang.Throwable -> L25
                r4 = 1
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L25
                r5 = 0
                r4[r5] = r3     // Catch: java.lang.Throwable -> L25
                r0.invoke(r1, r4)     // Catch: java.lang.Throwable -> L25
                return
            L25:
                java.lang.Error r3 = new java.lang.Error
                r3.<init>()
                throw r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class SlowByteBufChecksum extends io.netty.handler.codec.compression.ByteBufChecksum {
        protected final java.util.zip.Checksum checksum;

        SlowByteBufChecksum(java.util.zip.Checksum r1) {
                r0 = this;
                r0.<init>()
                r0.checksum = r1
                return
        }

        @Override // java.util.zip.Checksum
        public long getValue() {
                r2 = this;
                java.util.zip.Checksum r0 = r2.checksum
                long r0 = r0.getValue()
                return r0
        }

        @Override // java.util.zip.Checksum
        public void reset() {
                r1 = this;
                java.util.zip.Checksum r0 = r1.checksum
                r0.reset()
                return
        }

        @Override // java.util.zip.Checksum
        public void update(int r2) {
                r1 = this;
                java.util.zip.Checksum r0 = r1.checksum
                r0.update(r2)
                return
        }

        @Override // java.util.zip.Checksum
        public void update(byte[] r2, int r3, int r4) {
                r1 = this;
                java.util.zip.Checksum r0 = r1.checksum
                r0.update(r2, r3, r4)
                return
        }
    }

    static {
            java.util.zip.Adler32 r0 = new java.util.zip.Adler32
            r0.<init>()
            java.lang.reflect.Method r0 = updateByteBuffer(r0)
            io.netty.handler.codec.compression.ByteBufChecksum.ADLER32_UPDATE_METHOD = r0
            java.util.zip.CRC32 r0 = new java.util.zip.CRC32
            r0.<init>()
            java.lang.reflect.Method r0 = updateByteBuffer(r0)
            io.netty.handler.codec.compression.ByteBufChecksum.CRC32_UPDATE_METHOD = r0
            return
    }

    ByteBufChecksum() {
            r1 = this;
            r1.<init>()
            io.netty.handler.codec.compression.ByteBufChecksum$1 r0 = new io.netty.handler.codec.compression.ByteBufChecksum$1
            r0.<init>(r1)
            r1.updateProcessor = r0
            return
    }

    private static java.lang.reflect.Method updateByteBuffer(java.util.zip.Checksum r7) {
            int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
            r1 = 8
            r2 = 0
            if (r0 < r1) goto L27
            java.lang.Class r0 = r7.getClass()     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = "update"
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L27
            java.lang.Class<java.nio.ByteBuffer> r5 = java.nio.ByteBuffer.class
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.Throwable -> L27
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r4)     // Catch: java.lang.Throwable -> L27
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r3)     // Catch: java.lang.Throwable -> L27
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L27
            r3[r6] = r1     // Catch: java.lang.Throwable -> L27
            r0.invoke(r7, r3)     // Catch: java.lang.Throwable -> L27
            return r0
        L27:
            return r2
    }

    static io.netty.handler.codec.compression.ByteBufChecksum wrapChecksum(java.util.zip.Checksum r2) {
            java.lang.String r0 = "checksum"
            io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            boolean r0 = r2 instanceof io.netty.handler.codec.compression.ByteBufChecksum
            if (r0 == 0) goto Lc
            io.netty.handler.codec.compression.ByteBufChecksum r2 = (io.netty.handler.codec.compression.ByteBufChecksum) r2
            return r2
        Lc:
            boolean r0 = r2 instanceof java.util.zip.Adler32
            if (r0 == 0) goto L1a
            java.lang.reflect.Method r0 = io.netty.handler.codec.compression.ByteBufChecksum.ADLER32_UPDATE_METHOD
            if (r0 == 0) goto L1a
            io.netty.handler.codec.compression.ByteBufChecksum$ReflectiveByteBufChecksum r1 = new io.netty.handler.codec.compression.ByteBufChecksum$ReflectiveByteBufChecksum
            r1.<init>(r2, r0)
            return r1
        L1a:
            boolean r0 = r2 instanceof java.util.zip.CRC32
            if (r0 == 0) goto L28
            java.lang.reflect.Method r0 = io.netty.handler.codec.compression.ByteBufChecksum.CRC32_UPDATE_METHOD
            if (r0 == 0) goto L28
            io.netty.handler.codec.compression.ByteBufChecksum$ReflectiveByteBufChecksum r1 = new io.netty.handler.codec.compression.ByteBufChecksum$ReflectiveByteBufChecksum
            r1.<init>(r2, r0)
            return r1
        L28:
            io.netty.handler.codec.compression.ByteBufChecksum$SlowByteBufChecksum r0 = new io.netty.handler.codec.compression.ByteBufChecksum$SlowByteBufChecksum
            r0.<init>(r2)
            return r0
    }

    public void update(io.netty.buffer.ByteBuf r2, int r3, int r4) {
            r1 = this;
            boolean r0 = r2.hasArray()
            if (r0 == 0) goto L13
            byte[] r0 = r2.array()
            int r2 = r2.arrayOffset()
            int r2 = r2 + r3
            r1.update(r0, r2, r4)
            return
        L13:
            io.netty.util.ByteProcessor r0 = r1.updateProcessor
            r2.forEachByte(r3, r4, r0)
            return
    }
}
