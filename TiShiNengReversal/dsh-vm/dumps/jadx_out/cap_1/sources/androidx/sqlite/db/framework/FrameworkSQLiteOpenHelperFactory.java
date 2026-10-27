package androidx.sqlite.db.framework;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class FrameworkSQLiteOpenHelperFactory implements androidx.sqlite.db.SupportSQLiteOpenHelper.Factory {
    public FrameworkSQLiteOpenHelperFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    @org.jetbrains.annotations.NotNull
    public androidx.sqlite.db.SupportSQLiteOpenHelper create(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration r8) {
            r7 = this;
            java.lang.String r0 = "configuration"
            kotlin.jvm.internal.g0.p(r8, r0)
            androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper r1 = new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper
            android.content.Context r2 = r8.context
            java.lang.String r3 = r8.name
            androidx.sqlite.db.SupportSQLiteOpenHelper$Callback r4 = r8.callback
            boolean r5 = r8.useNoBackupDirectory
            boolean r6 = r8.allowDataLossOnRecovery
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
    }
}
