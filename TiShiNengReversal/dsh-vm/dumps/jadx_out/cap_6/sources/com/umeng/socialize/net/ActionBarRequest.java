package com.umeng.socialize.net;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ActionBarRequest extends com.umeng.socialize.net.base.SocializeRequest {
    private static final java.lang.String a = "/bar/get/";
    private static final int b = 1;
    private int c;

    public ActionBarRequest(android.content.Context r7, boolean r8) {
            r6 = this;
            com.umeng.socialize.net.utils.URequest$RequestMethod r5 = com.umeng.socialize.net.utils.URequest.RequestMethod.GET
            java.lang.String r2 = ""
            java.lang.Class<com.umeng.socialize.net.ActionBarResponse> r3 = com.umeng.socialize.net.ActionBarResponse.class
            r4 = 1
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r0.mContext = r1
            r0.c = r8
            r0.mMethod = r5
            return
    }

    @Override // com.umeng.socialize.net.utils.URequest
    public java.lang.String getEcryptString(java.lang.String r2) {
            r1 = this;
            byte[] r2 = r2.getBytes()
            r0 = 2
            java.lang.String r2 = android.util.Base64.encodeToString(r2, r0)
            return r2
    }

    @Override // com.umeng.socialize.net.base.SocializeRequest
    protected java.lang.String getPath() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "/bar/get/"
            r0.append(r1)
            android.content.Context r1 = r2.mContext
            java.lang.String r1 = com.umeng.socialize.utils.SocializeUtils.getAppkey(r1)
            r0.append(r1)
            java.lang.String r1 = "/android"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.umeng.socialize.net.base.SocializeRequest, com.umeng.socialize.net.utils.URequest
    public void onPrepareRequest() {
            r2 = this;
            java.lang.String r0 = "dc"
            java.lang.String r1 = com.umeng.socialize.Config.Descriptor
            r2.addStringParams(r0, r1)
            java.lang.String r0 = com.umeng.socialize.net.utils.SocializeProtocolConstants.PROTOCOL_KEY_NEW_INSTALL
            int r1 = r2.c
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2.addStringParams(r0, r1)
            java.lang.String r0 = com.umeng.socialize.Config.EntityName
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L21
            java.lang.String r0 = com.umeng.socialize.net.utils.SocializeProtocolConstants.PROTOCOL_KEY_ENTITY_NAME
            java.lang.String r1 = com.umeng.socialize.Config.EntityName
            r2.addStringParams(r0, r1)
        L21:
            return
    }
}
