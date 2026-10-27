package com.google.common.io;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface ByteProcessor<T> {
    T getResult();

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    boolean processBytes(byte[] r1, int r2, int r3) throws java.io.IOException;
}
