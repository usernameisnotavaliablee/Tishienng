package pl.droidsonroids.gif;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class k {
    static final java.lang.String a = "http://schemas.android.com/apk/res/android";
    static final java.util.List<java.lang.String> b = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a extends pl.droidsonroids.gif.k.b {
        final int c;
        final int d;

        a() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.c = r0
                r1.d = r0
                return
        }

        a(android.widget.ImageView r1, android.util.AttributeSet r2, int r3, int r4) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                r3 = 1
                int r3 = a(r1, r2, r3)
                r0.c = r3
                r3 = 0
                int r1 = a(r1, r2, r3)
                r0.d = r1
                return
        }

        private static int a(android.widget.ImageView r3, android.util.AttributeSet r4, boolean r5) {
                if (r5 == 0) goto L5
                java.lang.String r0 = "src"
                goto L7
            L5:
                java.lang.String r0 = "background"
            L7:
                java.lang.String r1 = "http://schemas.android.com/apk/res/android"
                r2 = 0
                int r4 = r4.getAttributeResourceValue(r1, r0, r2)
                if (r4 <= 0) goto L27
                android.content.res.Resources r0 = r3.getResources()
                java.lang.String r0 = r0.getResourceTypeName(r4)
                java.util.List<java.lang.String> r1 = pl.droidsonroids.gif.k.b
                boolean r0 = r1.contains(r0)
                if (r0 == 0) goto L27
                boolean r3 = pl.droidsonroids.gif.k.e(r3, r5, r4)
                if (r3 != 0) goto L27
                return r4
            L27:
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b {
        boolean a;
        final int b;

        b() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.a = r0
                r0 = -1
                r1.b = r0
                return
        }

        b(android.view.View r2, android.util.AttributeSet r3, int r4, int r5) {
                r1 = this;
                r1.<init>()
                android.content.Context r2 = r2.getContext()
                int[] r0 = pl.droidsonroids.gif.R.styleable.GifView
                android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0, r4, r5)
                int r3 = pl.droidsonroids.gif.R.styleable.GifView_freezesAnimation
                r4 = 0
                boolean r3 = r2.getBoolean(r3, r4)
                r1.a = r3
                int r3 = pl.droidsonroids.gif.R.styleable.GifView_loopCount
                r4 = -1
                int r3 = r2.getInt(r3, r4)
                r1.b = r3
                r2.recycle()
                return
        }
    }

    static {
            java.lang.String r0 = "drawable"
            java.lang.String r1 = "mipmap"
            java.lang.String r2 = "raw"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            java.util.List r0 = java.util.Arrays.asList(r0)
            pl.droidsonroids.gif.k.b = r0
            return
    }

    private k() {
            r0 = this;
            r0.<init>()
            return
    }

    static void a(int r1, android.graphics.drawable.Drawable r2) {
            boolean r0 = r2 instanceof pl.droidsonroids.gif.e
            if (r0 == 0) goto L9
            pl.droidsonroids.gif.e r2 = (pl.droidsonroids.gif.e) r2
            r2.F(r1)
        L9:
            return
    }

    static float b(@androidx.annotation.NonNull android.content.res.Resources r2, @androidx.annotation.DrawableRes @androidx.annotation.RawRes int r3) {
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r1 = 1
            r2.getValue(r3, r0, r1)
            int r3 = r0.density
            if (r3 != 0) goto L10
            r3 = 160(0xa0, float:2.24E-43)
            goto L17
        L10:
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r3 == r0) goto L16
            goto L17
        L16:
            r3 = 0
        L17:
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.densityDpi
            if (r3 <= 0) goto L25
            if (r2 <= 0) goto L25
            float r2 = (float) r2
            float r3 = (float) r3
            float r2 = r2 / r3
            return r2
        L25:
            r2 = 1065353216(0x3f800000, float:1.0)
            return r2
    }

    static pl.droidsonroids.gif.k.a c(android.widget.ImageView r1, android.util.AttributeSet r2, int r3, int r4) {
            if (r2 == 0) goto L20
            boolean r0 = r1.isInEditMode()
            if (r0 != 0) goto L20
            pl.droidsonroids.gif.k$a r0 = new pl.droidsonroids.gif.k$a
            r0.<init>(r1, r2, r3, r4)
            int r2 = r0.b
            if (r2 < 0) goto L1f
            android.graphics.drawable.Drawable r3 = r1.getDrawable()
            a(r2, r3)
            android.graphics.drawable.Drawable r1 = r1.getBackground()
            a(r2, r1)
        L1f:
            return r0
        L20:
            pl.droidsonroids.gif.k$a r1 = new pl.droidsonroids.gif.k$a
            r1.<init>()
            return r1
    }

    static boolean d(android.widget.ImageView r2, android.net.Uri r3) {
            if (r3 == 0) goto L14
            pl.droidsonroids.gif.e r0 = new pl.droidsonroids.gif.e     // Catch: java.io.IOException -> L14
            android.content.Context r1 = r2.getContext()     // Catch: java.io.IOException -> L14
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.io.IOException -> L14
            r0.<init>(r1, r3)     // Catch: java.io.IOException -> L14
            r2.setImageDrawable(r0)     // Catch: java.io.IOException -> L14
            r2 = 1
            return r2
        L14:
            r2 = 0
            return r2
    }

    static boolean e(android.widget.ImageView r4, boolean r5, int r6) {
            android.content.res.Resources r0 = r4.getResources()
            r1 = 0
            if (r0 == 0) goto L24
            java.lang.String r2 = r0.getResourceTypeName(r6)     // Catch: java.lang.Throwable -> L24
            java.util.List<java.lang.String> r3 = pl.droidsonroids.gif.k.b     // Catch: java.lang.Throwable -> L24
            boolean r2 = r3.contains(r2)     // Catch: java.lang.Throwable -> L24
            if (r2 != 0) goto L14
            return r1
        L14:
            pl.droidsonroids.gif.e r2 = new pl.droidsonroids.gif.e     // Catch: java.lang.Throwable -> L24
            r2.<init>(r0, r6)     // Catch: java.lang.Throwable -> L24
            if (r5 == 0) goto L1f
            r4.setImageDrawable(r2)     // Catch: java.lang.Throwable -> L24
            goto L22
        L1f:
            r4.setBackground(r2)     // Catch: java.lang.Throwable -> L24
        L22:
            r4 = 1
            return r4
        L24:
            return r1
    }
}
