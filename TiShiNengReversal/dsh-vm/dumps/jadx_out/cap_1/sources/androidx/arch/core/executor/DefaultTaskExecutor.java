package androidx.arch.core.executor;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class DefaultTaskExecutor extends androidx.arch.core.executor.TaskExecutor {
    private final java.util.concurrent.ExecutorService mDiskIO;
    private final java.lang.Object mLock;

    @androidx.annotation.Nullable
    private volatile android.os.Handler mMainHandler;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(28)
    private static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        public static android.os.Handler createAsync(@androidx.annotation.NonNull android.os.Looper r0) {
                android.os.Handler r0 = android.os.Handler.createAsync(r0)
                return r0
        }
    }

    public DefaultTaskExecutor() {
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.mLock = r0
            androidx.arch.core.executor.DefaultTaskExecutor$1 r0 = new androidx.arch.core.executor.DefaultTaskExecutor$1
            r0.<init>(r2)
            r1 = 4
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newFixedThreadPool(r1, r0)
            r2.mDiskIO = r0
            return
    }

    @androidx.annotation.NonNull
    private static android.os.Handler createAsync(@androidx.annotation.NonNull android.os.Looper r7) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            android.os.Handler r7 = androidx.arch.core.executor.DefaultTaskExecutor.Api28Impl.createAsync(r7)
            return r7
        Lb:
            java.lang.Class<android.os.Handler> r0 = android.os.Handler.class
            r1 = 3
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L3b
            java.lang.Class<android.os.Looper> r3 = android.os.Looper.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L3b
            java.lang.Class<android.os.Handler$Callback> r3 = android.os.Handler.Callback.class
            r5 = 1
            r2[r5] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L3b
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L3b
            r6 = 2
            r2[r6] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L3b
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L3b
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L3b
            r1[r4] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L3b
            r2 = 0
            r1[r5] = r2     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L3b
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L3b
            r1[r6] = r2     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L3b
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L3b
            android.os.Handler r0 = (android.os.Handler) r0     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L3b
            return r0
        L35:
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r7)
            return r0
        L3b:
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r7)
            return r0
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public void executeOnDiskIO(@androidx.annotation.NonNull java.lang.Runnable r2) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.mDiskIO
            r0.execute(r2)
            return
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public boolean isMainThread() {
            r2 = this;
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 != r1) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public void postToMainThread(@androidx.annotation.NonNull java.lang.Runnable r3) {
            r2 = this;
            android.os.Handler r0 = r2.mMainHandler
            if (r0 != 0) goto L1c
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            android.os.Handler r1 = r2.mMainHandler     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L18
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L16
            android.os.Handler r1 = createAsync(r1)     // Catch: java.lang.Throwable -> L16
            r2.mMainHandler = r1     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r3 = move-exception
            goto L1a
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            goto L1c
        L1a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r3
        L1c:
            android.os.Handler r0 = r2.mMainHandler
            r0.post(r3)
            return
    }
}
