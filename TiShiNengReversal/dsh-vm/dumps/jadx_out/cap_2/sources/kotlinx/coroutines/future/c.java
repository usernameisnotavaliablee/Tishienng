package kotlinx.coroutines.future;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class c<T> extends kotlinx.coroutines.a<T> implements java.util.function.BiFunction<T, java.lang.Throwable, kotlin.n1> {

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.CompletableFuture<T> d;

    public c(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r2, @org.jetbrains.annotations.NotNull java.util.concurrent.CompletableFuture<T> r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0, r0)
            r1.d = r3
            return
    }

    public void A1(@org.jetbrains.annotations.Nullable T r1, @org.jetbrains.annotations.Nullable java.lang.Throwable r2) {
            r0 = this;
            r1 = 0
            r2 = 1
            kotlinx.coroutines.e2.a.b(r0, r1, r2, r1)
            return
    }

    @Override // java.util.function.BiFunction
    public /* bridge */ /* synthetic */ kotlin.n1 apply(java.lang.Object r1, java.lang.Throwable r2) {
            r0 = this;
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r0.A1(r1, r2)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    @Override // kotlinx.coroutines.a
    protected void x1(@org.jetbrains.annotations.NotNull java.lang.Throwable r1, boolean r2) {
            r0 = this;
            java.util.concurrent.CompletableFuture<T> r2 = r0.d
            kotlinx.coroutines.future.b.a(r2, r1)
            return
    }

    @Override // kotlinx.coroutines.a
    protected void y1(T r2) {
            r1 = this;
            java.util.concurrent.CompletableFuture<T> r0 = r1.d
            kotlinx.coroutines.future.a.a(r0, r2)
            return
    }
}
