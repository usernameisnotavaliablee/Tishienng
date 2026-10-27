package com.bxkj.student.personal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ClipImageActivity extends cn.bluemobi.dylan.base.BaseActivity {

    /* renamed from: p0, reason: collision with root package name */
    private static final java.lang.String f1120p0 = "ClipImageActivity";
    private com.bxkj.student.common.crop.view.ClipViewLayout Y;
    private com.bxkj.student.common.crop.view.ClipViewLayout Z;
    private android.widget.ImageView a0;
    private android.widget.TextView b0;
    private android.widget.TextView c0;

    /* renamed from: k0, reason: collision with root package name */
    private int f1121k0;

    public ClipImageActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    private void g0() {
            r7 = this;
            int r0 = r7.f1121k0
            r1 = 1
            if (r0 != r1) goto Lc
            com.bxkj.student.common.crop.view.ClipViewLayout r0 = r7.Y
            android.graphics.Bitmap r0 = r0.d()
            goto L12
        Lc:
            com.bxkj.student.common.crop.view.ClipViewLayout r0 = r7.Z
            android.graphics.Bitmap r0 = r0.d()
        L12:
            if (r0 != 0) goto L15
            return
        L15:
            java.lang.String r1 = "mounted"
            java.lang.String r2 = android.os.Environment.getExternalStorageState()
            boolean r1 = r1.equals(r2)
            r2 = 0
            if (r1 == 0) goto L27
            java.io.File r1 = r7.getExternalCacheDir()
            goto L28
        L27:
            r1 = r2
        L28:
            if (r1 == 0) goto L30
            boolean r3 = r1.exists()
            if (r3 != 0) goto L34
        L30:
            java.io.File r1 = r7.getCacheDir()
        L34:
            java.io.File r3 = new java.io.File
            java.lang.String r4 = "avatar"
            r3.<init>(r1, r4)
            boolean r1 = r3.exists()
            if (r1 != 0) goto L44
            r3.mkdirs()
        L44:
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "cropped_"
            r4.append(r5)
            long r5 = java.lang.System.currentTimeMillis()
            r4.append(r5)
            java.lang.String r5 = ".jpg"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r1.<init>(r3, r4)
            android.net.Uri r1 = android.net.Uri.fromFile(r1)
            if (r1 == 0) goto L9f
            android.content.ContentResolver r3 = r7.getContentResolver()     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L83
            java.io.OutputStream r2 = r3.openOutputStream(r1)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L83
            if (r2 == 0) goto L7d
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L83
            r4 = 100
            r0.compress(r3, r4, r2)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L83
            goto L7d
        L7b:
            r0 = move-exception
            goto L99
        L7d:
            if (r2 == 0) goto L89
        L7f:
            r2.close()     // Catch: java.io.IOException -> L89
            goto L89
        L83:
            r1.toString()     // Catch: java.lang.Throwable -> L7b
            if (r2 == 0) goto L89
            goto L7f
        L89:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r0.setData(r1)
            r1 = -1
            r7.setResult(r1, r0)
            r7.finish()
            return
        L99:
            if (r2 == 0) goto L9e
            r2.close()     // Catch: java.io.IOException -> L9e
        L9e:
            throw r0
        L9f:
            return
    }

    public void L() {
            r0 = this;
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131492919(0x7f0c0037, float:1.8609303E38)
            return r0
    }

    public void R() {
            r3 = this;
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "type"
            r2 = 1
            int r0 = r0.getIntExtra(r1, r2)
            r3.f1121k0 = r0
            return
    }

    public void S() {
            r0 = this;
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            r1 = 2131296753(0x7f0901f1, float:1.8211432E38)
            android.view.View r1 = r0.findViewById(r1)
            com.bxkj.student.common.crop.view.ClipViewLayout r1 = (com.bxkj.student.common.crop.view.ClipViewLayout) r1
            r0.Y = r1
            r1 = 2131296754(0x7f0901f2, float:1.8211434E38)
            android.view.View r1 = r0.findViewById(r1)
            com.bxkj.student.common.crop.view.ClipViewLayout r1 = (com.bxkj.student.common.crop.view.ClipViewLayout) r1
            r0.Z = r1
            r1 = 2131297102(0x7f09034e, float:1.821214E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.a0 = r1
            r1 = 2131296660(0x7f090194, float:1.8211243E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.b0 = r1
            r1 = 2131296623(0x7f09016f, float:1.8211168E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.c0 = r1
            android.widget.ImageView r1 = r0.a0
            r1.setOnClickListener(r0)
            android.widget.TextView r1 = r0.b0
            r1.setOnClickListener(r0)
            android.widget.TextView r1 = r0.c0
            r1.setOnClickListener(r0)
            return
    }

    public void onClick(android.view.View r2) {
            r1 = this;
            int r2 = r2.getId()
            r0 = 2131296623(0x7f09016f, float:1.8211168E38)
            if (r2 == r0) goto L1c
            r0 = 2131296660(0x7f090194, float:1.8211243E38)
            if (r2 == r0) goto L18
            r0 = 2131297102(0x7f09034e, float:1.821214E38)
            if (r2 == r0) goto L14
            return
        L14:
            r1.finish()
            return
        L18:
            r1.finish()
            return
        L1c:
            r1.g0()
            return
    }

    protected void onResume() {
            r4 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onResume()
            int r0 = r4.f1121k0
            r1 = 1
            r2 = 8
            r3 = 0
            if (r0 != r1) goto L23
            com.bxkj.student.common.crop.view.ClipViewLayout r0 = r4.Y
            r0.setVisibility(r3)
            com.bxkj.student.common.crop.view.ClipViewLayout r0 = r4.Z
            r0.setVisibility(r2)
            com.bxkj.student.common.crop.view.ClipViewLayout r0 = r4.Y
            android.content.Intent r1 = r4.getIntent()
            android.net.Uri r1 = r1.getData()
            r0.setImageSrc(r1)
            return
        L23:
            com.bxkj.student.common.crop.view.ClipViewLayout r0 = r4.Z
            r0.setVisibility(r3)
            com.bxkj.student.common.crop.view.ClipViewLayout r0 = r4.Y
            r0.setVisibility(r2)
            com.bxkj.student.common.crop.view.ClipViewLayout r0 = r4.Z
            android.content.Intent r1 = r4.getIntent()
            android.net.Uri r1 = r1.getData()
            r0.setImageSrc(r1)
            return
    }
}
