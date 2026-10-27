package androidx.core.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class GravityCompat {
    public static final int END = 8388613;
    public static final int RELATIVE_HORIZONTAL_GRAVITY_MASK = 8388615;
    public static final int RELATIVE_LAYOUT_DIRECTION = 8388608;
    public static final int START = 8388611;

    private GravityCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void apply(int r0, int r1, int r2, @androidx.annotation.NonNull android.graphics.Rect r3, int r4, int r5, @androidx.annotation.NonNull android.graphics.Rect r6, int r7) {
            android.view.Gravity.apply(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void apply(int r0, int r1, int r2, @androidx.annotation.NonNull android.graphics.Rect r3, @androidx.annotation.NonNull android.graphics.Rect r4, int r5) {
            android.view.Gravity.apply(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void applyDisplay(int r0, @androidx.annotation.NonNull android.graphics.Rect r1, @androidx.annotation.NonNull android.graphics.Rect r2, int r3) {
            android.view.Gravity.applyDisplay(r0, r1, r2, r3)
            return
    }

    public static int getAbsoluteGravity(int r0, int r1) {
            int r0 = android.view.Gravity.getAbsoluteGravity(r0, r1)
            return r0
    }
}
