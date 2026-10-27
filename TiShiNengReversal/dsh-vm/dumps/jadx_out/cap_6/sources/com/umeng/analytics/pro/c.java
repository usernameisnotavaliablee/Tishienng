package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class c extends android.content.ContextWrapper {
    private java.lang.String a;

    public c(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1)
            r0.a = r2
            return
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public java.io.File getDatabasePath(java.lang.String r4) {
            r3 = this;
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.a
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            java.io.File r4 = r0.getParentFile()
            boolean r4 = r4.exists()
            if (r4 != 0) goto L31
            java.io.File r4 = r0.getParentFile()
            boolean r4 = r4.isDirectory()
            if (r4 != 0) goto L31
            java.io.File r4 = r0.getParentFile()
            r4.mkdirs()
        L31:
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.database.sqlite.SQLiteDatabase openOrCreateDatabase(java.lang.String r1, int r2, android.database.sqlite.SQLiteDatabase.CursorFactory r3) {
            r0 = this;
            java.io.File r1 = r0.getDatabasePath(r1)
            java.lang.String r1 = r1.getAbsolutePath()
            r2 = 268435472(0x10000010, float:2.5243597E-29)
            android.database.sqlite.SQLiteDatabase r1 = android.database.sqlite.SQLiteDatabase.openDatabase(r1, r3, r2)
            return r1
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.database.sqlite.SQLiteDatabase openOrCreateDatabase(java.lang.String r1, int r2, android.database.sqlite.SQLiteDatabase.CursorFactory r3, android.database.DatabaseErrorHandler r4) {
            r0 = this;
            java.io.File r1 = r0.getDatabasePath(r1)
            java.lang.String r1 = r1.getAbsolutePath()
            r2 = 268435472(0x10000010, float:2.5243597E-29)
            android.database.sqlite.SQLiteDatabase r1 = android.database.sqlite.SQLiteDatabase.openDatabase(r1, r3, r2)
            return r1
    }
}
