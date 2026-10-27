package com.bxkj.base.chat.heart;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class AlarmChatService extends android.app.Service {
    private com.bxkj.base.chat.heart.b a;
    private long b;
    private android.content.BroadcastReceiver c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends android.content.BroadcastReceiver {
        final /* synthetic */ com.bxkj.base.chat.heart.AlarmChatService a;

        a(com.bxkj.base.chat.heart.AlarmChatService r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r3, android.content.Intent r4) {
                r2 = this;
                java.lang.String r3 = r4.getAction()
                java.lang.String r0 = "NOTIFY_HEART_CALLBACK_SUCCESS"
                boolean r3 = r3.equalsIgnoreCase(r0)
                if (r3 == 0) goto L1e
                com.bxkj.base.chat.heart.AlarmChatService r3 = r2.a
                long r0 = java.lang.System.currentTimeMillis()
                r3.d(r0)
                com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
                r4 = 1
                r3.setChatConnectStatus(r4)
                return
            L1e:
                java.lang.String r3 = r4.getAction()
                java.lang.String r4 = "NOTIFY_CONNECT_CLOSE"
                boolean r3 = r3.equalsIgnoreCase(r4)
                if (r3 == 0) goto L3b
                com.bxkj.base.chat.heart.AlarmChatService r3 = r2.a
                com.bxkj.base.chat.heart.b r3 = com.bxkj.base.chat.heart.AlarmChatService.a(r3)
                if (r3 == 0) goto L3b
                com.bxkj.base.chat.heart.AlarmChatService r3 = r2.a
                com.bxkj.base.chat.heart.b r3 = com.bxkj.base.chat.heart.AlarmChatService.a(r3)
                r3.a()
            L3b:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.base.chat.heart.AlarmChatService a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a extends java.lang.Thread {
            final /* synthetic */ java.util.Map a;
            final /* synthetic */ com.bxkj.base.chat.heart.AlarmChatService.b b;

            a(com.bxkj.base.chat.heart.AlarmChatService.b r1, java.util.Map r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                    r5 = this;
                    com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
                    java.util.Map r1 = r5.a
                    java.lang.String r2 = "collectPhoto"
                    java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
                    r0.setHeadImageUrl(r1)
                    java.util.Map r0 = r5.a
                    java.lang.String r1 = "school"
                    java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
                    com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
                    r1.setSchoolCode(r0)
                    a3.b r1 = a3.a.a()
                    com.bxkj.base.BaseApp r2 = com.bxkj.base.BaseApp.c()
                    r1.g(r2)
                    java.util.Map r1 = r5.a
                    java.lang.String r2 = "serverIp"
                    java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
                    java.util.Map r2 = r5.a
                    java.lang.String r3 = "port"
                    java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)
                    boolean r3 = android.text.TextUtils.isEmpty(r1)
                    if (r3 != 0) goto L84
                    boolean r3 = android.text.TextUtils.isEmpty(r2)
                    if (r3 != 0) goto L84
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 == 0) goto L4c
                    goto L84
                L4c:
                    a3.b r0 = a3.a.a()     // Catch: java.lang.Exception -> L63
                    com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()     // Catch: java.lang.Exception -> L63
                    java.lang.String r3 = r3.getUserId()     // Catch: java.lang.Exception -> L63
                    com.bxkj.base.user.LoginUser r4 = com.bxkj.base.user.LoginUser.getLoginUser()     // Catch: java.lang.Exception -> L63
                    java.lang.String r4 = r4.getSchoolCode()     // Catch: java.lang.Exception -> L63
                    r0.d(r3, r4, r1, r2)     // Catch: java.lang.Exception -> L63
                L63:
                    com.bxkj.base.chat.heart.AlarmChatService$b r0 = r5.b
                    com.bxkj.base.chat.heart.AlarmChatService r0 = r0.a
                    com.bxkj.base.chat.heart.b r1 = new com.bxkj.base.chat.heart.b
                    com.bxkj.base.BaseApp r2 = com.bxkj.base.BaseApp.c()
                    r1.<init>(r2)
                    com.bxkj.base.chat.heart.AlarmChatService.b(r0, r1)
                    com.bxkj.base.chat.heart.AlarmChatService$b r0 = r5.b
                    com.bxkj.base.chat.heart.AlarmChatService r0 = r0.a
                    com.bxkj.base.chat.heart.b r0 = com.bxkj.base.chat.heart.AlarmChatService.a(r0)
                    r0.b()
                    java.lang.String r0 = "连接聊天服务器"
                    com.orhanobut.logger.j.c(r0)
                    return
                L84:
                    com.bxkj.base.chat.heart.AlarmChatService$b r0 = r5.b
                    com.bxkj.base.chat.heart.AlarmChatService r0 = r0.a
                    r0.stopSelf()
                    java.lang.String r0 = "不进行连接"
                    com.orhanobut.logger.j.c(r0)
                    return
            }
        }

        b(com.bxkj.base.chat.heart.AlarmChatService r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2) {
                r1 = this;
                com.bxkj.base.chat.heart.AlarmChatService$b$a r0 = new com.bxkj.base.chat.heart.AlarmChatService$b$a
                r0.<init>(r1, r2)
                r0.start()
                return
        }
    }

    public AlarmChatService() {
            r1 = this;
            r1.<init>()
            com.bxkj.base.chat.heart.AlarmChatService$a r0 = new com.bxkj.base.chat.heart.AlarmChatService$a
            r0.<init>(r1)
            r1.c = r0
            return
    }

    static /* bridge */ /* synthetic */ com.bxkj.base.chat.heart.b a(com.bxkj.base.chat.heart.AlarmChatService r0) {
            com.bxkj.base.chat.heart.b r0 = r0.a
            return r0
    }

    static /* bridge */ /* synthetic */ void b(com.bxkj.base.chat.heart.AlarmChatService r0, com.bxkj.base.chat.heart.b r1) {
            r0.a = r1
            return
    }

    private void c() {
            r2 = this;
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideLoadingDialog()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideSuccessMessage()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideFailMessage()
            java.lang.Class<w.a> r1 = w.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.a r1 = (w.a) r1
            rx.e r1 = r1.d()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.base.chat.heart.AlarmChatService$b r1 = new com.bxkj.base.chat.heart.AlarmChatService$b
            r1.<init>(r2)
            r0.setDataListener(r1)
            return
    }

    public void d(long r2) {
            r1 = this;
            r1.b = r2
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            r0.setLastHeartCallBackTime(r2)
            return
    }

    @Override // android.app.Service
    @androidx.annotation.Nullable
    public android.os.IBinder onBind(android.content.Intent r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.app.Service
    public void onCreate() {
            r3 = this;
            super.onCreate()
            java.lang.String r0 = "AlarmChatService心跳服务重新创建"
            com.orhanobut.logger.j.c(r0)
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>()
            java.lang.String r1 = "NOTIFY_HEART_CALLBACK_SUCCESS"
            r0.addAction(r1)
            java.lang.String r1 = "NOTIFY_CONNECT_CLOSE"
            r0.addAction(r1)
            androidx.localbroadcastmanager.content.LocalBroadcastManager r1 = androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(r3)
            android.content.BroadcastReceiver r2 = r3.c
            r1.registerReceiver(r2, r0)
            return
    }

    @Override // android.app.Service
    public void onDestroy() {
            r2 = this;
            super.onDestroy()
            android.content.BroadcastReceiver r0 = r2.c
            if (r0 == 0) goto L10
            androidx.localbroadcastmanager.content.LocalBroadcastManager r0 = androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(r2)
            android.content.BroadcastReceiver r1 = r2.c
            r0.unregisterReceiver(r1)
        L10:
            return
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent r6, int r7, int r8) {
            r5 = this;
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            boolean r0 = r0.isLogin()
            if (r0 == 0) goto L83
            long r0 = java.lang.System.currentTimeMillis()
            boolean r2 = com.bxkj.base.BaseApp.g()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "心跳包"
            r3.append(r4)
            if (r2 == 0) goto L21
            java.lang.String r2 = "在后台"
            goto L23
        L21:
            java.lang.String r2 = "在前台"
        L23:
            r3.append(r2)
            java.lang.String r2 = "运行"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.orhanobut.logger.j.c(r2)
            a3.b r2 = a3.a.a()
            com.bxkj.base.BaseApp r3 = com.bxkj.base.BaseApp.c()
            r2.g(r3)
            long r2 = r5.b
            long r0 = r0 - r2
            r2 = 15000(0x3a98, double:7.411E-320)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L5e
            java.lang.String r0 = "超过15秒3此未收到心跳回调重连"
            com.orhanobut.logger.j.c(r0)
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            r1 = 0
            r0.setChatConnectStatus(r1)
            r5.c()
            long r0 = java.lang.System.currentTimeMillis()
            r5.d(r0)
            goto L83
        L5e:
            boolean r0 = com.bxkj.base.BaseApp.g()
            if (r0 == 0) goto L6c
            a3.b r0 = a3.a.a()
            r0.n()
            goto L73
        L6c:
            a3.b r0 = a3.a.a()
            r0.a()
        L73:
            com.bxkj.base.chat.heart.b r0 = r5.a
            if (r0 != 0) goto L7e
            com.bxkj.base.chat.heart.b r0 = new com.bxkj.base.chat.heart.b
            r0.<init>(r5)
            r5.a = r0
        L7e:
            com.bxkj.base.chat.heart.b r0 = r5.a
            r0.b()
        L83:
            int r6 = super.onStartCommand(r6, r7, r8)
            return r6
    }
}
