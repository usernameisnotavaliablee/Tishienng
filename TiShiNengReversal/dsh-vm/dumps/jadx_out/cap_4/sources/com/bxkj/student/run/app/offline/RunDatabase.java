package com.bxkj.student.run.app.offline;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.room.Database(entities = {com.bxkj.student.run.app.offline.table.RunDb.class}, exportSchema = true, version = 2)
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class RunDatabase extends androidx.room.RoomDatabase {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.student.run.app.offline.RunDatabase.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String DATABASE_NAME = "TSNRun.db";

    @org.jetbrains.annotations.NotNull
    private static final net.sqlcipher.database.SupportFactory factory = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.s<com.bxkj.student.run.app.offline.RunDatabase> instance$delegate = null;

    @org.jetbrains.annotations.NotNull
    private static final byte[] passphrase = null;

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

        @org.jetbrains.annotations.NotNull
        public final com.bxkj.student.run.app.offline.RunDatabase getInstance() {
                r1 = this;
                kotlin.s r0 = com.bxkj.student.run.app.offline.RunDatabase.access$getInstance$delegate$cp()
                java.lang.Object r0 = r0.getValue()
                com.bxkj.student.run.app.offline.RunDatabase r0 = (com.bxkj.student.run.app.offline.RunDatabase) r0
                return r0
        }
    }

    static {
            com.bxkj.student.run.app.offline.RunDatabase$Companion r0 = new com.bxkj.student.run.app.offline.RunDatabase$Companion
            r1 = 0
            r0.<init>(r1)
            com.bxkj.student.run.app.offline.RunDatabase.Companion = r0
            b0.b r0 = b0.b.a
            com.bxkj.student.App$a r1 = com.bxkj.student.App.d
            com.bxkj.student.App r1 = r1.a()
            java.lang.String r0 = r0.k(r1)
            char[] r0 = r0.toCharArray()
            java.lang.String r1 = "toCharArray(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            byte[] r0 = net.sqlcipher.database.SQLiteDatabase.getBytes(r0)
            java.lang.String r1 = "getBytes(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            com.bxkj.student.run.app.offline.RunDatabase.passphrase = r0
            net.sqlcipher.database.SupportFactory r1 = new net.sqlcipher.database.SupportFactory
            r1.<init>(r0)
            com.bxkj.student.run.app.offline.RunDatabase.factory = r1
            kotlin.LazyThreadSafetyMode r0 = kotlin.LazyThreadSafetyMode.SYNCHRONIZED
            com.bxkj.student.run.app.offline.a r1 = new com.bxkj.student.run.app.offline.a
            r1.<init>()
            kotlin.s r0 = kotlin.t.b(r0, r1)
            com.bxkj.student.run.app.offline.RunDatabase.instance$delegate = r0
            return
    }

    public RunDatabase() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ kotlin.s access$getInstance$delegate$cp() {
            kotlin.s<com.bxkj.student.run.app.offline.RunDatabase> r0 = com.bxkj.student.run.app.offline.RunDatabase.instance$delegate
            return r0
    }

    public static /* synthetic */ com.bxkj.student.run.app.offline.RunDatabase g() {
            com.bxkj.student.run.app.offline.RunDatabase r0 = instance_delegate$lambda$0()
            return r0
    }

    private static final com.bxkj.student.run.app.offline.RunDatabase instance_delegate$lambda$0() {
            com.bxkj.student.App$a r0 = com.bxkj.student.App.d
            com.bxkj.student.App r0 = r0.a()
            java.lang.Class<com.bxkj.student.run.app.offline.RunDatabase> r1 = com.bxkj.student.run.app.offline.RunDatabase.class
            java.lang.String r2 = "TSNRun.db"
            androidx.room.RoomDatabase$Builder r0 = androidx.room.Room.databaseBuilder(r0, r1, r2)
            net.sqlcipher.database.SupportFactory r1 = com.bxkj.student.run.app.offline.RunDatabase.factory
            androidx.room.RoomDatabase$Builder r0 = r0.openHelperFactory(r1)
            androidx.room.RoomDatabase r0 = r0.build()
            com.bxkj.student.run.app.offline.RunDatabase r0 = (com.bxkj.student.run.app.offline.RunDatabase) r0
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public abstract com.bxkj.student.run.app.offline.dao.RunDao runDao();
}
