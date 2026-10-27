package com.bxkj.base.view.seal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class a {
    private int a;
    float b;
    private java.lang.String c;
    private android.graphics.Canvas d;
    private android.graphics.Paint e;
    private android.graphics.Bitmap f;
    private int g;
    private int h;
    private int i;

    public a(int r2, java.lang.String r3, android.graphics.Bitmap r4) {
            r1 = this;
            r1.<init>()
            r0 = 10
            r1.a = r0
            r0 = 1112014848(0x42480000, float:50.0)
            r1.b = r0
            java.lang.String r0 = "#99FF0000"
            int r0 = android.graphics.Color.parseColor(r0)
            r1.i = r0
            r1.a = r2
            r1.c = r3
            r1.f = r4
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r4)
            r1.d = r2
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r1.e = r2
            return
    }

    private void a() {
            r21 = this;
            r0 = r21
            int r1 = r0.h
            int r1 = r1 / 2
            double r1 = (double) r1
            r3 = 4607632778762754458(0x3ff199999999999a, double:1.1)
            double r1 = r1 * r3
            float r1 = (float) r1
            int r2 = r0.g
            r3 = 4634766966517661696(0x4052000000000000, double:72.0)
            double r3 = java.lang.Math.toRadians(r3)
            float r3 = (float) r3
            r4 = 4630263366890291200(0x4042000000000000, double:36.0)
            double r4 = java.lang.Math.toRadians(r4)
            float r4 = (float) r4
            float r5 = (float) r2
            float r6 = (float) r2
            float r6 = r6 - r1
            double r7 = (double) r2
            double r9 = (double) r1
            double r11 = (double) r3
            double r13 = java.lang.Math.sin(r11)
            double r13 = r13 * r9
            double r13 = r7 - r13
            float r1 = (float) r13
            double r2 = (double) r2
            double r13 = java.lang.Math.cos(r11)
            double r13 = r13 * r9
            double r13 = r2 - r13
            float r13 = (float) r13
            double r14 = java.lang.Math.sin(r11)
            double r14 = r14 * r9
            double r14 = r14 + r7
            float r14 = (float) r14
            double r11 = java.lang.Math.cos(r11)
            double r11 = r11 * r9
            double r11 = r2 - r11
            float r11 = (float) r11
            r15 = r2
            double r2 = (double) r4
            double r17 = java.lang.Math.sin(r2)
            double r17 = r17 * r9
            r19 = r2
            double r2 = r7 - r17
            float r2 = (float) r2
            double r3 = java.lang.Math.cos(r19)
            double r3 = r3 * r9
            double r3 = r3 + r15
            float r3 = (float) r3
            double r17 = java.lang.Math.sin(r19)
            double r17 = r17 * r9
            double r7 = r7 + r17
            float r4 = (float) r7
            double r7 = java.lang.Math.cos(r19)
            double r9 = r9 * r7
            double r7 = r15 + r9
            float r7 = (float) r7
            android.graphics.Path r8 = new android.graphics.Path
            r8.<init>()
            r8.moveTo(r5, r6)
            r8.lineTo(r4, r7)
            r8.lineTo(r1, r13)
            r8.lineTo(r14, r11)
            r8.lineTo(r2, r3)
            r8.close()
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            int r2 = r0.i
            r1.setColor(r2)
            android.graphics.Canvas r2 = r0.d
            r2.drawPath(r8, r1)
            return
    }

    private void b() {
            r10 = this;
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>()
            r0 = -65536(0xffffffffffff0000, float:NaN)
            r5.setColor(r0)
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT_BOLD
            r5.setTypeface(r0)
            int r0 = r10.h
            int r0 = r0 / 5
            int r0 = r0 + 5
            float r0 = (float) r0
            r5.setTextSize(r0)
            android.graphics.Paint$Align r0 = android.graphics.Paint.Align.CENTER
            r5.setTextAlign(r0)
            android.graphics.RectF r6 = new android.graphics.RectF
            int r0 = r10.h
            int r1 = r0 * 2
            float r1 = (float) r1
            int r0 = r0 * 2
            float r0 = (float) r0
            r2 = 0
            r6.<init>(r2, r2, r1, r0)
            float r0 = r10.b
            java.lang.String r1 = r10.c
            int r1 = r1.length()
            float r1 = (float) r1
            float r0 = r0 * r1
            r1 = 1082130432(0x40800000, float:4.0)
            float r0 = r0 / r1
            r1 = 1119092736(0x42b40000, float:90.0)
            float r0 = r0 + r1
            float r1 = r10.b
            r2 = 1090519040(0x41000000, float:8.0)
            float r1 = r1 / r2
            float r7 = r0 - r1
            r0 = 0
            r8 = 0
        L46:
            java.lang.String r0 = r10.c
            int r0 = r0.length()
            if (r8 >= r0) goto L7f
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            float r0 = r10.b
            float r1 = (float) r8
            float r1 = r1 * r0
            r3 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r3
            float r1 = r7 - r1
            float r1 = -r1
            r2.addArc(r6, r1, r0)
            android.graphics.Canvas r0 = r10.d
            java.lang.String r1 = r10.c
            char r1 = r1.charAt(r8)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r3 = r10.h
            int r4 = r3 / 3
            float r4 = (float) r4
            float r4 = -r4
            int r3 = r3 / 3
            float r3 = (float) r3
            r9 = r4
            r4 = r3
            r3 = r9
            r0.drawTextOnPath(r1, r2, r3, r4, r5)
            int r8 = r8 + 1
            goto L46
        L7f:
            return
    }

    private void d() {
            r5 = this;
            android.graphics.Canvas r0 = r5.d
            int r0 = r0.getWidth()
            int r0 = r0 / 2
            r5.g = r0
            int r1 = r5.a
            int r1 = r1 / 2
            int r0 = r0 - r1
            r5.h = r0
            android.graphics.Paint r0 = r5.e
            int r1 = r5.i
            r0.setColor(r1)
            android.graphics.Paint r0 = r5.e
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r1)
            android.graphics.Paint r0 = r5.e
            int r1 = r5.a
            float r1 = (float) r1
            r0.setStrokeWidth(r1)
            android.graphics.Paint r0 = r5.e
            r1 = 1
            r0.setAntiAlias(r1)
            android.graphics.Canvas r0 = r5.d
            int r1 = r5.g
            float r2 = (float) r1
            float r1 = (float) r1
            int r3 = r5.h
            float r3 = (float) r3
            android.graphics.Paint r4 = r5.e
            r0.drawCircle(r2, r1, r3, r4)
            return
    }

    private void f() {
            r0 = this;
            r0.d()
            r0.a()
            r0.b()
            return
    }

    public android.graphics.Bitmap c() {
            r1 = this;
            r1.f()
            android.graphics.Bitmap r0 = r1.f
            return r0
    }

    public int e() {
            r1 = this;
            int r0 = r1.a
            return r0
    }
}
