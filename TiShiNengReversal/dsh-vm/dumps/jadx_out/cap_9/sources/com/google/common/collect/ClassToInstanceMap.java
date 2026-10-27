package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface ClassToInstanceMap<B> extends java.util.Map<java.lang.Class<? extends B>, B> {
    <T extends B> T getInstance(java.lang.Class<T> r1);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    <T extends B> T putInstance(java.lang.Class<T> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl T r2);
}
