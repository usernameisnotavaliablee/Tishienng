package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class BindOnlySQLiteStatement implements androidx.sqlite.SQLiteStatement {

    @org.jetbrains.annotations.NotNull
    public static final androidx.room.BindOnlySQLiteStatement.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String ONLY_BIND_CALLS_ALLOWED_ERROR = "Only bind*() calls are allowed on the RoomRawQuery received statement.";
    private final /* synthetic */ androidx.sqlite.SQLiteStatement $$delegate_0;

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
    }

    static {
            androidx.room.BindOnlySQLiteStatement$Companion r0 = new androidx.room.BindOnlySQLiteStatement$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.room.BindOnlySQLiteStatement.Companion = r0
            return
    }

    public BindOnlySQLiteStatement(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteStatement r2) {
            r1 = this;
            java.lang.String r0 = "delegate"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.$$delegate_0 = r2
            return
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindBlob */
    public void mo84bindBlob(@androidx.annotation.IntRange(from = 1) int r2, @org.jetbrains.annotations.NotNull byte[] r3) {
            r1 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.sqlite.SQLiteStatement r0 = r1.$$delegate_0
            r0.mo84bindBlob(r2, r3)
            return
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void bindBoolean(@androidx.annotation.IntRange(from = 1) int r2, boolean r3) {
            r1 = this;
            androidx.sqlite.SQLiteStatement r0 = r1.$$delegate_0
            r0.bindBoolean(r2, r3)
            return
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindDouble */
    public void mo85bindDouble(@androidx.annotation.IntRange(from = 1) int r2, double r3) {
            r1 = this;
            androidx.sqlite.SQLiteStatement r0 = r1.$$delegate_0
            r0.mo85bindDouble(r2, r3)
            return
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void bindFloat(@androidx.annotation.IntRange(from = 1) int r2, float r3) {
            r1 = this;
            androidx.sqlite.SQLiteStatement r0 = r1.$$delegate_0
            r0.bindFloat(r2, r3)
            return
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void bindInt(@androidx.annotation.IntRange(from = 1) int r2, int r3) {
            r1 = this;
            androidx.sqlite.SQLiteStatement r0 = r1.$$delegate_0
            r0.bindInt(r2, r3)
            return
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindLong */
    public void mo86bindLong(@androidx.annotation.IntRange(from = 1) int r2, long r3) {
            r1 = this;
            androidx.sqlite.SQLiteStatement r0 = r1.$$delegate_0
            r0.mo86bindLong(r2, r3)
            return
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindNull */
    public void mo87bindNull(@androidx.annotation.IntRange(from = 1) int r2) {
            r1 = this;
            androidx.sqlite.SQLiteStatement r0 = r1.$$delegate_0
            r0.mo87bindNull(r2)
            return
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindText */
    public void mo88bindText(@androidx.annotation.IntRange(from = 1) int r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.sqlite.SQLiteStatement r0 = r1.$$delegate_0
            r0.mo88bindText(r2, r3)
            return
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: clearBindings */
    public void mo89clearBindings() {
            r1 = this;
            androidx.sqlite.SQLiteStatement r0 = r1.$$delegate_0
            r0.mo89clearBindings()
            return
    }

    @Override // androidx.sqlite.SQLiteStatement, java.lang.AutoCloseable
    public void close() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Only bind*() calls are allowed on the RoomRawQuery received statement."
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.sqlite.SQLiteStatement
    @org.jetbrains.annotations.NotNull
    public byte[] getBlob(int r2) {
            r1 = this;
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Only bind*() calls are allowed on the RoomRawQuery received statement."
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean getBoolean(@androidx.annotation.IntRange(from = 0) int r2) {
            r1 = this;
            androidx.sqlite.SQLiteStatement r0 = r1.$$delegate_0
            boolean r2 = r0.getBoolean(r2)
            return r2
    }

    @Override // androidx.sqlite.SQLiteStatement
    public int getColumnCount() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Only bind*() calls are allowed on the RoomRawQuery received statement."
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.sqlite.SQLiteStatement
    @org.jetbrains.annotations.NotNull
    public java.lang.String getColumnName(int r2) {
            r1 = this;
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Only bind*() calls are allowed on the RoomRawQuery received statement."
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.sqlite.SQLiteStatement
    @org.jetbrains.annotations.NotNull
    public java.util.List<java.lang.String> getColumnNames() {
            r1 = this;
            androidx.sqlite.SQLiteStatement r0 = r1.$$delegate_0
            java.util.List r0 = r0.getColumnNames()
            return r0
    }

    @Override // androidx.sqlite.SQLiteStatement
    public int getColumnType(int r2) {
            r1 = this;
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Only bind*() calls are allowed on the RoomRawQuery received statement."
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.sqlite.SQLiteStatement
    public double getDouble(int r2) {
            r1 = this;
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Only bind*() calls are allowed on the RoomRawQuery received statement."
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.sqlite.SQLiteStatement
    public float getFloat(@androidx.annotation.IntRange(from = 0) int r2) {
            r1 = this;
            androidx.sqlite.SQLiteStatement r0 = r1.$$delegate_0
            float r2 = r0.getFloat(r2)
            return r2
    }

    @Override // androidx.sqlite.SQLiteStatement
    public int getInt(@androidx.annotation.IntRange(from = 0) int r2) {
            r1 = this;
            androidx.sqlite.SQLiteStatement r0 = r1.$$delegate_0
            int r2 = r0.getInt(r2)
            return r2
    }

    @Override // androidx.sqlite.SQLiteStatement
    public long getLong(int r2) {
            r1 = this;
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Only bind*() calls are allowed on the RoomRawQuery received statement."
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.sqlite.SQLiteStatement
    @org.jetbrains.annotations.NotNull
    public java.lang.String getText(int r2) {
            r1 = this;
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Only bind*() calls are allowed on the RoomRawQuery received statement."
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean isNull(int r2) {
            r1 = this;
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Only bind*() calls are allowed on the RoomRawQuery received statement."
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void reset() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Only bind*() calls are allowed on the RoomRawQuery received statement."
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean step() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Only bind*() calls are allowed on the RoomRawQuery received statement."
            r0.<init>(r1)
            throw r0
    }
}
