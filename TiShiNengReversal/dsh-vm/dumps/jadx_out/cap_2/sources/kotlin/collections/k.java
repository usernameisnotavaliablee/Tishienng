package kotlin.collections;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.1")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class k<E> extends kotlin.collections.b<E> implements java.util.Set<E>, l3.a {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.collections.k.a a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final boolean a(@org.jetbrains.annotations.NotNull java.util.Set<?> r3, @org.jetbrains.annotations.NotNull java.util.Set<?> r4) {
                r2 = this;
                java.lang.String r0 = "c"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "other"
                kotlin.jvm.internal.g0.p(r4, r0)
                int r0 = r3.size()
                int r1 = r4.size()
                if (r0 == r1) goto L16
                r3 = 0
                return r3
            L16:
                boolean r3 = r3.containsAll(r4)
                return r3
        }

        public final int b(@org.jetbrains.annotations.NotNull java.util.Collection<?> r4) {
                r3 = this;
                java.lang.String r0 = "c"
                kotlin.jvm.internal.g0.p(r4, r0)
                java.util.Iterator r4 = r4.iterator()
                r0 = 0
                r1 = 0
            Lb:
                boolean r2 = r4.hasNext()
                if (r2 == 0) goto L1f
                java.lang.Object r2 = r4.next()
                if (r2 == 0) goto L1c
                int r2 = r2.hashCode()
                goto L1d
            L1c:
                r2 = 0
            L1d:
                int r1 = r1 + r2
                goto Lb
            L1f:
                return r1
        }
    }

    static {
            kotlin.collections.k$a r0 = new kotlin.collections.k$a
            r1 = 0
            r0.<init>(r1)
            kotlin.collections.k.a = r0
            return
    }

    protected k() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof java.util.Set
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            kotlin.collections.k$a r0 = kotlin.collections.k.a
            java.util.Set r2 = (java.util.Set) r2
            boolean r2 = r0.a(r1, r2)
            return r2
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
            r1 = this;
            kotlin.collections.k$a r0 = kotlin.collections.k.a
            int r0 = r0.b(r1)
            return r0
    }

    @Override // kotlin.collections.b, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<E> iterator() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }
}
