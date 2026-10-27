package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class LiveDataScopeImpl<T> implements androidx.lifecycle.LiveDataScope<T> {

    @org.jetbrains.annotations.NotNull
    private final kotlin.coroutines.i coroutineContext;

    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.CoroutineLiveData<T> target;

    public LiveDataScopeImpl(@org.jetbrains.annotations.NotNull androidx.lifecycle.CoroutineLiveData<T> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r3) {
            r1 = this;
            java.lang.String r0 = "target"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.target = r2
            kotlinx.coroutines.p2 r2 = kotlinx.coroutines.g1.e()
            kotlinx.coroutines.p2 r2 = r2.t()
            kotlin.coroutines.i r2 = r3.plus(r2)
            r1.coroutineContext = r2
            return
    }

    @Override // androidx.lifecycle.LiveDataScope
    @android.annotation.SuppressLint({"NullSafeMutableLiveData"})
    @org.jetbrains.annotations.Nullable
    public java.lang.Object emit(T r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r5) {
            r3 = this;
            kotlin.coroutines.i r0 = r3.coroutineContext
            androidx.lifecycle.LiveDataScopeImpl$emit$2 r1 = new androidx.lifecycle.LiveDataScopeImpl$emit$2
            r2 = 0
            r1.<init>(r3, r4, r2)
            java.lang.Object r4 = kotlinx.coroutines.i.h(r0, r1, r5)
            java.lang.Object r5 = kotlin.coroutines.intrinsics.a.l()
            if (r4 != r5) goto L13
            return r4
        L13:
            kotlin.n1 r4 = kotlin.n1.a
            return r4
    }

    @Override // androidx.lifecycle.LiveDataScope
    @org.jetbrains.annotations.Nullable
    public java.lang.Object emitSource(@org.jetbrains.annotations.NotNull androidx.lifecycle.LiveData<T> r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlinx.coroutines.j1> r5) {
            r3 = this;
            kotlin.coroutines.i r0 = r3.coroutineContext
            androidx.lifecycle.LiveDataScopeImpl$emitSource$2 r1 = new androidx.lifecycle.LiveDataScopeImpl$emitSource$2
            r2 = 0
            r1.<init>(r3, r4, r2)
            java.lang.Object r4 = kotlinx.coroutines.i.h(r0, r1, r5)
            return r4
    }

    @Override // androidx.lifecycle.LiveDataScope
    @org.jetbrains.annotations.Nullable
    public T getLatestValue() {
            r1 = this;
            androidx.lifecycle.CoroutineLiveData<T> r0 = r1.target
            java.lang.Object r0 = r0.getValue()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.CoroutineLiveData<T> getTarget$lifecycle_livedata_ktx_release() {
            r1 = this;
            androidx.lifecycle.CoroutineLiveData<T> r0 = r1.target
            return r0
    }

    public final void setTarget$lifecycle_livedata_ktx_release(@org.jetbrains.annotations.NotNull androidx.lifecycle.CoroutineLiveData<T> r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.target = r2
            return
    }
}
