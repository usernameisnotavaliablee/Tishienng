package com.bytedance.adsdk.lottie;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class LottieAnimationView extends android.widget.ImageView {
    private static final java.lang.String j = "LottieAnimationView";
    private static final com.bytedance.adsdk.lottie.oq<java.lang.Throwable> xt = null;
    private org.json.JSONArray a;
    private final com.bytedance.adsdk.lottie.tl ae;
    private com.bytedance.adsdk.lottie.m av;
    private com.bytedance.adsdk.lottie.jy<com.bytedance.adsdk.lottie.m> az;
    private int ch;
    private final com.bytedance.adsdk.lottie.oq<com.bytedance.adsdk.lottie.m> cw;
    private int f;

    @com.bytedance.component.sdk.annotation.RawRes
    private int g;
    private com.bytedance.adsdk.lottie.LottieAnimationView.j h;
    private final android.os.Handler i;
    private final java.util.Set<com.bytedance.adsdk.lottie.LottieAnimationView.r> jy;
    private long kt;

    /* renamed from: l, reason: collision with root package name */
    private final java.lang.Runnable f1746l;

    /* renamed from: m, reason: collision with root package name */
    private int f1747m;
    private android.os.Handler mi;
    private boolean oq;

    /* renamed from: p, reason: collision with root package name */
    private com.bytedance.adsdk.lottie.LottieAnimationView.xt f1748p;
    private boolean qv;

    /* renamed from: r, reason: collision with root package name */
    private final com.bytedance.adsdk.lottie.oq<java.lang.Throwable> f1749r;

    /* renamed from: s, reason: collision with root package name */
    private java.lang.String f1750s;
    private com.bytedance.adsdk.lottie.model.layer.m tj;
    private java.lang.String tl;
    private com.bytedance.adsdk.lottie.oq<java.lang.Throwable> up;

    /* renamed from: v, reason: collision with root package name */
    private int f1751v;
    private boolean vl;

    /* renamed from: w, reason: collision with root package name */
    private int f1752w;
    private final java.util.Set<java.lang.Object> ws;

    /* renamed from: x, reason: collision with root package name */
    private int f1753x;









    /* renamed from: com.bytedance.adsdk.lottie.LottieAnimationView$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] j = null;

        static {
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.adsdk.lottie.LottieAnimationView.AnonymousClass5.j = r0
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.bytedance.adsdk.lottie.LottieAnimationView.AnonymousClass5.j     // Catch: java.lang.NoSuchFieldError -> L1d
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.bytedance.adsdk.lottie.LottieAnimationView.AnonymousClass5.j     // Catch: java.lang.NoSuchFieldError -> L28
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.bytedance.adsdk.lottie.LottieAnimationView.AnonymousClass5.j     // Catch: java.lang.NoSuchFieldError -> L33
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }

        public AnonymousClass5() {
                r1 = this;
                r1.<init>()
                return
        }
    }





    private static class cw extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<com.bytedance.adsdk.lottie.LottieAnimationView.cw> CREATOR = null;
        int ae;
        float cw;
        java.lang.String j;

        /* renamed from: m, reason: collision with root package name */
        int f1755m;

        /* renamed from: r, reason: collision with root package name */
        boolean f1756r;
        java.lang.String up;
        int xt;


        static {
                com.bytedance.adsdk.lottie.LottieAnimationView$cw$1 r0 = new com.bytedance.adsdk.lottie.LottieAnimationView$cw$1
                r0.<init>()
                com.bytedance.adsdk.lottie.LottieAnimationView.cw.CREATOR = r0
                return
        }

        private cw(android.os.Parcel r3) {
                r2 = this;
                r2.<init>(r3)
                java.lang.String r0 = r3.readString()
                r2.j = r0
                float r0 = r3.readFloat()
                r2.cw = r0
                int r0 = r3.readInt()
                r1 = 1
                if (r0 != r1) goto L17
                goto L18
            L17:
                r1 = 0
            L18:
                r2.f1756r = r1
                java.lang.String r0 = r3.readString()
                r2.up = r0
                int r0 = r3.readInt()
                r2.f1755m = r0
                int r3 = r3.readInt()
                r2.ae = r3
                return
        }

        /* synthetic */ cw(android.os.Parcel r1, com.bytedance.adsdk.lottie.LottieAnimationView.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        cw(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                java.lang.String r2 = r0.j
                r1.writeString(r2)
                float r2 = r0.cw
                r1.writeFloat(r2)
                boolean r2 = r0.f1756r
                r1.writeInt(r2)
                java.lang.String r2 = r0.up
                r1.writeString(r2)
                int r2 = r0.f1755m
                r1.writeInt(r2)
                int r2 = r0.ae
                r1.writeInt(r2)
                return
        }
    }

    public interface j {
        void j(java.util.Map<java.lang.String, java.lang.Object> r1);

        void xt(java.util.Map<java.lang.String, java.lang.Object> r1);
    }

    private enum r extends java.lang.Enum<com.bytedance.adsdk.lottie.LottieAnimationView.r> {
        private static final /* synthetic */ com.bytedance.adsdk.lottie.LottieAnimationView.r[] ae = null;
        public static final com.bytedance.adsdk.lottie.LottieAnimationView.r cw = null;
        public static final com.bytedance.adsdk.lottie.LottieAnimationView.r j = null;

        /* renamed from: m, reason: collision with root package name */
        public static final com.bytedance.adsdk.lottie.LottieAnimationView.r f1757m = null;

        /* renamed from: r, reason: collision with root package name */
        public static final com.bytedance.adsdk.lottie.LottieAnimationView.r f1758r = null;
        public static final com.bytedance.adsdk.lottie.LottieAnimationView.r up = null;
        public static final com.bytedance.adsdk.lottie.LottieAnimationView.r xt = null;

        static {
                com.bytedance.adsdk.lottie.LottieAnimationView$r r0 = new com.bytedance.adsdk.lottie.LottieAnimationView$r
                java.lang.String r1 = "SET_ANIMATION"
                r2 = 0
                r0.<init>(r1, r2)
                com.bytedance.adsdk.lottie.LottieAnimationView.r.j = r0
                com.bytedance.adsdk.lottie.LottieAnimationView$r r1 = new com.bytedance.adsdk.lottie.LottieAnimationView$r
                java.lang.String r3 = "SET_PROGRESS"
                r4 = 1
                r1.<init>(r3, r4)
                com.bytedance.adsdk.lottie.LottieAnimationView.r.xt = r1
                com.bytedance.adsdk.lottie.LottieAnimationView$r r3 = new com.bytedance.adsdk.lottie.LottieAnimationView$r
                java.lang.String r5 = "SET_REPEAT_MODE"
                r6 = 2
                r3.<init>(r5, r6)
                com.bytedance.adsdk.lottie.LottieAnimationView.r.cw = r3
                com.bytedance.adsdk.lottie.LottieAnimationView$r r5 = new com.bytedance.adsdk.lottie.LottieAnimationView$r
                java.lang.String r7 = "SET_REPEAT_COUNT"
                r8 = 3
                r5.<init>(r7, r8)
                com.bytedance.adsdk.lottie.LottieAnimationView.r.f1758r = r5
                com.bytedance.adsdk.lottie.LottieAnimationView$r r7 = new com.bytedance.adsdk.lottie.LottieAnimationView$r
                java.lang.String r9 = "SET_IMAGE_ASSETS"
                r10 = 4
                r7.<init>(r9, r10)
                com.bytedance.adsdk.lottie.LottieAnimationView.r.up = r7
                com.bytedance.adsdk.lottie.LottieAnimationView$r r9 = new com.bytedance.adsdk.lottie.LottieAnimationView$r
                java.lang.String r11 = "PLAY_OPTION"
                r12 = 5
                r9.<init>(r11, r12)
                com.bytedance.adsdk.lottie.LottieAnimationView.r.f1757m = r9
                r11 = 6
                com.bytedance.adsdk.lottie.LottieAnimationView$r[] r11 = new com.bytedance.adsdk.lottie.LottieAnimationView.r[r11]
                r11[r2] = r0
                r11[r4] = r1
                r11[r6] = r3
                r11[r8] = r5
                r11[r10] = r7
                r11[r12] = r9
                com.bytedance.adsdk.lottie.LottieAnimationView.r.ae = r11
                return
        }

        r(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.bytedance.adsdk.lottie.LottieAnimationView.r valueOf(java.lang.String r1) {
                java.lang.Class<com.bytedance.adsdk.lottie.LottieAnimationView$r> r0 = com.bytedance.adsdk.lottie.LottieAnimationView.r.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.bytedance.adsdk.lottie.LottieAnimationView$r r1 = (com.bytedance.adsdk.lottie.LottieAnimationView.r) r1
                return r1
        }

        public static com.bytedance.adsdk.lottie.LottieAnimationView.r[] values() {
                com.bytedance.adsdk.lottie.LottieAnimationView$r[] r0 = com.bytedance.adsdk.lottie.LottieAnimationView.r.ae
                java.lang.Object r0 = r0.clone()
                com.bytedance.adsdk.lottie.LottieAnimationView$r[] r0 = (com.bytedance.adsdk.lottie.LottieAnimationView.r[]) r0
                return r0
        }
    }

    public interface xt {
        void j(java.lang.String r1, org.json.JSONArray r2);
    }

    static {
            com.bytedance.adsdk.lottie.LottieAnimationView$1 r0 = new com.bytedance.adsdk.lottie.LottieAnimationView$1
            r0.<init>()
            com.bytedance.adsdk.lottie.LottieAnimationView.xt = r0
            return
    }

    public LottieAnimationView(android.content.Context r3) {
            r2 = this;
            r2.<init>(r3)
            com.bytedance.adsdk.lottie.LottieAnimationView$6 r3 = new com.bytedance.adsdk.lottie.LottieAnimationView$6
            r3.<init>(r2)
            r2.cw = r3
            com.bytedance.adsdk.lottie.LottieAnimationView$7 r3 = new com.bytedance.adsdk.lottie.LottieAnimationView$7
            r3.<init>(r2)
            r2.f1749r = r3
            r3 = 0
            r2.f1747m = r3
            com.bytedance.adsdk.lottie.tl r0 = new com.bytedance.adsdk.lottie.tl
            r0.<init>(r2)
            r2.ae = r0
            r2.oq = r3
            r2.qv = r3
            r0 = 1
            r2.vl = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r2.jy = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r2.ws = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.i = r0
            r2.f1752w = r3
            r0 = 0
            r2.kt = r0
            com.bytedance.adsdk.lottie.LottieAnimationView$4 r3 = new com.bytedance.adsdk.lottie.LottieAnimationView$4
            r3.<init>(r2)
            r2.f1746l = r3
            r2.g()
            return
    }

    static /* synthetic */ int ae(com.bytedance.adsdk.lottie.LottieAnimationView r0) {
            int r0 = r0.f1752w
            return r0
    }

    static /* synthetic */ int av(com.bytedance.adsdk.lottie.LottieAnimationView r0) {
            int r0 = r0.f
            return r0
    }

    private void av() {
            r4 = this;
            android.os.Handler r0 = r4.i
            java.lang.Runnable r1 = r4.f1746l
            r2 = 1000(0x3e8, double:4.94E-321)
            r0.postDelayed(r1, r2)
            return
    }

    private void az() {
            r9 = this;
            com.bytedance.adsdk.lottie.m r0 = r9.av
            if (r0 == 0) goto Lda
            com.bytedance.adsdk.lottie.tl r0 = r9.ae
            if (r0 == 0) goto Lda
            com.bytedance.adsdk.lottie.kt r0 = r0.ch()
            com.bytedance.adsdk.lottie.m r1 = r9.av
            com.bytedance.adsdk.lottie.m$r r1 = r1.tl()
            if (r1 == 0) goto Lda
            if (r0 == 0) goto Lda
            int r2 = r1.j
            java.lang.String r3 = "TMe"
            if (r2 >= 0) goto L2a
            java.lang.String r0 = "--==--- timer fail, ke is invalid: "
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.lang.String r0 = r0.concat(r1)
            com.bytedance.sdk.component.utils.vl.j(r3, r0)
            return
        L2a:
            int[] r4 = r1.up
            r5 = -1
            if (r4 == 0) goto L3a
            int r6 = r4.length
            r7 = 2
            if (r6 < r7) goto L3a
            r6 = 0
            r6 = r4[r6]
            r7 = 1
            r4 = r4[r7]
            goto L3c
        L3a:
            r4 = -1
            r6 = -1
        L3c:
            java.lang.String r7 = r1.cw
            java.lang.String r7 = r0.j(r7)
            java.lang.String r8 = r1.f1823r
            java.lang.String r0 = r0.j(r8)
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.NumberFormatException -> L53
            int r5 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L51
            goto L58
        L51:
            r0 = move-exception
            goto L55
        L53:
            r0 = move-exception
            r7 = -1
        L55:
            com.bytedance.sdk.component.utils.vl.j(r0)
        L58:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r8 = "--==--- prepare timer, startS: "
            r0.<init>(r8)
            r0.append(r7)
            java.lang.String r8 = ", lenS: "
            r0.append(r8)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.bytedance.sdk.component.utils.vl.j(r3, r0)
            java.lang.String r0 = r1.xt
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lc7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r8 = "--==--- timer, id:"
            r0.<init>(r8)
            java.lang.String r8 = r1.xt
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.bytedance.sdk.component.utils.vl.j(r3, r0)
            java.lang.String r0 = r1.xt
            com.bytedance.adsdk.lottie.model.layer.m r0 = r9.cw(r0)
            if (r0 == 0) goto Lda
            java.lang.String r8 = "--==--- timer success"
            com.bytedance.sdk.component.utils.vl.j(r3, r8)
            java.lang.String r3 = r1.f1822m
            r9.f1750s = r3
            org.json.JSONArray r1 = r1.ae
            r9.a = r1
            r9.tj = r0
            r9.f = r7
            int r1 = r7 - r5
            r9.f1751v = r1
            r9.f1753x = r6
            r9.ch = r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r3 = r9.f
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.j(r1)
            com.bytedance.adsdk.lottie.LottieAnimationView$3 r0 = new com.bytedance.adsdk.lottie.LottieAnimationView$3
            r0.<init>(r9, r2, r7, r5)
            r9.j(r0)
            goto Lda
        Lc7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "--==--- timer fail, id is invalid: "
            r0.<init>(r2)
            java.lang.String r1 = r1.xt
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.sdk.component.utils.vl.j(r3, r0)
        Lda:
            return
    }

    static /* synthetic */ void az(com.bytedance.adsdk.lottie.LottieAnimationView r0) {
            r0.av()
            return
    }

    private com.bytedance.adsdk.lottie.model.layer.m cw(java.lang.String r3) {
            r2 = this;
            com.bytedance.adsdk.lottie.tl r0 = r2.ae
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.bytedance.adsdk.lottie.model.layer.r r0 = r0.cw()
            if (r0 != 0) goto Ld
            return r1
        Ld:
            com.bytedance.adsdk.lottie.model.layer.m r3 = r2.j(r0, r3)
            return r3
    }

    private void cw(android.graphics.Matrix r1, float r2, float r3, float r4, float r5) {
            r0 = this;
            float r2 = r2 - r4
            r4 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r4
            float r3 = r3 - r5
            float r3 = r3 / r4
            r1.postTranslate(r2, r3)
            return
    }

    static /* synthetic */ void cw(com.bytedance.adsdk.lottie.LottieAnimationView r0) {
            r0.az()
            return
    }

    static /* synthetic */ java.lang.String f(com.bytedance.adsdk.lottie.LottieAnimationView r0) {
            java.lang.String r0 = r0.f1750s
            return r0
    }

    static /* synthetic */ com.bytedance.adsdk.lottie.LottieAnimationView.xt g(com.bytedance.adsdk.lottie.LottieAnimationView r0) {
            com.bytedance.adsdk.lottie.LottieAnimationView$xt r0 = r0.f1748p
            return r0
    }

    private void g() {
            r5 = this;
            r0 = 0
            r5.setSaveEnabled(r0)
            r1 = 1
            r5.vl = r1
            r5.setFallbackResource(r0)
            java.lang.String r2 = ""
            r5.setImageAssetsFolder(r2)
            r2 = 0
            r5.j(r2, r0)
            android.content.Context r3 = r5.getContext()
            android.content.Context r3 = r3.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            r5.j(r0, r3)
            r5.setIgnoreDisabledSystemAnimations(r0)
            com.bytedance.adsdk.lottie.tl r3 = r5.ae
            android.content.Context r4 = r5.getContext()
            float r4 = com.bytedance.adsdk.lottie.up.g.j(r4)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 == 0) goto L34
            r0 = 1
        L34:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.j(r0)
            r5.oq()
            r5.qv()
            r5.jy()
            return
    }

    private com.bytedance.adsdk.lottie.m.j getArea() {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            if (r0 == 0) goto Lf
            com.bytedance.adsdk.lottie.m r0 = r0.a()
            if (r0 == 0) goto Lf
            com.bytedance.adsdk.lottie.m$j r0 = r0.oq()
            return r0
        Lf:
            r0 = 0
            return r0
    }

    private com.bytedance.adsdk.lottie.m.xt getGlobalConfig() {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            if (r0 == 0) goto Lf
            com.bytedance.adsdk.lottie.m r0 = r0.a()
            if (r0 == 0) goto Lf
            com.bytedance.adsdk.lottie.m$xt r0 = r0.vl()
            return r0
        Lf:
            r0 = 0
            return r0
    }

    private com.bytedance.adsdk.lottie.m.cw getGlobalEvent() {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            if (r0 == 0) goto Lf
            com.bytedance.adsdk.lottie.m r0 = r0.a()
            if (r0 == 0) goto Lf
            com.bytedance.adsdk.lottie.m$cw r0 = r0.qv()
            return r0
        Lf:
            r0 = 0
            return r0
    }

    private java.lang.String getPlayDelayedELExpressTimeS() {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            if (r0 == 0) goto Lf
            com.bytedance.adsdk.lottie.m r0 = r0.a()
            if (r0 == 0) goto Lf
            java.lang.String r0 = r0.g()
            return r0
        Lf:
            r0 = 0
            return r0
    }

    static /* synthetic */ int i(com.bytedance.adsdk.lottie.LottieAnimationView r0) {
            int r0 = r0.f1751v
            return r0
    }

    private void i() {
            r2 = this;
            android.os.Handler r0 = r2.i
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            return
    }

    static /* synthetic */ int j(com.bytedance.adsdk.lottie.LottieAnimationView r0) {
            int r0 = r0.f1747m
            return r0
    }

    static /* synthetic */ android.os.Handler j(com.bytedance.adsdk.lottie.LottieAnimationView r0, android.os.Handler r1) {
            r0.mi = r1
            return r1
    }

    private com.bytedance.adsdk.lottie.g j(java.lang.String r3) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            com.bytedance.adsdk.lottie.tl r0 = r2.ae
            if (r0 == 0) goto L1f
            com.bytedance.adsdk.lottie.m r0 = r0.a()
            if (r0 == 0) goto L1f
            java.util.Map r0 = r0.i()
            if (r0 == 0) goto L1f
            java.lang.Object r3 = r0.get(r3)
            com.bytedance.adsdk.lottie.g r3 = (com.bytedance.adsdk.lottie.g) r3
            return r3
        L1f:
            return r1
    }

    private com.bytedance.adsdk.lottie.jy<com.bytedance.adsdk.lottie.m> j(@com.bytedance.component.sdk.annotation.RawRes int r3) {
            r2 = this;
            boolean r0 = r2.isInEditMode()
            if (r0 == 0) goto L12
            com.bytedance.adsdk.lottie.jy r0 = new com.bytedance.adsdk.lottie.jy
            com.bytedance.adsdk.lottie.LottieAnimationView$13 r1 = new com.bytedance.adsdk.lottie.LottieAnimationView$13
            r1.<init>(r2, r3)
            r3 = 1
            r0.<init>(r1, r3)
            return r0
        L12:
            boolean r0 = r2.vl
            if (r0 == 0) goto L1f
            android.content.Context r0 = r2.getContext()
            com.bytedance.adsdk.lottie.jy r3 = com.bytedance.adsdk.lottie.ae.j(r0, r3)
            return r3
        L1f:
            android.content.Context r0 = r2.getContext()
            r1 = 0
            com.bytedance.adsdk.lottie.jy r3 = com.bytedance.adsdk.lottie.ae.j(r0, r3, r1)
            return r3
    }

    private com.bytedance.adsdk.lottie.model.layer.cw j(android.view.MotionEvent r3) {
            r2 = this;
            com.bytedance.adsdk.lottie.tl r0 = r2.ae
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.bytedance.adsdk.lottie.model.layer.r r0 = r0.cw()
            if (r0 != 0) goto Ld
            return r1
        Ld:
            com.bytedance.adsdk.lottie.model.layer.cw r3 = r2.j(r0, r3)
            return r3
    }

    private com.bytedance.adsdk.lottie.model.layer.cw j(com.bytedance.adsdk.lottie.model.layer.r r6, android.view.MotionEvent r7) {
            r5 = this;
            java.util.List r6 = r6.ws()
            java.util.Iterator r6 = r6.iterator()
        L8:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L95
            java.lang.Object r0 = r6.next()
            com.bytedance.adsdk.lottie.model.layer.cw r0 = (com.bytedance.adsdk.lottie.model.layer.cw) r0
            boolean r1 = r0 instanceof com.bytedance.adsdk.lottie.model.layer.r
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L4f
            boolean r1 = r0.oq()
            if (r1 == 0) goto L8
            float r1 = r0.tl()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L8
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            android.graphics.Matrix r2 = r0.m()
            r0.j(r1, r2, r3)
            float r2 = r1.width()
            r3 = 1077936128(0x40400000, float:3.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto L8
            float r1 = r1.height()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L8
            com.bytedance.adsdk.lottie.model.layer.r r0 = (com.bytedance.adsdk.lottie.model.layer.r) r0
            com.bytedance.adsdk.lottie.model.layer.cw r0 = r5.j(r0, r7)
            if (r0 == 0) goto L8
            return r0
        L4f:
            boolean r1 = r0.oq()
            if (r1 == 0) goto L8
            float r1 = r0.tl()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L8
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            com.bytedance.adsdk.lottie.tl r2 = r5.ae
            if (r2 == 0) goto L7f
            boolean r2 = r2.tl()
            if (r2 == 0) goto L7f
            android.graphics.Matrix r2 = r0.m()
            r0.j(r1, r2, r3)
            com.bytedance.adsdk.lottie.tl r2 = r5.ae
            android.graphics.RectF r2 = r2.la()
            if (r2 == 0) goto L8e
            r5.j(r1, r2)
            goto L8e
        L7f:
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            android.graphics.Matrix r4 = r0.m()
            r0.j(r2, r4, r3)
            r5.xt(r1, r2)
        L8e:
            boolean r1 = r5.j(r7, r1)
            if (r1 == 0) goto L8
            return r0
        L95:
            r6 = 0
            return r6
    }

    private com.bytedance.adsdk.lottie.model.layer.m j(com.bytedance.adsdk.lottie.model.layer.r r3, java.lang.String r4) {
            r2 = this;
            java.util.List r3 = r3.ws()
            java.util.Iterator r3 = r3.iterator()
        L8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r0 = r3.next()
            com.bytedance.adsdk.lottie.model.layer.cw r0 = (com.bytedance.adsdk.lottie.model.layer.cw) r0
            boolean r1 = r0 instanceof com.bytedance.adsdk.lottie.model.layer.r
            if (r1 == 0) goto L21
            com.bytedance.adsdk.lottie.model.layer.r r0 = (com.bytedance.adsdk.lottie.model.layer.r) r0
            com.bytedance.adsdk.lottie.model.layer.m r0 = r2.j(r0, r4)
            if (r0 == 0) goto L8
            return r0
        L21:
            java.lang.String r1 = r0.qv()
            boolean r1 = android.text.TextUtils.equals(r4, r1)
            if (r1 == 0) goto L8
            boolean r1 = r0 instanceof com.bytedance.adsdk.lottie.model.layer.m
            if (r1 == 0) goto L8
            com.bytedance.adsdk.lottie.model.layer.m r0 = (com.bytedance.adsdk.lottie.model.layer.m) r0
            return r0
        L32:
            r3 = 0
            return r3
    }

    private void j(@com.bytedance.component.sdk.annotation.FloatRange(from = 0.0d, to = 1.0d) float r2, boolean r3) {
            r1 = this;
            if (r3 == 0) goto L9
            java.util.Set<com.bytedance.adsdk.lottie.LottieAnimationView$r> r3 = r1.jy
            com.bytedance.adsdk.lottie.LottieAnimationView$r r0 = com.bytedance.adsdk.lottie.LottieAnimationView.r.xt
            r3.add(r0)
        L9:
            com.bytedance.adsdk.lottie.tl r3 = r1.ae
            r3.r(r2)
            return
    }

    private void j(long r4) {
            r3 = this;
            com.bytedance.adsdk.lottie.m$xt r0 = r3.getGlobalConfig()
            com.bytedance.adsdk.lottie.LottieAnimationView$j r1 = r3.h
            if (r1 == 0) goto L2c
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r2 = "duration"
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.put(r2, r4)
            if (r0 == 0) goto L27
            java.util.Map<java.lang.String, java.lang.Object> r4 = r0.xt
            if (r4 == 0) goto L27
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L27
            java.util.Map<java.lang.String, java.lang.Object> r4 = r0.xt
            r1.putAll(r4)
        L27:
            com.bytedance.adsdk.lottie.LottieAnimationView$j r4 = r3.h
            r4.j(r1)
        L2c:
            return
    }

    private void j(android.graphics.Matrix r5, float r6, float r7, float r8, float r9) {
            r4 = this;
            float r0 = r8 / r9
            float r1 = r6 / r7
            r2 = 0
            r3 = 1073741824(0x40000000, float:2.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L18
            float r7 = r7 / r9
            r5.preScale(r7, r7)
            float r8 = r8 * r7
            float r8 = r8 - r6
            float r8 = r8 / r3
            float r6 = -r8
            r5.postTranslate(r6, r2)
            return
        L18:
            float r6 = r6 / r8
            r5.preScale(r6, r6)
            float r9 = r9 * r6
            float r9 = r9 - r7
            float r9 = r9 / r3
            float r6 = -r9
            r5.postTranslate(r2, r6)
            return
    }

    private void j(android.graphics.RectF r8, android.graphics.RectF r9) {
            r7 = this;
            int r0 = r7.getWidth()
            float r3 = (float) r0
            int r0 = r7.getHeight()
            float r4 = (float) r0
            float r5 = r9.width()
            float r6 = r9.height()
            r9 = 0
            int r0 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r0 == 0) goto L58
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 == 0) goto L58
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 == 0) goto L58
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 != 0) goto L24
            goto L58
        L24:
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>()
            int[] r9 = com.bytedance.adsdk.lottie.LottieAnimationView.AnonymousClass5.j
            android.widget.ImageView$ScaleType r0 = r7.getScaleType()
            int r0 = r0.ordinal()
            r9 = r9[r0]
            r0 = 1
            if (r9 == r0) goto L51
            r0 = 2
            if (r9 == r0) goto L4c
            r0 = 3
            if (r9 == r0) goto L47
            r0 = 4
            if (r9 == r0) goto L42
            goto L55
        L42:
            r1 = r7
            r1.r(r2, r3, r4, r5, r6)
            goto L55
        L47:
            r1 = r7
            r1.cw(r2, r3, r4, r5, r6)
            goto L55
        L4c:
            r1 = r7
            r1.xt(r2, r3, r4, r5, r6)
            goto L55
        L51:
            r1 = r7
            r1.j(r2, r3, r4, r5, r6)
        L55:
            r2.mapRect(r8)
        L58:
            return
    }

    static /* synthetic */ void j(com.bytedance.adsdk.lottie.LottieAnimationView r0, long r1) {
            r0.j(r1)
            return
    }

    private void j(com.bytedance.adsdk.lottie.m.j r4) {
            r3 = this;
            java.lang.String r0 = r4.j
            int r1 = r3.getWidth()
            java.lang.String r2 = "x"
            float r0 = com.bytedance.adsdk.lottie.up.g.j(r2, r0, r1)
            r4.up = r0
            java.lang.String r0 = r4.xt
            int r1 = r3.getHeight()
            java.lang.String r2 = "y"
            float r0 = com.bytedance.adsdk.lottie.up.g.j(r2, r0, r1)
            r4.f1818m = r0
            java.lang.String r0 = r4.cw
            int r1 = r3.getWidth()
            r2 = 0
            float r0 = com.bytedance.adsdk.lottie.up.g.j(r2, r0, r1)
            r4.ae = r0
            java.lang.String r0 = r4.f1819r
            int r1 = r3.getHeight()
            float r0 = com.bytedance.adsdk.lottie.up.g.j(r2, r0, r1)
            r4.tl = r0
            return
    }

    private void j(java.lang.String r3, java.lang.String r4, org.json.JSONArray r5) {
            r2 = this;
            com.bytedance.adsdk.lottie.m$cw r0 = r2.getGlobalEvent()
            if (r0 == 0) goto L2a
            if (r3 == 0) goto L2a
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto L18
            java.lang.String r1 = "CSJNO"
            boolean r1 = r3.contains(r1)
            if (r1 != 0) goto L18
            java.lang.String r4 = r0.j
        L18:
            if (r5 == 0) goto L20
            int r1 = r5.length()
            if (r1 > 0) goto L2a
        L20:
            java.lang.String r1 = "CSJLELNO"
            boolean r3 = r3.contains(r1)
            if (r3 != 0) goto L2a
            org.json.JSONArray r5 = r0.cw
        L2a:
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 == 0) goto L38
            if (r5 == 0) goto L3f
            int r3 = r5.length()
            if (r3 <= 0) goto L3f
        L38:
            com.bytedance.adsdk.lottie.LottieAnimationView$xt r3 = r2.f1748p
            if (r3 == 0) goto L3f
            r3.j(r4, r5)
        L3f:
            return
    }

    private void j(int[][] r5) {
            r4 = this;
            if (r5 == 0) goto L37
            int r0 = r5.length
            if (r0 != 0) goto L6
            goto L37
        L6:
            r0 = 0
            r5 = r5[r0]     // Catch: java.lang.Throwable -> L33
            r0 = r5[r0]     // Catch: java.lang.Throwable -> L33
            r1 = 1
            r5 = r5[r1]     // Catch: java.lang.Throwable -> L33
            if (r0 < 0) goto L37
            if (r5 < 0) goto L37
            java.lang.String r1 = "TMe"
            java.lang.String r2 = "--==--- inel enter, play anim, startframe: "
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = r2.concat(r3)     // Catch: java.lang.Throwable -> L33
            com.bytedance.sdk.component.utils.vl.j(r1, r2)     // Catch: java.lang.Throwable -> L33
            r4.i()     // Catch: java.lang.Throwable -> L33
            r4.j()     // Catch: java.lang.Throwable -> L33
            r4.setFrame(r0)     // Catch: java.lang.Throwable -> L33
            com.bytedance.adsdk.lottie.LottieAnimationView$12 r0 = new com.bytedance.adsdk.lottie.LottieAnimationView$12     // Catch: java.lang.Throwable -> L33
            r0.<init>(r4, r5)     // Catch: java.lang.Throwable -> L33
            r4.j(r0)     // Catch: java.lang.Throwable -> L33
            return
        L33:
            r5 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r5)
        L37:
            return
    }

    private boolean j(android.view.MotionEvent r4, android.graphics.RectF r5) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L28
            if (r5 != 0) goto L6
            goto L28
        L6:
            float r1 = r4.getX()
            float r4 = r4.getY()
            float r2 = r5.left
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L28
            float r2 = r5.right
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L28
            float r1 = r5.top
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 < 0) goto L28
            float r5 = r5.bottom
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L28
            r4 = 1
            return r4
        L28:
            return r0
    }

    static /* synthetic */ android.os.Handler jy(com.bytedance.adsdk.lottie.LottieAnimationView r0) {
            android.os.Handler r0 = r0.mi
            return r0
    }

    private void jy() {
            r1 = this;
            com.bytedance.adsdk.lottie.LottieAnimationView$11 r0 = new com.bytedance.adsdk.lottie.LottieAnimationView$11
            r0.<init>(r1)
            r1.j(r0)
            return
    }

    static /* synthetic */ int kt(com.bytedance.adsdk.lottie.LottieAnimationView r0) {
            int r0 = r0.f1753x
            return r0
    }

    static /* synthetic */ com.bytedance.adsdk.lottie.m.xt m(com.bytedance.adsdk.lottie.LottieAnimationView r0) {
            com.bytedance.adsdk.lottie.m$xt r0 = r0.getGlobalConfig()
            return r0
    }

    static /* synthetic */ com.bytedance.adsdk.lottie.model.layer.m mi(com.bytedance.adsdk.lottie.LottieAnimationView r0) {
            com.bytedance.adsdk.lottie.model.layer.m r0 = r0.tj
            return r0
    }

    private void mi() {
            r2 = this;
            boolean r0 = r2.up()
            r1 = 0
            r2.setImageDrawable(r1)
            com.bytedance.adsdk.lottie.tl r1 = r2.ae
            r2.setImageDrawable(r1)
            if (r0 == 0) goto L14
            com.bytedance.adsdk.lottie.tl r0 = r2.ae
            r0.ws()
        L14:
            return
    }

    static /* synthetic */ long oq(com.bytedance.adsdk.lottie.LottieAnimationView r2) {
            long r0 = r2.kt
            return r0
    }

    private void oq() {
            r1 = this;
            com.bytedance.adsdk.lottie.LottieAnimationView$8 r0 = new com.bytedance.adsdk.lottie.LottieAnimationView$8
            r0.<init>(r1)
            r1.j(r0)
            return
    }

    static /* synthetic */ java.lang.String qv(com.bytedance.adsdk.lottie.LottieAnimationView r0) {
            java.lang.String r0 = r0.getPlayDelayedELExpressTimeS()
            return r0
    }

    private void qv() {
            r1 = this;
            com.bytedance.adsdk.lottie.LottieAnimationView$9 r0 = new com.bytedance.adsdk.lottie.LottieAnimationView$9
            r0.<init>(r1)
            r1.j(r0)
            return
    }

    private void r(android.graphics.Matrix r5, float r6, float r7, float r8, float r9) {
            r4 = this;
            r0 = 1073741824(0x40000000, float:2.0)
            r1 = 0
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 >= 0) goto L2c
            int r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r2 < 0) goto Lc
            goto L2c
        Lc:
            float r2 = r8 / r9
            float r3 = r6 / r7
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto L20
            float r6 = r6 / r8
            r5.preScale(r6, r6)
            float r9 = r9 * r6
            float r7 = r7 - r9
            float r7 = r7 / r0
            r5.postTranslate(r1, r7)
            return
        L20:
            float r7 = r7 / r9
            r5.preScale(r7, r7)
            float r8 = r8 * r7
            float r6 = r6 - r8
            float r6 = r6 / r0
            r5.postTranslate(r6, r1)
            return
        L2c:
            float r2 = r8 / r9
            float r3 = r6 / r7
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto L40
            float r6 = r6 / r8
            r5.preScale(r6, r6)
            float r9 = r9 * r6
            float r7 = r7 - r9
            float r7 = r7 / r0
            r5.postTranslate(r1, r7)
            return
        L40:
            float r7 = r7 / r9
            r5.preScale(r7, r7)
            float r8 = r8 * r7
            float r6 = r6 - r8
            float r6 = r6 / r0
            r5.postTranslate(r6, r1)
            return
    }

    static /* synthetic */ void r(com.bytedance.adsdk.lottie.LottieAnimationView r0) {
            r0.vl()
            return
    }

    private void setCompositionTask(com.bytedance.adsdk.lottie.jy<com.bytedance.adsdk.lottie.m> r3) {
            r2 = this;
            java.util.Set<com.bytedance.adsdk.lottie.LottieAnimationView$r> r0 = r2.jy
            com.bytedance.adsdk.lottie.LottieAnimationView$r r1 = com.bytedance.adsdk.lottie.LottieAnimationView.r.j
            r0.add(r1)
            r2.w()
            r2.ws()
            com.bytedance.adsdk.lottie.oq<com.bytedance.adsdk.lottie.m> r0 = r2.cw
            com.bytedance.adsdk.lottie.jy r3 = r3.j(r0)
            com.bytedance.adsdk.lottie.oq<java.lang.Throwable> r0 = r2.f1749r
            com.bytedance.adsdk.lottie.jy r3 = r3.cw(r0)
            r2.az = r3
            return
    }

    static /* synthetic */ int tj(com.bytedance.adsdk.lottie.LottieAnimationView r0) {
            int r0 = r0.ch
            return r0
    }

    static /* synthetic */ com.bytedance.adsdk.lottie.LottieAnimationView.j tl(com.bytedance.adsdk.lottie.LottieAnimationView r0) {
            com.bytedance.adsdk.lottie.LottieAnimationView$j r0 = r0.h
            return r0
    }

    static /* synthetic */ com.bytedance.adsdk.lottie.oq tl() {
            com.bytedance.adsdk.lottie.oq<java.lang.Throwable> r0 = com.bytedance.adsdk.lottie.LottieAnimationView.xt
            return r0
    }

    static /* synthetic */ int up(com.bytedance.adsdk.lottie.LottieAnimationView r2) {
            int r0 = r2.f1752w
            int r1 = r0 + 1
            r2.f1752w = r1
            return r0
    }

    static /* synthetic */ org.json.JSONArray v(com.bytedance.adsdk.lottie.LottieAnimationView r0) {
            org.json.JSONArray r0 = r0.a
            return r0
    }

    static /* synthetic */ com.bytedance.adsdk.lottie.tl vl(com.bytedance.adsdk.lottie.LottieAnimationView r0) {
            com.bytedance.adsdk.lottie.tl r0 = r0.ae
            return r0
    }

    private void vl() {
            r4 = this;
            com.bytedance.adsdk.lottie.m$xt r0 = r4.getGlobalConfig()
            if (r0 == 0) goto L34
            int r1 = r0.up
            if (r1 <= 0) goto L34
            java.lang.String r1 = r0.f1826m
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L16
            org.json.JSONArray r1 = r0.ae
            if (r1 == 0) goto L34
        L16:
            int r1 = r0.up
            float r2 = (float) r1
            float r3 = r4.getMaxFrame()
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L26
            float r1 = r4.getMaxFrame()
            int r1 = (int) r1
        L26:
            float r1 = (float) r1
            float r2 = r4.getMaxFrame()
            float r1 = r1 / r2
            com.bytedance.adsdk.lottie.LottieAnimationView$10 r2 = new com.bytedance.adsdk.lottie.LottieAnimationView$10
            r2.<init>(r4, r1, r0)
            r4.j(r2)
        L34:
            return
    }

    static /* synthetic */ int w(com.bytedance.adsdk.lottie.LottieAnimationView r2) {
            int r0 = r2.f
            int r1 = r0 + (-1)
            r2.f = r1
            return r0
    }

    private void w() {
            r1 = this;
            r0 = 0
            r1.av = r0
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            r0.qv()
            return
    }

    private void ws() {
            r2 = this;
            com.bytedance.adsdk.lottie.jy<com.bytedance.adsdk.lottie.m> r0 = r2.az
            if (r0 == 0) goto L10
            com.bytedance.adsdk.lottie.oq<com.bytedance.adsdk.lottie.m> r1 = r2.cw
            r0.xt(r1)
            com.bytedance.adsdk.lottie.jy<com.bytedance.adsdk.lottie.m> r0 = r2.az
            com.bytedance.adsdk.lottie.oq<java.lang.Throwable> r1 = r2.f1749r
            r0.r(r1)
        L10:
            return
    }

    static /* synthetic */ boolean ws(com.bytedance.adsdk.lottie.LottieAnimationView r0) {
            boolean r0 = r0.vl
            return r0
    }

    private com.bytedance.adsdk.lottie.jy<com.bytedance.adsdk.lottie.m> xt(java.lang.String r3) {
            r2 = this;
            boolean r0 = r2.isInEditMode()
            if (r0 == 0) goto L12
            com.bytedance.adsdk.lottie.jy r0 = new com.bytedance.adsdk.lottie.jy
            com.bytedance.adsdk.lottie.LottieAnimationView$2 r1 = new com.bytedance.adsdk.lottie.LottieAnimationView$2
            r1.<init>(r2, r3)
            r3 = 1
            r0.<init>(r1, r3)
            return r0
        L12:
            boolean r0 = r2.vl
            if (r0 == 0) goto L1f
            android.content.Context r0 = r2.getContext()
            com.bytedance.adsdk.lottie.jy r3 = com.bytedance.adsdk.lottie.ae.xt(r0, r3)
            return r3
        L1f:
            android.content.Context r0 = r2.getContext()
            r1 = 0
            com.bytedance.adsdk.lottie.jy r3 = com.bytedance.adsdk.lottie.ae.xt(r0, r3, r1)
            return r3
    }

    static /* synthetic */ com.bytedance.adsdk.lottie.oq xt(com.bytedance.adsdk.lottie.LottieAnimationView r0) {
            com.bytedance.adsdk.lottie.oq<java.lang.Throwable> r0 = r0.up
            return r0
    }

    private void xt(android.graphics.Matrix r5, float r6, float r7, float r8, float r9) {
            r4 = this;
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 >= 0) goto L13
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 < 0) goto Lb
            goto L13
        Lb:
            float r6 = r6 - r8
            float r6 = r6 / r0
            float r7 = r7 - r9
            float r7 = r7 / r0
            r5.postTranslate(r6, r7)
            return
        L13:
            float r1 = r8 / r9
            float r2 = r6 / r7
            r3 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L28
            float r6 = r6 / r8
            r5.preScale(r6, r6)
            float r9 = r9 * r6
            float r7 = r7 - r9
            float r7 = r7 / r0
            r5.postTranslate(r3, r7)
            return
        L28:
            float r7 = r7 / r9
            r5.preScale(r7, r7)
            float r8 = r8 * r7
            float r6 = r6 - r8
            float r6 = r6 / r0
            r5.postTranslate(r6, r3)
            return
    }

    private void xt(android.graphics.RectF r8, android.graphics.RectF r9) {
            r7 = this;
            int r0 = r7.getWidth()
            float r3 = (float) r0
            int r0 = r7.getHeight()
            float r4 = (float) r0
            com.bytedance.adsdk.lottie.tl r0 = r7.ae
            android.graphics.Rect r0 = r0.getBounds()
            int r0 = r0.width()
            float r5 = (float) r0
            com.bytedance.adsdk.lottie.tl r0 = r7.ae
            android.graphics.Rect r0 = r0.getBounds()
            int r0 = r0.height()
            float r6 = (float) r0
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 == 0) goto L66
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 == 0) goto L66
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r1 == 0) goto L66
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 != 0) goto L32
            goto L66
        L32:
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>()
            int[] r0 = com.bytedance.adsdk.lottie.LottieAnimationView.AnonymousClass5.j
            android.widget.ImageView$ScaleType r1 = r7.getScaleType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L5f
            r1 = 2
            if (r0 == r1) goto L5a
            r1 = 3
            if (r0 == r1) goto L55
            r1 = 4
            if (r0 == r1) goto L50
            goto L63
        L50:
            r1 = r7
            r1.r(r2, r3, r4, r5, r6)
            goto L63
        L55:
            r1 = r7
            r1.cw(r2, r3, r4, r5, r6)
            goto L63
        L5a:
            r1 = r7
            r1.xt(r2, r3, r4, r5, r6)
            goto L63
        L5f:
            r1 = r7
            r1.j(r2, r3, r4, r5, r6)
        L63:
            r2.mapRect(r8, r9)
        L66:
            return
    }

    @com.bytedance.component.sdk.annotation.MainThread
    public void ae() {
            r1 = this;
            r0 = 0
            r1.qv = r0
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            r0.p()
            return
    }

    public void cw() {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            r0.w()
            return
    }

    public boolean getClipToCompositionBounds() {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            boolean r0 = r0.r()
            return r0
    }

    public com.bytedance.adsdk.lottie.m getComposition() {
            r1 = this;
            com.bytedance.adsdk.lottie.m r0 = r1.av
            return r0
    }

    public long getDuration() {
            r2 = this;
            com.bytedance.adsdk.lottie.m r0 = r2.av
            if (r0 == 0) goto La
            float r0 = r0.up()
            long r0 = (long) r0
            return r0
        La:
            r0 = 0
            return r0
    }

    public int getFrame() {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            int r0 = r0.kt()
            return r0
    }

    public java.lang.String getImageAssetsFolder() {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            java.lang.String r0 = r0.up()
            return r0
    }

    public boolean getMaintainOriginalImageBounds() {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            boolean r0 = r0.m()
            return r0
    }

    public float getMaxFrame() {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            float r0 = r0.av()
            return r0
    }

    public float getMinFrame() {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            float r0 = r0.az()
            return r0
    }

    public com.bytedance.adsdk.lottie.w getPerformanceTracker() {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            com.bytedance.adsdk.lottie.w r0 = r0.g()
            return r0
    }

    @com.bytedance.component.sdk.annotation.FloatRange(from = 0.0d, to = 1.0d)
    public float getProgress() {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            float r0 = r0.h()
            return r0
    }

    public com.bytedance.adsdk.lottie.mi getRenderMode() {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            com.bytedance.adsdk.lottie.mi r0 = r0.ae()
            return r0
    }

    public int getRepeatCount() {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            int r0 = r0.f()
            return r0
    }

    public int getRepeatMode() {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            int r0 = r0.tj()
            return r0
    }

    public float getSpeed() {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            float r0 = r0.i()
            return r0
    }

    @Override // android.view.View
    public void invalidate() {
            r2 = this;
            super.invalidate()
            android.graphics.drawable.Drawable r0 = r2.getDrawable()
            boolean r1 = r0 instanceof com.bytedance.adsdk.lottie.tl
            if (r1 == 0) goto L1a
            com.bytedance.adsdk.lottie.tl r0 = (com.bytedance.adsdk.lottie.tl) r0
            com.bytedance.adsdk.lottie.mi r0 = r0.ae()
            com.bytedance.adsdk.lottie.mi r1 = com.bytedance.adsdk.lottie.mi.cw
            if (r0 != r1) goto L1a
            com.bytedance.adsdk.lottie.tl r0 = r2.ae
            r0.invalidateSelf()
        L1a:
            return
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.getDrawable()
            com.bytedance.adsdk.lottie.tl r1 = r2.ae
            if (r0 != r1) goto Lc
            super.invalidateDrawable(r1)
            return
        Lc:
            super.invalidateDrawable(r3)
            return
    }

    public android.graphics.Bitmap j(java.lang.String r2, android.graphics.Bitmap r3) {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            android.graphics.Bitmap r2 = r0.j(r2, r3)
            return r2
    }

    @com.bytedance.component.sdk.annotation.MainThread
    public void j() {
            r5 = this;
            long r0 = r5.kt
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
            long r0 = android.os.SystemClock.elapsedRealtime()
            r5.kt = r0
        Le:
            java.util.Set<com.bytedance.adsdk.lottie.LottieAnimationView$r> r0 = r5.jy
            com.bytedance.adsdk.lottie.LottieAnimationView$r r1 = com.bytedance.adsdk.lottie.LottieAnimationView.r.f1757m
            r0.add(r1)
            com.bytedance.adsdk.lottie.tl r0 = r5.ae
            r0.vl()
            return
    }

    public void j(android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            r0.j(r2)
            return
    }

    public void j(android.animation.ValueAnimator.AnimatorUpdateListener r2) {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            r0.j(r2)
            return
    }

    public void j(java.io.InputStream r1, java.lang.String r2) {
            r0 = this;
            com.bytedance.adsdk.lottie.jy r1 = com.bytedance.adsdk.lottie.ae.j(r1, r2)
            r0.setCompositionTask(r1)
            return
    }

    public void j(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            byte[] r2 = r2.getBytes()
            r0.<init>(r2)
            r1.j(r0, r3)
            return
    }

    @java.lang.Deprecated
    public void j(boolean r2) {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            if (r2 == 0) goto L6
            r2 = -1
            goto L7
        L6:
            r2 = 0
        L7:
            r0.up(r2)
            return
    }

    public void j(boolean r2, android.content.Context r3) {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            r0.j(r2, r3)
            return
    }

    @com.bytedance.component.sdk.annotation.MainThread
    public void m() {
            r2 = this;
            java.util.Set<com.bytedance.adsdk.lottie.LottieAnimationView$r> r0 = r2.jy
            com.bytedance.adsdk.lottie.LottieAnimationView$r r1 = com.bytedance.adsdk.lottie.LottieAnimationView.r.f1757m
            r0.add(r1)
            com.bytedance.adsdk.lottie.tl r0 = r2.ae
            r0.l()
            return
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            boolean r0 = r1.isInEditMode()
            if (r0 != 0) goto L12
            boolean r0 = r1.qv
            if (r0 == 0) goto L12
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            r0.vl()
        L12:
            return
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            r2.i()
            android.os.Handler r0 = r2.mi
            if (r0 == 0) goto Le
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
        Le:
            r2.r()
            r2.cw()
            r2.m()
            return
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable r3) {
            r2 = this;
            boolean r0 = r3 instanceof com.bytedance.adsdk.lottie.LottieAnimationView.cw
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r3)
            return
        L8:
            com.bytedance.adsdk.lottie.LottieAnimationView$cw r3 = (com.bytedance.adsdk.lottie.LottieAnimationView.cw) r3
            android.os.Parcelable r0 = r3.getSuperState()
            super.onRestoreInstanceState(r0)
            java.lang.String r0 = r3.j
            r2.tl = r0
            java.util.Set<com.bytedance.adsdk.lottie.LottieAnimationView$r> r0 = r2.jy
            com.bytedance.adsdk.lottie.LottieAnimationView$r r1 = com.bytedance.adsdk.lottie.LottieAnimationView.r.j
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L2c
            java.lang.String r0 = r2.tl
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2c
            java.lang.String r0 = r2.tl
            r2.setAnimation(r0)
        L2c:
            int r0 = r3.xt
            r2.g = r0
            java.util.Set<com.bytedance.adsdk.lottie.LottieAnimationView$r> r0 = r2.jy
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L3f
            int r0 = r2.g
            if (r0 == 0) goto L3f
            r2.setAnimation(r0)
        L3f:
            java.util.Set<com.bytedance.adsdk.lottie.LottieAnimationView$r> r0 = r2.jy
            com.bytedance.adsdk.lottie.LottieAnimationView$r r1 = com.bytedance.adsdk.lottie.LottieAnimationView.r.xt
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L4f
            float r0 = r3.cw
            r1 = 0
            r2.j(r0, r1)
        L4f:
            java.util.Set<com.bytedance.adsdk.lottie.LottieAnimationView$r> r0 = r2.jy
            com.bytedance.adsdk.lottie.LottieAnimationView$r r1 = com.bytedance.adsdk.lottie.LottieAnimationView.r.f1757m
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L60
            boolean r0 = r3.f1756r
            if (r0 == 0) goto L60
            r2.j()
        L60:
            java.util.Set<com.bytedance.adsdk.lottie.LottieAnimationView$r> r0 = r2.jy
            com.bytedance.adsdk.lottie.LottieAnimationView$r r1 = com.bytedance.adsdk.lottie.LottieAnimationView.r.up
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L6f
            java.lang.String r0 = r3.up
            r2.setImageAssetsFolder(r0)
        L6f:
            java.util.Set<com.bytedance.adsdk.lottie.LottieAnimationView$r> r0 = r2.jy
            com.bytedance.adsdk.lottie.LottieAnimationView$r r1 = com.bytedance.adsdk.lottie.LottieAnimationView.r.cw
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L7e
            int r0 = r3.f1755m
            r2.setRepeatMode(r0)
        L7e:
            java.util.Set<com.bytedance.adsdk.lottie.LottieAnimationView$r> r0 = r2.jy
            com.bytedance.adsdk.lottie.LottieAnimationView$r r1 = com.bytedance.adsdk.lottie.LottieAnimationView.r.f1758r
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L8d
            int r3 = r3.ae
            r2.setRepeatCount(r3)
        L8d:
            return
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            com.bytedance.adsdk.lottie.LottieAnimationView$cw r1 = new com.bytedance.adsdk.lottie.LottieAnimationView$cw
            r1.<init>(r0)
            java.lang.String r0 = r2.tl
            r1.j = r0
            int r0 = r2.g
            r1.xt = r0
            com.bytedance.adsdk.lottie.tl r0 = r2.ae
            float r0 = r0.h()
            r1.cw = r0
            com.bytedance.adsdk.lottie.tl r0 = r2.ae
            boolean r0 = r0.x()
            r1.f1756r = r0
            com.bytedance.adsdk.lottie.tl r0 = r2.ae
            java.lang.String r0 = r0.up()
            r1.up = r0
            com.bytedance.adsdk.lottie.tl r0 = r2.ae
            int r0 = r0.tj()
            r1.f1755m = r0
            com.bytedance.adsdk.lottie.tl r0 = r2.ae
            int r0 = r0.f()
            r1.ae = r0
            return r1
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r7) {
            r6 = this;
            com.bytedance.adsdk.lottie.m$j r0 = r6.getArea()
            r1 = 0
            if (r0 == 0) goto L7e
            float r2 = r0.up
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L12
            r6.j(r0)
        L12:
            float r2 = r7.getX()
            float r3 = r7.getY()
            float r4 = r0.up
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 < 0) goto L34
            float r5 = r0.ae
            float r4 = r4 + r5
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 > 0) goto L34
            float r4 = r0.f1818m
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 < 0) goto L34
            float r5 = r0.tl
            float r4 = r4 + r5
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 <= 0) goto L7e
        L34:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r4 = "--==--:width: "
            r7.<init>(r4)
            int r4 = r6.getWidth()
            r7.append(r4)
            java.lang.String r4 = ", height: "
            r7.append(r4)
            int r4 = r6.getHeight()
            r7.append(r4)
            java.lang.String r7 = r7.toString()
            java.lang.String r4 = "TMe"
            com.bytedance.sdk.component.utils.vl.j(r4, r7)
            java.lang.String r7 = "--==--:"
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r7 = r7.concat(r0)
            com.bytedance.sdk.component.utils.vl.j(r4, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "--==--:pintx: "
            r7.<init>(r0)
            r7.append(r2)
            java.lang.String r0 = ", pointY: "
            r7.append(r0)
            r7.append(r3)
            java.lang.String r7 = r7.toString()
            com.bytedance.sdk.component.utils.vl.j(r4, r7)
            return r1
        L7e:
            com.bytedance.adsdk.lottie.model.layer.cw r0 = r6.j(r7)
            r2 = 1
            if (r0 == 0) goto Lf4
            java.lang.String r3 = r0.qv()
            boolean r4 = r0 instanceof com.bytedance.adsdk.lottie.model.layer.r
            if (r4 == 0) goto La1
            com.bytedance.adsdk.lottie.m$xt r0 = r6.getGlobalConfig()
            if (r0 == 0) goto L9c
            com.bytedance.adsdk.lottie.m$xt r0 = r6.getGlobalConfig()
            int r0 = r0.j
            if (r0 != r2) goto L9c
            return r1
        L9c:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        La1:
            if (r3 == 0) goto Lae
            java.lang.String r4 = "CSJCLOSE"
            boolean r4 = r3.startsWith(r4)
            if (r4 == 0) goto Lae
            r6.i()
        Lae:
            java.lang.String r0 = r0.ae()
            com.bytedance.adsdk.lottie.g r0 = r6.j(r0)
            if (r0 == 0) goto Le4
            int r4 = r7.getAction()
            if (r4 != r2) goto Le4
            java.lang.String r2 = r0.ae()
            org.json.JSONArray r4 = r0.g()
            r6.j(r3, r2, r4)
            int[][] r0 = r0.tl()
            if (r0 == 0) goto Ld3
            r6.j(r0)
            goto Le4
        Ld3:
            com.bytedance.adsdk.lottie.m$cw r0 = r6.getGlobalEvent()
            if (r0 == 0) goto Le4
            com.bytedance.adsdk.lottie.m$cw r0 = r6.getGlobalEvent()
            int[][] r0 = r0.xt
            if (r0 == 0) goto Le4
            r6.j(r0)
        Le4:
            if (r3 == 0) goto Lef
            java.lang.String r0 = "CSJNTP"
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto Lef
            return r1
        Lef:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        Lf4:
            com.bytedance.adsdk.lottie.m$xt r0 = r6.getGlobalConfig()
            if (r0 == 0) goto L103
            com.bytedance.adsdk.lottie.m$xt r0 = r6.getGlobalConfig()
            int r0 = r0.j
            if (r0 != r2) goto L103
            return r1
        L103:
            boolean r7 = super.onTouchEvent(r7)
            return r7
    }

    public void r() {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            r0.mi()
            return
    }

    public void setAnimation(@com.bytedance.component.sdk.annotation.RawRes int r2) {
            r1 = this;
            r1.g = r2
            r0 = 0
            r1.tl = r0
            com.bytedance.adsdk.lottie.jy r2 = r1.j(r2)
            r1.setCompositionTask(r2)
            return
    }

    public void setAnimation(java.lang.String r2) {
            r1 = this;
            r1.tl = r2
            r0 = 0
            r1.g = r0
            com.bytedance.adsdk.lottie.jy r2 = r1.xt(r2)
            r1.setCompositionTask(r2)
            return
    }

    @java.lang.Deprecated
    public void setAnimationFromJson(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.j(r2, r0)
            return
    }

    public void setAnimationFromUrl(java.lang.String r3) {
            r2 = this;
            boolean r0 = r2.vl
            if (r0 == 0) goto Ld
            android.content.Context r0 = r2.getContext()
            com.bytedance.adsdk.lottie.jy r3 = com.bytedance.adsdk.lottie.ae.j(r0, r3)
            goto L16
        Ld:
            android.content.Context r0 = r2.getContext()
            r1 = 0
            com.bytedance.adsdk.lottie.jy r3 = com.bytedance.adsdk.lottie.ae.j(r0, r3, r1)
        L16:
            r2.setCompositionTask(r3)
            return
    }

    public void setApplyingOpacityToLayersEnabled(boolean r2) {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            r0.up(r2)
            return
    }

    public void setCacheComposition(boolean r1) {
            r0 = this;
            r0.vl = r1
            return
    }

    public void setClipToCompositionBounds(boolean r2) {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            r0.j(r2)
            return
    }

    public void setComposition(com.bytedance.adsdk.lottie.m r3) {
            r2 = this;
            boolean r0 = com.bytedance.adsdk.lottie.up.j
            com.bytedance.adsdk.lottie.tl r0 = r2.ae
            r0.setCallback(r2)
            r2.av = r3
            r0 = 1
            r2.oq = r0
            com.bytedance.adsdk.lottie.tl r0 = r2.ae
            android.content.Context r1 = r2.getContext()
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            boolean r3 = r0.j(r3, r1)
            r0 = 0
            r2.oq = r0
            android.graphics.drawable.Drawable r0 = r2.getDrawable()
            com.bytedance.adsdk.lottie.tl r1 = r2.ae
            if (r0 != r1) goto L2c
            if (r3 != 0) goto L2c
            goto L4b
        L2c:
            if (r3 != 0) goto L31
            r2.mi()
        L31:
            int r3 = r2.getVisibility()
            r2.onVisibilityChanged(r2, r3)
            r2.requestLayout()
            java.util.Set<java.lang.Object> r3 = r2.ws
            java.util.Iterator r3 = r3.iterator()
        L41:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L4b
            r3.next()
            goto L41
        L4b:
            return
    }

    public void setDefaultFontFileExtension(java.lang.String r2) {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            r0.ae(r2)
            return
    }

    public void setFailureListener(com.bytedance.adsdk.lottie.oq<java.lang.Throwable> r1) {
            r0 = this;
            r0.up = r1
            return
    }

    public void setFallbackResource(int r1) {
            r0 = this;
            r0.f1747m = r1
            return
    }

    public void setFontAssetDelegate(com.bytedance.adsdk.lottie.cw r2) {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            r0.j(r2)
            return
    }

    public void setFontMap(java.util.Map<java.lang.String, android.graphics.Typeface> r2) {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            r0.j(r2)
            return
    }

    public void setFrame(int r2) {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            r0.cw(r2)
            return
    }

    public void setIgnoreDisabledSystemAnimations(boolean r2) {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            r0.ae(r2)
            return
    }

    public void setImageAssetDelegate(com.bytedance.adsdk.lottie.r r2) {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            r0.j(r2)
            return
    }

    public void setImageAssetsFolder(java.lang.String r2) {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            r0.j(r2)
            return
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap r1) {
            r0 = this;
            r0.ws()
            super.setImageBitmap(r1)
            return
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.ws()
            super.setImageDrawable(r1)
            return
    }

    @Override // android.widget.ImageView
    public void setImageResource(int r1) {
            r0 = this;
            r0.ws()
            super.setImageResource(r1)
            return
    }

    public void setLottieAnimListener(com.bytedance.adsdk.lottie.LottieAnimationView.j r1) {
            r0 = this;
            r0.h = r1
            return
    }

    public void setLottieClicklistener(com.bytedance.adsdk.lottie.LottieAnimationView.xt r1) {
            r0 = this;
            r0.f1748p = r1
            return
    }

    public void setMaintainOriginalImageBounds(boolean r2) {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            r0.xt(r2)
            return
    }

    public void setMaxFrame(int r2) {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            r0.xt(r2)
            return
    }

    public void setMaxFrame(java.lang.String r2) {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            r0.cw(r2)
            return
    }

    public void setMaxProgress(@com.bytedance.component.sdk.annotation.FloatRange(from = 0.0d, to = 1.0d) float r2) {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            r0.xt(r2)
            return
    }

    public void setMinAndMaxFrame(java.lang.String r2) {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            r0.r(r2)
            return
    }

    public void setMinFrame(int r2) {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            r0.j(r2)
            return
    }

    public void setMinFrame(java.lang.String r2) {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            r0.xt(r2)
            return
    }

    public void setMinProgress(float r2) {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            r0.j(r2)
            return
    }

    public void setOutlineMasksAndMattes(boolean r2) {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            r0.r(r2)
            return
    }

    public void setPerformanceTrackingEnabled(boolean r2) {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            r0.cw(r2)
            return
    }

    public void setProgress(@com.bytedance.component.sdk.annotation.FloatRange(from = 0.0d, to = 1.0d) float r2) {
            r1 = this;
            r0 = 1
            r1.j(r2, r0)
            return
    }

    public void setRenderMode(com.bytedance.adsdk.lottie.mi r2) {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            r0.j(r2)
            return
    }

    public void setRepeatCount(int r3) {
            r2 = this;
            java.util.Set<com.bytedance.adsdk.lottie.LottieAnimationView$r> r0 = r2.jy
            com.bytedance.adsdk.lottie.LottieAnimationView$r r1 = com.bytedance.adsdk.lottie.LottieAnimationView.r.f1758r
            r0.add(r1)
            com.bytedance.adsdk.lottie.tl r0 = r2.ae
            r0.up(r3)
            return
    }

    public void setRepeatMode(int r3) {
            r2 = this;
            java.util.Set<com.bytedance.adsdk.lottie.LottieAnimationView$r> r0 = r2.jy
            com.bytedance.adsdk.lottie.LottieAnimationView$r r1 = com.bytedance.adsdk.lottie.LottieAnimationView.r.cw
            r0.add(r1)
            com.bytedance.adsdk.lottie.tl r0 = r2.ae
            r0.r(r3)
            return
    }

    public void setSafeMode(boolean r2) {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            r0.m(r2)
            return
    }

    public void setSpeed(float r2) {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            r0.cw(r2)
            return
    }

    public void setTextDelegate(com.bytedance.adsdk.lottie.kt r2) {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            r0.j(r2)
            return
    }

    public void setUseCompositionFrameRate(boolean r2) {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            r0.tl(r2)
            return
    }

    public void setViewDelegate(com.bytedance.adsdk.lottie.tj r2) {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            r0.j(r2)
            return
    }

    @Override // android.view.View
    public void unscheduleDrawable(android.graphics.drawable.Drawable r3) {
            r2 = this;
            boolean r0 = r2.oq
            if (r0 != 0) goto L12
            com.bytedance.adsdk.lottie.tl r0 = r2.ae
            if (r3 != r0) goto L12
            boolean r0 = r0.v()
            if (r0 == 0) goto L12
            r2.ae()
            goto L26
        L12:
            boolean r0 = r2.oq
            if (r0 != 0) goto L26
            boolean r0 = r3 instanceof com.bytedance.adsdk.lottie.tl
            if (r0 == 0) goto L26
            r0 = r3
            com.bytedance.adsdk.lottie.tl r0 = (com.bytedance.adsdk.lottie.tl) r0
            boolean r1 = r0.v()
            if (r1 == 0) goto L26
            r0.p()
        L26:
            super.unscheduleDrawable(r3)
            return
    }

    public boolean up() {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            boolean r0 = r0.v()
            return r0
    }

    @com.bytedance.component.sdk.annotation.MainThread
    public void xt() {
            r2 = this;
            java.util.Set<com.bytedance.adsdk.lottie.LottieAnimationView$r> r0 = r2.jy
            com.bytedance.adsdk.lottie.LottieAnimationView$r r1 = com.bytedance.adsdk.lottie.LottieAnimationView.r.f1757m
            r0.add(r1)
            com.bytedance.adsdk.lottie.tl r0 = r2.ae
            r0.ws()
            return
    }

    public void xt(android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            r0.xt(r2)
            return
    }

    public void xt(android.animation.ValueAnimator.AnimatorUpdateListener r2) {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.ae
            r0.xt(r2)
            return
    }
}
