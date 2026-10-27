package androidx.sqlite.db;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface SupportSQLiteOpenHelper extends java.io.Closeable {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSupportSQLiteOpenHelper.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportSQLiteOpenHelper.android.kt\nandroidx/sqlite/db/SupportSQLiteOpenHelper$Callback\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,366:1\n1#2:367\n1863#3,2:368\n108#4:370\n80#4,22:371\n*S KotlinDebug\n*F\n+ 1 SupportSQLiteOpenHelper.android.kt\nandroidx/sqlite/db/SupportSQLiteOpenHelper$Callback\n*L\n220#1:368,2\n228#1:370\n228#1:371,22\n*E\n"})
    public static abstract class Callback {

        @org.jetbrains.annotations.NotNull
        public static final androidx.sqlite.db.SupportSQLiteOpenHelper.Callback.Companion Companion = null;

        @org.jetbrains.annotations.NotNull
        private static final java.lang.String TAG = "SupportSQLite";

        @kotlin.jvm.JvmField
        public final int version;

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
                androidx.sqlite.db.SupportSQLiteOpenHelper$Callback$Companion r0 = new androidx.sqlite.db.SupportSQLiteOpenHelper$Callback$Companion
                r1 = 0
                r0.<init>(r1)
                androidx.sqlite.db.SupportSQLiteOpenHelper.Callback.Companion = r0
                return
        }

        public Callback(int r1) {
                r0 = this;
                r0.<init>()
                r0.version = r1
                return
        }

        private final void deleteDatabaseFile(java.lang.String r8) {
                r7 = this;
                java.lang.String r0 = ":memory:"
                r1 = 1
                boolean r0 = kotlin.text.u.a2(r8, r0, r1)
                if (r0 != 0) goto L4e
                int r0 = r8.length()
                int r0 = r0 - r1
                r2 = 0
                r3 = 0
                r4 = 0
            L11:
                if (r3 > r0) goto L36
                if (r4 != 0) goto L17
                r5 = r3
                goto L18
            L17:
                r5 = r0
            L18:
                char r5 = r8.charAt(r5)
                r6 = 32
                int r5 = kotlin.jvm.internal.g0.t(r5, r6)
                if (r5 > 0) goto L26
                r5 = 1
                goto L27
            L26:
                r5 = 0
            L27:
                if (r4 != 0) goto L30
                if (r5 != 0) goto L2d
                r4 = 1
                goto L11
            L2d:
                int r3 = r3 + 1
                goto L11
            L30:
                if (r5 != 0) goto L33
                goto L36
            L33:
                int r0 = r0 + (-1)
                goto L11
            L36:
                int r0 = r0 + r1
                java.lang.CharSequence r0 = r8.subSequence(r3, r0)
                java.lang.String r0 = r0.toString()
                int r0 = r0.length()
                if (r0 != 0) goto L46
                return
            L46:
                java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L4e
                r0.<init>(r8)     // Catch: java.lang.Exception -> L4e
                android.database.sqlite.SQLiteDatabase.deleteDatabase(r0)     // Catch: java.lang.Exception -> L4e
            L4e:
                return
        }

        public void onConfigure(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteDatabase r2) {
                r1 = this;
                java.lang.String r0 = "db"
                kotlin.jvm.internal.g0.p(r2, r0)
                return
        }

        public void onCorruption(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteDatabase r4) {
                r3 = this;
                java.lang.String r0 = "second"
                java.lang.String r1 = "db"
                kotlin.jvm.internal.g0.p(r4, r1)
                java.util.Objects.toString(r4)
                boolean r1 = r4.isOpen()
                if (r1 != 0) goto L1a
                java.lang.String r4 = r4.getPath()
                if (r4 == 0) goto L78
                r3.deleteDatabaseFile(r4)
                return
            L1a:
                r1 = 0
                java.util.List r1 = r4.getAttachedDbs()     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L22
                goto L22
            L20:
                r2 = move-exception
                goto L26
            L22:
                r4.close()     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L4f
                goto L50
            L26:
                if (r1 == 0) goto L45
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Iterator r4 = r1.iterator()
            L2e:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L4e
                java.lang.Object r1 = r4.next()
                android.util.Pair r1 = (android.util.Pair) r1
                java.lang.Object r1 = r1.second
                kotlin.jvm.internal.g0.o(r1, r0)
                java.lang.String r1 = (java.lang.String) r1
                r3.deleteDatabaseFile(r1)
                goto L2e
            L45:
                java.lang.String r4 = r4.getPath()
                if (r4 == 0) goto L4e
                r3.deleteDatabaseFile(r4)
            L4e:
                throw r2
            L4f:
            L50:
                if (r1 == 0) goto L6f
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Iterator r4 = r1.iterator()
            L58:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L78
                java.lang.Object r1 = r4.next()
                android.util.Pair r1 = (android.util.Pair) r1
                java.lang.Object r1 = r1.second
                kotlin.jvm.internal.g0.o(r1, r0)
                java.lang.String r1 = (java.lang.String) r1
                r3.deleteDatabaseFile(r1)
                goto L58
            L6f:
                java.lang.String r4 = r4.getPath()
                if (r4 == 0) goto L78
                r3.deleteDatabaseFile(r4)
            L78:
                return
        }

        public abstract void onCreate(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteDatabase r1);

        public void onDowngrade(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteDatabase r3, int r4, int r5) {
                r2 = this;
                java.lang.String r0 = "db"
                kotlin.jvm.internal.g0.p(r3, r0)
                android.database.sqlite.SQLiteException r3 = new android.database.sqlite.SQLiteException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Can't downgrade database from version "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = " to "
                r0.append(r4)
                r0.append(r5)
                java.lang.String r4 = r0.toString()
                r3.<init>(r4)
                throw r3
        }

        public void onOpen(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteDatabase r2) {
                r1 = this;
                java.lang.String r0 = "db"
                kotlin.jvm.internal.g0.p(r2, r0)
                return
        }

        public abstract void onUpgrade(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteDatabase r1, int r2, int r3);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Configuration {

        @org.jetbrains.annotations.NotNull
        public static final androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.Companion Companion = null;

        @kotlin.jvm.JvmField
        public final boolean allowDataLossOnRecovery;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final androidx.sqlite.db.SupportSQLiteOpenHelper.Callback callback;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final android.content.Context context;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.Nullable
        public final java.lang.String name;

        @kotlin.jvm.JvmField
        public final boolean useNoBackupDirectory;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSupportSQLiteOpenHelper.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportSQLiteOpenHelper.android.kt\nandroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,366:1\n1#2:367\n*E\n"})
        public static class Builder {
            private boolean allowDataLossOnRecovery;

            @org.jetbrains.annotations.Nullable
            private androidx.sqlite.db.SupportSQLiteOpenHelper.Callback callback;

            @org.jetbrains.annotations.NotNull
            private final android.content.Context context;

            @org.jetbrains.annotations.Nullable
            private java.lang.String name;
            private boolean useNoBackupDirectory;

            public Builder(@org.jetbrains.annotations.NotNull android.content.Context r2) {
                    r1 = this;
                    java.lang.String r0 = "context"
                    kotlin.jvm.internal.g0.p(r2, r0)
                    r1.<init>()
                    r1.context = r2
                    return
            }

            @org.jetbrains.annotations.NotNull
            public androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.Builder allowDataLossOnRecovery(boolean r1) {
                    r0 = this;
                    r0.allowDataLossOnRecovery = r1
                    return r0
            }

            @org.jetbrains.annotations.NotNull
            public androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration build() {
                    r6 = this;
                    androidx.sqlite.db.SupportSQLiteOpenHelper$Callback r3 = r6.callback
                    if (r3 == 0) goto L29
                    boolean r0 = r6.useNoBackupDirectory
                    if (r0 == 0) goto L1b
                    java.lang.String r0 = r6.name
                    if (r0 == 0) goto L13
                    int r0 = r0.length()
                    if (r0 == 0) goto L13
                    goto L1b
                L13:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.String r1 = "Must set a non-null database name to a configuration that uses the no backup directory."
                    r0.<init>(r1)
                    throw r0
                L1b:
                    androidx.sqlite.db.SupportSQLiteOpenHelper$Configuration r0 = new androidx.sqlite.db.SupportSQLiteOpenHelper$Configuration
                    android.content.Context r1 = r6.context
                    java.lang.String r2 = r6.name
                    boolean r4 = r6.useNoBackupDirectory
                    boolean r5 = r6.allowDataLossOnRecovery
                    r0.<init>(r1, r2, r3, r4, r5)
                    return r0
                L29:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.String r1 = "Must set a callback to create the configuration."
                    r0.<init>(r1)
                    throw r0
            }

            @org.jetbrains.annotations.NotNull
            public androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.Builder callback(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteOpenHelper.Callback r2) {
                    r1 = this;
                    java.lang.String r0 = "callback"
                    kotlin.jvm.internal.g0.p(r2, r0)
                    r1.callback = r2
                    return r1
            }

            @org.jetbrains.annotations.NotNull
            public androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.Builder name(@org.jetbrains.annotations.Nullable java.lang.String r1) {
                    r0 = this;
                    r0.name = r1
                    return r0
            }

            @org.jetbrains.annotations.NotNull
            public androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.Builder noBackupDirectory(boolean r1) {
                    r0 = this;
                    r0.useNoBackupDirectory = r1
                    return r0
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

            @kotlin.jvm.JvmStatic
            @org.jetbrains.annotations.NotNull
            public final androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.Builder builder(@org.jetbrains.annotations.NotNull android.content.Context r2) {
                    r1 = this;
                    java.lang.String r0 = "context"
                    kotlin.jvm.internal.g0.p(r2, r0)
                    androidx.sqlite.db.SupportSQLiteOpenHelper$Configuration$Builder r0 = new androidx.sqlite.db.SupportSQLiteOpenHelper$Configuration$Builder
                    r0.<init>(r2)
                    return r0
            }
        }

        static {
                androidx.sqlite.db.SupportSQLiteOpenHelper$Configuration$Companion r0 = new androidx.sqlite.db.SupportSQLiteOpenHelper$Configuration$Companion
                r1 = 0
                r0.<init>(r1)
                androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.Companion = r0
                return
        }

        public Configuration(@org.jetbrains.annotations.NotNull android.content.Context r2, @org.jetbrains.annotations.Nullable java.lang.String r3, @org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteOpenHelper.Callback r4, boolean r5, boolean r6) {
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
                return
        }

        public /* synthetic */ Configuration(android.content.Context r2, java.lang.String r3, androidx.sqlite.db.SupportSQLiteOpenHelper.Callback r4, boolean r5, boolean r6, int r7, kotlin.jvm.internal.v r8) {
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

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public static final androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.Builder builder(@org.jetbrains.annotations.NotNull android.content.Context r1) {
                androidx.sqlite.db.SupportSQLiteOpenHelper$Configuration$Companion r0 = androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.Companion
                androidx.sqlite.db.SupportSQLiteOpenHelper$Configuration$Builder r1 = r0.builder(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Factory {
        @org.jetbrains.annotations.NotNull
        androidx.sqlite.db.SupportSQLiteOpenHelper create(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration r1);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    @org.jetbrains.annotations.Nullable
    java.lang.String getDatabaseName();

    @org.jetbrains.annotations.NotNull
    androidx.sqlite.db.SupportSQLiteDatabase getReadableDatabase();

    @org.jetbrains.annotations.NotNull
    androidx.sqlite.db.SupportSQLiteDatabase getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean r1);
}
