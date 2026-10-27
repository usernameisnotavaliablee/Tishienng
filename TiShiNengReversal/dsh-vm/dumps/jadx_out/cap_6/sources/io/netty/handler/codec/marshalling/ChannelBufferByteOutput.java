package io.netty.handler.codec.marshalling;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class ChannelBufferByteOutput implements org.jboss.marshalling.ByteOutput {
    private final io.netty.buffer.ByteBuf buffer;

    ChannelBufferByteOutput(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            r0.<init>()
            r0.buffer = r1
            return
    }

    public void close() throws java.io.IOException {
            r0 = this;
            return
    }

    public void flush() throws java.io.IOException {
            r0 = this;
            return
    }

    io.netty.buffer.ByteBuf getBuffer() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buffer
            return r0
    }

    public void write(int r2) throws java.io.IOException {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buffer
            r0.writeByte(r2)
            return
    }

    public void write(byte[] r2) throws java.io.IOException {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buffer
            r0.writeBytes(r2)
            return
    }

    public void write(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.buffer
            r0.writeBytes(r2, r3, r4)
            return
    }
}
