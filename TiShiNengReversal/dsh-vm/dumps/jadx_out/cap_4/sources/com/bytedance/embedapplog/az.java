package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface az extends android.os.IInterface {

    public static abstract class j extends android.os.Binder implements com.bytedance.embedapplog.az {

        /* renamed from: com.bytedance.embedapplog.az$j$j, reason: collision with other inner class name */
        static class C0201j implements com.bytedance.embedapplog.az {
            private android.os.IBinder j;

            C0201j(android.os.IBinder r1) {
                    r0 = this;
                    r0.<init>()
                    r0.j = r1
                    return
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                    r1 = this;
                    android.os.IBinder r0 = r1.j
                    return r0
            }

            @Override // com.bytedance.embedapplog.az
            public java.lang.String cw() {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.asus.msa.SupplementaryDID.IDidAidlInterface"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L22
                    android.os.IBinder r2 = r5.j     // Catch: java.lang.Throwable -> L22
                    r3 = 3
                    r4 = 0
                    r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L22
                    r1.readException()     // Catch: java.lang.Throwable -> L22
                    java.lang.String r2 = r1.readString()     // Catch: java.lang.Throwable -> L22
                    r1.recycle()
                    r0.recycle()
                    return r2
                L22:
                    r2 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // com.bytedance.embedapplog.az
            public boolean j() {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.asus.msa.SupplementaryDID.IDidAidlInterface"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L25
                    android.os.IBinder r2 = r5.j     // Catch: java.lang.Throwable -> L25
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

            @Override // com.bytedance.embedapplog.az
            public java.lang.String r() {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.asus.msa.SupplementaryDID.IDidAidlInterface"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L22
                    android.os.IBinder r2 = r5.j     // Catch: java.lang.Throwable -> L22
                    r3 = 4
                    r4 = 0
                    r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L22
                    r1.readException()     // Catch: java.lang.Throwable -> L22
                    java.lang.String r2 = r1.readString()     // Catch: java.lang.Throwable -> L22
                    r1.recycle()
                    r0.recycle()
                    return r2
                L22:
                    r2 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // com.bytedance.embedapplog.az
            public java.lang.String up() {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.asus.msa.SupplementaryDID.IDidAidlInterface"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L22
                    android.os.IBinder r2 = r5.j     // Catch: java.lang.Throwable -> L22
                    r3 = 5
                    r4 = 0
                    r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L22
                    r1.readException()     // Catch: java.lang.Throwable -> L22
                    java.lang.String r2 = r1.readString()     // Catch: java.lang.Throwable -> L22
                    r1.recycle()
                    r0.recycle()
                    return r2
                L22:
                    r2 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // com.bytedance.embedapplog.az
            public java.lang.String xt() {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.asus.msa.SupplementaryDID.IDidAidlInterface"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L22
                    android.os.IBinder r2 = r5.j     // Catch: java.lang.Throwable -> L22
                    r3 = 2
                    r4 = 0
                    r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L22
                    r1.readException()     // Catch: java.lang.Throwable -> L22
                    java.lang.String r2 = r1.readString()     // Catch: java.lang.Throwable -> L22
                    r1.recycle()
                    r0.recycle()
                    return r2
                L22:
                    r2 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }
        }

        public static com.bytedance.embedapplog.az j(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.asus.msa.SupplementaryDID.IDidAidlInterface"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof com.bytedance.embedapplog.az
                if (r1 == 0) goto L13
                com.bytedance.embedapplog.az r0 = (com.bytedance.embedapplog.az) r0
                return r0
            L13:
                com.bytedance.embedapplog.az$j$j r0 = new com.bytedance.embedapplog.az$j$j
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.Binder
        public boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) {
                r3 = this;
                java.lang.String r0 = "com.asus.msa.SupplementaryDID.IDidAidlInterface"
                r1 = 1
                if (r4 == r1) goto L57
                r2 = 2
                if (r4 == r2) goto L49
                r2 = 3
                if (r4 == r2) goto L3b
                r2 = 4
                if (r4 == r2) goto L2d
                r2 = 5
                if (r4 == r2) goto L1f
                r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r4 == r2) goto L1b
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            L1b:
                r6.writeString(r0)
                return r1
            L1f:
                r5.enforceInterface(r0)
                java.lang.String r4 = r3.up()
                r6.writeNoException()
                r6.writeString(r4)
                return r1
            L2d:
                r5.enforceInterface(r0)
                java.lang.String r4 = r3.r()
                r6.writeNoException()
                r6.writeString(r4)
                return r1
            L3b:
                r5.enforceInterface(r0)
                java.lang.String r4 = r3.cw()
                r6.writeNoException()
                r6.writeString(r4)
                return r1
            L49:
                r5.enforceInterface(r0)
                java.lang.String r4 = r3.xt()
                r6.writeNoException()
                r6.writeString(r4)
                return r1
            L57:
                r5.enforceInterface(r0)
                boolean r4 = r3.j()
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
        }
    }

    java.lang.String cw();

    boolean j();

    java.lang.String r();

    java.lang.String up();

    java.lang.String xt();
}
