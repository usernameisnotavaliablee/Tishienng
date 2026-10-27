package androidx.core.util;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class SparseArrayKt$valueIterator$1<T> implements java.util.Iterator<T>, l3.a {
    final /* synthetic */ android.util.SparseArray<T> $this_valueIterator;
    private int index;

    SparseArrayKt$valueIterator$1(android.util.SparseArray<T> r1) {
            r0 = this;
            r0.$this_valueIterator = r1
            r0.<init>()
            return
    }

    public final int getIndex() {
            r1 = this;
            int r0 = r1.index
            return r0
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r2 = this;
            int r0 = r2.index
            android.util.SparseArray<T> r1 = r2.$this_valueIterator
            int r1 = r1.size()
            if (r0 >= r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public T next() {
            r3 = this;
            android.util.SparseArray<T> r0 = r3.$this_valueIterator
            int r1 = r3.index
            int r2 = r1 + 1
            r3.index = r2
            java.lang.Object r0 = r0.valueAt(r1)
            return r0
    }

    @Override // java.util.Iterator
    public void remove() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    public final void setIndex(int r1) {
            r0 = this;
            r0.index = r1
            return
    }
}
