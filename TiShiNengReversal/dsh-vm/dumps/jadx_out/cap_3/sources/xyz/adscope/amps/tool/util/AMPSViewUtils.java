package xyz.adscope.amps.tool.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSViewUtils {
    public AMPSViewUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T extends android.view.View> T findViewByType(android.view.ViewGroup r3, java.lang.Class<T> r4) {
            r0 = 0
        L1:
            int r1 = r3.getChildCount()
            if (r0 >= r1) goto L2e
            android.view.View r1 = r3.getChildAt(r0)
            boolean r2 = r4.isInstance(r1)
            if (r2 == 0) goto L1e
            boolean r2 = isViewVisibleOnScreen(r1)
            if (r2 == 0) goto L1e
            java.lang.Object r3 = r4.cast(r1)
            android.view.View r3 = (android.view.View) r3
            return r3
        L1e:
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L2b
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            android.view.View r1 = findViewByType(r1, r4)
            if (r1 == 0) goto L2b
            return r1
        L2b:
            int r0 = r0 + 1
            goto L1
        L2e:
            r3 = 0
            return r3
    }

    public static boolean isViewVisibleOnScreen(android.view.View r3) {
            r0 = 0
            if (r3 == 0) goto L27
            boolean r1 = r3.isShown()
            if (r1 != 0) goto La
            goto L27
        La:
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            boolean r2 = r3.getGlobalVisibleRect(r1)
            if (r2 != 0) goto L16
            return r0
        L16:
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            int r2 = r3.widthPixels
            int r3 = r3.heightPixels
            boolean r3 = r1.intersects(r0, r0, r2, r3)
            return r3
        L27:
            return r0
    }
}
