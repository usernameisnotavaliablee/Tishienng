package com.ss.android.socialbase.downloader.r;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface p extends android.os.IInterface {

    public static abstract class j extends android.os.Binder implements com.ss.android.socialbase.downloader.r.p {

        /* renamed from: com.ss.android.socialbase.downloader.r.p$j$j, reason: collision with other inner class name */
        private static class C0021j implements com.ss.android.socialbase.downloader.r.p {
            public static com.ss.android.socialbase.downloader.r.p j;
            private android.os.IBinder xt;

            C0021j(android.os.IBinder r1) {
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

            @Override // com.ss.android.socialbase.downloader.r.p
            public java.lang.String j() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2c
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2c
                    r3 = 3
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2c
                    if (r2 != 0) goto L2e
                    com.ss.android.socialbase.downloader.r.p r2 = com.ss.android.socialbase.downloader.r.p.j.xt()     // Catch: java.lang.Throwable -> L2c
                    if (r2 == 0) goto L2e
                    com.ss.android.socialbase.downloader.r.p r2 = com.ss.android.socialbase.downloader.r.p.j.xt()     // Catch: java.lang.Throwable -> L2c
                    java.lang.String r2 = r2.j()     // Catch: java.lang.Throwable -> L2c
                L25:
                    r1.recycle()
                    r0.recycle()
                    return r2
                L2c:
                    r2 = move-exception
                    goto L36
                L2e:
                    r1.readException()     // Catch: java.lang.Throwable -> L2c
                    java.lang.String r2 = r1.readString()     // Catch: java.lang.Throwable -> L2c
                    goto L25
                L36:
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // com.ss.android.socialbase.downloader.r.p
            public void j(int r6, com.ss.android.socialbase.downloader.ae.cw r7, java.lang.String r8, java.lang.String r9) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L1b
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L1b
                    r2 = 1
                    r3 = 0
                    if (r7 == 0) goto L1d
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L1b
                    r7.writeToParcel(r0, r3)     // Catch: java.lang.Throwable -> L1b
                    goto L20
                L1b:
                    r6 = move-exception
                    goto L46
                L1d:
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L1b
                L20:
                    r0.writeString(r8)     // Catch: java.lang.Throwable -> L1b
                    r0.writeString(r9)     // Catch: java.lang.Throwable -> L1b
                    android.os.IBinder r4 = r5.xt     // Catch: java.lang.Throwable -> L1b
                    boolean r2 = r4.transact(r2, r0, r1, r3)     // Catch: java.lang.Throwable -> L1b
                    if (r2 != 0) goto L42
                    com.ss.android.socialbase.downloader.r.p r2 = com.ss.android.socialbase.downloader.r.p.j.xt()     // Catch: java.lang.Throwable -> L1b
                    if (r2 == 0) goto L42
                    com.ss.android.socialbase.downloader.r.p r2 = com.ss.android.socialbase.downloader.r.p.j.xt()     // Catch: java.lang.Throwable -> L1b
                    r2.j(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L1b
                L3b:
                    r1.recycle()
                    r0.recycle()
                    return
                L42:
                    r1.readException()     // Catch: java.lang.Throwable -> L1b
                    goto L3b
                L46:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.r.p
            public boolean j(boolean r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2f
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L2f
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2f
                    r3 = 2
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2f
                    if (r2 != 0) goto L31
                    com.ss.android.socialbase.downloader.r.p r2 = com.ss.android.socialbase.downloader.r.p.j.xt()     // Catch: java.lang.Throwable -> L2f
                    if (r2 == 0) goto L31
                    com.ss.android.socialbase.downloader.r.p r2 = com.ss.android.socialbase.downloader.r.p.j.xt()     // Catch: java.lang.Throwable -> L2f
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
                    r4 = 1
                L3b:
                    r1.recycle()
                    r0.recycle()
                    return r4
                L42:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }
        }

        public j() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener"
                r1.attachInterface(r1, r0)
                return
        }

        public static com.ss.android.socialbase.downloader.r.p j(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof com.ss.android.socialbase.downloader.r.p
                if (r1 == 0) goto L13
                com.ss.android.socialbase.downloader.r.p r0 = (com.ss.android.socialbase.downloader.r.p) r0
                return r0
            L13:
                com.ss.android.socialbase.downloader.r.p$j$j r0 = new com.ss.android.socialbase.downloader.r.p$j$j
                r0.<init>(r2)
                return r0
        }

        public static com.ss.android.socialbase.downloader.r.p xt() {
                com.ss.android.socialbase.downloader.r.p r0 = com.ss.android.socialbase.downloader.r.p.j.C0021j.j
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
                java.lang.String r0 = "com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener"
                r1 = 1
                if (r4 == r1) goto L3e
                r2 = 2
                if (r4 == r2) goto L27
                r2 = 3
                if (r4 == r2) goto L19
                r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r4 == r2) goto L15
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            L15:
                r6.writeString(r0)
                return r1
            L19:
                r5.enforceInterface(r0)
                java.lang.String r4 = r3.j()
                r6.writeNoException()
                r6.writeString(r4)
                return r1
            L27:
                r5.enforceInterface(r0)
                int r4 = r5.readInt()
                if (r4 == 0) goto L32
                r4 = 1
                goto L33
            L32:
                r4 = 0
            L33:
                boolean r4 = r3.j(r4)
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
            L3e:
                r5.enforceInterface(r0)
                int r4 = r5.readInt()
                int r7 = r5.readInt()
                if (r7 == 0) goto L54
                android.os.Parcelable$Creator r7 = com.ss.android.socialbase.downloader.ae.cw.CREATOR
                java.lang.Object r7 = r7.createFromParcel(r5)
                com.ss.android.socialbase.downloader.ae.cw r7 = (com.ss.android.socialbase.downloader.ae.cw) r7
                goto L55
            L54:
                r7 = 0
            L55:
                java.lang.String r0 = r5.readString()
                java.lang.String r5 = r5.readString()
                r3.j(r4, r7, r0, r5)
                r6.writeNoException()
                return r1
        }
    }

    java.lang.String j() throws android.os.RemoteException;

    void j(int r1, com.ss.android.socialbase.downloader.ae.cw r2, java.lang.String r3, java.lang.String r4) throws android.os.RemoteException;

    boolean j(boolean r1) throws android.os.RemoteException;
}
