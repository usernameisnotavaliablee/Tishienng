package cn.bluemobi.dylan.base.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class f {
    public f() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(java.lang.String r8) {
            java.lang.String r0 = "\\\\u"
            java.lang.String[] r0 = r8.split(r0)
            r1 = 0
            r2 = r0[r1]
            r3 = 1
        La:
            int r4 = r0.length     // Catch: java.lang.NumberFormatException -> L4d
            if (r3 >= r4) goto L4c
            r4 = r0[r3]     // Catch: java.lang.NumberFormatException -> L4d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L4d
            r5.<init>()     // Catch: java.lang.NumberFormatException -> L4d
            r5.append(r2)     // Catch: java.lang.NumberFormatException -> L4d
            r2 = 4
            java.lang.String r6 = r4.substring(r1, r2)     // Catch: java.lang.NumberFormatException -> L4d
            r7 = 16
            int r6 = java.lang.Integer.parseInt(r6, r7)     // Catch: java.lang.NumberFormatException -> L4d
            char r6 = (char) r6     // Catch: java.lang.NumberFormatException -> L4d
            r5.append(r6)     // Catch: java.lang.NumberFormatException -> L4d
            java.lang.String r5 = r5.toString()     // Catch: java.lang.NumberFormatException -> L4d
            int r6 = r4.length()     // Catch: java.lang.NumberFormatException -> L4d
            if (r6 <= r2) goto L48
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L4d
            r6.<init>()     // Catch: java.lang.NumberFormatException -> L4d
            r6.append(r5)     // Catch: java.lang.NumberFormatException -> L4d
            int r5 = r4.length()     // Catch: java.lang.NumberFormatException -> L4d
            java.lang.String r2 = r4.substring(r2, r5)     // Catch: java.lang.NumberFormatException -> L4d
            r6.append(r2)     // Catch: java.lang.NumberFormatException -> L4d
            java.lang.String r2 = r6.toString()     // Catch: java.lang.NumberFormatException -> L4d
            goto L49
        L48:
            r2 = r5
        L49:
            int r3 = r3 + 1
            goto La
        L4c:
            return r2
        L4d:
            return r8
    }

    public static java.lang.String b(java.lang.String r8) {
            int r0 = r8.length()
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>(r0)
            r2 = 0
            r3 = 0
        Lb:
            if (r3 >= r0) goto L7f
            int r4 = r3 + 1
            char r5 = r8.charAt(r3)
            r6 = 92
            if (r5 != r6) goto L7a
            int r3 = r3 + 2
            char r4 = r8.charAt(r4)
            r5 = 117(0x75, float:1.64E-43)
            r6 = 10
            if (r4 != r5) goto L5b
            r4 = 0
            r5 = 0
        L25:
            r7 = 4
            if (r4 >= r7) goto L56
            int r7 = r3 + 1
            char r3 = r8.charAt(r3)
            switch(r3) {
                case 48: goto L4d;
                case 49: goto L4d;
                case 50: goto L4d;
                case 51: goto L4d;
                case 52: goto L4d;
                case 53: goto L4d;
                case 54: goto L4d;
                case 55: goto L4d;
                case 56: goto L4d;
                case 57: goto L4d;
                default: goto L31;
            }
        L31:
            switch(r3) {
                case 65: goto L46;
                case 66: goto L46;
                case 67: goto L46;
                case 68: goto L46;
                case 69: goto L46;
                case 70: goto L46;
                default: goto L34;
            }
        L34:
            switch(r3) {
                case 97: goto L3f;
                case 98: goto L3f;
                case 99: goto L3f;
                case 100: goto L3f;
                case 101: goto L3f;
                case 102: goto L3f;
                default: goto L37;
            }
        L37:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Malformed   \\uxxxx   encoding."
            r8.<init>(r0)
            throw r8
        L3f:
            int r5 = r5 << 4
            int r5 = r5 + r6
            int r5 = r5 + r3
            int r5 = r5 + (-97)
            goto L52
        L46:
            int r5 = r5 << 4
            int r5 = r5 + r6
            int r5 = r5 + r3
            int r5 = r5 + (-65)
            goto L52
        L4d:
            int r5 = r5 << 4
            int r5 = r5 + r3
            int r5 = r5 + (-48)
        L52:
            int r4 = r4 + 1
            r3 = r7
            goto L25
        L56:
            char r4 = (char) r5
            r1.append(r4)
            goto Lb
        L5b:
            r5 = 116(0x74, float:1.63E-43)
            if (r4 != r5) goto L62
            r4 = 9
            goto L76
        L62:
            r5 = 114(0x72, float:1.6E-43)
            if (r4 != r5) goto L69
            r4 = 13
            goto L76
        L69:
            r5 = 110(0x6e, float:1.54E-43)
            if (r4 != r5) goto L70
            r4 = 10
            goto L76
        L70:
            r5 = 102(0x66, float:1.43E-43)
            if (r4 != r5) goto L76
            r4 = 12
        L76:
            r1.append(r4)
            goto Lb
        L7a:
            r1.append(r5)
            r3 = r4
            goto Lb
        L7f:
            java.lang.String r8 = r1.toString()
            return r8
    }
}
