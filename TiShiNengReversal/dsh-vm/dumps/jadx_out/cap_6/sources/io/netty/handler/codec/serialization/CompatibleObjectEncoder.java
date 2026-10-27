package io.netty.handler.codec.serialization;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class CompatibleObjectEncoder extends io.netty.handler.codec.MessageToByteEncoder<java.io.Serializable> {
    private final int resetInterval;
    private int writtenObjects;

    public CompatibleObjectEncoder() {
            r1 = this;
            r0 = 16
            r1.<init>(r0)
            return
    }

    public CompatibleObjectEncoder(int r4) {
            r3 = this;
            r3.<init>()
            if (r4 < 0) goto L8
            r3.resetInterval = r4
            return
        L8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "resetInterval: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    /* renamed from: encode, reason: avoid collision after fix types in other method */
    protected void encode2(io.netty.channel.ChannelHandlerContext r2, java.io.Serializable r3, io.netty.buffer.ByteBuf r4) throws java.lang.Exception {
            r1 = this;
            io.netty.buffer.ByteBufOutputStream r2 = new io.netty.buffer.ByteBufOutputStream
            r2.<init>(r4)
            java.io.ObjectOutputStream r2 = r1.newObjectOutputStream(r2)
            int r4 = r1.resetInterval     // Catch: java.lang.Throwable -> L1a
            if (r4 == 0) goto L1c
            int r0 = r1.writtenObjects     // Catch: java.lang.Throwable -> L1a
            int r0 = r0 + 1
            r1.writtenObjects = r0     // Catch: java.lang.Throwable -> L1a
            int r0 = r0 % r4
            if (r0 != 0) goto L1c
            r2.reset()     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r3 = move-exception
            goto L26
        L1c:
            r2.writeObject(r3)     // Catch: java.lang.Throwable -> L1a
            r2.flush()     // Catch: java.lang.Throwable -> L1a
            r2.close()
            return
        L26:
            r2.close()
            throw r3
    }

    @Override // io.netty.handler.codec.MessageToByteEncoder
    protected /* bridge */ /* synthetic */ void encode(io.netty.channel.ChannelHandlerContext r1, java.io.Serializable r2, io.netty.buffer.ByteBuf r3) throws java.lang.Exception {
            r0 = this;
            java.io.Serializable r2 = (java.io.Serializable) r2
            r0.encode2(r1, r2, r3)
            return
    }

    protected java.io.ObjectOutputStream newObjectOutputStream(java.io.OutputStream r2) throws java.lang.Exception {
            r1 = this;
            java.io.ObjectOutputStream r0 = new java.io.ObjectOutputStream
            r0.<init>(r2)
            return r0
    }
}
