package com.ss.android.socialbase.downloader.ae;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface j extends android.os.IInterface {

    /* renamed from: com.ss.android.socialbase.downloader.ae.j$j, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0232j extends android.os.Binder implements com.ss.android.socialbase.downloader.ae.j {

        /* renamed from: com.ss.android.socialbase.downloader.ae.j$j$j, reason: collision with other inner class name */
        private static class C0233j implements com.ss.android.socialbase.downloader.ae.j {
            public static com.ss.android.socialbase.downloader.ae.j j;
            private android.os.IBinder xt;

            C0233j(android.os.IBinder r1) {
                    r0 = this;
                    r0.<init>()
                    r0.xt = r1
                    return
            }

            @Override // com.ss.android.socialbase.downloader.ae.j
            public com.ss.android.socialbase.downloader.r.v ae() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.model.DownloadAidlTask"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2d
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2d
                    r3 = 10
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2d
                    if (r2 != 0) goto L2f
                    com.ss.android.socialbase.downloader.ae.j r2 = com.ss.android.socialbase.downloader.ae.j.AbstractBinderC0232j.jy()     // Catch: java.lang.Throwable -> L2d
                    if (r2 == 0) goto L2f
                    com.ss.android.socialbase.downloader.ae.j r2 = com.ss.android.socialbase.downloader.ae.j.AbstractBinderC0232j.jy()     // Catch: java.lang.Throwable -> L2d
                    com.ss.android.socialbase.downloader.r.v r2 = r2.ae()     // Catch: java.lang.Throwable -> L2d
                L26:
                    r1.recycle()
                    r0.recycle()
                    return r2
                L2d:
                    r2 = move-exception
                    goto L3b
                L2f:
                    r1.readException()     // Catch: java.lang.Throwable -> L2d
                    android.os.IBinder r2 = r1.readStrongBinder()     // Catch: java.lang.Throwable -> L2d
                    com.ss.android.socialbase.downloader.r.v r2 = com.ss.android.socialbase.downloader.r.v.j.j(r2)     // Catch: java.lang.Throwable -> L2d
                    goto L26
                L3b:
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                    r1 = this;
                    android.os.IBinder r0 = r1.xt
                    return r0
            }

            @Override // com.ss.android.socialbase.downloader.ae.j
            public com.ss.android.socialbase.downloader.r.jy cw(int r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.model.DownloadAidlTask"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L30
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L30
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L30
                    r3 = 16
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L30
                    if (r2 != 0) goto L32
                    com.ss.android.socialbase.downloader.ae.j r2 = com.ss.android.socialbase.downloader.ae.j.AbstractBinderC0232j.jy()     // Catch: java.lang.Throwable -> L30
                    if (r2 == 0) goto L32
                    com.ss.android.socialbase.downloader.ae.j r2 = com.ss.android.socialbase.downloader.ae.j.AbstractBinderC0232j.jy()     // Catch: java.lang.Throwable -> L30
                    com.ss.android.socialbase.downloader.r.jy r6 = r2.cw(r6)     // Catch: java.lang.Throwable -> L30
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
                    com.ss.android.socialbase.downloader.r.jy r6 = com.ss.android.socialbase.downloader.r.jy.j.j(r6)     // Catch: java.lang.Throwable -> L30
                    goto L29
                L3e:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.ae.j
            public com.ss.android.socialbase.downloader.r.p cw() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.model.DownloadAidlTask"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2c
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2c
                    r3 = 6
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2c
                    if (r2 != 0) goto L2e
                    com.ss.android.socialbase.downloader.ae.j r2 = com.ss.android.socialbase.downloader.ae.j.AbstractBinderC0232j.jy()     // Catch: java.lang.Throwable -> L2c
                    if (r2 == 0) goto L2e
                    com.ss.android.socialbase.downloader.ae.j r2 = com.ss.android.socialbase.downloader.ae.j.AbstractBinderC0232j.jy()     // Catch: java.lang.Throwable -> L2c
                    com.ss.android.socialbase.downloader.r.p r2 = r2.cw()     // Catch: java.lang.Throwable -> L2c
                L25:
                    r1.recycle()
                    r0.recycle()
                    return r2
                L2c:
                    r2 = move-exception
                    goto L3a
                L2e:
                    r1.readException()     // Catch: java.lang.Throwable -> L2c
                    android.os.IBinder r2 = r1.readStrongBinder()     // Catch: java.lang.Throwable -> L2c
                    com.ss.android.socialbase.downloader.r.p r2 = com.ss.android.socialbase.downloader.r.p.j.j(r2)     // Catch: java.lang.Throwable -> L2c
                    goto L25
                L3a:
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // com.ss.android.socialbase.downloader.ae.j
            public com.ss.android.socialbase.downloader.r.i g() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.model.DownloadAidlTask"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2d
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2d
                    r3 = 12
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2d
                    if (r2 != 0) goto L2f
                    com.ss.android.socialbase.downloader.ae.j r2 = com.ss.android.socialbase.downloader.ae.j.AbstractBinderC0232j.jy()     // Catch: java.lang.Throwable -> L2d
                    if (r2 == 0) goto L2f
                    com.ss.android.socialbase.downloader.ae.j r2 = com.ss.android.socialbase.downloader.ae.j.AbstractBinderC0232j.jy()     // Catch: java.lang.Throwable -> L2d
                    com.ss.android.socialbase.downloader.r.i r2 = r2.g()     // Catch: java.lang.Throwable -> L2d
                L26:
                    r1.recycle()
                    r0.recycle()
                    return r2
                L2d:
                    r2 = move-exception
                    goto L3b
                L2f:
                    r1.readException()     // Catch: java.lang.Throwable -> L2d
                    android.os.IBinder r2 = r1.readStrongBinder()     // Catch: java.lang.Throwable -> L2d
                    com.ss.android.socialbase.downloader.r.i r2 = com.ss.android.socialbase.downloader.r.i.j.j(r2)     // Catch: java.lang.Throwable -> L2d
                    goto L26
                L3b:
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // com.ss.android.socialbase.downloader.ae.j
            public int j(int r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.model.DownloadAidlTask"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2f
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L2f
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2f
                    r3 = 3
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2f
                    if (r2 != 0) goto L31
                    com.ss.android.socialbase.downloader.ae.j r2 = com.ss.android.socialbase.downloader.ae.j.AbstractBinderC0232j.jy()     // Catch: java.lang.Throwable -> L2f
                    if (r2 == 0) goto L31
                    com.ss.android.socialbase.downloader.ae.j r2 = com.ss.android.socialbase.downloader.ae.j.AbstractBinderC0232j.jy()     // Catch: java.lang.Throwable -> L2f
                    int r6 = r2.j(r6)     // Catch: java.lang.Throwable -> L2f
                L28:
                    r1.recycle()
                    r0.recycle()
                    return r6
                L2f:
                    r6 = move-exception
                    goto L39
                L31:
                    r1.readException()     // Catch: java.lang.Throwable -> L2f
                    int r6 = r1.readInt()     // Catch: java.lang.Throwable -> L2f
                    goto L28
                L39:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.ae.j
            public com.ss.android.socialbase.downloader.ae.cw j() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.model.DownloadAidlTask"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2c
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2c
                    r3 = 1
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2c
                    if (r2 != 0) goto L2e
                    com.ss.android.socialbase.downloader.ae.j r2 = com.ss.android.socialbase.downloader.ae.j.AbstractBinderC0232j.jy()     // Catch: java.lang.Throwable -> L2c
                    if (r2 == 0) goto L2e
                    com.ss.android.socialbase.downloader.ae.j r2 = com.ss.android.socialbase.downloader.ae.j.AbstractBinderC0232j.jy()     // Catch: java.lang.Throwable -> L2c
                    com.ss.android.socialbase.downloader.ae.cw r2 = r2.j()     // Catch: java.lang.Throwable -> L2c
                L25:
                    r1.recycle()
                    r0.recycle()
                    return r2
                L2c:
                    r2 = move-exception
                    goto L42
                L2e:
                    r1.readException()     // Catch: java.lang.Throwable -> L2c
                    int r2 = r1.readInt()     // Catch: java.lang.Throwable -> L2c
                    if (r2 == 0) goto L40
                    android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.ae.cw> r2 = com.ss.android.socialbase.downloader.ae.cw.CREATOR     // Catch: java.lang.Throwable -> L2c
                    java.lang.Object r2 = r2.createFromParcel(r1)     // Catch: java.lang.Throwable -> L2c
                    com.ss.android.socialbase.downloader.ae.cw r2 = (com.ss.android.socialbase.downloader.ae.cw) r2     // Catch: java.lang.Throwable -> L2c
                    goto L25
                L40:
                    r2 = 0
                    goto L25
                L42:
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // com.ss.android.socialbase.downloader.ae.j
            public com.ss.android.socialbase.downloader.r.oq j(int r6, int r7) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.model.DownloadAidlTask"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L32
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L32
                    r0.writeInt(r7)     // Catch: java.lang.Throwable -> L32
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L32
                    r3 = 4
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L32
                    if (r2 != 0) goto L34
                    com.ss.android.socialbase.downloader.ae.j r2 = com.ss.android.socialbase.downloader.ae.j.AbstractBinderC0232j.jy()     // Catch: java.lang.Throwable -> L32
                    if (r2 == 0) goto L34
                    com.ss.android.socialbase.downloader.ae.j r2 = com.ss.android.socialbase.downloader.ae.j.AbstractBinderC0232j.jy()     // Catch: java.lang.Throwable -> L32
                    com.ss.android.socialbase.downloader.r.oq r6 = r2.j(r6, r7)     // Catch: java.lang.Throwable -> L32
                L2b:
                    r1.recycle()
                    r0.recycle()
                    return r6
                L32:
                    r6 = move-exception
                    goto L40
                L34:
                    r1.readException()     // Catch: java.lang.Throwable -> L32
                    android.os.IBinder r6 = r1.readStrongBinder()     // Catch: java.lang.Throwable -> L32
                    com.ss.android.socialbase.downloader.r.oq r6 = com.ss.android.socialbase.downloader.r.oq.j.j(r6)     // Catch: java.lang.Throwable -> L32
                    goto L2b
                L40:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.ae.j
            public com.ss.android.socialbase.downloader.r.ae m() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.model.DownloadAidlTask"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2d
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2d
                    r3 = 9
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2d
                    if (r2 != 0) goto L2f
                    com.ss.android.socialbase.downloader.ae.j r2 = com.ss.android.socialbase.downloader.ae.j.AbstractBinderC0232j.jy()     // Catch: java.lang.Throwable -> L2d
                    if (r2 == 0) goto L2f
                    com.ss.android.socialbase.downloader.ae.j r2 = com.ss.android.socialbase.downloader.ae.j.AbstractBinderC0232j.jy()     // Catch: java.lang.Throwable -> L2d
                    com.ss.android.socialbase.downloader.r.ae r2 = r2.m()     // Catch: java.lang.Throwable -> L2d
                L26:
                    r1.recycle()
                    r0.recycle()
                    return r2
                L2d:
                    r2 = move-exception
                    goto L3b
                L2f:
                    r1.readException()     // Catch: java.lang.Throwable -> L2d
                    android.os.IBinder r2 = r1.readStrongBinder()     // Catch: java.lang.Throwable -> L2d
                    com.ss.android.socialbase.downloader.r.ae r2 = com.ss.android.socialbase.downloader.r.ae.j.j(r2)     // Catch: java.lang.Throwable -> L2d
                    goto L26
                L3b:
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // com.ss.android.socialbase.downloader.ae.j
            public com.ss.android.socialbase.downloader.r.qv oq() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.model.DownloadAidlTask"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2d
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2d
                    r3 = 13
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2d
                    if (r2 != 0) goto L2f
                    com.ss.android.socialbase.downloader.ae.j r2 = com.ss.android.socialbase.downloader.ae.j.AbstractBinderC0232j.jy()     // Catch: java.lang.Throwable -> L2d
                    if (r2 == 0) goto L2f
                    com.ss.android.socialbase.downloader.ae.j r2 = com.ss.android.socialbase.downloader.ae.j.AbstractBinderC0232j.jy()     // Catch: java.lang.Throwable -> L2d
                    com.ss.android.socialbase.downloader.r.qv r2 = r2.oq()     // Catch: java.lang.Throwable -> L2d
                L26:
                    r1.recycle()
                    r0.recycle()
                    return r2
                L2d:
                    r2 = move-exception
                    goto L3b
                L2f:
                    r1.readException()     // Catch: java.lang.Throwable -> L2d
                    android.os.IBinder r2 = r1.readStrongBinder()     // Catch: java.lang.Throwable -> L2d
                    com.ss.android.socialbase.downloader.r.qv r2 = com.ss.android.socialbase.downloader.r.qv.j.j(r2)     // Catch: java.lang.Throwable -> L2d
                    goto L26
                L3b:
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // com.ss.android.socialbase.downloader.ae.j
            public com.ss.android.socialbase.downloader.r.tl qv() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.model.DownloadAidlTask"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2d
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2d
                    r3 = 14
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2d
                    if (r2 != 0) goto L2f
                    com.ss.android.socialbase.downloader.ae.j r2 = com.ss.android.socialbase.downloader.ae.j.AbstractBinderC0232j.jy()     // Catch: java.lang.Throwable -> L2d
                    if (r2 == 0) goto L2f
                    com.ss.android.socialbase.downloader.ae.j r2 = com.ss.android.socialbase.downloader.ae.j.AbstractBinderC0232j.jy()     // Catch: java.lang.Throwable -> L2d
                    com.ss.android.socialbase.downloader.r.tl r2 = r2.qv()     // Catch: java.lang.Throwable -> L2d
                L26:
                    r1.recycle()
                    r0.recycle()
                    return r2
                L2d:
                    r2 = move-exception
                    goto L3b
                L2f:
                    r1.readException()     // Catch: java.lang.Throwable -> L2d
                    android.os.IBinder r2 = r1.readStrongBinder()     // Catch: java.lang.Throwable -> L2d
                    com.ss.android.socialbase.downloader.r.tl r2 = com.ss.android.socialbase.downloader.r.tl.j.j(r2)     // Catch: java.lang.Throwable -> L2d
                    goto L26
                L3b:
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // com.ss.android.socialbase.downloader.ae.j
            public com.ss.android.socialbase.downloader.r.rn r() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.model.DownloadAidlTask"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2c
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2c
                    r3 = 7
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2c
                    if (r2 != 0) goto L2e
                    com.ss.android.socialbase.downloader.ae.j r2 = com.ss.android.socialbase.downloader.ae.j.AbstractBinderC0232j.jy()     // Catch: java.lang.Throwable -> L2c
                    if (r2 == 0) goto L2e
                    com.ss.android.socialbase.downloader.ae.j r2 = com.ss.android.socialbase.downloader.ae.j.AbstractBinderC0232j.jy()     // Catch: java.lang.Throwable -> L2c
                    com.ss.android.socialbase.downloader.r.rn r2 = r2.r()     // Catch: java.lang.Throwable -> L2c
                L25:
                    r1.recycle()
                    r0.recycle()
                    return r2
                L2c:
                    r2 = move-exception
                    goto L3a
                L2e:
                    r1.readException()     // Catch: java.lang.Throwable -> L2c
                    android.os.IBinder r2 = r1.readStrongBinder()     // Catch: java.lang.Throwable -> L2c
                    com.ss.android.socialbase.downloader.r.rn r2 = com.ss.android.socialbase.downloader.r.rn.j.j(r2)     // Catch: java.lang.Throwable -> L2c
                    goto L25
                L3a:
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // com.ss.android.socialbase.downloader.ae.j
            public com.ss.android.socialbase.downloader.r.ed tl() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.model.DownloadAidlTask"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2d
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2d
                    r3 = 11
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2d
                    if (r2 != 0) goto L2f
                    com.ss.android.socialbase.downloader.ae.j r2 = com.ss.android.socialbase.downloader.ae.j.AbstractBinderC0232j.jy()     // Catch: java.lang.Throwable -> L2d
                    if (r2 == 0) goto L2f
                    com.ss.android.socialbase.downloader.ae.j r2 = com.ss.android.socialbase.downloader.ae.j.AbstractBinderC0232j.jy()     // Catch: java.lang.Throwable -> L2d
                    com.ss.android.socialbase.downloader.r.ed r2 = r2.tl()     // Catch: java.lang.Throwable -> L2d
                L26:
                    r1.recycle()
                    r0.recycle()
                    return r2
                L2d:
                    r2 = move-exception
                    goto L3b
                L2f:
                    r1.readException()     // Catch: java.lang.Throwable -> L2d
                    android.os.IBinder r2 = r1.readStrongBinder()     // Catch: java.lang.Throwable -> L2d
                    com.ss.android.socialbase.downloader.r.ed r2 = com.ss.android.socialbase.downloader.r.ed.j.j(r2)     // Catch: java.lang.Throwable -> L2d
                    goto L26
                L3b:
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // com.ss.android.socialbase.downloader.ae.j
            public com.ss.android.socialbase.downloader.r.g up() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.model.DownloadAidlTask"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2d
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2d
                    r3 = 8
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2d
                    if (r2 != 0) goto L2f
                    com.ss.android.socialbase.downloader.ae.j r2 = com.ss.android.socialbase.downloader.ae.j.AbstractBinderC0232j.jy()     // Catch: java.lang.Throwable -> L2d
                    if (r2 == 0) goto L2f
                    com.ss.android.socialbase.downloader.ae.j r2 = com.ss.android.socialbase.downloader.ae.j.AbstractBinderC0232j.jy()     // Catch: java.lang.Throwable -> L2d
                    com.ss.android.socialbase.downloader.r.g r2 = r2.up()     // Catch: java.lang.Throwable -> L2d
                L26:
                    r1.recycle()
                    r0.recycle()
                    return r2
                L2d:
                    r2 = move-exception
                    goto L3b
                L2f:
                    r1.readException()     // Catch: java.lang.Throwable -> L2d
                    android.os.IBinder r2 = r1.readStrongBinder()     // Catch: java.lang.Throwable -> L2d
                    com.ss.android.socialbase.downloader.r.g r2 = com.ss.android.socialbase.downloader.r.g.j.j(r2)     // Catch: java.lang.Throwable -> L2d
                    goto L26
                L3b:
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // com.ss.android.socialbase.downloader.ae.j
            public int vl() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.model.DownloadAidlTask"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2d
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2d
                    r3 = 15
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2d
                    if (r2 != 0) goto L2f
                    com.ss.android.socialbase.downloader.ae.j r2 = com.ss.android.socialbase.downloader.ae.j.AbstractBinderC0232j.jy()     // Catch: java.lang.Throwable -> L2d
                    if (r2 == 0) goto L2f
                    com.ss.android.socialbase.downloader.ae.j r2 = com.ss.android.socialbase.downloader.ae.j.AbstractBinderC0232j.jy()     // Catch: java.lang.Throwable -> L2d
                    int r2 = r2.vl()     // Catch: java.lang.Throwable -> L2d
                L26:
                    r1.recycle()
                    r0.recycle()
                    return r2
                L2d:
                    r2 = move-exception
                    goto L37
                L2f:
                    r1.readException()     // Catch: java.lang.Throwable -> L2d
                    int r2 = r1.readInt()     // Catch: java.lang.Throwable -> L2d
                    goto L26
                L37:
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // com.ss.android.socialbase.downloader.ae.j
            public com.ss.android.socialbase.downloader.r.m xt() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.model.DownloadAidlTask"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2c
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2c
                    r3 = 2
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2c
                    if (r2 != 0) goto L2e
                    com.ss.android.socialbase.downloader.ae.j r2 = com.ss.android.socialbase.downloader.ae.j.AbstractBinderC0232j.jy()     // Catch: java.lang.Throwable -> L2c
                    if (r2 == 0) goto L2e
                    com.ss.android.socialbase.downloader.ae.j r2 = com.ss.android.socialbase.downloader.ae.j.AbstractBinderC0232j.jy()     // Catch: java.lang.Throwable -> L2c
                    com.ss.android.socialbase.downloader.r.m r2 = r2.xt()     // Catch: java.lang.Throwable -> L2c
                L25:
                    r1.recycle()
                    r0.recycle()
                    return r2
                L2c:
                    r2 = move-exception
                    goto L3a
                L2e:
                    r1.readException()     // Catch: java.lang.Throwable -> L2c
                    android.os.IBinder r2 = r1.readStrongBinder()     // Catch: java.lang.Throwable -> L2c
                    com.ss.android.socialbase.downloader.r.m r2 = com.ss.android.socialbase.downloader.r.m.j.j(r2)     // Catch: java.lang.Throwable -> L2c
                    goto L25
                L3a:
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // com.ss.android.socialbase.downloader.ae.j
            public com.ss.android.socialbase.downloader.r.oq xt(int r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.model.DownloadAidlTask"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2f
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L2f
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2f
                    r3 = 5
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2f
                    if (r2 != 0) goto L31
                    com.ss.android.socialbase.downloader.ae.j r2 = com.ss.android.socialbase.downloader.ae.j.AbstractBinderC0232j.jy()     // Catch: java.lang.Throwable -> L2f
                    if (r2 == 0) goto L31
                    com.ss.android.socialbase.downloader.ae.j r2 = com.ss.android.socialbase.downloader.ae.j.AbstractBinderC0232j.jy()     // Catch: java.lang.Throwable -> L2f
                    com.ss.android.socialbase.downloader.r.oq r6 = r2.xt(r6)     // Catch: java.lang.Throwable -> L2f
                L28:
                    r1.recycle()
                    r0.recycle()
                    return r6
                L2f:
                    r6 = move-exception
                    goto L3d
                L31:
                    r1.readException()     // Catch: java.lang.Throwable -> L2f
                    android.os.IBinder r6 = r1.readStrongBinder()     // Catch: java.lang.Throwable -> L2f
                    com.ss.android.socialbase.downloader.r.oq r6 = com.ss.android.socialbase.downloader.r.oq.j.j(r6)     // Catch: java.lang.Throwable -> L2f
                    goto L28
                L3d:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }
        }

        public AbstractBinderC0232j() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "com.ss.android.socialbase.downloader.model.DownloadAidlTask"
                r1.attachInterface(r1, r0)
                return
        }

        public static com.ss.android.socialbase.downloader.ae.j j(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.ss.android.socialbase.downloader.model.DownloadAidlTask"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof com.ss.android.socialbase.downloader.ae.j
                if (r1 == 0) goto L13
                com.ss.android.socialbase.downloader.ae.j r0 = (com.ss.android.socialbase.downloader.ae.j) r0
                return r0
            L13:
                com.ss.android.socialbase.downloader.ae.j$j$j r0 = new com.ss.android.socialbase.downloader.ae.j$j$j
                r0.<init>(r2)
                return r0
        }

        public static com.ss.android.socialbase.downloader.ae.j jy() {
                com.ss.android.socialbase.downloader.ae.j r0 = com.ss.android.socialbase.downloader.ae.j.AbstractBinderC0232j.C0233j.j
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
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                java.lang.String r2 = "com.ss.android.socialbase.downloader.model.DownloadAidlTask"
                if (r4 == r0) goto L15d
                r0 = 0
                switch(r4) {
                    case 1: goto L145;
                    case 2: goto L131;
                    case 3: goto L11f;
                    case 4: goto L103;
                    case 5: goto Leb;
                    case 6: goto Ld7;
                    case 7: goto Lc3;
                    case 8: goto Laf;
                    case 9: goto L9b;
                    case 10: goto L87;
                    case 11: goto L73;
                    case 12: goto L5f;
                    case 13: goto L4b;
                    case 14: goto L37;
                    case 15: goto L29;
                    case 16: goto L11;
                    default: goto Lc;
                }
            Lc:
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            L11:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                com.ss.android.socialbase.downloader.r.jy r4 = r3.cw(r4)
                r6.writeNoException()
                if (r4 == 0) goto L25
                android.os.IBinder r0 = r4.asBinder()
            L25:
                r6.writeStrongBinder(r0)
                return r1
            L29:
                r5.enforceInterface(r2)
                int r4 = r3.vl()
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
            L37:
                r5.enforceInterface(r2)
                com.ss.android.socialbase.downloader.r.tl r4 = r3.qv()
                r6.writeNoException()
                if (r4 == 0) goto L47
                android.os.IBinder r0 = r4.asBinder()
            L47:
                r6.writeStrongBinder(r0)
                return r1
            L4b:
                r5.enforceInterface(r2)
                com.ss.android.socialbase.downloader.r.qv r4 = r3.oq()
                r6.writeNoException()
                if (r4 == 0) goto L5b
                android.os.IBinder r0 = r4.asBinder()
            L5b:
                r6.writeStrongBinder(r0)
                return r1
            L5f:
                r5.enforceInterface(r2)
                com.ss.android.socialbase.downloader.r.i r4 = r3.g()
                r6.writeNoException()
                if (r4 == 0) goto L6f
                android.os.IBinder r0 = r4.asBinder()
            L6f:
                r6.writeStrongBinder(r0)
                return r1
            L73:
                r5.enforceInterface(r2)
                com.ss.android.socialbase.downloader.r.ed r4 = r3.tl()
                r6.writeNoException()
                if (r4 == 0) goto L83
                android.os.IBinder r0 = r4.asBinder()
            L83:
                r6.writeStrongBinder(r0)
                return r1
            L87:
                r5.enforceInterface(r2)
                com.ss.android.socialbase.downloader.r.v r4 = r3.ae()
                r6.writeNoException()
                if (r4 == 0) goto L97
                android.os.IBinder r0 = r4.asBinder()
            L97:
                r6.writeStrongBinder(r0)
                return r1
            L9b:
                r5.enforceInterface(r2)
                com.ss.android.socialbase.downloader.r.ae r4 = r3.m()
                r6.writeNoException()
                if (r4 == 0) goto Lab
                android.os.IBinder r0 = r4.asBinder()
            Lab:
                r6.writeStrongBinder(r0)
                return r1
            Laf:
                r5.enforceInterface(r2)
                com.ss.android.socialbase.downloader.r.g r4 = r3.up()
                r6.writeNoException()
                if (r4 == 0) goto Lbf
                android.os.IBinder r0 = r4.asBinder()
            Lbf:
                r6.writeStrongBinder(r0)
                return r1
            Lc3:
                r5.enforceInterface(r2)
                com.ss.android.socialbase.downloader.r.rn r4 = r3.r()
                r6.writeNoException()
                if (r4 == 0) goto Ld3
                android.os.IBinder r0 = r4.asBinder()
            Ld3:
                r6.writeStrongBinder(r0)
                return r1
            Ld7:
                r5.enforceInterface(r2)
                com.ss.android.socialbase.downloader.r.p r4 = r3.cw()
                r6.writeNoException()
                if (r4 == 0) goto Le7
                android.os.IBinder r0 = r4.asBinder()
            Le7:
                r6.writeStrongBinder(r0)
                return r1
            Leb:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                com.ss.android.socialbase.downloader.r.oq r4 = r3.xt(r4)
                r6.writeNoException()
                if (r4 == 0) goto Lff
                android.os.IBinder r0 = r4.asBinder()
            Lff:
                r6.writeStrongBinder(r0)
                return r1
            L103:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                int r5 = r5.readInt()
                com.ss.android.socialbase.downloader.r.oq r4 = r3.j(r4, r5)
                r6.writeNoException()
                if (r4 == 0) goto L11b
                android.os.IBinder r0 = r4.asBinder()
            L11b:
                r6.writeStrongBinder(r0)
                return r1
            L11f:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                int r4 = r3.j(r4)
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
            L131:
                r5.enforceInterface(r2)
                com.ss.android.socialbase.downloader.r.m r4 = r3.xt()
                r6.writeNoException()
                if (r4 == 0) goto L141
                android.os.IBinder r0 = r4.asBinder()
            L141:
                r6.writeStrongBinder(r0)
                return r1
            L145:
                r5.enforceInterface(r2)
                com.ss.android.socialbase.downloader.ae.cw r4 = r3.j()
                r6.writeNoException()
                if (r4 == 0) goto L158
                r6.writeInt(r1)
                r4.writeToParcel(r6, r1)
                goto L15c
            L158:
                r4 = 0
                r6.writeInt(r4)
            L15c:
                return r1
            L15d:
                r6.writeString(r2)
                return r1
        }
    }

    com.ss.android.socialbase.downloader.r.v ae() throws android.os.RemoteException;

    com.ss.android.socialbase.downloader.r.jy cw(int r1) throws android.os.RemoteException;

    com.ss.android.socialbase.downloader.r.p cw() throws android.os.RemoteException;

    com.ss.android.socialbase.downloader.r.i g() throws android.os.RemoteException;

    int j(int r1) throws android.os.RemoteException;

    com.ss.android.socialbase.downloader.ae.cw j() throws android.os.RemoteException;

    com.ss.android.socialbase.downloader.r.oq j(int r1, int r2) throws android.os.RemoteException;

    com.ss.android.socialbase.downloader.r.ae m() throws android.os.RemoteException;

    com.ss.android.socialbase.downloader.r.qv oq() throws android.os.RemoteException;

    com.ss.android.socialbase.downloader.r.tl qv() throws android.os.RemoteException;

    com.ss.android.socialbase.downloader.r.rn r() throws android.os.RemoteException;

    com.ss.android.socialbase.downloader.r.ed tl() throws android.os.RemoteException;

    com.ss.android.socialbase.downloader.r.g up() throws android.os.RemoteException;

    int vl() throws android.os.RemoteException;

    com.ss.android.socialbase.downloader.r.m xt() throws android.os.RemoteException;

    com.ss.android.socialbase.downloader.r.oq xt(int r1) throws android.os.RemoteException;
}
