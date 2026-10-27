package com.beizi.fusion.tool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ar {
    public ar() {
            r1 = this;
            r1.<init>()
            return
    }

    public static boolean a(android.view.View r7) {
            r0 = 0
            if (r7 == 0) goto L50
            int r1 = r7.getVisibility()
            if (r1 != 0) goto L50
            android.view.ViewParent r1 = r7.getParent()
            if (r1 != 0) goto L10
            goto L50
        L10:
            com.beizi.fusion.c.b r1 = com.beizi.fusion.c.b.a()
            boolean r1 = r1.m()
            if (r1 != 0) goto L21
            boolean r1 = r7.hasWindowFocus()
            if (r1 != 0) goto L21
            return r0
        L21:
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            boolean r2 = r7.getGlobalVisibleRect(r1)
            if (r2 != 0) goto L2d
            return r0
        L2d:
            int r2 = r1.height()
            int r1 = r1.width()
            int r2 = r2 * r1
            int r1 = r7.getHeight()
            int r7 = r7.getWidth()
            int r1 = r1 * r7
            double r3 = (double) r1
            r5 = 4606732058837280358(0x3fee666666666666, double:0.95)
            double r3 = r3 * r5
            int r7 = (int) r3
            if (r7 <= 0) goto L50
            if (r2 < r7) goto L50
            r7 = 1
            return r7
        L50:
            return r0
    }

    public static boolean a(android.view.View r5, double r6) {
            r0 = 0
            if (r5 == 0) goto L40
            int r1 = r5.getVisibility()
            if (r1 != 0) goto L40
            android.view.ViewParent r1 = r5.getParent()
            if (r1 == 0) goto L40
            boolean r1 = r5.hasWindowFocus()
            if (r1 != 0) goto L16
            goto L40
        L16:
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            boolean r2 = r5.getGlobalVisibleRect(r1)
            if (r2 != 0) goto L22
            return r0
        L22:
            int r2 = r1.height()
            int r1 = r1.width()
            int r2 = r2 * r1
            int r1 = r5.getHeight()
            int r5 = r5.getWidth()
            int r1 = r1 * r5
            double r3 = (double) r1
            double r3 = r3 * r6
            int r5 = (int) r3
            if (r5 <= 0) goto L40
            if (r2 < r5) goto L40
            r5 = 1
            return r5
        L40:
            return r0
    }

    public static boolean b(android.view.View r3) {
            r0 = 0
            if (r3 == 0) goto L32
            r1 = 1
            int r2 = r3.getVisibility()     // Catch: java.lang.Exception -> L31
            if (r2 != 0) goto L32
            android.view.ViewParent r2 = r3.getParent()     // Catch: java.lang.Exception -> L31
            if (r2 == 0) goto L32
            boolean r2 = r3.hasWindowFocus()     // Catch: java.lang.Exception -> L31
            if (r2 != 0) goto L17
            goto L32
        L17:
            android.graphics.Rect r2 = new android.graphics.Rect     // Catch: java.lang.Exception -> L31
            r2.<init>()     // Catch: java.lang.Exception -> L31
            boolean r3 = r3.getGlobalVisibleRect(r2)     // Catch: java.lang.Exception -> L31
            if (r3 != 0) goto L23
            return r0
        L23:
            int r3 = r2.height()     // Catch: java.lang.Exception -> L31
            int r2 = r2.width()     // Catch: java.lang.Exception -> L31
            int r3 = r3 * r2
            if (r3 <= 0) goto L30
            return r1
        L30:
            return r0
        L31:
            return r1
        L32:
            return r0
    }
}
