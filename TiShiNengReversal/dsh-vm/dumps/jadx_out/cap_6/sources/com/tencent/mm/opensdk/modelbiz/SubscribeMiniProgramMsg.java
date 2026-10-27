package com.tencent.mm.opensdk.modelbiz;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class SubscribeMiniProgramMsg {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Req extends com.tencent.mm.opensdk.modelbase.BaseReq {
        private static final int LENGTH_LIMIT = 1024;
        private static final java.lang.String TAG = "MicroMsg.SDK.SubscribeMessage.Req";
        public java.lang.String miniProgramAppId;

        public Req() {
                r0 = this;
                r0.<init>()
                return
        }

        public Req(android.os.Bundle r1) {
                r0 = this;
                r0.<init>()
                r0.fromBundle(r1)
                return
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public boolean checkArgs() {
                r2 = this;
                java.lang.String r0 = r2.miniProgramAppId
                if (r0 == 0) goto Ld
                int r0 = r0.length()
                if (r0 != 0) goto Lb
                goto Ld
            Lb:
                r0 = 1
                return r0
            Ld:
                java.lang.String r0 = "MicroMsg.SDK.SubscribeMessage.Req"
                java.lang.String r1 = "checkArgs fail, miniProgramAppId is null"
                com.tencent.mm.opensdk.utils.Log.e(r0, r1)
                r0 = 0
                return r0
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public void fromBundle(android.os.Bundle r2) {
                r1 = this;
                super.fromBundle(r2)
                java.lang.String r0 = "_wxapi_subscribeminiprogram_req_miniprogramappid"
                java.lang.String r2 = r2.getString(r0)
                r1.miniProgramAppId = r2
                return
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public int getType() {
                r1 = this;
                r0 = 23
                return r0
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public void toBundle(android.os.Bundle r3) {
                r2 = this;
                super.toBundle(r3)
                java.lang.String r0 = r2.miniProgramAppId
                java.lang.String r1 = "_wxapi_subscribeminiprogram_req_miniprogramappid"
                r3.putString(r1, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Resp extends com.tencent.mm.opensdk.modelbase.BaseResp {
        private static final java.lang.String TAG = "MicroMsg.SDK.SubscribeMessage.Resp";
        public java.lang.String nickname;
        public java.lang.String unionId;

        public Resp() {
                r0 = this;
                r0.<init>()
                return
        }

        public Resp(android.os.Bundle r1) {
                r0 = this;
                r0.<init>()
                r0.fromBundle(r1)
                return
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseResp
        public boolean checkArgs() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseResp
        public void fromBundle(android.os.Bundle r2) {
                r1 = this;
                super.fromBundle(r2)
                java.lang.String r0 = "_wxapi_subscribeminiprogram_resp_unionId"
                java.lang.String r0 = r2.getString(r0)
                r1.unionId = r0
                java.lang.String r0 = "_wxapi_subscribeminiprogram_resp_nickname"
                java.lang.String r2 = r2.getString(r0)
                r1.nickname = r2
                return
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseResp
        public int getType() {
                r1 = this;
                r0 = 23
                return r0
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseResp
        public void toBundle(android.os.Bundle r3) {
                r2 = this;
                super.toBundle(r3)
                java.lang.String r0 = r2.unionId
                java.lang.String r1 = "_wxapi_subscribeminiprogram_resp_unionId"
                r3.putString(r1, r0)
                java.lang.String r0 = r2.nickname
                java.lang.String r1 = "_wxapi_subscribeminiprogram_resp_nickname"
                r3.putString(r1, r0)
                return
        }
    }

    private SubscribeMiniProgramMsg() {
            r0 = this;
            r0.<init>()
            return
    }
}
