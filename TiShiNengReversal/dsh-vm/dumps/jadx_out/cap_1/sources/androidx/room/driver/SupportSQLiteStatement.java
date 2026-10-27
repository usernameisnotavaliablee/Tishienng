package androidx.room.driver;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class SupportSQLiteStatement implements androidx.sqlite.SQLiteStatement {

    @org.jetbrains.annotations.NotNull
    public static final androidx.room.driver.SupportSQLiteStatement.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private final androidx.sqlite.db.SupportSQLiteDatabase db;
    private boolean isClosed;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String sql;

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

        private final int getStatementPrefixIndex(java.lang.String r12) {
                r11 = this;
                int r0 = r12.length()
                int r0 = r0 + (-2)
                r1 = -1
                if (r0 >= 0) goto La
                return r1
            La:
                r2 = 0
            Lb:
                if (r2 >= r0) goto L6a
                char r3 = r12.charAt(r2)
                r4 = 32
                int r4 = kotlin.jvm.internal.g0.t(r3, r4)
                if (r4 > 0) goto L1c
                int r2 = r2 + 1
                goto Lb
            L1c:
                r4 = 45
                if (r3 != r4) goto L3c
                int r3 = r2 + 1
                char r3 = r12.charAt(r3)
                if (r3 == r4) goto L29
                goto L69
            L29:
                int r7 = r2 + 2
                r9 = 4
                r10 = 0
                r6 = 10
                r8 = 0
                r5 = r12
                int r12 = kotlin.text.u.G3(r5, r6, r7, r8, r9, r10)
                if (r12 >= 0) goto L38
                return r1
            L38:
                int r2 = r12 + 1
            L3a:
                r12 = r5
                goto Lb
            L3c:
                r5 = r12
                r12 = 47
                if (r3 != r12) goto L69
                int r3 = r2 + 1
                char r4 = r5.charAt(r3)
                r6 = 42
                if (r4 == r6) goto L4c
                goto L69
            L4c:
                int r4 = r3 + 1
                r6 = 4
                r7 = 0
                r3 = 42
                r2 = r5
                r5 = 0
                int r3 = kotlin.text.u.G3(r2, r3, r4, r5, r6, r7)
                r5 = r2
                if (r3 >= 0) goto L5c
                return r1
            L5c:
                int r2 = r3 + 1
                if (r2 >= r0) goto L66
                char r2 = r5.charAt(r2)
                if (r2 != r12) goto L4c
            L66:
                int r2 = r3 + 2
                goto L3a
            L69:
                return r2
            L6a:
                return r1
        }

        private final boolean isRowStatement(java.lang.String r3) {
                r2 = this;
                int r0 = r3.hashCode()
                r1 = 79487(0x1367f, float:1.11385E-40)
                if (r0 == r1) goto L26
                r1 = 81978(0x1403a, float:1.14876E-40)
                if (r0 == r1) goto L1d
                r1 = 85954(0x14fc2, float:1.20447E-40)
                if (r0 == r1) goto L14
                goto L30
            L14:
                java.lang.String r0 = "WIT"
                boolean r3 = r3.equals(r0)
                if (r3 != 0) goto L2e
                goto L30
            L1d:
                java.lang.String r0 = "SEL"
                boolean r3 = r3.equals(r0)
                if (r3 != 0) goto L2e
                goto L30
            L26:
                java.lang.String r0 = "PRA"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L30
            L2e:
                r3 = 1
                return r3
            L30:
                r3 = 0
                return r3
        }

        @org.jetbrains.annotations.NotNull
        public final androidx.room.driver.SupportSQLiteStatement create(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteDatabase r3, @org.jetbrains.annotations.NotNull java.lang.String r4) {
                r2 = this;
                java.lang.String r0 = "db"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "sql"
                kotlin.jvm.internal.g0.p(r4, r0)
                java.lang.CharSequence r0 = kotlin.text.u.Z5(r4)
                java.lang.String r0 = r0.toString()
                java.util.Locale r1 = java.util.Locale.ROOT
                java.lang.String r0 = r0.toUpperCase(r1)
                java.lang.String r1 = "toUpperCase(...)"
                kotlin.jvm.internal.g0.o(r0, r1)
                java.lang.String r0 = r2.getStatementPrefix$room_runtime_release(r0)
                if (r0 != 0) goto L29
                androidx.room.driver.SupportSQLiteStatement$SupportOtherAndroidSQLiteStatement r0 = new androidx.room.driver.SupportSQLiteStatement$SupportOtherAndroidSQLiteStatement
                r0.<init>(r3, r4)
                return r0
            L29:
                boolean r0 = r2.isRowStatement(r0)
                if (r0 == 0) goto L35
                androidx.room.driver.SupportSQLiteStatement$SupportAndroidSQLiteStatement r0 = new androidx.room.driver.SupportSQLiteStatement$SupportAndroidSQLiteStatement
                r0.<init>(r3, r4)
                return r0
            L35:
                androidx.room.driver.SupportSQLiteStatement$SupportOtherAndroidSQLiteStatement r0 = new androidx.room.driver.SupportSQLiteStatement$SupportOtherAndroidSQLiteStatement
                r0.<init>(r3, r4)
                return r0
        }

        @androidx.annotation.VisibleForTesting
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getStatementPrefix$room_runtime_release(@org.jetbrains.annotations.NotNull java.lang.String r4) {
                r3 = this;
                java.lang.String r0 = "sql"
                kotlin.jvm.internal.g0.p(r4, r0)
                int r0 = r3.getStatementPrefixIndex(r4)
                if (r0 < 0) goto L26
                int r1 = r4.length()
                if (r0 <= r1) goto L12
                goto L26
            L12:
                int r1 = r0 + 3
                int r2 = r4.length()
                int r1 = java.lang.Math.min(r1, r2)
                java.lang.String r4 = r4.substring(r0, r1)
                java.lang.String r0 = "substring(...)"
                kotlin.jvm.internal.g0.o(r4, r0)
                return r4
            L26:
                r4 = 0
                return r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class SupportAndroidSQLiteStatement extends androidx.room.driver.SupportSQLiteStatement {

        @org.jetbrains.annotations.NotNull
        public static final androidx.room.driver.SupportSQLiteStatement.SupportAndroidSQLiteStatement.Companion Companion = null;

        @org.jetbrains.annotations.NotNull
        private int[] bindingTypes;

        @org.jetbrains.annotations.NotNull
        private byte[][] blobBindings;

        @org.jetbrains.annotations.Nullable
        private android.database.Cursor cursor;

        @org.jetbrains.annotations.NotNull
        private double[] doubleBindings;

        @org.jetbrains.annotations.NotNull
        private long[] longBindings;

        @org.jetbrains.annotations.NotNull
        private java.lang.String[] stringBindings;

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

            public static final /* synthetic */ int access$getDataType(androidx.room.driver.SupportSQLiteStatement.SupportAndroidSQLiteStatement.Companion r0, android.database.Cursor r1, int r2) {
                    int r0 = r0.getDataType(r1, r2)
                    return r0
            }

            private final int getDataType(android.database.Cursor r3, int r4) {
                    r2 = this;
                    int r0 = r3.getType(r4)
                    int r3 = r3.getType(r4)
                    if (r3 == 0) goto L33
                    r4 = 1
                    if (r3 == r4) goto L32
                    r4 = 2
                    if (r3 == r4) goto L32
                    r4 = 3
                    if (r3 == r4) goto L32
                    r4 = 4
                    if (r3 != r4) goto L17
                    return r4
                L17:
                    java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    java.lang.String r1 = "Unknown field type: "
                    r4.append(r1)
                    r4.append(r0)
                    java.lang.String r4 = r4.toString()
                    java.lang.String r4 = r4.toString()
                    r3.<init>(r4)
                    throw r3
                L32:
                    return r4
                L33:
                    r3 = 5
                    return r3
            }
        }

        static {
                androidx.room.driver.SupportSQLiteStatement$SupportAndroidSQLiteStatement$Companion r0 = new androidx.room.driver.SupportSQLiteStatement$SupportAndroidSQLiteStatement$Companion
                r1 = 0
                r0.<init>(r1)
                androidx.room.driver.SupportSQLiteStatement.SupportAndroidSQLiteStatement.Companion = r0
                return
        }

        public SupportAndroidSQLiteStatement(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteDatabase r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "db"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "sql"
                kotlin.jvm.internal.g0.p(r3, r0)
                r0 = 0
                r1.<init>(r2, r3, r0)
                r2 = 0
                int[] r3 = new int[r2]
                r1.bindingTypes = r3
                long[] r3 = new long[r2]
                r1.longBindings = r3
                double[] r3 = new double[r2]
                r1.doubleBindings = r3
                java.lang.String[] r3 = new java.lang.String[r2]
                r1.stringBindings = r3
                byte[][] r2 = new byte[r2][]
                r1.blobBindings = r2
                return
        }

        public static final /* synthetic */ int[] access$getBindingTypes$p(androidx.room.driver.SupportSQLiteStatement.SupportAndroidSQLiteStatement r0) {
                int[] r0 = r0.bindingTypes
                return r0
        }

        public static final /* synthetic */ byte[][] access$getBlobBindings$p(androidx.room.driver.SupportSQLiteStatement.SupportAndroidSQLiteStatement r0) {
                byte[][] r0 = r0.blobBindings
                return r0
        }

        public static final /* synthetic */ double[] access$getDoubleBindings$p(androidx.room.driver.SupportSQLiteStatement.SupportAndroidSQLiteStatement r0) {
                double[] r0 = r0.doubleBindings
                return r0
        }

        public static final /* synthetic */ long[] access$getLongBindings$p(androidx.room.driver.SupportSQLiteStatement.SupportAndroidSQLiteStatement r0) {
                long[] r0 = r0.longBindings
                return r0
        }

        public static final /* synthetic */ java.lang.String[] access$getStringBindings$p(androidx.room.driver.SupportSQLiteStatement.SupportAndroidSQLiteStatement r0) {
                java.lang.String[] r0 = r0.stringBindings
                return r0
        }

        private final void ensureCapacity(int r5, int r6) {
                r4 = this;
                r0 = 1
                int r6 = r6 + r0
                int[] r1 = r4.bindingTypes
                int r2 = r1.length
                java.lang.String r3 = "copyOf(...)"
                if (r2 >= r6) goto L12
                int[] r1 = java.util.Arrays.copyOf(r1, r6)
                kotlin.jvm.internal.g0.o(r1, r3)
                r4.bindingTypes = r1
            L12:
                if (r5 == r0) goto L4f
                r0 = 2
                if (r5 == r0) goto L40
                r0 = 3
                if (r5 == r0) goto L2f
                r0 = 4
                if (r5 == r0) goto L1e
                goto L5d
            L1e:
                byte[][] r5 = r4.blobBindings
                int r0 = r5.length
                if (r0 >= r6) goto L5d
                java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r6)
                kotlin.jvm.internal.g0.o(r5, r3)
                byte[][] r5 = (byte[][]) r5
                r4.blobBindings = r5
                return
            L2f:
                java.lang.String[] r5 = r4.stringBindings
                int r0 = r5.length
                if (r0 >= r6) goto L5d
                java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r6)
                kotlin.jvm.internal.g0.o(r5, r3)
                java.lang.String[] r5 = (java.lang.String[]) r5
                r4.stringBindings = r5
                return
            L40:
                double[] r5 = r4.doubleBindings
                int r0 = r5.length
                if (r0 >= r6) goto L5d
                double[] r5 = java.util.Arrays.copyOf(r5, r6)
                kotlin.jvm.internal.g0.o(r5, r3)
                r4.doubleBindings = r5
                return
            L4f:
                long[] r5 = r4.longBindings
                int r0 = r5.length
                if (r0 >= r6) goto L5d
                long[] r5 = java.util.Arrays.copyOf(r5, r6)
                kotlin.jvm.internal.g0.o(r5, r3)
                r4.longBindings = r5
            L5d:
                return
        }

        private final void ensureCursor() {
                r2 = this;
                android.database.Cursor r0 = r2.cursor
                if (r0 != 0) goto L13
                androidx.sqlite.db.SupportSQLiteDatabase r0 = r2.getDb()
                androidx.room.driver.SupportSQLiteStatement$SupportAndroidSQLiteStatement$ensureCursor$1 r1 = new androidx.room.driver.SupportSQLiteStatement$SupportAndroidSQLiteStatement$ensureCursor$1
                r1.<init>(r2)
                android.database.Cursor r0 = r0.query(r1)
                r2.cursor = r0
            L13:
                return
        }

        private final void throwIfInvalidColumn(android.database.Cursor r1, int r2) {
                r0 = this;
                if (r2 < 0) goto L9
                int r1 = r1.getColumnCount()
                if (r2 >= r1) goto L9
                return
            L9:
                r1 = 25
                java.lang.String r2 = "column index out of range"
                androidx.sqlite.SQLite.throwSQLiteException(r1, r2)
                kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
                r1.<init>()
                throw r1
        }

        private final android.database.Cursor throwIfNoRow() {
                r2 = this;
                android.database.Cursor r0 = r2.cursor
                if (r0 == 0) goto L5
                return r0
            L5:
                r0 = 21
                java.lang.String r1 = "no row"
                androidx.sqlite.SQLite.throwSQLiteException(r0, r1)
                kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
                r0.<init>()
                throw r0
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindBlob */
        public void mo84bindBlob(int r3, @org.jetbrains.annotations.NotNull byte[] r4) {
                r2 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.g0.p(r4, r0)
                r2.throwIfClosed()
                r0 = 4
                r2.ensureCapacity(r0, r3)
                int[] r1 = r2.bindingTypes
                r1[r3] = r0
                byte[][] r0 = r2.blobBindings
                r0[r3] = r4
                return
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindDouble */
        public void mo85bindDouble(int r3, double r4) {
                r2 = this;
                r2.throwIfClosed()
                r0 = 2
                r2.ensureCapacity(r0, r3)
                int[] r1 = r2.bindingTypes
                r1[r3] = r0
                double[] r0 = r2.doubleBindings
                r0[r3] = r4
                return
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindLong */
        public void mo86bindLong(int r3, long r4) {
                r2 = this;
                r2.throwIfClosed()
                r0 = 1
                r2.ensureCapacity(r0, r3)
                int[] r1 = r2.bindingTypes
                r1[r3] = r0
                long[] r0 = r2.longBindings
                r0[r3] = r4
                return
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindNull */
        public void mo87bindNull(int r3) {
                r2 = this;
                r2.throwIfClosed()
                r0 = 5
                r2.ensureCapacity(r0, r3)
                int[] r1 = r2.bindingTypes
                r1[r3] = r0
                return
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindText */
        public void mo88bindText(int r3, @org.jetbrains.annotations.NotNull java.lang.String r4) {
                r2 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.g0.p(r4, r0)
                r2.throwIfClosed()
                r0 = 3
                r2.ensureCapacity(r0, r3)
                int[] r1 = r2.bindingTypes
                r1[r3] = r0
                java.lang.String[] r0 = r2.stringBindings
                r0[r3] = r4
                return
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: clearBindings */
        public void mo89clearBindings() {
                r2 = this;
                r2.throwIfClosed()
                r0 = 0
                int[] r1 = new int[r0]
                r2.bindingTypes = r1
                long[] r1 = new long[r0]
                r2.longBindings = r1
                double[] r1 = new double[r0]
                r2.doubleBindings = r1
                java.lang.String[] r1 = new java.lang.String[r0]
                r2.stringBindings = r1
                byte[][] r0 = new byte[r0][]
                r2.blobBindings = r0
                return
        }

        @Override // androidx.sqlite.SQLiteStatement, java.lang.AutoCloseable
        public void close() {
                r1 = this;
                boolean r0 = r1.isClosed()
                if (r0 != 0) goto Lc
                r1.mo89clearBindings()
                r1.reset()
            Lc:
                r0 = 1
                r1.setClosed(r0)
                return
        }

        @Override // androidx.sqlite.SQLiteStatement
        @org.jetbrains.annotations.NotNull
        public byte[] getBlob(int r2) {
                r1 = this;
                r1.throwIfClosed()
                android.database.Cursor r0 = r1.throwIfNoRow()
                r1.throwIfInvalidColumn(r0, r2)
                byte[] r2 = r0.getBlob(r2)
                java.lang.String r0 = "getBlob(...)"
                kotlin.jvm.internal.g0.o(r2, r0)
                return r2
        }

        @Override // androidx.sqlite.SQLiteStatement
        public int getColumnCount() {
                r1 = this;
                r1.throwIfClosed()
                r1.ensureCursor()
                android.database.Cursor r0 = r1.cursor
                if (r0 == 0) goto Lf
                int r0 = r0.getColumnCount()
                return r0
            Lf:
                r0 = 0
                return r0
        }

        @Override // androidx.sqlite.SQLiteStatement
        @org.jetbrains.annotations.NotNull
        public java.lang.String getColumnName(int r2) {
                r1 = this;
                r1.throwIfClosed()
                r1.ensureCursor()
                android.database.Cursor r0 = r1.cursor
                if (r0 == 0) goto L17
                r1.throwIfInvalidColumn(r0, r2)
                java.lang.String r2 = r0.getColumnName(r2)
                java.lang.String r0 = "getColumnName(...)"
                kotlin.jvm.internal.g0.o(r2, r0)
                return r2
            L17:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "Required value was null."
                r2.<init>(r0)
                throw r2
        }

        @Override // androidx.sqlite.SQLiteStatement
        public int getColumnType(int r3) {
                r2 = this;
                r2.throwIfClosed()
                r2.ensureCursor()
                android.database.Cursor r0 = r2.cursor
                if (r0 == 0) goto L14
                r2.throwIfInvalidColumn(r0, r3)
                androidx.room.driver.SupportSQLiteStatement$SupportAndroidSQLiteStatement$Companion r1 = androidx.room.driver.SupportSQLiteStatement.SupportAndroidSQLiteStatement.Companion
                int r3 = androidx.room.driver.SupportSQLiteStatement.SupportAndroidSQLiteStatement.Companion.access$getDataType(r1, r0, r3)
                return r3
            L14:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "Required value was null."
                r3.<init>(r0)
                throw r3
        }

        @Override // androidx.sqlite.SQLiteStatement
        public double getDouble(int r3) {
                r2 = this;
                r2.throwIfClosed()
                android.database.Cursor r0 = r2.throwIfNoRow()
                r2.throwIfInvalidColumn(r0, r3)
                double r0 = r0.getDouble(r3)
                return r0
        }

        @Override // androidx.sqlite.SQLiteStatement
        public long getLong(int r3) {
                r2 = this;
                r2.throwIfClosed()
                android.database.Cursor r0 = r2.throwIfNoRow()
                r2.throwIfInvalidColumn(r0, r3)
                long r0 = r0.getLong(r3)
                return r0
        }

        @Override // androidx.sqlite.SQLiteStatement
        @org.jetbrains.annotations.NotNull
        public java.lang.String getText(int r2) {
                r1 = this;
                r1.throwIfClosed()
                android.database.Cursor r0 = r1.throwIfNoRow()
                r1.throwIfInvalidColumn(r0, r2)
                java.lang.String r2 = r0.getString(r2)
                java.lang.String r0 = "getString(...)"
                kotlin.jvm.internal.g0.o(r2, r0)
                return r2
        }

        @Override // androidx.sqlite.SQLiteStatement
        public boolean isNull(int r2) {
                r1 = this;
                r1.throwIfClosed()
                android.database.Cursor r0 = r1.throwIfNoRow()
                r1.throwIfInvalidColumn(r0, r2)
                boolean r2 = r0.isNull(r2)
                return r2
        }

        @Override // androidx.sqlite.SQLiteStatement
        public void reset() {
                r1 = this;
                r1.throwIfClosed()
                android.database.Cursor r0 = r1.cursor
                if (r0 == 0) goto La
                r0.close()
            La:
                r0 = 0
                r1.cursor = r0
                return
        }

        @Override // androidx.sqlite.SQLiteStatement
        public boolean step() {
                r2 = this;
                r2.throwIfClosed()
                r2.ensureCursor()
                android.database.Cursor r0 = r2.cursor
                if (r0 == 0) goto Lf
                boolean r0 = r0.moveToNext()
                return r0
            Lf:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Required value was null."
                r0.<init>(r1)
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class SupportOtherAndroidSQLiteStatement extends androidx.room.driver.SupportSQLiteStatement {

        @org.jetbrains.annotations.NotNull
        private final androidx.sqlite.db.SupportSQLiteStatement delegate;

        public SupportOtherAndroidSQLiteStatement(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteDatabase r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "db"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "sql"
                kotlin.jvm.internal.g0.p(r3, r0)
                r0 = 0
                r1.<init>(r2, r3, r0)
                androidx.sqlite.db.SupportSQLiteStatement r2 = r2.compileStatement(r3)
                r1.delegate = r2
                return
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindBlob */
        public void mo84bindBlob(int r2, @org.jetbrains.annotations.NotNull byte[] r3) {
                r1 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.g0.p(r3, r0)
                r1.throwIfClosed()
                androidx.sqlite.db.SupportSQLiteStatement r0 = r1.delegate
                r0.bindBlob(r2, r3)
                return
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindDouble */
        public void mo85bindDouble(int r2, double r3) {
                r1 = this;
                r1.throwIfClosed()
                androidx.sqlite.db.SupportSQLiteStatement r0 = r1.delegate
                r0.bindDouble(r2, r3)
                return
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindLong */
        public void mo86bindLong(int r2, long r3) {
                r1 = this;
                r1.throwIfClosed()
                androidx.sqlite.db.SupportSQLiteStatement r0 = r1.delegate
                r0.bindLong(r2, r3)
                return
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindNull */
        public void mo87bindNull(int r2) {
                r1 = this;
                r1.throwIfClosed()
                androidx.sqlite.db.SupportSQLiteStatement r0 = r1.delegate
                r0.bindNull(r2)
                return
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindText */
        public void mo88bindText(int r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.g0.p(r3, r0)
                r1.throwIfClosed()
                androidx.sqlite.db.SupportSQLiteStatement r0 = r1.delegate
                r0.bindString(r2, r3)
                return
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: clearBindings */
        public void mo89clearBindings() {
                r1 = this;
                r1.throwIfClosed()
                androidx.sqlite.db.SupportSQLiteStatement r0 = r1.delegate
                r0.clearBindings()
                return
        }

        @Override // androidx.sqlite.SQLiteStatement, java.lang.AutoCloseable
        public void close() {
                r1 = this;
                androidx.sqlite.db.SupportSQLiteStatement r0 = r1.delegate
                r0.close()
                r0 = 1
                r1.setClosed(r0)
                return
        }

        @Override // androidx.sqlite.SQLiteStatement
        @org.jetbrains.annotations.NotNull
        public byte[] getBlob(int r2) {
                r1 = this;
                r1.throwIfClosed()
                r2 = 21
                java.lang.String r0 = "no row"
                androidx.sqlite.SQLite.throwSQLiteException(r2, r0)
                kotlin.KotlinNothingValueException r2 = new kotlin.KotlinNothingValueException
                r2.<init>()
                throw r2
        }

        @Override // androidx.sqlite.SQLiteStatement
        public int getColumnCount() {
                r1 = this;
                r1.throwIfClosed()
                r0 = 0
                return r0
        }

        @Override // androidx.sqlite.SQLiteStatement
        @org.jetbrains.annotations.NotNull
        public java.lang.String getColumnName(int r2) {
                r1 = this;
                r1.throwIfClosed()
                r2 = 21
                java.lang.String r0 = "no row"
                androidx.sqlite.SQLite.throwSQLiteException(r2, r0)
                kotlin.KotlinNothingValueException r2 = new kotlin.KotlinNothingValueException
                r2.<init>()
                throw r2
        }

        @Override // androidx.sqlite.SQLiteStatement
        public int getColumnType(int r2) {
                r1 = this;
                r1.throwIfClosed()
                r2 = 21
                java.lang.String r0 = "no row"
                androidx.sqlite.SQLite.throwSQLiteException(r2, r0)
                kotlin.KotlinNothingValueException r2 = new kotlin.KotlinNothingValueException
                r2.<init>()
                throw r2
        }

        @Override // androidx.sqlite.SQLiteStatement
        public double getDouble(int r2) {
                r1 = this;
                r1.throwIfClosed()
                r2 = 21
                java.lang.String r0 = "no row"
                androidx.sqlite.SQLite.throwSQLiteException(r2, r0)
                kotlin.KotlinNothingValueException r2 = new kotlin.KotlinNothingValueException
                r2.<init>()
                throw r2
        }

        @Override // androidx.sqlite.SQLiteStatement
        public long getLong(int r2) {
                r1 = this;
                r1.throwIfClosed()
                r2 = 21
                java.lang.String r0 = "no row"
                androidx.sqlite.SQLite.throwSQLiteException(r2, r0)
                kotlin.KotlinNothingValueException r2 = new kotlin.KotlinNothingValueException
                r2.<init>()
                throw r2
        }

        @Override // androidx.sqlite.SQLiteStatement
        @org.jetbrains.annotations.NotNull
        public java.lang.String getText(int r2) {
                r1 = this;
                r1.throwIfClosed()
                r2 = 21
                java.lang.String r0 = "no row"
                androidx.sqlite.SQLite.throwSQLiteException(r2, r0)
                kotlin.KotlinNothingValueException r2 = new kotlin.KotlinNothingValueException
                r2.<init>()
                throw r2
        }

        @Override // androidx.sqlite.SQLiteStatement
        public boolean isNull(int r2) {
                r1 = this;
                r1.throwIfClosed()
                r2 = 21
                java.lang.String r0 = "no row"
                androidx.sqlite.SQLite.throwSQLiteException(r2, r0)
                kotlin.KotlinNothingValueException r2 = new kotlin.KotlinNothingValueException
                r2.<init>()
                throw r2
        }

        @Override // androidx.sqlite.SQLiteStatement
        public void reset() {
                r0 = this;
                return
        }

        @Override // androidx.sqlite.SQLiteStatement
        public boolean step() {
                r1 = this;
                r1.throwIfClosed()
                androidx.sqlite.db.SupportSQLiteStatement r0 = r1.delegate
                r0.execute()
                r0 = 0
                return r0
        }
    }

    static {
            androidx.room.driver.SupportSQLiteStatement$Companion r0 = new androidx.room.driver.SupportSQLiteStatement$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.room.driver.SupportSQLiteStatement.Companion = r0
            return
    }

    private SupportSQLiteStatement(androidx.sqlite.db.SupportSQLiteDatabase r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.db = r1
            r0.sql = r2
            return
    }

    public /* synthetic */ SupportSQLiteStatement(androidx.sqlite.db.SupportSQLiteDatabase r1, java.lang.String r2, kotlin.jvm.internal.v r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // androidx.sqlite.SQLiteStatement
    public /* synthetic */ void bindBoolean(int r1, boolean r2) {
            r0 = this;
            f.a.a(r0, r1, r2)
            return
    }

    @Override // androidx.sqlite.SQLiteStatement
    public /* synthetic */ void bindFloat(int r1, float r2) {
            r0 = this;
            f.a.b(r0, r1, r2)
            return
    }

    @Override // androidx.sqlite.SQLiteStatement
    public /* synthetic */ void bindInt(int r1, int r2) {
            r0 = this;
            f.a.c(r0, r1, r2)
            return
    }

    @Override // androidx.sqlite.SQLiteStatement
    public /* synthetic */ boolean getBoolean(int r1) {
            r0 = this;
            boolean r1 = f.a.d(r0, r1)
            return r1
    }

    @Override // androidx.sqlite.SQLiteStatement
    public /* synthetic */ java.util.List getColumnNames() {
            r1 = this;
            java.util.List r0 = f.a.e(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    protected final androidx.sqlite.db.SupportSQLiteDatabase getDb() {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r1.db
            return r0
    }

    @Override // androidx.sqlite.SQLiteStatement
    public /* synthetic */ float getFloat(int r1) {
            r0 = this;
            float r1 = f.a.f(r0, r1)
            return r1
    }

    @Override // androidx.sqlite.SQLiteStatement
    public /* synthetic */ int getInt(int r1) {
            r0 = this;
            int r1 = f.a.g(r0, r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    protected final java.lang.String getSql() {
            r1 = this;
            java.lang.String r0 = r1.sql
            return r0
    }

    protected final boolean isClosed() {
            r1 = this;
            boolean r0 = r1.isClosed
            return r0
    }

    protected final void setClosed(boolean r1) {
            r0 = this;
            r0.isClosed = r1
            return
    }

    protected final void throwIfClosed() {
            r2 = this;
            boolean r0 = r2.isClosed
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 21
            java.lang.String r1 = "statement is closed"
            androidx.sqlite.SQLite.throwSQLiteException(r0, r1)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }
}
