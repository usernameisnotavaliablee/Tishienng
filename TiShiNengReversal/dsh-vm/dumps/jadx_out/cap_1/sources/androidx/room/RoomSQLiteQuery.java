package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"WrongConstant"})
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class RoomSQLiteQuery implements androidx.sqlite.db.SupportSQLiteQuery, androidx.sqlite.db.SupportSQLiteProgram {
    private static final int BLOB = 5;

    @org.jetbrains.annotations.NotNull
    public static final androidx.room.RoomSQLiteQuery.Companion Companion = null;
    public static final int DESIRED_POOL_SIZE = 10;
    private static final int DOUBLE = 3;
    private static final int LONG = 2;
    private static final int NULL = 1;
    public static final int POOL_LIMIT = 15;
    private static final int STRING = 4;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final java.util.TreeMap<java.lang.Integer, androidx.room.RoomSQLiteQuery> queryPool = null;
    private int argCount;

    @org.jetbrains.annotations.NotNull
    private final int[] bindingTypes;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final byte[][] blobBindings;

    @androidx.annotation.VisibleForTesting
    private final int capacity;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final double[] doubleBindings;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final long[] longBindings;

    @org.jetbrains.annotations.Nullable
    private volatile java.lang.String query;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final java.lang.String[] stringBindings;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.SOURCE)
    public @interface Binding {
    }

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

        @androidx.annotation.VisibleForTesting
        public static /* synthetic */ void getDESIRED_POOL_SIZE$annotations() {
                return
        }

        @androidx.annotation.VisibleForTesting
        public static /* synthetic */ void getPOOL_LIMIT$annotations() {
                return
        }

        @androidx.annotation.VisibleForTesting
        public static /* synthetic */ void getQueryPool$annotations() {
                return
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final androidx.room.RoomSQLiteQuery acquire(@org.jetbrains.annotations.NotNull java.lang.String r4, int r5) {
                r3 = this;
                java.lang.String r0 = "query"
                kotlin.jvm.internal.g0.p(r4, r0)
                java.util.TreeMap<java.lang.Integer, androidx.room.RoomSQLiteQuery> r0 = androidx.room.RoomSQLiteQuery.queryPool
                monitor-enter(r0)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L27
                java.util.Map$Entry r1 = r0.ceilingEntry(r1)     // Catch: java.lang.Throwable -> L27
                if (r1 == 0) goto L29
                java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L27
                r0.remove(r2)     // Catch: java.lang.Throwable -> L27
                java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L27
                androidx.room.RoomSQLiteQuery r1 = (androidx.room.RoomSQLiteQuery) r1     // Catch: java.lang.Throwable -> L27
                r1.init(r4, r5)     // Catch: java.lang.Throwable -> L27
                kotlin.jvm.internal.g0.m(r1)     // Catch: java.lang.Throwable -> L27
                monitor-exit(r0)
                return r1
            L27:
                r4 = move-exception
                goto L36
            L29:
                kotlin.n1 r1 = kotlin.n1.a     // Catch: java.lang.Throwable -> L27
                monitor-exit(r0)
                androidx.room.RoomSQLiteQuery r0 = new androidx.room.RoomSQLiteQuery
                r1 = 0
                r0.<init>(r5, r1)
                r0.init(r4, r5)
                return r0
            L36:
                monitor-exit(r0)
                throw r4
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final androidx.room.RoomSQLiteQuery copyFrom(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteQuery r3) {
                r2 = this;
                java.lang.String r0 = "supportSQLiteQuery"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = r3.getSql()
                int r1 = r3.getArgCount()
                androidx.room.RoomSQLiteQuery r0 = r2.acquire(r0, r1)
                androidx.room.RoomSQLiteQuery$Companion$copyFrom$1 r1 = new androidx.room.RoomSQLiteQuery$Companion$copyFrom$1
                r1.<init>(r0)
                r3.bindTo(r1)
                return r0
        }

        public final void prunePoolLocked$room_runtime_release() {
                r3 = this;
                java.util.TreeMap<java.lang.Integer, androidx.room.RoomSQLiteQuery> r0 = androidx.room.RoomSQLiteQuery.queryPool
                int r1 = r0.size()
                r2 = 15
                if (r1 <= r2) goto L29
                int r1 = r0.size()
                int r1 = r1 + (-10)
                java.util.NavigableSet r0 = r0.descendingKeySet()
                java.util.Iterator r0 = r0.iterator()
                java.lang.String r2 = "iterator(...)"
                kotlin.jvm.internal.g0.o(r0, r2)
            L1d:
                int r2 = r1 + (-1)
                if (r1 <= 0) goto L29
                r0.next()
                r0.remove()
                r1 = r2
                goto L1d
            L29:
                return
        }
    }

    static {
            androidx.room.RoomSQLiteQuery$Companion r0 = new androidx.room.RoomSQLiteQuery$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.room.RoomSQLiteQuery.Companion = r0
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            androidx.room.RoomSQLiteQuery.queryPool = r0
            return
    }

    private RoomSQLiteQuery(int r2) {
            r1 = this;
            r1.<init>()
            r1.capacity = r2
            int r2 = r2 + 1
            int[] r0 = new int[r2]
            r1.bindingTypes = r0
            long[] r0 = new long[r2]
            r1.longBindings = r0
            double[] r0 = new double[r2]
            r1.doubleBindings = r0
            java.lang.String[] r0 = new java.lang.String[r2]
            r1.stringBindings = r0
            byte[][] r2 = new byte[r2][]
            r1.blobBindings = r2
            return
    }

    public /* synthetic */ RoomSQLiteQuery(int r1, kotlin.jvm.internal.v r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static /* synthetic */ kotlin.n1 a(androidx.room.RoomSQLiteQuery r0, androidx.sqlite.SQLiteStatement r1) {
            kotlin.n1 r0 = toRoomRawQuery$lambda$1(r0, r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final androidx.room.RoomSQLiteQuery acquire(@org.jetbrains.annotations.NotNull java.lang.String r1, int r2) {
            androidx.room.RoomSQLiteQuery$Companion r0 = androidx.room.RoomSQLiteQuery.Companion
            androidx.room.RoomSQLiteQuery r1 = r0.acquire(r1, r2)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final androidx.room.RoomSQLiteQuery copyFrom(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteQuery r1) {
            androidx.room.RoomSQLiteQuery$Companion r0 = androidx.room.RoomSQLiteQuery.Companion
            androidx.room.RoomSQLiteQuery r1 = r0.copyFrom(r1)
            return r1
    }

    private static /* synthetic */ void getBindingTypes$annotations() {
            return
    }

    @androidx.annotation.VisibleForTesting
    public static /* synthetic */ void getBlobBindings$annotations() {
            return
    }

    @androidx.annotation.VisibleForTesting
    public static /* synthetic */ void getDoubleBindings$annotations() {
            return
    }

    @androidx.annotation.VisibleForTesting
    public static /* synthetic */ void getLongBindings$annotations() {
            return
    }

    @androidx.annotation.VisibleForTesting
    public static /* synthetic */ void getStringBindings$annotations() {
            return
    }

    private static final kotlin.n1 toRoomRawQuery$lambda$1(androidx.room.RoomSQLiteQuery r1, androidx.sqlite.SQLiteStatement r2) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.bindTo(r2)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindBlob(int r3, @org.jetbrains.annotations.NotNull byte[] r4) {
            r2 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.g0.p(r4, r0)
            int[] r0 = r2.bindingTypes
            r1 = 5
            r0[r3] = r1
            byte[][] r0 = r2.blobBindings
            r0[r3] = r4
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindDouble(int r3, double r4) {
            r2 = this;
            int[] r0 = r2.bindingTypes
            r1 = 3
            r0[r3] = r1
            double[] r0 = r2.doubleBindings
            r0[r3] = r4
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindLong(int r3, long r4) {
            r2 = this;
            int[] r0 = r2.bindingTypes
            r1 = 2
            r0[r3] = r1
            long[] r0 = r2.longBindings
            r0[r3] = r4
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindNull(int r3) {
            r2 = this;
            int[] r0 = r2.bindingTypes
            r1 = 1
            r0[r3] = r1
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindString(int r3, @org.jetbrains.annotations.NotNull java.lang.String r4) {
            r2 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.g0.p(r4, r0)
            int[] r0 = r2.bindingTypes
            r1 = 4
            r0[r3] = r1
            java.lang.String[] r0 = r2.stringBindings
            r0[r3] = r4
            return
    }

    public final void bindText(int r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.bindString(r2, r3)
            return
    }

    public final void bindTo(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteStatement r7) {
            r6 = this;
            java.lang.String r0 = "statement"
            kotlin.jvm.internal.g0.p(r7, r0)
            int r0 = r6.getArgCount()
            r1 = 1
            if (r1 > r0) goto L5a
            r2 = 1
        Ld:
            int[] r3 = r6.bindingTypes
            r3 = r3[r2]
            if (r3 == r1) goto L52
            r4 = 2
            if (r3 == r4) goto L4a
            r4 = 3
            if (r3 == r4) goto L42
            r4 = 4
            java.lang.String r5 = "Required value was null."
            if (r3 == r4) goto L32
            r4 = 5
            if (r3 == r4) goto L22
            goto L55
        L22:
            byte[][] r3 = r6.blobBindings
            r3 = r3[r2]
            if (r3 == 0) goto L2c
            r7.mo84bindBlob(r2, r3)
            goto L55
        L2c:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>(r5)
            throw r7
        L32:
            java.lang.String[] r3 = r6.stringBindings
            r3 = r3[r2]
            if (r3 == 0) goto L3c
            r7.mo88bindText(r2, r3)
            goto L55
        L3c:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>(r5)
            throw r7
        L42:
            double[] r3 = r6.doubleBindings
            r4 = r3[r2]
            r7.mo85bindDouble(r2, r4)
            goto L55
        L4a:
            long[] r3 = r6.longBindings
            r4 = r3[r2]
            r7.mo86bindLong(r2, r4)
            goto L55
        L52:
            r7.mo87bindNull(r2)
        L55:
            if (r2 == r0) goto L5a
            int r2 = r2 + 1
            goto Ld
        L5a:
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public void bindTo(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteProgram r7) {
            r6 = this;
            java.lang.String r0 = "statement"
            kotlin.jvm.internal.g0.p(r7, r0)
            int r0 = r6.getArgCount()
            r1 = 1
            if (r1 > r0) goto L5a
            r2 = 1
        Ld:
            int[] r3 = r6.bindingTypes
            r3 = r3[r2]
            if (r3 == r1) goto L52
            r4 = 2
            if (r3 == r4) goto L4a
            r4 = 3
            if (r3 == r4) goto L42
            r4 = 4
            java.lang.String r5 = "Required value was null."
            if (r3 == r4) goto L32
            r4 = 5
            if (r3 == r4) goto L22
            goto L55
        L22:
            byte[][] r3 = r6.blobBindings
            r3 = r3[r2]
            if (r3 == 0) goto L2c
            r7.bindBlob(r2, r3)
            goto L55
        L2c:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>(r5)
            throw r7
        L32:
            java.lang.String[] r3 = r6.stringBindings
            r3 = r3[r2]
            if (r3 == 0) goto L3c
            r7.bindString(r2, r3)
            goto L55
        L3c:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>(r5)
            throw r7
        L42:
            double[] r3 = r6.doubleBindings
            r4 = r3[r2]
            r7.bindDouble(r2, r4)
            goto L55
        L4a:
            long[] r3 = r6.longBindings
            r4 = r3[r2]
            r7.bindLong(r2, r4)
            goto L55
        L52:
            r7.bindNull(r2)
        L55:
            if (r2 == r0) goto L5a
            int r2 = r2 + 1
            goto Ld
        L5a:
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void clearBindings() {
            r12 = this;
            int[] r0 = r12.bindingTypes
            r4 = 6
            r5 = 0
            r1 = 1
            r2 = 0
            r3 = 0
            kotlin.collections.n.T1(r0, r1, r2, r3, r4, r5)
            java.lang.String[] r6 = r12.stringBindings
            r10 = 6
            r11 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            kotlin.collections.n.V1(r6, r7, r8, r9, r10, r11)
            byte[][] r0 = r12.blobBindings
            r1 = 0
            kotlin.collections.n.V1(r0, r1, r2, r3, r4, r5)
            r0 = 0
            r12.query = r0
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r0 = this;
            return
    }

    public final void copyArgumentsFrom(@org.jetbrains.annotations.NotNull androidx.room.RoomSQLiteQuery r5) {
            r4 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r5, r0)
            int r0 = r5.getArgCount()
            int r0 = r0 + 1
            int[] r1 = r5.bindingTypes
            int[] r2 = r4.bindingTypes
            r3 = 0
            java.lang.System.arraycopy(r1, r3, r2, r3, r0)
            long[] r1 = r5.longBindings
            long[] r2 = r4.longBindings
            java.lang.System.arraycopy(r1, r3, r2, r3, r0)
            java.lang.String[] r1 = r5.stringBindings
            java.lang.String[] r2 = r4.stringBindings
            java.lang.System.arraycopy(r1, r3, r2, r3, r0)
            byte[][] r1 = r5.blobBindings
            byte[][] r2 = r4.blobBindings
            java.lang.System.arraycopy(r1, r3, r2, r3, r0)
            double[] r5 = r5.doubleBindings
            double[] r1 = r4.doubleBindings
            java.lang.System.arraycopy(r5, r3, r1, r3, r0)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public int getArgCount() {
            r1 = this;
            int r0 = r1.argCount
            return r0
    }

    public final int getCapacity() {
            r1 = this;
            int r0 = r1.capacity
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    @org.jetbrains.annotations.NotNull
    public java.lang.String getSql() {
            r2 = this;
            java.lang.String r0 = r2.query
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Required value was null."
            r0.<init>(r1)
            throw r0
    }

    public final void init(@org.jetbrains.annotations.NotNull java.lang.String r2, int r3) {
            r1 = this;
            java.lang.String r0 = "query"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.query = r2
            r1.argCount = r3
            return
    }

    public final void release() {
            r2 = this;
            java.util.TreeMap<java.lang.Integer, androidx.room.RoomSQLiteQuery> r0 = androidx.room.RoomSQLiteQuery.queryPool
            monitor-enter(r0)
            int r1 = r2.capacity     // Catch: java.lang.Throwable -> L15
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L15
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L15
            androidx.room.RoomSQLiteQuery$Companion r1 = androidx.room.RoomSQLiteQuery.Companion     // Catch: java.lang.Throwable -> L15
            r1.prunePoolLocked$room_runtime_release()     // Catch: java.lang.Throwable -> L15
            kotlin.n1 r1 = kotlin.n1.a     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)
            return
        L15:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.room.RoomRawQuery toRoomRawQuery() {
            r3 = this;
            androidx.room.RoomRawQuery r0 = new androidx.room.RoomRawQuery
            java.lang.String r1 = r3.getSql()
            androidx.room.s r2 = new androidx.room.s
            r2.<init>(r3)
            r0.<init>(r1, r2)
            return r0
    }
}
