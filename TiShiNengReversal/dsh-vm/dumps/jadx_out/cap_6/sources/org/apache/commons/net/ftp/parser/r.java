package org.apache.commons.net.ftp.parser;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class r extends org.apache.commons.net.ftp.parser.q {
    private static final java.lang.String j = "(.*?);([0-9]+)\\s*.*";
    private final java.util.regex.Pattern i;

    public r() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public r(org.apache.commons.net.ftp.d r2) {
            r1 = this;
            r1.<init>()
            r1.c(r2)
            java.lang.String r2 = "(.*?);([0-9]+)\\s*.*"
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)     // Catch: java.util.regex.PatternSyntaxException -> Lf
            r1.i = r2     // Catch: java.util.regex.PatternSyntaxException -> Lf
            return
        Lf:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unparseable regex supplied:  (.*?);([0-9]+)\\s*.*"
            r2.<init>(r0)
            throw r2
    }

    @Override // org.apache.commons.net.ftp.g, org.apache.commons.net.ftp.f
    public java.util.List<java.lang.String> d(java.util.List<java.lang.String> r7) {
            r6 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.ListIterator r1 = r7.listIterator()
        L9:
            boolean r2 = r1.hasNext()
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L51
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.trim()
            java.util.regex.Pattern r5 = r6.i
            java.util.regex.Matcher r2 = r5.matcher(r2)
            boolean r5 = r2.matches()
            if (r5 == 0) goto L9
            java.util.regex.MatchResult r2 = r2.toMatchResult()
            java.lang.String r4 = r2.group(r4)
            java.lang.String r2 = r2.group(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r3 = r0.get(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L4d
            int r5 = r2.intValue()
            int r3 = r3.intValue()
            if (r5 >= r3) goto L4d
            r1.remove()
            goto L9
        L4d:
            r0.put(r4, r2)
            goto L9
        L51:
            boolean r2 = r1.hasPrevious()
            if (r2 == 0) goto L93
            java.lang.Object r2 = r1.previous()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.trim()
            java.util.regex.Pattern r5 = r6.i
            java.util.regex.Matcher r2 = r5.matcher(r2)
            boolean r5 = r2.matches()
            if (r5 == 0) goto L51
            java.util.regex.MatchResult r2 = r2.toMatchResult()
            java.lang.String r5 = r2.group(r4)
            java.lang.String r2 = r2.group(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r5 = r0.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L51
            int r2 = r2.intValue()
            int r5 = r5.intValue()
            if (r2 >= r5) goto L51
            r1.remove()
            goto L51
        L93:
            return r7
    }

    @Override // org.apache.commons.net.ftp.parser.q
    protected boolean n() {
            r1 = this;
            r0 = 1
            return r0
    }
}
