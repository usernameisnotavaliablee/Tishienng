package com.umeng.socialize.media;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class SimpleShareContent {
    public final java.lang.String DEFAULT_DESCRIPTION;
    public final java.lang.String DEFAULT_TITLE;
    public final int IMAGE_LIMIT;
    public int THUMB_LIMIT;
    public int WX_MIN_LIMIT;
    public int WX_THUMB_LIMIT;
    private com.umeng.socialize.media.UMImage a;
    private com.umeng.socialize.media.UMImage[] b;
    private java.lang.String c;
    private com.umeng.socialize.media.UMVideo d;
    private com.umeng.socialize.media.UMVideo[] e;
    private com.umeng.socialize.media.UMEmoji f;
    private com.umeng.socialize.media.UMusic g;
    private com.umeng.socialize.media.UMMin h;
    private com.umeng.socialize.media.UMQQMini i;
    private com.umeng.socialize.media.UMWeb j;
    private java.io.File k;
    private com.umeng.socialize.media.BaseMediaObject l;
    private int m;
    private java.lang.String n;
    private java.lang.String o;
    private com.umeng.socialize.interfaces.CompressListener p;

    public SimpleShareContent(com.umeng.socialize.ShareContent r4) {
            r3 = this;
            r3.<init>()
            r0 = 24576(0x6000, float:3.4438E-41)
            r3.THUMB_LIMIT = r0
            r0 = 18432(0x4800, float:2.5829E-41)
            r3.WX_THUMB_LIMIT = r0
            r0 = 131072(0x20000, float:1.83671E-40)
            r3.WX_MIN_LIMIT = r0
            r0 = 491520(0x78000, float:6.88766E-40)
            r3.IMAGE_LIMIT = r0
            java.lang.String r0 = "这里是标题"
            r3.DEFAULT_TITLE = r0
            java.lang.String r0 = "这里是描述"
            r3.DEFAULT_DESCRIPTION = r0
            java.lang.String r0 = r4.mText
            r3.c = r0
            com.umeng.socialize.media.UMediaObject r0 = r4.mMedia
            if (r0 == 0) goto L48
            boolean r1 = r0 instanceof com.umeng.socialize.media.UMImage
            if (r1 == 0) goto L48
            com.umeng.socialize.media.UMVideo[] r1 = r4.Video_mMedias
            if (r1 == 0) goto L48
            com.umeng.socialize.media.UMImage r0 = (com.umeng.socialize.media.UMImage) r0
            r3.a = r0
            r3.l = r0
            com.umeng.socialize.media.UMImage[] r0 = r4.mMedias
            if (r0 == 0) goto L3b
            int r2 = r0.length
            if (r2 <= 0) goto L3b
            r3.b = r0
        L3b:
            com.umeng.socialize.media.UMVideo r0 = r3.d
            r3.l = r0
            if (r1 == 0) goto Lbe
            int r0 = r1.length
            if (r0 <= 0) goto Lbe
            r3.e = r1
            goto Lbe
        L48:
            if (r0 == 0) goto L5e
            boolean r1 = r0 instanceof com.umeng.socialize.media.UMImage
            if (r1 == 0) goto L5e
            r1 = r0
            com.umeng.socialize.media.UMImage r1 = (com.umeng.socialize.media.UMImage) r1
            r3.a = r1
            r3.l = r1
            com.umeng.socialize.media.UMImage[] r1 = r4.mMedias
            if (r1 == 0) goto L5e
            int r2 = r1.length
            if (r2 <= 0) goto L5e
            r3.b = r1
        L5e:
            if (r0 == 0) goto L6b
            boolean r1 = r0 instanceof com.umeng.socialize.media.UMusic
            if (r1 == 0) goto L6b
            r1 = r0
            com.umeng.socialize.media.UMusic r1 = (com.umeng.socialize.media.UMusic) r1
            r3.g = r1
            r3.l = r1
        L6b:
            if (r0 == 0) goto L81
            boolean r1 = r0 instanceof com.umeng.socialize.media.UMVideo
            if (r1 == 0) goto L81
            r1 = r0
            com.umeng.socialize.media.UMVideo r1 = (com.umeng.socialize.media.UMVideo) r1
            r3.d = r1
            r3.l = r1
            com.umeng.socialize.media.UMVideo[] r1 = r4.Video_mMedias
            if (r1 == 0) goto L81
            int r2 = r1.length
            if (r2 <= 0) goto L81
            r3.e = r1
        L81:
            if (r0 == 0) goto L8e
            boolean r1 = r0 instanceof com.umeng.socialize.media.UMEmoji
            if (r1 == 0) goto L8e
            r1 = r0
            com.umeng.socialize.media.UMEmoji r1 = (com.umeng.socialize.media.UMEmoji) r1
            r3.f = r1
            r3.l = r1
        L8e:
            if (r0 == 0) goto L9b
            boolean r1 = r0 instanceof com.umeng.socialize.media.UMWeb
            if (r1 == 0) goto L9b
            r1 = r0
            com.umeng.socialize.media.UMWeb r1 = (com.umeng.socialize.media.UMWeb) r1
            r3.j = r1
            r3.l = r1
        L9b:
            if (r0 == 0) goto Laa
            boolean r1 = r0 instanceof com.umeng.socialize.media.UMMin
            if (r1 == 0) goto Laa
            r1 = r0
            com.umeng.socialize.media.UMMin r1 = (com.umeng.socialize.media.UMMin) r1
            r3.h = r1
            com.umeng.socialize.media.UMWeb r1 = r3.j
            r3.l = r1
        Laa:
            if (r0 == 0) goto Lb8
            boolean r1 = r0 instanceof com.umeng.socialize.media.UMQQMini
            if (r1 == 0) goto Lb8
            com.umeng.socialize.media.UMQQMini r0 = (com.umeng.socialize.media.UMQQMini) r0
            r3.i = r0
            com.umeng.socialize.media.UMWeb r0 = r3.j
            r3.l = r0
        Lb8:
            java.io.File r0 = r4.file
            if (r0 == 0) goto Lbe
            r3.k = r0
        Lbe:
            java.lang.String r0 = r4.subject
            r3.o = r0
            int r4 = r4.getShareType()
            r3.m = r4
            java.lang.String r4 = r3.a()
            r3.n = r4
            return
    }

    private java.lang.String a() {
            r2 = this;
            int r0 = r2.m
            r1 = 1
            if (r0 == r1) goto L44
            r1 = 2
            if (r0 == r1) goto L41
            r1 = 3
            if (r0 == r1) goto L3e
            r1 = 4
            if (r0 == r1) goto L3b
            r1 = 8
            if (r0 == r1) goto L38
            r1 = 16
            if (r0 == r1) goto L35
            r1 = 32
            if (r0 == r1) goto L32
            r1 = 64
            if (r0 == r1) goto L2f
            r1 = 128(0x80, float:1.8E-43)
            if (r0 == r1) goto L2c
            r1 = 256(0x100, float:3.59E-43)
            if (r0 == r1) goto L29
            java.lang.String r0 = "error"
            return r0
        L29:
            java.lang.String r0 = "qqMini"
            return r0
        L2c:
            java.lang.String r0 = "minapp"
            return r0
        L2f:
            java.lang.String r0 = "emoji"
            return r0
        L32:
            java.lang.String r0 = "file"
            return r0
        L35:
            java.lang.String r0 = "web"
            return r0
        L38:
            java.lang.String r0 = "video"
            return r0
        L3b:
            java.lang.String r0 = "music"
            return r0
        L3e:
            java.lang.String r0 = "textandimage"
            return r0
        L41:
            java.lang.String r0 = "image"
            return r0
        L44:
            java.lang.String r0 = "text"
            return r0
    }

    private byte[] b() {
            r3 = this;
            byte[] r0 = com.umeng.socialize.utils.DefaultClass.getBytes()
            int r1 = com.umeng.socialize.utils.ContextUtil.getIcon()
            if (r1 == 0) goto L29
            com.umeng.socialize.media.UMImage r0 = new com.umeng.socialize.media.UMImage
            android.content.Context r1 = com.umeng.socialize.utils.ContextUtil.getContext()
            int r2 = com.umeng.socialize.utils.ContextUtil.getIcon()
            r0.<init>(r1, r2)
            int r1 = r3.WX_THUMB_LIMIT
            byte[] r0 = com.umeng.socialize.c.a.a.a(r0, r1)
            if (r0 == 0) goto L24
            int r1 = r0.length
            if (r1 > 0) goto L23
            goto L24
        L23:
            return r0
        L24:
            java.lang.String r1 = com.umeng.socialize.utils.UmengText.IMAGE.SHARECONTENT_THUMB_ERROR
            com.umeng.socialize.utils.SLog.E(r1)
        L29:
            return r0
    }

    public boolean canFileValid(com.umeng.socialize.media.UMImage r1) {
            r0 = this;
            java.io.File r1 = r1.asFileImage()
            if (r1 == 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    public java.lang.String getAssertSubject() {
            r1 = this;
            java.lang.String r0 = r1.o
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Lb
            java.lang.String r0 = "umengshare"
            return r0
        Lb:
            java.lang.String r0 = r1.o
            return r0
    }

    public com.umeng.socialize.media.BaseMediaObject getBaseMediaObject() {
            r1 = this;
            com.umeng.socialize.media.BaseMediaObject r0 = r1.l
            return r0
    }

    public java.io.File getFile() {
            r1 = this;
            java.io.File r0 = r1.k
            return r0
    }

    public com.umeng.socialize.media.UMImage getImage() {
            r1 = this;
            com.umeng.socialize.media.UMImage r0 = r1.a
            return r0
    }

    public byte[] getImageData(com.umeng.socialize.media.UMImage r1) {
            r0 = this;
            byte[] r1 = r1.asBinImage()
            return r1
    }

    public byte[] getImageThumb(com.umeng.socialize.media.UMImage r2) {
            r1 = this;
            com.umeng.socialize.media.UMImage r0 = r2.getThumbImage()
            if (r0 == 0) goto L21
            com.umeng.socialize.media.UMImage r2 = r2.getThumbImage()
            int r0 = r1.WX_THUMB_LIMIT
            byte[] r2 = com.umeng.socialize.c.a.a.a(r2, r0)
            if (r2 == 0) goto L17
            int r0 = r2.length
            if (r0 > 0) goto L16
            goto L17
        L16:
            return r2
        L17:
            java.lang.String r2 = com.umeng.socialize.utils.UmengText.IMAGE.SHARECONTENT_THUMB_ERROR
            com.umeng.socialize.utils.SLog.E(r2)
            byte[] r2 = r1.b()
            return r2
        L21:
            byte[] r2 = r1.b()
            return r2
    }

    public com.umeng.socialize.media.UMusic getMusic() {
            r1 = this;
            com.umeng.socialize.media.UMusic r0 = r1.g
            return r0
    }

    public java.lang.String getMusicTargetUrl(com.umeng.socialize.media.UMusic r2) {
            r1 = this;
            java.lang.String r0 = r2.getmTargetUrl()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Lf
            java.lang.String r2 = r2.toUrl()
            return r2
        Lf:
            java.lang.String r2 = r2.getmTargetUrl()
            return r2
    }

    public com.umeng.socialize.media.UMQQMini getQQMini() {
            r1 = this;
            com.umeng.socialize.media.UMQQMini r0 = r1.i
            return r0
    }

    public java.lang.String getStrStyle() {
            r1 = this;
            java.lang.String r0 = r1.n
            return r0
    }

    public byte[] getStrictImageData(com.umeng.socialize.media.UMImage r3) {
            r2 = this;
            int r0 = r2.getUMImageScale(r3)
            r1 = 491520(0x78000, float:6.88766E-40)
            if (r0 <= r1) goto L1e
            com.umeng.socialize.media.UMImage r3 = r2.getImage()
            byte[] r3 = com.umeng.socialize.c.a.a.a(r3, r1)
            if (r3 == 0) goto L17
            int r0 = r3.length
            if (r0 <= 0) goto L17
            return r3
        L17:
            java.lang.String r3 = com.umeng.socialize.utils.UmengText.IMAGE.SHARECONTENT_THUMB_ERROR
            com.umeng.socialize.utils.SLog.E(r3)
            r3 = 0
            return r3
        L1e:
            byte[] r3 = r2.getImageData(r3)
            return r3
    }

    public java.lang.String getSubject() {
            r1 = this;
            java.lang.String r0 = r1.o
            return r0
    }

    public java.lang.String getText() {
            r1 = this;
            java.lang.String r0 = r1.c
            return r0
    }

    public int getUMImageScale(com.umeng.socialize.media.UMImage r1) {
            r0 = this;
            int r1 = com.umeng.socialize.c.a.a.a(r1)
            return r1
    }

    public com.umeng.socialize.media.UMEmoji getUmEmoji() {
            r1 = this;
            com.umeng.socialize.media.UMEmoji r0 = r1.f
            return r0
    }

    public com.umeng.socialize.media.UMMin getUmMin() {
            r1 = this;
            com.umeng.socialize.media.UMMin r0 = r1.h
            return r0
    }

    public com.umeng.socialize.media.UMVideo[] getUmVideos() {
            r1 = this;
            com.umeng.socialize.media.UMVideo[] r0 = r1.e
            return r0
    }

    public com.umeng.socialize.media.UMWeb getUmWeb() {
            r1 = this;
            com.umeng.socialize.media.UMWeb r0 = r1.j
            return r0
    }

    public com.umeng.socialize.media.UMVideo getVideo() {
            r1 = this;
            com.umeng.socialize.media.UMVideo r0 = r1.d
            return r0
    }

    public com.umeng.socialize.media.UMImage[] getmImages() {
            r1 = this;
            com.umeng.socialize.media.UMImage[] r0 = r1.b
            return r0
    }

    public int getmStyle() {
            r1 = this;
            int r0 = r1.m
            return r0
    }

    public java.lang.String objectSetDescription(com.umeng.socialize.media.BaseMediaObject r3) {
            r2 = this;
            java.lang.String r0 = r3.getDescription()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Ld
            java.lang.String r3 = "这里是描述"
            return r3
        Ld:
            java.lang.String r3 = r3.getDescription()
            int r0 = r3.length()
            r1 = 1024(0x400, float:1.435E-42)
            if (r0 <= r1) goto L1e
            r0 = 0
            java.lang.String r3 = r3.substring(r0, r1)
        L1e:
            return r3
    }

    public byte[] objectSetMInAppThumb(com.umeng.socialize.media.BaseMediaObject r3) {
            r2 = this;
            com.umeng.socialize.media.UMImage r0 = r3.getThumbImage()
            if (r0 == 0) goto L49
            com.umeng.socialize.interfaces.CompressListener r0 = r2.p
            if (r0 == 0) goto L2c
            com.umeng.socialize.media.UMImage r3 = r3.getThumbImage()
            if (r3 != 0) goto L15
            byte[] r3 = com.umeng.socialize.utils.DefaultClass.getBytes()
            return r3
        L15:
            byte[] r0 = r3.asBinImage()
            if (r0 == 0) goto L25
            int r3 = com.umeng.socialize.c.a.a.a(r3)
            int r1 = r2.WX_MIN_LIMIT
            if (r3 <= r1) goto L24
            goto L25
        L24:
            return r0
        L25:
            com.umeng.socialize.interfaces.CompressListener r3 = r2.p
            byte[] r3 = r3.compressThumb(r0)
            return r3
        L2c:
            com.umeng.socialize.media.UMImage r3 = r3.getThumbImage()
            byte[] r3 = r3.asBinImage()
            int r0 = r2.WX_MIN_LIMIT
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG
            byte[] r3 = com.umeng.socialize.c.a.a.a(r3, r0, r1)
            if (r3 == 0) goto L43
            int r0 = r3.length
            if (r0 > 0) goto L42
            goto L43
        L42:
            return r3
        L43:
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.IMAGE.SHARECONTENT_THUMB_ERROR
            com.umeng.socialize.utils.SLog.E(r0)
            return r3
        L49:
            byte[] r3 = com.umeng.socialize.utils.DefaultClass.getBytes()
            return r3
    }

    public java.lang.String objectSetText(java.lang.String r2) {
            r1 = this;
            r0 = 10240(0x2800, float:1.4349E-41)
            java.lang.String r2 = r1.objectSetText(r2, r0)
            return r2
    }

    public java.lang.String objectSetText(java.lang.String r2, int r3) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L9
            java.lang.String r2 = "这里是描述"
            return r2
        L9:
            int r0 = r2.length()
            if (r0 <= r3) goto L14
            r0 = 0
            java.lang.String r2 = r2.substring(r0, r3)
        L14:
            return r2
    }

    public byte[] objectSetThumb(com.umeng.socialize.media.BaseMediaObject r3) {
            r2 = this;
            com.umeng.socialize.media.UMImage r0 = r3.getThumbImage()
            if (r0 == 0) goto L47
            com.umeng.socialize.interfaces.CompressListener r0 = r2.p
            if (r0 == 0) goto L2c
            com.umeng.socialize.media.UMImage r3 = r3.getThumbImage()
            if (r3 != 0) goto L15
            byte[] r3 = com.umeng.socialize.utils.DefaultClass.getBytes()
            return r3
        L15:
            byte[] r0 = r3.asBinImage()
            if (r0 == 0) goto L25
            int r3 = com.umeng.socialize.c.a.a.a(r3)
            int r1 = r2.THUMB_LIMIT
            if (r3 <= r1) goto L24
            goto L25
        L24:
            return r0
        L25:
            com.umeng.socialize.interfaces.CompressListener r3 = r2.p
            byte[] r3 = r3.compressThumb(r0)
            return r3
        L2c:
            com.umeng.socialize.media.UMImage r3 = r3.getThumbImage()
            int r0 = r2.THUMB_LIMIT
            byte[] r3 = com.umeng.socialize.c.a.a.a(r3, r0)
            if (r3 == 0) goto L3d
            int r0 = r3.length
            if (r0 > 0) goto L3c
            goto L3d
        L3c:
            return r3
        L3d:
            java.lang.String r3 = com.umeng.socialize.utils.UmengText.IMAGE.SHARECONTENT_THUMB_ERROR
            com.umeng.socialize.utils.SLog.E(r3)
            byte[] r3 = r2.b()
            return r3
        L47:
            byte[] r3 = r2.b()
            return r3
    }

    public java.lang.String objectSetTitle(com.umeng.socialize.media.BaseMediaObject r3) {
            r2 = this;
            java.lang.String r0 = r3.getTitle()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Ld
            java.lang.String r3 = "这里是标题"
            return r3
        Ld:
            java.lang.String r3 = r3.getTitle()
            int r0 = r3.length()
            r1 = 512(0x200, float:7.17E-43)
            if (r0 <= r1) goto L1e
            r0 = 0
            java.lang.String r3 = r3.substring(r0, r1)
        L1e:
            return r3
    }

    public void setCompressListener(com.umeng.socialize.interfaces.CompressListener r1) {
            r0 = this;
            r0.p = r1
            return
    }

    public void setImage(com.umeng.socialize.media.UMImage r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setMusic(com.umeng.socialize.media.UMusic r1) {
            r0 = this;
            r0.g = r1
            return
    }

    public void setText(java.lang.String r1) {
            r0 = this;
            r0.c = r1
            return
    }

    public void setVideo(com.umeng.socialize.media.UMVideo r1) {
            r0 = this;
            r0.d = r1
            return
    }

    public java.lang.String subString(java.lang.String r2, int r3) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L11
            int r0 = r2.length()
            if (r0 <= r3) goto L11
            r0 = 0
            java.lang.String r2 = r2.substring(r0, r3)
        L11:
            return r2
    }
}
