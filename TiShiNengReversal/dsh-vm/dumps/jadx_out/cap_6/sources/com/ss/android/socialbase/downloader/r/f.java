package com.ss.android.socialbase.downloader.r;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface f extends android.os.IInterface {

    public static abstract class j extends android.os.Binder implements com.ss.android.socialbase.downloader.r.f {

        /* renamed from: com.ss.android.socialbase.downloader.r.f$j$j, reason: collision with other inner class name */
        private static class C0014j implements com.ss.android.socialbase.downloader.r.f {
            public static com.ss.android.socialbase.downloader.r.f j;
            private android.os.IBinder xt;

            C0014j(android.os.IBinder r1) {
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

            @Override // com.ss.android.socialbase.downloader.r.f
            public void j(java.util.List<java.lang.String> r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlCallback"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2e
                    r0.writeStringList(r6)     // Catch: java.lang.Throwable -> L2e
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2e
                    r3 = 1
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2e
                    if (r2 != 0) goto L30
                    com.ss.android.socialbase.downloader.r.f r2 = com.ss.android.socialbase.downloader.r.f.j.xt()     // Catch: java.lang.Throwable -> L2e
                    if (r2 == 0) goto L30
                    com.ss.android.socialbase.downloader.r.f r2 = com.ss.android.socialbase.downloader.r.f.j.xt()     // Catch: java.lang.Throwable -> L2e
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

            @Override // com.ss.android.socialbase.downloader.r.f
            public boolean j() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlCallback"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2c
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2c
                    r3 = 2
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2c
                    if (r2 != 0) goto L2e
                    com.ss.android.socialbase.downloader.r.f r2 = com.ss.android.socialbase.downloader.r.f.j.xt()     // Catch: java.lang.Throwable -> L2c
                    if (r2 == 0) goto L2e
                    com.ss.android.socialbase.downloader.r.f r2 = com.ss.android.socialbase.downloader.r.f.j.xt()     // Catch: java.lang.Throwable -> L2c
                    boolean r2 = r2.j()     // Catch: java.lang.Throwable -> L2c
                    r1.recycle()
                    r0.recycle()
                    return r2
                L2c:
                    r2 = move-exception
                    goto L3f
                L2e:
                    r1.readException()     // Catch: java.lang.Throwable -> L2c
                    int r2 = r1.readInt()     // Catch: java.lang.Throwable -> L2c
                    if (r2 == 0) goto L38
                    r4 = 1
                L38:
                    r1.recycle()
                    r0.recycle()
                    return r4
                L3f:
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }
        }

        public j() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlCallback"
                r1.attachInterface(r1, r0)
                return
        }

        public static com.ss.android.socialbase.downloader.r.f j(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlCallback"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof com.ss.android.socialbase.downloader.r.f
                if (r1 == 0) goto L13
                com.ss.android.socialbase.downloader.r.f r0 = (com.ss.android.socialbase.downloader.r.f) r0
                return r0
            L13:
                com.ss.android.socialbase.downloader.r.f$j$j r0 = new com.ss.android.socialbase.downloader.r.f$j$j
                r0.<init>(r2)
                return r0
        }

        public static com.ss.android.socialbase.downloader.r.f xt() {
                com.ss.android.socialbase.downloader.r.f r0 = com.ss.android.socialbase.downloader.r.f.j.C0014j.j
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
                java.lang.String r0 = "com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlCallback"
                r1 = 1
                if (r4 == r1) goto L24
                r2 = 2
                if (r4 == r2) goto L16
                r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r4 == r2) goto L12
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            L12:
                r6.writeString(r0)
                return r1
            L16:
                r5.enforceInterface(r0)
                boolean r4 = r3.j()
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
            L24:
                r5.enforceInterface(r0)
                java.util.ArrayList r4 = r5.createStringArrayList()
                r3.j(r4)
                r6.writeNoException()
                return r1
        }
    }

    void j(java.util.List<java.lang.String> r1) throws android.os.RemoteException;

    boolean j() throws android.os.RemoteException;
}
