package com.bxkj.student.v2.ai.fitness.posedetector;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class d extends com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay.a {

    /* renamed from: o, reason: collision with root package name */
    private static final float f1331o = 8.0f;

    /* renamed from: p, reason: collision with root package name */
    private static final float f1332p = 30.0f;

    /* renamed from: q, reason: collision with root package name */
    private static final float f1333q = 30.0f;

    /* renamed from: r, reason: collision with root package name */
    private static final float f1334r = 200.0f;
    private final com.google.mlkit.vision.pose.Pose b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private float f;
    private float g;
    private final java.util.List<java.lang.String> h;
    private final android.graphics.Paint i;
    private final android.graphics.Paint j;
    private final android.graphics.Paint k;

    /* renamed from: l, reason: collision with root package name */
    private final android.graphics.Paint f1335l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f1336m;

    /* renamed from: n, reason: collision with root package name */
    private java.lang.String f1337n;

    d(com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay r1, com.google.mlkit.vision.pose.Pose r2, boolean r3, boolean r4, boolean r5, java.util.List<java.lang.String> r6, boolean r7, java.lang.String r8) {
            r0 = this;
            r0.<init>(r1)
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r0.f = r1
            r1 = 1
            r0.g = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.h = r6
            r0.f1336m = r7
            r0.f1337n = r8
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r0.i = r1
            r2 = -1
            r1.setColor(r2)
            r3 = 1128792064(0x43480000, float:200.0)
            r1.setTextSize(r3)
            r3 = 0
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r5 = 1084227584(0x40a00000, float:5.0)
            r1.setShadowLayer(r5, r3, r3, r4)
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r0.f1335l = r1
            r3 = 1106247680(0x41f00000, float:30.0)
            r1.setStrokeWidth(r3)
            r1.setColor(r2)
            r1.setTextSize(r3)
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r0.j = r1
            r1.setStrokeWidth(r3)
            r2 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
            r1.setColor(r2)
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r0.k = r1
            r1.setStrokeWidth(r3)
            r2 = -256(0xffffffffffffff00, float:NaN)
            r1.setColor(r2)
            return
    }

    private void k(android.graphics.Paint r7, android.graphics.Canvas r8, float r9) {
            r6 = this;
            boolean r0 = r6.d
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = r6.e
            if (r0 == 0) goto L24
            float r8 = r6.f
            float r8 = r6.f(r8)
            r0 = -1165815185(0xffffffffba83126f, float:-0.001)
            float r8 = java.lang.Math.min(r0, r8)
            float r0 = r6.g
            float r0 = r6.f(r0)
            r1 = 981668463(0x3a83126f, float:0.001)
            float r0 = java.lang.Math.max(r1, r0)
            goto L39
        L24:
            int r0 = r8.getWidth()
            float r0 = (float) r0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r0 = r0 * r1
            int r8 = r8.getWidth()
            float r8 = (float) r8
            r1 = 1065353216(0x3f800000, float:1.0)
            float r8 = r8 * r1
            r5 = r0
            r0 = r8
            r8 = r5
        L39:
            float r9 = r6.f(r9)
            r1 = 0
            r2 = 0
            r3 = 1132396544(0x437f0000, float:255.0)
            r4 = 255(0xff, float:3.57E-43)
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 >= 0) goto L55
            float r9 = r9 / r8
            float r9 = r9 * r3
            int r8 = (int) r9
            int r8 = com.google.common.primitives.Ints.constrainToRange(r8, r2, r4)
            int r8 = 255 - r8
            r7.setARGB(r4, r4, r8, r8)
            return
        L55:
            float r9 = r9 / r0
            float r9 = r9 * r3
            int r8 = (int) r9
            int r8 = com.google.common.primitives.Ints.constrainToRange(r8, r2, r4)
            int r8 = 255 - r8
            r7.setARGB(r4, r8, r8, r4)
            return
    }

    @Override // com.bxkj.student.v2.ai.fitness.camera.GraphicOverlay.a
    public void a(android.graphics.Canvas r40) {
            r39 = this;
            r0 = r39
            com.google.mlkit.vision.pose.Pose r1 = r0.b
            java.util.List r9 = r1.getAllPoseLandmarks()
            boolean r1 = r9.isEmpty()
            if (r1 != 0) goto L330
            int r1 = r9.size()
            r2 = 33
            if (r1 >= r2) goto L18
            goto L330
        L18:
            android.graphics.Paint r1 = r0.i
            java.util.List<java.lang.String> r2 = r0.h
            r10 = 0
            java.lang.Object r2 = r2.get(r10)
            java.lang.String r2 = (java.lang.String) r2
            float r11 = r1.measureText(r2)
            int r1 = r40.getWidth()
            r12 = 2
            int r1 = r1 / r12
            float r1 = (float) r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r3 = r11 / r2
            float r13 = r1 - r3
            android.graphics.Paint r1 = r0.i
            android.graphics.Paint$FontMetrics r1 = r1.getFontMetrics()
            float r3 = r1.bottom
            float r1 = r1.top
            float r3 = r3 - r1
            float r3 = r3 / r2
            float r3 = r3 - r1
            android.graphics.Paint r8 = new android.graphics.Paint
            r8.<init>()
            java.lang.String r1 = "#B0707070"
            int r1 = android.graphics.Color.parseColor(r1)
            r8.setColor(r1)
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r8.setStyle(r1)
            boolean r1 = r0.f1336m
            if (r1 == 0) goto Lb6
            r14 = r3
            r15 = 0
        L5a:
            java.util.List<java.lang.String> r1 = r0.h
            int r1 = r1.size()
            if (r15 >= r1) goto Lb6
            java.util.List<java.lang.String> r1 = r0.h
            java.lang.Object r1 = r1.get(r15)
            java.lang.String r1 = (java.lang.String) r1
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.graphics.Paint r3 = r0.i
            int r4 = r1.length()
            r3.getTextBounds(r1, r10, r4, r2)
            r1 = 1092616192(0x41200000, float:10.0)
            r3 = r2
            float r2 = r13 - r1
            int r4 = r3.height()
            float r4 = (float) r4
            float r4 = r14 - r4
            float r4 = r4 - r1
            r16 = 1101004800(0x41a00000, float:20.0)
            float r1 = r11 + r16
            int r5 = r3.height()
            float r5 = (float) r5
            float r5 = r5 + r16
            float r1 = r1 + r2
            float r5 = r5 + r4
            r6 = 1106247680(0x41f00000, float:30.0)
            r7 = r6
            r17 = r3
            r3 = r4
            r4 = r1
            r1 = r40
            r1.drawRoundRect(r2, r3, r4, r5, r6, r7, r8)
            java.util.List<java.lang.String> r2 = r0.h
            java.lang.Object r2 = r2.get(r15)
            java.lang.String r2 = (java.lang.String) r2
            android.graphics.Paint r3 = r0.i
            r1.drawText(r2, r13, r14, r3)
            int r2 = r17.height()
            float r2 = (float) r2
            float r2 = r2 + r16
            float r14 = r14 + r2
            int r15 = r15 + 1
            goto L5a
        Lb6:
            r1 = r40
            java.util.Iterator r2 = r9.iterator()
        Lbc:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lf6
            java.lang.Object r3 = r2.next()
            com.google.mlkit.vision.pose.PoseLandmark r3 = (com.google.mlkit.vision.pose.PoseLandmark) r3
            android.graphics.Paint r4 = r0.f1335l
            r0.j(r1, r3, r4)
            boolean r4 = r0.d
            if (r4 == 0) goto Lbc
            boolean r4 = r0.e
            if (r4 == 0) goto Lbc
            float r4 = r0.f
            com.google.mlkit.vision.common.PointF3D r5 = r3.getPosition3D()
            float r5 = r5.getZ()
            float r4 = java.lang.Math.min(r4, r5)
            r0.f = r4
            float r4 = r0.g
            com.google.mlkit.vision.common.PointF3D r3 = r3.getPosition3D()
            float r3 = r3.getZ()
            float r3 = java.lang.Math.max(r4, r3)
            r0.g = r3
            goto Lbc
        Lf6:
            com.google.mlkit.vision.pose.Pose r2 = r0.b
            com.google.mlkit.vision.pose.PoseLandmark r2 = r2.getPoseLandmark(r10)
            com.google.mlkit.vision.pose.Pose r3 = r0.b
            r4 = 1
            com.google.mlkit.vision.pose.PoseLandmark r3 = r3.getPoseLandmark(r4)
            com.google.mlkit.vision.pose.Pose r5 = r0.b
            com.google.mlkit.vision.pose.PoseLandmark r5 = r5.getPoseLandmark(r12)
            com.google.mlkit.vision.pose.Pose r6 = r0.b
            r7 = 3
            com.google.mlkit.vision.pose.PoseLandmark r6 = r6.getPoseLandmark(r7)
            com.google.mlkit.vision.pose.Pose r7 = r0.b
            r8 = 4
            com.google.mlkit.vision.pose.PoseLandmark r7 = r7.getPoseLandmark(r8)
            com.google.mlkit.vision.pose.Pose r8 = r0.b
            r11 = 5
            com.google.mlkit.vision.pose.PoseLandmark r8 = r8.getPoseLandmark(r11)
            com.google.mlkit.vision.pose.Pose r11 = r0.b
            r12 = 6
            com.google.mlkit.vision.pose.PoseLandmark r11 = r11.getPoseLandmark(r12)
            com.google.mlkit.vision.pose.Pose r12 = r0.b
            r13 = 7
            com.google.mlkit.vision.pose.PoseLandmark r12 = r12.getPoseLandmark(r13)
            com.google.mlkit.vision.pose.Pose r13 = r0.b
            r14 = 8
            com.google.mlkit.vision.pose.PoseLandmark r13 = r13.getPoseLandmark(r14)
            com.google.mlkit.vision.pose.Pose r14 = r0.b
            r15 = 9
            com.google.mlkit.vision.pose.PoseLandmark r14 = r14.getPoseLandmark(r15)
            com.google.mlkit.vision.pose.Pose r15 = r0.b
            r16 = 0
            r10 = 10
            com.google.mlkit.vision.pose.PoseLandmark r10 = r15.getPoseLandmark(r10)
            com.google.mlkit.vision.pose.Pose r15 = r0.b
            r4 = 11
            com.google.mlkit.vision.pose.PoseLandmark r4 = r15.getPoseLandmark(r4)
            com.google.mlkit.vision.pose.Pose r15 = r0.b
            r18 = r9
            r9 = 12
            com.google.mlkit.vision.pose.PoseLandmark r9 = r15.getPoseLandmark(r9)
            com.google.mlkit.vision.pose.Pose r15 = r0.b
            r19 = r4
            r4 = 13
            com.google.mlkit.vision.pose.PoseLandmark r4 = r15.getPoseLandmark(r4)
            com.google.mlkit.vision.pose.Pose r15 = r0.b
            r20 = r4
            r4 = 14
            com.google.mlkit.vision.pose.PoseLandmark r4 = r15.getPoseLandmark(r4)
            com.google.mlkit.vision.pose.Pose r15 = r0.b
            r21 = r4
            r4 = 15
            com.google.mlkit.vision.pose.PoseLandmark r4 = r15.getPoseLandmark(r4)
            com.google.mlkit.vision.pose.Pose r15 = r0.b
            r22 = r4
            r4 = 16
            com.google.mlkit.vision.pose.PoseLandmark r4 = r15.getPoseLandmark(r4)
            com.google.mlkit.vision.pose.Pose r15 = r0.b
            r23 = r4
            r4 = 23
            com.google.mlkit.vision.pose.PoseLandmark r4 = r15.getPoseLandmark(r4)
            com.google.mlkit.vision.pose.Pose r15 = r0.b
            r24 = r4
            r4 = 24
            com.google.mlkit.vision.pose.PoseLandmark r4 = r15.getPoseLandmark(r4)
            com.google.mlkit.vision.pose.Pose r15 = r0.b
            r25 = r4
            r4 = 25
            com.google.mlkit.vision.pose.PoseLandmark r4 = r15.getPoseLandmark(r4)
            com.google.mlkit.vision.pose.Pose r15 = r0.b
            r26 = r4
            r4 = 26
            com.google.mlkit.vision.pose.PoseLandmark r4 = r15.getPoseLandmark(r4)
            com.google.mlkit.vision.pose.Pose r15 = r0.b
            r27 = r4
            r4 = 27
            com.google.mlkit.vision.pose.PoseLandmark r4 = r15.getPoseLandmark(r4)
            com.google.mlkit.vision.pose.Pose r15 = r0.b
            r28 = r4
            r4 = 28
            com.google.mlkit.vision.pose.PoseLandmark r4 = r15.getPoseLandmark(r4)
            com.google.mlkit.vision.pose.Pose r15 = r0.b
            r29 = r4
            r4 = 17
            com.google.mlkit.vision.pose.PoseLandmark r4 = r15.getPoseLandmark(r4)
            com.google.mlkit.vision.pose.Pose r15 = r0.b
            r30 = r4
            r4 = 18
            com.google.mlkit.vision.pose.PoseLandmark r4 = r15.getPoseLandmark(r4)
            com.google.mlkit.vision.pose.Pose r15 = r0.b
            r31 = r4
            r4 = 19
            com.google.mlkit.vision.pose.PoseLandmark r4 = r15.getPoseLandmark(r4)
            com.google.mlkit.vision.pose.Pose r15 = r0.b
            r32 = r4
            r4 = 20
            com.google.mlkit.vision.pose.PoseLandmark r4 = r15.getPoseLandmark(r4)
            com.google.mlkit.vision.pose.Pose r15 = r0.b
            r33 = r4
            r4 = 21
            com.google.mlkit.vision.pose.PoseLandmark r4 = r15.getPoseLandmark(r4)
            com.google.mlkit.vision.pose.Pose r15 = r0.b
            r34 = r4
            r4 = 22
            com.google.mlkit.vision.pose.PoseLandmark r4 = r15.getPoseLandmark(r4)
            com.google.mlkit.vision.pose.Pose r15 = r0.b
            r35 = r4
            r4 = 29
            com.google.mlkit.vision.pose.PoseLandmark r4 = r15.getPoseLandmark(r4)
            com.google.mlkit.vision.pose.Pose r15 = r0.b
            r36 = r4
            r4 = 30
            com.google.mlkit.vision.pose.PoseLandmark r4 = r15.getPoseLandmark(r4)
            com.google.mlkit.vision.pose.Pose r15 = r0.b
            r37 = r4
            r4 = 31
            com.google.mlkit.vision.pose.PoseLandmark r4 = r15.getPoseLandmark(r4)
            com.google.mlkit.vision.pose.Pose r15 = r0.b
            r38 = r4
            r4 = 32
            com.google.mlkit.vision.pose.PoseLandmark r4 = r15.getPoseLandmark(r4)
            android.graphics.Paint r15 = r0.f1335l
            r0.i(r1, r2, r3, r15)
            android.graphics.Paint r15 = r0.f1335l
            r0.i(r1, r3, r5, r15)
            android.graphics.Paint r3 = r0.f1335l
            r0.i(r1, r5, r6, r3)
            android.graphics.Paint r3 = r0.f1335l
            r0.i(r1, r6, r12, r3)
            android.graphics.Paint r3 = r0.f1335l
            r0.i(r1, r2, r7, r3)
            android.graphics.Paint r2 = r0.f1335l
            r0.i(r1, r7, r8, r2)
            android.graphics.Paint r2 = r0.f1335l
            r0.i(r1, r8, r11, r2)
            android.graphics.Paint r2 = r0.f1335l
            r0.i(r1, r11, r13, r2)
            android.graphics.Paint r2 = r0.f1335l
            r0.i(r1, r14, r10, r2)
            android.graphics.Paint r2 = r0.f1335l
            r3 = r19
            r0.i(r1, r3, r9, r2)
            android.graphics.Paint r2 = r0.f1335l
            r5 = r24
            r6 = r25
            r0.i(r1, r5, r6, r2)
            android.graphics.Paint r2 = r0.j
            r7 = r20
            r0.i(r1, r3, r7, r2)
            android.graphics.Paint r2 = r0.j
            r8 = r22
            r0.i(r1, r7, r8, r2)
            android.graphics.Paint r2 = r0.j
            r0.i(r1, r3, r5, r2)
            android.graphics.Paint r2 = r0.j
            r3 = r26
            r0.i(r1, r5, r3, r2)
            android.graphics.Paint r2 = r0.j
            r5 = r28
            r0.i(r1, r3, r5, r2)
            android.graphics.Paint r2 = r0.j
            r3 = r34
            r0.i(r1, r8, r3, r2)
            android.graphics.Paint r2 = r0.j
            r3 = r30
            r0.i(r1, r8, r3, r2)
            android.graphics.Paint r2 = r0.j
            r7 = r32
            r0.i(r1, r8, r7, r2)
            android.graphics.Paint r2 = r0.j
            r0.i(r1, r7, r3, r2)
            android.graphics.Paint r2 = r0.j
            r3 = r36
            r0.i(r1, r5, r3, r2)
            android.graphics.Paint r2 = r0.j
            r5 = r38
            r0.i(r1, r3, r5, r2)
            android.graphics.Paint r2 = r0.k
            r3 = r21
            r0.i(r1, r9, r3, r2)
            android.graphics.Paint r2 = r0.k
            r5 = r23
            r0.i(r1, r3, r5, r2)
            android.graphics.Paint r2 = r0.k
            r0.i(r1, r9, r6, r2)
            android.graphics.Paint r2 = r0.k
            r3 = r27
            r0.i(r1, r6, r3, r2)
            android.graphics.Paint r2 = r0.k
            r6 = r29
            r0.i(r1, r3, r6, r2)
            android.graphics.Paint r2 = r0.k
            r3 = r35
            r0.i(r1, r5, r3, r2)
            android.graphics.Paint r2 = r0.k
            r3 = r31
            r0.i(r1, r5, r3, r2)
            android.graphics.Paint r2 = r0.k
            r7 = r33
            r0.i(r1, r5, r7, r2)
            android.graphics.Paint r2 = r0.k
            r0.i(r1, r7, r3, r2)
            android.graphics.Paint r2 = r0.k
            r3 = r37
            r0.i(r1, r6, r3, r2)
            android.graphics.Paint r2 = r0.k
            r0.i(r1, r3, r4, r2)
            boolean r2 = r0.c
            if (r2 == 0) goto L330
            java.util.Iterator r2 = r18.iterator()
        L2f5:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L330
            java.lang.Object r3 = r2.next()
            com.google.mlkit.vision.pose.PoseLandmark r3 = (com.google.mlkit.vision.pose.PoseLandmark) r3
            java.util.Locale r4 = java.util.Locale.US
            float r5 = r3.getInFrameLikelihood()
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r7[r16] = r5
            java.lang.String r5 = "%.2f"
            java.lang.String r4 = java.lang.String.format(r4, r5, r7)
            android.graphics.PointF r5 = r3.getPosition()
            float r5 = r5.x
            float r5 = r0.g(r5)
            android.graphics.PointF r3 = r3.getPosition()
            float r3 = r3.y
            float r3 = r0.h(r3)
            android.graphics.Paint r7 = r0.f1335l
            r1.drawText(r4, r5, r3, r7)
            goto L2f5
        L330:
            return
    }

    void i(android.graphics.Canvas r8, com.google.mlkit.vision.pose.PoseLandmark r9, com.google.mlkit.vision.pose.PoseLandmark r10, android.graphics.Paint r11) {
            r7 = this;
            com.google.mlkit.vision.common.PointF3D r9 = r9.getPosition3D()
            com.google.mlkit.vision.common.PointF3D r10 = r10.getPosition3D()
            float r0 = r9.getZ()
            float r1 = r10.getZ()
            float r0 = r0 + r1
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            r7.k(r11, r8, r0)
            float r0 = r9.getX()
            float r2 = r7.g(r0)
            float r9 = r9.getY()
            float r3 = r7.h(r9)
            float r9 = r10.getX()
            float r4 = r7.g(r9)
            float r9 = r10.getY()
            float r5 = r7.h(r9)
            r1 = r8
            r6 = r11
            r1.drawLine(r2, r3, r4, r5, r6)
            return
    }

    void j(android.graphics.Canvas r3, com.google.mlkit.vision.pose.PoseLandmark r4, android.graphics.Paint r5) {
            r2 = this;
            com.google.mlkit.vision.common.PointF3D r4 = r4.getPosition3D()
            float r0 = r4.getZ()
            r2.k(r5, r3, r0)
            float r0 = r4.getX()
            float r0 = r2.g(r0)
            float r4 = r4.getY()
            float r4 = r2.h(r4)
            r1 = 1090519040(0x41000000, float:8.0)
            r3.drawCircle(r0, r4, r1, r5)
            return
    }
}
