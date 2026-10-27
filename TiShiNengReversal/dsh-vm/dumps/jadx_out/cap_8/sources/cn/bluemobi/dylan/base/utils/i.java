package cn.bluemobi.dylan.base.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class i {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a {
        public int a;

        /* renamed from: b, reason: collision with root package name */
        public int f116b;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public i() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int a(android.graphics.BitmapFactory.Options r2, int r3, int r4) {
            int r0 = r2.outWidth
            int r2 = r2.outHeight
            if (r0 > r3) goto Lb
            if (r2 <= r4) goto L9
            goto Lb
        L9:
            r2 = 1
            return r2
        Lb:
            float r0 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 * r1
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = java.lang.Math.round(r0)
            float r2 = (float) r2
            float r2 = r2 * r1
            float r4 = (float) r4
            float r2 = r2 / r4
            int r2 = java.lang.Math.round(r2)
            int r2 = java.lang.Math.max(r3, r2)
            return r2
    }

    private static int b(java.lang.Object r1, java.lang.String r2) {
            java.lang.Class<android.widget.ImageView> r0 = android.widget.ImageView.class
            java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch: java.lang.Exception -> L16
            r0 = 1
            r2.setAccessible(r0)     // Catch: java.lang.Exception -> L16
            int r1 = r2.getInt(r1)     // Catch: java.lang.Exception -> L16
            if (r1 <= 0) goto L16
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 >= r2) goto L16
            return r1
        L16:
            r1 = 0
            return r1
    }

    public static cn.bluemobi.dylan.base.utils.i.a c(android.widget.ImageView r5) {
            cn.bluemobi.dylan.base.utils.i$a r0 = new cn.bluemobi.dylan.base.utils.i$a
            r0.<init>()
            android.content.Context r1 = r5.getContext()
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            int r3 = r5.getWidth()
            if (r3 > 0) goto L1f
            if (r2 == 0) goto L1f
            int r3 = r2.width
        L1f:
            if (r3 > 0) goto L27
            java.lang.String r3 = "mMaxWidth"
            int r3 = b(r5, r3)
        L27:
            if (r3 > 0) goto L2b
            int r3 = r1.widthPixels
        L2b:
            int r4 = r5.getHeight()
            if (r4 > 0) goto L35
            if (r2 == 0) goto L35
            int r4 = r2.height
        L35:
            if (r4 > 0) goto L3d
            java.lang.String r2 = "mMaxHeight"
            int r4 = b(r5, r2)
        L3d:
            if (r4 > 0) goto L41
            int r4 = r1.heightPixels
        L41:
            r0.a = r3
            r0.f116b = r4
            return r0
    }
}
