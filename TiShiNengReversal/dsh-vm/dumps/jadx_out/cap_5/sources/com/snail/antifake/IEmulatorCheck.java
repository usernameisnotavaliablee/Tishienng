package com.snail.antifake;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface IEmulatorCheck extends android.os.IInterface {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class Stub extends android.os.Binder implements com.snail.antifake.IEmulatorCheck {
        private static final java.lang.String a = "com.snail.antifake.IEmulatorCheck";
        static final int b = 1;
        static final int c = 2;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private static class a implements com.snail.antifake.IEmulatorCheck {
            private android.os.IBinder a;

            a(android.os.IBinder r1) {
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

            public java.lang.String e() {
                    r1 = this;
                    java.lang.String r0 = "com.snail.antifake.IEmulatorCheck"
                    return r0
            }

            @Override // com.snail.antifake.IEmulatorCheck
            public boolean w() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.snail.antifake.IEmulatorCheck"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L25
                    android.os.IBinder r2 = r5.a     // Catch: java.lang.Throwable -> L25
                    r3 = 0
                    r4 = 1
                    r2.transact(r4, r0, r1, r3)     // Catch: java.lang.Throwable -> L25
                    r1.readException()     // Catch: java.lang.Throwable -> L25
                    int r2 = r1.readInt()     // Catch: java.lang.Throwable -> L25
                    if (r2 == 0) goto L1e
                    r3 = 1
                L1e:
                    r1.recycle()
                    r0.recycle()
                    return r3
                L25:
                    r2 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // com.snail.antifake.IEmulatorCheck
            public void x() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.snail.antifake.IEmulatorCheck"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L1e
                    android.os.IBinder r2 = r5.a     // Catch: java.lang.Throwable -> L1e
                    r3 = 2
                    r4 = 0
                    r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L1e
                    r1.readException()     // Catch: java.lang.Throwable -> L1e
                    r1.recycle()
                    r0.recycle()
                    return
                L1e:
                    r2 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }
        }

        public Stub() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "com.snail.antifake.IEmulatorCheck"
                r1.attachInterface(r1, r0)
                return
        }

        public static com.snail.antifake.IEmulatorCheck e(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.snail.antifake.IEmulatorCheck"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof com.snail.antifake.IEmulatorCheck
                if (r1 == 0) goto L13
                com.snail.antifake.IEmulatorCheck r0 = (com.snail.antifake.IEmulatorCheck) r0
                return r0
            L13:
                com.snail.antifake.IEmulatorCheck$Stub$a r0 = new com.snail.antifake.IEmulatorCheck$Stub$a
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
                java.lang.String r0 = "com.snail.antifake.IEmulatorCheck"
                r1 = 1
                if (r4 == r1) goto L20
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
                r3.x()
                r6.writeNoException()
                return r1
            L20:
                r5.enforceInterface(r0)
                boolean r4 = r3.w()
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
        }
    }

    boolean w() throws android.os.RemoteException;

    void x() throws android.os.RemoteException;
}
