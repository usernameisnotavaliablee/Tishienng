package com.tsn.chat.handler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class c extends io.netty.handler.codec.MessageToByteEncoder<java.lang.Object> {
    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    public static byte[] a(byte[] r3, byte[] r4) {
            int r0 = r3.length
            int r1 = r4.length
            int r0 = r0 + r1
            byte[] r0 = new byte[r0]
            int r1 = r3.length
            r2 = 0
            java.lang.System.arraycopy(r3, r2, r0, r2, r1)
            int r3 = r3.length
            int r1 = r4.length
            java.lang.System.arraycopy(r4, r2, r0, r3, r1)
            return r0
    }

    @Override // io.netty.handler.codec.MessageToByteEncoder
    protected void encode(io.netty.channel.ChannelHandlerContext r1, java.lang.Object r2, io.netty.buffer.ByteBuf r3) throws java.lang.Exception {
            r0 = this;
            com.tsn.chat.model.RequestMessage r2 = (com.tsn.chat.model.RequestMessage) r2
            java.io.PrintStream r1 = java.lang.System.out
            r2.toString()
            r1.getClass()
            byte r1 = r2.getHeader()
            r3.writeByte(r1)
            int r1 = r2.getLength()
            r3.writeShort(r1)
            byte r1 = r2.getControlType()
            r3.writeByte(r1)
            java.lang.String r1 = r2.getDatas()
            byte[] r1 = r1.getBytes()
            r3.writeBytes(r1)
            r1 = 0
            r3.writeShort(r1)
            return
    }
}
