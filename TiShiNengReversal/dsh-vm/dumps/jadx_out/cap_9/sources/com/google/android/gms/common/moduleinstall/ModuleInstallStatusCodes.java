package com.google.android.gms.common.moduleinstall;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class ModuleInstallStatusCodes extends com.google.android.gms.common.api.CommonStatusCodes {
    public static final int INSUFFICIENT_STORAGE = 46003;
    public static final int MODULE_NOT_FOUND = 46002;
    public static final int NOT_ALLOWED_MODULE = 46001;
    public static final int SUCCESS = 0;
    public static final int UNKNOWN_MODULE = 46000;

    private ModuleInstallStatusCodes() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static java.lang.String getStatusCodeString(int r0) {
            switch(r0) {
                case 46000: goto L11;
                case 46001: goto Le;
                case 46002: goto Lb;
                case 46003: goto L8;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = com.google.android.gms.common.api.CommonStatusCodes.getStatusCodeString(r0)
            return r0
        L8:
            java.lang.String r0 = "INSUFFICIENT_STORAGE"
            return r0
        Lb:
            java.lang.String r0 = "MODULE_NOT_FOUND"
            return r0
        Le:
            java.lang.String r0 = "NOT_ALLOWED_MODULE"
            return r0
        L11:
            java.lang.String r0 = "UNKNOWN_MODULE"
            return r0
    }
}
