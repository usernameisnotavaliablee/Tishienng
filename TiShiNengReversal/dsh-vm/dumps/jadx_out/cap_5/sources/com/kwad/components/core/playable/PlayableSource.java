package com.kwad.components.core.playable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public enum PlayableSource extends java.lang.Enum<com.kwad.components.core.playable.PlayableSource> {
    private static final /* synthetic */ com.kwad.components.core.playable.PlayableSource[] $VALUES = null;
    public static final com.kwad.components.core.playable.PlayableSource ACTIONBAR_CLICK = null;
    public static final com.kwad.components.core.playable.PlayableSource ENDCARD_CLICK = null;
    public static final com.kwad.components.core.playable.PlayableSource PENDANT_AUTO = null;
    public static final com.kwad.components.core.playable.PlayableSource PENDANT_CLICK_AUTO = null;
    public static final com.kwad.components.core.playable.PlayableSource PENDANT_CLICK_NOT_AUTO = null;
    public static final com.kwad.components.core.playable.PlayableSource PLAY_FINISHED_NORMAL = null;
    public static final com.kwad.components.core.playable.PlayableSource UNKNOWN_TRYPLAY_ENTRY_SOURCE = null;
    private int code;

    static {
            com.kwad.components.core.playable.PlayableSource r0 = new com.kwad.components.core.playable.PlayableSource
            java.lang.String r1 = "UNKNOWN_TRYPLAY_ENTRY_SOURCE"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.kwad.components.core.playable.PlayableSource.UNKNOWN_TRYPLAY_ENTRY_SOURCE = r0
            com.kwad.components.core.playable.PlayableSource r1 = new com.kwad.components.core.playable.PlayableSource
            java.lang.String r3 = "PLAY_FINISHED_NORMAL"
            r4 = 1
            r1.<init>(r3, r4, r4)
            com.kwad.components.core.playable.PlayableSource.PLAY_FINISHED_NORMAL = r1
            com.kwad.components.core.playable.PlayableSource r3 = new com.kwad.components.core.playable.PlayableSource
            java.lang.String r5 = "PENDANT_CLICK_NOT_AUTO"
            r6 = 2
            r3.<init>(r5, r6, r6)
            com.kwad.components.core.playable.PlayableSource.PENDANT_CLICK_NOT_AUTO = r3
            com.kwad.components.core.playable.PlayableSource r5 = new com.kwad.components.core.playable.PlayableSource
            java.lang.String r7 = "PENDANT_CLICK_AUTO"
            r8 = 3
            r5.<init>(r7, r8, r8)
            com.kwad.components.core.playable.PlayableSource.PENDANT_CLICK_AUTO = r5
            com.kwad.components.core.playable.PlayableSource r7 = new com.kwad.components.core.playable.PlayableSource
            java.lang.String r9 = "PENDANT_AUTO"
            r10 = 4
            r7.<init>(r9, r10, r10)
            com.kwad.components.core.playable.PlayableSource.PENDANT_AUTO = r7
            com.kwad.components.core.playable.PlayableSource r9 = new com.kwad.components.core.playable.PlayableSource
            java.lang.String r11 = "ACTIONBAR_CLICK"
            r12 = 5
            r9.<init>(r11, r12, r12)
            com.kwad.components.core.playable.PlayableSource.ACTIONBAR_CLICK = r9
            com.kwad.components.core.playable.PlayableSource r11 = new com.kwad.components.core.playable.PlayableSource
            java.lang.String r13 = "ENDCARD_CLICK"
            r14 = 6
            r11.<init>(r13, r14, r14)
            com.kwad.components.core.playable.PlayableSource.ENDCARD_CLICK = r11
            r13 = 7
            com.kwad.components.core.playable.PlayableSource[] r13 = new com.kwad.components.core.playable.PlayableSource[r13]
            r13[r2] = r0
            r13[r4] = r1
            r13[r6] = r3
            r13[r8] = r5
            r13[r10] = r7
            r13[r12] = r9
            r13[r14] = r11
            com.kwad.components.core.playable.PlayableSource.$VALUES = r13
            return
    }

    PlayableSource(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.code = r3
            return
    }

    public static com.kwad.components.core.playable.PlayableSource valueOf(java.lang.String r1) {
            java.lang.Class<com.kwad.components.core.playable.PlayableSource> r0 = com.kwad.components.core.playable.PlayableSource.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.kwad.components.core.playable.PlayableSource r1 = (com.kwad.components.core.playable.PlayableSource) r1
            return r1
    }

    public static com.kwad.components.core.playable.PlayableSource[] values() {
            com.kwad.components.core.playable.PlayableSource[] r0 = com.kwad.components.core.playable.PlayableSource.$VALUES
            java.lang.Object r0 = r0.clone()
            com.kwad.components.core.playable.PlayableSource[] r0 = (com.kwad.components.core.playable.PlayableSource[]) r0
            return r0
    }

    public final int getCode() {
            r1 = this;
            int r0 = r1.code
            return r0
    }
}
