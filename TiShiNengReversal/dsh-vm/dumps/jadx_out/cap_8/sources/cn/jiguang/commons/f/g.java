package cn.jiguang.commons.f;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class g {
    public static final android.util.SparseArray a = null;

    /* renamed from: c, reason: collision with root package name */
    private static final android.util.SparseArray f1107c = null;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f1108d = null;

    /* renamed from: e, reason: collision with root package name */
    private static java.util.Set f1109e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f1110f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.List f1111g = null;

    static {
            android.util.SparseArray r0 = d()
            cn.jiguang.commons.f.g.a = r0
            android.util.SparseArray r0 = a()
            cn.jiguang.commons.f.g.f1107c = r0
            java.util.Map r0 = f()
            cn.jiguang.commons.f.g.f1108d = r0
            java.util.Map r0 = g()
            cn.jiguang.commons.f.g.f1110f = r0
            java.util.List r0 = e()
            cn.jiguang.commons.f.g.f1111g = r0
            java.util.Set r0 = h()
            cn.jiguang.commons.f.g.f1109e = r0
            return
    }

    public g() {
            r1 = this;
            r1.<init>()
            return
    }

    private static android.util.SparseArray a() {
            android.util.SparseArray r0 = new android.util.SparseArray
            r1 = 4
            r0.<init>(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 30
            r2.<init>(r3)
            r4 = 1
            r0.put(r4, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 5
            r2.<init>(r4)
            r4 = 2
            r0.put(r4, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 25
            r2.<init>(r4)
            r4 = 3
            r0.put(r4, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r3)
            r0.put(r1, r2)
            r1 = 0
        L2f:
            android.util.SparseArray r2 = cn.jiguang.commons.f.g.a
            int r3 = r2.size()
            if (r1 >= r3) goto L55
            int r3 = r2.keyAt(r1)
            java.lang.Object r2 = r2.valueAt(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Object r2 = r0.get(r2)
            java.util.List r2 = (java.util.List) r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.add(r3)
            int r1 = r1 + 1
            goto L2f
        L55:
            return r0
    }

    public static java.util.List a(int r1) {
            android.util.SparseArray r0 = cn.jiguang.commons.f.g.f1107c
            java.lang.Object r1 = r0.get(r1)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto Lb
            return r1
        Lb:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            return r1
    }

    public static int c() {
            android.util.SparseArray r0 = cn.jiguang.commons.f.g.a
            int r0 = r0.size()
            return r0
    }

    public static int c(int r2) {
            android.util.SparseArray r0 = cn.jiguang.commons.f.g.a
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r0.get(r2, r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            return r2
    }

    private static android.util.SparseArray d() {
            android.util.SparseArray r0 = new android.util.SparseArray
            r1 = 80
            r0.<init>(r1)
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1001(0x3e9, float:1.403E-42)
            r0.put(r2, r1)
            r2 = 1011(0x3f3, float:1.417E-42)
            r0.put(r2, r1)
            r2 = 1013(0x3f5, float:1.42E-42)
            r0.put(r2, r1)
            r2 = 1015(0x3f7, float:1.422E-42)
            r0.put(r2, r1)
            r2 = 1002(0x3ea, float:1.404E-42)
            r0.put(r2, r1)
            r2 = 1014(0x3f6, float:1.421E-42)
            r0.put(r2, r1)
            r2 = 1007(0x3ef, float:1.411E-42)
            r0.put(r2, r1)
            r2 = 2001(0x7d1, float:2.804E-42)
            r0.put(r2, r1)
            r2 = 1017(0x3f9, float:1.425E-42)
            r0.put(r2, r1)
            r2 = 1026(0x402, float:1.438E-42)
            r0.put(r2, r1)
            r2 = 1020(0x3fc, float:1.43E-42)
            r0.put(r2, r1)
            r2 = 1036(0x40c, float:1.452E-42)
            r0.put(r2, r1)
            r2 = 1009(0x3f1, float:1.414E-42)
            r0.put(r2, r1)
            r2 = 1019(0x3fb, float:1.428E-42)
            r0.put(r2, r1)
            r2 = 1900(0x76c, float:2.662E-42)
            r0.put(r2, r1)
            r2 = 1901(0x76d, float:2.664E-42)
            r0.put(r2, r1)
            r2 = 1030(0x406, float:1.443E-42)
            r0.put(r2, r1)
            r2 = 1031(0x407, float:1.445E-42)
            r0.put(r2, r1)
            r2 = 1032(0x408, float:1.446E-42)
            r0.put(r2, r1)
            r2 = 1029(0x405, float:1.442E-42)
            r0.put(r2, r1)
            r2 = 2500(0x9c4, float:3.503E-42)
            r0.put(r2, r1)
            r2 = 1027(0x403, float:1.439E-42)
            r0.put(r2, r1)
            r2 = 2004(0x7d4, float:2.808E-42)
            r0.put(r2, r1)
            r2 = 2005(0x7d5, float:2.81E-42)
            r0.put(r2, r1)
            r2 = 1012(0x3f4, float:1.418E-42)
            r0.put(r2, r1)
            r2 = 1022(0x3fe, float:1.432E-42)
            r0.put(r2, r1)
            r2 = 1005(0x3ed, float:1.408E-42)
            r0.put(r2, r1)
            r2 = 1040(0x410, float:1.457E-42)
            r0.put(r2, r1)
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1100(0x44c, float:1.541E-42)
            r0.put(r2, r1)
            r2 = 1110(0x456, float:1.555E-42)
            r0.put(r2, r1)
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1010(0x3f2, float:1.415E-42)
            r0.put(r2, r1)
            r2 = 1605(0x645, float:2.249E-42)
            r0.put(r2, r1)
            r2 = 1608(0x648, float:2.253E-42)
            r0.put(r2, r1)
            r2 = 1601(0x641, float:2.243E-42)
            r0.put(r2, r1)
            r2 = 1610(0x64a, float:2.256E-42)
            r0.put(r2, r1)
            r2 = 1508(0x5e4, float:2.113E-42)
            r0.put(r2, r1)
            r2 = 1611(0x64b, float:2.257E-42)
            r0.put(r2, r1)
            r2 = 1602(0x642, float:2.245E-42)
            r0.put(r2, r1)
            r2 = 1604(0x644, float:2.248E-42)
            r0.put(r2, r1)
            r2 = 1603(0x643, float:2.246E-42)
            r0.put(r2, r1)
            r2 = 1606(0x646, float:2.25E-42)
            r0.put(r2, r1)
            r2 = 1609(0x649, float:2.255E-42)
            r0.put(r2, r1)
            r2 = 1607(0x647, float:2.252E-42)
            r0.put(r2, r1)
            r2 = 1800(0x708, float:2.522E-42)
            r0.put(r2, r1)
            r2 = 1503(0x5df, float:2.106E-42)
            r0.put(r2, r1)
            r2 = 1507(0x5e3, float:2.112E-42)
            r0.put(r2, r1)
            r2 = 1506(0x5e2, float:2.11E-42)
            r0.put(r2, r1)
            r2 = 1509(0x5e5, float:2.115E-42)
            r0.put(r2, r1)
            r2 = 1102(0x44e, float:1.544E-42)
            r0.put(r2, r1)
            r2 = 1615(0x64f, float:2.263E-42)
            r0.put(r2, r1)
            r1 = 4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2800(0xaf0, float:3.924E-42)
            r0.put(r2, r1)
            r2 = 1502(0x5de, float:2.105E-42)
            r0.put(r2, r1)
            r2 = 1505(0x5e1, float:2.109E-42)
            r0.put(r2, r1)
            r2 = 1501(0x5dd, float:2.103E-42)
            r0.put(r2, r1)
            r2 = 1504(0x5e0, float:2.108E-42)
            r0.put(r2, r1)
            r2 = 1114(0x45a, float:1.561E-42)
            r0.put(r2, r1)
            r2 = 1108(0x454, float:1.553E-42)
            r0.put(r2, r1)
            r2 = 2201(0x899, float:3.084E-42)
            r0.put(r2, r1)
            r2 = 1109(0x455, float:1.554E-42)
            r0.put(r2, r1)
            r2 = 1101(0x44d, float:1.543E-42)
            r0.put(r2, r1)
            r2 = 2801(0xaf1, float:3.925E-42)
            r0.put(r2, r1)
            r2 = 1035(0x40b, float:1.45E-42)
            r0.put(r2, r1)
            r2 = 1037(0x40d, float:1.453E-42)
            r0.put(r2, r1)
            r2 = 1105(0x451, float:1.548E-42)
            r0.put(r2, r1)
            r2 = 1039(0x40f, float:1.456E-42)
            r0.put(r2, r1)
            r2 = 1113(0x459, float:1.56E-42)
            r0.put(r2, r1)
            r2 = 1034(0x40a, float:1.449E-42)
            r0.put(r2, r1)
            r2 = 1033(0x409, float:1.448E-42)
            r0.put(r2, r1)
            r2 = 1200(0x4b0, float:1.682E-42)
            r0.put(r2, r1)
            r2 = 1038(0x40e, float:1.455E-42)
            r0.put(r2, r1)
            r2 = 1612(0x64c, float:2.259E-42)
            r0.put(r2, r1)
            r2 = 1614(0x64e, float:2.262E-42)
            r0.put(r2, r1)
            r2 = 1613(0x64d, float:2.26E-42)
            r0.put(r2, r1)
            r2 = 2100(0x834, float:2.943E-42)
            r0.put(r2, r1)
            r2 = 2300(0x8fc, float:3.223E-42)
            r0.put(r2, r1)
            r2 = 3100(0xc1c, float:4.344E-42)
            r0.put(r2, r1)
            r2 = 3101(0xc1d, float:4.345E-42)
            r0.put(r2, r1)
            return r0
    }

    public static boolean d(int r1) {
            android.util.SparseArray r0 = cn.jiguang.commons.f.g.a
            int r0 = r0.indexOfKey(r1)
            if (r0 >= 0) goto L17
            java.util.Set r0 = cn.jiguang.commons.f.g.f1109e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L15
            goto L17
        L15:
            r1 = 0
            return r1
        L17:
            r1 = 1
            return r1
    }

    private static java.util.List e() {
            r0 = 1100(0x44c, float:1.541E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 1101(0x44d, float:1.543E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1102(0x44e, float:1.544E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 1104(0x450, float:1.547E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 1112(0x458, float:1.558E-42)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 5
            java.lang.Integer[] r5 = new java.lang.Integer[r5]
            r6 = 0
            r5[r6] = r0
            r0 = 1
            r5[r0] = r1
            r0 = 2
            r5[r0] = r2
            r0 = 3
            r5[r0] = r3
            r0 = 4
            r5[r0] = r4
            java.util.List r0 = java.util.Arrays.asList(r5)
            return r0
    }

    private static java.util.Map f() {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 1100(0x44c, float:1.541E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "JAppList"
            r0.put(r2, r1)
            r1 = 1110(0x456, float:1.555E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "JAppListFile"
            r0.put(r2, r1)
            r1 = 1103(0x44f, float:1.546E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "JAppSDK"
            r0.put(r2, r1)
            r1 = 1101(0x44d, float:1.543E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "JAppMovement"
            r0.put(r2, r1)
            r1 = 1102(0x44e, float:1.544E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "JAppRunning"
            r0.put(r2, r1)
            r1 = 1106(0x452, float:1.55E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "JAppProbe"
            r0.put(r2, r1)
            r1 = 1104(0x450, float:1.547E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "JAppActive"
            r0.put(r2, r1)
            r1 = 1112(0x458, float:1.558E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "JAppActiveFile"
            r0.put(r2, r1)
            r1 = 3000(0xbb8, float:4.204E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "JDeviceIdMap"
            r0.put(r2, r1)
            r1 = 1600(0x640, float:2.242E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "JArp"
            r0.put(r2, r1)
            r1 = 2700(0xa8c, float:3.784E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "JDeviceMac"
            r0.put(r2, r1)
            r1 = 1500(0x5dc, float:2.102E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "JLocation"
            r0.put(r2, r1)
            java.lang.String r2 = "JLocationv2"
            r0.put(r2, r1)
            r1 = 1000(0x3e8, float:1.401E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "JDevice"
            r0.put(r2, r1)
            r1 = 1200(0x4b0, float:1.682E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "JBattery"
            r0.put(r2, r1)
            r1 = 1008(0x3f0, float:1.413E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "JDeviceIds"
            r0.put(r2, r1)
            r1 = 2800(0xaf0, float:3.924E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "JDeviceIp"
            r0.put(r2, r1)
            r1 = 2900(0xb54, float:4.064E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "JDeviceScreen"
            r0.put(r2, r1)
            r1 = 1300(0x514, float:1.822E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "JAppPermission"
            r0.put(r2, r1)
            r1 = 2400(0x960, float:3.363E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "JBluetooth"
            r0.put(r2, r1)
            return r0
    }

    private static java.util.Map g() {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 30000(0x7530, double:1.4822E-319)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "JLocationv2"
            r0.put(r2, r1)
            return r0
    }

    private static java.util.Set h() {
            java.util.HashSet r0 = new java.util.HashSet
            r1 = 20
            r0.<init>(r1)
            java.util.Map r1 = cn.jiguang.commons.f.g.f1108d
            java.util.Collection r1 = r1.values()
            r0.addAll(r1)
            return r0
    }
}
