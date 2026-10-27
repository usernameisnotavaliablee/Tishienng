package kotlin.collections;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class k0 extends kotlin.collections.j0 {
    public k0() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final <T> void i0(@org.jetbrains.annotations.NotNull java.util.Iterator<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, kotlin.n1> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.g0.p(r2, r0)
        La:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r1.next()
            r2.invoke(r0)
            goto La
        L18:
            return
    }

    @kotlin.internal.InlineOnly
    private static final <T> java.util.Iterator<T> j0(java.util.Iterator<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.Iterator<kotlin.collections.a1<T>> k0(@org.jetbrains.annotations.NotNull java.util.Iterator<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.collections.c1 r0 = new kotlin.collections.c1
            r0.<init>(r1)
            return r0
    }
}
