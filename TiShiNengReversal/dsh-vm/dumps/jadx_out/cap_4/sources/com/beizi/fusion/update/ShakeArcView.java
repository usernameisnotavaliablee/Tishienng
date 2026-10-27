package com.beizi.fusion.update;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ShakeArcView extends android.view.View {
    private int a;
    private int b;
    private int c;
    private android.graphics.Paint d;
    private android.graphics.Paint e;
    private double f;
    private double g;
    private int h;
    private int i;

    public ShakeArcView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ShakeArcView(android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public ShakeArcView(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            java.lang.String r1 = "#CACCCA"
            int r1 = android.graphics.Color.parseColor(r1)
            r0.a = r1
            java.lang.String r1 = "#FFFFFF"
            int r1 = android.graphics.Color.parseColor(r1)
            r0.b = r1
            r1 = 6
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

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r20) {
            r19 = this;
            r0 = r19
            super.onDraw(r20)
            android.graphics.RectF r2 = new android.graphics.RectF     // Catch: java.lang.Exception -> L185
            int r1 = r0.c     // Catch: java.lang.Exception -> L185
            int r3 = r1 / 2
            float r3 = (float) r3     // Catch: java.lang.Exception -> L185
            r10 = 2
            int r1 = r1 / r10
            float r1 = (float) r1     // Catch: java.lang.Exception -> L185
            int r4 = r0.getWidth()     // Catch: java.lang.Exception -> L185
            int r5 = r0.c     // Catch: java.lang.Exception -> L185
            int r5 = r5 / r10
            int r4 = r4 - r5
            float r4 = (float) r4     // Catch: java.lang.Exception -> L185
            int r5 = r0.getHeight()     // Catch: java.lang.Exception -> L185
            int r6 = r0.c     // Catch: java.lang.Exception -> L185
            int r6 = r6 / r10
            int r5 = r5 - r6
            float r5 = (float) r5     // Catch: java.lang.Exception -> L185
            r2.<init>(r3, r1, r4, r5)     // Catch: java.lang.Exception -> L185
            android.graphics.Paint r6 = r0.d     // Catch: java.lang.Exception -> L185
            r3 = 1129775104(0x43570000, float:215.0)
            r4 = 1121714176(0x42dc0000, float:110.0)
            r5 = 0
            r1 = r20
            r1.drawArc(r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L185
            double r3 = r0.g     // Catch: java.lang.Exception -> L185
            r7 = 1
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto Lb4
            double r8 = r0.f     // Catch: java.lang.Exception -> L185
            int r1 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r1 <= 0) goto Lb4
            int r1 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r1 < 0) goto L45
            r0.g = r8     // Catch: java.lang.Exception -> L185
        L45:
            double r3 = r0.g     // Catch: java.lang.Exception -> L185
            float r1 = (float) r3     // Catch: java.lang.Exception -> L185
            double r3 = (double) r1     // Catch: java.lang.Exception -> L185
            double r3 = r3 / r8
            float r8 = (float) r3     // Catch: java.lang.Exception -> L185
            java.lang.String r1 = "sweepAngle"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L185
            r3.<init>()     // Catch: java.lang.Exception -> L185
            java.lang.String r4 = "sweepAngle:"
            r3.append(r4)     // Catch: java.lang.Exception -> L185
            r3.append(r8)     // Catch: java.lang.Exception -> L185
            java.lang.String r4 = ",mMaxProgress:"
            r3.append(r4)     // Catch: java.lang.Exception -> L185
            double r4 = r0.f     // Catch: java.lang.Exception -> L185
            r3.append(r4)     // Catch: java.lang.Exception -> L185
            java.lang.String r4 = ",mCurrentProgress:"
            r3.append(r4)     // Catch: java.lang.Exception -> L185
            double r4 = r0.g     // Catch: java.lang.Exception -> L185
            r3.append(r4)     // Catch: java.lang.Exception -> L185
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L185
            com.beizi.fusion.tool.aa.c(r1, r3)     // Catch: java.lang.Exception -> L185
            int r1 = r0.h     // Catch: java.lang.Exception -> L185
            r3 = 1121714176(0x42dc0000, float:110.0)
            if (r1 != r7) goto L88
            float r4 = r8 * r3
            android.graphics.Paint r6 = r0.e     // Catch: java.lang.Exception -> L185
            r3 = 1129775104(0x43570000, float:215.0)
            r5 = 0
            r1 = r20
            r1.drawArc(r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L185
            goto Lb4
        L88:
            if (r1 != r10) goto L99
            float r1 = -r8
            float r4 = r1 * r3
            android.graphics.Paint r6 = r0.e     // Catch: java.lang.Exception -> L185
            r3 = 1134723072(0x43a28000, float:325.0)
            r5 = 0
            r1 = r20
            r1.drawArc(r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L185
            goto Lb4
        L99:
            float r1 = -r8
            r9 = 1113325568(0x425c0000, float:55.0)
            float r4 = r1 * r9
            android.graphics.Paint r6 = r0.e     // Catch: java.lang.Exception -> L185
            r3 = 1132920832(0x43870000, float:270.0)
            r5 = 0
            r1 = r20
            r1.drawArc(r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L185
            float r4 = r8 * r9
            android.graphics.Paint r6 = r0.e     // Catch: java.lang.Exception -> L185
            r3 = 1132920832(0x43870000, float:270.0)
            r5 = 0
            r1 = r20
            r1.drawArc(r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L185
        Lb4:
            java.lang.String r1 = "#CACCCA"
            int r1 = android.graphics.Color.parseColor(r1)     // Catch: java.lang.Exception -> L185
            double r2 = r0.g     // Catch: java.lang.Exception -> L185
            double r4 = r0.f     // Catch: java.lang.Exception -> L185
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto Lc8
            java.lang.String r1 = "#FFFFFF"
            int r1 = android.graphics.Color.parseColor(r1)     // Catch: java.lang.Exception -> L185
        Lc8:
            r9 = r1
            int r1 = r0.getWidth()     // Catch: java.lang.Exception -> L185
            int r2 = r0.getHeight()     // Catch: java.lang.Exception -> L185
            int r3 = java.lang.Math.min(r1, r2)     // Catch: java.lang.Exception -> L185
            int r3 = r3 / r10
            int r4 = r0.c     // Catch: java.lang.Exception -> L185
            int r5 = r0.i     // Catch: java.lang.Exception -> L185
            int r4 = r4 * r5
            int r3 = r3 + r4
            int r11 = r1 / 2
            int r12 = r2 / 2
            r1 = 4631530004285489152(0x4046800000000000, double:45.0)
            double r1 = java.lang.Math.toRadians(r1)     // Catch: java.lang.Exception -> L185
            double r1 = java.lang.Math.cos(r1)     // Catch: java.lang.Exception -> L185
            float r1 = (float) r1     // Catch: java.lang.Exception -> L185
            int r2 = r0.h     // Catch: java.lang.Exception -> L185
            r13 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            r4 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            r15 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            if (r2 != r7) goto L11f
            double r6 = (double) r11     // Catch: java.lang.Exception -> L185
            double r6 = r6 * r13
            float r2 = (float) r3     // Catch: java.lang.Exception -> L185
            float r1 = r1 * r2
            double r1 = (double) r1     // Catch: java.lang.Exception -> L185
            double r15 = r15 * r1
            double r13 = r6 + r15
            float r3 = (float) r13     // Catch: java.lang.Exception -> L185
            int r8 = r12 / 2
            double r13 = (double) r8     // Catch: java.lang.Exception -> L185
            double r1 = r1 * r4
            double r13 = r13 - r1
            float r4 = (float) r13     // Catch: java.lang.Exception -> L185
            double r6 = r6 + r1
            float r5 = (float) r6     // Catch: java.lang.Exception -> L185
            int r12 = r12 / r10
            float r6 = (float) r12     // Catch: java.lang.Exception -> L185
            r2 = 1
            r7 = r3
            r8 = r6
            r1 = r20
            r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L185
            return
        L11f:
            if (r2 != r10) goto L144
            int r0 = r11 / 2
            double r6 = (double) r0     // Catch: java.lang.Exception -> L185
            float r0 = (float) r3     // Catch: java.lang.Exception -> L185
            float r1 = r1 * r0
            double r0 = (double) r1     // Catch: java.lang.Exception -> L185
            double r15 = r15 * r0
            double r6 = r6 - r15
            float r3 = (float) r6     // Catch: java.lang.Exception -> L185
            int r2 = r12 / 2
            double r6 = (double) r2     // Catch: java.lang.Exception -> L185
            double r0 = r0 * r4
            double r6 = r6 - r0
            float r4 = (float) r6     // Catch: java.lang.Exception -> L185
            int r11 = r11 / r10
            double r5 = (double) r11     // Catch: java.lang.Exception -> L185
            double r5 = r5 - r0
            float r5 = (float) r5     // Catch: java.lang.Exception -> L185
            int r12 = r12 / r10
            float r6 = (float) r12     // Catch: java.lang.Exception -> L185
            r2 = 1
            r7 = r3
            r8 = r6
            r0 = r19
            r1 = r20
            r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L185
            return
        L144:
            int r0 = r11 / 2
            double r6 = (double) r0     // Catch: java.lang.Exception -> L185
            float r0 = (float) r3     // Catch: java.lang.Exception -> L185
            float r1 = r1 * r0
            double r0 = (double) r1     // Catch: java.lang.Exception -> L185
            double r15 = r15 * r0
            double r6 = r6 - r15
            float r3 = (float) r6     // Catch: java.lang.Exception -> L185
            int r2 = r12 / 2
            double r6 = (double) r2     // Catch: java.lang.Exception -> L185
            double r17 = r0 * r4
            double r6 = r6 - r17
            float r4 = (float) r6     // Catch: java.lang.Exception -> L185
            int r0 = r11 / 2
            double r0 = (double) r0     // Catch: java.lang.Exception -> L185
            double r0 = r0 - r17
            float r5 = (float) r0     // Catch: java.lang.Exception -> L185
            int r0 = r12 / 2
            float r6 = (float) r0     // Catch: java.lang.Exception -> L185
            r2 = 1
            r7 = r3
            r8 = r6
            r0 = r19
            r1 = r20
            r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L185
            double r0 = (double) r11     // Catch: java.lang.Exception -> L185
            double r0 = r0 * r13
            double r2 = r0 + r15
            float r3 = (float) r2     // Catch: java.lang.Exception -> L185
            int r2 = r12 / 2
            double r4 = (double) r2     // Catch: java.lang.Exception -> L185
            double r4 = r4 - r17
            float r4 = (float) r4     // Catch: java.lang.Exception -> L185
            double r0 = r0 + r17
            float r5 = (float) r0     // Catch: java.lang.Exception -> L185
            int r12 = r12 / r10
            float r6 = (float) r12     // Catch: java.lang.Exception -> L185
            r2 = 1
            r7 = r3
            r8 = r6
            r0 = r19
            r1 = r20
            r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L185
        L185:
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

    public com.beizi.fusion.update.ShakeArcView setArrowDirection(int r1) {
            r0 = this;
            r0.h = r1
            return r0
    }

    public com.beizi.fusion.update.ShakeArcView setCurrentProgress(double r3) {
            r2 = this;
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r3 = r3 * r0
            r2.g = r3
            r2.invalidate()
            return r2
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

    public com.beizi.fusion.update.ShakeArcView setMaxProgress(double r3) {
            r2 = this;
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r3 = r3 * r0
            r2.f = r3
            return r2
    }
}
