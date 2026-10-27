package com.beizi.ad.internal.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class BannerAdViewImpl extends com.beizi.ad.internal.view.AdViewImpl {
    private com.beizi.ad.internal.view.c A;
    private com.beizi.ad.internal.view.BannerAdViewImpl.a B;
    protected boolean m;
    protected int n;
    protected int o;
    private int p;
    private boolean q;
    private boolean r;
    private android.content.BroadcastReceiver s;
    private boolean t;
    private boolean u;
    private boolean v;
    private com.beizi.ad.internal.animation.Animator w;
    private boolean x;
    private com.beizi.ad.internal.view.AdWebView y;
    private boolean z;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.beizi.ad.internal.view.BannerAdViewImpl$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a = null;

        static {
                com.beizi.ad.internal.view.BannerAdViewImpl$a[] r0 = com.beizi.ad.internal.view.BannerAdViewImpl.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.beizi.ad.internal.view.BannerAdViewImpl.AnonymousClass2.a = r0
                com.beizi.ad.internal.view.BannerAdViewImpl$a r1 = com.beizi.ad.internal.view.BannerAdViewImpl.a.a     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.beizi.ad.internal.view.BannerAdViewImpl.AnonymousClass2.a     // Catch: java.lang.NoSuchFieldError -> L1d
                com.beizi.ad.internal.view.BannerAdViewImpl$a r1 = com.beizi.ad.internal.view.BannerAdViewImpl.a.f7153b     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.beizi.ad.internal.view.BannerAdViewImpl.AnonymousClass2.a     // Catch: java.lang.NoSuchFieldError -> L28
                com.beizi.ad.internal.view.BannerAdViewImpl$a r1 = com.beizi.ad.internal.view.BannerAdViewImpl.a.f7154c     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.beizi.ad.internal.view.BannerAdViewImpl.AnonymousClass2.a     // Catch: java.lang.NoSuchFieldError -> L33
                com.beizi.ad.internal.view.BannerAdViewImpl$a r1 = com.beizi.ad.internal.view.BannerAdViewImpl.a.f7155d     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.beizi.ad.internal.view.BannerAdViewImpl.AnonymousClass2.a     // Catch: java.lang.NoSuchFieldError -> L3e
                com.beizi.ad.internal.view.BannerAdViewImpl$a r1 = com.beizi.ad.internal.view.BannerAdViewImpl.a.f7156e     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.beizi.ad.internal.view.BannerAdViewImpl.AnonymousClass2.a     // Catch: java.lang.NoSuchFieldError -> L49
                com.beizi.ad.internal.view.BannerAdViewImpl$a r1 = com.beizi.ad.internal.view.BannerAdViewImpl.a.f7157f     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = com.beizi.ad.internal.view.BannerAdViewImpl.AnonymousClass2.a     // Catch: java.lang.NoSuchFieldError -> L54
                com.beizi.ad.internal.view.BannerAdViewImpl$a r1 = com.beizi.ad.internal.view.BannerAdViewImpl.a.f7158g     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = com.beizi.ad.internal.view.BannerAdViewImpl.AnonymousClass2.a     // Catch: java.lang.NoSuchFieldError -> L60
                com.beizi.ad.internal.view.BannerAdViewImpl$a r1 = com.beizi.ad.internal.view.BannerAdViewImpl.a.f7159h     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                int[] r0 = com.beizi.ad.internal.view.BannerAdViewImpl.AnonymousClass2.a     // Catch: java.lang.NoSuchFieldError -> L6c
                com.beizi.ad.internal.view.BannerAdViewImpl$a r1 = com.beizi.ad.internal.view.BannerAdViewImpl.a.f7160i     // Catch: java.lang.NoSuchFieldError -> L6c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                return
        }

        public AnonymousClass2() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum a extends java.lang.Enum<com.beizi.ad.internal.view.BannerAdViewImpl.a> {
        public static final com.beizi.ad.internal.view.BannerAdViewImpl.a a = null;

        /* renamed from: b, reason: collision with root package name */
        public static final com.beizi.ad.internal.view.BannerAdViewImpl.a f7153b = null;

        /* renamed from: c, reason: collision with root package name */
        public static final com.beizi.ad.internal.view.BannerAdViewImpl.a f7154c = null;

        /* renamed from: d, reason: collision with root package name */
        public static final com.beizi.ad.internal.view.BannerAdViewImpl.a f7155d = null;

        /* renamed from: e, reason: collision with root package name */
        public static final com.beizi.ad.internal.view.BannerAdViewImpl.a f7156e = null;

        /* renamed from: f, reason: collision with root package name */
        public static final com.beizi.ad.internal.view.BannerAdViewImpl.a f7157f = null;

        /* renamed from: g, reason: collision with root package name */
        public static final com.beizi.ad.internal.view.BannerAdViewImpl.a f7158g = null;

        /* renamed from: h, reason: collision with root package name */
        public static final com.beizi.ad.internal.view.BannerAdViewImpl.a f7159h = null;

        /* renamed from: i, reason: collision with root package name */
        public static final com.beizi.ad.internal.view.BannerAdViewImpl.a f7160i = null;

        /* renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ com.beizi.ad.internal.view.BannerAdViewImpl.a[] f7161j = null;

        static {
                com.beizi.ad.internal.view.BannerAdViewImpl$a r0 = new com.beizi.ad.internal.view.BannerAdViewImpl$a
                java.lang.String r1 = "TOP_LEFT"
                r2 = 0
                r0.<init>(r1, r2)
                com.beizi.ad.internal.view.BannerAdViewImpl.a.a = r0
                com.beizi.ad.internal.view.BannerAdViewImpl$a r1 = new com.beizi.ad.internal.view.BannerAdViewImpl$a
                java.lang.String r3 = "TOP_CENTER"
                r4 = 1
                r1.<init>(r3, r4)
                com.beizi.ad.internal.view.BannerAdViewImpl.a.f7153b = r1
                com.beizi.ad.internal.view.BannerAdViewImpl$a r3 = new com.beizi.ad.internal.view.BannerAdViewImpl$a
                java.lang.String r5 = "TOP_RIGHT"
                r6 = 2
                r3.<init>(r5, r6)
                com.beizi.ad.internal.view.BannerAdViewImpl.a.f7154c = r3
                com.beizi.ad.internal.view.BannerAdViewImpl$a r5 = new com.beizi.ad.internal.view.BannerAdViewImpl$a
                java.lang.String r7 = "CENTER_LEFT"
                r8 = 3
                r5.<init>(r7, r8)
                com.beizi.ad.internal.view.BannerAdViewImpl.a.f7155d = r5
                com.beizi.ad.internal.view.BannerAdViewImpl$a r7 = new com.beizi.ad.internal.view.BannerAdViewImpl$a
                java.lang.String r9 = "CENTER"
                r10 = 4
                r7.<init>(r9, r10)
                com.beizi.ad.internal.view.BannerAdViewImpl.a.f7156e = r7
                com.beizi.ad.internal.view.BannerAdViewImpl$a r9 = new com.beizi.ad.internal.view.BannerAdViewImpl$a
                java.lang.String r11 = "CENTER_RIGHT"
                r12 = 5
                r9.<init>(r11, r12)
                com.beizi.ad.internal.view.BannerAdViewImpl.a.f7157f = r9
                com.beizi.ad.internal.view.BannerAdViewImpl$a r11 = new com.beizi.ad.internal.view.BannerAdViewImpl$a
                java.lang.String r13 = "BOTTOM_LEFT"
                r14 = 6
                r11.<init>(r13, r14)
                com.beizi.ad.internal.view.BannerAdViewImpl.a.f7158g = r11
                com.beizi.ad.internal.view.BannerAdViewImpl$a r13 = new com.beizi.ad.internal.view.BannerAdViewImpl$a
                java.lang.String r15 = "BOTTOM_CENTER"
                r16 = 0
                r2 = 7
                r13.<init>(r15, r2)
                com.beizi.ad.internal.view.BannerAdViewImpl.a.f7159h = r13
                com.beizi.ad.internal.view.BannerAdViewImpl$a r15 = new com.beizi.ad.internal.view.BannerAdViewImpl$a
                r17 = 7
                java.lang.String r2 = "BOTTOM_RIGHT"
                r18 = 1
                r4 = 8
                r15.<init>(r2, r4)
                com.beizi.ad.internal.view.BannerAdViewImpl.a.f7160i = r15
                r2 = 9
                com.beizi.ad.internal.view.BannerAdViewImpl$a[] r2 = new com.beizi.ad.internal.view.BannerAdViewImpl.a[r2]
                r2[r16] = r0
                r2[r18] = r1
                r2[r6] = r3
                r2[r8] = r5
                r2[r10] = r7
                r2[r12] = r9
                r2[r14] = r11
                r2[r17] = r13
                r2[r4] = r15
                com.beizi.ad.internal.view.BannerAdViewImpl.a.f7161j = r2
                return
        }

        a(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.beizi.ad.internal.view.BannerAdViewImpl.a valueOf(java.lang.String r1) {
                java.lang.Class<com.beizi.ad.internal.view.BannerAdViewImpl$a> r0 = com.beizi.ad.internal.view.BannerAdViewImpl.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.beizi.ad.internal.view.BannerAdViewImpl$a r1 = (com.beizi.ad.internal.view.BannerAdViewImpl.a) r1
                return r1
        }

        public static com.beizi.ad.internal.view.BannerAdViewImpl.a[] values() {
                com.beizi.ad.internal.view.BannerAdViewImpl$a[] r0 = com.beizi.ad.internal.view.BannerAdViewImpl.a.f7161j
                java.lang.Object r0 = r0.clone()
                com.beizi.ad.internal.view.BannerAdViewImpl$a[] r0 = (com.beizi.ad.internal.view.BannerAdViewImpl.a[]) r0
                return r0
        }

        int a() {
                r2 = this;
                int[] r0 = com.beizi.ad.internal.view.BannerAdViewImpl.AnonymousClass2.a
                int r1 = r2.ordinal()
                r0 = r0[r1]
                switch(r0) {
                    case 1: goto L23;
                    case 2: goto L20;
                    case 3: goto L1d;
                    case 4: goto L1a;
                    case 5: goto Lb;
                    case 6: goto L17;
                    case 7: goto L14;
                    case 8: goto L11;
                    case 9: goto Le;
                    default: goto Lb;
                }
            Lb:
                r0 = 17
                return r0
            Le:
                r0 = 85
                return r0
            L11:
                r0 = 81
                return r0
            L14:
                r0 = 83
                return r0
            L17:
                r0 = 21
                return r0
            L1a:
                r0 = 19
                return r0
            L1d:
                r0 = 53
                return r0
            L20:
                r0 = 49
                return r0
            L23:
                r0 = 51
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements android.view.animation.Animation.AnimationListener {
        final /* synthetic */ com.beizi.ad.internal.view.BannerAdViewImpl a;

        /* renamed from: b, reason: collision with root package name */
        private final com.beizi.ad.internal.view.c f7162b;

        /* renamed from: c, reason: collision with root package name */
        private final com.beizi.ad.internal.animation.Animator f7163c;


        b(com.beizi.ad.internal.view.BannerAdViewImpl r1, com.beizi.ad.internal.view.c r2, com.beizi.ad.internal.animation.Animator r3) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                r0.f7162b = r2
                r0.f7163c = r3
                return
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(android.view.animation.Animation r4) {
                r3 = this;
                r0 = 0
                r4.setAnimationListener(r0)
                com.beizi.ad.internal.view.c r4 = r3.f7162b
                com.beizi.ad.internal.animation.Animator r0 = r3.f7163c
                if (r4 == 0) goto L1c
                if (r0 == 0) goto L1c
                android.view.View r1 = r4.getView()
                android.os.Handler r1 = r1.getHandler()
                com.beizi.ad.internal.view.BannerAdViewImpl$b$1 r2 = new com.beizi.ad.internal.view.BannerAdViewImpl$b$1
                r2.<init>(r3, r0, r4)
                r1.post(r2)
            L1c:
                return
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(android.view.animation.Animation r1) {
                r0 = this;
                return
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(android.view.animation.Animation r1) {
                r0 = this;
                return
        }
    }

    public BannerAdViewImpl(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1
            r0.z = r1
            return
    }

    public BannerAdViewImpl(android.content.Context r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1
            r0.z = r1
            r0.setAutoRefreshInterval(r2)
            return
    }

    public BannerAdViewImpl(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 1
            r0.z = r1
            return
    }

    public BannerAdViewImpl(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 1
            r0.z = r1
            return
    }

    public BannerAdViewImpl(android.content.Context r1, android.view.ViewGroup r2, android.view.View r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 1
            r0.z = r1
            return
    }

    static /* synthetic */ int a(com.beizi.ad.internal.view.BannerAdViewImpl r0) {
            int r0 = r0.p
            return r0
    }

    static /* synthetic */ boolean b(com.beizi.ad.internal.view.BannerAdViewImpl r0) {
            boolean r0 = r0.r
            return r0
    }

    private void j() {
            r2 = this;
            r0 = 0
            r2.q = r0
            r1 = -1
            r2.p = r1
            r2.r = r0
            r0 = 1
            r2.x = r0
            return
    }

    private void k() {
            r4 = this;
            java.lang.String r0 = "BeiZisAd"
            android.content.BroadcastReceiver r1 = r4.s
            if (r1 == 0) goto L7
            return
        L7:
            android.content.IntentFilter r1 = new android.content.IntentFilter
            java.lang.String r2 = "android.intent.action.SCREEN_OFF"
            r1.<init>(r2)
            java.lang.String r2 = "android.intent.action.SCREEN_ON"
            r1.addAction(r2)
            com.beizi.ad.internal.view.BannerAdViewImpl$1 r2 = new com.beizi.ad.internal.view.BannerAdViewImpl$1
            r2.<init>(r4)
            r4.s = r2
            java.lang.String r2 = "before registerReceiver"
            com.beizi.ad.lance.a.m.c(r0, r2)     // Catch: java.lang.Throwable -> L29
            android.content.Context r2 = r4.getContext()     // Catch: java.lang.Throwable -> L29
            android.content.BroadcastReceiver r3 = r4.s     // Catch: java.lang.Throwable -> L29
            r2.registerReceiver(r3, r1)     // Catch: java.lang.Throwable -> L29
            return
        L29:
            java.lang.String r1 = "ignore error"
            com.beizi.ad.lance.a.m.c(r0, r1)
            return
    }

    private void l() {
            r1 = this;
            int r0 = r1.p
            if (r0 <= 0) goto L7
            r1.k()
        L7:
            return
    }

    private void m() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "enter dismantleBroadcast mReceiver == null ? "
            r0.append(r1)
            android.content.BroadcastReceiver r1 = r3.s
            if (r1 != 0) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "BeiZisAd"
            com.beizi.ad.lance.a.m.c(r1, r0)
            android.content.BroadcastReceiver r0 = r3.s
            if (r0 != 0) goto L22
            return
        L22:
            android.content.Context r0 = r3.getContext()     // Catch: java.lang.IllegalArgumentException -> L31
            android.content.BroadcastReceiver r2 = r3.s     // Catch: java.lang.IllegalArgumentException -> L31
            r0.unregisterReceiver(r2)     // Catch: java.lang.IllegalArgumentException -> L31
            java.lang.String r0 = "after unregisterReceiver"
            com.beizi.ad.lance.a.m.c(r1, r0)     // Catch: java.lang.IllegalArgumentException -> L31
            goto L36
        L31:
            java.lang.String r0 = "got IllegalArgumentException"
            com.beizi.ad.lance.a.m.c(r1, r0)
        L36:
            r0 = 0
            r3.s = r0
            return
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl
    protected void a(android.content.Context r8, android.util.AttributeSet r9) {
            r7 = this;
            r0 = -1
            r7.p = r0
            r0 = 0
            r7.m = r0
            r7.t = r0
            r7.u = r0
            r7.v = r0
            com.beizi.ad.internal.animation.Animator r1 = new com.beizi.ad.internal.animation.Animator
            android.content.Context r2 = r7.getContext()
            com.beizi.ad.internal.animation.h r3 = com.beizi.ad.internal.animation.h.a
            com.beizi.ad.internal.animation.g r4 = com.beizi.ad.internal.animation.g.a
            r5 = 500(0x1f4, double:2.47E-321)
            r1.<init>(r2, r3, r4, r5)
            r7.w = r1
            android.view.ViewParent r0 = r7.getParent()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L4d
            int r1 = r0.getMeasuredHeight()
            int r0 = r0.getMeasuredHeight()
            com.beizi.ad.internal.h r2 = com.beizi.ad.internal.h.a()
            float r1 = (float) r1
            float r3 = r2.h()
            float r1 = r1 / r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r3
            int r1 = (int) r1
            float r0 = (float) r0
            float r2 = r2.g()
            float r0 = r0 / r2
            float r0 = r0 + r3
            int r0 = (int) r0
            com.beizi.ad.internal.e r2 = r7.f7096h
            r2.c(r0)
            com.beizi.ad.internal.e r0 = r7.f7096h
            r0.d(r1)
        L4d:
            super.a(r8, r9)
            r7.l()
            com.beizi.ad.internal.e r8 = r7.f7096h
            android.view.ViewGroup r9 = r7.a
            if (r9 == 0) goto L5c
            com.beizi.ad.internal.k r9 = com.beizi.ad.internal.k.a
            goto L5e
        L5c:
            com.beizi.ad.internal.k r9 = com.beizi.ad.internal.k.f7002d
        L5e:
            r8.a(r9)
            com.beizi.ad.internal.d r8 = r7.mAdFetcher
            int r9 = r7.p
            r8.a(r9)
            boolean r8 = r7.x
            if (r8 == 0) goto L74
            com.beizi.ad.internal.d r8 = r7.mAdFetcher
            r8.b()
            r8 = 1
            r7.q = r8
        L74:
            return
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl
    protected void a(com.beizi.ad.internal.d.e r1) {
            r0 = this;
            r0.a(r1)
            return
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl
    protected void a(com.beizi.ad.internal.view.c r5) {
            r4 = this;
            if (r5 == 0) goto L12a
            boolean r0 = r5.failed()
            if (r0 != 0) goto L12a
            android.view.View r0 = r5.getView()
            if (r0 != 0) goto L10
            goto L12a
        L10:
            com.beizi.ad.internal.view.c r0 = r4.f7091c
            if (r0 != r5) goto L15
            return
        L15:
            r4.A = r5
            com.beizi.ad.internal.animation.h r0 = r4.getTransitionType()
            com.beizi.ad.internal.animation.h r1 = com.beizi.ad.internal.animation.h.a
            if (r0 != r1) goto L6b
            r4.removeAllViews()
            com.beizi.ad.internal.view.c r0 = r4.f7091c
            if (r0 == 0) goto L29
            r0.destroy()
        L29:
            android.view.View r0 = r5.getView()
            r4.addView(r0)
            boolean r1 = r0 instanceof com.beizi.ad.internal.view.AdWebView
            if (r1 == 0) goto L40
            java.lang.String r1 = "BeiZisAd"
            java.lang.String r2 = "set mAdWebView"
            com.beizi.ad.lance.a.m.a(r1, r2)
            r1 = r0
            com.beizi.ad.internal.view.AdWebView r1 = (com.beizi.ad.internal.view.AdWebView) r1
            r4.y = r1
        L40:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            if (r1 == 0) goto L56
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            com.beizi.ad.internal.view.BannerAdViewImpl$a r1 = r4.getAdAlignment()
            int r1 = r1.a()
            r0.gravity = r1
        L56:
            com.beizi.ad.internal.k r0 = r4.getMediaType()
            com.beizi.ad.internal.k r1 = com.beizi.ad.internal.k.a
            if (r0 != r1) goto L66
            android.view.View r0 = r5.getView()
            boolean r0 = r0 instanceof com.beizi.ad.internal.video.AdVideoView
            if (r0 == 0) goto L111
        L66:
            r5.visible()
            goto L111
        L6b:
            android.view.View r0 = r5.getView()
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            if (r0 == 0) goto L96
            android.view.View r0 = r5.getView()
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            com.beizi.ad.internal.view.BannerAdViewImpl$a r1 = r4.getAdAlignment()
            int r1 = r1.a()
            r0.gravity = r1
            com.beizi.ad.internal.animation.Animator r0 = r4.w
            android.view.View r1 = r5.getView()
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            r0.setLayoutParams(r1)
        L96:
            int r0 = r4.getChildCount()
            if (r0 == 0) goto Lc8
            com.beizi.ad.internal.animation.Animator r0 = r4.w
            int r0 = r4.indexOfChild(r0)
            r1 = -1
            if (r0 != r1) goto La6
            goto Lc8
        La6:
            com.beizi.ad.internal.k r0 = r4.getMediaType()
            com.beizi.ad.internal.k r1 = com.beizi.ad.internal.k.a
            if (r0 != r1) goto Lb6
            android.view.View r0 = r5.getView()
            boolean r0 = r0 instanceof com.beizi.ad.internal.video.AdVideoView
            if (r0 == 0) goto Lb9
        Lb6:
            r5.visible()
        Lb9:
            com.beizi.ad.internal.animation.Animator r0 = r4.w
            android.view.View r1 = r5.getView()
            r0.addView(r1)
            com.beizi.ad.internal.animation.Animator r0 = r4.w
            r0.showNext()
            goto Led
        Lc8:
            r4.removeAllViews()
            com.beizi.ad.internal.k r0 = r4.getMediaType()
            com.beizi.ad.internal.k r1 = com.beizi.ad.internal.k.a
            if (r0 != r1) goto Ldb
            android.view.View r0 = r5.getView()
            boolean r0 = r0 instanceof com.beizi.ad.internal.video.AdVideoView
            if (r0 == 0) goto Lde
        Ldb:
            r5.visible()
        Lde:
            com.beizi.ad.internal.animation.Animator r0 = r4.w
            r1 = 0
            r4.addView(r0, r1)
            com.beizi.ad.internal.animation.Animator r0 = r4.w
            android.view.View r1 = r5.getView()
            r0.addView(r1)
        Led:
            com.beizi.ad.internal.view.c r0 = r4.f7091c
            if (r0 == 0) goto L111
            android.view.View r1 = r0.getView()
            android.view.animation.Animation r1 = r1.getAnimation()
            if (r1 == 0) goto L10e
            android.view.View r1 = r0.getView()
            android.view.animation.Animation r1 = r1.getAnimation()
            com.beizi.ad.internal.view.BannerAdViewImpl$b r2 = new com.beizi.ad.internal.view.BannerAdViewImpl$b
            com.beizi.ad.internal.animation.Animator r3 = r4.w
            r2.<init>(r4, r0, r3)
            r1.setAnimationListener(r2)
            goto L111
        L10e:
            r0.destroy()
        L111:
            r4.b()
            android.view.ViewGroup r0 = r4.a
            if (r0 != 0) goto L127
            int r0 = r5.getRefreshInterval()
            if (r0 <= 0) goto L127
            boolean r1 = r4.z
            if (r1 == 0) goto L127
            int r0 = r0 * 1000
            r4.setAutoRefreshInterval(r0)
        L127:
            r4.f7091c = r5
            return
        L12a:
            com.beizi.ad.a r5 = r4.getAdListener()
            r0 = 5
            r5.a(r0)
            return
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl
    public void activityOnDestroy() {
            r2 = this;
            com.beizi.ad.internal.view.c r0 = r2.A
            if (r0 == 0) goto La
            r0.onDestroy()
            r0 = 0
            r2.A = r0
        La:
            java.lang.String r0 = "BeiZisAd"
            java.lang.String r1 = "enter activityOnDestroy before dismantleBroadcast"
            com.beizi.ad.lance.a.m.c(r0, r1)
            r2.m()
            com.beizi.ad.internal.d r0 = r2.mAdFetcher
            if (r0 == 0) goto L1b
            r2.h()
        L1b:
            return
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl
    public void activityOnPause() {
            r1 = this;
            com.beizi.ad.internal.view.c r0 = r1.A
            if (r0 == 0) goto L7
            r0.onPause()
        L7:
            return
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl
    public void activityOnResume() {
            r1 = this;
            com.beizi.ad.internal.view.c r0 = r1.A
            if (r0 == 0) goto L7
            r0.onResume()
        L7:
            return
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl
    protected void b(android.content.Context r6, android.util.AttributeSet r7) {
            r5 = this;
            r5.j()
            int[] r0 = com.beizi.fusion.R.styleable.AdView
            android.content.res.TypedArray r6 = r6.obtainStyledAttributes(r7, r0)
            int r7 = r6.getIndexCount()
            r0 = 0
            r1 = 0
        Lf:
            if (r1 >= r7) goto Lf1
            int r2 = r6.getIndex(r1)
            int r3 = com.beizi.fusion.R.styleable.AdView_beizi_adUnitId
            if (r2 != r3) goto L22
            java.lang.String r2 = r6.getString(r2)
            r5.setAdUnitId(r2)
            goto Led
        L22:
            int r3 = com.beizi.fusion.R.styleable.AdView_auto_refresh_interval
            r4 = 1
            if (r2 != r3) goto L35
            r3 = -1
            int r2 = r6.getInt(r2, r3)
            r5.setAutoRefreshInterval(r2)
            if (r2 > 0) goto Led
            r5.x = r4
            goto Led
        L35:
            int r3 = com.beizi.fusion.R.styleable.AdView_test
            if (r2 != r3) goto L45
            com.beizi.ad.internal.h r3 = com.beizi.ad.internal.h.a()
            boolean r2 = r6.getBoolean(r2, r0)
            r3.f6834d = r2
            goto Led
        L45:
            int r3 = com.beizi.fusion.R.styleable.AdView_beizi_adSize
            if (r2 != r3) goto L76
            java.lang.String r2 = r6.getString(r2)
            r3 = 0
            if (r2 == 0) goto L65
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L65
            java.lang.Class<com.beizi.ad.c> r4 = com.beizi.ad.c.class
            java.lang.reflect.Field r2 = r4.getDeclaredField(r2)     // Catch: java.lang.Exception -> L64
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Exception -> L64
            com.beizi.ad.c r2 = (com.beizi.ad.c) r2     // Catch: java.lang.Exception -> L64
            r3 = r2
            goto L65
        L64:
        L65:
            if (r3 != 0) goto L69
            com.beizi.ad.c r3 = com.beizi.ad.c.f6527g
        L69:
            int r2 = r3.b()
            int r3 = r3.a()
            r5.setAdSize(r2, r3)
            goto Led
        L76:
            int r3 = com.beizi.fusion.R.styleable.AdView_should_reload_on_resume
            if (r2 != r3) goto L83
            boolean r2 = r6.getBoolean(r2, r0)
            r5.setShouldReloadOnResume(r2)
            goto Led
        L83:
            int r3 = com.beizi.fusion.R.styleable.AdView_opens_native_browser
            if (r2 != r3) goto L8f
            boolean r2 = r6.getBoolean(r2, r0)
            r5.setOpensNativeBrowser(r2)
            goto Led
        L8f:
            int r3 = com.beizi.fusion.R.styleable.AdView_expands_to_fit_screen_width
            if (r2 != r3) goto L9b
            boolean r2 = r6.getBoolean(r2, r0)
            r5.setExpandsToFitScreenWidth(r2)
            goto Led
        L9b:
            int r3 = com.beizi.fusion.R.styleable.AdView_resize_ad_to_fit_container
            if (r2 != r3) goto La7
            boolean r2 = r6.getBoolean(r2, r0)
            r5.setResizeAdToFitContainer(r2)
            goto Led
        La7:
            int r3 = com.beizi.fusion.R.styleable.AdView_show_loading_indicator
            if (r2 != r3) goto Lb3
            boolean r2 = r6.getBoolean(r2, r4)
            r5.setShowLoadingIndicator(r2)
            goto Led
        Lb3:
            int r3 = com.beizi.fusion.R.styleable.AdView_transition_type
            if (r2 != r3) goto Lc3
            int r2 = r6.getInt(r2, r0)
            com.beizi.ad.internal.animation.h r2 = com.beizi.ad.internal.animation.h.a(r2)
            r5.setTransitionType(r2)
            goto Led
        Lc3:
            int r3 = com.beizi.fusion.R.styleable.AdView_transition_direction
            if (r2 != r3) goto Ld3
            int r2 = r6.getInt(r2, r0)
            com.beizi.ad.internal.animation.g r2 = com.beizi.ad.internal.animation.g.a(r2)
            r5.setTransitionDirection(r2)
            goto Led
        Ld3:
            int r3 = com.beizi.fusion.R.styleable.AdView_transition_duration
            if (r2 != r3) goto Le2
            r3 = 1000(0x3e8, float:1.401E-42)
            int r2 = r6.getInt(r2, r3)
            long r2 = (long) r2
            r5.setTransitionDuration(r2)
            goto Led
        Le2:
            int r3 = com.beizi.fusion.R.styleable.AdView_load_landing_page_in_background
            if (r2 != r3) goto Led
            boolean r2 = r6.getBoolean(r2, r4)
            r5.setLoadsInBackground(r2)
        Led:
            int r1 = r1 + 1
            goto Lf
        Lf1:
            r6.recycle()
            return
    }

    public void cancel() {
            r1 = this;
            com.beizi.ad.internal.d r0 = r1.mAdFetcher
            if (r0 == 0) goto L7
            r0.a()
        L7:
            return
    }

    public void clickArea() {
            r8 = this;
            com.beizi.ad.internal.view.AdWebView r0 = r8.y
            if (r0 == 0) goto L13
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = java.lang.System.currentTimeMillis()
            r6 = 10
            long r4 = r4 + r6
            r1 = 0
            r0.handleClickView(r1, r2, r4)
        L13:
            return
    }

    public void clickArea(com.beizi.ad.model.d r9, int r10) {
            r8 = this;
            com.beizi.ad.internal.view.AdWebView r0 = r8.y
            if (r0 == 0) goto L14
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = java.lang.System.currentTimeMillis()
            r6 = 10
            long r4 = r4 + r6
            r1 = r9
            r6 = r10
            r0.handleClickView(r1, r2, r4, r6)
        L14:
            return
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl
    boolean d() {
            r1 = this;
            r0 = 1
            return r0
    }

    public void disableFullClick(android.view.View.OnTouchListener r2) {
            r1 = this;
            com.beizi.ad.internal.view.AdWebView r0 = r1.y
            if (r0 == 0) goto L7
            r0.setOnTouchListener(r2)
        L7:
            return
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl
    boolean e() {
            r1 = this;
            r0 = 0
            return r0
    }

    @android.annotation.SuppressLint({"NewApi"})
    public void expandToFitScreenWidth(int r3, int r4, com.beizi.ad.internal.view.c r5) {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            r0.getSize(r1)
            int r0 = r1.x
            float r1 = (float) r0
            float r3 = (float) r3
            float r1 = r1 / r3
            float r3 = (float) r4
            float r3 = r3 * r1
            double r3 = (double) r3
            double r3 = java.lang.Math.floor(r3)
            int r3 = (int) r3
            android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
            int r4 = r4.height
            r2.n = r4
            android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
            int r4 = r4.width
            r2.o = r4
            android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
            int r4 = r4.width
            if (r4 > 0) goto L47
            android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
            int r4 = r4.width
            r1 = -2
            if (r4 != r1) goto L4d
        L47:
            android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
            r4.width = r0
        L4d:
            android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
            r4.height = r3
            android.view.View r3 = r5.getView()
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            r5 = -1
            if (r4 != 0) goto L67
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r4.<init>(r5, r5)
            r3.setLayoutParams(r4)
            goto L73
        L67:
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            r4.width = r5
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            r4.height = r5
        L73:
            r3.invalidate()
            r3 = 1
            r2.m = r3
            return
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl
    void f() {
            r0 = this;
            return
    }

    void g() {
            r1 = this;
            boolean r0 = r1.q
            if (r0 != 0) goto Lc
            com.beizi.ad.internal.d r0 = r1.mAdFetcher
            r0.b()
            r0 = 1
            r1.q = r0
        Lc:
            return
    }

    public com.beizi.ad.internal.view.BannerAdViewImpl.a getAdAlignment() {
            r1 = this;
            com.beizi.ad.internal.view.BannerAdViewImpl$a r0 = r1.B
            if (r0 != 0) goto L8
            com.beizi.ad.internal.view.BannerAdViewImpl$a r0 = com.beizi.ad.internal.view.BannerAdViewImpl.a.f7156e
            r1.B = r0
        L8:
            com.beizi.ad.internal.view.BannerAdViewImpl$a r0 = r1.B
            return r0
    }

    public int getAdHeight() {
            r1 = this;
            com.beizi.ad.internal.e r0 = r1.f7096h
            int r0 = r0.e()
            return r0
    }

    public int getAdWidth() {
            r1 = this;
            com.beizi.ad.internal.e r0 = r1.f7096h
            int r0 = r0.d()
            return r0
    }

    public int getAutoRefreshInterval() {
            r1 = this;
            int r0 = r1.p
            return r0
    }

    public boolean getExpandsToFitScreenWidth() {
            r1 = this;
            boolean r0 = r1.t
            return r0
    }

    @Override // com.beizi.ad.internal.a
    public com.beizi.ad.internal.k getMediaType() {
            r1 = this;
            android.view.ViewGroup r0 = r1.a
            if (r0 == 0) goto L7
            com.beizi.ad.internal.k r0 = com.beizi.ad.internal.k.a
            return r0
        L7:
            com.beizi.ad.internal.k r0 = com.beizi.ad.internal.k.f7002d
            return r0
    }

    public boolean getResizeAdToFitContainer() {
            r1 = this;
            boolean r0 = r1.u
            return r0
    }

    public boolean getShouldReloadOnResume() {
            r1 = this;
            boolean r0 = r1.r
            return r0
    }

    public com.beizi.ad.internal.animation.g getTransitionDirection() {
            r1 = this;
            com.beizi.ad.internal.animation.Animator r0 = r1.w
            com.beizi.ad.internal.animation.g r0 = r0.getTransitionDirection()
            return r0
    }

    public long getTransitionDuration() {
            r2 = this;
            com.beizi.ad.internal.animation.Animator r0 = r2.w
            long r0 = r0.getTransitionDuration()
            return r0
    }

    public com.beizi.ad.internal.animation.h getTransitionType() {
            r1 = this;
            com.beizi.ad.internal.animation.Animator r0 = r1.w
            com.beizi.ad.internal.animation.h r0 = r0.getTransitionType()
            return r0
    }

    void h() {
            r1 = this;
            com.beizi.ad.internal.d r0 = r1.mAdFetcher
            r0.a()
            r0 = 0
            r1.q = r0
            return
    }

    protected void i() {
            r2 = this;
            r0 = 0
            r2.m = r0
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            if (r0 == 0) goto L19
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            int r1 = r2.n
            r0.height = r1
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            int r1 = r2.o
            r0.width = r1
        L19:
            return
    }

    public boolean isAutoRefresh() {
            r1 = this;
            boolean r0 = r1.z
            return r0
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl
    public boolean loadAd(com.beizi.ad.internal.f.a.C0104a r1) {
            r0 = this;
            boolean r1 = super.loadAd(r1)
            if (r1 == 0) goto La
            r1 = 1
            r0.q = r1
            return r1
        La:
            r1 = 0
            return r1
    }

    @Override // com.beizi.ad.internal.view.AdViewImpl, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r3, int r4, int r5, int r6, int r7) {
            r2 = this;
            super.onLayout(r3, r4, r5, r6, r7)
            r0 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            boolean r1 = r3.f7092d
            if (r1 == 0) goto L11
            r4 = 0
            r3.f7092d = r4
            return
        L11:
            boolean r1 = r3.v
            if (r1 == 0) goto L17
            if (r4 == 0) goto L5a
        L17:
            com.beizi.ad.internal.h r4 = com.beizi.ad.internal.h.a()
            int r5 = r7 - r5
            float r5 = (float) r5
            float r7 = r4.g()
            float r5 = r5 / r7
            r7 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 + r7
            int r5 = (int) r5
            int r6 = r0 - r6
            float r6 = (float) r6
            float r4 = r4.h()
            float r6 = r6 / r4
            float r6 = r6 + r7
            int r4 = (int) r6
            com.beizi.ad.internal.e r6 = r3.f7096h
            int r6 = r6.d()
            if (r5 < r6) goto L69
            com.beizi.ad.internal.e r6 = r3.f7096h
            int r6 = r6.e()
            if (r4 >= r6) goto L46
            if (r5 <= 0) goto L46
            if (r4 <= 0) goto L46
            goto L69
        L46:
            com.beizi.ad.internal.e r6 = r3.f7096h
            r6.c(r5)
            com.beizi.ad.internal.e r5 = r3.f7096h
            r5.d(r4)
            boolean r4 = r3.v
            if (r4 != 0) goto L57
            r2.c()
        L57:
            r4 = 1
            r3.v = r4
        L5a:
            boolean r4 = r3.q
            if (r4 == 0) goto L73
            r2.k()
            boolean r4 = r3.r
            if (r4 == 0) goto L73
            r2.g()
            return
        L69:
            r2.c()
            com.beizi.ad.internal.d r4 = r3.mAdFetcher
            if (r4 == 0) goto L73
            r4.a()
        L73:
            return
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int r3) {
            r2 = this;
            super.onWindowVisibilityChanged(r3)
            r0 = 0
            if (r3 != 0) goto L3e
            r2.k()
            boolean r3 = r2.q
            if (r3 != 0) goto L15
            boolean r3 = r2.r
            if (r3 != 0) goto L15
            int r3 = r2.p
            if (r3 <= 0) goto L2a
        L15:
            boolean r3 = r2.f7094f
            if (r3 != 0) goto L2a
            boolean r3 = r2.f7092d
            if (r3 != 0) goto L2a
            boolean r3 = r2.a()
            if (r3 != 0) goto L2a
            com.beizi.ad.internal.d r3 = r2.mAdFetcher
            if (r3 == 0) goto L2a
            r2.g()
        L2a:
            r2.f7094f = r0
            android.view.View r3 = r2.getChildAt(r0)
            boolean r3 = r3 instanceof android.webkit.WebView
            if (r3 == 0) goto L64
            android.view.View r3 = r2.getChildAt(r0)
            android.webkit.WebView r3 = (android.webkit.WebView) r3
            com.beizi.ad.internal.h.x.b(r3)
            return
        L3e:
            java.lang.String r3 = "BeiZisAd"
            java.lang.String r1 = "enter onWindowVisibilityChanged before dismantleBroadcast"
            com.beizi.ad.lance.a.m.c(r3, r1)
            r2.m()
            com.beizi.ad.internal.d r3 = r2.mAdFetcher
            if (r3 == 0) goto L53
            boolean r3 = r2.q
            if (r3 == 0) goto L53
            r2.h()
        L53:
            android.view.View r3 = r2.getChildAt(r0)
            boolean r3 = r3 instanceof android.webkit.WebView
            if (r3 == 0) goto L64
            android.view.View r3 = r2.getChildAt(r0)
            android.webkit.WebView r3 = (android.webkit.WebView) r3
            com.beizi.ad.internal.h.x.c(r3)
        L64:
            return
    }

    public void resetContainerIfNeeded() {
            r1 = this;
            boolean r0 = r1.m
            if (r0 == 0) goto L7
            r1.i()
        L7:
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    public void resizeWebViewToFitContainer(int r6, int r7, com.beizi.ad.internal.view.c r8) {
            r5 = this;
            int r0 = r5.getWidth()
            if (r0 > 0) goto Lb
            int r0 = r5.getMeasuredWidth()
            goto Lf
        Lb:
            int r0 = r5.getWidth()
        Lf:
            int r1 = r5.getHeight()
            if (r1 > 0) goto L1a
            int r1 = r5.getMeasuredHeight()
            goto L1e
        L1a:
            int r1 = r5.getHeight()
        L1e:
            if (r1 <= 0) goto L8a
            if (r0 > 0) goto L23
            goto L8a
        L23:
            float r2 = (float) r6
            float r3 = (float) r0
            float r2 = r2 / r3
            float r3 = (float) r7
            float r4 = (float) r1
            float r3 = r3 / r4
            android.view.View r8 = r8.getView()
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L49
            int r6 = r6 * r1
            int r0 = r6 / r7
            boolean r6 = r8 instanceof android.webkit.WebView
            if (r6 == 0) goto L60
            r6 = r8
            android.webkit.WebView r6 = (android.webkit.WebView) r6
            int r2 = r1 * 100
            int r2 = r2 / r7
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r7 = (int) r2
            r6.setInitialScale(r7)
            goto L60
        L49:
            int r7 = r7 * r0
            int r1 = r7 / r6
            boolean r7 = r8 instanceof android.webkit.WebView
            if (r7 == 0) goto L60
            r7 = r8
            android.webkit.WebView r7 = (android.webkit.WebView) r7
            int r2 = r0 * 100
            int r2 = r2 / r6
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r6 = (int) r2
            r7.setInitialScale(r6)
        L60:
            android.view.ViewGroup$LayoutParams r6 = r8.getLayoutParams()
            r7 = 17
            if (r6 != 0) goto L73
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            r6.<init>(r0, r1)
            r6.gravity = r7
            r8.setLayoutParams(r6)
            goto L87
        L73:
            android.view.ViewGroup$LayoutParams r6 = r8.getLayoutParams()
            r6.width = r0
            android.view.ViewGroup$LayoutParams r6 = r8.getLayoutParams()
            r6.height = r1
            android.view.ViewGroup$LayoutParams r6 = r8.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r6 = (android.widget.FrameLayout.LayoutParams) r6
            r6.gravity = r7
        L87:
            r8.invalidate()
        L8a:
            return
    }

    public void setAdAlignment(com.beizi.ad.internal.view.BannerAdViewImpl.a r1) {
            r0 = this;
            r0.B = r1
            return
    }

    public void setAdSize(int r2, int r3) {
            r1 = this;
            com.beizi.ad.internal.e r0 = r1.f7096h
            r0.a(r2)
            com.beizi.ad.internal.e r2 = r1.f7096h
            r2.b(r3)
            return
    }

    public void setAutoRefresh(boolean r1) {
            r0 = this;
            r0.z = r1
            return
    }

    public void setAutoRefreshInterval(int r2) {
            r1 = this;
            if (r2 <= 0) goto Lb
            r0 = 10000(0x2710, float:1.4013E-41)
            int r2 = java.lang.Math.max(r0, r2)
            r1.p = r2
            goto Ld
        Lb:
            r1.p = r2
        Ld:
            com.beizi.ad.internal.d r2 = r1.mAdFetcher
            if (r2 == 0) goto L16
            int r0 = r1.p
            r2.a(r0)
        L16:
            return
    }

    public void setExpandsToFitScreenWidth(boolean r1) {
            r0 = this;
            r0.t = r1
            return
    }

    public void setResizeAdToFitContainer(boolean r1) {
            r0 = this;
            r0.u = r1
            return
    }

    public void setScrollClick(android.view.View.OnTouchListener r2) {
            r1 = this;
            com.beizi.ad.internal.view.AdWebView r0 = r1.y
            if (r0 == 0) goto L7
            r0.setOnTouchListener(r2)
        L7:
            return
    }

    public void setShouldReloadOnResume(boolean r1) {
            r0 = this;
            r0.r = r1
            return
    }

    public void setTransitionDirection(com.beizi.ad.internal.animation.g r2) {
            r1 = this;
            com.beizi.ad.internal.animation.Animator r0 = r1.w
            r0.setTransitionDirection(r2)
            return
    }

    public void setTransitionDuration(long r2) {
            r1 = this;
            com.beizi.ad.internal.animation.Animator r0 = r1.w
            r0.setTransitionDuration(r2)
            return
    }

    public void setTransitionType(com.beizi.ad.internal.animation.h r2) {
            r1 = this;
            com.beizi.ad.internal.animation.Animator r0 = r1.w
            r0.setTransitionType(r2)
            return
    }
}
