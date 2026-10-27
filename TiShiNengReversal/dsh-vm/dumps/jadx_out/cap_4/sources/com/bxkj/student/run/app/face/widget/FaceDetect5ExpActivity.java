package com.bxkj.student.run.app.face.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class FaceDetect5ExpActivity extends com.baidu.idl.face.platform.ui.BaseFaceLivenessActivity {
    private android.content.Context O;
    private com.bxkj.student.run.app.face.widget.a P;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.run.app.face.widget.FaceDetect5ExpActivity a;

        a(com.bxkj.student.run.app.face.widget.FaceDetect5ExpActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public static /* synthetic */ void a(com.bxkj.student.run.app.face.widget.FaceDetect5ExpActivity.a r0, android.view.View r1) {
                r0.d(r1)
                return
        }

        public static /* synthetic */ void b(com.bxkj.student.run.app.face.widget.FaceDetect5ExpActivity.a r0, android.view.View r1) {
                r0.c(r1)
                return
        }

        private /* synthetic */ void c(android.view.View r1) {
                r0 = this;
                com.bxkj.student.run.app.face.widget.FaceDetect5ExpActivity r1 = r0.a
                com.bxkj.student.run.app.face.widget.FaceDetect5ExpActivity.h(r1)
                return
        }

        private /* synthetic */ void d(android.view.View r1) {
                r0 = this;
                com.bxkj.student.run.app.face.widget.FaceDetect5ExpActivity r1 = r0.a
                r1.finish()
                return
        }

        public void netOnFailure(java.lang.Throwable r3) {
                r2 = this;
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.run.app.face.widget.FaceDetect5ExpActivity r1 = r2.a
                android.content.Context r1 = com.bxkj.student.run.app.face.widget.FaceDetect5ExpActivity.g(r1)
                r0.<init>(r1)
                java.lang.String r1 = "上传失败，请重新再试"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setMessage(r1)
                com.bxkj.student.run.app.face.widget.d r1 = new com.bxkj.student.run.app.face.widget.d
                r1.<init>(r2)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r0 = r0.setButtonOnClickListener(r1)
                r0.show()
                super.netOnFailure(r3)
                return
        }

        public void netOnFinish() {
                r1 = this;
                com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.util.List r0 = r0.getBitmapList()
                r0.clear()
                super.netOnFinish()
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                super.netOnOtherStatus(r2, r3)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.run.app.face.widget.FaceDetect5ExpActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.student.run.app.face.widget.FaceDetect5ExpActivity.g(r0)
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                r2.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2) {
                r1 = this;
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.run.app.face.widget.FaceDetect5ExpActivity r0 = r1.a
                android.content.Context r0 = com.bxkj.student.run.app.face.widget.FaceDetect5ExpActivity.g(r0)
                r2.<init>(r0)
                java.lang.String r0 = "上传成功"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r0)
                com.bxkj.student.run.app.face.widget.e r0 = new com.bxkj.student.run.app.face.widget.e
                r0.<init>(r1)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setButtonOnClickListener(r0)
                r2.show()
                return
        }
    }

    static {
            r0 = 17121(0x42e1, float:2.3992E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public FaceDetect5ExpActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    private void L() {
            r2 = this;
            com.bxkj.student.v2.ui.face.FaceManger r0 = com.bxkj.student.v2.ui.face.FaceManger.a
            android.content.Context r1 = r2.O
            r0.e(r1, r2)
            return
    }

    private /* synthetic */ void M(android.view.View r1) {
            r0 = this;
            r0.P()
            return
    }

    private void O(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            com.bxkj.student.run.app.face.widget.a r5 = r2.P
            if (r5 != 0) goto L46
            com.bxkj.student.run.app.face.widget.a$a r5 = new com.bxkj.student.run.app.face.widget.a$a
            r5.<init>(r2)
            com.bxkj.student.run.app.face.widget.a$a r3 = r5.h(r3)
            com.bxkj.student.run.app.face.widget.a$a r3 = r3.d(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "本次需要采集1张，请采集第"
            r4.append(r0)
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.util.List r0 = r0.getBitmapList()
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 + r1
            r4.append(r0)
            java.lang.String r0 = "张"
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            com.bxkj.student.run.app.face.widget.c r0 = new com.bxkj.student.run.app.face.widget.c
            r0.<init>()
            r3.f(r4, r0)
            com.bxkj.student.run.app.face.widget.a r3 = r5.b()
            r2.P = r3
            r3.setCancelable(r1)
        L46:
            com.bxkj.student.run.app.face.widget.a r3 = r2.P
            r3.dismiss()
            com.bxkj.student.run.app.face.widget.a r3 = r2.P
            r3.show()
            return
    }

    private void P() {
            r6 = this;
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.util.List r0 = r0.getBitmapList()
            int r0 = r0.size()
            java.lang.String[] r1 = new java.lang.String[r0]
            r2 = 0
            r3 = 0
        L10:
            com.bxkj.base.user.LoginUser r4 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.util.List r4 = r4.getBitmapList()
            int r4 = r4.size()
            if (r3 >= r4) goto L35
            com.bxkj.base.user.LoginUser r4 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.util.List r4 = r4.getBitmapList()
            java.lang.Object r4 = r4.get(r3)
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            java.lang.String r4 = com.bxkj.base.util.c.a(r4)
            r1[r3] = r4
            int r3 = r3 + 1
            goto L10
        L35:
            if (r0 > 0) goto L47
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r6.O
            java.lang.Class<com.bxkj.student.run.app.face.widget.FaceDetect5ExpActivity> r2 = com.bxkj.student.run.app.face.widget.FaceDetect5ExpActivity.class
            r0.<init>(r1, r2)
            r6.startActivity(r0)
            r6.finish()
            return
        L47:
            android.content.Context r0 = r6.O
            r1 = r1[r2]
            android.graphics.Bitmap r1 = r6.base64ToBitmap(r1)
            java.io.File r0 = r6.N(r0, r1)
            android.content.Context r1 = r6.O
            cn.bluemobi.dylan.http.HttpRequest r1 = cn.bluemobi.dylan.http.Http.with(r1)
            java.lang.Class<d0.a> r2 = d0.a.class
            java.lang.Object r2 = cn.bluemobi.dylan.http.Http.getApiService(r2)
            d0.a r2 = (d0.a) r2
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r3 = r3.getUserId()
            java.lang.String r4 = "userId"
            okhttp3.MultipartBody$Part r3 = okhttp3.MultipartBody.Part.createFormData(r4, r3)
            java.lang.String r4 = r0.getName()
            java.lang.String r5 = "image/png"
            okhttp3.MediaType r5 = okhttp3.MediaType.parse(r5)
            okhttp3.RequestBody r0 = okhttp3.RequestBody.create(r0, r5)
            java.lang.String r5 = "file"
            okhttp3.MultipartBody$Part r0 = okhttp3.MultipartBody.Part.createFormData(r5, r4, r0)
            rx.e r0 = r2.F1(r3, r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r1.setObservable(r0)
            com.bxkj.student.run.app.face.widget.FaceDetect5ExpActivity$a r1 = new com.bxkj.student.run.app.face.widget.FaceDetect5ExpActivity$a
            r1.<init>(r6)
            r0.setDataListener(r1)
            return
    }

    private android.graphics.Bitmap base64ToBitmap(java.lang.String r3) {
            r2 = this;
            r0 = 2
            byte[] r3 = com.baidu.idl.face.platform.utils.Base64Utils.decode(r3, r0)
            r0 = 0
            int r1 = r3.length
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeByteArray(r3, r0, r1)
            return r3
    }

    public static /* synthetic */ void e(com.bxkj.student.run.app.face.widget.FaceDetect5ExpActivity r0, android.view.View r1) {
            r0.M(r1)
            return
    }

    public static /* synthetic */ void f(android.content.DialogInterface r0, int r1) {
            r0.dismiss()
            return
    }

    static /* bridge */ /* synthetic */ android.content.Context g(com.bxkj.student.run.app.face.widget.FaceDetect5ExpActivity r0) {
            android.content.Context r0 = r0.O
            return r0
    }

    static /* bridge */ /* synthetic */ void h(com.bxkj.student.run.app.face.widget.FaceDetect5ExpActivity r0) {
            r0.P()
            return
    }

    public java.io.File N(android.content.Context r7, android.graphics.Bitmap r8) {
            r6 = this;
            r0 = 0
            if (r8 == 0) goto La2
            boolean r1 = r8.isRecycled()
            if (r1 == 0) goto Lb
            goto La2
        Lb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "bmp.getWidth()="
            r1.append(r2)
            int r2 = r8.getWidth()
            r1.append(r2)
            java.lang.String r2 = "bmp.getHeight()"
            r1.append(r2)
            int r2 = r8.getHeight()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.orhanobut.logger.j.c(r1)
            java.lang.String r1 = "mounted"
            java.lang.String r2 = android.os.Environment.getExternalStorageState()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L40
            java.io.File r1 = r7.getExternalCacheDir()
            goto L41
        L40:
            r1 = r0
        L41:
            if (r1 == 0) goto L49
            boolean r2 = r1.exists()
            if (r2 != 0) goto L4d
        L49:
            java.io.File r1 = r7.getCacheDir()
        L4d:
            java.io.File r7 = new java.io.File
            java.lang.String r2 = "avatar"
            r7.<init>(r1, r2)
            boolean r1 = r7.exists()
            if (r1 != 0) goto L5e
            boolean r1 = r7.mkdirs()
        L5e:
            if (r1 == 0) goto La2
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            long r4 = java.lang.System.currentTimeMillis()
            r3.append(r4)
            java.lang.String r2 = ".jpg"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r7, r2)
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L92 java.io.FileNotFoundException -> L94
            r7.<init>(r1)     // Catch: java.lang.Throwable -> L92 java.io.FileNotFoundException -> L94
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L8d java.io.FileNotFoundException -> L90
            r3 = 100
            r8.compress(r2, r3, r7)     // Catch: java.lang.Throwable -> L8d java.io.FileNotFoundException -> L90
            r7.close()     // Catch: java.io.IOException -> L8c
        L8c:
            return r1
        L8d:
            r8 = move-exception
            r0 = r7
            goto L97
        L90:
            goto L9d
        L92:
            r8 = move-exception
            goto L97
        L94:
            r7 = r0
            goto L9d
        L97:
            if (r0 == 0) goto L9c
            r0.close()     // Catch: java.io.IOException -> L9c
        L9c:
            throw r8
        L9d:
            if (r7 == 0) goto La2
            r7.close()     // Catch: java.io.IOException -> La2
        La2:
            return r0
    }

    public native void onCreate(android.os.Bundle r1);

    protected void onDestroy() {
            r0 = this;
            super/*androidx.appcompat.app.AppCompatActivity*/.onDestroy()
            return
    }

    protected void onFace(java.lang.String r5) {
            r4 = this;
            super.onFace(r5)
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.util.List r0 = r0.getBitmapList()
            android.graphics.Bitmap r5 = r4.base64ToBitmap(r5)
            r0.add(r5)
            android.widget.LinearLayout r5 = r4.mImageLayout
            r5.removeAllViews()
            com.bxkj.base.user.LoginUser r5 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.util.List r5 = r5.getBitmapList()
            java.util.Iterator r5 = r5.iterator()
        L23:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L44
            java.lang.Object r0 = r5.next()
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            android.widget.ImageView r1 = new android.widget.ImageView
            r1.<init>(r4)
            r1.setImageBitmap(r0)
            android.widget.LinearLayout r0 = r4.mImageLayout
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r3 = 300(0x12c, float:4.2E-43)
            r2.<init>(r3, r3)
            r0.addView(r1, r2)
            goto L23
        L44:
            com.bxkj.base.user.LoginUser r5 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.util.List r5 = r5.getBitmapList()
            int r5 = r5.size()
            r0 = 1
            if (r5 >= r0) goto L63
            android.content.Intent r5 = new android.content.Intent
            android.content.Context r0 = r4.O
            java.lang.Class<com.bxkj.student.run.app.face.widget.FaceDetect5ExpActivity> r1 = com.bxkj.student.run.app.face.widget.FaceDetect5ExpActivity.class
            r5.<init>(r0, r1)
            r4.startActivity(r5)
            r4.finish()
            return
        L63:
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r5 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
            android.content.Context r0 = r4.O
            r5.<init>(r0)
            java.lang.String r0 = "采集成功,点击确定开始上传"
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r5 = r5.setMessage(r0)
            com.bxkj.student.run.app.face.widget.b r0 = new com.bxkj.student.run.app.face.widget.b
            r0.<init>(r4)
            cn.bluemobi.dylan.base.view.iOSOneButtonDialog r5 = r5.setButtonOnClickListener(r0)
            r5.show()
            return
    }
}
