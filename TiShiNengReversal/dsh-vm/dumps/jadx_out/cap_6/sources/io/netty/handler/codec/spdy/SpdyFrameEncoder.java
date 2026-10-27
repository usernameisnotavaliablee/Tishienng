package io.netty.handler.codec.spdy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class SpdyFrameEncoder {
    private final int version;

    public SpdyFrameEncoder(io.netty.handler.codec.spdy.SpdyVersion r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto Lc
            int r2 = r2.getVersion()
            r1.version = r2
            return
        Lc:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "spdyVersion"
            r2.<init>(r0)
            throw r2
    }

    private void writeControlFrameHeader(io.netty.buffer.ByteBuf r3, int r4, byte r5, int r6) {
            r2 = this;
            int r0 = r2.version
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 | r1
            r3.writeShort(r0)
            r3.writeShort(r4)
            r3.writeByte(r5)
            r3.writeMedium(r6)
            return
    }

    public io.netty.buffer.ByteBuf encodeDataFrame(io.netty.buffer.ByteBufAllocator r3, int r4, boolean r5, io.netty.buffer.ByteBuf r6) {
            r2 = this;
            int r0 = r6.readableBytes()
            int r1 = r0 + 8
            io.netty.buffer.ByteBuf r3 = r3.ioBuffer(r1)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            io.netty.buffer.ByteBuf r3 = r3.order(r1)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r4 = r4 & r1
            r3.writeInt(r4)
            r3.writeByte(r5)
            r3.writeMedium(r0)
            int r4 = r6.readerIndex()
            r3.writeBytes(r6, r4, r0)
            return r3
    }

    public io.netty.buffer.ByteBuf encodeGoAwayFrame(io.netty.buffer.ByteBufAllocator r4, int r5, int r6) {
            r3 = this;
            r0 = 16
            io.netty.buffer.ByteBuf r4 = r4.ioBuffer(r0)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            io.netty.buffer.ByteBuf r4 = r4.order(r0)
            r0 = 7
            r1 = 0
            r2 = 8
            r3.writeControlFrameHeader(r4, r0, r1, r2)
            r4.writeInt(r5)
            r4.writeInt(r6)
            return r4
    }

    public io.netty.buffer.ByteBuf encodeHeadersFrame(io.netty.buffer.ByteBufAllocator r4, int r5, boolean r6, io.netty.buffer.ByteBuf r7) {
            r3 = this;
            int r0 = r7.readableBytes()
            int r1 = r0 + 4
            int r2 = r0 + 12
            io.netty.buffer.ByteBuf r4 = r4.ioBuffer(r2)
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN
            io.netty.buffer.ByteBuf r4 = r4.order(r2)
            r2 = 8
            r3.writeControlFrameHeader(r4, r2, r6, r1)
            r4.writeInt(r5)
            int r5 = r7.readerIndex()
            r4.writeBytes(r7, r5, r0)
            return r4
    }

    public io.netty.buffer.ByteBuf encodePingFrame(io.netty.buffer.ByteBufAllocator r4, int r5) {
            r3 = this;
            r0 = 12
            io.netty.buffer.ByteBuf r4 = r4.ioBuffer(r0)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            io.netty.buffer.ByteBuf r4 = r4.order(r0)
            r0 = 6
            r1 = 0
            r2 = 4
            r3.writeControlFrameHeader(r4, r0, r1, r2)
            r4.writeInt(r5)
            return r4
    }

    public io.netty.buffer.ByteBuf encodeRstStreamFrame(io.netty.buffer.ByteBufAllocator r4, int r5, int r6) {
            r3 = this;
            r0 = 16
            io.netty.buffer.ByteBuf r4 = r4.ioBuffer(r0)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            io.netty.buffer.ByteBuf r4 = r4.order(r0)
            r0 = 3
            r1 = 0
            r2 = 8
            r3.writeControlFrameHeader(r4, r0, r1, r2)
            r4.writeInt(r5)
            r4.writeInt(r6)
            return r4
    }

    public io.netty.buffer.ByteBuf encodeSettingsFrame(io.netty.buffer.ByteBufAllocator r6, io.netty.handler.codec.spdy.SpdySettingsFrame r7) {
            r5 = this;
            java.util.Set r0 = r7.ids()
            int r1 = r0.size()
            boolean r2 = r7.clearPreviouslyPersistedSettings()
            int r3 = r1 * 8
            int r4 = r3 + 4
            int r3 = r3 + 12
            io.netty.buffer.ByteBuf r6 = r6.ioBuffer(r3)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.BIG_ENDIAN
            io.netty.buffer.ByteBuf r6 = r6.order(r3)
            r3 = 4
            r5.writeControlFrameHeader(r6, r3, r2, r4)
            r6.writeInt(r1)
            java.util.Iterator r0 = r0.iterator()
        L27:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L64
            java.lang.Object r1 = r0.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r2 = r1.intValue()
            boolean r2 = r7.isPersistValue(r2)
            if (r2 == 0) goto L40
            r2 = 1
            byte r2 = (byte) r2
            goto L41
        L40:
            r2 = 0
        L41:
            int r3 = r1.intValue()
            boolean r3 = r7.isPersisted(r3)
            if (r3 == 0) goto L4e
            r2 = r2 | 2
            byte r2 = (byte) r2
        L4e:
            r6.writeByte(r2)
            int r2 = r1.intValue()
            r6.writeMedium(r2)
            int r1 = r1.intValue()
            int r1 = r7.getValue(r1)
            r6.writeInt(r1)
            goto L27
        L64:
            return r6
    }

    public io.netty.buffer.ByteBuf encodeSynReplyFrame(io.netty.buffer.ByteBufAllocator r4, int r5, boolean r6, io.netty.buffer.ByteBuf r7) {
            r3 = this;
            int r0 = r7.readableBytes()
            int r1 = r0 + 4
            int r2 = r0 + 12
            io.netty.buffer.ByteBuf r4 = r4.ioBuffer(r2)
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN
            io.netty.buffer.ByteBuf r4 = r4.order(r2)
            r2 = 2
            r3.writeControlFrameHeader(r4, r2, r6, r1)
            r4.writeInt(r5)
            int r5 = r7.readerIndex()
            r4.writeBytes(r7, r5, r0)
            return r4
    }

    public io.netty.buffer.ByteBuf encodeSynStreamFrame(io.netty.buffer.ByteBufAllocator r3, int r4, int r5, byte r6, boolean r7, boolean r8, io.netty.buffer.ByteBuf r9) {
            r2 = this;
            int r0 = r9.readableBytes()
            if (r8 == 0) goto L9
            r7 = r7 | 2
            byte r7 = (byte) r7
        L9:
            int r8 = r0 + 10
            int r1 = r0 + 18
            io.netty.buffer.ByteBuf r3 = r3.ioBuffer(r1)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            io.netty.buffer.ByteBuf r3 = r3.order(r1)
            r1 = 1
            r2.writeControlFrameHeader(r3, r1, r7, r8)
            r3.writeInt(r4)
            r3.writeInt(r5)
            r4 = r6 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 13
            r3.writeShort(r4)
            int r4 = r9.readerIndex()
            r3.writeBytes(r9, r4, r0)
            return r3
    }

    public io.netty.buffer.ByteBuf encodeWindowUpdateFrame(io.netty.buffer.ByteBufAllocator r4, int r5, int r6) {
            r3 = this;
            r0 = 16
            io.netty.buffer.ByteBuf r4 = r4.ioBuffer(r0)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            io.netty.buffer.ByteBuf r4 = r4.order(r0)
            r0 = 9
            r1 = 0
            r2 = 8
            r3.writeControlFrameHeader(r4, r0, r1, r2)
            r4.writeInt(r5)
            r4.writeInt(r6)
            return r4
    }
}
