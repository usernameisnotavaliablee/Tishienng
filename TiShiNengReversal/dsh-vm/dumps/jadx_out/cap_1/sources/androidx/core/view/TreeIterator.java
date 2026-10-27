package androidx.core.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class TreeIterator<T> implements java.util.Iterator<T>, l3.a {

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<T, java.util.Iterator<T>> getChildIterator;

    @org.jetbrains.annotations.NotNull
    private java.util.Iterator<? extends T> iterator;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.util.Iterator<T>> stack;

    public TreeIterator(@org.jetbrains.annotations.NotNull java.util.Iterator<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends java.util.Iterator<? extends T>> r2) {
            r0 = this;
            r0.<init>()
            r0.getChildIterator = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.stack = r2
            r0.iterator = r1
            return
    }

    private final void prepareNextIterator(T r3) {
            r2 = this;
            kotlin.jvm.functions.Function1<T, java.util.Iterator<T>> r0 = r2.getChildIterator
            java.lang.Object r3 = r0.invoke(r3)
            java.util.Iterator r3 = (java.util.Iterator) r3
            if (r3 == 0) goto L1a
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1a
            java.util.List<java.util.Iterator<T>> r0 = r2.stack
            java.util.Iterator<? extends T> r1 = r2.iterator
            r0.add(r1)
            r2.iterator = r3
            return
        L1a:
            java.util.Iterator<? extends T> r3 = r2.iterator
            boolean r3 = r3.hasNext()
            if (r3 != 0) goto L3c
            java.util.List<java.util.Iterator<T>> r3 = r2.stack
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L3c
            java.util.List<java.util.Iterator<T>> r3 = r2.stack
            java.lang.Object r3 = kotlin.collections.f0.u3(r3)
            java.util.Iterator r3 = (java.util.Iterator) r3
            r2.iterator = r3
            java.util.List<java.util.Iterator<T>> r3 = r2.stack
            kotlin.collections.f0.Q0(r3)
            goto L1a
        L3c:
            return
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r1 = this;
            java.util.Iterator<? extends T> r0 = r1.iterator
            boolean r0 = r0.hasNext()
            return r0
    }

    @Override // java.util.Iterator
    public T next() {
            r1 = this;
            java.util.Iterator<? extends T> r0 = r1.iterator
            java.lang.Object r0 = r0.next()
            r1.prepareNextIterator(r0)
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
}
