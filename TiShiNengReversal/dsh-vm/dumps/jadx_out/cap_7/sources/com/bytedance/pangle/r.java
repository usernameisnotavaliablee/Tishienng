package com.bytedance.pangle;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public interface r extends android.os.IInterface {

    public static abstract class j extends android.os.Binder implements com.bytedance.pangle.r {

        /* renamed from: com.bytedance.pangle.r$j$j, reason: collision with other inner class name */
        private static class C0009j implements com.bytedance.pangle.r {
            public static com.bytedance.pangle.r j;
            private android.os.IBinder xt;

            C0009j(android.os.IBinder r1) {
                    r0 = this;
                    r0.<init>()
                    r0.xt = r1
                    return
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                    r1 = this;
                    android.os.IBinder r0 = r1.xt
                    return r0
            }

            @Override // com.bytedance.pangle.r
            public void j(java.lang.String r6, int r7, java.lang.String r8) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.bytedance.pangle.IPluginInstallListener"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L34
                    r0.writeString(r6)     // Catch: java.lang.Throwable -> L34
                    r0.writeInt(r7)     // Catch: java.lang.Throwable -> L34
                    r0.writeString(r8)     // Catch: java.lang.Throwable -> L34
                    android.os.IBinder r2 = r5.xt     // Catch: java.lang.Throwable -> L34
                    r3 = 1
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L34
                    if (r2 != 0) goto L36
                    com.bytedance.pangle.r r2 = com.bytedance.pangle.r.j.j()     // Catch: java.lang.Throwable -> L34
                    if (r2 == 0) goto L36
                    com.bytedance.pangle.r r2 = com.bytedance.pangle.r.j.j()     // Catch: java.lang.Throwable -> L34
                    r2.j(r6, r7, r8)     // Catch: java.lang.Throwable -> L34
                L2d:
                    r1.recycle()
                    r0.recycle()
                    return
                L34:
                    r6 = move-exception
                    goto L3a
                L36:
                    r1.readException()     // Catch: java.lang.Throwable -> L34
                    goto L2d
                L3a:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }
        }

        public j() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "com.bytedance.pangle.IPluginInstallListener"
                r1.attachInterface(r1, r0)
                return
        }

        public static com.bytedance.pangle.r j() {
                com.bytedance.pangle.r r0 = com.bytedance.pangle.r.j.C0009j.j
                return r0
        }

        public static com.bytedance.pangle.r j(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.bytedance.pangle.IPluginInstallListener"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof com.bytedance.pangle.r
                if (r1 == 0) goto L13
                com.bytedance.pangle.r r0 = (com.bytedance.pangle.r) r0
                return r0
            L13:
                com.bytedance.pangle.r$j$j r0 = new com.bytedance.pangle.r$j$j
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
                java.lang.String r0 = "com.bytedance.pangle.IPluginInstallListener"
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
                java.lang.String r4 = r5.readString()
                int r7 = r5.readInt()
                java.lang.String r5 = r5.readString()
                r3.j(r4, r7, r5)
                r6.writeNoException()
                return r1
        }
    }

    void j(java.lang.String r1, int r2, java.lang.String r3) throws android.os.RemoteException;
}
