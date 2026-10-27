package io.netty.handler.codec.serialization;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class CompactObjectOutputStream extends java.io.ObjectOutputStream {
    static final int TYPE_FAT_DESCRIPTOR = 0;
    static final int TYPE_THIN_DESCRIPTOR = 1;

    CompactObjectOutputStream(java.io.OutputStream r1) throws java.io.IOException {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // java.io.ObjectOutputStream
    protected void writeClassDescriptor(java.io.ObjectStreamClass r6) throws java.io.IOException {
            r5 = this;
            java.lang.Class r0 = r6.forClass()
            boolean r1 = r0.isPrimitive()
            if (r1 != 0) goto L2d
            boolean r1 = r0.isArray()
            if (r1 != 0) goto L2d
            boolean r0 = r0.isInterface()
            if (r0 != 0) goto L2d
            long r0 = r6.getSerialVersionUID()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L21
            goto L2d
        L21:
            r0 = 1
            r5.write(r0)
            java.lang.String r6 = r6.getName()
            r5.writeUTF(r6)
            return
        L2d:
            r0 = 0
            r5.write(r0)
            super.writeClassDescriptor(r6)
            return
    }

    @Override // java.io.ObjectOutputStream
    protected void writeStreamHeader() throws java.io.IOException {
            r1 = this;
            r0 = 5
            r1.writeByte(r0)
            return
    }
}
