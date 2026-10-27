package io.netty.handler.codec;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class CodecOutputList extends java.util.AbstractList<java.lang.Object> implements java.util.RandomAccess {
    private static final io.netty.util.concurrent.FastThreadLocal<io.netty.handler.codec.CodecOutputList.CodecOutputLists> CODEC_OUTPUT_LISTS_POOL = null;
    private static final io.netty.handler.codec.CodecOutputList.CodecOutputListRecycler NOOP_RECYCLER = null;
    private java.lang.Object[] array;
    private boolean insertSinceRecycled;
    private final io.netty.handler.codec.CodecOutputList.CodecOutputListRecycler recycler;
    private int size;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private interface CodecOutputListRecycler {
        void recycle(io.netty.handler.codec.CodecOutputList r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class CodecOutputLists implements io.netty.handler.codec.CodecOutputList.CodecOutputListRecycler {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private int count;
        private int currentIdx;
        private final io.netty.handler.codec.CodecOutputList[] elements;
        private final int mask;

        static {
                return
        }

        CodecOutputLists(int r5) {
                r4 = this;
                r4.<init>()
                int r5 = io.netty.util.internal.MathUtil.safeFindNextPositivePowerOfTwo(r5)
                io.netty.handler.codec.CodecOutputList[] r5 = new io.netty.handler.codec.CodecOutputList[r5]
                r4.elements = r5
                r5 = 0
            Lc:
                io.netty.handler.codec.CodecOutputList[] r0 = r4.elements
                int r1 = r0.length
                if (r5 >= r1) goto L1e
                io.netty.handler.codec.CodecOutputList r1 = new io.netty.handler.codec.CodecOutputList
                r2 = 16
                r3 = 0
                r1.<init>(r4, r2, r3)
                r0[r5] = r1
                int r5 = r5 + 1
                goto Lc
            L1e:
                int r5 = r0.length
                r4.count = r5
                int r5 = r0.length
                r4.currentIdx = r5
                int r5 = r0.length
                int r5 = r5 + (-1)
                r4.mask = r5
                return
        }

        public io.netty.handler.codec.CodecOutputList getOrCreate() {
                r4 = this;
                int r0 = r4.count
                if (r0 != 0) goto L10
                io.netty.handler.codec.CodecOutputList r0 = new io.netty.handler.codec.CodecOutputList
                io.netty.handler.codec.CodecOutputList$CodecOutputListRecycler r1 = io.netty.handler.codec.CodecOutputList.access$100()
                r2 = 4
                r3 = 0
                r0.<init>(r1, r2, r3)
                return r0
            L10:
                int r0 = r0 + (-1)
                r4.count = r0
                int r0 = r4.currentIdx
                int r0 = r0 + (-1)
                int r1 = r4.mask
                r0 = r0 & r1
                io.netty.handler.codec.CodecOutputList[] r1 = r4.elements
                r1 = r1[r0]
                r4.currentIdx = r0
                return r1
        }

        @Override // io.netty.handler.codec.CodecOutputList.CodecOutputListRecycler
        public void recycle(io.netty.handler.codec.CodecOutputList r3) {
                r2 = this;
                int r0 = r2.currentIdx
                io.netty.handler.codec.CodecOutputList[] r1 = r2.elements
                r1[r0] = r3
                int r0 = r0 + 1
                int r3 = r2.mask
                r3 = r3 & r0
                r2.currentIdx = r3
                int r3 = r2.count
                int r3 = r3 + 1
                r2.count = r3
                return
        }
    }

    static {
            io.netty.handler.codec.CodecOutputList$1 r0 = new io.netty.handler.codec.CodecOutputList$1
            r0.<init>()
            io.netty.handler.codec.CodecOutputList.NOOP_RECYCLER = r0
            io.netty.handler.codec.CodecOutputList$2 r0 = new io.netty.handler.codec.CodecOutputList$2
            r0.<init>()
            io.netty.handler.codec.CodecOutputList.CODEC_OUTPUT_LISTS_POOL = r0
            return
    }

    private CodecOutputList(io.netty.handler.codec.CodecOutputList.CodecOutputListRecycler r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.recycler = r1
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r0.array = r1
            return
    }

    /* synthetic */ CodecOutputList(io.netty.handler.codec.CodecOutputList.CodecOutputListRecycler r1, int r2, io.netty.handler.codec.CodecOutputList.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    static /* synthetic */ io.netty.handler.codec.CodecOutputList.CodecOutputListRecycler access$100() {
            io.netty.handler.codec.CodecOutputList$CodecOutputListRecycler r0 = io.netty.handler.codec.CodecOutputList.NOOP_RECYCLER
            return r0
    }

    private void checkIndex(int r2) {
            r1 = this;
            int r0 = r1.size
            if (r2 >= r0) goto L5
            return
        L5:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            r2.<init>()
            throw r2
    }

    private void expandArray() {
            r4 = this;
            java.lang.Object[] r0 = r4.array
            int r1 = r0.length
            int r1 = r1 << 1
            if (r1 < 0) goto L11
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r2 = r0.length
            r3 = 0
            java.lang.System.arraycopy(r0, r3, r1, r3, r2)
            r4.array = r1
            return
        L11:
            java.lang.OutOfMemoryError r0 = new java.lang.OutOfMemoryError
            r0.<init>()
            throw r0
    }

    private void insert(int r2, java.lang.Object r3) {
            r1 = this;
            java.lang.Object[] r0 = r1.array
            r0[r2] = r3
            r2 = 1
            r1.insertSinceRecycled = r2
            return
    }

    static io.netty.handler.codec.CodecOutputList newInstance() {
            io.netty.util.concurrent.FastThreadLocal<io.netty.handler.codec.CodecOutputList$CodecOutputLists> r0 = io.netty.handler.codec.CodecOutputList.CODEC_OUTPUT_LISTS_POOL
            java.lang.Object r0 = r0.get()
            io.netty.handler.codec.CodecOutputList$CodecOutputLists r0 = (io.netty.handler.codec.CodecOutputList.CodecOutputLists) r0
            io.netty.handler.codec.CodecOutputList r0 = r0.getOrCreate()
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int r4, java.lang.Object r5) {
            r3 = this;
            java.lang.String r0 = "element"
            io.netty.util.internal.ObjectUtil.checkNotNull(r5, r0)
            r3.checkIndex(r4)
            int r0 = r3.size
            java.lang.Object[] r1 = r3.array
            int r1 = r1.length
            if (r0 != r1) goto L12
            r3.expandArray()
        L12:
            int r0 = r3.size
            if (r4 == r0) goto L1e
            java.lang.Object[] r1 = r3.array
            int r2 = r4 + 1
            int r0 = r0 - r4
            java.lang.System.arraycopy(r1, r4, r1, r2, r0)
        L1e:
            r3.insert(r4, r5)
            int r4 = r3.size
            int r4 = r4 + 1
            r3.size = r4
            return
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(java.lang.Object r2) {
            r1 = this;
            java.lang.String r0 = "element"
            io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            int r0 = r1.size     // Catch: java.lang.IndexOutOfBoundsException -> Lb
            r1.insert(r0, r2)     // Catch: java.lang.IndexOutOfBoundsException -> Lb
            goto L13
        Lb:
            r1.expandArray()
            int r0 = r1.size
            r1.insert(r0, r2)
        L13:
            int r2 = r1.size
            r0 = 1
            int r2 = r2 + r0
            r1.size = r2
            return r0
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
            r1 = this;
            r0 = 0
            r1.size = r0
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object get(int r2) {
            r1 = this;
            r1.checkIndex(r2)
            java.lang.Object[] r0 = r1.array
            r2 = r0[r2]
            return r2
    }

    java.lang.Object getUnsafe(int r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.array
            r2 = r0[r2]
            return r2
    }

    boolean insertSinceRecycled() {
            r1 = this;
            boolean r0 = r1.insertSinceRecycled
            return r0
    }

    void recycle() {
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r4.size
            if (r1 >= r2) goto Le
            java.lang.Object[] r2 = r4.array
            r3 = 0
            r2[r1] = r3
            int r1 = r1 + 1
            goto L2
        Le:
            r4.size = r0
            r4.insertSinceRecycled = r0
            io.netty.handler.codec.CodecOutputList$CodecOutputListRecycler r0 = r4.recycler
            r0.recycle(r4)
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object remove(int r5) {
            r4 = this;
            r4.checkIndex(r5)
            java.lang.Object[] r0 = r4.array
            r1 = r0[r5]
            int r2 = r4.size
            int r2 = r2 - r5
            int r2 = r2 + (-1)
            if (r2 <= 0) goto L13
            int r3 = r5 + 1
            java.lang.System.arraycopy(r0, r3, r0, r5, r2)
        L13:
            java.lang.Object[] r5 = r4.array
            int r0 = r4.size
            int r0 = r0 + (-1)
            r4.size = r0
            r2 = 0
            r5[r0] = r2
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object set(int r2, java.lang.Object r3) {
            r1 = this;
            java.lang.String r0 = "element"
            io.netty.util.internal.ObjectUtil.checkNotNull(r3, r0)
            r1.checkIndex(r2)
            java.lang.Object[] r0 = r1.array
            r0 = r0[r2]
            r1.insert(r2, r3)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
            r1 = this;
            int r0 = r1.size
            return r0
    }
}
