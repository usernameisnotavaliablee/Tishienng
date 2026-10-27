package androidx.room.support;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
/* synthetic */ class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<androidx.sqlite.db.SupportSQLiteDatabase, java.lang.Boolean> {
    public static final androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$2 INSTANCE = null;

    static {
            androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$2 r0 = new androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$2
            r0.<init>()
            androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$2.INSTANCE = r0
            return
    }

    AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$2() {
            r6 = this;
            java.lang.String r4 = "yieldIfContendedSafely()Z"
            r5 = 0
            r1 = 1
            java.lang.Class<androidx.sqlite.db.SupportSQLiteDatabase> r2 = androidx.sqlite.db.SupportSQLiteDatabase.class
            java.lang.String r3 = "yieldIfContendedSafely"
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public final java.lang.Boolean invoke(androidx.sqlite.db.SupportSQLiteDatabase r2) {
            r1 = this;
            java.lang.String r0 = "p0"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r2 = r2.yieldIfContendedSafely()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
    }

    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
            r0 = this;
            androidx.sqlite.db.SupportSQLiteDatabase r1 = (androidx.sqlite.db.SupportSQLiteDatabase) r1
            java.lang.Boolean r1 = r0.invoke(r1)
            return r1
    }
}
