package xyz.adscope.amps.tool.request;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSHttpRequest extends xyz.adscope.amps.tool.request.inter.BaseHttpRequest {



    public AMPSHttpRequest() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // xyz.adscope.amps.tool.request.inter.IHttpRequest
    public void doRequestWithJson(java.lang.String r1, java.lang.String r2, xyz.adscope.amps.tool.request.inter.IHttpResponseCallback r3) {
            r0 = this;
            r0.requestWithPostMethod(r1, r2, r3)
            return
    }

    @Override // xyz.adscope.amps.tool.request.inter.IHttpRequest
    public void requestWithGetMethod(java.lang.String r1, xyz.adscope.amps.tool.request.inter.IHttpResponseCallback r2) {
            r0 = this;
            xyz.adscope.common.network.simple.SimpleUrlRequest$Api r1 = xyz.adscope.common.network.Kalle.get(r1)     // Catch: java.lang.Exception -> L7
            r1.perform(r2)     // Catch: java.lang.Exception -> L7
        L7:
            return
    }

    @Override // xyz.adscope.amps.tool.request.inter.IHttpRequest
    public void requestWithPostMethod(java.lang.String r3, java.lang.String r4, xyz.adscope.amps.tool.request.inter.IHttpResponseCallback r5) {
            r2 = this;
            xyz.adscope.amps.manager.AMPSSDKManager r0 = xyz.adscope.amps.manager.AMPSSDKManager.getInstance()     // Catch: java.lang.Exception -> L2a
            xyz.adscope.amps.init.inter.IAMPSInitInterface r0 = r0.getIAMPSInitInterface()     // Catch: java.lang.Exception -> L2a
            xyz.adscope.amps.model.AMPSGlobalModel r0 = r0.getGlobalModel()     // Catch: java.lang.Exception -> L2a
            java.lang.String r1 = "101,1001"
            if (r0 == 0) goto L14
            java.lang.String r1 = r0.getAcceptEncrypt()     // Catch: java.lang.Exception -> L2a
        L14:
            java.lang.String r4 = xyz.adscope.amps.tool.AMPSSecurityUtil.processCompressEncrypt(r4, r1)     // Catch: java.lang.Exception -> L2a
            xyz.adscope.common.network.JsonBody r0 = new xyz.adscope.common.network.JsonBody     // Catch: java.lang.Exception -> L2a
            r0.<init>(r4)     // Catch: java.lang.Exception -> L2a
            xyz.adscope.common.network.simple.SimpleBodyRequest$Api r3 = xyz.adscope.common.network.Kalle.post(r3)     // Catch: java.lang.Exception -> L2a
            xyz.adscope.common.network.BodyRequest$Api r3 = r3.body(r0)     // Catch: java.lang.Exception -> L2a
            xyz.adscope.common.network.simple.SimpleBodyRequest$Api r3 = (xyz.adscope.common.network.simple.SimpleBodyRequest.Api) r3     // Catch: java.lang.Exception -> L2a
            r3.perform(r5)     // Catch: java.lang.Exception -> L2a
        L2a:
            return
    }

    public void uploadFile(java.lang.String r2, java.lang.String r3, java.lang.String r4, xyz.adscope.amps.tool.request.inter.IHttpResponseCallback r5) {
            r1 = this;
            xyz.adscope.common.network.FormBody$Builder r5 = xyz.adscope.common.network.FormBody.newBuilder()
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            xyz.adscope.common.network.FormBody$Builder r3 = r5.file(r3, r0)
            xyz.adscope.common.network.FormBody r3 = r3.build()
            xyz.adscope.amps.tool.request.AMPSHttpRequest$1 r4 = new xyz.adscope.amps.tool.request.AMPSHttpRequest$1
            r4.<init>(r1)
            r3.onProgress(r4)
            xyz.adscope.common.network.simple.SimpleBodyRequest$Api r2 = xyz.adscope.common.network.Kalle.post(r2)
            xyz.adscope.common.network.BodyRequest$Api r2 = r2.body(r3)
            xyz.adscope.common.network.simple.SimpleBodyRequest$Api r2 = (xyz.adscope.common.network.simple.SimpleBodyRequest.Api) r2
            xyz.adscope.common.network.Request$Api r2 = r2.tag(r1)
            xyz.adscope.common.network.simple.SimpleBodyRequest$Api r2 = (xyz.adscope.common.network.simple.SimpleBodyRequest.Api) r2
            xyz.adscope.amps.tool.request.AMPSHttpRequest$2 r3 = new xyz.adscope.amps.tool.request.AMPSHttpRequest$2
            r3.<init>(r1)
            r2.perform(r3)
            return
    }

    public void uploadFile(java.lang.String r2, java.lang.String r3, xyz.adscope.amps.tool.request.inter.IHttpResponseCallback r4) {
            r1 = this;
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            xyz.adscope.common.network.simple.SimpleBodyRequest$Api r2 = xyz.adscope.common.network.Kalle.post(r2)
            xyz.adscope.common.network.FileBody r3 = new xyz.adscope.common.network.FileBody
            r3.<init>(r0)
            xyz.adscope.common.network.BodyRequest$Api r2 = r2.body(r3)
            xyz.adscope.common.network.simple.SimpleBodyRequest$Api r2 = (xyz.adscope.common.network.simple.SimpleBodyRequest.Api) r2
            xyz.adscope.common.network.Request$Api r2 = r2.tag(r1)
            xyz.adscope.common.network.simple.SimpleBodyRequest$Api r2 = (xyz.adscope.common.network.simple.SimpleBodyRequest.Api) r2
            r2.perform(r4)
            return
    }
}
