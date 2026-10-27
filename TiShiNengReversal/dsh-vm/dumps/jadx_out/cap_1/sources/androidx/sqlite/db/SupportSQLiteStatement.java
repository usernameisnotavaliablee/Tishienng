package androidx.sqlite.db;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface SupportSQLiteStatement extends androidx.sqlite.db.SupportSQLiteProgram {
    void execute();

    long executeInsert();

    int executeUpdateDelete();

    long simpleQueryForLong();

    @org.jetbrains.annotations.Nullable
    java.lang.String simpleQueryForString();
}
