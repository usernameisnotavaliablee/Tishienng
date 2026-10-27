package androidx.core.graphics;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ColorKt {
    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final float component1(long r0) {
            float r0 = androidx.core.graphics.h.a(r0)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final float component1(@org.jetbrains.annotations.NotNull android.graphics.Color r1) {
            r0 = 0
            float r1 = androidx.core.graphics.d.a(r1, r0)
            return r1
    }

    public static final int component1(@androidx.annotation.ColorInt int r0) {
            int r0 = r0 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final float component2(long r0) {
            float r0 = androidx.core.graphics.p.a(r0)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final float component2(@org.jetbrains.annotations.NotNull android.graphics.Color r1) {
            r0 = 1
            float r1 = androidx.core.graphics.d.a(r1, r0)
            return r1
    }

    public static final int component2(@androidx.annotation.ColorInt int r0) {
            int r0 = r0 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final float component3(long r0) {
            float r0 = androidx.core.graphics.l.a(r0)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final float component3(@org.jetbrains.annotations.NotNull android.graphics.Color r1) {
            r0 = 2
            float r1 = androidx.core.graphics.d.a(r1, r0)
            return r1
    }

    public static final int component3(@androidx.annotation.ColorInt int r0) {
            int r0 = r0 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final float component4(long r0) {
            float r0 = androidx.core.graphics.s.a(r0)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final float component4(@org.jetbrains.annotations.NotNull android.graphics.Color r1) {
            r0 = 3
            float r1 = androidx.core.graphics.d.a(r1, r0)
            return r1
    }

    public static final int component4(@androidx.annotation.ColorInt int r0) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final long convertTo(@androidx.annotation.ColorInt int r0, @org.jetbrains.annotations.NotNull android.graphics.ColorSpace.Named r1) {
            android.graphics.ColorSpace r1 = androidx.core.graphics.c.a(r1)
            long r0 = androidx.core.graphics.q.a(r0, r1)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final long convertTo(@androidx.annotation.ColorInt int r0, @org.jetbrains.annotations.NotNull android.graphics.ColorSpace r1) {
            long r0 = androidx.core.graphics.q.a(r0, r1)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final long convertTo(long r0, @org.jetbrains.annotations.NotNull android.graphics.ColorSpace.Named r2) {
            android.graphics.ColorSpace r2 = androidx.core.graphics.c.a(r2)
            long r0 = androidx.core.graphics.f.a(r0, r2)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final long convertTo(long r0, @org.jetbrains.annotations.NotNull android.graphics.ColorSpace r2) {
            long r0 = androidx.core.graphics.f.a(r0, r2)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Color convertTo(@org.jetbrains.annotations.NotNull android.graphics.Color r0, @org.jetbrains.annotations.NotNull android.graphics.ColorSpace.Named r1) {
            android.graphics.ColorSpace r1 = androidx.core.graphics.c.a(r1)
            android.graphics.Color r0 = androidx.core.graphics.t.a(r0, r1)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Color convertTo(@org.jetbrains.annotations.NotNull android.graphics.Color r0, @org.jetbrains.annotations.NotNull android.graphics.ColorSpace r1) {
            android.graphics.Color r0 = androidx.core.graphics.t.a(r0, r1)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final float getAlpha(long r0) {
            float r0 = androidx.core.graphics.s.a(r0)
            return r0
    }

    public static final int getAlpha(@androidx.annotation.ColorInt int r0) {
            int r0 = r0 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final float getBlue(long r0) {
            float r0 = androidx.core.graphics.l.a(r0)
            return r0
    }

    public static final int getBlue(@androidx.annotation.ColorInt int r0) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.ColorSpace getColorSpace(long r0) {
            android.graphics.ColorSpace r0 = androidx.core.graphics.o.a(r0)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final float getGreen(long r0) {
            float r0 = androidx.core.graphics.p.a(r0)
            return r0
    }

    public static final int getGreen(@androidx.annotation.ColorInt int r0) {
            int r0 = r0 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final float getLuminance(@androidx.annotation.ColorInt int r0) {
            float r0 = androidx.core.graphics.e.a(r0)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final float getLuminance(long r0) {
            float r0 = androidx.core.graphics.m.a(r0)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final float getRed(long r0) {
            float r0 = androidx.core.graphics.h.a(r0)
            return r0
    }

    public static final int getRed(@androidx.annotation.ColorInt int r0) {
            int r0 = r0 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final boolean isSrgb(long r0) {
            boolean r0 = androidx.core.graphics.j.a(r0)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final boolean isWideGamut(long r0) {
            boolean r0 = androidx.core.graphics.n.a(r0)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Color plus(@org.jetbrains.annotations.NotNull android.graphics.Color r0, @org.jetbrains.annotations.NotNull android.graphics.Color r1) {
            android.graphics.Color r0 = androidx.core.graphics.ColorUtils.compositeColors(r1, r0)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Color toColor(@androidx.annotation.ColorInt int r0) {
            android.graphics.Color r0 = androidx.core.graphics.r.a(r0)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Color toColor(long r0) {
            android.graphics.Color r0 = androidx.core.graphics.k.a(r0)
            return r0
    }

    @androidx.annotation.ColorInt
    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final int toColorInt(long r0) {
            int r0 = androidx.core.graphics.g.a(r0)
            return r0
    }

    @androidx.annotation.ColorInt
    public static final int toColorInt(@org.jetbrains.annotations.NotNull java.lang.String r0) {
            int r0 = android.graphics.Color.parseColor(r0)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final long toColorLong(@androidx.annotation.ColorInt int r2) {
            long r0 = androidx.core.graphics.i.a(r2)
            return r0
    }
}
