package com.google.android.datatransport.runtime;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.datatransport.runtime.dagger.Module
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
abstract class ExecutionModule {
    ExecutionModule() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.android.datatransport.runtime.dagger.Provides
    @javax.inject.Singleton
    static java.util.concurrent.Executor executor() {
            com.google.android.datatransport.runtime.SafeLoggingExecutor r0 = new com.google.android.datatransport.runtime.SafeLoggingExecutor
            java.util.concurrent.ExecutorService r1 = java.util.concurrent.Executors.newSingleThreadExecutor()
            r0.<init>(r1)
            return r0
    }
}
