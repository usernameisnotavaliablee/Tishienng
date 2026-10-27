package com.bxkj.student.v2.common.db;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.room.Database(entities = {l0.d.class, l0.c.class, l0.e.class, l0.b.class, l0.a.class}, exportSchema = true, version = 16)
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAppDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppDatabase.kt\ncom/bxkj/student/v2/common/db/AppDatabase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,247:1\n1#2:248\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class AppDatabase extends androidx.room.RoomDatabase {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.student.v2.common.db.AppDatabase.a a = null;

    @org.jetbrains.annotations.Nullable
    private static com.bxkj.student.v2.common.db.AppDatabase b;

    @org.jetbrains.annotations.NotNull
    private static final com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_2_3$1 c = null;

    @org.jetbrains.annotations.NotNull
    private static final com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_3_4$1 d = null;

    @org.jetbrains.annotations.NotNull
    private static final com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_4_5$1 e = null;

    @org.jetbrains.annotations.NotNull
    private static final com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_5_6$1 f = null;

    @org.jetbrains.annotations.NotNull
    private static final com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_6_7$1 g = null;

    @org.jetbrains.annotations.NotNull
    private static final com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_7_8$1 h = null;

    @org.jetbrains.annotations.NotNull
    private static final com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_8_9$1 i = null;

    @org.jetbrains.annotations.NotNull
    private static final com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_9_10$1 j = null;

    @org.jetbrains.annotations.NotNull
    private static final com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_10_11$1 k = null;

    /* renamed from: l, reason: collision with root package name */
    @org.jetbrains.annotations.NotNull
    private static final com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_11_12$1 f1358l = null;

    /* renamed from: m, reason: collision with root package name */
    @org.jetbrains.annotations.NotNull
    private static final com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_12_13$1 f1359m = null;

    /* renamed from: n, reason: collision with root package name */
    @org.jetbrains.annotations.NotNull
    private static final com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_13_14$1 f1360n = null;

    /* renamed from: o, reason: collision with root package name */
    @org.jetbrains.annotations.NotNull
    private static final com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_14_15$1 f1361o = null;

    /* renamed from: p, reason: collision with root package name */
    @org.jetbrains.annotations.NotNull
    private static final com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_15_16$1 f1362p = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAppDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppDatabase.kt\ncom/bxkj/student/v2/common/db/AppDatabase$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,247:1\n1#2:248\n*E\n"})
    public static final class a {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.NotNull
        public final com.bxkj.student.v2.common.db.AppDatabase a() {
                r2 = this;
                com.bxkj.student.v2.common.db.AppDatabase r0 = com.bxkj.student.v2.common.db.AppDatabase.u()
                if (r0 != 0) goto Lf
                com.bxkj.student.v2.common.db.AppDatabase r0 = r2.b()
                com.bxkj.student.v2.common.db.AppDatabase$a r1 = com.bxkj.student.v2.common.db.AppDatabase.a
                com.bxkj.student.v2.common.db.AppDatabase.v(r0)
            Lf:
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final com.bxkj.student.v2.common.db.AppDatabase b() {
                r5 = this;
                monitor-enter(r5)
                java.lang.String r0 = "TSNStudent.db"
                b0.b r1 = b0.b.a     // Catch: java.lang.Throwable -> Lea
                com.bxkj.student.App$a r2 = com.bxkj.student.App.d     // Catch: java.lang.Throwable -> Lea
                com.bxkj.student.App r3 = r2.a()     // Catch: java.lang.Throwable -> Lea
                java.lang.String r1 = r1.k(r3)     // Catch: java.lang.Throwable -> Lea
                char[] r1 = r1.toCharArray()     // Catch: java.lang.Throwable -> Lea
                java.lang.String r3 = "toCharArray(...)"
                kotlin.jvm.internal.g0.o(r1, r3)     // Catch: java.lang.Throwable -> Lea
                byte[] r1 = net.sqlcipher.database.SQLiteDatabase.getBytes(r1)     // Catch: java.lang.Throwable -> Lea
                java.lang.String r3 = "getBytes(...)"
                kotlin.jvm.internal.g0.o(r1, r3)     // Catch: java.lang.Throwable -> Lea
                net.sqlcipher.database.SupportFactory r3 = new net.sqlcipher.database.SupportFactory     // Catch: java.lang.Throwable -> Lea
                r3.<init>(r1)     // Catch: java.lang.Throwable -> Lea
                com.bxkj.student.App r1 = r2.a()     // Catch: java.lang.Throwable -> Lea
                java.lang.Class<com.bxkj.student.v2.common.db.AppDatabase> r2 = com.bxkj.student.v2.common.db.AppDatabase.class
                androidx.room.RoomDatabase$Builder r0 = androidx.room.Room.databaseBuilder(r1, r2, r0)     // Catch: java.lang.Throwable -> Lea
                androidx.room.RoomDatabase$Builder r0 = r0.openHelperFactory(r3)     // Catch: java.lang.Throwable -> Lea
                com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_2_3$1 r1 = com.bxkj.student.v2.common.db.AppDatabase.m()     // Catch: java.lang.Throwable -> Lea
                r2 = 1
                androidx.room.migration.Migration[] r3 = new androidx.room.migration.Migration[r2]     // Catch: java.lang.Throwable -> Lea
                r4 = 0
                r3[r4] = r1     // Catch: java.lang.Throwable -> Lea
                androidx.room.RoomDatabase$Builder r0 = r0.addMigrations(r3)     // Catch: java.lang.Throwable -> Lea
                com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_3_4$1 r1 = com.bxkj.student.v2.common.db.AppDatabase.n()     // Catch: java.lang.Throwable -> Lea
                androidx.room.migration.Migration[] r3 = new androidx.room.migration.Migration[r2]     // Catch: java.lang.Throwable -> Lea
                r3[r4] = r1     // Catch: java.lang.Throwable -> Lea
                androidx.room.RoomDatabase$Builder r0 = r0.addMigrations(r3)     // Catch: java.lang.Throwable -> Lea
                com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_4_5$1 r1 = com.bxkj.student.v2.common.db.AppDatabase.o()     // Catch: java.lang.Throwable -> Lea
                androidx.room.migration.Migration[] r3 = new androidx.room.migration.Migration[r2]     // Catch: java.lang.Throwable -> Lea
                r3[r4] = r1     // Catch: java.lang.Throwable -> Lea
                androidx.room.RoomDatabase$Builder r0 = r0.addMigrations(r3)     // Catch: java.lang.Throwable -> Lea
                com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_5_6$1 r1 = com.bxkj.student.v2.common.db.AppDatabase.p()     // Catch: java.lang.Throwable -> Lea
                androidx.room.migration.Migration[] r3 = new androidx.room.migration.Migration[r2]     // Catch: java.lang.Throwable -> Lea
                r3[r4] = r1     // Catch: java.lang.Throwable -> Lea
                androidx.room.RoomDatabase$Builder r0 = r0.addMigrations(r3)     // Catch: java.lang.Throwable -> Lea
                com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_6_7$1 r1 = com.bxkj.student.v2.common.db.AppDatabase.q()     // Catch: java.lang.Throwable -> Lea
                androidx.room.migration.Migration[] r3 = new androidx.room.migration.Migration[r2]     // Catch: java.lang.Throwable -> Lea
                r3[r4] = r1     // Catch: java.lang.Throwable -> Lea
                androidx.room.RoomDatabase$Builder r0 = r0.addMigrations(r3)     // Catch: java.lang.Throwable -> Lea
                com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_7_8$1 r1 = com.bxkj.student.v2.common.db.AppDatabase.r()     // Catch: java.lang.Throwable -> Lea
                androidx.room.migration.Migration[] r3 = new androidx.room.migration.Migration[r2]     // Catch: java.lang.Throwable -> Lea
                r3[r4] = r1     // Catch: java.lang.Throwable -> Lea
                androidx.room.RoomDatabase$Builder r0 = r0.addMigrations(r3)     // Catch: java.lang.Throwable -> Lea
                com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_8_9$1 r1 = com.bxkj.student.v2.common.db.AppDatabase.s()     // Catch: java.lang.Throwable -> Lea
                androidx.room.migration.Migration[] r3 = new androidx.room.migration.Migration[r2]     // Catch: java.lang.Throwable -> Lea
                r3[r4] = r1     // Catch: java.lang.Throwable -> Lea
                androidx.room.RoomDatabase$Builder r0 = r0.addMigrations(r3)     // Catch: java.lang.Throwable -> Lea
                com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_9_10$1 r1 = com.bxkj.student.v2.common.db.AppDatabase.t()     // Catch: java.lang.Throwable -> Lea
                androidx.room.migration.Migration[] r3 = new androidx.room.migration.Migration[r2]     // Catch: java.lang.Throwable -> Lea
                r3[r4] = r1     // Catch: java.lang.Throwable -> Lea
                androidx.room.RoomDatabase$Builder r0 = r0.addMigrations(r3)     // Catch: java.lang.Throwable -> Lea
                com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_10_11$1 r1 = com.bxkj.student.v2.common.db.AppDatabase.g()     // Catch: java.lang.Throwable -> Lea
                androidx.room.migration.Migration[] r3 = new androidx.room.migration.Migration[r2]     // Catch: java.lang.Throwable -> Lea
                r3[r4] = r1     // Catch: java.lang.Throwable -> Lea
                androidx.room.RoomDatabase$Builder r0 = r0.addMigrations(r3)     // Catch: java.lang.Throwable -> Lea
                com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_11_12$1 r1 = com.bxkj.student.v2.common.db.AppDatabase.h()     // Catch: java.lang.Throwable -> Lea
                androidx.room.migration.Migration[] r3 = new androidx.room.migration.Migration[r2]     // Catch: java.lang.Throwable -> Lea
                r3[r4] = r1     // Catch: java.lang.Throwable -> Lea
                androidx.room.RoomDatabase$Builder r0 = r0.addMigrations(r3)     // Catch: java.lang.Throwable -> Lea
                com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_12_13$1 r1 = com.bxkj.student.v2.common.db.AppDatabase.i()     // Catch: java.lang.Throwable -> Lea
                androidx.room.migration.Migration[] r3 = new androidx.room.migration.Migration[r2]     // Catch: java.lang.Throwable -> Lea
                r3[r4] = r1     // Catch: java.lang.Throwable -> Lea
                androidx.room.RoomDatabase$Builder r0 = r0.addMigrations(r3)     // Catch: java.lang.Throwable -> Lea
                com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_13_14$1 r1 = com.bxkj.student.v2.common.db.AppDatabase.j()     // Catch: java.lang.Throwable -> Lea
                androidx.room.migration.Migration[] r3 = new androidx.room.migration.Migration[r2]     // Catch: java.lang.Throwable -> Lea
                r3[r4] = r1     // Catch: java.lang.Throwable -> Lea
                androidx.room.RoomDatabase$Builder r0 = r0.addMigrations(r3)     // Catch: java.lang.Throwable -> Lea
                com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_14_15$1 r1 = com.bxkj.student.v2.common.db.AppDatabase.k()     // Catch: java.lang.Throwable -> Lea
                androidx.room.migration.Migration[] r3 = new androidx.room.migration.Migration[r2]     // Catch: java.lang.Throwable -> Lea
                r3[r4] = r1     // Catch: java.lang.Throwable -> Lea
                androidx.room.RoomDatabase$Builder r0 = r0.addMigrations(r3)     // Catch: java.lang.Throwable -> Lea
                com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_15_16$1 r1 = com.bxkj.student.v2.common.db.AppDatabase.l()     // Catch: java.lang.Throwable -> Lea
                androidx.room.migration.Migration[] r2 = new androidx.room.migration.Migration[r2]     // Catch: java.lang.Throwable -> Lea
                r2[r4] = r1     // Catch: java.lang.Throwable -> Lea
                androidx.room.RoomDatabase$Builder r0 = r0.addMigrations(r2)     // Catch: java.lang.Throwable -> Lea
                androidx.room.RoomDatabase$Builder r0 = r0.fallbackToDestructiveMigration()     // Catch: java.lang.Throwable -> Lea
                androidx.room.RoomDatabase r0 = r0.build()     // Catch: java.lang.Throwable -> Lea
                com.bxkj.student.v2.common.db.AppDatabase r0 = (com.bxkj.student.v2.common.db.AppDatabase) r0     // Catch: java.lang.Throwable -> Lea
                monitor-exit(r5)
                return r0
            Lea:
                r0 = move-exception
                monitor-exit(r5)
                throw r0
        }
    }

    static {
            com.bxkj.student.v2.common.db.AppDatabase$a r0 = new com.bxkj.student.v2.common.db.AppDatabase$a
            r1 = 0
            r0.<init>(r1)
            com.bxkj.student.v2.common.db.AppDatabase.a = r0
            com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_2_3$1 r0 = new com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_2_3$1
            r0.<init>()
            com.bxkj.student.v2.common.db.AppDatabase.c = r0
            com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_3_4$1 r0 = new com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_3_4$1
            r0.<init>()
            com.bxkj.student.v2.common.db.AppDatabase.d = r0
            com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_4_5$1 r0 = new com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_4_5$1
            r0.<init>()
            com.bxkj.student.v2.common.db.AppDatabase.e = r0
            com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_5_6$1 r0 = new com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_5_6$1
            r0.<init>()
            com.bxkj.student.v2.common.db.AppDatabase.f = r0
            com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_6_7$1 r0 = new com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_6_7$1
            r0.<init>()
            com.bxkj.student.v2.common.db.AppDatabase.g = r0
            com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_7_8$1 r0 = new com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_7_8$1
            r0.<init>()
            com.bxkj.student.v2.common.db.AppDatabase.h = r0
            com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_8_9$1 r0 = new com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_8_9$1
            r0.<init>()
            com.bxkj.student.v2.common.db.AppDatabase.i = r0
            com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_9_10$1 r0 = new com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_9_10$1
            r0.<init>()
            com.bxkj.student.v2.common.db.AppDatabase.j = r0
            com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_10_11$1 r0 = new com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_10_11$1
            r0.<init>()
            com.bxkj.student.v2.common.db.AppDatabase.k = r0
            com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_11_12$1 r0 = new com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_11_12$1
            r0.<init>()
            com.bxkj.student.v2.common.db.AppDatabase.f1358l = r0
            com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_12_13$1 r0 = new com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_12_13$1
            r0.<init>()
            com.bxkj.student.v2.common.db.AppDatabase.f1359m = r0
            com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_13_14$1 r0 = new com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_13_14$1
            r0.<init>()
            com.bxkj.student.v2.common.db.AppDatabase.f1360n = r0
            com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_14_15$1 r0 = new com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_14_15$1
            r0.<init>()
            com.bxkj.student.v2.common.db.AppDatabase.f1361o = r0
            com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_15_16$1 r0 = new com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_15_16$1
            r0.<init>()
            com.bxkj.student.v2.common.db.AppDatabase.f1362p = r0
            return
    }

    public AppDatabase() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_10_11$1 g() {
            com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_10_11$1 r0 = com.bxkj.student.v2.common.db.AppDatabase.k
            return r0
    }

    public static final /* synthetic */ com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_11_12$1 h() {
            com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_11_12$1 r0 = com.bxkj.student.v2.common.db.AppDatabase.f1358l
            return r0
    }

    public static final /* synthetic */ com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_12_13$1 i() {
            com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_12_13$1 r0 = com.bxkj.student.v2.common.db.AppDatabase.f1359m
            return r0
    }

    public static final /* synthetic */ com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_13_14$1 j() {
            com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_13_14$1 r0 = com.bxkj.student.v2.common.db.AppDatabase.f1360n
            return r0
    }

    public static final /* synthetic */ com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_14_15$1 k() {
            com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_14_15$1 r0 = com.bxkj.student.v2.common.db.AppDatabase.f1361o
            return r0
    }

    public static final /* synthetic */ com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_15_16$1 l() {
            com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_15_16$1 r0 = com.bxkj.student.v2.common.db.AppDatabase.f1362p
            return r0
    }

    public static final /* synthetic */ com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_2_3$1 m() {
            com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_2_3$1 r0 = com.bxkj.student.v2.common.db.AppDatabase.c
            return r0
    }

    public static final /* synthetic */ com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_3_4$1 n() {
            com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_3_4$1 r0 = com.bxkj.student.v2.common.db.AppDatabase.d
            return r0
    }

    public static final /* synthetic */ com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_4_5$1 o() {
            com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_4_5$1 r0 = com.bxkj.student.v2.common.db.AppDatabase.e
            return r0
    }

    public static final /* synthetic */ com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_5_6$1 p() {
            com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_5_6$1 r0 = com.bxkj.student.v2.common.db.AppDatabase.f
            return r0
    }

    public static final /* synthetic */ com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_6_7$1 q() {
            com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_6_7$1 r0 = com.bxkj.student.v2.common.db.AppDatabase.g
            return r0
    }

    public static final /* synthetic */ com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_7_8$1 r() {
            com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_7_8$1 r0 = com.bxkj.student.v2.common.db.AppDatabase.h
            return r0
    }

    public static final /* synthetic */ com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_8_9$1 s() {
            com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_8_9$1 r0 = com.bxkj.student.v2.common.db.AppDatabase.i
            return r0
    }

    public static final /* synthetic */ com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_9_10$1 t() {
            com.bxkj.student.v2.common.db.AppDatabase$Companion$MIGRATION_9_10$1 r0 = com.bxkj.student.v2.common.db.AppDatabase.j
            return r0
    }

    public static final /* synthetic */ com.bxkj.student.v2.common.db.AppDatabase u() {
            com.bxkj.student.v2.common.db.AppDatabase r0 = com.bxkj.student.v2.common.db.AppDatabase.b
            return r0
    }

    public static final /* synthetic */ void v(com.bxkj.student.v2.common.db.AppDatabase r0) {
            com.bxkj.student.v2.common.db.AppDatabase.b = r0
            return
    }

    @org.jetbrains.annotations.Nullable
    public abstract com.bxkj.student.v2.common.db.dao.w0 A();

    public void close() {
            r3 = this;
            com.bxkj.student.v2.common.db.AppDatabase r0 = com.bxkj.student.v2.common.db.AppDatabase.b
            if (r0 == 0) goto L14
            boolean r1 = r3.isOpen()
            r2 = 0
            if (r1 == 0) goto Lc
            goto Ld
        Lc:
            r0 = r2
        Ld:
            if (r0 == 0) goto L14
            super.close()
            com.bxkj.student.v2.common.db.AppDatabase.b = r2
        L14:
            return
    }

    @org.jetbrains.annotations.Nullable
    public abstract com.bxkj.student.v2.common.db.dao.b w();

    @org.jetbrains.annotations.Nullable
    public abstract com.bxkj.student.v2.common.db.dao.g x();

    @org.jetbrains.annotations.Nullable
    public abstract com.bxkj.student.v2.common.db.dao.l y();

    @org.jetbrains.annotations.Nullable
    public abstract com.bxkj.student.v2.common.db.dao.y z();
}
