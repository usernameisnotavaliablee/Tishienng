package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class f3 {
    public static com.acse.ottn.f3 a = null;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f2326b = "OpenMobileLocationPermissionUtil";

    static {
            return
    }

    public f3() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.acse.ottn.f3 a() {
            com.acse.ottn.f3 r0 = com.acse.ottn.f3.a
            if (r0 != 0) goto L19
            java.lang.Class<com.acse.ottn.f3> r0 = com.acse.ottn.f3.class
            monitor-enter(r0)
            com.acse.ottn.f3 r1 = com.acse.ottn.f3.a     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.acse.ottn.f3 r1 = new com.acse.ottn.f3     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.acse.ottn.f3.a = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.acse.ottn.f3 r0 = com.acse.ottn.f3.a
            return r0
    }

    public boolean a(android.accessibilityservice.AccessibilityService r10, java.lang.String r11) {
            r9 = this;
            java.lang.String r0 = com.acse.ottn.f3.f2326b
            java.lang.String r1 = "openPermission"
            com.acse.ottn.h2.a(r0, r1)
            java.lang.String r0 = "com.android"
            boolean r0 = r11.contains(r0)
            if (r0 == 0) goto L293
            java.lang.String r0 = ".ui.GrantPermissionsActivity"
            boolean r11 = r11.contains(r0)
            if (r11 == 0) goto L293
            com.acse.ottn.d r11 = com.acse.ottn.d.d()
            r11.e(r10)
            com.acse.ottn.n3 r11 = com.acse.ottn.n3.a()
            java.lang.String r0 = "battery_white"
            boolean r11 = r11.a(r0)
            r1 = 1
            if (r11 != 0) goto L2c
            return r1
        L2c:
            com.acse.ottn.n3 r11 = com.acse.ottn.n3.a()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r11.a(r0, r2)
            com.acse.ottn.b r11 = com.acse.ottn.b.c()
            r2 = 300(0x12c, double:1.48E-321)
            r11.a(r2)
            com.acse.ottn.n3 r11 = com.acse.ottn.n3.a()
            java.lang.String r2 = "location_permission_state"
            java.lang.String r11 = r11.e(r2)
            java.lang.String r2 = "1"
            boolean r2 = r11.equals(r2)
            java.lang.String r3 = "允许"
            if (r2 == 0) goto Lf0
            com.acse.ottn.b r11 = com.acse.ottn.b.c()
            java.lang.String r0 = "允许本次使用"
            android.view.accessibility.AccessibilityNodeInfo r11 = r11.a(r10, r0, r1)
            if (r11 == 0) goto L66
            com.acse.ottn.b r10 = com.acse.ottn.b.c()
            r10.g(r11)
            return r1
        L66:
            com.acse.ottn.b r11 = com.acse.ottn.b.c()
            java.lang.String r0 = "仅在使用中允许"
            android.view.accessibility.AccessibilityNodeInfo r11 = r11.a(r10, r0, r1)
            if (r11 == 0) goto L7a
            com.acse.ottn.b r10 = com.acse.ottn.b.c()
            r10.g(r11)
            return r1
        L7a:
            com.acse.ottn.b r11 = com.acse.ottn.b.c()
            java.lang.String r0 = "仅使用期间允许"
            android.view.accessibility.AccessibilityNodeInfo r11 = r11.a(r10, r0, r1)
            if (r11 == 0) goto L8e
            com.acse.ottn.b r10 = com.acse.ottn.b.c()
            r10.g(r11)
            return r1
        L8e:
            com.acse.ottn.b r11 = com.acse.ottn.b.c()
            java.lang.String r0 = "本次使用允许"
            android.view.accessibility.AccessibilityNodeInfo r11 = r11.a(r10, r0, r1)
            if (r11 == 0) goto La2
            com.acse.ottn.b r10 = com.acse.ottn.b.c()
            r10.g(r11)
            return r1
        La2:
            com.acse.ottn.b r11 = com.acse.ottn.b.c()
            java.lang.String r0 = "本次运行允许"
            android.view.accessibility.AccessibilityNodeInfo r11 = r11.a(r10, r0, r1)
            if (r11 == 0) goto Lb6
            com.acse.ottn.b r10 = com.acse.ottn.b.c()
            r10.g(r11)
            return r1
        Lb6:
            com.acse.ottn.b r11 = com.acse.ottn.b.c()
            java.lang.String r0 = "本次使用时允许"
            android.view.accessibility.AccessibilityNodeInfo r11 = r11.a(r10, r0, r1)
            if (r11 == 0) goto Lca
            com.acse.ottn.b r10 = com.acse.ottn.b.c()
            r10.g(r11)
            return r1
        Lca:
            com.acse.ottn.b r11 = com.acse.ottn.b.c()
            java.lang.String r0 = "仅本次使用时允许"
            android.view.accessibility.AccessibilityNodeInfo r11 = r11.a(r10, r0, r1)
            if (r11 == 0) goto Lde
            com.acse.ottn.b r10 = com.acse.ottn.b.c()
            r10.g(r11)
            return r1
        Lde:
            com.acse.ottn.b r11 = com.acse.ottn.b.c()
            android.view.accessibility.AccessibilityNodeInfo r10 = r11.a(r10, r3, r1)
            if (r10 == 0) goto L292
            com.acse.ottn.b r11 = com.acse.ottn.b.c()
            r11.g(r10)
            return r1
        Lf0:
            java.lang.String r2 = "2"
            boolean r11 = r11.equals(r2)
            if (r11 == 0) goto L292
            com.acse.ottn.b r11 = com.acse.ottn.b.c()
            java.lang.String r2 = "权限管理"
            android.view.accessibility.AccessibilityNodeInfo r11 = r11.h(r10, r2)
            java.lang.String r2 = "点击了"
            r4 = 24
            java.lang.String r5 = "x="
            if (r11 == 0) goto L14f
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            r11.getBoundsInScreen(r6)
            int r11 = r6.left
            int r7 = r6.right
            int r11 = r11 + r7
            int r11 = r11 / 2
            java.lang.String r7 = com.acse.ottn.f3.f2326b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            com.acse.ottn.h2.a(r7, r8)
            int r7 = r6.bottom
            int r6 = r6.top
            int r7 = r7 - r6
            int r7 = r7 / 2
            int r7 = r7 + r6
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r4) goto L14f
            com.acse.ottn.n3 r3 = com.acse.ottn.n3.a()
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r3.a(r0, r4)
            com.acse.ottn.b r0 = com.acse.ottn.b.c()     // Catch: java.lang.Throwable -> L149
            r0.a(r10, r11, r7)     // Catch: java.lang.Throwable -> L149
        L149:
            java.lang.String r10 = com.acse.ottn.f3.f2326b
            com.acse.ottn.h2.a(r10, r2)
            return r1
        L14f:
            com.acse.ottn.b r11 = com.acse.ottn.b.c()
            java.lang.String r6 = "始终允许"
            android.view.accessibility.AccessibilityNodeInfo r11 = r11.h(r10, r6)
            if (r11 == 0) goto L1e2
            java.lang.CharSequence r7 = r11.getText()
            if (r7 == 0) goto L1e2
            java.lang.String r7 = com.acse.ottn.f3.f2326b
            java.lang.String r8 = r11.toString()
            com.acse.ottn.h2.a(r7, r8)
            java.lang.CharSequence r7 = r11.getText()
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L17c
            com.acse.ottn.b r10 = com.acse.ottn.b.c()
            r10.g(r11)
            return r1
        L17c:
            java.lang.CharSequence r6 = r11.getText()
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "若同意，您可以去设置为始终允许。"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L1e2
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r11.getBoundsInScreen(r3)
            int r11 = r3.right
            int r6 = r3.left
            int r11 = r11 - r6
            java.lang.String r6 = com.acse.ottn.f3.f2326b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            r7.append(r11)
            java.lang.String r5 = r7.toString()
            com.acse.ottn.h2.a(r6, r5)
            int r5 = r3.bottom
            int r3 = r3.top
            int r5 = r5 - r3
            int r5 = r5 / 2
            int r5 = r5 + r3
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r4) goto L1e1
            com.acse.ottn.b r3 = com.acse.ottn.b.c()
            boolean r3 = r3.a(r10, r11, r5)
            if (r3 == 0) goto L1d3
            com.acse.ottn.b r3 = com.acse.ottn.b.c()
            r6 = 1000(0x3e8, double:4.94E-321)
            r3.a(r6)
            com.acse.ottn.b r3 = com.acse.ottn.b.c()
            r3.a(r10, r11, r5)
        L1d3:
            java.lang.String r10 = com.acse.ottn.f3.f2326b
            com.acse.ottn.h2.a(r10, r2)
            com.acse.ottn.n3 r10 = com.acse.ottn.n3.a()
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            r10.a(r0, r11)
        L1e1:
            return r1
        L1e2:
            com.acse.ottn.b r11 = com.acse.ottn.b.c()
            java.lang.String r6 = "在“设置”中允许"
            android.view.accessibility.AccessibilityNodeInfo r11 = r11.h(r10, r6)
            if (r11 == 0) goto L234
            java.lang.String r3 = com.acse.ottn.f3.f2326b
            com.acse.ottn.h2.a(r3, r6)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r11.getBoundsInScreen(r3)
            int r11 = r3.left
            int r6 = r3.right
            int r11 = r11 + r6
            int r11 = r11 / 2
            java.lang.String r6 = com.acse.ottn.f3.f2326b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            r7.append(r11)
            java.lang.String r5 = r7.toString()
            com.acse.ottn.h2.a(r6, r5)
            int r3 = r3.bottom
            int r3 = r3 + (-30)
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 < r4) goto L233
            com.acse.ottn.b r4 = com.acse.ottn.b.c()
            r4.a(r10, r11, r3)
            java.lang.String r10 = com.acse.ottn.f3.f2326b
            com.acse.ottn.h2.a(r10, r2)
            com.acse.ottn.n3 r10 = com.acse.ottn.n3.a()
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            r10.a(r0, r11)
        L233:
            return r1
        L234:
            com.acse.ottn.b r11 = com.acse.ottn.b.c()
            java.lang.String r6 = "去设为始终允许"
            android.view.accessibility.AccessibilityNodeInfo r11 = r11.h(r10, r6)
            if (r11 == 0) goto L281
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r11.getBoundsInScreen(r3)
            int r11 = r3.left
            int r6 = r3.right
            int r11 = r11 + r6
            int r11 = r11 / 2
            java.lang.String r6 = com.acse.ottn.f3.f2326b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            r7.append(r11)
            java.lang.String r5 = r7.toString()
            com.acse.ottn.h2.a(r6, r5)
            int r3 = r3.bottom
            int r3 = r3 + (-30)
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 < r4) goto L280
            com.acse.ottn.b r4 = com.acse.ottn.b.c()
            r4.a(r10, r11, r3)
            java.lang.String r10 = com.acse.ottn.f3.f2326b
            com.acse.ottn.h2.a(r10, r2)
            com.acse.ottn.n3 r10 = com.acse.ottn.n3.a()
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            r10.a(r0, r11)
        L280:
            return r1
        L281:
            com.acse.ottn.b r11 = com.acse.ottn.b.c()
            android.view.accessibility.AccessibilityNodeInfo r10 = r11.a(r10, r3, r1)
            if (r10 == 0) goto L292
            com.acse.ottn.b r11 = com.acse.ottn.b.c()
            r11.g(r10)
        L292:
            return r1
        L293:
            r10 = 0
            return r10
    }

    public final java.lang.Object b() throws java.io.ObjectStreamException {
            r1 = this;
            com.acse.ottn.f3 r0 = com.acse.ottn.f3.a
            return r0
    }
}
