package com.tencent.tauth;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class AuthActivity extends android.app.Activity {
    public static final java.lang.String ACTION_SHARE_PRIZE = "sharePrize";
    private static int a;
    private java.util.Map<java.lang.String, com.tencent.tauth.AuthActivity.ActionHandler> b;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface ActionHandler {
        void handleAction(android.app.Activity r1, android.os.Bundle r2);
    }

    static {
            r0 = 42708(0xa6d4, float:5.9847E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public AuthActivity() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.b = r0
            return
    }

    private void a() {
            r3 = this;
            java.util.Map<java.lang.String, com.tencent.tauth.AuthActivity$ActionHandler> r0 = r3.b
            com.tencent.tauth.AuthActivity$1 r1 = new com.tencent.tauth.AuthActivity$1
            r1.<init>(r3)
            java.lang.String r2 = "action_common_channel"
            r0.put(r2, r1)
            return
    }

    private void a(android.net.Uri r11) {
            r10 = this;
            java.lang.String r0 = "activityid"
            java.lang.String r1 = "-->handleActionUri--start"
            java.lang.String r2 = "openSDK_LOG.AuthActivity"
            com.tencent.open.log.SLog.i(r2, r1)
            if (r11 == 0) goto L240
            java.lang.String r1 = r11.toString()
            if (r1 == 0) goto L240
            java.lang.String r1 = r11.toString()
            java.lang.String r3 = ""
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L1f
            goto L240
        L1f:
            java.lang.String r11 = r11.toString()
            java.lang.String r1 = "#"
            int r1 = r11.indexOf(r1)
            r4 = 1
            int r1 = r1 + r4
            java.lang.String r11 = r11.substring(r1)
            android.os.Bundle r11 = com.tencent.open.utils.m.a(r11)
            if (r11 != 0) goto L3e
            java.lang.String r11 = "-->handleActionUri, bundle is null"
            com.tencent.open.log.SLog.w(r2, r11)
            r10.finish()
            return
        L3e:
            java.lang.String r1 = "action"
            java.lang.String r1 = r11.getString(r1)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "-->handleActionUri, action: "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            com.tencent.open.log.SLog.i(r2, r5)
            if (r1 != 0) goto L5e
            r10.finish()
            return
        L5e:
            java.lang.String r5 = "shareToQQ"
            boolean r5 = r1.equals(r5)
            java.lang.String r6 = "shareToQzone"
            r7 = 0
            r8 = 603979776(0x24000000, float:2.7755576E-17)
            java.lang.Class<com.tencent.connect.common.AssistActivity> r9 = com.tencent.connect.common.AssistActivity.class
            if (r5 != 0) goto L205
            boolean r5 = r1.equals(r6)
            if (r5 != 0) goto L205
            java.lang.String r5 = "sendToMyComputer"
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L205
            java.lang.String r5 = "shareToTroopBar"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L85
            goto L205
        L85:
            java.lang.String r5 = "addToQQFavorites"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto Lb0
            android.content.Intent r0 = r10.getIntent()
            r0.putExtras(r11)
            java.lang.String r11 = "key_action"
            java.lang.String r2 = "action_share"
            r0.putExtra(r11, r2)
            com.tencent.connect.common.UIListenerManager r11 = com.tencent.connect.common.UIListenerManager.getInstance()
            com.tencent.tauth.IUiListener r11 = r11.getListnerWithAction(r1)
            if (r11 == 0) goto Lac
            com.tencent.connect.common.UIListenerManager r1 = com.tencent.connect.common.UIListenerManager.getInstance()
            r1.handleDataToListener(r0, r11)
        Lac:
            r10.finish()
            return
        Lb0:
            java.lang.String r5 = "sharePrize"
            boolean r6 = r1.equals(r5)
            if (r6 == 0) goto Lf4
            android.content.pm.PackageManager r1 = r10.getPackageManager()
            java.lang.String r6 = r10.getPackageName()
            android.content.Intent r1 = r1.getLaunchIntentForPackage(r6)
            java.lang.String r6 = "response"
            java.lang.String r11 = r11.getString(r6)
            org.json.JSONObject r11 = com.tencent.open.utils.m.d(r11)     // Catch: java.lang.Exception -> Ld3
            java.lang.String r3 = r11.getString(r0)     // Catch: java.lang.Exception -> Ld3
            goto Ld9
        Ld3:
            r11 = move-exception
            java.lang.String r6 = "sharePrize parseJson has exception."
            com.tencent.open.log.SLog.e(r2, r6, r11)
        Ld9:
            boolean r11 = android.text.TextUtils.isEmpty(r3)
            if (r11 != 0) goto Led
            r1.putExtra(r5, r4)
            android.os.Bundle r11 = new android.os.Bundle
            r11.<init>()
            r11.putString(r0, r3)
            r1.putExtras(r11)
        Led:
            r10.startActivity(r1)
            r10.finish()
            return
        Lf4:
            java.lang.String r0 = "sdkSetAvatar"
            boolean r0 = r1.equals(r0)
            java.lang.String r3 = "key_request_code"
            java.lang.String r4 = "stay_back_stack"
            if (r0 == 0) goto L122
            android.content.Intent r0 = r10.getIntent()
            boolean r0 = r0.getBooleanExtra(r4, r7)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r10, r9)
            r2 = 10108(0x277c, float:1.4164E-41)
            r1.putExtra(r3, r2)
            r1.putExtra(r4, r0)
            r1.putExtras(r11)
            r1.setFlags(r8)
            r10.startActivity(r1)
            r10.finish()
            return
        L122:
            java.lang.String r0 = "sdkSetDynamicAvatar"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L14c
            android.content.Intent r0 = r10.getIntent()
            boolean r0 = r0.getBooleanExtra(r4, r7)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r10, r9)
            r2 = 10110(0x277e, float:1.4167E-41)
            r1.putExtra(r3, r2)
            r1.putExtra(r4, r0)
            r1.putExtras(r11)
            r1.setFlags(r8)
            r10.startActivity(r1)
            r10.finish()
            return
        L14c:
            java.lang.String r0 = "sdkSetEmotion"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L176
            android.content.Intent r0 = r10.getIntent()
            boolean r0 = r0.getBooleanExtra(r4, r7)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r10, r9)
            r2 = 10109(0x277d, float:1.4166E-41)
            r1.putExtra(r3, r2)
            r1.putExtra(r4, r0)
            r1.putExtras(r11)
            r1.setFlags(r8)
            r10.startActivity(r1)
            r10.finish()
            return
        L176:
            java.lang.String r0 = "bindGroup"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1a5
            java.lang.String r0 = "-->handleActionUri--bind group callback."
            com.tencent.open.log.SLog.i(r2, r0)
            android.content.Intent r0 = r10.getIntent()
            boolean r0 = r0.getBooleanExtra(r4, r7)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r10, r9)
            r2 = 10112(0x2780, float:1.417E-41)
            r1.putExtra(r3, r2)
            r1.putExtra(r4, r0)
            r1.putExtras(r11)
            r1.setFlags(r8)
            r10.startActivity(r1)
            r10.finish()
            return
        L1a5:
            java.lang.String r0 = "joinGroup"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1d4
            java.lang.String r0 = "-->handleActionUri--join group callback. "
            com.tencent.open.log.SLog.i(r2, r0)
            android.content.Intent r0 = r10.getIntent()
            boolean r0 = r0.getBooleanExtra(r4, r7)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r10, r9)
            r2 = 10111(0x277f, float:1.4169E-41)
            r1.putExtra(r3, r2)
            r1.putExtra(r4, r0)
            r1.putExtras(r11)
            r1.setFlags(r8)
            r10.startActivity(r1)
            r10.finish()
            return
        L1d4:
            java.lang.String r0 = "guildOpen"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1f3
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r10, r9)
            r0.putExtras(r11)
            r11 = 10113(0x2781, float:1.4171E-41)
            r0.putExtra(r3, r11)
            r0.setFlags(r8)
            r10.startActivity(r0)
            r10.finish()
            return
        L1f3:
            java.util.Map<java.lang.String, com.tencent.tauth.AuthActivity$ActionHandler> r0 = r10.b
            java.lang.Object r0 = r0.get(r1)
            com.tencent.tauth.AuthActivity$ActionHandler r0 = (com.tencent.tauth.AuthActivity.ActionHandler) r0
            if (r0 == 0) goto L201
            r0.handleAction(r10, r11)
            return
        L201:
            r10.finish()
            return
        L205:
            boolean r0 = r1.equals(r6)
            if (r0 == 0) goto L229
            java.lang.String r0 = "com.tencent.mobileqq"
            java.lang.String r0 = com.tencent.open.utils.k.a(r10, r0)
            if (r0 == 0) goto L229
            java.lang.String r0 = "5.2.0"
            int r0 = com.tencent.open.utils.k.c(r10, r0)
            if (r0 >= 0) goto L229
            int r0 = com.tencent.tauth.AuthActivity.a
            int r0 = r0 + r4
            com.tencent.tauth.AuthActivity.a = r0
            r1 = 2
            if (r0 != r1) goto L229
            com.tencent.tauth.AuthActivity.a = r7
            r10.finish()
            return
        L229:
            java.lang.String r0 = "-->handleActionUri, most share action, start assistactivity"
            com.tencent.open.log.SLog.i(r2, r0)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r10, r9)
            r0.putExtras(r11)
            r0.setFlags(r8)
            r10.startActivity(r0)
            r10.finish()
            return
        L240:
            java.lang.String r11 = "-->handleActionUri, uri invalid"
            com.tencent.open.log.SLog.w(r2, r11)
            r10.finish()
            return
    }

    @Override // android.app.Activity
    public void finish() {
            r3 = this;
            super.finish()     // Catch: java.lang.Exception -> L4
            return
        L4:
            r0 = move-exception
            java.lang.String r1 = "openSDK_LOG.AuthActivity"
            java.lang.String r2 = "activity finish exception: "
            com.tencent.open.log.SLog.e(r1, r2, r0)
            return
    }

    @Override // android.app.Activity
    protected native void onCreate(android.os.Bundle r1);
}
