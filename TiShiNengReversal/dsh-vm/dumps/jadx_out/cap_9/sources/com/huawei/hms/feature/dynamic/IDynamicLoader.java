package com.huawei.hms.feature.dynamic;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface IDynamicLoader extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.huawei.hms.feature.dynamic.IDynamicLoader";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Default implements com.huawei.hms.feature.dynamic.IDynamicLoader {
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

        @Override // com.huawei.hms.feature.dynamic.IDynamicLoader
        public com.huawei.hms.feature.dynamic.IObjectWrapper load(com.huawei.hms.feature.dynamic.IObjectWrapper r1, java.lang.String r2, int r3, com.huawei.hms.feature.dynamic.IObjectWrapper r4) throws android.os.RemoteException {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class Stub extends android.os.Binder implements com.huawei.hms.feature.dynamic.IDynamicLoader {
        public static final int a = 1;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static class Proxy implements com.huawei.hms.feature.dynamic.IDynamicLoader {
            public static com.huawei.hms.feature.dynamic.IDynamicLoader sDefaultImpl;
            public android.os.IBinder a;

            public Proxy(android.os.IBinder r1) {
                    r0 = this;
                    r0.<init>()
                    r0.a = r1
                    return
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                    r1 = this;
                    android.os.IBinder r0 = r1.a
                    return r0
            }

            public java.lang.String getInterfaceDescriptor() {
                    r1 = this;
                    java.lang.String r0 = "com.huawei.hms.feature.dynamic.IDynamicLoader"
                    return r0
            }

            @Override // com.huawei.hms.feature.dynamic.IDynamicLoader
            public com.huawei.hms.feature.dynamic.IObjectWrapper load(com.huawei.hms.feature.dynamic.IObjectWrapper r6, java.lang.String r7, int r8, com.huawei.hms.feature.dynamic.IObjectWrapper r9) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.huawei.hms.feature.dynamic.IDynamicLoader"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L15
                    r2 = 0
                    if (r6 == 0) goto L17
                    android.os.IBinder r3 = r6.asBinder()     // Catch: java.lang.Throwable -> L15
                    goto L18
                L15:
                    r6 = move-exception
                    goto L55
                L17:
                    r3 = r2
                L18:
                    r0.writeStrongBinder(r3)     // Catch: java.lang.Throwable -> L15
                    r0.writeString(r7)     // Catch: java.lang.Throwable -> L15
                    r0.writeInt(r8)     // Catch: java.lang.Throwable -> L15
                    if (r9 == 0) goto L27
                    android.os.IBinder r2 = r9.asBinder()     // Catch: java.lang.Throwable -> L15
                L27:
                    r0.writeStrongBinder(r2)     // Catch: java.lang.Throwable -> L15
                    android.os.IBinder r2 = r5.a     // Catch: java.lang.Throwable -> L15
                    r3 = 1
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L15
                    if (r2 != 0) goto L49
                    com.huawei.hms.feature.dynamic.IDynamicLoader r2 = com.huawei.hms.feature.dynamic.IDynamicLoader.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L15
                    if (r2 == 0) goto L49
                    com.huawei.hms.feature.dynamic.IDynamicLoader r2 = com.huawei.hms.feature.dynamic.IDynamicLoader.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L15
                    com.huawei.hms.feature.dynamic.IObjectWrapper r6 = r2.load(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L15
                L42:
                    r1.recycle()
                    r0.recycle()
                    return r6
                L49:
                    r1.readException()     // Catch: java.lang.Throwable -> L15
                    android.os.IBinder r6 = r1.readStrongBinder()     // Catch: java.lang.Throwable -> L15
                    com.huawei.hms.feature.dynamic.IObjectWrapper r6 = com.huawei.hms.feature.dynamic.IObjectWrapper.Stub.asInterface(r6)     // Catch: java.lang.Throwable -> L15
                    goto L42
                L55:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }
        }

        public Stub() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "com.huawei.hms.feature.dynamic.IDynamicLoader"
                r1.attachInterface(r1, r0)
                return
        }

        public static com.huawei.hms.feature.dynamic.IDynamicLoader asInterface(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.huawei.hms.feature.dynamic.IDynamicLoader"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof com.huawei.hms.feature.dynamic.IDynamicLoader
                if (r1 == 0) goto L13
                com.huawei.hms.feature.dynamic.IDynamicLoader r0 = (com.huawei.hms.feature.dynamic.IDynamicLoader) r0
                return r0
            L13:
                com.huawei.hms.feature.dynamic.IDynamicLoader$Stub$Proxy r0 = new com.huawei.hms.feature.dynamic.IDynamicLoader$Stub$Proxy
                r0.<init>(r2)
                return r0
        }

        public static com.huawei.hms.feature.dynamic.IDynamicLoader getDefaultImpl() {
                com.huawei.hms.feature.dynamic.IDynamicLoader r0 = com.huawei.hms.feature.dynamic.IDynamicLoader.Stub.Proxy.sDefaultImpl
                return r0
        }

        public static boolean setDefaultImpl(com.huawei.hms.feature.dynamic.IDynamicLoader r1) {
                com.huawei.hms.feature.dynamic.IDynamicLoader r0 = com.huawei.hms.feature.dynamic.IDynamicLoader.Stub.Proxy.sDefaultImpl
                if (r0 != 0) goto Lc
                if (r1 == 0) goto La
                com.huawei.hms.feature.dynamic.IDynamicLoader.Stub.Proxy.sDefaultImpl = r1
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
                java.lang.String r2 = "com.huawei.hms.feature.dynamic.IDynamicLoader"
                if (r4 == r0) goto L3d
                if (r4 == r1) goto Lf
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            Lf:
                r5.enforceInterface(r2)
                android.os.IBinder r4 = r5.readStrongBinder()
                com.huawei.hms.feature.dynamic.IObjectWrapper r4 = com.huawei.hms.feature.dynamic.IObjectWrapper.Stub.asInterface(r4)
                java.lang.String r7 = r5.readString()
                int r0 = r5.readInt()
                android.os.IBinder r5 = r5.readStrongBinder()
                com.huawei.hms.feature.dynamic.IObjectWrapper r5 = com.huawei.hms.feature.dynamic.IObjectWrapper.Stub.asInterface(r5)
                com.huawei.hms.feature.dynamic.IObjectWrapper r4 = r3.load(r4, r7, r0, r5)
                r6.writeNoException()
                if (r4 == 0) goto L38
                android.os.IBinder r4 = r4.asBinder()
                goto L39
            L38:
                r4 = 0
            L39:
                r6.writeStrongBinder(r4)
                return r1
            L3d:
                r6.writeString(r2)
                return r1
        }
    }

    com.huawei.hms.feature.dynamic.IObjectWrapper load(com.huawei.hms.feature.dynamic.IObjectWrapper r1, java.lang.String r2, int r3, com.huawei.hms.feature.dynamic.IObjectWrapper r4) throws android.os.RemoteException;
}
