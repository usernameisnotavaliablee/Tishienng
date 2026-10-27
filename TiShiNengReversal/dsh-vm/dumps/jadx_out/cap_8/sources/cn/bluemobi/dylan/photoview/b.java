package cn.bluemobi.dylan.photoview;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b implements java.lang.Runnable {
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private android.content.Context f160b;

    /* renamed from: c, reason: collision with root package name */
    private java.io.File f161c;

    /* renamed from: d, reason: collision with root package name */
    private cn.bluemobi.dylan.photoview.c f162d;

    public b(android.content.Context r1, java.lang.String r2, cn.bluemobi.dylan.photoview.c r3) {
            r0 = this;
            r0.<init>()
            r0.a = r2
            r0.f160b = r1
            r0.f162d = r3
            return
    }

    public static android.graphics.Bitmap a(android.graphics.drawable.Drawable r5) {
            int r0 = r5.getIntrinsicWidth()
            int r1 = r5.getIntrinsicHeight()
            java.io.PrintStream r2 = java.lang.System.out
            r2.getClass()
            int r2 = r5.getOpacity()
            r3 = -1
            if (r2 == r3) goto L17
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            goto L19
        L17:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.RGB_565
        L19:
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            android.graphics.Canvas r3 = new android.graphics.Canvas
            r3.<init>(r2)
            r4 = 0
            r5.setBounds(r4, r4, r0, r1)
            r5.draw(r3)
            return r2
    }

    public void b(android.content.Context r5, android.graphics.Bitmap r6) {
            r4 = this;
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
            r4.f161c = r2
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57 java.io.FileNotFoundException -> L59
            java.io.File r2 = r4.f161c     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57 java.io.FileNotFoundException -> L59
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57 java.io.FileNotFoundException -> L59
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4f java.io.FileNotFoundException -> L52
            r2 = 100
            r6.compress(r0, r2, r1)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4f java.io.FileNotFoundException -> L52
            r1.flush()     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4f java.io.FileNotFoundException -> L52
            r1.close()     // Catch: java.io.IOException -> L6a
            goto L6a
        L4c:
            r5 = move-exception
            r0 = r1
            goto L5b
        L4f:
            r0 = r1
            goto L61
        L52:
            r0 = r1
            goto L67
        L55:
            r5 = move-exception
            goto L5b
        L57:
            goto L61
        L59:
            goto L67
        L5b:
            if (r0 == 0) goto L60
            r0.close()     // Catch: java.io.IOException -> L60
        L60:
            throw r5
        L61:
            if (r0 == 0) goto L6a
        L63:
            r0.close()     // Catch: java.io.IOException -> L6a
            goto L6a
        L67:
            if (r0 == 0) goto L6a
            goto L63
        L6a:
            android.content.Intent r6 = new android.content.Intent
            java.io.File r0 = new java.io.File
            java.io.File r1 = r4.f161c
            java.lang.String r1 = r1.getPath()
            r0.<init>(r1)
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            java.lang.String r1 = "android.intent.action.MEDIA_SCANNER_SCAN_FILE"
            r6.<init>(r1, r0)
            r5.sendBroadcast(r6)
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r3 = this;
            r0 = 0
            android.content.Context r1 = r3.f160b     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L27
            com.bumptech.glide.i r1 = com.bumptech.glide.b.D(r1)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L27
            java.lang.String r2 = r3.a     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L27
            com.bumptech.glide.h r1 = r1.M(r2)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L27
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            com.bumptech.glide.request.d r1 = r1.i1(r2, r2)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L27
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L27
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L27
            android.graphics.Bitmap r0 = a(r1)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L27
            if (r0 == 0) goto L29
            android.content.Context r1 = r3.f160b     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L27
            r3.b(r1, r0)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L27
            goto L29
        L25:
            r1 = move-exception
            goto L43
        L27:
            goto L5d
        L29:
            if (r0 == 0) goto L3b
            java.io.File r0 = r3.f161c
            boolean r0 = r0.exists()
            if (r0 == 0) goto L3b
            cn.bluemobi.dylan.photoview.c r0 = r3.f162d
            if (r0 == 0) goto L76
            r0.onSuccess()
            return
        L3b:
            cn.bluemobi.dylan.photoview.c r0 = r3.f162d
            if (r0 == 0) goto L76
            r0.a()
            return
        L43:
            if (r0 == 0) goto L55
            java.io.File r0 = r3.f161c
            boolean r0 = r0.exists()
            if (r0 == 0) goto L55
            cn.bluemobi.dylan.photoview.c r0 = r3.f162d
            if (r0 == 0) goto L5c
            r0.onSuccess()
            goto L5c
        L55:
            cn.bluemobi.dylan.photoview.c r0 = r3.f162d
            if (r0 == 0) goto L5c
            r0.a()
        L5c:
            throw r1
        L5d:
            if (r0 == 0) goto L6f
            java.io.File r0 = r3.f161c
            boolean r0 = r0.exists()
            if (r0 == 0) goto L6f
            cn.bluemobi.dylan.photoview.c r0 = r3.f162d
            if (r0 == 0) goto L76
            r0.onSuccess()
            goto L76
        L6f:
            cn.bluemobi.dylan.photoview.c r0 = r3.f162d
            if (r0 == 0) goto L76
            r0.a()
        L76:
            return
    }
}
