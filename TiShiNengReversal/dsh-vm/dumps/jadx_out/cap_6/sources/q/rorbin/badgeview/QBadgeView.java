package q.rorbin.badgeview;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class QBadgeView extends android.view.View implements q.rorbin.badgeview.a {
    protected android.graphics.PointF A;
    protected android.graphics.PointF B;
    protected android.graphics.PointF C;
    protected android.graphics.PointF D;
    protected java.util.List<android.graphics.PointF> E;
    protected android.view.View F;
    protected int G;
    protected int H;
    protected android.text.TextPaint I;
    protected android.graphics.Paint J;
    protected android.graphics.Paint K;
    protected q.rorbin.badgeview.b L;
    protected q.rorbin.badgeview.a.InterfaceC0093a M;
    protected android.view.ViewGroup N;
    protected int a;
    protected int b;
    protected int c;
    protected android.graphics.drawable.Drawable d;
    protected android.graphics.Bitmap e;
    protected boolean f;
    protected float g;
    protected float h;
    protected float i;
    protected int j;
    protected java.lang.String k;
    protected boolean l;
    protected boolean m;
    protected boolean n;
    protected boolean o;
    protected int p;

    /* renamed from: q, reason: collision with root package name */
    protected float f71q;
    protected float r;
    protected float s;
    protected float t;
    protected int u;
    protected boolean v;
    protected android.graphics.RectF w;
    protected android.graphics.RectF x;
    protected android.graphics.Path y;
    protected android.graphics.Paint.FontMetrics z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class a extends android.view.ViewGroup {
        final /* synthetic */ q.rorbin.badgeview.QBadgeView a;

        public a(q.rorbin.badgeview.QBadgeView r1, android.content.Context r2) {
                r0 = this;
                r0.a = r1
                r0.<init>(r2)
                return
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchRestoreInstanceState(android.util.SparseArray<android.os.Parcelable> r2) {
                r1 = this;
                android.view.ViewParent r0 = r1.getParent()
                boolean r0 = r0 instanceof android.widget.RelativeLayout
                if (r0 != 0) goto Lb
                super.dispatchRestoreInstanceState(r2)
            Lb:
                return
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
                r0 = this;
                r1 = 0
                r2 = 0
            L2:
                int r3 = r0.getChildCount()
                if (r2 >= r3) goto L1a
                android.view.View r3 = r0.getChildAt(r2)
                int r4 = r3.getMeasuredWidth()
                int r5 = r3.getMeasuredHeight()
                r3.layout(r1, r1, r4, r5)
                int r2 = r2 + 1
                goto L2
            L1a:
                return
        }

        @Override // android.view.View
        protected void onMeasure(int r6, int r7) {
                r5 = this;
                r0 = 0
                r1 = 0
                r1 = r0
                r2 = 0
            L4:
                int r3 = r5.getChildCount()
                if (r2 >= r3) goto L18
                android.view.View r3 = r5.getChildAt(r2)
                boolean r4 = r3 instanceof q.rorbin.badgeview.QBadgeView
                if (r4 != 0) goto L14
                r0 = r3
                goto L15
            L14:
                r1 = r3
            L15:
                int r2 = r2 + 1
                goto L4
            L18:
                if (r0 != 0) goto L1e
                super.onMeasure(r6, r7)
                return
            L1e:
                r0.measure(r6, r7)
                if (r1 == 0) goto L38
                int r6 = r0.getMeasuredWidth()
                r7 = 1073741824(0x40000000, float:2.0)
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7)
                int r2 = r0.getMeasuredHeight()
                int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r7)
                r1.measure(r6, r7)
            L38:
                int r6 = r0.getMeasuredWidth()
                int r7 = r0.getMeasuredHeight()
                r5.setMeasuredDimension(r6, r7)
                return
        }
    }

    public QBadgeView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    private QBadgeView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    private QBadgeView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.H()
            return
    }

    private void A() {
            r11 = this;
            java.lang.String r0 = r11.k
            if (r0 != 0) goto L5
            goto L9
        L5:
            boolean r0 = r11.f
            if (r0 != 0) goto La
        L9:
            return
        La:
            android.graphics.Bitmap r0 = r11.e
            if (r0 == 0) goto L19
            boolean r0 = r0.isRecycled()
            if (r0 != 0) goto L19
            android.graphics.Bitmap r0 = r11.e
            r0.recycle()
        L19:
            float r0 = r11.getBadgeCircleRadius()
            java.lang.String r1 = r11.k
            boolean r1 = r1.isEmpty()
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 != 0) goto L76
            java.lang.String r1 = r11.k
            int r1 = r1.length()
            r3 = 1
            if (r1 != r3) goto L31
            goto L76
        L31:
            android.graphics.RectF r0 = r11.w
            float r0 = r0.width()
            float r1 = r11.i
            float r1 = r1 * r2
            float r0 = r0 + r1
            int r0 = (int) r0
            android.graphics.RectF r1 = r11.w
            float r1 = r1.height()
            float r3 = r11.i
            float r1 = r1 + r3
            int r1 = (int) r1
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_4444
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r3)
            r11.e = r0
            android.graphics.Canvas r3 = new android.graphics.Canvas
            android.graphics.Bitmap r0 = r11.e
            r3.<init>(r0)
            int r0 = r3.getWidth()
            float r6 = (float) r0
            int r0 = r3.getHeight()
            float r7 = (float) r0
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r8 = r0 / r2
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r9 = r0 / r2
            android.graphics.Paint r10 = r11.J
            r4 = 0
            r5 = 0
            r3.drawRoundRect(r4, r5, r6, r7, r8, r9, r10)
            return
        L76:
            int r0 = (int) r0
            int r0 = r0 * 2
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r0, r1)
            r11.e = r0
            android.graphics.Canvas r0 = new android.graphics.Canvas
            android.graphics.Bitmap r1 = r11.e
            r0.<init>(r1)
            int r1 = r0.getWidth()
            float r1 = (float) r1
            float r1 = r1 / r2
            int r3 = r0.getHeight()
            float r3 = (float) r3
            float r3 = r3 / r2
            int r4 = r0.getWidth()
            float r4 = (float) r4
            float r4 = r4 / r2
            android.graphics.Paint r2 = r11.J
            r0.drawCircle(r1, r3, r4, r2)
            return
    }

    private void B(android.graphics.Canvas r8, android.graphics.PointF r9, float r10) {
            r7 = this;
            float r0 = r9.x
            r1 = -998637568(0xffffffffc47a0000, float:-1000.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L10
            float r0 = r9.y
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L10
            goto Lef
        L10:
            java.lang.String r0 = r7.k
            boolean r0 = r0.isEmpty()
            r1 = 0
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != 0) goto L97
            java.lang.String r0 = r7.k
            int r0 = r0.length()
            r3 = 1
            if (r0 != r3) goto L25
            goto L97
        L25:
            android.graphics.RectF r10 = r7.x
            float r0 = r9.x
            android.graphics.RectF r3 = r7.w
            float r3 = r3.width()
            float r3 = r3 / r2
            float r4 = r7.i
            float r3 = r3 + r4
            float r0 = r0 - r3
            r10.left = r0
            android.graphics.RectF r10 = r7.x
            float r0 = r9.y
            android.graphics.RectF r3 = r7.w
            float r3 = r3.height()
            float r3 = r3 / r2
            float r4 = r7.i
            r5 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 * r5
            float r3 = r3 + r4
            float r0 = r0 - r3
            r10.top = r0
            android.graphics.RectF r10 = r7.x
            float r0 = r9.x
            android.graphics.RectF r3 = r7.w
            float r3 = r3.width()
            float r3 = r3 / r2
            float r4 = r7.i
            float r3 = r3 + r4
            float r0 = r0 + r3
            r10.right = r0
            android.graphics.RectF r10 = r7.x
            float r0 = r9.y
            android.graphics.RectF r3 = r7.w
            float r3 = r3.height()
            float r3 = r3 / r2
            float r4 = r7.i
            float r4 = r4 * r5
            float r3 = r3 + r4
            float r0 = r0 + r3
            r10.bottom = r0
            android.graphics.RectF r10 = r7.x
            float r10 = r10.height()
            float r10 = r10 / r2
            android.graphics.drawable.Drawable r0 = r7.d
            if (r0 == 0) goto L7e
            r7.C(r8)
            goto Lce
        L7e:
            android.graphics.RectF r0 = r7.x
            android.graphics.Paint r3 = r7.J
            r8.drawRoundRect(r0, r10, r10, r3)
            int r0 = r7.b
            if (r0 == 0) goto Lce
            float r0 = r7.g
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lce
            android.graphics.RectF r0 = r7.x
            android.graphics.Paint r1 = r7.K
            r8.drawRoundRect(r0, r10, r10, r1)
            goto Lce
        L97:
            android.graphics.RectF r0 = r7.x
            float r3 = r9.x
            int r4 = (int) r10
            float r4 = (float) r4
            float r5 = r3 - r4
            r0.left = r5
            float r5 = r9.y
            float r6 = r5 - r4
            r0.top = r6
            float r6 = r3 + r4
            r0.right = r6
            float r4 = r4 + r5
            r0.bottom = r4
            android.graphics.drawable.Drawable r0 = r7.d
            if (r0 == 0) goto Lb6
            r7.C(r8)
            goto Lce
        Lb6:
            android.graphics.Paint r0 = r7.J
            r8.drawCircle(r3, r5, r10, r0)
            int r0 = r7.b
            if (r0 == 0) goto Lce
            float r0 = r7.g
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lce
            float r0 = r9.x
            float r1 = r9.y
            android.graphics.Paint r3 = r7.K
            r8.drawCircle(r0, r1, r10, r3)
        Lce:
            java.lang.String r10 = r7.k
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto Lef
            java.lang.String r10 = r7.k
            float r9 = r9.x
            android.graphics.RectF r0 = r7.x
            float r1 = r0.bottom
            float r0 = r0.top
            float r1 = r1 + r0
            android.graphics.Paint$FontMetrics r0 = r7.z
            float r3 = r0.bottom
            float r1 = r1 - r3
            float r0 = r0.top
            float r1 = r1 - r0
            float r1 = r1 / r2
            android.text.TextPaint r0 = r7.I
            r8.drawText(r10, r9, r1, r0)
        Lef:
            return
    }

    private void C(android.graphics.Canvas r12) {
            r11 = this;
            android.graphics.Paint r0 = r11.J
            r1 = 0
            r2 = 0
            r0.setShadowLayer(r1, r1, r1, r2)
            android.graphics.RectF r0 = r11.x
            float r1 = r0.left
            int r1 = (int) r1
            float r2 = r0.top
            int r2 = (int) r2
            float r3 = r0.right
            int r3 = (int) r3
            float r0 = r0.bottom
            int r0 = (int) r0
            boolean r4 = r11.f
            if (r4 == 0) goto L34
            android.graphics.Bitmap r0 = r11.e
            int r0 = r0.getWidth()
            int r3 = r1 + r0
            android.graphics.Bitmap r0 = r11.e
            int r0 = r0.getHeight()
            int r0 = r0 + r2
            float r5 = (float) r1
            float r6 = (float) r2
            float r7 = (float) r3
            float r8 = (float) r0
            r9 = 0
            r10 = 31
            r4 = r12
            r4.saveLayer(r5, r6, r7, r8, r9, r10)
            goto L35
        L34:
            r4 = r12
        L35:
            android.graphics.drawable.Drawable r12 = r11.d
            r12.setBounds(r1, r2, r3, r0)
            android.graphics.drawable.Drawable r12 = r11.d
            r12.draw(r4)
            boolean r12 = r11.f
            if (r12 == 0) goto La2
            android.graphics.Paint r12 = r11.J
            android.graphics.PorterDuffXfermode r0 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.DST_IN
            r0.<init>(r3)
            r12.setXfermode(r0)
            android.graphics.Bitmap r12 = r11.e
            float r0 = (float) r1
            float r1 = (float) r2
            android.graphics.Paint r2 = r11.J
            r4.drawBitmap(r12, r0, r1, r2)
            r4.restore()
            android.graphics.Paint r12 = r11.J
            r0 = 0
            r12.setXfermode(r0)
            java.lang.String r12 = r11.k
            boolean r12 = r12.isEmpty()
            r0 = 1073741824(0x40000000, float:2.0)
            if (r12 != 0) goto L89
            java.lang.String r12 = r11.k
            int r12 = r12.length()
            r1 = 1
            if (r12 != r1) goto L75
            goto L89
        L75:
            android.graphics.RectF r12 = r11.x
            float r1 = r12.height()
            float r1 = r1 / r0
            android.graphics.RectF r2 = r11.x
            float r2 = r2.height()
            float r2 = r2 / r0
            android.graphics.Paint r0 = r11.K
            r4.drawRoundRect(r12, r1, r2, r0)
            return
        L89:
            android.graphics.RectF r12 = r11.x
            float r12 = r12.centerX()
            android.graphics.RectF r1 = r11.x
            float r1 = r1.centerY()
            android.graphics.RectF r2 = r11.x
            float r2 = r2.width()
            float r2 = r2 / r0
            android.graphics.Paint r0 = r11.K
            r4.drawCircle(r12, r1, r2, r0)
            return
        La2:
            android.graphics.RectF r12 = r11.x
            android.graphics.Paint r0 = r11.K
            r4.drawRect(r12, r0)
            return
    }

    private void D(android.graphics.Canvas r10, float r11, float r12) {
            r9 = this;
            r0 = 0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            android.graphics.PointF r1 = r9.B
            float r2 = r1.y
            android.graphics.PointF r3 = r9.C
            float r4 = r3.y
            float r2 = r2 - r4
            float r1 = r1.x
            float r3 = r3.x
            float r1 = r1 - r3
            java.util.List<android.graphics.PointF> r3 = r9.E
            r3.clear()
            r3 = 0
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 == 0) goto L3a
            float r2 = r2 / r1
            double r0 = (double) r2
            r4 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            double r4 = r4 / r0
            android.graphics.PointF r0 = r9.B
            java.lang.Double r1 = java.lang.Double.valueOf(r4)
            java.util.List<android.graphics.PointF> r2 = r9.E
            q.rorbin.badgeview.e.a(r0, r12, r1, r2)
            android.graphics.PointF r12 = r9.C
            java.lang.Double r0 = java.lang.Double.valueOf(r4)
            java.util.List<android.graphics.PointF> r1 = r9.E
            q.rorbin.badgeview.e.a(r12, r11, r0, r1)
            goto L48
        L3a:
            android.graphics.PointF r1 = r9.B
            java.util.List<android.graphics.PointF> r2 = r9.E
            q.rorbin.badgeview.e.a(r1, r12, r0, r2)
            android.graphics.PointF r12 = r9.C
            java.util.List<android.graphics.PointF> r1 = r9.E
            q.rorbin.badgeview.e.a(r12, r11, r0, r1)
        L48:
            android.graphics.Path r12 = r9.y
            r12.reset()
            android.graphics.Path r12 = r9.y
            android.graphics.PointF r0 = r9.C
            float r1 = r0.x
            float r0 = r0.y
            int r2 = r9.u
            r4 = 1
            r5 = 2
            if (r2 == r4) goto L61
            if (r2 != r5) goto L5e
            goto L61
        L5e:
            android.graphics.Path$Direction r2 = android.graphics.Path.Direction.CW
            goto L63
        L61:
            android.graphics.Path$Direction r2 = android.graphics.Path.Direction.CCW
        L63:
            r12.addCircle(r1, r0, r11, r2)
            android.graphics.PointF r12 = r9.D
            android.graphics.PointF r0 = r9.C
            float r1 = r0.x
            android.graphics.PointF r2 = r9.B
            float r6 = r2.x
            float r1 = r1 + r6
            r6 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r6
            r12.x = r1
            float r0 = r0.y
            float r1 = r2.y
            float r0 = r0 + r1
            float r0 = r0 / r6
            r12.y = r0
            android.graphics.Path r12 = r9.y
            java.util.List<android.graphics.PointF> r0 = r9.E
            java.lang.Object r0 = r0.get(r5)
            android.graphics.PointF r0 = (android.graphics.PointF) r0
            float r0 = r0.x
            java.util.List<android.graphics.PointF> r1 = r9.E
            java.lang.Object r1 = r1.get(r5)
            android.graphics.PointF r1 = (android.graphics.PointF) r1
            float r1 = r1.y
            r12.moveTo(r0, r1)
            android.graphics.Path r12 = r9.y
            android.graphics.PointF r0 = r9.D
            float r1 = r0.x
            float r0 = r0.y
            java.util.List<android.graphics.PointF> r2 = r9.E
            r6 = 0
            java.lang.Object r2 = r2.get(r6)
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            float r2 = r2.x
            java.util.List<android.graphics.PointF> r7 = r9.E
            java.lang.Object r7 = r7.get(r6)
            android.graphics.PointF r7 = (android.graphics.PointF) r7
            float r7 = r7.y
            r12.quadTo(r1, r0, r2, r7)
            android.graphics.Path r12 = r9.y
            java.util.List<android.graphics.PointF> r0 = r9.E
            java.lang.Object r0 = r0.get(r4)
            android.graphics.PointF r0 = (android.graphics.PointF) r0
            float r0 = r0.x
            java.util.List<android.graphics.PointF> r1 = r9.E
            java.lang.Object r1 = r1.get(r4)
            android.graphics.PointF r1 = (android.graphics.PointF) r1
            float r1 = r1.y
            r12.lineTo(r0, r1)
            android.graphics.Path r12 = r9.y
            android.graphics.PointF r0 = r9.D
            float r1 = r0.x
            float r0 = r0.y
            java.util.List<android.graphics.PointF> r2 = r9.E
            r7 = 3
            java.lang.Object r2 = r2.get(r7)
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            float r2 = r2.x
            java.util.List<android.graphics.PointF> r8 = r9.E
            java.lang.Object r8 = r8.get(r7)
            android.graphics.PointF r8 = (android.graphics.PointF) r8
            float r8 = r8.y
            r12.quadTo(r1, r0, r2, r8)
            android.graphics.Path r12 = r9.y
            java.util.List<android.graphics.PointF> r0 = r9.E
            java.lang.Object r0 = r0.get(r5)
            android.graphics.PointF r0 = (android.graphics.PointF) r0
            float r0 = r0.x
            java.util.List<android.graphics.PointF> r1 = r9.E
            java.lang.Object r1 = r1.get(r5)
            android.graphics.PointF r1 = (android.graphics.PointF) r1
            float r1 = r1.y
            r12.lineTo(r0, r1)
            android.graphics.Path r12 = r9.y
            r12.close()
            android.graphics.Path r12 = r9.y
            android.graphics.Paint r0 = r9.J
            r10.drawPath(r12, r0)
            int r12 = r9.b
            if (r12 == 0) goto L20c
            float r12 = r9.g
            int r12 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r12 <= 0) goto L20c
            android.graphics.Path r12 = r9.y
            r12.reset()
            android.graphics.Path r12 = r9.y
            java.util.List<android.graphics.PointF> r0 = r9.E
            java.lang.Object r0 = r0.get(r5)
            android.graphics.PointF r0 = (android.graphics.PointF) r0
            float r0 = r0.x
            java.util.List<android.graphics.PointF> r1 = r9.E
            java.lang.Object r1 = r1.get(r5)
            android.graphics.PointF r1 = (android.graphics.PointF) r1
            float r1 = r1.y
            r12.moveTo(r0, r1)
            android.graphics.Path r12 = r9.y
            android.graphics.PointF r0 = r9.D
            float r1 = r0.x
            float r0 = r0.y
            java.util.List<android.graphics.PointF> r2 = r9.E
            java.lang.Object r2 = r2.get(r6)
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            float r2 = r2.x
            java.util.List<android.graphics.PointF> r3 = r9.E
            java.lang.Object r3 = r3.get(r6)
            android.graphics.PointF r3 = (android.graphics.PointF) r3
            float r3 = r3.y
            r12.quadTo(r1, r0, r2, r3)
            android.graphics.Path r12 = r9.y
            java.util.List<android.graphics.PointF> r0 = r9.E
            java.lang.Object r0 = r0.get(r4)
            android.graphics.PointF r0 = (android.graphics.PointF) r0
            float r0 = r0.x
            java.util.List<android.graphics.PointF> r1 = r9.E
            java.lang.Object r1 = r1.get(r4)
            android.graphics.PointF r1 = (android.graphics.PointF) r1
            float r1 = r1.y
            r12.moveTo(r0, r1)
            android.graphics.Path r12 = r9.y
            android.graphics.PointF r0 = r9.D
            float r1 = r0.x
            float r0 = r0.y
            java.util.List<android.graphics.PointF> r2 = r9.E
            java.lang.Object r2 = r2.get(r7)
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            float r2 = r2.x
            java.util.List<android.graphics.PointF> r3 = r9.E
            java.lang.Object r3 = r3.get(r7)
            android.graphics.PointF r3 = (android.graphics.PointF) r3
            float r3 = r3.y
            r12.quadTo(r1, r0, r2, r3)
            int r12 = r9.u
            if (r12 == r4) goto L1b8
            if (r12 != r5) goto L19b
            goto L1b8
        L19b:
            java.util.List<android.graphics.PointF> r12 = r9.E
            java.lang.Object r12 = r12.get(r7)
            android.graphics.PointF r12 = (android.graphics.PointF) r12
            float r12 = r12.x
            android.graphics.PointF r0 = r9.C
            float r1 = r0.x
            float r12 = r12 - r1
            float r0 = r0.y
            java.util.List<android.graphics.PointF> r1 = r9.E
            java.lang.Object r1 = r1.get(r7)
            android.graphics.PointF r1 = (android.graphics.PointF) r1
            float r1 = r1.y
        L1b6:
            float r0 = r0 - r1
            goto L1d4
        L1b8:
            java.util.List<android.graphics.PointF> r12 = r9.E
            java.lang.Object r12 = r12.get(r5)
            android.graphics.PointF r12 = (android.graphics.PointF) r12
            float r12 = r12.x
            android.graphics.PointF r0 = r9.C
            float r1 = r0.x
            float r12 = r12 - r1
            float r0 = r0.y
            java.util.List<android.graphics.PointF> r1 = r9.E
            java.lang.Object r1 = r1.get(r5)
            android.graphics.PointF r1 = (android.graphics.PointF) r1
            float r1 = r1.y
            goto L1b6
        L1d4:
            float r0 = r0 / r12
            double r0 = (double) r0
            double r0 = java.lang.Math.atan(r0)
            int r12 = r9.u
            int r2 = r12 + (-1)
            if (r2 != 0) goto L1e2
            r12 = 4
            goto L1e3
        L1e2:
            int r12 = r12 - r4
        L1e3:
            double r0 = q.rorbin.badgeview.e.d(r0, r12)
            double r0 = q.rorbin.badgeview.e.e(r0)
            float r12 = (float) r0
            r0 = 1135869952(0x43b40000, float:360.0)
            float r6 = r0 - r12
            android.graphics.Path r1 = r9.y
            android.graphics.PointF r12 = r9.C
            float r0 = r12.x
            float r2 = r0 - r11
            float r12 = r12.y
            float r3 = r12 - r11
            float r4 = r0 + r11
            float r5 = r12 + r11
            r7 = 1127481344(0x43340000, float:180.0)
            r1.addArc(r2, r3, r4, r5, r6, r7)
            android.graphics.Path r11 = r9.y
            android.graphics.Paint r12 = r9.K
            r10.drawPath(r11, r12)
        L20c:
            return
    }

    private void E(android.view.View r2) {
            r1 = this;
            android.view.ViewParent r0 = r2.getParent()
            if (r0 == 0) goto L18
            android.view.ViewParent r0 = r2.getParent()
            boolean r0 = r0 instanceof android.view.View
            if (r0 == 0) goto L18
            android.view.ViewParent r2 = r2.getParent()
            android.view.View r2 = (android.view.View) r2
            r1.E(r2)
            return
        L18:
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 == 0) goto L20
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r1.N = r2
        L20:
            return
    }

    private void F() {
            r6 = this;
            android.graphics.RectF r0 = r6.w
            float r0 = r0.height()
            android.graphics.RectF r1 = r6.w
            float r1 = r1.width()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L17
            android.graphics.RectF r0 = r6.w
            float r0 = r0.height()
            goto L1d
        L17:
            android.graphics.RectF r0 = r6.w
            float r0 = r0.width()
        L1d:
            int r1 = r6.p
            r2 = 1073741824(0x40000000, float:2.0)
            switch(r1) {
                case 17: goto Lf9;
                case 49: goto Le1;
                case 81: goto Lc5;
                case 8388627: goto Lb3;
                case 8388629: goto L9d;
                case 8388659: goto L84;
                case 8388661: goto L66;
                case 8388691: goto L48;
                case 8388693: goto L26;
                default: goto L24;
            }
        L24:
            goto L107
        L26:
            android.graphics.PointF r1 = r6.A
            int r3 = r6.G
            float r3 = (float) r3
            float r4 = r6.f71q
            float r5 = r6.i
            float r4 = r4 + r5
            float r0 = r0 / r2
            float r4 = r4 + r0
            float r3 = r3 - r4
            r1.x = r3
            int r0 = r6.H
            float r0 = (float) r0
            float r3 = r6.r
            float r3 = r3 + r5
            android.graphics.RectF r4 = r6.w
            float r4 = r4.height()
            float r4 = r4 / r2
            float r3 = r3 + r4
            float r0 = r0 - r3
            r1.y = r0
            goto L107
        L48:
            android.graphics.PointF r1 = r6.A
            float r3 = r6.f71q
            float r4 = r6.i
            float r3 = r3 + r4
            float r0 = r0 / r2
            float r3 = r3 + r0
            r1.x = r3
            int r0 = r6.H
            float r0 = (float) r0
            float r3 = r6.r
            float r3 = r3 + r4
            android.graphics.RectF r4 = r6.w
            float r4 = r4.height()
            float r4 = r4 / r2
            float r3 = r3 + r4
            float r0 = r0 - r3
            r1.y = r0
            goto L107
        L66:
            android.graphics.PointF r1 = r6.A
            int r3 = r6.G
            float r3 = (float) r3
            float r4 = r6.f71q
            float r5 = r6.i
            float r4 = r4 + r5
            float r0 = r0 / r2
            float r4 = r4 + r0
            float r3 = r3 - r4
            r1.x = r3
            float r0 = r6.r
            float r0 = r0 + r5
            android.graphics.RectF r3 = r6.w
            float r3 = r3.height()
            float r3 = r3 / r2
            float r0 = r0 + r3
            r1.y = r0
            goto L107
        L84:
            android.graphics.PointF r1 = r6.A
            float r3 = r6.f71q
            float r4 = r6.i
            float r3 = r3 + r4
            float r0 = r0 / r2
            float r3 = r3 + r0
            r1.x = r3
            float r0 = r6.r
            float r0 = r0 + r4
            android.graphics.RectF r3 = r6.w
            float r3 = r3.height()
            float r3 = r3 / r2
            float r0 = r0 + r3
            r1.y = r0
            goto L107
        L9d:
            android.graphics.PointF r1 = r6.A
            int r3 = r6.G
            float r3 = (float) r3
            float r4 = r6.f71q
            float r5 = r6.i
            float r4 = r4 + r5
            float r0 = r0 / r2
            float r4 = r4 + r0
            float r3 = r3 - r4
            r1.x = r3
            int r0 = r6.H
            float r0 = (float) r0
            float r0 = r0 / r2
            r1.y = r0
            goto L107
        Lb3:
            android.graphics.PointF r1 = r6.A
            float r3 = r6.f71q
            float r4 = r6.i
            float r3 = r3 + r4
            float r0 = r0 / r2
            float r3 = r3 + r0
            r1.x = r3
            int r0 = r6.H
            float r0 = (float) r0
            float r0 = r0 / r2
            r1.y = r0
            goto L107
        Lc5:
            android.graphics.PointF r0 = r6.A
            int r1 = r6.G
            float r1 = (float) r1
            float r1 = r1 / r2
            r0.x = r1
            int r1 = r6.H
            float r1 = (float) r1
            float r3 = r6.r
            float r4 = r6.i
            float r3 = r3 + r4
            android.graphics.RectF r4 = r6.w
            float r4 = r4.height()
            float r4 = r4 / r2
            float r3 = r3 + r4
            float r1 = r1 - r3
            r0.y = r1
            goto L107
        Le1:
            android.graphics.PointF r0 = r6.A
            int r1 = r6.G
            float r1 = (float) r1
            float r1 = r1 / r2
            r0.x = r1
            float r1 = r6.r
            float r3 = r6.i
            float r1 = r1 + r3
            android.graphics.RectF r3 = r6.w
            float r3 = r3.height()
            float r3 = r3 / r2
            float r1 = r1 + r3
            r0.y = r1
            goto L107
        Lf9:
            android.graphics.PointF r0 = r6.A
            int r1 = r6.G
            float r1 = (float) r1
            float r1 = r1 / r2
            r0.x = r1
            int r1 = r6.H
            float r1 = (float) r1
            float r1 = r1 / r2
            r0.y = r1
        L107:
            r6.J()
            return
    }

    private void G(android.view.View r2) {
            r1 = this;
            android.view.View r0 = r2.getRootView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r1.N = r0
            if (r0 != 0) goto Ld
            r1.E(r2)
        Ld:
            return
    }

    private void H() {
            r4 = this;
            r0 = 0
            r1 = 1
            r4.setLayerType(r1, r0)
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r4.w = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r4.x = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r4.y = r0
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            r4.A = r0
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            r4.B = r0
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            r4.C = r0
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            r4.D = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.E = r0
            android.text.TextPaint r0 = new android.text.TextPaint
            r0.<init>()
            r4.I = r0
            r0.setAntiAlias(r1)
            android.text.TextPaint r0 = r4.I
            r0.setSubpixelText(r1)
            android.text.TextPaint r0 = r4.I
            r0.setFakeBoldText(r1)
            android.text.TextPaint r0 = r4.I
            android.graphics.PorterDuffXfermode r2 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.<init>(r3)
            r0.setXfermode(r2)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r4.J = r0
            r0.setAntiAlias(r1)
            android.graphics.Paint r0 = r4.J
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            r0.setStyle(r2)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r4.K = r0
            r0.setAntiAlias(r1)
            android.graphics.Paint r0 = r4.K
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r2)
            r0 = -1552832(0xffffffffffe84e40, float:NaN)
            r4.a = r0
            r0 = -1
            r4.c = r0
            android.content.Context r0 = r4.getContext()
            r2 = 1093664768(0x41300000, float:11.0)
            int r0 = q.rorbin.badgeview.d.a(r0, r2)
            float r0 = (float) r0
            r4.h = r0
            android.content.Context r0 = r4.getContext()
            r2 = 1084227584(0x40a00000, float:5.0)
            int r0 = q.rorbin.badgeview.d.a(r0, r2)
            float r0 = (float) r0
            r4.i = r0
            r0 = 0
            r4.j = r0
            r2 = 8388661(0x800035, float:1.1755018E-38)
            r4.p = r2
            android.content.Context r2 = r4.getContext()
            r3 = 1065353216(0x3f800000, float:1.0)
            int r2 = q.rorbin.badgeview.d.a(r2, r3)
            float r2 = (float) r2
            r4.f71q = r2
            android.content.Context r2 = r4.getContext()
            int r2 = q.rorbin.badgeview.d.a(r2, r3)
            float r2 = (float) r2
            r4.r = r2
            android.content.Context r2 = r4.getContext()
            r3 = 1119092736(0x42b40000, float:90.0)
            int r2 = q.rorbin.badgeview.d.a(r2, r3)
            float r2 = (float) r2
            r4.t = r2
            r4.o = r1
            r4.f = r0
            r0 = 1148846080(0x447a0000, float:1000.0)
            r4.setTranslationZ(r0)
            return
    }

    private void I() {
            r2 = this;
            boolean r0 = r2.o
            r2.O(r0)
            android.graphics.Paint r0 = r2.J
            int r1 = r2.a
            r0.setColor(r1)
            android.graphics.Paint r0 = r2.K
            int r1 = r2.b
            r0.setColor(r1)
            android.graphics.Paint r0 = r2.K
            float r1 = r2.g
            r0.setStrokeWidth(r1)
            android.text.TextPaint r0 = r2.I
            int r1 = r2.c
            r0.setColor(r1)
            android.text.TextPaint r0 = r2.I
            android.graphics.Paint$Align r1 = android.graphics.Paint.Align.CENTER
            r0.setTextAlign(r1)
            return
    }

    private void J() {
            r5 = this;
            r0 = 2
            int[] r0 = new int[r0]
            r5.getLocationOnScreen(r0)
            android.graphics.PointF r1 = r5.C
            android.graphics.PointF r2 = r5.A
            float r3 = r2.x
            r4 = 0
            r4 = r0[r4]
            float r4 = (float) r4
            float r3 = r3 + r4
            r1.x = r3
            float r2 = r2.y
            r3 = 1
            r0 = r0[r3]
            float r0 = (float) r0
            float r2 = r2 + r0
            r1.y = r2
            return
    }

    private void K() {
            r3 = this;
            android.graphics.RectF r0 = r3.w
            r1 = 0
            r0.left = r1
            r0.top = r1
            java.lang.String r0 = r3.k
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L16
            android.graphics.RectF r0 = r3.w
            r0.right = r1
            r0.bottom = r1
            goto L3a
        L16:
            android.text.TextPaint r0 = r3.I
            float r1 = r3.h
            r0.setTextSize(r1)
            android.graphics.RectF r0 = r3.w
            android.text.TextPaint r1 = r3.I
            java.lang.String r2 = r3.k
            float r1 = r1.measureText(r2)
            r0.right = r1
            android.text.TextPaint r0 = r3.I
            android.graphics.Paint$FontMetrics r0 = r0.getFontMetrics()
            r3.z = r0
            android.graphics.RectF r1 = r3.w
            float r2 = r0.descent
            float r0 = r0.ascent
            float r2 = r2 - r0
            r1.bottom = r2
        L3a:
            r3.A()
            return
    }

    private void L() {
            r1 = this;
            boolean r0 = r1.v
            if (r0 == 0) goto Le
            android.graphics.PointF r0 = r1.B
            r1.y(r0)
            r0 = 5
            r1.P(r0)
            return
        Le:
            r1.M()
            r0 = 4
            r1.P(r0)
            return
    }

    private void O(boolean r9) {
            r8 = this;
            android.content.Context r0 = r8.getContext()
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = q.rorbin.badgeview.d.a(r0, r1)
            android.content.Context r2 = r8.getContext()
            r3 = 1069547520(0x3fc00000, float:1.5)
            int r2 = q.rorbin.badgeview.d.a(r2, r3)
            int r4 = r8.u
            r5 = 1
            r6 = -1077936128(0xffffffffbfc00000, float:-1.5)
            if (r4 == r5) goto L5a
            r5 = 2
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r4 == r5) goto L49
            r5 = 3
            if (r4 == r5) goto L38
            r5 = 4
            if (r4 == r5) goto L27
            goto L6a
        L27:
            android.content.Context r0 = r8.getContext()
            int r0 = q.rorbin.badgeview.d.a(r0, r1)
            android.content.Context r1 = r8.getContext()
            int r2 = q.rorbin.badgeview.d.a(r1, r3)
            goto L6a
        L38:
            android.content.Context r0 = r8.getContext()
            int r0 = q.rorbin.badgeview.d.a(r0, r7)
            android.content.Context r1 = r8.getContext()
            int r2 = q.rorbin.badgeview.d.a(r1, r3)
            goto L6a
        L49:
            android.content.Context r0 = r8.getContext()
            int r0 = q.rorbin.badgeview.d.a(r0, r7)
            android.content.Context r1 = r8.getContext()
            int r2 = q.rorbin.badgeview.d.a(r1, r6)
            goto L6a
        L5a:
            android.content.Context r0 = r8.getContext()
            int r0 = q.rorbin.badgeview.d.a(r0, r1)
            android.content.Context r1 = r8.getContext()
            int r2 = q.rorbin.badgeview.d.a(r1, r6)
        L6a:
            android.graphics.Paint r1 = r8.J
            if (r9 == 0) goto L7a
            android.content.Context r9 = r8.getContext()
            r3 = 1073741824(0x40000000, float:2.0)
            int r9 = q.rorbin.badgeview.d.a(r9, r3)
            float r9 = (float) r9
            goto L7b
        L7a:
            r9 = 0
        L7b:
            float r0 = (float) r0
            float r2 = (float) r2
            r3 = 855638016(0x33000000, float:2.9802322E-8)
            r1.setShadowLayer(r9, r0, r2, r3)
            return
    }

    private void P(int r3) {
            r2 = this;
            q.rorbin.badgeview.a$a r0 = r2.M
            if (r0 == 0) goto L9
            android.view.View r1 = r2.F
            r0.a(r3, r2, r1)
        L9:
            return
    }

    private float getBadgeCircleRadius() {
            r4 = this;
            java.lang.String r0 = r4.k
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            float r0 = r4.i
            return r0
        Lb:
            java.lang.String r0 = r4.k
            int r0 = r0.length()
            r1 = 1
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto L42
            android.graphics.RectF r0 = r4.w
            float r0 = r0.height()
            android.graphics.RectF r1 = r4.w
            float r1 = r1.width()
            r3 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L35
            android.graphics.RectF r0 = r4.w
            float r0 = r0.height()
            float r0 = r0 / r2
            float r1 = r4.i
            float r1 = r1 * r3
            float r0 = r0 + r1
            return r0
        L35:
            android.graphics.RectF r0 = r4.w
            float r0 = r0.width()
            float r0 = r0 / r2
            float r1 = r4.i
            float r1 = r1 * r3
            float r0 = r0 + r1
            return r0
        L42:
            android.graphics.RectF r0 = r4.x
            float r0 = r0.height()
            float r0 = r0 / r2
            return r0
    }

    public void M() {
            r2 = this;
            android.graphics.PointF r0 = r2.B
            r1 = -998637568(0xffffffffc47a0000, float:-1000.0)
            r0.x = r1
            r0.y = r1
            r0 = 4
            r2.u = r0
            r0 = 0
            r2.N(r0)
            android.view.ViewParent r1 = r2.getParent()
            r1.requestDisallowInterceptTouchEvent(r0)
            r2.invalidate()
            return
    }

    protected void N(boolean r3) {
            r2 = this;
            android.view.ViewParent r0 = r2.getParent()
            if (r0 == 0) goto Lf
            android.view.ViewParent r0 = r2.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeView(r2)
        Lf:
            if (r3 == 0) goto L1d
            android.view.ViewGroup r3 = r2.N
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -1
            r0.<init>(r1, r1)
            r3.addView(r2, r0)
            return
        L1d:
            android.view.View r3 = r2.F
            r2.o(r3)
            return
    }

    @Override // q.rorbin.badgeview.a
    public float a(boolean r2) {
            r1 = this;
            if (r2 == 0) goto Le
            android.content.Context r2 = r1.getContext()
            float r0 = r1.h
            int r2 = q.rorbin.badgeview.d.b(r2, r0)
            float r2 = (float) r2
            return r2
        Le:
            float r2 = r1.h
            return r2
    }

    @Override // q.rorbin.badgeview.a
    public float b(boolean r2) {
            r1 = this;
            if (r2 == 0) goto Le
            android.content.Context r2 = r1.getContext()
            float r0 = r1.f71q
            int r2 = q.rorbin.badgeview.d.b(r2, r0)
            float r2 = (float) r2
            return r2
        Le:
            float r2 = r1.f71q
            return r2
    }

    @Override // q.rorbin.badgeview.a
    public float c(boolean r2) {
            r1 = this;
            if (r2 == 0) goto Le
            android.content.Context r2 = r1.getContext()
            float r0 = r1.r
            int r2 = q.rorbin.badgeview.d.b(r2, r0)
            float r2 = (float) r2
            return r2
        Le:
            float r2 = r1.r
            return r2
    }

    @Override // q.rorbin.badgeview.a
    public q.rorbin.badgeview.a d(int r3) {
            r2 = this;
            r2.a = r3
            if (r3 != 0) goto Lb
            android.text.TextPaint r3 = r2.I
            r0 = 0
            r3.setXfermode(r0)
            goto L17
        Lb:
            android.text.TextPaint r3 = r2.I
            android.graphics.PorterDuffXfermode r0 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            r0.<init>(r1)
            r3.setXfermode(r0)
        L17:
            r2.invalidate()
            return r2
    }

    @Override // q.rorbin.badgeview.a
    public void e(boolean r1) {
            r0 = this;
            if (r1 == 0) goto Lf
            android.view.ViewGroup r1 = r0.N
            if (r1 == 0) goto Lf
            r0.J()
            android.graphics.PointF r1 = r0.C
            r0.y(r1)
            return
        Lf:
            r1 = 0
            r0.h(r1)
            return
    }

    @Override // q.rorbin.badgeview.a
    public boolean f() {
            r1 = this;
            boolean r0 = r1.n
            return r0
    }

    @Override // q.rorbin.badgeview.a
    public q.rorbin.badgeview.a g(float r1, boolean r2) {
            r0 = this;
            q.rorbin.badgeview.a r1 = r0.i(r1, r1, r2)
            return r1
    }

    @Override // q.rorbin.badgeview.a
    public android.graphics.drawable.Drawable getBadgeBackground() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.d
            return r0
    }

    @Override // q.rorbin.badgeview.a
    public int getBadgeBackgroundColor() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    @Override // q.rorbin.badgeview.a
    public int getBadgeGravity() {
            r1 = this;
            int r0 = r1.p
            return r0
    }

    @Override // q.rorbin.badgeview.a
    public int getBadgeNumber() {
            r1 = this;
            int r0 = r1.j
            return r0
    }

    @Override // q.rorbin.badgeview.a
    public java.lang.String getBadgeText() {
            r1 = this;
            java.lang.String r0 = r1.k
            return r0
    }

    @Override // q.rorbin.badgeview.a
    public int getBadgeTextColor() {
            r1 = this;
            int r0 = r1.c
            return r0
    }

    @Override // q.rorbin.badgeview.a
    public android.graphics.PointF getDragCenter() {
            r1 = this;
            boolean r0 = r1.l
            if (r0 == 0) goto Lb
            boolean r0 = r1.m
            if (r0 == 0) goto Lb
            android.graphics.PointF r0 = r1.B
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // q.rorbin.badgeview.a
    public android.view.View getTargetView() {
            r1 = this;
            android.view.View r0 = r1.F
            return r0
    }

    @Override // q.rorbin.badgeview.a
    public q.rorbin.badgeview.a h(int r2) {
            r1 = this;
            r1.j = r2
            if (r2 >= 0) goto L9
            java.lang.String r2 = ""
            r1.k = r2
            goto L2b
        L9:
            r0 = 99
            if (r2 <= r0) goto L1b
            boolean r0 = r1.n
            if (r0 == 0) goto L16
            java.lang.String r2 = java.lang.String.valueOf(r2)
            goto L18
        L16:
            java.lang.String r2 = "99+"
        L18:
            r1.k = r2
            goto L2b
        L1b:
            if (r2 <= 0) goto L26
            if (r2 > r0) goto L26
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.k = r2
            goto L2b
        L26:
            if (r2 != 0) goto L2b
            r2 = 0
            r1.k = r2
        L2b:
            r1.K()
            r1.invalidate()
            return r1
    }

    @Override // q.rorbin.badgeview.a
    public q.rorbin.badgeview.a i(float r2, float r3, boolean r4) {
            r1 = this;
            if (r4 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            int r2 = q.rorbin.badgeview.d.a(r0, r2)
            float r2 = (float) r2
        Lb:
            r1.f71q = r2
            if (r4 == 0) goto L18
            android.content.Context r2 = r1.getContext()
            int r2 = q.rorbin.badgeview.d.a(r2, r3)
            float r3 = (float) r2
        L18:
            r1.r = r3
            r1.invalidate()
            return r1
    }

    @Override // q.rorbin.badgeview.a
    public q.rorbin.badgeview.a j(boolean r1) {
            r0 = this;
            r0.o = r1
            r0.invalidate()
            return r0
    }

    @Override // q.rorbin.badgeview.a
    public q.rorbin.badgeview.a k(boolean r2) {
            r1 = this;
            r1.n = r2
            int r2 = r1.j
            r0 = 99
            if (r2 <= r0) goto Lb
            r1.h(r2)
        Lb:
            return r1
    }

    @Override // q.rorbin.badgeview.a
    public q.rorbin.badgeview.a l(float r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto Lb
            android.content.Context r2 = r0.getContext()
            int r1 = q.rorbin.badgeview.d.a(r2, r1)
            float r1 = (float) r1
        Lb:
            r0.i = r1
            r0.A()
            r0.invalidate()
            return r0
    }

    @Override // q.rorbin.badgeview.a
    public q.rorbin.badgeview.a m(android.graphics.drawable.Drawable r1, boolean r2) {
            r0 = this;
            r0.f = r2
            r0.d = r1
            r0.A()
            r0.invalidate()
            return r0
    }

    @Override // q.rorbin.badgeview.a
    public boolean n() {
            r1 = this;
            boolean r0 = r1.o
            return r0
    }

    @Override // q.rorbin.badgeview.a
    public q.rorbin.badgeview.a o(android.view.View r6) {
            r5 = this;
            if (r6 == 0) goto L5a
            android.view.ViewParent r0 = r5.getParent()
            if (r0 == 0) goto L11
            android.view.ViewParent r0 = r5.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeView(r5)
        L11:
            android.view.ViewParent r0 = r6.getParent()
            if (r0 == 0) goto L52
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L52
            r5.F = r6
            boolean r1 = r0 instanceof q.rorbin.badgeview.QBadgeView.a
            if (r1 == 0) goto L27
            q.rorbin.badgeview.QBadgeView$a r0 = (q.rorbin.badgeview.QBadgeView.a) r0
            r0.addView(r5)
            return r5
        L27:
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r1 = r0.indexOfChild(r6)
            android.view.ViewGroup$LayoutParams r2 = r6.getLayoutParams()
            r0.removeView(r6)
            q.rorbin.badgeview.QBadgeView$a r3 = new q.rorbin.badgeview.QBadgeView$a
            android.content.Context r4 = r5.getContext()
            r3.<init>(r5, r4)
            boolean r4 = r0 instanceof android.widget.RelativeLayout
            if (r4 == 0) goto L48
            int r4 = r6.getId()
            r3.setId(r4)
        L48:
            r0.addView(r3, r1, r2)
            r3.addView(r6)
            r3.addView(r5)
            return r5
        L52:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "targetView must have a parent"
            r6.<init>(r0)
            throw r6
        L5a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "targetView can not be null"
            r6.<init>(r0)
            throw r6
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            android.view.ViewGroup r0 = r1.N
            if (r0 != 0) goto Lc
            android.view.View r0 = r1.F
            r1.G(r0)
        Lc:
            return
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r5) {
            r4 = this;
            q.rorbin.badgeview.b r0 = r4.L
            if (r0 == 0) goto L10
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L10
            q.rorbin.badgeview.b r0 = r4.L
            r0.b(r5)
            return
        L10:
            java.lang.String r0 = r4.k
            if (r0 == 0) goto L79
            r4.I()
            float r0 = r4.getBadgeCircleRadius()
            float r1 = r4.s
            android.graphics.PointF r2 = r4.C
            android.graphics.PointF r3 = r4.B
            float r2 = q.rorbin.badgeview.e.b(r2, r3)
            float r3 = r4.t
            float r2 = r2 / r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 - r2
            float r1 = r1 * r3
            boolean r2 = r4.l
            if (r2 == 0) goto L71
            boolean r2 = r4.m
            if (r2 == 0) goto L71
            android.graphics.PointF r2 = r4.B
            android.graphics.PointF r3 = r4.C
            int r2 = q.rorbin.badgeview.e.c(r2, r3)
            r4.u = r2
            boolean r2 = r4.o
            r4.O(r2)
            android.content.Context r2 = r4.getContext()
            r3 = 1069547520(0x3fc00000, float:1.5)
            int r2 = q.rorbin.badgeview.d.a(r2, r3)
            float r2 = (float) r2
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 >= 0) goto L55
            r2 = 1
            goto L56
        L55:
            r2 = 0
        L56:
            r4.v = r2
            if (r2 == 0) goto L64
            r1 = 3
            r4.P(r1)
            android.graphics.PointF r1 = r4.B
            r4.B(r5, r1, r0)
            return
        L64:
            r2 = 2
            r4.P(r2)
            r4.D(r5, r1, r0)
            android.graphics.PointF r1 = r4.B
            r4.B(r5, r1, r0)
            return
        L71:
            r4.F()
            android.graphics.PointF r1 = r4.A
            r4.B(r5, r1, r0)
        L79:
            return
    }

    @Override // android.view.View
    protected void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            r0.G = r1
            r0.H = r2
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r7) {
            r6 = this;
            int r0 = r7.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L45
            if (r0 == r2) goto L31
            r3 = 2
            if (r0 == r3) goto L18
            r3 = 3
            if (r0 == r3) goto L31
            r3 = 5
            if (r0 == r3) goto L45
            r3 = 6
            if (r0 == r3) goto L31
            goto La8
        L18:
            boolean r0 = r6.m
            if (r0 == 0) goto La8
            android.graphics.PointF r0 = r6.B
            float r3 = r7.getRawX()
            r0.x = r3
            android.graphics.PointF r0 = r6.B
            float r3 = r7.getRawY()
            r0.y = r3
            r6.invalidate()
            goto La8
        L31:
            int r0 = r7.getActionIndex()
            int r0 = r7.getPointerId(r0)
            if (r0 != 0) goto La8
            boolean r0 = r6.m
            if (r0 == 0) goto La8
            r6.m = r1
            r6.L()
            goto La8
        L45:
            float r0 = r7.getX()
            float r3 = r7.getY()
            boolean r4 = r6.l
            if (r4 == 0) goto La8
            int r4 = r7.getActionIndex()
            int r4 = r7.getPointerId(r4)
            if (r4 != 0) goto La8
            android.graphics.RectF r4 = r6.x
            float r5 = r4.left
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 <= 0) goto La8
            float r5 = r4.right
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto La8
            float r0 = r4.top
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto La8
            float r0 = r4.bottom
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto La8
            java.lang.String r0 = r6.k
            if (r0 == 0) goto La8
            r6.J()
            r6.m = r2
            r6.P(r2)
            android.content.Context r0 = r6.getContext()
            r3 = 1088421888(0x40e00000, float:7.0)
            int r0 = q.rorbin.badgeview.d.a(r0, r3)
            float r0 = (float) r0
            r6.s = r0
            android.view.ViewParent r0 = r6.getParent()
            r0.requestDisallowInterceptTouchEvent(r2)
            r6.N(r2)
            android.graphics.PointF r0 = r6.B
            float r3 = r7.getRawX()
            r0.x = r3
            android.graphics.PointF r0 = r6.B
            float r3 = r7.getRawY()
            r0.y = r3
        La8:
            boolean r0 = r6.m
            if (r0 != 0) goto Lb4
            boolean r7 = super.onTouchEvent(r7)
            if (r7 == 0) goto Lb3
            goto Lb4
        Lb3:
            return r1
        Lb4:
            return r2
    }

    @Override // q.rorbin.badgeview.a
    public q.rorbin.badgeview.a p(java.lang.String r1) {
            r0 = this;
            r0.k = r1
            r1 = 1
            r0.j = r1
            r0.K()
            r0.invalidate()
            return r0
    }

    @Override // q.rorbin.badgeview.a
    public boolean q() {
            r1 = this;
            boolean r0 = r1.l
            return r0
    }

    @Override // q.rorbin.badgeview.a
    public q.rorbin.badgeview.a r(q.rorbin.badgeview.a.InterfaceC0093a r2) {
            r1 = this;
            if (r2 == 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            r1.l = r0
            r1.M = r2
            return r1
    }

    @Override // q.rorbin.badgeview.a
    public float s(boolean r2) {
            r1 = this;
            if (r2 == 0) goto Le
            android.content.Context r2 = r1.getContext()
            float r0 = r1.i
            int r2 = q.rorbin.badgeview.d.b(r2, r0)
            float r2 = (float) r2
            return r2
        Le:
            float r2 = r1.i
            return r2
    }

    @Override // q.rorbin.badgeview.a
    public q.rorbin.badgeview.a t(int r1) {
            r0 = this;
            r0.c = r1
            r0.invalidate()
            return r0
    }

    @Override // q.rorbin.badgeview.a
    public q.rorbin.badgeview.a u(int r1, float r2, boolean r3) {
            r0 = this;
            r0.b = r1
            if (r3 == 0) goto Ld
            android.content.Context r1 = r0.getContext()
            int r1 = q.rorbin.badgeview.d.a(r1, r2)
            float r2 = (float) r1
        Ld:
            r0.g = r2
            r0.invalidate()
            return r0
    }

    @Override // q.rorbin.badgeview.a
    public q.rorbin.badgeview.a v(int r2) {
            r1 = this;
            r0 = 8388659(0x800033, float:1.1755015E-38)
            if (r2 == r0) goto L33
            r0 = 8388661(0x800035, float:1.1755018E-38)
            if (r2 == r0) goto L33
            r0 = 8388691(0x800053, float:1.175506E-38)
            if (r2 == r0) goto L33
            r0 = 8388693(0x800055, float:1.1755063E-38)
            if (r2 == r0) goto L33
            r0 = 17
            if (r2 == r0) goto L33
            r0 = 49
            if (r2 == r0) goto L33
            r0 = 81
            if (r2 == r0) goto L33
            r0 = 8388627(0x800013, float:1.175497E-38)
            if (r2 == r0) goto L33
            r0 = 8388629(0x800015, float:1.1754973E-38)
            if (r2 != r0) goto L2b
            goto L33
        L2b:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "only support Gravity.START | Gravity.TOP , Gravity.END | Gravity.TOP , Gravity.START | Gravity.BOTTOM , Gravity.END | Gravity.BOTTOM , Gravity.CENTER , Gravity.CENTER | Gravity.TOP , Gravity.CENTER | Gravity.BOTTOM ,Gravity.CENTER | Gravity.START , Gravity.CENTER | Gravity.END"
            r2.<init>(r0)
            throw r2
        L33:
            r1.p = r2
            r1.invalidate()
            return r1
    }

    @Override // q.rorbin.badgeview.a
    public q.rorbin.badgeview.a w(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r0 = 0
            q.rorbin.badgeview.a r2 = r1.m(r2, r0)
            return r2
    }

    @Override // q.rorbin.badgeview.a
    public q.rorbin.badgeview.a x(float r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto Lb
            android.content.Context r2 = r0.getContext()
            int r1 = q.rorbin.badgeview.d.a(r2, r1)
            float r1 = (float) r1
        Lb:
            r0.h = r1
            r0.K()
            r0.invalidate()
            return r0
    }

    protected void y(android.graphics.PointF r3) {
            r2 = this;
            java.lang.String r0 = r2.k
            if (r0 != 0) goto L5
            goto L10
        L5:
            q.rorbin.badgeview.b r0 = r2.L
            if (r0 == 0) goto L11
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto L10
            goto L11
        L10:
            return
        L11:
            r0 = 1
            r2.N(r0)
            q.rorbin.badgeview.b r0 = new q.rorbin.badgeview.b
            android.graphics.Bitmap r1 = r2.z()
            r0.<init>(r1, r3, r2)
            r2.L = r0
            r0.start()
            r3 = 0
            r2.h(r3)
            return
    }

    protected android.graphics.Bitmap z() {
            r6 = this;
            android.graphics.RectF r0 = r6.x
            float r0 = r0.width()
            int r0 = (int) r0
            android.content.Context r1 = r6.getContext()
            r2 = 1077936128(0x40400000, float:3.0)
            int r1 = q.rorbin.badgeview.d.a(r1, r2)
            int r0 = r0 + r1
            android.graphics.RectF r1 = r6.x
            float r1 = r1.height()
            int r1 = (int) r1
            android.content.Context r3 = r6.getContext()
            int r2 = q.rorbin.badgeview.d.a(r3, r2)
            int r1 = r1 + r2
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r0)
            android.graphics.PointF r2 = new android.graphics.PointF
            int r3 = r1.getWidth()
            float r3 = (float) r3
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            int r5 = r1.getHeight()
            float r5 = (float) r5
            float r5 = r5 / r4
            r2.<init>(r3, r5)
            float r3 = r6.getBadgeCircleRadius()
            r6.B(r1, r2, r3)
            return r0
    }
}
