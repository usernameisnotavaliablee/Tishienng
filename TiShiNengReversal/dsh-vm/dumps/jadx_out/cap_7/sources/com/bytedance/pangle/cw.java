package com.bytedance.pangle;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public interface cw extends android.os.IInterface {

    public static abstract class j extends android.os.Binder implements com.bytedance.pangle.cw {

        /* renamed from: com.bytedance.pangle.cw$j$j, reason: collision with other inner class name */
        private static class C0006j implements com.bytedance.pangle.cw {
            public static com.bytedance.pangle.cw j;
            private android.os.IBinder xt;

            C0006j(android.os.IBinder r1) {
                    r0 = this;
                    r0.<init>()
                    r0.xt = r1
                    return
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                    r1 = this;
                    android.os.IBinder r0 = r1.xt
                    return r0
            }

            @Override // com.bytedance.pangle.cw
            public void j(int r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.bytedance.pangle.IPackageManager"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2e
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L2e
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2e
                    r3 = 5
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2e
                    if (r2 != 0) goto L30
                    com.bytedance.pangle.cw r2 = com.bytedance.pangle.cw.j.j()     // Catch: java.lang.Throwable -> L2e
                    if (r2 == 0) goto L30
                    com.bytedance.pangle.cw r2 = com.bytedance.pangle.cw.j.j()     // Catch: java.lang.Throwable -> L2e
                    r2.j(r6)     // Catch: java.lang.Throwable -> L2e
                L27:
                    r1.recycle()
                    r0.recycle()
                    return
                L2e:
                    r6 = move-exception
                    goto L34
                L30:
                    r1.readException()     // Catch: java.lang.Throwable -> L2e
                    goto L27
                L34:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.bytedance.pangle.cw
            public void j(int r6, com.bytedance.pangle.r r7) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.bytedance.pangle.IPackageManager"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L17
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L17
                    if (r7 == 0) goto L19
                    android.os.IBinder r2 = r7.asBinder()     // Catch: java.lang.Throwable -> L17
                    goto L1a
                L17:
                    r6 = move-exception
                    goto L3f
                L19:
                    r2 = 0
                L1a:
                    r0.writeStrongBinder(r2)     // Catch: java.lang.Throwable -> L17
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L17
                    r3 = 4
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L17
                    if (r2 != 0) goto L3b
                    com.bytedance.pangle.cw r2 = com.bytedance.pangle.cw.j.j()     // Catch: java.lang.Throwable -> L17
                    if (r2 == 0) goto L3b
                    com.bytedance.pangle.cw r2 = com.bytedance.pangle.cw.j.j()     // Catch: java.lang.Throwable -> L17
                    r2.j(r6, r7)     // Catch: java.lang.Throwable -> L17
                L34:
                    r1.recycle()
                    r0.recycle()
                    return
                L3b:
                    r1.readException()     // Catch: java.lang.Throwable -> L17
                    goto L34
                L3f:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.bytedance.pangle.cw
            public boolean j(java.lang.String r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.bytedance.pangle.IPackageManager"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2f
                    r0.writeString(r6)     // Catch: java.lang.Throwable -> L2f
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2f
                    r3 = 0
                    r4 = 1
                    boolean r2 = r2.transact(r4, r0, r1, r3)     // Catch: java.lang.Throwable -> L2f
                    if (r2 != 0) goto L31
                    com.bytedance.pangle.cw r2 = com.bytedance.pangle.cw.j.j()     // Catch: java.lang.Throwable -> L2f
                    if (r2 == 0) goto L31
                    com.bytedance.pangle.cw r2 = com.bytedance.pangle.cw.j.j()     // Catch: java.lang.Throwable -> L2f
                    boolean r6 = r2.j(r6)     // Catch: java.lang.Throwable -> L2f
                    r1.recycle()
                    r0.recycle()
                    return r6
                L2f:
                    r6 = move-exception
                    goto L42
                L31:
                    r1.readException()     // Catch: java.lang.Throwable -> L2f
                    int r6 = r1.readInt()     // Catch: java.lang.Throwable -> L2f
                    if (r6 == 0) goto L3b
                    r3 = 1
                L3b:
                    r1.recycle()
                    r0.recycle()
                    return r3
                L42:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.bytedance.pangle.cw
            public boolean j(java.lang.String r6, java.lang.String r7) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.bytedance.pangle.IPackageManager"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L32
                    r0.writeString(r6)     // Catch: java.lang.Throwable -> L32
                    r0.writeString(r7)     // Catch: java.lang.Throwable -> L32
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L32
                    r3 = 3
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L32
                    if (r2 != 0) goto L34
                    com.bytedance.pangle.cw r2 = com.bytedance.pangle.cw.j.j()     // Catch: java.lang.Throwable -> L32
                    if (r2 == 0) goto L34
                    com.bytedance.pangle.cw r2 = com.bytedance.pangle.cw.j.j()     // Catch: java.lang.Throwable -> L32
                    boolean r6 = r2.j(r6, r7)     // Catch: java.lang.Throwable -> L32
                    r1.recycle()
                    r0.recycle()
                    return r6
                L32:
                    r6 = move-exception
                    goto L45
                L34:
                    r1.readException()     // Catch: java.lang.Throwable -> L32
                    int r6 = r1.readInt()     // Catch: java.lang.Throwable -> L32
                    if (r6 == 0) goto L3e
                    r4 = 1
                L3e:
                    r1.recycle()
                    r0.recycle()
                    return r4
                L45:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.bytedance.pangle.cw
            public int xt(java.lang.String r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.bytedance.pangle.IPackageManager"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2f
                    r0.writeString(r6)     // Catch: java.lang.Throwable -> L2f
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2f
                    r3 = 2
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2f
                    if (r2 != 0) goto L31
                    com.bytedance.pangle.cw r2 = com.bytedance.pangle.cw.j.j()     // Catch: java.lang.Throwable -> L2f
                    if (r2 == 0) goto L31
                    com.bytedance.pangle.cw r2 = com.bytedance.pangle.cw.j.j()     // Catch: java.lang.Throwable -> L2f
                    int r6 = r2.xt(r6)     // Catch: java.lang.Throwable -> L2f
                L28:
                    r1.recycle()
                    r0.recycle()
                    return r6
                L2f:
                    r6 = move-exception
                    goto L39
                L31:
                    r1.readException()     // Catch: java.lang.Throwable -> L2f
                    int r6 = r1.readInt()     // Catch: java.lang.Throwable -> L2f
                    goto L28
                L39:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }
        }

        public j() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "com.bytedance.pangle.IPackageManager"
                r1.attachInterface(r1, r0)
                return
        }

        public static com.bytedance.pangle.cw j() {
                com.bytedance.pangle.cw r0 = com.bytedance.pangle.cw.j.C0006j.j
                return r0
        }

        public static com.bytedance.pangle.cw j(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.bytedance.pangle.IPackageManager"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof com.bytedance.pangle.cw
                if (r1 == 0) goto L13
                com.bytedance.pangle.cw r0 = (com.bytedance.pangle.cw) r0
                return r0
            L13:
                com.bytedance.pangle.cw$j$j r0 = new com.bytedance.pangle.cw$j$j
                r0.<init>(r2)
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
                java.lang.String r0 = "com.bytedance.pangle.IPackageManager"
                r1 = 1
                if (r4 == r1) goto L6b
                r2 = 2
                if (r4 == r2) goto L59
                r2 = 3
                if (r4 == r2) goto L43
                r2 = 4
                if (r4 == r2) goto L2d
                r2 = 5
                if (r4 == r2) goto L1f
                r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r4 == r2) goto L1b
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            L1b:
                r6.writeString(r0)
                return r1
            L1f:
                r5.enforceInterface(r0)
                int r4 = r5.readInt()
                r3.j(r4)
                r6.writeNoException()
                return r1
            L2d:
                r5.enforceInterface(r0)
                int r4 = r5.readInt()
                android.os.IBinder r5 = r5.readStrongBinder()
                com.bytedance.pangle.r r5 = com.bytedance.pangle.r.j.j(r5)
                r3.j(r4, r5)
                r6.writeNoException()
                return r1
            L43:
                r5.enforceInterface(r0)
                java.lang.String r4 = r5.readString()
                java.lang.String r5 = r5.readString()
                boolean r4 = r3.j(r4, r5)
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
            L59:
                r5.enforceInterface(r0)
                java.lang.String r4 = r5.readString()
                int r4 = r3.xt(r4)
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
            L6b:
                r5.enforceInterface(r0)
                java.lang.String r4 = r5.readString()
                boolean r4 = r3.j(r4)
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
        }
    }

    void j(int r1) throws android.os.RemoteException;

    void j(int r1, com.bytedance.pangle.r r2) throws android.os.RemoteException;

    boolean j(java.lang.String r1) throws android.os.RemoteException;

    boolean j(java.lang.String r1, java.lang.String r2) throws android.os.RemoteException;

    int xt(java.lang.String r1) throws android.os.RemoteException;
}
