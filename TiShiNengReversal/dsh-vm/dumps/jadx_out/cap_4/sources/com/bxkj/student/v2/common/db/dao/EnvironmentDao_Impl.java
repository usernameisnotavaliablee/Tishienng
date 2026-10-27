package com.bxkj.student.v2.common.db.dao;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class EnvironmentDao_Impl implements com.bxkj.student.v2.common.db.dao.b {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.student.v2.common.db.dao.EnvironmentDao_Impl.a c = null;

    @org.jetbrains.annotations.NotNull
    private final androidx.room.RoomDatabase a;

    @org.jetbrains.annotations.NotNull
    private final androidx.room.EntityInsertAdapter<l0.a> b;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<kotlin.reflect.d<?>> a() {
                r1 = this;
                java.util.List r0 = kotlin.collections.f0.J()
                return r0
        }
    }

    static {
            com.bxkj.student.v2.common.db.dao.EnvironmentDao_Impl$a r0 = new com.bxkj.student.v2.common.db.dao.EnvironmentDao_Impl$a
            r1 = 0
            r0.<init>(r1)
            com.bxkj.student.v2.common.db.dao.EnvironmentDao_Impl.c = r0
            return
    }

    public EnvironmentDao_Impl(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r2) {
            r1 = this;
            java.lang.String r0 = "__db"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            com.bxkj.student.v2.common.db.dao.EnvironmentDao_Impl$1 r2 = new com.bxkj.student.v2.common.db.dao.EnvironmentDao_Impl$1
            r2.<init>()
            r1.b = r2
            return
    }

    public static /* synthetic */ int g(java.lang.String r0, java.lang.String r1, java.lang.String r2, androidx.sqlite.SQLiteConnection r3) {
            int r0 = m(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ int h(java.lang.String r0, java.lang.String r1, java.lang.String r2, androidx.sqlite.SQLiteConnection r3) {
            int r0 = n(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ java.util.List i(java.lang.String r0, java.lang.String r1, androidx.sqlite.SQLiteConnection r2) {
            java.util.List r0 = k(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlin.n1 j(com.bxkj.student.v2.common.db.dao.EnvironmentDao_Impl r0, l0.a r1, androidx.sqlite.SQLiteConnection r2) {
            kotlin.n1 r0 = l(r0, r1, r2)
            return r0
    }

    private static final java.util.List k(java.lang.String r6, java.lang.String r7, androidx.sqlite.SQLiteConnection r8) {
            java.lang.String r0 = "_connection"
            kotlin.jvm.internal.g0.p(r8, r0)
            androidx.sqlite.SQLiteStatement r6 = r8.prepare(r6)
            r8 = 1
            r6.bindText(r8, r7)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r7 = "deviceId"
            int r7 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r6, r7)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r8 = "safe"
            int r8 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r6, r8)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r0 = "oppo"
            int r0 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r6, r0)     // Catch: java.lang.Throwable -> L4f
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4f
            r1.<init>()     // Catch: java.lang.Throwable -> L4f
        L24:
            boolean r2 = r6.step()     // Catch: java.lang.Throwable -> L4f
            if (r2 == 0) goto L51
            java.lang.String r2 = r6.getText(r7)     // Catch: java.lang.Throwable -> L4f
            boolean r3 = r6.isNull(r8)     // Catch: java.lang.Throwable -> L4f
            r4 = 0
            if (r3 == 0) goto L37
            r3 = r4
            goto L3b
        L37:
            java.lang.String r3 = r6.getText(r8)     // Catch: java.lang.Throwable -> L4f
        L3b:
            boolean r5 = r6.isNull(r0)     // Catch: java.lang.Throwable -> L4f
            if (r5 == 0) goto L42
            goto L46
        L42:
            java.lang.String r4 = r6.getText(r0)     // Catch: java.lang.Throwable -> L4f
        L46:
            l0.a r5 = new l0.a     // Catch: java.lang.Throwable -> L4f
            r5.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L4f
            r1.add(r5)     // Catch: java.lang.Throwable -> L4f
            goto L24
        L4f:
            r7 = move-exception
            goto L55
        L51:
            r6.close()
            return r1
        L55:
            r6.close()
            throw r7
    }

    private static final kotlin.n1 l(com.bxkj.student.v2.common.db.dao.EnvironmentDao_Impl r1, l0.a r2, androidx.sqlite.SQLiteConnection r3) {
            java.lang.String r0 = "_connection"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.room.EntityInsertAdapter<l0.a> r1 = r1.b
            r1.insert(r3, r2)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    private static final int m(java.lang.String r1, java.lang.String r2, java.lang.String r3, androidx.sqlite.SQLiteConnection r4) {
            java.lang.String r0 = "_connection"
            kotlin.jvm.internal.g0.p(r4, r0)
            androidx.sqlite.SQLiteStatement r1 = r4.prepare(r1)
            r0 = 1
            r1.bindText(r0, r2)     // Catch: java.lang.Throwable -> L1c
            r2 = 2
            r1.bindText(r2, r3)     // Catch: java.lang.Throwable -> L1c
            r1.step()     // Catch: java.lang.Throwable -> L1c
            int r2 = androidx.room.util.SQLiteConnectionUtil.getTotalChangedRows(r4)     // Catch: java.lang.Throwable -> L1c
            r1.close()
            return r2
        L1c:
            r2 = move-exception
            r1.close()
            throw r2
    }

    private static final int n(java.lang.String r1, java.lang.String r2, java.lang.String r3, androidx.sqlite.SQLiteConnection r4) {
            java.lang.String r0 = "_connection"
            kotlin.jvm.internal.g0.p(r4, r0)
            androidx.sqlite.SQLiteStatement r1 = r4.prepare(r1)
            r0 = 1
            r1.bindText(r0, r2)     // Catch: java.lang.Throwable -> L1c
            r2 = 2
            r1.bindText(r2, r3)     // Catch: java.lang.Throwable -> L1c
            r1.step()     // Catch: java.lang.Throwable -> L1c
            int r2 = androidx.room.util.SQLiteConnectionUtil.getTotalChangedRows(r4)     // Catch: java.lang.Throwable -> L1c
            r1.close()
            return r2
        L1c:
            r2 = move-exception
            r1.close()
            throw r2
    }

    @Override // com.bxkj.student.v2.common.db.dao.b
    @org.jetbrains.annotations.Nullable
    public java.lang.Object a(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2) {
            r0 = this;
            java.lang.Object r1 = com.bxkj.student.v2.common.db.dao.a.b(r0, r1, r2)
            return r1
    }

    @Override // com.bxkj.student.v2.common.db.dao.b
    @org.jetbrains.annotations.Nullable
    public java.lang.Object b(@org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.List<l0.a>> r5) {
            r3 = this;
            androidx.room.RoomDatabase r0 = r3.a
            com.bxkj.student.v2.common.db.dao.d r1 = new com.bxkj.student.v2.common.db.dao.d
            java.lang.String r2 = "SELECT * FROM environment WHERE deviceId = ? "
            r1.<init>(r2, r4)
            r4 = 1
            r2 = 0
            java.lang.Object r4 = androidx.room.util.DBUtil.performSuspending(r0, r4, r2, r1, r5)
            return r4
    }

    @Override // com.bxkj.student.v2.common.db.dao.b
    @org.jetbrains.annotations.Nullable
    public java.lang.Object c(@org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.lang.Integer> r6) {
            r3 = this;
            androidx.room.RoomDatabase r0 = r3.a
            com.bxkj.student.v2.common.db.dao.e r1 = new com.bxkj.student.v2.common.db.dao.e
            java.lang.String r2 = "UPDATE environment SET oppo = ? WHERE deviceId = ?"
            r1.<init>(r2, r5, r4)
            r4 = 0
            r5 = 1
            java.lang.Object r4 = androidx.room.util.DBUtil.performSuspending(r0, r4, r5, r1, r6)
            return r4
    }

    @Override // com.bxkj.student.v2.common.db.dao.b
    @org.jetbrains.annotations.Nullable
    public java.lang.Object d(@org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.lang.Integer> r6) {
            r3 = this;
            androidx.room.RoomDatabase r0 = r3.a
            com.bxkj.student.v2.common.db.dao.f r1 = new com.bxkj.student.v2.common.db.dao.f
            java.lang.String r2 = "UPDATE environment SET safe = ? WHERE deviceId = ?"
            r1.<init>(r2, r5, r4)
            r4 = 0
            r5 = 1
            java.lang.Object r4 = androidx.room.util.DBUtil.performSuspending(r0, r4, r5, r1, r6)
            return r4
    }

    @Override // com.bxkj.student.v2.common.db.dao.b
    @org.jetbrains.annotations.Nullable
    public java.lang.Object e(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2) {
            r0 = this;
            java.lang.Object r1 = com.bxkj.student.v2.common.db.dao.a.c(r0, r1, r2)
            return r1
    }

    @Override // com.bxkj.student.v2.common.db.dao.b
    @org.jetbrains.annotations.Nullable
    public java.lang.Object f(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super l0.a> r1) {
            r0 = this;
            java.lang.Object r1 = com.bxkj.student.v2.common.db.dao.a.a(r0, r1)
            return r1
    }

    @Override // com.bxkj.student.v2.common.db.dao.b
    @org.jetbrains.annotations.Nullable
    public java.lang.Object insert(@org.jetbrains.annotations.NotNull l0.a r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r5) {
            r3 = this;
            androidx.room.RoomDatabase r0 = r3.a
            com.bxkj.student.v2.common.db.dao.c r1 = new com.bxkj.student.v2.common.db.dao.c
            r1.<init>(r3, r4)
            r4 = 0
            r2 = 1
            java.lang.Object r4 = androidx.room.util.DBUtil.performSuspending(r0, r4, r2, r1, r5)
            java.lang.Object r5 = kotlin.coroutines.intrinsics.a.l()
            if (r4 != r5) goto L14
            return r4
        L14:
            kotlin.n1 r4 = kotlin.n1.a
            return r4
    }
}
