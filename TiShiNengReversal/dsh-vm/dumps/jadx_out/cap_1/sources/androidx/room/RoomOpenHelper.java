package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.Deprecated(message = "Replaced by RoomConnectionManager and no longer used in generated code.")
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nRoomOpenHelper.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomOpenHelper.android.kt\nandroidx/room/RoomOpenHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 CursorUtil.android.kt\nandroidx/room/util/CursorUtil\n*L\n1#1,278:1\n1863#2,2:279\n1863#2,2:281\n1863#2,2:283\n1863#2,2:285\n146#3:287\n*S KotlinDebug\n*F\n+ 1 RoomOpenHelper.android.kt\nandroidx/room/RoomOpenHelper\n*L\n81#1:279,2\n90#1:281,2\n112#1:283,2\n135#1:285,2\n143#1:287\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class RoomOpenHelper extends androidx.sqlite.db.SupportSQLiteOpenHelper.Callback {

    @org.jetbrains.annotations.NotNull
    public static final androidx.room.RoomOpenHelper.Companion Companion = null;

    @org.jetbrains.annotations.Nullable
    private final java.util.List<androidx.room.RoomDatabase.Callback> callbacks;

    @org.jetbrains.annotations.Nullable
    private androidx.room.DatabaseConfiguration configuration;

    @org.jetbrains.annotations.NotNull
    private final androidx.room.RoomOpenHelper.Delegate delegate;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String identityHash;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String legacyHash;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nRoomOpenHelper.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomOpenHelper.android.kt\nandroidx/room/RoomOpenHelper$Companion\n+ 2 CursorUtil.android.kt\nandroidx/room/util/CursorUtil\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,278:1\n146#2:279\n146#2:280\n146#2:281\n1863#3,2:282\n*S KotlinDebug\n*F\n+ 1 RoomOpenHelper.android.kt\nandroidx/room/RoomOpenHelper$Companion\n*L\n242#1:279\n249#1:280\n256#1:281\n268#1:282,2\n*E\n"})
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

        public final void dropAllTables$room_runtime_release(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteDatabase r9) {
                r8 = this;
                java.lang.String r0 = "db"
                kotlin.jvm.internal.g0.p(r9, r0)
                java.lang.String r0 = "SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'"
                android.database.Cursor r0 = r9.query(r0)
                java.io.Closeable r0 = (java.io.Closeable) r0
                r1 = r0
                android.database.Cursor r1 = (android.database.Cursor) r1     // Catch: java.lang.Throwable -> L4d
                java.util.List r2 = kotlin.collections.f0.j()     // Catch: java.lang.Throwable -> L4d
            L14:
                boolean r3 = r1.moveToNext()     // Catch: java.lang.Throwable -> L4d
                r4 = 0
                if (r3 == 0) goto L4f
                r3 = 0
                java.lang.String r5 = r1.getString(r3)     // Catch: java.lang.Throwable -> L4d
                kotlin.jvm.internal.g0.m(r5)     // Catch: java.lang.Throwable -> L4d
                java.lang.String r6 = "sqlite_"
                r7 = 2
                boolean r3 = kotlin.text.u.H2(r5, r6, r3, r7, r4)     // Catch: java.lang.Throwable -> L4d
                if (r3 != 0) goto L14
                java.lang.String r3 = "android_metadata"
                boolean r3 = kotlin.jvm.internal.g0.g(r5, r3)     // Catch: java.lang.Throwable -> L4d
                if (r3 == 0) goto L35
                goto L14
            L35:
                r3 = 1
                java.lang.String r3 = r1.getString(r3)     // Catch: java.lang.Throwable -> L4d
                java.lang.String r4 = "view"
                boolean r3 = kotlin.jvm.internal.g0.g(r3, r4)     // Catch: java.lang.Throwable -> L4d
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L4d
                kotlin.Pair r3 = kotlin.o0.a(r5, r3)     // Catch: java.lang.Throwable -> L4d
                r2.add(r3)     // Catch: java.lang.Throwable -> L4d
                goto L14
            L4d:
                r9 = move-exception
                goto La5
            L4f:
                java.util.List r1 = kotlin.collections.f0.b(r2)     // Catch: java.lang.Throwable -> L4d
                kotlin.io.b.a(r0, r4)
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Iterator r0 = r1.iterator()
            L5c:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto La4
                java.lang.Object r1 = r0.next()
                kotlin.Pair r1 = (kotlin.Pair) r1
                java.lang.Object r2 = r1.component1()
                java.lang.String r2 = (java.lang.String) r2
                java.lang.Object r1 = r1.component2()
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L8f
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "DROP VIEW IF EXISTS "
                r1.append(r3)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r9.execSQL(r1)
                goto L5c
            L8f:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "DROP TABLE IF EXISTS "
                r1.append(r3)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r9.execSQL(r1)
                goto L5c
            La4:
                return
            La5:
                throw r9     // Catch: java.lang.Throwable -> La6
            La6:
                r1 = move-exception
                kotlin.io.b.a(r0, r9)
                throw r1
        }

        public final boolean hasEmptySchema$room_runtime_release(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteDatabase r4) {
                r3 = this;
                java.lang.String r0 = "db"
                kotlin.jvm.internal.g0.p(r4, r0)
                java.lang.String r0 = "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"
                android.database.Cursor r4 = r4.query(r0)
                java.io.Closeable r4 = (java.io.Closeable) r4
                r0 = r4
                android.database.Cursor r0 = (android.database.Cursor) r0     // Catch: java.lang.Throwable -> L1f
                boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1f
                r2 = 0
                if (r1 == 0) goto L21
                int r0 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L1f
                if (r0 != 0) goto L21
                r2 = 1
                goto L21
            L1f:
                r0 = move-exception
                goto L26
            L21:
                r0 = 0
                kotlin.io.b.a(r4, r0)
                return r2
            L26:
                throw r0     // Catch: java.lang.Throwable -> L27
            L27:
                r1 = move-exception
                kotlin.io.b.a(r4, r0)
                throw r1
        }

        public final boolean hasRoomMasterTable$room_runtime_release(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteDatabase r4) {
                r3 = this;
                java.lang.String r0 = "db"
                kotlin.jvm.internal.g0.p(r4, r0)
                java.lang.String r0 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
                android.database.Cursor r4 = r4.query(r0)
                java.io.Closeable r4 = (java.io.Closeable) r4
                r0 = r4
                android.database.Cursor r0 = (android.database.Cursor) r0     // Catch: java.lang.Throwable -> L1f
                boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1f
                r2 = 0
                if (r1 == 0) goto L21
                int r0 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L1f
                if (r0 == 0) goto L21
                r2 = 1
                goto L21
            L1f:
                r0 = move-exception
                goto L26
            L21:
                r0 = 0
                kotlin.io.b.a(r4, r0)
                return r2
            L26:
                throw r0     // Catch: java.lang.Throwable -> L27
            L27:
                r1 = move-exception
                kotlin.io.b.a(r4, r0)
                throw r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.Deprecated(message = "Replaced by OpenDelegate  and no longer used in generated code.")
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static abstract class Delegate {

        @kotlin.jvm.JvmField
        public final int version;

        public Delegate(int r1) {
                r0 = this;
                r0.<init>()
                r0.version = r1
                return
        }

        public abstract void createAllTables(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteDatabase r1);

        public abstract void dropAllTables(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteDatabase r1);

        public abstract void onCreate(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteDatabase r1);

        public abstract void onOpen(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteDatabase r1);

        public void onPostMigrate(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteDatabase r2) {
                r1 = this;
                java.lang.String r0 = "db"
                kotlin.jvm.internal.g0.p(r2, r0)
                return
        }

        public void onPreMigrate(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteDatabase r2) {
                r1 = this;
                java.lang.String r0 = "db"
                kotlin.jvm.internal.g0.p(r2, r0)
                return
        }

        @org.jetbrains.annotations.NotNull
        public androidx.room.RoomOpenHelper.ValidationResult onValidateSchema(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteDatabase r3) {
                r2 = this;
                java.lang.String r0 = "db"
                kotlin.jvm.internal.g0.p(r3, r0)
                r2.validateMigration(r3)
                androidx.room.RoomOpenHelper$ValidationResult r3 = new androidx.room.RoomOpenHelper$ValidationResult
                r0 = 1
                r1 = 0
                r3.<init>(r0, r1)
                return r3
        }

        @kotlin.Deprecated(message = "Use [onValidateSchema(SupportSQLiteDatabase)]")
        protected void validateMigration(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteDatabase r2) {
                r1 = this;
                java.lang.String r0 = "db"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "validateMigration is deprecated"
                r2.<init>(r0)
                throw r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.Deprecated(message = "Replaced by OpenDelegate.ValidationResult and no longer used in generated code.")
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class ValidationResult {

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.Nullable
        public final java.lang.String expectedFoundMsg;

        @kotlin.jvm.JvmField
        public final boolean isValid;

        public ValidationResult(boolean r1, @org.jetbrains.annotations.Nullable java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.isValid = r1
                r0.expectedFoundMsg = r2
                return
        }
    }

    static {
            androidx.room.RoomOpenHelper$Companion r0 = new androidx.room.RoomOpenHelper$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.room.RoomOpenHelper.Companion = r0
            return
    }

    public RoomOpenHelper(@org.jetbrains.annotations.NotNull androidx.room.DatabaseConfiguration r2, @org.jetbrains.annotations.NotNull androidx.room.RoomOpenHelper.Delegate r3, @org.jetbrains.annotations.NotNull java.lang.String r4) {
            r1 = this;
            java.lang.String r0 = "configuration"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "delegate"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "legacyHash"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = ""
            r1.<init>(r2, r3, r0, r4)
            return
    }

    public RoomOpenHelper(@org.jetbrains.annotations.NotNull androidx.room.DatabaseConfiguration r2, @org.jetbrains.annotations.NotNull androidx.room.RoomOpenHelper.Delegate r3, @org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull java.lang.String r5) {
            r1 = this;
            java.lang.String r0 = "configuration"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "delegate"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "identityHash"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "legacyHash"
            kotlin.jvm.internal.g0.p(r5, r0)
            int r0 = r3.version
            r1.<init>(r0)
            java.util.List<androidx.room.RoomDatabase$Callback> r0 = r2.callbacks
            r1.callbacks = r0
            r1.configuration = r2
            r1.delegate = r3
            r1.identityHash = r4
            r1.legacyHash = r5
            return
    }

    private final void checkIdentity(androidx.sqlite.db.SupportSQLiteDatabase r4) {
            r3 = this;
            androidx.room.RoomOpenHelper$Companion r0 = androidx.room.RoomOpenHelper.Companion
            boolean r0 = r0.hasRoomMasterTable$room_runtime_release(r4)
            if (r0 == 0) goto L64
            androidx.sqlite.db.SimpleSQLiteQuery r0 = new androidx.sqlite.db.SimpleSQLiteQuery
            java.lang.String r1 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r0.<init>(r1)
            android.database.Cursor r4 = r4.query(r0)
            java.io.Closeable r4 = (java.io.Closeable) r4
            r0 = r4
            android.database.Cursor r0 = (android.database.Cursor) r0     // Catch: java.lang.Throwable -> L25
            boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L25
            r2 = 0
            if (r1 == 0) goto L27
            r1 = 0
            java.lang.String r0 = r0.getString(r1)     // Catch: java.lang.Throwable -> L25
            goto L28
        L25:
            r0 = move-exception
            goto L5e
        L27:
            r0 = r2
        L28:
            kotlin.io.b.a(r4, r2)
            java.lang.String r4 = r3.identityHash
            boolean r4 = kotlin.jvm.internal.g0.g(r4, r0)
            if (r4 != 0) goto L5d
            java.lang.String r4 = r3.legacyHash
            boolean r4 = kotlin.jvm.internal.g0.g(r4, r0)
            if (r4 == 0) goto L3c
            goto L5d
        L3c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "
            r1.append(r2)
            java.lang.String r2 = r3.identityHash
            r1.append(r2)
            java.lang.String r2 = ", found: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            throw r4
        L5d:
            return
        L5e:
            throw r0     // Catch: java.lang.Throwable -> L5f
        L5f:
            r1 = move-exception
            kotlin.io.b.a(r4, r0)
            throw r1
        L64:
            androidx.room.RoomOpenHelper$Delegate r0 = r3.delegate
            androidx.room.RoomOpenHelper$ValidationResult r0 = r0.onValidateSchema(r4)
            boolean r1 = r0.isValid
            if (r1 == 0) goto L77
            androidx.room.RoomOpenHelper$Delegate r0 = r3.delegate
            r0.onPostMigrate(r4)
            r3.updateIdentity(r4)
            return
        L77:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Pre-packaged database has an invalid schema: "
            r1.append(r2)
            java.lang.String r0 = r0.expectedFoundMsg
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            throw r4
    }

    private final void createMasterTableIfNotExists(androidx.sqlite.db.SupportSQLiteDatabase r2) {
            r1 = this;
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"
            r2.execSQL(r0)
            return
    }

    private final void updateIdentity(androidx.sqlite.db.SupportSQLiteDatabase r2) {
            r1 = this;
            r1.createMasterTableIfNotExists(r2)
            java.lang.String r0 = r1.identityHash
            java.lang.String r0 = androidx.room.RoomMasterTable.createInsertQuery(r0)
            r2.execSQL(r0)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onConfigure(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteDatabase r2) {
            r1 = this;
            java.lang.String r0 = "db"
            kotlin.jvm.internal.g0.p(r2, r0)
            super.onConfigure(r2)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onCreate(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteDatabase r4) {
            r3 = this;
            java.lang.String r0 = "db"
            kotlin.jvm.internal.g0.p(r4, r0)
            androidx.room.RoomOpenHelper$Companion r0 = androidx.room.RoomOpenHelper.Companion
            boolean r0 = r0.hasEmptySchema$room_runtime_release(r4)
            androidx.room.RoomOpenHelper$Delegate r1 = r3.delegate
            r1.createAllTables(r4)
            if (r0 != 0) goto L36
            androidx.room.RoomOpenHelper$Delegate r0 = r3.delegate
            androidx.room.RoomOpenHelper$ValidationResult r0 = r0.onValidateSchema(r4)
            boolean r1 = r0.isValid
            if (r1 == 0) goto L1d
            goto L36
        L1d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Pre-packaged database has an invalid schema: "
            r1.append(r2)
            java.lang.String r0 = r0.expectedFoundMsg
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            throw r4
        L36:
            r3.updateIdentity(r4)
            androidx.room.RoomOpenHelper$Delegate r0 = r3.delegate
            r0.onCreate(r4)
            java.util.List<androidx.room.RoomDatabase$Callback> r0 = r3.callbacks
            if (r0 == 0) goto L58
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L48:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L58
            java.lang.Object r1 = r0.next()
            androidx.room.RoomDatabase$Callback r1 = (androidx.room.RoomDatabase.Callback) r1
            r1.onCreate(r4)
            goto L48
        L58:
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onDowngrade(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteDatabase r2, int r3, int r4) {
            r1 = this;
            java.lang.String r0 = "db"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.onUpgrade(r2, r3, r4)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onOpen(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteDatabase r3) {
            r2 = this;
            java.lang.String r0 = "db"
            kotlin.jvm.internal.g0.p(r3, r0)
            super.onOpen(r3)
            r2.checkIdentity(r3)
            androidx.room.RoomOpenHelper$Delegate r0 = r2.delegate
            r0.onOpen(r3)
            java.util.List<androidx.room.RoomDatabase$Callback> r0 = r2.callbacks
            if (r0 == 0) goto L2a
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r0.next()
            androidx.room.RoomDatabase$Callback r1 = (androidx.room.RoomDatabase.Callback) r1
            r1.onOpen(r3)
            goto L1a
        L2a:
            r3 = 0
            r2.configuration = r3
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onUpgrade(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteDatabase r3, int r4, int r5) {
            r2 = this;
            java.lang.String r0 = "db"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.room.DatabaseConfiguration r0 = r2.configuration
            if (r0 == 0) goto L5d
            androidx.room.RoomDatabase$MigrationContainer r0 = r0.migrationContainer
            java.util.List r0 = r0.findMigrationPath(r4, r5)
            if (r0 == 0) goto L5d
            androidx.room.RoomOpenHelper$Delegate r4 = r2.delegate
            r4.onPreMigrate(r3)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r4 = r0.iterator()
        L1c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L31
            java.lang.Object r5 = r4.next()
            androidx.room.migration.Migration r5 = (androidx.room.migration.Migration) r5
            androidx.room.driver.SupportSQLiteConnection r0 = new androidx.room.driver.SupportSQLiteConnection
            r0.<init>(r3)
            r5.migrate(r0)
            goto L1c
        L31:
            androidx.room.RoomOpenHelper$Delegate r4 = r2.delegate
            androidx.room.RoomOpenHelper$ValidationResult r4 = r4.onValidateSchema(r3)
            boolean r5 = r4.isValid
            if (r5 == 0) goto L44
            androidx.room.RoomOpenHelper$Delegate r4 = r2.delegate
            r4.onPostMigrate(r3)
            r2.updateIdentity(r3)
            return
        L44:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Migration didn't properly handle: "
            r5.append(r0)
            java.lang.String r4 = r4.expectedFoundMsg
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4)
            throw r3
        L5d:
            androidx.room.DatabaseConfiguration r0 = r2.configuration
            if (r0 == 0) goto L96
            boolean r1 = r0.isMigrationRequired(r4, r5)
            if (r1 != 0) goto L96
            boolean r4 = r0.allowDestructiveMigrationForAllTables
            if (r4 == 0) goto L71
            androidx.room.RoomOpenHelper$Companion r4 = androidx.room.RoomOpenHelper.Companion
            r4.dropAllTables$room_runtime_release(r3)
            goto L76
        L71:
            androidx.room.RoomOpenHelper$Delegate r4 = r2.delegate
            r4.dropAllTables(r3)
        L76:
            java.util.List<androidx.room.RoomDatabase$Callback> r4 = r2.callbacks
            if (r4 == 0) goto L90
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L80:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L90
            java.lang.Object r5 = r4.next()
            androidx.room.RoomDatabase$Callback r5 = (androidx.room.RoomDatabase.Callback) r5
            r5.onDestructiveMigration(r3)
            goto L80
        L90:
            androidx.room.RoomOpenHelper$Delegate r4 = r2.delegate
            r4.createAllTables(r3)
            return
        L96:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "A migration from "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = " to "
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
    }
}
