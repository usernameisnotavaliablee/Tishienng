package com.google.common.cache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
interface ReferenceEntry<K, V> {
    long getAccessTime();

    int getHash();

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    K getKey();

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    com.google.common.cache.ReferenceEntry<K, V> getNext();

    com.google.common.cache.ReferenceEntry<K, V> getNextInAccessQueue();

    com.google.common.cache.ReferenceEntry<K, V> getNextInWriteQueue();

    com.google.common.cache.ReferenceEntry<K, V> getPreviousInAccessQueue();

    com.google.common.cache.ReferenceEntry<K, V> getPreviousInWriteQueue();

    com.google.common.cache.LocalCache.ValueReference<K, V> getValueReference();

    long getWriteTime();

    void setAccessTime(long r1);

    void setNextInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> r1);

    void setNextInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> r1);

    void setPreviousInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> r1);

    void setPreviousInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> r1);

    void setValueReference(com.google.common.cache.LocalCache.ValueReference<K, V> r1);

    void setWriteTime(long r1);
}
