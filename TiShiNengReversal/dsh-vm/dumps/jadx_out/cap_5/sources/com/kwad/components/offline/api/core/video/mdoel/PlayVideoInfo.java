package com.kwad.components.offline.api.core.video.mdoel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class PlayVideoInfo {
    public final boolean isNoCache;
    public final com.kwad.components.offline.api.core.video.mdoel.KsPlayerLogParams ksplayerLogParams;
    public final java.lang.String manifest;
    public final com.kwad.sdk.core.response.model.VideoPlayerStatus videoPlayerStatus;
    public final java.lang.String videoUrl;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.components.offline.api.core.video.mdoel.PlayVideoInfo$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Builder {
        private boolean isNoCache;
        private com.kwad.components.offline.api.core.video.mdoel.KsPlayerLogParams ksplayerLogParams;
        private java.lang.String manifest;
        private com.kwad.sdk.core.response.model.VideoPlayerStatus videoPlayerStatus;
        private java.lang.String videoUrl;

        public Builder(java.lang.String r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.isNoCache = r0
                r1.videoUrl = r2
                return
        }

        static /* synthetic */ java.lang.String access$000(com.kwad.components.offline.api.core.video.mdoel.PlayVideoInfo.Builder r0) {
                java.lang.String r0 = r0.videoUrl
                return r0
        }

        static /* synthetic */ java.lang.String access$100(com.kwad.components.offline.api.core.video.mdoel.PlayVideoInfo.Builder r0) {
                java.lang.String r0 = r0.manifest
                return r0
        }

        static /* synthetic */ com.kwad.sdk.core.response.model.VideoPlayerStatus access$200(com.kwad.components.offline.api.core.video.mdoel.PlayVideoInfo.Builder r0) {
                com.kwad.sdk.core.response.model.VideoPlayerStatus r0 = r0.videoPlayerStatus
                return r0
        }

        static /* synthetic */ com.kwad.components.offline.api.core.video.mdoel.KsPlayerLogParams access$300(com.kwad.components.offline.api.core.video.mdoel.PlayVideoInfo.Builder r0) {
                com.kwad.components.offline.api.core.video.mdoel.KsPlayerLogParams r0 = r0.ksplayerLogParams
                return r0
        }

        static /* synthetic */ boolean access$400(com.kwad.components.offline.api.core.video.mdoel.PlayVideoInfo.Builder r0) {
                boolean r0 = r0.isNoCache
                return r0
        }

        public com.kwad.components.offline.api.core.video.mdoel.PlayVideoInfo build() {
                r2 = this;
                com.kwad.components.offline.api.core.video.mdoel.PlayVideoInfo r0 = new com.kwad.components.offline.api.core.video.mdoel.PlayVideoInfo
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public com.kwad.components.offline.api.core.video.mdoel.PlayVideoInfo.Builder ksplayerLogParams(@androidx.annotation.NonNull com.kwad.components.offline.api.core.video.mdoel.KsPlayerLogParams r1) {
                r0 = this;
                r0.ksplayerLogParams = r1
                return r0
        }

        public com.kwad.components.offline.api.core.video.mdoel.PlayVideoInfo.Builder manifest(java.lang.String r1) {
                r0 = this;
                r0.manifest = r1
                return r0
        }

        public com.kwad.components.offline.api.core.video.mdoel.PlayVideoInfo.Builder noCache(boolean r1) {
                r0 = this;
                r0.isNoCache = r1
                return r0
        }

        public com.kwad.components.offline.api.core.video.mdoel.PlayVideoInfo.Builder videoPlayerStatus(com.kwad.sdk.core.response.model.VideoPlayerStatus r1) {
                r0 = this;
                r0.videoPlayerStatus = r1
                return r0
        }

        public com.kwad.components.offline.api.core.video.mdoel.PlayVideoInfo.Builder videoUrl(java.lang.String r1) {
                r0 = this;
                r0.videoUrl = r1
                return r0
        }
    }

    private PlayVideoInfo(com.kwad.components.offline.api.core.video.mdoel.PlayVideoInfo.Builder r4) {
            r3 = this;
            r3.<init>()
            com.kwad.components.offline.api.core.video.mdoel.KsPlayerLogParams r0 = new com.kwad.components.offline.api.core.video.mdoel.KsPlayerLogParams
            r0.<init>()
            r3.ksplayerLogParams = r0
            java.lang.String r1 = com.kwad.components.offline.api.core.video.mdoel.PlayVideoInfo.Builder.access$000(r4)
            r3.videoUrl = r1
            java.lang.String r1 = com.kwad.components.offline.api.core.video.mdoel.PlayVideoInfo.Builder.access$100(r4)
            r3.manifest = r1
            com.kwad.sdk.core.response.model.VideoPlayerStatus r1 = com.kwad.components.offline.api.core.video.mdoel.PlayVideoInfo.Builder.access$200(r4)
            r3.videoPlayerStatus = r1
            com.kwad.components.offline.api.core.video.mdoel.KsPlayerLogParams r1 = com.kwad.components.offline.api.core.video.mdoel.PlayVideoInfo.Builder.access$300(r4)
            if (r1 == 0) goto L42
            com.kwad.components.offline.api.core.video.mdoel.KsPlayerLogParams r1 = com.kwad.components.offline.api.core.video.mdoel.PlayVideoInfo.Builder.access$300(r4)
            long r1 = r1.photoId
            r0.photoId = r1
            com.kwad.components.offline.api.core.video.mdoel.KsPlayerLogParams r1 = com.kwad.components.offline.api.core.video.mdoel.PlayVideoInfo.Builder.access$300(r4)
            long r1 = r1.clickTime
            r0.clickTime = r1
            com.kwad.components.offline.api.core.video.mdoel.KsPlayerLogParams r1 = com.kwad.components.offline.api.core.video.mdoel.PlayVideoInfo.Builder.access$300(r4)
            long r1 = r1.adStyle
            r0.adStyle = r1
            com.kwad.components.offline.api.core.video.mdoel.KsPlayerLogParams r1 = com.kwad.components.offline.api.core.video.mdoel.PlayVideoInfo.Builder.access$300(r4)
            int r1 = r1.contentType
            r0.contentType = r1
        L42:
            boolean r4 = com.kwad.components.offline.api.core.video.mdoel.PlayVideoInfo.Builder.access$400(r4)
            r3.isNoCache = r4
            return
    }

    /* synthetic */ PlayVideoInfo(com.kwad.components.offline.api.core.video.mdoel.PlayVideoInfo.Builder r1, com.kwad.components.offline.api.core.video.mdoel.PlayVideoInfo.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }
}
