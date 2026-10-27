package com.ss.android.socialbase.downloader.r;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface ed extends android.os.IInterface {

    public static abstract class j extends android.os.Binder implements com.ss.android.socialbase.downloader.r.ed {

        /* renamed from: com.ss.android.socialbase.downloader.r.ed$j$j, reason: collision with other inner class name */
        private static class C0013j implements com.ss.android.socialbase.downloader.r.ed {
            public static com.ss.android.socialbase.downloader.r.ed j;
            private android.os.IBinder xt;

            C0013j(android.os.IBinder r1) {
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

            @Override // com.ss.android.socialbase.downloader.r.ed
            public long j(int r6, int r7) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L32
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L32
                    r0.writeInt(r7)     // Catch: java.lang.Throwable -> L32
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L32
                    r3 = 1
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L32
                    if (r2 != 0) goto L34
                    com.ss.android.socialbase.downloader.r.ed r2 = com.ss.android.socialbase.downloader.r.ed.j.j()     // Catch: java.lang.Throwable -> L32
                    if (r2 == 0) goto L34
                    com.ss.android.socialbase.downloader.r.ed r2 = com.ss.android.socialbase.downloader.r.ed.j.j()     // Catch: java.lang.Throwable -> L32
                    long r6 = r2.j(r6, r7)     // Catch: java.lang.Throwable -> L32
                L2b:
                    r1.recycle()
                    r0.recycle()
                    return r6
                L32:
                    r6 = move-exception
                    goto L3c
                L34:
                    r1.readException()     // Catch: java.lang.Throwable -> L32
                    long r6 = r1.readLong()     // Catch: java.lang.Throwable -> L32
                    goto L2b
                L3c:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }
        }

        public j() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator"
                r1.attachInterface(r1, r0)
                return
        }

        public static com.ss.android.socialbase.downloader.r.ed j() {
                com.ss.android.socialbase.downloader.r.ed r0 = com.ss.android.socialbase.downloader.r.ed.j.C0013j.j
                return r0
        }

        public static com.ss.android.socialbase.downloader.r.ed j(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof com.ss.android.socialbase.downloader.r.ed
                if (r1 == 0) goto L13
                com.ss.android.socialbase.downloader.r.ed r0 = (com.ss.android.socialbase.downloader.r.ed) r0
                return r0
            L13:
                com.ss.android.socialbase.downloader.r.ed$j$j r0 = new com.ss.android.socialbase.downloader.r.ed$j$j
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
                java.lang.String r0 = "com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator"
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
                long r4 = r3.j(r4, r5)
                r6.writeNoException()
                r6.writeLong(r4)
                return r1
        }
    }

    long j(int r1, int r2) throws android.os.RemoteException;
}
