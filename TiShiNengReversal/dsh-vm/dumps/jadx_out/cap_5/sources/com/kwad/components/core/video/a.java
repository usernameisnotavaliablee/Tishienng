package com.kwad.components.core.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"ViewConstructor"})
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a extends com.kwad.sdk.core.video.videoview.b implements android.view.View.OnClickListener {
    protected android.widget.ImageView Dh;
    protected android.widget.TextView Di;
    private com.kwad.components.core.video.a.c ZA;
    private com.kwad.components.core.video.a.InterfaceC0092a ZB;
    protected com.kwad.components.core.video.a.a ZC;
    protected android.view.View ZD;
    protected final com.kwad.sdk.core.download.a.a ZE;
    protected boolean Zl;
    private boolean Zm;
    protected boolean Zn;
    private int Zo;
    private int Zp;
    private boolean Zq;
    private com.kwad.sdk.widget.KSRelativeLayout Zr;
    private android.widget.RelativeLayout Zs;
    private boolean Zt;
    private boolean Zu;
    private android.widget.LinearLayout Zv;
    private android.widget.LinearLayout Zw;
    private android.widget.ImageView Zx;
    public android.view.ViewGroup Zy;
    protected android.widget.TextView Zz;
    protected com.kwad.sdk.core.response.model.AdInfo mAdInfo;

    @androidx.annotation.NonNull
    protected com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    protected com.kwad.components.core.e.d.c mApkDownloadHelper;
    protected android.content.Context mContext;
    protected android.widget.TextView pA;
    private android.widget.ProgressBar pU;
    private boolean pX;
    protected android.widget.ImageView pz;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.components.core.video.a$a, reason: collision with other inner class name */
    public interface InterfaceC0092a {
        void a(int r1, com.kwad.sdk.utils.aj.a r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b extends com.kwad.components.core.video.a.c {
        void onVideoPlayError(int r1, int r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface c {
        void aq();

        void ar();

        void d(long r1);

        void onVideoPlayStart();
    }

    public a(android.content.Context r1, @androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r2, @androidx.annotation.NonNull com.kwad.sdk.core.video.videoview.c r3) {
            r0 = this;
            r0.<init>(r1, r3)
            r3 = 1
            r0.Zm = r3
            r3 = 0
            r0.Zn = r3
            r0.Zu = r3
            com.kwad.components.core.video.a$1 r3 = new com.kwad.components.core.video.a$1
            r3.<init>(r0)
            r0.ZE = r3
            r0.mContext = r1
            r0.mAdTemplate = r2
            com.kwad.sdk.core.response.model.AdInfo r1 = com.kwad.sdk.core.response.b.e.el(r2)
            r0.mAdInfo = r1
            r0.init()
            return
    }

    private void ba(int r3) {
            r2 = this;
            com.kwad.components.core.video.a$a r0 = r2.ZB     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L10
            com.kwad.sdk.widget.KSRelativeLayout r1 = r2.Zr     // Catch: java.lang.Throwable -> Le
            com.kwad.sdk.utils.aj$a r1 = r1.getTouchCoords()     // Catch: java.lang.Throwable -> Le
            r0.a(r3, r1)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r3 = move-exception
            goto L11
        L10:
            return
        L11:
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r3)
            return
    }

    private void fB() {
            r2 = this;
            android.view.ViewGroup r0 = r2.Zy
            if (r0 == 0) goto L9
            r1 = 8
            r0.setVisibility(r1)
        L9:
            return
    }

    private void init() {
            r5 = this;
            android.content.Context r0 = r5.mContext
            int r1 = com.kwad.sdk.R.layout.ksad_feed_video_palyer_controller
            android.view.View r0 = com.kwad.sdk.o.m.inflate(r0, r1, r5)
            r5.ZD = r0
            int r0 = com.kwad.sdk.R.id.ksad_video_root_container
            android.view.View r0 = r5.findViewById(r0)
            com.kwad.sdk.widget.KSRelativeLayout r0 = (com.kwad.sdk.widget.KSRelativeLayout) r0
            r5.Zr = r0
            int r0 = com.kwad.sdk.R.id.ksad_data_flow_container
            android.view.View r0 = r5.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r5.Zs = r0
            int r0 = com.kwad.sdk.R.id.ksad_data_flow_play_tip
            android.view.View r0 = r5.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.pA = r0
            int r0 = com.kwad.sdk.R.id.ksad_data_flow_play_btn
            android.view.View r0 = r5.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r5.pz = r0
            r0.setOnClickListener(r5)
            int r0 = com.kwad.sdk.R.id.ksad_video_network_unavailable
            android.view.View r0 = r5.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r5.Zv = r0
            int r0 = com.kwad.sdk.R.id.ksad_video_error_container
            android.view.View r0 = r5.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r5.Zw = r0
            int r0 = com.kwad.sdk.R.id.ksad_video_progress
            android.view.View r0 = r5.findViewById(r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r5.pU = r0
            int r0 = com.kwad.sdk.R.id.ksad_video_thumb_image
            android.view.View r0 = r5.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r5.Zx = r0
            com.kwad.sdk.core.response.model.AdInfo r0 = r5.mAdInfo
            com.kwad.sdk.core.response.model.b r0 = com.kwad.sdk.core.response.b.a.bu(r0)
            java.lang.String r0 = r0.getUrl()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 != 0) goto L81
            android.widget.ImageView r1 = r5.Zx
            r3 = 0
            r1.setImageDrawable(r3)
            android.widget.ImageView r1 = r5.Zx
            com.kwad.sdk.core.response.model.AdTemplate r3 = r5.mAdTemplate
            com.kwad.sdk.core.imageloader.KSImageLoader.loadImage(r1, r0, r3)
            android.widget.ImageView r0 = r5.Zx
            r0.setVisibility(r2)
            goto L88
        L81:
            android.widget.ImageView r0 = r5.Zx
            r1 = 8
            r0.setVisibility(r1)
        L88:
            com.kwad.sdk.core.response.model.AdInfo r0 = r5.mAdInfo
            int r0 = com.kwad.sdk.core.response.b.a.L(r0)
            android.widget.TextView r1 = r5.pA
            int r0 = r0 * 1000
            long r3 = (long) r0
            java.lang.String r0 = com.kwad.sdk.utils.bu.aq(r3)
            r1.setText(r0)
            com.kwad.sdk.core.response.model.AdTemplate r0 = r5.mAdTemplate
            com.kwad.sdk.core.video.videoview.c r1 = r5.aKI
            int r1 = r1.getMediaPlayerType()
            com.kwad.components.core.video.a.a r0 = com.kwad.components.core.video.a.d.a(r0, r1, r2)
            r5.ZC = r0
            r5.tq()
            return
    }

    private void setTopBottomVisible(boolean r3) {
            r2 = this;
            boolean r0 = r2.Zu
            if (r0 == 0) goto L5
            return
        L5:
            android.widget.ProgressBar r0 = r2.pU
            if (r3 == 0) goto Lb
            r1 = 0
            goto Ld
        Lb:
            r1 = 8
        Ld:
            r0.setVisibility(r1)
            r2.Zt = r3
            return
    }

    private void tu() {
            r2 = this;
            android.widget.RelativeLayout r0 = r2.Zs
            r1 = 8
            r0.setVisibility(r1)
            return
    }

    public final void aL(java.lang.String r2) {
            r1 = this;
            int r0 = com.kwad.sdk.R.id.ksad_app_download
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 != 0) goto Lb
            return
        Lb:
            r0.setText(r2)
            return
    }

    public final void aR(boolean r2) {
            r1 = this;
            boolean r0 = r1.Zu
            if (r0 == 0) goto L5
            goto L11
        L5:
            if (r2 == 0) goto L12
            boolean r2 = r1.Zt
            if (r2 == 0) goto L11
            android.widget.ProgressBar r2 = r1.pU
            r0 = 0
            r2.setVisibility(r0)
        L11:
            return
        L12:
            android.widget.ProgressBar r2 = r1.pU
            r0 = 8
            r2.setVisibility(r0)
            return
    }

    protected void ac() {
            r1 = this;
            com.kwad.sdk.core.video.videoview.c r0 = r1.aKI
            boolean r0 = r0.isIdle()
            if (r0 == 0) goto L59
            com.kwad.components.core.video.a.a r0 = r1.ZC
            if (r0 == 0) goto Lf
            r0.onStart()
        Lf:
            android.content.Context r0 = r1.mContext
            boolean r0 = com.kwad.sdk.utils.ao.isNetworkConnected(r0)
            if (r0 != 0) goto L1b
            r1.tr()
            return
        L1b:
            r1.ts()
            boolean r0 = r1.Zn
            if (r0 == 0) goto L2b
            r1.tv()
            com.kwad.sdk.core.video.videoview.c r0 = r1.aKI
            r0.start()
            return
        L2b:
            boolean r0 = r1.Zm
            if (r0 == 0) goto L40
            android.content.Context r0 = r1.mContext
            boolean r0 = com.kwad.sdk.utils.ao.isWifiConnected(r0)
            if (r0 == 0) goto L40
            r1.tv()
            com.kwad.sdk.core.video.videoview.c r0 = r1.aKI
            r0.start()
            return
        L40:
            boolean r0 = r1.Zm
            if (r0 == 0) goto L55
            boolean r0 = r1.pX
            if (r0 != 0) goto L4c
            boolean r0 = r1.Zl
            if (r0 == 0) goto L55
        L4c:
            r1.tv()
            com.kwad.sdk.core.video.videoview.c r0 = r1.aKI
            r0.start()
            return
        L55:
            r1.tt()
            return
        L59:
            com.kwad.sdk.core.video.videoview.c r0 = r1.aKI
            boolean r0 = r0.isPaused()
            if (r0 != 0) goto L6b
            com.kwad.sdk.core.video.videoview.c r0 = r1.aKI
            boolean r0 = r0.Ke()
            if (r0 == 0) goto L6a
            goto L6b
        L6a:
            return
        L6b:
            r1.tv()
            com.kwad.sdk.core.video.videoview.c r0 = r1.aKI
            r0.restart()
            return
    }

    protected void fA() {
            r5 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r5.mAdInfo     // Catch: java.lang.Exception -> L73
            boolean r0 = com.kwad.sdk.core.response.b.a.aF(r0)     // Catch: java.lang.Exception -> L73
            if (r0 == 0) goto L75
            int r0 = com.kwad.sdk.R.id.ksad_video_complete_app_container     // Catch: java.lang.Exception -> L73
            android.view.View r0 = r5.findViewById(r0)     // Catch: java.lang.Exception -> L73
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0     // Catch: java.lang.Exception -> L73
            int r1 = com.kwad.sdk.R.id.ksad_video_complete_app_icon     // Catch: java.lang.Exception -> L73
            android.view.View r1 = r5.findViewById(r1)     // Catch: java.lang.Exception -> L73
            android.widget.ImageView r1 = (android.widget.ImageView) r1     // Catch: java.lang.Exception -> L73
            r5.Dh = r1     // Catch: java.lang.Exception -> L73
            int r1 = com.kwad.sdk.R.id.ksad_app_name     // Catch: java.lang.Exception -> L73
            android.view.View r1 = r5.findViewById(r1)     // Catch: java.lang.Exception -> L73
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch: java.lang.Exception -> L73
            r5.Di = r1     // Catch: java.lang.Exception -> L73
            int r1 = com.kwad.sdk.R.id.ksad_app_download     // Catch: java.lang.Exception -> L73
            android.view.View r1 = r5.findViewById(r1)     // Catch: java.lang.Exception -> L73
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch: java.lang.Exception -> L73
            r5.Zz = r1     // Catch: java.lang.Exception -> L73
            android.widget.ImageView r1 = r5.Dh     // Catch: java.lang.Exception -> L73
            com.kwad.sdk.core.response.model.AdTemplate r2 = r5.mAdTemplate     // Catch: java.lang.Exception -> L73
            java.lang.String r2 = com.kwad.sdk.core.response.b.e.eq(r2)     // Catch: java.lang.Exception -> L73
            com.kwad.sdk.core.response.model.AdTemplate r3 = r5.mAdTemplate     // Catch: java.lang.Exception -> L73
            r4 = 12
            com.kwad.sdk.core.imageloader.KSImageLoader.loadAppIcon(r1, r2, r3, r4)     // Catch: java.lang.Exception -> L73
            android.widget.TextView r1 = r5.Di     // Catch: java.lang.Exception -> L73
            com.kwad.sdk.core.response.model.AdInfo r2 = r5.mAdInfo     // Catch: java.lang.Exception -> L73
            java.lang.String r2 = com.kwad.sdk.core.response.b.a.cl(r2)     // Catch: java.lang.Exception -> L73
            r1.setText(r2)     // Catch: java.lang.Exception -> L73
            android.widget.TextView r1 = r5.Zz     // Catch: java.lang.Exception -> L73
            com.kwad.sdk.core.response.model.AdInfo r2 = r5.mAdInfo     // Catch: java.lang.Exception -> L73
            java.lang.String r2 = com.kwad.sdk.core.response.b.a.aE(r2)     // Catch: java.lang.Exception -> L73
            r1.setText(r2)     // Catch: java.lang.Exception -> L73
            r5.Zy = r0     // Catch: java.lang.Exception -> L73
            android.widget.ImageView r0 = r5.Dh     // Catch: java.lang.Exception -> L73
            r0.setOnClickListener(r5)     // Catch: java.lang.Exception -> L73
            android.widget.TextView r0 = r5.Di     // Catch: java.lang.Exception -> L73
            r0.setOnClickListener(r5)     // Catch: java.lang.Exception -> L73
            android.widget.TextView r0 = r5.Zz     // Catch: java.lang.Exception -> L73
            r0.setOnClickListener(r5)     // Catch: java.lang.Exception -> L73
            com.kwad.components.core.e.d.c r0 = new com.kwad.components.core.e.d.c     // Catch: java.lang.Exception -> L73
            com.kwad.sdk.core.response.model.AdTemplate r1 = r5.mAdTemplate     // Catch: java.lang.Exception -> L73
            r0.<init>(r1)     // Catch: java.lang.Exception -> L73
            r5.mApkDownloadHelper = r0     // Catch: java.lang.Exception -> L73
            com.kwad.sdk.core.download.a.a r1 = r5.ZE     // Catch: java.lang.Exception -> L73
            r0.b(r1)     // Catch: java.lang.Exception -> L73
            goto L97
        L73:
            r0 = move-exception
            goto La3
        L75:
            int r0 = com.kwad.sdk.R.id.ksad_video_complete_h5_container     // Catch: java.lang.Exception -> L73
            android.view.View r0 = r5.findViewById(r0)     // Catch: java.lang.Exception -> L73
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0     // Catch: java.lang.Exception -> L73
            int r1 = com.kwad.sdk.R.id.ksad_h5_open     // Catch: java.lang.Exception -> L73
            android.view.View r1 = r5.findViewById(r1)     // Catch: java.lang.Exception -> L73
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch: java.lang.Exception -> L73
            r5.Zz = r1     // Catch: java.lang.Exception -> L73
            com.kwad.sdk.core.response.model.AdInfo r2 = r5.mAdInfo     // Catch: java.lang.Exception -> L73
            java.lang.String r2 = com.kwad.sdk.core.response.b.a.aE(r2)     // Catch: java.lang.Exception -> L73
            r1.setText(r2)     // Catch: java.lang.Exception -> L73
            android.widget.TextView r1 = r5.Zz     // Catch: java.lang.Exception -> L73
            r1.setOnClickListener(r5)     // Catch: java.lang.Exception -> L73
            r5.Zy = r0     // Catch: java.lang.Exception -> L73
        L97:
            android.view.ViewGroup r0 = r5.Zy     // Catch: java.lang.Exception -> L73
            r0.setOnClickListener(r5)     // Catch: java.lang.Exception -> L73
            android.view.ViewGroup r0 = r5.Zy     // Catch: java.lang.Exception -> L73
            r1 = 0
            r0.setVisibility(r1)     // Catch: java.lang.Exception -> L73
            return
        La3:
            com.kwad.sdk.core.d.c.printStackTraceOnly(r0)
            return
    }

    public com.kwad.sdk.core.response.model.AdTemplate getAdTemplate() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            return r0
    }

    @Override // com.kwad.sdk.core.video.videoview.b
    public final void o(int r1, int r2) {
            r0 = this;
            r0.Zp = r2
            r0.Zo = r1
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r3) {
            r2 = this;
            android.widget.ImageView r0 = r2.pz
            r1 = 1
            if (r3 != r0) goto Ld
            r2.Zl = r1
            r2.Zm = r1
            r2.ac()
            return
        Ld:
            android.widget.ImageView r0 = r2.Dh
            if (r3 != r0) goto L15
            r2.ba(r1)
            return
        L15:
            android.widget.TextView r0 = r2.Di
            if (r3 != r0) goto L1e
            r3 = 2
            r2.ba(r3)
            return
        L1e:
            android.widget.TextView r0 = r2.Zz
            if (r3 != r0) goto L27
            r3 = 3
            r2.ba(r3)
            return
        L27:
            r3 = 4
            r2.ba(r3)
            return
    }

    @Override // com.kwad.sdk.core.video.videoview.b
    public final void onPlayStateChanged(int r5) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onPlayStateChanged playState="
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "AdVideoPlayerController"
            com.kwad.sdk.core.d.c.d(r1, r0)
            r0 = -1
            r1 = 0
            r2 = 8
            if (r5 == r0) goto Lc2
            r0 = 9
            if (r5 == r0) goto L8d
            r0 = 1
            if (r5 == r0) goto L77
            r1 = 2
            if (r5 == r1) goto L62
            r0 = 4
            if (r5 == r0) goto L49
            r0 = 5
            if (r5 == r0) goto L41
            r0 = 6
            if (r5 == r0) goto L39
            r0 = 7
            if (r5 == r0) goto L31
            goto L108
        L31:
            com.kwad.components.core.video.a.a r5 = r4.ZC
            if (r5 == 0) goto L108
            r5.onVideoPlayBufferingPaused()
            return
        L39:
            com.kwad.components.core.video.a.a r5 = r4.ZC
            if (r5 == 0) goto L108
            r5.onVideoPlayBufferingPlaying()
            return
        L41:
            com.kwad.components.core.video.a.a r5 = r4.ZC
            if (r5 == 0) goto L108
            r5.onMediaPlayPaused()
            return
        L49:
            com.kwad.components.core.video.a$c r5 = r4.ZA
            if (r5 == 0) goto L50
            r5.aq()
        L50:
            android.widget.ImageView r5 = r4.Zx
            r5.setVisibility(r2)
            com.kwad.components.core.video.a.a r5 = r4.ZC
            if (r5 == 0) goto L108
            r5.qm()
            com.kwad.components.core.video.a.a r5 = r4.ZC
            r5.onMediaPlaying()
            return
        L62:
            com.kwad.components.core.video.a$c r5 = r4.ZA
            if (r5 == 0) goto L69
            r5.onVideoPlayStart()
        L69:
            com.kwad.components.core.video.a.a r5 = r4.ZC
            if (r5 == 0) goto L70
            r5.onMediaPlayStart()
        L70:
            r4.setTopBottomVisible(r0)
            r4.tD()
            return
        L77:
            r4.tu()
            android.widget.LinearLayout r5 = r4.Zv
            r5.setVisibility(r2)
            android.widget.LinearLayout r5 = r4.Zw
            r5.setVisibility(r2)
            android.widget.ProgressBar r5 = r4.pU
            r5.setVisibility(r2)
            r4.fB()
            return
        L8d:
            r4.tE()
            com.kwad.sdk.core.response.model.AdTemplate r5 = r4.mAdTemplate
            r2 = -1
            r5.setmCurPlayTime(r2)
            r4.setTopBottomVisible(r1)
            boolean r5 = r4.Zq
            if (r5 != 0) goto Lb3
            android.widget.ImageView r5 = r4.Zx
            com.kwad.sdk.core.response.model.AdInfo r0 = r4.mAdInfo
            java.lang.String r0 = com.kwad.sdk.core.response.b.a.X(r0)
            com.kwad.sdk.core.response.model.AdTemplate r2 = r4.mAdTemplate
            com.kwad.sdk.core.imageloader.KSImageLoader.loadImage(r5, r0, r2)
            android.widget.ImageView r5 = r4.Zx
            r5.setVisibility(r1)
            r4.fA()
        Lb3:
            com.kwad.components.core.video.a$c r5 = r4.ZA
            if (r5 == 0) goto Lba
            r5.ar()
        Lba:
            com.kwad.components.core.video.a.a r5 = r4.ZC
            if (r5 == 0) goto L108
            r5.onMediaPlayCompleted()
            return
        Lc2:
            r4.tE()
            r4.setTopBottomVisible(r1)
            android.widget.LinearLayout r5 = r4.Zv
            r5.setVisibility(r2)
            android.widget.LinearLayout r5 = r4.Zw
            r5.setVisibility(r1)
            com.kwad.components.core.video.a$c r5 = r4.ZA
            boolean r0 = r5 instanceof com.kwad.components.core.video.f.a
            if (r0 == 0) goto Le1
            com.kwad.components.core.video.f$a r5 = (com.kwad.components.core.video.f.a) r5
            int r0 = r4.Zo
            int r1 = r4.Zp
            r5.onVideoPlayError(r0, r1)
        Le1:
            com.kwad.components.core.video.a$c r5 = r4.ZA
            boolean r0 = r5 instanceof com.kwad.components.core.video.a.b
            if (r0 == 0) goto Lf0
            com.kwad.components.core.video.a$b r5 = (com.kwad.components.core.video.a.b) r5
            int r0 = r4.Zo
            int r1 = r4.Zp
            r5.onVideoPlayError(r0, r1)
        Lf0:
            com.kwad.components.core.p.a r5 = com.kwad.components.core.p.a.se()
            com.kwad.sdk.core.response.model.AdTemplate r0 = r4.mAdTemplate
            int r1 = r4.Zo
            int r2 = r4.Zp
            r5.g(r0, r1, r2)
            com.kwad.components.core.video.a.a r5 = r4.ZC
            if (r5 == 0) goto L108
            int r0 = r4.Zo
            int r1 = r4.Zp
            r5.onMediaPlayError(r0, r1)
        L108:
            return
    }

    public void release() {
            r1 = this;
            com.kwad.sdk.core.video.videoview.c r0 = r1.aKI
            r0.release()
            com.kwad.components.core.video.a.a r0 = r1.ZC
            if (r0 == 0) goto Lc
            r0.onRelease()
        Lc:
            return
    }

    @Override // com.kwad.sdk.core.video.videoview.b
    @androidx.annotation.UiThread
    public final void reset() {
            r2 = this;
            r2.tE()
            android.widget.ProgressBar r0 = r2.pU
            r1 = 0
            r0.setProgress(r1)
            android.widget.ProgressBar r0 = r2.pU
            r0.setSecondaryProgress(r1)
            r2.tu()
            android.widget.LinearLayout r0 = r2.Zv
            r1 = 8
            r0.setVisibility(r1)
            android.widget.LinearLayout r0 = r2.Zw
            r0.setVisibility(r1)
            android.widget.ProgressBar r0 = r2.pU
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r2.Zx
            r0.setVisibility(r1)
            android.widget.RelativeLayout r0 = r2.Zs
            r0.setVisibility(r1)
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            com.kwad.sdk.core.response.model.VideoPlayerStatus r0 = r0.mVideoPlayerStatus
            r1 = 1
            r0.setVideoPlayerBehavior(r1)
            r2.fB()
            return
    }

    public void setAdClickListener(com.kwad.components.core.video.a.InterfaceC0092a r1) {
            r0 = this;
            r0.ZB = r1
            return
    }

    public void setCanControlPlay(boolean r1) {
            r0 = this;
            r0.Zn = r1
            return
    }

    public void setDataAutoStart(boolean r1) {
            r0 = this;
            r0.Zm = r1
            return
    }

    public void setDataFlowAutoStart(boolean r1) {
            r0 = this;
            r0.pX = r1
            return
    }

    public void setHideEnd(boolean r1) {
            r0 = this;
            r0.Zq = r1
            return
    }

    public void setVideoPlayCallback(com.kwad.components.core.video.a.c r1) {
            r0 = this;
            r0.ZA = r1
            return
    }

    protected void tq() {
            r0 = this;
            return
    }

    protected final void tr() {
            r2 = this;
            android.widget.LinearLayout r0 = r2.Zv
            r1 = 0
            r0.setVisibility(r1)
            return
    }

    protected final void ts() {
            r2 = this;
            android.widget.LinearLayout r0 = r2.Zv
            r1 = 8
            r0.setVisibility(r1)
            return
    }

    protected final void tt() {
            r2 = this;
            android.widget.RelativeLayout r0 = r2.Zs
            r1 = 0
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r2.Zx
            r0.setVisibility(r1)
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            com.kwad.sdk.core.response.model.VideoPlayerStatus r0 = r0.mVideoPlayerStatus
            r1 = 2
            r0.setVideoPlayerBehavior(r1)
            return
    }

    protected final void tv() {
            r2 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.mAdTemplate
            com.kwad.sdk.contentalliance.a.a.a r0 = com.kwad.sdk.contentalliance.a.a.a.bQ(r0)
            com.kwad.sdk.core.video.videoview.c r1 = r2.aKI
            r1.setKsPlayLogParam(r0)
            return
    }

    protected void tw() {
            r1 = this;
            com.kwad.sdk.core.video.videoview.c r0 = r1.aKI
            r0.pause()
            return
    }

    @Override // com.kwad.sdk.core.video.videoview.b
    public final void tx() {
            r6 = this;
            com.kwad.sdk.core.video.videoview.c r0 = r6.aKI
            long r0 = r0.getCurrentPosition()
            com.kwad.sdk.core.video.videoview.c r2 = r6.aKI
            long r2 = r2.getDuration()
            com.kwad.sdk.core.video.videoview.c r4 = r6.aKI
            int r4 = r4.getBufferPercentage()
            android.widget.ProgressBar r5 = r6.pU
            r5.setSecondaryProgress(r4)
            r4 = 1120403456(0x42c80000, float:100.0)
            float r5 = (float) r0
            float r5 = r5 * r4
            float r2 = (float) r2
            float r5 = r5 / r2
            int r2 = (int) r5
            com.kwad.sdk.core.response.model.AdTemplate r3 = r6.mAdTemplate
            r3.setmCurPlayTime(r0)
            android.widget.ProgressBar r3 = r6.pU
            r3.setProgress(r2)
            com.kwad.components.core.video.a$c r2 = r6.ZA
            if (r2 == 0) goto L30
            r2.d(r0)
        L30:
            return
    }

    public final void ty() {
            r2 = this;
            r0 = 1
            r2.Zu = r0
            android.widget.ProgressBar r0 = r2.pU
            r1 = 8
            r0.setVisibility(r1)
            return
    }
}
