package com.umeng.socialize.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ContextUtil {
    private static android.content.Context context;

    public ContextUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.content.Context getContext() {
            android.content.Context r0 = com.umeng.socialize.utils.ContextUtil.context
            if (r0 != 0) goto L9
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.INTER.CONTEXT_ERROR
            com.umeng.socialize.utils.SLog.E(r0)
        L9:
            android.content.Context r0 = com.umeng.socialize.utils.ContextUtil.context
            return r0
    }

    public static java.io.File getDataFile(java.lang.String r1) {
            android.content.Context r1 = com.umeng.socialize.utils.ContextUtil.context
            if (r1 == 0) goto Lb
            java.lang.String r0 = "share.db"
            java.io.File r1 = r1.getDatabasePath(r0)
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public static final int getIcon() {
            android.content.Context r0 = com.umeng.socialize.utils.ContextUtil.context
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r0 = r0.icon
            return r0
    }

    public static final java.lang.String getPackageName() {
            android.content.Context r0 = com.umeng.socialize.utils.ContextUtil.context
            if (r0 != 0) goto L7
            java.lang.String r0 = ""
            return r0
        L7:
            java.lang.String r0 = r0.getPackageName()
            return r0
    }

    public static void setContext(android.content.Context r0) {
            com.umeng.socialize.utils.ContextUtil.context = r0
            return
    }
}
