package com.ss.android.socialbase.downloader.r;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface qv extends android.os.IInterface {

    public static abstract class j extends android.os.Binder implements com.ss.android.socialbase.downloader.r.qv {

        /* renamed from: com.ss.android.socialbase.downloader.r.qv$j$j, reason: collision with other inner class name */
        private static class C0022j implements com.ss.android.socialbase.downloader.r.qv {
            public static com.ss.android.socialbase.downloader.r.qv j;
            private android.os.IBinder xt;

            C0022j(android.os.IBinder r1) {
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

            @Override // com.ss.android.socialbase.downloader.r.qv
            public java.lang.String j() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2c
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2c
                    r3 = 2
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2c
                    if (r2 != 0) goto L2e
                    com.ss.android.socialbase.downloader.r.qv r2 = com.ss.android.socialbase.downloader.r.qv.j.cw()     // Catch: java.lang.Throwable -> L2c
                    if (r2 == 0) goto L2e
                    com.ss.android.socialbase.downloader.r.qv r2 = com.ss.android.socialbase.downloader.r.qv.j.cw()     // Catch: java.lang.Throwable -> L2c
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

            @Override // com.ss.android.socialbase.downloader.r.qv
            public void j(java.lang.String r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2e
                    r0.writeString(r6)     // Catch: java.lang.Throwable -> L2e
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2e
                    r3 = 1
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2e
                    if (r2 != 0) goto L30
                    com.ss.android.socialbase.downloader.r.qv r2 = com.ss.android.socialbase.downloader.r.qv.j.cw()     // Catch: java.lang.Throwable -> L2e
                    if (r2 == 0) goto L30
                    com.ss.android.socialbase.downloader.r.qv r2 = com.ss.android.socialbase.downloader.r.qv.j.cw()     // Catch: java.lang.Throwable -> L2e
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

            @Override // com.ss.android.socialbase.downloader.r.qv
            public int[] xt() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2c
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2c
                    r3 = 3
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2c
                    if (r2 != 0) goto L2e
                    com.ss.android.socialbase.downloader.r.qv r2 = com.ss.android.socialbase.downloader.r.qv.j.cw()     // Catch: java.lang.Throwable -> L2c
                    if (r2 == 0) goto L2e
                    com.ss.android.socialbase.downloader.r.qv r2 = com.ss.android.socialbase.downloader.r.qv.j.cw()     // Catch: java.lang.Throwable -> L2c
                    int[] r2 = r2.xt()     // Catch: java.lang.Throwable -> L2c
                L25:
                    r1.recycle()
                    r0.recycle()
                    return r2
                L2c:
                    r2 = move-exception
                    goto L36
                L2e:
                    r1.readException()     // Catch: java.lang.Throwable -> L2c
                    int[] r2 = r1.createIntArray()     // Catch: java.lang.Throwable -> L2c
                    goto L25
                L36:
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }
        }

        public j() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend"
                r1.attachInterface(r1, r0)
                return
        }

        public static com.ss.android.socialbase.downloader.r.qv cw() {
                com.ss.android.socialbase.downloader.r.qv r0 = com.ss.android.socialbase.downloader.r.qv.j.C0022j.j
                return r0
        }

        public static com.ss.android.socialbase.downloader.r.qv j(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof com.ss.android.socialbase.downloader.r.qv
                if (r1 == 0) goto L13
                com.ss.android.socialbase.downloader.r.qv r0 = (com.ss.android.socialbase.downloader.r.qv) r0
                return r0
            L13:
                com.ss.android.socialbase.downloader.r.qv$j$j r0 = new com.ss.android.socialbase.downloader.r.qv$j$j
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
                java.lang.String r0 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend"
                r1 = 1
                if (r4 == r1) goto L35
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
                int[] r4 = r3.xt()
                r6.writeNoException()
                r6.writeIntArray(r4)
                return r1
            L27:
                r5.enforceInterface(r0)
                java.lang.String r4 = r3.j()
                r6.writeNoException()
                r6.writeString(r4)
                return r1
            L35:
                r5.enforceInterface(r0)
                java.lang.String r4 = r5.readString()
                r3.j(r4)
                r6.writeNoException()
                return r1
        }
    }

    java.lang.String j() throws android.os.RemoteException;

    void j(java.lang.String r1) throws android.os.RemoteException;

    int[] xt() throws android.os.RemoteException;
}
