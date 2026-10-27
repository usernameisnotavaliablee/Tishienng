package com.acse.ottn.service;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ShopHelperService extends android.accessibilityservice.AccessibilityService {
    private static java.lang.String TAG = "acse_ShopHelperService";
    public static com.acse.ottn.service.ShopHelperService mService;
    java.lang.String activityName;

    static {
            r0 = 10051(0x2743, float:1.4084E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public ShopHelperService() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.activityName = r0
            return
    }

    private boolean getCurrentAppLocation(java.lang.String r5) {
            r4 = this;
            r5.getClass()
            int r0 = r5.hashCode()
            r1 = 1
            r2 = 0
            r3 = -1
            switch(r0) {
                case -1941262704: goto L3a;
                case -1846082740: goto L2f;
                case 1375384955: goto L24;
                case 1510229602: goto L19;
                case 1694260435: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L44
        Le:
            java.lang.String r0 = "com.hihonor.android.launcher.unihome.UniHomeLauncher"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L17
            goto L44
        L17:
            r3 = 4
            goto L44
        L19:
            java.lang.String r0 = "com.android.launcher.Launcher"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L22
            goto L44
        L22:
            r3 = 3
            goto L44
        L24:
            java.lang.String r0 = "com.huawei.android.launcher.unihome.UniHomeLauncher"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L2d
            goto L44
        L2d:
            r3 = 2
            goto L44
        L2f:
            java.lang.String r0 = "com.bbk.launcher2.Launcher"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L38
            goto L44
        L38:
            r3 = 1
            goto L44
        L3a:
            java.lang.String r0 = "com.miui.home.launcher.Launcher"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L43
            goto L44
        L43:
            r3 = 0
        L44:
            switch(r3) {
                case 0: goto L48;
                case 1: goto L48;
                case 2: goto L48;
                case 3: goto L48;
                case 4: goto L48;
                default: goto L47;
            }
        L47:
            return r2
        L48:
            return r1
    }

    public static boolean isStart() {
            com.acse.ottn.service.ShopHelperService r0 = com.acse.ottn.service.ShopHelperService.mService
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // android.accessibilityservice.AccessibilityService
    public void onAccessibilityEvent(android.view.accessibility.AccessibilityEvent r4) {
            r3 = this;
            int r0 = r4.getEventType()
            if (r0 == 0) goto L12d
            r1 = 1
            if (r0 == r1) goto L125
            r1 = 2
            if (r0 == r1) goto L11d
            switch(r0) {
                case 4: goto L115;
                case 8: goto L125;
                case 16: goto L10d;
                case 32: goto Lfe;
                case 64: goto Lf6;
                case 128: goto Lee;
                case 256: goto Le6;
                case 500: goto Lde;
                case 512: goto Ld6;
                case 1024: goto Lce;
                case 4096: goto Lc6;
                case 8192: goto L60;
                case 16384: goto L58;
                case 32768: goto L50;
                case 65536: goto L48;
                case 131072: goto L40;
                case 262144: goto L38;
                case 524288: goto L30;
                case 1048576: goto L28;
                case 2097152: goto L20;
                case 4194304: goto L11;
                default: goto Lf;
            }
        Lf:
            goto Lc5
        L11:
            java.lang.String r4 = com.acse.ottn.service.ShopHelperService.TAG
            java.lang.String r0 = "TYPE_WINDOWS_CHANGED"
            com.acse.ottn.h2.a(r4, r0)
            com.acse.ottn.d r4 = com.acse.ottn.d.d()
            r4.h(r3)
            return
        L20:
            java.lang.String r4 = com.acse.ottn.service.ShopHelperService.TAG
            java.lang.String r0 = "TYPE_TOUCH_INTERACTION_END"
            com.acse.ottn.h2.a(r4, r0)
            return
        L28:
            java.lang.String r4 = com.acse.ottn.service.ShopHelperService.TAG
            java.lang.String r0 = "TYPE_TOUCH_INTERACTION_START"
            com.acse.ottn.h2.a(r4, r0)
            return
        L30:
            java.lang.String r4 = com.acse.ottn.service.ShopHelperService.TAG
            java.lang.String r0 = "TYPE_GESTURE_DETECTION_END"
            com.acse.ottn.h2.a(r4, r0)
            return
        L38:
            java.lang.String r4 = com.acse.ottn.service.ShopHelperService.TAG
            java.lang.String r0 = "TYPE_GESTURE_DETECTION_START"
            com.acse.ottn.h2.a(r4, r0)
            return
        L40:
            java.lang.String r4 = com.acse.ottn.service.ShopHelperService.TAG
            java.lang.String r0 = "TYPE_VIEW_TEXT_TRAVERSED_AT_MOVEMENT_GRANULARITY"
            com.acse.ottn.h2.a(r4, r0)
            return
        L48:
            java.lang.String r4 = com.acse.ottn.service.ShopHelperService.TAG
            java.lang.String r0 = "TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED"
            com.acse.ottn.h2.a(r4, r0)
            return
        L50:
            java.lang.String r4 = com.acse.ottn.service.ShopHelperService.TAG
            java.lang.String r0 = "TYPE_VIEW_ACCESSIBILITY_FOCUSED"
            com.acse.ottn.h2.a(r4, r0)
            return
        L58:
            java.lang.String r4 = com.acse.ottn.service.ShopHelperService.TAG
            java.lang.String r0 = "TYPE_ANNOUNCEMENT"
            com.acse.ottn.h2.a(r4, r0)
            return
        L60:
            java.lang.String r0 = com.acse.ottn.service.ShopHelperService.TAG
            java.lang.String r1 = "TYPE_VIEW_TEXT_SELECTION_CHANGED"
            com.acse.ottn.h2.a(r0, r1)
            boolean r0 = com.acse.ottn.activity.AcseHelpManager.mIsDebug
            if (r0 == 0) goto Lc5
            java.lang.String r0 = com.acse.ottn.service.ShopHelperService.TAG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "当前页面--》"
            r1.append(r2)
            java.lang.CharSequence r2 = r4.getPackageName()
            r1.append(r2)
            java.lang.String r2 = "----"
            r1.append(r2)
            java.lang.CharSequence r2 = r4.getClassName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.acse.ottn.h2.a(r0, r1)
            java.lang.CharSequence r0 = r4.getPackageName()
            if (r0 == 0) goto Lc5
            java.lang.CharSequence r0 = r4.getClassName()
            if (r0 == 0) goto Lc5
            java.lang.CharSequence r0 = r4.getPackageName()
            java.lang.String r1 = "com.tencent.mm"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lc5
            java.lang.CharSequence r4 = r4.getClassName()
            java.lang.String r0 = "android.widget.TextView"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto Lc5
            com.acse.ottn.b r4 = com.acse.ottn.b.c()
            r0 = 2000(0x7d0, double:9.88E-321)
            r4.a(r0)
            com.acse.ottn.d r4 = com.acse.ottn.d.d()
            r4.e()
        Lc5:
            return
        Lc6:
            com.acse.ottn.d4 r4 = com.acse.ottn.d4.c()
            r4.a(r3)
            return
        Lce:
            java.lang.String r4 = com.acse.ottn.service.ShopHelperService.TAG
            java.lang.String r0 = "TYPE_TOUCH_EXPLORATION_GESTURE_END"
            com.acse.ottn.h2.a(r4, r0)
            return
        Ld6:
            java.lang.String r4 = com.acse.ottn.service.ShopHelperService.TAG
            java.lang.String r0 = "TYPE_TOUCH_EXPLORATION_GESTURE_START"
            com.acse.ottn.h2.a(r4, r0)
            return
        Lde:
            java.lang.String r4 = com.acse.ottn.service.ShopHelperService.TAG
            java.lang.String r0 = "MAX_TEXT_LENGTH"
            com.acse.ottn.h2.a(r4, r0)
            return
        Le6:
            java.lang.String r4 = com.acse.ottn.service.ShopHelperService.TAG
            java.lang.String r0 = "TYPE_VIEW_HOVER_EXIT"
            com.acse.ottn.h2.a(r4, r0)
            return
        Lee:
            java.lang.String r4 = com.acse.ottn.service.ShopHelperService.TAG
            java.lang.String r0 = "TYPE_VIEW_HOVER_ENTER"
            com.acse.ottn.h2.a(r4, r0)
            return
        Lf6:
            java.lang.String r4 = com.acse.ottn.service.ShopHelperService.TAG
            java.lang.String r0 = "TYPE_NOTIFICATION_STATE_CHANGED"
            com.acse.ottn.h2.a(r4, r0)
            return
        Lfe:
            java.lang.String r0 = com.acse.ottn.service.ShopHelperService.TAG
            java.lang.String r1 = "TYPE_WINDOW_STATE_CHANGED"
            com.acse.ottn.h2.a(r0, r1)
            com.acse.ottn.d r0 = com.acse.ottn.d.d()
            r0.a(r3, r4)
            return
        L10d:
            java.lang.String r4 = com.acse.ottn.service.ShopHelperService.TAG
            java.lang.String r0 = "TYPE_VIEW_TEXT_CHANGED"
            com.acse.ottn.h2.a(r4, r0)
            return
        L115:
            java.lang.String r4 = com.acse.ottn.service.ShopHelperService.TAG
            java.lang.String r0 = "TYPE_VIEW_SELECTED"
            com.acse.ottn.h2.a(r4, r0)
            return
        L11d:
            java.lang.String r4 = com.acse.ottn.service.ShopHelperService.TAG
            java.lang.String r0 = "TYPE_VIEW_LONG_CLICKED"
            com.acse.ottn.h2.a(r4, r0)
            return
        L125:
            com.acse.ottn.d r0 = com.acse.ottn.d.d()
            r0.b(r3, r4)
            return
        L12d:
            java.lang.String r4 = com.acse.ottn.service.ShopHelperService.TAG
            java.lang.String r0 = "CONTENT_CHANGE_TYPE_UNDEFINED"
            com.acse.ottn.h2.a(r4, r0)
            return
    }

    @Override // android.app.Service
    public void onDestroy() {
            r2 = this;
            super.onDestroy()
            java.lang.String r0 = com.acse.ottn.service.ShopHelperService.TAG
            java.lang.String r1 = "关闭"
            com.acse.ottn.h2.a(r0, r1)
            r0 = 0
            com.acse.ottn.service.ShopHelperService.mService = r0
            return
    }

    @Override // android.accessibilityservice.AccessibilityService
    public void onInterrupt() {
            r2 = this;
            r0 = 0
            com.acse.ottn.service.ShopHelperService.mService = r0
            java.lang.String r0 = com.acse.ottn.service.ShopHelperService.TAG
            java.lang.String r1 = "断开"
            com.acse.ottn.h2.a(r0, r1)
            return
    }

    @Override // android.accessibilityservice.AccessibilityService
    public void onServiceConnected() {
            r2 = this;
            com.acse.ottn.service.ShopHelperService.mService = r2
            java.lang.String r0 = com.acse.ottn.service.ShopHelperService.TAG
            java.lang.String r1 = "被锁定"
            com.acse.ottn.h2.a(r0, r1)
            super.onServiceConnected()
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            if (r0 != 0) goto L22
            com.acse.ottn.activity.AcseHelpManager$InitSdk r0 = new com.acse.ottn.activity.AcseHelpManager$InitSdk
            r0.<init>()
            android.app.Application r1 = r2.getApplication()
            com.acse.ottn.activity.AcseHelpManager$InitSdk r0 = r0.setContext(r1)
            r0.build()
        L22:
            com.acse.ottn.d r0 = com.acse.ottn.d.d()
            r0.e(r2)
            com.acse.ottn.d r0 = com.acse.ottn.d.d()
            r0.a(r2)
            return
    }

    @Override // android.app.Service
    public boolean onUnbind(android.content.Intent r3) {
            r2 = this;
            java.lang.String r0 = com.acse.ottn.service.ShopHelperService.TAG
            java.lang.String r1 = "onUnbind"
            com.acse.ottn.h2.a(r0, r1)
            boolean r3 = super.onUnbind(r3)
            return r3
    }
}
