package net.sqlcipher;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class CursorWrapper extends android.database.CursorWrapper implements net.sqlcipher.Cursor {
    private final net.sqlcipher.Cursor mCursor;

    public CursorWrapper(net.sqlcipher.Cursor r1) {
            r0 = this;
            r0.<init>(r1)
            r0.mCursor = r1
            return
    }

    @Override // android.database.CursorWrapper, android.database.Cursor, net.sqlcipher.Cursor
    public int getType(int r2) {
            r1 = this;
            net.sqlcipher.Cursor r0 = r1.mCursor
            int r2 = r0.getType(r2)
            return r2
    }

    @Override // android.database.CursorWrapper
    public /* bridge */ /* synthetic */ android.database.Cursor getWrappedCursor() {
            r1 = this;
            net.sqlcipher.Cursor r0 = r1.getWrappedCursor()
            return r0
    }

    @Override // android.database.CursorWrapper
    public net.sqlcipher.Cursor getWrappedCursor() {
            r1 = this;
            net.sqlcipher.Cursor r0 = r1.mCursor
            return r0
    }
}
