package androidx.sqlite.db.framework;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nFrameworkSQLiteDatabase.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrameworkSQLiteDatabase.android.kt\nandroidx/sqlite/db/framework/FrameworkSQLiteDatabase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,369:1\n1#2:370\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class FrameworkSQLiteDatabase implements androidx.sqlite.db.SupportSQLiteDatabase {

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String[] CONFLICT_VALUES = null;

    @org.jetbrains.annotations.NotNull
    public static final androidx.sqlite.db.framework.FrameworkSQLiteDatabase.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String[] EMPTY_STRING_ARRAY = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.s<java.lang.reflect.Method> beginTransactionMethod$delegate = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.s<java.lang.reflect.Method> getThreadSessionMethod$delegate = null;

    @org.jetbrains.annotations.NotNull
    private final android.database.sqlite.SQLiteDatabase delegate;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(30)
    public static final class Api30Impl {

        @org.jetbrains.annotations.NotNull
        public static final androidx.sqlite.db.framework.FrameworkSQLiteDatabase.Api30Impl INSTANCE = null;

        static {
                androidx.sqlite.db.framework.FrameworkSQLiteDatabase$Api30Impl r0 = new androidx.sqlite.db.framework.FrameworkSQLiteDatabase$Api30Impl
                r0.<init>()
                androidx.sqlite.db.framework.FrameworkSQLiteDatabase.Api30Impl.INSTANCE = r0
                return
        }

        private Api30Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public final void execPerConnectionSQL(@org.jetbrains.annotations.NotNull android.database.sqlite.SQLiteDatabase r2, @org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.Nullable java.lang.Object[] r4) {
                r1 = this;
                java.lang.String r0 = "sQLiteDatabase"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "sql"
                kotlin.jvm.internal.g0.p(r3, r0)
                r2.execPerConnectionSQL(r3, r4)
                return
        }
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

        public static final /* synthetic */ java.lang.reflect.Method access$getBeginTransactionMethod(androidx.sqlite.db.framework.FrameworkSQLiteDatabase.Companion r0) {
                java.lang.reflect.Method r0 = r0.getBeginTransactionMethod()
                return r0
        }

        public static final /* synthetic */ java.lang.reflect.Method access$getGetThreadSessionMethod(androidx.sqlite.db.framework.FrameworkSQLiteDatabase.Companion r0) {
                java.lang.reflect.Method r0 = r0.getGetThreadSessionMethod()
                return r0
        }

        private final java.lang.reflect.Method getBeginTransactionMethod() {
                r1 = this;
                kotlin.s r0 = androidx.sqlite.db.framework.FrameworkSQLiteDatabase.access$getBeginTransactionMethod$delegate$cp()
                java.lang.Object r0 = r0.getValue()
                java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
                return r0
        }

        private final java.lang.reflect.Method getGetThreadSessionMethod() {
                r1 = this;
                kotlin.s r0 = androidx.sqlite.db.framework.FrameworkSQLiteDatabase.access$getGetThreadSessionMethod$delegate$cp()
                java.lang.Object r0 = r0.getValue()
                java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
                return r0
        }
    }

    static {
            androidx.sqlite.db.framework.FrameworkSQLiteDatabase$Companion r0 = new androidx.sqlite.db.framework.FrameworkSQLiteDatabase$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.sqlite.db.framework.FrameworkSQLiteDatabase.Companion = r0
            java.lang.String r6 = " OR IGNORE "
            java.lang.String r7 = " OR REPLACE "
            java.lang.String r2 = ""
            java.lang.String r3 = " OR ROLLBACK "
            java.lang.String r4 = " OR ABORT "
            java.lang.String r5 = " OR FAIL "
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r5, r6, r7}
            androidx.sqlite.db.framework.FrameworkSQLiteDatabase.CONFLICT_VALUES = r0
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            androidx.sqlite.db.framework.FrameworkSQLiteDatabase.EMPTY_STRING_ARRAY = r0
            kotlin.LazyThreadSafetyMode r0 = kotlin.LazyThreadSafetyMode.NONE
            androidx.sqlite.db.framework.d r1 = new androidx.sqlite.db.framework.d
            r1.<init>()
            kotlin.s r1 = kotlin.t.b(r0, r1)
            androidx.sqlite.db.framework.FrameworkSQLiteDatabase.getThreadSessionMethod$delegate = r1
            androidx.sqlite.db.framework.e r1 = new androidx.sqlite.db.framework.e
            r1.<init>()
            kotlin.s r0 = kotlin.t.b(r0, r1)
            androidx.sqlite.db.framework.FrameworkSQLiteDatabase.beginTransactionMethod$delegate = r0
            return
    }

    public FrameworkSQLiteDatabase(@org.jetbrains.annotations.NotNull android.database.sqlite.SQLiteDatabase r2) {
            r1 = this;
            java.lang.String r0 = "delegate"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.delegate = r2
            return
    }

    public static /* synthetic */ java.lang.reflect.Method a() {
            java.lang.reflect.Method r0 = beginTransactionMethod_delegate$lambda$8()
            return r0
    }

    public static final /* synthetic */ kotlin.s access$getBeginTransactionMethod$delegate$cp() {
            kotlin.s<java.lang.reflect.Method> r0 = androidx.sqlite.db.framework.FrameworkSQLiteDatabase.beginTransactionMethod$delegate
            return r0
    }

    public static final /* synthetic */ kotlin.s access$getGetThreadSessionMethod$delegate$cp() {
            kotlin.s<java.lang.reflect.Method> r0 = androidx.sqlite.db.framework.FrameworkSQLiteDatabase.getThreadSessionMethod$delegate
            return r0
    }

    public static /* synthetic */ android.database.Cursor b(kotlin.jvm.functions.Function4 r0, android.database.sqlite.SQLiteDatabase r1, android.database.sqlite.SQLiteCursorDriver r2, java.lang.String r3, android.database.sqlite.SQLiteQuery r4) {
            android.database.Cursor r0 = query$lambda$1(r0, r1, r2, r3, r4)
            return r0
    }

    private static final java.lang.reflect.Method beginTransactionMethod_delegate$lambda$8() {
            r0 = 0
            androidx.sqlite.db.framework.FrameworkSQLiteDatabase$Companion r1 = androidx.sqlite.db.framework.FrameworkSQLiteDatabase.Companion     // Catch: java.lang.Throwable -> L2a
            java.lang.reflect.Method r1 = androidx.sqlite.db.framework.FrameworkSQLiteDatabase.Companion.access$getGetThreadSessionMethod(r1)     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L2a
            java.lang.Class r1 = r1.getReturnType()     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L2a
            java.lang.String r2 = "beginTransaction"
            r3 = 4
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L2a
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L2a
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L2a
            java.lang.Class<android.database.sqlite.SQLiteTransactionListener> r5 = android.database.sqlite.SQLiteTransactionListener.class
            r6 = 1
            r3[r6] = r5     // Catch: java.lang.Throwable -> L2a
            r5 = 2
            r3[r5] = r4     // Catch: java.lang.Throwable -> L2a
            java.lang.Class<android.os.CancellationSignal> r4 = android.os.CancellationSignal.class
            r5 = 3
            r3[r5] = r4     // Catch: java.lang.Throwable -> L2a
            java.lang.reflect.Method r0 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.Throwable -> L2a
        L2a:
            return r0
    }

    public static /* synthetic */ android.database.Cursor c(androidx.sqlite.db.SupportSQLiteQuery r0, android.database.sqlite.SQLiteDatabase r1, android.database.sqlite.SQLiteCursorDriver r2, java.lang.String r3, android.database.sqlite.SQLiteQuery r4) {
            android.database.Cursor r0 = query$lambda$2(r0, r1, r2, r3, r4)
            return r0
    }

    public static /* synthetic */ java.lang.reflect.Method d() {
            java.lang.reflect.Method r0 = getThreadSessionMethod_delegate$lambda$7()
            return r0
    }

    public static /* synthetic */ android.database.sqlite.SQLiteCursor e(androidx.sqlite.db.SupportSQLiteQuery r0, android.database.sqlite.SQLiteDatabase r1, android.database.sqlite.SQLiteCursorDriver r2, java.lang.String r3, android.database.sqlite.SQLiteQuery r4) {
            android.database.sqlite.SQLiteCursor r0 = query$lambda$0(r0, r1, r2, r3, r4)
            return r0
    }

    private static final java.lang.reflect.Method getThreadSessionMethod_delegate$lambda$7() {
            r0 = 0
            java.lang.Class<android.database.sqlite.SQLiteDatabase> r1 = android.database.sqlite.SQLiteDatabase.class
            java.lang.String r2 = "getThreadSession"
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r0)     // Catch: java.lang.Throwable -> Le
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            return r0
    }

    @android.annotation.SuppressLint({"BanUncheckedReflection"})
    private final void internalBeginTransactionWithListenerReadOnly(android.database.sqlite.SQLiteTransactionListener r7) {
            r6 = this;
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            androidx.sqlite.db.framework.FrameworkSQLiteDatabase$Companion r2 = androidx.sqlite.db.framework.FrameworkSQLiteDatabase.Companion
            java.lang.reflect.Method r3 = androidx.sqlite.db.framework.FrameworkSQLiteDatabase.Companion.access$getBeginTransactionMethod(r2)
            if (r3 == 0) goto L44
            java.lang.reflect.Method r3 = androidx.sqlite.db.framework.FrameworkSQLiteDatabase.Companion.access$getGetThreadSessionMethod(r2)
            if (r3 == 0) goto L44
            java.lang.reflect.Method r3 = androidx.sqlite.db.framework.FrameworkSQLiteDatabase.Companion.access$getBeginTransactionMethod(r2)
            kotlin.jvm.internal.g0.m(r3)
            java.lang.reflect.Method r2 = androidx.sqlite.db.framework.FrameworkSQLiteDatabase.Companion.access$getGetThreadSessionMethod(r2)
            kotlin.jvm.internal.g0.m(r2)
            android.database.sqlite.SQLiteDatabase r4 = r6.delegate
            r5 = 0
            java.lang.Object r2 = r2.invoke(r4, r5)
            if (r2 == 0) goto L3c
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r0] = r1
            r0 = 1
            r4[r0] = r7
            r7 = 2
            r4[r7] = r1
            r7 = 3
            r4[r7] = r5
            r3.invoke(r2, r4)
            return
        L3c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Required value was null."
            r7.<init>(r0)
            throw r7
        L44:
            if (r7 == 0) goto L4a
            r6.beginTransactionWithListener(r7)
            return
        L4a:
            r6.beginTransaction()
            return
    }

    private static final android.database.sqlite.SQLiteCursor query$lambda$0(androidx.sqlite.db.SupportSQLiteQuery r0, android.database.sqlite.SQLiteDatabase r1, android.database.sqlite.SQLiteCursorDriver r2, java.lang.String r3, android.database.sqlite.SQLiteQuery r4) {
            androidx.sqlite.db.framework.FrameworkSQLiteProgram r1 = new androidx.sqlite.db.framework.FrameworkSQLiteProgram
            kotlin.jvm.internal.g0.m(r4)
            r1.<init>(r4)
            r0.bindTo(r1)
            android.database.sqlite.SQLiteCursor r0 = new android.database.sqlite.SQLiteCursor
            r0.<init>(r2, r3, r4)
            return r0
    }

    private static final android.database.Cursor query$lambda$1(kotlin.jvm.functions.Function4 r0, android.database.sqlite.SQLiteDatabase r1, android.database.sqlite.SQLiteCursorDriver r2, java.lang.String r3, android.database.sqlite.SQLiteQuery r4) {
            java.lang.Object r0 = r0.invoke(r1, r2, r3, r4)
            android.database.Cursor r0 = (android.database.Cursor) r0
            return r0
    }

    private static final android.database.Cursor query$lambda$2(androidx.sqlite.db.SupportSQLiteQuery r0, android.database.sqlite.SQLiteDatabase r1, android.database.sqlite.SQLiteCursorDriver r2, java.lang.String r3, android.database.sqlite.SQLiteQuery r4) {
            androidx.sqlite.db.framework.FrameworkSQLiteProgram r1 = new androidx.sqlite.db.framework.FrameworkSQLiteProgram
            kotlin.jvm.internal.g0.m(r4)
            r1.<init>(r4)
            r0.bindTo(r1)
            android.database.sqlite.SQLiteCursor r0 = new android.database.sqlite.SQLiteCursor
            r0.<init>(r2, r3, r4)
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransaction() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.delegate
            r0.beginTransaction()
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionNonExclusive() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.delegate
            r0.beginTransactionNonExclusive()
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionReadOnly() {
            r1 = this;
            r0 = 0
            r1.internalBeginTransactionWithListenerReadOnly(r0)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionWithListener(@org.jetbrains.annotations.NotNull android.database.sqlite.SQLiteTransactionListener r2) {
            r1 = this;
            java.lang.String r0 = "transactionListener"
            kotlin.jvm.internal.g0.p(r2, r0)
            android.database.sqlite.SQLiteDatabase r0 = r1.delegate
            r0.beginTransactionWithListener(r2)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionWithListenerNonExclusive(@org.jetbrains.annotations.NotNull android.database.sqlite.SQLiteTransactionListener r2) {
            r1 = this;
            java.lang.String r0 = "transactionListener"
            kotlin.jvm.internal.g0.p(r2, r0)
            android.database.sqlite.SQLiteDatabase r0 = r1.delegate
            r0.beginTransactionWithListenerNonExclusive(r2)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionWithListenerReadOnly(@org.jetbrains.annotations.NotNull android.database.sqlite.SQLiteTransactionListener r2) {
            r1 = this;
            java.lang.String r0 = "transactionListener"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.internalBeginTransactionWithListenerReadOnly(r2)
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.delegate
            r0.close()
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @org.jetbrains.annotations.NotNull
    public androidx.sqlite.db.SupportSQLiteStatement compileStatement(@org.jetbrains.annotations.NotNull java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "sql"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.sqlite.db.framework.FrameworkSQLiteStatement r0 = new androidx.sqlite.db.framework.FrameworkSQLiteStatement
            android.database.sqlite.SQLiteDatabase r1 = r2.delegate
            android.database.sqlite.SQLiteStatement r3 = r1.compileStatement(r3)
            java.lang.String r1 = "compileStatement(...)"
            kotlin.jvm.internal.g0.o(r3, r1)
            r0.<init>(r3)
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int delete(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.Nullable java.lang.String r4, @org.jetbrains.annotations.Nullable java.lang.Object[] r5) {
            r2 = this;
            java.lang.String r0 = "table"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "DELETE FROM "
            r0.append(r1)
            r0.append(r3)
            if (r4 == 0) goto L23
            int r3 = r4.length()
            if (r3 != 0) goto L1b
            goto L23
        L1b:
            java.lang.String r3 = " WHERE "
            r0.append(r3)
            r0.append(r4)
        L23:
            java.lang.String r3 = r0.toString()
            androidx.sqlite.db.SupportSQLiteStatement r3 = r2.compileStatement(r3)
            androidx.sqlite.db.SimpleSQLiteQuery$Companion r4 = androidx.sqlite.db.SimpleSQLiteQuery.Companion
            r4.bind(r3, r5)
            int r3 = r3.executeUpdateDelete()
            return r3
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void disableWriteAheadLogging() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.delegate
            r0.disableWriteAheadLogging()
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean enableWriteAheadLogging() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.delegate
            boolean r0 = r0.enableWriteAheadLogging()
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void endTransaction() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.delegate
            r0.endTransaction()
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execPerConnectionSQL(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.Nullable java.lang.Object[] r4) {
            r2 = this;
            java.lang.String r0 = "sql"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L13
            androidx.sqlite.db.framework.FrameworkSQLiteDatabase$Api30Impl r0 = androidx.sqlite.db.framework.FrameworkSQLiteDatabase.Api30Impl.INSTANCE
            android.database.sqlite.SQLiteDatabase r1 = r2.delegate
            r0.execPerConnectionSQL(r1, r3, r4)
            return
        L13:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "execPerConnectionSQL is not supported on a SDK version lower than 30, current version is: "
            r4.append(r1)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execSQL(@org.jetbrains.annotations.NotNull java.lang.String r2) throws android.database.SQLException {
            r1 = this;
            java.lang.String r0 = "sql"
            kotlin.jvm.internal.g0.p(r2, r0)
            android.database.sqlite.SQLiteDatabase r0 = r1.delegate
            r0.execSQL(r2)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execSQL(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.Object[] r3) throws android.database.SQLException {
            r1 = this;
            java.lang.String r0 = "sql"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "bindArgs"
            kotlin.jvm.internal.g0.p(r3, r0)
            android.database.sqlite.SQLiteDatabase r0 = r1.delegate
            r0.execSQL(r2, r3)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @org.jetbrains.annotations.Nullable
    public java.util.List<android.util.Pair<java.lang.String, java.lang.String>> getAttachedDbs() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.delegate
            java.util.List r0 = r0.getAttachedDbs()
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long getMaximumSize() {
            r2 = this;
            android.database.sqlite.SQLiteDatabase r0 = r2.delegate
            long r0 = r0.getMaximumSize()
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long getPageSize() {
            r2 = this;
            android.database.sqlite.SQLiteDatabase r0 = r2.delegate
            long r0 = r0.getPageSize()
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @org.jetbrains.annotations.Nullable
    public java.lang.String getPath() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.delegate
            java.lang.String r0 = r0.getPath()
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int getVersion() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.delegate
            int r0 = r0.getVersion()
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean inTransaction() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.delegate
            boolean r0 = r0.inTransaction()
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long insert(@org.jetbrains.annotations.NotNull java.lang.String r3, int r4, @org.jetbrains.annotations.NotNull android.content.ContentValues r5) throws android.database.SQLException {
            r2 = this;
            java.lang.String r0 = "table"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "values"
            kotlin.jvm.internal.g0.p(r5, r0)
            android.database.sqlite.SQLiteDatabase r0 = r2.delegate
            r1 = 0
            long r3 = r0.insertWithOnConflict(r3, r1, r5, r4)
            return r3
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isDatabaseIntegrityOk() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.delegate
            boolean r0 = r0.isDatabaseIntegrityOk()
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isDbLockedByCurrentThread() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.delegate
            boolean r0 = r0.isDbLockedByCurrentThread()
            return r0
    }

    public final boolean isDelegate(@org.jetbrains.annotations.NotNull android.database.sqlite.SQLiteDatabase r2) {
            r1 = this;
            java.lang.String r0 = "sqLiteDatabase"
            kotlin.jvm.internal.g0.p(r2, r0)
            android.database.sqlite.SQLiteDatabase r0 = r1.delegate
            boolean r2 = kotlin.jvm.internal.g0.g(r0, r2)
            return r2
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isExecPerConnectionSQLSupported() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isOpen() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.delegate
            boolean r0 = r0.isOpen()
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isReadOnly() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.delegate
            boolean r0 = r0.isReadOnly()
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isWriteAheadLoggingEnabled() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.delegate
            boolean r0 = r0.isWriteAheadLoggingEnabled()
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean needUpgrade(int r2) {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.delegate
            boolean r2 = r0.needUpgrade(r2)
            return r2
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @org.jetbrains.annotations.NotNull
    public android.database.Cursor query(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteQuery r5) {
            r4 = this;
            java.lang.String r0 = "query"
            kotlin.jvm.internal.g0.p(r5, r0)
            androidx.sqlite.db.framework.b r0 = new androidx.sqlite.db.framework.b
            r0.<init>(r5)
            android.database.sqlite.SQLiteDatabase r1 = r4.delegate
            androidx.sqlite.db.framework.c r2 = new androidx.sqlite.db.framework.c
            r2.<init>(r0)
            java.lang.String r5 = r5.getSql()
            java.lang.String[] r0 = androidx.sqlite.db.framework.FrameworkSQLiteDatabase.EMPTY_STRING_ARRAY
            r3 = 0
            android.database.Cursor r5 = r1.rawQueryWithFactory(r2, r5, r0, r3)
            java.lang.String r0 = "rawQueryWithFactory(...)"
            kotlin.jvm.internal.g0.o(r5, r0)
            return r5
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @org.jetbrains.annotations.NotNull
    public android.database.Cursor query(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteQuery r8, @org.jetbrains.annotations.Nullable android.os.CancellationSignal r9) {
            r7 = this;
            java.lang.String r0 = "query"
            kotlin.jvm.internal.g0.p(r8, r0)
            android.database.sqlite.SQLiteDatabase r1 = r7.delegate
            androidx.sqlite.db.framework.a r2 = new androidx.sqlite.db.framework.a
            r2.<init>(r8)
            java.lang.String r3 = r8.getSql()
            java.lang.String[] r4 = androidx.sqlite.db.framework.FrameworkSQLiteDatabase.EMPTY_STRING_ARRAY
            kotlin.jvm.internal.g0.m(r9)
            r5 = 0
            r6 = r9
            android.database.Cursor r8 = r1.rawQueryWithFactory(r2, r3, r4, r5, r6)
            java.lang.String r9 = "rawQueryWithFactory(...)"
            kotlin.jvm.internal.g0.o(r8, r9)
            return r8
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @org.jetbrains.annotations.NotNull
    public android.database.Cursor query(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "query"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.sqlite.db.SimpleSQLiteQuery r0 = new androidx.sqlite.db.SimpleSQLiteQuery
            r0.<init>(r2)
            android.database.Cursor r2 = r1.query(r0)
            return r2
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @org.jetbrains.annotations.NotNull
    public android.database.Cursor query(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.Object[] r3) {
            r1 = this;
            java.lang.String r0 = "query"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "bindArgs"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.sqlite.db.SimpleSQLiteQuery r0 = new androidx.sqlite.db.SimpleSQLiteQuery
            r0.<init>(r2, r3)
            android.database.Cursor r2 = r1.query(r0)
            return r2
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setForeignKeyConstraintsEnabled(boolean r2) {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.delegate
            r0.setForeignKeyConstraintsEnabled(r2)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setLocale(@org.jetbrains.annotations.NotNull java.util.Locale r2) {
            r1 = this;
            java.lang.String r0 = "locale"
            kotlin.jvm.internal.g0.p(r2, r0)
            android.database.sqlite.SQLiteDatabase r0 = r1.delegate
            r0.setLocale(r2)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setMaxSqlCacheSize(int r2) {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.delegate
            r0.setMaxSqlCacheSize(r2)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long setMaximumSize(long r2) {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.delegate
            r0.setMaximumSize(r2)
            android.database.sqlite.SQLiteDatabase r2 = r1.delegate
            long r2 = r2.getMaximumSize()
            return r2
    }

    /* renamed from: setMaximumSize, reason: collision with other method in class */
    public void m90setMaximumSize(long r2) {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.delegate
            r0.setMaximumSize(r2)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setPageSize(long r2) {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.delegate
            r0.setPageSize(r2)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setTransactionSuccessful() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.delegate
            r0.setTransactionSuccessful()
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setVersion(int r2) {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.delegate
            r0.setVersion(r2)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int update(@org.jetbrains.annotations.NotNull java.lang.String r7, int r8, @org.jetbrains.annotations.NotNull android.content.ContentValues r9, @org.jetbrains.annotations.Nullable java.lang.String r10, @org.jetbrains.annotations.Nullable java.lang.Object[] r11) {
            r6 = this;
            java.lang.String r0 = "table"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "values"
            kotlin.jvm.internal.g0.p(r9, r0)
            int r0 = r9.size()
            if (r0 == 0) goto L95
            int r0 = r9.size()
            if (r11 != 0) goto L19
            r1 = r0
            goto L1b
        L19:
            int r1 = r11.length
            int r1 = r1 + r0
        L1b:
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "UPDATE "
            r3.append(r4)
            java.lang.String[] r4 = androidx.sqlite.db.framework.FrameworkSQLiteDatabase.CONFLICT_VALUES
            r8 = r4[r8]
            r3.append(r8)
            r3.append(r7)
            java.lang.String r7 = " SET "
            r3.append(r7)
            java.util.Set r7 = r9.keySet()
            java.util.Iterator r7 = r7.iterator()
            r8 = 0
        L3f:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L67
            java.lang.Object r4 = r7.next()
            java.lang.String r4 = (java.lang.String) r4
            if (r8 <= 0) goto L50
            java.lang.String r5 = ","
            goto L52
        L50:
            java.lang.String r5 = ""
        L52:
            r3.append(r5)
            r3.append(r4)
            int r5 = r8 + 1
            java.lang.Object r4 = r9.get(r4)
            r2[r8] = r4
            java.lang.String r8 = "=?"
            r3.append(r8)
            r8 = r5
            goto L3f
        L67:
            if (r11 == 0) goto L75
            r7 = r0
        L6a:
            if (r7 >= r1) goto L75
            int r8 = r7 - r0
            r8 = r11[r8]
            r2[r7] = r8
            int r7 = r7 + 1
            goto L6a
        L75:
            boolean r7 = android.text.TextUtils.isEmpty(r10)
            if (r7 != 0) goto L83
            java.lang.String r7 = " WHERE "
            r3.append(r7)
            r3.append(r10)
        L83:
            java.lang.String r7 = r3.toString()
            androidx.sqlite.db.SupportSQLiteStatement r7 = r6.compileStatement(r7)
            androidx.sqlite.db.SimpleSQLiteQuery$Companion r8 = androidx.sqlite.db.SimpleSQLiteQuery.Companion
            r8.bind(r7, r2)
            int r7 = r7.executeUpdateDelete()
            return r7
        L95:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Empty values"
            r7.<init>(r8)
            throw r7
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean yieldIfContendedSafely() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.delegate
            boolean r0 = r0.yieldIfContendedSafely()
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean yieldIfContendedSafely(long r2) {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.delegate
            boolean r2 = r0.yieldIfContendedSafely(r2)
            return r2
    }
}
