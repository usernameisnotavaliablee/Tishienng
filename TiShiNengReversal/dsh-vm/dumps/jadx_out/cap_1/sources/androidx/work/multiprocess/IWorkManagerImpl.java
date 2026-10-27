package androidx.work.multiprocess;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface IWorkManagerImpl extends android.os.IInterface {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Default implements androidx.work.multiprocess.IWorkManagerImpl {
        public Default() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.work.multiprocess.IWorkManagerImpl
        public void cancelAllWork(androidx.work.multiprocess.IWorkManagerImplCallback r1) throws android.os.RemoteException {
                r0 = this;
                return
        }

        @Override // androidx.work.multiprocess.IWorkManagerImpl
        public void cancelAllWorkByTag(java.lang.String r1, androidx.work.multiprocess.IWorkManagerImplCallback r2) throws android.os.RemoteException {
                r0 = this;
                return
        }

        @Override // androidx.work.multiprocess.IWorkManagerImpl
        public void cancelUniqueWork(java.lang.String r1, androidx.work.multiprocess.IWorkManagerImplCallback r2) throws android.os.RemoteException {
                r0 = this;
                return
        }

        @Override // androidx.work.multiprocess.IWorkManagerImpl
        public void cancelWorkById(java.lang.String r1, androidx.work.multiprocess.IWorkManagerImplCallback r2) throws android.os.RemoteException {
                r0 = this;
                return
        }

        @Override // androidx.work.multiprocess.IWorkManagerImpl
        public void enqueueContinuation(byte[] r1, androidx.work.multiprocess.IWorkManagerImplCallback r2) throws android.os.RemoteException {
                r0 = this;
                return
        }

        @Override // androidx.work.multiprocess.IWorkManagerImpl
        public void enqueueWorkRequests(byte[] r1, androidx.work.multiprocess.IWorkManagerImplCallback r2) throws android.os.RemoteException {
                r0 = this;
                return
        }

        @Override // androidx.work.multiprocess.IWorkManagerImpl
        public void queryWorkInfo(byte[] r1, androidx.work.multiprocess.IWorkManagerImplCallback r2) throws android.os.RemoteException {
                r0 = this;
                return
        }

        @Override // androidx.work.multiprocess.IWorkManagerImpl
        public void setProgress(byte[] r1, androidx.work.multiprocess.IWorkManagerImplCallback r2) throws android.os.RemoteException {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class Stub extends android.os.Binder implements androidx.work.multiprocess.IWorkManagerImpl {
        private static final java.lang.String DESCRIPTOR = "androidx.work.multiprocess.IWorkManagerImpl";
        static final int TRANSACTION_cancelAllWork = 6;
        static final int TRANSACTION_cancelAllWorkByTag = 4;
        static final int TRANSACTION_cancelUniqueWork = 5;
        static final int TRANSACTION_cancelWorkById = 3;
        static final int TRANSACTION_enqueueContinuation = 2;
        static final int TRANSACTION_enqueueWorkRequests = 1;
        static final int TRANSACTION_queryWorkInfo = 7;
        static final int TRANSACTION_setProgress = 8;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private static class Proxy implements androidx.work.multiprocess.IWorkManagerImpl {
            public static androidx.work.multiprocess.IWorkManagerImpl sDefaultImpl;
            private android.os.IBinder mRemote;

            Proxy(android.os.IBinder r1) {
                    r0 = this;
                    r0.<init>()
                    r0.mRemote = r1
                    return
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                    r1 = this;
                    android.os.IBinder r0 = r1.mRemote
                    return r0
            }

            @Override // androidx.work.multiprocess.IWorkManagerImpl
            public void cancelAllWork(androidx.work.multiprocess.IWorkManagerImplCallback r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "androidx.work.multiprocess.IWorkManagerImpl"
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
                    r3 = 6
                    r4 = 1
                    boolean r1 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L11
                    if (r1 != 0) goto L32
                    androidx.work.multiprocess.IWorkManagerImpl r1 = androidx.work.multiprocess.IWorkManagerImpl.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L11
                    if (r1 == 0) goto L32
                    androidx.work.multiprocess.IWorkManagerImpl r1 = androidx.work.multiprocess.IWorkManagerImpl.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L11
                    r1.cancelAllWork(r6)     // Catch: java.lang.Throwable -> L11
                    r0.recycle()
                    return
                L32:
                    r0.recycle()
                    return
                L36:
                    r0.recycle()
                    throw r6
            }

            @Override // androidx.work.multiprocess.IWorkManagerImpl
            public void cancelAllWorkByTag(java.lang.String r6, androidx.work.multiprocess.IWorkManagerImplCallback r7) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "androidx.work.multiprocess.IWorkManagerImpl"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L14
                    r0.writeString(r6)     // Catch: java.lang.Throwable -> L14
                    r1 = 0
                    if (r7 == 0) goto L16
                    android.os.IBinder r2 = r7.asBinder()     // Catch: java.lang.Throwable -> L14
                    goto L17
                L14:
                    r6 = move-exception
                    goto L39
                L16:
                    r2 = r1
                L17:
                    r0.writeStrongBinder(r2)     // Catch: java.lang.Throwable -> L14
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L14
                    r3 = 4
                    r4 = 1
                    boolean r1 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L14
                    if (r1 != 0) goto L35
                    androidx.work.multiprocess.IWorkManagerImpl r1 = androidx.work.multiprocess.IWorkManagerImpl.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L14
                    if (r1 == 0) goto L35
                    androidx.work.multiprocess.IWorkManagerImpl r1 = androidx.work.multiprocess.IWorkManagerImpl.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L14
                    r1.cancelAllWorkByTag(r6, r7)     // Catch: java.lang.Throwable -> L14
                    r0.recycle()
                    return
                L35:
                    r0.recycle()
                    return
                L39:
                    r0.recycle()
                    throw r6
            }

            @Override // androidx.work.multiprocess.IWorkManagerImpl
            public void cancelUniqueWork(java.lang.String r6, androidx.work.multiprocess.IWorkManagerImplCallback r7) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "androidx.work.multiprocess.IWorkManagerImpl"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L14
                    r0.writeString(r6)     // Catch: java.lang.Throwable -> L14
                    r1 = 0
                    if (r7 == 0) goto L16
                    android.os.IBinder r2 = r7.asBinder()     // Catch: java.lang.Throwable -> L14
                    goto L17
                L14:
                    r6 = move-exception
                    goto L39
                L16:
                    r2 = r1
                L17:
                    r0.writeStrongBinder(r2)     // Catch: java.lang.Throwable -> L14
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L14
                    r3 = 5
                    r4 = 1
                    boolean r1 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L14
                    if (r1 != 0) goto L35
                    androidx.work.multiprocess.IWorkManagerImpl r1 = androidx.work.multiprocess.IWorkManagerImpl.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L14
                    if (r1 == 0) goto L35
                    androidx.work.multiprocess.IWorkManagerImpl r1 = androidx.work.multiprocess.IWorkManagerImpl.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L14
                    r1.cancelUniqueWork(r6, r7)     // Catch: java.lang.Throwable -> L14
                    r0.recycle()
                    return
                L35:
                    r0.recycle()
                    return
                L39:
                    r0.recycle()
                    throw r6
            }

            @Override // androidx.work.multiprocess.IWorkManagerImpl
            public void cancelWorkById(java.lang.String r6, androidx.work.multiprocess.IWorkManagerImplCallback r7) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "androidx.work.multiprocess.IWorkManagerImpl"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L14
                    r0.writeString(r6)     // Catch: java.lang.Throwable -> L14
                    r1 = 0
                    if (r7 == 0) goto L16
                    android.os.IBinder r2 = r7.asBinder()     // Catch: java.lang.Throwable -> L14
                    goto L17
                L14:
                    r6 = move-exception
                    goto L39
                L16:
                    r2 = r1
                L17:
                    r0.writeStrongBinder(r2)     // Catch: java.lang.Throwable -> L14
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L14
                    r3 = 3
                    r4 = 1
                    boolean r1 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L14
                    if (r1 != 0) goto L35
                    androidx.work.multiprocess.IWorkManagerImpl r1 = androidx.work.multiprocess.IWorkManagerImpl.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L14
                    if (r1 == 0) goto L35
                    androidx.work.multiprocess.IWorkManagerImpl r1 = androidx.work.multiprocess.IWorkManagerImpl.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L14
                    r1.cancelWorkById(r6, r7)     // Catch: java.lang.Throwable -> L14
                    r0.recycle()
                    return
                L35:
                    r0.recycle()
                    return
                L39:
                    r0.recycle()
                    throw r6
            }

            @Override // androidx.work.multiprocess.IWorkManagerImpl
            public void enqueueContinuation(byte[] r6, androidx.work.multiprocess.IWorkManagerImplCallback r7) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "androidx.work.multiprocess.IWorkManagerImpl"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L14
                    r0.writeByteArray(r6)     // Catch: java.lang.Throwable -> L14
                    r1 = 0
                    if (r7 == 0) goto L16
                    android.os.IBinder r2 = r7.asBinder()     // Catch: java.lang.Throwable -> L14
                    goto L17
                L14:
                    r6 = move-exception
                    goto L39
                L16:
                    r2 = r1
                L17:
                    r0.writeStrongBinder(r2)     // Catch: java.lang.Throwable -> L14
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L14
                    r3 = 2
                    r4 = 1
                    boolean r1 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L14
                    if (r1 != 0) goto L35
                    androidx.work.multiprocess.IWorkManagerImpl r1 = androidx.work.multiprocess.IWorkManagerImpl.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L14
                    if (r1 == 0) goto L35
                    androidx.work.multiprocess.IWorkManagerImpl r1 = androidx.work.multiprocess.IWorkManagerImpl.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L14
                    r1.enqueueContinuation(r6, r7)     // Catch: java.lang.Throwable -> L14
                    r0.recycle()
                    return
                L35:
                    r0.recycle()
                    return
                L39:
                    r0.recycle()
                    throw r6
            }

            @Override // androidx.work.multiprocess.IWorkManagerImpl
            public void enqueueWorkRequests(byte[] r5, androidx.work.multiprocess.IWorkManagerImplCallback r6) throws android.os.RemoteException {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "androidx.work.multiprocess.IWorkManagerImpl"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L14
                    r0.writeByteArray(r5)     // Catch: java.lang.Throwable -> L14
                    r1 = 0
                    if (r6 == 0) goto L16
                    android.os.IBinder r2 = r6.asBinder()     // Catch: java.lang.Throwable -> L14
                    goto L17
                L14:
                    r5 = move-exception
                    goto L38
                L16:
                    r2 = r1
                L17:
                    r0.writeStrongBinder(r2)     // Catch: java.lang.Throwable -> L14
                    android.os.IBinder r2 = r4.mRemote     // Catch: java.lang.Throwable -> L14
                    r3 = 1
                    boolean r1 = r2.transact(r3, r0, r1, r3)     // Catch: java.lang.Throwable -> L14
                    if (r1 != 0) goto L34
                    androidx.work.multiprocess.IWorkManagerImpl r1 = androidx.work.multiprocess.IWorkManagerImpl.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L14
                    if (r1 == 0) goto L34
                    androidx.work.multiprocess.IWorkManagerImpl r1 = androidx.work.multiprocess.IWorkManagerImpl.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L14
                    r1.enqueueWorkRequests(r5, r6)     // Catch: java.lang.Throwable -> L14
                    r0.recycle()
                    return
                L34:
                    r0.recycle()
                    return
                L38:
                    r0.recycle()
                    throw r5
            }

            public java.lang.String getInterfaceDescriptor() {
                    r1 = this;
                    java.lang.String r0 = "androidx.work.multiprocess.IWorkManagerImpl"
                    return r0
            }

            @Override // androidx.work.multiprocess.IWorkManagerImpl
            public void queryWorkInfo(byte[] r6, androidx.work.multiprocess.IWorkManagerImplCallback r7) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "androidx.work.multiprocess.IWorkManagerImpl"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L14
                    r0.writeByteArray(r6)     // Catch: java.lang.Throwable -> L14
                    r1 = 0
                    if (r7 == 0) goto L16
                    android.os.IBinder r2 = r7.asBinder()     // Catch: java.lang.Throwable -> L14
                    goto L17
                L14:
                    r6 = move-exception
                    goto L39
                L16:
                    r2 = r1
                L17:
                    r0.writeStrongBinder(r2)     // Catch: java.lang.Throwable -> L14
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L14
                    r3 = 7
                    r4 = 1
                    boolean r1 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L14
                    if (r1 != 0) goto L35
                    androidx.work.multiprocess.IWorkManagerImpl r1 = androidx.work.multiprocess.IWorkManagerImpl.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L14
                    if (r1 == 0) goto L35
                    androidx.work.multiprocess.IWorkManagerImpl r1 = androidx.work.multiprocess.IWorkManagerImpl.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L14
                    r1.queryWorkInfo(r6, r7)     // Catch: java.lang.Throwable -> L14
                    r0.recycle()
                    return
                L35:
                    r0.recycle()
                    return
                L39:
                    r0.recycle()
                    throw r6
            }

            @Override // androidx.work.multiprocess.IWorkManagerImpl
            public void setProgress(byte[] r6, androidx.work.multiprocess.IWorkManagerImplCallback r7) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "androidx.work.multiprocess.IWorkManagerImpl"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L14
                    r0.writeByteArray(r6)     // Catch: java.lang.Throwable -> L14
                    r1 = 0
                    if (r7 == 0) goto L16
                    android.os.IBinder r2 = r7.asBinder()     // Catch: java.lang.Throwable -> L14
                    goto L17
                L14:
                    r6 = move-exception
                    goto L3a
                L16:
                    r2 = r1
                L17:
                    r0.writeStrongBinder(r2)     // Catch: java.lang.Throwable -> L14
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L14
                    r3 = 8
                    r4 = 1
                    boolean r1 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L14
                    if (r1 != 0) goto L36
                    androidx.work.multiprocess.IWorkManagerImpl r1 = androidx.work.multiprocess.IWorkManagerImpl.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L14
                    if (r1 == 0) goto L36
                    androidx.work.multiprocess.IWorkManagerImpl r1 = androidx.work.multiprocess.IWorkManagerImpl.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L14
                    r1.setProgress(r6, r7)     // Catch: java.lang.Throwable -> L14
                    r0.recycle()
                    return
                L36:
                    r0.recycle()
                    return
                L3a:
                    r0.recycle()
                    throw r6
            }
        }

        public Stub() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "androidx.work.multiprocess.IWorkManagerImpl"
                r1.attachInterface(r1, r0)
                return
        }

        public static androidx.work.multiprocess.IWorkManagerImpl asInterface(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "androidx.work.multiprocess.IWorkManagerImpl"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof androidx.work.multiprocess.IWorkManagerImpl
                if (r1 == 0) goto L13
                androidx.work.multiprocess.IWorkManagerImpl r0 = (androidx.work.multiprocess.IWorkManagerImpl) r0
                return r0
            L13:
                androidx.work.multiprocess.IWorkManagerImpl$Stub$Proxy r0 = new androidx.work.multiprocess.IWorkManagerImpl$Stub$Proxy
                r0.<init>(r2)
                return r0
        }

        public static androidx.work.multiprocess.IWorkManagerImpl getDefaultImpl() {
                androidx.work.multiprocess.IWorkManagerImpl r0 = androidx.work.multiprocess.IWorkManagerImpl.Stub.Proxy.sDefaultImpl
                return r0
        }

        public static boolean setDefaultImpl(androidx.work.multiprocess.IWorkManagerImpl r1) {
                androidx.work.multiprocess.IWorkManagerImpl r0 = androidx.work.multiprocess.IWorkManagerImpl.Stub.Proxy.sDefaultImpl
                if (r0 != 0) goto Lc
                if (r1 == 0) goto La
                androidx.work.multiprocess.IWorkManagerImpl.Stub.Proxy.sDefaultImpl = r1
                r1 = 1
                return r1
            La:
                r1 = 0
                return r1
            Lc:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "setDefaultImpl() called twice"
                r1.<init>(r0)
                throw r1
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
                java.lang.String r2 = "androidx.work.multiprocess.IWorkManagerImpl"
                if (r4 == r0) goto La4
                switch(r4) {
                    case 1: goto L91;
                    case 2: goto L7e;
                    case 3: goto L6b;
                    case 4: goto L58;
                    case 5: goto L45;
                    case 6: goto L36;
                    case 7: goto L23;
                    case 8: goto L10;
                    default: goto Lb;
                }
            Lb:
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            L10:
                r5.enforceInterface(r2)
                byte[] r4 = r5.createByteArray()
                android.os.IBinder r5 = r5.readStrongBinder()
                androidx.work.multiprocess.IWorkManagerImplCallback r5 = androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(r5)
                r3.setProgress(r4, r5)
                return r1
            L23:
                r5.enforceInterface(r2)
                byte[] r4 = r5.createByteArray()
                android.os.IBinder r5 = r5.readStrongBinder()
                androidx.work.multiprocess.IWorkManagerImplCallback r5 = androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(r5)
                r3.queryWorkInfo(r4, r5)
                return r1
            L36:
                r5.enforceInterface(r2)
                android.os.IBinder r4 = r5.readStrongBinder()
                androidx.work.multiprocess.IWorkManagerImplCallback r4 = androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(r4)
                r3.cancelAllWork(r4)
                return r1
            L45:
                r5.enforceInterface(r2)
                java.lang.String r4 = r5.readString()
                android.os.IBinder r5 = r5.readStrongBinder()
                androidx.work.multiprocess.IWorkManagerImplCallback r5 = androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(r5)
                r3.cancelUniqueWork(r4, r5)
                return r1
            L58:
                r5.enforceInterface(r2)
                java.lang.String r4 = r5.readString()
                android.os.IBinder r5 = r5.readStrongBinder()
                androidx.work.multiprocess.IWorkManagerImplCallback r5 = androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(r5)
                r3.cancelAllWorkByTag(r4, r5)
                return r1
            L6b:
                r5.enforceInterface(r2)
                java.lang.String r4 = r5.readString()
                android.os.IBinder r5 = r5.readStrongBinder()
                androidx.work.multiprocess.IWorkManagerImplCallback r5 = androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(r5)
                r3.cancelWorkById(r4, r5)
                return r1
            L7e:
                r5.enforceInterface(r2)
                byte[] r4 = r5.createByteArray()
                android.os.IBinder r5 = r5.readStrongBinder()
                androidx.work.multiprocess.IWorkManagerImplCallback r5 = androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(r5)
                r3.enqueueContinuation(r4, r5)
                return r1
            L91:
                r5.enforceInterface(r2)
                byte[] r4 = r5.createByteArray()
                android.os.IBinder r5 = r5.readStrongBinder()
                androidx.work.multiprocess.IWorkManagerImplCallback r5 = androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(r5)
                r3.enqueueWorkRequests(r4, r5)
                return r1
            La4:
                r6.writeString(r2)
                return r1
        }
    }

    void cancelAllWork(androidx.work.multiprocess.IWorkManagerImplCallback r1) throws android.os.RemoteException;

    void cancelAllWorkByTag(java.lang.String r1, androidx.work.multiprocess.IWorkManagerImplCallback r2) throws android.os.RemoteException;

    void cancelUniqueWork(java.lang.String r1, androidx.work.multiprocess.IWorkManagerImplCallback r2) throws android.os.RemoteException;

    void cancelWorkById(java.lang.String r1, androidx.work.multiprocess.IWorkManagerImplCallback r2) throws android.os.RemoteException;

    void enqueueContinuation(byte[] r1, androidx.work.multiprocess.IWorkManagerImplCallback r2) throws android.os.RemoteException;

    void enqueueWorkRequests(byte[] r1, androidx.work.multiprocess.IWorkManagerImplCallback r2) throws android.os.RemoteException;

    void queryWorkInfo(byte[] r1, androidx.work.multiprocess.IWorkManagerImplCallback r2) throws android.os.RemoteException;

    void setProgress(byte[] r1, androidx.work.multiprocess.IWorkManagerImplCallback r2) throws android.os.RemoteException;
}
