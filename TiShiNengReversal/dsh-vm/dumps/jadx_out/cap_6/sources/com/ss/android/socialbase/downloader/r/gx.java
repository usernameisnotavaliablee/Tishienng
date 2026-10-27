package com.ss.android.socialbase.downloader.r;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface gx extends android.os.IInterface {

    public static abstract class j extends android.os.Binder implements com.ss.android.socialbase.downloader.r.gx {

        /* renamed from: com.ss.android.socialbase.downloader.r.gx$j$j, reason: collision with other inner class name */
        private static class C0016j implements com.ss.android.socialbase.downloader.r.gx {
            public static com.ss.android.socialbase.downloader.r.gx j;
            private android.os.IBinder xt;

            C0016j(android.os.IBinder r1) {
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

            @Override // com.ss.android.socialbase.downloader.r.gx
            public void j(int r6, int r7) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.depend.ProcessAidlCallback"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L31
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L31
                    r0.writeInt(r7)     // Catch: java.lang.Throwable -> L31
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L31
                    r3 = 1
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L31
                    if (r2 != 0) goto L33
                    com.ss.android.socialbase.downloader.r.gx r2 = com.ss.android.socialbase.downloader.r.gx.j.j()     // Catch: java.lang.Throwable -> L31
                    if (r2 == 0) goto L33
                    com.ss.android.socialbase.downloader.r.gx r2 = com.ss.android.socialbase.downloader.r.gx.j.j()     // Catch: java.lang.Throwable -> L31
                    r2.j(r6, r7)     // Catch: java.lang.Throwable -> L31
                L2a:
                    r1.recycle()
                    r0.recycle()
                    return
                L31:
                    r6 = move-exception
                    goto L37
                L33:
                    r1.readException()     // Catch: java.lang.Throwable -> L31
                    goto L2a
                L37:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }
        }

        public j() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "com.ss.android.socialbase.downloader.depend.ProcessAidlCallback"
                r1.attachInterface(r1, r0)
                return
        }

        public static com.ss.android.socialbase.downloader.r.gx j() {
                com.ss.android.socialbase.downloader.r.gx r0 = com.ss.android.socialbase.downloader.r.gx.j.C0016j.j
                return r0
        }

        public static com.ss.android.socialbase.downloader.r.gx j(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.ss.android.socialbase.downloader.depend.ProcessAidlCallback"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof com.ss.android.socialbase.downloader.r.gx
                if (r1 == 0) goto L13
                com.ss.android.socialbase.downloader.r.gx r0 = (com.ss.android.socialbase.downloader.r.gx) r0
                return r0
            L13:
                com.ss.android.socialbase.downloader.r.gx$j$j r0 = new com.ss.android.socialbase.downloader.r.gx$j$j
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
                java.lang.String r0 = "com.ss.android.socialbase.downloader.depend.ProcessAidlCallback"
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
                int r5 = r5.readInt()
                r3.j(r4, r5)
                r6.writeNoException()
                return r1
        }
    }

    void j(int r1, int r2) throws android.os.RemoteException;
}
