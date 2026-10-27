package com.umeng.socialize.handler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class UMMoreHandler extends com.umeng.socialize.handler.UMSSOHandler {
    public UMMoreHandler() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public java.lang.String getVersion() {
            r1 = this;
            java.lang.String r0 = "7.3.2"
            return r0
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public boolean share(com.umeng.socialize.ShareContent r4, com.umeng.socialize.UMShareListener r5) {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "android.intent.action.SEND"
            r0.setAction(r1)
            com.umeng.socialize.media.UMediaObject r1 = r4.mMedia
            boolean r1 = r1 instanceof com.umeng.socialize.media.UMImage
            if (r1 == 0) goto L31
            java.lang.String r1 = "image/*"
            r0.setType(r1)
            com.umeng.socialize.media.UMediaObject r1 = r4.mMedia
            com.umeng.socialize.media.UMImage r1 = (com.umeng.socialize.media.UMImage) r1
            java.io.File r1 = r1.asFileImage()
            if (r1 == 0) goto L36
            android.content.Context r2 = r3.getContext()
            java.lang.String r1 = r1.getPath()
            android.net.Uri r1 = com.umeng.socialize.utils.SocializeUtils.insertImage(r2, r1)
            java.lang.String r2 = "android.intent.extra.STREAM"
            r0.putExtra(r2, r1)
            goto L36
        L31:
            java.lang.String r1 = "text/plain"
            r0.setType(r1)
        L36:
            java.lang.String r1 = "android.intent.extra.SUBJECT"
            java.lang.String r2 = r4.subject
            r0.putExtra(r1, r2)
            java.lang.String r1 = "android.intent.extra.TEXT"
            java.lang.String r4 = r4.mText
            r0.putExtra(r1, r4)
            java.lang.String r4 = com.umeng.socialize.Config.MORE_TITLE
            android.content.Intent r4 = android.content.Intent.createChooser(r0, r4)
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r4.addFlags(r0)
            android.app.Activity r0 = r3.getCurrentActivity()     // Catch: java.lang.Exception -> L64
            if (r0 == 0) goto L66
            boolean r1 = r0.isFinishing()     // Catch: java.lang.Exception -> L64
            if (r1 != 0) goto L66
            r0.startActivity(r4)     // Catch: java.lang.Exception -> L64
            com.umeng.socialize.bean.SHARE_MEDIA r4 = com.umeng.socialize.bean.SHARE_MEDIA.MORE     // Catch: java.lang.Exception -> L64
            r5.onResult(r4)     // Catch: java.lang.Exception -> L64
            goto L7d
        L64:
            r4 = move-exception
            goto L73
        L66:
            com.umeng.socialize.bean.SHARE_MEDIA r4 = com.umeng.socialize.bean.SHARE_MEDIA.MORE     // Catch: java.lang.Exception -> L64
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Exception -> L64
            java.lang.String r1 = "activity null!"
            r0.<init>(r1)     // Catch: java.lang.Exception -> L64
            r5.onError(r4, r0)     // Catch: java.lang.Exception -> L64
            goto L7d
        L73:
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.INTER.MOREERROR
            com.umeng.socialize.utils.SLog.error(r0, r4)
            com.umeng.socialize.bean.SHARE_MEDIA r0 = com.umeng.socialize.bean.SHARE_MEDIA.MORE
            r5.onError(r0, r4)
        L7d:
            r4 = 1
            return r4
    }
}
