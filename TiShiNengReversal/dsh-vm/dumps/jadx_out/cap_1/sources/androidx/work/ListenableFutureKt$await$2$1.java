package androidx.work;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ListenableFutureKt$await$2$1 implements java.lang.Runnable {
    final /* synthetic */ kotlinx.coroutines.p<R> $cancellableContinuation;
    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture<R> $this_await;

    public ListenableFutureKt$await$2$1(kotlinx.coroutines.p<? super R> r1, com.google.common.util.concurrent.ListenableFuture<R> r2) {
            r0 = this;
            r0.$cancellableContinuation = r1
            r0.$this_await = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            kotlinx.coroutines.p<R> r0 = r3.$cancellableContinuation     // Catch: java.lang.Throwable -> L12
            com.google.common.util.concurrent.ListenableFuture<R> r1 = r3.$this_await     // Catch: java.lang.Throwable -> L12
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L12
            kotlin.Result$a r2 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L12
            java.lang.Object r1 = kotlin.Result.constructor-impl(r1)     // Catch: java.lang.Throwable -> L12
            r0.resumeWith(r1)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 != 0) goto L1a
            r1 = r0
        L1a:
            boolean r0 = r0 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L24
            kotlinx.coroutines.p<R> r0 = r3.$cancellableContinuation
            r0.a(r1)
            goto L33
        L24:
            kotlinx.coroutines.p<R> r0 = r3.$cancellableContinuation
            kotlin.Result$a r2 = kotlin.Result.Companion
            java.lang.Object r1 = kotlin.g0.a(r1)
            java.lang.Object r1 = kotlin.Result.constructor-impl(r1)
            r0.resumeWith(r1)
        L33:
            return
    }
}
