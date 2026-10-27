package androidx.room.migration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "MigrationKt")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class MigrationKt {
    @org.jetbrains.annotations.NotNull
    public static final androidx.room.migration.Migration Migration(int r1, int r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.sqlite.db.SupportSQLiteDatabase, kotlin.n1> r3) {
            java.lang.String r0 = "migrate"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.room.migration.MigrationImpl r0 = new androidx.room.migration.MigrationImpl
            r0.<init>(r1, r2, r3)
            return r0
    }
}
