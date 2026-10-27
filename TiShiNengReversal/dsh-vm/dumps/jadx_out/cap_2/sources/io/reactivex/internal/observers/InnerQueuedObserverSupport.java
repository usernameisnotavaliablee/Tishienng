package io.reactivex.internal.observers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface InnerQueuedObserverSupport<T> {
    void drain();

    void innerComplete(io.reactivex.internal.observers.InnerQueuedObserver<T> r1);

    void innerError(io.reactivex.internal.observers.InnerQueuedObserver<T> r1, java.lang.Throwable r2);

    void innerNext(io.reactivex.internal.observers.InnerQueuedObserver<T> r1, T r2);
}
