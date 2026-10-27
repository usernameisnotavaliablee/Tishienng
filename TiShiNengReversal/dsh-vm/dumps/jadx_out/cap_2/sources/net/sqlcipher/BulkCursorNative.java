package net.sqlcipher;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class BulkCursorNative extends android.os.Binder implements net.sqlcipher.IBulkCursor {
    public BulkCursorNative() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "android.content.IBulkCursor"
            r1.attachInterface(r1, r0)
            return
    }

    public static net.sqlcipher.IBulkCursor asInterface(android.os.IBinder r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            java.lang.String r0 = "android.content.IBulkCursor"
            android.os.IInterface r0 = r1.queryLocalInterface(r0)
            net.sqlcipher.IBulkCursor r0 = (net.sqlcipher.IBulkCursor) r0
            if (r0 == 0) goto Lf
            return r0
        Lf:
            net.sqlcipher.BulkCursorProxy r0 = new net.sqlcipher.BulkCursorProxy
            r0.<init>(r1)
            return r0
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
            r0 = this;
            return r0
    }

    @Override // android.os.Binder
    public boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) throws android.os.RemoteException {
            r3 = this;
            r0 = 0
            java.lang.String r1 = "android.content.IBulkCursor"
            r2 = 1
            switch(r4) {
                case 1: goto Ldf;
                case 2: goto Ld1;
                case 3: goto Lb7;
                case 4: goto La1;
                case 5: goto L8c;
                case 6: goto L82;
                case 7: goto L5d;
                case 8: goto L4f;
                case 9: goto L41;
                case 10: goto L33;
                case 11: goto L19;
                case 12: goto Lc;
                default: goto L7;
            }
        L7:
            boolean r4 = super.onTransact(r4, r5, r6, r7)
            return r4
        Lc:
            r5.enforceInterface(r1)     // Catch: java.lang.Exception -> L16
            r3.close()     // Catch: java.lang.Exception -> L16
            r6.writeNoException()     // Catch: java.lang.Exception -> L16
            return r2
        L16:
            r4 = move-exception
            goto Lfa
        L19:
            r5.enforceInterface(r1)     // Catch: java.lang.Exception -> L16
            java.lang.Class r4 = r3.getClass()     // Catch: java.lang.Exception -> L16
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch: java.lang.Exception -> L16
            android.os.Bundle r4 = r5.readBundle(r4)     // Catch: java.lang.Exception -> L16
            android.os.Bundle r4 = r3.respond(r4)     // Catch: java.lang.Exception -> L16
            r6.writeNoException()     // Catch: java.lang.Exception -> L16
            r6.writeBundle(r4)     // Catch: java.lang.Exception -> L16
            return r2
        L33:
            r5.enforceInterface(r1)     // Catch: java.lang.Exception -> L16
            android.os.Bundle r4 = r3.getExtras()     // Catch: java.lang.Exception -> L16
            r6.writeNoException()     // Catch: java.lang.Exception -> L16
            r6.writeBundle(r4)     // Catch: java.lang.Exception -> L16
            return r2
        L41:
            r5.enforceInterface(r1)     // Catch: java.lang.Exception -> L16
            boolean r4 = r3.getWantsAllOnMoveCalls()     // Catch: java.lang.Exception -> L16
            r6.writeNoException()     // Catch: java.lang.Exception -> L16
            r6.writeInt(r4)     // Catch: java.lang.Exception -> L16
            return r2
        L4f:
            r5.enforceInterface(r1)     // Catch: java.lang.Exception -> L16
            int r4 = r5.readInt()     // Catch: java.lang.Exception -> L16
            r3.onMove(r4)     // Catch: java.lang.Exception -> L16
            r6.writeNoException()     // Catch: java.lang.Exception -> L16
            return r2
        L5d:
            r5.enforceInterface(r1)     // Catch: java.lang.Exception -> L16
            android.os.IBinder r4 = r5.readStrongBinder()     // Catch: java.lang.Exception -> L16
            net.sqlcipher.IContentObserver r4 = net.sqlcipher.IContentObserver.Stub.asInterface(r4)     // Catch: java.lang.Exception -> L16
            android.os.Parcelable$Creator<net.sqlcipher.CursorWindow> r7 = net.sqlcipher.CursorWindow.CREATOR     // Catch: java.lang.Exception -> L16
            java.lang.Object r5 = r7.createFromParcel(r5)     // Catch: java.lang.Exception -> L16
            net.sqlcipher.CursorWindow r5 = (net.sqlcipher.CursorWindow) r5     // Catch: java.lang.Exception -> L16
            int r4 = r3.requery(r4, r5)     // Catch: java.lang.Exception -> L16
            r6.writeNoException()     // Catch: java.lang.Exception -> L16
            r6.writeInt(r4)     // Catch: java.lang.Exception -> L16
            android.os.Bundle r4 = r3.getExtras()     // Catch: java.lang.Exception -> L16
            r6.writeBundle(r4)     // Catch: java.lang.Exception -> L16
            return r2
        L82:
            r5.enforceInterface(r1)     // Catch: java.lang.Exception -> L16
            r3.deactivate()     // Catch: java.lang.Exception -> L16
            r6.writeNoException()     // Catch: java.lang.Exception -> L16
            return r2
        L8c:
            r5.enforceInterface(r1)     // Catch: java.lang.Exception -> L16
            int r4 = r5.readInt()     // Catch: java.lang.Exception -> L16
            boolean r4 = r3.deleteRow(r4)     // Catch: java.lang.Exception -> L16
            r6.writeNoException()     // Catch: java.lang.Exception -> L16
            if (r4 != r2) goto L9d
            r0 = 1
        L9d:
            r6.writeInt(r0)     // Catch: java.lang.Exception -> L16
            return r2
        La1:
            r5.enforceInterface(r1)     // Catch: java.lang.Exception -> L16
            r4 = 0
            java.util.HashMap r4 = r5.readHashMap(r4)     // Catch: java.lang.Exception -> L16
            boolean r4 = r3.updateRows(r4)     // Catch: java.lang.Exception -> L16
            r6.writeNoException()     // Catch: java.lang.Exception -> L16
            if (r4 != r2) goto Lb3
            r0 = 1
        Lb3:
            r6.writeInt(r0)     // Catch: java.lang.Exception -> L16
            return r2
        Lb7:
            r5.enforceInterface(r1)     // Catch: java.lang.Exception -> L16
            java.lang.String[] r4 = r3.getColumnNames()     // Catch: java.lang.Exception -> L16
            r6.writeNoException()     // Catch: java.lang.Exception -> L16
            int r5 = r4.length     // Catch: java.lang.Exception -> L16
            r6.writeInt(r5)     // Catch: java.lang.Exception -> L16
            int r5 = r4.length     // Catch: java.lang.Exception -> L16
        Lc6:
            if (r0 >= r5) goto Ld0
            r7 = r4[r0]     // Catch: java.lang.Exception -> L16
            r6.writeString(r7)     // Catch: java.lang.Exception -> L16
            int r0 = r0 + 1
            goto Lc6
        Ld0:
            return r2
        Ld1:
            r5.enforceInterface(r1)     // Catch: java.lang.Exception -> L16
            int r4 = r3.count()     // Catch: java.lang.Exception -> L16
            r6.writeNoException()     // Catch: java.lang.Exception -> L16
            r6.writeInt(r4)     // Catch: java.lang.Exception -> L16
            return r2
        Ldf:
            r5.enforceInterface(r1)     // Catch: java.lang.Exception -> L16
            int r4 = r5.readInt()     // Catch: java.lang.Exception -> L16
            net.sqlcipher.CursorWindow r4 = r3.getWindow(r4)     // Catch: java.lang.Exception -> L16
            if (r4 != 0) goto Lf0
            r6.writeInt(r0)     // Catch: java.lang.Exception -> L16
            return r2
        Lf0:
            r6.writeNoException()     // Catch: java.lang.Exception -> L16
            r6.writeInt(r2)     // Catch: java.lang.Exception -> L16
            r4.writeToParcel(r6, r0)     // Catch: java.lang.Exception -> L16
            return r2
        Lfa:
            net.sqlcipher.DatabaseUtils.writeExceptionToParcel(r6, r4)
            return r2
    }
}
