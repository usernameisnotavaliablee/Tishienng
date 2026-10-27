package com.acse.ottn.activity;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AcseHelpManager {
    private static android.app.Application mContext;
    public static boolean mIsDebug;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.acse.ottn.activity.AcseHelpManager$3, reason: invalid class name */
    public class AnonymousClass3 implements com.acse.ottn.activity.AcseHelpManager.OnOpenPermission {
        public final /* synthetic */ boolean a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ android.app.Activity f2089b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.activity.AcseHelpManager.OnCurrentStateCallBack f2090c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f2091d;


        public AnonymousClass3(boolean r1, android.app.Activity r2, com.acse.ottn.activity.AcseHelpManager.OnCurrentStateCallBack r3, boolean r4) {
                r0 = this;
                r0.a = r1
                r0.f2089b = r2
                r0.f2090c = r3
                r0.f2091d = r4
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.activity.AcseHelpManager.OnOpenPermission
        public void openPermission(boolean r2) {
                r1 = this;
                java.lang.String r0 = "0"
                if (r2 != 0) goto L11
                boolean r2 = r1.a
                if (r2 == 0) goto L9
                goto L11
            L9:
                com.acse.ottn.activity.AcseHelpManager$OnCurrentStateCallBack r2 = r1.f2090c
                if (r2 == 0) goto L29
                r2.onState(r0)
                return
            L11:
                boolean r2 = com.acse.ottn.activity.AcseHelpManager.isOPenPermission()
                if (r2 != 0) goto L22
                android.app.Activity r2 = r1.f2089b
                com.acse.ottn.activity.AcseHelpManager$3$1 r0 = new com.acse.ottn.activity.AcseHelpManager$3$1
                r0.<init>(r1)
                com.acse.ottn.activity.AcseHelpManager.showRunningDialog(r2, r0)
                return
            L22:
                com.acse.ottn.activity.AcseHelpManager$OnCurrentStateCallBack r2 = r1.f2090c
                if (r2 == 0) goto L29
                r2.onState(r0)
            L29:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.acse.ottn.activity.AcseHelpManager$4, reason: invalid class name */
    public class AnonymousClass4 implements com.acse.ottn.activity.AcseHelpManager.OnOpenPermission {
        public final /* synthetic */ android.app.Activity a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f2092b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f2093c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f2094d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f2095e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.activity.AcseHelpManager.OnCurrentStateCallBack f2096f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f2097g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f2098h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f2099i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f2100j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f2101k;


        public AnonymousClass4(android.app.Activity r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, com.acse.ottn.activity.AcseHelpManager.OnCurrentStateCallBack r6, boolean r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
                r0 = this;
                r0.a = r1
                r0.f2092b = r2
                r0.f2093c = r3
                r0.f2094d = r4
                r0.f2095e = r5
                r0.f2096f = r6
                r0.f2097g = r7
                r0.f2098h = r8
                r0.f2099i = r9
                r0.f2100j = r10
                r0.f2101k = r11
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.activity.AcseHelpManager.OnOpenPermission
        public void openPermission(boolean r8) {
                r7 = this;
                java.lang.String r0 = "0"
                if (r8 == 0) goto L25
                boolean r8 = com.acse.ottn.activity.AcseHelpManager.isOPenPermission()
                if (r8 != 0) goto L1d
                android.app.Activity r1 = r7.a
                java.lang.String r2 = r7.f2092b
                java.lang.String r3 = r7.f2093c
                java.lang.String r4 = r7.f2094d
                java.lang.String r5 = r7.f2095e
                com.acse.ottn.activity.AcseHelpManager$4$1 r6 = new com.acse.ottn.activity.AcseHelpManager$4$1
                r6.<init>(r7)
                com.acse.ottn.w3.a(r1, r2, r3, r4, r5, r6)
                return
            L1d:
                com.acse.ottn.activity.AcseHelpManager$OnCurrentStateCallBack r8 = r7.f2096f
                if (r8 == 0) goto L2c
                r8.onState(r0)
                return
            L25:
                com.acse.ottn.activity.AcseHelpManager$OnCurrentStateCallBack r8 = r7.f2096f
                if (r8 == 0) goto L2c
                r8.onState(r0)
            L2c:
                return
        }
    }




    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class InitSdk {
        public android.app.Application a;

        public InitSdk() {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* synthetic */ android.app.Application a(com.acse.ottn.activity.AcseHelpManager.InitSdk r0) {
                android.app.Application r0 = r0.a
                return r0
        }

        public void build() {
                r2 = this;
                com.acse.ottn.activity.AcseHelpManager r0 = new com.acse.ottn.activity.AcseHelpManager
                r1 = 0
                r0.<init>(r2, r1)
                android.app.Application r0 = com.acse.ottn.activity.AcseHelpManager.access$200()
                com.acse.ottn.util.HelpShopAppUtil.init(r0)
                com.acse.ottn.activity.AcseHelpManager.access$300()
                android.app.Application r0 = com.acse.ottn.activity.AcseHelpManager.access$200()
                boolean r0 = androidx.activity.k.a(r0)
                if (r0 == 0) goto L22
                android.app.Application r0 = com.acse.ottn.activity.AcseHelpManager.access$200()
                com.acse.ottn.m1.a(r0)
                return
            L22:
                java.lang.Error r0 = new java.lang.Error
                java.lang.String r1 = "shophelp SDK init activity manager throw a Error"
                r0.<init>(r1)
                throw r0
        }

        public com.acse.ottn.activity.AcseHelpManager.InitSdk setContext(android.app.Application r1) {
                r0 = this;
                r0.a = r1
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnAccessiblityStateCallBack {
        void onSuccess(java.lang.String r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnClickCallBack {
        void onClose();

        void onDismiss();

        void onOpen();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnCurrentStateCallBack {
        void onState(java.lang.String r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnIndividuationCallBack {
        void onIndividuationState(boolean r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnOpenPermission {
        void openPermission(boolean r1);
    }

    private AcseHelpManager(com.acse.ottn.activity.AcseHelpManager.InitSdk r1) {
            r0 = this;
            r0.<init>()
            android.app.Application r1 = com.acse.ottn.activity.AcseHelpManager.InitSdk.a(r1)
            com.acse.ottn.activity.AcseHelpManager.mContext = r1
            return
    }

    public /* synthetic */ AcseHelpManager(com.acse.ottn.activity.AcseHelpManager.InitSdk r1, com.acse.ottn.activity.AcseHelpManager.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static /* synthetic */ android.app.Application access$200() {
            android.app.Application r0 = com.acse.ottn.activity.AcseHelpManager.mContext
            return r0
    }

    public static /* synthetic */ boolean access$300() {
            boolean r0 = isApkInDebug()
            return r0
    }

    public static boolean checkAccessiblityState() {
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            boolean r0 = r0.e()
            return r0
    }

    public static boolean checkBatteryPermission() {
            java.lang.String r0 = com.acse.ottn.l0.w
            java.lang.String r1 = ""
            boolean r0 = r1.equals(r0)
            r1 = 1
            if (r0 == 0) goto Lc
            return r1
        Lc:
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            if (r0 != 0) goto L13
            return r1
        L13:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r0 <= r2) goto L24
            com.acse.ottn.b5 r0 = com.acse.ottn.b5.a()
            java.lang.String r1 = com.acse.ottn.l0.w
            boolean r0 = r0.b(r1)
            return r0
        L24:
            return r1
    }

    public static boolean checkFloatWindow() {
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            boolean r0 = r0.a()
            return r0
    }

    public static void closeAccessiblityPlugIn(android.app.Activity r7, com.acse.ottn.activity.AcseHelpManager.OnClickCallBack r8) {
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            if (r0 != 0) goto L16
            com.acse.ottn.activity.AcseHelpManager$InitSdk r0 = new com.acse.ottn.activity.AcseHelpManager$InitSdk
            r0.<init>()
            android.app.Application r1 = r7.getApplication()
            com.acse.ottn.activity.AcseHelpManager$InitSdk r0 = r0.setContext(r1)
            r0.build()
        L16:
            java.lang.String r4 = "保持开启"
            java.lang.String r5 = "关闭辅助"
            java.lang.String r2 = "关闭辅助功能:"
            java.lang.String r3 = "关闭辅助功能不会影响软件正常使用。但辅助功能可以优化运动轨迹，并能提高软件的稳定性，以及自动查找优惠信息。是否仍要关闭？"
            r1 = r7
            r6 = r8
            com.acse.ottn.q0.a(r1, r2, r3, r4, r5, r6)
            return
    }

    public static void closeAccessiblityPlugIn(android.app.Activity r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, com.acse.ottn.activity.AcseHelpManager.OnClickCallBack r7) {
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            if (r0 != 0) goto L16
            com.acse.ottn.activity.AcseHelpManager$InitSdk r0 = new com.acse.ottn.activity.AcseHelpManager$InitSdk
            r0.<init>()
            android.app.Application r1 = r2.getApplication()
            com.acse.ottn.activity.AcseHelpManager$InitSdk r0 = r0.setContext(r1)
            r0.build()
        L16:
            com.acse.ottn.q0.a(r2, r3, r4, r5, r6, r7)
            return
    }

    public static void close_remind() {
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            if (r0 != 0) goto L7
            return
        L7:
            com.acse.ottn.r1 r0 = com.acse.ottn.r1.c()
            r0.b()
            return
    }

    public static void customDialog(android.app.Activity r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, com.acse.ottn.activity.AcseHelpManager.OnClickCallBack r7) {
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            if (r0 != 0) goto L16
            com.acse.ottn.activity.AcseHelpManager$InitSdk r0 = new com.acse.ottn.activity.AcseHelpManager$InitSdk
            r0.<init>()
            android.app.Application r1 = r2.getApplication()
            com.acse.ottn.activity.AcseHelpManager$InitSdk r0 = r0.setContext(r1)
            r0.build()
        L16:
            com.acse.ottn.q0.a(r2, r3, r4, r5, r6, r7)
            return
    }

    public static java.lang.String getGoodsWelfare() {
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            if (r0 != 0) goto L9
            java.lang.String r0 = "1"
            return r0
        L9:
            com.acse.ottn.o1 r0 = com.acse.ottn.o1.c()
            java.lang.String r0 = r0.a()
            return r0
    }

    public static void getGoodsWelfare(android.app.Activity r1, com.acse.ottn.activity.AcseHelpManager.OnIndividuationCallBack r2) {
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            if (r0 != 0) goto L16
            com.acse.ottn.activity.AcseHelpManager$InitSdk r0 = new com.acse.ottn.activity.AcseHelpManager$InitSdk
            r0.<init>()
            android.app.Application r1 = r1.getApplication()
            com.acse.ottn.activity.AcseHelpManager$InitSdk r1 = r0.setContext(r1)
            r1.build()
        L16:
            com.acse.ottn.r1 r1 = com.acse.ottn.r1.c()
            r1.a(r2)
            return
    }

    public static void getGoodsWelfare(com.acse.ottn.activity.AcseHelpManager.OnIndividuationCallBack r1) {
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            if (r0 != 0) goto L7
            return
        L7:
            com.acse.ottn.r1 r0 = com.acse.ottn.r1.c()
            r0.a(r1)
            return
    }

    public static java.lang.String getPluninId() {
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            if (r0 != 0) goto L9
            java.lang.String r0 = ""
            return r0
        L9:
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            java.lang.String r0 = r0.d()
            return r0
    }

    public static java.lang.String getPluninId(android.app.Activity r1) {
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            if (r0 != 0) goto L16
            com.acse.ottn.activity.AcseHelpManager$InitSdk r0 = new com.acse.ottn.activity.AcseHelpManager$InitSdk
            r0.<init>()
            android.app.Application r1 = r1.getApplication()
            com.acse.ottn.activity.AcseHelpManager$InitSdk r1 = r0.setContext(r1)
            r1.build()
        L16:
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            java.lang.String r1 = r1.d()
            return r1
    }

    private static java.lang.String getProcessName(android.content.Context r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "activity"
            java.lang.Object r4 = r4.getSystemService(r1)     // Catch: java.lang.Exception -> L35
            android.app.ActivityManager r4 = (android.app.ActivityManager) r4     // Catch: java.lang.Exception -> L35
            if (r4 == 0) goto L35
            java.util.List r1 = r4.getRunningAppProcesses()     // Catch: java.lang.Exception -> L35
            if (r1 == 0) goto L35
            java.util.List r4 = r4.getRunningAppProcesses()     // Catch: java.lang.Exception -> L35
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Exception -> L35
        L1c:
            boolean r1 = r4.hasNext()     // Catch: java.lang.Exception -> L35
            if (r1 == 0) goto L35
            java.lang.Object r1 = r4.next()     // Catch: java.lang.Exception -> L35
            android.app.ActivityManager$RunningAppProcessInfo r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1     // Catch: java.lang.Exception -> L35
            if (r1 == 0) goto L1c
            int r2 = r1.pid     // Catch: java.lang.Exception -> L35
            int r3 = android.os.Process.myPid()     // Catch: java.lang.Exception -> L35
            if (r2 != r3) goto L1c
            java.lang.String r4 = r1.processName     // Catch: java.lang.Exception -> L35
            return r4
        L35:
            return r0
    }

    private static boolean isApkInDebug() {
            android.app.Application r0 = com.acse.ottn.activity.AcseHelpManager.mContext     // Catch: java.lang.Exception -> L20
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()     // Catch: java.lang.Exception -> L20
            int r0 = r0.flags     // Catch: java.lang.Exception -> L20
            r0 = r0 & 2
            if (r0 == 0) goto L1c
            android.app.Application r0 = com.acse.ottn.activity.AcseHelpManager.mContext     // Catch: java.lang.Exception -> L20
            java.lang.String r0 = r0.getPackageName()     // Catch: java.lang.Exception -> L20
            java.lang.String r1 = com.acse.ottn.l0.o     // Catch: java.lang.Exception -> L20
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L20
            if (r0 == 0) goto L1c
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            com.acse.ottn.activity.AcseHelpManager.mIsDebug = r0     // Catch: java.lang.Exception -> L20
            return r0
        L20:
            boolean r0 = com.acse.ottn.activity.AcseHelpManager.mIsDebug
            return r0
    }

    public static void isOPenPermission(android.app.Activity r2, com.acse.ottn.activity.AcseHelpManager.OnOpenPermission r3) {
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            if (r0 != 0) goto L16
            com.acse.ottn.activity.AcseHelpManager$InitSdk r0 = new com.acse.ottn.activity.AcseHelpManager$InitSdk
            r0.<init>()
            android.app.Application r1 = r2.getApplication()
            com.acse.ottn.activity.AcseHelpManager$InitSdk r0 = r0.setContext(r1)
            r0.build()
        L16:
            com.acse.ottn.activity.AcseHelpManager$1 r0 = new com.acse.ottn.activity.AcseHelpManager$1
            r0.<init>(r3)
            isShowRunningDialog(r2, r0)
            return
    }

    public static void isOPenPermission(com.acse.ottn.activity.AcseHelpManager.OnOpenPermission r1) {
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            if (r0 != 0) goto L7
            return
        L7:
            com.acse.ottn.activity.AcseHelpManager$2 r0 = new com.acse.ottn.activity.AcseHelpManager$2
            r0.<init>(r1)
            r1 = 0
            isShowRunningDialog(r1, r0)
            return
    }

    public static boolean isOPenPermission() {
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            com.acse.ottn.o1 r0 = com.acse.ottn.o1.c()
            boolean r0 = r0.f()
            if (r0 == 0) goto L1b
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            boolean r0 = r0.e()
            return r0
        L1b:
            r0 = 1
            return r0
    }

    private static void isShowRunningDialog(android.app.Activity r2, com.acse.ottn.activity.AcseHelpManager.OnOpenPermission r3) {
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            if (r0 != 0) goto L16
            com.acse.ottn.activity.AcseHelpManager$InitSdk r0 = new com.acse.ottn.activity.AcseHelpManager$InitSdk
            r0.<init>()
            android.app.Application r1 = r2.getApplication()
            com.acse.ottn.activity.AcseHelpManager$InitSdk r0 = r0.setContext(r1)
            r0.build()
        L16:
            com.acse.ottn.r1 r0 = com.acse.ottn.r1.c()
            r0.a(r2, r3)
            return
    }

    public static boolean isTargetProcess(android.app.Application r1) {
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()     // Catch: java.lang.Exception -> L20
            if (r0 != 0) goto L12
            com.acse.ottn.activity.AcseHelpManager$InitSdk r0 = new com.acse.ottn.activity.AcseHelpManager$InitSdk     // Catch: java.lang.Exception -> L20
            r0.<init>()     // Catch: java.lang.Exception -> L20
            com.acse.ottn.activity.AcseHelpManager$InitSdk r0 = r0.setContext(r1)     // Catch: java.lang.Exception -> L20
            r0.build()     // Catch: java.lang.Exception -> L20
        L12:
            java.lang.String r1 = getProcessName(r1)     // Catch: java.lang.Exception -> L20
            java.lang.String r0 = ".LoadingActivity"
            boolean r1 = r1.equals(r0)     // Catch: java.lang.Exception -> L20
            if (r1 == 0) goto L20
            r1 = 1
            return r1
        L20:
            r1 = 0
            return r1
    }

    public static void lon_lat() {
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.lang.String r1 = com.acse.ottn.util.HelpShopAppUtil.getHmKey()
            java.lang.String r2 = "ak"
            r0.put(r2, r1)
            com.acse.ottn.util.HelpShopAppUtil.getInstance()
            java.lang.String r1 = com.acse.ottn.util.HelpShopAppUtil.sessionExID()
            java.lang.String r2 = "sessionid"
            r0.put(r2, r1)
            com.acse.ottn.l1 r1 = new com.acse.ottn.l1
            r1.<init>()
            com.acse.ottn.t0 r2 = com.acse.ottn.t0.b()
            java.lang.String r3 = ""
            okhttp3.RequestBody r0 = r2.a(r0, r3)
            rx.e r0 = r1.h(r0)
            rx.h r1 = com.acse.ottn.io.reactivex.schedulers.Schedulers.newThread()
            rx.e r0 = r0.w5(r1)
            rx.h r1 = com.acse.ottn.i.a()
            rx.e r0 = r0.I3(r1)
            com.acse.ottn.activity.AcseHelpManager$6 r1 = new com.acse.ottn.activity.AcseHelpManager$6
            r1.<init>()
            com.acse.ottn.activity.AcseHelpManager$7 r2 = new com.acse.ottn.activity.AcseHelpManager$7
            r2.<init>()
            r0.u5(r1, r2)
            return
    }

    public static void openAccessiblityDialog(android.app.Activity r7, com.acse.ottn.activity.AcseHelpManager.OnClickCallBack r8) {
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            if (r0 != 0) goto L16
            com.acse.ottn.activity.AcseHelpManager$InitSdk r0 = new com.acse.ottn.activity.AcseHelpManager$InitSdk
            r0.<init>()
            android.app.Application r1 = r7.getApplication()
            com.acse.ottn.activity.AcseHelpManager$InitSdk r0 = r0.setContext(r1)
            r0.build()
        L16:
            java.lang.String r4 = "立即开启"
            java.lang.String r5 = "再想想"
            java.lang.String r2 = "提示:"
            java.lang.String r3 = "需要启用辅助功能，才能为您一键开启必要权限。"
            r1 = r7
            r6 = r8
            com.acse.ottn.q0.a(r1, r2, r3, r4, r5, r6)
            return
    }

    public static void openAccessiblityView(android.app.Activity r2) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.settings.ACCESSIBILITY_SETTINGS"
            r0.<init>(r1)
            r2.startActivity(r0)
            return
    }

    public static void openBatteryPermission(android.app.Activity r4) {
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            if (r0 != 0) goto L16
            com.acse.ottn.activity.AcseHelpManager$InitSdk r0 = new com.acse.ottn.activity.AcseHelpManager$InitSdk
            r0.<init>()
            android.app.Application r1 = r4.getApplication()
            com.acse.ottn.activity.AcseHelpManager$InitSdk r0 = r0.setContext(r1)
            r0.build()
        L16:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.settings.APPLICATION_DETAILS_SETTINGS"
            r0.<init>(r1)
            java.lang.String r1 = com.acse.ottn.l0.w
            java.lang.String r2 = "package"
            r3 = 0
            android.net.Uri r1 = android.net.Uri.fromParts(r2, r1, r3)
            r0.setData(r1)
            r4.startActivity(r0)     // Catch: java.lang.Exception -> L2c
        L2c:
            return
    }

    public static void openFloatWindow(android.app.Activity r3) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.settings.action.MANAGE_OVERLAY_PERMISSION"
            r0.<init>(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "package:"
            r1.append(r2)
            java.lang.String r2 = r3.getPackageName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.net.Uri r1 = android.net.Uri.parse(r1)
            r0.setData(r1)
            r3.startActivity(r0)
            return
    }

    public static void openWithOneButton(android.app.Activity r2, int r3, com.acse.ottn.activity.AcseHelpManager.OnCurrentStateCallBack r4) {
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            if (r0 != 0) goto L16
            com.acse.ottn.activity.AcseHelpManager$InitSdk r0 = new com.acse.ottn.activity.AcseHelpManager$InitSdk
            r0.<init>()
            android.app.Application r1 = r2.getApplication()
            com.acse.ottn.activity.AcseHelpManager$InitSdk r0 = r0.setContext(r1)
            r0.build()
        L16:
            boolean r0 = isOPenPermission()
            if (r0 != 0) goto L44
            java.lang.String r0 = com.acse.ottn.l0.f2439j
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            boolean r1 = r1.e()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L39
            com.acse.ottn.activity.AcseHelpManager$5 r0 = new com.acse.ottn.activity.AcseHelpManager$5
            r0.<init>(r4, r2, r3)
            openAccessiblityDialog(r2, r0)
            return
        L39:
            if (r4 == 0) goto L40
            java.lang.String r0 = "4"
            r4.onState(r0)
        L40:
            startAccessibilityIntroduceActivityForResult(r2, r3)
            return
        L44:
            if (r4 == 0) goto L4b
            java.lang.String r2 = "5"
            r4.onState(r2)
        L4b:
            return
    }

    private static void running(android.app.Activity r1, boolean r2, boolean r3, com.acse.ottn.activity.AcseHelpManager.OnCurrentStateCallBack r4) {
            com.acse.ottn.activity.AcseHelpManager$3 r0 = new com.acse.ottn.activity.AcseHelpManager$3
            r0.<init>(r3, r1, r4, r2)
            isShowRunningDialog(r1, r0)
            return
    }

    public static void setGoodsWelfare(android.app.Activity r1, java.lang.String r2) {
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            if (r0 != 0) goto L16
            com.acse.ottn.activity.AcseHelpManager$InitSdk r0 = new com.acse.ottn.activity.AcseHelpManager$InitSdk
            r0.<init>()
            android.app.Application r1 = r1.getApplication()
            com.acse.ottn.activity.AcseHelpManager$InitSdk r1 = r0.setContext(r1)
            r1.build()
        L16:
            com.acse.ottn.r1 r1 = com.acse.ottn.r1.c()
            r1.a(r2)
            return
    }

    public static void setGoodsWelfare(java.lang.String r1) {
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            if (r0 != 0) goto L7
            return
        L7:
            com.acse.ottn.r1 r0 = com.acse.ottn.r1.c()
            r0.a(r1)
            return
    }

    public static void setOpenWithOneButtonColorState(android.app.Activity r2, com.acse.ottn.activity.AcseHelpManager.OnCurrentStateCallBack r3) {
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            if (r0 != 0) goto L16
            com.acse.ottn.activity.AcseHelpManager$InitSdk r0 = new com.acse.ottn.activity.AcseHelpManager$InitSdk
            r0.<init>()
            android.app.Application r1 = r2.getApplication()
            com.acse.ottn.activity.AcseHelpManager$InitSdk r0 = r0.setContext(r1)
            r0.build()
        L16:
            com.acse.ottn.b r0 = com.acse.ottn.b.c()     // Catch: java.lang.Throwable -> L2b
            boolean r0 = r0.e()     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L2d
            com.acse.ottn.b r0 = com.acse.ottn.b.c()     // Catch: java.lang.Throwable -> L2b
            boolean r0 = r0.a()     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L37
            goto L2d
        L2b:
            goto L37
        L2d:
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L2b
            java.lang.Class<com.acse.ottn.service.StartProcreeService> r1 = com.acse.ottn.service.StartProcreeService.class
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L2b
            r2.startService(r0)     // Catch: java.lang.Throwable -> L2b
        L37:
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            java.lang.String r1 = "0"
            if (r2 <= r0) goto L53
            boolean r2 = isOPenPermission()
            if (r2 != 0) goto L4d
            if (r3 == 0) goto L58
            java.lang.String r2 = "1"
            r3.onState(r2)
            goto L58
        L4d:
            if (r3 == 0) goto L58
            r3.onState(r1)
            goto L58
        L53:
            if (r3 == 0) goto L58
            r3.onState(r1)
        L58:
            return
    }

    public static void showFrequentOperationDialog(android.app.Activity r2, com.acse.ottn.activity.AcseHelpManager.OnClickCallBack r3) {
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            if (r0 != 0) goto L16
            com.acse.ottn.activity.AcseHelpManager$InitSdk r0 = new com.acse.ottn.activity.AcseHelpManager$InitSdk
            r0.<init>()
            android.app.Application r1 = r2.getApplication()
            com.acse.ottn.activity.AcseHelpManager$InitSdk r0 = r0.setContext(r1)
            r0.build()
        L16:
            com.acse.ottn.a5.a(r2, r3)
            return
    }

    public static void showRunningDialog(android.app.Activity r2, com.acse.ottn.activity.AcseHelpManager.OnClickCallBack r3) {
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            if (r0 != 0) goto L16
            com.acse.ottn.activity.AcseHelpManager$InitSdk r0 = new com.acse.ottn.activity.AcseHelpManager$InitSdk
            r0.<init>()
            android.app.Application r1 = r2.getApplication()
            com.acse.ottn.activity.AcseHelpManager$InitSdk r0 = r0.setContext(r1)
            r0.build()
        L16:
            com.acse.ottn.w3.a(r2, r3)
            return
    }

    public static void showRunningDialog(android.app.Activity r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, com.acse.ottn.activity.AcseHelpManager.OnClickCallBack r7) {
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            if (r0 != 0) goto L16
            com.acse.ottn.activity.AcseHelpManager$InitSdk r0 = new com.acse.ottn.activity.AcseHelpManager$InitSdk
            r0.<init>()
            android.app.Application r1 = r2.getApplication()
            com.acse.ottn.activity.AcseHelpManager$InitSdk r0 = r0.setContext(r1)
            r0.build()
        L16:
            com.acse.ottn.w3.a(r2, r3, r4, r5, r6, r7)
            return
    }

    public static void showWarningDialog(android.app.Activity r2, com.acse.ottn.activity.AcseHelpManager.OnClickCallBack r3) {
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            if (r0 != 0) goto L16
            com.acse.ottn.activity.AcseHelpManager$InitSdk r0 = new com.acse.ottn.activity.AcseHelpManager$InitSdk
            r0.<init>()
            android.app.Application r1 = r2.getApplication()
            com.acse.ottn.activity.AcseHelpManager$InitSdk r0 = r0.setContext(r1)
            r0.build()
        L16:
            com.acse.ottn.a5.a(r2, r3)
            return
    }

    public static void showWarningDialog(android.app.Activity r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, com.acse.ottn.activity.AcseHelpManager.OnClickCallBack r7) {
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            if (r0 != 0) goto L16
            com.acse.ottn.activity.AcseHelpManager$InitSdk r0 = new com.acse.ottn.activity.AcseHelpManager$InitSdk
            r0.<init>()
            android.app.Application r1 = r2.getApplication()
            com.acse.ottn.activity.AcseHelpManager$InitSdk r0 = r0.setContext(r1)
            r0.build()
        L16:
            com.acse.ottn.a5.a(r2, r3, r4, r5, r6, r7)
            return
    }

    public static void startAccessibilityIntroduceActivityForResult(android.app.Activity r2, int r3) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity> r1 = com.acse.ottn.activity.AccessibiltyTsnPermissionGreenActivity.class
            r0.<init>(r2, r1)
            r2.startActivityForResult(r0, r3)
            return
    }

    public static void startRunning(android.app.Activity r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, boolean r22, com.acse.ottn.activity.AcseHelpManager.OnCurrentStateCallBack r23) {
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            if (r0 != 0) goto L16
            com.acse.ottn.activity.AcseHelpManager$InitSdk r0 = new com.acse.ottn.activity.AcseHelpManager$InitSdk
            r0.<init>()
            android.app.Application r1 = r13.getApplication()
            com.acse.ottn.activity.AcseHelpManager$InitSdk r0 = r0.setContext(r1)
            r0.build()
        L16:
            com.acse.ottn.activity.AcseHelpManager$4 r1 = new com.acse.ottn.activity.AcseHelpManager$4
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r9 = r18
            r10 = r19
            r11 = r20
            r12 = r21
            r8 = r22
            r7 = r23
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            isShowRunningDialog(r13, r1)
            return
    }

    public static void startRunning(android.app.Activity r2, boolean r3, com.acse.ottn.activity.AcseHelpManager.OnCurrentStateCallBack r4) {
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            if (r0 != 0) goto L16
            com.acse.ottn.activity.AcseHelpManager$InitSdk r0 = new com.acse.ottn.activity.AcseHelpManager$InitSdk
            r0.<init>()
            android.app.Application r1 = r2.getApplication()
            com.acse.ottn.activity.AcseHelpManager$InitSdk r0 = r0.setContext(r1)
            r0.build()
        L16:
            r0 = 0
            running(r2, r3, r0, r4)
            return
    }

    public static void startRunning(android.app.Activity r2, boolean r3, boolean r4, com.acse.ottn.activity.AcseHelpManager.OnCurrentStateCallBack r5) {
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            if (r0 != 0) goto L16
            com.acse.ottn.activity.AcseHelpManager$InitSdk r0 = new com.acse.ottn.activity.AcseHelpManager$InitSdk
            r0.<init>()
            android.app.Application r1 = r2.getApplication()
            com.acse.ottn.activity.AcseHelpManager$InitSdk r0 = r0.setContext(r1)
            r0.build()
        L16:
            running(r2, r3, r4, r5)
            return
    }

    public static void syncUserIdState(android.app.Activity r1, java.lang.String r2) {
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            if (r0 != 0) goto L16
            com.acse.ottn.activity.AcseHelpManager$InitSdk r0 = new com.acse.ottn.activity.AcseHelpManager$InitSdk
            r0.<init>()
            android.app.Application r1 = r1.getApplication()
            com.acse.ottn.activity.AcseHelpManager$InitSdk r1 = r0.setContext(r1)
            r1.build()
        L16:
            java.lang.String r1 = "0"
            syncUserIdState(r2, r1)
            return
    }

    public static void syncUserIdState(android.app.Activity r1, java.lang.String r2, java.lang.String r3) {
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            if (r0 != 0) goto L16
            com.acse.ottn.activity.AcseHelpManager$InitSdk r0 = new com.acse.ottn.activity.AcseHelpManager$InitSdk
            r0.<init>()
            android.app.Application r1 = r1.getApplication()
            com.acse.ottn.activity.AcseHelpManager$InitSdk r1 = r0.setContext(r1)
            r1.build()
        L16:
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            r1.a(r2)
            com.acse.ottn.b r1 = com.acse.ottn.b.c()
            r1.a(r2, r3)
            return
    }

    public static void syncUserIdState(java.lang.String r1) {
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r0 = "0"
            syncUserIdState(r1, r0)
            return
    }

    public static void syncUserIdState(java.lang.String r1, java.lang.String r2) {
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.getContext()
            if (r0 != 0) goto L7
            return
        L7:
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            r0.a(r1)
            com.acse.ottn.b r0 = com.acse.ottn.b.c()
            r0.a(r1, r2)
            return
    }
}
