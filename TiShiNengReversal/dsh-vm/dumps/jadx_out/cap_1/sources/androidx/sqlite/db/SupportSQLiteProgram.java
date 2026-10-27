package androidx.sqlite.db;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface SupportSQLiteProgram extends java.io.Closeable {
    void bindBlob(int r1, @org.jetbrains.annotations.NotNull byte[] r2);

    void bindDouble(int r1, double r2);

    void bindLong(int r1, long r2);

    void bindNull(int r1);

    void bindString(int r1, @org.jetbrains.annotations.NotNull java.lang.String r2);

    void clearBindings();
}
