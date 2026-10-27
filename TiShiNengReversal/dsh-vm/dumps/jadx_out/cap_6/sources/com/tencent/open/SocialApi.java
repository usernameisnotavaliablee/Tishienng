package com.tencent.open;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class SocialApi {
    private com.tencent.open.SocialApiIml a;

    public SocialApi(com.tencent.connect.auth.QQToken r2) {
            r1 = this;
            r1.<init>()
            com.tencent.open.SocialApiIml r0 = new com.tencent.open.SocialApiIml
            r0.<init>(r2)
            r1.a = r0
            return
    }

    public void ask(android.app.Activity r2, android.os.Bundle r3, com.tencent.tauth.IUiListener r4) {
            r1 = this;
            java.lang.String r0 = "SocialApi"
            boolean r0 = com.tencent.connect.a.a(r0, r4)
            if (r0 == 0) goto L9
            return
        L9:
            com.tencent.open.SocialApiIml r0 = r1.a
            r0.ask(r2, r3, r4)
            return
    }

    public void gift(android.app.Activity r2, android.os.Bundle r3, com.tencent.tauth.IUiListener r4) {
            r1 = this;
            java.lang.String r0 = "SocialApi"
            boolean r0 = com.tencent.connect.a.a(r0, r4)
            if (r0 == 0) goto L9
            return
        L9:
            com.tencent.open.SocialApiIml r0 = r1.a
            r0.gift(r2, r3, r4)
            return
    }

    public void invite(android.app.Activity r2, android.os.Bundle r3, com.tencent.tauth.IUiListener r4) {
            r1 = this;
            java.lang.String r0 = "SocialApi"
            boolean r0 = com.tencent.connect.a.a(r0, r4)
            if (r0 == 0) goto L9
            return
        L9:
            com.tencent.open.SocialApiIml r0 = r1.a
            r0.invite(r2, r3, r4)
            return
    }

    public void story(android.app.Activity r2, android.os.Bundle r3, com.tencent.tauth.IUiListener r4) {
            r1 = this;
            java.lang.String r0 = "SocialApi"
            boolean r0 = com.tencent.connect.a.a(r0, r4)
            if (r0 == 0) goto L9
            return
        L9:
            com.tencent.open.SocialApiIml r0 = r1.a
            r0.story(r2, r3, r4)
            return
    }
}
