package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface Observable<T> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Observer<T> {
        void onError(@androidx.annotation.NonNull java.lang.Throwable r1);

        void onNewData(@androidx.annotation.Nullable T r1);
    }

    void addObserver(@androidx.annotation.NonNull java.util.concurrent.Executor r1, @androidx.annotation.NonNull androidx.camera.core.impl.Observable.Observer<? super T> r2);

    @androidx.annotation.NonNull
    com.google.common.util.concurrent.ListenableFuture<T> fetchData();

    void removeObserver(@androidx.annotation.NonNull androidx.camera.core.impl.Observable.Observer<? super T> r1);
}
