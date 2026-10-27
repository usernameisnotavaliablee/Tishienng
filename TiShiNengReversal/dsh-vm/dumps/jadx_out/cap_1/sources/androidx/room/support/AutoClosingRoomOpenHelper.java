package androidx.room.support;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class AutoClosingRoomOpenHelper implements androidx.sqlite.db.SupportSQLiteOpenHelper, androidx.room.DelegatingOpenHelper {

    @org.jetbrains.annotations.NotNull
    private final androidx.room.support.AutoCloser autoCloser;

    @org.jetbrains.annotations.NotNull
    private final androidx.room.support.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase autoClosingDb;

    @org.jetbrains.annotations.NotNull
    private final androidx.sqlite.db.SupportSQLiteOpenHelper delegate;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class AutoClosingSupportSQLiteDatabase implements androidx.sqlite.db.SupportSQLiteDatabase {

        @org.jetbrains.annotations.NotNull
        private final androidx.room.support.AutoCloser autoCloser;

        public AutoClosingSupportSQLiteDatabase(@org.jetbrains.annotations.NotNull androidx.room.support.AutoCloser r2) {
                r1 = this;
                java.lang.String r0 = "autoCloser"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                r1.autoCloser = r2
                return
        }

        private static final java.lang.Object _set_pageSize_$lambda$3(long r1, androidx.sqlite.db.SupportSQLiteDatabase r3) {
                java.lang.String r0 = "db"
                kotlin.jvm.internal.g0.p(r3, r0)
                r3.setPageSize(r1)
                r1 = 0
                return r1
        }

        private static final kotlin.n1 _set_version_$lambda$1(int r1, androidx.sqlite.db.SupportSQLiteDatabase r2) {
                java.lang.String r0 = "db"
                kotlin.jvm.internal.g0.p(r2, r0)
                r2.setVersion(r1)
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }

        public static /* synthetic */ java.lang.Object a(androidx.sqlite.db.SupportSQLiteDatabase r0) {
                java.lang.Object r0 = pokeOpen$lambda$0(r0)
                return r0
        }

        public static /* synthetic */ long b(java.lang.String r0, int r1, android.content.ContentValues r2, androidx.sqlite.db.SupportSQLiteDatabase r3) {
                long r0 = insert$lambda$4(r0, r1, r2, r3)
                return r0
        }

        public static /* synthetic */ long c(long r0, androidx.sqlite.db.SupportSQLiteDatabase r2) {
                long r0 = setMaximumSize$lambda$2(r0, r2)
                return r0
        }

        public static /* synthetic */ kotlin.n1 d(java.util.Locale r0, androidx.sqlite.db.SupportSQLiteDatabase r1) {
                kotlin.n1 r0 = setLocale$lambda$10(r0, r1)
                return r0
        }

        private static final int delete$lambda$5(java.lang.String r1, java.lang.String r2, java.lang.Object[] r3, androidx.sqlite.db.SupportSQLiteDatabase r4) {
                java.lang.String r0 = "db"
                kotlin.jvm.internal.g0.p(r4, r0)
                int r1 = r4.delete(r1, r2, r3)
                return r1
        }

        public static /* synthetic */ int e(java.lang.String r0, java.lang.String r1, java.lang.Object[] r2, androidx.sqlite.db.SupportSQLiteDatabase r3) {
                int r0 = delete$lambda$5(r0, r1, r2, r3)
                return r0
        }

        private static final kotlin.n1 execSQL$lambda$7(java.lang.String r1, androidx.sqlite.db.SupportSQLiteDatabase r2) {
                java.lang.String r0 = "db"
                kotlin.jvm.internal.g0.p(r2, r0)
                r2.execSQL(r1)
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }

        private static final kotlin.n1 execSQL$lambda$8(java.lang.String r1, java.lang.Object[] r2, androidx.sqlite.db.SupportSQLiteDatabase r3) {
                java.lang.String r0 = "db"
                kotlin.jvm.internal.g0.p(r3, r0)
                r3.execSQL(r1, r2)
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }

        public static /* synthetic */ kotlin.n1 f(java.lang.String r0, java.lang.Object[] r1, androidx.sqlite.db.SupportSQLiteDatabase r2) {
                kotlin.n1 r0 = execSQL$lambda$8(r0, r1, r2)
                return r0
        }

        public static /* synthetic */ java.lang.Object g(long r0, androidx.sqlite.db.SupportSQLiteDatabase r2) {
                java.lang.Object r0 = _set_pageSize_$lambda$3(r0, r2)
                return r0
        }

        public static /* synthetic */ kotlin.n1 h(int r0, androidx.sqlite.db.SupportSQLiteDatabase r1) {
                kotlin.n1 r0 = setMaxSqlCacheSize$lambda$11(r0, r1)
                return r0
        }

        public static /* synthetic */ kotlin.n1 i(boolean r0, androidx.sqlite.db.SupportSQLiteDatabase r1) {
                kotlin.n1 r0 = setForeignKeyConstraintsEnabled$lambda$12(r0, r1)
                return r0
        }

        private static final long insert$lambda$4(java.lang.String r1, int r2, android.content.ContentValues r3, androidx.sqlite.db.SupportSQLiteDatabase r4) {
                java.lang.String r0 = "db"
                kotlin.jvm.internal.g0.p(r4, r0)
                long r1 = r4.insert(r1, r2, r3)
                return r1
        }

        public static /* synthetic */ kotlin.n1 j(int r0, androidx.sqlite.db.SupportSQLiteDatabase r1) {
                kotlin.n1 r0 = _set_version_$lambda$1(r0, r1)
                return r0
        }

        public static /* synthetic */ boolean k(int r0, androidx.sqlite.db.SupportSQLiteDatabase r1) {
                boolean r0 = needUpgrade$lambda$9(r0, r1)
                return r0
        }

        public static /* synthetic */ kotlin.n1 l(java.lang.String r0, androidx.sqlite.db.SupportSQLiteDatabase r1) {
                kotlin.n1 r0 = execSQL$lambda$7(r0, r1)
                return r0
        }

        public static /* synthetic */ int m(java.lang.String r0, int r1, android.content.ContentValues r2, java.lang.String r3, java.lang.Object[] r4, androidx.sqlite.db.SupportSQLiteDatabase r5) {
                int r0 = update$lambda$6(r0, r1, r2, r3, r4, r5)
                return r0
        }

        private static final boolean needUpgrade$lambda$9(int r1, androidx.sqlite.db.SupportSQLiteDatabase r2) {
                java.lang.String r0 = "db"
                kotlin.jvm.internal.g0.p(r2, r0)
                boolean r1 = r2.needUpgrade(r1)
                return r1
        }

        private static final java.lang.Object pokeOpen$lambda$0(androidx.sqlite.db.SupportSQLiteDatabase r1) {
                java.lang.String r0 = "it"
                kotlin.jvm.internal.g0.p(r1, r0)
                r1 = 0
                return r1
        }

        private static final kotlin.n1 setForeignKeyConstraintsEnabled$lambda$12(boolean r1, androidx.sqlite.db.SupportSQLiteDatabase r2) {
                java.lang.String r0 = "db"
                kotlin.jvm.internal.g0.p(r2, r0)
                r2.setForeignKeyConstraintsEnabled(r1)
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }

        private static final kotlin.n1 setLocale$lambda$10(java.util.Locale r1, androidx.sqlite.db.SupportSQLiteDatabase r2) {
                java.lang.String r0 = "db"
                kotlin.jvm.internal.g0.p(r2, r0)
                r2.setLocale(r1)
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }

        private static final kotlin.n1 setMaxSqlCacheSize$lambda$11(int r1, androidx.sqlite.db.SupportSQLiteDatabase r2) {
                java.lang.String r0 = "db"
                kotlin.jvm.internal.g0.p(r2, r0)
                r2.setMaxSqlCacheSize(r1)
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }

        private static final long setMaximumSize$lambda$2(long r1, androidx.sqlite.db.SupportSQLiteDatabase r3) {
                java.lang.String r0 = "db"
                kotlin.jvm.internal.g0.p(r3, r0)
                long r1 = r3.setMaximumSize(r1)
                return r1
        }

        private static final int update$lambda$6(java.lang.String r2, int r3, android.content.ContentValues r4, java.lang.String r5, java.lang.Object[] r6, androidx.sqlite.db.SupportSQLiteDatabase r7) {
                java.lang.String r0 = "db"
                kotlin.jvm.internal.g0.p(r7, r0)
                r1 = r3
                r3 = r2
                r2 = r7
                r7 = r6
                r6 = r5
                r5 = r4
                r4 = r1
                int r2 = r2.update(r3, r4, r5, r6, r7)
                return r2
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void beginTransaction() {
                r2 = this;
                androidx.room.support.AutoCloser r0 = r2.autoCloser
                androidx.sqlite.db.SupportSQLiteDatabase r0 = r0.incrementCountAndEnsureDbIsOpen()
                r0.beginTransaction()     // Catch: java.lang.Throwable -> La
                return
            La:
                r0 = move-exception
                androidx.room.support.AutoCloser r1 = r2.autoCloser
                r1.decrementCountAndScheduleClose()
                throw r0
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void beginTransactionNonExclusive() {
                r2 = this;
                androidx.room.support.AutoCloser r0 = r2.autoCloser
                androidx.sqlite.db.SupportSQLiteDatabase r0 = r0.incrementCountAndEnsureDbIsOpen()
                r0.beginTransactionNonExclusive()     // Catch: java.lang.Throwable -> La
                return
            La:
                r0 = move-exception
                androidx.room.support.AutoCloser r1 = r2.autoCloser
                r1.decrementCountAndScheduleClose()
                throw r0
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public /* synthetic */ void beginTransactionReadOnly() {
                r0 = this;
                g.a.a(r0)
                return
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void beginTransactionWithListener(@org.jetbrains.annotations.NotNull android.database.sqlite.SQLiteTransactionListener r2) {
                r1 = this;
                java.lang.String r0 = "transactionListener"
                kotlin.jvm.internal.g0.p(r2, r0)
                androidx.room.support.AutoCloser r0 = r1.autoCloser
                androidx.sqlite.db.SupportSQLiteDatabase r0 = r0.incrementCountAndEnsureDbIsOpen()
                r0.beginTransactionWithListener(r2)     // Catch: java.lang.Throwable -> Lf
                return
            Lf:
                r2 = move-exception
                androidx.room.support.AutoCloser r0 = r1.autoCloser
                r0.decrementCountAndScheduleClose()
                throw r2
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void beginTransactionWithListenerNonExclusive(@org.jetbrains.annotations.NotNull android.database.sqlite.SQLiteTransactionListener r2) {
                r1 = this;
                java.lang.String r0 = "transactionListener"
                kotlin.jvm.internal.g0.p(r2, r0)
                androidx.room.support.AutoCloser r0 = r1.autoCloser
                androidx.sqlite.db.SupportSQLiteDatabase r0 = r0.incrementCountAndEnsureDbIsOpen()
                r0.beginTransactionWithListenerNonExclusive(r2)     // Catch: java.lang.Throwable -> Lf
                return
            Lf:
                r2 = move-exception
                androidx.room.support.AutoCloser r0 = r1.autoCloser
                r0.decrementCountAndScheduleClose()
                throw r2
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public /* synthetic */ void beginTransactionWithListenerReadOnly(android.database.sqlite.SQLiteTransactionListener r1) {
                r0 = this;
                g.a.b(r0, r1)
                return
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r1 = this;
                androidx.room.support.AutoCloser r0 = r1.autoCloser
                r0.closeDatabaseIfOpen()
                return
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        @org.jetbrains.annotations.NotNull
        public androidx.sqlite.db.SupportSQLiteStatement compileStatement(@org.jetbrains.annotations.NotNull java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "sql"
                kotlin.jvm.internal.g0.p(r3, r0)
                androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteStatement r0 = new androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteStatement
                androidx.room.support.AutoCloser r1 = r2.autoCloser
                r0.<init>(r3, r1)
                return r0
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public int delete(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.Nullable java.lang.String r4, @org.jetbrains.annotations.Nullable java.lang.Object[] r5) {
                r2 = this;
                java.lang.String r0 = "table"
                kotlin.jvm.internal.g0.p(r3, r0)
                androidx.room.support.AutoCloser r0 = r2.autoCloser
                androidx.room.support.d r1 = new androidx.room.support.d
                r1.<init>(r3, r4, r5)
                java.lang.Object r3 = r0.executeRefCountingFunction(r1)
                java.lang.Number r3 = (java.lang.Number) r3
                int r3 = r3.intValue()
                return r3
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void disableWriteAheadLogging() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Enable/disable write ahead logging on the OpenHelper instead of on the database directly."
                r0.<init>(r1)
                throw r0
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean enableWriteAheadLogging() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Enable/disable write ahead logging on the OpenHelper instead of on the database directly."
                r0.<init>(r1)
                throw r0
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void endTransaction() {
                r2 = this;
                androidx.room.support.AutoCloser r0 = r2.autoCloser     // Catch: java.lang.Throwable -> L12
                androidx.sqlite.db.SupportSQLiteDatabase r0 = r0.getDelegateDatabase$room_runtime_release()     // Catch: java.lang.Throwable -> L12
                kotlin.jvm.internal.g0.m(r0)     // Catch: java.lang.Throwable -> L12
                r0.endTransaction()     // Catch: java.lang.Throwable -> L12
                androidx.room.support.AutoCloser r0 = r2.autoCloser
                r0.decrementCountAndScheduleClose()
                return
            L12:
                r0 = move-exception
                androidx.room.support.AutoCloser r1 = r2.autoCloser
                r1.decrementCountAndScheduleClose()
                throw r0
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public /* synthetic */ void execPerConnectionSQL(java.lang.String r1, java.lang.Object[] r2) {
                r0 = this;
                g.a.c(r0, r1, r2)
                return
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void execSQL(@org.jetbrains.annotations.NotNull java.lang.String r3) throws android.database.SQLException {
                r2 = this;
                java.lang.String r0 = "sql"
                kotlin.jvm.internal.g0.p(r3, r0)
                androidx.room.support.AutoCloser r0 = r2.autoCloser
                androidx.room.support.h r1 = new androidx.room.support.h
                r1.<init>(r3)
                r0.executeRefCountingFunction(r1)
                return
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void execSQL(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull java.lang.Object[] r4) throws android.database.SQLException {
                r2 = this;
                java.lang.String r0 = "sql"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "bindArgs"
                kotlin.jvm.internal.g0.p(r4, r0)
                androidx.room.support.AutoCloser r0 = r2.autoCloser
                androidx.room.support.i r1 = new androidx.room.support.i
                r1.<init>(r3, r4)
                r0.executeRefCountingFunction(r1)
                return
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        @org.jetbrains.annotations.Nullable
        public java.util.List<android.util.Pair<java.lang.String, java.lang.String>> getAttachedDbs() {
                r2 = this;
                androidx.room.support.AutoCloser r0 = r2.autoCloser
                androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$attachedDbs$1 r1 = androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$attachedDbs$1.INSTANCE
                java.lang.Object r0 = r0.executeRefCountingFunction(r1)
                java.util.List r0 = (java.util.List) r0
                return r0
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public long getMaximumSize() {
                r2 = this;
                androidx.room.support.AutoCloser r0 = r2.autoCloser
                androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$maximumSize$1 r1 = androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$maximumSize$1.INSTANCE
                java.lang.Object r0 = r0.executeRefCountingFunction(r1)
                java.lang.Number r0 = (java.lang.Number) r0
                long r0 = r0.longValue()
                return r0
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public long getPageSize() {
                r2 = this;
                androidx.room.support.AutoCloser r0 = r2.autoCloser
                androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pageSize$1 r1 = androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pageSize$1.INSTANCE
                java.lang.Object r0 = r0.executeRefCountingFunction(r1)
                java.lang.Number r0 = (java.lang.Number) r0
                long r0 = r0.longValue()
                return r0
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        @org.jetbrains.annotations.Nullable
        public java.lang.String getPath() {
                r2 = this;
                androidx.room.support.AutoCloser r0 = r2.autoCloser
                androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$path$1 r1 = androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$path$1.INSTANCE
                java.lang.Object r0 = r0.executeRefCountingFunction(r1)
                java.lang.String r0 = (java.lang.String) r0
                return r0
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public int getVersion() {
                r2 = this;
                androidx.room.support.AutoCloser r0 = r2.autoCloser
                androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$version$1 r1 = androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$version$1.INSTANCE
                java.lang.Object r0 = r0.executeRefCountingFunction(r1)
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                return r0
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean inTransaction() {
                r2 = this;
                androidx.room.support.AutoCloser r0 = r2.autoCloser
                androidx.sqlite.db.SupportSQLiteDatabase r0 = r0.getDelegateDatabase$room_runtime_release()
                if (r0 != 0) goto La
                r0 = 0
                return r0
            La:
                androidx.room.support.AutoCloser r0 = r2.autoCloser
                androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$inTransaction$1 r1 = androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$inTransaction$1.INSTANCE
                java.lang.Object r0 = r0.executeRefCountingFunction(r1)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                return r0
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public long insert(@org.jetbrains.annotations.NotNull java.lang.String r3, int r4, @org.jetbrains.annotations.NotNull android.content.ContentValues r5) throws android.database.SQLException {
                r2 = this;
                java.lang.String r0 = "table"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "values"
                kotlin.jvm.internal.g0.p(r5, r0)
                androidx.room.support.AutoCloser r0 = r2.autoCloser
                androidx.room.support.k r1 = new androidx.room.support.k
                r1.<init>(r3, r4, r5)
                java.lang.Object r3 = r0.executeRefCountingFunction(r1)
                java.lang.Number r3 = (java.lang.Number) r3
                long r3 = r3.longValue()
                return r3
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean isDatabaseIntegrityOk() {
                r2 = this;
                androidx.room.support.AutoCloser r0 = r2.autoCloser
                androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isDatabaseIntegrityOk$1 r1 = androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isDatabaseIntegrityOk$1.INSTANCE
                java.lang.Object r0 = r0.executeRefCountingFunction(r1)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                return r0
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean isDbLockedByCurrentThread() {
                r2 = this;
                androidx.room.support.AutoCloser r0 = r2.autoCloser
                androidx.sqlite.db.SupportSQLiteDatabase r0 = r0.getDelegateDatabase$room_runtime_release()
                if (r0 != 0) goto La
                r0 = 0
                return r0
            La:
                androidx.room.support.AutoCloser r0 = r2.autoCloser
                androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isDbLockedByCurrentThread$1 r1 = androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isDbLockedByCurrentThread$1.INSTANCE
                java.lang.Object r0 = r0.executeRefCountingFunction(r1)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                return r0
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public /* synthetic */ boolean isExecPerConnectionSQLSupported() {
                r1 = this;
                boolean r0 = g.a.d(r1)
                return r0
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean isOpen() {
                r1 = this;
                androidx.room.support.AutoCloser r0 = r1.autoCloser
                androidx.sqlite.db.SupportSQLiteDatabase r0 = r0.getDelegateDatabase$room_runtime_release()
                if (r0 == 0) goto Ld
                boolean r0 = r0.isOpen()
                return r0
            Ld:
                r0 = 0
                return r0
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean isReadOnly() {
                r2 = this;
                androidx.room.support.AutoCloser r0 = r2.autoCloser
                androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isReadOnly$1 r1 = androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isReadOnly$1.INSTANCE
                java.lang.Object r0 = r0.executeRefCountingFunction(r1)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                return r0
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean isWriteAheadLoggingEnabled() {
                r2 = this;
                androidx.room.support.AutoCloser r0 = r2.autoCloser
                androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isWriteAheadLoggingEnabled$1 r1 = androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isWriteAheadLoggingEnabled$1.INSTANCE
                java.lang.Object r0 = r0.executeRefCountingFunction(r1)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                return r0
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean needUpgrade(int r3) {
                r2 = this;
                androidx.room.support.AutoCloser r0 = r2.autoCloser
                androidx.room.support.m r1 = new androidx.room.support.m
                r1.<init>(r3)
                java.lang.Object r3 = r0.executeRefCountingFunction(r1)
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                boolean r3 = r3.booleanValue()
                return r3
        }

        public final void pokeOpen() {
                r2 = this;
                androidx.room.support.AutoCloser r0 = r2.autoCloser
                androidx.room.support.j r1 = new androidx.room.support.j
                r1.<init>()
                r0.executeRefCountingFunction(r1)
                return
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        @org.jetbrains.annotations.NotNull
        public android.database.Cursor query(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteQuery r3) {
                r2 = this;
                java.lang.String r0 = "query"
                kotlin.jvm.internal.g0.p(r3, r0)
                androidx.room.support.AutoCloser r0 = r2.autoCloser     // Catch: java.lang.Throwable -> L17
                androidx.sqlite.db.SupportSQLiteDatabase r0 = r0.incrementCountAndEnsureDbIsOpen()     // Catch: java.lang.Throwable -> L17
                android.database.Cursor r3 = r0.query(r3)     // Catch: java.lang.Throwable -> L17
                androidx.room.support.AutoClosingRoomOpenHelper$KeepAliveCursor r0 = new androidx.room.support.AutoClosingRoomOpenHelper$KeepAliveCursor
                androidx.room.support.AutoCloser r1 = r2.autoCloser
                r0.<init>(r3, r1)
                return r0
            L17:
                r3 = move-exception
                androidx.room.support.AutoCloser r0 = r2.autoCloser
                r0.decrementCountAndScheduleClose()
                throw r3
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        @androidx.annotation.RequiresApi(api = 24)
        @org.jetbrains.annotations.NotNull
        public android.database.Cursor query(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteQuery r2, @org.jetbrains.annotations.Nullable android.os.CancellationSignal r3) {
                r1 = this;
                java.lang.String r0 = "query"
                kotlin.jvm.internal.g0.p(r2, r0)
                androidx.room.support.AutoCloser r0 = r1.autoCloser     // Catch: java.lang.Throwable -> L17
                androidx.sqlite.db.SupportSQLiteDatabase r0 = r0.incrementCountAndEnsureDbIsOpen()     // Catch: java.lang.Throwable -> L17
                android.database.Cursor r2 = r0.query(r2, r3)     // Catch: java.lang.Throwable -> L17
                androidx.room.support.AutoClosingRoomOpenHelper$KeepAliveCursor r3 = new androidx.room.support.AutoClosingRoomOpenHelper$KeepAliveCursor
                androidx.room.support.AutoCloser r0 = r1.autoCloser
                r3.<init>(r2, r0)
                return r3
            L17:
                r2 = move-exception
                androidx.room.support.AutoCloser r3 = r1.autoCloser
                r3.decrementCountAndScheduleClose()
                throw r2
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        @org.jetbrains.annotations.NotNull
        public android.database.Cursor query(@org.jetbrains.annotations.NotNull java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "query"
                kotlin.jvm.internal.g0.p(r3, r0)
                androidx.room.support.AutoCloser r0 = r2.autoCloser     // Catch: java.lang.Throwable -> L17
                androidx.sqlite.db.SupportSQLiteDatabase r0 = r0.incrementCountAndEnsureDbIsOpen()     // Catch: java.lang.Throwable -> L17
                android.database.Cursor r3 = r0.query(r3)     // Catch: java.lang.Throwable -> L17
                androidx.room.support.AutoClosingRoomOpenHelper$KeepAliveCursor r0 = new androidx.room.support.AutoClosingRoomOpenHelper$KeepAliveCursor
                androidx.room.support.AutoCloser r1 = r2.autoCloser
                r0.<init>(r3, r1)
                return r0
            L17:
                r3 = move-exception
                androidx.room.support.AutoCloser r0 = r2.autoCloser
                r0.decrementCountAndScheduleClose()
                throw r3
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        @org.jetbrains.annotations.NotNull
        public android.database.Cursor query(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.Object[] r3) {
                r1 = this;
                java.lang.String r0 = "query"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "bindArgs"
                kotlin.jvm.internal.g0.p(r3, r0)
                androidx.room.support.AutoCloser r0 = r1.autoCloser     // Catch: java.lang.Throwable -> L1c
                androidx.sqlite.db.SupportSQLiteDatabase r0 = r0.incrementCountAndEnsureDbIsOpen()     // Catch: java.lang.Throwable -> L1c
                android.database.Cursor r2 = r0.query(r2, r3)     // Catch: java.lang.Throwable -> L1c
                androidx.room.support.AutoClosingRoomOpenHelper$KeepAliveCursor r3 = new androidx.room.support.AutoClosingRoomOpenHelper$KeepAliveCursor
                androidx.room.support.AutoCloser r0 = r1.autoCloser
                r3.<init>(r2, r0)
                return r3
            L1c:
                r2 = move-exception
                androidx.room.support.AutoCloser r3 = r1.autoCloser
                r3.decrementCountAndScheduleClose()
                throw r2
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void setForeignKeyConstraintsEnabled(boolean r3) {
                r2 = this;
                androidx.room.support.AutoCloser r0 = r2.autoCloser
                androidx.room.support.n r1 = new androidx.room.support.n
                r1.<init>(r3)
                r0.executeRefCountingFunction(r1)
                return
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void setLocale(@org.jetbrains.annotations.NotNull java.util.Locale r3) {
                r2 = this;
                java.lang.String r0 = "locale"
                kotlin.jvm.internal.g0.p(r3, r0)
                androidx.room.support.AutoCloser r0 = r2.autoCloser
                androidx.room.support.c r1 = new androidx.room.support.c
                r1.<init>(r3)
                r0.executeRefCountingFunction(r1)
                return
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void setMaxSqlCacheSize(int r3) {
                r2 = this;
                androidx.room.support.AutoCloser r0 = r2.autoCloser
                androidx.room.support.b r1 = new androidx.room.support.b
                r1.<init>(r3)
                r0.executeRefCountingFunction(r1)
                return
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public long setMaximumSize(long r3) {
                r2 = this;
                androidx.room.support.AutoCloser r0 = r2.autoCloser
                androidx.room.support.e r1 = new androidx.room.support.e
                r1.<init>(r3)
                java.lang.Object r3 = r0.executeRefCountingFunction(r1)
                java.lang.Number r3 = (java.lang.Number) r3
                long r3 = r3.longValue()
                return r3
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void setPageSize(long r3) {
                r2 = this;
                androidx.room.support.AutoCloser r0 = r2.autoCloser
                androidx.room.support.l r1 = new androidx.room.support.l
                r1.<init>(r3)
                r0.executeRefCountingFunction(r1)
                return
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void setTransactionSuccessful() {
                r1 = this;
                androidx.room.support.AutoCloser r0 = r1.autoCloser
                androidx.sqlite.db.SupportSQLiteDatabase r0 = r0.getDelegateDatabase$room_runtime_release()
                kotlin.jvm.internal.g0.m(r0)
                r0.setTransactionSuccessful()
                return
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void setVersion(int r3) {
                r2 = this;
                androidx.room.support.AutoCloser r0 = r2.autoCloser
                androidx.room.support.f r1 = new androidx.room.support.f
                r1.<init>(r3)
                r0.executeRefCountingFunction(r1)
                return
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public int update(@org.jetbrains.annotations.NotNull java.lang.String r8, int r9, @org.jetbrains.annotations.NotNull android.content.ContentValues r10, @org.jetbrains.annotations.Nullable java.lang.String r11, @org.jetbrains.annotations.Nullable java.lang.Object[] r12) {
                r7 = this;
                java.lang.String r0 = "table"
                kotlin.jvm.internal.g0.p(r8, r0)
                java.lang.String r0 = "values"
                kotlin.jvm.internal.g0.p(r10, r0)
                androidx.room.support.AutoCloser r0 = r7.autoCloser
                androidx.room.support.g r1 = new androidx.room.support.g
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                r6 = r12
                r1.<init>(r2, r3, r4, r5, r6)
                java.lang.Object r8 = r0.executeRefCountingFunction(r1)
                java.lang.Number r8 = (java.lang.Number) r8
                int r8 = r8.intValue()
                return r8
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean yieldIfContendedSafely() {
                r2 = this;
                androidx.room.support.AutoCloser r0 = r2.autoCloser
                androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$1 r1 = androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$1.INSTANCE
                java.lang.Object r0 = r0.executeRefCountingFunction(r1)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                return r0
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean yieldIfContendedSafely(long r1) {
                r0 = this;
                androidx.room.support.AutoCloser r1 = r0.autoCloser
                androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$2 r2 = androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$2.INSTANCE
                java.lang.Object r1 = r1.executeRefCountingFunction(r2)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class AutoClosingSupportSQLiteStatement implements androidx.sqlite.db.SupportSQLiteStatement {
        private static final int COLUMN_TYPE_BLOB = 4;
        private static final int COLUMN_TYPE_DOUBLE = 2;
        private static final int COLUMN_TYPE_LONG = 1;
        private static final int COLUMN_TYPE_NULL = 5;
        private static final int COLUMN_TYPE_STRING = 3;

        @org.jetbrains.annotations.NotNull
        public static final androidx.room.support.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteStatement.Companion Companion = null;

        @org.jetbrains.annotations.NotNull
        private final androidx.room.support.AutoCloser autoCloser;

        @org.jetbrains.annotations.NotNull
        private int[] bindingTypes;

        @org.jetbrains.annotations.NotNull
        private byte[][] blobBindings;

        @org.jetbrains.annotations.NotNull
        private double[] doubleBindings;

        @org.jetbrains.annotations.NotNull
        private long[] longBindings;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String sql;

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
        }

        static {
                androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteStatement$Companion r0 = new androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteStatement$Companion
                r1 = 0
                r0.<init>(r1)
                androidx.room.support.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteStatement.Companion = r0
                return
        }

        public AutoClosingSupportSQLiteStatement(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull androidx.room.support.AutoCloser r3) {
                r1 = this;
                java.lang.String r0 = "sql"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "autoCloser"
                kotlin.jvm.internal.g0.p(r3, r0)
                r1.<init>()
                r1.sql = r2
                r1.autoCloser = r3
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

        public static /* synthetic */ int a(androidx.sqlite.db.SupportSQLiteStatement r0) {
                int r0 = executeUpdateDelete$lambda$1(r0)
                return r0
        }

        public static /* synthetic */ java.lang.String b(androidx.sqlite.db.SupportSQLiteStatement r0) {
                java.lang.String r0 = simpleQueryForString$lambda$4(r0)
                return r0
        }

        private final void bindTo(androidx.sqlite.db.SupportSQLiteProgram r7) {
                r6 = this;
                int[] r0 = r6.bindingTypes
                int r0 = r0.length
                r1 = 1
                r2 = 1
            L5:
                if (r2 >= r0) goto L46
                int[] r3 = r6.bindingTypes
                r3 = r3[r2]
                if (r3 == r1) goto L3c
                r4 = 2
                if (r3 == r4) goto L34
                r4 = 3
                if (r3 == r4) goto L29
                r4 = 4
                if (r3 == r4) goto L1e
                r4 = 5
                if (r3 == r4) goto L1a
                goto L43
            L1a:
                r7.bindNull(r2)
                goto L43
            L1e:
                byte[][] r3 = r6.blobBindings
                r3 = r3[r2]
                kotlin.jvm.internal.g0.m(r3)
                r7.bindBlob(r2, r3)
                goto L43
            L29:
                java.lang.String[] r3 = r6.stringBindings
                r3 = r3[r2]
                kotlin.jvm.internal.g0.m(r3)
                r7.bindString(r2, r3)
                goto L43
            L34:
                double[] r3 = r6.doubleBindings
                r4 = r3[r2]
                r7.bindDouble(r2, r4)
                goto L43
            L3c:
                long[] r3 = r6.longBindings
                r4 = r3[r2]
                r7.bindLong(r2, r4)
            L43:
                int r2 = r2 + 1
                goto L5
            L46:
                return
        }

        public static /* synthetic */ kotlin.n1 c(androidx.sqlite.db.SupportSQLiteStatement r0) {
                kotlin.n1 r0 = execute$lambda$0(r0)
                return r0
        }

        public static /* synthetic */ long d(androidx.sqlite.db.SupportSQLiteStatement r2) {
                long r0 = executeInsert$lambda$2(r2)
                return r0
        }

        public static /* synthetic */ java.lang.Object e(androidx.room.support.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteStatement r0, kotlin.jvm.functions.Function1 r1, androidx.sqlite.db.SupportSQLiteDatabase r2) {
                java.lang.Object r0 = executeWithRefCount$lambda$5(r0, r1, r2)
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

        private static final kotlin.n1 execute$lambda$0(androidx.sqlite.db.SupportSQLiteStatement r1) {
                java.lang.String r0 = "statement"
                kotlin.jvm.internal.g0.p(r1, r0)
                r1.execute()
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }

        private static final long executeInsert$lambda$2(androidx.sqlite.db.SupportSQLiteStatement r2) {
                java.lang.String r0 = "obj"
                kotlin.jvm.internal.g0.p(r2, r0)
                long r0 = r2.executeInsert()
                return r0
        }

        private static final int executeUpdateDelete$lambda$1(androidx.sqlite.db.SupportSQLiteStatement r1) {
                java.lang.String r0 = "obj"
                kotlin.jvm.internal.g0.p(r1, r0)
                int r1 = r1.executeUpdateDelete()
                return r1
        }

        private final <T> T executeWithRefCount(kotlin.jvm.functions.Function1<? super androidx.sqlite.db.SupportSQLiteStatement, ? extends T> r3) {
                r2 = this;
                androidx.room.support.AutoCloser r0 = r2.autoCloser
                androidx.room.support.r r1 = new androidx.room.support.r
                r1.<init>(r2, r3)
                java.lang.Object r3 = r0.executeRefCountingFunction(r1)
                return r3
        }

        private static final java.lang.Object executeWithRefCount$lambda$5(androidx.room.support.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteStatement r1, kotlin.jvm.functions.Function1 r2, androidx.sqlite.db.SupportSQLiteDatabase r3) {
                java.lang.String r0 = "db"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = r1.sql
                androidx.sqlite.db.SupportSQLiteStatement r3 = r3.compileStatement(r0)
                r1.bindTo(r3)
                java.lang.Object r1 = r2.invoke(r3)
                return r1
        }

        public static /* synthetic */ long f(androidx.sqlite.db.SupportSQLiteStatement r2) {
                long r0 = simpleQueryForLong$lambda$3(r2)
                return r0
        }

        private static final long simpleQueryForLong$lambda$3(androidx.sqlite.db.SupportSQLiteStatement r2) {
                java.lang.String r0 = "obj"
                kotlin.jvm.internal.g0.p(r2, r0)
                long r0 = r2.simpleQueryForLong()
                return r0
        }

        private static final java.lang.String simpleQueryForString$lambda$4(androidx.sqlite.db.SupportSQLiteStatement r1) {
                java.lang.String r0 = "obj"
                kotlin.jvm.internal.g0.p(r1, r0)
                java.lang.String r1 = r1.simpleQueryForString()
                return r1
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public void bindBlob(int r3, @org.jetbrains.annotations.NotNull byte[] r4) {
                r2 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.g0.p(r4, r0)
                r0 = 4
                r2.ensureCapacity(r0, r3)
                int[] r1 = r2.bindingTypes
                r1[r3] = r0
                byte[][] r0 = r2.blobBindings
                r0[r3] = r4
                return
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public void bindDouble(int r3, double r4) {
                r2 = this;
                r0 = 2
                r2.ensureCapacity(r0, r3)
                int[] r1 = r2.bindingTypes
                r1[r3] = r0
                double[] r0 = r2.doubleBindings
                r0[r3] = r4
                return
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public void bindLong(int r3, long r4) {
                r2 = this;
                r0 = 1
                r2.ensureCapacity(r0, r3)
                int[] r1 = r2.bindingTypes
                r1[r3] = r0
                long[] r0 = r2.longBindings
                r0[r3] = r4
                return
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public void bindNull(int r3) {
                r2 = this;
                r0 = 5
                r2.ensureCapacity(r0, r3)
                int[] r1 = r2.bindingTypes
                r1[r3] = r0
                return
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public void bindString(int r3, @org.jetbrains.annotations.NotNull java.lang.String r4) {
                r2 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.g0.p(r4, r0)
                r0 = 3
                r2.ensureCapacity(r0, r3)
                int[] r1 = r2.bindingTypes
                r1[r3] = r0
                java.lang.String[] r0 = r2.stringBindings
                r0[r3] = r4
                return
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public void clearBindings() {
                r2 = this;
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

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r0 = this;
                r0.clearBindings()
                return
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public void execute() {
                r1 = this;
                androidx.room.support.t r0 = new androidx.room.support.t
                r0.<init>()
                r1.executeWithRefCount(r0)
                return
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public long executeInsert() {
                r2 = this;
                androidx.room.support.s r0 = new androidx.room.support.s
                r0.<init>()
                java.lang.Object r0 = r2.executeWithRefCount(r0)
                java.lang.Number r0 = (java.lang.Number) r0
                long r0 = r0.longValue()
                return r0
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public int executeUpdateDelete() {
                r1 = this;
                androidx.room.support.q r0 = new androidx.room.support.q
                r0.<init>()
                java.lang.Object r0 = r1.executeWithRefCount(r0)
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                return r0
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public long simpleQueryForLong() {
                r2 = this;
                androidx.room.support.o r0 = new androidx.room.support.o
                r0.<init>()
                java.lang.Object r0 = r2.executeWithRefCount(r0)
                java.lang.Number r0 = (java.lang.Number) r0
                long r0 = r0.longValue()
                return r0
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        @org.jetbrains.annotations.Nullable
        public java.lang.String simpleQueryForString() {
                r1 = this;
                androidx.room.support.p r0 = new androidx.room.support.p
                r0.<init>()
                java.lang.Object r0 = r1.executeWithRefCount(r0)
                java.lang.String r0 = (java.lang.String) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class KeepAliveCursor implements android.database.Cursor {

        @org.jetbrains.annotations.NotNull
        private final androidx.room.support.AutoCloser autoCloser;

        @org.jetbrains.annotations.NotNull
        private final android.database.Cursor delegate;

        public KeepAliveCursor(@org.jetbrains.annotations.NotNull android.database.Cursor r2, @org.jetbrains.annotations.NotNull androidx.room.support.AutoCloser r3) {
                r1 = this;
                java.lang.String r0 = "delegate"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "autoCloser"
                kotlin.jvm.internal.g0.p(r3, r0)
                r1.<init>()
                r1.delegate = r2
                r1.autoCloser = r3
                return
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r1 = this;
                android.database.Cursor r0 = r1.delegate
                r0.close()
                androidx.room.support.AutoCloser r0 = r1.autoCloser
                r0.decrementCountAndScheduleClose()
                return
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int r2, android.database.CharArrayBuffer r3) {
                r1 = this;
                android.database.Cursor r0 = r1.delegate
                r0.copyStringToBuffer(r2, r3)
                return
        }

        @Override // android.database.Cursor
        @kotlin.Deprecated(message = "Deprecated in Java")
        public void deactivate() {
                r1 = this;
                android.database.Cursor r0 = r1.delegate
                r0.deactivate()
                return
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int r2) {
                r1 = this;
                android.database.Cursor r0 = r1.delegate
                byte[] r2 = r0.getBlob(r2)
                return r2
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
                r1 = this;
                android.database.Cursor r0 = r1.delegate
                int r0 = r0.getColumnCount()
                return r0
        }

        @Override // android.database.Cursor
        public int getColumnIndex(java.lang.String r2) {
                r1 = this;
                android.database.Cursor r0 = r1.delegate
                int r2 = r0.getColumnIndex(r2)
                return r2
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(java.lang.String r2) {
                r1 = this;
                android.database.Cursor r0 = r1.delegate
                int r2 = r0.getColumnIndexOrThrow(r2)
                return r2
        }

        @Override // android.database.Cursor
        public java.lang.String getColumnName(int r2) {
                r1 = this;
                android.database.Cursor r0 = r1.delegate
                java.lang.String r2 = r0.getColumnName(r2)
                return r2
        }

        @Override // android.database.Cursor
        public java.lang.String[] getColumnNames() {
                r1 = this;
                android.database.Cursor r0 = r1.delegate
                java.lang.String[] r0 = r0.getColumnNames()
                return r0
        }

        @Override // android.database.Cursor
        public int getCount() {
                r1 = this;
                android.database.Cursor r0 = r1.delegate
                int r0 = r0.getCount()
                return r0
        }

        @Override // android.database.Cursor
        public double getDouble(int r3) {
                r2 = this;
                android.database.Cursor r0 = r2.delegate
                double r0 = r0.getDouble(r3)
                return r0
        }

        @Override // android.database.Cursor
        public android.os.Bundle getExtras() {
                r1 = this;
                android.database.Cursor r0 = r1.delegate
                android.os.Bundle r0 = r0.getExtras()
                return r0
        }

        @Override // android.database.Cursor
        public float getFloat(int r2) {
                r1 = this;
                android.database.Cursor r0 = r1.delegate
                float r2 = r0.getFloat(r2)
                return r2
        }

        @Override // android.database.Cursor
        public int getInt(int r2) {
                r1 = this;
                android.database.Cursor r0 = r1.delegate
                int r2 = r0.getInt(r2)
                return r2
        }

        @Override // android.database.Cursor
        public long getLong(int r3) {
                r2 = this;
                android.database.Cursor r0 = r2.delegate
                long r0 = r0.getLong(r3)
                return r0
        }

        @Override // android.database.Cursor
        public android.net.Uri getNotificationUri() {
                r1 = this;
                android.database.Cursor r0 = r1.delegate
                android.net.Uri r0 = r0.getNotificationUri()
                return r0
        }

        @Override // android.database.Cursor
        public int getPosition() {
                r1 = this;
                android.database.Cursor r0 = r1.delegate
                int r0 = r0.getPosition()
                return r0
        }

        @Override // android.database.Cursor
        public short getShort(int r2) {
                r1 = this;
                android.database.Cursor r0 = r1.delegate
                short r2 = r0.getShort(r2)
                return r2
        }

        @Override // android.database.Cursor
        public java.lang.String getString(int r2) {
                r1 = this;
                android.database.Cursor r0 = r1.delegate
                java.lang.String r2 = r0.getString(r2)
                return r2
        }

        @Override // android.database.Cursor
        public int getType(int r2) {
                r1 = this;
                android.database.Cursor r0 = r1.delegate
                int r2 = r0.getType(r2)
                return r2
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
                r1 = this;
                android.database.Cursor r0 = r1.delegate
                boolean r0 = r0.getWantsAllOnMoveCalls()
                return r0
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
                r1 = this;
                android.database.Cursor r0 = r1.delegate
                boolean r0 = r0.isAfterLast()
                return r0
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
                r1 = this;
                android.database.Cursor r0 = r1.delegate
                boolean r0 = r0.isBeforeFirst()
                return r0
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
                r1 = this;
                android.database.Cursor r0 = r1.delegate
                boolean r0 = r0.isClosed()
                return r0
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
                r1 = this;
                android.database.Cursor r0 = r1.delegate
                boolean r0 = r0.isFirst()
                return r0
        }

        @Override // android.database.Cursor
        public boolean isLast() {
                r1 = this;
                android.database.Cursor r0 = r1.delegate
                boolean r0 = r0.isLast()
                return r0
        }

        @Override // android.database.Cursor
        public boolean isNull(int r2) {
                r1 = this;
                android.database.Cursor r0 = r1.delegate
                boolean r2 = r0.isNull(r2)
                return r2
        }

        @Override // android.database.Cursor
        public boolean move(int r2) {
                r1 = this;
                android.database.Cursor r0 = r1.delegate
                boolean r2 = r0.move(r2)
                return r2
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
                r1 = this;
                android.database.Cursor r0 = r1.delegate
                boolean r0 = r0.moveToFirst()
                return r0
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
                r1 = this;
                android.database.Cursor r0 = r1.delegate
                boolean r0 = r0.moveToLast()
                return r0
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
                r1 = this;
                android.database.Cursor r0 = r1.delegate
                boolean r0 = r0.moveToNext()
                return r0
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int r2) {
                r1 = this;
                android.database.Cursor r0 = r1.delegate
                boolean r2 = r0.moveToPosition(r2)
                return r2
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
                r1 = this;
                android.database.Cursor r0 = r1.delegate
                boolean r0 = r0.moveToPrevious()
                return r0
        }

        @Override // android.database.Cursor
        public void registerContentObserver(android.database.ContentObserver r2) {
                r1 = this;
                android.database.Cursor r0 = r1.delegate
                r0.registerContentObserver(r2)
                return
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(android.database.DataSetObserver r2) {
                r1 = this;
                android.database.Cursor r0 = r1.delegate
                r0.registerDataSetObserver(r2)
                return
        }

        @Override // android.database.Cursor
        @kotlin.Deprecated(message = "Deprecated in Java")
        public boolean requery() {
                r1 = this;
                android.database.Cursor r0 = r1.delegate
                boolean r0 = r0.requery()
                return r0
        }

        @Override // android.database.Cursor
        public android.os.Bundle respond(android.os.Bundle r2) {
                r1 = this;
                android.database.Cursor r0 = r1.delegate
                android.os.Bundle r2 = r0.respond(r2)
                return r2
        }

        @Override // android.database.Cursor
        public void setExtras(android.os.Bundle r2) {
                r1 = this;
                android.database.Cursor r0 = r1.delegate
                androidx.room.support.u.a(r0, r2)
                return
        }

        @Override // android.database.Cursor
        public void setNotificationUri(android.content.ContentResolver r2, android.net.Uri r3) {
                r1 = this;
                android.database.Cursor r0 = r1.delegate
                r0.setNotificationUri(r2, r3)
                return
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(android.database.ContentObserver r2) {
                r1 = this;
                android.database.Cursor r0 = r1.delegate
                r0.unregisterContentObserver(r2)
                return
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(android.database.DataSetObserver r2) {
                r1 = this;
                android.database.Cursor r0 = r1.delegate
                r0.unregisterDataSetObserver(r2)
                return
        }
    }

    public AutoClosingRoomOpenHelper(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteOpenHelper r2, @org.jetbrains.annotations.NotNull androidx.room.support.AutoCloser r3) {
            r1 = this;
            java.lang.String r0 = "delegate"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "autoCloser"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.delegate = r2
            r1.autoCloser = r3
            androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase r2 = new androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase
            r2.<init>(r3)
            r1.autoClosingDb = r2
            androidx.sqlite.db.SupportSQLiteOpenHelper r2 = r1.getDelegate()
            r3.initOpenHelper(r2)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase r0 = r1.autoClosingDb
            r0.close()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.room.support.AutoCloser getAutoCloser$room_runtime_release() {
            r1 = this;
            androidx.room.support.AutoCloser r0 = r1.autoCloser
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @org.jetbrains.annotations.Nullable
    public java.lang.String getDatabaseName() {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteOpenHelper r0 = r1.delegate
            java.lang.String r0 = r0.getDatabaseName()
            return r0
    }

    @Override // androidx.room.DelegatingOpenHelper
    @org.jetbrains.annotations.NotNull
    public androidx.sqlite.db.SupportSQLiteOpenHelper getDelegate() {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteOpenHelper r0 = r1.delegate
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @org.jetbrains.annotations.NotNull
    public androidx.sqlite.db.SupportSQLiteDatabase getReadableDatabase() {
            r1 = this;
            androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase r0 = r1.autoClosingDb
            r0.pokeOpen()
            androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase r0 = r1.autoClosingDb
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @org.jetbrains.annotations.NotNull
    public androidx.sqlite.db.SupportSQLiteDatabase getWritableDatabase() {
            r1 = this;
            androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase r0 = r1.autoClosingDb
            r0.pokeOpen()
            androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase r0 = r1.autoClosingDb
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public void setWriteAheadLoggingEnabled(boolean r2) {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteOpenHelper r0 = r1.delegate
            r0.setWriteAheadLoggingEnabled(r2)
            return
    }
}
