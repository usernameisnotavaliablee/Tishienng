package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class CoroutineLiveDataKt {
    public static final long DEFAULT_TIMEOUT = 5000;

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object addDisposableSource(@org.jetbrains.annotations.NotNull androidx.lifecycle.MediatorLiveData<T> r3, @org.jetbrains.annotations.NotNull androidx.lifecycle.LiveData<T> r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super androidx.lifecycle.EmittedSource> r5) {
            kotlinx.coroutines.p2 r0 = kotlinx.coroutines.g1.e()
            kotlinx.coroutines.p2 r0 = r0.t()
            androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2 r1 = new androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2
            r2 = 0
            r1.<init>(r3, r4, r2)
            java.lang.Object r3 = kotlinx.coroutines.i.h(r0, r1, r5)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> androidx.lifecycle.LiveData<T> liveData(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r1, long r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.lifecycle.LiveDataScope<T>, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r4) {
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r4, r0)
            androidx.lifecycle.CoroutineLiveData r0 = new androidx.lifecycle.CoroutineLiveData
            r0.<init>(r1, r2, r4)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @org.jetbrains.annotations.NotNull
    public static final <T> androidx.lifecycle.LiveData<T> liveData(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r3, @org.jetbrains.annotations.NotNull java.time.Duration r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.lifecycle.LiveDataScope<T>, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r5) {
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "timeout"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r5, r0)
            androidx.lifecycle.CoroutineLiveData r0 = new androidx.lifecycle.CoroutineLiveData
            androidx.lifecycle.Api26Impl r1 = androidx.lifecycle.Api26Impl.INSTANCE
            long r1 = r1.toMillis(r4)
            r0.<init>(r3, r1, r5)
            return r0
    }

    public static /* synthetic */ androidx.lifecycle.LiveData liveData$default(kotlin.coroutines.i r0, long r1, kotlin.jvm.functions.Function2 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
        L6:
            r4 = r4 & 2
            if (r4 == 0) goto Lc
            r1 = 5000(0x1388, double:2.4703E-320)
        Lc:
            androidx.lifecycle.LiveData r0 = liveData(r0, r1, r3)
            return r0
    }

    public static /* synthetic */ androidx.lifecycle.LiveData liveData$default(kotlin.coroutines.i r0, java.time.Duration r1, kotlin.jvm.functions.Function2 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L6
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
        L6:
            androidx.lifecycle.LiveData r0 = liveData(r0, r1, r2)
            return r0
    }
}
