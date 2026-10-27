package cn.asus.push;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
final class d implements cn.asus.push.IAIDLInvoke {

    /* renamed from: b, reason: collision with root package name */
    public static cn.asus.push.IAIDLInvoke f12b;
    private android.os.IBinder a;

    d(android.os.IBinder r1) {
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

    @Override // cn.asus.push.IAIDLInvoke
    public final void c(cn.asus.push.DataBuffer r6) {
            r5 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            android.os.Parcel r1 = android.os.Parcel.obtain()
            java.lang.String r2 = "cn.asus.push.IAIDLInvoke"
            r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L18
            r2 = 1
            r3 = 0
            if (r6 == 0) goto L1a
            r0.writeInt(r2)     // Catch: java.lang.Throwable -> L18
            r6.writeToParcel(r0, r3)     // Catch: java.lang.Throwable -> L18
            goto L1d
        L18:
            r6 = move-exception
            goto L3d
        L1a:
            r0.writeInt(r3)     // Catch: java.lang.Throwable -> L18
        L1d:
            android.os.IBinder r4 = r5.a     // Catch: java.lang.Throwable -> L18
            boolean r2 = r4.transact(r2, r0, r1, r3)     // Catch: java.lang.Throwable -> L18
            if (r2 != 0) goto L39
            cn.asus.push.IAIDLInvoke r2 = cn.asus.push.IAIDLInvoke.Stub.f()     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L39
            cn.asus.push.IAIDLInvoke r2 = cn.asus.push.IAIDLInvoke.Stub.f()     // Catch: java.lang.Throwable -> L18
            r2.c(r6)     // Catch: java.lang.Throwable -> L18
        L32:
            r1.recycle()
            r0.recycle()
            return
        L39:
            r1.readException()     // Catch: java.lang.Throwable -> L18
            goto L32
        L3d:
            r1.recycle()
            r0.recycle()
            throw r6
    }

    @Override // cn.asus.push.IAIDLInvoke
    public final void d(cn.asus.push.DataBuffer r6, cn.asus.push.IAIDLCallback r7) {
            r5 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            java.lang.String r1 = "cn.asus.push.IAIDLInvoke"
            r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L14
            r1 = 0
            r2 = 1
            if (r6 == 0) goto L16
            r0.writeInt(r2)     // Catch: java.lang.Throwable -> L14
            r6.writeToParcel(r0, r1)     // Catch: java.lang.Throwable -> L14
            goto L19
        L14:
            r6 = move-exception
            goto L43
        L16:
            r0.writeInt(r1)     // Catch: java.lang.Throwable -> L14
        L19:
            r1 = 0
            if (r7 == 0) goto L21
            android.os.IBinder r3 = r7.asBinder()     // Catch: java.lang.Throwable -> L14
            goto L22
        L21:
            r3 = r1
        L22:
            r0.writeStrongBinder(r3)     // Catch: java.lang.Throwable -> L14
            android.os.IBinder r3 = r5.a     // Catch: java.lang.Throwable -> L14
            r4 = 2
            boolean r1 = r3.transact(r4, r0, r1, r2)     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L3f
            cn.asus.push.IAIDLInvoke r1 = cn.asus.push.IAIDLInvoke.Stub.f()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L3f
            cn.asus.push.IAIDLInvoke r1 = cn.asus.push.IAIDLInvoke.Stub.f()     // Catch: java.lang.Throwable -> L14
            r1.d(r6, r7)     // Catch: java.lang.Throwable -> L14
            r0.recycle()
            return
        L3f:
            r0.recycle()
            return
        L43:
            r0.recycle()
            throw r6
    }
}
