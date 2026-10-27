package com.tencent.mm.opensdk.modelbiz;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class WXNontaxPay {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Req extends com.tencent.mm.opensdk.modelbase.BaseReq {
        private static final java.lang.String TAG = "MicroMsg.SDK.WXNontaxPay.Req";
        private static final int URL_LENGTH_LIMIT = 10240;
        public java.lang.String url;

        public Req() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public boolean checkArgs() {
                r4 = this;
                java.lang.String r0 = r4.url
                boolean r0 = com.tencent.mm.opensdk.utils.b.b(r0)
                r1 = 0
                java.lang.String r2 = "MicroMsg.SDK.WXNontaxPay.Req"
                if (r0 == 0) goto L11
                java.lang.String r0 = "url should not be empty"
                com.tencent.mm.opensdk.utils.Log.i(r2, r0)
                return r1
            L11:
                java.lang.String r0 = r4.url
                int r0 = r0.length()
                r3 = 10240(0x2800, float:1.4349E-41)
                if (r0 <= r3) goto L21
                java.lang.String r0 = "url must be in 10k"
                com.tencent.mm.opensdk.utils.Log.e(r2, r0)
                return r1
            L21:
                r0 = 1
                return r0
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public void fromBundle(android.os.Bundle r2) {
                r1 = this;
                super.fromBundle(r2)
                java.lang.String r0 = "_wxapi_nontax_pay_req_url"
                java.lang.String r2 = r2.getString(r0)
                r1.url = r2
                return
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public int getType() {
                r1 = this;
                r0 = 21
                return r0
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public void toBundle(android.os.Bundle r3) {
                r2 = this;
                super.fromBundle(r3)
                java.lang.String r0 = r2.url
                java.lang.String r1 = "_wxapi_nontax_pay_req_url"
                r3.putString(r1, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Resp extends com.tencent.mm.opensdk.modelbase.BaseResp {
        public java.lang.String wxOrderId;

        public Resp() {
                r0 = this;
                r0.<init>()
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
                java.lang.String r0 = "_wxapi_nontax_pay_order_id"
                java.lang.String r2 = r2.getString(r0)
                r1.wxOrderId = r2
                return
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseResp
        public int getType() {
                r1 = this;
                r0 = 21
                return r0
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseResp
        public void toBundle(android.os.Bundle r3) {
                r2 = this;
                super.fromBundle(r3)
                java.lang.String r0 = r2.wxOrderId
                java.lang.String r1 = "_wxapi_nontax_pay_order_id"
                r3.putString(r1, r0)
                return
        }
    }

    public WXNontaxPay() {
            r0 = this;
            r0.<init>()
            return
    }
}
