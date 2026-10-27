package xyz.adscope.common.network.cookie.db;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class CookieDao implements xyz.adscope.common.network.cookie.db.Field {
    private xyz.adscope.common.network.cookie.db.SQLHelper a;

    public CookieDao(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            xyz.adscope.common.network.cookie.db.SQLHelper r0 = new xyz.adscope.common.network.cookie.db.SQLHelper
            r0.<init>(r2)
            r1.a = r0
            return
    }

    protected final android.database.sqlite.SQLiteDatabase a() {
            r1 = this;
            xyz.adscope.common.network.cookie.db.SQLHelper r0 = r1.a
            android.database.sqlite.SQLiteDatabase r0 = r0.getReadableDatabase()
            return r0
    }

    protected final void a(android.database.Cursor r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            boolean r0 = r2.isClosed()
            if (r0 != 0) goto Lb
            r2.close()
        Lb:
            return
    }

    protected final void a(android.database.sqlite.SQLiteDatabase r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            boolean r0 = r2.isOpen()
            if (r0 == 0) goto Lb
            r2.close()
        Lb:
            return
    }

    public int count() {
            r1 = this;
            java.lang.String r0 = "SELECT COUNT(_ID) FROM COOKIES_TABLE"
            int r0 = r1.count(r0)
            return r0
    }

    public int count(java.lang.String r4) {
            r3 = this;
            android.database.sqlite.SQLiteDatabase r0 = r3.a()
            r1 = 0
            android.database.Cursor r4 = r0.rawQuery(r4, r1)
            boolean r1 = r4.moveToNext()     // Catch: java.lang.Throwable -> L15
            r2 = 0
            if (r1 == 0) goto L17
            int r2 = r4.getInt(r2)     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r1 = move-exception
            goto L1e
        L17:
            r3.a(r4)
            r3.a(r0)
            return r2
        L1e:
            r3.a(r4)
            r3.a(r0)
            throw r1
    }

    public boolean delete(java.lang.String r4) {
            r3 = this;
            android.database.sqlite.SQLiteDatabase r0 = r3.a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "DELETE FROM COOKIES_TABLE WHERE "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.beginTransaction()
            r0.execSQL(r4)     // Catch: java.lang.Throwable -> L26 android.database.SQLException -> L2e
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L26 android.database.SQLException -> L2e
            r0.endTransaction()
            r3.a(r0)
            r4 = 1
            return r4
        L26:
            r4 = move-exception
            r0.endTransaction()
            r3.a(r0)
            throw r4
        L2e:
            r0.endTransaction()
            r3.a(r0)
            r4 = 0
            return r4
    }

    public boolean delete(java.util.List<xyz.adscope.common.network.cookie.Cookie> r4) {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L9:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r4.next()
            xyz.adscope.common.network.cookie.Cookie r1 = (xyz.adscope.common.network.cookie.Cookie) r1
            long r1 = r1.getId()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.add(r1)
            goto L9
        L21:
            xyz.adscope.common.network.cookie.db.Where$Builder r4 = xyz.adscope.common.network.cookie.db.Where.newBuilder()
            java.lang.String r1 = "_ID"
            xyz.adscope.common.network.cookie.db.Where$Builder r4 = r4.in(r1, r0)
            xyz.adscope.common.network.cookie.db.Where r4 = r4.build()
            java.lang.String r4 = r4.toString()
            boolean r4 = r3.delete(r4)
            return r4
    }

    public boolean deleteAll() {
            r1 = this;
            java.lang.String r0 = "1=1"
            boolean r0 = r1.delete(r0)
            return r0
    }

    public java.util.List<xyz.adscope.common.network.cookie.Cookie> getAll() {
            r1 = this;
            r0 = 0
            java.util.List r0 = r1.getList(r0, r0, r0, r0)
            return r0
    }

    public java.util.List<xyz.adscope.common.network.cookie.Cookie> getList(java.lang.String r8) {
            r7 = this;
            android.database.sqlite.SQLiteDatabase r0 = r7.a()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            android.database.Cursor r8 = r0.rawQuery(r8, r2)
        Le:
            boolean r2 = r8.moveToNext()
            if (r2 == 0) goto Ld2
            xyz.adscope.common.network.cookie.Cookie r2 = new xyz.adscope.common.network.cookie.Cookie
            r2.<init>()
            java.lang.String r3 = "_ID"
            int r3 = r8.getColumnIndex(r3)
            int r3 = r8.getInt(r3)
            long r3 = (long) r3
            r2.setId(r3)
            java.lang.String r3 = "URL"
            int r3 = r8.getColumnIndex(r3)
            java.lang.String r3 = r8.getString(r3)
            r2.setUrl(r3)
            java.lang.String r3 = "NAME"
            int r3 = r8.getColumnIndex(r3)
            java.lang.String r3 = r8.getString(r3)
            r2.setName(r3)
            java.lang.String r3 = "VALUE"
            int r3 = r8.getColumnIndex(r3)
            java.lang.String r3 = r8.getString(r3)
            r2.setValue(r3)
            java.lang.String r3 = "COMMENT"
            int r3 = r8.getColumnIndex(r3)
            java.lang.String r3 = r8.getString(r3)
            r2.setComment(r3)
            java.lang.String r3 = "COMMENT_URL"
            int r3 = r8.getColumnIndex(r3)
            java.lang.String r3 = r8.getString(r3)
            r2.setCommentURL(r3)
            java.lang.String r3 = "DISCARD"
            int r3 = r8.getColumnIndex(r3)
            java.lang.String r3 = r8.getString(r3)
            java.lang.String r4 = "true"
            boolean r3 = r4.equals(r3)
            r2.setDiscard(r3)
            java.lang.String r3 = "DOMAIN"
            int r3 = r8.getColumnIndex(r3)
            java.lang.String r3 = r8.getString(r3)
            r2.setDomain(r3)
            java.lang.String r3 = "EXPIRY"
            int r3 = r8.getColumnIndex(r3)
            long r5 = r8.getLong(r3)
            r2.setExpiry(r5)
            java.lang.String r3 = "PATH"
            int r3 = r8.getColumnIndex(r3)
            java.lang.String r3 = r8.getString(r3)
            r2.setPath(r3)
            java.lang.String r3 = "PORT_LIST"
            int r3 = r8.getColumnIndex(r3)
            java.lang.String r3 = r8.getString(r3)
            r2.setPortList(r3)
            java.lang.String r3 = "SECURE"
            int r3 = r8.getColumnIndex(r3)
            java.lang.String r3 = r8.getString(r3)
            boolean r3 = r4.equals(r3)
            r2.setSecure(r3)
            java.lang.String r3 = "VERSION"
            int r3 = r8.getColumnIndex(r3)
            int r3 = r8.getInt(r3)
            r2.setVersion(r3)
            r1.add(r2)
            goto Le
        Ld2:
            r7.a(r8)
            r7.a(r0)
            return r1
    }

    public java.util.List<xyz.adscope.common.network.cookie.Cookie> getList(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SELECT "
            r0.<init>(r1)
            java.lang.String r1 = "*"
            r0.append(r1)
            java.lang.String r1 = " FROM "
            r0.append(r1)
            java.lang.String r1 = "COOKIES_TABLE"
            r0.append(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L24
            java.lang.String r1 = " WHERE "
            r0.append(r1)
            r0.append(r3)
        L24:
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 != 0) goto L32
            java.lang.String r3 = " ORDER BY "
            r0.append(r3)
            r0.append(r4)
        L32:
            boolean r3 = android.text.TextUtils.isEmpty(r5)
            if (r3 != 0) goto L4e
            java.lang.String r3 = " LIMIT "
            r0.append(r3)
            r0.append(r5)
            boolean r3 = android.text.TextUtils.isEmpty(r6)
            if (r3 != 0) goto L4e
            java.lang.String r3 = " OFFSET "
            r0.append(r3)
            r0.append(r6)
        L4e:
            java.lang.String r3 = r0.toString()
            java.util.List r3 = r2.getList(r3)
            return r3
    }

    public long replace(xyz.adscope.common.network.cookie.Cookie r5) {
            r4 = this;
            android.database.sqlite.SQLiteDatabase r0 = r4.a()
            r0.beginTransaction()
            android.content.ContentValues r1 = new android.content.ContentValues
            r1.<init>()
            java.lang.String r2 = r5.getUrl()
            java.lang.String r3 = "URL"
            r1.put(r3, r2)
            java.lang.String r2 = r5.getName()
            java.lang.String r3 = "NAME"
            r1.put(r3, r2)
            java.lang.String r2 = r5.getValue()
            java.lang.String r3 = "VALUE"
            r1.put(r3, r2)
            java.lang.String r2 = r5.getComment()
            java.lang.String r3 = "COMMENT"
            r1.put(r3, r2)
            java.lang.String r2 = r5.getCommentURL()
            java.lang.String r3 = "COMMENT_URL"
            r1.put(r3, r2)
            boolean r2 = r5.isDiscard()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "DISCARD"
            r1.put(r3, r2)
            java.lang.String r2 = r5.getDomain()
            java.lang.String r3 = "DOMAIN"
            r1.put(r3, r2)
            long r2 = r5.getExpiry()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "EXPIRY"
            r1.put(r3, r2)
            java.lang.String r2 = r5.getPath()
            java.lang.String r3 = "PATH"
            r1.put(r3, r2)
            java.lang.String r2 = r5.getPortList()
            java.lang.String r3 = "PORT_LIST"
            r1.put(r3, r2)
            boolean r2 = r5.isSecure()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "SECURE"
            r1.put(r3, r2)
            int r5 = r5.getVersion()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r2 = "VERSION"
            r1.put(r2, r5)
            java.lang.String r5 = "COOKIES_TABLE"
            r2 = 0
            long r1 = r0.replace(r5, r2, r1)     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> La1
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> La1
            r0.endTransaction()
            r4.a(r0)
            return r1
        L99:
            r5 = move-exception
            r0.endTransaction()
            r4.a(r0)
            throw r5
        La1:
            r0.endTransaction()
            r4.a(r0)
            r0 = -1
            return r0
    }
}
