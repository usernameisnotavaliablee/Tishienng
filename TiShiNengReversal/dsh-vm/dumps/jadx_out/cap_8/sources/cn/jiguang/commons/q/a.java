package cn.jiguang.commons.q;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a implements android.os.IInterface {
    private android.os.IBinder a;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f1183c;

    public a(android.os.IBinder r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            java.lang.String r1 = "NZZdxIY39aBpJdeuRJ0VLp5xPlLZJqfiSSPak26ACVv4Y6EB33Z8c96zLnz4UMIR2tR6ldXn18NaPke3N1cdFQ=="
            java.lang.String r1 = cn.jiguang.commons.L.ad.d(r1)
            r0.f1183c = r1
            return
    }

    public java.lang.String a(android.content.Context r7) {
            r6 = this;
            java.lang.String r0 = ""
            if (r7 != 0) goto L5
            return r0
        L5:
            android.os.Parcel r7 = android.os.Parcel.obtain()
            android.os.Parcel r1 = android.os.Parcel.obtain()
            java.lang.String r2 = r6.f1183c     // Catch: java.lang.Throwable -> L21
            r7.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L21
            android.os.IBinder r2 = r6.a     // Catch: java.lang.Throwable -> L21
            r3 = 1
            r4 = 0
            r2.transact(r3, r7, r1, r4)     // Catch: java.lang.Throwable -> L21
            r1.readException()     // Catch: java.lang.Throwable -> L21
            java.lang.String r0 = r1.readString()     // Catch: java.lang.Throwable -> L21
            goto L3c
        L21:
            r2 = move-exception
            java.lang.String r3 = "SumsungAdvertisingInterface"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43
            r4.<init>()     // Catch: java.lang.Throwable -> L43
            java.lang.String r5 = "get Ids-o error: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L43
            r4.append(r2)     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L43
            cn.jiguang.commons.w.a.f(r3, r2)     // Catch: java.lang.Throwable -> L43
        L3c:
            r1.recycle()
            r7.recycle()
            return r0
        L43:
            r0 = move-exception
            r1.recycle()
            r7.recycle()
            throw r0
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
            r1 = this;
            r0 = 0
            return r0
    }
}
