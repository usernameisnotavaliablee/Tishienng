package com.kwad.framework.filedownloader.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface b extends android.os.IInterface {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class a extends android.os.Binder implements com.kwad.framework.filedownloader.c.b {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.kwad.framework.filedownloader.c.b$a$a, reason: collision with other inner class name */
        static class C0115a implements com.kwad.framework.filedownloader.c.b {
            public static com.kwad.framework.filedownloader.c.b aoD;
            private android.os.IBinder mRemote;

            C0115a(android.os.IBinder r1) {
                    r0 = this;
                    r0.<init>()
                    r0.mRemote = r1
                    return
            }

            @Override // com.kwad.framework.filedownloader.c.b
            public final void a(com.kwad.framework.filedownloader.c.a r5) {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "com.kwad.framework.filedownloader.i.IFileDownloadIPCService"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L11
                    r1 = 0
                    if (r5 == 0) goto L13
                    android.os.IBinder r2 = r5.asBinder()     // Catch: java.lang.Throwable -> L11
                    goto L14
                L11:
                    r5 = move-exception
                    goto L35
                L13:
                    r2 = r1
                L14:
                    r0.writeStrongBinder(r2)     // Catch: java.lang.Throwable -> L11
                    android.os.IBinder r2 = r4.mRemote     // Catch: java.lang.Throwable -> L11
                    r3 = 1
                    boolean r1 = r2.transact(r3, r0, r1, r3)     // Catch: java.lang.Throwable -> L11
                    if (r1 != 0) goto L31
                    com.kwad.framework.filedownloader.c.b r1 = com.kwad.framework.filedownloader.c.b.a.yK()     // Catch: java.lang.Throwable -> L11
                    if (r1 == 0) goto L31
                    com.kwad.framework.filedownloader.c.b r1 = com.kwad.framework.filedownloader.c.b.a.yK()     // Catch: java.lang.Throwable -> L11
                    r1.a(r5)     // Catch: java.lang.Throwable -> L11
                    r0.recycle()
                    return
                L31:
                    r0.recycle()
                    return
                L35:
                    r0.recycle()
                    throw r5
            }

            @Override // android.os.IInterface
            public final android.os.IBinder asBinder() {
                    r1 = this;
                    android.os.IBinder r0 = r1.mRemote
                    return r0
            }

            @Override // com.kwad.framework.filedownloader.c.b
            public final void b(com.kwad.framework.filedownloader.c.a r6) {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "com.kwad.framework.filedownloader.i.IFileDownloadIPCService"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L11
                    r1 = 0
                    if (r6 == 0) goto L13
                    android.os.IBinder r2 = r6.asBinder()     // Catch: java.lang.Throwable -> L11
                    goto L14
                L11:
                    r6 = move-exception
                    goto L36
                L13:
                    r2 = r1
                L14:
                    r0.writeStrongBinder(r2)     // Catch: java.lang.Throwable -> L11
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L11
                    r3 = 2
                    r4 = 1
                    boolean r1 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L11
                    if (r1 != 0) goto L32
                    com.kwad.framework.filedownloader.c.b r1 = com.kwad.framework.filedownloader.c.b.a.yK()     // Catch: java.lang.Throwable -> L11
                    if (r1 == 0) goto L32
                    com.kwad.framework.filedownloader.c.b r1 = com.kwad.framework.filedownloader.c.b.a.yK()     // Catch: java.lang.Throwable -> L11
                    r1.b(r6)     // Catch: java.lang.Throwable -> L11
                    r0.recycle()
                    return
                L32:
                    r0.recycle()
                    return
                L36:
                    r0.recycle()
                    throw r6
            }

            @Override // com.kwad.framework.filedownloader.c.b
            public final void b(java.lang.String r14, java.lang.String r15, boolean r16, int r17, int r18, int r19, boolean r20, com.kwad.framework.filedownloader.d.b r21, boolean r22) {
                    r13 = this;
                    r8 = r21
                    android.os.Parcel r10 = android.os.Parcel.obtain()
                    android.os.Parcel r11 = android.os.Parcel.obtain()
                    java.lang.String r0 = "com.kwad.framework.filedownloader.i.IFileDownloadIPCService"
                    r10.writeInterfaceToken(r0)     // Catch: java.lang.Throwable -> L3b
                    r10.writeString(r14)     // Catch: java.lang.Throwable -> L3b
                    r10.writeString(r15)     // Catch: java.lang.Throwable -> L3b
                    r3 = r16
                    r10.writeInt(r3)     // Catch: java.lang.Throwable -> L3b
                    r4 = r17
                    r10.writeInt(r4)     // Catch: java.lang.Throwable -> L3b
                    r5 = r18
                    r10.writeInt(r5)     // Catch: java.lang.Throwable -> L3b
                    r6 = r19
                    r10.writeInt(r6)     // Catch: java.lang.Throwable -> L3b
                    r7 = r20
                    r10.writeInt(r7)     // Catch: java.lang.Throwable -> L3b
                    r0 = 0
                    if (r8 == 0) goto L3e
                    r1 = 1
                    r10.writeInt(r1)     // Catch: java.lang.Throwable -> L3b
                    r8.writeToParcel(r10, r0)     // Catch: java.lang.Throwable -> L3b
                L38:
                    r9 = r22
                    goto L42
                L3b:
                    r0 = move-exception
                    r14 = r0
                    goto L68
                L3e:
                    r10.writeInt(r0)     // Catch: java.lang.Throwable -> L3b
                    goto L38
                L42:
                    r10.writeInt(r9)     // Catch: java.lang.Throwable -> L3b
                    android.os.IBinder r1 = r13.mRemote     // Catch: java.lang.Throwable -> L3b
                    r12 = 4
                    boolean r0 = r1.transact(r12, r10, r11, r0)     // Catch: java.lang.Throwable -> L3b
                    if (r0 != 0) goto L64
                    com.kwad.framework.filedownloader.c.b r0 = com.kwad.framework.filedownloader.c.b.a.yK()     // Catch: java.lang.Throwable -> L3b
                    if (r0 == 0) goto L64
                    com.kwad.framework.filedownloader.c.b r0 = com.kwad.framework.filedownloader.c.b.a.yK()     // Catch: java.lang.Throwable -> L3b
                    r1 = r14
                    r2 = r15
                    r0.b(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L3b
                L5d:
                    r11.recycle()
                    r10.recycle()
                    return
                L64:
                    r11.readException()     // Catch: java.lang.Throwable -> L3b
                    goto L5d
                L68:
                    r11.recycle()
                    r10.recycle()
                    throw r14
            }

            @Override // com.kwad.framework.filedownloader.c.b
            public final boolean bQ(int r6) {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.kwad.framework.filedownloader.i.IFileDownloadIPCService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2f
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L2f
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L2f
                    r3 = 7
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2f
                    if (r2 != 0) goto L31
                    com.kwad.framework.filedownloader.c.b r2 = com.kwad.framework.filedownloader.c.b.a.yK()     // Catch: java.lang.Throwable -> L2f
                    if (r2 == 0) goto L31
                    com.kwad.framework.filedownloader.c.b r2 = com.kwad.framework.filedownloader.c.b.a.yK()     // Catch: java.lang.Throwable -> L2f
                    boolean r6 = r2.bQ(r6)     // Catch: java.lang.Throwable -> L2f
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

            @Override // com.kwad.framework.filedownloader.c.b
            public final long bR(int r6) {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.kwad.framework.filedownloader.i.IFileDownloadIPCService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L30
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L30
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L30
                    r3 = 8
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L30
                    if (r2 != 0) goto L32
                    com.kwad.framework.filedownloader.c.b r2 = com.kwad.framework.filedownloader.c.b.a.yK()     // Catch: java.lang.Throwable -> L30
                    if (r2 == 0) goto L32
                    com.kwad.framework.filedownloader.c.b r2 = com.kwad.framework.filedownloader.c.b.a.yK()     // Catch: java.lang.Throwable -> L30
                    long r2 = r2.bR(r6)     // Catch: java.lang.Throwable -> L30
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

            @Override // com.kwad.framework.filedownloader.c.b
            public final long bS(int r6) {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.kwad.framework.filedownloader.i.IFileDownloadIPCService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L30
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L30
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L30
                    r3 = 9
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L30
                    if (r2 != 0) goto L32
                    com.kwad.framework.filedownloader.c.b r2 = com.kwad.framework.filedownloader.c.b.a.yK()     // Catch: java.lang.Throwable -> L30
                    if (r2 == 0) goto L32
                    com.kwad.framework.filedownloader.c.b r2 = com.kwad.framework.filedownloader.c.b.a.yK()     // Catch: java.lang.Throwable -> L30
                    long r2 = r2.bS(r6)     // Catch: java.lang.Throwable -> L30
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

            @Override // com.kwad.framework.filedownloader.c.b
            public final boolean bw(int r6) {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.kwad.framework.filedownloader.i.IFileDownloadIPCService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2f
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L2f
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L2f
                    r3 = 5
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2f
                    if (r2 != 0) goto L31
                    com.kwad.framework.filedownloader.c.b r2 = com.kwad.framework.filedownloader.c.b.a.yK()     // Catch: java.lang.Throwable -> L2f
                    if (r2 == 0) goto L31
                    com.kwad.framework.filedownloader.c.b r2 = com.kwad.framework.filedownloader.c.b.a.yK()     // Catch: java.lang.Throwable -> L2f
                    boolean r6 = r2.bw(r6)     // Catch: java.lang.Throwable -> L2f
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

            @Override // com.kwad.framework.filedownloader.c.b
            public final byte bx(int r6) {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.kwad.framework.filedownloader.i.IFileDownloadIPCService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L30
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L30
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L30
                    r3 = 10
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L30
                    if (r2 != 0) goto L32
                    com.kwad.framework.filedownloader.c.b r2 = com.kwad.framework.filedownloader.c.b.a.yK()     // Catch: java.lang.Throwable -> L30
                    if (r2 == 0) goto L32
                    com.kwad.framework.filedownloader.c.b r2 = com.kwad.framework.filedownloader.c.b.a.yK()     // Catch: java.lang.Throwable -> L30
                    byte r6 = r2.bx(r6)     // Catch: java.lang.Throwable -> L30
                L29:
                    r1.recycle()
                    r0.recycle()
                    return r6
                L30:
                    r6 = move-exception
                    goto L3a
                L32:
                    r1.readException()     // Catch: java.lang.Throwable -> L30
                    byte r6 = r1.readByte()     // Catch: java.lang.Throwable -> L30
                    goto L29
                L3a:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.kwad.framework.filedownloader.c.b
            public final boolean by(int r6) {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.kwad.framework.filedownloader.i.IFileDownloadIPCService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L30
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L30
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L30
                    r3 = 14
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L30
                    if (r2 != 0) goto L32
                    com.kwad.framework.filedownloader.c.b r2 = com.kwad.framework.filedownloader.c.b.a.yK()     // Catch: java.lang.Throwable -> L30
                    if (r2 == 0) goto L32
                    com.kwad.framework.filedownloader.c.b r2 = com.kwad.framework.filedownloader.c.b.a.yK()     // Catch: java.lang.Throwable -> L30
                    boolean r6 = r2.by(r6)     // Catch: java.lang.Throwable -> L30
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

            @Override // com.kwad.framework.filedownloader.c.b
            public final boolean isIdle() {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.kwad.framework.filedownloader.i.IFileDownloadIPCService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2d
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L2d
                    r3 = 11
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2d
                    if (r2 != 0) goto L2f
                    com.kwad.framework.filedownloader.c.b r2 = com.kwad.framework.filedownloader.c.b.a.yK()     // Catch: java.lang.Throwable -> L2d
                    if (r2 == 0) goto L2f
                    com.kwad.framework.filedownloader.c.b r2 = com.kwad.framework.filedownloader.c.b.a.yK()     // Catch: java.lang.Throwable -> L2d
                    boolean r2 = r2.isIdle()     // Catch: java.lang.Throwable -> L2d
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

            @Override // com.kwad.framework.filedownloader.c.b
            public final void pauseAllTasks() {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.kwad.framework.filedownloader.i.IFileDownloadIPCService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2b
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L2b
                    r3 = 6
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2b
                    if (r2 != 0) goto L2d
                    com.kwad.framework.filedownloader.c.b r2 = com.kwad.framework.filedownloader.c.b.a.yK()     // Catch: java.lang.Throwable -> L2b
                    if (r2 == 0) goto L2d
                    com.kwad.framework.filedownloader.c.b r2 = com.kwad.framework.filedownloader.c.b.a.yK()     // Catch: java.lang.Throwable -> L2b
                    r2.pauseAllTasks()     // Catch: java.lang.Throwable -> L2b
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

            @Override // com.kwad.framework.filedownloader.c.b
            public final void startForeground(int r6, android.app.Notification r7) {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "com.kwad.framework.filedownloader.i.IFileDownloadIPCService"
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
                    android.os.IBinder r1 = r5.mRemote     // Catch: java.lang.Throwable -> L17
                    r3 = 12
                    r4 = 0
                    boolean r1 = r1.transact(r3, r0, r4, r2)     // Catch: java.lang.Throwable -> L17
                    if (r1 != 0) goto L38
                    com.kwad.framework.filedownloader.c.b r1 = com.kwad.framework.filedownloader.c.b.a.yK()     // Catch: java.lang.Throwable -> L17
                    if (r1 == 0) goto L38
                    com.kwad.framework.filedownloader.c.b r1 = com.kwad.framework.filedownloader.c.b.a.yK()     // Catch: java.lang.Throwable -> L17
                    r1.startForeground(r6, r7)     // Catch: java.lang.Throwable -> L17
                    r0.recycle()
                    return
                L38:
                    r0.recycle()
                    return
                L3c:
                    r0.recycle()
                    throw r6
            }

            @Override // com.kwad.framework.filedownloader.c.b
            public final void stopForeground(boolean r6) {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "com.kwad.framework.filedownloader.i.IFileDownloadIPCService"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L29
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L29
                    android.os.IBinder r1 = r5.mRemote     // Catch: java.lang.Throwable -> L29
                    r2 = 0
                    r3 = 1
                    r4 = 13
                    boolean r1 = r1.transact(r4, r0, r2, r3)     // Catch: java.lang.Throwable -> L29
                    if (r1 != 0) goto L2b
                    com.kwad.framework.filedownloader.c.b r1 = com.kwad.framework.filedownloader.c.b.a.yK()     // Catch: java.lang.Throwable -> L29
                    if (r1 == 0) goto L2b
                    com.kwad.framework.filedownloader.c.b r1 = com.kwad.framework.filedownloader.c.b.a.yK()     // Catch: java.lang.Throwable -> L29
                    r1.stopForeground(r6)     // Catch: java.lang.Throwable -> L29
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

            @Override // com.kwad.framework.filedownloader.c.b
            public final boolean x(java.lang.String r6, java.lang.String r7) {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.kwad.framework.filedownloader.i.IFileDownloadIPCService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L32
                    r0.writeString(r6)     // Catch: java.lang.Throwable -> L32
                    r0.writeString(r7)     // Catch: java.lang.Throwable -> L32
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L32
                    r3 = 3
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L32
                    if (r2 != 0) goto L34
                    com.kwad.framework.filedownloader.c.b r2 = com.kwad.framework.filedownloader.c.b.a.yK()     // Catch: java.lang.Throwable -> L32
                    if (r2 == 0) goto L34
                    com.kwad.framework.filedownloader.c.b r2 = com.kwad.framework.filedownloader.c.b.a.yK()     // Catch: java.lang.Throwable -> L32
                    boolean r6 = r2.x(r6, r7)     // Catch: java.lang.Throwable -> L32
                    r1.recycle()
                    r0.recycle()
                    return r6
                L32:
                    r6 = move-exception
                    goto L45
                L34:
                    r1.readException()     // Catch: java.lang.Throwable -> L32
                    int r6 = r1.readInt()     // Catch: java.lang.Throwable -> L32
                    if (r6 == 0) goto L3e
                    r4 = 1
                L3e:
                    r1.recycle()
                    r0.recycle()
                    return r4
                L45:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.kwad.framework.filedownloader.c.b
            public final void yJ() {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.kwad.framework.filedownloader.i.IFileDownloadIPCService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2c
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L2c
                    r3 = 15
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2c
                    if (r2 != 0) goto L2e
                    com.kwad.framework.filedownloader.c.b r2 = com.kwad.framework.filedownloader.c.b.a.yK()     // Catch: java.lang.Throwable -> L2c
                    if (r2 == 0) goto L2e
                    com.kwad.framework.filedownloader.c.b r2 = com.kwad.framework.filedownloader.c.b.a.yK()     // Catch: java.lang.Throwable -> L2c
                    r2.yJ()     // Catch: java.lang.Throwable -> L2c
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
        }

        public a() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "com.kwad.framework.filedownloader.i.IFileDownloadIPCService"
                r1.attachInterface(r1, r0)
                return
        }

        public static com.kwad.framework.filedownloader.c.b a(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.kwad.framework.filedownloader.i.IFileDownloadIPCService"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof com.kwad.framework.filedownloader.c.b
                if (r1 == 0) goto L13
                com.kwad.framework.filedownloader.c.b r0 = (com.kwad.framework.filedownloader.c.b) r0
                return r0
            L13:
                com.kwad.framework.filedownloader.c.b$a$a r0 = new com.kwad.framework.filedownloader.c.b$a$a
                r0.<init>(r2)
                return r0
        }

        public static com.kwad.framework.filedownloader.c.b yK() {
                com.kwad.framework.filedownloader.c.b r0 = com.kwad.framework.filedownloader.c.b.a.C0115a.aoD
                return r0
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
                r0 = this;
                return r0
        }

        @Override // android.os.Binder
        public boolean onTransact(int r15, android.os.Parcel r16, android.os.Parcel r17, int r18) {
                r14 = this;
                r0 = r16
                r1 = r17
                r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r3 = 1
                java.lang.String r4 = "com.kwad.framework.filedownloader.i.IFileDownloadIPCService"
                if (r15 == r2) goto L14b
                r2 = 0
                r5 = 0
                switch(r15) {
                    case 1: goto L13c;
                    case 2: goto L12d;
                    case 3: goto L117;
                    case 4: goto Lcc;
                    case 5: goto Lba;
                    case 6: goto Lb0;
                    case 7: goto L9e;
                    case 8: goto L8c;
                    case 9: goto L7a;
                    case 10: goto L68;
                    case 11: goto L5a;
                    case 12: goto L40;
                    case 13: goto L32;
                    case 14: goto L20;
                    case 15: goto L16;
                    default: goto L11;
                }
            L11:
                boolean r15 = super.onTransact(r15, r16, r17, r18)
                return r15
            L16:
                r0.enforceInterface(r4)
                r14.yJ()
                r1.writeNoException()
                return r3
            L20:
                r0.enforceInterface(r4)
                int r15 = r0.readInt()
                boolean r15 = r14.by(r15)
                r1.writeNoException()
                r1.writeInt(r15)
                return r3
            L32:
                r0.enforceInterface(r4)
                int r15 = r0.readInt()
                if (r15 == 0) goto L3c
                r5 = 1
            L3c:
                r14.stopForeground(r5)
                return r3
            L40:
                r0.enforceInterface(r4)
                int r15 = r0.readInt()
                int r1 = r0.readInt()
                if (r1 == 0) goto L56
                android.os.Parcelable$Creator r1 = android.app.Notification.CREATOR
                java.lang.Object r0 = r1.createFromParcel(r0)
                r2 = r0
                android.app.Notification r2 = (android.app.Notification) r2
            L56:
                r14.startForeground(r15, r2)
                return r3
            L5a:
                r0.enforceInterface(r4)
                boolean r15 = r14.isIdle()
                r1.writeNoException()
                r1.writeInt(r15)
                return r3
            L68:
                r0.enforceInterface(r4)
                int r15 = r0.readInt()
                byte r15 = r14.bx(r15)
                r1.writeNoException()
                r1.writeByte(r15)
                return r3
            L7a:
                r0.enforceInterface(r4)
                int r15 = r0.readInt()
                long r4 = r14.bS(r15)
                r1.writeNoException()
                r1.writeLong(r4)
                return r3
            L8c:
                r0.enforceInterface(r4)
                int r15 = r0.readInt()
                long r4 = r14.bR(r15)
                r1.writeNoException()
                r1.writeLong(r4)
                return r3
            L9e:
                r0.enforceInterface(r4)
                int r15 = r0.readInt()
                boolean r15 = r14.bQ(r15)
                r1.writeNoException()
                r1.writeInt(r15)
                return r3
            Lb0:
                r0.enforceInterface(r4)
                r14.pauseAllTasks()
                r1.writeNoException()
                return r3
            Lba:
                r0.enforceInterface(r4)
                int r15 = r0.readInt()
                boolean r15 = r14.bw(r15)
                r1.writeNoException()
                r1.writeInt(r15)
                return r3
            Lcc:
                r0.enforceInterface(r4)
                r15 = 0
                java.lang.String r5 = r0.readString()
                java.lang.String r6 = r0.readString()
                int r4 = r0.readInt()
                if (r4 == 0) goto Le0
                r7 = 1
                goto Le1
            Le0:
                r7 = 0
            Le1:
                int r8 = r0.readInt()
                int r9 = r0.readInt()
                int r10 = r0.readInt()
                int r4 = r0.readInt()
                if (r4 == 0) goto Lf5
                r11 = 1
                goto Lf6
            Lf5:
                r11 = 0
            Lf6:
                int r4 = r0.readInt()
                if (r4 == 0) goto L104
                android.os.Parcelable$Creator<com.kwad.framework.filedownloader.d.b> r2 = com.kwad.framework.filedownloader.d.b.CREATOR
                java.lang.Object r2 = r2.createFromParcel(r0)
                com.kwad.framework.filedownloader.d.b r2 = (com.kwad.framework.filedownloader.d.b) r2
            L104:
                r12 = r2
                int r0 = r0.readInt()
                if (r0 == 0) goto L10e
                r13 = 1
            L10c:
                r4 = r14
                goto L110
            L10e:
                r13 = 0
                goto L10c
            L110:
                r4.b(r5, r6, r7, r8, r9, r10, r11, r12, r13)
                r1.writeNoException()
                return r3
            L117:
                r0.enforceInterface(r4)
                java.lang.String r2 = r0.readString()
                java.lang.String r0 = r0.readString()
                boolean r0 = r14.x(r2, r0)
                r1.writeNoException()
                r1.writeInt(r0)
                return r3
            L12d:
                r0.enforceInterface(r4)
                android.os.IBinder r0 = r0.readStrongBinder()
                com.kwad.framework.filedownloader.c.a r0 = com.kwad.framework.filedownloader.c.a.AbstractBinderC0113a.c(r0)
                r14.b(r0)
                return r3
            L13c:
                r0.enforceInterface(r4)
                android.os.IBinder r0 = r0.readStrongBinder()
                com.kwad.framework.filedownloader.c.a r0 = com.kwad.framework.filedownloader.c.a.AbstractBinderC0113a.c(r0)
                r14.a(r0)
                return r3
            L14b:
                r1.writeString(r4)
                return r3
        }
    }

    void a(com.kwad.framework.filedownloader.c.a r1);

    void b(com.kwad.framework.filedownloader.c.a r1);

    void b(java.lang.String r1, java.lang.String r2, boolean r3, int r4, int r5, int r6, boolean r7, com.kwad.framework.filedownloader.d.b r8, boolean r9);

    boolean bQ(int r1);

    long bR(int r1);

    long bS(int r1);

    boolean bw(int r1);

    byte bx(int r1);

    boolean by(int r1);

    boolean isIdle();

    void pauseAllTasks();

    void startForeground(int r1, android.app.Notification r2);

    void stopForeground(boolean r1);

    boolean x(java.lang.String r1, java.lang.String r2);

    void yJ();
}
