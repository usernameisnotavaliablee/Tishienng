package com.huawei.hms.feature.dynamic;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface IDynamicInstall extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.huawei.hms.feature.dynamic.IDynamicInstall";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Default implements com.huawei.hms.feature.dynamic.IDynamicInstall {
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

        @Override // com.huawei.hms.feature.dynamic.IDynamicInstall
        public android.os.Bundle install(com.huawei.hms.feature.dynamic.IObjectWrapper r1, android.os.Bundle r2) throws android.os.RemoteException {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class Stub extends android.os.Binder implements com.huawei.hms.feature.dynamic.IDynamicInstall {
        public static final int a = 1;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static class Proxy implements com.huawei.hms.feature.dynamic.IDynamicInstall {
            public static com.huawei.hms.feature.dynamic.IDynamicInstall sDefaultImpl;
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
                    java.lang.String r0 = "com.huawei.hms.feature.dynamic.IDynamicInstall"
                    return r0
            }

            @Override // com.huawei.hms.feature.dynamic.IDynamicInstall
            public android.os.Bundle install(com.huawei.hms.feature.dynamic.IObjectWrapper r7, android.os.Bundle r8) throws android.os.RemoteException {
                    r6 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.huawei.hms.feature.dynamic.IDynamicInstall"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L15
                    r2 = 0
                    if (r7 == 0) goto L17
                    android.os.IBinder r3 = r7.asBinder()     // Catch: java.lang.Throwable -> L15
                    goto L18
                L15:
                    r7 = move-exception
                    goto L5f
                L17:
                    r3 = r2
                L18:
                    r0.writeStrongBinder(r3)     // Catch: java.lang.Throwable -> L15
                    r3 = 1
                    r4 = 0
                    if (r8 == 0) goto L26
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L15
                    r8.writeToParcel(r0, r4)     // Catch: java.lang.Throwable -> L15
                    goto L29
                L26:
                    r0.writeInt(r4)     // Catch: java.lang.Throwable -> L15
                L29:
                    android.os.IBinder r5 = r6.a     // Catch: java.lang.Throwable -> L15
                    boolean r3 = r5.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L15
                    if (r3 != 0) goto L46
                    com.huawei.hms.feature.dynamic.IDynamicInstall r3 = com.huawei.hms.feature.dynamic.IDynamicInstall.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L15
                    if (r3 == 0) goto L46
                    com.huawei.hms.feature.dynamic.IDynamicInstall r2 = com.huawei.hms.feature.dynamic.IDynamicInstall.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L15
                    android.os.Bundle r7 = r2.install(r7, r8)     // Catch: java.lang.Throwable -> L15
                    r1.recycle()
                    r0.recycle()
                    return r7
                L46:
                    r1.readException()     // Catch: java.lang.Throwable -> L15
                    int r7 = r1.readInt()     // Catch: java.lang.Throwable -> L15
                    if (r7 == 0) goto L58
                    android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR     // Catch: java.lang.Throwable -> L15
                    java.lang.Object r7 = r7.createFromParcel(r1)     // Catch: java.lang.Throwable -> L15
                    r2 = r7
                    android.os.Bundle r2 = (android.os.Bundle) r2     // Catch: java.lang.Throwable -> L15
                L58:
                    r1.recycle()
                    r0.recycle()
                    return r2
                L5f:
                    r1.recycle()
                    r0.recycle()
                    throw r7
            }
        }

        public Stub() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "com.huawei.hms.feature.dynamic.IDynamicInstall"
                r1.attachInterface(r1, r0)
                return
        }

        public static com.huawei.hms.feature.dynamic.IDynamicInstall asInterface(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.huawei.hms.feature.dynamic.IDynamicInstall"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof com.huawei.hms.feature.dynamic.IDynamicInstall
                if (r1 == 0) goto L13
                com.huawei.hms.feature.dynamic.IDynamicInstall r0 = (com.huawei.hms.feature.dynamic.IDynamicInstall) r0
                return r0
            L13:
                com.huawei.hms.feature.dynamic.IDynamicInstall$Stub$Proxy r0 = new com.huawei.hms.feature.dynamic.IDynamicInstall$Stub$Proxy
                r0.<init>(r2)
                return r0
        }

        public static com.huawei.hms.feature.dynamic.IDynamicInstall getDefaultImpl() {
                com.huawei.hms.feature.dynamic.IDynamicInstall r0 = com.huawei.hms.feature.dynamic.IDynamicInstall.Stub.Proxy.sDefaultImpl
                return r0
        }

        public static boolean setDefaultImpl(com.huawei.hms.feature.dynamic.IDynamicInstall r1) {
                com.huawei.hms.feature.dynamic.IDynamicInstall r0 = com.huawei.hms.feature.dynamic.IDynamicInstall.Stub.Proxy.sDefaultImpl
                if (r0 != 0) goto Lc
                if (r1 == 0) goto La
                com.huawei.hms.feature.dynamic.IDynamicInstall.Stub.Proxy.sDefaultImpl = r1
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
                java.lang.String r2 = "com.huawei.hms.feature.dynamic.IDynamicInstall"
                if (r4 == r0) goto L3f
                if (r4 == r1) goto Lf
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            Lf:
                r5.enforceInterface(r2)
                android.os.IBinder r4 = r5.readStrongBinder()
                com.huawei.hms.feature.dynamic.IObjectWrapper r4 = com.huawei.hms.feature.dynamic.IObjectWrapper.Stub.asInterface(r4)
                int r7 = r5.readInt()
                if (r7 == 0) goto L29
                android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r7.createFromParcel(r5)
                android.os.Bundle r5 = (android.os.Bundle) r5
                goto L2a
            L29:
                r5 = 0
            L2a:
                android.os.Bundle r4 = r3.install(r4, r5)
                r6.writeNoException()
                if (r4 == 0) goto L3a
                r6.writeInt(r1)
                r4.writeToParcel(r6, r1)
                goto L3e
            L3a:
                r4 = 0
                r6.writeInt(r4)
            L3e:
                return r1
            L3f:
                r6.writeString(r2)
                return r1
        }
    }

    android.os.Bundle install(com.huawei.hms.feature.dynamic.IObjectWrapper r1, android.os.Bundle r2) throws android.os.RemoteException;
}
