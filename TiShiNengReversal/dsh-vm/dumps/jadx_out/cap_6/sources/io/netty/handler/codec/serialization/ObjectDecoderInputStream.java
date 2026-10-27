package io.netty.handler.codec.serialization;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ObjectDecoderInputStream extends java.io.InputStream implements java.io.ObjectInput {
    private final io.netty.handler.codec.serialization.ClassResolver classResolver;
    private final java.io.DataInputStream in;
    private final int maxObjectSize;

    public ObjectDecoderInputStream(java.io.InputStream r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ObjectDecoderInputStream(java.io.InputStream r2, int r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r3)
            return
    }

    public ObjectDecoderInputStream(java.io.InputStream r2, java.lang.ClassLoader r3) {
            r1 = this;
            r0 = 1048576(0x100000, float:1.469368E-39)
            r1.<init>(r2, r3, r0)
            return
    }

    public ObjectDecoderInputStream(java.io.InputStream r2, java.lang.ClassLoader r3, int r4) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L37
            if (r4 <= 0) goto L20
            boolean r0 = r2 instanceof java.io.DataInputStream
            if (r0 == 0) goto L10
            java.io.DataInputStream r2 = (java.io.DataInputStream) r2
            r1.in = r2
            goto L17
        L10:
            java.io.DataInputStream r0 = new java.io.DataInputStream
            r0.<init>(r2)
            r1.in = r0
        L17:
            io.netty.handler.codec.serialization.ClassResolver r2 = io.netty.handler.codec.serialization.ClassResolvers.weakCachingResolver(r3)
            r1.classResolver = r2
            r1.maxObjectSize = r4
            return
        L20:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "maxObjectSize: "
            r3.append(r0)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L37:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "in"
            r2.<init>(r3)
            throw r2
    }

    @Override // java.io.InputStream, java.io.ObjectInput
    public int available() throws java.io.IOException {
            r1 = this;
            java.io.DataInputStream r0 = r1.in
            int r0 = r0.available()
            return r0
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable, java.io.ObjectInput
    public void close() throws java.io.IOException {
            r1 = this;
            java.io.DataInputStream r0 = r1.in
            r0.close()
            return
    }

    @Override // java.io.InputStream
    public void mark(int r2) {
            r1 = this;
            java.io.DataInputStream r0 = r1.in
            r0.mark(r2)
            return
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
            r1 = this;
            java.io.DataInputStream r0 = r1.in
            boolean r0 = r0.markSupported()
            return r0
    }

    @Override // java.io.InputStream, java.io.ObjectInput
    public int read() throws java.io.IOException {
            r1 = this;
            java.io.DataInputStream r0 = r1.in
            int r0 = r0.read()
            return r0
    }

    @Override // java.io.InputStream, java.io.ObjectInput
    public final int read(byte[] r2) throws java.io.IOException {
            r1 = this;
            java.io.DataInputStream r0 = r1.in
            int r2 = r0.read(r2)
            return r2
    }

    @Override // java.io.InputStream, java.io.ObjectInput
    public final int read(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            java.io.DataInputStream r0 = r1.in
            int r2 = r0.read(r2, r3, r4)
            return r2
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() throws java.io.IOException {
            r1 = this;
            java.io.DataInputStream r0 = r1.in
            boolean r0 = r0.readBoolean()
            return r0
    }

    @Override // java.io.DataInput
    public final byte readByte() throws java.io.IOException {
            r1 = this;
            java.io.DataInputStream r0 = r1.in
            byte r0 = r0.readByte()
            return r0
    }

    @Override // java.io.DataInput
    public final char readChar() throws java.io.IOException {
            r1 = this;
            java.io.DataInputStream r0 = r1.in
            char r0 = r0.readChar()
            return r0
    }

    @Override // java.io.DataInput
    public final double readDouble() throws java.io.IOException {
            r2 = this;
            java.io.DataInputStream r0 = r2.in
            double r0 = r0.readDouble()
            return r0
    }

    @Override // java.io.DataInput
    public final float readFloat() throws java.io.IOException {
            r1 = this;
            java.io.DataInputStream r0 = r1.in
            float r0 = r0.readFloat()
            return r0
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] r2) throws java.io.IOException {
            r1 = this;
            java.io.DataInputStream r0 = r1.in
            r0.readFully(r2)
            return
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            java.io.DataInputStream r0 = r1.in
            r0.readFully(r2, r3, r4)
            return
    }

    @Override // java.io.DataInput
    public final int readInt() throws java.io.IOException {
            r1 = this;
            java.io.DataInputStream r0 = r1.in
            int r0 = r0.readInt()
            return r0
    }

    @Override // java.io.DataInput
    @java.lang.Deprecated
    public final java.lang.String readLine() throws java.io.IOException {
            r1 = this;
            java.io.DataInputStream r0 = r1.in
            java.lang.String r0 = r0.readLine()
            return r0
    }

    @Override // java.io.DataInput
    public final long readLong() throws java.io.IOException {
            r2 = this;
            java.io.DataInputStream r0 = r2.in
            long r0 = r0.readLong()
            return r0
    }

    @Override // java.io.ObjectInput
    public java.lang.Object readObject() throws java.lang.ClassNotFoundException, java.io.IOException {
            r4 = this;
            int r0 = r4.readInt()
            if (r0 <= 0) goto L3e
            int r1 = r4.maxObjectSize
            if (r0 > r1) goto L18
            io.netty.handler.codec.serialization.CompactObjectInputStream r0 = new io.netty.handler.codec.serialization.CompactObjectInputStream
            java.io.DataInputStream r1 = r4.in
            io.netty.handler.codec.serialization.ClassResolver r2 = r4.classResolver
            r0.<init>(r1, r2)
            java.lang.Object r0 = r0.readObject()
            return r0
        L18:
            java.io.StreamCorruptedException r1 = new java.io.StreamCorruptedException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "data length too big: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " (max: "
            r2.append(r0)
            int r0 = r4.maxObjectSize
            r2.append(r0)
            r0 = 41
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L3e:
            java.io.StreamCorruptedException r1 = new java.io.StreamCorruptedException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "invalid data length: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
    }

    @Override // java.io.DataInput
    public final short readShort() throws java.io.IOException {
            r1 = this;
            java.io.DataInputStream r0 = r1.in
            short r0 = r0.readShort()
            return r0
    }

    @Override // java.io.DataInput
    public final java.lang.String readUTF() throws java.io.IOException {
            r1 = this;
            java.io.DataInputStream r0 = r1.in
            java.lang.String r0 = r0.readUTF()
            return r0
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() throws java.io.IOException {
            r1 = this;
            java.io.DataInputStream r0 = r1.in
            int r0 = r0.readUnsignedByte()
            return r0
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws java.io.IOException {
            r1 = this;
            java.io.DataInputStream r0 = r1.in
            int r0 = r0.readUnsignedShort()
            return r0
    }

    @Override // java.io.InputStream
    public void reset() throws java.io.IOException {
            r1 = this;
            java.io.DataInputStream r0 = r1.in
            r0.reset()
            return
    }

    @Override // java.io.InputStream, java.io.ObjectInput
    public long skip(long r2) throws java.io.IOException {
            r1 = this;
            java.io.DataInputStream r0 = r1.in
            long r2 = r0.skip(r2)
            return r2
    }

    @Override // java.io.DataInput
    public final int skipBytes(int r2) throws java.io.IOException {
            r1 = this;
            java.io.DataInputStream r0 = r1.in
            int r2 = r0.skipBytes(r2)
            return r2
    }
}
