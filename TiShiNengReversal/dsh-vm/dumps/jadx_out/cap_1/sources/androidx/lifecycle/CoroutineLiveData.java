package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class CoroutineLiveData<T> extends androidx.lifecycle.MediatorLiveData<T> {

    @org.jetbrains.annotations.Nullable
    private androidx.lifecycle.BlockRunner<T> blockRunner;

    @org.jetbrains.annotations.Nullable
    private androidx.lifecycle.EmittedSource emittedSource;


    public CoroutineLiveData(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r8, long r9, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.lifecycle.LiveDataScope<T>, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r11) {
            r7 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r11, r0)
            r7.<init>()
            kotlinx.coroutines.e2$b r0 = kotlinx.coroutines.e2.s0
            kotlin.coroutines.i$b r0 = r8.get(r0)
            kotlinx.coroutines.e2 r0 = (kotlinx.coroutines.e2) r0
            kotlinx.coroutines.b0 r0 = kotlinx.coroutines.d3.a(r0)
            kotlinx.coroutines.p2 r1 = kotlinx.coroutines.g1.e()
            kotlinx.coroutines.p2 r1 = r1.t()
            kotlin.coroutines.i r8 = r1.plus(r8)
            kotlin.coroutines.i r8 = r8.plus(r0)
            kotlinx.coroutines.r0 r5 = kotlinx.coroutines.s0.a(r8)
            androidx.lifecycle.BlockRunner r0 = new androidx.lifecycle.BlockRunner
            androidx.lifecycle.CoroutineLiveData$1 r6 = new androidx.lifecycle.CoroutineLiveData$1
            r6.<init>(r7)
            r1 = r7
            r3 = r9
            r2 = r11
            r0.<init>(r1, r2, r3, r5, r6)
            r1.blockRunner = r0
            return
    }

    public /* synthetic */ CoroutineLiveData(kotlin.coroutines.i r1, long r2, kotlin.jvm.functions.Function2 r4, int r5, kotlin.jvm.internal.v r6) {
            r0 = this;
            r6 = r5 & 1
            if (r6 == 0) goto L6
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
        L6:
            r5 = r5 & 2
            if (r5 == 0) goto Lc
            r2 = 5000(0x1388, double:2.4703E-320)
        Lc:
            r0.<init>(r1, r2, r4)
            return
    }

    public static final /* synthetic */ void access$setBlockRunner$p(androidx.lifecycle.CoroutineLiveData r0, androidx.lifecycle.BlockRunner r1) {
            r0.blockRunner = r1
            return
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object clearSource$lifecycle_livedata_ktx_release(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r5) {
            r4 = this;
            boolean r0 = r5 instanceof androidx.lifecycle.CoroutineLiveData$clearSource$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.lifecycle.CoroutineLiveData$clearSource$1 r0 = (androidx.lifecycle.CoroutineLiveData$clearSource$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.lifecycle.CoroutineLiveData$clearSource$1 r0 = new androidx.lifecycle.CoroutineLiveData$clearSource$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            androidx.lifecycle.CoroutineLiveData r0 = (androidx.lifecycle.CoroutineLiveData) r0
            kotlin.g0.n(r5)
            goto L48
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.g0.n(r5)
            androidx.lifecycle.EmittedSource r5 = r4.emittedSource
            if (r5 == 0) goto L47
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.disposeNow(r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            r0 = r4
        L48:
            r5 = 0
            r0.emittedSource = r5
            kotlin.n1 r5 = kotlin.n1.a
            return r5
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object emitSource$lifecycle_livedata_ktx_release(@org.jetbrains.annotations.NotNull androidx.lifecycle.LiveData<T> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlinx.coroutines.j1> r7) {
            r5 = this;
            boolean r0 = r7 instanceof androidx.lifecycle.CoroutineLiveData$emitSource$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.lifecycle.CoroutineLiveData$emitSource$1 r0 = (androidx.lifecycle.CoroutineLiveData$emitSource$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.lifecycle.CoroutineLiveData$emitSource$1 r0 = new androidx.lifecycle.CoroutineLiveData$emitSource$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.L$0
            androidx.lifecycle.CoroutineLiveData r6 = (androidx.lifecycle.CoroutineLiveData) r6
            kotlin.g0.n(r7)
            goto L66
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            java.lang.Object r6 = r0.L$1
            androidx.lifecycle.LiveData r6 = (androidx.lifecycle.LiveData) r6
            java.lang.Object r2 = r0.L$0
            androidx.lifecycle.CoroutineLiveData r2 = (androidx.lifecycle.CoroutineLiveData) r2
            kotlin.g0.n(r7)
            r7 = r6
            r6 = r2
            goto L58
        L46:
            kotlin.g0.n(r7)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r5.clearSource$lifecycle_livedata_ktx_release(r0)
            if (r7 != r1) goto L56
            goto L65
        L56:
            r7 = r6
            r6 = r5
        L58:
            r0.L$0 = r6
            r2 = 0
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r7 = androidx.lifecycle.CoroutineLiveDataKt.addDisposableSource(r6, r7, r0)
            if (r7 != r1) goto L66
        L65:
            return r1
        L66:
            androidx.lifecycle.EmittedSource r7 = (androidx.lifecycle.EmittedSource) r7
            r6.emittedSource = r7
            return r7
    }

    @Override // androidx.lifecycle.MediatorLiveData, androidx.lifecycle.LiveData
    protected void onActive() {
            r1 = this;
            super.onActive()
            androidx.lifecycle.BlockRunner<T> r0 = r1.blockRunner
            if (r0 == 0) goto La
            r0.maybeRun()
        La:
            return
    }

    @Override // androidx.lifecycle.MediatorLiveData, androidx.lifecycle.LiveData
    protected void onInactive() {
            r1 = this;
            super.onInactive()
            androidx.lifecycle.BlockRunner<T> r0 = r1.blockRunner
            if (r0 == 0) goto La
            r0.cancel()
        La:
            return
    }
}
