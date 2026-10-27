package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class y0<T> extends kotlinx.coroutines.a<T> implements kotlinx.coroutines.x0<T> {
    public y0(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r2, boolean r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0, r3)
            return
    }

    static /* synthetic */ <T> java.lang.Object A1(kotlinx.coroutines.y0<T> r0, kotlin.coroutines.e<? super T> r1) {
            java.lang.Object r0 = r0.f0(r1)
            kotlin.coroutines.intrinsics.a.l()
            return r0
    }

    @Override // kotlinx.coroutines.x0
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.selects.g<T> L() {
            r2 = this;
            kotlinx.coroutines.selects.g r0 = r2.B0()
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectClause1<T of kotlinx.coroutines.DeferredCoroutine>"
            kotlin.jvm.internal.g0.n(r0, r1)
            return r0
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
            java.lang.Object r1 = A1(r0, r1)
            return r1
    }
}
