package com.google.common.reflect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.Beta
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface TypeToInstanceMap<B> extends java.util.Map<com.google.common.reflect.TypeToken<? extends B>, B> {
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    <T extends B> T getInstance(com.google.common.reflect.TypeToken<T> r1);

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    <T extends B> T getInstance(java.lang.Class<T> r1);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    <T extends B> T putInstance(com.google.common.reflect.TypeToken<T> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl T r2);

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    <T extends B> T putInstance(java.lang.Class<T> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl T r2);
}
