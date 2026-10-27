package com.ss.android.socialbase.downloader.r;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface ae extends android.os.IInterface {

    public static abstract class j extends android.os.Binder implements com.ss.android.socialbase.downloader.r.ae {

        /* renamed from: com.ss.android.socialbase.downloader.r.ae$j$j, reason: collision with other inner class name */
        private static class C0011j implements com.ss.android.socialbase.downloader.r.ae {
            public static com.ss.android.socialbase.downloader.r.ae j;
            private android.os.IBinder xt;

            C0011j(android.os.IBinder r1) {
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

            @Override // com.ss.android.socialbase.downloader.r.ae
            public void j(com.ss.android.socialbase.downloader.ae.cw r6, com.ss.android.socialbase.downloader.up.j r7, int r8) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlDepend"
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
                    if (r7 == 0) goto L26
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L18
                    r7.writeToParcel(r0, r3)     // Catch: java.lang.Throwable -> L18
                    goto L29
                L26:
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L18
                L29:
                    r0.writeInt(r8)     // Catch: java.lang.Throwable -> L18
                    android.os.IBinder r4 = r5.xt     // Catch: java.lang.Throwable -> L18
                    boolean r2 = r4.transact(r2, r0, r1, r3)     // Catch: java.lang.Throwable -> L18
                    if (r2 != 0) goto L48
                    com.ss.android.socialbase.downloader.r.ae r2 = com.ss.android.socialbase.downloader.r.ae.j.j()     // Catch: java.lang.Throwable -> L18
                    if (r2 == 0) goto L48
                    com.ss.android.socialbase.downloader.r.ae r2 = com.ss.android.socialbase.downloader.r.ae.j.j()     // Catch: java.lang.Throwable -> L18
                    r2.j(r6, r7, r8)     // Catch: java.lang.Throwable -> L18
                L41:
                    r1.recycle()
                    r0.recycle()
                    return
                L48:
                    r1.readException()     // Catch: java.lang.Throwable -> L18
                    goto L41
                L4c:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }
        }

        public j() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlDepend"
                r1.attachInterface(r1, r0)
                return
        }

        public static com.ss.android.socialbase.downloader.r.ae j() {
                com.ss.android.socialbase.downloader.r.ae r0 = com.ss.android.socialbase.downloader.r.ae.j.C0011j.j
                return r0
        }

        public static com.ss.android.socialbase.downloader.r.ae j(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlDepend"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof com.ss.android.socialbase.downloader.r.ae
                if (r1 == 0) goto L13
                com.ss.android.socialbase.downloader.r.ae r0 = (com.ss.android.socialbase.downloader.r.ae) r0
                return r0
            L13:
                com.ss.android.socialbase.downloader.r.ae$j$j r0 = new com.ss.android.socialbase.downloader.r.ae$j$j
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
                java.lang.String r0 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlDepend"
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
                int r4 = r5.readInt()
                r7 = 0
                if (r4 == 0) goto L26
                android.os.Parcelable$Creator r4 = com.ss.android.socialbase.downloader.ae.cw.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                com.ss.android.socialbase.downloader.ae.cw r4 = (com.ss.android.socialbase.downloader.ae.cw) r4
                goto L27
            L26:
                r4 = r7
            L27:
                int r0 = r5.readInt()
                if (r0 == 0) goto L35
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.up.j> r7 = com.ss.android.socialbase.downloader.up.j.CREATOR
                java.lang.Object r7 = r7.createFromParcel(r5)
                com.ss.android.socialbase.downloader.up.j r7 = (com.ss.android.socialbase.downloader.up.j) r7
            L35:
                int r5 = r5.readInt()
                r3.j(r4, r7, r5)
                r6.writeNoException()
                return r1
        }
    }

    void j(com.ss.android.socialbase.downloader.ae.cw r1, com.ss.android.socialbase.downloader.up.j r2, int r3) throws android.os.RemoteException;
}
