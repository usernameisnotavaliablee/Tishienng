package cn.jiguang.commons.k;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c implements android.os.IInterface {
    private android.os.IBinder a;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f1162c;

    public c(android.os.IBinder r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.f1162c = r0
            r1.a = r2
            java.lang.String r2 = "8lAhWp7NB89J3VIJU4lIGfGqvEuhZG7tBjI4IuOrU/y3j/vpb/c+G/Rylr/l3ZwQ"
            java.lang.String r2 = cn.jiguang.commons.L.ad.d(r2)
            r1.f1162c = r2
            return
    }

    public java.lang.String a() {
            r6 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            android.os.Parcel r1 = android.os.Parcel.obtain()
            java.lang.String r2 = r6.f1162c     // Catch: java.lang.Throwable -> L22
            r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L22
            android.os.IBinder r2 = r6.a     // Catch: java.lang.Throwable -> L22
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
            java.lang.String r3 = "AsusAdvertisingInterface"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46
            r4.<init>()     // Catch: java.lang.Throwable -> L46
            java.lang.String r5 = "get ids-o e: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L46
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L46
            r4.append(r2)     // Catch: java.lang.Throwable -> L46
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L46
            cn.jiguang.commons.w.a.f(r3, r2)     // Catch: java.lang.Throwable -> L46
            r1.recycle()
            r0.recycle()
            java.lang.String r0 = ""
            return r0
        L46:
            r2 = move-exception
            r1.recycle()
            r0.recycle()
            throw r2
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
            r1 = this;
            android.os.IBinder r0 = r1.a
            return r0
    }
}
