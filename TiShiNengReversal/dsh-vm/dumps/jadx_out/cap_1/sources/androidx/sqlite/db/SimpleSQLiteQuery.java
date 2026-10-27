package androidx.sqlite.db;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class SimpleSQLiteQuery implements androidx.sqlite.db.SupportSQLiteQuery {

    @org.jetbrains.annotations.NotNull
    public static final androidx.sqlite.db.SimpleSQLiteQuery.Companion Companion = null;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Object[] bindArgs;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String query;

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

        private final void bind(androidx.sqlite.db.SupportSQLiteProgram r3, int r4, java.lang.Object r5) {
                r2 = this;
                if (r5 != 0) goto L6
                r3.bindNull(r4)
                return
            L6:
                boolean r0 = r5 instanceof byte[]
                if (r0 == 0) goto L10
                byte[] r5 = (byte[]) r5
                r3.bindBlob(r4, r5)
                return
            L10:
                boolean r0 = r5 instanceof java.lang.Float
                if (r0 == 0) goto L1f
                java.lang.Number r5 = (java.lang.Number) r5
                float r5 = r5.floatValue()
                double r0 = (double) r5
                r3.bindDouble(r4, r0)
                return
            L1f:
                boolean r0 = r5 instanceof java.lang.Double
                if (r0 == 0) goto L2d
                java.lang.Number r5 = (java.lang.Number) r5
                double r0 = r5.doubleValue()
                r3.bindDouble(r4, r0)
                return
            L2d:
                boolean r0 = r5 instanceof java.lang.Long
                if (r0 == 0) goto L3b
                java.lang.Number r5 = (java.lang.Number) r5
                long r0 = r5.longValue()
                r3.bindLong(r4, r0)
                return
            L3b:
                boolean r0 = r5 instanceof java.lang.Integer
                if (r0 == 0) goto L4a
                java.lang.Number r5 = (java.lang.Number) r5
                int r5 = r5.intValue()
                long r0 = (long) r5
                r3.bindLong(r4, r0)
                return
            L4a:
                boolean r0 = r5 instanceof java.lang.Short
                if (r0 == 0) goto L59
                java.lang.Number r5 = (java.lang.Number) r5
                short r5 = r5.shortValue()
                long r0 = (long) r5
                r3.bindLong(r4, r0)
                return
            L59:
                boolean r0 = r5 instanceof java.lang.Byte
                if (r0 == 0) goto L68
                java.lang.Number r5 = (java.lang.Number) r5
                byte r5 = r5.byteValue()
                long r0 = (long) r5
                r3.bindLong(r4, r0)
                return
            L68:
                boolean r0 = r5 instanceof java.lang.String
                if (r0 == 0) goto L72
                java.lang.String r5 = (java.lang.String) r5
                r3.bindString(r4, r5)
                return
            L72:
                boolean r0 = r5 instanceof java.lang.Boolean
                if (r0 == 0) goto L87
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L81
                r0 = 1
                goto L83
            L81:
                r0 = 0
            L83:
                r3.bindLong(r4, r0)
                return
            L87:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Cannot bind "
                r0.append(r1)
                r0.append(r5)
                java.lang.String r5 = " at index "
                r0.append(r5)
                r0.append(r4)
                java.lang.String r4 = " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String"
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r3.<init>(r4)
                throw r3
        }

        @kotlin.jvm.JvmStatic
        public final void bind(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteProgram r4, @org.jetbrains.annotations.Nullable java.lang.Object[] r5) {
                r3 = this;
                java.lang.String r0 = "statement"
                kotlin.jvm.internal.g0.p(r4, r0)
                if (r5 != 0) goto L8
                goto L14
            L8:
                int r0 = r5.length
                r1 = 0
            La:
                if (r1 >= r0) goto L14
                r2 = r5[r1]
                int r1 = r1 + 1
                r3.bind(r4, r1, r2)
                goto La
            L14:
                return
        }
    }

    static {
            androidx.sqlite.db.SimpleSQLiteQuery$Companion r0 = new androidx.sqlite.db.SimpleSQLiteQuery$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.sqlite.db.SimpleSQLiteQuery.Companion = r0
            return
    }

    public SimpleSQLiteQuery(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "query"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SimpleSQLiteQuery(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.Nullable java.lang.Object[] r3) {
            r1 = this;
            java.lang.String r0 = "query"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.query = r2
            r1.bindArgs = r3
            return
    }

    @kotlin.jvm.JvmStatic
    public static final void bind(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteProgram r1, @org.jetbrains.annotations.Nullable java.lang.Object[] r2) {
            androidx.sqlite.db.SimpleSQLiteQuery$Companion r0 = androidx.sqlite.db.SimpleSQLiteQuery.Companion
            r0.bind(r1, r2)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public void bindTo(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteProgram r3) {
            r2 = this;
            java.lang.String r0 = "statement"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.sqlite.db.SimpleSQLiteQuery$Companion r0 = androidx.sqlite.db.SimpleSQLiteQuery.Companion
            java.lang.Object[] r1 = r2.bindArgs
            r0.bind(r3, r1)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public int getArgCount() {
            r1 = this;
            java.lang.Object[] r0 = r1.bindArgs
            if (r0 == 0) goto L6
            int r0 = r0.length
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    @org.jetbrains.annotations.NotNull
    public java.lang.String getSql() {
            r1 = this;
            java.lang.String r0 = r1.query
            return r0
    }
}
