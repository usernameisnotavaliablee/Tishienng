package com.bxkj.student.run.app.face;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class FaceDetectExpActivity extends com.baidu.idl.face.platform.ui.BaseFaceDetectActivity {
    public static final int R = 187;
    public static final int S = 170;
    protected android.content.Context O;
    private java.lang.String P;
    private boolean Q;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.student.run.app.face.FaceDetectExpActivity a;

        a(com.bxkj.student.run.app.face.FaceDetectExpActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public static /* synthetic */ void a(com.bxkj.student.run.app.face.FaceDetectExpActivity.a r0, android.view.View r1) {
                r0.d(r1)
                return
        }

        public static /* synthetic */ void b(com.bxkj.student.run.app.face.FaceDetectExpActivity.a r0, android.view.View r1) {
                r0.f(r1)
                return
        }

        public static /* synthetic */ void c(com.bxkj.student.run.app.face.FaceDetectExpActivity.a r0, android.view.View r1) {
                r0.e(r1)
                return
        }

        private /* synthetic */ void d(android.view.View r1) {
                r0 = this;
                com.bxkj.student.run.app.face.FaceDetectExpActivity r1 = r0.a
                r1.M()
                return
        }

        private /* synthetic */ void e(android.view.View r1) {
                r0 = this;
                com.bxkj.student.run.app.face.FaceDetectExpActivity r1 = r0.a
                r1.M()
                return
        }

        private /* synthetic */ void f(android.view.View r1) {
                r0 = this;
                com.bxkj.student.run.app.face.FaceDetectExpActivity r1 = r0.a
                r1.M()
                return
        }

        public void netOnFailure(java.lang.Throwable r2) {
                r1 = this;
                super.netOnFailure(r2)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.run.app.face.FaceDetectExpActivity r0 = r1.a
                android.content.Context r0 = r0.O
                r2.<init>(r0)
                java.lang.String r0 = "人脸识别失败，请重新再试"
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r0)
                com.bxkj.student.run.app.face.b r0 = new com.bxkj.student.run.app.face.b
                r0.<init>(r1)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setButtonOnClickListener(r0)
                r2.show()
                return
        }

        public void netOnOtherStatus(int r2, java.lang.String r3) {
                r1 = this;
                super.netOnOtherStatus(r2, r3)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.run.app.face.FaceDetectExpActivity r0 = r1.a
                android.content.Context r0 = r0.O
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                com.bxkj.student.run.app.face.c r3 = new com.bxkj.student.run.app.face.c
                r3.<init>(r1)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setButtonOnClickListener(r3)
                r2.show()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2) {
                r1 = this;
                com.bxkj.student.run.app.face.FaceDetectExpActivity r2 = r1.a
                r0 = -1
                r2.setResult(r0)
                com.bxkj.student.run.app.face.FaceDetectExpActivity r2 = r1.a
                r2.finish()
                return
        }

        public void netOnSuccessServerError(int r2, java.lang.String r3) {
                r1 = this;
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = new cn.bluemobi.dylan.base.view.iOSOneButtonDialog
                com.bxkj.student.run.app.face.FaceDetectExpActivity r0 = r1.a
                android.content.Context r0 = r0.O
                r2.<init>(r0)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setMessage(r3)
                com.bxkj.student.run.app.face.d r3 = new com.bxkj.student.run.app.face.d
                r3.<init>(r1)
                cn.bluemobi.dylan.base.view.iOSOneButtonDialog r2 = r2.setButtonOnClickListener(r3)
                r2.show()
                return
        }
    }

    static {
            r0 = 17115(0x42db, float:2.3983E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public FaceDetectExpActivity() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.P = r0
            r0 = 1
            r1.Q = r0
            return
    }

    private void L() {
            r2 = this;
            com.bxkj.student.v2.ui.face.FaceManger r0 = com.bxkj.student.v2.ui.face.FaceManger.a
            android.content.Context r1 = r2.O
            r0.e(r1, r2)
            return
    }

    private void O(android.app.Activity r2, float r3) {
            r1 = this;
            android.view.Window r2 = r2.getWindow()
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
            r0.screenBrightness = r3
            r2.setAttributes(r0)
            return
    }

    protected void M() {
            r2 = this;
            r0 = 170(0xaa, float:2.38E-43)
            android.content.Intent r1 = r2.getIntent()
            r2.setResult(r0, r1)
            r2.finish()
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
            java.lang.String r2 = ".png"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r7, r2)
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L92 java.io.FileNotFoundException -> L94
            r7.<init>(r1)     // Catch: java.lang.Throwable -> L92 java.io.FileNotFoundException -> L94
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Throwable -> L8d java.io.FileNotFoundException -> L90
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

    protected android.graphics.Bitmap base64ToBitmap(java.lang.String r3) {
            r2 = this;
            r0 = 2
            byte[] r3 = com.baidu.idl.face.platform.utils.Base64Utils.decode(r3, r0)
            r0 = 0
            int r1 = r3.length
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeByteArray(r3, r0, r1)
            return r3
    }

    protected void e(java.lang.String r6) {
            r5 = this;
            android.content.Context r0 = r5.O
            android.graphics.Bitmap r6 = r5.base64ToBitmap(r6)
            java.io.File r6 = r5.N(r0, r6)
            android.content.Context r0 = r5.O
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            boolean r1 = r5.Q
            if (r1 != 0) goto L1b
            r0.hideSuccessMessage()
        L1b:
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r1 = r1.getUserId()
            java.lang.String r2 = "userId"
            okhttp3.MultipartBody$Part r1 = okhttp3.MultipartBody.Part.createFormData(r2, r1)
            java.lang.String r2 = "identify"
            java.lang.String r3 = r5.P
            okhttp3.MultipartBody$Part r2 = okhttp3.MultipartBody.Part.createFormData(r2, r3)
            java.lang.String r3 = "application/octet-stream"
            okhttp3.MediaType r3 = okhttp3.MediaType.parse(r3)
            okhttp3.RequestBody r3 = okhttp3.RequestBody.create(r6, r3)
            java.lang.String r4 = "file"
            java.lang.String r6 = r6.getName()
            okhttp3.MultipartBody$Part r6 = okhttp3.MultipartBody.Part.createFormData(r4, r6, r3)
            java.lang.Class<com.bxkj.student.run.app.a> r3 = com.bxkj.student.run.app.a.class
            java.lang.Object r3 = cn.bluemobi.dylan.http.Http.getApiService(r3)
            com.bxkj.student.run.app.a r3 = (com.bxkj.student.run.app.a) r3
            rx.e r6 = r3.h(r1, r2, r6)
            cn.bluemobi.dylan.http.HttpRequest r6 = r0.setObservable(r6)
            com.bxkj.student.run.app.face.FaceDetectExpActivity$a r0 = new com.bxkj.student.run.app.face.FaceDetectExpActivity$a
            r0.<init>(r5)
            r6.setDataListener(r0)
            return
    }

    public native void onCreate(android.os.Bundle r1);

    protected void onDestroy() {
            r1 = this;
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.O(r1, r0)
            super/*androidx.appcompat.app.AppCompatActivity*/.onDestroy()
            return
    }

    protected void onFace(java.lang.String r1) {
            r0 = this;
            super.onFace(r1)
            r0.e(r1)
            return
    }
}
