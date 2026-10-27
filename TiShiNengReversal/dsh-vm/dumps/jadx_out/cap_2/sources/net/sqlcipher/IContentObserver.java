package net.sqlcipher;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface IContentObserver extends android.os.IInterface {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class Stub extends android.os.Binder implements net.sqlcipher.IContentObserver {
        private static final java.lang.String DESCRIPTOR = "net.sqlcipher.IContentObserver";
        static final int TRANSACTION_onChange = 1;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private static class Proxy implements net.sqlcipher.IContentObserver {
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
                    java.lang.String r0 = "net.sqlcipher.IContentObserver"
                    return r0
            }

            @Override // net.sqlcipher.IContentObserver
            public void onChange(boolean r4) throws android.os.RemoteException {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "net.sqlcipher.IContentObserver"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L17
                    r0.writeInt(r4)     // Catch: java.lang.Throwable -> L17
                    android.os.IBinder r4 = r3.mRemote     // Catch: java.lang.Throwable -> L17
                    r1 = 0
                    r2 = 1
                    r4.transact(r2, r0, r1, r2)     // Catch: java.lang.Throwable -> L17
                    r0.recycle()
                    return
                L17:
                    r4 = move-exception
                    r0.recycle()
                    throw r4
            }
        }

        public Stub() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "net.sqlcipher.IContentObserver"
                r1.attachInterface(r1, r0)
                return
        }

        public static net.sqlcipher.IContentObserver asInterface(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "net.sqlcipher.IContentObserver"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof net.sqlcipher.IContentObserver
                if (r1 == 0) goto L13
                net.sqlcipher.IContentObserver r0 = (net.sqlcipher.IContentObserver) r0
                return r0
            L13:
                net.sqlcipher.IContentObserver$Stub$Proxy r0 = new net.sqlcipher.IContentObserver$Stub$Proxy
                r0.<init>(r2)
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
                java.lang.String r0 = "net.sqlcipher.IContentObserver"
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
                if (r4 == 0) goto L1e
                r4 = 1
                goto L1f
            L1e:
                r4 = 0
            L1f:
                r3.onChange(r4)
                return r1
        }
    }

    void onChange(boolean r1) throws android.os.RemoteException;
}
