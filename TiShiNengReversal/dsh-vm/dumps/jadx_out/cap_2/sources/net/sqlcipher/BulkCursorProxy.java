package net.sqlcipher;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class BulkCursorProxy implements net.sqlcipher.IBulkCursor {
    private android.os.Bundle mExtras;
    private android.os.IBinder mRemote;

    public BulkCursorProxy(android.os.IBinder r1) {
            r0 = this;
            r0.<init>()
            r0.mRemote = r1
            r1 = 0
            r0.mExtras = r1
            return
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
            r1 = this;
            android.os.IBinder r0 = r1.mRemote
            return r0
    }

    @Override // net.sqlcipher.IBulkCursor
    public void close() throws android.os.RemoteException {
            r5 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            android.os.Parcel r1 = android.os.Parcel.obtain()
            java.lang.String r2 = "android.content.IBulkCursor"
            r0.writeInterfaceToken(r2)
            android.os.IBinder r2 = r5.mRemote
            r3 = 12
            r4 = 0
            r2.transact(r3, r0, r1, r4)
            net.sqlcipher.DatabaseUtils.readExceptionFromParcel(r1)
            r0.recycle()
            r1.recycle()
            return
    }

    @Override // net.sqlcipher.IBulkCursor
    public int count() throws android.os.RemoteException {
            r5 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            android.os.Parcel r1 = android.os.Parcel.obtain()
            java.lang.String r2 = "android.content.IBulkCursor"
            r0.writeInterfaceToken(r2)
            android.os.IBinder r2 = r5.mRemote
            r3 = 2
            r4 = 0
            boolean r2 = r2.transact(r3, r0, r1, r4)
            net.sqlcipher.DatabaseUtils.readExceptionFromParcel(r1)
            if (r2 != 0) goto L1c
            r2 = -1
            goto L20
        L1c:
            int r2 = r1.readInt()
        L20:
            r0.recycle()
            r1.recycle()
            return r2
    }

    @Override // net.sqlcipher.IBulkCursor
    public void deactivate() throws android.os.RemoteException {
            r5 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            android.os.Parcel r1 = android.os.Parcel.obtain()
            java.lang.String r2 = "android.content.IBulkCursor"
            r0.writeInterfaceToken(r2)
            android.os.IBinder r2 = r5.mRemote
            r3 = 6
            r4 = 0
            r2.transact(r3, r0, r1, r4)
            net.sqlcipher.DatabaseUtils.readExceptionFromParcel(r1)
            r0.recycle()
            r1.recycle()
            return
    }

    @Override // net.sqlcipher.IBulkCursor
    public boolean deleteRow(int r5) throws android.os.RemoteException {
            r4 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            android.os.Parcel r1 = android.os.Parcel.obtain()
            java.lang.String r2 = "android.content.IBulkCursor"
            r0.writeInterfaceToken(r2)
            r0.writeInt(r5)
            android.os.IBinder r5 = r4.mRemote
            r2 = 5
            r3 = 0
            r5.transact(r2, r0, r1, r3)
            net.sqlcipher.DatabaseUtils.readExceptionFromParcel(r1)
            int r5 = r1.readInt()
            r2 = 1
            if (r5 != r2) goto L22
            r3 = 1
        L22:
            r0.recycle()
            r1.recycle()
            return r3
    }

    @Override // net.sqlcipher.IBulkCursor
    public java.lang.String[] getColumnNames() throws android.os.RemoteException {
            r6 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            android.os.Parcel r1 = android.os.Parcel.obtain()
            java.lang.String r2 = "android.content.IBulkCursor"
            r0.writeInterfaceToken(r2)
            android.os.IBinder r2 = r6.mRemote
            r3 = 3
            r4 = 0
            r2.transact(r3, r0, r1, r4)
            net.sqlcipher.DatabaseUtils.readExceptionFromParcel(r1)
            int r2 = r1.readInt()
            java.lang.String[] r3 = new java.lang.String[r2]
        L1d:
            if (r4 >= r2) goto L28
            java.lang.String r5 = r1.readString()
            r3[r4] = r5
            int r4 = r4 + 1
            goto L1d
        L28:
            r0.recycle()
            r1.recycle()
            return r3
    }

    @Override // net.sqlcipher.IBulkCursor
    public android.os.Bundle getExtras() throws android.os.RemoteException {
            r5 = this;
            android.os.Bundle r0 = r5.mExtras
            if (r0 != 0) goto L2e
            android.os.Parcel r0 = android.os.Parcel.obtain()
            android.os.Parcel r1 = android.os.Parcel.obtain()
            java.lang.String r2 = "android.content.IBulkCursor"
            r0.writeInterfaceToken(r2)
            android.os.IBinder r2 = r5.mRemote
            r3 = 10
            r4 = 0
            r2.transact(r3, r0, r1, r4)
            net.sqlcipher.DatabaseUtils.readExceptionFromParcel(r1)
            java.lang.Class<net.sqlcipher.BulkCursorProxy> r2 = net.sqlcipher.BulkCursorProxy.class
            java.lang.ClassLoader r2 = r2.getClassLoader()
            android.os.Bundle r2 = r1.readBundle(r2)
            r5.mExtras = r2
            r0.recycle()
            r1.recycle()
        L2e:
            android.os.Bundle r0 = r5.mExtras
            return r0
    }

    @Override // net.sqlcipher.IBulkCursor
    public boolean getWantsAllOnMoveCalls() throws android.os.RemoteException {
            r5 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            android.os.Parcel r1 = android.os.Parcel.obtain()
            java.lang.String r2 = "android.content.IBulkCursor"
            r0.writeInterfaceToken(r2)
            android.os.IBinder r2 = r5.mRemote
            r3 = 9
            r4 = 0
            r2.transact(r3, r0, r1, r4)
            net.sqlcipher.DatabaseUtils.readExceptionFromParcel(r1)
            int r2 = r1.readInt()
            r0.recycle()
            r1.recycle()
            if (r2 == 0) goto L26
            r0 = 1
            return r0
        L26:
            return r4
    }

    @Override // net.sqlcipher.IBulkCursor
    public net.sqlcipher.CursorWindow getWindow(int r5) throws android.os.RemoteException {
            r4 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            android.os.Parcel r1 = android.os.Parcel.obtain()
            java.lang.String r2 = "android.content.IBulkCursor"
            r0.writeInterfaceToken(r2)
            r0.writeInt(r5)
            android.os.IBinder r5 = r4.mRemote
            r2 = 0
            r3 = 1
            r5.transact(r3, r0, r1, r2)
            net.sqlcipher.DatabaseUtils.readExceptionFromParcel(r1)
            int r5 = r1.readInt()
            if (r5 != r3) goto L25
            net.sqlcipher.CursorWindow r5 = net.sqlcipher.CursorWindow.newFromParcel(r1)
            goto L26
        L25:
            r5 = 0
        L26:
            r0.recycle()
            r1.recycle()
            return r5
    }

    @Override // net.sqlcipher.IBulkCursor
    public void onMove(int r5) throws android.os.RemoteException {
            r4 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            android.os.Parcel r1 = android.os.Parcel.obtain()
            java.lang.String r2 = "android.content.IBulkCursor"
            r0.writeInterfaceToken(r2)
            r0.writeInt(r5)
            android.os.IBinder r5 = r4.mRemote
            r2 = 8
            r3 = 0
            r5.transact(r2, r0, r1, r3)
            net.sqlcipher.DatabaseUtils.readExceptionFromParcel(r1)
            r0.recycle()
            r1.recycle()
            return
    }

    @Override // net.sqlcipher.IBulkCursor
    public int requery(net.sqlcipher.IContentObserver r4, net.sqlcipher.CursorWindow r5) throws android.os.RemoteException {
            r3 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            android.os.Parcel r1 = android.os.Parcel.obtain()
            java.lang.String r2 = "android.content.IBulkCursor"
            r0.writeInterfaceToken(r2)
            r0.writeStrongInterface(r4)
            r4 = 0
            r5.writeToParcel(r0, r4)
            android.os.IBinder r5 = r3.mRemote
            r2 = 7
            boolean r4 = r5.transact(r2, r0, r1, r4)
            net.sqlcipher.DatabaseUtils.readExceptionFromParcel(r1)
            if (r4 != 0) goto L22
            r4 = -1
            goto L32
        L22:
            int r4 = r1.readInt()
            java.lang.Class<net.sqlcipher.BulkCursorProxy> r5 = net.sqlcipher.BulkCursorProxy.class
            java.lang.ClassLoader r5 = r5.getClassLoader()
            android.os.Bundle r5 = r1.readBundle(r5)
            r3.mExtras = r5
        L32:
            r0.recycle()
            r1.recycle()
            return r4
    }

    @Override // net.sqlcipher.IBulkCursor
    public android.os.Bundle respond(android.os.Bundle r5) throws android.os.RemoteException {
            r4 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            android.os.Parcel r1 = android.os.Parcel.obtain()
            java.lang.String r2 = "android.content.IBulkCursor"
            r0.writeInterfaceToken(r2)
            r0.writeBundle(r5)
            android.os.IBinder r5 = r4.mRemote
            r2 = 11
            r3 = 0
            r5.transact(r2, r0, r1, r3)
            net.sqlcipher.DatabaseUtils.readExceptionFromParcel(r1)
            java.lang.Class<net.sqlcipher.BulkCursorProxy> r5 = net.sqlcipher.BulkCursorProxy.class
            java.lang.ClassLoader r5 = r5.getClassLoader()
            android.os.Bundle r5 = r1.readBundle(r5)
            r0.recycle()
            r1.recycle()
            return r5
    }

    @Override // net.sqlcipher.IBulkCursor
    public boolean updateRows(java.util.Map r5) throws android.os.RemoteException {
            r4 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            android.os.Parcel r1 = android.os.Parcel.obtain()
            java.lang.String r2 = "android.content.IBulkCursor"
            r0.writeInterfaceToken(r2)
            r0.writeMap(r5)
            android.os.IBinder r5 = r4.mRemote
            r2 = 4
            r3 = 0
            r5.transact(r2, r0, r1, r3)
            net.sqlcipher.DatabaseUtils.readExceptionFromParcel(r1)
            int r5 = r1.readInt()
            r2 = 1
            if (r5 != r2) goto L22
            r3 = 1
        L22:
            r0.recycle()
            r1.recycle()
            return r3
    }
}
