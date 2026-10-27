package androidx.work.impl.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class SynchronousExecutor implements java.util.concurrent.Executor {
    public SynchronousExecutor() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.Executor
    public void execute(@androidx.annotation.NonNull java.lang.Runnable r1) {
            r0 = this;
            r1.run()
            return
    }
}
