package io.netty.handler.codec.memcache.binary;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class AbstractBinaryMemcacheMessage extends io.netty.handler.codec.memcache.AbstractMemcacheObject implements io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage {
    private long cas;
    private byte dataType;
    private io.netty.buffer.ByteBuf extras;
    private byte extrasLength;
    private io.netty.buffer.ByteBuf key;
    private short keyLength;
    private byte magic;
    private int opaque;
    private byte opcode;
    private int totalBodyLength;

    protected AbstractBinaryMemcacheMessage(io.netty.buffer.ByteBuf r2, io.netty.buffer.ByteBuf r3) {
            r1 = this;
            r1.<init>()
            r1.key = r2
            r0 = 0
            if (r2 != 0) goto La
            r2 = 0
            goto Lf
        La:
            int r2 = r2.readableBytes()
            short r2 = (short) r2
        Lf:
            r1.keyLength = r2
            r1.extras = r3
            if (r3 != 0) goto L16
            goto L1b
        L16:
            int r2 = r3.readableBytes()
            byte r0 = (byte) r2
        L1b:
            r1.extrasLength = r0
            short r2 = r1.keyLength
            int r2 = r2 + r0
            r1.totalBodyLength = r2
            return
    }

    @Override // io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage
    public long cas() {
            r2 = this;
            long r0 = r2.cas
            return r0
    }

    void copyMeta(io.netty.handler.codec.memcache.binary.AbstractBinaryMemcacheMessage r3) {
            r2 = this;
            byte r0 = r2.magic
            r3.magic = r0
            byte r0 = r2.opcode
            r3.opcode = r0
            short r0 = r2.keyLength
            r3.keyLength = r0
            byte r0 = r2.extrasLength
            r3.extrasLength = r0
            byte r0 = r2.dataType
            r3.dataType = r0
            int r0 = r2.totalBodyLength
            r3.totalBodyLength = r0
            int r0 = r2.opaque
            r3.opaque = r0
            long r0 = r2.cas
            r3.cas = r0
            return
    }

    @Override // io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage
    public byte dataType() {
            r1 = this;
            byte r0 = r1.dataType
            return r0
    }

    protected void deallocate() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.key
            if (r0 == 0) goto L7
            r0.release()
        L7:
            io.netty.buffer.ByteBuf r0 = r1.extras
            if (r0 == 0) goto Le
            r0.release()
        Le:
            return
    }

    @Override // io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage
    public io.netty.buffer.ByteBuf extras() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.extras
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage
    public byte extrasLength() {
            r1 = this;
            byte r0 = r1.extrasLength
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage
    public io.netty.buffer.ByteBuf key() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.key
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage
    public short keyLength() {
            r1 = this;
            short r0 = r1.keyLength
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage
    public byte magic() {
            r1 = this;
            byte r0 = r1.magic
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage
    public int opaque() {
            r1 = this;
            int r0 = r1.opaque
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage
    public byte opcode() {
            r1 = this;
            byte r0 = r1.opcode
            return r0
    }

    @Override // io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.MemcacheMessage mo39retain() {
            r1 = this;
            io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.MemcacheMessage mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage, io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage mo39retain() {
            r0 = this;
            super.retain()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage, io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage mo40retain(int r1) {
            r0 = this;
            super.retain(r1)
            return r0
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain() {
            r1 = this;
            io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage r0 = r1.mo39retain()
            return r0
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted retain(int r1) {
            r0 = this;
            io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage
    public io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage setCas(long r1) {
            r0 = this;
            r0.cas = r1
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage
    public io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage setDataType(byte r1) {
            r0 = this;
            r0.dataType = r1
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage
    public io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage setExtras(io.netty.buffer.ByteBuf r3) {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.extras
            if (r0 == 0) goto L7
            r0.release()
        L7:
            r2.extras = r3
            byte r0 = r2.extrasLength
            short r0 = (short) r0
            if (r3 != 0) goto L10
            r3 = 0
            goto L15
        L10:
            int r3 = r3.readableBytes()
            byte r3 = (byte) r3
        L15:
            r2.extrasLength = r3
            int r1 = r2.totalBodyLength
            int r1 = r1 + r3
            int r1 = r1 - r0
            r2.totalBodyLength = r1
            return r2
    }

    io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage setExtrasLength(byte r1) {
            r0 = this;
            r0.extrasLength = r1
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage
    public io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage setKey(io.netty.buffer.ByteBuf r3) {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.key
            if (r0 == 0) goto L7
            r0.release()
        L7:
            r2.key = r3
            short r0 = r2.keyLength
            if (r3 != 0) goto Lf
            r3 = 0
            goto L14
        Lf:
            int r3 = r3.readableBytes()
            short r3 = (short) r3
        L14:
            r2.keyLength = r3
            int r1 = r2.totalBodyLength
            int r1 = r1 + r3
            int r1 = r1 - r0
            r2.totalBodyLength = r1
            return r2
    }

    io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage setKeyLength(short r1) {
            r0 = this;
            r0.keyLength = r1
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage
    public io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage setMagic(byte r1) {
            r0 = this;
            r0.magic = r1
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage
    public io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage setOpaque(int r1) {
            r0 = this;
            r0.opaque = r1
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage
    public io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage setOpcode(byte r1) {
            r0 = this;
            r0.opcode = r1
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage
    public io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage setTotalBodyLength(int r1) {
            r0 = this;
            r0.totalBodyLength = r1
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage
    public int totalBodyLength() {
            r1 = this;
            int r0 = r1.totalBodyLength
            return r0
    }

    @Override // io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.MemcacheMessage mo41touch() {
            r1 = this;
            io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.handler.codec.memcache.MemcacheMessage mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage, io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage mo41touch() {
            r0 = this;
            super.touch()
            return r0
    }

    @Override // io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage, io.netty.handler.codec.memcache.MemcacheMessage, io.netty.handler.codec.memcache.LastMemcacheContent, io.netty.handler.codec.memcache.MemcacheContent, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage mo42touch(java.lang.Object r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.key
            if (r0 == 0) goto L7
            r0.touch(r2)
        L7:
            io.netty.buffer.ByteBuf r0 = r1.extras
            if (r0 == 0) goto Le
            r0.touch(r2)
        Le:
            return r1
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch() {
            r1 = this;
            io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage r0 = r1.mo41touch()
            return r0
    }

    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.memcache.binary.BinaryMemcacheMessage r1 = r0.mo42touch(r1)
            return r1
    }
}
