package com.kwad.components.core.proxy.launchdialog;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public enum DetectEventType extends java.lang.Enum<com.kwad.components.core.proxy.launchdialog.DetectEventType> {
    private static final /* synthetic */ com.kwad.components.core.proxy.launchdialog.DetectEventType[] $VALUES = null;
    public static final com.kwad.components.core.proxy.launchdialog.DetectEventType USER_CANCEL = null;
    public static final com.kwad.components.core.proxy.launchdialog.DetectEventType USER_CONFIRM = null;

    static {
            com.kwad.components.core.proxy.launchdialog.DetectEventType r0 = new com.kwad.components.core.proxy.launchdialog.DetectEventType
            java.lang.String r1 = "USER_CONFIRM"
            r2 = 0
            r0.<init>(r1, r2)
            com.kwad.components.core.proxy.launchdialog.DetectEventType.USER_CONFIRM = r0
            com.kwad.components.core.proxy.launchdialog.DetectEventType r1 = new com.kwad.components.core.proxy.launchdialog.DetectEventType
            java.lang.String r3 = "USER_CANCEL"
            r4 = 1
            r1.<init>(r3, r4)
            com.kwad.components.core.proxy.launchdialog.DetectEventType.USER_CANCEL = r1
            r3 = 2
            com.kwad.components.core.proxy.launchdialog.DetectEventType[] r3 = new com.kwad.components.core.proxy.launchdialog.DetectEventType[r3]
            r3[r2] = r0
            r3[r4] = r1
            com.kwad.components.core.proxy.launchdialog.DetectEventType.$VALUES = r3
            return
    }

    DetectEventType(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.kwad.components.core.proxy.launchdialog.DetectEventType valueOf(java.lang.String r1) {
            java.lang.Class<com.kwad.components.core.proxy.launchdialog.DetectEventType> r0 = com.kwad.components.core.proxy.launchdialog.DetectEventType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.kwad.components.core.proxy.launchdialog.DetectEventType r1 = (com.kwad.components.core.proxy.launchdialog.DetectEventType) r1
            return r1
    }

    public static com.kwad.components.core.proxy.launchdialog.DetectEventType[] values() {
            com.kwad.components.core.proxy.launchdialog.DetectEventType[] r0 = com.kwad.components.core.proxy.launchdialog.DetectEventType.$VALUES
            java.lang.Object r0 = r0.clone()
            com.kwad.components.core.proxy.launchdialog.DetectEventType[] r0 = (com.kwad.components.core.proxy.launchdialog.DetectEventType[]) r0
            return r0
    }
}
