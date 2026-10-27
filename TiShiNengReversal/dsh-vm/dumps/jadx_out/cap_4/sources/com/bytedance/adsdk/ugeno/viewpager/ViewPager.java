package com.bytedance.adsdk.ugeno.viewpager;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ViewPager extends android.view.ViewGroup {
    private static final com.bytedance.adsdk.ugeno.viewpager.ViewPager.tl aq = null;

    /* renamed from: m, reason: collision with root package name */
    private static final android.view.animation.Interpolator f1993m = null;
    private static final java.util.Comparator<com.bytedance.adsdk.ugeno.viewpager.ViewPager.xt> up = null;
    static final int[] xt = null;
    private int a;
    private final java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager.xt> ae;
    private int av;
    private com.bytedance.adsdk.ugeno.viewpager.ViewPager.m az;
    private boolean b;
    private int c;
    private boolean ch;
    com.bytedance.adsdk.ugeno.viewpager.xt cw;
    private boolean e;
    private float ed;
    private int f;
    private com.bytedance.adsdk.ugeno.viewpager.ViewPager.up ff;
    private final android.graphics.Rect g;
    private int gq;
    private android.view.VelocityTracker gx;
    private int h;
    private boolean hh;
    private android.widget.EdgeEffect hl;
    private android.graphics.drawable.Drawable i;
    private int j;
    private android.widget.Scroller jy;
    private java.util.List<java.lang.Object> k;
    private java.util.ArrayList<android.view.View> kc;
    private float kt;

    /* renamed from: l, reason: collision with root package name */
    private boolean f1994l;
    private int la;
    private int mi;

    /* renamed from: n, reason: collision with root package name */
    private int f1995n;
    private int nd;
    private int ol;
    private int oq;

    /* renamed from: p, reason: collision with root package name */
    private boolean f1996p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f1997q;
    private int qb;
    private android.os.Parcelable qv;

    /* renamed from: r, reason: collision with root package name */
    int f1998r;
    private int rh;
    private float rn;
    private final java.lang.Runnable rr;
    private int ry;

    /* renamed from: s, reason: collision with root package name */
    private boolean f1999s;
    private com.bytedance.adsdk.ugeno.viewpager.ViewPager.r sm;
    private int st;
    private float tj;
    private final com.bytedance.adsdk.ugeno.viewpager.ViewPager.xt tl;
    private float uf;

    /* renamed from: v, reason: collision with root package name */
    private int f2000v;
    private java.lang.ClassLoader vl;

    /* renamed from: w, reason: collision with root package name */
    private int f2001w;
    private float wq;
    private boolean ws;

    /* renamed from: x, reason: collision with root package name */
    private boolean f2002x;
    private com.bytedance.adsdk.ugeno.viewpager.ViewPager.r xq;
    private java.util.List<com.bytedance.adsdk.ugeno.viewpager.ViewPager.r> ya;

    /* renamed from: z, reason: collision with root package name */
    private android.widget.EdgeEffect f2003z;
    private int zz;




    public static class ae extends com.bytedance.adsdk.ugeno.viewpager.j {
        public static final android.os.Parcelable.Creator<com.bytedance.adsdk.ugeno.viewpager.ViewPager.ae> CREATOR = null;
        android.os.Parcelable cw;

        /* renamed from: r, reason: collision with root package name */
        java.lang.ClassLoader f2004r;
        int xt;


        static {
                com.bytedance.adsdk.ugeno.viewpager.ViewPager$ae$1 r0 = new com.bytedance.adsdk.ugeno.viewpager.ViewPager$ae$1
                r0.<init>()
                com.bytedance.adsdk.ugeno.viewpager.ViewPager.ae.CREATOR = r0
                return
        }

        ae(android.os.Parcel r2, java.lang.ClassLoader r3) {
                r1 = this;
                r1.<init>(r2, r3)
                if (r3 != 0) goto Ld
                java.lang.Class r3 = r1.getClass()
                java.lang.ClassLoader r3 = r3.getClassLoader()
            Ld:
                int r0 = r2.readInt()
                r1.xt = r0
                android.os.Parcelable r2 = r2.readParcelable(r3)
                r1.cw = r2
                r1.f2004r = r3
                return
        }

        public ae(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "FragmentPager.SavedState{"
                r0.<init>(r1)
                int r1 = java.lang.System.identityHashCode(r2)
                java.lang.String r1 = java.lang.Integer.toHexString(r1)
                r0.append(r1)
                java.lang.String r1 = " position="
                r0.append(r1)
                int r1 = r2.xt
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // com.bytedance.adsdk.ugeno.viewpager.j, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                super.writeToParcel(r2, r3)
                int r0 = r1.xt
                r2.writeInt(r0)
                android.os.Parcelable r0 = r1.cw
                r2.writeParcelable(r0, r3)
                return
        }
    }

    public static class cw extends android.view.ViewGroup.LayoutParams {
        float cw;
        public boolean j;

        /* renamed from: m, reason: collision with root package name */
        int f2005m;

        /* renamed from: r, reason: collision with root package name */
        boolean f2006r;
        int up;
        public int xt;

        public cw() {
                r1 = this;
                r0 = -1
                r1.<init>(r0, r0)
                r0 = 0
                r1.cw = r0
                return
        }

        public cw(android.content.Context r2, android.util.AttributeSet r3) {
                r1 = this;
                r1.<init>(r2, r3)
                r0 = 0
                r1.cw = r0
                int[] r0 = com.bytedance.adsdk.ugeno.viewpager.ViewPager.xt
                android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
                r3 = 0
                r0 = 48
                int r3 = r2.getInteger(r3, r0)
                r1.xt = r3
                r2.recycle()
                return
        }
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
    @java.lang.annotation.Inherited
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface j {
    }

    private class m extends android.database.DataSetObserver {
        final /* synthetic */ com.bytedance.adsdk.ugeno.viewpager.ViewPager j;

        m(com.bytedance.adsdk.ugeno.viewpager.ViewPager r1) {
                r0 = this;
                r0.j = r1
                r0.<init>()
                return
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
                r1 = this;
                com.bytedance.adsdk.ugeno.viewpager.ViewPager r0 = r1.j
                r0.xt()
                return
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
                r1 = this;
                com.bytedance.adsdk.ugeno.viewpager.ViewPager r0 = r1.j
                r0.xt()
                return
        }
    }

    public interface r {
        void g(int r1);

        void j(int r1, float r2, int r3);

        void tl(int r1);
    }

    static class tl implements java.util.Comparator<android.view.View> {
        tl() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public /* synthetic */ int compare(android.view.View r1, android.view.View r2) {
                r0 = this;
                android.view.View r1 = (android.view.View) r1
                android.view.View r2 = (android.view.View) r2
                int r1 = r0.j(r1, r2)
                return r1
        }

        public int j(android.view.View r3, android.view.View r4) {
                r2 = this;
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                com.bytedance.adsdk.ugeno.viewpager.ViewPager$cw r3 = (com.bytedance.adsdk.ugeno.viewpager.ViewPager.cw) r3
                android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
                com.bytedance.adsdk.ugeno.viewpager.ViewPager$cw r4 = (com.bytedance.adsdk.ugeno.viewpager.ViewPager.cw) r4
                boolean r0 = r3.j
                boolean r1 = r4.j
                if (r0 == r1) goto L18
                if (r0 == 0) goto L16
                r3 = 1
                return r3
            L16:
                r3 = -1
                return r3
            L18:
                int r3 = r3.up
                int r4 = r4.up
                int r3 = r3 - r4
                return r3
        }
    }

    public interface up {
        void j(android.view.View r1, float r2);
    }

    static class xt {
        boolean cw;
        java.lang.Object j;

        /* renamed from: r, reason: collision with root package name */
        float f2007r;
        float up;
        int xt;

        xt() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            r0 = 16842931(0x10100b3, float:2.369406E-38)
            int[] r0 = new int[]{r0}
            com.bytedance.adsdk.ugeno.viewpager.ViewPager.xt = r0
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$1 r0 = new com.bytedance.adsdk.ugeno.viewpager.ViewPager$1
            r0.<init>()
            com.bytedance.adsdk.ugeno.viewpager.ViewPager.up = r0
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$2 r0 = new com.bytedance.adsdk.ugeno.viewpager.ViewPager$2
            r0.<init>()
            com.bytedance.adsdk.ugeno.viewpager.ViewPager.f1993m = r0
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$tl r0 = new com.bytedance.adsdk.ugeno.viewpager.ViewPager$tl
            r0.<init>()
            com.bytedance.adsdk.ugeno.viewpager.ViewPager.aq = r0
            return
    }

    public ViewPager(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.ae = r2
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt r2 = new com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt
            r2.<init>()
            r1.tl = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r1.g = r2
            r2 = -1
            r1.oq = r2
            r0 = 0
            r1.qv = r0
            r1.vl = r0
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r1.kt = r0
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r1.tj = r0
            r0 = 1
            r1.a = r0
            r1.c = r2
            r1.b = r0
            r2 = 0
            r1.e = r2
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$3 r0 = new com.bytedance.adsdk.ugeno.viewpager.ViewPager$3
            r0.<init>(r1)
            r1.rr = r0
            r1.st = r2
            r1.j()
            return
    }

    private void ae() {
            r4 = this;
            int r0 = r4.zz
            if (r0 == 0) goto L2d
            java.util.ArrayList<android.view.View> r0 = r4.kc
            if (r0 != 0) goto L10
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.kc = r0
            goto L13
        L10:
            r0.clear()
        L13:
            int r0 = r4.getChildCount()
            r1 = 0
        L18:
            if (r1 >= r0) goto L26
            android.view.View r2 = r4.getChildAt(r1)
            java.util.ArrayList<android.view.View> r3 = r4.kc
            r3.add(r2)
            int r1 = r1 + 1
            goto L18
        L26:
            java.util.ArrayList<android.view.View> r0 = r4.kc
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$tl r1 = com.bytedance.adsdk.ugeno.viewpager.ViewPager.aq
            java.util.Collections.sort(r0, r1)
        L2d:
            return
    }

    private void cw(boolean r2) {
            r1 = this;
            android.view.ViewParent r0 = r1.getParent()
            if (r0 == 0) goto L9
            r0.requestDisallowInterceptTouchEvent(r2)
        L9:
            return
    }

    private static boolean cw(android.view.View r1) {
            java.lang.Class r1 = r1.getClass()
            java.lang.Class<com.bytedance.adsdk.ugeno.viewpager.ViewPager$j> r0 = com.bytedance.adsdk.ugeno.viewpager.ViewPager.j.class
            java.lang.annotation.Annotation r1 = r1.getAnnotation(r0)
            if (r1 == 0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    private com.bytedance.adsdk.ugeno.viewpager.ViewPager.xt g() {
            r12 = this;
            int r0 = r12.getClientWidth()
            r1 = 0
            if (r0 <= 0) goto Lf
            int r2 = r12.getScrollX()
            float r2 = (float) r2
            float r3 = (float) r0
            float r2 = r2 / r3
            goto L10
        Lf:
            r2 = 0
        L10:
            if (r0 <= 0) goto L18
            int r3 = r12.av
            float r3 = (float) r3
            float r0 = (float) r0
            float r3 = r3 / r0
            goto L19
        L18:
            r3 = 0
        L19:
            r0 = 0
            r4 = -1
            r5 = 1
            r6 = 0
            r7 = r6
            r4 = 0
            r6 = -1
            r8 = 0
            r9 = 1
        L22:
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r10 = r12.ae
            int r10 = r10.size()
            if (r8 >= r10) goto L73
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r10 = r12.ae
            java.lang.Object r10 = r10.get(r8)
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt r10 = (com.bytedance.adsdk.ugeno.viewpager.ViewPager.xt) r10
            if (r9 != 0) goto L4b
            int r11 = r10.xt
            int r6 = r6 + r5
            if (r11 == r6) goto L4b
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt r10 = r12.tl
            float r1 = r1 + r4
            float r1 = r1 + r3
            r10.up = r1
            r10.xt = r6
            com.bytedance.adsdk.ugeno.viewpager.xt r1 = r12.cw
            float r1 = r1.j(r6)
            r10.f2007r = r1
            int r8 = r8 + (-1)
        L4b:
            r6 = r10
            float r1 = r6.up
            float r4 = r6.f2007r
            float r4 = r4 + r1
            float r4 = r4 + r3
            if (r9 != 0) goto L58
            int r9 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r9 < 0) goto L73
        L58:
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L72
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r4 = r12.ae
            int r4 = r4.size()
            int r4 = r4 - r5
            if (r8 != r4) goto L66
            goto L72
        L66:
            int r4 = r6.xt
            float r7 = r6.f2007r
            int r8 = r8 + 1
            r9 = r6
            r6 = r4
            r4 = r7
            r7 = r9
            r9 = 0
            goto L22
        L72:
            return r6
        L73:
            return r7
    }

    private int getClientWidth() {
            r2 = this;
            int r0 = r2.getMeasuredWidth()
            int r1 = r2.getPaddingLeft()
            int r0 = r0 - r1
            int r1 = r2.getPaddingRight()
            int r0 = r0 - r1
            return r0
    }

    private int j(int r2, float r3, int r4, int r5) {
            r1 = this;
            int r5 = java.lang.Math.abs(r5)
            int r0 = r1.rh
            if (r5 <= r0) goto L16
            int r5 = java.lang.Math.abs(r4)
            int r0 = r1.f1995n
            if (r5 <= r0) goto L16
            if (r4 <= 0) goto L13
            goto L24
        L13:
            int r2 = r2 + 1
            goto L24
        L16:
            int r4 = r1.f1998r
            if (r2 < r4) goto L1e
            r4 = 1053609165(0x3ecccccd, float:0.4)
            goto L21
        L1e:
            r4 = 1058642330(0x3f19999a, float:0.6)
        L21:
            float r3 = r3 + r4
            int r3 = (int) r3
            int r2 = r2 + r3
        L24:
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r3 = r1.ae
            int r3 = r3.size()
            if (r3 <= 0) goto L4f
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r3 = r1.ae
            r4 = 0
            java.lang.Object r3 = r3.get(r4)
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt r3 = (com.bytedance.adsdk.ugeno.viewpager.ViewPager.xt) r3
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r4 = r1.ae
            int r5 = r4.size()
            int r5 = r5 + (-1)
            java.lang.Object r4 = r4.get(r5)
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt r4 = (com.bytedance.adsdk.ugeno.viewpager.ViewPager.xt) r4
            int r3 = r3.xt
            int r4 = r4.xt
            int r2 = java.lang.Math.min(r2, r4)
            int r2 = java.lang.Math.max(r3, r2)
        L4f:
            return r2
    }

    private android.graphics.Rect j(android.graphics.Rect r3, android.view.View r4) {
            r2 = this;
            if (r3 != 0) goto L7
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
        L7:
            if (r4 != 0) goto Le
            r4 = 0
            r3.set(r4, r4, r4, r4)
            return r3
        Le:
            int r0 = r4.getLeft()
            r3.left = r0
            int r0 = r4.getRight()
            r3.right = r0
            int r0 = r4.getTop()
            r3.top = r0
            int r0 = r4.getBottom()
            r3.bottom = r0
            android.view.ViewParent r4 = r4.getParent()
        L2a:
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L5b
            if (r4 == r2) goto L5b
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r0 = r3.left
            int r1 = r4.getLeft()
            int r0 = r0 + r1
            r3.left = r0
            int r0 = r3.right
            int r1 = r4.getRight()
            int r0 = r0 + r1
            r3.right = r0
            int r0 = r3.top
            int r1 = r4.getTop()
            int r0 = r0 + r1
            r3.top = r0
            int r0 = r3.bottom
            int r1 = r4.getBottom()
            int r0 = r0 + r1
            r3.bottom = r0
            android.view.ViewParent r4 = r4.getParent()
            goto L2a
        L5b:
            return r3
    }

    private void j(int r2, int r3, int r4, int r5) {
            r1 = this;
            if (r3 <= 0) goto L4b
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r0 = r1.ae
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L4b
            android.widget.Scroller r0 = r1.jy
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L22
            android.widget.Scroller r2 = r1.jy
            int r3 = r1.getCurrentItem()
            int r4 = r1.getClientWidth()
            int r3 = r3 * r4
            r2.setFinalX(r3)
            return
        L22:
            int r0 = r1.getPaddingLeft()
            int r2 = r2 - r0
            int r0 = r1.getPaddingRight()
            int r2 = r2 - r0
            int r2 = r2 + r4
            int r4 = r1.getPaddingLeft()
            int r3 = r3 - r4
            int r4 = r1.getPaddingRight()
            int r3 = r3 - r4
            int r3 = r3 + r5
            int r4 = r1.getScrollX()
            float r4 = (float) r4
            float r3 = (float) r3
            float r4 = r4 / r3
            float r2 = (float) r2
            float r4 = r4 * r2
            int r2 = (int) r4
            int r3 = r1.getScrollY()
            r1.scrollTo(r2, r3)
            return
        L4b:
            int r3 = r1.f1998r
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt r3 = r1.xt(r3)
            if (r3 == 0) goto L5c
            float r3 = r3.up
            float r4 = r1.tj
            float r3 = java.lang.Math.min(r3, r4)
            goto L5d
        L5c:
            r3 = 0
        L5d:
            int r4 = r1.getPaddingLeft()
            int r2 = r2 - r4
            int r4 = r1.getPaddingRight()
            int r2 = r2 - r4
            float r2 = (float) r2
            float r3 = r3 * r2
            int r2 = (int) r3
            int r3 = r1.getScrollX()
            if (r2 == r3) goto L7c
            r3 = 0
            r1.j(r3)
            int r3 = r1.getScrollY()
            r1.scrollTo(r2, r3)
        L7c:
            return
    }

    private void j(int r6, boolean r7, int r8, boolean r9) {
            r5 = this;
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt r0 = r5.xt(r6)
            r1 = 0
            if (r0 == 0) goto L1e
            int r2 = r5.getClientWidth()
            float r2 = (float) r2
            float r3 = r5.kt
            float r0 = r0.up
            float r4 = r5.tj
            float r0 = java.lang.Math.min(r0, r4)
            float r0 = java.lang.Math.max(r3, r0)
            float r2 = r2 * r0
            int r0 = (int) r2
            goto L1f
        L1e:
            r0 = 0
        L1f:
            if (r7 == 0) goto L2a
            r5.j(r0, r1, r8)
            if (r9 == 0) goto L29
            r5.up(r6)
        L29:
            return
        L2a:
            if (r9 == 0) goto L2f
            r5.up(r6)
        L2f:
            r5.j(r1)
            r5.scrollTo(r0, r1)
            r5.r(r0)
            return
    }

    private void j(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getActionIndex()
            int r1 = r4.getPointerId(r0)
            int r2 = r3.c
            if (r1 != r2) goto L24
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            float r1 = r4.getX(r0)
            r3.rn = r1
            int r4 = r4.getPointerId(r0)
            r3.c = r4
            android.view.VelocityTracker r4 = r3.gx
            if (r4 == 0) goto L24
            r4.clear()
        L24:
            return
    }

    private void j(com.bytedance.adsdk.ugeno.viewpager.ViewPager.xt r11, int r12, com.bytedance.adsdk.ugeno.viewpager.ViewPager.xt r13) {
            r10 = this;
            com.bytedance.adsdk.ugeno.viewpager.xt r0 = r10.cw
            int r0 = r0.j()
            int r1 = r10.getClientWidth()
            if (r1 <= 0) goto L12
            int r2 = r10.av
            float r2 = (float) r2
            float r1 = (float) r1
            float r2 = r2 / r1
            goto L13
        L12:
            r2 = 0
        L13:
            r1 = 0
            if (r13 == 0) goto Laf
            int r3 = r13.xt
            int r4 = r11.xt
            if (r3 >= r4) goto L6a
            float r4 = r13.up
            float r13 = r13.f2007r
            float r4 = r4 + r13
            float r4 = r4 + r2
            int r3 = r3 + 1
            r13 = 0
        L25:
            int r5 = r11.xt
            if (r3 > r5) goto Laf
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r5 = r10.ae
            int r5 = r5.size()
            if (r13 >= r5) goto Laf
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r5 = r10.ae
            java.lang.Object r5 = r5.get(r13)
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt r5 = (com.bytedance.adsdk.ugeno.viewpager.ViewPager.xt) r5
        L39:
            int r6 = r5.xt
            if (r3 <= r6) goto L52
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r6 = r10.ae
            int r6 = r6.size()
            int r6 = r6 + (-1)
            if (r13 >= r6) goto L52
            int r13 = r13 + 1
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r5 = r10.ae
            java.lang.Object r5 = r5.get(r13)
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt r5 = (com.bytedance.adsdk.ugeno.viewpager.ViewPager.xt) r5
            goto L39
        L52:
            int r6 = r5.xt
            if (r3 >= r6) goto L61
            com.bytedance.adsdk.ugeno.viewpager.xt r6 = r10.cw
            float r6 = r6.j(r3)
            float r6 = r6 + r2
            float r4 = r4 + r6
            int r3 = r3 + 1
            goto L52
        L61:
            r5.up = r4
            float r5 = r5.f2007r
            float r5 = r5 + r2
            float r4 = r4 + r5
            int r3 = r3 + 1
            goto L25
        L6a:
            if (r3 <= r4) goto Laf
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r4 = r10.ae
            int r4 = r4.size()
            int r4 = r4 + (-1)
            float r13 = r13.up
            int r3 = r3 + (-1)
        L78:
            int r5 = r11.xt
            if (r3 < r5) goto Laf
            if (r4 < 0) goto Laf
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r5 = r10.ae
            java.lang.Object r5 = r5.get(r4)
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt r5 = (com.bytedance.adsdk.ugeno.viewpager.ViewPager.xt) r5
        L86:
            int r6 = r5.xt
            if (r3 >= r6) goto L97
            if (r4 <= 0) goto L97
            int r4 = r4 + (-1)
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r5 = r10.ae
            java.lang.Object r5 = r5.get(r4)
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt r5 = (com.bytedance.adsdk.ugeno.viewpager.ViewPager.xt) r5
            goto L86
        L97:
            int r6 = r5.xt
            if (r3 <= r6) goto La6
            com.bytedance.adsdk.ugeno.viewpager.xt r6 = r10.cw
            float r6 = r6.j(r3)
            float r6 = r6 + r2
            float r13 = r13 - r6
            int r3 = r3 + (-1)
            goto L97
        La6:
            float r6 = r5.f2007r
            float r6 = r6 + r2
            float r13 = r13 - r6
            r5.up = r13
            int r3 = r3 + (-1)
            goto L78
        Laf:
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r13 = r10.ae
            int r13 = r13.size()
            float r3 = r11.up
            int r4 = r11.xt
            int r5 = r4 + (-1)
            if (r4 != 0) goto Lbf
            r6 = r3
            goto Lc2
        Lbf:
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        Lc2:
            r10.kt = r6
            int r0 = r0 + (-1)
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r4 != r0) goto Lcf
            float r4 = r11.f2007r
            float r4 = r4 + r3
            float r4 = r4 - r6
            goto Ld2
        Lcf:
            r4 = 2139095039(0x7f7fffff, float:3.4028235E38)
        Ld2:
            r10.tj = r4
            int r4 = r12 + (-1)
        Ld6:
            if (r4 < 0) goto Lff
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r7 = r10.ae
            java.lang.Object r7 = r7.get(r4)
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt r7 = (com.bytedance.adsdk.ugeno.viewpager.ViewPager.xt) r7
        Le0:
            int r8 = r7.xt
            if (r5 <= r8) goto Lf0
            com.bytedance.adsdk.ugeno.viewpager.xt r8 = r10.cw
            int r9 = r5 + (-1)
            float r5 = r8.j(r5)
            float r5 = r5 + r2
            float r3 = r3 - r5
            r5 = r9
            goto Le0
        Lf0:
            float r9 = r7.f2007r
            float r9 = r9 + r2
            float r3 = r3 - r9
            r7.up = r3
            if (r8 != 0) goto Lfa
            r10.kt = r3
        Lfa:
            int r4 = r4 + (-1)
            int r5 = r5 + (-1)
            goto Ld6
        Lff:
            float r3 = r11.up
            float r4 = r11.f2007r
            float r3 = r3 + r4
            float r3 = r3 + r2
            int r11 = r11.xt
            int r11 = r11 + 1
            int r12 = r12 + 1
        L10b:
            if (r12 >= r13) goto L138
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r4 = r10.ae
            java.lang.Object r4 = r4.get(r12)
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt r4 = (com.bytedance.adsdk.ugeno.viewpager.ViewPager.xt) r4
        L115:
            int r5 = r4.xt
            if (r11 >= r5) goto L125
            com.bytedance.adsdk.ugeno.viewpager.xt r5 = r10.cw
            int r7 = r11 + 1
            float r11 = r5.j(r11)
            float r11 = r11 + r2
            float r3 = r3 + r11
            r11 = r7
            goto L115
        L125:
            if (r5 != r0) goto L12d
            float r5 = r4.f2007r
            float r5 = r5 + r3
            float r5 = r5 - r6
            r10.tj = r5
        L12d:
            r4.up = r3
            float r4 = r4.f2007r
            float r4 = r4 + r2
            float r3 = r3 + r4
            int r12 = r12 + 1
            int r11 = r11 + 1
            goto L10b
        L138:
            r10.e = r1
            return
    }

    private void j(boolean r8) {
            r7 = this;
            int r0 = r7.st
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            if (r0 == 0) goto L3c
            r7.setScrollingCacheEnabled(r3)
            android.widget.Scroller r1 = r7.jy
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L3c
            android.widget.Scroller r1 = r7.jy
            r1.abortAnimation()
            int r1 = r7.getScrollX()
            int r4 = r7.getScrollY()
            android.widget.Scroller r5 = r7.jy
            int r5 = r5.getCurrX()
            android.widget.Scroller r6 = r7.jy
            int r6 = r6.getCurrY()
            if (r1 != r5) goto L34
            if (r4 == r6) goto L3c
        L34:
            r7.scrollTo(r5, r6)
            if (r5 == r1) goto L3c
            r7.r(r5)
        L3c:
            r7.f1999s = r3
            r1 = 0
        L3f:
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r4 = r7.ae
            int r4 = r4.size()
            if (r1 >= r4) goto L59
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r4 = r7.ae
            java.lang.Object r4 = r4.get(r1)
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt r4 = (com.bytedance.adsdk.ugeno.viewpager.ViewPager.xt) r4
            boolean r5 = r4.cw
            if (r5 == 0) goto L56
            r4.cw = r3
            r0 = 1
        L56:
            int r1 = r1 + 1
            goto L3f
        L59:
            if (r0 == 0) goto L68
            if (r8 == 0) goto L63
            java.lang.Runnable r8 = r7.rr
            r7.postOnAnimation(r8)
            return
        L63:
            java.lang.Runnable r8 = r7.rr
            r8.run()
        L68:
            return
    }

    private boolean j(float r4, float r5) {
            r3 = this;
            int r0 = r3.la
            float r0 = (float) r0
            r1 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto Lc
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L1c
        Lc:
            int r0 = r3.getWidth()
            int r2 = r3.la
            int r0 = r0 - r2
            float r0 = (float) r0
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 <= 0) goto L1e
            int r4 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r4 >= 0) goto L1e
        L1c:
            r4 = 1
            return r4
        L1e:
            r4 = 0
            return r4
    }

    private void m() {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r2.getChildCount()
            if (r0 >= r1) goto L1d
            android.view.View r1 = r2.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$cw r1 = (com.bytedance.adsdk.ugeno.viewpager.ViewPager.cw) r1
            boolean r1 = r1.j
            if (r1 != 0) goto L1a
            r2.removeViewAt(r0)
            int r0 = r0 + (-1)
        L1a:
            int r0 = r0 + 1
            goto L1
        L1d:
            return
    }

    private void m(int r4) {
            r3 = this;
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$r r0 = r3.sm
            if (r0 == 0) goto L7
            r0.g(r4)
        L7:
            java.util.List<com.bytedance.adsdk.ugeno.viewpager.ViewPager$r> r0 = r3.ya
            if (r0 == 0) goto L22
            int r0 = r0.size()
            r1 = 0
        L10:
            if (r1 >= r0) goto L22
            java.util.List<com.bytedance.adsdk.ugeno.viewpager.ViewPager$r> r2 = r3.ya
            java.lang.Object r2 = r2.get(r1)
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$r r2 = (com.bytedance.adsdk.ugeno.viewpager.ViewPager.r) r2
            if (r2 == 0) goto L1f
            r2.g(r4)
        L1f:
            int r1 = r1 + 1
            goto L10
        L22:
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$r r0 = r3.xq
            if (r0 == 0) goto L29
            r0.g(r4)
        L29:
            return
    }

    private void oq() {
            r1 = this;
            r0 = 0
            r1.f1994l = r0
            r1.f1996p = r0
            android.view.VelocityTracker r0 = r1.gx
            if (r0 == 0) goto Lf
            r0.recycle()
            r0 = 0
            r1.gx = r0
        Lf:
            return
    }

    private boolean r(int r8) {
            r7 = this;
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r0 = r7.ae
            int r0 = r0.size()
            java.lang.String r1 = "onPageScrolled did not call superclass implementation"
            r2 = 0
            if (r0 != 0) goto L21
            boolean r8 = r7.b
            if (r8 == 0) goto L10
            return r2
        L10:
            r7.f1997q = r2
            r8 = 0
            r7.j(r2, r8, r2)
            boolean r8 = r7.f1997q
            if (r8 == 0) goto L1b
            return r2
        L1b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
            throw r8
        L21:
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt r0 = r7.g()
            int r3 = r7.getClientWidth()
            int r4 = r7.av
            int r5 = r3 + r4
            float r4 = (float) r4
            float r3 = (float) r3
            float r4 = r4 / r3
            int r6 = r0.xt
            float r8 = (float) r8
            float r8 = r8 / r3
            float r3 = r0.up
            float r8 = r8 - r3
            float r0 = r0.f2007r
            float r0 = r0 + r4
            float r8 = r8 / r0
            float r0 = (float) r5
            float r0 = r0 * r8
            int r0 = (int) r0
            r7.f1997q = r2
            r7.j(r6, r8, r0)
            boolean r8 = r7.f1997q
            if (r8 == 0) goto L4a
            r8 = 1
            return r8
        L4a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
            throw r8
    }

    private void setScrollingCacheEnabled(boolean r2) {
            r1 = this;
            boolean r0 = r1.ch
            if (r0 == r2) goto L6
            r1.ch = r2
        L6:
            return
    }

    private boolean tl() {
            r1 = this;
            r0 = -1
            r1.c = r0
            r1.oq()
            android.widget.EdgeEffect r0 = r1.f2003z
            r0.onRelease()
            android.widget.EdgeEffect r0 = r1.hl
            r0.onRelease()
            android.widget.EdgeEffect r0 = r1.f2003z
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L23
            android.widget.EdgeEffect r0 = r1.hl
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L21
            goto L23
        L21:
            r0 = 0
            return r0
        L23:
            r0 = 1
            return r0
    }

    private void up(int r4) {
            r3 = this;
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$r r0 = r3.sm
            if (r0 == 0) goto L7
            r0.tl(r4)
        L7:
            java.util.List<com.bytedance.adsdk.ugeno.viewpager.ViewPager$r> r0 = r3.ya
            if (r0 == 0) goto L22
            int r0 = r0.size()
            r1 = 0
        L10:
            if (r1 >= r0) goto L22
            java.util.List<com.bytedance.adsdk.ugeno.viewpager.ViewPager$r> r2 = r3.ya
            java.lang.Object r2 = r2.get(r1)
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$r r2 = (com.bytedance.adsdk.ugeno.viewpager.ViewPager.r) r2
            if (r2 == 0) goto L1f
            r2.tl(r4)
        L1f:
            int r1 = r1 + 1
            goto L10
        L22:
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$r r0 = r3.xq
            if (r0 == 0) goto L29
            r0.tl(r4)
        L29:
            return
    }

    private void xt(int r4, float r5, int r6) {
            r3 = this;
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$r r0 = r3.sm
            if (r0 == 0) goto L7
            r0.j(r4, r5, r6)
        L7:
            java.util.List<com.bytedance.adsdk.ugeno.viewpager.ViewPager$r> r0 = r3.ya
            if (r0 == 0) goto L22
            int r0 = r0.size()
            r1 = 0
        L10:
            if (r1 >= r0) goto L22
            java.util.List<com.bytedance.adsdk.ugeno.viewpager.ViewPager$r> r2 = r3.ya
            java.lang.Object r2 = r2.get(r1)
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$r r2 = (com.bytedance.adsdk.ugeno.viewpager.ViewPager.r) r2
            if (r2 == 0) goto L1f
            r2.j(r4, r5, r6)
        L1f:
            int r1 = r1 + 1
            goto L10
        L22:
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$r r0 = r3.xq
            if (r0 == 0) goto L29
            r0.j(r4, r5, r6)
        L29:
            return
    }

    private void xt(boolean r7) {
            r6 = this;
            int r0 = r6.getChildCount()
            r1 = 0
            r2 = 0
        L6:
            if (r2 >= r0) goto L19
            if (r7 == 0) goto Ld
            int r3 = r6.ry
            goto Le
        Ld:
            r3 = 0
        Le:
            android.view.View r4 = r6.getChildAt(r2)
            r5 = 0
            r4.setLayerType(r3, r5)
            int r2 = r2 + 1
            goto L6
        L19:
            return
    }

    private boolean xt(float r10) {
            r9 = this;
            float r0 = r9.rn
            float r0 = r0 - r10
            r9.rn = r10
            int r10 = r9.getScrollX()
            float r10 = (float) r10
            float r10 = r10 + r0
            int r0 = r9.getClientWidth()
            float r0 = (float) r0
            float r1 = r9.kt
            float r1 = r1 * r0
            float r2 = r9.tj
            float r2 = r2 * r0
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r3 = r9.ae
            r4 = 0
            java.lang.Object r3 = r3.get(r4)
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt r3 = (com.bytedance.adsdk.ugeno.viewpager.ViewPager.xt) r3
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r5 = r9.ae
            int r6 = r5.size()
            r7 = 1
            int r6 = r6 - r7
            java.lang.Object r5 = r5.get(r6)
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt r5 = (com.bytedance.adsdk.ugeno.viewpager.ViewPager.xt) r5
            int r6 = r3.xt
            if (r6 == 0) goto L39
            float r1 = r3.up
            float r1 = r1 * r0
            r3 = 0
            goto L3a
        L39:
            r3 = 1
        L3a:
            int r6 = r5.xt
            com.bytedance.adsdk.ugeno.viewpager.xt r8 = r9.cw
            int r8 = r8.j()
            int r8 = r8 - r7
            if (r6 == r8) goto L4b
            float r2 = r5.up
            float r2 = r2 * r0
            r5 = 0
            goto L4c
        L4b:
            r5 = 1
        L4c:
            int r6 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r6 >= 0) goto L61
            if (r3 == 0) goto L5f
            float r10 = r1 - r10
            android.widget.EdgeEffect r2 = r9.f2003z
            float r10 = java.lang.Math.abs(r10)
            float r10 = r10 / r0
            r2.onPull(r10)
            r4 = 1
        L5f:
            r10 = r1
            goto L74
        L61:
            int r1 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r1 <= 0) goto L74
            if (r5 == 0) goto L73
            float r10 = r10 - r2
            android.widget.EdgeEffect r1 = r9.hl
            float r10 = java.lang.Math.abs(r10)
            float r10 = r10 / r0
            r1.onPull(r10)
            r4 = 1
        L73:
            r10 = r2
        L74:
            float r0 = r9.rn
            int r1 = (int) r10
            float r2 = (float) r1
            float r10 = r10 - r2
            float r0 = r0 + r10
            r9.rn = r0
            int r10 = r9.getScrollY()
            r9.scrollTo(r1, r10)
            r9.r(r1)
            return r4
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(java.util.ArrayList<android.view.View> r7, int r8, int r9) {
            r6 = this;
            int r0 = r7.size()
            int r1 = r6.getDescendantFocusability()
            r2 = 393216(0x60000, float:5.51013E-40)
            if (r1 == r2) goto L2f
            r2 = 0
        Ld:
            int r3 = r6.getChildCount()
            if (r2 >= r3) goto L2f
            android.view.View r3 = r6.getChildAt(r2)
            int r4 = r3.getVisibility()
            if (r4 != 0) goto L2c
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt r4 = r6.j(r3)
            if (r4 == 0) goto L2c
            int r4 = r4.xt
            int r5 = r6.f1998r
            if (r4 != r5) goto L2c
            r3.addFocusables(r7, r8, r9)
        L2c:
            int r2 = r2 + 1
            goto Ld
        L2f:
            r8 = 262144(0x40000, float:3.67342E-40)
            if (r1 != r8) goto L39
            int r8 = r7.size()
            if (r0 != r8) goto L50
        L39:
            boolean r8 = r6.isFocusable()
            if (r8 != 0) goto L40
            goto L50
        L40:
            r8 = 1
            r9 = r9 & r8
            if (r9 != r8) goto L51
            boolean r8 = r6.isInTouchMode()
            if (r8 == 0) goto L51
            boolean r8 = r6.isFocusableInTouchMode()
            if (r8 != 0) goto L51
        L50:
            return
        L51:
            r7.add(r6)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(java.util.ArrayList<android.view.View> r5) {
            r4 = this;
            r0 = 0
        L1:
            int r1 = r4.getChildCount()
            if (r0 >= r1) goto L23
            android.view.View r1 = r4.getChildAt(r0)
            int r2 = r1.getVisibility()
            if (r2 != 0) goto L20
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt r2 = r4.j(r1)
            if (r2 == 0) goto L20
            int r2 = r2.xt
            int r3 = r4.f1998r
            if (r2 != r3) goto L20
            r1.addTouchables(r5)
        L20:
            int r0 = r0 + 1
            goto L1
        L23:
            return
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View r4, int r5, android.view.ViewGroup.LayoutParams r6) {
            r3 = this;
            boolean r0 = r3.checkLayoutParams(r6)
            if (r0 != 0) goto La
            android.view.ViewGroup$LayoutParams r6 = r3.generateLayoutParams(r6)
        La:
            r0 = r6
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$cw r0 = (com.bytedance.adsdk.ugeno.viewpager.ViewPager.cw) r0
            boolean r1 = r0.j
            boolean r2 = cw(r4)
            r1 = r1 | r2
            r0.j = r1
            boolean r2 = r3.f2002x
            if (r2 == 0) goto L2b
            if (r1 != 0) goto L23
            r1 = 1
            r0.f2006r = r1
            r3.addViewInLayout(r4, r5, r6)
            return
        L23:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Cannot add pager decor view during layout"
            r4.<init>(r5)
            throw r4
        L2b:
            super.addView(r4, r5, r6)
            return
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int r5) {
            r4 = this;
            com.bytedance.adsdk.ugeno.viewpager.xt r0 = r4.cw
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r4.getClientWidth()
            int r2 = r4.getScrollX()
            r3 = 1
            if (r5 >= 0) goto L1b
            float r5 = (float) r0
            float r0 = r4.kt
            float r5 = r5 * r0
            int r5 = (int) r5
            if (r2 <= r5) goto L1a
            return r3
        L1a:
            return r1
        L1b:
            if (r5 <= 0) goto L26
            float r5 = (float) r0
            float r0 = r4.tj
            float r5 = r5 * r0
            int r5 = (int) r5
            if (r2 >= r5) goto L26
            return r3
        L26:
            return r1
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.bytedance.adsdk.ugeno.viewpager.ViewPager.cw
            if (r0 == 0) goto Lc
            boolean r2 = super.checkLayoutParams(r2)
            if (r2 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
    }

    @Override // android.view.View
    public void computeScroll() {
            r4 = this;
            r0 = 1
            r4.ws = r0
            android.widget.Scroller r1 = r4.jy
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L41
            android.widget.Scroller r1 = r4.jy
            boolean r1 = r1.computeScrollOffset()
            if (r1 == 0) goto L41
            int r0 = r4.getScrollX()
            int r1 = r4.getScrollY()
            android.widget.Scroller r2 = r4.jy
            int r2 = r2.getCurrX()
            android.widget.Scroller r3 = r4.jy
            int r3 = r3.getCurrY()
            if (r0 != r2) goto L2b
            if (r1 == r3) goto L3d
        L2b:
            r4.scrollTo(r2, r3)
            boolean r0 = r4.r(r2)
            if (r0 != 0) goto L3d
            android.widget.Scroller r0 = r4.jy
            r0.abortAnimation()
            r0 = 0
            r4.scrollTo(r0, r3)
        L3d:
            r4.postInvalidateOnAnimation()
            return
        L41:
            r4.j(r0)
            return
    }

    void cw() {
            r1 = this;
            int r0 = r1.f1998r
            r1.j(r0)
            return
    }

    public boolean cw(int r5) {
            r4 = this;
            android.view.View r0 = r4.findFocus()
            r1 = 0
            if (r0 != r4) goto L9
        L7:
            r0 = r1
            goto L60
        L9:
            if (r0 == 0) goto L60
            android.view.ViewParent r2 = r0.getParent()
        Lf:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1b
            if (r2 != r4) goto L16
            goto L60
        L16:
            android.view.ViewParent r2 = r2.getParent()
            goto Lf
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
        L2f:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L48
            java.lang.String r3 = " => "
            r2.append(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
            goto L2f
        L48:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.<init>(r3)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "ViewPager"
            com.bytedance.sdk.component.utils.vl.r(r2, r0)
            goto L7
        L60:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r4, r0, r5)
            r2 = 66
            r3 = 17
            if (r1 == 0) goto Lab
            if (r1 == r0) goto Lab
            if (r5 != r3) goto L90
            android.graphics.Rect r2 = r4.g
            android.graphics.Rect r2 = r4.j(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.g
            android.graphics.Rect r3 = r4.j(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto L8b
            if (r2 < r3) goto L8b
            boolean r0 = r4.r()
            goto Lc2
        L8b:
            boolean r0 = r1.requestFocus()
            goto Lc2
        L90:
            if (r5 != r2) goto Lb7
            android.graphics.Rect r2 = r4.g
            android.graphics.Rect r2 = r4.j(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.g
            android.graphics.Rect r3 = r4.j(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto La6
            if (r2 <= r3) goto Lb9
        La6:
            boolean r0 = r1.requestFocus()
            goto Lc2
        Lab:
            if (r5 == r3) goto Lbe
            r0 = 1
            if (r5 != r0) goto Lb1
            goto Lbe
        Lb1:
            if (r5 == r2) goto Lb9
            r0 = 2
            if (r5 != r0) goto Lb7
            goto Lb9
        Lb7:
            r0 = 0
            goto Lc2
        Lb9:
            boolean r0 = r4.up()
            goto Lc2
        Lbe:
            boolean r0 = r4.r()
        Lc2:
            if (r0 == 0) goto Lcb
            int r5 = android.view.SoundEffectConstants.getContantForFocusDirection(r5)
            r4.playSoundEffect(r5)
        Lcb:
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent r2) {
            r1 = this;
            boolean r0 = super.dispatchKeyEvent(r2)
            if (r0 != 0) goto Lf
            boolean r2 = r1.j(r2)
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            return r2
        Lf:
            r2 = 1
            return r2
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent r7) {
            r6 = this;
            int r0 = r7.getEventType()
            r1 = 4096(0x1000, float:5.74E-42)
            if (r0 != r1) goto Ld
            boolean r7 = super.dispatchPopulateAccessibilityEvent(r7)
            return r7
        Ld:
            int r0 = r6.getChildCount()
            r1 = 0
            r2 = 0
        L13:
            if (r2 >= r0) goto L36
            android.view.View r3 = r6.getChildAt(r2)
            int r4 = r3.getVisibility()
            if (r4 != 0) goto L33
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt r4 = r6.j(r3)
            if (r4 == 0) goto L33
            int r4 = r4.xt
            int r5 = r6.f1998r
            if (r4 != r5) goto L33
            boolean r3 = r3.dispatchPopulateAccessibilityEvent(r7)
            if (r3 == 0) goto L33
            r7 = 1
            return r7
        L33:
            int r2 = r2 + 1
            goto L13
        L36:
            return r1
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas r8) {
            r7 = this;
            super.draw(r8)
            int r0 = r7.getOverScrollMode()
            r1 = 0
            if (r0 == 0) goto L24
            r2 = 1
            if (r0 != r2) goto L18
            com.bytedance.adsdk.ugeno.viewpager.xt r0 = r7.cw
            if (r0 == 0) goto L18
            int r0 = r0.j()
            if (r0 <= r2) goto L18
            goto L24
        L18:
            android.widget.EdgeEffect r8 = r7.f2003z
            r8.finish()
            android.widget.EdgeEffect r8 = r7.hl
            r8.finish()
            goto La8
        L24:
            android.widget.EdgeEffect r0 = r7.f2003z
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L64
            int r0 = r8.save()
            int r1 = r7.getHeight()
            int r2 = r7.getPaddingTop()
            int r1 = r1 - r2
            int r2 = r7.getPaddingBottom()
            int r1 = r1 - r2
            int r2 = r7.getWidth()
            r3 = 1132920832(0x43870000, float:270.0)
            r8.rotate(r3)
            int r3 = -r1
            int r4 = r7.getPaddingTop()
            int r3 = r3 + r4
            float r3 = (float) r3
            float r4 = r7.kt
            float r5 = (float) r2
            float r4 = r4 * r5
            r8.translate(r3, r4)
            android.widget.EdgeEffect r3 = r7.f2003z
            r3.setSize(r1, r2)
            android.widget.EdgeEffect r1 = r7.f2003z
            boolean r1 = r1.draw(r8)
            r8.restoreToCount(r0)
        L64:
            android.widget.EdgeEffect r0 = r7.hl
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto La8
            int r0 = r8.save()
            int r2 = r7.getWidth()
            int r3 = r7.getHeight()
            int r4 = r7.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r7.getPaddingBottom()
            int r3 = r3 - r4
            r4 = 1119092736(0x42b40000, float:90.0)
            r8.rotate(r4)
            int r4 = r7.getPaddingTop()
            int r4 = -r4
            float r4 = (float) r4
            float r5 = r7.tj
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 + r6
            float r5 = -r5
            float r6 = (float) r2
            float r5 = r5 * r6
            r8.translate(r4, r5)
            android.widget.EdgeEffect r4 = r7.hl
            r4.setSize(r3, r2)
            android.widget.EdgeEffect r2 = r7.hl
            boolean r2 = r2.draw(r8)
            r1 = r1 | r2
            r8.restoreToCount(r0)
        La8:
            if (r1 == 0) goto Lad
            r7.postInvalidateOnAnimation()
        Lad:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
            r2 = this;
            super.drawableStateChanged()
            android.graphics.drawable.Drawable r0 = r2.i
            if (r0 == 0) goto L14
            boolean r1 = r0.isStateful()
            if (r1 == 0) goto L14
            int[] r1 = r2.getDrawableState()
            r0.setState(r1)
        L14:
            return
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$cw r0 = new com.bytedance.adsdk.ugeno.viewpager.ViewPager$cw
            r0.<init>()
            return r0
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$cw r0 = new com.bytedance.adsdk.ugeno.viewpager.ViewPager$cw
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            android.view.ViewGroup$LayoutParams r1 = r0.generateDefaultLayoutParams()
            return r1
    }

    public com.bytedance.adsdk.ugeno.viewpager.xt getAdapter() {
            r1 = this;
            com.bytedance.adsdk.ugeno.viewpager.xt r0 = r1.cw
            return r0
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int r3, int r4) {
            r2 = this;
            int r0 = r2.zz
            r1 = 2
            if (r0 != r1) goto L9
            int r3 = r3 + (-1)
            int r4 = r3 - r4
        L9:
            java.util.ArrayList<android.view.View> r3 = r2.kc
            java.lang.Object r3 = r3.get(r4)
            android.view.View r3 = (android.view.View) r3
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$cw r3 = (com.bytedance.adsdk.ugeno.viewpager.ViewPager.cw) r3
            int r3 = r3.f2005m
            return r3
    }

    public int getCurrentItem() {
            r1 = this;
            int r0 = r1.f1998r
            return r0
    }

    public int getOffscreenPageLimit() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public int getPageMargin() {
            r1 = this;
            int r0 = r1.av
            return r0
    }

    float j(float r3) {
            r2 = this;
            r0 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 - r0
            r0 = 1055999547(0x3ef1463b, float:0.47123894)
            float r3 = r3 * r0
            double r0 = (double) r3
            double r0 = java.lang.Math.sin(r0)
            float r3 = (float) r0
            return r3
    }

    com.bytedance.adsdk.ugeno.viewpager.ViewPager.xt j(int r3, int r4) {
            r2 = this;
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt r0 = new com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt
            r0.<init>()
            r0.xt = r3
            com.bytedance.adsdk.ugeno.viewpager.xt r1 = r2.cw
            java.lang.Object r1 = r1.j(r2, r3)
            r0.j = r1
            com.bytedance.adsdk.ugeno.viewpager.xt r1 = r2.cw
            float r3 = r1.j(r3)
            r0.f2007r = r3
            if (r4 < 0) goto L28
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r3 = r2.ae
            int r3 = r3.size()
            if (r4 < r3) goto L22
            goto L28
        L22:
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r3 = r2.ae
            r3.add(r4, r0)
            return r0
        L28:
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r3 = r2.ae
            r3.add(r0)
            return r0
    }

    com.bytedance.adsdk.ugeno.viewpager.ViewPager.xt j(android.view.View r5) {
            r4 = this;
            r0 = 0
        L1:
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r1 = r4.ae
            int r1 = r1.size()
            if (r0 >= r1) goto L1f
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r1 = r4.ae
            java.lang.Object r1 = r1.get(r0)
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt r1 = (com.bytedance.adsdk.ugeno.viewpager.ViewPager.xt) r1
            com.bytedance.adsdk.ugeno.viewpager.xt r2 = r4.cw
            java.lang.Object r3 = r1.j
            boolean r2 = r2.j(r5, r3)
            if (r2 == 0) goto L1c
            return r1
        L1c:
            int r0 = r0 + 1
            goto L1
        L1f:
            r5 = 0
            return r5
    }

    void j() {
            r4 = this;
            r0 = 0
            r4.setWillNotDraw(r0)
            r0 = 262144(0x40000, float:3.67342E-40)
            r4.setDescendantFocusability(r0)
            r0 = 1
            r4.setFocusable(r0)
            android.content.Context r0 = r4.getContext()
            android.widget.Scroller r1 = new android.widget.Scroller
            android.view.animation.Interpolator r2 = com.bytedance.adsdk.ugeno.viewpager.ViewPager.f1993m
            r1.<init>(r0, r2)
            r4.jy = r1
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r0)
            android.content.res.Resources r2 = r0.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            int r3 = r1.getScaledPagingTouchSlop()
            r4.gq = r3
            r3 = 1137180672(0x43c80000, float:400.0)
            float r3 = r3 * r2
            int r3 = (int) r3
            r4.f1995n = r3
            int r1 = r1.getScaledMaximumFlingVelocity()
            r4.nd = r1
            android.widget.EdgeEffect r1 = new android.widget.EdgeEffect
            r1.<init>(r0)
            r4.f2003z = r1
            android.widget.EdgeEffect r1 = new android.widget.EdgeEffect
            r1.<init>(r0)
            r4.hl = r1
            r0 = 1103626240(0x41c80000, float:25.0)
            float r0 = r0 * r2
            int r0 = (int) r0
            r4.rh = r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 * r2
            int r0 = (int) r0
            r4.ol = r0
            r0 = 1098907648(0x41800000, float:16.0)
            float r2 = r2 * r0
            int r0 = (int) r2
            r4.h = r0
            return
    }

    void j(int r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.f1998r
            if (r2 == r1) goto Lf
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt r2 = r0.xt(r2)
            r0.f1998r = r1
            goto L10
        Lf:
            r2 = 0
        L10:
            com.bytedance.adsdk.ugeno.viewpager.xt r1 = r0.cw
            if (r1 != 0) goto L18
            r0.ae()
            return
        L18:
            boolean r1 = r0.f1999s
            if (r1 == 0) goto L20
            r0.ae()
            return
        L20:
            android.os.IBinder r1 = r0.getWindowToken()
            if (r1 != 0) goto L28
            goto L1f9
        L28:
            int r1 = r0.a
            int r4 = r0.f1998r
            int r4 = r4 - r1
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
            com.bytedance.adsdk.ugeno.viewpager.xt r6 = r0.cw
            int r6 = r6.j()
            int r7 = r6 + (-1)
            int r8 = r0.f1998r
            int r8 = r8 + r1
            int r1 = java.lang.Math.min(r7, r8)
            int r7 = r0.j
            if (r6 != r7) goto L1fa
            r7 = 0
        L46:
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r8 = r0.ae
            int r8 = r8.size()
            if (r7 >= r8) goto L62
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r8 = r0.ae
            java.lang.Object r8 = r8.get(r7)
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt r8 = (com.bytedance.adsdk.ugeno.viewpager.ViewPager.xt) r8
            int r9 = r8.xt
            int r10 = r0.f1998r
            if (r9 < r10) goto L5f
            if (r9 != r10) goto L62
            goto L63
        L5f:
            int r7 = r7 + 1
            goto L46
        L62:
            r8 = 0
        L63:
            if (r8 != 0) goto L6d
            if (r6 <= 0) goto L6d
            int r8 = r0.f1998r
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt r8 = r0.j(r8, r7)
        L6d:
            r9 = 0
            if (r8 == 0) goto L18d
            int r10 = r7 + (-1)
            if (r10 < 0) goto L7d
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r11 = r0.ae
            java.lang.Object r11 = r11.get(r10)
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt r11 = (com.bytedance.adsdk.ugeno.viewpager.ViewPager.xt) r11
            goto L7e
        L7d:
            r11 = 0
        L7e:
            int r12 = r0.getClientWidth()
            r13 = 1073741824(0x40000000, float:2.0)
            if (r12 > 0) goto L88
            r14 = 0
            goto L94
        L88:
            float r14 = r8.f2007r
            float r14 = r13 - r14
            int r15 = r0.getPaddingLeft()
            float r15 = (float) r15
            float r3 = (float) r12
            float r15 = r15 / r3
            float r14 = r14 + r15
        L94:
            int r3 = r0.f1998r
            int r3 = r3 + (-1)
            r15 = 0
        L99:
            if (r3 < 0) goto Lf9
            int r16 = (r15 > r14 ? 1 : (r15 == r14 ? 0 : -1))
            if (r16 < 0) goto Lc9
            if (r3 >= r4) goto Lc9
            if (r11 == 0) goto Lf9
            int r5 = r11.xt
            if (r3 != r5) goto Lf5
            boolean r5 = r11.cw
            if (r5 != 0) goto Lf5
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r5 = r0.ae
            r5.remove(r10)
            com.bytedance.adsdk.ugeno.viewpager.xt r5 = r0.cw
            java.lang.Object r11 = r11.j
            r5.j(r0, r3, r11)
            int r10 = r10 + (-1)
            int r7 = r7 + (-1)
            if (r10 < 0) goto Lc6
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r5 = r0.ae
            java.lang.Object r5 = r5.get(r10)
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt r5 = (com.bytedance.adsdk.ugeno.viewpager.ViewPager.xt) r5
            goto Lc7
        Lc6:
            r5 = 0
        Lc7:
            r11 = r5
            goto Lf5
        Lc9:
            if (r11 == 0) goto Ldf
            int r5 = r11.xt
            if (r3 != r5) goto Ldf
            float r5 = r11.f2007r
            float r15 = r15 + r5
            int r10 = r10 + (-1)
            if (r10 < 0) goto Lc6
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r5 = r0.ae
            java.lang.Object r5 = r5.get(r10)
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt r5 = (com.bytedance.adsdk.ugeno.viewpager.ViewPager.xt) r5
            goto Lc7
        Ldf:
            int r5 = r10 + 1
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt r5 = r0.j(r3, r5)
            float r5 = r5.f2007r
            float r15 = r15 + r5
            int r7 = r7 + 1
            if (r10 < 0) goto Lc6
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r5 = r0.ae
            java.lang.Object r5 = r5.get(r10)
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt r5 = (com.bytedance.adsdk.ugeno.viewpager.ViewPager.xt) r5
            goto Lc7
        Lf5:
            int r3 = r3 + (-1)
            r5 = 0
            goto L99
        Lf9:
            float r3 = r8.f2007r
            int r4 = r7 + 1
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 >= 0) goto L18a
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r5 = r0.ae
            int r5 = r5.size()
            if (r4 >= r5) goto L112
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r5 = r0.ae
            java.lang.Object r5 = r5.get(r4)
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt r5 = (com.bytedance.adsdk.ugeno.viewpager.ViewPager.xt) r5
            goto L113
        L112:
            r5 = 0
        L113:
            if (r12 > 0) goto L117
            r10 = 0
            goto L11f
        L117:
            int r10 = r0.getPaddingRight()
            float r10 = (float) r10
            float r11 = (float) r12
            float r10 = r10 / r11
            float r10 = r10 + r13
        L11f:
            int r11 = r0.f1998r
        L121:
            int r11 = r11 + 1
            if (r11 >= r6) goto L18a
            int r12 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r12 < 0) goto L154
            if (r11 <= r1) goto L154
            if (r5 == 0) goto L18a
            int r12 = r5.xt
            if (r11 != r12) goto L189
            boolean r12 = r5.cw
            if (r12 != 0) goto L189
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r12 = r0.ae
            r12.remove(r4)
            com.bytedance.adsdk.ugeno.viewpager.xt r12 = r0.cw
            java.lang.Object r5 = r5.j
            r12.j(r0, r11, r5)
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r5 = r0.ae
            int r5 = r5.size()
            if (r4 >= r5) goto L152
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r5 = r0.ae
            java.lang.Object r5 = r5.get(r4)
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt r5 = (com.bytedance.adsdk.ugeno.viewpager.ViewPager.xt) r5
            goto L189
        L152:
            r5 = 0
            goto L189
        L154:
            if (r5 == 0) goto L170
            int r12 = r5.xt
            if (r11 != r12) goto L170
            float r5 = r5.f2007r
            float r3 = r3 + r5
            int r4 = r4 + 1
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r5 = r0.ae
            int r5 = r5.size()
            if (r4 >= r5) goto L152
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r5 = r0.ae
            java.lang.Object r5 = r5.get(r4)
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt r5 = (com.bytedance.adsdk.ugeno.viewpager.ViewPager.xt) r5
            goto L189
        L170:
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt r5 = r0.j(r11, r4)
            int r4 = r4 + 1
            float r5 = r5.f2007r
            float r3 = r3 + r5
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r5 = r0.ae
            int r5 = r5.size()
            if (r4 >= r5) goto L152
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r5 = r0.ae
            java.lang.Object r5 = r5.get(r4)
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt r5 = (com.bytedance.adsdk.ugeno.viewpager.ViewPager.xt) r5
        L189:
            goto L121
        L18a:
            r0.j(r8, r7, r2)
        L18d:
            int r1 = r0.getChildCount()
            r2 = 0
        L192:
            if (r2 >= r1) goto L1bb
            android.view.View r3 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$cw r4 = (com.bytedance.adsdk.ugeno.viewpager.ViewPager.cw) r4
            r4.f2005m = r2
            boolean r5 = r4.j
            if (r5 != 0) goto L1b8
            float r5 = r4.cw
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L1b8
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt r3 = r0.j(r3)
            if (r3 == 0) goto L1b8
            float r5 = r3.f2007r
            r4.cw = r5
            int r3 = r3.xt
            r4.up = r3
        L1b8:
            int r2 = r2 + 1
            goto L192
        L1bb:
            r0.ae()
            boolean r1 = r0.hasFocus()
            if (r1 == 0) goto L1f9
            android.view.View r1 = r0.findFocus()
            if (r1 == 0) goto L1cf
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt r3 = r0.xt(r1)
            goto L1d0
        L1cf:
            r3 = 0
        L1d0:
            if (r3 == 0) goto L1d8
            int r1 = r3.xt
            int r2 = r0.f1998r
            if (r1 == r2) goto L1f9
        L1d8:
            r5 = 0
        L1d9:
            int r1 = r0.getChildCount()
            if (r5 >= r1) goto L1f9
            android.view.View r1 = r0.getChildAt(r5)
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt r2 = r0.j(r1)
            if (r2 == 0) goto L1f6
            int r2 = r2.xt
            int r3 = r0.f1998r
            if (r2 != r3) goto L1f6
            r2 = 2
            boolean r1 = r1.requestFocus(r2)
            if (r1 != 0) goto L1f9
        L1f6:
            int r5 = r5 + 1
            goto L1d9
        L1f9:
            return
        L1fa:
            android.content.res.Resources r1 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L207
            int r2 = r0.getId()     // Catch: android.content.res.Resources.NotFoundException -> L207
            java.lang.String r1 = r1.getResourceName(r2)     // Catch: android.content.res.Resources.NotFoundException -> L207
            goto L20f
        L207:
            int r1 = r0.getId()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
        L20f:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            r3.<init>(r4)
            int r4 = r0.j
            r3.append(r4)
            java.lang.String r4 = ", found: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = " Pager id: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " Pager class: "
            r3.append(r1)
            java.lang.Class r1 = r0.getClass()
            r3.append(r1)
            java.lang.String r1 = " Problematic adapter: "
            r3.append(r1)
            com.bytedance.adsdk.ugeno.viewpager.xt r1 = r0.cw
            java.lang.Class r1 = r1.getClass()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
    }

    protected void j(int r13, float r14, int r15) {
            r12 = this;
            int r0 = r12.qb
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = 0
        L1b:
            if (r7 >= r6) goto L6b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$cw r9 = (com.bytedance.adsdk.ugeno.viewpager.ViewPager.cw) r9
            boolean r10 = r9.j
            if (r10 == 0) goto L68
            int r9 = r9.xt
            r9 = r9 & 7
            if (r9 == r2) goto L4f
            r10 = 3
            if (r9 == r10) goto L49
            r10 = 5
            if (r9 == r10) goto L39
            r9 = r3
            goto L5c
        L39:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
        L45:
            r11 = r9
            r9 = r3
            r3 = r11
            goto L5c
        L49:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5c
        L4f:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
            goto L45
        L5c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L67
            r8.offsetLeftAndRight(r3)
        L67:
            r3 = r9
        L68:
            int r7 = r7 + 1
            goto L1b
        L6b:
            r12.xt(r13, r14, r15)
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$up r13 = r12.ff
            if (r13 == 0) goto L9e
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L7a:
            if (r1 >= r14) goto L9e
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$cw r0 = (com.bytedance.adsdk.ugeno.viewpager.ViewPager.cw) r0
            boolean r0 = r0.j
            if (r0 != 0) goto L9b
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$up r3 = r12.ff
            r3.j(r15, r0)
        L9b:
            int r1 = r1 + 1
            goto L7a
        L9e:
            r12.f1997q = r2
            return
    }

    void j(int r9, int r10, int r11) {
            r8 = this;
            int r0 = r8.getChildCount()
            r1 = 0
            if (r0 != 0) goto Lb
            r8.setScrollingCacheEnabled(r1)
            return
        Lb:
            android.widget.Scroller r0 = r8.jy
            if (r0 == 0) goto L30
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L30
            boolean r0 = r8.ws
            if (r0 == 0) goto L20
            android.widget.Scroller r0 = r8.jy
            int r0 = r0.getCurrX()
            goto L26
        L20:
            android.widget.Scroller r0 = r8.jy
            int r0 = r0.getStartX()
        L26:
            android.widget.Scroller r2 = r8.jy
            r2.abortAnimation()
            r8.setScrollingCacheEnabled(r1)
        L2e:
            r3 = r0
            goto L35
        L30:
            int r0 = r8.getScrollX()
            goto L2e
        L35:
            int r4 = r8.getScrollY()
            int r5 = r9 - r3
            int r6 = r10 - r4
            if (r5 != 0) goto L4b
            if (r6 != 0) goto L4b
            r8.j(r1)
            r8.cw()
            r8.setScrollState(r1)
            return
        L4b:
            r9 = 1
            r8.setScrollingCacheEnabled(r9)
            r9 = 2
            r8.setScrollState(r9)
            int r9 = r8.getClientWidth()
            int r10 = r9 / 2
            int r0 = java.lang.Math.abs(r5)
            float r0 = (float) r0
            r2 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 * r2
            float r9 = (float) r9
            float r0 = r0 / r9
            float r0 = java.lang.Math.min(r2, r0)
            float r10 = (float) r10
            float r0 = r8.j(r0)
            float r0 = r0 * r10
            float r10 = r10 + r0
            int r11 = java.lang.Math.abs(r11)
            if (r11 <= 0) goto L87
            float r9 = (float) r11
            float r10 = r10 / r9
            float r9 = java.lang.Math.abs(r10)
            r10 = 1148846080(0x447a0000, float:1000.0)
            float r9 = r9 * r10
            int r9 = java.lang.Math.round(r9)
            int r9 = r9 * 4
            goto La1
        L87:
            com.bytedance.adsdk.ugeno.viewpager.xt r10 = r8.cw
            int r11 = r8.f1998r
            float r10 = r10.j(r11)
            float r9 = r9 * r10
            int r10 = java.lang.Math.abs(r5)
            float r10 = (float) r10
            int r11 = r8.av
            float r11 = (float) r11
            float r9 = r9 + r11
            float r10 = r10 / r9
            float r10 = r10 + r2
            r9 = 1120403456(0x42c80000, float:100.0)
            float r10 = r10 * r9
            int r9 = (int) r10
        La1:
            r10 = 600(0x258, float:8.41E-43)
            int r7 = java.lang.Math.min(r9, r10)
            r8.ws = r1
            android.widget.Scroller r2 = r8.jy
            r2.startScroll(r3, r4, r5, r6, r7)
            r8.postInvalidateOnAnimation()
            return
    }

    public void j(int r2, boolean r3) {
            r1 = this;
            r0 = 0
            r1.f1999s = r0
            r1.j(r2, r3, r0)
            return
    }

    void j(int r2, boolean r3, boolean r4) {
            r1 = this;
            r0 = 0
            r1.j(r2, r3, r4, r0)
            return
    }

    void j(int r5, boolean r6, boolean r7, int r8) {
            r4 = this;
            com.bytedance.adsdk.ugeno.viewpager.xt r0 = r4.cw
            r1 = 0
            if (r0 == 0) goto L6e
            int r0 = r0.j()
            if (r0 > 0) goto Lc
            goto L6e
        Lc:
            if (r7 != 0) goto L1e
            int r7 = r4.f1998r
            if (r7 != r5) goto L1e
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r7 = r4.ae
            int r7 = r7.size()
            if (r7 == 0) goto L1e
            r4.setScrollingCacheEnabled(r1)
            return
        L1e:
            r7 = 1
            if (r5 >= 0) goto L23
            r5 = 0
            goto L32
        L23:
            com.bytedance.adsdk.ugeno.viewpager.xt r0 = r4.cw
            int r0 = r0.j()
            if (r5 < r0) goto L32
            com.bytedance.adsdk.ugeno.viewpager.xt r5 = r4.cw
            int r5 = r5.j()
            int r5 = r5 - r7
        L32:
            int r0 = r4.a
            int r2 = r4.f1998r
            int r3 = r2 + r0
            if (r5 > r3) goto L3d
            int r2 = r2 - r0
            if (r5 >= r2) goto L53
        L3d:
            r0 = 0
        L3e:
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r2 = r4.ae
            int r2 = r2.size()
            if (r0 >= r2) goto L53
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r2 = r4.ae
            java.lang.Object r2 = r2.get(r0)
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt r2 = (com.bytedance.adsdk.ugeno.viewpager.ViewPager.xt) r2
            r2.cw = r7
            int r0 = r0 + 1
            goto L3e
        L53:
            int r0 = r4.f1998r
            if (r0 == r5) goto L58
            r1 = 1
        L58:
            boolean r7 = r4.b
            if (r7 == 0) goto L67
            r4.f1998r = r5
            if (r1 == 0) goto L63
            r4.up(r5)
        L63:
            r4.requestLayout()
            return
        L67:
            r4.j(r5)
            r4.j(r5, r6, r8, r1)
            return
        L6e:
            r4.setScrollingCacheEnabled(r1)
            return
    }

    public void j(com.bytedance.adsdk.ugeno.viewpager.ViewPager.r r2) {
            r1 = this;
            java.util.List<com.bytedance.adsdk.ugeno.viewpager.ViewPager$r> r0 = r1.ya
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.ya = r0
        Lb:
            java.util.List<com.bytedance.adsdk.ugeno.viewpager.ViewPager$r> r0 = r1.ya
            r0.add(r2)
            return
    }

    public void j(boolean r2, com.bytedance.adsdk.ugeno.viewpager.ViewPager.up r3) {
            r1 = this;
            r0 = 2
            r1.j(r2, r3, r0)
            return
    }

    public void j(boolean r5, com.bytedance.adsdk.ugeno.viewpager.ViewPager.up r6, int r7) {
            r4 = this;
            r0 = 0
            r1 = 1
            if (r6 == 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$up r3 = r4.ff
            if (r3 == 0) goto Ld
            r3 = 1
            goto Le
        Ld:
            r3 = 0
        Le:
            if (r2 == r3) goto L12
            r3 = 1
            goto L13
        L12:
            r3 = 0
        L13:
            r4.ff = r6
            r4.setChildrenDrawingOrderEnabled(r2)
            if (r2 == 0) goto L22
            if (r5 == 0) goto L1d
            r1 = 2
        L1d:
            r4.zz = r1
            r4.ry = r7
            goto L24
        L22:
            r4.zz = r0
        L24:
            if (r3 == 0) goto L29
            r4.cw()
        L29:
            return
    }

    public boolean j(android.view.KeyEvent r4) {
            r3 = this;
            int r0 = r4.getAction()
            if (r0 != 0) goto L53
            int r0 = r4.getKeyCode()
            r1 = 21
            r2 = 2
            if (r0 == r1) goto L41
            r1 = 22
            if (r0 == r1) goto L2f
            r1 = 61
            if (r0 == r1) goto L18
            goto L53
        L18:
            boolean r0 = r4.hasNoModifiers()
            if (r0 == 0) goto L23
            boolean r4 = r3.cw(r2)
            return r4
        L23:
            r0 = 1
            boolean r4 = r4.hasModifiers(r0)
            if (r4 == 0) goto L53
            boolean r4 = r3.cw(r0)
            return r4
        L2f:
            boolean r4 = r4.hasModifiers(r2)
            if (r4 == 0) goto L3a
            boolean r4 = r3.up()
            return r4
        L3a:
            r4 = 66
            boolean r4 = r3.cw(r4)
            return r4
        L41:
            boolean r4 = r4.hasModifiers(r2)
            if (r4 == 0) goto L4c
            boolean r4 = r3.r()
            return r4
        L4c:
            r4 = 17
            boolean r4 = r3.cw(r4)
            return r4
        L53:
            r4 = 0
            return r4
    }

    protected boolean j(android.view.View r12, boolean r13, int r14, int r15, int r16) {
            r11 = this;
            boolean r0 = r12 instanceof android.view.ViewGroup
            r1 = 1
            if (r0 == 0) goto L50
            r0 = r12
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r2 = r12.getScrollX()
            int r3 = r12.getScrollY()
            int r4 = r0.getChildCount()
            int r4 = r4 - r1
        L15:
            if (r4 < 0) goto L50
            android.view.View r6 = r0.getChildAt(r4)
            int r5 = r15 + r2
            int r7 = r6.getLeft()
            if (r5 < r7) goto L4d
            int r7 = r6.getRight()
            if (r5 >= r7) goto L4d
            int r7 = r16 + r3
            int r8 = r6.getTop()
            if (r7 < r8) goto L4d
            int r8 = r6.getBottom()
            if (r7 >= r8) goto L4d
            int r8 = r6.getLeft()
            int r9 = r5 - r8
            int r5 = r6.getTop()
            int r10 = r7 - r5
            r7 = 1
            r5 = r11
            r8 = r14
            boolean r6 = r5.j(r6, r7, r8, r9, r10)
            if (r6 == 0) goto L4d
            return r1
        L4d:
            int r4 = r4 + (-1)
            goto L15
        L50:
            if (r13 == 0) goto L5a
            int r13 = -r14
            boolean r12 = r12.canScrollHorizontally(r13)
            if (r12 == 0) goto L5a
            return r1
        L5a:
            r12 = 0
            return r12
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            r0 = 1
            r1.b = r0
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            java.lang.Runnable r0 = r1.rr
            r1.removeCallbacks(r0)
            android.widget.Scroller r0 = r1.jy
            if (r0 == 0) goto L14
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L14
            android.widget.Scroller r0 = r1.jy
            r0.abortAnimation()
        L14:
            super.onDetachedFromWindow()
            return
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r18) {
            r17 = this;
            r0 = r17
            super.onDraw(r18)
            int r1 = r0.av
            if (r1 <= 0) goto La9
            android.graphics.drawable.Drawable r1 = r0.i
            if (r1 == 0) goto La9
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r1 = r0.ae
            int r1 = r1.size()
            if (r1 <= 0) goto La9
            com.bytedance.adsdk.ugeno.viewpager.xt r1 = r0.cw
            if (r1 == 0) goto La9
            int r1 = r0.getScrollX()
            int r2 = r0.getWidth()
            int r3 = r0.av
            float r3 = (float) r3
            float r4 = (float) r2
            float r3 = r3 / r4
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r5 = r0.ae
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt r5 = (com.bytedance.adsdk.ugeno.viewpager.ViewPager.xt) r5
            float r7 = r5.up
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r8 = r0.ae
            int r8 = r8.size()
            int r9 = r5.xt
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r10 = r0.ae
            int r11 = r8 + (-1)
            java.lang.Object r10 = r10.get(r11)
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt r10 = (com.bytedance.adsdk.ugeno.viewpager.ViewPager.xt) r10
            int r10 = r10.xt
        L45:
            if (r9 >= r10) goto La9
        L47:
            int r11 = r5.xt
            if (r9 <= r11) goto L58
            if (r6 >= r8) goto L58
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r5 = r0.ae
            int r6 = r6 + 1
            java.lang.Object r5 = r5.get(r6)
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt r5 = (com.bytedance.adsdk.ugeno.viewpager.ViewPager.xt) r5
            goto L47
        L58:
            if (r9 != r11) goto L65
            float r7 = r5.up
            float r11 = r5.f2007r
            float r12 = r7 + r11
            float r12 = r12 * r4
            float r7 = r7 + r11
            float r7 = r7 + r3
            goto L71
        L65:
            com.bytedance.adsdk.ugeno.viewpager.xt r11 = r0.cw
            float r11 = r11.j(r9)
            float r12 = r7 + r11
            float r12 = r12 * r4
            float r11 = r11 + r3
            float r7 = r7 + r11
        L71:
            int r11 = r0.av
            float r11 = (float) r11
            float r11 = r11 + r12
            float r13 = (float) r1
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 <= 0) goto L99
            android.graphics.drawable.Drawable r11 = r0.i
            int r13 = java.lang.Math.round(r12)
            int r14 = r0.f2001w
            int r15 = r0.av
            float r15 = (float) r15
            float r15 = r15 + r12
            int r15 = java.lang.Math.round(r15)
            r16 = r1
            int r1 = r0.mi
            r11.setBounds(r13, r14, r15, r1)
            android.graphics.drawable.Drawable r1 = r0.i
            r11 = r18
            r1.draw(r11)
            goto L9d
        L99:
            r11 = r18
            r16 = r1
        L9d:
            int r1 = r16 + r2
            float r1 = (float) r1
            int r1 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r1 > 0) goto La9
            int r9 = r9 + 1
            r1 = r16
            goto L45
        La9:
            return
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent r14) {
            r13 = this;
            int r1 = r14.getAction()
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 3
            r6 = 0
            if (r1 == r2) goto L112
            r7 = 1
            if (r1 != r7) goto Lf
            goto L112
        Lf:
            if (r1 == 0) goto L1b
            boolean r2 = r13.f1994l
            if (r2 == 0) goto L16
            return r7
        L16:
            boolean r2 = r13.f1996p
            if (r2 == 0) goto L1b
            return r6
        L1b:
            r2 = 2
            if (r1 == 0) goto Lb0
            if (r1 == r2) goto L2a
            r2 = 6
            if (r1 == r2) goto L25
            goto L100
        L25:
            r13.j(r14)
            goto L100
        L2a:
            int r1 = r13.c
            r2 = -1
            if (r1 == r2) goto L100
            int r1 = r14.findPointerIndex(r1)
            if (r1 == r2) goto L100
            float r8 = r14.getX(r1)
            float r2 = r13.rn
            float r2 = r8 - r2
            float r9 = java.lang.Math.abs(r2)
            float r10 = r14.getY(r1)
            float r1 = r13.ed
            float r1 = r10 - r1
            float r11 = java.lang.Math.abs(r1)
            r1 = 0
            int r12 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r12 == 0) goto L6d
            float r1 = r13.rn
            boolean r1 = r13.j(r1, r2)
            if (r1 != 0) goto L6d
            int r3 = (int) r2
            int r4 = (int) r8
            int r5 = (int) r10
            r2 = 0
            r1 = r13
            r0 = r13
            boolean r1 = r0.j(r1, r2, r3, r4, r5)
            if (r1 == 0) goto L6d
            r13.rn = r8
            r13.wq = r10
            r13.f1996p = r7
            return r6
        L6d:
            int r1 = r13.gq
            float r2 = (float) r1
            int r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r2 <= 0) goto L9b
            r2 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 * r2
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 <= 0) goto L9b
            r13.f1994l = r7
            r13.cw(r7)
            r13.setScrollState(r7)
            if (r12 <= 0) goto L8d
            float r1 = r13.uf
            int r2 = r13.gq
            float r2 = (float) r2
            float r1 = r1 + r2
            goto L93
        L8d:
            float r1 = r13.uf
            int r2 = r13.gq
            float r2 = (float) r2
            float r1 = r1 - r2
        L93:
            r13.rn = r1
            r13.wq = r10
            r13.setScrollingCacheEnabled(r7)
            goto La2
        L9b:
            float r1 = (float) r1
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 <= 0) goto La2
            r13.f1996p = r7
        La2:
            boolean r1 = r13.f1994l
            if (r1 == 0) goto L100
            boolean r1 = r13.xt(r8)
            if (r1 == 0) goto L100
            r13.postInvalidateOnAnimation()
            goto L100
        Lb0:
            float r1 = r14.getX()
            r13.uf = r1
            r13.rn = r1
            float r1 = r14.getY()
            r13.ed = r1
            r13.wq = r1
            int r1 = r14.getPointerId(r6)
            r13.c = r1
            r13.f1996p = r6
            r13.ws = r7
            android.widget.Scroller r1 = r13.jy
            r1.computeScrollOffset()
            int r1 = r13.st
            if (r1 != r2) goto Lfb
            android.widget.Scroller r1 = r13.jy
            int r1 = r1.getFinalX()
            android.widget.Scroller r2 = r13.jy
            int r2 = r2.getCurrX()
            int r1 = r1 - r2
            int r1 = java.lang.Math.abs(r1)
            int r2 = r13.ol
            if (r1 <= r2) goto Lfb
            android.widget.Scroller r1 = r13.jy
            r1.abortAnimation()
            r13.f1999s = r6
            r13.cw()
            r13.f1994l = r7
            r13.cw(r7)
            r13.setScrollState(r7)
            goto L100
        Lfb:
            r13.j(r6)
            r13.f1994l = r6
        L100:
            android.view.VelocityTracker r1 = r13.gx
            if (r1 != 0) goto L10a
            android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
            r13.gx = r1
        L10a:
            android.view.VelocityTracker r1 = r13.gx
            r1.addMovement(r14)
            boolean r1 = r13.f1994l
            return r1
        L112:
            r13.tl()
            return r6
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
            r18 = this;
            r0 = r18
            int r1 = r0.getChildCount()
            int r2 = r22 - r20
            int r3 = r23 - r21
            int r4 = r0.getPaddingLeft()
            int r5 = r0.getPaddingTop()
            int r6 = r0.getPaddingRight()
            int r7 = r0.getPaddingBottom()
            int r8 = r0.getScrollX()
            r10 = 0
            r11 = 0
        L20:
            r12 = 8
            if (r10 >= r1) goto Lb8
            android.view.View r13 = r0.getChildAt(r10)
            int r14 = r13.getVisibility()
            if (r14 == r12) goto Lb4
            android.view.ViewGroup$LayoutParams r12 = r13.getLayoutParams()
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$cw r12 = (com.bytedance.adsdk.ugeno.viewpager.ViewPager.cw) r12
            boolean r14 = r12.j
            if (r14 == 0) goto Lb4
            int r12 = r12.xt
            r14 = r12 & 7
            r12 = r12 & 112(0x70, float:1.57E-43)
            r15 = 1
            if (r14 == r15) goto L61
            r15 = 3
            if (r14 == r15) goto L5b
            r15 = 5
            if (r14 == r15) goto L49
            r14 = r4
            goto L6e
        L49:
            int r14 = r2 - r6
            int r15 = r13.getMeasuredWidth()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredWidth()
            int r6 = r6 + r15
        L55:
            r17 = r14
            r14 = r4
            r4 = r17
            goto L6e
        L5b:
            int r14 = r13.getMeasuredWidth()
            int r14 = r14 + r4
            goto L6e
        L61:
            int r14 = r13.getMeasuredWidth()
            int r14 = r2 - r14
            int r14 = r14 / 2
            int r14 = java.lang.Math.max(r14, r4)
            goto L55
        L6e:
            r15 = 16
            if (r12 == r15) goto L94
            r15 = 48
            if (r12 == r15) goto L8e
            r15 = 80
            if (r12 == r15) goto L7c
            r12 = r5
            goto La1
        L7c:
            int r12 = r3 - r7
            int r15 = r13.getMeasuredHeight()
            int r12 = r12 - r15
            int r15 = r13.getMeasuredHeight()
            int r7 = r7 + r15
        L88:
            r17 = r12
            r12 = r5
            r5 = r17
            goto La1
        L8e:
            int r12 = r13.getMeasuredHeight()
            int r12 = r12 + r5
            goto La1
        L94:
            int r12 = r13.getMeasuredHeight()
            int r12 = r3 - r12
            int r12 = r12 / 2
            int r12 = java.lang.Math.max(r12, r5)
            goto L88
        La1:
            int r4 = r4 + r8
            int r15 = r13.getMeasuredWidth()
            int r15 = r15 + r4
            int r16 = r13.getMeasuredHeight()
            int r9 = r5 + r16
            r13.layout(r4, r5, r15, r9)
            int r11 = r11 + 1
            r5 = r12
            r4 = r14
        Lb4:
            int r10 = r10 + 1
            goto L20
        Lb8:
            int r2 = r2 - r4
            int r2 = r2 - r6
            r6 = 0
        Lbb:
            if (r6 >= r1) goto L10a
            android.view.View r8 = r0.getChildAt(r6)
            int r9 = r8.getVisibility()
            if (r9 == r12) goto L107
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$cw r9 = (com.bytedance.adsdk.ugeno.viewpager.ViewPager.cw) r9
            boolean r10 = r9.j
            if (r10 != 0) goto L107
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt r10 = r0.j(r8)
            if (r10 == 0) goto L107
            float r13 = (float) r2
            float r10 = r10.up
            float r10 = r10 * r13
            int r10 = (int) r10
            int r10 = r10 + r4
            boolean r14 = r9.f2006r
            if (r14 == 0) goto Lfa
            r14 = 0
            r9.f2006r = r14
            float r9 = r9.cw
            float r13 = r13 * r9
            int r9 = (int) r13
            r13 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r13)
            int r14 = r3 - r5
            int r14 = r14 - r7
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r8.measure(r9, r13)
        Lfa:
            int r9 = r8.getMeasuredWidth()
            int r9 = r9 + r10
            int r13 = r8.getMeasuredHeight()
            int r13 = r13 + r5
            r8.layout(r10, r5, r9, r13)
        L107:
            int r6 = r6 + 1
            goto Lbb
        L10a:
            r0.f2001w = r5
            int r3 = r3 - r7
            r0.mi = r3
            r0.qb = r11
            boolean r1 = r0.b
            if (r1 == 0) goto L11c
            int r1 = r0.f1998r
            r14 = 0
            r0.j(r1, r14, r14, r14)
            goto L11d
        L11c:
            r14 = 0
        L11d:
            r0.b = r14
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r14, int r15) {
            r13 = this;
            r0 = 0
            int r14 = android.view.View.getDefaultSize(r0, r14)
            int r15 = android.view.View.getDefaultSize(r0, r15)
            r13.setMeasuredDimension(r14, r15)
            int r14 = r13.getMeasuredWidth()
            int r15 = r14 / 10
            int r1 = r13.h
            int r15 = java.lang.Math.min(r15, r1)
            r13.la = r15
            int r15 = r13.getPaddingLeft()
            int r14 = r14 - r15
            int r15 = r13.getPaddingRight()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredHeight()
            int r1 = r13.getPaddingTop()
            int r15 = r15 - r1
            int r1 = r13.getPaddingBottom()
            int r15 = r15 - r1
            int r1 = r13.getChildCount()
            r2 = 0
        L37:
            r3 = 8
            r4 = 1
            r5 = 1073741824(0x40000000, float:2.0)
            if (r2 >= r1) goto Lb1
            android.view.View r6 = r13.getChildAt(r2)
            int r7 = r6.getVisibility()
            if (r7 == r3) goto Lae
            android.view.ViewGroup$LayoutParams r3 = r6.getLayoutParams()
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$cw r3 = (com.bytedance.adsdk.ugeno.viewpager.ViewPager.cw) r3
            if (r3 == 0) goto Lae
            boolean r7 = r3.j
            if (r7 == 0) goto Lae
            int r7 = r3.xt
            r8 = r7 & 7
            r7 = r7 & 112(0x70, float:1.57E-43)
            r9 = 48
            if (r7 == r9) goto L65
            r9 = 80
            if (r7 != r9) goto L63
            goto L65
        L63:
            r7 = 0
            goto L66
        L65:
            r7 = 1
        L66:
            r9 = 3
            if (r8 == r9) goto L6e
            r9 = 5
            if (r8 != r9) goto L6d
            goto L6e
        L6d:
            r4 = 0
        L6e:
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 == 0) goto L77
            r8 = 1073741824(0x40000000, float:2.0)
        L74:
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L7b
        L77:
            if (r4 == 0) goto L74
            r9 = 1073741824(0x40000000, float:2.0)
        L7b:
            int r10 = r3.width
            r11 = -1
            r12 = -2
            if (r10 == r12) goto L88
            if (r10 == r11) goto L86
        L83:
            r8 = 1073741824(0x40000000, float:2.0)
            goto L89
        L86:
            r10 = r14
            goto L83
        L88:
            r10 = r14
        L89:
            int r3 = r3.height
            if (r3 == r12) goto L92
            if (r3 == r11) goto L90
            goto L94
        L90:
            r3 = r15
            goto L94
        L92:
            r3 = r15
            r5 = r9
        L94:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r8)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r5)
            r6.measure(r8, r3)
            if (r7 == 0) goto La7
            int r3 = r6.getMeasuredHeight()
            int r15 = r15 - r3
            goto Lae
        La7:
            if (r4 == 0) goto Lae
            int r3 = r6.getMeasuredWidth()
            int r14 = r14 - r3
        Lae:
            int r2 = r2 + 1
            goto L37
        Lb1:
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r5)
            r13.f = r1
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r5)
            r13.f2000v = r15
            r13.f2002x = r4
            r13.cw()
            r13.f2002x = r0
            int r15 = r13.getChildCount()
        Lc8:
            if (r0 >= r15) goto Lf2
            android.view.View r1 = r13.getChildAt(r0)
            int r2 = r1.getVisibility()
            if (r2 == r3) goto Lef
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$cw r2 = (com.bytedance.adsdk.ugeno.viewpager.ViewPager.cw) r2
            if (r2 == 0) goto Le0
            boolean r4 = r2.j
            if (r4 != 0) goto Lef
        Le0:
            float r4 = (float) r14
            float r2 = r2.cw
            float r4 = r4 * r2
            int r2 = (int) r4
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r5)
            int r4 = r13.f2000v
            r1.measure(r2, r4)
        Lef:
            int r0 = r0 + 1
            goto Lc8
        Lf2:
            return
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int r9, android.graphics.Rect r10) {
            r8 = this;
            int r0 = r8.getChildCount()
            r1 = r9 & 2
            r2 = 0
            r3 = 1
            if (r1 == 0) goto Le
            r1 = r0
            r0 = 0
            r4 = 1
            goto L12
        Le:
            int r0 = r0 + (-1)
            r1 = -1
            r4 = -1
        L12:
            if (r0 == r1) goto L33
            android.view.View r5 = r8.getChildAt(r0)
            int r6 = r5.getVisibility()
            if (r6 != 0) goto L31
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt r6 = r8.j(r5)
            if (r6 == 0) goto L31
            int r6 = r6.xt
            int r7 = r8.f1998r
            if (r6 != r7) goto L31
            boolean r5 = r5.requestFocus(r9, r10)
            if (r5 == 0) goto L31
            return r3
        L31:
            int r0 = r0 + r4
            goto L12
        L33:
            return r2
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable r3) {
            r2 = this;
            boolean r0 = r3 instanceof com.bytedance.adsdk.ugeno.viewpager.ViewPager.ae
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r3)
            return
        L8:
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$ae r3 = (com.bytedance.adsdk.ugeno.viewpager.ViewPager.ae) r3
            android.os.Parcelable r0 = r3.j()
            super.onRestoreInstanceState(r0)
            com.bytedance.adsdk.ugeno.viewpager.xt r0 = r2.cw
            if (r0 == 0) goto L1d
            int r3 = r3.xt
            r0 = 0
            r1 = 1
            r2.j(r3, r0, r1)
            return
        L1d:
            int r0 = r3.xt
            r2.oq = r0
            android.os.Parcelable r0 = r3.cw
            r2.qv = r0
            java.lang.ClassLoader r3 = r3.f2004r
            r2.vl = r3
            return
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$ae r1 = new com.bytedance.adsdk.ugeno.viewpager.ViewPager$ae
            r1.<init>(r0)
            int r0 = r2.f1998r
            r1.xt = r0
            com.bytedance.adsdk.ugeno.viewpager.xt r0 = r2.cw
            if (r0 == 0) goto L17
            android.os.Parcelable r0 = r0.xt()
            r1.cw = r0
        L17:
            return r1
    }

    @Override // android.view.View
    protected void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            if (r1 == r3) goto La
            int r2 = r0.av
            r0.j(r1, r3, r2, r2)
        La:
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r10) {
            r9 = this;
            boolean r0 = r9.hh
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            int r0 = r10.getAction()
            r2 = 0
            if (r0 != 0) goto L14
            int r0 = r10.getEdgeFlags()
            if (r0 == 0) goto L14
            return r2
        L14:
            com.bytedance.adsdk.ugeno.viewpager.xt r0 = r9.cw
            if (r0 == 0) goto L166
            int r0 = r0.j()
            if (r0 != 0) goto L20
            goto L166
        L20:
            android.view.VelocityTracker r0 = r9.gx
            if (r0 != 0) goto L2a
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r9.gx = r0
        L2a:
            android.view.VelocityTracker r0 = r9.gx
            r0.addMovement(r10)
            int r0 = r10.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 == 0) goto L140
            r3 = -1
            if (r0 == r1) goto Lf1
            r4 = 2
            if (r0 == r4) goto L7e
            r4 = 3
            if (r0 == r4) goto L6f
            r4 = 5
            if (r0 == r4) goto L5b
            r4 = 6
            if (r0 == r4) goto L48
            goto L160
        L48:
            r9.j(r10)
            int r0 = r9.c
            int r0 = r10.findPointerIndex(r0)
            if (r0 == r3) goto L160
            float r10 = r10.getX(r0)
            r9.rn = r10
            goto L160
        L5b:
            int r0 = r10.getActionIndex()
            if (r0 == r3) goto L160
            float r3 = r10.getX(r0)
            r9.rn = r3
            int r10 = r10.getPointerId(r0)
            r9.c = r10
            goto L160
        L6f:
            boolean r10 = r9.f1994l
            if (r10 == 0) goto L160
            int r10 = r9.f1998r
            r9.j(r10, r1, r2, r2)
            boolean r2 = r9.tl()
            goto L160
        L7e:
            boolean r0 = r9.f1994l
            if (r0 != 0) goto Ldc
            int r0 = r9.c
            int r0 = r10.findPointerIndex(r0)
            if (r0 != r3) goto L90
            boolean r2 = r9.tl()
            goto L160
        L90:
            float r4 = r10.getX(r0)
            float r5 = r9.rn
            float r5 = r4 - r5
            float r5 = java.lang.Math.abs(r5)
            float r0 = r10.getY(r0)
            float r6 = r9.wq
            float r6 = r0 - r6
            float r6 = java.lang.Math.abs(r6)
            int r7 = r9.gq
            float r7 = (float) r7
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 <= 0) goto Ldc
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto Ldc
            r9.f1994l = r1
            r9.cw(r1)
            float r5 = r9.uf
            float r4 = r4 - r5
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto Lc5
            int r4 = r9.gq
            float r4 = (float) r4
            float r5 = r5 + r4
            goto Lc9
        Lc5:
            int r4 = r9.gq
            float r4 = (float) r4
            float r5 = r5 - r4
        Lc9:
            r9.rn = r5
            r9.wq = r0
            r9.setScrollState(r1)
            r9.setScrollingCacheEnabled(r1)
            android.view.ViewParent r0 = r9.getParent()
            if (r0 == 0) goto Ldc
            r0.requestDisallowInterceptTouchEvent(r1)
        Ldc:
            boolean r0 = r9.f1994l
            if (r0 == 0) goto L160
            int r0 = r9.c
            int r0 = r10.findPointerIndex(r0)
            if (r0 == r3) goto L160
            float r10 = r10.getX(r0)
            boolean r2 = r9.xt(r10)
            goto L160
        Lf1:
            boolean r0 = r9.f1994l
            if (r0 == 0) goto L160
            android.view.VelocityTracker r0 = r9.gx
            int r4 = r9.nd
            float r4 = (float) r4
            r5 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r5, r4)
            int r4 = r9.c
            float r0 = r0.getXVelocity(r4)
            int r0 = (int) r0
            r9.f1999s = r1
            int r4 = r9.getClientWidth()
            int r5 = r9.getScrollX()
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt r6 = r9.g()
            int r7 = r9.av
            float r7 = (float) r7
            float r4 = (float) r4
            float r7 = r7 / r4
            int r8 = r6.xt
            float r5 = (float) r5
            float r5 = r5 / r4
            float r4 = r6.up
            float r5 = r5 - r4
            float r4 = r6.f2007r
            float r4 = r4 + r7
            float r5 = r5 / r4
            int r4 = r9.c
            int r4 = r10.findPointerIndex(r4)
            if (r4 == r3) goto L160
            float r10 = r10.getX(r4)
            float r2 = r9.uf
            float r10 = r10 - r2
            int r10 = (int) r10
            int r10 = r9.j(r8, r5, r0, r10)
            r9.j(r10, r1, r1, r0)
            boolean r2 = r9.tl()
            goto L160
        L140:
            android.widget.Scroller r0 = r9.jy
            r0.abortAnimation()
            r9.f1999s = r2
            r9.cw()
            float r0 = r10.getX()
            r9.uf = r0
            r9.rn = r0
            float r0 = r10.getY()
            r9.ed = r0
            r9.wq = r0
            int r10 = r10.getPointerId(r2)
            r9.c = r10
        L160:
            if (r2 == 0) goto L165
            r9.postInvalidateOnAnimation()
        L165:
            return r1
        L166:
            return r2
    }

    boolean r() {
            r2 = this;
            int r0 = r2.f1998r
            if (r0 <= 0) goto La
            r1 = 1
            int r0 = r0 - r1
            r2.j(r0, r1)
            return r1
        La:
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(android.view.View r2) {
            r1 = this;
            boolean r0 = r1.f2002x
            if (r0 == 0) goto L8
            r1.removeViewInLayout(r2)
            return
        L8:
            super.removeView(r2)
            return
    }

    public void setAdapter(com.bytedance.adsdk.ugeno.viewpager.xt r7) {
            r6 = this;
            com.bytedance.adsdk.ugeno.viewpager.xt r0 = r6.cw
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L33
            r0.j(r1)
            r0 = 0
        La:
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r3 = r6.ae
            int r3 = r3.size()
            if (r0 >= r3) goto L26
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r3 = r6.ae
            java.lang.Object r3 = r3.get(r0)
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt r3 = (com.bytedance.adsdk.ugeno.viewpager.ViewPager.xt) r3
            com.bytedance.adsdk.ugeno.viewpager.xt r4 = r6.cw
            int r5 = r3.xt
            java.lang.Object r3 = r3.j
            r4.j(r6, r5, r3)
            int r0 = r0 + 1
            goto La
        L26:
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r0 = r6.ae
            r0.clear()
            r6.m()
            r6.f1998r = r2
            r6.scrollTo(r2, r2)
        L33:
            r6.cw = r7
            r6.j = r2
            if (r7 == 0) goto L72
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$m r7 = r6.az
            if (r7 != 0) goto L44
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$m r7 = new com.bytedance.adsdk.ugeno.viewpager.ViewPager$m
            r7.<init>(r6)
            r6.az = r7
        L44:
            com.bytedance.adsdk.ugeno.viewpager.xt r7 = r6.cw
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$m r0 = r6.az
            r7.j(r0)
            r6.f1999s = r2
            boolean r7 = r6.b
            r0 = 1
            r6.b = r0
            com.bytedance.adsdk.ugeno.viewpager.xt r3 = r6.cw
            int r3 = r3.j()
            r6.j = r3
            int r3 = r6.oq
            if (r3 < 0) goto L69
            r6.j(r3, r2, r0)
            r7 = -1
            r6.oq = r7
            r6.qv = r1
            r6.vl = r1
            goto L72
        L69:
            if (r7 != 0) goto L6f
            r6.cw()
            goto L72
        L6f:
            r6.requestLayout()
        L72:
            java.util.List<java.lang.Object> r7 = r6.k
            if (r7 == 0) goto L8c
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L8c
            java.util.List<java.lang.Object> r7 = r6.k
            int r7 = r7.size()
        L82:
            if (r2 >= r7) goto L8c
            java.util.List<java.lang.Object> r0 = r6.k
            r0.get(r2)
            int r2 = r2 + 1
            goto L82
        L8c:
            return
    }

    public void setCurrentItem(int r3) {
            r2 = this;
            r0 = 0
            r2.f1999s = r0
            boolean r1 = r2.b
            r1 = r1 ^ 1
            r2.j(r3, r1, r0)
            return
    }

    public void setOffscreenPageLimit(int r3) {
            r2 = this;
            if (r3 > 0) goto L1b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Requested offscreen page limit "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = " too small; defaulting to 1"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "ViewPager"
            com.bytedance.sdk.component.utils.vl.xt(r0, r3)
            r3 = 1
        L1b:
            int r0 = r2.a
            if (r3 == r0) goto L24
            r2.a = r3
            r2.cw()
        L24:
            return
    }

    @java.lang.Deprecated
    public void setOnPageChangeListener(com.bytedance.adsdk.ugeno.viewpager.ViewPager.r r1) {
            r0 = this;
            r0.sm = r1
            return
    }

    public void setPageMargin(int r3) {
            r2 = this;
            int r0 = r2.av
            r2.av = r3
            int r1 = r2.getWidth()
            r2.j(r1, r1, r3, r0)
            r2.requestLayout()
            return
    }

    public void setPageMarginDrawable(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r2)
            r1.setPageMarginDrawable(r2)
            return
    }

    public void setPageMarginDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.i = r1
            if (r1 == 0) goto L7
            r0.refreshDrawableState()
        L7:
            if (r1 != 0) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            r0.setWillNotDraw(r1)
            r0.invalidate()
            return
    }

    void setScrollState(int r2) {
            r1 = this;
            int r0 = r1.st
            if (r0 != r2) goto L5
            return
        L5:
            r1.st = r2
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$up r0 = r1.ff
            if (r0 == 0) goto L13
            if (r2 == 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            r1.xt(r0)
        L13:
            r1.m(r2)
            return
    }

    public void setScroller(android.widget.Scroller r1) {
            r0 = this;
            r0.jy = r1
            return
    }

    boolean up() {
            r3 = this;
            com.bytedance.adsdk.ugeno.viewpager.xt r0 = r3.cw
            if (r0 == 0) goto L15
            int r1 = r3.f1998r
            int r0 = r0.j()
            r2 = 1
            int r0 = r0 - r2
            if (r1 >= r0) goto L15
            int r0 = r3.f1998r
            int r0 = r0 + r2
            r3.j(r0, r2)
            return r2
        L15:
            r0 = 0
            return r0
    }

    @Override // android.view.View
    protected boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            boolean r0 = super.verifyDrawable(r2)
            if (r0 != 0) goto Ld
            android.graphics.drawable.Drawable r0 = r1.i
            if (r2 != r0) goto Lb
            goto Ld
        Lb:
            r2 = 0
            return r2
        Ld:
            r2 = 1
            return r2
    }

    com.bytedance.adsdk.ugeno.viewpager.ViewPager.xt xt(int r4) {
            r3 = this;
            r0 = 0
        L1:
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r1 = r3.ae
            int r1 = r1.size()
            if (r0 >= r1) goto L19
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r1 = r3.ae
            java.lang.Object r1 = r1.get(r0)
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt r1 = (com.bytedance.adsdk.ugeno.viewpager.ViewPager.xt) r1
            int r2 = r1.xt
            if (r2 != r4) goto L16
            return r1
        L16:
            int r0 = r0 + 1
            goto L1
        L19:
            r4 = 0
            return r4
    }

    com.bytedance.adsdk.ugeno.viewpager.ViewPager.xt xt(android.view.View r2) {
            r1 = this;
        L0:
            android.view.ViewParent r0 = r2.getParent()
            if (r0 == r1) goto L13
            if (r0 == 0) goto L11
            boolean r2 = r0 instanceof android.view.View
            if (r2 != 0) goto Ld
            goto L11
        Ld:
            r2 = r0
            android.view.View r2 = (android.view.View) r2
            goto L0
        L11:
            r2 = 0
            return r2
        L13:
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt r2 = r1.j(r2)
            return r2
    }

    void xt() {
            r9 = this;
            com.bytedance.adsdk.ugeno.viewpager.xt r0 = r9.cw
            int r0 = r0.j()
            r9.j = r0
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r1 = r9.ae
            int r1 = r1.size()
            int r2 = r9.a
            int r2 = r2 * 2
            r3 = 1
            int r2 = r2 + r3
            r4 = 0
            if (r1 >= r2) goto L21
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r1 = r9.ae
            int r1 = r1.size()
            if (r1 >= r0) goto L21
            r1 = 1
            goto L22
        L21:
            r1 = 0
        L22:
            int r2 = r9.f1998r
            r5 = 0
        L25:
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r6 = r9.ae
            int r6 = r6.size()
            if (r5 >= r6) goto L74
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r6 = r9.ae
            java.lang.Object r6 = r6.get(r5)
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt r6 = (com.bytedance.adsdk.ugeno.viewpager.ViewPager.xt) r6
            com.bytedance.adsdk.ugeno.viewpager.xt r7 = r9.cw
            java.lang.Object r8 = r6.j
            int r7 = r7.j(r8)
            r8 = -1
            if (r7 == r8) goto L72
            r8 = -2
            if (r7 != r8) goto L66
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r1 = r9.ae
            r1.remove(r5)
            int r5 = r5 + (-1)
            com.bytedance.adsdk.ugeno.viewpager.xt r1 = r9.cw
            int r7 = r6.xt
            java.lang.Object r8 = r6.j
            r1.j(r9, r7, r8)
            int r1 = r9.f1998r
            int r6 = r6.xt
            if (r1 != r6) goto L64
            int r2 = r0 + (-1)
            int r1 = java.lang.Math.min(r1, r2)
            int r1 = java.lang.Math.max(r4, r1)
            r2 = r1
        L64:
            r1 = 1
            goto L72
        L66:
            int r8 = r6.xt
            if (r8 == r7) goto L72
            int r1 = r9.f1998r
            if (r8 != r1) goto L6f
            r2 = r7
        L6f:
            r6.xt = r7
            goto L64
        L72:
            int r5 = r5 + r3
            goto L25
        L74:
            java.util.ArrayList<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r0 = r9.ae
            java.util.Comparator<com.bytedance.adsdk.ugeno.viewpager.ViewPager$xt> r5 = com.bytedance.adsdk.ugeno.viewpager.ViewPager.up
            java.util.Collections.sort(r0, r5)
            if (r1 == 0) goto L9e
            int r0 = r9.getChildCount()
            r1 = 0
        L82:
            if (r1 >= r0) goto L98
            android.view.View r5 = r9.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$cw r5 = (com.bytedance.adsdk.ugeno.viewpager.ViewPager.cw) r5
            boolean r6 = r5.j
            if (r6 != 0) goto L95
            r6 = 0
            r5.cw = r6
        L95:
            int r1 = r1 + 1
            goto L82
        L98:
            r9.j(r2, r4, r3)
            r9.requestLayout()
        L9e:
            return
    }
}
