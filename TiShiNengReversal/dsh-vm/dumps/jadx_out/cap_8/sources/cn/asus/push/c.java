package cn.asus.push;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
final class c implements cn.asus.push.IAIDLCallback {

    /* renamed from: b, reason: collision with root package name */
    public static cn.asus.push.IAIDLCallback f11b;
    private android.os.IBinder a;

    c(android.os.IBinder r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
            r1 = this;
            android.os.IBinder r0 = r1.a
            return r0
    }

    @Override // cn.asus.push.IAIDLCallback
    public final void call(cn.asus.push.DataBuffer r5) {
            r4 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            java.lang.String r1 = "cn.asus.push.IAIDLCallback"
            r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L14
            r1 = 0
            r2 = 1
            if (r5 == 0) goto L16
            r0.writeInt(r2)     // Catch: java.lang.Throwable -> L14
            r5.writeToParcel(r0, r1)     // Catch: java.lang.Throwable -> L14
            goto L19
        L14:
            r5 = move-exception
            goto L37
        L16:
            r0.writeInt(r1)     // Catch: java.lang.Throwable -> L14
        L19:
            android.os.IBinder r1 = r4.a     // Catch: java.lang.Throwable -> L14
            r3 = 0
            boolean r1 = r1.transact(r2, r0, r3, r2)     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L33
            cn.asus.push.IAIDLCallback r1 = cn.asus.push.IAIDLCallback.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L33
            cn.asus.push.IAIDLCallback r1 = cn.asus.push.IAIDLCallback.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L14
            r1.call(r5)     // Catch: java.lang.Throwable -> L14
            r0.recycle()
            return
        L33:
            r0.recycle()
            return
        L37:
            r0.recycle()
            throw r5
    }
}
