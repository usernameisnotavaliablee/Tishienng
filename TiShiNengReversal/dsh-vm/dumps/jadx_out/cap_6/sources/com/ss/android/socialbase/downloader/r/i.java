package com.ss.android.socialbase.downloader.r;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface i extends android.os.IInterface {

    public static abstract class j extends android.os.Binder implements com.ss.android.socialbase.downloader.r.i {

        /* renamed from: com.ss.android.socialbase.downloader.r.i$j$j, reason: collision with other inner class name */
        private static class C0017j implements com.ss.android.socialbase.downloader.r.i {
            public static com.ss.android.socialbase.downloader.r.i j;
            private android.os.IBinder xt;

            C0017j(android.os.IBinder r1) {
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

            @Override // com.ss.android.socialbase.downloader.r.i
            public boolean j(long r10, long r12, com.ss.android.socialbase.downloader.r.av r14) throws android.os.RemoteException {
                    r9 = this;
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    android.os.Parcel r2 = android.os.Parcel.obtain()
                    java.lang.String r0 = "com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler"
                    r1.writeInterfaceToken(r0)     // Catch: java.lang.Throwable -> L1a
                    r1.writeLong(r10)     // Catch: java.lang.Throwable -> L1a
                    r1.writeLong(r12)     // Catch: java.lang.Throwable -> L1a
                    if (r14 == 0) goto L1c
                    android.os.IBinder r0 = r14.asBinder()     // Catch: java.lang.Throwable -> L1a
                    goto L1d
                L1a:
                    r0 = move-exception
                    goto L53
                L1c:
                    r0 = 0
                L1d:
                    r1.writeStrongBinder(r0)     // Catch: java.lang.Throwable -> L1a
                    android.os.IBinder r0 = r9.xt     // Catch: java.lang.Throwable -> L1a
                    r3 = 0
                    r8 = 1
                    boolean r0 = r0.transact(r8, r1, r2, r3)     // Catch: java.lang.Throwable -> L1a
                    if (r0 != 0) goto L42
                    com.ss.android.socialbase.downloader.r.i r0 = com.ss.android.socialbase.downloader.r.i.j.j()     // Catch: java.lang.Throwable -> L1a
                    if (r0 == 0) goto L42
                    com.ss.android.socialbase.downloader.r.i r3 = com.ss.android.socialbase.downloader.r.i.j.j()     // Catch: java.lang.Throwable -> L1a
                    r4 = r10
                    r6 = r12
                    r8 = r14
                    boolean r0 = r3.j(r4, r6, r8)     // Catch: java.lang.Throwable -> L1a
                    r2.recycle()
                    r1.recycle()
                    return r0
                L42:
                    r2.readException()     // Catch: java.lang.Throwable -> L1a
                    int r0 = r2.readInt()     // Catch: java.lang.Throwable -> L1a
                    if (r0 == 0) goto L4c
                    r3 = 1
                L4c:
                    r2.recycle()
                    r1.recycle()
                    return r3
                L53:
                    r2.recycle()
                    r1.recycle()
                    throw r0
            }
        }

        public j() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler"
                r1.attachInterface(r1, r0)
                return
        }

        public static com.ss.android.socialbase.downloader.r.i j() {
                com.ss.android.socialbase.downloader.r.i r0 = com.ss.android.socialbase.downloader.r.i.j.C0017j.j
                return r0
        }

        public static com.ss.android.socialbase.downloader.r.i j(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof com.ss.android.socialbase.downloader.r.i
                if (r1 == 0) goto L13
                com.ss.android.socialbase.downloader.r.i r0 = (com.ss.android.socialbase.downloader.r.i) r0
                return r0
            L13:
                com.ss.android.socialbase.downloader.r.i$j$j r0 = new com.ss.android.socialbase.downloader.r.i$j$j
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
                r0 = this;
                return r0
        }

        @Override // android.os.Binder
        public boolean onTransact(int r9, android.os.Parcel r10, android.os.Parcel r11, int r12) throws android.os.RemoteException {
                r8 = this;
                java.lang.String r0 = "com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler"
                r1 = 1
                if (r9 == r1) goto L13
                r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r9 == r2) goto Lf
                boolean r9 = super.onTransact(r9, r10, r11, r12)
                return r9
            Lf:
                r11.writeString(r0)
                return r1
            L13:
                r10.enforceInterface(r0)
                long r3 = r10.readLong()
                long r5 = r10.readLong()
                android.os.IBinder r9 = r10.readStrongBinder()
                com.ss.android.socialbase.downloader.r.av r7 = com.ss.android.socialbase.downloader.r.av.j.j(r9)
                r2 = r8
                boolean r9 = r2.j(r3, r5, r7)
                r11.writeNoException()
                r11.writeInt(r9)
                return r1
        }
    }

    boolean j(long r1, long r3, com.ss.android.socialbase.downloader.r.av r5) throws android.os.RemoteException;
}
