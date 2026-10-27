package com.yalantis.ucrop.task;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b extends android.os.AsyncTask<java.lang.Void, java.lang.Void, com.yalantis.ucrop.task.b.a> {
    private static final java.lang.String g = "BitmapWorkerTask";
    private final android.content.Context a;
    private android.net.Uri b;
    private android.net.Uri c;
    private final int d;
    private final int e;
    private final e3.b f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a {
        android.graphics.Bitmap a;
        com.yalantis.ucrop.model.b b;
        java.lang.Exception c;

        public a(@androidx.annotation.NonNull android.graphics.Bitmap r1, @androidx.annotation.NonNull com.yalantis.ucrop.model.b r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        public a(@androidx.annotation.NonNull java.lang.Exception r1) {
                r0 = this;
                r0.<init>()
                r0.c = r1
                return
        }
    }

    public b(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull android.net.Uri r2, @androidx.annotation.Nullable android.net.Uri r3, int r4, int r5, e3.b r6) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            return
    }

    private void a(@androidx.annotation.NonNull android.net.Uri r4, @androidx.annotation.Nullable android.net.Uri r5) throws java.lang.NullPointerException, java.io.IOException {
            r3 = this;
            if (r5 == 0) goto L51
            r0 = 0
            android.content.Context r1 = r3.a     // Catch: java.lang.Throwable -> L44
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.lang.Throwable -> L44
            java.io.InputStream r4 = r1.openInputStream(r4)     // Catch: java.lang.Throwable -> L44
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L42
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L42
            java.lang.String r5 = r5.getPath()     // Catch: java.lang.Throwable -> L42
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L42
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L42
            if (r4 == 0) goto L3a
            r5 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L2c
        L21:
            int r0 = r4.read(r5)     // Catch: java.lang.Throwable -> L2c
            if (r0 <= 0) goto L2f
            r2 = 0
            r1.write(r5, r2, r0)     // Catch: java.lang.Throwable -> L2c
            goto L21
        L2c:
            r5 = move-exception
            r0 = r1
            goto L46
        L2f:
            com.yalantis.ucrop.util.a.c(r1)
            com.yalantis.ucrop.util.a.c(r4)
            android.net.Uri r4 = r3.c
            r3.b = r4
            return
        L3a:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L2c
            java.lang.String r0 = "InputStream for given input Uri is null"
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L2c
            throw r5     // Catch: java.lang.Throwable -> L2c
        L42:
            r5 = move-exception
            goto L46
        L44:
            r5 = move-exception
            r4 = r0
        L46:
            com.yalantis.ucrop.util.a.c(r0)
            com.yalantis.ucrop.util.a.c(r4)
            android.net.Uri r4 = r3.c
            r3.b = r4
            throw r5
        L51:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "Output Uri is null - cannot copy image"
            r4.<init>(r5)
            throw r4
    }

    private void c(@androidx.annotation.NonNull android.net.Uri r6, @androidx.annotation.Nullable android.net.Uri r7) throws java.lang.NullPointerException, java.io.IOException {
            r5 = this;
            if (r7 == 0) goto L85
            okhttp3.OkHttpClient r0 = new okhttp3.OkHttpClient
            r0.<init>()
            r1 = 0
            okhttp3.Request$Builder r2 = new okhttp3.Request$Builder     // Catch: java.lang.Throwable -> L67
            r2.<init>()     // Catch: java.lang.Throwable -> L67
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L67
            okhttp3.Request$Builder r6 = r2.url(r6)     // Catch: java.lang.Throwable -> L67
            okhttp3.Request r6 = r6.build()     // Catch: java.lang.Throwable -> L67
            okhttp3.Call r6 = r0.newCall(r6)     // Catch: java.lang.Throwable -> L67
            okhttp3.Response r6 = r6.execute()     // Catch: java.lang.Throwable -> L67
            okhttp3.ResponseBody r2 = r6.body()     // Catch: java.lang.Throwable -> L63
            okio.BufferedSource r2 = r2.source()     // Catch: java.lang.Throwable -> L63
            android.content.Context r3 = r5.a     // Catch: java.lang.Throwable -> L55
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch: java.lang.Throwable -> L55
            java.io.OutputStream r7 = r3.openOutputStream(r7)     // Catch: java.lang.Throwable -> L55
            if (r7 == 0) goto L5b
            okio.Sink r1 = okio.Okio.sink(r7)     // Catch: java.lang.Throwable -> L55
            r2.readAll(r1)     // Catch: java.lang.Throwable -> L55
            com.yalantis.ucrop.util.a.c(r2)
            com.yalantis.ucrop.util.a.c(r1)
            okhttp3.ResponseBody r6 = r6.body()
            com.yalantis.ucrop.util.a.c(r6)
            okhttp3.Dispatcher r6 = r0.dispatcher()
            r6.cancelAll()
            android.net.Uri r6 = r5.c
            r5.b = r6
            return
        L55:
            r7 = move-exception
            r4 = r2
            r2 = r6
            r6 = r1
            r1 = r4
            goto L6a
        L5b:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L55
            java.lang.String r3 = "OutputStream for given output Uri is null"
            r7.<init>(r3)     // Catch: java.lang.Throwable -> L55
            throw r7     // Catch: java.lang.Throwable -> L55
        L63:
            r7 = move-exception
            r2 = r6
            r6 = r1
            goto L6a
        L67:
            r7 = move-exception
            r6 = r1
            r2 = r6
        L6a:
            com.yalantis.ucrop.util.a.c(r1)
            com.yalantis.ucrop.util.a.c(r6)
            if (r2 == 0) goto L79
            okhttp3.ResponseBody r6 = r2.body()
            com.yalantis.ucrop.util.a.c(r6)
        L79:
            okhttp3.Dispatcher r6 = r0.dispatcher()
            r6.cancelAll()
            android.net.Uri r6 = r5.c
            r5.b = r6
            throw r7
        L85:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r7 = "Output Uri is null - cannot download image"
            r6.<init>(r7)
            throw r6
    }

    private java.lang.String d() {
            r2 = this;
            android.content.Context r0 = r2.a
            java.lang.String r1 = "android.permission.READ_EXTERNAL_STORAGE"
            int r0 = androidx.core.content.ContextCompat.checkSelfPermission(r0, r1)
            if (r0 != 0) goto L13
            android.content.Context r0 = r2.a
            android.net.Uri r1 = r2.b
            java.lang.String r0 = com.yalantis.ucrop.util.e.c(r0, r1)
            return r0
        L13:
            r0 = 0
            return r0
    }

    private void f() throws java.lang.NullPointerException, java.io.IOException {
            r4 = this;
            android.net.Uri r0 = r4.b
            java.lang.String r0 = r0.getScheme()
            java.lang.String r1 = "http"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L68
            java.lang.String r1 = "https"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L17
            goto L68
        L17:
            java.lang.String r1 = "content"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L48
            java.lang.String r0 = r4.d()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L40
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r1 = r1.exists()
            if (r1 == 0) goto L40
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            android.net.Uri r0 = android.net.Uri.fromFile(r1)
            r4.b = r0
            return
        L40:
            android.net.Uri r0 = r4.b
            android.net.Uri r1 = r4.c
            r4.a(r0, r1)
            return
        L48:
            java.lang.String r1 = "file"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L51
            return
        L51:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid Uri scheme"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L68:
            android.net.Uri r0 = r4.b
            android.net.Uri r1 = r4.c
            r4.c(r0, r1)
            return
    }

    @androidx.annotation.NonNull
    protected com.yalantis.ucrop.task.b.a b(java.lang.Void... r9) {
            r8 = this;
            android.net.Uri r9 = r8.b
            if (r9 != 0) goto L11
            com.yalantis.ucrop.task.b$a r9 = new com.yalantis.ucrop.task.b$a
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Input Uri cannot be null"
            r0.<init>(r1)
            r9.<init>(r0)
            return r9
        L11:
            r8.f()     // Catch: java.io.IOException -> L10b java.lang.NullPointerException -> L10d
            android.content.Context r9 = r8.a     // Catch: java.io.FileNotFoundException -> L104
            android.content.ContentResolver r9 = r9.getContentResolver()     // Catch: java.io.FileNotFoundException -> L104
            android.net.Uri r0 = r8.b     // Catch: java.io.FileNotFoundException -> L104
            java.lang.String r1 = "r"
            android.os.ParcelFileDescriptor r9 = r9.openFileDescriptor(r0, r1)     // Catch: java.io.FileNotFoundException -> L104
            java.lang.String r0 = "]"
            if (r9 == 0) goto Le3
            java.io.FileDescriptor r1 = r9.getFileDescriptor()
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options
            r2.<init>()
            r3 = 1
            r2.inJustDecodeBounds = r3
            r4 = 0
            android.graphics.BitmapFactory.decodeFileDescriptor(r1, r4, r2)
            int r5 = r2.outWidth
            r6 = -1
            if (r5 == r6) goto Lc2
            int r5 = r2.outHeight
            if (r5 != r6) goto L41
            goto Lc2
        L41:
            int r5 = r8.d
            int r6 = r8.e
            int r5 = com.yalantis.ucrop.util.a.a(r2, r5, r6)
            r2.inSampleSize = r5
            r5 = 0
            r2.inJustDecodeBounds = r5
            r6 = r4
        L4f:
            if (r5 != 0) goto L5e
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeFileDescriptor(r1, r4, r2)     // Catch: java.lang.OutOfMemoryError -> L57
            r5 = 1
            goto L4f
        L57:
            int r7 = r2.inSampleSize
            int r7 = r7 * 2
            r2.inSampleSize = r7
            goto L4f
        L5e:
            if (r6 != 0) goto L81
            com.yalantis.ucrop.task.b$a r9 = new com.yalantis.ucrop.task.b$a
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Bitmap could not be decoded from the Uri: ["
            r2.append(r3)
            android.net.Uri r3 = r8.b
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            r9.<init>(r1)
            return r9
        L81:
            com.yalantis.ucrop.util.a.c(r9)
            android.content.Context r9 = r8.a
            android.net.Uri r0 = r8.b
            int r9 = com.yalantis.ucrop.util.a.g(r9, r0)
            int r0 = com.yalantis.ucrop.util.a.e(r9)
            int r1 = com.yalantis.ucrop.util.a.f(r9)
            com.yalantis.ucrop.model.b r2 = new com.yalantis.ucrop.model.b
            r2.<init>(r9, r0, r1)
            android.graphics.Matrix r9 = new android.graphics.Matrix
            r9.<init>()
            if (r0 == 0) goto La4
            float r0 = (float) r0
            r9.preRotate(r0)
        La4:
            if (r1 == r3) goto Lac
            float r0 = (float) r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r9.postScale(r0, r1)
        Lac:
            boolean r0 = r9.isIdentity()
            if (r0 != 0) goto Lbc
            com.yalantis.ucrop.task.b$a r0 = new com.yalantis.ucrop.task.b$a
            android.graphics.Bitmap r9 = com.yalantis.ucrop.util.a.h(r6, r9)
            r0.<init>(r9, r2)
            return r0
        Lbc:
            com.yalantis.ucrop.task.b$a r9 = new com.yalantis.ucrop.task.b$a
            r9.<init>(r6, r2)
            return r9
        Lc2:
            com.yalantis.ucrop.task.b$a r9 = new com.yalantis.ucrop.task.b$a
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Bounds for bitmap could not be retrieved from the Uri: ["
            r2.append(r3)
            android.net.Uri r3 = r8.b
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            r9.<init>(r1)
            return r9
        Le3:
            com.yalantis.ucrop.task.b$a r9 = new com.yalantis.ucrop.task.b$a
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "ParcelFileDescriptor was null for given Uri: ["
            r2.append(r3)
            android.net.Uri r3 = r8.b
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            r9.<init>(r1)
            return r9
        L104:
            r9 = move-exception
            com.yalantis.ucrop.task.b$a r0 = new com.yalantis.ucrop.task.b$a
            r0.<init>(r9)
            return r0
        L10b:
            r9 = move-exception
            goto L10e
        L10d:
            r9 = move-exception
        L10e:
            com.yalantis.ucrop.task.b$a r0 = new com.yalantis.ucrop.task.b$a
            r0.<init>(r9)
            return r0
    }

    @Override // android.os.AsyncTask
    @androidx.annotation.NonNull
    protected /* bridge */ /* synthetic */ com.yalantis.ucrop.task.b.a doInBackground(java.lang.Void[] r1) {
            r0 = this;
            java.lang.Void[] r1 = (java.lang.Void[]) r1
            com.yalantis.ucrop.task.b$a r1 = r0.b(r1)
            return r1
    }

    protected void e(@androidx.annotation.NonNull com.yalantis.ucrop.task.b.a r5) {
            r4 = this;
            java.lang.Exception r0 = r5.c
            if (r0 != 0) goto L1e
            e3.b r0 = r4.f
            android.graphics.Bitmap r1 = r5.a
            com.yalantis.ucrop.model.b r5 = r5.b
            android.net.Uri r2 = r4.b
            java.lang.String r2 = r2.getPath()
            android.net.Uri r3 = r4.c
            if (r3 != 0) goto L16
            r3 = 0
            goto L1a
        L16:
            java.lang.String r3 = r3.getPath()
        L1a:
            r0.a(r1, r5, r2, r3)
            return
        L1e:
            e3.b r5 = r4.f
            r5.onFailure(r0)
            return
    }

    @Override // android.os.AsyncTask
    protected /* bridge */ /* synthetic */ void onPostExecute(@androidx.annotation.NonNull com.yalantis.ucrop.task.b.a r1) {
            r0 = this;
            com.yalantis.ucrop.task.b$a r1 = (com.yalantis.ucrop.task.b.a) r1
            r0.e(r1)
            return
    }
}
