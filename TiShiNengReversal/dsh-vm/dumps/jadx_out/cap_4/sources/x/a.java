package x;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class a {
    public static java.lang.StringBuffer a;

    static {
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            x.a.a = r0
            return
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(java.lang.String r5) {
            java.lang.StringBuffer r0 = x.a.a
            r1 = 0
            r0.setLength(r1)
            char[] r5 = r5.toCharArray()
            net.sourceforge.pinyin4j.format.b r0 = new net.sourceforge.pinyin4j.format.b
            r0.<init>()
            net.sourceforge.pinyin4j.format.a r2 = net.sourceforge.pinyin4j.format.a.c
            r0.e(r2)
            net.sourceforge.pinyin4j.format.c r2 = net.sourceforge.pinyin4j.format.c.c
            r0.f(r2)
            r2 = 0
        L1a:
            int r3 = r5.length
            if (r2 >= r3) goto L37
            char r3 = r5[r2]
            r4 = 128(0x80, float:1.8E-43)
            if (r3 <= r4) goto L2f
            java.lang.StringBuffer r4 = x.a.a     // Catch: java.lang.Exception -> L34
            java.lang.String[] r3 = net.sourceforge.pinyin4j.e.h(r3, r0)     // Catch: java.lang.Exception -> L34
            r3 = r3[r1]     // Catch: java.lang.Exception -> L34
            r4.append(r3)     // Catch: java.lang.Exception -> L34
            goto L34
        L2f:
            java.lang.StringBuffer r4 = x.a.a
            r4.append(r3)
        L34:
            int r2 = r2 + 1
            goto L1a
        L37:
            java.lang.StringBuffer r5 = x.a.a
            java.lang.String r5 = r5.toString()
            return r5
    }

    public static java.lang.String b(java.lang.String r2) {
            java.lang.StringBuffer r0 = x.a.a
            r1 = 0
            r0.setLength(r1)
            char r2 = r2.charAt(r1)
            java.lang.String[] r0 = net.sourceforge.pinyin4j.e.g(r2)
            if (r0 == 0) goto L1c
            java.lang.StringBuffer r2 = x.a.a
            r0 = r0[r1]
            char r0 = r0.charAt(r1)
            r2.append(r0)
            goto L21
        L1c:
            java.lang.StringBuffer r0 = x.a.a
            r0.append(r2)
        L21:
            java.lang.StringBuffer r2 = x.a.a
            java.lang.String r2 = r2.toString()
            return r2
    }

    public static java.lang.String c(java.lang.String r5) {
            java.lang.StringBuffer r0 = x.a.a
            r1 = 0
            r0.setLength(r1)
            char[] r5 = r5.toCharArray()
            net.sourceforge.pinyin4j.format.b r0 = new net.sourceforge.pinyin4j.format.b
            r0.<init>()
            net.sourceforge.pinyin4j.format.a r2 = net.sourceforge.pinyin4j.format.a.c
            r0.e(r2)
            net.sourceforge.pinyin4j.format.c r2 = net.sourceforge.pinyin4j.format.c.c
            r0.f(r2)
            r2 = 0
        L1a:
            int r3 = r5.length
            if (r2 >= r3) goto L3b
            char r3 = r5[r2]
            r4 = 128(0x80, float:1.8E-43)
            if (r3 <= r4) goto L33
            java.lang.StringBuffer r4 = x.a.a     // Catch: java.lang.Exception -> L38
            java.lang.String[] r3 = net.sourceforge.pinyin4j.e.h(r3, r0)     // Catch: java.lang.Exception -> L38
            r3 = r3[r1]     // Catch: java.lang.Exception -> L38
            char r3 = r3.charAt(r1)     // Catch: java.lang.Exception -> L38
            r4.append(r3)     // Catch: java.lang.Exception -> L38
            goto L38
        L33:
            java.lang.StringBuffer r4 = x.a.a
            r4.append(r3)
        L38:
            int r2 = r2 + 1
            goto L1a
        L3b:
            java.lang.StringBuffer r5 = x.a.a
            java.lang.String r5 = r5.toString()
            return r5
    }
}
