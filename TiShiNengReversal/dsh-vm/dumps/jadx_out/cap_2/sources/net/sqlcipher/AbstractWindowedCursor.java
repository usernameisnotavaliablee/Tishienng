package net.sqlcipher;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class AbstractWindowedCursor extends net.sqlcipher.AbstractCursor {
    protected net.sqlcipher.CursorWindow mWindow;

    public AbstractWindowedCursor() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // net.sqlcipher.AbstractCursor
    protected void checkPosition() {
            r2 = this;
            super.checkPosition()
            net.sqlcipher.CursorWindow r0 = r2.mWindow
            if (r0 == 0) goto L8
            return
        L8:
            net.sqlcipher.StaleDataException r0 = new net.sqlcipher.StaleDataException
            java.lang.String r1 = "Access closed cursor"
            r0.<init>(r1)
            throw r0
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public void copyStringToBuffer(int r3, android.database.CharArrayBuffer r4) {
            r2 = this;
            r2.checkPosition()
            java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.mUpdatedRows
            monitor-enter(r0)
            boolean r1 = r2.isFieldUpdated(r3)     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto L12
            super.copyStringToBuffer(r3, r4)     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r3 = move-exception
            goto L1b
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            net.sqlcipher.CursorWindow r0 = r2.mWindow
            int r1 = r2.mPos
            r0.copyStringToBuffer(r1, r3, r4)
            return
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r3
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public byte[] getBlob(int r3) {
            r2 = this;
            r2.checkPosition()
            java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.mUpdatedRows
            monitor-enter(r0)
            boolean r1 = r2.isFieldUpdated(r3)     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            java.lang.Object r3 = r2.getUpdatedField(r3)     // Catch: java.lang.Throwable -> L14
            byte[] r3 = (byte[]) r3     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return r3
        L14:
            r3 = move-exception
            goto L20
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            net.sqlcipher.CursorWindow r0 = r2.mWindow
            int r1 = r2.mPos
            byte[] r3 = r0.getBlob(r1, r3)
            return r3
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r3
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public double getDouble(int r4) {
            r3 = this;
            r3.checkPosition()
            java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> r0 = r3.mUpdatedRows
            monitor-enter(r0)
            boolean r1 = r3.isFieldUpdated(r4)     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L1a
            java.lang.Object r4 = r3.getUpdatedField(r4)     // Catch: java.lang.Throwable -> L18
            java.lang.Number r4 = (java.lang.Number) r4     // Catch: java.lang.Throwable -> L18
            double r1 = r4.doubleValue()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return r1
        L18:
            r4 = move-exception
            goto L24
        L1a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            net.sqlcipher.CursorWindow r0 = r3.mWindow
            int r1 = r3.mPos
            double r0 = r0.getDouble(r1, r4)
            return r0
        L24:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r4
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public float getFloat(int r3) {
            r2 = this;
            r2.checkPosition()
            java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.mUpdatedRows
            monitor-enter(r0)
            boolean r1 = r2.isFieldUpdated(r3)     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L1a
            java.lang.Object r3 = r2.getUpdatedField(r3)     // Catch: java.lang.Throwable -> L18
            java.lang.Number r3 = (java.lang.Number) r3     // Catch: java.lang.Throwable -> L18
            float r3 = r3.floatValue()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return r3
        L18:
            r3 = move-exception
            goto L24
        L1a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            net.sqlcipher.CursorWindow r0 = r2.mWindow
            int r1 = r2.mPos
            float r3 = r0.getFloat(r1, r3)
            return r3
        L24:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r3
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public int getInt(int r3) {
            r2 = this;
            r2.checkPosition()
            java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.mUpdatedRows
            monitor-enter(r0)
            boolean r1 = r2.isFieldUpdated(r3)     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L1a
            java.lang.Object r3 = r2.getUpdatedField(r3)     // Catch: java.lang.Throwable -> L18
            java.lang.Number r3 = (java.lang.Number) r3     // Catch: java.lang.Throwable -> L18
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return r3
        L18:
            r3 = move-exception
            goto L24
        L1a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            net.sqlcipher.CursorWindow r0 = r2.mWindow
            int r1 = r2.mPos
            int r3 = r0.getInt(r1, r3)
            return r3
        L24:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r3
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public long getLong(int r4) {
            r3 = this;
            r3.checkPosition()
            java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> r0 = r3.mUpdatedRows
            monitor-enter(r0)
            boolean r1 = r3.isFieldUpdated(r4)     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L1a
            java.lang.Object r4 = r3.getUpdatedField(r4)     // Catch: java.lang.Throwable -> L18
            java.lang.Number r4 = (java.lang.Number) r4     // Catch: java.lang.Throwable -> L18
            long r1 = r4.longValue()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return r1
        L18:
            r4 = move-exception
            goto L24
        L1a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            net.sqlcipher.CursorWindow r0 = r3.mWindow
            int r1 = r3.mPos
            long r0 = r0.getLong(r1, r4)
            return r0
        L24:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r4
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public short getShort(int r3) {
            r2 = this;
            r2.checkPosition()
            java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.mUpdatedRows
            monitor-enter(r0)
            boolean r1 = r2.isFieldUpdated(r3)     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L1a
            java.lang.Object r3 = r2.getUpdatedField(r3)     // Catch: java.lang.Throwable -> L18
            java.lang.Number r3 = (java.lang.Number) r3     // Catch: java.lang.Throwable -> L18
            short r3 = r3.shortValue()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return r3
        L18:
            r3 = move-exception
            goto L24
        L1a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            net.sqlcipher.CursorWindow r0 = r2.mWindow
            int r1 = r2.mPos
            short r3 = r0.getShort(r1, r3)
            return r3
        L24:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r3
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public java.lang.String getString(int r3) {
            r2 = this;
            r2.checkPosition()
            java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.mUpdatedRows
            monitor-enter(r0)
            boolean r1 = r2.isFieldUpdated(r3)     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            java.lang.Object r3 = r2.getUpdatedField(r3)     // Catch: java.lang.Throwable -> L14
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return r3
        L14:
            r3 = move-exception
            goto L20
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            net.sqlcipher.CursorWindow r0 = r2.mWindow
            int r1 = r2.mPos
            java.lang.String r3 = r0.getString(r1, r3)
            return r3
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r3
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor, net.sqlcipher.Cursor
    public int getType(int r3) {
            r2 = this;
            r2.checkPosition()
            net.sqlcipher.CursorWindow r0 = r2.mWindow
            int r1 = r2.mPos
            int r3 = r0.getType(r1, r3)
            return r3
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.CrossProcessCursor
    public /* bridge */ /* synthetic */ android.database.CursorWindow getWindow() {
            r1 = this;
            net.sqlcipher.CursorWindow r0 = r1.getWindow()
            return r0
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.CrossProcessCursor
    public net.sqlcipher.CursorWindow getWindow() {
            r1 = this;
            net.sqlcipher.CursorWindow r0 = r1.mWindow
            return r0
    }

    public boolean hasWindow() {
            r1 = this;
            net.sqlcipher.CursorWindow r0 = r1.mWindow
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public boolean isBlob(int r3) {
            r2 = this;
            r2.checkPosition()
            java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.mUpdatedRows
            monitor-enter(r0)
            boolean r1 = r2.isFieldUpdated(r3)     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L1e
            java.lang.Object r3 = r2.getUpdatedField(r3)     // Catch: java.lang.Throwable -> L19
            if (r3 == 0) goto L1b
            boolean r3 = r3 instanceof byte[]     // Catch: java.lang.Throwable -> L19
            if (r3 == 0) goto L17
            goto L1b
        L17:
            r3 = 0
            goto L1c
        L19:
            r3 = move-exception
            goto L28
        L1b:
            r3 = 1
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return r3
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            net.sqlcipher.CursorWindow r0 = r2.mWindow
            int r1 = r2.mPos
            boolean r3 = r0.isBlob(r1, r3)
            return r3
        L28:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r3
    }

    public boolean isFloat(int r3) {
            r2 = this;
            r2.checkPosition()
            java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.mUpdatedRows
            monitor-enter(r0)
            boolean r1 = r2.isFieldUpdated(r3)     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L22
            java.lang.Object r3 = r2.getUpdatedField(r3)     // Catch: java.lang.Throwable -> L1b
            if (r3 == 0) goto L1f
            boolean r1 = r3 instanceof java.lang.Float     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L1d
            boolean r3 = r3 instanceof java.lang.Double     // Catch: java.lang.Throwable -> L1b
            if (r3 == 0) goto L1f
            goto L1d
        L1b:
            r3 = move-exception
            goto L2c
        L1d:
            r3 = 1
            goto L20
        L1f:
            r3 = 0
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return r3
        L22:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            net.sqlcipher.CursorWindow r0 = r2.mWindow
            int r1 = r2.mPos
            boolean r3 = r0.isFloat(r1, r3)
            return r3
        L2c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r3
    }

    public boolean isLong(int r3) {
            r2 = this;
            r2.checkPosition()
            java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.mUpdatedRows
            monitor-enter(r0)
            boolean r1 = r2.isFieldUpdated(r3)     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L22
            java.lang.Object r3 = r2.getUpdatedField(r3)     // Catch: java.lang.Throwable -> L1b
            if (r3 == 0) goto L1f
            boolean r1 = r3 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L1d
            boolean r3 = r3 instanceof java.lang.Long     // Catch: java.lang.Throwable -> L1b
            if (r3 == 0) goto L1f
            goto L1d
        L1b:
            r3 = move-exception
            goto L2c
        L1d:
            r3 = 1
            goto L20
        L1f:
            r3 = 0
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return r3
        L22:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            net.sqlcipher.CursorWindow r0 = r2.mWindow
            int r1 = r2.mPos
            boolean r3 = r0.isLong(r1, r3)
            return r3
        L2c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r3
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public boolean isNull(int r3) {
            r2 = this;
            r2.checkPosition()
            java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.mUpdatedRows
            monitor-enter(r0)
            boolean r1 = r2.isFieldUpdated(r3)     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L19
            java.lang.Object r3 = r2.getUpdatedField(r3)     // Catch: java.lang.Throwable -> L17
            if (r3 != 0) goto L14
            r3 = 1
            goto L15
        L14:
            r3 = 0
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return r3
        L17:
            r3 = move-exception
            goto L23
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            net.sqlcipher.CursorWindow r0 = r2.mWindow
            int r1 = r2.mPos
            boolean r3 = r0.isNull(r1, r3)
            return r3
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r3
    }

    public boolean isString(int r3) {
            r2 = this;
            r2.checkPosition()
            java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.mUpdatedRows
            monitor-enter(r0)
            boolean r1 = r2.isFieldUpdated(r3)     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L1e
            java.lang.Object r3 = r2.getUpdatedField(r3)     // Catch: java.lang.Throwable -> L19
            if (r3 == 0) goto L1b
            boolean r3 = r3 instanceof java.lang.String     // Catch: java.lang.Throwable -> L19
            if (r3 == 0) goto L17
            goto L1b
        L17:
            r3 = 0
            goto L1c
        L19:
            r3 = move-exception
            goto L28
        L1b:
            r3 = 1
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return r3
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            net.sqlcipher.CursorWindow r0 = r2.mWindow
            int r1 = r2.mPos
            boolean r3 = r0.isString(r1, r3)
            return r3
        L28:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r3
    }

    public void setWindow(net.sqlcipher.CursorWindow r2) {
            r1 = this;
            net.sqlcipher.CursorWindow r0 = r1.mWindow
            if (r0 == 0) goto L7
            r0.close()
        L7:
            r1.mWindow = r2
            return
    }
}
