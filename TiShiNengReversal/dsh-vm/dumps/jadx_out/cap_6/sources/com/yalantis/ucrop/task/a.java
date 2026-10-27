package com.yalantis.ucrop.task;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Throwable> {
    private static final java.lang.String s = "BitmapCropTask";
    private final java.lang.ref.WeakReference<android.content.Context> a;
    private android.graphics.Bitmap b;
    private final android.graphics.RectF c;
    private final android.graphics.RectF d;
    private float e;
    private float f;
    private final int g;
    private final int h;
    private final android.graphics.Bitmap.CompressFormat i;
    private final int j;
    private final java.lang.String k;
    private final java.lang.String l;
    private final com.yalantis.ucrop.model.b m;
    private final e3.a n;
    private int o;
    private int p;

    /* renamed from: q, reason: collision with root package name */
    private int f44q;
    private int r;

    public a(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.graphics.Bitmap r3, @androidx.annotation.NonNull com.yalantis.ucrop.model.c r4, @androidx.annotation.NonNull com.yalantis.ucrop.model.a r5, @androidx.annotation.Nullable e3.a r6) {
            r1 = this;
            r1.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.a = r0
            r1.b = r3
            android.graphics.RectF r2 = r4.a()
            r1.c = r2
            android.graphics.RectF r2 = r4.c()
            r1.d = r2
            float r2 = r4.d()
            r1.e = r2
            float r2 = r4.b()
            r1.f = r2
            int r2 = r5.f()
            r1.g = r2
            int r2 = r5.g()
            r1.h = r2
            android.graphics.Bitmap$CompressFormat r2 = r5.a()
            r1.i = r2
            int r2 = r5.b()
            r1.j = r2
            java.lang.String r2 = r5.d()
            r1.k = r2
            java.lang.String r2 = r5.e()
            r1.l = r2
            com.yalantis.ucrop.model.b r2 = r5.c()
            r1.m = r2
            r1.n = r6
            return
    }

    private boolean a() throws java.io.IOException {
            r9 = this;
            int r0 = r9.g
            r1 = 0
            if (r0 <= 0) goto L5f
            int r0 = r9.h
            if (r0 <= 0) goto L5f
            android.graphics.RectF r0 = r9.c
            float r0 = r0.width()
            float r2 = r9.e
            float r0 = r0 / r2
            android.graphics.RectF r2 = r9.c
            float r2 = r2.height()
            float r3 = r9.e
            float r2 = r2 / r3
            int r3 = r9.g
            float r4 = (float) r3
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 > 0) goto L29
            int r4 = r9.h
            float r4 = (float) r4
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto L5f
        L29:
            float r3 = (float) r3
            float r3 = r3 / r0
            int r0 = r9.h
            float r0 = (float) r0
            float r0 = r0 / r2
            float r0 = java.lang.Math.min(r3, r0)
            android.graphics.Bitmap r2 = r9.b
            int r3 = r2.getWidth()
            float r3 = (float) r3
            float r3 = r3 * r0
            int r3 = java.lang.Math.round(r3)
            android.graphics.Bitmap r4 = r9.b
            int r4 = r4.getHeight()
            float r4 = (float) r4
            float r4 = r4 * r0
            int r4 = java.lang.Math.round(r4)
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createScaledBitmap(r2, r3, r4, r1)
            android.graphics.Bitmap r3 = r9.b
            if (r3 == r2) goto L58
            r3.recycle()
        L58:
            r9.b = r2
            float r2 = r9.e
            float r2 = r2 / r0
            r9.e = r2
        L5f:
            float r0 = r9.f
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L9e
            android.graphics.Matrix r7 = new android.graphics.Matrix
            r7.<init>()
            float r0 = r9.f
            android.graphics.Bitmap r2 = r9.b
            int r2 = r2.getWidth()
            int r2 = r2 / 2
            float r2 = (float) r2
            android.graphics.Bitmap r3 = r9.b
            int r3 = r3.getHeight()
            int r3 = r3 / 2
            float r3 = (float) r3
            r7.setRotate(r0, r2, r3)
            android.graphics.Bitmap r2 = r9.b
            int r5 = r2.getWidth()
            android.graphics.Bitmap r0 = r9.b
            int r6 = r0.getHeight()
            r8 = 1
            r3 = 0
            r4 = 0
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r3, r4, r5, r6, r7, r8)
            android.graphics.Bitmap r2 = r9.b
            if (r2 == r0) goto L9c
            r2.recycle()
        L9c:
            r9.b = r0
        L9e:
            android.graphics.RectF r0 = r9.c
            float r0 = r0.left
            android.graphics.RectF r2 = r9.d
            float r2 = r2.left
            float r0 = r0 - r2
            float r2 = r9.e
            float r0 = r0 / r2
            int r0 = java.lang.Math.round(r0)
            r9.f44q = r0
            android.graphics.RectF r0 = r9.c
            float r0 = r0.top
            android.graphics.RectF r2 = r9.d
            float r2 = r2.top
            float r0 = r0 - r2
            float r2 = r9.e
            float r0 = r0 / r2
            int r0 = java.lang.Math.round(r0)
            r9.r = r0
            android.graphics.RectF r0 = r9.c
            float r0 = r0.width()
            float r2 = r9.e
            float r0 = r0 / r2
            int r0 = java.lang.Math.round(r0)
            r9.o = r0
            android.graphics.RectF r0 = r9.c
            float r0 = r0.height()
            float r2 = r9.e
            float r0 = r0 / r2
            int r0 = java.lang.Math.round(r0)
            r9.p = r0
            int r2 = r9.o
            boolean r0 = r9.e(r2, r0)
            if (r0 == 0) goto L115
            androidx.exifinterface.media.ExifInterface r0 = new androidx.exifinterface.media.ExifInterface
            java.lang.String r1 = r9.k
            r0.<init>(r1)
            android.graphics.Bitmap r1 = r9.b
            int r2 = r9.f44q
            int r3 = r9.r
            int r4 = r9.o
            int r5 = r9.p
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r1, r2, r3, r4, r5)
            r9.d(r1)
            android.graphics.Bitmap$CompressFormat r1 = r9.i
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L113
            int r1 = r9.o
            int r2 = r9.p
            java.lang.String r3 = r9.l
            com.yalantis.ucrop.util.f.b(r0, r1, r2, r3)
        L113:
            r0 = 1
            return r0
        L115:
            java.lang.String r0 = r9.k
            java.lang.String r2 = r9.l
            com.yalantis.ucrop.util.e.a(r0, r2)
            return r1
    }

    private void d(@androidx.annotation.NonNull android.graphics.Bitmap r5) throws java.io.FileNotFoundException {
            r4 = this;
            java.lang.ref.WeakReference<android.content.Context> r0 = r4.a
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            if (r0 != 0) goto Lb
            return
        Lb:
            r1 = 0
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L2d
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = r4.l     // Catch: java.lang.Throwable -> L2d
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2d
            android.net.Uri r2 = android.net.Uri.fromFile(r2)     // Catch: java.lang.Throwable -> L2d
            java.io.OutputStream r1 = r0.openOutputStream(r2)     // Catch: java.lang.Throwable -> L2d
            android.graphics.Bitmap$CompressFormat r0 = r4.i     // Catch: java.lang.Throwable -> L2d
            int r2 = r4.j     // Catch: java.lang.Throwable -> L2d
            r5.compress(r0, r2, r1)     // Catch: java.lang.Throwable -> L2d
            r5.recycle()     // Catch: java.lang.Throwable -> L2d
            com.yalantis.ucrop.util.a.c(r1)
            return
        L2d:
            r5 = move-exception
            com.yalantis.ucrop.util.a.c(r1)
            throw r5
    }

    private boolean e(int r3, int r4) {
            r2 = this;
            int r3 = java.lang.Math.max(r3, r4)
            float r3 = (float) r3
            r4 = 1148846080(0x447a0000, float:1000.0)
            float r3 = r3 / r4
            int r3 = java.lang.Math.round(r3)
            r4 = 1
            int r3 = r3 + r4
            int r0 = r2.g
            if (r0 <= 0) goto L16
            int r0 = r2.h
            if (r0 > 0) goto L65
        L16:
            android.graphics.RectF r0 = r2.c
            float r0 = r0.left
            android.graphics.RectF r1 = r2.d
            float r1 = r1.left
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            float r3 = (float) r3
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L65
            android.graphics.RectF r0 = r2.c
            float r0 = r0.top
            android.graphics.RectF r1 = r2.d
            float r1 = r1.top
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L65
            android.graphics.RectF r0 = r2.c
            float r0 = r0.bottom
            android.graphics.RectF r1 = r2.d
            float r1 = r1.bottom
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L65
            android.graphics.RectF r0 = r2.c
            float r0 = r0.right
            android.graphics.RectF r1 = r2.d
            float r1 = r1.right
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 > 0) goto L65
            float r3 = r2.f
            r0 = 0
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 == 0) goto L63
            goto L65
        L63:
            r3 = 0
            return r3
        L65:
            return r4
    }

    @androidx.annotation.Nullable
    protected java.lang.Throwable b(java.lang.Void... r2) {
            r1 = this;
            android.graphics.Bitmap r2 = r1.b
            if (r2 != 0) goto Lc
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "ViewBitmap is null"
            r2.<init>(r0)
            return r2
        Lc:
            boolean r2 = r2.isRecycled()
            if (r2 == 0) goto L1a
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "ViewBitmap is recycled"
            r2.<init>(r0)
            return r2
        L1a:
            android.graphics.RectF r2 = r1.d
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L2a
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "CurrentImageRect is empty"
            r2.<init>(r0)
            return r2
        L2a:
            r1.a()     // Catch: java.lang.Throwable -> L31
            r2 = 0
            r1.b = r2     // Catch: java.lang.Throwable -> L31
            return r2
        L31:
            r2 = move-exception
            return r2
    }

    protected void c(@androidx.annotation.Nullable java.lang.Throwable r8) {
            r7 = this;
            e3.a r0 = r7.n
            if (r0 == 0) goto L22
            if (r8 != 0) goto L1f
            java.io.File r8 = new java.io.File
            java.lang.String r0 = r7.l
            r8.<init>(r0)
            android.net.Uri r2 = android.net.Uri.fromFile(r8)
            e3.a r1 = r7.n
            int r3 = r7.f44q
            int r4 = r7.r
            int r5 = r7.o
            int r6 = r7.p
            r1.a(r2, r3, r4, r5, r6)
            return
        L1f:
            r0.b(r8)
        L22:
            return
    }

    @Override // android.os.AsyncTask
    @androidx.annotation.Nullable
    protected /* bridge */ /* synthetic */ java.lang.Throwable doInBackground(java.lang.Void[] r1) {
            r0 = this;
            java.lang.Void[] r1 = (java.lang.Void[]) r1
            java.lang.Throwable r1 = r0.b(r1)
            return r1
    }

    @Override // android.os.AsyncTask
    protected /* bridge */ /* synthetic */ void onPostExecute(@androidx.annotation.Nullable java.lang.Throwable r1) {
            r0 = this;
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r0.c(r1)
            return
    }
}
