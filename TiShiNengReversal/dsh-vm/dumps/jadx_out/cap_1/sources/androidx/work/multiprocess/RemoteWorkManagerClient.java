package androidx.work.multiprocess;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"BanKeepAnnotation"})
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class RemoteWorkManagerClient extends androidx.work.multiprocess.RemoteWorkManager {
    private static final long SESSION_TIMEOUT_MILLIS = 60000;
    static final java.lang.String TAG = null;
    final android.content.Context mContext;
    final java.util.concurrent.Executor mExecutor;
    private final android.os.Handler mHandler;
    final java.lang.Object mLock;
    androidx.work.multiprocess.RemoteWorkManagerClient.Session mSession;
    private volatile long mSessionIndex;
    private final long mSessionTimeout;
    private final androidx.work.multiprocess.RemoteWorkManagerClient.SessionTracker mSessionTracker;
    final androidx.work.impl.WorkManagerImpl mWorkManager;











    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static class Session implements android.content.ServiceConnection {
        private static final java.lang.String TAG = null;
        final androidx.work.multiprocess.RemoteWorkManagerClient mClient;
        final androidx.work.impl.utils.futures.SettableFuture<androidx.work.multiprocess.IWorkManagerImpl> mFuture;

        static {
                java.lang.String r0 = "RemoteWMgr.Connection"
                java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
                androidx.work.multiprocess.RemoteWorkManagerClient.Session.TAG = r0
                return
        }

        public Session(@androidx.annotation.NonNull androidx.work.multiprocess.RemoteWorkManagerClient r1) {
                r0 = this;
                r0.<init>()
                r0.mClient = r1
                androidx.work.impl.utils.futures.SettableFuture r1 = androidx.work.impl.utils.futures.SettableFuture.create()
                r0.mFuture = r1
                return
        }

        public void onBindingDied() {
                r4 = this;
                androidx.work.Logger r0 = androidx.work.Logger.get()
                java.lang.String r1 = androidx.work.multiprocess.RemoteWorkManagerClient.Session.TAG
                r2 = 0
                java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
                java.lang.String r3 = "Binding died"
                r0.debug(r1, r3, r2)
                androidx.work.impl.utils.futures.SettableFuture<androidx.work.multiprocess.IWorkManagerImpl> r0 = r4.mFuture
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r3)
                r0.setException(r1)
                androidx.work.multiprocess.RemoteWorkManagerClient r0 = r4.mClient
                r0.cleanUp()
                return
        }

        @Override // android.content.ServiceConnection
        public void onBindingDied(@androidx.annotation.NonNull android.content.ComponentName r1) {
                r0 = this;
                r0.onBindingDied()
                return
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(@androidx.annotation.NonNull android.content.ComponentName r6) {
                r5 = this;
                androidx.work.Logger r0 = androidx.work.Logger.get()
                java.lang.String r1 = androidx.work.multiprocess.RemoteWorkManagerClient.Session.TAG
                r2 = 0
                java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
                java.lang.String r4 = "Unable to bind to service"
                r0.error(r1, r4, r3)
                androidx.work.impl.utils.futures.SettableFuture<androidx.work.multiprocess.IWorkManagerImpl> r0 = r5.mFuture
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r3 = 1
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r3[r2] = r6
                java.lang.String r6 = "Cannot bind to service %s"
                java.lang.String r6 = java.lang.String.format(r6, r3)
                r1.<init>(r6)
                r0.setException(r1)
                return
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(@androidx.annotation.NonNull android.content.ComponentName r4, @androidx.annotation.NonNull android.os.IBinder r5) {
                r3 = this;
                androidx.work.Logger r4 = androidx.work.Logger.get()
                java.lang.String r0 = androidx.work.multiprocess.RemoteWorkManagerClient.Session.TAG
                r1 = 0
                java.lang.Throwable[] r1 = new java.lang.Throwable[r1]
                java.lang.String r2 = "Service connected"
                r4.debug(r0, r2, r1)
                androidx.work.multiprocess.IWorkManagerImpl r4 = androidx.work.multiprocess.IWorkManagerImpl.Stub.asInterface(r5)
                androidx.work.impl.utils.futures.SettableFuture<androidx.work.multiprocess.IWorkManagerImpl> r5 = r3.mFuture
                r5.set(r4)
                return
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(@androidx.annotation.NonNull android.content.ComponentName r4) {
                r3 = this;
                androidx.work.Logger r4 = androidx.work.Logger.get()
                java.lang.String r0 = androidx.work.multiprocess.RemoteWorkManagerClient.Session.TAG
                r1 = 0
                java.lang.Throwable[] r1 = new java.lang.Throwable[r1]
                java.lang.String r2 = "Service disconnected"
                r4.debug(r0, r2, r1)
                androidx.work.impl.utils.futures.SettableFuture<androidx.work.multiprocess.IWorkManagerImpl> r4 = r3.mFuture
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r0.<init>(r2)
                r4.setException(r0)
                androidx.work.multiprocess.RemoteWorkManagerClient r4 = r3.mClient
                r4.cleanUp()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class SessionRemoteCallback extends androidx.work.multiprocess.RemoteCallback {
        private final androidx.work.multiprocess.RemoteWorkManagerClient mClient;

        public SessionRemoteCallback(@androidx.annotation.NonNull androidx.work.multiprocess.RemoteWorkManagerClient r1) {
                r0 = this;
                r0.<init>()
                r0.mClient = r1
                return
        }

        @Override // androidx.work.multiprocess.RemoteCallback
        protected void onRequestCompleted() {
                r4 = this;
                super.onRequestCompleted()
                androidx.work.multiprocess.RemoteWorkManagerClient r0 = r4.mClient
                android.os.Handler r0 = r0.getSessionHandler()
                androidx.work.multiprocess.RemoteWorkManagerClient r1 = r4.mClient
                androidx.work.multiprocess.RemoteWorkManagerClient$SessionTracker r1 = r1.getSessionTracker()
                androidx.work.multiprocess.RemoteWorkManagerClient r2 = r4.mClient
                long r2 = r2.getSessionTimeout()
                r0.postDelayed(r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class SessionTracker implements java.lang.Runnable {
        private static final java.lang.String TAG = null;
        private final androidx.work.multiprocess.RemoteWorkManagerClient mClient;

        static {
                java.lang.String r0 = "SessionHandler"
                java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
                androidx.work.multiprocess.RemoteWorkManagerClient.SessionTracker.TAG = r0
                return
        }

        public SessionTracker(@androidx.annotation.NonNull androidx.work.multiprocess.RemoteWorkManagerClient r1) {
                r0 = this;
                r0.<init>()
                r0.mClient = r1
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r8 = this;
                androidx.work.multiprocess.RemoteWorkManagerClient r0 = r8.mClient
                long r0 = r0.getSessionIndex()
                androidx.work.multiprocess.RemoteWorkManagerClient r2 = r8.mClient
                java.lang.Object r2 = r2.getSessionLock()
                monitor-enter(r2)
                androidx.work.multiprocess.RemoteWorkManagerClient r3 = r8.mClient     // Catch: java.lang.Throwable -> L3a
                long r3 = r3.getSessionIndex()     // Catch: java.lang.Throwable -> L3a
                androidx.work.multiprocess.RemoteWorkManagerClient r5 = r8.mClient     // Catch: java.lang.Throwable -> L3a
                androidx.work.multiprocess.RemoteWorkManagerClient$Session r5 = r5.getCurrentSession()     // Catch: java.lang.Throwable -> L3a
                if (r5 == 0) goto L49
                r6 = 0
                int r7 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r7 != 0) goto L3c
                androidx.work.Logger r0 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L3a
                java.lang.String r1 = androidx.work.multiprocess.RemoteWorkManagerClient.SessionTracker.TAG     // Catch: java.lang.Throwable -> L3a
                java.lang.String r3 = "Unbinding service"
                java.lang.Throwable[] r4 = new java.lang.Throwable[r6]     // Catch: java.lang.Throwable -> L3a
                r0.debug(r1, r3, r4)     // Catch: java.lang.Throwable -> L3a
                androidx.work.multiprocess.RemoteWorkManagerClient r0 = r8.mClient     // Catch: java.lang.Throwable -> L3a
                android.content.Context r0 = r0.getContext()     // Catch: java.lang.Throwable -> L3a
                r0.unbindService(r5)     // Catch: java.lang.Throwable -> L3a
                r5.onBindingDied()     // Catch: java.lang.Throwable -> L3a
                goto L49
            L3a:
                r0 = move-exception
                goto L4b
            L3c:
                androidx.work.Logger r0 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L3a
                java.lang.String r1 = androidx.work.multiprocess.RemoteWorkManagerClient.SessionTracker.TAG     // Catch: java.lang.Throwable -> L3a
                java.lang.String r3 = "Ignoring request to unbind."
                java.lang.Throwable[] r4 = new java.lang.Throwable[r6]     // Catch: java.lang.Throwable -> L3a
                r0.debug(r1, r3, r4)     // Catch: java.lang.Throwable -> L3a
            L49:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L3a
                return
            L4b:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L3a
                throw r0
        }
    }

    static {
            java.lang.String r0 = "RemoteWorkManagerClient"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.multiprocess.RemoteWorkManagerClient.TAG = r0
            return
    }

    public RemoteWorkManagerClient(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.NonNull androidx.work.impl.WorkManagerImpl r4) {
            r2 = this;
            r0 = 60000(0xea60, double:2.9644E-319)
            r2.<init>(r3, r4, r0)
            return
    }

    public RemoteWorkManagerClient(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull androidx.work.impl.WorkManagerImpl r2, long r3) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            r0.mContext = r1
            r0.mWorkManager = r2
            androidx.work.impl.utils.taskexecutor.TaskExecutor r1 = r2.getWorkTaskExecutor()
            androidx.work.impl.utils.SerialExecutor r1 = r1.getBackgroundExecutor()
            r0.mExecutor = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.mLock = r1
            r1 = 0
            r0.mSession = r1
            androidx.work.multiprocess.RemoteWorkManagerClient$SessionTracker r1 = new androidx.work.multiprocess.RemoteWorkManagerClient$SessionTracker
            r1.<init>(r0)
            r0.mSessionTracker = r1
            r0.mSessionTimeout = r3
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Handler r1 = androidx.core.os.HandlerCompat.createAsync(r1)
            r0.mHandler = r1
            return
    }

    private static android.content.Intent newIntent(@androidx.annotation.NonNull android.content.Context r2) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<androidx.work.multiprocess.RemoteWorkManagerService> r1 = androidx.work.multiprocess.RemoteWorkManagerService.class
            r0.<init>(r2, r1)
            return r0
    }

    private void unableToBind(@androidx.annotation.NonNull androidx.work.multiprocess.RemoteWorkManagerClient.Session r5, @androidx.annotation.NonNull java.lang.Throwable r6) {
            r4 = this;
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r1 = androidx.work.multiprocess.RemoteWorkManagerClient.TAG
            r2 = 1
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r3 = 0
            r2[r3] = r6
            java.lang.String r3 = "Unable to bind to service"
            r0.error(r1, r3, r2)
            androidx.work.impl.utils.futures.SettableFuture<androidx.work.multiprocess.IWorkManagerImpl> r5 = r5.mFuture
            r5.setException(r6)
            return
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    @androidx.annotation.NonNull
    public androidx.work.multiprocess.RemoteWorkContinuation beginUniqueWork(@androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull androidx.work.ExistingWorkPolicy r4, @androidx.annotation.NonNull java.util.List<androidx.work.OneTimeWorkRequest> r5) {
            r2 = this;
            androidx.work.multiprocess.RemoteWorkContinuationImpl r0 = new androidx.work.multiprocess.RemoteWorkContinuationImpl
            androidx.work.impl.WorkManagerImpl r1 = r2.mWorkManager
            androidx.work.WorkContinuation r3 = r1.beginUniqueWork(r3, r4, r5)
            r0.<init>(r2, r3)
            return r0
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    @androidx.annotation.NonNull
    public androidx.work.multiprocess.RemoteWorkContinuation beginWith(@androidx.annotation.NonNull java.util.List<androidx.work.OneTimeWorkRequest> r3) {
            r2 = this;
            androidx.work.multiprocess.RemoteWorkContinuationImpl r0 = new androidx.work.multiprocess.RemoteWorkContinuationImpl
            androidx.work.impl.WorkManagerImpl r1 = r2.mWorkManager
            androidx.work.WorkContinuation r3 = r1.beginWith(r3)
            r0.<init>(r2, r3)
            return r0
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> cancelAllWork() {
            r3 = this;
            androidx.work.multiprocess.RemoteWorkManagerClient$6 r0 = new androidx.work.multiprocess.RemoteWorkManagerClient$6
            r0.<init>(r3)
            com.google.common.util.concurrent.ListenableFuture r0 = r3.execute(r0)
            androidx.arch.core.util.Function<byte[], java.lang.Void> r1 = androidx.work.multiprocess.RemoteClientUtils.sVoidMapper
            java.util.concurrent.Executor r2 = r3.mExecutor
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.work.multiprocess.RemoteClientUtils.map(r0, r1, r2)
            return r0
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> cancelAllWorkByTag(@androidx.annotation.NonNull java.lang.String r3) {
            r2 = this;
            androidx.work.multiprocess.RemoteWorkManagerClient$4 r0 = new androidx.work.multiprocess.RemoteWorkManagerClient$4
            r0.<init>(r2, r3)
            com.google.common.util.concurrent.ListenableFuture r3 = r2.execute(r0)
            androidx.arch.core.util.Function<byte[], java.lang.Void> r0 = androidx.work.multiprocess.RemoteClientUtils.sVoidMapper
            java.util.concurrent.Executor r1 = r2.mExecutor
            com.google.common.util.concurrent.ListenableFuture r3 = androidx.work.multiprocess.RemoteClientUtils.map(r3, r0, r1)
            return r3
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> cancelUniqueWork(@androidx.annotation.NonNull java.lang.String r3) {
            r2 = this;
            androidx.work.multiprocess.RemoteWorkManagerClient$5 r0 = new androidx.work.multiprocess.RemoteWorkManagerClient$5
            r0.<init>(r2, r3)
            com.google.common.util.concurrent.ListenableFuture r3 = r2.execute(r0)
            androidx.arch.core.util.Function<byte[], java.lang.Void> r0 = androidx.work.multiprocess.RemoteClientUtils.sVoidMapper
            java.util.concurrent.Executor r1 = r2.mExecutor
            com.google.common.util.concurrent.ListenableFuture r3 = androidx.work.multiprocess.RemoteClientUtils.map(r3, r0, r1)
            return r3
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> cancelWorkById(@androidx.annotation.NonNull java.util.UUID r3) {
            r2 = this;
            androidx.work.multiprocess.RemoteWorkManagerClient$3 r0 = new androidx.work.multiprocess.RemoteWorkManagerClient$3
            r0.<init>(r2, r3)
            com.google.common.util.concurrent.ListenableFuture r3 = r2.execute(r0)
            androidx.arch.core.util.Function<byte[], java.lang.Void> r0 = androidx.work.multiprocess.RemoteClientUtils.sVoidMapper
            java.util.concurrent.Executor r1 = r2.mExecutor
            com.google.common.util.concurrent.ListenableFuture r3 = androidx.work.multiprocess.RemoteClientUtils.map(r3, r0, r1)
            return r3
    }

    public void cleanUp() {
            r5 = this;
            java.lang.Object r0 = r5.mLock
            monitor-enter(r0)
            androidx.work.Logger r1 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = androidx.work.multiprocess.RemoteWorkManagerClient.TAG     // Catch: java.lang.Throwable -> L16
            java.lang.String r3 = "Cleaning up."
            r4 = 0
            java.lang.Throwable[] r4 = new java.lang.Throwable[r4]     // Catch: java.lang.Throwable -> L16
            r1.debug(r2, r3, r4)     // Catch: java.lang.Throwable -> L16
            r1 = 0
            r5.mSession = r1     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            return
        L16:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r1
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> enqueue(@androidx.annotation.NonNull androidx.work.WorkContinuation r3) {
            r2 = this;
            androidx.work.multiprocess.RemoteWorkManagerClient$2 r0 = new androidx.work.multiprocess.RemoteWorkManagerClient$2
            r0.<init>(r2, r3)
            com.google.common.util.concurrent.ListenableFuture r3 = r2.execute(r0)
            androidx.arch.core.util.Function<byte[], java.lang.Void> r0 = androidx.work.multiprocess.RemoteClientUtils.sVoidMapper
            java.util.concurrent.Executor r1 = r2.mExecutor
            com.google.common.util.concurrent.ListenableFuture r3 = androidx.work.multiprocess.RemoteClientUtils.map(r3, r0, r1)
            return r3
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> enqueue(@androidx.annotation.NonNull androidx.work.WorkRequest r1) {
            r0 = this;
            java.util.List r1 = java.util.Collections.singletonList(r1)
            com.google.common.util.concurrent.ListenableFuture r1 = r0.enqueue(r1)
            return r1
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> enqueue(@androidx.annotation.NonNull java.util.List<androidx.work.WorkRequest> r3) {
            r2 = this;
            androidx.work.multiprocess.RemoteWorkManagerClient$1 r0 = new androidx.work.multiprocess.RemoteWorkManagerClient$1
            r0.<init>(r2, r3)
            com.google.common.util.concurrent.ListenableFuture r3 = r2.execute(r0)
            androidx.arch.core.util.Function<byte[], java.lang.Void> r0 = androidx.work.multiprocess.RemoteClientUtils.sVoidMapper
            java.util.concurrent.Executor r1 = r2.mExecutor
            com.google.common.util.concurrent.ListenableFuture r3 = androidx.work.multiprocess.RemoteClientUtils.map(r3, r0, r1)
            return r3
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> enqueueUniquePeriodicWork(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull androidx.work.ExistingPeriodicWorkPolicy r3, @androidx.annotation.NonNull androidx.work.PeriodicWorkRequest r4) {
            r1 = this;
            androidx.work.impl.WorkManagerImpl r0 = r1.mWorkManager
            androidx.work.impl.WorkContinuationImpl r2 = r0.createWorkContinuationForUniquePeriodicWork(r2, r3, r4)
            com.google.common.util.concurrent.ListenableFuture r2 = r1.enqueue(r2)
            return r2
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> enqueueUniqueWork(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull androidx.work.ExistingWorkPolicy r2, @androidx.annotation.NonNull java.util.List<androidx.work.OneTimeWorkRequest> r3) {
            r0 = this;
            androidx.work.multiprocess.RemoteWorkContinuation r1 = r0.beginUniqueWork(r1, r2, r3)
            com.google.common.util.concurrent.ListenableFuture r1 = r1.enqueue()
            return r1
    }

    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<byte[]> execute(@androidx.annotation.NonNull androidx.work.multiprocess.RemoteDispatcher<androidx.work.multiprocess.IWorkManagerImpl> r3) {
            r2 = this;
            com.google.common.util.concurrent.ListenableFuture r0 = r2.getSession()
            androidx.work.multiprocess.RemoteWorkManagerClient$SessionRemoteCallback r1 = new androidx.work.multiprocess.RemoteWorkManagerClient$SessionRemoteCallback
            r1.<init>(r2)
            com.google.common.util.concurrent.ListenableFuture r3 = r2.execute(r0, r3, r1)
            return r3
    }

    @androidx.annotation.NonNull
    @androidx.annotation.VisibleForTesting
    com.google.common.util.concurrent.ListenableFuture<byte[]> execute(@androidx.annotation.NonNull com.google.common.util.concurrent.ListenableFuture<androidx.work.multiprocess.IWorkManagerImpl> r2, @androidx.annotation.NonNull androidx.work.multiprocess.RemoteDispatcher<androidx.work.multiprocess.IWorkManagerImpl> r3, @androidx.annotation.NonNull androidx.work.multiprocess.RemoteCallback r4) {
            r1 = this;
            androidx.work.multiprocess.RemoteWorkManagerClient$10 r0 = new androidx.work.multiprocess.RemoteWorkManagerClient$10
            r0.<init>(r1, r2, r4, r3)
            java.util.concurrent.Executor r3 = r1.mExecutor
            r2.addListener(r0, r3)
            com.google.common.util.concurrent.ListenableFuture r2 = r4.getFuture()
            return r2
    }

    @androidx.annotation.NonNull
    public android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = r1.mContext
            return r0
    }

    @androidx.annotation.Nullable
    public androidx.work.multiprocess.RemoteWorkManagerClient.Session getCurrentSession() {
            r1 = this;
            androidx.work.multiprocess.RemoteWorkManagerClient$Session r0 = r1.mSession
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.concurrent.Executor getExecutor() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.mExecutor
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<androidx.work.multiprocess.IWorkManagerImpl> getSession() {
            r1 = this;
            android.content.Context r0 = r1.mContext
            android.content.Intent r0 = newIntent(r0)
            com.google.common.util.concurrent.ListenableFuture r0 = r1.getSession(r0)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.VisibleForTesting
    com.google.common.util.concurrent.ListenableFuture<androidx.work.multiprocess.IWorkManagerImpl> getSession(@androidx.annotation.NonNull android.content.Intent r6) {
            r5 = this;
            java.lang.Object r0 = r5.mLock
            monitor-enter(r0)
            long r1 = r5.mSessionIndex     // Catch: java.lang.Throwable -> L40
            r3 = 1
            long r1 = r1 + r3
            r5.mSessionIndex = r1     // Catch: java.lang.Throwable -> L40
            androidx.work.multiprocess.RemoteWorkManagerClient$Session r1 = r5.mSession     // Catch: java.lang.Throwable -> L40
            if (r1 != 0) goto L42
            androidx.work.Logger r1 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L40
            java.lang.String r2 = androidx.work.multiprocess.RemoteWorkManagerClient.TAG     // Catch: java.lang.Throwable -> L40
            java.lang.String r3 = "Creating a new session"
            r4 = 0
            java.lang.Throwable[] r4 = new java.lang.Throwable[r4]     // Catch: java.lang.Throwable -> L40
            r1.debug(r2, r3, r4)     // Catch: java.lang.Throwable -> L40
            androidx.work.multiprocess.RemoteWorkManagerClient$Session r1 = new androidx.work.multiprocess.RemoteWorkManagerClient$Session     // Catch: java.lang.Throwable -> L40
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L40
            r5.mSession = r1     // Catch: java.lang.Throwable -> L40
            android.content.Context r2 = r5.mContext     // Catch: java.lang.Throwable -> L39
            r3 = 1
            boolean r6 = r2.bindService(r6, r1, r3)     // Catch: java.lang.Throwable -> L39
            if (r6 != 0) goto L42
            androidx.work.multiprocess.RemoteWorkManagerClient$Session r6 = r5.mSession     // Catch: java.lang.Throwable -> L39
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = "Unable to bind to service"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L39
            r5.unableToBind(r6, r1)     // Catch: java.lang.Throwable -> L39
            goto L42
        L39:
            r6 = move-exception
            androidx.work.multiprocess.RemoteWorkManagerClient$Session r1 = r5.mSession     // Catch: java.lang.Throwable -> L40
            r5.unableToBind(r1, r6)     // Catch: java.lang.Throwable -> L40
            goto L42
        L40:
            r6 = move-exception
            goto L4f
        L42:
            android.os.Handler r6 = r5.mHandler     // Catch: java.lang.Throwable -> L40
            androidx.work.multiprocess.RemoteWorkManagerClient$SessionTracker r1 = r5.mSessionTracker     // Catch: java.lang.Throwable -> L40
            r6.removeCallbacks(r1)     // Catch: java.lang.Throwable -> L40
            androidx.work.multiprocess.RemoteWorkManagerClient$Session r6 = r5.mSession     // Catch: java.lang.Throwable -> L40
            androidx.work.impl.utils.futures.SettableFuture<androidx.work.multiprocess.IWorkManagerImpl> r6 = r6.mFuture     // Catch: java.lang.Throwable -> L40
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            return r6
        L4f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            throw r6
    }

    @androidx.annotation.NonNull
    public android.os.Handler getSessionHandler() {
            r1 = this;
            android.os.Handler r0 = r1.mHandler
            return r0
    }

    public long getSessionIndex() {
            r2 = this;
            long r0 = r2.mSessionIndex
            return r0
    }

    @androidx.annotation.NonNull
    public java.lang.Object getSessionLock() {
            r1 = this;
            java.lang.Object r0 = r1.mLock
            return r0
    }

    public long getSessionTimeout() {
            r2 = this;
            long r0 = r2.mSessionTimeout
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.work.multiprocess.RemoteWorkManagerClient.SessionTracker getSessionTracker() {
            r1 = this;
            androidx.work.multiprocess.RemoteWorkManagerClient$SessionTracker r0 = r1.mSessionTracker
            return r0
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.util.List<androidx.work.WorkInfo>> getWorkInfos(@androidx.annotation.NonNull androidx.work.WorkQuery r3) {
            r2 = this;
            androidx.work.multiprocess.RemoteWorkManagerClient$7 r0 = new androidx.work.multiprocess.RemoteWorkManagerClient$7
            r0.<init>(r2, r3)
            com.google.common.util.concurrent.ListenableFuture r3 = r2.execute(r0)
            androidx.work.multiprocess.RemoteWorkManagerClient$8 r0 = new androidx.work.multiprocess.RemoteWorkManagerClient$8
            r0.<init>(r2)
            java.util.concurrent.Executor r1 = r2.mExecutor
            com.google.common.util.concurrent.ListenableFuture r3 = androidx.work.multiprocess.RemoteClientUtils.map(r3, r0, r1)
            return r3
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setProgress(@androidx.annotation.NonNull java.util.UUID r2, @androidx.annotation.NonNull androidx.work.Data r3) {
            r1 = this;
            androidx.work.multiprocess.RemoteWorkManagerClient$9 r0 = new androidx.work.multiprocess.RemoteWorkManagerClient$9
            r0.<init>(r1, r2, r3)
            com.google.common.util.concurrent.ListenableFuture r2 = r1.execute(r0)
            androidx.arch.core.util.Function<byte[], java.lang.Void> r3 = androidx.work.multiprocess.RemoteClientUtils.sVoidMapper
            java.util.concurrent.Executor r0 = r1.mExecutor
            com.google.common.util.concurrent.ListenableFuture r2 = androidx.work.multiprocess.RemoteClientUtils.map(r2, r3, r0)
            return r2
    }
}
