package net.sqlcipher.database;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface SQLiteCursorDriver {
    void cursorClosed();

    void cursorDeactivated();

    void cursorRequeried(android.database.Cursor r1);

    net.sqlcipher.Cursor query(net.sqlcipher.database.SQLiteDatabase.CursorFactory r1, java.lang.String[] r2);

    void setBindArguments(java.lang.String[] r1);
}
