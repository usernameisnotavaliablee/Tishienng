package org.repackage.com.zui.opendeviceidlibrary;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class OpenDeviceId {
    private static java.lang.String c = "OpenDeviceId library";
    private static boolean d;
    private android.content.Context a;
    private org.repackage.com.zui.deviceidservice.IDeviceidInterface b;
    private android.content.ServiceConnection e;
    private org.repackage.com.zui.opendeviceidlibrary.OpenDeviceId.CallBack f;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface CallBack<T> {
        void a(T r1, org.repackage.com.zui.opendeviceidlibrary.OpenDeviceId r2);
    }

    static {
            return
    }

    public OpenDeviceId() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            r1.f = r0
            return
    }

    static /* synthetic */ org.repackage.com.zui.deviceidservice.IDeviceidInterface a(org.repackage.com.zui.opendeviceidlibrary.OpenDeviceId r0, org.repackage.com.zui.deviceidservice.IDeviceidInterface r1) {
            r0.b = r1
            return r1
    }

    static /* synthetic */ org.repackage.com.zui.opendeviceidlibrary.OpenDeviceId.CallBack a(org.repackage.com.zui.opendeviceidlibrary.OpenDeviceId r0) {
            org.repackage.com.zui.opendeviceidlibrary.OpenDeviceId$CallBack r0 = r0.f
            return r0
    }

    private void a(java.lang.String r1) {
            r0 = this;
            return
    }

    static /* synthetic */ void a(org.repackage.com.zui.opendeviceidlibrary.OpenDeviceId r0, java.lang.String r1) {
            r0.a(r1)
            return
    }

    private void b(java.lang.String r1) {
            r0 = this;
            return
    }

    public int a(android.content.Context r3, org.repackage.com.zui.opendeviceidlibrary.OpenDeviceId.CallBack<java.lang.String> r4) {
            r2 = this;
            if (r3 == 0) goto L31
            r2.a = r3
            r2.f = r4
            org.repackage.com.zui.opendeviceidlibrary.OpenDeviceId$1 r3 = new org.repackage.com.zui.opendeviceidlibrary.OpenDeviceId$1
            r3.<init>(r2)
            r2.e = r3
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r4 = "org.repackage.com.zui.deviceidservice"
            java.lang.String r0 = "org.repackage.com.zui.deviceidservice.DeviceidService"
            r3.setClassName(r4, r0)
            android.content.Context r4 = r2.a
            android.content.ServiceConnection r0 = r2.e
            r1 = 1
            boolean r3 = r4.bindService(r3, r0, r1)
            if (r3 == 0) goto L2a
            java.lang.String r3 = "bindService Successful!"
            r2.a(r3)
            return r1
        L2a:
            java.lang.String r3 = "bindService Failed!"
            r2.a(r3)
            r3 = -1
            return r3
        L31:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "Context can not be null."
            r3.<init>(r4)
            throw r3
    }

    public java.lang.String a() {
            r2 = this;
            android.content.Context r0 = r2.a
            if (r0 == 0) goto L14
            org.repackage.com.zui.deviceidservice.IDeviceidInterface r0 = r2.b     // Catch: android.os.RemoteException -> Ld
            if (r0 == 0) goto L12
            java.lang.String r0 = r0.a()     // Catch: android.os.RemoteException -> Ld
            return r0
        Ld:
            java.lang.String r0 = "getOAID error, RemoteException!"
            r2.b(r0)
        L12:
            r0 = 0
            return r0
        L14:
            java.lang.String r0 = "Context is null."
            r2.b(r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Context is null, must be new OpenDeviceId first"
            r0.<init>(r1)
            throw r0
    }

    public void a(boolean r1) {
            r0 = this;
            org.repackage.com.zui.opendeviceidlibrary.OpenDeviceId.d = r1
            return
    }

    public java.lang.String b() {
            r2 = this;
            android.content.Context r0 = r2.a
            if (r0 == 0) goto L1a
            org.repackage.com.zui.deviceidservice.IDeviceidInterface r0 = r2.b     // Catch: java.lang.Exception -> Ld android.os.RemoteException -> L13
            if (r0 == 0) goto L18
            java.lang.String r0 = r0.b()     // Catch: java.lang.Exception -> Ld android.os.RemoteException -> L13
            return r0
        Ld:
            java.lang.String r0 = "getUDID error, Exception!"
            r2.b(r0)
            goto L18
        L13:
            java.lang.String r0 = "getUDID error, RemoteException!"
            r2.b(r0)
        L18:
            r0 = 0
            return r0
        L1a:
            java.lang.String r0 = "Context is null."
            r2.b(r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Context is null, must be new OpenDeviceId first"
            r0.<init>(r1)
            throw r0
    }

    public boolean c() {
            r2 = this;
            r0 = 0
            org.repackage.com.zui.deviceidservice.IDeviceidInterface r1 = r2.b     // Catch: android.os.RemoteException -> L11
            if (r1 == 0) goto L10
            java.lang.String r1 = "Device support opendeviceid"
            r2.a(r1)     // Catch: android.os.RemoteException -> L11
            org.repackage.com.zui.deviceidservice.IDeviceidInterface r1 = r2.b     // Catch: android.os.RemoteException -> L11
            boolean r0 = r1.c()     // Catch: android.os.RemoteException -> L11
        L10:
            return r0
        L11:
            java.lang.String r1 = "isSupport error, RemoteException!"
            r2.b(r1)
            return r0
    }

    public java.lang.String d() {
            r3 = this;
            android.content.Context r0 = r3.a
            if (r0 == 0) goto L3c
            java.lang.String r0 = r0.getPackageName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "liufeng, getVAID package："
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r3.a(r1)
            if (r0 == 0) goto L35
            java.lang.String r1 = ""
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L35
            org.repackage.com.zui.deviceidservice.IDeviceidInterface r1 = r3.b     // Catch: android.os.RemoteException -> L2f
            if (r1 == 0) goto L3a
            java.lang.String r0 = r1.a(r0)     // Catch: android.os.RemoteException -> L2f
            return r0
        L2f:
            java.lang.String r0 = "getVAID error, RemoteException!"
            r3.b(r0)
            goto L3a
        L35:
            java.lang.String r0 = "input package is null!"
            r3.a(r0)
        L3a:
            r0 = 0
            return r0
        L3c:
            java.lang.String r0 = "Context is null."
            r3.a(r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Context is null, must be new OpenDeviceId first"
            r0.<init>(r1)
            throw r0
    }

    public java.lang.String e() {
            r4 = this;
            android.content.Context r0 = r4.a
            if (r0 == 0) goto L53
            java.lang.String r0 = r0.getPackageName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "liufeng, getAAID package："
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r4.a(r1)
            r1 = 0
            if (r0 == 0) goto L4d
            java.lang.String r2 = ""
            boolean r3 = r0.equals(r2)
            if (r3 != 0) goto L4d
            org.repackage.com.zui.deviceidservice.IDeviceidInterface r3 = r4.b     // Catch: android.os.RemoteException -> L47
            if (r3 == 0) goto L46
            java.lang.String r1 = r3.b(r0)     // Catch: android.os.RemoteException -> L47
            if (r1 == 0) goto L37
            boolean r2 = r2.equals(r1)     // Catch: android.os.RemoteException -> L47
            if (r2 == 0) goto L46
        L37:
            org.repackage.com.zui.deviceidservice.IDeviceidInterface r2 = r4.b     // Catch: android.os.RemoteException -> L47
            boolean r2 = r2.c(r0)     // Catch: android.os.RemoteException -> L47
            if (r2 == 0) goto L46
            org.repackage.com.zui.deviceidservice.IDeviceidInterface r2 = r4.b     // Catch: android.os.RemoteException -> L47
            java.lang.String r0 = r2.b(r0)     // Catch: android.os.RemoteException -> L47
            return r0
        L46:
            return r1
        L47:
            java.lang.String r0 = "getAAID error, RemoteException!"
            r4.b(r0)
            return r1
        L4d:
            java.lang.String r0 = "input package is null!"
            r4.a(r0)
            return r1
        L53:
            java.lang.String r0 = "Context is null."
            r4.a(r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Context is null, must be new OpenDeviceId first"
            r0.<init>(r1)
            throw r0
    }

    public void f() {
            r2 = this;
            android.content.Context r0 = r2.a     // Catch: java.lang.IllegalArgumentException -> Ld
            android.content.ServiceConnection r1 = r2.e     // Catch: java.lang.IllegalArgumentException -> Ld
            r0.unbindService(r1)     // Catch: java.lang.IllegalArgumentException -> Ld
            java.lang.String r0 = "unBind Service successful"
            r2.a(r0)     // Catch: java.lang.IllegalArgumentException -> Ld
            goto L12
        Ld:
            java.lang.String r0 = "unBind Service exception"
            r2.b(r0)
        L12:
            r0 = 0
            r2.b = r0
            return
    }
}
