package com.ss.android.socialbase.downloader.cw;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class up extends com.ss.android.socialbase.downloader.cw.cw.j implements com.ss.android.socialbase.downloader.downloader.tj {
    private static volatile android.database.sqlite.SQLiteDatabase xt;
    private com.ss.android.socialbase.downloader.cw.ae cw;
    com.ss.android.socialbase.downloader.cw.xt j;
    private volatile boolean m;
    private com.ss.android.socialbase.downloader.cw.ae r;
    private com.ss.android.socialbase.downloader.cw.ae up;












    static {
            return
    }

    public up() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public up(boolean r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.j = r0
            if (r2 != 0) goto L9
            return
        L9:
            r2 = 0
            r1.m = r2
            r1.j()
            return
    }

    static /* synthetic */ android.database.sqlite.SQLiteDatabase ae() {
            android.database.sqlite.SQLiteDatabase r0 = com.ss.android.socialbase.downloader.cw.up.xt
            return r0
    }

    static /* synthetic */ com.ss.android.socialbase.downloader.cw.ae cw(com.ss.android.socialbase.downloader.cw.up r0) {
            com.ss.android.socialbase.downloader.cw.ae r0 = r0.cw
            return r0
    }

    private void cw(com.ss.android.socialbase.downloader.ae.cw r2) {
            r1 = this;
            r1.tl()
            android.database.sqlite.SQLiteDatabase r0 = com.ss.android.socialbase.downloader.cw.up.xt
            if (r0 == 0) goto L14
            com.ss.android.socialbase.downloader.cw.ae r0 = r1.cw
            if (r0 != 0) goto Lc
            goto L14
        Lc:
            com.ss.android.socialbase.downloader.cw.up$9 r0 = new com.ss.android.socialbase.downloader.cw.up$9
            r0.<init>(r1, r2)
            com.ss.android.socialbase.downloader.downloader.cw.cw(r0)
        L14:
            return
    }

    private void g() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = com.ss.android.socialbase.downloader.cw.up.xt
            r0.beginTransaction()
            return
    }

    private void j(int r4, int r5, int r6, int r7, android.database.sqlite.SQLiteStatement r8) {
            r3 = this;
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L2d
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L2a
            r0.<init>()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r1 = "chunkIndex"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L2a
            r0.put(r1, r7)     // Catch: java.lang.Throwable -> L2a
            android.database.sqlite.SQLiteDatabase r7 = com.ss.android.socialbase.downloader.cw.up.xt     // Catch: java.lang.Throwable -> L2a
            java.lang.String r1 = "downloadChunk"
            java.lang.String r2 = "_id = ? AND chunkIndex = ? AND hostChunkIndex = ?"
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r5 = java.lang.Integer.toString(r5)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r6 = java.lang.Integer.toString(r6)     // Catch: java.lang.Throwable -> L2a
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6}     // Catch: java.lang.Throwable -> L2a
            r7.update(r1, r0, r2, r4)     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L2a
            return
        L2a:
            r4 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L2a
            throw r4     // Catch: java.lang.Throwable -> L2d
        L2d:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)
            return
    }

    private void j(int r3, int r4, int r5, long r6, android.database.sqlite.SQLiteStatement r8) {
            r2 = this;
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L2d
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L2a
            r0.<init>()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r1 = "curOffset"
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L2a
            r0.put(r1, r6)     // Catch: java.lang.Throwable -> L2a
            android.database.sqlite.SQLiteDatabase r6 = com.ss.android.socialbase.downloader.cw.up.xt     // Catch: java.lang.Throwable -> L2a
            java.lang.String r7 = "downloadChunk"
            java.lang.String r1 = "_id = ? AND chunkIndex = ? AND hostChunkIndex = ?"
            java.lang.String r3 = java.lang.Integer.toString(r3)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r5 = java.lang.Integer.toString(r5)     // Catch: java.lang.Throwable -> L2a
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5}     // Catch: java.lang.Throwable -> L2a
            r6.update(r7, r0, r1, r3)     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L2a
            return
        L2a:
            r3 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L2a
            throw r3     // Catch: java.lang.Throwable -> L2d
        L2d:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
            return
    }

    private void j(int r3, int r4, long r5, android.database.sqlite.SQLiteStatement r7) {
            r2 = this;
            monitor-enter(r7)     // Catch: java.lang.Throwable -> L29
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L26
            r0.<init>()     // Catch: java.lang.Throwable -> L26
            java.lang.String r1 = "curOffset"
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L26
            r0.put(r1, r5)     // Catch: java.lang.Throwable -> L26
            android.database.sqlite.SQLiteDatabase r5 = com.ss.android.socialbase.downloader.cw.up.xt     // Catch: java.lang.Throwable -> L26
            java.lang.String r6 = "downloadChunk"
            java.lang.String r1 = "_id = ? AND chunkIndex = ?"
            java.lang.String r3 = java.lang.Integer.toString(r3)     // Catch: java.lang.Throwable -> L26
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch: java.lang.Throwable -> L26
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch: java.lang.Throwable -> L26
            r5.update(r6, r0, r1, r3)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L26
            return
        L26:
            r3 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L26
            throw r3     // Catch: java.lang.Throwable -> L29
        L29:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
            return
    }

    private void j(int r4, android.content.ContentValues r5) {
            r3 = this;
            r0 = 10
        L2:
            android.database.sqlite.SQLiteDatabase r1 = com.ss.android.socialbase.downloader.cw.up.xt     // Catch: java.lang.Throwable -> L19
            boolean r1 = r1.isDbLockedByCurrentThread()     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L1b
            int r0 = r0 + (-1)
            if (r0 < 0) goto L1b
            r1 = 5
            java.lang.Thread.sleep(r1)     // Catch: java.lang.Throwable -> L14
            goto L2
        L14:
            r1 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r1)     // Catch: java.lang.Throwable -> L19
            goto L2
        L19:
            r4 = move-exception
            goto L32
        L1b:
            android.database.sqlite.SQLiteDatabase r0 = com.ss.android.socialbase.downloader.cw.up.xt     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = "downloader"
            java.lang.String r2 = "_id = ? "
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L2d
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L2d
            r0.update(r1, r5, r2, r4)     // Catch: java.lang.Throwable -> L2d
            goto L31
        L2d:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)     // Catch: java.lang.Throwable -> L19
        L31:
            return
        L32:
            com.bytedance.sdk.component.utils.vl.j(r4)
            return
    }

    private void j(int r4, android.database.sqlite.SQLiteStatement r5) {
            r3 = this;
            if (r5 != 0) goto L3
            return
        L3:
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L11
            r0 = 1
            long r1 = (long) r4
            r5.bindLong(r0, r1)     // Catch: java.lang.Throwable -> Le
            r5.execute()     // Catch: java.lang.Throwable -> Le
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r4 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Le
            throw r4     // Catch: java.lang.Throwable -> L11
        L11:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)
            return
    }

    private void j(com.ss.android.socialbase.downloader.ae.cw r1, android.database.sqlite.SQLiteStatement r2) {
            r0 = this;
            if (r1 == 0) goto L15
            if (r2 != 0) goto L5
            goto L15
        L5:
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L11
            r1.j(r2)     // Catch: java.lang.Throwable -> Le
            r2.executeInsert()     // Catch: java.lang.Throwable -> Le
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r1 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            throw r1     // Catch: java.lang.Throwable -> L11
        L11:
            r1 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r1)
        L15:
            return
    }

    private void j(com.ss.android.socialbase.downloader.ae.xt r1, android.database.sqlite.SQLiteStatement r2) {
            r0 = this;
            if (r1 == 0) goto L15
            if (r2 != 0) goto L5
            goto L15
        L5:
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L11
            r1.j(r2)     // Catch: java.lang.Throwable -> Le
            r2.executeInsert()     // Catch: java.lang.Throwable -> Le
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r1 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            throw r1     // Catch: java.lang.Throwable -> L11
        L11:
            r1 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r1)
        L15:
            return
    }

    static /* synthetic */ void j(com.ss.android.socialbase.downloader.cw.up r0) {
            r0.tl()
            return
    }

    static /* synthetic */ void j(com.ss.android.socialbase.downloader.cw.up r0, int r1, int r2, int r3, int r4, android.database.sqlite.SQLiteStatement r5) {
            r0.j(r1, r2, r3, r4, r5)
            return
    }

    static /* synthetic */ void j(com.ss.android.socialbase.downloader.cw.up r0, int r1, int r2, int r3, long r4, android.database.sqlite.SQLiteStatement r6) {
            r0.j(r1, r2, r3, r4, r6)
            return
    }

    static /* synthetic */ void j(com.ss.android.socialbase.downloader.cw.up r0, int r1, int r2, long r3, android.database.sqlite.SQLiteStatement r5) {
            r0.j(r1, r2, r3, r5)
            return
    }

    static /* synthetic */ void j(com.ss.android.socialbase.downloader.cw.up r0, int r1, android.content.ContentValues r2) {
            r0.j(r1, r2)
            return
    }

    static /* synthetic */ void j(com.ss.android.socialbase.downloader.cw.up r0, int r1, android.database.sqlite.SQLiteStatement r2) {
            r0.j(r1, r2)
            return
    }

    static /* synthetic */ void j(com.ss.android.socialbase.downloader.cw.up r0, com.ss.android.socialbase.downloader.ae.cw r1) {
            r0.r(r1)
            return
    }

    static /* synthetic */ void j(com.ss.android.socialbase.downloader.cw.up r0, com.ss.android.socialbase.downloader.ae.cw r1, android.database.sqlite.SQLiteStatement r2) {
            r0.j(r1, r2)
            return
    }

    static /* synthetic */ void j(com.ss.android.socialbase.downloader.cw.up r0, com.ss.android.socialbase.downloader.ae.xt r1, android.database.sqlite.SQLiteStatement r2) {
            r0.j(r1, r2)
            return
    }

    static /* synthetic */ void j(com.ss.android.socialbase.downloader.cw.up r0, java.util.List r1) {
            r0.j(r1)
            return
    }

    static /* synthetic */ void j(com.ss.android.socialbase.downloader.cw.up r0, java.util.List r1, java.util.List r2, android.util.SparseArray r3, android.util.SparseArray r4, android.util.SparseArray r5) {
            r0.j(r1, r2, r3, r4, r5)
            return
    }

    private void j(java.util.List<com.ss.android.socialbase.downloader.ae.cw> r3) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L1f
        L3:
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L1f
        L7:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L1f
            com.ss.android.socialbase.downloader.ae.cw r0 = (com.ss.android.socialbase.downloader.ae.cw) r0     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L7
            boolean r1 = r0.ag()     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L7
            com.ss.android.socialbase.downloader.az.m.xt(r0)     // Catch: java.lang.Throwable -> L1f
            goto L7
        L1f:
            return
    }

    private void j(java.util.List<com.ss.android.socialbase.downloader.ae.cw> r11, java.util.List<java.lang.Integer> r12, android.util.SparseArray<com.ss.android.socialbase.downloader.ae.cw> r13, android.util.SparseArray<com.ss.android.socialbase.downloader.ae.cw> r14, android.util.SparseArray<java.util.List<com.ss.android.socialbase.downloader.ae.xt>> r15) {
            r10 = this;
            int r0 = r13.size()
            if (r0 < 0) goto L14c
            android.database.sqlite.SQLiteDatabase r1 = com.ss.android.socialbase.downloader.cw.up.xt
            if (r1 != 0) goto Lc
            goto L14c
        Lc:
            android.database.sqlite.SQLiteDatabase r1 = com.ss.android.socialbase.downloader.cw.up.xt
            monitor-enter(r1)
            r10.g()     // Catch: java.lang.Throwable -> L40
            boolean r2 = r11.isEmpty()     // Catch: java.lang.Throwable -> L40
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L99
            com.ss.android.socialbase.downloader.jy.j r2 = com.ss.android.socialbase.downloader.jy.j.cw()     // Catch: java.lang.Throwable -> L40
            java.lang.String r5 = "clear_invalid_task_error"
            boolean r2 = r2.j(r5)     // Catch: java.lang.Throwable -> L40
            if (r2 == 0) goto L79
            int r12 = r11.size()     // Catch: java.lang.Throwable -> L40
            java.lang.String[] r12 = new java.lang.String[r12]     // Catch: java.lang.Throwable -> L40
            r2 = 0
        L2d:
            int r5 = r11.size()     // Catch: java.lang.Throwable -> L40
            if (r2 >= r5) goto L43
            java.lang.Object r5 = r11.get(r2)     // Catch: java.lang.Throwable -> L40
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L40
            r12[r2] = r5     // Catch: java.lang.Throwable -> L40
            int r2 = r2 + 1
            goto L2d
        L40:
            r11 = move-exception
            goto L13f
        L43:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            java.lang.String r5 = "CAST(_id AS TEXT) IN ("
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L40
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> L40
            int r11 = r11.size()     // Catch: java.lang.Throwable -> L40
            int r11 = r11 - r4
            char[] r11 = new char[r11]     // Catch: java.lang.Throwable -> L40
            r5.<init>(r11)     // Catch: java.lang.Throwable -> L40
            java.lang.String r11 = "\u0000"
            java.lang.String r6 = "?,"
            java.lang.String r11 = r5.replace(r11, r6)     // Catch: java.lang.Throwable -> L40
            r2.append(r11)     // Catch: java.lang.Throwable -> L40
            java.lang.String r11 = "?)"
            r2.append(r11)     // Catch: java.lang.Throwable -> L40
            java.lang.String r11 = r2.toString()     // Catch: java.lang.Throwable -> L40
            android.database.sqlite.SQLiteDatabase r2 = com.ss.android.socialbase.downloader.cw.up.xt     // Catch: java.lang.Throwable -> L40
            java.lang.String r5 = "downloader"
            r2.delete(r5, r11, r12)     // Catch: java.lang.Throwable -> L40
            android.database.sqlite.SQLiteDatabase r2 = com.ss.android.socialbase.downloader.cw.up.xt     // Catch: java.lang.Throwable -> L40
            java.lang.String r5 = "downloadChunk"
            r2.delete(r5, r11, r12)     // Catch: java.lang.Throwable -> L40
            goto L99
        L79:
            java.lang.String r11 = ", "
            java.lang.String r11 = android.text.TextUtils.join(r11, r12)     // Catch: java.lang.Throwable -> L40
            android.database.sqlite.SQLiteDatabase r12 = com.ss.android.socialbase.downloader.cw.up.xt     // Catch: java.lang.Throwable -> L40
            java.lang.String r2 = "downloader"
            java.lang.String r5 = "_id IN (?)"
            java.lang.String[] r6 = new java.lang.String[]{r11}     // Catch: java.lang.Throwable -> L40
            r12.delete(r2, r5, r6)     // Catch: java.lang.Throwable -> L40
            android.database.sqlite.SQLiteDatabase r12 = com.ss.android.socialbase.downloader.cw.up.xt     // Catch: java.lang.Throwable -> L40
            java.lang.String r2 = "downloadChunk"
            java.lang.String r5 = "_id IN (?)"
            java.lang.String[] r11 = new java.lang.String[]{r11}     // Catch: java.lang.Throwable -> L40
            r12.delete(r2, r5, r11)     // Catch: java.lang.Throwable -> L40
        L99:
            r11 = 0
        L9a:
            if (r11 >= r0) goto L10a
            int r12 = r13.keyAt(r11)     // Catch: java.lang.Throwable -> L40
            java.lang.Object r2 = r13.get(r12)     // Catch: java.lang.Throwable -> L40
            com.ss.android.socialbase.downloader.ae.cw r2 = (com.ss.android.socialbase.downloader.ae.cw) r2     // Catch: java.lang.Throwable -> L40
            android.database.sqlite.SQLiteDatabase r5 = com.ss.android.socialbase.downloader.cw.up.xt     // Catch: java.lang.Throwable -> L40
            java.lang.String r6 = "downloader"
            java.lang.String r7 = "_id = ?"
            java.lang.String r8 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> L40
            java.lang.String[] r8 = new java.lang.String[]{r8}     // Catch: java.lang.Throwable -> L40
            r5.delete(r6, r7, r8)     // Catch: java.lang.Throwable -> L40
            android.database.sqlite.SQLiteDatabase r5 = com.ss.android.socialbase.downloader.cw.up.xt     // Catch: java.lang.Throwable -> L40
            java.lang.String r6 = "downloader"
            android.content.ContentValues r7 = r2.up()     // Catch: java.lang.Throwable -> L40
            r8 = 0
            r5.insert(r6, r8, r7)     // Catch: java.lang.Throwable -> L40
            int r5 = r2.kj()     // Catch: java.lang.Throwable -> L40
            if (r5 <= r4) goto L107
            java.util.List r5 = r10.cw(r12)     // Catch: java.lang.Throwable -> L40
            int r6 = r5.size()     // Catch: java.lang.Throwable -> L40
            if (r6 <= 0) goto L107
            android.database.sqlite.SQLiteDatabase r6 = com.ss.android.socialbase.downloader.cw.up.xt     // Catch: java.lang.Throwable -> L40
            java.lang.String r7 = "downloadChunk"
            java.lang.String r9 = "_id = ?"
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> L40
            java.lang.String[] r12 = new java.lang.String[]{r12}     // Catch: java.lang.Throwable -> L40
            r6.delete(r7, r9, r12)     // Catch: java.lang.Throwable -> L40
            java.util.Iterator r12 = r5.iterator()     // Catch: java.lang.Throwable -> L40
        Le8:
            boolean r5 = r12.hasNext()     // Catch: java.lang.Throwable -> L40
            if (r5 == 0) goto L107
            java.lang.Object r5 = r12.next()     // Catch: java.lang.Throwable -> L40
            com.ss.android.socialbase.downloader.ae.xt r5 = (com.ss.android.socialbase.downloader.ae.xt) r5     // Catch: java.lang.Throwable -> L40
            int r6 = r2.ae()     // Catch: java.lang.Throwable -> L40
            r5.xt(r6)     // Catch: java.lang.Throwable -> L40
            android.database.sqlite.SQLiteDatabase r6 = com.ss.android.socialbase.downloader.cw.up.xt     // Catch: java.lang.Throwable -> L40
            java.lang.String r7 = "downloadChunk"
            android.content.ContentValues r5 = r5.j()     // Catch: java.lang.Throwable -> L40
            r6.insert(r7, r8, r5)     // Catch: java.lang.Throwable -> L40
            goto Le8
        L107:
            int r11 = r11 + 1
            goto L9a
        L10a:
            if (r14 == 0) goto L134
            if (r15 == 0) goto L134
            int r11 = r14.size()     // Catch: java.lang.Throwable -> L40
        L112:
            if (r3 >= r11) goto L134
            java.lang.Object r12 = r14.valueAt(r3)     // Catch: java.lang.Throwable -> L40
            com.ss.android.socialbase.downloader.ae.cw r12 = (com.ss.android.socialbase.downloader.ae.cw) r12     // Catch: java.lang.Throwable -> L40
            int r12 = r12.ae()     // Catch: java.lang.Throwable -> L40
            java.util.List r13 = r10.cw(r12)     // Catch: java.lang.Throwable -> L40
            java.util.List r13 = com.ss.android.socialbase.downloader.az.m.j(r13)     // Catch: java.lang.Throwable -> L40
            if (r13 == 0) goto L131
            int r0 = r13.size()     // Catch: java.lang.Throwable -> L40
            if (r0 <= 0) goto L131
            r15.put(r12, r13)     // Catch: java.lang.Throwable -> L40
        L131:
            int r3 = r3 + 1
            goto L112
        L134:
            android.database.sqlite.SQLiteDatabase r11 = com.ss.android.socialbase.downloader.cw.up.xt     // Catch: java.lang.Throwable -> L40
            r11.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L40
        L139:
            r10.oq()     // Catch: java.lang.Throwable -> L13d
            goto L143
        L13d:
            r11 = move-exception
            goto L14a
        L13f:
            com.bytedance.sdk.component.utils.vl.j(r11)     // Catch: java.lang.Throwable -> L145
            goto L139
        L143:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13d
            goto L14c
        L145:
            r11 = move-exception
            r10.oq()     // Catch: java.lang.Throwable -> L13d
            throw r11     // Catch: java.lang.Throwable -> L13d
        L14a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13d
            throw r11
        L14c:
            return
    }

    static /* synthetic */ boolean j(com.ss.android.socialbase.downloader.cw.up r0, boolean r1) {
            r0.m = r1
            return r1
    }

    private void oq() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = com.ss.android.socialbase.downloader.cw.up.xt     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            android.database.sqlite.SQLiteDatabase r0 = com.ss.android.socialbase.downloader.cw.up.xt     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.inTransaction()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            android.database.sqlite.SQLiteDatabase r0 = com.ss.android.socialbase.downloader.cw.up.xt     // Catch: java.lang.Throwable -> L12
            r0.endTransaction()     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r0 = move-exception
            goto L15
        L14:
            return
        L15:
            com.bytedance.sdk.component.utils.vl.j(r0)
            return
    }

    private synchronized void qv() {
            r3 = this;
            monitor-enter(r3)
            r3.g()     // Catch: java.lang.Throwable -> L1f
            android.database.sqlite.SQLiteDatabase r0 = com.ss.android.socialbase.downloader.cw.up.xt     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = "downloader"
            r2 = 0
            r0.delete(r1, r2, r2)     // Catch: java.lang.Throwable -> L1f
            android.database.sqlite.SQLiteDatabase r0 = com.ss.android.socialbase.downloader.cw.up.xt     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = "downloadChunk"
            r0.delete(r1, r2, r2)     // Catch: java.lang.Throwable -> L1f
            android.database.sqlite.SQLiteDatabase r0 = com.ss.android.socialbase.downloader.cw.up.xt     // Catch: java.lang.Throwable -> L1f
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L1f
            r3.oq()     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)
            return
        L1d:
            r0 = move-exception
            goto L2d
        L1f:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)     // Catch: java.lang.Throwable -> L28
            r3.oq()     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)
            return
        L28:
            r0 = move-exception
            r3.oq()     // Catch: java.lang.Throwable -> L1d
            throw r0     // Catch: java.lang.Throwable -> L1d
        L2d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            throw r0
    }

    private synchronized void r(com.ss.android.socialbase.downloader.ae.cw r2) {
            r1 = this;
            monitor-enter(r1)
            if (r2 != 0) goto L5
            monitor-exit(r1)
            return
        L5:
            int r0 = r2.ae()     // Catch: java.lang.Throwable -> L14
            boolean r0 = r1.j(r0)     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L16
            r1.cw(r2)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r1)
            return
        L14:
            r2 = move-exception
            goto L2b
        L16:
            com.ss.android.socialbase.downloader.cw.ae r0 = r1.cw     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L1c
            monitor-exit(r1)
            return
        L1c:
            android.database.sqlite.SQLiteStatement r0 = r0.cw()     // Catch: java.lang.Throwable -> L25
            r1.xt(r2, r0)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r1)
            return
        L25:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r1)
            return
        L2b:
            com.bytedance.sdk.component.utils.vl.j(r2)     // Catch: java.lang.Throwable -> L30
            monitor-exit(r1)
            return
        L30:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L30
            throw r2
    }

    static /* synthetic */ void r(com.ss.android.socialbase.downloader.cw.up r0) {
            r0.qv()
            return
    }

    private void tl() {
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = com.ss.android.socialbase.downloader.cw.up.xt
            if (r0 != 0) goto L4e
            java.lang.Class<com.ss.android.socialbase.downloader.cw.up> r0 = com.ss.android.socialbase.downloader.cw.up.class
            monitor-enter(r0)
            android.database.sqlite.SQLiteDatabase r1 = com.ss.android.socialbase.downloader.cw.up.xt     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto L4a
            com.ss.android.socialbase.downloader.cw.j r1 = com.ss.android.socialbase.downloader.cw.j.j()     // Catch: java.lang.Throwable -> L43
            android.database.sqlite.SQLiteDatabase r1 = r1.getWritableDatabase()     // Catch: java.lang.Throwable -> L43
            com.ss.android.socialbase.downloader.cw.up.xt = r1     // Catch: java.lang.Throwable -> L43
            com.ss.android.socialbase.downloader.cw.ae r1 = new com.ss.android.socialbase.downloader.cw.ae     // Catch: java.lang.Throwable -> L43
            android.database.sqlite.SQLiteDatabase r2 = com.ss.android.socialbase.downloader.cw.up.xt     // Catch: java.lang.Throwable -> L43
            java.lang.String r3 = "downloader"
            java.lang.String[] r4 = com.ss.android.socialbase.downloader.xt.cw.j     // Catch: java.lang.Throwable -> L43
            java.lang.String[] r5 = com.ss.android.socialbase.downloader.xt.cw.xt     // Catch: java.lang.Throwable -> L43
            r1.<init>(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L43
            r6.cw = r1     // Catch: java.lang.Throwable -> L43
            com.ss.android.socialbase.downloader.cw.ae r1 = new com.ss.android.socialbase.downloader.cw.ae     // Catch: java.lang.Throwable -> L43
            android.database.sqlite.SQLiteDatabase r2 = com.ss.android.socialbase.downloader.cw.up.xt     // Catch: java.lang.Throwable -> L43
            java.lang.String r3 = "downloadChunk"
            java.lang.String[] r4 = com.ss.android.socialbase.downloader.xt.cw.cw     // Catch: java.lang.Throwable -> L43
            java.lang.String[] r5 = com.ss.android.socialbase.downloader.xt.cw.r     // Catch: java.lang.Throwable -> L43
            r1.<init>(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L43
            r6.r = r1     // Catch: java.lang.Throwable -> L43
            com.ss.android.socialbase.downloader.cw.ae r1 = new com.ss.android.socialbase.downloader.cw.ae     // Catch: java.lang.Throwable -> L43
            android.database.sqlite.SQLiteDatabase r2 = com.ss.android.socialbase.downloader.cw.up.xt     // Catch: java.lang.Throwable -> L43
            java.lang.String r3 = "segments"
            java.lang.String[] r4 = com.ss.android.socialbase.downloader.xt.cw.up     // Catch: java.lang.Throwable -> L43
            java.lang.String[] r5 = com.ss.android.socialbase.downloader.xt.cw.m     // Catch: java.lang.Throwable -> L43
            r1.<init>(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L43
            r6.up = r1     // Catch: java.lang.Throwable -> L43
            goto L4a
        L43:
            r1 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r1)     // Catch: java.lang.Throwable -> L48
            goto L4a
        L48:
            r1 = move-exception
            goto L4c
        L4a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            goto L4e
        L4c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            throw r1
        L4e:
            return
    }

    private void update(int r2, android.content.ContentValues r3) {
            r1 = this;
            r1.tl()
            android.database.sqlite.SQLiteDatabase r0 = com.ss.android.socialbase.downloader.cw.up.xt
            if (r0 != 0) goto L8
            return
        L8:
            com.ss.android.socialbase.downloader.cw.up$3 r0 = new com.ss.android.socialbase.downloader.cw.up$3
            r0.<init>(r1, r2, r3)
            com.ss.android.socialbase.downloader.downloader.cw.cw(r0)
            return
    }

    static /* synthetic */ com.ss.android.socialbase.downloader.cw.ae xt(com.ss.android.socialbase.downloader.cw.up r0) {
            com.ss.android.socialbase.downloader.cw.ae r0 = r0.r
            return r0
    }

    private void xt(com.ss.android.socialbase.downloader.ae.cw r4, android.database.sqlite.SQLiteStatement r5) {
            r3 = this;
            if (r4 == 0) goto L23
            if (r5 != 0) goto L5
            goto L23
        L5:
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L1f
            r4.j(r5)     // Catch: java.lang.Throwable -> L1c
            int r0 = r4.m()     // Catch: java.lang.Throwable -> L1c
            int r0 = r0 + 1
            int r4 = r4.ae()     // Catch: java.lang.Throwable -> L1c
            long r1 = (long) r4     // Catch: java.lang.Throwable -> L1c
            r5.bindLong(r0, r1)     // Catch: java.lang.Throwable -> L1c
            r5.execute()     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L1c
            return
        L1c:
            r4 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1f
        L1f:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)
        L23:
            return
    }

    @Override // com.ss.android.socialbase.downloader.cw.cw
    public com.ss.android.socialbase.downloader.ae.cw ae(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.ss.android.socialbase.downloader.cw.cw
    public com.ss.android.socialbase.downloader.ae.cw cw(int r4, long r5) {
            r3 = this;
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            r1 = -3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "status"
            r0.put(r2, r1)
            java.lang.String r1 = "curBytes"
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r0.put(r1, r5)
            r5 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "isFirstDownload"
            r0.put(r6, r5)
            java.lang.String r6 = "isFirstSuccess"
            r0.put(r6, r5)
            r3.update(r4, r0)
            r4 = 0
            return r4
    }

    @Override // com.ss.android.socialbase.downloader.cw.cw
    public java.util.List<com.ss.android.socialbase.downloader.ae.xt> cw(int r9) {
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8.tl()
            android.database.sqlite.SQLiteDatabase r1 = com.ss.android.socialbase.downloader.cw.up.xt
            if (r1 == 0) goto L5b
            r1 = 1
            r2 = 0
            r3 = 0
            android.database.sqlite.SQLiteDatabase r4 = com.ss.android.socialbase.downloader.cw.up.xt     // Catch: java.lang.Throwable -> L3d
            java.lang.String r5 = "SELECT * FROM %s WHERE %s = ?"
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L3d
            java.lang.String r7 = "downloadChunk"
            r6[r2] = r7     // Catch: java.lang.Throwable -> L3d
            java.lang.String r7 = "_id"
            r6[r1] = r7     // Catch: java.lang.Throwable -> L3d
            java.lang.String r5 = java.lang.String.format(r5, r6)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r9 = java.lang.Integer.toString(r9)     // Catch: java.lang.Throwable -> L3d
            java.lang.String[] r9 = new java.lang.String[]{r9}     // Catch: java.lang.Throwable -> L3d
            android.database.Cursor r3 = r4.rawQuery(r5, r9)     // Catch: java.lang.Throwable -> L3d
        L2e:
            boolean r9 = r3.moveToNext()     // Catch: java.lang.Throwable -> L3d
            if (r9 == 0) goto L3f
            com.ss.android.socialbase.downloader.ae.xt r9 = new com.ss.android.socialbase.downloader.ae.xt     // Catch: java.lang.Throwable -> L3d
            r9.<init>(r3)     // Catch: java.lang.Throwable -> L3d
            r0.add(r9)     // Catch: java.lang.Throwable -> L3d
            goto L2e
        L3d:
            r9 = move-exception
            goto L47
        L3f:
            android.database.Cursor[] r9 = new android.database.Cursor[r1]
            r9[r2] = r3
            com.ss.android.socialbase.downloader.az.m.j(r9)
            return r0
        L47:
            com.bytedance.sdk.component.utils.vl.j(r9)     // Catch: java.lang.Throwable -> L52
            android.database.Cursor[] r9 = new android.database.Cursor[r1]
            r9[r2] = r3
            com.ss.android.socialbase.downloader.az.m.j(r9)
            return r0
        L52:
            r9 = move-exception
            android.database.Cursor[] r0 = new android.database.Cursor[r1]
            r0[r2] = r3
            com.ss.android.socialbase.downloader.az.m.j(r0)
            throw r9
        L5b:
            return r0
    }

    @Override // com.ss.android.socialbase.downloader.cw.cw
    public java.util.List<com.ss.android.socialbase.downloader.ae.cw> cw(java.lang.String r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.ss.android.socialbase.downloader.cw.cw
    public void cw() {
            r1 = this;
            r1.tl()
            android.database.sqlite.SQLiteDatabase r0 = com.ss.android.socialbase.downloader.cw.up.xt
            if (r0 != 0) goto L8
            return
        L8:
            com.ss.android.socialbase.downloader.cw.up$2 r0 = new com.ss.android.socialbase.downloader.cw.up$2
            r0.<init>(r1)
            com.ss.android.socialbase.downloader.downloader.cw.cw(r0)
            return
    }

    @Override // com.ss.android.socialbase.downloader.cw.cw
    public com.ss.android.socialbase.downloader.ae.cw g(int r4) {
            r3 = this;
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "status"
            r0.put(r2, r1)
            r3.update(r4, r0)
            r4 = 0
            return r4
    }

    @Override // com.ss.android.socialbase.downloader.cw.cw
    public com.ss.android.socialbase.downloader.ae.cw j(int r5, int r6) {
            r4 = this;
            r4.tl()
            android.database.sqlite.SQLiteDatabase r0 = com.ss.android.socialbase.downloader.cw.up.xt
            r1 = 0
            if (r0 != 0) goto L9
            return r1
        L9:
            r0 = 10
        Lb:
            android.database.sqlite.SQLiteDatabase r2 = com.ss.android.socialbase.downloader.cw.up.xt     // Catch: java.lang.Throwable -> L22
            boolean r2 = r2.isDbLockedByCurrentThread()     // Catch: java.lang.Throwable -> L22
            if (r2 == 0) goto L24
            int r0 = r0 + (-1)
            if (r0 < 0) goto L24
            r2 = 5
            java.lang.Thread.sleep(r2)     // Catch: java.lang.Throwable -> L1d
            goto Lb
        L1d:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)     // Catch: java.lang.Throwable -> L22
            goto Lb
        L22:
            r5 = move-exception
            goto L44
        L24:
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L22
            r0.<init>()     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = "chunkCount"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L22
            r0.put(r2, r6)     // Catch: java.lang.Throwable -> L22
            android.database.sqlite.SQLiteDatabase r6 = com.ss.android.socialbase.downloader.cw.up.xt     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = "downloader"
            java.lang.String r3 = "_id = ? "
            java.lang.String r5 = java.lang.Integer.toString(r5)     // Catch: java.lang.Throwable -> L22
            java.lang.String[] r5 = new java.lang.String[]{r5}     // Catch: java.lang.Throwable -> L22
            r6.update(r2, r0, r3, r5)     // Catch: java.lang.Throwable -> L22
            goto L47
        L44:
            com.bytedance.sdk.component.utils.vl.j(r5)
        L47:
            return r1
    }

    @Override // com.ss.android.socialbase.downloader.cw.cw
    public com.ss.android.socialbase.downloader.ae.cw j(int r4, long r5) {
            r3 = this;
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            r1 = 4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "status"
            r0.put(r2, r1)
            java.lang.String r1 = "curBytes"
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r0.put(r1, r5)
            r3.update(r4, r0)
            r4 = 0
            return r4
    }

    @Override // com.ss.android.socialbase.downloader.cw.cw
    public com.ss.android.socialbase.downloader.ae.cw j(int r4, long r5, java.lang.String r7, java.lang.String r8) {
            r3 = this;
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "status"
            r0.put(r2, r1)
            java.lang.String r1 = "totalBytes"
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r0.put(r1, r5)
            java.lang.String r5 = "eTag"
            r0.put(r5, r7)
            boolean r5 = android.text.TextUtils.isEmpty(r8)
            if (r5 != 0) goto L28
            java.lang.String r5 = "name"
            r0.put(r5, r8)
        L28:
            r3.update(r4, r0)
            r4 = 0
            return r4
    }

    @Override // com.ss.android.socialbase.downloader.cw.cw
    public java.util.List<com.ss.android.socialbase.downloader.ae.cw> j(java.lang.String r9) {
            r8 = this;
            r8.tl()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = com.ss.android.socialbase.downloader.cw.up.xt
            if (r1 == 0) goto L57
            r1 = 1
            r2 = 0
            r3 = 0
            android.database.sqlite.SQLiteDatabase r4 = com.ss.android.socialbase.downloader.cw.up.xt     // Catch: java.lang.Throwable -> L39
            java.lang.String r5 = "SELECT * FROM %s WHERE %s = ?"
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L39
            java.lang.String r7 = "downloader"
            r6[r2] = r7     // Catch: java.lang.Throwable -> L39
            java.lang.String r7 = "url"
            r6[r1] = r7     // Catch: java.lang.Throwable -> L39
            java.lang.String r5 = java.lang.String.format(r5, r6)     // Catch: java.lang.Throwable -> L39
            java.lang.String[] r9 = new java.lang.String[]{r9}     // Catch: java.lang.Throwable -> L39
            android.database.Cursor r3 = r4.rawQuery(r5, r9)     // Catch: java.lang.Throwable -> L39
            boolean r9 = r3.moveToNext()     // Catch: java.lang.Throwable -> L39
            if (r9 == 0) goto L3b
            com.ss.android.socialbase.downloader.ae.cw r9 = new com.ss.android.socialbase.downloader.ae.cw     // Catch: java.lang.Throwable -> L39
            r9.<init>(r3)     // Catch: java.lang.Throwable -> L39
            r0.add(r9)     // Catch: java.lang.Throwable -> L39
            goto L3b
        L39:
            r9 = move-exception
            goto L43
        L3b:
            android.database.Cursor[] r9 = new android.database.Cursor[r1]
            r9[r2] = r3
            com.ss.android.socialbase.downloader.az.m.j(r9)
            return r0
        L43:
            com.bytedance.sdk.component.utils.vl.j(r9)     // Catch: java.lang.Throwable -> L4e
            android.database.Cursor[] r9 = new android.database.Cursor[r1]
            r9[r2] = r3
            com.ss.android.socialbase.downloader.az.m.j(r9)
            return r0
        L4e:
            r9 = move-exception
            android.database.Cursor[] r0 = new android.database.Cursor[r1]
            r0[r2] = r3
            com.ss.android.socialbase.downloader.az.m.j(r0)
            throw r9
        L57:
            return r0
    }

    @Override // com.ss.android.socialbase.downloader.cw.cw
    public void j() {
            r3 = this;
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r2 = 0
            r3.j(r0, r1, r2)
            return
    }

    @Override // com.ss.android.socialbase.downloader.cw.cw
    public void j(int r8, int r9, int r10, int r11) {
            r7 = this;
            r7.tl()
            if (r8 == 0) goto L21
            if (r10 < 0) goto L21
            if (r11 == r9) goto L21
            if (r11 < 0) goto L21
            android.database.sqlite.SQLiteDatabase r0 = com.ss.android.socialbase.downloader.cw.up.xt
            if (r0 == 0) goto L21
            com.ss.android.socialbase.downloader.cw.ae r0 = r7.r
            if (r0 != 0) goto L14
            goto L21
        L14:
            com.ss.android.socialbase.downloader.cw.up$8 r1 = new com.ss.android.socialbase.downloader.cw.up$8
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            com.ss.android.socialbase.downloader.downloader.cw.cw(r1)
        L21:
            return
    }

    @Override // com.ss.android.socialbase.downloader.cw.cw
    public void j(int r9, int r10, int r11, long r12) {
            r8 = this;
            r8.tl()
            if (r9 == 0) goto L25
            if (r10 < 0) goto L25
            if (r11 < 0) goto L25
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 < 0) goto L25
            android.database.sqlite.SQLiteDatabase r0 = com.ss.android.socialbase.downloader.cw.up.xt
            if (r0 == 0) goto L25
            com.ss.android.socialbase.downloader.cw.ae r0 = r8.r
            if (r0 != 0) goto L18
            goto L25
        L18:
            com.ss.android.socialbase.downloader.cw.up$7 r1 = new com.ss.android.socialbase.downloader.cw.up$7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            com.ss.android.socialbase.downloader.downloader.cw.cw(r1)
        L25:
            return
    }

    @Override // com.ss.android.socialbase.downloader.cw.cw
    public void j(int r8, int r9, long r10) {
            r7 = this;
            r7.tl()
            if (r8 == 0) goto L22
            if (r9 < 0) goto L22
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L22
            android.database.sqlite.SQLiteDatabase r0 = com.ss.android.socialbase.downloader.cw.up.xt
            if (r0 == 0) goto L22
            com.ss.android.socialbase.downloader.cw.ae r0 = r7.r
            if (r0 != 0) goto L16
            goto L22
        L16:
            com.ss.android.socialbase.downloader.cw.up$6 r1 = new com.ss.android.socialbase.downloader.cw.up$6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r1.<init>(r2, r3, r4, r5)
            com.ss.android.socialbase.downloader.downloader.cw.cw(r1)
        L22:
            return
    }

    @Override // com.ss.android.socialbase.downloader.cw.cw
    public void j(int r1, java.util.List<com.ss.android.socialbase.downloader.ae.xt> r2) {
            r0 = this;
            return
    }

    public void j(android.util.SparseArray<com.ss.android.socialbase.downloader.ae.cw> r2, android.util.SparseArray<java.util.List<com.ss.android.socialbase.downloader.ae.xt>> r3) {
            r1 = this;
            java.util.HashMap r2 = com.ss.android.socialbase.downloader.az.m.j(r2)     // Catch: java.lang.Throwable -> Lf
            java.util.HashMap r3 = com.ss.android.socialbase.downloader.az.m.j(r3)     // Catch: java.lang.Throwable -> Lf
            com.ss.android.socialbase.downloader.cw.xt r0 = r1.j     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto Lf
            r0.j(r2, r3)     // Catch: java.lang.Throwable -> Lf
        Lf:
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.tj
    public void j(android.util.SparseArray<com.ss.android.socialbase.downloader.ae.cw> r2, android.util.SparseArray<java.util.List<com.ss.android.socialbase.downloader.ae.xt>> r3, com.ss.android.socialbase.downloader.cw.r r4) {
            r1 = this;
            com.ss.android.socialbase.downloader.cw.up$1 r0 = new com.ss.android.socialbase.downloader.cw.up$1     // Catch: java.lang.Throwable -> Lf
            r0.<init>(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> Lf
            java.util.concurrent.ExecutorService r2 = com.ss.android.socialbase.downloader.downloader.cw.i()     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L11
            r2.execute(r0)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r2 = move-exception
            goto L12
        L11:
            return
        L12:
            com.bytedance.sdk.component.utils.vl.j(r2)
            return
    }

    @Override // com.ss.android.socialbase.downloader.cw.cw
    public void j(com.ss.android.socialbase.downloader.ae.xt r2) {
            r1 = this;
            r1.tl()
            android.database.sqlite.SQLiteDatabase r0 = com.ss.android.socialbase.downloader.cw.up.xt
            if (r0 == 0) goto L14
            com.ss.android.socialbase.downloader.cw.ae r0 = r1.r
            if (r0 != 0) goto Lc
            goto L14
        Lc:
            com.ss.android.socialbase.downloader.cw.up$5 r0 = new com.ss.android.socialbase.downloader.cw.up$5
            r0.<init>(r1, r2)
            com.ss.android.socialbase.downloader.downloader.cw.cw(r0)
        L14:
            return
    }

    @Override // com.ss.android.socialbase.downloader.cw.cw
    public void j(com.ss.android.socialbase.downloader.cw.xt r1) {
            r0 = this;
            r0.j = r1
            return
    }

    @Override // com.ss.android.socialbase.downloader.cw.cw
    public boolean j(int r2) {
            r1 = this;
            r0 = 0
            com.ss.android.socialbase.downloader.ae.cw r2 = r1.xt(r2)     // Catch: java.lang.Throwable -> La
            if (r2 == 0) goto L9
            r2 = 1
            return r2
        L9:
            return r0
        La:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            return r0
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public boolean j(int r8, java.util.Map<java.lang.Long, com.ss.android.socialbase.downloader.qv.g> r9) {
            r7 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r7.tl()
            android.database.sqlite.SQLiteDatabase r2 = com.ss.android.socialbase.downloader.cw.up.xt
            r3 = 0
            if (r2 != 0) goto Ld
            return r3
        Ld:
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            java.util.Set r4 = r9.keySet()     // Catch: java.lang.Throwable -> L37
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L37
        L1a:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L37
            if (r5 == 0) goto L3b
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L37
            java.lang.Long r5 = (java.lang.Long) r5     // Catch: java.lang.Throwable -> L37
            r5.longValue()     // Catch: java.lang.Throwable -> L37
            java.lang.Object r5 = r9.get(r5)     // Catch: java.lang.Throwable -> L37
            com.ss.android.socialbase.downloader.qv.g r5 = (com.ss.android.socialbase.downloader.qv.g) r5     // Catch: java.lang.Throwable -> L37
            org.json.JSONObject r5 = r5.qv()     // Catch: java.lang.Throwable -> L37
            r2.put(r5)     // Catch: java.lang.Throwable -> L37
            goto L1a
        L37:
            r9 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r9)
        L3b:
            com.ss.android.socialbase.downloader.cw.ae r9 = r7.up
            android.database.sqlite.SQLiteStatement r9 = r9.r()
            monitor-enter(r9)
            r9.clearBindings()     // Catch: java.lang.Throwable -> L6e
            r4 = 1
            long r5 = (long) r8     // Catch: java.lang.Throwable -> L6e
            r9.bindLong(r4, r5)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r8 = r2.toString()     // Catch: java.lang.Throwable -> L6e
            r2 = 2
            r9.bindString(r2, r8)     // Catch: java.lang.Throwable -> L6e
            r9.execute()     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r8 = "SqlDownloadCache"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r2 = "updateSegments cost="
            r9.<init>(r2)
            long r0 = com.ss.android.socialbase.downloader.az.m.cw(r0)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            com.ss.android.socialbase.downloader.m.j.xt(r8, r9)
            return r3
        L6e:
            r8 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L6e
            throw r8
    }

    @Override // com.ss.android.socialbase.downloader.cw.cw
    public boolean j(com.ss.android.socialbase.downloader.ae.cw r2) {
            r1 = this;
            r1.tl()
            if (r2 == 0) goto L14
            android.database.sqlite.SQLiteDatabase r0 = com.ss.android.socialbase.downloader.cw.up.xt
            if (r0 != 0) goto La
            goto L14
        La:
            com.ss.android.socialbase.downloader.cw.up$10 r0 = new com.ss.android.socialbase.downloader.cw.up$10
            r0.<init>(r1, r2)
            com.ss.android.socialbase.downloader.downloader.cw.cw(r0)
            r2 = 1
            return r2
        L14:
            r2 = 0
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public void jy(int r2) {
            r1 = this;
            r1.tl()
            android.database.sqlite.SQLiteDatabase r0 = com.ss.android.socialbase.downloader.cw.up.xt
            if (r0 != 0) goto L8
            return
        L8:
            com.ss.android.socialbase.downloader.cw.ae r0 = r1.up     // Catch: java.lang.Throwable -> L12
            android.database.sqlite.SQLiteStatement r0 = r0.xt()     // Catch: java.lang.Throwable -> L12
            r1.j(r2, r0)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            return
    }

    @Override // com.ss.android.socialbase.downloader.cw.cw
    public boolean m(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.cw.up$11 r0 = new com.ss.android.socialbase.downloader.cw.up$11
            r0.<init>(r1, r2)
            com.ss.android.socialbase.downloader.downloader.cw.cw(r0)
            r2 = 1
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.cw.cw
    public com.ss.android.socialbase.downloader.ae.cw oq(int r4) {
            r3 = this;
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            r1 = -7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "status"
            r0.put(r2, r1)
            r3.update(r4, r0)
            r4 = 0
            return r4
    }

    public java.util.ArrayList<com.ss.android.socialbase.downloader.qv.g> qv(int r2) {
            r1 = this;
            java.util.Map r2 = r1.vl(r2)
            if (r2 == 0) goto L17
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Ld
            goto L17
        Ld:
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Collection r2 = r2.values()
            r0.<init>(r2)
            return r0
        L17:
            r2 = 0
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.cw.cw
    public com.ss.android.socialbase.downloader.ae.cw r(int r4, long r5) {
            r3 = this;
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            r1 = -2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "status"
            r0.put(r2, r1)
            java.lang.String r1 = "curBytes"
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r0.put(r1, r5)
            r3.update(r4, r0)
            r4 = 0
            return r4
    }

    @Override // com.ss.android.socialbase.downloader.cw.cw
    public java.util.List<com.ss.android.socialbase.downloader.ae.cw> r(java.lang.String r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.ss.android.socialbase.downloader.cw.cw
    public void r(int r2) {
            r1 = this;
            r1.tl()
            android.database.sqlite.SQLiteDatabase r0 = com.ss.android.socialbase.downloader.cw.up.xt
            if (r0 == 0) goto L14
            com.ss.android.socialbase.downloader.cw.ae r0 = r1.r
            if (r0 != 0) goto Lc
            goto L14
        Lc:
            com.ss.android.socialbase.downloader.cw.up$4 r0 = new com.ss.android.socialbase.downloader.cw.up$4
            r0.<init>(r1, r2)
            com.ss.android.socialbase.downloader.downloader.cw.cw(r0)
        L14:
            return
    }

    @Override // com.ss.android.socialbase.downloader.cw.cw
    public boolean r() {
            r1 = this;
            boolean r0 = r1.m
            return r0
    }

    @Override // com.ss.android.socialbase.downloader.cw.cw
    public com.ss.android.socialbase.downloader.ae.cw tl(int r4) {
            r3 = this;
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            r1 = 5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "status"
            r0.put(r2, r1)
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "isFirstDownload"
            r0.put(r2, r1)
            r3.update(r4, r0)
            r4 = 0
            return r4
    }

    @Override // com.ss.android.socialbase.downloader.cw.cw
    public com.ss.android.socialbase.downloader.ae.cw up(int r4, long r5) {
            r3 = this;
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            r1 = -4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "status"
            r0.put(r2, r1)
            java.lang.String r1 = "curBytes"
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r0.put(r1, r5)
            r3.update(r4, r0)
            r4 = 0
            return r4
    }

    @Override // com.ss.android.socialbase.downloader.cw.cw
    public boolean up() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.ss.android.socialbase.downloader.cw.cw
    public boolean up(int r3) {
            r2 = this;
            r2.tl()
            android.database.sqlite.SQLiteDatabase r0 = com.ss.android.socialbase.downloader.cw.up.xt
            r1 = 0
            if (r0 == 0) goto L1a
            com.ss.android.socialbase.downloader.cw.ae r0 = r2.cw
            if (r0 != 0) goto Ld
            goto L1a
        Ld:
            android.database.sqlite.SQLiteStatement r0 = r0.xt()     // Catch: java.lang.Throwable -> L16
            r2.j(r3, r0)     // Catch: java.lang.Throwable -> L16
            r3 = 1
            return r3
        L16:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
        L1a:
            return r1
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public java.util.Map<java.lang.Long, com.ss.android.socialbase.downloader.qv.g> vl(int r11) {
            r10 = this;
            r10.tl()
            android.database.sqlite.SQLiteDatabase r0 = com.ss.android.socialbase.downloader.cw.up.xt
            r1 = 0
            if (r0 == 0) goto L92
            r0 = 1
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = com.ss.android.socialbase.downloader.cw.up.xt     // Catch: java.lang.Throwable -> L77
            java.lang.String r4 = "SELECT * FROM %s WHERE %s = ?"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L7c
            java.lang.String r6 = "segments"
            r5[r2] = r6     // Catch: java.lang.Throwable -> L7c
            java.lang.String r6 = "_id"
            r5[r0] = r6     // Catch: java.lang.Throwable -> L7c
            java.lang.String r4 = java.lang.String.format(r4, r5)     // Catch: java.lang.Throwable -> L77
            java.lang.String r11 = java.lang.Integer.toString(r11)     // Catch: java.lang.Throwable -> L77
            java.lang.String[] r11 = new java.lang.String[]{r11}     // Catch: java.lang.Throwable -> L77
            android.database.Cursor r11 = r3.rawQuery(r4, r11)     // Catch: java.lang.Throwable -> L77
            boolean r3 = r11.moveToNext()     // Catch: java.lang.Throwable -> L3c
            if (r3 == 0) goto L6f
            java.lang.String r3 = "info"
            int r3 = r11.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L3c
            if (r3 < 0) goto L3e
            java.lang.String r3 = r11.getString(r3)     // Catch: java.lang.Throwable -> L3c
            goto L3f
        L3c:
            r3 = move-exception
            goto L7e
        L3e:
            r3 = r1
        L3f:
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> L3c
            r4.<init>()     // Catch: java.lang.Throwable -> L3c
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L3c
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L3c
            r3 = 0
        L4a:
            int r6 = r5.length()     // Catch: java.lang.Throwable -> L3c
            if (r3 >= r6) goto L67
            org.json.JSONObject r6 = r5.getJSONObject(r3)     // Catch: java.lang.Throwable -> L3c
            com.ss.android.socialbase.downloader.qv.g r7 = new com.ss.android.socialbase.downloader.qv.g     // Catch: java.lang.Throwable -> L3c
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L3c
            long r8 = r7.cw()     // Catch: java.lang.Throwable -> L3c
            java.lang.Long r6 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> L3c
            r4.put(r6, r7)     // Catch: java.lang.Throwable -> L3c
            int r3 = r3 + 1
            goto L4a
        L67:
            android.database.Cursor[] r0 = new android.database.Cursor[r0]
            r0[r2] = r11
            com.ss.android.socialbase.downloader.az.m.j(r0)
            return r4
        L6f:
            android.database.Cursor[] r0 = new android.database.Cursor[r0]
            r0[r2] = r11
            com.ss.android.socialbase.downloader.az.m.j(r0)
            goto L92
        L77:
            r3 = move-exception
        L78:
            r11 = r1
            goto L7e
        L7a:
            r3 = r11
            goto L78
        L7c:
            r11 = move-exception
            goto L7a
        L7e:
            com.bytedance.sdk.component.utils.vl.j(r3)     // Catch: java.lang.Throwable -> L89
            android.database.Cursor[] r0 = new android.database.Cursor[r0]
            r0[r2] = r11
            com.ss.android.socialbase.downloader.az.m.j(r0)
            goto L92
        L89:
            r1 = move-exception
            android.database.Cursor[] r0 = new android.database.Cursor[r0]
            r0[r2] = r11
            com.ss.android.socialbase.downloader.az.m.j(r0)
            throw r1
        L92:
            return r1
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public /* synthetic */ java.util.List ws(int r1) {
            r0 = this;
            java.util.ArrayList r1 = r0.qv(r1)
            return r1
    }

    @Override // com.ss.android.socialbase.downloader.cw.cw
    public com.ss.android.socialbase.downloader.ae.cw xt(int r8) {
            r7 = this;
            r7.tl()
            android.database.sqlite.SQLiteDatabase r0 = com.ss.android.socialbase.downloader.cw.up.xt
            r1 = 0
            if (r0 == 0) goto L61
            r0 = 1
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = com.ss.android.socialbase.downloader.cw.up.xt     // Catch: java.lang.Throwable -> L46
            java.lang.String r4 = "SELECT * FROM %s WHERE %s = ?"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L4b
            java.lang.String r6 = "downloader"
            r5[r2] = r6     // Catch: java.lang.Throwable -> L4b
            java.lang.String r6 = "_id"
            r5[r0] = r6     // Catch: java.lang.Throwable -> L4b
            java.lang.String r4 = java.lang.String.format(r4, r5)     // Catch: java.lang.Throwable -> L46
            java.lang.String r8 = java.lang.Integer.toString(r8)     // Catch: java.lang.Throwable -> L46
            java.lang.String[] r8 = new java.lang.String[]{r8}     // Catch: java.lang.Throwable -> L46
            android.database.Cursor r8 = r3.rawQuery(r4, r8)     // Catch: java.lang.Throwable -> L46
            boolean r3 = r8.moveToNext()     // Catch: java.lang.Throwable -> L3c
            if (r3 == 0) goto L3e
            com.ss.android.socialbase.downloader.ae.cw r3 = new com.ss.android.socialbase.downloader.ae.cw     // Catch: java.lang.Throwable -> L3c
            r3.<init>(r8)     // Catch: java.lang.Throwable -> L3c
            android.database.Cursor[] r0 = new android.database.Cursor[r0]
            r0[r2] = r8
            com.ss.android.socialbase.downloader.az.m.j(r0)
            return r3
        L3c:
            r3 = move-exception
            goto L4d
        L3e:
            android.database.Cursor[] r0 = new android.database.Cursor[r0]
            r0[r2] = r8
            com.ss.android.socialbase.downloader.az.m.j(r0)
            goto L61
        L46:
            r3 = move-exception
        L47:
            r8 = r1
            goto L4d
        L49:
            r3 = r8
            goto L47
        L4b:
            r8 = move-exception
            goto L49
        L4d:
            com.bytedance.sdk.component.utils.vl.j(r3)     // Catch: java.lang.Throwable -> L58
            android.database.Cursor[] r0 = new android.database.Cursor[r0]
            r0[r2] = r8
            com.ss.android.socialbase.downloader.az.m.j(r0)
            goto L61
        L58:
            r1 = move-exception
            android.database.Cursor[] r0 = new android.database.Cursor[r0]
            r0[r2] = r8
            com.ss.android.socialbase.downloader.az.m.j(r0)
            throw r1
        L61:
            return r1
    }

    @Override // com.ss.android.socialbase.downloader.cw.cw
    public com.ss.android.socialbase.downloader.ae.cw xt(int r5, long r6) {
            r4 = this;
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            r1 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "status"
            r0.put(r2, r1)
            java.lang.String r1 = "curBytes"
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            r0.put(r1, r2)
            r1 = 0
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 <= 0) goto L28
            r6 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r7 = "isFirstDownload"
            r0.put(r7, r6)
        L28:
            r4.update(r5, r0)
            r5 = 0
            return r5
    }

    @Override // com.ss.android.socialbase.downloader.cw.cw
    public java.util.List<com.ss.android.socialbase.downloader.ae.cw> xt() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.ss.android.socialbase.downloader.cw.cw
    public java.util.List<com.ss.android.socialbase.downloader.ae.cw> xt(java.lang.String r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.ss.android.socialbase.downloader.cw.cw
    public void xt(int r2, java.util.List<com.ss.android.socialbase.downloader.ae.xt> r3) {
            r1 = this;
            r1.r(r2)     // Catch: java.lang.Throwable -> L38
            if (r3 == 0) goto L3a
            java.util.Iterator r2 = r3.iterator()     // Catch: java.lang.Throwable -> L38
        L9:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L38
            if (r3 == 0) goto L3a
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L38
            com.ss.android.socialbase.downloader.ae.xt r3 = (com.ss.android.socialbase.downloader.ae.xt) r3     // Catch: java.lang.Throwable -> L38
            if (r3 == 0) goto L9
            r1.j(r3)     // Catch: java.lang.Throwable -> L38
            boolean r0 = r3.m()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L9
            java.util.List r3 = r3.ae()     // Catch: java.lang.Throwable -> L38
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L38
        L28:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L9
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L38
            com.ss.android.socialbase.downloader.ae.xt r0 = (com.ss.android.socialbase.downloader.ae.xt) r0     // Catch: java.lang.Throwable -> L38
            r1.j(r0)     // Catch: java.lang.Throwable -> L38
            goto L28
        L38:
            r2 = move-exception
            goto L3b
        L3a:
            return
        L3b:
            com.bytedance.sdk.component.utils.vl.j(r2)
            return
    }

    @Override // com.ss.android.socialbase.downloader.cw.cw
    public void xt(com.ss.android.socialbase.downloader.ae.cw r1) {
            r0 = this;
            return
    }

    @Override // com.ss.android.socialbase.downloader.cw.cw
    public void xt(com.ss.android.socialbase.downloader.ae.xt r1) {
            r0 = this;
            r0.j(r1)
            return
    }
}
