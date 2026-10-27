package net.sourceforge.pinyin4j;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class c {
    private static java.lang.String[] a;

    static {
            java.lang.String r0 = "_IV"
            java.lang.String r1 = "_V"
            java.lang.String r2 = "_I"
            java.lang.String r3 = "_II"
            java.lang.String r4 = "_III"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r0, r1}
            net.sourceforge.pinyin4j.c.a = r0
            return
    }

    c() {
            r0 = this;
            r0.<init>()
            return
    }

    static java.lang.String a(java.lang.String r3) {
            java.lang.String r0 = net.sourceforge.pinyin4j.j.a(r3)
            java.lang.String r3 = net.sourceforge.pinyin4j.j.b(r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: com.hp.hpl.sparta.ParseException -> L68
            r1.<init>()     // Catch: com.hp.hpl.sparta.ParseException -> L68
            java.lang.String r2 = "//"
            r1.append(r2)     // Catch: com.hp.hpl.sparta.ParseException -> L68
            net.sourceforge.pinyin4j.h r2 = net.sourceforge.pinyin4j.h.b     // Catch: com.hp.hpl.sparta.ParseException -> L68
            java.lang.String r2 = r2.a()     // Catch: com.hp.hpl.sparta.ParseException -> L68
            r1.append(r2)     // Catch: com.hp.hpl.sparta.ParseException -> L68
            java.lang.String r2 = "[text()='"
            r1.append(r2)     // Catch: com.hp.hpl.sparta.ParseException -> L68
            r1.append(r0)     // Catch: com.hp.hpl.sparta.ParseException -> L68
            java.lang.String r0 = "']"
            r1.append(r0)     // Catch: com.hp.hpl.sparta.ParseException -> L68
            java.lang.String r0 = r1.toString()     // Catch: com.hp.hpl.sparta.ParseException -> L68
            net.sourceforge.pinyin4j.b r1 = net.sourceforge.pinyin4j.b.a()     // Catch: com.hp.hpl.sparta.ParseException -> L68
            com.hp.hpl.sparta.e r1 = r1.b()     // Catch: com.hp.hpl.sparta.ParseException -> L68
            com.hp.hpl.sparta.g r0 = r1.s(r0)     // Catch: com.hp.hpl.sparta.ParseException -> L68
            if (r0 == 0) goto L68
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: com.hp.hpl.sparta.ParseException -> L68
            r1.<init>()     // Catch: com.hp.hpl.sparta.ParseException -> L68
            java.lang.String r2 = "../"
            r1.append(r2)     // Catch: com.hp.hpl.sparta.ParseException -> L68
            net.sourceforge.pinyin4j.h r2 = net.sourceforge.pinyin4j.h.g     // Catch: com.hp.hpl.sparta.ParseException -> L68
            java.lang.String r2 = r2.a()     // Catch: com.hp.hpl.sparta.ParseException -> L68
            r1.append(r2)     // Catch: com.hp.hpl.sparta.ParseException -> L68
            java.lang.String[] r2 = net.sourceforge.pinyin4j.c.a     // Catch: com.hp.hpl.sparta.ParseException -> L68
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: com.hp.hpl.sparta.ParseException -> L68
            int r3 = r3 + (-1)
            r3 = r2[r3]     // Catch: com.hp.hpl.sparta.ParseException -> L68
            r1.append(r3)     // Catch: com.hp.hpl.sparta.ParseException -> L68
            java.lang.String r3 = "/text()"
            r1.append(r3)     // Catch: com.hp.hpl.sparta.ParseException -> L68
            java.lang.String r3 = r1.toString()     // Catch: com.hp.hpl.sparta.ParseException -> L68
            java.lang.String r3 = r0.u(r3)     // Catch: com.hp.hpl.sparta.ParseException -> L68
            return r3
        L68:
            r3 = 0
            return r3
    }
}
