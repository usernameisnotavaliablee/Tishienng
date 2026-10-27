package androidx.work.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class DefaultRunnableScheduler implements androidx.work.RunnableScheduler {
    private final android.os.Handler mHandler;

    public DefaultRunnableScheduler() {
            r1 = this;
            r1.<init>()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Handler r0 = androidx.core.os.HandlerCompat.createAsync(r0)
            r1.mHandler = r0
            return
    }

    @androidx.annotation.VisibleForTesting
    public DefaultRunnableScheduler(@androidx.annotation.NonNull android.os.Handler r1) {
            r0 = this;
            r0.<init>()
            r0.mHandler = r1
            return
    }

    @Override // androidx.work.RunnableScheduler
    public void cancel(@androidx.annotation.NonNull java.lang.Runnable r2) {
            r1 = this;
            android.os.Handler r0 = r1.mHandler
            r0.removeCallbacks(r2)
            return
    }

    @androidx.annotation.NonNull
    public android.os.Handler getHandler() {
            r1 = this;
            android.os.Handler r0 = r1.mHandler
            return r0
    }

    @Override // androidx.work.RunnableScheduler
    public void scheduleWithDelay(long r2, @androidx.annotation.NonNull java.lang.Runnable r4) {
            r1 = this;
            android.os.Handler r0 = r1.mHandler
            r0.postDelayed(r4, r2)
            return
    }
}
