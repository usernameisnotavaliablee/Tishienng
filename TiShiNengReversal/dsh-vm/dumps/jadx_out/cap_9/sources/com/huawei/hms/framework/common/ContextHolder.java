package com.huawei.hms.framework.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ContextHolder {
    private static final java.lang.String a = "ContextHolder";

    @android.annotation.SuppressLint({"StaticFieldLeak"})
    private static android.content.Context b;

    @android.annotation.SuppressLint({"StaticFieldLeak"})
    private static android.content.Context c;

    public ContextHolder() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.content.Context getAppContext() {
            android.content.Context r0 = com.huawei.hms.framework.common.ContextHolder.b
            return r0
    }

    public static android.content.Context getKitContext() {
            android.content.Context r0 = com.huawei.hms.framework.common.ContextHolder.c
            return r0
    }

    public static android.content.Context getResourceContext() {
            android.content.Context r0 = getKitContext()
            if (r0 == 0) goto Lb
            android.content.Context r0 = getKitContext()
            return r0
        Lb:
            android.content.Context r0 = getAppContext()
            return r0
    }

    public static void setAppContext(android.content.Context r1) {
            android.content.Context r0 = com.huawei.hms.framework.common.ContextHolder.b
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.String r0 = "sAppContext == null"
            com.huawei.hms.framework.common.CheckParamUtils.checkNotNull(r1, r0)
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            com.huawei.hms.framework.common.ContextHolder.b = r1
            return
    }

    public static void setKitContext(android.content.Context r1) {
            java.lang.String r0 = "sKitContext == null"
            com.huawei.hms.framework.common.CheckParamUtils.checkNotNull(r1, r0)
            com.huawei.hms.framework.common.ContextHolder.c = r1
            return
    }
}
