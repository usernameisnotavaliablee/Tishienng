package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class SimpleLeakAwareCompositeByteBuf extends io.netty.buffer.WrappedCompositeByteBuf {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    final io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> leak;

    static {
            return
    }

    SimpleLeakAwareCompositeByteBuf(io.netty.buffer.CompositeByteBuf r1, io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r2) {
            r0 = this;
            r0.<init>(r1)
            java.lang.String r1 = "leak"
            java.lang.Object r1 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r1)
            io.netty.util.ResourceLeakTracker r1 = (io.netty.util.ResourceLeakTracker) r1
            r0.leak = r1
            return
    }

    private void closeLeak(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r1.leak
            r0.close(r2)
            return
    }

    private io.netty.buffer.SimpleLeakAwareByteBuf newLeakAwareByteBuf(io.netty.buffer.ByteBuf r3) {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.unwrap()
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r1 = r2.leak
            io.netty.buffer.SimpleLeakAwareByteBuf r3 = r2.newLeakAwareByteBuf(r3, r0, r1)
            return r3
    }

    @Override // io.netty.buffer.WrappedCompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf asReadOnly() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = super.asReadOnly()
            io.netty.buffer.SimpleLeakAwareByteBuf r0 = r1.newLeakAwareByteBuf(r0)
            return r0
    }

    @Override // io.netty.buffer.WrappedCompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf duplicate() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = super.duplicate()
            io.netty.buffer.SimpleLeakAwareByteBuf r0 = r1.newLeakAwareByteBuf(r0)
            return r0
    }

    protected io.netty.buffer.SimpleLeakAwareByteBuf newLeakAwareByteBuf(io.netty.buffer.ByteBuf r2, io.netty.buffer.ByteBuf r3, io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r4) {
            r1 = this;
            io.netty.buffer.SimpleLeakAwareByteBuf r0 = new io.netty.buffer.SimpleLeakAwareByteBuf
            r0.<init>(r2, r3, r4)
            return r0
    }

    @Override // io.netty.buffer.WrappedCompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf order(java.nio.ByteOrder r2) {
            r1 = this;
            java.nio.ByteOrder r0 = r1.order()
            if (r0 != r2) goto L7
            return r1
        L7:
            io.netty.buffer.ByteBuf r2 = super.order(r2)
            io.netty.buffer.SimpleLeakAwareByteBuf r2 = r1.newLeakAwareByteBuf(r2)
            return r2
    }

    @Override // io.netty.buffer.WrappedCompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readRetainedSlice(int r1) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = super.readRetainedSlice(r1)
            io.netty.buffer.SimpleLeakAwareByteBuf r1 = r0.newLeakAwareByteBuf(r1)
            return r1
    }

    @Override // io.netty.buffer.WrappedCompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readSlice(int r1) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = super.readSlice(r1)
            io.netty.buffer.SimpleLeakAwareByteBuf r1 = r0.newLeakAwareByteBuf(r1)
            return r1
    }

    @Override // io.netty.buffer.WrappedCompositeByteBuf, io.netty.buffer.AbstractReferenceCountedByteBuf
    public boolean release() {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.unwrap()
            boolean r1 = super.release()
            if (r1 == 0) goto Lf
            r2.closeLeak(r0)
            r0 = 1
            return r0
        Lf:
            r0 = 0
            return r0
    }

    @Override // io.netty.buffer.WrappedCompositeByteBuf, io.netty.buffer.AbstractReferenceCountedByteBuf
    public boolean release(int r2) {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.unwrap()
            boolean r2 = super.release(r2)
            if (r2 == 0) goto Lf
            r1.closeLeak(r0)
            r2 = 1
            return r2
        Lf:
            r2 = 0
            return r2
    }

    @Override // io.netty.buffer.WrappedCompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf retainedDuplicate() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = super.retainedDuplicate()
            io.netty.buffer.SimpleLeakAwareByteBuf r0 = r1.newLeakAwareByteBuf(r0)
            return r0
    }

    @Override // io.netty.buffer.WrappedCompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf retainedSlice() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = super.retainedSlice()
            io.netty.buffer.SimpleLeakAwareByteBuf r0 = r1.newLeakAwareByteBuf(r0)
            return r0
    }

    @Override // io.netty.buffer.WrappedCompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf retainedSlice(int r1, int r2) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = super.retainedSlice(r1, r2)
            io.netty.buffer.SimpleLeakAwareByteBuf r1 = r0.newLeakAwareByteBuf(r1)
            return r1
    }

    @Override // io.netty.buffer.WrappedCompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf slice() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = super.slice()
            io.netty.buffer.SimpleLeakAwareByteBuf r0 = r1.newLeakAwareByteBuf(r0)
            return r0
    }

    @Override // io.netty.buffer.WrappedCompositeByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf slice(int r1, int r2) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = super.slice(r1, r2)
            io.netty.buffer.SimpleLeakAwareByteBuf r1 = r0.newLeakAwareByteBuf(r1)
            return r1
    }
}
