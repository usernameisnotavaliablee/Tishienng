package com.google.android.datatransport.runtime.scheduling.persistence;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.WorkerThread
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface EventStore extends java.io.Closeable {
    int cleanUp();

    long getNextCallTime(com.google.android.datatransport.runtime.TransportContext r1);

    boolean hasPendingEventsFor(com.google.android.datatransport.runtime.TransportContext r1);

    java.lang.Iterable<com.google.android.datatransport.runtime.TransportContext> loadActiveContexts();

    java.lang.Iterable<com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent> loadBatch(com.google.android.datatransport.runtime.TransportContext r1);

    @androidx.annotation.Nullable
    com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent persist(com.google.android.datatransport.runtime.TransportContext r1, com.google.android.datatransport.runtime.EventInternal r2);

    void recordFailure(java.lang.Iterable<com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent> r1);

    void recordNextCallTime(com.google.android.datatransport.runtime.TransportContext r1, long r2);

    void recordSuccess(java.lang.Iterable<com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent> r1);
}
