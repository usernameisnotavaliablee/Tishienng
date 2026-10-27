package androidx.work.multiprocess;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ListenableWorkerImplClient {
    static final java.lang.String TAG = null;
    private androidx.work.multiprocess.ListenableWorkerImplClient.Connection mConnection;
    final android.content.Context mContext;
    final java.util.concurrent.Executor mExecutor;
    private final java.lang.Object mLock;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static class Connection implements android.content.ServiceConnection {
        private static final java.lang.String TAG = null;
        final androidx.work.impl.utils.futures.SettableFuture<androidx.work.multiprocess.IListenableWorkerImpl> mFuture;

        static {
                java.lang.String r0 = "ListenableWorkerImplSession"
                java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
                androidx.work.multiprocess.ListenableWorkerImplClient.Connection.TAG = r0
                return
        }

        public Connection() {
                r1 = this;
                r1.<init>()
                androidx.work.impl.utils.futures.SettableFuture r0 = androidx.work.impl.utils.futures.SettableFuture.create()
                r1.mFuture = r0
                return
        }

        @Override // android.content.ServiceConnection
        public void onBindingDied(@androidx.annotation.NonNull android.content.ComponentName r4) {
                r3 = this;
                androidx.work.Logger r4 = androidx.work.Logger.get()
                java.lang.String r0 = androidx.work.multiprocess.ListenableWorkerImplClient.Connection.TAG
                r1 = 0
                java.lang.Throwable[] r1 = new java.lang.Throwable[r1]
                java.lang.String r2 = "Binding died"
                r4.warning(r0, r2, r1)
                androidx.work.impl.utils.futures.SettableFuture<androidx.work.multiprocess.IListenableWorkerImpl> r4 = r3.mFuture
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r0.<init>(r2)
                r4.setException(r0)
                return
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(@androidx.annotation.NonNull android.content.ComponentName r6) {
                r5 = this;
                androidx.work.Logger r0 = androidx.work.Logger.get()
                java.lang.String r1 = androidx.work.multiprocess.ListenableWorkerImplClient.Connection.TAG
                r2 = 0
                java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
                java.lang.String r4 = "Unable to bind to service"
                r0.error(r1, r4, r3)
                androidx.work.impl.utils.futures.SettableFuture<androidx.work.multiprocess.IListenableWorkerImpl> r0 = r5.mFuture
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
                java.lang.String r0 = androidx.work.multiprocess.ListenableWorkerImplClient.Connection.TAG
                r1 = 0
                java.lang.Throwable[] r1 = new java.lang.Throwable[r1]
                java.lang.String r2 = "Service connected"
                r4.debug(r0, r2, r1)
                androidx.work.multiprocess.IListenableWorkerImpl r4 = androidx.work.multiprocess.IListenableWorkerImpl.Stub.asInterface(r5)
                androidx.work.impl.utils.futures.SettableFuture<androidx.work.multiprocess.IListenableWorkerImpl> r5 = r3.mFuture
                r5.set(r4)
                return
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(@androidx.annotation.NonNull android.content.ComponentName r4) {
                r3 = this;
                androidx.work.Logger r4 = androidx.work.Logger.get()
                java.lang.String r0 = androidx.work.multiprocess.ListenableWorkerImplClient.Connection.TAG
                r1 = 0
                java.lang.Throwable[] r1 = new java.lang.Throwable[r1]
                java.lang.String r2 = "Service disconnected"
                r4.warning(r0, r2, r1)
                androidx.work.impl.utils.futures.SettableFuture<androidx.work.multiprocess.IListenableWorkerImpl> r4 = r3.mFuture
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r0.<init>(r2)
                r4.setException(r0)
                return
        }
    }

    static {
            java.lang.String r0 = "ListenableWorkerImplClient"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.multiprocess.ListenableWorkerImplClient.TAG = r0
            return
    }

    public ListenableWorkerImplClient(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull java.util.concurrent.Executor r2) {
            r0 = this;
            r0.<init>()
            r0.mContext = r1
            r0.mExecutor = r2
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.mLock = r1
            return
    }

    private static void unableToBind(@androidx.annotation.NonNull androidx.work.multiprocess.ListenableWorkerImplClient.Connection r4, @androidx.annotation.NonNull java.lang.Throwable r5) {
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r1 = androidx.work.multiprocess.ListenableWorkerImplClient.TAG
            r2 = 1
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r3 = 0
            r2[r3] = r5
            java.lang.String r3 = "Unable to bind to service"
            r0.error(r1, r3, r2)
            androidx.work.impl.utils.futures.SettableFuture<androidx.work.multiprocess.IListenableWorkerImpl> r4 = r4.mFuture
            r4.setException(r5)
            return
    }

    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<byte[]> execute(@androidx.annotation.NonNull android.content.ComponentName r2, @androidx.annotation.NonNull androidx.work.multiprocess.RemoteDispatcher<androidx.work.multiprocess.IListenableWorkerImpl> r3) {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture r2 = r1.getListenableWorkerImpl(r2)
            androidx.work.multiprocess.RemoteCallback r0 = new androidx.work.multiprocess.RemoteCallback
            r0.<init>()
            com.google.common.util.concurrent.ListenableFuture r2 = r1.execute(r2, r3, r0)
            return r2
    }

    @androidx.annotation.NonNull
    @android.annotation.SuppressLint({"LambdaLast"})
    public com.google.common.util.concurrent.ListenableFuture<byte[]> execute(@androidx.annotation.NonNull com.google.common.util.concurrent.ListenableFuture<androidx.work.multiprocess.IListenableWorkerImpl> r2, @androidx.annotation.NonNull androidx.work.multiprocess.RemoteDispatcher<androidx.work.multiprocess.IListenableWorkerImpl> r3, @androidx.annotation.NonNull androidx.work.multiprocess.RemoteCallback r4) {
            r1 = this;
            androidx.work.multiprocess.ListenableWorkerImplClient$1 r0 = new androidx.work.multiprocess.ListenableWorkerImplClient$1
            r0.<init>(r1, r2, r4, r3)
            java.util.concurrent.Executor r3 = r1.mExecutor
            r2.addListener(r0, r3)
            com.google.common.util.concurrent.ListenableFuture r2 = r4.getFuture()
            return r2
    }

    @androidx.annotation.Nullable
    @androidx.annotation.VisibleForTesting
    public androidx.work.multiprocess.ListenableWorkerImplClient.Connection getConnection() {
            r1 = this;
            androidx.work.multiprocess.ListenableWorkerImplClient$Connection r0 = r1.mConnection
            return r0
    }

    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<androidx.work.multiprocess.IListenableWorkerImpl> getListenableWorkerImpl(@androidx.annotation.NonNull android.content.ComponentName r9) {
            r8 = this;
            java.lang.Object r0 = r8.mLock
            monitor-enter(r0)
            androidx.work.multiprocess.ListenableWorkerImplClient$Connection r1 = r8.mConnection     // Catch: java.lang.Throwable -> L56
            if (r1 != 0) goto L58
            androidx.work.Logger r1 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L56
            java.lang.String r2 = androidx.work.multiprocess.ListenableWorkerImplClient.TAG     // Catch: java.lang.Throwable -> L56
            java.lang.String r3 = "Binding to %s, %s"
            java.lang.String r4 = r9.getPackageName()     // Catch: java.lang.Throwable -> L56
            java.lang.String r5 = r9.getClassName()     // Catch: java.lang.Throwable -> L56
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L56
            r7 = 0
            r6[r7] = r4     // Catch: java.lang.Throwable -> L56
            r4 = 1
            r6[r4] = r5     // Catch: java.lang.Throwable -> L56
            java.lang.String r3 = java.lang.String.format(r3, r6)     // Catch: java.lang.Throwable -> L56
            java.lang.Throwable[] r5 = new java.lang.Throwable[r7]     // Catch: java.lang.Throwable -> L56
            r1.debug(r2, r3, r5)     // Catch: java.lang.Throwable -> L56
            androidx.work.multiprocess.ListenableWorkerImplClient$Connection r1 = new androidx.work.multiprocess.ListenableWorkerImplClient$Connection     // Catch: java.lang.Throwable -> L56
            r1.<init>()     // Catch: java.lang.Throwable -> L56
            r8.mConnection = r1     // Catch: java.lang.Throwable -> L56
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L4f
            r1.<init>()     // Catch: java.lang.Throwable -> L4f
            r1.setComponent(r9)     // Catch: java.lang.Throwable -> L4f
            android.content.Context r9 = r8.mContext     // Catch: java.lang.Throwable -> L4f
            androidx.work.multiprocess.ListenableWorkerImplClient$Connection r2 = r8.mConnection     // Catch: java.lang.Throwable -> L4f
            boolean r9 = r9.bindService(r1, r2, r4)     // Catch: java.lang.Throwable -> L4f
            if (r9 != 0) goto L58
            androidx.work.multiprocess.ListenableWorkerImplClient$Connection r9 = r8.mConnection     // Catch: java.lang.Throwable -> L4f
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L4f
            java.lang.String r2 = "Unable to bind to service"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L4f
            unableToBind(r9, r1)     // Catch: java.lang.Throwable -> L4f
            goto L58
        L4f:
            r9 = move-exception
            androidx.work.multiprocess.ListenableWorkerImplClient$Connection r1 = r8.mConnection     // Catch: java.lang.Throwable -> L56
            unableToBind(r1, r9)     // Catch: java.lang.Throwable -> L56
            goto L58
        L56:
            r9 = move-exception
            goto L5e
        L58:
            androidx.work.multiprocess.ListenableWorkerImplClient$Connection r9 = r8.mConnection     // Catch: java.lang.Throwable -> L56
            androidx.work.impl.utils.futures.SettableFuture<androidx.work.multiprocess.IListenableWorkerImpl> r9 = r9.mFuture     // Catch: java.lang.Throwable -> L56
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
            return r9
        L5e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
            throw r9
    }

    public void unbindService() {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            androidx.work.multiprocess.ListenableWorkerImplClient$Connection r1 = r3.mConnection     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto L12
            android.content.Context r2 = r3.mContext     // Catch: java.lang.Throwable -> L10
            r2.unbindService(r1)     // Catch: java.lang.Throwable -> L10
            r1 = 0
            r3.mConnection = r1     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r1 = move-exception
            goto L14
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L14:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
    }
}
