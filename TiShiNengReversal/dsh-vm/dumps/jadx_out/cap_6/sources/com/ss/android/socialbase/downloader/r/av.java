package com.ss.android.socialbase.downloader.r;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface av extends android.os.IInterface {

    public static abstract class j extends android.os.Binder implements com.ss.android.socialbase.downloader.r.av {

        /* renamed from: com.ss.android.socialbase.downloader.r.av$j$j, reason: collision with other inner class name */
        private static class C0012j implements com.ss.android.socialbase.downloader.r.av {
            public static com.ss.android.socialbase.downloader.r.av j;
            private android.os.IBinder xt;

            C0012j(android.os.IBinder r1) {
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

            @Override // com.ss.android.socialbase.downloader.r.av
            public void j() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlCallback"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2b
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2b
                    r3 = 1
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2b
                    if (r2 != 0) goto L2d
                    com.ss.android.socialbase.downloader.r.av r2 = com.ss.android.socialbase.downloader.r.av.j.xt()     // Catch: java.lang.Throwable -> L2b
                    if (r2 == 0) goto L2d
                    com.ss.android.socialbase.downloader.r.av r2 = com.ss.android.socialbase.downloader.r.av.j.xt()     // Catch: java.lang.Throwable -> L2b
                    r2.j()     // Catch: java.lang.Throwable -> L2b
                L24:
                    r1.recycle()
                    r0.recycle()
                    return
                L2b:
                    r2 = move-exception
                    goto L31
                L2d:
                    r1.readException()     // Catch: java.lang.Throwable -> L2b
                    goto L24
                L31:
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }
        }

        public j() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlCallback"
                r1.attachInterface(r1, r0)
                return
        }

        public static com.ss.android.socialbase.downloader.r.av j(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlCallback"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof com.ss.android.socialbase.downloader.r.av
                if (r1 == 0) goto L13
                com.ss.android.socialbase.downloader.r.av r0 = (com.ss.android.socialbase.downloader.r.av) r0
                return r0
            L13:
                com.ss.android.socialbase.downloader.r.av$j$j r0 = new com.ss.android.socialbase.downloader.r.av$j$j
                r0.<init>(r2)
                return r0
        }

        public static com.ss.android.socialbase.downloader.r.av xt() {
                com.ss.android.socialbase.downloader.r.av r0 = com.ss.android.socialbase.downloader.r.av.j.C0012j.j
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
                java.lang.String r0 = "com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlCallback"
                r1 = 1
                if (r4 == r1) goto L13
                r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r4 == r2) goto Lf
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            Lf:
                r6.writeString(r0)
                return r1
            L13:
                r5.enforceInterface(r0)
                r3.j()
                r6.writeNoException()
                return r1
        }
    }

    void j() throws android.os.RemoteException;
}
