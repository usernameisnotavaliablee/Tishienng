package io.netty.handler.codec.http.multipart;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class AbstractDiskHttpData extends io.netty.handler.codec.http.multipart.AbstractHttpData {
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private java.io.File file;
    private java.nio.channels.FileChannel fileChannel;
    private boolean isRenamed;

    static {
            java.lang.Class<io.netty.handler.codec.http.multipart.AbstractDiskHttpData> r0 = io.netty.handler.codec.http.multipart.AbstractDiskHttpData.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.handler.codec.http.multipart.AbstractDiskHttpData.logger = r0
            return
    }

    protected AbstractDiskHttpData(java.lang.String r1, java.nio.charset.Charset r2, long r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    private static byte[] readFrom(java.io.File r9) throws java.io.IOException {
            long r0 = r9.length()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L31
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r9)
            int r9 = (int) r0
            byte[] r9 = new byte[r9]
            java.nio.channels.FileChannel r3 = r2.getChannel()     // Catch: java.lang.Throwable -> L27
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r9)     // Catch: java.lang.Throwable -> L27
            r5 = 0
        L1c:
            long r6 = (long) r5     // Catch: java.lang.Throwable -> L27
            int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r8 >= 0) goto L29
            int r6 = r3.read(r4)     // Catch: java.lang.Throwable -> L27
            int r5 = r5 + r6
            goto L1c
        L27:
            r9 = move-exception
            goto L2d
        L29:
            r2.close()
            return r9
        L2d:
            r2.close()
            throw r9
        L31:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "File too big to be loaded in memory"
            r9.<init>(r0)
            throw r9
    }

    private java.io.File tempFile() throws java.io.IOException {
            r4 = this;
            java.lang.String r0 = r4.getDiskFilename()
            if (r0 == 0) goto L18
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 95
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L1c
        L18:
            java.lang.String r0 = r4.getPostfix()
        L1c:
            java.lang.String r1 = r4.getBaseDirectory()
            if (r1 != 0) goto L2b
            java.lang.String r1 = r4.getPrefix()
            java.io.File r0 = java.io.File.createTempFile(r1, r0)
            goto L3c
        L2b:
            java.lang.String r1 = r4.getPrefix()
            java.io.File r2 = new java.io.File
            java.lang.String r3 = r4.getBaseDirectory()
            r2.<init>(r3)
            java.io.File r0 = java.io.File.createTempFile(r1, r0, r2)
        L3c:
            boolean r1 = r4.deleteOnExit()
            if (r1 == 0) goto L45
            r0.deleteOnExit()
        L45:
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public void addContent(io.netty.buffer.ByteBuf r10, boolean r11) throws java.io.IOException {
            r9 = this;
            r0 = 0
            if (r10 == 0) goto L93
            int r1 = r10.readableBytes()     // Catch: java.lang.Throwable -> L42
            long r2 = r9.size     // Catch: java.lang.Throwable -> L42
            long r4 = (long) r1     // Catch: java.lang.Throwable -> L42
            long r2 = r2 + r4
            r9.checkSize(r2)     // Catch: java.lang.Throwable -> L42
            long r2 = r9.definedSize     // Catch: java.lang.Throwable -> L42
            r6 = 0
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 <= 0) goto L44
            long r6 = r9.size     // Catch: java.lang.Throwable -> L42
            long r6 = r6 + r4
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 < 0) goto L1e
            goto L44
        L1e:
            java.io.IOException r11 = new java.io.IOException     // Catch: java.lang.Throwable -> L42
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L42
            r0.<init>()     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = "Out of size: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L42
            long r1 = r9.size     // Catch: java.lang.Throwable -> L42
            long r1 = r1 + r4
            r0.append(r1)     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = " > "
            r0.append(r1)     // Catch: java.lang.Throwable -> L42
            long r1 = r9.definedSize     // Catch: java.lang.Throwable -> L42
            r0.append(r1)     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L42
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L42
            throw r11     // Catch: java.lang.Throwable -> L42
        L42:
            r11 = move-exception
            goto L8f
        L44:
            int r2 = r10.nioBufferCount()     // Catch: java.lang.Throwable -> L42
            r3 = 1
            if (r2 != r3) goto L50
            java.nio.ByteBuffer r2 = r10.nioBuffer()     // Catch: java.lang.Throwable -> L42
            goto L58
        L50:
            io.netty.buffer.ByteBuf r2 = r10.copy()     // Catch: java.lang.Throwable -> L42
            java.nio.ByteBuffer r2 = r2.nioBuffer()     // Catch: java.lang.Throwable -> L42
        L58:
            java.io.File r3 = r9.file     // Catch: java.lang.Throwable -> L42
            if (r3 != 0) goto L62
            java.io.File r3 = r9.tempFile()     // Catch: java.lang.Throwable -> L42
            r9.file = r3     // Catch: java.lang.Throwable -> L42
        L62:
            java.nio.channels.FileChannel r3 = r9.fileChannel     // Catch: java.lang.Throwable -> L42
            if (r3 != 0) goto L73
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L42
            java.io.File r6 = r9.file     // Catch: java.lang.Throwable -> L42
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L42
            java.nio.channels.FileChannel r3 = r3.getChannel()     // Catch: java.lang.Throwable -> L42
            r9.fileChannel = r3     // Catch: java.lang.Throwable -> L42
        L73:
            r3 = 0
        L74:
            if (r3 >= r1) goto L7e
            java.nio.channels.FileChannel r6 = r9.fileChannel     // Catch: java.lang.Throwable -> L42
            int r6 = r6.write(r2)     // Catch: java.lang.Throwable -> L42
            int r3 = r3 + r6
            goto L74
        L7e:
            long r1 = r9.size     // Catch: java.lang.Throwable -> L42
            long r1 = r1 + r4
            r9.size = r1     // Catch: java.lang.Throwable -> L42
            int r1 = r10.readerIndex()     // Catch: java.lang.Throwable -> L42
            int r1 = r1 + r3
            r10.readerIndex(r1)     // Catch: java.lang.Throwable -> L42
            r10.release()
            goto L93
        L8f:
            r10.release()
            throw r11
        L93:
            if (r11 == 0) goto Lc1
            java.io.File r10 = r9.file
            if (r10 != 0) goto L9f
            java.io.File r10 = r9.tempFile()
            r9.file = r10
        L9f:
            java.nio.channels.FileChannel r10 = r9.fileChannel
            if (r10 != 0) goto Lb0
            java.io.FileOutputStream r10 = new java.io.FileOutputStream
            java.io.File r11 = r9.file
            r10.<init>(r11)
            java.nio.channels.FileChannel r10 = r10.getChannel()
            r9.fileChannel = r10
        Lb0:
            java.nio.channels.FileChannel r10 = r9.fileChannel
            r10.force(r0)
            java.nio.channels.FileChannel r10 = r9.fileChannel
            r10.close()
            r10 = 0
            r9.fileChannel = r10
            r9.setCompleted()
            return
        Lc1:
            if (r10 == 0) goto Lc4
            return
        Lc4:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            java.lang.String r11 = "buffer"
            r10.<init>(r11)
            throw r10
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public void delete() {
            r4 = this;
            java.nio.channels.FileChannel r0 = r4.fileChannel
            r1 = 0
            if (r0 == 0) goto L19
            r2 = 0
            r0.force(r2)     // Catch: java.io.IOException -> Lf
            java.nio.channels.FileChannel r0 = r4.fileChannel     // Catch: java.io.IOException -> Lf
            r0.close()     // Catch: java.io.IOException -> Lf
            goto L17
        Lf:
            r0 = move-exception
            io.netty.util.internal.logging.InternalLogger r2 = io.netty.handler.codec.http.multipart.AbstractDiskHttpData.logger
            java.lang.String r3 = "Failed to close a file."
            r2.warn(r3, r0)
        L17:
            r4.fileChannel = r1
        L19:
            boolean r0 = r4.isRenamed
            if (r0 != 0) goto L3a
            java.io.File r0 = r4.file
            if (r0 == 0) goto L38
            boolean r0 = r0.exists()
            if (r0 == 0) goto L38
            java.io.File r0 = r4.file
            boolean r0 = r0.delete()
            if (r0 != 0) goto L38
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.codec.http.multipart.AbstractDiskHttpData.logger
            java.lang.String r2 = "Failed to delete: {}"
            java.io.File r3 = r4.file
            r0.warn(r2, r3)
        L38:
            r4.file = r1
        L3a:
            return
    }

    protected abstract boolean deleteOnExit();

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public byte[] get() throws java.io.IOException {
            r1 = this;
            java.io.File r0 = r1.file
            if (r0 != 0) goto L7
            byte[] r0 = io.netty.util.internal.EmptyArrays.EMPTY_BYTES
            return r0
        L7:
            byte[] r0 = readFrom(r0)
            return r0
    }

    protected abstract java.lang.String getBaseDirectory();

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public io.netty.buffer.ByteBuf getByteBuf() throws java.io.IOException {
            r1 = this;
            java.io.File r0 = r1.file
            if (r0 != 0) goto L7
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            return r0
        L7:
            byte[] r0 = readFrom(r0)
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.wrappedBuffer(r0)
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public io.netty.buffer.ByteBuf getChunk(int r6) throws java.io.IOException {
            r5 = this;
            java.io.File r0 = r5.file
            if (r0 == 0) goto L47
            if (r6 != 0) goto L7
            goto L47
        L7:
            java.nio.channels.FileChannel r0 = r5.fileChannel
            if (r0 != 0) goto L18
            java.io.FileInputStream r0 = new java.io.FileInputStream
            java.io.File r1 = r5.file
            r0.<init>(r1)
            java.nio.channels.FileChannel r0 = r0.getChannel()
            r5.fileChannel = r0
        L18:
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r6)
            r1 = 0
            r2 = 0
        L1e:
            if (r2 >= r6) goto L34
            java.nio.channels.FileChannel r3 = r5.fileChannel
            int r3 = r3.read(r0)
            r4 = -1
            if (r3 != r4) goto L32
            java.nio.channels.FileChannel r6 = r5.fileChannel
            r6.close()
            r6 = 0
            r5.fileChannel = r6
            goto L34
        L32:
            int r2 = r2 + r3
            goto L1e
        L34:
            if (r2 != 0) goto L39
            io.netty.buffer.ByteBuf r6 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            return r6
        L39:
            r0.flip()
            io.netty.buffer.ByteBuf r6 = io.netty.buffer.Unpooled.wrappedBuffer(r0)
            r6.readerIndex(r1)
            r6.writerIndex(r2)
            return r6
        L47:
            io.netty.buffer.ByteBuf r6 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            return r6
    }

    protected abstract java.lang.String getDiskFilename();

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public java.io.File getFile() throws java.io.IOException {
            r1 = this;
            java.io.File r0 = r1.file
            return r0
    }

    protected abstract java.lang.String getPostfix();

    protected abstract java.lang.String getPrefix();

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public java.lang.String getString() throws java.io.IOException {
            r1 = this;
            java.nio.charset.Charset r0 = io.netty.handler.codec.http.HttpConstants.DEFAULT_CHARSET
            java.lang.String r0 = r1.getString(r0)
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public java.lang.String getString(java.nio.charset.Charset r3) throws java.io.IOException {
            r2 = this;
            java.io.File r0 = r2.file
            if (r0 != 0) goto L7
            java.lang.String r3 = ""
            return r3
        L7:
            if (r3 != 0) goto L19
            byte[] r3 = readFrom(r0)
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = io.netty.handler.codec.http.HttpConstants.DEFAULT_CHARSET
            java.lang.String r1 = r1.name()
            r0.<init>(r3, r1)
            return r0
        L19:
            byte[] r0 = readFrom(r0)
            java.lang.String r1 = new java.lang.String
            java.lang.String r3 = r3.name()
            r1.<init>(r0, r3)
            return r1
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public boolean isInMemory() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public boolean renameTo(java.io.File r21) throws java.io.IOException {
            r20 = this;
            r1 = r20
            r2 = r21
            java.lang.String r3 = "Multiple exceptions detected, the following will be suppressed {}"
            if (r2 == 0) goto Le1
            java.io.File r0 = r1.file
            if (r0 == 0) goto Ld9
            boolean r0 = r0.renameTo(r2)
            r4 = 1
            if (r0 != 0) goto Ld4
            r5 = 0
            r6 = 0
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L73
            java.io.File r0 = r1.file     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L73
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L73
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6b
            r9.<init>(r2)     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6b
            java.nio.channels.FileChannel r10 = r8.getChannel()     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L64
            java.nio.channels.FileChannel r15 = r9.getChannel()     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L64
            r11 = 8196(0x2004, double:4.0494E-320)
            r18 = r11
            r11 = r6
            r6 = r18
        L31:
            long r13 = r1.size     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4a
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 >= 0) goto L4e
            long r16 = r13 - r11
            int r0 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r0 >= 0) goto L3f
            long r6 = r13 - r11
        L3f:
            r13 = r6
            long r6 = r10.transferTo(r11, r13, r15)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4a
            long r11 = r11 + r6
            r6 = r13
            goto L31
        L47:
            r0 = move-exception
            r2 = r0
            goto L77
        L4a:
            r0 = move-exception
            r5 = r0
            r6 = r11
            goto L8f
        L4e:
            r8.close()     // Catch: java.io.IOException -> L52
            goto L54
        L52:
            r0 = move-exception
            r5 = r0
        L54:
            r9.close()     // Catch: java.io.IOException -> L59
            goto La8
        L59:
            r0 = move-exception
            if (r5 != 0) goto L5e
            r5 = r0
            goto La8
        L5e:
            io.netty.util.internal.logging.InternalLogger r6 = io.netty.handler.codec.http.multipart.AbstractDiskHttpData.logger
            r6.warn(r3, r0)
            goto La8
        L64:
            r0 = move-exception
        L65:
            r5 = r0
            goto L8f
        L67:
            r0 = move-exception
            r2 = r0
            r9 = r5
            goto L77
        L6b:
            r0 = move-exception
            r9 = r5
            goto L65
        L6e:
            r0 = move-exception
            r2 = r0
            r8 = r5
            r9 = r8
            goto L77
        L73:
            r0 = move-exception
            r8 = r5
            r9 = r8
            goto L65
        L77:
            if (r8 == 0) goto L7f
            r8.close()     // Catch: java.io.IOException -> L7d
            goto L7f
        L7d:
            r0 = move-exception
            r5 = r0
        L7f:
            if (r9 == 0) goto L8e
            r9.close()     // Catch: java.io.IOException -> L85
            goto L8e
        L85:
            r0 = move-exception
            if (r5 != 0) goto L89
            goto L8e
        L89:
            io.netty.util.internal.logging.InternalLogger r4 = io.netty.handler.codec.http.multipart.AbstractDiskHttpData.logger
            r4.warn(r3, r0)
        L8e:
            throw r2
        L8f:
            if (r8 == 0) goto L9b
            r8.close()     // Catch: java.io.IOException -> L95
            goto L9b
        L95:
            r0 = move-exception
            io.netty.util.internal.logging.InternalLogger r8 = io.netty.handler.codec.http.multipart.AbstractDiskHttpData.logger
            r8.warn(r3, r0)
        L9b:
            if (r9 == 0) goto La7
            r9.close()     // Catch: java.io.IOException -> La1
            goto La7
        La1:
            r0 = move-exception
            io.netty.util.internal.logging.InternalLogger r8 = io.netty.handler.codec.http.multipart.AbstractDiskHttpData.logger
            r8.warn(r3, r0)
        La7:
            r11 = r6
        La8:
            if (r5 != 0) goto Ld3
            long r5 = r1.size
            java.lang.String r0 = "Failed to delete: {}"
            int r3 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r3 != 0) goto Lc6
            java.io.File r3 = r1.file
            boolean r3 = r3.delete()
            if (r3 != 0) goto Lc1
            io.netty.util.internal.logging.InternalLogger r3 = io.netty.handler.codec.http.multipart.AbstractDiskHttpData.logger
            java.io.File r5 = r1.file
            r3.warn(r0, r5)
        Lc1:
            r1.file = r2
            r1.isRenamed = r4
            return r4
        Lc6:
            boolean r3 = r2.delete()
            if (r3 != 0) goto Ld1
            io.netty.util.internal.logging.InternalLogger r3 = io.netty.handler.codec.http.multipart.AbstractDiskHttpData.logger
            r3.warn(r0, r2)
        Ld1:
            r0 = 0
            return r0
        Ld3:
            throw r5
        Ld4:
            r1.file = r2
            r1.isRenamed = r4
            return r4
        Ld9:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "No file defined so cannot be renamed"
            r0.<init>(r2)
            throw r0
        Le1:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r2 = "dest"
            r0.<init>(r2)
            throw r0
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public void setContent(io.netty.buffer.ByteBuf r11) throws java.io.IOException {
            r10 = this;
            if (r11 == 0) goto Ld2
            int r0 = r11.readableBytes()     // Catch: java.lang.Throwable -> L3e
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L3e
            r10.size = r0     // Catch: java.lang.Throwable -> L3e
            r10.checkSize(r0)     // Catch: java.lang.Throwable -> L3e
            long r0 = r10.definedSize     // Catch: java.lang.Throwable -> L3e
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L41
            long r4 = r10.size     // Catch: java.lang.Throwable -> L3e
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L1b
            goto L41
        L1b:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L3e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r1.<init>()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = "Out of size: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L3e
            long r2 = r10.size     // Catch: java.lang.Throwable -> L3e
            r1.append(r2)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = " > "
            r1.append(r2)     // Catch: java.lang.Throwable -> L3e
            long r2 = r10.definedSize     // Catch: java.lang.Throwable -> L3e
            r1.append(r2)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L3e
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L3e
            throw r0     // Catch: java.lang.Throwable -> L3e
        L3e:
            r0 = move-exception
            goto Lce
        L41:
            java.io.File r0 = r10.file     // Catch: java.lang.Throwable -> L3e
            if (r0 != 0) goto L4b
            java.io.File r0 = r10.tempFile()     // Catch: java.lang.Throwable -> L3e
            r10.file = r0     // Catch: java.lang.Throwable -> L3e
        L4b:
            int r0 = r11.readableBytes()     // Catch: java.lang.Throwable -> L3e
            if (r0 != 0) goto L95
            java.io.File r0 = r10.file     // Catch: java.lang.Throwable -> L3e
            boolean r0 = r0.createNewFile()     // Catch: java.lang.Throwable -> L3e
            if (r0 != 0) goto L91
            java.io.File r0 = r10.file     // Catch: java.lang.Throwable -> L3e
            long r0 = r0.length()     // Catch: java.lang.Throwable -> L3e
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L67
            r11.release()
            return
        L67:
            java.io.File r0 = r10.file     // Catch: java.lang.Throwable -> L3e
            boolean r0 = r0.delete()     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L78
            java.io.File r0 = r10.file     // Catch: java.lang.Throwable -> L3e
            boolean r0 = r0.createNewFile()     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L78
            goto L91
        L78:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L3e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r1.<init>()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = "file exists already: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L3e
            java.io.File r2 = r10.file     // Catch: java.lang.Throwable -> L3e
            r1.append(r2)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L3e
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L3e
            throw r0     // Catch: java.lang.Throwable -> L3e
        L91:
            r11.release()
            return
        L95:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L3e
            java.io.File r1 = r10.file     // Catch: java.lang.Throwable -> L3e
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L3e
            java.nio.channels.FileChannel r1 = r0.getChannel()     // Catch: java.lang.Throwable -> Lb3
            java.nio.ByteBuffer r2 = r11.nioBuffer()     // Catch: java.lang.Throwable -> Lb3
            r3 = 0
            r4 = 0
        La6:
            long r5 = (long) r4     // Catch: java.lang.Throwable -> Lb3
            long r7 = r10.size     // Catch: java.lang.Throwable -> Lb3
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 >= 0) goto Lb5
            int r5 = r1.write(r2)     // Catch: java.lang.Throwable -> Lb3
            int r4 = r4 + r5
            goto La6
        Lb3:
            r1 = move-exception
            goto Lca
        Lb5:
            int r2 = r11.readerIndex()     // Catch: java.lang.Throwable -> Lb3
            int r2 = r2 + r4
            r11.readerIndex(r2)     // Catch: java.lang.Throwable -> Lb3
            r1.force(r3)     // Catch: java.lang.Throwable -> Lb3
            r0.close()     // Catch: java.lang.Throwable -> L3e
            r10.setCompleted()     // Catch: java.lang.Throwable -> L3e
            r11.release()
            return
        Lca:
            r0.close()     // Catch: java.lang.Throwable -> L3e
            throw r1     // Catch: java.lang.Throwable -> L3e
        Lce:
            r11.release()
            throw r0
        Ld2:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            java.lang.String r0 = "buffer"
            r11.<init>(r0)
            throw r11
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public void setContent(java.io.File r3) throws java.io.IOException {
            r2 = this;
            java.io.File r0 = r2.file
            if (r0 == 0) goto L7
            r2.delete()
        L7:
            r2.file = r3
            long r0 = r3.length()
            r2.size = r0
            r2.checkSize(r0)
            r3 = 1
            r2.isRenamed = r3
            r2.setCompleted()
            return
    }

    @Override // io.netty.handler.codec.http.multipart.HttpData
    public void setContent(java.io.InputStream r10) throws java.io.IOException {
            r9 = this;
            if (r10 == 0) goto L98
            java.io.File r0 = r9.file
            if (r0 == 0) goto L9
            r9.delete()
        L9:
            java.io.File r0 = r9.tempFile()
            r9.file = r0
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            java.io.File r1 = r9.file
            r0.<init>(r1)
            java.nio.channels.FileChannel r1 = r0.getChannel()     // Catch: java.lang.Throwable -> L3f
            r2 = 16384(0x4000, float:2.2959E-41)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L3f
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r2)     // Catch: java.lang.Throwable -> L3f
            int r4 = r10.read(r2)     // Catch: java.lang.Throwable -> L3f
            r5 = 0
            r6 = 0
        L28:
            if (r4 <= 0) goto L41
            java.nio.Buffer r4 = r3.position(r4)     // Catch: java.lang.Throwable -> L3f
            r4.flip()     // Catch: java.lang.Throwable -> L3f
            int r4 = r1.write(r3)     // Catch: java.lang.Throwable -> L3f
            int r6 = r6 + r4
            long r7 = (long) r6     // Catch: java.lang.Throwable -> L3f
            r9.checkSize(r7)     // Catch: java.lang.Throwable -> L3f
            int r4 = r10.read(r2)     // Catch: java.lang.Throwable -> L3f
            goto L28
        L3f:
            r10 = move-exception
            goto L94
        L41:
            r1.force(r5)     // Catch: java.lang.Throwable -> L3f
            r0.close()
            long r0 = (long) r6
            r9.size = r0
            long r2 = r9.definedSize
            r4 = 0
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 <= 0) goto L8d
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 >= 0) goto L8d
            java.io.File r10 = r9.file
            boolean r10 = r10.delete()
            if (r10 != 0) goto L67
            io.netty.util.internal.logging.InternalLogger r10 = io.netty.handler.codec.http.multipart.AbstractDiskHttpData.logger
            java.lang.String r0 = "Failed to delete: {}"
            java.io.File r1 = r9.file
            r10.warn(r0, r1)
        L67:
            r10 = 0
            r9.file = r10
            java.io.IOException r10 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Out of size: "
            r0.append(r1)
            long r1 = r9.size
            r0.append(r1)
            java.lang.String r1 = " > "
            r0.append(r1)
            long r1 = r9.definedSize
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L8d:
            r10 = 1
            r9.isRenamed = r10
            r9.setCompleted()
            return
        L94:
            r0.close()
            throw r10
        L98:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            java.lang.String r0 = "inputStream"
            r10.<init>(r0)
            throw r10
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
            r0 = this;
            return r0
    }

    @Override // io.netty.handler.codec.http.multipart.AbstractHttpData, io.netty.handler.codec.http.multipart.HttpData, io.netty.handler.codec.http.multipart.InterfaceHttpData, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.http.multipart.HttpData mo42touch(java.lang.Object r1) {
            r0 = this;
            return r0
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
