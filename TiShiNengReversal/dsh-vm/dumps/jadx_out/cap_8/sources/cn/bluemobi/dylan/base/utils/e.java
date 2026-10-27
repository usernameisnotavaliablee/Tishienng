package cn.bluemobi.dylan.base.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class e {
    public e() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.graphics.Bitmap a(java.lang.String r4) {
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            java.net.URLConnection r4 = r1.openConnection()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            java.io.InputStream r2 = r4.getInputStream()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            int r2 = r1.available()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3b
            r1.mark(r2)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3b
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3b
            r2.<init>()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3b
            r3 = 1
            r2.inJustDecodeBounds = r3     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3b
            android.graphics.BitmapFactory.decodeStream(r1, r0, r2)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3b
            r3 = 0
            r2.inJustDecodeBounds = r3     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3b
            r1.reset()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3b
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r1, r0, r2)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3b
            r4.disconnect()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3b
            r1.close()     // Catch: java.io.IOException -> L37
        L37:
            return r2
        L38:
            r4 = move-exception
            r0 = r1
            goto L42
        L3b:
            goto L48
        L3d:
            r4 = move-exception
            goto L42
        L3f:
            r1 = r0
            goto L48
        L42:
            if (r0 == 0) goto L47
            r0.close()     // Catch: java.io.IOException -> L47
        L47:
            throw r4
        L48:
            if (r1 == 0) goto L4d
            r1.close()     // Catch: java.io.IOException -> L4d
        L4d:
            return r0
    }

    public static android.graphics.Bitmap b(java.lang.String r4, android.widget.ImageView r5) {
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            java.net.URLConnection r4 = r1.openConnection()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            java.io.InputStream r2 = r4.getInputStream()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            int r2 = r1.available()     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49
            r1.mark(r2)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49
            r2.<init>()     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49
            r3 = 1
            r2.inJustDecodeBounds = r3     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49
            android.graphics.BitmapFactory.decodeStream(r1, r0, r2)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49
            cn.bluemobi.dylan.base.utils.i$a r5 = cn.bluemobi.dylan.base.utils.i.c(r5)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49
            int r3 = r5.a     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49
            int r5 = r5.f116b     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49
            int r5 = cn.bluemobi.dylan.base.utils.i.a(r2, r3, r5)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49
            r2.inSampleSize = r5     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49
            r5 = 0
            r2.inJustDecodeBounds = r5     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49
            r1.reset()     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r1, r0, r2)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49
            r4.disconnect()     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49
            r1.close()     // Catch: java.io.IOException -> L45
        L45:
            return r5
        L46:
            r4 = move-exception
            r0 = r1
            goto L50
        L49:
            goto L56
        L4b:
            r4 = move-exception
            goto L50
        L4d:
            r1 = r0
            goto L56
        L50:
            if (r0 == 0) goto L55
            r0.close()     // Catch: java.io.IOException -> L55
        L55:
            throw r4
        L56:
            if (r1 == 0) goto L5b
            r1.close()     // Catch: java.io.IOException -> L5b
        L5b:
            return r0
    }

    public static boolean c(java.lang.String r4, java.io.File r5) {
            r0 = 0
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            java.net.URLConnection r4 = r2.openConnection()     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            java.io.InputStream r4 = r4.getInputStream()     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            r5 = 512(0x200, float:7.17E-43)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L28
        L1a:
            int r1 = r4.read(r5)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L28
            r3 = -1
            if (r1 == r3) goto L2b
            r2.write(r5, r0, r1)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L28
            goto L1a
        L25:
            r5 = move-exception
        L26:
            r1 = r4
            goto L42
        L28:
        L29:
            r1 = r4
            goto L4f
        L2b:
            r2.flush()     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L28
            r4.close()     // Catch: java.io.IOException -> L31
        L31:
            r2.close()     // Catch: java.io.IOException -> L34
        L34:
            r4 = 1
            return r4
        L36:
            r5 = move-exception
            r2 = r1
            goto L26
        L39:
            r2 = r1
            goto L29
        L3c:
            r5 = move-exception
            r2 = r1
            goto L42
        L3f:
            r2 = r1
            goto L4f
        L42:
            if (r1 == 0) goto L49
            r1.close()     // Catch: java.io.IOException -> L48
            goto L49
        L48:
        L49:
            if (r2 == 0) goto L4e
            r2.close()     // Catch: java.io.IOException -> L4e
        L4e:
            throw r5
        L4f:
            if (r1 == 0) goto L56
            r1.close()     // Catch: java.io.IOException -> L55
            goto L56
        L55:
        L56:
            if (r2 == 0) goto L5b
            r2.close()     // Catch: java.io.IOException -> L5b
        L5b:
            return r0
    }
}
