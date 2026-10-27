package com.kwad.components.ad.splashscreen.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d extends android.graphics.drawable.AnimationDrawable {
    private android.graphics.Bitmap KI;
    private android.graphics.Bitmap KJ;
    private android.graphics.Bitmap KK;
    private android.graphics.Bitmap KL;
    private android.graphics.Bitmap KM;
    private android.graphics.Bitmap KN;
    private int KO;
    private android.graphics.RectF KP;
    private android.graphics.Paint KQ;
    private android.graphics.Paint KR;
    private android.graphics.PorterDuffXfermode KS;
    private final int KT;
    private final int KU;
    private float KV;
    private float KW;
    private android.graphics.RectF KX;
    private android.graphics.Paint KY;
    private int KZ;
    private int La;
    private android.animation.ValueAnimator Lb;
    private final float Lc;
    private final float Ld;
    private float Le;
    private float Lf;
    private int Lg;
    private android.content.Context mContext;


    public d(android.content.Context r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = 1086324736(0x40c00000, float:6.0)
            r1.Lc = r0
            r0 = 1093664768(0x41300000, float:11.0)
            r1.Ld = r0
            r1.mContext = r2
            r0 = 1112276992(0x424c0000, float:51.0)
            int r0 = com.kwad.sdk.c.a.a.a(r2, r0)
            r1.KT = r0
            r0 = 1114898432(0x42740000, float:61.0)
            int r2 = com.kwad.sdk.c.a.a.a(r2, r0)
            r1.KU = r2
            r1.Lg = r3
            r1.init()
            return
    }

    static /* synthetic */ float a(com.kwad.components.ad.splashscreen.widget.d r0) {
            float r0 = r0.Le
            return r0
    }

    static /* synthetic */ float a(com.kwad.components.ad.splashscreen.widget.d r0, float r1) {
            r0.Le = r1
            return r1
    }

    static /* synthetic */ void b(com.kwad.components.ad.splashscreen.widget.d r0, float r1) {
            r0.e(r1)
            return
    }

    private void e(float r6) {
            r5 = this;
            r0 = 1086324736(0x40c00000, float:6.0)
            int r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r1 > 0) goto L6e
            float r6 = r6 / r0
            int r0 = r5.Lg
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 1106247680(0x41f00000, float:30.0)
            if (r0 == 0) goto L50
            r3 = 1
            if (r0 == r3) goto L34
            r1 = 2
            if (r0 == r1) goto L16
            goto L6e
        L16:
            android.graphics.RectF r0 = r5.KX
            int r1 = r5.KZ
            float r1 = (float) r1
            float r1 = r1 * r6
            r0.right = r1
            android.graphics.RectF r3 = r5.KP
            float r4 = r5.KW
            float r1 = r1 + r4
            float r0 = r0.top
            float r4 = r5.KV
            float r0 = r0 + r4
            r3.offsetTo(r1, r0)
            r0 = 1134886912(0x43a50000, float:330.0)
            float r6 = r6 * r2
            float r6 = r6 + r0
            r5.Lf = r6
            return
        L34:
            android.graphics.RectF r0 = r5.KX
            int r3 = r5.KZ
            float r3 = (float) r3
            float r1 = r1 - r6
            float r3 = r3 * r1
            r0.left = r3
            android.graphics.RectF r6 = r5.KP
            float r4 = r5.KW
            float r3 = r3 + r4
            float r0 = r0.top
            float r4 = r5.KV
            float r0 = r0 + r4
            r6.offsetTo(r3, r0)
            float r1 = r1 * r2
            r5.Lf = r1
            return
        L50:
            android.graphics.RectF r0 = r5.KX
            int r3 = r5.La
            float r3 = (float) r3
            float r1 = r1 - r6
            float r3 = r3 * r1
            r0.top = r3
            android.graphics.RectF r1 = r5.KP
            float r0 = r0.left
            float r4 = r5.KW
            float r0 = r0 + r4
            float r4 = r5.KV
            float r3 = r3 + r4
            r1.offsetTo(r0, r3)
            r0 = 1133576192(0x43910000, float:290.0)
            float r6 = r6 * r2
            float r6 = r6 + r0
            r5.Lf = r6
        L6e:
            return
    }

    private void init() {
            r10 = this;
            android.content.Context r0 = r10.mContext
            android.content.res.Resources r0 = r0.getResources()
            int r1 = com.kwad.sdk.R.drawable.ksad_splash_hand
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r0, r1)
            r10.KI = r0
            android.content.Context r0 = r10.mContext
            android.content.res.Resources r0 = r0.getResources()
            int r1 = com.kwad.sdk.R.drawable.ksad_splash_hand_lt
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r0, r1)
            r10.KJ = r0
            android.content.Context r0 = r10.mContext
            android.content.res.Resources r0 = r0.getResources()
            int r1 = com.kwad.sdk.R.drawable.ksad_splash_hand_lb
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r0, r1)
            r10.KK = r0
            android.content.Context r0 = r10.mContext
            android.content.res.Resources r0 = r0.getResources()
            int r1 = com.kwad.sdk.R.drawable.ksad_splash_hand_rt
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r0, r1)
            r10.KL = r0
            android.content.Context r0 = r10.mContext
            android.content.res.Resources r0 = r0.getResources()
            int r1 = com.kwad.sdk.R.drawable.ksad_splash_hand_rb
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r0, r1)
            r10.KM = r0
            android.content.Context r0 = r10.mContext
            android.content.res.Resources r0 = r0.getResources()
            int r1 = com.kwad.sdk.R.drawable.ksad_splash_side_bg
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeResource(r0, r1)
            int r0 = r10.Lg
            r1 = 2
            r9 = 1
            if (r0 == 0) goto L95
            if (r0 == r9) goto L79
            if (r0 == r1) goto L5d
            goto L97
        L5d:
            android.graphics.Matrix r7 = new android.graphics.Matrix
            r7.<init>()
            r0 = 1119092736(0x42b40000, float:90.0)
            r7.postRotate(r0)
            int r5 = r2.getWidth()
            int r6 = r2.getHeight()
            r8 = 1
            r3 = 0
            r4 = 0
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r3, r4, r5, r6, r7, r8)
            r10.KN = r0
            goto L97
        L79:
            android.graphics.Matrix r7 = new android.graphics.Matrix
            r7.<init>()
            r0 = 1132920832(0x43870000, float:270.0)
            r7.postRotate(r0)
            int r5 = r2.getWidth()
            int r6 = r2.getHeight()
            r8 = 1
            r3 = 0
            r4 = 0
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r3, r4, r5, r6, r7, r8)
            r10.KN = r0
            goto L97
        L95:
            r10.KN = r2
        L97:
            android.content.Context r0 = r10.mContext
            r2 = 1092616192(0x41200000, float:10.0)
            int r0 = com.kwad.sdk.c.a.a.a(r0, r2)
            r10.KO = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r9)
            r10.KY = r0
            int r0 = r10.Lg
            if (r0 == 0) goto L116
            r2 = 1035489772(0x3db851ec, float:0.09)
            if (r0 == r9) goto Le5
            if (r0 == r1) goto Lb5
            goto L147
        Lb5:
            android.content.Context r0 = r10.mContext
            android.content.res.Resources r0 = r0.getResources()
            int r1 = com.kwad.sdk.R.dimen.ksad_splash_hand_bgw
            float r0 = r0.getDimension(r1)
            int r0 = (int) r0
            r10.La = r0
            android.content.Context r0 = r10.mContext
            android.content.res.Resources r0 = r0.getResources()
            int r1 = com.kwad.sdk.R.dimen.ksad_splash_hand_bgh
            float r0 = r0.getDimension(r1)
            int r0 = (int) r0
            r10.KZ = r0
            int r0 = r10.La
            float r0 = (float) r0
            float r0 = r0 * r2
            r10.KV = r0
            int r0 = r10.KT
            int r0 = -r0
            float r0 = (float) r0
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r1
            r10.KW = r0
            goto L147
        Le5:
            android.content.Context r0 = r10.mContext
            android.content.res.Resources r0 = r0.getResources()
            int r1 = com.kwad.sdk.R.dimen.ksad_splash_hand_bgw
            float r0 = r0.getDimension(r1)
            int r0 = (int) r0
            r10.La = r0
            android.content.Context r0 = r10.mContext
            android.content.res.Resources r0 = r0.getResources()
            int r1 = com.kwad.sdk.R.dimen.ksad_splash_hand_bgh
            float r0 = r0.getDimension(r1)
            int r0 = (int) r0
            r10.KZ = r0
            int r0 = r10.La
            float r0 = (float) r0
            float r0 = r0 * r2
            r10.KV = r0
            int r0 = r10.KT
            int r0 = -r0
            float r0 = (float) r0
            r1 = 1045220557(0x3e4ccccd, float:0.2)
            float r0 = r0 * r1
            r10.KW = r0
            goto L147
        L116:
            android.content.Context r0 = r10.mContext
            android.content.res.Resources r0 = r0.getResources()
            int r1 = com.kwad.sdk.R.dimen.ksad_splash_hand_bgh
            float r0 = r0.getDimension(r1)
            int r0 = (int) r0
            r10.La = r0
            android.content.Context r0 = r10.mContext
            android.content.res.Resources r0 = r0.getResources()
            int r1 = com.kwad.sdk.R.dimen.ksad_splash_hand_bgw
            float r0 = r0.getDimension(r1)
            int r0 = (int) r0
            r10.KZ = r0
            int r1 = r10.KU
            int r1 = -r1
            float r1 = (float) r1
            r2 = 1046562734(0x3e6147ae, float:0.22)
            float r1 = r1 * r2
            r10.KV = r1
            float r0 = (float) r0
            r1 = 1034147594(0x3da3d70a, float:0.08)
            float r0 = r0 * r1
            r10.KW = r0
        L147:
            android.graphics.RectF r0 = new android.graphics.RectF
            int r1 = r10.KZ
            float r1 = (float) r1
            int r2 = r10.La
            float r2 = (float) r2
            r3 = 0
            r0.<init>(r3, r3, r1, r2)
            r10.KX = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 3
            r0.<init>(r1)
            r10.KQ = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r1)
            r10.KR = r0
            r0.setDither(r9)
            android.graphics.RectF r0 = new android.graphics.RectF
            android.graphics.RectF r2 = r10.KX
            float r2 = r2.right
            int r4 = r10.KT
            float r4 = (float) r4
            float r4 = r2 - r4
            int r5 = r10.KU
            float r5 = (float) r5
            r0.<init>(r4, r3, r2, r5)
            r10.KP = r0
            android.graphics.PorterDuffXfermode r0 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.DST_OUT
            r0.<init>(r2)
            r10.KS = r0
            float[] r0 = new float[r1]
            r0 = {x01a4: FILL_ARRAY_DATA , data: [0, 1086324736, 1093664768} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            r10.Lb = r0
            r1 = 1100(0x44c, double:5.435E-321)
            r0.setDuration(r1)
            android.animation.ValueAnimator r0 = r10.Lb
            com.kwad.components.ad.splashscreen.widget.d$1 r1 = new com.kwad.components.ad.splashscreen.widget.d$1
            r1.<init>(r10)
            r0.addUpdateListener(r1)
            android.animation.ValueAnimator r0 = r10.Lb
            r1 = -1
            r0.setRepeatCount(r1)
            return
    }

    @Override // android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public final void draw(@androidx.annotation.NonNull android.graphics.Canvas r7) {
            r6 = this;
            android.graphics.RectF r0 = r6.KX
            if (r0 != 0) goto L5
            return
        L5:
            r7.save()
            int r0 = r6.getIntrinsicWidth()
            int r1 = r6.KZ
            int r0 = r0 - r1
            int r0 = r0 / 2
            float r0 = (float) r0
            int r1 = r6.getIntrinsicHeight()
            int r2 = r6.La
            int r1 = r1 - r2
            int r1 = r1 / 2
            float r1 = (float) r1
            r7.translate(r0, r1)
            float r0 = r6.Le
            r1 = 1132396544(0x437f0000, float:255.0)
            r2 = 1086324736(0x40c00000, float:6.0)
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 > 0) goto L3a
            android.graphics.Paint r3 = r6.KY
            float r0 = r0 * r1
            float r0 = r0 / r2
            int r0 = (int) r0
            r3.setAlpha(r0)
            android.graphics.Paint r0 = r6.KR
            r1 = 255(0xff, float:3.57E-43)
            r0.setAlpha(r1)
            goto L4e
        L3a:
            float r0 = r0 - r2
            r2 = 1084227584(0x40a00000, float:5.0)
            float r0 = r0 / r2
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r0
            float r2 = r2 * r1
            int r0 = (int) r2
            android.graphics.Paint r1 = r6.KY
            r1.setAlpha(r0)
            android.graphics.Paint r1 = r6.KR
            r1.setAlpha(r0)
        L4e:
            int r0 = r7.save()
            android.graphics.RectF r1 = r6.KX
            android.graphics.Paint r2 = r6.KY
            r3 = 31
            int r1 = r7.saveLayer(r1, r2, r3)
            r2 = 0
            android.graphics.Bitmap r3 = r6.KN     // Catch: java.lang.Throwable -> L67
            android.graphics.RectF r4 = r6.KX     // Catch: java.lang.Throwable -> L67
            android.graphics.Paint r5 = r6.KY     // Catch: java.lang.Throwable -> L67
            r7.drawBitmap(r3, r2, r4, r5)     // Catch: java.lang.Throwable -> L67
            goto L68
        L67:
        L68:
            float r3 = r6.Lf
            android.graphics.RectF r4 = r6.KP
            float r4 = r4.centerX()
            android.graphics.RectF r5 = r6.KP
            float r5 = r5.centerY()
            r7.rotate(r3, r4, r5)
            android.graphics.Paint r3 = r6.KQ
            android.graphics.PorterDuffXfermode r4 = r6.KS
            r3.setXfermode(r4)
            int r3 = r6.Lg
            if (r3 == 0) goto L9b
            r4 = 1
            if (r3 == r4) goto L88
            goto Lad
        L88:
            android.graphics.Bitmap r3 = r6.KJ
            android.graphics.RectF r4 = r6.KP
            android.graphics.Paint r5 = r6.KQ
            r7.drawBitmap(r3, r2, r4, r5)
            android.graphics.Bitmap r3 = r6.KK
            android.graphics.RectF r4 = r6.KP
            android.graphics.Paint r5 = r6.KQ
            r7.drawBitmap(r3, r2, r4, r5)
            goto Lad
        L9b:
            android.graphics.Bitmap r3 = r6.KL
            android.graphics.RectF r4 = r6.KP
            android.graphics.Paint r5 = r6.KQ
            r7.drawBitmap(r3, r2, r4, r5)
            android.graphics.Bitmap r3 = r6.KM
            android.graphics.RectF r4 = r6.KP
            android.graphics.Paint r5 = r6.KQ
            r7.drawBitmap(r3, r2, r4, r5)
        Lad:
            android.graphics.Bitmap r3 = r6.KI
            android.graphics.RectF r4 = r6.KP
            android.graphics.Paint r5 = r6.KQ
            r7.drawBitmap(r3, r2, r4, r5)
            r7.restoreToCount(r1)
            float r1 = r6.Lf
            android.graphics.RectF r3 = r6.KP
            float r3 = r3.centerX()
            android.graphics.RectF r4 = r6.KP
            float r4 = r4.centerY()
            r7.rotate(r1, r3, r4)
            android.graphics.Bitmap r1 = r6.KI
            android.graphics.RectF r3 = r6.KP
            android.graphics.Paint r4 = r6.KR
            r7.drawBitmap(r1, r2, r3, r4)
            r7.restoreToCount(r0)
            r7.restore()
            return
    }

    @Override // android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
            r2 = this;
            int r0 = r2.La
            int r1 = r2.KU
            int r0 = r0 + r1
            int r1 = r2.KO
            int r0 = r0 + r1
            return r0
    }

    @Override // android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
            r2 = this;
            int r0 = r2.KZ
            int r1 = r2.KT
            int r0 = r0 + r1
            return r0
    }

    @Override // android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public final int getOpacity() {
            r1 = this;
            r0 = -2
            return r0
    }

    @Override // android.graphics.drawable.AnimationDrawable, android.graphics.drawable.Animatable
    public final boolean isRunning() {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.Lb
            if (r0 == 0) goto L9
            boolean r0 = r0.isRunning()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.AnimationDrawable, android.graphics.drawable.Animatable
    public final void start() {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.Lb
            if (r0 == 0) goto L7
            r0.start()
        L7:
            return
    }

    @Override // android.graphics.drawable.AnimationDrawable, android.graphics.drawable.Animatable
    public final void stop() {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.Lb
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            return
    }
}
