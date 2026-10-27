package net.sourceforge.pinyin4j;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class d {
    d() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String a(java.lang.String r12) {
            java.lang.String r12 = r12.toLowerCase()
            java.lang.String r0 = "[a-z]*[1-5]?"
            boolean r0 = r12.matches(r0)
            if (r0 == 0) goto Lb5
            java.lang.String r0 = "[a-z]*[1-5]"
            boolean r0 = r12.matches(r0)
            java.lang.String r1 = "ü"
            java.lang.String r2 = "v"
            if (r0 == 0) goto Lb1
            int r0 = r12.length()
            int r0 = r0 + (-1)
            char r0 = r12.charAt(r0)
            int r0 = java.lang.Character.getNumericValue(r0)
            r3 = 97
            int r4 = r12.indexOf(r3)
            r5 = 101(0x65, float:1.42E-43)
            int r6 = r12.indexOf(r5)
            java.lang.String r7 = "ou"
            int r8 = r12.indexOf(r7)
            r9 = 0
            r10 = 36
            r11 = -1
            if (r11 == r4) goto L3f
            goto L71
        L3f:
            if (r11 == r6) goto L45
            r4 = r6
            r3 = 101(0x65, float:1.42E-43)
            goto L71
        L45:
            if (r11 == r8) goto L4d
            char r3 = r7.charAt(r9)
            r4 = r8
            goto L71
        L4d:
            int r3 = r12.length()
            int r3 = r3 + (-1)
            r4 = r3
        L54:
            if (r4 < 0) goto L6e
            char r3 = r12.charAt(r4)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r5 = "[aeiouv]"
            boolean r3 = r3.matches(r5)
            if (r3 == 0) goto L6b
            char r3 = r12.charAt(r4)
            goto L71
        L6b:
            int r4 = r4 + (-1)
            goto L54
        L6e:
            r3 = 36
            r4 = -1
        L71:
            if (r10 == r3) goto Lb5
            if (r11 == r4) goto Lb5
            java.lang.String r5 = "aeiouv"
            int r3 = r5.indexOf(r3)
            int r0 = r0 + (-1)
            int r3 = r3 * 5
            int r3 = r3 + r0
            java.lang.String r0 = "āáăàaēéĕèeīíĭìiōóŏòoūúŭùuǖǘǚǜü"
            char r0 = r0.charAt(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = r12.substring(r9, r4)
            java.lang.String r5 = r5.replaceAll(r2, r1)
            r3.append(r5)
            r3.append(r0)
            int r4 = r4 + 1
            int r0 = r12.length()
            int r0 = r0 + (-1)
            java.lang.String r12 = r12.substring(r4, r0)
            java.lang.String r12 = r12.replaceAll(r2, r1)
            r3.append(r12)
            java.lang.String r12 = r3.toString()
            return r12
        Lb1:
            java.lang.String r12 = r12.replaceAll(r2, r1)
        Lb5:
            return r12
    }

    static java.lang.String b(java.lang.String r5, net.sourceforge.pinyin4j.format.b r6) throws net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination {
            net.sourceforge.pinyin4j.format.c r0 = net.sourceforge.pinyin4j.format.c.d
            net.sourceforge.pinyin4j.format.c r1 = r6.b()
            if (r0 != r1) goto L21
            net.sourceforge.pinyin4j.format.d r1 = net.sourceforge.pinyin4j.format.d.c
            net.sourceforge.pinyin4j.format.d r2 = r6.c()
            if (r1 == r2) goto L19
            net.sourceforge.pinyin4j.format.d r1 = net.sourceforge.pinyin4j.format.d.b
            net.sourceforge.pinyin4j.format.d r2 = r6.c()
            if (r1 == r2) goto L19
            goto L21
        L19:
            net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination r5 = new net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination
            java.lang.String r6 = "tone marks cannot be added to v or u:"
            r5.<init>(r6)
            throw r5
        L21:
            net.sourceforge.pinyin4j.format.c r1 = net.sourceforge.pinyin4j.format.c.c
            net.sourceforge.pinyin4j.format.c r2 = r6.b()
            java.lang.String r3 = "v"
            java.lang.String r4 = "u:"
            if (r1 != r2) goto L36
            java.lang.String r0 = "[1-5]"
            java.lang.String r1 = ""
            java.lang.String r5 = r5.replaceAll(r0, r1)
            goto L44
        L36:
            net.sourceforge.pinyin4j.format.c r1 = r6.b()
            if (r0 != r1) goto L44
            java.lang.String r5 = r5.replaceAll(r4, r3)
            java.lang.String r5 = a(r5)
        L44:
            net.sourceforge.pinyin4j.format.d r0 = net.sourceforge.pinyin4j.format.d.c
            net.sourceforge.pinyin4j.format.d r1 = r6.c()
            if (r0 != r1) goto L51
            java.lang.String r5 = r5.replaceAll(r4, r3)
            goto L5f
        L51:
            net.sourceforge.pinyin4j.format.d r0 = net.sourceforge.pinyin4j.format.d.d
            net.sourceforge.pinyin4j.format.d r1 = r6.c()
            if (r0 != r1) goto L5f
            java.lang.String r0 = "ü"
            java.lang.String r5 = r5.replaceAll(r4, r0)
        L5f:
            net.sourceforge.pinyin4j.format.a r0 = net.sourceforge.pinyin4j.format.a.b
            net.sourceforge.pinyin4j.format.a r6 = r6.a()
            if (r0 != r6) goto L6b
            java.lang.String r5 = r5.toUpperCase()
        L6b:
            return r5
    }
}
