package kotlin.sequences;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.3")
@kotlin.coroutines.RestrictsSuspension
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class o<T> {
    public o() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object c(T r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2);

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object e(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r3) {
            r1 = this;
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L10
            r0 = r2
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L10
            kotlin.n1 r2 = kotlin.n1.a
            return r2
        L10:
            java.util.Iterator r2 = r2.iterator()
            java.lang.Object r2 = r1.f(r2, r3)
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.l()
            if (r2 != r3) goto L1f
            return r2
        L1f:
            kotlin.n1 r2 = kotlin.n1.a
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object f(@org.jetbrains.annotations.NotNull java.util.Iterator<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2);

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object g(@org.jetbrains.annotations.NotNull kotlin.sequences.m<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2) {
            r0 = this;
            java.util.Iterator r1 = r1.iterator()
            java.lang.Object r1 = r0.f(r1, r2)
            java.lang.Object r2 = kotlin.coroutines.intrinsics.a.l()
            if (r1 != r2) goto Lf
            return r1
        Lf:
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }
}
