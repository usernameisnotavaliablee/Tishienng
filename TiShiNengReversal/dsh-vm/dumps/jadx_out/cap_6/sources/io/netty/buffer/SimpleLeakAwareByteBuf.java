package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class SimpleLeakAwareByteBuf extends io.netty.buffer.WrappedByteBuf {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    final io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> leak;
    private final io.netty.buffer.ByteBuf trackedByteBuf;

    static {
            return
    }

    SimpleLeakAwareByteBuf(io.netty.buffer.ByteBuf r1, io.netty.buffer.ByteBuf r2, io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r3) {
            r0 = this;
            r0.<init>(r1)
            java.lang.String r1 = "trackedByteBuf"
            java.lang.Object r1 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r1)
            io.netty.buffer.ByteBuf r1 = (io.netty.buffer.ByteBuf) r1
            r0.trackedByteBuf = r1
            java.lang.String r1 = "leak"
            java.lang.Object r1 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r1)
            io.netty.util.ResourceLeakTracker r1 = (io.netty.util.ResourceLeakTracker) r1
            r0.leak = r1
            return
    }

    SimpleLeakAwareByteBuf(io.netty.buffer.ByteBuf r1, io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r2) {
            r0 = this;
            r0.<init>(r1, r1, r2)
            return
    }

    private void closeLeak() {
            r2 = this;
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r0 = r2.leak
            io.netty.buffer.ByteBuf r1 = r2.trackedByteBuf
            r0.close(r1)
            return
    }

    private io.netty.buffer.SimpleLeakAwareByteBuf newLeakAwareByteBuf(io.netty.buffer.ByteBuf r1, io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r2) {
            r0 = this;
            io.netty.buffer.SimpleLeakAwareByteBuf r1 = r0.newLeakAwareByteBuf(r1, r1, r2)
            return r1
    }

    private io.netty.buffer.SimpleLeakAwareByteBuf newSharedLeakAwareByteBuf(io.netty.buffer.ByteBuf r3) {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.trackedByteBuf
            io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r1 = r2.leak
            io.netty.buffer.SimpleLeakAwareByteBuf r3 = r2.newLeakAwareByteBuf(r3, r0, r1)
            return r3
    }

    private static io.netty.buffer.ByteBuf unwrapSwapped(io.netty.buffer.ByteBuf r1) {
            boolean r0 = r1 instanceof io.netty.buffer.SwappedByteBuf
            if (r0 == 0) goto Lc
        L4:
            io.netty.buffer.ByteBuf r1 = r1.unwrap()
            boolean r0 = r1 instanceof io.netty.buffer.SwappedByteBuf
            if (r0 != 0) goto L4
        Lc:
            return r1
    }

    private io.netty.buffer.ByteBuf unwrappedDerived(io.netty.buffer.ByteBuf r3) {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = unwrapSwapped(r3)
            boolean r1 = r0 instanceof io.netty.buffer.AbstractPooledDerivedByteBuf
            if (r1 == 0) goto L1b
            io.netty.buffer.AbstractPooledDerivedByteBuf r0 = (io.netty.buffer.AbstractPooledDerivedByteBuf) r0
            r0.parent(r2)
            io.netty.util.ResourceLeakDetector<io.netty.buffer.ByteBuf> r0 = io.netty.buffer.AbstractByteBuf.leakDetector
            io.netty.util.ResourceLeakTracker r0 = r0.track(r3)
            if (r0 != 0) goto L16
            return r3
        L16:
            io.netty.buffer.SimpleLeakAwareByteBuf r3 = r2.newLeakAwareByteBuf(r3, r0)
            return r3
        L1b:
            io.netty.buffer.SimpleLeakAwareByteBuf r3 = r2.newSharedLeakAwareByteBuf(r3)
            return r3
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf asReadOnly() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = super.asReadOnly()
            io.netty.buffer.SimpleLeakAwareByteBuf r0 = r1.newSharedLeakAwareByteBuf(r0)
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf duplicate() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = super.duplicate()
            io.netty.buffer.SimpleLeakAwareByteBuf r0 = r1.newSharedLeakAwareByteBuf(r0)
            return r0
    }

    protected io.netty.buffer.SimpleLeakAwareByteBuf newLeakAwareByteBuf(io.netty.buffer.ByteBuf r2, io.netty.buffer.ByteBuf r3, io.netty.util.ResourceLeakTracker<io.netty.buffer.ByteBuf> r4) {
            r1 = this;
            io.netty.buffer.SimpleLeakAwareByteBuf r0 = new io.netty.buffer.SimpleLeakAwareByteBuf
            r0.<init>(r2, r3, r4)
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf order(java.nio.ByteOrder r2) {
            r1 = this;
            java.nio.ByteOrder r0 = r1.order()
            if (r0 != r2) goto L7
            return r1
        L7:
            io.netty.buffer.ByteBuf r2 = super.order(r2)
            io.netty.buffer.SimpleLeakAwareByteBuf r2 = r1.newSharedLeakAwareByteBuf(r2)
            return r2
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readRetainedSlice(int r1) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = super.readRetainedSlice(r1)
            io.netty.buffer.ByteBuf r1 = r0.unwrappedDerived(r1)
            return r1
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf readSlice(int r1) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = super.readSlice(r1)
            io.netty.buffer.SimpleLeakAwareByteBuf r1 = r0.newSharedLeakAwareByteBuf(r1)
            return r1
    }

    @Override // io.netty.buffer.WrappedByteBuf
    public boolean release() {
            r1 = this;
            boolean r0 = super.release()
            if (r0 == 0) goto Lb
            r1.closeLeak()
            r0 = 1
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf
    public boolean release(int r1) {
            r0 = this;
            boolean r1 = super.release(r1)
            if (r1 == 0) goto Lb
            r0.closeLeak()
            r1 = 1
            return r1
        Lb:
            r1 = 0
            return r1
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf retainedDuplicate() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = super.retainedDuplicate()
            io.netty.buffer.ByteBuf r0 = r1.unwrappedDerived(r0)
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf retainedSlice() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = super.retainedSlice()
            io.netty.buffer.ByteBuf r0 = r1.unwrappedDerived(r0)
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf retainedSlice(int r1, int r2) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = super.retainedSlice(r1, r2)
            io.netty.buffer.ByteBuf r1 = r0.unwrappedDerived(r1)
            return r1
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf slice() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = super.slice()
            io.netty.buffer.SimpleLeakAwareByteBuf r0 = r1.newSharedLeakAwareByteBuf(r0)
            return r0
    }

    @Override // io.netty.buffer.WrappedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf slice(int r1, int r2) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = super.slice(r1, r2)
            io.netty.buffer.SimpleLeakAwareByteBuf r1 = r0.newSharedLeakAwareByteBuf(r1)
            return r1
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
