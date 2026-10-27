package androidx.core.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class MarginLayoutParamsCompat {
    private MarginLayoutParamsCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static int getLayoutDirection(@androidx.annotation.NonNull android.view.ViewGroup.MarginLayoutParams r1) {
            int r1 = r1.getLayoutDirection()
            if (r1 == 0) goto La
            r0 = 1
            if (r1 == r0) goto La
            r1 = 0
        La:
            return r1
    }

    @java.lang.Deprecated
    public static int getMarginEnd(@androidx.annotation.NonNull android.view.ViewGroup.MarginLayoutParams r0) {
            int r0 = r0.getMarginEnd()
            return r0
    }

    @java.lang.Deprecated
    public static int getMarginStart(@androidx.annotation.NonNull android.view.ViewGroup.MarginLayoutParams r0) {
            int r0 = r0.getMarginStart()
            return r0
    }

    @java.lang.Deprecated
    public static boolean isMarginRelative(@androidx.annotation.NonNull android.view.ViewGroup.MarginLayoutParams r0) {
            boolean r0 = r0.isMarginRelative()
            return r0
    }

    @java.lang.Deprecated
    public static void resolveLayoutDirection(@androidx.annotation.NonNull android.view.ViewGroup.MarginLayoutParams r0, int r1) {
            r0.resolveLayoutDirection(r1)
            return
    }

    @java.lang.Deprecated
    public static void setLayoutDirection(@androidx.annotation.NonNull android.view.ViewGroup.MarginLayoutParams r0, int r1) {
            r0.setLayoutDirection(r1)
            return
    }

    @java.lang.Deprecated
    public static void setMarginEnd(@androidx.annotation.NonNull android.view.ViewGroup.MarginLayoutParams r0, int r1) {
            r0.setMarginEnd(r1)
            return
    }

    @java.lang.Deprecated
    public static void setMarginStart(@androidx.annotation.NonNull android.view.ViewGroup.MarginLayoutParams r0, int r1) {
            r0.setMarginStart(r1)
            return
    }
}
