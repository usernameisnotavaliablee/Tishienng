package com.umeng.socialize;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class a extends com.umeng.socialize.UMShareAPI {
    private final com.umeng.socialize.b.a a;





    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.umeng.socialize.a$a, reason: collision with other inner class name */
    private static class C0057a extends com.umeng.socialize.common.QueuedWork.UMAsyncTask<java.lang.Void> {
        private final android.content.Context a;
        private final boolean b;
        private final boolean c;

        public C0057a(android.content.Context r3) {
                r2 = this;
                r2.<init>()
                r2.a = r3
                long r0 = com.umeng.socialize.utils.SocializeSpUtils.getTime(r3)
                boolean r3 = com.umeng.socialize.utils.SocializeUtils.isToday(r0)
                r2.b = r3
                boolean r3 = com.umeng.socialize.utils.SocializeUtils.isHasDplusCache()
                r2.c = r3
                return
        }

        private boolean b() {
                r3 = this;
                android.content.Context r0 = r3.a
                java.lang.String r1 = "umeng_socialize"
                r2 = 0
                android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
                java.lang.String r1 = "newinstall"
                boolean r0 = r0.getBoolean(r1, r2)
                return r0
        }

        private void c() {
                r3 = this;
                android.content.Context r0 = r3.a
                java.lang.String r1 = "umeng_socialize"
                r2 = 0
                android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
                android.content.SharedPreferences$Editor r0 = r0.edit()
                java.lang.String r1 = "newinstall"
                r2 = 1
                r0.putBoolean(r1, r2)
                r0.commit()
                return
        }

        protected java.lang.Void a() {
                r8 = this;
                boolean r0 = r8.b()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = com.umeng.socialize.utils.UmengText.CHECK.SDKVERSION
                r1.append(r2)
                java.lang.String r2 = "7.3.2"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.umeng.socialize.utils.SLog.E(r1)
                boolean r1 = r8.b
                r2 = 1
                if (r1 != 0) goto L31
                android.content.Context r1 = r8.a
                com.umeng.socialize.utils.SocializeSpUtils.putTime(r1)
                android.content.Context r1 = com.umeng.socialize.utils.ContextUtil.getContext()
                com.umeng.socialize.net.dplus.DplusApi.uploadDAU(r1)
                android.content.Context r1 = r8.a
                com.umeng.socialize.net.analytics.SocialAnalytics.dauStats(r1, r2)
                goto L41
            L31:
                boolean r1 = r8.c
                if (r1 == 0) goto L41
                android.content.Context r1 = com.umeng.socialize.utils.ContextUtil.getContext()
                com.umeng.socialize.net.dplus.DplusApi.uploadDAU(r1)
                android.content.Context r1 = r8.a
                com.umeng.socialize.net.analytics.SocialAnalytics.dauStats(r1, r2)
            L41:
                android.content.Context r1 = r8.a
                com.umeng.socialize.net.analytics.SocialAnalytics.verifyStats(r1)
                if (r0 == 0) goto L57
                android.content.Context r2 = r8.a
                com.umeng.socialize.net.dplus.CommonNetImpl r4 = com.umeng.socialize.net.dplus.CommonNetImpl.get(r2)
                r5 = 0
                r6 = 10000(0x2710, double:4.9407E-320)
                r3 = 24594(0x6012, float:3.4464E-41)
                com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r2, r3, r4, r5, r6)
                goto L5a
            L57:
                r8.c()
            L5a:
                r0 = 0
                return r0
        }

        @Override // com.umeng.socialize.common.QueuedWork.UMAsyncTask
        protected /* synthetic */ java.lang.Void doInBackground() {
                r1 = this;
                java.lang.Void r0 = r1.a()
                return r0
        }
    }

    protected a(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            android.content.Context r0 = r3.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            com.umeng.socialize.utils.ContextUtil.setContext(r0)
            com.umeng.socialize.b.a r0 = new com.umeng.socialize.b.a
            android.content.Context r1 = r3.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            r0.<init>(r1)
            r2.a = r0
            java.lang.String r0 = com.umeng.commonsdk.framework.UMFrUtils.getCurrentProcessName(r3)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L41
            java.lang.String r1 = com.umeng.socialize.utils.ContextUtil.getPackageName()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L41
            com.umeng.socialize.a$a r0 = new com.umeng.socialize.a$a
            android.content.Context r3 = r3.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            r0.<init>(r3)
            r0.execute()
        L41:
            return
    }

    static /* synthetic */ com.umeng.socialize.b.a a(com.umeng.socialize.a r0) {
            com.umeng.socialize.b.a r0 = r0.a
            return r0
    }

    private boolean a(android.app.Activity r8, com.umeng.socialize.bean.SHARE_MEDIA r9) {
            r7 = this;
            java.lang.Class r0 = r8.getClass()
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()
            int r1 = r0.length
            r2 = 0
            r3 = 0
        Lb:
            r4 = 1
            if (r2 >= r1) goto L20
            r5 = r0[r2]
            java.lang.String r5 = r5.getName()
            java.lang.String r6 = "onActivityResult"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L1d
            r3 = 1
        L1d:
            int r2 = r2 + 1
            goto Lb
        L20:
            if (r3 != 0) goto L2d
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.CHECK.ALL_NO_ONACTIVITY
            java.lang.String r1 = com.umeng.socialize.utils.UrlUtil.ALL_NO_ONACTIVITY
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            com.umeng.socialize.utils.SLog.mutlE(r0)
        L2d:
            com.umeng.socialize.bean.SHARE_MEDIA r0 = com.umeng.socialize.bean.SHARE_MEDIA.QQ
            if (r9 != r0) goto L39
            java.lang.String r8 = com.umeng.socialize.UmengTool.checkQQByself(r8)
            com.umeng.socialize.utils.SLog.E(r8)
            return r4
        L39:
            com.umeng.socialize.bean.SHARE_MEDIA r0 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN
            if (r9 != r0) goto L45
            java.lang.String r8 = com.umeng.socialize.UmengTool.checkWxBySelf(r8)
            com.umeng.socialize.utils.SLog.E(r8)
            return r4
        L45:
            com.umeng.socialize.bean.SHARE_MEDIA r0 = com.umeng.socialize.bean.SHARE_MEDIA.SINA
            if (r9 != r0) goto L51
            java.lang.String r8 = com.umeng.socialize.UmengTool.checkSinaBySelf(r8)
            com.umeng.socialize.utils.SLog.E(r8)
            return r4
        L51:
            com.umeng.socialize.bean.SHARE_MEDIA r0 = com.umeng.socialize.bean.SHARE_MEDIA.FACEBOOK
            if (r9 != r0) goto L5d
            java.lang.String r8 = com.umeng.socialize.UmengTool.checkFBByself(r8)
            com.umeng.socialize.utils.SLog.E(r8)
            return r4
        L5d:
            com.umeng.socialize.bean.SHARE_MEDIA r0 = com.umeng.socialize.bean.SHARE_MEDIA.VKONTAKTE
            if (r9 != r0) goto L68
            java.lang.String r0 = com.umeng.socialize.UmengTool.checkVKByself(r8)
            com.umeng.socialize.utils.SLog.E(r0)
        L68:
            com.umeng.socialize.bean.SHARE_MEDIA r0 = com.umeng.socialize.bean.SHARE_MEDIA.LINKEDIN
            if (r9 != r0) goto L73
            java.lang.String r0 = com.umeng.socialize.UmengTool.checkLinkin(r8)
            com.umeng.socialize.utils.SLog.E(r0)
        L73:
            com.umeng.socialize.bean.SHARE_MEDIA r0 = com.umeng.socialize.bean.SHARE_MEDIA.KAKAO
            if (r9 != r0) goto L7e
            java.lang.String r8 = com.umeng.socialize.UmengTool.checkKakao(r8)
            com.umeng.socialize.utils.SLog.E(r8)
        L7e:
            return r4
    }

    @Override // com.umeng.socialize.UMShareAPI
    public void deleteOauth(android.app.Activity r7, com.umeng.socialize.bean.SHARE_MEDIA r8, com.umeng.socialize.UMAuthListener r9) {
            r6 = this;
            if (r7 == 0) goto L10
            com.umeng.socialize.a$2 r0 = new com.umeng.socialize.a$2
            r3 = r7
            r1 = r6
            r2 = r7
            r4 = r8
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r0.execute()
            return
        L10:
            java.lang.String r7 = com.umeng.socialize.utils.UmengText.CHECK.ACTIVITYNULL
            com.umeng.socialize.utils.SLog.E(r7)
            return
    }

    @Override // com.umeng.socialize.UMShareAPI
    public void doOauthVerify(android.app.Activity r8, com.umeng.socialize.bean.SHARE_MEDIA r9, com.umeng.socialize.UMAuthListener r10) {
            r7 = this;
            com.umeng.socialize.uploadlog.UMLog.putAuth()
            boolean r0 = com.umeng.commonsdk.UMConfigure.getInitStatus()
            if (r0 != 0) goto Lf
            java.lang.String r8 = com.umeng.socialize.utils.UmengText.CHECK.NOINT
            com.umeng.socialize.utils.SLog.selfLog(r8)
            return
        Lf:
            boolean r0 = com.umeng.socialize.utils.SLog.isDebug()
            if (r0 == 0) goto L1c
            boolean r0 = r7.a(r8, r9)
            if (r0 != 0) goto L1c
            return
        L1c:
            if (r8 == 0) goto L2c
            com.umeng.socialize.a$1 r1 = new com.umeng.socialize.a$1
            r4 = r8
            r2 = r7
            r3 = r8
            r5 = r9
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            r1.execute()
            return
        L2c:
            java.lang.String r8 = com.umeng.socialize.utils.UmengText.CHECK.ACTIVITYNULL
            com.umeng.socialize.utils.SLog.E(r8)
            return
    }

    @Override // com.umeng.socialize.UMShareAPI
    public void doShare(android.app.Activity r7, com.umeng.socialize.ShareAction r8, com.umeng.socialize.UMShareListener r9) {
            r6 = this;
            com.umeng.socialize.uploadlog.UMLog.putShare()
            boolean r0 = com.umeng.commonsdk.UMConfigure.getInitStatus()
            if (r0 != 0) goto Lf
            java.lang.String r7 = com.umeng.socialize.utils.UmengText.CHECK.NOINT
            com.umeng.socialize.utils.SLog.selfLog(r7)
            return
        Lf:
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r7)
            boolean r0 = com.umeng.socialize.utils.SLog.isDebug()
            if (r0 == 0) goto L2c
            com.umeng.socialize.bean.SHARE_MEDIA r0 = r8.getPlatform()
            boolean r7 = r6.a(r7, r0)
            if (r7 != 0) goto L25
            return
        L25:
            com.umeng.socialize.bean.SHARE_MEDIA r7 = r8.getPlatform()
            com.umeng.socialize.utils.UrlUtil.sharePrint(r7)
        L2c:
            java.lang.Object r7 = r3.get()
            if (r7 == 0) goto L51
            java.lang.Object r7 = r3.get()
            android.app.Activity r7 = (android.app.Activity) r7
            boolean r7 = r7.isFinishing()
            if (r7 != 0) goto L51
            com.umeng.socialize.a$4 r0 = new com.umeng.socialize.a$4
            java.lang.Object r7 = r3.get()
            r2 = r7
            android.content.Context r2 = (android.content.Context) r2
            r1 = r6
            r4 = r8
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r0.execute()
            return
        L51:
            java.lang.String r7 = com.umeng.socialize.utils.UmengText.CHECK.ACTIVITYNULL
            com.umeng.socialize.utils.SLog.E(r7)
            return
    }

    @Override // com.umeng.socialize.UMShareAPI
    public void fetchAuthResultWithBundle(android.app.Activity r2, android.os.Bundle r3, com.umeng.socialize.UMAuthListener r4) {
            r1 = this;
            com.umeng.socialize.b.a r0 = r1.a
            r0.a(r2, r3, r4)
            return
    }

    @Override // com.umeng.socialize.UMShareAPI
    public com.umeng.socialize.handler.UMSSOHandler getHandler(com.umeng.socialize.bean.SHARE_MEDIA r2) {
            r1 = this;
            com.umeng.socialize.b.a r0 = r1.a
            if (r0 == 0) goto L9
            com.umeng.socialize.handler.UMSSOHandler r2 = r0.a(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    @Override // com.umeng.socialize.UMShareAPI
    public void getPlatformInfo(android.app.Activity r8, com.umeng.socialize.bean.SHARE_MEDIA r9, com.umeng.socialize.UMAuthListener r10) {
            r7 = this;
            if (r8 == 0) goto L2f
            boolean r0 = com.umeng.commonsdk.UMConfigure.getInitStatus()
            if (r0 != 0) goto Le
            java.lang.String r8 = com.umeng.socialize.utils.UmengText.CHECK.NOINT
            com.umeng.socialize.utils.SLog.selfLog(r8)
            return
        Le:
            com.umeng.socialize.uploadlog.UMLog.putAuth()
            boolean r0 = com.umeng.socialize.utils.SLog.isDebug()
            if (r0 == 0) goto L21
            boolean r0 = r7.a(r8, r9)
            if (r0 != 0) goto L1e
            return
        L1e:
            com.umeng.socialize.utils.UrlUtil.getInfoPrint(r9)
        L21:
            com.umeng.socialize.a$3 r1 = new com.umeng.socialize.a$3
            r4 = r8
            r2 = r7
            r3 = r8
            r5 = r9
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            r1.execute()
            return
        L2f:
            java.lang.String r8 = com.umeng.socialize.utils.UmengText.CHECK.ACTIVITYNULL
            com.umeng.socialize.utils.SLog.E(r8)
            return
    }

    @Override // com.umeng.socialize.UMShareAPI
    public java.lang.String getversion(android.app.Activity r2, com.umeng.socialize.bean.SHARE_MEDIA r3) {
            r1 = this;
            com.umeng.socialize.b.a r0 = r1.a
            java.lang.String r2 = r0.c(r2, r3)
            return r2
    }

    @Override // com.umeng.socialize.UMShareAPI
    public boolean isAuthorize(android.app.Activity r2, com.umeng.socialize.bean.SHARE_MEDIA r3) {
            r1 = this;
            com.umeng.socialize.b.a r0 = r1.a
            boolean r2 = r0.d(r2, r3)
            return r2
    }

    @Override // com.umeng.socialize.UMShareAPI
    public boolean isInstall(android.app.Activity r2, com.umeng.socialize.bean.SHARE_MEDIA r3) {
            r1 = this;
            com.umeng.socialize.b.a r0 = r1.a
            boolean r2 = r0.a(r2, r3)
            return r2
    }

    @Override // com.umeng.socialize.UMShareAPI
    public boolean isSupport(android.app.Activity r2, com.umeng.socialize.bean.SHARE_MEDIA r3) {
            r1 = this;
            com.umeng.socialize.b.a r0 = r1.a
            boolean r2 = r0.b(r2, r3)
            return r2
    }

    @Override // com.umeng.socialize.UMShareAPI
    public void onActivityResult(int r2, int r3, android.content.Intent r4) {
            r1 = this;
            com.umeng.socialize.b.a r0 = r1.a
            if (r0 == 0) goto L8
            r0.a(r2, r3, r4)
            goto Ld
        L8:
            java.lang.String r4 = com.umeng.socialize.utils.UmengText.CHECK.ROUTERNULL
            com.umeng.socialize.utils.SLog.E(r4)
        Ld:
            java.lang.String r2 = com.umeng.socialize.utils.UmengText.CHECK.getActivityResult(r2, r3)
            com.umeng.socialize.utils.SLog.I(r2)
            return
    }

    @Override // com.umeng.socialize.UMShareAPI
    public void onSaveInstanceState(android.os.Bundle r2) {
            r1 = this;
            com.umeng.socialize.b.a r0 = r1.a
            r0.a(r2)
            return
    }

    @Override // com.umeng.socialize.UMShareAPI
    public void release() {
            r1 = this;
            com.umeng.socialize.b.a r0 = r1.a
            r0.a()
            return
    }

    @Override // com.umeng.socialize.UMShareAPI
    public void setShareConfig(com.umeng.socialize.UMShareConfig r2) {
            r1 = this;
            com.umeng.socialize.b.a r0 = r1.a
            r0.a(r2)
            return
    }
}
