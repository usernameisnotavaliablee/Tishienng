package io.reactivex.observables;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class GroupedObservable<K, T> extends io.reactivex.Observable<T> {
    final K key;

    protected GroupedObservable(K r1) {
            r0 = this;
            r0.<init>()
            r0.key = r1
            return
    }

    public K getKey() {
            r1 = this;
            K r0 = r1.key
            return r0
    }
}
