package androidx.camera.core.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ByteBufferOutputStream extends java.io.OutputStream {
    private final java.nio.ByteBuffer mByteBuffer;

    public ByteBufferOutputStream(@androidx.annotation.NonNull java.nio.ByteBuffer r1) {
            r0 = this;
            r0.<init>()
            r0.mByteBuffer = r1
            return
    }

    @Override // java.io.OutputStream
    public void write(int r2) throws java.io.IOException {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.mByteBuffer
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto Lf
            java.nio.ByteBuffer r0 = r1.mByteBuffer
            byte r2 = (byte) r2
            r0.put(r2)
            return
        Lf:
            java.io.EOFException r2 = new java.io.EOFException
            java.lang.String r0 = "Output ByteBuffer has no bytes remaining."
            r2.<init>(r0)
            throw r2
    }

    @Override // java.io.OutputStream
    public void write(byte[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            r3.getClass()
            if (r4 < 0) goto L2a
            int r0 = r3.length
            if (r4 > r0) goto L2a
            if (r5 < 0) goto L2a
            int r0 = r4 + r5
            int r1 = r3.length
            if (r0 > r1) goto L2a
            if (r0 < 0) goto L2a
            if (r5 != 0) goto L14
            return
        L14:
            java.nio.ByteBuffer r0 = r2.mByteBuffer
            int r0 = r0.remaining()
            if (r0 < r5) goto L22
            java.nio.ByteBuffer r0 = r2.mByteBuffer
            r0.put(r3, r4, r5)
            return
        L22:
            java.io.EOFException r3 = new java.io.EOFException
            java.lang.String r4 = "Output ByteBuffer has insufficient bytes remaining."
            r3.<init>(r4)
            throw r3
        L2a:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            r3.<init>()
            throw r3
    }
}
