package xyz.adscope.ad.ad.nativead.render.view.asnp.prefab;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class ScopeIndicateArrowView extends android.view.View {
    private final int a;
    private final int b;
    private int c;
    private android.graphics.Paint d;
    private android.graphics.Paint e;
    private double f;
    private double g;
    private int h;
    private int i;

    public ScopeIndicateArrowView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ScopeIndicateArrowView(android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public ScopeIndicateArrowView(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            java.lang.String r1 = "#CACCCA"
            int r1 = android.graphics.Color.parseColor(r1)
            r0.a = r1
            java.lang.String r1 = "#FFFFFF"
            int r1 = android.graphics.Color.parseColor(r1)
            r0.b = r1
            r1 = 8
            r0.c = r1
            r1 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r0.f = r1
            r0.g = r1
            r1 = 0
            r0.h = r1
            r1 = 2
            r0.i = r1
            r0.a()
            r0.b()
            return
    }

    private void a() {
            r2 = this;
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r2.d = r0
            r1 = 1
            r0.setAntiAlias(r1)
            android.graphics.Paint r0 = r2.d
            r0.setDither(r1)
            android.graphics.Paint r0 = r2.d
            int r1 = r2.c
            float r1 = (float) r1
            r0.setStrokeWidth(r1)
            android.graphics.Paint r0 = r2.d
            int r1 = r2.a
            r0.setColor(r1)
            android.graphics.Paint r0 = r2.d
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r1)
            android.graphics.Paint r0 = r2.d
            android.graphics.Paint$Cap r1 = android.graphics.Paint.Cap.ROUND
            r0.setStrokeCap(r1)
            return
    }

    private void a(android.graphics.Canvas r17, int r18, int r19, float r20, float r21, int r22) {
            r16 = this;
            int r0 = r18 / 2
            double r0 = (double) r0
            float r2 = r20 * r21
            double r2 = (double) r2
            r4 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            double r4 = r4 * r2
            double r4 = r0 - r4
            float r9 = (float) r4
            int r4 = r19 / 2
            double r5 = (double) r4
            r7 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            double r2 = r2 * r7
            double r5 = r5 - r2
            float r10 = (float) r5
            double r0 = r0 - r2
            float r11 = (float) r0
            float r12 = (float) r4
            r8 = 1
            r13 = r9
            r14 = r12
            r6 = r16
            r7 = r17
            r15 = r22
            r6.a(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
    }

    private void a(android.graphics.Canvas r3, boolean r4, float r5, float r6, float r7, float r8, float r9, float r10, int r11) {
            r2 = this;
            android.graphics.Paint r0 = new android.graphics.Paint     // Catch: java.lang.Exception -> L30
            r0.<init>()     // Catch: java.lang.Exception -> L30
            r1 = 1
            r0.setAntiAlias(r1)     // Catch: java.lang.Exception -> L30
            r0.setColor(r11)     // Catch: java.lang.Exception -> L30
            if (r4 == 0) goto L14
            android.graphics.Paint$Style r4 = android.graphics.Paint.Style.FILL     // Catch: java.lang.Exception -> L30
            r0.setStyle(r4)     // Catch: java.lang.Exception -> L30
            goto L19
        L14:
            android.graphics.Paint$Style r4 = android.graphics.Paint.Style.STROKE     // Catch: java.lang.Exception -> L30
            r0.setStyle(r4)     // Catch: java.lang.Exception -> L30
        L19:
            android.graphics.Path r4 = new android.graphics.Path     // Catch: java.lang.Exception -> L30
            r4.<init>()     // Catch: java.lang.Exception -> L30
            r4.moveTo(r5, r6)     // Catch: java.lang.Exception -> L30
            r4.lineTo(r7, r8)     // Catch: java.lang.Exception -> L30
            r4.lineTo(r9, r10)     // Catch: java.lang.Exception -> L30
            r4.lineTo(r5, r6)     // Catch: java.lang.Exception -> L30
            r4.close()     // Catch: java.lang.Exception -> L30
            r3.drawPath(r4, r0)     // Catch: java.lang.Exception -> L30
        L30:
            return
    }

    private void b() {
            r2 = this;
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r2.e = r0
            r1 = 1
            r0.setAntiAlias(r1)
            android.graphics.Paint r0 = r2.e
            r0.setDither(r1)
            android.graphics.Paint r0 = r2.e
            int r1 = r2.c
            float r1 = (float) r1
            r0.setStrokeWidth(r1)
            android.graphics.Paint r0 = r2.e
            int r1 = r2.b
            r0.setColor(r1)
            android.graphics.Paint r0 = r2.e
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r1)
            android.graphics.Paint r0 = r2.e
            android.graphics.Paint$Cap r1 = android.graphics.Paint.Cap.ROUND
            r0.setStrokeCap(r1)
            return
    }

    private void b(android.graphics.Canvas r17, int r18, int r19, float r20, float r21, int r22) {
            r16 = this;
            r0 = r18
            double r0 = (double) r0
            r2 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            double r0 = r0 * r2
            float r2 = r20 * r21
            double r2 = (double) r2
            r4 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            double r4 = r4 * r2
            double r4 = r4 + r0
            float r9 = (float) r4
            int r4 = r19 / 2
            double r5 = (double) r4
            r7 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            double r2 = r2 * r7
            double r5 = r5 - r2
            float r10 = (float) r5
            double r0 = r0 + r2
            float r11 = (float) r0
            float r12 = (float) r4
            r8 = 1
            r13 = r9
            r14 = r12
            r6 = r16
            r7 = r17
            r15 = r22
            r6.a(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r14) {
            r13 = this;
            super.onDraw(r14)
            android.graphics.RectF r1 = new android.graphics.RectF     // Catch: java.lang.Exception -> Ld8
            int r0 = r13.c     // Catch: java.lang.Exception -> Ld8
            float r0 = (float) r0     // Catch: java.lang.Exception -> Ld8
            r2 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r2
            int r3 = r13.getWidth()     // Catch: java.lang.Exception -> Ld8
            float r3 = (float) r3     // Catch: java.lang.Exception -> Ld8
            int r4 = r13.c     // Catch: java.lang.Exception -> Ld8
            float r4 = (float) r4     // Catch: java.lang.Exception -> Ld8
            float r4 = r4 / r2
            float r3 = r3 - r4
            int r4 = r13.getHeight()     // Catch: java.lang.Exception -> Ld8
            float r4 = (float) r4     // Catch: java.lang.Exception -> Ld8
            int r5 = r13.c     // Catch: java.lang.Exception -> Ld8
            float r5 = (float) r5     // Catch: java.lang.Exception -> Ld8
            float r5 = r5 / r2
            float r4 = r4 - r5
            r1.<init>(r0, r0, r3, r4)     // Catch: java.lang.Exception -> Ld8
            android.graphics.Paint r5 = r13.d     // Catch: java.lang.Exception -> Ld8
            r2 = 1129775104(0x43570000, float:215.0)
            r3 = 1121714176(0x42dc0000, float:110.0)
            r4 = 0
            r0 = r14
            r0.drawArc(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> Ld8
            double r2 = r13.g     // Catch: java.lang.Exception -> Ld8
            r14 = 1
            r4 = 0
            r6 = 2
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 < 0) goto L80
            double r7 = r13.f     // Catch: java.lang.Exception -> Ld8
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 <= 0) goto L80
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 < 0) goto L43
            r13.g = r7     // Catch: java.lang.Exception -> Ld8
        L43:
            double r2 = r13.g     // Catch: java.lang.Exception -> Ld8
            float r2 = (float) r2     // Catch: java.lang.Exception -> Ld8
            double r2 = (double) r2     // Catch: java.lang.Exception -> Ld8
            double r2 = r2 / r7
            float r7 = (float) r2     // Catch: java.lang.Exception -> Ld8
            int r2 = r13.h     // Catch: java.lang.Exception -> Ld8
            r3 = 1121714176(0x42dc0000, float:110.0)
            if (r2 != r14) goto L5a
            float r3 = r3 * r7
            android.graphics.Paint r5 = r13.e     // Catch: java.lang.Exception -> Ld8
            r2 = 1129775104(0x43570000, float:215.0)
            r4 = 0
            r0.drawArc(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> Ld8
            goto L80
        L5a:
            if (r2 != r6) goto L69
            float r2 = -r7
            float r3 = r3 * r2
            android.graphics.Paint r5 = r13.e     // Catch: java.lang.Exception -> Ld8
            r2 = 1134723072(0x43a28000, float:325.0)
            r4 = 0
            r0.drawArc(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> Ld8
            goto L80
        L69:
            float r2 = -r7
            r8 = 1113325568(0x425c0000, float:55.0)
            float r3 = r2 * r8
            android.graphics.Paint r5 = r13.e     // Catch: java.lang.Exception -> Ld8
            r2 = 1132920832(0x43870000, float:270.0)
            r4 = 0
            r0.drawArc(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> Ld8
            float r3 = r7 * r8
            android.graphics.Paint r5 = r13.e     // Catch: java.lang.Exception -> Ld8
            r2 = 1132920832(0x43870000, float:270.0)
            r4 = 0
            r0.drawArc(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> Ld8
        L80:
            java.lang.String r1 = "#CACCCA"
            int r1 = android.graphics.Color.parseColor(r1)     // Catch: java.lang.Exception -> Ld8
            double r2 = r13.g     // Catch: java.lang.Exception -> Ld8
            double r4 = r13.f     // Catch: java.lang.Exception -> Ld8
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L94
            java.lang.String r1 = "#FFFFFF"
            int r1 = android.graphics.Color.parseColor(r1)     // Catch: java.lang.Exception -> Ld8
        L94:
            r12 = r1
            int r1 = r13.getWidth()     // Catch: java.lang.Exception -> Ld8
            int r2 = r13.getHeight()     // Catch: java.lang.Exception -> Ld8
            int r3 = java.lang.Math.min(r1, r2)     // Catch: java.lang.Exception -> Ld8
            int r3 = r3 / r6
            int r4 = r13.c     // Catch: java.lang.Exception -> Ld8
            int r5 = r13.i     // Catch: java.lang.Exception -> Ld8
            int r4 = r4 * r5
            int r3 = r3 + r4
            int r8 = r1 / 2
            int r9 = r2 / 2
            r1 = 4631530004285489152(0x4046800000000000, double:45.0)
            double r1 = java.lang.Math.toRadians(r1)     // Catch: java.lang.Exception -> Ld8
            double r1 = java.lang.Math.cos(r1)     // Catch: java.lang.Exception -> Ld8
            float r10 = (float) r1     // Catch: java.lang.Exception -> Ld8
            int r1 = r13.h     // Catch: java.lang.Exception -> Ld8
            if (r1 != r14) goto Lc6
            float r11 = (float) r3     // Catch: java.lang.Exception -> Ld8
            r6 = r13
            r7 = r0
            r6.b(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> Ld8
            return
        Lc6:
            if (r1 != r6) goto Lcf
            float r11 = (float) r3     // Catch: java.lang.Exception -> Ld8
            r6 = r13
            r7 = r0
            r6.a(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> Ld8
            return
        Lcf:
            float r11 = (float) r3     // Catch: java.lang.Exception -> Ld8
            r6 = r13
            r7 = r0
            r6.a(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> Ld8
            r6.b(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> Ld8
        Ld8:
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r2, int r3) {
            r1 = this;
            super.onMeasure(r2, r3)
            int r2 = android.view.View.MeasureSpec.getSize(r2)
            int r0 = r1.c
            int r0 = r0 * 2
            int r2 = r2 + r0
            int r3 = android.view.View.MeasureSpec.getSize(r3)
            int r0 = r1.c
            int r0 = r0 * 2
            int r3 = r3 + r0
            int r0 = java.lang.Math.min(r2, r3)
            int r2 = java.lang.Math.min(r2, r3)
            r1.setMeasuredDimension(r0, r2)
            return
    }

    public void setArrowDirection(int r1) {
            r0 = this;
            r0.h = r1
            return
    }

    public void setCurrentProgress(double r3) {
            r2 = this;
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r3 = r3 * r0
            r2.g = r3
            r2.invalidate()
            return
    }

    public void setLineRadius(int r1) {
            r0 = this;
            r0.i = r1
            return
    }

    public void setLineWidth(int r2) {
            r1 = this;
            r1.c = r2     // Catch: java.lang.Exception -> L14
            android.graphics.Paint r0 = r1.d     // Catch: java.lang.Exception -> L14
            if (r0 == 0) goto La
            float r2 = (float) r2     // Catch: java.lang.Exception -> L14
            r0.setStrokeWidth(r2)     // Catch: java.lang.Exception -> L14
        La:
            android.graphics.Paint r2 = r1.e     // Catch: java.lang.Exception -> L14
            if (r2 == 0) goto L14
            int r0 = r1.c     // Catch: java.lang.Exception -> L14
            float r0 = (float) r0     // Catch: java.lang.Exception -> L14
            r2.setStrokeWidth(r0)     // Catch: java.lang.Exception -> L14
        L14:
            return
    }

    public void setMaxProgress(double r3) {
            r2 = this;
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r3 = r3 * r0
            r2.f = r3
            return
    }
}
