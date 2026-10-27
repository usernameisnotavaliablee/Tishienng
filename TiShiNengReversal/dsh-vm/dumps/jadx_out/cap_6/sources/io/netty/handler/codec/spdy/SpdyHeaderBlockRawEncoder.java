package io.netty.handler.codec.spdy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class SpdyHeaderBlockRawEncoder extends io.netty.handler.codec.spdy.SpdyHeaderBlockEncoder {
    private final int version;

    public SpdyHeaderBlockRawEncoder(io.netty.handler.codec.spdy.SpdyVersion r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto Lc
            int r2 = r2.getVersion()
            r1.version = r2
            return
        Lc:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "version"
            r2.<init>(r0)
            throw r2
    }

    private static void setLengthField(io.netty.buffer.ByteBuf r0, int r1, int r2) {
            r0.setInt(r1, r2)
            return
    }

    private static void writeLengthField(io.netty.buffer.ByteBuf r0, int r1) {
            r0.writeInt(r1)
            return
    }

    @Override // io.netty.handler.codec.spdy.SpdyHeaderBlockEncoder
    public io.netty.buffer.ByteBuf encode(io.netty.buffer.ByteBufAllocator r10, io.netty.handler.codec.spdy.SpdyHeadersFrame r11) throws java.lang.Exception {
            r9 = this;
            io.netty.handler.codec.spdy.SpdyHeaders r0 = r11.headers()
            java.util.Set r0 = r0.names()
            int r1 = r0.size()
            if (r1 != 0) goto L11
            io.netty.buffer.ByteBuf r10 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            return r10
        L11:
            r2 = 65535(0xffff, float:9.1834E-41)
            if (r1 > r2) goto L95
            io.netty.buffer.ByteBuf r10 = r10.heapBuffer()
            writeLengthField(r10, r1)
            java.util.Iterator r0 = r0.iterator()
        L21:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L94
            java.lang.Object r1 = r0.next()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r3 = r1.length()
            writeLengthField(r10, r3)
            io.netty.buffer.ByteBufUtil.writeAscii(r10, r1)
            int r3 = r10.writerIndex()
            r4 = 0
            writeLengthField(r10, r4)
            io.netty.handler.codec.spdy.SpdyHeaders r5 = r11.headers()
            java.util.List r5 = r5.getAll(r1)
            java.util.Iterator r5 = r5.iterator()
            r6 = 0
        L4c:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L68
            java.lang.Object r7 = r5.next()
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            int r8 = r7.length()
            if (r8 <= 0) goto L4c
            io.netty.buffer.ByteBufUtil.writeAscii(r10, r7)
            r10.writeByte(r4)
            int r8 = r8 + 1
            int r6 = r6 + r8
            goto L4c
        L68:
            if (r6 == 0) goto L6c
            int r6 = r6 + (-1)
        L6c:
            if (r6 > r2) goto L7d
            if (r6 <= 0) goto L21
            setLengthField(r10, r3, r6)
            int r1 = r10.writerIndex()
            int r1 = r1 + (-1)
            r10.writerIndex(r1)
            goto L21
        L7d:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "header exceeds allowable length: "
            r11.append(r0)
            r11.append(r1)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L94:
            return r10
        L95:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "header block contains too many headers"
            r10.<init>(r11)
            throw r10
    }

    @Override // io.netty.handler.codec.spdy.SpdyHeaderBlockEncoder
    void end() {
            r0 = this;
            return
    }
}
