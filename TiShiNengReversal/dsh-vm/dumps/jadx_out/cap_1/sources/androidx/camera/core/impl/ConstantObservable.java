package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ConstantObservable<T> implements androidx.camera.core.impl.Observable<T> {
    private static final androidx.camera.core.impl.ConstantObservable<java.lang.Object> NULL_OBSERVABLE = null;
    private static final java.lang.String TAG = "ConstantObservable";
    private final com.google.common.util.concurrent.ListenableFuture<T> mValueFuture;

    static {
            androidx.camera.core.impl.ConstantObservable r0 = new androidx.camera.core.impl.ConstantObservable
            r1 = 0
            r0.<init>(r1)
            androidx.camera.core.impl.ConstantObservable.NULL_OBSERVABLE = r0
            return
    }

    private ConstantObservable(@androidx.annotation.Nullable T r1) {
            r0 = this;
            r0.<init>()
            com.google.common.util.concurrent.ListenableFuture r1 = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(r1)
            r0.mValueFuture = r1
            return
    }

    public static /* synthetic */ void a(androidx.camera.core.impl.ConstantObservable r0, androidx.camera.core.impl.Observable.Observer r1) {
            r0.getClass()
            com.google.common.util.concurrent.ListenableFuture<T> r0 = r0.mValueFuture     // Catch: java.lang.InterruptedException -> Ld java.util.concurrent.ExecutionException -> Lf
            java.lang.Object r0 = r0.get()     // Catch: java.lang.InterruptedException -> Ld java.util.concurrent.ExecutionException -> Lf
            r1.onNewData(r0)     // Catch: java.lang.InterruptedException -> Ld java.util.concurrent.ExecutionException -> Lf
            return
        Ld:
            r0 = move-exception
            goto L10
        Lf:
            r0 = move-exception
        L10:
            r1.onError(r0)
            return
    }

    @androidx.annotation.NonNull
    public static <U> androidx.camera.core.impl.Observable<U> withValue(@androidx.annotation.Nullable U r1) {
            if (r1 != 0) goto L5
            androidx.camera.core.impl.ConstantObservable<java.lang.Object> r1 = androidx.camera.core.impl.ConstantObservable.NULL_OBSERVABLE
            return r1
        L5:
            androidx.camera.core.impl.ConstantObservable r0 = new androidx.camera.core.impl.ConstantObservable
            r0.<init>(r1)
            return r0
    }

    @Override // androidx.camera.core.impl.Observable
    public void addObserver(@androidx.annotation.NonNull java.util.concurrent.Executor r3, @androidx.annotation.NonNull androidx.camera.core.impl.Observable.Observer<? super T> r4) {
            r2 = this;
            com.google.common.util.concurrent.ListenableFuture<T> r0 = r2.mValueFuture
            androidx.camera.core.impl.p r1 = new androidx.camera.core.impl.p
            r1.<init>(r2, r4)
            r0.addListener(r1, r3)
            return
    }

    @Override // androidx.camera.core.impl.Observable
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<T> fetchData() {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture<T> r0 = r1.mValueFuture
            return r0
    }

    @Override // androidx.camera.core.impl.Observable
    public void removeObserver(@androidx.annotation.NonNull androidx.camera.core.impl.Observable.Observer<? super T> r1) {
            r0 = this;
            return
    }
}
