package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class UnreleasableByteBuf extends io.netty.buffer.WrappedByteBuf {
    private io.netty.buffer.SwappedByteBuf swappedBuf;

    UnreleasableByteBuf(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            boolean r0 = r2 instanceof io.netty.buffer.UnreleasableByteBuf
            if (r0 == 0) goto L8
            io.netty.buffer.ByteBuf r2 = r2.unwrap()
        L8:
            r1.<init>(r2)
            return
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf asReadOnly() {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.buf
            boolean r0 = r0.isReadOnly()
            if (r0 == 0) goto L9
            return r2
        L9:
            io.netty.buffer.UnreleasableByteBuf r0 = new io.netty.buffer.UnreleasableByteBuf
            io.netty.buffer.ByteBuf r1 = r2.buf
            io.netty.buffer.ByteBuf r1 = r1.asReadOnly()
            r0.<init>(r1)
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf duplicate() {
            r2 = this;
            io.netty.buffer.UnreleasableByteBuf r0 = new io.netty.buffer.UnreleasableByteBuf
            io.netty.buffer.ByteBuf r1 = r2.buf
            io.netty.buffer.ByteBuf r1 = r1.duplicate()
            r0.<init>(r1)
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf order(java.nio.ByteOrder r2) {
            r1 = this;
            if (r2 == 0) goto L15
            java.nio.ByteOrder r0 = r1.order()
            if (r2 != r0) goto L9
            return r1
        L9:
            io.netty.buffer.SwappedByteBuf r2 = r1.swappedBuf
            if (r2 != 0) goto L14
            io.netty.buffer.SwappedByteBuf r2 = new io.netty.buffer.SwappedByteBuf
            r2.<init>(r1)
            r1.swappedBuf = r2
        L14:
            return r2
        L15:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "endianness"
            r2.<init>(r0)
            throw r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readRetainedSlice(int r1) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r0.readSlice(r1)
            return r1
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readSlice(int r3) {
            r2 = this;
            io.netty.buffer.UnreleasableByteBuf r0 = new io.netty.buffer.UnreleasableByteBuf
            io.netty.buffer.ByteBuf r1 = r2.buf
            io.netty.buffer.ByteBuf r3 = r1.readSlice(r3)
            r0.<init>(r3)
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf
    public boolean release() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf
    public boolean release(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf retain() {
            r0 = this;
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf retain(int r1) {
            r0 = this;
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo1retain() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.retain()
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo2retain(int r1) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r0.retain(r1)
            return r1
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf retainedDuplicate() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.duplicate()
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf retainedSlice() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.slice()
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf retainedSlice(int r1, int r2) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r0.slice(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf slice() {
            r2 = this;
            io.netty.buffer.UnreleasableByteBuf r0 = new io.netty.buffer.UnreleasableByteBuf
            io.netty.buffer.ByteBuf r1 = r2.buf
            io.netty.buffer.ByteBuf r1 = r1.slice()
            r0.<init>(r1)
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf slice(int r3, int r4) {
            r2 = this;
            io.netty.buffer.UnreleasableByteBuf r0 = new io.netty.buffer.UnreleasableByteBuf
            io.netty.buffer.ByteBuf r1 = r2.buf
            io.netty.buffer.ByteBuf r3 = r1.slice(r3, r4)
            r0.<init>(r3)
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf touch() {
            r0 = this;
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf touch(java.lang.Object r1) {
            r0 = this;
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo3touch() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.touch()
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo4touch(java.lang.Object r1) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r0.touch(r1)
            return r1
    }
}
