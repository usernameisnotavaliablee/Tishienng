package io.netty.handler.codec.http.multipart;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class AbstractMemoryHttpData extends io.netty.handler.codec.http.multipart.AbstractHttpData {
    private io.netty.buffer.ByteBuf byteBuf;
    private int chunkPosition;

    protected AbstractMemoryHttpData(java.lang.String r1, java.nio.charset.Charset r2, long r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public void addContent(io.netty.buffer.ByteBuf r8, boolean r9) throws java.io.IOException {
            r7 = this;
            if (r8 == 0) goto L6e
            int r0 = r8.readableBytes()
            long r0 = (long) r0
            long r2 = r7.size
            long r2 = r2 + r0
            r7.checkSize(r2)
            long r2 = r7.definedSize
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L41
            long r4 = r7.size
            long r4 = r4 + r0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L1d
            goto L41
        L1d:
            java.io.IOException r8 = new java.io.IOException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = "Out of size: "
            r9.append(r2)
            long r2 = r7.size
            long r2 = r2 + r0
            r9.append(r2)
            java.lang.String r0 = " > "
            r9.append(r0)
            long r0 = r7.definedSize
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L41:
            long r2 = r7.size
            long r2 = r2 + r0
            r7.size = r2
            io.netty.buffer.ByteBuf r0 = r7.byteBuf
            if (r0 != 0) goto L4d
            r7.byteBuf = r8
            goto L6e
        L4d:
            boolean r1 = r0 instanceof io.netty.buffer.CompositeByteBuf
            r2 = 1
            if (r1 == 0) goto L58
            io.netty.buffer.CompositeByteBuf r0 = (io.netty.buffer.CompositeByteBuf) r0
            r0.addComponent(r2, r8)
            goto L6e
        L58:
            r0 = 2147483647(0x7fffffff, float:NaN)
            io.netty.buffer.CompositeByteBuf r0 = io.netty.buffer.Unpooled.compositeBuffer(r0)
            io.netty.buffer.ByteBuf r1 = r7.byteBuf
            r3 = 2
            io.netty.buffer.ByteBuf[] r3 = new io.netty.buffer.ByteBuf[r3]
            r4 = 0
            r3[r4] = r1
            r3[r2] = r8
            r0.addComponents(r2, r3)
            r7.byteBuf = r0
        L6e:
            if (r9 == 0) goto L74
            r7.setCompleted()
            return
        L74:
            if (r8 == 0) goto L77
            return
        L77:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r9 = "buffer"
            r8.<init>(r9)
            throw r8
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public void delete() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.byteBuf
            if (r0 == 0) goto La
            r0.release()
            r0 = 0
            r1.byteBuf = r0
        La:
            return
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public byte[] get() {
            r3 = this;
            io.netty.buffer.ByteBuf r0 = r3.byteBuf
            if (r0 != 0) goto Lb
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            byte[] r0 = r0.array()
            return r0
        Lb:
            int r0 = r0.readableBytes()
            byte[] r0 = new byte[r0]
            io.netty.buffer.ByteBuf r1 = r3.byteBuf
            int r2 = r1.readerIndex()
            r1.getBytes(r2, r0)
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public io.netty.buffer.ByteBuf getByteBuf() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.byteBuf
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public io.netty.buffer.ByteBuf getChunk(int r4) throws java.io.IOException {
            r3 = this;
            io.netty.buffer.ByteBuf r0 = r3.byteBuf
            r1 = 0
            if (r0 == 0) goto L2d
            if (r4 == 0) goto L2d
            int r0 = r0.readableBytes()
            if (r0 != 0) goto Le
            goto L2d
        Le:
            io.netty.buffer.ByteBuf r0 = r3.byteBuf
            int r0 = r0.readableBytes()
            int r2 = r3.chunkPosition
            int r0 = r0 - r2
            if (r0 != 0) goto L1e
            r3.chunkPosition = r1
            io.netty.buffer.ByteBuf r4 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            return r4
        L1e:
            if (r0 >= r4) goto L21
            r4 = r0
        L21:
            io.netty.buffer.ByteBuf r0 = r3.byteBuf
            io.netty.buffer.ByteBuf r0 = r0.retainedSlice(r2, r4)
            int r1 = r3.chunkPosition
            int r1 = r1 + r4
            r3.chunkPosition = r1
            return r0
        L2d:
            r3.chunkPosition = r1
            io.netty.buffer.ByteBuf r4 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            return r4
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public java.io.File getFile() throws java.io.IOException {
            r2 = this;
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Not represented by a file"
            r0.<init>(r1)
            throw r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public java.lang.String getString() {
            r1 = this;
            java.nio.charset.Charset r0 = io.netty.handler.codec.http.HttpConstants.DEFAULT_CHARSET
            java.lang.String r0 = r1.getString(r0)
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public java.lang.String getString(java.nio.charset.Charset r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.byteBuf
            if (r0 != 0) goto L7
            java.lang.String r2 = ""
            return r2
        L7:
            if (r2 != 0) goto Lb
            java.nio.charset.Charset r2 = io.netty.handler.codec.http.HttpConstants.DEFAULT_CHARSET
        Lb:
            java.lang.String r2 = r0.toString(r2)
            return r2
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public boolean isInMemory() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public boolean renameTo(java.io.File r10) throws java.io.IOException {
            r9 = this;
            if (r10 == 0) goto L68
            io.netty.buffer.ByteBuf r0 = r9.byteBuf
            r1 = 1
            if (r0 != 0) goto L25
            boolean r0 = r10.createNewFile()
            if (r0 == 0) goto Le
            return r1
        Le:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "file exists already: "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10)
            throw r0
        L25:
            int r0 = r0.readableBytes()
            java.io.FileOutputStream r2 = new java.io.FileOutputStream
            r2.<init>(r10)
            java.nio.channels.FileChannel r10 = r2.getChannel()
            io.netty.buffer.ByteBuf r3 = r9.byteBuf
            int r3 = r3.nioBufferCount()
            r4 = 0
            if (r3 != r1) goto L4a
            io.netty.buffer.ByteBuf r3 = r9.byteBuf
            java.nio.ByteBuffer r3 = r3.nioBuffer()
            r5 = 0
        L42:
            if (r5 >= r0) goto L5b
            int r6 = r10.write(r3)
            int r5 = r5 + r6
            goto L42
        L4a:
            io.netty.buffer.ByteBuf r3 = r9.byteBuf
            java.nio.ByteBuffer[] r3 = r3.nioBuffers()
            r5 = 0
        L51:
            if (r5 >= r0) goto L5b
            long r5 = (long) r5
            long r7 = r10.write(r3)
            long r5 = r5 + r7
            int r5 = (int) r5
            goto L51
        L5b:
            r10.force(r4)
            r10.close()
            r2.close()
            if (r5 != r0) goto L67
            return r1
        L67:
            return r4
        L68:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            java.lang.String r0 = "dest"
            r10.<init>(r0)
            throw r10
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public void setContent(io.netty.buffer.ByteBuf r8) throws java.io.IOException {
            r7 = this;
            if (r8 == 0) goto L47
            int r0 = r8.readableBytes()
            long r0 = (long) r0
            r7.checkSize(r0)
            long r2 = r7.definedSize
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L38
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 < 0) goto L17
            goto L38
        L17:
            java.io.IOException r8 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Out of size: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " > "
            r2.append(r0)
            long r0 = r7.definedSize
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r8.<init>(r0)
            throw r8
        L38:
            io.netty.buffer.ByteBuf r2 = r7.byteBuf
            if (r2 == 0) goto L3f
            r2.release()
        L3f:
            r7.byteBuf = r8
            r7.size = r0
            r7.setCompleted()
            return
        L47:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r0 = "buffer"
            r8.<init>(r0)
            throw r8
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public void setContent(java.io.File r10) throws java.io.IOException {
            r9 = this;
            if (r10 == 0) goto L59
            long r0 = r10.length()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L51
            r9.checkSize(r0)
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r10)
            java.nio.channels.FileChannel r10 = r2.getChannel()
            int r3 = (int) r0
            byte[] r3 = new byte[r3]
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r3)
            r4 = 0
            r5 = 0
        L22:
            long r6 = (long) r5
            int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r8 >= 0) goto L2d
            int r6 = r10.read(r3)
            int r5 = r5 + r6
            goto L22
        L2d:
            r10.close()
            r2.close()
            r3.flip()
            io.netty.buffer.ByteBuf r10 = r9.byteBuf
            if (r10 == 0) goto L3d
            r10.release()
        L3d:
            r10 = 1
            java.nio.ByteBuffer[] r10 = new java.nio.ByteBuffer[r10]
            r10[r4] = r3
            r2 = 2147483647(0x7fffffff, float:NaN)
            io.netty.buffer.ByteBuf r10 = io.netty.buffer.Unpooled.wrappedBuffer(r2, r10)
            r9.byteBuf = r10
            r9.size = r0
            r9.setCompleted()
            return
        L51:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "File too big to be loaded in memory"
            r10.<init>(r0)
            throw r10
        L59:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            java.lang.String r0 = "file"
            r10.<init>(r0)
            throw r10
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public void setContent(java.io.InputStream r8) throws java.io.IOException {
            r7 = this;
            if (r8 == 0) goto L5f
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.buffer()
            r1 = 16384(0x4000, float:2.2959E-41)
            byte[] r1 = new byte[r1]
            int r2 = r8.read(r1)
            r3 = 0
            r4 = 0
        L10:
            if (r2 <= 0) goto L1f
            r0.writeBytes(r1, r3, r2)
            int r4 = r4 + r2
            long r5 = (long) r4
            r7.checkSize(r5)
            int r2 = r8.read(r1)
            goto L10
        L1f:
            long r1 = (long) r4
            r7.size = r1
            long r3 = r7.definedSize
            r5 = 0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 <= 0) goto L52
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 < 0) goto L2f
            goto L52
        L2f:
            java.io.IOException r8 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Out of size: "
            r0.append(r1)
            long r1 = r7.size
            r0.append(r1)
            java.lang.String r1 = " > "
            r0.append(r1)
            long r1 = r7.definedSize
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L52:
            io.netty.buffer.ByteBuf r8 = r7.byteBuf
            if (r8 == 0) goto L59
            r8.release()
        L59:
            r7.byteBuf = r0
            r7.setCompleted()
            return
        L5f:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r0 = "inputStream"
            r8.<init>(r0)
            throw r8
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo41touch() {
            r1 = this;
            io.netty.handler.codec.http.multipart.HttpData r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.HttpData r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractHttpData, io.netty.handler.codec.http.multipart.HttpData, io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.http.multipart.HttpData mo41touch() {
            r1 = this;
            r0 = 0
            io.netty.handler.codec.http.multipart.HttpData r0 = r1.mo42touch(r0)
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractHttpData, io.netty.handler.codec.http.multipart.HttpData, io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.http.multipart.HttpData mo42touch(java.lang.Object r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.byteBuf
            if (r0 == 0) goto L7
            r0.touch(r2)
        L7:
            return r1
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractHttpData, io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.InterfaceHttpData mo41touch() {
            r1 = this;
            io.netty.handler.codec.http.multipart.HttpData r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractHttpData, io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.multipart.InterfaceHttpData mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.HttpData r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractHttpData
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch() {
            r1 = this;
            io.netty.handler.codec.http.multipart.HttpData r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractHttpData
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.http.multipart.HttpData r1 = r0.mo42touch(r1)
            return r1
    }
}
