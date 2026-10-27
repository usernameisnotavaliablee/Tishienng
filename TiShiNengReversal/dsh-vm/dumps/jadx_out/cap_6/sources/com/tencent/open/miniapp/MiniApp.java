package com.tencent.open.miniapp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class MiniApp extends com.tencent.connect.common.BaseApi {
    public static final int MINIAPP_CONTEXT_NULL = -6;
    public static final int MINIAPP_ID_EMPTY = -1;
    public static final int MINIAPP_ID_NOT_DIGIT = -4;
    public static final int MINIAPP_SHOULD_DOWNLOAD = -2;
    public static final java.lang.String MINIAPP_SRC_ID = "21";
    public static final int MINIAPP_SRC_ID_NOT_DIGIT = -3;
    public static final int MINIAPP_SUCCESS = 0;
    public static final java.lang.String MINIAPP_TYPE_NORMAL = "mini_program_or_game";
    public static final int MINIAPP_UNKNOWN_TYPE = -5;
    public static final java.lang.String MINIAPP_VERSION_DEVELOP = "develop";
    public static final java.lang.String MINIAPP_VERSION_RELEASE = "release";
    public static final java.lang.String MINIAPP_VERSION_TRIAL = "trial";
    public static final int MINIAPP_VERSION_WRONG = -7;
    public static final java.util.List<java.lang.String> OPEN_CONNECT_DEMO_MINI_APP_VERSIONS = null;

    static {
            java.lang.String r0 = "trial"
            java.lang.String r1 = "release"
            java.lang.String r2 = "develop"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            java.util.List r0 = java.util.Arrays.asList(r0)
            com.tencent.open.miniapp.MiniApp.OPEN_CONNECT_DEMO_MINI_APP_VERSIONS = r0
            return
    }

    public MiniApp(android.content.Context r1, com.tencent.connect.auth.QQToken r2) {
            r0 = this;
            r0.<init>(r2)
            return
    }

    public MiniApp(android.content.Context r1, com.tencent.connect.auth.c r2, com.tencent.connect.auth.QQToken r3) {
            r0 = this;
            r0.<init>(r2, r3)
            return
    }

    public MiniApp(com.tencent.connect.auth.QQToken r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public int startMiniApp(android.app.Activity r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22) {
            r16 = this;
            r1 = r16
            r3 = r17
            r0 = r18
            r2 = r19
            r4 = 0
            java.lang.String r8 = "openSDK_LOG.MiniApp"
            boolean r4 = com.tencent.connect.a.a(r8, r4)
            r5 = -5
            if (r4 == 0) goto L13
            return r5
        L13:
            if (r3 != 0) goto L1c
            java.lang.String r0 = "Result is MINIAPP_CONTEXT_NULL : -6"
            com.tencent.open.log.SLog.i(r8, r0)
            r0 = -6
            return r0
        L1c:
            java.lang.String r4 = "mini_program_or_game"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L2a
            java.lang.String r0 = "Result is MINIAPP_UNKNOWN_TYPE : -5"
            com.tencent.open.log.SLog.i(r8, r0)
            return r5
        L2a:
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 == 0) goto L37
            java.lang.String r0 = "Result is MINIAPP_ID_EMPTY : -1"
            com.tencent.open.log.SLog.i(r8, r0)
            r0 = -1
            return r0
        L37:
            r4 = 0
            r5 = 0
        L39:
            int r6 = r2.length()
            if (r5 >= r6) goto L53
            char r6 = r2.charAt(r5)
            boolean r6 = java.lang.Character.isDigit(r6)
            if (r6 != 0) goto L50
            java.lang.String r0 = "Result is MINIAPP_ID_NOT_DIGIT : -4"
            com.tencent.open.log.SLog.i(r8, r0)
            r0 = -4
            return r0
        L50:
            int r5 = r5 + 1
            goto L39
        L53:
            java.lang.String r5 = ""
            if (r21 != 0) goto L59
            r6 = r5
            goto L5b
        L59:
            r6 = r21
        L5b:
            java.util.List<java.lang.String> r7 = com.tencent.open.miniapp.MiniApp.OPEN_CONNECT_DEMO_MINI_APP_VERSIONS
            r9 = r22
            boolean r7 = r7.contains(r9)
            if (r7 != 0) goto L6c
            java.lang.String r0 = "Result is MINIAPP_VERSION_WRONG : -7"
            com.tencent.open.log.SLog.i(r8, r0)
            r0 = -7
            return r0
        L6c:
            boolean r7 = com.tencent.open.utils.m.e(r3)
            r10 = -2
            java.lang.String r11 = "Show download dialog exception:"
            if (r7 == 0) goto L10e
            android.content.Intent r7 = new android.content.Intent
            java.lang.String r12 = "android.intent.action.VIEW"
            r7.<init>(r12)
            java.lang.String r12 = "com.tencent.mobileqq"
            r7.setPackage(r12)
            java.lang.String r12 = com.tencent.open.utils.k.a(r3)
            java.lang.String r12 = com.tencent.open.utils.m.k(r12)
            com.tencent.connect.auth.QQToken r13 = r1.c
            java.lang.String r13 = r13.getAppId()
            java.lang.String r13 = com.tencent.open.utils.m.k(r13)
            java.lang.String r6 = com.tencent.open.utils.m.k(r6)
            java.lang.String r9 = com.tencent.open.utils.m.k(r9)
            com.tencent.connect.auth.QQToken r14 = r1.c
            java.lang.String r14 = r14.getOpenId()
            java.lang.String r14 = com.tencent.open.utils.m.k(r14)
            r15 = 8
            java.lang.Object[] r15 = new java.lang.Object[r15]
            r15[r4] = r0
            r0 = 1
            r15[r0] = r2
            r0 = 2
            r15[r0] = r12
            r0 = 3
            r15[r0] = r13
            r0 = 4
            r15[r0] = r20
            r0 = 5
            r15[r0] = r6
            r0 = 6
            r15[r0] = r9
            r0 = 7
            r15[r0] = r14
            java.lang.String r0 = "mqqapi://connect_miniapp/launch?app_type=%1$s&mini_app_id=%2$s&version=1&src_type=app&app_name=%3$s&app_id=%4$s&src_id=%5$s&mini_app_path=%6$s&mini_app_type=%7$s&open_id=%8$s"
            java.lang.String r0 = java.lang.String.format(r0, r15)
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r7.setData(r0)
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r2 = "pkg_name"
            r7.putExtra(r2, r0)
            r3.startActivity(r7)     // Catch: android.content.ActivityNotFoundException -> Ldf
            java.lang.String r0 = "Result is MINIAPP_SUCCESS : 0"
            com.tencent.open.log.SLog.i(r8, r0)
            return r4
        Ldf:
            com.tencent.open.TDialog r2 = new com.tencent.open.TDialog     // Catch: java.lang.RuntimeException -> Lf1
            java.lang.String r4 = ""
            java.lang.String r5 = r1.a(r5)     // Catch: java.lang.RuntimeException -> Lf1
            com.tencent.connect.auth.QQToken r7 = r1.c     // Catch: java.lang.RuntimeException -> Lf1
            r6 = 0
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> Lf1
            r2.show()     // Catch: java.lang.RuntimeException -> Lf1
            goto L108
        Lf1:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.open.log.SLog.e(r8, r0)
        L108:
            java.lang.String r0 = "QQ is not installed, Result is MINIAPP_SHOULD_DOWNLOAD : -2"
            com.tencent.open.log.SLog.i(r8, r0)
            return r10
        L10e:
            com.tencent.open.TDialog r2 = new com.tencent.open.TDialog     // Catch: java.lang.RuntimeException -> L122
            java.lang.String r4 = ""
            java.lang.String r5 = r1.a(r5)     // Catch: java.lang.RuntimeException -> L122
            com.tencent.connect.auth.QQToken r7 = r1.c     // Catch: java.lang.RuntimeException -> L122
            r6 = 0
            r3 = r17
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L122
            r2.show()     // Catch: java.lang.RuntimeException -> L122
            goto L139
        L122:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.open.log.SLog.e(r8, r0)
        L139:
            java.lang.String r0 = "Result is MINIAPP_SHOULD_DOWNLOAD : -2"
            com.tencent.open.log.SLog.i(r8, r0)
            return r10
    }
}
