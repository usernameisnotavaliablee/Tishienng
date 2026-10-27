package com.umeng.socialize.media;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class QQShareContent extends com.umeng.socialize.media.SimpleShareContent {
    public int mShareType;
    private java.lang.String mediaTitle;
    private java.lang.String mediades;

    public QQShareContent(com.umeng.socialize.ShareContent r3) {
            r2 = this;
            r2.<init>(r3)
            r0 = 1
            r2.mShareType = r0
            java.lang.String r0 = ""
            r2.mediaTitle = r0
            r2.mediades = r0
            com.umeng.socialize.media.UMediaObject r0 = r3.mMedia
            if (r0 == 0) goto L19
            boolean r1 = r0 instanceof com.umeng.socialize.media.UMusic
            if (r1 == 0) goto L19
            com.umeng.socialize.media.UMusic r0 = (com.umeng.socialize.media.UMusic) r0
            r2.setMusic(r0)
        L19:
            com.umeng.socialize.media.UMediaObject r3 = r3.mMedia
            if (r3 == 0) goto L26
            boolean r0 = r3 instanceof com.umeng.socialize.media.UMVideo
            if (r0 == 0) goto L26
            com.umeng.socialize.media.UMVideo r3 = (com.umeng.socialize.media.UMVideo) r3
            r2.setVideo(r3)
        L26:
            return
    }

    private void buildAudioParams(android.os.Bundle r5) {
            r4 = this;
            com.umeng.socialize.media.UMusic r0 = r4.getMusic()
            java.lang.String r0 = r4.objectSetTitle(r0)
            java.lang.String r1 = "title"
            r5.putString(r1, r0)
            com.umeng.socialize.media.UMusic r0 = r4.getMusic()
            java.lang.String r0 = r4.objectSetDescription(r0)
            java.lang.String r1 = "summary"
            r5.putString(r1, r0)
            com.umeng.socialize.media.UMusic r0 = r4.getMusic()
            com.umeng.socialize.media.UMImage r0 = r0.getThumbImage()
            if (r0 == 0) goto L61
            boolean r1 = r0.isUrlMedia()
            java.lang.String r2 = "imageUrl"
            if (r1 == 0) goto L34
            java.lang.String r0 = r0.toUrl()
            r5.putString(r2, r0)
            goto L61
        L34:
            java.io.File r1 = r0.asFileImage()
            if (r1 == 0) goto L5a
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 30
            if (r1 < r3) goto L4c
            java.io.File r0 = r0.asFileImage()
            java.lang.String r0 = r0.toString()
            r5.putString(r2, r0)
            goto L61
        L4c:
            java.io.File r0 = r0.asFileImage()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "imageLocalUrl"
            r5.putString(r1, r0)
            goto L61
        L5a:
            java.lang.String r0 = "error"
            java.lang.String r1 = com.umeng.socialize.utils.UmengText.QQ.QQ_PERMISSION
            r5.putString(r0, r1)
        L61:
            com.umeng.socialize.media.UMusic r0 = r4.getMusic()
            java.lang.String r0 = r0.getmTargetUrl()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r1 = "targetUrl"
            if (r0 != 0) goto L7d
            com.umeng.socialize.media.UMusic r0 = r4.getMusic()
            java.lang.String r0 = r0.getmTargetUrl()
            r5.putString(r1, r0)
            goto L88
        L7d:
            com.umeng.socialize.media.UMusic r0 = r4.getMusic()
            java.lang.String r0 = r0.toUrl()
            r5.putString(r1, r0)
        L88:
            com.umeng.socialize.media.UMusic r0 = r4.getMusic()
            java.lang.String r0 = r0.toUrl()
            java.lang.String r1 = "audio_url"
            r5.putString(r1, r0)
            return
    }

    private void buildImageParams(android.os.Bundle r4) {
            r3 = this;
            com.umeng.socialize.media.UMImage r0 = r3.getImage()
            if (r0 == 0) goto L2f
            com.umeng.socialize.media.UMImage r0 = r3.getImage()
            java.io.File r0 = r0.asFileImage()
            java.lang.String r1 = "error"
            if (r0 == 0) goto L2a
            java.lang.String r0 = "imageLocalUrl"
            com.umeng.socialize.media.UMImage r2 = r3.getImage()     // Catch: java.lang.Exception -> L24
            java.io.File r2 = r2.asFileImage()     // Catch: java.lang.Exception -> L24
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L24
            r4.putString(r0, r2)     // Catch: java.lang.Exception -> L24
            return
        L24:
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.QQ.QQ_PERMISSION
            r4.putString(r1, r0)
            return
        L2a:
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.QQ.QQ_PERMISSION
            r4.putString(r1, r0)
        L2f:
            return
    }

    private void buildMiniApp(android.os.Bundle r9) {
            r8 = this;
            com.umeng.socialize.media.UMQQMini r0 = r8.getQQMini()
            java.lang.String r1 = r0.getMiniAppId()
            java.lang.String r2 = r0.getPath()
            java.lang.String r3 = r0.getType()
            java.lang.String r4 = "title"
            java.lang.String r5 = r8.objectSetTitle(r0)
            r9.putString(r4, r5)
            java.lang.String r4 = "summary"
            java.lang.String r5 = r8.objectSetDescription(r0)
            r9.putString(r4, r5)
            com.umeng.socialize.media.UMImage r4 = r0.getThumbImage()
            if (r4 == 0) goto L65
            boolean r5 = r4.isUrlMedia()
            java.lang.String r6 = "imageUrl"
            if (r5 == 0) goto L38
            java.lang.String r4 = r4.toUrl()
            r9.putString(r6, r4)
            goto L65
        L38:
            java.io.File r5 = r4.asFileImage()
            if (r5 == 0) goto L5e
            int r5 = android.os.Build.VERSION.SDK_INT
            r7 = 30
            if (r5 < r7) goto L50
            java.io.File r4 = r4.asFileImage()
            java.lang.String r4 = r4.toString()
            r9.putString(r6, r4)
            goto L65
        L50:
            java.io.File r4 = r4.asFileImage()
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "imageLocalUrl"
            r9.putString(r5, r4)
            goto L65
        L5e:
            java.lang.String r4 = "error"
            java.lang.String r5 = com.umeng.socialize.utils.UmengText.QQ.QQ_PERMISSION
            r9.putString(r4, r5)
        L65:
            java.lang.String r4 = r0.toUrl()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L78
            java.lang.String r4 = "targetUrl"
            java.lang.String r0 = r0.toUrl()
            r9.putString(r4, r0)
        L78:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L99
            java.lang.String r0 = "mini_program_appid"
            r9.putString(r0, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L8e
            java.lang.String r0 = "mini_program_path"
            r9.putString(r0, r2)
        L8e:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L99
            java.lang.String r0 = "mini_program_type"
            r9.putString(r0, r3)
        L99:
            return
    }

    private void buildText(android.os.Bundle r3) {
            r2 = this;
            java.lang.String r0 = "summary"
            java.lang.String r1 = r2.getText()
            r3.putString(r0, r1)
            return
    }

    private void buildVideoParams(android.os.Bundle r5) {
            r4 = this;
            com.umeng.socialize.media.UMVideo r0 = r4.getVideo()
            java.lang.String r0 = r4.objectSetTitle(r0)
            java.lang.String r1 = "title"
            r5.putString(r1, r0)
            com.umeng.socialize.media.UMVideo r0 = r4.getVideo()
            java.lang.String r0 = r4.objectSetDescription(r0)
            java.lang.String r1 = "summary"
            r5.putString(r1, r0)
            com.umeng.socialize.media.UMVideo r0 = r4.getVideo()
            com.umeng.socialize.media.UMImage r0 = r0.getThumbImage()
            if (r0 == 0) goto L61
            boolean r1 = r0.isUrlMedia()
            java.lang.String r2 = "imageUrl"
            if (r1 == 0) goto L34
            java.lang.String r0 = r0.toUrl()
            r5.putString(r2, r0)
            goto L61
        L34:
            java.io.File r1 = r0.asFileImage()
            if (r1 == 0) goto L5a
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 30
            if (r1 < r3) goto L4c
            java.io.File r0 = r0.asFileImage()
            java.lang.String r0 = r0.toString()
            r5.putString(r2, r0)
            goto L61
        L4c:
            java.io.File r0 = r0.asFileImage()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "imageLocalUrl"
            r5.putString(r1, r0)
            goto L61
        L5a:
            java.lang.String r0 = "error"
            java.lang.String r1 = com.umeng.socialize.utils.UmengText.QQ.QQ_PERMISSION
            r5.putString(r0, r1)
        L61:
            com.umeng.socialize.media.UMVideo r0 = r4.getVideo()
            java.lang.String r0 = r0.toUrl()
            java.lang.String r1 = "targetUrl"
            r5.putString(r1, r0)
            return
    }

    private void buildWebParams(android.os.Bundle r6) {
            r5 = this;
            com.umeng.socialize.media.UMWeb r0 = r5.getUmWeb()
            java.lang.String r0 = r5.objectSetTitle(r0)
            java.lang.String r1 = "title"
            r6.putString(r1, r0)
            com.umeng.socialize.media.UMWeb r0 = r5.getUmWeb()
            java.lang.String r0 = r5.objectSetDescription(r0)
            java.lang.String r1 = "summary"
            r6.putString(r1, r0)
            com.umeng.socialize.media.UMWeb r0 = r5.getUmWeb()
            com.umeng.socialize.media.UMImage r0 = r0.getThumbImage()
            java.lang.String r1 = "error"
            if (r0 == 0) goto L61
            boolean r2 = r0.isUrlMedia()
            java.lang.String r3 = "imageUrl"
            if (r2 == 0) goto L36
            java.lang.String r0 = r0.toUrl()
            r6.putString(r3, r0)
            goto L61
        L36:
            java.io.File r2 = r0.asFileImage()
            if (r2 == 0) goto L5c
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 30
            if (r2 < r4) goto L4e
            java.io.File r0 = r0.asFileImage()
            java.lang.String r0 = r0.toString()
            r6.putString(r3, r0)
            goto L61
        L4e:
            java.io.File r0 = r0.asFileImage()
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "imageLocalUrl"
            r6.putString(r2, r0)
            goto L61
        L5c:
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.QQ.QQ_PERMISSION
            r6.putString(r1, r0)
        L61:
            com.umeng.socialize.media.UMWeb r0 = r5.getUmWeb()
            java.lang.String r0 = r0.toUrl()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L74
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.SHARE.EMPTY_WEB_URL
            r6.putString(r1, r0)
        L74:
            com.umeng.socialize.media.UMWeb r0 = r5.getUmWeb()
            java.lang.String r0 = r0.toUrl()
            java.lang.String r1 = "targetUrl"
            r6.putString(r1, r0)
            return
    }

    public android.os.Bundle buildParams(boolean r5, java.lang.String r6) {
            r4 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            int r1 = r4.getmStyle()
            r2 = 2
            if (r1 == r2) goto L58
            int r1 = r4.getmStyle()
            r3 = 3
            if (r1 != r3) goto L14
            goto L58
        L14:
            int r1 = r4.getmStyle()
            r3 = 4
            if (r1 != r3) goto L27
            com.umeng.socialize.media.UMusic r1 = r4.getMusic()
            if (r1 == 0) goto L23
            r4.mShareType = r2
        L23:
            r4.buildAudioParams(r0)
            goto L5e
        L27:
            int r1 = r4.getmStyle()
            r3 = 16
            if (r1 != r3) goto L33
            r4.buildWebParams(r0)
            goto L5e
        L33:
            int r1 = r4.getmStyle()
            r3 = 8
            if (r1 != r3) goto L3f
            r4.buildVideoParams(r0)
            goto L5e
        L3f:
            int r1 = r4.getmStyle()
            r3 = 256(0x100, float:3.59E-43)
            if (r1 != r3) goto L4b
            r4.buildMiniApp(r0)
            goto L5e
        L4b:
            r1 = 0
            java.lang.String r3 = "text"
            java.lang.String r1 = com.umeng.socialize.utils.UmengText.supportStyle(r1, r3)
            java.lang.String r3 = "error"
            r0.putString(r3, r1)
            goto L5e
        L58:
            r1 = 5
            r4.mShareType = r1
            r4.buildImageParams(r0)
        L5e:
            java.lang.String r1 = "req_type"
            int r3 = r4.mShareType
            r0.putInt(r1, r3)
            java.lang.String r1 = "cflag"
            if (r5 == 0) goto L6d
            r0.putInt(r1, r2)
            goto L71
        L6d:
            r5 = 1
            r0.putInt(r1, r5)
        L71:
            boolean r5 = android.text.TextUtils.isEmpty(r6)
            if (r5 != 0) goto L7c
            java.lang.String r5 = "appName"
            r0.putString(r5, r6)
        L7c:
            return r0
    }
}
