package io.netty.handler.codec.compression;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class JZlibDecoder extends io.netty.handler.codec.compression.ZlibDecoder {
    private byte[] dictionary;
    private volatile boolean finished;
    private final com.jcraft.jzlib.Inflater z;

    public JZlibDecoder() {
            r1 = this;
            io.netty.handler.codec.compression.ZlibWrapper r0 = io.netty.handler.codec.compression.ZlibWrapper.ZLIB
            r1.<init>(r0)
            return
    }

    public JZlibDecoder(io.netty.handler.codec.compression.ZlibWrapper r3) {
            r2 = this;
            r2.<init>()
            com.jcraft.jzlib.Inflater r0 = new com.jcraft.jzlib.Inflater
            r0.<init>()
            r2.z = r0
            if (r3 == 0) goto L1c
            com.jcraft.jzlib.JZlib$WrapperType r3 = io.netty.handler.codec.compression.ZlibUtil.convertWrapperType(r3)
            int r3 = r0.init(r3)
            if (r3 == 0) goto L1b
            java.lang.String r1 = "initialization failure"
            io.netty.handler.codec.compression.ZlibUtil.fail(r0, r1, r3)
        L1b:
            return
        L1c:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "wrapper"
            r3.<init>(r0)
            throw r3
    }

    public JZlibDecoder(byte[] r3) {
            r2 = this;
            r2.<init>()
            com.jcraft.jzlib.Inflater r0 = new com.jcraft.jzlib.Inflater
            r0.<init>()
            r2.z = r0
            if (r3 == 0) goto L1c
            r2.dictionary = r3
            com.jcraft.jzlib.JZlib$WrapperType r3 = com.jcraft.jzlib.JZlib.W_ZLIB
            int r3 = r0.inflateInit(r3)
            if (r3 == 0) goto L1b
            java.lang.String r1 = "initialization failure"
            io.netty.handler.codec.compression.ZlibUtil.fail(r0, r1, r3)
        L1b:
            return
        L1c:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "dictionary"
            r3.<init>(r0)
            throw r3
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder
    protected void decode(io.netty.channel.ChannelHandlerContext r8, io.netty.buffer.ByteBuf r9, java.util.List<java.lang.Object> r10) throws java.lang.Exception {
            r7 = this;
            boolean r0 = r7.finished
            if (r0 == 0) goto Lc
            int r8 = r9.readableBytes()
            r9.skipBytes(r8)
            return
        Lc:
            int r0 = r9.readableBytes()
            if (r0 != 0) goto L13
            return
        L13:
            r1 = 0
            com.jcraft.jzlib.Inflater r2 = r7.z     // Catch: java.lang.Throwable -> L34
            r2.avail_in = r0     // Catch: java.lang.Throwable -> L34
            boolean r2 = r9.hasArray()     // Catch: java.lang.Throwable -> L34
            if (r2 == 0) goto L37
            com.jcraft.jzlib.Inflater r2 = r7.z     // Catch: java.lang.Throwable -> L34
            byte[] r3 = r9.array()     // Catch: java.lang.Throwable -> L34
            r2.next_in = r3     // Catch: java.lang.Throwable -> L34
            com.jcraft.jzlib.Inflater r2 = r7.z     // Catch: java.lang.Throwable -> L34
            int r3 = r9.arrayOffset()     // Catch: java.lang.Throwable -> L34
            int r4 = r9.readerIndex()     // Catch: java.lang.Throwable -> L34
            int r3 = r3 + r4
            r2.next_in_index = r3     // Catch: java.lang.Throwable -> L34
            goto L49
        L34:
            r8 = move-exception
            goto L107
        L37:
            byte[] r2 = new byte[r0]     // Catch: java.lang.Throwable -> L34
            int r3 = r9.readerIndex()     // Catch: java.lang.Throwable -> L34
            r9.getBytes(r3, r2)     // Catch: java.lang.Throwable -> L34
            com.jcraft.jzlib.Inflater r3 = r7.z     // Catch: java.lang.Throwable -> L34
            r3.next_in = r2     // Catch: java.lang.Throwable -> L34
            com.jcraft.jzlib.Inflater r2 = r7.z     // Catch: java.lang.Throwable -> L34
            r3 = 0
            r2.next_in_index = r3     // Catch: java.lang.Throwable -> L34
        L49:
            com.jcraft.jzlib.Inflater r2 = r7.z     // Catch: java.lang.Throwable -> L34
            int r2 = r2.next_in_index     // Catch: java.lang.Throwable -> L34
            io.netty.buffer.ByteBufAllocator r8 = r8.alloc()     // Catch: java.lang.Throwable -> L34
            r3 = 1
            int r0 = r0 << r3
            io.netty.buffer.ByteBuf r8 = r8.heapBuffer(r0)     // Catch: java.lang.Throwable -> L34
        L57:
            com.jcraft.jzlib.Inflater r0 = r7.z     // Catch: java.lang.Throwable -> L97
            int r0 = r0.avail_in     // Catch: java.lang.Throwable -> L97
            int r0 = r0 << r3
            r8.ensureWritable(r0)     // Catch: java.lang.Throwable -> L97
            com.jcraft.jzlib.Inflater r0 = r7.z     // Catch: java.lang.Throwable -> L97
            int r4 = r8.writableBytes()     // Catch: java.lang.Throwable -> L97
            r0.avail_out = r4     // Catch: java.lang.Throwable -> L97
            com.jcraft.jzlib.Inflater r0 = r7.z     // Catch: java.lang.Throwable -> L97
            byte[] r4 = r8.array()     // Catch: java.lang.Throwable -> L97
            r0.next_out = r4     // Catch: java.lang.Throwable -> L97
            com.jcraft.jzlib.Inflater r0 = r7.z     // Catch: java.lang.Throwable -> L97
            int r4 = r8.arrayOffset()     // Catch: java.lang.Throwable -> L97
            int r5 = r8.writerIndex()     // Catch: java.lang.Throwable -> L97
            int r4 = r4 + r5
            r0.next_out_index = r4     // Catch: java.lang.Throwable -> L97
            com.jcraft.jzlib.Inflater r0 = r7.z     // Catch: java.lang.Throwable -> L97
            int r0 = r0.next_out_index     // Catch: java.lang.Throwable -> L97
            com.jcraft.jzlib.Inflater r4 = r7.z     // Catch: java.lang.Throwable -> L97
            r5 = 2
            int r4 = r4.inflate(r5)     // Catch: java.lang.Throwable -> L97
            com.jcraft.jzlib.Inflater r6 = r7.z     // Catch: java.lang.Throwable -> L97
            int r6 = r6.next_out_index     // Catch: java.lang.Throwable -> L97
            int r6 = r6 - r0
            if (r6 <= 0) goto L99
            int r0 = r8.writerIndex()     // Catch: java.lang.Throwable -> L97
            int r0 = r0 + r6
            r8.writerIndex(r0)     // Catch: java.lang.Throwable -> L97
            goto L99
        L97:
            r0 = move-exception
            goto Lf1
        L99:
            r0 = -5
            if (r4 == r0) goto Lcd
            if (r4 == 0) goto L57
            if (r4 == r3) goto Lc5
            java.lang.String r0 = "decompression failure"
            if (r4 == r5) goto Laa
            com.jcraft.jzlib.Inflater r5 = r7.z     // Catch: java.lang.Throwable -> L97
            io.netty.handler.codec.compression.ZlibUtil.fail(r5, r0, r4)     // Catch: java.lang.Throwable -> L97
            goto L57
        Laa:
            byte[] r5 = r7.dictionary     // Catch: java.lang.Throwable -> L97
            if (r5 != 0) goto Lb4
            com.jcraft.jzlib.Inflater r5 = r7.z     // Catch: java.lang.Throwable -> L97
            io.netty.handler.codec.compression.ZlibUtil.fail(r5, r0, r4)     // Catch: java.lang.Throwable -> L97
            goto L57
        Lb4:
            com.jcraft.jzlib.Inflater r0 = r7.z     // Catch: java.lang.Throwable -> L97
            int r4 = r5.length     // Catch: java.lang.Throwable -> L97
            int r0 = r0.inflateSetDictionary(r5, r4)     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L57
            com.jcraft.jzlib.Inflater r4 = r7.z     // Catch: java.lang.Throwable -> L97
            java.lang.String r5 = "failed to set the dictionary"
            io.netty.handler.codec.compression.ZlibUtil.fail(r4, r5, r0)     // Catch: java.lang.Throwable -> L97
            goto L57
        Lc5:
            r7.finished = r3     // Catch: java.lang.Throwable -> L97
            com.jcraft.jzlib.Inflater r0 = r7.z     // Catch: java.lang.Throwable -> L97
            r0.inflateEnd()     // Catch: java.lang.Throwable -> L97
            goto Ld3
        Lcd:
            com.jcraft.jzlib.Inflater r0 = r7.z     // Catch: java.lang.Throwable -> L97
            int r0 = r0.avail_in     // Catch: java.lang.Throwable -> L97
            if (r0 > 0) goto L57
        Ld3:
            com.jcraft.jzlib.Inflater r0 = r7.z     // Catch: java.lang.Throwable -> L34
            int r0 = r0.next_in_index     // Catch: java.lang.Throwable -> L34
            int r0 = r0 - r2
            r9.skipBytes(r0)     // Catch: java.lang.Throwable -> L34
            boolean r9 = r8.isReadable()     // Catch: java.lang.Throwable -> L34
            if (r9 == 0) goto Le5
            r10.add(r8)     // Catch: java.lang.Throwable -> L34
            goto Le8
        Le5:
            r8.release()     // Catch: java.lang.Throwable -> L34
        Le8:
            com.jcraft.jzlib.Inflater r8 = r7.z
            r8.next_in = r1
            com.jcraft.jzlib.Inflater r8 = r7.z
            r8.next_out = r1
            return
        Lf1:
            com.jcraft.jzlib.Inflater r3 = r7.z     // Catch: java.lang.Throwable -> L34
            int r3 = r3.next_in_index     // Catch: java.lang.Throwable -> L34
            int r3 = r3 - r2
            r9.skipBytes(r3)     // Catch: java.lang.Throwable -> L34
            boolean r9 = r8.isReadable()     // Catch: java.lang.Throwable -> L34
            if (r9 == 0) goto L103
            r10.add(r8)     // Catch: java.lang.Throwable -> L34
            goto L106
        L103:
            r8.release()     // Catch: java.lang.Throwable -> L34
        L106:
            throw r0     // Catch: java.lang.Throwable -> L34
        L107:
            com.jcraft.jzlib.Inflater r9 = r7.z
            r9.next_in = r1
            com.jcraft.jzlib.Inflater r9 = r7.z
            r9.next_out = r1
            throw r8
    }

    @Override // io.netty.handler.codec.compression.ZlibDecoder
    public boolean isClosed() {
            r1 = this;
            boolean r0 = r1.finished
            return r0
    }
}
