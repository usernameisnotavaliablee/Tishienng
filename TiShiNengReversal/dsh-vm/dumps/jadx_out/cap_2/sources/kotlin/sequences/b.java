package kotlin.sequences;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class b<T, K> extends kotlin.collections.c<T> {

    @org.jetbrains.annotations.NotNull
    private final java.util.Iterator<T> c;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<T, K> d;

    @org.jetbrains.annotations.NotNull
    private final java.util.HashSet<K> e;

    public b(@org.jetbrains.annotations.NotNull java.util.Iterator<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends K> r3) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "keySelector"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.c = r2
            r1.d = r3
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r1.e = r2
            return
    }

    @Override // kotlin.collections.c
    protected void a() {
            r3 = this;
        L0:
            java.util.Iterator<T> r0 = r3.c
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L20
            java.util.Iterator<T> r0 = r3.c
            java.lang.Object r0 = r0.next()
            kotlin.jvm.functions.Function1<T, K> r1 = r3.d
            java.lang.Object r1 = r1.invoke(r0)
            java.util.HashSet<K> r2 = r3.e
            boolean r1 = r2.add(r1)
            if (r1 == 0) goto L0
            r3.e(r0)
            return
        L20:
            r3.c()
            return
    }
}
