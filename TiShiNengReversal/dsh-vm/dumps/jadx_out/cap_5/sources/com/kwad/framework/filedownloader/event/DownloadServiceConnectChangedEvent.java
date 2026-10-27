package com.kwad.framework.filedownloader.event;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class DownloadServiceConnectChangedEvent extends com.kwad.framework.filedownloader.event.b {
    private final com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent.ConnectStatus aoy;
    private final java.lang.Class<?> aoz;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum ConnectStatus extends java.lang.Enum<com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent.ConnectStatus> {
        private static final /* synthetic */ com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent.ConnectStatus[] $VALUES = null;
        public static final com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent.ConnectStatus connected = null;
        public static final com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent.ConnectStatus disconnected = null;
        public static final com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent.ConnectStatus lost = null;

        static {
                com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent$ConnectStatus r0 = new com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent$ConnectStatus
                java.lang.String r1 = "connected"
                r2 = 0
                r0.<init>(r1, r2)
                com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent.ConnectStatus.connected = r0
                com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent$ConnectStatus r1 = new com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent$ConnectStatus
                java.lang.String r3 = "disconnected"
                r4 = 1
                r1.<init>(r3, r4)
                com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent.ConnectStatus.disconnected = r1
                com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent$ConnectStatus r3 = new com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent$ConnectStatus
                java.lang.String r5 = "lost"
                r6 = 2
                r3.<init>(r5, r6)
                com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent.ConnectStatus.lost = r3
                r5 = 3
                com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent$ConnectStatus[] r5 = new com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent.ConnectStatus[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent.ConnectStatus.$VALUES = r5
                return
        }

        ConnectStatus(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent.ConnectStatus valueOf(java.lang.String r1) {
                java.lang.Class<com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent$ConnectStatus> r0 = com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent.ConnectStatus.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent$ConnectStatus r1 = (com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent.ConnectStatus) r1
                return r1
        }

        public static com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent.ConnectStatus[] values() {
                com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent$ConnectStatus[] r0 = com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent.ConnectStatus.$VALUES
                java.lang.Object r0 = r0.clone()
                com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent$ConnectStatus[] r0 = (com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent.ConnectStatus[]) r0
                return r0
        }
    }

    public DownloadServiceConnectChangedEvent(com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent.ConnectStatus r2, java.lang.Class<?> r3) {
            r1 = this;
            java.lang.String r0 = "event.service.connect.changed"
            r1.<init>(r0)
            r1.aoy = r2
            r1.aoz = r3
            return
    }

    public final com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent.ConnectStatus yH() {
            r1 = this;
            com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent$ConnectStatus r0 = r1.aoy
            return r0
    }
}
