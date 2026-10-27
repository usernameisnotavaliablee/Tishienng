package androidx.room.paging;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class CursorSQLiteStatement implements androidx.sqlite.SQLiteStatement {

    @org.jetbrains.annotations.NotNull
    public static final androidx.room.paging.CursorSQLiteStatement.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private final android.database.Cursor cursor;

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

        public static final /* synthetic */ int access$getDataType(androidx.room.paging.CursorSQLiteStatement.Companion r0, android.database.Cursor r1, int r2) {
                int r0 = r0.getDataType(r1, r2)
                return r0
        }

        private final int getDataType(android.database.Cursor r3, int r4) {
                r2 = this;
                int r0 = r3.getType(r4)
                int r3 = r3.getType(r4)
                if (r3 == 0) goto L33
                r4 = 1
                if (r3 == r4) goto L32
                r4 = 2
                if (r3 == r4) goto L32
                r4 = 3
                if (r3 == r4) goto L32
                r4 = 4
                if (r3 != r4) goto L17
                return r4
            L17:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r1 = "Unknown field type: "
                r4.append(r1)
                r4.append(r0)
                java.lang.String r4 = r4.toString()
                java.lang.String r4 = r4.toString()
                r3.<init>(r4)
                throw r3
            L32:
                return r4
            L33:
                r3 = 5
                return r3
        }
    }

    static {
            androidx.room.paging.CursorSQLiteStatement$Companion r0 = new androidx.room.paging.CursorSQLiteStatement$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.room.paging.CursorSQLiteStatement.Companion = r0
            return
    }

    public CursorSQLiteStatement(@org.jetbrains.annotations.NotNull android.database.Cursor r2) {
            r1 = this;
            java.lang.String r0 = "cursor"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.cursor = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.Void bindBlob(int r1, @org.jetbrains.annotations.NotNull byte[] r2) {
            r0 = this;
            java.lang.String r1 = "value"
            kotlin.jvm.internal.g0.p(r2, r1)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Only get*() calls are allowed on a Cursor backed SQLiteStatement"
            r1.<init>(r2)
            throw r1
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindBlob, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ void mo84bindBlob(int r1, byte[] r2) {
            r0 = this;
            r0.bindBlob(r1, r2)
            return
    }

    @Override // androidx.sqlite.SQLiteStatement
    public /* synthetic */ void bindBoolean(int r1, boolean r2) {
            r0 = this;
            f.a.a(r0, r1, r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.Void bindDouble(int r1, double r2) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Only get*() calls are allowed on a Cursor backed SQLiteStatement"
            r1.<init>(r2)
            throw r1
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindDouble, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ void mo85bindDouble(int r1, double r2) {
            r0 = this;
            r0.bindDouble(r1, r2)
            return
    }

    @Override // androidx.sqlite.SQLiteStatement
    public /* synthetic */ void bindFloat(int r1, float r2) {
            r0 = this;
            f.a.b(r0, r1, r2)
            return
    }

    @Override // androidx.sqlite.SQLiteStatement
    public /* synthetic */ void bindInt(int r1, int r2) {
            r0 = this;
            f.a.c(r0, r1, r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.Void bindLong(int r1, long r2) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Only get*() calls are allowed on a Cursor backed SQLiteStatement"
            r1.<init>(r2)
            throw r1
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindLong, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ void mo86bindLong(int r1, long r2) {
            r0 = this;
            r0.bindLong(r1, r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.Void bindNull(int r2) {
            r1 = this;
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Only get*() calls are allowed on a Cursor backed SQLiteStatement"
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindNull, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ void mo87bindNull(int r1) {
            r0 = this;
            r0.bindNull(r1)
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.Void bindText(int r1, @org.jetbrains.annotations.NotNull java.lang.String r2) {
            r0 = this;
            java.lang.String r1 = "value"
            kotlin.jvm.internal.g0.p(r2, r1)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Only get*() calls are allowed on a Cursor backed SQLiteStatement"
            r1.<init>(r2)
            throw r1
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: bindText, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ void mo88bindText(int r1, java.lang.String r2) {
            r0 = this;
            r0.bindText(r1, r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.Void clearBindings() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Only get*() calls are allowed on a Cursor backed SQLiteStatement"
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.sqlite.SQLiteStatement
    /* renamed from: clearBindings, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ void mo89clearBindings() {
            r0 = this;
            r0.clearBindings()
            return
    }

    @Override // androidx.sqlite.SQLiteStatement, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            android.database.Cursor r0 = r1.cursor
            r0.close()
            return
    }

    @Override // androidx.sqlite.SQLiteStatement
    @org.jetbrains.annotations.NotNull
    public byte[] getBlob(int r2) {
            r1 = this;
            android.database.Cursor r0 = r1.cursor
            byte[] r2 = r0.getBlob(r2)
            java.lang.String r0 = "getBlob(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            return r2
    }

    @Override // androidx.sqlite.SQLiteStatement
    public /* synthetic */ boolean getBoolean(int r1) {
            r0 = this;
            boolean r1 = f.a.d(r0, r1)
            return r1
    }

    @Override // androidx.sqlite.SQLiteStatement
    public int getColumnCount() {
            r1 = this;
            android.database.Cursor r0 = r1.cursor
            int r0 = r0.getColumnCount()
            return r0
    }

    @Override // androidx.sqlite.SQLiteStatement
    @org.jetbrains.annotations.NotNull
    public java.lang.String getColumnName(int r2) {
            r1 = this;
            android.database.Cursor r0 = r1.cursor
            java.lang.String r2 = r0.getColumnName(r2)
            java.lang.String r0 = "getColumnName(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            return r2
    }

    @Override // androidx.sqlite.SQLiteStatement
    public /* synthetic */ java.util.List getColumnNames() {
            r1 = this;
            java.util.List r0 = f.a.e(r1)
            return r0
    }

    @Override // androidx.sqlite.SQLiteStatement
    public int getColumnType(int r3) {
            r2 = this;
            androidx.room.paging.CursorSQLiteStatement$Companion r0 = androidx.room.paging.CursorSQLiteStatement.Companion
            android.database.Cursor r1 = r2.cursor
            int r3 = androidx.room.paging.CursorSQLiteStatement.Companion.access$getDataType(r0, r1, r3)
            return r3
    }

    @Override // androidx.sqlite.SQLiteStatement
    public double getDouble(int r3) {
            r2 = this;
            android.database.Cursor r0 = r2.cursor
            double r0 = r0.getDouble(r3)
            return r0
    }

    @Override // androidx.sqlite.SQLiteStatement
    public /* synthetic */ float getFloat(int r1) {
            r0 = this;
            float r1 = f.a.f(r0, r1)
            return r1
    }

    @Override // androidx.sqlite.SQLiteStatement
    public /* synthetic */ int getInt(int r1) {
            r0 = this;
            int r1 = f.a.g(r0, r1)
            return r1
    }

    @Override // androidx.sqlite.SQLiteStatement
    public long getLong(int r3) {
            r2 = this;
            android.database.Cursor r0 = r2.cursor
            long r0 = r0.getLong(r3)
            return r0
    }

    @Override // androidx.sqlite.SQLiteStatement
    @org.jetbrains.annotations.NotNull
    public java.lang.String getText(int r2) {
            r1 = this;
            android.database.Cursor r0 = r1.cursor
            java.lang.String r2 = r0.getString(r2)
            java.lang.String r0 = "getString(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            return r2
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean isNull(int r2) {
            r1 = this;
            android.database.Cursor r0 = r1.cursor
            boolean r2 = r0.isNull(r2)
            return r2
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void reset() {
            r2 = this;
            android.database.Cursor r0 = r2.cursor
            r1 = -1
            r0.moveToPosition(r1)
            return
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean step() {
            r1 = this;
            android.database.Cursor r0 = r1.cursor
            boolean r0 = r0.moveToNext()
            return r0
    }
}
