package com.bxkj.base.v2.h5;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class j {
    public j() {
            r1 = this;
            r1.<init>()
            return
    }

    public static final /* synthetic */ void a(android.webkit.WebView r0) {
            b(r0)
            return
    }

    private static final void b(android.webkit.WebView r9) {
            com.bxkj.base.v2.data.b$a r0 = com.bxkj.base.v2.data.b.d
            com.bxkj.base.v2.data.b r1 = r0.a()
            java.lang.String r1 = r1.J()
            com.bxkj.base.v2.data.b r2 = r0.a()
            java.lang.String r2 = r2.g()
            com.bxkj.base.v2.data.b r3 = r0.a()
            java.lang.String r3 = r3.R()
            com.bxkj.base.v2.data.b r4 = r0.a()
            java.lang.String r4 = r4.S()
            com.bxkj.base.v2.data.b r0 = r0.a()
            java.lang.String r0 = r0.m()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "window.localStorage.setItem('uniIdToken','"
            r5.append(r6)
            r5.append(r2)
            java.lang.String r6 = "');window.localStorage.setItem('userid','"
            r5.append(r6)
            r5.append(r3)
            java.lang.String r6 = "');window.localStorage.setItem('school','"
            r5.append(r6)
            r5.append(r1)
            java.lang.String r6 = "');window.localStorage.setItem('username','"
            r5.append(r6)
            r5.append(r4)
            java.lang.String r6 = "');window.localStorage.setItem('login_type','"
            r5.append(r6)
            java.lang.String r6 = "online"
            r5.append(r6)
            java.lang.String r7 = "');window.localStorage.setItem('category','"
            r5.append(r7)
            r5.append(r0)
            java.lang.String r7 = "');"
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "javascript:(function({ var localStorage = window.localStorage;localStorage.setItem('uniIdToken','"
            r7.append(r8)
            r7.append(r2)
            java.lang.String r2 = "');localStorage.setItem('userid','"
            r7.append(r2)
            r7.append(r3)
            java.lang.String r2 = "');localStorage.setItem('school','"
            r7.append(r2)
            r7.append(r1)
            java.lang.String r1 = "');localStorage.setItem('username','"
            r7.append(r1)
            r7.append(r4)
            java.lang.String r1 = "');localStorage.setItem('login_type','"
            r7.append(r1)
            r7.append(r6)
            java.lang.String r1 = "');localStorage.setItem('category','"
            r7.append(r1)
            r7.append(r0)
            java.lang.String r0 = "'); })()"
            r7.append(r0)
            if (r9 == 0) goto Laa
            r0 = 0
            r9.evaluateJavascript(r5, r0)
        Laa:
            return
    }
}
