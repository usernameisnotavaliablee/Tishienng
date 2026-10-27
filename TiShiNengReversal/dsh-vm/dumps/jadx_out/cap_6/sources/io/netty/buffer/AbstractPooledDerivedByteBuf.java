package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
abstract class AbstractPooledDerivedByteBuf extends io.netty.buffer.AbstractReferenceCountedByteBuf {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private io.netty.buffer.ByteBuf parent;
    private final io.netty.util.Recycler.Handle<io.netty.buffer.AbstractPooledDerivedByteBuf> recyclerHandle;
    private io.netty.buffer.AbstractByteBuf rootParent;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class PooledNonRetainedDuplicateByteBuf extends io.netty.buffer.UnpooledDuplicatedByteBuf {
        private final io.netty.util.ReferenceCounted referenceCountDelegate;

        PooledNonRetainedDuplicateByteBuf(io.netty.util.ReferenceCounted r1, io.netty.buffer.AbstractByteBuf r2) {
                r0 = this;
                r0.<init>(r2)
                r0.referenceCountDelegate = r1
                return
        }

        @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
        public io.netty.buffer.ByteBuf duplicate() {
                r2 = this;
                r2.ensureAccessible()
                io.netty.buffer.AbstractPooledDerivedByteBuf$PooledNonRetainedDuplicateByteBuf r0 = new io.netty.buffer.AbstractPooledDerivedByteBuf$PooledNonRetainedDuplicateByteBuf
                io.netty.util.ReferenceCounted r1 = r2.referenceCountDelegate
                r0.<init>(r1, r2)
                return r0
        }

        @Override // io.netty.buffer.AbstractDerivedByteBuf
        int refCnt0() {
                r1 = this;
                io.netty.util.ReferenceCounted r0 = r1.referenceCountDelegate
                int r0 = r0.refCnt()
                return r0
        }

        @Override // io.netty.buffer.AbstractDerivedByteBuf
        boolean release0() {
                r1 = this;
                io.netty.util.ReferenceCounted r0 = r1.referenceCountDelegate
                boolean r0 = r0.release()
                return r0
        }

        @Override // io.netty.buffer.AbstractDerivedByteBuf
        boolean release0(int r2) {
                r1 = this;
                io.netty.util.ReferenceCounted r0 = r1.referenceCountDelegate
                boolean r2 = r0.release(r2)
                return r2
        }

        @Override // io.netty.buffer.AbstractDerivedByteBuf
        io.netty.buffer.ByteBuf retain0() {
                r1 = this;
                io.netty.util.ReferenceCounted r0 = r1.referenceCountDelegate
                r0.retain()
                return r1
        }

        @Override // io.netty.buffer.AbstractDerivedByteBuf
        io.netty.buffer.ByteBuf retain0(int r2) {
                r1 = this;
                io.netty.util.ReferenceCounted r0 = r1.referenceCountDelegate
                r0.retain(r2)
                return r1
        }

        @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
        public io.netty.buffer.ByteBuf retainedDuplicate() {
                r3 = this;
                io.netty.buffer.AbstractByteBuf r0 = r3.unwrap()
                int r1 = r3.readerIndex()
                int r2 = r3.writerIndex()
                io.netty.buffer.PooledDuplicatedByteBuf r0 = io.netty.buffer.PooledDuplicatedByteBuf.newInstance(r0, r3, r1, r2)
                return r0
        }

        @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
        public io.netty.buffer.ByteBuf retainedSlice() {
                r2 = this;
                int r0 = r2.readerIndex()
                int r1 = r2.capacity()
                io.netty.buffer.ByteBuf r0 = r2.retainedSlice(r0, r1)
                return r0
        }

        @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
        public io.netty.buffer.ByteBuf retainedSlice(int r2, int r3) {
                r1 = this;
                io.netty.buffer.AbstractByteBuf r0 = r1.unwrap()
                io.netty.buffer.PooledSlicedByteBuf r2 = io.netty.buffer.PooledSlicedByteBuf.newInstance(r0, r1, r2, r3)
                return r2
        }

        @Override // io.netty.buffer.DuplicatedByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
        public io.netty.buffer.ByteBuf slice(int r4, int r5) {
                r3 = this;
                r3.checkIndex(r4, r5)
                io.netty.buffer.AbstractPooledDerivedByteBuf$PooledNonRetainedSlicedByteBuf r0 = new io.netty.buffer.AbstractPooledDerivedByteBuf$PooledNonRetainedSlicedByteBuf
                io.netty.util.ReferenceCounted r1 = r3.referenceCountDelegate
                io.netty.buffer.AbstractByteBuf r2 = r3.unwrap()
                r0.<init>(r1, r2, r4, r5)
                return r0
        }

        @Override // io.netty.buffer.AbstractDerivedByteBuf
        io.netty.buffer.ByteBuf touch0() {
                r1 = this;
                io.netty.util.ReferenceCounted r0 = r1.referenceCountDelegate
                r0.touch()
                return r1
        }

        @Override // io.netty.buffer.AbstractDerivedByteBuf
        io.netty.buffer.ByteBuf touch0(java.lang.Object r2) {
                r1 = this;
                io.netty.util.ReferenceCounted r0 = r1.referenceCountDelegate
                r0.touch(r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class PooledNonRetainedSlicedByteBuf extends io.netty.buffer.UnpooledSlicedByteBuf {
        private final io.netty.util.ReferenceCounted referenceCountDelegate;

        PooledNonRetainedSlicedByteBuf(io.netty.util.ReferenceCounted r1, io.netty.buffer.AbstractByteBuf r2, int r3, int r4) {
                r0 = this;
                r0.<init>(r2, r3, r4)
                r0.referenceCountDelegate = r1
                return
        }

        @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
        public io.netty.buffer.ByteBuf duplicate() {
                r3 = this;
                r3.ensureAccessible()
                io.netty.buffer.AbstractPooledDerivedByteBuf$PooledNonRetainedDuplicateByteBuf r0 = new io.netty.buffer.AbstractPooledDerivedByteBuf$PooledNonRetainedDuplicateByteBuf
                io.netty.util.ReferenceCounted r1 = r3.referenceCountDelegate
                io.netty.buffer.AbstractByteBuf r2 = r3.unwrap()
                r0.<init>(r1, r2)
                int r1 = r3.readerIndex()
                int r1 = r3.idx(r1)
                int r2 = r3.writerIndex()
                int r2 = r3.idx(r2)
                io.netty.buffer.ByteBuf r0 = r0.setIndex(r1, r2)
                return r0
        }

        @Override // io.netty.buffer.AbstractDerivedByteBuf
        int refCnt0() {
                r1 = this;
                io.netty.util.ReferenceCounted r0 = r1.referenceCountDelegate
                int r0 = r0.refCnt()
                return r0
        }

        @Override // io.netty.buffer.AbstractDerivedByteBuf
        boolean release0() {
                r1 = this;
                io.netty.util.ReferenceCounted r0 = r1.referenceCountDelegate
                boolean r0 = r0.release()
                return r0
        }

        @Override // io.netty.buffer.AbstractDerivedByteBuf
        boolean release0(int r2) {
                r1 = this;
                io.netty.util.ReferenceCounted r0 = r1.referenceCountDelegate
                boolean r2 = r0.release(r2)
                return r2
        }

        @Override // io.netty.buffer.AbstractDerivedByteBuf
        io.netty.buffer.ByteBuf retain0() {
                r1 = this;
                io.netty.util.ReferenceCounted r0 = r1.referenceCountDelegate
                r0.retain()
                return r1
        }

        @Override // io.netty.buffer.AbstractDerivedByteBuf
        io.netty.buffer.ByteBuf retain0(int r2) {
                r1 = this;
                io.netty.util.ReferenceCounted r0 = r1.referenceCountDelegate
                r0.retain(r2)
                return r1
        }

        @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
        public io.netty.buffer.ByteBuf retainedDuplicate() {
                r3 = this;
                io.netty.buffer.AbstractByteBuf r0 = r3.unwrap()
                int r1 = r3.readerIndex()
                int r1 = r3.idx(r1)
                int r2 = r3.writerIndex()
                int r2 = r3.idx(r2)
                io.netty.buffer.PooledDuplicatedByteBuf r0 = io.netty.buffer.PooledDuplicatedByteBuf.newInstance(r0, r3, r1, r2)
                return r0
        }

        @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
        public io.netty.buffer.ByteBuf retainedSlice() {
                r2 = this;
                r0 = 0
                int r1 = r2.capacity()
                io.netty.buffer.ByteBuf r0 = r2.retainedSlice(r0, r1)
                return r0
        }

        @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
        public io.netty.buffer.ByteBuf retainedSlice(int r2, int r3) {
                r1 = this;
                io.netty.buffer.AbstractByteBuf r0 = r1.unwrap()
                int r2 = r1.idx(r2)
                io.netty.buffer.PooledSlicedByteBuf r2 = io.netty.buffer.PooledSlicedByteBuf.newInstance(r0, r1, r2, r3)
                return r2
        }

        @Override // io.netty.buffer.AbstractUnpooledSlicedByteBuf, io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
        public io.netty.buffer.ByteBuf slice(int r4, int r5) {
                r3 = this;
                r3.checkIndex(r4, r5)
                io.netty.buffer.AbstractPooledDerivedByteBuf$PooledNonRetainedSlicedByteBuf r0 = new io.netty.buffer.AbstractPooledDerivedByteBuf$PooledNonRetainedSlicedByteBuf
                io.netty.util.ReferenceCounted r1 = r3.referenceCountDelegate
                io.netty.buffer.AbstractByteBuf r2 = r3.unwrap()
                int r4 = r3.idx(r4)
                r0.<init>(r1, r2, r4, r5)
                return r0
        }

        @Override // io.netty.buffer.AbstractDerivedByteBuf
        io.netty.buffer.ByteBuf touch0() {
                r1 = this;
                io.netty.util.ReferenceCounted r0 = r1.referenceCountDelegate
                r0.touch()
                return r1
        }

        @Override // io.netty.buffer.AbstractDerivedByteBuf
        io.netty.buffer.ByteBuf touch0(java.lang.Object r2) {
                r1 = this;
                io.netty.util.ReferenceCounted r0 = r1.referenceCountDelegate
                r0.touch(r2)
                return r1
        }
    }

    static {
            return
    }

    AbstractPooledDerivedByteBuf(io.netty.util.Recycler.Handle<? extends io.netty.buffer.AbstractPooledDerivedByteBuf> r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            r1.recyclerHandle = r2
            return
    }

    @Override // io.netty.buffer.ByteBuf
    public final io.netty.buffer.ByteBufAllocator alloc() {
            r1 = this;
            io.netty.buffer.AbstractByteBuf r0 = r1.unwrap()
            io.netty.buffer.ByteBufAllocator r0 = r0.alloc()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public byte[] array() {
            r1 = this;
            io.netty.buffer.AbstractByteBuf r0 = r1.unwrap()
            byte[] r0 = r0.array()
            return r0
    }

    @Override // io.netty.buffer.AbstractReferenceCountedByteBuf
    protected final void deallocate() {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r2.parent
            io.netty.util.Recycler$Handle<io.netty.buffer.AbstractPooledDerivedByteBuf> r1 = r2.recyclerHandle
            r1.recycle(r2)
            r0.release()
            return
    }

    final io.netty.buffer.ByteBuf duplicate0() {
            r2 = this;
            r2.ensureAccessible()
            io.netty.buffer.AbstractPooledDerivedByteBuf$PooledNonRetainedDuplicateByteBuf r0 = new io.netty.buffer.AbstractPooledDerivedByteBuf$PooledNonRetainedDuplicateByteBuf
            io.netty.buffer.AbstractByteBuf r1 = r2.unwrap()
            r0.<init>(r2, r1)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean hasArray() {
            r1 = this;
            io.netty.buffer.AbstractByteBuf r0 = r1.unwrap()
            boolean r0 = r0.hasArray()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean hasMemoryAddress() {
            r1 = this;
            io.netty.buffer.AbstractByteBuf r0 = r1.unwrap()
            boolean r0 = r0.hasMemoryAddress()
            return r0
    }

    final <U extends io.netty.buffer.AbstractPooledDerivedByteBuf> U init(io.netty.buffer.AbstractByteBuf r1, io.netty.buffer.ByteBuf r2, int r3, int r4, int r5) {
            r0 = this;
            r2.retain()
            r0.parent = r2
            r0.rootParent = r1
            r0.maxCapacity(r5)     // Catch: java.lang.Throwable -> L11
            r0.setIndex0(r3, r4)     // Catch: java.lang.Throwable -> L11
            r0.resetRefCnt()     // Catch: java.lang.Throwable -> L11
            return r0
        L11:
            r1 = move-exception
            r3 = 0
            r0.rootParent = r3
            r0.parent = r3
            r2.release()
            throw r1
    }

    @Override // io.netty.buffer.ByteBuf
    public final java.nio.ByteBuffer internalNioBuffer(int r1, int r2) {
            r0 = this;
            java.nio.ByteBuffer r1 = r0.nioBuffer(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public final boolean isDirect() {
            r1 = this;
            io.netty.buffer.AbstractByteBuf r0 = r1.unwrap()
            boolean r0 = r0.isDirect()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public boolean isReadOnly() {
            r1 = this;
            io.netty.buffer.AbstractByteBuf r0 = r1.unwrap()
            boolean r0 = r0.isReadOnly()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public final int nioBufferCount() {
            r1 = this;
            io.netty.buffer.AbstractByteBuf r0 = r1.unwrap()
            int r0 = r0.nioBufferCount()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    @java.lang.Deprecated
    public final java.nio.ByteOrder order() {
            r1 = this;
            io.netty.buffer.AbstractByteBuf r0 = r1.unwrap()
            java.nio.ByteOrder r0 = r0.order()
            return r0
    }

    final void parent(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            r0.parent = r1
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public final io.netty.buffer.ByteBuf retainedSlice() {
            r2 = this;
            int r0 = r2.readerIndex()
            int r1 = r2.writerIndex()
            int r1 = r1 - r0
            io.netty.buffer.ByteBuf r0 = r2.retainedSlice(r0, r1)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf slice(int r3, int r4) {
            r2 = this;
            r2.ensureAccessible()
            io.netty.buffer.AbstractPooledDerivedByteBuf$PooledNonRetainedSlicedByteBuf r0 = new io.netty.buffer.AbstractPooledDerivedByteBuf$PooledNonRetainedSlicedByteBuf
            io.netty.buffer.AbstractByteBuf r1 = r2.unwrap()
            r0.<init>(r2, r1, r3, r4)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public final io.netty.buffer.AbstractByteBuf unwrap() {
            r1 = this;
            io.netty.buffer.AbstractByteBuf r0 = r1.rootParent
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf unwrap() {
            r1 = this;
            io.netty.buffer.AbstractByteBuf r0 = r1.unwrap()
            return r0
    }
}
