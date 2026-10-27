package com.bxkj.student.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class a {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.student.common.utils.a.C0069a a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.bxkj.student.common.utils.a$a, reason: collision with other inner class name */
    public static final class C0069a {
        private C0069a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C0069a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        private final android.graphics.Bitmap c(int r6, android.graphics.Bitmap r7, java.lang.String r8) {
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

        @org.jetbrains.annotations.NotNull
        public final android.graphics.Bitmap a(@org.jetbrains.annotations.NotNull java.lang.String r4) {
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
                android.graphics.Bitmap r4 = r3.c(r1, r0, r4)
                return r4
        }

        @org.jetbrains.annotations.NotNull
        public final android.graphics.Bitmap b(@org.jetbrains.annotations.NotNull java.lang.String r4) {
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
                android.graphics.Bitmap r4 = r3.c(r1, r0, r4)
                return r4
        }
    }

    static {
            com.bxkj.student.common.utils.a$a r0 = new com.bxkj.student.common.utils.a$a
            r1 = 0
            r0.<init>(r1)
            com.bxkj.student.common.utils.a.a = r0
            return
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }
}
