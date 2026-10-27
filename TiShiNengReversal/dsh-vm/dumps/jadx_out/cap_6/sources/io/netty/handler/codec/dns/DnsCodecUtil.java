package io.netty.handler.codec.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class DnsCodecUtil {
    private DnsCodecUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    static java.lang.String decodeDomainName(io.netty.buffer.ByteBuf r10) {
            int r0 = r10.writerIndex()
            int r1 = r10.readableBytes()
            java.lang.String r2 = "."
            if (r1 != 0) goto Ld
            return r2
        Ld:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r1 = r1 << 1
            r3.<init>(r1)
            r1 = -1
            r4 = 0
            r5 = -1
        L17:
            boolean r6 = r10.isReadable()
            r7 = 46
            if (r6 == 0) goto L86
            short r6 = r10.readUnsignedByte()
            r8 = r6 & 192(0xc0, float:2.69E-43)
            r9 = 192(0xc0, float:2.69E-43)
            if (r8 != r9) goto L62
            if (r5 != r1) goto L31
            int r5 = r10.readerIndex()
            int r5 = r5 + 1
        L31:
            boolean r7 = r10.isReadable()
            if (r7 == 0) goto L5a
            r6 = r6 & 63
            int r6 = r6 << 8
            short r7 = r10.readUnsignedByte()
            r6 = r6 | r7
            if (r6 >= r0) goto L52
            r10.readerIndex(r6)
            int r4 = r4 + 2
            if (r4 >= r0) goto L4a
            goto L17
        L4a:
            io.netty.handler.codec.CorruptedFrameException r10 = new io.netty.handler.codec.CorruptedFrameException
            java.lang.String r0 = "name contains a loop."
            r10.<init>(r0)
            throw r10
        L52:
            io.netty.handler.codec.CorruptedFrameException r10 = new io.netty.handler.codec.CorruptedFrameException
            java.lang.String r0 = "name has an out-of-range pointer"
            r10.<init>(r0)
            throw r10
        L5a:
            io.netty.handler.codec.CorruptedFrameException r10 = new io.netty.handler.codec.CorruptedFrameException
            java.lang.String r0 = "truncated pointer in a name"
            r10.<init>(r0)
            throw r10
        L62:
            if (r6 == 0) goto L86
            boolean r8 = r10.isReadable(r6)
            if (r8 == 0) goto L7e
            int r8 = r10.readerIndex()
            java.nio.charset.Charset r9 = io.netty.util.CharsetUtil.UTF_8
            java.lang.String r8 = r10.toString(r8, r6, r9)
            r3.append(r8)
            r3.append(r7)
            r10.skipBytes(r6)
            goto L17
        L7e:
            io.netty.handler.codec.CorruptedFrameException r10 = new io.netty.handler.codec.CorruptedFrameException
            java.lang.String r0 = "truncated label in a name"
            r10.<init>(r0)
            throw r10
        L86:
            if (r5 == r1) goto L8b
            r10.readerIndex(r5)
        L8b:
            int r10 = r3.length()
            if (r10 != 0) goto L92
            return r2
        L92:
            int r10 = r3.length()
            int r10 = r10 + (-1)
            char r10 = r3.charAt(r10)
            if (r10 == r7) goto La1
            r3.append(r7)
        La1:
            java.lang.String r10 = r3.toString()
            return r10
    }

    static io.netty.buffer.ByteBuf decompressDomainName(io.netty.buffer.ByteBuf r2) {
            java.lang.String r0 = decodeDomainName(r2)
            io.netty.buffer.ByteBufAllocator r2 = r2.alloc()
            int r1 = r0.length()
            int r1 = r1 << 1
            io.netty.buffer.ByteBuf r2 = r2.buffer(r1)
            encodeDomainName(r0, r2)
            return r2
    }

    static void encodeDomainName(java.lang.String r5, io.netty.buffer.ByteBuf r6) {
            java.lang.String r0 = "."
            boolean r0 = r0.equals(r5)
            r1 = 0
            if (r0 == 0) goto Ld
            r6.writeByte(r1)
            return
        Ld:
            java.lang.String r0 = "\\."
            java.lang.String[] r5 = r5.split(r0)
            int r0 = r5.length
            r2 = 0
        L15:
            if (r2 >= r0) goto L29
            r3 = r5[r2]
            int r4 = r3.length()
            if (r4 != 0) goto L20
            goto L29
        L20:
            r6.writeByte(r4)
            io.netty.buffer.ByteBufUtil.writeAscii(r6, r3)
            int r2 = r2 + 1
            goto L15
        L29:
            r6.writeByte(r1)
            return
    }
}
