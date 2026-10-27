package androidx.work;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class JobListenableFuture<R> implements com.google.common.util.concurrent.ListenableFuture<R> {

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.e2 job;

    @org.jetbrains.annotations.NotNull
    private final androidx.work.impl.utils.futures.SettableFuture<R> underlying;


    public JobListenableFuture(@org.jetbrains.annotations.NotNull kotlinx.coroutines.e2 r2, @org.jetbrains.annotations.NotNull androidx.work.impl.utils.futures.SettableFuture<R> r3) {
            r1 = this;
            java.lang.String r0 = "job"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "underlying"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.job = r2
            r1.underlying = r3
            androidx.work.JobListenableFuture$1 r3 = new androidx.work.JobListenableFuture$1
            r3.<init>(r1)
            r2.k(r3)
            return
    }

    public /* synthetic */ JobListenableFuture(kotlinx.coroutines.e2 r1, androidx.work.impl.utils.futures.SettableFuture r2, int r3, kotlin.jvm.internal.v r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto Ld
            androidx.work.impl.utils.futures.SettableFuture r2 = androidx.work.impl.utils.futures.SettableFuture.create()
            java.lang.String r3 = "create()"
            kotlin.jvm.internal.g0.o(r2, r3)
        Ld:
            r0.<init>(r1, r2)
            return
    }

    public static final /* synthetic */ androidx.work.impl.utils.futures.SettableFuture access$getUnderlying$p(androidx.work.JobListenableFuture r0) {
            androidx.work.impl.utils.futures.SettableFuture<R> r0 = r0.underlying
            return r0
    }

    public void addListener(java.lang.Runnable r2, java.util.concurrent.Executor r3) {
            r1 = this;
            androidx.work.impl.utils.futures.SettableFuture<R> r0 = r1.underlying
            r0.addListener(r2, r3)
            return
    }

    public boolean cancel(boolean r2) {
            r1 = this;
            androidx.work.impl.utils.futures.SettableFuture<R> r0 = r1.underlying
            boolean r2 = r0.cancel(r2)
            return r2
    }

    public final void complete(R r2) {
            r1 = this;
            androidx.work.impl.utils.futures.SettableFuture<R> r0 = r1.underlying
            r0.set(r2)
            return
    }

    public R get() {
            r1 = this;
            androidx.work.impl.utils.futures.SettableFuture<R> r0 = r1.underlying
            java.lang.Object r0 = r0.get()
            return r0
    }

    public R get(long r2, java.util.concurrent.TimeUnit r4) {
            r1 = this;
            androidx.work.impl.utils.futures.SettableFuture<R> r0 = r1.underlying
            java.lang.Object r2 = r0.get(r2, r4)
            return r2
    }

    public boolean isCancelled() {
            r1 = this;
            androidx.work.impl.utils.futures.SettableFuture<R> r0 = r1.underlying
            boolean r0 = r0.isCancelled()
            return r0
    }

    public boolean isDone() {
            r1 = this;
            androidx.work.impl.utils.futures.SettableFuture<R> r0 = r1.underlying
            boolean r0 = r0.isDone()
            return r0
    }
}
