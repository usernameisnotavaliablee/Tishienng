package kotlin.collections;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class b1<T> implements java.lang.Iterable<kotlin.collections.a1<? extends T>>, l3.a {

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function0<java.util.Iterator<T>> a;

    public b1(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends java.util.Iterator<? extends T>> r2) {
            r1 = this;
            java.lang.String r0 = "iteratorFactory"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            return
    }

    @Override // java.lang.Iterable
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<kotlin.collections.a1<T>> iterator() {
            r2 = this;
            kotlin.collections.c1 r0 = new kotlin.collections.c1
            kotlin.jvm.functions.Function0<java.util.Iterator<T>> r1 = r2.a
            java.lang.Object r1 = r1.invoke()
            java.util.Iterator r1 = (java.util.Iterator) r1
            r0.<init>(r1)
            return r0
    }
}
