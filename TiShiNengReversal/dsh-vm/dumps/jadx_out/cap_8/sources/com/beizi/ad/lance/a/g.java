package com.beizi.ad.lance.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class g {
    public g() {
            r1 = this;
            r1.<init>()
            return
    }

    private static int a(android.content.Context r1) {
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 == 0) goto L11
            android.app.Activity r1 = (android.app.Activity) r1
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.widthPixels
            return r1
        L11:
            r1 = 1080(0x438, float:1.513E-42)
            return r1
    }

    public static android.view.View a(int r1, android.view.View r2, android.view.View r3, java.lang.String r4) {
            if (r2 == 0) goto L8
            r0 = 1
            android.view.View r1 = a(r1, r3, r2, r4, r0)
            return r1
        L8:
            r1 = 0
            return r1
    }

    public static android.view.View a(int r23, android.view.View r24, android.view.View r25, java.lang.String r26, boolean r27) {
            r0 = r23
            r2 = r25
            r3 = r26
            if (r24 == 0) goto L437
            if (r2 != 0) goto Lc
            goto L437
        Lc:
            int r4 = r2.getWidth()
            int r5 = r2.getHeight()
            double r6 = (double) r0
            r8 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r6 = r6 / r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "width = "
            r8.append(r9)
            r8.append(r4)
            java.lang.String r9 = ",height = "
            r8.append(r9)
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "BeiZisAd"
            com.beizi.ad.lance.a.m.c(r9, r8)
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            r2.getHitRect(r8)
            r10 = 2
            int[] r11 = new int[r10]
            r2.getLocationOnScreen(r11)
            r12 = 0
            r13 = r11[r12]
            r14 = 1
            r11 = r11[r14]
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r10 = "delegateLeft = "
            r15.append(r10)
            r15.append(r13)
            java.lang.String r10 = ",delegateTop = "
            r15.append(r10)
            r15.append(r11)
            java.lang.String r10 = r15.toString()
            com.beizi.ad.lance.a.m.c(r9, r10)
            android.content.Context r10 = r2.getContext()
            int r10 = a(r10)
            android.content.Context r15 = r2.getContext()
            int r15 = b(r15)
            android.content.Context r16 = r2.getContext()
            int r16 = c(r16)
            int r15 = r15 + r16
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r12 = "screenWidth = "
            r14.append(r12)
            r14.append(r10)
            java.lang.String r12 = ",screenHeight = "
            r14.append(r12)
            r14.append(r15)
            java.lang.String r12 = r14.toString()
            com.beizi.ad.lance.a.m.c(r9, r12)
            r3.getClass()
            int r12 = r3.hashCode()
            java.lang.String r14 = "BOTTOM"
            java.lang.String r2 = "RIGHT"
            r18 = r6
            java.lang.String r6 = "LEFT"
            java.lang.String r7 = "TOP"
            r20 = -1
            switch(r12) {
                case -1196746574: goto L115;
                case -421184836: goto L109;
                case -166167065: goto Lfd;
                case 83253: goto Lf2;
                case 2332679: goto Le7;
                case 77974012: goto Ldc;
                case 1561222833: goto Lcf;
                case 1965067819: goto Lc4;
                case 1984282709: goto Lb4;
                default: goto Lb2;
            }
        Lb2:
            goto L120
        Lb4:
            java.lang.String r12 = "CENTER"
            boolean r12 = r3.equals(r12)
            if (r12 != 0) goto Lbe
            goto L120
        Lbe:
            r12 = 8
            r20 = 8
            goto L120
        Lc4:
            boolean r12 = r3.equals(r14)
            if (r12 != 0) goto Lcb
            goto L120
        Lcb:
            r12 = 7
            r20 = 7
            goto L120
        Lcf:
            java.lang.String r12 = "BOTTOMRIGHT"
            boolean r12 = r3.equals(r12)
            if (r12 != 0) goto Ld8
            goto L120
        Ld8:
            r12 = 6
            r20 = 6
            goto L120
        Ldc:
            boolean r12 = r3.equals(r2)
            if (r12 != 0) goto Le3
            goto L120
        Le3:
            r12 = 5
            r20 = 5
            goto L120
        Le7:
            boolean r12 = r3.equals(r6)
            if (r12 != 0) goto Lee
            goto L120
        Lee:
            r12 = 4
            r20 = 4
            goto L120
        Lf2:
            boolean r12 = r3.equals(r7)
            if (r12 != 0) goto Lf9
            goto L120
        Lf9:
            r12 = 3
            r20 = 3
            goto L120
        Lfd:
            java.lang.String r12 = "TOPRIGHT"
            boolean r12 = r3.equals(r12)
            if (r12 != 0) goto L106
            goto L120
        L106:
            r20 = 2
            goto L120
        L109:
            java.lang.String r12 = "TOPLEFT"
            boolean r12 = r3.equals(r12)
            if (r12 != 0) goto L112
            goto L120
        L112:
            r20 = 1
            goto L120
        L115:
            java.lang.String r12 = "BOTTOMLEFT"
            boolean r12 = r3.equals(r12)
            if (r12 != 0) goto L11e
            goto L120
        L11e:
            r20 = 0
        L120:
            r21 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            switch(r20) {
                case 0: goto L296;
                case 1: goto L271;
                case 2: goto L250;
                case 3: goto L22f;
                case 4: goto L20d;
                case 5: goto L1ec;
                case 6: goto L1c1;
                case 7: goto L19f;
                case 8: goto L136;
                default: goto L125;
            }
        L125:
            r27 = r2
            r16 = r4
            r18 = r5
            r20 = r6
            r6 = r13
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r12 = 0
            r13 = 0
            goto L2bf
        L136:
            double r18 = java.lang.Math.sqrt(r18)
            double r18 = r18 - r21
            r27 = r2
            double r1 = (double) r4
            double r1 = r1 * r18
            r20 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r1 = r1 / r20
            int r1 = (int) r1
            r12 = r1
            double r1 = (double) r5
            double r18 = r18 * r1
            double r1 = r18 / r20
            int r1 = (int) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r16 = r12
            java.lang.String r12 = "expandTop = "
            r2.append(r12)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            com.beizi.ad.lance.a.m.c(r9, r2)
            int r2 = r11 - r1
            r12 = 0
            int r2 = java.lang.Math.max(r12, r2)
            r18 = r1
            int r1 = r13 - r16
            int r1 = java.lang.Math.max(r12, r1)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r20 = r6
            java.lang.String r6 = "marginTop = "
            r12.append(r6)
            r12.append(r2)
            java.lang.String r6 = ",marginLeft = "
            r12.append(r6)
            r12.append(r1)
            java.lang.String r6 = r12.toString()
            com.beizi.ad.lance.a.m.c(r9, r6)
            r6 = r13
            r3 = r16
            r12 = r18
            r13 = r1
            r16 = r4
            r18 = r5
            r1 = r3
            r4 = r2
            r2 = r12
            goto L2bf
        L19f:
            r27 = r2
            r20 = r6
            double r1 = r18 - r21
            r18 = r1
            double r1 = (double) r5
            double r1 = r1 * r18
            int r1 = (int) r1
            r12 = 0
            int r17 = java.lang.Math.max(r12, r11)
            int r2 = java.lang.Math.max(r12, r13)
            r16 = r4
            r18 = r5
            r6 = r13
            r4 = r17
            r3 = 0
            r13 = r2
            r2 = r1
            r1 = 0
            goto L2bf
        L1c1:
            r27 = r2
            r20 = r6
            r12 = 0
            double r1 = java.lang.Math.sqrt(r18)
            double r1 = r1 - r21
            r6 = r13
            double r12 = (double) r4
            double r12 = r12 * r1
            int r12 = (int) r12
            r18 = r1
            double r1 = (double) r5
            double r1 = r1 * r18
            int r1 = (int) r1
            r2 = 0
            int r17 = java.lang.Math.max(r2, r11)
            int r13 = java.lang.Math.max(r2, r6)
            r2 = r1
            r16 = r4
            r18 = r5
            r3 = r12
            r4 = r17
            r1 = 0
            r12 = 0
            goto L2bf
        L1ec:
            r27 = r2
            r20 = r6
            r6 = r13
            r2 = 0
            double r12 = r18 - r21
            double r2 = (double) r4
            double r12 = r12 * r2
            int r1 = (int) r12
            r12 = 0
            int r17 = java.lang.Math.max(r12, r11)
            int r2 = java.lang.Math.max(r12, r6)
            r3 = r1
        L202:
            r13 = r2
            r16 = r4
            r18 = r5
            r4 = r17
            r1 = 0
            r2 = 0
            goto L2bf
        L20d:
            r27 = r2
            r20 = r6
            r6 = r13
            r12 = 0
            double r1 = r18 - r21
            double r12 = (double) r4
            double r1 = r1 * r12
            int r1 = (int) r1
            r12 = 0
            int r17 = java.lang.Math.max(r12, r11)
            int r13 = r6 - r1
            int r2 = java.lang.Math.max(r12, r13)
            r13 = r2
        L225:
            r16 = r4
            r18 = r5
            r4 = r17
        L22b:
            r2 = 0
        L22c:
            r3 = 0
            goto L2bf
        L22f:
            r27 = r2
            r20 = r6
            r6 = r13
            r12 = 0
            double r1 = r18 - r21
            double r12 = (double) r5
            double r1 = r1 * r12
            int r1 = (int) r1
            int r2 = r11 - r1
            r12 = 0
            int r17 = java.lang.Math.max(r12, r2)
            int r2 = java.lang.Math.max(r12, r6)
            r12 = r1
            r13 = r2
            r16 = r4
            r18 = r5
            r4 = r17
            r1 = 0
            goto L22b
        L250:
            r27 = r2
            r20 = r6
            r6 = r13
            r12 = 0
            double r1 = java.lang.Math.sqrt(r18)
            double r1 = r1 - r21
            double r12 = (double) r4
            double r12 = r12 * r1
            int r3 = (int) r12
            double r12 = (double) r5
            double r1 = r1 * r12
            int r1 = (int) r1
            int r2 = r11 - r1
            r12 = 0
            int r17 = java.lang.Math.max(r12, r2)
            int r2 = java.lang.Math.max(r12, r6)
            r12 = r1
            goto L202
        L271:
            r27 = r2
            r20 = r6
            r6 = r13
            r12 = 0
            double r1 = java.lang.Math.sqrt(r18)
            double r1 = r1 - r21
            double r12 = (double) r4
            double r12 = r12 * r1
            int r3 = (int) r12
            double r12 = (double) r5
            double r1 = r1 * r12
            int r1 = (int) r1
            int r2 = r11 - r1
            r12 = 0
            int r17 = java.lang.Math.max(r12, r2)
            int r13 = r6 - r3
            int r2 = java.lang.Math.max(r12, r13)
            r12 = r1
            r13 = r2
            r1 = r3
            goto L225
        L296:
            r27 = r2
            r20 = r6
            r6 = r13
            r12 = 0
            double r1 = java.lang.Math.sqrt(r18)
            double r1 = r1 - r21
            double r12 = (double) r4
            double r12 = r12 * r1
            int r3 = (int) r12
            double r12 = (double) r5
            double r1 = r1 * r12
            int r1 = (int) r1
            r12 = 0
            int r2 = java.lang.Math.max(r12, r11)
            int r13 = r6 - r3
            int r13 = java.lang.Math.max(r12, r13)
            r16 = r4
            r18 = r5
            r12 = 0
            r4 = r2
            r2 = r1
            r1 = r3
            goto L22c
        L2bf:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r19 = r6
            java.lang.String r6 = "area = "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r0 = ",expandLeft = "
            r5.append(r0)
            r5.append(r1)
            java.lang.String r0 = ",expandTop = "
            r5.append(r0)
            r5.append(r12)
            java.lang.String r0 = ",expandRight = "
            r5.append(r0)
            r5.append(r3)
            java.lang.String r0 = ",expandBottom = "
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = r5.toString()
            com.beizi.ad.lance.a.m.c(r9, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "delegateArea old = "
            r0.append(r5)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.beizi.ad.lance.a.m.c(r9, r0)
            r0 = 0
            int r5 = java.lang.Math.max(r13, r0)
            int r6 = java.lang.Math.min(r0, r10)
            int r4 = java.lang.Math.max(r4, r0)
            int r13 = java.lang.Math.min(r0, r15)
            int r0 = r8.left
            int r0 = r0 - r1
            r8.left = r0
            int r0 = r8.top
            int r0 = r0 - r12
            r8.top = r0
            int r0 = r8.right
            int r0 = r0 + r3
            r8.right = r0
            int r0 = r8.bottom
            int r0 = r0 + r2
            r8.bottom = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "delegateArea new = "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.beizi.ad.lance.a.m.c(r9, r0)
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            android.content.Context r1 = r25.getContext()
            r0.<init>(r1)
            int r1 = r8.right
            int r2 = r8.left
            int r1 = r1 - r2
            int r2 = r8.bottom
            int r3 = r8.top
            int r2 = r2 - r3
            r3 = r26
            boolean r7 = r3.contains(r7)
            if (r7 == 0) goto L362
            int r12 = r11 + r18
        L35f:
            r7 = r20
            goto L36e
        L362:
            boolean r7 = r3.contains(r14)
            if (r7 == 0) goto L36b
            int r12 = r15 - r11
            goto L35f
        L36b:
            r7 = r20
            r12 = 0
        L36e:
            boolean r7 = r3.contains(r7)
            if (r7 == 0) goto L377
            int r3 = r19 + r16
            goto L383
        L377:
            r7 = r27
            boolean r3 = r3.contains(r7)
            if (r3 == 0) goto L382
            int r3 = r10 - r19
            goto L383
        L382:
            r3 = 0
        L383:
            if (r12 == 0) goto L389
            int r2 = java.lang.Math.min(r2, r12)
        L389:
            if (r3 == 0) goto L38f
            int r1 = java.lang.Math.min(r1, r3)
        L38f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "fHeight = "
            r7.append(r8)
            r7.append(r2)
            java.lang.String r8 = ",remainHeight = "
            r7.append(r8)
            r7.append(r12)
            java.lang.String r8 = ",fWidth = "
            r7.append(r8)
            r7.append(r1)
            java.lang.String r8 = ",remainWidth = "
            r7.append(r8)
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            com.beizi.ad.lance.a.m.c(r9, r3)
            r12 = 0
            r0.setBackgroundColor(r12)
            r3 = r24
            boolean r7 = r3 instanceof android.view.ViewGroup
            if (r7 == 0) goto L436
            android.view.View r3 = r3.getRootView()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "rootView = "
            r7.append(r8)
            r7.append(r3)
            java.lang.String r7 = r7.toString()
            com.beizi.ad.lance.a.m.c(r9, r7)
            boolean r7 = r3 instanceof android.view.ViewGroup
            if (r7 == 0) goto L436
            android.widget.FrameLayout$LayoutParams r7 = new android.widget.FrameLayout$LayoutParams
            r7.<init>(r1, r2)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "marginLeft = "
            r8.append(r10)
            r8.append(r5)
            java.lang.String r10 = ",marginTop = "
            r8.append(r10)
            r8.append(r4)
            java.lang.String r10 = ",marginRight = "
            r8.append(r10)
            r8.append(r6)
            java.lang.String r10 = ",marginBottom = "
            r8.append(r10)
            r8.append(r13)
            java.lang.String r8 = r8.toString()
            com.beizi.ad.lance.a.m.c(r9, r8)
            r7.setMargins(r5, r4, r6, r13)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r3.addView(r0, r7)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "fWidth = "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = ",fHeight = "
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            com.beizi.ad.lance.a.m.c(r9, r1)
        L436:
            return r0
        L437:
            r0 = 0
            return r0
    }

    private static int b(android.content.Context r1) {
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 == 0) goto L11
            android.app.Activity r1 = (android.app.Activity) r1
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.heightPixels
            return r1
        L11:
            r1 = 1920(0x780, float:2.69E-42)
            return r1
    }

    private static int c(android.content.Context r3) {
            boolean r0 = r3 instanceof android.app.Activity
            if (r0 == 0) goto L2f
            android.app.Activity r3 = (android.app.Activity) r3
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r0 = "dimen"
            java.lang.String r1 = "android"
            java.lang.String r2 = "status_bar_height"
            int r0 = r3.getIdentifier(r2, r0, r1)
            int r3 = r3.getDimensionPixelSize(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Status height:"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "BeiZisAd"
            com.beizi.ad.lance.a.m.c(r1, r0)
            return r3
        L2f:
            r3 = 0
            return r3
    }
}
