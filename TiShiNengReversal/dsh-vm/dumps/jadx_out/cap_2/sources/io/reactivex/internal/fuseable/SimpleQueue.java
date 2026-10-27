package io.reactivex.internal.fuseable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface SimpleQueue<T> {
    void clear();

    boolean isEmpty();

    boolean offer(T r1);

    boolean offer(T r1, T r2);

    T poll() throws java.lang.Exception;
}
