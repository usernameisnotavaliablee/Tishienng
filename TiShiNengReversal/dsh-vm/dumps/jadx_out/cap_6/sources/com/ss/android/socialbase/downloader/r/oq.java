package com.ss.android.socialbase.downloader.r;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface oq extends android.os.IInterface {

    public static abstract class j extends android.os.Binder implements com.ss.android.socialbase.downloader.r.oq {

        /* renamed from: com.ss.android.socialbase.downloader.r.oq$j$j, reason: collision with other inner class name */
        private static class C0020j implements com.ss.android.socialbase.downloader.r.oq {
            public static com.ss.android.socialbase.downloader.r.oq j;
            private android.os.IBinder xt;

            C0020j(android.os.IBinder r1) {
                    r0 = this;
                    r0.<init>()
                    r0.xt = r1
                    return
            }

            @Override // com.ss.android.socialbase.downloader.r.oq
            public void ae(com.ss.android.socialbase.downloader.ae.cw r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlListener"
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
                    r4 = 9
                    boolean r2 = r3.transact(r4, r0, r1, r2)     // Catch: java.lang.Throwable -> L18
                    if (r2 != 0) goto L3b
                    com.ss.android.socialbase.downloader.r.oq r2 = com.ss.android.socialbase.downloader.r.oq.j.xt()     // Catch: java.lang.Throwable -> L18
                    if (r2 == 0) goto L3b
                    com.ss.android.socialbase.downloader.r.oq r2 = com.ss.android.socialbase.downloader.r.oq.j.xt()     // Catch: java.lang.Throwable -> L18
                    r2.ae(r6)     // Catch: java.lang.Throwable -> L18
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

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                    r1 = this;
                    android.os.IBinder r0 = r1.xt
                    return r0
            }

            @Override // com.ss.android.socialbase.downloader.r.oq
            public void cw(com.ss.android.socialbase.downloader.ae.cw r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlListener"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L18
                    r2 = 0
                    if (r6 == 0) goto L1a
                    r3 = 1
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L18
                    r6.writeToParcel(r0, r2)     // Catch: java.lang.Throwable -> L18
                    goto L1d
                L18:
                    r6 = move-exception
                    goto L3e
                L1a:
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L18
                L1d:
                    android.os.IBinder r3 = r5.xt     // Catch: java.lang.Throwable -> L18
                    r4 = 4
                    boolean r2 = r3.transact(r4, r0, r1, r2)     // Catch: java.lang.Throwable -> L18
                    if (r2 != 0) goto L3a
                    com.ss.android.socialbase.downloader.r.oq r2 = com.ss.android.socialbase.downloader.r.oq.j.xt()     // Catch: java.lang.Throwable -> L18
                    if (r2 == 0) goto L3a
                    com.ss.android.socialbase.downloader.r.oq r2 = com.ss.android.socialbase.downloader.r.oq.j.xt()     // Catch: java.lang.Throwable -> L18
                    r2.cw(r6)     // Catch: java.lang.Throwable -> L18
                L33:
                    r1.recycle()
                    r0.recycle()
                    return
                L3a:
                    r1.readException()     // Catch: java.lang.Throwable -> L18
                    goto L33
                L3e:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.r.oq
            public void cw(com.ss.android.socialbase.downloader.ae.cw r6, com.ss.android.socialbase.downloader.up.j r7) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlListener"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L18
                    r2 = 1
                    r3 = 0
                    if (r6 == 0) goto L1a
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L18
                    r6.writeToParcel(r0, r3)     // Catch: java.lang.Throwable -> L18
                    goto L1d
                L18:
                    r6 = move-exception
                    goto L4b
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
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L18
                    r4 = 12
                    boolean r2 = r2.transact(r4, r0, r1, r3)     // Catch: java.lang.Throwable -> L18
                    if (r2 != 0) goto L47
                    com.ss.android.socialbase.downloader.r.oq r2 = com.ss.android.socialbase.downloader.r.oq.j.xt()     // Catch: java.lang.Throwable -> L18
                    if (r2 == 0) goto L47
                    com.ss.android.socialbase.downloader.r.oq r2 = com.ss.android.socialbase.downloader.r.oq.j.xt()     // Catch: java.lang.Throwable -> L18
                    r2.cw(r6, r7)     // Catch: java.lang.Throwable -> L18
                L40:
                    r1.recycle()
                    r0.recycle()
                    return
                L47:
                    r1.readException()     // Catch: java.lang.Throwable -> L18
                    goto L40
                L4b:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.r.oq
            public void g(com.ss.android.socialbase.downloader.ae.cw r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlListener"
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
                    r4 = 13
                    boolean r2 = r3.transact(r4, r0, r1, r2)     // Catch: java.lang.Throwable -> L18
                    if (r2 != 0) goto L3b
                    com.ss.android.socialbase.downloader.r.oq r2 = com.ss.android.socialbase.downloader.r.oq.j.xt()     // Catch: java.lang.Throwable -> L18
                    if (r2 == 0) goto L3b
                    com.ss.android.socialbase.downloader.r.oq r2 = com.ss.android.socialbase.downloader.r.oq.j.xt()     // Catch: java.lang.Throwable -> L18
                    r2.g(r6)     // Catch: java.lang.Throwable -> L18
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

            @Override // com.ss.android.socialbase.downloader.r.oq
            public int j() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlListener"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2c
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L2c
                    r3 = 1
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2c
                    if (r2 != 0) goto L2e
                    com.ss.android.socialbase.downloader.r.oq r2 = com.ss.android.socialbase.downloader.r.oq.j.xt()     // Catch: java.lang.Throwable -> L2c
                    if (r2 == 0) goto L2e
                    com.ss.android.socialbase.downloader.r.oq r2 = com.ss.android.socialbase.downloader.r.oq.j.xt()     // Catch: java.lang.Throwable -> L2c
                    int r2 = r2.j()     // Catch: java.lang.Throwable -> L2c
                L25:
                    r1.recycle()
                    r0.recycle()
                    return r2
                L2c:
                    r2 = move-exception
                    goto L36
                L2e:
                    r1.readException()     // Catch: java.lang.Throwable -> L2c
                    int r2 = r1.readInt()     // Catch: java.lang.Throwable -> L2c
                    goto L25
                L36:
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // com.ss.android.socialbase.downloader.r.oq
            public void j(com.ss.android.socialbase.downloader.ae.cw r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlListener"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L18
                    r2 = 0
                    if (r6 == 0) goto L1a
                    r3 = 1
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L18
                    r6.writeToParcel(r0, r2)     // Catch: java.lang.Throwable -> L18
                    goto L1d
                L18:
                    r6 = move-exception
                    goto L3e
                L1a:
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L18
                L1d:
                    android.os.IBinder r3 = r5.xt     // Catch: java.lang.Throwable -> L18
                    r4 = 2
                    boolean r2 = r3.transact(r4, r0, r1, r2)     // Catch: java.lang.Throwable -> L18
                    if (r2 != 0) goto L3a
                    com.ss.android.socialbase.downloader.r.oq r2 = com.ss.android.socialbase.downloader.r.oq.j.xt()     // Catch: java.lang.Throwable -> L18
                    if (r2 == 0) goto L3a
                    com.ss.android.socialbase.downloader.r.oq r2 = com.ss.android.socialbase.downloader.r.oq.j.xt()     // Catch: java.lang.Throwable -> L18
                    r2.j(r6)     // Catch: java.lang.Throwable -> L18
                L33:
                    r1.recycle()
                    r0.recycle()
                    return
                L3a:
                    r1.readException()     // Catch: java.lang.Throwable -> L18
                    goto L33
                L3e:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.r.oq
            public void j(com.ss.android.socialbase.downloader.ae.cw r6, com.ss.android.socialbase.downloader.up.j r7) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlListener"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L18
                    r2 = 1
                    r3 = 0
                    if (r6 == 0) goto L1a
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L18
                    r6.writeToParcel(r0, r3)     // Catch: java.lang.Throwable -> L18
                    goto L1d
                L18:
                    r6 = move-exception
                    goto L4a
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
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L18
                    r4 = 7
                    boolean r2 = r2.transact(r4, r0, r1, r3)     // Catch: java.lang.Throwable -> L18
                    if (r2 != 0) goto L46
                    com.ss.android.socialbase.downloader.r.oq r2 = com.ss.android.socialbase.downloader.r.oq.j.xt()     // Catch: java.lang.Throwable -> L18
                    if (r2 == 0) goto L46
                    com.ss.android.socialbase.downloader.r.oq r2 = com.ss.android.socialbase.downloader.r.oq.j.xt()     // Catch: java.lang.Throwable -> L18
                    r2.j(r6, r7)     // Catch: java.lang.Throwable -> L18
                L3f:
                    r1.recycle()
                    r0.recycle()
                    return
                L46:
                    r1.readException()     // Catch: java.lang.Throwable -> L18
                    goto L3f
                L4a:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.r.oq
            public void m(com.ss.android.socialbase.downloader.ae.cw r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlListener"
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
                    r4 = 8
                    boolean r2 = r3.transact(r4, r0, r1, r2)     // Catch: java.lang.Throwable -> L18
                    if (r2 != 0) goto L3b
                    com.ss.android.socialbase.downloader.r.oq r2 = com.ss.android.socialbase.downloader.r.oq.j.xt()     // Catch: java.lang.Throwable -> L18
                    if (r2 == 0) goto L3b
                    com.ss.android.socialbase.downloader.r.oq r2 = com.ss.android.socialbase.downloader.r.oq.j.xt()     // Catch: java.lang.Throwable -> L18
                    r2.m(r6)     // Catch: java.lang.Throwable -> L18
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

            @Override // com.ss.android.socialbase.downloader.r.oq
            public void r(com.ss.android.socialbase.downloader.ae.cw r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlListener"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L18
                    r2 = 0
                    if (r6 == 0) goto L1a
                    r3 = 1
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L18
                    r6.writeToParcel(r0, r2)     // Catch: java.lang.Throwable -> L18
                    goto L1d
                L18:
                    r6 = move-exception
                    goto L3e
                L1a:
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L18
                L1d:
                    android.os.IBinder r3 = r5.xt     // Catch: java.lang.Throwable -> L18
                    r4 = 5
                    boolean r2 = r3.transact(r4, r0, r1, r2)     // Catch: java.lang.Throwable -> L18
                    if (r2 != 0) goto L3a
                    com.ss.android.socialbase.downloader.r.oq r2 = com.ss.android.socialbase.downloader.r.oq.j.xt()     // Catch: java.lang.Throwable -> L18
                    if (r2 == 0) goto L3a
                    com.ss.android.socialbase.downloader.r.oq r2 = com.ss.android.socialbase.downloader.r.oq.j.xt()     // Catch: java.lang.Throwable -> L18
                    r2.r(r6)     // Catch: java.lang.Throwable -> L18
                L33:
                    r1.recycle()
                    r0.recycle()
                    return
                L3a:
                    r1.readException()     // Catch: java.lang.Throwable -> L18
                    goto L33
                L3e:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.r.oq
            public void tl(com.ss.android.socialbase.downloader.ae.cw r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlListener"
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
                    r4 = 10
                    boolean r2 = r3.transact(r4, r0, r1, r2)     // Catch: java.lang.Throwable -> L18
                    if (r2 != 0) goto L3b
                    com.ss.android.socialbase.downloader.r.oq r2 = com.ss.android.socialbase.downloader.r.oq.j.xt()     // Catch: java.lang.Throwable -> L18
                    if (r2 == 0) goto L3b
                    com.ss.android.socialbase.downloader.r.oq r2 = com.ss.android.socialbase.downloader.r.oq.j.xt()     // Catch: java.lang.Throwable -> L18
                    r2.tl(r6)     // Catch: java.lang.Throwable -> L18
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

            @Override // com.ss.android.socialbase.downloader.r.oq
            public void up(com.ss.android.socialbase.downloader.ae.cw r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlListener"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L18
                    r2 = 0
                    if (r6 == 0) goto L1a
                    r3 = 1
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L18
                    r6.writeToParcel(r0, r2)     // Catch: java.lang.Throwable -> L18
                    goto L1d
                L18:
                    r6 = move-exception
                    goto L3e
                L1a:
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L18
                L1d:
                    android.os.IBinder r3 = r5.xt     // Catch: java.lang.Throwable -> L18
                    r4 = 6
                    boolean r2 = r3.transact(r4, r0, r1, r2)     // Catch: java.lang.Throwable -> L18
                    if (r2 != 0) goto L3a
                    com.ss.android.socialbase.downloader.r.oq r2 = com.ss.android.socialbase.downloader.r.oq.j.xt()     // Catch: java.lang.Throwable -> L18
                    if (r2 == 0) goto L3a
                    com.ss.android.socialbase.downloader.r.oq r2 = com.ss.android.socialbase.downloader.r.oq.j.xt()     // Catch: java.lang.Throwable -> L18
                    r2.up(r6)     // Catch: java.lang.Throwable -> L18
                L33:
                    r1.recycle()
                    r0.recycle()
                    return
                L3a:
                    r1.readException()     // Catch: java.lang.Throwable -> L18
                    goto L33
                L3e:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.r.oq
            public void xt(com.ss.android.socialbase.downloader.ae.cw r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlListener"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L18
                    r2 = 0
                    if (r6 == 0) goto L1a
                    r3 = 1
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L18
                    r6.writeToParcel(r0, r2)     // Catch: java.lang.Throwable -> L18
                    goto L1d
                L18:
                    r6 = move-exception
                    goto L3e
                L1a:
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L18
                L1d:
                    android.os.IBinder r3 = r5.xt     // Catch: java.lang.Throwable -> L18
                    r4 = 3
                    boolean r2 = r3.transact(r4, r0, r1, r2)     // Catch: java.lang.Throwable -> L18
                    if (r2 != 0) goto L3a
                    com.ss.android.socialbase.downloader.r.oq r2 = com.ss.android.socialbase.downloader.r.oq.j.xt()     // Catch: java.lang.Throwable -> L18
                    if (r2 == 0) goto L3a
                    com.ss.android.socialbase.downloader.r.oq r2 = com.ss.android.socialbase.downloader.r.oq.j.xt()     // Catch: java.lang.Throwable -> L18
                    r2.xt(r6)     // Catch: java.lang.Throwable -> L18
                L33:
                    r1.recycle()
                    r0.recycle()
                    return
                L3a:
                    r1.readException()     // Catch: java.lang.Throwable -> L18
                    goto L33
                L3e:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.ss.android.socialbase.downloader.r.oq
            public void xt(com.ss.android.socialbase.downloader.ae.cw r6, com.ss.android.socialbase.downloader.up.j r7) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlListener"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L18
                    r2 = 1
                    r3 = 0
                    if (r6 == 0) goto L1a
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L18
                    r6.writeToParcel(r0, r3)     // Catch: java.lang.Throwable -> L18
                    goto L1d
                L18:
                    r6 = move-exception
                    goto L4b
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
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L18
                    r4 = 11
                    boolean r2 = r2.transact(r4, r0, r1, r3)     // Catch: java.lang.Throwable -> L18
                    if (r2 != 0) goto L47
                    com.ss.android.socialbase.downloader.r.oq r2 = com.ss.android.socialbase.downloader.r.oq.j.xt()     // Catch: java.lang.Throwable -> L18
                    if (r2 == 0) goto L47
                    com.ss.android.socialbase.downloader.r.oq r2 = com.ss.android.socialbase.downloader.r.oq.j.xt()     // Catch: java.lang.Throwable -> L18
                    r2.xt(r6, r7)     // Catch: java.lang.Throwable -> L18
                L40:
                    r1.recycle()
                    r0.recycle()
                    return
                L47:
                    r1.readException()     // Catch: java.lang.Throwable -> L18
                    goto L40
                L4b:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }
        }

        public j() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlListener"
                r1.attachInterface(r1, r0)
                return
        }

        public static com.ss.android.socialbase.downloader.r.oq j(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlListener"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof com.ss.android.socialbase.downloader.r.oq
                if (r1 == 0) goto L13
                com.ss.android.socialbase.downloader.r.oq r0 = (com.ss.android.socialbase.downloader.r.oq) r0
                return r0
            L13:
                com.ss.android.socialbase.downloader.r.oq$j$j r0 = new com.ss.android.socialbase.downloader.r.oq$j$j
                r0.<init>(r2)
                return r0
        }

        public static com.ss.android.socialbase.downloader.r.oq xt() {
                com.ss.android.socialbase.downloader.r.oq r0 = com.ss.android.socialbase.downloader.r.oq.j.C0020j.j
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
                java.lang.String r2 = "com.ss.android.socialbase.downloader.depend.IDownloadAidlListener"
                if (r4 == r0) goto L17b
                r0 = 0
                switch(r4) {
                    case 1: goto L16d;
                    case 2: goto L154;
                    case 3: goto L13b;
                    case 4: goto L122;
                    case 5: goto L109;
                    case 6: goto Lf0;
                    case 7: goto Lc7;
                    case 8: goto Lae;
                    case 9: goto L95;
                    case 10: goto L7c;
                    case 11: goto L53;
                    case 12: goto L2a;
                    case 13: goto L11;
                    default: goto Lc;
                }
            Lc:
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            L11:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L23
                android.os.Parcelable$Creator r4 = com.ss.android.socialbase.downloader.ae.cw.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                com.ss.android.socialbase.downloader.ae.cw r0 = (com.ss.android.socialbase.downloader.ae.cw) r0
            L23:
                r3.g(r0)
                r6.writeNoException()
                return r1
            L2a:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L3c
                android.os.Parcelable$Creator r4 = com.ss.android.socialbase.downloader.ae.cw.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                com.ss.android.socialbase.downloader.ae.cw r4 = (com.ss.android.socialbase.downloader.ae.cw) r4
                goto L3d
            L3c:
                r4 = r0
            L3d:
                int r7 = r5.readInt()
                if (r7 == 0) goto L4c
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.up.j> r7 = com.ss.android.socialbase.downloader.up.j.CREATOR
                java.lang.Object r5 = r7.createFromParcel(r5)
                r0 = r5
                com.ss.android.socialbase.downloader.up.j r0 = (com.ss.android.socialbase.downloader.up.j) r0
            L4c:
                r3.cw(r4, r0)
                r6.writeNoException()
                return r1
            L53:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L65
                android.os.Parcelable$Creator r4 = com.ss.android.socialbase.downloader.ae.cw.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                com.ss.android.socialbase.downloader.ae.cw r4 = (com.ss.android.socialbase.downloader.ae.cw) r4
                goto L66
            L65:
                r4 = r0
            L66:
                int r7 = r5.readInt()
                if (r7 == 0) goto L75
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.up.j> r7 = com.ss.android.socialbase.downloader.up.j.CREATOR
                java.lang.Object r5 = r7.createFromParcel(r5)
                r0 = r5
                com.ss.android.socialbase.downloader.up.j r0 = (com.ss.android.socialbase.downloader.up.j) r0
            L75:
                r3.xt(r4, r0)
                r6.writeNoException()
                return r1
            L7c:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L8e
                android.os.Parcelable$Creator r4 = com.ss.android.socialbase.downloader.ae.cw.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                com.ss.android.socialbase.downloader.ae.cw r0 = (com.ss.android.socialbase.downloader.ae.cw) r0
            L8e:
                r3.tl(r0)
                r6.writeNoException()
                return r1
            L95:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto La7
                android.os.Parcelable$Creator r4 = com.ss.android.socialbase.downloader.ae.cw.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                com.ss.android.socialbase.downloader.ae.cw r0 = (com.ss.android.socialbase.downloader.ae.cw) r0
            La7:
                r3.ae(r0)
                r6.writeNoException()
                return r1
            Lae:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto Lc0
                android.os.Parcelable$Creator r4 = com.ss.android.socialbase.downloader.ae.cw.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                com.ss.android.socialbase.downloader.ae.cw r0 = (com.ss.android.socialbase.downloader.ae.cw) r0
            Lc0:
                r3.m(r0)
                r6.writeNoException()
                return r1
            Lc7:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto Ld9
                android.os.Parcelable$Creator r4 = com.ss.android.socialbase.downloader.ae.cw.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                com.ss.android.socialbase.downloader.ae.cw r4 = (com.ss.android.socialbase.downloader.ae.cw) r4
                goto Lda
            Ld9:
                r4 = r0
            Lda:
                int r7 = r5.readInt()
                if (r7 == 0) goto Le9
                android.os.Parcelable$Creator<com.ss.android.socialbase.downloader.up.j> r7 = com.ss.android.socialbase.downloader.up.j.CREATOR
                java.lang.Object r5 = r7.createFromParcel(r5)
                r0 = r5
                com.ss.android.socialbase.downloader.up.j r0 = (com.ss.android.socialbase.downloader.up.j) r0
            Le9:
                r3.j(r4, r0)
                r6.writeNoException()
                return r1
            Lf0:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L102
                android.os.Parcelable$Creator r4 = com.ss.android.socialbase.downloader.ae.cw.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                com.ss.android.socialbase.downloader.ae.cw r0 = (com.ss.android.socialbase.downloader.ae.cw) r0
            L102:
                r3.up(r0)
                r6.writeNoException()
                return r1
            L109:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L11b
                android.os.Parcelable$Creator r4 = com.ss.android.socialbase.downloader.ae.cw.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                com.ss.android.socialbase.downloader.ae.cw r0 = (com.ss.android.socialbase.downloader.ae.cw) r0
            L11b:
                r3.r(r0)
                r6.writeNoException()
                return r1
            L122:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L134
                android.os.Parcelable$Creator r4 = com.ss.android.socialbase.downloader.ae.cw.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                com.ss.android.socialbase.downloader.ae.cw r0 = (com.ss.android.socialbase.downloader.ae.cw) r0
            L134:
                r3.cw(r0)
                r6.writeNoException()
                return r1
            L13b:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L14d
                android.os.Parcelable$Creator r4 = com.ss.android.socialbase.downloader.ae.cw.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                com.ss.android.socialbase.downloader.ae.cw r0 = (com.ss.android.socialbase.downloader.ae.cw) r0
            L14d:
                r3.xt(r0)
                r6.writeNoException()
                return r1
            L154:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L166
                android.os.Parcelable$Creator r4 = com.ss.android.socialbase.downloader.ae.cw.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                com.ss.android.socialbase.downloader.ae.cw r0 = (com.ss.android.socialbase.downloader.ae.cw) r0
            L166:
                r3.j(r0)
                r6.writeNoException()
                return r1
            L16d:
                r5.enforceInterface(r2)
                int r4 = r3.j()
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
            L17b:
                r6.writeString(r2)
                return r1
        }
    }

    void ae(com.ss.android.socialbase.downloader.ae.cw r1) throws android.os.RemoteException;

    void cw(com.ss.android.socialbase.downloader.ae.cw r1) throws android.os.RemoteException;

    void cw(com.ss.android.socialbase.downloader.ae.cw r1, com.ss.android.socialbase.downloader.up.j r2) throws android.os.RemoteException;

    void g(com.ss.android.socialbase.downloader.ae.cw r1) throws android.os.RemoteException;

    int j() throws android.os.RemoteException;

    void j(com.ss.android.socialbase.downloader.ae.cw r1) throws android.os.RemoteException;

    void j(com.ss.android.socialbase.downloader.ae.cw r1, com.ss.android.socialbase.downloader.up.j r2) throws android.os.RemoteException;

    void m(com.ss.android.socialbase.downloader.ae.cw r1) throws android.os.RemoteException;

    void r(com.ss.android.socialbase.downloader.ae.cw r1) throws android.os.RemoteException;

    void tl(com.ss.android.socialbase.downloader.ae.cw r1) throws android.os.RemoteException;

    void up(com.ss.android.socialbase.downloader.ae.cw r1) throws android.os.RemoteException;

    void xt(com.ss.android.socialbase.downloader.ae.cw r1) throws android.os.RemoteException;

    void xt(com.ss.android.socialbase.downloader.ae.cw r1, com.ss.android.socialbase.downloader.up.j r2) throws android.os.RemoteException;
}
