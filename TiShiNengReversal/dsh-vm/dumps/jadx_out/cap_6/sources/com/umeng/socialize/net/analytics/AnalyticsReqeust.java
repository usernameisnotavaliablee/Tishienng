package com.umeng.socialize.net.analytics;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class AnalyticsReqeust extends com.umeng.socialize.net.base.SocializeRequest {
    private static final java.lang.String a = "/share/multi_add/";
    private static final int b = 9;
    private java.lang.String c;
    private java.lang.String d;
    private java.lang.String e;
    private java.lang.String f;
    private java.lang.String g;
    private java.lang.String h;
    private java.lang.String i;
    private com.umeng.socialize.media.UMediaObject j;

    public AnalyticsReqeust(android.content.Context r7, java.lang.String r8, java.lang.String r9) {
            r6 = this;
            r4 = 9
            com.umeng.socialize.net.utils.URequest$RequestMethod r5 = com.umeng.socialize.net.utils.URequest.RequestMethod.POST
            java.lang.String r2 = ""
            java.lang.Class<com.umeng.socialize.net.analytics.AnalyticsResponse> r3 = com.umeng.socialize.net.analytics.AnalyticsResponse.class
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r0.mContext = r1
            r0.d = r8
            r0.i = r9
            return
    }

    @Override // com.umeng.socialize.net.base.SocializeRequest
    protected java.lang.String getPath() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "/share/multi_add/"
            r0.append(r1)
            android.content.Context r1 = r3.mContext
            java.lang.String r1 = com.umeng.socialize.utils.SocializeUtils.getAppkey(r1)
            r0.append(r1)
            java.lang.String r1 = "/"
            r0.append(r1)
            java.lang.String r2 = com.umeng.socialize.Config.EntityKey
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.umeng.socialize.net.base.SocializeRequest, com.umeng.socialize.net.utils.URequest
    public void onPrepareRequest() {
            r4 = this;
            super.onPrepareRequest()
            java.lang.String r0 = r4.d
            java.lang.String r1 = r4.c
            if (r1 != 0) goto Lb
            java.lang.String r1 = ""
        Lb:
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            java.lang.String r0 = "{\"%s\":\"%s\"}"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            android.content.Context r1 = r4.mContext
            java.lang.String r1 = com.umeng.socialize.utils.SocializeUtils.getAppkey(r1)
            java.lang.String r2 = "dc"
            java.lang.String r3 = com.umeng.socialize.Config.Descriptor
            r4.addStringParams(r2, r3)
            java.lang.String r2 = "to"
            r4.addStringParams(r2, r0)
            java.lang.String r2 = "sns"
            r4.addStringParams(r2, r0)
            java.lang.String r0 = "ak"
            r4.addStringParams(r0, r1)
            java.lang.String r0 = "type"
            java.lang.String r1 = r4.f
            r4.addStringParams(r0, r1)
            java.lang.String r0 = "usid"
            java.lang.String r1 = r4.c
            r4.addStringParams(r0, r1)
            java.lang.String r0 = "ct"
            java.lang.String r1 = r4.i
            r4.addStringParams(r0, r1)
            java.lang.String r0 = r4.h
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L5a
            java.lang.String r0 = "url"
            java.lang.String r1 = r4.h
            r4.addStringParams(r0, r1)
        L5a:
            java.lang.String r0 = r4.g
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L69
            java.lang.String r0 = "title"
            java.lang.String r1 = r4.g
            r4.addStringParams(r0, r1)
        L69:
            com.umeng.socialize.media.UMediaObject r0 = r4.j
            r4.addMediaParams(r0)
            return
    }

    public void setMedia(com.umeng.socialize.media.UMediaObject r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.umeng.socialize.media.UMImage
            if (r0 == 0) goto L7
            r1.j = r2
            return
        L7:
            boolean r0 = r2 instanceof com.umeng.socialize.media.UMusic
            if (r0 == 0) goto L26
            com.umeng.socialize.media.UMusic r2 = (com.umeng.socialize.media.UMusic) r2
            java.lang.String r0 = r2.getTitle()
            r1.g = r0
            java.lang.String r0 = r2.toUrl()
            r1.h = r0
            java.lang.String r0 = r2.getDescription()
            r1.i = r0
            com.umeng.socialize.media.UMImage r2 = r2.getThumbImage()
            r1.j = r2
            return
        L26:
            boolean r0 = r2 instanceof com.umeng.socialize.media.UMVideo
            if (r0 == 0) goto L45
            com.umeng.socialize.media.UMVideo r2 = (com.umeng.socialize.media.UMVideo) r2
            java.lang.String r0 = r2.getTitle()
            r1.g = r0
            java.lang.String r0 = r2.toUrl()
            r1.h = r0
            java.lang.String r0 = r2.getDescription()
            r1.i = r0
            com.umeng.socialize.media.UMImage r2 = r2.getThumbImage()
            r1.j = r2
            return
        L45:
            boolean r0 = r2 instanceof com.umeng.socialize.media.UMWeb
            if (r0 == 0) goto L64
            com.umeng.socialize.media.UMWeb r2 = (com.umeng.socialize.media.UMWeb) r2
            java.lang.String r0 = r2.getTitle()
            r1.g = r0
            java.lang.String r0 = r2.toUrl()
            r1.h = r0
            java.lang.String r0 = r2.getDescription()
            r1.i = r0
            com.umeng.socialize.media.UMImage r2 = r2.getThumbImage()
            r1.j = r2
            return
        L64:
            boolean r0 = r2 instanceof com.umeng.socialize.media.UMMin
            if (r0 == 0) goto L82
            com.umeng.socialize.media.UMMin r2 = (com.umeng.socialize.media.UMMin) r2
            java.lang.String r0 = r2.getTitle()
            r1.g = r0
            java.lang.String r0 = r2.toUrl()
            r1.h = r0
            java.lang.String r0 = r2.getDescription()
            r1.i = r0
            com.umeng.socialize.media.UMImage r2 = r2.getThumbImage()
            r1.j = r2
        L82:
            return
    }

    public void setPlatform(java.lang.String r1) {
            r0 = this;
            r0.d = r1
            return
    }

    public void setText(java.lang.String r1) {
            r0 = this;
            r0.i = r1
            return
    }

    public void setType(java.lang.String r1) {
            r0 = this;
            r0.f = r1
            return
    }

    public void setUID(java.lang.String r1) {
            r0 = this;
            r0.e = r1
            return
    }

    public void setmUsid(java.lang.String r1) {
            r0 = this;
            r0.c = r1
            return
    }
}
