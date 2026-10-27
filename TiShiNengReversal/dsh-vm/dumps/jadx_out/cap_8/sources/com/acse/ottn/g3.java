package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class g3 {
    public static com.acse.ottn.g3 a = null;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f2341b = "OpenMobilePermissionUtil";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements java.lang.Runnable {
        public final /* synthetic */ android.accessibilityservice.AccessibilityService a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.g3 f2342b;

        public a(com.acse.ottn.g3 r1, android.accessibilityservice.AccessibilityService r2) {
                r0 = this;
                r0.f2342b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                android.accessibilityservice.AccessibilityService r0 = r1.a
                com.acse.ottn.z4.b(r0)
                return
        }
    }

    static {
            return
    }

    public g3() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.acse.ottn.g3 a() {
            com.acse.ottn.g3 r0 = com.acse.ottn.g3.a
            if (r0 != 0) goto L19
            java.lang.Class<com.acse.ottn.g3> r0 = com.acse.ottn.g3.class
            monitor-enter(r0)
            com.acse.ottn.g3 r1 = com.acse.ottn.g3.a     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.acse.ottn.g3 r1 = new com.acse.ottn.g3     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.acse.ottn.g3.a = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.acse.ottn.g3 r0 = com.acse.ottn.g3.a
            return r0
    }

    public boolean a(android.accessibilityservice.AccessibilityService r19, java.lang.String r20) {
            r18 = this;
            r0 = r19
            r1 = r20
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            r3 = 0
            if (r2 != 0) goto Lc
            return r3
        Lc:
            r1.getClass()
            int r2 = r1.hashCode()
            r8 = -1
            switch(r2) {
                case -1837416467: goto L288;
                case -1818146895: goto L27d;
                case -1736638048: goto L272;
                case -1711619133: goto L267;
                case -1711619131: goto L25c;
                case -1697916220: goto L251;
                case -1510049100: goto L246;
                case -1508581269: goto L23b;
                case -1504769691: goto L22d;
                case -1473395485: goto L21f;
                case -1213771616: goto L211;
                case -1180184559: goto L203;
                case -1150447007: goto L1f5;
                case -1138471325: goto L1e7;
                case -888547196: goto L1d9;
                case -801027931: goto L1cb;
                case -694209271: goto L1bd;
                case -671860274: goto L1af;
                case -638199557: goto L1a1;
                case -590540374: goto L193;
                case -520510470: goto L185;
                case -347181517: goto L177;
                case -102088186: goto L169;
                case -3605999: goto L15b;
                case 335974848: goto L14d;
                case 362914745: goto L13f;
                case 366917116: goto L131;
                case 408505592: goto L123;
                case 626548678: goto L115;
                case 688371313: goto L107;
                case 695606089: goto Lf9;
                case 844891404: goto Leb;
                case 1064378975: goto Ldd;
                case 1157708154: goto Lcf;
                case 1356567262: goto Lc1;
                case 1388125120: goto Lb3;
                case 1535820958: goto La5;
                case 1570829571: goto L97;
                case 1577225874: goto L89;
                case 1647376138: goto L7b;
                case 1664890045: goto L6d;
                case 1722840595: goto L5f;
                case 1784217206: goto L51;
                case 1799810893: goto L43;
                case 1916443872: goto L35;
                case 2095881023: goto L27;
                case 2141154850: goto L19;
                default: goto L17;
            }
        L17:
            goto L292
        L19:
            java.lang.String r2 = "com.coloros.safecenter.sysfloatwindow.FloatWindowListActivity"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L23
            goto L292
        L23:
            r8 = 46
            goto L292
        L27:
            java.lang.String r2 = "com.android.settings.Settings$AppDrawOverlaySettingsActivity"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L31
            goto L292
        L31:
            r8 = 45
            goto L292
        L35:
            java.lang.String r2 = "com.coloros.floatwindow.sysfloatwindow.FloatWindowListActivity"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L3f
            goto L292
        L3f:
            r8 = 44
            goto L292
        L43:
            java.lang.String r2 = "com.huawei.securitycenter.permission.ui.activity.MainActivity"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L4d
            goto L292
        L4d:
            r8 = 43
            goto L292
        L51:
            java.lang.String r2 = "com.miui.permcenter.settings.OtherPermissionsActivity"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L5b
            goto L292
        L5b:
            r8 = 42
            goto L292
        L5f:
            java.lang.String r2 = "com.hihonor.securitycenter.permission.ui.activity.PermissionSettingActivity"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L69
            goto L292
        L69:
            r8 = 41
            goto L292
        L6d:
            java.lang.String r2 = "com.miui.appmanager.ApplicationsDetailsActivity"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L77
            goto L292
        L77:
            r8 = 40
            goto L292
        L7b:
            java.lang.String r2 = "com.vivo.permissionmanager.activity.FloatWindowManagerActivity"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L85
            goto L292
        L85:
            r8 = 39
            goto L292
        L89:
            java.lang.String r2 = "com.oplusos.securitypermission.permission.ui.handheld.PermissionAppsActivityNew"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L93
            goto L292
        L93:
            r8 = 38
            goto L292
        L97:
            java.lang.String r2 = "com.iqoo.powersaving.activity.ExcessivePowerManagerActivity"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto La1
            goto L292
        La1:
            r8 = 37
            goto L292
        La5:
            java.lang.String r2 = "com.miui.permcenter.permissions.PermissionsEditorActivity"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto Laf
            goto L292
        Laf:
            r8 = 36
            goto L292
        Lb3:
            java.lang.String r2 = "com.android.settings.Settings$OverlaySettingsActivity"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto Lbd
            goto L292
        Lbd:
            r8 = 35
            goto L292
        Lc1:
            java.lang.String r2 = "com.vivo.permissionmanager.activity.BgStartUpManagerActivity"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto Lcb
            goto L292
        Lcb:
            r8 = 34
            goto L292
        Lcf:
            java.lang.String r2 = "com.oplusos.floatwindow.sysfloatwindow.FloatWindowListActivity"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto Ld9
            goto L292
        Ld9:
            r8 = 33
            goto L292
        Ldd:
            java.lang.String r2 = "com.vivo.applicationbehaviorengine.ui.ExcessivePowerManagerActivity"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto Le7
            goto L292
        Le7:
            r8 = 32
            goto L292
        Leb:
            java.lang.String r2 = "com.miui.permcenter.permissions.PermissionAppsModifyActivity"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto Lf5
            goto L292
        Lf5:
            r8 = 31
            goto L292
        Lf9:
            java.lang.String r2 = "com.android.permissioncontroller.permission.ui.GrantPermissionsActivity"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L103
            goto L292
        L103:
            r8 = 30
            goto L292
        L107:
            java.lang.String r2 = "com.oplus.settings.OplusSettingsActivity$AppSettingsActivity"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L111
            goto L292
        L111:
            r8 = 29
            goto L292
        L115:
            java.lang.String r2 = "com.android.settings.applications.InstalledAppDetailsTop"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L11f
            goto L292
        L11f:
            r8 = 28
            goto L292
        L123:
            java.lang.String r2 = "com.huawei.security.permission.ui.activity.MainActivity"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L12d
            goto L292
        L12d:
            r8 = 27
            goto L292
        L131:
            java.lang.String r2 = "com.android.permissioncontroller.permission.ui.ManagePermissionsActivity"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L13b
            goto L292
        L13b:
            r8 = 26
            goto L292
        L13f:
            java.lang.String r2 = "com.hihonor.systemmanager.appcontrol.activity.StartupAppControlActivity"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L149
            goto L292
        L149:
            r8 = 25
            goto L292
        L14d:
            java.lang.String r2 = "com.android.settings.Settings$AppAndNotificationDashboardActivity"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L157
            goto L292
        L157:
            r8 = 24
            goto L292
        L15b:
            java.lang.String r2 = "com.huawei.systemmanager.appcontrol.activity.StartupAppControlActivity"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L165
            goto L292
        L165:
            r8 = 23
            goto L292
        L169:
            java.lang.String r2 = "com.coloros.securitypermission.permission.PermissionGroupsActivity"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L173
            goto L292
        L173:
            r8 = 22
            goto L292
        L177:
            java.lang.String r2 = "com.vivo.permissionmanager.activity.SoftPermissionDetailActivity"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L181
            goto L292
        L181:
            r8 = 21
            goto L292
        L185:
            java.lang.String r2 = "com.oplus.settings.feature.homepage.OplusSettingsHomepageActivity"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L18f
            goto L292
        L18f:
            r8 = 20
            goto L292
        L193:
            java.lang.String r2 = "com.oplus.securepay.SecurePayMainActivity"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L19d
            goto L292
        L19d:
            r8 = 19
            goto L292
        L1a1:
            java.lang.String r2 = "com.huawei.systemmanager.startupmgr.ui.StartupNormalAppListActivity"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L1ab
            goto L292
        L1ab:
            r8 = 18
            goto L292
        L1af:
            java.lang.String r2 = "com.android.settings.Settings$PasswordGuideActivity"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L1b9
            goto L292
        L1b9:
            r8 = 17
            goto L292
        L1bd:
            java.lang.String r2 = "com.hihonor.systemmanager.power.ui.DetailOfSoftConsumptionActivity"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L1c7
            goto L292
        L1c7:
            r8 = 16
            goto L292
        L1cb:
            java.lang.String r2 = "com.hihonor.securitycenter.permission.ui.activity.MainActivity"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L1d5
            goto L292
        L1d5:
            r8 = 15
            goto L292
        L1d9:
            java.lang.String r2 = "com.android.settings.SubSettings"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L1e3
            goto L292
        L1e3:
            r8 = 14
            goto L292
        L1e7:
            java.lang.String r2 = "com.coloros.powermanager.fuelgaue.PowerControlActivity"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L1f1
            goto L292
        L1f1:
            r8 = 13
            goto L292
        L1f5:
            java.lang.String r2 = "com.oplus.powermanager.fuelgaue.PowerControlActivity"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L1ff
            goto L292
        L1ff:
            r8 = 12
            goto L292
        L203:
            java.lang.String r2 = "com.android.settings.HWSettings"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L20d
            goto L292
        L20d:
            r8 = 11
            goto L292
        L211:
            java.lang.String r2 = "com.huawei.security.permission.ui.activity.PermissionSettingActivity"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L21b
            goto L292
        L21b:
            r8 = 10
            goto L292
        L21f:
            java.lang.String r2 = "com.miui.permcenter.autostart.AutoStartDetailManagementActivity"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L229
            goto L292
        L229:
            r8 = 9
            goto L292
        L22d:
            java.lang.String r2 = "com.iqoo.powersaving.PowerSavingManagerActivity"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L237
            goto L292
        L237:
            r8 = 8
            goto L292
        L23b:
            java.lang.String r2 = "com.huawei.securitycenter.permission.ui.activity.PermissionSettingActivity"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L244
            goto L292
        L244:
            r8 = 7
            goto L292
        L246:
            java.lang.String r2 = "android.app.Dialog"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L24f
            goto L292
        L24f:
            r8 = 6
            goto L292
        L251:
            java.lang.String r2 = "com.android.packageinstaller.permission.ui.AppPermissionActivity"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L25a
            goto L292
        L25a:
            r8 = 5
            goto L292
        L25c:
            java.lang.String r2 = "com.originui.widget.dialog.h"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L265
            goto L292
        L265:
            r8 = 4
            goto L292
        L267:
            java.lang.String r2 = "com.originui.widget.dialog.f"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L270
            goto L292
        L270:
            r8 = 3
            goto L292
        L272:
            java.lang.String r2 = "com.oplusos.securitypermission.permission.PermissionGroupsActivity"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L27b
            goto L292
        L27b:
            r8 = 2
            goto L292
        L27d:
            java.lang.String r2 = "com.huawei.systemmanager.power.ui.DetailOfSoftConsumptionActivity"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L286
            goto L292
        L286:
            r8 = 1
            goto L292
        L288:
            java.lang.String r2 = "com.iqoo.powersaving.fuelgauge.PowerRankActivity"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L291
            goto L292
        L291:
            r8 = 0
        L292:
            java.lang.String r1 = "允许"
            java.lang.String r2 = ""
            java.lang.String r11 = "blackshark"
            java.lang.String r12 = "sys_text"
            java.lang.String r13 = "xiaomi"
            java.lang.String r14 = "redmi"
            java.lang.String r15 = "samsung"
            java.lang.String r9 = "oneplus"
            java.lang.String r10 = "realme"
            java.lang.String r4 = "oppo"
            r16 = 1
            java.lang.String r7 = "pay_secure"
            r17 = 0
            java.lang.String r3 = "location_permission"
            java.lang.String r5 = "battery_white"
            switch(r8) {
                case 0: goto Lb4d;
                case 1: goto Lb16;
                case 2: goto La74;
                case 3: goto La02;
                case 4: goto La02;
                case 5: goto L9e1;
                case 6: goto L99d;
                case 7: goto L962;
                case 8: goto Lb4d;
                case 9: goto L941;
                case 10: goto L962;
                case 11: goto L925;
                case 12: goto L900;
                case 13: goto L900;
                case 14: goto L85c;
                case 15: goto L81a;
                case 16: goto Lb16;
                case 17: goto L7ef;
                case 18: goto L7b6;
                case 19: goto L792;
                case 20: goto L760;
                case 21: goto L70c;
                case 22: goto La74;
                case 23: goto L7b6;
                case 24: goto L6cf;
                case 25: goto L7b6;
                case 26: goto La74;
                case 27: goto L81a;
                case 28: goto L677;
                case 29: goto L5dd;
                case 30: goto L586;
                case 31: goto L563;
                case 32: goto L52e;
                case 33: goto L4e5;
                case 34: goto L4c5;
                case 35: goto L3f7;
                case 36: goto L39e;
                case 37: goto L52e;
                case 38: goto L35e;
                case 39: goto L33e;
                case 40: goto L314;
                case 41: goto L962;
                case 42: goto L2ee;
                case 43: goto L81a;
                case 44: goto L4e5;
                case 45: goto L601;
                case 46: goto L2b4;
                default: goto L2b3;
            }
        L2b3:
            return r17
        L2b4:
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            boolean r1 = r1.a(r5)
            if (r1 != 0) goto L2bf
            return r16
        L2bf:
            java.lang.String r1 = com.acse.ottn.n4.b()
            com.acse.ottn.d r2 = com.acse.ottn.d.d()
            r2.e(r0)
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r2.a(r5, r3)
            boolean r2 = r4.equals(r1)
            if (r2 != 0) goto L2df
            boolean r1 = r10.equals(r1)
            if (r1 == 0) goto L2ed
        L2df:
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            boolean r1 = r1.f()
            if (r1 == 0) goto L2ea
            return r16
        L2ea:
            com.acse.ottn.h3.j(r0)
        L2ed:
            return r16
        L2ee:
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            boolean r1 = r1.a(r5)
            if (r1 != 0) goto L2f9
            return r16
        L2f9:
            com.acse.ottn.d r1 = com.acse.ottn.d.d()
            r1.e(r0)
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.a(r5, r2)
            java.lang.String r1 = com.acse.ottn.g3.f2341b
            java.lang.String r2 = "clickHouTaiShowPage倒计时 =2"
            com.acse.ottn.h2.a(r1, r2)
            com.acse.ottn.p2.d(r0)
            return r16
        L314:
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            boolean r1 = r1.a(r5)
            if (r1 != 0) goto L31f
            return r16
        L31f:
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            r2 = 300(0x12c, double:1.48E-321)
            r1.a(r2)
            com.acse.ottn.d r1 = com.acse.ottn.d.d()
            r1.e(r0)
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.a(r5, r2)
            java.lang.String r1 = "自启动"
            com.acse.ottn.p2.b(r1, r0)
            return r16
        L33e:
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            boolean r1 = r1.a(r5)
            if (r1 != 0) goto L349
            return r16
        L349:
            com.acse.ottn.d r1 = com.acse.ottn.d.d()
            r1.e(r0)
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.a(r5, r2)
            r1 = 0
            com.acse.ottn.z4.a(r0, r1)
            return r16
        L35e:
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            boolean r1 = r1.a(r5)
            if (r1 != 0) goto L369
            return r16
        L369:
            java.lang.String r1 = com.acse.ottn.n4.b()
            com.acse.ottn.d r2 = com.acse.ottn.d.d()
            r2.e(r0)
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r2.a(r5, r3)
            boolean r2 = r10.equals(r1)
            if (r2 != 0) goto L38f
            boolean r2 = r4.equals(r1)
            if (r2 != 0) goto L38f
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L39d
        L38f:
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            boolean r1 = r1.f()
            if (r1 == 0) goto L39a
            return r16
        L39a:
            com.acse.ottn.h3.h(r0)
        L39d:
            return r16
        L39e:
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            boolean r1 = r1.a(r5)
            if (r1 != 0) goto L3a9
            return r16
        L3a9:
            com.acse.ottn.d r1 = com.acse.ottn.d.d()
            r1.e(r0)
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.a(r5, r2)
            java.lang.String r1 = com.acse.ottn.g3.f2341b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "clickHouTaiShowPage倒计时 =3"
            r4.append(r5)
            com.acse.ottn.n3 r5 = com.acse.ottn.n3.a()
            boolean r5 = r5.a(r3)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.acse.ottn.h2.a(r1, r4)
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            boolean r1 = r1.a(r3)
            if (r1 == 0) goto L3ec
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            r1.a(r3, r2)
            com.acse.ottn.f2.h(r0)
            goto L3f6
        L3ec:
            java.lang.String r1 = com.acse.ottn.g3.f2341b
            java.lang.String r2 = "clickHouTaiShowPage倒计时 =1"
            com.acse.ottn.h2.a(r1, r2)
            com.acse.ottn.p2.d(r0)
        L3f6:
            return r16
        L3f7:
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            boolean r1 = r1.a(r5)
            java.lang.String r2 = "settings.Settings$OverlaySettingsActivity is fasle"
            if (r1 != 0) goto L409
            java.lang.String r0 = com.acse.ottn.g3.f2341b
            com.acse.ottn.h2.a(r0, r2)
            return r16
        L409:
            java.lang.String r1 = com.acse.ottn.n4.b()
            java.lang.String r3 = com.acse.ottn.g3.f2341b
            com.acse.ottn.h2.a(r3, r2)
            com.acse.ottn.d r2 = com.acse.ottn.d.d()
            r2.e(r0)
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r2.a(r5, r3)
            boolean r2 = r14.equals(r1)
            if (r2 != 0) goto L434
            boolean r2 = r13.equals(r1)
            if (r2 != 0) goto L434
            boolean r2 = r11.equals(r1)
            if (r2 == 0) goto L437
        L434:
            r2 = 1
            goto L4aa
        L437:
            boolean r2 = r9.equals(r1)
            if (r2 == 0) goto L450
            java.lang.String r1 = com.acse.ottn.g3.f2341b
            java.lang.String r2 = "settings.Settings$OverlaySettingsActivity is oneplus"
            com.acse.ottn.h2.a(r1, r2)
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            r2 = 1
            r1.a(r2)
            com.acse.ottn.e3.f(r0)
            return r2
        L450:
            r2 = 1
            boolean r3 = r15.equals(r1)
            if (r3 == 0) goto L469
            java.lang.String r1 = com.acse.ottn.g3.f2341b
            java.lang.String r3 = "settings.Settings$OverlaySettingsActivity is samsung"
            com.acse.ottn.h2.a(r1, r3)
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            r1.a(r2)
            com.acse.ottn.y3.e(r0)
            return r2
        L469:
            boolean r2 = r4.equals(r1)
            if (r2 != 0) goto L475
            boolean r1 = r10.equals(r1)
            if (r1 == 0) goto L477
        L475:
            r2 = 1
            goto L492
        L477:
            boolean r1 = r18.b()
            if (r1 == 0) goto L490
            java.lang.String r1 = com.acse.ottn.g3.f2341b
            java.lang.String r2 = "settings.Settings$OverlaySettingsActivity is huawei"
            com.acse.ottn.h2.a(r1, r2)
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            r2 = 1
            r1.a(r2)
            com.acse.ottn.s1.h(r0)
            goto L4a9
        L490:
            r2 = 1
            goto L4a9
        L492:
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 33
            if (r1 < r3) goto L4a9
            java.lang.String r1 = com.acse.ottn.g3.f2341b
            java.lang.String r3 = "settings.Settings$OverlaySettingsActivity is oppo"
            com.acse.ottn.h2.a(r1, r3)
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            r1.a(r2)
            com.acse.ottn.e3.f(r0)
        L4a9:
            return r2
        L4aa:
            java.lang.String r1 = com.acse.ottn.g3.f2341b
            java.lang.String r3 = "settings.Settings$OverlaySettingsActivity is xiaomi"
            com.acse.ottn.h2.a(r1, r3)
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r1.a(r5, r3)
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            r1.a(r2)
            com.acse.ottn.p2.j(r0)
            return r2
        L4c5:
            r2 = 1
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            boolean r1 = r1.a(r5)
            if (r1 != 0) goto L4d1
            return r2
        L4d1:
            com.acse.ottn.d r1 = com.acse.ottn.d.d()
            r1.e(r0)
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r1.a(r5, r3)
            com.acse.ottn.z4.a(r0, r2)
            return r2
        L4e5:
            r2 = 1
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            boolean r1 = r1.a(r5)
            if (r1 != 0) goto L4f1
            return r2
        L4f1:
            java.lang.String r1 = com.acse.ottn.n4.b()
            com.acse.ottn.d r2 = com.acse.ottn.d.d()
            r2.e(r0)
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r2.a(r5, r3)
            boolean r2 = r10.equals(r1)
            if (r2 != 0) goto L51b
            boolean r2 = r4.equals(r1)
            if (r2 != 0) goto L51b
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L518
            goto L51b
        L518:
            r16 = 1
            goto L52d
        L51b:
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            boolean r1 = r1.f()
            if (r1 == 0) goto L528
            r16 = 1
            return r16
        L528:
            r16 = 1
            com.acse.ottn.h3.i(r0)
        L52d:
            return r16
        L52e:
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            boolean r1 = r1.a(r5)
            if (r1 != 0) goto L539
            return r16
        L539:
            java.lang.String r1 = com.acse.ottn.g3.f2341b
            java.lang.String r2 = "clickServiceBackgroundHight init"
            com.acse.ottn.h2.a(r1, r2)
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.a(r5, r2)
            com.acse.ottn.d r1 = com.acse.ottn.d.d()
            r1.e(r0)
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            r2 = 200(0xc8, double:9.9E-322)
            r1.a(r2)
            long r1 = java.lang.System.currentTimeMillis()
            com.acse.ottn.z4.a(r0, r1)
            r16 = 1
            return r16
        L563:
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            boolean r1 = r1.a(r5)
            if (r1 != 0) goto L56e
            return r16
        L56e:
            com.acse.ottn.d r1 = com.acse.ottn.d.d()
            r1.e(r0)
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.a(r5, r2)
            long r1 = java.lang.System.currentTimeMillis()
            com.acse.ottn.f2.a(r0, r1)
            return r16
        L586:
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            java.lang.String r2 = "sys_dialog_text"
            java.lang.String r1 = r1.e(r2)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L59c
            com.acse.ottn.h3.n(r0)
        L599:
            r16 = 1
            goto L5dc
        L59c:
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            boolean r1 = r1.a(r7)
            if (r1 == 0) goto L5bc
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.a(r7, r2)
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            r2 = 300(0x12c, double:1.48E-321)
            r1.a(r2)
            com.acse.ottn.h3.q(r0)
            goto L599
        L5bc:
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            java.lang.String r2 = "click_state"
            boolean r1 = r1.a(r2)
            if (r1 == 0) goto L599
            com.acse.ottn.d r1 = com.acse.ottn.d.d()
            r1.e(r0)
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.a(r5, r2)
            com.acse.ottn.f2.c(r0)
            goto L599
        L5dc:
            return r16
        L5dd:
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            boolean r1 = r1.a(r5)
            if (r1 != 0) goto L5e8
            return r16
        L5e8:
            com.acse.ottn.d r1 = com.acse.ottn.d.d()
            r1.e(r0)
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.a(r5, r2)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 35
            if (r1 < r2) goto L601
            com.acse.ottn.h3.f(r0)
        L601:
            java.lang.String r1 = com.acse.ottn.n4.b()
            java.lang.String r2 = com.acse.ottn.g3.f2341b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "current phone is "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            com.acse.ottn.h2.a(r2, r3)
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            boolean r2 = r2.a(r5)
            if (r2 != 0) goto L628
            r16 = 1
            return r16
        L628:
            com.acse.ottn.d r2 = com.acse.ottn.d.d()
            r2.e(r0)
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r2.a(r5, r3)
            boolean r2 = r18.b()
            if (r2 == 0) goto L649
            long r1 = java.lang.System.currentTimeMillis()
            r3 = 0
            com.acse.ottn.s1.a(r0, r1, r3)
        L646:
            r16 = 1
            goto L676
        L649:
            java.lang.String r2 = "vivo"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L655
            com.acse.ottn.z4.c(r0)
            goto L646
        L655:
            boolean r2 = r14.equals(r1)
            if (r2 != 0) goto L672
            boolean r2 = r13.equals(r1)
            if (r2 != 0) goto L672
            boolean r2 = r11.equals(r1)
            if (r2 == 0) goto L668
            goto L672
        L668:
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L646
            com.acse.ottn.e3.c(r0)
            goto L646
        L672:
            com.acse.ottn.p2.e(r0)
            goto L646
        L676:
            return r16
        L677:
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            boolean r1 = r1.a(r5)
            if (r1 != 0) goto L682
            return r16
        L682:
            java.lang.String r1 = com.acse.ottn.n4.b()
            com.acse.ottn.d r2 = com.acse.ottn.d.d()
            r2.e(r0)
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r2.a(r5, r6)
            boolean r2 = r4.equals(r1)
            if (r2 != 0) goto L6ac
            boolean r2 = r10.equals(r1)
            if (r2 != 0) goto L6ac
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L6a9
            goto L6ac
        L6a9:
            r16 = 1
            goto L6ce
        L6ac:
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            boolean r1 = r1.a(r3)
            if (r1 == 0) goto L6ca
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            r1.a(r3, r6)
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            r2 = 300(0x12c, double:1.48E-321)
            r1.a(r2)
            com.acse.ottn.f2.k(r0)
            goto L6a9
        L6ca:
            com.acse.ottn.h3.d(r0)
            goto L6a9
        L6ce:
            return r16
        L6cf:
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            boolean r1 = r1.a(r5)
            if (r1 != 0) goto L6da
            return r16
        L6da:
            com.acse.ottn.d r1 = com.acse.ottn.d.d()
            r1.e(r0)
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.a(r5, r2)
            boolean r1 = r18.b()
            if (r1 == 0) goto L704
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            boolean r1 = r1.a(r3)
            if (r1 == 0) goto L707
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            r1.a(r3, r2)
            com.acse.ottn.f2.e(r0)
        L704:
            r16 = 1
            goto L70b
        L707:
            com.acse.ottn.s1.c(r0)
            goto L704
        L70b:
            return r16
        L70c:
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            boolean r1 = r1.a(r5)
            if (r1 != 0) goto L717
            return r16
        L717:
            com.acse.ottn.d r1 = com.acse.ottn.d.d()
            r1.e(r0)
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.a(r5, r2)
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            boolean r1 = r1.a(r3)
            if (r1 == 0) goto L749
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            r1.a(r3, r2)
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            r2 = 200(0xc8, double:9.9E-322)
            r1.a(r2)
            com.acse.ottn.f2.g(r0)
            r6 = r18
        L746:
            r16 = 1
            goto L75f
        L749:
            r2 = 200(0xc8, double:9.9E-322)
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            r1.<init>(r4)
            com.acse.ottn.g3$a r4 = new com.acse.ottn.g3$a
            r6 = r18
            r4.<init>(r6, r0)
            r1.postDelayed(r4, r2)
            goto L746
        L75f:
            return r16
        L760:
            r6 = r18
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            boolean r1 = r1.a(r7)
            if (r1 == 0) goto L77a
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.a(r7, r2)
            com.acse.ottn.h3.o(r0)
        L778:
            r1 = 1
            goto L791
        L77a:
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            boolean r1 = r1.a(r5)
            if (r1 == 0) goto L778
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.a(r5, r2)
            com.acse.ottn.h3.k(r0)
            goto L778
        L791:
            return r1
        L792:
            r6 = r18
            r1 = 1
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            boolean r2 = r2.a(r7)
            if (r2 != 0) goto L7a0
            return r1
        L7a0:
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r2.a(r7, r3)
            com.acse.ottn.b r2 = com.acse.ottn.b.c()
            r3 = 300(0x12c, double:1.48E-321)
            r2.a(r3)
            com.acse.ottn.h3.m(r0)
            return r1
        L7b6:
            r6 = r18
            r1 = 1
            java.lang.String r2 = "find"
            java.lang.String r3 = "acse_HuaweiUtils"
            com.acse.ottn.h2.a(r3, r2)
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            boolean r2 = r2.a(r5)
            if (r2 != 0) goto L7d0
            java.lang.String r0 = "battery_white is false"
            com.acse.ottn.h2.a(r3, r0)
            return r1
        L7d0:
            com.acse.ottn.d r2 = com.acse.ottn.d.d()
            r2.e(r0)
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r2.a(r5, r4)
            boolean r2 = r6.b()
            if (r2 == 0) goto L7ee
            java.lang.String r2 = "ok"
            com.acse.ottn.h2.a(r3, r2)
            com.acse.ottn.s1.b(r0, r1)
        L7ee:
            return r1
        L7ef:
            r6 = r18
            r1 = 1
            com.acse.ottn.n3 r3 = com.acse.ottn.n3.a()
            boolean r3 = r3.a(r7)
            if (r3 != 0) goto L7fd
            return r1
        L7fd:
            com.acse.ottn.n3 r3 = com.acse.ottn.n3.a()
            r3.b(r12, r2)
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r2.a(r7, r3)
            com.acse.ottn.b r2 = com.acse.ottn.b.c()
            r3 = 300(0x12c, double:1.48E-321)
            r2.a(r3)
            com.acse.ottn.h3.p(r0)
            return r1
        L81a:
            r6 = r18
            r1 = 1
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            boolean r2 = r2.a(r5)
            if (r2 != 0) goto L828
            return r1
        L828:
            com.acse.ottn.d r1 = com.acse.ottn.d.d()
            r1.e(r0)
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.a(r5, r2)
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            boolean r1 = r1.a(r3)
            if (r1 == 0) goto L857
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            r4 = 100
            r1.a(r4)
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            r1.a(r3, r2)
            r2 = 1
            com.acse.ottn.f2.a(r0, r2)
            goto L85b
        L857:
            r2 = 1
            com.acse.ottn.s1.c(r0, r2)
        L85b:
            return r2
        L85c:
            r6 = r18
            java.lang.String r1 = com.acse.ottn.n4.b()
            com.acse.ottn.n3 r3 = com.acse.ottn.n3.a()
            boolean r3 = r3.a(r7)
            if (r3 == 0) goto L8a5
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r1.a(r7, r3)
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            r3 = 500(0x1f4, double:2.47E-321)
            r1.a(r3)
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            java.lang.String r1 = r1.e(r12)
            java.lang.String r3 = "系统安全"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L8a1
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 35
            if (r1 != r3) goto L8a1
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            r1.b(r12, r2)
            com.acse.ottn.h3.p(r0)
        L89e:
            r16 = 1
            goto L8ff
        L8a1:
            com.acse.ottn.h3.l(r0)
            goto L89e
        L8a5:
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            boolean r2 = r2.a(r5)
            if (r2 == 0) goto L89e
            com.acse.ottn.d r2 = com.acse.ottn.d.d()
            r2.e(r0)
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r2.a(r5, r3)
            boolean r2 = r14.equals(r1)
            if (r2 != 0) goto L8cb
            boolean r2 = r13.equals(r1)
            if (r2 == 0) goto L8d5
        L8cb:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 30
            if (r2 < r3) goto L8d5
            com.acse.ottn.p2.e(r0)
            goto L89e
        L8d5:
            boolean r2 = r9.equals(r1)
            if (r2 != 0) goto L8e7
            boolean r2 = r4.equals(r1)
            if (r2 != 0) goto L8e7
            boolean r1 = r10.equals(r1)
            if (r1 == 0) goto L89e
        L8e7:
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            boolean r1 = r1.a()
            if (r1 != 0) goto L8f5
            com.acse.ottn.e3.c(r0)
            goto L89e
        L8f5:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 35
            if (r1 < r2) goto L89e
            com.acse.ottn.h3.f(r0)
            goto L89e
        L8ff:
            return r16
        L900:
            r6 = r18
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            boolean r1 = r1.a(r5)
            if (r1 != 0) goto L90d
            return r16
        L90d:
            com.acse.ottn.d r1 = com.acse.ottn.d.d()
            r1.e(r0)
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.a(r5, r2)
            long r1 = java.lang.System.currentTimeMillis()
            com.acse.ottn.h3.a(r0, r1)
            return r16
        L925:
            r6 = r18
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            boolean r1 = r1.a(r5)
            if (r1 != 0) goto L932
            return r16
        L932:
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.a(r5, r2)
            com.acse.ottn.s1.k(r0)
            r17 = 0
            return r17
        L941:
            r6 = r18
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            boolean r1 = r1.a(r5)
            if (r1 != 0) goto L94e
            return r16
        L94e:
            com.acse.ottn.d r1 = com.acse.ottn.d.d()
            r1.e(r0)
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.a(r5, r2)
            com.acse.ottn.p2.i(r0)
            return r16
        L962:
            r6 = r18
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            boolean r1 = r1.a(r5)
            if (r1 != 0) goto L96f
            return r16
        L96f:
            com.acse.ottn.d r1 = com.acse.ottn.d.d()
            r1.e(r0)
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.a(r5, r2)
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            boolean r1 = r1.a(r3)
            if (r1 == 0) goto L997
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            r1.a(r3, r2)
            r1 = 0
            com.acse.ottn.f2.a(r0, r1)
        L994:
            r16 = 1
            goto L99c
        L997:
            r1 = 0
            com.acse.ottn.s1.c(r0, r1)
            goto L994
        L99c:
            return r16
        L99d:
            r6 = r18
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            boolean r2 = r2.a(r5)
            if (r2 != 0) goto L9aa
            return r16
        L9aa:
            java.lang.String r2 = com.acse.ottn.n4.b()
            boolean r2 = r15.equals(r2)
            if (r2 == 0) goto L9de
            com.acse.ottn.d r2 = com.acse.ottn.d.d()
            r2.e(r0)
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r2.a(r5, r3)
            com.acse.ottn.b r2 = com.acse.ottn.b.c()
            r4 = 100
            r2.a(r4)
            com.acse.ottn.b r2 = com.acse.ottn.b.c()
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.h(r0, r1)
            if (r0 == 0) goto L9de
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            r1.g(r0)
        L9de:
            r16 = 1
            return r16
        L9e1:
            r6 = r18
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            boolean r1 = r1.a(r5)
            if (r1 != 0) goto L9ee
            return r16
        L9ee:
            com.acse.ottn.d r1 = com.acse.ottn.d.d()
            r1.e(r0)
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.a(r5, r2)
            com.acse.ottn.f2.l(r0)
            return r16
        La02:
            r6 = r18
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            java.lang.String r3 = "allow_button"
            boolean r2 = r2.a(r3)
            if (r2 != 0) goto La11
            return r16
        La11:
            java.lang.String r2 = "1"
            com.acse.ottn.z4.f2919c = r2
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r2.a(r3, r4)
            com.acse.ottn.b r2 = com.acse.ottn.b.c()
            com.acse.ottn.t0 r3 = com.acse.ottn.t0.b()
            r4 = 100
            int r3 = r3.b(r4)
            long r3 = (long) r3
            r2.a(r3)
            com.acse.ottn.b r2 = com.acse.ottn.b.c()
            android.view.accessibility.AccessibilityNodeInfo r1 = r2.g(r0, r1)
            if (r1 == 0) goto La6b
            java.lang.String r2 = com.acse.ottn.g3.f2341b
            java.lang.String r3 = "找到允许"
            com.acse.ottn.h2.a(r2, r3)
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            java.lang.String r4 = "correlation_start"
            r2.a(r4, r3)
            com.acse.ottn.b r2 = com.acse.ottn.b.c()
            r2.g(r1)
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            com.acse.ottn.t0 r2 = com.acse.ottn.t0.b()
            r3 = 500(0x1f4, float:7.0E-43)
            int r2 = r2.b(r3)
            long r2 = (long) r2
            r1.a(r2)
            com.acse.ottn.z4.h(r0)
        La68:
            r16 = 1
            goto La73
        La6b:
            java.lang.String r0 = com.acse.ottn.g3.f2341b
            java.lang.String r1 = "info1 is null"
            com.acse.ottn.h2.a(r0, r1)
            goto La68
        La73:
            return r16
        La74:
            r6 = r18
            java.lang.String r1 = com.acse.ottn.n4.b()
            boolean r2 = r15.equals(r1)
            java.lang.String r3 = "battery_white_samsung"
            if (r2 == 0) goto La8d
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            boolean r2 = r2.a(r3)
            if (r2 != 0) goto La98
            return r16
        La8d:
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            boolean r2 = r2.a(r5)
            if (r2 != 0) goto La98
            return r16
        La98:
            java.lang.String r2 = com.acse.ottn.g3.f2341b
            java.lang.String r7 = "oppo location"
            com.acse.ottn.h2.a(r2, r7)
            com.acse.ottn.d r2 = com.acse.ottn.d.d()
            r2.e(r0)
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r2.a(r5, r7)
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            r2.a(r3, r7)
            boolean r2 = r10.equals(r1)
            if (r2 != 0) goto Lac8
            boolean r2 = r4.equals(r1)
            if (r2 != 0) goto Lac8
            boolean r2 = r9.equals(r1)
            if (r2 == 0) goto Lacb
        Lac8:
            r2 = 200(0xc8, double:9.9E-322)
            goto Lb0a
        Lacb:
            java.lang.String r2 = "huawei"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto Lafd
            java.lang.String r2 = "honor"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto Ladc
            goto Lafd
        Ladc:
            boolean r1 = r15.equals(r1)
            if (r1 == 0) goto Lafa
            java.lang.String r1 = com.acse.ottn.g3.f2341b
            java.lang.String r2 = "samsungoppo location"
            com.acse.ottn.h2.a(r1, r2)
            com.acse.ottn.d r1 = com.acse.ottn.d.d()
            r1.e(r0)
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            r1.a(r5, r7)
            com.acse.ottn.f2.d(r0)
        Lafa:
            r16 = 1
            goto Lb15
        Lafd:
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            r2 = 200(0xc8, double:9.9E-322)
            r1.a(r2)
            com.acse.ottn.f2.b(r0)
            goto Lafa
        Lb0a:
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            r1.a(r2)
            com.acse.ottn.f2.m(r0)
            goto Lafa
        Lb15:
            return r16
        Lb16:
            r6 = r18
            com.acse.ottn.s0 r1 = com.acse.ottn.s0.d()
            java.lang.String r1 = r1.a()
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            java.lang.String r3 = "notification_data"
            java.lang.String r2 = r2.e(r3)
            com.acse.ottn.n3 r4 = com.acse.ottn.n3.a()
            java.lang.String r5 = "0"
            java.lang.String r4 = r4.a(r3, r5)
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto Lb4a
            boolean r2 = r4.equals(r5)
            if (r2 == 0) goto Lb4a
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            r2.b(r3, r1)
            com.acse.ottn.s1.g(r0)
        Lb4a:
            r16 = 1
            return r16
        Lb4d:
            r6 = r18
            com.acse.ottn.z4.b()
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            boolean r1 = r1.a(r5)
            if (r1 != 0) goto Lb5d
            return r16
        Lb5d:
            com.acse.ottn.d r1 = com.acse.ottn.d.d()
            r1.e(r0)
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.a(r5, r2)
            com.acse.ottn.z4.d(r0)
            return r16
    }

    public boolean b() {
            r2 = this;
            java.lang.String r0 = com.acse.ottn.n4.b()
            java.lang.String r1 = "huawei"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L27
            java.lang.String r1 = "honor"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L27
            java.lang.String r1 = "tdtech"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L27
            java.lang.String r1 = "tyh612m"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L25
            goto L27
        L25:
            r0 = 0
            return r0
        L27:
            r0 = 1
            return r0
    }

    public boolean c() {
            r2 = this;
            java.lang.String r0 = com.acse.ottn.n4.b()
            java.lang.String r1 = "huawei"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L57
            java.lang.String r1 = "honor"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L57
            java.lang.String r1 = "oppo"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L57
            java.lang.String r1 = "vivo"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L57
            java.lang.String r1 = "xiaomi"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L57
            java.lang.String r1 = "redmi"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L57
            java.lang.String r1 = "realme"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L57
            java.lang.String r1 = "oneplus"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L57
            java.lang.String r1 = "blackshark"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L57
            java.lang.String r1 = "samsung"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L55
            goto L57
        L55:
            r0 = 0
            return r0
        L57:
            r0 = 1
            return r0
    }

    public boolean d() {
            r1 = this;
            boolean r0 = r1.e()
            if (r0 != 0) goto Lf
            boolean r0 = r1.c()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
    }

    public boolean e() {
            r2 = this;
            java.lang.String r0 = com.acse.ottn.n4.p()
            java.lang.String r1 = "tyh612m"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public final java.lang.Object f() throws java.io.ObjectStreamException {
            r1 = this;
            com.acse.ottn.g3 r0 = com.acse.ottn.g3.a
            return r0
    }
}
