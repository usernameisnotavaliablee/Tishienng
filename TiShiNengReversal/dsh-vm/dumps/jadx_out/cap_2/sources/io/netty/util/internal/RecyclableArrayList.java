package io.netty.util.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class RecyclableArrayList extends java.util.ArrayList<java.lang.Object> {
    private static final int DEFAULT_INITIAL_CAPACITY = 8;
    private static final io.netty.util.Recycler<io.netty.util.internal.RecyclableArrayList> RECYCLER = null;
    private static final long serialVersionUID = -8605125654176467947L;
    private final io.netty.util.Recycler.Handle<io.netty.util.internal.RecyclableArrayList> handle;
    private boolean insertSinceRecycled;


    static {
            io.netty.util.internal.RecyclableArrayList$1 r0 = new io.netty.util.internal.RecyclableArrayList$1
            r0.<init>()
            io.netty.util.internal.RecyclableArrayList.RECYCLER = r0
            return
    }

    private RecyclableArrayList(io.netty.util.Recycler.Handle<io.netty.util.internal.RecyclableArrayList> r2) {
            r1 = this;
            r0 = 8
            r1.<init>(r2, r0)
            return
    }

    private RecyclableArrayList(io.netty.util.Recycler.Handle<io.netty.util.internal.RecyclableArrayList> r1, int r2) {
            r0 = this;
            r0.<init>(r2)
            r0.handle = r1
            return
    }

    /* synthetic */ RecyclableArrayList(io.netty.util.Recycler.Handle r1, io.netty.util.internal.RecyclableArrayList.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private static void checkNullElements(java.util.Collection<?> r4) {
            boolean r0 = r4 instanceof java.util.RandomAccess
            java.lang.String r1 = "c contains null values"
            if (r0 == 0) goto L22
            boolean r0 = r4 instanceof java.util.List
            if (r0 == 0) goto L22
            java.util.List r4 = (java.util.List) r4
            int r0 = r4.size()
            r2 = 0
        L11:
            if (r2 >= r0) goto L39
            java.lang.Object r3 = r4.get(r2)
            if (r3 == 0) goto L1c
            int r2 = r2 + 1
            goto L11
        L1c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>(r1)
            throw r4
        L22:
            java.util.Iterator r4 = r4.iterator()
        L26:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L39
            java.lang.Object r0 = r4.next()
            if (r0 == 0) goto L33
            goto L26
        L33:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>(r1)
            throw r4
        L39:
            return
    }

    public static io.netty.util.internal.RecyclableArrayList newInstance() {
            r0 = 8
            io.netty.util.internal.RecyclableArrayList r0 = newInstance(r0)
            return r0
    }

    public static io.netty.util.internal.RecyclableArrayList newInstance(int r1) {
            io.netty.util.Recycler<io.netty.util.internal.RecyclableArrayList> r0 = io.netty.util.internal.RecyclableArrayList.RECYCLER
            java.lang.Object r0 = r0.get()
            io.netty.util.internal.RecyclableArrayList r0 = (io.netty.util.internal.RecyclableArrayList) r0
            r0.ensureCapacity(r1)
            return r0
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public void add(int r1, java.lang.Object r2) {
            r0 = this;
            if (r2 == 0) goto L9
            super.add(r1, r2)
            r1 = 1
            r0.insertSinceRecycled = r1
            return
        L9:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "element"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(java.lang.Object r2) {
            r1 = this;
            if (r2 == 0) goto Le
            boolean r2 = super.add(r2)
            if (r2 == 0) goto Lc
            r2 = 1
            r1.insertSinceRecycled = r2
            return r2
        Lc:
            r2 = 0
            return r2
        Le:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "element"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public boolean addAll(int r1, java.util.Collection<?> r2) {
            r0 = this;
            checkNullElements(r2)
            boolean r1 = super.addAll(r1, r2)
            if (r1 == 0) goto Ld
            r1 = 1
            r0.insertSinceRecycled = r1
            return r1
        Ld:
            r1 = 0
            return r1
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection<?> r1) {
            r0 = this;
            checkNullElements(r1)
            boolean r1 = super.addAll(r1)
            if (r1 == 0) goto Ld
            r1 = 1
            r0.insertSinceRecycled = r1
            return r1
        Ld:
            r1 = 0
            return r1
    }

    public boolean insertSinceRecycled() {
            r1 = this;
            boolean r0 = r1.insertSinceRecycled
            return r0
    }

    public boolean recycle() {
            r1 = this;
            r1.clear()
            r0 = 0
            r1.insertSinceRecycled = r0
            io.netty.util.Recycler$Handle<io.netty.util.internal.RecyclableArrayList> r0 = r1.handle
            r0.recycle(r1)
            r0 = 1
            return r0
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public java.lang.Object set(int r1, java.lang.Object r2) {
            r0 = this;
            if (r2 == 0) goto La
            java.lang.Object r1 = super.set(r1, r2)
            r2 = 1
            r0.insertSinceRecycled = r2
            return r1
        La:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "element"
            r1.<init>(r2)
            throw r1
    }
}
