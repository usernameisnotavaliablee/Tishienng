package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class AbstractReferenceCountedByteBuf extends io.netty.buffer.AbstractByteBuf {
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater<io.netty.buffer.AbstractReferenceCountedByteBuf> AIF_UPDATER = null;
    private static final long REFCNT_FIELD_OFFSET = 0;
    private static final io.netty.util.internal.ReferenceCountUpdater<io.netty.buffer.AbstractReferenceCountedByteBuf> updater = null;
    private volatile int refCnt;


    static {
            java.lang.Class<io.netty.buffer.AbstractReferenceCountedByteBuf> r0 = io.netty.buffer.AbstractReferenceCountedByteBuf.class
            java.lang.String r1 = "refCnt"
            long r2 = io.netty.util.internal.ReferenceCountUpdater.getUnsafeOffset(r0, r1)
            io.netty.buffer.AbstractReferenceCountedByteBuf.REFCNT_FIELD_OFFSET = r2
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            io.netty.buffer.AbstractReferenceCountedByteBuf.AIF_UPDATER = r0
            io.netty.buffer.AbstractReferenceCountedByteBuf$1 r0 = new io.netty.buffer.AbstractReferenceCountedByteBuf$1
            r0.<init>()
            io.netty.buffer.AbstractReferenceCountedByteBuf.updater = r0
            return
    }

    protected AbstractReferenceCountedByteBuf(int r1) {
            r0 = this;
            r0.<init>(r1)
            io.netty.util.internal.ReferenceCountUpdater<io.netty.buffer.AbstractReferenceCountedByteBuf> r1 = io.netty.buffer.AbstractReferenceCountedByteBuf.updater
            int r1 = r1.initialValue()
            r0.refCnt = r1
            return
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater access$000() {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater<io.netty.buffer.AbstractReferenceCountedByteBuf> r0 = io.netty.buffer.AbstractReferenceCountedByteBuf.AIF_UPDATER
            return r0
    }

    static /* synthetic */ long access$100() {
            long r0 = io.netty.buffer.AbstractReferenceCountedByteBuf.REFCNT_FIELD_OFFSET
            return r0
    }

    private boolean handleRelease(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r0.deallocate()
        L5:
            return r1
    }

    protected abstract void deallocate();

    @Override // io.netty.buffer.ByteBuf
    boolean isAccessible() {
            r1 = this;
            io.netty.util.internal.ReferenceCountUpdater<io.netty.buffer.AbstractReferenceCountedByteBuf> r0 = io.netty.buffer.AbstractReferenceCountedByteBuf.updater
            boolean r0 = r0.isLiveNonVolatile(r1)
            return r0
    }

    public int refCnt() {
            r1 = this;
            io.netty.util.internal.ReferenceCountUpdater<io.netty.buffer.AbstractReferenceCountedByteBuf> r0 = io.netty.buffer.AbstractReferenceCountedByteBuf.updater
            int r0 = r0.refCnt(r1)
            return r0
    }

    public boolean release() {
            r1 = this;
            io.netty.util.internal.ReferenceCountUpdater<io.netty.buffer.AbstractReferenceCountedByteBuf> r0 = io.netty.buffer.AbstractReferenceCountedByteBuf.updater
            boolean r0 = r0.release(r1)
            boolean r0 = r1.handleRelease(r0)
            return r0
    }

    public boolean release(int r2) {
            r1 = this;
            io.netty.util.internal.ReferenceCountUpdater<io.netty.buffer.AbstractReferenceCountedByteBuf> r0 = io.netty.buffer.AbstractReferenceCountedByteBuf.updater
            boolean r2 = r0.release(r1, r2)
            boolean r2 = r1.handleRelease(r2)
            return r2
    }

    protected final void resetRefCnt() {
            r1 = this;
            io.netty.util.internal.ReferenceCountUpdater<io.netty.buffer.AbstractReferenceCountedByteBuf> r0 = io.netty.buffer.AbstractReferenceCountedByteBuf.updater
            r0.resetRefCnt(r1)
            return
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf retain() {
            r1 = this;
            io.netty.util.internal.ReferenceCountUpdater<io.netty.buffer.AbstractReferenceCountedByteBuf> r0 = io.netty.buffer.AbstractReferenceCountedByteBuf.updater
            io.netty.util.ReferenceCounted r0 = r0.retain(r1)
            io.netty.buffer.ByteBuf r0 = (io.netty.buffer.ByteBuf) r0
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf retain(int r2) {
            r1 = this;
            io.netty.util.internal.ReferenceCountUpdater<io.netty.buffer.AbstractReferenceCountedByteBuf> r0 = io.netty.buffer.AbstractReferenceCountedByteBuf.updater
            io.netty.util.ReferenceCounted r2 = r0.retain(r1, r2)
            io.netty.buffer.ByteBuf r2 = (io.netty.buffer.ByteBuf) r2
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo1retain() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.retain()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo2retain(int r1) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r0.retain(r1)
            return r1
    }

    protected final void setRefCnt(int r2) {
            r1 = this;
            io.netty.util.internal.ReferenceCountUpdater<io.netty.buffer.AbstractReferenceCountedByteBuf> r0 = io.netty.buffer.AbstractReferenceCountedByteBuf.updater
            r0.setRefCnt(r1, r2)
            return
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf touch() {
            r0 = this;
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf touch(java.lang.Object r1) {
            r0 = this;
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo3touch() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.touch()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo4touch(java.lang.Object r1) {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r0.touch(r1)
            return r1
    }
}
