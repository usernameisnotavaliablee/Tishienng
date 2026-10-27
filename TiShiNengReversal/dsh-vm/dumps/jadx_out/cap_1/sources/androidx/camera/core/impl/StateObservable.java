package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class StateObservable<T> implements androidx.camera.core.impl.Observable<T> {
    private static final int INITIAL_VERSION = 0;
    private final java.lang.Object mLock;

    @androidx.annotation.GuardedBy("mLock")
    private final java.util.concurrent.CopyOnWriteArraySet<androidx.camera.core.impl.StateObservable.ObserverWrapper<T>> mNotifySet;
    private final java.util.concurrent.atomic.AtomicReference<java.lang.Object> mState;

    @androidx.annotation.GuardedBy("mLock")
    private boolean mUpdating;

    @androidx.annotation.GuardedBy("mLock")
    private int mVersion;

    @androidx.annotation.GuardedBy("mLock")
    private final java.util.Map<androidx.camera.core.impl.Observable.Observer<? super T>, androidx.camera.core.impl.StateObservable.ObserverWrapper<T>> mWrapperMap;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.auto.value.AutoValue
    static abstract class ErrorWrapper {
        ErrorWrapper() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        static androidx.camera.core.impl.StateObservable.ErrorWrapper wrap(@androidx.annotation.NonNull java.lang.Throwable r1) {
                androidx.camera.core.impl.AutoValue_StateObservable_ErrorWrapper r0 = new androidx.camera.core.impl.AutoValue_StateObservable_ErrorWrapper
                r0.<init>(r1)
                return r0
        }

        @androidx.annotation.NonNull
        public abstract java.lang.Throwable getError();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class ObserverWrapper<T> implements java.lang.Runnable {
        private static final java.lang.Object NOT_SET = null;
        private static final int NO_VERSION = -1;
        private final java.util.concurrent.atomic.AtomicBoolean mActive;
        private final java.util.concurrent.Executor mExecutor;
        private java.lang.Object mLastState;

        @androidx.annotation.GuardedBy("this")
        private int mLatestSignalledVersion;
        private final androidx.camera.core.impl.Observable.Observer<? super T> mObserver;
        private final java.util.concurrent.atomic.AtomicReference<java.lang.Object> mStateRef;

        @androidx.annotation.GuardedBy("this")
        private boolean mWrapperUpdating;

        static {
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                androidx.camera.core.impl.StateObservable.ObserverWrapper.NOT_SET = r0
                return
        }

        ObserverWrapper(@androidx.annotation.NonNull java.util.concurrent.atomic.AtomicReference<java.lang.Object> r3, @androidx.annotation.NonNull java.util.concurrent.Executor r4, @androidx.annotation.NonNull androidx.camera.core.impl.Observable.Observer<? super T> r5) {
                r2 = this;
                r2.<init>()
                java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
                r1 = 1
                r0.<init>(r1)
                r2.mActive = r0
                java.lang.Object r0 = androidx.camera.core.impl.StateObservable.ObserverWrapper.NOT_SET
                r2.mLastState = r0
                r0 = -1
                r2.mLatestSignalledVersion = r0
                r0 = 0
                r2.mWrapperUpdating = r0
                r2.mStateRef = r3
                r2.mExecutor = r4
                r2.mObserver = r5
                return
        }

        void close() {
                r2 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r2.mActive
                r1 = 0
                r0.set(r1)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                monitor-enter(r4)
                java.util.concurrent.atomic.AtomicBoolean r0 = r4.mActive     // Catch: java.lang.Throwable -> Le
                boolean r0 = r0.get()     // Catch: java.lang.Throwable -> Le
                r1 = 0
                if (r0 != 0) goto L10
                r4.mWrapperUpdating = r1     // Catch: java.lang.Throwable -> Le
                monitor-exit(r4)     // Catch: java.lang.Throwable -> Le
                return
            Le:
                r0 = move-exception
                goto L58
            L10:
                java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r4.mStateRef     // Catch: java.lang.Throwable -> Le
                java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> Le
                int r2 = r4.mLatestSignalledVersion     // Catch: java.lang.Throwable -> Le
                monitor-exit(r4)     // Catch: java.lang.Throwable -> Le
            L19:
                java.lang.Object r3 = r4.mLastState
                boolean r3 = java.util.Objects.equals(r3, r0)
                if (r3 != 0) goto L38
                r4.mLastState = r0
                boolean r3 = r0 instanceof androidx.camera.core.impl.StateObservable.ErrorWrapper
                if (r3 == 0) goto L33
                androidx.camera.core.impl.Observable$Observer<? super T> r3 = r4.mObserver
                androidx.camera.core.impl.StateObservable$ErrorWrapper r0 = (androidx.camera.core.impl.StateObservable.ErrorWrapper) r0
                java.lang.Throwable r0 = r0.getError()
                r3.onError(r0)
                goto L38
            L33:
                androidx.camera.core.impl.Observable$Observer<? super T> r3 = r4.mObserver
                r3.onNewData(r0)
            L38:
                monitor-enter(r4)
                int r0 = r4.mLatestSignalledVersion     // Catch: java.lang.Throwable -> L50
                if (r2 == r0) goto L52
                java.util.concurrent.atomic.AtomicBoolean r0 = r4.mActive     // Catch: java.lang.Throwable -> L50
                boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L50
                if (r0 != 0) goto L46
                goto L52
            L46:
                java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r4.mStateRef     // Catch: java.lang.Throwable -> L50
                java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L50
                int r2 = r4.mLatestSignalledVersion     // Catch: java.lang.Throwable -> L50
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L50
                goto L19
            L50:
                r0 = move-exception
                goto L56
            L52:
                r4.mWrapperUpdating = r1     // Catch: java.lang.Throwable -> L50
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L50
                return
            L56:
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L50
                throw r0
            L58:
                monitor-exit(r4)     // Catch: java.lang.Throwable -> Le
                throw r0
        }

        void update(int r2) {
                r1 = this;
                monitor-enter(r1)
                java.util.concurrent.atomic.AtomicBoolean r0 = r1.mActive     // Catch: java.lang.Throwable -> Lb
                boolean r0 = r0.get()     // Catch: java.lang.Throwable -> Lb
                if (r0 != 0) goto Ld
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
                return
            Lb:
                r2 = move-exception
                goto L2e
            Ld:
                int r0 = r1.mLatestSignalledVersion     // Catch: java.lang.Throwable -> Lb
                if (r2 > r0) goto L13
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
                return
            L13:
                r1.mLatestSignalledVersion = r2     // Catch: java.lang.Throwable -> Lb
                boolean r2 = r1.mWrapperUpdating     // Catch: java.lang.Throwable -> Lb
                if (r2 == 0) goto L1b
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
                return
            L1b:
                r2 = 1
                r1.mWrapperUpdating = r2     // Catch: java.lang.Throwable -> Lb
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
                java.util.concurrent.Executor r2 = r1.mExecutor     // Catch: java.lang.Throwable -> L25
                r2.execute(r1)     // Catch: java.lang.Throwable -> L25
                return
            L25:
                monitor-enter(r1)
                r2 = 0
                r1.mWrapperUpdating = r2     // Catch: java.lang.Throwable -> L2b
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L2b
                return
            L2b:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L2b
                throw r2
            L2e:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
                throw r2
        }
    }

    StateObservable(@androidx.annotation.Nullable java.lang.Object r2, boolean r3) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.mLock = r0
            r0 = 0
            r1.mVersion = r0
            r1.mUpdating = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mWrapperMap = r0
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
            r0.<init>()
            r1.mNotifySet = r0
            if (r3 == 0) goto L34
            boolean r3 = r2 instanceof java.lang.Throwable
            java.lang.String r0 = "Initial errors must be Throwable"
            androidx.core.util.Preconditions.checkArgument(r3, r0)
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            androidx.camera.core.impl.StateObservable$ErrorWrapper r2 = androidx.camera.core.impl.StateObservable.ErrorWrapper.wrap(r2)
            r3.<init>(r2)
            r1.mState = r3
            return
        L34:
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference
            r3.<init>(r2)
            r1.mState = r3
            return
    }

    @androidx.annotation.GuardedBy("mLock")
    private void removeObserverLocked(@androidx.annotation.NonNull androidx.camera.core.impl.Observable.Observer<? super T> r2) {
            r1 = this;
            java.util.Map<androidx.camera.core.impl.Observable$Observer<? super T>, androidx.camera.core.impl.StateObservable$ObserverWrapper<T>> r0 = r1.mWrapperMap
            java.lang.Object r2 = r0.remove(r2)
            androidx.camera.core.impl.StateObservable$ObserverWrapper r2 = (androidx.camera.core.impl.StateObservable.ObserverWrapper) r2
            if (r2 == 0) goto L12
            r2.close()
            java.util.concurrent.CopyOnWriteArraySet<androidx.camera.core.impl.StateObservable$ObserverWrapper<T>> r0 = r1.mNotifySet
            r0.remove(r2)
        L12:
            return
    }

    private void updateStateInternal(@androidx.annotation.Nullable java.lang.Object r4) {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r1 = r3.mState     // Catch: java.lang.Throwable -> L11
            java.lang.Object r1 = r1.getAndSet(r4)     // Catch: java.lang.Throwable -> L11
            boolean r4 = java.util.Objects.equals(r1, r4)     // Catch: java.lang.Throwable -> L11
            if (r4 == 0) goto L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r4 = move-exception
            goto L54
        L13:
            int r4 = r3.mVersion     // Catch: java.lang.Throwable -> L11
            r1 = 1
            int r4 = r4 + r1
            r3.mVersion = r4     // Catch: java.lang.Throwable -> L11
            boolean r2 = r3.mUpdating     // Catch: java.lang.Throwable -> L11
            if (r2 == 0) goto L1f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L1f:
            r3.mUpdating = r1     // Catch: java.lang.Throwable -> L11
            java.util.concurrent.CopyOnWriteArraySet<androidx.camera.core.impl.StateObservable$ObserverWrapper<T>> r1 = r3.mNotifySet     // Catch: java.lang.Throwable -> L11
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
        L28:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L38
            java.lang.Object r0 = r1.next()
            androidx.camera.core.impl.StateObservable$ObserverWrapper r0 = (androidx.camera.core.impl.StateObservable.ObserverWrapper) r0
            r0.update(r4)
            goto L28
        L38:
            java.lang.Object r1 = r3.mLock
            monitor-enter(r1)
            int r0 = r3.mVersion     // Catch: java.lang.Throwable -> L44
            if (r0 != r4) goto L46
            r4 = 0
            r3.mUpdating = r4     // Catch: java.lang.Throwable -> L44
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L44
            return
        L44:
            r4 = move-exception
            goto L52
        L46:
            java.util.concurrent.CopyOnWriteArraySet<androidx.camera.core.impl.StateObservable$ObserverWrapper<T>> r4 = r3.mNotifySet     // Catch: java.lang.Throwable -> L44
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L44
            int r0 = r3.mVersion     // Catch: java.lang.Throwable -> L44
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L44
            r1 = r4
            r4 = r0
            goto L28
        L52:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L44
            throw r4
        L54:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r4
    }

    @Override // androidx.camera.core.impl.Observable
    public void addObserver(@androidx.annotation.NonNull java.util.concurrent.Executor r4, @androidx.annotation.NonNull androidx.camera.core.impl.Observable.Observer<? super T> r5) {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            r3.removeObserverLocked(r5)     // Catch: java.lang.Throwable -> L1d
            androidx.camera.core.impl.StateObservable$ObserverWrapper r1 = new androidx.camera.core.impl.StateObservable$ObserverWrapper     // Catch: java.lang.Throwable -> L1d
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r2 = r3.mState     // Catch: java.lang.Throwable -> L1d
            r1.<init>(r2, r4, r5)     // Catch: java.lang.Throwable -> L1d
            java.util.Map<androidx.camera.core.impl.Observable$Observer<? super T>, androidx.camera.core.impl.StateObservable$ObserverWrapper<T>> r4 = r3.mWrapperMap     // Catch: java.lang.Throwable -> L1d
            r4.put(r5, r1)     // Catch: java.lang.Throwable -> L1d
            java.util.concurrent.CopyOnWriteArraySet<androidx.camera.core.impl.StateObservable$ObserverWrapper<T>> r4 = r3.mNotifySet     // Catch: java.lang.Throwable -> L1d
            r4.add(r1)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            r4 = 0
            r1.update(r4)
            return
        L1d:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r4
    }

    @Override // androidx.camera.core.impl.Observable
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<T> fetchData() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r2.mState
            java.lang.Object r0 = r0.get()
            boolean r1 = r0 instanceof androidx.camera.core.impl.StateObservable.ErrorWrapper
            if (r1 == 0) goto L15
            androidx.camera.core.impl.StateObservable$ErrorWrapper r0 = (androidx.camera.core.impl.StateObservable.ErrorWrapper) r0
            java.lang.Throwable r0 = r0.getError()
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(r0)
            return r0
        L15:
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(r0)
            return r0
    }

    @Override // androidx.camera.core.impl.Observable
    public void removeObserver(@androidx.annotation.NonNull androidx.camera.core.impl.Observable.Observer<? super T> r2) {
            r1 = this;
            java.lang.Object r0 = r1.mLock
            monitor-enter(r0)
            r1.removeObserverLocked(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            throw r2
    }

    void updateState(@androidx.annotation.Nullable T r1) {
            r0 = this;
            r0.updateStateInternal(r1)
            return
    }

    void updateStateAsError(@androidx.annotation.NonNull java.lang.Throwable r1) {
            r0 = this;
            androidx.camera.core.impl.StateObservable$ErrorWrapper r1 = androidx.camera.core.impl.StateObservable.ErrorWrapper.wrap(r1)
            r0.updateStateInternal(r1)
            return
    }
}
