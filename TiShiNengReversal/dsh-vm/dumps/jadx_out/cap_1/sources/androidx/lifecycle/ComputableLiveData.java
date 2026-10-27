package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class ComputableLiveData<T> {

    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<T> _liveData;

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.atomic.AtomicBoolean computing;

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.Executor executor;

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.atomic.AtomicBoolean invalid;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final java.lang.Runnable invalidationRunnable;

    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<T> liveData;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final java.lang.Runnable refreshRunnable;

    @kotlin.jvm.JvmOverloads
    public ComputableLiveData() {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            return
    }

    @kotlin.jvm.JvmOverloads
    public ComputableLiveData(@org.jetbrains.annotations.NotNull java.util.concurrent.Executor r2) {
            r1 = this;
            java.lang.String r0 = "executor"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.executor = r2
            androidx.lifecycle.ComputableLiveData$_liveData$1 r2 = new androidx.lifecycle.ComputableLiveData$_liveData$1
            r2.<init>(r1)
            r1._liveData = r2
            r1.liveData = r2
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 1
            r2.<init>(r0)
            r1.invalid = r2
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 0
            r2.<init>(r0)
            r1.computing = r2
            androidx.lifecycle.a r2 = new androidx.lifecycle.a
            r2.<init>(r1)
            r1.refreshRunnable = r2
            androidx.lifecycle.b r2 = new androidx.lifecycle.b
            r2.<init>(r1)
            r1.invalidationRunnable = r2
            return
    }

    public /* synthetic */ ComputableLiveData(java.util.concurrent.Executor r1, int r2, kotlin.jvm.internal.v r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto Ld
            java.util.concurrent.Executor r1 = androidx.arch.core.executor.ArchTaskExecutor.getIOThreadExecutor()
            java.lang.String r2 = "getIOThreadExecutor()"
            kotlin.jvm.internal.g0.o(r1, r2)
        Ld:
            r0.<init>(r1)
            return
    }

    public static /* synthetic */ void a(androidx.lifecycle.ComputableLiveData r0) {
            refreshRunnable$lambda$0(r0)
            return
    }

    public static /* synthetic */ void b(androidx.lifecycle.ComputableLiveData r0) {
            invalidationRunnable$lambda$1(r0)
            return
    }

    @androidx.annotation.VisibleForTesting
    public static /* synthetic */ void getInvalidationRunnable$lifecycle_livedata_release$annotations() {
            return
    }

    @androidx.annotation.VisibleForTesting
    public static /* synthetic */ void getRefreshRunnable$lifecycle_livedata_release$annotations() {
            return
    }

    private static final void invalidationRunnable$lambda$1(androidx.lifecycle.ComputableLiveData r4) {
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.g0.p(r4, r0)
            androidx.lifecycle.LiveData r0 = r4.getLiveData()
            boolean r0 = r0.hasActiveObservers()
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.invalid
            r2 = 0
            r3 = 1
            boolean r1 = r1.compareAndSet(r2, r3)
            if (r1 == 0) goto L20
            if (r0 == 0) goto L20
            java.util.concurrent.Executor r0 = r4.executor
            java.lang.Runnable r4 = r4.refreshRunnable
            r0.execute(r4)
        L20:
            return
    }

    private static final void refreshRunnable$lambda$0(androidx.lifecycle.ComputableLiveData r5) {
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.g0.p(r5, r0)
        L5:
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.computing
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L37
            r0 = 0
            r3 = 0
        L11:
            java.util.concurrent.atomic.AtomicBoolean r4 = r5.invalid     // Catch: java.lang.Throwable -> L1f
            boolean r4 = r4.compareAndSet(r2, r1)     // Catch: java.lang.Throwable -> L1f
            if (r4 == 0) goto L21
            java.lang.Object r0 = r5.compute()     // Catch: java.lang.Throwable -> L1f
            r3 = 1
            goto L11
        L1f:
            r0 = move-exception
            goto L31
        L21:
            if (r3 == 0) goto L2a
            androidx.lifecycle.LiveData r2 = r5.getLiveData()     // Catch: java.lang.Throwable -> L1f
            r2.postValue(r0)     // Catch: java.lang.Throwable -> L1f
        L2a:
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.computing
            r0.set(r1)
            r1 = r3
            goto L37
        L31:
            java.util.concurrent.atomic.AtomicBoolean r5 = r5.computing
            r5.set(r1)
            throw r0
        L37:
            if (r1 == 0) goto L41
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.invalid
            boolean r0 = r0.get()
            if (r0 != 0) goto L5
        L41:
            return
    }

    @androidx.annotation.WorkerThread
    protected abstract T compute();

    @org.jetbrains.annotations.NotNull
    public final java.util.concurrent.atomic.AtomicBoolean getComputing$lifecycle_livedata_release() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.computing
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.concurrent.Executor getExecutor$lifecycle_livedata_release() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.executor
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.concurrent.atomic.AtomicBoolean getInvalid$lifecycle_livedata_release() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.invalid
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.LiveData<T> getLiveData() {
            r1 = this;
            androidx.lifecycle.LiveData<T> r0 = r1.liveData
            return r0
    }

    public void invalidate() {
            r2 = this;
            androidx.arch.core.executor.ArchTaskExecutor r0 = androidx.arch.core.executor.ArchTaskExecutor.getInstance()
            java.lang.Runnable r1 = r2.invalidationRunnable
            r0.executeOnMainThread(r1)
            return
    }
}
