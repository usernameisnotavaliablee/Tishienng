package com.kwad.components.core.webview.tachikoma;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public enum TKRenderFailReason extends java.lang.Enum<com.kwad.components.core.webview.tachikoma.TKRenderFailReason> {
    private static final /* synthetic */ com.kwad.components.core.webview.tachikoma.TKRenderFailReason[] $VALUES = null;
    public static final com.kwad.components.core.webview.tachikoma.TKRenderFailReason PLUGIN_NOT_READY = null;
    public static final com.kwad.components.core.webview.tachikoma.TKRenderFailReason RENDER_ERROR = null;
    public static final com.kwad.components.core.webview.tachikoma.TKRenderFailReason SWITCH_CLOSE = null;
    public static final com.kwad.components.core.webview.tachikoma.TKRenderFailReason TK_FILE_LOAD_ERROR = null;
    public static final com.kwad.components.core.webview.tachikoma.TKRenderFailReason TK_FILE_LOAD_TIMEOUT = null;
    public static final com.kwad.components.core.webview.tachikoma.TKRenderFailReason UNKNOWN = null;

    static {
            com.kwad.components.core.webview.tachikoma.TKRenderFailReason r0 = new com.kwad.components.core.webview.tachikoma.TKRenderFailReason
            java.lang.String r1 = "UNKNOWN"
            r2 = 0
            r0.<init>(r1, r2)
            com.kwad.components.core.webview.tachikoma.TKRenderFailReason.UNKNOWN = r0
            com.kwad.components.core.webview.tachikoma.TKRenderFailReason r1 = new com.kwad.components.core.webview.tachikoma.TKRenderFailReason
            java.lang.String r3 = "SWITCH_CLOSE"
            r4 = 1
            r1.<init>(r3, r4)
            com.kwad.components.core.webview.tachikoma.TKRenderFailReason.SWITCH_CLOSE = r1
            com.kwad.components.core.webview.tachikoma.TKRenderFailReason r3 = new com.kwad.components.core.webview.tachikoma.TKRenderFailReason
            java.lang.String r5 = "PLUGIN_NOT_READY"
            r6 = 2
            r3.<init>(r5, r6)
            com.kwad.components.core.webview.tachikoma.TKRenderFailReason.PLUGIN_NOT_READY = r3
            com.kwad.components.core.webview.tachikoma.TKRenderFailReason r5 = new com.kwad.components.core.webview.tachikoma.TKRenderFailReason
            java.lang.String r7 = "TK_FILE_LOAD_ERROR"
            r8 = 3
            r5.<init>(r7, r8)
            com.kwad.components.core.webview.tachikoma.TKRenderFailReason.TK_FILE_LOAD_ERROR = r5
            com.kwad.components.core.webview.tachikoma.TKRenderFailReason r7 = new com.kwad.components.core.webview.tachikoma.TKRenderFailReason
            java.lang.String r9 = "RENDER_ERROR"
            r10 = 4
            r7.<init>(r9, r10)
            com.kwad.components.core.webview.tachikoma.TKRenderFailReason.RENDER_ERROR = r7
            com.kwad.components.core.webview.tachikoma.TKRenderFailReason r9 = new com.kwad.components.core.webview.tachikoma.TKRenderFailReason
            java.lang.String r11 = "TK_FILE_LOAD_TIMEOUT"
            r12 = 5
            r9.<init>(r11, r12)
            com.kwad.components.core.webview.tachikoma.TKRenderFailReason.TK_FILE_LOAD_TIMEOUT = r9
            r11 = 6
            com.kwad.components.core.webview.tachikoma.TKRenderFailReason[] r11 = new com.kwad.components.core.webview.tachikoma.TKRenderFailReason[r11]
            r11[r2] = r0
            r11[r4] = r1
            r11[r6] = r3
            r11[r8] = r5
            r11[r10] = r7
            r11[r12] = r9
            com.kwad.components.core.webview.tachikoma.TKRenderFailReason.$VALUES = r11
            return
    }

    TKRenderFailReason(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.kwad.components.core.webview.tachikoma.TKRenderFailReason valueOf(java.lang.String r1) {
            java.lang.Class<com.kwad.components.core.webview.tachikoma.TKRenderFailReason> r0 = com.kwad.components.core.webview.tachikoma.TKRenderFailReason.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.kwad.components.core.webview.tachikoma.TKRenderFailReason r1 = (com.kwad.components.core.webview.tachikoma.TKRenderFailReason) r1
            return r1
    }

    public static com.kwad.components.core.webview.tachikoma.TKRenderFailReason[] values() {
            com.kwad.components.core.webview.tachikoma.TKRenderFailReason[] r0 = com.kwad.components.core.webview.tachikoma.TKRenderFailReason.$VALUES
            java.lang.Object r0 = r0.clone()
            com.kwad.components.core.webview.tachikoma.TKRenderFailReason[] r0 = (com.kwad.components.core.webview.tachikoma.TKRenderFailReason[]) r0
            return r0
    }
}
