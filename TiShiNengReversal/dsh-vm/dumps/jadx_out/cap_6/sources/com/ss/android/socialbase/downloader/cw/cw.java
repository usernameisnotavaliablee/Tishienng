package com.ss.android.socialbase.downloader.cw;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface cw extends android.os.IInterface {

    public static abstract class j extends android.os.Binder implements com.ss.android.socialbase.downloader.cw.cw {

        /* renamed from: com.ss.android.socialbase.downloader.cw.cw$j$j, reason: collision with other inner class name */
        private static class C0000j implements com.ss.android.socialbase.downloader.cw.cw {
            public static com.ss.android.socialbase.downloader.cw.cw j;
            private android.os.IBinder xt;

            C0000j(android.os.IBinder r1) {
                    r0 = this;
                    r0.<init>()
                    r0.xt = r1
                    return
            }

            @Override // com.ss.android.socialbase.downloader.cw.cw
            public com.ss.android.socialbase.downloader.ae.cw ae(int r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L30
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L30
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L30
                    r3 = 21
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L30
                    if (r2 != 0) goto L32
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L30
                    if (r2 == 0) goto L32
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L30
                    com.ss.android.socialbase.downloader.ae.cw r6 = r2.ae(r6)     // Catch: java.lang.Throwable -> L30
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

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                    r1 = this;
                    android.os.IBinder r0 = r1.xt
                    return r0
            }

            @Override // com.ss.android.socialbase.downloader.cw.cw
            public com.ss.android.socialbase.downloader.ae.cw cw(int r6, long r7) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L33
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L33
                    r0.writeLong(r7)     // Catch: java.lang.Throwable -> L33
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L33
                    r3 = 26
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L33
                    if (r2 != 0) goto L35
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L33
                    if (r2 == 0) goto L35
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L33
                    com.ss.android.socialbase.downloader.ae.cw r6 = r2.cw(r6, r7)     // Catch: java.lang.Throwable -> L33
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

            @Override // com.ss.android.socialbase.downloader.cw.cw
            public java.util.List<com.ss.android.socialbase.downloader.ae.xt> cw(int r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L30
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L30
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L30
                    r3 = 9
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L30
                    if (r2 != 0) goto L32
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L30
                    if (r2 == 0) goto L32
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L30
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
                    android.os.Parcelable$Creator r6 = com.ss.android.socialbase.downloader.ae.xt.CREATOR     // Catch: java.lang.Throwable -> L30
                    java.util.ArrayList r6 = r1.createTypedArrayList(r6)     // Catch: java.lang.Throwable -> L30
                    goto L29
                L3c:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.cw.cw
            public java.util.List<com.ss.android.socialbase.downloader.ae.cw> cw(java.lang.String r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2f
                    r0.writeString(r6)     // Catch: java.lang.Throwable -> L2f
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2f
                    r3 = 6
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2f
                    if (r2 != 0) goto L31
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L2f
                    if (r2 == 0) goto L31
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L2f
                    java.util.List r6 = r2.cw(r6)     // Catch: java.lang.Throwable -> L2f
                L28:
                    r1.recycle()
                    r0.recycle()
                    return r6
                L2f:
                    r6 = move-exception
                    goto L3b
                L31:
                    r1.readException()     // Catch: java.lang.Throwable -> L2f
                    android.os.Parcelable$Creator r6 = com.ss.android.socialbase.downloader.ae.cw.CREATOR     // Catch: java.lang.Throwable -> L2f
                    java.util.ArrayList r6 = r1.createTypedArrayList(r6)     // Catch: java.lang.Throwable -> L2f
                    goto L28
                L3b:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.cw.cw
            public void cw() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2c
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2c
                    r3 = 20
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2c
                    if (r2 != 0) goto L2e
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L2c
                    if (r2 == 0) goto L2e
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L2c
                    r2.cw()     // Catch: java.lang.Throwable -> L2c
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

            @Override // com.ss.android.socialbase.downloader.cw.cw
            public com.ss.android.socialbase.downloader.ae.cw g(int r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L30
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L30
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L30
                    r3 = 29
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L30
                    if (r2 != 0) goto L32
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L30
                    if (r2 == 0) goto L32
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L30
                    com.ss.android.socialbase.downloader.ae.cw r6 = r2.g(r6)     // Catch: java.lang.Throwable -> L30
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

            @Override // com.ss.android.socialbase.downloader.cw.cw
            public com.ss.android.socialbase.downloader.ae.cw j(int r6, int r7) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L33
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L33
                    r0.writeInt(r7)     // Catch: java.lang.Throwable -> L33
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L33
                    r3 = 16
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L33
                    if (r2 != 0) goto L35
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L33
                    if (r2 == 0) goto L35
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L33
                    com.ss.android.socialbase.downloader.ae.cw r6 = r2.j(r6, r7)     // Catch: java.lang.Throwable -> L33
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

            @Override // com.ss.android.socialbase.downloader.cw.cw
            public com.ss.android.socialbase.downloader.ae.cw j(int r6, long r7) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L33
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L33
                    r0.writeLong(r7)     // Catch: java.lang.Throwable -> L33
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L33
                    r3 = 23
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L33
                    if (r2 != 0) goto L35
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L33
                    if (r2 == 0) goto L35
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L33
                    com.ss.android.socialbase.downloader.ae.cw r6 = r2.j(r6, r7)     // Catch: java.lang.Throwable -> L33
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

            @Override // com.ss.android.socialbase.downloader.cw.cw
            public com.ss.android.socialbase.downloader.ae.cw j(int r10, long r11, java.lang.String r13, java.lang.String r14) throws android.os.RemoteException {
                    r9 = this;
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    android.os.Parcel r2 = android.os.Parcel.obtain()
                    java.lang.String r0 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                    r1.writeInterfaceToken(r0)     // Catch: java.lang.Throwable -> L3d
                    r1.writeInt(r10)     // Catch: java.lang.Throwable -> L3d
                    r1.writeLong(r11)     // Catch: java.lang.Throwable -> L3d
                    r1.writeString(r13)     // Catch: java.lang.Throwable -> L3d
                    r1.writeString(r14)     // Catch: java.lang.Throwable -> L3d
                    android.os.IBinder r0 = r9.xt     // Catch: java.lang.Throwable -> L3d
                    r3 = 22
                    r4 = 0
                    boolean r0 = r0.transact(r3, r1, r2, r4)     // Catch: java.lang.Throwable -> L3d
                    if (r0 != 0) goto L40
                    com.ss.android.socialbase.downloader.cw.cw r0 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L3d
                    if (r0 == 0) goto L40
                    com.ss.android.socialbase.downloader.cw.cw r3 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L3d
                    r4 = r10
                    r5 = r11
                    r7 = r13
                    r8 = r14
                    com.ss.android.socialbase.downloader.ae.cw r10 = r3.j(r4, r5, r7, r8)     // Catch: java.lang.Throwable -> L3d
                L36:
                    r2.recycle()
                    r1.recycle()
                    return r10
                L3d:
                    r0 = move-exception
                    r10 = r0
                    goto L54
                L40:
                    r2.readException()     // Catch: java.lang.Throwable -> L3d
                    int r10 = r2.readInt()     // Catch: java.lang.Throwable -> L3d
                    if (r10 == 0) goto L52
                    android.os.Parcelable$Creator r10 = com.ss.android.socialbase.downloader.ae.cw.CREATOR     // Catch: java.lang.Throwable -> L3d
                    java.lang.Object r10 = r10.createFromParcel(r2)     // Catch: java.lang.Throwable -> L3d
                    com.ss.android.socialbase.downloader.ae.cw r10 = (com.ss.android.socialbase.downloader.ae.cw) r10     // Catch: java.lang.Throwable -> L3d
                    goto L36
                L52:
                    r10 = 0
                    goto L36
                L54:
                    r2.recycle()
                    r1.recycle()
                    throw r10
            }

            @Override // com.ss.android.socialbase.downloader.cw.cw
            public java.util.List<com.ss.android.socialbase.downloader.ae.cw> j(java.lang.String r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2f
                    r0.writeString(r6)     // Catch: java.lang.Throwable -> L2f
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2f
                    r3 = 4
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2f
                    if (r2 != 0) goto L31
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L2f
                    if (r2 == 0) goto L31
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L2f
                    java.util.List r6 = r2.j(r6)     // Catch: java.lang.Throwable -> L2f
                L28:
                    r1.recycle()
                    r0.recycle()
                    return r6
                L2f:
                    r6 = move-exception
                    goto L3b
                L31:
                    r1.readException()     // Catch: java.lang.Throwable -> L2f
                    android.os.Parcelable$Creator r6 = com.ss.android.socialbase.downloader.ae.cw.CREATOR     // Catch: java.lang.Throwable -> L2f
                    java.util.ArrayList r6 = r1.createTypedArrayList(r6)     // Catch: java.lang.Throwable -> L2f
                    goto L28
                L3b:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.cw.cw
            public void j() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2b
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2b
                    r3 = 1
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2b
                    if (r2 != 0) goto L2d
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L2b
                    if (r2 == 0) goto L2d
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L2b
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

            @Override // com.ss.android.socialbase.downloader.cw.cw
            public void j(int r6, int r7, int r8, int r9) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L38
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L38
                    r0.writeInt(r7)     // Catch: java.lang.Throwable -> L38
                    r0.writeInt(r8)     // Catch: java.lang.Throwable -> L38
                    r0.writeInt(r9)     // Catch: java.lang.Throwable -> L38
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L38
                    r3 = 15
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L38
                    if (r2 != 0) goto L3a
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L38
                    if (r2 == 0) goto L3a
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L38
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

            @Override // com.ss.android.socialbase.downloader.cw.cw
            public void j(int r10, int r11, int r12, long r13) throws android.os.RemoteException {
                    r9 = this;
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    android.os.Parcel r2 = android.os.Parcel.obtain()
                    java.lang.String r0 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                    r1.writeInterfaceToken(r0)     // Catch: java.lang.Throwable -> L3c
                    r1.writeInt(r10)     // Catch: java.lang.Throwable -> L3c
                    r1.writeInt(r11)     // Catch: java.lang.Throwable -> L3c
                    r1.writeInt(r12)     // Catch: java.lang.Throwable -> L3c
                    r1.writeLong(r13)     // Catch: java.lang.Throwable -> L3c
                    android.os.IBinder r0 = r9.xt     // Catch: java.lang.Throwable -> L3c
                    r3 = 14
                    r4 = 0
                    boolean r0 = r0.transact(r3, r1, r2, r4)     // Catch: java.lang.Throwable -> L3c
                    if (r0 != 0) goto L3f
                    com.ss.android.socialbase.downloader.cw.cw r0 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L3c
                    if (r0 == 0) goto L3f
                    com.ss.android.socialbase.downloader.cw.cw r3 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L3c
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

            @Override // com.ss.android.socialbase.downloader.cw.cw
            public void j(int r6, int r7, long r8) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L35
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L35
                    r0.writeInt(r7)     // Catch: java.lang.Throwable -> L35
                    r0.writeLong(r8)     // Catch: java.lang.Throwable -> L35
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L35
                    r3 = 13
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L35
                    if (r2 != 0) goto L37
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L35
                    if (r2 == 0) goto L37
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L35
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

            @Override // com.ss.android.socialbase.downloader.cw.cw
            public void j(int r6, java.util.List<com.ss.android.socialbase.downloader.ae.xt> r7) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L32
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L32
                    r0.writeTypedList(r7)     // Catch: java.lang.Throwable -> L32
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L32
                    r3 = 34
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L32
                    if (r2 != 0) goto L34
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L32
                    if (r2 == 0) goto L34
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L32
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

            @Override // com.ss.android.socialbase.downloader.cw.cw
            public void j(com.ss.android.socialbase.downloader.ae.xt r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
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
                    r4 = 11
                    boolean r2 = r3.transact(r4, r0, r1, r2)     // Catch: java.lang.Throwable -> L18
                    if (r2 != 0) goto L3b
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L18
                    if (r2 == 0) goto L3b
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L18
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

            @Override // com.ss.android.socialbase.downloader.cw.cw
            public void j(com.ss.android.socialbase.downloader.cw.xt r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
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
                    r3 = 36
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L14
                    if (r2 != 0) goto L39
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L14
                    if (r2 == 0) goto L39
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L14
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

            @Override // com.ss.android.socialbase.downloader.cw.cw
            public boolean j(int r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2f
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L2f
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2f
                    r3 = 2
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2f
                    if (r2 != 0) goto L31
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L2f
                    if (r2 == 0) goto L31
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L2f
                    boolean r6 = r2.j(r6)     // Catch: java.lang.Throwable -> L2f
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

            @Override // com.ss.android.socialbase.downloader.cw.cw
            public boolean j(com.ss.android.socialbase.downloader.ae.cw r7) throws android.os.RemoteException {
                    r6 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
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
                    r5 = 17
                    boolean r4 = r4.transact(r5, r0, r1, r3)     // Catch: java.lang.Throwable -> L18
                    if (r4 != 0) goto L3c
                    com.ss.android.socialbase.downloader.cw.cw r4 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L18
                    if (r4 == 0) goto L3c
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L18
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

            @Override // com.ss.android.socialbase.downloader.cw.cw
            public boolean m(int r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L30
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L30
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L30
                    r3 = 19
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L30
                    if (r2 != 0) goto L32
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L30
                    if (r2 == 0) goto L32
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L30
                    boolean r6 = r2.m(r6)     // Catch: java.lang.Throwable -> L30
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

            @Override // com.ss.android.socialbase.downloader.cw.cw
            public com.ss.android.socialbase.downloader.ae.cw oq(int r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L30
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L30
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L30
                    r3 = 30
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L30
                    if (r2 != 0) goto L32
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L30
                    if (r2 == 0) goto L32
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L30
                    com.ss.android.socialbase.downloader.ae.cw r6 = r2.oq(r6)     // Catch: java.lang.Throwable -> L30
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

            @Override // com.ss.android.socialbase.downloader.cw.cw
            public com.ss.android.socialbase.downloader.ae.cw r(int r6, long r7) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L33
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L33
                    r0.writeLong(r7)     // Catch: java.lang.Throwable -> L33
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L33
                    r3 = 27
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L33
                    if (r2 != 0) goto L35
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L33
                    if (r2 == 0) goto L35
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L33
                    com.ss.android.socialbase.downloader.ae.cw r6 = r2.r(r6, r7)     // Catch: java.lang.Throwable -> L33
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

            @Override // com.ss.android.socialbase.downloader.cw.cw
            public java.util.List<com.ss.android.socialbase.downloader.ae.cw> r(java.lang.String r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2f
                    r0.writeString(r6)     // Catch: java.lang.Throwable -> L2f
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2f
                    r3 = 7
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2f
                    if (r2 != 0) goto L31
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L2f
                    if (r2 == 0) goto L31
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L2f
                    java.util.List r6 = r2.r(r6)     // Catch: java.lang.Throwable -> L2f
                L28:
                    r1.recycle()
                    r0.recycle()
                    return r6
                L2f:
                    r6 = move-exception
                    goto L3b
                L31:
                    r1.readException()     // Catch: java.lang.Throwable -> L2f
                    android.os.Parcelable$Creator r6 = com.ss.android.socialbase.downloader.ae.cw.CREATOR     // Catch: java.lang.Throwable -> L2f
                    java.util.ArrayList r6 = r1.createTypedArrayList(r6)     // Catch: java.lang.Throwable -> L2f
                    goto L28
                L3b:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.cw.cw
            public void r(int r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2f
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L2f
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2f
                    r3 = 10
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2f
                    if (r2 != 0) goto L31
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L2f
                    if (r2 == 0) goto L31
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L2f
                    r2.r(r6)     // Catch: java.lang.Throwable -> L2f
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

            @Override // com.ss.android.socialbase.downloader.cw.cw
            public boolean r() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2d
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2d
                    r3 = 31
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2d
                    if (r2 != 0) goto L2f
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L2d
                    if (r2 == 0) goto L2f
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L2d
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

            @Override // com.ss.android.socialbase.downloader.cw.cw
            public com.ss.android.socialbase.downloader.ae.cw tl(int r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L30
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L30
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L30
                    r3 = 25
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L30
                    if (r2 != 0) goto L32
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L30
                    if (r2 == 0) goto L32
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L30
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

            @Override // com.ss.android.socialbase.downloader.cw.cw
            public com.ss.android.socialbase.downloader.ae.cw up(int r6, long r7) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L33
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L33
                    r0.writeLong(r7)     // Catch: java.lang.Throwable -> L33
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L33
                    r3 = 28
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L33
                    if (r2 != 0) goto L35
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L33
                    if (r2 == 0) goto L35
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L33
                    com.ss.android.socialbase.downloader.ae.cw r6 = r2.up(r6, r7)     // Catch: java.lang.Throwable -> L33
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

            @Override // com.ss.android.socialbase.downloader.cw.cw
            public boolean up() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2d
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2d
                    r3 = 32
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2d
                    if (r2 != 0) goto L2f
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L2d
                    if (r2 == 0) goto L2f
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L2d
                    boolean r2 = r2.up()     // Catch: java.lang.Throwable -> L2d
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

            @Override // com.ss.android.socialbase.downloader.cw.cw
            public boolean up(int r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L30
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L30
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L30
                    r3 = 18
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L30
                    if (r2 != 0) goto L32
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L30
                    if (r2 == 0) goto L32
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L30
                    boolean r6 = r2.up(r6)     // Catch: java.lang.Throwable -> L30
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

            @Override // com.ss.android.socialbase.downloader.cw.cw
            public com.ss.android.socialbase.downloader.ae.cw xt(int r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2f
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L2f
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2f
                    r3 = 3
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2f
                    if (r2 != 0) goto L31
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L2f
                    if (r2 == 0) goto L31
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L2f
                    com.ss.android.socialbase.downloader.ae.cw r6 = r2.xt(r6)     // Catch: java.lang.Throwable -> L2f
                L28:
                    r1.recycle()
                    r0.recycle()
                    return r6
                L2f:
                    r6 = move-exception
                    goto L45
                L31:
                    r1.readException()     // Catch: java.lang.Throwable -> L2f
                    int r6 = r1.readInt()     // Catch: java.lang.Throwable -> L2f
                    if (r6 == 0) goto L43
                    android.os.Parcelable$Creator r6 = com.ss.android.socialbase.downloader.ae.cw.CREATOR     // Catch: java.lang.Throwable -> L2f
                    java.lang.Object r6 = r6.createFromParcel(r1)     // Catch: java.lang.Throwable -> L2f
                    com.ss.android.socialbase.downloader.ae.cw r6 = (com.ss.android.socialbase.downloader.ae.cw) r6     // Catch: java.lang.Throwable -> L2f
                    goto L28
                L43:
                    r6 = 0
                    goto L28
                L45:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.cw.cw
            public com.ss.android.socialbase.downloader.ae.cw xt(int r6, long r7) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L33
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L33
                    r0.writeLong(r7)     // Catch: java.lang.Throwable -> L33
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L33
                    r3 = 24
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L33
                    if (r2 != 0) goto L35
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L33
                    if (r2 == 0) goto L35
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L33
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

            @Override // com.ss.android.socialbase.downloader.cw.cw
            public java.util.List<com.ss.android.socialbase.downloader.ae.cw> xt() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2d
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2d
                    r3 = 8
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2d
                    if (r2 != 0) goto L2f
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L2d
                    if (r2 == 0) goto L2f
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L2d
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

            @Override // com.ss.android.socialbase.downloader.cw.cw
            public java.util.List<com.ss.android.socialbase.downloader.ae.cw> xt(java.lang.String r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2f
                    r0.writeString(r6)     // Catch: java.lang.Throwable -> L2f
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2f
                    r3 = 5
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2f
                    if (r2 != 0) goto L31
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L2f
                    if (r2 == 0) goto L31
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L2f
                    java.util.List r6 = r2.xt(r6)     // Catch: java.lang.Throwable -> L2f
                L28:
                    r1.recycle()
                    r0.recycle()
                    return r6
                L2f:
                    r6 = move-exception
                    goto L3b
                L31:
                    r1.readException()     // Catch: java.lang.Throwable -> L2f
                    android.os.Parcelable$Creator r6 = com.ss.android.socialbase.downloader.ae.cw.CREATOR     // Catch: java.lang.Throwable -> L2f
                    java.util.ArrayList r6 = r1.createTypedArrayList(r6)     // Catch: java.lang.Throwable -> L2f
                    goto L28
                L3b:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.cw.cw
            public void xt(int r6, java.util.List<com.ss.android.socialbase.downloader.ae.xt> r7) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L32
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L32
                    r0.writeTypedList(r7)     // Catch: java.lang.Throwable -> L32
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L32
                    r3 = 35
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L32
                    if (r2 != 0) goto L34
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L32
                    if (r2 == 0) goto L34
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L32
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

            @Override // com.ss.android.socialbase.downloader.cw.cw
            public void xt(com.ss.android.socialbase.downloader.ae.cw r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
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
                    r4 = 33
                    boolean r2 = r3.transact(r4, r0, r1, r2)     // Catch: java.lang.Throwable -> L18
                    if (r2 != 0) goto L3b
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L18
                    if (r2 == 0) goto L3b
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L18
                    r2.xt(r6)     // Catch: java.lang.Throwable -> L18
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

            @Override // com.ss.android.socialbase.downloader.cw.cw
            public void xt(com.ss.android.socialbase.downloader.ae.xt r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
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
                    r4 = 12
                    boolean r2 = r3.transact(r4, r0, r1, r2)     // Catch: java.lang.Throwable -> L18
                    if (r2 != 0) goto L3b
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L18
                    if (r2 == 0) goto L3b
                    com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.m()     // Catch: java.lang.Throwable -> L18
                    r2.xt(r6)     // Catch: java.lang.Throwable -> L18
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
        }

        public j() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                r1.attachInterface(r1, r0)
                return
        }

        public static com.ss.android.socialbase.downloader.cw.cw j(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof com.ss.android.socialbase.downloader.cw.cw
                if (r1 == 0) goto L13
                com.ss.android.socialbase.downloader.cw.cw r0 = (com.ss.android.socialbase.downloader.cw.cw) r0
                return r0
            L13:
                com.ss.android.socialbase.downloader.cw.cw$j$j r0 = new com.ss.android.socialbase.downloader.cw.cw$j$j
                r0.<init>(r2)
                return r0
        }

        public static com.ss.android.socialbase.downloader.cw.cw m() {
                com.ss.android.socialbase.downloader.cw.cw r0 = com.ss.android.socialbase.downloader.cw.cw.j.C0000j.j
                return r0
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
                r0 = this;
                return r0
        }

        @Override // android.os.Binder
        public boolean onTransact(int r11, android.os.Parcel r12, android.os.Parcel r13, int r14) throws android.os.RemoteException {
                r10 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                java.lang.String r2 = "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl"
                if (r11 == r0) goto L358
                r0 = 0
                r3 = 0
                switch(r11) {
                    case 1: goto L34d;
                    case 2: goto L33a;
                    case 3: goto L31e;
                    case 4: goto L30b;
                    case 5: goto L2f8;
                    case 6: goto L2e5;
                    case 7: goto L2d2;
                    case 8: goto L2c3;
                    case 9: goto L2b0;
                    case 10: goto L2a1;
                    case 11: goto L287;
                    case 12: goto L26d;
                    case 13: goto L256;
                    case 14: goto L23b;
                    case 15: goto L220;
                    case 16: goto L200;
                    case 17: goto L1e2;
                    case 18: goto L1cf;
                    case 19: goto L1bc;
                    case 20: goto L1b1;
                    case 21: goto L195;
                    case 22: goto L16d;
                    case 23: goto L14e;
                    case 24: goto L12f;
                    case 25: goto L114;
                    case 26: goto Lf5;
                    case 27: goto Ld6;
                    case 28: goto Lb7;
                    case 29: goto L9c;
                    case 30: goto L81;
                    case 31: goto L73;
                    case 32: goto L65;
                    case 33: goto L4c;
                    case 34: goto L38;
                    case 35: goto L24;
                    case 36: goto L12;
                    default: goto Ld;
                }
            Ld:
                boolean r11 = super.onTransact(r11, r12, r13, r14)
                return r11
            L12:
                r12.enforceInterface(r2)
                android.os.IBinder r11 = r12.readStrongBinder()
                com.ss.android.socialbase.downloader.cw.xt r11 = com.ss.android.socialbase.downloader.cw.xt.j.j(r11)
                r10.j(r11)
                r13.writeNoException()
                return r1
            L24:
                r12.enforceInterface(r2)
                int r11 = r12.readInt()
                android.os.Parcelable$Creator r14 = com.ss.android.socialbase.downloader.ae.xt.CREATOR
                java.util.ArrayList r12 = r12.createTypedArrayList(r14)
                r10.xt(r11, r12)
                r13.writeNoException()
                return r1
            L38:
                r12.enforceInterface(r2)
                int r11 = r12.readInt()
                android.os.Parcelable$Creator r14 = com.ss.android.socialbase.downloader.ae.xt.CREATOR
                java.util.ArrayList r12 = r12.createTypedArrayList(r14)
                r10.j(r11, r12)
                r13.writeNoException()
                return r1
            L4c:
                r12.enforceInterface(r2)
                int r11 = r12.readInt()
                if (r11 == 0) goto L5e
                android.os.Parcelable$Creator r11 = com.ss.android.socialbase.downloader.ae.cw.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r12)
                r0 = r11
                com.ss.android.socialbase.downloader.ae.cw r0 = (com.ss.android.socialbase.downloader.ae.cw) r0
            L5e:
                r10.xt(r0)
                r13.writeNoException()
                return r1
            L65:
                r12.enforceInterface(r2)
                boolean r11 = r10.up()
                r13.writeNoException()
                r13.writeInt(r11)
                return r1
            L73:
                r12.enforceInterface(r2)
                boolean r11 = r10.r()
                r13.writeNoException()
                r13.writeInt(r11)
                return r1
            L81:
                r12.enforceInterface(r2)
                int r11 = r12.readInt()
                com.ss.android.socialbase.downloader.ae.cw r11 = r10.oq(r11)
                r13.writeNoException()
                if (r11 == 0) goto L98
                r13.writeInt(r1)
                r11.writeToParcel(r13, r1)
                goto L9b
            L98:
                r13.writeInt(r3)
            L9b:
                return r1
            L9c:
                r12.enforceInterface(r2)
                int r11 = r12.readInt()
                com.ss.android.socialbase.downloader.ae.cw r11 = r10.g(r11)
                r13.writeNoException()
                if (r11 == 0) goto Lb3
                r13.writeInt(r1)
                r11.writeToParcel(r13, r1)
                goto Lb6
            Lb3:
                r13.writeInt(r3)
            Lb6:
                return r1
            Lb7:
                r12.enforceInterface(r2)
                int r11 = r12.readInt()
                long r4 = r12.readLong()
                com.ss.android.socialbase.downloader.ae.cw r11 = r10.up(r11, r4)
                r13.writeNoException()
                if (r11 == 0) goto Ld2
                r13.writeInt(r1)
                r11.writeToParcel(r13, r1)
                goto Ld5
            Ld2:
                r13.writeInt(r3)
            Ld5:
                return r1
            Ld6:
                r12.enforceInterface(r2)
                int r11 = r12.readInt()
                long r4 = r12.readLong()
                com.ss.android.socialbase.downloader.ae.cw r11 = r10.r(r11, r4)
                r13.writeNoException()
                if (r11 == 0) goto Lf1
                r13.writeInt(r1)
                r11.writeToParcel(r13, r1)
                goto Lf4
            Lf1:
                r13.writeInt(r3)
            Lf4:
                return r1
            Lf5:
                r12.enforceInterface(r2)
                int r11 = r12.readInt()
                long r4 = r12.readLong()
                com.ss.android.socialbase.downloader.ae.cw r11 = r10.cw(r11, r4)
                r13.writeNoException()
                if (r11 == 0) goto L110
                r13.writeInt(r1)
                r11.writeToParcel(r13, r1)
                goto L113
            L110:
                r13.writeInt(r3)
            L113:
                return r1
            L114:
                r12.enforceInterface(r2)
                int r11 = r12.readInt()
                com.ss.android.socialbase.downloader.ae.cw r11 = r10.tl(r11)
                r13.writeNoException()
                if (r11 == 0) goto L12b
                r13.writeInt(r1)
                r11.writeToParcel(r13, r1)
                goto L12e
            L12b:
                r13.writeInt(r3)
            L12e:
                return r1
            L12f:
                r12.enforceInterface(r2)
                int r11 = r12.readInt()
                long r4 = r12.readLong()
                com.ss.android.socialbase.downloader.ae.cw r11 = r10.xt(r11, r4)
                r13.writeNoException()
                if (r11 == 0) goto L14a
                r13.writeInt(r1)
                r11.writeToParcel(r13, r1)
                goto L14d
            L14a:
                r13.writeInt(r3)
            L14d:
                return r1
            L14e:
                r12.enforceInterface(r2)
                int r11 = r12.readInt()
                long r4 = r12.readLong()
                com.ss.android.socialbase.downloader.ae.cw r11 = r10.j(r11, r4)
                r13.writeNoException()
                if (r11 == 0) goto L169
                r13.writeInt(r1)
                r11.writeToParcel(r13, r1)
                goto L16c
            L169:
                r13.writeInt(r3)
            L16c:
                return r1
            L16d:
                r12.enforceInterface(r2)
                int r5 = r12.readInt()
                long r6 = r12.readLong()
                java.lang.String r8 = r12.readString()
                java.lang.String r9 = r12.readString()
                r4 = r10
                com.ss.android.socialbase.downloader.ae.cw r11 = r4.j(r5, r6, r8, r9)
                r13.writeNoException()
                if (r11 == 0) goto L191
                r13.writeInt(r1)
                r11.writeToParcel(r13, r1)
                goto L194
            L191:
                r13.writeInt(r3)
            L194:
                return r1
            L195:
                r4 = r10
                r12.enforceInterface(r2)
                int r11 = r12.readInt()
                com.ss.android.socialbase.downloader.ae.cw r11 = r10.ae(r11)
                r13.writeNoException()
                if (r11 == 0) goto L1ad
                r13.writeInt(r1)
                r11.writeToParcel(r13, r1)
                goto L1b0
            L1ad:
                r13.writeInt(r3)
            L1b0:
                return r1
            L1b1:
                r4 = r10
                r12.enforceInterface(r2)
                r10.cw()
                r13.writeNoException()
                return r1
            L1bc:
                r4 = r10
                r12.enforceInterface(r2)
                int r11 = r12.readInt()
                boolean r11 = r10.m(r11)
                r13.writeNoException()
                r13.writeInt(r11)
                return r1
            L1cf:
                r4 = r10
                r12.enforceInterface(r2)
                int r11 = r12.readInt()
                boolean r11 = r10.up(r11)
                r13.writeNoException()
                r13.writeInt(r11)
                return r1
            L1e2:
                r4 = r10
                r12.enforceInterface(r2)
                int r11 = r12.readInt()
                if (r11 == 0) goto L1f5
                android.os.Parcelable$Creator r11 = com.ss.android.socialbase.downloader.ae.cw.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r12)
                r0 = r11
                com.ss.android.socialbase.downloader.ae.cw r0 = (com.ss.android.socialbase.downloader.ae.cw) r0
            L1f5:
                boolean r11 = r10.j(r0)
                r13.writeNoException()
                r13.writeInt(r11)
                return r1
            L200:
                r4 = r10
                r12.enforceInterface(r2)
                int r11 = r12.readInt()
                int r12 = r12.readInt()
                com.ss.android.socialbase.downloader.ae.cw r11 = r10.j(r11, r12)
                r13.writeNoException()
                if (r11 == 0) goto L21c
                r13.writeInt(r1)
                r11.writeToParcel(r13, r1)
                goto L21f
            L21c:
                r13.writeInt(r3)
            L21f:
                return r1
            L220:
                r4 = r10
                r12.enforceInterface(r2)
                int r11 = r12.readInt()
                int r14 = r12.readInt()
                int r0 = r12.readInt()
                int r12 = r12.readInt()
                r10.j(r11, r14, r0, r12)
                r13.writeNoException()
                return r1
            L23b:
                r4 = r10
                r12.enforceInterface(r2)
                int r5 = r12.readInt()
                int r6 = r12.readInt()
                int r7 = r12.readInt()
                long r8 = r12.readLong()
                r4.j(r5, r6, r7, r8)
                r13.writeNoException()
                return r1
            L256:
                r4 = r10
                r12.enforceInterface(r2)
                int r11 = r12.readInt()
                int r14 = r12.readInt()
                long r2 = r12.readLong()
                r10.j(r11, r14, r2)
                r13.writeNoException()
                return r1
            L26d:
                r4 = r10
                r12.enforceInterface(r2)
                int r11 = r12.readInt()
                if (r11 == 0) goto L280
                android.os.Parcelable$Creator r11 = com.ss.android.socialbase.downloader.ae.xt.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r12)
                r0 = r11
                com.ss.android.socialbase.downloader.ae.xt r0 = (com.ss.android.socialbase.downloader.ae.xt) r0
            L280:
                r10.xt(r0)
                r13.writeNoException()
                return r1
            L287:
                r4 = r10
                r12.enforceInterface(r2)
                int r11 = r12.readInt()
                if (r11 == 0) goto L29a
                android.os.Parcelable$Creator r11 = com.ss.android.socialbase.downloader.ae.xt.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r12)
                r0 = r11
                com.ss.android.socialbase.downloader.ae.xt r0 = (com.ss.android.socialbase.downloader.ae.xt) r0
            L29a:
                r10.j(r0)
                r13.writeNoException()
                return r1
            L2a1:
                r4 = r10
                r12.enforceInterface(r2)
                int r11 = r12.readInt()
                r10.r(r11)
                r13.writeNoException()
                return r1
            L2b0:
                r4 = r10
                r12.enforceInterface(r2)
                int r11 = r12.readInt()
                java.util.List r11 = r10.cw(r11)
                r13.writeNoException()
                r13.writeTypedList(r11)
                return r1
            L2c3:
                r4 = r10
                r12.enforceInterface(r2)
                java.util.List r11 = r10.xt()
                r13.writeNoException()
                r13.writeTypedList(r11)
                return r1
            L2d2:
                r4 = r10
                r12.enforceInterface(r2)
                java.lang.String r11 = r12.readString()
                java.util.List r11 = r10.r(r11)
                r13.writeNoException()
                r13.writeTypedList(r11)
                return r1
            L2e5:
                r4 = r10
                r12.enforceInterface(r2)
                java.lang.String r11 = r12.readString()
                java.util.List r11 = r10.cw(r11)
                r13.writeNoException()
                r13.writeTypedList(r11)
                return r1
            L2f8:
                r4 = r10
                r12.enforceInterface(r2)
                java.lang.String r11 = r12.readString()
                java.util.List r11 = r10.xt(r11)
                r13.writeNoException()
                r13.writeTypedList(r11)
                return r1
            L30b:
                r4 = r10
                r12.enforceInterface(r2)
                java.lang.String r11 = r12.readString()
                java.util.List r11 = r10.j(r11)
                r13.writeNoException()
                r13.writeTypedList(r11)
                return r1
            L31e:
                r4 = r10
                r12.enforceInterface(r2)
                int r11 = r12.readInt()
                com.ss.android.socialbase.downloader.ae.cw r11 = r10.xt(r11)
                r13.writeNoException()
                if (r11 == 0) goto L336
                r13.writeInt(r1)
                r11.writeToParcel(r13, r1)
                goto L339
            L336:
                r13.writeInt(r3)
            L339:
                return r1
            L33a:
                r4 = r10
                r12.enforceInterface(r2)
                int r11 = r12.readInt()
                boolean r11 = r10.j(r11)
                r13.writeNoException()
                r13.writeInt(r11)
                return r1
            L34d:
                r4 = r10
                r12.enforceInterface(r2)
                r10.j()
                r13.writeNoException()
                return r1
            L358:
                r4 = r10
                r13.writeString(r2)
                return r1
        }
    }

    com.ss.android.socialbase.downloader.ae.cw ae(int r1) throws android.os.RemoteException;

    com.ss.android.socialbase.downloader.ae.cw cw(int r1, long r2) throws android.os.RemoteException;

    java.util.List<com.ss.android.socialbase.downloader.ae.xt> cw(int r1) throws android.os.RemoteException;

    java.util.List<com.ss.android.socialbase.downloader.ae.cw> cw(java.lang.String r1) throws android.os.RemoteException;

    void cw() throws android.os.RemoteException;

    com.ss.android.socialbase.downloader.ae.cw g(int r1) throws android.os.RemoteException;

    com.ss.android.socialbase.downloader.ae.cw j(int r1, int r2) throws android.os.RemoteException;

    com.ss.android.socialbase.downloader.ae.cw j(int r1, long r2) throws android.os.RemoteException;

    com.ss.android.socialbase.downloader.ae.cw j(int r1, long r2, java.lang.String r4, java.lang.String r5) throws android.os.RemoteException;

    java.util.List<com.ss.android.socialbase.downloader.ae.cw> j(java.lang.String r1) throws android.os.RemoteException;

    void j() throws android.os.RemoteException;

    void j(int r1, int r2, int r3, int r4) throws android.os.RemoteException;

    void j(int r1, int r2, int r3, long r4) throws android.os.RemoteException;

    void j(int r1, int r2, long r3) throws android.os.RemoteException;

    void j(int r1, java.util.List<com.ss.android.socialbase.downloader.ae.xt> r2) throws android.os.RemoteException;

    void j(com.ss.android.socialbase.downloader.ae.xt r1) throws android.os.RemoteException;

    void j(com.ss.android.socialbase.downloader.cw.xt r1) throws android.os.RemoteException;

    boolean j(int r1) throws android.os.RemoteException;

    boolean j(com.ss.android.socialbase.downloader.ae.cw r1) throws android.os.RemoteException;

    boolean m(int r1) throws android.os.RemoteException;

    com.ss.android.socialbase.downloader.ae.cw oq(int r1) throws android.os.RemoteException;

    com.ss.android.socialbase.downloader.ae.cw r(int r1, long r2) throws android.os.RemoteException;

    java.util.List<com.ss.android.socialbase.downloader.ae.cw> r(java.lang.String r1) throws android.os.RemoteException;

    void r(int r1) throws android.os.RemoteException;

    boolean r() throws android.os.RemoteException;

    com.ss.android.socialbase.downloader.ae.cw tl(int r1) throws android.os.RemoteException;

    com.ss.android.socialbase.downloader.ae.cw up(int r1, long r2) throws android.os.RemoteException;

    boolean up() throws android.os.RemoteException;

    boolean up(int r1) throws android.os.RemoteException;

    com.ss.android.socialbase.downloader.ae.cw xt(int r1) throws android.os.RemoteException;

    com.ss.android.socialbase.downloader.ae.cw xt(int r1, long r2) throws android.os.RemoteException;

    java.util.List<com.ss.android.socialbase.downloader.ae.cw> xt() throws android.os.RemoteException;

    java.util.List<com.ss.android.socialbase.downloader.ae.cw> xt(java.lang.String r1) throws android.os.RemoteException;

    void xt(int r1, java.util.List<com.ss.android.socialbase.downloader.ae.xt> r2) throws android.os.RemoteException;

    void xt(com.ss.android.socialbase.downloader.ae.cw r1) throws android.os.RemoteException;

    void xt(com.ss.android.socialbase.downloader.ae.xt r1) throws android.os.RemoteException;
}
