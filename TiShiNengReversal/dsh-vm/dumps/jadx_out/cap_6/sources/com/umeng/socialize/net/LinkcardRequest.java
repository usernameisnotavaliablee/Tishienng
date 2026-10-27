package com.umeng.socialize.net;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class LinkcardRequest extends com.umeng.socialize.net.base.SocializeRequest {
    private static final java.lang.String a = "/share/linkcard/";
    private java.lang.String b;
    private com.umeng.socialize.media.BaseMediaObject c;

    public LinkcardRequest(android.content.Context r7) {
            r6 = this;
            r4 = 0
            com.umeng.socialize.net.utils.URequest$RequestMethod r5 = com.umeng.socialize.net.utils.URequest.RequestMethod.POST
            java.lang.String r2 = ""
            java.lang.Class<com.umeng.socialize.net.LinkCardResponse> r3 = com.umeng.socialize.net.LinkCardResponse.class
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    private org.json.JSONObject a() {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "display_name"
            com.umeng.socialize.media.BaseMediaObject r2 = r3.c     // Catch: org.json.JSONException -> L5b
            java.lang.String r2 = r2.getTitle()     // Catch: org.json.JSONException -> L5b
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L5b
            java.lang.String r1 = "image"
            org.json.JSONObject r2 = r3.f()     // Catch: org.json.JSONException -> L5b
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L5b
            java.lang.String r1 = "summary"
            java.lang.String r2 = r3.d()     // Catch: org.json.JSONException -> L5b
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L5b
            java.lang.String r1 = "full_image"
            org.json.JSONObject r2 = r3.h()     // Catch: org.json.JSONException -> L5b
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L5b
            java.lang.String r1 = "url"
            com.umeng.socialize.media.BaseMediaObject r2 = r3.c     // Catch: org.json.JSONException -> L5b
            java.lang.String r2 = r2.toUrl()     // Catch: org.json.JSONException -> L5b
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L5b
            java.lang.String r1 = "links"
            org.json.JSONObject r2 = r3.i()     // Catch: org.json.JSONException -> L5b
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L5b
            java.lang.String r1 = "tags"
            org.json.JSONArray r2 = r3.e()     // Catch: org.json.JSONException -> L5b
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L5b
            java.lang.String r1 = "create_at"
            java.lang.String r2 = r3.c()     // Catch: org.json.JSONException -> L5b
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L5b
            java.lang.String r1 = "object_type"
            java.lang.String r2 = r3.b()     // Catch: org.json.JSONException -> L5b
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L5b
            return r0
        L5b:
            r1 = move-exception
            com.umeng.socialize.utils.SLog.error(r1)
            return r0
    }

    private java.lang.String b() {
            r3 = this;
            com.umeng.socialize.media.BaseMediaObject r0 = r3.c
            boolean r1 = r0 instanceof com.umeng.socialize.media.UMWeb
            java.lang.String r2 = "webpage"
            if (r1 == 0) goto L9
            return r2
        L9:
            boolean r1 = r0 instanceof com.umeng.socialize.media.UMVideo
            if (r1 == 0) goto L10
            java.lang.String r0 = "video"
            return r0
        L10:
            boolean r0 = r0 instanceof com.umeng.socialize.media.UMusic
            if (r0 == 0) goto L17
            java.lang.String r0 = "audio"
            return r0
        L17:
            return r2
    }

    private java.lang.String c() {
            r4 = this;
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd"
            r0.<init>(r1)
            java.util.Date r1 = new java.util.Date
            long r2 = java.lang.System.currentTimeMillis()
            r1.<init>(r2)
            java.lang.String r0 = r0.format(r1)
            return r0
    }

    private java.lang.String d() {
            r3 = this;
            com.umeng.socialize.media.BaseMediaObject r0 = r3.c
            java.lang.String r0 = r0.getDescription()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L26
            com.umeng.socialize.media.BaseMediaObject r0 = r3.c
            java.lang.String r0 = r0.getDescription()
            int r0 = r0.length()
            r1 = 300(0x12c, float:4.2E-43)
            if (r0 <= r1) goto L26
            com.umeng.socialize.media.BaseMediaObject r0 = r3.c
            java.lang.String r0 = r0.getDescription()
            r2 = 0
            java.lang.String r0 = r0.substring(r2, r1)
            return r0
        L26:
            com.umeng.socialize.media.BaseMediaObject r0 = r3.c
            java.lang.String r0 = r0.getDescription()
            return r0
    }

    private org.json.JSONArray e() {
            r4 = this;
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L15
            r1.<init>()     // Catch: org.json.JSONException -> L15
            java.lang.String r2 = "display_name"
            java.lang.String r3 = com.umeng.socialize.Config.Descriptor     // Catch: org.json.JSONException -> L15
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L15
            r0.put(r1)     // Catch: org.json.JSONException -> L15
            return r0
        L15:
            r1 = move-exception
            com.umeng.socialize.utils.SLog.error(r1)
            return r0
    }

    private org.json.JSONObject f() {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            com.umeng.socialize.media.BaseMediaObject r1 = r4.c     // Catch: org.json.JSONException -> L1d
            com.umeng.socialize.media.UMImage r1 = r1.getThumbImage()     // Catch: org.json.JSONException -> L1d
            java.lang.String r2 = "url"
            if (r1 == 0) goto L1f
            boolean r3 = r1.isUrlMedia()     // Catch: org.json.JSONException -> L1d
            if (r3 == 0) goto L1f
            java.lang.String r1 = r1.asUrlImage()     // Catch: org.json.JSONException -> L1d
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L1d
            goto L24
        L1d:
            r1 = move-exception
            goto L39
        L1f:
            java.lang.String r1 = "https://mobile.umeng.com/images/pic/home/social/img-1.png"
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L1d
        L24:
            int[] r1 = r4.g()     // Catch: org.json.JSONException -> L1d
            java.lang.String r2 = "width"
            r3 = 0
            r3 = r1[r3]     // Catch: org.json.JSONException -> L1d
            r0.put(r2, r3)     // Catch: org.json.JSONException -> L1d
            java.lang.String r2 = "height"
            r3 = 1
            r1 = r1[r3]     // Catch: org.json.JSONException -> L1d
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L1d
            return r0
        L39:
            com.umeng.socialize.utils.SLog.error(r1)
            return r0
    }

    private int[] g() {
            r6 = this;
            r0 = 2
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 120(0x78, float:1.68E-43)
            r0[r1] = r2
            r3 = 1
            r0[r3] = r2
            com.umeng.socialize.media.BaseMediaObject r2 = r6.c
            if (r2 == 0) goto L43
            java.util.Map r2 = r2.getmExtra()
            if (r2 == 0) goto L43
            com.umeng.socialize.media.BaseMediaObject r2 = r6.c
            java.util.Map r2 = r2.getmExtra()
            java.lang.String r4 = "width"
            boolean r5 = r2.containsKey(r4)
            if (r5 == 0) goto L2f
            java.lang.Object r4 = r2.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0[r1] = r4
        L2f:
            java.lang.String r1 = "height"
            boolean r4 = r2.containsKey(r1)
            if (r4 == 0) goto L43
            java.lang.Object r1 = r2.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0[r3] = r1
        L43:
            return r0
    }

    private org.json.JSONObject h() {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            com.umeng.socialize.media.BaseMediaObject r1 = r4.c     // Catch: org.json.JSONException -> L1d
            com.umeng.socialize.media.UMImage r1 = r1.getThumbImage()     // Catch: org.json.JSONException -> L1d
            java.lang.String r2 = "url"
            if (r1 == 0) goto L1f
            boolean r3 = r1.isUrlMedia()     // Catch: org.json.JSONException -> L1d
            if (r3 == 0) goto L1f
            java.lang.String r1 = r1.asUrlImage()     // Catch: org.json.JSONException -> L1d
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L1d
            goto L24
        L1d:
            r1 = move-exception
            goto L39
        L1f:
            java.lang.String r1 = "https://mobile.umeng.com/images/pic/home/social/img-1.png"
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L1d
        L24:
            int[] r1 = r4.g()     // Catch: org.json.JSONException -> L1d
            java.lang.String r2 = "width"
            r3 = 0
            r3 = r1[r3]     // Catch: org.json.JSONException -> L1d
            r0.put(r2, r3)     // Catch: org.json.JSONException -> L1d
            java.lang.String r2 = "height"
            r3 = 1
            r1 = r1[r3]     // Catch: org.json.JSONException -> L1d
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L1d
            return r0
        L39:
            com.umeng.socialize.utils.SLog.error(r1)
            return r0
    }

    private org.json.JSONObject i() {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "url"
            com.umeng.socialize.media.BaseMediaObject r2 = r3.c     // Catch: org.json.JSONException -> L11
            java.lang.String r2 = r2.toUrl()     // Catch: org.json.JSONException -> L11
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L11
            return r0
        L11:
            r1 = move-exception
            com.umeng.socialize.utils.SLog.error(r1)
            return r0
    }

    @Override // com.umeng.socialize.net.base.SocializeRequest
    protected java.lang.String getPath() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "/share/linkcard/"
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
            r2 = this;
            super.onPrepareRequest()
            org.json.JSONObject r0 = r2.a()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "linkcard_info"
            r2.addStringParams(r1, r0)
            return
    }

    public void setMedia(com.umeng.socialize.media.BaseMediaObject r1) {
            r0 = this;
            r0.c = r1
            return
    }
}
