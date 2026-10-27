package com.bxkj.student.home.teaching.lesson;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class CertificateActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.ImageView Y;
    private android.widget.Button Z;
    private android.graphics.Bitmap a0;
    private java.lang.String b0;
    private float c0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends java.lang.Thread {
        final /* synthetic */ cn.bluemobi.dylan.http.dialog.LoadingDialog a;
        final /* synthetic */ com.bxkj.student.home.teaching.lesson.CertificateActivity b;

        a(com.bxkj.student.home.teaching.lesson.CertificateActivity r1, cn.bluemobi.dylan.http.dialog.LoadingDialog r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public static /* synthetic */ void a(com.bxkj.student.home.teaching.lesson.CertificateActivity.a r0, cn.bluemobi.dylan.http.dialog.LoadingDialog r1) {
                r0.b(r1)
                return
        }

        private /* synthetic */ void b(cn.bluemobi.dylan.http.dialog.LoadingDialog r2) {
                r1 = this;
                r2.dismiss()
                com.bxkj.student.home.teaching.lesson.CertificateActivity r2 = r1.b
                android.widget.Button r2 = com.bxkj.student.home.teaching.lesson.CertificateActivity.i0(r2)
                r0 = 0
                r2.setVisibility(r0)
                com.bxkj.student.home.teaching.lesson.CertificateActivity r2 = r1.b
                android.widget.ImageView r2 = com.bxkj.student.home.teaching.lesson.CertificateActivity.j0(r2)
                com.bxkj.student.home.teaching.lesson.CertificateActivity r0 = r1.b
                android.graphics.Bitmap r0 = com.bxkj.student.home.teaching.lesson.CertificateActivity.h0(r0)
                r2.setImageBitmap(r0)
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r3 = this;
                com.bxkj.student.home.teaching.lesson.CertificateActivity r0 = r3.b
                android.content.res.Resources r0 = r0.getResources()
                r1 = 2131689538(0x7f0f0042, float:1.9008094E38)
                android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r0, r1)
                com.bxkj.student.home.teaching.lesson.CertificateActivity r1 = r3.b
                android.graphics.Bitmap r0 = com.bxkj.student.home.teaching.lesson.CertificateActivity.l0(r1, r0)
                com.bxkj.student.home.teaching.lesson.CertificateActivity.k0(r1, r0)
                com.bxkj.student.home.teaching.lesson.CertificateActivity r0 = r3.b
                cn.bluemobi.dylan.http.dialog.LoadingDialog r1 = r3.a
                com.bxkj.student.home.teaching.lesson.b r2 = new com.bxkj.student.home.teaching.lesson.b
                r2.<init>(r3, r1)
                r0.runOnUiThread(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends java.lang.Thread {
        final /* synthetic */ android.graphics.Bitmap a;
        final /* synthetic */ android.content.Context b;
        final /* synthetic */ com.bxkj.student.home.teaching.lesson.CertificateActivity c;

        b(com.bxkj.student.home.teaching.lesson.CertificateActivity r1, android.graphics.Bitmap r2, android.content.Context r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        public static /* synthetic */ void a(com.bxkj.student.home.teaching.lesson.CertificateActivity.b r0) {
                r0.b()
                return
        }

        private /* synthetic */ void b() {
                r3 = this;
                com.bxkj.student.home.teaching.lesson.CertificateActivity r0 = r3.c
                android.content.Context r0 = com.bxkj.student.home.teaching.lesson.CertificateActivity.m0(r0)
                java.lang.String r1 = "已成功保存到相册"
                r2 = 0
                android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
                r0.show()
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r6 = this;
                java.lang.String r0 = android.os.Environment.DIRECTORY_PICTURES
                java.io.File r0 = android.os.Environment.getExternalStoragePublicDirectory(r0)
                java.io.File r0 = r0.getAbsoluteFile()
                java.io.File r1 = new java.io.File
                java.lang.String r2 = "download"
                r1.<init>(r0, r2)
                boolean r0 = r1.exists()
                if (r0 != 0) goto L1a
                r1.mkdirs()
            L1a:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                long r2 = java.lang.System.currentTimeMillis()
                r0.append(r2)
                java.lang.String r2 = ".jpg"
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.io.File r2 = new java.io.File
                r2.<init>(r1, r0)
                r0 = 0
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L57 java.io.FileNotFoundException -> L59
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L57 java.io.FileNotFoundException -> L59
                android.graphics.Bitmap r0 = r6.a     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4c java.io.FileNotFoundException -> L4f
                android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4c java.io.FileNotFoundException -> L4f
                r4 = 100
                r0.compress(r3, r4, r1)     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4c java.io.FileNotFoundException -> L4f
                r1.flush()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4c java.io.FileNotFoundException -> L4f
                r1.close()     // Catch: java.io.IOException -> L6a
                goto L6a
            L4a:
                r0 = move-exception
                goto L5b
            L4c:
                r0 = r1
                goto L61
            L4f:
                r0 = r1
                goto L67
            L52:
                r1 = move-exception
                r5 = r1
                r1 = r0
                r0 = r5
                goto L5b
            L57:
                goto L61
            L59:
                goto L67
            L5b:
                if (r1 == 0) goto L60
                r1.close()     // Catch: java.io.IOException -> L60
            L60:
                throw r0
            L61:
                if (r0 == 0) goto L6a
            L63:
                r0.close()     // Catch: java.io.IOException -> L6a
                goto L6a
            L67:
                if (r0 == 0) goto L6a
                goto L63
            L6a:
                android.content.Context r0 = r6.b
                android.content.Intent r1 = new android.content.Intent
                java.io.File r3 = new java.io.File
                java.lang.String r2 = r2.getPath()
                r3.<init>(r2)
                android.net.Uri r2 = android.net.Uri.fromFile(r3)
                java.lang.String r3 = "android.intent.action.MEDIA_SCANNER_SCAN_FILE"
                r1.<init>(r3, r2)
                r0.sendBroadcast(r1)
                com.bxkj.student.home.teaching.lesson.CertificateActivity r0 = r6.c
                com.bxkj.student.home.teaching.lesson.c r1 = new com.bxkj.student.home.teaching.lesson.c
                r1.<init>(r6)
                r0.runOnUiThread(r1)
                return
        }
    }

    public CertificateActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void g0(com.bxkj.student.home.teaching.lesson.CertificateActivity r0, android.view.View r1) {
            r0.p0(r1)
            return
    }

    static /* bridge */ /* synthetic */ android.graphics.Bitmap h0(com.bxkj.student.home.teaching.lesson.CertificateActivity r0) {
            android.graphics.Bitmap r0 = r0.a0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.Button i0(com.bxkj.student.home.teaching.lesson.CertificateActivity r0) {
            android.widget.Button r0 = r0.Z
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.ImageView j0(com.bxkj.student.home.teaching.lesson.CertificateActivity r0) {
            android.widget.ImageView r0 = r0.Y
            return r0
    }

    static /* bridge */ /* synthetic */ void k0(com.bxkj.student.home.teaching.lesson.CertificateActivity r0, android.graphics.Bitmap r1) {
            r0.a0 = r1
            return
    }

    static /* bridge */ /* synthetic */ android.graphics.Bitmap l0(com.bxkj.student.home.teaching.lesson.CertificateActivity r0, android.graphics.Bitmap r1) {
            android.graphics.Bitmap r0 = r0.n0(r1)
            return r0
    }

    static /* synthetic */ android.content.Context m0(com.bxkj.student.home.teaching.lesson.CertificateActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private android.graphics.Bitmap n0(android.graphics.Bitmap r29) {
            r28 = this;
            r0 = r28
            r1 = r29
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            int r3 = r1.getWidth()
            int r4 = r1.getHeight()
            float r5 = (float) r3
            r6 = 2480(0x9b0, float:3.475E-42)
            float r6 = (float) r6
            float r6 = r5 / r6
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_4444
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3, r4, r7)
            android.graphics.Canvas r7 = new android.graphics.Canvas
            r7.<init>(r3)
            r8 = 255(0xff, float:3.57E-43)
            r7.drawRGB(r8, r8, r8)
            r8 = 0
            r7.drawBitmap(r1, r8, r8, r2)
            android.content.res.Resources r1 = r0.getResources()
            r8 = 2131689541(0x7f0f0045, float:1.90081E38)
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeResource(r1, r8)
            r8 = 1073741824(0x40000000, float:2.0)
            float r9 = r5 / r8
            int r10 = r1.getWidth()
            float r10 = (float) r10
            float r10 = r10 / r8
            float r10 = r9 - r10
            r11 = 1131020288(0x436a0000, float:234.0)
            float r11 = r11 * r6
            r7.drawBitmap(r1, r10, r11, r2)
            android.content.res.Resources r10 = r0.getResources()
            r12 = 2131689542(0x7f0f0046, float:1.9008102E38)
            android.graphics.Bitmap r10 = android.graphics.BitmapFactory.decodeResource(r10, r12)
            int r12 = r10.getWidth()
            float r12 = (float) r12
            float r12 = r12 / r8
            float r12 = r9 - r12
            int r1 = r1.getHeight()
            float r1 = (float) r1
            r13 = 1116864512(0x42920000, float:73.0)
            float r13 = r13 * r6
            float r1 = r1 + r13
            float r11 = r11 + r1
            r7.drawBitmap(r10, r12, r11, r2)
            android.content.res.Resources r1 = r0.getResources()
            r12 = 2131689540(0x7f0f0044, float:1.9008098E38)
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeResource(r1, r12)
            int r12 = r1.getWidth()
            float r12 = (float) r12
            float r12 = r12 / r8
            float r9 = r9 - r12
            int r10 = r10.getHeight()
            float r10 = (float) r10
            r12 = 1132789760(0x43850000, float:266.0)
            float r12 = r12 * r6
            float r10 = r10 + r12
            float r11 = r11 + r10
            r7.drawBitmap(r1, r9, r11, r2)
            android.graphics.Paint r9 = new android.graphics.Paint
            r10 = 1
            r9.<init>(r10)
            r12 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r9.setColor(r12)
            android.graphics.Typeface r13 = android.graphics.Typeface.DEFAULT_BOLD
            r9.setTypeface(r13)
            android.content.Context r14 = r0.V
            r15 = 1108344832(0x42100000, float:36.0)
            int r14 = cn.bluemobi.dylan.base.utils.u.a(r15, r14)
            float r14 = (float) r14
            r9.setTextSize(r14)
            r9.setUnderlineText(r10)
            android.graphics.Rect r14 = new android.graphics.Rect
            r14.<init>()
            com.bxkj.base.user.LoginUser r16 = com.bxkj.base.user.LoginUser.getLoginUser()
            r29 = 1073741824(0x40000000, float:2.0)
            java.lang.String r8 = r16.getRealName()
            int r15 = r8.length()
            r12 = 0
            r9.getTextBounds(r8, r12, r15, r14)
            r15 = 1136787456(0x43c20000, float:388.0)
            float r15 = r15 * r6
            int r1 = r1.getHeight()
            float r1 = (float) r1
            r17 = 1133969408(0x43970000, float:302.0)
            float r17 = r17 * r6
            float r1 = r1 + r17
            float r11 = r11 + r1
            r7.drawText(r8, r15, r11, r9)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r9.setUnderlineText(r12)
            java.lang.String r8 = "同学："
            r10 = 3
            r9.getTextBounds(r8, r12, r10, r1)
            int r14 = r14.width()
            float r14 = (float) r14
            float r14 = r14 + r15
            r7.drawText(r8, r14, r11, r9)
            android.content.res.Resources r8 = r0.getResources()
            r14 = 2131689539(0x7f0f0043, float:1.9008096E38)
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeResource(r8, r14)
            android.graphics.Rect r14 = new android.graphics.Rect
            r14.<init>()
            r9.setUnderlineText(r12)
            android.content.Context r2 = r0.V
            r10 = 1106247680(0x41f00000, float:30.0)
            int r2 = cn.bluemobi.dylan.base.utils.u.a(r10, r2)
            float r2 = (float) r2
            r9.setTextSize(r2)
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r2 = r2.getSchoolName()
            int r10 = r2.length()
            r9.getTextBounds(r2, r12, r10, r14)
            r10 = 1149886464(0x4489e000, float:1103.0)
            float r10 = r10 * r6
            int r12 = r8.getWidth()
            float r12 = (float) r12
            float r12 = r12 / r29
            float r12 = r12 + r10
            r19 = r1
            int r1 = r14.width()
            float r1 = (float) r1
            float r1 = r1 / r29
            float r12 = r12 - r1
            float r1 = (float) r4
            r4 = 1138491392(0x43dc0000, float:440.0)
            float r4 = r4 * r6
            float r1 = r1 - r4
            int r4 = r8.getHeight()
            float r4 = (float) r4
            float r4 = r4 / r29
            float r4 = r1 - r4
            r7.drawText(r2, r12, r4, r9)
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r4 = 0
            r9.setUnderlineText(r4)
            android.content.Context r12 = r0.V
            r4 = 1106247680(0x41f00000, float:30.0)
            int r4 = cn.bluemobi.dylan.base.utils.u.a(r4, r12)
            float r4 = (float) r4
            r9.setTextSize(r4)
            java.lang.String r4 = "体育部"
            r18 = r1
            r1 = 0
            r12 = 3
            r9.getTextBounds(r4, r1, r12, r2)
            int r1 = r8.getWidth()
            float r1 = (float) r1
            float r1 = r1 / r29
            float r1 = r1 + r10
            int r2 = r2.width()
            float r2 = (float) r2
            float r2 = r2 / r29
            float r1 = r1 - r2
            int r2 = r8.getHeight()
            float r2 = (float) r2
            float r2 = r2 / r29
            float r2 = r18 - r2
            int r12 = r14.height()
            float r12 = (float) r12
            float r2 = r2 + r12
            r7.drawText(r4, r1, r2, r9)
            int r1 = r8.getHeight()
            float r1 = (float) r1
            float r1 = r18 - r1
            r2 = 0
            r7.drawBitmap(r8, r10, r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "\u3000\u3000参加"
            r1.append(r2)
            java.lang.String r2 = r0.b0
            r1.append(r2)
            java.lang.String r2 = "班学习，经考核"
            r1.append(r2)
            float r2 = r0.c0
            java.lang.String r2 = r0.o0(r2)
            r1.append(r2)
            java.lang.String r2 = "，特发此证！"
            r1.append(r2)
            java.lang.String r21 = r1.toString()
            android.text.TextPaint r1 = new android.text.TextPaint
            r2 = 1
            r1.<init>(r2)
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1.setColor(r2)
            r1.setTypeface(r13)
            android.content.Context r2 = r0.V
            r4 = 1108344832(0x42100000, float:36.0)
            int r2 = cn.bluemobi.dylan.base.utils.u.a(r4, r2)
            float r2 = (float) r2
            r1.setTextSize(r2)
            android.text.StaticLayout r20 = new android.text.StaticLayout
            float r5 = r5 - r15
            r2 = 1138819072(0x43e10000, float:450.0)
            float r2 = r2 * r6
            float r5 = r5 - r2
            int r2 = (int) r5
            android.text.Layout$Alignment r24 = android.text.Layout.Alignment.ALIGN_NORMAL
            r26 = 0
            r27 = 0
            r25 = 1065353216(0x3f800000, float:1.0)
            r22 = r1
            r23 = r2
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            r1 = r20
            int r2 = r19.height()
            float r2 = (float) r2
            r4 = 1123024896(0x42f00000, float:120.0)
            float r6 = r6 * r4
            float r2 = r2 + r6
            float r11 = r11 + r2
            r7.translate(r15, r11)
            r1.draw(r7)
            r7.save()
            r7.restore()
            return r3
    }

    private java.lang.String o0(float r2) {
            r1 = this;
            r0 = 1119092736(0x42b40000, float:90.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L9
            java.lang.String r2 = "优秀"
            return r2
        L9:
            r0 = 1117782016(0x42a00000, float:80.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L12
            java.lang.String r2 = "良好"
            return r2
        L12:
            r0 = 1114636288(0x42700000, float:60.0)
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 < 0) goto L1b
            java.lang.String r2 = "合格"
            return r2
        L1b:
            java.lang.String r2 = "无证书"
            return r2
    }

    private /* synthetic */ void p0(android.view.View r2) {
            r1 = this;
            android.content.Context r2 = r1.V
            android.graphics.Bitmap r0 = r1.a0
            r1.r0(r2, r0)
            return
    }

    public void L() {
            r2 = this;
            android.widget.Button r0 = r2.Z
            com.bxkj.student.home.teaching.lesson.a r1 = new com.bxkj.student.home.teaching.lesson.a
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492914(0x7f0c0032, float:1.8609293E38)
            return r0
    }

    public void R() {
            r3 = this;
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "lessonName"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L16
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r3.b0 = r0
        L16:
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "score"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L2d
            android.content.Intent r0 = r3.getIntent()
            r2 = 0
            float r0 = r0.getFloatExtra(r1, r2)
            r3.c0 = r0
        L2d:
            cn.bluemobi.dylan.http.dialog.LoadingDialog r0 = new cn.bluemobi.dylan.http.dialog.LoadingDialog
            android.content.Context r1 = r3.V
            r0.<init>(r1)
            java.lang.String r1 = "证书生成中..."
            r0.setMessage(r1)
            r0.show()
            com.bxkj.student.home.teaching.lesson.CertificateActivity$a r1 = new com.bxkj.student.home.teaching.lesson.CertificateActivity$a     // Catch: java.lang.Exception -> L45
            r1.<init>(r3, r0)     // Catch: java.lang.Exception -> L45
            r1.start()     // Catch: java.lang.Exception -> L45
            return
        L45:
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r1 = r3.V
            r0.<init>(r1)
            java.lang.String r1 = "生成证书失败,请稍后再试"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
            r0.show()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "查看证书"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131297091(0x7f090343, float:1.8212117E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.Y = r1
            r1 = 2131296642(0x7f090182, float:1.8211206E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r0.Z = r1
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }

    protected void onDestroy() {
            r1 = this;
            super.onDestroy()
            android.graphics.Bitmap r0 = r1.a0
            if (r0 == 0) goto L15
            boolean r0 = r0.isRecycled()
            if (r0 != 0) goto L15
            android.graphics.Bitmap r0 = r1.a0
            r0.recycle()
            r0 = 0
            r1.a0 = r0
        L15:
            java.lang.System.gc()
            return
    }

    public android.graphics.Bitmap q0(android.content.Context r6, int r7, int r8, int r9) {
            r5 = this;
            android.content.res.Resources r6 = r6.getResources()
            java.io.InputStream r6 = r6.openRawResource(r7)
            android.graphics.BitmapFactory$Options r7 = new android.graphics.BitmapFactory$Options
            r7.<init>()
            r0 = 1
            r7.inJustDecodeBounds = r0
            r1 = 0
            android.graphics.BitmapFactory.decodeStream(r6, r1, r7)
            int r2 = r7.outWidth
            float r2 = (float) r2
            int r3 = r7.outHeight
            float r3 = (float) r3
            float r9 = (float) r9
            int r4 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r4 > 0) goto L24
            float r4 = (float) r8
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto L34
        L24:
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 <= 0) goto L2e
            float r3 = r3 / r9
            int r0 = java.lang.Math.round(r3)
            goto L34
        L2e:
            float r8 = (float) r8
            float r2 = r2 / r8
            int r0 = java.lang.Math.round(r2)
        L34:
            r8 = 0
            r7.inJustDecodeBounds = r8
            r7.inSampleSize = r0
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeStream(r6, r1, r7)
            return r6
    }

    public void r0(android.content.Context r2, android.graphics.Bitmap r3) {
            r1 = this;
            com.bxkj.student.home.teaching.lesson.CertificateActivity$b r0 = new com.bxkj.student.home.teaching.lesson.CertificateActivity$b
            r0.<init>(r1, r3, r2)
            r0.start()
            return
    }
}
