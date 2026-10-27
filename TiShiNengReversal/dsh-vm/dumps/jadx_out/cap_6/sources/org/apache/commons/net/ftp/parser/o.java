package org.apache.commons.net.ftp.parser;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class o extends org.apache.commons.net.ftp.g {
    private java.util.regex.Pattern c;
    private java.util.regex.MatchResult d;
    protected java.util.regex.Matcher e;

    public o(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.c = r0
            r1.d = r0
            r1.e = r0
            r0 = 0
            r1.e(r2, r0)
            return
    }

    public o(java.lang.String r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.c = r0
            r1.d = r0
            r1.e = r0
            r1.e(r2, r3)
            return
    }

    private void e(java.lang.String r3, int r4) {
            r2 = this;
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r3, r4)     // Catch: java.util.regex.PatternSyntaxException -> L7
            r2.c = r4     // Catch: java.util.regex.PatternSyntaxException -> L7
            return
        L7:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unparseable regex supplied: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    public int f() {
            r1 = this;
            java.util.regex.MatchResult r0 = r1.d
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.groupCount()
            return r0
    }

    public java.lang.String g() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 1
        L6:
            java.util.regex.MatchResult r2 = r3.d
            int r2 = r2.groupCount()
            if (r1 > r2) goto L2b
            r0.append(r1)
            java.lang.String r2 = ") "
            r0.append(r2)
            java.util.regex.MatchResult r2 = r3.d
            java.lang.String r2 = r2.group(r1)
            r0.append(r2)
            java.lang.String r2 = "line.separator"
            java.lang.String r2 = java.lang.System.getProperty(r2)
            r0.append(r2)
            int r1 = r1 + 1
            goto L6
        L2b:
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String h(int r2) {
            r1 = this;
            java.util.regex.MatchResult r0 = r1.d
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            java.lang.String r2 = r0.group(r2)
            return r2
    }

    public boolean i(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.d = r0
            java.util.regex.Pattern r0 = r1.c
            java.util.regex.Matcher r2 = r0.matcher(r2)
            r1.e = r2
            boolean r2 = r2.matches()
            if (r2 == 0) goto L19
            java.util.regex.Matcher r2 = r1.e
            java.util.regex.MatchResult r2 = r2.toMatchResult()
            r1.d = r2
        L19:
            java.util.regex.MatchResult r2 = r1.d
            if (r2 == 0) goto L1f
            r2 = 1
            return r2
        L1f:
            r2 = 0
            return r2
    }

    public boolean j(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.e(r2, r0)
            r2 = 1
            return r2
    }

    public boolean k(java.lang.String r1, int r2) {
            r0 = this;
            r0.e(r1, r2)
            r1 = 1
            return r1
    }
}
