package androidx.work.multiprocess;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface IListenableWorkerImpl extends android.os.IInterface {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Default implements androidx.work.multiprocess.IListenableWorkerImpl {
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

        @Override // androidx.work.multiprocess.IListenableWorkerImpl
        public void interrupt(byte[] r1, androidx.work.multiprocess.IWorkManagerImplCallback r2) throws android.os.RemoteException {
                r0 = this;
                return
        }

        @Override // androidx.work.multiprocess.IListenableWorkerImpl
        public void startWork(byte[] r1, androidx.work.multiprocess.IWorkManagerImplCallback r2) throws android.os.RemoteException {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class Stub extends android.os.Binder implements androidx.work.multiprocess.IListenableWorkerImpl {
        private static final java.lang.String DESCRIPTOR = "androidx.work.multiprocess.IListenableWorkerImpl";
        static final int TRANSACTION_interrupt = 2;
        static final int TRANSACTION_startWork = 1;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private static class Proxy implements androidx.work.multiprocess.IListenableWorkerImpl {
            public static androidx.work.multiprocess.IListenableWorkerImpl sDefaultImpl;
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

            public java.lang.String getInterfaceDescriptor() {
                    r1 = this;
                    java.lang.String r0 = "androidx.work.multiprocess.IListenableWorkerImpl"
                    return r0
            }

            @Override // androidx.work.multiprocess.IListenableWorkerImpl
            public void interrupt(byte[] r6, androidx.work.multiprocess.IWorkManagerImplCallback r7) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "androidx.work.multiprocess.IListenableWorkerImpl"
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
                    androidx.work.multiprocess.IListenableWorkerImpl r1 = androidx.work.multiprocess.IListenableWorkerImpl.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L14
                    if (r1 == 0) goto L35
                    androidx.work.multiprocess.IListenableWorkerImpl r1 = androidx.work.multiprocess.IListenableWorkerImpl.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L14
                    r1.interrupt(r6, r7)     // Catch: java.lang.Throwable -> L14
                    r0.recycle()
                    return
                L35:
                    r0.recycle()
                    return
                L39:
                    r0.recycle()
                    throw r6
            }

            @Override // androidx.work.multiprocess.IListenableWorkerImpl
            public void startWork(byte[] r5, androidx.work.multiprocess.IWorkManagerImplCallback r6) throws android.os.RemoteException {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "androidx.work.multiprocess.IListenableWorkerImpl"
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
                    androidx.work.multiprocess.IListenableWorkerImpl r1 = androidx.work.multiprocess.IListenableWorkerImpl.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L14
                    if (r1 == 0) goto L34
                    androidx.work.multiprocess.IListenableWorkerImpl r1 = androidx.work.multiprocess.IListenableWorkerImpl.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L14
                    r1.startWork(r5, r6)     // Catch: java.lang.Throwable -> L14
                    r0.recycle()
                    return
                L34:
                    r0.recycle()
                    return
                L38:
                    r0.recycle()
                    throw r5
            }
        }

        public Stub() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "androidx.work.multiprocess.IListenableWorkerImpl"
                r1.attachInterface(r1, r0)
                return
        }

        public static androidx.work.multiprocess.IListenableWorkerImpl asInterface(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "androidx.work.multiprocess.IListenableWorkerImpl"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof androidx.work.multiprocess.IListenableWorkerImpl
                if (r1 == 0) goto L13
                androidx.work.multiprocess.IListenableWorkerImpl r0 = (androidx.work.multiprocess.IListenableWorkerImpl) r0
                return r0
            L13:
                androidx.work.multiprocess.IListenableWorkerImpl$Stub$Proxy r0 = new androidx.work.multiprocess.IListenableWorkerImpl$Stub$Proxy
                r0.<init>(r2)
                return r0
        }

        public static androidx.work.multiprocess.IListenableWorkerImpl getDefaultImpl() {
                androidx.work.multiprocess.IListenableWorkerImpl r0 = androidx.work.multiprocess.IListenableWorkerImpl.Stub.Proxy.sDefaultImpl
                return r0
        }

        public static boolean setDefaultImpl(androidx.work.multiprocess.IListenableWorkerImpl r1) {
                androidx.work.multiprocess.IListenableWorkerImpl r0 = androidx.work.multiprocess.IListenableWorkerImpl.Stub.Proxy.sDefaultImpl
                if (r0 != 0) goto Lc
                if (r1 == 0) goto La
                androidx.work.multiprocess.IListenableWorkerImpl.Stub.Proxy.sDefaultImpl = r1
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
                java.lang.String r0 = "androidx.work.multiprocess.IListenableWorkerImpl"
                r1 = 1
                if (r4 == r1) goto L29
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
                byte[] r4 = r5.createByteArray()
                android.os.IBinder r5 = r5.readStrongBinder()
                androidx.work.multiprocess.IWorkManagerImplCallback r5 = androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(r5)
                r3.interrupt(r4, r5)
                return r1
            L29:
                r5.enforceInterface(r0)
                byte[] r4 = r5.createByteArray()
                android.os.IBinder r5 = r5.readStrongBinder()
                androidx.work.multiprocess.IWorkManagerImplCallback r5 = androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(r5)
                r3.startWork(r4, r5)
                return r1
        }
    }

    void interrupt(byte[] r1, androidx.work.multiprocess.IWorkManagerImplCallback r2) throws android.os.RemoteException;

    void startWork(byte[] r1, androidx.work.multiprocess.IWorkManagerImplCallback r2) throws android.os.RemoteException;
}
