package androidx.arch.core.executor;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class TaskExecutor {
    public TaskExecutor() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void executeOnDiskIO(@androidx.annotation.NonNull java.lang.Runnable r1);

    public void executeOnMainThread(@androidx.annotation.NonNull java.lang.Runnable r2) {
            r1 = this;
            boolean r0 = r1.isMainThread()
            if (r0 == 0) goto La
            r2.run()
            return
        La:
            r1.postToMainThread(r2)
            return
    }

    public abstract boolean isMainThread();

    public abstract void postToMainThread(@androidx.annotation.NonNull java.lang.Runnable r1);
}
