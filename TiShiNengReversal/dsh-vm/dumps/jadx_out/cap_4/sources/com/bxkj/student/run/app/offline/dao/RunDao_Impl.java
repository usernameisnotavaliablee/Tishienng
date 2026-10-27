package com.bxkj.student.run.app.offline.dao;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class RunDao_Impl implements com.bxkj.student.run.app.offline.dao.RunDao {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.student.run.app.offline.dao.RunDao_Impl.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private final androidx.room.RoomDatabase __db;

    @org.jetbrains.annotations.NotNull
    private final androidx.room.EntityDeleteOrUpdateAdapter<com.bxkj.student.run.app.offline.table.RunDb> __deleteAdapterOfRunDb;

    @org.jetbrains.annotations.NotNull
    private final androidx.room.EntityInsertAdapter<com.bxkj.student.run.app.offline.table.RunDb> __insertAdapterOfRunDb;



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

        @org.jetbrains.annotations.NotNull
        public final java.util.List<kotlin.reflect.d<?>> getRequiredConverters() {
                r1 = this;
                java.util.List r0 = kotlin.collections.f0.J()
                return r0
        }
    }

    static {
            com.bxkj.student.run.app.offline.dao.RunDao_Impl$Companion r0 = new com.bxkj.student.run.app.offline.dao.RunDao_Impl$Companion
            r1 = 0
            r0.<init>(r1)
            com.bxkj.student.run.app.offline.dao.RunDao_Impl.Companion = r0
            return
    }

    public RunDao_Impl(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r2) {
            r1 = this;
            java.lang.String r0 = "__db"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.__db = r2
            com.bxkj.student.run.app.offline.dao.RunDao_Impl$1 r2 = new com.bxkj.student.run.app.offline.dao.RunDao_Impl$1
            r2.<init>()
            r1.__insertAdapterOfRunDb = r2
            com.bxkj.student.run.app.offline.dao.RunDao_Impl$2 r2 = new com.bxkj.student.run.app.offline.dao.RunDao_Impl$2
            r2.<init>()
            r1.__deleteAdapterOfRunDb = r2
            return
    }

    public static /* synthetic */ java.util.List a(java.lang.String r0, java.lang.String r1, androidx.sqlite.SQLiteConnection r2) {
            java.util.List r0 = getExceptionSports$lambda$3(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlin.n1 b(java.lang.String r0, java.lang.String r1, androidx.sqlite.SQLiteConnection r2) {
            kotlin.n1 r0 = deleteByIdentify$lambda$6(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlin.n1 c(com.bxkj.student.run.app.offline.dao.RunDao_Impl r0, com.bxkj.student.run.app.offline.table.RunDb[] r1, androidx.sqlite.SQLiteConnection r2) {
            kotlin.n1 r0 = insertRun$lambda$0(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ java.util.List d(java.lang.String r0, java.lang.String r1, androidx.sqlite.SQLiteConnection r2) {
            java.util.List r0 = getUploadFailSports$lambda$4(r0, r1, r2)
            return r0
    }

    private static final kotlin.n1 deleteByIdentify$lambda$6(java.lang.String r1, java.lang.String r2, androidx.sqlite.SQLiteConnection r3) {
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

    private static final kotlin.n1 deleteSports$lambda$1(com.bxkj.student.run.app.offline.dao.RunDao_Impl r1, com.bxkj.student.run.app.offline.table.RunDb r2, androidx.sqlite.SQLiteConnection r3) {
            java.lang.String r0 = "_connection"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.room.EntityDeleteOrUpdateAdapter<com.bxkj.student.run.app.offline.table.RunDb> r1 = r1.__deleteAdapterOfRunDb
            r1.handle(r3, r2)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    public static /* synthetic */ java.util.List e(java.lang.String r0, java.lang.String r1, androidx.sqlite.SQLiteConnection r2) {
            java.util.List r0 = getLocalRecordById$lambda$2(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlin.n1 f(com.bxkj.student.run.app.offline.dao.RunDao_Impl r0, com.bxkj.student.run.app.offline.table.RunDb r1, androidx.sqlite.SQLiteConnection r2) {
            kotlin.n1 r0 = deleteSports$lambda$1(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlin.n1 g(java.lang.String r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, androidx.sqlite.SQLiteConnection r4) {
            kotlin.n1 r0 = updateSports$lambda$7(r0, r1, r2, r3, r4)
            return r0
    }

    private static final java.util.List getExceptionSports$lambda$3(java.lang.String r33, java.lang.String r34, androidx.sqlite.SQLiteConnection r35) {
            r0 = r35
            java.lang.String r1 = "_connection"
            kotlin.jvm.internal.g0.p(r0, r1)
            r1 = r33
            androidx.sqlite.SQLiteStatement r1 = r0.prepare(r1)
            r0 = 1
            r2 = r34
            r1.bindText(r0, r2)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r0 = "identify"
            int r0 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r0)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r2 = "userNumber"
            int r2 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r2)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r3 = "sportsType"
            int r3 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r3)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r4 = "sportsSet"
            int r4 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r4)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r5 = "startTime"
            int r5 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r5)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r6 = "endTime"
            int r6 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r6)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r7 = "countTime"
            int r7 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r7)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r8 = "distance"
            int r8 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r8)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r9 = "latLngList"
            int r9 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r9)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r10 = "stepList"
            int r10 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r10)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r11 = "passLatLngList"
            int r11 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r11)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r12 = "points"
            int r12 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r12)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r13 = "isFaceOut"
            int r13 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r13)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r14 = "faceDetectCount"
            int r14 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r14)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r15 = "uploadType"
            int r15 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r15)     // Catch: java.lang.Throwable -> Lc9
            r33 = r15
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lc9
            r15.<init>()     // Catch: java.lang.Throwable -> Lc9
        L74:
            boolean r16 = r1.step()     // Catch: java.lang.Throwable -> Lc9
            if (r16 == 0) goto Lcb
            java.lang.String r18 = r1.getText(r0)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r19 = r1.getText(r2)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r20 = r1.getText(r3)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r21 = r1.getText(r4)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r22 = r1.getText(r5)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r23 = r1.getText(r6)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r24 = r1.getText(r7)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r25 = r1.getText(r8)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r26 = r1.getText(r9)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r27 = r1.getText(r10)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r28 = r1.getText(r11)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r29 = r1.getText(r12)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r30 = r1.getText(r13)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r31 = r1.getText(r14)     // Catch: java.lang.Throwable -> Lc9
            r34 = r0
            r0 = r33
            java.lang.String r32 = r1.getText(r0)     // Catch: java.lang.Throwable -> Lc9
            com.bxkj.student.run.app.offline.table.RunDb r17 = new com.bxkj.student.run.app.offline.table.RunDb     // Catch: java.lang.Throwable -> Lc9
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)     // Catch: java.lang.Throwable -> Lc9
            r33 = r0
            r0 = r17
            r15.add(r0)     // Catch: java.lang.Throwable -> Lc9
            r0 = r34
            goto L74
        Lc9:
            r0 = move-exception
            goto Lcf
        Lcb:
            r1.close()
            return r15
        Lcf:
            r1.close()
            throw r0
    }

    private static final java.util.List getLocalRecordById$lambda$2(java.lang.String r33, java.lang.String r34, androidx.sqlite.SQLiteConnection r35) {
            r0 = r35
            java.lang.String r1 = "_connection"
            kotlin.jvm.internal.g0.p(r0, r1)
            r1 = r33
            androidx.sqlite.SQLiteStatement r1 = r0.prepare(r1)
            r0 = 1
            r2 = r34
            r1.bindText(r0, r2)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r0 = "identify"
            int r0 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r0)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r2 = "userNumber"
            int r2 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r2)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r3 = "sportsType"
            int r3 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r3)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r4 = "sportsSet"
            int r4 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r4)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r5 = "startTime"
            int r5 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r5)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r6 = "endTime"
            int r6 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r6)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r7 = "countTime"
            int r7 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r7)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r8 = "distance"
            int r8 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r8)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r9 = "latLngList"
            int r9 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r9)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r10 = "stepList"
            int r10 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r10)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r11 = "passLatLngList"
            int r11 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r11)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r12 = "points"
            int r12 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r12)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r13 = "isFaceOut"
            int r13 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r13)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r14 = "faceDetectCount"
            int r14 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r14)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r15 = "uploadType"
            int r15 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r15)     // Catch: java.lang.Throwable -> Lc9
            r33 = r15
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lc9
            r15.<init>()     // Catch: java.lang.Throwable -> Lc9
        L74:
            boolean r16 = r1.step()     // Catch: java.lang.Throwable -> Lc9
            if (r16 == 0) goto Lcb
            java.lang.String r18 = r1.getText(r0)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r19 = r1.getText(r2)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r20 = r1.getText(r3)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r21 = r1.getText(r4)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r22 = r1.getText(r5)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r23 = r1.getText(r6)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r24 = r1.getText(r7)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r25 = r1.getText(r8)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r26 = r1.getText(r9)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r27 = r1.getText(r10)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r28 = r1.getText(r11)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r29 = r1.getText(r12)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r30 = r1.getText(r13)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r31 = r1.getText(r14)     // Catch: java.lang.Throwable -> Lc9
            r34 = r0
            r0 = r33
            java.lang.String r32 = r1.getText(r0)     // Catch: java.lang.Throwable -> Lc9
            com.bxkj.student.run.app.offline.table.RunDb r17 = new com.bxkj.student.run.app.offline.table.RunDb     // Catch: java.lang.Throwable -> Lc9
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)     // Catch: java.lang.Throwable -> Lc9
            r33 = r0
            r0 = r17
            r15.add(r0)     // Catch: java.lang.Throwable -> Lc9
            r0 = r34
            goto L74
        Lc9:
            r0 = move-exception
            goto Lcf
        Lcb:
            r1.close()
            return r15
        Lcf:
            r1.close()
            throw r0
    }

    private static final java.util.List getUploadFailSports$lambda$4(java.lang.String r33, java.lang.String r34, androidx.sqlite.SQLiteConnection r35) {
            r0 = r35
            java.lang.String r1 = "_connection"
            kotlin.jvm.internal.g0.p(r0, r1)
            r1 = r33
            androidx.sqlite.SQLiteStatement r1 = r0.prepare(r1)
            r0 = 1
            r2 = r34
            r1.bindText(r0, r2)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r0 = "identify"
            int r0 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r0)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r2 = "userNumber"
            int r2 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r2)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r3 = "sportsType"
            int r3 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r3)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r4 = "sportsSet"
            int r4 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r4)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r5 = "startTime"
            int r5 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r5)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r6 = "endTime"
            int r6 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r6)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r7 = "countTime"
            int r7 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r7)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r8 = "distance"
            int r8 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r8)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r9 = "latLngList"
            int r9 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r9)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r10 = "stepList"
            int r10 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r10)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r11 = "passLatLngList"
            int r11 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r11)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r12 = "points"
            int r12 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r12)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r13 = "isFaceOut"
            int r13 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r13)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r14 = "faceDetectCount"
            int r14 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r14)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r15 = "uploadType"
            int r15 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r15)     // Catch: java.lang.Throwable -> Lc9
            r33 = r15
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lc9
            r15.<init>()     // Catch: java.lang.Throwable -> Lc9
        L74:
            boolean r16 = r1.step()     // Catch: java.lang.Throwable -> Lc9
            if (r16 == 0) goto Lcb
            java.lang.String r18 = r1.getText(r0)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r19 = r1.getText(r2)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r20 = r1.getText(r3)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r21 = r1.getText(r4)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r22 = r1.getText(r5)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r23 = r1.getText(r6)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r24 = r1.getText(r7)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r25 = r1.getText(r8)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r26 = r1.getText(r9)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r27 = r1.getText(r10)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r28 = r1.getText(r11)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r29 = r1.getText(r12)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r30 = r1.getText(r13)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r31 = r1.getText(r14)     // Catch: java.lang.Throwable -> Lc9
            r34 = r0
            r0 = r33
            java.lang.String r32 = r1.getText(r0)     // Catch: java.lang.Throwable -> Lc9
            com.bxkj.student.run.app.offline.table.RunDb r17 = new com.bxkj.student.run.app.offline.table.RunDb     // Catch: java.lang.Throwable -> Lc9
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)     // Catch: java.lang.Throwable -> Lc9
            r33 = r0
            r0 = r17
            r15.add(r0)     // Catch: java.lang.Throwable -> Lc9
            r0 = r34
            goto L74
        Lc9:
            r0 = move-exception
            goto Lcf
        Lcb:
            r1.close()
            return r15
        Lcf:
            r1.close()
            throw r0
    }

    private static final java.util.List getUploadFailSportsByType$lambda$5(java.lang.String r33, java.lang.String r34, int r35, androidx.sqlite.SQLiteConnection r36) {
            r0 = r36
            java.lang.String r1 = "_connection"
            kotlin.jvm.internal.g0.p(r0, r1)
            r1 = r33
            androidx.sqlite.SQLiteStatement r1 = r0.prepare(r1)
            r0 = 1
            r2 = r34
            r1.bindText(r0, r2)     // Catch: java.lang.Throwable -> Ld0
            r0 = 2
            r2 = r35
            long r2 = (long) r2     // Catch: java.lang.Throwable -> Ld0
            r1.bindLong(r0, r2)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r0 = "identify"
            int r0 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r0)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r2 = "userNumber"
            int r2 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r2)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r3 = "sportsType"
            int r3 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r3)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r4 = "sportsSet"
            int r4 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r4)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r5 = "startTime"
            int r5 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r5)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r6 = "endTime"
            int r6 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r6)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r7 = "countTime"
            int r7 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r7)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r8 = "distance"
            int r8 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r8)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r9 = "latLngList"
            int r9 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r9)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r10 = "stepList"
            int r10 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r10)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r11 = "passLatLngList"
            int r11 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r11)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r12 = "points"
            int r12 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r12)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r13 = "isFaceOut"
            int r13 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r13)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r14 = "faceDetectCount"
            int r14 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r14)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r15 = "uploadType"
            int r15 = androidx.room.util.SQLiteStatementUtil.getColumnIndexOrThrow(r1, r15)     // Catch: java.lang.Throwable -> Ld0
            r33 = r15
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ld0
            r15.<init>()     // Catch: java.lang.Throwable -> Ld0
        L7b:
            boolean r16 = r1.step()     // Catch: java.lang.Throwable -> Ld0
            if (r16 == 0) goto Ld2
            java.lang.String r18 = r1.getText(r0)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r19 = r1.getText(r2)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r20 = r1.getText(r3)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r21 = r1.getText(r4)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r22 = r1.getText(r5)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r23 = r1.getText(r6)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r24 = r1.getText(r7)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r25 = r1.getText(r8)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r26 = r1.getText(r9)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r27 = r1.getText(r10)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r28 = r1.getText(r11)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r29 = r1.getText(r12)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r30 = r1.getText(r13)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r31 = r1.getText(r14)     // Catch: java.lang.Throwable -> Ld0
            r34 = r0
            r0 = r33
            java.lang.String r32 = r1.getText(r0)     // Catch: java.lang.Throwable -> Ld0
            com.bxkj.student.run.app.offline.table.RunDb r17 = new com.bxkj.student.run.app.offline.table.RunDb     // Catch: java.lang.Throwable -> Ld0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)     // Catch: java.lang.Throwable -> Ld0
            r33 = r0
            r0 = r17
            r15.add(r0)     // Catch: java.lang.Throwable -> Ld0
            r0 = r34
            goto L7b
        Ld0:
            r0 = move-exception
            goto Ld6
        Ld2:
            r1.close()
            return r15
        Ld6:
            r1.close()
            throw r0
    }

    public static /* synthetic */ java.util.List h(java.lang.String r0, java.lang.String r1, int r2, androidx.sqlite.SQLiteConnection r3) {
            java.util.List r0 = getUploadFailSportsByType$lambda$5(r0, r1, r2, r3)
            return r0
    }

    private static final kotlin.n1 insertRun$lambda$0(com.bxkj.student.run.app.offline.dao.RunDao_Impl r1, com.bxkj.student.run.app.offline.table.RunDb[] r2, androidx.sqlite.SQLiteConnection r3) {
            java.lang.String r0 = "_connection"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.room.EntityInsertAdapter<com.bxkj.student.run.app.offline.table.RunDb> r1 = r1.__insertAdapterOfRunDb
            r1.insert(r3, r2)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    private static final kotlin.n1 updateSports$lambda$7(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, androidx.sqlite.SQLiteConnection r5) {
            java.lang.String r0 = "_connection"
            kotlin.jvm.internal.g0.p(r5, r0)
            androidx.sqlite.SQLiteStatement r1 = r5.prepare(r1)
            r5 = 1
            r1.bindText(r5, r2)     // Catch: java.lang.Throwable -> L1e
            r2 = 2
            r1.bindText(r2, r3)     // Catch: java.lang.Throwable -> L1e
            r2 = 3
            r1.bindText(r2, r4)     // Catch: java.lang.Throwable -> L1e
            r1.step()     // Catch: java.lang.Throwable -> L1e
            r1.close()
            kotlin.n1 r1 = kotlin.n1.a
            return r1
        L1e:
            r2 = move-exception
            r1.close()
            throw r2
    }

    @Override // com.bxkj.student.run.app.offline.dao.RunDao
    @org.jetbrains.annotations.Nullable
    public java.lang.Object deleteByIdentify(@org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r5) {
            r3 = this;
            androidx.room.RoomDatabase r0 = r3.__db
            com.bxkj.student.run.app.offline.dao.g r1 = new com.bxkj.student.run.app.offline.dao.g
            java.lang.String r2 = "DELETE FROM runDb WHERE identify=?"
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

    @Override // com.bxkj.student.run.app.offline.dao.RunDao
    @org.jetbrains.annotations.Nullable
    public java.lang.Object deleteSports(@org.jetbrains.annotations.NotNull com.bxkj.student.run.app.offline.table.RunDb r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r5) {
            r3 = this;
            androidx.room.RoomDatabase r0 = r3.__db
            com.bxkj.student.run.app.offline.dao.a r1 = new com.bxkj.student.run.app.offline.dao.a
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

    @Override // com.bxkj.student.run.app.offline.dao.RunDao
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getExceptionSports(@org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.List<com.bxkj.student.run.app.offline.table.RunDb>> r5) {
            r3 = this;
            androidx.room.RoomDatabase r0 = r3.__db
            com.bxkj.student.run.app.offline.dao.e r1 = new com.bxkj.student.run.app.offline.dao.e
            java.lang.String r2 = "SELECT * FROM runDb WHERE userNumber = ? AND uploadType =='-1'"
            r1.<init>(r2, r4)
            r4 = 1
            r2 = 0
            java.lang.Object r4 = androidx.room.util.DBUtil.performSuspending(r0, r4, r2, r1, r5)
            return r4
    }

    @Override // com.bxkj.student.run.app.offline.dao.RunDao
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getLocalRecordById(@org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.List<com.bxkj.student.run.app.offline.table.RunDb>> r5) {
            r3 = this;
            androidx.room.RoomDatabase r0 = r3.__db
            com.bxkj.student.run.app.offline.dao.h r1 = new com.bxkj.student.run.app.offline.dao.h
            java.lang.String r2 = "SELECT * FROM runDb WHERE identify = ?"
            r1.<init>(r2, r4)
            r4 = 1
            r2 = 0
            java.lang.Object r4 = androidx.room.util.DBUtil.performSuspending(r0, r4, r2, r1, r5)
            return r4
    }

    @Override // com.bxkj.student.run.app.offline.dao.RunDao
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getUploadFailSports(@org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.List<com.bxkj.student.run.app.offline.table.RunDb>> r5) {
            r3 = this;
            androidx.room.RoomDatabase r0 = r3.__db
            com.bxkj.student.run.app.offline.dao.c r1 = new com.bxkj.student.run.app.offline.dao.c
            java.lang.String r2 = "SELECT * FROM runDb WHERE userNumber = ? AND uploadType !='-1'"
            r1.<init>(r2, r4)
            r4 = 1
            r2 = 0
            java.lang.Object r4 = androidx.room.util.DBUtil.performSuspending(r0, r4, r2, r1, r5)
            return r4
    }

    @Override // com.bxkj.student.run.app.offline.dao.RunDao
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getUploadFailSportsByType(@org.jetbrains.annotations.NotNull java.lang.String r4, int r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.List<com.bxkj.student.run.app.offline.table.RunDb>> r6) {
            r3 = this;
            androidx.room.RoomDatabase r0 = r3.__db
            com.bxkj.student.run.app.offline.dao.b r1 = new com.bxkj.student.run.app.offline.dao.b
            java.lang.String r2 = "SELECT * FROM runDb WHERE userNumber = ? AND uploadType !='-1' AND sportsType=?"
            r1.<init>(r2, r4, r5)
            r4 = 1
            r5 = 0
            java.lang.Object r4 = androidx.room.util.DBUtil.performSuspending(r0, r4, r5, r1, r6)
            return r4
    }

    @Override // com.bxkj.student.run.app.offline.dao.RunDao
    @org.jetbrains.annotations.Nullable
    public java.lang.Object insertRun(@org.jetbrains.annotations.NotNull com.bxkj.student.run.app.offline.table.RunDb[] r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r5) {
            r3 = this;
            androidx.room.RoomDatabase r0 = r3.__db
            com.bxkj.student.run.app.offline.dao.f r1 = new com.bxkj.student.run.app.offline.dao.f
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

    @Override // com.bxkj.student.run.app.offline.dao.RunDao
    @org.jetbrains.annotations.Nullable
    public java.lang.Object updateSports(@org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r7) {
            r3 = this;
            androidx.room.RoomDatabase r0 = r3.__db
            com.bxkj.student.run.app.offline.dao.d r1 = new com.bxkj.student.run.app.offline.dao.d
            java.lang.String r2 = "UPDATE runDb SET endTime=?,uploadType=? WHERE identify=?"
            r1.<init>(r2, r4, r5, r6)
            r4 = 0
            r5 = 1
            java.lang.Object r4 = androidx.room.util.DBUtil.performSuspending(r0, r4, r5, r1, r7)
            java.lang.Object r5 = kotlin.coroutines.intrinsics.a.l()
            if (r4 != r5) goto L16
            return r4
        L16:
            kotlin.n1 r4 = kotlin.n1.a
            return r4
    }
}
