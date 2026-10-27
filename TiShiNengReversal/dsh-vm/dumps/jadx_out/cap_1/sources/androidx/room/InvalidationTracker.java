package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nInvalidationTracker.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.android.kt\nandroidx/room/InvalidationTracker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ReentrantLock.kt\nandroidx/room/concurrent/ReentrantLockKt\n*L\n1#1,592:1\n827#2:593\n855#2,2:594\n1863#2,2:617\n1863#2,2:624\n1#3:596\n28#4,5:597\n28#4,5:602\n28#4,5:607\n28#4,5:612\n28#4,5:619\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.android.kt\nandroidx/room/InvalidationTracker\n*L\n186#1:593\n186#1:594,2\n351#1:617,2\n365#1:624,2\n274#1:597,5\n318#1:602,5\n322#1:607,5\n350#1:612,5\n364#1:619,5\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class InvalidationTracker {

    @org.jetbrains.annotations.NotNull
    public static final androidx.room.InvalidationTracker.Companion Companion = null;

    @org.jetbrains.annotations.Nullable
    private androidx.room.support.AutoCloser autoCloser;

    @org.jetbrains.annotations.NotNull
    private final androidx.room.RoomDatabase database;

    @org.jetbrains.annotations.NotNull
    private final androidx.room.TriggerBasedInvalidationTracker implementation;

    @org.jetbrains.annotations.NotNull
    private final androidx.room.InvalidationLiveDataContainer invalidationLiveDataContainer;

    @org.jetbrains.annotations.Nullable
    private androidx.room.MultiInstanceInvalidationClient multiInstanceInvalidationClient;

    @org.jetbrains.annotations.Nullable
    private android.content.Intent multiInstanceInvalidationIntent;

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<androidx.room.InvalidationTracker.Observer, androidx.room.ObserverWrapper> observerMap;

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.locks.ReentrantLock observerMapLock;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function0<kotlin.n1> onRefreshCompleted;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function0<kotlin.n1> onRefreshScheduled;

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.String, java.lang.String> shadowTablesMap;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String[] tableNames;

    @org.jetbrains.annotations.NotNull
    private final java.lang.Object trackerLock;

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.String, java.util.Set<java.lang.String>> viewTables;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class MultiInstanceClientInitState {

        @org.jetbrains.annotations.NotNull
        private final android.content.Context context;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String name;

        @org.jetbrains.annotations.NotNull
        private final android.content.Intent serviceIntent;

        public MultiInstanceClientInitState(@org.jetbrains.annotations.NotNull android.content.Context r2, @org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull android.content.Intent r4) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "serviceIntent"
                kotlin.jvm.internal.g0.p(r4, r0)
                r1.<init>()
                r1.context = r2
                r1.name = r3
                r1.serviceIntent = r4
                return
        }

        public static /* synthetic */ androidx.room.InvalidationTracker.MultiInstanceClientInitState copy$default(androidx.room.InvalidationTracker.MultiInstanceClientInitState r0, android.content.Context r1, java.lang.String r2, android.content.Intent r3, int r4, java.lang.Object r5) {
                r5 = r4 & 1
                if (r5 == 0) goto L6
                android.content.Context r1 = r0.context
            L6:
                r5 = r4 & 2
                if (r5 == 0) goto Lc
                java.lang.String r2 = r0.name
            Lc:
                r4 = r4 & 4
                if (r4 == 0) goto L12
                android.content.Intent r3 = r0.serviceIntent
            L12:
                androidx.room.InvalidationTracker$MultiInstanceClientInitState r0 = r0.copy(r1, r2, r3)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final android.content.Context component1() {
                r1 = this;
                android.content.Context r0 = r1.context
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
                r1 = this;
                java.lang.String r0 = r1.name
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final android.content.Intent component3() {
                r1 = this;
                android.content.Intent r0 = r1.serviceIntent
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final androidx.room.InvalidationTracker.MultiInstanceClientInitState copy(@org.jetbrains.annotations.NotNull android.content.Context r2, @org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull android.content.Intent r4) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "serviceIntent"
                kotlin.jvm.internal.g0.p(r4, r0)
                androidx.room.InvalidationTracker$MultiInstanceClientInitState r0 = new androidx.room.InvalidationTracker$MultiInstanceClientInitState
                r0.<init>(r2, r3, r4)
                return r0
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof androidx.room.InvalidationTracker.MultiInstanceClientInitState
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                androidx.room.InvalidationTracker$MultiInstanceClientInitState r5 = (androidx.room.InvalidationTracker.MultiInstanceClientInitState) r5
                android.content.Context r1 = r4.context
                android.content.Context r3 = r5.context
                boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.lang.String r1 = r4.name
                java.lang.String r3 = r5.name
                boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
                if (r1 != 0) goto L22
                return r2
            L22:
                android.content.Intent r1 = r4.serviceIntent
                android.content.Intent r5 = r5.serviceIntent
                boolean r5 = kotlin.jvm.internal.g0.g(r1, r5)
                if (r5 != 0) goto L2d
                return r2
            L2d:
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final android.content.Context getContext() {
                r1 = this;
                android.content.Context r0 = r1.context
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getName() {
                r1 = this;
                java.lang.String r0 = r1.name
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final android.content.Intent getServiceIntent() {
                r1 = this;
                android.content.Intent r0 = r1.serviceIntent
                return r0
        }

        public int hashCode() {
                r2 = this;
                android.content.Context r0 = r2.context
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.String r1 = r2.name
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                android.content.Intent r1 = r2.serviceIntent
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "MultiInstanceClientInitState(context="
                r0.append(r1)
                android.content.Context r1 = r2.context
                r0.append(r1)
                java.lang.String r1 = ", name="
                r0.append(r1)
                java.lang.String r1 = r2.name
                r0.append(r1)
                java.lang.String r1 = ", serviceIntent="
                r0.append(r1)
                android.content.Intent r1 = r2.serviceIntent
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class Observer {

        @org.jetbrains.annotations.NotNull
        private final java.lang.String[] tables;

        protected Observer(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull java.lang.String... r4) {
                r2 = this;
                java.lang.String r0 = "firstTable"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "rest"
                kotlin.jvm.internal.g0.p(r4, r0)
                kotlin.jvm.internal.s0 r0 = new kotlin.jvm.internal.s0
                r1 = 2
                r0.<init>(r1)
                r0.a(r3)
                r0.b(r4)
                int r3 = r0.c()
                java.lang.String[] r3 = new java.lang.String[r3]
                java.lang.Object[] r3 = r0.d(r3)
                java.lang.String[] r3 = (java.lang.String[]) r3
                r2.<init>(r3)
                return
        }

        public Observer(@org.jetbrains.annotations.NotNull java.lang.String[] r2) {
                r1 = this;
                java.lang.String r0 = "tables"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                r1.tables = r2
                return
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String[] getTables$room_runtime_release() {
                r1 = this;
                java.lang.String[] r0 = r1.tables
                return r0
        }

        public boolean isRemote$room_runtime_release() {
                r1 = this;
                r0 = 0
                return r0
        }

        public abstract void onInvalidated(@org.jetbrains.annotations.NotNull java.util.Set<java.lang.String> r1);
    }

    static {
            androidx.room.InvalidationTracker$Companion r0 = new androidx.room.InvalidationTracker$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.room.InvalidationTracker.Companion = r0
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public InvalidationTracker(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r9, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> r10, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.util.Set<java.lang.String>> r11, @org.jetbrains.annotations.NotNull java.lang.String... r12) {
            r8 = this;
            java.lang.String r0 = "database"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "shadowTablesMap"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "viewTables"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "tableNames"
            kotlin.jvm.internal.g0.p(r12, r0)
            r8.<init>()
            r8.database = r9
            r8.shadowTablesMap = r10
            r8.viewTables = r11
            r8.tableNames = r12
            androidx.room.TriggerBasedInvalidationTracker r1 = new androidx.room.TriggerBasedInvalidationTracker
            boolean r6 = r9.getUseTempTrackingTable$room_runtime_release()
            androidx.room.InvalidationTracker$implementation$1 r7 = new androidx.room.InvalidationTracker$implementation$1
            r7.<init>(r8)
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.implementation = r1
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            r8.observerMap = r9
            java.util.concurrent.locks.ReentrantLock r9 = new java.util.concurrent.locks.ReentrantLock
            r9.<init>()
            r8.observerMapLock = r9
            androidx.room.f r9 = new androidx.room.f
            r9.<init>(r8)
            r8.onRefreshScheduled = r9
            androidx.room.g r9 = new androidx.room.g
            r9.<init>(r8)
            r8.onRefreshCompleted = r9
            androidx.room.InvalidationLiveDataContainer r9 = new androidx.room.InvalidationLiveDataContainer
            r9.<init>(r2)
            r8.invalidationLiveDataContainer = r9
            java.lang.Object r9 = new java.lang.Object
            r9.<init>()
            r8.trackerLock = r9
            androidx.room.h r9 = new androidx.room.h
            r9.<init>(r8)
            r1.setOnAllowRefresh$room_runtime_release(r9)
            return
    }

    @kotlin.Deprecated(message = "No longer called by generated implementation")
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public InvalidationTracker(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r4, @org.jetbrains.annotations.NotNull java.lang.String... r5) {
            r3 = this;
            java.lang.String r0 = "database"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "tableNames"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Map r0 = kotlin.collections.i1.z()
            java.util.Map r1 = kotlin.collections.i1.z()
            int r2 = r5.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r2)
            java.lang.String[] r5 = (java.lang.String[]) r5
            r3.<init>(r4, r0, r1, r5)
            return
    }

    private static final boolean _init_$lambda$2(androidx.room.InvalidationTracker r1) {
            androidx.room.RoomDatabase r0 = r1.database
            boolean r0 = r0.inCompatibilityMode$room_runtime_release()
            if (r0 == 0) goto L13
            androidx.room.RoomDatabase r1 = r1.database
            boolean r1 = r1.isOpenInternal()
            if (r1 == 0) goto L11
            goto L13
        L11:
            r1 = 0
            return r1
        L13:
            r1 = 1
            return r1
    }

    public static /* synthetic */ kotlin.n1 a(androidx.room.InvalidationTracker r0) {
            kotlin.n1 r0 = onRefreshCompleted$lambda$1(r0)
            return r0
    }

    public static final /* synthetic */ androidx.room.TriggerBasedInvalidationTracker access$getImplementation$p(androidx.room.InvalidationTracker r0) {
            androidx.room.TriggerBasedInvalidationTracker r0 = r0.implementation
            return r0
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function0 access$getOnRefreshCompleted$p(androidx.room.InvalidationTracker r0) {
            kotlin.jvm.functions.Function0<kotlin.n1> r0 = r0.onRefreshCompleted
            return r0
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function0 access$getOnRefreshScheduled$p(androidx.room.InvalidationTracker r0) {
            kotlin.jvm.functions.Function0<kotlin.n1> r0 = r0.onRefreshScheduled
            return r0
    }

    public static final /* synthetic */ void access$notifyInvalidatedObservers(androidx.room.InvalidationTracker r0, java.util.Set r1) {
            r0.notifyInvalidatedObservers(r1)
            return
    }

    public static final /* synthetic */ void access$onAutoCloseCallback(androidx.room.InvalidationTracker r0) {
            r0.onAutoCloseCallback()
            return
    }

    private final boolean addObserverOnly(androidx.room.InvalidationTracker.Observer r5) {
            r4 = this;
            androidx.room.TriggerBasedInvalidationTracker r0 = r4.implementation
            java.lang.String[] r1 = r5.getTables$room_runtime_release()
            kotlin.Pair r0 = r0.validateTableNames$room_runtime_release(r1)
            java.lang.Object r1 = r0.component1()
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.lang.Object r0 = r0.component2()
            int[] r0 = (int[]) r0
            androidx.room.ObserverWrapper r2 = new androidx.room.ObserverWrapper
            r2.<init>(r5, r0, r1)
            java.util.concurrent.locks.ReentrantLock r1 = r4.observerMapLock
            r1.lock()
            java.util.Map<androidx.room.InvalidationTracker$Observer, androidx.room.ObserverWrapper> r3 = r4.observerMap     // Catch: java.lang.Throwable -> L31
            boolean r3 = r3.containsKey(r5)     // Catch: java.lang.Throwable -> L31
            if (r3 == 0) goto L33
            java.util.Map<androidx.room.InvalidationTracker$Observer, androidx.room.ObserverWrapper> r2 = r4.observerMap     // Catch: java.lang.Throwable -> L31
            java.lang.Object r5 = kotlin.collections.i1.K(r2, r5)     // Catch: java.lang.Throwable -> L31
            androidx.room.ObserverWrapper r5 = (androidx.room.ObserverWrapper) r5     // Catch: java.lang.Throwable -> L31
            goto L3b
        L31:
            r5 = move-exception
            goto L4c
        L33:
            java.util.Map<androidx.room.InvalidationTracker$Observer, androidx.room.ObserverWrapper> r3 = r4.observerMap     // Catch: java.lang.Throwable -> L31
            java.lang.Object r5 = r3.put(r5, r2)     // Catch: java.lang.Throwable -> L31
            androidx.room.ObserverWrapper r5 = (androidx.room.ObserverWrapper) r5     // Catch: java.lang.Throwable -> L31
        L3b:
            r1.unlock()
            if (r5 != 0) goto L4a
            androidx.room.TriggerBasedInvalidationTracker r5 = r4.implementation
            boolean r5 = r5.onObserverAdded$room_runtime_release(r0)
            if (r5 == 0) goto L4a
            r5 = 1
            return r5
        L4a:
            r5 = 0
            return r5
        L4c:
            r1.unlock()
            throw r5
    }

    public static /* synthetic */ boolean b(androidx.room.InvalidationTracker r0) {
            boolean r0 = _init_$lambda$2(r0)
            return r0
    }

    public static /* synthetic */ kotlin.n1 c(androidx.room.InvalidationTracker r0) {
            kotlin.n1 r0 = onRefreshScheduled$lambda$0(r0)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.flow.i createFlow$default(androidx.room.InvalidationTracker r0, java.lang.String[] r1, boolean r2, int r3, java.lang.Object r4) {
            if (r4 != 0) goto Lc
            r3 = r3 & 2
            if (r3 == 0) goto L7
            r2 = 1
        L7:
            kotlinx.coroutines.flow.i r0 = r0.createFlow(r1, r2)
            return r0
        Lc:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: createFlow"
            r0.<init>(r1)
            throw r0
    }

    private final java.util.List<androidx.room.InvalidationTracker.Observer> getAllObservers() {
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.observerMapLock
            r0.lock()
            java.util.Map<androidx.room.InvalidationTracker$Observer, androidx.room.ObserverWrapper> r1 = r2.observerMap     // Catch: java.lang.Throwable -> L13
            java.util.Set r1 = r1.keySet()     // Catch: java.lang.Throwable -> L13
            java.util.List r1 = kotlin.collections.f0.a6(r1)     // Catch: java.lang.Throwable -> L13
            r0.unlock()
            return r1
        L13:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    private final void notifyInvalidatedObservers(java.util.Set<java.lang.Integer> r3) {
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.observerMapLock
            r0.lock()
            java.util.Map<androidx.room.InvalidationTracker$Observer, androidx.room.ObserverWrapper> r1 = r2.observerMap     // Catch: java.lang.Throwable -> L2b
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L2b
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L2b
            java.util.List r1 = kotlin.collections.f0.a6(r1)     // Catch: java.lang.Throwable -> L2b
            r0.unlock()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r0 = r1.iterator()
        L1a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r0.next()
            androidx.room.ObserverWrapper r1 = (androidx.room.ObserverWrapper) r1
            r1.notifyByTableIds$room_runtime_release(r3)
            goto L1a
        L2a:
            return
        L2b:
            r3 = move-exception
            r0.unlock()
            throw r3
    }

    private final void onAutoCloseCallback() {
            r6 = this;
            java.lang.Object r0 = r6.trackerLock
            monitor-enter(r0)
            androidx.room.MultiInstanceInvalidationClient r1 = r6.multiInstanceInvalidationClient     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L38
            java.util.List r2 = r6.getAllObservers()     // Catch: java.lang.Throwable -> L2d
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch: java.lang.Throwable -> L2d
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2d
            r3.<init>()     // Catch: java.lang.Throwable -> L2d
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L2d
        L16:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L2d
            if (r4 == 0) goto L2f
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L2d
            r5 = r4
            androidx.room.InvalidationTracker$Observer r5 = (androidx.room.InvalidationTracker.Observer) r5     // Catch: java.lang.Throwable -> L2d
            boolean r5 = r5.isRemote$room_runtime_release()     // Catch: java.lang.Throwable -> L2d
            if (r5 != 0) goto L16
            r3.add(r4)     // Catch: java.lang.Throwable -> L2d
            goto L16
        L2d:
            r1 = move-exception
            goto L41
        L2f:
            boolean r2 = r3.isEmpty()     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L38
            r1.stop()     // Catch: java.lang.Throwable -> L2d
        L38:
            androidx.room.TriggerBasedInvalidationTracker r1 = r6.implementation     // Catch: java.lang.Throwable -> L2d
            r1.resetSync$room_runtime_release()     // Catch: java.lang.Throwable -> L2d
            kotlin.n1 r1 = kotlin.n1.a     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r0)
            return
        L41:
            monitor-exit(r0)
            throw r1
    }

    private static final kotlin.n1 onRefreshCompleted$lambda$1(androidx.room.InvalidationTracker r0) {
            androidx.room.support.AutoCloser r0 = r0.autoCloser
            if (r0 == 0) goto L7
            r0.decrementCountAndScheduleClose()
        L7:
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    private static final kotlin.n1 onRefreshScheduled$lambda$0(androidx.room.InvalidationTracker r0) {
            androidx.room.support.AutoCloser r0 = r0.autoCloser
            if (r0 == 0) goto L7
            r0.incrementCountAndEnsureDbIsOpen()
        L7:
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    private final boolean removeObserverOnly(androidx.room.InvalidationTracker.Observer r3) {
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.observerMapLock
            r0.lock()
            java.util.Map<androidx.room.InvalidationTracker$Observer, androidx.room.ObserverWrapper> r1 = r2.observerMap     // Catch: java.lang.Throwable -> L22
            java.lang.Object r3 = r1.remove(r3)     // Catch: java.lang.Throwable -> L22
            androidx.room.ObserverWrapper r3 = (androidx.room.ObserverWrapper) r3     // Catch: java.lang.Throwable -> L22
            r0.unlock()
            if (r3 == 0) goto L20
            androidx.room.TriggerBasedInvalidationTracker r0 = r2.implementation
            int[] r3 = r3.getTableIds$room_runtime_release()
            boolean r3 = r0.onObserverRemoved$room_runtime_release(r3)
            if (r3 == 0) goto L20
            r3 = 1
            return r3
        L20:
            r3 = 0
            return r3
        L22:
            r3 = move-exception
            r0.unlock()
            throw r3
    }

    @androidx.annotation.WorkerThread
    public void addObserver(@org.jetbrains.annotations.NotNull androidx.room.InvalidationTracker.Observer r2) {
            r1 = this;
            java.lang.String r0 = "observer"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r2 = r1.addObserverOnly(r2)
            if (r2 == 0) goto L14
            androidx.room.InvalidationTracker$addObserver$1 r2 = new androidx.room.InvalidationTracker$addObserver$1
            r0 = 0
            r2.<init>(r1, r0)
            androidx.room.coroutines.RunBlockingUninterruptible_androidKt.runBlockingUninterruptible(r2)
        L14:
            return
    }

    public final void addRemoteObserver$room_runtime_release(@org.jetbrains.annotations.NotNull androidx.room.InvalidationTracker.Observer r2) {
            r1 = this;
            java.lang.String r0 = "observer"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r2.isRemote$room_runtime_release()
            if (r0 == 0) goto Lf
            r1.addObserverOnly(r2)
            return
        Lf:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "isRemote was false of observer argument"
            r2.<init>(r0)
            throw r2
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.WorkerThread
    public void addWeakObserver(@org.jetbrains.annotations.NotNull androidx.room.InvalidationTracker.Observer r2) {
            r1 = this;
            java.lang.String r0 = "observer"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.room.WeakObserver r0 = new androidx.room.WeakObserver
            r0.<init>(r1, r2)
            r1.addObserver(r0)
            return
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.i<java.util.Set<java.lang.String>> createFlow(@org.jetbrains.annotations.NotNull java.lang.String... r4) {
            r3 = this;
            java.lang.String r0 = "tables"
            kotlin.jvm.internal.g0.p(r4, r0)
            r0 = 2
            r1 = 0
            r2 = 0
            kotlinx.coroutines.flow.i r4 = createFlow$default(r3, r4, r2, r0, r1)
            return r4
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.i<java.util.Set<java.lang.String>> createFlow(@org.jetbrains.annotations.NotNull java.lang.String[] r3, boolean r4) {
            r2 = this;
            java.lang.String r0 = "tables"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.room.TriggerBasedInvalidationTracker r0 = r2.implementation
            kotlin.Pair r3 = r0.validateTableNames$room_runtime_release(r3)
            java.lang.Object r0 = r3.component1()
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.lang.Object r3 = r3.component2()
            int[] r3 = (int[]) r3
            androidx.room.TriggerBasedInvalidationTracker r1 = r2.implementation
            kotlinx.coroutines.flow.i r3 = r1.createFlow$room_runtime_release(r0, r3, r4)
            androidx.room.MultiInstanceInvalidationClient r4 = r2.multiInstanceInvalidationClient
            if (r4 == 0) goto L26
            kotlinx.coroutines.flow.i r4 = r4.createFlow(r0)
            goto L27
        L26:
            r4 = 0
        L27:
            if (r4 == 0) goto L36
            r0 = 2
            kotlinx.coroutines.flow.i[] r0 = new kotlinx.coroutines.flow.i[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            kotlinx.coroutines.flow.i r3 = kotlinx.coroutines.flow.k.b1(r0)
        L36:
            return r3
    }

    @kotlin.Deprecated(message = "Replaced with overload that takes 'inTransaction 'parameter.", replaceWith = @kotlin.ReplaceWith(expression = "createLiveData(tableNames, false, computeFunction", imports = {}))
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @org.jetbrains.annotations.NotNull
    public <T> androidx.lifecycle.LiveData<T> createLiveData(@org.jetbrains.annotations.NotNull java.lang.String[] r2, @org.jetbrains.annotations.NotNull java.util.concurrent.Callable<T> r3) {
            r1 = this;
            java.lang.String r0 = "tableNames"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "computeFunction"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 0
            androidx.lifecycle.LiveData r2 = r1.createLiveData(r2, r0, r3)
            return r2
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @org.jetbrains.annotations.NotNull
    public <T> androidx.lifecycle.LiveData<T> createLiveData(@org.jetbrains.annotations.NotNull java.lang.String[] r2, boolean r3, @org.jetbrains.annotations.NotNull java.util.concurrent.Callable<T> r4) {
            r1 = this;
            java.lang.String r0 = "tableNames"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "computeFunction"
            kotlin.jvm.internal.g0.p(r4, r0)
            androidx.room.TriggerBasedInvalidationTracker r0 = r1.implementation
            r0.validateTableNames$room_runtime_release(r2)
            androidx.room.InvalidationLiveDataContainer r0 = r1.invalidationLiveDataContainer
            androidx.lifecycle.LiveData r2 = r0.create(r2, r3, r4)
            return r2
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @org.jetbrains.annotations.NotNull
    public final <T> androidx.lifecycle.LiveData<T> createLiveData(@org.jetbrains.annotations.NotNull java.lang.String[] r2, boolean r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.sqlite.SQLiteConnection, ? extends T> r4) {
            r1 = this;
            java.lang.String r0 = "tableNames"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "computeFunction"
            kotlin.jvm.internal.g0.p(r4, r0)
            androidx.room.TriggerBasedInvalidationTracker r0 = r1.implementation
            r0.validateTableNames$room_runtime_release(r2)
            androidx.room.InvalidationLiveDataContainer r0 = r1.invalidationLiveDataContainer
            androidx.lifecycle.LiveData r2 = r0.create(r2, r3, r4)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.room.RoomDatabase getDatabase$room_runtime_release() {
            r1 = this;
            androidx.room.RoomDatabase r0 = r1.database
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String[] getTableNames$room_runtime_release() {
            r1 = this;
            java.lang.String[] r0 = r1.tableNames
            return r0
    }

    public final void initMultiInstanceInvalidation$room_runtime_release(@org.jetbrains.annotations.NotNull android.content.Context r2, @org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull android.content.Intent r4) {
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "serviceIntent"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.multiInstanceInvalidationIntent = r4
            androidx.room.MultiInstanceInvalidationClient r4 = new androidx.room.MultiInstanceInvalidationClient
            r4.<init>(r2, r3, r1)
            r1.multiInstanceInvalidationClient = r4
            return
    }

    public final void internalInit$room_runtime_release(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r3) {
            r2 = this;
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.room.TriggerBasedInvalidationTracker r0 = r2.implementation
            r0.configureConnection(r3)
            java.lang.Object r3 = r2.trackerLock
            monitor-enter(r3)
            androidx.room.MultiInstanceInvalidationClient r0 = r2.multiInstanceInvalidationClient     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L25
            android.content.Intent r1 = r2.multiInstanceInvalidationIntent     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L1d
            r0.start(r1)     // Catch: java.lang.Throwable -> L1b
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> L1b
            goto L25
        L1b:
            r0 = move-exception
            goto L27
        L1d:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1b
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L1b
            throw r1     // Catch: java.lang.Throwable -> L1b
        L25:
            monitor-exit(r3)
            return
        L27:
            monitor-exit(r3)
            throw r0
    }

    public final void notifyObserversByTableNames$room_runtime_release(@org.jetbrains.annotations.NotNull java.util.Set<java.lang.String> r4) {
            r3 = this;
            java.lang.String r0 = "tables"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.concurrent.locks.ReentrantLock r0 = r3.observerMapLock
            r0.lock()
            java.util.Map<androidx.room.InvalidationTracker$Observer, androidx.room.ObserverWrapper> r1 = r3.observerMap     // Catch: java.lang.Throwable -> L3a
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L3a
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L3a
            java.util.List r1 = kotlin.collections.f0.a6(r1)     // Catch: java.lang.Throwable -> L3a
            r0.unlock()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r0 = r1.iterator()
        L1f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L39
            java.lang.Object r1 = r0.next()
            androidx.room.ObserverWrapper r1 = (androidx.room.ObserverWrapper) r1
            androidx.room.InvalidationTracker$Observer r2 = r1.getObserver$room_runtime_release()
            boolean r2 = r2.isRemote$room_runtime_release()
            if (r2 != 0) goto L1f
            r1.notifyByTableNames$room_runtime_release(r4)
            goto L1f
        L39:
            return
        L3a:
            r4 = move-exception
            r0.unlock()
            throw r4
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object refresh(@org.jetbrains.annotations.NotNull java.lang.String[] r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.lang.Boolean> r5) {
            r3 = this;
            androidx.room.TriggerBasedInvalidationTracker r0 = r3.implementation
            kotlin.jvm.functions.Function0<kotlin.n1> r1 = r3.onRefreshScheduled
            kotlin.jvm.functions.Function0<kotlin.n1> r2 = r3.onRefreshCompleted
            java.lang.Object r4 = r0.refreshInvalidation$room_runtime_release(r4, r1, r2, r5)
            return r4
    }

    public final void refreshAsync() {
            r3 = this;
            androidx.room.TriggerBasedInvalidationTracker r0 = r3.implementation
            kotlin.jvm.functions.Function0<kotlin.n1> r1 = r3.onRefreshScheduled
            kotlin.jvm.functions.Function0<kotlin.n1> r2 = r3.onRefreshCompleted
            r0.refreshInvalidationAsync$room_runtime_release(r1, r2)
            return
    }

    public void refreshVersionsAsync() {
            r3 = this;
            androidx.room.TriggerBasedInvalidationTracker r0 = r3.implementation
            kotlin.jvm.functions.Function0<kotlin.n1> r1 = r3.onRefreshScheduled
            kotlin.jvm.functions.Function0<kotlin.n1> r2 = r3.onRefreshCompleted
            r0.refreshInvalidationAsync$room_runtime_release(r1, r2)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.WorkerThread
    public void refreshVersionsSync() {
            r2 = this;
            androidx.room.InvalidationTracker$refreshVersionsSync$1 r0 = new androidx.room.InvalidationTracker$refreshVersionsSync$1
            r1 = 0
            r0.<init>(r2, r1)
            androidx.room.coroutines.RunBlockingUninterruptible_androidKt.runBlockingUninterruptible(r0)
            return
    }

    @androidx.annotation.WorkerThread
    public void removeObserver(@org.jetbrains.annotations.NotNull androidx.room.InvalidationTracker.Observer r2) {
            r1 = this;
            java.lang.String r0 = "observer"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r2 = r1.removeObserverOnly(r2)
            if (r2 == 0) goto L14
            androidx.room.InvalidationTracker$removeObserver$1 r2 = new androidx.room.InvalidationTracker$removeObserver$1
            r0 = 0
            r2.<init>(r1, r0)
            androidx.room.coroutines.RunBlockingUninterruptible_androidKt.runBlockingUninterruptible(r2)
        L14:
            return
    }

    public final void setAutoCloser$room_runtime_release(@org.jetbrains.annotations.NotNull androidx.room.support.AutoCloser r2) {
            r1 = this;
            java.lang.String r0 = "autoCloser"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.autoCloser = r2
            androidx.room.InvalidationTracker$setAutoCloser$1 r0 = new androidx.room.InvalidationTracker$setAutoCloser$1
            r0.<init>(r1)
            r2.setAutoCloseCallback(r0)
            return
    }

    public final void stop$room_runtime_release() {
            r1 = this;
            androidx.room.MultiInstanceInvalidationClient r0 = r1.multiInstanceInvalidationClient
            if (r0 == 0) goto L7
            r0.stop()
        L7:
            return
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object sync$room_runtime_release(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2) {
            r1 = this;
            androidx.room.RoomDatabase r0 = r1.database
            boolean r0 = r0.inCompatibilityMode$room_runtime_release()
            if (r0 == 0) goto L13
            androidx.room.RoomDatabase r0 = r1.database
            boolean r0 = r0.isOpenInternal()
            if (r0 != 0) goto L13
            kotlin.n1 r2 = kotlin.n1.a
            return r2
        L13:
            androidx.room.TriggerBasedInvalidationTracker r0 = r1.implementation
            java.lang.Object r2 = r0.syncTriggers$room_runtime_release(r2)
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            if (r2 != r0) goto L20
            return r2
        L20:
            kotlin.n1 r2 = kotlin.n1.a
            return r2
    }

    @androidx.annotation.WorkerThread
    public final void syncBlocking$room_runtime_release() {
            r2 = this;
            androidx.room.InvalidationTracker$syncBlocking$1 r0 = new androidx.room.InvalidationTracker$syncBlocking$1
            r1 = 0
            r0.<init>(r2, r1)
            androidx.room.coroutines.RunBlockingUninterruptible_androidKt.runBlockingUninterruptible(r0)
            return
    }
}
