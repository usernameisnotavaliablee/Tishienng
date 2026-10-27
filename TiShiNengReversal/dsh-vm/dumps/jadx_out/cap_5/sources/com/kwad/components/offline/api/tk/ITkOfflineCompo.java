package com.kwad.components.offline.api.tk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface ITkOfflineCompo extends com.kwad.components.offline.api.IOfflineCompo<com.kwad.components.offline.api.tk.ITkOfflineCompoInitConfig> {
    public static final java.lang.String IMPL = "com.kwad.tachikoma.TkOfflineCompoImpl";
    public static final java.lang.String PACKAGE_NAME = "com.kwad.components.tachikoma";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum TKState extends java.lang.Enum<com.kwad.components.offline.api.tk.ITkOfflineCompo.TKState> {
        private static final /* synthetic */ com.kwad.components.offline.api.tk.ITkOfflineCompo.TKState[] $VALUES = null;
        public static final com.kwad.components.offline.api.tk.ITkOfflineCompo.TKState READY = null;
        public static final com.kwad.components.offline.api.tk.ITkOfflineCompo.TKState SO_FAIL = null;

        static {
                com.kwad.components.offline.api.tk.ITkOfflineCompo$TKState r0 = new com.kwad.components.offline.api.tk.ITkOfflineCompo$TKState
                java.lang.String r1 = "READY"
                r2 = 0
                r0.<init>(r1, r2)
                com.kwad.components.offline.api.tk.ITkOfflineCompo.TKState.READY = r0
                com.kwad.components.offline.api.tk.ITkOfflineCompo$TKState r1 = new com.kwad.components.offline.api.tk.ITkOfflineCompo$TKState
                java.lang.String r3 = "SO_FAIL"
                r4 = 1
                r1.<init>(r3, r4)
                com.kwad.components.offline.api.tk.ITkOfflineCompo.TKState.SO_FAIL = r1
                r3 = 2
                com.kwad.components.offline.api.tk.ITkOfflineCompo$TKState[] r3 = new com.kwad.components.offline.api.tk.ITkOfflineCompo.TKState[r3]
                r3[r2] = r0
                r3[r4] = r1
                com.kwad.components.offline.api.tk.ITkOfflineCompo.TKState.$VALUES = r3
                return
        }

        TKState(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.kwad.components.offline.api.tk.ITkOfflineCompo.TKState valueOf(java.lang.String r1) {
                java.lang.Class<com.kwad.components.offline.api.tk.ITkOfflineCompo$TKState> r0 = com.kwad.components.offline.api.tk.ITkOfflineCompo.TKState.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.kwad.components.offline.api.tk.ITkOfflineCompo$TKState r1 = (com.kwad.components.offline.api.tk.ITkOfflineCompo.TKState) r1
                return r1
        }

        public static com.kwad.components.offline.api.tk.ITkOfflineCompo.TKState[] values() {
                com.kwad.components.offline.api.tk.ITkOfflineCompo$TKState[] r0 = com.kwad.components.offline.api.tk.ITkOfflineCompo.TKState.$VALUES
                java.lang.Object r0 = r0.clone()
                com.kwad.components.offline.api.tk.ITkOfflineCompo$TKState[] r0 = (com.kwad.components.offline.api.tk.ITkOfflineCompo.TKState[]) r0
                return r0
        }
    }

    com.kwad.components.offline.api.tk.model.StyleTemplate checkStyleTemplateById(android.content.Context r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, int r5);

    com.kwad.components.offline.api.tk.IOfflineCompoTachikomaContext getContext(android.content.Context r1, java.lang.String r2, int r3, int r4, boolean r5);

    java.lang.String getJsBaseDir(android.content.Context r1, java.lang.String r2);

    com.kwad.components.offline.api.tk.ITkOfflineCompo.TKState getState();

    java.lang.String getTKVersion();

    void loadTkFileByTemplateId(android.content.Context r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, int r5, com.kwad.components.offline.api.tk.TKDownloadListener r6);

    void onConfigRefresh(android.content.Context r1, @androidx.annotation.NonNull org.json.JSONObject r2);

    void onDestroy();
}
