package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class LiveDataObservable<T> implements androidx.camera.core.impl.Observable<T> {
    final androidx.lifecycle.MutableLiveData<androidx.camera.core.impl.LiveDataObservable.Result<T>> mLiveData;

    @androidx.annotation.GuardedBy("mObservers")
    private final java.util.Map<androidx.camera.core.impl.Observable.Observer<? super T>, androidx.camera.core.impl.LiveDataObservable.LiveDataObserverAdapter<T>> mObservers;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class LiveDataObserverAdapter<T> implements androidx.lifecycle.Observer<androidx.camera.core.impl.LiveDataObservable.Result<T>> {
        final java.util.concurrent.atomic.AtomicBoolean mActive;
        final java.util.concurrent.Executor mExecutor;
        final androidx.camera.core.impl.Observable.Observer<? super T> mObserver;

        LiveDataObserverAdapter(@androidx.annotation.NonNull java.util.concurrent.Executor r3, @androidx.annotation.NonNull androidx.camera.core.impl.Observable.Observer<? super T> r4) {
                r2 = this;
                r2.<init>()
                java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
                r1 = 1
                r0.<init>(r1)
                r2.mActive = r0
                r2.mExecutor = r3
                r2.mObserver = r4
                return
        }

        public static /* synthetic */ void a(androidx.camera.core.impl.LiveDataObservable.LiveDataObserverAdapter r1, androidx.camera.core.impl.LiveDataObservable.Result r2) {
                java.util.concurrent.atomic.AtomicBoolean r0 = r1.mActive
                boolean r0 = r0.get()
                if (r0 != 0) goto L9
                return
            L9:
                boolean r0 = r2.completedSuccessfully()
                if (r0 == 0) goto L19
                androidx.camera.core.impl.Observable$Observer<? super T> r1 = r1.mObserver
                java.lang.Object r2 = r2.getValue()
                r1.onNewData(r2)
                return
            L19:
                java.lang.Throwable r0 = r2.getError()
                androidx.core.util.Preconditions.checkNotNull(r0)
                androidx.camera.core.impl.Observable$Observer<? super T> r1 = r1.mObserver
                java.lang.Throwable r2 = r2.getError()
                r1.onError(r2)
                return
        }

        void disable() {
                r2 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r2.mActive
                r1 = 0
                r0.set(r1)
                return
        }

        public void onChanged(@androidx.annotation.NonNull androidx.camera.core.impl.LiveDataObservable.Result<T> r3) {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.mExecutor
                androidx.camera.core.impl.e0 r1 = new androidx.camera.core.impl.e0
                r1.<init>(r2, r3)
                r0.execute(r1)
                return
        }

        @Override // androidx.lifecycle.Observer
        public /* bridge */ /* synthetic */ void onChanged(@androidx.annotation.NonNull java.lang.Object r1) {
                r0 = this;
                androidx.camera.core.impl.LiveDataObservable$Result r1 = (androidx.camera.core.impl.LiveDataObservable.Result) r1
                r0.onChanged(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Result<T> {

        @androidx.annotation.Nullable
        private final java.lang.Throwable mError;

        @androidx.annotation.Nullable
        private final T mValue;

        private Result(@androidx.annotation.Nullable T r1, @androidx.annotation.Nullable java.lang.Throwable r2) {
                r0 = this;
                r0.<init>()
                r0.mValue = r1
                r0.mError = r2
                return
        }

        static <T> androidx.camera.core.impl.LiveDataObservable.Result<T> fromError(@androidx.annotation.NonNull java.lang.Throwable r2) {
                androidx.camera.core.impl.LiveDataObservable$Result r0 = new androidx.camera.core.impl.LiveDataObservable$Result
                java.lang.Object r2 = androidx.core.util.Preconditions.checkNotNull(r2)
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                r1 = 0
                r0.<init>(r1, r2)
                return r0
        }

        static <T> androidx.camera.core.impl.LiveDataObservable.Result<T> fromValue(@androidx.annotation.Nullable T r2) {
                androidx.camera.core.impl.LiveDataObservable$Result r0 = new androidx.camera.core.impl.LiveDataObservable$Result
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public boolean completedSuccessfully() {
                r1 = this;
                java.lang.Throwable r0 = r1.mError
                if (r0 != 0) goto L6
                r0 = 1
                return r0
            L6:
                r0 = 0
                return r0
        }

        @androidx.annotation.Nullable
        public java.lang.Throwable getError() {
                r1 = this;
                java.lang.Throwable r0 = r1.mError
                return r0
        }

        @androidx.annotation.Nullable
        public T getValue() {
                r2 = this;
                boolean r0 = r2.completedSuccessfully()
                if (r0 == 0) goto L9
                T r0 = r2.mValue
                return r0
            L9:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Result contains an error. Does not contain a value."
                r0.<init>(r1)
                throw r0
        }

        @androidx.annotation.NonNull
        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "[Result: <"
                r0.append(r1)
                boolean r1 = r3.completedSuccessfully()
                if (r1 == 0) goto L24
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Value: "
                r1.append(r2)
                T r2 = r3.mValue
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                goto L37
            L24:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Error: "
                r1.append(r2)
                java.lang.Throwable r2 = r3.mError
                r1.append(r2)
                java.lang.String r1 = r1.toString()
            L37:
                r0.append(r1)
                java.lang.String r1 = ">]"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public LiveDataObservable() {
            r1 = this;
            r1.<init>()
            androidx.lifecycle.MutableLiveData r0 = new androidx.lifecycle.MutableLiveData
            r0.<init>()
            r1.mLiveData = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mObservers = r0
            return
    }

    public static /* synthetic */ java.lang.Object a(androidx.camera.core.impl.LiveDataObservable r2, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r3) {
            r2.getClass()
            java.util.concurrent.ScheduledExecutorService r0 = androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor()
            androidx.camera.core.impl.c0 r1 = new androidx.camera.core.impl.c0
            r1.<init>(r2, r3)
            r0.execute(r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = " [fetch@"
            r3.append(r2)
            long r0 = android.os.SystemClock.uptimeMillis()
            r3.append(r0)
            java.lang.String r2 = "]"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            return r2
    }

    public static /* synthetic */ void b(androidx.camera.core.impl.LiveDataObservable r0, androidx.camera.core.impl.LiveDataObservable.LiveDataObserverAdapter r1) {
            androidx.lifecycle.MutableLiveData<androidx.camera.core.impl.LiveDataObservable$Result<T>> r0 = r0.mLiveData
            r0.removeObserver(r1)
            return
    }

    public static /* synthetic */ void c(androidx.camera.core.impl.LiveDataObservable r1, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r2) {
            androidx.lifecycle.MutableLiveData<androidx.camera.core.impl.LiveDataObservable$Result<T>> r1 = r1.mLiveData
            java.lang.Object r1 = r1.getValue()
            androidx.camera.core.impl.LiveDataObservable$Result r1 = (androidx.camera.core.impl.LiveDataObservable.Result) r1
            if (r1 != 0) goto L15
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Observable has not yet been initialized with a value."
            r1.<init>(r0)
            r2.setException(r1)
            return
        L15:
            boolean r0 = r1.completedSuccessfully()
            if (r0 == 0) goto L23
            java.lang.Object r1 = r1.getValue()
            r2.set(r1)
            return
        L23:
            java.lang.Throwable r0 = r1.getError()
            androidx.core.util.Preconditions.checkNotNull(r0)
            java.lang.Throwable r1 = r1.getError()
            r2.setException(r1)
            return
    }

    public static /* synthetic */ void d(androidx.camera.core.impl.LiveDataObservable r1, androidx.camera.core.impl.LiveDataObservable.LiveDataObserverAdapter r2, androidx.camera.core.impl.LiveDataObservable.LiveDataObserverAdapter r3) {
            if (r2 == 0) goto L7
            androidx.lifecycle.MutableLiveData<androidx.camera.core.impl.LiveDataObservable$Result<T>> r0 = r1.mLiveData
            r0.removeObserver(r2)
        L7:
            androidx.lifecycle.MutableLiveData<androidx.camera.core.impl.LiveDataObservable$Result<T>> r1 = r1.mLiveData
            r1.observeForever(r3)
            return
    }

    @Override // androidx.camera.core.impl.Observable
    public void addObserver(@androidx.annotation.NonNull java.util.concurrent.Executor r4, @androidx.annotation.NonNull androidx.camera.core.impl.Observable.Observer<? super T> r5) {
            r3 = this;
            java.util.Map<androidx.camera.core.impl.Observable$Observer<? super T>, androidx.camera.core.impl.LiveDataObservable$LiveDataObserverAdapter<T>> r0 = r3.mObservers
            monitor-enter(r0)
            java.util.Map<androidx.camera.core.impl.Observable$Observer<? super T>, androidx.camera.core.impl.LiveDataObservable$LiveDataObserverAdapter<T>> r1 = r3.mObservers     // Catch: java.lang.Throwable -> L11
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L11
            androidx.camera.core.impl.LiveDataObservable$LiveDataObserverAdapter r1 = (androidx.camera.core.impl.LiveDataObservable.LiveDataObserverAdapter) r1     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L13
            r1.disable()     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r4 = move-exception
            goto L2b
        L13:
            androidx.camera.core.impl.LiveDataObservable$LiveDataObserverAdapter r2 = new androidx.camera.core.impl.LiveDataObservable$LiveDataObserverAdapter     // Catch: java.lang.Throwable -> L11
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> L11
            java.util.Map<androidx.camera.core.impl.Observable$Observer<? super T>, androidx.camera.core.impl.LiveDataObservable$LiveDataObserverAdapter<T>> r4 = r3.mObservers     // Catch: java.lang.Throwable -> L11
            r4.put(r5, r2)     // Catch: java.lang.Throwable -> L11
            java.util.concurrent.ScheduledExecutorService r4 = androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor()     // Catch: java.lang.Throwable -> L11
            androidx.camera.core.impl.b0 r5 = new androidx.camera.core.impl.b0     // Catch: java.lang.Throwable -> L11
            r5.<init>(r3, r1, r2)     // Catch: java.lang.Throwable -> L11
            r4.execute(r5)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L2b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r4
    }

    @Override // androidx.camera.core.impl.Observable
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<T> fetchData() {
            r1 = this;
            androidx.camera.core.impl.d0 r0 = new androidx.camera.core.impl.d0
            r0.<init>(r1)
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r0)
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.lifecycle.LiveData<androidx.camera.core.impl.LiveDataObservable.Result<T>> getLiveData() {
            r1 = this;
            androidx.lifecycle.MutableLiveData<androidx.camera.core.impl.LiveDataObservable$Result<T>> r0 = r1.mLiveData
            return r0
    }

    public void postError(@androidx.annotation.NonNull java.lang.Throwable r2) {
            r1 = this;
            androidx.lifecycle.MutableLiveData<androidx.camera.core.impl.LiveDataObservable$Result<T>> r0 = r1.mLiveData
            androidx.camera.core.impl.LiveDataObservable$Result r2 = androidx.camera.core.impl.LiveDataObservable.Result.fromError(r2)
            r0.postValue(r2)
            return
    }

    public void postValue(@androidx.annotation.Nullable T r2) {
            r1 = this;
            androidx.lifecycle.MutableLiveData<androidx.camera.core.impl.LiveDataObservable$Result<T>> r0 = r1.mLiveData
            androidx.camera.core.impl.LiveDataObservable$Result r2 = androidx.camera.core.impl.LiveDataObservable.Result.fromValue(r2)
            r0.postValue(r2)
            return
    }

    @Override // androidx.camera.core.impl.Observable
    public void removeObserver(@androidx.annotation.NonNull androidx.camera.core.impl.Observable.Observer<? super T> r4) {
            r3 = this;
            java.util.Map<androidx.camera.core.impl.Observable$Observer<? super T>, androidx.camera.core.impl.LiveDataObservable$LiveDataObserverAdapter<T>> r0 = r3.mObservers
            monitor-enter(r0)
            java.util.Map<androidx.camera.core.impl.Observable$Observer<? super T>, androidx.camera.core.impl.LiveDataObservable$LiveDataObserverAdapter<T>> r1 = r3.mObservers     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r4 = r1.remove(r4)     // Catch: java.lang.Throwable -> L1d
            androidx.camera.core.impl.LiveDataObservable$LiveDataObserverAdapter r4 = (androidx.camera.core.impl.LiveDataObservable.LiveDataObserverAdapter) r4     // Catch: java.lang.Throwable -> L1d
            if (r4 == 0) goto L1f
            r4.disable()     // Catch: java.lang.Throwable -> L1d
            java.util.concurrent.ScheduledExecutorService r1 = androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor()     // Catch: java.lang.Throwable -> L1d
            androidx.camera.core.impl.a0 r2 = new androidx.camera.core.impl.a0     // Catch: java.lang.Throwable -> L1d
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L1d
            r1.execute(r2)     // Catch: java.lang.Throwable -> L1d
            goto L1f
        L1d:
            r4 = move-exception
            goto L21
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r4
    }
}
