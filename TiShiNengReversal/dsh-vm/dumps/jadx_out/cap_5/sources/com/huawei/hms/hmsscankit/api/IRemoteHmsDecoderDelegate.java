package com.huawei.hms.hmsscankit.api;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface IRemoteHmsDecoderDelegate extends android.os.IInterface {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Default implements com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate {
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

        @Override // com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate
        public com.huawei.hms.ml.scan.HmsScan[] decodeInBitmap(com.huawei.hms.hmsscankit.DetailRect r1, com.huawei.hms.feature.dynamic.IObjectWrapper r2, com.huawei.hms.feature.dynamic.IObjectWrapper r3) throws android.os.RemoteException {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate
        public com.huawei.hms.ml.scan.HmsScan[] detectWithByteBuffer(com.huawei.hms.hmsscankit.DetailRect r1, com.huawei.hms.feature.dynamic.IObjectWrapper r2, com.huawei.hms.feature.dynamic.IObjectWrapper r3) throws android.os.RemoteException {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class Stub extends android.os.Binder implements com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate {
        private static final java.lang.String DESCRIPTOR = "com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate";
        static final int TRANSACTION_decodeInBitmap = 1;
        static final int TRANSACTION_detectWithByteBuffer = 2;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private static class Proxy implements com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate {
            public static com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate sDefaultImpl;
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

            @Override // com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate
            public com.huawei.hms.ml.scan.HmsScan[] decodeInBitmap(com.huawei.hms.hmsscankit.DetailRect r7, com.huawei.hms.feature.dynamic.IObjectWrapper r8, com.huawei.hms.feature.dynamic.IObjectWrapper r9) throws android.os.RemoteException {
                    r6 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L18
                    r2 = 1
                    r3 = 0
                    if (r7 == 0) goto L1a
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L18
                    r7.writeToParcel(r0, r3)     // Catch: java.lang.Throwable -> L18
                    goto L1d
                L18:
                    r7 = move-exception
                    goto L61
                L1a:
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L18
                L1d:
                    r4 = 0
                    if (r8 == 0) goto L25
                    android.os.IBinder r5 = r8.asBinder()     // Catch: java.lang.Throwable -> L18
                    goto L26
                L25:
                    r5 = r4
                L26:
                    r0.writeStrongBinder(r5)     // Catch: java.lang.Throwable -> L18
                    if (r9 == 0) goto L2f
                    android.os.IBinder r4 = r9.asBinder()     // Catch: java.lang.Throwable -> L18
                L2f:
                    r0.writeStrongBinder(r4)     // Catch: java.lang.Throwable -> L18
                    android.os.IBinder r4 = r6.mRemote     // Catch: java.lang.Throwable -> L18
                    boolean r2 = r4.transact(r2, r0, r1, r3)     // Catch: java.lang.Throwable -> L18
                    if (r2 != 0) goto L4f
                    com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate r2 = com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L18
                    if (r2 == 0) goto L4f
                    com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate r2 = com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L18
                    com.huawei.hms.ml.scan.HmsScan[] r7 = r2.decodeInBitmap(r7, r8, r9)     // Catch: java.lang.Throwable -> L18
                    r1.recycle()
                    r0.recycle()
                    return r7
                L4f:
                    r1.readException()     // Catch: java.lang.Throwable -> L18
                    android.os.Parcelable$Creator<com.huawei.hms.ml.scan.HmsScan> r7 = com.huawei.hms.ml.scan.HmsScan.CREATOR     // Catch: java.lang.Throwable -> L18
                    java.lang.Object[] r7 = r1.createTypedArray(r7)     // Catch: java.lang.Throwable -> L18
                    com.huawei.hms.ml.scan.HmsScan[] r7 = (com.huawei.hms.ml.scan.HmsScan[]) r7     // Catch: java.lang.Throwable -> L18
                    r1.recycle()
                    r0.recycle()
                    return r7
                L61:
                    r1.recycle()
                    r0.recycle()
                    throw r7
            }

            @Override // com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate
            public com.huawei.hms.ml.scan.HmsScan[] detectWithByteBuffer(com.huawei.hms.hmsscankit.DetailRect r6, com.huawei.hms.feature.dynamic.IObjectWrapper r7, com.huawei.hms.feature.dynamic.IObjectWrapper r8) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L18
                    r2 = 0
                    if (r6 == 0) goto L1a
                    r3 = 1
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L18
                    r6.writeToParcel(r0, r2)     // Catch: java.lang.Throwable -> L18
                    goto L1d
                L18:
                    r6 = move-exception
                    goto L62
                L1a:
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L18
                L1d:
                    r3 = 0
                    if (r7 == 0) goto L25
                    android.os.IBinder r4 = r7.asBinder()     // Catch: java.lang.Throwable -> L18
                    goto L26
                L25:
                    r4 = r3
                L26:
                    r0.writeStrongBinder(r4)     // Catch: java.lang.Throwable -> L18
                    if (r8 == 0) goto L2f
                    android.os.IBinder r3 = r8.asBinder()     // Catch: java.lang.Throwable -> L18
                L2f:
                    r0.writeStrongBinder(r3)     // Catch: java.lang.Throwable -> L18
                    android.os.IBinder r3 = r5.mRemote     // Catch: java.lang.Throwable -> L18
                    r4 = 2
                    boolean r2 = r3.transact(r4, r0, r1, r2)     // Catch: java.lang.Throwable -> L18
                    if (r2 != 0) goto L50
                    com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate r2 = com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L18
                    if (r2 == 0) goto L50
                    com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate r2 = com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L18
                    com.huawei.hms.ml.scan.HmsScan[] r6 = r2.detectWithByteBuffer(r6, r7, r8)     // Catch: java.lang.Throwable -> L18
                    r1.recycle()
                    r0.recycle()
                    return r6
                L50:
                    r1.readException()     // Catch: java.lang.Throwable -> L18
                    android.os.Parcelable$Creator<com.huawei.hms.ml.scan.HmsScan> r6 = com.huawei.hms.ml.scan.HmsScan.CREATOR     // Catch: java.lang.Throwable -> L18
                    java.lang.Object[] r6 = r1.createTypedArray(r6)     // Catch: java.lang.Throwable -> L18
                    com.huawei.hms.ml.scan.HmsScan[] r6 = (com.huawei.hms.ml.scan.HmsScan[]) r6     // Catch: java.lang.Throwable -> L18
                    r1.recycle()
                    r0.recycle()
                    return r6
                L62:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            public java.lang.String getInterfaceDescriptor() {
                    r1 = this;
                    java.lang.String r0 = "com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate"
                    return r0
            }
        }

        public Stub() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate"
                r1.attachInterface(r1, r0)
                return
        }

        public static com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate asInterface(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate
                if (r1 == 0) goto L13
                com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate r0 = (com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate) r0
                return r0
            L13:
                com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate$Stub$Proxy r0 = new com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate$Stub$Proxy
                r0.<init>(r2)
                return r0
        }

        public static com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate getDefaultImpl() {
                com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate r0 = com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate.Stub.Proxy.sDefaultImpl
                return r0
        }

        public static boolean setDefaultImpl(com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate r1) {
                com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate r0 = com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate.Stub.Proxy.sDefaultImpl
                if (r0 != 0) goto Lc
                if (r1 == 0) goto La
                com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate.Stub.Proxy.sDefaultImpl = r1
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
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) throws android.os.RemoteException {
                r4 = this;
                r0 = 0
                java.lang.String r1 = "com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate"
                r2 = 1
                if (r5 == r2) goto L44
                r3 = 2
                if (r5 == r3) goto L17
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r5 == r0) goto L13
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L13:
                r7.writeString(r1)
                return r2
            L17:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L29
                android.os.Parcelable$Creator<com.huawei.hms.hmsscankit.DetailRect> r5 = com.huawei.hms.hmsscankit.DetailRect.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r0 = r5
                com.huawei.hms.hmsscankit.DetailRect r0 = (com.huawei.hms.hmsscankit.DetailRect) r0
            L29:
                android.os.IBinder r5 = r6.readStrongBinder()
                com.huawei.hms.feature.dynamic.IObjectWrapper r5 = com.huawei.hms.feature.dynamic.IObjectWrapper.Stub.asInterface(r5)
                android.os.IBinder r6 = r6.readStrongBinder()
                com.huawei.hms.feature.dynamic.IObjectWrapper r6 = com.huawei.hms.feature.dynamic.IObjectWrapper.Stub.asInterface(r6)
                com.huawei.hms.ml.scan.HmsScan[] r5 = r4.detectWithByteBuffer(r0, r5, r6)
                r7.writeNoException()
                r7.writeTypedArray(r5, r2)
                return r2
            L44:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L56
                android.os.Parcelable$Creator<com.huawei.hms.hmsscankit.DetailRect> r5 = com.huawei.hms.hmsscankit.DetailRect.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r0 = r5
                com.huawei.hms.hmsscankit.DetailRect r0 = (com.huawei.hms.hmsscankit.DetailRect) r0
            L56:
                android.os.IBinder r5 = r6.readStrongBinder()
                com.huawei.hms.feature.dynamic.IObjectWrapper r5 = com.huawei.hms.feature.dynamic.IObjectWrapper.Stub.asInterface(r5)
                android.os.IBinder r6 = r6.readStrongBinder()
                com.huawei.hms.feature.dynamic.IObjectWrapper r6 = com.huawei.hms.feature.dynamic.IObjectWrapper.Stub.asInterface(r6)
                com.huawei.hms.ml.scan.HmsScan[] r5 = r4.decodeInBitmap(r0, r5, r6)
                r7.writeNoException()
                r7.writeTypedArray(r5, r2)
                return r2
        }
    }

    com.huawei.hms.ml.scan.HmsScan[] decodeInBitmap(com.huawei.hms.hmsscankit.DetailRect r1, com.huawei.hms.feature.dynamic.IObjectWrapper r2, com.huawei.hms.feature.dynamic.IObjectWrapper r3) throws android.os.RemoteException;

    com.huawei.hms.ml.scan.HmsScan[] detectWithByteBuffer(com.huawei.hms.hmsscankit.DetailRect r1, com.huawei.hms.feature.dynamic.IObjectWrapper r2, com.huawei.hms.feature.dynamic.IObjectWrapper r3) throws android.os.RemoteException;
}
