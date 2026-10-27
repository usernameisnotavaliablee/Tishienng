package androidx.room.support;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class PrePackagedCopyOpenHelper implements androidx.sqlite.db.SupportSQLiteOpenHelper, androidx.room.DelegatingOpenHelper {

    @org.jetbrains.annotations.NotNull
    private final android.content.Context context;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String copyFromAssetPath;

    @org.jetbrains.annotations.Nullable
    private final java.io.File copyFromFile;

    @org.jetbrains.annotations.Nullable
    private final java.util.concurrent.Callable<java.io.InputStream> copyFromInputStream;
    private androidx.room.DatabaseConfiguration databaseConfiguration;
    private final int databaseVersion;

    @org.jetbrains.annotations.NotNull
    private final androidx.sqlite.db.SupportSQLiteOpenHelper delegate;
    private boolean verified;

    public PrePackagedCopyOpenHelper(@org.jetbrains.annotations.NotNull android.content.Context r2, @org.jetbrains.annotations.Nullable java.lang.String r3, @org.jetbrains.annotations.Nullable java.io.File r4, @org.jetbrains.annotations.Nullable java.util.concurrent.Callable<java.io.InputStream> r5, int r6, @org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteOpenHelper r7) {
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "delegate"
            kotlin.jvm.internal.g0.p(r7, r0)
            r1.<init>()
            r1.context = r2
            r1.copyFromAssetPath = r3
            r1.copyFromFile = r4
            r1.copyFromInputStream = r5
            r1.databaseVersion = r6
            r1.delegate = r7
            return
    }

    private final void copyDatabaseFile(java.io.File r5, boolean r6) throws java.io.IOException {
            r4 = this;
            java.lang.String r0 = r4.copyFromAssetPath
            if (r0 == 0) goto L15
            android.content.Context r0 = r4.context
            android.content.res.AssetManager r0 = r0.getAssets()
            java.lang.String r1 = r4.copyFromAssetPath
            java.io.InputStream r0 = r0.open(r1)
            java.nio.channels.ReadableByteChannel r0 = java.nio.channels.Channels.newChannel(r0)
            goto L33
        L15:
            java.io.File r0 = r4.copyFromFile
            if (r0 == 0) goto L25
            java.io.FileInputStream r0 = new java.io.FileInputStream
            java.io.File r1 = r4.copyFromFile
            r0.<init>(r1)
            java.nio.channels.FileChannel r0 = r0.getChannel()
            goto L33
        L25:
            java.util.concurrent.Callable<java.io.InputStream> r0 = r4.copyFromInputStream
            if (r0 == 0) goto Lc3
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Exception -> Lba
            java.io.InputStream r0 = (java.io.InputStream) r0     // Catch: java.lang.Exception -> Lba
            java.nio.channels.ReadableByteChannel r0 = java.nio.channels.Channels.newChannel(r0)
        L33:
            android.content.Context r1 = r4.context
            java.io.File r1 = r1.getCacheDir()
            java.lang.String r2 = "room-copy-helper"
            java.lang.String r3 = ".tmp"
            java.io.File r1 = java.io.File.createTempFile(r2, r3, r1)
            r1.deleteOnExit()
            java.io.FileOutputStream r2 = new java.io.FileOutputStream
            r2.<init>(r1)
            java.nio.channels.FileChannel r2 = r2.getChannel()
            kotlin.jvm.internal.g0.m(r2)
            androidx.room.util.FileUtil.copy(r0, r2)
            java.io.File r0 = r5.getParentFile()
            if (r0 == 0) goto L81
            boolean r2 = r0.exists()
            if (r2 != 0) goto L81
            boolean r0 = r0.mkdirs()
            if (r0 == 0) goto L66
            goto L81
        L66:
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to create directories for "
            r0.append(r1)
            java.lang.String r5 = r5.getAbsolutePath()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        L81:
            kotlin.jvm.internal.g0.m(r1)
            r4.dispatchOnOpenPrepackagedDatabase(r1, r6)
            boolean r6 = r1.renameTo(r5)
            if (r6 == 0) goto L8e
            return
        L8e:
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Failed to move intermediate file ("
            r0.append(r2)
            java.lang.String r1 = r1.getAbsolutePath()
            r0.append(r1)
            java.lang.String r1 = ") to destination ("
            r0.append(r1)
            java.lang.String r5 = r5.getAbsolutePath()
            r0.append(r5)
            java.lang.String r5 = ")."
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        Lba:
            r5 = move-exception
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = "inputStreamCallable exception on call"
            r6.<init>(r0, r5)
            throw r6
        Lc3:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "copyFromAssetPath, copyFromFile and copyFromInputStream are all null!"
            r5.<init>(r6)
            throw r5
    }

    private final androidx.sqlite.db.SupportSQLiteOpenHelper createFrameworkOpenHelper(java.io.File r5) {
            r4 = this;
            int r0 = androidx.room.util.DBUtil.readVersion(r5)     // Catch: java.io.IOException -> L30
            androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory r1 = new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory
            r1.<init>()
            androidx.sqlite.db.SupportSQLiteOpenHelper$Configuration$Companion r2 = androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.Companion
            android.content.Context r3 = r4.context
            androidx.sqlite.db.SupportSQLiteOpenHelper$Configuration$Builder r2 = r2.builder(r3)
            java.lang.String r5 = r5.getAbsolutePath()
            androidx.sqlite.db.SupportSQLiteOpenHelper$Configuration$Builder r5 = r2.name(r5)
            r2 = 1
            int r2 = kotlin.ranges.t.u(r0, r2)
            androidx.room.support.PrePackagedCopyOpenHelper$createFrameworkOpenHelper$configuration$1 r3 = new androidx.room.support.PrePackagedCopyOpenHelper$createFrameworkOpenHelper$configuration$1
            r3.<init>(r0, r2)
            androidx.sqlite.db.SupportSQLiteOpenHelper$Configuration$Builder r5 = r5.callback(r3)
            androidx.sqlite.db.SupportSQLiteOpenHelper$Configuration r5 = r5.build()
            androidx.sqlite.db.SupportSQLiteOpenHelper r5 = r1.create(r5)
            return r5
        L30:
            r5 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Malformed database file, unable to read version."
            r0.<init>(r1, r5)
            throw r0
    }

    private final void dispatchOnOpenPrepackagedDatabase(java.io.File r4, boolean r5) {
            r3 = this;
            androidx.room.DatabaseConfiguration r0 = r3.databaseConfiguration
            java.lang.String r1 = "databaseConfiguration"
            r2 = 0
            if (r0 != 0) goto Lb
            kotlin.jvm.internal.g0.S(r1)
            r0 = r2
        Lb:
            androidx.room.RoomDatabase$PrepackagedDatabaseCallback r0 = r0.prepackagedDatabaseCallback
            if (r0 != 0) goto L10
            return
        L10:
            androidx.sqlite.db.SupportSQLiteOpenHelper r4 = r3.createFrameworkOpenHelper(r4)
            if (r5 == 0) goto L1d
            androidx.sqlite.db.SupportSQLiteDatabase r5 = r4.getWritableDatabase()     // Catch: java.lang.Throwable -> L1b
            goto L21
        L1b:
            r5 = move-exception
            goto L37
        L1d:
            androidx.sqlite.db.SupportSQLiteDatabase r5 = r4.getReadableDatabase()     // Catch: java.lang.Throwable -> L1b
        L21:
            androidx.room.DatabaseConfiguration r0 = r3.databaseConfiguration     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L29
            kotlin.jvm.internal.g0.S(r1)     // Catch: java.lang.Throwable -> L1b
            r0 = r2
        L29:
            androidx.room.RoomDatabase$PrepackagedDatabaseCallback r0 = r0.prepackagedDatabaseCallback     // Catch: java.lang.Throwable -> L1b
            kotlin.jvm.internal.g0.m(r0)     // Catch: java.lang.Throwable -> L1b
            r0.onOpenPrepackagedDatabase(r5)     // Catch: java.lang.Throwable -> L1b
            kotlin.n1 r5 = kotlin.n1.a     // Catch: java.lang.Throwable -> L1b
            kotlin.io.b.a(r4, r2)
            return
        L37:
            throw r5     // Catch: java.lang.Throwable -> L38
        L38:
            r0 = move-exception
            kotlin.io.b.a(r4, r5)
            throw r0
    }

    private final void verifyDatabaseFile(boolean r8) {
            r7 = this;
            java.lang.String r0 = r7.getDatabaseName()
            if (r0 == 0) goto L81
            android.content.Context r1 = r7.context
            java.io.File r1 = r1.getDatabasePath(r0)
            androidx.room.DatabaseConfiguration r2 = r7.databaseConfiguration
            java.lang.String r3 = "databaseConfiguration"
            r4 = 0
            if (r2 != 0) goto L17
            kotlin.jvm.internal.g0.S(r3)
            r2 = r4
        L17:
            boolean r2 = r2.multiInstanceInvalidation
            androidx.sqlite.util.ProcessLock r5 = new androidx.sqlite.util.ProcessLock
            android.content.Context r6 = r7.context
            java.io.File r6 = r6.getFilesDir()
            r5.<init>(r0, r6, r2)
            r2 = 0
            r6 = 1
            androidx.sqlite.util.ProcessLock.lock$default(r5, r2, r6, r4)     // Catch: java.lang.Throwable -> L39
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> L39
            if (r2 != 0) goto L44
            kotlin.jvm.internal.g0.m(r1)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            r7.copyDatabaseFile(r1, r8)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            r5.unlock()
            return
        L39:
            r8 = move-exception
            goto L7d
        L3b:
            r8 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L39
            java.lang.String r1 = "Unable to copy database file."
            r0.<init>(r1, r8)     // Catch: java.lang.Throwable -> L39
            throw r0     // Catch: java.lang.Throwable -> L39
        L44:
            kotlin.jvm.internal.g0.m(r1)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L79
            int r2 = androidx.room.util.DBUtil.readVersion(r1)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L79
            int r6 = r7.databaseVersion     // Catch: java.lang.Throwable -> L39
            if (r2 != r6) goto L53
            r5.unlock()
            return
        L53:
            androidx.room.DatabaseConfiguration r6 = r7.databaseConfiguration     // Catch: java.lang.Throwable -> L39
            if (r6 != 0) goto L5b
            kotlin.jvm.internal.g0.S(r3)     // Catch: java.lang.Throwable -> L39
            goto L5c
        L5b:
            r4 = r6
        L5c:
            int r3 = r7.databaseVersion     // Catch: java.lang.Throwable -> L39
            boolean r2 = r4.isMigrationRequired(r2, r3)     // Catch: java.lang.Throwable -> L39
            if (r2 == 0) goto L68
            r5.unlock()
            return
        L68:
            android.content.Context r2 = r7.context     // Catch: java.lang.Throwable -> L39
            boolean r0 = r2.deleteDatabase(r0)     // Catch: java.lang.Throwable -> L39
            if (r0 == 0) goto L75
            r7.copyDatabaseFile(r1, r8)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L75
            kotlin.n1 r8 = kotlin.n1.a     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L75
        L75:
            r5.unlock()
            return
        L79:
            r5.unlock()
            return
        L7d:
            r5.unlock()
            throw r8
        L81:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Required value was null."
            r8.<init>(r0)
            throw r8
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
            r1 = this;
            monitor-enter(r1)
            androidx.sqlite.db.SupportSQLiteOpenHelper r0 = r1.getDelegate()     // Catch: java.lang.Throwable -> Ld
            r0.close()     // Catch: java.lang.Throwable -> Ld
            r0 = 0
            r1.verified = r0     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return
        Ld:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @org.jetbrains.annotations.Nullable
    public java.lang.String getDatabaseName() {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteOpenHelper r0 = r1.getDelegate()
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
            boolean r0 = r1.verified
            if (r0 != 0) goto Lb
            r0 = 0
            r1.verifyDatabaseFile(r0)
            r0 = 1
            r1.verified = r0
        Lb:
            androidx.sqlite.db.SupportSQLiteOpenHelper r0 = r1.getDelegate()
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r0.getReadableDatabase()
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @org.jetbrains.annotations.NotNull
    public androidx.sqlite.db.SupportSQLiteDatabase getWritableDatabase() {
            r1 = this;
            boolean r0 = r1.verified
            if (r0 != 0) goto La
            r0 = 1
            r1.verifyDatabaseFile(r0)
            r1.verified = r0
        La:
            androidx.sqlite.db.SupportSQLiteOpenHelper r0 = r1.getDelegate()
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r0.getWritableDatabase()
            return r0
    }

    public final void setDatabaseConfiguration(@org.jetbrains.annotations.NotNull androidx.room.DatabaseConfiguration r2) {
            r1 = this;
            java.lang.String r0 = "databaseConfiguration"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.databaseConfiguration = r2
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public void setWriteAheadLoggingEnabled(boolean r2) {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteOpenHelper r0 = r1.getDelegate()
            r0.setWriteAheadLoggingEnabled(r2)
            return
    }
}
