package kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.7")
@kotlin.coroutines.RestrictsSuspension
@kotlin.WasExperimental(markerClass = {kotlin.ExperimentalStdlibApi.class})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class j<T, R> {
    private j() {
            r0 = this;
            r0.<init>()
            return
    }

    public /* synthetic */ j(kotlin.jvm.internal.v r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object b(T r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r2);

    @org.jetbrains.annotations.Nullable
    public abstract <U, S> java.lang.Object c(@org.jetbrains.annotations.NotNull kotlin.h<U, S> r1, U r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super S> r3);

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "'invoke' should not be called from DeepRecursiveScope. Use 'callRecursive' to do recursion in the heap instead of the call stack.", replaceWith = @kotlin.ReplaceWith(expression = "this.callRecursive(value)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public final java.lang.Void d(@org.jetbrains.annotations.NotNull kotlin.h<?, ?> r1, @org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r0 = this;
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r2)
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Should not be called from DeepRecursiveScope"
            r1.<init>(r2)
            throw r1
    }
}
