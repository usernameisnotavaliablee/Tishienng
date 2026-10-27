package com.kwad.components.core.o.b.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d {












    public d() {
            r1 = this;
            r1.<init>()
            return
    }

    public static com.kwad.components.core.video.b.a a(com.kwad.components.offline.api.core.video.listener.ReleaseCallback r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            com.kwad.components.core.o.b.c.d$3 r0 = new com.kwad.components.core.o.b.c.d$3
            r0.<init>(r1)
            return r0
    }

    public static com.kwad.components.core.video.i a(com.kwad.components.offline.api.core.video.listener.OfflineMediaPlayStateListener r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            com.kwad.components.core.o.b.c.d$2 r0 = new com.kwad.components.core.o.b.c.d$2
            r0.<init>(r1)
            return r0
    }

    public static com.kwad.components.core.video.l a(com.kwad.components.offline.api.core.video.listener.OfflineVideoPlayStateListener r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            com.kwad.components.core.o.b.c.d$11 r0 = new com.kwad.components.core.o.b.c.d$11
            r0.<init>(r1)
            return r0
    }

    public static com.kwad.sdk.contentalliance.a.a.a a(com.kwad.components.offline.api.core.video.mdoel.KsPlayerLogParams r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            com.kwad.sdk.contentalliance.a.a.a r0 = new com.kwad.sdk.contentalliance.a.a.a
            r0.<init>()
            long r1 = r3.photoId
            r0.photoId = r1
            long r1 = r3.clickTime
            r0.clickTime = r1
            long r1 = r3.adStyle
            r0.adStyle = r1
            int r3 = r3.contentType
            r0.contentType = r3
            return r0
    }

    public static com.kwad.sdk.contentalliance.a.a.b a(com.kwad.components.offline.api.core.video.mdoel.PlayVideoInfo r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            com.kwad.sdk.contentalliance.a.a.b$a r0 = new com.kwad.sdk.contentalliance.a.a.b$a
            java.lang.String r1 = r2.videoUrl
            r0.<init>(r1)
            java.lang.String r1 = r2.manifest
            com.kwad.sdk.contentalliance.a.a.b$a r0 = r0.dh(r1)
            com.kwad.components.offline.api.core.video.mdoel.KsPlayerLogParams r1 = r2.ksplayerLogParams
            com.kwad.sdk.contentalliance.a.a.a r1 = a(r1)
            com.kwad.sdk.contentalliance.a.a.b$a r0 = r0.b(r1)
            com.kwad.sdk.core.response.model.VideoPlayerStatus r1 = r2.videoPlayerStatus
            com.kwad.sdk.contentalliance.a.a.b$a r0 = r0.a(r1)
            boolean r2 = r2.isNoCache
            com.kwad.sdk.contentalliance.a.a.b$a r2 = r0.bo(r2)
            com.kwad.sdk.contentalliance.a.a.b r2 = r2.El()
            return r2
    }

    public static com.kwad.sdk.core.video.a.c.a a(com.kwad.components.offline.api.core.video.IMediaPlayer r1, com.kwad.components.offline.api.core.video.IMediaPlayer.OnBufferingUpdateListener r2) {
            if (r2 != 0) goto L4
            r1 = 0
            return r1
        L4:
            com.kwad.components.core.o.b.c.d$5 r0 = new com.kwad.components.core.o.b.c.d$5
            r0.<init>(r2, r1)
            return r0
    }

    public static com.kwad.sdk.core.video.a.c.b a(com.kwad.components.offline.api.core.video.IMediaPlayer r1, com.kwad.components.offline.api.core.video.IMediaPlayer.OnCompletionListener r2) {
            if (r2 != 0) goto L4
            r1 = 0
            return r1
        L4:
            com.kwad.components.core.o.b.c.d$4 r0 = new com.kwad.components.core.o.b.c.d$4
            r0.<init>(r2, r1)
            return r0
    }

    public static com.kwad.sdk.core.video.a.c.InterfaceC0148c a(com.kwad.components.offline.api.core.video.IMediaPlayer r1, com.kwad.components.offline.api.core.video.IMediaPlayer.OnErrorListener r2) {
            if (r2 != 0) goto L4
            r1 = 0
            return r1
        L4:
            com.kwad.components.core.o.b.c.d$8 r0 = new com.kwad.components.core.o.b.c.d$8
            r0.<init>(r2, r1)
            return r0
    }

    public static com.kwad.sdk.core.video.a.c.d a(com.kwad.components.offline.api.core.video.IMediaPlayer r1, com.kwad.components.offline.api.core.video.IMediaPlayer.OnInfoListener r2) {
            if (r2 != 0) goto L4
            r1 = 0
            return r1
        L4:
            com.kwad.components.core.o.b.c.d$9 r0 = new com.kwad.components.core.o.b.c.d$9
            r0.<init>(r2, r1)
            return r0
    }

    public static com.kwad.sdk.core.video.a.c.e a(com.kwad.components.offline.api.core.video.IMediaPlayer r1, com.kwad.components.offline.api.core.video.IMediaPlayer.OnPreparedListener r2) {
            if (r2 != 0) goto L4
            r1 = 0
            return r1
        L4:
            com.kwad.components.core.o.b.c.d$1 r0 = new com.kwad.components.core.o.b.c.d$1
            r0.<init>(r2, r1)
            return r0
    }

    public static com.kwad.sdk.core.video.a.c.g a(com.kwad.components.offline.api.core.video.IMediaPlayer r1, com.kwad.components.offline.api.core.video.IMediaPlayer.OnSeekCompleteListener r2) {
            if (r2 != 0) goto L4
            r1 = 0
            return r1
        L4:
            com.kwad.components.core.o.b.c.d$6 r0 = new com.kwad.components.core.o.b.c.d$6
            r0.<init>(r2, r1)
            return r0
    }

    public static com.kwad.sdk.core.video.a.c.h a(com.kwad.components.offline.api.core.video.IMediaPlayer r1, com.kwad.components.offline.api.core.video.IMediaPlayer.OnTimedTextListener r2) {
            if (r2 != 0) goto L4
            r1 = 0
            return r1
        L4:
            com.kwad.components.core.o.b.c.d$10 r0 = new com.kwad.components.core.o.b.c.d$10
            r0.<init>(r2, r1)
            return r0
    }

    public static com.kwad.sdk.core.video.a.c.i a(com.kwad.components.offline.api.core.video.IMediaPlayer r1, com.kwad.components.offline.api.core.video.IMediaPlayer.OnVideoSizeChangedListener r2) {
            if (r2 != 0) goto L4
            r1 = 0
            return r1
        L4:
            com.kwad.components.core.o.b.c.d$7 r0 = new com.kwad.components.core.o.b.c.d$7
            r0.<init>(r2, r1)
            return r0
    }
}
