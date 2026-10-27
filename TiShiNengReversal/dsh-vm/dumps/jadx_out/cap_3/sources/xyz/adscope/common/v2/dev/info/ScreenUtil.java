package xyz.adscope.common.v2.dev.info;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class ScreenUtil {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Calculate {
        public Calculate() {
                r0 = this;
                r0.<init>()
                return
        }

        public static boolean checkViewVisibilityCoverage(android.view.View r3, int r4) {
                r0 = 2
                int[] r0 = new int[r0]
                r3.getLocationOnScreen(r0)
                int r0 = r3.getVisibility()
                r1 = 0
                if (r0 != 0) goto L44
                android.view.ViewParent r0 = r3.getParent()
                if (r0 == 0) goto L44
                boolean r0 = r3.hasWindowFocus()
                if (r0 != 0) goto L1a
                goto L44
            L1a:
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                boolean r2 = r3.getGlobalVisibleRect(r0)
                if (r2 != 0) goto L26
                return r1
            L26:
                int r2 = r0.height()
                int r0 = r0.width()
                int r2 = r2 * r0
                int r0 = r3.getHeight()
                int r3 = r3.getWidth()
                int r0 = r0 * r3
                if (r0 <= 0) goto L44
                int r2 = r2 * 100
                int r4 = r4 * r0
                if (r2 < r4) goto L44
                r3 = 1
                return r3
            L44:
                return r1
        }

        public static boolean checkViewVisibilityCoverageStrict(android.view.View r3, double r4) {
                if (r3 == 0) goto L2b
                int r0 = r3.getVisibility()
                if (r0 != 0) goto L2b
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                boolean r1 = r3.getGlobalVisibleRect(r0)
                if (r1 == 0) goto L2b
                int r1 = r3.getMeasuredWidth()
                int r2 = r3.getMeasuredHeight()
                int r1 = r1 * r2
                boolean r0 = rectAreaOverPercent(r0, r1, r4)
                if (r0 == 0) goto L2b
                boolean r3 = coverOverPercent(r3, r4)
                if (r3 != 0) goto L2b
                r3 = 1
                return r3
            L2b:
                r3 = 0
                return r3
        }

        private static boolean coverOverPercent(android.view.View r9, double r10) {
                r0 = r9
            L1:
                android.view.ViewParent r1 = r0.getParent()
                if (r1 == 0) goto L89
                android.view.ViewParent r1 = r0.getParent()
                boolean r1 = r1 instanceof android.view.ViewGroup
                if (r1 == 0) goto L89
                android.view.ViewParent r1 = r0.getParent()
                android.view.ViewGroup r1 = (android.view.ViewGroup) r1
                int r2 = r1.getVisibility()
                if (r2 != 0) goto L1
                int r0 = r1.indexOfChild(r0)
                r2 = 1
                int r0 = r0 + r2
            L21:
                int r3 = r1.getChildCount()
                if (r0 >= r3) goto L86
                android.view.View r3 = r1.getChildAt(r0)
                int r4 = r3.getVisibility()
                if (r4 != 0) goto L83
                android.graphics.Rect r4 = new android.graphics.Rect
                r4.<init>()
                r9.getGlobalVisibleRect(r4)
                android.graphics.Rect r5 = new android.graphics.Rect
                r5.<init>()
                r3.getGlobalVisibleRect(r5)
                boolean r3 = android.graphics.Rect.intersects(r4, r5)
                if (r3 == 0) goto L83
                int r3 = r4.right
                int r6 = r5.right
                int r3 = java.lang.Math.min(r3, r6)
                int r6 = r4.left
                int r7 = r5.left
                int r6 = java.lang.Math.max(r6, r7)
                int r3 = r3 - r6
                int r6 = r4.bottom
                int r7 = r5.bottom
                int r6 = java.lang.Math.min(r6, r7)
                int r4 = r4.top
                int r5 = r5.top
                int r4 = java.lang.Math.max(r4, r5)
                int r6 = r6 - r4
                int r3 = r3 * r6
                double r3 = (double) r3
                r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r3 = r3 * r5
                int r7 = r9.getMeasuredWidth()
                int r8 = r9.getMeasuredHeight()
                int r7 = r7 * r8
                double r7 = (double) r7
                double r7 = r7 * r5
                double r3 = r3 / r7
                int r5 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
                if (r5 <= 0) goto L83
                return r2
            L83:
                int r0 = r0 + 1
                goto L21
            L86:
                r0 = r1
                goto L1
            L89:
                r9 = 0
                return r9
        }

        public static int dip2px(android.content.Context r1, float r2) {
                float r1 = xyz.adscope.common.v2.dev.info.ScreenUtil.getDensity(r1)
                r0 = 0
                int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                if (r0 <= 0) goto L10
                float r2 = r2 * r1
                r1 = 1056964608(0x3f000000, float:0.5)
                float r2 = r2 + r1
                int r1 = (int) r2
                return r1
            L10:
                r1 = 0
                return r1
        }

        public static int px2dip(android.content.Context r1, float r2) {
                float r1 = xyz.adscope.common.v2.dev.info.ScreenUtil.getDensity(r1)
                r0 = 0
                int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                if (r0 <= 0) goto Lf
                float r2 = r2 / r1
                r1 = 1056964608(0x3f000000, float:0.5)
                float r2 = r2 + r1
                int r1 = (int) r2
                return r1
            Lf:
                r1 = 0
                return r1
        }

        private static boolean rectAreaOverPercent(android.graphics.Rect r4, int r5, double r6) {
                int r0 = r4.width()
                int r4 = r4.height()
                int r0 = r0 * r4
                double r0 = (double) r0
                r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r0 = r0 * r2
                double r4 = (double) r5
                double r4 = r4 * r2
                double r0 = r0 / r4
                int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r4 <= 0) goto L19
                r4 = 1
                return r4
            L19:
                r4 = 0
                return r4
        }
    }

    private ScreenUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static float getDensity(android.content.Context r2) {
            if (r2 == 0) goto L21
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            java.lang.String r1 = "window"
            java.lang.Object r2 = r2.getSystemService(r1)
            android.view.WindowManager r2 = (android.view.WindowManager) r2
            if (r2 == 0) goto L21
            android.view.Display r1 = r2.getDefaultDisplay()
            if (r1 == 0) goto L21
            android.view.Display r2 = r2.getDefaultDisplay()
            r2.getMetrics(r0)
            float r2 = r0.density
            return r2
        L21:
            r2 = 0
            return r2
    }

    public static int getDensityDpi(android.content.Context r2) {
            if (r2 == 0) goto L21
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            java.lang.String r1 = "window"
            java.lang.Object r2 = r2.getSystemService(r1)
            android.view.WindowManager r2 = (android.view.WindowManager) r2
            if (r2 == 0) goto L21
            android.view.Display r1 = r2.getDefaultDisplay()
            if (r1 == 0) goto L21
            android.view.Display r2 = r2.getDefaultDisplay()
            r2.getMetrics(r0)
            int r2 = r0.densityDpi
            return r2
        L21:
            r2 = 0
            return r2
    }

    public static int getOrientation(android.content.Context r1) {
            if (r1 == 0) goto L15
            android.content.res.Resources r0 = r1.getResources()
            if (r0 == 0) goto L15
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            if (r1 == 0) goto L15
            int r1 = r1.orientation
            return r1
        L15:
            r1 = 0
            return r1
    }

    public static int getScreenHeight(android.content.Context r1) {
            if (r1 == 0) goto L15
            android.content.res.Resources r0 = r1.getResources()
            if (r0 == 0) goto L15
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            if (r1 == 0) goto L15
            int r1 = r1.heightPixels
            return r1
        L15:
            r1 = 0
            return r1
    }

    public static int getScreenHeightDp(android.content.Context r1) {
            if (r1 == 0) goto L1a
            android.content.res.Resources r0 = r1.getResources()
            if (r0 == 0) goto L1a
            android.content.res.Resources r0 = r1.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            if (r0 == 0) goto L1a
            int r0 = r0.heightPixels
            float r0 = (float) r0
            int r1 = xyz.adscope.common.v2.dev.info.ScreenUtil.Calculate.px2dip(r1, r0)
            return r1
        L1a:
            r1 = 0
            return r1
    }

    public static int getScreenWidth(android.content.Context r1) {
            if (r1 == 0) goto L15
            android.content.res.Resources r0 = r1.getResources()
            if (r0 == 0) goto L15
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            if (r1 == 0) goto L15
            int r1 = r1.widthPixels
            return r1
        L15:
            r1 = 0
            return r1
    }

    public static int getScreenWidthDp(android.content.Context r1) {
            if (r1 == 0) goto L1a
            android.content.res.Resources r0 = r1.getResources()
            if (r0 == 0) goto L1a
            android.content.res.Resources r0 = r1.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            if (r0 == 0) goto L1a
            int r0 = r0.widthPixels
            float r0 = (float) r0
            int r1 = xyz.adscope.common.v2.dev.info.ScreenUtil.Calculate.px2dip(r1, r0)
            return r1
        L1a:
            r1 = 0
            return r1
    }
}
