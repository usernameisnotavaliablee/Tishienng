package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface av extends android.os.IInterface {

    public static abstract class j extends android.os.Binder implements com.bytedance.embedapplog.av {

        /* renamed from: com.bytedance.embedapplog.av$j$j, reason: collision with other inner class name */
        static class C0200j implements com.bytedance.embedapplog.av {
            private android.os.IBinder j;

            C0200j(android.os.IBinder r1) {
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

            @Override // com.bytedance.embedapplog.av
            public java.lang.String j(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.heytap.openid.IOpenID"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2b
                    r0.writeString(r4)     // Catch: java.lang.Throwable -> L2b
                    r0.writeString(r5)     // Catch: java.lang.Throwable -> L2b
                    r0.writeString(r6)     // Catch: java.lang.Throwable -> L2b
                    android.os.IBinder r4 = r3.j     // Catch: java.lang.Throwable -> L2b
                    r5 = 1
                    r6 = 0
                    r4.transact(r5, r0, r1, r6)     // Catch: java.lang.Throwable -> L2b
                    r1.readException()     // Catch: java.lang.Throwable -> L2b
                    java.lang.String r4 = r1.readString()     // Catch: java.lang.Throwable -> L2b
                    r1.recycle()
                    r0.recycle()
                    return r4
                L2b:
                    r4 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r4
            }
        }

        public static com.bytedance.embedapplog.av j(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.heytap.openid.IOpenID"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof com.bytedance.embedapplog.av
                if (r1 == 0) goto L13
                com.bytedance.embedapplog.av r0 = (com.bytedance.embedapplog.av) r0
                return r0
            L13:
                com.bytedance.embedapplog.av$j$j r0 = new com.bytedance.embedapplog.av$j$j
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.Binder
        public boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) {
                r3 = this;
                java.lang.String r0 = "com.heytap.openid.IOpenID"
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
                java.lang.String r7 = r5.readString()
                java.lang.String r5 = r5.readString()
                java.lang.String r4 = r3.j(r4, r7, r5)
                r6.writeNoException()
                r6.writeString(r4)
                return r1
        }
    }

    java.lang.String j(java.lang.String r1, java.lang.String r2, java.lang.String r3);
}
