package com.bxkj.base.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class m {
    public m() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(android.widget.TextView r2, java.lang.String r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Lf
            r0 = 0
            android.text.Spanned r3 = com.bxkj.base.util.l.a(r3, r0)
            r2.setText(r3)
            return
        Lf:
            android.text.Spanned r3 = android.text.Html.fromHtml(r3)
            r2.setText(r3)
            return
    }
}
