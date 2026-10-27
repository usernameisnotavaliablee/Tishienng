package com.tencent.mm.opensdk.modelbiz;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class WXPreloadMiniProgram {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Req extends com.tencent.mm.opensdk.modelbase.BaseReq {
        private static final java.lang.String TAG = "MicroMsg.SDK.WXPreloadMiniProgram.Req";
        public java.lang.String extData;
        public int miniprogramType;
        public java.lang.String path;
        public java.lang.String userName;

        public Req() {
                r2 = this;
                r2.<init>()
                java.lang.String r0 = ""
                r2.path = r0
                r1 = 0
                r2.miniprogramType = r1
                r2.extData = r0
                return
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public boolean checkArgs() {
                r4 = this;
                java.lang.String r0 = r4.userName
                boolean r0 = com.tencent.mm.opensdk.utils.b.b(r0)
                r1 = 0
                java.lang.String r2 = "MicroMsg.SDK.WXPreloadMiniProgram.Req"
                if (r0 == 0) goto L11
                java.lang.String r0 = "userName is null"
            Ld:
                com.tencent.mm.opensdk.utils.Log.e(r2, r0)
                return r1
            L11:
                int r0 = r4.miniprogramType
                if (r0 < 0) goto L1b
                r3 = 2
                if (r0 <= r3) goto L19
                goto L1b
            L19:
                r0 = 1
                return r0
            L1b:
                java.lang.String r0 = "miniprogram type should between MINIPTOGRAM_TYPE_RELEASE and MINIPROGRAM_TYPE_PREVIEW"
                goto Ld
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public int getType() {
                r1 = this;
                r0 = 28
                return r0
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public void toBundle(android.os.Bundle r3) {
                r2 = this;
                super.toBundle(r3)
                java.lang.String r0 = r2.userName
                java.lang.String r1 = "_launch_wxminiprogram_username"
                r3.putString(r1, r0)
                java.lang.String r0 = r2.path
                java.lang.String r1 = "_launch_wxminiprogram_path"
                r3.putString(r1, r0)
                java.lang.String r0 = r2.extData
                java.lang.String r1 = "_launch_wxminiprogram_extData"
                r3.putString(r1, r0)
                int r0 = r2.miniprogramType
                java.lang.String r1 = "_launch_wxminiprogram_type"
                r3.putInt(r1, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Resp extends com.tencent.mm.opensdk.modelbase.BaseResp {
        public java.lang.String extMsg;

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
                java.lang.String r0 = "_launch_wxminiprogram_ext_msg"
                java.lang.String r2 = r2.getString(r0)
                r1.extMsg = r2
                return
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseResp
        public int getType() {
                r1 = this;
                r0 = 28
                return r0
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseResp
        public void toBundle(android.os.Bundle r3) {
                r2 = this;
                super.toBundle(r3)
                java.lang.String r0 = r2.extMsg
                java.lang.String r1 = "_launch_wxminiprogram_ext_msg"
                r3.putString(r1, r0)
                return
        }
    }

    public WXPreloadMiniProgram() {
            r0 = this;
            r0.<init>()
            return
    }
}
