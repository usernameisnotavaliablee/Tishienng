package com.google.android.datatransport.runtime.synchronization;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.WorkerThread
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface SynchronizationGuard {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface CriticalSection<T> {
        T execute();
    }

    <T> T runCriticalSection(com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection<T> r1);
}
