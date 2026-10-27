package io.netty.handler.codec.serialization;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class CompactObjectInputStream extends java.io.ObjectInputStream {
    private final io.netty.handler.codec.serialization.ClassResolver classResolver;

    CompactObjectInputStream(java.io.InputStream r1, io.netty.handler.codec.serialization.ClassResolver r2) throws java.io.IOException {
            r0 = this;
            r0.<init>(r1)
            r0.classResolver = r2
            return
    }

    @Override // java.io.ObjectInputStream
    protected java.io.ObjectStreamClass readClassDescriptor() throws java.io.IOException, java.lang.ClassNotFoundException {
            r4 = this;
            int r0 = r4.read()
            if (r0 < 0) goto L36
            if (r0 == 0) goto L31
            r1 = 1
            if (r0 != r1) goto L1a
            java.lang.String r0 = r4.readUTF()
            io.netty.handler.codec.serialization.ClassResolver r1 = r4.classResolver
            java.lang.Class r0 = r1.resolve(r0)
            java.io.ObjectStreamClass r0 = java.io.ObjectStreamClass.lookupAny(r0)
            return r0
        L1a:
            java.io.StreamCorruptedException r1 = new java.io.StreamCorruptedException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unexpected class descriptor type: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L31:
            java.io.ObjectStreamClass r0 = super.readClassDescriptor()
            return r0
        L36:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
    }

    @Override // java.io.ObjectInputStream
    protected void readStreamHeader() throws java.io.IOException {
            r4 = this;
            byte r0 = r4.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 5
            if (r0 != r1) goto La
            return
        La:
            java.io.StreamCorruptedException r1 = new java.io.StreamCorruptedException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unsupported version: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
    }

    @Override // java.io.ObjectInputStream
    protected java.lang.Class<?> resolveClass(java.io.ObjectStreamClass r3) throws java.io.IOException, java.lang.ClassNotFoundException {
            r2 = this;
            io.netty.handler.codec.serialization.ClassResolver r0 = r2.classResolver     // Catch: java.lang.ClassNotFoundException -> Lb
            java.lang.String r1 = r3.getName()     // Catch: java.lang.ClassNotFoundException -> Lb
            java.lang.Class r3 = r0.resolve(r1)     // Catch: java.lang.ClassNotFoundException -> Lb
            return r3
        Lb:
            java.lang.Class r3 = super.resolveClass(r3)
            return r3
    }
}
