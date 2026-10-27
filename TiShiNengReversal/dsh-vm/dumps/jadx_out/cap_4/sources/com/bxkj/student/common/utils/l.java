package com.bxkj.student.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class l {
    public l() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int a(android.content.res.Resources r2, java.lang.String r3) {
            java.lang.String r0 = "dimen"
            java.lang.String r1 = "android"
            int r3 = r2.getIdentifier(r3, r0, r1)
            if (r3 <= 0) goto Lf
            int r2 = r2.getDimensionPixelSize(r3)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    @android.annotation.TargetApi(19)
    public static void b(android.app.Activity r4, int r5) {
            android.view.Window r0 = r4.getWindow()
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r0.addFlags(r1)
            android.view.Window r0 = r4.getWindow()
            android.view.View r0 = r0.getDecorView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r0.findViewById(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r2 = 0
            android.view.View r1 = r1.getChildAt(r2)
            r2 = 1
            r1.setFitsSystemWindows(r2)
            android.view.View r1 = new android.view.View
            r1.<init>(r4)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r3 = "status_bar_height"
            int r4 = a(r4, r3)
            r3 = -1
            r2.<init>(r3, r4)
            r4 = 48
            r2.gravity = r4
            r1.setLayoutParams(r2)
            r1.setBackgroundColor(r5)
            r0.addView(r1)
            return
    }

    @android.annotation.TargetApi(19)
    public static void c(android.app.Activity r4, int r5) {
            android.view.Window r0 = r4.getWindow()
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r0.addFlags(r1)
            android.view.Window r0 = r4.getWindow()
            android.view.View r0 = r0.getDecorView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r0.findViewById(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r2 = 0
            android.view.View r1 = r1.getChildAt(r2)
            r2 = 1
            r1.setFitsSystemWindows(r2)
            android.view.View r1 = new android.view.View
            r1.<init>(r4)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r3 = "status_bar_height"
            int r4 = a(r4, r3)
            r3 = -1
            r2.<init>(r3, r4)
            r4 = 48
            r2.gravity = r4
            r1.setLayoutParams(r2)
            r1.setBackgroundResource(r5)
            r0.addView(r1)
            return
    }

    public static void d(android.app.Activity r2) {
            android.view.Window r0 = r2.getWindow()
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r0.addFlags(r1)
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r2 = r2.findViewById(r0)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0 = 0
            android.view.View r2 = r2.getChildAt(r0)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0 = 1
            r2.setFitsSystemWindows(r0)
            r2.setClipToPadding(r0)
            return
    }
}
