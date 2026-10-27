package com.bxkj.student.v2.common.db.dao;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class MenuDao_Impl implements com.bxkj.student.v2.common.db.dao.l {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.student.v2.common.db.dao.MenuDao_Impl.a c = null;

    @org.jetbrains.annotations.NotNull
    private final androidx.room.RoomDatabase a;

    @org.jetbrains.annotations.NotNull
    private final androidx.room.EntityInsertAdapter<l0.c> b;


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
            com.bxkj.student.v2.common.db.dao.MenuDao_Impl$a r0 = new com.bxkj.student.v2.common.db.dao.MenuDao_Impl$a
            r1 = 0
            r0.<init>(r1)
            com.bxkj.student.v2.common.db.dao.MenuDao_Impl.c = r0
            return
    }

    public MenuDao_Impl(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r2) {
            r1 = this;
            java.lang.String r0 = "__db"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            com.bxkj.student.v2.common.db.dao.MenuDao_Impl$1 r2 = new com.bxkj.student.v2.common.db.dao.MenuDao_Impl$1
            r2.<init>()
            r1.b = r2
            return
    }

    private static final java.util.List A(java.lang.String r32, androidx.sqlite.SQLiteConnection r33) {
            r0 = r33
            java.lang.String r1 = "_connection"
            kotlin.jvm.internal.g0.p(r0, r1)
            r1 = r32
            androidx.sqlite.SQLiteStatement r1 = r0.prepare(r1)
            java.lang.String r0 = "mkey"
            int r0 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r0)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r2 = "name"
            int r2 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r2)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r3 = "icon"
            int r3 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r3)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r4 = "iconS"
            int r4 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r4)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r5 = "isShow"
            int r5 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r5)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r6 = "isEnabled"
            int r6 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r6)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r7 = "isLogin"
            int r7 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r7)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r8 = "linkUrl"
            int r8 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r8)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r9 = "type"
            int r9 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r9)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r10 = "lastUploadTime"
            int r10 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r10)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r11 = "sort"
            int r11 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r11)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r12 = "isShowIndex"
            int r12 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r12)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r13 = "homeSort"
            int r13 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r13)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r14 = "isShowH5Title"
            int r14 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r14)     // Catch: java.lang.Throwable -> Lba
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lba
            r15.<init>()     // Catch: java.lang.Throwable -> Lba
        L66:
            boolean r16 = r1.step()     // Catch: java.lang.Throwable -> Lba
            if (r16 == 0) goto Lbc
            java.lang.String r18 = r1.getText(r0)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r19 = r1.getText(r2)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r20 = r1.getText(r3)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r21 = r1.getText(r4)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r22 = r1.getText(r5)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r23 = r1.getText(r6)     // Catch: java.lang.Throwable -> Lba
            r32 = r2
            r33 = r3
            long r2 = r1.getLong(r7)     // Catch: java.lang.Throwable -> Lba
            int r3 = (int) r2     // Catch: java.lang.Throwable -> Lba
            java.lang.String r25 = r1.getText(r8)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r26 = r1.getText(r9)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r27 = r1.getText(r10)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r28 = r1.getText(r11)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r29 = r1.getText(r12)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r30 = r1.getText(r13)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r31 = r1.getText(r14)     // Catch: java.lang.Throwable -> Lba
            l0.c r17 = new l0.c     // Catch: java.lang.Throwable -> Lba
            r24 = r3
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)     // Catch: java.lang.Throwable -> Lba
            r2 = r17
            r15.add(r2)     // Catch: java.lang.Throwable -> Lba
            r2 = r32
            r3 = r33
            goto L66
        Lba:
            r0 = move-exception
            goto Lc0
        Lbc:
            r1.close()
            return r15
        Lc0:
            r1.close()
            throw r0
    }

    private static final java.util.List B(java.lang.String r32, java.lang.String r33, androidx.sqlite.SQLiteConnection r34) {
            r0 = r34
            java.lang.String r1 = "_connection"
            kotlin.jvm.internal.g0.p(r0, r1)
            r1 = r32
            androidx.sqlite.SQLiteStatement r1 = r0.prepare(r1)
            r0 = 1
            r2 = r33
            r1.bindText(r0, r2)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r0 = "mkey"
            int r0 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r0)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r2 = "name"
            int r2 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r2)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r3 = "icon"
            int r3 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r3)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r4 = "iconS"
            int r4 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r4)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r5 = "isShow"
            int r5 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r5)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r6 = "isEnabled"
            int r6 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r6)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r7 = "isLogin"
            int r7 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r7)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r8 = "linkUrl"
            int r8 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r8)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r9 = "type"
            int r9 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r9)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r10 = "lastUploadTime"
            int r10 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r10)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r11 = "sort"
            int r11 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r11)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r12 = "isShowIndex"
            int r12 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r12)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r13 = "homeSort"
            int r13 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r13)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r14 = "isShowH5Title"
            int r14 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r14)     // Catch: java.lang.Throwable -> Lc0
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lc0
            r15.<init>()     // Catch: java.lang.Throwable -> Lc0
        L6c:
            boolean r16 = r1.step()     // Catch: java.lang.Throwable -> Lc0
            if (r16 == 0) goto Lc2
            java.lang.String r18 = r1.getText(r0)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r19 = r1.getText(r2)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r20 = r1.getText(r3)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r21 = r1.getText(r4)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r22 = r1.getText(r5)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r23 = r1.getText(r6)     // Catch: java.lang.Throwable -> Lc0
            r32 = r2
            r33 = r3
            long r2 = r1.getLong(r7)     // Catch: java.lang.Throwable -> Lc0
            int r3 = (int) r2     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r25 = r1.getText(r8)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r26 = r1.getText(r9)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r27 = r1.getText(r10)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r28 = r1.getText(r11)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r29 = r1.getText(r12)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r30 = r1.getText(r13)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r31 = r1.getText(r14)     // Catch: java.lang.Throwable -> Lc0
            l0.c r17 = new l0.c     // Catch: java.lang.Throwable -> Lc0
            r24 = r3
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)     // Catch: java.lang.Throwable -> Lc0
            r2 = r17
            r15.add(r2)     // Catch: java.lang.Throwable -> Lc0
            r2 = r32
            r3 = r33
            goto L6c
        Lc0:
            r0 = move-exception
            goto Lc6
        Lc2:
            r1.close()
            return r15
        Lc6:
            r1.close()
            throw r0
    }

    private static final java.util.List C(java.lang.String r32, java.lang.String r33, androidx.sqlite.SQLiteConnection r34) {
            r0 = r34
            java.lang.String r1 = "_connection"
            kotlin.jvm.internal.g0.p(r0, r1)
            r1 = r32
            androidx.sqlite.SQLiteStatement r1 = r0.prepare(r1)
            r0 = 1
            r2 = r33
            r1.bindText(r0, r2)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r0 = "mkey"
            int r0 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r0)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r2 = "name"
            int r2 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r2)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r3 = "icon"
            int r3 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r3)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r4 = "iconS"
            int r4 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r4)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r5 = "isShow"
            int r5 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r5)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r6 = "isEnabled"
            int r6 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r6)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r7 = "isLogin"
            int r7 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r7)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r8 = "linkUrl"
            int r8 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r8)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r9 = "type"
            int r9 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r9)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r10 = "lastUploadTime"
            int r10 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r10)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r11 = "sort"
            int r11 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r11)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r12 = "isShowIndex"
            int r12 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r12)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r13 = "homeSort"
            int r13 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r13)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r14 = "isShowH5Title"
            int r14 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r14)     // Catch: java.lang.Throwable -> Lc0
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lc0
            r15.<init>()     // Catch: java.lang.Throwable -> Lc0
        L6c:
            boolean r16 = r1.step()     // Catch: java.lang.Throwable -> Lc0
            if (r16 == 0) goto Lc2
            java.lang.String r18 = r1.getText(r0)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r19 = r1.getText(r2)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r20 = r1.getText(r3)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r21 = r1.getText(r4)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r22 = r1.getText(r5)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r23 = r1.getText(r6)     // Catch: java.lang.Throwable -> Lc0
            r32 = r2
            r33 = r3
            long r2 = r1.getLong(r7)     // Catch: java.lang.Throwable -> Lc0
            int r3 = (int) r2     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r25 = r1.getText(r8)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r26 = r1.getText(r9)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r27 = r1.getText(r10)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r28 = r1.getText(r11)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r29 = r1.getText(r12)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r30 = r1.getText(r13)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r31 = r1.getText(r14)     // Catch: java.lang.Throwable -> Lc0
            l0.c r17 = new l0.c     // Catch: java.lang.Throwable -> Lc0
            r24 = r3
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)     // Catch: java.lang.Throwable -> Lc0
            r2 = r17
            r15.add(r2)     // Catch: java.lang.Throwable -> Lc0
            r2 = r32
            r3 = r33
            goto L6c
        Lc0:
            r0 = move-exception
            goto Lc6
        Lc2:
            r1.close()
            return r15
        Lc6:
            r1.close()
            throw r0
    }

    private static final kotlin.n1 D(com.bxkj.student.v2.common.db.dao.MenuDao_Impl r1, l0.c[] r2, androidx.sqlite.SQLiteConnection r3) {
            java.lang.String r0 = "_connection"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.room.EntityInsertAdapter<l0.c> r1 = r1.b
            r1.insert(r3, r2)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    private static final kotlin.n1 E(java.lang.String r1, java.lang.String r2, java.lang.String r3, androidx.sqlite.SQLiteConnection r4) {
            java.lang.String r0 = "_connection"
            kotlin.jvm.internal.g0.p(r4, r0)
            androidx.sqlite.SQLiteStatement r1 = r4.prepare(r1)
            r4 = 1
            r1.bindText(r4, r2)     // Catch: java.lang.Throwable -> L1a
            r2 = 2
            r1.bindText(r2, r3)     // Catch: java.lang.Throwable -> L1a
            r1.step()     // Catch: java.lang.Throwable -> L1a
            r1.close()
            kotlin.n1 r1 = kotlin.n1.a
            return r1
        L1a:
            r2 = move-exception
            r1.close()
            throw r2
    }

    private static final kotlin.n1 F(java.lang.String r1, java.lang.String r2, java.lang.String r3, androidx.sqlite.SQLiteConnection r4) {
            java.lang.String r0 = "_connection"
            kotlin.jvm.internal.g0.p(r4, r0)
            androidx.sqlite.SQLiteStatement r1 = r4.prepare(r1)
            r4 = 1
            r1.bindText(r4, r2)     // Catch: java.lang.Throwable -> L1a
            r2 = 2
            r1.bindText(r2, r3)     // Catch: java.lang.Throwable -> L1a
            r1.step()     // Catch: java.lang.Throwable -> L1a
            r1.close()
            kotlin.n1 r1 = kotlin.n1.a
            return r1
        L1a:
            r2 = move-exception
            r1.close()
            throw r2
    }

    private static final kotlin.n1 G(java.lang.String r1, java.lang.String r2, java.lang.String r3, androidx.sqlite.SQLiteConnection r4) {
            java.lang.String r0 = "_connection"
            kotlin.jvm.internal.g0.p(r4, r0)
            androidx.sqlite.SQLiteStatement r1 = r4.prepare(r1)
            r4 = 1
            r1.bindText(r4, r2)     // Catch: java.lang.Throwable -> L1a
            r2 = 2
            r1.bindText(r2, r3)     // Catch: java.lang.Throwable -> L1a
            r1.step()     // Catch: java.lang.Throwable -> L1a
            r1.close()
            kotlin.n1 r1 = kotlin.n1.a
            return r1
        L1a:
            r2 = move-exception
            r1.close()
            throw r2
    }

    public static /* synthetic */ java.util.List l(java.lang.String r0, androidx.sqlite.SQLiteConnection r1) {
            java.util.List r0 = A(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.n1 m(com.bxkj.student.v2.common.db.dao.MenuDao_Impl r0, l0.c[] r1, androidx.sqlite.SQLiteConnection r2) {
            kotlin.n1 r0 = D(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ java.util.List n(java.lang.String r0, java.lang.String r1, androidx.sqlite.SQLiteConnection r2) {
            java.util.List r0 = C(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ int o(java.lang.String r0, int r1, androidx.sqlite.SQLiteConnection r2) {
            int r0 = y(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlin.n1 p(java.lang.String r0, java.lang.String r1, java.lang.String r2, androidx.sqlite.SQLiteConnection r3) {
            kotlin.n1 r0 = F(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ kotlin.n1 q(java.lang.String r0, java.lang.String r1, java.lang.String r2, androidx.sqlite.SQLiteConnection r3) {
            kotlin.n1 r0 = E(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ java.util.List r(java.lang.String r0, java.lang.String r1, androidx.sqlite.SQLiteConnection r2) {
            java.util.List r0 = B(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlin.n1 s(java.lang.String r0, java.lang.String r1, androidx.sqlite.SQLiteConnection r2) {
            kotlin.n1 r0 = x(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlin.n1 t(java.lang.String r0, java.lang.String r1, java.lang.String r2, androidx.sqlite.SQLiteConnection r3) {
            kotlin.n1 r0 = G(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ java.util.List u(java.lang.String r0, androidx.sqlite.SQLiteConnection r1) {
            java.util.List r0 = z(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.n1 v(java.lang.String r0, androidx.sqlite.SQLiteConnection r1) {
            kotlin.n1 r0 = w(r0, r1)
            return r0
    }

    private static final kotlin.n1 w(java.lang.String r1, androidx.sqlite.SQLiteConnection r2) {
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

    private static final kotlin.n1 x(java.lang.String r1, java.lang.String r2, androidx.sqlite.SQLiteConnection r3) {
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

    private static final int y(java.lang.String r3, int r4, androidx.sqlite.SQLiteConnection r5) {
            java.lang.String r0 = "_connection"
            kotlin.jvm.internal.g0.p(r5, r0)
            androidx.sqlite.SQLiteStatement r3 = r5.prepare(r3)
            r0 = 1
            long r1 = (long) r4
            r3.bindLong(r0, r1)     // Catch: java.lang.Throwable -> L19
            r3.step()     // Catch: java.lang.Throwable -> L19
            int r4 = androidx.room.util.SQLiteConnectionUtil.getTotalChangedRows(r5)     // Catch: java.lang.Throwable -> L19
            r3.close()
            return r4
        L19:
            r4 = move-exception
            r3.close()
            throw r4
    }

    private static final java.util.List z(java.lang.String r32, androidx.sqlite.SQLiteConnection r33) {
            r0 = r33
            java.lang.String r1 = "_connection"
            kotlin.jvm.internal.g0.p(r0, r1)
            r1 = r32
            androidx.sqlite.SQLiteStatement r1 = r0.prepare(r1)
            java.lang.String r0 = "mkey"
            int r0 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r0)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r2 = "name"
            int r2 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r2)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r3 = "icon"
            int r3 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r3)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r4 = "iconS"
            int r4 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r4)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r5 = "isShow"
            int r5 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r5)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r6 = "isEnabled"
            int r6 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r6)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r7 = "isLogin"
            int r7 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r7)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r8 = "linkUrl"
            int r8 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r8)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r9 = "type"
            int r9 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r9)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r10 = "lastUploadTime"
            int r10 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r10)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r11 = "sort"
            int r11 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r11)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r12 = "isShowIndex"
            int r12 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r12)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r13 = "homeSort"
            int r13 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r13)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r14 = "isShowH5Title"
            int r14 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r14)     // Catch: java.lang.Throwable -> Lba
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lba
            r15.<init>()     // Catch: java.lang.Throwable -> Lba
        L66:
            boolean r16 = r1.step()     // Catch: java.lang.Throwable -> Lba
            if (r16 == 0) goto Lbc
            java.lang.String r18 = r1.getText(r0)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r19 = r1.getText(r2)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r20 = r1.getText(r3)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r21 = r1.getText(r4)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r22 = r1.getText(r5)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r23 = r1.getText(r6)     // Catch: java.lang.Throwable -> Lba
            r32 = r2
            r33 = r3
            long r2 = r1.getLong(r7)     // Catch: java.lang.Throwable -> Lba
            int r3 = (int) r2     // Catch: java.lang.Throwable -> Lba
            java.lang.String r25 = r1.getText(r8)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r26 = r1.getText(r9)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r27 = r1.getText(r10)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r28 = r1.getText(r11)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r29 = r1.getText(r12)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r30 = r1.getText(r13)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r31 = r1.getText(r14)     // Catch: java.lang.Throwable -> Lba
            l0.c r17 = new l0.c     // Catch: java.lang.Throwable -> Lba
            r24 = r3
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)     // Catch: java.lang.Throwable -> Lba
            r2 = r17
            r15.add(r2)     // Catch: java.lang.Throwable -> Lba
            r2 = r32
            r3 = r33
            goto L66
        Lba:
            r0 = move-exception
            goto Lc0
        Lbc:
            r1.close()
            return r15
        Lc0:
            r1.close()
            throw r0
    }

    @Override // com.bxkj.student.v2.common.db.dao.l
    @org.jetbrains.annotations.Nullable
    public java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r5) {
            r4 = this;
            androidx.room.RoomDatabase r0 = r4.a
            com.bxkj.student.v2.common.db.dao.s r1 = new com.bxkj.student.v2.common.db.dao.s
            java.lang.String r2 = "DELETE FROM menu"
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

    @Override // com.bxkj.student.v2.common.db.dao.l
    @org.jetbrains.annotations.Nullable
    public java.lang.Object b(@org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r6) {
            r3 = this;
            androidx.room.RoomDatabase r0 = r3.a
            com.bxkj.student.v2.common.db.dao.o r1 = new com.bxkj.student.v2.common.db.dao.o
            java.lang.String r2 = "UPDATE menu SET iconS=? WHERE mkey=?"
            r1.<init>(r2, r4, r5)
            r4 = 0
            r5 = 1
            java.lang.Object r4 = androidx.room.util.DBUtil.performSuspending(r0, r4, r5, r1, r6)
            java.lang.Object r5 = kotlin.coroutines.intrinsics.a.l()
            if (r4 != r5) goto L16
            return r4
        L16:
            kotlin.n1 r4 = kotlin.n1.a
            return r4
    }

    @Override // com.bxkj.student.v2.common.db.dao.l
    @org.jetbrains.annotations.Nullable
    public java.lang.Object c(@org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r6) {
            r3 = this;
            androidx.room.RoomDatabase r0 = r3.a
            com.bxkj.student.v2.common.db.dao.r r1 = new com.bxkj.student.v2.common.db.dao.r
            java.lang.String r2 = "UPDATE menu SET type=? WHERE mkey=?"
            r1.<init>(r2, r4, r5)
            r4 = 0
            r5 = 1
            java.lang.Object r4 = androidx.room.util.DBUtil.performSuspending(r0, r4, r5, r1, r6)
            java.lang.Object r5 = kotlin.coroutines.intrinsics.a.l()
            if (r4 != r5) goto L16
            return r4
        L16:
            kotlin.n1 r4 = kotlin.n1.a
            return r4
    }

    @Override // com.bxkj.student.v2.common.db.dao.l
    @org.jetbrains.annotations.Nullable
    public java.lang.Object d(int r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.lang.Integer> r5) {
            r3 = this;
            androidx.room.RoomDatabase r0 = r3.a
            com.bxkj.student.v2.common.db.dao.u r1 = new com.bxkj.student.v2.common.db.dao.u
            java.lang.String r2 = "DELETE  FROM menu WHERE type=?"
            r1.<init>(r2, r4)
            r4 = 0
            r2 = 1
            java.lang.Object r4 = androidx.room.util.DBUtil.performSuspending(r0, r4, r2, r1, r5)
            return r4
    }

    @Override // com.bxkj.student.v2.common.db.dao.l
    @org.jetbrains.annotations.Nullable
    public java.lang.Object e(@org.jetbrains.annotations.NotNull l0.c[] r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r5) {
            r3 = this;
            androidx.room.RoomDatabase r0 = r3.a
            com.bxkj.student.v2.common.db.dao.v r1 = new com.bxkj.student.v2.common.db.dao.v
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

    @Override // com.bxkj.student.v2.common.db.dao.l
    @org.jetbrains.annotations.Nullable
    public java.lang.Object f(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.List<l0.c>> r5) {
            r4 = this;
            androidx.room.RoomDatabase r0 = r4.a
            com.bxkj.student.v2.common.db.dao.p r1 = new com.bxkj.student.v2.common.db.dao.p
            java.lang.String r2 = "SELECT * FROM menu WHERE isShowIndex='1' Order By cast(homeSort as INTEGER)"
            r1.<init>(r2)
            r2 = 1
            r3 = 0
            java.lang.Object r5 = androidx.room.util.DBUtil.performSuspending(r0, r2, r3, r1, r5)
            return r5
    }

    @Override // com.bxkj.student.v2.common.db.dao.l
    @org.jetbrains.annotations.Nullable
    public java.lang.Object g(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.List<l0.c>> r5) {
            r4 = this;
            androidx.room.RoomDatabase r0 = r4.a
            com.bxkj.student.v2.common.db.dao.q r1 = new com.bxkj.student.v2.common.db.dao.q
            java.lang.String r2 = "SELECT * FROM menu"
            r1.<init>(r2)
            r2 = 1
            r3 = 0
            java.lang.Object r5 = androidx.room.util.DBUtil.performSuspending(r0, r2, r3, r1, r5)
            return r5
    }

    @Override // com.bxkj.student.v2.common.db.dao.l
    @org.jetbrains.annotations.Nullable
    public java.lang.Object h(@org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r5) {
            r3 = this;
            androidx.room.RoomDatabase r0 = r3.a
            com.bxkj.student.v2.common.db.dao.n r1 = new com.bxkj.student.v2.common.db.dao.n
            java.lang.String r2 = "DELETE FROM menu WHERE mkey=?"
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

    @Override // com.bxkj.student.v2.common.db.dao.l
    @org.jetbrains.annotations.Nullable
    public java.lang.Object i(@org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.List<l0.c>> r5) {
            r3 = this;
            androidx.room.RoomDatabase r0 = r3.a
            com.bxkj.student.v2.common.db.dao.t r1 = new com.bxkj.student.v2.common.db.dao.t
            java.lang.String r2 = "SELECT * FROM menu WHERE mkey=?"
            r1.<init>(r2, r4)
            r4 = 1
            r2 = 0
            java.lang.Object r4 = androidx.room.util.DBUtil.performSuspending(r0, r4, r2, r1, r5)
            return r4
    }

    @Override // com.bxkj.student.v2.common.db.dao.l
    @org.jetbrains.annotations.Nullable
    public java.lang.Object j(@org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r6) {
            r3 = this;
            androidx.room.RoomDatabase r0 = r3.a
            com.bxkj.student.v2.common.db.dao.m r1 = new com.bxkj.student.v2.common.db.dao.m
            java.lang.String r2 = "UPDATE menu SET icon=? WHERE mkey=?"
            r1.<init>(r2, r4, r5)
            r4 = 0
            r5 = 1
            java.lang.Object r4 = androidx.room.util.DBUtil.performSuspending(r0, r4, r5, r1, r6)
            java.lang.Object r5 = kotlin.coroutines.intrinsics.a.l()
            if (r4 != r5) goto L16
            return r4
        L16:
            kotlin.n1 r4 = kotlin.n1.a
            return r4
    }

    @Override // com.bxkj.student.v2.common.db.dao.l
    @org.jetbrains.annotations.Nullable
    public java.lang.Object k(@org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.List<l0.c>> r5) {
            r3 = this;
            androidx.room.RoomDatabase r0 = r3.a
            com.bxkj.student.v2.common.db.dao.w r1 = new com.bxkj.student.v2.common.db.dao.w
            java.lang.String r2 = "SELECT * FROM menu WHERE type=? Order By cast(sort as INTEGER)"
            r1.<init>(r2, r4)
            r4 = 1
            r2 = 0
            java.lang.Object r4 = androidx.room.util.DBUtil.performSuspending(r0, r4, r2, r1, r5)
            return r4
    }
}
