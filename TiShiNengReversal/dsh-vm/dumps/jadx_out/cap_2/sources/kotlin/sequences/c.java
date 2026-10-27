package kotlin.sequences;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class c<T, K> implements kotlin.sequences.m<T> {

    @org.jetbrains.annotations.NotNull
    private final kotlin.sequences.m<T> a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<T, K> b;

    public c(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends K> r3) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "keySelector"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            return
    }

    @Override // kotlin.sequences.m
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<T> iterator() {
            r3 = this;
            kotlin.sequences.b r0 = new kotlin.sequences.b
            kotlin.sequences.m<T> r1 = r3.a
            java.util.Iterator r1 = r1.iterator()
            kotlin.jvm.functions.Function1<T, K> r2 = r3.b
            r0.<init>(r1, r2)
            return r0
    }
}
