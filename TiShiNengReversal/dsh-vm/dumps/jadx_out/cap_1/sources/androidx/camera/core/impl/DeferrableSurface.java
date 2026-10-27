package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class DeferrableSurface {
    private static final boolean DEBUG = false;
    public static final android.util.Size SIZE_UNDEFINED = null;
    private static final java.lang.String TAG = "DeferrableSurface";
    private static final java.util.concurrent.atomic.AtomicInteger TOTAL_COUNT = null;
    private static final java.util.concurrent.atomic.AtomicInteger USED_COUNT = null;

    @androidx.annotation.GuardedBy("mLock")
    private androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> mCloseCompleter;
    private final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> mCloseFuture;

    @androidx.annotation.GuardedBy("mLock")
    private boolean mClosed;

    @androidx.annotation.Nullable
    java.lang.Class<?> mContainerClass;
    private final java.lang.Object mLock;

    @androidx.annotation.NonNull
    private final android.util.Size mPrescribedSize;
    private final int mPrescribedStreamFormat;

    @androidx.annotation.GuardedBy("mLock")
    private androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> mTerminationCompleter;
    private final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> mTerminationFuture;

    @androidx.annotation.GuardedBy("mLock")
    private int mUseCount;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static final class SurfaceClosedException extends java.lang.Exception {
        androidx.camera.core.impl.DeferrableSurface mDeferrableSurface;

        public SurfaceClosedException(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull androidx.camera.core.impl.DeferrableSurface r2) {
                r0 = this;
                r0.<init>(r1)
                r0.mDeferrableSurface = r2
                return
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.impl.DeferrableSurface getDeferrableSurface() {
                r1 = this;
                androidx.camera.core.impl.DeferrableSurface r0 = r1.mDeferrableSurface
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class SurfaceUnavailableException extends java.lang.Exception {
        public SurfaceUnavailableException(@androidx.annotation.NonNull java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    static {
            android.util.Size r0 = new android.util.Size
            r1 = 0
            r0.<init>(r1, r1)
            androidx.camera.core.impl.DeferrableSurface.SIZE_UNDEFINED = r0
            java.lang.String r0 = "DeferrableSurface"
            boolean r0 = androidx.camera.core.Logger.isDebugEnabled(r0)
            androidx.camera.core.impl.DeferrableSurface.DEBUG = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>(r1)
            androidx.camera.core.impl.DeferrableSurface.USED_COUNT = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>(r1)
            androidx.camera.core.impl.DeferrableSurface.TOTAL_COUNT = r0
            return
    }

    public DeferrableSurface() {
            r2 = this;
            android.util.Size r0 = androidx.camera.core.impl.DeferrableSurface.SIZE_UNDEFINED
            r1 = 0
            r2.<init>(r0, r1)
            return
    }

    public DeferrableSurface(@androidx.annotation.NonNull android.util.Size r3, int r4) {
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.mLock = r0
            r0 = 0
            r2.mUseCount = r0
            r2.mClosed = r0
            r2.mPrescribedSize = r3
            r2.mPrescribedStreamFormat = r4
            androidx.camera.core.impl.q r3 = new androidx.camera.core.impl.q
            r3.<init>(r2)
            com.google.common.util.concurrent.ListenableFuture r3 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r3)
            r2.mTerminationFuture = r3
            androidx.camera.core.impl.r r4 = new androidx.camera.core.impl.r
            r4.<init>(r2)
            com.google.common.util.concurrent.ListenableFuture r4 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r4)
            r2.mCloseFuture = r4
            java.lang.String r4 = "DeferrableSurface"
            boolean r4 = androidx.camera.core.Logger.isDebugEnabled(r4)
            if (r4 == 0) goto L57
            java.util.concurrent.atomic.AtomicInteger r4 = androidx.camera.core.impl.DeferrableSurface.TOTAL_COUNT
            int r4 = r4.incrementAndGet()
            java.util.concurrent.atomic.AtomicInteger r0 = androidx.camera.core.impl.DeferrableSurface.USED_COUNT
            int r0 = r0.get()
            java.lang.String r1 = "Surface created"
            r2.printGlobalDebugCounts(r1, r4, r0)
            java.lang.Exception r4 = new java.lang.Exception
            r4.<init>()
            java.lang.String r4 = android.util.Log.getStackTraceString(r4)
            androidx.camera.core.impl.s r0 = new androidx.camera.core.impl.s
            r0.<init>(r2, r4)
            java.util.concurrent.Executor r4 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()
            r3.addListener(r0, r4)
        L57:
            return
    }

    public static /* synthetic */ java.lang.Object a(androidx.camera.core.impl.DeferrableSurface r1, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r2) {
            java.lang.Object r0 = r1.mLock
            monitor-enter(r0)
            r1.mTerminationCompleter = r2     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "DeferrableSurface-termination("
            r2.append(r0)
            r2.append(r1)
            java.lang.String r1 = ")"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            return r1
        L1d:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r1
    }

    public static /* synthetic */ java.lang.Object b(androidx.camera.core.impl.DeferrableSurface r1, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r2) {
            java.lang.Object r0 = r1.mLock
            monitor-enter(r0)
            r1.mCloseCompleter = r2     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "DeferrableSurface-close("
            r2.append(r0)
            r2.append(r1)
            java.lang.String r1 = ")"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            return r1
        L1d:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r1
    }

    public static /* synthetic */ void c(androidx.camera.core.impl.DeferrableSurface r7, java.lang.String r8) {
            r7.getClass()
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> r0 = r7.mTerminationFuture     // Catch: java.lang.Exception -> L1a
            r0.get()     // Catch: java.lang.Exception -> L1a
            java.lang.String r0 = "Surface terminated"
            java.util.concurrent.atomic.AtomicInteger r1 = androidx.camera.core.impl.DeferrableSurface.TOTAL_COUNT     // Catch: java.lang.Exception -> L1a
            int r1 = r1.decrementAndGet()     // Catch: java.lang.Exception -> L1a
            java.util.concurrent.atomic.AtomicInteger r2 = androidx.camera.core.impl.DeferrableSurface.USED_COUNT     // Catch: java.lang.Exception -> L1a
            int r2 = r2.get()     // Catch: java.lang.Exception -> L1a
            r7.printGlobalDebugCounts(r0, r1, r2)     // Catch: java.lang.Exception -> L1a
            return
        L1a:
            r0 = move-exception
            java.lang.String r1 = "DeferrableSurface"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unexpected surface termination for "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r3 = "\nStack Trace:\n"
            r2.append(r3)
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            androidx.camera.core.Logger.e(r1, r8)
            java.lang.Object r8 = r7.mLock
            monitor-enter(r8)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L60
            java.lang.String r2 = "DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception."
            boolean r3 = r7.mClosed     // Catch: java.lang.Throwable -> L60
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L60
            int r4 = r7.mUseCount     // Catch: java.lang.Throwable -> L60
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L60
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L60
            r6 = 0
            r5[r6] = r7     // Catch: java.lang.Throwable -> L60
            r7 = 1
            r5[r7] = r3     // Catch: java.lang.Throwable -> L60
            r7 = 2
            r5[r7] = r4     // Catch: java.lang.Throwable -> L60
            java.lang.String r7 = java.lang.String.format(r2, r5)     // Catch: java.lang.Throwable -> L60
            r1.<init>(r7, r0)     // Catch: java.lang.Throwable -> L60
            throw r1     // Catch: java.lang.Throwable -> L60
        L60:
            r7 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L60
            throw r7
    }

    private void printGlobalDebugCounts(@androidx.annotation.NonNull java.lang.String r3, int r4, int r5) {
            r2 = this;
            boolean r0 = androidx.camera.core.impl.DeferrableSurface.DEBUG
            java.lang.String r1 = "DeferrableSurface"
            if (r0 != 0) goto L11
            boolean r0 = androidx.camera.core.Logger.isDebugEnabled(r1)
            if (r0 == 0) goto L11
            java.lang.String r0 = "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics."
            androidx.camera.core.Logger.d(r1, r0)
        L11:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = "[total_surfaces="
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = ", used_surfaces="
            r0.append(r3)
            r0.append(r5)
            java.lang.String r3 = "]("
            r0.append(r3)
            r0.append(r2)
            java.lang.String r3 = "}"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            androidx.camera.core.Logger.d(r1, r3)
            return
    }

    public void close() {
            r6 = this;
            java.lang.Object r0 = r6.mLock
            monitor-enter(r0)
            boolean r1 = r6.mClosed     // Catch: java.lang.Throwable -> L19
            r2 = 0
            if (r1 != 0) goto L45
            r1 = 1
            r6.mClosed = r1     // Catch: java.lang.Throwable -> L19
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r1 = r6.mCloseCompleter     // Catch: java.lang.Throwable -> L19
            r1.set(r2)     // Catch: java.lang.Throwable -> L19
            int r1 = r6.mUseCount     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L1b
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r1 = r6.mTerminationCompleter     // Catch: java.lang.Throwable -> L19
            r6.mTerminationCompleter = r2     // Catch: java.lang.Throwable -> L19
            goto L1c
        L19:
            r1 = move-exception
            goto L4d
        L1b:
            r1 = r2
        L1c:
            java.lang.String r3 = "DeferrableSurface"
            boolean r3 = androidx.camera.core.Logger.isDebugEnabled(r3)     // Catch: java.lang.Throwable -> L19
            if (r3 == 0) goto L46
            java.lang.String r3 = "DeferrableSurface"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19
            r4.<init>()     // Catch: java.lang.Throwable -> L19
            java.lang.String r5 = "surface closed,  useCount="
            r4.append(r5)     // Catch: java.lang.Throwable -> L19
            int r5 = r6.mUseCount     // Catch: java.lang.Throwable -> L19
            r4.append(r5)     // Catch: java.lang.Throwable -> L19
            java.lang.String r5 = " closed=true "
            r4.append(r5)     // Catch: java.lang.Throwable -> L19
            r4.append(r6)     // Catch: java.lang.Throwable -> L19
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L19
            androidx.camera.core.Logger.d(r3, r4)     // Catch: java.lang.Throwable -> L19
            goto L46
        L45:
            r1 = r2
        L46:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L4c
            r1.set(r2)
        L4c:
            return
        L4d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r1
    }

    public void decrementUseCount() {
            r6 = this;
            java.lang.Object r0 = r6.mLock
            monitor-enter(r0)
            int r1 = r6.mUseCount     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L68
            int r1 = r1 + (-1)
            r6.mUseCount = r1     // Catch: java.lang.Throwable -> L17
            r2 = 0
            if (r1 != 0) goto L19
            boolean r1 = r6.mClosed     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L19
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r1 = r6.mTerminationCompleter     // Catch: java.lang.Throwable -> L17
            r6.mTerminationCompleter = r2     // Catch: java.lang.Throwable -> L17
            goto L1a
        L17:
            r1 = move-exception
            goto L70
        L19:
            r1 = r2
        L1a:
            java.lang.String r3 = "DeferrableSurface"
            boolean r3 = androidx.camera.core.Logger.isDebugEnabled(r3)     // Catch: java.lang.Throwable -> L17
            if (r3 == 0) goto L61
            java.lang.String r3 = "DeferrableSurface"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L17
            r4.<init>()     // Catch: java.lang.Throwable -> L17
            java.lang.String r5 = "use count-1,  useCount="
            r4.append(r5)     // Catch: java.lang.Throwable -> L17
            int r5 = r6.mUseCount     // Catch: java.lang.Throwable -> L17
            r4.append(r5)     // Catch: java.lang.Throwable -> L17
            java.lang.String r5 = " closed="
            r4.append(r5)     // Catch: java.lang.Throwable -> L17
            boolean r5 = r6.mClosed     // Catch: java.lang.Throwable -> L17
            r4.append(r5)     // Catch: java.lang.Throwable -> L17
            java.lang.String r5 = " "
            r4.append(r5)     // Catch: java.lang.Throwable -> L17
            r4.append(r6)     // Catch: java.lang.Throwable -> L17
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L17
            androidx.camera.core.Logger.d(r3, r4)     // Catch: java.lang.Throwable -> L17
            int r3 = r6.mUseCount     // Catch: java.lang.Throwable -> L17
            if (r3 != 0) goto L61
            java.lang.String r3 = "Surface no longer in use"
            java.util.concurrent.atomic.AtomicInteger r4 = androidx.camera.core.impl.DeferrableSurface.TOTAL_COUNT     // Catch: java.lang.Throwable -> L17
            int r4 = r4.get()     // Catch: java.lang.Throwable -> L17
            java.util.concurrent.atomic.AtomicInteger r5 = androidx.camera.core.impl.DeferrableSurface.USED_COUNT     // Catch: java.lang.Throwable -> L17
            int r5 = r5.decrementAndGet()     // Catch: java.lang.Throwable -> L17
            r6.printGlobalDebugCounts(r3, r4, r5)     // Catch: java.lang.Throwable -> L17
        L61:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L67
            r1.set(r2)
        L67:
            return
        L68:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L17
            java.lang.String r2 = "Decrementing use count occurs more times than incrementing"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L17
            throw r1     // Catch: java.lang.Throwable -> L17
        L70:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r1
    }

    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getCloseFuture() {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> r0 = r1.mCloseFuture
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(r0)
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.Class<?> getContainerClass() {
            r1 = this;
            java.lang.Class<?> r0 = r1.mContainerClass
            return r0
    }

    @androidx.annotation.NonNull
    public android.util.Size getPrescribedSize() {
            r1 = this;
            android.util.Size r0 = r1.mPrescribedSize
            return r0
    }

    public int getPrescribedStreamFormat() {
            r1 = this;
            int r0 = r1.mPrescribedStreamFormat
            return r0
    }

    @androidx.annotation.NonNull
    public final com.google.common.util.concurrent.ListenableFuture<android.view.Surface> getSurface() {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            boolean r1 = r3.mClosed     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException r1 = new androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = "DeferrableSurface already closed."
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L14
            com.google.common.util.concurrent.ListenableFuture r1 = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(r1)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return r1
        L14:
            r1 = move-exception
            goto L1c
        L16:
            com.google.common.util.concurrent.ListenableFuture r1 = r3.provideSurface()     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return r1
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
    }

    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getTerminationFuture() {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> r0 = r1.mTerminationFuture
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(r0)
            return r0
    }

    @androidx.annotation.VisibleForTesting
    public int getUseCount() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            int r1 = r2.mUseCount     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public void incrementUseCount() throws androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException {
            r4 = this;
            java.lang.Object r0 = r4.mLock
            monitor-enter(r0)
            int r1 = r4.mUseCount     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L16
            boolean r2 = r4.mClosed     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto Lc
            goto L16
        Lc:
            androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException r1 = new androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = "Cannot begin use on a closed surface."
            r1.<init>(r2, r4)     // Catch: java.lang.Throwable -> L14
            throw r1     // Catch: java.lang.Throwable -> L14
        L14:
            r1 = move-exception
            goto L59
        L16:
            r2 = 1
            int r1 = r1 + r2
            r4.mUseCount = r1     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = "DeferrableSurface"
            boolean r1 = androidx.camera.core.Logger.isDebugEnabled(r1)     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L57
            int r1 = r4.mUseCount     // Catch: java.lang.Throwable -> L14
            if (r1 != r2) goto L37
            java.lang.String r1 = "New surface in use"
            java.util.concurrent.atomic.AtomicInteger r2 = androidx.camera.core.impl.DeferrableSurface.TOTAL_COUNT     // Catch: java.lang.Throwable -> L14
            int r2 = r2.get()     // Catch: java.lang.Throwable -> L14
            java.util.concurrent.atomic.AtomicInteger r3 = androidx.camera.core.impl.DeferrableSurface.USED_COUNT     // Catch: java.lang.Throwable -> L14
            int r3 = r3.incrementAndGet()     // Catch: java.lang.Throwable -> L14
            r4.printGlobalDebugCounts(r1, r2, r3)     // Catch: java.lang.Throwable -> L14
        L37:
            java.lang.String r1 = "DeferrableSurface"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14
            r2.<init>()     // Catch: java.lang.Throwable -> L14
            java.lang.String r3 = "use count+1, useCount="
            r2.append(r3)     // Catch: java.lang.Throwable -> L14
            int r3 = r4.mUseCount     // Catch: java.lang.Throwable -> L14
            r2.append(r3)     // Catch: java.lang.Throwable -> L14
            java.lang.String r3 = " "
            r2.append(r3)     // Catch: java.lang.Throwable -> L14
            r2.append(r4)     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L14
            androidx.camera.core.Logger.d(r1, r2)     // Catch: java.lang.Throwable -> L14
        L57:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L59:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
    }

    public boolean isClosed() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            boolean r1 = r2.mClosed     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    @androidx.annotation.NonNull
    protected abstract com.google.common.util.concurrent.ListenableFuture<android.view.Surface> provideSurface();

    public void setContainerClass(@androidx.annotation.NonNull java.lang.Class<?> r1) {
            r0 = this;
            r0.mContainerClass = r1
            return
    }
}
