package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class RoomTrackingLiveData<T> extends androidx.lifecycle.LiveData<T> {

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.atomic.AtomicBoolean computing;

    @org.jetbrains.annotations.NotNull
    private final androidx.room.InvalidationLiveDataContainer container;

    @org.jetbrains.annotations.NotNull
    private final androidx.room.RoomDatabase database;
    private final boolean inTransaction;

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.atomic.AtomicBoolean invalid;

    @org.jetbrains.annotations.NotNull
    private final kotlin.coroutines.i launchContext;

    @org.jetbrains.annotations.NotNull
    private final androidx.room.InvalidationTracker.Observer observer;

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.atomic.AtomicBoolean registeredObserver;

    private RoomTrackingLiveData(androidx.room.RoomDatabase r1, androidx.room.InvalidationLiveDataContainer r2, boolean r3, java.lang.String[] r4) {
            r0 = this;
            r0.<init>()
            r0.database = r1
            r0.container = r2
            r0.inTransaction = r3
            androidx.room.RoomTrackingLiveData$observer$1 r2 = new androidx.room.RoomTrackingLiveData$observer$1
            r2.<init>(r4, r0)
            r0.observer = r2
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r4 = 1
            r2.<init>(r4)
            r0.invalid = r2
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r4 = 0
            r2.<init>(r4)
            r0.computing = r2
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r2.<init>(r4)
            r0.registeredObserver = r2
            boolean r2 = r1.inCompatibilityMode$room_runtime_release()
            if (r2 == 0) goto L39
            if (r3 == 0) goto L34
            kotlin.coroutines.i r1 = r1.getTransactionContext$room_runtime_release()
            goto L3b
        L34:
            kotlin.coroutines.i r1 = r1.getQueryContext()
            goto L3b
        L39:
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
        L3b:
            r0.launchContext = r1
            return
    }

    public /* synthetic */ RoomTrackingLiveData(androidx.room.RoomDatabase r1, androidx.room.InvalidationLiveDataContainer r2, boolean r3, java.lang.String[] r4, kotlin.jvm.internal.v r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public static final /* synthetic */ void access$invalidated(androidx.room.RoomTrackingLiveData r0) {
            r0.invalidated()
            return
    }

    public static final /* synthetic */ java.lang.Object access$refresh(androidx.room.RoomTrackingLiveData r0, kotlin.coroutines.e r1) {
            java.lang.Object r0 = r0.refresh(r1)
            return r0
    }

    @androidx.annotation.MainThread
    private final void invalidated() {
            r7 = this;
            boolean r0 = r7.hasActiveObservers()
            java.util.concurrent.atomic.AtomicBoolean r1 = r7.invalid
            r2 = 0
            r3 = 1
            boolean r1 = r1.compareAndSet(r2, r3)
            if (r1 == 0) goto L24
            if (r0 == 0) goto L24
            androidx.room.RoomDatabase r0 = r7.database
            kotlinx.coroutines.r0 r1 = r0.getCoroutineScope()
            kotlin.coroutines.i r2 = r7.launchContext
            androidx.room.RoomTrackingLiveData$invalidated$1 r4 = new androidx.room.RoomTrackingLiveData$invalidated$1
            r0 = 0
            r4.<init>(r7, r0)
            r5 = 2
            r6 = 0
            r3 = 0
            kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
        L24:
            return
    }

    private final java.lang.Object refresh(kotlin.coroutines.e<? super kotlin.n1> r9) {
            r8 = this;
            boolean r0 = r9 instanceof androidx.room.RoomTrackingLiveData$refresh$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.room.RoomTrackingLiveData$refresh$1 r0 = (androidx.room.RoomTrackingLiveData$refresh$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.RoomTrackingLiveData$refresh$1 r0 = new androidx.room.RoomTrackingLiveData$refresh$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 != r4) goto L37
            int r2 = r0.I$0
            java.lang.Object r5 = r0.L$0
            androidx.room.RoomTrackingLiveData r5 = (androidx.room.RoomTrackingLiveData) r5
            kotlin.g0.n(r9)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            r7 = r2
            r2 = r9
            r9 = r7
            goto L61
        L33:
            r9 = move-exception
            goto L8c
        L35:
            r9 = move-exception
            goto L79
        L37:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3f:
            kotlin.g0.n(r9)
            java.util.concurrent.atomic.AtomicBoolean r9 = r8.registeredObserver
            boolean r9 = r9.compareAndSet(r3, r4)
            if (r9 == 0) goto L55
            androidx.room.RoomDatabase r9 = r8.database
            androidx.room.InvalidationTracker r9 = r9.getInvalidationTracker()
            androidx.room.InvalidationTracker$Observer r2 = r8.observer
            r9.addWeakObserver(r2)
        L55:
            r9 = r8
        L56:
            java.util.concurrent.atomic.AtomicBoolean r2 = r9.computing
            boolean r2 = r2.compareAndSet(r3, r4)
            if (r2 == 0) goto L92
            r2 = 0
            r5 = r9
            r9 = 0
        L61:
            java.util.concurrent.atomic.AtomicBoolean r6 = r5.invalid     // Catch: java.lang.Throwable -> L33
            boolean r6 = r6.compareAndSet(r4, r3)     // Catch: java.lang.Throwable -> L33
            if (r6 == 0) goto L81
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            r0.I$0 = r4     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            r0.label = r4     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            java.lang.Object r9 = r5.compute(r0)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            if (r9 != r1) goto L76
            return r1
        L76:
            r2 = r9
            r9 = 1
            goto L61
        L79:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = "Exception while computing database live data."
            r0.<init>(r1, r9)     // Catch: java.lang.Throwable -> L33
            throw r0     // Catch: java.lang.Throwable -> L33
        L81:
            if (r9 == 0) goto L86
            r5.postValue(r2)     // Catch: java.lang.Throwable -> L33
        L86:
            java.util.concurrent.atomic.AtomicBoolean r2 = r5.computing
            r2.set(r3)
            goto L94
        L8c:
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.computing
            r0.set(r3)
            throw r9
        L92:
            r5 = r9
            r9 = 0
        L94:
            if (r9 == 0) goto La1
            java.util.concurrent.atomic.AtomicBoolean r9 = r5.invalid
            boolean r9 = r9.get()
            if (r9 != 0) goto L9f
            goto La1
        L9f:
            r9 = r5
            goto L56
        La1:
            kotlin.n1 r9 = kotlin.n1.a
            return r9
    }

    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object compute(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r1);

    @org.jetbrains.annotations.NotNull
    protected final androidx.room.RoomDatabase getDatabase() {
            r1 = this;
            androidx.room.RoomDatabase r0 = r1.database
            return r0
    }

    protected final boolean getInTransaction() {
            r1 = this;
            boolean r0 = r1.inTransaction
            return r0
    }

    @Override // androidx.lifecycle.LiveData
    protected void onActive() {
            r7 = this;
            super.onActive()
            androidx.room.InvalidationLiveDataContainer r0 = r7.container
            r0.onActive(r7)
            androidx.room.RoomDatabase r0 = r7.database
            kotlinx.coroutines.r0 r1 = r0.getCoroutineScope()
            kotlin.coroutines.i r2 = r7.launchContext
            androidx.room.RoomTrackingLiveData$onActive$1 r4 = new androidx.room.RoomTrackingLiveData$onActive$1
            r0 = 0
            r4.<init>(r7, r0)
            r5 = 2
            r6 = 0
            r3 = 0
            kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // androidx.lifecycle.LiveData
    protected void onInactive() {
            r1 = this;
            super.onInactive()
            androidx.room.InvalidationLiveDataContainer r0 = r1.container
            r0.onInactive(r1)
            return
    }
}
