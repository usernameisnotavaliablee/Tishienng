package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class z<T> extends kotlinx.coroutines.l2 implements kotlinx.coroutines.y<T> {
    public z(@org.jetbrains.annotations.Nullable kotlinx.coroutines.e2 r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            r1.K0(r2)
            return
    }

    @Override // kotlinx.coroutines.l2
    public boolean D0() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // kotlinx.coroutines.x0
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.selects.g<T> L() {
            r2 = this;
            kotlinx.coroutines.selects.g r0 = r2.B0()
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectClause1<T of kotlinx.coroutines.CompletableDeferredImpl>"
            kotlin.jvm.internal.g0.n(r0, r1)
            return r0
    }

    @Override // kotlinx.coroutines.y
    public boolean c(@org.jetbrains.annotations.NotNull java.lang.Throwable r5) {
            r4 = this;
            kotlinx.coroutines.d0 r0 = new kotlinx.coroutines.d0
            r1 = 2
            r2 = 0
            r3 = 0
            r0.<init>(r5, r3, r1, r2)
            boolean r5 = r4.T0(r0)
            return r5
    }

    @Override // kotlinx.coroutines.x0
    public T d() {
            r1 = this;
            java.lang.Object r0 = r1.v0()
            return r0
    }

    @Override // kotlinx.coroutines.x0
    @org.jetbrains.annotations.Nullable
    public java.lang.Object f(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r1) {
            r0 = this;
            java.lang.Object r1 = r0.f0(r1)
            kotlin.coroutines.intrinsics.a.l()
            return r1
    }

    @Override // kotlinx.coroutines.y
    public boolean p(T r1) {
            r0 = this;
            boolean r1 = r0.T0(r1)
            return r1
    }
}
