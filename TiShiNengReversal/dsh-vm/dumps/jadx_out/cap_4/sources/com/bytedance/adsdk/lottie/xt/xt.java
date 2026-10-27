package com.bytedance.adsdk.lottie.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class xt {
    private static final java.lang.Object j = null;
    private final java.lang.String cw;

    /* renamed from: r, reason: collision with root package name */
    private com.bytedance.adsdk.lottie.r f1907r;
    private final java.util.Map<java.lang.String, com.bytedance.adsdk.lottie.g> up;
    private final android.content.Context xt;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.bytedance.adsdk.lottie.xt.xt.j = r0
            return
    }

    public xt(android.graphics.drawable.Drawable.Callback r3, java.lang.String r4, com.bytedance.adsdk.lottie.r r5, java.util.Map<java.lang.String, com.bytedance.adsdk.lottie.g> r6) {
            r2 = this;
            r2.<init>()
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L29
            int r0 = r4.length()
            int r0 = r0 + (-1)
            char r0 = r4.charAt(r0)
            r1 = 47
            if (r0 == r1) goto L29
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r1)
            java.lang.String r4 = r0.toString()
            r2.cw = r4
            goto L2b
        L29:
            r2.cw = r4
        L2b:
            r2.up = r6
            r2.j(r5)
            boolean r4 = r3 instanceof android.view.View
            if (r4 != 0) goto L38
            r3 = 0
            r2.xt = r3
            return
        L38:
            android.view.View r3 = (android.view.View) r3
            android.content.Context r3 = r3.getContext()
            android.content.Context r3 = r3.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            r2.xt = r3
            return
    }

    private android.graphics.Bitmap xt(java.lang.String r1, android.graphics.Bitmap r2) {
            r0 = this;
            java.lang.Object r1 = com.bytedance.adsdk.lottie.xt.xt.j
            monitor-enter(r1)
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            return r2
        L5:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r2
    }

    public android.graphics.Bitmap j(java.lang.String r8) {
            r7 = this;
            java.util.Map<java.lang.String, com.bytedance.adsdk.lottie.g> r0 = r7.up
            java.lang.Object r0 = r0.get(r8)
            com.bytedance.adsdk.lottie.g r0 = (com.bytedance.adsdk.lottie.g) r0
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            android.graphics.Bitmap r2 = r0.ws()
            if (r2 == 0) goto L13
            return r2
        L13:
            com.bytedance.adsdk.lottie.r r2 = r7.f1907r
            if (r2 == 0) goto L1c
            android.graphics.Bitmap r8 = r2.j(r0)
            return r8
        L1c:
            android.content.Context r2 = r7.xt
            if (r2 != 0) goto L21
            return r1
        L21:
            java.lang.String r3 = r0.vl()
            android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options
            r4.<init>()
            r5 = 1
            r4.inScaled = r5
            r6 = 160(0xa0, float:2.24E-43)
            r4.inDensity = r6
            java.lang.String r6 = "data:"
            boolean r6 = r3.startsWith(r6)
            if (r6 == 0) goto L62
            java.lang.String r6 = "base64,"
            int r6 = r3.indexOf(r6)
            if (r6 <= 0) goto L62
            r0 = 44
            int r0 = r3.indexOf(r0)     // Catch: java.lang.IllegalArgumentException -> L5b
            int r0 = r0 + r5
            java.lang.String r0 = r3.substring(r0)     // Catch: java.lang.IllegalArgumentException -> L5b
            r2 = 0
            byte[] r0 = android.util.Base64.decode(r0, r2)     // Catch: java.lang.IllegalArgumentException -> L5b
            int r1 = r0.length
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r0, r2, r1, r4)
            android.graphics.Bitmap r8 = r7.xt(r8, r0)
            return r8
        L5b:
            r8 = move-exception
            java.lang.String r0 = "data URL did not have correct base64 format."
            com.bytedance.adsdk.lottie.up.up.j(r0, r8)
            return r1
        L62:
            java.lang.String r5 = r7.cw     // Catch: java.io.IOException -> Lc9
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.io.IOException -> Lc9
            if (r5 != 0) goto Lcb
            android.content.res.AssetManager r2 = r2.getAssets()     // Catch: java.io.IOException -> Lc9
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lc9
            r5.<init>()     // Catch: java.io.IOException -> Lc9
            java.lang.String r6 = r7.cw     // Catch: java.io.IOException -> Lc9
            r5.append(r6)     // Catch: java.io.IOException -> Lc9
            r5.append(r3)     // Catch: java.io.IOException -> Lc9
            java.lang.String r3 = r5.toString()     // Catch: java.io.IOException -> Lc9
            java.io.InputStream r2 = r2.open(r3)     // Catch: java.io.IOException -> Lc9
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r2, r1, r4)     // Catch: java.lang.IllegalArgumentException -> Lb1
            if (r2 != 0) goto La0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Decoded image `"
            r0.<init>(r2)
            r0.append(r8)
            java.lang.String r8 = "` is null."
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            com.bytedance.adsdk.lottie.up.up.xt(r8)
            return r1
        La0:
            int r1 = r0.j()
            int r0 = r0.xt()
            android.graphics.Bitmap r0 = com.bytedance.adsdk.lottie.up.g.j(r2, r1, r0)
            android.graphics.Bitmap r8 = r7.xt(r8, r0)
            return r8
        Lb1:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unable to decode image `"
            r2.<init>(r3)
            r2.append(r8)
            java.lang.String r8 = "`."
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            com.bytedance.adsdk.lottie.up.up.j(r8, r0)
            return r1
        Lc9:
            r8 = move-exception
            goto Ld3
        Lcb:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.io.IOException -> Lc9
            java.lang.String r0 = "You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder"
            r8.<init>(r0)     // Catch: java.io.IOException -> Lc9
            throw r8     // Catch: java.io.IOException -> Lc9
        Ld3:
            java.lang.String r0 = "Unable to open asset."
            com.bytedance.adsdk.lottie.up.up.j(r0, r8)
            return r1
    }

    public android.graphics.Bitmap j(java.lang.String r2, android.graphics.Bitmap r3) {
            r1 = this;
            if (r3 != 0) goto L13
            java.util.Map<java.lang.String, com.bytedance.adsdk.lottie.g> r3 = r1.up
            java.lang.Object r2 = r3.get(r2)
            com.bytedance.adsdk.lottie.g r2 = (com.bytedance.adsdk.lottie.g) r2
            android.graphics.Bitmap r3 = r2.ws()
            r0 = 0
            r2.j(r0)
            return r3
        L13:
            java.util.Map<java.lang.String, com.bytedance.adsdk.lottie.g> r3 = r1.up
            java.lang.Object r2 = r3.get(r2)
            com.bytedance.adsdk.lottie.g r2 = (com.bytedance.adsdk.lottie.g) r2
            android.graphics.Bitmap r2 = r2.ws()
            return r2
    }

    public void j(com.bytedance.adsdk.lottie.r r1) {
            r0 = this;
            r0.f1907r = r1
            return
    }

    public boolean j(android.content.Context r2) {
            r1 = this;
            if (r2 != 0) goto L6
            android.content.Context r0 = r1.xt
            if (r0 == 0) goto Le
        L6:
            android.content.Context r0 = r1.xt
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L10
        Le:
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }
}
