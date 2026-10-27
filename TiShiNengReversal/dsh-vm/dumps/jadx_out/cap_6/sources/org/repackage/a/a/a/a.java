package org.repackage.a.a.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface a extends android.os.IInterface {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: org.repackage.a.a.a.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0086a extends android.os.Binder implements org.repackage.a.a.a.a {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: org.repackage.a.a.a.a$a$a, reason: collision with other inner class name */
        private static class C0087a implements org.repackage.a.a.a.a {
            public android.os.IBinder a;

            public C0087a(android.os.IBinder r1) {
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
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2b
                    r0.writeString(r4)     // Catch: java.lang.Throwable -> L2b
                    r0.writeString(r5)     // Catch: java.lang.Throwable -> L2b
                    r0.writeString(r6)     // Catch: java.lang.Throwable -> L2b
                    android.os.IBinder r4 = r3.a     // Catch: java.lang.Throwable -> L2b
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

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                    r1 = this;
                    android.os.IBinder r0 = r1.a
                    return r0
            }
        }

        public static org.repackage.a.a.a.a a(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.heytap.openid.IOpenID"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof org.repackage.a.a.a.a
                if (r1 == 0) goto L13
                org.repackage.a.a.a.a r0 = (org.repackage.a.a.a.a) r0
                return r0
            L13:
                org.repackage.a.a.a.a$a$a r0 = new org.repackage.a.a.a.a$a$a
                r0.<init>(r2)
                return r0
        }
    }
}
