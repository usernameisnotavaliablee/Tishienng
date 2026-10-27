package cn.jiguang.ai;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class d {
    private static final android.util.SparseArray<java.lang.String> a = null;

    static {
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            cn.jiguang.ai.d.a = r0
            r1 = 0
            java.lang.String r2 = "OK"
            r0.put(r1, r2)
            r1 = -1001(0xfffffffffffffc17, float:NaN)
            java.lang.String r2 = "Exceed buffer size. Please contact support."
            r0.put(r1, r2)
            r1 = -1000(0xfffffffffffffc18, float:NaN)
            java.lang.String r2 = "Connection failed. Please check your connection and retry later!"
            r0.put(r1, r2)
            r1 = -998(0xfffffffffffffc1a, float:NaN)
            java.lang.String r2 = "Sending failed or timeout. Please Retry later!"
            r0.put(r1, r2)
            r1 = -997(0xfffffffffffffc1b, float:NaN)
            java.lang.String r2 = "Receiving failed or timeout. Please Retry later!"
            r0.put(r1, r2)
            r1 = -996(0xfffffffffffffc1c, float:NaN)
            java.lang.String r2 = "Connection is closed. Please Retry later!"
            r0.put(r1, r2)
            r1 = -994(0xfffffffffffffc1e, float:NaN)
            java.lang.String r2 = "Response timeout. Please Retry later!"
            r0.put(r1, r2)
            r1 = -993(0xfffffffffffffc1f, float:NaN)
            java.lang.String r2 = "Invalid socket. Please Retry later!"
            r0.put(r1, r2)
            r1 = 11
            java.lang.String r2 = "Failed to register!"
            r0.put(r1, r2)
            r1 = 1005(0x3ed, float:1.408E-42)
            java.lang.String r2 = "Your appKey and android package name are not matched. Please double check them according to Application you created on Portal."
            r0.put(r1, r2)
            r1 = 1006(0x3ee, float:1.41E-42)
            java.lang.String r2 = "You android package name is not exist, Please register your pacakge name in Portal."
            r0.put(r1, r2)
            r1 = 1007(0x3ef, float:1.411E-42)
            java.lang.String r2 = "Invalid Imei, Register again."
            r0.put(r1, r2)
            r1 = 1008(0x3f0, float:1.413E-42)
            java.lang.String r2 = "Invalid appKey, Please get your Appkey from JIGUANG web console!"
            r0.put(r1, r2)
            r1 = 1009(0x3f1, float:1.414E-42)
            java.lang.String r2 = "Your appKey is related to a non-Android App.Please use your Android App's appKey, or add an Android app for this appKey."
            r0.put(r1, r2)
            r1 = 10000(0x2710, float:1.4013E-41)
            java.lang.String r2 = "Receiver data parse error"
            r0.put(r1, r2)
            r1 = 102(0x66, float:1.43E-43)
            java.lang.String r2 = "102 - Incorrect password"
            r0.put(r1, r2)
            r1 = 108(0x6c, float:1.51E-43)
            java.lang.String r2 = "108 - Incorrect uid"
            r0.put(r1, r2)
            r1 = 1012(0x3f4, float:1.418E-42)
            java.lang.String r2 = "Server reject this connection, will clear cache and restart connect."
            r0.put(r1, r2)
            r1 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r2 = "Context is null"
            r0.put(r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "The permission should be defined - "
            r1.append(r2)
            java.lang.String r2 = cn.jiguang.a.a.a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 1001(0x3e9, float:1.403E-42)
            r0.put(r2, r1)
            r1 = 1002(0x3ea, float:1.404E-42)
            java.lang.String r2 = "The permissoin is required - android.permission.INTERNET and android.permission.ACCESS_NETWORK_STATE"
            r0.put(r1, r2)
            r1 = 10001(0x2711, float:1.4014E-41)
            java.lang.String r2 = "JCore appKey - not defined in manifest"
            r0.put(r1, r2)
            r1 = 10002(0x2712, float:1.4016E-41)
            java.lang.String r2 = "Appkey not same with meta appkey"
            r0.put(r1, r2)
            r1 = 10003(0x2713, float:1.4017E-41)
            java.lang.String r2 = "Appkey is empty"
            r0.put(r1, r2)
            return
    }

    public d() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(int r2) {
            android.util.SparseArray<java.lang.String> r0 = cn.jiguang.ai.d.a
            java.lang.Object r1 = r0.get(r2)
            if (r1 != 0) goto L20
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown error code - "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "StatusCode"
            cn.jiguang.w.f.c(r0, r2)
            r2 = 0
            return r2
        L20:
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }
}
