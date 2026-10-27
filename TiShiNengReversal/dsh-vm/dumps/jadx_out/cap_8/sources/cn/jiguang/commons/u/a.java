package cn.jiguang.commons.u;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a implements android.os.IInterface {
    private android.os.IBinder a;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f1199c;

    public a(android.os.IBinder r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            java.lang.String r1 = "Mpy0fkBSw1N+kug2cBPj2Z07jpK2SYpu9oSV4B2lEuO7ZdtoaGwNjuH9BjHR80mN"
            java.lang.String r1 = cn.jiguang.commons.L.ad.d(r1)
            r0.f1199c = r1
            return
    }

    public java.lang.String a() {
            r6 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            android.os.Parcel r1 = android.os.Parcel.obtain()
            java.lang.String r2 = r6.f1199c     // Catch: java.lang.Throwable -> L22
            r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L22
            android.os.IBinder r2 = r6.a     // Catch: java.lang.Throwable -> L22
            r3 = 1
            r4 = 0
            r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L22
            r1.readException()     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = r1.readString()     // Catch: java.lang.Throwable -> L22
            r1.recycle()
            r0.recycle()
            return r2
        L22:
            r2 = move-exception
            java.lang.String r3 = "ZuiAdvertisingInterface"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46
            r4.<init>()     // Catch: java.lang.Throwable -> L46
            java.lang.String r5 = "get Ids-o error: "
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
            r0 = 0
            return r0
    }
}
