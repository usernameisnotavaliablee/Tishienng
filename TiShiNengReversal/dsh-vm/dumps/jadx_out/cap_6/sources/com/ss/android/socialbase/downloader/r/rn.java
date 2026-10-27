package com.ss.android.socialbase.downloader.r;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface rn extends android.os.IInterface {

    public static abstract class j extends android.os.Binder implements com.ss.android.socialbase.downloader.r.rn {

        /* renamed from: com.ss.android.socialbase.downloader.r.rn$j$j, reason: collision with other inner class name */
        private static class C0023j implements com.ss.android.socialbase.downloader.r.rn {
            public static com.ss.android.socialbase.downloader.r.rn j;
            private android.os.IBinder xt;

            C0023j(android.os.IBinder r1) {
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

            @Override // com.ss.android.socialbase.downloader.r.rn
            public boolean cw(com.ss.android.socialbase.downloader.ae.cw r7) throws android.os.RemoteException {
                    r6 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L18
                    r2 = 1
                    r3 = 0
                    if (r7 == 0) goto L1a
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L18
                    r7.writeToParcel(r0, r3)     // Catch: java.lang.Throwable -> L18
                    goto L1d
                L18:
                    r7 = move-exception
                    goto L4d
                L1a:
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L18
                L1d:
                    android.os.IBinder r4 = r6.xt     // Catch: java.lang.Throwable -> L18
                    r5 = 3
                    boolean r4 = r4.transact(r5, r0, r1, r3)     // Catch: java.lang.Throwable -> L18
                    if (r4 != 0) goto L3b
                    com.ss.android.socialbase.downloader.r.rn r4 = com.ss.android.socialbase.downloader.r.rn.j.j()     // Catch: java.lang.Throwable -> L18
                    if (r4 == 0) goto L3b
                    com.ss.android.socialbase.downloader.r.rn r2 = com.ss.android.socialbase.downloader.r.rn.j.j()     // Catch: java.lang.Throwable -> L18
                    boolean r7 = r2.cw(r7)     // Catch: java.lang.Throwable -> L18
                    r1.recycle()
                    r0.recycle()
                    return r7
                L3b:
                    r1.readException()     // Catch: java.lang.Throwable -> L18
                    int r7 = r1.readInt()     // Catch: java.lang.Throwable -> L18
                    if (r7 == 0) goto L45
                    goto L46
                L45:
                    r2 = 0
                L46:
                    r1.recycle()
                    r0.recycle()
                    return r2
                L4d:
                    r1.recycle()
                    r0.recycle()
                    throw r7
            }

            @Override // com.ss.android.socialbase.downloader.r.rn
            public boolean j(com.ss.android.socialbase.downloader.ae.cw r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L18
                    r2 = 1
                    r3 = 0
                    if (r6 == 0) goto L1a
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L18
                    r6.writeToParcel(r0, r3)     // Catch: java.lang.Throwable -> L18
                    goto L1d
                L18:
                    r6 = move-exception
                    goto L4c
                L1a:
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L18
                L1d:
                    android.os.IBinder r4 = r5.xt     // Catch: java.lang.Throwable -> L18
                    boolean r4 = r4.transact(r2, r0, r1, r3)     // Catch: java.lang.Throwable -> L18
                    if (r4 != 0) goto L3a
                    com.ss.android.socialbase.downloader.r.rn r4 = com.ss.android.socialbase.downloader.r.rn.j.j()     // Catch: java.lang.Throwable -> L18
                    if (r4 == 0) goto L3a
                    com.ss.android.socialbase.downloader.r.rn r2 = com.ss.android.socialbase.downloader.r.rn.j.j()     // Catch: java.lang.Throwable -> L18
                    boolean r6 = r2.j(r6)     // Catch: java.lang.Throwable -> L18
                    r1.recycle()
                    r0.recycle()
                    return r6
                L3a:
                    r1.readException()     // Catch: java.lang.Throwable -> L18
                    int r6 = r1.readInt()     // Catch: java.lang.Throwable -> L18
                    if (r6 == 0) goto L44
                    goto L45
                L44:
                    r2 = 0
                L45:
                    r1.recycle()
                    r0.recycle()
                    return r2
                L4c:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.r.rn
            public boolean xt(com.ss.android.socialbase.downloader.ae.cw r7) throws android.os.RemoteException {
                    r6 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L18
                    r2 = 1
                    r3 = 0
                    if (r7 == 0) goto L1a
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L18
                    r7.writeToParcel(r0, r3)     // Catch: java.lang.Throwable -> L18
                    goto L1d
                L18:
                    r7 = move-exception
                    goto L4d
                L1a:
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L18
                L1d:
                    android.os.IBinder r4 = r6.xt     // Catch: java.lang.Throwable -> L18
                    r5 = 2
                    boolean r4 = r4.transact(r5, r0, r1, r3)     // Catch: java.lang.Throwable -> L18
                    if (r4 != 0) goto L3b
                    com.ss.android.socialbase.downloader.r.rn r4 = com.ss.android.socialbase.downloader.r.rn.j.j()     // Catch: java.lang.Throwable -> L18
                    if (r4 == 0) goto L3b
                    com.ss.android.socialbase.downloader.r.rn r2 = com.ss.android.socialbase.downloader.r.rn.j.j()     // Catch: java.lang.Throwable -> L18
                    boolean r7 = r2.xt(r7)     // Catch: java.lang.Throwable -> L18
                    r1.recycle()
                    r0.recycle()
                    return r7
                L3b:
                    r1.readException()     // Catch: java.lang.Throwable -> L18
                    int r7 = r1.readInt()     // Catch: java.lang.Throwable -> L18
                    if (r7 == 0) goto L45
                    goto L46
                L45:
                    r2 = 0
                L46:
                    r1.recycle()
                    r0.recycle()
                    return r2
                L4d:
                    r1.recycle()
                    r0.recycle()
                    throw r7
            }
        }

        public j() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback"
                r1.attachInterface(r1, r0)
                return
        }

        public static com.ss.android.socialbase.downloader.r.rn j() {
                com.ss.android.socialbase.downloader.r.rn r0 = com.ss.android.socialbase.downloader.r.rn.j.C0023j.j
                return r0
        }

        public static com.ss.android.socialbase.downloader.r.rn j(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof com.ss.android.socialbase.downloader.r.rn
                if (r1 == 0) goto L13
                com.ss.android.socialbase.downloader.r.rn r0 = (com.ss.android.socialbase.downloader.r.rn) r0
                return r0
            L13:
                com.ss.android.socialbase.downloader.r.rn$j$j r0 = new com.ss.android.socialbase.downloader.r.rn$j$j
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
                r0 = this;
                return r0
        }

        @Override // android.os.Binder
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) throws android.os.RemoteException {
                r4 = this;
                r0 = 0
                java.lang.String r1 = "com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback"
                r2 = 1
                if (r5 == r2) goto L54
                r3 = 2
                if (r5 == r3) goto L37
                r3 = 3
                if (r5 == r3) goto L1a
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r5 == r0) goto L16
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L16:
                r7.writeString(r1)
                return r2
            L1a:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L2c
                android.os.Parcelable$Creator r5 = com.ss.android.socialbase.downloader.ae.cw.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r0 = r5
                com.ss.android.socialbase.downloader.ae.cw r0 = (com.ss.android.socialbase.downloader.ae.cw) r0
            L2c:
                boolean r5 = r4.cw(r0)
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L37:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L49
                android.os.Parcelable$Creator r5 = com.ss.android.socialbase.downloader.ae.cw.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r0 = r5
                com.ss.android.socialbase.downloader.ae.cw r0 = (com.ss.android.socialbase.downloader.ae.cw) r0
            L49:
                boolean r5 = r4.xt(r0)
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L54:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L66
                android.os.Parcelable$Creator r5 = com.ss.android.socialbase.downloader.ae.cw.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r0 = r5
                com.ss.android.socialbase.downloader.ae.cw r0 = (com.ss.android.socialbase.downloader.ae.cw) r0
            L66:
                boolean r5 = r4.j(r0)
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
        }
    }

    boolean cw(com.ss.android.socialbase.downloader.ae.cw r1) throws android.os.RemoteException;

    boolean j(com.ss.android.socialbase.downloader.ae.cw r1) throws android.os.RemoteException;

    boolean xt(com.ss.android.socialbase.downloader.ae.cw r1) throws android.os.RemoteException;
}
