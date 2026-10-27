package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class ByteBuf implements io.netty.util.ReferenceCounted, java.lang.Comparable<io.netty.buffer.ByteBuf> {
    public ByteBuf() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract io.netty.buffer.ByteBufAllocator alloc();

    public abstract byte[] array();

    public abstract int arrayOffset();

    public abstract io.netty.buffer.ByteBuf asReadOnly();

    public abstract int bytesBefore(byte r1);

    public abstract int bytesBefore(int r1, byte r2);

    public abstract int bytesBefore(int r1, int r2, byte r3);

    public abstract int capacity();

    public abstract io.netty.buffer.ByteBuf capacity(int r1);

    public abstract io.netty.buffer.ByteBuf clear();

    public abstract int compareTo(io.netty.buffer.ByteBuf r1);

    public /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = (io.netty.buffer.ByteBuf) r1
            int r1 = r0.compareTo(r1)
            return r1
    }

    public abstract io.netty.buffer.ByteBuf copy();

    public abstract io.netty.buffer.ByteBuf copy(int r1, int r2);

    public abstract io.netty.buffer.ByteBuf discardReadBytes();

    public abstract io.netty.buffer.ByteBuf discardSomeReadBytes();

    public abstract io.netty.buffer.ByteBuf duplicate();

    public abstract int ensureWritable(int r1, boolean r2);

    public abstract io.netty.buffer.ByteBuf ensureWritable(int r1);

    public abstract boolean equals(java.lang.Object r1);

    public abstract int forEachByte(int r1, int r2, io.netty.util.ByteProcessor r3);

    public abstract int forEachByte(io.netty.util.ByteProcessor r1);

    public abstract int forEachByteDesc(int r1, int r2, io.netty.util.ByteProcessor r3);

    public abstract int forEachByteDesc(io.netty.util.ByteProcessor r1);

    public abstract boolean getBoolean(int r1);

    public abstract byte getByte(int r1);

    public abstract int getBytes(int r1, java.nio.channels.FileChannel r2, long r3, int r5) throws java.io.IOException;

    public abstract int getBytes(int r1, java.nio.channels.GatheringByteChannel r2, int r3) throws java.io.IOException;

    public abstract io.netty.buffer.ByteBuf getBytes(int r1, io.netty.buffer.ByteBuf r2);

    public abstract io.netty.buffer.ByteBuf getBytes(int r1, io.netty.buffer.ByteBuf r2, int r3);

    public abstract io.netty.buffer.ByteBuf getBytes(int r1, io.netty.buffer.ByteBuf r2, int r3, int r4);

    public abstract io.netty.buffer.ByteBuf getBytes(int r1, java.io.OutputStream r2, int r3) throws java.io.IOException;

    public abstract io.netty.buffer.ByteBuf getBytes(int r1, java.nio.ByteBuffer r2);

    public abstract io.netty.buffer.ByteBuf getBytes(int r1, byte[] r2);

    public abstract io.netty.buffer.ByteBuf getBytes(int r1, byte[] r2, int r3, int r4);

    public abstract char getChar(int r1);

    public abstract java.lang.CharSequence getCharSequence(int r1, int r2, java.nio.charset.Charset r3);

    public abstract double getDouble(int r1);

    public double getDoubleLE(int r3) {
            r2 = this;
            long r0 = r2.getLongLE(r3)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            return r0
    }

    public abstract float getFloat(int r1);

    public float getFloatLE(int r1) {
            r0 = this;
            int r1 = r0.getIntLE(r1)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            return r1
    }

    public abstract int getInt(int r1);

    public abstract int getIntLE(int r1);

    public abstract long getLong(int r1);

    public abstract long getLongLE(int r1);

    public abstract int getMedium(int r1);

    public abstract int getMediumLE(int r1);

    public abstract short getShort(int r1);

    public abstract short getShortLE(int r1);

    public abstract short getUnsignedByte(int r1);

    public abstract long getUnsignedInt(int r1);

    public abstract long getUnsignedIntLE(int r1);

    public abstract int getUnsignedMedium(int r1);

    public abstract int getUnsignedMediumLE(int r1);

    public abstract int getUnsignedShort(int r1);

    public abstract int getUnsignedShortLE(int r1);

    public abstract boolean hasArray();

    public abstract boolean hasMemoryAddress();

    public abstract int hashCode();

    public abstract int indexOf(int r1, int r2, byte r3);

    public abstract java.nio.ByteBuffer internalNioBuffer(int r1, int r2);

    boolean isAccessible() {
            r1 = this;
            int r0 = r1.refCnt()
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public abstract boolean isDirect();

    public abstract boolean isReadOnly();

    public abstract boolean isReadable();

    public abstract boolean isReadable(int r1);

    public abstract boolean isWritable();

    public abstract boolean isWritable(int r1);

    public abstract io.netty.buffer.ByteBuf markReaderIndex();

    public abstract io.netty.buffer.ByteBuf markWriterIndex();

    public abstract int maxCapacity();

    public int maxFastWritableBytes() {
            r1 = this;
            int r0 = r1.writableBytes()
            return r0
    }

    public abstract int maxWritableBytes();

    public abstract long memoryAddress();

    public abstract java.nio.ByteBuffer nioBuffer();

    public abstract java.nio.ByteBuffer nioBuffer(int r1, int r2);

    public abstract int nioBufferCount();

    public abstract java.nio.ByteBuffer[] nioBuffers();

    public abstract java.nio.ByteBuffer[] nioBuffers(int r1, int r2);

    @java.lang.Deprecated
    public abstract io.netty.buffer.ByteBuf order(java.nio.ByteOrder r1);

    @java.lang.Deprecated
    public abstract java.nio.ByteOrder order();

    public abstract boolean readBoolean();

    public abstract byte readByte();

    public abstract int readBytes(java.nio.channels.FileChannel r1, long r2, int r4) throws java.io.IOException;

    public abstract int readBytes(java.nio.channels.GatheringByteChannel r1, int r2) throws java.io.IOException;

    public abstract io.netty.buffer.ByteBuf readBytes(int r1);

    public abstract io.netty.buffer.ByteBuf readBytes(io.netty.buffer.ByteBuf r1);

    public abstract io.netty.buffer.ByteBuf readBytes(io.netty.buffer.ByteBuf r1, int r2);

    public abstract io.netty.buffer.ByteBuf readBytes(io.netty.buffer.ByteBuf r1, int r2, int r3);

    public abstract io.netty.buffer.ByteBuf readBytes(java.io.OutputStream r1, int r2) throws java.io.IOException;

    public abstract io.netty.buffer.ByteBuf readBytes(java.nio.ByteBuffer r1);

    public abstract io.netty.buffer.ByteBuf readBytes(byte[] r1);

    public abstract io.netty.buffer.ByteBuf readBytes(byte[] r1, int r2, int r3);

    public abstract char readChar();

    public abstract java.lang.CharSequence readCharSequence(int r1, java.nio.charset.Charset r2);

    public abstract double readDouble();

    public double readDoubleLE() {
            r2 = this;
            long r0 = r2.readLongLE()
            double r0 = java.lang.Double.longBitsToDouble(r0)
            return r0
    }

    public abstract float readFloat();

    public float readFloatLE() {
            r1 = this;
            int r0 = r1.readIntLE()
            float r0 = java.lang.Float.intBitsToFloat(r0)
            return r0
    }

    public abstract int readInt();

    public abstract int readIntLE();

    public abstract long readLong();

    public abstract long readLongLE();

    public abstract int readMedium();

    public abstract int readMediumLE();

    public abstract io.netty.buffer.ByteBuf readRetainedSlice(int r1);

    public abstract short readShort();

    public abstract short readShortLE();

    public abstract io.netty.buffer.ByteBuf readSlice(int r1);

    public abstract short readUnsignedByte();

    public abstract long readUnsignedInt();

    public abstract long readUnsignedIntLE();

    public abstract int readUnsignedMedium();

    public abstract int readUnsignedMediumLE();

    public abstract int readUnsignedShort();

    public abstract int readUnsignedShortLE();

    public abstract int readableBytes();

    public abstract int readerIndex();

    public abstract io.netty.buffer.ByteBuf readerIndex(int r1);

    public abstract io.netty.buffer.ByteBuf resetReaderIndex();

    public abstract io.netty.buffer.ByteBuf resetWriterIndex();

    public abstract io.netty.buffer.ByteBuf retain();

    public abstract io.netty.buffer.ByteBuf retain(int r1);

    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo1retain() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.retain()
            return r0
    }

    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo2retain(int r1) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r0.retain(r1)
            return r1
    }

    public abstract io.netty.buffer.ByteBuf retainedDuplicate();

    public abstract io.netty.buffer.ByteBuf retainedSlice();

    public abstract io.netty.buffer.ByteBuf retainedSlice(int r1, int r2);

    public abstract io.netty.buffer.ByteBuf setBoolean(int r1, boolean r2);

    public abstract io.netty.buffer.ByteBuf setByte(int r1, int r2);

    public abstract int setBytes(int r1, java.io.InputStream r2, int r3) throws java.io.IOException;

    public abstract int setBytes(int r1, java.nio.channels.FileChannel r2, long r3, int r5) throws java.io.IOException;

    public abstract int setBytes(int r1, java.nio.channels.ScatteringByteChannel r2, int r3) throws java.io.IOException;

    public abstract io.netty.buffer.ByteBuf setBytes(int r1, io.netty.buffer.ByteBuf r2);

    public abstract io.netty.buffer.ByteBuf setBytes(int r1, io.netty.buffer.ByteBuf r2, int r3);

    public abstract io.netty.buffer.ByteBuf setBytes(int r1, io.netty.buffer.ByteBuf r2, int r3, int r4);

    public abstract io.netty.buffer.ByteBuf setBytes(int r1, java.nio.ByteBuffer r2);

    public abstract io.netty.buffer.ByteBuf setBytes(int r1, byte[] r2);

    public abstract io.netty.buffer.ByteBuf setBytes(int r1, byte[] r2, int r3, int r4);

    public abstract io.netty.buffer.ByteBuf setChar(int r1, int r2);

    public abstract int setCharSequence(int r1, java.lang.CharSequence r2, java.nio.charset.Charset r3);

    public abstract io.netty.buffer.ByteBuf setDouble(int r1, double r2);

    public io.netty.buffer.ByteBuf setDoubleLE(int r1, double r2) {
            r0 = this;
            long r2 = java.lang.Double.doubleToRawLongBits(r2)
            io.netty.buffer.ByteBuf r1 = r0.setLongLE(r1, r2)
            return r1
    }

    public abstract io.netty.buffer.ByteBuf setFloat(int r1, float r2);

    public io.netty.buffer.ByteBuf setFloatLE(int r1, float r2) {
            r0 = this;
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            io.netty.buffer.ByteBuf r1 = r0.setIntLE(r1, r2)
            return r1
    }

    public abstract io.netty.buffer.ByteBuf setIndex(int r1, int r2);

    public abstract io.netty.buffer.ByteBuf setInt(int r1, int r2);

    public abstract io.netty.buffer.ByteBuf setIntLE(int r1, int r2);

    public abstract io.netty.buffer.ByteBuf setLong(int r1, long r2);

    public abstract io.netty.buffer.ByteBuf setLongLE(int r1, long r2);

    public abstract io.netty.buffer.ByteBuf setMedium(int r1, int r2);

    public abstract io.netty.buffer.ByteBuf setMediumLE(int r1, int r2);

    public abstract io.netty.buffer.ByteBuf setShort(int r1, int r2);

    public abstract io.netty.buffer.ByteBuf setShortLE(int r1, int r2);

    public abstract io.netty.buffer.ByteBuf setZero(int r1, int r2);

    public abstract io.netty.buffer.ByteBuf skipBytes(int r1);

    public abstract io.netty.buffer.ByteBuf slice();

    public abstract io.netty.buffer.ByteBuf slice(int r1, int r2);

    public abstract java.lang.String toString();

    public abstract java.lang.String toString(int r1, int r2, java.nio.charset.Charset r3);

    public abstract java.lang.String toString(java.nio.charset.Charset r1);

    public abstract io.netty.buffer.ByteBuf touch();

    public abstract io.netty.buffer.ByteBuf touch(java.lang.Object r1);

    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo3touch() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.touch()
            return r0
    }

    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo4touch(java.lang.Object r1) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r0.touch(r1)
            return r1
    }

    public abstract io.netty.buffer.ByteBuf unwrap();

    public abstract int writableBytes();

    public abstract io.netty.buffer.ByteBuf writeBoolean(boolean r1);

    public abstract io.netty.buffer.ByteBuf writeByte(int r1);

    public abstract int writeBytes(java.io.InputStream r1, int r2) throws java.io.IOException;

    public abstract int writeBytes(java.nio.channels.FileChannel r1, long r2, int r4) throws java.io.IOException;

    public abstract int writeBytes(java.nio.channels.ScatteringByteChannel r1, int r2) throws java.io.IOException;

    public abstract io.netty.buffer.ByteBuf writeBytes(io.netty.buffer.ByteBuf r1);

    public abstract io.netty.buffer.ByteBuf writeBytes(io.netty.buffer.ByteBuf r1, int r2);

    public abstract io.netty.buffer.ByteBuf writeBytes(io.netty.buffer.ByteBuf r1, int r2, int r3);

    public abstract io.netty.buffer.ByteBuf writeBytes(java.nio.ByteBuffer r1);

    public abstract io.netty.buffer.ByteBuf writeBytes(byte[] r1);

    public abstract io.netty.buffer.ByteBuf writeBytes(byte[] r1, int r2, int r3);

    public abstract io.netty.buffer.ByteBuf writeChar(int r1);

    public abstract int writeCharSequence(java.lang.CharSequence r1, java.nio.charset.Charset r2);

    public abstract io.netty.buffer.ByteBuf writeDouble(double r1);

    public io.netty.buffer.ByteBuf writeDoubleLE(double r1) {
            r0 = this;
            long r1 = java.lang.Double.doubleToRawLongBits(r1)
            io.netty.buffer.ByteBuf r1 = r0.writeLongLE(r1)
            return r1
    }

    public abstract io.netty.buffer.ByteBuf writeFloat(float r1);

    public io.netty.buffer.ByteBuf writeFloatLE(float r1) {
            r0 = this;
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            io.netty.buffer.ByteBuf r1 = r0.writeIntLE(r1)
            return r1
    }

    public abstract io.netty.buffer.ByteBuf writeInt(int r1);

    public abstract io.netty.buffer.ByteBuf writeIntLE(int r1);

    public abstract io.netty.buffer.ByteBuf writeLong(long r1);

    public abstract io.netty.buffer.ByteBuf writeLongLE(long r1);

    public abstract io.netty.buffer.ByteBuf writeMedium(int r1);

    public abstract io.netty.buffer.ByteBuf writeMediumLE(int r1);

    public abstract io.netty.buffer.ByteBuf writeShort(int r1);

    public abstract io.netty.buffer.ByteBuf writeShortLE(int r1);

    public abstract io.netty.buffer.ByteBuf writeZero(int r1);

    public abstract int writerIndex();

    public abstract io.netty.buffer.ByteBuf writerIndex(int r1);
}
