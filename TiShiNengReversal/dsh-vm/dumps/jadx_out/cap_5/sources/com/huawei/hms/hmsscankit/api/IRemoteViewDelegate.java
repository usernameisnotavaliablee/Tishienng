package com.huawei.hms.hmsscankit.api;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface IRemoteViewDelegate extends android.os.IInterface {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Default implements com.huawei.hms.hmsscankit.api.IRemoteViewDelegate {
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

        @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
        public com.huawei.hms.ml.scan.HmsScan[] decodeWithBitmap(com.huawei.hms.feature.dynamic.IObjectWrapper r1, com.huawei.hms.feature.dynamic.IObjectWrapper r2) throws android.os.RemoteException {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
        public boolean getLightStatus() throws android.os.RemoteException {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
        public com.huawei.hms.feature.dynamic.IObjectWrapper getView() throws android.os.RemoteException {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
        public void onCreate(android.os.Bundle r1) throws android.os.RemoteException {
                r0 = this;
                return
        }

        @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
        public void onDestroy() throws android.os.RemoteException {
                r0 = this;
                return
        }

        @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
        public void onPause() throws android.os.RemoteException {
                r0 = this;
                return
        }

        @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
        public void onResume() throws android.os.RemoteException {
                r0 = this;
                return
        }

        @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
        public void onStart() throws android.os.RemoteException {
                r0 = this;
                return
        }

        @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
        public void onStop() throws android.os.RemoteException {
                r0 = this;
                return
        }

        @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
        public void pauseContinuouslyScan() throws android.os.RemoteException {
                r0 = this;
                return
        }

        @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
        public void resumeContinuouslyScan() throws android.os.RemoteException {
                r0 = this;
                return
        }

        @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
        public void setOnClickListener(com.huawei.hms.feature.dynamic.IObjectWrapper r1) throws android.os.RemoteException {
                r0 = this;
                return
        }

        @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
        public void setOnErrorCallback(com.huawei.hms.hmsscankit.api.IOnErrorCallback r1) throws android.os.RemoteException {
                r0 = this;
                return
        }

        @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
        public void setOnLightVisbleCallBack(com.huawei.hms.hmsscankit.api.IOnLightCallback r1) throws android.os.RemoteException {
                r0 = this;
                return
        }

        @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
        public void setOnResultCallback(com.huawei.hms.hmsscankit.api.IOnResultCallback r1) throws android.os.RemoteException {
                r0 = this;
                return
        }

        @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
        public void turnOffLight() throws android.os.RemoteException {
                r0 = this;
                return
        }

        @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
        public void turnOnLight() throws android.os.RemoteException {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class Stub extends android.os.Binder implements com.huawei.hms.hmsscankit.api.IRemoteViewDelegate {
        private static final java.lang.String DESCRIPTOR = "com.huawei.hms.hmsscankit.api.IRemoteViewDelegate";
        static final int TRANSACTION_decodeWithBitmap = 12;
        static final int TRANSACTION_getLightStatus = 14;
        static final int TRANSACTION_getView = 1;
        static final int TRANSACTION_onCreate = 2;
        static final int TRANSACTION_onDestroy = 3;
        static final int TRANSACTION_onPause = 4;
        static final int TRANSACTION_onResume = 5;
        static final int TRANSACTION_onStart = 6;
        static final int TRANSACTION_onStop = 7;
        static final int TRANSACTION_pauseContinuouslyScan = 16;
        static final int TRANSACTION_resumeContinuouslyScan = 15;
        static final int TRANSACTION_setOnClickListener = 9;
        static final int TRANSACTION_setOnErrorCallback = 17;
        static final int TRANSACTION_setOnLightVisbleCallBack = 13;
        static final int TRANSACTION_setOnResultCallback = 8;
        static final int TRANSACTION_turnOffLight = 11;
        static final int TRANSACTION_turnOnLight = 10;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private static class Proxy implements com.huawei.hms.hmsscankit.api.IRemoteViewDelegate {
            public static com.huawei.hms.hmsscankit.api.IRemoteViewDelegate sDefaultImpl;
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

            @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
            public com.huawei.hms.ml.scan.HmsScan[] decodeWithBitmap(com.huawei.hms.feature.dynamic.IObjectWrapper r6, com.huawei.hms.feature.dynamic.IObjectWrapper r7) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.huawei.hms.hmsscankit.api.IRemoteViewDelegate"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L15
                    r2 = 0
                    if (r6 == 0) goto L17
                    android.os.IBinder r3 = r6.asBinder()     // Catch: java.lang.Throwable -> L15
                    goto L18
                L15:
                    r6 = move-exception
                    goto L56
                L17:
                    r3 = r2
                L18:
                    r0.writeStrongBinder(r3)     // Catch: java.lang.Throwable -> L15
                    if (r7 == 0) goto L21
                    android.os.IBinder r2 = r7.asBinder()     // Catch: java.lang.Throwable -> L15
                L21:
                    r0.writeStrongBinder(r2)     // Catch: java.lang.Throwable -> L15
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L15
                    r3 = 12
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L15
                    if (r2 != 0) goto L44
                    com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r2 = com.huawei.hms.hmsscankit.api.IRemoteViewDelegate.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L15
                    if (r2 == 0) goto L44
                    com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r2 = com.huawei.hms.hmsscankit.api.IRemoteViewDelegate.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L15
                    com.huawei.hms.ml.scan.HmsScan[] r6 = r2.decodeWithBitmap(r6, r7)     // Catch: java.lang.Throwable -> L15
                    r1.recycle()
                    r0.recycle()
                    return r6
                L44:
                    r1.readException()     // Catch: java.lang.Throwable -> L15
                    android.os.Parcelable$Creator<com.huawei.hms.ml.scan.HmsScan> r6 = com.huawei.hms.ml.scan.HmsScan.CREATOR     // Catch: java.lang.Throwable -> L15
                    java.lang.Object[] r6 = r1.createTypedArray(r6)     // Catch: java.lang.Throwable -> L15
                    com.huawei.hms.ml.scan.HmsScan[] r6 = (com.huawei.hms.ml.scan.HmsScan[]) r6     // Catch: java.lang.Throwable -> L15
                    r1.recycle()
                    r0.recycle()
                    return r6
                L56:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            public java.lang.String getInterfaceDescriptor() {
                    r1 = this;
                    java.lang.String r0 = "com.huawei.hms.hmsscankit.api.IRemoteViewDelegate"
                    return r0
            }

            @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
            public boolean getLightStatus() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.huawei.hms.hmsscankit.api.IRemoteViewDelegate"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2d
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L2d
                    r3 = 14
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2d
                    if (r2 != 0) goto L2f
                    com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r2 = com.huawei.hms.hmsscankit.api.IRemoteViewDelegate.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L2d
                    if (r2 == 0) goto L2f
                    com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r2 = com.huawei.hms.hmsscankit.api.IRemoteViewDelegate.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L2d
                    boolean r2 = r2.getLightStatus()     // Catch: java.lang.Throwable -> L2d
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

            @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
            public com.huawei.hms.feature.dynamic.IObjectWrapper getView() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.huawei.hms.hmsscankit.api.IRemoteViewDelegate"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2c
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L2c
                    r3 = 1
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2c
                    if (r2 != 0) goto L2e
                    com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r2 = com.huawei.hms.hmsscankit.api.IRemoteViewDelegate.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L2c
                    if (r2 == 0) goto L2e
                    com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r2 = com.huawei.hms.hmsscankit.api.IRemoteViewDelegate.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L2c
                    com.huawei.hms.feature.dynamic.IObjectWrapper r2 = r2.getView()     // Catch: java.lang.Throwable -> L2c
                    r1.recycle()
                    r0.recycle()
                    return r2
                L2c:
                    r2 = move-exception
                    goto L40
                L2e:
                    r1.readException()     // Catch: java.lang.Throwable -> L2c
                    android.os.IBinder r2 = r1.readStrongBinder()     // Catch: java.lang.Throwable -> L2c
                    com.huawei.hms.feature.dynamic.IObjectWrapper r2 = com.huawei.hms.feature.dynamic.IObjectWrapper.Stub.asInterface(r2)     // Catch: java.lang.Throwable -> L2c
                    r1.recycle()
                    r0.recycle()
                    return r2
                L40:
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
            public void onCreate(android.os.Bundle r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.huawei.hms.hmsscankit.api.IRemoteViewDelegate"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L18
                    r2 = 0
                    if (r6 == 0) goto L1a
                    r3 = 1
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L18
                    r6.writeToParcel(r0, r2)     // Catch: java.lang.Throwable -> L18
                    goto L1d
                L18:
                    r6 = move-exception
                    goto L44
                L1a:
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L18
                L1d:
                    android.os.IBinder r3 = r5.mRemote     // Catch: java.lang.Throwable -> L18
                    r4 = 2
                    boolean r2 = r3.transact(r4, r0, r1, r2)     // Catch: java.lang.Throwable -> L18
                    if (r2 != 0) goto L3a
                    com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r2 = com.huawei.hms.hmsscankit.api.IRemoteViewDelegate.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L18
                    if (r2 == 0) goto L3a
                    com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r2 = com.huawei.hms.hmsscankit.api.IRemoteViewDelegate.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L18
                    r2.onCreate(r6)     // Catch: java.lang.Throwable -> L18
                    r1.recycle()
                    r0.recycle()
                    return
                L3a:
                    r1.readException()     // Catch: java.lang.Throwable -> L18
                    r1.recycle()
                    r0.recycle()
                    return
                L44:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
            public void onDestroy() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.huawei.hms.hmsscankit.api.IRemoteViewDelegate"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2b
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L2b
                    r3 = 3
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2b
                    if (r2 != 0) goto L2d
                    com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r2 = com.huawei.hms.hmsscankit.api.IRemoteViewDelegate.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L2b
                    if (r2 == 0) goto L2d
                    com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r2 = com.huawei.hms.hmsscankit.api.IRemoteViewDelegate.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L2b
                    r2.onDestroy()     // Catch: java.lang.Throwable -> L2b
                    r1.recycle()
                    r0.recycle()
                    return
                L2b:
                    r2 = move-exception
                    goto L37
                L2d:
                    r1.readException()     // Catch: java.lang.Throwable -> L2b
                    r1.recycle()
                    r0.recycle()
                    return
                L37:
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
            public void onPause() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.huawei.hms.hmsscankit.api.IRemoteViewDelegate"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2b
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L2b
                    r3 = 4
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2b
                    if (r2 != 0) goto L2d
                    com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r2 = com.huawei.hms.hmsscankit.api.IRemoteViewDelegate.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L2b
                    if (r2 == 0) goto L2d
                    com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r2 = com.huawei.hms.hmsscankit.api.IRemoteViewDelegate.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L2b
                    r2.onPause()     // Catch: java.lang.Throwable -> L2b
                    r1.recycle()
                    r0.recycle()
                    return
                L2b:
                    r2 = move-exception
                    goto L37
                L2d:
                    r1.readException()     // Catch: java.lang.Throwable -> L2b
                    r1.recycle()
                    r0.recycle()
                    return
                L37:
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
            public void onResume() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.huawei.hms.hmsscankit.api.IRemoteViewDelegate"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2b
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L2b
                    r3 = 5
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2b
                    if (r2 != 0) goto L2d
                    com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r2 = com.huawei.hms.hmsscankit.api.IRemoteViewDelegate.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L2b
                    if (r2 == 0) goto L2d
                    com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r2 = com.huawei.hms.hmsscankit.api.IRemoteViewDelegate.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L2b
                    r2.onResume()     // Catch: java.lang.Throwable -> L2b
                    r1.recycle()
                    r0.recycle()
                    return
                L2b:
                    r2 = move-exception
                    goto L37
                L2d:
                    r1.readException()     // Catch: java.lang.Throwable -> L2b
                    r1.recycle()
                    r0.recycle()
                    return
                L37:
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
            public void onStart() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.huawei.hms.hmsscankit.api.IRemoteViewDelegate"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2b
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L2b
                    r3 = 6
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2b
                    if (r2 != 0) goto L2d
                    com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r2 = com.huawei.hms.hmsscankit.api.IRemoteViewDelegate.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L2b
                    if (r2 == 0) goto L2d
                    com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r2 = com.huawei.hms.hmsscankit.api.IRemoteViewDelegate.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L2b
                    r2.onStart()     // Catch: java.lang.Throwable -> L2b
                    r1.recycle()
                    r0.recycle()
                    return
                L2b:
                    r2 = move-exception
                    goto L37
                L2d:
                    r1.readException()     // Catch: java.lang.Throwable -> L2b
                    r1.recycle()
                    r0.recycle()
                    return
                L37:
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
            public void onStop() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.huawei.hms.hmsscankit.api.IRemoteViewDelegate"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2b
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L2b
                    r3 = 7
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2b
                    if (r2 != 0) goto L2d
                    com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r2 = com.huawei.hms.hmsscankit.api.IRemoteViewDelegate.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L2b
                    if (r2 == 0) goto L2d
                    com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r2 = com.huawei.hms.hmsscankit.api.IRemoteViewDelegate.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L2b
                    r2.onStop()     // Catch: java.lang.Throwable -> L2b
                    r1.recycle()
                    r0.recycle()
                    return
                L2b:
                    r2 = move-exception
                    goto L37
                L2d:
                    r1.readException()     // Catch: java.lang.Throwable -> L2b
                    r1.recycle()
                    r0.recycle()
                    return
                L37:
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
            public void pauseContinuouslyScan() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.huawei.hms.hmsscankit.api.IRemoteViewDelegate"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2c
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L2c
                    r3 = 16
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2c
                    if (r2 != 0) goto L2e
                    com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r2 = com.huawei.hms.hmsscankit.api.IRemoteViewDelegate.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L2c
                    if (r2 == 0) goto L2e
                    com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r2 = com.huawei.hms.hmsscankit.api.IRemoteViewDelegate.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L2c
                    r2.pauseContinuouslyScan()     // Catch: java.lang.Throwable -> L2c
                    r1.recycle()
                    r0.recycle()
                    return
                L2c:
                    r2 = move-exception
                    goto L38
                L2e:
                    r1.readException()     // Catch: java.lang.Throwable -> L2c
                    r1.recycle()
                    r0.recycle()
                    return
                L38:
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
            public void resumeContinuouslyScan() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.huawei.hms.hmsscankit.api.IRemoteViewDelegate"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2c
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L2c
                    r3 = 15
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2c
                    if (r2 != 0) goto L2e
                    com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r2 = com.huawei.hms.hmsscankit.api.IRemoteViewDelegate.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L2c
                    if (r2 == 0) goto L2e
                    com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r2 = com.huawei.hms.hmsscankit.api.IRemoteViewDelegate.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L2c
                    r2.resumeContinuouslyScan()     // Catch: java.lang.Throwable -> L2c
                    r1.recycle()
                    r0.recycle()
                    return
                L2c:
                    r2 = move-exception
                    goto L38
                L2e:
                    r1.readException()     // Catch: java.lang.Throwable -> L2c
                    r1.recycle()
                    r0.recycle()
                    return
                L38:
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
            public void setOnClickListener(com.huawei.hms.feature.dynamic.IObjectWrapper r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.huawei.hms.hmsscankit.api.IRemoteViewDelegate"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L14
                    if (r6 == 0) goto L16
                    android.os.IBinder r2 = r6.asBinder()     // Catch: java.lang.Throwable -> L14
                    goto L17
                L14:
                    r6 = move-exception
                    goto L43
                L16:
                    r2 = 0
                L17:
                    r0.writeStrongBinder(r2)     // Catch: java.lang.Throwable -> L14
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L14
                    r3 = 9
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L14
                    if (r2 != 0) goto L39
                    com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r2 = com.huawei.hms.hmsscankit.api.IRemoteViewDelegate.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L14
                    if (r2 == 0) goto L39
                    com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r2 = com.huawei.hms.hmsscankit.api.IRemoteViewDelegate.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L14
                    r2.setOnClickListener(r6)     // Catch: java.lang.Throwable -> L14
                    r1.recycle()
                    r0.recycle()
                    return
                L39:
                    r1.readException()     // Catch: java.lang.Throwable -> L14
                    r1.recycle()
                    r0.recycle()
                    return
                L43:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
            public void setOnErrorCallback(com.huawei.hms.hmsscankit.api.IOnErrorCallback r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.huawei.hms.hmsscankit.api.IRemoteViewDelegate"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L14
                    if (r6 == 0) goto L16
                    android.os.IBinder r2 = r6.asBinder()     // Catch: java.lang.Throwable -> L14
                    goto L17
                L14:
                    r6 = move-exception
                    goto L43
                L16:
                    r2 = 0
                L17:
                    r0.writeStrongBinder(r2)     // Catch: java.lang.Throwable -> L14
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L14
                    r3 = 17
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L14
                    if (r2 != 0) goto L39
                    com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r2 = com.huawei.hms.hmsscankit.api.IRemoteViewDelegate.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L14
                    if (r2 == 0) goto L39
                    com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r2 = com.huawei.hms.hmsscankit.api.IRemoteViewDelegate.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L14
                    r2.setOnErrorCallback(r6)     // Catch: java.lang.Throwable -> L14
                    r1.recycle()
                    r0.recycle()
                    return
                L39:
                    r1.readException()     // Catch: java.lang.Throwable -> L14
                    r1.recycle()
                    r0.recycle()
                    return
                L43:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
            public void setOnLightVisbleCallBack(com.huawei.hms.hmsscankit.api.IOnLightCallback r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.huawei.hms.hmsscankit.api.IRemoteViewDelegate"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L14
                    if (r6 == 0) goto L16
                    android.os.IBinder r2 = r6.asBinder()     // Catch: java.lang.Throwable -> L14
                    goto L17
                L14:
                    r6 = move-exception
                    goto L43
                L16:
                    r2 = 0
                L17:
                    r0.writeStrongBinder(r2)     // Catch: java.lang.Throwable -> L14
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L14
                    r3 = 13
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L14
                    if (r2 != 0) goto L39
                    com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r2 = com.huawei.hms.hmsscankit.api.IRemoteViewDelegate.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L14
                    if (r2 == 0) goto L39
                    com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r2 = com.huawei.hms.hmsscankit.api.IRemoteViewDelegate.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L14
                    r2.setOnLightVisbleCallBack(r6)     // Catch: java.lang.Throwable -> L14
                    r1.recycle()
                    r0.recycle()
                    return
                L39:
                    r1.readException()     // Catch: java.lang.Throwable -> L14
                    r1.recycle()
                    r0.recycle()
                    return
                L43:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
            public void setOnResultCallback(com.huawei.hms.hmsscankit.api.IOnResultCallback r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.huawei.hms.hmsscankit.api.IRemoteViewDelegate"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L14
                    if (r6 == 0) goto L16
                    android.os.IBinder r2 = r6.asBinder()     // Catch: java.lang.Throwable -> L14
                    goto L17
                L14:
                    r6 = move-exception
                    goto L43
                L16:
                    r2 = 0
                L17:
                    r0.writeStrongBinder(r2)     // Catch: java.lang.Throwable -> L14
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L14
                    r3 = 8
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L14
                    if (r2 != 0) goto L39
                    com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r2 = com.huawei.hms.hmsscankit.api.IRemoteViewDelegate.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L14
                    if (r2 == 0) goto L39
                    com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r2 = com.huawei.hms.hmsscankit.api.IRemoteViewDelegate.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L14
                    r2.setOnResultCallback(r6)     // Catch: java.lang.Throwable -> L14
                    r1.recycle()
                    r0.recycle()
                    return
                L39:
                    r1.readException()     // Catch: java.lang.Throwable -> L14
                    r1.recycle()
                    r0.recycle()
                    return
                L43:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
            public void turnOffLight() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.huawei.hms.hmsscankit.api.IRemoteViewDelegate"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2c
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L2c
                    r3 = 11
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2c
                    if (r2 != 0) goto L2e
                    com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r2 = com.huawei.hms.hmsscankit.api.IRemoteViewDelegate.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L2c
                    if (r2 == 0) goto L2e
                    com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r2 = com.huawei.hms.hmsscankit.api.IRemoteViewDelegate.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L2c
                    r2.turnOffLight()     // Catch: java.lang.Throwable -> L2c
                    r1.recycle()
                    r0.recycle()
                    return
                L2c:
                    r2 = move-exception
                    goto L38
                L2e:
                    r1.readException()     // Catch: java.lang.Throwable -> L2c
                    r1.recycle()
                    r0.recycle()
                    return
                L38:
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
            public void turnOnLight() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.huawei.hms.hmsscankit.api.IRemoteViewDelegate"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2c
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L2c
                    r3 = 10
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L2c
                    if (r2 != 0) goto L2e
                    com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r2 = com.huawei.hms.hmsscankit.api.IRemoteViewDelegate.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L2c
                    if (r2 == 0) goto L2e
                    com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r2 = com.huawei.hms.hmsscankit.api.IRemoteViewDelegate.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L2c
                    r2.turnOnLight()     // Catch: java.lang.Throwable -> L2c
                    r1.recycle()
                    r0.recycle()
                    return
                L2c:
                    r2 = move-exception
                    goto L38
                L2e:
                    r1.readException()     // Catch: java.lang.Throwable -> L2c
                    r1.recycle()
                    r0.recycle()
                    return
                L38:
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }
        }

        public Stub() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "com.huawei.hms.hmsscankit.api.IRemoteViewDelegate"
                r1.attachInterface(r1, r0)
                return
        }

        public static com.huawei.hms.hmsscankit.api.IRemoteViewDelegate asInterface(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.huawei.hms.hmsscankit.api.IRemoteViewDelegate"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
                if (r1 == 0) goto L13
                com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r0 = (com.huawei.hms.hmsscankit.api.IRemoteViewDelegate) r0
                return r0
            L13:
                com.huawei.hms.hmsscankit.api.IRemoteViewDelegate$Stub$Proxy r0 = new com.huawei.hms.hmsscankit.api.IRemoteViewDelegate$Stub$Proxy
                r0.<init>(r2)
                return r0
        }

        public static com.huawei.hms.hmsscankit.api.IRemoteViewDelegate getDefaultImpl() {
                com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r0 = com.huawei.hms.hmsscankit.api.IRemoteViewDelegate.Stub.Proxy.sDefaultImpl
                return r0
        }

        public static boolean setDefaultImpl(com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r1) {
                com.huawei.hms.hmsscankit.api.IRemoteViewDelegate r0 = com.huawei.hms.hmsscankit.api.IRemoteViewDelegate.Stub.Proxy.sDefaultImpl
                if (r0 != 0) goto Lc
                if (r1 == 0) goto La
                com.huawei.hms.hmsscankit.api.IRemoteViewDelegate.Stub.Proxy.sDefaultImpl = r1
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
                java.lang.String r2 = "com.huawei.hms.hmsscankit.api.IRemoteViewDelegate"
                if (r4 == r0) goto L10c
                r0 = 0
                switch(r4) {
                    case 1: goto Lf8;
                    case 2: goto Ldf;
                    case 3: goto Ld5;
                    case 4: goto Lcb;
                    case 5: goto Lc1;
                    case 6: goto Lb7;
                    case 7: goto Lad;
                    case 8: goto L9b;
                    case 9: goto L89;
                    case 10: goto L7f;
                    case 11: goto L75;
                    case 12: goto L57;
                    case 13: goto L45;
                    case 14: goto L37;
                    case 15: goto L2d;
                    case 16: goto L23;
                    case 17: goto L11;
                    default: goto Lc;
                }
            Lc:
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            L11:
                r5.enforceInterface(r2)
                android.os.IBinder r4 = r5.readStrongBinder()
                com.huawei.hms.hmsscankit.api.IOnErrorCallback r4 = com.huawei.hms.hmsscankit.api.IOnErrorCallback.Stub.asInterface(r4)
                r3.setOnErrorCallback(r4)
                r6.writeNoException()
                return r1
            L23:
                r5.enforceInterface(r2)
                r3.pauseContinuouslyScan()
                r6.writeNoException()
                return r1
            L2d:
                r5.enforceInterface(r2)
                r3.resumeContinuouslyScan()
                r6.writeNoException()
                return r1
            L37:
                r5.enforceInterface(r2)
                boolean r4 = r3.getLightStatus()
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
            L45:
                r5.enforceInterface(r2)
                android.os.IBinder r4 = r5.readStrongBinder()
                com.huawei.hms.hmsscankit.api.IOnLightCallback r4 = com.huawei.hms.hmsscankit.api.IOnLightCallback.Stub.asInterface(r4)
                r3.setOnLightVisbleCallBack(r4)
                r6.writeNoException()
                return r1
            L57:
                r5.enforceInterface(r2)
                android.os.IBinder r4 = r5.readStrongBinder()
                com.huawei.hms.feature.dynamic.IObjectWrapper r4 = com.huawei.hms.feature.dynamic.IObjectWrapper.Stub.asInterface(r4)
                android.os.IBinder r5 = r5.readStrongBinder()
                com.huawei.hms.feature.dynamic.IObjectWrapper r5 = com.huawei.hms.feature.dynamic.IObjectWrapper.Stub.asInterface(r5)
                com.huawei.hms.ml.scan.HmsScan[] r4 = r3.decodeWithBitmap(r4, r5)
                r6.writeNoException()
                r6.writeTypedArray(r4, r1)
                return r1
            L75:
                r5.enforceInterface(r2)
                r3.turnOffLight()
                r6.writeNoException()
                return r1
            L7f:
                r5.enforceInterface(r2)
                r3.turnOnLight()
                r6.writeNoException()
                return r1
            L89:
                r5.enforceInterface(r2)
                android.os.IBinder r4 = r5.readStrongBinder()
                com.huawei.hms.feature.dynamic.IObjectWrapper r4 = com.huawei.hms.feature.dynamic.IObjectWrapper.Stub.asInterface(r4)
                r3.setOnClickListener(r4)
                r6.writeNoException()
                return r1
            L9b:
                r5.enforceInterface(r2)
                android.os.IBinder r4 = r5.readStrongBinder()
                com.huawei.hms.hmsscankit.api.IOnResultCallback r4 = com.huawei.hms.hmsscankit.api.IOnResultCallback.Stub.asInterface(r4)
                r3.setOnResultCallback(r4)
                r6.writeNoException()
                return r1
            Lad:
                r5.enforceInterface(r2)
                r3.onStop()
                r6.writeNoException()
                return r1
            Lb7:
                r5.enforceInterface(r2)
                r3.onStart()
                r6.writeNoException()
                return r1
            Lc1:
                r5.enforceInterface(r2)
                r3.onResume()
                r6.writeNoException()
                return r1
            Lcb:
                r5.enforceInterface(r2)
                r3.onPause()
                r6.writeNoException()
                return r1
            Ld5:
                r5.enforceInterface(r2)
                r3.onDestroy()
                r6.writeNoException()
                return r1
            Ldf:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto Lf1
                android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                android.os.Bundle r0 = (android.os.Bundle) r0
            Lf1:
                r3.onCreate(r0)
                r6.writeNoException()
                return r1
            Lf8:
                r5.enforceInterface(r2)
                com.huawei.hms.feature.dynamic.IObjectWrapper r4 = r3.getView()
                r6.writeNoException()
                if (r4 == 0) goto L108
                android.os.IBinder r0 = r4.asBinder()
            L108:
                r6.writeStrongBinder(r0)
                return r1
            L10c:
                r6.writeString(r2)
                return r1
        }
    }

    com.huawei.hms.ml.scan.HmsScan[] decodeWithBitmap(com.huawei.hms.feature.dynamic.IObjectWrapper r1, com.huawei.hms.feature.dynamic.IObjectWrapper r2) throws android.os.RemoteException;

    boolean getLightStatus() throws android.os.RemoteException;

    com.huawei.hms.feature.dynamic.IObjectWrapper getView() throws android.os.RemoteException;

    void onCreate(android.os.Bundle r1) throws android.os.RemoteException;

    void onDestroy() throws android.os.RemoteException;

    void onPause() throws android.os.RemoteException;

    void onResume() throws android.os.RemoteException;

    void onStart() throws android.os.RemoteException;

    void onStop() throws android.os.RemoteException;

    void pauseContinuouslyScan() throws android.os.RemoteException;

    void resumeContinuouslyScan() throws android.os.RemoteException;

    void setOnClickListener(com.huawei.hms.feature.dynamic.IObjectWrapper r1) throws android.os.RemoteException;

    void setOnErrorCallback(com.huawei.hms.hmsscankit.api.IOnErrorCallback r1) throws android.os.RemoteException;

    void setOnLightVisbleCallBack(com.huawei.hms.hmsscankit.api.IOnLightCallback r1) throws android.os.RemoteException;

    void setOnResultCallback(com.huawei.hms.hmsscankit.api.IOnResultCallback r1) throws android.os.RemoteException;

    void turnOffLight() throws android.os.RemoteException;

    void turnOnLight() throws android.os.RemoteException;
}
