package kotlin.collections;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class j0 extends kotlin.collections.i0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a<T> implements java.util.Iterator<T>, l3.a {
        final /* synthetic */ java.util.Enumeration<T> a;

        a(java.util.Enumeration<T> r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                java.util.Enumeration<T> r0 = r1.a
                boolean r0 = r0.hasMoreElements()
                return r0
        }

        @Override // java.util.Iterator
        public T next() {
                r1 = this;
                java.util.Enumeration<T> r0 = r1.a
                java.lang.Object r0 = r0.nextElement()
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

    public j0() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public static <T> java.util.Iterator<T> h0(@org.jetbrains.annotations.NotNull java.util.Enumeration<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.collections.j0$a r0 = new kotlin.collections.j0$a
            r0.<init>(r1)
            return r0
    }
}
