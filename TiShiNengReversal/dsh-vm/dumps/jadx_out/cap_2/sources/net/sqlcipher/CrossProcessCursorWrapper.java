package net.sqlcipher;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class CrossProcessCursorWrapper extends net.sqlcipher.CursorWrapper implements android.database.CrossProcessCursor {
    public CrossProcessCursorWrapper(net.sqlcipher.Cursor r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // android.database.CrossProcessCursor
    public void fillWindow(int r1, android.database.CursorWindow r2) {
            r0 = this;
            net.sqlcipher.DatabaseUtils.cursorFillWindow(r0, r1, r2)
            return
    }

    @Override // android.database.CrossProcessCursor
    public android.database.CursorWindow getWindow() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.database.CrossProcessCursor
    public boolean onMove(int r1, int r2) {
            r0 = this;
            r1 = 1
            return r1
    }
}
