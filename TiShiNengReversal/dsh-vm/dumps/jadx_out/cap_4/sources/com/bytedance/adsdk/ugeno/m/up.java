package com.bytedance.adsdk.ugeno.m;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class up {
    private static java.lang.reflect.Field j;
    private static boolean xt;

    public up() {
            r1 = this;
            r1.<init>()
            return
    }

    public static android.graphics.drawable.Drawable j(android.widget.CompoundButton r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            android.graphics.drawable.Drawable r4 = s0.a.a(r4)
            return r4
        Lb:
            boolean r0 = com.bytedance.adsdk.ugeno.m.up.xt
            java.lang.String r1 = "CompoundButtonCompat"
            if (r0 != 0) goto L28
            r0 = 1
            java.lang.Class<android.widget.CompoundButton> r2 = android.widget.CompoundButton.class
            java.lang.String r3 = "mButtonDrawable"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.NoSuchFieldException -> L20
            com.bytedance.adsdk.ugeno.m.up.j = r2     // Catch: java.lang.NoSuchFieldException -> L20
            r2.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L20
            goto L26
        L20:
            r2 = move-exception
            java.lang.String r3 = "Failed to retrieve mButtonDrawable field"
            com.bytedance.sdk.component.utils.vl.j(r1, r3, r2)
        L26:
            com.bytedance.adsdk.ugeno.m.up.xt = r0
        L28:
            java.lang.reflect.Field r0 = com.bytedance.adsdk.ugeno.m.up.j
            r2 = 0
            if (r0 == 0) goto L3c
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.IllegalAccessException -> L34
            android.graphics.drawable.Drawable r4 = (android.graphics.drawable.Drawable) r4     // Catch: java.lang.IllegalAccessException -> L34
            return r4
        L34:
            r4 = move-exception
            java.lang.String r0 = "Failed to get button drawable via reflection"
            com.bytedance.sdk.component.utils.vl.j(r1, r0, r4)
            com.bytedance.adsdk.ugeno.m.up.j = r2
        L3c:
            return r2
    }
}
