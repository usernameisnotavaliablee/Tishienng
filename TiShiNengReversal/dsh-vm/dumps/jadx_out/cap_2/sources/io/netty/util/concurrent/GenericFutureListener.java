package io.netty.util.concurrent;

import io.netty.util.concurrent.Future;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface GenericFutureListener<F extends io.netty.util.concurrent.Future<?>> extends java.util.EventListener {
    void operationComplete(F r1) throws java.lang.Exception;
}
