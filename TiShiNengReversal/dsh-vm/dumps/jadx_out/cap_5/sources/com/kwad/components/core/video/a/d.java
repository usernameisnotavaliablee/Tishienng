package com.kwad.components.core.video.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d extends com.kwad.components.core.video.a.a {
    private java.lang.String Bh;
    private long abi;
    private long abj;
    private long abk;
    private java.lang.String abl;
    private boolean abm;
    private boolean abn;
    private boolean abo;
    private long abp;
    private long abq;
    private long abr;
    private long abs;
    private int abt;
    private boolean abu;
    private int mMediaPlayerType;
    private com.kwad.components.core.video.j xp;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public static class a extends com.kwad.sdk.commercial.c.a {
        public long XI;
        public int abA;
        public java.lang.String abz;
        public int code;
        public long creativeId;
        public long llsid;
        public java.lang.String msg;
        public java.lang.String videoUrl;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.ksad.json.annotation.KsJson
    public static class b extends com.kwad.sdk.commercial.c.a implements java.lang.Cloneable {
        public long XI;
        public int abA;
        public long abB;
        public long abC;
        public long abD;
        public int abg;
        public java.lang.String abz;
        public int adStyle;
        public long creativeId;
        public long llsid;
        public long videoDuration;
        public java.lang.String videoUrl;

        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ java.lang.Object clone() {
                r1 = this;
                com.kwad.components.core.video.a.d$b r0 = r1.ul()
                return r0
        }

        public final com.kwad.components.core.video.a.d.b ul() {
                r1 = this;
                java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L7
                com.kwad.components.core.video.a.d$b r0 = (com.kwad.components.core.video.a.d.b) r0     // Catch: java.lang.CloneNotSupportedException -> L7
                return r0
            L7:
                com.kwad.components.core.video.a.d$b r0 = new com.kwad.components.core.video.a.d$b
                r0.<init>()
                return r0
        }
    }

    private d(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r4, int r5, boolean r6) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.abm = r0
            r3.abn = r0
            r3.abo = r0
            r3.mMediaPlayerType = r0
            r3.abu = r0
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r4)     // Catch: java.lang.Exception -> L42
            java.lang.String r1 = com.kwad.sdk.core.response.b.a.K(r0)     // Catch: java.lang.Exception -> L42
            r3.Bh = r1     // Catch: java.lang.Exception -> L42
            long r1 = com.kwad.sdk.core.response.b.e.ei(r4)     // Catch: java.lang.Exception -> L42
            r3.abi = r1     // Catch: java.lang.Exception -> L42
            long r1 = com.kwad.sdk.core.response.b.e.ev(r4)     // Catch: java.lang.Exception -> L42
            r3.abj = r1     // Catch: java.lang.Exception -> L42
            long r1 = com.kwad.sdk.core.response.b.a.cp(r0)     // Catch: java.lang.Exception -> L42
            r3.abk = r1     // Catch: java.lang.Exception -> L42
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.cl(r0)     // Catch: java.lang.Exception -> L42
            r3.abl = r0     // Catch: java.lang.Exception -> L42
            int r4 = com.kwad.sdk.core.response.b.e.ef(r4)     // Catch: java.lang.Exception -> L42
            r3.abt = r4     // Catch: java.lang.Exception -> L42
            r3.mMediaPlayerType = r5     // Catch: java.lang.Exception -> L42
            r3.abu = r6     // Catch: java.lang.Exception -> L42
            com.kwad.components.core.video.j r4 = new com.kwad.components.core.video.j     // Catch: java.lang.Exception -> L42
            r4.<init>()     // Catch: java.lang.Exception -> L42
            r3.xp = r4     // Catch: java.lang.Exception -> L42
            return
        L42:
            r4 = move-exception
            com.kwad.sdk.core.d.c.printStackTrace(r4)
            return
    }

    private d(java.lang.String r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.abm = r0
            r1.abn = r0
            r1.abo = r0
            r1.abu = r0
            r1.Bh = r2
            r1.mMediaPlayerType = r3
            com.kwad.components.core.video.j r2 = new com.kwad.components.core.video.j
            r2.<init>()
            r1.xp = r2
            return
    }

    public static com.kwad.components.core.video.a.a a(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r1, int r2, boolean r3) {
            com.kwad.sdk.core.config.item.d r3 = com.kwad.sdk.core.config.c.aBn
            boolean r3 = com.kwad.sdk.core.config.e.a(r3)
            if (r3 == 0) goto Lf
            com.kwad.components.core.video.a.d r3 = new com.kwad.components.core.video.a.d
            r0 = 0
            r3.<init>(r1, r2, r0)
            return r3
        Lf:
            com.kwad.components.core.video.a.b r1 = new com.kwad.components.core.video.a.b
            r1.<init>()
            return r1
    }

    public static com.kwad.components.core.video.a.a a(com.kwad.sdk.core.response.model.AdTemplate r1, com.kwad.sdk.core.response.model.AdTemplate r2, java.lang.String r3, int r4, boolean r5) {
            com.kwad.sdk.core.config.item.d r0 = com.kwad.sdk.core.config.c.aBn
            boolean r0 = com.kwad.sdk.core.config.e.a(r0)
            if (r0 == 0) goto L1e
            if (r1 == 0) goto L10
            com.kwad.components.core.video.a.d r2 = new com.kwad.components.core.video.a.d
            r2.<init>(r1, r4, r5)
            return r2
        L10:
            if (r2 != 0) goto L18
            com.kwad.components.core.video.a.d r1 = new com.kwad.components.core.video.a.d
            r1.<init>(r3, r4)
            return r1
        L18:
            com.kwad.components.core.video.a.d r1 = new com.kwad.components.core.video.a.d
            r1.<init>(r2, r4, r5)
            return r1
        L1e:
            com.kwad.components.core.video.a.b r1 = new com.kwad.components.core.video.a.b
            r1.<init>()
            return r1
    }

    static /* synthetic */ com.kwad.components.core.video.a.d.a a(com.kwad.components.core.video.a.d r0, int r1, int r2) {
            com.kwad.components.core.video.a.d$a r0 = r0.p(r1, r2)
            return r0
    }

    private void a(boolean r8, int r9, int r10) {
            r7 = this;
            com.kwad.components.core.video.a.d$b r0 = r7.uk()
            com.kwad.components.core.video.a.d$b r4 = r0.ul()
            com.kwad.components.core.video.a.d$1 r1 = new com.kwad.components.core.video.a.d$1
            r2 = r7
            r3 = r8
            r5 = r9
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            com.kwad.sdk.utils.h.execute(r1)
            return
    }

    private void b(boolean r3, int r4, int r5) {
            r2 = this;
            boolean r0 = r2.abo
            if (r0 == 0) goto L15
            com.kwad.components.core.video.j r0 = r2.xp
            r0.ue()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2.abs = r0
            r2.a(r3, r4, r5)
            r2.reset()
        L15:
            return
    }

    private com.kwad.components.core.video.a.d.a p(int r2, int r3) {
            r1 = this;
            com.kwad.components.core.video.a.d$a r0 = new com.kwad.components.core.video.a.d$a
            r0.<init>()
            r0.code = r2
            java.lang.String r2 = java.lang.String.valueOf(r3)
            r0.msg = r2
            java.lang.String r2 = r1.Bh
            r0.videoUrl = r2
            long r2 = r1.abi
            r0.llsid = r2
            long r2 = r1.abj
            r0.creativeId = r2
            long r2 = r1.abk
            r0.XI = r2
            java.lang.String r2 = r1.abl
            r0.abz = r2
            int r2 = r1.mMediaPlayerType
            r0.abA = r2
            return r0
    }

    private void reset() {
            r2 = this;
            com.kwad.components.core.video.j r0 = r2.xp
            r0.reset()
            r0 = 0
            r2.abp = r0
            r2.abq = r0
            r2.abs = r0
            r2.abr = r0
            r0 = 0
            r2.abm = r0
            r2.abn = r0
            r2.abo = r0
            return
    }

    private com.kwad.components.core.video.a.d.b uk() {
            r5 = this;
            com.kwad.components.core.video.a.d$b r0 = new com.kwad.components.core.video.a.d$b
            r0.<init>()
            long r1 = r5.abq
            long r3 = r5.abp
            long r1 = r1 - r3
            r0.abB = r1
            long r1 = r5.abr
            long r1 = r1 - r3
            r0.abC = r1
            com.kwad.components.core.video.j r1 = r5.xp
            com.kwad.components.core.video.j$a r1 = r1.ug()
            long r1 = r1.uj()
            r0.abD = r1
            long r1 = r5.abs
            long r3 = r5.abp
            long r1 = r1 - r3
            r0.videoDuration = r1
            com.kwad.components.core.video.j r1 = r5.xp
            com.kwad.components.core.video.j$a r1 = r1.ug()
            int r1 = r1.ui()
            r0.abg = r1
            java.lang.String r1 = r5.Bh
            r0.videoUrl = r1
            long r1 = r5.abi
            r0.llsid = r1
            long r1 = r5.abj
            r0.creativeId = r1
            long r1 = r5.abk
            r0.XI = r1
            java.lang.String r1 = r5.abl
            r0.abz = r1
            int r1 = r5.abt
            r0.adStyle = r1
            int r1 = r5.mMediaPlayerType
            r0.abA = r1
            return r0
    }

    @Override // com.kwad.components.core.video.m, com.kwad.components.core.video.i
    public final void onMediaPlayError(int r2, int r3) {
            r1 = this;
            super.onMediaPlayError(r2, r3)
            com.kwad.components.core.video.j r0 = r1.xp
            r0.ue()
            r0 = 0
            r1.b(r0, r2, r3)
            return
    }

    @Override // com.kwad.components.core.video.m, com.kwad.components.core.video.i
    public final void onMediaPlayPaused() {
            r1 = this;
            super.onMediaPlayPaused()
            com.kwad.components.core.video.j r0 = r1.xp
            r0.ue()
            return
    }

    @Override // com.kwad.components.core.video.m, com.kwad.components.core.video.i
    public final void onMediaPlayStart() {
            r2 = this;
            super.onMediaPlayStart()
            boolean r0 = r2.abn
            if (r0 != 0) goto L10
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2.abq = r0
            r0 = 1
            r2.abn = r0
        L10:
            return
    }

    @Override // com.kwad.components.core.video.m, com.kwad.components.core.video.i
    public final void onMediaPlaying() {
            r1 = this;
            super.onMediaPlaying()
            r1.qm()
            com.kwad.components.core.video.j r0 = r1.xp
            r0.ue()
            return
    }

    @Override // com.kwad.components.core.video.a.c
    public final void onRelease() {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.b(r0, r1, r1)
            return
    }

    @Override // com.kwad.components.core.video.a.c
    public final void onReset() {
            r1 = this;
            r0 = 0
            r1.b(r0, r0, r0)
            return
    }

    @Override // com.kwad.components.core.video.a.c
    public final void onStart() {
            r2 = this;
            boolean r0 = r2.abm
            if (r0 != 0) goto Ld
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2.abp = r0
            r0 = 1
            r2.abm = r0
        Ld:
            return
    }

    @Override // com.kwad.components.core.video.m, com.kwad.components.core.video.l
    public final void onVideoPlayBufferingPaused() {
            r1 = this;
            super.onVideoPlayBufferingPaused()
            com.kwad.components.core.video.j r0 = r1.xp
            r0.ud()
            return
    }

    @Override // com.kwad.components.core.video.m, com.kwad.components.core.video.l
    public final void onVideoPlayBufferingPlaying() {
            r1 = this;
            super.onVideoPlayBufferingPlaying()
            com.kwad.components.core.video.j r0 = r1.xp
            r0.ud()
            return
    }

    @Override // com.kwad.components.core.video.a.a
    public final void qm() {
            r2 = this;
            boolean r0 = r2.abo
            if (r0 != 0) goto Ld
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2.abr = r0
            r0 = 1
            r2.abo = r0
        Ld:
            return
    }
}
