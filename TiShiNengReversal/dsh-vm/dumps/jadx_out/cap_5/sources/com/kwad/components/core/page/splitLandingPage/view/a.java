package com.kwad.components.core.page.splitLandingPage.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a {
    private android.view.ViewGroup Cc;
    private android.widget.ImageView No;

    @androidx.annotation.Nullable
    private android.view.WindowManager Vl;
    private com.kwad.components.core.page.splitLandingPage.a.a Vm;
    private android.widget.FrameLayout Vn;
    private android.widget.FrameLayout Vo;
    private com.kwad.components.core.video.e Vp;
    private final android.view.WindowManager.LayoutParams Vq;
    private com.kwad.components.core.page.splitLandingPage.view.a.InterfaceC0087a Vr;
    private com.kwad.sdk.core.video.videoview.a cq;
    private com.kwad.sdk.core.video.videoview.a.InterfaceC0149a cz;
    private android.widget.ImageView hM;
    private android.content.Context mContext;





    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.components.core.page.splitLandingPage.view.a$a, reason: collision with other inner class name */
    public interface InterfaceC0087a {
        boolean rK();
    }

    @android.annotation.SuppressLint({"ClickableViewAccessibility", "InflateParams"})
    public a(android.content.Context r2, com.kwad.components.core.page.splitLandingPage.a.a r3) {
            r1 = this;
            r1.<init>()
            android.view.WindowManager$LayoutParams r0 = new android.view.WindowManager$LayoutParams
            r0.<init>()
            r1.Vq = r0
            if (r2 != 0) goto Ld
            goto L21
        Ld:
            android.content.Context r2 = com.kwad.sdk.o.m.wrapContextIfNeed(r2)
            r1.mContext = r2
            r1.Vm = r3
            java.lang.String r3 = "window"
            java.lang.Object r2 = r2.getSystemService(r3)
            android.view.WindowManager r2 = (android.view.WindowManager) r2
            r1.Vl = r2
            if (r2 != 0) goto L22
        L21:
            return
        L22:
            android.content.Context r2 = r1.mContext
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            int r3 = com.kwad.sdk.R.layout.ksad_split_mini_video
            r0 = 0
            android.view.View r2 = r2.inflate(r3, r0)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r1.Cc = r2
            int r3 = com.kwad.sdk.R.id.ksad_split_texture
            android.view.View r2 = r2.findViewById(r3)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r1.Vn = r2
            android.view.ViewGroup r2 = r1.Cc
            int r3 = com.kwad.sdk.R.id.ksad_video_container
            android.view.View r2 = r2.findViewById(r3)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r1.Vo = r2
            android.view.ViewGroup r2 = r1.Cc
            int r3 = com.kwad.sdk.R.id.ksad_video_first_frame_container
            android.view.View r2 = r2.findViewById(r3)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r1.hM = r2
            android.view.ViewGroup r2 = r1.Cc
            int r3 = com.kwad.sdk.R.id.ksad_split_mini_close_btn
            android.view.View r2 = r2.findViewById(r3)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r1.No = r2
            android.widget.FrameLayout r2 = r1.Vn
            com.kwad.components.core.page.splitLandingPage.view.a$1 r3 = new com.kwad.components.core.page.splitLandingPage.view.a$1
            r3.<init>(r1)
            r2.setOnTouchListener(r3)
            return
    }

    static /* synthetic */ android.view.WindowManager.LayoutParams a(com.kwad.components.core.page.splitLandingPage.view.a r0) {
            android.view.WindowManager$LayoutParams r0 = r0.Vq
            return r0
    }

    static /* synthetic */ android.view.WindowManager b(com.kwad.components.core.page.splitLandingPage.view.a r0) {
            android.view.WindowManager r0 = r0.Vl
            return r0
    }

    static /* synthetic */ android.view.ViewGroup c(com.kwad.components.core.page.splitLandingPage.view.a r0) {
            android.view.ViewGroup r0 = r0.Cc
            return r0
    }

    private void c(@androidx.annotation.NonNull com.kwad.sdk.api.KsAdVideoPlayConfig r9) {
            r8 = this;
            com.kwad.components.core.page.splitLandingPage.a.a r0 = r8.Vm
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.getAdTemplate()
            com.kwad.sdk.core.response.model.AdInfo r1 = com.kwad.sdk.core.response.b.e.el(r0)
            com.kwad.sdk.core.response.model.b r2 = com.kwad.sdk.core.response.b.a.bu(r1)
            java.lang.String r2 = r2.getUrl()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            r4 = 0
            r5 = 0
            if (r3 != 0) goto L2a
            android.widget.ImageView r3 = r8.hM
            r3.setImageDrawable(r5)
            android.widget.ImageView r3 = r8.hM
            com.kwad.sdk.core.imageloader.KSImageLoader.loadImage(r3, r2, r0)
            android.widget.ImageView r2 = r8.hM
            r2.setVisibility(r4)
            goto L31
        L2a:
            android.widget.ImageView r2 = r8.hM
            r3 = 8
            r2.setVisibility(r3)
        L31:
            java.lang.String r2 = com.kwad.sdk.core.response.b.a.K(r1)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L3c
            return
        L3c:
            com.kwad.sdk.core.video.videoview.AdVideoPlayerViewCache r3 = com.kwad.sdk.core.video.videoview.AdVideoPlayerViewCache.getInstance()
            com.kwad.sdk.core.video.videoview.a r2 = r3.eF(r2)
            r8.cq = r2
            if (r2 != 0) goto Lbd
            com.kwad.sdk.core.video.videoview.a r2 = new com.kwad.sdk.core.video.videoview.a
            android.content.Context r3 = r8.mContext
            r2.<init>(r3)
            r8.cq = r2
            com.kwad.sdk.core.response.b.a.ab(r1)
            com.kwad.sdk.contentalliance.a.a.b$a r1 = new com.kwad.sdk.contentalliance.a.a.b$a
            r1.<init>(r0)
            com.kwad.sdk.core.response.model.VideoPlayerStatus r2 = r0.mVideoPlayerStatus
            com.kwad.sdk.contentalliance.a.a.b$a r1 = r1.a(r2)
            java.lang.String r2 = com.kwad.sdk.core.response.b.e.en(r0)
            com.kwad.sdk.contentalliance.a.a.b$a r1 = r1.dg(r2)
            com.kwad.sdk.core.response.model.PhotoInfo r2 = com.kwad.sdk.core.response.b.e.em(r0)
            java.lang.String r2 = com.kwad.sdk.core.response.b.h.b(r2)
            com.kwad.sdk.contentalliance.a.a.b$a r1 = r1.dh(r2)
            com.kwad.sdk.contentalliance.a.a.a r2 = new com.kwad.sdk.contentalliance.a.a.a
            long r6 = java.lang.System.currentTimeMillis()
            r2.<init>(r0, r6)
            com.kwad.sdk.contentalliance.a.a.b$a r1 = r1.b(r2)
            com.kwad.sdk.contentalliance.a.a.b r1 = r1.El()
            com.kwad.sdk.core.video.videoview.a r2 = r8.cq
            r2.a(r1, r5)
            com.kwad.components.core.page.splitLandingPage.view.a$3 r1 = new com.kwad.components.core.page.splitLandingPage.view.a$3
            r1.<init>(r8, r0)
            r8.cz = r1
            com.kwad.sdk.core.video.videoview.a r2 = r8.cq
            r2.setExternalPlayerListener(r1)
            com.kwad.sdk.core.video.videoview.a r1 = r8.cq
            boolean r2 = r9.isVideoSoundEnable()
            r1.setVideoSoundEnable(r2)
            com.kwad.components.core.video.e r1 = new com.kwad.components.core.video.e
            android.content.Context r2 = r8.mContext
            com.kwad.sdk.core.video.videoview.a r3 = r8.cq
            r1.<init>(r2, r0, r3, r9)
            r8.Vp = r1
            boolean r0 = r9.isDataFlowAutoStart()
            r1.setDataFlowAutoStart(r0)
            com.kwad.sdk.core.video.videoview.a r0 = r8.cq
            com.kwad.components.core.video.e r1 = r8.Vp
            r0.setController(r1)
            com.kwad.components.core.video.e r0 = r8.Vp
            r0.setAutoRelease(r4)
            goto Ld1
        Lbd:
            com.kwad.sdk.core.video.videoview.b r0 = r2.getController()
            com.kwad.components.core.video.e r0 = (com.kwad.components.core.video.e) r0
            r8.Vp = r0
            r0.setAutoRelease(r4)
            com.kwad.components.core.video.e r0 = r8.Vp
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.getAdTemplate()
            r1 = 1
            r0.mAdWebVideoPageShowing = r1
        Ld1:
            com.kwad.sdk.core.video.videoview.a r0 = r8.cq
            boolean r9 = r9.isVideoSoundEnable()
            r0.setVideoSoundEnable(r9)
            com.kwad.sdk.core.video.videoview.a r9 = r8.cq
            android.view.ViewParent r9 = r9.getParent()
            if (r9 == 0) goto Lef
            com.kwad.sdk.core.video.videoview.a r9 = r8.cq
            android.view.ViewParent r9 = r9.getParent()
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            com.kwad.sdk.core.video.videoview.a r0 = r8.cq
            r9.removeView(r0)
        Lef:
            android.widget.FrameLayout r9 = r8.Vo
            java.lang.Object r9 = r9.getTag()
            if (r9 == 0) goto L107
            android.widget.FrameLayout r9 = r8.Vo
            java.lang.Object r0 = r9.getTag()
            android.view.View r0 = (android.view.View) r0
            r9.removeView(r0)
            android.widget.FrameLayout r9 = r8.Vo
            r9.setTag(r5)
        L107:
            android.widget.FrameLayout r9 = r8.Vo
            com.kwad.sdk.core.video.videoview.a r0 = r8.cq
            r9.addView(r0)
            android.widget.FrameLayout r9 = r8.Vo
            com.kwad.sdk.core.video.videoview.a r0 = r8.cq
            r9.setTag(r0)
            com.kwad.components.core.video.e r9 = r8.Vp
            r0 = 1008981770(0x3c23d70a, float:0.01)
            r9.setAlpha(r0)
            com.kwad.components.core.video.e r9 = r8.Vp
            com.kwad.components.core.page.splitLandingPage.view.a$4 r0 = new com.kwad.components.core.page.splitLandingPage.view.a$4
            r0.<init>(r8)
            r9.setVideoPlayCallback(r0)
            return
    }

    static /* synthetic */ com.kwad.components.core.page.splitLandingPage.view.a.InterfaceC0087a d(com.kwad.components.core.page.splitLandingPage.view.a r0) {
            com.kwad.components.core.page.splitLandingPage.view.a$a r0 = r0.Vr
            return r0
    }

    static /* synthetic */ com.kwad.components.core.page.splitLandingPage.a.a e(com.kwad.components.core.page.splitLandingPage.view.a r0) {
            com.kwad.components.core.page.splitLandingPage.a.a r0 = r0.Vm
            return r0
    }

    public final void a(com.kwad.components.core.page.splitLandingPage.view.a.InterfaceC0087a r1) {
            r0 = this;
            r0.Vr = r1
            return
    }

    public final android.animation.Animator aK(boolean r5) {
            r4 = this;
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            android.view.ViewGroup r1 = r4.Cc
            android.animation.ValueAnimator r1 = com.kwad.components.core.t.o.h(r1, r5)
            android.widget.ImageView r2 = r4.hM
            android.animation.ValueAnimator r5 = com.kwad.components.core.t.o.h(r2, r5)
            r2 = 2
            android.animation.Animator[] r2 = new android.animation.Animator[r2]
            r3 = 0
            r2[r3] = r1
            r1 = 1
            r2[r1] = r5
            r0.playTogether(r2)
            return r0
    }

    public final boolean isVisible() {
            r2 = this;
            android.view.ViewGroup r0 = r2.Cc
            float r0 = r0.getAlpha()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto Ld
            r0 = 1
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public final void rJ() {
            r1 = this;
            com.kwad.components.core.video.e r0 = r1.Vp
            r0.ab()
            return
    }

    public final boolean rM() {
            r8 = this;
            com.kwad.components.core.page.splitLandingPage.a.a r0 = r8.Vm
            if (r0 == 0) goto L135
            android.view.WindowManager r0 = r8.Vl
            if (r0 != 0) goto La
            goto L135
        La:
            com.kwad.sdk.api.KsAdVideoPlayConfig$Builder r0 = new com.kwad.sdk.api.KsAdVideoPlayConfig$Builder
            r0.<init>()
            com.kwad.components.core.page.splitLandingPage.a.a r1 = r8.Vm
            com.kwad.sdk.core.response.model.AdTemplate r1 = r1.getAdTemplate()
            boolean r1 = r1.mIsAudioEnable
            com.kwad.sdk.api.KsAdVideoPlayConfig$Builder r0 = r0.videoSoundEnable(r1)
            com.kwad.sdk.api.KsAdVideoPlayConfig r0 = r0.build()
            r8.c(r0)
            com.kwad.components.core.page.splitLandingPage.a.a r0 = r8.Vm
            com.kwad.sdk.core.response.model.AdTemplate r0 = r0.getAdTemplate()
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r0)
            int r1 = com.kwad.sdk.core.response.b.a.R(r0)
            int r0 = com.kwad.sdk.core.response.b.a.Q(r0)
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.content.Context r3 = r8.mContext
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            r4 = 1125777408(0x431a0000, float:154.0)
            r5 = 1132199936(0x437c0000, float:252.0)
            r6 = 1118568448(0x42ac0000, float:86.0)
            if (r1 <= r0) goto L6d
            int r0 = r3.widthPixels
            r2.right = r0
            android.content.Context r1 = r8.mContext
            int r1 = com.kwad.sdk.c.a.a.a(r1, r6)
            int r0 = r0 - r1
            r2.left = r0
            int r0 = r3.heightPixels
            android.content.Context r1 = r8.mContext
            int r1 = com.kwad.sdk.c.a.a.a(r1, r5)
            int r0 = r0 - r1
            r2.bottom = r0
            android.content.Context r1 = r8.mContext
            int r1 = com.kwad.sdk.c.a.a.a(r1, r4)
            int r0 = r0 - r1
            r2.top = r0
            goto L8e
        L6d:
            int r0 = r3.widthPixels
            r2.right = r0
            android.content.Context r1 = r8.mContext
            int r1 = com.kwad.sdk.c.a.a.a(r1, r4)
            int r0 = r0 - r1
            r2.left = r0
            int r0 = r3.heightPixels
            android.content.Context r1 = r8.mContext
            int r1 = com.kwad.sdk.c.a.a.a(r1, r5)
            int r0 = r0 - r1
            r2.bottom = r0
            android.content.Context r1 = r8.mContext
            int r1 = com.kwad.sdk.c.a.a.a(r1, r6)
            int r0 = r0 - r1
            r2.top = r0
        L8e:
            int r0 = r2.left
            android.content.Context r1 = r8.mContext
            r4 = 1094713344(0x41400000, float:12.0)
            int r1 = com.kwad.sdk.c.a.a.a(r1, r4)
            int r0 = r0 - r1
            r2.left = r0
            int r0 = r2.right
            android.content.Context r1 = r8.mContext
            int r1 = com.kwad.sdk.c.a.a.a(r1, r4)
            int r0 = r0 - r1
            r2.right = r0
            android.view.WindowManager$LayoutParams r1 = r8.Vq
            r5 = 1003(0x3eb, float:1.406E-42)
            r1.type = r5
            r5 = 8
            r1.flags = r5
            r5 = 51
            r1.gravity = r5
            r5 = 1
            r1.format = r5
            int r6 = r3.widthPixels
            r1.width = r6
            int r6 = r3.heightPixels
            r1.height = r6
            int r6 = r2.left
            r1.x = r6
            int r7 = r2.top
            r1.y = r7
            int r0 = r0 - r6
            android.content.Context r6 = r8.mContext
            int r6 = com.kwad.sdk.c.a.a.a(r6, r4)
            int r0 = r0 + r6
            r1.width = r0
            android.view.WindowManager$LayoutParams r0 = r8.Vq
            int r1 = r2.bottom
            int r6 = r2.top
            int r1 = r1 - r6
            android.content.Context r6 = r8.mContext
            int r4 = com.kwad.sdk.c.a.a.a(r6, r4)
            int r1 = r1 + r4
            r0.height = r1
            int r0 = r2.left
            float r1 = (float) r0
            int r4 = r3.widthPixels
            float r6 = (float) r4
            float r1 = r1 * r6
            int r0 = r0 + r4
            int r4 = r2.right
            int r0 = r0 - r4
            float r0 = (float) r0
            float r1 = r1 / r0
            int r0 = r2.top
            float r4 = (float) r0
            int r3 = r3.heightPixels
            float r6 = (float) r3
            float r4 = r4 * r6
            int r0 = r0 + r3
            int r2 = r2.bottom
            int r0 = r0 - r2
            float r0 = (float) r0
            float r4 = r4 / r0
            android.view.ViewGroup r0 = r8.Cc
            r0.setPivotX(r1)
            android.view.ViewGroup r0 = r8.Cc
            r0.setPivotY(r4)
            android.view.ViewGroup r0 = r8.Cc
            r1 = 0
            r0.setAlpha(r1)
            android.view.WindowManager r0 = r8.Vl
            if (r0 == 0) goto L12a
            android.view.ViewGroup r0 = r8.Cc     // Catch: java.lang.Exception -> L123
            android.os.IBinder r0 = r0.getWindowToken()     // Catch: java.lang.Exception -> L123
            if (r0 != 0) goto L12a
            android.view.WindowManager r0 = r8.Vl     // Catch: java.lang.Exception -> L123
            android.view.ViewGroup r1 = r8.Cc     // Catch: java.lang.Exception -> L123
            android.view.WindowManager$LayoutParams r2 = r8.Vq     // Catch: java.lang.Exception -> L123
            r0.addView(r1, r2)     // Catch: java.lang.Exception -> L123
            goto L12a
        L123:
            r0 = move-exception
            com.kwad.components.core.d.a.reportSdkCaughtException(r0)
            com.kwad.sdk.core.d.c.printStackTraceOnly(r0)
        L12a:
            android.widget.ImageView r0 = r8.No
            com.kwad.components.core.page.splitLandingPage.view.a$2 r1 = new com.kwad.components.core.page.splitLandingPage.view.a$2
            r1.<init>(r8)
            r0.setOnClickListener(r1)
            return r5
        L135:
            r0 = 0
            return r0
    }

    public final void rN() {
            r1 = this;
            com.kwad.sdk.core.video.videoview.a r0 = r1.cq
            if (r0 == 0) goto Lf
            boolean r0 = r0.isPlaying()
            if (r0 != 0) goto Lf
            com.kwad.components.core.video.e r0 = r1.Vp
            r0.tT()
        Lf:
            return
    }
}
