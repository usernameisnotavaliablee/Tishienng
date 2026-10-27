package com.bxkj.student.v2.common.db.dao;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class SportsSetDao_Impl implements com.bxkj.student.v2.common.db.dao.w0 {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.student.v2.common.db.dao.SportsSetDao_Impl.a c = null;

    @org.jetbrains.annotations.NotNull
    private final androidx.room.RoomDatabase a;

    @org.jetbrains.annotations.NotNull
    private final androidx.room.EntityInsertAdapter<l0.e> b;


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
            com.bxkj.student.v2.common.db.dao.SportsSetDao_Impl$a r0 = new com.bxkj.student.v2.common.db.dao.SportsSetDao_Impl$a
            r1 = 0
            r0.<init>(r1)
            com.bxkj.student.v2.common.db.dao.SportsSetDao_Impl.c = r0
            return
    }

    public SportsSetDao_Impl(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r2) {
            r1 = this;
            java.lang.String r0 = "__db"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            com.bxkj.student.v2.common.db.dao.SportsSetDao_Impl$1 r2 = new com.bxkj.student.v2.common.db.dao.SportsSetDao_Impl$1
            r2.<init>()
            r1.b = r2
            return
    }

    public static /* synthetic */ kotlin.n1 c(com.bxkj.student.v2.common.db.dao.SportsSetDao_Impl r0, l0.e r1, androidx.sqlite.SQLiteConnection r2) {
            kotlin.n1 r0 = f(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ java.util.List d(java.lang.String r0, java.lang.String r1, java.lang.String r2, androidx.sqlite.SQLiteConnection r3) {
            java.util.List r0 = e(r0, r1, r2, r3)
            return r0
    }

    private static final java.util.List e(java.lang.String r5, java.lang.String r6, java.lang.String r7, androidx.sqlite.SQLiteConnection r8) {
            java.lang.String r0 = "_connection"
            kotlin.jvm.internal.g0.p(r8, r0)
            androidx.sqlite.SQLiteStatement r5 = r8.prepare(r5)
            r8 = 1
            r5.bindText(r8, r6)     // Catch: java.lang.Throwable -> L43
            r6 = 2
            r5.bindText(r6, r7)     // Catch: java.lang.Throwable -> L43
            java.lang.String r6 = "userId"
            int r6 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r5, r6)     // Catch: java.lang.Throwable -> L43
            java.lang.String r7 = "type"
            int r7 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r5, r7)     // Catch: java.lang.Throwable -> L43
            java.lang.String r8 = "content"
            int r8 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r5, r8)     // Catch: java.lang.Throwable -> L43
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L43
            r0.<init>()     // Catch: java.lang.Throwable -> L43
        L28:
            boolean r1 = r5.step()     // Catch: java.lang.Throwable -> L43
            if (r1 == 0) goto L45
            java.lang.String r1 = r5.getText(r6)     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = r5.getText(r7)     // Catch: java.lang.Throwable -> L43
            java.lang.String r3 = r5.getText(r8)     // Catch: java.lang.Throwable -> L43
            l0.e r4 = new l0.e     // Catch: java.lang.Throwable -> L43
            r4.<init>(r1, r2, r3)     // Catch: java.lang.Throwable -> L43
            r0.add(r4)     // Catch: java.lang.Throwable -> L43
            goto L28
        L43:
            r6 = move-exception
            goto L49
        L45:
            r5.close()
            return r0
        L49:
            r5.close()
            throw r6
    }

    private static final kotlin.n1 f(com.bxkj.student.v2.common.db.dao.SportsSetDao_Impl r1, l0.e r2, androidx.sqlite.SQLiteConnection r3) {
            java.lang.String r0 = "_connection"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.room.EntityInsertAdapter<l0.e> r1 = r1.b
            r1.insert(r3, r2)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    @Override // com.bxkj.student.v2.common.db.dao.w0
    @org.jetbrains.annotations.Nullable
    public java.lang.Object a(@org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.List<l0.e>> r6) {
            r3 = this;
            androidx.room.RoomDatabase r0 = r3.a
            com.bxkj.student.v2.common.db.dao.x0 r1 = new com.bxkj.student.v2.common.db.dao.x0
            java.lang.String r2 = "SELECT * FROM sports_set WHERE userId = ? AND type =?"
            r1.<init>(r2, r4, r5)
            r4 = 1
            r5 = 0
            java.lang.Object r4 = androidx.room.util.DBUtil.performSuspending(r0, r4, r5, r1, r6)
            return r4
    }

    @Override // com.bxkj.student.v2.common.db.dao.w0
    @org.jetbrains.annotations.Nullable
    public java.lang.Object b(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.lang.String> r2) {
            r0 = this;
            java.lang.Object r1 = com.bxkj.student.v2.common.db.dao.v0.a(r0, r1, r2)
            return r1
    }

    @Override // com.bxkj.student.v2.common.db.dao.w0
    @org.jetbrains.annotations.Nullable
    public java.lang.Object insert(@org.jetbrains.annotations.NotNull l0.e r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r5) {
            r3 = this;
            androidx.room.RoomDatabase r0 = r3.a
            com.bxkj.student.v2.common.db.dao.y0 r1 = new com.bxkj.student.v2.common.db.dao.y0
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
