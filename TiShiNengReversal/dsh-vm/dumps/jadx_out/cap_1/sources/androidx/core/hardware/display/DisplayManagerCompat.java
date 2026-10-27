package androidx.core.hardware.display;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class DisplayManagerCompat {
    public static final java.lang.String DISPLAY_CATEGORY_PRESENTATION = "android.hardware.display.category.PRESENTATION";
    private final android.content.Context mContext;

    private DisplayManagerCompat(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.mContext = r1
            return
    }

    @androidx.annotation.NonNull
    public static androidx.core.hardware.display.DisplayManagerCompat getInstance(@androidx.annotation.NonNull android.content.Context r1) {
            androidx.core.hardware.display.DisplayManagerCompat r0 = new androidx.core.hardware.display.DisplayManagerCompat
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.Nullable
    public android.view.Display getDisplay(int r3) {
            r2 = this;
            android.content.Context r0 = r2.mContext
            java.lang.String r1 = "display"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.hardware.display.DisplayManager r0 = (android.hardware.display.DisplayManager) r0
            android.view.Display r3 = r0.getDisplay(r3)
            return r3
    }

    @androidx.annotation.NonNull
    public android.view.Display[] getDisplays() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            java.lang.String r1 = "display"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.hardware.display.DisplayManager r0 = (android.hardware.display.DisplayManager) r0
            android.view.Display[] r0 = r0.getDisplays()
            return r0
    }

    @androidx.annotation.NonNull
    public android.view.Display[] getDisplays(@androidx.annotation.Nullable java.lang.String r2) {
            r1 = this;
            android.content.Context r2 = r1.mContext
            java.lang.String r0 = "display"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.hardware.display.DisplayManager r2 = (android.hardware.display.DisplayManager) r2
            android.view.Display[] r2 = r2.getDisplays()
            return r2
    }
}
