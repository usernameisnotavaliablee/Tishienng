package com.bxkj.student.v2.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class c {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.student.v2.common.utils.c.a a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        private final android.graphics.Bitmap d(int r6, android.graphics.Bitmap r7, java.lang.String r8) {
                r5 = this;
                android.graphics.Canvas r0 = new android.graphics.Canvas
                r0.<init>(r7)
                android.graphics.Paint r1 = new android.graphics.Paint
                r1.<init>()
                r2 = 1
                r1.setAntiAlias(r2)
                r1.setDither(r2)
                com.bxkj.student.App$a r3 = com.bxkj.student.App.d
                com.bxkj.student.App r3 = r3.a()
                r4 = 1097859072(0x41700000, float:15.0)
                int r3 = cn.bluemobi.dylan.base.utils.u.a(r4, r3)
                float r3 = (float) r3
                r1.setTextSize(r3)
                r1.setColor(r6)
                android.graphics.Paint$Align r6 = android.graphics.Paint.Align.CENTER
                r1.setTextAlign(r6)
                android.graphics.Typeface r6 = android.graphics.Typeface.SANS_SERIF
                android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r2)
                r1.setTypeface(r6)
                android.graphics.Rect r6 = new android.graphics.Rect
                r6.<init>()
                r2 = 0
                int r3 = r8.length()
                r1.getTextBounds(r8, r2, r3, r6)
                int r6 = r7.getWidth()
                int r6 = r6 / 2
                float r6 = (float) r6
                int r2 = r7.getHeight()
                int r2 = r2 / 2
                float r2 = (float) r2
                r0.drawText(r8, r6, r2, r1)
                return r7
        }

        @org.jetbrains.annotations.Nullable
        public final java.io.File a(@org.jetbrains.annotations.NotNull android.content.Context r7, @org.jetbrains.annotations.Nullable android.graphics.Bitmap r8) {
                r6 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r7, r0)
                r0 = 0
                if (r8 == 0) goto Lac
                boolean r1 = r8.isRecycled()
                if (r1 == 0) goto L10
                goto Lac
            L10:
                int r1 = r8.getWidth()
                int r2 = r8.getHeight()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "bmp.getWidth()="
                r3.append(r4)
                r3.append(r1)
                java.lang.String r1 = "bmp.getHeight()"
                r3.append(r1)
                r3.append(r2)
                java.lang.String r1 = r3.toString()
                r2 = 0
                java.lang.Object[] r2 = new java.lang.Object[r2]
                com.orhanobut.logger.j.d(r1, r2)
                java.lang.String r1 = "mounted"
                java.lang.String r2 = android.os.Environment.getExternalStorageState()
                boolean r1 = kotlin.jvm.internal.g0.g(r1, r2)
                if (r1 == 0) goto L48
                java.io.File r1 = r7.getExternalCacheDir()
                goto L49
            L48:
                r1 = r0
            L49:
                if (r1 == 0) goto L51
                boolean r2 = r1.exists()
                if (r2 != 0) goto L55
            L51:
                java.io.File r1 = r7.getCacheDir()
            L55:
                java.io.File r7 = new java.io.File
                java.lang.String r2 = "face"
                r7.<init>(r1, r2)
                boolean r1 = r7.exists()
                if (r1 != 0) goto L66
                boolean r1 = r7.mkdirs()
            L66:
                if (r1 == 0) goto Lac
                java.io.File r1 = new java.io.File
                long r2 = java.lang.System.currentTimeMillis()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "sports"
                r4.append(r5)
                r4.append(r2)
                java.lang.String r2 = ".png"
                r4.append(r2)
                java.lang.String r2 = r4.toString()
                r1.<init>(r7, r2)
                java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L9c java.io.FileNotFoundException -> L9e
                r7.<init>(r1)     // Catch: java.lang.Throwable -> L9c java.io.FileNotFoundException -> L9e
                android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Throwable -> L97 java.io.FileNotFoundException -> L9a
                r3 = 100
                r8.compress(r2, r3, r7)     // Catch: java.lang.Throwable -> L97 java.io.FileNotFoundException -> L9a
                r7.close()     // Catch: java.io.IOException -> L96
            L96:
                return r1
            L97:
                r8 = move-exception
                r0 = r7
                goto La1
            L9a:
                goto La7
            L9c:
                r8 = move-exception
                goto La1
            L9e:
                r7 = r0
                goto La7
            La1:
                if (r0 == 0) goto La6
                r0.close()     // Catch: java.io.IOException -> La6
            La6:
                throw r8
            La7:
                if (r7 == 0) goto Lac
                r7.close()     // Catch: java.io.IOException -> Lac
            Lac:
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final android.graphics.Bitmap b(@org.jetbrains.annotations.NotNull java.lang.String r4) {
                r3 = this;
                java.lang.String r0 = "text"
                kotlin.jvm.internal.g0.p(r4, r0)
                com.bxkj.student.App$a r0 = com.bxkj.student.App.d
                com.bxkj.student.App r0 = r0.a()
                r1 = 2131689987(0x7f0f0203, float:1.9009005E38)
                android.graphics.drawable.Drawable r0 = androidx.core.content.ContextCompat.getDrawable(r0, r1)
                java.lang.String r1 = "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable"
                kotlin.jvm.internal.g0.n(r0, r1)
                android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
                android.graphics.Bitmap r0 = r0.getBitmap()
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
                r2 = 1
                android.graphics.Bitmap r0 = r0.copy(r1, r2)
                java.lang.String r1 = "#b2b2b2"
                int r1 = android.graphics.Color.parseColor(r1)
                kotlin.jvm.internal.g0.m(r0)
                android.graphics.Bitmap r4 = r3.d(r1, r0, r4)
                return r4
        }

        @org.jetbrains.annotations.NotNull
        public final android.graphics.Bitmap c(@org.jetbrains.annotations.NotNull java.lang.String r4) {
                r3 = this;
                java.lang.String r0 = "text"
                kotlin.jvm.internal.g0.p(r4, r0)
                com.bxkj.student.App$a r0 = com.bxkj.student.App.d
                com.bxkj.student.App r0 = r0.a()
                r1 = 2131689988(0x7f0f0204, float:1.9009007E38)
                android.graphics.drawable.Drawable r0 = androidx.core.content.ContextCompat.getDrawable(r0, r1)
                java.lang.String r1 = "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable"
                kotlin.jvm.internal.g0.n(r0, r1)
                android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
                android.graphics.Bitmap r0 = r0.getBitmap()
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
                r2 = 1
                android.graphics.Bitmap r0 = r0.copy(r1, r2)
                java.lang.String r1 = "#3ecda1"
                int r1 = android.graphics.Color.parseColor(r1)
                kotlin.jvm.internal.g0.m(r0)
                android.graphics.Bitmap r4 = r3.d(r1, r0, r4)
                return r4
        }
    }

    static {
            com.bxkj.student.v2.common.utils.c$a r0 = new com.bxkj.student.v2.common.utils.c$a
            r1 = 0
            r0.<init>(r1)
            com.bxkj.student.v2.common.utils.c.a = r0
            return
    }

    public c() {
            r0 = this;
            r0.<init>()
            return
    }
}
