package org.apache.commons.net.ftp.parser;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class d extends org.apache.commons.net.ftp.parser.o {
    private static final java.lang.String f = "(Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec)";
    private static final java.lang.String g = "(([\\-]|[A-Z])([\\-]|[A-Z])([\\-]|[A-Z])([\\-]|[A-Z])([\\-]|[A-Z])([\\-]|[A-Z])([\\-]|[A-Z])([\\-]|[A-Z])([\\-]|[A-Z])([\\-]|[A-Z]))(\\S*)\\s*(\\S+)\\s*(\\S*)\\s*(\\d*)\\s*(\\d*)\\s*(Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec)\\s*((?:[012]\\d*)|(?:3[01]))\\s*((\\d\\d\\d\\d)|((?:[01]\\d)|(?:2[0123])):([012345]\\d))\\s(\\S*)(\\s*.*)";

    public d() {
            r1 = this;
            java.lang.String r0 = "(([\\-]|[A-Z])([\\-]|[A-Z])([\\-]|[A-Z])([\\-]|[A-Z])([\\-]|[A-Z])([\\-]|[A-Z])([\\-]|[A-Z])([\\-]|[A-Z])([\\-]|[A-Z])([\\-]|[A-Z]))(\\S*)\\s*(\\S+)\\s*(\\S*)\\s*(\\d*)\\s*(\\d*)\\s*(Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec)\\s*((?:[012]\\d*)|(?:3[01]))\\s*((\\d\\d\\d\\d)|((?:[01]\\d)|(?:2[0123])):([012345]\\d))\\s(\\S*)(\\s*.*)"
            r1.<init>(r0)
            return
    }

    @Override // org.apache.commons.net.ftp.f
    public org.apache.commons.net.ftp.FTPFile a(java.lang.String r14) {
            r13 = this;
            org.apache.commons.net.ftp.FTPFile r0 = new org.apache.commons.net.ftp.FTPFile
            r0.<init>()
            r0.setRawListing(r14)
            boolean r14 = r13.i(r14)
            if (r14 == 0) goto Lb5
            r14 = 14
            java.lang.String r1 = r13.h(r14)
            r2 = 15
            java.lang.String r2 = r13.h(r2)
            r3 = 16
            java.lang.String r3 = r13.h(r3)
            r4 = 17
            java.lang.String r4 = r13.h(r4)
            r5 = 18
            java.lang.String r5 = r13.h(r5)
            r6 = 20
            java.lang.String r6 = r13.h(r6)
            r7 = 21
            java.lang.String r7 = r13.h(r7)
            r8 = 22
            java.lang.String r8 = r13.h(r8)
            r9 = 23
            java.lang.String r9 = r13.h(r9)
            r10 = 0
            r0.setType(r10)
            r0.setUser(r1)
            r0.setGroup(r2)
            long r1 = java.lang.Long.parseLong(r3)     // Catch: java.lang.NumberFormatException -> L56
            r0.setSize(r1)     // Catch: java.lang.NumberFormatException -> L56
            goto L57
        L56:
        L57:
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            r1.set(r14, r10)
            r14 = 13
            r1.set(r14, r10)
            r2 = 12
            r1.set(r2, r10)
            r3 = 11
            r1.set(r3, r10)
            java.lang.String r10 = "(Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec)"
            int r4 = r10.indexOf(r4)
            int r4 = r4 / 4
            r10 = 2
            r11 = 1
            if (r6 == 0) goto L83
            int r14 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.NumberFormatException -> Lb1
            r1.set(r11, r14)     // Catch: java.lang.NumberFormatException -> Lb1
            r14 = 11
            goto La0
        L83:
            int r6 = r1.get(r11)     // Catch: java.lang.NumberFormatException -> Lb1
            int r12 = r1.get(r10)     // Catch: java.lang.NumberFormatException -> Lb1
            if (r12 >= r4) goto L8f
            int r6 = r6 + (-1)
        L8f:
            r1.set(r11, r6)     // Catch: java.lang.NumberFormatException -> Lb1
            int r6 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.NumberFormatException -> Lb1
            r1.set(r3, r6)     // Catch: java.lang.NumberFormatException -> Lb1
            int r3 = java.lang.Integer.parseInt(r8)     // Catch: java.lang.NumberFormatException -> Lb1
            r1.set(r2, r3)     // Catch: java.lang.NumberFormatException -> Lb1
        La0:
            r1.set(r10, r4)     // Catch: java.lang.NumberFormatException -> Lb1
            int r2 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.NumberFormatException -> Lb1
            r3 = 5
            r1.set(r3, r2)     // Catch: java.lang.NumberFormatException -> Lb1
            r1.clear(r14)     // Catch: java.lang.NumberFormatException -> Lb1
            r0.setTimestamp(r1)     // Catch: java.lang.NumberFormatException -> Lb1
        Lb1:
            r0.setName(r9)
            return r0
        Lb5:
            r14 = 0
            return r14
    }
}
