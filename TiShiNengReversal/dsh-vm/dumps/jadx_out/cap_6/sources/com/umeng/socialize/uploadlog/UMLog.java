package com.umeng.socialize.uploadlog;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class UMLog {
    private static boolean isAuth;
    private static boolean isShare;

    static {
            return
    }

    public UMLog() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.os.Bundle getShareAndAuth() {
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            android.content.Context r1 = com.umeng.socialize.utils.ContextUtil.getContext()
            java.lang.String r2 = "isjump"
            java.lang.String r3 = "auth"
            java.lang.String r4 = "share"
            r5 = 0
            if (r1 == 0) goto L32
            android.content.Context r1 = com.umeng.socialize.utils.ContextUtil.getContext()
            java.lang.String r6 = "umeng_socialize"
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r6, r5)
            boolean r6 = r1.getBoolean(r4, r5)
            r0.putBoolean(r4, r6)
            boolean r4 = r1.getBoolean(r3, r5)
            r0.putBoolean(r3, r4)
            boolean r1 = r1.getBoolean(r2, r5)
            r0.putBoolean(r2, r1)
            return r0
        L32:
            r0.putBoolean(r4, r5)
            r0.putBoolean(r3, r5)
            r0.putBoolean(r2, r5)
            return r0
    }

    public static boolean isOpenShareEdit() {
            android.content.Context r0 = com.umeng.socialize.utils.ContextUtil.getContext()
            r1 = 1
            if (r0 == 0) goto L19
            android.content.Context r0 = com.umeng.socialize.utils.ContextUtil.getContext()
            java.lang.String r2 = "umeng_socialize"
            r3 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r2, r3)
            java.lang.String r2 = "is_open_share_edit"
            boolean r0 = r0.getBoolean(r2, r1)
            return r0
        L19:
            return r1
    }

    public static void putAuth() {
            android.content.Context r0 = com.umeng.socialize.utils.ContextUtil.getContext()
            if (r0 == 0) goto L2b
            boolean r0 = com.umeng.socialize.uploadlog.UMLog.isAuth
            if (r0 != 0) goto L2b
            android.content.Context r0 = com.umeng.socialize.utils.ContextUtil.getContext()
            java.lang.String r1 = "umeng_socialize"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "auth"
            r2 = 1
            r0.putBoolean(r1, r2)
            java.lang.String r1 = "isjump"
            boolean r3 = com.umeng.socialize.Config.isJumptoAppStore
            r0.putBoolean(r1, r3)
            r0.commit()
            com.umeng.socialize.uploadlog.UMLog.isShare = r2
        L2b:
            return
    }

    public static void putShare() {
            android.content.Context r0 = com.umeng.socialize.utils.ContextUtil.getContext()
            if (r0 == 0) goto L2b
            boolean r0 = com.umeng.socialize.uploadlog.UMLog.isShare
            if (r0 != 0) goto L2b
            android.content.Context r0 = com.umeng.socialize.utils.ContextUtil.getContext()
            java.lang.String r1 = "umeng_socialize"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "share"
            r2 = 1
            r0.putBoolean(r1, r2)
            java.lang.String r1 = "isjump"
            boolean r3 = com.umeng.socialize.Config.isJumptoAppStore
            r0.putBoolean(r1, r3)
            r0.commit()
            com.umeng.socialize.uploadlog.UMLog.isShare = r2
        L2b:
            return
    }

    public static void setIsOpenShareEdit(boolean r3) {
            android.content.Context r0 = com.umeng.socialize.utils.ContextUtil.getContext()
            if (r0 == 0) goto L1e
            android.content.Context r0 = com.umeng.socialize.utils.ContextUtil.getContext()
            java.lang.String r1 = "umeng_socialize"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "is_open_share_edit"
            android.content.SharedPreferences$Editor r3 = r0.putBoolean(r1, r3)
            r3.apply()
        L1e:
            return
    }
}
