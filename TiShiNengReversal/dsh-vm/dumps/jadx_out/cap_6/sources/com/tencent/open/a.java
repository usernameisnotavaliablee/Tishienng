package com.tencent.open;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a {


    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(android.app.Dialog r3, android.os.Handler r4) {
            if (r3 == 0) goto L23
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L23
            if (r4 != 0) goto Lb
            goto L23
        Lb:
            android.content.Context r0 = r3.getContext()
            java.lang.String r1 = "网页加载异常，请自行下载并安装QQ后，再重新登录。"
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
            r0.show()
            com.tencent.open.a$1 r0 = new com.tencent.open.a$1
            r0.<init>(r3)
            r1 = 100
            r4.postDelayed(r0, r1)
        L23:
            return
    }

    public static void a(android.view.Window r3) {
            if (r3 != 0) goto L3
            goto L27
        L3:
            r0 = 1024(0x400, float:1.435E-42)
            r3.setFlags(r0, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            android.view.View r1 = r3.getDecorView()
            r2 = 1280(0x500, float:1.794E-42)
            r1.setSystemUiVisibility(r2)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r3.addFlags(r1)
            r1 = 28
            if (r0 < r1) goto L27
            android.view.WindowManager$LayoutParams r0 = r3.getAttributes()
            r1 = 1
            com.huawei.hms.hmsscankit.h.a(r0, r1)
            r3.setAttributes(r0)
        L27:
            return
    }
}
