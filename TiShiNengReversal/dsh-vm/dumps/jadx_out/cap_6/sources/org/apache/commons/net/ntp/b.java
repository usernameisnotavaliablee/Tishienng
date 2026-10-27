package org.apache.commons.net.ntp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class b {
    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(int r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r3 >>> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0.append(r1)
            java.lang.String r1 = "."
            r0.append(r1)
            int r2 = r3 >>> 16
            r2 = r2 & 255(0xff, float:3.57E-43)
            r0.append(r2)
            r0.append(r1)
            int r2 = r3 >>> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            r0.append(r2)
            r0.append(r1)
            r3 = r3 & 255(0xff, float:3.57E-43)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    public static java.lang.String b(int r0) {
            switch(r0) {
                case 0: goto L1b;
                case 1: goto L18;
                case 2: goto L15;
                case 3: goto L12;
                case 4: goto Lf;
                case 5: goto Lc;
                case 6: goto L9;
                case 7: goto L6;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = "Unknown"
            return r0
        L6:
            java.lang.String r0 = "Private"
            return r0
        L9:
            java.lang.String r0 = "Control"
            return r0
        Lc:
            java.lang.String r0 = "Broadcast"
            return r0
        Lf:
            java.lang.String r0 = "Server"
            return r0
        L12:
            java.lang.String r0 = "Client"
            return r0
        L15:
            java.lang.String r0 = "Symmetric Passive"
            return r0
        L18:
            java.lang.String r0 = "Symmetric Active"
            return r0
        L1b:
            java.lang.String r0 = "Reserved"
            return r0
    }

    public static java.lang.String c(org.apache.commons.net.ntp.d r0) {
            if (r0 != 0) goto L4
            r0 = 0
            goto L8
        L4:
            int r0 = r0.b()
        L8:
            java.lang.String r0 = a(r0)
            return r0
    }

    public static java.lang.String d(org.apache.commons.net.ntp.d r5) {
            java.lang.String r0 = ""
            if (r5 != 0) goto L5
            return r0
        L5:
            int r5 = r5.b()
            if (r5 != 0) goto Lc
            return r0
        Lc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 4
            r1.<init>(r2)
            r2 = 24
        L14:
            if (r2 < 0) goto L2b
            int r3 = r5 >>> r2
            r3 = r3 & 255(0xff, float:3.57E-43)
            char r3 = (char) r3
            if (r3 != 0) goto L1e
            goto L2b
        L1e:
            boolean r4 = java.lang.Character.isLetterOrDigit(r3)
            if (r4 != 0) goto L25
            return r0
        L25:
            r1.append(r3)
            int r2 = r2 + (-8)
            goto L14
        L2b:
            java.lang.String r5 = r1.toString()
            return r5
    }
}
