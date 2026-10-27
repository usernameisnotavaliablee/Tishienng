package com.ss.android.socialbase.downloader.r;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface tl extends android.os.IInterface {

    public static abstract class j extends android.os.Binder implements com.ss.android.socialbase.downloader.r.tl {

        /* renamed from: com.ss.android.socialbase.downloader.r.tl$j$j, reason: collision with other inner class name */
        private static class C0024j implements com.ss.android.socialbase.downloader.r.tl {
            public static com.ss.android.socialbase.downloader.r.tl j;
            private android.os.IBinder xt;

            C0024j(android.os.IBinder r1) {
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

            @Override // com.ss.android.socialbase.downloader.r.tl
            public android.net.Uri j(java.lang.String r6, java.lang.String r7) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L32
                    r0.writeString(r6)     // Catch: java.lang.Throwable -> L32
                    r0.writeString(r7)     // Catch: java.lang.Throwable -> L32
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L32
                    r3 = 1
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L32
                    if (r2 != 0) goto L34
                    com.ss.android.socialbase.downloader.r.tl r2 = com.ss.android.socialbase.downloader.r.tl.j.j()     // Catch: java.lang.Throwable -> L32
                    if (r2 == 0) goto L34
                    com.ss.android.socialbase.downloader.r.tl r2 = com.ss.android.socialbase.downloader.r.tl.j.j()     // Catch: java.lang.Throwable -> L32
                    android.net.Uri r6 = r2.j(r6, r7)     // Catch: java.lang.Throwable -> L32
                L2b:
                    r1.recycle()
                    r0.recycle()
                    return r6
                L32:
                    r6 = move-exception
                    goto L48
                L34:
                    r1.readException()     // Catch: java.lang.Throwable -> L32
                    int r6 = r1.readInt()     // Catch: java.lang.Throwable -> L32
                    if (r6 == 0) goto L46
                    android.os.Parcelable$Creator r6 = android.net.Uri.CREATOR     // Catch: java.lang.Throwable -> L32
                    java.lang.Object r6 = r6.createFromParcel(r1)     // Catch: java.lang.Throwable -> L32
                    android.net.Uri r6 = (android.net.Uri) r6     // Catch: java.lang.Throwable -> L32
                    goto L2b
                L46:
                    r6 = 0
                    goto L2b
                L48:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }
        }

        public j() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider"
                r1.attachInterface(r1, r0)
                return
        }

        public static com.ss.android.socialbase.downloader.r.tl j() {
                com.ss.android.socialbase.downloader.r.tl r0 = com.ss.android.socialbase.downloader.r.tl.j.C0024j.j
                return r0
        }

        public static com.ss.android.socialbase.downloader.r.tl j(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof com.ss.android.socialbase.downloader.r.tl
                if (r1 == 0) goto L13
                com.ss.android.socialbase.downloader.r.tl r0 = (com.ss.android.socialbase.downloader.r.tl) r0
                return r0
            L13:
                com.ss.android.socialbase.downloader.r.tl$j$j r0 = new com.ss.android.socialbase.downloader.r.tl$j$j
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
                java.lang.String r0 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider"
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
                java.lang.String r4 = r5.readString()
                java.lang.String r5 = r5.readString()
                android.net.Uri r4 = r3.j(r4, r5)
                r6.writeNoException()
                if (r4 == 0) goto L2e
                r6.writeInt(r1)
                r4.writeToParcel(r6, r1)
                goto L32
            L2e:
                r4 = 0
                r6.writeInt(r4)
            L32:
                return r1
        }
    }

    android.net.Uri j(java.lang.String r1, java.lang.String r2) throws android.os.RemoteException;
}
