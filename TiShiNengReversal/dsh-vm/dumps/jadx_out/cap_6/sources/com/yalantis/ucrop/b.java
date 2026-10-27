package com.yalantis.ucrop;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b {
    public static final int c = 69;
    public static final int d = 96;
    public static final int e = 10;
    private static final java.lang.String f = "com.yalantis.ucrop";
    public static final java.lang.String g = "com.yalantis.ucrop.InputUri";
    public static final java.lang.String h = "com.yalantis.ucrop.OutputUri";
    public static final java.lang.String i = "com.yalantis.ucrop.CropAspectRatio";
    public static final java.lang.String j = "com.yalantis.ucrop.ImageWidth";
    public static final java.lang.String k = "com.yalantis.ucrop.ImageHeight";
    public static final java.lang.String l = "com.yalantis.ucrop.OffsetX";
    public static final java.lang.String m = "com.yalantis.ucrop.OffsetY";
    public static final java.lang.String n = "com.yalantis.ucrop.Error";
    public static final java.lang.String o = "com.yalantis.ucrop.AspectRatioX";
    public static final java.lang.String p = "com.yalantis.ucrop.AspectRatioY";

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String f42q = "com.yalantis.ucrop.MaxSizeX";
    public static final java.lang.String r = "com.yalantis.ucrop.MaxSizeY";
    private android.content.Intent a;
    private android.os.Bundle b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a {
        public static final java.lang.String A = "com.yalantis.ucrop.HideBottomControls";
        public static final java.lang.String B = "com.yalantis.ucrop.FreeStyleCrop";
        public static final java.lang.String C = "com.yalantis.ucrop.AspectRatioSelectedByDefault";
        public static final java.lang.String D = "com.yalantis.ucrop.AspectRatioOptions";
        public static final java.lang.String E = "com.yalantis.ucrop.UcropRootViewBackgroundColor";
        public static final java.lang.String b = "com.yalantis.ucrop.CompressionFormatName";
        public static final java.lang.String c = "com.yalantis.ucrop.CompressionQuality";
        public static final java.lang.String d = "com.yalantis.ucrop.AllowedGestures";
        public static final java.lang.String e = "com.yalantis.ucrop.MaxBitmapSize";
        public static final java.lang.String f = "com.yalantis.ucrop.MaxScaleMultiplier";
        public static final java.lang.String g = "com.yalantis.ucrop.ImageToCropBoundsAnimDuration";
        public static final java.lang.String h = "com.yalantis.ucrop.DimmedLayerColor";
        public static final java.lang.String i = "com.yalantis.ucrop.CircleDimmedLayer";
        public static final java.lang.String j = "com.yalantis.ucrop.ShowCropFrame";
        public static final java.lang.String k = "com.yalantis.ucrop.CropFrameColor";
        public static final java.lang.String l = "com.yalantis.ucrop.CropFrameStrokeWidth";
        public static final java.lang.String m = "com.yalantis.ucrop.ShowCropGrid";
        public static final java.lang.String n = "com.yalantis.ucrop.CropGridRowCount";
        public static final java.lang.String o = "com.yalantis.ucrop.CropGridColumnCount";
        public static final java.lang.String p = "com.yalantis.ucrop.CropGridColor";

        /* renamed from: q, reason: collision with root package name */
        public static final java.lang.String f43q = "com.yalantis.ucrop.CropGridStrokeWidth";
        public static final java.lang.String r = "com.yalantis.ucrop.ToolbarColor";
        public static final java.lang.String s = "com.yalantis.ucrop.StatusBarColor";
        public static final java.lang.String t = "com.yalantis.ucrop.UcropColorWidgetActive";
        public static final java.lang.String u = "com.yalantis.ucrop.UcropColorControlsWidgetActive";
        public static final java.lang.String v = "com.yalantis.ucrop.UcropToolbarWidgetColor";
        public static final java.lang.String w = "com.yalantis.ucrop.UcropToolbarTitleText";
        public static final java.lang.String x = "com.yalantis.ucrop.UcropToolbarCancelDrawable";
        public static final java.lang.String y = "com.yalantis.ucrop.UcropToolbarCropDrawable";
        public static final java.lang.String z = "com.yalantis.ucrop.UcropLogoColor";
        private final android.os.Bundle a;

        public a() {
                r1 = this;
                r1.<init>()
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                r1.a = r0
                return
        }

        public void A(@androidx.annotation.ColorInt int r3) {
                r2 = this;
                android.os.Bundle r0 = r2.a
                java.lang.String r1 = "com.yalantis.ucrop.ToolbarColor"
                r0.putInt(r1, r3)
                return
        }

        public void B(@androidx.annotation.DrawableRes int r3) {
                r2 = this;
                android.os.Bundle r0 = r2.a
                java.lang.String r1 = "com.yalantis.ucrop.UcropToolbarCropDrawable"
                r0.putInt(r1, r3)
                return
        }

        public void C(@androidx.annotation.Nullable java.lang.String r3) {
                r2 = this;
                android.os.Bundle r0 = r2.a
                java.lang.String r1 = "com.yalantis.ucrop.UcropToolbarTitleText"
                r0.putString(r1, r3)
                return
        }

        public void D(@androidx.annotation.ColorInt int r3) {
                r2 = this;
                android.os.Bundle r0 = r2.a
                java.lang.String r1 = "com.yalantis.ucrop.UcropToolbarWidgetColor"
                r0.putInt(r1, r3)
                return
        }

        public void E() {
                r3 = this;
                android.os.Bundle r0 = r3.a
                java.lang.String r1 = "com.yalantis.ucrop.AspectRatioX"
                r2 = 0
                r0.putFloat(r1, r2)
                android.os.Bundle r0 = r3.a
                java.lang.String r1 = "com.yalantis.ucrop.AspectRatioY"
                r0.putFloat(r1, r2)
                return
        }

        public void F(float r3, float r4) {
                r2 = this;
                android.os.Bundle r0 = r2.a
                java.lang.String r1 = "com.yalantis.ucrop.AspectRatioX"
                r0.putFloat(r1, r3)
                android.os.Bundle r3 = r2.a
                java.lang.String r0 = "com.yalantis.ucrop.AspectRatioY"
                r3.putFloat(r0, r4)
                return
        }

        public void G(@androidx.annotation.IntRange(from = 10) int r3, @androidx.annotation.IntRange(from = 10) int r4) {
                r2 = this;
                android.os.Bundle r0 = r2.a
                java.lang.String r1 = "com.yalantis.ucrop.MaxSizeX"
                r0.putInt(r1, r3)
                android.os.Bundle r3 = r2.a
                java.lang.String r0 = "com.yalantis.ucrop.MaxSizeY"
                r3.putInt(r0, r4)
                return
        }

        @androidx.annotation.NonNull
        public android.os.Bundle a() {
                r1 = this;
                android.os.Bundle r0 = r1.a
                return r0
        }

        public void b(@androidx.annotation.ColorInt int r3) {
                r2 = this;
                android.os.Bundle r0 = r2.a
                java.lang.String r1 = "com.yalantis.ucrop.UcropColorControlsWidgetActive"
                r0.putInt(r1, r3)
                return
        }

        public void c(@androidx.annotation.ColorInt int r3) {
                r2 = this;
                android.os.Bundle r0 = r2.a
                java.lang.String r1 = "com.yalantis.ucrop.UcropColorWidgetActive"
                r0.putInt(r1, r3)
                return
        }

        public void d(int r3, int r4, int r5) {
                r2 = this;
                android.os.Bundle r0 = r2.a
                java.lang.String r1 = "com.yalantis.ucrop.AllowedGestures"
                int[] r3 = new int[]{r3, r4, r5}
                r0.putIntArray(r1, r3)
                return
        }

        public void e(int r5, com.yalantis.ucrop.model.AspectRatio... r6) {
                r4 = this;
                int r0 = r6.length
                if (r5 > r0) goto L1b
                android.os.Bundle r0 = r4.a
                java.lang.String r1 = "com.yalantis.ucrop.AspectRatioSelectedByDefault"
                r0.putInt(r1, r5)
                android.os.Bundle r5 = r4.a
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.List r6 = java.util.Arrays.asList(r6)
                r0.<init>(r6)
                java.lang.String r6 = "com.yalantis.ucrop.AspectRatioOptions"
                r5.putParcelableArrayList(r6, r0)
                return
            L1b:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.util.Locale r1 = java.util.Locale.US
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                int r6 = r6.length
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                r2[r3] = r5
                r5 = 1
                r2[r5] = r6
                java.lang.String r5 = "Index [selectedByDefault = %d] cannot be higher than aspect ratio options count [count = %d]."
                java.lang.String r5 = java.lang.String.format(r1, r5, r2)
                r0.<init>(r5)
                throw r0
        }

        public void f(boolean r3) {
                r2 = this;
                android.os.Bundle r0 = r2.a
                java.lang.String r1 = "com.yalantis.ucrop.CircleDimmedLayer"
                r0.putBoolean(r1, r3)
                return
        }

        public void g(@androidx.annotation.NonNull android.graphics.Bitmap.CompressFormat r3) {
                r2 = this;
                android.os.Bundle r0 = r2.a
                java.lang.String r1 = "com.yalantis.ucrop.CompressionFormatName"
                java.lang.String r3 = r3.name()
                r0.putString(r1, r3)
                return
        }

        public void h(@androidx.annotation.IntRange(from = 0) int r3) {
                r2 = this;
                android.os.Bundle r0 = r2.a
                java.lang.String r1 = "com.yalantis.ucrop.CompressionQuality"
                r0.putInt(r1, r3)
                return
        }

        public void i(@androidx.annotation.ColorInt int r3) {
                r2 = this;
                android.os.Bundle r0 = r2.a
                java.lang.String r1 = "com.yalantis.ucrop.CropFrameColor"
                r0.putInt(r1, r3)
                return
        }

        public void j(@androidx.annotation.IntRange(from = 0) int r3) {
                r2 = this;
                android.os.Bundle r0 = r2.a
                java.lang.String r1 = "com.yalantis.ucrop.CropFrameStrokeWidth"
                r0.putInt(r1, r3)
                return
        }

        public void k(@androidx.annotation.ColorInt int r3) {
                r2 = this;
                android.os.Bundle r0 = r2.a
                java.lang.String r1 = "com.yalantis.ucrop.CropGridColor"
                r0.putInt(r1, r3)
                return
        }

        public void l(@androidx.annotation.IntRange(from = 0) int r3) {
                r2 = this;
                android.os.Bundle r0 = r2.a
                java.lang.String r1 = "com.yalantis.ucrop.CropGridColumnCount"
                r0.putInt(r1, r3)
                return
        }

        public void m(@androidx.annotation.IntRange(from = 0) int r3) {
                r2 = this;
                android.os.Bundle r0 = r2.a
                java.lang.String r1 = "com.yalantis.ucrop.CropGridRowCount"
                r0.putInt(r1, r3)
                return
        }

        public void n(@androidx.annotation.IntRange(from = 0) int r3) {
                r2 = this;
                android.os.Bundle r0 = r2.a
                java.lang.String r1 = "com.yalantis.ucrop.CropGridStrokeWidth"
                r0.putInt(r1, r3)
                return
        }

        public void o(@androidx.annotation.ColorInt int r3) {
                r2 = this;
                android.os.Bundle r0 = r2.a
                java.lang.String r1 = "com.yalantis.ucrop.DimmedLayerColor"
                r0.putInt(r1, r3)
                return
        }

        public void p(boolean r3) {
                r2 = this;
                android.os.Bundle r0 = r2.a
                java.lang.String r1 = "com.yalantis.ucrop.FreeStyleCrop"
                r0.putBoolean(r1, r3)
                return
        }

        public void q(boolean r3) {
                r2 = this;
                android.os.Bundle r0 = r2.a
                java.lang.String r1 = "com.yalantis.ucrop.HideBottomControls"
                r0.putBoolean(r1, r3)
                return
        }

        public void r(@androidx.annotation.IntRange(from = 10) int r3) {
                r2 = this;
                android.os.Bundle r0 = r2.a
                java.lang.String r1 = "com.yalantis.ucrop.ImageToCropBoundsAnimDuration"
                r0.putInt(r1, r3)
                return
        }

        public void s(@androidx.annotation.ColorInt int r3) {
                r2 = this;
                android.os.Bundle r0 = r2.a
                java.lang.String r1 = "com.yalantis.ucrop.UcropLogoColor"
                r0.putInt(r1, r3)
                return
        }

        public void t(@androidx.annotation.IntRange(from = 10) int r3) {
                r2 = this;
                android.os.Bundle r0 = r2.a
                java.lang.String r1 = "com.yalantis.ucrop.MaxBitmapSize"
                r0.putInt(r1, r3)
                return
        }

        public void u(@androidx.annotation.FloatRange(from = 1.0d, fromInclusive = false) float r3) {
                r2 = this;
                android.os.Bundle r0 = r2.a
                java.lang.String r1 = "com.yalantis.ucrop.MaxScaleMultiplier"
                r0.putFloat(r1, r3)
                return
        }

        public void v(@androidx.annotation.ColorInt int r3) {
                r2 = this;
                android.os.Bundle r0 = r2.a
                java.lang.String r1 = "com.yalantis.ucrop.UcropRootViewBackgroundColor"
                r0.putInt(r1, r3)
                return
        }

        public void w(boolean r3) {
                r2 = this;
                android.os.Bundle r0 = r2.a
                java.lang.String r1 = "com.yalantis.ucrop.ShowCropFrame"
                r0.putBoolean(r1, r3)
                return
        }

        public void x(boolean r3) {
                r2 = this;
                android.os.Bundle r0 = r2.a
                java.lang.String r1 = "com.yalantis.ucrop.ShowCropGrid"
                r0.putBoolean(r1, r3)
                return
        }

        public void y(@androidx.annotation.ColorInt int r3) {
                r2 = this;
                android.os.Bundle r0 = r2.a
                java.lang.String r1 = "com.yalantis.ucrop.StatusBarColor"
                r0.putInt(r1, r3)
                return
        }

        public void z(@androidx.annotation.DrawableRes int r3) {
                r2 = this;
                android.os.Bundle r0 = r2.a
                java.lang.String r1 = "com.yalantis.ucrop.UcropToolbarCancelDrawable"
                r0.putInt(r1, r3)
                return
        }
    }

    private b(@androidx.annotation.NonNull android.net.Uri r3, @androidx.annotation.NonNull android.net.Uri r4) {
            r2 = this;
            r2.<init>()
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r2.a = r0
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r2.b = r0
            java.lang.String r1 = "com.yalantis.ucrop.InputUri"
            r0.putParcelable(r1, r3)
            android.os.Bundle r3 = r2.b
            java.lang.String r0 = "com.yalantis.ucrop.OutputUri"
            r3.putParcelable(r0, r4)
            return
    }

    @androidx.annotation.Nullable
    public static java.lang.Throwable a(@androidx.annotation.NonNull android.content.Intent r1) {
            java.lang.String r0 = "com.yalantis.ucrop.Error"
            java.io.Serializable r1 = r1.getSerializableExtra(r0)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            return r1
    }

    @androidx.annotation.Nullable
    public static android.net.Uri e(@androidx.annotation.NonNull android.content.Intent r1) {
            java.lang.String r0 = "com.yalantis.ucrop.OutputUri"
            android.os.Parcelable r1 = r1.getParcelableExtra(r0)
            android.net.Uri r1 = (android.net.Uri) r1
            return r1
    }

    public static float f(@androidx.annotation.NonNull android.content.Intent r2) {
            java.lang.String r0 = "com.yalantis.ucrop.CropAspectRatio"
            r1 = 0
            float r2 = r2.getFloatExtra(r0, r1)
            return r2
    }

    public static int g(@androidx.annotation.NonNull android.content.Intent r2) {
            java.lang.String r0 = "com.yalantis.ucrop.ImageHeight"
            r1 = -1
            int r2 = r2.getIntExtra(r0, r1)
            return r2
    }

    public static int h(@androidx.annotation.NonNull android.content.Intent r2) {
            java.lang.String r0 = "com.yalantis.ucrop.ImageWidth"
            r1 = -1
            int r2 = r2.getIntExtra(r0, r1)
            return r2
    }

    public static com.yalantis.ucrop.b i(@androidx.annotation.NonNull android.net.Uri r1, @androidx.annotation.NonNull android.net.Uri r2) {
            com.yalantis.ucrop.b r0 = new com.yalantis.ucrop.b
            r0.<init>(r1, r2)
            return r0
    }

    public com.yalantis.ucrop.UCropFragment b() {
            r1 = this;
            android.os.Bundle r0 = r1.b
            com.yalantis.ucrop.UCropFragment r0 = com.yalantis.ucrop.UCropFragment.P(r0)
            return r0
    }

    public com.yalantis.ucrop.UCropFragment c(android.os.Bundle r1) {
            r0 = this;
            r0.b = r1
            com.yalantis.ucrop.UCropFragment r1 = r0.b()
            return r1
    }

    public android.content.Intent d(@androidx.annotation.NonNull android.content.Context r3) {
            r2 = this;
            android.content.Intent r0 = r2.a
            java.lang.Class<com.yalantis.ucrop.UCropActivity> r1 = com.yalantis.ucrop.UCropActivity.class
            r0.setClass(r3, r1)
            android.content.Intent r3 = r2.a
            android.os.Bundle r0 = r2.b
            r3.putExtras(r0)
            android.content.Intent r3 = r2.a
            return r3
    }

    public void j(@androidx.annotation.NonNull android.app.Activity r2) {
            r1 = this;
            r0 = 69
            r1.k(r2, r0)
            return
    }

    public void k(@androidx.annotation.NonNull android.app.Activity r2, int r3) {
            r1 = this;
            android.content.Intent r0 = r1.d(r2)
            r2.startActivityForResult(r0, r3)
            return
    }

    public void l(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull android.app.Fragment r3) {
            r1 = this;
            r0 = 69
            r1.m(r2, r3, r0)
            return
    }

    @android.annotation.TargetApi(11)
    public void m(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull android.app.Fragment r2, int r3) {
            r0 = this;
            android.content.Intent r1 = r0.d(r1)
            r2.startActivityForResult(r1, r3)
            return
    }

    public void n(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull androidx.fragment.app.Fragment r3) {
            r1 = this;
            r0 = 69
            r1.o(r2, r3, r0)
            return
    }

    public void o(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull androidx.fragment.app.Fragment r2, int r3) {
            r0 = this;
            android.content.Intent r1 = r0.d(r1)
            r2.startActivityForResult(r1, r3)
            return
    }

    public com.yalantis.ucrop.b p() {
            r3 = this;
            android.os.Bundle r0 = r3.b
            java.lang.String r1 = "com.yalantis.ucrop.AspectRatioX"
            r2 = 0
            r0.putFloat(r1, r2)
            android.os.Bundle r0 = r3.b
            java.lang.String r1 = "com.yalantis.ucrop.AspectRatioY"
            r0.putFloat(r1, r2)
            return r3
    }

    public com.yalantis.ucrop.b q(float r3, float r4) {
            r2 = this;
            android.os.Bundle r0 = r2.b
            java.lang.String r1 = "com.yalantis.ucrop.AspectRatioX"
            r0.putFloat(r1, r3)
            android.os.Bundle r3 = r2.b
            java.lang.String r0 = "com.yalantis.ucrop.AspectRatioY"
            r3.putFloat(r0, r4)
            return r2
    }

    public com.yalantis.ucrop.b r(@androidx.annotation.IntRange(from = 10) int r3, @androidx.annotation.IntRange(from = 10) int r4) {
            r2 = this;
            r0 = 10
            if (r3 >= r0) goto L6
            r3 = 10
        L6:
            if (r4 >= r0) goto La
            r4 = 10
        La:
            android.os.Bundle r0 = r2.b
            java.lang.String r1 = "com.yalantis.ucrop.MaxSizeX"
            r0.putInt(r1, r3)
            android.os.Bundle r3 = r2.b
            java.lang.String r0 = "com.yalantis.ucrop.MaxSizeY"
            r3.putInt(r0, r4)
            return r2
    }

    public com.yalantis.ucrop.b s(@androidx.annotation.NonNull com.yalantis.ucrop.b.a r2) {
            r1 = this;
            android.os.Bundle r0 = r1.b
            android.os.Bundle r2 = r2.a()
            r0.putAll(r2)
            return r1
    }
}
