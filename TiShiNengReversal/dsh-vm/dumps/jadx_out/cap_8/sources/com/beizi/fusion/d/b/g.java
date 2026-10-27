package com.beizi.fusion.d.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface g extends android.os.IInterface {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class a extends android.os.Binder implements com.beizi.fusion.d.b.g {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.beizi.fusion.d.b.g$a$a, reason: collision with other inner class name */
        public static class C0130a implements com.beizi.fusion.d.b.g {
            private android.os.IBinder a;

            public C0130a(android.os.IBinder r1) {
                    r0 = this;
                    r0.<init>()
                    r0.a = r1
                    return
            }

            @Override // com.beizi.fusion.d.b.g
            public java.lang.String a() {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.bun.lib.MsaIdInterface"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L1c
                    android.os.IBinder r2 = r5.a     // Catch: java.lang.Throwable -> L1c
                    r3 = 3
                    r4 = 0
                    r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L1c
                    r1.readException()     // Catch: java.lang.Throwable -> L1c
                    java.lang.String r2 = r1.readString()     // Catch: java.lang.Throwable -> L1c
                    goto L23
                L1c:
                    r1.recycle()
                    r0.recycle()
                    r2 = 0
                L23:
                    r1.recycle()
                    r0.recycle()
                    return r2
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                    r1 = this;
                    android.os.IBinder r0 = r1.a
                    return r0
            }
        }
    }

    java.lang.String a();
}
