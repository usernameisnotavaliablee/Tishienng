package com.ss.android.socialbase.downloader.r;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface v extends android.os.IInterface {

    public static abstract class j extends android.os.Binder implements com.ss.android.socialbase.downloader.r.v {

        /* renamed from: com.ss.android.socialbase.downloader.r.v$j$j, reason: collision with other inner class name */
        private static class C0025j implements com.ss.android.socialbase.downloader.r.v {
            public static com.ss.android.socialbase.downloader.r.v j;
            private android.os.IBinder xt;

            C0025j(android.os.IBinder r1) {
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

            @Override // com.ss.android.socialbase.downloader.r.v
            public boolean j(com.ss.android.socialbase.downloader.r.f r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L14
                    if (r6 == 0) goto L16
                    android.os.IBinder r2 = r6.asBinder()     // Catch: java.lang.Throwable -> L14
                    goto L17
                L14:
                    r6 = move-exception
                    goto L4a
                L16:
                    r2 = 0
                L17:
                    r0.writeStrongBinder(r2)     // Catch: java.lang.Throwable -> L14
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L14
                    r3 = 0
                    r4 = 1
                    boolean r2 = r2.transact(r4, r0, r1, r3)     // Catch: java.lang.Throwable -> L14
                    if (r2 != 0) goto L39
                    com.ss.android.socialbase.downloader.r.v r2 = com.ss.android.socialbase.downloader.r.v.j.j()     // Catch: java.lang.Throwable -> L14
                    if (r2 == 0) goto L39
                    com.ss.android.socialbase.downloader.r.v r2 = com.ss.android.socialbase.downloader.r.v.j.j()     // Catch: java.lang.Throwable -> L14
                    boolean r6 = r2.j(r6)     // Catch: java.lang.Throwable -> L14
                    r1.recycle()
                    r0.recycle()
                    return r6
                L39:
                    r1.readException()     // Catch: java.lang.Throwable -> L14
                    int r6 = r1.readInt()     // Catch: java.lang.Throwable -> L14
                    if (r6 == 0) goto L43
                    r3 = 1
                L43:
                    r1.recycle()
                    r0.recycle()
                    return r3
                L4a:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }
        }

        public j() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler"
                r1.attachInterface(r1, r0)
                return
        }

        public static com.ss.android.socialbase.downloader.r.v j() {
                com.ss.android.socialbase.downloader.r.v r0 = com.ss.android.socialbase.downloader.r.v.j.C0025j.j
                return r0
        }

        public static com.ss.android.socialbase.downloader.r.v j(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof com.ss.android.socialbase.downloader.r.v
                if (r1 == 0) goto L13
                com.ss.android.socialbase.downloader.r.v r0 = (com.ss.android.socialbase.downloader.r.v) r0
                return r0
            L13:
                com.ss.android.socialbase.downloader.r.v$j$j r0 = new com.ss.android.socialbase.downloader.r.v$j$j
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
                java.lang.String r0 = "com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler"
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
                android.os.IBinder r4 = r5.readStrongBinder()
                com.ss.android.socialbase.downloader.r.f r4 = com.ss.android.socialbase.downloader.r.f.j.j(r4)
                boolean r4 = r3.j(r4)
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
        }
    }

    boolean j(com.ss.android.socialbase.downloader.r.f r1) throws android.os.RemoteException;
}
