package com.umeng.socialize.media;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class WeiXinShareContent extends com.umeng.socialize.media.SimpleShareContent {
    private final boolean bySystem;

    public WeiXinShareContent(com.umeng.socialize.ShareContent r1) {
            r0 = this;
            r0.<init>(r1)
            boolean r1 = r1.bySystem
            r0.bySystem = r1
            return
    }

    private com.tencent.mm.opensdk.modelmsg.WXMediaMessage buildEmojiParams() {
            r3 = this;
            com.umeng.socialize.media.UMEmoji r0 = r3.getUmEmoji()
            if (r0 == 0) goto L15
            java.io.File r1 = r0.asFileImage()
            if (r1 == 0) goto L15
            java.io.File r1 = r0.asFileImage()
            java.lang.String r1 = r1.toString()
            goto L17
        L15:
            java.lang.String r1 = ""
        L17:
            com.tencent.mm.opensdk.modelmsg.WXEmojiObject r2 = new com.tencent.mm.opensdk.modelmsg.WXEmojiObject
            r2.<init>()
            r2.emojiPath = r1
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r1 = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage
            r1.<init>()
            r1.mediaObject = r2
            byte[] r0 = r3.objectSetThumb(r0)
            r1.thumbData = r0
            return r1
    }

    private com.tencent.mm.opensdk.modelmsg.WXMediaMessage buildEmojiParamsWithFileProvider(android.content.Context r4, java.lang.String r5) {
            r3 = this;
            com.umeng.socialize.media.UMEmoji r0 = r3.getUmEmoji()
            if (r0 == 0) goto L1e
            java.io.File r1 = r0.asFileImage()
            if (r1 == 0) goto L1e
            java.io.File r1 = r0.asFileImage()
            java.lang.String r1 = r1.toString()
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            java.lang.String r4 = r3.getFileUri(r4, r2, r5)
            goto L20
        L1e:
            java.lang.String r4 = ""
        L20:
            com.tencent.mm.opensdk.modelmsg.WXEmojiObject r5 = new com.tencent.mm.opensdk.modelmsg.WXEmojiObject
            r5.<init>()
            r5.emojiPath = r4
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r4 = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage
            r4.<init>()
            r4.mediaObject = r5
            byte[] r5 = r3.objectSetThumb(r0)
            r4.thumbData = r5
            return r4
    }

    private com.tencent.mm.opensdk.modelmsg.WXMediaMessage buildFileParams() {
            r2 = this;
            com.tencent.mm.opensdk.modelmsg.WXFileObject r0 = new com.tencent.mm.opensdk.modelmsg.WXFileObject
            r0.<init>()
            java.io.File r1 = r2.getFile()
            byte[] r1 = com.umeng.socialize.utils.SocializeUtils.File2byte(r1)
            r0.fileData = r1
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r1 = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage
            r1.<init>()
            r1.mediaObject = r0
            java.lang.String r0 = r2.getText()
            r1.description = r0
            java.lang.String r0 = r2.getSubject()
            r1.title = r0
            return r1
    }

    private com.tencent.mm.opensdk.modelmsg.WXMediaMessage buildImageParams() {
            r4 = this;
            com.umeng.socialize.media.UMImage r0 = r4.getImage()
            com.tencent.mm.opensdk.modelmsg.WXImageObject r1 = new com.tencent.mm.opensdk.modelmsg.WXImageObject
            r1.<init>()
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r2 = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage
            r2.<init>()
            byte[] r3 = r0.asBinImage()
            r1.imageData = r3
            boolean r3 = r4.canFileValid(r0)
            if (r3 == 0) goto L28
            java.io.File r3 = r0.asFileImage()
            java.lang.String r3 = r3.toString()
            r1.imagePath = r3
            r3 = 0
            r1.imageData = r3
            goto L2e
        L28:
            byte[] r3 = r4.getStrictImageData(r0)
            r1.imageData = r3
        L2e:
            byte[] r0 = r4.getImageThumb(r0)
            r2.thumbData = r0
            r2.mediaObject = r1
            return r2
    }

    private com.tencent.mm.opensdk.modelmsg.WXMediaMessage buildImageParamsWithFileProvider(android.content.Context r6, java.lang.String r7) {
            r5 = this;
            com.umeng.socialize.media.UMImage r0 = r5.getImage()
            com.tencent.mm.opensdk.modelmsg.WXImageObject r1 = new com.tencent.mm.opensdk.modelmsg.WXImageObject
            r1.<init>()
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r2 = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage
            r2.<init>()
            byte[] r3 = r0.asBinImage()
            r1.imageData = r3
            boolean r3 = r5.canFileValid(r0)
            if (r3 == 0) goto L31
            java.io.File r3 = r0.asFileImage()
            java.lang.String r3 = r3.toString()
            java.io.File r4 = new java.io.File
            r4.<init>(r3)
            java.lang.String r6 = r5.getFileUri(r6, r4, r7)
            r1.imagePath = r6
            r6 = 0
            r1.imageData = r6
            goto L37
        L31:
            byte[] r6 = r5.getStrictImageData(r0)
            r1.imageData = r6
        L37:
            byte[] r6 = r5.getImageThumb(r0)
            r2.thumbData = r6
            r2.mediaObject = r1
            return r2
    }

    private com.tencent.mm.opensdk.modelmsg.WXMediaMessage buildMinApp() {
            r4 = this;
            com.umeng.socialize.media.UMMin r0 = r4.getUmMin()
            com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject r1 = new com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject
            r1.<init>()
            java.lang.String r2 = r0.toUrl()
            r1.webpageUrl = r2
            java.lang.String r2 = r0.getUserName()
            r1.userName = r2
            java.lang.String r2 = r0.getPath()
            r1.path = r2
            int r2 = com.umeng.socialize.Config.getMINITYPE()
            r1.miniprogramType = r2
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r2 = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage
            r2.<init>()
            java.lang.String r3 = r4.objectSetTitle(r0)
            r2.title = r3
            java.lang.String r3 = r4.objectSetDescription(r0)
            r2.description = r3
            byte[] r0 = r4.objectSetMInAppThumb(r0)
            r2.thumbData = r0
            r2.mediaObject = r1
            return r2
    }

    private com.tencent.mm.opensdk.modelmsg.WXMediaMessage buildMusicParams() {
            r4 = this;
            com.umeng.socialize.media.UMusic r0 = r4.getMusic()
            com.tencent.mm.opensdk.modelmsg.WXMusicObject r1 = new com.tencent.mm.opensdk.modelmsg.WXMusicObject
            r1.<init>()
            java.lang.String r2 = r4.getMusicTargetUrl(r0)
            r1.musicUrl = r2
            java.lang.String r2 = r0.toUrl()
            r1.musicDataUrl = r2
            java.lang.String r2 = r0.getLowBandDataUrl()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L25
            java.lang.String r2 = r0.getLowBandDataUrl()
            r1.musicLowBandDataUrl = r2
        L25:
            java.lang.String r2 = r0.getLowBandUrl()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L35
            java.lang.String r2 = r0.getLowBandUrl()
            r1.musicLowBandUrl = r2
        L35:
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r2 = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage
            r2.<init>()
            r2.mediaObject = r1
            java.lang.String r3 = r4.objectSetTitle(r0)
            r2.title = r3
            java.lang.String r3 = r4.objectSetDescription(r0)
            r2.description = r3
            r2.mediaObject = r1
            byte[] r0 = r4.objectSetThumb(r0)
            r2.thumbData = r0
            return r2
    }

    private com.tencent.mm.opensdk.modelmsg.WXMediaMessage buildTextParams() {
            r3 = this;
            com.tencent.mm.opensdk.modelmsg.WXTextObject r0 = new com.tencent.mm.opensdk.modelmsg.WXTextObject
            r0.<init>()
            java.lang.String r1 = r3.getText()
            java.lang.String r1 = r3.objectSetText(r1)
            r0.text = r1
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r1 = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage
            r1.<init>()
            r1.mediaObject = r0
            java.lang.String r0 = r3.getText()
            r2 = 1024(0x400, float:1.435E-42)
            java.lang.String r0 = r3.objectSetText(r0, r2)
            r1.description = r0
            return r1
    }

    private com.tencent.mm.opensdk.modelmsg.WXMediaMessage buildUrlParams() {
            r4 = this;
            com.umeng.socialize.media.UMWeb r0 = r4.getUmWeb()
            com.tencent.mm.opensdk.modelmsg.WXWebpageObject r1 = new com.tencent.mm.opensdk.modelmsg.WXWebpageObject
            r1.<init>()
            java.lang.String r2 = r0.toUrl()
            r1.webpageUrl = r2
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r2 = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage
            r2.<init>()
            java.lang.String r3 = r4.objectSetTitle(r0)
            r2.title = r3
            java.lang.String r3 = r4.objectSetDescription(r0)
            r2.description = r3
            r2.mediaObject = r1
            byte[] r0 = r4.objectSetThumb(r0)
            r2.thumbData = r0
            return r2
    }

    private com.tencent.mm.opensdk.modelmsg.WXMediaMessage buildVideoParams() {
            r3 = this;
            com.umeng.socialize.media.UMVideo r0 = r3.getVideo()
            com.tencent.mm.opensdk.modelmsg.WXVideoObject r1 = new com.tencent.mm.opensdk.modelmsg.WXVideoObject
            r1.<init>()
            java.lang.String r2 = r0.toUrl()
            r1.videoUrl = r2
            java.lang.String r2 = r0.getLowBandUrl()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L1f
            java.lang.String r2 = r0.getLowBandUrl()
            r1.videoLowBandUrl = r2
        L1f:
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r2 = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage
            r2.<init>()
            r2.mediaObject = r1
            java.lang.String r1 = r3.objectSetTitle(r0)
            r2.title = r1
            java.lang.String r1 = r3.objectSetDescription(r0)
            r2.description = r1
            byte[] r0 = r3.objectSetThumb(r0)
            r2.thumbData = r0
            return r2
    }

    public java.lang.String getFileUri(android.content.Context r2, java.io.File r3, java.lang.String r4) {
            r1 = this;
            if (r3 == 0) goto L18
            boolean r0 = r3.exists()
            if (r0 != 0) goto L9
            goto L18
        L9:
            android.net.Uri r3 = androidx.core.content.FileProvider.getUriForFile(r2, r4, r3)
            java.lang.String r4 = "com.tencent.mm"
            r0 = 1
            r2.grantUriPermission(r4, r3, r0)
            java.lang.String r2 = r3.toString()
            return r2
        L18:
            r2 = 0
            return r2
    }

    public com.tencent.mm.opensdk.modelmsg.WXMediaMessage getWxMediaMessage(android.content.Context r3, boolean r4, java.lang.String r5) {
            r2 = this;
            int r0 = r2.getmStyle()
            r1 = 2
            if (r0 == r1) goto L68
            int r0 = r2.getmStyle()
            r1 = 3
            if (r0 != r1) goto Lf
            goto L68
        Lf:
            int r0 = r2.getmStyle()
            r1 = 4
            if (r0 != r1) goto L1b
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r3 = r2.buildMusicParams()
            return r3
        L1b:
            int r0 = r2.getmStyle()
            r1 = 16
            if (r0 != r1) goto L28
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r3 = r2.buildUrlParams()
            return r3
        L28:
            int r0 = r2.getmStyle()
            r1 = 8
            if (r0 != r1) goto L35
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r3 = r2.buildVideoParams()
            return r3
        L35:
            int r0 = r2.getmStyle()
            r1 = 64
            if (r0 != r1) goto L49
            if (r4 == 0) goto L44
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r3 = r2.buildEmojiParamsWithFileProvider(r3, r5)
            return r3
        L44:
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r3 = r2.buildEmojiParams()
            return r3
        L49:
            int r3 = r2.getmStyle()
            r4 = 32
            if (r3 != r4) goto L56
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r3 = r2.buildFileParams()
            return r3
        L56:
            int r3 = r2.getmStyle()
            r4 = 128(0x80, float:1.8E-43)
            if (r3 != r4) goto L63
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r3 = r2.buildMinApp()
            return r3
        L63:
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r3 = r2.buildTextParams()
            return r3
        L68:
            if (r4 == 0) goto L6f
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r3 = r2.buildImageParamsWithFileProvider(r3, r5)
            return r3
        L6f:
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r3 = r2.buildImageParams()
            return r3
    }

    public boolean isBySystem() {
            r1 = this;
            boolean r0 = r1.bySystem
            return r0
    }
}
