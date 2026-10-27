package io.netty.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface Attribute<T> {
    boolean compareAndSet(T r1, T r2);

    T get();

    @java.lang.Deprecated
    T getAndRemove();

    T getAndSet(T r1);

    io.netty.util.AttributeKey<T> key();

    @java.lang.Deprecated
    void remove();

    void set(T r1);

    T setIfAbsent(T r1);
}
