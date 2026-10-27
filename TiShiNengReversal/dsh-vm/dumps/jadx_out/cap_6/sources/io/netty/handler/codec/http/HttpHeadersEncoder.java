package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class HttpHeadersEncoder {
    private static final int COLON_AND_SPACE_SHORT = 14880;

    private HttpHeadersEncoder() {
            r0 = this;
            r0.<init>()
            return
    }

    static void encoderHeader(java.lang.CharSequence r3, java.lang.CharSequence r4, io.netty.buffer.ByteBuf r5) {
            int r0 = r3.length()
            int r1 = r4.length()
            int r2 = r0 + r1
            int r2 = r2 + 4
            r5.ensureWritable(r2)
            int r2 = r5.writerIndex()
            writeAscii(r5, r2, r3)
            int r2 = r2 + r0
            r3 = 14880(0x3a20, float:2.0851E-41)
            io.netty.buffer.ByteBufUtil.setShortBE(r5, r2, r3)
            int r2 = r2 + 2
            writeAscii(r5, r2, r4)
            int r2 = r2 + r1
            r3 = 3338(0xd0a, float:4.678E-42)
            io.netty.buffer.ByteBufUtil.setShortBE(r5, r2, r3)
            int r2 = r2 + 2
            r5.writerIndex(r2)
            return
    }

    private static void writeAscii(io.netty.buffer.ByteBuf r2, int r3, java.lang.CharSequence r4) {
            boolean r0 = r4 instanceof io.netty.util.AsciiString
            if (r0 == 0) goto L10
            r0 = r4
            io.netty.util.AsciiString r0 = (io.netty.util.AsciiString) r0
            r1 = 0
            int r4 = r4.length()
            io.netty.buffer.ByteBufUtil.copy(r0, r1, r2, r3, r4)
            return
        L10:
            java.nio.charset.Charset r0 = io.netty.util.CharsetUtil.US_ASCII
            r2.setCharSequence(r3, r4, r0)
            return
    }
}
