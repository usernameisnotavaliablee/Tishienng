package io.netty.handler.codec.marshalling;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class ChannelBufferByteInput implements org.jboss.marshalling.ByteInput {
    private final io.netty.buffer.ByteBuf buffer;

    ChannelBufferByteInput(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            r0.<init>()
            r0.buffer = r1
            return
    }

    public int available() throws java.io.IOException {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buffer
            int r0 = r0.readableBytes()
            return r0
    }

    public void close() throws java.io.IOException {
            r0 = this;
            return
    }

    public int read() throws java.io.IOException {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buffer
            boolean r0 = r0.isReadable()
            if (r0 == 0) goto L11
            io.netty.buffer.ByteBuf r0 = r1.buffer
            byte r0 = r0.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
        L11:
            r0 = -1
            return r0
    }

    public int read(byte[] r3) throws java.io.IOException {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            int r3 = r2.read(r3, r0, r1)
            return r3
    }

    public int read(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            int r0 = r1.available()
            if (r0 != 0) goto L8
            r2 = -1
            return r2
        L8:
            int r4 = java.lang.Math.min(r0, r4)
            io.netty.buffer.ByteBuf r0 = r1.buffer
            r0.readBytes(r2, r3, r4)
            return r4
    }

    public long skip(long r4) throws java.io.IOException {
            r3 = this;
            io.netty.buffer.ByteBuf r0 = r3.buffer
            int r0 = r0.readableBytes()
            long r0 = (long) r0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 >= 0) goto Lc
            r4 = r0
        Lc:
            io.netty.buffer.ByteBuf r0 = r3.buffer
            int r1 = r0.readerIndex()
            long r1 = (long) r1
            long r1 = r1 + r4
            int r2 = (int) r1
            r0.readerIndex(r2)
            return r4
    }
}
