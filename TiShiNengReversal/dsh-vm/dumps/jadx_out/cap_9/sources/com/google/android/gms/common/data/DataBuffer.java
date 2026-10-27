package com.google.android.gms.common.data;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface DataBuffer<T> extends java.lang.Iterable<T>, com.google.android.gms.common.api.Releasable, java.io.Closeable {
    void close();

    @androidx.annotation.NonNull
    T get(int r1);

    int getCount();

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    android.os.Bundle getMetadata();

    @java.lang.Deprecated
    boolean isClosed();

    @Override // java.lang.Iterable
    @androidx.annotation.NonNull
    java.util.Iterator<T> iterator();

    void release();

    @androidx.annotation.NonNull
    java.util.Iterator<T> singleRefIterator();
}
