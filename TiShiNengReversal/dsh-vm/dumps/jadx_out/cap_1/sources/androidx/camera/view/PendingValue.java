package androidx.camera.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(api = 21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class PendingValue<T> {

    @androidx.annotation.Nullable
    private androidx.core.util.Pair<androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void>, T> mCompleterAndValue;

    PendingValue() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ java.lang.Object a(androidx.camera.view.PendingValue r1, java.lang.Object r2, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r3) {
            androidx.core.util.Pair<androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void>, T> r0 = r1.mCompleterAndValue
            if (r0 == 0) goto Le
            F r0 = r0.first
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer r0 = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) r0
            java.util.Objects.requireNonNull(r0)
            r0.setCancelled()
        Le:
            androidx.core.util.Pair r0 = new androidx.core.util.Pair
            r0.<init>(r3, r2)
            r1.mCompleterAndValue = r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "PendingValue "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
    }

    @androidx.annotation.MainThread
    void propagateIfHasValue(androidx.arch.core.util.Function<T, com.google.common.util.concurrent.ListenableFuture<java.lang.Void>> r2) {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.core.util.Pair<androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void>, T> r0 = r1.mCompleterAndValue
            if (r0 == 0) goto L1e
            S r0 = r0.second
            java.lang.Object r2 = r2.apply(r0)
            com.google.common.util.concurrent.ListenableFuture r2 = (com.google.common.util.concurrent.ListenableFuture) r2
            androidx.core.util.Pair<androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void>, T> r0 = r1.mCompleterAndValue
            F r0 = r0.first
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer r0 = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) r0
            java.util.Objects.requireNonNull(r0)
            androidx.camera.core.impl.utils.futures.Futures.propagate(r2, r0)
            r2 = 0
            r1.mCompleterAndValue = r2
        L1e:
            return
    }

    @androidx.annotation.MainThread
    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setValue(@androidx.annotation.NonNull T r2) {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.view.k r0 = new androidx.camera.view.k
            r0.<init>(r1, r2)
            com.google.common.util.concurrent.ListenableFuture r2 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r0)
            return r2
    }
}
