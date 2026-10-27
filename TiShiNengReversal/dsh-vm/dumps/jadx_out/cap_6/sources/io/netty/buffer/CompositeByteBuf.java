package io.netty.buffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class CompositeByteBuf extends io.netty.buffer.AbstractReferenceCountedByteBuf implements java.lang.Iterable<io.netty.buffer.ByteBuf> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final io.netty.buffer.CompositeByteBuf.ByteWrapper<byte[]> BYTE_ARRAY_WRAPPER = null;
    static final io.netty.buffer.CompositeByteBuf.ByteWrapper<java.nio.ByteBuffer> BYTE_BUFFER_WRAPPER = null;
    private static final java.util.Iterator<io.netty.buffer.ByteBuf> EMPTY_ITERATOR = null;
    private static final java.nio.ByteBuffer EMPTY_NIO_BUFFER = null;
    private final io.netty.buffer.ByteBufAllocator alloc;
    private int componentCount;
    private io.netty.buffer.CompositeByteBuf.Component[] components;
    private final boolean direct;
    private boolean freed;
    private io.netty.buffer.CompositeByteBuf.Component lastAccessed;
    private final int maxNumComponents;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface ByteWrapper<T> {
        boolean isEmpty(T r1);

        io.netty.buffer.ByteBuf wrap(T r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class Component {
        int adjustment;
        final io.netty.buffer.ByteBuf buf;
        int endOffset;
        int offset;
        private io.netty.buffer.ByteBuf slice;

        Component(io.netty.buffer.ByteBuf r1, int r2, int r3, int r4, io.netty.buffer.ByteBuf r5) {
                r0 = this;
                r0.<init>()
                r0.buf = r1
                r0.offset = r3
                int r4 = r4 + r3
                r0.endOffset = r4
                int r2 = r2 - r3
                r0.adjustment = r2
                r0.slice = r5
                return
        }

        static /* synthetic */ io.netty.buffer.ByteBuf access$100(io.netty.buffer.CompositeByteBuf.Component r0) {
                io.netty.buffer.ByteBuf r0 = r0.slice
                return r0
        }

        static /* synthetic */ io.netty.buffer.ByteBuf access$102(io.netty.buffer.CompositeByteBuf.Component r0, io.netty.buffer.ByteBuf r1) {
                r0.slice = r1
                return r1
        }

        io.netty.buffer.ByteBuf duplicate() {
                r3 = this;
                io.netty.buffer.ByteBuf r0 = r3.buf
                io.netty.buffer.ByteBuf r0 = r0.duplicate()
                int r1 = r3.offset
                int r1 = r3.idx(r1)
                int r2 = r3.endOffset
                int r2 = r3.idx(r2)
                io.netty.buffer.ByteBuf r0 = r0.setIndex(r1, r2)
                return r0
        }

        void free() {
                r1 = this;
                io.netty.buffer.ByteBuf r0 = r1.slice
                if (r0 == 0) goto L8
                r0.release()
                goto Ld
            L8:
                io.netty.buffer.ByteBuf r0 = r1.buf
                r0.release()
            Ld:
                r0 = 0
                r1.slice = r0
                return
        }

        int idx(int r2) {
                r1 = this;
                int r0 = r1.adjustment
                int r2 = r2 + r0
                return r2
        }

        java.nio.ByteBuffer internalNioBuffer(int r2, int r3) {
                r1 = this;
                io.netty.buffer.ByteBuf r0 = r1.slice
                if (r0 == 0) goto Lf
                io.netty.buffer.ByteBuf r0 = r1.buf
                int r2 = r1.idx(r2)
                java.nio.ByteBuffer r2 = r0.nioBuffer(r2, r3)
                return r2
            Lf:
                io.netty.buffer.ByteBuf r0 = r1.buf
                int r2 = r1.idx(r2)
                java.nio.ByteBuffer r2 = r0.internalNioBuffer(r2, r3)
                return r2
        }

        int length() {
                r2 = this;
                int r0 = r2.endOffset
                int r1 = r2.offset
                int r0 = r0 - r1
                return r0
        }

        void reposition(int r3) {
                r2 = this;
                int r0 = r2.offset
                int r0 = r3 - r0
                int r1 = r2.endOffset
                int r1 = r1 + r0
                r2.endOffset = r1
                int r1 = r2.adjustment
                int r1 = r1 - r0
                r2.adjustment = r1
                r2.offset = r3
                return
        }

        io.netty.buffer.ByteBuf slice() {
                r3 = this;
                io.netty.buffer.ByteBuf r0 = r3.slice
                if (r0 == 0) goto L5
                return r0
            L5:
                io.netty.buffer.ByteBuf r0 = r3.buf
                int r1 = r3.offset
                int r1 = r3.idx(r1)
                int r2 = r3.length()
                io.netty.buffer.ByteBuf r0 = r0.slice(r1, r2)
                r3.slice = r0
                return r0
        }

        void transferTo(io.netty.buffer.ByteBuf r4) {
                r3 = this;
                io.netty.buffer.ByteBuf r0 = r3.buf
                int r1 = r3.offset
                int r1 = r3.idx(r1)
                int r2 = r3.length()
                r4.writeBytes(r0, r1, r2)
                r3.free()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class CompositeByteBufIterator implements java.util.Iterator<io.netty.buffer.ByteBuf> {
        private int index;
        private final int size;
        final /* synthetic */ io.netty.buffer.CompositeByteBuf this$0;

        private CompositeByteBufIterator(io.netty.buffer.CompositeByteBuf r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                int r1 = r1.numComponents()
                r0.size = r1
                return
        }

        /* synthetic */ CompositeByteBufIterator(io.netty.buffer.CompositeByteBuf r1, io.netty.buffer.CompositeByteBuf.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.size
                int r1 = r2.index
                if (r0 <= r1) goto L8
                r0 = 1
                return r0
            L8:
                r0 = 0
                return r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public io.netty.buffer.ByteBuf next() {
                r3 = this;
                int r0 = r3.size
                io.netty.buffer.CompositeByteBuf r1 = r3.this$0
                int r1 = r1.numComponents()
                if (r0 != r1) goto L2f
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L29
                io.netty.buffer.CompositeByteBuf r0 = r3.this$0     // Catch: java.lang.IndexOutOfBoundsException -> L23
                io.netty.buffer.CompositeByteBuf$Component[] r0 = io.netty.buffer.CompositeByteBuf.access$200(r0)     // Catch: java.lang.IndexOutOfBoundsException -> L23
                int r1 = r3.index     // Catch: java.lang.IndexOutOfBoundsException -> L23
                int r2 = r1 + 1
                r3.index = r2     // Catch: java.lang.IndexOutOfBoundsException -> L23
                r0 = r0[r1]     // Catch: java.lang.IndexOutOfBoundsException -> L23
                io.netty.buffer.ByteBuf r0 = r0.slice()     // Catch: java.lang.IndexOutOfBoundsException -> L23
                return r0
            L23:
                java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
                r0.<init>()
                throw r0
            L29:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
            L2f:
                java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf next() {
                r1 = this;
                io.netty.buffer.ByteBuf r0 = r1.next()
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Read-Only"
                r0.<init>(r1)
                throw r0
        }
    }

    static {
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            java.nio.ByteBuffer r0 = r0.nioBuffer()
            io.netty.buffer.CompositeByteBuf.EMPTY_NIO_BUFFER = r0
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            java.util.Iterator r0 = r0.iterator()
            io.netty.buffer.CompositeByteBuf.EMPTY_ITERATOR = r0
            io.netty.buffer.CompositeByteBuf$1 r0 = new io.netty.buffer.CompositeByteBuf$1
            r0.<init>()
            io.netty.buffer.CompositeByteBuf.BYTE_ARRAY_WRAPPER = r0
            io.netty.buffer.CompositeByteBuf$2 r0 = new io.netty.buffer.CompositeByteBuf$2
            r0.<init>()
            io.netty.buffer.CompositeByteBuf.BYTE_BUFFER_WRAPPER = r0
            return
    }

    CompositeByteBuf(io.netty.buffer.ByteBufAllocator r2) {
            r1 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.<init>(r0)
            r1.alloc = r2
            r2 = 0
            r1.direct = r2
            r1.maxNumComponents = r2
            r2 = 0
            r1.components = r2
            return
    }

    public CompositeByteBuf(io.netty.buffer.ByteBufAllocator r2, boolean r3, int r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    private CompositeByteBuf(io.netty.buffer.ByteBufAllocator r2, boolean r3, int r4, int r5) {
            r1 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.<init>(r0)
            if (r2 == 0) goto L34
            r0 = 1
            if (r4 < r0) goto L18
            r1.alloc = r2
            r1.direct = r3
            r1.maxNumComponents = r4
            io.netty.buffer.CompositeByteBuf$Component[] r2 = newCompArray(r5, r4)
            r1.components = r2
            return
        L18:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "maxNumComponents: "
            r3.append(r5)
            r3.append(r4)
            java.lang.String r4 = " (expected: >= 1)"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L34:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "alloc"
            r2.<init>(r3)
            throw r2
    }

    <T> CompositeByteBuf(io.netty.buffer.ByteBufAllocator r2, boolean r3, int r4, io.netty.buffer.CompositeByteBuf.ByteWrapper<T> r5, T[] r6, int r7) {
            r1 = this;
            int r0 = r6.length
            int r0 = r0 - r7
            r1.<init>(r2, r3, r4, r0)
            r3 = 0
            r4 = 0
            r2 = r1
            r2.addComponents0(r3, r4, r5, r6, r7)
            r1.consolidateIfNeeded()
            int r4 = r1.capacity()
            r1.setIndex(r3, r4)
            return
    }

    public CompositeByteBuf(io.netty.buffer.ByteBufAllocator r3, boolean r4, int r5, java.lang.Iterable<io.netty.buffer.ByteBuf> r6) {
            r2 = this;
            boolean r0 = r6 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto Ld
            r0 = r6
            java.util.Collection r0 = (java.util.Collection) r0
            int r0 = r0.size()
            goto Le
        Ld:
            r0 = 0
        Le:
            r2.<init>(r3, r4, r5, r0)
            r2.addComponents(r1, r1, r6)
            int r3 = r2.capacity()
            r2.setIndex(r1, r3)
            return
    }

    public CompositeByteBuf(io.netty.buffer.ByteBufAllocator r7, boolean r8, int r9, io.netty.buffer.ByteBuf... r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    CompositeByteBuf(io.netty.buffer.ByteBufAllocator r2, boolean r3, int r4, io.netty.buffer.ByteBuf[] r5, int r6) {
            r1 = this;
            int r0 = r5.length
            int r0 = r0 - r6
            r1.<init>(r2, r3, r4, r0)
            r2 = 0
            r1.addComponents0(r2, r2, r5, r6)
            r1.consolidateIfNeeded()
            int r3 = r1.capacity()
            r1.setIndex0(r2, r3)
            return
    }

    static /* synthetic */ io.netty.buffer.CompositeByteBuf.Component[] access$200(io.netty.buffer.CompositeByteBuf r0) {
            io.netty.buffer.CompositeByteBuf$Component[] r0 = r0.components
            return r0
    }

    private void addComp(int r2, io.netty.buffer.CompositeByteBuf.Component r3) {
            r1 = this;
            r0 = 1
            r1.shiftComps(r2, r0)
            io.netty.buffer.CompositeByteBuf$Component[] r0 = r1.components
            r0[r2] = r3
            return
    }

    private int addComponent0(boolean r6, int r7, io.netty.buffer.ByteBuf r8) {
            r5 = this;
            r0 = 0
            r5.checkComponentIndex(r7)     // Catch: java.lang.Throwable -> L1b
            io.netty.buffer.CompositeByteBuf$Component r1 = r5.newComponent(r8, r0)     // Catch: java.lang.Throwable -> L1b
            int r2 = r1.length()     // Catch: java.lang.Throwable -> L1b
            r5.addComp(r7, r1)     // Catch: java.lang.Throwable -> L1b
            r0 = 1
            if (r2 <= 0) goto L1d
            int r3 = r5.componentCount     // Catch: java.lang.Throwable -> L1b
            int r3 = r3 - r0
            if (r7 >= r3) goto L1d
            r5.updateComponentOffsets(r7)     // Catch: java.lang.Throwable -> L1b
            goto L2a
        L1b:
            r6 = move-exception
            goto L32
        L1d:
            if (r7 <= 0) goto L2a
            io.netty.buffer.CompositeByteBuf$Component[] r3 = r5.components     // Catch: java.lang.Throwable -> L1b
            int r4 = r7 + (-1)
            r3 = r3[r4]     // Catch: java.lang.Throwable -> L1b
            int r3 = r3.endOffset     // Catch: java.lang.Throwable -> L1b
            r1.reposition(r3)     // Catch: java.lang.Throwable -> L1b
        L2a:
            if (r6 == 0) goto L31
            int r6 = r5.writerIndex     // Catch: java.lang.Throwable -> L1b
            int r6 = r6 + r2
            r5.writerIndex = r6     // Catch: java.lang.Throwable -> L1b
        L31:
            return r7
        L32:
            if (r0 != 0) goto L37
            r8.release()
        L37:
            throw r6
    }

    private io.netty.buffer.CompositeByteBuf addComponents(boolean r2, int r3, java.lang.Iterable<io.netty.buffer.ByteBuf> r4) {
            r1 = this;
            boolean r0 = r4 instanceof io.netty.buffer.ByteBuf
            if (r0 == 0) goto Lb
            io.netty.buffer.ByteBuf r4 = (io.netty.buffer.ByteBuf) r4
            io.netty.buffer.CompositeByteBuf r2 = r1.addComponent(r2, r3, r4)
            return r2
        Lb:
            java.lang.String r0 = "buffers"
            io.netty.util.internal.ObjectUtil.checkNotNull(r4, r0)
            java.util.Iterator r4 = r4.iterator()
            r1.checkComponentIndex(r3)     // Catch: java.lang.Throwable -> L33
        L17:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L35
            java.lang.Object r0 = r4.next()     // Catch: java.lang.Throwable -> L33
            io.netty.buffer.ByteBuf r0 = (io.netty.buffer.ByteBuf) r0     // Catch: java.lang.Throwable -> L33
            if (r0 != 0) goto L26
            goto L35
        L26:
            int r3 = r1.addComponent0(r2, r3, r0)     // Catch: java.lang.Throwable -> L33
            int r3 = r3 + 1
            int r0 = r1.componentCount     // Catch: java.lang.Throwable -> L33
            int r3 = java.lang.Math.min(r3, r0)     // Catch: java.lang.Throwable -> L33
            goto L17
        L33:
            r2 = move-exception
            goto L47
        L35:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L43
            java.lang.Object r2 = r4.next()
            io.netty.util.ReferenceCountUtil.safeRelease(r2)
            goto L35
        L43:
            r1.consolidateIfNeeded()
            return r1
        L47:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L55
            java.lang.Object r3 = r4.next()
            io.netty.util.ReferenceCountUtil.safeRelease(r3)
            goto L47
        L55:
            throw r2
    }

    private <T> int addComponents0(boolean r4, int r5, io.netty.buffer.CompositeByteBuf.ByteWrapper<T> r6, T[] r7, int r8) {
            r3 = this;
            r3.checkComponentIndex(r5)
            int r0 = r7.length
        L4:
            if (r8 >= r0) goto L23
            r1 = r7[r8]
            if (r1 != 0) goto Lb
            goto L23
        Lb:
            boolean r2 = r6.isEmpty(r1)
            if (r2 != 0) goto L20
            io.netty.buffer.ByteBuf r1 = r6.wrap(r1)
            int r5 = r3.addComponent0(r4, r5, r1)
            int r5 = r5 + 1
            int r1 = r3.componentCount
            if (r5 <= r1) goto L20
            r5 = r1
        L20:
            int r8 = r8 + 1
            goto L4
        L23:
            return r5
    }

    private io.netty.buffer.CompositeByteBuf addComponents0(boolean r7, int r8, io.netty.buffer.ByteBuf[] r9, int r10) {
            r6 = this;
            int r0 = r9.length
            int r1 = r0 - r10
            r2 = 2147483647(0x7fffffff, float:NaN)
            r6.checkComponentIndex(r8)     // Catch: java.lang.Throwable -> L17
            r6.shiftComps(r8, r1)     // Catch: java.lang.Throwable -> L17
            if (r8 <= 0) goto L19
            io.netty.buffer.CompositeByteBuf$Component[] r3 = r6.components     // Catch: java.lang.Throwable -> L17
            int r4 = r8 + (-1)
            r3 = r3[r4]     // Catch: java.lang.Throwable -> L17
            int r2 = r3.endOffset     // Catch: java.lang.Throwable -> L17
            goto L1a
        L17:
            r3 = move-exception
            goto L68
        L19:
            r2 = 0
        L1a:
            r3 = r8
        L1b:
            if (r10 >= r0) goto L36
            r4 = r9[r10]     // Catch: java.lang.Throwable -> L31
            if (r4 != 0) goto L22
            goto L36
        L22:
            io.netty.buffer.CompositeByteBuf$Component r2 = r6.newComponent(r4, r2)     // Catch: java.lang.Throwable -> L31
            io.netty.buffer.CompositeByteBuf$Component[] r4 = r6.components     // Catch: java.lang.Throwable -> L31
            r4[r3] = r2     // Catch: java.lang.Throwable -> L31
            int r2 = r2.endOffset     // Catch: java.lang.Throwable -> L31
            int r10 = r10 + 1
            int r3 = r3 + 1
            goto L1b
        L31:
            r2 = move-exception
            r5 = r3
            r3 = r2
            r2 = r5
            goto L68
        L36:
            int r2 = r6.componentCount
            if (r3 >= r2) goto L4d
            int r1 = r1 + r8
            if (r3 >= r1) goto L4a
            r6.removeCompRange(r3, r1)
        L40:
            if (r10 >= r0) goto L4a
            r1 = r9[r10]
            io.netty.util.ReferenceCountUtil.safeRelease(r1)
            int r10 = r10 + 1
            goto L40
        L4a:
            r6.updateComponentOffsets(r3)
        L4d:
            if (r7 == 0) goto L67
            if (r3 <= r8) goto L67
            int r7 = r6.componentCount
            if (r3 > r7) goto L67
            int r7 = r6.writerIndex
            io.netty.buffer.CompositeByteBuf$Component[] r9 = r6.components
            int r3 = r3 + (-1)
            r10 = r9[r3]
            int r10 = r10.endOffset
            r8 = r9[r8]
            int r8 = r8.offset
            int r10 = r10 - r8
            int r7 = r7 + r10
            r6.writerIndex = r7
        L67:
            return r6
        L68:
            int r4 = r6.componentCount
            if (r2 >= r4) goto L7f
            int r1 = r1 + r8
            if (r2 >= r1) goto L7c
            r6.removeCompRange(r2, r1)
        L72:
            if (r10 >= r0) goto L7c
            r1 = r9[r10]
            io.netty.util.ReferenceCountUtil.safeRelease(r1)
            int r10 = r10 + 1
            goto L72
        L7c:
            r6.updateComponentOffsets(r2)
        L7f:
            if (r7 == 0) goto L99
            if (r2 <= r8) goto L99
            int r7 = r6.componentCount
            if (r2 > r7) goto L99
            int r7 = r6.writerIndex
            io.netty.buffer.CompositeByteBuf$Component[] r9 = r6.components
            int r2 = r2 + (-1)
            r10 = r9[r2]
            int r10 = r10.endOffset
            r8 = r9[r8]
            int r8 = r8.offset
            int r10 = r10 - r8
            int r7 = r7 + r10
            r6.writerIndex = r7
        L99:
            throw r3
    }

    private io.netty.buffer.ByteBuf allocBuffer(int r2) {
            r1 = this;
            boolean r0 = r1.direct
            if (r0 == 0) goto Ld
            io.netty.buffer.ByteBufAllocator r0 = r1.alloc()
            io.netty.buffer.ByteBuf r2 = r0.directBuffer(r2)
            return r2
        Ld:
            io.netty.buffer.ByteBufAllocator r0 = r1.alloc()
            io.netty.buffer.ByteBuf r2 = r0.heapBuffer(r2)
            return r2
    }

    private void checkComponentIndex(int r5) {
            r4 = this;
            r4.ensureAccessible()
            if (r5 < 0) goto La
            int r0 = r4.componentCount
            if (r5 > r0) goto La
            return
        La:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r1 = r4.componentCount
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r1
            java.lang.String r5 = "cIndex: %d (expected: >= 0 && <= numComponents(%d))"
            java.lang.String r5 = java.lang.String.format(r5, r2)
            r0.<init>(r5)
            throw r0
    }

    private void checkComponentIndex(int r5, int r6) {
            r4 = this;
            r4.ensureAccessible()
            if (r5 < 0) goto Lc
            int r0 = r5 + r6
            int r1 = r4.componentCount
            if (r0 > r1) goto Lc
            return
        Lc:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            int r1 = r4.componentCount
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r6
            r5 = 2
            r2[r5] = r1
            java.lang.String r5 = "cIndex: %d, numComponents: %d (expected: cIndex >= 0 && cIndex + numComponents <= totalNumComponents(%d))"
            java.lang.String r5 = java.lang.String.format(r5, r2)
            r0.<init>(r5)
            throw r0
    }

    private void clearComps() {
            r2 = this;
            r0 = 0
            int r1 = r2.componentCount
            r2.removeCompRange(r0, r1)
            return
    }

    private void consolidateIfNeeded() {
            r9 = this;
            int r0 = r9.componentCount
            int r1 = r9.maxNumComponents
            if (r0 <= r1) goto L33
            io.netty.buffer.CompositeByteBuf$Component[] r1 = r9.components
            int r2 = r0 + (-1)
            r1 = r1[r2]
            int r6 = r1.endOffset
            io.netty.buffer.ByteBuf r3 = r9.allocBuffer(r6)
            r1 = 0
            r9.lastAccessed = r1
            r1 = 0
            r2 = 0
        L17:
            if (r2 >= r0) goto L23
            io.netty.buffer.CompositeByteBuf$Component[] r4 = r9.components
            r4 = r4[r2]
            r4.transferTo(r3)
            int r2 = r2 + 1
            goto L17
        L23:
            io.netty.buffer.CompositeByteBuf$Component[] r8 = r9.components
            io.netty.buffer.CompositeByteBuf$Component r2 = new io.netty.buffer.CompositeByteBuf$Component
            r4 = 0
            r5 = 0
            r7 = r3
            r2.<init>(r3, r4, r5, r6, r7)
            r8[r1] = r2
            r1 = 1
            r9.removeCompRange(r1, r0)
        L33:
            return
    }

    private void copyTo(int r5, int r6, int r7, io.netty.buffer.ByteBuf r8) {
            r4 = this;
            r0 = 0
        L1:
            if (r6 <= 0) goto L1d
            io.netty.buffer.CompositeByteBuf$Component[] r1 = r4.components
            r1 = r1[r7]
            int r2 = r1.endOffset
            int r2 = r2 - r5
            int r2 = java.lang.Math.min(r6, r2)
            io.netty.buffer.ByteBuf r3 = r1.buf
            int r1 = r1.idx(r5)
            r3.getBytes(r1, r8, r0, r2)
            int r5 = r5 + r2
            int r0 = r0 + r2
            int r6 = r6 - r2
            int r7 = r7 + 1
            goto L1
        L1d:
            int r5 = r8.capacity()
            r8.writerIndex(r5)
            return
    }

    private io.netty.buffer.CompositeByteBuf.Component findComponent(int r3) {
            r2 = this;
            io.netty.buffer.CompositeByteBuf$Component r0 = r2.lastAccessed
            if (r0 == 0) goto L10
            int r1 = r0.offset
            if (r3 < r1) goto L10
            int r1 = r0.endOffset
            if (r3 >= r1) goto L10
            r2.ensureAccessible()
            return r0
        L10:
            r2.checkIndex(r3)
            io.netty.buffer.CompositeByteBuf$Component r3 = r2.findIt(r3)
            return r3
    }

    private io.netty.buffer.CompositeByteBuf.Component findComponent0(int r3) {
            r2 = this;
            io.netty.buffer.CompositeByteBuf$Component r0 = r2.lastAccessed
            if (r0 == 0) goto Ld
            int r1 = r0.offset
            if (r3 < r1) goto Ld
            int r1 = r0.endOffset
            if (r3 >= r1) goto Ld
            return r0
        Ld:
            io.netty.buffer.CompositeByteBuf$Component r3 = r2.findIt(r3)
            return r3
    }

    private io.netty.buffer.CompositeByteBuf.Component findIt(int r6) {
            r5 = this;
            int r0 = r5.componentCount
            r1 = 0
        L3:
            if (r1 > r0) goto L20
            int r2 = r1 + r0
            int r2 = r2 >>> 1
            io.netty.buffer.CompositeByteBuf$Component[] r3 = r5.components
            r3 = r3[r2]
            int r4 = r3.endOffset
            if (r6 < r4) goto L15
            int r2 = r2 + 1
            r1 = r2
            goto L3
        L15:
            int r0 = r3.offset
            if (r6 >= r0) goto L1d
            int r2 = r2 + (-1)
            r0 = r2
            goto L3
        L1d:
            r5.lastAccessed = r3
            return r3
        L20:
            java.lang.Error r6 = new java.lang.Error
            java.lang.String r0 = "should not reach here"
            r6.<init>(r0)
            throw r6
    }

    private static io.netty.buffer.CompositeByteBuf.Component[] newCompArray(int r1, int r2) {
            r0 = 16
            int r2 = java.lang.Math.min(r0, r2)
            int r1 = java.lang.Math.max(r1, r2)
            io.netty.buffer.CompositeByteBuf$Component[] r1 = new io.netty.buffer.CompositeByteBuf.Component[r1]
            return r1
    }

    private io.netty.buffer.CompositeByteBuf.Component newComponent(io.netty.buffer.ByteBuf r9, int r10) {
            r8 = this;
            boolean r0 = io.netty.buffer.AbstractByteBuf.checkAccessible
            r1 = 0
            if (r0 == 0) goto L12
            boolean r0 = r9.isAccessible()
            if (r0 == 0) goto Lc
            goto L12
        Lc:
            io.netty.util.IllegalReferenceCountException r9 = new io.netty.util.IllegalReferenceCountException
            r9.<init>(r1)
            throw r9
        L12:
            int r0 = r9.readerIndex()
            int r6 = r9.readableBytes()
            boolean r2 = r9 instanceof io.netty.buffer.AbstractUnpooledSlicedByteBuf
            if (r2 == 0) goto L2e
            r2 = r9
            io.netty.buffer.AbstractUnpooledSlicedByteBuf r2 = (io.netty.buffer.AbstractUnpooledSlicedByteBuf) r2
            int r1 = r2.idx(r1)
            int r0 = r0 + r1
            io.netty.buffer.ByteBuf r1 = r9.unwrap()
        L2a:
            r7 = r9
            r4 = r0
            r9 = r1
            goto L40
        L2e:
            boolean r1 = r9 instanceof io.netty.buffer.PooledSlicedByteBuf
            if (r1 == 0) goto L3d
            r1 = r9
            io.netty.buffer.PooledSlicedByteBuf r1 = (io.netty.buffer.PooledSlicedByteBuf) r1
            int r1 = r1.adjustment
            int r0 = r0 + r1
            io.netty.buffer.ByteBuf r1 = r9.unwrap()
            goto L2a
        L3d:
            r1 = 0
            r4 = r0
            r7 = r1
        L40:
            io.netty.buffer.CompositeByteBuf$Component r2 = new io.netty.buffer.CompositeByteBuf$Component
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            io.netty.buffer.ByteBuf r3 = r9.order(r0)
            r5 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
    }

    private void removeComp(int r2) {
            r1 = this;
            int r0 = r2 + 1
            r1.removeCompRange(r2, r0)
            return
    }

    private void removeCompRange(int r4, int r5) {
            r3 = this;
            if (r4 < r5) goto L3
            return
        L3:
            int r0 = r3.componentCount
            if (r5 >= r0) goto Le
            io.netty.buffer.CompositeByteBuf$Component[] r1 = r3.components
            int r2 = r0 - r5
            java.lang.System.arraycopy(r1, r5, r1, r4, r2)
        Le:
            int r5 = r0 - r5
            int r5 = r5 + r4
            r4 = r5
        L12:
            if (r4 >= r0) goto L1c
            io.netty.buffer.CompositeByteBuf$Component[] r1 = r3.components
            r2 = 0
            r1[r4] = r2
            int r4 = r4 + 1
            goto L12
        L1c:
            r3.componentCount = r5
            return
    }

    private void shiftComps(int r6, int r7) {
            r5 = this;
            int r0 = r5.componentCount
            int r1 = r0 + r7
            io.netty.buffer.CompositeByteBuf$Component[] r2 = r5.components
            int r3 = r2.length
            if (r1 <= r3) goto L34
            int r2 = r0 >> 1
            int r2 = r2 + r0
            int r2 = java.lang.Math.max(r2, r1)
            if (r6 != r0) goto L1d
            io.netty.buffer.CompositeByteBuf$Component[] r6 = r5.components
            java.lang.Class<io.netty.buffer.CompositeByteBuf$Component[]> r7 = io.netty.buffer.CompositeByteBuf.Component[].class
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r2, r7)
            io.netty.buffer.CompositeByteBuf$Component[] r6 = (io.netty.buffer.CompositeByteBuf.Component[]) r6
            goto L31
        L1d:
            io.netty.buffer.CompositeByteBuf$Component[] r2 = new io.netty.buffer.CompositeByteBuf.Component[r2]
            if (r6 <= 0) goto L27
            io.netty.buffer.CompositeByteBuf$Component[] r3 = r5.components
            r4 = 0
            java.lang.System.arraycopy(r3, r4, r2, r4, r6)
        L27:
            if (r6 >= r0) goto L30
            io.netty.buffer.CompositeByteBuf$Component[] r3 = r5.components
            int r7 = r7 + r6
            int r0 = r0 - r6
            java.lang.System.arraycopy(r3, r6, r2, r7, r0)
        L30:
            r6 = r2
        L31:
            r5.components = r6
            goto L3b
        L34:
            if (r6 >= r0) goto L3b
            int r7 = r7 + r6
            int r0 = r0 - r6
            java.lang.System.arraycopy(r2, r6, r2, r7, r0)
        L3b:
            r5.componentCount = r1
            return
    }

    private int toComponentIndex0(int r7) {
            r6 = this;
            int r0 = r6.componentCount
            r1 = 0
            if (r7 != 0) goto L14
            r2 = 0
        L6:
            if (r2 >= r0) goto L14
            io.netty.buffer.CompositeByteBuf$Component[] r3 = r6.components
            r3 = r3[r2]
            int r3 = r3.endOffset
            if (r3 <= 0) goto L11
            return r2
        L11:
            int r2 = r2 + 1
            goto L6
        L14:
            r2 = 2
            r3 = 1
            if (r0 > r2) goto L25
            if (r0 == r3) goto L24
            io.netty.buffer.CompositeByteBuf$Component[] r0 = r6.components
            r0 = r0[r1]
            int r0 = r0.endOffset
            if (r7 >= r0) goto L23
            goto L24
        L23:
            return r3
        L24:
            return r1
        L25:
            if (r1 > r0) goto L3f
            int r2 = r1 + r0
            int r2 = r2 >>> r3
            io.netty.buffer.CompositeByteBuf$Component[] r4 = r6.components
            r4 = r4[r2]
            int r5 = r4.endOffset
            if (r7 < r5) goto L36
            int r2 = r2 + 1
            r1 = r2
            goto L25
        L36:
            int r0 = r4.offset
            if (r7 >= r0) goto L3e
            int r2 = r2 + (-1)
            r0 = r2
            goto L25
        L3e:
            return r2
        L3f:
            java.lang.Error r7 = new java.lang.Error
            java.lang.String r0 = "should not reach here"
            r7.<init>(r0)
            throw r7
    }

    private void updateComponentOffsets(int r4) {
            r3 = this;
            int r0 = r3.componentCount
            if (r0 > r4) goto L5
            goto L1f
        L5:
            if (r4 <= 0) goto L10
            io.netty.buffer.CompositeByteBuf$Component[] r1 = r3.components
            int r2 = r4 + (-1)
            r1 = r1[r2]
            int r1 = r1.endOffset
            goto L11
        L10:
            r1 = 0
        L11:
            if (r4 >= r0) goto L1f
            io.netty.buffer.CompositeByteBuf$Component[] r2 = r3.components
            r2 = r2[r4]
            r2.reposition(r1)
            int r1 = r2.endOffset
            int r4 = r4 + 1
            goto L11
        L1f:
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected byte _getByte(int r3) {
            r2 = this;
            io.netty.buffer.CompositeByteBuf$Component r0 = r2.findComponent0(r3)
            io.netty.buffer.ByteBuf r1 = r0.buf
            int r3 = r0.idx(r3)
            byte r3 = r1.getByte(r3)
            return r3
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected int _getInt(int r4) {
            r3 = this;
            io.netty.buffer.CompositeByteBuf$Component r0 = r3.findComponent0(r4)
            int r1 = r4 + 4
            int r2 = r0.endOffset
            if (r1 > r2) goto L15
            io.netty.buffer.ByteBuf r1 = r0.buf
            int r4 = r0.idx(r4)
            int r4 = r1.getInt(r4)
            return r4
        L15:
            java.nio.ByteOrder r0 = r3.order()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r2 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r1) goto L30
            short r0 = r3._getShort(r4)
            r0 = r0 & r2
            int r0 = r0 << 16
            int r4 = r4 + 2
            short r4 = r3._getShort(r4)
            r4 = r4 & r2
            r4 = r4 | r0
            return r4
        L30:
            short r0 = r3._getShort(r4)
            r0 = r0 & r2
            int r4 = r4 + 2
            short r4 = r3._getShort(r4)
            r4 = r4 & r2
            int r4 = r4 << 16
            r4 = r4 | r0
            return r4
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected int _getIntLE(int r4) {
            r3 = this;
            io.netty.buffer.CompositeByteBuf$Component r0 = r3.findComponent0(r4)
            int r1 = r4 + 4
            int r2 = r0.endOffset
            if (r1 > r2) goto L15
            io.netty.buffer.ByteBuf r1 = r0.buf
            int r4 = r0.idx(r4)
            int r4 = r1.getIntLE(r4)
            return r4
        L15:
            java.nio.ByteOrder r0 = r3.order()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r2 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r1) goto L30
            short r0 = r3._getShortLE(r4)
            r0 = r0 & r2
            int r4 = r4 + 2
            short r4 = r3._getShortLE(r4)
            r4 = r4 & r2
            int r4 = r4 << 16
            r4 = r4 | r0
            return r4
        L30:
            short r0 = r3._getShortLE(r4)
            r0 = r0 & r2
            int r0 = r0 << 16
            int r4 = r4 + 2
            short r4 = r3._getShortLE(r4)
            r4 = r4 & r2
            r4 = r4 | r0
            return r4
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected long _getLong(int r8) {
            r7 = this;
            io.netty.buffer.CompositeByteBuf$Component r0 = r7.findComponent0(r8)
            int r1 = r8 + 8
            int r2 = r0.endOffset
            if (r1 > r2) goto L15
            io.netty.buffer.ByteBuf r1 = r0.buf
            int r8 = r0.idx(r8)
            long r0 = r1.getLong(r8)
            return r0
        L15:
            java.nio.ByteOrder r0 = r7.order()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r2 = 32
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r0 != r1) goto L35
            int r0 = r7._getInt(r8)
            long r0 = (long) r0
            long r0 = r0 & r3
            long r0 = r0 << r2
            int r8 = r8 + 4
            int r8 = r7._getInt(r8)
            long r5 = (long) r8
            long r3 = r3 & r5
            long r0 = r0 | r3
            return r0
        L35:
            int r0 = r7._getInt(r8)
            long r0 = (long) r0
            long r0 = r0 & r3
            int r8 = r8 + 4
            int r8 = r7._getInt(r8)
            long r5 = (long) r8
            long r3 = r3 & r5
            long r2 = r3 << r2
            long r0 = r0 | r2
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected long _getLongLE(int r8) {
            r7 = this;
            io.netty.buffer.CompositeByteBuf$Component r0 = r7.findComponent0(r8)
            int r1 = r8 + 8
            int r2 = r0.endOffset
            if (r1 > r2) goto L15
            io.netty.buffer.ByteBuf r1 = r0.buf
            int r8 = r0.idx(r8)
            long r0 = r1.getLongLE(r8)
            return r0
        L15:
            java.nio.ByteOrder r0 = r7.order()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r2 = 32
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r0 != r1) goto L36
            int r0 = r7._getIntLE(r8)
            long r0 = (long) r0
            long r0 = r0 & r3
            int r8 = r8 + 4
            int r8 = r7._getIntLE(r8)
            long r5 = (long) r8
            long r3 = r3 & r5
            long r2 = r3 << r2
            long r0 = r0 | r2
            return r0
        L36:
            int r0 = r7._getIntLE(r8)
            long r0 = (long) r0
            long r0 = r0 & r3
            long r0 = r0 << r2
            int r8 = r8 + 4
            int r8 = r7._getIntLE(r8)
            long r5 = (long) r8
            long r3 = r3 & r5
            long r0 = r0 | r3
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected short _getShort(int r4) {
            r3 = this;
            io.netty.buffer.CompositeByteBuf$Component r0 = r3.findComponent0(r4)
            int r1 = r4 + 2
            int r2 = r0.endOffset
            if (r1 > r2) goto L15
            io.netty.buffer.ByteBuf r1 = r0.buf
            int r4 = r0.idx(r4)
            short r4 = r1.getShort(r4)
            return r4
        L15:
            java.nio.ByteOrder r0 = r3.order()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L30
            byte r0 = r3._getByte(r4)
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            int r4 = r4 + 1
            byte r4 = r3._getByte(r4)
            r4 = r4 & 255(0xff, float:3.57E-43)
            r4 = r4 | r0
            short r4 = (short) r4
            return r4
        L30:
            byte r0 = r3._getByte(r4)
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r4 = r4 + 1
            byte r4 = r3._getByte(r4)
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 8
            r4 = r4 | r0
            short r4 = (short) r4
            return r4
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected short _getShortLE(int r4) {
            r3 = this;
            io.netty.buffer.CompositeByteBuf$Component r0 = r3.findComponent0(r4)
            int r1 = r4 + 2
            int r2 = r0.endOffset
            if (r1 > r2) goto L15
            io.netty.buffer.ByteBuf r1 = r0.buf
            int r4 = r0.idx(r4)
            short r4 = r1.getShortLE(r4)
            return r4
        L15:
            java.nio.ByteOrder r0 = r3.order()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L30
            byte r0 = r3._getByte(r4)
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r4 = r4 + 1
            byte r4 = r3._getByte(r4)
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 8
            r4 = r4 | r0
            short r4 = (short) r4
            return r4
        L30:
            byte r0 = r3._getByte(r4)
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            int r4 = r4 + 1
            byte r4 = r3._getByte(r4)
            r4 = r4 & 255(0xff, float:3.57E-43)
            r4 = r4 | r0
            short r4 = (short) r4
            return r4
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected int _getUnsignedMedium(int r4) {
            r3 = this;
            io.netty.buffer.CompositeByteBuf$Component r0 = r3.findComponent0(r4)
            int r1 = r4 + 3
            int r2 = r0.endOffset
            if (r1 > r2) goto L15
            io.netty.buffer.ByteBuf r1 = r0.buf
            int r4 = r0.idx(r4)
            int r4 = r1.getUnsignedMedium(r4)
            return r4
        L15:
            java.nio.ByteOrder r0 = r3.order()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r2 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r1) goto L31
            short r0 = r3._getShort(r4)
            r0 = r0 & r2
            int r0 = r0 << 8
            int r4 = r4 + 2
            byte r4 = r3._getByte(r4)
            r4 = r4 & 255(0xff, float:3.57E-43)
            r4 = r4 | r0
            return r4
        L31:
            short r0 = r3._getShort(r4)
            r0 = r0 & r2
            int r4 = r4 + 2
            byte r4 = r3._getByte(r4)
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 16
            r4 = r4 | r0
            return r4
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected int _getUnsignedMediumLE(int r4) {
            r3 = this;
            io.netty.buffer.CompositeByteBuf$Component r0 = r3.findComponent0(r4)
            int r1 = r4 + 3
            int r2 = r0.endOffset
            if (r1 > r2) goto L15
            io.netty.buffer.ByteBuf r1 = r0.buf
            int r4 = r0.idx(r4)
            int r4 = r1.getUnsignedMediumLE(r4)
            return r4
        L15:
            java.nio.ByteOrder r0 = r3.order()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r2 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r1) goto L31
            short r0 = r3._getShortLE(r4)
            r0 = r0 & r2
            int r4 = r4 + 2
            byte r4 = r3._getByte(r4)
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 16
            r4 = r4 | r0
            return r4
        L31:
            short r0 = r3._getShortLE(r4)
            r0 = r0 & r2
            int r0 = r0 << 8
            int r4 = r4 + 2
            byte r4 = r3._getByte(r4)
            r4 = r4 & 255(0xff, float:3.57E-43)
            r4 = r4 | r0
            return r4
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setByte(int r3, int r4) {
            r2 = this;
            io.netty.buffer.CompositeByteBuf$Component r0 = r2.findComponent0(r3)
            io.netty.buffer.ByteBuf r1 = r0.buf
            int r3 = r0.idx(r3)
            r1.setByte(r3, r4)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setInt(int r4, int r5) {
            r3 = this;
            io.netty.buffer.CompositeByteBuf$Component r0 = r3.findComponent0(r4)
            int r1 = r4 + 4
            int r2 = r0.endOffset
            if (r1 > r2) goto L14
            io.netty.buffer.ByteBuf r1 = r0.buf
            int r4 = r0.idx(r4)
            r1.setInt(r4, r5)
            return
        L14:
            java.nio.ByteOrder r0 = r3.order()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L29
            int r0 = r5 >>> 16
            short r0 = (short) r0
            r3._setShort(r4, r0)
            int r4 = r4 + 2
            short r5 = (short) r5
            r3._setShort(r4, r5)
            return
        L29:
            short r0 = (short) r5
            r3._setShort(r4, r0)
            int r4 = r4 + 2
            int r5 = r5 >>> 16
            short r5 = (short) r5
            r3._setShort(r4, r5)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setIntLE(int r4, int r5) {
            r3 = this;
            io.netty.buffer.CompositeByteBuf$Component r0 = r3.findComponent0(r4)
            int r1 = r4 + 4
            int r2 = r0.endOffset
            if (r1 > r2) goto L14
            io.netty.buffer.ByteBuf r1 = r0.buf
            int r4 = r0.idx(r4)
            r1.setIntLE(r4, r5)
            return
        L14:
            java.nio.ByteOrder r0 = r3.order()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L29
            short r0 = (short) r5
            r3._setShortLE(r4, r0)
            int r4 = r4 + 2
            int r5 = r5 >>> 16
            short r5 = (short) r5
            r3._setShortLE(r4, r5)
            return
        L29:
            int r0 = r5 >>> 16
            short r0 = (short) r0
            r3._setShortLE(r4, r0)
            int r4 = r4 + 2
            short r5 = (short) r5
            r3._setShortLE(r4, r5)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setLong(int r4, long r5) {
            r3 = this;
            io.netty.buffer.CompositeByteBuf$Component r0 = r3.findComponent0(r4)
            int r1 = r4 + 8
            int r2 = r0.endOffset
            if (r1 > r2) goto L14
            io.netty.buffer.ByteBuf r1 = r0.buf
            int r4 = r0.idx(r4)
            r1.setLong(r4, r5)
            return
        L14:
            java.nio.ByteOrder r0 = r3.order()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r2 = 32
            if (r0 != r1) goto L2b
            long r0 = r5 >>> r2
            int r1 = (int) r0
            r3._setInt(r4, r1)
            int r4 = r4 + 4
            int r6 = (int) r5
            r3._setInt(r4, r6)
            return
        L2b:
            int r0 = (int) r5
            r3._setInt(r4, r0)
            int r4 = r4 + 4
            long r5 = r5 >>> r2
            int r6 = (int) r5
            r3._setInt(r4, r6)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setLongLE(int r4, long r5) {
            r3 = this;
            io.netty.buffer.CompositeByteBuf$Component r0 = r3.findComponent0(r4)
            int r1 = r4 + 8
            int r2 = r0.endOffset
            if (r1 > r2) goto L14
            io.netty.buffer.ByteBuf r1 = r0.buf
            int r4 = r0.idx(r4)
            r1.setLongLE(r4, r5)
            return
        L14:
            java.nio.ByteOrder r0 = r3.order()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r2 = 32
            if (r0 != r1) goto L2a
            int r0 = (int) r5
            r3._setIntLE(r4, r0)
            int r4 = r4 + 4
            long r5 = r5 >>> r2
            int r6 = (int) r5
            r3._setIntLE(r4, r6)
            return
        L2a:
            long r0 = r5 >>> r2
            int r1 = (int) r0
            r3._setIntLE(r4, r1)
            int r4 = r4 + 4
            int r6 = (int) r5
            r3._setIntLE(r4, r6)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setMedium(int r4, int r5) {
            r3 = this;
            io.netty.buffer.CompositeByteBuf$Component r0 = r3.findComponent0(r4)
            int r1 = r4 + 3
            int r2 = r0.endOffset
            if (r1 > r2) goto L14
            io.netty.buffer.ByteBuf r1 = r0.buf
            int r4 = r0.idx(r4)
            r1.setMedium(r4, r5)
            return
        L14:
            java.nio.ByteOrder r0 = r3.order()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L29
            int r0 = r5 >> 8
            short r0 = (short) r0
            r3._setShort(r4, r0)
            int r4 = r4 + 2
            byte r5 = (byte) r5
            r3._setByte(r4, r5)
            return
        L29:
            short r0 = (short) r5
            r3._setShort(r4, r0)
            int r4 = r4 + 2
            int r5 = r5 >>> 16
            byte r5 = (byte) r5
            r3._setByte(r4, r5)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setMediumLE(int r4, int r5) {
            r3 = this;
            io.netty.buffer.CompositeByteBuf$Component r0 = r3.findComponent0(r4)
            int r1 = r4 + 3
            int r2 = r0.endOffset
            if (r1 > r2) goto L14
            io.netty.buffer.ByteBuf r1 = r0.buf
            int r4 = r0.idx(r4)
            r1.setMediumLE(r4, r5)
            return
        L14:
            java.nio.ByteOrder r0 = r3.order()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L29
            short r0 = (short) r5
            r3._setShortLE(r4, r0)
            int r4 = r4 + 2
            int r5 = r5 >>> 16
            byte r5 = (byte) r5
            r3._setByte(r4, r5)
            return
        L29:
            int r0 = r5 >> 8
            short r0 = (short) r0
            r3._setShortLE(r4, r0)
            int r4 = r4 + 2
            byte r5 = (byte) r5
            r3._setByte(r4, r5)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setShort(int r4, int r5) {
            r3 = this;
            io.netty.buffer.CompositeByteBuf$Component r0 = r3.findComponent0(r4)
            int r1 = r4 + 2
            int r2 = r0.endOffset
            if (r1 > r2) goto L14
            io.netty.buffer.ByteBuf r1 = r0.buf
            int r4 = r0.idx(r4)
            r1.setShort(r4, r5)
            return
        L14:
            java.nio.ByteOrder r0 = r3.order()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L29
            int r0 = r5 >>> 8
            byte r0 = (byte) r0
            r3._setByte(r4, r0)
            int r4 = r4 + 1
            byte r5 = (byte) r5
            r3._setByte(r4, r5)
            return
        L29:
            byte r0 = (byte) r5
            r3._setByte(r4, r0)
            int r4 = r4 + 1
            int r5 = r5 >>> 8
            byte r5 = (byte) r5
            r3._setByte(r4, r5)
            return
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected void _setShortLE(int r4, int r5) {
            r3 = this;
            io.netty.buffer.CompositeByteBuf$Component r0 = r3.findComponent0(r4)
            int r1 = r4 + 2
            int r2 = r0.endOffset
            if (r1 > r2) goto L14
            io.netty.buffer.ByteBuf r1 = r0.buf
            int r4 = r0.idx(r4)
            r1.setShortLE(r4, r5)
            return
        L14:
            java.nio.ByteOrder r0 = r3.order()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L29
            byte r0 = (byte) r5
            r3._setByte(r4, r0)
            int r4 = r4 + 1
            int r5 = r5 >>> 8
            byte r5 = (byte) r5
            r3._setByte(r4, r5)
            return
        L29:
            int r0 = r5 >>> 8
            byte r0 = (byte) r0
            r3._setByte(r4, r0)
            int r4 = r4 + 1
            byte r5 = (byte) r5
            r3._setByte(r4, r5)
            return
    }

    public io.netty.buffer.CompositeByteBuf addComponent(int r2, io.netty.buffer.ByteBuf r3) {
            r1 = this;
            r0 = 0
            io.netty.buffer.CompositeByteBuf r2 = r1.addComponent(r0, r2, r3)
            return r2
    }

    public io.netty.buffer.CompositeByteBuf addComponent(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            r0 = 0
            io.netty.buffer.CompositeByteBuf r2 = r1.addComponent(r0, r2)
            return r2
    }

    public io.netty.buffer.CompositeByteBuf addComponent(boolean r2, int r3, io.netty.buffer.ByteBuf r4) {
            r1 = this;
            java.lang.String r0 = "buffer"
            io.netty.util.internal.ObjectUtil.checkNotNull(r4, r0)
            r1.addComponent0(r2, r3, r4)
            r1.consolidateIfNeeded()
            return r1
    }

    public io.netty.buffer.CompositeByteBuf addComponent(boolean r2, io.netty.buffer.ByteBuf r3) {
            r1 = this;
            int r0 = r1.componentCount
            io.netty.buffer.CompositeByteBuf r2 = r1.addComponent(r2, r0, r3)
            return r2
    }

    public io.netty.buffer.CompositeByteBuf addComponents(int r2, java.lang.Iterable<io.netty.buffer.ByteBuf> r3) {
            r1 = this;
            r0 = 0
            io.netty.buffer.CompositeByteBuf r2 = r1.addComponents(r0, r2, r3)
            return r2
    }

    public io.netty.buffer.CompositeByteBuf addComponents(int r2, io.netty.buffer.ByteBuf... r3) {
            r1 = this;
            java.lang.String r0 = "buffers"
            io.netty.util.internal.ObjectUtil.checkNotNull(r3, r0)
            r0 = 0
            r1.addComponents0(r0, r2, r3, r0)
            r1.consolidateIfNeeded()
            return r1
    }

    public io.netty.buffer.CompositeByteBuf addComponents(java.lang.Iterable<io.netty.buffer.ByteBuf> r2) {
            r1 = this;
            r0 = 0
            io.netty.buffer.CompositeByteBuf r2 = r1.addComponents(r0, r2)
            return r2
    }

    public io.netty.buffer.CompositeByteBuf addComponents(boolean r2, java.lang.Iterable<io.netty.buffer.ByteBuf> r3) {
            r1 = this;
            int r0 = r1.componentCount
            io.netty.buffer.CompositeByteBuf r2 = r1.addComponents(r2, r0, r3)
            return r2
    }

    public io.netty.buffer.CompositeByteBuf addComponents(boolean r3, io.netty.buffer.ByteBuf... r4) {
            r2 = this;
            java.lang.String r0 = "buffers"
            io.netty.util.internal.ObjectUtil.checkNotNull(r4, r0)
            int r0 = r2.componentCount
            r1 = 0
            r2.addComponents0(r3, r0, r4, r1)
            r2.consolidateIfNeeded()
            return r2
    }

    public io.netty.buffer.CompositeByteBuf addComponents(io.netty.buffer.ByteBuf... r2) {
            r1 = this;
            r0 = 0
            io.netty.buffer.CompositeByteBuf r2 = r1.addComponents(r0, r2)
            return r2
    }

    public io.netty.buffer.CompositeByteBuf addFlattenedComponents(boolean r18, io.netty.buffer.ByteBuf r19) {
            r17 = this;
            r1 = r17
            r2 = r18
            r0 = r19
            java.lang.String r3 = "buffer"
            io.netty.util.internal.ObjectUtil.checkNotNull(r0, r3)
            int r3 = r0.readerIndex()
            int r4 = r0.writerIndex()
            if (r3 != r4) goto L19
            r0.release()
            return r1
        L19:
            boolean r5 = r0 instanceof io.netty.buffer.CompositeByteBuf
            if (r5 != 0) goto L26
            int r3 = r1.componentCount
            r1.addComponent0(r2, r3, r0)
            r1.consolidateIfNeeded()
            return r1
        L26:
            r5 = r0
            io.netty.buffer.CompositeByteBuf r5 = (io.netty.buffer.CompositeByteBuf) r5
            int r6 = r4 - r3
            r5.checkIndex(r3, r6)
            io.netty.buffer.CompositeByteBuf$Component[] r7 = r5.components
            int r8 = r1.componentCount
            int r9 = r1.writerIndex
            int r5 = r5.toComponentIndex0(r3)     // Catch: java.lang.Throwable -> L6c
            int r10 = r1.capacity()     // Catch: java.lang.Throwable -> L6c
            r13 = r10
        L3d:
            r10 = r7[r5]     // Catch: java.lang.Throwable -> L6c
            int r11 = r10.offset     // Catch: java.lang.Throwable -> L6c
            int r11 = java.lang.Math.max(r3, r11)     // Catch: java.lang.Throwable -> L6c
            int r12 = r10.endOffset     // Catch: java.lang.Throwable -> L6c
            int r12 = java.lang.Math.min(r4, r12)     // Catch: java.lang.Throwable -> L6c
            int r14 = r12 - r11
            if (r14 <= 0) goto L6e
            int r15 = r1.componentCount     // Catch: java.lang.Throwable -> L6c
            io.netty.buffer.CompositeByteBuf$Component r16 = new io.netty.buffer.CompositeByteBuf$Component     // Catch: java.lang.Throwable -> L6c
            io.netty.buffer.ByteBuf r0 = r10.buf     // Catch: java.lang.Throwable -> L6c
            io.netty.buffer.ByteBuf r0 = r0.retain()     // Catch: java.lang.Throwable -> L6c
            int r10 = r10.idx(r11)     // Catch: java.lang.Throwable -> L6c
            r11 = r15
            r15 = 0
            r2 = r11
            r11 = r0
            r0 = r12
            r12 = r10
            r10 = r16
            r10.<init>(r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L6c
            r1.addComp(r2, r10)     // Catch: java.lang.Throwable -> L6c
            goto L6f
        L6c:
            r0 = move-exception
            goto L85
        L6e:
            r0 = r12
        L6f:
            if (r4 != r0) goto L7d
            if (r18 == 0) goto L76
            int r6 = r6 + r9
            r1.writerIndex = r6     // Catch: java.lang.Throwable -> L6c
        L76:
            r1.consolidateIfNeeded()     // Catch: java.lang.Throwable -> L6c
            r19.release()     // Catch: java.lang.Throwable -> L6c
            return r1
        L7d:
            int r13 = r13 + r14
            int r5 = r5 + 1
            r2 = r18
            r0 = r19
            goto L3d
        L85:
            if (r18 == 0) goto L89
            r1.writerIndex = r9
        L89:
            int r2 = r1.componentCount
            int r2 = r2 + (-1)
        L8d:
            if (r2 < r8) goto L9c
            io.netty.buffer.CompositeByteBuf$Component[] r3 = r1.components
            r3 = r3[r2]
            r3.free()
            r1.removeComp(r2)
            int r2 = r2 + (-1)
            goto L8d
        L9c:
            throw r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBufAllocator alloc() {
            r1 = this;
            io.netty.buffer.ByteBufAllocator r0 = r1.alloc
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public byte[] array() {
            r2 = this;
            int r0 = r2.componentCount
            if (r0 == 0) goto L19
            r1 = 1
            if (r0 != r1) goto L13
            io.netty.buffer.CompositeByteBuf$Component[] r0 = r2.components
            r1 = 0
            r0 = r0[r1]
            io.netty.buffer.ByteBuf r0 = r0.buf
            byte[] r0 = r0.array()
            return r0
        L13:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        L19:
            byte[] r0 = io.netty.util.internal.EmptyArrays.EMPTY_BYTES
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public int arrayOffset() {
            r3 = this;
            int r0 = r3.componentCount
            r1 = 0
            if (r0 == 0) goto L1d
            r2 = 1
            if (r0 != r2) goto L17
            io.netty.buffer.CompositeByteBuf$Component[] r0 = r3.components
            r0 = r0[r1]
            io.netty.buffer.ByteBuf r1 = r0.buf
            int r1 = r1.arrayOffset()
            int r0 = r0.idx(r1)
            return r0
        L17:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        L1d:
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int capacity() {
            r2 = this;
            int r0 = r2.componentCount
            if (r0 <= 0) goto Ld
            io.netty.buffer.CompositeByteBuf$Component[] r1 = r2.components
            int r0 = r0 + (-1)
            r0 = r1[r0]
            int r0 = r0.endOffset
            return r0
        Ld:
            r0 = 0
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf capacity(int r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.capacity(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf capacity(int r7) {
            r6 = this;
            r6.checkNewCapacity(r7)
            int r0 = r6.componentCount
            int r1 = r6.capacity()
            r2 = 0
            if (r7 <= r1) goto L22
            int r7 = r7 - r1
            io.netty.buffer.ByteBuf r1 = r6.allocBuffer(r7)
            io.netty.buffer.ByteBuf r7 = r1.setIndex(r2, r7)
            r6.addComponent0(r2, r0, r7)
            int r7 = r6.componentCount
            int r0 = r6.maxNumComponents
            if (r7 < r0) goto L69
            r6.consolidateIfNeeded()
            return r6
        L22:
            if (r7 >= r1) goto L69
            r3 = 0
            r6.lastAccessed = r3
            int r3 = r0 + (-1)
            int r1 = r1 - r7
        L2a:
            if (r3 < 0) goto L54
            io.netty.buffer.CompositeByteBuf$Component[] r4 = r6.components
            r4 = r4[r3]
            int r5 = r4.length()
            if (r1 >= r5) goto L4d
            int r5 = r4.endOffset
            int r5 = r5 - r1
            r4.endOffset = r5
            io.netty.buffer.ByteBuf r1 = io.netty.buffer.CompositeByteBuf.Component.access$100(r4)
            if (r1 == 0) goto L54
            int r5 = r4.length()
            io.netty.buffer.ByteBuf r1 = r1.slice(r2, r5)
            io.netty.buffer.CompositeByteBuf.Component.access$102(r4, r1)
            goto L54
        L4d:
            r4.free()
            int r1 = r1 - r5
            int r3 = r3 + (-1)
            goto L2a
        L54:
            int r3 = r3 + 1
            r6.removeCompRange(r3, r0)
            int r0 = r6.readerIndex()
            if (r0 <= r7) goto L63
            r6.setIndex0(r7, r7)
            return r6
        L63:
            int r0 = r6.writerIndex
            if (r0 <= r7) goto L69
            r6.writerIndex = r7
        L69:
            return r6
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf clear() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.clear()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf clear() {
            r0 = this;
            super.clear()
            return r0
    }

    public io.netty.buffer.ByteBuf component(int r2) {
            r1 = this;
            r1.checkComponentIndex(r2)
            io.netty.buffer.CompositeByteBuf$Component[] r0 = r1.components
            r2 = r0[r2]
            io.netty.buffer.ByteBuf r2 = r2.duplicate()
            return r2
    }

    public io.netty.buffer.ByteBuf componentAtOffset(int r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf$Component r1 = r0.findComponent(r1)
            io.netty.buffer.ByteBuf r1 = r1.duplicate()
            return r1
    }

    public io.netty.buffer.CompositeByteBuf consolidate() {
            r10 = this;
            r10.ensureAccessible()
            int r0 = r10.componentCount
            r1 = 1
            if (r0 > r1) goto L9
            return r10
        L9:
            io.netty.buffer.CompositeByteBuf$Component[] r2 = r10.components
            int r3 = r0 + (-1)
            r2 = r2[r3]
            int r7 = r2.endOffset
            io.netty.buffer.ByteBuf r4 = r10.allocBuffer(r7)
            r2 = 0
            r3 = 0
        L17:
            if (r3 >= r0) goto L23
            io.netty.buffer.CompositeByteBuf$Component[] r5 = r10.components
            r5 = r5[r3]
            r5.transferTo(r4)
            int r3 = r3 + 1
            goto L17
        L23:
            r3 = 0
            r10.lastAccessed = r3
            io.netty.buffer.CompositeByteBuf$Component[] r9 = r10.components
            io.netty.buffer.CompositeByteBuf$Component r3 = new io.netty.buffer.CompositeByteBuf$Component
            r5 = 0
            r6 = 0
            r8 = r4
            r3.<init>(r4, r5, r6, r7, r8)
            r9[r2] = r3
            r10.removeCompRange(r1, r0)
            return r10
    }

    public io.netty.buffer.CompositeByteBuf consolidate(int r9, int r10) {
            r8 = this;
            r8.checkComponentIndex(r9, r10)
            r0 = 1
            if (r10 > r0) goto L7
            return r8
        L7:
            int r10 = r10 + r9
            io.netty.buffer.CompositeByteBuf$Component[] r0 = r8.components
            int r1 = r10 + (-1)
            r1 = r0[r1]
            int r1 = r1.endOffset
            r0 = r0[r9]
            int r0 = r0.offset
            int r6 = r1 - r0
            io.netty.buffer.ByteBuf r3 = r8.allocBuffer(r6)
            r0 = r9
        L1b:
            if (r0 >= r10) goto L27
            io.netty.buffer.CompositeByteBuf$Component[] r1 = r8.components
            r1 = r1[r0]
            r1.transferTo(r3)
            int r0 = r0 + 1
            goto L1b
        L27:
            r0 = 0
            r8.lastAccessed = r0
            int r0 = r9 + 1
            r8.removeCompRange(r0, r10)
            io.netty.buffer.CompositeByteBuf$Component[] r10 = r8.components
            io.netty.buffer.CompositeByteBuf$Component r2 = new io.netty.buffer.CompositeByteBuf$Component
            r4 = 0
            r5 = 0
            r7 = r3
            r2.<init>(r3, r4, r5, r6, r7)
            r10[r9] = r2
            r8.updateComponentOffsets(r9)
            return r8
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf copy(int r3, int r4) {
            r2 = this;
            r2.checkIndex(r3, r4)
            io.netty.buffer.ByteBuf r0 = r2.allocBuffer(r4)
            if (r4 == 0) goto L10
            int r1 = r2.toComponentIndex0(r3)
            r2.copyTo(r3, r4, r1, r0)
        L10:
            return r0
    }

    @Override // io.netty.buffer.AbstractReferenceCountedByteBuf
    protected void deallocate() {
            r3 = this;
            boolean r0 = r3.freed
            if (r0 == 0) goto L5
            goto L17
        L5:
            r0 = 1
            r3.freed = r0
            int r0 = r3.componentCount
            r1 = 0
        Lb:
            if (r1 >= r0) goto L17
            io.netty.buffer.CompositeByteBuf$Component[] r2 = r3.components
            r2 = r2[r1]
            r2.free()
            int r1 = r1 + 1
            goto Lb
        L17:
            return
    }

    public java.util.List<io.netty.buffer.ByteBuf> decompose(int r5, int r6) {
            r4 = this;
            r4.checkIndex(r5, r6)
            if (r6 != 0) goto L8
            java.util.List r5 = java.util.Collections.EMPTY_LIST
            return r5
        L8:
            int r0 = r4.toComponentIndex0(r5)
            io.netty.buffer.CompositeByteBuf$Component[] r1 = r4.components
            r1 = r1[r0]
            io.netty.buffer.ByteBuf r2 = r1.buf
            int r3 = r1.idx(r5)
            int r1 = r1.endOffset
            int r1 = r1 - r5
            int r5 = java.lang.Math.min(r1, r6)
            io.netty.buffer.ByteBuf r5 = r2.slice(r3, r5)
            int r1 = r5.readableBytes()
            int r6 = r6 - r1
            if (r6 != 0) goto L2d
            java.util.List r5 = java.util.Collections.singletonList(r5)
            return r5
        L2d:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r4.componentCount
            int r2 = r2 - r0
            r1.<init>(r2)
            r1.add(r5)
        L38:
            io.netty.buffer.CompositeByteBuf$Component[] r5 = r4.components
            int r0 = r0 + 1
            r5 = r5[r0]
            io.netty.buffer.ByteBuf r2 = r5.buf
            int r3 = r5.offset
            int r3 = r5.idx(r3)
            int r5 = r5.length()
            int r5 = java.lang.Math.min(r5, r6)
            io.netty.buffer.ByteBuf r5 = r2.slice(r3, r5)
            int r2 = r5.readableBytes()
            int r6 = r6 - r2
            r1.add(r5)
            if (r6 > 0) goto L38
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf discardReadBytes() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.discardReadBytes()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf discardReadBytes() {
            r9 = this;
            r9.ensureAccessible()
            int r0 = r9.readerIndex()
            if (r0 != 0) goto La
            return r9
        La:
            int r1 = r9.writerIndex()
            r2 = 0
            r3 = 0
            if (r0 != r1) goto L33
            int r4 = r9.capacity()
            if (r1 != r4) goto L33
            int r1 = r9.componentCount
            r4 = 0
        L1b:
            if (r4 >= r1) goto L27
            io.netty.buffer.CompositeByteBuf$Component[] r5 = r9.components
            r5 = r5[r4]
            r5.free()
            int r4 = r4 + 1
            goto L1b
        L27:
            r9.lastAccessed = r2
            r9.clearComps()
            r9.setIndex(r3, r3)
            r9.adjustMarkers(r0)
            return r9
        L33:
            int r4 = r9.componentCount
            r6 = r2
            r5 = 0
        L37:
            if (r5 >= r4) goto L48
            io.netty.buffer.CompositeByteBuf$Component[] r6 = r9.components
            r6 = r6[r5]
            int r7 = r6.endOffset
            if (r7 <= r0) goto L42
            goto L48
        L42:
            r6.free()
            int r5 = r5 + 1
            goto L37
        L48:
            int r4 = r6.offset
            int r4 = r0 - r4
            r6.offset = r3
            int r7 = r6.endOffset
            int r7 = r7 - r0
            r6.endOffset = r7
            int r7 = r6.adjustment
            int r7 = r7 + r0
            r6.adjustment = r7
            io.netty.buffer.ByteBuf r7 = io.netty.buffer.CompositeByteBuf.Component.access$100(r6)
            if (r7 == 0) goto L69
            int r8 = r6.length()
            io.netty.buffer.ByteBuf r4 = r7.slice(r4, r8)
            io.netty.buffer.CompositeByteBuf.Component.access$102(r6, r4)
        L69:
            io.netty.buffer.CompositeByteBuf$Component r4 = r9.lastAccessed
            if (r4 == 0) goto L73
            int r4 = r4.endOffset
            if (r4 > r0) goto L73
            r9.lastAccessed = r2
        L73:
            r9.removeCompRange(r3, r5)
            r9.updateComponentOffsets(r3)
            int r1 = r1 - r0
            r9.setIndex(r3, r1)
            r9.adjustMarkers(r0)
            return r9
    }

    public io.netty.buffer.CompositeByteBuf discardReadComponents() {
            r8 = this;
            r8.ensureAccessible()
            int r0 = r8.readerIndex()
            if (r0 != 0) goto La
            goto L4a
        La:
            int r1 = r8.writerIndex()
            r2 = 0
            r3 = 0
            if (r0 != r1) goto L33
            int r4 = r8.capacity()
            if (r1 != r4) goto L33
            int r1 = r8.componentCount
            r4 = 0
        L1b:
            if (r4 >= r1) goto L27
            io.netty.buffer.CompositeByteBuf$Component[] r5 = r8.components
            r5 = r5[r4]
            r5.free()
            int r4 = r4 + 1
            goto L1b
        L27:
            r8.lastAccessed = r2
            r8.clearComps()
            r8.setIndex(r3, r3)
            r8.adjustMarkers(r0)
            return r8
        L33:
            int r4 = r8.componentCount
            r6 = r2
            r5 = 0
        L37:
            if (r5 >= r4) goto L48
            io.netty.buffer.CompositeByteBuf$Component[] r6 = r8.components
            r6 = r6[r5]
            int r7 = r6.endOffset
            if (r7 <= r0) goto L42
            goto L48
        L42:
            r6.free()
            int r5 = r5 + 1
            goto L37
        L48:
            if (r5 != 0) goto L4b
        L4a:
            return r8
        L4b:
            io.netty.buffer.CompositeByteBuf$Component r4 = r8.lastAccessed
            if (r4 == 0) goto L55
            int r4 = r4.endOffset
            if (r4 > r0) goto L55
            r8.lastAccessed = r2
        L55:
            r8.removeCompRange(r3, r5)
            int r2 = r6.offset
            r8.updateComponentOffsets(r3)
            int r0 = r0 - r2
            int r1 = r1 - r2
            r8.setIndex(r0, r1)
            r8.adjustMarkers(r2)
            return r8
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf discardSomeReadBytes() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.discardSomeReadBytes()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf discardSomeReadBytes() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.discardReadComponents()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf ensureWritable(int r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.ensureWritable(r1)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf ensureWritable(int r1) {
            r0 = this;
            super.ensureWritable(r1)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected int forEachByteAsc0(int r8, int r9, io.netty.util.ByteProcessor r10) throws java.lang.Exception {
            r7 = this;
            r0 = -1
            if (r9 > r8) goto L4
            return r0
        L4:
            int r1 = r7.toComponentIndex0(r8)
            int r9 = r9 - r8
        L9:
            if (r9 <= 0) goto L3f
            io.netty.buffer.CompositeByteBuf$Component[] r2 = r7.components
            r2 = r2[r1]
            int r3 = r2.offset
            int r4 = r2.endOffset
            if (r3 != r4) goto L16
            goto L3c
        L16:
            io.netty.buffer.ByteBuf r3 = r2.buf
            int r4 = r2.idx(r8)
            int r5 = r2.endOffset
            int r5 = r5 - r8
            int r5 = java.lang.Math.min(r9, r5)
            boolean r6 = r3 instanceof io.netty.buffer.AbstractByteBuf
            if (r6 == 0) goto L30
            io.netty.buffer.AbstractByteBuf r3 = (io.netty.buffer.AbstractByteBuf) r3
            int r6 = r4 + r5
            int r3 = r3.forEachByteAsc0(r4, r6, r10)
            goto L34
        L30:
            int r3 = r3.forEachByte(r4, r5, r10)
        L34:
            if (r3 == r0) goto L3a
            int r8 = r2.adjustment
            int r3 = r3 - r8
            return r3
        L3a:
            int r8 = r8 + r5
            int r9 = r9 - r5
        L3c:
            int r1 = r1 + 1
            goto L9
        L3f:
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf
    protected int forEachByteDesc0(int r9, int r10, io.netty.util.ByteProcessor r11) throws java.lang.Exception {
            r8 = this;
            r0 = -1
            if (r10 <= r9) goto L4
            return r0
        L4:
            int r1 = r8.toComponentIndex0(r9)
            int r9 = r9 + 1
            int r9 = r9 - r10
        Lb:
            if (r9 <= 0) goto L41
            io.netty.buffer.CompositeByteBuf$Component[] r2 = r8.components
            r2 = r2[r1]
            int r3 = r2.offset
            int r4 = r2.endOffset
            if (r3 != r4) goto L18
            goto L3e
        L18:
            io.netty.buffer.ByteBuf r3 = r2.buf
            int r4 = r9 + r10
            int r4 = r2.idx(r4)
            int r5 = java.lang.Math.min(r9, r4)
            int r6 = r4 - r5
            boolean r7 = r3 instanceof io.netty.buffer.AbstractByteBuf
            if (r7 == 0) goto L33
            io.netty.buffer.AbstractByteBuf r3 = (io.netty.buffer.AbstractByteBuf) r3
            int r4 = r4 + (-1)
            int r3 = r3.forEachByteDesc0(r4, r6, r11)
            goto L37
        L33:
            int r3 = r3.forEachByteDesc(r6, r5, r11)
        L37:
            if (r3 == r0) goto L3d
            int r9 = r2.adjustment
            int r3 = r3 - r9
            return r3
        L3d:
            int r9 = r9 - r5
        L3e:
            int r1 = r1 + (-1)
            goto Lb
        L41:
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public byte getByte(int r3) {
            r2 = this;
            io.netty.buffer.CompositeByteBuf$Component r0 = r2.findComponent(r3)
            io.netty.buffer.ByteBuf r1 = r0.buf
            int r3 = r0.idx(r3)
            byte r3 = r1.getByte(r3)
            return r3
    }

    @Override // io.netty.buffer.ByteBuf
    public int getBytes(int r7, java.nio.channels.FileChannel r8, long r9, int r11) throws java.io.IOException {
            r6 = this;
            int r0 = r6.nioBufferCount()
            r1 = 1
            if (r0 != r1) goto L10
            java.nio.ByteBuffer r7 = r6.internalNioBuffer(r7, r11)
            int r7 = r8.write(r7, r9)
            return r7
        L10:
            java.nio.ByteBuffer[] r7 = r6.nioBuffers(r7, r11)
            int r11 = r7.length
            r0 = 0
            r2 = 0
        L18:
            if (r2 >= r11) goto L27
            r3 = r7[r2]
            long r4 = r9 + r0
            int r3 = r8.write(r3, r4)
            long r3 = (long) r3
            long r0 = r0 + r3
            int r2 = r2 + 1
            goto L18
        L27:
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r9 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r9 <= 0) goto L32
            r7 = 2147483647(0x7fffffff, float:NaN)
            return r7
        L32:
            int r7 = (int) r0
            return r7
    }

    @Override // io.netty.buffer.ByteBuf
    public int getBytes(int r3, java.nio.channels.GatheringByteChannel r4, int r5) throws java.io.IOException {
            r2 = this;
            int r0 = r2.nioBufferCount()
            r1 = 1
            if (r0 != r1) goto L10
            java.nio.ByteBuffer r3 = r2.internalNioBuffer(r3, r5)
            int r3 = r4.write(r3)
            return r3
        L10:
            java.nio.ByteBuffer[] r3 = r2.nioBuffers(r3, r5)
            long r3 = r4.write(r3)
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 <= 0) goto L23
            r3 = 2147483647(0x7fffffff, float:NaN)
            return r3
        L23:
            int r4 = (int) r3
            return r4
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf getBytes(int r1, io.netty.buffer.ByteBuf r2) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.getBytes(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf getBytes(int r1, io.netty.buffer.ByteBuf r2, int r3) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.getBytes(r1, r2, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf getBytes(int r1, io.netty.buffer.ByteBuf r2, int r3, int r4) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.getBytes(r1, r2, r3, r4)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf getBytes(int r1, java.io.OutputStream r2, int r3) throws java.io.IOException {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.getBytes(r1, r2, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf getBytes(int r1, java.nio.ByteBuffer r2) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.getBytes(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf getBytes(int r1, byte[] r2) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.getBytes(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf getBytes(int r1, byte[] r2, int r3, int r4) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.getBytes(r1, r2, r3, r4)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf getBytes(int r2, io.netty.buffer.ByteBuf r3) {
            r1 = this;
            int r0 = r3.writableBytes()
            io.netty.buffer.CompositeByteBuf r2 = r1.getBytes(r2, r3, r0)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf getBytes(int r2, io.netty.buffer.ByteBuf r3, int r4) {
            r1 = this;
            int r0 = r3.writerIndex()
            r1.getBytes(r2, r3, r0, r4)
            int r2 = r3.writerIndex()
            int r2 = r2 + r4
            r3.writerIndex(r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf getBytes(int r5, io.netty.buffer.ByteBuf r6, int r7, int r8) {
            r4 = this;
            int r0 = r6.capacity()
            r4.checkDstIndex(r5, r8, r7, r0)
            if (r8 != 0) goto La
            goto L2a
        La:
            int r0 = r4.toComponentIndex0(r5)
        Le:
            if (r8 <= 0) goto L2a
            io.netty.buffer.CompositeByteBuf$Component[] r1 = r4.components
            r1 = r1[r0]
            int r2 = r1.endOffset
            int r2 = r2 - r5
            int r2 = java.lang.Math.min(r8, r2)
            io.netty.buffer.ByteBuf r3 = r1.buf
            int r1 = r1.idx(r5)
            r3.getBytes(r1, r6, r7, r2)
            int r5 = r5 + r2
            int r7 = r7 + r2
            int r8 = r8 - r2
            int r0 = r0 + 1
            goto Le
        L2a:
            return r4
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf getBytes(int r5, java.io.OutputStream r6, int r7) throws java.io.IOException {
            r4 = this;
            r4.checkIndex(r5, r7)
            if (r7 != 0) goto L6
            goto L25
        L6:
            int r0 = r4.toComponentIndex0(r5)
        La:
            if (r7 <= 0) goto L25
            io.netty.buffer.CompositeByteBuf$Component[] r1 = r4.components
            r1 = r1[r0]
            int r2 = r1.endOffset
            int r2 = r2 - r5
            int r2 = java.lang.Math.min(r7, r2)
            io.netty.buffer.ByteBuf r3 = r1.buf
            int r1 = r1.idx(r5)
            r3.getBytes(r1, r6, r2)
            int r5 = r5 + r2
            int r7 = r7 - r2
            int r0 = r0 + 1
            goto La
        L25:
            return r4
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf getBytes(int r7, java.nio.ByteBuffer r8) {
            r6 = this;
            int r0 = r8.limit()
            int r1 = r8.remaining()
            r6.checkIndex(r7, r1)
            if (r1 != 0) goto Le
            return r6
        Le:
            int r2 = r6.toComponentIndex0(r7)
        L12:
            if (r1 <= 0) goto L3a
            io.netty.buffer.CompositeByteBuf$Component[] r3 = r6.components     // Catch: java.lang.Throwable -> L35
            r3 = r3[r2]     // Catch: java.lang.Throwable -> L35
            int r4 = r3.endOffset     // Catch: java.lang.Throwable -> L35
            int r4 = r4 - r7
            int r4 = java.lang.Math.min(r1, r4)     // Catch: java.lang.Throwable -> L35
            int r5 = r8.position()     // Catch: java.lang.Throwable -> L35
            int r5 = r5 + r4
            r8.limit(r5)     // Catch: java.lang.Throwable -> L35
            io.netty.buffer.ByteBuf r5 = r3.buf     // Catch: java.lang.Throwable -> L35
            int r3 = r3.idx(r7)     // Catch: java.lang.Throwable -> L35
            r5.getBytes(r3, r8)     // Catch: java.lang.Throwable -> L35
            int r7 = r7 + r4
            int r1 = r1 - r4
            int r2 = r2 + 1
            goto L12
        L35:
            r7 = move-exception
            r8.limit(r0)
            throw r7
        L3a:
            r8.limit(r0)
            return r6
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf getBytes(int r3, byte[] r4) {
            r2 = this;
            r0 = 0
            int r1 = r4.length
            io.netty.buffer.CompositeByteBuf r3 = r2.getBytes(r3, r4, r0, r1)
            return r3
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf getBytes(int r5, byte[] r6, int r7, int r8) {
            r4 = this;
            int r0 = r6.length
            r4.checkDstIndex(r5, r8, r7, r0)
            if (r8 != 0) goto L7
            goto L27
        L7:
            int r0 = r4.toComponentIndex0(r5)
        Lb:
            if (r8 <= 0) goto L27
            io.netty.buffer.CompositeByteBuf$Component[] r1 = r4.components
            r1 = r1[r0]
            int r2 = r1.endOffset
            int r2 = r2 - r5
            int r2 = java.lang.Math.min(r8, r2)
            io.netty.buffer.ByteBuf r3 = r1.buf
            int r1 = r1.idx(r5)
            r3.getBytes(r1, r6, r7, r2)
            int r5 = r5 + r2
            int r7 = r7 + r2
            int r8 = r8 - r2
            int r0 = r0 + 1
            goto Lb
        L27:
            return r4
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean hasArray() {
            r3 = this;
            int r0 = r3.componentCount
            r1 = 1
            if (r0 == 0) goto L14
            r2 = 0
            if (r0 == r1) goto L9
            return r2
        L9:
            io.netty.buffer.CompositeByteBuf$Component[] r0 = r3.components
            r0 = r0[r2]
            io.netty.buffer.ByteBuf r0 = r0.buf
            boolean r0 = r0.hasArray()
            return r0
        L14:
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean hasMemoryAddress() {
            r3 = this;
            int r0 = r3.componentCount
            if (r0 == 0) goto L14
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L9
            return r2
        L9:
            io.netty.buffer.CompositeByteBuf$Component[] r0 = r3.components
            r0 = r0[r2]
            io.netty.buffer.ByteBuf r0 = r0.buf
            boolean r0 = r0.hasMemoryAddress()
            return r0
        L14:
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            boolean r0 = r0.hasMemoryAddress()
            return r0
    }

    public io.netty.buffer.ByteBuf internalComponent(int r2) {
            r1 = this;
            r1.checkComponentIndex(r2)
            io.netty.buffer.CompositeByteBuf$Component[] r0 = r1.components
            r2 = r0[r2]
            io.netty.buffer.ByteBuf r2 = r2.slice()
            return r2
    }

    public io.netty.buffer.ByteBuf internalComponentAtOffset(int r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf$Component r1 = r0.findComponent(r1)
            io.netty.buffer.ByteBuf r1 = r1.slice()
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public java.nio.ByteBuffer internalNioBuffer(int r3, int r4) {
            r2 = this;
            int r0 = r2.componentCount
            if (r0 == 0) goto L17
            r1 = 1
            if (r0 != r1) goto L11
            io.netty.buffer.CompositeByteBuf$Component[] r0 = r2.components
            r1 = 0
            r0 = r0[r1]
            java.nio.ByteBuffer r3 = r0.internalNioBuffer(r3, r4)
            return r3
        L11:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            r3.<init>()
            throw r3
        L17:
            java.nio.ByteBuffer r3 = io.netty.buffer.CompositeByteBuf.EMPTY_NIO_BUFFER
            return r3
    }

    @Override // io.netty.buffer.AbstractReferenceCountedByteBuf, io.netty.buffer.ByteBuf
    boolean isAccessible() {
            r1 = this;
            boolean r0 = r1.freed
            r0 = r0 ^ 1
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public boolean isDirect() {
            r4 = this;
            int r0 = r4.componentCount
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r2 = 0
        L7:
            if (r2 >= r0) goto L19
            io.netty.buffer.CompositeByteBuf$Component[] r3 = r4.components
            r3 = r3[r2]
            io.netty.buffer.ByteBuf r3 = r3.buf
            boolean r3 = r3.isDirect()
            if (r3 != 0) goto L16
            return r1
        L16:
            int r2 = r2 + 1
            goto L7
        L19:
            r0 = 1
            return r0
    }

    public java.util.Iterator<io.netty.buffer.ByteBuf> iterator() {
            r2 = this;
            r2.ensureAccessible()
            int r0 = r2.componentCount
            if (r0 != 0) goto La
            java.util.Iterator<io.netty.buffer.ByteBuf> r0 = io.netty.buffer.CompositeByteBuf.EMPTY_ITERATOR
            return r0
        La:
            io.netty.buffer.CompositeByteBuf$CompositeByteBufIterator r0 = new io.netty.buffer.CompositeByteBuf$CompositeByteBufIterator
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf markReaderIndex() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.markReaderIndex()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf markReaderIndex() {
            r0 = this;
            super.markReaderIndex()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf markWriterIndex() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.markWriterIndex()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf markWriterIndex() {
            r0 = this;
            super.markWriterIndex()
            return r0
    }

    public int maxNumComponents() {
            r1 = this;
            int r0 = r1.maxNumComponents
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public long memoryAddress() {
            r5 = this;
            int r0 = r5.componentCount
            if (r0 == 0) goto L1d
            r1 = 1
            if (r0 != r1) goto L17
            io.netty.buffer.CompositeByteBuf$Component[] r0 = r5.components
            r1 = 0
            r0 = r0[r1]
            io.netty.buffer.ByteBuf r1 = r0.buf
            long r1 = r1.memoryAddress()
            int r0 = r0.adjustment
            long r3 = (long) r0
            long r1 = r1 + r3
            return r1
        L17:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        L1d:
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            long r0 = r0.memoryAddress()
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public java.nio.ByteBuffer nioBuffer(int r6, int r7) {
            r5 = this;
            r5.checkIndex(r6, r7)
            int r0 = r5.componentCount
            if (r0 == 0) goto L46
            r1 = 0
            r2 = 1
            if (r0 == r2) goto Lc
            goto L21
        Lc:
            io.netty.buffer.CompositeByteBuf$Component[] r0 = r5.components
            r0 = r0[r1]
            io.netty.buffer.ByteBuf r3 = r0.buf
            int r4 = r3.nioBufferCount()
            if (r4 != r2) goto L21
            int r6 = r0.idx(r6)
            java.nio.ByteBuffer r6 = r3.nioBuffer(r6, r7)
            return r6
        L21:
            java.nio.ByteBuffer[] r6 = r5.nioBuffers(r6, r7)
            int r0 = r6.length
            if (r0 != r2) goto L2b
            r6 = r6[r1]
            return r6
        L2b:
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocate(r7)
            java.nio.ByteOrder r0 = r5.order()
            java.nio.ByteBuffer r7 = r7.order(r0)
            int r0 = r6.length
        L38:
            if (r1 >= r0) goto L42
            r2 = r6[r1]
            r7.put(r2)
            int r1 = r1 + 1
            goto L38
        L42:
            r7.flip()
            return r7
        L46:
            java.nio.ByteBuffer r6 = io.netty.buffer.CompositeByteBuf.EMPTY_NIO_BUFFER
            return r6
    }

    @Override // io.netty.buffer.ByteBuf
    public int nioBufferCount() {
            r4 = this;
            int r0 = r4.componentCount
            r1 = 1
            if (r0 == 0) goto L25
            r2 = 0
            if (r0 == r1) goto L1a
            r1 = 0
        L9:
            if (r2 >= r0) goto L19
            io.netty.buffer.CompositeByteBuf$Component[] r3 = r4.components
            r3 = r3[r2]
            io.netty.buffer.ByteBuf r3 = r3.buf
            int r3 = r3.nioBufferCount()
            int r1 = r1 + r3
            int r2 = r2 + 1
            goto L9
        L19:
            return r1
        L1a:
            io.netty.buffer.CompositeByteBuf$Component[] r0 = r4.components
            r0 = r0[r2]
            io.netty.buffer.ByteBuf r0 = r0.buf
            int r0 = r0.nioBufferCount()
            return r0
        L25:
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public java.nio.ByteBuffer[] nioBuffers() {
            r2 = this;
            int r0 = r2.readerIndex()
            int r1 = r2.readableBytes()
            java.nio.ByteBuffer[] r0 = r2.nioBuffers(r0, r1)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public java.nio.ByteBuffer[] nioBuffers(int r9, int r10) {
            r8 = this;
            r8.checkIndex(r9, r10)
            r0 = 0
            r1 = 1
            if (r10 != 0) goto Le
            java.nio.ByteBuffer[] r9 = new java.nio.ByteBuffer[r1]
            java.nio.ByteBuffer r10 = io.netty.buffer.CompositeByteBuf.EMPTY_NIO_BUFFER
            r9[r0] = r10
            return r9
        Le:
            int r2 = r8.componentCount
            io.netty.util.internal.RecyclableArrayList r2 = io.netty.util.internal.RecyclableArrayList.newInstance(r2)
            int r3 = r8.toComponentIndex0(r9)     // Catch: java.lang.Throwable -> L3b
        L18:
            if (r10 <= 0) goto L53
            io.netty.buffer.CompositeByteBuf$Component[] r4 = r8.components     // Catch: java.lang.Throwable -> L3b
            r4 = r4[r3]     // Catch: java.lang.Throwable -> L3b
            io.netty.buffer.ByteBuf r5 = r4.buf     // Catch: java.lang.Throwable -> L3b
            int r6 = r4.endOffset     // Catch: java.lang.Throwable -> L3b
            int r6 = r6 - r9
            int r6 = java.lang.Math.min(r10, r6)     // Catch: java.lang.Throwable -> L3b
            int r7 = r5.nioBufferCount()     // Catch: java.lang.Throwable -> L3b
            if (r7 == 0) goto L4d
            if (r7 == r1) goto L3d
            int r4 = r4.idx(r9)     // Catch: java.lang.Throwable -> L3b
            java.nio.ByteBuffer[] r4 = r5.nioBuffers(r4, r6)     // Catch: java.lang.Throwable -> L3b
            java.util.Collections.addAll(r2, r4)     // Catch: java.lang.Throwable -> L3b
            goto L48
        L3b:
            r9 = move-exception
            goto L5f
        L3d:
            int r4 = r4.idx(r9)     // Catch: java.lang.Throwable -> L3b
            java.nio.ByteBuffer r4 = r5.nioBuffer(r4, r6)     // Catch: java.lang.Throwable -> L3b
            r2.add(r4)     // Catch: java.lang.Throwable -> L3b
        L48:
            int r9 = r9 + r6
            int r10 = r10 - r6
            int r3 = r3 + 1
            goto L18
        L4d:
            java.lang.UnsupportedOperationException r9 = new java.lang.UnsupportedOperationException     // Catch: java.lang.Throwable -> L3b
            r9.<init>()     // Catch: java.lang.Throwable -> L3b
            throw r9     // Catch: java.lang.Throwable -> L3b
        L53:
            java.nio.ByteBuffer[] r9 = new java.nio.ByteBuffer[r0]     // Catch: java.lang.Throwable -> L3b
            java.lang.Object[] r9 = r2.toArray(r9)     // Catch: java.lang.Throwable -> L3b
            java.nio.ByteBuffer[] r9 = (java.nio.ByteBuffer[]) r9     // Catch: java.lang.Throwable -> L3b
            r2.recycle()
            return r9
        L5f:
            r2.recycle()
            throw r9
    }

    public int numComponents() {
            r1 = this;
            int r0 = r1.componentCount
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public java.nio.ByteOrder order() {
            r1 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf readBytes(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.readBytes(r1)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf readBytes(io.netty.buffer.ByteBuf r1, int r2) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.readBytes(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf readBytes(io.netty.buffer.ByteBuf r1, int r2, int r3) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.readBytes(r1, r2, r3)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf readBytes(java.io.OutputStream r1, int r2) throws java.io.IOException {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.readBytes(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf readBytes(java.nio.ByteBuffer r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.readBytes(r1)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf readBytes(byte[] r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.readBytes(r1)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf readBytes(byte[] r1, int r2, int r3) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.readBytes(r1, r2, r3)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf readBytes(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            int r0 = r2.writableBytes()
            super.readBytes(r2, r0)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf readBytes(io.netty.buffer.ByteBuf r1, int r2) {
            r0 = this;
            super.readBytes(r1, r2)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf readBytes(io.netty.buffer.ByteBuf r1, int r2, int r3) {
            r0 = this;
            super.readBytes(r1, r2, r3)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf readBytes(java.io.OutputStream r1, int r2) throws java.io.IOException {
            r0 = this;
            super.readBytes(r1, r2)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf readBytes(java.nio.ByteBuffer r1) {
            r0 = this;
            super.readBytes(r1)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf readBytes(byte[] r3) {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            super.readBytes(r3, r0, r1)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf readBytes(byte[] r1, int r2, int r3) {
            r0 = this;
            super.readBytes(r1, r2, r3)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf readerIndex(int r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.readerIndex(r1)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf readerIndex(int r1) {
            r0 = this;
            super.readerIndex(r1)
            return r0
    }

    public io.netty.buffer.CompositeByteBuf removeComponent(int r3) {
            r2 = this;
            r2.checkComponentIndex(r3)
            io.netty.buffer.CompositeByteBuf$Component[] r0 = r2.components
            r0 = r0[r3]
            io.netty.buffer.CompositeByteBuf$Component r1 = r2.lastAccessed
            if (r1 != r0) goto Le
            r1 = 0
            r2.lastAccessed = r1
        Le:
            r0.free()
            r2.removeComp(r3)
            int r0 = r0.length()
            if (r0 <= 0) goto L1d
            r2.updateComponentOffsets(r3)
        L1d:
            return r2
    }

    public io.netty.buffer.CompositeByteBuf removeComponents(int r5, int r6) {
            r4 = this;
            r4.checkComponentIndex(r5, r6)
            if (r6 != 0) goto L6
            goto L2b
        L6:
            int r6 = r6 + r5
            r0 = 0
            r1 = r5
        L9:
            if (r1 >= r6) goto L23
            io.netty.buffer.CompositeByteBuf$Component[] r2 = r4.components
            r2 = r2[r1]
            int r3 = r2.length()
            if (r3 <= 0) goto L16
            r0 = 1
        L16:
            io.netty.buffer.CompositeByteBuf$Component r3 = r4.lastAccessed
            if (r3 != r2) goto L1d
            r3 = 0
            r4.lastAccessed = r3
        L1d:
            r2.free()
            int r1 = r1 + 1
            goto L9
        L23:
            r4.removeCompRange(r5, r6)
            if (r0 == 0) goto L2b
            r4.updateComponentOffsets(r5)
        L2b:
            return r4
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf resetReaderIndex() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.resetReaderIndex()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf resetReaderIndex() {
            r0 = this;
            super.resetReaderIndex()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf resetWriterIndex() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.resetWriterIndex()
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf resetWriterIndex() {
            r0 = this;
            super.resetWriterIndex()
            return r0
    }

    @Override // io.netty.buffer.AbstractReferenceCountedByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf retain() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.retain()
            return r0
    }

    @Override // io.netty.buffer.AbstractReferenceCountedByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf retain(int r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.retain(r1)
            return r1
    }

    @Override // io.netty.buffer.AbstractReferenceCountedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf retain() {
            r0 = this;
            super.retain()
            return r0
    }

    @Override // io.netty.buffer.AbstractReferenceCountedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf retain(int r1) {
            r0 = this;
            super.retain(r1)
            return r0
    }

    @Override // io.netty.buffer.AbstractReferenceCountedByteBuf, io.netty.buffer.ByteBuf
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo1retain() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.retain()
            return r0
    }

    @Override // io.netty.buffer.AbstractReferenceCountedByteBuf, io.netty.buffer.ByteBuf
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo2retain(int r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.retain(r1)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf setBoolean(int r1, boolean r2) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.setBoolean(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf setBoolean(int r1, boolean r2) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.setByte(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf setByte(int r1, int r2) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.setByte(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf setByte(int r3, int r4) {
            r2 = this;
            io.netty.buffer.CompositeByteBuf$Component r0 = r2.findComponent(r3)
            io.netty.buffer.ByteBuf r1 = r0.buf
            int r3 = r0.idx(r3)
            r1.setByte(r3, r4)
            return r2
    }

    @Override // io.netty.buffer.ByteBuf
    public int setBytes(int r6, java.io.InputStream r7, int r8) throws java.io.IOException {
            r5 = this;
            r5.checkIndex(r6, r8)
            if (r8 != 0) goto Lc
            byte[] r6 = io.netty.util.internal.EmptyArrays.EMPTY_BYTES
            int r6 = r7.read(r6)
            return r6
        Lc:
            int r0 = r5.toComponentIndex0(r6)
            r1 = 0
        L11:
            io.netty.buffer.CompositeByteBuf$Component[] r2 = r5.components
            r2 = r2[r0]
            int r3 = r2.endOffset
            int r3 = r3 - r6
            int r3 = java.lang.Math.min(r8, r3)
            if (r3 != 0) goto L21
        L1e:
            int r0 = r0 + 1
            goto L38
        L21:
            io.netty.buffer.ByteBuf r4 = r2.buf
            int r2 = r2.idx(r6)
            int r2 = r4.setBytes(r2, r7, r3)
            if (r2 >= 0) goto L32
            if (r1 != 0) goto L31
            r6 = -1
            return r6
        L31:
            return r1
        L32:
            int r6 = r6 + r2
            int r8 = r8 - r2
            int r1 = r1 + r2
            if (r2 != r3) goto L38
            goto L1e
        L38:
            if (r8 > 0) goto L11
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public int setBytes(int r11, java.nio.channels.FileChannel r12, long r13, int r15) throws java.io.IOException {
            r10 = this;
            r10.checkIndex(r11, r15)
            if (r15 != 0) goto Lc
            java.nio.ByteBuffer r11 = io.netty.buffer.CompositeByteBuf.EMPTY_NIO_BUFFER
            int r11 = r12.read(r11, r13)
            return r11
        Lc:
            int r0 = r10.toComponentIndex0(r11)
            r1 = 0
        L11:
            io.netty.buffer.CompositeByteBuf$Component[] r2 = r10.components
            r2 = r2[r0]
            int r3 = r2.endOffset
            int r3 = r3 - r11
            int r9 = java.lang.Math.min(r15, r3)
            if (r9 != 0) goto L22
            int r0 = r0 + 1
            r6 = r12
            goto L41
        L22:
            io.netty.buffer.ByteBuf r4 = r2.buf
            int r5 = r2.idx(r11)
            long r2 = (long) r1
            long r7 = r13 + r2
            r6 = r12
            int r12 = r4.setBytes(r5, r6, r7, r9)
            if (r12 != 0) goto L33
            goto L39
        L33:
            if (r12 >= 0) goto L3a
            if (r1 != 0) goto L39
            r11 = -1
            return r11
        L39:
            return r1
        L3a:
            int r11 = r11 + r12
            int r15 = r15 - r12
            int r1 = r1 + r12
            if (r12 != r9) goto L41
            int r0 = r0 + 1
        L41:
            if (r15 > 0) goto L44
            return r1
        L44:
            r12 = r6
            goto L11
    }

    @Override // io.netty.buffer.ByteBuf
    public int setBytes(int r6, java.nio.channels.ScatteringByteChannel r7, int r8) throws java.io.IOException {
            r5 = this;
            r5.checkIndex(r6, r8)
            if (r8 != 0) goto Lc
            java.nio.ByteBuffer r6 = io.netty.buffer.CompositeByteBuf.EMPTY_NIO_BUFFER
            int r6 = r7.read(r6)
            return r6
        Lc:
            int r0 = r5.toComponentIndex0(r6)
            r1 = 0
        L11:
            io.netty.buffer.CompositeByteBuf$Component[] r2 = r5.components
            r2 = r2[r0]
            int r3 = r2.endOffset
            int r3 = r3 - r6
            int r3 = java.lang.Math.min(r8, r3)
            if (r3 != 0) goto L21
        L1e:
            int r0 = r0 + 1
            goto L3b
        L21:
            io.netty.buffer.ByteBuf r4 = r2.buf
            int r2 = r2.idx(r6)
            int r2 = r4.setBytes(r2, r7, r3)
            if (r2 != 0) goto L2e
            goto L34
        L2e:
            if (r2 >= 0) goto L35
            if (r1 != 0) goto L34
            r6 = -1
            return r6
        L34:
            return r1
        L35:
            int r6 = r6 + r2
            int r8 = r8 - r2
            int r1 = r1 + r2
            if (r2 != r3) goto L3b
            goto L1e
        L3b:
            if (r8 > 0) goto L11
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf setBytes(int r1, io.netty.buffer.ByteBuf r2) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.setBytes(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf setBytes(int r1, io.netty.buffer.ByteBuf r2, int r3) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.setBytes(r1, r2, r3)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf setBytes(int r1, io.netty.buffer.ByteBuf r2, int r3, int r4) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.setBytes(r1, r2, r3, r4)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf setBytes(int r1, java.nio.ByteBuffer r2) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.setBytes(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf setBytes(int r1, byte[] r2) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.setBytes(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf setBytes(int r1, byte[] r2, int r3, int r4) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.setBytes(r1, r2, r3, r4)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf setBytes(int r2, io.netty.buffer.ByteBuf r3) {
            r1 = this;
            int r0 = r3.readableBytes()
            super.setBytes(r2, r3, r0)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf setBytes(int r1, io.netty.buffer.ByteBuf r2, int r3) {
            r0 = this;
            super.setBytes(r1, r2, r3)
            return r0
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf setBytes(int r5, io.netty.buffer.ByteBuf r6, int r7, int r8) {
            r4 = this;
            int r0 = r6.capacity()
            r4.checkSrcIndex(r5, r8, r7, r0)
            if (r8 != 0) goto La
            goto L2a
        La:
            int r0 = r4.toComponentIndex0(r5)
        Le:
            if (r8 <= 0) goto L2a
            io.netty.buffer.CompositeByteBuf$Component[] r1 = r4.components
            r1 = r1[r0]
            int r2 = r1.endOffset
            int r2 = r2 - r5
            int r2 = java.lang.Math.min(r8, r2)
            io.netty.buffer.ByteBuf r3 = r1.buf
            int r1 = r1.idx(r5)
            r3.setBytes(r1, r6, r7, r2)
            int r5 = r5 + r2
            int r7 = r7 + r2
            int r8 = r8 - r2
            int r0 = r0 + 1
            goto Le
        L2a:
            return r4
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf setBytes(int r7, java.nio.ByteBuffer r8) {
            r6 = this;
            int r0 = r8.limit()
            int r1 = r8.remaining()
            r6.checkIndex(r7, r1)
            if (r1 != 0) goto Le
            return r6
        Le:
            int r2 = r6.toComponentIndex0(r7)
        L12:
            if (r1 <= 0) goto L3a
            io.netty.buffer.CompositeByteBuf$Component[] r3 = r6.components     // Catch: java.lang.Throwable -> L35
            r3 = r3[r2]     // Catch: java.lang.Throwable -> L35
            int r4 = r3.endOffset     // Catch: java.lang.Throwable -> L35
            int r4 = r4 - r7
            int r4 = java.lang.Math.min(r1, r4)     // Catch: java.lang.Throwable -> L35
            int r5 = r8.position()     // Catch: java.lang.Throwable -> L35
            int r5 = r5 + r4
            r8.limit(r5)     // Catch: java.lang.Throwable -> L35
            io.netty.buffer.ByteBuf r5 = r3.buf     // Catch: java.lang.Throwable -> L35
            int r3 = r3.idx(r7)     // Catch: java.lang.Throwable -> L35
            r5.setBytes(r3, r8)     // Catch: java.lang.Throwable -> L35
            int r7 = r7 + r4
            int r1 = r1 - r4
            int r2 = r2 + 1
            goto L12
        L35:
            r7 = move-exception
            r8.limit(r0)
            throw r7
        L3a:
            r8.limit(r0)
            return r6
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf setBytes(int r3, byte[] r4) {
            r2 = this;
            r0 = 0
            int r1 = r4.length
            io.netty.buffer.CompositeByteBuf r3 = r2.setBytes(r3, r4, r0, r1)
            return r3
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf setBytes(int r5, byte[] r6, int r7, int r8) {
            r4 = this;
            int r0 = r6.length
            r4.checkSrcIndex(r5, r8, r7, r0)
            if (r8 != 0) goto L7
            goto L27
        L7:
            int r0 = r4.toComponentIndex0(r5)
        Lb:
            if (r8 <= 0) goto L27
            io.netty.buffer.CompositeByteBuf$Component[] r1 = r4.components
            r1 = r1[r0]
            int r2 = r1.endOffset
            int r2 = r2 - r5
            int r2 = java.lang.Math.min(r8, r2)
            io.netty.buffer.ByteBuf r3 = r1.buf
            int r1 = r1.idx(r5)
            r3.setBytes(r1, r6, r7, r2)
            int r5 = r5 + r2
            int r7 = r7 + r2
            int r8 = r8 - r2
            int r0 = r0 + 1
            goto Lb
        L27:
            return r4
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf setChar(int r1, int r2) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.setChar(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf setChar(int r1, int r2) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.setShort(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf setDouble(int r1, double r2) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.setDouble(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf setDouble(int r1, double r2) {
            r0 = this;
            long r2 = java.lang.Double.doubleToRawLongBits(r2)
            io.netty.buffer.CompositeByteBuf r1 = r0.setLong(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf setFloat(int r1, float r2) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.setFloat(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf setFloat(int r1, float r2) {
            r0 = this;
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            io.netty.buffer.CompositeByteBuf r1 = r0.setInt(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf setIndex(int r1, int r2) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.setIndex(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf setIndex(int r1, int r2) {
            r0 = this;
            super.setIndex(r1, r2)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf setInt(int r1, int r2) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.setInt(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf setInt(int r2, int r3) {
            r1 = this;
            r0 = 4
            r1.checkIndex(r2, r0)
            r1._setInt(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf setLong(int r1, long r2) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.setLong(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf setLong(int r2, long r3) {
            r1 = this;
            r0 = 8
            r1.checkIndex(r2, r0)
            r1._setLong(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf setMedium(int r1, int r2) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.setMedium(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf setMedium(int r2, int r3) {
            r1 = this;
            r0 = 3
            r1.checkIndex(r2, r0)
            r1._setMedium(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf setShort(int r1, int r2) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.setShort(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf setShort(int r2, int r3) {
            r1 = this;
            r0 = 2
            r1.checkIndex(r2, r0)
            r1._setShort(r2, r3)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf setZero(int r1, int r2) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.setZero(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf setZero(int r1, int r2) {
            r0 = this;
            super.setZero(r1, r2)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf skipBytes(int r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.skipBytes(r1)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf skipBytes(int r1) {
            r0 = this;
            super.skipBytes(r1)
            return r0
    }

    public int toByteIndex(int r2) {
            r1 = this;
            r1.checkComponentIndex(r2)
            io.netty.buffer.CompositeByteBuf$Component[] r0 = r1.components
            r2 = r0[r2]
            int r2 = r2.offset
            return r2
    }

    public int toComponentIndex(int r1) {
            r0 = this;
            r0.checkIndex(r1)
            int r1 = r0.toComponentIndex0(r1)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = super.toString()
            int r1 = r0.length()
            int r1 = r1 + (-1)
            r2 = 0
            java.lang.String r0 = r0.substring(r2, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ", components="
            r1.append(r0)
            int r0 = r3.componentCount
            r1.append(r0)
            r0 = 41
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // io.netty.buffer.AbstractReferenceCountedByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf touch() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.touch()
            return r0
    }

    @Override // io.netty.buffer.AbstractReferenceCountedByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf touch(java.lang.Object r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.touch(r1)
            return r1
    }

    @Override // io.netty.buffer.AbstractReferenceCountedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf touch() {
            r0 = this;
            return r0
    }

    @Override // io.netty.buffer.AbstractReferenceCountedByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf touch(java.lang.Object r1) {
            r0 = this;
            return r0
    }

    @Override // io.netty.buffer.AbstractReferenceCountedByteBuf, io.netty.buffer.ByteBuf
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo3touch() {
            r1 = this;
            io.netty.buffer.CompositeByteBuf r0 = r1.touch()
            return r0
    }

    @Override // io.netty.buffer.AbstractReferenceCountedByteBuf, io.netty.buffer.ByteBuf
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo4touch(java.lang.Object r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.touch(r1)
            return r1
    }

    @Override // io.netty.buffer.ByteBuf
    public io.netty.buffer.ByteBuf unwrap() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf writeBoolean(boolean r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.writeBoolean(r1)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf writeBoolean(boolean r1) {
            r0 = this;
            r0.writeByte(r1)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf writeByte(int r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.writeByte(r1)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf writeByte(int r3) {
            r2 = this;
            r0 = 1
            r2.ensureWritable0(r0)
            int r0 = r2.writerIndex
            int r1 = r0 + 1
            r2.writerIndex = r1
            r2._setByte(r0, r3)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf writeBytes(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.writeBytes(r1)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf writeBytes(io.netty.buffer.ByteBuf r1, int r2) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.writeBytes(r1, r2)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf writeBytes(io.netty.buffer.ByteBuf r1, int r2, int r3) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.writeBytes(r1, r2, r3)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf writeBytes(java.nio.ByteBuffer r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.writeBytes(r1)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf writeBytes(byte[] r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.writeBytes(r1)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf writeBytes(byte[] r1, int r2, int r3) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.writeBytes(r1, r2, r3)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf writeBytes(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            int r0 = r2.readableBytes()
            super.writeBytes(r2, r0)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf writeBytes(io.netty.buffer.ByteBuf r1, int r2) {
            r0 = this;
            super.writeBytes(r1, r2)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf writeBytes(io.netty.buffer.ByteBuf r1, int r2, int r3) {
            r0 = this;
            super.writeBytes(r1, r2, r3)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf writeBytes(java.nio.ByteBuffer r1) {
            r0 = this;
            super.writeBytes(r1)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf writeBytes(byte[] r3) {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            super.writeBytes(r3, r0, r1)
            return r2
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf writeBytes(byte[] r1, int r2, int r3) {
            r0 = this;
            super.writeBytes(r1, r2, r3)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf writeChar(int r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.writeChar(r1)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf writeChar(int r1) {
            r0 = this;
            super.writeShort(r1)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf writeDouble(double r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.writeDouble(r1)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf writeDouble(double r1) {
            r0 = this;
            long r1 = java.lang.Double.doubleToRawLongBits(r1)
            super.writeLong(r1)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf writeFloat(float r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.writeFloat(r1)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf writeFloat(float r1) {
            r0 = this;
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            super.writeInt(r1)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf writeInt(int r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.writeInt(r1)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf writeInt(int r1) {
            r0 = this;
            super.writeInt(r1)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf writeLong(long r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.writeLong(r1)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf writeLong(long r1) {
            r0 = this;
            super.writeLong(r1)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf writeMedium(int r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.writeMedium(r1)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf writeMedium(int r1) {
            r0 = this;
            super.writeMedium(r1)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf writeShort(int r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.writeShort(r1)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf writeShort(int r1) {
            r0 = this;
            super.writeShort(r1)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf writeZero(int r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.writeZero(r1)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf writeZero(int r1) {
            r0 = this;
            super.writeZero(r1)
            return r0
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf writerIndex(int r1) {
            r0 = this;
            io.netty.buffer.CompositeByteBuf r1 = r0.writerIndex(r1)
            return r1
    }

    @Override // io.netty.buffer.AbstractByteBuf, io.netty.buffer.ByteBuf
    public io.netty.buffer.CompositeByteBuf writerIndex(int r1) {
            r0 = this;
            super.writerIndex(r1)
            return r0
    }
}
