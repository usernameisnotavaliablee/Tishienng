package androidx.core.provider;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class SelfDestructiveThread {
    private static final int MSG_DESTRUCTION = 0;
    private static final int MSG_INVOKE_RUNNABLE = 1;
    private android.os.Handler.Callback mCallback;
    private final int mDestructAfterMillisec;

    @androidx.annotation.GuardedBy("mLock")
    private int mGeneration;

    @androidx.annotation.GuardedBy("mLock")
    private android.os.Handler mHandler;
    private final java.lang.Object mLock;
    private final int mPriority;

    @androidx.annotation.GuardedBy("mLock")
    private android.os.HandlerThread mThread;
    private final java.lang.String mThreadName;




    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface ReplyCallback<T> {
        void onReply(T r1);
    }

    public SelfDestructiveThread(java.lang.String r2, int r3, int r4) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.mLock = r0
            androidx.core.provider.SelfDestructiveThread$1 r0 = new androidx.core.provider.SelfDestructiveThread$1
            r0.<init>(r1)
            r1.mCallback = r0
            r1.mThreadName = r2
            r1.mPriority = r3
            r1.mDestructAfterMillisec = r4
            r2 = 0
            r1.mGeneration = r2
            return
    }

    private void post(java.lang.Runnable r6) {
            r5 = this;
            java.lang.Object r0 = r5.mLock
            monitor-enter(r0)
            android.os.HandlerThread r1 = r5.mThread     // Catch: java.lang.Throwable -> L2b
            r2 = 1
            if (r1 != 0) goto L2d
            android.os.HandlerThread r1 = new android.os.HandlerThread     // Catch: java.lang.Throwable -> L2b
            java.lang.String r3 = r5.mThreadName     // Catch: java.lang.Throwable -> L2b
            int r4 = r5.mPriority     // Catch: java.lang.Throwable -> L2b
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L2b
            r5.mThread = r1     // Catch: java.lang.Throwable -> L2b
            r1.start()     // Catch: java.lang.Throwable -> L2b
            android.os.Handler r1 = new android.os.Handler     // Catch: java.lang.Throwable -> L2b
            android.os.HandlerThread r3 = r5.mThread     // Catch: java.lang.Throwable -> L2b
            android.os.Looper r3 = r3.getLooper()     // Catch: java.lang.Throwable -> L2b
            android.os.Handler$Callback r4 = r5.mCallback     // Catch: java.lang.Throwable -> L2b
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L2b
            r5.mHandler = r1     // Catch: java.lang.Throwable -> L2b
            int r1 = r5.mGeneration     // Catch: java.lang.Throwable -> L2b
            int r1 = r1 + r2
            r5.mGeneration = r1     // Catch: java.lang.Throwable -> L2b
            goto L2d
        L2b:
            r6 = move-exception
            goto L3e
        L2d:
            android.os.Handler r1 = r5.mHandler     // Catch: java.lang.Throwable -> L2b
            r3 = 0
            r1.removeMessages(r3)     // Catch: java.lang.Throwable -> L2b
            android.os.Handler r1 = r5.mHandler     // Catch: java.lang.Throwable -> L2b
            android.os.Message r6 = r1.obtainMessage(r2, r6)     // Catch: java.lang.Throwable -> L2b
            r1.sendMessage(r6)     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            return
        L3e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            throw r6
    }

    @androidx.annotation.VisibleForTesting
    public int getGeneration() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            int r1 = r2.mGeneration     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    @androidx.annotation.VisibleForTesting
    public boolean isRunning() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            android.os.HandlerThread r1 = r2.mThread     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return r1
        Lc:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    void onDestruction() {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            android.os.Handler r1 = r3.mHandler     // Catch: java.lang.Throwable -> Le
            r2 = 1
            boolean r1 = r1.hasMessages(r2)     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r1 = move-exception
            goto L1c
        L10:
            android.os.HandlerThread r1 = r3.mThread     // Catch: java.lang.Throwable -> Le
            r1.quit()     // Catch: java.lang.Throwable -> Le
            r1 = 0
            r3.mThread = r1     // Catch: java.lang.Throwable -> Le
            r3.mHandler = r1     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    void onInvokeRunnable(java.lang.Runnable r5) {
            r4 = this;
            r5.run()
            java.lang.Object r5 = r4.mLock
            monitor-enter(r5)
            android.os.Handler r0 = r4.mHandler     // Catch: java.lang.Throwable -> L1a
            r1 = 0
            r0.removeMessages(r1)     // Catch: java.lang.Throwable -> L1a
            android.os.Handler r0 = r4.mHandler     // Catch: java.lang.Throwable -> L1a
            android.os.Message r1 = r0.obtainMessage(r1)     // Catch: java.lang.Throwable -> L1a
            int r2 = r4.mDestructAfterMillisec     // Catch: java.lang.Throwable -> L1a
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L1a
            r0.sendMessageDelayed(r1, r2)     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L1a
            return
        L1a:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L1a
            throw r0
    }

    public <T> void postAndReply(java.util.concurrent.Callable<T> r3, androidx.core.provider.SelfDestructiveThread.ReplyCallback<T> r4) {
            r2 = this;
            android.os.Handler r0 = androidx.core.provider.CalleeHandler.create()
            androidx.core.provider.SelfDestructiveThread$2 r1 = new androidx.core.provider.SelfDestructiveThread$2
            r1.<init>(r2, r3, r0, r4)
            r2.post(r1)
            return
    }

    public <T> T postAndWait(java.util.concurrent.Callable<T> r10, int r11) throws java.lang.InterruptedException {
            r9 = this;
            java.util.concurrent.locks.ReentrantLock r4 = new java.util.concurrent.locks.ReentrantLock
            r4.<init>()
            java.util.concurrent.locks.Condition r6 = r4.newCondition()
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r5 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 1
            r5.<init>(r0)
            androidx.core.provider.SelfDestructiveThread$3 r0 = new androidx.core.provider.SelfDestructiveThread$3
            r1 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r9.post(r0)
            r4.lock()
            boolean r10 = r5.get()     // Catch: java.lang.Throwable -> L2f
            if (r10 != 0) goto L32
            java.lang.Object r10 = r2.get()     // Catch: java.lang.Throwable -> L2f
            r4.unlock()
            return r10
        L2f:
            r0 = move-exception
            r10 = r0
            goto L5a
        L32:
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L2f
            long r7 = (long) r11     // Catch: java.lang.Throwable -> L2f
            long r10 = r10.toNanos(r7)     // Catch: java.lang.Throwable -> L2f
        L39:
            long r10 = r6.awaitNanos(r10)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L3d
        L3d:
            boolean r0 = r5.get()     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L4b
            java.lang.Object r10 = r2.get()     // Catch: java.lang.Throwable -> L2f
            r4.unlock()
            return r10
        L4b:
            r7 = 0
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 <= 0) goto L52
            goto L39
        L52:
            java.lang.InterruptedException r10 = new java.lang.InterruptedException     // Catch: java.lang.Throwable -> L2f
            java.lang.String r11 = "timeout"
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L2f
            throw r10     // Catch: java.lang.Throwable -> L2f
        L5a:
            r4.unlock()
            throw r10
    }
}
