package cn.jpush.android.local;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ActionHelper {
    private static final java.lang.String TAG = "ActionHelper";
    private static volatile cn.jpush.android.local.ActionHelper actionHelper;
    private static final java.lang.Object locker = null;
    private cn.jpush.android.local.JPushAction jPushAction;
    private cn.jpush.android.y.a loadedResource;
    int sequence;

    class a extends cn.jpush.android.ad.f {
        final /* synthetic */ cn.jpush.android.local.ActionHelper a;

        /* renamed from: b, reason: collision with root package name */
        private android.content.Context f1825b;

        /* renamed from: c, reason: collision with root package name */
        private java.lang.String f1826c;

        /* renamed from: d, reason: collision with root package name */
        private java.lang.Object f1827d;

        public a(cn.jpush.android.local.ActionHelper r1, android.content.Context r2, java.lang.String r3, java.lang.Object r4) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                r0.f1825b = r2
                r0.f1826c = r3
                r0.f1827d = r4
                java.lang.String r1 = "ActionHelper#Action"
                r0.f1674e = r1
                return
        }

        @Override // cn.jpush.android.ad.f
        public void a() {
                r4 = this;
                cn.jpush.android.local.ActionHelper r0 = r4.a     // Catch: java.lang.Throwable -> L16
                android.content.Context r1 = r4.f1825b     // Catch: java.lang.Throwable -> L16
                cn.jpush.android.local.ActionHelper.access$000(r0, r1)     // Catch: java.lang.Throwable -> L16
                cn.jpush.android.local.ActionHelper r0 = r4.a     // Catch: java.lang.Throwable -> L16
                cn.jpush.android.local.JPushAction r0 = cn.jpush.android.local.ActionHelper.access$100(r0)     // Catch: java.lang.Throwable -> L16
                android.content.Context r1 = r4.f1825b     // Catch: java.lang.Throwable -> L16
                java.lang.String r2 = r4.f1826c     // Catch: java.lang.Throwable -> L16
                java.lang.Object r3 = r4.f1827d     // Catch: java.lang.Throwable -> L16
                r0.handleAction(r1, r2, r3)     // Catch: java.lang.Throwable -> L16
            L16:
                return
        }
    }

    class b extends cn.jpush.android.ad.f {
        final /* synthetic */ cn.jpush.android.local.ActionHelper a;

        /* renamed from: b, reason: collision with root package name */
        private android.content.Context f1828b;

        /* renamed from: c, reason: collision with root package name */
        private java.lang.String f1829c;

        /* renamed from: d, reason: collision with root package name */
        private int f1830d;

        /* renamed from: f, reason: collision with root package name */
        private java.util.Set<java.lang.String> f1831f;

        /* renamed from: g, reason: collision with root package name */
        private cn.jpush.android.api.CallBackParams f1832g;

        public b(cn.jpush.android.local.ActionHelper r1, android.content.Context r2, java.lang.String r3, java.util.Set<java.lang.String> r4, int r5, cn.jpush.android.api.CallBackParams r6) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                r0.f1832g = r6
                r0.f1829c = r3
                r0.f1830d = r5
                r0.f1828b = r2
                r0.f1831f = r4
                java.lang.String r1 = "ActionHelper#TagAliasAction"
                r0.f1674e = r1
                return
        }

        @Override // cn.jpush.android.ad.f
        public void a() {
                r5 = this;
                cn.jpush.android.local.ActionHelper r0 = r5.a     // Catch: java.lang.Throwable -> L18
                android.content.Context r1 = r5.f1828b     // Catch: java.lang.Throwable -> L18
                cn.jpush.android.local.ActionHelper.access$000(r0, r1)     // Catch: java.lang.Throwable -> L18
                cn.jpush.android.local.ActionHelper r0 = r5.a     // Catch: java.lang.Throwable -> L18
                cn.jpush.android.local.JPushAction r0 = cn.jpush.android.local.ActionHelper.access$100(r0)     // Catch: java.lang.Throwable -> L18
                android.content.Context r1 = r5.f1828b     // Catch: java.lang.Throwable -> L18
                java.lang.String r2 = r5.f1829c     // Catch: java.lang.Throwable -> L18
                java.util.Set<java.lang.String> r3 = r5.f1831f     // Catch: java.lang.Throwable -> L18
                cn.jpush.android.api.CallBackParams r4 = r5.f1832g     // Catch: java.lang.Throwable -> L18
                r0.setAliasAndTags(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L18
            L18:
                return
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            cn.jpush.android.local.ActionHelper.locker = r0
            return
    }

    private ActionHelper() {
            r1 = this;
            r1.<init>()
            r0 = 10
            r1.sequence = r0
            return
    }

    static /* synthetic */ void access$000(cn.jpush.android.local.ActionHelper r0, android.content.Context r1) {
            r0.initLoad(r1)
            return
    }

    static /* synthetic */ cn.jpush.android.local.JPushAction access$100(cn.jpush.android.local.ActionHelper r0) {
            cn.jpush.android.local.JPushAction r0 = r0.jPushAction
            return r0
    }

    public static cn.jpush.android.local.ActionHelper getInstance() {
            cn.jpush.android.local.ActionHelper r0 = cn.jpush.android.local.ActionHelper.actionHelper
            if (r0 != 0) goto L19
            java.lang.Object r0 = cn.jpush.android.local.ActionHelper.locker
            monitor-enter(r0)
            cn.jpush.android.local.ActionHelper r1 = cn.jpush.android.local.ActionHelper.actionHelper     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            cn.jpush.android.local.ActionHelper r1 = new cn.jpush.android.local.ActionHelper     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            cn.jpush.android.local.ActionHelper.actionHelper = r1     // Catch: java.lang.Throwable -> L13
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
            cn.jpush.android.local.ActionHelper r0 = cn.jpush.android.local.ActionHelper.actionHelper
            return r0
    }

    private synchronized void initLoad(android.content.Context r6) {
            r5 = this;
            monitor-enter(r5)
            cn.jpush.android.local.JPushAction r0 = r5.jPushAction     // Catch: java.lang.Throwable -> L88
            if (r0 == 0) goto L7
            monitor-exit(r5)
            return
        L7:
            boolean r0 = cn.jpush.android.local.JPushConstants.SUPPORT_DY     // Catch: java.lang.Throwable -> L5a
            if (r0 == 0) goto L75
            int r0 = cn.jiguang.internal.JConstants.SDK_VERSION_INT     // Catch: java.lang.Throwable -> L5a
            r1 = 220(0xdc, float:3.08E-43)
            if (r0 < r1) goto L75
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L5a
            cn.jpush.android.y.a r6 = cn.jpush.android.y.a.a(r6)     // Catch: java.lang.Throwable -> L5a
            r5.loadedResource = r6     // Catch: java.lang.Throwable -> L5a
            java.lang.String r6 = "ActionHelper"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r2.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r3 = "load use time:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L5a
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L5a
            long r3 = r3 - r0
            r2.append(r3)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r0 = ",lr:"
            r2.append(r0)     // Catch: java.lang.Throwable -> L5a
            cn.jpush.android.y.a r0 = r5.loadedResource     // Catch: java.lang.Throwable -> L5a
            r2.append(r0)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L5a
            cn.jpush.android.helper.Logger.d(r6, r0)     // Catch: java.lang.Throwable -> L5a
            cn.jpush.android.y.a r6 = r5.loadedResource     // Catch: java.lang.Throwable -> L5a
            if (r6 == 0) goto L75
            java.lang.String r0 = "cn.p.jpush.JPushActionImpl"
            java.lang.Class r6 = r6.b(r0)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r0 = "ActionHelper"
            java.lang.String r1 = "load from cloud"
            cn.jpush.android.helper.Logger.d(r0, r1)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r6 = r6.newInstance()     // Catch: java.lang.Throwable -> L5a
            cn.jpush.android.local.JPushAction r6 = (cn.jpush.android.local.JPushAction) r6     // Catch: java.lang.Throwable -> L5a
            r5.jPushAction = r6     // Catch: java.lang.Throwable -> L5a
            goto L75
        L5a:
            r6 = move-exception
            java.lang.String r0 = "ActionHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L88
            r1.<init>()     // Catch: java.lang.Throwable -> L88
            java.lang.String r2 = "try l p failed:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L88
            java.lang.String r6 = r6.getMessage()     // Catch: java.lang.Throwable -> L88
            r1.append(r6)     // Catch: java.lang.Throwable -> L88
            java.lang.String r6 = r1.toString()     // Catch: java.lang.Throwable -> L88
            cn.jpush.android.helper.Logger.ww(r0, r6)     // Catch: java.lang.Throwable -> L88
        L75:
            cn.jpush.android.local.JPushAction r6 = r5.jPushAction     // Catch: java.lang.Throwable -> L88
            if (r6 != 0) goto L8a
            java.lang.String r6 = "ActionHelper"
            java.lang.String r0 = "load from local"
            cn.jpush.android.helper.Logger.d(r6, r0)     // Catch: java.lang.Throwable -> L88
            cn.jpush.android.l.a r6 = new cn.jpush.android.l.a     // Catch: java.lang.Throwable -> L88
            r6.<init>()     // Catch: java.lang.Throwable -> L88
            r5.jPushAction = r6     // Catch: java.lang.Throwable -> L88
            goto L8a
        L88:
            r6 = move-exception
            goto L8c
        L8a:
            monitor-exit(r5)
            return
        L8c:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L88
            throw r6
    }

    public java.lang.Object beforLogin(android.content.Context r2, java.lang.String r3, int r4, java.lang.String r5) {
            r1 = this;
            r1.initLoad(r2)
            cn.jpush.android.local.JPushAction r0 = r1.jPushAction
            if (r0 == 0) goto Lc
            java.lang.Object r2 = r0.beforLogin(r2, r3, r4, r5)
            return r2
        Lc:
            r2 = 0
            return r2
    }

    public void doAction(android.content.Context r3, java.lang.String r4, java.lang.Object r5) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "doAction:"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ActionHelper"
            cn.jpush.android.helper.Logger.dd(r1, r0)
            cn.jpush.android.local.ActionHelper$a r0 = new cn.jpush.android.local.ActionHelper$a
            r0.<init>(r2, r3, r4, r5)
            cn.jpush.android.helper.JCoreHelper.majorExecutor(r3, r1, r0)
            return
    }

    public void doSingleAction(android.content.Context r3, java.lang.String r4, java.lang.Object r5) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "doSingleAction: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ActionHelper"
            cn.jpush.android.helper.Logger.dd(r1, r0)
            cn.jpush.android.local.ActionHelper$a r0 = new cn.jpush.android.local.ActionHelper$a
            r0.<init>(r2, r3, r4, r5)
            cn.jpush.android.helper.JCoreHelper.futureExecutor(r3, r1, r0)
            return
    }

    public java.lang.Class getClassInPlugin(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "ActionHelper"
            cn.jpush.android.y.a r1 = r3.loadedResource     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L27
            java.lang.Class r4 = r1.b(r4)     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = "load class from p"
            cn.jpush.android.helper.Logger.d(r0, r1)     // Catch: java.lang.Throwable -> L12
            if (r4 == 0) goto L27
            return r4
        L12:
            r4 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[getClassInPlugin] error:"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            cn.jpush.android.helper.Logger.w(r0, r4)
        L27:
            r4 = 0
            return r4
    }

    public cn.jpush.android.local.ProxyActivityAction getPopWinActivity(android.content.Context r2) {
            r1 = this;
            r1.initLoad(r2)
            cn.jpush.android.local.JPushAction r0 = r1.jPushAction
            if (r0 == 0) goto Lc
            cn.jpush.android.local.ProxyActivityAction r2 = r0.getPopWinActivity(r2)
            return r2
        Lc:
            r2 = 0
            return r2
    }

    public cn.jpush.android.local.ProxyActivityAction getPushActivity(android.content.Context r2) {
            r1 = this;
            r1.initLoad(r2)
            cn.jpush.android.local.JPushAction r0 = r1.jPushAction
            if (r0 == 0) goto Lc
            cn.jpush.android.local.ProxyActivityAction r2 = r0.getPushActivity(r2)
            return r2
        Lc:
            r2 = 0
            return r2
    }

    public int getResourceID(android.content.Context r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r2 = this;
            cn.jpush.android.y.a r0 = r2.loadedResource
            java.lang.String r1 = "ActionHelper"
            if (r0 == 0) goto L1f
            int r3 = r0.a(r5, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "[getResourceID] try load:"
        L11:
            r4.append(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            cn.jpush.android.helper.Logger.d(r1, r4)
            return r3
        L1f:
            android.content.res.Resources r3 = r3.getResources()
            int r3 = r3.getIdentifier(r4, r5, r6)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "[getResourceID]:"
            goto L11
    }

    public java.lang.String getSdkVersion(java.lang.String r2) {
            r1 = this;
            cn.jpush.android.local.JPushAction r0 = r1.jPushAction
            if (r0 == 0) goto L9
            java.lang.String r2 = r0.getSdkVersion(r2)
            return r2
        L9:
            java.lang.String r2 = cn.jpush.android.local.JPushConstants.SDK_VERSION_NAME
            return r2
    }

    public void handleNotificationIntent(android.content.Context r2, android.content.Intent r3) {
            r1 = this;
            r1.initLoad(r2)
            cn.jpush.android.local.JPushAction r0 = r1.jPushAction
            if (r0 == 0) goto La
            r0.handleNotificationIntent(r2, r3)
        La:
            return
    }

    public boolean isSupportedCMD(java.lang.String r2, int r3) {
            r1 = this;
            cn.jpush.android.local.JPushAction r0 = r1.jPushAction
            if (r0 == 0) goto L9
            boolean r2 = r0.isSupportedCMD(r2, r3)
            return r2
        L9:
            r2 = 3
            if (r3 == r2) goto L33
            r2 = 29
            if (r3 == r2) goto L33
            r2 = 28
            if (r3 == r2) goto L33
            r2 = 27
            if (r3 == r2) goto L33
            r2 = 10
            if (r3 == r2) goto L33
            r2 = 26
            if (r3 == r2) goto L33
            r2 = 25
            if (r3 == r2) goto L33
            r2 = 34
            if (r3 == r2) goto L33
            r2 = 36
            if (r3 == r2) goto L33
            r2 = 37
            if (r3 != r2) goto L31
            goto L33
        L31:
            r2 = 0
            return r2
        L33:
            r2 = 1
            return r2
    }

    public void onActivityLifeCallback(android.app.Activity r2, java.lang.String r3) {
            r1 = this;
            if (r2 == 0) goto L9
            cn.jpush.android.local.JPushAction r0 = r1.jPushAction
            if (r0 == 0) goto L9
            r0.onActivityLifeCallback(r2, r3)
        L9:
            return
    }

    public void onEvent(java.lang.Thread r8, java.lang.Throwable r9) {
            r7 = this;
            r0 = 2
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r0 = 0
            r6[r0] = r8
            r8 = 1
            r6[r8] = r9
            r1 = 0
            java.lang.String r2 = "JPUSH"
            r3 = 93
            r4 = 0
            r5 = 0
            cn.jiguang.api.JCoreManager.onEvent(r1, r2, r3, r4, r5, r6)
            return
    }

    public void onInAppMessageClick(android.content.Context r2, cn.jpush.android.api.NotificationMessage r3) {
            r1 = this;
            r1.initLoad(r2)
            cn.jpush.android.local.JPushAction r0 = r1.jPushAction
            if (r0 == 0) goto La
            r0.onInAppMessageClick(r2, r3)
        La:
            return
    }

    public void onInAppMessageShow(android.content.Context r2, cn.jpush.android.api.NotificationMessage r3) {
            r1 = this;
            r1.initLoad(r2)
            cn.jpush.android.local.JPushAction r0 = r1.jPushAction
            if (r0 == 0) goto La
            r0.onInAppMessageShow(r2, r3)
        La:
            return
    }

    public void onJPushMessageReceive(android.content.Context r2, cn.jpush.android.service.JPushMessageReceiver r3, android.content.Intent r4) {
            r1 = this;
            r1.initLoad(r2)
            cn.jpush.android.local.JPushAction r0 = r1.jPushAction
            if (r0 == 0) goto La
            r0.onJPushMessageReceive(r2, r3, r4)
        La:
            return
    }

    public void onJPushMessageReceive(android.content.Context r2, java.lang.String r3, java.lang.String r4, android.os.Bundle r5) {
            r1 = this;
            r1.initLoad(r2)
            cn.jpush.android.local.JPushAction r0 = r1.jPushAction
            if (r0 == 0) goto La
            r0.onJPushMessageReceive(r2, r3, r4, r5)
        La:
            return
    }

    public void onMessage(android.content.Context r2, cn.jpush.android.api.CustomMessage r3) {
            r1 = this;
            r1.initLoad(r2)
            cn.jpush.android.local.JPushAction r0 = r1.jPushAction
            if (r0 == 0) goto La
            r0.onMessage(r2, r3)
        La:
            return
    }

    public void onMultiAction(android.content.Context r2, android.content.Intent r3) {
            r1 = this;
            r1.initLoad(r2)
            cn.jpush.android.local.JPushAction r0 = r1.jPushAction
            if (r0 == 0) goto La
            r0.onMultiAction(r2, r3)
        La:
            return
    }

    public void onNotifyMessageArrived(android.content.Context r2, cn.jpush.android.api.NotificationMessage r3) {
            r1 = this;
            r1.initLoad(r2)
            cn.jpush.android.local.JPushAction r0 = r1.jPushAction
            if (r0 == 0) goto La
            r0.onNotifyMessageArrived(r2, r3)
        La:
            return
    }

    public void onNotifyMessageOpened(android.content.Context r2, cn.jpush.android.api.NotificationMessage r3) {
            r1 = this;
            r1.initLoad(r2)
            cn.jpush.android.local.JPushAction r0 = r1.jPushAction
            if (r0 == 0) goto La
            r0.onNotifyMessageOpened(r2, r3)
        La:
            return
    }

    public void onTagAliasResponse(android.content.Context r7, long r8, int r10, android.content.Intent r11) {
            r6 = this;
            r6.initLoad(r7)
            cn.jpush.android.local.JPushAction r0 = r6.jPushAction
            if (r0 == 0) goto Le
            r1 = r7
            r2 = r8
            r4 = r10
            r5 = r11
            r0.onTagAliasResponse(r1, r2, r4, r5)
        Le:
            return
    }

    public void setAliasAndTagsWithCallBack(android.content.Context r9, java.lang.String r10, java.util.Set<java.lang.String> r11, cn.jpush.android.api.TagAliasCallback r12, int r13, int r14) {
            r8 = this;
            cn.jpush.android.api.CallBackParams r0 = new cn.jpush.android.api.CallBackParams
            long r4 = java.lang.System.currentTimeMillis()
            r1 = r10
            r2 = r11
            r3 = r12
            r6 = r13
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r6, r7)
            cn.jpush.android.local.ActionHelper$b r10 = new cn.jpush.android.local.ActionHelper$b
            r5 = 0
            r6 = r0
            r3 = r1
            r4 = r2
            r1 = r8
            r2 = r9
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.lang.String r9 = "ActionHelper"
            cn.jpush.android.helper.JCoreHelper.majorExecutor(r2, r9, r0)
            return
    }

    public void setAliasWithCallBack(android.content.Context r8, int r9, java.lang.String r10, int r11, int r12) {
            r7 = this;
            cn.jpush.android.api.CallBackParams r0 = new cn.jpush.android.api.CallBackParams
            long r3 = java.lang.System.currentTimeMillis()
            r1 = r9
            r2 = r10
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r5, r6)
            cn.jpush.android.local.ActionHelper$b r9 = new cn.jpush.android.local.ActionHelper$b
            r4 = 0
            r6 = r0
            r5 = r1
            r3 = r2
            r1 = r7
            r2 = r8
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.lang.String r8 = "ActionHelper"
            cn.jpush.android.helper.JCoreHelper.majorExecutor(r2, r8, r0)
            return
    }

    public void setPropertyWithCallBack(android.content.Context r8, int r9, java.util.Map<java.lang.String, java.lang.Object> r10, int r11, int r12) {
            r7 = this;
            cn.jpush.android.api.CallBackParams r0 = new cn.jpush.android.api.CallBackParams
            long r3 = java.lang.System.currentTimeMillis()
            r1 = r9
            r2 = r10
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r5, r6)
            cn.jpush.android.local.ActionHelper$b r9 = new cn.jpush.android.local.ActionHelper$b
            r3 = 0
            r4 = 0
            r2 = r8
            r6 = r0
            r5 = r1
            r1 = r7
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.lang.String r8 = "ActionHelper"
            cn.jpush.android.helper.JCoreHelper.majorExecutor(r2, r8, r0)
            return
    }

    public void setPushStatusWithCallBack(android.content.Context r11, int r12, int r13) {
            r10 = this;
            int r0 = r10.sequence
            int r2 = r0 + 1
            r10.sequence = r2
            cn.jpush.android.api.CallBackParams r1 = new cn.jpush.android.api.CallBackParams
            long r3 = java.lang.System.currentTimeMillis()
            r5 = r12
            r6 = r13
            r1.<init>(r2, r3, r5, r6)
            cn.jpush.android.local.ActionHelper$b r3 = new cn.jpush.android.local.ActionHelper$b
            r7 = 0
            int r8 = r10.sequence
            r6 = 0
            r4 = r10
            r5 = r11
            r9 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            java.lang.String r11 = "ActionHelper"
            cn.jpush.android.helper.JCoreHelper.majorExecutor(r5, r11, r3)
            return
    }

    public void setTagsWithCallBack(android.content.Context r8, int r9, java.util.Set<java.lang.String> r10, int r11, int r12) {
            r7 = this;
            cn.jpush.android.api.CallBackParams r0 = new cn.jpush.android.api.CallBackParams
            long r3 = java.lang.System.currentTimeMillis()
            r1 = r9
            r2 = r10
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r5, r6)
            cn.jpush.android.local.ActionHelper$b r9 = new cn.jpush.android.local.ActionHelper$b
            r3 = 0
            r6 = r0
            r5 = r1
            r4 = r2
            r1 = r7
            r2 = r8
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.lang.String r8 = "ActionHelper"
            cn.jpush.android.helper.JCoreHelper.majorExecutor(r2, r8, r0)
            return
    }
}
