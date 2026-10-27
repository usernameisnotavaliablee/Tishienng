package com.bxkj.competition.electronicentry;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ElectronicEntryActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.ImageView F0;
    private android.widget.ImageView G0;
    private android.widget.TextView H0;
    private android.widget.TextView I0;
    private java.lang.String J0;
    private java.lang.String K0;
    private android.widget.TextView Y;
    private android.widget.TextView Z;
    private android.widget.TextView a0;
    private android.widget.TextView b0;
    private android.widget.TextView c0;

    /* renamed from: k0, reason: collision with root package name */
    private android.widget.TextView f642k0;

    /* renamed from: p0, reason: collision with root package name */
    private android.widget.TextView f643p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.competition.electronicentry.ElectronicEntryActivity a;

        a(com.bxkj.competition.electronicentry.ElectronicEntryActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                super.netOnOtherStatus(r2, r3)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.competition.electronicentry.ElectronicEntryActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.competition.electronicentry.ElectronicEntryActivity.h0(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                r2.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r3) {
                r2 = this;
                com.bxkj.competition.electronicentry.ElectronicEntryActivity r0 = r2.a
                android.widget.FrameLayout r0 = r0.P()
                r1 = 0
                r0.setVisibility(r1)
                com.bxkj.competition.electronicentry.ElectronicEntryActivity r0 = r2.a
                com.bxkj.competition.electronicentry.ElectronicEntryActivity.g0(r0, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements android.view.View.OnClickListener {
        final /* synthetic */ com.bxkj.competition.electronicentry.ElectronicEntryActivity a;

        b(com.bxkj.competition.electronicentry.ElectronicEntryActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                com.bxkj.competition.electronicentry.ElectronicEntryActivity r2 = r1.a
                java.lang.String r0 = com.bxkj.competition.electronicentry.ElectronicEntryActivity.i0(r2)
                com.bxkj.competition.electronicentry.ElectronicEntryActivity.j0(r2, r0)
                return
        }
    }

    public ElectronicEntryActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ void g0(com.bxkj.competition.electronicentry.ElectronicEntryActivity r0, java.util.Map r1) {
            r0.o0(r1)
            return
    }

    static /* synthetic */ android.content.Context h0(com.bxkj.competition.electronicentry.ElectronicEntryActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    static /* synthetic */ java.lang.String i0(com.bxkj.competition.electronicentry.ElectronicEntryActivity r0) {
            java.lang.String r0 = r0.K0
            return r0
    }

    static /* synthetic */ void j0(com.bxkj.competition.electronicentry.ElectronicEntryActivity r0, java.lang.String r1) {
            r0.n0(r1)
            return
    }

    private void l0() {
            r4 = this;
            android.content.Context r0 = r4.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            java.lang.Class<com.bxkj.competition.b> r1 = com.bxkj.competition.b.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            com.bxkj.competition.b r1 = (com.bxkj.competition.b) r1
            java.lang.String r2 = r4.J0
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r3 = r3.getUserId()
            rx.e r1 = r1.r(r2, r3)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.competition.electronicentry.ElectronicEntryActivity$a r1 = new com.bxkj.competition.electronicentry.ElectronicEntryActivity$a
            r1.<init>(r4)
            r0.setDataListener(r1)
            return
    }

    private void n0(java.lang.String r4) {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.V
            java.lang.Class<cn.bluemobi.dylan.photoview.ImagePagerActivity> r2 = cn.bluemobi.dylan.photoview.ImagePagerActivity.class
            r0.<init>(r1, r2)
            java.lang.String[] r4 = new java.lang.String[]{r4}
            java.lang.String r1 = "image_urls"
            r0.putExtra(r1, r4)
            java.lang.String r4 = "image_index"
            r1 = 1
            r0.putExtra(r4, r1)
            r3.startActivity(r0)
            int r4 = com.bxkj.competition.R.anim.zoom_ente
            int r0 = com.bxkj.competition.R.anim.zoom_exit
            r3.overridePendingTransition(r4, r0)
            return
    }

    private void o0(java.util.Map<java.lang.String, java.lang.Object> r5) {
            r4 = this;
            android.widget.TextView r0 = r4.Y
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "姓名："
            r1.append(r2)
            java.lang.String r2 = "userName"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            android.widget.TextView r0 = r4.Z
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "学号："
            r1.append(r2)
            java.lang.String r2 = "userNum"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            android.widget.TextView r0 = r4.a0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "性别："
            r1.append(r2)
            java.lang.String r2 = "sex"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            android.widget.TextView r0 = r4.b0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "年级："
            r1.append(r2)
            java.lang.String r2 = "nj"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            android.widget.TextView r0 = r4.c0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "院系："
            r1.append(r2)
            java.lang.String r2 = "yx"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            android.widget.TextView r0 = r4.f642k0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "专业："
            r1.append(r2)
            java.lang.String r2 = "zy"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            android.widget.TextView r0 = r4.f643p0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "班级："
            r1.append(r2)
            java.lang.String r2 = "bj"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            android.widget.TextView r0 = r4.I0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "号码："
            r1.append(r2)
            java.lang.String r2 = "cardNum"
            java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            java.lang.String r0 = "userImg"
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r0)
            r4.K0 = r0
            android.content.Context r0 = r4.V
            com.bumptech.glide.i r0 = com.bumptech.glide.b.D(r0)
            java.lang.String r1 = r4.K0
            com.bumptech.glide.h r0 = r0.M(r1)
            int r1 = com.bxkj.competition.R.mipmap.student_img_default
            com.bumptech.glide.request.a r0 = r0.y0(r1)
            com.bumptech.glide.h r0 = (com.bumptech.glide.h) r0
            com.bumptech.glide.request.a r0 = r0.z(r1)
            com.bumptech.glide.h r0 = (com.bumptech.glide.h) r0
            android.widget.ImageView r1 = r4.G0
            r0.m1(r1)
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r2)
            r4.m0(r0)
            android.widget.TextView r0 = r4.H0
            java.lang.String r1 = "itemName"
            java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r1)
            r0.setText(r5)
            android.widget.ImageView r5 = r4.G0
            com.bxkj.competition.electronicentry.ElectronicEntryActivity$b r0 = new com.bxkj.competition.electronicentry.ElectronicEntryActivity$b
            r0.<init>(r4)
            r5.setOnClickListener(r0)
            return
    }

    public void L() {
            r0 = this;
            return
    }

    protected int N() {
            r1 = this;
            int r0 = com.bxkj.competition.R.layout.ac_electronic_entry
            return r0
    }

    public void R() {
            r2 = this;
            android.widget.FrameLayout r0 = r2.P()
            r1 = 8
            r0.setVisibility(r1)
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "competitionId"
            java.lang.String r0 = r0.getStringExtra(r1)
            r2.J0 = r0
            r2.l0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "电子参赛证"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            int r1 = com.bxkj.competition.R.id.tv_name
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.Y = r1
            int r1 = com.bxkj.competition.R.id.tv_number
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.Z = r1
            int r1 = com.bxkj.competition.R.id.tv_sex
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.a0 = r1
            int r1 = com.bxkj.competition.R.id.tv_grade
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.b0 = r1
            int r1 = com.bxkj.competition.R.id.tv_yard
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.c0 = r1
            int r1 = com.bxkj.competition.R.id.tv_major
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f642k0 = r1
            int r1 = com.bxkj.competition.R.id.tv_class
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f643p0 = r1
            int r1 = com.bxkj.competition.R.id.iv_qr_code
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.F0 = r1
            int r1 = com.bxkj.competition.R.id.tv_project
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.H0 = r1
            int r1 = com.bxkj.competition.R.id.iv_student_image
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.G0 = r1
            int r1 = com.bxkj.competition.R.id.tv_NO
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.I0 = r1
            return
    }

    public android.graphics.Bitmap k0(java.lang.String r16, int r17, android.graphics.Bitmap r18) {
            r15 = this;
            int r6 = r17 / 10
            java.util.Hashtable r5 = new java.util.Hashtable     // Catch: com.google.zxing.WriterException -> L91
            r5.<init>()     // Catch: com.google.zxing.WriterException -> L91
            com.google.zxing.EncodeHintType r0 = com.google.zxing.EncodeHintType.CHARACTER_SET     // Catch: com.google.zxing.WriterException -> L91
            java.lang.String r1 = "utf-8"
            r5.put(r0, r1)     // Catch: com.google.zxing.WriterException -> L91
            com.google.zxing.EncodeHintType r0 = com.google.zxing.EncodeHintType.ERROR_CORRECTION     // Catch: com.google.zxing.WriterException -> L91
            com.google.zxing.qrcode.decoder.ErrorCorrectionLevel r1 = com.google.zxing.qrcode.decoder.ErrorCorrectionLevel.H     // Catch: com.google.zxing.WriterException -> L91
            r5.put(r0, r1)     // Catch: com.google.zxing.WriterException -> L91
            com.google.zxing.EncodeHintType r0 = com.google.zxing.EncodeHintType.MARGIN     // Catch: com.google.zxing.WriterException -> L91
            r7 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)     // Catch: com.google.zxing.WriterException -> L91
            r5.put(r0, r1)     // Catch: com.google.zxing.WriterException -> L91
            com.google.zxing.qrcode.QRCodeWriter r0 = new com.google.zxing.qrcode.QRCodeWriter     // Catch: com.google.zxing.WriterException -> L91
            r0.<init>()     // Catch: com.google.zxing.WriterException -> L91
            com.google.zxing.BarcodeFormat r2 = com.google.zxing.BarcodeFormat.QR_CODE     // Catch: com.google.zxing.WriterException -> L91
            r4 = r17
            r1 = r16
            r3 = r17
            com.google.zxing.common.BitMatrix r0 = r0.encode(r1, r2, r3, r4, r5)     // Catch: com.google.zxing.WriterException -> L91
            int r1 = r0.getWidth()     // Catch: com.google.zxing.WriterException -> L91
            int r2 = r0.getHeight()     // Catch: com.google.zxing.WriterException -> L91
            int r4 = r1 / 2
            int r2 = r2 / 2
            android.graphics.Matrix r13 = new android.graphics.Matrix     // Catch: com.google.zxing.WriterException -> L91
            r13.<init>()     // Catch: com.google.zxing.WriterException -> L91
            r5 = 1073741824(0x40000000, float:2.0)
            float r8 = (float) r6     // Catch: com.google.zxing.WriterException -> L91
            float r8 = r8 * r5
            int r5 = r18.getWidth()     // Catch: com.google.zxing.WriterException -> L91
            float r5 = (float) r5     // Catch: com.google.zxing.WriterException -> L91
            float r5 = r8 / r5
            int r9 = r18.getHeight()     // Catch: com.google.zxing.WriterException -> L91
            float r9 = (float) r9     // Catch: com.google.zxing.WriterException -> L91
            float r8 = r8 / r9
            r13.setScale(r5, r8)     // Catch: com.google.zxing.WriterException -> L91
            int r11 = r18.getWidth()     // Catch: com.google.zxing.WriterException -> L91
            int r12 = r18.getHeight()     // Catch: com.google.zxing.WriterException -> L91
            r14 = 0
            r9 = 0
            r10 = 0
            r8 = r18
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r8, r9, r10, r11, r12, r13, r14)     // Catch: com.google.zxing.WriterException -> L91
            int r8 = r3 * r3
            int[] r8 = new int[r8]     // Catch: com.google.zxing.WriterException -> L91
            r9 = 0
        L6c:
            if (r9 >= r3) goto Lad
            r10 = 0
        L6f:
            if (r10 >= r3) goto Laa
            int r11 = r4 - r6
            if (r10 <= r11) goto L93
            int r11 = r4 + r6
            if (r10 >= r11) goto L93
            int r11 = r2 - r6
            if (r9 <= r11) goto L93
            int r11 = r2 + r6
            if (r9 >= r11) goto L93
            int r11 = r9 * r1
            int r11 = r11 + r10
            int r12 = r10 - r4
            int r12 = r12 + r6
            int r13 = r9 - r2
            int r13 = r13 + r6
            int r12 = r5.getPixel(r12, r13)     // Catch: com.google.zxing.WriterException -> L91
            r8[r11] = r12     // Catch: com.google.zxing.WriterException -> L91
            goto La7
        L91:
            r0 = move-exception
            goto Lbf
        L93:
            boolean r11 = r0.get(r10, r9)     // Catch: com.google.zxing.WriterException -> L91
            if (r11 == 0) goto La1
            int r11 = r9 * r3
            int r11 = r11 + r10
            r12 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r8[r11] = r12     // Catch: com.google.zxing.WriterException -> L91
            goto La7
        La1:
            int r11 = r9 * r3
            int r11 = r11 + r10
            r12 = -1
            r8[r11] = r12     // Catch: com.google.zxing.WriterException -> L91
        La7:
            int r10 = r10 + 1
            goto L6f
        Laa:
            int r9 = r9 + 1
            goto L6c
        Lad:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: com.google.zxing.WriterException -> L91
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r3, r3, r0)     // Catch: com.google.zxing.WriterException -> L91
            r4 = 0
            r5 = 0
            r2 = 0
            r6 = r17
            r7 = r17
            r1 = r8
            r0.setPixels(r1, r2, r3, r4, r5, r6, r7)     // Catch: com.google.zxing.WriterException -> L91
            return r0
        Lbf:
            r0.printStackTrace()
            r0 = 0
            return r0
    }

    public void m0(java.lang.String r4) {
            r3 = this;
            r0 = 1128792064(0x43480000, float:200.0)
            android.content.Context r1 = r3.V
            int r0 = cn.bluemobi.dylan.base.utils.u.a(r0, r1)
            android.content.res.Resources r1 = r3.getResources()
            int r2 = com.bxkj.competition.R.mipmap.icon
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeResource(r1, r2)
            android.graphics.Bitmap r4 = r3.k0(r4, r0, r1)
            android.widget.ImageView r0 = r3.F0
            r0.setImageBitmap(r4)
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}
