package androidx.camera.video.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class SharedByteBuffer implements java.io.Closeable {
    private static final java.lang.String TAG = "SharedByteBuffer";
    private final java.lang.Object mCloseLock;

    @androidx.annotation.GuardedBy("mCloseLock")
    private boolean mClosed;
    private final androidx.core.util.Pair<java.util.concurrent.Executor, java.lang.Runnable> mFinalCloseAction;
    private final int mShareId;
    private final java.nio.ByteBuffer mSharedByteBuffer;

    @androidx.annotation.GuardedBy("mCloseLock")
    private final java.util.concurrent.atomic.AtomicInteger mSharedRefCount;

    private SharedByteBuffer(@androidx.annotation.NonNull java.nio.ByteBuffer r4, @androidx.annotation.NonNull java.util.concurrent.atomic.AtomicInteger r5, @androidx.annotation.NonNull androidx.core.util.Pair<java.util.concurrent.Executor, java.lang.Runnable> r6, int r7) {
            r3 = this;
            r3.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.mCloseLock = r0
            r0 = 0
            r3.mClosed = r0
            r3.mSharedByteBuffer = r4
            r3.mSharedRefCount = r5
            r3.mFinalCloseAction = r6
            r3.mShareId = r7
            java.lang.String r4 = "SharedByteBuffer"
            boolean r4 = androidx.camera.core.Logger.isDebugEnabled(r4)
            if (r4 == 0) goto L42
            int r4 = r5.get()
            r5 = 1
            if (r4 < r5) goto L25
            goto L42
        L25:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            java.util.Locale r7 = java.util.Locale.US
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r1 = r3.toString()
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r0] = r4
            r2[r5] = r1
            java.lang.String r4 = "Cannot create new instance of SharedByteBuffer with invalid ref count %d. Ref count must be >= 1. [%s]"
            java.lang.String r4 = java.lang.String.format(r7, r4, r2)
            r6.<init>(r4)
            throw r6
        L42:
            return
    }

    @androidx.annotation.GuardedBy("mCloseLock")
    private void checkNotClosed(@androidx.annotation.NonNull java.lang.String r4) {
            r3 = this;
            boolean r0 = r3.mClosed
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot call "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " on a closed SharedByteBuffer."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    private boolean closeInternal() {
            r9 = this;
            java.lang.Object r0 = r9.mCloseLock
            monitor-enter(r0)
            boolean r1 = r9.mClosed     // Catch: java.lang.Throwable -> La
            r2 = 0
            if (r1 == 0) goto Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r2
        La:
            r1 = move-exception
            goto L98
        Ld:
            r1 = 1
            r9.mClosed = r1     // Catch: java.lang.Throwable -> La
            java.util.concurrent.atomic.AtomicInteger r3 = r9.mSharedRefCount     // Catch: java.lang.Throwable -> La
            int r3 = r3.decrementAndGet()     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            java.lang.String r0 = "SharedByteBuffer"
            boolean r0 = androidx.camera.core.Logger.isDebugEnabled(r0)
            if (r0 == 0) goto L46
            if (r3 < 0) goto L3e
            java.lang.String r0 = "SharedByteBuffer"
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r5 = "Ref count decremented: %d [%s]"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            java.lang.String r7 = r9.toString()
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r2] = r6
            r8[r1] = r7
            java.lang.String r4 = java.lang.String.format(r4, r5, r8)
            androidx.camera.core.Logger.d(r0, r4)
            goto L46
        L3e:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "Invalid ref count. close() should never produce a ref count below 0"
            r0.<init>(r1)
            throw r0
        L46:
            if (r3 != 0) goto L97
            java.lang.String r0 = "SharedByteBuffer"
            boolean r0 = androidx.camera.core.Logger.isDebugEnabled(r0)
            if (r0 == 0) goto L65
            java.lang.String r0 = "SharedByteBuffer"
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r4 = "Final reference released. Running final close action. [%s]"
            java.lang.String r5 = r9.toString()
            java.lang.Object[] r6 = new java.lang.Object[r1]
            r6[r2] = r5
            java.lang.String r3 = java.lang.String.format(r3, r4, r6)
            androidx.camera.core.Logger.d(r0, r3)
        L65:
            androidx.core.util.Pair<java.util.concurrent.Executor, java.lang.Runnable> r0 = r9.mFinalCloseAction     // Catch: java.util.concurrent.RejectedExecutionException -> L81
            F r0 = r0.first     // Catch: java.util.concurrent.RejectedExecutionException -> L81
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0     // Catch: java.util.concurrent.RejectedExecutionException -> L81
            java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r0)     // Catch: java.util.concurrent.RejectedExecutionException -> L81
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0     // Catch: java.util.concurrent.RejectedExecutionException -> L81
            androidx.core.util.Pair<java.util.concurrent.Executor, java.lang.Runnable> r3 = r9.mFinalCloseAction     // Catch: java.util.concurrent.RejectedExecutionException -> L81
            S r3 = r3.second     // Catch: java.util.concurrent.RejectedExecutionException -> L81
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.util.concurrent.RejectedExecutionException -> L81
            java.lang.Object r3 = androidx.core.util.Preconditions.checkNotNull(r3)     // Catch: java.util.concurrent.RejectedExecutionException -> L81
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.util.concurrent.RejectedExecutionException -> L81
            r0.execute(r3)     // Catch: java.util.concurrent.RejectedExecutionException -> L81
            goto L97
        L81:
            r0 = move-exception
            java.lang.String r3 = "SharedByteBuffer"
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r5 = "Unable to execute final close action. [%s]"
            java.lang.String r6 = r9.toString()
            java.lang.Object[] r7 = new java.lang.Object[r1]
            r7[r2] = r6
            java.lang.String r2 = java.lang.String.format(r4, r5, r7)
            androidx.camera.core.Logger.e(r3, r2, r0)
        L97:
            return r1
        L98:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    @androidx.annotation.NonNull
    static androidx.camera.video.internal.SharedByteBuffer newSharedInstance(@androidx.annotation.NonNull java.nio.ByteBuffer r4, @androidx.annotation.NonNull java.util.concurrent.Executor r5, @androidx.annotation.NonNull java.lang.Runnable r6) {
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 1
            r0.<init>(r1)
            int r1 = java.lang.System.identityHashCode(r4)
            java.lang.Object r4 = androidx.core.util.Preconditions.checkNotNull(r4)
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            java.nio.ByteBuffer r4 = r4.asReadOnlyBuffer()
            androidx.camera.video.internal.SharedByteBuffer r2 = new androidx.camera.video.internal.SharedByteBuffer
            androidx.core.util.Pair r3 = new androidx.core.util.Pair
            java.lang.Object r5 = androidx.core.util.Preconditions.checkNotNull(r5)
            java.util.concurrent.Executor r5 = (java.util.concurrent.Executor) r5
            java.lang.Object r6 = androidx.core.util.Preconditions.checkNotNull(r6)
            java.lang.Runnable r6 = (java.lang.Runnable) r6
            r3.<init>(r5, r6)
            r2.<init>(r4, r0, r3, r1)
            return r2
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r0 = this;
            r0.closeInternal()
            return
    }

    protected void finalize() throws java.lang.Throwable {
            r6 = this;
            boolean r0 = r6.closeInternal()     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L20
            java.lang.String r0 = "SharedByteBuffer"
            java.util.Locale r1 = java.util.Locale.US     // Catch: java.lang.Throwable -> L1e
            java.lang.String r2 = "SharedByteBuffer closed by finalizer, but should have been closed manually with SharedByteBuffer.close() [%s]"
            java.lang.String r3 = r6.toString()     // Catch: java.lang.Throwable -> L1e
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L1e
            r5 = 0
            r4[r5] = r3     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = java.lang.String.format(r1, r2, r4)     // Catch: java.lang.Throwable -> L1e
            androidx.camera.core.Logger.w(r0, r1)     // Catch: java.lang.Throwable -> L1e
            goto L20
        L1e:
            r0 = move-exception
            goto L24
        L20:
            super.finalize()
            return
        L24:
            super.finalize()
            throw r0
    }

    @androidx.annotation.NonNull
    public java.nio.ByteBuffer get() {
            r2 = this;
            java.lang.Object r0 = r2.mCloseLock
            monitor-enter(r0)
            java.lang.String r1 = "get()"
            r2.checkNotClosed(r1)     // Catch: java.lang.Throwable -> Lc
            java.nio.ByteBuffer r1 = r2.mSharedByteBuffer     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return r1
        Lc:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    @androidx.annotation.NonNull
    androidx.camera.video.internal.SharedByteBuffer share() {
            r9 = this;
            java.lang.Object r0 = r9.mCloseLock
            monitor-enter(r0)
            java.lang.String r1 = "share()"
            r9.checkNotClosed(r1)     // Catch: java.lang.Throwable -> L52
            java.util.concurrent.atomic.AtomicInteger r1 = r9.mSharedRefCount     // Catch: java.lang.Throwable -> L52
            int r1 = r1.incrementAndGet()     // Catch: java.lang.Throwable -> L52
            java.util.concurrent.atomic.AtomicInteger r2 = r9.mSharedRefCount     // Catch: java.lang.Throwable -> L52
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L52
            java.lang.String r0 = "SharedByteBuffer"
            boolean r0 = androidx.camera.core.Logger.isDebugEnabled(r0)
            if (r0 == 0) goto L42
            r0 = 1
            if (r1 <= r0) goto L3a
            java.lang.String r3 = "SharedByteBuffer"
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r5 = "Ref count incremented: %d [%s]"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r6 = r9.toString()
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r8 = 0
            r7[r8] = r1
            r7[r0] = r6
            java.lang.String r0 = java.lang.String.format(r4, r5, r7)
            androidx.camera.core.Logger.d(r3, r0)
            goto L42
        L3a:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "Invalid ref count. share() should always produce a ref count of 2 or more."
            r0.<init>(r1)
            throw r0
        L42:
            androidx.camera.video.internal.SharedByteBuffer r0 = new androidx.camera.video.internal.SharedByteBuffer
            java.nio.ByteBuffer r1 = r9.mSharedByteBuffer
            java.nio.ByteBuffer r1 = r1.asReadOnlyBuffer()
            androidx.core.util.Pair<java.util.concurrent.Executor, java.lang.Runnable> r3 = r9.mFinalCloseAction
            int r4 = r9.mShareId
            r0.<init>(r1, r2, r3, r4)
            return r0
        L52:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L52
            throw r1
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r6 = this;
            java.util.Locale r0 = java.util.Locale.US
            java.nio.ByteBuffer r1 = r6.mSharedByteBuffer
            int r2 = r6.mShareId
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = java.lang.System.identityHashCode(r6)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r1
            r1 = 1
            r4[r1] = r2
            r1 = 2
            r4[r1] = r3
            java.lang.String r1 = "SharedByteBuffer[buf: %s, shareId: 0x%x, instanceId:0x%x]"
            java.lang.String r0 = java.lang.String.format(r0, r1, r4)
            return r0
    }
}
