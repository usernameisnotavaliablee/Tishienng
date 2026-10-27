package com.umeng.socialize;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ShareContent {
    public static final int EMOJI_STYLE = 64;
    public static final int ERROR_STYLE = 0;
    public static final int FILE_STYLE = 32;
    public static final int IMAGE_STYLE = 2;
    public static final int IMAGE_VIDEO = 11;
    public static final int MINAPP_STYLE = 128;
    public static final int MUSIC_STYLE = 4;
    public static final int QQMINI_STYLE = 256;
    public static final int TEXT_IMAGE_STYLE = 3;
    public static final int TEXT_STYLE = 1;
    public static final int VIDEO_STYLE = 8;
    public static final int WEB_STYLE = 16;
    public com.umeng.socialize.media.UMVideo[] Video_mMedias;
    public java.io.File app;
    public boolean bySystem;
    public java.io.File file;
    public com.umeng.socialize.media.UMediaObject mExtra;
    public java.lang.String mFollow;
    public com.umeng.socialize.media.UMediaObject mMedia;
    public com.umeng.socialize.media.UMImage[] mMedias;
    public java.lang.String mText;
    public java.lang.String subject;

    public ShareContent() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.subject = r0
            r1.mText = r0
            return
    }

    public int getShareType() {
            r3 = this;
            com.umeng.socialize.media.UMediaObject r0 = r3.mMedia
            r1 = 0
            if (r0 != 0) goto L18
            com.umeng.socialize.media.UMediaObject r2 = r3.mExtra
            if (r2 != 0) goto L18
            java.io.File r2 = r3.file
            if (r2 != 0) goto L18
            java.lang.String r0 = r3.mText
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L16
            return r1
        L16:
            r0 = 1
            return r0
        L18:
            java.io.File r2 = r3.file
            if (r2 == 0) goto L1f
            r0 = 32
            return r0
        L1f:
            if (r0 == 0) goto L65
            boolean r2 = r0 instanceof com.umeng.socialize.media.UMEmoji
            if (r2 == 0) goto L28
            r0 = 64
            return r0
        L28:
            boolean r2 = r0 instanceof com.umeng.socialize.media.UMImage
            if (r2 == 0) goto L33
            com.umeng.socialize.media.UMVideo[] r2 = r3.Video_mMedias
            if (r2 == 0) goto L33
            r0 = 11
            return r0
        L33:
            boolean r2 = r0 instanceof com.umeng.socialize.media.UMImage
            if (r2 == 0) goto L43
            java.lang.String r0 = r3.mText
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L41
            r0 = 2
            return r0
        L41:
            r0 = 3
            return r0
        L43:
            boolean r2 = r0 instanceof com.umeng.socialize.media.UMusic
            if (r2 == 0) goto L49
            r0 = 4
            return r0
        L49:
            boolean r2 = r0 instanceof com.umeng.socialize.media.UMVideo
            if (r2 == 0) goto L50
            r0 = 8
            return r0
        L50:
            boolean r2 = r0 instanceof com.umeng.socialize.media.UMWeb
            if (r2 == 0) goto L57
            r0 = 16
            return r0
        L57:
            boolean r2 = r0 instanceof com.umeng.socialize.media.UMMin
            if (r2 == 0) goto L5e
            r0 = 128(0x80, float:1.8E-43)
            return r0
        L5e:
            boolean r0 = r0 instanceof com.umeng.socialize.media.UMQQMini
            if (r0 == 0) goto L65
            r0 = 256(0x100, float:3.59E-43)
            return r0
        L65:
            return r1
    }
}
