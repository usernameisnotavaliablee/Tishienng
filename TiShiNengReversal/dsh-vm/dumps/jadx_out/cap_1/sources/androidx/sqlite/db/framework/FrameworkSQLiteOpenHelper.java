package androidx.sqlite.db.framework;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class FrameworkSQLiteOpenHelper implements androidx.sqlite.db.SupportSQLiteOpenHelper {

    @org.jetbrains.annotations.NotNull
    public static final androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String TAG = "SupportSQLite";
    private final boolean allowDataLossOnRecovery;

    @org.jetbrains.annotations.NotNull
    private final androidx.sqlite.db.SupportSQLiteOpenHelper.Callback callback;

    @org.jetbrains.annotations.NotNull
    private final android.content.Context context;

    @org.jetbrains.annotations.NotNull
    private final kotlin.s<androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper> lazyDelegate;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String name;
    private final boolean useNoBackupDirectory;
    private boolean writeAheadLoggingEnabled;

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
    private static final class DBRefHolder {

        @org.jetbrains.annotations.Nullable
        private androidx.sqlite.db.framework.FrameworkSQLiteDatabase db;

        public DBRefHolder(@org.jetbrains.annotations.Nullable androidx.sqlite.db.framework.FrameworkSQLiteDatabase r1) {
                r0 = this;
                r0.<init>()
                r0.db = r1
                return
        }

        @org.jetbrains.annotations.Nullable
        public final androidx.sqlite.db.framework.FrameworkSQLiteDatabase getDb() {
                r1 = this;
                androidx.sqlite.db.framework.FrameworkSQLiteDatabase r0 = r1.db
                return r0
        }

        public final void setDb(@org.jetbrains.annotations.Nullable androidx.sqlite.db.framework.FrameworkSQLiteDatabase r1) {
                r0 = this;
                r0.db = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class OpenHelper extends android.database.sqlite.SQLiteOpenHelper {

        @org.jetbrains.annotations.NotNull
        public static final androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.Companion Companion = null;
        private final boolean allowDataLossOnRecovery;

        @org.jetbrains.annotations.NotNull
        private final androidx.sqlite.db.SupportSQLiteOpenHelper.Callback callback;

        @org.jetbrains.annotations.NotNull
        private final android.content.Context context;

        @org.jetbrains.annotations.NotNull
        private final androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.DBRefHolder dbRef;

        @org.jetbrains.annotations.NotNull
        private final androidx.sqlite.util.ProcessLock lock;
        private boolean migrated;
        private boolean opened;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private static final class CallbackException extends java.lang.RuntimeException {

            @org.jetbrains.annotations.NotNull
            private final androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName callbackName;

            @org.jetbrains.annotations.NotNull
            private final java.lang.Throwable cause;

            public CallbackException(@org.jetbrains.annotations.NotNull androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName r2, @org.jetbrains.annotations.NotNull java.lang.Throwable r3) {
                    r1 = this;
                    java.lang.String r0 = "callbackName"
                    kotlin.jvm.internal.g0.p(r2, r0)
                    java.lang.String r0 = "cause"
                    kotlin.jvm.internal.g0.p(r3, r0)
                    r1.<init>(r3)
                    r1.callbackName = r2
                    r1.cause = r3
                    return
            }

            @org.jetbrains.annotations.NotNull
            public final androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName getCallbackName() {
                    r1 = this;
                    androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName r0 = r1.callbackName
                    return r0
            }

            @Override // java.lang.Throwable
            @org.jetbrains.annotations.NotNull
            public java.lang.Throwable getCause() {
                    r1 = this;
                    java.lang.Throwable r0 = r1.cause
                    return r0
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public enum CallbackName extends java.lang.Enum<androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName> {
            private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
            private static final /* synthetic */ androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName[] $VALUES = null;
            public static final androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName ON_CONFIGURE = null;
            public static final androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName ON_CREATE = null;
            public static final androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName ON_DOWNGRADE = null;
            public static final androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName ON_OPEN = null;
            public static final androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName ON_UPGRADE = null;

            private static final /* synthetic */ androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName[] $values() {
                    r0 = 5
                    androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName[] r0 = new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName[r0]
                    androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName r1 = androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_CONFIGURE
                    r2 = 0
                    r0[r2] = r1
                    androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName r1 = androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_CREATE
                    r2 = 1
                    r0[r2] = r1
                    androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName r1 = androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_UPGRADE
                    r2 = 2
                    r0[r2] = r1
                    androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName r1 = androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_DOWNGRADE
                    r2 = 3
                    r0[r2] = r1
                    androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName r1 = androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_OPEN
                    r2 = 4
                    r0[r2] = r1
                    return r0
            }

            static {
                    androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName r0 = new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName
                    java.lang.String r1 = "ON_CONFIGURE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_CONFIGURE = r0
                    androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName r0 = new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName
                    java.lang.String r1 = "ON_CREATE"
                    r2 = 1
                    r0.<init>(r1, r2)
                    androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_CREATE = r0
                    androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName r0 = new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName
                    java.lang.String r1 = "ON_UPGRADE"
                    r2 = 2
                    r0.<init>(r1, r2)
                    androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_UPGRADE = r0
                    androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName r0 = new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName
                    java.lang.String r1 = "ON_DOWNGRADE"
                    r2 = 3
                    r0.<init>(r1, r2)
                    androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_DOWNGRADE = r0
                    androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName r0 = new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName
                    java.lang.String r1 = "ON_OPEN"
                    r2 = 4
                    r0.<init>(r1, r2)
                    androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_OPEN = r0
                    androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName[] r0 = $values()
                    androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.$VALUES = r0
                    kotlin.enums.a r0 = kotlin.enums.c.c(r0)
                    androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.$ENTRIES = r0
                    return
            }

            CallbackName(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            @org.jetbrains.annotations.NotNull
            public static kotlin.enums.a<androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName> getEntries() {
                    kotlin.enums.a r0 = androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.$ENTRIES
                    return r0
            }

            public static androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName valueOf(java.lang.String r1) {
                    java.lang.Class<androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName> r0 = androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName r1 = (androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName) r1
                    return r1
            }

            public static androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName[] values() {
                    androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName[] r0 = androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.$VALUES
                    java.lang.Object r0 = r0.clone()
                    androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName[] r0 = (androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName[]) r0
                    return r0
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nFrameworkSQLiteOpenHelper.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrameworkSQLiteOpenHelper.android.kt\nandroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,337:1\n1#2:338\n*E\n"})
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

            @org.jetbrains.annotations.NotNull
            public final androidx.sqlite.db.framework.FrameworkSQLiteDatabase getWrappedDb(@org.jetbrains.annotations.NotNull androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.DBRefHolder r3, @org.jetbrains.annotations.NotNull android.database.sqlite.SQLiteDatabase r4) {
                    r2 = this;
                    java.lang.String r0 = "refHolder"
                    kotlin.jvm.internal.g0.p(r3, r0)
                    java.lang.String r0 = "sqLiteDatabase"
                    kotlin.jvm.internal.g0.p(r4, r0)
                    androidx.sqlite.db.framework.FrameworkSQLiteDatabase r0 = r3.getDb()
                    if (r0 == 0) goto L18
                    boolean r1 = r0.isDelegate(r4)
                    if (r1 != 0) goto L17
                    goto L18
                L17:
                    return r0
                L18:
                    androidx.sqlite.db.framework.FrameworkSQLiteDatabase r0 = new androidx.sqlite.db.framework.FrameworkSQLiteDatabase
                    r0.<init>(r4)
                    r3.setDb(r0)
                    return r0
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

            static {
                    androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName[] r0 = androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName r1 = androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_CONFIGURE     // Catch: java.lang.NoSuchFieldError -> L10
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                    r2 = 1
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
                L10:
                    androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName r1 = androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_CREATE     // Catch: java.lang.NoSuchFieldError -> L19
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                    r2 = 2
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
                L19:
                    androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName r1 = androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_UPGRADE     // Catch: java.lang.NoSuchFieldError -> L22
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                    r2 = 3
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                L22:
                    androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName r1 = androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_DOWNGRADE     // Catch: java.lang.NoSuchFieldError -> L2b
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
                    r2 = 4
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
                L2b:
                    androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName r1 = androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_OPEN     // Catch: java.lang.NoSuchFieldError -> L34
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L34
                    r2 = 5
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L34
                L34:
                    androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.WhenMappings.$EnumSwitchMapping$0 = r0
                    return
            }
        }

        static {
                androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$Companion r0 = new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$Companion
                r1 = 0
                r0.<init>(r1)
                androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.Companion = r0
                return
        }

        public OpenHelper(@org.jetbrains.annotations.NotNull android.content.Context r8, @org.jetbrains.annotations.Nullable java.lang.String r9, @org.jetbrains.annotations.NotNull androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.DBRefHolder r10, @org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteOpenHelper.Callback r11, boolean r12) {
                r7 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r8, r0)
                java.lang.String r0 = "dbRef"
                kotlin.jvm.internal.g0.p(r10, r0)
                java.lang.String r0 = "callback"
                kotlin.jvm.internal.g0.p(r11, r0)
                int r5 = r11.version
                androidx.sqlite.db.framework.g r6 = new androidx.sqlite.db.framework.g
                r6.<init>(r11, r10)
                r4 = 0
                r1 = r7
                r2 = r8
                r3 = r9
                r1.<init>(r2, r3, r4, r5, r6)
                r1.context = r2
                r1.dbRef = r10
                r1.callback = r11
                r1.allowDataLossOnRecovery = r12
                androidx.sqlite.util.ProcessLock r8 = new androidx.sqlite.util.ProcessLock
                if (r3 != 0) goto L37
                java.util.UUID r9 = java.util.UUID.randomUUID()
                java.lang.String r9 = r9.toString()
                java.lang.String r10 = "toString(...)"
                kotlin.jvm.internal.g0.o(r9, r10)
                goto L38
            L37:
                r9 = r3
            L38:
                java.io.File r10 = r2.getCacheDir()
                r11 = 0
                r8.<init>(r9, r10, r11)
                r1.lock = r8
                return
        }

        private static final void _init_$lambda$0(androidx.sqlite.db.SupportSQLiteOpenHelper.Callback r1, androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.DBRefHolder r2, android.database.sqlite.SQLiteDatabase r3) {
                androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$Companion r0 = androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.Companion
                kotlin.jvm.internal.g0.m(r3)
                androidx.sqlite.db.framework.FrameworkSQLiteDatabase r2 = r0.getWrappedDb(r2, r3)
                r1.onCorruption(r2)
                return
        }

        public static /* synthetic */ void a(androidx.sqlite.db.SupportSQLiteOpenHelper.Callback r0, androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.DBRefHolder r1, android.database.sqlite.SQLiteDatabase r2) {
                _init_$lambda$0(r0, r1, r2)
                return
        }

        private final android.database.sqlite.SQLiteDatabase getWritableOrReadableDatabase(boolean r1) {
                r0 = this;
                if (r1 == 0) goto La
                android.database.sqlite.SQLiteDatabase r1 = super.getWritableDatabase()
                kotlin.jvm.internal.g0.m(r1)
                return r1
            La:
                android.database.sqlite.SQLiteDatabase r1 = super.getReadableDatabase()
                kotlin.jvm.internal.g0.m(r1)
                return r1
        }

        private final android.database.sqlite.SQLiteDatabase innerGetDatabase(boolean r5) {
                r4 = this;
                java.lang.String r0 = r4.getDatabaseName()
                boolean r1 = r4.opened
                if (r0 == 0) goto L22
                if (r1 != 0) goto L22
                android.content.Context r1 = r4.context
                java.io.File r1 = r1.getDatabasePath(r0)
                java.io.File r1 = r1.getParentFile()
                if (r1 == 0) goto L22
                r1.mkdirs()
                boolean r2 = r1.isDirectory()
                if (r2 != 0) goto L22
                r1.toString()
            L22:
                android.database.sqlite.SQLiteDatabase r5 = r4.getWritableOrReadableDatabase(r5)     // Catch: java.lang.Throwable -> L27
                return r5
            L27:
                r1 = 500(0x1f4, double:2.47E-321)
                java.lang.Thread.sleep(r1)     // Catch: java.lang.InterruptedException -> L2c
            L2c:
                android.database.sqlite.SQLiteDatabase r5 = r4.getWritableOrReadableDatabase(r5)     // Catch: java.lang.Throwable -> L31
                return r5
            L31:
                r1 = move-exception
                boolean r2 = r1 instanceof androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackException
                if (r2 == 0) goto L65
                androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackException r1 = (androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackException) r1
                java.lang.Throwable r2 = r1.getCause()
                androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName r1 = r1.getCallbackName()
                int[] r3 = androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.WhenMappings.$EnumSwitchMapping$0
                int r1 = r1.ordinal()
                r1 = r3[r1]
                r3 = 1
                if (r1 == r3) goto L64
                r3 = 2
                if (r1 == r3) goto L64
                r3 = 3
                if (r1 == r3) goto L64
                r3 = 4
                if (r1 == r3) goto L64
                r3 = 5
                if (r1 != r3) goto L5e
                boolean r1 = r2 instanceof android.database.sqlite.SQLiteException
                if (r1 == 0) goto L5d
                r1 = r2
                goto L65
            L5d:
                throw r2
            L5e:
                kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                r5.<init>()
                throw r5
            L64:
                throw r2
            L65:
                boolean r2 = r1 instanceof android.database.sqlite.SQLiteException
                if (r2 == 0) goto L7f
                if (r0 == 0) goto L7f
                boolean r2 = r4.allowDataLossOnRecovery
                if (r2 == 0) goto L7f
                android.content.Context r1 = r4.context
                r1.deleteDatabase(r0)
                android.database.sqlite.SQLiteDatabase r5 = r4.getWritableOrReadableDatabase(r5)     // Catch: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackException -> L79
                return r5
            L79:
                r5 = move-exception
                java.lang.Throwable r5 = r5.getCause()
                throw r5
            L7f:
                throw r1
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public void close() {
                r4 = this;
                androidx.sqlite.util.ProcessLock r0 = r4.lock     // Catch: java.lang.Throwable -> L18
                r1 = 1
                r2 = 0
                r3 = 0
                androidx.sqlite.util.ProcessLock.lock$default(r0, r3, r1, r2)     // Catch: java.lang.Throwable -> L18
                super.close()     // Catch: java.lang.Throwable -> L18
                androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$DBRefHolder r0 = r4.dbRef     // Catch: java.lang.Throwable -> L18
                r0.setDb(r2)     // Catch: java.lang.Throwable -> L18
                r4.opened = r3     // Catch: java.lang.Throwable -> L18
                androidx.sqlite.util.ProcessLock r0 = r4.lock
                r0.unlock()
                return
            L18:
                r0 = move-exception
                androidx.sqlite.util.ProcessLock r1 = r4.lock
                r1.unlock()
                throw r0
        }

        public final boolean getAllowDataLossOnRecovery() {
                r1 = this;
                boolean r0 = r1.allowDataLossOnRecovery
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final androidx.sqlite.db.SupportSQLiteOpenHelper.Callback getCallback() {
                r1 = this;
                androidx.sqlite.db.SupportSQLiteOpenHelper$Callback r0 = r1.callback
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final android.content.Context getContext() {
                r1 = this;
                android.content.Context r0 = r1.context
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.DBRefHolder getDbRef() {
                r1 = this;
                androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$DBRefHolder r0 = r1.dbRef
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final androidx.sqlite.db.SupportSQLiteDatabase getSupportDatabase(boolean r4) {
                r3 = this;
                androidx.sqlite.util.ProcessLock r0 = r3.lock     // Catch: java.lang.Throwable -> Lf
                boolean r1 = r3.opened     // Catch: java.lang.Throwable -> Lf
                r2 = 0
                if (r1 != 0) goto L11
                java.lang.String r1 = r3.getDatabaseName()     // Catch: java.lang.Throwable -> Lf
                if (r1 == 0) goto L11
                r1 = 1
                goto L12
            Lf:
                r4 = move-exception
                goto L31
            L11:
                r1 = 0
            L12:
                r0.lock(r1)     // Catch: java.lang.Throwable -> Lf
                r3.migrated = r2     // Catch: java.lang.Throwable -> Lf
                android.database.sqlite.SQLiteDatabase r0 = r3.innerGetDatabase(r4)     // Catch: java.lang.Throwable -> Lf
                boolean r1 = r3.migrated     // Catch: java.lang.Throwable -> Lf
                if (r1 == 0) goto L2c
                r3.close()     // Catch: java.lang.Throwable -> Lf
                androidx.sqlite.db.SupportSQLiteDatabase r4 = r3.getSupportDatabase(r4)     // Catch: java.lang.Throwable -> Lf
            L26:
                androidx.sqlite.util.ProcessLock r0 = r3.lock
                r0.unlock()
                return r4
            L2c:
                androidx.sqlite.db.framework.FrameworkSQLiteDatabase r4 = r3.getWrappedDb(r0)     // Catch: java.lang.Throwable -> Lf
                goto L26
            L31:
                androidx.sqlite.util.ProcessLock r0 = r3.lock
                r0.unlock()
                throw r4
        }

        @org.jetbrains.annotations.NotNull
        public final androidx.sqlite.db.framework.FrameworkSQLiteDatabase getWrappedDb(@org.jetbrains.annotations.NotNull android.database.sqlite.SQLiteDatabase r3) {
                r2 = this;
                java.lang.String r0 = "sqLiteDatabase"
                kotlin.jvm.internal.g0.p(r3, r0)
                androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$Companion r0 = androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.Companion
                androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$DBRefHolder r1 = r2.dbRef
                androidx.sqlite.db.framework.FrameworkSQLiteDatabase r3 = r0.getWrappedDb(r1, r3)
                return r3
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(@org.jetbrains.annotations.NotNull android.database.sqlite.SQLiteDatabase r3) {
                r2 = this;
                java.lang.String r0 = "db"
                kotlin.jvm.internal.g0.p(r3, r0)
                boolean r0 = r2.migrated
                if (r0 != 0) goto L17
                androidx.sqlite.db.SupportSQLiteOpenHelper$Callback r0 = r2.callback
                int r0 = r0.version
                int r1 = r3.getVersion()
                if (r0 == r1) goto L17
                r0 = 1
                r3.setMaxSqlCacheSize(r0)
            L17:
                androidx.sqlite.db.SupportSQLiteOpenHelper$Callback r0 = r2.callback     // Catch: java.lang.Throwable -> L21
                androidx.sqlite.db.framework.FrameworkSQLiteDatabase r3 = r2.getWrappedDb(r3)     // Catch: java.lang.Throwable -> L21
                r0.onConfigure(r3)     // Catch: java.lang.Throwable -> L21
                return
            L21:
                r3 = move-exception
                androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackException r0 = new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackException
                androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName r1 = androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_CONFIGURE
                r0.<init>(r1, r3)
                throw r0
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(@org.jetbrains.annotations.NotNull android.database.sqlite.SQLiteDatabase r3) {
                r2 = this;
                java.lang.String r0 = "sqLiteDatabase"
                kotlin.jvm.internal.g0.p(r3, r0)
                androidx.sqlite.db.SupportSQLiteOpenHelper$Callback r0 = r2.callback     // Catch: java.lang.Throwable -> Lf
                androidx.sqlite.db.framework.FrameworkSQLiteDatabase r3 = r2.getWrappedDb(r3)     // Catch: java.lang.Throwable -> Lf
                r0.onCreate(r3)     // Catch: java.lang.Throwable -> Lf
                return
            Lf:
                r3 = move-exception
                androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackException r0 = new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackException
                androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName r1 = androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_CREATE
                r0.<init>(r1, r3)
                throw r0
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(@org.jetbrains.annotations.NotNull android.database.sqlite.SQLiteDatabase r2, int r3, int r4) {
                r1 = this;
                java.lang.String r0 = "db"
                kotlin.jvm.internal.g0.p(r2, r0)
                r0 = 1
                r1.migrated = r0
                androidx.sqlite.db.SupportSQLiteOpenHelper$Callback r0 = r1.callback     // Catch: java.lang.Throwable -> L12
                androidx.sqlite.db.framework.FrameworkSQLiteDatabase r2 = r1.getWrappedDb(r2)     // Catch: java.lang.Throwable -> L12
                r0.onDowngrade(r2, r3, r4)     // Catch: java.lang.Throwable -> L12
                return
            L12:
                r2 = move-exception
                androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackException r3 = new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackException
                androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName r4 = androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_DOWNGRADE
                r3.<init>(r4, r2)
                throw r3
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(@org.jetbrains.annotations.NotNull android.database.sqlite.SQLiteDatabase r3) {
                r2 = this;
                java.lang.String r0 = "db"
                kotlin.jvm.internal.g0.p(r3, r0)
                boolean r0 = r2.migrated
                if (r0 != 0) goto L1c
                androidx.sqlite.db.SupportSQLiteOpenHelper$Callback r0 = r2.callback     // Catch: java.lang.Throwable -> L13
                androidx.sqlite.db.framework.FrameworkSQLiteDatabase r3 = r2.getWrappedDb(r3)     // Catch: java.lang.Throwable -> L13
                r0.onOpen(r3)     // Catch: java.lang.Throwable -> L13
                goto L1c
            L13:
                r3 = move-exception
                androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackException r0 = new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackException
                androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName r1 = androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_OPEN
                r0.<init>(r1, r3)
                throw r0
            L1c:
                r3 = 1
                r2.opened = r3
                return
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(@org.jetbrains.annotations.NotNull android.database.sqlite.SQLiteDatabase r2, int r3, int r4) {
                r1 = this;
                java.lang.String r0 = "sqLiteDatabase"
                kotlin.jvm.internal.g0.p(r2, r0)
                r0 = 1
                r1.migrated = r0
                androidx.sqlite.db.SupportSQLiteOpenHelper$Callback r0 = r1.callback     // Catch: java.lang.Throwable -> L12
                androidx.sqlite.db.framework.FrameworkSQLiteDatabase r2 = r1.getWrappedDb(r2)     // Catch: java.lang.Throwable -> L12
                r0.onUpgrade(r2, r3, r4)     // Catch: java.lang.Throwable -> L12
                return
            L12:
                r2 = move-exception
                androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackException r3 = new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackException
                androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName r4 = androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_UPGRADE
                r3.<init>(r4, r2)
                throw r3
        }
    }

    static {
            androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$Companion r0 = new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.Companion = r0
            return
    }

    @kotlin.jvm.JvmOverloads
    public FrameworkSQLiteOpenHelper(@org.jetbrains.annotations.NotNull android.content.Context r10, @org.jetbrains.annotations.Nullable java.lang.String r11, @org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteOpenHelper.Callback r12) {
            r9 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.g0.p(r12, r0)
            r7 = 24
            r8 = 0
            r5 = 0
            r6 = 0
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
    }

    @kotlin.jvm.JvmOverloads
    public FrameworkSQLiteOpenHelper(@org.jetbrains.annotations.NotNull android.content.Context r10, @org.jetbrains.annotations.Nullable java.lang.String r11, @org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteOpenHelper.Callback r12, boolean r13) {
            r9 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.g0.p(r12, r0)
            r7 = 16
            r8 = 0
            r6 = 0
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
    }

    @kotlin.jvm.JvmOverloads
    public FrameworkSQLiteOpenHelper(@org.jetbrains.annotations.NotNull android.content.Context r2, @org.jetbrains.annotations.Nullable java.lang.String r3, @org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteOpenHelper.Callback r4, boolean r5, boolean r6) {
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>()
            r1.context = r2
            r1.name = r3
            r1.callback = r4
            r1.useNoBackupDirectory = r5
            r1.allowDataLossOnRecovery = r6
            androidx.sqlite.db.framework.f r2 = new androidx.sqlite.db.framework.f
            r2.<init>(r1)
            kotlin.s r2 = kotlin.t.c(r2)
            r1.lazyDelegate = r2
            return
    }

    public /* synthetic */ FrameworkSQLiteOpenHelper(android.content.Context r2, java.lang.String r3, androidx.sqlite.db.SupportSQLiteOpenHelper.Callback r4, boolean r5, boolean r6, int r7, kotlin.jvm.internal.v r8) {
            r1 = this;
            r8 = r7 & 8
            r0 = 0
            if (r8 == 0) goto L6
            r5 = 0
        L6:
            r7 = r7 & 16
            if (r7 == 0) goto L11
            r7 = 0
        Lb:
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            goto L13
        L11:
            r7 = r6
            goto Lb
        L13:
            r2.<init>(r3, r4, r5, r6, r7)
            return
    }

    public static /* synthetic */ androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper a(androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper r0) {
            androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper r0 = lazyDelegate$lambda$0(r0)
            return r0
    }

    private final androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper getDelegate() {
            r1 = this;
            kotlin.s<androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper> r0 = r1.lazyDelegate
            java.lang.Object r0 = r0.getValue()
            androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper r0 = (androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper) r0
            return r0
    }

    private static java.lang.Object getDelegate$delegate(androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper r0) {
            kotlin.s<androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper> r0 = r0.lazyDelegate
            return r0
    }

    private static final androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper lazyDelegate$lambda$0(androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper r11) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            r2 = 0
            if (r0 < r1) goto L31
            java.lang.String r0 = r11.name
            if (r0 == 0) goto L31
            boolean r0 = r11.useNoBackupDirectory
            if (r0 == 0) goto L31
            java.io.File r0 = new java.io.File
            android.content.Context r1 = r11.context
            java.io.File r1 = androidx.sqlite.db.SupportSQLiteCompat.Api21Impl.getNoBackupFilesDir(r1)
            java.lang.String r3 = r11.name
            r0.<init>(r1, r3)
            androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper r4 = new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper
            android.content.Context r5 = r11.context
            java.lang.String r6 = r0.getAbsolutePath()
            androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$DBRefHolder r7 = new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$DBRefHolder
            r7.<init>(r2)
            androidx.sqlite.db.SupportSQLiteOpenHelper$Callback r8 = r11.callback
            boolean r9 = r11.allowDataLossOnRecovery
            r4.<init>(r5, r6, r7, r8, r9)
            goto L44
        L31:
            androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper r5 = new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper
            android.content.Context r6 = r11.context
            java.lang.String r7 = r11.name
            androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$DBRefHolder r8 = new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$DBRefHolder
            r8.<init>(r2)
            androidx.sqlite.db.SupportSQLiteOpenHelper$Callback r9 = r11.callback
            boolean r10 = r11.allowDataLossOnRecovery
            r5.<init>(r6, r7, r8, r9, r10)
            r4 = r5
        L44:
            boolean r11 = r11.writeAheadLoggingEnabled
            r4.setWriteAheadLoggingEnabled(r11)
            return r4
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            kotlin.s<androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper> r0 = r1.lazyDelegate
            boolean r0 = r0.isInitialized()
            if (r0 == 0) goto Lf
            androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper r0 = r1.getDelegate()
            r0.close()
        Lf:
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @org.jetbrains.annotations.Nullable
    public java.lang.String getDatabaseName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @org.jetbrains.annotations.NotNull
    public androidx.sqlite.db.SupportSQLiteDatabase getReadableDatabase() {
            r2 = this;
            androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper r0 = r2.getDelegate()
            r1 = 0
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r0.getSupportDatabase(r1)
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @org.jetbrains.annotations.NotNull
    public androidx.sqlite.db.SupportSQLiteDatabase getWritableDatabase() {
            r2 = this;
            androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper r0 = r2.getDelegate()
            r1 = 1
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r0.getSupportDatabase(r1)
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public void setWriteAheadLoggingEnabled(boolean r2) {
            r1 = this;
            kotlin.s<androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper> r0 = r1.lazyDelegate
            boolean r0 = r0.isInitialized()
            if (r0 == 0) goto Lf
            androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper r0 = r1.getDelegate()
            r0.setWriteAheadLoggingEnabled(r2)
        Lf:
            r1.writeAheadLoggingEnabled = r2
            return
    }
}
