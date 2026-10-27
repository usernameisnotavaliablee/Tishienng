package androidx.collection;

/* JADX INFO: Add missing generic type declarations: [E] */
/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class MutableScatterSet$MutableSetWrapper$iterator$1<E> implements java.util.Iterator<E>, l3.d {
    private int current;

    @org.jetbrains.annotations.NotNull
    private final java.util.Iterator<E> iterator;
    final /* synthetic */ androidx.collection.MutableScatterSet<E> this$0;

    MutableScatterSet$MutableSetWrapper$iterator$1(androidx.collection.MutableScatterSet<E> r3) {
            r2 = this;
            r2.this$0 = r3
            r2.<init>()
            r0 = -1
            r2.current = r0
            androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1 r0 = new androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1
            r1 = 0
            r0.<init>(r3, r2, r1)
            java.util.Iterator r3 = kotlin.sequences.p.a(r0)
            r2.iterator = r3
            return
    }

    public final int getCurrent() {
            r1 = this;
            int r0 = r1.current
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Iterator<E> getIterator() {
            r1 = this;
            java.util.Iterator<E> r0 = r1.iterator
            return r0
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r1 = this;
            java.util.Iterator<E> r0 = r1.iterator
            boolean r0 = r0.hasNext()
            return r0
    }

    @Override // java.util.Iterator
    public E next() {
            r1 = this;
            java.util.Iterator<E> r0 = r1.iterator
            java.lang.Object r0 = r0.next()
            return r0
    }

    @Override // java.util.Iterator
    public void remove() {
            r3 = this;
            int r0 = r3.current
            r1 = -1
            if (r0 == r1) goto Lc
            androidx.collection.MutableScatterSet<E> r2 = r3.this$0
            r2.removeElementAt(r0)
            r3.current = r1
        Lc:
            return
    }

    public final void setCurrent(int r1) {
            r0 = this;
            r0.current = r1
            return
    }
}
