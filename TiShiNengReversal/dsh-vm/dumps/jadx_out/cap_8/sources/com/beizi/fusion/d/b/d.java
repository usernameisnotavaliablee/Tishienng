package com.beizi.fusion.d.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface d extends android.os.IInterface {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class a extends android.os.Binder implements com.beizi.fusion.d.b.d {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.beizi.fusion.d.b.d$a$a, reason: collision with other inner class name */
        public static class C0128a implements com.beizi.fusion.d.b.d {
            public android.os.IBinder a;

            public C0128a(android.os.IBinder r1) {
                    r0 = this;
                    r0.<init>()
                    r0.a = r1
                    return
            }

            public java.lang.String a(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.heytap.openid.IOpenID"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L33
                    r0.writeString(r4)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L33
                    r0.writeString(r5)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L33
                    r0.writeString(r6)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L33
                    android.os.IBinder r4 = r3.a     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L33
                    r5 = 1
                    r6 = 0
                    r4.transact(r5, r0, r1, r6)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L33
                    r1.readException()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L33
                    java.lang.String r4 = r1.readString()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L33
                    r0.recycle()
                    r1.recycle()
                    return r4
                L2b:
                    r4 = move-exception
                    r0.recycle()
                    r1.recycle()
                    throw r4
                L33:
                    r0.recycle()
                    r1.recycle()
                    r4 = 0
                    return r4
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                    r1 = this;
                    android.os.IBinder r0 = r1.a
                    return r0
            }
        }

        public static com.beizi.fusion.d.b.d a(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.heytap.openid.IOpenID"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L14
                boolean r1 = r0 instanceof com.beizi.fusion.d.b.d
                if (r1 != 0) goto L11
                goto L14
            L11:
                com.beizi.fusion.d.b.d r0 = (com.beizi.fusion.d.b.d) r0
                return r0
            L14:
                com.beizi.fusion.d.b.d$a$a r0 = new com.beizi.fusion.d.b.d$a$a
                r0.<init>(r2)
                return r0
        }
    }
}
