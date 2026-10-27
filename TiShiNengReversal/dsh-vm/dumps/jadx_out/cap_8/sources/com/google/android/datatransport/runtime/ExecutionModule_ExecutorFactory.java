package com.google.android.datatransport.runtime;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class ExecutionModule_ExecutorFactory implements com.google.android.datatransport.runtime.dagger.internal.Factory<java.util.concurrent.Executor> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class InstanceHolder {
        private static final com.google.android.datatransport.runtime.ExecutionModule_ExecutorFactory INSTANCE = null;

        static {
                com.google.android.datatransport.runtime.ExecutionModule_ExecutorFactory r0 = new com.google.android.datatransport.runtime.ExecutionModule_ExecutorFactory
                r0.<init>()
                com.google.android.datatransport.runtime.ExecutionModule_ExecutorFactory.InstanceHolder.INSTANCE = r0
                return
        }

        private InstanceHolder() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ com.google.android.datatransport.runtime.ExecutionModule_ExecutorFactory access$000() {
                com.google.android.datatransport.runtime.ExecutionModule_ExecutorFactory r0 = com.google.android.datatransport.runtime.ExecutionModule_ExecutorFactory.InstanceHolder.INSTANCE
                return r0
        }
    }

    public ExecutionModule_ExecutorFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.datatransport.runtime.ExecutionModule_ExecutorFactory create() {
            com.google.android.datatransport.runtime.ExecutionModule_ExecutorFactory r0 = com.google.android.datatransport.runtime.ExecutionModule_ExecutorFactory.InstanceHolder.access$000()
            return r0
    }

    public static java.util.concurrent.Executor executor() {
            java.util.concurrent.Executor r0 = com.google.android.datatransport.runtime.ExecutionModule.executor()
            java.lang.String r1 = "Cannot return null from a non-@Nullable @Provides method"
            java.lang.Object r0 = com.google.android.datatransport.runtime.dagger.internal.Preconditions.checkNotNull(r0, r1)
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object get() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.m45get()
            return r0
    }

    /* renamed from: get, reason: collision with other method in class */
    public java.util.concurrent.Executor m45get() {
            r1 = this;
            java.util.concurrent.Executor r0 = executor()
            return r0
    }
}
