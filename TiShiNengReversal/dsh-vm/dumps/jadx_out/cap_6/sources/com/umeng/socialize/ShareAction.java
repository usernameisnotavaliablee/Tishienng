package com.umeng.socialize;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ShareAction {
    private com.umeng.socialize.ShareContent a;
    private com.umeng.socialize.bean.SHARE_MEDIA b;
    private com.umeng.socialize.UMShareListener c;
    private com.umeng.socialize.utils.ShareBoardlistener d;
    private android.app.Activity e;
    private java.util.List<com.umeng.socialize.bean.SHARE_MEDIA> f;
    private final java.util.List<com.umeng.socialize.shareboard.SnsPlatform> g;
    private java.util.List<com.umeng.socialize.ShareContent> h;
    private java.util.List<com.umeng.socialize.UMShareListener> i;
    private int j;
    private android.view.View k;
    private boolean l;
    private com.umeng.socialize.shareboard.ShareBoard m;
    private com.umeng.socialize.utils.ShareBoardlistener n;
    private com.umeng.socialize.utils.ShareBoardlistener o;



    public ShareAction(android.app.Activity r2) {
            r1 = this;
            r1.<init>()
            com.umeng.socialize.ShareContent r0 = new com.umeng.socialize.ShareContent
            r0.<init>()
            r1.a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.g = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.h = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.i = r0
            r0 = 80
            r1.j = r0
            com.umeng.socialize.ShareAction$1 r0 = new com.umeng.socialize.ShareAction$1
            r0.<init>(r1)
            r1.n = r0
            com.umeng.socialize.ShareAction$2 r0 = new com.umeng.socialize.ShareAction$2
            r0.<init>(r1)
            r1.o = r0
            if (r2 == 0) goto L40
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            java.lang.Object r2 = r0.get()
            android.app.Activity r2 = (android.app.Activity) r2
            r1.e = r2
        L40:
            return
    }

    static /* synthetic */ com.umeng.socialize.ShareContent a(com.umeng.socialize.ShareAction r0, com.umeng.socialize.ShareContent r1) {
            r0.a = r1
            return r1
    }

    static /* synthetic */ com.umeng.socialize.UMShareListener a(com.umeng.socialize.ShareAction r0, com.umeng.socialize.UMShareListener r1) {
            r0.c = r1
            return r1
    }

    static /* synthetic */ java.util.List a(com.umeng.socialize.ShareAction r0) {
            java.util.List<com.umeng.socialize.bean.SHARE_MEDIA> r0 = r0.f
            return r0
    }

    static /* synthetic */ java.util.List b(com.umeng.socialize.ShareAction r0) {
            java.util.List<com.umeng.socialize.ShareContent> r0 = r0.h
            return r0
    }

    static /* synthetic */ java.util.List c(com.umeng.socialize.ShareAction r0) {
            java.util.List<com.umeng.socialize.UMShareListener> r0 = r0.i
            return r0
    }

    public static android.graphics.Rect locateView(android.view.View r4) {
            r0 = 2
            int[] r0 = new int[r0]
            r1 = 0
            if (r4 != 0) goto L7
            return r1
        L7:
            r4.getLocationOnScreen(r0)     // Catch: java.lang.NullPointerException -> L2a
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r2 = 0
            r2 = r0[r2]
            r1.left = r2
            r3 = 1
            r0 = r0[r3]
            r1.top = r0
            int r0 = r4.getWidth()
            int r2 = r2 + r0
            r1.right = r2
            int r0 = r1.top
            int r4 = r4.getHeight()
            int r0 = r0 + r4
            r1.bottom = r0
            return r1
        L2a:
            r4 = move-exception
            com.umeng.socialize.utils.SLog.error(r4)
            return r1
    }

    public com.umeng.socialize.ShareAction addButton(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r2 = this;
            java.util.List<com.umeng.socialize.shareboard.SnsPlatform> r0 = r2.g
            r1 = 0
            com.umeng.socialize.shareboard.SnsPlatform r3 = com.umeng.socialize.bean.SHARE_MEDIA.createSnsPlatform(r3, r4, r5, r6, r1)
            r0.add(r3)
            return r2
    }

    public com.umeng.socialize.ShareAction bySystem() {
            r1 = this;
            r0 = 1
            r1.l = r0
            return r1
    }

    public void close() {
            r1 = this;
            com.umeng.socialize.shareboard.ShareBoard r0 = r1.m
            if (r0 == 0) goto La
            r0.dismiss()
            r0 = 0
            r1.m = r0
        La:
            return
    }

    public com.umeng.socialize.bean.SHARE_MEDIA getPlatform() {
            r1 = this;
            com.umeng.socialize.bean.SHARE_MEDIA r0 = r1.b
            return r0
    }

    public com.umeng.socialize.ShareContent getShareContent() {
            r1 = this;
            com.umeng.socialize.ShareContent r0 = r1.a
            return r0
    }

    public boolean getUrlValid() {
            r2 = this;
            com.umeng.socialize.ShareContent r0 = r2.a
            if (r0 == 0) goto L24
            com.umeng.socialize.media.UMediaObject r0 = r0.mMedia
            if (r0 == 0) goto L24
            boolean r1 = r0 instanceof com.umeng.socialize.media.UMWeb
            if (r1 == 0) goto L24
            java.lang.String r0 = r0.toUrl()
            if (r0 == 0) goto L24
            com.umeng.socialize.ShareContent r0 = r2.a
            com.umeng.socialize.media.UMediaObject r0 = r0.mMedia
            java.lang.String r0 = r0.toUrl()
            java.lang.String r1 = "http"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L24
            r0 = 0
            return r0
        L24:
            r0 = 1
            return r0
    }

    public void open() {
            r1 = this;
            r0 = 0
            r1.open(r0)
            return
    }

    public void open(com.umeng.socialize.shareboard.ShareBoardConfig r7) {
            r6 = this;
            android.app.Activity r0 = r6.e
            boolean r0 = com.umeng.socialize.utils.CommonUtil.isSilentMode(r0)
            if (r0 == 0) goto L9
            goto L6c
        L9:
            java.util.List<com.umeng.socialize.shareboard.SnsPlatform> r0 = r6.g
            int r0 = r0.size()
            r1 = 1
            java.lang.String r2 = "content"
            java.lang.String r3 = "listener"
            r4 = 0
            if (r0 == 0) goto L6d
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.umeng.socialize.UMShareListener r5 = r6.c
            r0.put(r3, r5)
            com.umeng.socialize.ShareContent r3 = r6.a
            r0.put(r2, r3)
            com.umeng.socialize.shareboard.ShareBoard r0 = new com.umeng.socialize.shareboard.ShareBoard     // Catch: java.lang.Exception -> L3b
            android.app.Activity r2 = r6.e     // Catch: java.lang.Exception -> L3b
            java.util.List<com.umeng.socialize.shareboard.SnsPlatform> r3 = r6.g     // Catch: java.lang.Exception -> L3b
            r0.<init>(r2, r3, r7)     // Catch: java.lang.Exception -> L3b
            r6.m = r0     // Catch: java.lang.Exception -> L3b
            com.umeng.socialize.utils.ShareBoardlistener r7 = r6.d     // Catch: java.lang.Exception -> L3b
            if (r7 != 0) goto L3d
            com.umeng.socialize.utils.ShareBoardlistener r7 = r6.o     // Catch: java.lang.Exception -> L3b
            r0.setShareBoardlistener(r7)     // Catch: java.lang.Exception -> L3b
            goto L40
        L3b:
            r7 = move-exception
            goto L69
        L3d:
            r0.setShareBoardlistener(r7)     // Catch: java.lang.Exception -> L3b
        L40:
            com.umeng.socialize.shareboard.ShareBoard r7 = r6.m     // Catch: java.lang.Exception -> L3b
            r7.setFocusable(r1)     // Catch: java.lang.Exception -> L3b
            com.umeng.socialize.shareboard.ShareBoard r7 = r6.m     // Catch: java.lang.Exception -> L3b
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable     // Catch: java.lang.Exception -> L3b
            r0.<init>()     // Catch: java.lang.Exception -> L3b
            r7.setBackgroundDrawable(r0)     // Catch: java.lang.Exception -> L3b
            android.view.View r7 = r6.k     // Catch: java.lang.Exception -> L3b
            if (r7 != 0) goto L5f
            android.app.Activity r7 = r6.e     // Catch: java.lang.Exception -> L3b
            android.view.Window r7 = r7.getWindow()     // Catch: java.lang.Exception -> L3b
            android.view.View r7 = r7.getDecorView()     // Catch: java.lang.Exception -> L3b
            r6.k = r7     // Catch: java.lang.Exception -> L3b
        L5f:
            com.umeng.socialize.shareboard.ShareBoard r7 = r6.m     // Catch: java.lang.Exception -> L3b
            android.view.View r0 = r6.k     // Catch: java.lang.Exception -> L3b
            int r1 = r6.j     // Catch: java.lang.Exception -> L3b
            r7.showAtLocation(r0, r1, r4, r4)     // Catch: java.lang.Exception -> L3b
            goto L6c
        L69:
            com.umeng.socialize.utils.SLog.error(r7)
        L6c:
            return
        L6d:
            java.util.List<com.umeng.socialize.shareboard.SnsPlatform> r0 = r6.g
            com.umeng.socialize.bean.SHARE_MEDIA r5 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN
            com.umeng.socialize.shareboard.SnsPlatform r5 = r5.toSnsPlatform()
            r0.add(r5)
            java.util.List<com.umeng.socialize.shareboard.SnsPlatform> r0 = r6.g
            com.umeng.socialize.bean.SHARE_MEDIA r5 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN_CIRCLE
            com.umeng.socialize.shareboard.SnsPlatform r5 = r5.toSnsPlatform()
            r0.add(r5)
            java.util.List<com.umeng.socialize.shareboard.SnsPlatform> r0 = r6.g
            com.umeng.socialize.bean.SHARE_MEDIA r5 = com.umeng.socialize.bean.SHARE_MEDIA.SINA
            com.umeng.socialize.shareboard.SnsPlatform r5 = r5.toSnsPlatform()
            r0.add(r5)
            java.util.List<com.umeng.socialize.shareboard.SnsPlatform> r0 = r6.g
            com.umeng.socialize.bean.SHARE_MEDIA r5 = com.umeng.socialize.bean.SHARE_MEDIA.QQ
            com.umeng.socialize.shareboard.SnsPlatform r5 = r5.toSnsPlatform()
            r0.add(r5)
            java.util.List<com.umeng.socialize.shareboard.SnsPlatform> r0 = r6.g
            com.umeng.socialize.bean.SHARE_MEDIA r5 = com.umeng.socialize.bean.SHARE_MEDIA.DINGTALK
            com.umeng.socialize.shareboard.SnsPlatform r5 = r5.toSnsPlatform()
            r0.add(r5)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.umeng.socialize.UMShareListener r5 = r6.c
            r0.put(r3, r5)
            com.umeng.socialize.ShareContent r3 = r6.a
            r0.put(r2, r3)
            com.umeng.socialize.shareboard.ShareBoard r0 = new com.umeng.socialize.shareboard.ShareBoard
            android.app.Activity r2 = r6.e
            java.util.List<com.umeng.socialize.shareboard.SnsPlatform> r3 = r6.g
            r0.<init>(r2, r3, r7)
            r6.m = r0
            com.umeng.socialize.utils.ShareBoardlistener r7 = r6.d
            if (r7 != 0) goto Lc8
            com.umeng.socialize.utils.ShareBoardlistener r7 = r6.n
            r0.setShareBoardlistener(r7)
            goto Lcb
        Lc8:
            r0.setShareBoardlistener(r7)
        Lcb:
            com.umeng.socialize.shareboard.ShareBoard r7 = r6.m
            r7.setFocusable(r1)
            com.umeng.socialize.shareboard.ShareBoard r7 = r6.m
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            r0.<init>()
            r7.setBackgroundDrawable(r0)
            android.view.View r7 = r6.k
            if (r7 != 0) goto Lea
            android.app.Activity r7 = r6.e
            android.view.Window r7 = r7.getWindow()
            android.view.View r7 = r7.getDecorView()
            r6.k = r7
        Lea:
            com.umeng.socialize.shareboard.ShareBoard r7 = r6.m
            android.view.View r0 = r6.k
            r1 = 80
            r7.showAtLocation(r0, r1, r4, r4)
            return
    }

    public com.umeng.socialize.ShareAction setCallback(com.umeng.socialize.UMShareListener r1) {
            r0 = this;
            r0.c = r1
            return r0
    }

    @java.lang.Deprecated
    public com.umeng.socialize.ShareAction setContentList(com.umeng.socialize.ShareContent... r2) {
            r1 = this;
            if (r2 == 0) goto L14
            java.util.List r0 = java.util.Arrays.asList(r2)
            int r0 = r0.size()
            if (r0 != 0) goto Ld
            goto L14
        Ld:
            java.util.List r2 = java.util.Arrays.asList(r2)
            r1.h = r2
            return r1
        L14:
            com.umeng.socialize.ShareContent r2 = new com.umeng.socialize.ShareContent
            r2.<init>()
            java.lang.String r0 = "empty"
            r2.mText = r0
            java.util.List<com.umeng.socialize.ShareContent> r0 = r1.h
            r0.add(r2)
            return r1
    }

    public com.umeng.socialize.ShareAction setDisplayList(com.umeng.socialize.bean.SHARE_MEDIA... r3) {
            r2 = this;
            java.util.List r3 = java.util.Arrays.asList(r3)
            r2.f = r3
            java.util.List<com.umeng.socialize.shareboard.SnsPlatform> r3 = r2.g
            r3.clear()
            java.util.List<com.umeng.socialize.bean.SHARE_MEDIA> r3 = r2.f
            java.util.Iterator r3 = r3.iterator()
        L11:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r3.next()
            com.umeng.socialize.bean.SHARE_MEDIA r0 = (com.umeng.socialize.bean.SHARE_MEDIA) r0
            java.util.List<com.umeng.socialize.shareboard.SnsPlatform> r1 = r2.g
            com.umeng.socialize.shareboard.SnsPlatform r0 = r0.toSnsPlatform()
            r1.add(r0)
            goto L11
        L27:
            return r2
    }

    @java.lang.Deprecated
    public com.umeng.socialize.ShareAction setListenerList(com.umeng.socialize.UMShareListener... r1) {
            r0 = this;
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.i = r1
            return r0
    }

    public com.umeng.socialize.ShareAction setPlatform(com.umeng.socialize.bean.SHARE_MEDIA r1) {
            r0 = this;
            r0.b = r1
            return r0
    }

    public com.umeng.socialize.ShareAction setShareContent(com.umeng.socialize.ShareContent r1) {
            r0 = this;
            r0.a = r1
            return r0
    }

    public com.umeng.socialize.ShareAction setShareboardclickCallback(com.umeng.socialize.utils.ShareBoardlistener r1) {
            r0 = this;
            r0.d = r1
            return r0
    }

    public void share() {
            r3 = this;
            android.app.Activity r0 = r3.e
            com.umeng.socialize.UMShareAPI r0 = com.umeng.socialize.UMShareAPI.get(r0)
            if (r0 == 0) goto L19
            com.umeng.socialize.ShareContent r1 = r3.getShareContent()
            if (r1 == 0) goto L12
            boolean r2 = r3.l
            r1.bySystem = r2
        L12:
            android.app.Activity r1 = r3.e
            com.umeng.socialize.UMShareListener r2 = r3.c
            r0.doShare(r1, r3, r2)
        L19:
            return
    }

    public com.umeng.socialize.ShareAction withApp(java.io.File r2) {
            r1 = this;
            com.umeng.socialize.ShareContent r0 = r1.a
            r0.app = r2
            return r1
    }

    public com.umeng.socialize.ShareAction withExtra(com.umeng.socialize.media.UMImage r2) {
            r1 = this;
            com.umeng.socialize.ShareContent r0 = r1.a
            r0.mExtra = r2
            return r1
    }

    public com.umeng.socialize.ShareAction withFile(java.io.File r2) {
            r1 = this;
            com.umeng.socialize.ShareContent r0 = r1.a
            r0.file = r2
            return r1
    }

    public com.umeng.socialize.ShareAction withFollow(java.lang.String r2) {
            r1 = this;
            com.umeng.socialize.ShareContent r0 = r1.a
            r0.mFollow = r2
            return r1
    }

    public com.umeng.socialize.ShareAction withMedia(com.umeng.socialize.media.UMEmoji r2) {
            r1 = this;
            com.umeng.socialize.ShareContent r0 = r1.a
            r0.mMedia = r2
            return r1
    }

    public com.umeng.socialize.ShareAction withMedia(com.umeng.socialize.media.UMImage r2) {
            r1 = this;
            com.umeng.socialize.ShareContent r0 = r1.a
            r0.mMedia = r2
            return r1
    }

    public com.umeng.socialize.ShareAction withMedia(com.umeng.socialize.media.UMMin r2) {
            r1 = this;
            com.umeng.socialize.ShareContent r0 = r1.a
            r0.mMedia = r2
            return r1
    }

    public com.umeng.socialize.ShareAction withMedia(com.umeng.socialize.media.UMQQMini r2) {
            r1 = this;
            com.umeng.socialize.ShareContent r0 = r1.a
            r0.mMedia = r2
            return r1
    }

    public com.umeng.socialize.ShareAction withMedia(com.umeng.socialize.media.UMVideo r2) {
            r1 = this;
            com.umeng.socialize.ShareContent r0 = r1.a
            r0.mMedia = r2
            return r1
    }

    public com.umeng.socialize.ShareAction withMedia(com.umeng.socialize.media.UMWeb r2) {
            r1 = this;
            com.umeng.socialize.ShareContent r0 = r1.a
            r0.mMedia = r2
            return r1
    }

    public com.umeng.socialize.ShareAction withMedia(com.umeng.socialize.media.UMusic r2) {
            r1 = this;
            com.umeng.socialize.ShareContent r0 = r1.a
            r0.mMedia = r2
            return r1
    }

    public com.umeng.socialize.ShareAction withMedias(com.umeng.socialize.media.UMImage... r3) {
            r2 = this;
            if (r3 == 0) goto Lc
            int r0 = r3.length
            if (r0 <= 0) goto Lc
            com.umeng.socialize.ShareContent r0 = r2.a
            r1 = 0
            r1 = r3[r1]
            r0.mMedia = r1
        Lc:
            com.umeng.socialize.ShareContent r0 = r2.a
            r0.mMedias = r3
            return r2
    }

    public com.umeng.socialize.ShareAction withMedias(com.umeng.socialize.media.UMVideo... r3) {
            r2 = this;
            if (r3 == 0) goto Lc
            int r0 = r3.length
            if (r0 <= 0) goto Lc
            com.umeng.socialize.ShareContent r0 = r2.a
            r1 = 0
            r1 = r3[r1]
            r0.mMedia = r1
        Lc:
            com.umeng.socialize.ShareContent r0 = r2.a
            r0.Video_mMedias = r3
            return r2
    }

    public com.umeng.socialize.ShareAction withShareBoardDirection(android.view.View r1, int r2) {
            r0 = this;
            r0.j = r2
            r0.k = r1
            return r0
    }

    public com.umeng.socialize.ShareAction withSubject(java.lang.String r2) {
            r1 = this;
            com.umeng.socialize.ShareContent r0 = r1.a
            r0.subject = r2
            return r1
    }

    public com.umeng.socialize.ShareAction withText(java.lang.String r2) {
            r1 = this;
            com.umeng.socialize.ShareContent r0 = r1.a
            r0.mText = r2
            return r1
    }
}
