package com.kwad.framework.filedownloader.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d implements com.kwad.framework.filedownloader.b.a {
    private static boolean amQ;
    private final com.kwad.framework.filedownloader.b.e amR;
    private android.database.sqlite.SQLiteDatabase amS;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements com.kwad.framework.filedownloader.b.a.InterfaceC0111a {
        private final android.util.SparseArray<com.kwad.framework.filedownloader.d.c> amG;
        private final android.util.SparseArray<java.util.List<com.kwad.framework.filedownloader.d.a>> amH;
        private final android.util.SparseArray<com.kwad.framework.filedownloader.d.c> amT;
        private com.kwad.framework.filedownloader.b.d.b amU;
        final /* synthetic */ com.kwad.framework.filedownloader.b.d amV;

        a(com.kwad.framework.filedownloader.b.d r1, android.util.SparseArray<com.kwad.framework.filedownloader.d.c> r2, android.util.SparseArray<java.util.List<com.kwad.framework.filedownloader.d.a>> r3) {
                r0 = this;
                r0.amV = r1
                r0.<init>()
                android.util.SparseArray r1 = new android.util.SparseArray
                r1.<init>()
                r0.amT = r1
                r0.amG = r2
                r0.amH = r3
                return
        }

        @Override // com.kwad.framework.filedownloader.b.a.InterfaceC0111a
        public final void a(int r2, com.kwad.framework.filedownloader.d.c r3) {
                r1 = this;
                android.util.SparseArray<com.kwad.framework.filedownloader.d.c> r0 = r1.amT
                r0.put(r2, r3)
                return
        }

        @Override // com.kwad.framework.filedownloader.b.a.InterfaceC0111a
        public final void c(com.kwad.framework.filedownloader.d.c r4) {
                r3 = this;
                android.util.SparseArray<com.kwad.framework.filedownloader.d.c> r0 = r3.amG
                if (r0 == 0) goto L13
                monitor-enter(r0)
                android.util.SparseArray<com.kwad.framework.filedownloader.d.c> r1 = r3.amG     // Catch: java.lang.Throwable -> L10
                int r2 = r4.getId()     // Catch: java.lang.Throwable -> L10
                r1.put(r2, r4)     // Catch: java.lang.Throwable -> L10
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
                return
            L10:
                r4 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
                throw r4
            L13:
                return
        }

        @Override // java.lang.Iterable
        public final java.util.Iterator<com.kwad.framework.filedownloader.d.c> iterator() {
                r2 = this;
                com.kwad.framework.filedownloader.b.d$b r0 = new com.kwad.framework.filedownloader.b.d$b
                com.kwad.framework.filedownloader.b.d r1 = r2.amV
                r0.<init>(r1)
                r2.amU = r0
                return r0
        }

        @Override // com.kwad.framework.filedownloader.b.a.InterfaceC0111a
        public final void xU() {
                r10 = this;
                com.kwad.framework.filedownloader.b.d$b r0 = r10.amU
                if (r0 == 0) goto L7
                r0.xU()
            L7:
                com.kwad.framework.filedownloader.b.d r0 = r10.amV     // Catch: java.lang.Throwable -> Lf8
                android.database.sqlite.SQLiteDatabase r0 = com.kwad.framework.filedownloader.b.d.a(r0)     // Catch: java.lang.Throwable -> Lf8
                if (r0 != 0) goto L11
                goto Lf8
            L11:
                android.util.SparseArray<com.kwad.framework.filedownloader.d.c> r1 = r10.amT
                int r1 = r1.size()
                if (r1 >= 0) goto L1b
                goto Lf8
            L1b:
                r0.beginTransaction()     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e android.database.sqlite.SQLiteException -> L90
                r2 = 0
                r3 = 0
            L20:
                if (r3 >= r1) goto L95
                android.util.SparseArray<com.kwad.framework.filedownloader.d.c> r4 = r10.amT     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e android.database.sqlite.SQLiteException -> L90
                int r4 = r4.keyAt(r3)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e android.database.sqlite.SQLiteException -> L90
                android.util.SparseArray<com.kwad.framework.filedownloader.d.c> r5 = r10.amT     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e android.database.sqlite.SQLiteException -> L90
                java.lang.Object r5 = r5.get(r4)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e android.database.sqlite.SQLiteException -> L90
                com.kwad.framework.filedownloader.d.c r5 = (com.kwad.framework.filedownloader.d.c) r5     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e android.database.sqlite.SQLiteException -> L90
                java.lang.String r6 = "ksad_file_download"
                java.lang.String r7 = "_id = ?"
                java.lang.String r8 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e android.database.sqlite.SQLiteException -> L90
                java.lang.String[] r8 = new java.lang.String[]{r8}     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e android.database.sqlite.SQLiteException -> L90
                r0.delete(r6, r7, r8)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e android.database.sqlite.SQLiteException -> L90
                java.lang.String r6 = "ksad_file_download"
                android.content.ContentValues r7 = r5.yX()     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e android.database.sqlite.SQLiteException -> L90
                r8 = 0
                r0.insert(r6, r8, r7)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e android.database.sqlite.SQLiteException -> L90
                int r6 = r5.zc()     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e android.database.sqlite.SQLiteException -> L90
                r7 = 1
                if (r6 <= r7) goto L92
                com.kwad.framework.filedownloader.b.d r6 = r10.amV     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e android.database.sqlite.SQLiteException -> L90
                java.util.List r6 = r6.bE(r4)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e android.database.sqlite.SQLiteException -> L90
                int r7 = r6.size()     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e android.database.sqlite.SQLiteException -> L90
                if (r7 <= 0) goto L92
                java.lang.String r7 = "ksad_file_download_connection"
                java.lang.String r9 = "id = ?"
                java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e android.database.sqlite.SQLiteException -> L90
                java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e android.database.sqlite.SQLiteException -> L90
                r0.delete(r7, r9, r4)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e android.database.sqlite.SQLiteException -> L90
                java.util.Iterator r4 = r6.iterator()     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e android.database.sqlite.SQLiteException -> L90
            L6f:
                boolean r6 = r4.hasNext()     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e android.database.sqlite.SQLiteException -> L90
                if (r6 == 0) goto L92
                java.lang.Object r6 = r4.next()     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e android.database.sqlite.SQLiteException -> L90
                com.kwad.framework.filedownloader.d.a r6 = (com.kwad.framework.filedownloader.d.a) r6     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e android.database.sqlite.SQLiteException -> L90
                int r7 = r5.getId()     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e android.database.sqlite.SQLiteException -> L90
                r6.setId(r7)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e android.database.sqlite.SQLiteException -> L90
                java.lang.String r7 = "ksad_file_download_connection"
                android.content.ContentValues r6 = r6.yX()     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e android.database.sqlite.SQLiteException -> L90
                r0.insert(r7, r8, r6)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e android.database.sqlite.SQLiteException -> L90
                goto L6f
            L8c:
                r1 = move-exception
                goto Lef
            L8e:
                r1 = move-exception
                goto Le2
            L90:
                r1 = move-exception
                goto Le9
            L92:
                int r3 = r3 + 1
                goto L20
            L95:
                android.util.SparseArray<com.kwad.framework.filedownloader.d.c> r1 = r10.amG     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e android.database.sqlite.SQLiteException -> L90
                if (r1 == 0) goto Ld6
                android.util.SparseArray<java.util.List<com.kwad.framework.filedownloader.d.a>> r3 = r10.amH     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e android.database.sqlite.SQLiteException -> L90
                if (r3 == 0) goto Ld6
                monitor-enter(r1)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e android.database.sqlite.SQLiteException -> L90
                android.util.SparseArray<com.kwad.framework.filedownloader.d.c> r3 = r10.amG     // Catch: java.lang.Throwable -> Lcd
                int r3 = r3.size()     // Catch: java.lang.Throwable -> Lcd
            La4:
                if (r2 >= r3) goto Ld2
                android.util.SparseArray<com.kwad.framework.filedownloader.d.c> r4 = r10.amG     // Catch: java.lang.Throwable -> Lcd
                java.lang.Object r4 = r4.valueAt(r2)     // Catch: java.lang.Throwable -> Lcd
                com.kwad.framework.filedownloader.d.c r4 = (com.kwad.framework.filedownloader.d.c) r4     // Catch: java.lang.Throwable -> Lcd
                int r4 = r4.getId()     // Catch: java.lang.Throwable -> Lcd
                com.kwad.framework.filedownloader.b.d r5 = r10.amV     // Catch: java.lang.Throwable -> Lcd
                java.util.List r5 = r5.bE(r4)     // Catch: java.lang.Throwable -> Lcd
                if (r5 == 0) goto Lcf
                int r6 = r5.size()     // Catch: java.lang.Throwable -> Lcd
                if (r6 <= 0) goto Lcf
                android.util.SparseArray<java.util.List<com.kwad.framework.filedownloader.d.a>> r6 = r10.amH     // Catch: java.lang.Throwable -> Lcd
                monitor-enter(r6)     // Catch: java.lang.Throwable -> Lcd
                android.util.SparseArray<java.util.List<com.kwad.framework.filedownloader.d.a>> r7 = r10.amH     // Catch: java.lang.Throwable -> Lca
                r7.put(r4, r5)     // Catch: java.lang.Throwable -> Lca
                monitor-exit(r6)     // Catch: java.lang.Throwable -> Lca
                goto Lcf
            Lca:
                r2 = move-exception
                monitor-exit(r6)     // Catch: java.lang.Throwable -> Lca
                throw r2     // Catch: java.lang.Throwable -> Lcd
            Lcd:
                r2 = move-exception
                goto Ld4
            Lcf:
                int r2 = r2 + 1
                goto La4
            Ld2:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lcd
                goto Ld6
            Ld4:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lcd
                throw r2     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e android.database.sqlite.SQLiteException -> L90
            Ld6:
                r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e android.database.sqlite.SQLiteException -> L90
                r0.endTransaction()     // Catch: java.lang.Exception -> Ldd
                return
            Ldd:
                r0 = move-exception
                com.kwad.framework.filedownloader.b.d.i(r0)
                return
            Le2:
                com.kwad.framework.filedownloader.b.d.i(r1)     // Catch: java.lang.Throwable -> L8c
            Le5:
                r0.endTransaction()     // Catch: java.lang.Exception -> Ldd
                goto Lf8
            Le9:
                com.kwad.framework.filedownloader.b.d r2 = r10.amV     // Catch: java.lang.Throwable -> L8c
                com.kwad.framework.filedownloader.b.d.a(r2, r1)     // Catch: java.lang.Throwable -> L8c
                goto Le5
            Lef:
                r0.endTransaction()     // Catch: java.lang.Exception -> Lf3
                goto Lf7
            Lf3:
                r0 = move-exception
                com.kwad.framework.filedownloader.b.d.i(r0)
            Lf7:
                throw r1
            Lf8:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements java.util.Iterator<com.kwad.framework.filedownloader.d.c> {
        final /* synthetic */ com.kwad.framework.filedownloader.b.d amV;
        private android.database.Cursor amW;
        private final java.util.List<java.lang.Integer> amX;
        private int amY;

        b(com.kwad.framework.filedownloader.b.d r10) {
                r9 = this;
                r9.amV = r10
                r9.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r9.amX = r0
                android.database.sqlite.SQLiteDatabase r1 = com.kwad.framework.filedownloader.b.d.a(r10)     // Catch: java.lang.Exception -> L1f android.database.sqlite.SQLiteException -> L22
                java.lang.String r2 = "ksad_file_download"
                r7 = 0
                r8 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                android.database.Cursor r0 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L1f android.database.sqlite.SQLiteException -> L22
                r9.amW = r0     // Catch: java.lang.Exception -> L1f android.database.sqlite.SQLiteException -> L22
                return
            L1f:
                r0 = move-exception
                r10 = r0
                goto L24
            L22:
                r0 = move-exception
                goto L28
            L24:
                com.kwad.framework.filedownloader.b.d.i(r10)
                return
            L28:
                com.kwad.framework.filedownloader.b.d.a(r10, r0)
                return
        }

        private com.kwad.framework.filedownloader.d.c xW() {
                r2 = this;
                android.database.Cursor r0 = r2.amW
                com.kwad.framework.filedownloader.d.c r0 = com.kwad.framework.filedownloader.b.d.e(r0)
                int r1 = r0.getId()
                r2.amY = r1
                return r0
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
                r2 = this;
                r0 = 0
                android.database.Cursor r1 = r2.amW     // Catch: java.lang.Throwable -> La
                if (r1 == 0) goto Lc
                boolean r0 = r1.moveToNext()     // Catch: java.lang.Throwable -> La
                return r0
            La:
                r1 = move-exception
                goto Ld
            Lc:
                return r0
            Ld:
                com.kwad.framework.filedownloader.b.d.i(r1)
                return r0
        }

        @Override // java.util.Iterator
        public final /* synthetic */ com.kwad.framework.filedownloader.d.c next() {
                r1 = this;
                com.kwad.framework.filedownloader.d.c r0 = r1.xW()
                return r0
        }

        @Override // java.util.Iterator
        public final void remove() {
                r2 = this;
                java.util.List<java.lang.Integer> r0 = r2.amX
                int r1 = r2.amY
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.add(r1)
                return
        }

        final void xU() {
                r8 = this;
                java.lang.String r0 = "DELETE FROM %s WHERE %s IN (%s);"
                android.database.Cursor r1 = r8.amW
                if (r1 != 0) goto L7
                goto L65
            L7:
                r1.close()
                java.util.List<java.lang.Integer> r1 = r8.amX
                boolean r1 = r1.isEmpty()
                if (r1 != 0) goto L65
                java.lang.String r1 = ", "
                java.util.List<java.lang.Integer> r2 = r8.amX
                java.lang.String r1 = android.text.TextUtils.join(r1, r2)
                boolean r2 = com.kwad.framework.filedownloader.f.d.apD
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L29
                java.lang.Object[] r2 = new java.lang.Object[r4]
                r2[r3] = r1
                java.lang.String r5 = "delete %s"
                com.kwad.framework.filedownloader.f.d.c(r8, r5, r2)
            L29:
                com.kwad.framework.filedownloader.b.d r2 = r8.amV     // Catch: java.lang.Exception -> L58 android.database.sqlite.SQLiteException -> L5a
                android.database.sqlite.SQLiteDatabase r2 = com.kwad.framework.filedownloader.b.d.a(r2)     // Catch: java.lang.Exception -> L58 android.database.sqlite.SQLiteException -> L5a
                r5 = 3
                java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L58 android.database.sqlite.SQLiteException -> L5a
                java.lang.String r7 = "ksad_file_download"
                r6[r3] = r7     // Catch: java.lang.Exception -> L58 android.database.sqlite.SQLiteException -> L5a
                java.lang.String r7 = "_id"
                r6[r4] = r7     // Catch: java.lang.Exception -> L58 android.database.sqlite.SQLiteException -> L5a
                r7 = 2
                r6[r7] = r1     // Catch: java.lang.Exception -> L58 android.database.sqlite.SQLiteException -> L5a
                java.lang.String r6 = com.kwad.framework.filedownloader.f.f.c(r0, r6)     // Catch: java.lang.Exception -> L58 android.database.sqlite.SQLiteException -> L5a
                r2.execSQL(r6)     // Catch: java.lang.Exception -> L58 android.database.sqlite.SQLiteException -> L5a
                java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L58 android.database.sqlite.SQLiteException -> L5a
                java.lang.String r6 = "ksad_file_download_connection"
                r5[r3] = r6     // Catch: java.lang.Exception -> L58 android.database.sqlite.SQLiteException -> L5a
                java.lang.String r3 = "id"
                r5[r4] = r3     // Catch: java.lang.Exception -> L58 android.database.sqlite.SQLiteException -> L5a
                r5[r7] = r1     // Catch: java.lang.Exception -> L58 android.database.sqlite.SQLiteException -> L5a
                java.lang.String r0 = com.kwad.framework.filedownloader.f.f.c(r0, r5)     // Catch: java.lang.Exception -> L58 android.database.sqlite.SQLiteException -> L5a
                r2.execSQL(r0)     // Catch: java.lang.Exception -> L58 android.database.sqlite.SQLiteException -> L5a
                return
            L58:
                r0 = move-exception
                goto L5c
            L5a:
                r0 = move-exception
                goto L60
            L5c:
                com.kwad.framework.filedownloader.b.d.i(r0)
                return
            L60:
                com.kwad.framework.filedownloader.b.d r1 = r8.amV
                com.kwad.framework.filedownloader.b.d.a(r1, r0)
            L65:
                return
        }
    }

    static {
            return
    }

    public d() {
            r2 = this;
            r2.<init>()
            com.kwad.framework.filedownloader.b.e r0 = new com.kwad.framework.filedownloader.b.e
            android.content.Context r1 = com.kwad.framework.filedownloader.f.c.zz()
            r0.<init>(r1)
            r2.amR = r0
            return
    }

    static /* synthetic */ android.database.sqlite.SQLiteDatabase a(com.kwad.framework.filedownloader.b.d r0) {
            android.database.sqlite.SQLiteDatabase r0 = r0.xV()
            return r0
    }

    private void a(int r5, android.content.ContentValues r6) {
            r4 = this;
            android.database.sqlite.SQLiteDatabase r0 = r4.xV()     // Catch: java.lang.Exception -> L14 android.database.sqlite.SQLiteException -> L16
            java.lang.String r1 = "ksad_file_download"
            java.lang.String r2 = "_id = ? "
            java.lang.String r3 = java.lang.String.valueOf(r5)     // Catch: java.lang.Exception -> L14 android.database.sqlite.SQLiteException -> L16
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch: java.lang.Exception -> L14 android.database.sqlite.SQLiteException -> L16
            r0.update(r1, r6, r2, r3)     // Catch: java.lang.Exception -> L14 android.database.sqlite.SQLiteException -> L16
            return
        L14:
            r5 = move-exception
            goto L18
        L16:
            r6 = move-exception
            goto L1c
        L18:
            printStackTrace(r5)
            return
        L1c:
            r4.a(r5, r6)
            return
    }

    private void a(int r2, @androidx.annotation.Nullable android.database.sqlite.SQLiteException r3) {
            r1 = this;
            boolean r0 = r3 instanceof android.database.sqlite.SQLiteFullException
            if (r0 == 0) goto L14
            r0 = -1
            if (r2 == r0) goto Ld
            r1.bG(r2)
            r1.bF(r2)
        Ld:
            h(r3)
            r2 = 1
            com.kwad.framework.filedownloader.b.d.amQ = r2
            return
        L14:
            printStackTrace(r3)
            return
    }

    private void a(android.database.sqlite.SQLiteException r2) {
            r1 = this;
            r0 = -1
            r1.a(r0, r2)
            return
    }

    static /* synthetic */ void a(com.kwad.framework.filedownloader.b.d r0, android.database.sqlite.SQLiteException r1) {
            r0.a(r1)
            return
    }

    @android.annotation.SuppressLint({"Range"})
    private static com.kwad.framework.filedownloader.d.c d(android.database.Cursor r4) {
            com.kwad.framework.filedownloader.d.c r0 = new com.kwad.framework.filedownloader.d.c
            r0.<init>()
            if (r4 != 0) goto L8
            return r0
        L8:
            java.lang.String r1 = "_id"
            int r1 = r4.getColumnIndex(r1)
            int r1 = r4.getInt(r1)
            r0.setId(r1)
            java.lang.String r1 = "url"
            int r1 = r4.getColumnIndex(r1)
            java.lang.String r1 = r4.getString(r1)
            r0.setUrl(r1)
            java.lang.String r1 = "path"
            int r1 = r4.getColumnIndex(r1)
            java.lang.String r1 = r4.getString(r1)
            java.lang.String r2 = "pathAsDirectory"
            int r2 = r4.getColumnIndex(r2)
            short r2 = r4.getShort(r2)
            r3 = 1
            if (r2 != r3) goto L3a
            goto L3b
        L3a:
            r3 = 0
        L3b:
            r0.d(r1, r3)
            java.lang.String r1 = "status"
            int r1 = r4.getColumnIndex(r1)
            short r1 = r4.getShort(r1)
            byte r1 = (byte) r1
            r0.d(r1)
            java.lang.String r1 = "sofar"
            int r1 = r4.getColumnIndex(r1)
            long r1 = r4.getLong(r1)
            r0.Z(r1)
            java.lang.String r1 = "total"
            int r1 = r4.getColumnIndex(r1)
            long r1 = r4.getLong(r1)
            r0.ab(r1)
            java.lang.String r1 = "errMsg"
            int r1 = r4.getColumnIndex(r1)
            java.lang.String r1 = r4.getString(r1)
            r0.by(r1)
            java.lang.String r1 = "etag"
            int r1 = r4.getColumnIndex(r1)
            java.lang.String r1 = r4.getString(r1)
            r0.bx(r1)
            java.lang.String r1 = "filename"
            int r1 = r4.getColumnIndex(r1)
            java.lang.String r1 = r4.getString(r1)
            r0.bz(r1)
            java.lang.String r1 = "connectionCount"
            int r1 = r4.getColumnIndex(r1)
            int r4 = r4.getInt(r1)
            r0.bW(r4)
            return r0
    }

    private void d(com.kwad.framework.filedownloader.d.c r5) {
            r4 = this;
            android.database.sqlite.SQLiteDatabase r0 = r4.xV()     // Catch: java.lang.Exception -> Lf android.database.sqlite.SQLiteException -> L11
            java.lang.String r1 = "ksad_file_download"
            android.content.ContentValues r2 = r5.yX()     // Catch: java.lang.Exception -> Lf android.database.sqlite.SQLiteException -> L11
            r3 = 0
            r0.insert(r1, r3, r2)     // Catch: java.lang.Exception -> Lf android.database.sqlite.SQLiteException -> L11
            return
        Lf:
            r5 = move-exception
            goto L13
        L11:
            r0 = move-exception
            goto L17
        L13:
            printStackTrace(r5)
            return
        L17:
            java.lang.String r1 = r0.toString()
            r5.by(r1)
            r1 = -1
            r5.d(r1)
            int r5 = r5.getId()
            r4.a(r5, r0)
            return
    }

    static /* synthetic */ com.kwad.framework.filedownloader.d.c e(android.database.Cursor r0) {
            com.kwad.framework.filedownloader.d.c r0 = d(r0)
            return r0
    }

    private static void h(java.lang.Throwable r0) {
            return
    }

    static /* synthetic */ void i(java.lang.Throwable r0) {
            printStackTrace(r0)
            return
    }

    private static void printStackTrace(java.lang.Throwable r0) {
            h(r0)
            return
    }

    private android.database.sqlite.SQLiteDatabase xV() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.amS
            if (r0 != 0) goto Lc
            com.kwad.framework.filedownloader.b.e r0 = r1.amR
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()
            r1.amS = r0
        Lc:
            android.database.sqlite.SQLiteDatabase r0 = r1.amS
            return r0
    }

    public final com.kwad.framework.filedownloader.b.a.InterfaceC0111a a(android.util.SparseArray<com.kwad.framework.filedownloader.d.c> r2, android.util.SparseArray<java.util.List<com.kwad.framework.filedownloader.d.a>> r3) {
            r1 = this;
            com.kwad.framework.filedownloader.b.d$a r0 = new com.kwad.framework.filedownloader.b.d$a
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void a(int r4, int r5, long r6) {
            r3 = this;
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.String r1 = "currentOffset"
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r0.put(r1, r6)
            android.database.sqlite.SQLiteDatabase r6 = r3.xV()     // Catch: java.lang.Exception -> L26 android.database.sqlite.SQLiteException -> L28
            java.lang.String r7 = "ksad_file_download_connection"
            java.lang.String r1 = "id = ? AND connectionIndex = ?"
            java.lang.String r2 = java.lang.Integer.toString(r4)     // Catch: java.lang.Exception -> L26 android.database.sqlite.SQLiteException -> L28
            java.lang.String r5 = java.lang.Integer.toString(r5)     // Catch: java.lang.Exception -> L26 android.database.sqlite.SQLiteException -> L28
            java.lang.String[] r5 = new java.lang.String[]{r2, r5}     // Catch: java.lang.Exception -> L26 android.database.sqlite.SQLiteException -> L28
            r6.update(r7, r0, r1, r5)     // Catch: java.lang.Exception -> L26 android.database.sqlite.SQLiteException -> L28
            return
        L26:
            r4 = move-exception
            goto L2a
        L28:
            r5 = move-exception
            goto L2e
        L2a:
            printStackTrace(r4)
            return
        L2e:
            r3.a(r4, r5)
            return
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void a(int r4, long r5, java.lang.String r7, java.lang.String r8) {
            r3 = this;
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            r1 = 2
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            java.lang.String r2 = "status"
            r0.put(r2, r1)
            java.lang.String r1 = "total"
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r0.put(r1, r5)
            java.lang.String r5 = "etag"
            r0.put(r5, r7)
            java.lang.String r5 = "filename"
            r0.put(r5, r8)
            r3.a(r4, r0)
            return
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void a(int r3, java.lang.String r4, long r5, long r7, int r9) {
            r2 = this;
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.String r1 = "sofar"
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r0.put(r1, r5)
            java.lang.String r5 = "total"
            java.lang.Long r6 = java.lang.Long.valueOf(r7)
            r0.put(r5, r6)
            java.lang.String r5 = "etag"
            r0.put(r5, r4)
            java.lang.String r4 = "connectionCount"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            r0.put(r4, r5)
            r2.a(r3, r0)
            return
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void a(int r3, java.lang.Throwable r4) {
            r2 = this;
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.String r1 = "errMsg"
            java.lang.String r4 = r4.toString()
            r0.put(r1, r4)
            r4 = 5
            java.lang.Byte r4 = java.lang.Byte.valueOf(r4)
            java.lang.String r1 = "status"
            r0.put(r1, r4)
            r2.a(r3, r0)
            return
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void a(int r3, java.lang.Throwable r4, long r5) {
            r2 = this;
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.String r1 = "errMsg"
            java.lang.String r4 = r4.toString()
            r0.put(r1, r4)
            r4 = -1
            java.lang.Byte r4 = java.lang.Byte.valueOf(r4)
            java.lang.String r1 = "status"
            r0.put(r1, r4)
            java.lang.String r4 = "sofar"
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r0.put(r4, r5)
            r2.a(r3, r0)
            return
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void a(com.kwad.framework.filedownloader.d.a r5) {
            r4 = this;
            if (r5 == 0) goto L20
            android.database.sqlite.SQLiteDatabase r0 = r4.xV()     // Catch: java.lang.Exception -> L11 android.database.sqlite.SQLiteException -> L13
            java.lang.String r1 = "ksad_file_download_connection"
            android.content.ContentValues r2 = r5.yX()     // Catch: java.lang.Exception -> L11 android.database.sqlite.SQLiteException -> L13
            r3 = 0
            r0.insert(r1, r3, r2)     // Catch: java.lang.Exception -> L11 android.database.sqlite.SQLiteException -> L13
            return
        L11:
            r5 = move-exception
            goto L15
        L13:
            r0 = move-exception
            goto L19
        L15:
            printStackTrace(r5)
            return
        L19:
            int r5 = r5.getId()
            r4.a(r5, r0)
        L20:
            return
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void b(int r4, long r5) {
            r3 = this;
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            r1 = 3
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            java.lang.String r2 = "status"
            r0.put(r2, r1)
            java.lang.String r1 = "sofar"
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r0.put(r1, r5)
            r3.a(r4, r0)
            return
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void b(com.kwad.framework.filedownloader.d.c r6) {
            r5 = this;
            if (r6 != 0) goto Lb
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r0 = "update but model == null!"
            com.kwad.framework.filedownloader.f.d.d(r5, r0, r6)
            return
        Lb:
            int r0 = r6.getId()
            com.kwad.framework.filedownloader.d.c r0 = r5.bD(r0)
            if (r0 == 0) goto L4c
            android.content.ContentValues r0 = r6.yX()
            android.database.sqlite.SQLiteDatabase r1 = r5.xV()     // Catch: java.lang.Exception -> L31 android.database.sqlite.SQLiteException -> L33
            java.lang.String r2 = "ksad_file_download"
            java.lang.String r3 = "_id = ? "
            int r4 = r6.getId()     // Catch: java.lang.Exception -> L31 android.database.sqlite.SQLiteException -> L33
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Exception -> L31 android.database.sqlite.SQLiteException -> L33
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Exception -> L31 android.database.sqlite.SQLiteException -> L33
            r1.update(r2, r0, r3, r4)     // Catch: java.lang.Exception -> L31 android.database.sqlite.SQLiteException -> L33
            return
        L31:
            r6 = move-exception
            goto L35
        L33:
            r0 = move-exception
            goto L39
        L35:
            printStackTrace(r6)
            return
        L39:
            java.lang.String r1 = r0.toString()
            r6.by(r1)
            r1 = -1
            r6.d(r1)
            int r6 = r6.getId()
            r5.a(r6, r0)
            return
        L4c:
            r5.d(r6)
            return
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void bC(int r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final com.kwad.framework.filedownloader.d.c bD(int r7) {
            r6 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r6.xV()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f android.database.sqlite.SQLiteException -> L42
            java.lang.String r2 = "SELECT * FROM %s WHERE %s = ?"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f android.database.sqlite.SQLiteException -> L47
            java.lang.String r4 = "ksad_file_download"
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f android.database.sqlite.SQLiteException -> L47
            java.lang.String r4 = "_id"
            r5 = 1
            r3[r5] = r4     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f android.database.sqlite.SQLiteException -> L47
            java.lang.String r2 = com.kwad.framework.filedownloader.f.f.c(r2, r3)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f android.database.sqlite.SQLiteException -> L42
            java.lang.String r3 = java.lang.Integer.toString(r7)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f android.database.sqlite.SQLiteException -> L42
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f android.database.sqlite.SQLiteException -> L42
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f android.database.sqlite.SQLiteException -> L42
            boolean r2 = r1.moveToNext()     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L35 android.database.sqlite.SQLiteException -> L37
            if (r2 == 0) goto L39
            com.kwad.framework.filedownloader.d.c r7 = d(r1)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L35 android.database.sqlite.SQLiteException -> L37
            com.kwad.sdk.crash.utils.b.closeQuietly(r1)
            return r7
        L32:
            r7 = move-exception
            r0 = r1
            goto L52
        L35:
            r7 = move-exception
            goto L49
        L37:
            r2 = move-exception
            goto L4d
        L39:
            com.kwad.sdk.crash.utils.b.closeQuietly(r1)
            goto L51
        L3d:
            r7 = move-exception
            goto L52
        L3f:
            r7 = move-exception
            r1 = r0
            goto L49
        L42:
            r2 = move-exception
        L43:
            r1 = r0
            goto L4d
        L45:
            r2 = r1
            goto L43
        L47:
            r1 = move-exception
            goto L45
        L49:
            printStackTrace(r7)     // Catch: java.lang.Throwable -> L32
            goto L39
        L4d:
            r6.a(r7, r2)     // Catch: java.lang.Throwable -> L32
            goto L39
        L51:
            return r0
        L52:
            com.kwad.sdk.crash.utils.b.closeQuietly(r0)
            throw r7
    }

    @Override // com.kwad.framework.filedownloader.b.a
    @android.annotation.SuppressLint({"Range"})
    public final java.util.List<com.kwad.framework.filedownloader.d.a> bE(int r8) {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r7.xV()     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71 android.database.sqlite.SQLiteException -> L73
            java.lang.String r3 = "SELECT * FROM %s WHERE %s = ?"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71 android.database.sqlite.SQLiteException -> L73
            java.lang.String r5 = "ksad_file_download_connection"
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71 android.database.sqlite.SQLiteException -> L73
            java.lang.String r5 = "id"
            r6 = 1
            r4[r6] = r5     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71 android.database.sqlite.SQLiteException -> L73
            java.lang.String r3 = com.kwad.framework.filedownloader.f.f.c(r3, r4)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71 android.database.sqlite.SQLiteException -> L73
            java.lang.String r4 = java.lang.Integer.toString(r8)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71 android.database.sqlite.SQLiteException -> L73
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71 android.database.sqlite.SQLiteException -> L73
            android.database.Cursor r1 = r2.rawQuery(r3, r4)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71 android.database.sqlite.SQLiteException -> L73
        L29:
            boolean r2 = r1.moveToNext()     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71 android.database.sqlite.SQLiteException -> L73
            if (r2 == 0) goto L75
            com.kwad.framework.filedownloader.d.a r2 = new com.kwad.framework.filedownloader.d.a     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71 android.database.sqlite.SQLiteException -> L73
            r2.<init>()     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71 android.database.sqlite.SQLiteException -> L73
            r2.setId(r8)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71 android.database.sqlite.SQLiteException -> L73
            java.lang.String r3 = "connectionIndex"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71 android.database.sqlite.SQLiteException -> L73
            int r3 = r1.getInt(r3)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71 android.database.sqlite.SQLiteException -> L73
            r2.setIndex(r3)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71 android.database.sqlite.SQLiteException -> L73
            java.lang.String r3 = "startOffset"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71 android.database.sqlite.SQLiteException -> L73
            long r3 = r1.getLong(r3)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71 android.database.sqlite.SQLiteException -> L73
            r2.setStartOffset(r3)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71 android.database.sqlite.SQLiteException -> L73
            java.lang.String r3 = "currentOffset"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71 android.database.sqlite.SQLiteException -> L73
            long r3 = r1.getLong(r3)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71 android.database.sqlite.SQLiteException -> L73
            r2.X(r3)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71 android.database.sqlite.SQLiteException -> L73
            java.lang.String r3 = "endOffset"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71 android.database.sqlite.SQLiteException -> L73
            long r3 = r1.getLong(r3)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71 android.database.sqlite.SQLiteException -> L73
            r2.Y(r3)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71 android.database.sqlite.SQLiteException -> L73
            r0.add(r2)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71 android.database.sqlite.SQLiteException -> L73
            goto L29
        L6f:
            r8 = move-exception
            goto L85
        L71:
            r8 = move-exception
            goto L79
        L73:
            r2 = move-exception
            goto L80
        L75:
            com.kwad.sdk.crash.utils.b.closeQuietly(r1)
            return r0
        L79:
            printStackTrace(r8)     // Catch: java.lang.Throwable -> L6f
        L7c:
            com.kwad.sdk.crash.utils.b.closeQuietly(r1)
            goto L84
        L80:
            r7.a(r8, r2)     // Catch: java.lang.Throwable -> L6f
            goto L7c
        L84:
            return r0
        L85:
            com.kwad.sdk.crash.utils.b.closeQuietly(r1)
            throw r8
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void bF(int r4) {
            r3 = this;
            android.database.sqlite.SQLiteDatabase r0 = r3.xV()     // Catch: java.lang.Exception -> L16 android.database.sqlite.SQLiteException -> L18
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L16 android.database.sqlite.SQLiteException -> L18
            java.lang.String r2 = "DELETE FROM ksad_file_download_connection WHERE id = "
            r1.<init>(r2)     // Catch: java.lang.Exception -> L16 android.database.sqlite.SQLiteException -> L18
            r1.append(r4)     // Catch: java.lang.Exception -> L16 android.database.sqlite.SQLiteException -> L18
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Exception -> L16 android.database.sqlite.SQLiteException -> L18
            r0.execSQL(r4)     // Catch: java.lang.Exception -> L16 android.database.sqlite.SQLiteException -> L18
            return
        L16:
            r4 = move-exception
            goto L1a
        L18:
            r4 = move-exception
            goto L1e
        L1a:
            printStackTrace(r4)
            return
        L1e:
            printStackTrace(r4)
            return
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final boolean bG(int r5) {
            r4 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.xV()     // Catch: java.lang.Exception -> L1a android.database.sqlite.SQLiteException -> L1c
            java.lang.String r2 = "ksad_file_download"
            java.lang.String r3 = "_id = ?"
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Exception -> L1a android.database.sqlite.SQLiteException -> L1c
            java.lang.String[] r5 = new java.lang.String[]{r5}     // Catch: java.lang.Exception -> L1a android.database.sqlite.SQLiteException -> L1c
            int r5 = r1.delete(r2, r3, r5)     // Catch: java.lang.Exception -> L1a android.database.sqlite.SQLiteException -> L1c
            if (r5 == 0) goto L19
            r5 = 1
            return r5
        L19:
            return r0
        L1a:
            r5 = move-exception
            goto L1e
        L1c:
            r5 = move-exception
            goto L22
        L1e:
            printStackTrace(r5)
            goto L25
        L22:
            printStackTrace(r5)
        L25:
            return r0
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void bH(int r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void c(int r1, long r2) {
            r0 = this;
            r0.bG(r1)
            return
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void clear() {
            r3 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r3.xV()     // Catch: android.database.sqlite.SQLiteException -> Lb
            java.lang.String r2 = "ksad_file_download"
            r1.delete(r2, r0, r0)     // Catch: android.database.sqlite.SQLiteException -> Lb
            goto Lf
        Lb:
            r1 = move-exception
            r3.a(r1)
        Lf:
            android.database.sqlite.SQLiteDatabase r1 = r3.xV()     // Catch: android.database.sqlite.SQLiteException -> L19
            java.lang.String r2 = "ksad_file_download_connection"
            r1.delete(r2, r0, r0)     // Catch: android.database.sqlite.SQLiteException -> L19
            return
        L19:
            r0 = move-exception
            r3.a(r0)
            return
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void d(int r4, long r5) {
            r3 = this;
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            r1 = -2
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            java.lang.String r2 = "status"
            r0.put(r2, r1)
            java.lang.String r1 = "sofar"
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r0.put(r1, r5)
            r3.a(r4, r0)
            return
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void t(int r5, int r6) {
            r4 = this;
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.String r1 = "connectionCount"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0.put(r1, r6)
            android.database.sqlite.SQLiteDatabase r6 = r4.xV()     // Catch: java.lang.Exception -> L22 android.database.sqlite.SQLiteException -> L24
            java.lang.String r1 = "ksad_file_download"
            java.lang.String r2 = "_id = ? "
            java.lang.String r3 = java.lang.Integer.toString(r5)     // Catch: java.lang.Exception -> L22 android.database.sqlite.SQLiteException -> L24
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch: java.lang.Exception -> L22 android.database.sqlite.SQLiteException -> L24
            r6.update(r1, r0, r2, r3)     // Catch: java.lang.Exception -> L22 android.database.sqlite.SQLiteException -> L24
            return
        L22:
            r5 = move-exception
            goto L26
        L24:
            r6 = move-exception
            goto L2a
        L26:
            printStackTrace(r5)
            return
        L2a:
            r4.a(r5, r6)
            return
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final com.kwad.framework.filedownloader.b.a.InterfaceC0111a xT() {
            r2 = this;
            com.kwad.framework.filedownloader.b.d$a r0 = new com.kwad.framework.filedownloader.b.d$a
            r1 = 0
            r0.<init>(r2, r1, r1)
            return r0
    }
}
