package com.bytedance.pangle;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public interface up extends android.os.IInterface {

    public static abstract class j extends android.os.Binder implements com.bytedance.pangle.up {

        /* renamed from: com.bytedance.pangle.up$j$j, reason: collision with other inner class name */
        private static class C0015j implements com.bytedance.pangle.up {
            public static com.bytedance.pangle.up j;
            private android.os.IBinder xt;

            C0015j(android.os.IBinder r1) {
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

            @Override // com.bytedance.pangle.up
            public boolean bindService(android.content.Intent r7, com.bytedance.pangle.tl r8, int r9, java.lang.String r10) throws android.os.RemoteException {
                    r6 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.bytedance.pangle.IServiceManager"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L18
                    r2 = 1
                    r3 = 0
                    if (r7 == 0) goto L1a
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L18
                    r7.writeToParcel(r0, r3)     // Catch: java.lang.Throwable -> L18
                    goto L1d
                L18:
                    r7 = move-exception
                    goto L5e
                L1a:
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L18
                L1d:
                    if (r8 == 0) goto L24
                    android.os.IBinder r4 = r8.asBinder()     // Catch: java.lang.Throwable -> L18
                    goto L25
                L24:
                    r4 = 0
                L25:
                    r0.writeStrongBinder(r4)     // Catch: java.lang.Throwable -> L18
                    r0.writeInt(r9)     // Catch: java.lang.Throwable -> L18
                    r0.writeString(r10)     // Catch: java.lang.Throwable -> L18
                    android.os.IBinder r4 = r6.xt     // Catch: java.lang.Throwable -> L18
                    r5 = 3
                    boolean r4 = r4.transact(r5, r0, r1, r3)     // Catch: java.lang.Throwable -> L18
                    if (r4 != 0) goto L4c
                    com.bytedance.pangle.up r4 = com.bytedance.pangle.up.j.j()     // Catch: java.lang.Throwable -> L18
                    if (r4 == 0) goto L4c
                    com.bytedance.pangle.up r2 = com.bytedance.pangle.up.j.j()     // Catch: java.lang.Throwable -> L18
                    boolean r7 = r2.bindService(r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L18
                    r1.recycle()
                    r0.recycle()
                    return r7
                L4c:
                    r1.readException()     // Catch: java.lang.Throwable -> L18
                    int r7 = r1.readInt()     // Catch: java.lang.Throwable -> L18
                    if (r7 == 0) goto L56
                    goto L57
                L56:
                    r2 = 0
                L57:
                    r1.recycle()
                    r0.recycle()
                    return r2
                L5e:
                    r1.recycle()
                    r0.recycle()
                    throw r7
            }

            @Override // com.bytedance.pangle.up
            public android.content.ComponentName startService(android.content.Intent r6, java.lang.String r7) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.bytedance.pangle.IServiceManager"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L18
                    r2 = 1
                    r3 = 0
                    if (r6 == 0) goto L1a
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L18
                    r6.writeToParcel(r0, r3)     // Catch: java.lang.Throwable -> L18
                    goto L1d
                L18:
                    r6 = move-exception
                    goto L51
                L1a:
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L18
                L1d:
                    r0.writeString(r7)     // Catch: java.lang.Throwable -> L18
                    android.os.IBinder r4 = r5.xt     // Catch: java.lang.Throwable -> L18
                    boolean r2 = r4.transact(r2, r0, r1, r3)     // Catch: java.lang.Throwable -> L18
                    if (r2 != 0) goto L3d
                    com.bytedance.pangle.up r2 = com.bytedance.pangle.up.j.j()     // Catch: java.lang.Throwable -> L18
                    if (r2 == 0) goto L3d
                    com.bytedance.pangle.up r2 = com.bytedance.pangle.up.j.j()     // Catch: java.lang.Throwable -> L18
                    android.content.ComponentName r6 = r2.startService(r6, r7)     // Catch: java.lang.Throwable -> L18
                L36:
                    r1.recycle()
                    r0.recycle()
                    return r6
                L3d:
                    r1.readException()     // Catch: java.lang.Throwable -> L18
                    int r6 = r1.readInt()     // Catch: java.lang.Throwable -> L18
                    if (r6 == 0) goto L4f
                    android.os.Parcelable$Creator r6 = android.content.ComponentName.CREATOR     // Catch: java.lang.Throwable -> L18
                    java.lang.Object r6 = r6.createFromParcel(r1)     // Catch: java.lang.Throwable -> L18
                    android.content.ComponentName r6 = (android.content.ComponentName) r6     // Catch: java.lang.Throwable -> L18
                    goto L36
                L4f:
                    r6 = 0
                    goto L36
                L51:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.bytedance.pangle.up
            public boolean stopService(android.content.Intent r7, java.lang.String r8) throws android.os.RemoteException {
                    r6 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.bytedance.pangle.IServiceManager"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L18
                    r2 = 1
                    r3 = 0
                    if (r7 == 0) goto L1a
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L18
                    r7.writeToParcel(r0, r3)     // Catch: java.lang.Throwable -> L18
                    goto L1d
                L18:
                    r7 = move-exception
                    goto L50
                L1a:
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L18
                L1d:
                    r0.writeString(r8)     // Catch: java.lang.Throwable -> L18
                    android.os.IBinder r4 = r6.xt     // Catch: java.lang.Throwable -> L18
                    r5 = 2
                    boolean r4 = r4.transact(r5, r0, r1, r3)     // Catch: java.lang.Throwable -> L18
                    if (r4 != 0) goto L3e
                    com.bytedance.pangle.up r4 = com.bytedance.pangle.up.j.j()     // Catch: java.lang.Throwable -> L18
                    if (r4 == 0) goto L3e
                    com.bytedance.pangle.up r2 = com.bytedance.pangle.up.j.j()     // Catch: java.lang.Throwable -> L18
                    boolean r7 = r2.stopService(r7, r8)     // Catch: java.lang.Throwable -> L18
                    r1.recycle()
                    r0.recycle()
                    return r7
                L3e:
                    r1.readException()     // Catch: java.lang.Throwable -> L18
                    int r7 = r1.readInt()     // Catch: java.lang.Throwable -> L18
                    if (r7 == 0) goto L48
                    goto L49
                L48:
                    r2 = 0
                L49:
                    r1.recycle()
                    r0.recycle()
                    return r2
                L50:
                    r1.recycle()
                    r0.recycle()
                    throw r7
            }

            @Override // com.bytedance.pangle.up
            public void unbindService(com.bytedance.pangle.tl r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.bytedance.pangle.IServiceManager"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L14
                    if (r6 == 0) goto L16
                    android.os.IBinder r2 = r6.asBinder()     // Catch: java.lang.Throwable -> L14
                    goto L17
                L14:
                    r6 = move-exception
                    goto L3c
                L16:
                    r2 = 0
                L17:
                    r0.writeStrongBinder(r2)     // Catch: java.lang.Throwable -> L14
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L14
                    r3 = 4
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L14
                    if (r2 != 0) goto L38
                    com.bytedance.pangle.up r2 = com.bytedance.pangle.up.j.j()     // Catch: java.lang.Throwable -> L14
                    if (r2 == 0) goto L38
                    com.bytedance.pangle.up r2 = com.bytedance.pangle.up.j.j()     // Catch: java.lang.Throwable -> L14
                    r2.unbindService(r6)     // Catch: java.lang.Throwable -> L14
                L31:
                    r1.recycle()
                    r0.recycle()
                    return
                L38:
                    r1.readException()     // Catch: java.lang.Throwable -> L14
                    goto L31
                L3c:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }
        }

        public j() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "com.bytedance.pangle.IServiceManager"
                r1.attachInterface(r1, r0)
                return
        }

        public static com.bytedance.pangle.up j() {
                com.bytedance.pangle.up r0 = com.bytedance.pangle.up.j.C0015j.j
                return r0
        }

        public static com.bytedance.pangle.up j(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.bytedance.pangle.IServiceManager"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof com.bytedance.pangle.up
                if (r1 == 0) goto L13
                com.bytedance.pangle.up r0 = (com.bytedance.pangle.up) r0
                return r0
            L13:
                com.bytedance.pangle.up$j$j r0 = new com.bytedance.pangle.up$j$j
                r0.<init>(r2)
                return r0
        }

        public android.os.IBinder asBinder() {
                r0 = this;
                return r0
        }

        @Override // android.os.Binder
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) throws android.os.RemoteException {
                r4 = this;
                r0 = 0
                java.lang.String r1 = "com.bytedance.pangle.IServiceManager"
                r2 = 1
                if (r5 == r2) goto L7d
                r3 = 2
                if (r5 == r3) goto L5c
                r3 = 3
                if (r5 == r3) goto L2f
                r0 = 4
                if (r5 == r0) goto L1d
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r5 == r0) goto L19
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L19:
                r7.writeString(r1)
                return r2
            L1d:
                r6.enforceInterface(r1)
                android.os.IBinder r5 = r6.readStrongBinder()
                com.bytedance.pangle.tl r5 = com.bytedance.pangle.tl.j.j(r5)
                r4.unbindService(r5)
                r7.writeNoException()
                return r2
            L2f:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L41
                android.os.Parcelable$Creator r5 = android.content.Intent.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r0 = r5
                android.content.Intent r0 = (android.content.Intent) r0
            L41:
                android.os.IBinder r5 = r6.readStrongBinder()
                com.bytedance.pangle.tl r5 = com.bytedance.pangle.tl.j.j(r5)
                int r8 = r6.readInt()
                java.lang.String r6 = r6.readString()
                boolean r5 = r4.bindService(r0, r5, r8, r6)
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L5c:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L6e
                android.os.Parcelable$Creator r5 = android.content.Intent.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r0 = r5
                android.content.Intent r0 = (android.content.Intent) r0
            L6e:
                java.lang.String r5 = r6.readString()
                boolean r5 = r4.stopService(r0, r5)
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L7d:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L8f
                android.os.Parcelable$Creator r5 = android.content.Intent.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r0 = r5
                android.content.Intent r0 = (android.content.Intent) r0
            L8f:
                java.lang.String r5 = r6.readString()
                android.content.ComponentName r5 = r4.startService(r0, r5)
                r7.writeNoException()
                if (r5 == 0) goto La3
                r7.writeInt(r2)
                r5.writeToParcel(r7, r2)
                goto La7
            La3:
                r5 = 0
                r7.writeInt(r5)
            La7:
                return r2
        }
    }

    boolean bindService(android.content.Intent r1, com.bytedance.pangle.tl r2, int r3, java.lang.String r4) throws android.os.RemoteException;

    android.content.ComponentName startService(android.content.Intent r1, java.lang.String r2) throws android.os.RemoteException;

    boolean stopService(android.content.Intent r1, java.lang.String r2) throws android.os.RemoteException;

    void unbindService(com.bytedance.pangle.tl r1) throws android.os.RemoteException;
}
