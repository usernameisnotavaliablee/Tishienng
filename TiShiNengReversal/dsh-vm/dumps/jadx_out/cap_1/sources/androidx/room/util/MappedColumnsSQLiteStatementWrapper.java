package androidx.room.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nStatementUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatementUtil.kt\nandroidx/room/util/MappedColumnsSQLiteStatementWrapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,112:1\n1#2:113\n13467#3,3:114\n*S KotlinDebug\n*F\n+ 1 StatementUtil.kt\nandroidx/room/util/MappedColumnsSQLiteStatementWrapper\n*L\n99#1:114,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class MappedColumnsSQLiteStatementWrapper implements androidx.sqlite.SQLiteStatement {

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.String, java.lang.Integer> columnNameToIndexMap;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String[] columnNames;

    @org.jetbrains.annotations.NotNull
    private final androidx.sqlite.SQLiteStatement delegate;

    @org.jetbrains.annotations.NotNull
    private final int[] mapping;

    public MappedColumnsSQLiteStatementWrapper(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteStatement r7, @org.jetbrains.annotations.NotNull java.lang.String[] r8, @org.jetbrains.annotations.NotNull int[] r9) {
            r6 = this;
            java.lang.String r0 = "delegate"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "columnNames"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "mapping"
            kotlin.jvm.internal.g0.p(r9, r0)
            r6.<init>()
            r6.delegate = r7
            r6.columnNames = r8
            r6.mapping = r9
            int r7 = r8.length
            int r9 = r9.length
            if (r7 != r9) goto L5e
            java.util.Map r7 = kotlin.collections.i1.g()
            int r9 = r8.length
            r0 = 0
            r1 = 0
            r2 = 0
        L24:
            if (r1 >= r9) goto L39
            r3 = r8[r1]
            int r4 = r2 + 1
            int[] r5 = r6.mapping
            r2 = r5[r2]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r7.put(r3, r2)
            int r1 = r1 + 1
            r2 = r4
            goto L24
        L39:
            int r8 = r6.getColumnCount()
        L3d:
            if (r0 >= r8) goto L57
            java.lang.String r9 = r6.getColumnName(r0)
            boolean r9 = r7.containsKey(r9)
            if (r9 != 0) goto L54
            java.lang.String r9 = r6.getColumnName(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r7.put(r9, r1)
        L54:
            int r0 = r0 + 1
            goto L3d
        L57:
            java.util.Map r7 = kotlin.collections.i1.d(r7)
            r6.columnNameToIndexMap = r7
            return
        L5e:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Expected columnNames.size == mapping.size"
            r7.<init>(r8)
            throw r7
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindBlob */
    public void mo84bindBlob(@androidx.annotation.IntRange(from = 1) int r2, @org.jetbrains.annotations.NotNull byte[] r3) {
            r1 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.sqlite.SQLiteStatement r0 = r1.delegate
            r0.mo84bindBlob(r2, r3)
            return
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void bindBoolean(@androidx.annotation.IntRange(from = 1) int r2, boolean r3) {
            r1 = this;
            androidx.sqlite.SQLiteStatement r0 = r1.delegate
            r0.bindBoolean(r2, r3)
            return
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindDouble */
    public void mo85bindDouble(@androidx.annotation.IntRange(from = 1) int r2, double r3) {
            r1 = this;
            androidx.sqlite.SQLiteStatement r0 = r1.delegate
            r0.mo85bindDouble(r2, r3)
            return
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void bindFloat(@androidx.annotation.IntRange(from = 1) int r2, float r3) {
            r1 = this;
            androidx.sqlite.SQLiteStatement r0 = r1.delegate
            r0.bindFloat(r2, r3)
            return
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void bindInt(@androidx.annotation.IntRange(from = 1) int r2, int r3) {
            r1 = this;
            androidx.sqlite.SQLiteStatement r0 = r1.delegate
            r0.bindInt(r2, r3)
            return
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindLong */
    public void mo86bindLong(@androidx.annotation.IntRange(from = 1) int r2, long r3) {
            r1 = this;
            androidx.sqlite.SQLiteStatement r0 = r1.delegate
            r0.mo86bindLong(r2, r3)
            return
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindNull */
    public void mo87bindNull(@androidx.annotation.IntRange(from = 1) int r2) {
            r1 = this;
            androidx.sqlite.SQLiteStatement r0 = r1.delegate
            r0.mo87bindNull(r2)
            return
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindText */
    public void mo88bindText(@androidx.annotation.IntRange(from = 1) int r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.sqlite.SQLiteStatement r0 = r1.delegate
            r0.mo88bindText(r2, r3)
            return
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: clearBindings */
    public void mo89clearBindings() {
            r1 = this;
            androidx.sqlite.SQLiteStatement r0 = r1.delegate
            r0.mo89clearBindings()
            return
    }

    @Override // androidx.sqlite.SQLiteStatement, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            androidx.sqlite.SQLiteStatement r0 = r1.delegate
            r0.close()
            return
    }

    @Override // androidx.sqlite.SQLiteStatement
    @org.jetbrains.annotations.NotNull
    public byte[] getBlob(@androidx.annotation.IntRange(from = 0) int r2) {
            r1 = this;
            androidx.sqlite.SQLiteStatement r0 = r1.delegate
            byte[] r2 = r0.getBlob(r2)
            return r2
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean getBoolean(@androidx.annotation.IntRange(from = 0) int r2) {
            r1 = this;
            androidx.sqlite.SQLiteStatement r0 = r1.delegate
            boolean r2 = r0.getBoolean(r2)
            return r2
    }

    @Override // androidx.sqlite.SQLiteStatement
    public int getColumnCount() {
            r1 = this;
            androidx.sqlite.SQLiteStatement r0 = r1.delegate
            int r0 = r0.getColumnCount()
            return r0
    }

    public final int getColumnIndex(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r1.columnNameToIndexMap
            java.lang.Object r2 = r0.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L14
            int r2 = r2.intValue()
            return r2
        L14:
            r2 = -1
            return r2
    }

    @Override // androidx.sqlite.SQLiteStatement
    @org.jetbrains.annotations.NotNull
    public java.lang.String getColumnName(@androidx.annotation.IntRange(from = 0) int r2) {
            r1 = this;
            androidx.sqlite.SQLiteStatement r0 = r1.delegate
            java.lang.String r2 = r0.getColumnName(r2)
            return r2
    }

    @Override // androidx.sqlite.SQLiteStatement
    @org.jetbrains.annotations.NotNull
    public java.util.List<java.lang.String> getColumnNames() {
            r1 = this;
            androidx.sqlite.SQLiteStatement r0 = r1.delegate
            java.util.List r0 = r0.getColumnNames()
            return r0
    }

    @Override // androidx.sqlite.SQLiteStatement
    public int getColumnType(@androidx.annotation.IntRange(from = 0) int r2) {
            r1 = this;
            androidx.sqlite.SQLiteStatement r0 = r1.delegate
            int r2 = r0.getColumnType(r2)
            return r2
    }

    @Override // androidx.sqlite.SQLiteStatement
    public double getDouble(@androidx.annotation.IntRange(from = 0) int r3) {
            r2 = this;
            androidx.sqlite.SQLiteStatement r0 = r2.delegate
            double r0 = r0.getDouble(r3)
            return r0
    }

    @Override // androidx.sqlite.SQLiteStatement
    public float getFloat(@androidx.annotation.IntRange(from = 0) int r2) {
            r1 = this;
            androidx.sqlite.SQLiteStatement r0 = r1.delegate
            float r2 = r0.getFloat(r2)
            return r2
    }

    @Override // androidx.sqlite.SQLiteStatement
    public int getInt(@androidx.annotation.IntRange(from = 0) int r2) {
            r1 = this;
            androidx.sqlite.SQLiteStatement r0 = r1.delegate
            int r2 = r0.getInt(r2)
            return r2
    }

    @Override // androidx.sqlite.SQLiteStatement
    public long getLong(@androidx.annotation.IntRange(from = 0) int r3) {
            r2 = this;
            androidx.sqlite.SQLiteStatement r0 = r2.delegate
            long r0 = r0.getLong(r3)
            return r0
    }

    @Override // androidx.sqlite.SQLiteStatement
    @org.jetbrains.annotations.NotNull
    public java.lang.String getText(@androidx.annotation.IntRange(from = 0) int r2) {
            r1 = this;
            androidx.sqlite.SQLiteStatement r0 = r1.delegate
            java.lang.String r2 = r0.getText(r2)
            return r2
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean isNull(@androidx.annotation.IntRange(from = 0) int r2) {
            r1 = this;
            androidx.sqlite.SQLiteStatement r0 = r1.delegate
            boolean r2 = r0.isNull(r2)
            return r2
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void reset() {
            r1 = this;
            androidx.sqlite.SQLiteStatement r0 = r1.delegate
            r0.reset()
            return
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean step() {
            r1 = this;
            androidx.sqlite.SQLiteStatement r0 = r1.delegate
            boolean r0 = r0.step()
            return r0
    }
}
