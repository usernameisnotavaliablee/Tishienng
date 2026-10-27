package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class k4 {
    public static com.acse.ottn.k4 a;

    public k4() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.acse.ottn.k4 a() {
            com.acse.ottn.k4 r0 = com.acse.ottn.k4.a
            if (r0 != 0) goto L19
            java.lang.Class<com.acse.ottn.k4> r0 = com.acse.ottn.k4.class
            monitor-enter(r0)
            com.acse.ottn.k4 r1 = com.acse.ottn.k4.a     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.acse.ottn.k4 r1 = new com.acse.ottn.k4     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.acse.ottn.k4.a = r1     // Catch: java.lang.Throwable -> L13
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
            com.acse.ottn.k4 r0 = com.acse.ottn.k4.a
            return r0
    }

    public void a(android.app.Activity r3) {
            r2 = this;
            android.view.View r0 = r3.getCurrentFocus()
            if (r0 == 0) goto L16
            java.lang.String r1 = "input_method"
            java.lang.Object r3 = r3.getSystemService(r1)
            android.view.inputmethod.InputMethodManager r3 = (android.view.inputmethod.InputMethodManager) r3
            android.os.IBinder r0 = r0.getWindowToken()
            r1 = 2
            r3.hideSoftInputFromWindow(r0, r1)
        L16:
            return
    }

    public void a(android.content.Context r3, java.util.List<android.view.View> r4) {
            r2 = this;
            if (r4 != 0) goto L3
            goto L24
        L3:
            java.lang.String r0 = "input_method"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.view.inputmethod.InputMethodManager r3 = (android.view.inputmethod.InputMethodManager) r3
            java.util.Iterator r4 = r4.iterator()
        Lf:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L24
            java.lang.Object r0 = r4.next()
            android.view.View r0 = (android.view.View) r0
            android.os.IBinder r0 = r0.getWindowToken()
            r1 = 2
            r3.hideSoftInputFromWindow(r0, r1)
            goto Lf
        L24:
            return
    }

    public java.lang.String b() {
            r3 = this;
            java.lang.String r0 = ""
            android.content.Context r1 = com.acse.ottn.util.HelpShopAppUtil.getContext()     // Catch: java.lang.Exception -> L21
            java.lang.String r2 = "clipboard"
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch: java.lang.Exception -> L21
            android.content.ClipboardManager r1 = (android.content.ClipboardManager) r1     // Catch: java.lang.Exception -> L21
            java.lang.CharSequence r2 = r1.getText()     // Catch: java.lang.Exception -> L21
            if (r2 == 0) goto L23
            java.lang.CharSequence r1 = r1.getText()     // Catch: java.lang.Exception -> L21
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L21
            java.lang.String r0 = r1.trim()     // Catch: java.lang.Exception -> L21
            return r0
        L21:
            r1 = move-exception
            goto L24
        L23:
            return r0
        L24:
            java.lang.String r1 = r1.getMessage()
            java.lang.String r2 = "SoftKeyboardUtil"
            com.acse.ottn.h2.a(r2, r1)
            return r0
    }
}
