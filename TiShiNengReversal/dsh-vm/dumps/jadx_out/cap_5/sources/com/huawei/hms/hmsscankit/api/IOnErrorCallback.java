package com.huawei.hms.hmsscankit.api;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface IOnErrorCallback extends android.os.IInterface {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Default implements com.huawei.hms.hmsscankit.api.IOnErrorCallback {
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

        @Override // com.huawei.hms.hmsscankit.api.IOnErrorCallback
        public void onError(int r1) throws android.os.RemoteException {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class Stub extends android.os.Binder implements com.huawei.hms.hmsscankit.api.IOnErrorCallback {
        private static final java.lang.String DESCRIPTOR = "com.huawei.hms.hmsscankit.api.IOnErrorCallback";
        static final int TRANSACTION_onError = 1;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private static class Proxy implements com.huawei.hms.hmsscankit.api.IOnErrorCallback {
            public static com.huawei.hms.hmsscankit.api.IOnErrorCallback sDefaultImpl;
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
                    java.lang.String r0 = "com.huawei.hms.hmsscankit.api.IOnErrorCallback"
                    return r0
            }

            @Override // com.huawei.hms.hmsscankit.api.IOnErrorCallback
            public void onError(int r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.huawei.hms.hmsscankit.api.IOnErrorCallback"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2e
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L2e
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L2e
                    r3 = 1
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2e
                    if (r2 != 0) goto L30
                    com.huawei.hms.hmsscankit.api.IOnErrorCallback r2 = com.huawei.hms.hmsscankit.api.IOnErrorCallback.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L2e
                    if (r2 == 0) goto L30
                    com.huawei.hms.hmsscankit.api.IOnErrorCallback r2 = com.huawei.hms.hmsscankit.api.IOnErrorCallback.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L2e
                    r2.onError(r6)     // Catch: java.lang.Throwable -> L2e
                    r1.recycle()
                    r0.recycle()
                    return
                L2e:
                    r6 = move-exception
                    goto L3a
                L30:
                    r1.readException()     // Catch: java.lang.Throwable -> L2e
                    r1.recycle()
                    r0.recycle()
                    return
                L3a:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }
        }

        public Stub() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "com.huawei.hms.hmsscankit.api.IOnErrorCallback"
                r1.attachInterface(r1, r0)
                return
        }

        public static com.huawei.hms.hmsscankit.api.IOnErrorCallback asInterface(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.huawei.hms.hmsscankit.api.IOnErrorCallback"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof com.huawei.hms.hmsscankit.api.IOnErrorCallback
                if (r1 == 0) goto L13
                com.huawei.hms.hmsscankit.api.IOnErrorCallback r0 = (com.huawei.hms.hmsscankit.api.IOnErrorCallback) r0
                return r0
            L13:
                com.huawei.hms.hmsscankit.api.IOnErrorCallback$Stub$Proxy r0 = new com.huawei.hms.hmsscankit.api.IOnErrorCallback$Stub$Proxy
                r0.<init>(r2)
                return r0
        }

        public static com.huawei.hms.hmsscankit.api.IOnErrorCallback getDefaultImpl() {
                com.huawei.hms.hmsscankit.api.IOnErrorCallback r0 = com.huawei.hms.hmsscankit.api.IOnErrorCallback.Stub.Proxy.sDefaultImpl
                return r0
        }

        public static boolean setDefaultImpl(com.huawei.hms.hmsscankit.api.IOnErrorCallback r1) {
                com.huawei.hms.hmsscankit.api.IOnErrorCallback r0 = com.huawei.hms.hmsscankit.api.IOnErrorCallback.Stub.Proxy.sDefaultImpl
                if (r0 != 0) goto Lc
                if (r1 == 0) goto La
                com.huawei.hms.hmsscankit.api.IOnErrorCallback.Stub.Proxy.sDefaultImpl = r1
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
                java.lang.String r0 = "com.huawei.hms.hmsscankit.api.IOnErrorCallback"
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
                r3.onError(r4)
                r6.writeNoException()
                return r1
        }
    }

    void onError(int r1) throws android.os.RemoteException;
}
