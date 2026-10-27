package com.snail.antifake.deviceid;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a {
    public static com.snail.antifake.deviceid.BatteryChangeReceiver a;

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(android.content.Context r0) {
            java.lang.String r0 = n2.a.a(r0)
            return r0
    }

    public static java.lang.String b() {
            java.lang.String r0 = "ro.product.board"
            java.lang.String r0 = com.snail.antifake.jni.PropertiesGet.a(r0)
            return r0
    }

    public static java.lang.String c() {
            java.lang.String r0 = "ro.bootloader"
            java.lang.String r0 = com.snail.antifake.jni.PropertiesGet.a(r0)
            return r0
    }

    public static java.lang.String d() {
            java.lang.String r0 = "ro.product.brand"
            java.lang.String r0 = com.snail.antifake.jni.PropertiesGet.a(r0)
            return r0
    }

    public static java.lang.String e() {
            java.lang.String r0 = "ro.product.cpu.abi"
            java.lang.String r0 = com.snail.antifake.jni.PropertiesGet.a(r0)
            return r0
    }

    public static int f() {
            com.snail.antifake.deviceid.BatteryChangeReceiver r0 = com.snail.antifake.deviceid.a.a
            if (r0 == 0) goto L9
            int r0 = r0.a()
            return r0
        L9:
            r0 = -1
            return r0
    }

    public static java.lang.String g() {
            java.lang.String r0 = "ro.product.device"
            java.lang.String r0 = com.snail.antifake.jni.PropertiesGet.a(r0)
            return r0
    }

    public static java.lang.String h(android.content.Context r0) {
            java.lang.String r0 = o2.a.a(r0)
            return r0
    }

    public static java.lang.String i() {
            java.lang.String r0 = "ro.hardware"
            java.lang.String r0 = com.snail.antifake.jni.PropertiesGet.a(r0)
            return r0
    }

    @android.annotation.SuppressLint({"MissingPermission"})
    public static java.lang.String j(android.content.Context r1) {
            java.lang.String r0 = "phone"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1
            java.lang.String r1 = r1.getSubscriberId()
            return r1
    }

    public static void k(com.snail.antifake.deviceid.d.c r1) {
            com.snail.antifake.deviceid.d r0 = new com.snail.antifake.deviceid.d
            r0.<init>()
            r0.e(r1)
            return
    }

    public static java.lang.String l(android.content.Context r0) {
            java.lang.String r0 = q2.b.b(r0)
            return r0
    }

    public static java.lang.String m() {
            java.lang.String r0 = "ro.product.manufacturer"
            java.lang.String r0 = com.snail.antifake.jni.PropertiesGet.a(r0)
            return r0
    }

    public static java.lang.String n() {
            java.lang.String r0 = "ro.product.model"
            java.lang.String r0 = com.snail.antifake.jni.PropertiesGet.a(r0)
            return r0
    }

    @android.annotation.SuppressLint({"MissingPermission"})
    public static java.lang.String o() {
            java.lang.String r0 = ""
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L1b
            r2 = 26
            if (r1 < r2) goto Ld
            java.lang.String r0 = com.bytedance.embedapplog.o.a()     // Catch: java.lang.Exception -> L1b
            return r0
        Ld:
            java.lang.String r1 = "ro.serialno"
            java.lang.String r0 = com.snail.antifake.jni.PropertiesGet.a(r1)     // Catch: java.lang.Exception -> L1b
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L1b
            if (r1 == 0) goto L1b
            java.lang.String r0 = android.os.Build.SERIAL     // Catch: java.lang.Exception -> L1b
        L1b:
            return r0
    }

    public static boolean p() {
            com.snail.antifake.deviceid.BatteryChangeReceiver r0 = com.snail.antifake.deviceid.a.a
            if (r0 == 0) goto Lc
            boolean r0 = r0.b()
            if (r0 != 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public static boolean q(android.content.Context r0) {
            boolean r0 = p2.a.n(r0)
            return r0
    }

    public static void r(android.content.Context r2) {
            com.snail.antifake.deviceid.BatteryChangeReceiver r0 = com.snail.antifake.deviceid.a.a
            if (r0 != 0) goto L1a
            com.snail.antifake.deviceid.BatteryChangeReceiver r0 = new com.snail.antifake.deviceid.BatteryChangeReceiver
            r0.<init>()
            com.snail.antifake.deviceid.a.a = r0
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>()
            java.lang.String r1 = "android.intent.action.BATTERY_CHANGED"
            r0.addAction(r1)
            com.snail.antifake.deviceid.BatteryChangeReceiver r1 = com.snail.antifake.deviceid.a.a
            r2.registerReceiver(r1, r0)
        L1a:
            return
    }

    public static void s(android.content.Context r1) {
            com.snail.antifake.deviceid.BatteryChangeReceiver r0 = com.snail.antifake.deviceid.a.a
            if (r0 != 0) goto La
            r1.unregisterReceiver(r0)
            r1 = 0
            com.snail.antifake.deviceid.a.a = r1
        La:
            return
    }
}
