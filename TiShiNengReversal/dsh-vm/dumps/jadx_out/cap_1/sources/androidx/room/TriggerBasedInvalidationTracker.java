package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nInvalidationTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/TriggerBasedInvalidationTracker\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 CloseBarrier.kt\nandroidx/room/concurrent/CloseBarrierKt\n*L\n1#1,604:1\n216#2,2:605\n13402#3:607\n13403#3:609\n12597#3,2:621\n1#4:608\n37#5:610\n36#5,3:611\n99#6,7:614\n99#6,5:623\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/TriggerBasedInvalidationTracker\n*L\n185#1:605,2\n283#1:607\n283#1:609\n369#1:621,2\n287#1:610\n287#1:611,3\n299#1:614,7\n402#1:623,5\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class TriggerBasedInvalidationTracker {

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String CREATE_TRACKING_TABLE_SQL = "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)";

    @org.jetbrains.annotations.NotNull
    public static final androidx.room.TriggerBasedInvalidationTracker.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String DROP_TRACKING_TABLE_SQL = "DROP TABLE IF EXISTS room_table_modification_log";

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String INVALIDATED_COLUMN_NAME = "invalidated";

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String RESET_UPDATED_TABLES_SQL = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1";

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String SELECT_UPDATED_TABLES_SQL = "SELECT * FROM room_table_modification_log WHERE invalidated = 1";

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String TABLE_ID_COLUMN_NAME = "table_id";

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String[] TRIGGERS = null;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String UPDATE_TABLE_NAME = "room_table_modification_log";

    @org.jetbrains.annotations.NotNull
    private final androidx.room.RoomDatabase database;

    @org.jetbrains.annotations.NotNull
    private final androidx.room.ObservedTableStates observedTableStates;

    @org.jetbrains.annotations.NotNull
    private final androidx.room.ObservedTableVersions observedTableVersions;

    @org.jetbrains.annotations.NotNull
    private kotlin.jvm.functions.Function0<java.lang.Boolean> onAllowRefresh;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<java.util.Set<java.lang.Integer>, kotlin.n1> onInvalidatedTablesIds;

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.atomic.AtomicBoolean pendingRefresh;

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.String, java.lang.String> shadowTablesMap;

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.String, java.lang.Integer> tableIdLookup;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String[] tablesNames;
    private final boolean useTempTable;

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

        public static final /* synthetic */ java.lang.String access$getTriggerName(androidx.room.TriggerBasedInvalidationTracker.Companion r0, java.lang.String r1, java.lang.String r2) {
                java.lang.String r0 = r0.getTriggerName(r1, r2)
                return r0
        }

        private final java.lang.String getTriggerName(java.lang.String r3, java.lang.String r4) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "room_table_modification_trigger_"
                r0.append(r1)
                r0.append(r3)
                r3 = 95
                r0.append(r3)
                r0.append(r4)
                java.lang.String r3 = r0.toString()
                return r3
        }
    }

    static {
            androidx.room.TriggerBasedInvalidationTracker$Companion r0 = new androidx.room.TriggerBasedInvalidationTracker$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.room.TriggerBasedInvalidationTracker.Companion = r0
            java.lang.String r0 = "UPDATE"
            java.lang.String r1 = "DELETE"
            java.lang.String r2 = "INSERT"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            androidx.room.TriggerBasedInvalidationTracker.TRIGGERS = r0
            return
    }

    public TriggerBasedInvalidationTracker(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r4, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> r5, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, ? extends java.util.Set<java.lang.String>> r6, @org.jetbrains.annotations.NotNull java.lang.String[] r7, boolean r8, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.util.Set<java.lang.Integer>, kotlin.n1> r9) {
            r3 = this;
            java.lang.String r0 = "database"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "shadowTablesMap"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "viewTables"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "tableNames"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "onInvalidatedTablesIds"
            kotlin.jvm.internal.g0.p(r9, r0)
            r3.<init>()
            r3.database = r4
            r3.shadowTablesMap = r5
            r3.viewTables = r6
            r3.useTempTable = r8
            r3.onInvalidatedTablesIds = r9
            java.util.concurrent.atomic.AtomicBoolean r4 = new java.util.concurrent.atomic.AtomicBoolean
            r5 = 0
            r4.<init>(r5)
            r3.pendingRefresh = r4
            androidx.room.c0 r4 = new androidx.room.c0
            r4.<init>()
            r3.onAllowRefresh = r4
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            r3.tableIdLookup = r4
            int r4 = r7.length
            java.lang.String[] r6 = new java.lang.String[r4]
        L40:
            java.lang.String r8 = "toLowerCase(...)"
            if (r5 >= r4) goto L76
            r9 = r7[r5]
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r9 = r9.toLowerCase(r0)
            kotlin.jvm.internal.g0.o(r9, r8)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.util.Map<java.lang.String, java.lang.Integer> r2 = r3.tableIdLookup
            r2.put(r9, r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.shadowTablesMap
            r2 = r7[r5]
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L6c
            java.lang.String r0 = r1.toLowerCase(r0)
            kotlin.jvm.internal.g0.o(r0, r8)
            goto L6d
        L6c:
            r0 = 0
        L6d:
            if (r0 != 0) goto L70
            goto L71
        L70:
            r9 = r0
        L71:
            r6[r5] = r9
            int r5 = r5 + 1
            goto L40
        L76:
            r3.tablesNames = r6
            java.util.Map<java.lang.String, java.lang.String> r4 = r3.shadowTablesMap
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L82:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lbc
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getValue()
            java.lang.String r6 = (java.lang.String) r6
            java.util.Locale r7 = java.util.Locale.ROOT
            java.lang.String r6 = r6.toLowerCase(r7)
            kotlin.jvm.internal.g0.o(r6, r8)
            java.util.Map<java.lang.String, java.lang.Integer> r9 = r3.tableIdLookup
            boolean r9 = r9.containsKey(r6)
            if (r9 == 0) goto L82
            java.lang.Object r5 = r5.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = r5.toLowerCase(r7)
            kotlin.jvm.internal.g0.o(r5, r8)
            java.util.Map<java.lang.String, java.lang.Integer> r7 = r3.tableIdLookup
            java.lang.Object r6 = kotlin.collections.i1.K(r7, r6)
            r7.put(r5, r6)
            goto L82
        Lbc:
            androidx.room.ObservedTableStates r4 = new androidx.room.ObservedTableStates
            java.lang.String[] r5 = r3.tablesNames
            int r5 = r5.length
            r4.<init>(r5)
            r3.observedTableStates = r4
            androidx.room.ObservedTableVersions r4 = new androidx.room.ObservedTableVersions
            java.lang.String[] r5 = r3.tablesNames
            int r5 = r5.length
            r4.<init>(r5)
            r3.observedTableVersions = r4
            return
    }

    public static /* synthetic */ kotlin.n1 a() {
            kotlin.n1 r0 = refreshInvalidationAsync$lambda$10()
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$checkInvalidatedTables(androidx.room.TriggerBasedInvalidationTracker r0, androidx.room.PooledConnection r1, kotlin.coroutines.e r2) {
            java.lang.Object r0 = r0.checkInvalidatedTables(r1, r2)
            return r0
    }

    public static final /* synthetic */ androidx.room.RoomDatabase access$getDatabase$p(androidx.room.TriggerBasedInvalidationTracker r0) {
            androidx.room.RoomDatabase r0 = r0.database
            return r0
    }

    public static final /* synthetic */ androidx.room.ObservedTableStates access$getObservedTableStates$p(androidx.room.TriggerBasedInvalidationTracker r0) {
            androidx.room.ObservedTableStates r0 = r0.observedTableStates
            return r0
    }

    public static final /* synthetic */ androidx.room.ObservedTableVersions access$getObservedTableVersions$p(androidx.room.TriggerBasedInvalidationTracker r0) {
            androidx.room.ObservedTableVersions r0 = r0.observedTableVersions
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$notifyInvalidation(androidx.room.TriggerBasedInvalidationTracker r0, kotlin.coroutines.e r1) {
            java.lang.Object r0 = r0.notifyInvalidation(r1)
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$startTrackingTable(androidx.room.TriggerBasedInvalidationTracker r0, androidx.room.PooledConnection r1, int r2, kotlin.coroutines.e r3) {
            java.lang.Object r0 = r0.startTrackingTable(r1, r2, r3)
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$stopTrackingTable(androidx.room.TriggerBasedInvalidationTracker r0, androidx.room.PooledConnection r1, int r2, kotlin.coroutines.e r3) {
            java.lang.Object r0 = r0.stopTrackingTable(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ kotlin.n1 b() {
            kotlin.n1 r0 = refreshInvalidation$lambda$8()
            return r0
    }

    public static /* synthetic */ java.util.Set c(androidx.sqlite.SQLiteStatement r0) {
            java.util.Set r0 = checkInvalidatedTables$lambda$14(r0)
            return r0
    }

    private final java.lang.Object checkInvalidatedTables(androidx.room.PooledConnection r6, kotlin.coroutines.e<? super java.util.Set<java.lang.Integer>> r7) {
            r5 = this;
            boolean r0 = r7 instanceof androidx.room.TriggerBasedInvalidationTracker$checkInvalidatedTables$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.room.TriggerBasedInvalidationTracker$checkInvalidatedTables$1 r0 = (androidx.room.TriggerBasedInvalidationTracker$checkInvalidatedTables$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.TriggerBasedInvalidationTracker$checkInvalidatedTables$1 r0 = new androidx.room.TriggerBasedInvalidationTracker$checkInvalidatedTables$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.L$0
            java.util.Set r6 = (java.util.Set) r6
            kotlin.g0.n(r7)
            return r6
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            java.lang.Object r6 = r0.L$0
            androidx.room.PooledConnection r6 = (androidx.room.PooledConnection) r6
            kotlin.g0.n(r7)
            goto L55
        L40:
            kotlin.g0.n(r7)
            androidx.room.z r7 = new androidx.room.z
            r7.<init>()
            r0.L$0 = r6
            r0.label = r4
            java.lang.String r2 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1"
            java.lang.Object r7 = r6.usePrepared(r2, r7, r0)
            if (r7 != r1) goto L55
            goto L69
        L55:
            java.util.Set r7 = (java.util.Set) r7
            boolean r2 = r7.isEmpty()
            if (r2 != 0) goto L6a
            r0.L$0 = r7
            r0.label = r3
            java.lang.String r2 = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"
            java.lang.Object r6 = androidx.room.TransactorKt.execSQL(r6, r2, r0)
            if (r6 != r1) goto L6a
        L69:
            return r1
        L6a:
            return r7
    }

    private static final java.util.Set checkInvalidatedTables$lambda$14(androidx.sqlite.SQLiteStatement r3) {
            java.lang.String r0 = "statement"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Set r0 = kotlin.collections.u1.d()
        L9:
            boolean r1 = r3.step()
            if (r1 == 0) goto L1d
            r1 = 0
            long r1 = r3.getLong(r1)
            int r2 = (int) r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.add(r1)
            goto L9
        L1d:
            java.util.Set r3 = kotlin.collections.u1.a(r0)
            return r3
    }

    public static /* synthetic */ boolean d() {
            boolean r0 = onAllowRefresh$lambda$0()
            return r0
    }

    public static /* synthetic */ kotlin.n1 e() {
            kotlin.n1 r0 = refreshInvalidation$lambda$7()
            return r0
    }

    public static /* synthetic */ kotlin.n1 f() {
            kotlin.n1 r0 = refreshInvalidationAsync$lambda$11()
            return r0
    }

    private final java.lang.Object notifyInvalidation(kotlin.coroutines.e<? super java.util.Set<java.lang.Integer>> r8) {
            r7 = this;
            boolean r0 = r8 instanceof androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$1 r0 = (androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$1 r0 = new androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r1 = r0.L$1
            androidx.room.concurrent.CloseBarrier r1 = (androidx.room.concurrent.CloseBarrier) r1
            java.lang.Object r0 = r0.L$0
            androidx.room.TriggerBasedInvalidationTracker r0 = (androidx.room.TriggerBasedInvalidationTracker) r0
            kotlin.g0.n(r8)     // Catch: java.lang.Throwable -> L31
            goto L8e
        L31:
            r8 = move-exception
            goto La4
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3c:
            kotlin.g0.n(r8)
            androidx.room.RoomDatabase r8 = r7.database
            androidx.room.concurrent.CloseBarrier r8 = r8.getCloseBarrier$room_runtime_release()
            boolean r2 = r8.block$room_runtime_release()
            if (r2 == 0) goto La8
            java.util.concurrent.atomic.AtomicBoolean r2 = r7.pendingRefresh     // Catch: java.lang.Throwable -> L5c
            r4 = 0
            boolean r2 = r2.compareAndSet(r3, r4)     // Catch: java.lang.Throwable -> L5c
            if (r2 != 0) goto L60
            java.util.Set r0 = kotlin.collections.u1.k()     // Catch: java.lang.Throwable -> L5c
            r8.unblock$room_runtime_release()
            return r0
        L5c:
            r0 = move-exception
            r1 = r8
            r8 = r0
            goto La4
        L60:
            kotlin.jvm.functions.Function0<java.lang.Boolean> r2 = r7.onAllowRefresh     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r2 = r2.invoke()     // Catch: java.lang.Throwable -> L5c
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L5c
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L5c
            if (r2 != 0) goto L76
            java.util.Set r0 = kotlin.collections.u1.k()     // Catch: java.lang.Throwable -> L5c
            r8.unblock$room_runtime_release()
            return r0
        L76:
            androidx.room.RoomDatabase r2 = r7.database     // Catch: java.lang.Throwable -> L5c
            androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1 r5 = new androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1     // Catch: java.lang.Throwable -> L5c
            r6 = 0
            r5.<init>(r7, r6)     // Catch: java.lang.Throwable -> L5c
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L5c
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L5c
            r0.label = r3     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r0 = r2.useConnection$room_runtime_release(r4, r5, r0)     // Catch: java.lang.Throwable -> L5c
            if (r0 != r1) goto L8b
            return r1
        L8b:
            r1 = r8
            r8 = r0
            r0 = r7
        L8e:
            java.util.Set r8 = (java.util.Set) r8     // Catch: java.lang.Throwable -> L31
            boolean r2 = r8.isEmpty()     // Catch: java.lang.Throwable -> L31
            if (r2 != 0) goto La0
            androidx.room.ObservedTableVersions r2 = r0.observedTableVersions     // Catch: java.lang.Throwable -> L31
            r2.increment(r8)     // Catch: java.lang.Throwable -> L31
            kotlin.jvm.functions.Function1<java.util.Set<java.lang.Integer>, kotlin.n1> r0 = r0.onInvalidatedTablesIds     // Catch: java.lang.Throwable -> L31
            r0.invoke(r8)     // Catch: java.lang.Throwable -> L31
        La0:
            r1.unblock$room_runtime_release()
            return r8
        La4:
            r1.unblock$room_runtime_release()
            throw r8
        La8:
            java.util.Set r8 = kotlin.collections.u1.k()
            return r8
    }

    private static final boolean onAllowRefresh$lambda$0() {
            r0 = 1
            return r0
    }

    private static final kotlin.n1 refreshInvalidation$lambda$7() {
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    private static final kotlin.n1 refreshInvalidation$lambda$8() {
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    public static /* synthetic */ java.lang.Object refreshInvalidation$room_runtime_release$default(androidx.room.TriggerBasedInvalidationTracker r0, java.lang.String[] r1, kotlin.jvm.functions.Function0 r2, kotlin.jvm.functions.Function0 r3, kotlin.coroutines.e r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            if (r6 == 0) goto L9
            androidx.room.x r2 = new androidx.room.x
            r2.<init>()
        L9:
            r5 = r5 & 4
            if (r5 == 0) goto L12
            androidx.room.y r3 = new androidx.room.y
            r3.<init>()
        L12:
            java.lang.Object r0 = r0.refreshInvalidation$room_runtime_release(r1, r2, r3, r4)
            return r0
    }

    private static final kotlin.n1 refreshInvalidationAsync$lambda$10() {
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    private static final kotlin.n1 refreshInvalidationAsync$lambda$11() {
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    public static /* synthetic */ void refreshInvalidationAsync$room_runtime_release$default(androidx.room.TriggerBasedInvalidationTracker r0, kotlin.jvm.functions.Function0 r1, kotlin.jvm.functions.Function0 r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L9
            androidx.room.a0 r1 = new androidx.room.a0
            r1.<init>()
        L9:
            r3 = r3 & 2
            if (r3 == 0) goto L12
            androidx.room.b0 r2 = new androidx.room.b0
            r2.<init>()
        L12:
            r0.refreshInvalidationAsync$room_runtime_release(r1, r2)
            return
    }

    private final java.lang.String[] resolveViews(java.lang.String[] r9) {
            r8 = this;
            java.util.Set r0 = kotlin.collections.u1.d()
            int r1 = r9.length
            r2 = 0
            r3 = 0
        L7:
            if (r3 >= r1) goto L2a
            r4 = r9[r3]
            java.util.Map<java.lang.String, java.util.Set<java.lang.String>> r5 = r8.viewTables
            java.util.Locale r6 = java.util.Locale.ROOT
            java.lang.String r6 = r4.toLowerCase(r6)
            java.lang.String r7 = "toLowerCase(...)"
            kotlin.jvm.internal.g0.o(r6, r7)
            java.lang.Object r5 = r5.get(r6)
            java.util.Set r5 = (java.util.Set) r5
            if (r5 == 0) goto L24
            r0.addAll(r5)
            goto L27
        L24:
            r0.add(r4)
        L27:
            int r3 = r3 + 1
            goto L7
        L2a:
            java.util.Set r9 = kotlin.collections.u1.a(r0)
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.Object[] r9 = r9.toArray(r0)
            java.lang.String[] r9 = (java.lang.String[]) r9
            return r9
    }

    private final java.lang.Object startTrackingTable(androidx.room.PooledConnection r18, int r19, kotlin.coroutines.e<? super kotlin.n1> r20) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            boolean r4 = r3 instanceof androidx.room.TriggerBasedInvalidationTracker$startTrackingTable$1
            if (r4 == 0) goto L1b
            r4 = r3
            androidx.room.TriggerBasedInvalidationTracker$startTrackingTable$1 r4 = (androidx.room.TriggerBasedInvalidationTracker$startTrackingTable$1) r4
            int r5 = r4.label
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1b
            int r5 = r5 - r6
            r4.label = r5
            goto L20
        L1b:
            androidx.room.TriggerBasedInvalidationTracker$startTrackingTable$1 r4 = new androidx.room.TriggerBasedInvalidationTracker$startTrackingTable$1
            r4.<init>(r0, r3)
        L20:
            java.lang.Object r3 = r4.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.a.l()
            int r6 = r4.label
            r7 = 2
            r8 = 1
            if (r6 == 0) goto L68
            if (r6 == r8) goto L55
            if (r6 != r7) goto L4d
            int r1 = r4.I$2
            int r2 = r4.I$1
            int r6 = r4.I$0
            java.lang.Object r9 = r4.L$3
            java.lang.String[] r9 = (java.lang.String[]) r9
            java.lang.Object r10 = r4.L$2
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r4.L$1
            androidx.room.PooledConnection r11 = (androidx.room.PooledConnection) r11
            java.lang.Object r12 = r4.L$0
            androidx.room.TriggerBasedInvalidationTracker r12 = (androidx.room.TriggerBasedInvalidationTracker) r12
            kotlin.g0.n(r3)
            r20 = 1
            goto L102
        L4d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L55:
            int r1 = r4.I$0
            java.lang.Object r2 = r4.L$1
            androidx.room.PooledConnection r2 = (androidx.room.PooledConnection) r2
            java.lang.Object r6 = r4.L$0
            androidx.room.TriggerBasedInvalidationTracker r6 = (androidx.room.TriggerBasedInvalidationTracker) r6
            kotlin.g0.n(r3)
            r16 = r2
            r2 = r1
            r1 = r16
            goto L92
        L68:
            kotlin.g0.n(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "INSERT OR IGNORE INTO room_table_modification_log VALUES("
            r3.append(r6)
            r3.append(r2)
            java.lang.String r6 = ", 0)"
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            r4.L$0 = r0
            r4.L$1 = r1
            r4.I$0 = r2
            r4.label = r8
            java.lang.Object r3 = androidx.room.TransactorKt.execSQL(r1, r3, r4)
            if (r3 != r5) goto L91
            goto L101
        L91:
            r6 = r0
        L92:
            java.lang.String[] r3 = r6.tablesNames
            r3 = r3[r2]
            java.lang.String[] r9 = androidx.room.TriggerBasedInvalidationTracker.TRIGGERS
            int r10 = r9.length
            r11 = 0
            r11 = r1
            r12 = r6
            r1 = r10
            r6 = r2
            r10 = r3
            r2 = 0
        La0:
            if (r2 >= r1) goto L106
            r3 = r9[r2]
            boolean r13 = r12.useTempTable
            if (r13 == 0) goto Lab
            java.lang.String r13 = "TEMP"
            goto Lad
        Lab:
            java.lang.String r13 = ""
        Lad:
            androidx.room.TriggerBasedInvalidationTracker$Companion r14 = androidx.room.TriggerBasedInvalidationTracker.Companion
            java.lang.String r14 = androidx.room.TriggerBasedInvalidationTracker.Companion.access$getTriggerName(r14, r10, r3)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r20 = 1
            java.lang.String r8 = "CREATE "
            r15.append(r8)
            r15.append(r13)
            java.lang.String r8 = " TRIGGER IF NOT EXISTS `"
            r15.append(r8)
            r15.append(r14)
            java.lang.String r8 = "` AFTER "
            r15.append(r8)
            r15.append(r3)
            java.lang.String r3 = " ON `"
            r15.append(r3)
            r15.append(r10)
            java.lang.String r3 = "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = "
            r15.append(r3)
            r15.append(r6)
            java.lang.String r3 = " AND invalidated = 0; END"
            r15.append(r3)
            java.lang.String r3 = r15.toString()
            r4.L$0 = r12
            r4.L$1 = r11
            r4.L$2 = r10
            r4.L$3 = r9
            r4.I$0 = r6
            r4.I$1 = r2
            r4.I$2 = r1
            r4.label = r7
            java.lang.Object r3 = androidx.room.TransactorKt.execSQL(r11, r3, r4)
            if (r3 != r5) goto L102
        L101:
            return r5
        L102:
            int r2 = r2 + 1
            r8 = 1
            goto La0
        L106:
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    private final java.lang.Object stopTrackingTable(androidx.room.PooledConnection r10, int r11, kotlin.coroutines.e<? super kotlin.n1> r12) {
            r9 = this;
            boolean r0 = r12 instanceof androidx.room.TriggerBasedInvalidationTracker$stopTrackingTable$1
            if (r0 == 0) goto L13
            r0 = r12
            androidx.room.TriggerBasedInvalidationTracker$stopTrackingTable$1 r0 = (androidx.room.TriggerBasedInvalidationTracker$stopTrackingTable$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.TriggerBasedInvalidationTracker$stopTrackingTable$1 r0 = new androidx.room.TriggerBasedInvalidationTracker$stopTrackingTable$1
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            int r10 = r0.I$1
            int r11 = r0.I$0
            java.lang.Object r2 = r0.L$2
            java.lang.String[] r2 = (java.lang.String[]) r2
            java.lang.Object r4 = r0.L$1
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r0.L$0
            androidx.room.PooledConnection r5 = (androidx.room.PooledConnection) r5
            kotlin.g0.n(r12)
            r12 = r4
            goto L87
        L3a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L42:
            kotlin.g0.n(r12)
            java.lang.String[] r12 = r9.tablesNames
            r11 = r12[r11]
            java.lang.String[] r12 = androidx.room.TriggerBasedInvalidationTracker.TRIGGERS
            int r2 = r12.length
            r4 = 0
            r8 = r11
            r11 = r10
            r10 = r2
            r2 = r12
            r12 = r8
        L52:
            if (r4 >= r10) goto L8b
            r5 = r2[r4]
            androidx.room.TriggerBasedInvalidationTracker$Companion r6 = androidx.room.TriggerBasedInvalidationTracker.Companion
            java.lang.String r5 = androidx.room.TriggerBasedInvalidationTracker.Companion.access$getTriggerName(r6, r12, r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "DROP TRIGGER IF EXISTS `"
            r6.append(r7)
            r6.append(r5)
            r5 = 96
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r0.L$0 = r11
            r0.L$1 = r12
            r0.L$2 = r2
            r0.I$0 = r4
            r0.I$1 = r10
            r0.label = r3
            java.lang.Object r5 = androidx.room.TransactorKt.execSQL(r11, r5, r0)
            if (r5 != r1) goto L85
            return r1
        L85:
            r5 = r11
            r11 = r4
        L87:
            int r4 = r11 + 1
            r11 = r5
            goto L52
        L8b:
            kotlin.n1 r10 = kotlin.n1.a
            return r10
    }

    public final void configureConnection(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r8) {
            r7 = this;
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "PRAGMA query_only"
            androidx.sqlite.SQLiteStatement r1 = r8.prepare(r0)
            r1.step()     // Catch: java.lang.Throwable -> L48
            r0 = 0
            boolean r0 = r1.getBoolean(r0)     // Catch: java.lang.Throwable -> L48
            r2 = 0
            kotlin.jdk7.a.c(r1, r2)
            if (r0 != 0) goto L47
            java.lang.String r0 = "PRAGMA temp_store = MEMORY"
            androidx.sqlite.SQLite.execSQL(r8, r0)
            java.lang.String r0 = "PRAGMA recursive_triggers = 1"
            androidx.sqlite.SQLite.execSQL(r8, r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS room_table_modification_log"
            androidx.sqlite.SQLite.execSQL(r8, r0)
            boolean r0 = r7.useTempTable
            if (r0 == 0) goto L32
            java.lang.String r0 = "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)"
            androidx.sqlite.SQLite.execSQL(r8, r0)
            goto L42
        L32:
            r5 = 4
            r6 = 0
            java.lang.String r1 = "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)"
            java.lang.String r2 = "TEMP"
            java.lang.String r3 = ""
            r4 = 0
            java.lang.String r0 = kotlin.text.u.x2(r1, r2, r3, r4, r5, r6)
            androidx.sqlite.SQLite.execSQL(r8, r0)
        L42:
            androidx.room.ObservedTableStates r8 = r7.observedTableStates
            r8.forceNeedSync$room_runtime_release()
        L47:
            return
        L48:
            r0 = move-exception
            r8 = r0
            throw r8     // Catch: java.lang.Throwable -> L4b
        L4b:
            r0 = move-exception
            kotlin.jdk7.a.c(r1, r8)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.i<java.util.Set<java.lang.String>> createFlow$room_runtime_release(@org.jetbrains.annotations.NotNull java.lang.String[] r8, @org.jetbrains.annotations.NotNull int[] r9, boolean r10) {
            r7 = this;
            java.lang.String r0 = "resolvedTableNames"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "tableIds"
            kotlin.jvm.internal.g0.p(r9, r0)
            androidx.room.TriggerBasedInvalidationTracker$createFlow$1 r1 = new androidx.room.TriggerBasedInvalidationTracker$createFlow$1
            r6 = 0
            r2 = r7
            r5 = r8
            r3 = r9
            r4 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            kotlinx.coroutines.flow.i r8 = kotlinx.coroutines.flow.k.J0(r1)
            return r8
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function0<java.lang.Boolean> getOnAllowRefresh$room_runtime_release() {
            r1 = this;
            kotlin.jvm.functions.Function0<java.lang.Boolean> r0 = r1.onAllowRefresh
            return r0
    }

    public final boolean onObserverAdded$room_runtime_release(@org.jetbrains.annotations.NotNull int[] r2) {
            r1 = this;
            java.lang.String r0 = "tableIds"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.room.ObservedTableStates r0 = r1.observedTableStates
            boolean r2 = r0.onObserverAdded$room_runtime_release(r2)
            return r2
    }

    public final boolean onObserverRemoved$room_runtime_release(@org.jetbrains.annotations.NotNull int[] r2) {
            r1 = this;
            java.lang.String r0 = "tableIds"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.room.ObservedTableStates r0 = r1.observedTableStates
            boolean r2 = r0.onObserverRemoved$room_runtime_release(r2)
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object refreshInvalidation$room_runtime_release(@org.jetbrains.annotations.NotNull java.lang.String[] r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.n1> r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.n1> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.lang.Boolean> r8) {
            r4 = this;
            boolean r0 = r8 instanceof androidx.room.TriggerBasedInvalidationTracker$refreshInvalidation$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.room.TriggerBasedInvalidationTracker$refreshInvalidation$1 r0 = (androidx.room.TriggerBasedInvalidationTracker$refreshInvalidation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.TriggerBasedInvalidationTracker$refreshInvalidation$1 r0 = new androidx.room.TriggerBasedInvalidationTracker$refreshInvalidation$1
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r5 = r0.L$1
            int[] r5 = (int[]) r5
            java.lang.Object r6 = r0.L$0
            r7 = r6
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            kotlin.g0.n(r8)     // Catch: java.lang.Throwable -> L32
            goto L59
        L32:
            r5 = move-exception
            goto L88
        L34:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3c:
            kotlin.g0.n(r8)
            kotlin.Pair r5 = r4.validateTableNames$room_runtime_release(r5)
            java.lang.Object r5 = r5.component2()
            int[] r5 = (int[]) r5
            r6.invoke()
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L32
            r0.L$1 = r5     // Catch: java.lang.Throwable -> L32
            r0.label = r3     // Catch: java.lang.Throwable -> L32
            java.lang.Object r8 = r4.notifyInvalidation(r0)     // Catch: java.lang.Throwable -> L32
            if (r8 != r1) goto L59
            return r1
        L59:
            java.util.Set r8 = (java.util.Set) r8     // Catch: java.lang.Throwable -> L32
            int r6 = r5.length     // Catch: java.lang.Throwable -> L32
            r0 = 0
            if (r6 != 0) goto L61
            r6 = 1
            goto L62
        L61:
            r6 = 0
        L62:
            if (r6 != 0) goto L7a
            int r6 = r5.length     // Catch: java.lang.Throwable -> L32
            r1 = 0
        L66:
            if (r1 >= r6) goto L78
            r2 = r5[r1]     // Catch: java.lang.Throwable -> L32
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.a.f(r2)     // Catch: java.lang.Throwable -> L32
            boolean r2 = r8.contains(r2)     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L75
            goto L80
        L75:
            int r1 = r1 + 1
            goto L66
        L78:
            r3 = 0
            goto L80
        L7a:
            boolean r5 = r8.isEmpty()     // Catch: java.lang.Throwable -> L32
            if (r5 != 0) goto L78
        L80:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r3)     // Catch: java.lang.Throwable -> L32
            r7.invoke()
            return r5
        L88:
            r7.invoke()
            throw r5
    }

    public final void refreshInvalidationAsync$room_runtime_release(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.n1> r7, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.n1> r8) {
            r6 = this;
            java.lang.String r0 = "onRefreshScheduled"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "onRefreshCompleted"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.pendingRefresh
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L30
            r7.invoke()
            androidx.room.RoomDatabase r7 = r6.database
            kotlinx.coroutines.r0 r0 = r7.getCoroutineScope()
            kotlinx.coroutines.q0 r1 = new kotlinx.coroutines.q0
            java.lang.String r7 = "Room Invalidation Tracker Refresh"
            r1.<init>(r7)
            androidx.room.TriggerBasedInvalidationTracker$refreshInvalidationAsync$3 r3 = new androidx.room.TriggerBasedInvalidationTracker$refreshInvalidationAsync$3
            r7 = 0
            r3.<init>(r6, r8, r7)
            r4 = 2
            r5 = 0
            r2 = 0
            kotlinx.coroutines.i.e(r0, r1, r2, r3, r4, r5)
        L30:
            return
    }

    public final void resetSync$room_runtime_release() {
            r1 = this;
            androidx.room.ObservedTableStates r0 = r1.observedTableStates
            r0.resetTriggerState$room_runtime_release()
            return
    }

    public final void setOnAllowRefresh$room_runtime_release(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<java.lang.Boolean> r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.onAllowRefresh = r2
            return
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object syncTriggers$room_runtime_release(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r8) {
            r7 = this;
            boolean r0 = r8 instanceof androidx.room.TriggerBasedInvalidationTracker$syncTriggers$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.room.TriggerBasedInvalidationTracker$syncTriggers$1 r0 = (androidx.room.TriggerBasedInvalidationTracker$syncTriggers$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.TriggerBasedInvalidationTracker$syncTriggers$1 r0 = new androidx.room.TriggerBasedInvalidationTracker$syncTriggers$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.L$0
            androidx.room.concurrent.CloseBarrier r0 = (androidx.room.concurrent.CloseBarrier) r0
            kotlin.g0.n(r8)     // Catch: java.lang.Throwable -> L2d
            goto L5b
        L2d:
            r8 = move-exception
            goto L63
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            kotlin.g0.n(r8)
            androidx.room.RoomDatabase r8 = r7.database
            androidx.room.concurrent.CloseBarrier r8 = r8.getCloseBarrier$room_runtime_release()
            boolean r2 = r8.block$room_runtime_release()
            if (r2 == 0) goto L67
            androidx.room.RoomDatabase r2 = r7.database     // Catch: java.lang.Throwable -> L5f
            androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1 r4 = new androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1     // Catch: java.lang.Throwable -> L5f
            r5 = 0
            r4.<init>(r7, r5)     // Catch: java.lang.Throwable -> L5f
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L5f
            r0.label = r3     // Catch: java.lang.Throwable -> L5f
            r3 = 0
            java.lang.Object r0 = r2.useConnection$room_runtime_release(r3, r4, r0)     // Catch: java.lang.Throwable -> L5f
            if (r0 != r1) goto L5a
            return r1
        L5a:
            r0 = r8
        L5b:
            r0.unblock$room_runtime_release()
            goto L67
        L5f:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L63:
            r0.unblock$room_runtime_release()
            throw r8
        L67:
            kotlin.n1 r8 = kotlin.n1.a
            return r8
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.Pair<java.lang.String[], int[]> validateTableNames$room_runtime_release(@org.jetbrains.annotations.NotNull java.lang.String[] r8) {
            r7 = this;
            java.lang.String r0 = "names"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String[] r8 = r7.resolveViews(r8)
            int r0 = r8.length
            int[] r1 = new int[r0]
            r2 = 0
        Ld:
            if (r2 >= r0) goto L46
            r3 = r8[r2]
            java.util.Map<java.lang.String, java.lang.Integer> r4 = r7.tableIdLookup
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r5 = r3.toLowerCase(r5)
            java.lang.String r6 = "toLowerCase(...)"
            kotlin.jvm.internal.g0.o(r5, r6)
            java.lang.Object r4 = r4.get(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L2f
            int r3 = r4.intValue()
            r1[r2] = r3
            int r2 = r2 + 1
            goto Ld
        L2f:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "There is no table with name "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L46:
            kotlin.Pair r8 = kotlin.o0.a(r8, r1)
            return r8
    }
}
