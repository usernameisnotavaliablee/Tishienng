package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class BlockRunner<T> {

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function2<androidx.lifecycle.LiveDataScope<T>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> block;

    @org.jetbrains.annotations.Nullable
    private kotlinx.coroutines.e2 cancellationJob;

    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.CoroutineLiveData<T> liveData;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function0<kotlin.n1> onDone;

    @org.jetbrains.annotations.Nullable
    private kotlinx.coroutines.e2 runningJob;

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.r0 scope;
    private final long timeoutInMs;

    public BlockRunner(@org.jetbrains.annotations.NotNull androidx.lifecycle.CoroutineLiveData<T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.lifecycle.LiveDataScope<T>, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r3, long r4, @org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.n1> r7) {
            r1 = this;
            java.lang.String r0 = "liveData"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "scope"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "onDone"
            kotlin.jvm.internal.g0.p(r7, r0)
            r1.<init>()
            r1.liveData = r2
            r1.block = r3
            r1.timeoutInMs = r4
            r1.scope = r6
            r1.onDone = r7
            return
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function2 access$getBlock$p(androidx.lifecycle.BlockRunner r0) {
            kotlin.jvm.functions.Function2<androidx.lifecycle.LiveDataScope<T>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> r0 = r0.block
            return r0
    }

    public static final /* synthetic */ androidx.lifecycle.CoroutineLiveData access$getLiveData$p(androidx.lifecycle.BlockRunner r0) {
            androidx.lifecycle.CoroutineLiveData<T> r0 = r0.liveData
            return r0
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function0 access$getOnDone$p(androidx.lifecycle.BlockRunner r0) {
            kotlin.jvm.functions.Function0<kotlin.n1> r0 = r0.onDone
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.e2 access$getRunningJob$p(androidx.lifecycle.BlockRunner r0) {
            kotlinx.coroutines.e2 r0 = r0.runningJob
            return r0
    }

    public static final /* synthetic */ long access$getTimeoutInMs$p(androidx.lifecycle.BlockRunner r2) {
            long r0 = r2.timeoutInMs
            return r0
    }

    public static final /* synthetic */ void access$setRunningJob$p(androidx.lifecycle.BlockRunner r0, kotlinx.coroutines.e2 r1) {
            r0.runningJob = r1
            return
    }

    @androidx.annotation.MainThread
    public final void cancel() {
            r7 = this;
            kotlinx.coroutines.e2 r0 = r7.cancellationJob
            if (r0 != 0) goto L1e
            kotlinx.coroutines.r0 r1 = r7.scope
            kotlinx.coroutines.p2 r0 = kotlinx.coroutines.g1.e()
            kotlinx.coroutines.p2 r2 = r0.t()
            androidx.lifecycle.BlockRunner$cancel$1 r4 = new androidx.lifecycle.BlockRunner$cancel$1
            r0 = 0
            r4.<init>(r7, r0)
            r5 = 2
            r6 = 0
            r3 = 0
            kotlinx.coroutines.e2 r0 = kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
            r7.cancellationJob = r0
            return
        L1e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cancel call cannot happen without a maybeRun"
            r0.<init>(r1)
            throw r0
    }

    @androidx.annotation.MainThread
    public final void maybeRun() {
            r8 = this;
            kotlinx.coroutines.e2 r0 = r8.cancellationJob
            r1 = 0
            if (r0 == 0) goto L9
            r2 = 1
            kotlinx.coroutines.e2.a.b(r0, r1, r2, r1)
        L9:
            r8.cancellationJob = r1
            kotlinx.coroutines.e2 r0 = r8.runningJob
            if (r0 == 0) goto L10
            return
        L10:
            kotlinx.coroutines.r0 r2 = r8.scope
            androidx.lifecycle.BlockRunner$maybeRun$1 r5 = new androidx.lifecycle.BlockRunner$maybeRun$1
            r5.<init>(r8, r1)
            r6 = 3
            r7 = 0
            r3 = 0
            r4 = 0
            kotlinx.coroutines.e2 r0 = kotlinx.coroutines.i.e(r2, r3, r4, r5, r6, r7)
            r8.runningJob = r0
            return
    }
}
