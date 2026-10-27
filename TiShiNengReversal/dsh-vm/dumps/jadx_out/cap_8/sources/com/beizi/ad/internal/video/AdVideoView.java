package com.beizi.ad.internal.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AdVideoView extends android.view.TextureView implements android.media.MediaPlayer.OnVideoSizeChangedListener, android.view.TextureView.SurfaceTextureListener, com.beizi.ad.internal.view.c {
    protected android.media.MediaPlayer a;

    /* renamed from: b, reason: collision with root package name */
    protected com.beizi.ad.internal.video.a.b f7054b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7055c;

    /* renamed from: d, reason: collision with root package name */
    private int f7056d;

    /* renamed from: e, reason: collision with root package name */
    private int f7057e;

    /* renamed from: f, reason: collision with root package name */
    private int f7058f;

    /* renamed from: g, reason: collision with root package name */
    private int f7059g;

    /* renamed from: h, reason: collision with root package name */
    private int f7060h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f7061i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f7062j;

    /* renamed from: k, reason: collision with root package name */
    private com.beizi.ad.internal.video.AdVideoView.a f7063k;
    private android.util.Pair<java.lang.String, java.lang.Integer> l;
    private int m;
    public com.beizi.ad.internal.view.AdWebView mAdWebView;
    private long n;
    private float o;
    private float p;
    private boolean q;




    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum a extends java.lang.Enum<com.beizi.ad.internal.video.AdVideoView.a> {
        public static final com.beizi.ad.internal.video.AdVideoView.a a = null;

        /* renamed from: b, reason: collision with root package name */
        public static final com.beizi.ad.internal.video.AdVideoView.a f7065b = null;

        /* renamed from: c, reason: collision with root package name */
        public static final com.beizi.ad.internal.video.AdVideoView.a f7066c = null;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ com.beizi.ad.internal.video.AdVideoView.a[] f7067d = null;

        static {
                com.beizi.ad.internal.video.AdVideoView$a r0 = new com.beizi.ad.internal.video.AdVideoView$a
                java.lang.String r1 = "NRF_NONE"
                r2 = 0
                r0.<init>(r1, r2)
                com.beizi.ad.internal.video.AdVideoView.a.a = r0
                com.beizi.ad.internal.video.AdVideoView$a r1 = new com.beizi.ad.internal.video.AdVideoView$a
                java.lang.String r3 = "NRF_START"
                r4 = 1
                r1.<init>(r3, r4)
                com.beizi.ad.internal.video.AdVideoView.a.f7065b = r1
                com.beizi.ad.internal.video.AdVideoView$a r3 = new com.beizi.ad.internal.video.AdVideoView$a
                java.lang.String r5 = "NRF_PAUSE"
                r6 = 2
                r3.<init>(r5, r6)
                com.beizi.ad.internal.video.AdVideoView.a.f7066c = r3
                r5 = 3
                com.beizi.ad.internal.video.AdVideoView$a[] r5 = new com.beizi.ad.internal.video.AdVideoView.a[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                com.beizi.ad.internal.video.AdVideoView.a.f7067d = r5
                return
        }

        a(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.beizi.ad.internal.video.AdVideoView.a valueOf(java.lang.String r1) {
                java.lang.Class<com.beizi.ad.internal.video.AdVideoView$a> r0 = com.beizi.ad.internal.video.AdVideoView.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.beizi.ad.internal.video.AdVideoView$a r1 = (com.beizi.ad.internal.video.AdVideoView.a) r1
                return r1
        }

        public static com.beizi.ad.internal.video.AdVideoView.a[] values() {
                com.beizi.ad.internal.video.AdVideoView$a[] r0 = com.beizi.ad.internal.video.AdVideoView.a.f7067d
                java.lang.Object r0 = r0.clone()
                com.beizi.ad.internal.video.AdVideoView$a[] r0 = (com.beizi.ad.internal.video.AdVideoView.a[]) r0
                return r0
        }
    }

    public AdVideoView(com.beizi.ad.internal.view.AdWebView r3) {
            r2 = this;
            android.content.MutableContextWrapper r0 = new android.content.MutableContextWrapper
            android.content.Context r1 = r3.getContextFromMutableContext()
            r0.<init>(r1)
            r2.<init>(r0)
            r0 = 0
            r2.f7055c = r0
            r2.f7061i = r0
            r2.f7062j = r0
            com.beizi.ad.internal.video.AdVideoView$a r0 = com.beizi.ad.internal.video.AdVideoView.a.a
            r2.f7063k = r0
            r0 = 0
            r2.l = r0
            com.beizi.ad.internal.video.a$b r0 = com.beizi.ad.internal.video.a.b.f7081d
            r2.f7054b = r0
            r0 = -1
            r2.m = r0
            r2.mAdWebView = r3
            return
    }

    private static float a(float r1) {
            com.beizi.ad.internal.h r0 = com.beizi.ad.internal.h.a()
            android.util.DisplayMetrics r0 = r0.j()
            float r0 = r0.density
            float r1 = r1 / r0
            return r1
    }

    private static float a(float r0, float r1, float r2, float r3) {
            float r0 = r0 - r2
            float r1 = r1 - r3
            float r0 = r0 * r0
            float r1 = r1 * r1
            float r0 = r0 + r1
            double r0 = (double) r0
            double r0 = java.lang.Math.sqrt(r0)
            float r0 = (float) r0
            float r0 = a(r0)
            return r0
    }

    static /* synthetic */ int a(com.beizi.ad.internal.video.AdVideoView r0, int r1) {
            r0.m = r1
            return r1
    }

    static /* synthetic */ android.util.Pair a(com.beizi.ad.internal.video.AdVideoView r0) {
            android.util.Pair<java.lang.String, java.lang.Integer> r0 = r0.l
            return r0
    }

    static /* synthetic */ com.beizi.ad.internal.video.AdVideoView.a a(com.beizi.ad.internal.video.AdVideoView r0, com.beizi.ad.internal.video.AdVideoView.a r1) {
            r0.f7063k = r1
            return r1
    }

    private void a() {
            r1 = this;
            android.media.MediaPlayer r0 = r1.a
            if (r0 != 0) goto L12
            android.media.MediaPlayer r0 = new android.media.MediaPlayer
            r0.<init>()
            r1.a = r0
            r0.setOnVideoSizeChangedListener(r1)
            r1.setSurfaceTextureListener(r1)
            return
        L12:
            r1.reset()
            return
    }

    private void a(int r4, int r5) {
            r3 = this;
            if (r4 == 0) goto L27
            if (r5 != 0) goto L5
            goto L27
        L5:
            com.beizi.ad.internal.video.a$c r0 = new com.beizi.ad.internal.video.a$c
            int r1 = r3.getWidth()
            int r2 = r3.getHeight()
            r0.<init>(r1, r2)
            com.beizi.ad.internal.video.a$c r1 = new com.beizi.ad.internal.video.a$c
            r1.<init>(r4, r5)
            com.beizi.ad.internal.video.a r4 = new com.beizi.ad.internal.video.a
            r4.<init>(r0, r1)
            com.beizi.ad.internal.video.a$b r5 = r3.f7054b
            android.graphics.Matrix r4 = r4.a(r5)
            if (r4 == 0) goto L27
            r3.setTransform(r4)
        L27:
            return
    }

    private void a(java.util.HashMap r7) {
            r6 = this;
            r0 = 10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "coin"
            boolean r3 = r7.isEmpty()
            if (r3 == 0) goto L10
            goto L234
        L10:
            java.lang.String r3 = "SCALE"
            boolean r4 = r7.containsKey(r3)
            if (r4 == 0) goto L1f7
            java.lang.Object r3 = r7.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r3.getClass()
            int r4 = r3.hashCode()
            r5 = -1
            switch(r4) {
                case -2092301763: goto L161;
                case -1943089714: goto L155;
                case -1923874824: goto L149;
                case -1792626435: goto L13d;
                case -1629510025: goto L131;
                case -1130639214: goto L125;
                case -1092027392: goto L119;
                case -1025888925: goto L10d;
                case -1006674035: goto Lff;
                case -440887238: goto Lf1;
                case -438941894: goto Le7;
                case -188276732: goto Ld9;
                case -172377086: goto Lcb;
                case -128849043: goto Lbd;
                case 378209945: goto Laf;
                case 384437857: goto La1;
                case 743229044: goto L94;
                case 1093733475: goto L87;
                case 1218764914: goto L7a;
                case 1477882197: goto L6d;
                case 1648362059: goto L60;
                case 1677322022: goto L53;
                case 1841570796: goto L46;
                case 1984282709: goto L39;
                case 2074054159: goto L2c;
                default: goto L29;
            }
        L29:
            r0 = -1
            goto L16c
        L2c:
            java.lang.String r0 = "FIT_XY"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L35
            goto L29
        L35:
            r0 = 24
            goto L16c
        L39:
            java.lang.String r0 = "CENTER"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L42
            goto L29
        L42:
            r0 = 23
            goto L16c
        L46:
            java.lang.String r0 = "LEFT_BOTTOM_CROP"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L4f
            goto L29
        L4f:
            r0 = 22
            goto L16c
        L53:
            java.lang.String r0 = "CENTER_INSIDE"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L5c
            goto L29
        L5c:
            r0 = 21
            goto L16c
        L60:
            java.lang.String r0 = "CENTER_TOP"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L69
            goto L29
        L69:
            r0 = 20
            goto L16c
        L6d:
            java.lang.String r0 = "CENTER_BOTTOM"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L76
            goto L29
        L76:
            r0 = 19
            goto L16c
        L7a:
            java.lang.String r0 = "RIGHT_TOP"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L83
            goto L29
        L83:
            r0 = 18
            goto L16c
        L87:
            java.lang.String r0 = "FIT_CENTER"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L90
            goto L29
        L90:
            r0 = 17
            goto L16c
        L94:
            java.lang.String r0 = "FIT_START"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L9d
            goto L29
        L9d:
            r0 = 16
            goto L16c
        La1:
            java.lang.String r0 = "RIGHT_BOTTOM_CROP"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto Lab
            goto L29
        Lab:
            r0 = 15
            goto L16c
        Laf:
            java.lang.String r0 = "START_INSIDE"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto Lb9
            goto L29
        Lb9:
            r0 = 14
            goto L16c
        Lbd:
            java.lang.String r0 = "FIT_END"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto Lc7
            goto L29
        Lc7:
            r0 = 13
            goto L16c
        Lcb:
            java.lang.String r0 = "LEFT_CENTER_CROP"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto Ld5
            goto L29
        Ld5:
            r0 = 12
            goto L16c
        Ld9:
            java.lang.String r0 = "CENTER_TOP_CROP"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto Le3
            goto L29
        Le3:
            r0 = 11
            goto L16c
        Le7:
            java.lang.String r4 = "CENTER_BOTTOM_CROP"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L16c
            goto L29
        Lf1:
            java.lang.String r0 = "CENTER_CROP"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto Lfb
            goto L29
        Lfb:
            r0 = 9
            goto L16c
        Lff:
            java.lang.String r0 = "LEFT_CENTER"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L109
            goto L29
        L109:
            r0 = 8
            goto L16c
        L10d:
            java.lang.String r0 = "LEFT_BOTTOM"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L117
            goto L29
        L117:
            r0 = 7
            goto L16c
        L119:
            java.lang.String r0 = "END_INSIDE"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L123
            goto L29
        L123:
            r0 = 6
            goto L16c
        L125:
            java.lang.String r0 = "LEFT_TOP_CROP"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L12f
            goto L29
        L12f:
            r0 = 5
            goto L16c
        L131:
            java.lang.String r0 = "RIGHT_CENTER_CROP"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L13b
            goto L29
        L13b:
            r0 = 4
            goto L16c
        L13d:
            java.lang.String r0 = "LEFT_TOP"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L147
            goto L29
        L147:
            r0 = 3
            goto L16c
        L149:
            java.lang.String r0 = "RIGHT_CENTER"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L153
            goto L29
        L153:
            r0 = 2
            goto L16c
        L155:
            java.lang.String r0 = "RIGHT_BOTTOM"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L15f
            goto L29
        L15f:
            r0 = 1
            goto L16c
        L161:
            java.lang.String r0 = "RIGHT_TOP_CROP"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L16b
            goto L29
        L16b:
            r0 = 0
        L16c:
            switch(r0) {
                case 0: goto L1f3;
                case 1: goto L1ee;
                case 2: goto L1e9;
                case 3: goto L1e4;
                case 4: goto L1df;
                case 5: goto L1da;
                case 6: goto L1d5;
                case 7: goto L1d0;
                case 8: goto L1cb;
                case 9: goto L1c6;
                case 10: goto L1c1;
                case 11: goto L1bc;
                case 12: goto L1b7;
                case 13: goto L1b2;
                case 14: goto L1ad;
                case 15: goto L1a8;
                case 16: goto L1a3;
                case 17: goto L19e;
                case 18: goto L199;
                case 19: goto L193;
                case 20: goto L18d;
                case 21: goto L187;
                case 22: goto L181;
                case 23: goto L17b;
                case 24: goto L175;
                default: goto L16f;
            }
        L16f:
            com.beizi.ad.internal.video.a$b r0 = com.beizi.ad.internal.video.a.b.f7081d
            r6.f7054b = r0
            goto L1f7
        L175:
            com.beizi.ad.internal.video.a$b r0 = com.beizi.ad.internal.video.a.b.f7079b
            r6.f7054b = r0
            goto L1f7
        L17b:
            com.beizi.ad.internal.video.a$b r0 = com.beizi.ad.internal.video.a.b.f7087j
            r6.f7054b = r0
            goto L1f7
        L181:
            com.beizi.ad.internal.video.a$b r0 = com.beizi.ad.internal.video.a.b.q
            r6.f7054b = r0
            goto L1f7
        L187:
            com.beizi.ad.internal.video.a$b r0 = com.beizi.ad.internal.video.a.b.y
            r6.f7054b = r0
            goto L1f7
        L18d:
            com.beizi.ad.internal.video.a$b r0 = com.beizi.ad.internal.video.a.b.f7086i
            r6.f7054b = r0
            goto L1f7
        L193:
            com.beizi.ad.internal.video.a$b r0 = com.beizi.ad.internal.video.a.b.f7088k
            r6.f7054b = r0
            goto L1f7
        L199:
            com.beizi.ad.internal.video.a$b r0 = com.beizi.ad.internal.video.a.b.l
            r6.f7054b = r0
            goto L1f7
        L19e:
            com.beizi.ad.internal.video.a$b r0 = com.beizi.ad.internal.video.a.b.f7081d
            r6.f7054b = r0
            goto L1f7
        L1a3:
            com.beizi.ad.internal.video.a$b r0 = com.beizi.ad.internal.video.a.b.f7080c
            r6.f7054b = r0
            goto L1f7
        L1a8:
            com.beizi.ad.internal.video.a$b r0 = com.beizi.ad.internal.video.a.b.w
            r6.f7054b = r0
            goto L1f7
        L1ad:
            com.beizi.ad.internal.video.a$b r0 = com.beizi.ad.internal.video.a.b.x
            r6.f7054b = r0
            goto L1f7
        L1b2:
            com.beizi.ad.internal.video.a$b r0 = com.beizi.ad.internal.video.a.b.f7082e
            r6.f7054b = r0
            goto L1f7
        L1b7:
            com.beizi.ad.internal.video.a$b r0 = com.beizi.ad.internal.video.a.b.p
            r6.f7054b = r0
            goto L1f7
        L1bc:
            com.beizi.ad.internal.video.a$b r0 = com.beizi.ad.internal.video.a.b.r
            r6.f7054b = r0
            goto L1f7
        L1c1:
            com.beizi.ad.internal.video.a$b r0 = com.beizi.ad.internal.video.a.b.t
            r6.f7054b = r0
            goto L1f7
        L1c6:
            com.beizi.ad.internal.video.a$b r0 = com.beizi.ad.internal.video.a.b.s
            r6.f7054b = r0
            goto L1f7
        L1cb:
            com.beizi.ad.internal.video.a$b r0 = com.beizi.ad.internal.video.a.b.f7084g
            r6.f7054b = r0
            goto L1f7
        L1d0:
            com.beizi.ad.internal.video.a$b r0 = com.beizi.ad.internal.video.a.b.f7085h
            r6.f7054b = r0
            goto L1f7
        L1d5:
            com.beizi.ad.internal.video.a$b r0 = com.beizi.ad.internal.video.a.b.z
            r6.f7054b = r0
            goto L1f7
        L1da:
            com.beizi.ad.internal.video.a$b r0 = com.beizi.ad.internal.video.a.b.o
            r6.f7054b = r0
            goto L1f7
        L1df:
            com.beizi.ad.internal.video.a$b r0 = com.beizi.ad.internal.video.a.b.v
            r6.f7054b = r0
            goto L1f7
        L1e4:
            com.beizi.ad.internal.video.a$b r0 = com.beizi.ad.internal.video.a.b.f7083f
            r6.f7054b = r0
            goto L1f7
        L1e9:
            com.beizi.ad.internal.video.a$b r0 = com.beizi.ad.internal.video.a.b.m
            r6.f7054b = r0
            goto L1f7
        L1ee:
            com.beizi.ad.internal.video.a$b r0 = com.beizi.ad.internal.video.a.b.n
            r6.f7054b = r0
            goto L1f7
        L1f3:
            com.beizi.ad.internal.video.a$b r0 = com.beizi.ad.internal.video.a.b.u
            r6.f7054b = r0
        L1f7:
            java.lang.String r0 = "REWARD_ITEM"
            boolean r3 = r7.containsKey(r0)
            if (r3 == 0) goto L234
            java.lang.Object r7 = r7.get(r0)
            java.lang.String r7 = (java.lang.String) r7
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L22e
            r0.<init>(r7)     // Catch: org.json.JSONException -> L22e
            java.lang.String r7 = "type"
            java.lang.String r7 = r0.optString(r7)     // Catch: org.json.JSONException -> L22e
            java.lang.String r3 = "amount"
            int r0 = r0.optInt(r3)     // Catch: org.json.JSONException -> L22e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: org.json.JSONException -> L22e
            boolean r3 = android.text.TextUtils.isEmpty(r7)     // Catch: org.json.JSONException -> L22e
            if (r3 != 0) goto L227
            android.util.Pair r7 = android.util.Pair.create(r7, r0)     // Catch: org.json.JSONException -> L22e
            r6.l = r7     // Catch: org.json.JSONException -> L22e
            return
        L227:
            android.util.Pair r7 = android.util.Pair.create(r2, r1)     // Catch: org.json.JSONException -> L22e
            r6.l = r7     // Catch: org.json.JSONException -> L22e
            return
        L22e:
            android.util.Pair r7 = android.util.Pair.create(r2, r1)
            r6.l = r7
        L234:
            return
    }

    static /* synthetic */ int b(com.beizi.ad.internal.video.AdVideoView r0) {
            int r0 = r0.m
            return r0
    }

    private void b(int r1, int r2) {
            r0 = this;
            if (r1 != 0) goto Lb
            if (r2 != 0) goto Lb
            r0.onResume()
            r1 = 1
            r0.f7061i = r1
            return
        Lb:
            r0.onPause()
            r1 = 0
            r0.f7061i = r1
            return
    }

    static /* synthetic */ boolean c(com.beizi.ad.internal.video.AdVideoView r0) {
            boolean r0 = r0.f7061i
            return r0
    }

    private void setDataSource(@androidx.annotation.NonNull android.content.res.AssetFileDescriptor r7) throws java.io.IOException {
            r6 = this;
            java.io.FileDescriptor r1 = r7.getFileDescriptor()
            long r2 = r7.getStartOffset()
            long r4 = r7.getLength()
            r0 = r6
            r0.setDataSource(r1, r2, r4)
            r7.close()
            return
    }

    @Override // com.beizi.ad.internal.view.c
    public void destroy() {
            r0 = this;
            r0.stop()
            com.beizi.ad.internal.h.u.a(r0)
            return
    }

    @Override // com.beizi.ad.internal.view.c
    public boolean failed() {
            r1 = this;
            boolean r0 = r1.f7055c
            return r0
    }

    public com.beizi.ad.internal.view.AdWebView getAdWebView() {
            r1 = this;
            com.beizi.ad.internal.view.AdWebView r0 = r1.mAdWebView
            return r0
    }

    @Override // com.beizi.ad.internal.view.c
    public int getCreativeHeight() {
            r1 = this;
            int r0 = r1.f7059g
            return r0
    }

    public int getCreativeLeft() {
            r1 = this;
            int r0 = r1.f7056d
            return r0
    }

    public int getCreativeTop() {
            r1 = this;
            int r0 = r1.f7057e
            return r0
    }

    @Override // com.beizi.ad.internal.view.c
    public int getCreativeWidth() {
            r1 = this;
            int r0 = r1.f7058f
            return r0
    }

    public int getCurrentPosition() {
            r1 = this;
            android.media.MediaPlayer r0 = r1.a
            int r0 = r0.getCurrentPosition()
            return r0
    }

    public int getDuration() {
            r1 = this;
            android.media.MediaPlayer r0 = r1.a
            int r0 = r0.getDuration()
            return r0
    }

    @Override // com.beizi.ad.internal.view.c
    public int getRefreshInterval() {
            r1 = this;
            int r0 = r1.f7060h
            return r0
    }

    public int getVideoHeight() {
            r1 = this;
            android.media.MediaPlayer r0 = r1.a
            int r0 = r0.getVideoHeight()
            return r0
    }

    public int getVideoWidth() {
            r1 = this;
            android.media.MediaPlayer r0 = r1.a
            int r0 = r0.getVideoWidth()
            return r0
    }

    @Override // com.beizi.ad.internal.view.c
    public android.view.View getView() {
            r0 = this;
            return r0
    }

    public boolean isLooping() {
            r1 = this;
            android.media.MediaPlayer r0 = r1.a
            boolean r0 = r0.isLooping()
            return r0
    }

    public boolean isPlaying() {
            r1 = this;
            android.media.MediaPlayer r0 = r1.a
            boolean r0 = r0.isPlaying()
            return r0
    }

    @Override // com.beizi.ad.internal.view.c
    public void onDestroy() {
            r0 = this;
            r0.destroy()
            return
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            android.media.MediaPlayer r0 = r1.a
            if (r0 != 0) goto L8
            return
        L8:
            boolean r0 = r1.isPlaying()
            if (r0 == 0) goto L11
            r1.stop()
        L11:
            r1.release()
            return
    }

    @Override // com.beizi.ad.internal.view.c
    public void onPause() {
            r2 = this;
            com.beizi.ad.internal.video.AdVideoView$a r0 = r2.f7063k
            com.beizi.ad.internal.video.AdVideoView$a r1 = com.beizi.ad.internal.video.AdVideoView.a.f7065b
            if (r0 != r1) goto Ld
            r2.pause()
            com.beizi.ad.internal.video.AdVideoView$a r0 = com.beizi.ad.internal.video.AdVideoView.a.f7066c
            r2.f7063k = r0
        Ld:
            return
    }

    @Override // com.beizi.ad.internal.view.c
    public void onResume() {
            r2 = this;
            com.beizi.ad.internal.video.AdVideoView$a r0 = r2.f7063k
            com.beizi.ad.internal.video.AdVideoView$a r1 = com.beizi.ad.internal.video.AdVideoView.a.f7066c
            if (r0 != r1) goto Le
            r0 = 1
            r2.start(r0)
            com.beizi.ad.internal.video.AdVideoView$a r0 = com.beizi.ad.internal.video.AdVideoView.a.f7065b
            r2.f7063k = r0
        Le:
            return
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture r1, int r2, int r3) {
            r0 = this;
            android.view.Surface r2 = new android.view.Surface
            r2.<init>(r1)
            android.media.MediaPlayer r1 = r0.a
            if (r1 == 0) goto Lc
            r1.setSurface(r2)
        Lc:
            return
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture r1, int r2, int r3) {
            r0 = this;
            return
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture r1) {
            r0 = this;
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r8) {
            r7 = this;
            int r0 = r8.getAction()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L69
            if (r0 == r1) goto L2b
            r3 = 2
            if (r0 == r3) goto Le
            goto L67
        Le:
            boolean r0 = r7.q
            if (r0 == 0) goto L67
            float r0 = r7.o
            float r3 = r7.p
            float r4 = r8.getX()
            float r5 = r8.getY()
            float r0 = a(r0, r3, r4, r5)
            r3 = 1097859072(0x41700000, float:15.0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L67
            r7.q = r2
            goto L67
        L2b:
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r7.n
            long r3 = r3 - r5
            r5 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L67
            boolean r0 = r7.q
            if (r0 == 0) goto L67
            com.beizi.ad.internal.view.AdWebView r0 = r7.mAdWebView
            if (r0 == 0) goto L67
            com.beizi.ad.internal.view.AdViewImpl r0 = r0.adViewImpl
            if (r0 == 0) goto L67
            com.beizi.ad.internal.c r0 = r0.getAdDispatcher()
            if (r0 == 0) goto L67
            com.beizi.ad.internal.view.AdWebView r0 = r7.mAdWebView
            com.beizi.ad.internal.view.AdViewImpl r0 = r0.adViewImpl
            int r3 = r0.clickCount
            int r3 = r3 + r1
            r0.clickCount = r3
            com.beizi.ad.internal.c r0 = r0.getAdDispatcher()
            r0.d()
            com.beizi.ad.internal.view.AdWebView r0 = r7.mAdWebView
            com.beizi.ad.internal.f.c r3 = r0.ad
            com.beizi.ad.internal.view.AdViewImpl r0 = r0.adViewImpl
            boolean r0 = r0.getOpensNativeBrowser()
            r3.a(r0)
        L67:
            r0 = 0
            goto L7e
        L69:
            long r3 = java.lang.System.currentTimeMillis()
            r7.n = r3
            float r0 = r8.getX()
            r7.o = r0
            float r0 = r8.getY()
            r7.p = r0
            r7.q = r1
            r0 = 1
        L7e:
            boolean r8 = super.onTouchEvent(r8)
            if (r8 != 0) goto L88
            if (r0 == 0) goto L87
            goto L88
        L87:
            return r2
        L88:
            return r1
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(android.media.MediaPlayer r1, int r2, int r3) {
            r0 = this;
            return
    }

    @Override // android.view.TextureView, android.view.View
    public void onVisibilityChanged(android.view.View r1, int r2) {
            r0 = this;
            super.onVisibilityChanged(r1, r2)
            int r1 = r0.getWindowVisibility()
            r0.b(r1, r2)
            return
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int r2) {
            r1 = this;
            super.onWindowVisibilityChanged(r2)
            int r0 = r1.getVisibility()
            r1.b(r2, r0)
            return
    }

    public void pause() {
            r1 = this;
            android.media.MediaPlayer r0 = r1.a
            if (r0 == 0) goto Le
            r0.pause()
            com.beizi.ad.internal.view.AdWebView r0 = r1.mAdWebView
            com.beizi.ad.internal.f.c r0 = r0.ad
            r0.a(r1)
        Le:
            return
    }

    public void prepare() throws java.io.IOException, java.lang.IllegalStateException {
            r1 = this;
            r0 = 0
            r1.prepare(r0)
            return
    }

    public void prepare(@androidx.annotation.Nullable android.media.MediaPlayer.OnPreparedListener r2) throws java.io.IOException, java.lang.IllegalStateException {
            r1 = this;
            android.media.MediaPlayer r0 = r1.a
            r0.setOnPreparedListener(r2)
            android.media.MediaPlayer r2 = r1.a
            r2.prepare()
            return
    }

    public void prepareAsync() throws java.lang.IllegalStateException {
            r1 = this;
            r0 = 0
            r1.prepareAsync(r0)
            return
    }

    public void prepareAsync(@androidx.annotation.Nullable android.media.MediaPlayer.OnPreparedListener r2) throws java.lang.IllegalStateException {
            r1 = this;
            android.media.MediaPlayer r0 = r1.a
            r0.setOnPreparedListener(r2)
            android.media.MediaPlayer r2 = r1.a
            r2.prepareAsync()
            return
    }

    public void release() {
            r1 = this;
            r1.reset()
            android.media.MediaPlayer r0 = r1.a
            r0.release()
            r0 = 0
            r1.a = r0
            return
    }

    public void reset() {
            r1 = this;
            android.media.MediaPlayer r0 = r1.a
            r0.reset()
            return
    }

    public void seekTo(int r2) {
            r1 = this;
            android.media.MediaPlayer r0 = r1.a
            if (r0 == 0) goto L7
            r0.seekTo(r2)
        L7:
            return
    }

    public void setAssetData(@androidx.annotation.NonNull java.lang.String r2) throws java.io.IOException {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.content.res.AssetManager r0 = r0.getAssets()
            android.content.res.AssetFileDescriptor r2 = r0.openFd(r2)
            r1.setDataSource(r2)
            return
    }

    public void setCreativeLeft(int r1) {
            r0 = this;
            r0.f7056d = r1
            return
    }

    public void setCreativeTop(int r1) {
            r0 = this;
            r0.f7057e = r1
            return
    }

    public void setDataSource(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull android.net.Uri r3) throws java.io.IOException {
            r1 = this;
            r1.a()
            android.media.MediaPlayer r0 = r1.a
            r0.setDataSource(r2, r3)
            return
    }

    public void setDataSource(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull android.net.Uri r3, @androidx.annotation.Nullable java.util.Map<java.lang.String, java.lang.String> r4) throws java.io.IOException {
            r1 = this;
            r1.a()
            android.media.MediaPlayer r0 = r1.a
            r0.setDataSource(r2, r3, r4)
            return
    }

    public void setDataSource(@androidx.annotation.NonNull java.io.FileDescriptor r2) throws java.io.IOException {
            r1 = this;
            r1.a()
            android.media.MediaPlayer r0 = r1.a
            r0.setDataSource(r2)
            return
    }

    public void setDataSource(@androidx.annotation.NonNull java.io.FileDescriptor r7, long r8, long r10) throws java.io.IOException {
            r6 = this;
            r6.a()
            android.media.MediaPlayer r0 = r6.a
            r1 = r7
            r2 = r8
            r4 = r10
            r0.setDataSource(r1, r2, r4)
            return
    }

    public void setDataSource(@androidx.annotation.NonNull java.lang.String r2) throws java.io.IOException {
            r1 = this;
            r1.a()
            android.media.MediaPlayer r0 = r1.a
            r0.setDataSource(r2)
            return
    }

    public void setLooping(boolean r2) {
            r1 = this;
            android.media.MediaPlayer r0 = r1.a
            if (r0 == 0) goto L7
            r0.setLooping(r2)
        L7:
            return
    }

    public void setOnCompletionListener(@androidx.annotation.Nullable android.media.MediaPlayer.OnCompletionListener r2) {
            r1 = this;
            android.media.MediaPlayer r0 = r1.a
            r0.setOnCompletionListener(r2)
            return
    }

    public void setOnErrorListener(@androidx.annotation.Nullable android.media.MediaPlayer.OnErrorListener r2) {
            r1 = this;
            android.media.MediaPlayer r0 = r1.a
            r0.setOnErrorListener(r2)
            return
    }

    public void setOnInfoListener(@androidx.annotation.Nullable android.media.MediaPlayer.OnInfoListener r2) {
            r1 = this;
            android.media.MediaPlayer r0 = r1.a
            r0.setOnInfoListener(r2)
            return
    }

    public void setRawData(@androidx.annotation.RawRes int r2) throws java.io.IOException {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            android.content.res.AssetFileDescriptor r2 = r0.openRawResourceFd(r2)
            r1.setDataSource(r2)
            return
    }

    public void setRefreshInterval(int r1) {
            r0 = this;
            r0.f7060h = r1
            return
    }

    public void setScalableType(com.beizi.ad.internal.video.a.b r2) {
            r1 = this;
            r1.f7054b = r2
            int r2 = r1.getVideoWidth()
            int r0 = r1.getVideoHeight()
            r1.a(r2, r0)
            return
    }

    public void setVolume(float r2, float r3) {
            r1 = this;
            android.media.MediaPlayer r0 = r1.a
            if (r0 == 0) goto L7
            r0.setVolume(r2, r3)
        L7:
            return
    }

    public void start(int r2) {
            r1 = this;
            android.media.MediaPlayer r0 = r1.a
            if (r0 == 0) goto Le
            r0.start()
            com.beizi.ad.internal.view.AdWebView r0 = r1.mAdWebView
            com.beizi.ad.internal.f.c r0 = r0.ad
            r0.a(r1, r2)
        Le:
            return
    }

    public void stop() {
            r1 = this;
            android.media.MediaPlayer r0 = r1.a
            if (r0 == 0) goto L7
            r0.stop()
        L7:
            return
    }

    public boolean toggleMute() {
            r2 = this;
            boolean r0 = r2.f7062j
            r1 = r0 ^ 1
            r2.f7062j = r1
            if (r0 != 0) goto Ld
            r0 = 0
            r2.setVolume(r0, r0)
            goto L12
        Ld:
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.setVolume(r0, r0)
        L12:
            boolean r0 = r2.f7062j
            return r0
    }

    public void transferAd(com.beizi.ad.internal.view.AdWebView r8, java.lang.String r9) {
            r7 = this;
            boolean r0 = com.beizi.ad.internal.h.o.a(r9)
            if (r0 == 0) goto L7
            return
        L7:
            int r0 = r8.getCreativeHeight()
            r7.f7059g = r0
            int r0 = r8.getCreativeWidth()
            r7.f7058f = r0
            int r0 = r8.getCreativeTop()
            r7.f7057e = r0
            int r0 = r8.getCreativeLeft()
            r7.f7056d = r0
            int r0 = r8.getRefreshInterval()
            r7.f7060h = r0
            java.net.URI r0 = new java.net.URI     // Catch: java.lang.Throwable -> L108
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L108
            com.beizi.ad.internal.video.a$b r0 = com.beizi.ad.internal.video.a.b.f7081d
            r7.f7054b = r0
            java.util.HashMap r0 = r8.getAdExtras()
            r7.a(r0)
            com.beizi.ad.internal.h r0 = com.beizi.ad.internal.h.a()     // Catch: java.lang.Throwable -> L104
            com.beizi.ad.internal.i.f r0 = r0.b()     // Catch: java.lang.Throwable -> L104
            com.beizi.ad.internal.h r1 = com.beizi.ad.internal.h.a()     // Catch: java.lang.Throwable -> L104
            android.content.Context r1 = r1.e()     // Catch: java.lang.Throwable -> L104
            boolean r1 = com.beizi.ad.internal.h.s.a(r1)     // Catch: java.lang.Throwable -> L104
            if (r1 != 0) goto L5e
            com.beizi.ad.internal.view.AdWebView r1 = r7.mAdWebView     // Catch: java.lang.Throwable -> L104
            boolean r1 = r1.IsVideoWifiOnly()     // Catch: java.lang.Throwable -> L104
            if (r1 == 0) goto L5e
            boolean r1 = r0.b(r9)     // Catch: java.lang.Throwable -> L104
            if (r1 == 0) goto L5a
            goto L5e
        L5a:
            r7.failed()     // Catch: java.lang.Throwable -> L104
            return
        L5e:
            java.lang.String r9 = r0.a(r9)     // Catch: java.lang.Throwable -> L104
            r7.setDataSource(r9)     // Catch: java.lang.Throwable -> L104
            boolean r9 = r8.isMuted()
            r7.f7062j = r9
            if (r9 == 0) goto L72
            r9 = 0
            r7.setVolume(r9, r9)
            goto L77
        L72:
            r9 = 1065353216(0x3f800000, float:1.0)
            r7.setVolume(r9, r9)
        L77:
            com.beizi.ad.internal.h r9 = com.beizi.ad.internal.h.a()
            float r9 = r9.g()
            com.beizi.ad.internal.h r0 = com.beizi.ad.internal.h.a()
            float r0 = r0.h()
            int r1 = r7.getCreativeWidth()
            r2 = 1
            r3 = 1056964608(0x3f000000, float:0.5)
            if (r1 != r2) goto L99
            int r1 = r7.getCreativeHeight()
            if (r1 != r2) goto L99
            r1 = -1
            r2 = -1
            goto Lae
        L99:
            int r1 = r7.getCreativeWidth()
            float r1 = (float) r1
            float r1 = r1 * r9
            float r1 = r1 + r3
            int r1 = (int) r1
            int r2 = r7.getCreativeHeight()
            float r2 = (float) r2
            float r2 = r2 * r0
            float r2 = r2 + r3
            int r2 = (int) r2
            r6 = r2
            r2 = r1
            r1 = r6
        Lae:
            int r4 = r7.getCreativeLeft()
            if (r4 != 0) goto Lc5
            int r4 = r7.getCreativeTop()
            if (r4 != 0) goto Lc5
            android.widget.FrameLayout$LayoutParams r9 = new android.widget.FrameLayout$LayoutParams
            r0 = 17
            r9.<init>(r2, r1, r0)
            r7.setLayoutParams(r9)
            goto Leb
        Lc5:
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r5 = 8388659(0x800033, float:1.1755015E-38)
            r4.<init>(r2, r1, r5)
            int r1 = r7.getCreativeTop()
            float r1 = (float) r1
            float r1 = r1 * r0
            float r1 = r1 + r3
            int r0 = (int) r1
            int r1 = r7.getCreativeLeft()
            float r1 = (float) r1
            float r1 = r1 * r9
            float r1 = r1 + r3
            int r9 = (int) r1
            r1 = 0
            r4.setMargins(r9, r0, r1, r1)
            r7.setLayoutParams(r4)
            com.beizi.ad.internal.video.a$b r9 = com.beizi.ad.internal.video.a.b.f7080c
            r7.setScalableType(r9)
        Leb:
            com.beizi.ad.internal.video.AdVideoView$1 r9 = new com.beizi.ad.internal.video.AdVideoView$1
            r9.<init>(r7, r8)
            r7.setOnCompletionListener(r9)
            com.beizi.ad.internal.video.AdVideoView$2 r8 = new com.beizi.ad.internal.video.AdVideoView$2
            r8.<init>(r7)
            r7.setOnInfoListener(r8)
            com.beizi.ad.internal.video.AdVideoView$3 r8 = new com.beizi.ad.internal.video.AdVideoView$3
            r8.<init>(r7)
            r7.prepareAsync(r8)
            return
        L104:
            r7.failed()
            return
        L108:
            r7.failed()
            return
    }

    @Override // com.beizi.ad.internal.view.c
    public void visible() {
            r9 = this;
            com.beizi.ad.internal.view.AdWebView r0 = r9.mAdWebView
            r1 = 0
            r0.setVisibility(r1)
            com.beizi.ad.internal.view.AdWebView r0 = r9.mAdWebView
            com.beizi.ad.internal.view.AdViewImpl r0 = r0.adViewImpl
            r0.showAdLogo(r9)
            com.beizi.ad.internal.view.AdWebView r0 = r9.mAdWebView
            if (r0 == 0) goto L9f
            boolean r0 = r0.shouldDisplayButton()
            if (r0 == 0) goto L9f
            com.beizi.ad.internal.view.AdWebView r0 = r9.mAdWebView
            com.beizi.ad.internal.view.AdViewImpl r2 = r0.adViewImpl
            if (r2 == 0) goto L75
            int r0 = r0.getAutoCloseTime()
            int r3 = r9.m
            r2 = 1
            if (r0 <= r3) goto L47
            com.beizi.ad.internal.view.AdWebView r0 = r9.mAdWebView
            r4 = 1
            com.beizi.ad.internal.view.AdViewImpl r2 = r0.adViewImpl
            int r0 = r0.getShowCloseBtnTime()
            int r5 = r9.m
            com.beizi.ad.internal.view.AdWebView r6 = r9.mAdWebView
            com.beizi.ad.internal.f.c r6 = r6.ad
            com.beizi.ad.model.f$a r6 = r6.x()
            com.beizi.ad.model.f$a r7 = com.beizi.ad.model.f.a.f7423b
            if (r6 != r7) goto L41
            r7 = 1
        L3e:
            r6 = r9
            r4 = r0
            goto L43
        L41:
            r7 = 0
            goto L3e
        L43:
            r2.addCloseButton(r3, r4, r5, r6, r7)
            goto L76
        L47:
            r4 = 1
            r6 = r9
            com.beizi.ad.internal.view.AdWebView r0 = r6.mAdWebView
            com.beizi.ad.internal.view.AdViewImpl r2 = r0.adViewImpl
            int r0 = r0.getShowCloseBtnTime()
            com.beizi.ad.internal.view.AdWebView r5 = r6.mAdWebView
            int r5 = r5.getAutoCloseTime()
            com.beizi.ad.internal.view.AdWebView r7 = r6.mAdWebView
            com.beizi.ad.internal.f.c r7 = r7.ad
            com.beizi.ad.model.f$a r7 = r7.x()
            com.beizi.ad.model.f$a r8 = com.beizi.ad.model.f.a.f7423b
            if (r7 != r8) goto L66
            r7 = 1
        L64:
            r4 = r0
            goto L68
        L66:
            r7 = 0
            goto L64
        L68:
            r2.addCloseButton(r3, r4, r5, r6, r7)
            com.beizi.ad.internal.view.AdWebView r0 = r6.mAdWebView
            com.beizi.ad.internal.view.AdViewImpl r0 = r0.adViewImpl
            boolean r1 = r6.f7062j
            r0.addMuteButton(r9, r1)
            goto L76
        L75:
            r6 = r9
        L76:
            com.beizi.ad.internal.view.AdWebView r0 = r6.mAdWebView
            com.beizi.ad.internal.view.AdViewImpl r0 = r0.adViewImpl
            if (r0 == 0) goto La0
            com.beizi.ad.internal.c r0 = r0.getAdDispatcher()
            if (r0 == 0) goto La0
            com.beizi.ad.internal.view.AdWebView r0 = r6.mAdWebView
            com.beizi.ad.internal.view.AdViewImpl r0 = r0.adViewImpl
            com.beizi.ad.internal.c r0 = r0.getAdDispatcher()
            r0.a()
            com.beizi.ad.internal.view.AdWebView r0 = r6.mAdWebView
            com.beizi.ad.internal.f.c r1 = r0.ad
            com.beizi.ad.internal.view.AdViewImpl r0 = r0.adViewImpl
            com.beizi.ad.internal.e r0 = r0.getAdParameters()
            java.lang.String r0 = r0.a()
            r1.a(r9, r0)
            return
        L9f:
            r6 = r9
        La0:
            return
    }
}
