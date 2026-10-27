package cn.jiguang.android;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface IDataShare extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "cn.jiguang.android.IDataShare";

    public static class Default implements cn.jiguang.android.IDataShare {
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

        @Override // cn.jiguang.android.IDataShare
        public java.lang.String bind(cn.jiguang.android.IDataShare r1, java.lang.String r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // cn.jiguang.android.IDataShare
        public android.os.Bundle execute(java.lang.String r1, java.lang.String r2, android.os.Bundle r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // cn.jiguang.android.IDataShare
        public android.os.IBinder getBinderByType(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // cn.jiguang.android.IDataShare
        public void onAction(java.lang.String r1, java.lang.String r2, android.os.Bundle r3) {
                r0 = this;
                return
        }
    }

    public static abstract class Stub extends android.os.Binder implements cn.jiguang.android.IDataShare {
        static final int TRANSACTION_bind = 4;
        static final int TRANSACTION_execute = 3;
        static final int TRANSACTION_getBinderByType = 1;
        static final int TRANSACTION_onAction = 2;

        private static class a implements cn.jiguang.android.IDataShare {
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

            @Override // cn.jiguang.android.IDataShare
            public java.lang.String bind(cn.jiguang.android.IDataShare r4, java.lang.String r5) {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "cn.jiguang.android.IDataShare"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L28
                    r0.writeStrongInterface(r4)     // Catch: java.lang.Throwable -> L28
                    r0.writeString(r5)     // Catch: java.lang.Throwable -> L28
                    android.os.IBinder r4 = r3.a     // Catch: java.lang.Throwable -> L28
                    r5 = 4
                    r2 = 0
                    r4.transact(r5, r0, r1, r2)     // Catch: java.lang.Throwable -> L28
                    r1.readException()     // Catch: java.lang.Throwable -> L28
                    java.lang.String r4 = r1.readString()     // Catch: java.lang.Throwable -> L28
                    r1.recycle()
                    r0.recycle()
                    return r4
                L28:
                    r4 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r4
            }

            @Override // cn.jiguang.android.IDataShare
            public android.os.Bundle execute(java.lang.String r4, java.lang.String r5, android.os.Bundle r6) {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "cn.jiguang.android.IDataShare"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2f
                    r0.writeString(r4)     // Catch: java.lang.Throwable -> L2f
                    r0.writeString(r5)     // Catch: java.lang.Throwable -> L2f
                    r4 = 0
                    cn.jiguang.android.IDataShare._Parcel.access$100(r0, r6, r4)     // Catch: java.lang.Throwable -> L2f
                    android.os.IBinder r5 = r3.a     // Catch: java.lang.Throwable -> L2f
                    r6 = 3
                    r5.transact(r6, r0, r1, r4)     // Catch: java.lang.Throwable -> L2f
                    r1.readException()     // Catch: java.lang.Throwable -> L2f
                    android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR     // Catch: java.lang.Throwable -> L2f
                    java.lang.Object r4 = cn.jiguang.android.IDataShare._Parcel.access$000(r1, r4)     // Catch: java.lang.Throwable -> L2f
                    android.os.Bundle r4 = (android.os.Bundle) r4     // Catch: java.lang.Throwable -> L2f
                    r1.recycle()
                    r0.recycle()
                    return r4
                L2f:
                    r4 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r4
            }

            @Override // cn.jiguang.android.IDataShare
            public android.os.IBinder getBinderByType(java.lang.String r4, java.lang.String r5) {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "cn.jiguang.android.IDataShare"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L28
                    r0.writeString(r4)     // Catch: java.lang.Throwable -> L28
                    r0.writeString(r5)     // Catch: java.lang.Throwable -> L28
                    android.os.IBinder r4 = r3.a     // Catch: java.lang.Throwable -> L28
                    r5 = 1
                    r2 = 0
                    r4.transact(r5, r0, r1, r2)     // Catch: java.lang.Throwable -> L28
                    r1.readException()     // Catch: java.lang.Throwable -> L28
                    android.os.IBinder r4 = r1.readStrongBinder()     // Catch: java.lang.Throwable -> L28
                    r1.recycle()
                    r0.recycle()
                    return r4
                L28:
                    r4 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r4
            }

            @Override // cn.jiguang.android.IDataShare
            public void onAction(java.lang.String r3, java.lang.String r4, android.os.Bundle r5) {
                    r2 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "cn.jiguang.android.IDataShare"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L1f
                    r0.writeString(r3)     // Catch: java.lang.Throwable -> L1f
                    r0.writeString(r4)     // Catch: java.lang.Throwable -> L1f
                    r3 = 0
                    cn.jiguang.android.IDataShare._Parcel.access$100(r0, r5, r3)     // Catch: java.lang.Throwable -> L1f
                    android.os.IBinder r3 = r2.a     // Catch: java.lang.Throwable -> L1f
                    r4 = 0
                    r5 = 1
                    r1 = 2
                    r3.transact(r1, r0, r4, r5)     // Catch: java.lang.Throwable -> L1f
                    r0.recycle()
                    return
                L1f:
                    r3 = move-exception
                    r0.recycle()
                    throw r3
            }
        }

        public Stub() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "cn.jiguang.android.IDataShare"
                r1.attachInterface(r1, r0)
                return
        }

        public static cn.jiguang.android.IDataShare asInterface(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "cn.jiguang.android.IDataShare"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof cn.jiguang.android.IDataShare
                if (r1 == 0) goto L13
                cn.jiguang.android.IDataShare r0 = (cn.jiguang.android.IDataShare) r0
                return r0
            L13:
                cn.jiguang.android.IDataShare$Stub$a r0 = new cn.jiguang.android.IDataShare$Stub$a
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
                r0 = this;
                return r0
        }

        @Override // android.os.Binder
        public boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) {
                r3 = this;
                java.lang.String r0 = "cn.jiguang.android.IDataShare"
                r1 = 1
                if (r4 < r1) goto Ld
                r2 = 16777215(0xffffff, float:2.3509886E-38)
                if (r4 > r2) goto Ld
                r5.enforceInterface(r0)
            Ld:
                r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r4 == r2) goto L7b
                if (r4 == r1) goto L68
                r0 = 2
                if (r4 == r0) goto L54
                r0 = 3
                if (r4 == r0) goto L39
                r0 = 4
                if (r4 == r0) goto L22
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            L22:
                android.os.IBinder r4 = r5.readStrongBinder()
                cn.jiguang.android.IDataShare r4 = asInterface(r4)
                java.lang.String r5 = r5.readString()
                java.lang.String r4 = r3.bind(r4, r5)
                r6.writeNoException()
                r6.writeString(r4)
                goto L7a
            L39:
                java.lang.String r4 = r5.readString()
                java.lang.String r7 = r5.readString()
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r5 = cn.jiguang.android.IDataShare._Parcel.access$000(r5, r0)
                android.os.Bundle r5 = (android.os.Bundle) r5
                android.os.Bundle r4 = r3.execute(r4, r7, r5)
                r6.writeNoException()
                cn.jiguang.android.IDataShare._Parcel.access$100(r6, r4, r1)
                goto L7a
            L54:
                java.lang.String r4 = r5.readString()
                java.lang.String r6 = r5.readString()
                android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
                java.lang.Object r5 = cn.jiguang.android.IDataShare._Parcel.access$000(r5, r7)
                android.os.Bundle r5 = (android.os.Bundle) r5
                r3.onAction(r4, r6, r5)
                goto L7a
            L68:
                java.lang.String r4 = r5.readString()
                java.lang.String r5 = r5.readString()
                android.os.IBinder r4 = r3.getBinderByType(r4, r5)
                r6.writeNoException()
                r6.writeStrongBinder(r4)
            L7a:
                return r1
            L7b:
                r6.writeString(r0)
                return r1
        }
    }

    public static class _Parcel {
        public _Parcel() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ java.lang.Object access$000(android.os.Parcel r0, android.os.Parcelable.Creator r1) {
                java.lang.Object r0 = readTypedObject(r0, r1)
                return r0
        }

        static /* synthetic */ void access$100(android.os.Parcel r0, android.os.Parcelable r1, int r2) {
                writeTypedObject(r0, r1, r2)
                return
        }

        private static <T> T readTypedObject(android.os.Parcel r1, android.os.Parcelable.Creator<T> r2) {
                int r0 = r1.readInt()
                if (r0 == 0) goto Lb
                java.lang.Object r1 = r2.createFromParcel(r1)
                return r1
            Lb:
                r1 = 0
                return r1
        }

        private static <T extends android.os.Parcelable> void writeTypedObject(android.os.Parcel r1, T r2, int r3) {
                if (r2 == 0) goto La
                r0 = 1
                r1.writeInt(r0)
                r2.writeToParcel(r1, r3)
                return
            La:
                r2 = 0
                r1.writeInt(r2)
                return
        }
    }

    java.lang.String bind(cn.jiguang.android.IDataShare r1, java.lang.String r2);

    android.os.Bundle execute(java.lang.String r1, java.lang.String r2, android.os.Bundle r3);

    android.os.IBinder getBinderByType(java.lang.String r1, java.lang.String r2);

    void onAction(java.lang.String r1, java.lang.String r2, android.os.Bundle r3);
}
