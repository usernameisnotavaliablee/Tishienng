package androidx.appcompat.app;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class ActionBarDrawerToggleHoneycomb {
    private static final java.lang.String TAG = "ActionBarDrawerToggleHC";
    private static final int[] THEME_ATTRS = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class SetIndicatorInfo {
        public java.lang.reflect.Method setHomeActionContentDescription;
        public java.lang.reflect.Method setHomeAsUpIndicator;
        public android.widget.ImageView upIndicatorView;

        SetIndicatorInfo(android.app.Activity r7) {
                r6 = this;
                java.lang.Class<android.app.ActionBar> r0 = android.app.ActionBar.class
                r6.<init>()
                r1 = 0
                r2 = 1
                java.lang.String r3 = "setHomeAsUpIndicator"
                java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L24
                java.lang.Class<android.graphics.drawable.Drawable> r5 = android.graphics.drawable.Drawable.class
                r4[r1] = r5     // Catch: java.lang.NoSuchMethodException -> L24
                java.lang.reflect.Method r3 = r0.getDeclaredMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L24
                r6.setHomeAsUpIndicator = r3     // Catch: java.lang.NoSuchMethodException -> L24
                java.lang.String r3 = "setHomeActionContentDescription"
                java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L24
                java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L24
                r4[r1] = r5     // Catch: java.lang.NoSuchMethodException -> L24
                java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L24
                r6.setHomeActionContentDescription = r0     // Catch: java.lang.NoSuchMethodException -> L24
                return
            L24:
                r0 = 16908332(0x102002c, float:2.3877352E-38)
                android.view.View r7 = r7.findViewById(r0)
                if (r7 != 0) goto L2f
                goto L55
            L2f:
                android.view.ViewParent r7 = r7.getParent()
                android.view.ViewGroup r7 = (android.view.ViewGroup) r7
                int r3 = r7.getChildCount()
                r4 = 2
                if (r3 == r4) goto L3d
                goto L55
            L3d:
                android.view.View r1 = r7.getChildAt(r1)
                android.view.View r7 = r7.getChildAt(r2)
                int r2 = r1.getId()
                if (r2 != r0) goto L4c
                r1 = r7
            L4c:
                boolean r7 = r1 instanceof android.widget.ImageView
                if (r7 == 0) goto L55
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                r6.upIndicatorView = r1
            L55:
                return
        }
    }

    static {
            r0 = 16843531(0x101030b, float:2.369574E-38)
            int[] r0 = new int[]{r0}
            androidx.appcompat.app.ActionBarDrawerToggleHoneycomb.THEME_ATTRS = r0
            return
    }

    private ActionBarDrawerToggleHoneycomb() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.graphics.drawable.Drawable getThemeUpIndicator(android.app.Activity r1) {
            int[] r0 = androidx.appcompat.app.ActionBarDrawerToggleHoneycomb.THEME_ATTRS
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r0)
            r0 = 0
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r1.recycle()
            return r0
    }

    public static androidx.appcompat.app.ActionBarDrawerToggleHoneycomb.SetIndicatorInfo setActionBarDescription(androidx.appcompat.app.ActionBarDrawerToggleHoneycomb.SetIndicatorInfo r3, android.app.Activity r4, int r5) {
            if (r3 != 0) goto L7
            androidx.appcompat.app.ActionBarDrawerToggleHoneycomb$SetIndicatorInfo r3 = new androidx.appcompat.app.ActionBarDrawerToggleHoneycomb$SetIndicatorInfo
            r3.<init>(r4)
        L7:
            java.lang.reflect.Method r0 = r3.setHomeAsUpIndicator
            if (r0 == 0) goto L1e
            android.app.ActionBar r4 = r4.getActionBar()     // Catch: java.lang.Exception -> L1e
            java.lang.reflect.Method r0 = r3.setHomeActionContentDescription     // Catch: java.lang.Exception -> L1e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> L1e
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L1e
            r2 = 0
            r1[r2] = r5     // Catch: java.lang.Exception -> L1e
            r0.invoke(r4, r1)     // Catch: java.lang.Exception -> L1e
        L1e:
            return r3
    }

    public static androidx.appcompat.app.ActionBarDrawerToggleHoneycomb.SetIndicatorInfo setActionBarUpIndicator(android.app.Activity r5, android.graphics.drawable.Drawable r6, int r7) {
            androidx.appcompat.app.ActionBarDrawerToggleHoneycomb$SetIndicatorInfo r0 = new androidx.appcompat.app.ActionBarDrawerToggleHoneycomb$SetIndicatorInfo
            r0.<init>(r5)
            java.lang.reflect.Method r1 = r0.setHomeAsUpIndicator
            if (r1 == 0) goto L26
            android.app.ActionBar r5 = r5.getActionBar()     // Catch: java.lang.Exception -> L25
            java.lang.reflect.Method r1 = r0.setHomeAsUpIndicator     // Catch: java.lang.Exception -> L25
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L25
            r4 = 0
            r3[r4] = r6     // Catch: java.lang.Exception -> L25
            r1.invoke(r5, r3)     // Catch: java.lang.Exception -> L25
            java.lang.reflect.Method r6 = r0.setHomeActionContentDescription     // Catch: java.lang.Exception -> L25
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L25
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L25
            r1[r4] = r7     // Catch: java.lang.Exception -> L25
            r6.invoke(r5, r1)     // Catch: java.lang.Exception -> L25
        L25:
            return r0
        L26:
            android.widget.ImageView r5 = r0.upIndicatorView
            if (r5 == 0) goto L2d
            r5.setImageDrawable(r6)
        L2d:
            return r0
    }
}
