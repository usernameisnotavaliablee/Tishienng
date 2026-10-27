package com.tencent.mm.opensdk.modelbiz;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class JoinChatroom {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Req extends com.tencent.mm.opensdk.modelbase.BaseReq {
        public java.lang.String chatroomNickName;
        public java.lang.String extMsg;
        public java.lang.String groupId;

        public Req() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = ""
                r1.groupId = r0
                return
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public boolean checkArgs() {
                r1 = this;
                java.lang.String r0 = r1.groupId
                boolean r0 = com.tencent.mm.opensdk.utils.b.b(r0)
                if (r0 == 0) goto La
                r0 = 0
                return r0
            La:
                r0 = 1
                return r0
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public int getType() {
                r1 = this;
                r0 = 15
                return r0
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public void toBundle(android.os.Bundle r3) {
                r2 = this;
                super.toBundle(r3)
                java.lang.String r0 = r2.groupId
                java.lang.String r1 = "_wxapi_join_chatroom_group_id"
                r3.putString(r1, r0)
                java.lang.String r0 = r2.chatroomNickName
                java.lang.String r1 = "_wxapi_join_chatroom_chatroom_nickname"
                r3.putString(r1, r0)
                java.lang.String r0 = r2.extMsg
                java.lang.String r1 = "_wxapi_join_chatroom_ext_msg"
                r3.putString(r1, r0)
                java.lang.String r0 = r2.openId
                java.lang.String r1 = "_wxapi_basereq_openid"
                r3.putString(r1, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Resp extends com.tencent.mm.opensdk.modelbase.BaseResp {
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
                java.lang.String r0 = "_wxapi_join_chatroom_ext_msg"
                java.lang.String r2 = r2.getString(r0)
                r1.extMsg = r2
                return
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseResp
        public int getType() {
                r1 = this;
                r0 = 15
                return r0
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseResp
        public void toBundle(android.os.Bundle r3) {
                r2 = this;
                super.toBundle(r3)
                java.lang.String r0 = r2.extMsg
                java.lang.String r1 = "_wxapi_join_chatroom_ext_msg"
                r3.putString(r1, r0)
                return
        }
    }

    private JoinChatroom() {
            r0 = this;
            r0.<init>()
            return
    }
}
