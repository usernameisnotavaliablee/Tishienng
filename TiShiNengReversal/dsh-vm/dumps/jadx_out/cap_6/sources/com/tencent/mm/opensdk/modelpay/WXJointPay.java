package com.tencent.mm.opensdk.modelpay;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class WXJointPay {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class JointPayReq extends com.tencent.mm.opensdk.modelpay.PayReq {
        public JointPayReq() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.tencent.mm.opensdk.modelpay.PayReq, com.tencent.mm.opensdk.modelbase.BaseReq
        public boolean checkArgs() {
                r1 = this;
                boolean r0 = super.checkArgs()
                return r0
        }

        @Override // com.tencent.mm.opensdk.modelpay.PayReq, com.tencent.mm.opensdk.modelbase.BaseReq
        public void fromBundle(android.os.Bundle r1) {
                r0 = this;
                super.fromBundle(r1)
                return
        }

        @Override // com.tencent.mm.opensdk.modelpay.PayReq, com.tencent.mm.opensdk.modelbase.BaseReq
        public int getType() {
                r1 = this;
                r0 = 27
                return r0
        }

        @Override // com.tencent.mm.opensdk.modelpay.PayReq, com.tencent.mm.opensdk.modelbase.BaseReq
        public void toBundle(android.os.Bundle r1) {
                r0 = this;
                super.toBundle(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class JointPayResp extends com.tencent.mm.opensdk.modelpay.PayResp {
        public JointPayResp() {
                r0 = this;
                r0.<init>()
                return
        }

        public JointPayResp(android.os.Bundle r1) {
                r0 = this;
                r0.<init>()
                r0.fromBundle(r1)
                return
        }

        @Override // com.tencent.mm.opensdk.modelpay.PayResp, com.tencent.mm.opensdk.modelbase.BaseResp
        public boolean checkArgs() {
                r1 = this;
                boolean r0 = super.checkArgs()
                return r0
        }

        @Override // com.tencent.mm.opensdk.modelpay.PayResp, com.tencent.mm.opensdk.modelbase.BaseResp
        public void fromBundle(android.os.Bundle r1) {
                r0 = this;
                super.fromBundle(r1)
                return
        }

        @Override // com.tencent.mm.opensdk.modelpay.PayResp, com.tencent.mm.opensdk.modelbase.BaseResp
        public int getType() {
                r1 = this;
                r0 = 27
                return r0
        }

        @Override // com.tencent.mm.opensdk.modelpay.PayResp, com.tencent.mm.opensdk.modelbase.BaseResp
        public void toBundle(android.os.Bundle r1) {
                r0 = this;
                super.toBundle(r1)
                return
        }
    }

    public WXJointPay() {
            r0 = this;
            r0.<init>()
            return
    }
}
