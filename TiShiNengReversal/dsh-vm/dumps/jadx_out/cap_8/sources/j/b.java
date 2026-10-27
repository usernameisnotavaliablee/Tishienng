package j;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b {
    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean a(java.lang.String r6, java.lang.String r7) {
            j.a r0 = new j.a
            java.lang.String r1 = "dylanandroid2dev"
            java.lang.String r2 = "dylanandroid2dev@163.com"
            r0.<init>(r2, r1)
            java.lang.String r1 = "smtp.163.com"
            r0.v(r1)
            java.lang.String r1 = "25"
            r0.y(r1)
            r1 = 1
            r0.t(r1)
            java.lang.String[] r3 = cn.bluemobi.dylan.uncaughtexception.a.E()
            r4 = 0
            if (r3 == 0) goto L51
            int r5 = r3.length
            if (r5 > 0) goto L22
            goto L51
        L22:
            r0.B(r3)
            r0.u(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "【"
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = "】异常崩溃"
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r0.A(r6)
            java.lang.String r6 = r7.toString()
            r0.q(r6)
            boolean r6 = r0.p()     // Catch: java.lang.Exception -> L51
            if (r6 == 0) goto L51
            return r1
        L51:
            return r4
    }
}
