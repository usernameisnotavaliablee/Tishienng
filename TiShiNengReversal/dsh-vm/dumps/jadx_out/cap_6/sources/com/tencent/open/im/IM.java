package com.tencent.open.im;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class IM extends com.tencent.connect.common.BaseApi {
    public static final java.lang.String CHAT_TYPE_AIO = "thirdparty2c";
    public static final java.lang.String CHAT_TYPE_AUDIO_CHAT = "audio_chat";
    public static final java.lang.String CHAT_TYPE_VIDEO_CHAT = "video_chat";
    public static final int IM_LENGTH_SHORT = -3;
    public static final int IM_SHOULD_DOWNLOAD = -2;
    public static final int IM_SUCCESS = 0;
    public static final int IM_UIN_EMPTY = -1;
    public static final int IM_UIN_NOT_DIGIT = -4;
    public static final int IM_UNKNOWN_TYPE = -5;

    public IM(android.content.Context r1, com.tencent.connect.auth.QQToken r2) {
            r0 = this;
            r0.<init>(r2)
            return
    }

    public IM(android.content.Context r1, com.tencent.connect.auth.c r2, com.tencent.connect.auth.QQToken r3) {
            r0 = this;
            r0.<init>(r2, r3)
            return
    }

    public IM(com.tencent.connect.auth.QQToken r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public int startIMConversation(android.app.Activity r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
            r9 = this;
            java.lang.String r0 = "ImApi"
            r1 = 0
            boolean r0 = com.tencent.connect.a.a(r0, r1)
            r1 = -5
            if (r0 == 0) goto Lb
            return r1
        Lb:
            if (r11 == 0) goto Lbf
            java.lang.String r0 = "thirdparty2c"
            boolean r0 = r11.equals(r0)
            java.lang.String r2 = "video_chat"
            java.lang.String r3 = "audio_chat"
            if (r0 != 0) goto L27
            boolean r0 = r11.equals(r3)
            if (r0 != 0) goto L27
            boolean r0 = r11.equals(r2)
            if (r0 != 0) goto L27
            goto Lbf
        L27:
            boolean r0 = r11.equals(r3)
            if (r0 == 0) goto L2e
            goto L31
        L2e:
            r11.equals(r2)
        L31:
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 == 0) goto L39
            r10 = -1
            return r10
        L39:
            int r0 = r12.length()
            r1 = 5
            if (r0 >= r1) goto L42
            r10 = -3
            return r10
        L42:
            r0 = 0
            r2 = 0
        L44:
            int r3 = r12.length()
            if (r2 >= r3) goto L59
            char r3 = r12.charAt(r2)
            boolean r3 = java.lang.Character.isDigit(r3)
            if (r3 != 0) goto L56
            r10 = -4
            return r10
        L56:
            int r2 = r2 + 1
            goto L44
        L59:
            boolean r2 = com.tencent.open.utils.m.d(r10)
            if (r2 == 0) goto La9
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "android.intent.action.VIEW"
            r2.<init>(r3)
            com.tencent.connect.auth.QQToken r3 = r9.c
            java.lang.String r3 = r3.getOpenId()
            java.lang.String r3 = com.tencent.open.utils.m.k(r3)
            com.tencent.connect.auth.QQToken r4 = r9.c
            java.lang.String r4 = r4.getAppId()
            java.lang.String r4 = com.tencent.open.utils.m.k(r4)
            java.lang.String r5 = com.tencent.open.utils.m.k(r13)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r11
            r11 = 1
            r1[r11] = r12
            r11 = 2
            r1[r11] = r3
            r11 = 3
            r1[r11] = r4
            r11 = 4
            r1[r11] = r5
            java.lang.String r11 = "mqqapi://im/chat?chat_type=%1$s&uin=%2$s&version=1&src_type=app&open_id=%3$s&app_id=%4$s&app_pkg_name=%5$s"
            java.lang.String r11 = java.lang.String.format(r11, r1)
            android.net.Uri r11 = android.net.Uri.parse(r11)
            r2.setData(r11)
            java.lang.String r11 = "com.tencent.mobileqq"
            r2.setPackage(r11)
            java.lang.String r11 = "pkg_name"
            r2.putExtra(r11, r13)
            r10.startActivity(r2)
            return r0
        La9:
            com.tencent.open.TDialog r3 = new com.tencent.open.TDialog     // Catch: java.lang.RuntimeException -> Lbd
            java.lang.String r5 = ""
            java.lang.String r11 = ""
            java.lang.String r6 = r9.a(r11)     // Catch: java.lang.RuntimeException -> Lbd
            com.tencent.connect.auth.QQToken r8 = r9.c     // Catch: java.lang.RuntimeException -> Lbd
            r7 = 0
            r4 = r10
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.RuntimeException -> Lbd
            r3.show()     // Catch: java.lang.RuntimeException -> Lbd
        Lbd:
            r10 = -2
            return r10
        Lbf:
            return r1
    }
}
