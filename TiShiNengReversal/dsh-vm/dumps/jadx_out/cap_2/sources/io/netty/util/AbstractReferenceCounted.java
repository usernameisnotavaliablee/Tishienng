package io.netty.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class AbstractReferenceCounted implements io.netty.util.ReferenceCounted {
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater<io.netty.util.AbstractReferenceCounted> AIF_UPDATER = null;
    private static final long REFCNT_FIELD_OFFSET = 0;
    private static final io.netty.util.internal.ReferenceCountUpdater<io.netty.util.AbstractReferenceCounted> updater = null;
    private volatile int refCnt;


    static {
            java.lang.Class<io.netty.util.AbstractReferenceCounted> r0 = io.netty.util.AbstractReferenceCounted.class
            java.lang.String r1 = "refCnt"
            long r2 = io.netty.util.internal.ReferenceCountUpdater.getUnsafeOffset(r0, r1)
            io.netty.util.AbstractReferenceCounted.REFCNT_FIELD_OFFSET = r2
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            io.netty.util.AbstractReferenceCounted.AIF_UPDATER = r0
            io.netty.util.AbstractReferenceCounted$1 r0 = new io.netty.util.AbstractReferenceCounted$1
            r0.<init>()
            io.netty.util.AbstractReferenceCounted.updater = r0
            return
    }

    public AbstractReferenceCounted() {
            r1 = this;
            r1.<init>()
            io.netty.util.internal.ReferenceCountUpdater<io.netty.util.AbstractReferenceCounted> r0 = io.netty.util.AbstractReferenceCounted.updater
            int r0 = r0.initialValue()
            r1.refCnt = r0
            return
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater access$000() {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater<io.netty.util.AbstractReferenceCounted> r0 = io.netty.util.AbstractReferenceCounted.AIF_UPDATER
            return r0
    }

    static /* synthetic */ long access$100() {
            long r0 = io.netty.util.AbstractReferenceCounted.REFCNT_FIELD_OFFSET
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

    @Override // io.netty.util.ReferenceCounted
    public int refCnt() {
            r1 = this;
            io.netty.util.internal.ReferenceCountUpdater<io.netty.util.AbstractReferenceCounted> r0 = io.netty.util.AbstractReferenceCounted.updater
            int r0 = r0.refCnt(r1)
            return r0
    }

    @Override // io.netty.util.ReferenceCounted
    public boolean release() {
            r1 = this;
            io.netty.util.internal.ReferenceCountUpdater<io.netty.util.AbstractReferenceCounted> r0 = io.netty.util.AbstractReferenceCounted.updater
            boolean r0 = r0.release(r1)
            boolean r0 = r1.handleRelease(r0)
            return r0
    }

    @Override // io.netty.util.ReferenceCounted
    public boolean release(int r2) {
            r1 = this;
            io.netty.util.internal.ReferenceCountUpdater<io.netty.util.AbstractReferenceCounted> r0 = io.netty.util.AbstractReferenceCounted.updater
            boolean r2 = r0.release(r1, r2)
            boolean r2 = r1.handleRelease(r2)
            return r2
    }

    @Override // io.netty.util.ReferenceCounted
    public io.netty.util.ReferenceCounted retain() {
            r1 = this;
            io.netty.util.internal.ReferenceCountUpdater<io.netty.util.AbstractReferenceCounted> r0 = io.netty.util.AbstractReferenceCounted.updater
            io.netty.util.ReferenceCounted r0 = r0.retain(r1)
            return r0
    }

    @Override // io.netty.util.ReferenceCounted
    public io.netty.util.ReferenceCounted retain(int r2) {
            r1 = this;
            io.netty.util.internal.ReferenceCountUpdater<io.netty.util.AbstractReferenceCounted> r0 = io.netty.util.AbstractReferenceCounted.updater
            io.netty.util.ReferenceCounted r2 = r0.retain(r1, r2)
            return r2
    }

    protected final void setRefCnt(int r2) {
            r1 = this;
            io.netty.util.internal.ReferenceCountUpdater<io.netty.util.AbstractReferenceCounted> r0 = io.netty.util.AbstractReferenceCounted.updater
            r0.setRefCnt(r1, r2)
            return
    }

    @Override // io.netty.util.ReferenceCounted
    public io.netty.util.ReferenceCounted touch() {
            r1 = this;
            r0 = 0
            io.netty.util.ReferenceCounted r0 = r1.touch(r0)
            return r0
    }
}
