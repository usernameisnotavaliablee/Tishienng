package androidx.work.impl.utils.taskexecutor;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface TaskExecutor {
    void executeOnBackgroundThread(java.lang.Runnable r1);

    androidx.work.impl.utils.SerialExecutor getBackgroundExecutor();

    java.util.concurrent.Executor getMainThreadExecutor();

    void postToMainThread(java.lang.Runnable r1);
}
