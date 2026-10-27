package com.tencent.mm.opensdk.modelbiz;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class WXLaunchWxaRedirectingPage {
    public static final java.lang.String URI_PATH = "launchWxaOpenApiRedirectingPage";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface ConstantsWxaRedirectingPage {
        public static final java.lang.String KEY_CALLBACK_ACTIVITY = "_launch_wx_wxa_redirecting_page_callback_activity";
        public static final java.lang.String KEY_CALLBACK_MSG = "_launch_wx_wxa_redirecting_page_callback_msg";
        public static final java.lang.String KEY_INVOKE_TICKET = "_launch_wx_wxa_redirecting_page_invoke_ticket";
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Req extends com.tencent.mm.opensdk.modelbase.BaseReq {
        private static final java.lang.String TAG = "MicroMsg.SDK.WXLaunchWxaRedirectingPage.Req";
        public java.lang.String callbackActivity;
        public java.lang.String invokeTicket;

        public Req() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public boolean checkArgs() {
                r1 = this;
                java.lang.String r0 = r1.invokeTicket
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                r0 = r0 ^ 1
                return r0
        }

        public void fromArray(java.lang.String[] r2) {
                r1 = this;
                r0 = 0
                r0 = r2[r0]
                r1.invokeTicket = r0
                r0 = 1
                r2 = r2[r0]
                r1.callbackActivity = r2
                return
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public void fromBundle(android.os.Bundle r2) {
                r1 = this;
                super.fromBundle(r2)
                java.lang.String r0 = "_launch_wx_wxa_redirecting_page_invoke_ticket"
                java.lang.String r0 = r2.getString(r0)
                r1.invokeTicket = r0
                java.lang.String r0 = "_launch_wx_wxa_redirecting_page_callback_activity"
                java.lang.String r2 = r2.getString(r0)
                r1.callbackActivity = r2
                return
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public int getType() {
                r1 = this;
                r0 = 30
                return r0
        }

        public java.lang.String[] toArray() {
                r2 = this;
                java.lang.String r0 = r2.invokeTicket
                java.lang.String r1 = r2.callbackActivity
                java.lang.String[] r0 = new java.lang.String[]{r0, r1}
                return r0
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public void toBundle(android.os.Bundle r3) {
                r2 = this;
                super.toBundle(r3)
                java.lang.String r0 = r2.invokeTicket
                java.lang.String r1 = "_launch_wx_wxa_redirecting_page_invoke_ticket"
                r3.putString(r1, r0)
                java.lang.String r0 = r2.callbackActivity
                java.lang.String r1 = "_launch_wx_wxa_redirecting_page_callback_activity"
                r3.putString(r1, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Resp extends com.tencent.mm.opensdk.modelbase.BaseResp {
        private static final java.lang.String TAG = "MicroMsg.SDK.WXLaunchWxaFRedirectingPage.Resp";
        public java.lang.String callbackActivity;
        public java.lang.String invokeTicket;

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
                java.lang.String r0 = "_launch_wx_wxa_redirecting_page_invoke_ticket"
                java.lang.String r0 = r2.getString(r0)
                r1.invokeTicket = r0
                java.lang.String r0 = "_launch_wx_wxa_redirecting_page_callback_activity"
                java.lang.String r2 = r2.getString(r0)
                r1.callbackActivity = r2
                return
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseResp
        public int getType() {
                r1 = this;
                r0 = 30
                return r0
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseResp
        public void toBundle(android.os.Bundle r3) {
                r2 = this;
                super.toBundle(r3)
                java.lang.String r0 = r2.invokeTicket
                java.lang.String r1 = "_launch_wx_wxa_redirecting_page_invoke_ticket"
                r3.putString(r1, r0)
                java.lang.String r0 = r2.callbackActivity
                java.lang.String r1 = "_launch_wx_wxa_redirecting_page_callback_activity"
                r3.putString(r1, r0)
                return
        }
    }

    public WXLaunchWxaRedirectingPage() {
            r0 = this;
            r0.<init>()
            return
    }
}
