package com.bxkj.student.run.app.offline;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class RunDatabase_Impl extends com.bxkj.student.run.app.offline.RunDatabase {

    @org.jetbrains.annotations.NotNull
    private final kotlin.s<com.bxkj.student.run.app.offline.dao.RunDao> _runDao;

    public RunDatabase_Impl() {
            r1 = this;
            r1.<init>()
            com.bxkj.student.run.app.offline.b r0 = new com.bxkj.student.run.app.offline.b
            r0.<init>(r1)
            kotlin.s r0 = kotlin.t.c(r0)
            r1._runDao = r0
            return
    }

    private static final com.bxkj.student.run.app.offline.dao.RunDao_Impl _runDao$lambda$0(com.bxkj.student.run.app.offline.RunDatabase_Impl r1) {
            com.bxkj.student.run.app.offline.dao.RunDao_Impl r0 = new com.bxkj.student.run.app.offline.dao.RunDao_Impl
            r0.<init>(r1)
            return r0
    }

    public static final /* synthetic */ void access$internalInitInvalidationTracker(com.bxkj.student.run.app.offline.RunDatabase_Impl r0, androidx.sqlite.SQLiteConnection r1) {
            r0.internalInitInvalidationTracker(r1)
            return
    }

    public static /* synthetic */ com.bxkj.student.run.app.offline.dao.RunDao_Impl h(com.bxkj.student.run.app.offline.RunDatabase_Impl r0) {
            com.bxkj.student.run.app.offline.dao.RunDao_Impl r0 = _runDao$lambda$0(r0)
            return r0
    }

    public void clearAllTables() {
            r2 = this;
            java.lang.String r0 = "runDb"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r1 = 0
            super.performClear(r1, r0)
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.util.List<androidx.room.migration.Migration> createAutoMigrations(@org.jetbrains.annotations.NotNull java.util.Map<kotlin.reflect.d<? extends androidx.room.migration.AutoMigrationSpec>, ? extends androidx.room.migration.AutoMigrationSpec> r2) {
            r1 = this;
            java.lang.String r0 = "autoMigrationSpecs"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            return r2
    }

    @org.jetbrains.annotations.NotNull
    protected androidx.room.InvalidationTracker createInvalidationTracker() {
            r4 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            androidx.room.InvalidationTracker r2 = new androidx.room.InvalidationTracker
            java.lang.String r3 = "runDb"
            java.lang.String[] r3 = new java.lang.String[]{r3}
            r2.<init>(r4, r0, r1, r3)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    protected androidx.room.RoomOpenDelegate createOpenDelegate() {
            r1 = this;
            com.bxkj.student.run.app.offline.RunDatabase_Impl$createOpenDelegate$_openDelegate$1 r0 = new com.bxkj.student.run.app.offline.RunDatabase_Impl$createOpenDelegate$_openDelegate$1
            r0.<init>(r1)
            return r0
    }

    /* renamed from: createOpenDelegate, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ androidx.room.RoomOpenDelegateMarker m3createOpenDelegate() {
            r1 = this;
            androidx.room.RoomOpenDelegate r0 = r1.createOpenDelegate()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.util.Set<kotlin.reflect.d<? extends androidx.room.migration.AutoMigrationSpec>> getRequiredAutoMigrationSpecClasses() {
            r1 = this;
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    protected java.util.Map<kotlin.reflect.d<?>, java.util.List<kotlin.reflect.d<?>>> getRequiredTypeConverterClasses() {
            r3 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.Class<com.bxkj.student.run.app.offline.dao.RunDao> r1 = com.bxkj.student.run.app.offline.dao.RunDao.class
            kotlin.reflect.d r1 = kotlin.jvm.internal.o0.d(r1)
            com.bxkj.student.run.app.offline.dao.RunDao_Impl$Companion r2 = com.bxkj.student.run.app.offline.dao.RunDao_Impl.Companion
            java.util.List r2 = r2.getRequiredConverters()
            r0.put(r1, r2)
            return r0
    }

    @Override // com.bxkj.student.run.app.offline.RunDatabase
    @org.jetbrains.annotations.Nullable
    public com.bxkj.student.run.app.offline.dao.RunDao runDao() {
            r1 = this;
            kotlin.s<com.bxkj.student.run.app.offline.dao.RunDao> r0 = r1._runDao
            java.lang.Object r0 = r0.getValue()
            com.bxkj.student.run.app.offline.dao.RunDao r0 = (com.bxkj.student.run.app.offline.dao.RunDao) r0
            return r0
    }
}
