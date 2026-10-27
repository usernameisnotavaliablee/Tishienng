package kotlin.collections;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class c1<T> implements java.util.Iterator<kotlin.collections.a1<? extends T>>, l3.a {

    @org.jetbrains.annotations.NotNull
    private final java.util.Iterator<T> a;
    private int b;

    public c1(@org.jetbrains.annotations.NotNull java.util.Iterator<? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "iterator"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.collections.a1<T> a() {
            r3 = this;
            kotlin.collections.a1 r0 = new kotlin.collections.a1
            int r1 = r3.b
            int r2 = r1 + 1
            r3.b = r2
            if (r1 >= 0) goto Ld
            kotlin.collections.h0.b0()
        Ld:
            java.util.Iterator<T> r2 = r3.a
            java.lang.Object r2 = r2.next()
            r0.<init>(r1, r2)
            return r0
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            java.util.Iterator<T> r0 = r1.a
            boolean r0 = r0.hasNext()
            return r0
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ java.lang.Object next() {
            r1 = this;
            kotlin.collections.a1 r0 = r1.a()
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
