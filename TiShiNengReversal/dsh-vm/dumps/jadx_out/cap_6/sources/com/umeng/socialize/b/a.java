package com.umeng.socialize.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class a {
    private static final java.lang.String b = "umeng_share_platform";
    private static final java.lang.String c = "share_action";
    private com.umeng.socialize.bean.SHARE_MEDIA a;
    private final java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.handler.UMSSOHandler> d;
    private final java.util.List<android.util.Pair<com.umeng.socialize.bean.SHARE_MEDIA, java.lang.String>> e;
    private final com.umeng.socialize.b.a.C0059a f;
    private android.content.Context g;
    private final android.util.SparseArray<com.umeng.socialize.UMAuthListener> h;
    private final android.util.SparseArray<com.umeng.socialize.UMShareListener> i;
    private final android.util.SparseArray<com.umeng.socialize.UMAuthListener> j;









    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.umeng.socialize.b.a$a, reason: collision with other inner class name */
    private static class C0059a {
        private final java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.handler.UMSSOHandler> a;

        public C0059a(java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.handler.UMSSOHandler> r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        private boolean a(android.content.Context r1) {
                r0 = this;
                if (r1 == 0) goto L4
                r1 = 1
                return r1
            L4:
                r1 = 0
                return r1
        }

        private boolean a(com.umeng.socialize.bean.SHARE_MEDIA r2) {
                r1 = this;
                java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.handler.UMSSOHandler> r0 = r1.a
                java.lang.Object r0 = r0.get(r2)
                com.umeng.socialize.handler.UMSSOHandler r0 = (com.umeng.socialize.handler.UMSSOHandler) r0
                if (r0 != 0) goto L19
                java.lang.String r2 = com.umeng.socialize.utils.UmengText.CHECK.noJar(r2)
                java.lang.String r0 = com.umeng.socialize.utils.UrlUtil.ALL_NO_JAR
                java.lang.String[] r2 = new java.lang.String[]{r2, r0}
                com.umeng.socialize.utils.SLog.mutlE(r2)
                r2 = 0
                return r2
            L19:
                r2 = 1
                return r2
        }

        public boolean a(android.content.Context r3, com.umeng.socialize.bean.SHARE_MEDIA r4) {
                r2 = this;
                boolean r0 = com.umeng.socialize.utils.CommonUtil.isSilentMode(r3)
                r1 = 0
                if (r0 == 0) goto L8
                return r1
            L8:
                boolean r3 = r2.a(r3)
                if (r3 != 0) goto Lf
                return r1
            Lf:
                boolean r3 = r2.a(r4)
                if (r3 != 0) goto L16
                return r1
            L16:
                java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.handler.UMSSOHandler> r3 = r2.a
                java.lang.Object r3 = r3.get(r4)
                com.umeng.socialize.handler.UMSSOHandler r3 = (com.umeng.socialize.handler.UMSSOHandler) r3
                boolean r3 = r3.isSupportAuth()
                if (r3 != 0) goto L3d
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = r4.toString()
                r3.append(r4)
                java.lang.String r4 = com.umeng.socialize.utils.UmengText.AUTH.NOT_SUPPORT_PLATFROM
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                com.umeng.socialize.utils.SLog.E(r3)
                return r1
            L3d:
                r3 = 1
                return r3
        }

        public boolean a(com.umeng.socialize.ShareAction r2, android.app.Activity r3) {
                r1 = this;
                boolean r3 = com.umeng.socialize.utils.CommonUtil.isSilentMode(r3)
                r0 = 0
                if (r3 == 0) goto L8
                return r0
            L8:
                com.umeng.socialize.bean.SHARE_MEDIA r2 = r2.getPlatform()
                if (r2 != 0) goto Lf
                return r0
            Lf:
                com.umeng.socialize.bean.SHARE_MEDIA r3 = com.umeng.socialize.bean.SHARE_MEDIA.SINA
                if (r2 == r3) goto L17
                com.umeng.socialize.bean.SHARE_MEDIA r3 = com.umeng.socialize.bean.SHARE_MEDIA.QQ
                if (r2 != r3) goto L2d
            L17:
                java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r3 = com.umeng.socialize.PlatformConfig.configs
                java.lang.Object r3 = r3.get(r2)
                com.umeng.socialize.PlatformConfig$Platform r3 = (com.umeng.socialize.PlatformConfig.Platform) r3
                boolean r3 = r3.isConfigured()
                if (r3 != 0) goto L2d
                java.lang.String r2 = com.umeng.socialize.utils.UmengText.CHECK.noKey(r2)
                com.umeng.socialize.utils.SLog.E(r2)
                return r0
            L2d:
                boolean r2 = r1.a(r2)
                return r2
        }
    }

    public a(android.content.Context r6) {
            r5 = this;
            r5.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r5.d = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.e = r1
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.SINA
            java.lang.String r3 = "com.umeng.socialize.handler.SinaSsoHandler"
            android.util.Pair r2 = android.util.Pair.create(r2, r3)
            r1.add(r2)
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.QQ
            java.lang.String r3 = "com.umeng.socialize.handler.UMQQSsoHandler"
            android.util.Pair r2 = android.util.Pair.create(r2, r3)
            r1.add(r2)
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.QZONE
            java.lang.String r3 = "com.umeng.socialize.handler.QZoneSsoHandler"
            android.util.Pair r2 = android.util.Pair.create(r2, r3)
            r1.add(r2)
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN
            java.lang.String r3 = "com.umeng.socialize.handler.UMWXHandler"
            android.util.Pair r2 = android.util.Pair.create(r2, r3)
            r1.add(r2)
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN_CIRCLE
            java.lang.String r3 = ""
            android.util.Pair r2 = android.util.Pair.create(r2, r3)
            r1.add(r2)
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN_FAVORITE
            android.util.Pair r2 = android.util.Pair.create(r2, r3)
            r1.add(r2)
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.PINTEREST
            java.lang.String r4 = "com.umeng.socialize.handler.UMPinterestHandler"
            android.util.Pair r2 = android.util.Pair.create(r2, r4)
            r1.add(r2)
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.WXWORK
            java.lang.String r4 = "com.umeng.socialize.handler.UMWXWorkHandler"
            android.util.Pair r2 = android.util.Pair.create(r2, r4)
            r1.add(r2)
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.YIXIN
            java.lang.String r4 = "com.umeng.socialize.handler.UMYXHandler"
            android.util.Pair r2 = android.util.Pair.create(r2, r4)
            r1.add(r2)
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.YIXIN_CIRCLE
            android.util.Pair r2 = android.util.Pair.create(r2, r3)
            r1.add(r2)
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.EMAIL
            java.lang.String r4 = "com.umeng.socialize.handler.EmailHandler"
            android.util.Pair r2 = android.util.Pair.create(r2, r4)
            r1.add(r2)
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.EVERNOTE
            java.lang.String r4 = "com.umeng.socialize.handler.UMEvernoteHandler"
            android.util.Pair r2 = android.util.Pair.create(r2, r4)
            r1.add(r2)
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.FACEBOOK
            java.lang.String r4 = "com.umeng.socialize.handler.UMFacebookHandler"
            android.util.Pair r2 = android.util.Pair.create(r2, r4)
            r1.add(r2)
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.FACEBOOK_MESSAGER
            android.util.Pair r2 = android.util.Pair.create(r2, r3)
            r1.add(r2)
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.FLICKR
            java.lang.String r4 = "com.umeng.socialize.handler.UMFlickrHandler"
            android.util.Pair r2 = android.util.Pair.create(r2, r4)
            r1.add(r2)
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.FOURSQUARE
            java.lang.String r4 = "com.umeng.socialize.handler.UMFourSquareHandler"
            android.util.Pair r2 = android.util.Pair.create(r2, r4)
            r1.add(r2)
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.INSTAGRAM
            java.lang.String r4 = "com.umeng.socialize.handler.UMInstagramHandler"
            android.util.Pair r2 = android.util.Pair.create(r2, r4)
            r1.add(r2)
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.KAKAO
            java.lang.String r4 = "com.umeng.socialize.handler.UMKakaoHandler"
            android.util.Pair r2 = android.util.Pair.create(r2, r4)
            r1.add(r2)
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.LINE
            java.lang.String r4 = "com.umeng.socialize.handler.UMLineHandler"
            android.util.Pair r2 = android.util.Pair.create(r2, r4)
            r1.add(r2)
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.LINKEDIN
            java.lang.String r4 = "com.umeng.socialize.handler.UMLinkedInHandler"
            android.util.Pair r2 = android.util.Pair.create(r2, r4)
            r1.add(r2)
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.POCKET
            java.lang.String r4 = "com.umeng.socialize.handler.UMPocketHandler"
            android.util.Pair r2 = android.util.Pair.create(r2, r4)
            r1.add(r2)
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.WHATSAPP
            java.lang.String r4 = "com.umeng.socialize.handler.UMWhatsAppHandler"
            android.util.Pair r2 = android.util.Pair.create(r2, r4)
            r1.add(r2)
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.YNOTE
            java.lang.String r4 = "com.umeng.socialize.handler.UMYNoteHandler"
            android.util.Pair r2 = android.util.Pair.create(r2, r4)
            r1.add(r2)
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.SMS
            java.lang.String r4 = "com.umeng.socialize.handler.SmsHandler"
            android.util.Pair r2 = android.util.Pair.create(r2, r4)
            r1.add(r2)
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.DOUBAN
            java.lang.String r4 = "com.umeng.socialize.handler.DoubanHandler"
            android.util.Pair r2 = android.util.Pair.create(r2, r4)
            r1.add(r2)
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.TUMBLR
            java.lang.String r4 = "com.umeng.socialize.handler.UMTumblrHandler"
            android.util.Pair r2 = android.util.Pair.create(r2, r4)
            r1.add(r2)
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.TWITTER
            java.lang.String r4 = "com.umeng.socialize.handler.TwitterHandler"
            android.util.Pair r2 = android.util.Pair.create(r2, r4)
            r1.add(r2)
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.ALIPAY
            java.lang.String r4 = "com.umeng.socialize.handler.AlipayHandler"
            android.util.Pair r2 = android.util.Pair.create(r2, r4)
            r1.add(r2)
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.MORE
            java.lang.String r4 = "com.umeng.socialize.handler.UMMoreHandler"
            android.util.Pair r2 = android.util.Pair.create(r2, r4)
            r1.add(r2)
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.DINGTALK
            java.lang.String r4 = "com.umeng.socialize.handler.UMDingSSoHandler"
            android.util.Pair r2 = android.util.Pair.create(r2, r4)
            r1.add(r2)
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.VKONTAKTE
            java.lang.String r4 = "com.umeng.socialize.handler.UMVKHandler"
            android.util.Pair r2 = android.util.Pair.create(r2, r4)
            r1.add(r2)
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.DROPBOX
            java.lang.String r4 = "com.umeng.socialize.handler.UMDropBoxHandler"
            android.util.Pair r2 = android.util.Pair.create(r2, r4)
            r1.add(r2)
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.BYTEDANCE
            java.lang.String r4 = "com.umeng.socialize.handler.UMDYHandler"
            android.util.Pair r2 = android.util.Pair.create(r2, r4)
            r1.add(r2)
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.BYTEDANCE_PUBLISH
            android.util.Pair r2 = android.util.Pair.create(r2, r3)
            r1.add(r2)
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.BYTEDANCE_FRIENDS
            android.util.Pair r2 = android.util.Pair.create(r2, r3)
            r1.add(r2)
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.HONOR
            java.lang.String r3 = "com.umeng.socialize.handler.UMHonorHandler"
            android.util.Pair r2 = android.util.Pair.create(r2, r3)
            r1.add(r2)
            com.umeng.socialize.b.a$a r1 = new com.umeng.socialize.b.a$a
            r1.<init>(r0)
            r5.f = r1
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r5.h = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r5.i = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r5.j = r0
            r5.g = r6
            r5.b()
            return
    }

    private com.umeng.socialize.UMAuthListener a(int r2, java.lang.String r3, boolean r4) {
            r1 = this;
            com.umeng.socialize.b.a$5 r0 = new com.umeng.socialize.b.a$5
            r0.<init>(r1, r2, r4, r3)
            return r0
    }

    static /* synthetic */ com.umeng.socialize.UMAuthListener a(com.umeng.socialize.b.a r0, int r1) {
            com.umeng.socialize.UMAuthListener r0 = r0.d(r1)
            return r0
    }

    private com.umeng.socialize.handler.UMSSOHandler a(int r4) {
            r3 = this;
            r0 = 10103(0x2777, float:1.4157E-41)
            if (r4 == r0) goto La
            r1 = 11101(0x2b5d, float:1.5556E-41)
            if (r4 != r1) goto L9
            goto La
        L9:
            r0 = r4
        La:
            r1 = 64207(0xfacf, float:8.9973E-41)
            r2 = 64206(0xface, float:8.9972E-41)
            if (r4 == r1) goto L19
            if (r4 == r2) goto L19
            r1 = 64208(0xfad0, float:8.9975E-41)
            if (r4 != r1) goto L1c
        L19:
            r0 = 64206(0xface, float:8.9972E-41)
        L1c:
            r1 = 32973(0x80cd, float:4.6205E-41)
            if (r4 == r1) goto L25
            r1 = 765(0x2fd, float:1.072E-42)
            if (r4 != r1) goto L27
        L25:
            r0 = 10001(0x2711, float:1.4014E-41)
        L27:
            r1 = 5650(0x1612, float:7.917E-42)
            if (r4 != r1) goto L2d
            r0 = 5659(0x161b, float:7.93E-42)
        L2d:
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.handler.UMSSOHandler> r4 = r3.d
            java.util.Collection r4 = r4.values()
            java.util.Iterator r4 = r4.iterator()
        L37:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L4c
            java.lang.Object r1 = r4.next()
            com.umeng.socialize.handler.UMSSOHandler r1 = (com.umeng.socialize.handler.UMSSOHandler) r1
            if (r1 == 0) goto L37
            int r2 = r1.getRequestCode()
            if (r0 != r2) goto L37
            return r1
        L4c:
            r4 = 0
            return r4
    }

    private com.umeng.socialize.handler.UMSSOHandler a(java.lang.String r1) {
            r0 = this;
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> Lb
            java.lang.Object r1 = r1.newInstance()     // Catch: java.lang.Exception -> Lb
            com.umeng.socialize.handler.UMSSOHandler r1 = (com.umeng.socialize.handler.UMSSOHandler) r1     // Catch: java.lang.Exception -> Lb
            return r1
        Lb:
            r1 = 0
            return r1
    }

    static /* synthetic */ java.util.Map a(com.umeng.socialize.b.a r0, com.umeng.socialize.bean.SHARE_MEDIA r1, java.util.Map r2) {
            java.util.Map r0 = r0.a(r1, r2)
            return r0
    }

    private java.util.Map<java.lang.String, java.lang.String> a(com.umeng.socialize.bean.SHARE_MEDIA r4, java.util.Map<java.lang.String, java.lang.String> r5) {
            r3 = this;
            com.umeng.socialize.PlatformConfig$Platform r0 = com.umeng.socialize.PlatformConfig.getPlatform(r4)
            if (r0 == 0) goto L1f
            com.umeng.socialize.PlatformConfig$Platform r0 = com.umeng.socialize.PlatformConfig.getPlatform(r4)
            java.lang.String r0 = r0.getAppid()
            com.umeng.socialize.PlatformConfig$Platform r1 = com.umeng.socialize.PlatformConfig.getPlatform(r4)
            java.lang.String r1 = r1.getAppSecret()
            com.umeng.socialize.PlatformConfig$Platform r4 = com.umeng.socialize.PlatformConfig.getPlatform(r4)
            java.lang.String r4 = r4.getClick_key()
            goto L23
        L1f:
            java.lang.String r0 = ""
            r4 = r0
            r1 = r4
        L23:
            java.lang.String r2 = "aid"
            r5.put(r2, r0)
            java.lang.String r0 = "as"
            r5.put(r0, r1)
            java.lang.String r0 = "at"
            r5.put(r0, r4)
            return r5
    }

    private synchronized void a(int r2, com.umeng.socialize.UMAuthListener r3) {
            r1 = this;
            monitor-enter(r1)
            android.util.SparseArray<com.umeng.socialize.UMAuthListener> r0 = r1.h     // Catch: java.lang.Throwable -> L8
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r2
    }

    private synchronized void a(int r2, com.umeng.socialize.UMShareListener r3) {
            r1 = this;
            monitor-enter(r1)
            android.util.SparseArray<com.umeng.socialize.UMShareListener> r0 = r1.i     // Catch: java.lang.Throwable -> L8
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r2
    }

    private void a(com.umeng.socialize.ShareAction r6) {
            r5 = this;
            com.umeng.socialize.ShareContent r0 = r6.getShareContent()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = com.umeng.socialize.utils.UmengText.SHARE.INFO
            r1.add(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = com.umeng.socialize.utils.UmengText.SHARE.SHAREPLAT
            r2.append(r3)
            com.umeng.socialize.bean.SHARE_MEDIA r3 = r6.getPlatform()
            java.lang.String r3 = r3.toString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.add(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = com.umeng.socialize.utils.UmengText.SHARE.SHARESTYLE
            r2.append(r3)
            com.umeng.socialize.ShareContent r6 = r6.getShareContent()
            int r6 = r6.getShareType()
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r1.add(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r2 = com.umeng.socialize.utils.UmengText.SHARE.SHARETEXT
            r6.append(r2)
            java.lang.String r2 = r0.mText
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            r1.add(r6)
            com.umeng.socialize.media.UMediaObject r6 = r0.mMedia
            if (r6 == 0) goto L2d0
            boolean r2 = r6 instanceof com.umeng.socialize.media.UMImage
            if (r2 == 0) goto Le6
            com.umeng.socialize.media.UMImage r6 = (com.umeng.socialize.media.UMImage) r6
            boolean r2 = r6.isUrlMedia()
            if (r2 == 0) goto L85
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = com.umeng.socialize.utils.UmengText.SHARE.URLIMAGE
            r2.append(r3)
            java.lang.String r3 = r6.asUrlImage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.add(r2)
            goto La2
        L85:
            byte[] r2 = r6.asBinImage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = com.umeng.socialize.utils.UmengText.SHARE.LOCALIMAGE
            r3.append(r4)
            if (r2 != 0) goto L97
            r2 = 0
            goto L98
        L97:
            int r2 = r2.length
        L98:
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.add(r2)
        La2:
            com.umeng.socialize.media.UMImage r2 = r6.getThumbImage()
            if (r2 == 0) goto Le6
            com.umeng.socialize.media.UMImage r6 = r6.getThumbImage()
            boolean r2 = r6.isUrlMedia()
            if (r2 == 0) goto Lcb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = com.umeng.socialize.utils.UmengText.SHARE.URLTHUMB
            r2.append(r3)
            java.lang.String r6 = r6.asUrlImage()
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r1.add(r6)
            goto Le6
        Lcb:
            byte[] r6 = r6.asBinImage()
            if (r6 == 0) goto Le6
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = com.umeng.socialize.utils.UmengText.SHARE.LOCALTHUMB
            r2.append(r3)
            int r6 = r6.length
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r1.add(r6)
        Le6:
            com.umeng.socialize.media.UMediaObject r6 = r0.mMedia
            boolean r2 = r6 instanceof com.umeng.socialize.media.UMVideo
            if (r2 == 0) goto L18c
            com.umeng.socialize.media.UMVideo r6 = (com.umeng.socialize.media.UMVideo) r6
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = com.umeng.socialize.utils.UmengText.SHARE.VIDEOURL
            r2.append(r3)
            java.lang.String r3 = r6.toUrl()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.add(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = com.umeng.socialize.utils.UmengText.SHARE.VIDEOTITLE
            r2.append(r3)
            java.lang.String r3 = r6.getTitle()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.add(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = com.umeng.socialize.utils.UmengText.SHARE.VIDEODES
            r2.append(r3)
            java.lang.String r3 = r6.getDescription()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.add(r2)
            com.umeng.socialize.media.UMImage r2 = r6.getThumbImage()
            if (r2 == 0) goto L18c
            com.umeng.socialize.media.UMImage r2 = r6.getThumbImage()
            boolean r2 = r2.isUrlMedia()
            if (r2 == 0) goto L16d
            com.umeng.socialize.media.UMImage r2 = r6.getThumbImage()
            java.lang.String r2 = r2.asUrlImage()
            if (r2 == 0) goto L18c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = com.umeng.socialize.utils.UmengText.SHARE.URLTHUMB
            r2.append(r3)
            com.umeng.socialize.media.UMImage r6 = r6.getThumbImage()
            java.lang.String r6 = r6.asUrlImage()
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r1.add(r6)
            goto L18c
        L16d:
            com.umeng.socialize.media.UMImage r6 = r6.getThumbImage()
            byte[] r6 = r6.asBinImage()
            if (r6 == 0) goto L18c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = com.umeng.socialize.utils.UmengText.SHARE.LOCALTHUMB
            r2.append(r3)
            int r6 = r6.length
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r1.add(r6)
        L18c:
            com.umeng.socialize.media.UMediaObject r6 = r0.mMedia
            boolean r2 = r6 instanceof com.umeng.socialize.media.UMusic
            if (r2 == 0) goto L234
            com.umeng.socialize.media.UMusic r6 = (com.umeng.socialize.media.UMusic) r6
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = com.umeng.socialize.utils.UmengText.SHARE.MUSICURL
            r2.append(r3)
            java.lang.String r3 = r6.toUrl()
            r2.append(r3)
            java.lang.String r3 = "   "
            r2.append(r3)
            java.lang.String r3 = r6.getmTargetUrl()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.add(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = com.umeng.socialize.utils.UmengText.SHARE.MUSICTITLE
            r2.append(r3)
            java.lang.String r3 = r6.getTitle()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.add(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = com.umeng.socialize.utils.UmengText.SHARE.MUSICDES
            r2.append(r3)
            java.lang.String r3 = r6.getDescription()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.add(r2)
            com.umeng.socialize.media.UMImage r2 = r6.getThumbImage()
            if (r2 == 0) goto L234
            com.umeng.socialize.media.UMImage r2 = r6.getThumbImage()
            boolean r2 = r2.isUrlMedia()
            if (r2 == 0) goto L215
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = com.umeng.socialize.utils.UmengText.SHARE.URLTHUMB
            r2.append(r3)
            com.umeng.socialize.media.UMImage r6 = r6.getThumbImage()
            java.lang.String r6 = r6.asUrlImage()
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r1.add(r6)
            goto L234
        L215:
            com.umeng.socialize.media.UMImage r6 = r6.getThumbImage()
            byte[] r6 = r6.asBinImage()
            if (r6 == 0) goto L234
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = com.umeng.socialize.utils.UmengText.SHARE.LOCALTHUMB
            r2.append(r3)
            int r6 = r6.length
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r1.add(r6)
        L234:
            com.umeng.socialize.media.UMediaObject r6 = r0.mMedia
            boolean r2 = r6 instanceof com.umeng.socialize.media.UMWeb
            if (r2 == 0) goto L2d0
            com.umeng.socialize.media.UMWeb r6 = (com.umeng.socialize.media.UMWeb) r6
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = com.umeng.socialize.utils.UmengText.SHARE.URLURL
            r2.append(r3)
            java.lang.String r3 = r6.toUrl()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.add(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = com.umeng.socialize.utils.UmengText.SHARE.URLTITLE
            r2.append(r3)
            java.lang.String r3 = r6.getTitle()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.add(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = com.umeng.socialize.utils.UmengText.SHARE.URLDES
            r2.append(r3)
            java.lang.String r3 = r6.getDescription()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.add(r2)
            com.umeng.socialize.media.UMImage r2 = r6.getThumbImage()
            if (r2 == 0) goto L2d0
            com.umeng.socialize.media.UMImage r2 = r6.getThumbImage()
            boolean r2 = r2.isUrlMedia()
            if (r2 == 0) goto L2b1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = com.umeng.socialize.utils.UmengText.SHARE.URLTHUMB
            r2.append(r3)
            com.umeng.socialize.media.UMImage r6 = r6.getThumbImage()
            java.lang.String r6 = r6.asUrlImage()
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r1.add(r6)
            goto L2d0
        L2b1:
            com.umeng.socialize.media.UMImage r6 = r6.getThumbImage()
            byte[] r6 = r6.asBinImage()
            if (r6 == 0) goto L2d0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = com.umeng.socialize.utils.UmengText.SHARE.LOCALTHUMB
            r2.append(r3)
            int r6 = r6.length
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r1.add(r6)
        L2d0:
            java.io.File r6 = r0.file
            if (r6 == 0) goto L2ee
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r2 = com.umeng.socialize.utils.UmengText.SHARE.FILENAME
            r6.append(r2)
            java.io.File r0 = r0.file
            java.lang.String r0 = r0.getName()
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r1.add(r6)
        L2ee:
            r6 = 1
            java.lang.String[] r6 = new java.lang.String[r6]
            java.lang.Object[] r6 = r1.toArray(r6)
            java.lang.String[] r6 = (java.lang.String[]) r6
            com.umeng.socialize.utils.SLog.mutlI(r6)
            return
    }

    private void a(com.umeng.socialize.bean.SHARE_MEDIA r2, com.umeng.socialize.UMAuthListener r3, com.umeng.socialize.handler.UMSSOHandler r4, java.lang.String r5) {
            r1 = this;
            boolean r0 = r4.isHasAuthListener()
            if (r0 == 0) goto L7
            return
        L7:
            int r2 = r2.ordinal()
            r1.a(r2, r3)
            boolean r3 = r4.isInstall()
            com.umeng.socialize.UMAuthListener r2 = r1.a(r2, r5, r3)
            r4.setAuthListener(r2)
            return
    }

    static /* synthetic */ com.umeng.socialize.UMAuthListener b(com.umeng.socialize.b.a r0, int r1) {
            com.umeng.socialize.UMAuthListener r0 = r0.c(r1)
            return r0
    }

    private com.umeng.socialize.bean.SHARE_MEDIA b(int r2) {
            r1 = this;
            r0 = 10103(0x2777, float:1.4157E-41)
            if (r2 == r0) goto L19
            r0 = 11101(0x2b5d, float:1.5556E-41)
            if (r2 != r0) goto L9
            goto L19
        L9:
            r0 = 32973(0x80cd, float:4.6205E-41)
            if (r2 == r0) goto L16
            r0 = 765(0x2fd, float:1.072E-42)
            if (r2 != r0) goto L13
            goto L16
        L13:
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.QQ
            return r2
        L16:
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.SINA
            return r2
        L19:
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.QQ
            return r2
    }

    private void b() {
            r4 = this;
            java.util.List<android.util.Pair<com.umeng.socialize.bean.SHARE_MEDIA, java.lang.String>> r0 = r4.e
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L89
            java.lang.Object r1 = r0.next()
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r2 = r1.first
            com.umeng.socialize.bean.SHARE_MEDIA r3 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN_CIRCLE
            if (r2 != r3) goto L23
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.handler.UMSSOHandler> r2 = r4.d
            com.umeng.socialize.bean.SHARE_MEDIA r3 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN
            java.lang.Object r2 = r2.get(r3)
            com.umeng.socialize.handler.UMSSOHandler r2 = (com.umeng.socialize.handler.UMSSOHandler) r2
            goto L80
        L23:
            com.umeng.socialize.bean.SHARE_MEDIA r3 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN_FAVORITE
            if (r2 != r3) goto L32
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.handler.UMSSOHandler> r2 = r4.d
            com.umeng.socialize.bean.SHARE_MEDIA r3 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN
            java.lang.Object r2 = r2.get(r3)
            com.umeng.socialize.handler.UMSSOHandler r2 = (com.umeng.socialize.handler.UMSSOHandler) r2
            goto L80
        L32:
            com.umeng.socialize.bean.SHARE_MEDIA r3 = com.umeng.socialize.bean.SHARE_MEDIA.FACEBOOK_MESSAGER
            if (r2 != r3) goto L41
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.handler.UMSSOHandler> r2 = r4.d
            com.umeng.socialize.bean.SHARE_MEDIA r3 = com.umeng.socialize.bean.SHARE_MEDIA.FACEBOOK
            java.lang.Object r2 = r2.get(r3)
            com.umeng.socialize.handler.UMSSOHandler r2 = (com.umeng.socialize.handler.UMSSOHandler) r2
            goto L80
        L41:
            com.umeng.socialize.bean.SHARE_MEDIA r3 = com.umeng.socialize.bean.SHARE_MEDIA.BYTEDANCE_PUBLISH
            if (r2 != r3) goto L50
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.handler.UMSSOHandler> r2 = r4.d
            com.umeng.socialize.bean.SHARE_MEDIA r3 = com.umeng.socialize.bean.SHARE_MEDIA.BYTEDANCE
            java.lang.Object r2 = r2.get(r3)
            com.umeng.socialize.handler.UMSSOHandler r2 = (com.umeng.socialize.handler.UMSSOHandler) r2
            goto L80
        L50:
            com.umeng.socialize.bean.SHARE_MEDIA r3 = com.umeng.socialize.bean.SHARE_MEDIA.BYTEDANCE_FRIENDS
            if (r2 != r3) goto L5f
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.handler.UMSSOHandler> r2 = r4.d
            com.umeng.socialize.bean.SHARE_MEDIA r3 = com.umeng.socialize.bean.SHARE_MEDIA.BYTEDANCE
            java.lang.Object r2 = r2.get(r3)
            com.umeng.socialize.handler.UMSSOHandler r2 = (com.umeng.socialize.handler.UMSSOHandler) r2
            goto L80
        L5f:
            com.umeng.socialize.bean.SHARE_MEDIA r3 = com.umeng.socialize.bean.SHARE_MEDIA.YIXIN_CIRCLE
            if (r2 != r3) goto L6e
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.handler.UMSSOHandler> r2 = r4.d
            com.umeng.socialize.bean.SHARE_MEDIA r3 = com.umeng.socialize.bean.SHARE_MEDIA.YIXIN
            java.lang.Object r2 = r2.get(r3)
            com.umeng.socialize.handler.UMSSOHandler r2 = (com.umeng.socialize.handler.UMSSOHandler) r2
            goto L80
        L6e:
            com.umeng.socialize.bean.SHARE_MEDIA r3 = com.umeng.socialize.bean.SHARE_MEDIA.MORE
            if (r2 != r3) goto L78
            com.umeng.socialize.handler.UMMoreHandler r2 = new com.umeng.socialize.handler.UMMoreHandler
            r2.<init>()
            goto L80
        L78:
            java.lang.Object r2 = r1.second
            java.lang.String r2 = (java.lang.String) r2
            com.umeng.socialize.handler.UMSSOHandler r2 = r4.a(r2)
        L80:
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.handler.UMSSOHandler> r3 = r4.d
            java.lang.Object r1 = r1.first
            r3.put(r1, r2)
            goto L6
        L89:
            return
    }

    private synchronized void b(int r2, com.umeng.socialize.UMAuthListener r3) {
            r1 = this;
            monitor-enter(r1)
            android.util.SparseArray<com.umeng.socialize.UMAuthListener> r0 = r1.j     // Catch: java.lang.Throwable -> L8
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r2
    }

    private void b(android.content.Context r3) {
            r2 = this;
            java.lang.String r3 = com.umeng.socialize.utils.SocializeUtils.getAppkey(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L33
            boolean r0 = com.umeng.socialize.net.utils.SocializeNetUtils.isConSpeCharacters(r3)
            if (r0 != 0) goto L25
            boolean r3 = com.umeng.socialize.net.utils.SocializeNetUtils.isSelfAppkey(r3)
            if (r3 != 0) goto L17
            return
        L17:
            com.umeng.socialize.SocializeException r3 = new com.umeng.socialize.SocializeException
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.CHECK.APPKEY_NOT_FOUND
            java.lang.String r1 = com.umeng.socialize.utils.UrlUtil.ALL_ERROR_APPKEY
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.errorWithUrl(r0, r1)
            r3.<init>(r0)
            throw r3
        L25:
            com.umeng.socialize.SocializeException r3 = new com.umeng.socialize.SocializeException
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.CHECK.APPKEY_NOT_FOUND
            java.lang.String r1 = com.umeng.socialize.utils.UrlUtil.ALL_ERROR_APPKEY
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.errorWithUrl(r0, r1)
            r3.<init>(r0)
            throw r3
        L33:
            com.umeng.socialize.SocializeException r3 = new com.umeng.socialize.SocializeException
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.CHECK.APPKEY_NOT_FOUND
            java.lang.String r1 = com.umeng.socialize.utils.UrlUtil.ALL_NO_APPKEY
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.errorWithUrl(r0, r1)
            r3.<init>(r0)
            throw r3
    }

    private synchronized com.umeng.socialize.UMAuthListener c(int r3) {
            r2 = this;
            monitor-enter(r2)
            r0 = 0
            r2.a = r0     // Catch: java.lang.Throwable -> L14
            android.util.SparseArray<com.umeng.socialize.UMAuthListener> r1 = r2.h     // Catch: java.lang.Throwable -> L14
            java.lang.Object r0 = r1.get(r3, r0)     // Catch: java.lang.Throwable -> L14
            com.umeng.socialize.UMAuthListener r0 = (com.umeng.socialize.UMAuthListener) r0     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L16
            android.util.SparseArray<com.umeng.socialize.UMAuthListener> r1 = r2.h     // Catch: java.lang.Throwable -> L14
            r1.remove(r3)     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r3 = move-exception
            goto L18
        L16:
            monitor-exit(r2)
            return r0
        L18:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            throw r3
    }

    static /* synthetic */ com.umeng.socialize.UMShareListener c(com.umeng.socialize.b.a r0, int r1) {
            com.umeng.socialize.UMShareListener r0 = r0.e(r1)
            return r0
    }

    private synchronized void c() {
            r1 = this;
            monitor-enter(r1)
            android.util.SparseArray<com.umeng.socialize.UMAuthListener> r0 = r1.h     // Catch: java.lang.Throwable -> L12
            r0.clear()     // Catch: java.lang.Throwable -> L12
            android.util.SparseArray<com.umeng.socialize.UMShareListener> r0 = r1.i     // Catch: java.lang.Throwable -> L12
            r0.clear()     // Catch: java.lang.Throwable -> L12
            android.util.SparseArray<com.umeng.socialize.UMAuthListener> r0 = r1.j     // Catch: java.lang.Throwable -> L12
            r0.clear()     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)
            return
        L12:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            throw r0
    }

    private synchronized com.umeng.socialize.UMAuthListener d(int r3) {
            r2 = this;
            monitor-enter(r2)
            android.util.SparseArray<com.umeng.socialize.UMAuthListener> r0 = r2.j     // Catch: java.lang.Throwable -> L12
            r1 = 0
            java.lang.Object r0 = r0.get(r3, r1)     // Catch: java.lang.Throwable -> L12
            com.umeng.socialize.UMAuthListener r0 = (com.umeng.socialize.UMAuthListener) r0     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            android.util.SparseArray<com.umeng.socialize.UMAuthListener> r1 = r2.j     // Catch: java.lang.Throwable -> L12
            r1.remove(r3)     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r3 = move-exception
            goto L16
        L14:
            monitor-exit(r2)
            return r0
        L16:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r3
    }

    private synchronized com.umeng.socialize.UMShareListener e(int r3) {
            r2 = this;
            monitor-enter(r2)
            android.util.SparseArray<com.umeng.socialize.UMShareListener> r0 = r2.i     // Catch: java.lang.Throwable -> L12
            r1 = 0
            java.lang.Object r0 = r0.get(r3, r1)     // Catch: java.lang.Throwable -> L12
            com.umeng.socialize.UMShareListener r0 = (com.umeng.socialize.UMShareListener) r0     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            android.util.SparseArray<com.umeng.socialize.UMShareListener> r1 = r2.i     // Catch: java.lang.Throwable -> L12
            r1.remove(r3)     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r3 = move-exception
            goto L16
        L14:
            monitor-exit(r2)
            return r0
        L16:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r3
    }

    public com.umeng.socialize.handler.UMSSOHandler a(com.umeng.socialize.bean.SHARE_MEDIA r3) {
            r2 = this;
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.handler.UMSSOHandler> r0 = r2.d
            java.lang.Object r0 = r0.get(r3)
            com.umeng.socialize.handler.UMSSOHandler r0 = (com.umeng.socialize.handler.UMSSOHandler) r0
            if (r0 == 0) goto L13
            com.umeng.socialize.PlatformConfig$Platform r3 = com.umeng.socialize.PlatformConfig.getPlatform(r3)
            android.content.Context r1 = r2.g
            r0.onCreate(r1, r3)
        L13:
            return r0
    }

    public void a() {
            r2 = this;
            r2.c()
            com.umeng.socialize.net.dplus.cache1.DplusCacheApi r0 = com.umeng.socialize.net.dplus.cache1.DplusCacheApi.getInstance()
            android.content.Context r1 = com.umeng.socialize.utils.ContextUtil.getContext()
            r0.cleanCache(r1)
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.handler.UMSSOHandler> r0 = r2.d
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.SINA
            java.lang.Object r0 = r0.get(r1)
            com.umeng.socialize.handler.UMSSOHandler r0 = (com.umeng.socialize.handler.UMSSOHandler) r0
            if (r0 == 0) goto L1d
            r0.release()
        L1d:
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.handler.UMSSOHandler> r0 = r2.d
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.MORE
            java.lang.Object r0 = r0.get(r1)
            com.umeng.socialize.handler.UMSSOHandler r0 = (com.umeng.socialize.handler.UMSSOHandler) r0
            if (r0 == 0) goto L2c
            r0.release()
        L2c:
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.handler.UMSSOHandler> r0 = r2.d
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.DINGTALK
            java.lang.Object r0 = r0.get(r1)
            com.umeng.socialize.handler.UMSSOHandler r0 = (com.umeng.socialize.handler.UMSSOHandler) r0
            if (r0 == 0) goto L3b
            r0.release()
        L3b:
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.handler.UMSSOHandler> r0 = r2.d
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN
            java.lang.Object r0 = r0.get(r1)
            com.umeng.socialize.handler.UMSSOHandler r0 = (com.umeng.socialize.handler.UMSSOHandler) r0
            if (r0 == 0) goto L4a
            r0.release()
        L4a:
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.handler.UMSSOHandler> r0 = r2.d
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.QQ
            java.lang.Object r0 = r0.get(r1)
            com.umeng.socialize.handler.UMSSOHandler r0 = (com.umeng.socialize.handler.UMSSOHandler) r0
            if (r0 == 0) goto L59
            r0.release()
        L59:
            r0 = 0
            r2.a = r0
            com.umeng.socialize.net.dplus.cache1.DplusCacheApi r0 = com.umeng.socialize.net.dplus.cache1.DplusCacheApi.getInstance()
            android.content.Context r1 = com.umeng.socialize.utils.ContextUtil.getContext()
            r0.closeDBConnection(r1)
            return
    }

    public void a(int r2, int r3, android.content.Intent r4) {
            r1 = this;
            com.umeng.socialize.handler.UMSSOHandler r0 = r1.a(r2)
            if (r0 == 0) goto L9
            r0.onActivityResult(r2, r3, r4)
        L9:
            return
    }

    @java.lang.Deprecated
    public void a(android.app.Activity r3, int r4, com.umeng.socialize.UMAuthListener r5) {
            r2 = this;
            com.umeng.socialize.handler.UMSSOHandler r0 = r2.a(r4)
            if (r0 == 0) goto L26
            r1 = 10103(0x2777, float:1.4157E-41)
            if (r4 == r1) goto Le
            r1 = 11101(0x2b5d, float:1.5556E-41)
            if (r4 != r1) goto L26
        Le:
            com.umeng.socialize.bean.SHARE_MEDIA r4 = r2.b(r4)
            com.umeng.socialize.PlatformConfig$Platform r4 = com.umeng.socialize.PlatformConfig.getPlatform(r4)
            r0.onCreate(r3, r4)
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            com.umeng.socialize.bean.SHARE_MEDIA r4 = com.umeng.socialize.bean.SHARE_MEDIA.QQ
            r2.a(r4, r5, r0, r3)
        L26:
            return
    }

    public void a(android.app.Activity r4, android.os.Bundle r5, com.umeng.socialize.UMAuthListener r6) {
            r3 = this;
            if (r5 == 0) goto L45
            if (r6 == 0) goto L45
            java.lang.String r0 = "umeng_share_platform"
            r1 = 0
            java.lang.String r0 = r5.getString(r0, r1)
            java.lang.String r1 = "share_action"
            r2 = -1
            int r5 = r5.getInt(r1, r2)
            if (r5 != 0) goto L45
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 != 0) goto L45
            com.umeng.socialize.bean.SHARE_MEDIA r5 = com.umeng.socialize.bean.SHARE_MEDIA.convertToEmun(r0)
            if (r5 == 0) goto L45
            com.umeng.socialize.bean.SHARE_MEDIA r0 = com.umeng.socialize.bean.SHARE_MEDIA.QQ
            if (r5 != r0) goto L34
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.handler.UMSSOHandler> r0 = r3.d
            java.lang.Object r0 = r0.get(r5)
            com.umeng.socialize.handler.UMSSOHandler r0 = (com.umeng.socialize.handler.UMSSOHandler) r0
            com.umeng.socialize.PlatformConfig$Platform r1 = com.umeng.socialize.PlatformConfig.getPlatform(r5)
            r0.onCreate(r4, r1)
            goto L38
        L34:
            com.umeng.socialize.handler.UMSSOHandler r0 = r3.a(r5)
        L38:
            if (r0 == 0) goto L45
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r4 = java.lang.String.valueOf(r1)
            r3.a(r5, r6, r0, r4)
        L45:
            return
    }

    public void a(android.app.Activity r8, com.umeng.socialize.ShareAction r9, com.umeng.socialize.UMShareListener r10) {
            r7 = this;
            r7.b(r8)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r8)
            com.umeng.socialize.b.a$a r1 = r7.f
            boolean r8 = r1.a(r9, r8)
            if (r8 != 0) goto L11
            return
        L11:
            boolean r8 = com.umeng.socialize.utils.SLog.isDebug()
            if (r8 == 0) goto L30
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = com.umeng.socialize.utils.UmengText.SHARE.VERSION
            r8.append(r1)
            java.lang.String r1 = "7.3.2"
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            com.umeng.socialize.utils.SLog.E(r8)
            r7.a(r9)
        L30:
            com.umeng.socialize.bean.SHARE_MEDIA r4 = r9.getPlatform()
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.handler.UMSSOHandler> r8 = r7.d
            java.lang.Object r8 = r8.get(r4)
            com.umeng.socialize.handler.UMSSOHandler r8 = (com.umeng.socialize.handler.UMSSOHandler) r8
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            com.umeng.socialize.PlatformConfig$Platform r1 = com.umeng.socialize.PlatformConfig.getPlatform(r4)
            r8.onCreate(r0, r1)
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r5 = java.lang.String.valueOf(r0)
            android.content.Context r0 = com.umeng.socialize.utils.ContextUtil.getContext()
            if (r0 == 0) goto L80
            com.umeng.socialize.ShareContent r0 = r9.getShareContent()
            com.umeng.socialize.media.UMediaObject r0 = r0.mMedia
            boolean r0 = r0 instanceof com.umeng.socialize.media.UMImage
            if (r0 == 0) goto L6f
            com.umeng.socialize.ShareContent r0 = r9.getShareContent()
            com.umeng.socialize.media.UMediaObject r0 = r0.mMedia
            com.umeng.socialize.media.UMImage r0 = (com.umeng.socialize.media.UMImage) r0
            boolean r0 = r0.isHasWaterMark()
            r6 = r0
            goto L71
        L6f:
            r0 = 0
            r6 = 0
        L71:
            android.content.Context r1 = com.umeng.socialize.utils.ContextUtil.getContext()
            com.umeng.socialize.ShareContent r2 = r9.getShareContent()
            boolean r3 = r8.isInstall()
            com.umeng.socialize.net.dplus.DplusApi.uploadShare(r1, r2, r3, r4, r5, r6)
        L80:
            int r0 = r4.ordinal()
            r7.a(r0, r10)
            com.umeng.socialize.b.a$6 r1 = new com.umeng.socialize.b.a$6
            r1.<init>(r7, r0, r5)
            boolean r0 = r9.getUrlValid()
            if (r0 != 0) goto L9b
            com.umeng.socialize.b.a$7 r8 = new com.umeng.socialize.b.a$7
            r8.<init>(r7, r1, r9)
            com.umeng.socialize.common.QueuedWork.runInMain(r8)
            return
        L9b:
            com.umeng.socialize.b.a$8 r0 = new com.umeng.socialize.b.a$8
            r0.<init>(r7, r10, r9)
            com.umeng.socialize.common.QueuedWork.runInMain(r0)
            com.umeng.socialize.ShareContent r9 = r9.getShareContent()     // Catch: java.lang.Throwable -> Lab
            r8.share(r9, r1)     // Catch: java.lang.Throwable -> Lab
            return
        Lab:
            r0 = move-exception
            r8 = r0
            com.umeng.socialize.utils.SLog.error(r8)
            return
    }

    public void a(android.app.Activity r3, com.umeng.socialize.bean.SHARE_MEDIA r4, com.umeng.socialize.UMAuthListener r5) {
            r2 = this;
            com.umeng.socialize.b.a$a r0 = r2.f
            boolean r0 = r0.a(r3, r4)
            if (r0 != 0) goto L9
            return
        L9:
            if (r5 != 0) goto L10
            com.umeng.socialize.b.a$1 r5 = new com.umeng.socialize.b.a$1
            r5.<init>(r2)
        L10:
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.handler.UMSSOHandler> r0 = r2.d
            java.lang.Object r0 = r0.get(r4)
            com.umeng.socialize.handler.UMSSOHandler r0 = (com.umeng.socialize.handler.UMSSOHandler) r0
            com.umeng.socialize.PlatformConfig$Platform r1 = com.umeng.socialize.PlatformConfig.getPlatform(r4)
            r0.onCreate(r3, r1)
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.handler.UMSSOHandler> r3 = r2.d
            java.lang.Object r3 = r3.get(r4)
            com.umeng.socialize.handler.UMSSOHandler r3 = (com.umeng.socialize.handler.UMSSOHandler) r3
            r3.deleteAuth(r5)
            return
    }

    public void a(android.content.Context r1) {
            r0 = this;
            if (r1 == 0) goto Lc
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            r0.g = r1
        Lc:
            return
    }

    public void a(android.os.Bundle r4) {
            r3 = this;
            com.umeng.socialize.bean.SHARE_MEDIA r0 = r3.a
            if (r0 == 0) goto L16
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN
            if (r0 == r1) goto L10
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.QQ
            if (r0 == r1) goto L10
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.SINA
            if (r0 != r1) goto L16
        L10:
            java.lang.String r0 = r0.toString()
            r1 = 0
            goto L19
        L16:
            java.lang.String r0 = ""
            r1 = -1
        L19:
            java.lang.String r2 = "umeng_share_platform"
            r4.putString(r2, r0)
            java.lang.String r0 = "share_action"
            r4.putInt(r0, r1)
            r4 = 0
            r3.a = r4
            return
    }

    public void a(com.umeng.socialize.UMShareConfig r3) {
            r2 = this;
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.handler.UMSSOHandler> r0 = r2.d
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2a
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.handler.UMSSOHandler> r0 = r2.d
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            com.umeng.socialize.handler.UMSSOHandler r1 = (com.umeng.socialize.handler.UMSSOHandler) r1
            if (r1 == 0) goto L12
            r1.setShareConfig(r3)
            goto L12
        L2a:
            return
    }

    public boolean a(android.app.Activity r3, com.umeng.socialize.bean.SHARE_MEDIA r4) {
            r2 = this;
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.handler.UMSSOHandler> r0 = r2.d
            java.lang.Object r0 = r0.get(r4)
            com.umeng.socialize.handler.UMSSOHandler r0 = (com.umeng.socialize.handler.UMSSOHandler) r0
            com.umeng.socialize.PlatformConfig$Platform r1 = com.umeng.socialize.PlatformConfig.getPlatform(r4)
            r0.onCreate(r3, r1)
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.handler.UMSSOHandler> r3 = r2.d
            java.lang.Object r3 = r3.get(r4)
            com.umeng.socialize.handler.UMSSOHandler r3 = (com.umeng.socialize.handler.UMSSOHandler) r3
            boolean r3 = r3.isInstall()
            return r3
    }

    public void b(android.app.Activity r4, com.umeng.socialize.bean.SHARE_MEDIA r5, com.umeng.socialize.UMAuthListener r6) {
            r3 = this;
            com.umeng.socialize.b.a$a r0 = r3.f
            boolean r0 = r0.a(r4, r5)
            if (r0 != 0) goto L9
            return
        L9:
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.handler.UMSSOHandler> r0 = r3.d
            java.lang.Object r0 = r0.get(r5)
            com.umeng.socialize.handler.UMSSOHandler r0 = (com.umeng.socialize.handler.UMSSOHandler) r0
            com.umeng.socialize.PlatformConfig$Platform r1 = com.umeng.socialize.PlatformConfig.getPlatform(r5)
            r0.onCreate(r4, r1)
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r4 = java.lang.String.valueOf(r1)
            android.content.Context r1 = com.umeng.socialize.utils.ContextUtil.getContext()
            if (r1 == 0) goto L2d
            android.content.Context r1 = com.umeng.socialize.utils.ContextUtil.getContext()
            com.umeng.socialize.net.analytics.SocialAnalytics.getInfostart(r1, r5, r4)
        L2d:
            int r1 = r5.ordinal()
            r3.b(r1, r6)
            com.umeng.socialize.b.a$2 r2 = new com.umeng.socialize.b.a$2
            r2.<init>(r3, r1, r4)
            com.umeng.socialize.b.a$3 r4 = new com.umeng.socialize.b.a$3
            r4.<init>(r3, r6, r5)
            com.umeng.socialize.common.QueuedWork.runInMain(r4)
            r0.getPlatformInfo(r2)
            return
    }

    public boolean b(android.app.Activity r3, com.umeng.socialize.bean.SHARE_MEDIA r4) {
            r2 = this;
            com.umeng.socialize.b.a$a r0 = r2.f
            boolean r0 = r0.a(r3, r4)
            if (r0 != 0) goto La
            r3 = 0
            return r3
        La:
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.handler.UMSSOHandler> r0 = r2.d
            java.lang.Object r0 = r0.get(r4)
            com.umeng.socialize.handler.UMSSOHandler r0 = (com.umeng.socialize.handler.UMSSOHandler) r0
            com.umeng.socialize.PlatformConfig$Platform r1 = com.umeng.socialize.PlatformConfig.getPlatform(r4)
            r0.onCreate(r3, r1)
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.handler.UMSSOHandler> r3 = r2.d
            java.lang.Object r3 = r3.get(r4)
            com.umeng.socialize.handler.UMSSOHandler r3 = (com.umeng.socialize.handler.UMSSOHandler) r3
            boolean r3 = r3.isSupport()
            return r3
    }

    public java.lang.String c(android.app.Activity r3, com.umeng.socialize.bean.SHARE_MEDIA r4) {
            r2 = this;
            com.umeng.socialize.b.a$a r0 = r2.f
            boolean r0 = r0.a(r3, r4)
            if (r0 != 0) goto Lb
            java.lang.String r3 = ""
            return r3
        Lb:
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.handler.UMSSOHandler> r0 = r2.d
            java.lang.Object r0 = r0.get(r4)
            com.umeng.socialize.handler.UMSSOHandler r0 = (com.umeng.socialize.handler.UMSSOHandler) r0
            com.umeng.socialize.PlatformConfig$Platform r1 = com.umeng.socialize.PlatformConfig.getPlatform(r4)
            r0.onCreate(r3, r1)
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.handler.UMSSOHandler> r3 = r2.d
            java.lang.Object r3 = r3.get(r4)
            com.umeng.socialize.handler.UMSSOHandler r3 = (com.umeng.socialize.handler.UMSSOHandler) r3
            java.lang.String r3 = r3.getSDKVersion()
            return r3
    }

    public void c(android.app.Activity r5, com.umeng.socialize.bean.SHARE_MEDIA r6, com.umeng.socialize.UMAuthListener r7) {
            r4 = this;
            com.umeng.socialize.b.a$a r0 = r4.f
            boolean r0 = r0.a(r5, r6)
            if (r0 != 0) goto L9
            return
        L9:
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.handler.UMSSOHandler> r0 = r4.d
            java.lang.Object r0 = r0.get(r6)
            com.umeng.socialize.handler.UMSSOHandler r0 = (com.umeng.socialize.handler.UMSSOHandler) r0
            com.umeng.socialize.PlatformConfig$Platform r1 = com.umeng.socialize.PlatformConfig.getPlatform(r6)
            r0.onCreate(r5, r1)
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r5 = java.lang.String.valueOf(r1)
            android.content.Context r1 = com.umeng.socialize.utils.ContextUtil.getContext()
            if (r1 == 0) goto L35
            android.content.Context r1 = com.umeng.socialize.utils.ContextUtil.getContext()
            java.lang.String r2 = r0.getSDKVersion()
            boolean r3 = r0.isInstall()
            com.umeng.socialize.net.analytics.SocialAnalytics.authstart(r1, r6, r2, r3, r5)
        L35:
            int r1 = r6.ordinal()
            r4.a(r1, r7)
            boolean r2 = r0.isInstall()
            com.umeng.socialize.UMAuthListener r5 = r4.a(r1, r5, r2)
            com.umeng.socialize.b.a$4 r1 = new com.umeng.socialize.b.a$4
            r1.<init>(r4, r7, r6)
            com.umeng.socialize.common.QueuedWork.runInMain(r1)
            r0.authorize(r5)
            r4.a = r6
            return
    }

    public boolean d(android.app.Activity r3, com.umeng.socialize.bean.SHARE_MEDIA r4) {
            r2 = this;
            com.umeng.socialize.b.a$a r0 = r2.f
            boolean r0 = r0.a(r3, r4)
            if (r0 != 0) goto La
            r3 = 0
            return r3
        La:
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.handler.UMSSOHandler> r0 = r2.d
            java.lang.Object r0 = r0.get(r4)
            com.umeng.socialize.handler.UMSSOHandler r0 = (com.umeng.socialize.handler.UMSSOHandler) r0
            com.umeng.socialize.PlatformConfig$Platform r1 = com.umeng.socialize.PlatformConfig.getPlatform(r4)
            r0.onCreate(r3, r1)
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.handler.UMSSOHandler> r3 = r2.d
            java.lang.Object r3 = r3.get(r4)
            com.umeng.socialize.handler.UMSSOHandler r3 = (com.umeng.socialize.handler.UMSSOHandler) r3
            boolean r3 = r3.isAuthorize()
            return r3
    }
}
