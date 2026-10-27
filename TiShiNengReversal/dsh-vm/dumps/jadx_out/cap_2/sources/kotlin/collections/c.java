package kotlin.collections;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class c<T> implements java.util.Iterator<T>, l3.a {
    private int a;

    @org.jetbrains.annotations.Nullable
    private T b;

    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    private final boolean f() {
            r2 = this;
            r0 = 3
            r2.a = r0
            r2.a()
            int r0 = r2.a
            r1 = 1
            if (r0 != r1) goto Lc
            return r1
        Lc:
            r0 = 0
            return r0
    }

    protected abstract void a();

    protected final void c() {
            r1 = this;
            r0 = 2
            r1.a = r0
            return
    }

    protected final void e(T r1) {
            r0 = this;
            r0.b = r1
            r1 = 1
            r0.a = r1
            return
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r2 = this;
            int r0 = r2.a
            if (r0 == 0) goto L15
            r1 = 1
            if (r0 == r1) goto L14
            r1 = 2
            if (r0 != r1) goto Lc
            r0 = 0
            return r0
        Lc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "hasNext called when the iterator is in the FAILED state."
            r0.<init>(r1)
            throw r0
        L14:
            return r1
        L15:
            boolean r0 = r2.f()
            return r0
    }

    @Override // java.util.Iterator
    public T next() {
            r3 = this;
            int r0 = r3.a
            r1 = 1
            r2 = 0
            if (r0 != r1) goto Lb
            r3.a = r2
            T r0 = r3.b
            return r0
        Lb:
            r1 = 2
            if (r0 == r1) goto L19
            boolean r0 = r3.f()
            if (r0 == 0) goto L19
            r3.a = r2
            T r0 = r3.b
            return r0
        L19:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Iterator
    public void remove() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }
}
