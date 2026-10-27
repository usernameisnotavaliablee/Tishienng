package io.reactivex.internal.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface QueueDrain<T, U> {
    boolean accept(org.reactivestreams.Subscriber<? super U> r1, T r2);

    boolean cancelled();

    boolean done();

    boolean enter();

    java.lang.Throwable error();

    int leave(int r1);

    long produced(long r1);

    long requested();
}
