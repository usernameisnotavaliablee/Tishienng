package com.tencent.mm.opensdk.modelbiz;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class HandleScanResult {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Req extends com.tencent.mm.opensdk.modelbase.BaseReq {
        private static final int MAX_URL_LENGHT = 10240;
        public java.lang.String scanResult;

        public Req() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public boolean checkArgs() {
                r3 = this;
                java.lang.String r0 = r3.scanResult
                r1 = 0
                if (r0 == 0) goto L19
                int r0 = r0.length()
                if (r0 >= 0) goto Lc
                goto L19
            Lc:
                java.lang.String r0 = r3.scanResult
                int r0 = r0.length()
                r2 = 10240(0x2800, float:1.4349E-41)
                if (r0 <= r2) goto L17
                return r1
            L17:
                r0 = 1
                return r0
            L19:
                return r1
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public int getType() {
                r1 = this;
                r0 = 17
                return r0
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public void toBundle(android.os.Bundle r3) {
                r2 = this;
                super.toBundle(r3)
                java.lang.String r0 = r2.scanResult
                java.lang.String r0 = java.net.URLEncoder.encode(r0)
                java.lang.String r1 = "_wxapi_scan_qrcode_result"
                r3.putString(r1, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Resp extends com.tencent.mm.opensdk.modelbase.BaseResp {
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
        public void fromBundle(android.os.Bundle r1) {
                r0 = this;
                super.fromBundle(r1)
                return
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseResp
        public int getType() {
                r1 = this;
                r0 = 17
                return r0
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseResp
        public void toBundle(android.os.Bundle r1) {
                r0 = this;
                super.toBundle(r1)
                return
        }
    }

    public HandleScanResult() {
            r0 = this;
            r0.<init>()
            return
    }
}
