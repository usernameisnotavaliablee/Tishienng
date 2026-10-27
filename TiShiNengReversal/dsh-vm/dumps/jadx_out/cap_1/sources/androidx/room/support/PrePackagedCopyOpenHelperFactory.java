package androidx.room.support;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class PrePackagedCopyOpenHelperFactory implements androidx.sqlite.db.SupportSQLiteOpenHelper.Factory {

    @org.jetbrains.annotations.Nullable
    private final java.lang.String copyFromAssetPath;

    @org.jetbrains.annotations.Nullable
    private final java.io.File copyFromFile;

    @org.jetbrains.annotations.Nullable
    private final java.util.concurrent.Callable<java.io.InputStream> copyFromInputStream;

    @org.jetbrains.annotations.NotNull
    private final androidx.sqlite.db.SupportSQLiteOpenHelper.Factory delegate;

    public PrePackagedCopyOpenHelperFactory(@org.jetbrains.annotations.Nullable java.lang.String r2, @org.jetbrains.annotations.Nullable java.io.File r3, @org.jetbrains.annotations.Nullable java.util.concurrent.Callable<java.io.InputStream> r4, @org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteOpenHelper.Factory r5) {
            r1 = this;
            java.lang.String r0 = "delegate"
            kotlin.jvm.internal.g0.p(r5, r0)
            r1.<init>()
            r1.copyFromAssetPath = r2
            r1.copyFromFile = r3
            r1.copyFromInputStream = r4
            r1.delegate = r5
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    @org.jetbrains.annotations.NotNull
    public androidx.sqlite.db.SupportSQLiteOpenHelper create(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration r9) {
            r8 = this;
            java.lang.String r0 = "configuration"
            kotlin.jvm.internal.g0.p(r9, r0)
            androidx.room.support.PrePackagedCopyOpenHelper r1 = new androidx.room.support.PrePackagedCopyOpenHelper
            android.content.Context r2 = r9.context
            java.lang.String r3 = r8.copyFromAssetPath
            java.io.File r4 = r8.copyFromFile
            java.util.concurrent.Callable<java.io.InputStream> r5 = r8.copyFromInputStream
            androidx.sqlite.db.SupportSQLiteOpenHelper$Callback r0 = r9.callback
            int r6 = r0.version
            androidx.sqlite.db.SupportSQLiteOpenHelper$Factory r0 = r8.delegate
            androidx.sqlite.db.SupportSQLiteOpenHelper r7 = r0.create(r9)
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
    }
}
