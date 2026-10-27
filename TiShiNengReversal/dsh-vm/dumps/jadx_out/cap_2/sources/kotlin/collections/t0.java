package kotlin.collections;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class t0 implements java.util.ListIterator, l3.a {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.collections.t0 a = null;

    static {
            kotlin.collections.t0 r0 = new kotlin.collections.t0
            r0.<init>()
            kotlin.collections.t0.a = r0
            return
    }

    private t0() {
            r0 = this;
            r0.<init>()
            return
    }

    public void a(java.lang.Void r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.ListIterator
    public /* bridge */ /* synthetic */ void add(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.Void c() {
            r1 = this;
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.Void e() {
            r1 = this;
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    public void f(java.lang.Void r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public /* bridge */ /* synthetic */ java.lang.Object next() {
            r1 = this;
            java.lang.Void r0 = r1.c()
            return r0
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.ListIterator
    public /* bridge */ /* synthetic */ java.lang.Object previous() {
            r1 = this;
            java.lang.Void r0 = r1.e()
            return r0
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
            r1 = this;
            r0 = -1
            return r0
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.ListIterator
    public /* bridge */ /* synthetic */ void set(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }
}
