package xyz.adscope.common.v2.dev.oaid.cn.oa.helpers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class DevicesIDsHelper {
    private static final java.lang.String TAG = "DevicesIDsHelper";
    private xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.DevicesIDsHelper.AppIdsUpdater _listener;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface AppIdsUpdater {
        void OnIdsValid(java.lang.String r1);
    }

    public DevicesIDsHelper(xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.DevicesIDsHelper.AppIdsUpdater r1) {
            r0 = this;
            r0.<init>()
            r0._listener = r1
            return
    }

    private java.lang.String getBrand() {
            r1 = this;
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r0 = r0.toUpperCase()
            return r0
    }

    private void getIDFromNewThead(android.content.Context r3) {
            r2 = this;
            if (r3 != 0) goto L4
            goto Laa
        L4:
            java.lang.String r0 = "ASUS"
            java.lang.String r1 = r2.getManufacturer()     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1e
            xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.ASUSDeviceIDHelper r0 = new xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.ASUSDeviceIDHelper     // Catch: java.lang.Throwable -> L1b
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L1b
            xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.DevicesIDsHelper$AppIdsUpdater r3 = r2._listener     // Catch: java.lang.Throwable -> L1b
            r0.getID(r3)     // Catch: java.lang.Throwable -> L1b
            return
        L1b:
            r3 = move-exception
            goto Lc1
        L1e:
            boolean r0 = isHuawei()     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L2f
            xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.HWDeviceIDHelper r0 = new xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.HWDeviceIDHelper     // Catch: java.lang.Throwable -> L1b
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L1b
            xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.DevicesIDsHelper$AppIdsUpdater r3 = r2._listener     // Catch: java.lang.Throwable -> L1b
            r0.getHWID(r3)     // Catch: java.lang.Throwable -> L1b
            return
        L2f:
            boolean r0 = isOppo()     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L40
            xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.OppoDeviceIDHelper r0 = new xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.OppoDeviceIDHelper     // Catch: java.lang.Throwable -> L1b
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L1b
            xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.DevicesIDsHelper$AppIdsUpdater r3 = r2._listener     // Catch: java.lang.Throwable -> L1b
            r0.getID(r3)     // Catch: java.lang.Throwable -> L1b
            return
        L40:
            java.lang.String r0 = "ONEPLUS"
            java.lang.String r1 = r2.getManufacturer()     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L57
            xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.OnePlusDeviceIDHelper r0 = new xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.OnePlusDeviceIDHelper     // Catch: java.lang.Throwable -> L1b
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L1b
            xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.DevicesIDsHelper$AppIdsUpdater r3 = r2._listener     // Catch: java.lang.Throwable -> L1b
            r0.getID(r3)     // Catch: java.lang.Throwable -> L1b
            return
        L57:
            java.lang.String r0 = "ZTE"
            java.lang.String r1 = r2.getManufacturer()     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L6e
            xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.ZTEDeviceIDHelper r0 = new xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.ZTEDeviceIDHelper     // Catch: java.lang.Throwable -> L1b
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L1b
            xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.DevicesIDsHelper$AppIdsUpdater r3 = r2._listener     // Catch: java.lang.Throwable -> L1b
            r0.getID(r3)     // Catch: java.lang.Throwable -> L1b
            return
        L6e:
            java.lang.String r0 = "FERRMEOS"
            java.lang.String r1 = r2.getManufacturer()     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto Lb6
            boolean r0 = r2.isFreeMeOS()     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L81
            goto Lb6
        L81:
            java.lang.String r0 = "SSUI"
            java.lang.String r1 = r2.getManufacturer()     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto Lab
            boolean r0 = r2.isSSUIOS()     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L94
            goto Lab
        L94:
            java.lang.String r0 = "SAMSUNG"
            java.lang.String r1 = r2.getManufacturer()     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto Laa
            xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.SamsungDeviceIDHelper r0 = new xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.SamsungDeviceIDHelper     // Catch: java.lang.Throwable -> L1b
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L1b
            xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.DevicesIDsHelper$AppIdsUpdater r3 = r2._listener     // Catch: java.lang.Throwable -> L1b
            r0.getSumsungID(r3)     // Catch: java.lang.Throwable -> L1b
        Laa:
            return
        Lab:
            xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.ZTEDeviceIDHelper r0 = new xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.ZTEDeviceIDHelper     // Catch: java.lang.Throwable -> L1b
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L1b
            xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.DevicesIDsHelper$AppIdsUpdater r3 = r2._listener     // Catch: java.lang.Throwable -> L1b
            r0.getID(r3)     // Catch: java.lang.Throwable -> L1b
            return
        Lb6:
            xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.ZTEDeviceIDHelper r0 = new xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.ZTEDeviceIDHelper     // Catch: java.lang.Throwable -> L1b
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L1b
            xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.DevicesIDsHelper$AppIdsUpdater r3 = r2._listener     // Catch: java.lang.Throwable -> L1b
            r0.getID(r3)     // Catch: java.lang.Throwable -> L1b
            return
        Lc1:
            java.lang.String r0 = "DevicesIDsHelper"
            java.lang.String r1 = "getIDFromNewThead exception"
            xyz.adscope.common.v2.log.SDKLog.e(r0, r1)
            xyz.adscope.common.v2.log.SDKLog.stack(r3)
            return
    }

    private java.lang.String getManufacturer() {
            r1 = this;
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r0 = r0.toUpperCase()
            return r0
    }

    private java.lang.String getProperty(java.lang.String r9) {
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "android.os.SystemProperties"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L2a
            java.lang.String r2 = "get"
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L2a
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.Exception -> L2a
            r7 = 1
            r4[r7] = r5     // Catch: java.lang.Exception -> L2a
            java.lang.reflect.Method r2 = r1.getMethod(r2, r4)     // Catch: java.lang.Exception -> L2a
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L2a
            r3[r6] = r9     // Catch: java.lang.Exception -> L2a
            java.lang.String r9 = "unknown"
            r3[r7] = r9     // Catch: java.lang.Exception -> L2a
            java.lang.Object r9 = r2.invoke(r1, r3)     // Catch: java.lang.Exception -> L2a
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Exception -> L2a
            return r9
        L2a:
            return r0
    }

    public static boolean isHuawei() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "HUAWEI"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L1d
            java.lang.String r0 = android.os.Build.BRAND
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 != 0) goto L1d
            java.lang.String r1 = "HONOR"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L1b
            goto L1d
        L1b:
            r0 = 0
            return r0
        L1d:
            r0 = 1
            return r0
    }

    public static boolean isOppo() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "OPPO"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L2b
            java.lang.String r0 = android.os.Build.BRAND
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 != 0) goto L2b
            java.lang.String r1 = "REALME"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L2b
            java.lang.String r0 = "ro.build.version.opporom"
            java.lang.String r1 = ""
            java.lang.String r0 = sysProperty(r0, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L29
            goto L2b
        L29:
            r0 = 0
            return r0
        L2b:
            r0 = 1
            return r0
    }

    public static java.lang.String sysProperty(java.lang.String r7, java.lang.String r8) {
            java.lang.String r0 = "android.os.SystemProperties"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L24
            java.lang.String r1 = "get"
            r2 = 2
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L24
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Exception -> L24
            r6 = 1
            r3[r6] = r4     // Catch: java.lang.Exception -> L24
            java.lang.reflect.Method r1 = r0.getMethod(r1, r3)     // Catch: java.lang.Exception -> L24
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L24
            r2[r5] = r7     // Catch: java.lang.Exception -> L24
            r2[r6] = r8     // Catch: java.lang.Exception -> L24
            java.lang.Object r7 = r1.invoke(r0, r2)     // Catch: java.lang.Exception -> L24
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L24
            goto L3f
        L24:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "System property invoke error: "
            r8.append(r0)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            java.lang.String r0 = "DevicesIDsHelper"
            xyz.adscope.common.v2.log.SDKLog.e(r0, r8)
            xyz.adscope.common.v2.log.SDKLog.stack(r7)
            r7 = 0
        L3f:
            if (r7 != 0) goto L43
            java.lang.String r7 = ""
        L43:
            return r7
    }

    public void getOAID(android.content.Context r4) {
            r3 = this;
            java.lang.String r0 = "DevicesIDsHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b
            r1.<init>()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = "init oaid "
            r1.append(r2)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = r3.getManufacturer()     // Catch: java.lang.Throwable -> L2b
            r1.append(r2)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L2b
            xyz.adscope.common.v2.log.SDKLog.d(r0, r1)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r0 = "ASUS"
            java.lang.String r1 = r3.getManufacturer()     // Catch: java.lang.Throwable -> L2b
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L2e
            r3.getIDFromNewThead(r4)     // Catch: java.lang.Throwable -> L2b
            goto L143
        L2b:
            r4 = move-exception
            goto L14e
        L2e:
            boolean r0 = isHuawei()     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L39
            r3.getIDFromNewThead(r4)     // Catch: java.lang.Throwable -> L2b
            goto L143
        L39:
            java.lang.String r0 = "LENOVO"
            java.lang.String r1 = r3.getManufacturer()     // Catch: java.lang.Throwable -> L2b
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L51
            xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.LenovoDeviceIDHelper r0 = new xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.LenovoDeviceIDHelper     // Catch: java.lang.Throwable -> L2b
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L2b
            xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.DevicesIDsHelper$AppIdsUpdater r4 = r3._listener     // Catch: java.lang.Throwable -> L2b
            r0.getIdRun(r4)     // Catch: java.lang.Throwable -> L2b
            goto L143
        L51:
            java.lang.String r0 = "MOTOLORA"
            java.lang.String r1 = r3.getManufacturer()     // Catch: java.lang.Throwable -> L2b
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L69
            xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.LenovoDeviceIDHelper r0 = new xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.LenovoDeviceIDHelper     // Catch: java.lang.Throwable -> L2b
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L2b
            xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.DevicesIDsHelper$AppIdsUpdater r4 = r3._listener     // Catch: java.lang.Throwable -> L2b
            r0.getIdRun(r4)     // Catch: java.lang.Throwable -> L2b
            goto L143
        L69:
            java.lang.String r0 = "MEIZU"
            java.lang.String r1 = r3.getManufacturer()     // Catch: java.lang.Throwable -> L2b
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L81
            xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.MeizuDeviceIDHelper r0 = new xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.MeizuDeviceIDHelper     // Catch: java.lang.Throwable -> L2b
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L2b
            xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.DevicesIDsHelper$AppIdsUpdater r4 = r3._listener     // Catch: java.lang.Throwable -> L2b
            r0.getMeizuID(r4)     // Catch: java.lang.Throwable -> L2b
            goto L143
        L81:
            java.lang.String r0 = "NUBIA"
            java.lang.String r1 = r3.getManufacturer()     // Catch: java.lang.Throwable -> L2b
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L98
            xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.NubiaDeviceIDHelper r0 = new xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.NubiaDeviceIDHelper     // Catch: java.lang.Throwable -> L2b
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r4 = r0.getNubiaID()     // Catch: java.lang.Throwable -> L2b
            goto L144
        L98:
            boolean r0 = isOppo()     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto La3
            r3.getIDFromNewThead(r4)     // Catch: java.lang.Throwable -> L2b
            goto L143
        La3:
            java.lang.String r0 = "SAMSUNG"
            java.lang.String r1 = r3.getManufacturer()     // Catch: java.lang.Throwable -> L2b
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto Lb4
            r3.getIDFromNewThead(r4)     // Catch: java.lang.Throwable -> L2b
            goto L143
        Lb4:
            java.lang.String r0 = "VIVO"
            java.lang.String r1 = r3.getManufacturer()     // Catch: java.lang.Throwable -> L2b
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto Lcb
            xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.VivoDeviceIDHelper r0 = new xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.VivoDeviceIDHelper     // Catch: java.lang.Throwable -> L2b
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r4 = r0.getOaid()     // Catch: java.lang.Throwable -> L2b
            goto L144
        Lcb:
            java.lang.String r0 = "XIAOMI"
            java.lang.String r1 = r3.getManufacturer()     // Catch: java.lang.Throwable -> L2b
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto Le1
            xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.XiaomiDeviceIDHelper r0 = new xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.XiaomiDeviceIDHelper     // Catch: java.lang.Throwable -> L2b
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r4 = r0.getOAID()     // Catch: java.lang.Throwable -> L2b
            goto L144
        Le1:
            java.lang.String r0 = "BLACKSHARK"
            java.lang.String r1 = r3.getManufacturer()     // Catch: java.lang.Throwable -> L2b
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto Lf7
            xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.XiaomiDeviceIDHelper r0 = new xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.XiaomiDeviceIDHelper     // Catch: java.lang.Throwable -> L2b
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r4 = r0.getOAID()     // Catch: java.lang.Throwable -> L2b
            goto L144
        Lf7:
            java.lang.String r0 = "ONEPLUS"
            java.lang.String r1 = r3.getManufacturer()     // Catch: java.lang.Throwable -> L2b
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L107
            r3.getIDFromNewThead(r4)     // Catch: java.lang.Throwable -> L2b
            goto L143
        L107:
            java.lang.String r0 = "ZTE"
            java.lang.String r1 = r3.getManufacturer()     // Catch: java.lang.Throwable -> L2b
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L117
            r3.getIDFromNewThead(r4)     // Catch: java.lang.Throwable -> L2b
            goto L143
        L117:
            java.lang.String r0 = "FERRMEOS"
            java.lang.String r1 = r3.getManufacturer()     // Catch: java.lang.Throwable -> L2b
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L140
            boolean r0 = r3.isFreeMeOS()     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L12a
            goto L140
        L12a:
            java.lang.String r0 = "SSUI"
            java.lang.String r1 = r3.getManufacturer()     // Catch: java.lang.Throwable -> L2b
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L13c
            boolean r0 = r3.isSSUIOS()     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L143
        L13c:
            r3.getIDFromNewThead(r4)     // Catch: java.lang.Throwable -> L2b
            goto L143
        L140:
            r3.getIDFromNewThead(r4)     // Catch: java.lang.Throwable -> L2b
        L143:
            r4 = 0
        L144:
            xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.DevicesIDsHelper$AppIdsUpdater r0 = r3._listener     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L14d
            if (r4 == 0) goto L14d
            r0.OnIdsValid(r4)     // Catch: java.lang.Throwable -> L2b
        L14d:
            return
        L14e:
            xyz.adscope.common.v2.log.SDKLog.stack(r4)
            return
    }

    public boolean isFreeMeOS() {
            r2 = this;
            java.lang.String r0 = "ro.build.freeme.label"
            java.lang.String r0 = r2.getProperty(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L16
            java.lang.String r1 = "FREEMEOS"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    public boolean isSSUIOS() {
            r2 = this;
            java.lang.String r0 = "ro.ssui.product"
            java.lang.String r0 = r2.getProperty(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L16
            java.lang.String r1 = "unknown"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }
}
