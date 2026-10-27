package net.sourceforge.pinyin4j;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class g {
    g() {
            r0 = this;
            r0.<init>()
            return
    }

    static java.lang.String a(java.lang.String r3, net.sourceforge.pinyin4j.h r4, net.sourceforge.pinyin4j.h r5) {
            java.lang.String r0 = net.sourceforge.pinyin4j.j.a(r3)
            java.lang.String r3 = net.sourceforge.pinyin4j.j.b(r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: com.hp.hpl.sparta.ParseException -> L66
            r1.<init>()     // Catch: com.hp.hpl.sparta.ParseException -> L66
            java.lang.String r2 = "//"
            r1.append(r2)     // Catch: com.hp.hpl.sparta.ParseException -> L66
            java.lang.String r4 = r4.a()     // Catch: com.hp.hpl.sparta.ParseException -> L66
            r1.append(r4)     // Catch: com.hp.hpl.sparta.ParseException -> L66
            java.lang.String r4 = "[text()='"
            r1.append(r4)     // Catch: com.hp.hpl.sparta.ParseException -> L66
            r1.append(r0)     // Catch: com.hp.hpl.sparta.ParseException -> L66
            java.lang.String r4 = "']"
            r1.append(r4)     // Catch: com.hp.hpl.sparta.ParseException -> L66
            java.lang.String r4 = r1.toString()     // Catch: com.hp.hpl.sparta.ParseException -> L66
            net.sourceforge.pinyin4j.f r0 = net.sourceforge.pinyin4j.f.a()     // Catch: com.hp.hpl.sparta.ParseException -> L66
            com.hp.hpl.sparta.e r0 = r0.b()     // Catch: com.hp.hpl.sparta.ParseException -> L66
            com.hp.hpl.sparta.g r4 = r0.s(r4)     // Catch: com.hp.hpl.sparta.ParseException -> L66
            if (r4 == 0) goto L66
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: com.hp.hpl.sparta.ParseException -> L66
            r0.<init>()     // Catch: com.hp.hpl.sparta.ParseException -> L66
            java.lang.String r1 = "../"
            r0.append(r1)     // Catch: com.hp.hpl.sparta.ParseException -> L66
            java.lang.String r5 = r5.a()     // Catch: com.hp.hpl.sparta.ParseException -> L66
            r0.append(r5)     // Catch: com.hp.hpl.sparta.ParseException -> L66
            java.lang.String r5 = "/text()"
            r0.append(r5)     // Catch: com.hp.hpl.sparta.ParseException -> L66
            java.lang.String r5 = r0.toString()     // Catch: com.hp.hpl.sparta.ParseException -> L66
            java.lang.String r4 = r4.u(r5)     // Catch: com.hp.hpl.sparta.ParseException -> L66
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: com.hp.hpl.sparta.ParseException -> L66
            r5.<init>()     // Catch: com.hp.hpl.sparta.ParseException -> L66
            r5.append(r4)     // Catch: com.hp.hpl.sparta.ParseException -> L66
            r5.append(r3)     // Catch: com.hp.hpl.sparta.ParseException -> L66
            java.lang.String r3 = r5.toString()     // Catch: com.hp.hpl.sparta.ParseException -> L66
            return r3
        L66:
            r3 = 0
            return r3
    }
}
