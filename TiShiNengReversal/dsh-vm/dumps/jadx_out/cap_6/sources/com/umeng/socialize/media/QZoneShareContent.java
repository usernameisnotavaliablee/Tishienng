package com.umeng.socialize.media;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class QZoneShareContent extends com.umeng.socialize.media.SimpleShareContent {
    private boolean isPublish;
    public int mShareType;
    private com.umeng.socialize.media.UMediaObject uMedia;

    public QZoneShareContent(com.umeng.socialize.ShareContent r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 0
            r1.isPublish = r0
            r0 = 1
            r1.mShareType = r0
            com.umeng.socialize.media.UMediaObject r2 = r2.mMedia
            r1.uMedia = r2
            return
    }

    private void buildAudioParams(android.os.Bundle r3) {
            r2 = this;
            com.umeng.socialize.media.BaseMediaObject r0 = r2.getBaseMediaObject()
            com.umeng.socialize.media.UMImage r0 = r0.getThumbImage()
            if (r0 == 0) goto L27
            boolean r1 = r0.isUrlMedia()
            if (r1 == 0) goto L1a
            java.lang.String r1 = "imageUrl"
            java.lang.String r0 = r0.toUrl()
            r3.putString(r1, r0)
            goto L27
        L1a:
            java.io.File r0 = r0.asFileImage()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "imageLocalUrl"
            r3.putString(r1, r0)
        L27:
            com.umeng.socialize.media.BaseMediaObject r0 = r2.getBaseMediaObject()
            java.lang.String r0 = r0.toUrl()
            java.lang.String r1 = "targetUrl"
            r3.putString(r1, r0)
            com.umeng.socialize.media.UMusic r0 = r2.getMusic()
            if (r0 == 0) goto L45
            com.umeng.socialize.media.UMusic r0 = r2.getMusic()
            java.lang.String r0 = r0.getmTargetUrl()
            r3.putString(r1, r0)
        L45:
            com.umeng.socialize.media.BaseMediaObject r0 = r2.getBaseMediaObject()
            java.lang.String r0 = r2.objectSetTitle(r0)
            java.lang.String r1 = "title"
            r3.putString(r1, r0)
            com.umeng.socialize.media.BaseMediaObject r0 = r2.getBaseMediaObject()
            java.lang.String r0 = r2.objectSetDescription(r0)
            java.lang.String r1 = "summary"
            r3.putString(r1, r0)
            com.umeng.socialize.media.BaseMediaObject r0 = r2.getBaseMediaObject()
            java.lang.String r0 = r0.toUrl()
            java.lang.String r1 = "audio_url"
            r3.putString(r1, r0)
            return
    }

    private void buildImageParams(android.os.Bundle r3) {
            r2 = this;
            com.umeng.socialize.media.UMImage r0 = r2.getImage()
            if (r0 == 0) goto L21
            com.umeng.socialize.media.UMImage r0 = r2.getImage()
            java.io.File r0 = r0.asFileImage()
            if (r0 == 0) goto L21
            com.umeng.socialize.media.UMImage r0 = r2.getImage()
            java.io.File r0 = r0.asFileImage()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "imageUrl"
            r3.putString(r1, r0)
        L21:
            return
    }

    private void buildWebParams(android.os.Bundle r3) {
            r2 = this;
            com.umeng.socialize.media.UMWeb r0 = r2.getUmWeb()
            com.umeng.socialize.media.UMImage r0 = r0.getThumbImage()
            if (r0 == 0) goto L27
            boolean r1 = r0.isUrlMedia()
            if (r1 == 0) goto L1a
            java.lang.String r1 = "imageUrl"
            java.lang.String r0 = r0.toUrl()
            r3.putString(r1, r0)
            goto L27
        L1a:
            java.io.File r0 = r0.asFileImage()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "imageLocalUrl"
            r3.putString(r1, r0)
        L27:
            com.umeng.socialize.media.UMWeb r0 = r2.getUmWeb()
            java.lang.String r0 = r0.toUrl()
            java.lang.String r1 = "targetUrl"
            r3.putString(r1, r0)
            com.umeng.socialize.media.UMWeb r0 = r2.getUmWeb()
            java.lang.String r0 = r2.objectSetTitle(r0)
            java.lang.String r1 = "title"
            r3.putString(r1, r0)
            com.umeng.socialize.media.UMWeb r0 = r2.getUmWeb()
            java.lang.String r0 = r2.objectSetDescription(r0)
            java.lang.String r1 = "summary"
            r3.putString(r1, r0)
            return
    }

    public android.os.Bundle buildParamsQzone() {
            r9 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1 = 0
            r9.isPublish = r1
            int r2 = r9.getmStyle()
            r3 = 3
            r4 = 1
            r5 = 2
            if (r2 == r5) goto L4a
            int r2 = r9.getmStyle()
            if (r2 != r3) goto L18
            goto L4a
        L18:
            int r2 = r9.getmStyle()
            r6 = 4
            if (r2 != r6) goto L25
            r9.mShareType = r5
            r9.buildAudioParams(r0)
            goto L3c
        L25:
            int r2 = r9.getmStyle()
            r5 = 16
            if (r2 != r5) goto L31
            r9.buildWebParams(r0)
            goto L3c
        L31:
            int r2 = r9.getmStyle()
            r5 = 8
            if (r2 != r5) goto L3e
            r9.buildAudioParams(r0)
        L3c:
            r3 = 1
            goto L52
        L3e:
            r9.isPublish = r4
            java.lang.String r2 = "summary"
            java.lang.String r4 = r9.getText()
            r0.putString(r2, r4)
            goto L52
        L4a:
            r2 = 5
            r9.mShareType = r2
            r9.buildImageParams(r0)
            r9.isPublish = r4
        L52:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.umeng.socialize.media.UMImage[] r4 = r9.getmImages()
            java.lang.String r5 = "imageUrl"
            java.lang.String r6 = "imageLocalUrl"
            if (r4 == 0) goto L88
            com.umeng.socialize.media.UMImage[] r4 = r9.getmImages()
            int r4 = r4.length
            if (r4 <= 0) goto L88
            com.umeng.socialize.media.UMImage[] r4 = r9.getmImages()
            int r7 = r4.length
        L6d:
            if (r1 >= r7) goto L81
            r8 = r4[r1]
            java.io.File r8 = r8.asFileImage()
            if (r8 == 0) goto L7e
            java.lang.String r8 = r8.toString()
            r2.add(r8)
        L7e:
            int r1 = r1 + 1
            goto L6d
        L81:
            r0.remove(r6)
            r0.putStringArrayList(r5, r2)
            goto Lae
        L88:
            java.lang.String r1 = r0.getString(r5)
            r0.remove(r5)
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 != 0) goto L98
            r2.add(r1)
        L98:
            r0.putStringArrayList(r5, r2)
            java.lang.String r1 = r0.getString(r6)
            r0.remove(r6)
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 != 0) goto Lab
            r2.add(r1)
        Lab:
            r0.putStringArrayList(r6, r2)
        Lae:
            java.lang.String r1 = "req_type"
            r0.putInt(r1, r3)
            return r0
    }

    public com.umeng.socialize.media.UMediaObject getMedia() {
            r1 = this;
            com.umeng.socialize.media.UMediaObject r0 = r1.uMedia
            return r0
    }

    public boolean getisPublish() {
            r1 = this;
            boolean r0 = r1.isPublish
            return r0
    }
}
