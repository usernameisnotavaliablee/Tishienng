package com.bxkj.student.v2.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class d {
    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(com.google.android.material.bottomnavigation.BottomNavigationView r8, java.lang.String[] r9) {
            r0 = 0
            android.view.View r1 = r8.getChildAt(r0)
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r1 = (com.google.android.material.bottomnavigation.BottomNavigationMenuView) r1
            if (r1 != 0) goto Lf
            java.lang.String r8 = "BottomNavigationViewHelper.replaceItemImage menuView==null为空"
            com.orhanobut.logger.j.c(r8)
            return
        Lf:
            com.bumptech.glide.request.h r2 = com.bumptech.glide.request.h.V0()
            r3 = 0
        L14:
            int r4 = r1.getChildCount()     // Catch: java.lang.Exception -> L99
            if (r3 >= r4) goto L99
            android.view.View r4 = r1.getChildAt(r3)     // Catch: java.lang.Exception -> L99
            com.google.android.material.bottomnavigation.BottomNavigationItemView r4 = (com.google.android.material.bottomnavigation.BottomNavigationItemView) r4     // Catch: java.lang.Exception -> L99
            r5 = 2131298231(0x7f0907b7, float:1.821443E38)
            android.view.View r4 = r4.findViewById(r5)     // Catch: java.lang.Exception -> L99
            android.widget.ImageView r4 = (android.widget.ImageView) r4     // Catch: java.lang.Exception -> L99
            if (r4 != 0) goto L33
            java.lang.String r8 = "BottomNavigationItemView-icon为空"
            java.lang.Object[] r9 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L99
            com.orhanobut.logger.j.e(r8, r9)     // Catch: java.lang.Exception -> L99
            return
        L33:
            r5 = r9[r3]     // Catch: java.lang.Exception -> L99
            java.lang.String r6 = "http"
            boolean r5 = r5.startsWith(r6)     // Catch: java.lang.Exception -> L99
            if (r5 == 0) goto L53
            android.content.Context r5 = r8.getContext()     // Catch: java.lang.Exception -> L99
            com.bumptech.glide.i r5 = com.bumptech.glide.b.D(r5)     // Catch: java.lang.Exception -> L99
            r6 = r9[r3]     // Catch: java.lang.Exception -> L99
            com.bumptech.glide.h r5 = r5.M(r6)     // Catch: java.lang.Exception -> L99
            com.bumptech.glide.h r5 = r5.V0(r2)     // Catch: java.lang.Exception -> L99
            r5.m1(r4)     // Catch: java.lang.Exception -> L99
            goto L95
        L53:
            r5 = r9[r3]     // Catch: java.lang.Exception -> L99
            java.lang.String r6 = "/"
            boolean r5 = r5.startsWith(r6)     // Catch: java.lang.Exception -> L99
            if (r5 == 0) goto L78
            android.content.Context r5 = r8.getContext()     // Catch: java.lang.Exception -> L99
            com.bumptech.glide.i r5 = com.bumptech.glide.b.D(r5)     // Catch: java.lang.Exception -> L99
            java.io.File r6 = new java.io.File     // Catch: java.lang.Exception -> L99
            r7 = r9[r3]     // Catch: java.lang.Exception -> L99
            r6.<init>(r7)     // Catch: java.lang.Exception -> L99
            com.bumptech.glide.h r5 = r5.J(r6)     // Catch: java.lang.Exception -> L99
            com.bumptech.glide.h r5 = r5.V0(r2)     // Catch: java.lang.Exception -> L99
            r5.m1(r4)     // Catch: java.lang.Exception -> L99
            goto L95
        L78:
            android.content.Context r5 = r8.getContext()     // Catch: java.lang.Exception -> L99
            com.bumptech.glide.i r5 = com.bumptech.glide.b.D(r5)     // Catch: java.lang.Exception -> L99
            r6 = r9[r3]     // Catch: java.lang.Exception -> L99
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.Exception -> L99
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L99
            com.bumptech.glide.h r5 = r5.K(r6)     // Catch: java.lang.Exception -> L99
            com.bumptech.glide.h r5 = r5.V0(r2)     // Catch: java.lang.Exception -> L99
            r5.m1(r4)     // Catch: java.lang.Exception -> L99
        L95:
            int r3 = r3 + 1
            goto L14
        L99:
            return
    }

    public static void b(com.google.android.material.bottomnavigation.BottomNavigationView r1, int r2, @androidx.annotation.DrawableRes int r3, java.lang.String r4) {
            r0 = 0
            android.view.View r0 = r1.getChildAt(r0)
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r0 = (com.google.android.material.bottomnavigation.BottomNavigationMenuView) r0
            android.view.View r2 = r0.getChildAt(r2)     // Catch: java.lang.Exception -> L31
            com.google.android.material.bottomnavigation.BottomNavigationItemView r2 = (com.google.android.material.bottomnavigation.BottomNavigationItemView) r2     // Catch: java.lang.Exception -> L31
            r0 = 2131297052(0x7f09031c, float:1.8212038E38)
            android.view.View r2 = r2.findViewById(r0)     // Catch: java.lang.Exception -> L31
            android.widget.ImageView r2 = (android.widget.ImageView) r2     // Catch: java.lang.Exception -> L31
            android.content.Context r1 = r1.getContext()     // Catch: java.lang.Exception -> L31
            com.bumptech.glide.i r1 = com.bumptech.glide.b.D(r1)     // Catch: java.lang.Exception -> L31
            com.bumptech.glide.h r1 = r1.M(r4)     // Catch: java.lang.Exception -> L31
            com.bumptech.glide.request.a r1 = r1.y0(r3)     // Catch: java.lang.Exception -> L31
            com.bumptech.glide.h r1 = (com.bumptech.glide.h) r1     // Catch: java.lang.Exception -> L31
            com.bumptech.glide.request.a r1 = r1.z(r3)     // Catch: java.lang.Exception -> L31
            com.bumptech.glide.h r1 = (com.bumptech.glide.h) r1     // Catch: java.lang.Exception -> L31
            r1.m1(r2)     // Catch: java.lang.Exception -> L31
        L31:
            return
    }

    public static void c(com.google.android.material.bottomnavigation.BottomNavigationView r3, int r4) {
            r0 = 0
            android.view.View r3 = r3.getChildAt(r0)
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r3 = (com.google.android.material.bottomnavigation.BottomNavigationMenuView) r3
        L7:
            int r1 = r3.getChildCount()     // Catch: java.lang.Exception -> L2a
            if (r0 >= r1) goto L2a
            android.view.View r1 = r3.getChildAt(r0)     // Catch: java.lang.Exception -> L2a
            com.google.android.material.bottomnavigation.BottomNavigationItemView r1 = (com.google.android.material.bottomnavigation.BottomNavigationItemView) r1     // Catch: java.lang.Exception -> L2a
            r2 = 2131297052(0x7f09031c, float:1.8212038E38)
            android.view.View r1 = r1.findViewById(r2)     // Catch: java.lang.Exception -> L2a
            android.widget.ImageView r1 = (android.widget.ImageView) r1     // Catch: java.lang.Exception -> L2a
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()     // Catch: java.lang.Exception -> L2a
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2     // Catch: java.lang.Exception -> L2a
            r2.topMargin = r4     // Catch: java.lang.Exception -> L2a
            r1.setLayoutParams(r2)     // Catch: java.lang.Exception -> L2a
            int r0 = r0 + 1
            goto L7
        L2a:
            return
    }

    public static void d(com.google.android.material.bottomnavigation.BottomNavigationView r3, int r4, int r5) {
            r0 = 0
            android.view.View r3 = r3.getChildAt(r0)
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r3 = (com.google.android.material.bottomnavigation.BottomNavigationMenuView) r3
        L7:
            int r1 = r3.getChildCount()     // Catch: java.lang.Exception -> L2a
            if (r0 >= r1) goto L2a
            android.view.View r1 = r3.getChildAt(r0)     // Catch: java.lang.Exception -> L2a
            com.google.android.material.bottomnavigation.BottomNavigationItemView r1 = (com.google.android.material.bottomnavigation.BottomNavigationItemView) r1     // Catch: java.lang.Exception -> L2a
            r2 = 2131297052(0x7f09031c, float:1.8212038E38)
            android.view.View r1 = r1.findViewById(r2)     // Catch: java.lang.Exception -> L2a
            android.widget.ImageView r1 = (android.widget.ImageView) r1     // Catch: java.lang.Exception -> L2a
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()     // Catch: java.lang.Exception -> L2a
            r2.height = r4     // Catch: java.lang.Exception -> L2a
            r2.width = r5     // Catch: java.lang.Exception -> L2a
            r1.setLayoutParams(r2)     // Catch: java.lang.Exception -> L2a
            int r0 = r0 + 1
            goto L7
        L2a:
            return
    }
}
