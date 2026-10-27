package com.ss.android.socialbase.downloader.downloader;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface qv extends android.os.IInterface {

    public static abstract class j extends android.os.Binder implements com.ss.android.socialbase.downloader.downloader.qv {

        /* renamed from: com.ss.android.socialbase.downloader.downloader.qv$j$j, reason: collision with other inner class name */
        private static class C0003j implements com.ss.android.socialbase.downloader.downloader.qv {
            public static com.ss.android.socialbase.downloader.downloader.qv j;
            private android.os.IBinder xt;

            C0003j(android.os.IBinder r1) {
                    r0 = this;
                    r0.<init>()
                    r0.xt = r1
                    return
            }

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public boolean ae(int r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L30
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L30
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L30
                    r3 = 10
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L30
                    if (r2 != 0) goto L32
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L30
                    if (r2 == 0) goto L32
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L30
                    boolean r6 = r2.ae(r6)     // Catch: java.lang.Throwable -> L30
                    r1.recycle()
                    r0.recycle()
                    return r6
                L30:
                    r6 = move-exception
                    goto L43
                L32:
                    r1.readException()     // Catch: java.lang.Throwable -> L30
                    int r6 = r1.readInt()     // Catch: java.lang.Throwable -> L30
                    if (r6 == 0) goto L3c
                    r4 = 1
                L3c:
                    r1.recycle()
                    r0.recycle()
                    return r4
                L43:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                    r1 = this;
                    android.os.IBinder r0 = r1.xt
                    return r0
            }

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public boolean av(int r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L30
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L30
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L30
                    r3 = 45
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L30
                    if (r2 != 0) goto L32
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L30
                    if (r2 == 0) goto L32
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L30
                    boolean r6 = r2.av(r6)     // Catch: java.lang.Throwable -> L30
                    r1.recycle()
                    r0.recycle()
                    return r6
                L30:
                    r6 = move-exception
                    goto L43
                L32:
                    r1.readException()     // Catch: java.lang.Throwable -> L30
                    int r6 = r1.readInt()     // Catch: java.lang.Throwable -> L30
                    if (r6 == 0) goto L3c
                    r4 = 1
                L3c:
                    r1.recycle()
                    r0.recycle()
                    return r4
                L43:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public void az(int r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2f
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L2f
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2f
                    r3 = 41
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2f
                    if (r2 != 0) goto L31
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L2f
                    if (r2 == 0) goto L31
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L2f
                    r2.az(r6)     // Catch: java.lang.Throwable -> L2f
                L28:
                    r1.recycle()
                    r0.recycle()
                    return
                L2f:
                    r6 = move-exception
                    goto L35
                L31:
                    r1.readException()     // Catch: java.lang.Throwable -> L2f
                    goto L28
                L35:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public java.util.List<com.ss.android.socialbase.downloader.ae.cw> cw(java.lang.String r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L30
                    r0.writeString(r6)     // Catch: java.lang.Throwable -> L30
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L30
                    r3 = 17
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L30
                    if (r2 != 0) goto L32
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L30
                    if (r2 == 0) goto L32
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L30
                    java.util.List r6 = r2.cw(r6)     // Catch: java.lang.Throwable -> L30
                L29:
                    r1.recycle()
                    r0.recycle()
                    return r6
                L30:
                    r6 = move-exception
                    goto L3c
                L32:
                    r1.readException()     // Catch: java.lang.Throwable -> L30
                    android.os.Parcelable$Creator r6 = com.ss.android.socialbase.downloader.ae.cw.CREATOR     // Catch: java.lang.Throwable -> L30
                    java.util.ArrayList r6 = r1.createTypedArrayList(r6)     // Catch: java.lang.Throwable -> L30
                    goto L29
                L3c:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public void cw(int r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2e
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L2e
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2e
                    r3 = 5
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2e
                    if (r2 != 0) goto L30
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L2e
                    if (r2 == 0) goto L30
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L2e
                    r2.cw(r6)     // Catch: java.lang.Throwable -> L2e
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

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public void cw(int r6, boolean r7) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L32
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L32
                    r0.writeInt(r7)     // Catch: java.lang.Throwable -> L32
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L32
                    r3 = 23
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L32
                    if (r2 != 0) goto L34
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L32
                    if (r2 == 0) goto L34
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L32
                    r2.cw(r6, r7)     // Catch: java.lang.Throwable -> L32
                L2b:
                    r1.recycle()
                    r0.recycle()
                    return
                L32:
                    r6 = move-exception
                    goto L38
                L34:
                    r1.readException()     // Catch: java.lang.Throwable -> L32
                    goto L2b
                L38:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public boolean cw() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2d
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2d
                    r3 = 31
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2d
                    if (r2 != 0) goto L2f
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L2d
                    if (r2 == 0) goto L2f
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L2d
                    boolean r2 = r2.cw()     // Catch: java.lang.Throwable -> L2d
                    r1.recycle()
                    r0.recycle()
                    return r2
                L2d:
                    r2 = move-exception
                    goto L40
                L2f:
                    r1.readException()     // Catch: java.lang.Throwable -> L2d
                    int r2 = r1.readInt()     // Catch: java.lang.Throwable -> L2d
                    if (r2 == 0) goto L39
                    r4 = 1
                L39:
                    r1.recycle()
                    r0.recycle()
                    return r4
                L40:
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public java.util.List<com.ss.android.socialbase.downloader.ae.xt> g(int r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L30
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L30
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L30
                    r3 = 13
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L30
                    if (r2 != 0) goto L32
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L30
                    if (r2 == 0) goto L32
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L30
                    java.util.List r6 = r2.g(r6)     // Catch: java.lang.Throwable -> L30
                L29:
                    r1.recycle()
                    r0.recycle()
                    return r6
                L30:
                    r6 = move-exception
                    goto L3c
                L32:
                    r1.readException()     // Catch: java.lang.Throwable -> L30
                    android.os.Parcelable$Creator r6 = com.ss.android.socialbase.downloader.ae.xt.CREATOR     // Catch: java.lang.Throwable -> L30
                    java.util.ArrayList r6 = r1.createTypedArrayList(r6)     // Catch: java.lang.Throwable -> L30
                    goto L29
                L3c:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public com.ss.android.socialbase.downloader.r.p i(int r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L30
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L30
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L30
                    r3 = 51
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L30
                    if (r2 != 0) goto L32
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L30
                    if (r2 == 0) goto L32
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L30
                    com.ss.android.socialbase.downloader.r.p r6 = r2.i(r6)     // Catch: java.lang.Throwable -> L30
                L29:
                    r1.recycle()
                    r0.recycle()
                    return r6
                L30:
                    r6 = move-exception
                    goto L3e
                L32:
                    r1.readException()     // Catch: java.lang.Throwable -> L30
                    android.os.IBinder r6 = r1.readStrongBinder()     // Catch: java.lang.Throwable -> L30
                    com.ss.android.socialbase.downloader.r.p r6 = com.ss.android.socialbase.downloader.r.p.j.j(r6)     // Catch: java.lang.Throwable -> L30
                    goto L29
                L3e:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public int j(java.lang.String r6, java.lang.String r7) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L33
                    r0.writeString(r6)     // Catch: java.lang.Throwable -> L33
                    r0.writeString(r7)     // Catch: java.lang.Throwable -> L33
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L33
                    r3 = 14
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L33
                    if (r2 != 0) goto L35
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L33
                    if (r2 == 0) goto L35
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L33
                    int r6 = r2.j(r6, r7)     // Catch: java.lang.Throwable -> L33
                L2c:
                    r1.recycle()
                    r0.recycle()
                    return r6
                L33:
                    r6 = move-exception
                    goto L3d
                L35:
                    r1.readException()     // Catch: java.lang.Throwable -> L33
                    int r6 = r1.readInt()     // Catch: java.lang.Throwable -> L33
                    goto L2c
                L3d:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public java.util.List<com.ss.android.socialbase.downloader.ae.cw> j(java.lang.String r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L30
                    r0.writeString(r6)     // Catch: java.lang.Throwable -> L30
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L30
                    r3 = 12
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L30
                    if (r2 != 0) goto L32
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L30
                    if (r2 == 0) goto L32
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L30
                    java.util.List r6 = r2.j(r6)     // Catch: java.lang.Throwable -> L30
                L29:
                    r1.recycle()
                    r0.recycle()
                    return r6
                L30:
                    r6 = move-exception
                    goto L3c
                L32:
                    r1.readException()     // Catch: java.lang.Throwable -> L30
                    android.os.Parcelable$Creator r6 = com.ss.android.socialbase.downloader.ae.cw.CREATOR     // Catch: java.lang.Throwable -> L30
                    java.util.ArrayList r6 = r1.createTypedArrayList(r6)     // Catch: java.lang.Throwable -> L30
                    goto L29
                L3c:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public void j() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2b
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2b
                    r3 = 7
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2b
                    if (r2 != 0) goto L2d
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L2b
                    if (r2 == 0) goto L2d
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L2b
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

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public void j(int r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2e
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L2e
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2e
                    r3 = 2
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2e
                    if (r2 != 0) goto L30
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L2e
                    if (r2 == 0) goto L30
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L2e
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

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public void j(int r6, int r7) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L32
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L32
                    r0.writeInt(r7)     // Catch: java.lang.Throwable -> L32
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L32
                    r3 = 50
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L32
                    if (r2 != 0) goto L34
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L32
                    if (r2 == 0) goto L34
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L32
                    r2.j(r6, r7)     // Catch: java.lang.Throwable -> L32
                L2b:
                    r1.recycle()
                    r0.recycle()
                    return
                L32:
                    r6 = move-exception
                    goto L38
                L34:
                    r1.readException()     // Catch: java.lang.Throwable -> L32
                    goto L2b
                L38:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public void j(int r6, int r7, int r8, int r9) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L38
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L38
                    r0.writeInt(r7)     // Catch: java.lang.Throwable -> L38
                    r0.writeInt(r8)     // Catch: java.lang.Throwable -> L38
                    r0.writeInt(r9)     // Catch: java.lang.Throwable -> L38
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L38
                    r3 = 44
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L38
                    if (r2 != 0) goto L3a
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L38
                    if (r2 == 0) goto L3a
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L38
                    r2.j(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L38
                L31:
                    r1.recycle()
                    r0.recycle()
                    return
                L38:
                    r6 = move-exception
                    goto L3e
                L3a:
                    r1.readException()     // Catch: java.lang.Throwable -> L38
                    goto L31
                L3e:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public void j(int r10, int r11, int r12, long r13) throws android.os.RemoteException {
                    r9 = this;
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    android.os.Parcel r2 = android.os.Parcel.obtain()
                    java.lang.String r0 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r1.writeInterfaceToken(r0)     // Catch: java.lang.Throwable -> L3c
                    r1.writeInt(r10)     // Catch: java.lang.Throwable -> L3c
                    r1.writeInt(r11)     // Catch: java.lang.Throwable -> L3c
                    r1.writeInt(r12)     // Catch: java.lang.Throwable -> L3c
                    r1.writeLong(r13)     // Catch: java.lang.Throwable -> L3c
                    android.os.IBinder r0 = r9.xt     // Catch: java.lang.Throwable -> L3c
                    r3 = 43
                    r4 = 0
                    boolean r0 = r0.transact(r3, r1, r2, r4)     // Catch: java.lang.Throwable -> L3c
                    if (r0 != 0) goto L3f
                    com.ss.android.socialbase.downloader.downloader.qv r0 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L3c
                    if (r0 == 0) goto L3f
                    com.ss.android.socialbase.downloader.downloader.qv r3 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L3c
                    r4 = r10
                    r5 = r11
                    r6 = r12
                    r7 = r13
                    r3.j(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L3c
                L35:
                    r2.recycle()
                    r1.recycle()
                    return
                L3c:
                    r0 = move-exception
                    r10 = r0
                    goto L43
                L3f:
                    r2.readException()     // Catch: java.lang.Throwable -> L3c
                    goto L35
                L43:
                    r2.recycle()
                    r1.recycle()
                    throw r10
            }

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public void j(int r6, int r7, long r8) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L35
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L35
                    r0.writeInt(r7)     // Catch: java.lang.Throwable -> L35
                    r0.writeLong(r8)     // Catch: java.lang.Throwable -> L35
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L35
                    r3 = 42
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L35
                    if (r2 != 0) goto L37
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L35
                    if (r2 == 0) goto L37
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L35
                    r2.j(r6, r7, r8)     // Catch: java.lang.Throwable -> L35
                L2e:
                    r1.recycle()
                    r0.recycle()
                    return
                L35:
                    r6 = move-exception
                    goto L3b
                L37:
                    r1.readException()     // Catch: java.lang.Throwable -> L35
                    goto L2e
                L3b:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public void j(int r10, int r11, com.ss.android.socialbase.downloader.r.oq r12, int r13, boolean r14) throws android.os.RemoteException {
                    r9 = this;
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    android.os.Parcel r2 = android.os.Parcel.obtain()
                    java.lang.String r0 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r1.writeInterfaceToken(r0)     // Catch: java.lang.Throwable -> L1a
                    r1.writeInt(r10)     // Catch: java.lang.Throwable -> L1a
                    r1.writeInt(r11)     // Catch: java.lang.Throwable -> L1a
                    if (r12 == 0) goto L1d
                    android.os.IBinder r0 = r12.asBinder()     // Catch: java.lang.Throwable -> L1a
                    goto L1e
                L1a:
                    r0 = move-exception
                    r10 = r0
                    goto L4f
                L1d:
                    r0 = 0
                L1e:
                    r1.writeStrongBinder(r0)     // Catch: java.lang.Throwable -> L1a
                    r1.writeInt(r13)     // Catch: java.lang.Throwable -> L1a
                    r1.writeInt(r14)     // Catch: java.lang.Throwable -> L1a
                    android.os.IBinder r0 = r9.xt     // Catch: java.lang.Throwable -> L1a
                    r3 = 25
                    r4 = 0
                    boolean r0 = r0.transact(r3, r1, r2, r4)     // Catch: java.lang.Throwable -> L1a
                    if (r0 != 0) goto L4b
                    com.ss.android.socialbase.downloader.downloader.qv r0 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L1a
                    if (r0 == 0) goto L4b
                    com.ss.android.socialbase.downloader.downloader.qv r3 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L1a
                    r4 = r10
                    r5 = r11
                    r6 = r12
                    r7 = r13
                    r8 = r14
                    r3.j(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L1a
                L44:
                    r2.recycle()
                    r1.recycle()
                    return
                L4b:
                    r2.readException()     // Catch: java.lang.Throwable -> L1a
                    goto L44
                L4f:
                    r2.recycle()
                    r1.recycle()
                    throw r10
            }

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public void j(int r11, int r12, com.ss.android.socialbase.downloader.r.oq r13, int r14, boolean r15, boolean r16) throws android.os.RemoteException {
                    r10 = this;
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    android.os.Parcel r2 = android.os.Parcel.obtain()
                    java.lang.String r0 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r1.writeInterfaceToken(r0)     // Catch: java.lang.Throwable -> L1a
                    r1.writeInt(r11)     // Catch: java.lang.Throwable -> L1a
                    r1.writeInt(r12)     // Catch: java.lang.Throwable -> L1a
                    if (r13 == 0) goto L1d
                    android.os.IBinder r0 = r13.asBinder()     // Catch: java.lang.Throwable -> L1a
                    goto L1e
                L1a:
                    r0 = move-exception
                    r11 = r0
                    goto L54
                L1d:
                    r0 = 0
                L1e:
                    r1.writeStrongBinder(r0)     // Catch: java.lang.Throwable -> L1a
                    r1.writeInt(r14)     // Catch: java.lang.Throwable -> L1a
                    r1.writeInt(r15)     // Catch: java.lang.Throwable -> L1a
                    r9 = r16
                    r1.writeInt(r9)     // Catch: java.lang.Throwable -> L1a
                    android.os.IBinder r0 = r10.xt     // Catch: java.lang.Throwable -> L1a
                    r3 = 27
                    r4 = 0
                    boolean r0 = r0.transact(r3, r1, r2, r4)     // Catch: java.lang.Throwable -> L1a
                    if (r0 != 0) goto L50
                    com.ss.android.socialbase.downloader.downloader.qv r0 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L1a
                    if (r0 == 0) goto L50
                    com.ss.android.socialbase.downloader.downloader.qv r3 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L1a
                    r4 = r11
                    r5 = r12
                    r6 = r13
                    r7 = r14
                    r8 = r15
                    r3.j(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L1a
                L49:
                    r2.recycle()
                    r1.recycle()
                    return
                L50:
                    r2.readException()     // Catch: java.lang.Throwable -> L1a
                    goto L49
                L54:
                    r2.recycle()
                    r1.recycle()
                    throw r11
            }

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public void j(int r6, long r7) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L32
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L32
                    r0.writeLong(r7)     // Catch: java.lang.Throwable -> L32
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L32
                    r3 = 56
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L32
                    if (r2 != 0) goto L34
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L32
                    if (r2 == 0) goto L34
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L32
                    r2.j(r6, r7)     // Catch: java.lang.Throwable -> L32
                L2b:
                    r1.recycle()
                    r0.recycle()
                    return
                L32:
                    r6 = move-exception
                    goto L38
                L34:
                    r1.readException()     // Catch: java.lang.Throwable -> L32
                    goto L2b
                L38:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public void j(int r6, android.app.Notification r7) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L17
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L17
                    r1 = 0
                    r2 = 1
                    if (r7 == 0) goto L19
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L17
                    r7.writeToParcel(r0, r1)     // Catch: java.lang.Throwable -> L17
                    goto L1c
                L17:
                    r6 = move-exception
                    goto L3c
                L19:
                    r0.writeInt(r1)     // Catch: java.lang.Throwable -> L17
                L1c:
                    android.os.IBinder r1 = r5.xt     // Catch: java.lang.Throwable -> L17
                    r3 = 29
                    r4 = 0
                    boolean r1 = r1.transact(r3, r0, r4, r2)     // Catch: java.lang.Throwable -> L17
                    if (r1 != 0) goto L38
                    com.ss.android.socialbase.downloader.downloader.qv r1 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L17
                    if (r1 == 0) goto L38
                    com.ss.android.socialbase.downloader.downloader.qv r1 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L17
                    r1.j(r6, r7)     // Catch: java.lang.Throwable -> L17
                    r0.recycle()
                    return
                L38:
                    r0.recycle()
                    return
                L3c:
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public void j(int r6, com.ss.android.socialbase.downloader.r.p r7) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L17
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L17
                    if (r7 == 0) goto L19
                    android.os.IBinder r2 = r7.asBinder()     // Catch: java.lang.Throwable -> L17
                    goto L1a
                L17:
                    r6 = move-exception
                    goto L40
                L19:
                    r2 = 0
                L1a:
                    r0.writeStrongBinder(r2)     // Catch: java.lang.Throwable -> L17
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L17
                    r3 = 53
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L17
                    if (r2 != 0) goto L3c
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L17
                    if (r2 == 0) goto L3c
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L17
                    r2.j(r6, r7)     // Catch: java.lang.Throwable -> L17
                L35:
                    r1.recycle()
                    r0.recycle()
                    return
                L3c:
                    r1.readException()     // Catch: java.lang.Throwable -> L17
                    goto L35
                L40:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public void j(int r6, java.util.List<com.ss.android.socialbase.downloader.ae.xt> r7) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L32
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L32
                    r0.writeTypedList(r7)     // Catch: java.lang.Throwable -> L32
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L32
                    r3 = 47
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L32
                    if (r2 != 0) goto L34
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L32
                    if (r2 == 0) goto L34
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L32
                    r2.j(r6, r7)     // Catch: java.lang.Throwable -> L32
                L2b:
                    r1.recycle()
                    r0.recycle()
                    return
                L32:
                    r6 = move-exception
                    goto L38
                L34:
                    r1.readException()     // Catch: java.lang.Throwable -> L32
                    goto L2b
                L38:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public void j(int r6, boolean r7) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L31
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L31
                    r0.writeInt(r7)     // Catch: java.lang.Throwable -> L31
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L31
                    r3 = 3
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L31
                    if (r2 != 0) goto L33
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L31
                    if (r2 == 0) goto L33
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L31
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

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public void j(com.ss.android.socialbase.downloader.ae.j r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L14
                    if (r6 == 0) goto L16
                    android.os.IBinder r2 = r6.asBinder()     // Catch: java.lang.Throwable -> L14
                    goto L17
                L14:
                    r6 = move-exception
                    goto L3c
                L16:
                    r2 = 0
                L17:
                    r0.writeStrongBinder(r2)     // Catch: java.lang.Throwable -> L14
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L14
                    r3 = 1
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L14
                    if (r2 != 0) goto L38
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L14
                    if (r2 == 0) goto L38
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L14
                    r2.j(r6)     // Catch: java.lang.Throwable -> L14
                L31:
                    r1.recycle()
                    r0.recycle()
                    return
                L38:
                    r1.readException()     // Catch: java.lang.Throwable -> L14
                    goto L31
                L3c:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public void j(com.ss.android.socialbase.downloader.ae.xt r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L18
                    r2 = 0
                    if (r6 == 0) goto L1a
                    r3 = 1
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L18
                    r6.writeToParcel(r0, r2)     // Catch: java.lang.Throwable -> L18
                    goto L1d
                L18:
                    r6 = move-exception
                    goto L3f
                L1a:
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L18
                L1d:
                    android.os.IBinder r3 = r5.xt     // Catch: java.lang.Throwable -> L18
                    r4 = 38
                    boolean r2 = r3.transact(r4, r0, r1, r2)     // Catch: java.lang.Throwable -> L18
                    if (r2 != 0) goto L3b
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L18
                    if (r2 == 0) goto L3b
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L18
                    r2.j(r6)     // Catch: java.lang.Throwable -> L18
                L34:
                    r1.recycle()
                    r0.recycle()
                    return
                L3b:
                    r1.readException()     // Catch: java.lang.Throwable -> L18
                    goto L34
                L3f:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public void j(com.ss.android.socialbase.downloader.r.gx r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L14
                    if (r6 == 0) goto L16
                    android.os.IBinder r2 = r6.asBinder()     // Catch: java.lang.Throwable -> L14
                    goto L17
                L14:
                    r6 = move-exception
                    goto L3d
                L16:
                    r2 = 0
                L17:
                    r0.writeStrongBinder(r2)     // Catch: java.lang.Throwable -> L14
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L14
                    r3 = 49
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L14
                    if (r2 != 0) goto L39
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L14
                    if (r2 == 0) goto L39
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L14
                    r2.j(r6)     // Catch: java.lang.Throwable -> L14
                L32:
                    r1.recycle()
                    r0.recycle()
                    return
                L39:
                    r1.readException()     // Catch: java.lang.Throwable -> L14
                    goto L32
                L3d:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public void j(java.util.List<java.lang.String> r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2f
                    r0.writeStringList(r6)     // Catch: java.lang.Throwable -> L2f
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2f
                    r3 = 20
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2f
                    if (r2 != 0) goto L31
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L2f
                    if (r2 == 0) goto L31
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L2f
                    r2.j(r6)     // Catch: java.lang.Throwable -> L2f
                L28:
                    r1.recycle()
                    r0.recycle()
                    return
                L2f:
                    r6 = move-exception
                    goto L35
                L31:
                    r1.readException()     // Catch: java.lang.Throwable -> L2f
                    goto L28
                L35:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public void j(boolean r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L29
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L29
                    android.os.IBinder r1 = r5.xt     // Catch: java.lang.Throwable -> L29
                    r2 = 0
                    r3 = 1
                    r4 = 30
                    boolean r1 = r1.transact(r4, r0, r2, r3)     // Catch: java.lang.Throwable -> L29
                    if (r1 != 0) goto L2b
                    com.ss.android.socialbase.downloader.downloader.qv r1 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L29
                    if (r1 == 0) goto L2b
                    com.ss.android.socialbase.downloader.downloader.qv r1 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L29
                    r1.j(r6)     // Catch: java.lang.Throwable -> L29
                    r0.recycle()
                    return
                L29:
                    r6 = move-exception
                    goto L2f
                L2b:
                    r0.recycle()
                    return
                L2f:
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public boolean j(com.ss.android.socialbase.downloader.ae.cw r7) throws android.os.RemoteException {
                    r6 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L18
                    r2 = 1
                    r3 = 0
                    if (r7 == 0) goto L1a
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L18
                    r7.writeToParcel(r0, r3)     // Catch: java.lang.Throwable -> L18
                    goto L1d
                L18:
                    r7 = move-exception
                    goto L4e
                L1a:
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L18
                L1d:
                    android.os.IBinder r4 = r6.xt     // Catch: java.lang.Throwable -> L18
                    r5 = 28
                    boolean r4 = r4.transact(r5, r0, r1, r3)     // Catch: java.lang.Throwable -> L18
                    if (r4 != 0) goto L3c
                    com.ss.android.socialbase.downloader.downloader.qv r4 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L18
                    if (r4 == 0) goto L3c
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L18
                    boolean r7 = r2.j(r7)     // Catch: java.lang.Throwable -> L18
                    r1.recycle()
                    r0.recycle()
                    return r7
                L3c:
                    r1.readException()     // Catch: java.lang.Throwable -> L18
                    int r7 = r1.readInt()     // Catch: java.lang.Throwable -> L18
                    if (r7 == 0) goto L46
                    goto L47
                L46:
                    r2 = 0
                L47:
                    r1.recycle()
                    r0.recycle()
                    return r2
                L4e:
                    r1.recycle()
                    r0.recycle()
                    throw r7
            }

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public int jy(int r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L30
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L30
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L30
                    r3 = 37
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L30
                    if (r2 != 0) goto L32
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L30
                    if (r2 == 0) goto L32
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L30
                    int r6 = r2.jy(r6)     // Catch: java.lang.Throwable -> L30
                L29:
                    r1.recycle()
                    r0.recycle()
                    return r6
                L30:
                    r6 = move-exception
                    goto L3a
                L32:
                    r1.readException()     // Catch: java.lang.Throwable -> L30
                    int r6 = r1.readInt()     // Catch: java.lang.Throwable -> L30
                    goto L29
                L3a:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public int m(int r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L30
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L30
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L30
                    r3 = 9
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L30
                    if (r2 != 0) goto L32
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L30
                    if (r2 == 0) goto L32
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L30
                    int r6 = r2.m(r6)     // Catch: java.lang.Throwable -> L30
                L29:
                    r1.recycle()
                    r0.recycle()
                    return r6
                L30:
                    r6 = move-exception
                    goto L3a
                L32:
                    r1.readException()     // Catch: java.lang.Throwable -> L30
                    int r6 = r1.readInt()     // Catch: java.lang.Throwable -> L30
                    goto L29
                L3a:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public boolean m() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2d
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2d
                    r3 = 55
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2d
                    if (r2 != 0) goto L2f
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L2d
                    if (r2 == 0) goto L2f
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L2d
                    boolean r2 = r2.m()     // Catch: java.lang.Throwable -> L2d
                    r1.recycle()
                    r0.recycle()
                    return r2
                L2d:
                    r2 = move-exception
                    goto L40
                L2f:
                    r1.readException()     // Catch: java.lang.Throwable -> L2d
                    int r2 = r1.readInt()     // Catch: java.lang.Throwable -> L2d
                    if (r2 == 0) goto L39
                    r4 = 1
                L39:
                    r1.recycle()
                    r0.recycle()
                    return r4
                L40:
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public com.ss.android.socialbase.downloader.r.tl mi(int r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L30
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L30
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L30
                    r3 = 54
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L30
                    if (r2 != 0) goto L32
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L30
                    if (r2 == 0) goto L32
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L30
                    com.ss.android.socialbase.downloader.r.tl r6 = r2.mi(r6)     // Catch: java.lang.Throwable -> L30
                L29:
                    r1.recycle()
                    r0.recycle()
                    return r6
                L30:
                    r6 = move-exception
                    goto L3e
                L32:
                    r1.readException()     // Catch: java.lang.Throwable -> L30
                    android.os.IBinder r6 = r1.readStrongBinder()     // Catch: java.lang.Throwable -> L30
                    com.ss.android.socialbase.downloader.r.tl r6 = com.ss.android.socialbase.downloader.r.tl.j.j(r6)     // Catch: java.lang.Throwable -> L30
                    goto L29
                L3e:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public void oq(int r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2f
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L2f
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2f
                    r3 = 24
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2f
                    if (r2 != 0) goto L31
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L2f
                    if (r2 == 0) goto L31
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L2f
                    r2.oq(r6)     // Catch: java.lang.Throwable -> L2f
                L28:
                    r1.recycle()
                    r0.recycle()
                    return
                L2f:
                    r6 = move-exception
                    goto L35
                L31:
                    r1.readException()     // Catch: java.lang.Throwable -> L2f
                    goto L28
                L35:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public boolean qv(int r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L30
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L30
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L30
                    r3 = 33
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L30
                    if (r2 != 0) goto L32
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L30
                    if (r2 == 0) goto L32
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L30
                    boolean r6 = r2.qv(r6)     // Catch: java.lang.Throwable -> L30
                    r1.recycle()
                    r0.recycle()
                    return r6
                L30:
                    r6 = move-exception
                    goto L43
                L32:
                    r1.readException()     // Catch: java.lang.Throwable -> L30
                    int r6 = r1.readInt()     // Catch: java.lang.Throwable -> L30
                    if (r6 == 0) goto L3c
                    r4 = 1
                L3c:
                    r1.recycle()
                    r0.recycle()
                    return r4
                L43:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public java.util.List<com.ss.android.socialbase.downloader.ae.cw> r(java.lang.String r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L30
                    r0.writeString(r6)     // Catch: java.lang.Throwable -> L30
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L30
                    r3 = 18
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L30
                    if (r2 != 0) goto L32
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L30
                    if (r2 == 0) goto L32
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L30
                    java.util.List r6 = r2.r(r6)     // Catch: java.lang.Throwable -> L30
                L29:
                    r1.recycle()
                    r0.recycle()
                    return r6
                L30:
                    r6 = move-exception
                    goto L3c
                L32:
                    r1.readException()     // Catch: java.lang.Throwable -> L30
                    android.os.Parcelable$Creator r6 = com.ss.android.socialbase.downloader.ae.cw.CREATOR     // Catch: java.lang.Throwable -> L30
                    java.util.ArrayList r6 = r1.createTypedArrayList(r6)     // Catch: java.lang.Throwable -> L30
                    goto L29
                L3c:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public void r(int r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2e
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L2e
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2e
                    r3 = 6
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2e
                    if (r2 != 0) goto L30
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L2e
                    if (r2 == 0) goto L30
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L2e
                    r2.r(r6)     // Catch: java.lang.Throwable -> L2e
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

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public void r(int r6, boolean r7) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L32
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L32
                    r0.writeInt(r7)     // Catch: java.lang.Throwable -> L32
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L32
                    r3 = 36
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L32
                    if (r2 != 0) goto L34
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L32
                    if (r2 == 0) goto L34
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L32
                    r2.r(r6, r7)     // Catch: java.lang.Throwable -> L32
                L2b:
                    r1.recycle()
                    r0.recycle()
                    return
                L32:
                    r6 = move-exception
                    goto L38
                L34:
                    r1.readException()     // Catch: java.lang.Throwable -> L32
                    goto L2b
                L38:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public boolean r() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2d
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2d
                    r3 = 35
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2d
                    if (r2 != 0) goto L2f
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L2d
                    if (r2 == 0) goto L2f
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L2d
                    boolean r2 = r2.r()     // Catch: java.lang.Throwable -> L2d
                    r1.recycle()
                    r0.recycle()
                    return r2
                L2d:
                    r2 = move-exception
                    goto L40
                L2f:
                    r1.readException()     // Catch: java.lang.Throwable -> L2d
                    int r2 = r1.readInt()     // Catch: java.lang.Throwable -> L2d
                    if (r2 == 0) goto L39
                    r4 = 1
                L39:
                    r1.recycle()
                    r0.recycle()
                    return r4
                L40:
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public com.ss.android.socialbase.downloader.ae.cw tl(int r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L30
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L30
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L30
                    r3 = 11
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L30
                    if (r2 != 0) goto L32
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L30
                    if (r2 == 0) goto L32
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L30
                    com.ss.android.socialbase.downloader.ae.cw r6 = r2.tl(r6)     // Catch: java.lang.Throwable -> L30
                L29:
                    r1.recycle()
                    r0.recycle()
                    return r6
                L30:
                    r6 = move-exception
                    goto L46
                L32:
                    r1.readException()     // Catch: java.lang.Throwable -> L30
                    int r6 = r1.readInt()     // Catch: java.lang.Throwable -> L30
                    if (r6 == 0) goto L44
                    android.os.Parcelable$Creator r6 = com.ss.android.socialbase.downloader.ae.cw.CREATOR     // Catch: java.lang.Throwable -> L30
                    java.lang.Object r6 = r6.createFromParcel(r1)     // Catch: java.lang.Throwable -> L30
                    com.ss.android.socialbase.downloader.ae.cw r6 = (com.ss.android.socialbase.downloader.ae.cw) r6     // Catch: java.lang.Throwable -> L30
                    goto L29
                L44:
                    r6 = 0
                    goto L29
                L46:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public long up(int r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L30
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L30
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L30
                    r3 = 8
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L30
                    if (r2 != 0) goto L32
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L30
                    if (r2 == 0) goto L32
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L30
                    long r2 = r2.up(r6)     // Catch: java.lang.Throwable -> L30
                L29:
                    r1.recycle()
                    r0.recycle()
                    return r2
                L30:
                    r6 = move-exception
                    goto L3a
                L32:
                    r1.readException()     // Catch: java.lang.Throwable -> L30
                    long r2 = r1.readLong()     // Catch: java.lang.Throwable -> L30
                    goto L29
                L3a:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public java.util.List<com.ss.android.socialbase.downloader.ae.cw> up(java.lang.String r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L30
                    r0.writeString(r6)     // Catch: java.lang.Throwable -> L30
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L30
                    r3 = 32
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L30
                    if (r2 != 0) goto L32
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L30
                    if (r2 == 0) goto L32
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L30
                    java.util.List r6 = r2.up(r6)     // Catch: java.lang.Throwable -> L30
                L29:
                    r1.recycle()
                    r0.recycle()
                    return r6
                L30:
                    r6 = move-exception
                    goto L3c
                L32:
                    r1.readException()     // Catch: java.lang.Throwable -> L30
                    android.os.Parcelable$Creator r6 = com.ss.android.socialbase.downloader.ae.cw.CREATOR     // Catch: java.lang.Throwable -> L30
                    java.util.ArrayList r6 = r1.createTypedArrayList(r6)     // Catch: java.lang.Throwable -> L30
                    goto L29
                L3c:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public void up() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2c
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2c
                    r3 = 46
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2c
                    if (r2 != 0) goto L2e
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L2c
                    if (r2 == 0) goto L2e
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L2c
                    r2.up()     // Catch: java.lang.Throwable -> L2c
                L25:
                    r1.recycle()
                    r0.recycle()
                    return
                L2c:
                    r2 = move-exception
                    goto L32
                L2e:
                    r1.readException()     // Catch: java.lang.Throwable -> L2c
                    goto L25
                L32:
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public void vl(int r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2f
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L2f
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2f
                    r3 = 34
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2f
                    if (r2 != 0) goto L31
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L2f
                    if (r2 == 0) goto L31
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L2f
                    r2.vl(r6)     // Catch: java.lang.Throwable -> L2f
                L28:
                    r1.recycle()
                    r0.recycle()
                    return
                L2f:
                    r6 = move-exception
                    goto L35
                L31:
                    r1.readException()     // Catch: java.lang.Throwable -> L2f
                    goto L28
                L35:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public com.ss.android.socialbase.downloader.r.rn w(int r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L30
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L30
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L30
                    r3 = 52
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L30
                    if (r2 != 0) goto L32
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L30
                    if (r2 == 0) goto L32
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L30
                    com.ss.android.socialbase.downloader.r.rn r6 = r2.w(r6)     // Catch: java.lang.Throwable -> L30
                L29:
                    r1.recycle()
                    r0.recycle()
                    return r6
                L30:
                    r6 = move-exception
                    goto L3e
                L32:
                    r1.readException()     // Catch: java.lang.Throwable -> L30
                    android.os.IBinder r6 = r1.readStrongBinder()     // Catch: java.lang.Throwable -> L30
                    com.ss.android.socialbase.downloader.r.rn r6 = com.ss.android.socialbase.downloader.r.rn.j.j(r6)     // Catch: java.lang.Throwable -> L30
                    goto L29
                L3e:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public boolean ws(int r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L30
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L30
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L30
                    r3 = 40
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L30
                    if (r2 != 0) goto L32
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L30
                    if (r2 == 0) goto L32
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L30
                    boolean r6 = r2.ws(r6)     // Catch: java.lang.Throwable -> L30
                    r1.recycle()
                    r0.recycle()
                    return r6
                L30:
                    r6 = move-exception
                    goto L43
                L32:
                    r1.readException()     // Catch: java.lang.Throwable -> L30
                    int r6 = r1.readInt()     // Catch: java.lang.Throwable -> L30
                    if (r6 == 0) goto L3c
                    r4 = 1
                L3c:
                    r1.recycle()
                    r0.recycle()
                    return r4
                L43:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public com.ss.android.socialbase.downloader.ae.cw xt(java.lang.String r6, java.lang.String r7) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L33
                    r0.writeString(r6)     // Catch: java.lang.Throwable -> L33
                    r0.writeString(r7)     // Catch: java.lang.Throwable -> L33
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L33
                    r3 = 15
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L33
                    if (r2 != 0) goto L35
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L33
                    if (r2 == 0) goto L35
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L33
                    com.ss.android.socialbase.downloader.ae.cw r6 = r2.xt(r6, r7)     // Catch: java.lang.Throwable -> L33
                L2c:
                    r1.recycle()
                    r0.recycle()
                    return r6
                L33:
                    r6 = move-exception
                    goto L49
                L35:
                    r1.readException()     // Catch: java.lang.Throwable -> L33
                    int r6 = r1.readInt()     // Catch: java.lang.Throwable -> L33
                    if (r6 == 0) goto L47
                    android.os.Parcelable$Creator r6 = com.ss.android.socialbase.downloader.ae.cw.CREATOR     // Catch: java.lang.Throwable -> L33
                    java.lang.Object r6 = r6.createFromParcel(r1)     // Catch: java.lang.Throwable -> L33
                    com.ss.android.socialbase.downloader.ae.cw r6 = (com.ss.android.socialbase.downloader.ae.cw) r6     // Catch: java.lang.Throwable -> L33
                    goto L2c
                L47:
                    r6 = 0
                    goto L2c
                L49:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public java.util.List<com.ss.android.socialbase.downloader.ae.cw> xt() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2d
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2d
                    r3 = 19
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2d
                    if (r2 != 0) goto L2f
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L2d
                    if (r2 == 0) goto L2f
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L2d
                    java.util.List r2 = r2.xt()     // Catch: java.lang.Throwable -> L2d
                L26:
                    r1.recycle()
                    r0.recycle()
                    return r2
                L2d:
                    r2 = move-exception
                    goto L39
                L2f:
                    r1.readException()     // Catch: java.lang.Throwable -> L2d
                    android.os.Parcelable$Creator r2 = com.ss.android.socialbase.downloader.ae.cw.CREATOR     // Catch: java.lang.Throwable -> L2d
                    java.util.ArrayList r2 = r1.createTypedArrayList(r2)     // Catch: java.lang.Throwable -> L2d
                    goto L26
                L39:
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public java.util.List<com.ss.android.socialbase.downloader.ae.cw> xt(java.lang.String r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L30
                    r0.writeString(r6)     // Catch: java.lang.Throwable -> L30
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L30
                    r3 = 16
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L30
                    if (r2 != 0) goto L32
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L30
                    if (r2 == 0) goto L32
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L30
                    java.util.List r6 = r2.xt(r6)     // Catch: java.lang.Throwable -> L30
                L29:
                    r1.recycle()
                    r0.recycle()
                    return r6
                L30:
                    r6 = move-exception
                    goto L3c
                L32:
                    r1.readException()     // Catch: java.lang.Throwable -> L30
                    android.os.Parcelable$Creator r6 = com.ss.android.socialbase.downloader.ae.cw.CREATOR     // Catch: java.lang.Throwable -> L30
                    java.util.ArrayList r6 = r1.createTypedArrayList(r6)     // Catch: java.lang.Throwable -> L30
                    goto L29
                L3c:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public void xt(int r10, int r11, com.ss.android.socialbase.downloader.r.oq r12, int r13, boolean r14) throws android.os.RemoteException {
                    r9 = this;
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    android.os.Parcel r2 = android.os.Parcel.obtain()
                    java.lang.String r0 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r1.writeInterfaceToken(r0)     // Catch: java.lang.Throwable -> L1a
                    r1.writeInt(r10)     // Catch: java.lang.Throwable -> L1a
                    r1.writeInt(r11)     // Catch: java.lang.Throwable -> L1a
                    if (r12 == 0) goto L1d
                    android.os.IBinder r0 = r12.asBinder()     // Catch: java.lang.Throwable -> L1a
                    goto L1e
                L1a:
                    r0 = move-exception
                    r10 = r0
                    goto L4f
                L1d:
                    r0 = 0
                L1e:
                    r1.writeStrongBinder(r0)     // Catch: java.lang.Throwable -> L1a
                    r1.writeInt(r13)     // Catch: java.lang.Throwable -> L1a
                    r1.writeInt(r14)     // Catch: java.lang.Throwable -> L1a
                    android.os.IBinder r0 = r9.xt     // Catch: java.lang.Throwable -> L1a
                    r3 = 26
                    r4 = 0
                    boolean r0 = r0.transact(r3, r1, r2, r4)     // Catch: java.lang.Throwable -> L1a
                    if (r0 != 0) goto L4b
                    com.ss.android.socialbase.downloader.downloader.qv r0 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L1a
                    if (r0 == 0) goto L4b
                    com.ss.android.socialbase.downloader.downloader.qv r3 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L1a
                    r4 = r10
                    r5 = r11
                    r6 = r12
                    r7 = r13
                    r8 = r14
                    r3.xt(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L1a
                L44:
                    r2.recycle()
                    r1.recycle()
                    return
                L4b:
                    r2.readException()     // Catch: java.lang.Throwable -> L1a
                    goto L44
                L4f:
                    r2.recycle()
                    r1.recycle()
                    throw r10
            }

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public void xt(int r6, java.util.List<com.ss.android.socialbase.downloader.ae.xt> r7) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L32
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L32
                    r0.writeTypedList(r7)     // Catch: java.lang.Throwable -> L32
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L32
                    r3 = 48
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L32
                    if (r2 != 0) goto L34
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L32
                    if (r2 == 0) goto L34
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L32
                    r2.xt(r6, r7)     // Catch: java.lang.Throwable -> L32
                L2b:
                    r1.recycle()
                    r0.recycle()
                    return
                L32:
                    r6 = move-exception
                    goto L38
                L34:
                    r1.readException()     // Catch: java.lang.Throwable -> L32
                    goto L2b
                L38:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public void xt(int r6, boolean r7) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L32
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L32
                    r0.writeInt(r7)     // Catch: java.lang.Throwable -> L32
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L32
                    r3 = 22
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L32
                    if (r2 != 0) goto L34
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L32
                    if (r2 == 0) goto L34
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L32
                    r2.xt(r6, r7)     // Catch: java.lang.Throwable -> L32
                L2b:
                    r1.recycle()
                    r0.recycle()
                    return
                L32:
                    r6 = move-exception
                    goto L38
                L34:
                    r1.readException()     // Catch: java.lang.Throwable -> L32
                    goto L2b
                L38:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public void xt(java.util.List<java.lang.String> r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2f
                    r0.writeStringList(r6)     // Catch: java.lang.Throwable -> L2f
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2f
                    r3 = 21
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2f
                    if (r2 != 0) goto L31
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L2f
                    if (r2 == 0) goto L31
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L2f
                    r2.xt(r6)     // Catch: java.lang.Throwable -> L2f
                L28:
                    r1.recycle()
                    r0.recycle()
                    return
                L2f:
                    r6 = move-exception
                    goto L35
                L31:
                    r1.readException()     // Catch: java.lang.Throwable -> L2f
                    goto L28
                L35:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public boolean xt(int r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2f
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L2f
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2f
                    r3 = 4
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2f
                    if (r2 != 0) goto L31
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L2f
                    if (r2 == 0) goto L31
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L2f
                    boolean r6 = r2.xt(r6)     // Catch: java.lang.Throwable -> L2f
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

            @Override // com.ss.android.socialbase.downloader.downloader.qv
            public boolean xt(com.ss.android.socialbase.downloader.ae.cw r7) throws android.os.RemoteException {
                    r6 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L18
                    r2 = 1
                    r3 = 0
                    if (r7 == 0) goto L1a
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L18
                    r7.writeToParcel(r0, r3)     // Catch: java.lang.Throwable -> L18
                    goto L1d
                L18:
                    r7 = move-exception
                    goto L4e
                L1a:
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L18
                L1d:
                    android.os.IBinder r4 = r6.xt     // Catch: java.lang.Throwable -> L18
                    r5 = 39
                    boolean r4 = r4.transact(r5, r0, r1, r3)     // Catch: java.lang.Throwable -> L18
                    if (r4 != 0) goto L3c
                    com.ss.android.socialbase.downloader.downloader.qv r4 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L18
                    if (r4 == 0) goto L3c
                    com.ss.android.socialbase.downloader.downloader.qv r2 = com.ss.android.socialbase.downloader.downloader.qv.j.ae()     // Catch: java.lang.Throwable -> L18
                    boolean r7 = r2.xt(r7)     // Catch: java.lang.Throwable -> L18
                    r1.recycle()
                    r0.recycle()
                    return r7
                L3c:
                    r1.readException()     // Catch: java.lang.Throwable -> L18
                    int r7 = r1.readInt()     // Catch: java.lang.Throwable -> L18
                    if (r7 == 0) goto L46
                    goto L47
                L46:
                    r2 = 0
                L47:
                    r1.recycle()
                    r0.recycle()
                    return r2
                L4e:
                    r1.recycle()
                    r0.recycle()
                    throw r7
            }
        }

        public j() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                r1.attachInterface(r1, r0)
                return
        }

        public static com.ss.android.socialbase.downloader.downloader.qv ae() {
                com.ss.android.socialbase.downloader.downloader.qv r0 = com.ss.android.socialbase.downloader.downloader.qv.j.C0003j.j
                return r0
        }

        public static com.ss.android.socialbase.downloader.downloader.qv j(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof com.ss.android.socialbase.downloader.downloader.qv
                if (r1 == 0) goto L13
                com.ss.android.socialbase.downloader.downloader.qv r0 = (com.ss.android.socialbase.downloader.downloader.qv) r0
                return r0
            L13:
                com.ss.android.socialbase.downloader.downloader.qv$j$j r0 = new com.ss.android.socialbase.downloader.downloader.qv$j$j
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
                r0 = this;
                return r0
        }

        @Override // android.os.Binder
        public boolean onTransact(int r10, android.os.Parcel r11, android.os.Parcel r12, int r13) throws android.os.RemoteException {
                r9 = this;
                r3 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r7 = 1
                java.lang.String r4 = "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService"
                if (r10 == r3) goto L492
                r3 = 0
                r5 = 0
                switch(r10) {
                    case 1: goto L480;
                    case 2: goto L472;
                    case 3: goto L45a;
                    case 4: goto L448;
                    case 5: goto L43a;
                    case 6: goto L42c;
                    case 7: goto L422;
                    case 8: goto L410;
                    case 9: goto L3fe;
                    case 10: goto L3ec;
                    case 11: goto L3d0;
                    case 12: goto L3be;
                    case 13: goto L3ac;
                    case 14: goto L396;
                    case 15: goto L376;
                    case 16: goto L364;
                    case 17: goto L352;
                    case 18: goto L340;
                    case 19: goto L332;
                    case 20: goto L324;
                    case 21: goto L316;
                    case 22: goto L2fe;
                    case 23: goto L2e6;
                    case 24: goto L2d8;
                    case 25: goto L2ae;
                    case 26: goto L284;
                    case 27: goto L253;
                    case 28: goto L236;
                    case 29: goto L21c;
                    case 30: goto L20e;
                    case 31: goto L200;
                    case 32: goto L1ee;
                    case 33: goto L1dc;
                    case 34: goto L1ce;
                    case 35: goto L1c0;
                    case 36: goto L1ab;
                    case 37: goto L199;
                    case 38: goto L180;
                    case 39: goto L163;
                    case 40: goto L151;
                    case 41: goto L143;
                    case 42: goto L12d;
                    case 43: goto L112;
                    case 44: goto Lf8;
                    case 45: goto Le6;
                    case 46: goto Ldc;
                    case 47: goto Lc8;
                    case 48: goto Lb4;
                    case 49: goto La2;
                    case 50: goto L90;
                    case 51: goto L78;
                    case 52: goto L60;
                    case 53: goto L4a;
                    case 54: goto L32;
                    case 55: goto L24;
                    case 56: goto L12;
                    default: goto Ld;
                }
            Ld:
                boolean r1 = super.onTransact(r10, r11, r12, r13)
                return r1
            L12:
                r11.enforceInterface(r4)
                int r1 = r11.readInt()
                long r2 = r11.readLong()
                r9.j(r1, r2)
                r12.writeNoException()
                return r7
            L24:
                r11.enforceInterface(r4)
                boolean r1 = r9.m()
                r12.writeNoException()
                r12.writeInt(r1)
                return r7
            L32:
                r11.enforceInterface(r4)
                int r1 = r11.readInt()
                com.ss.android.socialbase.downloader.r.tl r1 = r9.mi(r1)
                r12.writeNoException()
                if (r1 == 0) goto L46
                android.os.IBinder r3 = r1.asBinder()
            L46:
                r12.writeStrongBinder(r3)
                return r7
            L4a:
                r11.enforceInterface(r4)
                int r1 = r11.readInt()
                android.os.IBinder r2 = r11.readStrongBinder()
                com.ss.android.socialbase.downloader.r.p r2 = com.ss.android.socialbase.downloader.r.p.j.j(r2)
                r9.j(r1, r2)
                r12.writeNoException()
                return r7
            L60:
                r11.enforceInterface(r4)
                int r1 = r11.readInt()
                com.ss.android.socialbase.downloader.r.rn r1 = r9.w(r1)
                r12.writeNoException()
                if (r1 == 0) goto L74
                android.os.IBinder r3 = r1.asBinder()
            L74:
                r12.writeStrongBinder(r3)
                return r7
            L78:
                r11.enforceInterface(r4)
                int r1 = r11.readInt()
                com.ss.android.socialbase.downloader.r.p r1 = r9.i(r1)
                r12.writeNoException()
                if (r1 == 0) goto L8c
                android.os.IBinder r3 = r1.asBinder()
            L8c:
                r12.writeStrongBinder(r3)
                return r7
            L90:
                r11.enforceInterface(r4)
                int r1 = r11.readInt()
                int r2 = r11.readInt()
                r9.j(r1, r2)
                r12.writeNoException()
                return r7
            La2:
                r11.enforceInterface(r4)
                android.os.IBinder r1 = r11.readStrongBinder()
                com.ss.android.socialbase.downloader.r.gx r1 = com.ss.android.socialbase.downloader.r.gx.j.j(r1)
                r9.j(r1)
                r12.writeNoException()
                return r7
            Lb4:
                r11.enforceInterface(r4)
                int r1 = r11.readInt()
                android.os.Parcelable$Creator r3 = com.ss.android.socialbase.downloader.ae.xt.CREATOR
                java.util.ArrayList r2 = r11.createTypedArrayList(r3)
                r9.xt(r1, r2)
                r12.writeNoException()
                return r7
            Lc8:
                r11.enforceInterface(r4)
                int r1 = r11.readInt()
                android.os.Parcelable$Creator r3 = com.ss.android.socialbase.downloader.ae.xt.CREATOR
                java.util.ArrayList r2 = r11.createTypedArrayList(r3)
                r9.j(r1, r2)
                r12.writeNoException()
                return r7
            Ldc:
                r11.enforceInterface(r4)
                r9.up()
                r12.writeNoException()
                return r7
            Le6:
                r11.enforceInterface(r4)
                int r1 = r11.readInt()
                boolean r1 = r9.av(r1)
                r12.writeNoException()
                r12.writeInt(r1)
                return r7
            Lf8:
                r11.enforceInterface(r4)
                int r1 = r11.readInt()
                int r3 = r11.readInt()
                int r4 = r11.readInt()
                int r2 = r11.readInt()
                r9.j(r1, r3, r4, r2)
                r12.writeNoException()
                return r7
            L112:
                r11.enforceInterface(r4)
                int r1 = r11.readInt()
                int r2 = r11.readInt()
                int r3 = r11.readInt()
                long r4 = r11.readLong()
                r0 = r9
                r0.j(r1, r2, r3, r4)
                r12.writeNoException()
                return r7
            L12d:
                r11.enforceInterface(r4)
                int r1 = r11.readInt()
                int r2 = r11.readInt()
                long r3 = r11.readLong()
                r9.j(r1, r2, r3)
                r12.writeNoException()
                return r7
            L143:
                r11.enforceInterface(r4)
                int r1 = r11.readInt()
                r9.az(r1)
                r12.writeNoException()
                return r7
            L151:
                r11.enforceInterface(r4)
                int r1 = r11.readInt()
                boolean r1 = r9.ws(r1)
                r12.writeNoException()
                r12.writeInt(r1)
                return r7
            L163:
                r11.enforceInterface(r4)
                int r1 = r11.readInt()
                if (r1 == 0) goto L175
                android.os.Parcelable$Creator r1 = com.ss.android.socialbase.downloader.ae.cw.CREATOR
                java.lang.Object r1 = r1.createFromParcel(r11)
                r3 = r1
                com.ss.android.socialbase.downloader.ae.cw r3 = (com.ss.android.socialbase.downloader.ae.cw) r3
            L175:
                boolean r1 = r9.xt(r3)
                r12.writeNoException()
                r12.writeInt(r1)
                return r7
            L180:
                r11.enforceInterface(r4)
                int r1 = r11.readInt()
                if (r1 == 0) goto L192
                android.os.Parcelable$Creator r1 = com.ss.android.socialbase.downloader.ae.xt.CREATOR
                java.lang.Object r1 = r1.createFromParcel(r11)
                r3 = r1
                com.ss.android.socialbase.downloader.ae.xt r3 = (com.ss.android.socialbase.downloader.ae.xt) r3
            L192:
                r9.j(r3)
                r12.writeNoException()
                return r7
            L199:
                r11.enforceInterface(r4)
                int r1 = r11.readInt()
                int r1 = r9.jy(r1)
                r12.writeNoException()
                r12.writeInt(r1)
                return r7
            L1ab:
                r11.enforceInterface(r4)
                int r1 = r11.readInt()
                int r2 = r11.readInt()
                if (r2 == 0) goto L1b9
                r5 = 1
            L1b9:
                r9.r(r1, r5)
                r12.writeNoException()
                return r7
            L1c0:
                r11.enforceInterface(r4)
                boolean r1 = r9.r()
                r12.writeNoException()
                r12.writeInt(r1)
                return r7
            L1ce:
                r11.enforceInterface(r4)
                int r1 = r11.readInt()
                r9.vl(r1)
                r12.writeNoException()
                return r7
            L1dc:
                r11.enforceInterface(r4)
                int r1 = r11.readInt()
                boolean r1 = r9.qv(r1)
                r12.writeNoException()
                r12.writeInt(r1)
                return r7
            L1ee:
                r11.enforceInterface(r4)
                java.lang.String r1 = r11.readString()
                java.util.List r1 = r9.up(r1)
                r12.writeNoException()
                r12.writeTypedList(r1)
                return r7
            L200:
                r11.enforceInterface(r4)
                boolean r1 = r9.cw()
                r12.writeNoException()
                r12.writeInt(r1)
                return r7
            L20e:
                r11.enforceInterface(r4)
                int r1 = r11.readInt()
                if (r1 == 0) goto L218
                r5 = 1
            L218:
                r9.j(r5)
                return r7
            L21c:
                r11.enforceInterface(r4)
                int r1 = r11.readInt()
                int r2 = r11.readInt()
                if (r2 == 0) goto L232
                android.os.Parcelable$Creator r2 = android.app.Notification.CREATOR
                java.lang.Object r2 = r2.createFromParcel(r11)
                r3 = r2
                android.app.Notification r3 = (android.app.Notification) r3
            L232:
                r9.j(r1, r3)
                return r7
            L236:
                r11.enforceInterface(r4)
                int r1 = r11.readInt()
                if (r1 == 0) goto L248
                android.os.Parcelable$Creator r1 = com.ss.android.socialbase.downloader.ae.cw.CREATOR
                java.lang.Object r1 = r1.createFromParcel(r11)
                r3 = r1
                com.ss.android.socialbase.downloader.ae.cw r3 = (com.ss.android.socialbase.downloader.ae.cw) r3
            L248:
                boolean r1 = r9.j(r3)
                r12.writeNoException()
                r12.writeInt(r1)
                return r7
            L253:
                r11.enforceInterface(r4)
                int r1 = r11.readInt()
                int r2 = r11.readInt()
                android.os.IBinder r3 = r11.readStrongBinder()
                com.ss.android.socialbase.downloader.r.oq r3 = com.ss.android.socialbase.downloader.r.oq.j.j(r3)
                int r4 = r11.readInt()
                int r8 = r11.readInt()
                if (r8 == 0) goto L271
                r5 = 1
            L271:
                r8 = 0
                int r6 = r11.readInt()
                if (r6 == 0) goto L27b
                r6 = 1
            L279:
                r0 = r9
                goto L27d
            L27b:
                r6 = 0
                goto L279
            L27d:
                r0.j(r1, r2, r3, r4, r5, r6)
                r12.writeNoException()
                return r7
            L284:
                r8 = 0
                r11.enforceInterface(r4)
                int r1 = r11.readInt()
                int r2 = r11.readInt()
                android.os.IBinder r0 = r11.readStrongBinder()
                com.ss.android.socialbase.downloader.r.oq r3 = com.ss.android.socialbase.downloader.r.oq.j.j(r0)
                int r4 = r11.readInt()
                int r0 = r11.readInt()
                if (r0 == 0) goto L2a5
                r5 = 1
            L2a3:
                r0 = r9
                goto L2a7
            L2a5:
                r5 = 0
                goto L2a3
            L2a7:
                r0.xt(r1, r2, r3, r4, r5)
                r12.writeNoException()
                return r7
            L2ae:
                r8 = 0
                r11.enforceInterface(r4)
                int r1 = r11.readInt()
                int r2 = r11.readInt()
                android.os.IBinder r0 = r11.readStrongBinder()
                com.ss.android.socialbase.downloader.r.oq r3 = com.ss.android.socialbase.downloader.r.oq.j.j(r0)
                int r4 = r11.readInt()
                int r0 = r11.readInt()
                if (r0 == 0) goto L2cf
                r5 = 1
            L2cd:
                r0 = r9
                goto L2d1
            L2cf:
                r5 = 0
                goto L2cd
            L2d1:
                r0.j(r1, r2, r3, r4, r5)
                r12.writeNoException()
                return r7
            L2d8:
                r11.enforceInterface(r4)
                int r1 = r11.readInt()
                r9.oq(r1)
                r12.writeNoException()
                return r7
            L2e6:
                r8 = 0
                r11.enforceInterface(r4)
                int r1 = r11.readInt()
                int r2 = r11.readInt()
                if (r2 == 0) goto L2f6
                r5 = 1
                goto L2f7
            L2f6:
                r5 = 0
            L2f7:
                r9.cw(r1, r5)
                r12.writeNoException()
                return r7
            L2fe:
                r8 = 0
                r11.enforceInterface(r4)
                int r1 = r11.readInt()
                int r2 = r11.readInt()
                if (r2 == 0) goto L30e
                r5 = 1
                goto L30f
            L30e:
                r5 = 0
            L30f:
                r9.xt(r1, r5)
                r12.writeNoException()
                return r7
            L316:
                r11.enforceInterface(r4)
                java.util.ArrayList r1 = r11.createStringArrayList()
                r9.xt(r1)
                r12.writeNoException()
                return r7
            L324:
                r11.enforceInterface(r4)
                java.util.ArrayList r1 = r11.createStringArrayList()
                r9.j(r1)
                r12.writeNoException()
                return r7
            L332:
                r11.enforceInterface(r4)
                java.util.List r1 = r9.xt()
                r12.writeNoException()
                r12.writeTypedList(r1)
                return r7
            L340:
                r11.enforceInterface(r4)
                java.lang.String r1 = r11.readString()
                java.util.List r1 = r9.r(r1)
                r12.writeNoException()
                r12.writeTypedList(r1)
                return r7
            L352:
                r11.enforceInterface(r4)
                java.lang.String r1 = r11.readString()
                java.util.List r1 = r9.cw(r1)
                r12.writeNoException()
                r12.writeTypedList(r1)
                return r7
            L364:
                r11.enforceInterface(r4)
                java.lang.String r1 = r11.readString()
                java.util.List r1 = r9.xt(r1)
                r12.writeNoException()
                r12.writeTypedList(r1)
                return r7
            L376:
                r8 = 0
                r11.enforceInterface(r4)
                java.lang.String r1 = r11.readString()
                java.lang.String r2 = r11.readString()
                com.ss.android.socialbase.downloader.ae.cw r1 = r9.xt(r1, r2)
                r12.writeNoException()
                if (r1 == 0) goto L392
                r12.writeInt(r7)
                r1.writeToParcel(r12, r7)
                goto L395
            L392:
                r12.writeInt(r8)
            L395:
                return r7
            L396:
                r11.enforceInterface(r4)
                java.lang.String r1 = r11.readString()
                java.lang.String r2 = r11.readString()
                int r1 = r9.j(r1, r2)
                r12.writeNoException()
                r12.writeInt(r1)
                return r7
            L3ac:
                r11.enforceInterface(r4)
                int r1 = r11.readInt()
                java.util.List r1 = r9.g(r1)
                r12.writeNoException()
                r12.writeTypedList(r1)
                return r7
            L3be:
                r11.enforceInterface(r4)
                java.lang.String r1 = r11.readString()
                java.util.List r1 = r9.j(r1)
                r12.writeNoException()
                r12.writeTypedList(r1)
                return r7
            L3d0:
                r8 = 0
                r11.enforceInterface(r4)
                int r1 = r11.readInt()
                com.ss.android.socialbase.downloader.ae.cw r1 = r9.tl(r1)
                r12.writeNoException()
                if (r1 == 0) goto L3e8
                r12.writeInt(r7)
                r1.writeToParcel(r12, r7)
                goto L3eb
            L3e8:
                r12.writeInt(r8)
            L3eb:
                return r7
            L3ec:
                r11.enforceInterface(r4)
                int r1 = r11.readInt()
                boolean r1 = r9.ae(r1)
                r12.writeNoException()
                r12.writeInt(r1)
                return r7
            L3fe:
                r11.enforceInterface(r4)
                int r1 = r11.readInt()
                int r1 = r9.m(r1)
                r12.writeNoException()
                r12.writeInt(r1)
                return r7
            L410:
                r11.enforceInterface(r4)
                int r1 = r11.readInt()
                long r1 = r9.up(r1)
                r12.writeNoException()
                r12.writeLong(r1)
                return r7
            L422:
                r11.enforceInterface(r4)
                r9.j()
                r12.writeNoException()
                return r7
            L42c:
                r11.enforceInterface(r4)
                int r1 = r11.readInt()
                r9.r(r1)
                r12.writeNoException()
                return r7
            L43a:
                r11.enforceInterface(r4)
                int r1 = r11.readInt()
                r9.cw(r1)
                r12.writeNoException()
                return r7
            L448:
                r11.enforceInterface(r4)
                int r1 = r11.readInt()
                boolean r1 = r9.xt(r1)
                r12.writeNoException()
                r12.writeInt(r1)
                return r7
            L45a:
                r8 = 0
                r11.enforceInterface(r4)
                int r1 = r11.readInt()
                int r2 = r11.readInt()
                if (r2 == 0) goto L46a
                r5 = 1
                goto L46b
            L46a:
                r5 = 0
            L46b:
                r9.j(r1, r5)
                r12.writeNoException()
                return r7
            L472:
                r11.enforceInterface(r4)
                int r1 = r11.readInt()
                r9.j(r1)
                r12.writeNoException()
                return r7
            L480:
                r11.enforceInterface(r4)
                android.os.IBinder r1 = r11.readStrongBinder()
                com.ss.android.socialbase.downloader.ae.j r1 = com.ss.android.socialbase.downloader.ae.j.j.j(r1)
                r9.j(r1)
                r12.writeNoException()
                return r7
            L492:
                r12.writeString(r4)
                return r7
        }
    }

    boolean ae(int r1) throws android.os.RemoteException;

    boolean av(int r1) throws android.os.RemoteException;

    void az(int r1) throws android.os.RemoteException;

    java.util.List<com.ss.android.socialbase.downloader.ae.cw> cw(java.lang.String r1) throws android.os.RemoteException;

    void cw(int r1) throws android.os.RemoteException;

    void cw(int r1, boolean r2) throws android.os.RemoteException;

    boolean cw() throws android.os.RemoteException;

    java.util.List<com.ss.android.socialbase.downloader.ae.xt> g(int r1) throws android.os.RemoteException;

    com.ss.android.socialbase.downloader.r.p i(int r1) throws android.os.RemoteException;

    int j(java.lang.String r1, java.lang.String r2) throws android.os.RemoteException;

    java.util.List<com.ss.android.socialbase.downloader.ae.cw> j(java.lang.String r1) throws android.os.RemoteException;

    void j() throws android.os.RemoteException;

    void j(int r1) throws android.os.RemoteException;

    void j(int r1, int r2) throws android.os.RemoteException;

    void j(int r1, int r2, int r3, int r4) throws android.os.RemoteException;

    void j(int r1, int r2, int r3, long r4) throws android.os.RemoteException;

    void j(int r1, int r2, long r3) throws android.os.RemoteException;

    void j(int r1, int r2, com.ss.android.socialbase.downloader.r.oq r3, int r4, boolean r5) throws android.os.RemoteException;

    void j(int r1, int r2, com.ss.android.socialbase.downloader.r.oq r3, int r4, boolean r5, boolean r6) throws android.os.RemoteException;

    void j(int r1, long r2) throws android.os.RemoteException;

    void j(int r1, android.app.Notification r2) throws android.os.RemoteException;

    void j(int r1, com.ss.android.socialbase.downloader.r.p r2) throws android.os.RemoteException;

    void j(int r1, java.util.List<com.ss.android.socialbase.downloader.ae.xt> r2) throws android.os.RemoteException;

    void j(int r1, boolean r2) throws android.os.RemoteException;

    void j(com.ss.android.socialbase.downloader.ae.j r1) throws android.os.RemoteException;

    void j(com.ss.android.socialbase.downloader.ae.xt r1) throws android.os.RemoteException;

    void j(com.ss.android.socialbase.downloader.r.gx r1) throws android.os.RemoteException;

    void j(java.util.List<java.lang.String> r1) throws android.os.RemoteException;

    void j(boolean r1) throws android.os.RemoteException;

    boolean j(com.ss.android.socialbase.downloader.ae.cw r1) throws android.os.RemoteException;

    int jy(int r1) throws android.os.RemoteException;

    int m(int r1) throws android.os.RemoteException;

    boolean m() throws android.os.RemoteException;

    com.ss.android.socialbase.downloader.r.tl mi(int r1) throws android.os.RemoteException;

    void oq(int r1) throws android.os.RemoteException;

    boolean qv(int r1) throws android.os.RemoteException;

    java.util.List<com.ss.android.socialbase.downloader.ae.cw> r(java.lang.String r1) throws android.os.RemoteException;

    void r(int r1) throws android.os.RemoteException;

    void r(int r1, boolean r2) throws android.os.RemoteException;

    boolean r() throws android.os.RemoteException;

    com.ss.android.socialbase.downloader.ae.cw tl(int r1) throws android.os.RemoteException;

    long up(int r1) throws android.os.RemoteException;

    java.util.List<com.ss.android.socialbase.downloader.ae.cw> up(java.lang.String r1) throws android.os.RemoteException;

    void up() throws android.os.RemoteException;

    void vl(int r1) throws android.os.RemoteException;

    com.ss.android.socialbase.downloader.r.rn w(int r1) throws android.os.RemoteException;

    boolean ws(int r1) throws android.os.RemoteException;

    com.ss.android.socialbase.downloader.ae.cw xt(java.lang.String r1, java.lang.String r2) throws android.os.RemoteException;

    java.util.List<com.ss.android.socialbase.downloader.ae.cw> xt() throws android.os.RemoteException;

    java.util.List<com.ss.android.socialbase.downloader.ae.cw> xt(java.lang.String r1) throws android.os.RemoteException;

    void xt(int r1, int r2, com.ss.android.socialbase.downloader.r.oq r3, int r4, boolean r5) throws android.os.RemoteException;

    void xt(int r1, java.util.List<com.ss.android.socialbase.downloader.ae.xt> r2) throws android.os.RemoteException;

    void xt(int r1, boolean r2) throws android.os.RemoteException;

    void xt(java.util.List<java.lang.String> r1) throws android.os.RemoteException;

    boolean xt(int r1) throws android.os.RemoteException;

    boolean xt(com.ss.android.socialbase.downloader.ae.cw r1) throws android.os.RemoteException;
}
