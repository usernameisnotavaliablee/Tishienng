package com.bxkj.student.v2.common.db.dao;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class FaceDao_Impl implements com.bxkj.student.v2.common.db.dao.g {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.student.v2.common.db.dao.FaceDao_Impl.a c = null;

    @org.jetbrains.annotations.NotNull
    private final androidx.room.RoomDatabase a;

    @org.jetbrains.annotations.NotNull
    private final androidx.room.EntityInsertAdapter<l0.b> b;


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
            com.bxkj.student.v2.common.db.dao.FaceDao_Impl$a r0 = new com.bxkj.student.v2.common.db.dao.FaceDao_Impl$a
            r1 = 0
            r0.<init>(r1)
            com.bxkj.student.v2.common.db.dao.FaceDao_Impl.c = r0
            return
    }

    public FaceDao_Impl(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r2) {
            r1 = this;
            java.lang.String r0 = "__db"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            com.bxkj.student.v2.common.db.dao.FaceDao_Impl$1 r2 = new com.bxkj.student.v2.common.db.dao.FaceDao_Impl$1
            r2.<init>()
            r1.b = r2
            return
    }

    public static /* synthetic */ kotlin.n1 c(java.lang.String r0, java.lang.String r1, androidx.sqlite.SQLiteConnection r2) {
            kotlin.n1 r0 = h(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlin.n1 d(com.bxkj.student.v2.common.db.dao.FaceDao_Impl r0, l0.b r1, androidx.sqlite.SQLiteConnection r2) {
            kotlin.n1 r0 = j(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ java.util.List e(java.lang.String r0, java.lang.String r1, androidx.sqlite.SQLiteConnection r2) {
            java.util.List r0 = i(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlin.n1 f(java.lang.String r0, androidx.sqlite.SQLiteConnection r1) {
            kotlin.n1 r0 = g(r0, r1)
            return r0
    }

    private static final kotlin.n1 g(java.lang.String r1, androidx.sqlite.SQLiteConnection r2) {
            java.lang.String r0 = "_connection"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.sqlite.SQLiteStatement r1 = r2.prepare(r1)
            r1.step()     // Catch: java.lang.Throwable -> L12
            r1.close()
            kotlin.n1 r1 = kotlin.n1.a
            return r1
        L12:
            r2 = move-exception
            r1.close()
            throw r2
    }

    private static final kotlin.n1 h(java.lang.String r1, java.lang.String r2, androidx.sqlite.SQLiteConnection r3) {
            java.lang.String r0 = "_connection"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.sqlite.SQLiteStatement r1 = r3.prepare(r1)
            r3 = 1
            r1.bindText(r3, r2)     // Catch: java.lang.Throwable -> L16
            r1.step()     // Catch: java.lang.Throwable -> L16
            r1.close()
            kotlin.n1 r1 = kotlin.n1.a
            return r1
        L16:
            r2 = move-exception
            r1.close()
            throw r2
    }

    private static final java.util.List i(java.lang.String r17, java.lang.String r18, androidx.sqlite.SQLiteConnection r19) {
            r0 = r19
            java.lang.String r1 = "_connection"
            kotlin.jvm.internal.g0.p(r0, r1)
            r1 = r17
            androidx.sqlite.SQLiteStatement r1 = r0.prepare(r1)
            r0 = 1
            r2 = r18
            r1.bindText(r0, r2)     // Catch: java.lang.Throwable -> L77
            java.lang.String r0 = "id"
            int r0 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r0)     // Catch: java.lang.Throwable -> L77
            java.lang.String r2 = "identify"
            int r2 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r2)     // Catch: java.lang.Throwable -> L77
            java.lang.String r3 = "type"
            int r3 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r3)     // Catch: java.lang.Throwable -> L77
            java.lang.String r4 = "facePath"
            int r4 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r4)     // Catch: java.lang.Throwable -> L77
            java.lang.String r5 = "coordinates"
            int r5 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r5)     // Catch: java.lang.Throwable -> L77
            java.lang.String r6 = "timeStamp"
            int r6 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r6)     // Catch: java.lang.Throwable -> L77
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L77
            r7.<init>()     // Catch: java.lang.Throwable -> L77
        L3c:
            boolean r8 = r1.step()     // Catch: java.lang.Throwable -> L77
            if (r8 == 0) goto L79
            long r10 = r1.getLong(r0)     // Catch: java.lang.Throwable -> L77
            java.lang.String r12 = r1.getText(r2)     // Catch: java.lang.Throwable -> L77
            java.lang.String r13 = r1.getText(r3)     // Catch: java.lang.Throwable -> L77
            java.lang.String r14 = r1.getText(r4)     // Catch: java.lang.Throwable -> L77
            boolean r8 = r1.isNull(r5)     // Catch: java.lang.Throwable -> L77
            r9 = 0
            if (r8 == 0) goto L5b
            r15 = r9
            goto L60
        L5b:
            java.lang.String r8 = r1.getText(r5)     // Catch: java.lang.Throwable -> L77
            r15 = r8
        L60:
            boolean r8 = r1.isNull(r6)     // Catch: java.lang.Throwable -> L77
            if (r8 == 0) goto L69
        L66:
            r16 = r9
            goto L6e
        L69:
            java.lang.String r9 = r1.getText(r6)     // Catch: java.lang.Throwable -> L77
            goto L66
        L6e:
            l0.b r9 = new l0.b     // Catch: java.lang.Throwable -> L77
            r9.<init>(r10, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L77
            r7.add(r9)     // Catch: java.lang.Throwable -> L77
            goto L3c
        L77:
            r0 = move-exception
            goto L7d
        L79:
            r1.close()
            return r7
        L7d:
            r1.close()
            throw r0
    }

    private static final kotlin.n1 j(com.bxkj.student.v2.common.db.dao.FaceDao_Impl r1, l0.b r2, androidx.sqlite.SQLiteConnection r3) {
            java.lang.String r0 = "_connection"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.room.EntityInsertAdapter<l0.b> r1 = r1.b
            r1.insert(r3, r2)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    @Override // com.bxkj.student.v2.common.db.dao.g
    @org.jetbrains.annotations.Nullable
    public java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r5) {
            r4 = this;
            androidx.room.RoomDatabase r0 = r4.a
            com.bxkj.student.v2.common.db.dao.i r1 = new com.bxkj.student.v2.common.db.dao.i
            java.lang.String r2 = "DELETE FROM face"
            r1.<init>(r2)
            r2 = 0
            r3 = 1
            java.lang.Object r5 = androidx.room.util.DBUtil.performSuspending(r0, r2, r3, r1, r5)
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            if (r5 != r0) goto L16
            return r5
        L16:
            kotlin.n1 r5 = kotlin.n1.a
            return r5
    }

    @Override // com.bxkj.student.v2.common.db.dao.g
    @org.jetbrains.annotations.Nullable
    public java.lang.Object b(@org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.List<l0.b>> r5) {
            r3 = this;
            androidx.room.RoomDatabase r0 = r3.a
            com.bxkj.student.v2.common.db.dao.h r1 = new com.bxkj.student.v2.common.db.dao.h
            java.lang.String r2 = "SELECT * FROM face WHERE identify=?"
            r1.<init>(r2, r4)
            r4 = 1
            r2 = 0
            java.lang.Object r4 = androidx.room.util.DBUtil.performSuspending(r0, r4, r2, r1, r5)
            return r4
    }

    @Override // com.bxkj.student.v2.common.db.dao.g
    @org.jetbrains.annotations.Nullable
    public java.lang.Object deleteByIdentify(@org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r5) {
            r3 = this;
            androidx.room.RoomDatabase r0 = r3.a
            com.bxkj.student.v2.common.db.dao.j r1 = new com.bxkj.student.v2.common.db.dao.j
            java.lang.String r2 = "DELETE FROM face WHERE identify=?"
            r1.<init>(r2, r4)
            r4 = 0
            r2 = 1
            java.lang.Object r4 = androidx.room.util.DBUtil.performSuspending(r0, r4, r2, r1, r5)
            java.lang.Object r5 = kotlin.coroutines.intrinsics.a.l()
            if (r4 != r5) goto L16
            return r4
        L16:
            kotlin.n1 r4 = kotlin.n1.a
            return r4
    }

    @Override // com.bxkj.student.v2.common.db.dao.g
    @org.jetbrains.annotations.Nullable
    public java.lang.Object insert(@org.jetbrains.annotations.NotNull l0.b r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r5) {
            r3 = this;
            androidx.room.RoomDatabase r0 = r3.a
            com.bxkj.student.v2.common.db.dao.k r1 = new com.bxkj.student.v2.common.db.dao.k
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
