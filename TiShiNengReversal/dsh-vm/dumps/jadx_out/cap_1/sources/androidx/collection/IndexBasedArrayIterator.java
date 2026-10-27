package androidx.collection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nIndexBasedArrayIterator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IndexBasedArrayIterator.kt\nandroidx/collection/IndexBasedArrayIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,48:1\n1#2:49\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class IndexBasedArrayIterator<T> implements java.util.Iterator<T>, l3.d {
    private boolean canRemove;
    private int index;
    private int size;

    public IndexBasedArrayIterator(int r1) {
            r0 = this;
            r0.<init>()
            r0.size = r1
            return
    }

    protected abstract T elementAt(int r1);

    @Override // java.util.Iterator
    public boolean hasNext() {
            r2 = this;
            int r0 = r2.index
            int r1 = r2.size
            if (r0 >= r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public T next() {
            r3 = this;
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L15
            int r0 = r3.index
            java.lang.Object r0 = r3.elementAt(r0)
            int r1 = r3.index
            r2 = 1
            int r1 = r1 + r2
            r3.index = r1
            r3.canRemove = r2
            return r0
        L15:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Iterator
    public void remove() {
            r2 = this;
            boolean r0 = r2.canRemove
            if (r0 == 0) goto L17
            int r0 = r2.index
            int r0 = r0 + (-1)
            r2.index = r0
            r2.removeAt(r0)
            int r0 = r2.size
            int r0 = r0 + (-1)
            r2.size = r0
            r0 = 0
            r2.canRemove = r0
            return
        L17:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Call next() before removing an element."
            r0.<init>(r1)
            throw r0
    }

    protected abstract void removeAt(int r1);
}
