package com.tencent.mm.opensdk.modelbiz;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class OpenBusiLuckyMoney {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Req extends com.tencent.mm.opensdk.modelbase.BaseReq {
        private static final int MAX_URL_LENGHT = 10240;
        public java.lang.String appId;
        public java.lang.String nonceStr;
        public java.lang.String packageExt;
        public java.lang.String signType;
        public java.lang.String signature;
        public java.lang.String timeStamp;

        public Req() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public boolean checkArgs() {
                r2 = this;
                java.lang.String r0 = r2.appId
                r1 = 0
                if (r0 == 0) goto L3a
                int r0 = r0.length()
                if (r0 > 0) goto Lc
                goto L3a
            Lc:
                java.lang.String r0 = r2.timeStamp
                if (r0 == 0) goto L3a
                int r0 = r0.length()
                if (r0 > 0) goto L17
                goto L3a
            L17:
                java.lang.String r0 = r2.nonceStr
                if (r0 == 0) goto L3a
                int r0 = r0.length()
                if (r0 > 0) goto L22
                goto L3a
            L22:
                java.lang.String r0 = r2.signType
                if (r0 == 0) goto L3a
                int r0 = r0.length()
                if (r0 > 0) goto L2d
                goto L3a
            L2d:
                java.lang.String r0 = r2.signature
                if (r0 == 0) goto L3a
                int r0 = r0.length()
                if (r0 > 0) goto L38
                goto L3a
            L38:
                r0 = 1
                return r0
            L3a:
                return r1
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public int getType() {
                r1 = this;
                r0 = 13
                return r0
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public void toBundle(android.os.Bundle r3) {
                r2 = this;
                super.toBundle(r3)
                java.lang.String r0 = r2.appId
                java.lang.String r1 = "_wxapi_open_busi_lucky_money_appid"
                r3.putString(r1, r0)
                java.lang.String r0 = r2.timeStamp
                java.lang.String r1 = "_wxapi_open_busi_lucky_money_timeStamp"
                r3.putString(r1, r0)
                java.lang.String r0 = r2.nonceStr
                java.lang.String r1 = "_wxapi_open_busi_lucky_money_nonceStr"
                r3.putString(r1, r0)
                java.lang.String r0 = r2.signType
                java.lang.String r1 = "_wxapi_open_busi_lucky_money_signType"
                r3.putString(r1, r0)
                java.lang.String r0 = r2.signature
                java.lang.String r1 = "_wxapi_open_busi_lucky_money_signature"
                r3.putString(r1, r0)
                java.lang.String r0 = r2.packageExt
                java.lang.String r1 = "_wxapi_open_busi_lucky_money_package"
                r3.putString(r1, r0)
                return
        }
    }

    public OpenBusiLuckyMoney() {
            r0 = this;
            r0.<init>()
            return
    }
}
