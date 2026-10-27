package com.google.firebase.components;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface ComponentContainer {
    <T> T get(java.lang.Class<T> r1);

    <T> com.google.firebase.inject.Deferred<T> getDeferred(java.lang.Class<T> r1);

    <T> com.google.firebase.inject.Provider<T> getProvider(java.lang.Class<T> r1);

    <T> java.util.Set<T> setOf(java.lang.Class<T> r1);

    <T> com.google.firebase.inject.Provider<java.util.Set<T>> setOfProvider(java.lang.Class<T> r1);
}
