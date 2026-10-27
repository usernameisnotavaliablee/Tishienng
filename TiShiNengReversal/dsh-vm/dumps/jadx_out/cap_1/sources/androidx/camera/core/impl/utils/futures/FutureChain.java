package androidx.camera.core.impl.utils.futures;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class FutureChain<V> implements com.google.common.util.concurrent.ListenableFuture<V> {

    @androidx.annotation.Nullable
    androidx.concurrent.futures.CallbackToFutureAdapter.Completer<V> mCompleter;

    @androidx.annotation.NonNull
    private final com.google.common.util.concurrent.ListenableFuture<V> mDelegate;


    FutureChain() {
            r1 = this;
            r1.<init>()
            androidx.camera.core.impl.utils.futures.FutureChain$1 r0 = new androidx.camera.core.impl.utils.futures.FutureChain$1
            r0.<init>(r1)
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r0)
            r1.mDelegate = r0
            return
    }

    FutureChain(@androidx.annotation.NonNull com.google.common.util.concurrent.ListenableFuture<V> r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r1)
            com.google.common.util.concurrent.ListenableFuture r1 = (com.google.common.util.concurrent.ListenableFuture) r1
            r0.mDelegate = r1
            return
    }

    @androidx.annotation.NonNull
    public static <V> androidx.camera.core.impl.utils.futures.FutureChain<V> from(@androidx.annotation.NonNull com.google.common.util.concurrent.ListenableFuture<V> r1) {
            boolean r0 = r1 instanceof androidx.camera.core.impl.utils.futures.FutureChain
            if (r0 == 0) goto L7
            androidx.camera.core.impl.utils.futures.FutureChain r1 = (androidx.camera.core.impl.utils.futures.FutureChain) r1
            return r1
        L7:
            androidx.camera.core.impl.utils.futures.FutureChain r0 = new androidx.camera.core.impl.utils.futures.FutureChain
            r0.<init>(r1)
            return r0
    }

    public final void addCallback(@androidx.annotation.NonNull androidx.camera.core.impl.utils.futures.FutureCallback<? super V> r1, @androidx.annotation.NonNull java.util.concurrent.Executor r2) {
            r0 = this;
            androidx.camera.core.impl.utils.futures.Futures.addCallback(r0, r1, r2)
            return
    }

    public void addListener(@androidx.annotation.NonNull java.lang.Runnable r2, @androidx.annotation.NonNull java.util.concurrent.Executor r3) {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture<V> r0 = r1.mDelegate
            r0.addListener(r2, r3)
            return
    }

    public boolean cancel(boolean r2) {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture<V> r0 = r1.mDelegate
            boolean r2 = r0.cancel(r2)
            return r2
    }

    @androidx.annotation.Nullable
    public V get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture<V> r0 = r1.mDelegate
            java.lang.Object r0 = r0.get()
            return r0
    }

    @androidx.annotation.Nullable
    public V get(long r2, @androidx.annotation.NonNull java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture<V> r0 = r1.mDelegate
            java.lang.Object r2 = r0.get(r2, r4)
            return r2
    }

    public boolean isCancelled() {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture<V> r0 = r1.mDelegate
            boolean r0 = r0.isCancelled()
            return r0
    }

    public boolean isDone() {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture<V> r0 = r1.mDelegate
            boolean r0 = r0.isDone()
            return r0
    }

    boolean set(@androidx.annotation.Nullable V r2) {
            r1 = this;
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<V> r0 = r1.mCompleter
            if (r0 == 0) goto L9
            boolean r2 = r0.set(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    boolean setException(@androidx.annotation.NonNull java.lang.Throwable r2) {
            r1 = this;
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<V> r0 = r1.mCompleter
            if (r0 == 0) goto L9
            boolean r2 = r0.setException(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    @androidx.annotation.NonNull
    public final <T> androidx.camera.core.impl.utils.futures.FutureChain<T> transform(@androidx.annotation.NonNull androidx.arch.core.util.Function<? super V, T> r1, @androidx.annotation.NonNull java.util.concurrent.Executor r2) {
            r0 = this;
            com.google.common.util.concurrent.ListenableFuture r1 = androidx.camera.core.impl.utils.futures.Futures.transform(r0, r1, r2)
            androidx.camera.core.impl.utils.futures.FutureChain r1 = (androidx.camera.core.impl.utils.futures.FutureChain) r1
            return r1
    }

    @androidx.annotation.NonNull
    public final <T> androidx.camera.core.impl.utils.futures.FutureChain<T> transformAsync(@androidx.annotation.NonNull androidx.camera.core.impl.utils.futures.AsyncFunction<? super V, T> r1, @androidx.annotation.NonNull java.util.concurrent.Executor r2) {
            r0 = this;
            com.google.common.util.concurrent.ListenableFuture r1 = androidx.camera.core.impl.utils.futures.Futures.transformAsync(r0, r1, r2)
            androidx.camera.core.impl.utils.futures.FutureChain r1 = (androidx.camera.core.impl.utils.futures.FutureChain) r1
            return r1
    }
}
