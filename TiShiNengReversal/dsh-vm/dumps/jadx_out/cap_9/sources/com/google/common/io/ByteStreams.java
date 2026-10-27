package com.google.common.io;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class ByteStreams {
    private static final int BUFFER_SIZE = 8192;
    private static final int MAX_ARRAY_LEN = 2147483639;
    private static final java.io.OutputStream NULL_OUTPUT_STREAM = null;
    private static final int TO_BYTE_ARRAY_DEQUE_SIZE = 20;
    private static final int ZERO_COPY_CHUNK_SIZE = 524288;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class ByteArrayDataInputStream implements com.google.common.io.ByteArrayDataInput {
        final java.io.DataInput input;

        ByteArrayDataInputStream(java.io.ByteArrayInputStream r2) {
                r1 = this;
                r1.<init>()
                java.io.DataInputStream r0 = new java.io.DataInputStream
                r0.<init>(r2)
                r1.input = r0
                return
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public boolean readBoolean() {
                r2 = this;
                java.io.DataInput r0 = r2.input     // Catch: java.io.IOException -> L7
                boolean r0 = r0.readBoolean()     // Catch: java.io.IOException -> L7
                return r0
            L7:
                r0 = move-exception
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                r1.<init>(r0)
                throw r1
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public byte readByte() {
                r2 = this;
                java.io.DataInput r0 = r2.input     // Catch: java.io.IOException -> L7 java.io.EOFException -> L9
                byte r0 = r0.readByte()     // Catch: java.io.IOException -> L7 java.io.EOFException -> L9
                return r0
            L7:
                r0 = move-exception
                goto Lb
            L9:
                r0 = move-exception
                goto L11
            Lb:
                java.lang.AssertionError r1 = new java.lang.AssertionError
                r1.<init>(r0)
                throw r1
            L11:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                r1.<init>(r0)
                throw r1
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public char readChar() {
                r2 = this;
                java.io.DataInput r0 = r2.input     // Catch: java.io.IOException -> L7
                char r0 = r0.readChar()     // Catch: java.io.IOException -> L7
                return r0
            L7:
                r0 = move-exception
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                r1.<init>(r0)
                throw r1
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public double readDouble() {
                r2 = this;
                java.io.DataInput r0 = r2.input     // Catch: java.io.IOException -> L7
                double r0 = r0.readDouble()     // Catch: java.io.IOException -> L7
                return r0
            L7:
                r0 = move-exception
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                r1.<init>(r0)
                throw r1
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public float readFloat() {
                r2 = this;
                java.io.DataInput r0 = r2.input     // Catch: java.io.IOException -> L7
                float r0 = r0.readFloat()     // Catch: java.io.IOException -> L7
                return r0
            L7:
                r0 = move-exception
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                r1.<init>(r0)
                throw r1
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public void readFully(byte[] r2) {
                r1 = this;
                java.io.DataInput r0 = r1.input     // Catch: java.io.IOException -> L6
                r0.readFully(r2)     // Catch: java.io.IOException -> L6
                return
            L6:
                r2 = move-exception
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>(r2)
                throw r0
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public void readFully(byte[] r2, int r3, int r4) {
                r1 = this;
                java.io.DataInput r0 = r1.input     // Catch: java.io.IOException -> L6
                r0.readFully(r2, r3, r4)     // Catch: java.io.IOException -> L6
                return
            L6:
                r2 = move-exception
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                r3.<init>(r2)
                throw r3
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public int readInt() {
                r2 = this;
                java.io.DataInput r0 = r2.input     // Catch: java.io.IOException -> L7
                int r0 = r0.readInt()     // Catch: java.io.IOException -> L7
                return r0
            L7:
                r0 = move-exception
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                r1.<init>(r0)
                throw r1
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public java.lang.String readLine() {
                r2 = this;
                java.io.DataInput r0 = r2.input     // Catch: java.io.IOException -> L7
                java.lang.String r0 = r0.readLine()     // Catch: java.io.IOException -> L7
                return r0
            L7:
                r0 = move-exception
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                r1.<init>(r0)
                throw r1
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public long readLong() {
                r2 = this;
                java.io.DataInput r0 = r2.input     // Catch: java.io.IOException -> L7
                long r0 = r0.readLong()     // Catch: java.io.IOException -> L7
                return r0
            L7:
                r0 = move-exception
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                r1.<init>(r0)
                throw r1
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public short readShort() {
                r2 = this;
                java.io.DataInput r0 = r2.input     // Catch: java.io.IOException -> L7
                short r0 = r0.readShort()     // Catch: java.io.IOException -> L7
                return r0
            L7:
                r0 = move-exception
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                r1.<init>(r0)
                throw r1
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public java.lang.String readUTF() {
                r2 = this;
                java.io.DataInput r0 = r2.input     // Catch: java.io.IOException -> L7
                java.lang.String r0 = r0.readUTF()     // Catch: java.io.IOException -> L7
                return r0
            L7:
                r0 = move-exception
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                r1.<init>(r0)
                throw r1
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public int readUnsignedByte() {
                r2 = this;
                java.io.DataInput r0 = r2.input     // Catch: java.io.IOException -> L7
                int r0 = r0.readUnsignedByte()     // Catch: java.io.IOException -> L7
                return r0
            L7:
                r0 = move-exception
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                r1.<init>(r0)
                throw r1
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public int readUnsignedShort() {
                r2 = this;
                java.io.DataInput r0 = r2.input     // Catch: java.io.IOException -> L7
                int r0 = r0.readUnsignedShort()     // Catch: java.io.IOException -> L7
                return r0
            L7:
                r0 = move-exception
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                r1.<init>(r0)
                throw r1
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public int skipBytes(int r2) {
                r1 = this;
                java.io.DataInput r0 = r1.input     // Catch: java.io.IOException -> L7
                int r2 = r0.skipBytes(r2)     // Catch: java.io.IOException -> L7
                return r2
            L7:
                r2 = move-exception
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>(r2)
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class ByteArrayDataOutputStream implements com.google.common.io.ByteArrayDataOutput {
        final java.io.ByteArrayOutputStream byteArrayOutputSteam;
        final java.io.DataOutput output;

        ByteArrayDataOutputStream(java.io.ByteArrayOutputStream r2) {
                r1 = this;
                r1.<init>()
                r1.byteArrayOutputSteam = r2
                java.io.DataOutputStream r0 = new java.io.DataOutputStream
                r0.<init>(r2)
                r1.output = r0
                return
        }

        @Override // com.google.common.io.ByteArrayDataOutput
        public byte[] toByteArray() {
                r1 = this;
                java.io.ByteArrayOutputStream r0 = r1.byteArrayOutputSteam
                byte[] r0 = r0.toByteArray()
                return r0
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void write(int r2) {
                r1 = this;
                java.io.DataOutput r0 = r1.output     // Catch: java.io.IOException -> L6
                r0.write(r2)     // Catch: java.io.IOException -> L6
                return
            L6:
                r2 = move-exception
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>(r2)
                throw r0
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void write(byte[] r2) {
                r1 = this;
                java.io.DataOutput r0 = r1.output     // Catch: java.io.IOException -> L6
                r0.write(r2)     // Catch: java.io.IOException -> L6
                return
            L6:
                r2 = move-exception
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>(r2)
                throw r0
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void write(byte[] r2, int r3, int r4) {
                r1 = this;
                java.io.DataOutput r0 = r1.output     // Catch: java.io.IOException -> L6
                r0.write(r2, r3, r4)     // Catch: java.io.IOException -> L6
                return
            L6:
                r2 = move-exception
                java.lang.AssertionError r3 = new java.lang.AssertionError
                r3.<init>(r2)
                throw r3
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeBoolean(boolean r2) {
                r1 = this;
                java.io.DataOutput r0 = r1.output     // Catch: java.io.IOException -> L6
                r0.writeBoolean(r2)     // Catch: java.io.IOException -> L6
                return
            L6:
                r2 = move-exception
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>(r2)
                throw r0
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeByte(int r2) {
                r1 = this;
                java.io.DataOutput r0 = r1.output     // Catch: java.io.IOException -> L6
                r0.writeByte(r2)     // Catch: java.io.IOException -> L6
                return
            L6:
                r2 = move-exception
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>(r2)
                throw r0
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeBytes(java.lang.String r2) {
                r1 = this;
                java.io.DataOutput r0 = r1.output     // Catch: java.io.IOException -> L6
                r0.writeBytes(r2)     // Catch: java.io.IOException -> L6
                return
            L6:
                r2 = move-exception
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>(r2)
                throw r0
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeChar(int r2) {
                r1 = this;
                java.io.DataOutput r0 = r1.output     // Catch: java.io.IOException -> L6
                r0.writeChar(r2)     // Catch: java.io.IOException -> L6
                return
            L6:
                r2 = move-exception
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>(r2)
                throw r0
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeChars(java.lang.String r2) {
                r1 = this;
                java.io.DataOutput r0 = r1.output     // Catch: java.io.IOException -> L6
                r0.writeChars(r2)     // Catch: java.io.IOException -> L6
                return
            L6:
                r2 = move-exception
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>(r2)
                throw r0
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeDouble(double r2) {
                r1 = this;
                java.io.DataOutput r0 = r1.output     // Catch: java.io.IOException -> L6
                r0.writeDouble(r2)     // Catch: java.io.IOException -> L6
                return
            L6:
                r2 = move-exception
                java.lang.AssertionError r3 = new java.lang.AssertionError
                r3.<init>(r2)
                throw r3
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeFloat(float r2) {
                r1 = this;
                java.io.DataOutput r0 = r1.output     // Catch: java.io.IOException -> L6
                r0.writeFloat(r2)     // Catch: java.io.IOException -> L6
                return
            L6:
                r2 = move-exception
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>(r2)
                throw r0
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeInt(int r2) {
                r1 = this;
                java.io.DataOutput r0 = r1.output     // Catch: java.io.IOException -> L6
                r0.writeInt(r2)     // Catch: java.io.IOException -> L6
                return
            L6:
                r2 = move-exception
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>(r2)
                throw r0
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeLong(long r2) {
                r1 = this;
                java.io.DataOutput r0 = r1.output     // Catch: java.io.IOException -> L6
                r0.writeLong(r2)     // Catch: java.io.IOException -> L6
                return
            L6:
                r2 = move-exception
                java.lang.AssertionError r3 = new java.lang.AssertionError
                r3.<init>(r2)
                throw r3
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeShort(int r2) {
                r1 = this;
                java.io.DataOutput r0 = r1.output     // Catch: java.io.IOException -> L6
                r0.writeShort(r2)     // Catch: java.io.IOException -> L6
                return
            L6:
                r2 = move-exception
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>(r2)
                throw r0
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeUTF(java.lang.String r2) {
                r1 = this;
                java.io.DataOutput r0 = r1.output     // Catch: java.io.IOException -> L6
                r0.writeUTF(r2)     // Catch: java.io.IOException -> L6
                return
            L6:
                r2 = move-exception
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>(r2)
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class LimitedInputStream extends java.io.FilterInputStream {
        private long left;
        private long mark;

        LimitedInputStream(java.io.InputStream r3, long r4) {
                r2 = this;
                r2.<init>(r3)
                r0 = -1
                r2.mark = r0
                com.google.common.base.Preconditions.checkNotNull(r3)
                r0 = 0
                int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r3 < 0) goto L12
                r3 = 1
                goto L13
            L12:
                r3 = 0
            L13:
                java.lang.String r0 = "limit must be non-negative"
                com.google.common.base.Preconditions.checkArgument(r3, r0)
                r2.left = r4
                return
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() throws java.io.IOException {
                r4 = this;
                java.io.InputStream r0 = r4.in
                int r0 = r0.available()
                long r0 = (long) r0
                long r2 = r4.left
                long r0 = java.lang.Math.min(r0, r2)
                int r1 = (int) r0
                return r1
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int r3) {
                r2 = this;
                monitor-enter(r2)
                java.io.InputStream r0 = r2.in     // Catch: java.lang.Throwable -> Lc
                r0.mark(r3)     // Catch: java.lang.Throwable -> Lc
                long r0 = r2.left     // Catch: java.lang.Throwable -> Lc
                r2.mark = r0     // Catch: java.lang.Throwable -> Lc
                monitor-exit(r2)
                return
            Lc:
                r3 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
                throw r3
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws java.io.IOException {
                r6 = this;
                long r0 = r6.left
                r2 = 0
                r4 = -1
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 != 0) goto La
                return r4
            La:
                java.io.InputStream r0 = r6.in
                int r0 = r0.read()
                if (r0 == r4) goto L19
                long r1 = r6.left
                r3 = 1
                long r1 = r1 - r3
                r6.left = r1
            L19:
                return r0
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] r7, int r8, int r9) throws java.io.IOException {
                r6 = this;
                long r0 = r6.left
                r2 = 0
                r4 = -1
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 != 0) goto La
                return r4
            La:
                long r2 = (long) r9
                long r0 = java.lang.Math.min(r2, r0)
                int r9 = (int) r0
                java.io.InputStream r0 = r6.in
                int r7 = r0.read(r7, r8, r9)
                if (r7 == r4) goto L1e
                long r8 = r6.left
                long r0 = (long) r7
                long r8 = r8 - r0
                r6.left = r8
            L1e:
                return r7
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() throws java.io.IOException {
                r5 = this;
                monitor-enter(r5)
                java.io.InputStream r0 = r5.in     // Catch: java.lang.Throwable -> L1c
                boolean r0 = r0.markSupported()     // Catch: java.lang.Throwable -> L1c
                if (r0 == 0) goto L26
                long r0 = r5.mark     // Catch: java.lang.Throwable -> L1c
                r2 = -1
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L1e
                java.io.InputStream r0 = r5.in     // Catch: java.lang.Throwable -> L1c
                r0.reset()     // Catch: java.lang.Throwable -> L1c
                long r0 = r5.mark     // Catch: java.lang.Throwable -> L1c
                r5.left = r0     // Catch: java.lang.Throwable -> L1c
                monitor-exit(r5)
                return
            L1c:
                r0 = move-exception
                goto L2e
            L1e:
                java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L1c
                java.lang.String r1 = "Mark not set"
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L1c
                throw r0     // Catch: java.lang.Throwable -> L1c
            L26:
                java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L1c
                java.lang.String r1 = "Mark not supported"
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L1c
                throw r0     // Catch: java.lang.Throwable -> L1c
            L2e:
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L1c
                throw r0
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long r3) throws java.io.IOException {
                r2 = this;
                long r0 = r2.left
                long r3 = java.lang.Math.min(r3, r0)
                java.io.InputStream r0 = r2.in
                long r3 = r0.skip(r3)
                long r0 = r2.left
                long r0 = r0 - r3
                r2.left = r0
                return r3
        }
    }

    static {
            com.google.common.io.ByteStreams$1 r0 = new com.google.common.io.ByteStreams$1
            r0.<init>()
            com.google.common.io.ByteStreams.NULL_OUTPUT_STREAM = r0
            return
    }

    private ByteStreams() {
            r0 = this;
            r0.<init>()
            return
    }

    private static byte[] combineBuffers(java.util.Deque<byte[]> r6, int r7) {
            byte[] r0 = new byte[r7]
            r1 = r7
        L3:
            if (r1 <= 0) goto L18
            java.lang.Object r2 = r6.removeFirst()
            byte[] r2 = (byte[]) r2
            int r3 = r2.length
            int r3 = java.lang.Math.min(r1, r3)
            int r4 = r7 - r1
            r5 = 0
            java.lang.System.arraycopy(r2, r5, r0, r4, r3)
            int r1 = r1 - r3
            goto L3
        L18:
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static long copy(java.io.InputStream r5, java.io.OutputStream r6) throws java.io.IOException {
            com.google.common.base.Preconditions.checkNotNull(r5)
            com.google.common.base.Preconditions.checkNotNull(r6)
            byte[] r0 = createBuffer()
            r1 = 0
        Lc:
            int r3 = r5.read(r0)
            r4 = -1
            if (r3 != r4) goto L14
            return r1
        L14:
            r4 = 0
            r6.write(r0, r4, r3)
            long r3 = (long) r3
            long r1 = r1 + r3
            goto Lc
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static long copy(java.nio.channels.ReadableByteChannel r11, java.nio.channels.WritableByteChannel r12) throws java.io.IOException {
            com.google.common.base.Preconditions.checkNotNull(r11)
            com.google.common.base.Preconditions.checkNotNull(r12)
            boolean r0 = r11 instanceof java.nio.channels.FileChannel
            r1 = 0
            if (r0 == 0) goto L30
            r3 = r11
            java.nio.channels.FileChannel r3 = (java.nio.channels.FileChannel) r3
            long r9 = r3.position()
            r4 = r9
        L14:
            r6 = 524288(0x80000, double:2.590327E-318)
            r8 = r12
            long r11 = r3.transferTo(r4, r6, r8)
            long r4 = r4 + r11
            r3.position(r4)
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 > 0) goto L2e
            long r11 = r3.size()
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 < 0) goto L2e
            long r4 = r4 - r9
            return r4
        L2e:
            r12 = r8
            goto L14
        L30:
            r8 = r12
            byte[] r12 = createBuffer()
            java.nio.ByteBuffer r12 = java.nio.ByteBuffer.wrap(r12)
        L39:
            int r0 = r11.read(r12)
            r3 = -1
            if (r0 == r3) goto L54
            r12.flip()
        L43:
            boolean r0 = r12.hasRemaining()
            if (r0 == 0) goto L50
            int r0 = r8.write(r12)
            long r3 = (long) r0
            long r1 = r1 + r3
            goto L43
        L50:
            r12.clear()
            goto L39
        L54:
            return r1
    }

    static byte[] createBuffer() {
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r0 = new byte[r0]
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.common.annotations.Beta
    public static long exhaust(java.io.InputStream r8) throws java.io.IOException {
            byte[] r0 = createBuffer()
            r1 = 0
        L6:
            int r3 = r8.read(r0)
            long r3 = (long) r3
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L13
            long r1 = r1 + r3
            goto L6
        L13:
            return r1
    }

    @com.google.common.annotations.Beta
    public static java.io.InputStream limit(java.io.InputStream r1, long r2) {
            com.google.common.io.ByteStreams$LimitedInputStream r0 = new com.google.common.io.ByteStreams$LimitedInputStream
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.common.annotations.Beta
    public static com.google.common.io.ByteArrayDataInput newDataInput(java.io.ByteArrayInputStream r1) {
            com.google.common.io.ByteStreams$ByteArrayDataInputStream r0 = new com.google.common.io.ByteStreams$ByteArrayDataInputStream
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.io.ByteArrayInputStream r1 = (java.io.ByteArrayInputStream) r1
            r0.<init>(r1)
            return r0
    }

    @com.google.common.annotations.Beta
    public static com.google.common.io.ByteArrayDataInput newDataInput(byte[] r1) {
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r1)
            com.google.common.io.ByteArrayDataInput r1 = newDataInput(r0)
            return r1
    }

    @com.google.common.annotations.Beta
    public static com.google.common.io.ByteArrayDataInput newDataInput(byte[] r2, int r3) {
            int r0 = r2.length
            com.google.common.base.Preconditions.checkPositionIndex(r3, r0)
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            int r1 = r2.length
            int r1 = r1 - r3
            r0.<init>(r2, r3, r1)
            com.google.common.io.ByteArrayDataInput r2 = newDataInput(r0)
            return r2
    }

    @com.google.common.annotations.Beta
    public static com.google.common.io.ByteArrayDataOutput newDataOutput() {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            com.google.common.io.ByteArrayDataOutput r0 = newDataOutput(r0)
            return r0
    }

    @com.google.common.annotations.Beta
    public static com.google.common.io.ByteArrayDataOutput newDataOutput(int r3) {
            if (r3 < 0) goto Lc
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>(r3)
            com.google.common.io.ByteArrayDataOutput r3 = newDataOutput(r0)
            return r3
        Lc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            java.lang.String r3 = "Invalid size: %s"
            java.lang.String r3 = java.lang.String.format(r3, r1)
            r0.<init>(r3)
            throw r0
    }

    @com.google.common.annotations.Beta
    public static com.google.common.io.ByteArrayDataOutput newDataOutput(java.io.ByteArrayOutputStream r1) {
            com.google.common.io.ByteStreams$ByteArrayDataOutputStream r0 = new com.google.common.io.ByteStreams$ByteArrayDataOutputStream
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.io.ByteArrayOutputStream r1 = (java.io.ByteArrayOutputStream) r1
            r0.<init>(r1)
            return r0
    }

    @com.google.common.annotations.Beta
    public static java.io.OutputStream nullOutputStream() {
            java.io.OutputStream r0 = com.google.common.io.ByteStreams.NULL_OUTPUT_STREAM
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.common.annotations.Beta
    public static int read(java.io.InputStream r3, byte[] r4, int r5, int r6) throws java.io.IOException {
            com.google.common.base.Preconditions.checkNotNull(r3)
            com.google.common.base.Preconditions.checkNotNull(r4)
            if (r6 < 0) goto L1a
            r0 = 0
        L9:
            if (r0 >= r6) goto L19
            int r1 = r5 + r0
            int r2 = r6 - r0
            int r1 = r3.read(r4, r1, r2)
            r2 = -1
            if (r1 != r2) goto L17
            goto L19
        L17:
            int r0 = r0 + r1
            goto L9
        L19:
            return r0
        L1a:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.String r4 = "len is negative"
            r3.<init>(r4)
            throw r3
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.common.annotations.Beta
    public static <T> T readBytes(java.io.InputStream r3, com.google.common.io.ByteProcessor<T> r4) throws java.io.IOException {
            com.google.common.base.Preconditions.checkNotNull(r3)
            com.google.common.base.Preconditions.checkNotNull(r4)
            byte[] r0 = createBuffer()
        La:
            int r1 = r3.read(r0)
            r2 = -1
            if (r1 == r2) goto L18
            r2 = 0
            boolean r1 = r4.processBytes(r0, r2, r1)
            if (r1 != 0) goto La
        L18:
            java.lang.Object r3 = r4.getResult()
            return r3
    }

    @com.google.common.annotations.Beta
    public static void readFully(java.io.InputStream r2, byte[] r3) throws java.io.IOException {
            r0 = 0
            int r1 = r3.length
            readFully(r2, r3, r0, r1)
            return
    }

    @com.google.common.annotations.Beta
    public static void readFully(java.io.InputStream r1, byte[] r2, int r3, int r4) throws java.io.IOException {
            int r1 = read(r1, r2, r3, r4)
            if (r1 != r4) goto L7
            return
        L7:
            java.io.EOFException r2 = new java.io.EOFException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "reached end of stream after reading "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r1 = " bytes; "
            r3.append(r1)
            r3.append(r4)
            java.lang.String r1 = " bytes expected"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
    }

    @com.google.common.annotations.Beta
    public static void skipFully(java.io.InputStream r4, long r5) throws java.io.IOException {
            long r0 = skipUpTo(r4, r5)
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 < 0) goto L9
            return
        L9:
            java.io.EOFException r4 = new java.io.EOFException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "reached end of stream after skipping "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " bytes; "
            r2.append(r0)
            r2.append(r5)
            java.lang.String r5 = " bytes expected"
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r4.<init>(r5)
            throw r4
    }

    private static long skipSafely(java.io.InputStream r2, long r3) throws java.io.IOException {
            int r0 = r2.available()
            if (r0 != 0) goto L9
            r2 = 0
            return r2
        L9:
            long r0 = (long) r0
            long r3 = java.lang.Math.min(r0, r3)
            long r2 = r2.skip(r3)
            return r2
    }

    static long skipUpTo(java.io.InputStream r10, long r11) throws java.io.IOException {
            byte[] r0 = createBuffer()
            r1 = 0
            r3 = r1
        L7:
            int r5 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r5 >= 0) goto L2b
            long r5 = r11 - r3
            long r7 = skipSafely(r10, r5)
            int r9 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r9 != 0) goto L29
            int r7 = r0.length
            long r7 = (long) r7
            long r5 = java.lang.Math.min(r5, r7)
            int r6 = (int) r5
            r5 = 0
            int r5 = r10.read(r0, r5, r6)
            long r7 = (long) r5
            r5 = -1
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 != 0) goto L29
            goto L2b
        L29:
            long r3 = r3 + r7
            goto L7
        L2b:
            return r3
    }

    public static byte[] toByteArray(java.io.InputStream r2) throws java.io.IOException {
            com.google.common.base.Preconditions.checkNotNull(r2)
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r1 = 20
            r0.<init>(r1)
            r1 = 0
            byte[] r2 = toByteArrayInternal(r2, r0, r1)
            return r2
    }

    static byte[] toByteArray(java.io.InputStream r6, long r7) throws java.io.IOException {
            r0 = 0
            r2 = 0
            r3 = 1
            int r4 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r4 < 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            java.lang.String r1 = "expectedSize (%s) must be non-negative"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r7)
            r0 = 2147483639(0x7ffffff7, double:1.060997891E-314)
            int r4 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r4 > 0) goto L4c
            int r8 = (int) r7
            byte[] r7 = new byte[r8]
            r0 = r8
        L1b:
            r1 = -1
            if (r0 <= 0) goto L2d
            int r4 = r8 - r0
            int r5 = r6.read(r7, r4, r0)
            if (r5 != r1) goto L2b
            byte[] r6 = java.util.Arrays.copyOf(r7, r4)
            return r6
        L2b:
            int r0 = r0 - r5
            goto L1b
        L2d:
            int r0 = r6.read()
            if (r0 != r1) goto L34
            return r7
        L34:
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r4 = 22
            r1.<init>(r4)
            r1.add(r7)
            byte r7 = (byte) r0
            byte[] r0 = new byte[r3]
            r0[r2] = r7
            r1.add(r0)
            int r8 = r8 + r3
            byte[] r6 = toByteArrayInternal(r6, r1, r8)
            return r6
        L4c:
            java.lang.OutOfMemoryError r6 = new java.lang.OutOfMemoryError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            java.lang.String r7 = " bytes is too large to fit in a byte array"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7)
            throw r6
    }

    private static byte[] toByteArrayInternal(java.io.InputStream r6, java.util.Deque<byte[]> r7, int r8) throws java.io.IOException {
            r0 = 8192(0x2000, float:1.148E-41)
        L2:
            r1 = -1
            r2 = 2147483639(0x7ffffff7, float:NaN)
            if (r8 >= r2) goto L2b
            int r2 = r2 - r8
            int r2 = java.lang.Math.min(r0, r2)
            byte[] r3 = new byte[r2]
            r7.add(r3)
            r4 = 0
        L13:
            if (r4 >= r2) goto L25
            int r5 = r2 - r4
            int r5 = r6.read(r3, r4, r5)
            if (r5 != r1) goto L22
            byte[] r6 = combineBuffers(r7, r8)
            return r6
        L22:
            int r4 = r4 + r5
            int r8 = r8 + r5
            goto L13
        L25:
            r1 = 2
            int r0 = com.google.common.math.IntMath.saturatedMultiply(r0, r1)
            goto L2
        L2b:
            int r6 = r6.read()
            if (r6 != r1) goto L36
            byte[] r6 = combineBuffers(r7, r2)
            return r6
        L36:
            java.lang.OutOfMemoryError r6 = new java.lang.OutOfMemoryError
            java.lang.String r7 = "input is too large to fit in a byte array"
            r6.<init>(r7)
            throw r6
    }
}
