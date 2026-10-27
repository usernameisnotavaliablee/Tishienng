package androidx.sqlite;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSQLiteStatement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SQLiteStatement.kt\nandroidx/sqlite/SQLiteStatement\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,233:1\n1#2:234\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface SQLiteStatement extends java.lang.AutoCloseable {
    /* renamed from: bindBlob */
    void mo84bindBlob(@androidx.annotation.IntRange(from = 1) int r1, @org.jetbrains.annotations.NotNull byte[] r2);

    void bindBoolean(@androidx.annotation.IntRange(from = 1) int r1, boolean r2);

    /* renamed from: bindDouble */
    void mo85bindDouble(@androidx.annotation.IntRange(from = 1) int r1, double r2);

    void bindFloat(@androidx.annotation.IntRange(from = 1) int r1, float r2);

    void bindInt(@androidx.annotation.IntRange(from = 1) int r1, int r2);

    /* renamed from: bindLong */
    void mo86bindLong(@androidx.annotation.IntRange(from = 1) int r1, long r2);

    /* renamed from: bindNull */
    void mo87bindNull(@androidx.annotation.IntRange(from = 1) int r1);

    /* renamed from: bindText */
    void mo88bindText(@androidx.annotation.IntRange(from = 1) int r1, @org.jetbrains.annotations.NotNull java.lang.String r2);

    /* renamed from: clearBindings */
    void mo89clearBindings();

    @Override // java.lang.AutoCloseable
    void close();

    @org.jetbrains.annotations.NotNull
    byte[] getBlob(@androidx.annotation.IntRange(from = 0) int r1);

    boolean getBoolean(@androidx.annotation.IntRange(from = 0) int r1);

    int getColumnCount();

    @org.jetbrains.annotations.NotNull
    java.lang.String getColumnName(@androidx.annotation.IntRange(from = 0) int r1);

    @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> getColumnNames();

    int getColumnType(@androidx.annotation.IntRange(from = 0) int r1);

    double getDouble(@androidx.annotation.IntRange(from = 0) int r1);

    float getFloat(@androidx.annotation.IntRange(from = 0) int r1);

    int getInt(@androidx.annotation.IntRange(from = 0) int r1);

    long getLong(@androidx.annotation.IntRange(from = 0) int r1);

    @org.jetbrains.annotations.NotNull
    java.lang.String getText(@androidx.annotation.IntRange(from = 0) int r1);

    boolean isNull(@androidx.annotation.IntRange(from = 0) int r1);

    void reset();

    boolean step();
}
