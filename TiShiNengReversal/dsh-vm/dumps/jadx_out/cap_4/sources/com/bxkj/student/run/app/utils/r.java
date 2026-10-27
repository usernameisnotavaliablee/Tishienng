package com.bxkj.student.run.app.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class r {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a {
        public int a;
        public int b;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        public a(int r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }
    }

    public r() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int a(android.content.Context r0, float r1) {
            float r0 = b(r0)
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            return r0
    }

    public static float b(android.content.Context r1) {
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            return r1
    }

    public static int c(android.content.Context r2) {
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            java.lang.String r1 = "window"
            java.lang.Object r2 = r2.getSystemService(r1)
            android.view.WindowManager r2 = (android.view.WindowManager) r2
            android.view.Display r2 = r2.getDefaultDisplay()
            r2.getMetrics(r0)
            int r2 = r0.heightPixels
            return r2
    }

    public static com.bxkj.student.run.app.utils.r.a d(android.content.Context r2) {
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            java.lang.String r1 = "window"
            java.lang.Object r2 = r2.getSystemService(r1)
            android.view.WindowManager r2 = (android.view.WindowManager) r2
            android.view.Display r2 = r2.getDefaultDisplay()
            r2.getMetrics(r0)
            com.bxkj.student.run.app.utils.r$a r2 = new com.bxkj.student.run.app.utils.r$a
            int r1 = r0.widthPixels
            int r0 = r0.heightPixels
            r2.<init>(r1, r0)
            return r2
    }

    public static int e(android.content.Context r2) {
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            java.lang.String r1 = "window"
            java.lang.Object r2 = r2.getSystemService(r1)
            android.view.WindowManager r2 = (android.view.WindowManager) r2
            android.view.Display r2 = r2.getDefaultDisplay()
            r2.getMetrics(r0)
            int r2 = r0.widthPixels
            return r2
    }

    public static int f() {
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.content.res.Resources r1 = android.content.res.Resources.getSystem()
            java.lang.String r2 = "dimen"
            java.lang.String r3 = "android"
            java.lang.String r4 = "status_bar_height"
            int r1 = r1.getIdentifier(r4, r2, r3)
            int r0 = r0.getDimensionPixelSize(r1)
            return r0
    }

    public static int g(android.content.Context r0, float r1) {
            float r0 = b(r0)
            float r1 = r1 / r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            return r0
    }

    public static void h(android.widget.ListView r5) {
            if (r5 != 0) goto L3
            goto L9
        L3:
            android.widget.ListAdapter r0 = r5.getAdapter()
            if (r0 != 0) goto La
        L9:
            return
        La:
            r1 = 0
            r2 = 0
            r3 = 0
        Ld:
            int r4 = r0.getCount()
            if (r2 >= r4) goto L23
            r4 = 0
            android.view.View r4 = r0.getView(r2, r4, r5)
            r4.measure(r1, r1)
            int r4 = r4.getMeasuredHeight()
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto Ld
        L23:
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            int r2 = r5.getDividerHeight()
            int r0 = r0.getCount()
            int r0 = r0 + (-1)
            int r2 = r2 * r0
            int r3 = r3 + r2
            r1.height = r3
            r5.setLayoutParams(r1)
            return
    }
}
